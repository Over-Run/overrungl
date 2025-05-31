/*
 * MIT License
 *
 * Copyright (c) 2024-2025 Overrun Organization
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

package overrungl.vulkan

import org.w3c.dom.Element
import org.w3c.dom.Text
import overrungl.gen.GENERATOR_NOTICE
import overrungl.gen.commentedFileHeader
import overrungl.gen.file.*
import overrungl.gen.writeNativeImageRegistration
import overrungl.gen.writeString
import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import kotlin.io.path.Path
import kotlin.io.path.createParentDirectories

// vk.xml: 2025-05-31
// video.xml: 2025-05-31

const val vulkanPackage = "overrungl.vulkan"

const val extBase = 1000000000
const val extBlockSize = 1000

val vkApiVersionRegex = Regex("VK_API_VERSION_\\d+_\\d+")

val vkEnumTypeMapping = mutableMapOf<String, MutableList<String>>()
val vkEnumTypeRawType = mutableMapOf<String, String>()
val vkEnumRawType = mutableMapOf<String, String>()
val vkEnumValueMap = mutableMapOf<String, String>()

val instanceCommands = mutableListOf<String>()
val deviceCommands = mutableListOf<String>()

data class VkDispatchableHandleIntermediate(
    val name: String,
    override val originalName: String = "struct $name*"
) : DefinitionType {
    override val javaType: String = "MemorySegment"
    override val memoryLayout: DefTypeMemoryLayout = PointerLayout
    override val processor: DefTypeProcessor = IdentityProcessor
    override fun withName(originalName: String): DefinitionType = copy(originalName = originalName)
}

data class VkDispatchableHandle(
    val name: String,
    override val originalName: String = "struct $name*"
) : DefinitionType {
    override val javaType: String = name
    override val memoryLayout: DefTypeMemoryLayout = PointerLayout
    override val processor: DefTypeProcessor = object : DefTypeProcessor {
        override fun processDowncall(originalValue: String): String {
            return "$originalValue.segment()"
        }

        override fun processUpcall(originalValue: String): String {
            return "new $name($originalValue)"
        }
    }

    override fun withName(originalName: String): DefinitionType = copy(originalName = originalName)
}

fun videoXML(xmlBuilder: DocumentBuilder): String {
    val document = ClassLoader.getSystemResourceAsStream("video.xml")!!.use { xmlBuilder.parse(it) }
    val root = document.documentElement

    val videoBuilder = StringBuilder()
    val structBuilder = StringBuilder()

    val defineMap = mapOf(
        "VK_MAKE_VIDEO_STD_VERSION" to """
            public static int VK_MAKE_VIDEO_STD_VERSION(int major, int minor, int patch) {
                return (major << 22) | (minor << 12) | patch;
            }
        """.trimIndent(),
        "VK_STD_VULKAN_VIDEO_CODEC_H264_DECODE_API_VERSION_1_0_0" to "public static final int VK_STD_VULKAN_VIDEO_CODEC_H264_DECODE_API_VERSION_1_0_0 = VK_MAKE_VIDEO_STD_VERSION(1, 0, 0);",
        "VK_STD_VULKAN_VIDEO_CODEC_H264_ENCODE_API_VERSION_1_0_0" to "public static final int VK_STD_VULKAN_VIDEO_CODEC_H264_ENCODE_API_VERSION_1_0_0 = VK_MAKE_VIDEO_STD_VERSION(1, 0, 0);",
        "VK_STD_VULKAN_VIDEO_CODEC_H265_DECODE_API_VERSION_1_0_0" to "public static final int VK_STD_VULKAN_VIDEO_CODEC_H265_DECODE_API_VERSION_1_0_0 = VK_MAKE_VIDEO_STD_VERSION(1, 0, 0);",
        "VK_STD_VULKAN_VIDEO_CODEC_H265_ENCODE_API_VERSION_1_0_0" to "public static final int VK_STD_VULKAN_VIDEO_CODEC_H265_ENCODE_API_VERSION_1_0_0 = VK_MAKE_VIDEO_STD_VERSION(1, 0, 0);",
        "VK_STD_VULKAN_VIDEO_CODEC_AV1_DECODE_API_VERSION_1_0_0" to "public static final int VK_STD_VULKAN_VIDEO_CODEC_AV1_DECODE_API_VERSION_1_0_0 = VK_MAKE_VIDEO_STD_VERSION(1, 0, 0);",
        "VK_STD_VULKAN_VIDEO_CODEC_AV1_ENCODE_API_VERSION_1_0_0" to "public static final int VK_STD_VULKAN_VIDEO_CODEC_AV1_ENCODE_API_VERSION_1_0_0 = VK_MAKE_VIDEO_STD_VERSION(1, 0, 0);"
    )
    val enumMap = mutableMapOf<String, MutableList<Pair<String, String>>>()
    val typeNodeList = (root.getElementsByTagName("types").item(0) as Element).getElementsByTagName("type")
    for (i in 0 until typeNodeList.length) {
        val typeNode = typeNodeList.item(i) as Element
        when (val category = typeNode.getAttribute("category")) {
            "enum" -> {
                val name = typeNode.getAttribute("name")
                enumMap[name] = mutableListOf()
                videoBuilder.appendLine("using $name = int;")
            }

            "struct" -> {
                val name = typeNode.getAttribute("name")
                structBuilder.appendLine("""using $name = struct $name { package "$vulkanPackage.video";""")
                val memberNodeList = typeNode.getElementsByTagName("member")
                for (i1 in 0 until memberNodeList.length) {
                    val memberNode = memberNodeList.item(i1) as Element
                    val childNodeList = memberNode.childNodes
                    for (i2 in 0 until childNodeList.length) {
                        structBuilder.append("  ")
                        when (val childNode = childNodeList.item(i2)) {
                            is Text -> structBuilder.append(childNode.wholeText)
                            is Element -> if (childNode.tagName != "comment") {
                                structBuilder.append(childNode.textContent)
                            }
                        }
                    }
                    structBuilder.appendLine(";")
                }
                structBuilder.appendLine("};")
            }

            "", "define", "include" -> {}
            else -> error(category)
        }
    }

    val enumBuilder = StringBuilder()
    val enumsNodeList = root.getElementsByTagName("enums")
    for (i in 0 until enumsNodeList.length) {
        val enumsNode = enumsNodeList.item(i) as Element
        val name = enumsNode.getAttribute("name")
        enumBuilder.appendLine("using $name = enum {")
        val list = enumMap[name]!!
        val enumNodeList = enumsNode.getElementsByTagName("enum")
        for (i1 in 0 until enumNodeList.length) {
            val enumNode = enumNodeList.item(i1) as Element
            val enumName = enumNode.getAttribute("name")
            if (enumNode.hasAttribute("alias")) {
                val alias = enumNode.getAttribute("alias")
                val value = vkEnumValueMap[alias]!!
                list.add(enumName to value)
                vkEnumValueMap[enumName] = value
                enumBuilder.appendLine("  $enumName = $value,")
            } else {
                val value = enumNode.getAttribute("value")
                list.add(enumName to value)
                vkEnumValueMap[enumName] = value
                enumBuilder.appendLine("  $enumName = $value,")
            }
        }
        enumBuilder.appendLine("};")
    }

    val extensionNodeList =
        (root.getElementsByTagName("extensions").item(0) as Element).getElementsByTagName("extension")
    for (i in 0 until extensionNodeList.length) {
        val extensionNode = extensionNodeList.item(i) as Element
        val className = extensionNode.getAttribute("name")
            .split('_')
            .joinToString("") { it.replaceFirstChar(Char::uppercaseChar) }
        writeString(
            Path("src/main/generated/overrungl/vulkan/video/$className.java").createParentDirectories(),
            buildString {
                appendLine(commentedFileHeader)
                appendLine("package overrungl.vulkan.video;")
                if (className != "VulkanVideoCodecsCommon") {
                    appendLine("import static overrungl.vulkan.video.VulkanVideoCodecsCommon.*;")
                }
                appendLine("public final class $className {")
                val requireNodeList = extensionNode.getElementsByTagName("require")
                for (i1 in 0 until requireNodeList.length) {
                    val requireNode = requireNodeList.item(i1) as Element
                    val childNodes = requireNode.childNodes
                    for (i2 in 0 until childNodes.length) {
                        val childNode = childNodes.item(i2)
                        if (childNode is Element) {
                            when (childNode.tagName) {
                                "type" -> {
                                    val typeName = childNode.getAttribute("name")
                                    if (defineMap.containsKey(typeName)) appendLine(
                                        defineMap[typeName]!!.prependIndent(
                                            "    "
                                        )
                                    )
                                    else if (enumMap.containsKey(typeName)) {
                                        enumMap[typeName]!!.forEach { (name, value) ->
                                            appendLine("    public static final int $name = $value;")
                                        }
                                    }
                                }

                                "enum" -> {
                                    val value = childNode.getAttribute("value")
                                    val type = if (value.contains('"')) "String" else "int"
                                    val name = childNode.getAttribute("name")
                                    appendLine(
                                        "    public static final $type $name = $value;"
                                    )
                                    enumBuilder.appendLine("#define $name $value")
                                }
                            }
                        }
                    }
                }
                appendLine("    private $className() { }")
                appendLine("}")
            })
    }

    videoBuilder.appendLine(enumBuilder)
    videoBuilder.appendLine(structBuilder)
    return videoBuilder.toString()
}

/**
 * @author squid233
 * @since 0.1.0
 */
fun main(args: Array<String>) {
    val xmlFactory = DocumentBuilderFactory.newInstance()
    val xmlBuilder = xmlFactory.newDocumentBuilder()

    val videoFile = videoXML(xmlBuilder)

    val document = ClassLoader.getSystemResourceAsStream("vk.xml")!!.use { xmlBuilder.parse(it) }
    val root = document.documentElement

    // vendors
    val vendors = buildList {
        (root.getElementsByTagName("tags").item(0) as Element).getElementsByTagName("tag").also {
            for (i in 0 until it.length) {
                add((it.item(i) as Element).getAttribute("name"))
            }
        }
    }

    // types
    val typesFileBuilder = StringBuilder()
    typesFileBuilder.appendLine(GENERATOR_NOTICE)
    typesFileBuilder.appendLine(
        """
            import "x11.gen";
            import "windows.gen";
            using xcb_connection_t = struct xcb_connection_t;
            using xcb_visualid_t = uint32_t;
            using xcb_window_t = uint32_t;
            using IDirectFB = void*;
            using IDirectFBSurface = void*;
            using zx_handle_t = int32_t;
            using GgpStreamDescriptor = uint32_t;
            using GgpFrameToken = uint64_t;
            using NvSciSyncAttrList = struct NvSciSyncAttrListRec*;
            using NvSciSyncObj = struct NvSciSyncObjRec*;
            using NvSciSyncFence = struct NvSciSyncFence;
            using NvSciBufAttrList = struct NvSciBufAttrListRec*;
            using NvSciBufObj = struct NvSciBufObjRefRec*;

            using CAMetalLayer = void;
            using MTLDevice_id = void*;
            using MTLCommandQueue_id = void*;
            using MTLBuffer_id = void*;
            using MTLTexture_id = void*;
            using MTLSharedEvent_id = void*;
            using IOSurfaceRef = struct __IOSurface*;
            using VkSampleMask = uint32_t;
            using VkBool32 = uint32_t;
            using VkFlags = uint32_t;
            using VkFlags64 = uint64_t;
            using VkDeviceSize = uint64_t;
            using VkDeviceAddress = uint64_t;
            using VkRemoteAddressNV = void*;

        """.trimIndent()
    )
    typesFileBuilder.appendLine(videoFile)
    val upcallBuilder = StringBuilder()
    val structBuilder = StringBuilder()
    val defineVkVersion = mutableMapOf<String, String>()
    val addedStructPackages = mutableSetOf<String>()
    val typeNodeList = (root.getElementsByTagName("types").item(0) as Element).getElementsByTagName("type")
    for (i in 0 until typeNodeList.length) {
        val typeNode = typeNodeList.item(i) as Element
        when (val category = typeNode.getAttribute("category")) {
            "bitmask" -> {
                if (typeNode.hasAttribute("name") && typeNode.hasAttribute("alias")) {
                    val name = typeNode.getAttribute("name")
                    val alias = typeNode.getAttribute("alias")
                    typesFileBuilder.appendLine("using $name = $alias;")
                } else {
                    val type = typeNode.getElementsByTagName("type").item(0).textContent
                    val name = typeNode.getElementsByTagName("name").item(0).textContent
                    typesFileBuilder.appendLine("using $name = $type;")
                }
            }

            "handle" -> {
                if (typeNode.hasAttribute("name") && typeNode.hasAttribute("alias")) {
                    val name = typeNode.getAttribute("name")
                    val alias = typeNode.getAttribute("alias")
                    typesFileBuilder.appendLine("using $name = $alias;")
                } else {
                    val name = typeNode.getElementsByTagName("name").item(0).textContent
                    when (val type = typeNode.getElementsByTagName("type").item(0).textContent) {
                        "VK_DEFINE_HANDLE" -> {
                            typesFileBuilder.appendLine("using $name = java $name;")
                            registerDefType(
                                name,
                                VkDispatchableHandleIntermediate(name)
                            )
                        }

                        "VK_DEFINE_NON_DISPATCHABLE_HANDLE" -> typesFileBuilder.appendLine("using $name = uint64_t;")
                        else -> error(type)
                    }
                }
            }

            "enum" -> {
                val name = typeNode.getAttribute("name")
                if (typeNode.hasAttribute("alias")) {
                    val alias = typeNode.getAttribute("alias")
                    typesFileBuilder.appendLine("using $name = $alias;")
                } else {
                    typesFileBuilder.appendLine("using $name = int;")
                }
            }

            "funcpointer" -> {
                val upcallName = (typeNode.getElementsByTagName("name").item(0) as Element).textContent
                val originalDef = typeNode.textContent
                upcallBuilder.appendLine(
                    originalDef
                        .replaceRange(
                            originalDef.indexOf('('),
                            originalDef.indexOf(')') + 1,
                            upcallName.substringAfter("PFN_").replaceFirstChar(Char::uppercaseChar)
                        )
                        .replace("typedef", "using $upcallName = upcall")
                        .replace("(void)", "()")
                )
            }

            "struct", "union" -> {
                val name = typeNode.getAttribute("name")
                if (typeNode.hasAttribute("alias")) {
                    val alias = typeNode.getAttribute("alias")
                    structBuilder.appendLine("using $name = $alias;")
                } else {
                    val vendor = vendors.find { name.endsWith(it) }
                    val packageName: String
                    if (vendor != null) {
                        val lowercase = vendor.lowercase()
                        packageName = "$vulkanPackage.$lowercase.$category"
                    } else {
                        packageName = "$vulkanPackage.$category"
                    }
                    addedStructPackages.add(packageName)
                    structBuilder.appendLine("""using $name = $category $name { package "$packageName";""")
                    val memberNodeList = typeNode.getElementsByTagName("member")
                    for (i1 in 0 until memberNodeList.length) {
                        val memberNode = memberNodeList.item(i1) as Element
                        if (memberNode.hasAttribute("api") && memberNode.getAttribute("api") == "vulkansc") {
                            continue
                        }
                        val childNodeList = memberNode.childNodes
                        structBuilder.append("  ")
                        for (i2 in 0 until childNodeList.length) {
                            when (val node = childNodeList.item(i2)) {
                                is Text -> structBuilder.append(node.wholeText)
                                is Element -> if (node.tagName != "comment") {
                                    structBuilder.append(node.textContent)
                                }
                            }
                        }
                        structBuilder.appendLine(";")
                    }
                    structBuilder.appendLine("};")
                }
            }

            "define" -> {
                val nameNodeList = typeNode.getElementsByTagName("name")
                if (nameNodeList.length > 0) {
                    val item = nameNodeList.item(0)
                    if (item is Element && item.textContent.matches(vkApiVersionRegex)) {
                        // 0: name
                        // 1: type
                        // 2: args
                        var readingState = 0
                        var name: String? = null
                        var type: String? = null
                        var args: String? = null
                        for (i1 in 0 until typeNode.childNodes.length) {
                            when (val childNode = typeNode.childNodes.item(i1)) {
                                is Text -> if (readingState == 2) {
                                    args = childNode.textContent.substringBefore("//")
                                }

                                is Element -> when (readingState) {
                                    0 -> if (childNode.tagName == "name") {
                                        name = childNode.textContent
                                        readingState = 1
                                    }

                                    1 -> if (childNode.tagName == "type") {
                                        type = childNode.textContent
                                        readingState = 2
                                    }

                                    else -> error(readingState)
                                }
                            }
                        }
                        defineVkVersion[name!!] = "$type$args"
                    }
                }
            }

            "", "include", "basetype" -> {
            }

            else -> error(category)
        }
    }

    // enums
    val enumsBuilder = StringBuilder()
    root.getElementsByTagName("enums").also { enumsNodeList ->
        for (i in 0 until enumsNodeList.length) {
            val enumsNode = enumsNodeList.item(i) as Element
            when (val enumsNodeType = enumsNode.getAttribute("type")) {
                "constants" -> {
                    enumsNode.getElementsByTagName("enum").also { enumNodeList ->
                        for (i1 in 0 until enumNodeList.length) {
                            val node = enumNodeList.item(i1) as Element
                            val type = node.getAttribute("type")
                            val name = node.getAttribute("name")
                            val value = node.getAttribute("value")
                                .replace("U)", ")")
                                .replace("ULL)", "L)")
                            val javaType = findBuiltinType(type)!!.javaType
                            vkEnumRawType[name] = javaType
                            vkEnumValueMap[name] = value
                            enumsBuilder.appendLine(
                                "#defineAs $javaType $name $value"
                            )
                        }
                    }
                }

                "enum", "bitmask" -> {
                    val enumsNodeName = enumsNode.getAttribute("name")
                    enumsNode.getElementsByTagName("enum").also { enumNodeList ->
                        val type = if (enumsNode.hasAttribute("bitwidth")) "long" else "int"
                        val list = mutableListOf<String>()
                        vkEnumTypeRawType[enumsNodeName] = type
                        for (i1 in 0 until enumNodeList.length) {
                            val node = enumNodeList.item(i1) as Element
                            val name = node.getAttribute("name")
                            when (enumsNodeType) {
                                "enum" -> {
                                    val value = if (node.hasAttribute("alias")) {
                                        vkEnumValueMap[node.getAttribute("alias")]!!
                                    } else {
                                        node.getAttribute("value")
                                    }
                                    vkEnumValueMap[name] = value
                                    enumsBuilder.appendLine("#define $name $value")
                                }

                                "bitmask" -> {
                                    val value = if (node.hasAttribute("alias")) {
                                        vkEnumValueMap[node.getAttribute("alias")]!!
                                    } else if (node.hasAttribute("bitpos")) {
                                        "0x${
                                            "%08x".format(1L shl node.getAttribute("bitpos").toInt())
                                        }${if (type == "long") "L" else ""}"
                                    } else if (node.hasAttribute("value")) {
                                        node.getAttribute("value")
                                    } else error(name)
                                    vkEnumValueMap[name] = value!!
                                    enumsBuilder.appendLine("#defineAs $type $name $value")
                                }
                            }
                            vkEnumRawType[name] = type
                            list.add(name)
                        }
                        vkEnumTypeMapping[enumsNodeName] = list
                    }
                }
            }
        }
    }

    // commands
    val commandBuilder = StringBuilder()
    val commandAliasMap = mutableMapOf<String, MutableList<String>>()
    val commandNodeList = (root.getElementsByTagName("commands").item(0) as Element).getElementsByTagName("command")
    for (i in 0 until commandNodeList.length) {
        val commandNode = commandNodeList.item(i) as Element
        if (commandNode.hasAttribute("alias")) {
            val alias = commandNode.getAttribute("alias")
            val name = commandNode.getAttribute("name")
            commandAliasMap.computeIfAbsent(alias) { mutableListOf() }.add(name)
            commandAliasMap.computeIfAbsent(name) { mutableListOf() }.add(alias)
        } else {
            val proto = commandNode.getElementsByTagName("proto").item(0) as Element
            commandBuilder.append("fn opt ${proto.textContent}(")

            val childNodeList = commandNode.childNodes
            var writeParamCount = 0
            for (i1 in 0 until childNodeList.length) {
                val paramNode = childNodeList.item(i1)
                if (paramNode !is Element || paramNode.tagName != "param")
                    continue
                if (paramNode.hasAttribute("api") && paramNode.getAttribute("api") == "vulkansc")
                    continue
                if (writeParamCount > 0) {
                    commandBuilder.append(", ")
                }
                commandBuilder.append(paramNode.textContent)
                writeParamCount++
            }
            commandBuilder.appendLine(");")
        }
    }

    fun addExtEnum(childNode: Element, extNumber: String, skipAlias: Boolean) {
        if (childNode.hasAttribute("api") && childNode.getAttribute("api") == "vulkansc")
            return
        val name = childNode.getAttribute("name")
        if (childNode.hasAttribute("extends")) {
            val type = vkEnumTypeRawType[childNode.getAttribute("extends")]!!
            val value = if (childNode.hasAttribute("bitpos")) {
                "0x${
                    "%08x".format(1L shl childNode.getAttribute("bitpos").toInt())
                }${if (type == "long") "L" else ""}"
            } else if (childNode.hasAttribute("offset")) {
                buildString {
                    if (childNode.hasAttribute("dir")) {
                        append(childNode.getAttribute("dir"))
                    }
                    append(
                        extBase + (extNumber.toInt() - 1) * extBlockSize
                            + childNode.getAttribute("offset").toInt()
                    )
                }
            } else if (childNode.hasAttribute("value")) {
                childNode.getAttribute("value")
            } else if (childNode.hasAttribute("alias")) {
                vkEnumValueMap[childNode.getAttribute("alias")] ?: if (skipAlias) return else error(name)
            } else error(name)
            vkEnumRawType[name] = type
            vkEnumValueMap[name] = value
            enumsBuilder.appendLine("#defineAs $type $name $value")
        } else if (childNode.hasAttribute("value")) {
            val value = childNode.getAttribute("value")
            val type = if (value.contains('"')) "String" else "int"
            vkEnumRawType[name] = type
            vkEnumValueMap[name] = value
            enumsBuilder.appendLine("#defineAs $type $name $value")
        } else if (childNode.hasAttribute("alias")) {
            val alias = childNode.getAttribute("alias")
            val value = vkEnumValueMap[alias] ?: if (skipAlias) return else error(name)
            val type = vkEnumRawType[alias] ?: if (skipAlias) return else error(name)
            vkEnumRawType[name] = type
            vkEnumValueMap[name] = value
            enumsBuilder.appendLine("#defineAs $type $name $value")
        }
    }

    val featureNodeList = root.getElementsByTagName("feature")
    for (b in 0..1) {
        for (i in 0 until featureNodeList.length) {
            val featureNode = featureNodeList.item(i) as Element
            if (featureNode.hasAttribute("api") && featureNode.getAttribute("api").split(',').contains("vulkan")) {
                val requireNodeList = featureNode.getElementsByTagName("require")
                for (i1 in 0 until requireNodeList.length) {
                    val requireNode = requireNodeList.item(i1) as Element
                    val childNodeList = requireNode.childNodes
                    for (i2 in 0 until childNodeList.length) {
                        val childNode = childNodeList.item(i2)
                        if (childNode is Element) {
                            when (childNode.tagName) {
                                "enum" -> {
                                    addExtEnum(childNode, childNode.getAttribute("extnumber"), skipAlias = b == 0)
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    val extensionNodeList =
        (root.getElementsByTagName("extensions").item(0) as Element).getElementsByTagName("extension")
    for (b in 0..1) {
        for (i in 0 until extensionNodeList.length) {
            val extensionNode = extensionNodeList.item(i) as Element
            if (extensionNode.getAttribute("supported").split(',').contains("vulkan")) {
                val extNumber = extensionNode.getAttribute("number")
                val requireNodeList = extensionNode.getElementsByTagName("require")
                for (i1 in 0 until requireNodeList.length) {
                    val requireNode = requireNodeList.item(i1) as Element
                    for (i2 in 0 until requireNode.childNodes.length) {
                        val childNode = requireNode.childNodes.item(i2)
                        if (childNode is Element) {
                            when (childNode.tagName) {
                                "enum" -> {
                                    addExtEnum(childNode, extNumber, skipAlias = b == 0)
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    typesFileBuilder.appendLine(enumsBuilder)
    typesFileBuilder.appendLine(upcallBuilder)
    typesFileBuilder.appendLine(structBuilder)
    typesFileBuilder.appendLine(commandBuilder)
    val typesFile = typesFileBuilder.toString()
    // generate
    val definitionFile: DefinitionFile
    try {
        definitionFile = DefinitionFile(rawSourceString = typesFile)
        definitionFile.compileUpcalls("overrungl.vulkan.upcall", newPath = true)
        definitionFile.compileStructs("overrungl.vulkan.struct", newPath = true)
    } catch (e: Exception) {
        writeString(Path("run/types.gen").createParentDirectories(), typesFile)
        throw e
    }

    // feature
    val vkDowncalls = mutableListOf<VkDowncall>()
    for (i in 0 until featureNodeList.length) {
        val featureNode = featureNodeList.item(i) as Element
        if (featureNode.hasAttribute("api") && featureNode.getAttribute("api").split(',').contains("vulkan")) {
            val featureNumber = featureNode.getAttribute("number")
            val featureReqTypes = mutableListOf<String>()
            val featureReqCommands = mutableListOf<String>()
            val featureReqEnums = mutableListOf<String>()
            val requireNodeList = featureNode.getElementsByTagName("require")
            for (i1 in 0 until requireNodeList.length) {
                val requireNode = requireNodeList.item(i1) as Element
                val childNodeList = requireNode.childNodes
                for (i2 in 0 until childNodeList.length) {
                    val childNode = childNodeList.item(i2)
                    if (childNode is Element) {
                        when (childNode.tagName) {
                            "type" -> featureReqTypes.add(childNode.getAttribute("name"))
                            "command" -> featureReqCommands.add(childNode.getAttribute("name"))
                            "enum" -> {
                                if (childNode.hasAttribute("api") && childNode.getAttribute("api") == "vulkansc")
                                    continue
                                featureReqEnums.add(childNode.getAttribute("name"))
                            }
                        }
                    }
                }
            }

            val className = "VK${featureNumber.replace(".", "")}"
            vkDowncalls += VkDowncall(vulkanPackage, className) {
                if (featureNumber == "1.0") {
                    defineVkVersion.forEach { (k, v) ->
                        fields.add(
                            VkDowncallField("int", k, v)
                        )
                    }
                }

                addReqTypes(interpreter = definitionFile.interpreter, featureReqTypes)
                addReqEnums(interpreter = definitionFile.interpreter, featureReqEnums)
                addReqCommand(interpreter = definitionFile.interpreter, featureReqCommands, commandAliasMap)

                if (featureNumber == "1.0") {
                    customCode = """
                        public static final long VK_NULL_HANDLE = 0L;

                        public static int VK_MAKE_API_VERSION(int variant, int major, int minor, int patch) {
                            return (variant << 29) | (major << 22) | (minor << 12) | patch;
                        }
                        public static int VK_API_VERSION_VARIANT(int version) { return version >> 29; }
                        public static int VK_API_VERSION_MAJOR(int version) { return (version >> 22) & 0x7F; }
                        public static int VK_API_VERSION_MINOR(int version) { return (version >> 12) & 0x3FF; }
                        public static int VK_API_VERSION_PATCH(int version) { return version & 0xFFF; }
                    """.trimIndent()
                }
            }
        }
    }

    // extensions
    val extensionVendors = mutableSetOf<String>()
    val extensionDowncalls = mutableMapOf<String, VkDowncall>()
    for (i in 0 until extensionNodeList.length) {
        val extensionNode = extensionNodeList.item(i) as Element
        if (extensionNode.getAttribute("supported").split(',').contains("vulkan")) {
            val rawName = extensionNode.getAttribute("name")
            val extName = rawName
                .split('_')
                .joinToString("") { it.replaceFirstChar(Char::uppercaseChar) }
            val extVendor = rawName
                .substringAfter("VK_")
                .substringBefore('_')
                .lowercase()
            extensionVendors.add(extVendor)

            val extReqTypes = mutableListOf<String>()
            val extReqCommands = mutableListOf<String>()
            val extReqEnums = mutableListOf<String>()
            val requireNodeList = extensionNode.getElementsByTagName("require")
            for (i1 in 0 until requireNodeList.length) {
                val requireNode = requireNodeList.item(i1) as Element
                for (i2 in 0 until requireNode.childNodes.length) {
                    val childNode = requireNode.childNodes.item(i2)
                    if (childNode is Element) {
                        when (childNode.tagName) {
                            "type" -> extReqTypes.add(childNode.getAttribute("name"))
                            "command" -> extReqCommands.add(childNode.getAttribute("name"))
                            "enum" -> extReqEnums.add(childNode.getAttribute("name"))
                        }
                    }
                }
            }

            val downcall = VkDowncall("$vulkanPackage.$extVendor", extName) {
                addReqTypes(interpreter = definitionFile.interpreter, extReqTypes)
                addReqEnums(interpreter = definitionFile.interpreter, extReqEnums)
                addReqCommand(interpreter = definitionFile.interpreter, extReqCommands, commandAliasMap)
            }
            extensionDowncalls[rawName] = downcall
        }
    }

    vkDowncalls.forEach { it.write() }
    extensionDowncalls.values.forEach { it.write() }

    fun writeCapabilities(type: String, param: String, commandList: List<String>) {
        writeString(Path("src/main/generated/overrungl/vulkan/VKCapabilities$type.java"), buildString {
            val commands = commandList.distinct()
            appendLine(commentedFileHeader)
            appendLine(
                """
                package $vulkanPackage;
                import java.lang.foreign.*;
                public final class VKCapabilities$type {
            """.trimIndent()
            )
            commands.forEach {
                appendLine("    public final MemorySegment PFN_$it;")
            }
            appendLine("    public VKCapabilities$type(MemorySegment $param, VKLoadFunc func) {")
            commands.forEach { cmd ->
                append("""        PFN_$cmd = func.invoke($param, "$cmd"""")
                commandAliasMap[cmd]?.onEach { append(""", "$it"""") }
                appendLine(");")
            }
            appendLine("    }")
            appendLine("}")
        })
    }
    writeCapabilities("Instance", "instance", instanceCommands)
    writeCapabilities("Device", "device", deviceCommands)

    // module-info.java
    writeString(Path("src/main/generated/module-info.java"), buildString {
        appendLine(commentedFileHeader)
        appendLine()
        appendLine("/// The Vulkan binding.")
        appendLine("module overrungl.vulkan {")
        appendLine("    exports $vulkanPackage;")
        extensionVendors.sorted().forEach { appendLine("    exports $vulkanPackage.$it;") }
        addedStructPackages.sorted().forEach { appendLine("    exports $it;") }
        appendLine("    exports $vulkanPackage.upcall;")
        appendLine("    exports $vulkanPackage.video;")
        appendLine()
        appendLine("    requires transitive overrungl.core;")
        appendLine("    requires static org.graalvm.nativeimage;")
        appendLine("}")
        appendLine()
    })

    writeNativeImageRegistration(vulkanPackage, newPath = true)
}
