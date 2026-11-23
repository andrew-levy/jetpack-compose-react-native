# cpp/

Platform-independent C++ for the Fabric integration: the shadow node of the Compose components,
their Fabric state, measurement and the layout of embedded React children. It is compiled into the
Codegen library `react_codegen_JpcSpec` by `android/src/main/jni/CMakeLists.txt`, with this folder on
the include path, so every include is written relative to `cpp/`
(e.g. `#include "layout/ComposeChildLayout.h"`).

Each layer depends only on the layers above it:

| Folder          | Contents                                                                                                   |
| --------------- | ---------------------------------------------------------------------------------------------------------- |
| `core/`         | Shared numeric helpers (`ComposeLayoutMath.h`): infinity and Compose's unbounded proposals.               |
| `state/`        | `ComposeHostStateData`: what Kotlin reports through `StateWrapper.updateState`, the measured Compose size and the size proposed to each React child. |
| `measurement/`  | `measureComposeHost`: the Yoga size of a Compose root for given constraints.                                |
| `layout/`       | `layoutComposeChildren`: lays out each embedded React child at Compose's proposal and keeps its subtree one native view. |
| `shadownodes/`  | `ComposeShadowNode`: the shadow node of `JpcComposeHost` (a state-measured leaf) and `JpcComposeNode`.     |
| `descriptors/`  | `ComposeComponentDescriptors.h`: binds the Codegen components to the shadow node, in `facebook::react` for autolinking. |

`android/src/main/jni/react/renderer/components/JpcSpec/ComponentDescriptors.h` replaces the header
Codegen writes at that path and only includes `descriptors/`. React Native's autolinking includes it
under that name and registers the descriptors listed in `react-native.config.js`.

The Kotlin side of the state contract is `ComposeContainerView.requestFabricLayout` in
`android/src/main/java/com/jetpackcomposereactnative/generated/ComposeContainerView.kt`. Sizes are in
points, and a negative proposal means Compose leaves that axis unbounded.
