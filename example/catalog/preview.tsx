import { useEffect, useState, type ComponentType, type ReactNode } from "react";
import { Pressable, Text as RNText, type ViewStyle } from "react-native";
import {
  AnimatedVisibility, Box, Button, Column, DatePicker, DropdownMenuItem, ExposedDropdownMenuBox, FlexBox, FloatingActionButtonMenu, FlowColumn, FlowRow,
  Grid, HorizontalMultiBrowseCarousel, LazyColumn, LazyVerticalGrid, LazyVerticalStaggeredGrid, LookaheadScope,
  Icon, MaterialTheme, Modifier, MultiChoiceSegmentedButtonRow, NavigationBar, PrimaryTabRow, Row, SharedTransitionLayout,
  SingleChoiceSegmentedButtonRow, Surface, Tab, Text, TimePicker, TooltipBox,
  useBringIntoViewRequester, useFocusRequester, useInteractionSource, useLayoutBoundsHolder,
  usePullToRefreshState, useRangeSliderState, useSliderState,
  type ComposeChain,
} from "jetpack-compose-react-native";
import * as Compose from "jetpack-compose-react-native";

import { SampleTile, componentDemos, drawingSample } from "./demos";
import { palettes, previewSchemes, useCatalogPalette } from "./theme";

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

function materialize(value: unknown, handles: Handles, onEvent: (name: string, value?: unknown) => void, name: string): unknown {
  if (value === "$fn") return (payload?: unknown) => onEvent(name, payload);
  if (value === "$modifier") return Modifier;
  if (value === "$node") return <Text text="Preview content" />;
  if (value === "$interactionSource") return handles.interactionSource;
  if (value === "$sliderState") return handles.sliderState;
  if (value === "$rangeSliderState") return handles.rangeSliderState;
  if (value === "$pullToRefreshState") return handles.pullToRefreshState;
  if (value === "$layoutBoundsHolder") return handles.layoutBoundsHolder;
  if (value === "$focusRequester") return handles.focusRequester;
  if (value === "$bringIntoViewRequester") return handles.bringIntoViewRequester;
  if (Array.isArray(value)) return value.map((item) => materialize(item, handles, onEvent, name));
  if (value && typeof value === "object") {
    return Object.fromEntries(Object.entries(value).map(([key, item]) => [key, materialize(item, handles, onEvent, key)]));
  }
  return value;
}

function applyModifier(chain: ComposeChain, name: string, args: Record<string, unknown>) {
  const call = (chain as unknown as Record<string, (value?: object) => ComposeChain>)[name];
  return Object.keys(args).length === 0 ? call.call(chain) : call.call(chain, args);
}

function PreviewSurface({ children }: { children: ReactNode }) {
  const palette = useCatalogPalette();
  return (
    <MaterialTheme colorScheme={palette === palettes.dark ? previewSchemes.dark : previewSchemes.light}>
      <Surface color={palette.stage} contentColor={palette.ink}>{children}</Surface>
    </MaterialTheme>
  );
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

function componentHost(parent: string | null, child: ReactNode, sweeping: boolean) {
  switch (parent) {
    case "ExposedDropdownMenuBox":
      return <ExposedDropdownMenuBox expanded onExpandedChange={() => {}} style={previewStyle}>{child}</ExposedDropdownMenuBox>;
    case "FloatingActionButtonMenu":
      return <FloatingActionButtonMenu expanded button={<Text text="+" />} style={previewStyle}>{child}</FloatingActionButtonMenu>;
    case "NavigationBar":
      return <NavigationBar style={previewStyle}>{child}</NavigationBar>;
    case "TooltipBox":
      return (
        <TooltipBox positionProvider={{}} state={{ initiallyVisible: sweeping }} tooltip={child} style={previewStyle}>
          <SampleTile label="Hold for tooltip" />
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

const visibleModifierArgs: Record<string, Record<string, unknown>> = {
  absoluteOffset: { x: 24, y: 12 },
  absolutePadding: { left: 24, top: 12, right: 10, bottom: 8 },
  offset: { x: 24, y: 12 },
  padding: { start: 22, top: 16, end: 22, bottom: 16 },
  width: { width: 180 },
  height: { height: 80 },
  size: { size: 82 },
  widthIn: { min: 180 },
  heightIn: { min: 80 },
  sizeIn: { minWidth: 180, minHeight: 80 },
  defaultMinSize: { minWidth: 180, minHeight: 80 },
  requiredSize: { size: 82 },
  requiredHeight: { height: 80 },
  requiredWidth: { width: 180 },
  requiredHeightIn: { min: 80 },
  requiredWidthIn: { min: 180 },
  requiredSizeIn: { minWidth: 180, minHeight: 80 },
  graphicsLayer: { scaleX: 0.8, rotationZ: 12 },
  rotate: { degrees: 16 },
  clip: { shape: "circle" },
  drawBehind: { onDraw: drawingSample },
  drawWithCache: { onBuildDrawCache: { after: drawingSample.commands } },
  drawWithContent: { onDraw: { after: drawingSample.commands } },
  visible: { visible: false },
  zIndex: { zIndex: 1 },
  weight: { weight: 2 },
  pointerInput: { key1: "preview", block: { consume: "movement", onEvent: "$fn" } },
  pointerInteropFilter: { onTouchEvent: { actions: [0, 1, 2], onEvent: "$fn" } },
  scrollable: { state: { onDelta: "$fn" }, orientation: "horizontal" },
};

export function ModifierPreview({ spec, handles, sweeping }: { spec: ModifierFixture; handles: Handles; sweeping: boolean }) {
  const [event, setEvent] = useState("");
  const [expanded, setExpanded] = useState(false);
  const resize = spec.name === "animateContentSize";
  const scroll = spec.name === "verticalScroll" || spec.name === "horizontalScroll";
  const horizontal = spec.name === "horizontalScroll";
  const palette = useCatalogPalette();
  useEffect(() => {
    if (!resize || !sweeping) return;
    const step = setTimeout(() => setExpanded(true), 100);
    return () => clearTimeout(step);
  }, [resize, sweeping]);

  const args = materialize(visibleModifierArgs[spec.name] ?? spec.args, handles, setEvent, spec.name) as Record<string, unknown>;
  const applied = applyModifier(Modifier, spec.name, args);
  const sample = (chain: ComposeChain) => {
    if (spec.name === "weight") {
      return (
        <Row modifiers={Modifier.fillMaxWidth()}>
          <SampleTile label="First" modifiers={chain} />
          <SampleTile label="Second" tone={1} modifiers={Modifier.weight(1).padding({ start: 4 })} />
        </Row>
      );
    }
    if (spec.name === "zIndex") {
      return (
        <Box modifiers={Modifier.fillMaxWidth().height(82)}>
          <SampleTile label="First" modifiers={chain} />
          <SampleTile label="Second" tone={1} modifiers={Modifier.offset({ x: 26, y: 20 })} />
        </Box>
      );
    }
    if (scroll) {
      const Layout = horizontal ? Row : Column;
      return (
        <Layout modifiers={chain.fillMaxWidth().height(94)}>
          {Array.from({ length: 6 }, (_, index) => (
            <SampleTile key={index} label={`Item ${index + 1}`} tone={index} modifiers={Modifier.padding(4).width(104)} />
          ))}
        </Layout>
      );
    }
    return scopeHost(spec.scope, (
      <Box modifiers={chain.padding(6)} contentAlignment="center">
        <SampleTile label="Preview" modifiers={resize && expanded ? Modifier.height(68) : Modifier} />
      </Box>
    ));
  };

  return (
    <PreviewSurface>
      <Column modifiers={Modifier.fillMaxWidth()}>
        {resize && <Button onClick={() => setExpanded(!expanded)}><Text text={expanded ? "Shrink sample" : "Grow sample"} /></Button>}
        <Text text="Original" color={palette.muted} />
        <Box modifiers={Modifier.fillMaxWidth().height(126).clipToBounds()}>{sample(Modifier)}</Box>
        <Text text="With modifier" color={palette.muted} />
        <Box modifiers={Modifier.fillMaxWidth().height(126).clipToBounds()}>{sample(applied)}</Box>
        {event && <Text text={`Received ${event}`} />}
      </Column>
    </PreviewSurface>
  );
}

const overlays = new Set([
  "AlertDialog", "BasicAlertDialog", "DatePickerDialog", "Dialog", "DropdownMenu",
  "ExposedDropdownMenu", "ModalBottomSheet", "Popup", "TimePickerDialog",
]);
const collection = /^Lazy|Pager$|Carousel$/;
const icon = <Icon painter={{ icon: "Favorite" }} contentDescription="Favorite" />;

function overlayContent(name: string, close: () => void) {
  if (name === "DatePickerDialog") return <DatePicker state={{}} />;
  if (name === "TimePickerDialog") return <TimePicker state={{ initialHour: 9, initialMinute: 30 }} />;
  if (name === "DropdownMenu" || name === "ExposedDropdownMenu") {
    return ["Copy link", "Share"].map(label => (
      <DropdownMenuItem key={label} text={<Text text={label} />} onClick={close} />
    ));
  }
  return (
    <Surface shape={{ rect: { cornerRadius: 14 } }}>
      <Column modifiers={Modifier.padding(16)}>
        <Text text="Preview content" fontWeight="bold" />
        <Button onClick={close}><Text text="Close preview" /></Button>
      </Column>
    </Surface>
  );
}

export function ComponentPreview({ spec, handles, sweeping }: {
  spec: ComponentFixture; handles: Handles; sweeping: boolean;
}) {
  const demo = componentDemos[spec.name];
  return demo
    ? <PreviewSurface><demo.View sweeping={sweeping} /></PreviewSurface>
    : <FixturePreview spec={spec} handles={handles} sweeping={sweeping} />;
}

function FixturePreview({ spec, handles, sweeping }: {
  spec: ComponentFixture; handles: Handles; sweeping: boolean;
}) {
  const palette = useCatalogPalette();
  const [open, setOpen] = useState(sweeping);
  const [event, setEvent] = useState("");
  const [selected, setSelected] = useState(Boolean(spec.props.checked ?? spec.props.selected ?? spec.props.active ?? spec.props.expanded));
  const [tab, setTab] = useState(0);
  const close = () => setOpen(false);
  const isOverlay = overlays.has(spec.name);
  useEffect(() => {
    if (!isOverlay || !sweeping) return;
    const dismiss = setTimeout(() => setOpen(false), 500);
    return () => clearTimeout(dismiss);
  }, [isOverlay, sweeping]);

  const Preview = (Compose as unknown as Record<string, ComponentType<Record<string, unknown>>>)[spec.name];
  if (!Preview) throw new Error(`${spec.name} is not exported`);
  if (isOverlay && !open) {
    return (
      <Pressable accessibilityRole="button" onPress={() => setOpen(true)} style={{
        minHeight: 44, alignSelf: "flex-start", justifyContent: "center", paddingHorizontal: 16, paddingVertical: 8,
        backgroundColor: palette.accent, borderRadius: 12,
      }}>
        <RNText style={{ color: palette.accentText, fontWeight: "700" }}>Open {spec.name}</RNText>
      </Pressable>
    );
  }

  function onEvent(name: string, value?: unknown) {
    setEvent(name);
    if (name === "onClick") setSelected(previous => !previous);
    if (["onCheckedChange", "onExpandedChange"].includes(name) && typeof value === "boolean") setSelected(value);
  }

  const props: Record<string, unknown> = {};
  for (const [key, value] of Object.entries(spec.props)) {
    if (key !== "modifier") props[key] = materialize(value, handles, onEvent, key);
  }
  if ("modifier" in spec.props) props.modifiers = Modifier;
  for (const key of ["checked", "selected", "active", "expanded"]) {
    if (typeof props[key] === "boolean") props[key] = selected;
  }
  if (spec.name === "TriStateCheckbox") props.state = selected ? "on" : "indeterminate";
  if (spec.name === "ClickableText") props.text = { text: "Tap this text" };
  if (spec.name === "Icon") {
    delete props.active;
    props.painter = { icon: "Favorite" };
    props.contentDescription = "Favorite icon";
  }
  if (spec.name === "Tab") {
    props.text = <Text text="Favorites" />;
  }
  if (spec.name === "PrimaryIndicator") props.width = 96;
  if (/^(Horizontal|Vertical)FloatingToolbar$/.test(spec.name)) props.modifiers = Modifier.padding(4);
  if (spec.name === "Layout") props.measurePolicy = { height: 70, children: [{}, { horizontalBias: 1, verticalBias: 1 }] };

  for (const slot of spec.slots) props[slot] = slotContent(slot, tab, setTab);
  if ("selectedTabIndex" in props) props.selectedTabIndex = tab;
  if (isOverlay && "onDismissRequest" in props) props.onDismissRequest = close;
  if ("confirmButton" in props) props.confirmButton = <Button onClick={close}><Text text="Close preview" /></Button>;
  if (spec.name === "AlertDialog") {
    props.title = <Text text="Save this draft?" />;
    props.text = <Text text="Your edits will stay on this device." />;
  }

  const isCollection = collection.test(spec.name);
  if (isCollection) {
    props.modifiers = Modifier.fillMaxWidth().height(152);
    if ("preferredItemWidth" in props) props.preferredItemWidth = 112;
    if ("itemWidth" in props) props.itemWidth = 112;
  }
  if (spec.children || spec.name === "Layout") {
    const tile = <SampleTile label="Preview content" />;
    let content: ReactNode = tile;
    if (isOverlay) content = overlayContent(spec.name, close);
    else if (isCollection) content = Array.from({ length: 8 }, (_, index) => (
      <SampleTile key={index} label={`Item ${index + 1}`} tone={index} modifiers={
        /Horizontal|LazyRow|Carousel/.test(spec.name) ? Modifier.padding(4).width(100) : Modifier.fillMaxWidth().padding(4)
      } />
    ));
    else if (spec.name === "Layout") content = [<SampleTile key="start" label="Start" />, <SampleTile key="end" label="End" tone={1} />];
    else if (/Icon.*Button|^FloatingActionButton$/.test(spec.name)) content = icon;
    else if (/Button$/.test(spec.name)) content = <Text text="Save" />;
    else if (/TooltipBox$/.test(spec.name)) content = <SampleTile label="Hold for tooltip" />;
    else if (spec.name === "Snackbar") content = <Text text="Draft saved" />;
    else if (spec.name === "SelectionContainer" || spec.name === "DisableSelection") content = <Text text="Press and hold to test text selection." />;
    props.children = content;
  }
  if (/TooltipBox$/.test(spec.name)) props.state = { initiallyVisible: sweeping };

  return (
    <PreviewSurface>
      <Column modifiers={Modifier.fillMaxWidth()}>
        {componentHost(spec.parent, <Preview {...props} />, sweeping)}
        {event && <Text text={`Received ${event}`} />}
      </Column>
    </PreviewSurface>
  );
}

function slotContent(slot: string, tab: number, setTab: (value: number) => void): ReactNode {
  switch (slot) {
    case "title": return <Text text="Daily notes" />;
    case "headlineContent": return <Text text="Weekend plans" />;
    case "leadingIcon":
    case "trailingIcon":
    case "icon": return icon;
    case "tabs": return ["Today", "Archive"].map((label, index) => (
      <Tab key={label} selected={tab === index} onClick={() => setTab(index)} text={<Text text={label} />} />
    ));
    case "label": return <Text text="Favorites" />;
    case "placeholder": return <Text text="Type a note" />;
    case "sheetContent": return <SampleTile label="Sheet content" />;
    case "tooltip": return <Text text="More information" />;
    case "text": return <Text text="Save draft" />;
    default: return <Text text={slot.replace(/[A-Z]/g, letter => ` ${letter.toLowerCase()}`)} />;
  }
}
