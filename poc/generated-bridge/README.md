# Generated Compose bridge — isolated proof of concept

This folder does not change the published library, the existing Expo components, or Android's production source set. It is a **downstream generator** experiment, not yet a working React Native/Fabric renderer.

## What it demonstrates

- One **normalized API manifest** drives both generated TypeScript component declarations and **compiled Kotlin-call source**.
- A shared `createComposable<Props>()` factory can be generated for each component rather than maintained separately.
- A generated Kotlin `when` dispatcher can call real Compose function names, forward child content, and supply callback lambdas.
- The generated dispatch compiles with the Kotlin compiler **against test stubs**, proving Kotlin syntax/dispatch behavior, *not* AndroidX Compose / Compose compiler support.
- Output is deterministic: `node poc/generated-bridge/generate.mjs --check`.

## Files

- `api-fixture.json`: deliberately limited, manually checked input schema for **Column**, **Text**, **Button**. This is **not** automatic extraction.
- `generate.mjs`: downstream TS/Kotlin code emitter.
- `generated/components.tsx`: typed wrappers using a single factory.
- `generated/ComposableRegistry.kt`: native Kotlin dispatch from the same schema.
- `runtime/createComposable.tsx`: factory with an **unimplemented Fabric adapter injection point**, intentionally throws if no adapter installed.
- `kotlin-test/`: stubs and a runnable, small Kotlin dispatch/children/event smoke test.

## Local validation

```bash
node poc/generated-bridge/generate.mjs --check
kotlinc poc/generated-bridge/generated/ComposableRegistry.kt poc/generated-bridge/kotlin-test/*.kt -include-runtime -d /tmp/compose-poc.jar
java -jar /tmp/compose-poc.jar
```

## Verified with real AndroidX artifacts (GitHub Actions)

- [Generated Kotlin explicitly compiled against Compose](https://github.com/andrew-levy/jetpack-compose-react-native/actions/runs/44447893766) — **PASS** using Kotlin 2.0.21 + Compose compiler + AndroidX Foundation and Material 3.
- [KSP extractor + Compose compile](https://github.com/andrew-levy/jetpack-compose-react-native/actions/runs/44448882425) — **PASS**. Extractor enumerated **5 @Composable Text/Button overloads** from the Material 3 dependency classpath, including parameter names/types and default-argument presence, then ran real Kotlin compilation.
- **Important separation:** The downstream `generate.mjs` still consumes a **manual fixture**, not KSP output. Automatic extraction-to-TS/Kotlin end-to-end and Fabric runtime are **not proven**.

## Explicitly NOT verified yet

1. Generalized **KSP/Analysis extraction-to-manifest pipeline** beyond 5 Material 3 overloads, with source JARs for default expressions/KDoc, receivers, value types, overload resolution and version constraints. The limited classpath extraction test passed.
2. Runtime/execution correctness (a compile test does not prove UI behavior).
3. Native **Fabric** host registration, node reconciliation, per-node identity, child mount/unmount behavior, layout measurement, Compose recomposition, Android activity lifecycle, and event routing to JavaScript.
4. Modifier decoding (the Kotlin `ComposeNode` contract in this experiment is supplied by stubs), value conversion, state, bindings, lists and dynamic composable slots.
5. Nitro Modules setup on Android (Nitrogen is for auxiliary HybridObjects, not source API discovery).

## Proposed next experiments

**A.** **Completed (compile-level):** Android Gradle project compiles generated Kotlin against real Compose libraries. **Next:** replace minimal `ComposeNode` contract with stateful decoding and run Android device tests.

**B.** Implement one Android Fabric host and measure how nested/generated React nodes can be assembled into one stable Compose composition. Compare with v7's per-component Fabric descriptors. Do not decide one-root vs per-component Fabric without measuring mount correctness and layout.

**C.** **Partially validated:** KSP can see published AndroidX Material 3 declarations. Integrate KSP extraction output directly with `generate.mjs` and build comprehensive overload/default/scope handling. Reject source declarations that the Kotlin code emitter cannot compile.

This proof-of-concept intentionally has a narrow, honest success criterion. No claim of a working Android React Native library is made here.
