import { Component, useEffect, useMemo, useState, type ReactNode } from "react";
import {
  BackHandler, FlatList, Keyboard, Pressable, ScrollView, StyleSheet, Text, TextInput, View,
} from "react-native";

import fixtures from "./fixtures.json";
import { componentDemos } from "./demos";
import { ComponentPreview, ModifierPreview, useCatalogHandles, type ComponentFixture, type ModifierFixture } from "./preview";
import { themeModes, useCatalogPalette, type ThemeMode } from "./theme";

type Entry =
  | { kind: "Component"; name: string; spec: ComponentFixture }
  | { kind: "Modifier"; name: string; spec: ModifierFixture };
type Filter = "All" | "Components" | "Modifiers";

const entries: Entry[] = [
  ...(fixtures.components as ComponentFixture[]).map(spec => ({ kind: "Component" as const, name: spec.name, spec })),
  ...(fixtures.modifiers as ModifierFixture[]).map(spec => ({ kind: "Modifier" as const, name: spec.name, spec })),
];
const filters: readonly Filter[] = ["All", "Components", "Modifiers"];

function entryInstruction(entry: Entry) {
  if (entry.kind === "Modifier") {
    if (entry.name === "animateContentSize") return "Grow or shrink both samples to compare how their size changes.";
    if (entry.name === "verticalScroll" || entry.name === "horizontalScroll") return "Swipe the second sample to reveal the remaining items.";
    if (/^(clickable|combinedClickable|selectable|toggleable|triStateToggleable)$/.test(entry.name)) return "Tap the second sample and check the event below.";
    if (/^(draggable|draggable2D|anchoredDraggable|scrollable|pointerInput|pointerInteropFilter)$/.test(entry.name)) return "Drag across the second sample to exercise the gesture handler.";
    return entry.spec.scope
      ? `Compare the samples inside the ${entry.spec.scope} scope.`
      : "Compare the reference with the modified sample.";
  }
  const demo = componentDemos[entry.name];
  if (demo) return demo.instruction;
  if (entry.spec.parent === "TooltipBox") return "Press and hold the anchor to show the tooltip.";
  if (/^Lazy|Pager$|Carousel$/.test(entry.name)) return "Swipe through the items to see how this collection lays them out.";
  if (/Dialog$|^Dialog$|^Popup$|^ModalBottomSheet$|^(Exposed)?DropdownMenu$/.test(entry.name)) {
    return "Open the preview and dismiss it when you’re done.";
  }
  if (/TextField|^InputField$|^TimeInput$/.test(entry.name)) return "Tap the field and edit its contents.";
  if (Object.values(entry.spec.props).includes("$fn")) return "Try the control and watch for the event below the preview.";
  return undefined;
}

function sweepName(index: number) {
  return `Catalog sweep: ${index + 1}/${entries.length} ${entries[index].name}`;
}

export function Catalog({ startIndex, mode, onModeChange }: {
  startIndex?: number; mode: ThemeMode; onModeChange: (mode: ThemeMode) => void;
}) {
  const palette = useCatalogPalette();
  const initialSweep = startIndex != null && Number.isInteger(startIndex) && startIndex >= 0 && startIndex < entries.length
    ? startIndex : null;
  const [query, setQuery] = useState("");
  const [filter, setFilter] = useState<Filter>("All");
  const [selected, setSelected] = useState<number | null>(null);
  const [sweepIndex, setSweepIndex] = useState<number | null>(initialSweep);
  const [finished, setFinished] = useState(false);
  const [reviewed, setReviewed] = useState<ReadonlySet<number>>(new Set());
  const [failures, setFailures] = useState<ReadonlyMap<number, string>>(new Map());
  const running = sweepIndex !== null;
  const activeIndex = sweepIndex ?? selected;
  const current = activeIndex === null ? null : entries[activeIndex];
  const detailOpen = current !== null;

  const visible = useMemo(() => {
    const needle = query.toLowerCase().trim();
    return entries.flatMap((entry, index) => {
      const matchesKind = filter === "All" || filter === `${entry.kind}s`;
      const matchesText = !needle || entry.name.toLowerCase().includes(needle);
      return matchesKind && matchesText ? [{ entry, index }] : [];
    });
  }, [filter, query]);

  useEffect(() => {
    if (sweepIndex === null) return;
    console.warn(sweepName(sweepIndex));
    const timer = setTimeout(() => {
      const next = sweepIndex + 1;
      if (next === entries.length) {
        setFinished(true);
        setSweepIndex(null);
      } else {
        // Make the next entry identifiable even if native composition crashes on mount.
        console.warn(sweepName(next));
        setSweepIndex(next);
      }
    }, 700);
    return () => clearTimeout(timer);
  }, [sweepIndex]);

  const sweepSummary = `Sweep finished: ${failures.size} JavaScript failures`;
  useEffect(() => {
    if (finished) console.warn(sweepSummary);
  }, [finished, sweepSummary]);

  useEffect(() => {
    if (!detailOpen) return;
    const subscription = BackHandler.addEventListener("hardwareBackPress", () => {
      setSweepIndex(null);
      setSelected(null);
      return true;
    });
    return () => subscription.remove();
  }, [detailOpen]);

  function recordFailure(index: number, error: Error) {
    const message = error.message || "Render failed";
    console.warn(`CATALOG_FAIL\t${entries[index].name}\t${message}`);
    setFailures(previous => new Map(previous).set(index, message));
  }

  function open(index: number) {
    Keyboard.dismiss();
    setSelected(index);
  }

  if (current && activeIndex !== null) {
    const position = visible.findIndex(item => item.index === activeIndex);
    const previous = position > 0 ? visible[position - 1] : undefined;
    const next = position >= 0 ? visible[position + 1] : undefined;
    const isReviewed = reviewed.has(activeIndex);
    const instruction = entryInstruction(current);
    return (
      <>
        <View style={[styles.detailHeader, { borderColor: palette.line }]}>
          <Action label={running ? "Stop sweep" : "‹ Catalog"} onPress={() => {
            if (running) { setSweepIndex(null); setQuery(""); setFilter("All"); setSelected(activeIndex); }
            else setSelected(null);
          }} />
          <Text style={{ color: palette.muted }}>{running
            ? `${activeIndex + 1} of ${entries.length}`
            : `${position + 1} of ${visible.length} results`}</Text>
        </View>
        <ScrollView key={activeIndex} contentContainerStyle={styles.detail} keyboardShouldPersistTaps="handled">
          <Text style={[styles.kind, { color: palette.accent }]}>{current.kind}</Text>
          <Text accessibilityRole="header" style={[styles.title, { color: palette.ink }]}>{current.name}</Text>
          {instruction && <Text style={[styles.instruction, { color: palette.muted }]}>{instruction}</Text>}
          {!running && <Segmented choices={themeModes} selected={mode} onChange={onModeChange} />}
          <View style={[styles.preview, { backgroundColor: palette.stage, borderColor: palette.line }]}>
            <PreviewBoundary paletteError={palette.error} onError={error => recordFailure(activeIndex, error)}>
              <LivePreview entry={current} sweeping={running} />
            </PreviewBoundary>
          </View>
        </ScrollView>
        {!running && (
          <View style={[styles.footer, { borderColor: palette.line }]}>
            <Action label="Previous" disabled={!previous} onPress={() => previous && open(previous.index)} />
            <Action label={isReviewed ? "✓ Reviewed" : "Mark reviewed"} primary onPress={() => {
              setReviewed(items => {
                const update = new Set(items);
                if (isReviewed) update.delete(activeIndex);
                else update.add(activeIndex);
                return update;
              });
            }} />
            <Action label="Next" disabled={!next} onPress={() => next && open(next.index)} />
          </View>
        )}
      </>
    );
  }

  return (
    <View style={styles.screen}>
      <View style={styles.header}>
        <View style={styles.headingRow}>
          <Text accessibilityRole="header" style={[styles.title, { color: palette.ink }]}>Compose Catalog</Text>
          <Action label="Run sweep" onPress={() => {
            Keyboard.dismiss();
            setFailures(new Map());
            setFinished(false);
            setSweepIndex(0);
          }} />
        </View>
        <View style={styles.themeRow}>
          <Text style={{ color: palette.muted }}>Appearance</Text>
          <Segmented choices={themeModes} selected={mode} onChange={onModeChange} />
        </View>
        <View style={styles.searchRow}>
          <TextInput
            value={query}
            onChangeText={setQuery}
            accessibilityLabel="Search catalog"
            placeholder="Search components and modifiers"
            placeholderTextColor={palette.muted}
            selectionColor={palette.accent}
            autoCorrect={false}
            autoCapitalize="none"
            style={[styles.search, { backgroundColor: palette.surface, color: palette.ink, borderColor: palette.line }]}
          />
          {!!query && <Action label="Clear" onPress={() => setQuery("")} />}
        </View>
        <Segmented choices={filters} selected={filter} onChange={setFilter} />
        <Text style={[styles.summary, { color: palette.muted }]}>
          {visible.length} {visible.length === 1 ? "result" : "results"} · {reviewed.size} reviewed
        </Text>
        {finished && <Text accessibilityLiveRegion="polite" style={{ color: failures.size ? palette.error : palette.accent }}>
          {sweepSummary}
        </Text>}
      </View>
      <FlatList
        data={visible}
        keyboardShouldPersistTaps="handled"
        contentContainerStyle={styles.list}
        keyExtractor={item => `${item.entry.kind}:${item.entry.name}`}
        ListEmptyComponent={<Text style={[styles.empty, { color: palette.muted }]}>No matches. Try another search.</Text>}
        renderItem={({ item }) => (
          <Pressable
            accessibilityRole="button"
            accessibilityLabel={item.entry.name}
            accessibilityHint={reviewed.has(item.index) ? "Reviewed" : undefined}
            onPress={() => open(item.index)}
            style={({ pressed }) => [styles.row, { borderColor: palette.line, backgroundColor: pressed ? palette.stage : palette.surface }]}
          >
            <View style={styles.rowMain}>
              <Text style={[styles.rowName, { color: palette.ink }]}>{item.entry.name}</Text>
              <Text style={[styles.rowKind, { color: palette.muted }]}>{item.entry.kind}</Text>
              {finished && failures.has(item.index) && <Text style={{ color: palette.error }}>{failures.get(item.index)}</Text>}
            </View>
            <Text accessible={false} style={{ color: palette.accent, fontSize: 20 }}>
              {reviewed.has(item.index) ? "✓" : "›"}
            </Text>
          </Pressable>
        )}
      />
    </View>
  );
}

function Action({ label, onPress, disabled = false, primary = false }: {
  label: string; onPress: () => void; disabled?: boolean; primary?: boolean;
}) {
  const palette = useCatalogPalette();
  return (
    <Pressable
      accessibilityRole="button" accessibilityState={{ disabled }} disabled={disabled} onPress={onPress}
      style={({ pressed }) => [styles.action, {
        opacity: disabled ? 0.45 : 1,
        backgroundColor: primary ? palette.accent : pressed ? palette.raised : palette.stage,
      }]}
    >
      <Text style={[styles.actionLabel, { color: primary ? palette.accentText : palette.accent }]}>{label}</Text>
    </Pressable>
  );
}

function Segmented<T extends string>({ choices, selected, onChange }: {
  choices: readonly T[]; selected: T; onChange: (value: T) => void;
}) {
  const palette = useCatalogPalette();
  return (
    <View style={[styles.segments, { backgroundColor: palette.stage }]}>
      {choices.map(choice => (
        <Pressable key={choice} accessibilityRole="button" accessibilityState={{ selected: choice === selected }}
          onPress={() => onChange(choice)}
          style={[styles.segment, { backgroundColor: choice === selected ? palette.accent : palette.stage }]}>
          <Text style={[styles.actionLabel, { color: choice === selected ? palette.accentText : palette.muted }]}>{choice}</Text>
        </Pressable>
      ))}
    </View>
  );
}

function LivePreview({ entry, sweeping }: { entry: Entry; sweeping: boolean }) {
  const handles = useCatalogHandles();
  return entry.kind === "Component"
    ? <ComponentPreview spec={entry.spec} handles={handles} sweeping={sweeping} />
    : <ModifierPreview spec={entry.spec} handles={handles} sweeping={sweeping} />;
}

class PreviewBoundary extends Component<{ paletteError: string; onError: (error: Error) => void; children: ReactNode }, { error: Error | null }> {
  state = { error: null as Error | null };

  static getDerivedStateFromError(error: Error) {
    return { error };
  }

  componentDidCatch(error: Error) {
    this.props.onError(error);
  }

  render() {
    if (this.state.error) return <Text style={{ color: this.props.paletteError }}>{this.state.error.message}</Text>;
    return this.props.children;
  }
}

const styles = StyleSheet.create({
  screen: { flex: 1 },
  header: { paddingHorizontal: 18, paddingTop: 16, paddingBottom: 10, gap: 12 },
  headingRow: { flexDirection: "row", alignItems: "center", justifyContent: "space-between", gap: 10 },
  title: { fontSize: 28, fontWeight: "800", letterSpacing: -0.85, flexShrink: 1 },
  themeRow: { flexDirection: "row", alignItems: "center", justifyContent: "space-between", gap: 10 },
  segments: { flexDirection: "row", alignSelf: "flex-start", borderRadius: 12, padding: 3, gap: 2 },
  segment: { minHeight: 42, justifyContent: "center", paddingHorizontal: 12, borderRadius: 9 },
  searchRow: { flexDirection: "row", gap: 8, alignItems: "center" },
  search: { flex: 1, borderWidth: 1, borderRadius: 12, minHeight: 50, paddingHorizontal: 14, fontSize: 15 },
  summary: { fontSize: 13, fontWeight: "600" },
  list: { paddingHorizontal: 18, paddingBottom: 18 },
  row: {
    minHeight: 64, paddingHorizontal: 14, paddingVertical: 10, borderWidth: 1, borderRadius: 12,
    flexDirection: "row", alignItems: "center", gap: 12, marginBottom: 8,
  },
  rowMain: { flex: 1, gap: 3 },
  rowName: { fontSize: 16, fontWeight: "700" },
  rowKind: { fontSize: 13 },
  empty: { paddingVertical: 22, textAlign: "center" },
  detailHeader: {
    paddingHorizontal: 18, paddingVertical: 9, flexDirection: "row", alignItems: "center",
    justifyContent: "space-between", borderBottomWidth: 1,
  },
  detail: { padding: 18, paddingBottom: 24, gap: 10 },
  kind: { fontSize: 13, fontWeight: "700" },
  instruction: { fontSize: 15, lineHeight: 22 },
  preview: { borderRadius: 16, borderWidth: 1, padding: 14, minHeight: 88, marginTop: 6 },
  action: { minHeight: 44, paddingHorizontal: 12, borderRadius: 10, alignItems: "center", justifyContent: "center" },
  actionLabel: { fontSize: 13, fontWeight: "700" },
  footer: { flexDirection: "row", justifyContent: "space-between", gap: 6, padding: 12, borderTopWidth: 1 },
});
