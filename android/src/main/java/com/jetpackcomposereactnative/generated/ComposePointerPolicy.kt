package com.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.PointerInputChange
import androidx.compose.ui.input.pointer.PointerInputEventHandler
import org.json.JSONArray
import org.json.JSONObject

@Composable
internal fun ComposeModifierArguments.rememberComposePointerPolicy(name: String): PointerInputEventHandler {
  val args by rememberUpdatedState(this)
  val policy by rememberUpdatedState(jsonObject(name))
  return remember {
    PointerInputEventHandler {
      awaitPointerEventScope {
        while (true) {
          val pass = when (policy.optString("pass", "main")) {
            "initial" -> PointerEventPass.Initial
            "main" -> PointerEventPass.Main
            "final" -> PointerEventPass.Final
            else -> error("Unknown pointer event pass")
          }
          val event = awaitPointerEvent(pass)
          val options = policy
          for (change in event.changes) {
            when (options.optString("consume", "none")) {
              "none" -> Unit
              "movement" -> if (change.pressed && change.position != change.previousPosition) change.consume()
              "all" -> change.consume()
              else -> error("Unknown pointer event consumption policy")
            }
          }
          if (!options.isNull("onEvent")) {
            val changes = JSONArray()
            for (change in event.changes) changes.put(change.toBridgePointer())
            args.emitValueEvent(options, "onEvent", JSONObject()
              .put("type", event.type.toString()).put("changes", changes))
          }
        }
      }
    }
  }
}

private fun PointerInputChange.toBridgePointer(): JSONObject = JSONObject()
  .put("id", id.value.toString()).put("uptimeMillis", uptimeMillis)
  .put("position", position.toComposeSnapshot()).put("previousPosition", previousPosition.toComposeSnapshot())
  .put("pressed", pressed).put("previousPressed", previousPressed)
  .put("consumed", isConsumed).put("pointerType", type.toString())

internal fun JSONArray.toComposePointerKeys(): Array<String?> =
  Array(length()) { index -> if (isNull(index)) null else getString(index) }
