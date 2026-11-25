import { useEffect, useState } from "react";
import { PixelRatio } from "react-native";
import {
  AnimatedVisibility, Box, Column, DropdownMenu, DropdownMenuItem, LazyColumn, LoadingIndicator, Modifier,
  Row, Spacer, Text, useLazyListState, type ComposeAnnotatedString,
} from "jetpack-compose-react-native";

import { rounded, type Palette } from "./appearance";
import { Action, fade, Mark, resize, Symbol } from "./ChatControls";
import type { Turn } from "./conversations";

const pageInset = 12;

function formatReply(reply: string): ComposeAnnotatedString {
  const headings = /^(Saturday|Sunday)(?= ·)|^(Why the colors change|Leave some room)$/gm;
  return {
    text: reply,
    spans: Array.from(reply.matchAll(headings), (match) => ({
      start: match.index,
      end: match.index + match[0].length,
      fontWeight: "semiBold",
    })),
  };
}

type TurnActions = {
  onCopy: (content: string) => void;
  onEdit: (turn: Turn) => void;
  onRetry: (turn: Turn) => void;
  onShare: (content: string) => void;
  onFeedback: (turn: Turn, feedback: "up" | "down") => void;
};

function MessageTurn({ turn, palette, minHeight, latest, actions }: {
  turn: Turn; palette: Palette; minHeight: number; latest: boolean; actions: TurnActions;
}) {
  const [menu, setMenu] = useState<"prompt" | "reply">();
  const close = () => setMenu(undefined);
  const run = (action: () => void) => () => {
    close();
    action();
  };
  const ready = turn.status !== "streaming";
  const pending = !ready && turn.reply.length === 0;
  const bubble = rounded(palette.cornerRadius + 4);

  return (
    <Box modifiers={Modifier.fillMaxWidth().animateItem({
      fadeInSpec: fade.animationSpec, placementSpec: null, fadeOutSpec: null,
    })} contentAlignment="topCenter">
      <Column modifiers={Modifier.widthIn({ max: 760 }).fillMaxWidth()
        .heightIn({ min: minHeight }).padding({ horizontal: 21, bottom: 24 })}>
        <Row modifiers={Modifier.fillMaxWidth()} horizontalArrangement="end">
          <Box modifiers={Modifier.fillMaxWidth(0.87)} contentAlignment="centerEnd">
            <Column modifiers={Modifier.clip(bubble).background(palette.softAccent)
              .combinedClickable({
                onClick: () => setMenu("prompt"), onLongClick: () => setMenu("prompt"), onLongClickLabel: "Message actions",
              })
              .padding({ horizontal: 14, vertical: 10 })}>
              {turn.attachment && (
                <Row verticalAlignment="centerVertically" modifiers={Modifier.padding({ bottom: 6 })}>
                  <Symbol icon="List" color={palette.accent} size={16} />
                  <Spacer modifiers={Modifier.width(5)} />
                  <Text text={turn.attachment.name} color={palette.accent} fontSize={12} fontWeight="medium" />
                </Row>
              )}
              <Text text={turn.prompt} color={palette.ink} fontSize={16} lineHeight={23} />
            </Column>
            <DropdownMenu expanded={menu === "prompt"} onDismissRequest={close} shape={rounded(palette.cornerRadius)}
              containerColor={palette.surface} properties={{ focusable: true }}>
              <DropdownMenuItem text={<Text text="Copy message" />} onClick={run(() => actions.onCopy(turn.prompt))} />
              {latest && (
                <DropdownMenuItem text={<Text text="Edit message" />}
                  leadingIcon={<Symbol icon="Edit" color={palette.muted} />}
                  onClick={run(() => actions.onEdit(turn))} />
              )}
            </DropdownMenu>
          </Box>
        </Row>

        <Spacer modifiers={Modifier.height(25)} />
        <Row verticalAlignment="centerVertically">
          <Mark palette={palette} />
          <Spacer modifiers={Modifier.width(8)} />
          <Text text="Fieldnote" color={palette.ink} fontSize={14} fontWeight="semiBold" />
        </Row>
        <Spacer modifiers={Modifier.height(7)} />

        <Box modifiers={Modifier.fillMaxWidth()}>
          <Column modifiers={Modifier.fillMaxWidth().animateContentSize({ animationSpec: resize })}>
            <AnimatedVisibility visible={pending} enter={fade} exit={fade}>
              <Row modifiers={Modifier.height(35)} verticalAlignment="centerVertically">
                <LoadingIndicator modifiers={Modifier.size(25)} color={palette.accent} />
                <Spacer modifiers={Modifier.width(8)} />
                <Text text="Putting ideas together…" fontSize={14} color={palette.muted} />
              </Row>
            </AnimatedVisibility>
            {!!turn.reply && (
              <Text
                text={formatReply(turn.reply)}
                color={palette.ink}
                fontSize={16}
                lineHeight={25}
                modifiers={Modifier.fillMaxWidth().clip(rounded(8))
                  .combinedClickable({
                    onClick: () => setMenu("reply"), onLongClick: () => setMenu("reply"), onLongClickLabel: "Response actions",
                  })}
              />
            )}
            {turn.status === "stopped" && (
              <Text text="Response stopped" color={palette.muted} fontSize={13}
                modifiers={Modifier.padding({ top: 6 })} />
            )}
          </Column>
          <DropdownMenu expanded={menu === "reply"} onDismissRequest={close} shape={rounded(palette.cornerRadius)}
            containerColor={palette.surface} properties={{ focusable: true }}>
            <DropdownMenuItem text={<Text text="Copy response" />} enabled={!!turn.reply}
              onClick={run(() => actions.onCopy(turn.reply))} />
            <DropdownMenuItem text={<Text text="Share response" />} enabled={!!turn.reply}
              leadingIcon={<Symbol icon="Share" color={palette.muted} />}
              onClick={run(() => actions.onShare(turn.reply))} />
            {latest && (
              <DropdownMenuItem text={<Text text="Try again" />} enabled={ready}
                leadingIcon={<Symbol icon="Refresh" color={palette.muted} />}
                onClick={run(() => actions.onRetry(turn))} />
            )}
          </DropdownMenu>
        </Box>

        <AnimatedVisibility visible={ready} enter={fade} exit={fade}>
          <Row modifiers={Modifier.padding({ top: 5 })} verticalAlignment="centerVertically">
            <Action label="Copy response" glyph="copy" color={palette.muted} enabled={!!turn.reply}
              onClick={() => actions.onCopy(turn.reply)} />
            <Action label={turn.feedback === "up" ? "Remove thumbs up" : "Thumbs up"}
              icon="ThumbUp" color={turn.feedback === "up" ? palette.accent : palette.muted}
              enabled={!!turn.reply} onClick={() => actions.onFeedback(turn, "up")} />
            <Action label={turn.feedback === "down" ? "Remove thumbs down" : "Thumbs down"}
              glyph="thumbDown" color={turn.feedback === "down" ? palette.accent : palette.muted}
              enabled={!!turn.reply} onClick={() => actions.onFeedback(turn, "down")} />
            {latest && <Action label="Try again" icon="Refresh" color={palette.muted}
              onClick={() => actions.onRetry(turn)} />}
            <Action label="More response actions" icon="MoreVert" color={palette.muted} onClick={() => setMenu("reply")} />
          </Row>
        </AnimatedVisibility>
      </Column>
    </Box>
  );
}

export function Transcript({ turns, anchor, palette, actions }: {
  turns: Turn[]; anchor?: number; palette: Palette; actions: TurnActions;
}) {
  const [viewport, setViewport] = useState(0);
  const [position, setPosition] = useState({ index: -1, offset: false, count: 0 });
  const latest = turns.length - 1;
  const list = useLazyListState({
    initialIndex: latest,
    onStateChange: ({ firstVisibleItemIndex, firstVisibleItemScrollOffsetPx, totalItemsCount }) => {
      const offset = firstVisibleItemScrollOffsetPx > PixelRatio.getPixelSizeForLayoutSize(24);
      setPosition((previous) => previous.index === firstVisibleItemIndex && previous.offset === offset
        && previous.count === totalItemsCount ? previous : { index: firstVisibleItemIndex, offset, count: totalItemsCount });
    },
  });
  const { animateScrollToItem } = list;
  const measured = viewport > 0;

  // Wait for the new turn to be measured before scrolling to it. Streaming reply updates
  // leave the scroll position alone so the user can read earlier turns.
  useEffect(() => {
    if (anchor !== undefined && measured && position.count === turns.length) animateScrollToItem(latest);
  }, [anchor, animateScrollToItem, latest, measured, position.count, turns.length]);

  return (
    <Box modifiers={Modifier.fillMaxSize().onSizeChanged(({ height }) => setViewport(height / PixelRatio.get()))}>
      <LazyColumn state={list} modifiers={Modifier.fillMaxSize()} contentPadding={{ vertical: pageInset }}>
        {turns.map((turn, index) => (
          <MessageTurn key={turn.id} turn={turn} latest={index === latest} palette={palette} actions={actions}
            minHeight={index === latest ? Math.max(0, viewport - 2 * pageInset) : 0} />
        ))}
      </LazyColumn>
      <AnimatedVisibility visible={position.count > 0 && (position.index < latest || position.offset)}
        enter={fade} exit={fade} modifiers={Modifier.align("bottomCenter").padding({ bottom: 10 })}>
        <Box modifiers={Modifier.background(palette.surface, { in: rounded(22) })
          .border(palette.edge, { width: 1, shape: rounded(22) })}>
          <Action label="Jump to latest prompt" glyph="down" color={palette.ink} onClick={() => animateScrollToItem(latest)} />
        </Box>
      </AnimatedVisibility>
    </Box>
  );
}
