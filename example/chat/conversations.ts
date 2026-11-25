export const modes = [
  { id: "quick", label: "Quick", description: "Short answers for everyday questions." },
  { id: "explore", label: "Explore", description: "More detail, examples, and next steps." },
] as const;

export type Mode = typeof modes[number]["id"];
export type Notice = { text: string };
export type Attachment = { name: string; description: string; excerpt: string };

export const attachments: readonly Attachment[] = [
  {
    name: "Weekend notes.txt",
    description: "A short trip brief",
    excerpt: "A late Saturday start, one outdoor stop, one good meal, and a relaxed Sunday.",
  },
  {
    name: "Studio brief.txt",
    description: "A sample creative brief",
    excerpt: "Make a small reading corner feel calm and inviting using what is already in the room.",
  },
];

export const starters = [
  { label: "Plan a weekend", icon: "DateRange", prompt: "Plan a low-key weekend in a new city." },
  { label: "Explain a concept", icon: "Info", prompt: "Explain how the northern lights work." },
  { label: "Help me write", icon: "Edit", prompt: "Help me write a warm thank-you note after a dinner party." },
  { label: "Brainstorm", icon: "Star", prompt: "Brainstorm a few small creative projects for a rainy afternoon." },
] as const;

export type Turn = {
  id: string;
  prompt: string;
  mode: Mode;
  attachment?: Attachment;
  status: "streaming" | "complete" | "stopped";
  reply: string;
  feedback?: "up" | "down";
};

export type Conversation = { id: string; title: string; turns: Turn[] };

const examples = [
  {
    match: /aurora|northern lights/i,
    answer: "The northern lights start at the Sun. It sends charged particles into space, and Earth's magnetic field guides some of them toward the poles.\n\nWhen the particles collide with oxygen and nitrogen high in the atmosphere, those gases give off light. Oxygen often glows green, while nitrogen can add blue or purple.\n\nThink of it as the atmosphere lighting up where the solar wind and Earth's magnetic field meet.",
    retry: "Picture a compass near a bar magnet. Earth's magnetic field also has lines that lead toward its poles. The particles arriving from the Sun follow those paths, then transfer energy to atmospheric gases. Those gases give the energy back as light.",
    extra: "Why the colors change\n\nThe same gas can give off different colors at different altitudes. High above the familiar green bands, oxygen can also produce a quieter red glow. A dark sky and a clear view toward the pole make faint auroras easier to see.",
  },
  {
    match: /weekend|trip|itinerary/i,
    answer: "A slow weekend works best with one anchor each day and room to wander in between.\n\nSaturday · Pick a walkable neighborhood. Get coffee, spend an hour in a bookstore or small museum, and make dinner your one reservation.\n\nSunday · Find a greenway or waterfront for a morning walk. Follow it with a long brunch and a short stop somewhere you spotted on Saturday.",
    retry: "Build the trip around a single walk. Pick a neighborhood with a café, a park, and a place for dinner. Save those three spots and walk between them at your own pace. The next morning, revisit whichever stop you wanted more time for.",
    extra: "Leave some room\n\nKeep each day's stops close together. Save one indoor option in case it rains, and leave Sunday afternoon open so the weekend ends at the same pace it started. A neighborhood bakery or market makes an easy last stop.",
  },
  {
    match: /thank|dinner party/i,
    answer: "I had such a lovely time at dinner. Thank you for making everyone feel so at home. I've been thinking about how easily we all settled into conversation around your table. I'd love to have you over next time.",
    retry: "Thank you for dinner and for making the evening feel so easy. It was good to slow down and catch up around your table. I'll be thinking about that night for a while. Next time, let me cook.",
    extra: "To make it feel more personal, swap in one small detail you actually remember, like the dish you went back for or a story that made the table laugh.",
  },
  {
    match: /brainstorm|creative projects|rainy afternoon/i,
    answer: "Try a project you can finish in one sitting.\n\n• Make a tiny photo essay about one corner of your home.\n• Draw a map of an imaginary neighborhood and name its shops.\n• Make a playlist for a fictional road trip and design a cover for it.\n• Turn a scrap of cardboard into a postcard and send it to a friend.",
    retry: "Make a small zine from one sheet of paper. Fold it into eight panels, pick a theme like things you can see from your window, and fill each page with one sketch or sentence. Give the finished zine a title.",
    extra: "Start with a 30-minute timer and use whatever you already have. If you want something to share, the postcard or the playlist gives you a finished thing to send by the end of the afternoon.",
  },
  {
    match: /reading|book|room/i,
    answer: "I'd build the corner around one comfortable chair, a warm lamp, and a clear spot for your book. Pull the chair slightly away from the wall and angle it toward the light.\n\nThen try it for an evening before buying anything. A small change in where the lamp sits can do more than adding another piece of furniture.",
    retry: "Start with the spot that gets the best light at the time you actually read. Move a chair there, set a light just behind your shoulder, and use an existing stool or shelf as a side table. Try it for a few nights before moving anything else.",
    extra: "For a quick reset, move everything that doesn't belong to reading somewhere else for a week. Keep one blanket and a small tray if you drink tea there. The fewer things you need to shift before sitting down, the more often you'll use the corner.",
  },
];

export function mockReply(prompt: string, mode: Mode, attempt: number, attachment?: Attachment): string {
  const example = examples.find(({ match }) => match.test(prompt));
  const answer = (attempt > 0 ? example?.retry : example?.answer)
    ?? "I'd start by deciding what a good outcome would look like in one sentence. Then pick the smallest step that would give you something to react to.\n\nIf you're choosing between a few directions, make two rough versions and compare them side by side. The comparison usually tells you more than trying to settle every detail upfront.";
  const extra = mode === "explore"
    ? "\n\n" + (example?.extra ?? "Try turning the first step into something you could do in 15 minutes. Note what you learned and use it to choose a specific next step.")
    : "";
  const context = attachment ? `From ${attachment.name}: “${attachment.excerpt}”\n\n` : "";
  const retry = attempt > 0 ? "Here's another way to approach it.\n\n" : "";
  return context + retry + answer + extra;
}

export function titleFor(prompt: string): string {
  const title = prompt.trim().replace(/\s+/g, " ");
  return title.length > 35 ? title.slice(0, 34).trimEnd() + "…" : title;
}

export const sampleConversations: Conversation[] = [
  {
    id: "reading",
    title: "A cozy reading corner",
    turns: [{
      id: "reading-sample",
      prompt: "How can I make a cozy reading corner in a small room?",
      mode: "explore",
      status: "complete",
      reply: mockReply("reading corner", "explore", 0),
    }],
  },
  {
    id: "weekend",
    title: "A slower Saturday",
    turns: [{
      id: "weekend-sample",
      prompt: "Plan a low-key weekend in a new city.",
      mode: "quick",
      status: "complete",
      reply: mockReply("weekend", "quick", 0),
    }],
  },
];
