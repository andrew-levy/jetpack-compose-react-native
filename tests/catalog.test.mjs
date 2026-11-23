import { readFileSync } from "fs";
import assert from "node:assert/strict";
import test from "node:test";

import { assembleSurface, buildCatalog, loadModifier } from "../scripts/catalog-surface.mjs";

test("padding edges expand to the four layout sides", () => {
  const { Modifier } = loadModifier();
  assert.deepEqual(Modifier.padding("all", 8).build()[0].args, {
    start: 8, end: 8, top: 8, bottom: 8,
  });
});

test("background and border shorthands keep their overloads", () => {
  const { Modifier } = loadModifier();
  assert.equal(Modifier.background("#6750a4").build()[0].args.color, "#6750a4");
  assert.equal(Modifier.backgroundColor({ color: "#ffffff" }).build()[0].args.color, "#ffffff");
  assert.ok(Modifier.border({ width: 2 }).build()[0].ids.includes(15));
  assert.ok(Modifier.border({ border: { width: 2, color: "#000000" } }).build()[0].ids.includes(13));
  assert.throws(() => Modifier.padding("nope", 1), /padding/);
});

test("every published component and modifier reaches generated Kotlin", () => {
  const { problems } = assembleSurface();
  // Box's content overload also accepts a modifier and no children, so the
  // modifier-only Box#1 overload can never be selected.
  assert.deepEqual(problems, ["Box Box#1 resolved to Box"]);
});

test("the example catalog fixtures match the generated surface", () => {
  const committed = JSON.parse(readFileSync(new URL("../example/catalog/fixtures.json", import.meta.url), "utf8"));
  assert.deepEqual(committed, buildCatalog());
});
