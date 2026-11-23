#!/bin/sh
set -eu

status=0
if ! python3 scripts/check-emulator.py --preview-dir compose-gallery; then
  status=1
  adb logcat -d > compose-emulator.log || true
  adb exec-out screencap -p > compose-emulator.png || true
  adb pull /sdcard/compose-bridge.xml compose-emulator.xml || true
fi

python3 scripts/sweep-catalog.py || status=1
exit "$status"
