import { useState, type ComponentType, type ReactNode } from "react";
import { Pressable, Text as RNText, type ViewStyle } from "react-native";
import {
  AnimatedVisibility, Badge, Box, Button, Column, ExposedDropdownMenuBox, FlexBox, FloatingActionButtonMenu, FlowColumn, FlowRow,
  Grid, HorizontalMultiBrowseCarousel, LazyColumn, LazyVerticalGrid, LazyVerticalStaggeredGrid, LookaheadScope,
  Modifier, MultiChoiceSegmentedButtonRow, NavigationBar, PrimaryTabRow, Row, SharedTransitionLayout,
  SingleChoiceSegmentedButtonRow, Tab, Text, TooltipBox,
  useBringIntoViewRequester, useFocusRequester, useInteractionSource, useLayoutBoundsHolder,
  usePullToRefreshState, useRangeSliderState, useSliderState,
  type ComposeChain,
} from "jetpack-compose-react-native";
import * as Compose from "jetpack-compose-react-native";

export interface ComponentFixture {
  name: string;
  overload: string | null;
  props: Record<string, unknown>;
  slots: string[];
  children: boolean;
  keyedChildren: boolean;
  parent: string | null;
}

export interface ModifierFixture {
  name: string;
  args: Record<string, unknown>;
  scope: string | null;
}

type Handles = ReturnType<typeof useCatalogHandles>;

const previewStyle: ViewStyle = { minHeight: 88 };

function materialize(value: unknown, handles: Handles): unknown {
  if (value === "$fn") return () => {};
  if (value === "$modifier") return Modifier;
  if (value === "$node") return <Text text="Sample" />;
  if (value === "$interactionSource") return handles.interactionSource;
  if (value === "$sliderState") return handles.sliderState;
  if (value === "$rangeSliderState") return handles.rangeSliderState;
  if (value === "$pullToRefreshState") return handles.pullToRefreshState;
  if (value === "$layoutBoundsHolder") return handles.layoutBoundsHolder;
  if (value === "$focusRequester") return handles.focusRequester;
  if (value === "$bringIntoViewRequester") return handles.bringIntoViewRequester;
  if (Array.isArray(value)) return value.map((item) => materialize(item, handles));
  if (value && typeof value === "object") {
    return Object.fromEntries(Object.entries(value).map(([key, item]) => [key, materialize(item, handles)]));
  }
  return value;
}

function applyModifier(chain: ComposeChain, name: string, args: Record<string, unknown>) {
  const call = (chain as unknown as Record<string, (value?: object) => ComposeChain>)[name];
  return Object.keys(args).length === 0 ? call.call(chain) : call.call(chain, args);
}

function frame(modifiers: ComposeChain) {
  return (
    <Box modifiers={modifiers}>
      <Text text="Sample" />
    </Box>
  );
}

function modifierChain(name: string, args: Record<string, unknown>, handles: Handles) {
  const base = Modifier.fillMaxWidth().height(52).background("#e6d9fb", { in: { rect: { cornerRadius: 10 } } });
  return applyModifier(base, name, materialize(args, handles) as Record<string, unknown>);
}

function scopeHost(scope: string | null, child: ReactNode) {
  switch (scope) {
    case "box":
      return <Box modifiers={Modifier.fillMaxWidth().height(88)} style={previewStyle}>{child}</Box>;
    case "row":
      return <Row modifiers={Modifier.fillMaxWidth().height(88)} style={previewStyle}>{child}</Row>;
    case "column":
      return <Column modifiers={Modifier.fillMaxWidth()} style={previewStyle}>{child}</Column>;
    case "flex":
      return <FlexBox config={{ direction: "row" }} style={previewStyle}>{child}</FlexBox>;
    case "flowRow":
      return <FlowRow modifiers={Modifier.fillMaxWidth()} style={previewStyle}>{child}</FlowRow>;
    case "flowColumn":
      return <FlowColumn modifiers={Modifier.fillMaxWidth().height(120)} style={previewStyle}>{child}</FlowColumn>;
    case "grid":
      return <Grid config={{ columns: ["auto", "auto"], rows: ["auto"] }} style={previewStyle}>{child}</Grid>;
    case "lazy":
      return <LazyColumn modifiers={Modifier.fillMaxWidth().height(120)} style={previewStyle}>{child}</LazyColumn>;
    case "lazyGrid":
      return <LazyVerticalGrid columns={{ count: 2 }} modifiers={Modifier.fillMaxWidth().height(120)} style={previewStyle}>{child}</LazyVerticalGrid>;
    case "lazyStaggered":
      return <LazyVerticalStaggeredGrid columns={{ count: 2 }} modifiers={Modifier.fillMaxWidth().height(120)} style={previewStyle}>{child}</LazyVerticalStaggeredGrid>;
    case "menu":
      return <ExposedDropdownMenuBox expanded onExpandedChange={() => {}} style={previewStyle}>{child}</ExposedDropdownMenuBox>;
    case "tab":
      return (
        <PrimaryTabRow
          selectedTabIndex={0}
          tabs={<Tab selected onClick={() => {}} text={<Text text="Tab" />} />}
          indicator={child}
          style={previewStyle}
        />
      );
    case "carousel":
      return (
        <HorizontalMultiBrowseCarousel state={{}} preferredItemWidth={140} modifiers={Modifier.fillMaxWidth().height(120)} style={previewStyle}>
          {child}
        </HorizontalMultiBrowseCarousel>
      );
    case "visibility":
      return <AnimatedVisibility visible style={previewStyle}>{child}</AnimatedVisibility>;
    case "lookahead":
      return <LookaheadScope style={previewStyle}>{child}</LookaheadScope>;
    case "shared":
      return (
        <SharedTransitionLayout style={previewStyle}>
          <AnimatedVisibility visible>{child}</AnimatedVisibility>
        </SharedTransitionLayout>
      );
    default:
      return <Box style={previewStyle}>{child}</Box>;
  }
}

function componentHost(parent: string | null, child: ReactNode) {
  switch (parent) {
    case "ExposedDropdownMenuBox":
      return <ExposedDropdownMenuBox expanded onExpandedChange={() => {}} style={previewStyle}>{child}</ExposedDropdownMenuBox>;
    case "FloatingActionButtonMenu":
      return <FloatingActionButtonMenu expanded button={<Text text="+" />} style={previewStyle}>{child}</FloatingActionButtonMenu>;
    case "NavigationBar":
      return <NavigationBar style={previewStyle}>{child}</NavigationBar>;
    case "TooltipBox":
      return (
        <TooltipBox positionProvider={{}} state={{}} tooltip={child} style={previewStyle}>
          <Text text="Anchor" />
        </TooltipBox>
      );
    case "MultiChoiceSegmentedButtonRow":
      return <MultiChoiceSegmentedButtonRow style={previewStyle}>{child}</MultiChoiceSegmentedButtonRow>;
    case "SingleChoiceSegmentedButtonRow":
      return <SingleChoiceSegmentedButtonRow style={previewStyle}>{child}</SingleChoiceSegmentedButtonRow>;
    default:
      return child;
  }
}

export function useCatalogHandles() {
  return {
    interactionSource: useInteractionSource(),
    sliderState: useSliderState({ initialValue: 0.4 }),
    rangeSliderState: useRangeSliderState({ initialRange: [0.2, 0.8] }),
    pullToRefreshState: usePullToRefreshState(),
    layoutBoundsHolder: useLayoutBoundsHolder(),
    focusRequester: useFocusRequester(),
    bringIntoViewRequester: useBringIntoViewRequester(),
  };
}

export function ModifierPreview({ spec, handles }: { spec: ModifierFixture; handles: Handles }) {
  const chain = modifierChain(spec.name, spec.args, handles);
  return scopeHost(spec.scope, frame(chain));
}

const overlays = new Set([
  "AlertDialog", "BasicAlertDialog", "DatePickerDialog", "Dialog", "DropdownMenu",
  "ExposedDropdownMenu", "ModalBottomSheet", "Popup", "TimePickerDialog",
]);

export function ComponentPreview({ spec, handles, sweeping }: {
  spec: ComponentFixture; handles: Handles; sweeping: boolean;
}) {
  const [open, setOpen] = useState(false);
  const close = () => setOpen(false);
  const isOverlay = overlays.has(spec.name);
  const Preview = (Compose as unknown as Record<string, ComponentType<Record<string, unknown>>>)[spec.name];
  if (!Preview) throw new Error(`${spec.name} is not exported`);
  if (isOverlay && !sweeping && !open) {
    return <Pressable accessibilityRole="button" onPress={() => setOpen(true)}><RNText>Open {spec.name}</RNText></Pressable>;
  }
  const props: Record<string, unknown> = {};
  for (const [key, value] of Object.entries(spec.props)) {
    if (key === "modifier") continue;
    props[key] = materialize(value, handles);
  }
  if ("modifier" in spec.props) props.modifiers = Modifier;
  for (const slot of spec.slots) props[slot] = <Text text={slot} />;
  const closeButton = <Button onClick={close}><Text text="Close preview" /></Button>;
  if (isOverlay && "onDismissRequest" in props) props.onDismissRequest = close;
  if ("confirmButton" in props) props.confirmButton = closeButton;
  if (spec.name === "BadgedBox") props.badge = <Badge />;
  if (spec.children) {
    const label = <Text key="0" text={spec.name} />;
    props.children = isOverlay ? closeButton : spec.keyedChildren ? [label, <Text key="1" text="Next" />] : label;
  }
  const element = <Preview {...props} style={spec.parent ? undefined : previewStyle} />;
  return componentHost(spec.parent, element);
}
