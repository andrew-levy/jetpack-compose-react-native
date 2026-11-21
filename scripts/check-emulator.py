import argparse
from contextlib import contextmanager
from pathlib import Path
import re
import subprocess
import tempfile
import threading
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


@contextmanager
def record(name):
    if preview_dir is None:
        yield
        return

    preview_dir.mkdir(parents=True, exist_ok=True)
    with tempfile.TemporaryDirectory() as directory:
        frames = Path(directory)
        stop = threading.Event()
        failures = []

        def sample():
            try:
                for index in range(96):
                    started = time.monotonic()
                    image = subprocess.check_output(["adb", "exec-out", "screencap", "-p"], timeout=15)
                    (frames / f"{index:03d}.png").write_bytes(image)
                    if stop.wait(max(0, 0.125 - (time.monotonic() - started))):
                        break
            except (subprocess.CalledProcessError, subprocess.TimeoutExpired) as error:
                failures.append(error)

        thread = threading.Thread(target=sample)
        thread.start()
        try:
            time.sleep(0.45)
            yield
            time.sleep(0.65)
        finally:
            stop.set()
            thread.join()
        if failures:
            raise failures[0]
        subprocess.run([
            "ffmpeg", "-hide_banner", "-loglevel", "error", "-y", "-framerate", "8",
            "-i", str(frames / "%03d.png"), "-filter_complex_threads", "1",
            "-filter_complex", "scale=400:-2:flags=lanczos,split[a][b];[a]palettegen[p];[b][p]paletteuse",
            "-loop", "0", str(preview_dir / f"{name}.gif"),
        ], check=True, timeout=45)


class ActivityRecreated(RuntimeError):
    pass


class MissingUiUpdate(RuntimeError):
    pass


def adb(*args):
    return subprocess.check_output(["adb", *args], text=True, timeout=40)


def activity_window():
    windows = adb("shell", "dumpsys", "window", "windows")
    focus = re.search(r"mCurrentFocus=Window\{(\S+) .* " + re.escape(PACKAGE) + r"/[^}]+\}", windows)
    return focus.group(1) if focus else None


def wait_for(*labels, absent=(), layout_ready=lambda nodes: True, window=None, timeout=90):
    deadline = time.monotonic() + timeout
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
    raise MissingUiUpdate(f"Missing UI update {labels}, found {list(nodes)}")


def bounds(node):
    return tuple(map(int, re.findall(r"-?\d+", node.get("bounds"))))


def node_height(node):
    _, top, _, bottom = bounds(node)
    return bottom - top


def tap(node):
    left, top, right, bottom = bounds(node)
    adb("shell", "input", "tap", str((left + right) // 2), str((top + bottom) // 2))


def following_view_top(nodes):
    return bounds(nodes["Below Compose"])[1]


def start_gallery():
    for attempt in range(2):
        adb("shell", "am", "force-stop", PACKAGE)
        print(adb("shell", "am", "start", "-W", "-n", f"{PACKAGE}/.MainActivity"), flush=True)
        window = activity_window()
        try:
            nodes = wait_for(
                "Compose Gallery", "Buttons", "Filled", "Button presses: 0", "Modifiers",
                window=window, timeout=35 if attempt == 0 else 90,
            )
            return nodes, window or activity_window()
        except (ActivityRecreated, MissingUiUpdate) as error:
            if attempt == 1:
                raise
            print(f"{error}. Relaunching the gallery after startup.", flush=True)


def verify():
    nodes, window = start_gallery()
    capture("01-components")
    with record("buttons"):
        tap(nodes["Filled"])
        nodes = wait_for("Button presses: 1", "Try teal accent", window=window)
        tap(nodes["Try teal accent"])
        nodes = wait_for("Button presses: 1", "Reset accent", "Modifiers", window=window)
    capture("02-accent")
    tap(nodes["Reset accent"])
    nodes = wait_for("Button presses: 1", "Try teal accent", "Try Expressive theme", window=window)
    tap(nodes["Try Expressive theme"])
    nodes = wait_for("Button presses: 1", "Use standard theme", "Filled", window=window)
    capture("03-expressive-theme")
    tap(nodes["Filled"])
    nodes = wait_for("Button presses: 2", "Use standard theme", window=window)
    tap(nodes["Use standard theme"])
    nodes = wait_for("Button presses: 2", "Show inputs", window=window)

    tap(nodes["Show inputs"])
    nodes = wait_for("Notifications off", "Save to favorites", "Slider 35%", "Show surfaces", window=window)
    capture("04-inputs")
    with record("inputs"):
        tap(nodes["Try weekly"])
        tap(nodes["Alerts"])
        nodes = wait_for("Notifications on", "Show surfaces", window=window)
    tap(nodes["Show surfaces"])
    nodes = wait_for("New messages", "Archive", "Outlined card", window=window)
    with record("cards-and-tabs"):
        tap(nodes["Archive"])
        nodes = wait_for("Archived messages", "Show progress", window=window)
    capture("05-cards-and-tabs")
    tap(nodes["Show progress"])
    nodes = wait_for("Determinate linear", "Determinate circular", "Contained loading indicator", "Modifiers", window=window)
    capture("06-progress")
    with record("progress"):
        time.sleep(1.75)

    tap(nodes["Show collections"])
    nodes = wait_for(
        "Purple swatch", "Layout reported to React", "Native row 2", "Native row 3", "Modifiers",
        # Compose may report a sliver of the preceding item in the content padding.
        layout_ready=lambda nodes: (
            "Native row 1" not in nodes
            or node_height(nodes["Native row 1"]) < node_height(nodes["Native row 2"]) / 2
        ),
        window=window,
    )
    capture("14-collections")

    nodes = wait_for("Show bridge", window=window)
    tap(nodes["Show bridge"])
    nodes = wait_for("Request native focus", "Native target idle", "Allow native scroll", "Scroll card 1", window=window)
    with record("native-focus-style"):
        tap(nodes["Request native focus"])
        nodes = wait_for("Native target focused", "Allow native scroll", "Scroll card 1", "Scroll card 2", window=window)
    first, second = bounds(nodes["Scroll card 1"]), bounds(nodes["Scroll card 2"])
    y = (first[1] + first[3]) // 2
    swipe = ("shell", "input", "swipe", str(second[2] + 24), str(y), str(first[0]), str(y), "300")
    adb(*swipe)
    nodes = wait_for("Scroll card 1", "Allow native scroll", layout_ready=lambda items: bounds(items["Scroll card 1"]) == first, window=window)
    with record("native-nested-scroll"):
        tap(nodes["Allow native scroll"])
        nodes = wait_for("Block native scroll", window=window)
        adb(*swipe)
        nodes = wait_for("Block native scroll", absent=("Scroll card 1",), window=window)
    capture("15-bridge")
    nodes = wait_for("Run animation", window=window)
    with record("native-animation-spec"):
        tap(nodes["Run animation"])
        nodes = wait_for("Native animation complete", "Modifiers", window=window)

    tap(nodes["Modifiers"])
    nodes = wait_for("Modifier playground", "Background → padding", "Swap order", window=window)
    capture("07-modifiers")
    with record("modifier-order"):
        tap(nodes["Swap order"])
        nodes = wait_for("Padding → background", "Interop", window=window)
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
    with record("mixed-children"):
        tap(nodes["Tap Compose"])
        nodes = wait_for(
            "Tapped 1", "Tap Compose", "Tap React Native", "Odd click count", "Added by React", "Below Compose",
            absent=("Ready", "Even click count"), window=window,
            layout_ready=lambda nodes: following_view_top(nodes) > original_foot,
        )
        capture("08-interop")
        tap(nodes["Tap React Native"])
        nodes = wait_for(
            "Tapped 2", "Even click count", "Below Compose",
            absent=("Tapped 1", "Odd click count", "Added by React"), window=window,
            layout_ready=lambda nodes: following_view_top(nodes) == original_foot,
        )
    tap(nodes["Tapped 2"])
    nodes = wait_for(
        "Tapped 3", "Odd click count", "Added by React", "Below Compose",
        absent=("Tapped 2", "Even click count"), window=window,
        layout_ready=lambda nodes: following_view_top(nodes) > original_foot,
    )

    tap(nodes["Expressive"])
    nodes = wait_for("Loading indicators", "Standard", "Expressive morph", "Overlays", window=window)
    capture("09-expressive")
    with record("expressive-loading"):
        time.sleep(2.0)

    tap(nodes["Overlays"])
    nodes = wait_for("React Native inside Compose", "Open generated sheet", window=window)
    capture("10-overlays")
    with record("bottom-sheet"):
        tap(nodes["Open generated sheet"])
        nodes = wait_for("Native sheet state", "React Native content in the sheet", "Close generated sheet")
        capture("11-bottom-sheet")
        tap(nodes["Close generated sheet"])
        nodes = wait_for("Open dialog", "Open generated sheet", absent=("Native sheet state",), window=window)

    with record("alert-dialog"):
        tap(nodes["Open dialog"])
        nodes = wait_for("Publish draft?", "Publish")
        capture("12-dialog")
        tap(nodes["Publish"])
        nodes = wait_for("Draft published", "Open menu", window=window)

    with record("menu-and-snackbar"):
        tap(nodes["Open menu"])
        nodes = wait_for("Archive item")
        tap(nodes["Archive item"])
        nodes = wait_for("Change saved", "Undo", window=window)
        capture("13-snackbar")
        tap(nodes["Undo"])
        wait_for("Open menu", absent=("Change saved",), window=window)


def main():
    animation_scale = None
    if preview_dir is not None:
        animation_scale = adb("shell", "settings", "get", "global", "animator_duration_scale").strip()
        adb("shell", "settings", "put", "global", "animator_duration_scale", "1")
    try:
        try:
            verify()
        except ActivityRecreated as error:
            print(f"{error}. Restarting the tap sequence.", flush=True)
            verify()
    finally:
        if animation_scale == "null":
            adb("shell", "settings", "delete", "global", "animator_duration_scale")
        elif animation_scale is not None:
            adb("shell", "settings", "put", "global", "animator_duration_scale", animation_scale)
    print("Verified themes, controls, tabs, modifier order, mixed children, and native overlays.")


if __name__ == "__main__":
    main()
