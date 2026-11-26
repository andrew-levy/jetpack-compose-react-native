import { createContext, useContext, useState, type ReactNode } from "react";
import {
  AnimatedContent, AnimatedVisibility, Box, Button, Card, CircularWavyProgressIndicator, Column, FilledIconButton,
  FilledTonalIconButton, Icon, LazyColumn, LazyRow, LinearWavyProgressIndicator, LoadingIndicator, Modifier, Row,
  SegmentedButton, SegmentedListItem, SingleChoiceSegmentedButtonRow, Slider, Spacer, Switch, Text,
  type ComposeListItemColorsValue, type ComposeMaterialShape, type ComposeShape,
} from "jetpack-compose-react-native";

import { groupShape, palettes, radius, type Palette } from "./theme";

export const PaletteContext = createContext<Palette>(palettes.light);
export const usePalette = () => useContext(PaletteContext);

const fill = Modifier.fillMaxWidth();
const gap = (size: number) => <Spacer modifiers={Modifier.height(size)} />;
const hgap = (size: number) => <Spacer modifiers={Modifier.width(size)} />;
const outlined = (name: string) => ({ icon: name, style: "outlined" as const });

/* Shared pieces ------------------------------------------------------------------------------- */

export function SectionTitle({ title, detail }: { title: string; detail?: string }) {
  const p = usePalette();
  return (
    <Row modifiers={fill.padding({ start: 4, end: 4, top: 32, bottom: 12 })} horizontalArrangement="spaceBetween">
      <Text text={title} fontSize={15} fontWeight="medium" color={p.muted} />
      {detail ? <Text text={detail} fontSize={15} color={p.muted} /> : null}
    </Row>
  );
}

export function Panel({ children }: { children: ReactNode }) {
  const p = usePalette();
  return <Column modifiers={fill.clip(radius(28)).background(p.card).padding(20)}>{children}</Column>;
}

/** Every ListItem color slot, filled from the palette so grouped rows sit on a card-coloured surface. */
function listColors(p: Palette): ComposeListItemColorsValue {
  const slots = { containerColor: p.card, contentColor: p.ink, leadingContentColor: p.ink, trailingContentColor: p.muted,
    overlineContentColor: p.muted, supportingContentColor: p.muted };
  const colors: Record<string, string> = {};
  for (const state of ["", "disabled", "selected", "dragged"]) {
    for (const [slot, color] of Object.entries(slots)) {
      colors[state ? state + slot[0].toUpperCase() + slot.slice(1) : slot] = color;
    }
  }
  return colors as ComposeListItemColorsValue;
}

export type Item = { title: string; detail?: string; glyph: string; trailing?: ReactNode; onClick?: () => void };

export function Group({ rows }: { rows: Item[] }) {
  const colors = listColors(usePalette());
  return (
    <Column modifiers={fill}>
      {rows.map((row, index) => {
        const shape = groupShape(index, rows.length);
        return (
          <Column key={row.title} modifiers={fill}>
            {index > 0 ? gap(2) : null}
            <SegmentedListItem
              modifiers={row.onClick ? fill.clip(shape).clickable(row.onClick) : fill}
              colors={colors}
              shapes={{ shape, selectedShape: shape, pressedShape: shape, focusedShape: shape, hoveredShape: shape, draggedShape: shape }}
              leadingContent={<Icon painter={outlined(row.glyph)} contentDescription={null} />}
              supportingContent={row.detail ? <Text text={row.detail} /> : undefined}
              trailingContent={row.trailing}
            >
              <Text text={row.title} />
            </SegmentedListItem>
          </Column>
        );
      })}
    </Column>
  );
}

export function Screen({ children }: { children: ReactNode }) {
  return (
    <LazyColumn modifiers={Modifier.fillMaxSize()} contentPadding={{ start: 20, end: 20, top: 8, bottom: 40 }}>
      {children}
    </LazyColumn>
  );
}

/* Home ---------------------------------------------------------------------------------------- */

const shapes: ComposeMaterialShape[] = ["cookie9Sided", "sunny", "clover4Leaf", "gem", "flower", "softBurst"];

export function HomeScreen({ onStart }: { onStart: () => void }) {
  const p = usePalette();
  const [picked, setPicked] = useState<ComposeMaterialShape>("cookie9Sided");

  return (
    <Screen>
      <Column modifiers={fill.padding({ start: 4, end: 4, top: 8 })}>
        <LoadingIndicator color={p.accent} polygons={[picked, "circle"]} modifiers={Modifier.size(40)} />
        {gap(24)}
        <Text text={"Native Compose,\nwritten in React."} fontSize={36} lineHeight={44} color={p.ink} />
        {gap(12)}
        <Text text="Real Material 3 components, driven by React state." fontSize={16} lineHeight={24} color={p.muted} />
        {gap(24)}
        <Button onClick={onStart}><Text text="Get started" /></Button>
      </Column>

      <SectionTitle title="Shapes" />
      <LazyRow modifiers={fill}>
        {shapes.map(shape => (
          <Box
            key={shape}
            modifiers={Modifier.padding({ end: 12 }).size(64)
              .clip({ material: shape } as ComposeShape)
              .background(picked === shape ? p.accent : p.cardHigh)
              .clickable(() => setPicked(shape))}
          />
        ))}
      </LazyRow>

      <SectionTitle title="Highlights" />
      <Group rows={[
        { title: "Real Compose nodes", detail: "No web views or re-implementations", glyph: "Layers" },
        { title: "Typed modifiers", detail: "Modifier.padding(16).clip(\"circle\")", glyph: "Code" },
        { title: "Mixes with React Native", detail: "One tree, both worlds", glyph: "Hub" },
      ]} />
    </Screen>
  );
}

/* Controls ------------------------------------------------------------------------------------ */

const periods = ["Day", "Week", "Month"] as const;
const focus = { Day: "2h 40m", Week: "18h 05m", Month: "71h 30m" };

function segmentShape(index: number, count: number): ComposeShape {
  const start = index === 0 ? 50 : 0, end = index === count - 1 ? 50 : 0;
  return { factory: "RoundedCornerShape", topStartPercent: start, bottomStartPercent: start, topEndPercent: end, bottomEndPercent: end };
}

export function ControlsScreen() {
  const p = usePalette();
  const [period, setPeriod] = useState<(typeof periods)[number]>("Week");
  const [notify, setNotify] = useState(true);
  const [haptics, setHaptics] = useState(false);
  const [volume, setVolume] = useState(0.6);

  return (
    <Screen>
      <Panel>
        <SingleChoiceSegmentedButtonRow modifiers={fill}>
          {periods.map((name, index) => (
            <SegmentedButton
              key={name}
              selected={period === name}
              onClick={() => setPeriod(name)}
              shape={segmentShape(index, periods.length)}
              label={<Text text={name} />}
            />
          ))}
        </SingleChoiceSegmentedButtonRow>
        {gap(28)}
        <Text text="Focus time" fontSize={14} color={p.muted} />
        <AnimatedContent targetState={period} transitionSpec={{
          enter: { type: "slide", direction: "up", fraction: 0.4 },
          exit: { type: "fade" },
        }}>
          {periods.map(name => <Text key={name} text={focus[name]} fontSize={44} color={p.ink} />)}
        </AnimatedContent>
      </Panel>

      <SectionTitle title="Preferences" />
      <Group rows={[
        { title: "Notifications", detail: notify ? "On" : "Off", glyph: "Notifications",
          trailing: <Switch checked={notify} onCheckedChange={setNotify} /> },
        { title: "Haptics", detail: haptics ? "On" : "Off", glyph: "Vibration",
          trailing: <Switch checked={haptics} onCheckedChange={setHaptics} /> },
      ]} />

      <SectionTitle title="Volume" detail={`${Math.round(volume * 100)}%`} />
      <Slider value={volume} onValueChange={setVolume} modifiers={fill.padding({ horizontal: 4 })} />
    </Screen>
  );
}

/* Motion -------------------------------------------------------------------------------------- */

export function MotionScreen() {
  const p = usePalette();
  const [count, setCount] = useState(3);
  const [progress, setProgress] = useState(0.45);
  const [open, setOpen] = useState(false);
  const label = String(count);

  return (
    <Screen>
      <Panel>
        <Row modifiers={fill} verticalAlignment="centerVertically" horizontalArrangement="spaceBetween">
          <AnimatedContent targetState={label} transitionSpec={{
            enter: { type: "slide", direction: "up", fraction: 0.6, animationSpec: { type: "spring", dampingRatio: 0.6 } },
            exit: { type: "fade", animationSpec: { type: "tween", durationMillis: 120 } },
          }}>
            <Text key={label} text={label} fontSize={56} color={p.ink} />
          </AnimatedContent>
          <Row>
            <FilledTonalIconButton onClick={() => setCount(value => Math.max(0, value - 1))}>
              <Icon painter={{ icon: "Remove" }} contentDescription="Decrease" />
            </FilledTonalIconButton>
            {hgap(8)}
            <FilledIconButton onClick={() => setCount(value => value + 1)}>
              <Icon painter={{ icon: "Add" }} contentDescription="Increase" />
            </FilledIconButton>
          </Row>
        </Row>
      </Panel>

      <SectionTitle title="Progress" detail={`${Math.round(progress * 100)}%`} />
      <Panel>
        <Row modifiers={fill} verticalAlignment="centerVertically">
          <CircularWavyProgressIndicator progress={progress} modifiers={Modifier.size(56)} />
          {hgap(20)}
          <Column modifiers={Modifier.weight(1)}>
            <LinearWavyProgressIndicator progress={progress} modifiers={fill} />
            {gap(8)}
            <Slider value={progress} onValueChange={setProgress} />
          </Column>
        </Row>
      </Panel>

      <SectionTitle title="Details" />
      <Card onClick={() => setOpen(!open)} shape={radius(28)}
        colors={{ containerColor: p.card, contentColor: p.ink, disabledContainerColor: p.card, disabledContentColor: p.muted }}
        modifiers={fill.animateContentSize({
        animationSpec: { type: "spring", dampingRatio: 0.8, stiffness: 380 },
      })}>
        <Column modifiers={fill.padding(20)}>
          <Row modifiers={fill} verticalAlignment="centerVertically">
            <Text text="How does this work?" color={p.ink} modifiers={Modifier.weight(1)} />
            <Icon painter={{ icon: "ExpandMore" }} contentDescription={null} tint={p.muted}
              modifiers={Modifier.rotate(open ? 180 : 0)} />
          </Row>
          <AnimatedVisibility visible={open} enter={{ type: "fade" }} exit={{ type: "fade" }}>
            <Text modifiers={Modifier.padding({ top: 12 })} lineHeight={22} color={p.muted} fontSize={15}
              text="React describes the tree. A Compose host renders the real AndroidX composables, so layout and motion run natively." />
          </AnimatedVisibility>
        </Column>
      </Card>
    </Screen>
  );
}
