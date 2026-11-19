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

## Explicitly NOT verified yet

1. Reading complete Compose declarations from AndroidX artifacts. **Next: Kotlin Analysis API or KSP + source archives**, preserving overloads, default expressions, receivers, value types and version constraints.
2. Compiling generated code against **real AndroidX Compose dependencies and the Compose compiler**. Stub-based testing is not proof.
3. Native **Fabric** host registration, node reconciliation, per-node identity, child mount/unmount behavior, layout measurement, Compose recomposition, Android activity lifecycle, and event routing to JavaScript.
4. Modifier decoding (the Kotlin `ComposeNode` contract in this experiment is supplied by stubs), value conversion, state, bindings, lists and dynamic composable slots.
5. Nitro Modules setup on Android (Nitrogen is for auxiliary HybridObjects, not source API discovery).

## Proposed next experiments

**A.** Add an Android Gradle test module and real Compose dependencies; compile `ComposableRegistry.kt` using the Compose compiler, retaining a minimal non-stub `ComposeNode` decoder.

**B.** Implement one Android Fabric host and measure how nested/generated React nodes can be assembled into one stable Compose composition. Compare with v7's per-component Fabric descriptors. Do not decide one-root vs per-component Fabric without measuring mount correctness and layout.

**C.** Implement AndroidX API extraction and regenerate the manifest rather than maintaining it by hand. Reject source declarations that the Kotlin code emitter cannot compile.

This proof-of-concept intentionally has a narrow, honest success criterion. No claim of a working Android React Native library is made here.
