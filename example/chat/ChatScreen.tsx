import * as Clipboard from "expo-clipboard";
import { useEffect, useRef, useState } from "react";
import { Share } from "react-native";
import {
  AnimatedVisibility, Box, Column, MaterialTheme, ModalNavigationDrawer, Modifier, Snackbar, Text,
  useDrawerState, useFocusRequester,
} from "jetpack-compose-react-native";

import { rounded, type Appearance, type themes } from "./appearance";
import { Composer, fade, Header, Welcome } from "./ChatControls";
import { ChatSheet, ConversationDrawer, type Sheet } from "./ChatOverlays";
import {
  mockReply, sampleConversations, titleFor, type Attachment, type Conversation, type Mode, type Notice, type Turn,
} from "./conversations";
import { Transcript } from "./Transcript";

type Generation = { conversationId: string; turnId: string };
type Anchor = { conversationId: string; revision: number };

export function ChatScreen({ appearance, onAppearance, theme, onCatalog }: {
  appearance: Appearance;
  onAppearance: (appearance: Appearance) => void;
  theme: typeof themes.light;
  onCatalog: () => void;
}) {
  const { palette, scheme } = theme;
  const [conversations, setConversations] = useState<Conversation[]>(sampleConversations);
  const [activeId, setActiveId] = useState<string>();
  const [anchor, setAnchor] = useState<Anchor>();
  const [mode, setMode] = useState<Mode>("quick");
  const [draft, setDraft] = useState("");
  const [attachment, setAttachment] = useState<Attachment>();
  const [editing, setEditing] = useState<string>();
  const [sheet, setSheet] = useState<Sheet>();
  const [notice, setNotice] = useState<Notice>();
  const generation = useRef<Generation | undefined>(undefined);
  const timer = useRef<ReturnType<typeof setTimeout> | undefined>(undefined);
  const sequence = useRef(0);
  const drawer = useDrawerState();
  const focus = useFocusRequester();
  const active = conversations.find((conversation) => conversation.id === activeId);
  const generating = active?.turns.at(-1)?.status === "streaming";

  useEffect(() => () => clearTimeout(timer.current), []);
  useEffect(() => {
    if (!notice) return;
    const timeout = setTimeout(() => setNotice(undefined), 2100);
    return () => clearTimeout(timeout);
  }, [notice]);

  function updateTurn(conversationId: string, turnId: string, update: (turn: Turn) => Turn) {
    setConversations((current) => current.map((conversation) => conversation.id === conversationId
      ? { ...conversation, turns: conversation.turns.map((turn) => turn.id === turnId ? update(turn) : turn) }
      : conversation));
  }

  function stop() {
    const job = generation.current;
    if (!job) return;
    generation.current = undefined;
    clearTimeout(timer.current);
    updateTurn(job.conversationId, job.turnId, (turn) => ({ ...turn, status: "stopped" }));
  }

  function stream(conversationId: string, turn: Turn, attempt: number) {
    const job = { conversationId, turnId: turn.id };
    generation.current = job;
    const response = mockReply(turn.prompt, turn.mode, attempt, turn.attachment);
    const pieces = response.match(/\S+\s*/g) ?? [];
    let index = 0;
    let reply = "";

    function tick() {
      if (generation.current !== job) return;
      reply += pieces.slice(index, index + 3).join("");
      index += 3;
      const done = index >= pieces.length;
      const text = reply;
      updateTurn(job.conversationId, job.turnId, (item) => ({
        ...item, reply: text, status: done ? "complete" : "streaming",
      }));
      if (done) {
        generation.current = undefined;
      } else {
        timer.current = setTimeout(tick, 85);
      }
    }

    timer.current = setTimeout(tick, 520);
  }

  function clearComposer() {
    setDraft("");
    setAttachment(undefined);
    setEditing(undefined);
  }

  function select(id?: string) {
    drawer.close();
    if (id && id === activeId) return;
    stop();
    clearComposer();
    setActiveId(id);
    setAnchor(undefined);
    setNotice(undefined);
    const latest = conversations.find((conversation) => conversation.id === id)?.turns.at(-1);
    if (latest) setMode(latest.mode);
  }

  function send(value: string) {
    const prompt = value.trim();
    if (!prompt || generation.current) return;
    const conversationId = activeId ?? `chat-${++sequence.current}`;
    const turn: Turn = {
      id: editing ?? `turn-${++sequence.current}`,
      prompt, attachment, mode, reply: "", status: "streaming",
    };
    if (active) {
      setConversations((current) => current.map((conversation) => {
        if (conversation.id !== conversationId) return conversation;
        const turns = editing ? conversation.turns.map((item) => item.id === editing ? turn : item) : [...conversation.turns, turn];
        return { ...conversation, title: editing && turns.length === 1 ? titleFor(prompt) : conversation.title, turns };
      }));
    } else {
      setConversations((current) => [{ id: conversationId, title: titleFor(prompt), turns: [turn] }, ...current]);
      setActiveId(conversationId);
    }
    clearComposer();
    setAnchor({ conversationId, revision: ++sequence.current });
    stream(conversationId, turn, 0);
  }

  function retry(turn: Turn) {
    if (!activeId || generation.current) return;
    updateTurn(activeId, turn.id, (item) => ({ ...item, reply: "", feedback: undefined, status: "streaming" }));
    setAnchor({ conversationId: activeId, revision: ++sequence.current });
    stream(activeId, turn, 1);
  }

  function edit(turn: Turn) {
    stop();
    setEditing(turn.id);
    setAttachment(turn.attachment);
    setMode(turn.mode);
    setDraft(turn.prompt);
    focus.requestFocus();
  }

  function showNotice(text: string) {
    setNotice({ text });
  }

  async function copy(content: string) {
    try {
      await Clipboard.setStringAsync(content);
      showNotice("Copied to clipboard");
    } catch {
      showNotice("Couldn't copy the message");
    }
  }

  async function share(content: string) {
    try {
      await Share.share({ message: content });
    } catch {
      showNotice("Couldn't share the response");
    }
  }

  function openCatalog() {
    stop();
    drawer.close();
    onCatalog();
  }

  return (
    <MaterialTheme style={{ flex: 1 }} colorScheme={scheme}>
      <ModalNavigationDrawer
        drawerState={drawer}
        scrimColor={palette.scrim}
        modifiers={Modifier.fillMaxSize().background(palette.page).navigationBarsPadding().imePadding()}
        drawerContent={
          <ConversationDrawer conversations={conversations} selectedId={activeId} drawer={drawer} palette={palette}
            onNew={() => select()} onSelect={select}
            onOptions={() => { drawer.close(); setSheet("options"); }} onCatalog={openCatalog} />
        }
      >
        <Column modifiers={Modifier.fillMaxSize()}>
          <Header palette={palette} mode={mode} onHistory={drawer.open}
            onOptions={() => setSheet("options")} onNew={() => select()} />
          <Box modifiers={Modifier.fillMaxWidth().weight(1)}>
            {active ? (
              <Transcript key={active.id} turns={active.turns} palette={palette}
                anchor={anchor?.conversationId === active.id ? anchor.revision : undefined}
                actions={{
                  onCopy: copy, onEdit: edit, onRetry: retry, onShare: share,
                  onFeedback: (turn, feedback) => updateTurn(active.id, turn.id, (item) => ({
                    ...item, feedback: item.feedback === feedback ? undefined : feedback,
                  })),
                }} />
            ) : <Welcome palette={palette} onPrompt={send} />}
            <AnimatedVisibility visible={!!notice} enter={fade} exit={fade}
              modifiers={Modifier.align("topCenter").padding({ top: 8 })}>
              <Snackbar containerColor={palette.ink} contentColor={palette.surface} shape={rounded(14)}>
                <Text text={notice?.text ?? ""} color={palette.surface} fontSize={14} />
              </Snackbar>
            </AnimatedVisibility>
          </Box>
          <Composer palette={palette} draft={draft} attachment={attachment} editing={!!editing} generating={generating}
            mode={mode} focus={focus} onDraft={setDraft} onAttachment={() => setSheet("attachments")}
            onRemove={() => setAttachment(undefined)} onSend={() => send(draft)} onStop={stop}
            onCancelEdit={clearComposer} onOptions={() => setSheet("options")} />
        </Column>
      </ModalNavigationDrawer>
      {sheet && (
        <ChatSheet key={sheet} kind={sheet} palette={palette} mode={mode} appearance={appearance}
          onMode={setMode} onAttach={setAttachment} onAppearance={onAppearance} onDismiss={() => setSheet(undefined)} />
      )}
    </MaterialTheme>
  );
}
