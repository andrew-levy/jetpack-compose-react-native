#!/usr/bin/env node
const fs = require("fs");
const path = require("path");

// Get this at https://fonts.google.com/metadata/icons?key=material_symbols&incomplete=true
const materialIcons = require("./material_icons.json");
const icons = materialIcons.icons;
const iconTypes = icons.map((icon) => `"${icon.name}"`).join(" | ");

const typescript = `
export type MaterialIcon = ${iconTypes}
`;

fs.writeFileSync(path.join(__dirname, "material_icons.ts"), typescript);
