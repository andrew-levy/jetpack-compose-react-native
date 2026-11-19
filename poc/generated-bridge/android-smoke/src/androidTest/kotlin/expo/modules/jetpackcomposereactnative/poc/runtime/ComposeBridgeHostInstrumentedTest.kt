package expo.modules.jetpackcomposereactnative.poc.runtime

import androidx.compose.ui.test.assertDoesNotExist
import androidx.compose.ui.test.assertExists
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

/**
 * Exercises actual AndroidX Compose semantics and state updates on an emulator.
 * Does not claim Fabric view-manager/node-mount verification.
 */
class ComposeBridgeHostInstrumentedTest {
  @get:Rule val compose = createAndroidComposeRule<PocActivity>()

  @Test fun nestedTreeRendersUpdatesAndDispatchesEvents() {
    val events = mutableListOf<String>()
    compose.runOnIdle {
      compose.activity.host.onEvent = { node, event -> events.add("$node.$event") }
      compose.activity.host.updateTree(
        """{"name":"Column","children":[{"name":"Text","props":{"text":"Hello"}},{"name":"Button","children":[{"name":"Text","props":{"text":"Tap me"}}]}]}"""
      )
    }

    compose.onNodeWithText("Hello").assertExists()
    compose.onNodeWithText("Tap me").performClick()
    compose.runOnIdle { assertEquals(listOf("Button.onClick"), events) }

    compose.runOnIdle {
      compose.activity.host.updateTree(
        """{"name":"Column","children":[{"name":"Text","props":{"text":"Updated"}}]}"""
      )
    }
    compose.onNodeWithText("Updated").assertExists()
    compose.onNodeWithText("Hello").assertDoesNotExist()
    compose.onNodeWithText("Tap me").assertDoesNotExist()
  }
}
