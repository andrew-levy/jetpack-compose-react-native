package com.jetpackcomposereactnative

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager
import com.jetpackcomposereactnative.generated.ComposeHostManager
import com.jetpackcomposereactnative.generated.ComposeNodeManager

class ComposePackage : ReactPackage {
    override fun createNativeModules(context: ReactApplicationContext): List<NativeModule> = emptyList()

    override fun createViewManagers(context: ReactApplicationContext): List<ViewManager<*, *>> = listOf(
        ComposeHostManager(),
        ComposeNodeManager(),
    )
}
