import { useCallback, useId, useMemo, useState } from "react";

type HandleCommand<Operation extends string> = { revision: number; operation: Operation };

type NativeHandle<Kind extends string, Operation extends string> = {
  readonly kind: Kind;
  readonly token: string;
  readonly command?: HandleCommand<Operation>;
};

function useNativeHandle<Kind extends string, Operation extends string>(kind: Kind) {
  const token = useId();
  const [command, setCommand] = useState<HandleCommand<Operation>>();
  const send = useCallback((operation: Operation) => {
    setCommand(previous => ({ revision: (previous?.revision ?? 0) + 1, operation }));
  }, []);
  const value = useMemo<NativeHandle<Kind, Operation>>(() => ({ kind, token, command }), [kind, token, command]);
  return [value, send] as const;
}

type FocusCommand = "request" | "capture" | "free";
export type ComposeFocusRequester = NativeHandle<"focusRequester", FocusCommand> & {
  requestFocus(): void;
  captureFocus(): void;
  freeFocus(): void;
};

/** Pass the current handle to Modifier.focusRequester before the focus target. */
export function useFocusRequester(): ComposeFocusRequester {
  const [value, send] = useNativeHandle<"focusRequester", FocusCommand>("focusRequester");
  return useMemo(() => ({
    ...value,
    requestFocus: () => send("request"),
    captureFocus: () => send("capture"),
    freeFocus: () => send("free"),
  }), [value, send]);
}

export type ComposeBringIntoViewRequester = NativeHandle<"bringIntoViewRequester", "bringIntoView"> & {
  bringIntoView(): void;
};

/** Pass the current handle to Modifier.bringIntoViewRequester on a scrollable descendant. */
export function useBringIntoViewRequester(): ComposeBringIntoViewRequester {
  const [value, send] = useNativeHandle<"bringIntoViewRequester", "bringIntoView">("bringIntoViewRequester");
  return useMemo(() => ({ ...value, bringIntoView: () => send("bringIntoView") }), [value, send]);
}

export type ComposeInteractionSource = NativeHandle<"interactionSource", never>;

/** Share one native interaction source between modifiers and components in a Compose host. */
export function useInteractionSource(): ComposeInteractionSource {
  return useHandleToken("interactionSource");
}

export type ComposeLayoutBoundsHolder = NativeHandle<"layoutBoundsHolder", never>;
export type ComposePullToRefreshState = NativeHandle<"pullToRefreshState", never>;

export type ComposeSliderOptions = {
  initialValue?: number;
  valueRange?: readonly [number, number];
  steps?: number;
};
export type ComposeSliderState = NativeHandle<"sliderState", never> & ComposeSliderOptions;
export type ComposeRangeSliderOptions = {
  initialRange?: readonly [number, number];
  valueRange?: readonly [number, number];
  steps?: number;
};
export type ComposeRangeSliderState = NativeHandle<"rangeSliderState", never> & ComposeRangeSliderOptions;

function useHandleToken<Kind extends string>(kind: Kind): NativeHandle<Kind, never> {
  const token = useId();
  return useMemo(() => ({ kind, token }), [kind, token]);
}

/** Attach the same holder to a viewport and the visibility observer, within one host. */
export function useLayoutBoundsHolder(): ComposeLayoutBoundsHolder {
  return useHandleToken("layoutBoundsHolder");
}

/** Share pull-to-refresh state between a gesture modifier and its indicator. */
export function usePullToRefreshState(): ComposePullToRefreshState {
  return useHandleToken("pullToRefreshState");
}

/** The initial options are applied when the native state first mounts. */
export function useSliderState(options: ComposeSliderOptions = {}): ComposeSliderState {
  const handle = useHandleToken("sliderState");
  return { ...handle, ...options };
}

/** The initial options are applied when the native state first mounts. */
export function useRangeSliderState(options: ComposeRangeSliderOptions = {}): ComposeRangeSliderState {
  const handle = useHandleToken("rangeSliderState");
  return { ...handle, ...options };
}
