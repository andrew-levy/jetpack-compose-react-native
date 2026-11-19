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
  fixed: { flex: 0 },
  measure: { alignSelf: "stretch" },
});

export function AutomaticComposeHost(props: Omit<ComposeHostProps, "fitContent">) {
  const { height, ...intrinsicStyle } = StyleSheet.flatten(props.style) ?? {};
  if ((intrinsicStyle.flex ?? 0) > 0 || (intrinsicStyle.flexGrow ?? 0) > 0) {
    return <ComposeHost {...props} fitContent={false} />;
  }
  if (height != null && height !== "auto") {
    return <ComposeHost {...props} style={[styles.fixed, props.style]} fitContent={false} />;
  }
  return <ComposeHost {...props} style={intrinsicStyle} fitContent />;
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
