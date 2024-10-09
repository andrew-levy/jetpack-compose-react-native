interface Modifier {
  padding(value: number): Modifier;
  width(value: number): Modifier;
  height(value: number): Modifier;
  size(value: number): Modifier;
  fillMaxHeight(): Modifier;
  fillMaxWidth(): Modifier;
  fillMaxSize(): Modifier;
  border(value: {
    width?: number;
    brush?: string;
    color?: string;
    shape?: string;
  }): Modifier;
  alpha(value: number): Modifier;
  backgroundColor(value: { color: string; shape?: string }): Modifier;
  backgroundBrush(value: {
    brush: string;
    shape?: string;
    alpha?: number;
  }): Modifier;
  clipToBounds(): Modifier;
  shadow(value: {
    elevation?: number;
    shape?: string;
    clip?: boolean;
    ambientColor?: string;
    spotColor?: string;
  }): Modifier;
  zIndex(value: number): Modifier;
}

class ModifierBuilder {
  private modifierArray: Record<string, any>[] = [];

  constructor(existingModifiers?: Record<string, any>[]) {
    if (existingModifiers) {
      this.modifierArray = [...existingModifiers]; // Copy existing modifiers
    }
  }

  padding(value: number): ModifierBuilder {
    return new ModifierBuilder([...this.modifierArray, { padding: value }]);
  }

  width(value: number): ModifierBuilder {
    return new ModifierBuilder([...this.modifierArray, { width: value }]);
  }

  height(value: number): ModifierBuilder {
    return new ModifierBuilder([...this.modifierArray, { height: value }]);
  }

  size(value: number): ModifierBuilder {
    return new ModifierBuilder([...this.modifierArray, { size: value }]);
  }

  fillMaxHeight(): ModifierBuilder {
    return new ModifierBuilder([
      ...this.modifierArray,
      { fillMaxHeight: true },
    ]);
  }

  fillMaxWidth(): ModifierBuilder {
    return new ModifierBuilder([...this.modifierArray, { fillMaxWidth: true }]);
  }

  fillMaxSize(): ModifierBuilder {
    return new ModifierBuilder([...this.modifierArray, { fillMaxSize: true }]);
  }

  border(value: {
    width?: number;
    brush?: string;
    color?: string;
    shape?: string;
  }): ModifierBuilder {
    return new ModifierBuilder([...this.modifierArray, { border: value }]);
  }

  alpha(value: number): ModifierBuilder {
    return new ModifierBuilder([...this.modifierArray, { alpha: value }]);
  }

  backgroundColor(value: { color: string; shape?: string }): ModifierBuilder {
    return new ModifierBuilder([
      ...this.modifierArray,
      { backgroundColor: value },
    ]);
  }

  backgroundBrush(value: {
    brush: string;
    shape?: string;
    alpha?: number;
  }): ModifierBuilder {
    return new ModifierBuilder([
      ...this.modifierArray,
      { backgroundBrush: value },
    ]);
  }

  clipToBounds(): ModifierBuilder {
    return new ModifierBuilder([...this.modifierArray, { clipToBounds: true }]);
  }

  shadow(value: {
    elevation?: number;
    shape?: string;
    clip?: boolean;
    ambientColor?: string;
    spotColor?: string;
  }): ModifierBuilder {
    return new ModifierBuilder([...this.modifierArray, { shadow: value }]);
  }

  zIndex(value: number): ModifierBuilder {
    return new ModifierBuilder([...this.modifierArray, { zIndex: value }]);
  }

  build(): Record<string, any>[] {
    return this.modifierArray;
  }
}

export const Modifier: Modifier = new ModifierBuilder();
