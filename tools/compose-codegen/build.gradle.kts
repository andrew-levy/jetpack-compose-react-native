plugins {
  id("com.android.library") version "9.2.1"
  id("org.jetbrains.kotlin.android") version "2.2.20"
  id("org.jetbrains.kotlin.plugin.compose") version "2.2.20"
  id("com.google.devtools.ksp") version "2.2.20-2.0.4"
}

android {
  namespace = "com.jetpackcomposereactnative.codegen"
  compileSdk = 37
  // Compose UI and Foundation 1.13 are compiled against Android API 37.1.
  compileSdkMinor = 1
  defaultConfig {
    minSdk = 24
  }
  buildFeatures { compose = true }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }
}
val candidateDir = providers.gradleProperty("composeCandidateDir")
if (candidateDir.isPresent) {
  val native = rootDir.resolve("../../android/src/main/java/com/jetpackcomposereactnative")
  tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().matching { it.name == "compileDebugKotlin" }.configureEach {
    source(file(candidateDir.get()), file("compile"))
    source(fileTree(native) {
      include(
        "common/_ColorTypeConverter.kt",
        "generated/ComposeAnimationValues.kt",
        "generated/ComposeBridgeValues.kt",
        "generated/ComposeConfigurationValues.kt",
        "generated/ComposeTextTransformations.kt",
        "generated/ComposeControlledText.kt",
        "generated/ComposeLayoutMeasure.kt",
        "generated/ComposeGestureValues.kt",
        "generated/ComposeDrawingValues.kt",
        "generated/ComposeOwnerScopes.kt",
        "generated/ComposeInteractionValues.kt",
        "generated/ComposeInputPolicies.kt",
        "generated/ComposeNativeHandles.kt",
        "generated/ComposeStateControls.kt",
        "generated/ComposeOverflowActions.kt",
        "generated/ComposePointerPolicy.kt",
        "generated/ComposeModifierArguments.kt",
        "generated/ComposeImages.kt",
        "generated/ComposeNode.kt",
        "generated/RenderComposeChildren.kt"
      )
    })
  }
}

kotlin {
  compilerOptions.jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
}

val composePackages = providers.gradleProperty("composePackages").getOrElse("androidx.compose.*").replace(',', ';')
val modifierPackages = providers.gradleProperty("modifierPackages").getOrElse("androidx.compose.*").replace(',', ';')
val inventoryTool by configurations.creating {
  isCanBeConsumed = false
  attributes.attribute(Usage.USAGE_ATTRIBUTE, objects.named(Usage.JAVA_RUNTIME))
}
val inventoryOutput = layout.buildDirectory.file("compose-binary-inventory.json")
val publishedSurface = layout.projectDirectory.file("api-surface.json").asFile

ksp {
  arg("inventoryPath", inventoryOutput.get().asFile.absolutePath)
  if (publishedSurface.isFile) arg("publishedSurface", publishedSurface.absolutePath)
}

val artifacts = providers.provider {
  configurations.getByName("debugCompileClasspath").resolvedConfiguration.resolvedArtifacts
    .filter { it.moduleVersion.id.group.startsWith("androidx.compose.") && it.extension in setOf("aar", "jar") }
    .sortedBy { it.moduleVersion.id.toString() }
}

tasks.register<JavaExec>("composeBinaryInventory") {
  classpath = inventoryTool
  mainClass.set("com.jetpackcomposereactnative.codegen.extractor.BinaryInventory")
  inputs.property("composePackages", composePackages)
  inputs.property("modifierPackages", modifierPackages)
  inputs.property("coordinates", artifacts.map { list -> list.map { it.moduleVersion.id.toString() } })
  inputs.files(artifacts.map { list -> list.map { it.file } })
  outputs.file(inventoryOutput)
  doFirst {
    args(inventoryOutput.get().asFile.absolutePath, composePackages, modifierPackages)
    args(artifacts.get().flatMap { listOf(it.moduleVersion.id.toString(), it.file.absolutePath) })
  }
}

tasks.matching { it.name == "kspDebugKotlin" }.configureEach {
  dependsOn("composeBinaryInventory")
  inputs.file(inventoryOutput)
  if (publishedSurface.isFile) inputs.file(publishedSurface)
}

dependencies {
  ksp(project(":extractor"))
  inventoryTool(project(":extractor"))
  implementation("androidx.compose.ui:ui:1.13.0")
  implementation("androidx.compose.foundation:foundation:1.13.0")
  implementation("androidx.compose.material:material-icons-core:1.7.8")
  val material3Version = providers.gradleProperty("composeMaterial3Version").getOrElse("1.5.0")
  implementation("androidx.compose.material3:material3:$material3Version")
}
