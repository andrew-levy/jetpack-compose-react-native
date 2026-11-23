#!/usr/bin/env python3
"""Mount each gallery catalog entry on Android and fail if any entry fails."""

import json
import re
import subprocess
import sys
import time
from pathlib import Path

PACKAGE = "com.jetpackcomposereactnative.example"
ACTIVITY = f"{PACKAGE}/.MainActivity"
SWEEP = re.compile(r"Catalog sweep: (\d+)/(\d+) (.+)")
FINISHED = "Sweep finished:"


def adb(*args):
    return subprocess.check_output(["adb", *args], text=True, timeout=40).strip()


def log_since(start, buffer, *filters):
    output = adb("logcat", "-b", buffer, "-d", "-v", "epoch", *filters)
    lines = []
    for line in output.splitlines():
        timestamp = line.lstrip().partition(" ")[0]
        if timestamp.replace(".", "", 1).isdigit() and float(timestamp) >= start:
            lines.append(line)
    return lines


def running():
    # pidof returns 1 when the app is gone. Other adb errors still fail the run.
    return bool(adb("shell", "pidof", PACKAGE, "||", "true"))


def sweep(entries, seen, crashes, js_failures):
    index = 0
    while index < len(entries):
        if len(crashes) >= 40:
            raise RuntimeError("Stopped after 40 app exits or stalls")
        adb("shell", "am", "force-stop", PACKAGE)
        started = float(adb("shell", "date", "+%s.%N"))
        result = adb("shell", "am", "start", "-W", "-n", ACTIVITY, "--ei", "catalogStart", str(index))
        if "Status: ok" not in result:
            raise RuntimeError(result)
        last_progress = time.monotonic()
        current = index - 1
        while True:
            lines = log_since(started, "main", "-s", "ReactNativeJS:W")
            for line in lines:
                match = SWEEP.search(line)
                if match:
                    position, total, name = match.groups()
                    position = int(position) - 1
                    if int(total) != len(entries) or not 0 <= position < len(entries) or entries[position] != name:
                        raise RuntimeError("Installed APK catalog does not match local fixtures")
                    seen.add(position)
                    if position > current:
                        current = position
                        last_progress = time.monotonic()
                        if position % 25 == 0:
                            print(f"{position + 1}/{len(entries)} {name}", flush=True)
                if "CATALOG_FAIL\t" in line:
                    js_failures.add(line.split("CATALOG_FAIL\t", 1)[1])

            alive = running()
            if alive and any(FINISHED in line for line in lines):
                return
            if not alive or time.monotonic() - last_progress > 25:
                failed = max(current, index)
                name = entries[failed]
                reason = "App exited" if not alive else "Sweep stopped advancing"
                log = "\n".join(log_since(started, "crash"))[-16000:]
                crashes.append({"index": failed, "name": name, "reason": reason, "log": log})
                print(f"{reason} at {name}. Continuing with the next entry.", flush=True)
                index = failed + 1
                break
            time.sleep(0.6)


def main():
    root = Path(__file__).resolve().parent.parent
    fixtures = json.loads((root / "example/catalog/fixtures.json").read_text())
    entries = [item["name"] for group in ("components", "modifiers") for item in fixtures[group]]
    seen = set()
    crashes = []
    js_failures = set()
    error = None
    try:
        sweep(entries, seen, crashes, js_failures)
    except (RuntimeError, OSError, subprocess.SubprocessError, ValueError) as exc:
        error = str(exc)
    missing = [{"index": index, "name": name} for index, name in enumerate(entries) if index not in seen]
    report = {
        "entries": len(entries),
        "observedEntries": len(seen),
        "missingEntries": missing,
        "nativeCrashes": crashes,
        "javascriptFailures": sorted(js_failures),
        "error": error,
    }
    Path("catalog-sweep-report.json").write_text(json.dumps(report, indent=2) + "\n")
    print(f"Observed {len(seen)}/{len(entries)} entries. App exits or stalls: {len(crashes)}. "
          f"JavaScript failures: {len(js_failures)}. See catalog-sweep-report.json.")
    if error:
        print(error, file=sys.stderr)
    return int(bool(error or missing or crashes or js_failures))


if __name__ == "__main__":
    sys.exit(main())
