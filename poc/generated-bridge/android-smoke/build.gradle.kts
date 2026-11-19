plugins {
  id("com.android.library") version "8.7.3"
  id("org.jetbrains.kotlin.android") version "2.0.21"
  id("org.jetbrains.kotlin.plugin.compose") version "2.0.21"
}

android {
  namespace = "expo.modules.jetpackcomposereactnative.poc"
  compileSdk = 35
  defaultConfig { minSdk = 24 }
  buildFeatures { compose = true }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }
  sourceSets.getByName("main").java.srcDir("../generated")
}
dependencies {
  implementation(platform("androidx.compose:compose-bom:2024.09.03"))
  implementation("androidx.compose.ui:ui")
  implementation("androidx.compose.foundation:foundation-layout")
  implementation("androidx.compose.material3:material3")
}
