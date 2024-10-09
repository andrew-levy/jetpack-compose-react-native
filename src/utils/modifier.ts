interface Modifier {
  padding(value: number): Modifier;
}

class ModifierBuilder {
  private modifierArray: Record<string, any>[] = [];

  // Constructor to optionally accept an existing array (for immutability)
  constructor(existingModifiers?: Record<string, any>[]) {
    if (existingModifiers) {
      this.modifierArray = [...existingModifiers]; // Copy existing modifiers
    }
  }

  // Method that creates a new ModifierBuilder with updated modifiers
  padding(value: number): ModifierBuilder {
    // Return a new instance of ModifierBuilder with updated modifierArray
    return new ModifierBuilder([...this.modifierArray, { padding: value }]);
  }

  build(): Record<string, any>[] {
    return this.modifierArray; // Return the list of accumulated modifiers
  }
}

export const Modifier: Modifier = new ModifierBuilder();
