plugins { id("org.jetbrains.kotlin.jvm") }

dependencies {
  implementation("com.google.devtools.ksp:symbol-processing-api:2.2.20-2.0.4")
  implementation("com.google.code.gson:gson:2.11.0")
  implementation("org.jetbrains.kotlin:kotlin-metadata-jvm:2.2.20")
  implementation("org.ow2.asm:asm-tree:9.8")
}
