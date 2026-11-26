package com.jetpackcomposereactnative.codegen

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@RequiresOptIn
annotation class BridgePreview

@RequiresOptIn
annotation class BridgeLayoutPreview

@BridgePreview
@BridgeLayoutPreview
@Composable
fun DiscoveryProbe(label: String, optionalMetadata: Map<String, Int> = emptyMap(), scheme: ColorScheme? = null) {}

@Composable
fun DiscoveryProbe(count: Int) {}

@Composable
fun UnsupportedProbe(requiredMetadata: Map<String, Int>) {}

fun Modifier.discoveryProbe(inset: Dp): Modifier = padding(inset)

enum class ProbeDirection { Start, End }

data class ProbeInset(val size: Dp, val direction: ProbeDirection = ProbeDirection.Start)

data class ProbeConfiguration(
  val inset: ProbeInset,
  val fallback: ProbeInset? = ProbeInset(4.dp),
)

sealed interface ProbeShape
private data class ProbeRectangle(val corner: ProbeInset) : ProbeShape

fun ProbeShape(corner: ProbeInset): ProbeShape = ProbeRectangle(corner)

@Composable
fun NestedValueProbe(config: ProbeConfiguration, shape: ProbeShape, content: @Composable () -> Unit) {
  content()
}

fun Modifier.nestedValueProbe(config: ProbeConfiguration): Modifier = padding(config.inset.size)

data class RecursiveProbeValue(val next: RecursiveProbeValue?)
data class MutableProbeValue(var value: Int)

@Composable
fun UnsupportedValueProbe(recursive: RecursiveProbeValue, mutable: MutableProbeValue) {}

fun Modifier.observeProbe(onChanged: (String?, Int) -> Unit): Modifier = this
