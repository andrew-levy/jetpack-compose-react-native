// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeFlingBehavior, ComposeGridCells, ComposeLazyState, ComposeOverscrollEffect, ComposePaddingValues } from "../../utils/composeValues";
import type { ComposeLazyLayoutCacheWindowValue } from "../values/records";
import type { ComposeVerticalArrangement } from "../values/enums";

export type LazyHorizontalStaggeredGridProps =
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state?: ComposeLazyState;
    reverseLayout?: boolean;
    horizontalItemSpacing?: number;
    userScrollEnabled?: boolean;
    overscrollEffect?: ComposeOverscrollEffect | null;
    children?: ReactNode;
    contentPadding?: never;
    verticalArrangement?: never;
    flingBehavior?: never;
    cacheWindow?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    flingBehavior: ComposeFlingBehavior;
    overscrollEffect?: ComposeOverscrollEffect | null;
    children?: ReactNode;
    state?: never;
    contentPadding?: never;
    reverseLayout?: never;
    verticalArrangement?: never;
    horizontalItemSpacing?: never;
    userScrollEnabled?: never;
    cacheWindow?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    children?: ReactNode;
    state?: never;
    contentPadding?: never;
    reverseLayout?: never;
    verticalArrangement?: never;
    horizontalItemSpacing?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    horizontalItemSpacing: number;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled?: boolean;
    children?: ReactNode;
    state?: never;
    contentPadding?: never;
    reverseLayout?: never;
    verticalArrangement?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state?: ComposeLazyState;
    reverseLayout?: boolean;
    verticalArrangement: ComposeVerticalArrangement;
    horizontalItemSpacing?: number;
    userScrollEnabled?: boolean;
    children?: ReactNode;
    contentPadding?: never;
    flingBehavior?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    reverseLayout: boolean;
    horizontalItemSpacing?: number;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled?: boolean;
    children?: ReactNode;
    state?: never;
    contentPadding?: never;
    verticalArrangement?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding: ComposePaddingValues;
    reverseLayout?: boolean;
    verticalArrangement?: ComposeVerticalArrangement;
    horizontalItemSpacing?: number;
    userScrollEnabled?: boolean;
    children?: ReactNode;
    state?: never;
    flingBehavior?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    verticalArrangement: ComposeVerticalArrangement;
    horizontalItemSpacing: number;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    children?: ReactNode;
    state?: never;
    cacheWindow?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    reverseLayout?: boolean;
    horizontalItemSpacing?: number;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled?: boolean;
    children?: ReactNode;
    contentPadding?: never;
    verticalArrangement?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    reverseLayout: boolean;
    verticalArrangement: ComposeVerticalArrangement;
    horizontalItemSpacing: number;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    children?: ReactNode;
    contentPadding?: never;
    cacheWindow?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    verticalArrangement?: ComposeVerticalArrangement;
    horizontalItemSpacing?: number;
    userScrollEnabled?: boolean;
    children?: ReactNode;
    reverseLayout?: never;
    flingBehavior?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    verticalArrangement: ComposeVerticalArrangement;
    horizontalItemSpacing: number;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    children?: ReactNode;
    reverseLayout?: never;
    cacheWindow?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    horizontalItemSpacing?: number;
    userScrollEnabled?: boolean;
    children?: ReactNode;
    verticalArrangement?: never;
    flingBehavior?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    horizontalItemSpacing: number;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    children?: ReactNode;
    verticalArrangement?: never;
    cacheWindow?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    verticalArrangement: ComposeVerticalArrangement;
    userScrollEnabled?: boolean;
    children?: ReactNode;
    horizontalItemSpacing?: never;
    flingBehavior?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    verticalArrangement: ComposeVerticalArrangement;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    children?: ReactNode;
    horizontalItemSpacing?: never;
    cacheWindow?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    verticalArrangement: ComposeVerticalArrangement;
    horizontalItemSpacing: number;
    children?: ReactNode;
    flingBehavior?: never;
    userScrollEnabled?: never;
    overscrollEffect?: never;
    cacheWindow?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    verticalArrangement: ComposeVerticalArrangement;
    horizontalItemSpacing: number;
    flingBehavior?: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect?: ComposeOverscrollEffect | null;
    children?: ReactNode;
    cacheWindow?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    verticalArrangement: ComposeVerticalArrangement;
    horizontalItemSpacing: number;
    flingBehavior: ComposeFlingBehavior;
    overscrollEffect: ComposeOverscrollEffect | null;
    children?: ReactNode;
    userScrollEnabled?: never;
    cacheWindow?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state?: ComposeLazyState;
    contentPadding?: ComposePaddingValues;
    reverseLayout?: boolean;
    horizontalItemSpacing?: number;
    userScrollEnabled?: boolean;
    cacheWindow: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    verticalArrangement?: never;
    flingBehavior?: never;
    overscrollEffect?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    verticalArrangement: ComposeVerticalArrangement;
    horizontalItemSpacing: number;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    cacheWindow: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    state?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    reverseLayout: boolean;
    verticalArrangement: ComposeVerticalArrangement;
    horizontalItemSpacing: number;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    cacheWindow: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    contentPadding?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    verticalArrangement: ComposeVerticalArrangement;
    horizontalItemSpacing: number;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    cacheWindow: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    reverseLayout?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    horizontalItemSpacing: number;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    cacheWindow: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    verticalArrangement?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    verticalArrangement: ComposeVerticalArrangement;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    cacheWindow: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    horizontalItemSpacing?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    verticalArrangement: ComposeVerticalArrangement;
    horizontalItemSpacing: number;
    userScrollEnabled: boolean;
    overscrollEffect: ComposeOverscrollEffect | null;
    cacheWindow: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    flingBehavior?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    verticalArrangement: ComposeVerticalArrangement;
    horizontalItemSpacing: number;
    flingBehavior: ComposeFlingBehavior;
    overscrollEffect: ComposeOverscrollEffect | null;
    cacheWindow: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    userScrollEnabled?: never;
    }
  | {
    rows: ComposeGridCells;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeLazyState;
    contentPadding: ComposePaddingValues;
    reverseLayout: boolean;
    verticalArrangement: ComposeVerticalArrangement;
    horizontalItemSpacing: number;
    flingBehavior: ComposeFlingBehavior;
    userScrollEnabled: boolean;
    overscrollEffect?: ComposeOverscrollEffect | null;
    cacheWindow: ComposeLazyLayoutCacheWindowValue;
    children?: ReactNode;
    }
;
export const LazyHorizontalStaggeredGrid = createComposableComponent<LazyHorizontalStaggeredGridProps>({
  name: "LazyHorizontalStaggeredGrid",
  props: ["rows","modifier","state","contentPadding","reverseLayout","verticalArrangement","horizontalItemSpacing","flingBehavior","userScrollEnabled","overscrollEffect","cacheWindow"],
  objectProps: ["rows","state","contentPadding","flingBehavior","overscrollEffect","cacheWindow"],
  children: true,
  overloads: [
    { id: "LazyHorizontalStaggeredGrid", children: true, parameters: [["rows","object",false,false],["modifier","ComposeModifier",true,false],["state","object",true,false],["contentPadding","object",true,false],["reverseLayout","boolean",true,false],["verticalArrangement","string",true,false],["horizontalItemSpacing","number",true,false],["flingBehavior","object",true,false],["userScrollEnabled","boolean",true,false],["overscrollEffect","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,36,37,48,49,52,53,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,100,101,112,113,116,117,127,128,129,132,133,144,145,148,149,160,191,192,193,196,197,208,209,212,213,223,239,247,251,253,254,255] },
    { id: "LazyHorizontalStaggeredGrid#1", children: true, parameters: [["rows","object",false,false],["modifier","ComposeModifier",true,false],["state","object",true,false],["contentPadding","object",true,false],["reverseLayout","boolean",true,false],["verticalArrangement","string",true,false],["horizontalItemSpacing","number",true,false],["flingBehavior","object",true,false],["userScrollEnabled","boolean",true,false],["overscrollEffect","object",true,true],["cacheWindow","object",true,false]], masks: [256,257,258,259,260,261,262,263,272,273,274,275,276,277,278,279,320,321,322,323,324,325,326,327,336,337,338,339,340,341,342,343,383,447,479,495,503,507,509,510,511] },
  ],
});
