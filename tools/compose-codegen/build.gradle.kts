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
val candidateDir = providers.gradleProperty("composeCandidateDir")
if (candidateDir.isPresent) {
  val native = rootDir.resolve("../../android/src/main/java/com/jetpackcomposereactnative")
  tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().matching { it.name == "compileDebugKotlin" }.configureEach {
    source(file(candidateDir.get()), file("compile"))
    source(fileTree(native) {
      include(
        "common/_ColorTypeConverter.kt",
        "generated/ComposeBridgeValues.kt",
        "generated/ComposeModifierArguments.kt",
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

ksp {
  arg("inventoryPath", inventoryOutput.get().asFile.absolutePath)
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
}

dependencies {
  ksp(project(":extractor"))
  inventoryTool(project(":extractor"))
  implementation(platform("androidx.compose:compose-bom:2025.05.01"))
  implementation("androidx.compose.ui:ui")
  implementation("androidx.compose.foundation:foundation")
  // This release exposes MaterialExpressiveTheme publicly.
  val material3Version = providers.gradleProperty("composeMaterial3Version").getOrElse("1.4.0-alpha15")
  implementation("androidx.compose.material3:material3:$material3Version")
}
