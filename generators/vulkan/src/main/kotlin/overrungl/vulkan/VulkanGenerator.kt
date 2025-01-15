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
import overrungl.gen.*
import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import kotlin.io.path.Path

// vk.xml: 2025-01-08
// video.xml: 2025-01-09

const val vulkanPackage = "overrungl.vulkan"

const val extBase = 1000000000
const val extBlockSize = 1000

val vkApiVersionRegex = Regex("VK_API_VERSION_\\d+_\\d+")

val vkExtends = mapOf(
    "1.1" to "10",
    "1.2" to "11",
    "1.3" to "12",
    "1.4" to "13",
)

fun videoXML(xmlBuilder: DocumentBuilder) {
    val document = ClassLoader.getSystemResourceAsStream("video.xml")!!.use { xmlBuilder.parse(it) }
    val root = document.documentElement

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
    val enumMap = mutableMapOf<String, MutableList<VkEnum>>()
    val typeNodeList = (root.getElementsByTagName("types").item(0) as Element).getElementsByTagName("type")
    for (i in 0 until typeNodeList.length) {
        val typeNode = typeNodeList.item(i) as Element
        when (val category = typeNode.getAttribute("category")) {
            "enum" -> {
                val name = typeNode.getAttribute("name")
                typedef(int, name)
                enumMap[name] = mutableListOf()
            }

            "struct" -> {
                val name = typeNode.getAttribute("name")
                Struct("$vulkanPackage.video", name, cType = name) {
                    val memberNodeList = typeNode.getElementsByTagName("member")
                    for (i1 in 0 until memberNodeList.length) {
                        val memberNode = memberNodeList.item(i1) as Element
                        val childNodeList = memberNode.childNodes
                        val memberType = mutableListOf<VkTypeComponent>()
                        var memberName: String? = null
                        for (i2 in 0 until childNodeList.length) {
                            when (val childNode = childNodeList.item(i2)) {
                                is Text -> memberType.add(VkTypeLiteral(childNode.wholeText.trim()))
                                is Element -> when (childNode.tagName) {
                                    "type" -> memberType.add(VkTypeResolving(childNode.textContent))
                                    "name" -> memberName = childNode.textContent
                                }
                            }
                        }
                        resolveType(memberType).toCustomTypeSpec()(memberName!!)
                    }
                }
                typedef(VkType(name, address.javaName, "$name.LAYOUT", true), name)
            }

            "", "define", "include" -> {}
            else -> error(category)
        }
    }

    val enumsNodeList = root.getElementsByTagName("enums")
    for (i in 0 until enumsNodeList.length) {
        val enumsNode = enumsNodeList.item(i) as Element
        val list = enumMap[enumsNode.getAttribute("name")]!!
        val enumNodeList = enumsNode.getElementsByTagName("enum")
        for (i1 in 0 until enumNodeList.length) {
            val enumNode = enumNodeList.item(i1) as Element
            val name = enumNode.getAttribute("name")
            if (enumNode.hasAttribute("alias")) {
                list.add(VkEnum(name, value = enumNode.getAttribute("alias"), bitpos = null, alias = null))
            } else {
                list.add(VkEnum(name, value = enumNode.getAttribute("value"), bitpos = null, alias = null))
            }
        }
    }

    val extensionNodeList =
        (root.getElementsByTagName("extensions").item(0) as Element).getElementsByTagName("extension")
    for (i in 0 until extensionNodeList.length) {
        val extensionNode = extensionNodeList.item(i) as Element
        val name = extensionNode.getAttribute("name")
            .split('_')
            .joinToString("") { it.replaceFirstChar(Char::uppercaseChar) }
        writeString(Path("overrungl/vulkan/video/$name.java"), buildString {
            appendLine(commentedFileHeader)
            appendLine("package overrungl.vulkan.video;")
            if (name != "VulkanVideoCodecsCommon") {
                appendLine("import static overrungl.vulkan.video.VulkanVideoCodecsCommon.*;")
            }
            appendLine("public final class $name {")
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
                                if (defineMap.containsKey(typeName)) appendLine(defineMap[typeName]!!.prependIndent("    "))
                                else if (enumMap.containsKey(typeName)) {
                                    enumMap[typeName]!!.forEach { appendLine("    public static final int ${it.name} = ${it.value};") }
                                }
                            }

                            "enum" -> {
                                val value = childNode.getAttribute("value")
                                val type = if (value.contains('"')) "String" else "int"
                                appendLine(
                                    "    public static final $type ${childNode.getAttribute("name")} = $value;"
                                )
                            }
                        }
                    }
                }
            }
            appendLine("    private $name() { }")
            appendLine("}")
        })
    }
}

/**
 * @author squid233
 * @since 0.1.0
 */
fun main() {
    val xmlFactory = DocumentBuilderFactory.newInstance()
    val xmlBuilder = xmlFactory.newDocumentBuilder()

    videoXML(xmlBuilder)

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
    val defineVkVersion = mutableMapOf<String, String>()
    val addedStructPackages = mutableSetOf<String>()
    val vkStructMap = mutableMapOf<String, VkStruct>()
    val vkFuncPointerMap = mutableMapOf<String, VkFuncPointer>()
    val typeNodeList = (root.getElementsByTagName("types").item(0) as Element).getElementsByTagName("type")
    for (i in 0 until typeNodeList.length) {
        val typeNode = typeNodeList.item(i) as Element
        when (val category = typeNode.getAttribute("category")) {
            "bitmask" -> {
                if (typeNode.hasAttribute("name") && typeNode.hasAttribute("alias")) {
                    typedef(
                        findType(VkTypeResolving(typeNode.getAttribute("alias"))),
                        typeNode.getAttribute("name")
                    )
                } else {
                    typedef(
                        findType(VkTypeResolving(typeNode.getElementsByTagName("type").item(0).textContent)),
                        typeNode.getElementsByTagName("name").item(0).textContent
                    )
                }
            }

            "handle" -> {
                if (typeNode.hasAttribute("name") && typeNode.hasAttribute("alias")) {
                    typedef(
                        findType(VkTypeResolving(typeNode.getAttribute("alias"))),
                        typeNode.getAttribute("name")
                    )
                } else {
                    typedef(
                        address,
                        typeNode.getElementsByTagName("name").item(0).textContent
                    )
                }
            }

            "enum" -> {
                val name = typeNode.getAttribute("name")
                if (typeNode.hasAttribute("alias")) {
                    typedef(
                        findType(VkTypeResolving(typeNode.getAttribute("alias"))),
                        name
                    )
                } else {
                    typedef(int, name)
                }
            }

            "funcpointer" -> {
                val pfn = VkFuncPointerParser(VkFuncPointerLexer(typeNode.textContent).parse()).parse()
                vkFuncPointerMap[pfn.name] = pfn
                typedef(VkType(pfn.name, address.javaName, address.layout, false), pfn.name)
            }

            "struct", "union" -> {
                val name = typeNode.getAttribute("name")
                if (typeNode.hasAttribute("alias")) {
                    typedef(
                        VkType(name, address.javaName, "${typeNode.getAttribute("alias")}.LAYOUT", true),
                        name
                    )
                } else {
                    val vendor = vendors.find { name.endsWith(it) }
                    val union = category == "union"
                    val packageName: String
                    if (vendor != null) {
                        val lowercase = vendor.lowercase()
                        packageName = "$vulkanPackage.$lowercase.$category"
                    } else {
                        packageName = "$vulkanPackage.$category"
                    }
                    addedStructPackages.add(packageName)
                    val usedEnums = mutableSetOf<String>()
                    val members = mutableListOf<VkStructMember>()
                    val memberNodeList = typeNode.getElementsByTagName("member")
                    for (i1 in 0 until memberNodeList.length) {
                        val memberNode = memberNodeList.item(i1) as Element
                        if (memberNode.hasAttribute("api") && memberNode.getAttribute("api") == "vulkansc") {
                            continue
                        }
                        val childNodeList = memberNode.childNodes
                        val typeComp = mutableListOf<VkTypeComponent>()
                        var memberName: String? = null
                        var fixedSize: String? = null
                        // scan until name
                        var nameIndex = 0
                        for (i2 in 0 until childNodeList.length) {
                            when (val node = childNodeList.item(i2)) {
                                is Text -> typeComp.add(VkTypeLiteral(node.wholeText.trim()))
                                is Element -> {
                                    if (node.tagName == "name") {
                                        memberName = node.textContent
                                        nameIndex = i2
                                        break
                                    } else if (node.tagName == "type") {
                                        typeComp.add(VkTypeResolving(node.textContent))
                                    }
                                }
                            }
                        }
                        nameIndex++
                        if (nameIndex < childNodeList.length) {
                            // scan fixed size array
                            val sb = StringBuilder()
                            for (i2 in nameIndex until childNodeList.length) {
                                when (val node = childNodeList.item(i2)) {
                                    is Text -> sb.append(node.wholeText.trim())
                                    is Element -> {
                                        if (node.tagName != "comment") {
                                            sb.append(node.textContent)
                                        }
                                    }
                                }
                            }
                            if (sb.startsWith("[")) {
                                fixedSize = sb.split('[', ']')[1]
                            }
                        }
                        members.add(VkStructMember(typeComp, memberName!!, fixedSize))
                        if (fixedSize != null && fixedSize.startsWith("VK_")) {
                            usedEnums.add(fixedSize)
                        }
                    }
                    val struct = VkStruct(packageName, name, union = union, members, usedEnums)
                    vkStructMap[name] = struct
                    typedef(
                        VkType(name, address.javaName, "$name.LAYOUT", struct = true),
                        name
                    )
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

    val vkStructSpecMap = mutableMapOf<String, Struct>()
    fun structToStruct(it: VkStruct) {
        val struct = Struct(it.packageName, it.name, cType = it.name, union = it.union) {
            it.members.forEach { member ->
                val type = resolveType(member.type, it.name)
                val fixedSize = member.fixedSize
                if (fixedSize != null) {
                    if (fixedSize.startsWith("VK_")) {
                        imports.add("static ${vkEnumClass[fixedSize]}.*")
                    }
                    fixedSize(type.toCustomTypeSpec(), member.name, fixedSize)
                } else if (type.struct) {
                    vkStructSpecMap[type.originalName]!!.byValue(member.name)
                } else {
                    type.toCustomTypeSpec()(member.name)
                }
            }
        }
        vkStructSpecMap[it.name] = struct
    }
    // generate upcalls
    vkFuncPointerMap.values.forEach {
        Upcall("$vulkanPackage.upcall", it.name.substringAfter("PFN_").replaceFirstChar(Char::uppercaseChar)) {
            targetMethod = "invoke"(
                returnType = resolveType(it.type).toCustomTypeSpec(),
                parameters =
                    if (it.params.size == 1
                        && it.params.first().let { p -> p.type.isEmpty() && p.name == "void" }
                    ) arrayOf()
                    else it.params.map { p ->
                        UpcallMethodParameter(
                            resolveType(p.type).toCustomTypeSpec(),
                            p.name
                        )
                    }.toTypedArray()
            )
        }
    }

    // enums
    root.getElementsByTagName("enums").also { enumsNodeList ->
        for (i in 0 until enumsNodeList.length) {
            val enumsNode = enumsNodeList.item(i) as Element
            when (enumsNode.getAttribute("type")) {
                "constants" -> {
                    enumsNode.getElementsByTagName("enum").also { enumNodeList ->
                        for (i1 in 0 until enumNodeList.length) {
                            val node = enumNodeList.item(i1) as Element
                            val name = node.getAttribute("name")
                            enumConstants[name] = VkEnumConstant(
                                resolveType(listOf(VkTypeResolving(node.getAttribute("type")))).javaName,
                                name,
                                node.getAttribute("value")
                                    .replace("U)", ")")
                                    .replace("ULL)", "L)")
                            )
                        }
                    }
                }

                "enum", "bitmask" -> {
                    enumsNode.getElementsByTagName("enum").also { enumNodeList ->
                        val list = mutableListOf<VkEnum>()
                        for (i1 in 0 until enumNodeList.length) {
                            val node = enumNodeList.item(i1) as Element
                            val name = node.getAttribute("name")
                            list.add(
                                VkEnum(
                                    name,
                                    node.findAttribute("value"),
                                    node.findAttribute("bitpos"),
                                    node.findAttribute("alias")
                                )
                            )
                        }
                        val enumsNodeName = enumsNode.getAttribute("name")
                        vkEnums[enumsNodeName] = VkEnumType(
                            enumsNodeName,
                            enumsNode.getAttribute("type"),
                            enumsNode.findAttribute("bitwidth"),
                            list
                        )
                    }
                }
            }
        }
    }

    // commands
    val commandAliasMap = mutableMapOf<String, MutableList<String>>()
    val commandMap = mutableMapOf<String, VkCommand>()
    val commandNodeList = (root.getElementsByTagName("commands").item(0) as Element).getElementsByTagName("command")
    for (i in 0 until commandNodeList.length) {
        val commandNode = commandNodeList.item(i) as Element
        if (commandNode.hasAttribute("alias")) {
            val alias = commandNode.getAttribute("alias")
            val name = commandNode.getAttribute("name")
            commandAliasMap.computeIfAbsent(alias) { mutableListOf() }.add(name)
            commandAliasMap.computeIfAbsent(name) { mutableListOf() }.add(alias)
        } else {
            val proto = commandNode.getElementsByTagName("proto").item(0)
            var name: String? = null
            val protoTypeList = mutableListOf<VkTypeComponent>()
            for (i1 in 0 until proto.childNodes.length) {
                when (val node = proto.childNodes.item(i1)) {
                    is Text -> protoTypeList.add(VkTypeLiteral(node.wholeText.trim()))
                    is Element -> {
                        if (node.tagName == "name") {
                            name = node.textContent
                        } else {
                            protoTypeList.add(VkTypeResolving(node.textContent))
                        }
                    }
                }
            }
            val type = resolveType(protoTypeList)

            val params = mutableListOf<VkCommandParam>()
            val childNodeList = commandNode.childNodes
            for (i1 in 0 until childNodeList.length) {
                val paramNode = childNodeList.item(i1)
                if (paramNode !is Element || paramNode.tagName != "param")
                    continue
                if (paramNode.hasAttribute("api") && paramNode.getAttribute("api") == "vulkansc")
                    continue
                var paramName: String? = null
                val paramTypeList = mutableListOf<VkTypeComponent>()
                for (i2 in 0 until paramNode.childNodes.length) {
                    when (val node = paramNode.childNodes.item(i2)) {
                        is Text -> paramTypeList.add(VkTypeLiteral(node.wholeText.trim()))
                        is Element -> {
                            if (node.tagName == "name") {
                                paramName = node.textContent
                            } else {
                                paramTypeList.add(VkTypeResolving(node.textContent))
                            }
                        }
                    }
                }
                val paramType = resolveType(paramTypeList)
                params.add(VkCommandParam(paramType, paramName!!))
            }

            commandMap[name!!] = VkCommand(type, name, params)
        }
    }

    // feature
    val featureNodeList = root.getElementsByTagName("feature")
    for (i in 0 until featureNodeList.length) {
        val featureNode = featureNodeList.item(i) as Element
        if (featureNode.hasAttribute("api") && featureNode.getAttribute("api").split(',').contains("vulkan")) {
            val featureNumber = featureNode.getAttribute("number")
            val featureReqTypes = mutableListOf<String>()
            val featureReqCommands = mutableListOf<String>()
            val featureReqEnums = mutableListOf<VkRequireEnum>()
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
                                featureReqEnums.add(
                                    VkRequireEnum(
                                        extends = childNode.findAttribute("extends"),
                                        name = childNode.getAttribute("name"),
                                        extnumber = childNode.findAttribute("extnumber"),
                                        offset = childNode.findAttribute("offset"),
                                        dir = childNode.findAttribute("dir"),
                                        bitpos = childNode.findAttribute("bitpos"),
                                        value = childNode.findAttribute("value"),
                                        alias = childNode.findAttribute("alias"),
                                        api = childNode.findAttribute("api"),
                                    )
                                )
                            }
                        }
                    }
                }
            }

            val className = "VK${featureNumber.replace(".", "")}"
            VkDowncall(vulkanPackage, className) {
                vkExtends[featureNumber]?.also { extends.add("VK$it") }

                if (featureNumber == "1.0") {
                    defineVkVersion.forEach { (k, v) ->
                        fields.add(
                            VkDowncallField("int", k, v)
                        )
                    }
                }

                addReqTypes(featureReqTypes)
                addReqEnums(featureReqEnums)
                addReqCommand(featureReqCommands, commandMap, commandAliasMap)

                constructor = buildString {
                    appendLine("""public $className(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {""")
                    if (vkExtends.containsKey(featureNumber)) {
                        appendLine("    super(instance, func);")
                    }
                    featureReqCommands.forEach { command ->
                        append("""    PFN_$command = func.invoke(instance, "$command"""")
                        commandAliasMap[command]?.onEach { append(""", "$it"""") }
                        appendLine(");")
                    }
                    append("}")
                }

                if (featureNumber == "1.0") {
                    customCode = """
                        public static final MemorySegment VK_NULL_HANDLE = MemorySegment.NULL;

                        public static int VK_MAKE_API_VERSION(int variant, int major, int minor, int patch) {
                            return (variant << 29) | (major << 22) | (minor << 12) | patch;
                        }
                        public static int VK_API_VERSION_VARIANT(int version) { return version >> 29; }
                        public static int VK_API_VERSION_MAJOR(int version) { return (version >> 22) & 0x7F; }
                        public static int VK_API_VERSION_MINOR(int version) { return (version >> 12) & 0x3FF; }
                        public static int VK_API_VERSION_PATCH(int version) { return version & 0xFFF; }

                        public static @CType("VkResult") int vkEnumerateInstanceExtensionProperties(VKLoadFunc func, @CType("const char *") MemorySegment pLayerName, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkExtensionProperties *") MemorySegment pProperties) {
                            var p = func.invoke(MemorySegment.NULL, "vkEnumerateInstanceExtensionProperties");
                            if (Unmarshal.isNullPointer(p)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateInstanceExtensionProperties");
                            try { return (int) MH_vkEnumerateInstanceExtensionProperties.invokeExact(p, pLayerName, pPropertyCount, pProperties); }
                            catch (Throwable e) { throw new RuntimeException("error in vkEnumerateInstanceExtensionProperties", e); }
                        }

                        public static @CType("VkResult") int vkEnumerateInstanceLayerProperties(VKLoadFunc func, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkLayerProperties *") MemorySegment pProperties) {
                            var p = func.invoke(MemorySegment.NULL, "vkEnumerateInstanceLayerProperties");
                            if (Unmarshal.isNullPointer(p)) throw new SymbolNotFoundError("Symbol not found: vkEnumerateInstanceLayerProperties");
                            try { return (int) MH_vkEnumerateInstanceLayerProperties.invokeExact(p, pPropertyCount, pProperties); }
                            catch (Throwable e) { throw new RuntimeException("error in vkEnumerateInstanceLayerProperties", e); }
                        }

                        public static @CType("VkResult") int vkCreateInstance(VKLoadFunc func, @CType("const VkInstanceCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkInstance *") MemorySegment pInstance) {
                            var p = func.invoke(MemorySegment.NULL, "vkCreateInstance");
                            if (Unmarshal.isNullPointer(p)) throw new SymbolNotFoundError("Symbol not found: vkCreateInstance");
                            try { return (int) MH_vkCreateInstance.invokeExact(p, pCreateInfo, pAllocator, pInstance); }
                            catch (Throwable e) { throw new RuntimeException("error in vkCreateInstance", e); }
                        }

                        public static @CType("PFN_vkVoidFunction") MemorySegment vkGetInstanceProcAddr(VKLoadFunc func, @CType("VkInstance") MemorySegment instance, @CType("const char *") MemorySegment pName) {
                            var p = func.invoke(MemorySegment.NULL, "vkGetInstanceProcAddr");
                            if (Unmarshal.isNullPointer(p)) throw new SymbolNotFoundError("Symbol not found: vkGetInstanceProcAddr");
                            try { return (MemorySegment) MH_vkGetInstanceProcAddr.invokeExact(p, instance, pName); }
                            catch (Throwable e) { throw new RuntimeException("error in vkGetInstanceProcAddr", e); }
                        }
                    """.trimIndent()
                }
            }
        }
    }

    // extensions
    val extensionNodeList =
        (root.getElementsByTagName("extensions").item(0) as Element).getElementsByTagName("extension")
    val extensionVendors = mutableSetOf<String>()
    val extensionDowncalls = mutableMapOf<String, VkDowncall>()
    for (i in 0 until extensionNodeList.length) {
        val extensionNode = extensionNodeList.item(i) as Element
        if (extensionNode.getAttribute("supported").split(',').contains("vulkan")) {
            val rawName = extensionNode.getAttribute("name")
            val extName = rawName
                .split('_')
                .joinToString("") { it.replaceFirstChar(Char::uppercaseChar) }
            val extType = extensionNode.getAttribute("type")
            val extNumber = extensionNode.getAttribute("number")
            val extVendor = rawName
                .substringAfter("VK_")
                .substringBefore('_')
                .lowercase()
            extensionVendors.add(extVendor)

            val extReqTypes = mutableListOf<String>()
            val extReqCommands = mutableListOf<String>()
            val extReqEnums = mutableListOf<VkRequireEnum>()
            val requireNodeList = extensionNode.getElementsByTagName("require")
            for (i1 in 0 until requireNodeList.length) {
                val requireNode = requireNodeList.item(i1) as Element
                for (i2 in 0 until requireNode.childNodes.length) {
                    val childNode = requireNode.childNodes.item(i2)
                    if (childNode is Element) {
                        when (childNode.tagName) {
                            "type" -> extReqTypes.add(childNode.getAttribute("name"))
                            "command" -> extReqCommands.add(childNode.getAttribute("name"))
                            "enum" -> extReqEnums.add(
                                VkRequireEnum(
                                    extends = childNode.findAttribute("extends"),
                                    name = childNode.getAttribute("name"),
                                    extnumber = extNumber,
                                    offset = childNode.findAttribute("offset"),
                                    dir = childNode.findAttribute("dir"),
                                    bitpos = childNode.findAttribute("bitpos"),
                                    value = childNode.findAttribute("value"),
                                    alias = childNode.findAttribute("alias"),
                                    api = childNode.findAttribute("api"),
                                )
                            )
                        }
                    }
                }
            }

            val downcall = VkDowncall("$vulkanPackage.$extVendor", extName, write = false) {
                addReqTypes(extReqTypes)
                addReqEnums(extReqEnums)
                addReqCommand(extReqCommands, commandMap, commandAliasMap)

                if (extReqCommands.isEmpty()){
                    modifier = "final"
                    constructor = "private $extName() { }"
                }else {
                    constructor = buildString {
                        append("public $extName(")
                        when (extType) {
                            "device" -> append("""@CType("VkDevice") MemorySegment device""")
                            "instance" -> append("""@CType("VkInstance") MemorySegment instance""")
                        }
                        appendLine(", VKLoadFunc func) {")
                        extReqCommands.forEach { command ->
                            append("""    PFN_$command = func.invoke($extType, "$command"""")
                            commandAliasMap[command]?.onEach { append(""", "$it"""") }
                            appendLine(");")
                        }
                        append("}")
                    }
                }
            }
            extensionDowncalls[rawName] = downcall
        }
    }
    for (i in 0 until extensionNodeList.length) {
        val extensionNode = extensionNodeList.item(i) as Element
        if (extensionNode.getAttribute("supported").split(',').contains("vulkan")) {
            val rawName = extensionNode.getAttribute("name")
            val requireNodeList = extensionNode.getElementsByTagName("require")
            for (i1 in 0 until requireNodeList.length) {
                val requireNode = requireNodeList.item(i1) as Element
                for (i2 in 0 until requireNode.childNodes.length) {
                    val childNode = requireNode.childNodes.item(i2)
                    if (childNode is Element) {
                        when (childNode.tagName) {
                            "enum" -> {
                                if (childNode.hasAttribute("api") && childNode.getAttribute("api") == "vulkansc") continue
                                if (childNode.hasAttribute("alias")) {
                                    val alias = childNode.getAttribute("alias")
                                    (vkEnumClass[alias] ?: error("${childNode.getAttribute("name")}: $alias")).also {
                                        extensionDowncalls[rawName]!!.imports.add("static $it.*")
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    extensionDowncalls.values.forEach(VkDowncall::write)

    // generate structs
    // scan dependencies
    vkStructMap.values.forEach {
        it.members.forEach { member ->
            val type = resolveType(member.type, it.name)
            if (type.struct) {
                structToStruct(vkStructMap[type.originalName]!!)
            }
        }
    }
    vkStructMap.values.forEach {
        if (!vkStructSpecMap.containsKey(it.name)) {
            structToStruct(it)
        }
    }

    // module-info.java
    writeString(Path("module-info.java"), buildString {
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
        appendLine("}")
        appendLine()
    })

    if (recordingErrorType.isNotEmpty()) {
        System.err.println("Recorded error types:")
        recordingErrorType.forEach {
            System.err.println(it)
        }
    }
}

fun Element.findAttribute(name: String): String? = if (hasAttribute(name)) getAttribute(name) else null
