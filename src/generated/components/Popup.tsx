// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent } from "../../runtime/createComposableComponent";
import type { ComposeIntOffset } from "../values/records";
import type { ComposePopupPosition, ComposePopupProperties } from "../../utils/composeValues";
import type { ComposeAlignment } from "../values/enums";

export type PopupProps =
  | {
    alignment?: ComposeAlignment;
    offset?: ComposeIntOffset;
    onDismissRequest?: (() => void) | null;
    properties?: ComposePopupProperties;
    children?: ReactNode;
    popupPositionProvider?: never;
    }
  | {
    popupPositionProvider: ComposePopupPosition;
    onDismissRequest?: (() => void) | null;
    properties?: ComposePopupProperties;
    children?: ReactNode;
    alignment?: never;
    offset?: never;
    }
;
export const Popup = createComposableComponent<PopupProps>({
  name: "Popup",
  props: ["alignment","offset","properties","popupPositionProvider"],
  objectProps: ["offset","properties","popupPositionProvider"],
  events: ["onDismissRequest"],
  children: true,
  overloads: [
    { id: "Popup", children: true, parameters: [["alignment","string",true,false],["offset","object",true,false],["onDismissRequest","function",true,true],["properties","object",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
    { id: "Popup#1", children: true, parameters: [["popupPositionProvider","object",false,false],["onDismissRequest","function",true,true],["properties","object",true,false]], masks: [0,1,2,3] },
  ],
});
