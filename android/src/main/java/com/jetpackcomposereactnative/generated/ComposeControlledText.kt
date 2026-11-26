package com.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import java.util.concurrent.atomic.AtomicInteger

private val textRevisions = AtomicInteger()
private const val TEXT_REVISION = "\$textRevision"

private data class TextEdit<T>(val revision: Int, val value: T)

internal class ComposeControlledText<T>(
  val value: T,
  val onChange: (T) -> Unit,
)

@Composable
internal fun <T> rememberComposeControlledText(
  node: ComposeNode,
  value: T,
  event: String,
  encode: (T) -> Any,
): ComposeControlledText<T> {
  var edit by remember(node) { mutableStateOf<TextEdit<T>?>(null) }
  val acknowledged = if (node.has(TEXT_REVISION)) node.number(TEXT_REVISION).toInt() else 0
  val local = edit
  val displayed = if (local != null && local.revision > acknowledged) local.value else value

  return ComposeControlledText(displayed) { changed ->
    // Keep revisions increasing across disposal and recreation of a lazy item.
    val revision = textRevisions.incrementAndGet()
    edit = TextEdit(revision, changed)
    node.emit(event, encode(changed), revision)
  }
}
