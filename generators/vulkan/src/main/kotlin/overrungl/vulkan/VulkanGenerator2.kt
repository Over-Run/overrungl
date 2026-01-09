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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package overrungl.vulkan

import org.w3c.dom.Element
import overrungl.gen.*
import kotlin.io.path.Path
import kotlin.io.path.createDirectories
import kotlin.io.path.createParentDirectories

// vk.xml: 2025-11-21
// video.xml: 2025-11-21

const val vulkanPackage = "overrungl.vulkan"

val generatedPackages = mutableSetOf<String>()
val gen = JavaGenerator()

private var genVendors: List<String>? = null

// enum field name -> fully qualified class name
internal val generatedEnumToClass = mutableMapOf<String, String>()
private val primitiveTypes = listOf(
    "boolean",
    "char",
    "byte",
    "short",
    "int",
    "long",
    "float",
    "double",
    "void",
)

private val whitespaceRegex = Regex("\\s+")

val predefinedTypeMap = mapOf(
    // C
    "char" to "byte",
    "int8_t" to "byte",
    "uint8_t" to "byte",
    "int16_t" to "short",
    "uint16_t" to "short",
    "int32_t" to "int",
    "uint32_t" to "int",
    "int64_t" to "long",
    "uint64_t" to "long",
    "size_t" to "long",
    "void*" to "MemorySegment",
    // X11/Xlib.h
    "Display" to "int",
    "Window" to "int",
    "VisualID" to "int",
    // X11/extensions/Xrandr.h
    "RROutput" to "int",
    // wayland-client.h
    // windows.h
    "DWORD" to "int",
    "HANDLE" to "int",
    "HINSTANCE" to "int",
    "HMONITOR" to "int",
    "HWND" to "int",
    "LPCWSTR" to "int",
    "SECURITY_ATTRIBUTES" to "int",
    // xcb/xcb.h
    "xcb_connection_t" to "int",
    "xcb_window_t" to "int",
    "xcb_visualid_t" to "int",
    // zircon/types.h
    "zx_handle_t" to "int",
    // ggp_c/vulkan_types.h
    "GgpStreamDescriptor" to "int",
    "GgpFrameToken" to "int",
    // screen/screen.h
    // nvscisync.h
    "NvSciSyncAttrList" to "int",
    "NvSciSyncObj" to "int",
    "NvSciSyncFence" to "int",
    // nvscibuf.h
    "NvSciBufAttrList" to "int",
    "NvSciBufObj" to "int",
    // other
    "MTLDevice_id" to "MemorySegment",
    "MTLCommandQueue_id" to "MemorySegment",
    "MTLBuffer_id" to "MemorySegment",
    "MTLTexture_id" to "MemorySegment",
    "MTLSharedEvent_id" to "MemorySegment",
    "IOSurfaceRef" to "MemorySegment",
    // Vulkan
    "VkSampleMask" to "int",
    "VkBool32" to "int",
    "VkFlags" to "int",
    "VkFlags64" to "long",
    "VkDeviceSize" to "long",
    "VkDeviceAddress" to "long",
    "PFN_vkVoidFunction" to "MemorySegment",
)

val ignoredDefineList = listOf(
    "VK_DEFINE_HANDLE",
    "VK_USE_64_BIT_PTR_DEFINES",
    "VK_DEFINE_NON_DISPATCHABLE_HANDLE",
)

fun ofByValueStruct(member: Member): Struct? {
    if (member.pointer || member.fixedSizeArray.isNotEmpty()) {
        return null
    }

    val dealiasName = gen.dealias(member.type, gen.structAliasMap)
    if (dealiasName in gen.vk.structs) {
        return gen.vk.structs[dealiasName]!!
    }

    if (gen.vk.videoStd != null) {
        val videoStd = gen.vk.videoStd!!
        if (member.type in videoStd.structs) {
            return videoStd.structs[dealiasName]!!
        }
    }

    return null
}

fun mapTypeName(name: String, useRawType: Boolean = false): String {
    val mapToBaseType = predefinedTypeMap[name]
    if (mapToBaseType != null) {
        return mapToBaseType
    }
    // TODO: value class
    var dealiasName: String = gen.dealias(name, gen.handleAliasMap)
    if (dealiasName in gen.vk.handles) {
        return if (gen.vk.handles[dealiasName]!!.dispatchable) {
            if (useRawType) "MemorySegment" else name
        } else "long"
    }
    dealiasName = gen.dealias(name, gen.flagsAliasMap)
    if (dealiasName in gen.vk.flags) {
        return if (gen.vk.flags[dealiasName]!!.bitWidth > 32) "long" else "int"
    }
    dealiasName = gen.dealias(name, gen.bitmaskAliasMap)
    if (dealiasName in gen.vk.bitmasks) {
        return if (gen.vk.bitmasks[dealiasName]!!.bitWidth > 32) "long" else "int"
    }
    dealiasName = gen.dealias(name, gen.enumAliasMap)
    if (dealiasName in gen.vk.enums) {
        return if (gen.vk.enums[dealiasName]!!.bitWidth > 32) "long" else "int"
    }
    dealiasName = gen.dealias(name, gen.structAliasMap)
    if (dealiasName in gen.vk.structs) {
        val struct = gen.vk.structs[dealiasName]!!
        val name1 = struct.name
        val vendor = detectVendor(genVendors!!, name1)
        return if (useRawType) "MemorySegment"
        else "$vulkanPackage${if (vendor != null) ".$vendor" else ""}.${if (struct.union) "union" else "struct"}.$name1"
    }

    if (gen.vk.videoStd != null) {
        val videoStd = gen.vk.videoStd!!
        if (name in videoStd.enums) {
            return if (videoStd.enums[name]!!.bitWidth > 32) "long" else "int"
        }
        if (name in videoStd.structs) {
            val struct = videoStd.structs[dealiasName]!!
            return if (useRawType) "MemorySegment" else "$vulkanPackage.video.struct.${struct.name}"
        }
    }

    return name
}

fun mapParamTypeName(param: Param): String =
    if (param.pointer || param.fixedSizeArray.isNotEmpty()) "@NonNull MemorySegment"
    else {
        val typeName = mapTypeName(param.type)
        if (typeName !in primitiveTypes) "@NonNull $typeName"
        else typeName
    }

fun mapJavaTypeToValueLayout(name: String, rawType: String): String {
    if (rawType == "size_t") return "CanonicalTypes.SIZE_T"
    return when (name) {
        "boolean" -> "ValueLayout.JAVA_BOOLEAN"
        "char" -> "ValueLayout.JAVA_CHAR"
        "byte" -> "ValueLayout.JAVA_BYTE"
        "short" -> "ValueLayout.JAVA_SHORT"
        "int" -> "ValueLayout.JAVA_INT"
        "long" -> "ValueLayout.JAVA_LONG"
        "float" -> "ValueLayout.JAVA_FLOAT"
        "double" -> "ValueLayout.JAVA_DOUBLE"
        "MemorySegment" -> "ValueLayout.ADDRESS"
        else -> {
            val dealias = gen.dealias(rawType, gen.handleAliasMap)
            if (dealias in gen.vk.handles && gen.vk.handles[dealias]!!.dispatchable) {
                return "ValueLayout.ADDRESS"
            }
            if ("overrungl" in name) {
                return "$name.LAYOUT"
            }
            throw IllegalArgumentException(name)
        }
    }
}

fun mapJavaTypeToSignature(name: String, rawType: String, sizeTLong: Boolean): String {
    if (rawType == "size_t") return if (sizeTLong) "J" else "I"
    return when (name) {
        "boolean" -> "Z"
        "char" -> "C"
        "byte" -> "B"
        "short" -> "S"
        "int" -> "I"
        "long" -> "J"
        "float" -> "F"
        "double" -> "D"
        "MemorySegment" -> "P"
        "void" -> "V"
        else -> throw IllegalArgumentException(name)
    }
}

fun detectVendor(vendors: List<String>, name: String): String? {
    if (name.startsWith("StdVideo") || name.startsWith("VulkanVideo")) {
        return "video"
    }
    return vendors.find { s -> name.endsWith(s) }?.lowercase()
}

private data class SimpleParamType(
    val pointer: Boolean,
    val fixedSizeArray: List<String>,
    val type: String
)

private fun functionDescriptor(returnType: String, params: List<SimpleParamType>): String {
    val mappedReturnType = mapTypeName(returnType)
    return buildString {
        append("FunctionDescriptor.of")
        if (mappedReturnType == "void") {
            append("Void(")
        } else {
            append("(")
            val rawType = if ("*" in returnType) "MemorySegment" else returnType
            append(mapJavaTypeToValueLayout(mappedReturnType, rawType))
            if (params.isNotEmpty()) {
                append(", ")
            }
        }
        params.joinTo(this, separator = ", ") {
            val rawType = if (it.pointer || it.fixedSizeArray.isNotEmpty()) "MemorySegment" else it.type
            mapJavaTypeToValueLayout(mapTypeName(rawType), rawType)
        }
        append(")")
    }
}

fun functionDescriptor(cmd: Command): String {
    return functionDescriptor(
        cmd.returnType,
        cmd.params.map { SimpleParamType(it.pointer, it.fixedSizeArray, it.type) })
}

@Suppress("UNCHECKED_CAST")
fun isEnumConstExtended(enumConstName: String): Boolean {
    return gen.featureMap.any { (otherName, otherMap) ->
        return@any otherMap.enumconstant.any { (_, map) ->
            map as Map<String?, List<String>>
            return@any map.any { (k, v) -> enumConstName in v }
        }
    }
}

fun main() {
    val reg = Registry(
        gen, BaseGeneratorOptions(
            customDirectory = "src/main/generated",
            customApiName = "vulkan",
            videoXmlPath = "video.xml"
        )
    )
    reg.loadFile("vk.xml")
    reg.apiGen()
    genVendors = gen.vk.vendorTags.sortedWith { s1, s2 -> s2.length.compareTo(s1.length) }

    gen.featureMap.forEach { (name, featureMap) ->
        genFeature(name, featureMap)
    }
    genVideoStdHeaders()
    genUpcalls()
    genStructs()
    genCapabilities()
    genModuleInfo()

    writeNativeImageRegistration(vulkanPackage)

    formatTraits(reg.reg!!.getElementsByTagName("formats").item(0) as Element)
    vkUtil()
}

@Suppress("UNCHECKED_CAST")
fun genFeature(name: String, featureMap: FeatureMap) {
    val output = StringBuilder()
    val vk = gen.vk
    val registry = gen.registry!!
    val fi = registry.apiMap[name] ?: registry.extMap[name]!!
    val category = fi.category
    val isVersion = category == "VERSION"

    val packageName = if (isVersion) vulkanPackage
    else "$vulkanPackage.${category.lowercase()}"
    generatedPackages.add(packageName)
    val directoryName = if (isVersion) "overrungl/vulkan"
    else "overrungl/vulkan/${category.lowercase()}"
    val className = if (isVersion) name.replace("_VERSION_", "").replace("_", "")
    else name.split('_').joinToString("") { it.replaceFirstChar(Char::uppercaseChar) }

    output.appendLine(
        """
            $commentedFileHeader
            package $packageName;
            import java.lang.foreign.*;
            import java.lang.invoke.*;
            import org.jspecify.annotations.*;
            import overrungl.util.*;
        """.trimIndent()
    )
    if (!isVersion) {
        output.appendLine("import $vulkanPackage.*;")
    }
    if (featureMap.command.isNotEmpty()) {
        output.appendLine("import static overrungl.internal.RuntimeHelper.*;")
    }
    output.append("/// `$name` - ")
    output.appendLine(
        if (fi.elem.hasAttribute("type")) {
            "${if (fi.elem.getAttribute("type") == "instance") "instance" else "device"} extension"
        } else {
            "core API"
        }
    )
    output.appendLine("public final class $className {")

    //region enum
    featureMap.enumconstant.forEach { (requiredKey, map) ->
        map as Map<String?, List<String>>
        if (null in map) {
            map[null]!!.forEach { enumName ->
                var dealiasName = enumName
                var elem = registry.enumMap[dealiasName]!!.elem
                while (elem.hasAttribute("alias")) {
                    val attr = elem.getAttribute("alias")
                    dealiasName = attr
                    elem = registry.enumMap[attr]!!.elem
                }
                if (dealiasName in vk.constants) {
                    val constant = vk.constants[dealiasName]!!
                    output.appendLine(
                        "    public static final ${mapTypeName(constant.type)} $enumName = ${
                            constant.valueStr
                                .replace("ULL", "L")
                                .replace("U", "")
                        };"
                    )
                    generatedEnumToClass[enumName] = "$packageName.$className"
                } else {
                    val valueStr: String
                    val type: String
                    if (elem.hasAttribute("value")) {
                        valueStr = elem.getAttribute("value")
                        type =
                            if (valueStr.contains("\"")) "String"
                            else "int"
                    } else if (elem.hasAttribute("bitpos")) {
                        val bitpos = elem.getAttribute("bitpos").toInt()
                        valueStr =
                            if (bitpos >= 32) "1L << $bitpos"
                            else "1 << $bitpos"
                        type = if (bitpos >= 32) "long" else "int"
                    } else {
                        throw AssertionError()
                    }
                    output.appendLine("    public static final $type $enumName = $valueStr;")
                    generatedEnumToClass[enumName] = "$packageName.$className"
                }
            }
        }
    }

    featureMap.enum.forEach { (requiredKey, map) ->
        map as Map<String?, List<String>>
        map.forEach { (typeExtends, list) ->
            list.forEach { typeName ->
                val flagsDealiasTypeName = gen.dealias(typeName, gen.flagsAliasMap)
                if (flagsDealiasTypeName in vk.flags) {
                    // ignore.
                    return@forEach
                }
                if (typeName in vk.bitmasks) {
                    val bitmask = vk.bitmasks[typeName]!!
                    val bitWidth = bitmask.bitWidth
                    // TODO: value class
                    val javaType = if (bitWidth > 32) "long" else "int"
                    bitmask.flags.forEach { flag ->
                        if (!isEnumConstExtended(flag.name)) {
                            output.appendLine("    public static final $javaType ${flag.name} = ${flag.valueStr};")
                            generatedEnumToClass[flag.name] = "$packageName.$className"
                            flag.aliases.forEach {
                                output.appendLine("    public static final $javaType $it = ${flag.valueStr};")
                                generatedEnumToClass[it] = "$packageName.$className"
                            }
                        }
                    }
                } else if (typeName in vk.enums) {
                    val enum = vk.enums[typeName]!!
                    val bitWidth = enum.bitWidth
                    // TODO: value class
                    val javaType = if (bitWidth > 32) "long" else "int"
                    enum.fields.forEach { enumField ->
                        if (!isEnumConstExtended(enumField.name)) {
                            output.appendLine("    public static final $javaType ${enumField.name} = ${enumField.valueStr};")
                            generatedEnumToClass[enumField.name] = "$packageName.$className"
                            enumField.aliases.forEach {
                                output.appendLine("    public static final $javaType $it = ${enumField.valueStr};")
                                generatedEnumToClass[it] = "$packageName.$className"
                            }
                        }
                    }
                }
            }
        }
    }

    // special case for VK_EXT_tooling_info
    val generatedEnums = mutableSetOf<String>()
    featureMap.enumconstant.forEach { (requiredKey, map) ->
        map as Map<String?, List<String>>
        map.forEach { (enumExtends, list) ->
            if (enumExtends == null) return@forEach
            list.forEach { enumConstName ->
                val type: String
                val valueStr: String
                val flag = vk.bitmasks.firstNotNullOfOrNull { e ->
                    e.value.flags.firstNotNullOfOrNull { if (it.name == enumConstName || enumConstName in it.aliases) it to e.value else null }
                }
                if (flag != null) {
                    type = if (flag.second.bitWidth > 32) "long" else "int"
                    valueStr = flag.first.valueStr
                } else {
                    val enum = vk.enums.firstNotNullOfOrNull { e ->
                        e.value.fields.firstNotNullOfOrNull { if (it.name == enumConstName || enumConstName in it.aliases) it to e.value else null }
                    }!!
                    type = if (enum.second.bitWidth > 32) "long" else "int"
                    valueStr = enum.first.valueStr
                }
                if (enumConstName !in generatedEnums)
                    output.appendLine("    public static final $type $enumConstName = $valueStr;")
                generatedEnumToClass[enumConstName] = "$packageName.$className"
                generatedEnums.add(enumConstName)
            }
        }
    }
    //endregion

    //region define
    featureMap.define.forEach { (requiredKey, map) ->
        map as Map<String?, List<String>>
        map.forEach { (_, list) ->
            list.forEach {
                if (it in ignoredDefineList) return@forEach
                when (it) {
                    "VK_NULL_HANDLE" -> output.appendLine("    public static final long $it = 0L;")
                    "VK_API_VERSION" -> output.appendLine("    public static final int $it = VK_MAKE_API_VERSION(0, 1, 0, 0);")
                    "VK_HEADER_VERSION" -> output.appendLine("    public static final int $it = ${vk.headerVersion};")
                    "VK_HEADER_VERSION_COMPLETE" -> output.appendLine("    public static final int $it = VK_MAKE_API_VERSION(0, 1, 4, VK_HEADER_VERSION);")
                    "VK_MAKE_VERSION" -> output.appendLine("    public static int $it(int major, int minor, int patch) { return (major << 22) | (minor << 12) | patch; }")
                    "VK_VERSION_MAJOR" -> output.appendLine("    public static int $it(int version) { return version >>> 22; }")
                    "VK_VERSION_MINOR" -> output.appendLine("    public static int $it(int version) { return (version >>> 12) & 0x3FF; }")
                    "VK_VERSION_PATCH" -> output.appendLine("    public static int $it(int version) { return version & 0xFFF; }")
                    "VK_MAKE_API_VERSION" -> output.appendLine("    public static int $it(int variant, int major, int minor, int patch) { return (variant << 29) | (major << 22) | (minor << 12) | patch; }")
                    "VK_API_VERSION_VARIANT" -> output.appendLine("    public static int $it(int version) { return version >>> 29; }")
                    "VK_API_VERSION_MAJOR" -> output.appendLine("    public static int $it(int version) { return (version >>> 22) & 0x7F; }")
                    "VK_API_VERSION_MINOR" -> output.appendLine("    public static int $it(int version) { return (version >>> 12) & 0x3FF; }")
                    "VK_API_VERSION_PATCH" -> output.appendLine("    public static int $it(int version) { return version & 0xFFF; }")
                    "VK_API_VERSION_1_0" -> output.appendLine("    public static final int $it = VK_MAKE_API_VERSION(0, 1, 0, 0);")
                    "VK_API_VERSION_1_1" -> output.appendLine("    public static final int $it = VK10.VK_MAKE_API_VERSION(0, 1, 1, 0);")
                    "VK_API_VERSION_1_2" -> output.appendLine("    public static final int $it = VK10.VK_MAKE_API_VERSION(0, 1, 2, 0);")
                    "VK_API_VERSION_1_3" -> output.appendLine("    public static final int $it = VK10.VK_MAKE_API_VERSION(0, 1, 3, 0);")
                    "VK_API_VERSION_1_4" -> output.appendLine("    public static final int $it = VK10.VK_MAKE_API_VERSION(0, 1, 4, 0);")
                    else -> throw RuntimeException("Unrecognized define $it")
                }
            }
        }
    }
    //endregion

    output.appendLine("    private $className() {}")

    //region command
    if (featureMap.command.isNotEmpty()) {
        output.appendLine("    public static final class Handles {")
        featureMap.command.forEach { (requiredKey, list) ->
            list as List<String>
            list.forEach { cmdName ->
                val cmd = vk.commands[cmdName]!!
                val functionDescriptor = functionDescriptor(cmd)
                nativeImageDowncallDescriptors.add(functionDescriptor)
                output.appendLine(
                    "        public static final MethodHandle MH_$cmdName = downcallHandle($functionDescriptor);"
                )
            }
        }
        output.appendLine("        private Handles() {}")
        output.appendLine("    }")
        output.appendLine()

        featureMap.command.forEach { (requiredKey, list) ->
            list as List<String>
            list.forEach { cmdName ->
                val cmd = vk.commands[cmdName]!!
                output.appendLine("    /// Invokes `$cmdName`.")
                output.appendLine("    /// ```")
                output.appendLine("    /// ${cmd.cPrototype}")
                output.appendLine("    /// ```")
                val mappedReturnType = mapTypeName(cmd.returnType)
                output.append("    public static $mappedReturnType $cmdName(")
                cmd.params.joinTo(output, separator = ", ") {
                    "${mapParamTypeName(it)} ${it.name}"
                }
                output.appendLine(") {")

                val capabilities =
                    if (cmd.params.isNotEmpty() && gen.dealias(
                            cmd.params.first().type,
                            gen.handleAliasMap
                        ) in vk.handles
                    ) "${cmd.params.first().name}.capabilities()"
                    else "VK.globalCommands()"

                // check symbol
                output.append("        if (MemoryUtil.isNullPointer($capabilities.PFN_$cmdName)) ")
                output.appendLine("throw new VKSymbolNotFoundError(\"Symbol not found: $cmdName\");")
                // trace downcall
                output.append("        try { if (TRACE_DOWNCALLS) { traceDowncall(\"$cmdName\"")
                cmd.params.forEach { output.append(", ").append(it.name) }
                output.appendLine("); }")
                // invoke
                output.append("        ")
                if (mappedReturnType != "void") {
                    output.append("return ($mappedReturnType) ")
                }
                val hasSizeT =
                    cmd.params.any { if (it.pointer || it.fixedSizeArray.isNotEmpty()) false else it.type == "size_t" }
                output.append("Handles.MH_$cmdName.invoke")
                if (hasSizeT) {
                    output.append("(")
                } else {
                    output.append("Exact(")
                }
                output.append(capabilities).append(".PFN_").append(cmdName)
                cmd.params.forEach {
                    output.append(", ")
                    val isSizeT = !it.pointer && it.fixedSizeArray.isEmpty() && it.type == "size_t"
                    if (isSizeT) output.append("MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, ")
                    output.append(it.name)
                    // call .segment() for dispatchable handles
                    if (!it.pointer && it.fixedSizeArray.isEmpty()) {
                        val dealias = gen.dealias(it.type, gen.handleAliasMap)
                        if (dealias in vk.handles && vk.handles[dealias]!!.dispatchable) {
                            output.append(".segment()")
                        }
                    }
                    if (isSizeT) output.append(")")
                }
                output.appendLine("); }")
                // catch
                output.appendLine("        catch (Throwable e) { throw new RuntimeException(\"error in $cmdName\", e); }")

                output.appendLine("    }")
                output.appendLine()
            }
        }
    }
    //endregion

    output.appendLine("}")
    writeString(
        Path("src/main/generated", directoryName).createDirectories()
            .resolve("$className.java"), output.toString()
    )
}

fun genVideoStdHeaders() {
    // note: currently don't care about STD_VIDEO_AV1_COLOR_PRIMARIES_BT_UNSPECIFIED,
    // which is the only alias (and is deprecated)
    val videoStd = gen.vk.videoStd!!
    videoStd.headers.forEach { (headerName, header) ->
        val className = headerName
            .split('_')
            .joinToString(separator = "") { it.replaceFirstChar(Char::uppercaseChar) }
        writeString(Path("src/main/generated/overrungl/vulkan/video/$className.java"), buildString {
            appendLine(commentedFileHeader)
            appendLine("package $vulkanPackage.video;")
            if (className != "VulkanVideoCodecsCommon") {
                appendLine("import static $vulkanPackage.video.VulkanVideoCodecsCommon.*;")
            }
            appendLine("public final class $className {")

            header.defineInfo.forEach { (name, info) ->
                if (name == "VK_MAKE_VIDEO_STD_VERSION") {
                    appendLine(
                        """
                            |    public static int VK_MAKE_VIDEO_STD_VERSION(int major, int minor, int patch) {
                            |        return (major << 22) | (minor << 12) | patch;
                            |    }
                        """.trimMargin()
                    )
                } else if (name.contains("API_VERSION")) {
                    val valueStr = info.elem.textContent.trim().split(whitespaceRegex, limit = 3)[2]
                    appendLine("    public static final int $name = $valueStr;")
                } else {
                    throw IllegalStateException("$name in $headerName")
                }
            }
            header.enumInfo.forEach { enumInfo ->
                val name = enumInfo.elem.getAttribute("name")
                when (name) {
                    in videoStd.constants -> {
                        val constant = videoStd.constants[name]!!
                        val mapTypeName = mapTypeName(constant.type)
                        val valueStr = if (mapTypeName == "byte") "(byte) ${constant.valueStr}" else constant.valueStr
                        appendLine("    public static final $mapTypeName $name = $valueStr;")
                        generatedEnumToClass[name] = "$vulkanPackage.video.$className"
                    }

                    else -> {
                        val value = enumInfo.elem.getAttribute("value")
                        val javaType = if (value.contains('"')) "String" else "int"
                        appendLine("    public static final $javaType $name = $value;")
                        generatedEnumToClass[name] = "$vulkanPackage.video.$className"
                    }
                }
            }
            videoStd.enums.forEach { (name, enum) ->
                if (enum.videoStdHeader == headerName) {
                    val javaType = if (enum.bitWidth > 32) "long" else "int"
                    enum.fields.forEach { enumField ->
                        appendLine("    public static final $javaType ${enumField.name} = ${enumField.valueStr};")
                        generatedEnumToClass[enumField.name] = "$vulkanPackage.video.$className"
                    }
                }
            }
            appendLine("    private $className() { }")
            appendLine("}")
        })
    }
}

fun genUpcalls() {
    generatedPackages.add("$vulkanPackage.upcall")

    val root = gen.registry!!.reg!!
    root.forEachChildrenChildren("types", "type") { elem ->
        if (elem.getAttribute("category") != "funcpointer") {
            return@forEachChildrenChildren
        }
        val cDecl = elem.textContent
        val split = cDecl.substringAfter("typedef ")
            .split("(")
            .map { it.substringBeforeLast(")").trim() }
        val returnType = mapTypeName(split[0], useRawType = true)
        val name = "Vk${split[1].substringAfter("PFN_vk")}"
        val paramsStr = split[2].split(whitespaceRegex).joinToString(separator = " ")
        val params = if (paramsStr == "void") {
            listOf()
        } else {
            paramsStr.split(',').map {
                val trim = it.trim()
                val lastIndexOf = trim.lastIndexOf(' ')
                trim.take(lastIndexOf) to trim.substring(lastIndexOf + 1)
            }
        }
        val hasSizeT = params.any { (type, _) -> "*" !in type && type == "size_t" }

        writeString(
            Path("src/main/generated/overrungl/vulkan/upcall/$name.java").createParentDirectories(),
            buildString {
                appendLine(
                    """
                        $commentedFileHeader
                        package $vulkanPackage.upcall;
                        import java.lang.foreign.*;
                        import java.lang.invoke.*;
                        import overrungl.internal.*;
                        import overrungl.upcall.*;
                        import overrungl.util.*;

                        /// ```
                    """.trimIndent()
                )
                appendLine(cDecl.prependIndent("/// "))
                appendLine(
                    """
                        /// ```
                        @FunctionalInterface
                        public interface $name extends Upcall {
                    """.trimIndent()
                )

                // function descriptor
                append("    FunctionDescriptor DESCRIPTOR = ")
                val functionDescriptor = functionDescriptor(
                    returnType,
                    params.map { (type, _) -> SimpleParamType("*" in type, listOf(), type) })
                nativeImageUpcallDescriptors.add("$vulkanPackage.upcall.$name.DESCRIPTOR")
                append(functionDescriptor)
                appendLine(";")
                // method handle
                append("    MethodHandle HANDLE = Upcall.findTarget($name.class, ")
                if (hasSizeT) {
                    append("RuntimeHelper.upcallTarget(\"invoke\", DESCRIPTOR)")
                } else {
                    append("\"invoke_\"")
                }
                appendLine(", DESCRIPTOR);")

                // alloc
                appendLine(
                    """
                        |    static MemorySegment alloc(Arena arena, $name func) {
                        |        if (func == null) return MemorySegment.NULL;
                        |        return func.stub(arena);
                        |    }
                    """.trimMargin()
                )

                // invoke
                append("    $returnType invoke(")
                params.joinTo(this, separator = ", ") {
                    "${if ("*" in it.first) "MemorySegment" else mapTypeName(it.first, useRawType = true)} ${it.second}"
                }
                appendLine(");")
                if (hasSizeT) {
                    fun genVariant(sizeTLong: Boolean) {
                        append("    default $returnType invoke")
                        append(if ("*" in returnType) "P" else mapJavaTypeToSignature(returnType, split[0], sizeTLong))
                        append("(")
                        params.joinTo(this, separator = ", ") {
                            "${
                                if ("*" in it.first) "MemorySegment" else {
                                    if (it.first == "size_t") {
                                        if (sizeTLong) "long" else "int"
                                    } else mapTypeName(it.first, useRawType = true)
                                }
                            } ${it.second}"
                        }
                        appendLine(") {")
                        append("        ")
                        if (returnType != "void") {
                            append("return ")
                        }
                        append("invoke(")
                        params.joinTo(this, separator = ", ") { it.second }
                        appendLine(");")
                        appendLine("    }")
                    }
                    genVariant(true)
                    genVariant(false)
                } else {
                    append("    default $returnType invoke_(")
                    params.joinTo(this, separator = ", ") {
                        "${
                            if ("*" in it.first) "MemorySegment" else mapTypeName(
                                it.first,
                                useRawType = true
                            )
                        } ${it.second}"
                    }
                    appendLine(") {")
                    append("        ")
                    if (returnType != "void") {
                        append("return ")
                    }
                    append("invoke(")
                    params.joinTo(this, separator = ", ") { it.second }
                    appendLine(");")
                    appendLine("    }")
                }

                // stub
                appendLine(
                    """
                        |    @Override default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }
                    """.trimMargin()
                )

                appendLine("}")
            })
    }
}

fun genStructs() {
    (gen.vk.structs.values.map { it.name to it }
        + gen.structAliasMap.map { it.key to gen.vk.structs[it.value]!! }
        + gen.vk.videoStd!!.structs.map { it.key to it.value }).forEach { (structName, it) ->
        var hasBitField = false
        forNestedMember(it) { list ->
            if (list.any { member -> member.bitFieldWidth != null }) {
                hasBitField = true
                return@forNestedMember
            }
        }
        if (hasBitField) {
            println("WARNING: Skipping $structName (bitfields are not supported)")
            return@forEach
        }
        val category = if (it.union) "union" else "struct"
        val categoryUppercase = if (it.union) "Union" else "Struct"
        val vendor = detectVendor(genVendors!!, structName)
        val directoryName = "overrungl/vulkan/${if (vendor != null) "$vendor/" else ""}$category"
        val packageName = directoryName.replace('/', '.')
        generatedPackages.add(packageName)
        writeString(
            Path("src/main/generated", directoryName, "$structName.java").createParentDirectories(),
            buildString {
                appendLine(
                    """
                        $commentedFileHeader
                        package $packageName;
                        import java.lang.foreign.*;
                        import java.lang.foreign.MemoryLayout.PathElement;
                        import java.lang.invoke.*;
                        import java.util.function.*;
                        import org.jspecify.annotations.*;
                        import overrungl.struct.*;
                        import overrungl.util.*;

                        /// Represents `$structName`.
                        /// ## Layout
                        /// ```
                        /// $category $structName {
                    """.trimIndent()
                )
                it.members.forEach { member ->
                    append("///     ")
                    append(member.cDeclaration)
                    appendLine(";")
                }
                appendLine("/// }")
                appendLine("/// ```")
                appendLine("public final class $structName extends GroupType {")

                // layout
                append("    public static final ${categoryUppercase}Layout LAYOUT = ")
                if (it.union) {
                    appendLine("MemoryLayout.unionLayout(")
                } else {
                    appendLine("LayoutBuilder.struct(")
                }
                it.members.joinTo(this, separator = ",\n") { member ->
                    buildString {
                        append("        ")
                        member.fixedSizeArray.forEach { fixedSize ->
                            append("MemoryLayout.sequenceLayout(")
                            if (fixedSize in generatedEnumToClass)
                                append(generatedEnumToClass[fixedSize]).append('.')
                            append(fixedSize)
                            append(", ")
                        }
                        val rawType = if (member.pointer) "MemorySegment" else member.type
                        append(mapJavaTypeToValueLayout(mapTypeName(rawType), rawType))
                        repeat(member.fixedSizeArray.size) {
                            append(')')
                        }
                        append(".withName(\"${member.name}\")")
                    }
                }
                appendLine()
                appendLine("    );")

                // offsets
                it.members.forEach { member ->
                    appendLine("    public static final long OFFSET_${member.name} = LAYOUT.byteOffset(PathElement.groupElement(\"${member.name}\"));")
                }
                // layouts
                it.members.forEach { member ->
                    appendLine("    public static final MemoryLayout LAYOUT_${member.name} = LAYOUT.select(PathElement.groupElement(\"${member.name}\"));")
                }
                // var handles
                forNestedMember(it) { list ->
                    append("    public static final VarHandle VH_")
                    list.joinTo(this, separator = "$") { member -> member.name }
                    append(" = LAYOUT.arrayElementVarHandle(")
                    list.forEachIndexed { i, member ->
                        if (i > 0) append(", ")
                        append("PathElement.groupElement(\"${member.name}\")")
                        repeat(member.fixedSizeArray.size) {
                            append(", PathElement.sequenceElement()")
                        }
                    }
                    appendLine(");")
                }
                appendLine()

                // constructor
                appendLine("    public $structName(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }")
                appendLine("    public static $structName of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new $structName(segment, estimateCount(segment, LAYOUT)); }")
                appendLine("    public static $structName ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new $structName(segment.reinterpret(LAYOUT.byteSize()), 1); }")
                appendLine("    public static $structName ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new $structName(segment.reinterpret(LAYOUT.scale(0, count)), count); }")
                appendLine("    public static $structName alloc(SegmentAllocator allocator) { return new $structName(allocator.allocate(LAYOUT), 1); }")
                appendLine("    public static $structName alloc(SegmentAllocator allocator, long count) { return new $structName(allocator.allocate(LAYOUT, count), count); }")
                if (it.sType != null) {
                    appendLine("    public static $structName allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(${generatedEnumToClass[it.sType]}.${it.sType}); }")
                    appendLine(
                        """
                        |    public static $structName allocInit(SegmentAllocator allocator, long count) {
                        |        var s = alloc(allocator, count);
                        |        for (long i = 0; i < count; i++) s.sTypeAt(i, ${generatedEnumToClass[it.sType]}.${it.sType});
                        |        return s;
                        |    }"""
                            .trimMargin()
                    )
                }

                appendLine("    public $structName copyFrom($structName src) { this.segment().copyFrom(src.segment()); return this; }")
                appendLine("    public $structName reinterpret(long count) { return new $structName(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }")

                appendLine("    public $structName asSlice(long index) { return new $structName(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }")
                appendLine("    public $structName asSlice(long index, long count) { return new $structName(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }")
                appendLine("    public $structName at(long index, Consumer<$structName> func) { func.accept(asSlice(index)); return this; }")

                // setter & getter
                fun getter(at: Boolean) {
                    forNestedMember(it) { list ->
                        val last = list.last()
                        val typeName = if (last.pointer) "MemorySegment" else mapTypeName(last.type, useRawType = true)
                        val funName = list.joinToString(separator = "$") { member -> member.name }
                        append("    public $typeName $funName")
                        if (at) append("At")
                        append("(")
                        if (at) append("long index")
                        var coordinate = 0
                        list.forEach { member ->
                            repeat(member.fixedSizeArray.size) { i ->
                                if (at || i > 0) append(", ")
                                append("long index")
                                append(coordinate)
                                coordinate++
                            }
                        }
                        append(") { return ($typeName) VH_$funName.get(this.segment(), 0L, ")
                        append(if (at) "index" else "0L")
                        coordinate = 0
                        list.forEach { member ->
                            repeat(member.fixedSizeArray.size) {
                                append(", index")
                                append(coordinate)
                                coordinate++
                            }
                        }
                        appendLine("); }")
                    }
                }
                getter(true)
                getter(false)

                fun setter(at: Boolean) {
                    forNestedMember(it) { list ->
                        val last = list.last()
                        val typeName = if (last.pointer) "MemorySegment" else mapTypeName(last.type, useRawType = true)
                        val funName = list.joinToString(separator = "$") { member -> member.name }
                        var hasArg = at
                        append("    public $structName $funName")
                        if (at) append("At")
                        append("(")
                        if (at) append("long index")
                        var coordinate = 0
                        list.forEach { member ->
                            repeat(member.fixedSizeArray.size) { i ->
                                if (at || i > 0) append(", ")
                                append("long index")
                                append(coordinate)
                                coordinate++
                                hasArg = true
                            }
                        }
                        if (hasArg) append(", ")
                        append(typeName)
                        append(" value")
                        append(") { VH_$funName.set(this.segment(), 0L, ")
                        append(if (at) "index" else "0L")
                        coordinate = 0
                        list.forEach { member ->
                            repeat(member.fixedSizeArray.size) {
                                append(", index")
                                append(coordinate)
                                coordinate++
                            }
                        }
                        appendLine(", value); return this; }")
                    }
                }
                setter(true)
                setter(false)

                // member slice
                it.members.forEach { member ->
                    appendLine("    public MemorySegment _${member.name}At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_${member.name}, index), LAYOUT_${member.name}); }")
                    appendLine("    public MemorySegment _${member.name}() { return _${member.name}At(0L); }")
                    appendLine("    public $structName _${member.name}At(long index, MemorySegment src) { _${member.name}At(index).copyFrom(src); return this; }")
                    appendLine("    public $structName _${member.name}(MemorySegment src) { return _${member.name}At(0L, src); }")
                }

                appendLine("}")
            }
        )
    }
}

fun forNestedMember(
    struct: Struct,
    stack: ArrayDeque<Member> = ArrayDeque(),
    targetMemberAction: (List<Member>) -> Unit
) {
    struct.members.forEach { member ->
        stack.add(member)
        val nestedStruct = ofByValueStruct(member)
        if (nestedStruct != null) {
            forNestedMember(nestedStruct, stack, targetMemberAction)
        } else {
            targetMemberAction(stack.toList())
        }
        stack.removeLast()
    }
}

fun genCapabilities(device: Boolean) {
    val upperName = if (device) "Device" else "Instance"
    val lowerName = upperName.lowercase()
    val className = "VKCapabilities$upperName"
    writeString(Path("src/main/generated/overrungl/vulkan/$className.java"), buildString {
        appendLine(commentedFileHeader)
        appendLine("package $vulkanPackage;")
        appendLine("import java.lang.foreign.*;")
        appendLine("public final class $className {")
        gen.vk.commands.values.forEach {
            if (it.device == device) {
                appendLine("    public final MemorySegment PFN_${it.name};")
            }
        }
        appendLine("    public $className(MemorySegment $lowerName, VKLoadFunc func) {")
        gen.vk.commands.values.forEach {
            if (it.device == device) {
                append("""        PFN_${it.name} = func.invoke($lowerName, "${it.name}"""")
                if (it.alias != null) {
                    append(""", "${it.alias}"""")
                }
                appendLine(""");""")
            }
        }
        appendLine("    }")
        appendLine("}")
    })
}

fun genCapabilities() {
    genCapabilities(false)
    genCapabilities(true)
}

fun genModuleInfo() {
    writeString(Path("src/main/generated/module-info.java"), buildString {
        appendLine(commentedFileHeader)
        appendLine()
        appendLine(
            """
                /// The Vulkan binding.
                ///
                /// - [Website](https://www.vulkan.org)
                /// - [LunarG](https://vulkan.lunarg.com/)
                /// - [References](https://registry.khronos.org/vulkan/specs/latest/man/html/)
                /// - [Specification](https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html)
                /// - [Vulkan-Docs](https://github.com/KhronosGroup/Vulkan-Docs)
                module overrungl.vulkan {
            """.trimIndent()
        )
        generatedPackages.sorted().forEach {
            appendLine("    exports $it;")
        }
        appendLine()
        appendLine(
            """
                    requires transitive overrungl.core;
                    requires static org.graalvm.nativeimage;
                    requires static org.jspecify;
                    requires org.lwjgl.vulkan;
                }
            """.trimIndent()
        )
    })
}

private fun vkUtil() {
    writeString(Path("src/main/generated/overrungl/vulkan/VKUtil.java"), buildString {
        appendLine(commentedFileHeader)
        appendLine("package $vulkanPackage;")
        val imports = mutableSetOf<String>()
        val typeList = listOf("VkImageLayout", "VkObjectType", "VkResult")
        typeList.forEach {
            gen.vk.enums[it]!!.fields.forEach { f ->
                imports.add(generatedEnumToClass[f.name]!!)
            }
        }
        imports.sorted().forEach { appendLine("import static $it.*;") }
        appendLine()

        appendLine(
            """
                /// This class provides methods to convert Vulkan enum to string.
                public final class VKUtil {
                    private VKUtil() {}
            """.trimIndent()
        )
        appendLine()

        fun getString(typeName: String, function: (String) -> String = { it }) {
            appendLine("    public static String get${typeName}String(int value) { return switch (value) {")
            gen.vk.enums["Vk$typeName"]!!.fields.forEach {
                appendLine("""        case ${it.name} -> "${function(it.name)}";""")
            }
            appendLine("""        default -> "Vk$typeName(" + value + ")";""")
            appendLine("    }; }")
            appendLine()
        }

        getString("ImageLayout") { it.substringAfter("VK_IMAGE_LAYOUT_") }
        getString("ObjectType") {
            if (it == "VK_OBJECT_TYPE_UNKNOWN") return@getString it
            it.split('_')
                .joinToString("") { s ->
                    if (genVendors!!.contains(s)) {
                        s
                    } else s.lowercase().replaceFirstChar(Char::uppercaseChar)
                }
                .replace("VkObjectType", "Vk")
        }
        getString("Result")

        appendLine("}")
    })
}
