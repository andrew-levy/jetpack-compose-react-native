package com.jetpackcomposereactnative.codegen.extractor

import com.google.gson.Gson
import java.io.File
import java.io.InputStream
import java.util.zip.ZipFile
import java.util.zip.ZipInputStream
import kotlin.metadata.KmClassifier
import kotlin.metadata.KmFunction
import kotlin.metadata.KmType
import kotlin.metadata.KmTypeParameter
import kotlin.metadata.Visibility
import kotlin.metadata.isNullable
import kotlin.metadata.isSuspend
import kotlin.metadata.jvm.KotlinClassMetadata
import kotlin.metadata.jvm.signature
import kotlin.metadata.visibility
import org.objectweb.asm.ClassReader
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.ClassNode

/**
 * Reads the resolved Android artifacts independently of KSP. Kotlin metadata supplies source
 * declarations, including overloads erased or mangled on the JVM. Bytecode supplies @Composable.
 */
object BinaryInventory {
  @JvmStatic
  fun main(args: Array<String>) {
    val output = File(args[0])
    val composeSelectors = args[1].split(';').map(String::trim)
    val modifierSelectors = args[2].split(';').map(String::trim)
    val artifacts = args.drop(3).chunked(2)
    val packages = mutableSetOf<String>()
    val classes = artifacts.flatMap { (coordinate, path) ->
      archiveClasses(File(path), composeSelectors + modifierSelectors).mapNotNull { (name, bytes) ->
        val packageName = name.substringBeforeLast('/', "").replace('/', '.')
        packages += packageName
        val node = ClassNode(Opcodes.ASM9)
        ClassReader(bytes).accept(node, ClassReader.SKIP_CODE or ClassReader.SKIP_DEBUG or ClassReader.SKIP_FRAMES)
        node.metadata()?.let { BinaryClass(node, it, packageName, coordinate) }
      }
    }
    fun selected(selectors: List<String>) =
      (selectors.filterNot { it.endsWith(".*") } + packages.filter { matches(it, selectors) }).distinct().sorted()
    val composePackages = selected(composeSelectors)
    val modifierPackages = selected(modifierSelectors)
    val classesByName = classes.associateBy { it.node.name }
    val declarations = classes.flatMap { binary ->
      val public = generateSequence(binary.node.name) { name -> name.substringBeforeLast('$', "").ifEmpty { null } }
        .none { name -> (classesByName[name]?.metadata as? KotlinClassMetadata.Class)?.kmClass?.visibility
          ?.let { it != Visibility.PUBLIC } == true }
      if (public) readClass(binary, composePackages, modifierPackages) else emptyList()
    }
    val sorted = declarations.sortedWith(compareBy({ it.kind }, { it.signature }, { it.artifact }))
    output.parentFile.mkdirs()
    output.writeText(Gson().toJson(Inventory(artifacts.map { it[0] }.sorted(), composePackages, modifierPackages, sorted)))
    println("Binary inventory: ${sorted.size} declarations from ${artifacts.size} Compose artifacts")
  }

  private fun archiveClasses(file: File, packages: List<String>): List<Pair<String, ByteArray>> =
    ZipFile(file).use { archive ->
      val classes = mutableListOf<Pair<String, ByteArray>>()
      if (file.extension == "aar") {
        for (entry in archive.entries().asSequence().filter {
          it.name == "classes.jar" || (it.name.startsWith("libs/") && it.name.endsWith(".jar"))
        }) {
          archive.getInputStream(entry).use { readJar(it, packages, classes) }
        }
      } else {
        for (entry in archive.entries()) {
          if (inScope(entry.name, packages)) {
            classes += entry.name to archive.getInputStream(entry).use { it.readBytes() }
          }
        }
      }
      classes
    }

  private fun readJar(input: InputStream, packages: List<String>, classes: MutableList<Pair<String, ByteArray>>) {
    ZipInputStream(input).use { jar ->
      while (true) {
        val entry = jar.nextEntry ?: break
        if (inScope(entry.name, packages)) classes += entry.name to jar.readBytes()
      }
    }
  }

  private fun inScope(name: String, packages: List<String>): Boolean =
    name.endsWith(".class") && matches(name.substringBeforeLast('/', "").replace('/', '.'), packages)

  private fun matches(packageName: String, selectors: List<String>): Boolean = selectors.any { selector ->
    val base = selector.removeSuffix(".*")
    packageName == base || (base != selector && packageName.startsWith("$base."))
  }

  private fun ClassNode.metadata(): KotlinClassMetadata? {
    val annotations = visibleAnnotations.orEmpty() + invisibleAnnotations.orEmpty()
    val annotation = annotations.singleOrNull { it.desc == "Lkotlin/Metadata;" } ?: return null
    val fields = annotation.values.chunked(2).associate { (key, value) -> key as String to value }
    fun integers(key: String) = (fields[key] as? List<*>)?.filterIsInstance<Int>()?.toIntArray() ?: intArrayOf()
    fun strings(key: String) = (fields[key] as? List<*>)?.filterIsInstance<String>()?.toTypedArray() ?: emptyArray()
    return KotlinClassMetadata.readLenient(Metadata(
      kind = fields["k"] as? Int ?: 1,
      metadataVersion = integers("mv"),
      data1 = strings("d1"),
      data2 = strings("d2"),
      extraString = fields["xs"] as? String ?: "",
      packageName = fields["pn"] as? String ?: "",
      extraInt = fields["xi"] as? Int ?: 0
    ))
  }

  private fun readClass(
    binary: BinaryClass, composePackages: List<String>, modifierPackages: List<String>
  ): List<Declaration> {
    val (node, metadata, packageName, artifact) = binary
    val owner: String
    val typeParameters: List<KmTypeParameter>
    val functions: List<KmFunction>
    when (metadata) {
      is KotlinClassMetadata.Class -> {
        val type = metadata.kmClass
        if (type.visibility != Visibility.PUBLIC) return emptyList()
        owner = type.name.replace('/', '.')
        typeParameters = type.typeParameters
        functions = type.functions
      }
      is KotlinClassMetadata.FileFacade -> {
        owner = packageName
        typeParameters = emptyList()
        functions = metadata.kmPackage.functions
      }
      is KotlinClassMetadata.MultiFileClassPart -> {
        owner = packageName
        typeParameters = emptyList()
        functions = metadata.kmPackage.functions
      }
      else -> return emptyList()
    }
    val composables = node.methods.filter { method ->
      (method.visibleAnnotations.orEmpty() + method.invisibleAnnotations.orEmpty())
        .any { it.desc == "Landroidx/compose/runtime/Composable;" }
    }.map { it.name + it.desc }.toSet()
    return functions.filter { it.visibility == Visibility.PUBLIC }.flatMap { function ->
      val receiver = function.receiverParameterType?.classifier as? KmClassifier.Class
      val result = function.returnType.classifier as? KmClassifier.Class
      val signature = function.sourceSignature(owner, typeParameters)
      buildList {
        if (packageName in composePackages && function.signature?.toString() in composables) {
          add(Declaration("component", signature, artifact))
        }
        if (packageName in modifierPackages && receiver?.name == MODIFIER && result?.name == MODIFIER) {
          add(Declaration("modifier", signature, artifact))
        }
      }
    }
  }

  private fun KmFunction.sourceSignature(owner: String, ownerTypeParameters: List<KmTypeParameter>): String {
    val names = (ownerTypeParameters + typeParameters).associate { it.id to it.name }
    return buildString {
      append(owner).append('.').append(name)
      receiverParameterType?.let { append(" [receiver: ${it.typeName(names)}]") }
      append(valueParameters.joinToString(prefix = "(", postfix = ")") { parameter ->
        val prefix = if (parameter.varargElementType != null) "vararg " else ""
        "$prefix${parameter.name}: ${(parameter.varargElementType ?: parameter.type).typeName(names)}"
      })
      // Matches ComposeApiExtractor.signature: only bounds other than the implicit `Any?` are written.
      val bounded = typeParameters.filterNot { parameter ->
        parameter.upperBounds.isEmpty() || parameter.upperBounds.singleOrNull()?.let {
          (it.classifier as? KmClassifier.Class)?.name == "kotlin/Any" && it.isNullable
        } == true
      }.map { parameter ->
        parameter.upperBounds.joinToString(" & ", prefix = "${parameter.name} : ") { it.typeName(names) }
      }
      if (bounded.isNotEmpty()) append(bounded.joinToString(prefix = " where "))
    }
  }

  private fun KmType.typeName(parameters: Map<Int, String>): String = buildString {
    if (isSuspend) {
      val input = arguments.dropLast(2)
      val result = arguments[arguments.size - 2].type?.arguments?.singleOrNull()?.type
      val names = input.map { it.type?.typeName(parameters) ?: "*" } + (result?.typeName(parameters) ?: "*")
      append(names.joinToString(prefix = "kotlin.coroutines.SuspendFunction${input.size}<", postfix = ">"))
      if (isNullable) append('?')
      return@buildString
    }
    append(when (val type = classifier) {
      is KmClassifier.Class -> type.name.replace('/', '.')
      is KmClassifier.TypeAlias -> type.name.replace('/', '.')
      is KmClassifier.TypeParameter -> parameters[type.id] ?: "type#${type.id}"
    })
    if (arguments.isNotEmpty()) {
      append(arguments.joinToString(prefix = "<", postfix = ">") { it.type?.typeName(parameters) ?: "*" })
    }
    if (isNullable) append('?')
  }

  private const val MODIFIER = "androidx/compose/ui/Modifier"
  private data class BinaryClass(
    val node: ClassNode, val metadata: KotlinClassMetadata, val packageName: String, val artifact: String
  )
  private data class Inventory(
    val artifacts: List<String>, val composePackages: List<String>, val modifierPackages: List<String>,
    val declarations: List<Declaration>
  )
  private data class Declaration(val kind: String, val signature: String, val artifact: String)
}
