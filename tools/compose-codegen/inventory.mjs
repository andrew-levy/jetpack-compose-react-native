const key = ({ kind, signature }) => JSON.stringify([kind, signature]);

function index(entries, label) {
  const result = new Map();
  for (const entry of entries) {
    const id = key(entry);
    if (result.has(id)) throw Error(`Duplicate ${label}: ${entry.signature}`);
    result.set(id, entry);
  }
  return result;
}

export function verifyInventory({ discovered, coverage, components, modifiers }, binary) {
  const inventory = index(discovered, "KSP declaration");
  const outcomes = index(coverage, "coverage outcome");
  const exports = index([
    ...components.map((entry) => ({ ...entry, kind: "component" })),
    ...modifiers.map((entry) => ({ ...entry, kind: "modifier" })),
  ], "generated overload");
  const compiledApi = index(binary.declarations, "binary declaration");
  const errors = [];

  if (compiledApi.size === 0 && discovered.some(({ binary }) => binary)) {
    errors.push("The binary inventory is empty for the configured Compose packages");
  }
  for (const [id, { signature, artifact }] of compiledApi) {
    if (!inventory.get(id)?.binary) errors.push(`KSP missed ${signature} [${artifact}]`);
  }
  for (const [id, declaration] of inventory) {
    const { signature, parameters } = declaration;
    if (declaration.binary && !compiledApi.has(id)) errors.push(`Binary inventory missed ${signature}`);
    const result = outcomes.get(id);
    if (!result) {
      errors.push(`Missing coverage outcome for ${signature}`);
      continue;
    }
    const exported = exports.get(id);
    if (result.status === "generated" ? !exported : exported || !result.reason) {
      errors.push(`Coverage disagrees with the generated export for ${signature}`);
    }
    if (!["generated", "skipped", "unsupported", "adapterRequired"].includes(result.status)) {
      errors.push(`Unknown coverage status for ${signature}`);
    }
    if (result.omittedForms.some(({ reason }) => !reason)) {
      errors.push(`An excluded call form has no reason for ${signature}`);
    }
    const omitted = new Map(result.omittedParameters.map(({ name, reason }) => [name, reason]));
    if ([...omitted.values()].some((reason) => !reason)) errors.push(`An omitted prop has no reason for ${signature}`);
    if (exported) {
      const names = new Set(exported.parameters.map(({ name, nativeName }) => nativeName ?? name));
      if (exported.children) names.add(exported.childrenParameter ?? "content");
      // Generated from the children's React keys (extractor `childKeys`).
      if (exported.childKeys) names.add(exported.childKeys);
      for (const { name } of parameters) {
        if (!names.has(name) && !omitted.has(name)) errors.push(`Unaccounted prop ${name} in ${signature}`);
      }
    }
  }
  for (const [id, { signature }] of [...outcomes, ...exports]) {
    if (!inventory.has(id)) errors.push(`Unknown declaration: ${signature}`);
  }
  if (errors.length) throw Error(`Compose discovery audit failed (${errors.length} differences):\n${errors.join("\n")}`);
  console.log(`Audited ${compiledApi.size} binary declarations and ${inventory.size} generation outcomes`);
}
