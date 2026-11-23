package com.jetpackcomposereactnative.generated

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.util.Log
import android.util.LruCache
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.io.InputStream
import java.net.URL

// Decoded images by URI. Sized in bytes, up to an eighth of the app's heap.
private object ComposeImageCache : LruCache<String, ImageBitmap>((Runtime.getRuntime().maxMemory() / 8).toInt()) {
  override fun sizeOf(key: String, value: ImageBitmap): Int = value.width * value.height * 4
}

/**
 * The painter of an image source from JavaScript: `{ uri, width?, height? }`, which the JavaScript side
 * resolves from a `require()` asset or a `{ uri }` object. Until the image is decoded it draws nothing at
 * the hinted size in dp, so layout does not jump when it loads.
 */
@Composable
internal fun JSONObject.rememberComposeImagePainter(): Painter {
  val uri = getString("uri")
  val context = LocalContext.current
  val density = LocalDensity.current
  val hint = with(density) {
    if (has("width") && has("height")) Size(getDouble("width").toFloat() * this.density, getDouble("height").toFloat() * this.density)
    else Size.Unspecified
  }
  val bitmap by produceState(ComposeImageCache.get(uri), uri) {
    if (value == null) {
      value = withContext(Dispatchers.IO) { loadComposeImage(context.applicationContext, uri) }
        ?.also { ComposeImageCache.put(uri, it) }
    }
  }
  return remember(bitmap, hint) { bitmap?.let(::BitmapPainter) ?: ComposeImagePlaceholder(hint) }
}

private class ComposeImagePlaceholder(override val intrinsicSize: Size) : Painter() {
  override fun DrawScope.onDraw() {}
}

@SuppressLint("DiscouragedApi")
private fun loadComposeImage(context: Context, uri: String): ImageBitmap? = try {
  val parsed = Uri.parse(uri)
  val bitmap: Bitmap? = when (parsed.scheme) {
    "http", "https" -> URL(uri).openStream().use(BitmapFactory::decodeStream)
    "file" -> if (uri.startsWith("file:///android_asset/")) {
      context.assets.open(uri.removePrefix("file:///android_asset/")).use(::decode)
    } else {
      context.contentResolver.openInputStream(parsed)?.use(::decode)
    }
    "asset" -> context.assets.open(uri.removePrefix("asset:/").removePrefix("/")).use(::decode)
    "content", "android.resource" -> context.contentResolver.openInputStream(parsed)?.use(::decode)
    // Release builds resolve bundled assets to the name of a drawable or raw resource.
    null -> listOf("drawable", "raw").firstNotNullOfOrNull { type ->
      context.resources.getIdentifier(uri, type, context.packageName).takeIf { it != 0 }
    }?.let { id -> BitmapFactory.decodeResource(context.resources, id) }
    else -> null
  }
  if (bitmap == null) Log.w("JetpackCompose", "Could not decode image: $uri")
  bitmap?.asImageBitmap()
} catch (error: Exception) {
  Log.w("JetpackCompose", "Could not load image: $uri", error)
  null
}

private fun decode(stream: InputStream): Bitmap? = BitmapFactory.decodeStream(stream)
