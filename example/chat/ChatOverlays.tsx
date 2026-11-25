import { useRef } from "react";
import {
  Box, Column, HorizontalDivider, LazyColumn, ListItem, ModalBottomSheet,
  ModalDrawerSheet, Modifier, NavigationDrawerItem, RadioButton, Row, Spacer, Text,
  useModalBottomSheetState, type ComposeDrawerStateHandle,
} from "jetpack-compose-react-native";

import { rounded, type Palette } from "./appearance";
import { Action, Mark, Symbol } from "./ChatControls";
import { attachments, modes, type Attachment, type Conversation, type Mode } from "./conversations";

export type Sheet = "options" | "attachments";

export function ConversationDrawer({
  conversations, selectedId, drawer, palette, onNew, onSelect, onOptions, onCatalog,
}: {
  conversations: Conversation[]; selectedId?: string; drawer: ComposeDrawerStateHandle; palette: Palette;
  onNew: () => void; onSelect: (id: string) => void; onOptions: () => void; onCatalog: () => void;
}) {
  return (
    <ModalDrawerSheet drawerState={drawer} drawerContainerColor={palette.surface} drawerContentColor={palette.ink}
      drawerTonalElevation={0} windowInsets={{}}
      modifiers={Modifier.widthIn({ max: 325 }).fillMaxWidth(0.87).fillMaxHeight()}>
      <Column modifiers={Modifier.fillMaxSize().padding({ horizontal: 16, vertical: 12 })}>
        <Row modifiers={Modifier.fillMaxWidth()} verticalAlignment="centerVertically">
          <Mark palette={palette} />
          <Spacer modifiers={Modifier.width(9)} />
          <Text text="Fieldnote" color={palette.ink} fontSize={22} fontWeight="semiBold" letterSpacing={-0.5} />
          <Spacer modifiers={Modifier.weight(1)} />
          <Action icon="Close" label="Close conversations" color={palette.muted} onClick={drawer.close} />
        </Row>
        <Spacer modifiers={Modifier.height(13)} />
        <NavigationDrawerItem label={<Text text="New conversation" color={palette.ink} fontWeight="medium" />}
          icon={<Symbol icon="Create" color={palette.accent} />} selected={!selectedId} onClick={onNew}
          shape={rounded(17)} />
        <Spacer modifiers={Modifier.height(20)} />
        <Text text="Conversations" color={palette.muted} fontSize={13} fontWeight="semiBold"
          modifiers={Modifier.padding({ start: 12, bottom: 8 }).semantics({ heading: true })} />
        <LazyColumn modifiers={Modifier.weight(1).fillMaxWidth()} contentPadding={{ bottom: 8 }}>
          {conversations.map((conversation) => (
            <NavigationDrawerItem key={conversation.id} selected={selectedId === conversation.id} shape={rounded(15)}
              onClick={() => onSelect(conversation.id)}
              icon={<Symbol icon="List" color={palette.muted} />}
              label={<Text text={conversation.title} color={palette.ink} fontSize={14} />} />
          ))}
        </LazyColumn>
        <HorizontalDivider color={palette.edge} />
        <NavigationDrawerItem selected={false} shape={rounded(15)} onClick={onOptions}
          icon={<Symbol icon="Settings" color={palette.accent} />}
          label={<Text text="Chat settings" color={palette.ink} fontSize={14} />} />
        <NavigationDrawerItem selected={false} shape={rounded(15)} onClick={onCatalog}
          icon={<Symbol icon="Build" color={palette.accent} />}
          label={<Text text="Compose Catalog" color={palette.ink} fontSize={14} />} />
      </Column>
    </ModalDrawerSheet>
  );
}

export function ChatSheet({
  kind, palette, mode, onMode, onAttach, onDismiss,
}: {
  kind: Sheet; palette: Palette; mode: Mode; onMode: (mode: Mode) => void;
  onAttach: (file: Attachment) => void; onDismiss: () => void;
}) {
  const visible = useRef(false);
  const openedAt = useRef(Date.now());
  const sheet = useModalBottomSheetState({
    skipPartiallyExpanded: true,
    onStateChange: ({ isVisible, currentValue }) => {
      if (isVisible) visible.current = true;
      // The gesture that opens the sheet can also settle it hidden. Put it back instead of
      // unmounting, so the sheet stays up after that opening tap.
      if (currentValue === "hidden" && visible.current) {
        if (Date.now() - openedAt.current < 500) sheet.show();
        else onDismiss();
      }
    },
  });
  const close = () => visible.current ? sheet.hide() : onDismiss();
  const options = kind === "options";

  return (
    <ModalBottomSheet onDismissRequest={onDismiss} sheetState={sheet}
      containerColor={palette.surface} contentColor={palette.ink} scrimColor={palette.scrim} tonalElevation={0}
      shape={rounded(palette.cornerRadius + 8)}
      dragHandle={<Box modifiers={Modifier.padding({ vertical: 12 }).size({ width: 34, height: 4 })
        .background(palette.edge, { in: rounded(3) })} />}>
      <Column modifiers={Modifier.fillMaxWidth().padding({ horizontal: 18, bottom: 20 })}>
        <Row modifiers={Modifier.fillMaxWidth().padding({ start: 8 })} verticalAlignment="centerVertically">
          <Text text={options ? "Chat settings" : "Add a sample file"} color={palette.ink}
            fontSize={23} fontWeight="semiBold" letterSpacing={-0.4}
            modifiers={Modifier.weight(1).semantics({ heading: true })} />
          <Action icon="Close" label="Close sheet" color={palette.muted} onClick={close} />
        </Row>
        {options ? (
          <>
            <Text text="Response mode" color={palette.muted} fontSize={13} fontWeight="semiBold"
              modifiers={Modifier.padding({ start: 8, top: 8, bottom: 6 })} />
            {modes.map((item) => (
              <ListItem key={item.id} modifiers={Modifier.clip(rounded(14))
                .clickable({ onClick: () => onMode(item.id), role: "radioButton" })
                .semantics({ stateDescription: mode === item.id ? "Selected" : "Unselected" })}
                leadingContent={<Symbol icon={item.id === "quick" ? "PlayArrow" : "Star"} color={palette.accent} />}
                supportingContent={<Text text={item.description} color={palette.muted} fontSize={13} />}
                trailingContent={<RadioButton selected={mode === item.id} onClick={null} />}>
                <Text text={item.label} color={palette.ink} fontSize={16} fontWeight="medium" />
              </ListItem>
            ))}
          </>
        ) : (
          <>
            <Text text="Try a built-in file with your next message." color={palette.muted} fontSize={14}
              modifiers={Modifier.padding({ start: 8, bottom: 9 })} />
            {attachments.map((file) => (
              <ListItem key={file.name} modifiers={Modifier.clip(rounded(14))
                .clickable({ onClick: () => { onAttach(file); close(); }, role: "button" })}
                leadingContent={<Symbol icon="List" color={palette.accent} />}
                trailingContent={<Symbol icon="Add" color={palette.accent} />}
                supportingContent={<Text text={file.description} color={palette.muted} fontSize={13} />}>
                <Text text={file.name} color={palette.ink} fontSize={16} fontWeight="medium" />
              </ListItem>
            ))}
          </>
        )}
      </Column>
    </ModalBottomSheet>
  );
}
