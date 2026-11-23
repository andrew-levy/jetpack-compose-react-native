import { spawnSync } from "node:child_process";
import { copyFileSync, mkdirSync, mkdtempSync, rmSync, writeFileSync } from "node:fs";
import { basename, join } from "node:path";
import { fileURLToPath } from "node:url";

const root = fileURLToPath(new URL("./", import.meta.url));
const gradle = process.env.COMPOSE_GRADLE ?? "gradle";
const args = process.argv.slice(2);
const gradleArgs = args.filter((arg) => arg.startsWith("-P"));
const check = args.includes("--check");
if (args.some((arg) => arg !== "--check" && !arg.startsWith("-P"))) {
  throw Error("Expected --check or Gradle project properties (-P...)");
}

function run(command, args, env = process.env, logPath) {
  const result = spawnSync(command, args, {
    cwd: root, env, encoding: "utf8", maxBuffer: 32 * 1024 * 1024,
    stdio: logPath ? ["inherit", "pipe", "pipe"] : "inherit",
  });
  if (logPath) {
    const log = (result.stdout ?? "") + (result.stderr ?? "");
    writeFileSync(logPath, log);
    process.stdout.write(log);
  }
  if (result.error) throw result.error;
  if (result.status !== 0) {
    throw Error(`${basename(command)} exited with ${result.status ?? result.signal}${logPath ? ` (see ${logPath})` : ""}`);
  }
}

const build = join(root, "build");
mkdirSync(build, { recursive: true });
const stage = mkdtempSync(join(build, "candidate-"));
const candidateDir = join(stage, "kotlin");
const env = {
  ...process.env,
  COMPOSE_API_MANIFEST: join(stage, "compose-api-manifest.json"),
  COMPOSE_BINARY_INVENTORY: join(stage, "compose-binary-inventory.json"),
};
let complete = false;
try {
  run(gradle, ["kspDebugKotlin", "composeBinaryInventory", ...gradleArgs]);
  copyFileSync(join(build, "generated/ksp/debug/resources/compose-api-manifest.json"), env.COMPOSE_API_MANIFEST);
  copyFileSync(join(build, "compose-binary-inventory.json"), env.COMPOSE_BINARY_INVENTORY);
  run(process.execPath, ["generate.mjs"], { ...env, COMPOSE_KOTLIN_CANDIDATES: candidateDir });
  run(gradle, [
    "compileDebugKotlin", "-x", "kspDebugKotlin", ...gradleArgs,
    // Each run has a new source directory and can resolve a different AndroidX classpath.
    "-Pkotlin.incremental=false", `-PcomposeCandidateDir=${candidateDir}`,
  ], process.env, join(stage, "kotlin-compile.log"));
  run(process.execPath, ["generate.mjs", ...(check ? ["--check"] : [])],
    { ...env, COMPOSE_APPROVED_KOTLIN: candidateDir });
  complete = true;
} finally {
  if (complete) rmSync(stage, { recursive: true });
  else console.error(`Generation stopped before promotion. Staged inputs and diagnostics: ${stage}`);
}
