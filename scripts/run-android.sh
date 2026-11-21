#!/usr/bin/env bash
set -euo pipefail

cd "$(dirname "$0")/.."

if [[ ! -d node_modules/react-native ]]; then
  echo "Run npm ci from the repository root first." >&2
  exit 1
fi

if [[ -n "${ANDROID_HOME:-}" ]]; then
  export PATH="$ANDROID_HOME/platform-tools:$PATH"
fi

abi="$(adb shell getprop ro.product.cpu.abi | tr -d '\r')"
if [[ -z "$abi" ]]; then
  echo "Start an Android emulator or select a device with ANDROID_SERIAL." >&2
  exit 1
fi

example/android/gradlew -p example/android :app:assembleRelease "-PreactNativeArchitectures=$abi"
adb install -r example/android/app/build/outputs/apk/release/app-release.apk

if [[ "${1:-}" == "--verify" ]]; then
  python3 scripts/check-emulator.py
else
  adb shell am start -n com.jetpackcomposereactnative.example/.MainActivity
fi
