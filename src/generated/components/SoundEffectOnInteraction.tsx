// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent } from "../../runtime/createComposableComponent";

export interface SoundEffectOnInteractionProps {
  enabled: boolean;
  children?: ReactNode;
}
export const SoundEffectOnInteraction = createComposableComponent<SoundEffectOnInteractionProps>({
  name: "SoundEffectOnInteraction",
  props: ["enabled"],
  children: true,
});
