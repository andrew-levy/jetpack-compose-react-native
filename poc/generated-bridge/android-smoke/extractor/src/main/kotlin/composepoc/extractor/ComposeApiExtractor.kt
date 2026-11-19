package composepoc.extractor

import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSFunctionDeclaration

class ComposeApiExtractorProvider : SymbolProcessorProvider {
  override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor =
    ComposeApiExtractor(environment.codeGenerator, environment.logger)
}

class ComposeApiExtractor(private val generator: CodeGenerator, private val log: KSPLogger) : SymbolProcessor {
  private var visited = false

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
    log.warn("Discovered " + matches.size + " @Composable Material3 Text/Button overload(s) from AndroidX classpath")
    return emptyList()
  }
}
