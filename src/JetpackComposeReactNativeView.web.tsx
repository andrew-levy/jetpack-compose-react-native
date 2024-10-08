import * as React from 'react';

import { JetpackComposeReactNativeViewProps } from './JetpackComposeReactNative.types';

export default function JetpackComposeReactNativeView(props: JetpackComposeReactNativeViewProps) {
  return (
    <div>
      <span>{props.name}</span>
    </div>
  );
}
