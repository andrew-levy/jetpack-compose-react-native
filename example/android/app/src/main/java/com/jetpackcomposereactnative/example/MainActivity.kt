package com.jetpackcomposereactnative.example

import android.os.Bundle
import com.facebook.react.ReactActivity
import com.facebook.react.ReactActivityDelegate
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint.fabricEnabled
import com.facebook.react.defaults.DefaultReactActivityDelegate

class MainActivity : ReactActivity() {
    override fun getMainComponentName(): String = "JpcExample"

    override fun createReactActivityDelegate(): ReactActivityDelegate =
        object : DefaultReactActivityDelegate(this, mainComponentName, fabricEnabled) {
            override fun getLaunchOptions(): Bundle? {
                val start = intent?.getIntExtra("catalogStart", -1) ?: -1
                val bridgeChecks = intent?.getBooleanExtra("bridgeChecks", false) ?: false
                if (start < 0 && !bridgeChecks) return null
                return Bundle().apply {
                    if (start >= 0) putInt("catalogStart", start)
                    if (bridgeChecks) putBoolean("bridgeChecks", true)
                }
            }
        }
}
