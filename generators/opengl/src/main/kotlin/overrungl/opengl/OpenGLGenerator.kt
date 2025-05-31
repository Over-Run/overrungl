/*
 * MIT License
 *
 * Copyright (c) 2025 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

package overrungl.opengl

import org.w3c.dom.Element
import overrungl.gen.*
import overrungl.gen.file.DefinitionFile
import overrungl.gen.file.functionDescriptor
import overrungl.gen.file.registerDefType
import overrungl.gen.file.unsigned_char_boolean
import javax.xml.parsers.DocumentBuilderFactory
import kotlin.io.path.Path
import kotlin.io.path.createDirectories

// gl.xml updated: 2025/01/26

const val openglPackage = "overrungl.opengl"
fun extPackage(vendor: String): String {
    val lowercase = vendor.lowercase()
    if (lowercase == "3dfx") return "$openglPackage.threedfx"
    return "$openglPackage.$lowercase"
}

val featureExtends = mapOf(
    "1.1" to "10",
    "1.2" to "11",
    "1.3" to "12",
    "1.4" to "13",
    "1.5" to "14",
    "2.0" to "15",
    "2.1" to "20",
    "3.0" to "21",
    "3.1" to "30",
    "3.2" to "31",
    "3.3" to "32",
    "4.0" to "33",
    "4.1" to "40",
    "4.2" to "41",
    "4.3" to "42",
    "4.4" to "43",
    "4.5" to "44",
    "4.6" to "45",
)

fun isAOlder(a: String, b: String): Boolean {
    val splitA = a.split('.')
    val splitB = b.split('.')
    val majorA = splitA[0].toInt()
    val majorB = splitB[0].toInt()
    val minorA = splitA[1].toInt()
    val minorB = splitB[1].toInt()
    if (majorA < majorB) return true
    if (majorA > majorB) return false
    return minorA < minorB
}

fun main() {
    registerDefType("GLboolean", unsigned_char_boolean.copy(originalName = "GLboolean"))

    val xmlFactory = DocumentBuilderFactory.newInstance()
    val xmlBuilder = xmlFactory.newDocumentBuilder()
    val document = ClassLoader.getSystemResourceAsStream("gl.xml")!!.use { xmlBuilder.parse(it) }
    val root = document.documentElement

    // enums
    val enumMap = mutableMapOf<String, GLEnum>()
    root.getElementsByTagName("enums").also {
        for (i in 0 until it.length) {
            it.item(i).childNodes.also { enums ->
                for (j in 0 until enums.length) {
                    enums.item(j).also { enum ->
                        if (enum is Element && enum.tagName == "enum") {
                            val value = enum.getAttribute("value")
                            val name = enum.getAttribute("name")
                            val type = if (enum.hasAttribute("type")) enum.getAttribute("type") else null
                            enumMap[name] = GLEnum(name = name, value = value, type = type)
                        }
                    }
                }
            }
        }
    }

    // commands
    val commandsFileBuilder = StringBuilder()
    commandsFileBuilder.appendLine(GENERATOR_NOTICE)
    commandsFileBuilder.appendLine("""import "upcall.gen";""")
    val aliasMap = mutableMapOf<String, MutableList<String>>()
    root.getElementsByTagName("commands").also {
        for (i in 0 until it.length) {
            it.item(i).childNodes.also { commands ->
                for (j in 0 until commands.length) {
                    commands.item(j).childNodes.also { command ->
                        if (command is Element && command.tagName == "command") {
                            // type and name
                            val proto = command.getElementsByTagName("proto").item(0) as Element
                            val name = (proto.getElementsByTagName("name").item(0) as Element).textContent
                            commandsFileBuilder.append("fn opt ${proto.textContent}(")

                            // parameters
                            val params = command.getElementsByTagName("param")
                            for (i1 in 0 until params.length) {
                                val param = params.item(i1) as Element
                                if (i1 > 0) {
                                    commandsFileBuilder.append(", ")
                                }
                                commandsFileBuilder.append(param.textContent)
                            }
                            commandsFileBuilder.appendLine(");")

                            // alias
                            val aliases = command.getElementsByTagName("alias")
                            for (i1 in 0 until aliases.length) {
                                val alias = aliases.item(i1) as Element
                                aliasMap.computeIfAbsent(alias.getAttribute("name")) { mutableListOf() }
                                    .add(name!!)
                            }
                        }
                    }
                }
            }
        }
    }
    val commandsFile: DefinitionFile
    try {
        commandsFile = DefinitionFile(rawSourceString = commandsFileBuilder.toString())
    } catch (e: Exception) {
        println(commandsFileBuilder)
        throw e
    }

    // features
    val features = mutableListOf<GLFeature>()
    val removeEnums = mutableListOf<GLRemoveEnum>()
    val removeCommands = mutableListOf<GLRemoveCommand>()
    val featureList = root.getElementsByTagName("feature")
    for (i in 0 until featureList.length) {
        val feature = featureList.item(i) as Element
        if (feature.getAttribute("api") == "gl") {
            val number = feature.getAttribute("number")
            val featureRequires = mutableListOf<GLRequire>()
            feature.getElementsByTagName("require").also { nodeList ->
                for (i1 in 0 until nodeList.length) {
                    val require = nodeList.item(i1) as Element
                    val reqEnums = mutableListOf<GLRequireEnum>()
                    val reqCommands = mutableListOf<GLRequireCommand>()
                    require.getElementsByTagName("enum").also {
                        for (i2 in 0 until it.length) {
                            val node = it.item(i2) as Element
                            reqEnums.add(GLRequireEnum(node.getAttribute("name")))
                        }
                    }
                    require.getElementsByTagName("command").also {
                        for (i2 in 0 until it.length) {
                            val node = it.item(i2) as Element
                            reqCommands.add(GLRequireCommand(node.getAttribute("name")))
                        }
                    }
                    featureRequires.add(
                        GLRequire(
                            profile = if (require.hasAttribute("profile"))
                                require.getAttribute("profile")
                            else null,
                            reqEnums,
                            reqCommands
                        )
                    )
                }
            }
            feature.getElementsByTagName("remove").also { nodeList ->
                for (i1 in 0 until nodeList.length) {
                    val remove = nodeList.item(i1) as Element
                    remove.getElementsByTagName("enum").also {
                        for (i2 in 0 until it.length) {
                            val node = it.item(i2) as Element
                            removeEnums.add(GLRemoveEnum(node.getAttribute("name"), number))
                        }
                    }
                    remove.getElementsByTagName("command").also {
                        for (i2 in 0 until it.length) {
                            val node = it.item(i2) as Element
                            removeCommands.add(GLRemoveCommand(node.getAttribute("name"), number))
                        }
                    }
                }
            }
            features.add(GLFeature(number, featureRequires))
        }
    }

    fun InstanceDowncall.addEnum(enum: GLRequireEnum) {
        val get = enumMap[enum.name]!!
        val longType = get.type == "ull"
        field(
            InstanceDowncallField(
                modifier = "public static final",
                type = if (longType) "long" else "int",
                name = get.name,
                value = if (longType) "${get.value}L" else get.value
            )
        )
    }

    fun InstanceDowncall.addCommand(command: GLRequireCommand) {
        // descriptor
        val descriptor = functionDescriptor(commandsFile.interpreter.functions()[command.name] ?: error(command.name))
        nativeImageDowncallDescriptors.add(descriptor)

        // handle
        handleFields.add(
            InstanceDowncallField(
                modifier = "public static final",
                type = "MethodHandle",
                name = "MH_${command.name}",
                value = "RuntimeHelper.downcall($descriptor)"
            )
        )

        // address
        pfnFields.add(
            InstanceDowncallField(
                modifier = "public final",
                type = "MemorySegment",
                name = "PFN_${command.name}"
            )
        )

        method((commandsFile.interpreter.functions()[command.name] ?: error(command.name))
            .copy(name = command.name.substring(2), entrypoint = command.name))
    }

    // core
    val featureAddedEnums = mutableListOf<String>()
    val featureAddedCommands = mutableListOf<String>()
    features.forEach { feature ->
        InstanceDowncall(openglPackage, "GL${feature.number.replace(".", "")}") {
            featureExtends[feature.number]?.also { extends("GL${it}") }
            constructorParam = "GLLoadFunc func"
            handlesConstructorCode = buildString {
                val thisFeatureAddedCommand = mutableListOf<String>()
                var i = 0
                feature.coreForEach(removeCommands, GLRequire::commands) { command ->
                    if (command.name !in thisFeatureAddedCommand &&
                        command.name !in featureAddedCommands
                    ) {
                        if (i > 0) {
                            appendLine()
                        }
                        append("""PFN_${command.name} = func.invoke("${command.name}"""")
                        aliasMap[command.name]?.forEach { append(""", "$it"""") }
                        append(""");""")
                        i++
                        thisFeatureAddedCommand.add(command.name)
                    }
                }
            }
            constructorCode = buildString {
                if (feature.number != "1.0") {
                    appendLine("super(func);")
                }
                append("this.handles = new Handles(func);")
            }

            feature.coreForEach(removeEnums, GLRequire::enums) {
                if (it.name !in featureAddedEnums) {
                    addEnum(it)
                    featureAddedEnums.add(it.name)
                }
            }
            feature.coreForEach(removeCommands, GLRequire::commands) {
                if (it.name !in featureAddedCommands) {
                    addCommand(it)
                    featureAddedCommands.add(it.name)
                }
            }
            if (handleFields.isNotEmpty()) {
                field(InstanceDowncallField(modifier = "private final", type = "Handles", name = "handles"))
            }
        }
    }

    // compatibility
    // not going to add removed features

    // extension
    val extensions = mutableListOf<GLExtension>()
    val extensionList = (root.getElementsByTagName("extensions").item(0) as Element)
        .getElementsByTagName("extension")
    for (i in 0 until extensionList.length) {
        val extension = extensionList.item(i) as Element
        val supported = extension.getAttribute("supported")
        if (supported.split('|').contains("gl")) {
            val name = extension.getAttribute("name")
            val extensionRequires = mutableListOf<GLRequire>()
            val requireList = extension.getElementsByTagName("require")
            for (i1 in 0 until requireList.length) {
                val require = requireList.item(i1) as Element
                val requireEnums = mutableListOf<GLRequireEnum>()
                val requireCommands = mutableListOf<GLRequireCommand>()
                require.getElementsByTagName("enum").also {
                    for (i2 in 0 until it.length) {
                        val node = it.item(i2) as Element
                        requireEnums.add(GLRequireEnum(node.getAttribute("name")))
                    }
                }
                require.getElementsByTagName("command").also {
                    for (i2 in 0 until it.length) {
                        val node = it.item(i2) as Element
                        requireCommands.add(GLRequireCommand(node.getAttribute("name")))
                    }
                }
                extensionRequires.add(GLRequire(null, requireEnums, requireCommands))
            }
            extensions.add(GLExtension(name, extensionRequires))
        }
    }

    // generate extensions
    run {
        val vendors = mutableSetOf<String>()
        extensions.forEach { extension ->
            if (extension.requires.isNotEmpty()) {
                val vendor = extension.name.substring(3).substringBefore('_')
                vendors.add(vendor)

                Path(extPackage(vendor).replace('.', '/')).createDirectories()
            }
        }
        extensions.forEach { extension ->
            if (extension.requires.isNotEmpty()) {
                val vendor = extension.name.substring(3).substringBefore('_')
                val className = extension.name.split('_')
                    .joinToString("") { it.replaceFirstChar(Char::uppercaseChar) }
                InstanceDowncall(extPackage(vendor), className) {
                    modifier = "final"
                    if (extension.requires.all { it.commands.isEmpty() }) {
                        constructorModifier = "private"
                    } else {
                        constructorParam = "overrungl.opengl.GLLoadFunc func"
                        handlesConstructorCode = buildString {
                            extension.requires.forEach { require ->
                                require.commands.forEachIndexed { index, command ->
                                    if (index > 0) {
                                        appendLine()
                                    }
                                    append("""PFN_${command.name} = func.invoke("${command.name}"""")
                                    aliasMap.entries.find { it.value.contains(command.name) }?.key?.also { append(""", "$it"""") }
                                    append(");")
                                }
                            }
                        }
                        constructorCode = "this.handles = new Handles(func);"
                    }

                    extension.requires.forEach { require ->
                        require.enums.forEach(::addEnum)
                        require.commands.forEach(::addCommand)
                    }
                    if (handleFields.isNotEmpty()) {
                        field(InstanceDowncallField(modifier = "private final", type = "Handles", name = "handles"))
                    }
                }
            }
        }


        // generate module-info.java
        writeString(Path("module-info.java"), buildString {
            appendLine(commentedFileHeader)
            appendLine(
                """
                    /// The OpenGL binding.
                    module overrungl.opengl {
                        exports overrungl.opengl;
                """.trimIndent()
            )
            vendors.forEach { appendLine("    exports ${extPackage(it)};") }
            appendLine(
                """
                    |
                    |    requires transitive overrungl.core;
                    |    requires static org.jetbrains.annotations;
                    |    requires static org.graalvm.nativeimage;
                """.trimMargin()
            )
            appendLine("}")
        })
    }

    // flags
    writeString(Path("overrungl/opengl/GLFlags.java"), buildString {
        appendLine(commentedFileHeader)
        appendLine(
            """
                package $openglPackage;

                public final class GLFlags {
                    public final boolean GL10, GL11, GL12, GL13, GL14, GL15;
                    public final boolean GL20, GL21;
                    public final boolean GL30, GL31, GL32, GL33;
                    public final boolean GL40, GL41, GL42, GL43, GL44, GL45, GL46;
            """.trimIndent()
        )
        extensions.forEach { extension ->
            appendLine("    public final boolean ${extension.name};")
        }
        appendLine()
        appendLine(
            """
                |    public GLFlags(GLLoadFunc func) {
                |        var loader = new GLLoader(func);
                |        int version = loader.findCoreGL();
                |        int major = GLLoader.versionMajor(version), minor = GLLoader.versionMinor(version);
                |        GL10 = (major == 1 && minor >= 0) || major > 1;
                |        GL11 = (major == 1 && minor >= 1) || major > 1;
                |        GL12 = (major == 1 && minor >= 2) || major > 1;
                |        GL13 = (major == 1 && minor >= 3) || major > 1;
                |        GL14 = (major == 1 && minor >= 4) || major > 1;
                |        GL15 = (major == 1 && minor >= 5) || major > 1;
                |        GL20 = (major == 2 && minor >= 0) || major > 2;
                |        GL21 = (major == 2 && minor >= 1) || major > 2;
                |        GL30 = (major == 3 && minor >= 0) || major > 3;
                |        GL31 = (major == 3 && minor >= 1) || major > 3;
                |        GL32 = (major == 3 && minor >= 2) || major > 3;
                |        GL33 = (major == 3 && minor >= 3) || major > 3;
                |        GL40 = (major == 4 && minor >= 0) || major > 4;
                |        GL41 = (major == 4 && minor >= 1) || major > 4;
                |        GL42 = (major == 4 && minor >= 2) || major > 4;
                |        GL43 = (major == 4 && minor >= 3) || major > 4;
                |        GL44 = (major == 4 && minor >= 4) || major > 4;
                |        GL45 = (major == 4 && minor >= 5) || major > 4;
                |        GL46 = (major == 4 && minor >= 6) || major > 4;
                |        var exts = loader.getExtensions(version);
            """.trimMargin()
        )
        extensions.forEach { extension ->
            appendLine("""        ${extension.name} = loader.hasExtension(version, exts, "${extension.name}");""")
        }
        appendLine("    }")
        appendLine("}")
    })

    DefinitionFile("struct.gen").compileStructs(openglPackage)
    DefinitionFile("upcall.gen").compileUpcalls(openglPackage)

    writeNativeImageRegistration(openglPackage)
}

data class GLEnum(val name: String, val value: String, val type: String?)

interface GLRequireEntry {
    val name: String
}

data class GLRequireEnum(override val name: String) : GLRequireEntry
data class GLRequireCommand(override val name: String) : GLRequireEntry

interface GLRemoveEntry {
    val name: String
    val removeNumber: String
}

data class GLRemoveEnum(override val name: String, override val removeNumber: String) : GLRemoveEntry
data class GLRemoveCommand(override val name: String, override val removeNumber: String) : GLRemoveEntry

data class GLRequire(val profile: String?, val enums: List<GLRequireEnum>, val commands: List<GLRequireCommand>)

data class GLFeature(val number: String, val requires: List<GLRequire>) {
    fun <T : GLRequireEntry> coreForEach(
        removed: List<GLRemoveEntry>,
        listGetter: (GLRequire) -> List<T>,
        action: (T) -> Unit
    ) {
        requires.forEach { require ->
            listGetter(require).forEach { e ->
                if ((require.profile == null && (removed.find { it.name == e.name }?.let {
                        isAOlder(it.removeNumber, number)
                    } != false)) ||
                    require.profile == "core"
                ) {
                    action(e)
                }
            }
        }
    }
}

data class GLExtension(val name: String, val requires: List<GLRequire>)
