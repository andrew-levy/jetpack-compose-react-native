import * as React from "react";
import { StyleSheet } from "react-native";

import NativeHost from "../../specs/JpcComposeHostNativeComponent";
import { ComposeHostContext, type ComposeHostProps } from "./shared";

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

function ComposeHost({ children, fitContent = false, style, testID }: ComposeHostProps) {
  return (
    <ComposeHostContext.Provider value>
      <NativeHost
        fitContent={fitContent}
        testID={testID}
        collapsable={false}
        style={[fitContent ? styles.measure : styles.fill, style]}
      >
        {children}
      </NativeHost>
    </ComposeHostContext.Provider>
  );
}
