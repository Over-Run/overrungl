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

// ported from scripts/base_generator.py

private val vulkanConventions = VulkanConventions()

private fun splitIfGet(element: Element, name: String) =
    if (element.hasAttribute(name) && element.getAttribute(name).isNotEmpty()) element.getAttribute(name).split(',')
    else listOf()

private fun textIfFind(element: Element, name: String) =
    element.getElementsByTagName(name).item(0)?.textContent

private fun intIfGet(element: Element, name: String) =
    if (!(element.hasAttribute(name))) null
    else element.getAttribute(name).toInt0()

private fun boolGet(element: Element, name: String) =
    element.hasAttribute(name) && element.getAttribute(name) == "true"

object APISpecific {
    @JvmStatic
    fun createApiVersion(targetApiName: String, name: String, featureRequirement: List<FeatureRequirement>): Version {
        return when (targetApiName) {
            "vulkansc" -> {
                var nameApi = name.replace("VK_", "VK_API_")
                nameApi = nameApi.replace("VKSC_", "VKSC_API_")
                val nameString = """"$name""""
                Version(name, nameString, nameApi, featureRequirement)
            }

            "vulkan" -> {
                val nameApi = name.replace("VK_", "VK_API_")
                val nameString = """"$name""""
                Version(name, nameString, nameApi, featureRequirement)
            }

            else -> throw IllegalArgumentException(targetApiName)
        }
    }

    @JvmStatic
    fun createHeaderVersion(targetApiName: String, vk: VulkanObject): String {
        var majorVersion = 1
        var minorVersion = 0
        when (targetApiName) {
            "vulkan" -> {
                majorVersion = 1
                minorVersion = 4
            }

            "vulkansc" -> {
                majorVersion = 1
                minorVersion = 0
            }
        }
        return "$majorVersion.$minorVersion.${vk.headerVersion}"
    }
}

class BaseGeneratorOptions(
    customFileName: String,
    customDirectory: String,
    customApiName: String,
    videoXmlPath: String?
) : GeneratorOptions(
    conventions = vulkanConventions,
    filename = customFileName,
    directory = customDirectory,
    apiName = customApiName,
    mergeApiNames = null,
    defaultExtensions = customApiName,
    emitExtensions = ".*",
    emitSpirv = ".*",
    emitFormats = ".*"
) {
    init {
        this.videoXmlPath = videoXmlPath
    }
}

open class BaseGenerator : OutputGenerator() {
    val vk = VulkanObject()

    var currentExtension: Extension? = null
    var currentVersion: Version? = null

    var unsupportedExtension = false

    val enumAliasMap = mutableMapOf<String, String>()
    val enumFieldAliasMap = mutableMapOf<String, String>()
    val bitmaskAliasMap = mutableMapOf<String, String>()
    val flagAliasMap = mutableMapOf<String, String>()
    val flagsAliasMap = mutableMapOf<String, String>()
    val structAliasMap = mutableMapOf<String, String>()
    val handleAliasMap = mutableMapOf<String, String>()

    val enumFieldMap = mutableMapOf<String, EnumField>()
    val flagMap = mutableMapOf<String, Flag>()

    var filename: String? = null

    fun dealias(name: String, aliasMap: Map<String, String>): String {
        var name0 = name
        while (name0 in aliasMap) {
            name0 = aliasMap[name0]!!
        }
        return name0
    }

    override fun beginFile(genOpts: GeneratorOptions) {
        super.beginFile(genOpts)
        this.filename = genOpts.filename

        registry!!.tree!!.findAll("platforms/platform")!!.forEachElement { platform ->
            vk.platforms[platform.getAttribute("name")] = platform.getAttribute("protect")
        }

        registry!!.tree!!.getElementsByTagName("tags").forEachElement { tags ->
            tags.getElementsByTagName("tag").forEachElement { tag ->
                vk.vendorTags.add(tag.getAttribute("name"))
            }
        }

        if (genOpts.videoXmlPath != null) {
            val videoStdGenerator = VideoStdGenerator()
            val videoRegistry = Registry(videoStdGenerator, genOpts)
            videoRegistry.loadFile(genOpts.videoXmlPath!!)
            videoRegistry.apiGen()
            vk.videoStd = videoStdGenerator.vk.videoStd
        }
    }

    fun generate() {
        logWarn { "This should not be called from the child class" }
    }

    @Suppress("UNCHECKED_CAST")
    fun applyExtensionDependency() {
        vk.extensions.values.forEach { extension ->
            val cmdMap = featureMap[extension.name]!!.command

            cmdMap.keys.forEach { required ->
                (cmdMap[required] as Map<String, *>).keys.forEach { commandName ->
                    if (commandName !in vk.commands) {
                        return@forEach
                    }

                    val command = vk.commands[commandName]!!
                    command.extensions.addIfAbsent(extension.name)
                    extension.commands.addIfAbsent(command)
                }
            }

            val enumConstantMap = featureMap[extension.name]!!.enumconstant
            enumConstantMap.keys.forEach { required ->
                (enumConstantMap[required] as Map<String, *>).keys.forEach { group ->
                    if (group in vk.handles) {
                        val handle = vk.handles[group]!!
                        handle.extensions.addIfAbsent(extension.name)
                        extension.handles[group]!!.addIfAbsent(handle)
                    }
                    if (group in vk.enums) {
                        if (group !in extension.enumFields) {
                            extension.enumFields[group] = mutableListOf()
                        }
                        val enum = vk.enums[group]!!
                        val enumList = ((enumConstantMap[required] as Map<String, *>)[group] as List<String>).map {
                            if (it !in enumFieldAliasMap) it
                            else dealias(it, enumFieldAliasMap)
                        }

                        enum.fields.filter { it.name in enumList }.forEach { enumField ->
                            enum.fieldExtensions.addIfAbsent(extension.name)
                            enumField.extensions.addIfAbsent(extension.name)
                            extension.enumFields[group]!!.addIfAbsent(enumField)
                        }
                    }
                    if (group in vk.bitmasks) {
                        if (group !in extension.flagBits) {
                            extension.flagBits[group] = mutableListOf()
                        }
                        val bitmask = vk.bitmasks[group]!!
                        val flagList = ((enumConstantMap[required] as Map<String, *>)[group] as List<String>).map {
                            if (it !in flagAliasMap) it
                            else dealias(it, flagAliasMap)
                        }

                        bitmask.flags.filter { it.name in flagList }.forEach { flags ->
                            bitmask.flagExtensions.addIfAbsent(extension.name)
                            flags.extensions.addIfAbsent(extension.name)
                            extension.flagBits[group]!!.addIfAbsent(flags)
                        }
                    }
                    if (group in vk.flags) {
                        val flags = vk.flags[group]!!
                        flags.extensions.addIfAbsent(extension.name)
                        extension.flags[group]!!.addIfAbsent(flags)
                    }
                }
            }
        }


    }

    fun addConstants(constantNames: List<String>) {
        constantNames.forEach { constantName ->
            val enumInfo = registry!!.enumMap[constantName]
            val typeName = enumInfo!!.type
            val valueStr = enumInfo.elem.getAttribute("value")
            val isHex = valueStr.uppercase().startsWith("0X")
            val intBase = if (isHex) 16 else 10
            val value: ConstantValue
            if (valueStr.uppercase().endsWith("F") && !isHex) {
                value = ConstantValueFloat(valueStr.toFloat())
            } else if (valueStr.uppercase().endsWith("U)")) {
                val innerNumber = valueStr.substringAfter("(~").substringBeforeLast("U)").toUInt(intBase)
                value = ConstantValueUInt(innerNumber.inv())
            } else if (valueStr.uppercase().endsWith("ULL)")) {
                val innerNumber = valueStr.substringAfter("(~").substringBeforeLast("ULL)").toULong(intBase)
                value = ConstantValueULong(innerNumber.inv())
            } else {
                value = ConstantValueInt(valueStr.toInt(intBase))
            }
            vk.constants[constantName] = Constant(constantName, typeName, value, valueStr)
        }
    }

    override fun endFile() {
        super.endFile()
    }

    override fun beginFeature(interfaceElem: Element, emit: Boolean) {
        super.beginFeature(interfaceElem, emit)
    }

    override fun endFeature() {
        super.endFeature()
    }

    override fun genCmd(cmdInfo: CmdInfo, name: String, alias: String?) {
        super.genCmd(cmdInfo, name, alias)
    }

    override fun genGroup(groupInfo: GroupInfo, groupName: String, alias: String?) {
        super.genGroup(groupInfo, groupName, alias)
    }

    override fun genType(typeInfo: TypeInfo, name: String, alias: String?) {
        super.genType(typeInfo, name, alias)
    }
}

private class VideoStdGenerator : BaseGenerator() {
    var currentVideoStdHeader: VideoStdHeader? = null

    init {
        vk.videoStd = VideoStd()
    }

    override fun beginFile(genOpts: GeneratorOptions) {
        outputGenBeginFile(genOpts)
    }

    override fun endFile() {
        vk.videoStd!!.enums = vk.enums
        vk.videoStd!!.structs = vk.structs
        vk.videoStd!!.constants = vk.constants

        outputGenEndFile()
    }

    override fun beginFeature(interfaceElem: Element, emit: Boolean) {
        outputGenBeginFeature(interfaceElem, emit)

        assert(interfaceElem.tagName == "extension")
        val name = interfaceElem.getAttribute("name")
        var version: String? = null
        val depends = mutableListOf<String>()

        interfaceElem.findAll("require/enum[@value]")!!.forEachElement { enum ->
            val enumName = enum.getAttribute("name")
            if (enumName.endsWith("_SPEC_VERSION")) {
                version = enum.getAttribute("value")
            }
        }

        interfaceElem.findAll("require/type[@name]")!!.forEachElement { type ->
            val typeName = type.getAttribute("name")
            if (typeName.startsWith("vk_video/")) {
                depends.add(typeName.substringAfter("vk_video/").substringBeforeLast(".h"))
            }
        }

        val headerFile = "overrungl/vulkan/video/${
            name.split('_')
                .joinToString("") { it.replaceFirstChar(Char::uppercaseChar) }
        }.java"

        vk.videoStd!!.headers[name] = VideoStdHeader(name, version, headerFile, depends)

        currentVideoStdHeader = vk.videoStd!!.headers[name]

        val constantNames = mutableListOf<String>()
        interfaceElem.findAll("require/enum[@type]")!!.forEachElement { enum ->
            constantNames.add(enum.getAttribute("name"))
        }
        addConstants(constantNames)
        constantNames.forEach { constantName ->
            vk.constants[constantName]!!.videoStdHeader = currentVideoStdHeader!!.name
        }
    }

    override fun endFeature() {
        currentVideoStdHeader = null

        outputGenEndFeature()
    }

    override fun genCmd(cmdInfo: CmdInfo, name: String, alias: String?) {
        assert(false)
    }

    override fun genGroup(groupInfo: GroupInfo, groupName: String, alias: String?) {
        super.genGroup(groupInfo, groupName, alias)

        assert(currentVideoStdHeader != null)

        if (groupInfo.elem.getAttribute("type") == "enum") {
            assert(alias == null)
            vk.structs[groupName]!!.videoStdHeader = currentVideoStdHeader!!.name
        }
    }

    override fun genType(typeInfo: TypeInfo, name: String, alias: String?) {
        super.genType(typeInfo, name, alias)

        assert(currentVideoStdHeader != null)

        if (typeInfo.elem.getAttribute("category") == "struct") {
            assert(alias == null)
            vk.structs[name]!!.videoStdHeader = currentVideoStdHeader!!.name
        }
    }
}

private fun <T> MutableList<T>.addIfAbsent(element: T) {
    if (element !in this) {
        add(element)
    }
}
