import { useEffect, useState, type ComponentType, type ReactNode } from "react";
import {
  AnimatedContent, AnimatedVisibility, Badge, BadgedBox, Box, BoxWithConstraints, Button, Canvas,
  CircularProgressIndicator, Column, Crossfade, Divider, FlexBox, FlowColumn, FlowRow, Grid, Icon, Image,
  HorizontalDivider, LinearProgressIndicator, Modifier, RangeSlider, Row, Scaffold, Slider, SnackbarHost, Spacer, Text, VerticalDivider,
  type ComposeChain, type ComposeDrawing, type ComposeFloatRange,
} from "jetpack-compose-react-native";

import { useCatalogPalette } from "./theme";

type DemoProps = { sweeping: boolean };
type ComponentDemo = { View: ComponentType<DemoProps>; instruction: string };
const region = Modifier.fillMaxWidth();
const rounded = { rect: { cornerRadius: 12 } };

export function SampleTile({ label, tone = 0, modifiers = Modifier }: {
  label: string; tone?: number; modifiers?: ComposeChain;
}) {
  const colors = useCatalogPalette();
  return (
    <Box
      modifiers={modifiers.background(colors.swatches[tone % colors.swatches.length], { in: rounded }).padding(12)}
      contentAlignment="center"
    >
      <Text text={label} color={colors.ink} fontWeight="bold" />
    </Box>
  );
}

function StackDemo({ axis }: { axis: "vertical" | "horizontal" }) {
  const children = ["First", "Second", "Third"].map((label, index) => (
    <SampleTile key={label} label={label} tone={index} modifiers={axis === "vertical" ? region.padding("vertical", 4) : Modifier} />
  ));
  return axis === "vertical"
    ? <Column modifiers={region}>{children}</Column>
    : <Row modifiers={region} horizontalArrangement="spaceEvenly">{children}</Row>;
}

function BoxDemo() {
  const colors = useCatalogPalette();
  return (
    <Box modifiers={region.height(116)} contentAlignment="center">
      <Box modifiers={region.height(116).background(colors.raised, { in: rounded })} />
      <SampleTile label="Centered on top" tone={1} />
    </Box>
  );
}

function ConstraintsDemo() {
  return (
    <BoxWithConstraints modifiers={Modifier.widthIn({ max: 240 })}>
      <SampleTile label="Up to 240 dp wide" modifiers={region} tone={1} />
    </BoxWithConstraints>
  );
}

function FlowDemo({ axis }: { axis: "vertical" | "horizontal" }) {
  const items = ["One", "Two", "Three", "Four", "Five"].map((label, index) =>
    <SampleTile key={label} label={label} tone={index} modifiers={Modifier.padding(4)} />);
  return axis === "horizontal" ? (
    <FlowRow modifiers={region}
      maxItemsInEachRow={3}>{items}</FlowRow>
  ) : (
    <FlowColumn modifiers={region.height(148)}
      maxItemsInEachColumn={3}>{items}</FlowColumn>
  );
}

function GridDemo() {
  return (
    <Grid config={{ columns: ["auto", "auto"], rows: ["auto", "auto"] }} modifiers={region}>
      {["One", "Two", "Three", "Four"].map((label, index) =>
        <SampleTile key={label} label={label} modifiers={Modifier.padding(4)} tone={index} />)}
    </Grid>
  );
}

function FlexDemo() {
  return (
    <FlexBox config={{ direction: "row", wrap: "wrap" }} modifiers={region}>
      {["One", "Two", "Three", "Four", "Five"].map((label, index) =>
        <SampleTile key={label} label={label} tone={index} modifiers={Modifier.padding(4).width(84)} />)}
    </FlexBox>
  );
}

function SpacerDemo() {
  return (
    <Column modifiers={region}>
      <SampleTile label="Above" modifiers={region} />
      <Spacer modifiers={Modifier.height(32)} />
      <SampleTile label="Below" tone={1} modifiers={region} />
    </Column>
  );
}

function VisibilityDemo({ sweeping }: DemoProps) {
  const [visible, setVisible] = useState(false);
  useEffect(() => {
    if (!sweeping) return;
    const show = setTimeout(() => setVisible(true), 100);
    const hide = setTimeout(() => setVisible(false), 430);
    return () => {
      clearTimeout(show);
      clearTimeout(hide);
    };
  }, [sweeping]);

  return (
    <Column modifiers={region}>
      <Button onClick={() => setVisible(!visible)}><Text text={visible ? "Hide panel" : "Show panel"} /></Button>
      <Box modifiers={region.height(70)}>
        <AnimatedVisibility visible={visible}>
          <SampleTile label="Visibility panel" modifiers={region} />
        </AnimatedVisibility>
      </Box>
    </Column>
  );
}

function TransitionDemo({ sweeping, fade }: DemoProps & { fade: boolean }) {
  const [alternate, setAlternate] = useState(false);
  useEffect(() => {
    if (!sweeping) return;
    const step = setTimeout(() => setAlternate(true), 100);
    return () => clearTimeout(step);
  }, [sweeping]);
  const children = [
    <SampleTile key="day" label="Day shift" modifiers={region} />,
    <SampleTile key="night" label="Night shift" tone={1} modifiers={region} />,
  ];
  const targetState = alternate ? "night" : "day";
  return (
    <Column modifiers={region}>
      <Button onClick={() => setAlternate(!alternate)}><Text text="Switch shift" /></Button>
      {fade
        ? <Crossfade targetState={targetState} animationSpec={{ type: "tween", durationMillis: 400 }}>{children}</Crossfade>
        : <AnimatedContent targetState={targetState}
          transitionSpec={{ enter: { type: "slide", direction: "right" }, exit: { type: "fade" } }}>{children}</AnimatedContent>}
    </Column>
  );
}

function SliderDemo({ range }: { range: boolean }) {
  const [value, setValue] = useState(0.4);
  const [bounds, setBounds] = useState<ComposeFloatRange>([0.2, 0.8]);
  const percentage = (amount: number) => `${Math.round(amount * 100)}%`;
  return (
    <Column modifiers={region}>
      <Text text={range ? `${percentage(bounds[0])} – ${percentage(bounds[1])}` : percentage(value)} />
      {range
        ? <RangeSlider value={bounds} onValueChange={setBounds} modifiers={region} />
        : <Slider value={value} onValueChange={setValue} modifiers={region} />}
    </Column>
  );
}

function ProgressDemo({ sweeping, circular }: DemoProps & { circular: boolean }) {
  const [progress, setProgress] = useState(0.25);
  const advance = () => setProgress(value => value === 1 ? 0.25 : Math.min(1, value + 0.25));
  useEffect(() => {
    if (!sweeping) return;
    const step = setTimeout(() => setProgress(0.75), 120);
    return () => clearTimeout(step);
  }, [sweeping]);
  return (
    <Column modifiers={region}>
      <Text text={`${Math.round(progress * 100)}% complete`} />
      {circular
        ? <CircularProgressIndicator progress={progress} modifiers={Modifier.size(52)} />
        : <LinearProgressIndicator progress={progress} modifiers={region} />}
      <Button onClick={advance}><Text text={progress === 1 ? "Reset progress" : "Advance progress"} /></Button>
    </Column>
  );
}

export const drawingSample: ComposeDrawing = {
  commands: [
    { type: "rect", color: "#316C53", x: 12, y: 14, width: 48, height: 48, cornerRadius: 10 },
    { type: "circle", color: "#E9AA57", center: { x: 92, y: 38 }, radius: 23 },
    { type: "line", color: "#487E9C", start: { x: 128, y: 58 }, end: { x: 180, y: 18 }, strokeWidth: 5 },
  ],
};

function CanvasDemo() {
  return <Canvas modifiers={region.height(82)} onDraw={drawingSample} />;
}

function BadgeDemo({ anchor }: { anchor: boolean }) {
  const unread = <Badge content={<Text text="3" />} />;
  return anchor
    ? <Box modifiers={Modifier.padding(12)}>
        <BadgedBox badge={unread}><Icon painter={{ icon: "Notifications" }} contentDescription="Notifications" /></BadgedBox>
      </Box>
    : <Row verticalAlignment="centerVertically">
        <Text text="Unread messages" />{unread}
      </Row>;
}

function ImageDemo() {
  const colors = useCatalogPalette();
  return (
    <Row verticalAlignment="centerVertically">
      <Image painter={{ color: colors.accent }} contentDescription="Green color swatch" modifiers={Modifier.size(54).clip("circle")} />
      <Text text="Color painter clipped to a circle" />
    </Row>
  );
}

function DividerDemo({ vertical, legacy = false }: { vertical: boolean; legacy?: boolean }) {
  const Horizontal = legacy ? Divider : HorizontalDivider;
  const separator = vertical
    ? <VerticalDivider modifiers={Modifier.height(64).padding("horizontal", 10)} />
    : <Horizontal modifiers={region.padding("vertical", 10)} />;
  const Arrangement = vertical ? Row : Column;
  return (
    <Arrangement modifiers={region}>
      <SampleTile label={vertical ? "Start" : "Above"} modifiers={vertical ? Modifier : region} />
      {separator}
      <SampleTile label={vertical ? "End" : "Below"} tone={1} modifiers={vertical ? Modifier : region} />
    </Arrangement>
  );
}

function ScaffoldDemo() {
  const colors = useCatalogPalette();
  return (
    <Scaffold modifiers={region.height(192)} contentWindowInsets={{}}
      topBar={<Text text="Notebook" modifiers={region.background(colors.raised).padding(12)} fontWeight="bold" />}
      bottomBar={<Text text="2 notes" modifiers={region.background(colors.raised).padding(12)} />}
    >
      <SampleTile label="Note contents" modifiers={region.padding(12)} />
    </Scaffold>
  );
}

function SnackbarHostDemo({ sweeping }: DemoProps) {
  const [show, setShow] = useState(sweeping);
  return (
    <Column modifiers={region}>
      <Button onClick={() => setShow(!show)}><Text text={show ? "Reset snackbar" : "Show snackbar"} /></Button>
      <SnackbarHost hostState={show ? { message: "Draft saved" } : {}} />
    </Column>
  );
}

export const componentDemos: Partial<Record<string, ComponentDemo>> = {
  AnimatedVisibility: { View: VisibilityDemo, instruction: "Tap Show panel and Hide panel to watch the enter and exit transitions." },
  AnimatedContent: { View: props => <TransitionDemo {...props} fade={false} />, instruction: "Switch between the day and night cards to see the content transition." },
  Crossfade: { View: props => <TransitionDemo {...props} fade />, instruction: "Switch shifts to fade from one card to the other." },
  Box: { View: BoxDemo, instruction: "A centered card is drawn over the background inside the same Box." },
  BoxWithConstraints: { View: ConstraintsDemo, instruction: "The child fills the width available inside its parent’s 240 dp limit." },
  Column: { View: () => <StackDemo axis="vertical" />, instruction: "Three children stack top to bottom with equal spacing." },
  Row: { View: () => <StackDemo axis="horizontal" />, instruction: "Three children sit side by side with equal space around them." },
  FlowRow: { View: () => <FlowDemo axis="horizontal" />, instruction: "Cards flow from left to right, then wrap onto a second row." },
  FlowColumn: { View: () => <FlowDemo axis="vertical" />, instruction: "Cards flow from top to bottom, then wrap into a second column." },
  Grid: { View: GridDemo, instruction: "Four tiles fill two rows and two columns." },
  FlexBox: { View: FlexDemo, instruction: "Cards wrap when they run out of horizontal room." },
  Spacer: { View: SpacerDemo, instruction: "The 32 dp Spacer leaves an empty gap between the cards." },
  Slider: { View: () => <SliderDemo range={false} />, instruction: "Drag the thumb and check that the percentage follows it." },
  RangeSlider: { View: () => <SliderDemo range />, instruction: "Drag either thumb and check the two displayed endpoints." },
  LinearProgressIndicator: { View: props => <ProgressDemo {...props} circular={false} />, instruction: "Advance progress and check that the bar fills by a quarter." },
  CircularProgressIndicator: { View: props => <ProgressDemo {...props} circular />, instruction: "Advance progress and check that the arc fills by a quarter." },
  Canvas: { View: CanvasDemo, instruction: "The canvas draws a rounded rectangle, a circle, and a diagonal line." },
  Badge: { View: () => <BadgeDemo anchor={false} />, instruction: "A badge shows the unread count alongside its label." },
  BadgedBox: { View: () => <BadgeDemo anchor />, instruction: "The unread count sits at the corner of the notification icon." },
  Divider: { View: () => <DividerDemo vertical={false} legacy />, instruction: "A line separates the two rows." },
  HorizontalDivider: { View: () => <DividerDemo vertical={false} />, instruction: "A line separates the two rows." },
  VerticalDivider: { View: () => <DividerDemo vertical />, instruction: "A vertical line separates the two cards." },
  Scaffold: { View: ScaffoldDemo, instruction: "The scaffold keeps the top bar, body, and bottom bar in their own slots." },
  SnackbarHost: { View: SnackbarHostDemo, instruction: "Tap Show snackbar to display the message in its host." },
  Image: { View: ImageDemo, instruction: "The image displays a native color painter with a circular clip." },
};
