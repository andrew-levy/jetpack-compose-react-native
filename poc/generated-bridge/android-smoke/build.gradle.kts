plugins {
  id("com.android.library") version "8.7.3"
  id("org.jetbrains.kotlin.android") version "2.0.21"
  id("org.jetbrains.kotlin.plugin.compose") version "2.0.21"
  id("com.google.devtools.ksp") version "2.0.21-1.0.27"
}

android {
  namespace = "expo.modules.jetpackcomposereactnative.poc"
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
}

dependencies {
  ksp(project(":extractor"))
  implementation(platform("androidx.compose:compose-bom:2024.09.03"))
  implementation("androidx.compose.ui:ui")
  implementation("androidx.compose.foundation:foundation-layout")
  implementation("androidx.compose.material3:material3")
}
