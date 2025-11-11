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
    element.findChild(name)?.textContent

private fun intIfGet(element: Element, name: String) =
    if (!(element.hasAttribute(name))) null
    else element.getAttribute(name).toInt0()

private fun boolGet(element: Element, name: String) =
    element.hasAttribute(name) && element.getAttribute(name) == "true"

private fun externSyncGet(element: Element): Pair<ExternSync, String?> {
    val value = element.getAttributeOrNull("externsync") ?: return ExternSync.NONE to null
    if (value == "true")
        return ExternSync.ALWAYS to null
    if (value == "maybe")
        return ExternSync.MAYBE to null

    assert("," !in value)

    if (value.startsWith("maybe:"))
        return ExternSync.SUBTYPE_MAYBE to value.removePrefix("maybe:")
    return ExternSync.SUBTYPE to value
}

var globalFileName: String? = null
var globalDirectory: String = "."
var globalApiName: String = "vulkan"
var mergedApiNames: String? = null

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
    customDirectory: String? = null,
    customApiName: String? = null,
    videoXmlPath: String? = null
) : GeneratorOptions(
    conventions = vulkanConventions,
    directory = customDirectory ?: globalDirectory,
    apiName = customApiName ?: globalApiName,
    mergeApiNames = mergedApiNames,
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
    val targetApiName = globalApiName

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

    companion object {
        val specialInstanceCommand = listOf(
            "vkCreateInstance",
            "vkEnumerateInstanceExtensionProperties",
            "vkEnumerateInstanceLayerProperties",
            "vkEnumerateInstanceVersion"
        )
    }

    fun dealias(name: String, aliasMap: Map<String, String>): String {
        var name0 = name
        while (name0 in aliasMap) {
            name0 = aliasMap[name0]!!
        }
        return name0
    }

    override fun beginFile(genOpts: GeneratorOptions) {
        super.beginFile(genOpts)

        registry!!.reg!!.forEachChildrenChildren("platforms", "platform") { platform ->
            vk.platforms[platform.getAttribute("name")] = platform.getAttribute("protect") // TODO: empty?
        }

        registry!!.reg!!.forEachChildrenChildren("tags", "tag") { tag ->
            vk.vendorTags.add(tag.getAttribute("name"))
        }

        if (genOpts.videoXmlPath != null) {
            val videoStdGenerator = VideoStdGenerator()
            val videoRegistry = Registry(videoStdGenerator, genOpts)
            videoRegistry.loadFile(genOpts.videoXmlPath!!)
            videoRegistry.apiGen()
            vk.videoStd = videoStdGenerator.vk.videoStd
        }
    }

    @Suppress("UNCHECKED_CAST")
    fun applyExtensionDependency() {
        vk.extensions.values.forEach { extension ->
            val cmdMap = featureMap[extension.name]!!.command

            cmdMap.keys.forEach { required ->
                (cmdMap[required] as List<String>).forEach { commandName ->
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

        vk.extensions.values.forEach { extension ->
            val enumMap = featureMap[extension.name]!!.enum
            enumMap.keys.forEach { required ->
                (enumMap[required] as Map<String, *>).keys.forEach { group ->
                    ((enumMap[required] as Map<String, *>)[group] as List<String>).forEach { enumName ->
                        var enumName0 = enumName
                        val isAlias = enumName0 in enumAliasMap
                        enumName0 = dealias(enumName0, enumAliasMap)
                        if (enumName0 in vk.enums) {
                            val enum = vk.enums[enumName0]!!
                            enum.extensions.addIfAbsent(extension.name)
                            extension.enums.addIfAbsent(enum)
                            if (isAlias) {
                                return@forEach
                            }
                            enum.fieldExtensions.addIfAbsent(extension.name)
                            enum.fields.filter { it.extensions.isEmpty() || (it.extensions.all { e -> e in enum.extensions }) }
                                .forEach { enumField ->
                                    enumField.extensions.addIfAbsent(extension.name)
                                    extension.enumFields.computeIfAbsent(enumName0) { mutableListOf() }
                                        .addIfAbsent(enumField)
                                }
                        }
                    }
                }
            }

            val bitmaskMap = featureMap[extension.name]!!.bitmask
            bitmaskMap.keys.forEach { required ->
                (bitmaskMap[required] as Map<String, *>).keys.forEach { group ->
                    ((bitmaskMap[required] as Map<String, *>)[group] as List<String>).forEach { bitmaskName ->
                        var bitmaskName0 = bitmaskName.replace("Flags", "FlagBits")
                        val isAlias = bitmaskName0 in bitmaskAliasMap
                        bitmaskName0 = dealias(bitmaskName0, bitmaskAliasMap)
                        if (bitmaskName0 in vk.bitmasks) {
                            val bitmask = vk.bitmasks[bitmaskName0]!!
                            bitmask.extensions.addIfAbsent(extension.name)
                            extension.bitmasks.addIfAbsent(bitmask)
                            if (isAlias) {
                                return@forEach
                            }
                            bitmask.flagExtensions.addIfAbsent(extension.name)
                            bitmask.flags.filter { it.extensions.isEmpty() || (it.extensions.all { e -> e in bitmask.extensions }) }
                                .forEach { flag ->
                                    flag.extensions.addIfAbsent(extension.name)
                                    extension.flagBits.computeIfAbsent(bitmaskName0) { mutableListOf() }
                                        .addIfAbsent(flag)
                                }
                        }
                    }
                }
            }
        }

        vk.extensions.values.forEach { extension ->
            val structMap = featureMap[extension.name]!!.struct
            structMap.keys.forEach { required ->
                (structMap[required] as Map<String, *>).keys.forEach { group ->
                    ((structMap[required] as Map<String, *>)[group] as List<String>).forEach { structName ->
                        var structName0 = structName
                        val isAlias = structName0 in structAliasMap
                        structName0 = dealias(structName0, structAliasMap)
                        if (structName0 in vk.structs) {
                            val struct = vk.structs[structName0]!!
                            struct.extensions.addIfAbsent(extension.name)
                            extension.structs.addIfAbsent(struct)
                        }
                    }
                }
            }
        }

        vk.commands.values.forEach { command ->
            command.params.forEach { member ->
                if (member.type in structAliasMap) {
                    member.type = dealias(member.type, structAliasMap)
                }
            }
            if (command.legacy != null && command.legacy.version != null) {
                if (command.legacy.version!! !in vk.versions) {
                    command.legacy.version = null
                } else {
                    command.legacy.version = vk.versions[command.legacy.version!!]
                }
            }
        }

        structAliasMap.forEach { (key, value) ->
            vk.structs[dealias(value, structAliasMap)]!!.aliases.add(key)
        }
        enumFieldAliasMap.forEach { (key, value) ->
            enumFieldMap[dealias(value, enumFieldAliasMap)]!!.aliases.add(key)
        }
        enumAliasMap.forEach { (key, value) ->
            vk.enums[dealias(value, enumAliasMap)]!!.aliases.add(key)
        }
        flagAliasMap.forEach { (key, value) ->
            flagMap[dealias(value, flagAliasMap)]!!.aliases.add(key)
        }
        bitmaskAliasMap.forEach { (key, value) ->
            vk.bitmasks[dealias(value, bitmaskAliasMap)]!!.aliases.add(key)
        }
        flagsAliasMap.forEach { (key, value) ->
            vk.flags[dealias(value, flagsAliasMap)]!!.aliases.add(key)
        }
        handleAliasMap.forEach { (key, value) ->
            vk.handles[dealias(value, handleAliasMap)]!!.aliases.add(key)
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
                value = ConstantValueInt(
                    if (isHex) valueStr.uppercase().substringAfter("0X").toInt(intBase)
                    else valueStr.toInt(intBase)
                )
            }
            vk.constants[constantName] = Constant(constantName, typeName, value, valueStr)
        }
    }

    override fun endFile() {
        applyExtensionDependency()

        addConstants(registry!!.enumValueMap.filter { (_, v) -> v == "API Constants" }.keys.toList())

        vk.headerVersionComplete = APISpecific.createHeaderVersion(targetApiName, vk)

        // Use structs and commands to find which things are returnedOnly
        vk.structs.values.filter { !it.returnedOnly }.forEach { struct ->
            struct.members.filter { it.type in vk.enums }
                .map { vk.enums[it.type]!! }
                .forEach { enum ->
                    enum.returnedOnly = false
                }
            struct.members.filter { it.type in vk.bitmasks }
                .map { vk.bitmasks[it.type]!! }
                .forEach { bitmask ->
                    bitmask.returnedOnly = false
                }
            struct.members.filter { it.type in vk.flags }
                .map { vk.flags[it.type]!! }
                .forEach { flags ->
                    flags.returnedOnly = false
                    if (flags.bitmaskName != null) {
                        vk.bitmasks[flags.bitmaskName]!!.returnedOnly = false
                    }
                }
        }
        vk.commands.values.forEach { command ->
            command.params.filter { it.type in vk.enums }
                .map { vk.enums[it.type]!! }
                .forEach { enum ->
                    enum.returnedOnly = false
                }
            command.params.filter { it.type in vk.bitmasks }
                .map { vk.bitmasks[it.type]!! }
                .forEach { bitmask ->
                    bitmask.returnedOnly = false
                }
            command.params.filter { it.type in vk.flags }
                .map { vk.flags[it.type]!! }
                .forEach { flags ->
                    flags.returnedOnly = false
                    if (flags.bitmaskName != null) {
                        vk.bitmasks[flags.bitmaskName]!!.returnedOnly = false
                    }
                }
        }

        // Turn handle parents into pointers to classes
        vk.handles.values.filter { it.parent != null }.forEach { handle ->
            handle.parent = vk.handles[handle.parent!!]
        }
        // search up parent chain to see if instance or device
        vk.handles.values.forEach { handle ->
            var nextParent = handle.parent as Handle?
            while (!handle.instance && !handle.device) {
                handle.instance = nextParent?.name == "VkInstance"
                handle.device = nextParent?.name == "VkDevice"
                nextParent = nextParent?.parent as Handle?
            }
        }

        super.endFile()
    }

    @Suppress("UNCHECKED_CAST")
    override fun beginFeature(interfaceElem: Element, emit: Boolean) {
        super.beginFeature(interfaceElem, emit)
        val platform = interfaceElem.getAttribute("platform")
        featureExtraProtect = vk.platforms[platform]
        val protect = vk.platforms[platform]
        val name = interfaceElem.getAttribute("name")

        val featureRequirement = mutableListOf<FeatureRequirement>()
        interfaceElem.forEachNamedImmediateTags("require") { require ->
            val requireDepends = require.getAttributeOrNull("depends")
            require.forEachNamedImmediateTags("feature") { feature ->
                val featureStruct = feature.getAttribute("struct")
                val featureName = feature.getAttribute("name")
                featureRequirement.add(FeatureRequirement(featureStruct, featureName, requireDepends))
            }
        }

        if (interfaceElem.tagName == "extension") {
            if (interfaceElem.hasAttribute("supported")) {
                val enabledApiList = listOf(globalApiName) + (mergedApiNames?.split(',') ?: listOf())
                val supportedArr = interfaceElem.getAttribute("supported").split(',')
                if (enabledApiList.all { api -> api !in supportedArr }) {
                    unsupportedExtension = true
                    return
                }
            }

            val instance = interfaceElem.getAttribute("type") == "instance"
            val device = !instance
            val depends = interfaceElem.getAttribute("depends")
            val vendorTag = name.split('_')[1]
            val platform = interfaceElem.getAttribute("platform")
            val provisional = boolGet(interfaceElem, "provisional")
            val promotedto = interfaceElem.getAttribute("promotedto")
            val deprecatedby = interfaceElem.getAttribute("deprecatedby")
            val obsoletedby = interfaceElem.getAttribute("obsoletedby")
            val specialuse = splitIfGet(interfaceElem, "specialuse")
            val ratifiedApis = splitIfGet(interfaceElem, "ratified")
            val ratified = ratifiedApis.isNotEmpty() && genOpts!!.apiName in ratifiedApis

            val specVersion = (featureMap[name]!!.enumconstant[null] as Map<String?, List<*>>)[null]!![0] as String
            val nameString = (featureMap[name]!!.enumconstant[null] as Map<String?, List<*>>)[null]!![1] as String

            val extension = Extension(
                name,
                nameString,
                specVersion,
                instance,
                device,
                depends,
                vendorTag,
                platform,
                protect,
                provisional,
                promotedto,
                deprecatedby,
                obsoletedby,
                specialuse,
                featureRequirement,
                ratified
            )
            currentExtension = extension
            vk.extensions[name] = extension
        } else {
            val number = interfaceElem.getAttribute("number")
            if (number != "1.0") {
                val version = APISpecific.createApiVersion(targetApiName, name, featureRequirement)
                currentVersion = version
                vk.versions[name] = version
            }
        }
    }

    override fun endFeature() {
        super.endFeature()
        currentExtension = null
        currentVersion = null
        unsupportedExtension = false
    }

    override fun genCmd(cmdInfo: CmdInfo, name: String, alias: String?) {
        super.genCmd(cmdInfo, name, alias)

        if (unsupportedExtension) {
            return
        }

        val params = mutableListOf<Param>()
        cmdInfo.elem.forEachNamedImmediateTags("param") { param ->
            val paramName = param.getElementsByTagName("name").item(0).textContent
            val paramType = textIfFind(param, "type")!!
            val paramAlias = param.getAttributeOrNull("alias")

            val cdecl = makeCParamDecl(param)
            val paramFullType = cdecl.split().dropLast(1).joinToString(" ")
            val pointer = "*" in cdecl || paramType.startsWith("PFN_")
            val paramConst = "const" in cdecl
            val fixedSizeArray = cdecl.split('[')
                .filter { it.endsWith(']') }
                .map { it.substring(0, it.length - 1) }

            val paramNoautovalidity = boolGet(param, "noautovalidity")

            var nullTerminated = false
            var length = if (param.hasAttribute("altlen")) param.getAttribute("altlen")
            else param.getAttributeOrNull("len")
            if (length != null) {
                nullTerminated = "null-terminated" in length
                length = if (nullTerminated) length.replace(",null-terminated", "")
                else length
                length = if (length == "null-terminated") null else length
            }

            if (fixedSizeArray.isNotEmpty() && length == null) {
                length = fixedSizeArray.joinToString(",")
            }

            val optionalValues = splitIfGet(param, "optional")
            val optional = optionalValues.isNotEmpty() && optionalValues[0].lowercase() == "true"
            val optionalPointer = optionalValues.size > 1 && optionalValues[1].lowercase() == "true"

            val (externSync, externSyncPointer) = externSyncGet(param)

            params.add(
                Param(
                    paramName,
                    paramAlias,
                    paramType,
                    paramFullType,
                    paramNoautovalidity,
                    paramConst,
                    length,
                    nullTerminated,
                    pointer,
                    fixedSizeArray,
                    optional,
                    optionalPointer,
                    externSync,
                    externSyncPointer,
                    cdecl
                )
            )
        }

        val alias = cmdInfo.elem.getAttributeOrNull("alias")
        val tasks = splitIfGet(cmdInfo.elem, "tasks")

        val queues = splitIfGet(cmdInfo.elem, "queues")
        val allowNoQueues = boolGet(cmdInfo.elem, "allownoqueues")
        val successcodes = splitIfGet(cmdInfo.elem, "successcodes")
        val errorcodes = splitIfGet(cmdInfo.elem, "errorcodes")
        val cmdbufferlevel = cmdInfo.elem.getAttributeOrNull("cmdbufferlevel")
        val primary = cmdbufferlevel != null && "primary" in cmdbufferlevel
        val secondary = cmdbufferlevel != null && "secondary" in cmdbufferlevel

        val renderpassStr = cmdInfo.elem.getAttributeOrNull("renderpass")
        val renderpass = if (renderpassStr == null) CommandScope.NONE
        else CommandScope.valueOf(renderpassStr.uppercase())
        val videocodingStr = cmdInfo.elem.getAttributeOrNull("videocoding")
        val videocoding = if (videocodingStr == null) CommandScope.NONE
        else CommandScope.valueOf(videocodingStr.uppercase())

        val protoElem = cmdInfo.elem.findChild("proto")!!
        val returnType = textIfFind(protoElem, "type")!!

        val decls = makeCDecls(cmdInfo.elem)
        val cPrototype = decls[0]
        val cFunctionPointer = decls[1]

        val legacy = if (cmdInfo.deprecatedLink != null)
            Legacy(
                cmdInfo.deprecatedLink,
                cmdInfo.deprecatedByVersion,
                cmdInfo.deprecatedByExtensions
            )
        else null

        val protect = currentExtension?.protect

        val instance =
            params.isNotEmpty() && (params[0].type == "VkInstance" || params[0].type == "VkPhysicalDevice" || name in specialInstanceCommand)
        val device = !instance

        val implicitElem = cmdInfo.elem.findChild("implicitexternsyncparams")
        val implicitExternSyncParams = implicitElem?.findChildren("param")
            ?.map { it.textContent }
            ?: mutableListOf()

        vk.commands[name] = Command(
            name,
            alias,
            protect,
            mutableListOf(),
            currentVersion,
            returnType,
            params,
            instance,
            device,
            tasks,
            queues,
            allowNoQueues,
            successcodes,
            errorcodes,
            primary,
            secondary,
            renderpass,
            videocoding,
            implicitExternSyncParams,
            legacy,
            cPrototype,
            cFunctionPointer
        )
    }

    override fun genGroup(groupInfo: GroupInfo, groupName: String, alias: String?) {
        super.genGroup(groupInfo, groupName, alias)

        if (unsupportedExtension) {
            return
        }

        val groupProtect = currentExtension?.protect
        val enumElem = groupInfo.elem
        val bitWidth = if (!enumElem.hasAttribute("bitwidth")) 32 else enumElem.getAttribute("bitwidth").toInt()
        if (enumElem.getAttribute("type") == "enum") {
            if (alias != null) {
                enumAliasMap[groupName] = alias
                return
            }
            val fields = mutableListOf<EnumField>()

            enumElem.forEachNamedImmediateTags("enum") { elem ->
                val fieldName = elem.getAttribute("name")

                if (!elem.hasAttribute("required")) {
                    return@forEachNamedImmediateTags
                }

                if (elem.hasAttribute("alias")) {
                    enumFieldAliasMap[fieldName] = elem.getAttribute("alias")
                    return@forEachNamedImmediateTags
                }

                val negative = elem.hasAttribute("dir")
                val protect = elem.getAttribute("protect")
                val (valueInt, valueStr) = enumToValue(elem, true, bitWidth)

                if (fields.find { it.name == fieldName } == null) {
                    val field = EnumField(
                        fieldName,
                        mutableListOf(),
                        protect,
                        negative,
                        valueInt!!,
                        valueStr!!,
                        mutableListOf()
                    )
                    enumFieldMap[fieldName] = field
                    fields.add(field)
                }
            }

            vk.enums[groupName] = VkEnum(
                groupName,
                mutableListOf(),
                groupProtect,
                bitWidth,
                true,
                fields,
                mutableListOf(),
                mutableListOf()
            )
        } else {
            if (alias != null) {
                bitmaskAliasMap[groupName] = alias
                return
            }
            val fields = mutableListOf<Flag>()

            enumElem.forEachNamedImmediateTags("enum") { elem ->
                val flagName = elem.getAttribute("name")

                if (!elem.hasAttribute("required")) {
                    return@forEachNamedImmediateTags
                }

                if (elem.hasAttribute("alias")) {
                    flagAliasMap[flagName] = elem.getAttribute("alias")
                    return@forEachNamedImmediateTags
                }

                val protect = elem.getAttribute("protect")

                val (valueInt, valueStr) = enumToValue(elem, true, bitWidth)
                val flagZero = valueInt == 0
                var flagMultiBit = false
                if (elem.hasAttribute("bitpos") && elem.getAttribute("value").isNotEmpty()) {
                    flagMultiBit = valueInt != 0
                }

                if (fields.find { it.name == flagName } == null) {
                    val flag = Flag(
                        flagName,
                        mutableListOf(),
                        protect,
                        valueInt!!,
                        valueStr!!,
                        flagMultiBit,
                        flagZero,
                        mutableListOf()
                    )
                    flagMap[flagName] = flag
                    fields.add(flag)
                }
            }

            val flagName = groupName.replace("FlagBits", "Flags")
            vk.bitmasks[groupName] = Bitmask(
                groupName,
                mutableListOf(),
                flagName,
                groupProtect,
                bitWidth,
                true,
                fields,
                mutableListOf(),
                mutableListOf()
            )
        }
    }

    override fun genType(typeInfo: TypeInfo, typeName: String, alias: String?) {
        super.genType(typeInfo, typeName, alias)

        if (unsupportedExtension) {
            return
        }

        val typeElem = typeInfo.elem
        val protect = currentExtension?.protect
        val extension = if (currentExtension != null) mutableListOf(currentExtension!!.name) else mutableListOf()
        val category = typeElem.getAttribute("category")
        if (category == "struct" || category == "union") {
            if (alias != null) {
                structAliasMap[typeName] = alias
                return
            }

            val union = category == "union"

            val returnedOnly = boolGet(typeElem, "returnedOnly")
            val allowDuplicate = boolGet(typeElem, "allowduplicate")

            val extends = splitIfGet(typeElem, "structextends")
            val extendedBy =
                registry!!.validExtensionStructs.getOrPut(typeName) { mutableListOf() }

            val members = mutableListOf<Member>()
            var sType: String? = null

            typeInfo.elem.getElementsByTagName("member").forEachElement { member ->
                member.forEachNamedImmediateTags("comment", copy = true) { comment ->
                    member.removeChild(comment)
                }

                val name = textIfFind(member, "name")
                val type = textIfFind(member, "type")
                sType = if (member.hasAttribute("values")) member.getAttribute("values")
                else sType
                val noAutoValidity = boolGet(member, "noautovalidity")
                val limitType = member.getAttribute("limittype")

                val (externSync, externSyncPointer) = externSyncGet(member)
                assert(externSyncPointer == null)

                var nullTerminated = false
                var length = if (member.hasAttribute("altlen")) member.getAttribute("altlen")
                else member.getAttributeOrNull("len")
                if (length != null) {
                    nullTerminated = "null-terminated" in length
                    length = if (nullTerminated) length.replace(",null-terminated", "")
                    else length
                    length = if (length == "null-terminated") null else length
                }

                val cdecl = makeCParamDecl(member)
                val fullType = cdecl.substringBeforeLast(name!!).split().joinToString(" ")
                val pointer = "*" in cdecl || type!!.startsWith("PFN_")
                val const = "const" in cdecl
                val fixedSizeArray = cdecl.split('[')
                    .filter { it.endsWith(']') }
                    .map { it.substring(0, it.length - 1) }

                if (fixedSizeArray.isNotEmpty() && length == null) {
                    length = fixedSizeArray.joinToString(",")
                }

                val bitFieldWidth = if (":" in cdecl) cdecl.split(':')[1].trim().toInt() else null

                val selector = if (!union) member.getAttributeOrNull("selector") else null
                val selection = if (union) member.getAttributeOrNull("selection") else null
                val selections = mutableListOf<String>()
                if (selection != null) {
                    selections.addAll(selection.split(','))
                }

                val optionalValues = splitIfGet(member, "optional")
                val optional = optionalValues.isNotEmpty() && optionalValues[0].lowercase() == "true"
                val optionalPointer = optionalValues.size > 1 && optionalValues[1].lowercase() == "true"

                members.add(
                    Member(
                        name,
                        type!!,
                        fullType,
                        noAutoValidity,
                        limitType,
                        const,
                        length,
                        nullTerminated,
                        pointer,
                        fixedSizeArray,
                        optional,
                        optionalPointer,
                        externSync,
                        cdecl,
                        bitFieldWidth,
                        selector,
                        selections
                    )
                )
            }

            vk.structs[typeName] = Struct(
                typeName,
                mutableListOf(),
                extension,
                currentVersion,
                protect,
                members,
                union,
                returnedOnly,
                sType,
                allowDuplicate,
                extends,
                extendedBy,
                null
            )
        } else if (category == "handle") {
            if (alias != null) {
                handleAliasMap[typeName] = alias
                return
            }
            val type = typeElem.getAttribute("objtypeenum")

            val parent = typeElem.getAttributeOrNull("parent")
            val instance = typeName == "VkInstance"
            val device = typeName == "VkDevice"

            val dispatchable = typeElem.findChild("type")!!.textContent == "VK_DEFINE_HANDLE"

            vk.handles[typeName] = Handle(
                typeName,
                mutableListOf(),
                type,
                protect,
                parent,
                instance,
                device,
                dispatchable,
                extension
            )
        } else if (category == "define") {
            if (typeName == "VK_HEADER_VERSION") {
                vk.headerVersion = typeElem.findChild("name")!!.nextSibling.textContent.trim().toInt()
            }
        } else if (category == "bitmask") {
            if (alias != null) {
                flagsAliasMap[typeName] = alias
                return
            }

            val baseFlagsType = typeElem.findChild("type")!!.textContent
            val bitWidth = if (baseFlagsType == "VkFlags64") 64 else 32

            var bitmaskName = typeElem.getAttributeOrNull("bitvalues")
            if (bitmaskName == null) {
                bitmaskName = typeElem.getAttributeOrNull("requires")
            }

            vk.flags[typeName] = Flags(
                typeName,
                mutableListOf(),
                bitmaskName,
                protect,
                baseFlagsType,
                bitWidth,
                true,
                extension
            )
        } else {
            return
        }
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

        interfaceElem.forEachChildrenChildrenWithAttr("require", "enum", "value") { enum ->
            val enumName = enum.getAttribute("name")
            if (enumName.endsWith("_SPEC_VERSION")) {
                version = enum.getAttribute("value")
            }
        }

        interfaceElem.forEachChildrenChildrenWithAttr("require", "type", "name") { type ->
            val typeName = type.getAttribute("name")
            if (typeName.startsWith("vk_video/")) {
                depends.add(typeName.substringAfter("vk_video/").substringBeforeLast(".h"))
            }
        }

        val headerFile = "vk_video/$name.h"

        vk.videoStd!!.headers[name] = VideoStdHeader(name, version, headerFile, depends)

        currentVideoStdHeader = vk.videoStd!!.headers[name]

        val constantNames = mutableListOf<String>()
        interfaceElem.forEachChildrenChildrenWithAttr("require", "enum", "type") { enum ->
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
            vk.enums[groupName]!!.videoStdHeader = currentVideoStdHeader!!.name
        }
    }

    override fun genType(typeInfo: TypeInfo, typeName: String, alias: String?) {
        super.genType(typeInfo, typeName, alias)

        assert(currentVideoStdHeader != null)

        if (typeInfo.elem.getAttribute("category") == "struct") {
            assert(alias == null)
            vk.structs[typeName]!!.videoStdHeader = currentVideoStdHeader!!.name
        }
    }
}

private fun <T> MutableList<T>.addIfAbsent(element: T) {
    if (element !in this) {
        add(element)
    }
}
