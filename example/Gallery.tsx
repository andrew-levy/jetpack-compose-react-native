import { useRef, useState, type ReactNode } from "react";
import { Pressable, StyleSheet, Text as RNText, View } from "react-native";
import {
  AlertDialog, AnimatedContent, AnimatedVisibility, AppBarRow, ButtonGroup, AssistChip, Badge, BasicText, BasicTextField, BadgedBox, BottomAppBar, Box, BoxWithConstraints, Button, Card, Checkbox, ComposeInnerContent,
  CircularProgressIndicator, Column, ContainedLoadingIndicator, DropdownMenu, DropdownMenuItem, ElevatedButton, ElevatedCard, FilterChip, FlowRow,
  Crossfade, DatePicker, Grid, FilledIconButton, FilledTonalButton, HorizontalDivider, HorizontalPager, Icon, Image, InputChip, Layout, LazyColumn, LazyRow, LazyVerticalGrid, LinearProgressIndicator, ListItem, LoadingIndicator,
  MaterialExpressiveTheme, MaterialTheme, ModalBottomSheet, Modifier, OutlinedButton, OutlinedCard, OutlinedTextField, PrimaryTabRow, RadioButton, RangeSlider, Row, Slider, Snackbar, Spacer,
  Scaffold, SuggestionChip, Switch, Tab, Text, TextButton, TextField, TimeInput, TimePicker, ToggleButton, TriStateCheckbox, lightColorScheme, useFocusRequester, useInteractionSource, type ComposeChain, type ComposeFloatRange, type ComposeLayoutSize, type ComposeTextFieldValue,
  StickyHeader, MediumTopAppBar, useLazyListState, useModalBottomSheetState, usePagerState, useTopAppBarScrollBehavior,
} from "jetpack-compose-react-native";

const rounded = { rect: { cornerRadius: 14 } };
const fullWidth = Modifier.fillMaxWidth();
const defaultColors = lightColorScheme();
const tealColors = lightColorScheme({ primary: "#005e54", onPrimary: "#ffffff" });

function Demo({ title, children }: { title: string; children: ReactNode }) {
  return (
    <View style={styles.demo}>
      <RNText accessibilityRole="header" style={styles.demoTitle}>{title}</RNText>
      {children}
    </View>
  );
}

export function Expressive() {
  return (
    <>
      <Demo
        title="Loading indicators"
      >
        <Row modifiers={fullWidth} horizontalArrangement="spaceEvenly">
          <MaterialTheme>
            <Column horizontalAlignment="centerHorizontally">
              <Text text="Standard" />
              <Spacer modifiers={Modifier.height(8)} />
              <Box modifiers={Modifier.size(56)} contentAlignment="center">
                <CircularProgressIndicator />
              </Box>
            </Column>
          </MaterialTheme>
          <MaterialExpressiveTheme>
            <Column horizontalAlignment="centerHorizontally">
              <Text text="Expressive morph" />
              <Spacer modifiers={Modifier.height(8)} />
              <Box modifiers={Modifier.size(56)} contentAlignment="center">
                <LoadingIndicator />
              </Box>
            </Column>
          </MaterialExpressiveTheme>
        </Row>
      </Demo>
    </>
  );
}

function Buttons() {
  const [count, setCount] = useState(0);
  const [customAccent, setCustomAccent] = useState(false);
  const [expressive, setExpressive] = useState(false);
  const [overflowSaved, setOverflowSaved] = useState(false);
  function increment() {
    setCount((value) => value + 1);
  }

  const Theme = expressive ? MaterialExpressiveTheme : MaterialTheme;
  const colors = customAccent ? tealColors : expressive ? undefined : defaultColors;


  return (
    <Demo title="Buttons">
      <Theme colorScheme={colors}>
        <Column modifiers={fullWidth}>
          <Row>
            <Button onClick={increment} elevation={{ factory: "ButtonDefaults.buttonElevation", defaultElevation: 3 }}>
              <Text text="Filled" />
            </Button>
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
          <Row>
            <TextButton onClick={() => setCustomAccent(!customAccent)}>
              <Text text={customAccent ? "Reset accent" : "Try teal accent"} />
            </TextButton>
            <TextButton onClick={() => setExpressive(!expressive)}>
              <Text text={expressive ? "Use standard theme" : "Try Expressive theme"} />
            </TextButton>
          </Row>
          <Row verticalAlignment="centerVertically">
            <FilledIconButton onClick={increment}><Text text="+" fontSize={22} /></FilledIconButton>
            <Spacer modifiers={Modifier.width(8)} />
            <ToggleButton checked={count > 0} onCheckedChange={(checked) => setCount(checked ? 1 : 0)}>
              <Text text="Toggle" />
            </ToggleButton>
            <Spacer modifiers={Modifier.width(8)} />
            <OutlinedButton enabled={false} onClick={increment}><Text text="Disabled" /></OutlinedButton>
          </Row>
          <ButtonGroup items={[
            { label: "Decrease", onClick: () => setCount(value => Math.max(0, value - 1)) },
            { label: "Increase", onClick: increment },
          ]} />
          <Row verticalAlignment="centerVertically">
            <AppBarRow maxItemCount={1} items={[
              { label: "First action", icon: { color: "#65438f" }, onClick: increment },
              { label: "Save draft", icon: { color: "#00726a" }, onClick: () => setOverflowSaved(true) },
            ]} />
            {overflowSaved && <Text text="Saved from overflow" />}
          </Row>
        </Column>
      </Theme>
    </Demo>
  );
}

function Controls() {
  const [notifications, setNotifications] = useState(false);
  const [favorite, setFavorite] = useState(false);
  const [level, setLevel] = useState(0.35);
  const [range, setRange] = useState<ComposeFloatRange>([0.25, 0.75]);
  const [mode, setMode] = useState<"Daily" | "Weekly">("Daily");

  return (
    <Demo title="Controls">
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
        <FlowRow modifiers={fullWidth} horizontalArrangement="spaceBetween" maxItemsInEachRow={2}>
          <FilterChip selected={favorite} onClick={() => setFavorite(!favorite)} label={<Text text="Favorites" />} />
          <AssistChip onClick={() => setMode("Daily")} label={<Text text="Daily digest" />} />
          <InputChip selected={notifications} onClick={() => setNotifications(!notifications)} label={<Text text="Alerts" />} />
          <SuggestionChip onClick={() => setMode("Weekly")} label={<Text text="Try weekly" />} />
        </FlowRow>
        <Text text={`Slider ${Math.round(level * 100)}%`} />
        <Slider
          value={level}
          onValueChange={setLevel}
          thumb={<Box modifiers={Modifier.size(20).clip("circle").background("#69489b")
            .semantics({ contentDescription: "Custom slider thumb" })} />}
        />
        <Text text={`Range ${Math.round(range[0] * 100)}–${Math.round(range[1] * 100)}%`} />
        <RangeSlider value={range} onValueChange={setRange} />
      </Column>
    </Demo>
  );
}

function TextFields() {
  const [name, setName] = useState("");

  return (
    <Demo title="Text fields">
      <Column modifiers={fullWidth}>
        <OutlinedTextField
          modifiers={fullWidth}
          value={name}
          onValueChange={setName}
          label={<Text text="Display name" />}
          placeholder={<Text text="Type a name" />}
        />
        <Spacer modifiers={Modifier.height(8)} />
        <TextField modifiers={fullWidth} value={name} onValueChange={setName} label={<Text text="Filled field" />} />
        <BasicText text={name.trim() ? `Hello, ${name.trim()}` : "Enter a name in either field."} />
      </Column>
    </Demo>
  );
}

function Dialogs() {
  const [open, setOpen] = useState(false);
  const [confirmed, setConfirmed] = useState(false);
  const dismiss = () => setOpen(false);

  return (
    <Demo title="Dialogs">
      <Column>
        <Button onClick={() => setOpen(true)}><Text text="Open dialog" /></Button>
        <Text text={confirmed ? "Draft published" : "Draft ready"} color="#5d4b73" />
        {open && (
          <AlertDialog
            onDismissRequest={dismiss}
            properties={{ windowTitle: "Publish draft", dismissOnClickOutside: false }}
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

const componentGroups = ["Buttons", "Inputs", "Surfaces", "Progress", "Collections", "Bridge"] as const;

export function Components() {
  const [group, setGroup] = useState<(typeof componentGroups)[number]>("Buttons");
  return (
    <>
      <View accessibilityRole="tablist" style={styles.groups}>
        {componentGroups.map((name) => (
          <Pressable
            key={name}
            accessibilityRole="tab"
            accessibilityLabel={`Show ${name.toLowerCase()}`}
            accessibilityState={{ selected: group === name }}
            onPress={() => setGroup(name)}
            style={[styles.group, group === name && styles.selectedGroup]}
          >
            <RNText style={styles.groupLabel}>{name}</RNText>
          </Pressable>
        ))}
      </View>
      {group === "Buttons" && <Buttons />}
      {group === "Inputs" && <><Controls /><TextFields /></>}
      {group === "Surfaces" && <Surfaces />}
      {group === "Progress" && <Progress />}
      {group === "Collections" && <Collections />}
      {group === "Bridge" && <BridgeCapabilities />}
    </>
  );
}

function BridgeCapabilities() {
  const requester = useFocusRequester();
  const interactionSource = useInteractionSource();
  const [focused, setFocused] = useState(false);
  const [showNewBindings, setShowNewBindings] = useState(false);
  const [scrollLocked, setScrollLocked] = useState(true);
  const [visible, setVisible] = useState(false);
  const [value, setValue] = useState<ComposeTextFieldValue>({ text: "Compose selection", selection: { start: 0, end: 7 } });
  if (showNewBindings) return <BridgeAdditions />;
  return (
    <>
      <Demo title="Native handles and input policy">
        <Column modifiers={fullWidth}>
          <Row>
            <Button onClick={requester.requestFocus}><Text text="Request native focus" /></Button>
            <TextButton onClick={() => setShowNewBindings(true)}><Text text="Try new bindings" /></TextButton>
          </Row>
          <Box modifiers={Modifier
            .styleable({
              style: { background: "#ede5fc", contentPadding: 8, whenFocused: { background: "#c1f2e7" } },
              styleState: { interactionSource },
            })
            .focusRequester(requester)
            .onFocusChanged(event => setFocused(event.isFocused))
            .focusable({ interactionSource })}>
            <Text text={focused ? "Native target focused" : "Native target idle"} />
          </Box>
          <Button onClick={() => setScrollLocked(!scrollLocked)}>
            <Text text={scrollLocked ? "Allow native scroll" : "Block native scroll"} />
          </Button>
          <LazyRow modifiers={fullWidth.height(48).nestedScroll(scrollLocked ? {
            preScroll: { x: 1 }, preFling: { x: 1 },
          } : {})}>
            {Array.from({ length: 8 }, (_, index) => (
              <Box key={index} modifiers={Modifier.width(88).height(48)} contentAlignment="center">
                <Text text={"Scroll card " + (index + 1)} />
              </Box>
            ))}
          </LazyRow>
        </Column>
      </Demo>
      <Demo title="Animation specs and structured values">
        <Column modifiers={fullWidth}>
          <Button onClick={() => setVisible(!visible)}><Text text={visible ? "Hide animation" : "Run animation"} /></Button>
          <AnimatedVisibility
            visible={visible}
            enter={{ type: "fade", animationSpec: { type: "tween", durationMillis: 280, easing: "linear" } }}
            exit={{ type: "fade", animationSpec: { type: "spring" } }}
          >
            <Text text="Native animation complete" />
          </AnimatedVisibility>
          <TextField value={value} onValueChange={setValue} keyboardOptions={{ imeAction: "done" }} />
        </Column>
      </Demo>
    </>
  );
}

function BridgeAdditions() {
  const [dragged, setDragged] = useState(false);
  const [pointerSeen, setPointerSeen] = useState(false);
  const [destination, setDestination] = useState(0);
  const [sizeAnimationFinished, setSizeAnimationFinished] = useState(false);

  return (
    <Demo title="Native gestures and layout">
      <Column modifiers={fullWidth}>
        <Box
          contentAlignment="center"
          modifiers={fullWidth.height(56).background("#e0d5fa")
            .semantics({ contentDescription: "Drag surface" })
            .pointerInput({ key1: "observe", block: { onEvent: () => setPointerSeen(true) } })
            .draggable({ orientation: "horizontal", state: { onDelta: () => setDragged(true) } })}
        >
          <Text text={dragged && pointerSeen ? "Drag reported to React" : "Drag horizontally"} />
        </Box>
        <Grid config={{ columns: [{ fr: 1 }, { fr: 1 }], rows: ["auto"], gap: 8 }} modifiers={fullWidth.padding(8)}>
          <Text text="Compose grid child" modifiers={Modifier.gridItem({ column: 1 })} />
          <RNText>React Native grid child</RNText>
        </Grid>
        <Layout
          modifiers={fullWidth}
          measurePolicy={{ height: 40, children: [{}, { horizontalBias: 1, verticalBias: 1 }] }}
        >
          <Text text="Layout start" modifiers={Modifier.layout({ height: 28 }).semantics({
            customActions: [{ label: "Reset drag indicator", onAction: () => setDragged(false) }],
          })} />
          <RNText>Layout end</RNText>
        </Layout>
        <Button
          colors={{
            containerColor: "#5e3d84",
            contentColor: "#ffffff",
            disabledContainerColor: "#ded4e8",
            disabledContentColor: "#51465d",
          }}
          onClick={() => setDestination(1)}
        >
          <Text text="Crossfade content" />
        </Button>
        <Box modifiers={Modifier.animateContentSize({
          animationSpec: { type: "tween", durationMillis: 200 },
          finishedListener: ([start, end]: readonly [ComposeLayoutSize, ComposeLayoutSize]) => {
            setSizeAnimationFinished(end.height > start.height);
          },
        })}>
          <Box modifiers={Modifier.height(destination === 0 ? 24 : 44)}>
            <Crossfade targetState={destination} animationSpec={{
              type: "keyframes", durationMillis: 200, frames: [{ atMillis: 100, value: 0.5 }],
            }}>
              <Text key="first" text="First crossfade state" />
              <Text key="second" text="Second crossfade state" />
            </Crossfade>
          </Box>
        </Box>
        {sizeAnimationFinished && <Text text="Size animation callback received" />}
        <AnimatedContent targetState={destination === 0 ? "first" : "second"} transitionSpec={{
          enter: { type: "slide", direction: "right", fraction: 0.5 },
          exit: { type: "scale", scale: 0.8 },
        }}>
          <Text key="first" text="Sliding content start" />
          <Text key="second" text="Sliding content end" />
        </AnimatedContent>
        <TextField
          modifiers={fullWidth.semantics({ contentDescription: "Native phone input" })}
          state={{ initialText: "1234" }}
          keyboardOptions={{ keyboardType: "phone", showKeyboardOnFocus: false }}
          lineLimits={{ type: "singleLine" }}
          inputTransformation={{ digitsOnly: true, maxLength: 6 }}
          outputTransformation={{ insertions: [{ offset: 3, text: "-" }] }}
        />
        <BasicTextField
          state={{ initialText: "Editable note" }}
          modifier={fullWidth}
          decorator={
            <Row verticalAlignment="centerVertically" modifiers={fullWidth.padding(8)}>
              <Icon painter={{ icon: "Edit", style: "outlined" }} contentDescription="Edit note icon" />
              <Spacer modifiers={Modifier.width(8)} />
              <ComposeInnerContent />
            </Row>
          }
        />
      </Column>
    </Demo>
  );
}

function Collections() {
  const [measured, setMeasured] = useState(false);
  const [selected, setSelected] = useState(false);
  const [numericTime, setNumericTime] = useState(false);
  const [firstRow, setFirstRow] = useState(2);
  const [headerMeasured, setHeaderMeasured] = useState(false);
  const [settledPage, setSettledPage] = useState(1);
  const list = useLazyListState({ initialIndex: 2, onStateChange: ({ firstVisibleItemIndex }) => {
    setFirstRow(firstVisibleItemIndex);
  } });
  const pager = usePagerState({ initialPage: 1, onStateChange: (state) => setSettledPage(state.settledPage) });
  const toolbar = useTopAppBarScrollBehavior("exitUntilCollapsed");
  return (
    <>
      <Demo title="Native list and layout callbacks">
        <Row modifiers={fullWidth} verticalAlignment="centerVertically">
          <Image
            painter={{ color: "#69489b" }}
            contentDescription="Purple swatch"
            modifiers={Modifier.size(24).clip("circle").onSizeChanged(({ width }) => setMeasured(width > 0))}
          />
          <Spacer modifiers={Modifier.width(8)} />
          <Text text={measured ? "Layout reported to React" : "Measuring layout"} />
        </Row>
        <Column modifiers={fullWidth.nestedScroll(toolbar)}>
          <MediumTopAppBar title={<Text text="Native feed toolbar" />} scrollBehavior={toolbar}
            windowInsets={{}} modifiers={Modifier.semantics({ contentDescription: "Collapsing feed toolbar" })} />
          <LazyColumn modifiers={fullWidth.height(132)} state={list} contentPadding={{ top: 4, bottom: 4 }}>
            <StickyHeader>
              <Text text={{ text: "Pinned feed header", spans: [{ start: 0, end: 6, fontWeight: "bold" }] }}
                onTextLayout={({ lineCount, width }) => setHeaderMeasured(lineCount === 1 && width > 0)}
                modifiers={fullWidth.background("#ede5fc").height(22)} />
            </StickyHeader>
            {Array.from({ length: 12 }, (_, index) => (
              <Text key={index} text={`Native row ${index + 1}`} modifiers={Modifier.height(36)} />
            ))}
          </LazyColumn>
        </Column>
        <Row modifiers={fullWidth} verticalAlignment="centerVertically">
          <Button onClick={() => list.scrollToItem(6)}><Text text="Jump to row 6" /></Button>
          <Spacer modifiers={Modifier.width(8)} />
          <Text text={headerMeasured ? `First row: ${firstRow}` : "Measuring header"} />
        </Row>
      </Demo>
      <Demo title="Native grid and tri-state selection">
        <LazyVerticalGrid columns={{ count: 2 }} style={{ height: 108 }} modifiers={fullWidth}>
          {["Orchid", "Periwinkle", "Lilac", "Lavender"].map((color) => (
            <Text key={color} text={color} modifiers={Modifier.height(45)} />
          ))}
        </LazyVerticalGrid>
        <Row verticalAlignment="centerVertically">
          <TriStateCheckbox state={selected ? "on" : "indeterminate"} onClick={() => setSelected(!selected)} />
          <Text text={selected ? "Selected" : "Partly selected"} />
        </Row>
      </Demo>
      <Demo title="Swipeable pages">
        <Row modifiers={fullWidth} verticalAlignment="centerVertically">
          <Button onClick={() => pager.animateScrollToPage(2)}><Text text="Jump to third page" /></Button>
          <Text text={`Settled page: ${settledPage + 1}`} />
        </Row>
        <HorizontalPager state={pager} style={{ height: 100 }} modifiers={fullWidth}>
          {["First page", "Second page", "Third page"].map((page) => (
            <Box key={page} modifiers={Modifier.fillMaxSize().background("#e2d1fc")} contentAlignment="center">
              <Text text={page} />
            </Box>
          ))}
        </HorizontalPager>
      </Demo>
      <Demo title="Scaffold and native pickers">
        <Scaffold
          style={{ height: 410 }}
          modifiers={fullWidth}
          topBar={<Text text="Calendar" modifiers={Modifier.padding(12)} />}
        >
          <DatePicker state={{}} />
        </Scaffold>
        <Button onClick={() => setNumericTime(!numericTime)}>
          <Text text={numericTime ? "Show clock" : "Enter time with keyboard"} />
        </Button>
        {numericTime
          ? <TimeInput state={{ initialHour: 9, initialMinute: 30 }} />
          : <TimePicker state={{ initialHour: 9, initialMinute: 30 }} />}
      </Demo>
    </>
  );
}

function Surfaces() {
  const [tab, setTab] = useState(0);
  return (
    <Demo title="Cards, tabs & badges">
      <Column modifiers={fullWidth}>
        <PrimaryTabRow selectedTabIndex={tab} tabs={["Inbox", "Archive"].map((label, index) => (
          <Tab key={label} selected={index === tab} onClick={() => setTab(index)} text={<Text text={label} />} />
        ))} />
        <Card modifiers={Modifier.fillMaxWidth().padding({ vertical: 6 })}>
          <ListItem
            headlineContent={<Text text={tab === 0 ? "New messages" : "Archived messages"} />}
            supportingContent={<Text text="Filled card and list item" />}
            trailingContent={<BadgedBox badge={<Badge content={<Text text="3" />} />}><Text text="Mail" /></BadgedBox>}
          />
        </Card>
        <ElevatedCard modifiers={Modifier.fillMaxWidth().padding({ vertical: 6 })}>
          <Text text="Elevated card" modifiers={Modifier.padding(16)} />
        </ElevatedCard>
        <OutlinedCard modifiers={Modifier.fillMaxWidth().padding({ vertical: 6 })}>
          <Text text="Outlined card" modifiers={Modifier.padding(16)} />
        </OutlinedCard>
      </Column>
    </Demo>
  );
}

function Progress() {
  return (
    <Demo title="Progress indicators">
      <Column modifiers={fullWidth}>
        <Text text="Determinate linear" />
        <LinearProgressIndicator progress={0.65} modifiers={fullWidth} />
        <Spacer modifiers={Modifier.height(12)} />
        <Text text="Determinate circular" />
        <CircularProgressIndicator progress={0.65} modifiers={Modifier.size(40)} />
        <Spacer modifiers={Modifier.height(12)} />
        <Text text="Indeterminate linear" />
        <LinearProgressIndicator modifiers={fullWidth} />
        <Spacer modifiers={Modifier.height(12)} />
        <MaterialExpressiveTheme>
          <Text text="Contained loading indicator" />
          <ContainedLoadingIndicator />
        </MaterialExpressiveTheme>
      </Column>
    </Demo>
  );
}

function Sample({ label, modifiers }: { label: string; modifiers: ComposeChain }) {
  return (
    <Box modifiers={modifiers} contentAlignment="center">
      <Text text={label} color="#2d1c43" fontWeight="bold" fontSize={14} />
    </Box>
  );
}

export function Modifiers() {
  const [swapped, setSwapped] = useState(false);
  const fill = Modifier.background("#e2d1fc", { in: rounded });
  const paddedFill = swapped ? Modifier.padding(20).background("#e2d1fc", { in: rounded }) : fill.padding(20);

  return (
    <>
      <Demo title="Modifier playground">
        <Column modifiers={fullWidth}>
          <Box modifiers={Modifier.fillMaxWidth().height(92).background("#f3edf9", { in: rounded })} contentAlignment="center">
            <Sample label="Compose" modifiers={paddedFill} />
          </Box>
          <Spacer modifiers={Modifier.height(6)} />
          <Text text={swapped ? "Padding → background" : "Background → padding"} color="#5d4b73" />
          <Button onClick={() => setSwapped(!swapped)}><Text text="Swap order" /></Button>
        </Column>
      </Demo>
      <Demo title="Shapes, borders & gradients">
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
      <Demo title="Size, offset & layering">
        <Row modifiers={fullWidth} horizontalArrangement="spaceEvenly" verticalAlignment="centerVertically">
          <Sample label="Ratio" modifiers={Modifier.width(66).aspectRatio(1.4).background("#e2d1fc")} />
          <Sample label="Scale" modifiers={Modifier.size(60).scale(0.8).background("#f1cce5")} />
          <Box modifiers={Modifier.size(70)}>
            <Sample label="Front" modifiers={Modifier.size(51).zIndex(1).background("#e0d4ff")} />
            <Sample label="" modifiers={Modifier.size(51).offset({ x: 16, y: 16 }).background("#c2b1ed")} />
          </Box>
        </Row>
      </Demo>
      <Demo title="Scoped layout">
        <Row modifiers={fullWidth} verticalAlignment="centerVertically">
          <Sample label="Weight 1" modifiers={Modifier.weight(1).height(48).background("#e2d1fc", { in: rounded })} />
          <Spacer modifiers={Modifier.width(8)} />
          <Sample label="Weight 2" modifiers={Modifier.weight(2).height(64).background("#cbb5f0", { in: rounded })} />
        </Row>
      </Demo>
    </>
  );
}

export function Interop() {
  const [clicks, setClicks] = useState(0);
  const onClick = () => setClicks((value) => value + 1);

  return (
    <>
      <Demo title="Mixed children">
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

export function Overlays() {
  const [open, setOpen] = useState(false);
  const [menu, setMenu] = useState(false);
  const [snackbar, setSnackbar] = useState(false);
  const sheetWasVisible = useRef(false);
  const sheet = useModalBottomSheetState({
    skipPartiallyExpanded: true,
    onStateChange: ({ currentValue, isVisible }) => {
      if (isVisible) sheetWasVisible.current = true;
      if (currentValue === "hidden" && sheetWasVisible.current) setOpen(false);
    },
  });
  function chooseItem() {
    setMenu(false);
    setSnackbar(true);
  }

  return (
    <>
      <Demo title="Modal bottom sheet">
        <Column modifiers={fullWidth}>
          <BottomAppBar contentPadding={{ horizontal: 20 }} windowInsets={{}}>
            <BoxWithConstraints>
              <RNText>React Native inside Compose</RNText>
            </BoxWithConstraints>
          </BottomAppBar>
          <Button onClick={() => {
            sheetWasVisible.current = false;
            setOpen(true);
          }}><Text text="Open generated sheet" /></Button>
          {open && (
            <ModalBottomSheet
              onDismissRequest={() => setOpen(false)}
              sheetState={sheet}
            >
              <Column modifiers={Modifier.fillMaxWidth().padding(20)}>
                <Text text="Native sheet state" fontSize={23} fontWeight="bold" />
                <RNText style={styles.marker}>React Native content in the sheet</RNText>
                <Spacer modifiers={Modifier.height(12)} />
                <Button onClick={sheet.hide}><Text text="Close generated sheet" /></Button>
              </Column>
            </ModalBottomSheet>
          )}
        </Column>
      </Demo>
      <Dialogs />
      <Demo title="Menu and snackbar">
        <Column modifiers={fullWidth}>
          <Box>
            <OutlinedButton onClick={() => setMenu(true)}><Text text="Open menu" /></OutlinedButton>
            <DropdownMenu expanded={menu} onDismissRequest={() => setMenu(false)} properties={{ focusable: true }}>
              <DropdownMenuItem text={<Text text="Archive item" />} onClick={chooseItem} />
              <DropdownMenuItem text={<Text text="Mark as read" />} onClick={chooseItem} />
            </DropdownMenu>
          </Box>
          {snackbar && (
            <Snackbar action={<TextButton onClick={() => setSnackbar(false)}><Text text="Undo" /></TextButton>}>
              <Text text="Change saved" />
            </Snackbar>
          )}
        </Column>
      </Demo>
    </>
  );
}

const styles = StyleSheet.create({
  groups: { flexDirection: "row", gap: 6 },
  group: { flex: 1, minHeight: 40, alignItems: "center", justifyContent: "center", borderRadius: 8, backgroundColor: "#eee8f8" },
  selectedGroup: { backgroundColor: "#e0d3f4" },
  groupLabel: { fontSize: 13, fontWeight: "700", color: "#392552" },
  demo: { padding: 12, backgroundColor: "#fff", borderColor: "#e9e2f1", borderWidth: 1, borderRadius: 14, gap: 8 },
  demoTitle: { color: "#302244", fontSize: 17, fontWeight: "800" },
  reactChild: { padding: 5 },
  reactButtonLabel: { color: "#45305e", fontSize: 12, fontWeight: "700" },
  marker: { color: "#524261", fontSize: 13 },
  fixedRoot: { height: 40 },
});
