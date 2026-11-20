import argparse
from pathlib import Path
import re
import subprocess
import time
import xml.etree.ElementTree as ET


PACKAGE = "com.jetpackcomposereactnative.example"

parser = argparse.ArgumentParser()
parser.add_argument("--preview-dir", type=Path)
preview_dir = parser.parse_args().preview_dir


def capture(name):
    if preview_dir is not None:
        preview_dir.mkdir(parents=True, exist_ok=True)
        image = subprocess.check_output(["adb", "exec-out", "screencap", "-p"], timeout=40)
        (preview_dir / f"{name}.png").write_bytes(image)


class ActivityRecreated(RuntimeError):
    pass


def adb(*args):
    return subprocess.check_output(["adb", *args], text=True, timeout=40)


def activity_window():
    windows = adb("shell", "dumpsys", "window", "windows")
    focus = re.search(r"mCurrentFocus=Window\{(\S+) .* " + re.escape(PACKAGE) + r"/[^}]+\}", windows)
    return focus.group(1) if focus else None


def wait_for(*labels, absent=(), layout_ready=lambda nodes: True, window=None):
    deadline = time.monotonic() + 90
    nodes = {}
    while time.monotonic() < deadline:
        try:
            adb("shell", "uiautomator", "dump", "/sdcard/compose-bridge.xml")
            contents = adb("shell", "cat", "/sdcard/compose-bridge.xml")
            if window is not None:
                focused = activity_window()
                if focused is not None and focused != window:
                    raise ActivityRecreated("Android recreated the demo activity during verification")
            nodes = {
                label: node
                for node in ET.fromstring(contents).iter("node")
                for label in (node.get("text"), node.get("content-desc"))
                if label
            }
        except (subprocess.CalledProcessError, subprocess.TimeoutExpired, ET.ParseError):
            time.sleep(1)
            continue
        if (
            all(label in nodes for label in labels)
            and all(label not in nodes for label in absent)
            and layout_ready(nodes)
        ):
            return nodes
        time.sleep(1)
    raise RuntimeError(f"Missing UI update {labels}, found {list(nodes)}")


def bounds(node):
    return tuple(map(int, re.findall(r"-?\d+", node.get("bounds"))))


def tap(node):
    left, top, right, bottom = bounds(node)
    adb("shell", "input", "tap", str((left + right) // 2), str((top + bottom) // 2))


def following_view_top(nodes):
    return bounds(nodes["Below Compose"])[1]


def verify():
    adb("shell", "am", "force-stop", PACKAGE)
    print(adb("shell", "am", "start", "-W", "-n", f"{PACKAGE}/.MainActivity"), flush=True)

    nodes = wait_for("Material 3 components", "Buttons", "Filled", "Button presses: 0", "Modifiers")
    window = activity_window()
    capture("01-components")
    tap(nodes["Filled"])
    nodes = wait_for("Button presses: 1", "Modifiers", window=window)
    tap(nodes["Modifiers"])
    nodes = wait_for("Modifier playground", "Background → padding", "Swap order", window=window)
    capture("02-modifiers")
    tap(nodes["Swap order"])
    nodes = wait_for("Padding → background", "Show source code", window=window)
    tap(nodes["Show source code"])
    nodes = wait_for(
        "Padding → background", "Interop", "Show source code", window=window,
        layout_ready=lambda labels: any("Modifier.padding(20)" in label for label in labels),
    )
    capture("03-source")
    tap(nodes["Show source code"])
    tap(nodes["Interop"])

    nodes = wait_for(
        "Ready", "Tap Compose", "Tap React Native", "Even click count", "Below Compose", "Fixed height Compose",
        layout_ready=lambda nodes: (
            following_view_top(nodes) >= bounds(nodes["Even click count"])[3]
            and bounds(nodes["Tap React Native"])[0] >= bounds(nodes["Tap Compose"])[2]
        ),
        window=window,
    )
    original_foot = following_view_top(nodes)
    tap(nodes["Tap Compose"])
    nodes = wait_for(
        "Tapped 1", "Tap Compose", "Tap React Native", "Odd click count", "Added by React", "Below Compose",
        absent=("Ready", "Even click count"), window=window,
        layout_ready=lambda nodes: following_view_top(nodes) > original_foot,
    )
    capture("04-interop")
    tap(nodes["Tap React Native"])
    nodes = wait_for(
        "Tapped 2", "Even click count", "Below Compose",
        absent=("Tapped 1", "Odd click count", "Added by React"), window=window,
        layout_ready=lambda nodes: following_view_top(nodes) == original_foot,
    )
    tap(nodes["Tapped 2"])
    wait_for(
        "Tapped 3", "Odd click count", "Added by React", "Below Compose",
        absent=("Tapped 2", "Even click count"), window=window,
        layout_ready=lambda nodes: following_view_top(nodes) > original_foot,
    )


try:
    verify()
except ActivityRecreated as error:
    print(f"{error}. Restarting the tap sequence.", flush=True)
    verify()

print("Verified the gallery, live modifier changes, source snippets, and mixed Compose and React Native layout and events.")
