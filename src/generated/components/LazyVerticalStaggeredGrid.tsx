// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeFlingBehavior, ComposeGridCells, ComposeLazyState, ComposeOverscrollEffect, ComposePaddingValues } from "../../utils/composeValues";
import type { ComposeLazyLayoutCacheWindowValue } from "../values/records";
import type { ComposeHorizontalArrangement } from "../values/enums";

export type LazyVerticalStaggeredGridProps =
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state?: ComposeLazyState;
    reverseLayout?: boolean;
    verticalItemSpacing?: number;
    userScrollEnabled?: boolean;
    overscrollEffect?: ComposeOverscrollEffect | null;
    children?: ReactNode;
    contentPadding?: never;
    horizontalArrangement?: never;
    flingBehavior?: never;
    cacheWindow?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    flingBehavior: ComposeFlingBehavior;
    overscrollEffect?: ComposeOverscrollEffect | null;
    children?: ReactNode;
    state?: never;
    contentPadding?: never;
    reverseLayout?: never;
    verticalItemSpacing?: never;
    horizontalArrangement?: never;
    userScrollEnabled?: never;
    cacheWindow?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    children?: ReactNode;
    state?: never;
    contentPadding?: never;
    reverseLayout?: never;
    verticalItemSpacing?: never;
    horizontalArrangement?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state?: ComposeLazyState;
    reverseLayout?: boolean;
    verticalItemSpacing?: number;
    horizontalArrangement: ComposeHorizontalArrangement;
    userScrollEnabled?: boolean;
    children?: ReactNode;
    contentPadding?: never;
    flingBehavior?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    verticalItemSpacing: number;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled?: boolean;
    children?: ReactNode;
    state?: never;
    contentPadding?: never;
    reverseLayout?: never;
    horizontalArrangement?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    reverseLayout: boolean;
    verticalItemSpacing?: number;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled?: boolean;
    children?: ReactNode;
    state?: never;
    contentPadding?: never;
    horizontalArrangement?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding: ComposePaddingValues;
    reverseLayout?: boolean;
    verticalItemSpacing?: number;
    horizontalArrangement?: ComposeHorizontalArrangement;
    userScrollEnabled?: boolean;
    children?: ReactNode;
    state?: never;
    flingBehavior?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    verticalItemSpacing: number;
    horizontalArrangement: ComposeHorizontalArrangement;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    children?: ReactNode;
    state?: never;
    cacheWindow?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    reverseLayout?: boolean;
    verticalItemSpacing?: number;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled?: boolean;
    children?: ReactNode;
    contentPadding?: never;
    horizontalArrangement?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    reverseLayout: boolean;
    verticalItemSpacing: number;
    horizontalArrangement: ComposeHorizontalArrangement;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    children?: ReactNode;
    contentPadding?: never;
    cacheWindow?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    verticalItemSpacing?: number;
    horizontalArrangement?: ComposeHorizontalArrangement;
    userScrollEnabled?: boolean;
    children?: ReactNode;
    reverseLayout?: never;
    flingBehavior?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    verticalItemSpacing: number;
    horizontalArrangement: ComposeHorizontalArrangement;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    children?: ReactNode;
    reverseLayout?: never;
    cacheWindow?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    horizontalArrangement?: ComposeHorizontalArrangement;
    userScrollEnabled?: boolean;
    children?: ReactNode;
    verticalItemSpacing?: never;
    flingBehavior?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    columns: ComposeGridCells;
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
    children?: ReactNode;
    verticalItemSpacing?: never;
    cacheWindow?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    verticalItemSpacing: number;
    userScrollEnabled?: boolean;
    children?: ReactNode;
    horizontalArrangement?: never;
    flingBehavior?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    verticalItemSpacing: number;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    children?: ReactNode;
    horizontalArrangement?: never;
    cacheWindow?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    verticalItemSpacing: number;
    horizontalArrangement: ComposeHorizontalArrangement;
    children?: ReactNode;
    flingBehavior?: never;
    userScrollEnabled?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    verticalItemSpacing: number;
    horizontalArrangement: ComposeHorizontalArrangement;
    flingBehavior?: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect?: ComposeOverscrollEffect | null;
    children?: ReactNode;
    cacheWindow?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    verticalItemSpacing: number;
    horizontalArrangement: ComposeHorizontalArrangement;
    flingBehavior: ComposeFlingBehavior;
    overscrollEffect: ComposeOverscrollEffect | null;
    children?: ReactNode;
    userScrollEnabled?: never;
    cacheWindow?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state?: ComposeLazyState;
    contentPadding?: ComposePaddingValues;
    reverseLayout?: boolean;
    verticalItemSpacing?: number;
    userScrollEnabled?: boolean;
    cacheWindow: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    horizontalArrangement?: never;
    flingBehavior?: never;
    overscrollEffect?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    verticalItemSpacing: number;
    horizontalArrangement: ComposeHorizontalArrangement;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    cacheWindow: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    state?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    reverseLayout: boolean;
    verticalItemSpacing: number;
    horizontalArrangement: ComposeHorizontalArrangement;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    cacheWindow: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    contentPadding?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    verticalItemSpacing: number;
    horizontalArrangement: ComposeHorizontalArrangement;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    cacheWindow: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    reverseLayout?: never;
    }
  | {
    columns: ComposeGridCells;
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
    cacheWindow: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    verticalItemSpacing?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    verticalItemSpacing: number;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    cacheWindow: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    horizontalArrangement?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    verticalItemSpacing: number;
    horizontalArrangement: ComposeHorizontalArrangement;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    cacheWindow: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    flingBehavior?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    verticalItemSpacing: number;
    horizontalArrangement: ComposeHorizontalArrangement;
    flingBehavior: ComposeFlingBehavior;
    overscrollEffect: ComposeOverscrollEffect | null;
    cacheWindow: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    userScrollEnabled?: never;
    }
  | {
    columns: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    verticalItemSpacing: number;
    horizontalArrangement: ComposeHorizontalArrangement;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect?: ComposeOverscrollEffect | null;
    cacheWindow: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    }
;
export const LazyVerticalStaggeredGrid = createComposableComponent<LazyVerticalStaggeredGridProps>({
  name: "LazyVerticalStaggeredGrid",
  props: ["columns","modifier","state","contentPadding","reverseLayout","verticalItemSpacing","horizontalArrangement","flingBehavior","userScrollEnabled","overscrollEffect","cacheWindow"],
  objectProps: ["columns","state","contentPadding","flingBehavior","overscrollEffect","cacheWindow"],
  children: true,
  overloads: [
    { id: "LazyVerticalStaggeredGrid", children: true, parameters: [["columns","object",false,false],["modifier","ComposeModifier",true,false],["state","object",true,false],["contentPadding","object",true,false],["reverseLayout","boolean",true,false],["verticalItemSpacing","number",true,false],["horizontalArrangement","string",true,false],["flingBehavior","object",true,false],["userScrollEnabled","boolean",true,false],["overscrollEffect","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,36,37,40,41,44,45,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,100,101,104,105,108,109,127,128,129,132,133,136,137,140,141,160,191,192,193,196,197,200,201,204,205,223,239,247,251,253,254,255] },
    { id: "LazyVerticalStaggeredGrid#1", children: true, parameters: [["columns","object",false,false],["modifier","ComposeModifier",true,false],["state","object",true,false],["contentPadding","object",true,false],["reverseLayout","boolean",true,false],["verticalItemSpacing","number",true,false],["horizontalArrangement","string",true,false],["flingBehavior","object",true,false],["userScrollEnabled","boolean",true,false],["overscrollEffect","object",true,true],["cacheWindow","object",true,false]], masks: [256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,320,321,322,323,324,325,326,327,328,329,330,331,332,333,334,335,383,447,479,495,503,507,509,510,511] },
  ],
});
