plugins { id("org.jetbrains.kotlin.jvm") }

dependencies {
  implementation("com.google.devtools.ksp:symbol-processing-api:2.0.21-1.0.27")
  implementation("com.google.code.gson:gson:2.11.0")
  implementation("org.jetbrains.kotlin:kotlin-metadata-jvm:2.0.21")
  implementation("org.ow2.asm:asm-tree:9.7.1")
}
