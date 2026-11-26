// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeNestedScrollBehavior, ComposeOverscrollEffect, ComposePaddingValues, ComposePageSize, ComposePagerState } from "../../utils/composeValues";
import type { ComposeHorizontalAlignment, ComposeSnapPosition } from "../values/enums";

export type VerticalPagerProps =
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    snapPosition?: ComposeSnapPosition;
    overscrollEffect?: ComposeOverscrollEffect | null;
    children?: ReactNode;
    contentPadding?: never;
    pageSize?: never;
    beyondViewportPageCount?: never;
    pageSpacing?: never;
    horizontalAlignment?: never;
    userScrollEnabled?: never;
    reverseLayout?: never;
    pageNestedScrollConnection?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    beyondViewportPageCount?: number;
    pageSpacing?: number;
    userScrollEnabled?: boolean;
    reverseLayout?: boolean;
    pageNestedScrollConnection: ComposeNestedScrollBehavior;
    children?: ReactNode;
    contentPadding?: never;
    pageSize?: never;
    horizontalAlignment?: never;
    snapPosition?: never;
    overscrollEffect?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    reverseLayout: boolean;
    overscrollEffect?: ComposeOverscrollEffect | null;
    children?: ReactNode;
    contentPadding?: never;
    pageSize?: never;
    beyondViewportPageCount?: never;
    pageSpacing?: never;
    horizontalAlignment?: never;
    userScrollEnabled?: never;
    pageNestedScrollConnection?: never;
    snapPosition?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    reverseLayout: boolean;
    snapPosition: ComposeSnapPosition;
    children?: ReactNode;
    contentPadding?: never;
    pageSize?: never;
    beyondViewportPageCount?: never;
    pageSpacing?: never;
    horizontalAlignment?: never;
    userScrollEnabled?: never;
    pageNestedScrollConnection?: never;
    overscrollEffect?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    userScrollEnabled: boolean;
    reverseLayout?: boolean;
    overscrollEffect?: ComposeOverscrollEffect | null;
    children?: ReactNode;
    contentPadding?: never;
    pageSize?: never;
    beyondViewportPageCount?: never;
    pageSpacing?: never;
    horizontalAlignment?: never;
    pageNestedScrollConnection?: never;
    snapPosition?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    userScrollEnabled: boolean;
    reverseLayout?: boolean;
    snapPosition: ComposeSnapPosition;
    children?: ReactNode;
    contentPadding?: never;
    pageSize?: never;
    beyondViewportPageCount?: never;
    pageSpacing?: never;
    horizontalAlignment?: never;
    pageNestedScrollConnection?: never;
    overscrollEffect?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    beyondViewportPageCount?: number;
    pageSpacing?: number;
    horizontalAlignment: ComposeHorizontalAlignment;
    userScrollEnabled?: boolean;
    reverseLayout?: boolean;
    pageNestedScrollConnection?: ComposeNestedScrollBehavior;
    children?: ReactNode;
    contentPadding?: never;
    pageSize?: never;
    snapPosition?: never;
    overscrollEffect?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    pageSpacing: number;
    userScrollEnabled?: boolean;
    reverseLayout?: boolean;
    overscrollEffect?: ComposeOverscrollEffect | null;
    children?: ReactNode;
    contentPadding?: never;
    pageSize?: never;
    beyondViewportPageCount?: never;
    horizontalAlignment?: never;
    pageNestedScrollConnection?: never;
    snapPosition?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    pageSpacing: number;
    userScrollEnabled?: boolean;
    reverseLayout?: boolean;
    snapPosition: ComposeSnapPosition;
    children?: ReactNode;
    contentPadding?: never;
    pageSize?: never;
    beyondViewportPageCount?: never;
    horizontalAlignment?: never;
    pageNestedScrollConnection?: never;
    overscrollEffect?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    beyondViewportPageCount: number;
    pageSpacing?: number;
    userScrollEnabled?: boolean;
    reverseLayout?: boolean;
    overscrollEffect?: ComposeOverscrollEffect | null;
    children?: ReactNode;
    contentPadding?: never;
    pageSize?: never;
    horizontalAlignment?: never;
    pageNestedScrollConnection?: never;
    snapPosition?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    beyondViewportPageCount: number;
    pageSpacing?: number;
    userScrollEnabled?: boolean;
    reverseLayout?: boolean;
    snapPosition: ComposeSnapPosition;
    children?: ReactNode;
    contentPadding?: never;
    pageSize?: never;
    horizontalAlignment?: never;
    pageNestedScrollConnection?: never;
    overscrollEffect?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    pageSize: ComposePageSize;
    overscrollEffect?: ComposeOverscrollEffect | null;
    children?: ReactNode;
    contentPadding?: never;
    beyondViewportPageCount?: never;
    pageSpacing?: never;
    horizontalAlignment?: never;
    userScrollEnabled?: never;
    reverseLayout?: never;
    pageNestedScrollConnection?: never;
    snapPosition?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    pageSize: ComposePageSize;
    snapPosition: ComposeSnapPosition;
    children?: ReactNode;
    contentPadding?: never;
    beyondViewportPageCount?: never;
    pageSpacing?: never;
    horizontalAlignment?: never;
    userScrollEnabled?: never;
    reverseLayout?: never;
    pageNestedScrollConnection?: never;
    overscrollEffect?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    pageSize: ComposePageSize;
    reverseLayout: boolean;
    children?: ReactNode;
    contentPadding?: never;
    beyondViewportPageCount?: never;
    pageSpacing?: never;
    horizontalAlignment?: never;
    userScrollEnabled?: never;
    pageNestedScrollConnection?: never;
    snapPosition?: never;
    overscrollEffect?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    pageSize: ComposePageSize;
    userScrollEnabled: boolean;
    reverseLayout?: boolean;
    children?: ReactNode;
    contentPadding?: never;
    beyondViewportPageCount?: never;
    pageSpacing?: never;
    horizontalAlignment?: never;
    pageNestedScrollConnection?: never;
    snapPosition?: never;
    overscrollEffect?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    pageSize: ComposePageSize;
    pageSpacing: number;
    userScrollEnabled?: boolean;
    reverseLayout?: boolean;
    children?: ReactNode;
    contentPadding?: never;
    beyondViewportPageCount?: never;
    horizontalAlignment?: never;
    pageNestedScrollConnection?: never;
    snapPosition?: never;
    overscrollEffect?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    pageSize: ComposePageSize;
    beyondViewportPageCount: number;
    pageSpacing?: number;
    userScrollEnabled?: boolean;
    reverseLayout?: boolean;
    children?: ReactNode;
    contentPadding?: never;
    horizontalAlignment?: never;
    pageNestedScrollConnection?: never;
    snapPosition?: never;
    overscrollEffect?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    pageSize: ComposePageSize;
    beyondViewportPageCount: number;
    pageSpacing: number;
    horizontalAlignment: ComposeHorizontalAlignment;
    userScrollEnabled: boolean;
    reverseLayout: boolean;
    pageNestedScrollConnection: ComposeNestedScrollBehavior;
    snapPosition: ComposeSnapPosition;
    overscrollEffect: ComposeOverscrollEffect | null;
    children?: ReactNode;
    contentPadding?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding: ComposePaddingValues;
    pageSpacing?: number;
    horizontalAlignment?: ComposeHorizontalAlignment;
    userScrollEnabled?: boolean;
    reverseLayout?: boolean;
    pageNestedScrollConnection?: ComposeNestedScrollBehavior;
    children?: ReactNode;
    pageSize?: never;
    beyondViewportPageCount?: never;
    snapPosition?: never;
    overscrollEffect?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding: ComposePaddingValues;
    beyondViewportPageCount: number;
    horizontalAlignment?: ComposeHorizontalAlignment;
    userScrollEnabled?: boolean;
    reverseLayout?: boolean;
    pageNestedScrollConnection?: ComposeNestedScrollBehavior;
    children?: ReactNode;
    pageSize?: never;
    pageSpacing?: never;
    snapPosition?: never;
    overscrollEffect?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding: ComposePaddingValues;
    beyondViewportPageCount: number;
    pageSpacing: number;
    userScrollEnabled?: boolean;
    reverseLayout?: boolean;
    pageNestedScrollConnection?: ComposeNestedScrollBehavior;
    children?: ReactNode;
    pageSize?: never;
    horizontalAlignment?: never;
    snapPosition?: never;
    overscrollEffect?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding: ComposePaddingValues;
    beyondViewportPageCount: number;
    pageSpacing: number;
    horizontalAlignment: ComposeHorizontalAlignment;
    reverseLayout?: boolean;
    pageNestedScrollConnection?: ComposeNestedScrollBehavior;
    children?: ReactNode;
    pageSize?: never;
    userScrollEnabled?: never;
    snapPosition?: never;
    overscrollEffect?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding: ComposePaddingValues;
    beyondViewportPageCount: number;
    pageSpacing: number;
    horizontalAlignment: ComposeHorizontalAlignment;
    userScrollEnabled: boolean;
    pageNestedScrollConnection?: ComposeNestedScrollBehavior;
    children?: ReactNode;
    pageSize?: never;
    reverseLayout?: never;
    snapPosition?: never;
    overscrollEffect?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding: ComposePaddingValues;
    beyondViewportPageCount: number;
    pageSpacing: number;
    horizontalAlignment: ComposeHorizontalAlignment;
    userScrollEnabled: boolean;
    reverseLayout: boolean;
    children?: ReactNode;
    pageSize?: never;
    pageNestedScrollConnection?: never;
    snapPosition?: never;
    overscrollEffect?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding: ComposePaddingValues;
    pageSize?: ComposePageSize;
    beyondViewportPageCount: number;
    pageSpacing: number;
    horizontalAlignment: ComposeHorizontalAlignment;
    userScrollEnabled: boolean;
    reverseLayout: boolean;
    pageNestedScrollConnection: ComposeNestedScrollBehavior;
    snapPosition?: ComposeSnapPosition;
    overscrollEffect?: ComposeOverscrollEffect | null;
    children?: ReactNode;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding: ComposePaddingValues;
    pageSize: ComposePageSize;
    pageSpacing: number;
    horizontalAlignment: ComposeHorizontalAlignment;
    userScrollEnabled: boolean;
    reverseLayout: boolean;
    pageNestedScrollConnection: ComposeNestedScrollBehavior;
    snapPosition: ComposeSnapPosition;
    overscrollEffect: ComposeOverscrollEffect | null;
    children?: ReactNode;
    beyondViewportPageCount?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding: ComposePaddingValues;
    pageSize: ComposePageSize;
    beyondViewportPageCount: number;
    horizontalAlignment: ComposeHorizontalAlignment;
    userScrollEnabled: boolean;
    reverseLayout: boolean;
    pageNestedScrollConnection: ComposeNestedScrollBehavior;
    snapPosition: ComposeSnapPosition;
    overscrollEffect: ComposeOverscrollEffect | null;
    children?: ReactNode;
    pageSpacing?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding: ComposePaddingValues;
    pageSize: ComposePageSize;
    beyondViewportPageCount: number;
    pageSpacing: number;
    userScrollEnabled: boolean;
    reverseLayout: boolean;
    pageNestedScrollConnection: ComposeNestedScrollBehavior;
    snapPosition: ComposeSnapPosition;
    overscrollEffect: ComposeOverscrollEffect | null;
    children?: ReactNode;
    horizontalAlignment?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding: ComposePaddingValues;
    pageSize: ComposePageSize;
    beyondViewportPageCount: number;
    pageSpacing: number;
    horizontalAlignment: ComposeHorizontalAlignment;
    reverseLayout: boolean;
    pageNestedScrollConnection: ComposeNestedScrollBehavior;
    snapPosition: ComposeSnapPosition;
    overscrollEffect: ComposeOverscrollEffect | null;
    children?: ReactNode;
    userScrollEnabled?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding: ComposePaddingValues;
    pageSize: ComposePageSize;
    beyondViewportPageCount: number;
    pageSpacing: number;
    horizontalAlignment: ComposeHorizontalAlignment;
    userScrollEnabled: boolean;
    pageNestedScrollConnection: ComposeNestedScrollBehavior;
    snapPosition: ComposeSnapPosition;
    overscrollEffect: ComposeOverscrollEffect | null;
    children?: ReactNode;
    reverseLayout?: never;
    }
  | {
    state: ComposePagerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding: ComposePaddingValues;
    pageSize: ComposePageSize;
    beyondViewportPageCount: number;
    pageSpacing: number;
    horizontalAlignment: ComposeHorizontalAlignment;
    userScrollEnabled: boolean;
    reverseLayout: boolean;
    snapPosition: ComposeSnapPosition;
    overscrollEffect: ComposeOverscrollEffect | null;
    children?: ReactNode;
    pageNestedScrollConnection?: never;
    }
;
export const VerticalPager = createComposableComponent<VerticalPagerProps>({
  name: "VerticalPager",
  props: ["state","modifier","contentPadding","pageSize","beyondViewportPageCount","pageSpacing","horizontalAlignment","userScrollEnabled","reverseLayout","pageNestedScrollConnection","snapPosition","overscrollEffect"],
  objectProps: ["state","contentPadding","pageSize","pageNestedScrollConnection","overscrollEffect"],
  children: true,
  overloads: [
    { id: "VerticalPager", children: true, parameters: [["state","object",false,false],["modifier","ComposeModifier",true,false],["contentPadding","object",true,false],["pageSize","object",true,false],["beyondViewportPageCount","number",true,false],["pageSpacing","number",true,false],["horizontalAlignment","string",true,false],["userScrollEnabled","boolean",true,false],["reverseLayout","boolean",true,false],["pageNestedScrollConnection","object",true,false],["snapPosition","string",true,false],["overscrollEffect","object",true,true]], masks: [0,1,2,4,5,6,8,9,10,12,13,14,16,17,20,21,24,25,28,29,32,33,34,36,37,38,40,41,42,44,45,46,48,49,52,53,56,57,60,61,64,65,66,68,69,70,72,73,74,76,77,78,80,81,84,85,88,89,92,93,96,97,98,100,101,102,104,105,106,108,109,110,112,113,116,117,120,121,124,125,128,129,132,133,136,137,140,141,144,145,148,149,152,153,156,157,160,161,164,165,168,169,172,173,176,177,180,181,184,185,188,189,192,193,196,197,200,201,204,205,208,209,212,213,216,217,220,221,224,225,228,229,232,233,236,237,240,241,244,245,248,249,252,253,255,256,258,260,264,268,288,292,296,300,320,324,328,332,352,356,360,364,509,511,512,514,516,520,524,544,548,552,556,576,580,584,588,608,612,616,620,765,767,768,895,959,991,1007,1015,1019,1021,1022,1023] },
  ],
});
