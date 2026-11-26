// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeFlingBehavior, ComposeLazyState, ComposeOverscrollEffect, ComposePaddingValues } from "../../utils/composeValues";
import type { ComposeLazyLayoutCacheWindowValue } from "../values/records";
import type { ComposeHorizontalArrangement, ComposeVerticalAlignment } from "../values/enums";

export type LazyRowProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state?: ComposeLazyState;
    contentPadding?: ComposePaddingValues;
    reverseLayout?: boolean;
    horizontalArrangement?: ComposeHorizontalArrangement;
    userScrollEnabled?: boolean;
    cacheWindow?: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    verticalAlignment?: never;
    flingBehavior?: never;
    overscrollEffect?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state?: ComposeLazyState;
    contentPadding?: ComposePaddingValues;
    reverseLayout?: boolean;
    userScrollEnabled?: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    children?: ReactNode;
    horizontalArrangement?: never;
    verticalAlignment?: never;
    flingBehavior?: never;
    cacheWindow?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    flingBehavior: ComposeFlingBehavior;
    overscrollEffect?: ComposeOverscrollEffect | null;
    children?: ReactNode;
    state?: never;
    contentPadding?: never;
    reverseLayout?: never;
    horizontalArrangement?: never;
    verticalAlignment?: never;
    userScrollEnabled?: never;
    cacheWindow?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    children?: ReactNode;
    state?: never;
    contentPadding?: never;
    reverseLayout?: never;
    horizontalArrangement?: never;
    verticalAlignment?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state?: ComposeLazyState;
    contentPadding?: ComposePaddingValues;
    reverseLayout?: boolean;
    horizontalArrangement?: ComposeHorizontalArrangement;
    verticalAlignment: ComposeVerticalAlignment;
    userScrollEnabled?: boolean;
    children?: ReactNode;
    flingBehavior?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    reverseLayout: boolean;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled?: boolean;
    children?: ReactNode;
    state?: never;
    contentPadding?: never;
    horizontalArrangement?: never;
    verticalAlignment?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding: ComposePaddingValues;
    reverseLayout?: boolean;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled?: boolean;
    children?: ReactNode;
    state?: never;
    horizontalArrangement?: never;
    verticalAlignment?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    horizontalArrangement: ComposeHorizontalArrangement;
    verticalAlignment: ComposeVerticalAlignment;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    cacheWindow?: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    state?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding?: ComposePaddingValues;
    reverseLayout?: boolean;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled?: boolean;
    children?: ReactNode;
    horizontalArrangement?: never;
    verticalAlignment?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    reverseLayout: boolean;
    horizontalArrangement: ComposeHorizontalArrangement;
    verticalAlignment: ComposeVerticalAlignment;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    cacheWindow?: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    horizontalArrangement: ComposeHorizontalArrangement;
    verticalAlignment: ComposeVerticalAlignment;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    cacheWindow?: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    reverseLayout?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    verticalAlignment: ComposeVerticalAlignment;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    cacheWindow?: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    horizontalArrangement?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    horizontalArrangement: ComposeHorizontalArrangement;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    cacheWindow?: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    verticalAlignment?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    horizontalArrangement: ComposeHorizontalArrangement;
    verticalAlignment: ComposeVerticalAlignment;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    cacheWindow?: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    flingBehavior?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    horizontalArrangement: ComposeHorizontalArrangement;
    verticalAlignment: ComposeVerticalAlignment;
    flingBehavior: ComposeFlingBehavior;
    overscrollEffect: ComposeOverscrollEffect | null;
    cacheWindow?: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    userScrollEnabled?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    horizontalArrangement: ComposeHorizontalArrangement;
    verticalAlignment: ComposeVerticalAlignment;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect?: ComposeOverscrollEffect | null;
    cacheWindow?: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    }
;
export const LazyRow = createComposableComponent<LazyRowProps>({
  name: "LazyRow",
  props: ["modifier","state","contentPadding","reverseLayout","horizontalArrangement","verticalAlignment","flingBehavior","userScrollEnabled","overscrollEffect","cacheWindow"],
  objectProps: ["state","contentPadding","flingBehavior","overscrollEffect","cacheWindow"],
  children: true,
  overloads: [
    { id: "LazyRow", children: true, parameters: [["modifier","ComposeModifier",true,false],["state","object",true,false],["contentPadding","object",true,false],["reverseLayout","boolean",true,false],["horizontalArrangement","string",true,false],["verticalAlignment","string",true,false],["flingBehavior","object",true,false],["userScrollEnabled","boolean",true,false],["overscrollEffect","object",true,true],["cacheWindow","object",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,127,128,129,130,131,132,133,134,135,160,191,192,193,194,195,196,197,198,199,223,239,247,251,253,254,255,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,320,321,322,323,324,325,326,327,328,329,330,331,332,333,334,335,383,447,479,495,503,507,509,510,511] },
  ],
});
