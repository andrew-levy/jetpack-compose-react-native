import * as React from "react";
import { requireNativeViewManager } from "expo-modules-core";
import { StyleSheet, type ViewStyle } from "react-native";

import type { RenderComposeNodeProps } from "./RenderComposeNode";

type NativeProps = RenderComposeNodeProps & { style: ViewStyle; collapsable: false };
let NativeNode: React.ComponentType<NativeProps> | undefined;

const styles = StyleSheet.create({
  hidden: { position: "absolute", width: 0, height: 0 },
});

export function RenderComposeNode(props: RenderComposeNodeProps) {
  NativeNode ??= requireNativeViewManager<NativeProps>("GeneratedComposeNode");
  return <NativeNode {...props} collapsable={false} style={styles.hidden} />;
}
