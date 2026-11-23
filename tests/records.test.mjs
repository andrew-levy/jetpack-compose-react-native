import assert from "node:assert/strict";
import test from "node:test";

import { recordOutputs } from "../tools/compose-codegen/records.mjs";

const kinds = {
  float: { type: "number" },
  dp: { type: "number" },
  ComposeBlurredEdgeTreatmentValue: { type: "ComposeBlurredEdgeTreatmentValue" },
  "record:ComposeBlurStop": { type: "ComposeBlurStop" },
  "record:ComposeBlurRadiusSpecValue": { type: "ComposeBlurRadiusSpecValue" },
};

const field = (name, kind, optional = false, nullable = false) => ({ name, kind, optional, nullable });

const records = [
  {
    name: "ComposeBlurStop", kotlinType: "androidx.compose.ui.graphics.blur.BlurStop", optIns: [],
    fields: [field("fraction", "float"), field("radius", "dp")],
  },
  {
    name: "ComposeBlurRadiusSpecValue", kotlinType: "androidx.compose.ui.graphics.blur.BlurRadiusSpec", optIns: [],
    fields: [],
    factories: [
      { name: "BlurRadiusSpec.uniform", function: "androidx.compose.ui.graphics.blur.BlurRadiusSpec.Companion.uniform",
        fields: [field("radius", "dp")], composable: false },
      { name: "BlurRadiusSpec.verticalGradient", function: "androidx.compose.ui.graphics.blur.BlurRadiusSpec.Companion.verticalGradient",
        fields: [field("startRadius", "dp"), field("endRadius", "dp")], composable: false },
      { name: "BlurRadiusSpec.verticalGradient", function: "androidx.compose.ui.graphics.blur.BlurRadiusSpec.Companion.verticalGradient",
        fields: [field("stops", "list:record:ComposeBlurStop")], composable: false },
    ],
  },
  {
    name: "ComposeBlurScopeBlock", kotlinType: "androidx.compose.ui.draw.BlurScope", optIns: [], block: true,
    fields: [
      field("alpha", "float", true),
      field("blurRadiusSpec", "record:ComposeBlurRadiusSpecValue", true),
      field("edgeTreatment", "ComposeBlurredEdgeTreatmentValue", true),
      field("shape", "shape", true),
    ],
  },
];

const [ts, kotlin] = recordOutputs(records, kinds);

test("a configuration block becomes an object of optional scope properties", () => {
  assert.match(ts, /export type ComposeBlurScopeBlock = \{ alpha\?: number; blurRadiusSpec\?: ComposeBlurRadiusSpecValue; edgeTreatment\?: ComposeBlurredEdgeTreatmentValue; shape\?: ComposeShape \};/);
  assert.match(ts, /import type \{ ComposeShape \} from "\.\.\/utils\/modifier";/);
});

test("a block decoder returns a scope lambda that assigns only supplied fields", () => {
  assert.match(kotlin, /internal fun JSONObject\.decodeComposeBlurScopeBlock\(\): androidx\.compose\.ui\.draw\.BlurScope\.\(\) -> Unit \{/);
  assert.match(kotlin, /val `blurRadiusSpec` = if \(has\("blurRadiusSpec"\)\) getJSONObject\("blurRadiusSpec"\)\.decodeComposeBlurRadiusSpecValue\(\) else null/);
  assert.match(kotlin, /if \(hasEdgeTreatment\) this\.`edgeTreatment` = `edgeTreatment`!!/);
  assert.match(kotlin, /val `shape` = if \(has\("shape"\)\) composeShape\("shape"\) else null/);
});

test("list fields decode each array element", () => {
  assert.match(ts, /stops: readonly ComposeBlurStop\[\]/);
  assert.match(kotlin, /getJSONArray\("stops"\)\.let \{ items -> List\(items\.length\(\)\) \{ index -> with\(items\) \{ getJSONObject\(index\)\.decodeComposeBlurStop\(\) \} \} \}/);
});

test("factory overloads with one label are selected by a field only one declares", () => {
  assert.match(kotlin, /"BlurRadiusSpec\.verticalGradient" -> when \{ has\("startRadius"\) \|\| has\("endRadius"\) -> decodeComposeBlurRadiusSpecValueFactory1\(\); has\("stops"\) -> decodeComposeBlurRadiusSpecValueFactory2\(\); else -> error/);
  assert.equal((ts.match(/factory: "BlurRadiusSpec\.verticalGradient"/g) ?? []).length, 2);
});

test("an overload of only optional fields is selected by any field it alone declares", () => {
  const shapes = [{
    name: "ComposeShapeValue", kotlinType: "androidx.compose.ui.graphics.Shape", optIns: [], fields: [],
    factories: [
      { name: "RoundedCornerShape", function: "androidx.compose.foundation.shape.RoundedCornerShape",
        fields: [field("size", "dp")], composable: false },
      { name: "RoundedCornerShape", function: "androidx.compose.foundation.shape.RoundedCornerShape",
        fields: [field("topStart", "dp", true), field("topEnd", "dp", true), field("bottomEnd", "dp", true), field("bottomStart", "dp", true)],
        composable: false },
    ],
  }];
  const [, shapeKotlin] = recordOutputs(shapes, kinds);
  assert.match(shapeKotlin, /"RoundedCornerShape" -> when \{ has\("size"\) -> decodeComposeShapeValueFactory0\(\); has\("topStart"\) \|\| has\("topEnd"\) \|\| has\("bottomEnd"\) \|\| has\("bottomStart"\) -> decodeComposeShapeValueFactory1\(\)/);
});

test("a wide value type is built by chained copies from its defaults", () => {
  const styles = [{
    name: "ComposeTextStyleValue", kotlinType: "androidx.compose.ui.text.TextStyle", optIns: [], copy: true,
    fields: [field("fontSize", "dp", true), field("fontWeight", "ComposeBlurredEdgeTreatmentValue", true, true)],
  }];
  const [styleTs, styleKotlin] = recordOutputs(styles, kinds);
  assert.match(styleTs, /export type ComposeTextStyleValue = \{ fontSize\?: number; fontWeight\?: ComposeBlurredEdgeTreatmentValue \| null \};/);
  assert.match(styleKotlin, /var value = androidx\.compose\.ui\.text\.TextStyle\(\)/);
  assert.match(styleKotlin, /if \(has\("fontSize"\)\) value = value\.copy\(`fontSize` = getDouble\("fontSize"\)\.dp\)/);
});
