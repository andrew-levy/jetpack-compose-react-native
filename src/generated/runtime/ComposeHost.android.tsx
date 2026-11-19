import * as React from "react";
import { requireNativeViewManager } from "expo-modules-core";
import { StyleSheet } from "react-native";

import { ComposeHostContext, type ComposeHostProps } from "./shared";

type NativeProps = ComposeHostProps & {
  onComposeSizeChange: (event: { nativeEvent: { height: number } }) => void;
};
let NativeHost: React.ComponentType<NativeProps> | undefined;

const styles = StyleSheet.create({
  fill: { flex: 1 },
  measure: { alignSelf: "stretch" },
});

export function AutomaticComposeHost(props: Omit<ComposeHostProps, "fitContent">) {
  const style = StyleSheet.flatten(props.style);
  const hasBoundedHeight =
    (style?.height != null && style.height !== "auto") ||
    (style?.flex ?? 0) > 0 ||
    (style?.flexGrow ?? 0) > 0;

  return <ComposeHost {...props} fitContent={!hasBoundedHeight} />;
}

export function ComposeHost({ children, fitContent = false, style, testID }: ComposeHostProps) {
  NativeHost ??= requireNativeViewManager<NativeProps>("GeneratedComposeHost");
  const [height, setHeight] = React.useState(1);

  return (
    <ComposeHostContext.Provider value>
      <NativeHost
        fitContent={fitContent}
        testID={testID}
        style={[fitContent ? [styles.measure, { height: Math.max(1, height) }] : styles.fill, style]}
        onComposeSizeChange={({ nativeEvent }) => {
          if (fitContent) setHeight(nativeEvent.height);
        }}
      >
        {children}
      </NativeHost>
    </ComposeHostContext.Provider>
  );
}
