package com.jetpackcomposereactnative.generated

import android.content.ClipData
import android.view.MotionEvent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Indication
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.content.ReceiveContentListener
import androidx.compose.foundation.content.consume
import androidx.compose.foundation.text.KeyboardActionScope
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.ui.draganddrop.DragAndDropEvent
import androidx.compose.ui.draganddrop.DragAndDropTarget
import androidx.compose.ui.draganddrop.DragAndDropTransferData
import androidx.compose.ui.draganddrop.toAndroidDragEvent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.rotary.RotaryScrollEvent
import androidx.compose.ui.layout.RectRulers
import androidx.compose.ui.layout.WindowInsetsRulers
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import com.jetpackcomposereactnative.common.parseComposeColor
import org.json.JSONObject

internal fun MotionEvent.toComposeSnapshot(): JSONObject = JSONObject()
  .put("action", actionMasked)
  .put("x", x.toDouble())
  .put("y", y.toDouble())
  .put("pointerCount", pointerCount)

internal fun DpSize.toComposeSnapshot(): JSONObject = JSONObject()
  .put("width", width.value.toDouble())
  .put("height", height.value.toDouble())

internal fun JSONObject.toComposeTouchPolicy(args: ComposeModifierArguments): (MotionEvent) -> Boolean {
  val values = getJSONArray("actions")
  val actions = (0 until values.length()).map(values::getInt).toSet()
  return { event ->
    if (!isNull("onEvent")) args.emitValueEvent(this, "onEvent", event.toComposeSnapshot())
    event.actionMasked in actions
  }
}

internal fun JSONObject.toComposeRotaryPolicy(args: ComposeModifierArguments): (RotaryScrollEvent) -> Boolean = { event ->
  if (!isNull("onScroll")) {
    args.emitValueEvent(this, "onScroll", JSONObject()
      .put("horizontalPixels", event.horizontalScrollPixels.toDouble())
      .put("verticalPixels", event.verticalScrollPixels.toDouble()))
  }
  optBoolean("consume")
}

@OptIn(ExperimentalFoundationApi::class)
internal fun JSONObject.toComposeReceiveContent(args: ComposeModifierArguments): ReceiveContentListener =
  ReceiveContentListener { content ->
    content.consume { item ->
      val text = item.text
      if (text != null) args.emitValueEvent(this, "onText", text.toString())
      text != null && optBoolean("consume", true)
    }
  }

internal fun JSONObject.toComposeIndication(): Indication = ripple(
  bounded = optBoolean("bounded", true),
  radius = if (isNull("radius")) Dp.Unspecified else getDouble("radius").dp,
  color = if (isNull("color")) Color.Unspecified else parseComposeColor(getString("color")),
)

internal fun JSONObject.toComposeRectRulers(): RectRulers {
  val rulers = when (getString("type")) {
    "safeDrawing" -> WindowInsetsRulers.SafeDrawing
    "safeGestures" -> WindowInsetsRulers.SafeGestures
    "safeContent" -> WindowInsetsRulers.SafeContent
    "systemBars" -> WindowInsetsRulers.SystemBars
    "ime" -> WindowInsetsRulers.Ime
    else -> error("Unknown Compose inset rulers: " + getString("type"))
  }
  return if (optBoolean("maximum")) rulers.maximum else rulers.current
}

internal fun JSONObject.toComposeDpPoint(): Density.() -> Offset = {
  Offset(getDouble("x").dp.toPx(), getDouble("y").dp.toPx())
}

internal fun JSONObject.toComposeKeyboardActions(args: ComposeModifierArguments): KeyboardActions {
  fun action(name: String, imeAction: ImeAction): (KeyboardActionScope.() -> Unit)? {
    if (isNull(name)) return null
    return {
      if (optBoolean("performDefaultAction", true)) defaultKeyboardAction(imeAction)
      args.emitValueEvent(this@toComposeKeyboardActions, name, null)
    }
  }
  return KeyboardActions(
    onDone = action("onDone", ImeAction.Done),
    onGo = action("onGo", ImeAction.Go),
    onNext = action("onNext", ImeAction.Next),
    onPrevious = action("onPrevious", ImeAction.Previous),
    onSearch = action("onSearch", ImeAction.Search),
    onSend = action("onSend", ImeAction.Send),
  )
}

internal fun JSONObject.toComposeDragTypePolicy(): (DragAndDropEvent) -> Boolean {
  val mimeTypes = getJSONArray("mimeTypes")
  val values = (0 until mimeTypes.length()).map(mimeTypes::getString)
  return { event ->
    event.toAndroidDragEvent().clipDescription?.let { description ->
      values.any(description::hasMimeType)
    } ?: false
  }
}

internal fun JSONObject.toComposeDragTransfer(): (Offset) -> DragAndDropTransferData? {
  val data = ClipData.newPlainText(optString("label", "Text"), getString("text"))
  return { DragAndDropTransferData(data) }
}

internal fun JSONObject.toComposeDragTarget(args: ComposeModifierArguments): DragAndDropTarget {
  val settings = this
  return object : DragAndDropTarget {
    override fun onDrop(event: DragAndDropEvent): Boolean {
      val data = event.toAndroidDragEvent().clipData ?: return false
      var accepted = false
      for (index in 0 until data.itemCount) {
        val text = data.getItemAt(index).text ?: continue
        args.emitValueEvent(settings, "onDrop", text.toString())
        accepted = true
      }
      return accepted
    }
  }
}

@Composable
internal fun ComposeModifierArguments.rememberComposeInsetsEvent(name: String): (WindowInsets) -> Unit {
  val density = LocalDensity.current
  val layoutDirection = LocalLayoutDirection.current
  return { insets ->
    with(density) {
      emit(name, JSONObject()
        .put("left", insets.getLeft(density, layoutDirection).toDp().value.toDouble())
        .put("top", insets.getTop(density).toDp().value.toDouble())
        .put("right", insets.getRight(density, layoutDirection).toDp().value.toDouble())
        .put("bottom", insets.getBottom(density).toDp().value.toDouble()))
    }
  }
}
