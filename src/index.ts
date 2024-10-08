import { NativeModulesProxy, EventEmitter, Subscription } from 'expo-modules-core';

// Import the native module. On web, it will be resolved to JetpackComposeReactNative.web.ts
// and on native platforms to JetpackComposeReactNative.ts
import JetpackComposeReactNativeModule from './JetpackComposeReactNativeModule';
import JetpackComposeReactNativeView from './JetpackComposeReactNativeView';
import { ChangeEventPayload, JetpackComposeReactNativeViewProps } from './JetpackComposeReactNative.types';

// Get the native constant value.
export const PI = JetpackComposeReactNativeModule.PI;

export function hello(): string {
  return JetpackComposeReactNativeModule.hello();
}

export async function setValueAsync(value: string) {
  return await JetpackComposeReactNativeModule.setValueAsync(value);
}

const emitter = new EventEmitter(JetpackComposeReactNativeModule ?? NativeModulesProxy.JetpackComposeReactNative);

export function addChangeListener(listener: (event: ChangeEventPayload) => void): Subscription {
  return emitter.addListener<ChangeEventPayload>('onChange', listener);
}

export { JetpackComposeReactNativeView, JetpackComposeReactNativeViewProps, ChangeEventPayload };
