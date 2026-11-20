import { useState, type ReactNode } from "react";
import { Pressable, ScrollView, StyleSheet, Text as RNText, View } from "react-native";
import {
  AlertDialog, Badge, BadgedBox, Box, Button, Card, Checkbox, ComposeHost,
  CircularProgressIndicator, Column, ElevatedButton, FilterChip,
  FilledTonalButton, HorizontalDivider, LinearProgressIndicator, ListItem,
  Modifier, OutlinedButton, OutlinedTextField, RadioButton, Row, Spacer,
  Switch, Text, TextButton, type ComposeChain,
} from "jetpack-compose-react-native";

interface GalleryProps {
  showCode: boolean;
}

const rounded = { rect: { cornerRadius: 14 } };
const fullWidth = Modifier.fillMaxWidth();

function Intro({ title, children }: { title: string; children: string }) {
  return (
    <View style={styles.intro}>
      <RNText accessibilityRole="header" style={styles.introTitle}>{title}</RNText>
      <RNText style={styles.introText}>{children}</RNText>
    </View>
  );
}

function Demo({ title, source, showCode, children }: GalleryProps & {
  title: string;
  source: string;
  children: ReactNode;
}) {
  return (
    <View style={styles.demo}>
      <RNText accessibilityRole="header" style={styles.demoTitle}>{title}</RNText>
      {children}
      {showCode && (
        <ScrollView horizontal style={styles.codeBlock} contentContainerStyle={styles.codeContent}>
          <RNText style={styles.source} selectable>{source}</RNText>
        </ScrollView>
      )}
    </View>
  );
}

function Buttons({ showCode }: GalleryProps) {
  const [count, setCount] = useState(0);
  const [customAccent, setCustomAccent] = useState(false);
  function increment() {
    setCount((value) => value + 1);
  }

  return (
    <Demo title="Buttons" showCode={showCode} source={'<ComposeHost fitContent theme={{\n  colors: { primary: "#005e54", onPrimary: "#ffffff" },\n}}>\n  <Button onClick={increment}><Text text="Filled" /></Button>\n</ComposeHost>'}>
      <ComposeHost
        fitContent
        theme={customAccent ? { colors: { primary: "#005e54", onPrimary: "#ffffff" } } : undefined}
      >
        <Column modifiers={fullWidth}>
          <Row>
            <Button onClick={increment}><Text text="Filled" /></Button>
            <Spacer modifiers={Modifier.width(8)} />
            <OutlinedButton onClick={increment}><Text text="Outlined" /></OutlinedButton>
          </Row>
          <Row>
            <FilledTonalButton onClick={increment}><Text text="Tonal" /></FilledTonalButton>
            <Spacer modifiers={Modifier.width(8)} />
            <ElevatedButton onClick={increment}><Text text="Elevated" /></ElevatedButton>
          </Row>
          <Row verticalAlignment="centerVertically">
            <TextButton enabled={count > 0} onClick={() => setCount(0)}><Text text="Reset" /></TextButton>
            <Text text={`Button presses: ${count}`} color="#5d4b73" />
          </Row>
          <TextButton onClick={() => setCustomAccent(!customAccent)}>
            <Text text={customAccent ? "Reset accent" : "Try teal accent"} />
          </TextButton>
        </Column>
      </ComposeHost>
    </Demo>
  );
}

function Controls({ showCode }: GalleryProps) {
  const [notifications, setNotifications] = useState(false);
  const [favorite, setFavorite] = useState(false);
  const [mode, setMode] = useState<"Daily" | "Weekly">("Daily");

  return (
    <Demo title="Controls" showCode={showCode} source={"<Switch checked={notifications}\n  onCheckedChange={setNotifications} />\n<Checkbox checked={favorite}\n  onCheckedChange={setFavorite} />"}>
      <Column modifiers={fullWidth}>
        <Row modifiers={fullWidth} horizontalArrangement="spaceBetween" verticalAlignment="centerVertically">
          <Text text={notifications ? "Notifications on" : "Notifications off"} />
          <Switch checked={notifications} onCheckedChange={setNotifications} />
        </Row>
        <HorizontalDivider />
        <Row modifiers={fullWidth} horizontalArrangement="spaceBetween" verticalAlignment="centerVertically">
          <Text text={favorite ? "Saved to favorites" : "Save to favorites"} />
          <Checkbox checked={favorite} onCheckedChange={setFavorite} />
        </Row>
        <Row verticalAlignment="centerVertically">
          <RadioButton selected={mode === "Daily"} onClick={() => setMode("Daily")} />
          <Text text="Daily" />
          <RadioButton selected={mode === "Weekly"} onClick={() => setMode("Weekly")} />
          <Text text="Weekly" />
        </Row>
        <FilterChip selected={favorite} onClick={() => setFavorite(!favorite)} label={<Text text="Favorites" />} />
      </Column>
    </Demo>
  );
}

function TextFields({ showCode }: GalleryProps) {
  const [name, setName] = useState("");

  return (
    <Demo title="Text fields" showCode={showCode} source={'<OutlinedTextField value={name}\n  onValueChange={setName}\n  label={<Text text="Display name" />} />'}>
      <Column modifiers={fullWidth}>
        <OutlinedTextField
          modifiers={fullWidth}
          value={name}
          onValueChange={setName}
          label={<Text text="Display name" />}
          placeholder={<Text text="Type a name" />}
        />
        <Spacer modifiers={Modifier.height(8)} />
        <Text text={name.trim() ? `Hello, ${name.trim()}` : "Your greeting appears here."} color="#5d4b73" />
      </Column>
    </Demo>
  );
}

function Dialogs({ showCode }: GalleryProps) {
  const [open, setOpen] = useState(false);
  const [confirmed, setConfirmed] = useState(false);
  const dismiss = () => setOpen(false);

  return (
    <Demo title="Dialogs" showCode={showCode} source={'{open && <AlertDialog\n  onDismissRequest={dismiss}\n  title={<Text text="Publish draft?" />}\n  confirmButton={<TextButton onClick={confirm}>\n    <Text text="Publish" />\n  </TextButton>}\n/>}'}>
      <Column>
        <Button onClick={() => setOpen(true)}><Text text="Open dialog" /></Button>
        <Text text={confirmed ? "Draft published" : "Draft ready"} color="#5d4b73" />
        {open && (
          <AlertDialog
            onDismissRequest={dismiss}
            title={<Text text="Publish draft?" />}
            text={<Text text="This opens a native Material 3 dialog." />}
            dismissButton={<TextButton onClick={dismiss}><Text text="Cancel" /></TextButton>}
            confirmButton={
              <TextButton onClick={() => { setConfirmed(true); dismiss(); }}>
                <Text text="Publish" />
              </TextButton>
            }
          />
        )}
      </Column>
    </Demo>
  );
}

export function Components({ showCode }: GalleryProps) {
  return (
    <>
      <Intro title="Material 3 components">Try native controls, typography, and layout.</Intro>
      <Buttons showCode={showCode} />
      <Controls showCode={showCode} />
      <TextFields showCode={showCode} />
      <Demo title="Cards, lists & badges" showCode={showCode} source={'<ListItem headlineContent={<Text text="Inbox" />}\n  supportingContent={<Text text="3 unread messages" />} />'}>
        <Card modifiers={fullWidth}>
          <ListItem
            headlineContent={<Text text="Inbox" />}
            supportingContent={<Text text="3 unread messages" />}
            trailingContent={
              <BadgedBox badge={<Badge content={<Text text="3" color="#ffffff" />} />}>
                <Text text="New" color="#604680" />
              </BadgedBox>
            }
          />
          <HorizontalDivider />
          <ListItem
            headlineContent={<Text text="Drafts" />}
            supportingContent={<Text text="Ready to publish" />}
          />
        </Card>
      </Demo>
      <Demo title="Progress" showCode={showCode} source={'<LinearProgressIndicator modifiers={Modifier.fillMaxWidth()} />\n<CircularProgressIndicator modifiers={Modifier.size(32)} />'}>
        <Column modifiers={fullWidth}>
          <LinearProgressIndicator modifiers={fullWidth} color="#7953a3" />
          <Spacer modifiers={Modifier.height(12)} />
          <CircularProgressIndicator modifiers={Modifier.size(32)} color="#7953a3" />
        </Column>
      </Demo>
      <Dialogs showCode={showCode} />
    </>
  );
}

function Sample({ label, modifiers }: { label: string; modifiers: ComposeChain }) {
  return (
    <Box modifiers={modifiers} contentAlignment="center">
      <Text text={label} color="#2d1c43" fontWeight="bold" fontSize={14} />
    </Box>
  );
}

export function Modifiers({ showCode }: GalleryProps) {
  const [swapped, setSwapped] = useState(false);
  const fill = Modifier.background("#e2d1fc", { in: rounded });
  const paddedFill = swapped ? Modifier.padding(20).background("#e2d1fc", { in: rounded }) : fill.padding(20);

  return (
    <>
      <Intro title="Modifier playground">Change modifier order and see how it affects the layout.</Intro>
      <Demo title="Chain order" showCode={showCode} source={swapped
        ? 'Modifier.padding(20)\n  .background("#e2d1fc", { in: rounded })'
        : 'Modifier.background("#e2d1fc", { in: rounded })\n  .padding(20)'}>
        <Column modifiers={fullWidth}>
          <Box modifiers={Modifier.fillMaxWidth().height(92).background("#f3edf9", { in: rounded })} contentAlignment="center">
            <Sample label="Compose" modifiers={paddedFill} />
          </Box>
          <Spacer modifiers={Modifier.height(6)} />
          <Text text={swapped ? "Padding → background" : "Background → padding"} color="#5d4b73" />
          <Button onClick={() => setSwapped(!swapped)}><Text text="Swap order" /></Button>
        </Column>
      </Demo>
      <Demo title="Shapes, borders & gradients" showCode={showCode} source={'Modifier.background({ colors: ["#c7b2fa", "#f5c6e4"] },\n  { in: rounded })\n  .border("#8862ad", { width: 2, shape: rounded })'}>
        <Column modifiers={fullWidth}>
          <Sample
            label="Gradient"
            modifiers={Modifier.fillMaxWidth().height(66)
              .background({ colors: ["#c7b2fa", "#f5c6e4"] }, { in: rounded })
              .border("#8862ad", { width: 2, shape: rounded })}
          />
          <Spacer modifiers={Modifier.height(16)} />
          <Row modifiers={fullWidth} verticalAlignment="centerVertically">
            <Sample label="Clip" modifiers={Modifier.size(70).clip("circle").background("#e2d1fc")} />
            <Spacer modifiers={Modifier.width(14)} />
            <Sample label="Shadow" modifiers={Modifier.size(70).shadow(6, { shape: rounded }).background("#ede5fc", { in: rounded })} />
            <Spacer modifiers={Modifier.width(14)} />
            <Sample label="Rotate" modifiers={Modifier.size(66).rotate(-9).alpha(0.7).background("#f1cce5", { in: rounded })} />
          </Row>
        </Column>
      </Demo>
      <Demo title="Scoped layout" showCode={showCode} source={'<Row modifiers={Modifier.fillMaxWidth()}>\n  <Box modifiers={Modifier.weight(1).height(48)} />\n  <Box modifiers={Modifier.weight(2).height(48)} />\n</Row>'}>
        <Row modifiers={fullWidth} verticalAlignment="centerVertically">
          <Sample label="Weight 1" modifiers={Modifier.weight(1).height(48).background("#e2d1fc", { in: rounded })} />
          <Spacer modifiers={Modifier.width(8)} />
          <Sample label="Weight 2" modifiers={Modifier.weight(2).height(64).background("#cbb5f0", { in: rounded })} />
        </Row>
      </Demo>
    </>
  );
}

export function Interop({ showCode }: GalleryProps) {
  const [clicks, setClicks] = useState(0);
  const onClick = () => setClicks((value) => value + 1);

  return (
    <>
      <Intro title="React Native interop">Tap either button, or tap the count. Odd counts add a React Native child inside Compose.</Intro>
      <Demo title="Mixed children" showCode={showCode} source={'<Column>\n  <Button onClick={onClick}><Text text="Tap Compose" /></Button>\n  <Pressable onPress={onClick}><RNText>Tap React Native</RNText></Pressable>\n</Column>'}>
        <Column horizontalAlignment="start" modifiers={Modifier
          .fillMaxWidth()
          .background("#eee8f8", { in: rounded })
          .padding("all", 8)}
        >
          <Text
            text={clicks ? `Tapped ${clicks}` : "Ready"}
            modifiers={Modifier.clickable(onClick)}
            fontWeight="bold"
          />
          <Row>
            <Button modifiers={Modifier.align("centerVertically")} onClick={onClick}>
              <Text text="Tap Compose" fontSize={13} />
            </Button>
            <View style={styles.reactChild}>
              <Pressable accessibilityRole="button" onPress={onClick}>
                <RNText style={styles.reactButtonLabel}>Tap React Native</RNText>
              </Pressable>
            </View>
          </Row>
          {clicks % 2 === 0
            ? <Text key="even" text="Even click count" />
            : <Text key="odd" text="Odd click count" />}
          {clicks % 2 === 1 && <RNText style={styles.marker}>Added by React</RNText>}
        </Column>
        <RNText style={styles.marker}>Below Compose</RNText>
        <Text text="Fixed height Compose" style={styles.fixedRoot} />
      </Demo>
    </>
  );
}

const styles = StyleSheet.create({
  intro: { padding: 16, backgroundColor: "#392552", borderRadius: 18, gap: 5 },
  introTitle: { color: "#fff", fontSize: 23, fontWeight: "800", letterSpacing: -0.55 },
  introText: { color: "#eadcf8", fontSize: 13, lineHeight: 19 },
  demo: { padding: 14, backgroundColor: "#fff", borderColor: "#e9e2f1", borderWidth: 1, borderRadius: 18, gap: 8 },
  demoTitle: { color: "#302244", fontSize: 18, fontWeight: "800", letterSpacing: -0.35 },
  codeBlock: { borderRadius: 9, backgroundColor: "#302244" },
  codeContent: { padding: 10 },
  source: { color: "#f3e9ff", fontFamily: "monospace", fontSize: 11, lineHeight: 17 },
  reactChild: { padding: 5 },
  reactButtonLabel: { color: "#45305e", fontSize: 12, fontWeight: "700" },
  marker: { color: "#524261", fontSize: 13 },
  fixedRoot: { height: 40 },
});
