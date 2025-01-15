package expo.modules.jetpackcomposereactnative.views.image

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.net.Uri
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.ComposeView
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView
import coil3.ImageLoader
import coil3.asDrawable
import coil3.request.ImageRequest
import expo.modules.jetpackcomposereactnative.common.toModifier
import java.util.Locale

data class ImageProps(
    var source: String = "",
    var drawable: Drawable? = null,
    var modifier: ModifierProp = emptyList(),
)

class ImageView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(ImageProps())
    private var composeView: ComposeView? = null
    private val imageLoader = ImageLoader.Builder(context)
        .build()

    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(MATCH_PARENT, MATCH_PARENT)
            it.setContent {
                ImageComposable(props = props.value)
            }

            addView(it)
            composeView = it
        }
    }

    private fun getDrawable(imageSource: ImageSource, context: Context, onDrawableReady: (Drawable?) -> Unit) {
        val request = ImageRequest.Builder(context)
            .data(imageSource.getUri(context))
            .target { drawable ->
                post { onDrawableReady(drawable.asDrawable(context.resources)) }
            }
            .listener(
                onError = { _, result ->
                    println("Error loading image: ${imageSource.uri}")
                }
            )
            .build()

        imageLoader.enqueue(request)
    }

    fun updateSource(source: String) {
        props.value = props.value.copy(source = source)
        getDrawable(
            ImageSource(
                context = context,
                uri = props.value.source
            ), context) { d ->
            props.value = props.value.copy(drawable = d)
         }

    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }

}

@Composable
fun ImageComposable(props: ImageProps) {
    props.drawable?.let { drawable ->
        val bitmap = (drawable as? BitmapDrawable)?.bitmap
        bitmap?.let {
            Image(
                bitmap = it.asImageBitmap(),
                contentDescription = null,
                modifier = props.modifier.toModifier().fillMaxWidth().fillMaxWidth()
            )
        }
    }
}



data class ImageSource(
    val context: Context,
    val uri: String? = null,
) {
    private fun isLocalResourceUri(uri: Uri?) = uri?.scheme?.startsWith("res") ?: false

    fun getUri(context: Context): Uri? {
        val uri = computeUri(context)

        if (isLocalResourceUri(uri)) {
            return Uri.parse(
                uri!!.toString().replace("res:/", "android.resource://" + context.packageName + "/")
            )
        }

        return uri
    }

    private fun computeUri(context: Context): Uri? {
        val stringUri = uri ?: return null
        return try {
            val uri: Uri = Uri.parse(stringUri)
            // Verify scheme is set, so that relative uri (used by static resources) are not handled.
            if (uri.scheme == null) {
                computeLocalUri(stringUri, context)
            } else {
                uri
            }
        } catch (e: Exception) {
            computeLocalUri(stringUri, context)
        }
    }

    private fun computeLocalUri(stringUri: String, context: Context): Uri? {
        return ResourceIdHelper.getResourceUri(context, stringUri)
    }
}

// Taken from https://github.com/expo/expo/blob/sdk-52/packages/expo-image/android/src/main/java/expo/modules/image/ResourceIdHelper.kt
object ResourceIdHelper {
    private val idMap = mutableMapOf<String, Int>()

    @SuppressLint("DiscouragedApi")
    private fun getResourceRawId(context: Context, name: String): Int {
        if (name.isEmpty()) {
            return -1
        }

        val normalizedName = name.lowercase(Locale.ROOT).replace("-", "_")
        synchronized(this) {
            val id = idMap[normalizedName]
            if (id != null) {
                return id
            }

            return context
                .resources
                .getIdentifier(normalizedName, "raw", context.packageName)
                .also {
                    idMap[normalizedName] = it
                }
        }
    }

    fun getResourceUri(context: Context, name: String): Uri? {
        val drawableUri = ResourceDrawableIdHelper.getInstance().getResourceDrawableUri(context, name)
        if (drawableUri != Uri.EMPTY) {
            return drawableUri
        }

        val resId = getResourceRawId(context, name)
        return if (resId > 0) {
            Uri.Builder().scheme("res").path(resId.toString()).build()
        } else {
            null
        }
    }
}