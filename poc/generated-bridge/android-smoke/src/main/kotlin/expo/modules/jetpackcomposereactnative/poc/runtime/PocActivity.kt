package expo.modules.jetpackcomposereactnative.poc.runtime

import android.os.Bundle
import androidx.activity.ComponentActivity

/** Activity used only by the isolated Android instrumentation test. */
class PocActivity : ComponentActivity() {
  lateinit var host: ComposeBridgeHostView

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    host = ComposeBridgeHostView(this)
    setContentView(host)
  }
}
