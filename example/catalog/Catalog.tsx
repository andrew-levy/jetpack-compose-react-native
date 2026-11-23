import { Component, useEffect, useMemo, useState, type ReactNode } from "react";
import { FlatList, Pressable, StyleSheet, Text, TextInput, View } from "react-native";

import fixtures from "./fixtures.json";
import {
  ComponentPreview, ModifierPreview, useCatalogHandles,
  type ComponentFixture, type ModifierFixture,
} from "./preview";

type Entry =
  | { kind: "component"; name: string; detail: string; spec: ComponentFixture }
  | { kind: "modifier"; name: string; detail: string; spec: ModifierFixture };

type Failure = { name: string; message: string };

const entries: Entry[] = [
  ...(fixtures.components as ComponentFixture[]).map((spec) => ({
    kind: "component" as const,
    name: spec.name,
    detail: spec.parent ? `inside ${spec.parent}` : spec.overload ?? "component",
    spec,
  })),
  ...(fixtures.modifiers as ModifierFixture[]).map((spec) => ({
    kind: "modifier" as const,
    name: spec.name,
    detail: spec.scope ? `${spec.scope} scope` : "modifier",
    spec,
  })),
];

function statusFor(running: boolean, finished: boolean, index: number, failures: number) {
  const current = entries[index];
  if (finished && !running) return `Sweep finished: ${failures} JavaScript failures`;
  if (running && current) return `Catalog sweep: ${index + 1}/${entries.length} ${current.name}`;
  return "Catalog ready";
}

export function Catalog({ startIndex }: { startIndex?: number }) {
  const shouldSweep = startIndex != null && Number.isInteger(startIndex) && startIndex >= 0 && startIndex < entries.length;
  const initial = shouldSweep ? startIndex : 0;
  const [query, setQuery] = useState("");
  const [index, setIndex] = useState(initial);
  const [running, setRunning] = useState(shouldSweep);
  const [finished, setFinished] = useState(false);
  const [failures, setFailures] = useState<Failure[]>([]);
  const visible = useMemo(() => {
    const needle = query.trim().toLowerCase();
    return entries
      .map((entry, entryIndex) => ({ entry, entryIndex }))
      .filter(({ entry }) => !needle || entry.name.toLowerCase().includes(needle) || entry.detail.toLowerCase().includes(needle));
  }, [query]);
  const current = entries[index];

  useEffect(() => {
    if (!running) return undefined;
    if (index >= entries.length) {
      setRunning(false);
      setFinished(true);
      return undefined;
    }
    console.warn(statusFor(true, false, index, 0));
    const timer = setTimeout(() => {
      const next = index + 1;
      // Log before mounting so a native crash can be attributed to this entry.
      if (next < entries.length) console.warn(statusFor(true, false, next, 0));
      setIndex(next);
    }, 700);
    return () => clearTimeout(timer);
  }, [running, index]);

  function recordFailure(name: string, error: Error) {
    const message = error.message || "Render failed";
    console.warn(`CATALOG_FAIL\t${name}\t${message}`);
    setFailures((currentFailures) => {
      const without = currentFailures.filter((failure) => failure.name !== name);
      return [...without, { name, message }];
    });
  }

  function show(next: number) {
    setRunning(false);
    setFinished(false);
    setIndex(Math.min(Math.max(next, 0), entries.length - 1));
  }

  const status = statusFor(running, finished, index, failures.length);

  useEffect(() => {
    if (finished) console.warn(status);
  }, [finished, status]);

  return (
    <View style={styles.screen}>
      <Text testID="catalog-status" style={styles.status}>{status}</Text>
      <Text style={styles.count}>{entries.filter((entry) => entry.kind === "component").length} components · {entries.filter((entry) => entry.kind === "modifier").length} modifiers</Text>
      <View style={styles.actions}>
        <Pressable accessibilityRole="button" onPress={() => { setFailures([]); setFinished(false); setIndex(0); setRunning(true); }} style={styles.action}>
          <Text style={styles.actionLabel}>{running ? "Restart sweep" : "Sweep all"}</Text>
        </Pressable>
        {running ? (
          <Pressable accessibilityRole="button" onPress={() => setRunning(false)} style={styles.action}>
            <Text style={styles.actionLabel}>Stop</Text>
          </Pressable>
        ) : (
          <>
            <Pressable accessibilityRole="button" onPress={() => show(index - 1)} style={styles.action}>
              <Text style={styles.actionLabel}>Previous</Text>
            </Pressable>
            <Pressable accessibilityRole="button" onPress={() => show(index + 1)} style={styles.action}>
              <Text style={styles.actionLabel}>Next</Text>
            </Pressable>
          </>
        )}
      </View>
      {failures.length > 0 && (
        <View style={styles.failures}>
          {failures.slice(-3).map((failure) => (
            <Text key={failure.name} style={styles.failure}>{failure.name}: {failure.message}</Text>
          ))}
        </View>
      )}
      <View style={styles.preview}>
        {current ? (
          <PreviewBoundary key={`${current.kind}:${current.name}:${index}`} name={current.name} onError={(error) => recordFailure(current.name, error)}>
            <LivePreview entry={current} sweeping={running} />
          </PreviewBoundary>
        ) : (
          <Text style={styles.detail}>Sweep complete</Text>
        )}
        {current && <Text style={styles.detail}>{current.name} · {current.detail}</Text>}
      </View>
      {!running && (
        <>
          <TextInput
            value={query}
            onChangeText={setQuery}
            placeholder="Search components and modifiers"
            placeholderTextColor="#8a7b9b"
            autoCorrect={false}
            autoCapitalize="none"
            style={styles.search}
          />
          <FlatList
            data={visible}
            keyboardShouldPersistTaps="handled"
            keyExtractor={(item) => `${item.entry.kind}:${item.entry.name}`}
            renderItem={({ item }) => (
              <Pressable onPress={() => show(item.entryIndex)} style={[styles.row, item.entryIndex === index && styles.selectedRow]}>
                <Text style={styles.rowName}>{item.entry.name}</Text>
                <Text style={styles.rowDetail}>{item.entry.detail}</Text>
              </Pressable>
            )}
          />
        </>
      )}
    </View>
  );
}

function LivePreview({ entry, sweeping }: { entry: Entry; sweeping: boolean }) {
  const handles = useCatalogHandles();
  return entry.kind === "component"
    ? <ComponentPreview spec={entry.spec} handles={handles} sweeping={sweeping} />
    : <ModifierPreview spec={entry.spec} handles={handles} />;
}

class PreviewBoundary extends Component<{ name: string; onError: (error: Error) => void; children: ReactNode }, { error: Error | null }> {
  state = { error: null as Error | null };

  static getDerivedStateFromError(error: Error) {
    return { error };
  }

  componentDidCatch(error: Error) {
    this.props.onError(error);
  }

  render() {
    if (this.state.error) return <Text style={styles.failure}>{this.props.name} failed: {this.state.error.message}</Text>;
    return this.props.children;
  }
}

const styles = StyleSheet.create({
  screen: { flex: 1, gap: 8 },
  status: { color: "#261b3a", fontSize: 15, fontWeight: "800" },
  count: { color: "#5c4b70", fontSize: 13, fontWeight: "600" },
  actions: { flexDirection: "row", gap: 8 },
  action: { minHeight: 40, paddingHorizontal: 12, borderRadius: 10, backgroundColor: "#e0d3f4", alignItems: "center", justifyContent: "center" },
  actionLabel: { color: "#3e275f", fontSize: 13, fontWeight: "800" },
  failures: { gap: 4 },
  failure: { color: "#8c2f39", fontSize: 13, fontWeight: "700" },
  preview: { minHeight: 120, padding: 12, backgroundColor: "#fff", borderColor: "#e9e2f1", borderWidth: 1, borderRadius: 14, gap: 8 },
  detail: { color: "#5d4b73", fontSize: 13, fontWeight: "700" },
  search: { minHeight: 44, borderRadius: 12, paddingHorizontal: 12, backgroundColor: "#fff", color: "#261b3a", borderColor: "#e0d3f4", borderWidth: 1 },
  row: { minHeight: 48, paddingHorizontal: 12, paddingVertical: 8, borderBottomColor: "#efeaf5", borderBottomWidth: 1, flexDirection: "row", justifyContent: "space-between", gap: 8, alignItems: "center" },
  selectedRow: { backgroundColor: "#f3ecfb" },
  rowName: { color: "#261b3a", fontSize: 15, fontWeight: "700", flexShrink: 1 },
  rowDetail: { color: "#7b6b8d", fontSize: 12, fontWeight: "600" },
});
