import { requireNativeViewManager } from 'expo-modules-core';
import * as React from 'react';

import { JetpackComposeReactNativeViewProps } from './JetpackComposeReactNative.types';

const NativeView: React.ComponentType<JetpackComposeReactNativeViewProps> =
  requireNativeViewManager('JetpackComposeReactNative');

export default function JetpackComposeReactNativeView(props: JetpackComposeReactNativeViewProps) {
  return <NativeView {...props} />;
}
