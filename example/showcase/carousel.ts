import type { ComposeImageSource } from "jetpack-compose-react-native";

export type CarouselItem = {
  /** Shown over the bottom of the image. */
  title: string;
  /** Optional smaller line under the title. */
  subtitle?: string;
  /**
   * The picture. Either:
   *   - a bundled file:  require("./images/beach.jpg")   (put the file in example/showcase/images/)
   *   - a remote image:  { uri: "https://example.com/beach.jpg" }
   */
  image: ComposeImageSource;
};

/** Add, remove or reorder entries to change the carousel on the Components tab. */
export const carouselItems: CarouselItem[] = [
  { title: "Fjord", subtitle: "Morning light", image: { uri: "https://picsum.photos/id/1015/800/1000" } },
  { title: "Canyon", subtitle: "Red rock", image: { uri: "https://picsum.photos/id/1016/800/1000" } },
  { title: "Highlands", subtitle: "Misty ridge", image: { uri: "https://picsum.photos/id/1018/800/1000" } },
  { title: "Winter", subtitle: "First snow", image: { uri: "https://picsum.photos/id/1036/800/1000" } },
  { title: "Falls", subtitle: "Into the green", image: { uri: "https://picsum.photos/id/1039/800/1000" } },
  { title: "Cliffs", subtitle: "Granite walls", image: { uri: "https://picsum.photos/id/1043/800/1000" } },
];
