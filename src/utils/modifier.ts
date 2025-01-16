interface Modifier {
  padding(
    value:
      | number
      | {
          horizontal?: number;
          vertical?: number;
          top?: number;
          bottom?: number;
          start?: number;
          end?: number;
          left?: number;
          right?: number;
        }
  ): Modifier;
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

  padding(
    value:
      | number
      | {
          horizontal?: number;
          vertical?: number;
          top?: number;
          bottom?: number;
          start?: number;
          end?: number;
          left?: number;
          right?: number;
        }
  ): ModifierBuilder {
    if (typeof value === "number") {
      return new ModifierBuilder([...this.modifierArray, { padding: value }]);
    } else if (typeof value === "object" && value !== null) {
      const paddingObject: Record<string, number | undefined> = {};
      if (value.horizontal !== undefined) {
        paddingObject.horizontal = value.horizontal;
      }
      if (value.vertical !== undefined) {
        paddingObject.vertical = value.vertical;
      }
      if (value.top !== undefined) {
        paddingObject.top = value.top;
      }
      if (value.bottom !== undefined) {
        paddingObject.bottom = value.bottom;
      }
      if (value.start !== undefined) {
        paddingObject.start = value.start;
      }
      if (value.end !== undefined) {
        paddingObject.end = value.end;
      }
      if (value.left !== undefined) {
        paddingObject.left = value.left;
      }
      if (value.right !== undefined) {
        paddingObject.right = value.right;
      }

      return new ModifierBuilder([
        ...this.modifierArray,
        { padding: paddingObject },
      ]);
    }

    return this;
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
