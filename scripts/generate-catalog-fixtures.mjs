import { writeFileSync } from "fs";

import { buildCatalog } from "./catalog-surface.mjs";

const catalog = buildCatalog();
writeFileSync(new URL("../example/catalog/fixtures.json", import.meta.url), `${JSON.stringify(catalog, null, 2)}\n`);
console.log(`Wrote ${catalog.components.length} components and ${catalog.modifiers.length} modifiers`);
