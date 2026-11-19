package expo.modules.jetpackcomposereactnative.common

import android.content.Context
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView

interface ComposeAndroidLayout {
  val shouldUseAndroidLayout: Boolean
}

/** Exposes the Compose layout flag on both Expo SDK 51 and newer Expo versions. */
abstract class ComposeExpoView(context: Context, appContext: AppContext) :
  ExpoView(context, appContext), ComposeAndroidLayout {
  abstract override val shouldUseAndroidLayout: Boolean
}
