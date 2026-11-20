package com.jetpackcomposereactnative.codegen

import androidx.compose.foundation.layout.padding
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
fun DiscoveryProbe(label: String, optionalMetadata: List<String> = emptyList()) {}

@Composable
fun DiscoveryProbe(count: Int) {}

@Composable
fun UnsupportedProbe(requiredMetadata: List<String>) {}

fun Modifier.discoveryProbe(inset: Dp): Modifier = padding(inset)
