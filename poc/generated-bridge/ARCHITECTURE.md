# SwiftUI v7 source-to-runtime audit and proposed Compose mapping

Reference: [swiftui-react-native v7-public-beta](https://github.com/andrew-levy/swiftui-react-native/tree/v7-public-beta).

**Audit boundary:** The public branch contains the generated code and shipped runtime, but NOT the generator's implementation or its source-SDK extraction pipeline. Its `package.json` lacks a `generate` script despite `runtime/cpp/README.md` mentioning `bun run generate`. Therefore the *exact SwiftUI symbol discovery, filtering and type-normalization algorithm is not observable* here. This report reconstructs the remaining pipeline from the actual source, without implying uninspected code was verified.

## A. Source generation / package assembly

1. **SDK source input:** The project's README says generated API code comes from Apple's SwiftUI SDK. The exact SDK scanner, symbol graph parsing, filtering and heuristics cannot be checked from this branch.
2. **Generated TS component declarations:** `runtime/react-native/generated/components/*.tsx` contain initializer overloads, JS props, KDoc-style descriptions, original Swift declaration, and OS requirements (e.g. `Button.tsx`, `VStack.tsx`).
3. **Generated JS factory calls:** Each generated wrapper calls handwritten `createSwiftUIComponent<Props>(NativeX, description)`. Description identifies prop names, children strategy, event/asset/recorded-closure handling.
4. **Generated TS values:** `modifiers/values.ts`, `support.ts`, `factories.ts` model Swift structs, enums, option sets, geometry and symbolic/opaque/unsupported types. Native values can use symbolic factory chains.
5. **Generated modifier declarations:** `modifiers/view.ts`, `arguments.ts`, `runtime.ts`, `builders.ts` enumerate typed overloads and runtime names; `compose()` is handwritten and dynamically adds those methods.
6. **Generated Swift components:** `apple/Generated/SUIComponents.generated.swift` contains one host per view, a list of overload candidates and argument decoding; calls actual SwiftUI initializers inside native Swift source.
7. **Generated Swift modifiers/values:** `SUIModifiers.generated.swift`, `SUIValues.generated.swift`, `SUIChains.generated.swift`, `SUIRuntime.generated.swift`, `SUIFamilies.generated.swift` compile native calls, handle value types, generic families and special runtime/closure cases.
8. **Generated Fabric specs:** `runtime/react-native/specs/generated/SwiftUIGenerated*NativeComponent.ts` expose uniform `nodeProps`, `modifiers` and `onEvent`; React Native Codegen generates corresponding Fabric glue.
9. **Generated native registration:** `cpp/generated/SwiftUIGeneratedComponentDescriptors.h` and `apple/Generated/SUIGeneratedComponents.mm` register the per-component Fabric descriptors/views; `package.json` declares all classes in `codegenConfig.ios.components`.
10. **Nitro is separate:** `react-native/nitro/specs/SwiftUIRuntime.nitro.ts` and `SwiftUIColorResolver.nitro.ts` are hand-authored Nitro specs. Nitrogen generates `nitrogen/generated/ios/**` C++/Swift bindings, NOT SwiftUI view APIs.
11. **Build/packaging:** `package.json` uses Bob to run `nitrogen`, ESM and TS declaration builds; `SwiftUIReactNative.podspec` includes generated + handwritten Swift/ObjC++/C++ source and Nitrogen's autolinking Ruby; `react-native.config.js` disables Android. The examples and GitHub Actions validate packaging and TS output, not necessarily the whole generated iOS API at runtime.

## B. Render path at runtime (JS -> native -> SwiftUI)

12. **User JSX:** An exported TS component (e.g. `<VStack>`) is generated, typechecked and invoked by React.
13. **Common JS factory:** `runtime/react-native/runtime/component.tsx` iterates its descriptor's supported props; extracts style/testID, classifies children and initializes a `BridgeRegistry`.
14. **Prop serialization:** `runtime/react-native/runtime/bridge.ts` translates primitive values, Date, undefined, NaN/infinity, arrays, objects, callbacks (`$fn`), React slots (`$slot`), Bindings (`$binding`), value/modifier chains. Callback IDs and slots are registered against the component render.
15. **Modifier chain serialization:** `runtime/react-native/runtime/compose.ts` records immutable modifier-call chains. Some values/functions are recorded symbolically instead of passed literally; JS-only environment/focus modifiers are consumed by the JS runtime.
16. **Special child processing:** The JS factory supports plain nodes, textual children, named parts, collection/ForEach keys, render-function slots, recorded closures, and native React views. `Part` components carry detached slot content where needed.
17. **One Fabric element per generated type:** The wrapper renders `<NativeX nodeProps={JSON.stringify(...)} modifiers={JSON.stringify(...)} onEvent={...}>` with child React elements.
18. **Fabric props/event pipeline:** RN Codegen emits typed C++ props and event emitters. `SUIGeneratedComponentView.h` uses `SUI_GENERATED_COMPONENT_VIEW` to compare two JSON-string props, emit `onEvent`, and supply descriptor metadata.
19. **Objective-C++ fabric host:** `apple/Fabric/SUIComponentView.mm` instantiates a corresponding Swift `SUIGenerated{Name}HostView` using `NSClassFromString` (Swift cannot subclass `RCTViewComponentView` directly).
20. **Swift host node:** `SUINodeHostView` in `apple/Runtime/SUINode.swift` owns an observable `SUINode`, receives prop/modifier changes, parses JSON, updates the node, and dispatches events through `SUIContext`. Scope commits batch some changes.
21. **Nested SwiftUI child consolidation:** `reactChildrenDidChange()` identifies nested `SUINodeHostView` children and stores their nodes in its own child list; `measurementOwner` prevents nested hosts from retaining separate hosting controllers. Non-SwiftUI RN views are represented as `SUIChild.react`.
22. **Root SwiftUI composition:** `apple/Hosting/SwiftUIHostView.swift` installs `SUIHostingController` for the root; `SUINodeView.body` observes the node and calls `node.renderContent()` and then `.suiModifiers()`. `ReactChildView.swift` embeds arbitrary native RN views with `UIViewRepresentable`.
23. **Native overload resolution:** Generated hosts test overloads using `node.expect(allowed, required, nodes)`, decode typed values using `SUIValues` / `SUIDecoding`, check `#available`, and invoke real SwiftUI APIs. Failed matches collect reasons; errors surface through `SUIContext`.
24. **Modifiers:** Native `SUIGeneratedModifiers.apply` applies generated modifiers in order, with a few handwritten special cases (e.g. symbol effects/focus). Errors are reported without bringing down the entire tree.
25. **Recomposition:** Observable `SUINode` changes trigger SwiftUI body updates. React component identities and Swift child serials are kept stable; the runtime invalidates parent consumers when a slot or family changes.
26. **Native measurements -> Yoga:** `SwiftUIHostView` computes ideal/fitted/flexible size via `UIHostingController.sizeThatFits`; ObjC++ passes that into Fabric state; `SwiftUIHostShadowNode.h` measures as a leaf and lays out React children using `SwiftUIChildLayout`. SwiftUI width proposals for RN children flow back to Fabric, resolving a bidirectional layout problem.
27. **Event/callback roundtrip:** Swift calls `SUIContext.invoke/emit` -> host `onEvent` -> ObjC++ event emitter -> JS `BridgeRegistry.handle` -> stored callback, event handler, or Binding setter.
28. **Dynamic closures/collections:** Swift can request React-rendered slots asynchronously via `$render`; JS calls the closure, mounts `Part` content and rerenders. Collection rows use generated `$elements` IDs. `SUIProgram` and symbolic expressions cover some imperative native drawing/geometry operations.
29. **Additional JS state:** `useBinding`, observable proxies, environment objects, focus tokens, recorded programs and symbolic values are managed by TS runtime modules; corresponding Swift runtime pieces do native execution.
30. **Imperative native calls:** Swift objects/handles are registered in `SUIHandles`. JS uses Nitro `SwiftUIRuntime.call` (async) and `.evaluate` (sync); ColorResolver is another Nitro HybridObject. They supplement Fabric but do not render ordinary JSX views.
31. **Error, lifecycle, availability:** Native error/overload probe messages feed back to JS; hosting controller ownership and measurement subscriptions are managed; generated `#available` checks protect SDK-specific APIs.

## C. Closest Android equivalent

| SwiftUI v7 stage | Compose equivalent |
| --- | --- |
| SwiftUI SDK declaration extraction | Pinned AndroidX artifacts plus Kotlin symbol extraction (Analysis API/KSP), sources JAR for docs/default expressions |
| Initializer overload type unions | Overloaded `@Composable` functions represented in generated TS prop unions |
| Swift value types | Compose `Dp`, `TextUnit`, `Color`, `Shape`, `Arrangement` etc. with generated TS factories and Kotlin decoders |
| Generated Swift component host | Generated Kotlin `@Composable` invoker (must compile with Compose compiler; not dynamic reflection) |
| Generated `ViewModifiers` | Generated JS chain + native Kotlin `Modifier` application; receiver scopes must be respected |
| `createSwiftUIComponent` | Shared `createComposable` JS factory, per-type descriptors |
| Per-view Fabric Codegen and descriptors | Per-composable Fabric specs/view managers; *logical* child-node consolidation to avoid nesting a `ComposeView` per component |
| `SUINode` / `SUIContext` | Mutable state-backed `ComposeNode` tree, event/binding/slot registry, lifecycle management |
| Root `UIHostingController` | Root `ComposeView.setContent` with appropriate `ViewCompositionStrategy` |
| `UIViewRepresentable` native child | `AndroidView` for non-Compose React Native children |
| SwiftUI state invalidation | Compose snapshots/observable node state, preserve stable identities for reconciliation |
| SwiftUI's sizeThatFits/child width proposals | Compose measure/layout constraints <-> Fabric/Yoga measure-state feedback |
| Swift async render-closures/slots | React-driven slots/placeholder nodes with host-requested rerender; specialized scope receivers |
| Swift Nitro HybridObjects | Android Kotlin Nitro HybridObjects and Nitrogen-generated C++/JNI bindings |
| CocoaPods / ObjC++ bridging | Android Gradle Plugin, Kotlin Compose compiler and Android RN Fabric/C++ registration |
| Swift `#available` | AndroidX/BOM versioning, Android SDK gates, `@OptIn` and experimental-feature compatibility |
| Bob, Codegen, Nitrogen packaging | Same Bob/React Native Codegen/Nitrogen concepts, Android AAR/Gradle/autolinking replacing CocoaPods |

### Important differences that cannot be omitted

- The Composition compiler makes Kotlin **compile-time calls** essential; a reflective name-to-function runtime is not a safe general solution.
- `RowScope`, `ColumnScope`, `LazyListScope`, `BoxScope` and extension receivers must be preserved in the API manifest.
- Source-level Kotlin defaults are not all available as compiled metadata; missing/complex defaults need source analysis and supported-call generation.
- `remember`, `LaunchedEffect`, `DisposableEffect`, CompositionLocals, specialized drawing and arbitrary Kotlin closures need custom mappings or a narrowly typed bridge, not blindly generated React props.
- Android Fabric child-tree behavior and Yoga/Compose measurement require **real device or emulator verification**. Compiling native invokers alone does not validate runtime semantics.

## D. Validation gates

- **Gate 1 (local):** Same manifest generates TS + Kotlin; Kotlin dispatch compiles against test stubs and runs child/event smoke. **Passed locally.**
- **Gate 2 (GitHub CI):** Generated Kotlin compiles against real AndroidX Compose and the Kotlin Compose plugin. **PASSED** ([build](https://github.com/andrew-levy/jetpack-compose-react-native/actions/runs/44447893766)).
- **Gate 3:** React/Fabric node mounting, nesting, updates and unmounting link into one Compose composition. **Not built/tested yet.**
- **Gate 4:** Real Android layout + events + state/recomposition test in emulator, including non-Compose React Native children. **Not built/tested yet.**
- **Gate 5:** **PARTIALLY VALIDATED.** KSP discovered 5 Material 3 Text/Button @Composable overloads and their parameter signatures from published dependencies ([build](https://github.com/andrew-levy/jetpack-compose-react-native/actions/runs/44448882425)). **NOT DONE:** KSP-to-manifest linkage, source-level default expressions, general overloads, receiver scopes, version matrix and complete API-surface coverage.

Do not merge into `main` until Gates 2-4 pass. Gate 5 is necessary before claiming automated API-surface coverage.
