package composepoc.extractor

import com.google.devtools.ksp.KspExperimental
import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import com.google.devtools.ksp.symbol.KSValueParameter

class ComposeApiExtractorProvider : SymbolProcessorProvider {
  override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor =
    ComposeApiExtractor(environment.codeGenerator, environment.logger)
}

class ComposeApiExtractor(private val generator: CodeGenerator, private val log: KSPLogger) : SymbolProcessor {
  private var visited = false

  @OptIn(KspExperimental::class)
  override fun process(resolver: Resolver): List<KSAnnotated> {
    if (visited) return emptyList()
    visited = true

    // getSymbolsWithAnnotation can exclude classpath symbols. Query the
    // dependency package directly to prove visibility into AndroidX APIs.
    val matches = resolver.getDeclarationsFromPackage("androidx.compose.material3")
      .filterIsInstance<KSFunctionDeclaration>()
      .filter { it.simpleName.asString() in setOf("Text", "Button") }
      .filter { it.annotations.any { annotation -> annotation.shortName.asString() == "Composable" } }
      .toList()

    if (matches.isEmpty()) {
      log.error("Compose API extraction failed: no Material3 Text/Button @Composable functions found in dependency classpath")
      return emptyList()
    }

    val report = matches.map { fn ->
      val params = fn.parameters.joinToString("; ") { p ->
        val type = p.type.resolve()
        p.name?.asString().orEmpty() + ": " +
          (type.declaration.qualifiedName?.asString() ?: type.toString()) +
          " optional=" + p.hasDefault
      }
      (fn.qualifiedName?.asString() ?: fn.simpleName.asString()) + "(" + params + ")"
    }.sorted()
    generator.createNewFile(Dependencies(aggregating = true), "", "DiscoveredComposeAPIs", "txt")
      .bufferedWriter().use { out -> report.forEach { out.appendLine(it) } }
    // A deterministic, machine-readable manifest for the downstream generator.
    // Keep only overloads whose required parameters and callback slots are
    // representable by the current bridge. No manually curated JSON input.
    val supported = listOf("Text", "Button").mapNotNull { name ->
      matches.filter { it.simpleName.asString() == name }
        .mapNotNull { fn ->
          val params = fn.parameters.filter { it.name?.asString() != "content" }
          val required = fn.parameters.filter { !it.hasDefault && it.name?.asString() != "content" }
          val requiredNames = if (name == "Text") setOf("text") else setOf("onClick")
          if (required.any { it.name?.asString() !in requiredNames }) null else fn
        }.minByOrNull { it.parameters.size }
    }
    if (supported.size != 2) {
      log.error("Unable to find representable Material3 Text and Button overloads")
      return emptyList()
    }
    val manifest = buildString {
      append("""{"schemaVersion":1,"components":[""")
      supported.forEachIndexed { index, fn ->
        if (index > 0) append(",")
        val name = fn.simpleName.asString()
        append("""{"name":"""").append('"').append(name).append('"')
        append(""","kotlinFunction":"""").append('"').append(fn.qualifiedName!!.asString()).append('"')
        append(""","parameters":[""")
        val params = fn.parameters.mapNotNull { p ->
          val paramName = p.name?.asString() ?: return@mapNotNull null
          val kind = when (paramName) {
            "text" -> "string"
            "onClick" -> "event"
            "modifier" -> "modifier"
            "enabled" -> "boolean"
            else -> null
          } ?: return@mapNotNull null
          val optional = p.hasDefault
          val defaultField = if (kind == "boolean") ""","default":true""" else ""
          """{"name":"$paramName","kind":"$kind","optional":$optional$defaultField}"""
        }
        append(params.joinToString(","))
        append("""],"children":""").append(name == "Button").append("}")
      }
      append("]}")
    }
    generator.createNewFile(Dependencies(aggregating = true), "", "compose-api-manifest", "json")
      .bufferedWriter().use { it.write(manifest) }
    log.warn("Discovered " + matches.size + " @Composable Material3 Text/Button overload(s) from AndroidX classpath")
    return emptyList()
  }
}
