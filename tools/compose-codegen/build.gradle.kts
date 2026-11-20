plugins {
  id("com.android.library") version "8.7.3"
  id("org.jetbrains.kotlin.android") version "2.0.21"
  id("org.jetbrains.kotlin.plugin.compose") version "2.0.21"
  id("com.google.devtools.ksp") version "2.0.21-1.0.27"
}

android {
  namespace = "com.jetpackcomposereactnative.codegen"
  compileSdk = 35
  defaultConfig {
    minSdk = 24
  }
  buildFeatures { compose = true }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }
}
kotlin {
  compilerOptions.jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
}

ksp {
  arg("composePackages", providers.gradleProperty("composePackages").getOrElse(
    "androidx.compose.foundation.layout,androidx.compose.material3"
  ).replace(',', ';'))
  arg("modifierPackages", providers.gradleProperty("modifierPackages").getOrElse(
    "androidx.compose.foundation,androidx.compose.foundation.layout,androidx.compose.foundation.selection," +
      "androidx.compose.ui,androidx.compose.ui.draw,androidx.compose.ui.graphics,androidx.compose.ui.layout,androidx.compose.ui.platform"
  ).replace(',', ';'))
}

dependencies {
  ksp(project(":extractor"))
  implementation(platform("androidx.compose:compose-bom:2025.05.01"))
  implementation("androidx.compose.ui:ui")
  implementation("androidx.compose.foundation:foundation-layout")
  implementation("androidx.compose.material3:material3:1.4.0-alpha15")
}
