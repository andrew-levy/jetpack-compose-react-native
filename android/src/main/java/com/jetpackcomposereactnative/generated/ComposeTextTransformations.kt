package com.jetpackcomposereactnative.generated

import androidx.compose.foundation.text.input.InputTransformation
import androidx.compose.foundation.text.input.OutputTransformation
import androidx.compose.foundation.text.input.insert
import androidx.compose.foundation.text.input.maxLength
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import org.json.JSONObject

internal fun JSONObject.toComposeInputTransformation(): InputTransformation {
  val digitsOnly = optBoolean("digitsOnly")
  val filter = InputTransformation {
    if (digitsOnly && asCharSequence().any { it !in '0'..'9' }) revertAllChanges()
  }
  return if (has("maxLength")) filter.maxLength(nonnegativeInt("maxLength")) else filter
}

internal fun JSONObject.toComposeOutputTransformation(): OutputTransformation {
  val entries = getJSONArray("insertions")
  val insertions = List(entries.length()) { index ->
    val entry = entries.getJSONObject(index)
    entry.nonnegativeInt("offset") to entry.getString("text")
  }.sortedByDescending { it.first }
  require(insertions.all { it.first > 0 } && insertions.zipWithNext().all { (first, second) ->
    first.first != second.first
  }) { "Text output insertion offsets must be positive and distinct" }

  return OutputTransformation {
    val originalLength = length
    for ((offset, text) in insertions) {
      if (offset < originalLength) insert(offset, text)
    }
  }
}

internal fun JSONObject.toComposeVisualTransformation(): VisualTransformation = when (getString("type")) {
  "none" -> VisualTransformation.None
  "password" -> if (has("mask")) PasswordVisualTransformation(getString("mask").single())
    else PasswordVisualTransformation()
  else -> error("Unknown visual transformation: " + getString("type"))
}

private fun JSONObject.nonnegativeInt(name: String): Int {
  val value = getDouble(name)
  val number = value.toInt()
  require(number >= 0 && number.toDouble() == value) { "$name must be a non-negative integer" }
  return number
}
