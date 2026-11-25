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
MAIN_WINDOW = re.compile(r"^\s*Window #\d+ Window\{(\S+) u\d+ " + re.escape(PACKAGE) + r"/\S*MainActivity\}:", re.M)

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
    # The activity window keeps its identity while a native popup has focus.
    match = MAIN_WINDOW.search(windows)
    return match.group(1) if match else None


def settled_bounds(nodes, labels):
    # What the caller is likely to tap: the labels it waited for and every clickable node.
    return {
        label: node.get("bounds") for label, node in nodes.items()
        if label in labels or node.get("clickable") == "true"
    }


def wait_for(*labels, absent=(), layout_ready=lambda nodes: True, window=None, timeout=90, node_filter=lambda node: True):
    deadline = time.monotonic() + timeout
    nodes = {}
    # A tap goes to the coordinates of the last dump. Wait until they hold still across two dumps, so a
    # scrolling tab row or a sheet that is still animating in does not send the tap to another control.
    previous = None
    unsettled = 0
    while time.monotonic() < deadline:
        try:
            adb("shell", "uiautomator", "dump", "/sdcard/compose-bridge.xml")
            contents = adb("shell", "cat", "/sdcard/compose-bridge.xml")
            if window is not None:
                current_window = activity_window()
                if current_window is not None and current_window != window:
                    raise ActivityRecreated("Android recreated the demo activity during verification")
            nodes = {}
            for node in ET.fromstring(contents).iter("node"):
                if not node_filter(node):
                    continue
                for label in (node.get("text"), node.get("content-desc")):
                    if label and (label not in nodes or nodes[label].get("selected") != "true"):
                        nodes[label] = node
        except (subprocess.CalledProcessError, subprocess.TimeoutExpired, ET.ParseError):
            time.sleep(1)
            continue
        if (
            all(label in nodes for label in labels)
            and all(label not in nodes for label in absent)
            and layout_ready(nodes)
        ):
            bounds = settled_bounds(nodes, labels)
            # Give up on settling after a few dumps: some controls animate continuously.
            if bounds == previous or unsettled >= 3:
                return nodes
            previous = bounds
            unsettled += 1
            time.sleep(0.3)
            continue
        previous = None
        unsettled = 0
        time.sleep(1)
    raise MissingUiUpdate(f"Missing UI update {labels}, found {list(nodes)}")


def bounds(node):
    return tuple(map(int, re.findall(r"-?\d+", node.get("bounds"))))


def input_has_value(nodes, label, text):
    field = nodes.get(text)
    description = nodes.get(label)
    return (
        field is not None
        and description is not None
        and field.get("class") == "android.widget.EditText"
        and (description in field.iter("node") or field in description.iter("node"))
    )


def node_height(node):
    _, top, _, bottom = bounds(node)
    return bottom - top


def node_width(node):
    left, _, right, _ = bounds(node)
    return right - left


def tap(node):
    left, top, right, bottom = bounds(node)
    adb("shell", "input", "tap", str((left + right) // 2), str((top + bottom) // 2))


def tap_tab(label, window):
    nodes = wait_for("Modifiers", "Interop", window=window)
    left, _, _, _ = bounds(nodes["Modifiers"])
    _, top, right, bottom = bounds(nodes["Interop"])
    tab_width = node_width(nodes[label]) if label in nodes else 0
    if tab_width < node_width(nodes["Interop"]) / 2:
        y = str((top + bottom) // 2)
        adb("shell", "input", "swipe", str(right - 8), y, str(left + 8), y, "400")
        nodes = wait_for(label, window=window, timeout=15)
    tap(nodes[label])


def following_view_top(nodes):
    return bounds(nodes["Below Compose"])[1]


def start_gallery():
    for attempt in range(2):
        adb("shell", "am", "force-stop", PACKAGE)
        print(adb("shell", "am", "start", "-W", "-n", f"{PACKAGE}/.MainActivity", "--ez", "bridgeChecks", "true"), flush=True)
        window = activity_window()
        try:
            nodes = wait_for(
                "Compose Gallery", "Buttons", "Filled", "Button presses: 0", "Modifiers",
                window=window, timeout=35 if attempt == 0 else 90,
            )
            window = window or activity_window()
            if window is None:
                raise ActivityRecreated("Unable to identify the gallery activity after startup")
            return nodes, window
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
    nodes = wait_for("Button presses: 2", "Show inputs", "More actions", window=window)
    tap(nodes["More actions"])
    nodes = wait_for("Save draft")
    tap(nodes["Save draft"])
    nodes = wait_for("Saved from overflow", "Show inputs", window=window)

    tap(nodes["Show inputs"])
    nodes = wait_for(
        "Notifications off", "Save to favorites", "Slider 35%", "Custom slider thumb", "Show surfaces", window=window,
    )
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
    feed_heading = "Native list and layout callbacks"
    previous_geometry = None

    def feed_ready(nodes):
        nonlocal previous_geometry
        if "Native row 1" in nodes and node_height(nodes["Native row 1"]) >= node_height(nodes["Native row 2"]) / 2:
            return False
        geometry = tuple(bounds(nodes[label]) for label in (feed_heading, "Collapsing feed toolbar", "Native row 3"))
        settled = geometry == previous_geometry
        previous_geometry = geometry
        return settled

    nodes = wait_for(
        feed_heading, "Purple swatch", "Layout reported to React", "Native row 2", "Native row 3", "Modifiers",
        "Pinned feed header", "Jump to row 6", "First row: 2", "Collapsing feed toolbar",
        layout_ready=feed_ready,
        window=window,
    )
    capture("14-collections")
    toolbar_height = node_height(nodes["Collapsing feed toolbar"])
    feed_top = bounds(nodes[feed_heading])[1]
    left, top, right, bottom = bounds(nodes["Native row 3"])
    x = str((left + right) // 2)
    adb("shell", "input", "swipe", x, str((top + bottom) // 2), x, str(top - 45), "350")
    nodes = wait_for(
        feed_heading, "Pinned feed header", "Jump to row 6", "Collapsing feed toolbar", window=window,
        layout_ready=lambda nodes: (
            bounds(nodes[feed_heading])[1] == feed_top
            and node_height(nodes["Collapsing feed toolbar"]) < toolbar_height
        ),
    )
    tap(nodes["Jump to row 6"])
    wait_for("Native row 6", "Pinned feed header", "First row: 6", window=window)

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

    nodes = wait_for("Try new bindings", window=window)
    tap(nodes["Try new bindings"])
    nodes = wait_for(
        "Drag surface", "Compose grid child", "React Native grid child",
        "Crossfade content", "First crossfade state", "Layout start", "Layout end", window=window,
        layout_ready=lambda nodes: (
            bounds(nodes["Layout start"])[2] <= bounds(nodes["Layout end"])[0]
            and bounds(nodes["Layout start"])[1] < bounds(nodes["Layout end"])[1]
        ),
    )
    left, top, right, bottom = bounds(nodes["Drag surface"])
    drag_y = str((top + bottom) // 2)
    adb("shell", "input", "swipe", str(left + 16), drag_y, str(right - 16), drag_y, "300")
    nodes = wait_for("Drag reported to React", "Crossfade content", window=window)
    tap(nodes["Crossfade content"])
    nodes = wait_for(
        "Second crossfade state", "Size animation callback received", "Sliding content end",
        "Native phone input", "Edit note icon", "Editable note", "Modifiers",
        absent=("First crossfade state",), window=window,
        layout_ready=lambda nodes: input_has_value(nodes, "Native phone input", "123-4"),
    )

    tap(nodes["123-4"])
    wait_for("123-4", window=window, layout_ready=lambda nodes: nodes["123-4"].get("focused") == "true")
    adb("shell", "input", "keyevent", "KEYCODE_MOVE_END")
    adb("shell", "input", "text", "a567")
    nodes = wait_for(
        "Native phone input", "Modifiers", window=window,
        layout_ready=lambda nodes: input_has_value(nodes, "Native phone input", "123-456"),
    )

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

    tap_tab("Expressive", window)
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
    tap(nodes["Open generated sheet"])
    nodes = wait_for("Native sheet state", "Close generated sheet")
    tap(nodes["Close generated sheet"])
    nodes = wait_for("Open dialog", absent=("Native sheet state",), window=window)

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

    verify_catalog()


def verify_catalog():
    adb("shell", "am", "force-stop", PACKAGE)
    adb("shell", "am", "start", "-W", "-n", f"{PACKAGE}/.MainActivity", "--ei", "catalogStart", "0")
    window = activity_window()
    nodes = wait_for("Compose Catalog", "Light", "Dark", "Search catalog", window=window)
    window = window or activity_window()
    if window is None:
        raise ActivityRecreated("Unable to identify the catalog activity after startup")
    tap(nodes["Light"])
    nodes = wait_for("Light", "Dark", window=window,
                     layout_ready=lambda n: n["Light"].get("selected") == "true")
    capture("16-catalog-list")
    tap(nodes["Dark"])
    nodes = wait_for("Dark", "Search catalog", window=window,
                     layout_ready=lambda n: n["Dark"].get("selected") == "true")
    capture("17-catalog-dark")

    def open_demo(name):
        nodes = wait_for("Search catalog", window=window)
        if "Clear" in nodes:
            tap(nodes["Clear"])
        tap(nodes["Search catalog"])
        wait_for("Search catalog", window=window,
                 layout_ready=lambda n: n["Search catalog"].get("focused") == "true")
        adb("shell", "input", "text", name)
        wait_for("Search catalog", window=window, layout_ready=lambda n: n["Search catalog"].get("text") == name)
        adb("shell", "input", "keyevent", "KEYCODE_ENTER")
        matches = wait_for(name, window=window, node_filter=lambda node: (
            node.get("content-desc") == name and node.get("class") == "android.widget.Button"
            and node.get("clickable") == "true"
        ))
        tap(matches[name])

    open_demo("AnimatedVisibility")
    nodes = wait_for("Show panel", "Mark reviewed", "Dark", window=window,
                     layout_ready=lambda n: n["Dark"].get("selected") == "true")
    with record("catalog-animated-visibility"):
        tap(nodes["Show panel"])
        nodes = wait_for("Hide panel", "Visibility panel", window=window)
        tap(nodes["Hide panel"])
        nodes = wait_for("Show panel", "Mark reviewed", absent=("Visibility panel",), window=window)
    tap(nodes["Mark reviewed"])
    nodes = wait_for("✓ Reviewed", "‹ Catalog", window=window)
    tap(nodes["‹ Catalog"])

    open_demo("Column")
    nodes = wait_for("First", "Second", "Third", "‹ Catalog", window=window,
                     layout_ready=lambda n: bounds(n["First"])[3] <= bounds(n["Second"])[1]
                     and bounds(n["Second"])[3] <= bounds(n["Third"])[1])
    capture("18-catalog-column")
    tap(nodes["‹ Catalog"])

    open_demo("AlertDialog")
    nodes = wait_for("Open AlertDialog", window=window)
    tap(nodes["Open AlertDialog"])
    nodes = wait_for("Save this draft?", "Close preview")
    tap(nodes["Close preview"])
    nodes = wait_for("Open AlertDialog", absent=("Close preview",), window=window)
    tap(nodes["Open AlertDialog"])
    wait_for("Close preview")
    adb("shell", "input", "keyevent", "KEYCODE_BACK")
    wait_for("Open AlertDialog", absent=("Close preview",), window=window)


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
    print("Verified catalog search, themes, transitions, layout, controls, interop, and native overlays.")


if __name__ == "__main__":
    main()
