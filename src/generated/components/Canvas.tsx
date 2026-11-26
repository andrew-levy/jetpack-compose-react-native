// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeDrawing } from "../../utils/composeValues";

export type CanvasProps =
  | {
    modifiers: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    onDraw: ComposeDrawing;
    contentDescription?: never;
    }
  | {
    modifiers: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentDescription: string;
    onDraw: ComposeDrawing;
    }
;
export const Canvas = createComposableComponent<CanvasProps>({
  name: "Canvas",
  props: ["modifier","onDraw","contentDescription"],
  objectProps: ["onDraw"],
  children: false,
  overloads: [
    { id: "Canvas", children: false, parameters: [["modifier","ComposeModifier",false,false],["onDraw","object",false,false]], masks: [0] },
    { id: "Canvas#1", children: false, parameters: [["modifier","ComposeModifier",false,false],["contentDescription","string",false,false],["onDraw","object",false,false]], masks: [0] },
  ],
});
