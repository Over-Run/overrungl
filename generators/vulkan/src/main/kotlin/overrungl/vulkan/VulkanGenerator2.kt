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

// vk.xml: 2025-10-31
// video.xml: 2025-10-31

const val vulkanPackage = "overrungl.vulkan"

val generatedPackages = mutableSetOf<String>()
val gen = JavaGenerator()

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
    // Vulkan
    "VkBool32" to "int",
    "VkDeviceSize" to "long",
    "VkDeviceAddress" to "long",
    "PFN_vkVoidFunction" to "MemorySegment",
)

val ignoredDefineList = listOf(
    "VK_DEFINE_HANDLE",
    "VK_USE_64_BIT_PTR_DEFINES",
    "VK_DEFINE_NON_DISPATCHABLE_HANDLE",
)

fun mapTypeName(name: String): String {
    val mapToBaseType = predefinedTypeMap[name]
    if (mapToBaseType != null) {
        return mapToBaseType
    }
    // TODO: value class
    var dealiasName: String = gen.dealias(name, gen.handleAliasMap)
    if (dealiasName in gen.vk.handles) {
        return if (gen.vk.handles[dealiasName]!!.dispatchable) name else "long"
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
    return name
}

fun mapParamTypeName(param: Param): String =
    if (param.pointer) "@NonNull MemorySegment" else mapTypeName(param.type)

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
            val dealias = gen.dealias(name, gen.handleAliasMap)
            if (dealias in gen.vk.handles && gen.vk.handles[dealias]!!.dispatchable) {
                return "ValueLayout.ADDRESS"
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

private data class SimpleParamType(
    val pointer: Boolean,
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
            val rawType = if (it.pointer) "MemorySegment" else it.type
            mapJavaTypeToValueLayout(mapTypeName(rawType), rawType)
        }
        append(")")
    }
}

fun functionDescriptor(cmd: Command): String {
    return functionDescriptor(cmd.returnType, cmd.params.map { SimpleParamType(it.pointer, it.type) })
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

    gen.featureMap.forEach { (name, featureMap) ->
        genFeature(name, featureMap)
    }
    genUpcalls()
    genStructs()
    genCapabilities()
    genModuleInfo()

    writeNativeImageRegistration("overrungl.vulkan", libBasename = null)

    formatTraits(reg.reg!!.getElementsByTagName("formats").item(0) as Element)
}

@Suppress("UNCHECKED_CAST")
fun genFeature(name: String, featureMap: FeatureMap) {
    val output = StringBuilder()
    val vk = gen.vk
    val registry = gen.registry!!
    val fi = registry.apiMap[name] ?: registry.extMap[name]!!
    val category = fi.category
    val isVersion = category == "VERSION"

    val packageName = if (isVersion) "overrungl.vulkan"
    else "overrungl.vulkan.${category.lowercase()}"
    generatedPackages.add(packageName)
    val directoryName = if (isVersion) "overrungl/vulkan"
    else "overrungl/vulkan/${category.lowercase()}"
    val className = if (isVersion) name.replace("_VERSION_", "").replace("_", "")
    else name.split('_').joinToString("") { it.replaceFirstChar(Char::uppercaseChar) }

    output.appendLine(commentedFileHeader)
    output.appendLine("package $packageName;")
    output.appendLine("import module java.base;")
    output.appendLine("import org.jspecify.annotations.*;")
    output.appendLine("import overrungl.util.*;")
    if (!isVersion) {
        output.appendLine("import overrungl.vulkan.*;")
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
                if (enumName in vk.constants) {
                    val constant = vk.constants[enumName]!!
                    output.appendLine(
                        "    public static final ${mapTypeName(constant.type)} ${constant.name} = ${
                            constant.valueStr
                                .replace("ULL", "L")
                                .replace("U", "")
                        };"
                    )
                } else {
                    var dealiasName = enumName
                    var elem = registry.enumMap[dealiasName]!!.elem
                    while (elem.hasAttribute("alias")) {
                        val attr = elem.getAttribute("alias")
                        dealiasName = attr
                        elem = registry.enumMap[attr]!!.elem
                    }
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
                    output.appendLine("    public static final $type $dealiasName = $valueStr;")
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
                val bitmaskDealiasTypeName = gen.dealias(typeName, gen.bitmaskAliasMap)
                if (bitmaskDealiasTypeName in vk.bitmasks) {
                    val bitmask = vk.bitmasks[bitmaskDealiasTypeName]!!
                    val bitWidth = bitmask.bitWidth
                    // TODO: value class
                    val javaType = if (bitWidth > 32) "long" else "int"
                    bitmask.flags.forEach { flag ->
                        if (!isEnumConstExtended(flag.name)) {
                            output.appendLine("    public static final $javaType ${flag.name} = ${flag.valueStr};")
                        }
                    }
                } else {
                    val enumDealiasTypeName = gen.dealias(typeName, gen.enumAliasMap)
                    val enum = vk.enums[enumDealiasTypeName]!!
                    val bitWidth = enum.bitWidth
                    // TODO: value class
                    val javaType = if (bitWidth > 32) "long" else "int"
                    enum.fields.forEach { enumField ->
                        if (!isEnumConstExtended(enumField.name)) {
                            output.appendLine("    public static final $javaType ${enumField.name} = ${enumField.valueStr};")
                        }
                    }
                }
            }
        }
    }

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
                output.appendLine("    public static final $type $enumConstName = $valueStr;")
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
                val hasSizeT = cmd.params.any { if (it.pointer) false else it.type == "size_t" }
                output.append("Handles.MH_$cmdName.invoke")
                if (hasSizeT) {
                    output.append("(")
                } else {
                    output.append("Exact(")
                }
                output.append(capabilities).append(".PFN_").append(cmdName)
                cmd.params.forEach {
                    output.append(", ")
                    val isSizeT = !it.pointer && it.type == "size_t"
                    if (isSizeT) output.append("MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, ")
                    output.append(it.name)
                    // call .segment() for dispatchable handles
                    if (!it.pointer) {
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

fun genUpcalls() {
    generatedPackages.add("overrungl.vulkan.upcall")

    val root = gen.registry!!.reg!!
    root.forEachChildrenChildren("types", "type") { elem ->
        if (elem.getAttribute("category") != "funcpointer") {
            return@forEachChildrenChildren
        }
        val cDecl = elem.textContent
        val split = cDecl.substringAfter("typedef ")
            .split("(")
            .map { it.substringBeforeLast(")").trim() }
        val returnType = mapTypeName(split[0])
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
                        package overrungl.vulkan.upcall;
                        import module java.base;
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
                    params.map { (type, _) -> SimpleParamType("*" in type, type) })
                nativeImageUpcallDescriptors.add("overrungl.vulkan.upcall.$name.DESCRIPTOR")
                append(functionDescriptor)
                appendLine(";")
                // method handle
                append("    MethodHandle HANDLE = Upcall.findTarget($name.class, ")
                if (hasSizeT) {
                    append("RuntimeHelper.upcallTarget2(\"invoke\", DESCRIPTOR)")
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
                    "${if ("*" in it.first) "MemorySegment" else mapTypeName(it.first)} ${it.second}"
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
                                    } else mapTypeName(it.first)
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
                        "${if ("*" in it.first) "MemorySegment" else mapTypeName(it.first)} ${it.second}"
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
}

fun genCapabilities(device: Boolean) {
    val upperName = if (device) "Device" else "Instance"
    val lowerName = upperName.lowercase()
    val className = "VKCapabilities$upperName"
    writeString(Path("src/main/generated/overrungl/vulkan/$className.java"), buildString {
        appendLine(commentedFileHeader)
        appendLine("package overrungl.vulkan;")
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
                }
            """.trimIndent()
        )
    })
}
