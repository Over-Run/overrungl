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

import overrungl.gen.commentedFileHeader
import overrungl.gen.writeString
import kotlin.io.path.Path
import kotlin.io.path.createDirectories

// vk.xml: 2025-10-31
// video.xml: 2025-10-31

const val vulkanPackage = "overrungl.vulkan"

val generatedPackages = mutableSetOf<String>()
val gen = JavaGenerator()

val cTypeMap = mapOf(
    "uint32_t" to "int",
    "uint64_t" to "long"
)

fun mapTypeName(name: String): String {
    return cTypeMap[name] ?: name
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
    genCapabilities()
    genModuleInfo()
}

@Suppress("UNCHECKED_CAST")
fun isEnumConstDefinedInOtherFeature(featureName:String, enumConstName: String): Boolean {
    return gen.featureMap.any { (otherName, otherMap) ->
        if (otherName == featureName) return@any false
        return@any otherMap.enumconstant.any { (_, map) ->
            map as Map<String?, List<String>>
            return@any map.any { (k, v) -> enumConstName in v }
        }
    }
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
    output.append("/// `$name` - ")
    output.appendLine(
        if (fi.elem.hasAttribute("type")) {
            "${if (fi.elem.getAttribute("type") == "instance") "instance" else "device"} extension"
        } else {
            "core API"
        }
    )
    output.appendLine("public final class $className {")

    // define

    // enum
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
                        if (!isEnumConstDefinedInOtherFeature(name, flag.name)) {
                            output.appendLine("    public static final $javaType ${flag.name} = ${flag.valueStr};")
                        }
                    }
                    // enumconstant[key] may contain ',', but requiredKey does not
                    featureMap.enumconstant.forEach { (_, map1) ->
                        // TODO: output for tags like <enum extends="VkStructureType" value="49" name="VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES"/>
                    }
                } else {
                    val enumDealiasTypeName = gen.dealias(typeName, gen.enumAliasMap)
                    val enum = vk.enums[enumDealiasTypeName]!!
                    val bitWidth = enum.bitWidth
                    // TODO: value class
                    val javaType = if (bitWidth > 32) "long" else "int"
                    enum.fields.forEach { enumField ->
                        if (!isEnumConstDefinedInOtherFeature(name, enumField.name)) {
                            output.appendLine("    public static final $javaType ${enumField.name} = ${enumField.valueStr};")
                        }
                    }
                }
            }
        }
    }

    output.appendLine("}")
    writeString(
        Path("src/main/generated", directoryName).createDirectories()
            .resolve("$className.java"), output.toString()
    )
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
