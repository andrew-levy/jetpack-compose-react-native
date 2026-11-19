import re
import subprocess
import time
import xml.etree.ElementTree as ET


def adb(*args):
    return subprocess.check_output(["adb", *args], text=True, timeout=40)


def wait_for(*labels, absent=()):
    deadline = time.monotonic() + 90
    nodes = {}
    while time.monotonic() < deadline:
        try:
            adb("shell", "uiautomator", "dump", "/sdcard/compose-bridge.xml")
            contents = adb("shell", "cat", "/sdcard/compose-bridge.xml")
            nodes = {node.get("text"): node for node in ET.fromstring(contents).iter("node")}
        except (subprocess.CalledProcessError, subprocess.TimeoutExpired, ET.ParseError):
            time.sleep(1)
            continue
        if all(label in nodes for label in labels) and all(label not in nodes for label in absent):
            return nodes
        time.sleep(1)
    raise RuntimeError(f"Missing UI update {labels}, found {list(nodes)}")


def bounds(node):
    return tuple(map(int, re.findall(r"-?\d+", node.get("bounds"))))


def tap(node):
    left, top, right, bottom = bounds(node)
    adb("shell", "input", "tap", str((left + right) // 2), str((top + bottom) // 2))


adb("shell", "am", "start", "-W", "-a", "android.intent.action.VIEW", "-d",
    "jetpack-compose-react-native-example:///generated-compose",
    "expo.modules.jetpackcomposereactnative.example")
nodes = wait_for("Ready", "Tap Compose", "Even click count", "Below Compose")
original_foot = bounds(nodes["Below Compose"])[1]
assert original_foot >= bounds(nodes["Even click count"])[3], "Compose content overlaps the next Yoga view"
tap(nodes["Tap Compose"])
nodes = wait_for("Tapped 1", "Tap Compose", "Odd click count", "Added by React", "Below Compose",
                 absent=("Ready", "Even click count"))
assert bounds(nodes["Below Compose"])[1] > original_foot, "Yoga did not receive the taller Compose height"
tap(nodes["Tap Compose"])
nodes = wait_for("Tapped 2", "Even click count", "Below Compose",
                 absent=("Tapped 1", "Odd click count", "Added by React"))
assert bounds(nodes["Below Compose"])[1] == original_foot, "Yoga did not restore the original Compose height"
print("Compose mounted through React Native, updated props and children, and dispatched both clicks.")
