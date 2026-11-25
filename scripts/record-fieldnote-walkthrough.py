import contextlib
import os
import re
import subprocess
import time
import xml.etree.ElementTree as ET
from pathlib import Path

ADB = os.environ["JPC_ADB"]
OUT = Path(__file__).resolve().parent
APP = "com.jetpackcomposereactnative.example"
DEVICE_XML = "/data/local/tmp/fieldnote-demo.xml"


def adb(*args, binary=False, timeout=55):
    output = subprocess.run([ADB, *args], check=True, capture_output=True, timeout=timeout).stdout
    return output if binary else output.decode(errors="replace").strip()


def log(message):
    print(message, flush=True)


def pause(seconds=1.7):
    time.sleep(seconds)


def hierarchy():
    adb("shell", "uiautomator", "dump", DEVICE_XML, timeout=26)
    xml = adb("exec-out", "cat", DEVICE_XML, timeout=12)
    return list(ET.fromstring(xml).iter("node"))


def labels(node):
    return node.get("text", ""), node.get("content-desc", "")


def find(label, *, partial=False, timeout=32):
    deadline = time.monotonic() + timeout
    seen = []
    while time.monotonic() < deadline:
        try:
            seen = hierarchy()
        except (subprocess.SubprocessError, ET.ParseError):
            pause(.5)
            continue
        for node in seen:
            bounds = re.findall(r"-?\d+", node.get("bounds", ""))
            if len(bounds) != 4:
                continue
            left, top, right, bottom = map(int, bounds)
            if right <= left or bottom <= top or node.get("enabled") == "false":
                continue
            if any(label in s if partial else label in s.split("\n") for s in labels(node)):
                return ((left + right) // 2, (top + bottom) // 2)
        pause(.4)
    found = sorted({s for node in seen for s in labels(node) if s})
    raise RuntimeError(f"Missing {label!r}. Saw {found}")


def click(position):
    adb("shell", "input", "tap", *map(str, position))


def tap(label, *, partial=False, wait=1.7):
    position = find(label, partial=partial)
    click(position)
    log(f"Tapped {label}")
    pause(wait)
    return position


def hold(label, *, partial=False):
    x, y = map(str, find(label, partial=partial))
    adb("shell", "input", "swipe", x, y, x, y, "680")
    pause()


def back(wait=1.5):
    adb("shell", "input", "keyevent", "KEYCODE_BACK")
    pause(wait)


def dismiss_keyboard():
    state = adb("shell", "dumpsys", "input_method")
    if "mInputShown=true" in state or "mShowRequested=true" in state:
        back()


def enter_words(text):
    for index, word in enumerate(text.split()):
        adb("shell", "input", "text", ("%s" if index else "") + word)
        pause(.38)


def capture(name):
    (OUT / f"{name}.png").write_bytes(adb("exec-out", "screencap", "-p", binary=True))


def open_settings():
    tap("Response mode,", partial=True)
    find("Appearance")


@contextlib.contextmanager
def recording(name):
    path = f"/data/local/tmp/{name}.mp4"
    adb("shell", "rm", "-f", path)
    record_log = (OUT / f"{name}.log").open("wb")
    process = subprocess.Popen(
        [ADB, "shell", "screenrecord", "--time-limit", "180", "--bit-rate", "1800000", path],
        stdout=record_log, stderr=record_log,
    )
    pause(1.2)
    try:
        yield
    finally:
        if process.poll() is None:
            try:
                pids = adb("shell", "pidof", "screenrecord").split()
                for pid in pids:
                    adb("shell", "kill", "-2", pid)
            except subprocess.SubprocessError:
                pass
            try:
                process.wait(timeout=16)
            except subprocess.TimeoutExpired:
                process.terminate()
                process.wait(timeout=5)
        record_log.close()
        adb("pull", path, str(OUT / f"{name}.mp4"), timeout=105)
        log(f"Recorded {name}")


def prompt_and_actions():
    log("Welcome, streaming, and message actions")
    with recording("01-messages"):
        pause(2.3)
        tap("Explain a concept", wait=2.5)
        find("More response actions")
        pause(2.5)
        tap("Copy response")
        pause(1.3)
        tap("Thumbs up")
        tap("More response actions")
        find("Share response")
        pause(2)
        tap("Share response", wait=2.6)
        back()
        hold("Explain how the northern lights work.")
        find("Edit message")
        pause(2)
        tap("Edit message", wait=2.5)
        find("Editing message")
        tap("Cancel editing", wait=1.5)
        dismiss_keyboard()


def follow_up_and_scroll():
    log("Attachments, keyboard, scroll anchoring, stop, and retry")
    with recording("02-follow-up"):
        open_settings()
        tap("Explore")
        tap("Close sheet")
        tap("Add attachment")
        find("Add a sample file")
        tap("Weekend notes.txt")
        find("Weekend notes.txt")
        tap("Message Fieldnote")
        enter_words("Plan a quiet weekend walk")
        pause(1.5)
        send = tap("Send message", wait=.9)
        click(send)
        pause(1.8)
        dismiss_keyboard()
        find("Plan a quiet weekend walk", partial=True)
        find("Response stopped")
        find("Try again")
        tap("Try again", wait=3.5)
        find("More response actions")
        pause(2)
        width, height = map(int, re.search(r"(\d+)x(\d+)", adb("shell", "wm", "size")).groups())
        adb("shell", "input", "swipe", *map(str, (width // 2, height // 4, width // 2, int(height * .67), 720)))
        find("Jump to latest prompt")
        pause(2)
        tap("Jump to latest prompt", wait=3)


def history_and_themes():
    log("History and Standard / Expressive appearance")
    with recording("03-appearance"):
        tap("Open conversations")
        find("A cozy reading corner")
        pause(1.8)
        tap("A cozy reading corner", wait=2.4)
        find("How can I make a cozy reading corner in a small room?")
        open_settings()
        tap("Light")
        tap("Dark")
        capture("dark")
        tap("Expressive mode")
        capture("expressive-dark")
        tap("Close sheet", wait=2.7)
        open_settings()
        tap("Light")
        tap("Close sheet", wait=2.6)
        tap("New conversation", wait=2.5)
        find("Start with a thought.")
        capture("expressive-welcome")
        tap("Help me write", wait=3.5)
        find("More response actions")
        pause(2.4)
        tap("Open conversations")
        tap("Compose Catalog")
        find("Back to Fieldnote")
        pause(1.9)
        tap("Back to Fieldnote")
        find("More response actions")
        pause(2.5)


adb("shell", "settings", "put", "system", "show_touches", "1")
find("Start with a thought.", timeout=150)
open_settings()
tap("Light")
tap("Close sheet")
try:
    prompt_and_actions()
    follow_up_and_scroll()
    history_and_themes()
except Exception:
    capture("failure")
    raise
finally:
    adb("shell", "settings", "put", "system", "show_touches", "0")
