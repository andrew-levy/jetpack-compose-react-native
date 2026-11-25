import {
  AnimatedVisibility, BasicTextField, Box, Canvas, Column, ComposeInnerContent,
  Crossfade, FilledIconButton, HorizontalDivider, Icon, IconButton, Modifier, Row, Spacer,
  Text, useScrollState, type ComposeDrawCommand, type ComposeFocusRequester, type ComposeMaterialIcon,
} from "jetpack-compose-react-native";

import { rounded, type Palette } from "./appearance";
import { modes, starters, type Attachment, type Mode } from "./conversations";

type IconName = Extract<ComposeMaterialIcon, { style: "outlined" }>["icon"];
type Glyph = "up" | "down" | "stop" | "copy" | "thumbDown";

export const fade = { type: "fade", animationSpec: { type: "tween", durationMillis: 180 } } as const;
export const resize = { type: "tween", durationMillis: 220 } as const;

export function Symbol({ icon, color, size = 20 }: { icon: IconName; color: string; size?: number }) {
  return <Icon painter={{ style: "outlined", icon }} contentDescription={null} tint={color} modifiers={Modifier.size(size)} />;
}

export function Mark({ palette, large = false }: { palette: Palette; large?: boolean }) {
  const size = large ? 60 : 30;
  return (
    <Box
      modifiers={Modifier.size(size).background(palette.softAccent, { in: rounded(large ? 20 : 10) })}
      contentAlignment="center"
    >
      <Canvas modifiers={Modifier.size(large ? 31 : 22)} onDraw={{ commands: [
        { type: "scale", scale: large ? 1 : 0.7, pivot: { x: 0, y: 0 }, commands: [
          { type: "path", points: [
            { x: 14, y: 1 }, { x: 17.5, y: 10 }, { x: 27, y: 14 }, { x: 17.5, y: 17.5 },
            { x: 14, y: 27 }, { x: 10.5, y: 17.5 }, { x: 1, y: 14 }, { x: 10.5, y: 10.5 },
          ], closed: true, color: palette.accent },
          { type: "circle", center: { x: 27, y: 4 }, radius: 2.7, color: palette.accent },
        ] },
      ] }} />
    </Box>
  );
}

function DrawnIcon({ glyph, color }: { glyph: Glyph; color: string }) {
  function line(x1: number, y1: number, x2: number, y2: number): ComposeDrawCommand {
    return { type: "line", start: { x: x1, y: y1 }, end: { x: x2, y: y2 }, color, strokeWidth: 1.7, strokeCap: "round" };
  }
  const commands: Record<Glyph, readonly ComposeDrawCommand[]> = {
    up: [line(10, 16, 10, 4), line(10, 4, 5, 9), line(10, 4, 15, 9)],
    down: [line(10, 4, 10, 16), line(10, 16, 5, 11), line(10, 16, 15, 11)],
    stop: [{ type: "rect", x: 5, y: 5, width: 10, height: 10, cornerRadius: 2, color }],
    copy: [
      { type: "rect", x: 7, y: 6, width: 10, height: 11, cornerRadius: 2, color, strokeWidth: 1.5 },
      line(3.5, 13, 3.5, 3), line(3.5, 3, 13, 3),
    ],
    thumbDown: [{
      type: "path",
      points: [
        { x: 7, y: 4 }, { x: 16, y: 4 }, { x: 17, y: 6 }, { x: 15, y: 11 }, { x: 11, y: 11 },
        { x: 11.5, y: 16 }, { x: 9.5, y: 17 }, { x: 6.5, y: 11 }, { x: 6.5, y: 4 },
        { x: 3, y: 4 }, { x: 3, y: 11 }, { x: 6.5, y: 11 },
      ],
      color,
      strokeWidth: 1.5,
    }],
  };
  return <Canvas modifiers={Modifier.size(20)} onDraw={{ commands: commands[glyph] }} />;
}

type ActionProps = {
  label: string;
  onClick: () => void;
  color: string;
  enabled?: boolean;
} & ({ icon: IconName; glyph?: never } | { glyph: Glyph; icon?: never });

export function Action({ label, icon, glyph, onClick, color, enabled = true }: ActionProps) {
  return (
    <IconButton
      onClick={onClick}
      enabled={enabled}
      modifiers={Modifier.size(44).semantics({ contentDescription: label })}
    >
      {glyph ? <DrawnIcon glyph={glyph} color={color} /> : <Symbol icon={icon} color={color} />}
    </IconButton>
  );
}

export function Header({ palette, mode, onHistory, onOptions, onNew }: {
  palette: Palette; mode: Mode; onHistory: () => void; onOptions: () => void; onNew: () => void;
}) {
  return (
    <Column modifiers={Modifier.fillMaxWidth()}>
      <Row modifiers={Modifier.fillMaxWidth().height(60).padding("horizontal", 12)}
        horizontalArrangement="spaceBetween" verticalAlignment="centerVertically">
        <Action icon="Menu" label="Open conversations" color={palette.ink} onClick={onHistory} />
        <Row
          modifiers={Modifier.clip(rounded(18))
            .clickable({ onClick: onOptions, role: "button" })
            .semantics({ contentDescription: `Response mode, ${modes.find((item) => item.id === mode)?.label}` })
            .padding({ horizontal: 12, vertical: 8 })}
          verticalAlignment="centerVertically"
        >
          <Text text="Fieldnote" fontSize={21} fontWeight="semiBold" letterSpacing={-0.6} color={palette.ink} />
          <Spacer modifiers={Modifier.width(5)} />
          <Symbol icon="KeyboardArrowDown" color={palette.muted} size={16} />
        </Row>
        <Action icon="Create" label="New conversation" color={palette.ink} onClick={onNew} />
      </Row>
      <HorizontalDivider color={palette.edge} thickness={1} />
    </Column>
  );
}

export function Welcome({ palette, onPrompt }: { palette: Palette; onPrompt: (prompt: string) => void }) {
  const scroll = useScrollState();
  return (
    <Box modifiers={Modifier.fillMaxSize().verticalScroll(scroll)} contentAlignment="center">
      <Column
        modifiers={Modifier.widthIn({ max: 520 }).fillMaxWidth().padding({ horizontal: 24, vertical: 24 })}
        horizontalAlignment="centerHorizontally"
      >
        <Mark large palette={palette} />
        <Spacer modifiers={Modifier.height(19)} />
        <Text text="Start with a thought."
          modifiers={Modifier.semantics({ heading: true })}
          color={palette.ink} fontSize={31} lineHeight={38} letterSpacing={-1.1} fontWeight="semiBold" textAlign="center" />
        <Spacer modifiers={Modifier.height(8)} />
        <Text text="Ask a question, make a plan, or try an idea." color={palette.muted}
          fontSize={15} lineHeight={22} textAlign="center" />
        <Spacer modifiers={Modifier.height(28)} />
        {[starters.slice(0, 2), starters.slice(2)].map((group) => (
          <Row key={group[0].label} modifiers={Modifier.fillMaxWidth().padding({ bottom: 8 })}>
            {group.map(({ label, icon, prompt }) => (
              <Box key={label} modifiers={Modifier.weight(1).padding({ horizontal: 4 })}>
                <Column modifiers={Modifier.fillMaxWidth()
                  .clip(rounded(16))
                  .background(palette.surface)
                  .border(palette.edge, { width: 1, shape: rounded(16) })
                  .clickable({ onClick: () => onPrompt(prompt), role: "button" })
                  .padding({ horizontal: 13, vertical: 12 })}>
                  <Symbol icon={icon} color={palette.accent} size={18} />
                  <Spacer modifiers={Modifier.height(7)} />
                  <Text text={label} color={palette.ink} fontSize={14} fontWeight="medium" lineHeight={19} />
                </Column>
              </Box>
            ))}
          </Row>
        ))}
      </Column>
    </Box>
  );
}

export function Composer({
  palette, mode, draft, attachment, editing, generating, focus, onDraft, onAttachment,
  onRemove, onSend, onStop, onCancelEdit, onOptions,
}: {
  palette: Palette; mode: Mode; draft: string; attachment?: Attachment; editing: boolean; generating: boolean;
  focus: ComposeFocusRequester; onDraft: (value: string) => void; onAttachment: () => void; onRemove: () => void;
  onSend: () => void; onStop: () => void; onCancelEdit: () => void; onOptions: () => void;
}) {
  const canSend = !!draft.trim();
  const shape = rounded(24);
  return (
    <Box modifiers={Modifier.fillMaxWidth().padding({ horizontal: 13, top: 8, bottom: 8 })} contentAlignment="center">
      <Column modifiers={Modifier.widthIn({ max: 760 }).fillMaxWidth()} horizontalAlignment="centerHorizontally">
        <Column modifiers={Modifier.fillMaxWidth()
          .background(palette.surface, { in: shape })
          .border(palette.edge, { width: 1, shape })
          .padding({ top: 7, bottom: 5, start: 8, end: 8 })}>
          {editing && (
            <Row modifiers={Modifier.fillMaxWidth().padding({ start: 8 })}
              horizontalArrangement="spaceBetween" verticalAlignment="centerVertically">
              <Text text="Editing message" color={palette.accent} fontSize={13} fontWeight="medium" />
              <Action icon="Close" label="Cancel editing" color={palette.muted} onClick={onCancelEdit} />
            </Row>
          )}
          <AnimatedVisibility visible={!!attachment} enter={fade} exit={fade}>
            <Row modifiers={Modifier.fillMaxWidth().padding({ start: 8, end: 4 })}
              horizontalArrangement="spaceBetween" verticalAlignment="centerVertically">
              <Text text={attachment?.name ?? ""} color={palette.accent} fontSize={13} fontWeight="medium" />
              <Action icon="Close" label="Remove attachment" color={palette.muted} onClick={onRemove} />
            </Row>
          </AnimatedVisibility>
          <BasicTextField
            value={draft}
            onValueChange={onDraft}
            enabled
            readOnly={false}
            singleLine={false}
            keyboardOptions={{ capitalization: "sentences" }}
            keyboardActions={{}}
            visualTransformation={{ type: "none" }}
            interactionSource={null}
            textStyle={{ fontSize: 16, lineHeight: 23, color: palette.ink }}
            cursorBrush={palette.accent}
            minLines={1}
            maxLines={5}
            modifiers={Modifier.fillMaxWidth()
              .focusRequester(focus)
              .semantics({ contentDescription: "Message Fieldnote" })
              .padding({ horizontal: 9, vertical: 7 })}
            decorationBox={
              <Box modifiers={Modifier.fillMaxWidth()}>
                {draft.length === 0 && <Text text="Message Fieldnote" color={palette.muted} fontSize={16} lineHeight={23} />}
                <ComposeInnerContent />
              </Box>
            }
          />
          <Row modifiers={Modifier.fillMaxWidth()} verticalAlignment="centerVertically">
            <Action icon="Add" label="Add attachment" color={palette.ink} onClick={onAttachment} />
            <Row modifiers={Modifier.clip(rounded(13)).background(palette.panel)
              .clickable({ onClick: onOptions, role: "button" })
              .padding({ horizontal: 10, vertical: 6 })} verticalAlignment="centerVertically">
              <Symbol icon={mode === "explore" ? "Star" : "PlayArrow"} color={palette.accent} size={15} />
              <Spacer modifiers={Modifier.width(5)} />
              <Text text={mode === "explore" ? "Explore" : "Quick"} color={palette.ink} fontSize={12} fontWeight="medium" />
            </Row>
            <Spacer modifiers={Modifier.weight(1)} />
            <FilledIconButton
              enabled={generating || canSend}
              onClick={generating ? onStop : onSend}
              modifiers={Modifier.size(44).semantics({ contentDescription: generating ? "Stop response" : "Send message" })}
              shape="circle"
              colors={{
                containerColor: palette.accent,
                contentColor: palette.accentInk,
                disabledContainerColor: palette.panel,
                disabledContentColor: palette.muted,
              }}
            >
              <Crossfade targetState={generating ? 1 : 0} animationSpec={fade.animationSpec}>
                <DrawnIcon key="send" glyph="up" color={canSend ? palette.accentInk : palette.muted} />
                <DrawnIcon key="stop" glyph="stop" color={palette.accentInk} />
              </Crossfade>
            </FilledIconButton>
          </Row>
        </Column>
        <Spacer modifiers={Modifier.height(6)} />
        <Text text="Simulated replies · Offline" fontSize={11} color={palette.muted} textAlign="center" />
      </Column>
    </Box>
  );
}
