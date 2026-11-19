import re
import subprocess
import time
import xml.etree.ElementTree as ET


def adb(*args):
    return subprocess.check_output(["adb", *args], text=True, timeout=40)


def wait_for(*labels, absent=(), layout_ready=lambda nodes: True):
    deadline = time.monotonic() + 90
    nodes = {}
    while time.monotonic() < deadline:
        try:
            adb("shell", "uiautomator", "dump", "/sdcard/compose-bridge.xml")
            contents = adb("shell", "cat", "/sdcard/compose-bridge.xml")
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


print(adb("shell", "am", "start", "-W", "-n",
          "expo.modules.jetpackcomposereactnative.example/.MainActivity"))
def following_view_top(nodes):
    return bounds(nodes["Below Compose"])[1]


nodes = wait_for("Ready", "Tap Compose", "Even click count", "Below Compose",
                 layout_ready=lambda nodes: following_view_top(nodes) >= bounds(nodes["Even click count"])[3])
original_foot = following_view_top(nodes)
tap(nodes["Tap Compose"])
nodes = wait_for("Tapped 1", "Tap Compose", "Odd click count", "Added by React", "Below Compose",
                 absent=("Ready", "Even click count"),
                 layout_ready=lambda nodes: following_view_top(nodes) > original_foot)
tap(nodes["Tap Compose"])
nodes = wait_for("Tapped 2", "Even click count", "Below Compose",
                 absent=("Tapped 1", "Odd click count", "Added by React"),
         layout_ready=lambda nodes: following_view_top(nodes) == original_foot)
print("Compose mounted through React Native, updated props and children, and dispatched both clicks.")
