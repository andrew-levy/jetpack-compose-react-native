import { useEffect, useState, type ReactNode } from 'react';
import {
  AlertDialog,
  AnimatedVisibility,
  AssistChip,
  Badge,
  BadgedBox,
  Box,
  Button,
  Checkbox,
  CircularProgressIndicator,
  Column,
  ContainedLoadingIndicator,
  DatePicker,
  DatePickerDialog,
  DropdownMenu,
  DropdownMenuItem,
  FilledIconButton,
  FilledTonalButton,
  FilledTonalIconButton,
  FilterChip,
  FlowRow,
  HorizontalMultiBrowseCarousel,
  Icon,
  IconButton,
  Image,
  InputChip,
  LinearProgressIndicator,
  LoadingIndicator,
  ModalBottomSheet,
  Modifier,
  OutlinedButton,
  OutlinedTextField,
  RadioButton,
  Row,
  SmallFloatingActionButton,
  Snackbar,
  Spacer,
  SuggestionChip,
  Text,
  TextButton,
} from 'jetpack-compose-react-native';

import { useDismissibleSheet } from '../useDismissibleSheet';
import { carouselItems } from './carousel';
import { Group, Panel, Screen, SectionTitle, usePalette } from './screens';
import { radius } from './theme';

const fill = Modifier.fillMaxWidth();
const gap = (size: number) => <Spacer modifiers={Modifier.height(size)} />;
const hgap = (size: number) => <Spacer modifiers={Modifier.width(size)} />;
/** FlowRow has no spacing argument, so each child carries its own trailing and bottom gap. */
const Cell = ({ children }: { children: ReactNode }) => (
  <Box modifiers={Modifier.padding({ end: 8, bottom: 8 })}>{children}</Box>
);

function Buttons() {
  const [liked, setLiked] = useState(false);
  return (
    <Panel>
      <FlowRow modifiers={fill}>
        <Cell>
          <Button onClick={() => {}}>
            <Text text="Filled" />
          </Button>
        </Cell>
        <Cell>
          <FilledTonalButton onClick={() => {}}>
            <Text text="Tonal" />
          </FilledTonalButton>
        </Cell>
        <Cell>
          <OutlinedButton onClick={() => {}}>
            <Text text="Outlined" />
          </OutlinedButton>
        </Cell>
        <Cell>
          <TextButton onClick={() => {}}>
            <Text text="Text" />
          </TextButton>
        </Cell>
      </FlowRow>
      {gap(4)}
      <Row verticalAlignment="centerVertically">
        <IconButton onClick={() => setLiked(!liked)}>
          <Icon
            painter={{
              icon: 'Favorite',
              style: liked ? undefined : 'outlined',
            }}
            contentDescription="Like"
          />
        </IconButton>
        {hgap(4)}
        <FilledTonalIconButton onClick={() => {}}>
          <Icon
            painter={{ icon: 'Share', style: 'outlined' }}
            contentDescription="Share"
          />
        </FilledTonalIconButton>
        {hgap(8)}
        <FilledIconButton onClick={() => {}}>
          <Icon painter={{ icon: 'Add' }} contentDescription="Add" />
        </FilledIconButton>
        {hgap(12)}
        <SmallFloatingActionButton onClick={() => {}}>
          <Icon
            painter={{ icon: 'Edit', style: 'outlined' }}
            contentDescription="Edit"
          />
        </SmallFloatingActionButton>
      </Row>
    </Panel>
  );
}

const sizes = ['Small', 'Medium', 'Large'] as const;

function Selection() {
  const p = usePalette();
  const [sync, setSync] = useState(true);
  const [size, setSize] = useState<(typeof sizes)[number]>('Medium');
  const [starred, setStarred] = useState(true);
  const [tag, setTag] = useState(true);

  return (
    <Panel>
      <Row
        verticalAlignment="centerVertically"
        modifiers={fill.clickable(() => setSync(!sync))}
      >
        <Checkbox checked={sync} onCheckedChange={setSync} />
        <Text text="Sync photos" color={p.ink} />
      </Row>
      <Row verticalAlignment="centerVertically">
        {sizes.map((name) => (
          <Row
            key={name}
            verticalAlignment="centerVertically"
            modifiers={Modifier.padding({ end: 8 })}
          >
            <RadioButton
              selected={size === name}
              onClick={() => setSize(name)}
            />
            <Text text={name} color={p.ink} />
          </Row>
        ))}
      </Row>
      {gap(8)}
      <FlowRow modifiers={fill.padding({ start: 4 })}>
        <Cell>
          <FilterChip
            selected={starred}
            onClick={() => setStarred(!starred)}
            label={<Text text="Starred" />}
            leadingIcon={
              starred ? (
                <Icon
                  painter={{ icon: 'Check' }}
                  contentDescription={null}
                  modifiers={Modifier.size(18)}
                />
              ) : undefined
            }
          />
        </Cell>
        <Cell>
          <AssistChip
            onClick={() => {}}
            label={<Text text="Add event" />}
            leadingIcon={
              <Icon
                painter={{ icon: 'Event', style: 'outlined' }}
                contentDescription={null}
                modifiers={Modifier.size(18)}
              />
            }
          />
        </Cell>
        {tag ? (
          <Cell>
            <InputChip
              selected
              onClick={() => setTag(false)}
              label={<Text text="Design" />}
              trailingIcon={
                <Icon
                  painter={{ icon: 'Close' }}
                  contentDescription="Remove"
                  modifiers={Modifier.size(18)}
                />
              }
            />
          </Cell>
        ) : null}
        <Cell>
          <SuggestionChip
            onClick={() => setTag(true)}
            label={<Text text="Suggest" />}
          />
        </Cell>
      </FlowRow>
    </Panel>
  );
}

function Feedback() {
  return (
    <Panel>
      <Row
        modifiers={fill}
        horizontalArrangement="spaceBetween"
        verticalAlignment="centerVertically"
      >
        <CircularProgressIndicator modifiers={Modifier.size(36)} />
        <LoadingIndicator modifiers={Modifier.size(44)} />
        <ContainedLoadingIndicator modifiers={Modifier.size(48)} />
        <BadgedBox badge={<Badge content={<Text text="3" />} />}>
          <Icon
            painter={{ icon: 'Mail', style: 'outlined' }}
            contentDescription="Mail"
          />
        </BadgedBox>
      </Row>
      {gap(20)}
      <LinearProgressIndicator modifiers={fill} />
    </Panel>
  );
}

function Carousel() {
  return (
    <HorizontalMultiBrowseCarousel
      state={{}}
      preferredItemWidth={220}
      itemSpacing={8}
      modifiers={fill.height(240)}
    >
      {carouselItems.map((item, index) => (
        <Box
          key={`${index}-${item.title}`}
          modifiers={Modifier.fillMaxSize().maskClip(radius(28))}
        >
          <Image
            painter={{ source: item.image }}
            contentDescription={item.title}
            contentScale="crop"
            modifiers={Modifier.fillMaxSize()}
          />
          <Column
            modifiers={fill
              .align('bottomStart')
              .background({
                colors: ['rgba(0,0,0,0)', 'rgba(0,0,0,0.55)'],
                direction: 'vertical',
              })
              .padding({ start: 16, end: 16, top: 32, bottom: 16 })}
          >
            <Text
              text={item.title}
              fontSize={17}
              fontWeight="medium"
              color="#FFFFFF"
            />
            {item.subtitle ? (
              <Text
                text={item.subtitle}
                fontSize={13}
                color="rgba(255,255,255,0.8)"
              />
            ) : null}
          </Column>
        </Box>
      ))}
    </HorizontalMultiBrowseCarousel>
  );
}

function Overlays() {
  const p = usePalette();
  const [dialog, setDialog] = useState(false);
  const [sheetOpen, setSheetOpen] = useState(false);
  const [date, setDate] = useState(false);
  const [menu, setMenu] = useState(false);
  const [toast, setToast] = useState(false);
  const { sheet, hide, dismiss } = useDismissibleSheet(() =>
    setSheetOpen(false)
  );
  const chevron = (
    <Icon painter={{ icon: 'ChevronRight' }} contentDescription={null} />
  );

  useEffect(() => {
    if (!toast) return;
    const timer = setTimeout(() => setToast(false), 2500);
    return () => clearTimeout(timer);
  }, [toast]);

  return (
    <Column modifiers={fill}>
      <Group
        rows={[
          {
            title: 'Dialog',
            glyph: 'ChatBubbleOutline',
            trailing: chevron,
            onClick: () => setDialog(true),
          },
          {
            title: 'Bottom sheet',
            glyph: 'VerticalAlignBottom',
            trailing: chevron,
            onClick: () => setSheetOpen(true),
          },
          {
            title: 'Date picker',
            glyph: 'CalendarToday',
            trailing: chevron,
            onClick: () => setDate(true),
          },
          {
            title: 'Menu',
            glyph: 'MoreVert',
            onClick: () => setMenu(true),
            trailing: (
              <Box>
                {chevron}
                <DropdownMenu
                  expanded={menu}
                  onDismissRequest={() => setMenu(false)}
                  shape={radius(16)}
                >
                  {['Rename', 'Duplicate', 'Archive'].map((item) => (
                    <DropdownMenuItem
                      key={item}
                      text={<Text text={item} />}
                      onClick={() => setMenu(false)}
                    />
                  ))}
                </DropdownMenu>
              </Box>
            ),
          },
          {
            title: 'Snackbar',
            glyph: 'Notes',
            trailing: chevron,
            onClick: () => setToast(true),
          },
        ]}
      />

      <AnimatedVisibility
        visible={toast}
        enter={{ type: 'slide', direction: 'up' }}
        exit={{ type: 'fade' }}
      >
        <Box modifiers={fill.padding({ top: 12 })}>
          <Snackbar
            action={
              <TextButton onClick={() => setToast(false)}>
                <Text text="Undo" />
              </TextButton>
            }
          >
            <Text text="Message archived" />
          </Snackbar>
        </Box>
      </AnimatedVisibility>

      {dialog && (
        <AlertDialog
          onDismissRequest={() => setDialog(false)}
          icon={
            <Icon
              painter={{ icon: 'Delete', style: 'outlined' }}
              contentDescription={null}
            />
          }
          title={<Text text="Delete draft?" />}
          text={<Text text="This can't be undone." />}
          dismissButton={
            <TextButton onClick={() => setDialog(false)}>
              <Text text="Cancel" />
            </TextButton>
          }
          confirmButton={
            <TextButton onClick={() => setDialog(false)}>
              <Text text="Delete" />
            </TextButton>
          }
        />
      )}

      {sheetOpen && (
        <ModalBottomSheet onDismissRequest={dismiss} sheetState={sheet}>
          <Column modifiers={fill.padding({ start: 24, end: 24, bottom: 32 })}>
            <Text text="Share" fontSize={22} color={p.ink} />
            {gap(16)}
            {[
              ['Link', 'Link'],
              ['Email', 'MailOutline'],
              ['Nearby', 'NearMe'],
            ].map(([label, glyph]) => (
              <Row
                key={label}
                verticalAlignment="centerVertically"
                modifiers={fill.height(52).clickable(hide)}
              >
                <Icon
                  painter={{ icon: glyph, style: 'outlined' }}
                  contentDescription={null}
                  tint={p.muted}
                />
                {hgap(16)}
                <Text text={label} color={p.ink} />
              </Row>
            ))}
            {gap(8)}
            <Button onClick={hide} modifiers={fill}>
              <Text text="Done" />
            </Button>
          </Column>
        </ModalBottomSheet>
      )}

      {date && (
        <DatePickerDialog
          onDismissRequest={() => setDate(false)}
          confirmButton={
            <TextButton onClick={() => setDate(false)}>
              <Text text="OK" />
            </TextButton>
          }
          dismissButton={
            <TextButton onClick={() => setDate(false)}>
              <Text text="Cancel" />
            </TextButton>
          }
        >
          <DatePicker state={{ initialSelectedDateMillis: Date.now() }} />
        </DatePickerDialog>
      )}
    </Column>
  );
}

export function ComponentsScreen() {
  const p = usePalette();
  const [name, setName] = useState('');
  return (
    <Screen>
      <SectionTitle title="Buttons" />
      <Buttons />
      <SectionTitle title="Selection" />
      <Selection />
      <SectionTitle title="Text field" />
      <OutlinedTextField
        modifiers={fill}
        value={name}
        onValueChange={setName}
        label={<Text text="Name" />}
        leadingIcon={
          <Icon
            painter={{ icon: 'Person', style: 'outlined' }}
            contentDescription={null}
          />
        }
        supportingText={
          <Text
            text={
              name.trim() ? `Hi, ${name.trim()}` : 'What should we call you?'
            }
            color={p.muted}
          />
        }
      />
      <SectionTitle title="Feedback" />
      <Feedback />
      <SectionTitle title="Carousel" />
      <Carousel />
      <SectionTitle title="Overlays" />
      <Overlays />
    </Screen>
  );
}
