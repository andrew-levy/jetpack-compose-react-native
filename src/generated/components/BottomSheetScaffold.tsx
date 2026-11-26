// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeBottomSheetScaffoldState } from "../../utils/composeValues";
import type { ComposeSnackbarHostStateSnapshot } from "../values/payloads";

export type BottomSheetScaffoldProps =
  | {
    sheetContent: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    sheetPeekHeight?: number;
    sheetMaxWidth?: number;
    sheetContainerColor?: string;
    sheetContentColor?: string;
    contentColor?: string;
    children?: ReactNode;
    scaffoldState?: never;
    sheetShape?: never;
    sheetTonalElevation?: never;
    sheetShadowElevation?: never;
    sheetDragHandle?: never;
    sheetSwipeEnabled?: never;
    topBar?: never;
    snackbarHost?: never;
    containerColor?: never;
    }
  | {
    sheetContent: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    sheetPeekHeight?: number;
    sheetMaxWidth?: number;
    sheetContainerColor?: string;
    sheetContentColor?: string;
    containerColor: string;
    children?: ReactNode;
    scaffoldState?: never;
    sheetShape?: never;
    sheetTonalElevation?: never;
    sheetShadowElevation?: never;
    sheetDragHandle?: never;
    sheetSwipeEnabled?: never;
    topBar?: never;
    snackbarHost?: never;
    contentColor?: never;
    }
  | {
    sheetContent: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    sheetPeekHeight?: number;
    sheetMaxWidth?: number;
    sheetContainerColor?: string;
    sheetContentColor?: string;
    snackbarHost: ReactNode | ((value1: ComposeSnackbarHostStateSnapshot) => ReactNode);
    children?: ReactNode;
    scaffoldState?: never;
    sheetShape?: never;
    sheetTonalElevation?: never;
    sheetShadowElevation?: never;
    sheetDragHandle?: never;
    sheetSwipeEnabled?: never;
    topBar?: never;
    containerColor?: never;
    contentColor?: never;
    }
  | {
    sheetContent: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    sheetPeekHeight?: number;
    sheetMaxWidth?: number;
    sheetContainerColor?: string;
    sheetContentColor?: string;
    topBar: ReactNode;
    children?: ReactNode;
    scaffoldState?: never;
    sheetShape?: never;
    sheetTonalElevation?: never;
    sheetShadowElevation?: never;
    sheetDragHandle?: never;
    sheetSwipeEnabled?: never;
    snackbarHost?: never;
    containerColor?: never;
    contentColor?: never;
    }
  | {
    sheetContent: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    sheetPeekHeight?: number;
    sheetMaxWidth?: number;
    sheetContainerColor?: string;
    sheetContentColor?: string;
    sheetSwipeEnabled: boolean;
    children?: ReactNode;
    scaffoldState?: never;
    sheetShape?: never;
    sheetTonalElevation?: never;
    sheetShadowElevation?: never;
    sheetDragHandle?: never;
    topBar?: never;
    snackbarHost?: never;
    containerColor?: never;
    contentColor?: never;
    }
  | {
    sheetContent: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    sheetPeekHeight?: number;
    sheetMaxWidth?: number;
    sheetContainerColor?: string;
    sheetContentColor?: string;
    sheetDragHandle: ReactNode;
    children?: ReactNode;
    scaffoldState?: never;
    sheetShape?: never;
    sheetTonalElevation?: never;
    sheetShadowElevation?: never;
    sheetSwipeEnabled?: never;
    topBar?: never;
    snackbarHost?: never;
    containerColor?: never;
    contentColor?: never;
    }
  | {
    sheetContent: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    sheetPeekHeight?: number;
    sheetMaxWidth?: number;
    sheetContainerColor?: string;
    sheetContentColor?: string;
    sheetShadowElevation: number;
    children?: ReactNode;
    scaffoldState?: never;
    sheetShape?: never;
    sheetTonalElevation?: never;
    sheetDragHandle?: never;
    sheetSwipeEnabled?: never;
    topBar?: never;
    snackbarHost?: never;
    containerColor?: never;
    contentColor?: never;
    }
  | {
    sheetContent: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    sheetPeekHeight?: number;
    sheetMaxWidth?: number;
    sheetContainerColor?: string;
    sheetContentColor?: string;
    sheetTonalElevation: number;
    children?: ReactNode;
    scaffoldState?: never;
    sheetShape?: never;
    sheetShadowElevation?: never;
    sheetDragHandle?: never;
    sheetSwipeEnabled?: never;
    topBar?: never;
    snackbarHost?: never;
    containerColor?: never;
    contentColor?: never;
    }
  | {
    sheetContent: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    sheetPeekHeight?: number;
    sheetMaxWidth?: number;
    sheetShape: ComposeShape;
    sheetContainerColor?: string;
    sheetContentColor?: string;
    children?: ReactNode;
    scaffoldState?: never;
    sheetTonalElevation?: never;
    sheetShadowElevation?: never;
    sheetDragHandle?: never;
    sheetSwipeEnabled?: never;
    topBar?: never;
    snackbarHost?: never;
    containerColor?: never;
    contentColor?: never;
    }
  | {
    sheetContent: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    scaffoldState: ComposeBottomSheetScaffoldState;
    sheetPeekHeight?: number;
    sheetMaxWidth?: number;
    sheetContainerColor?: string;
    sheetContentColor?: string;
    children?: ReactNode;
    sheetShape?: never;
    sheetTonalElevation?: never;
    sheetShadowElevation?: never;
    sheetDragHandle?: never;
    sheetSwipeEnabled?: never;
    topBar?: never;
    snackbarHost?: never;
    containerColor?: never;
    contentColor?: never;
    }
  | {
    sheetContent: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    scaffoldState: ComposeBottomSheetScaffoldState;
    sheetPeekHeight: number;
    sheetMaxWidth: number;
    sheetShape: ComposeShape;
    sheetContainerColor: string;
    sheetContentColor: string;
    sheetTonalElevation: number;
    sheetShadowElevation: number;
    sheetDragHandle: ReactNode;
    sheetSwipeEnabled: boolean;
    topBar: ReactNode;
    snackbarHost?: ReactNode | ((value1: ComposeSnackbarHostStateSnapshot) => ReactNode);
    containerColor: string;
    contentColor: string;
    children?: ReactNode;
    }
;
export const BottomSheetScaffold = createComposableComponent<BottomSheetScaffoldProps>({
  name: "BottomSheetScaffold",
  props: ["modifier","scaffoldState","sheetPeekHeight","sheetMaxWidth","sheetShape","sheetContainerColor","sheetContentColor","sheetTonalElevation","sheetShadowElevation","sheetSwipeEnabled","containerColor","contentColor"],
  objectProps: ["scaffoldState","sheetShape"],
  slots: ["sheetContent","sheetDragHandle","topBar","snackbarHost"],
  renderSlots: ["snackbarHost"],
  children: true,
  overloads: [
    { id: "BottomSheetScaffold", children: true, parameters: [["sheetContent","ReactNode",false,false],["modifier","ComposeModifier",true,false],["scaffoldState","object",true,false],["sheetPeekHeight","number",true,false],["sheetMaxWidth","number",true,false],["sheetShape","shape",true,false],["sheetContainerColor","string",true,false],["sheetContentColor","string",true,false],["sheetTonalElevation","number",true,false],["sheetShadowElevation","number",true,false],["sheetDragHandle","ReactNode",true,true],["sheetSwipeEnabled","boolean",true,false],["topBar","ReactNode",true,true],["snackbarHost","ReactNode",true,false],["containerColor","string",true,false],["contentColor","string",true,false]], masks: [0,1,2,3,4,5,6,7,8,10,12,14,16,17,18,19,20,21,22,23,24,26,28,30,32,33,34,35,36,37,38,39,40,42,44,46,48,49,50,51,52,53,54,55,56,58,60,62,64,66,68,70,80,82,84,86,96,98,100,102,112,114,116,118,128,130,132,134,144,146,148,150,160,162,164,166,176,178,180,182,256,258,260,262,272,274,276,278,288,290,292,294,304,306,308,310,512,514,516,518,528,530,532,534,544,546,548,550,560,562,564,566,1024,1026,1028,1030,1040,1042,1044,1046,1056,1058,1060,1062,1072,1074,1076,1078,2048,2050,2052,2054,2064,2066,2068,2070,2080,2082,2084,2086,2096,2098,2100,2102,4096,4098,4100,4102,4112,4114,4116,4118,4128,4130,4132,4134,4144,4146,4148,4150,8192,8194,8196,8198,8208,8210,8212,8214,8224,8226,8228,8230,8240,8242,8244,8246,14335,16383] },
  ],
});
