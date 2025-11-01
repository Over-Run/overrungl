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

import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.NodeList
import javax.xml.parsers.DocumentBuilderFactory

// ported from scripts/reg.py

fun apiNameMatch(str: String?, supported: String?): Boolean {
    if (str != null) {
        return supported == null || str in supported.split(',')
    }
    return false
}

fun matchAPIProfile(api: String?, profile: String?, elem: Element): Boolean {
    if (elem.hasAttribute("api")) {
        val elemApi = elem.getAttribute("api")
        api ?: throw RuntimeException("No API requested, but 'api' attribute is present with value '$elemApi'")
        if (api != elemApi) {
            return false
        }
    }
    if (elem.hasAttribute("profile")) {
        val elemProfile = elem.getAttribute("profile")
        profile
            ?: throw RuntimeException("No profile requested, but 'profile' attribute is present with value '$elemProfile'")
        if (profile != elemProfile) {
            return false
        }
    }
    return true
}

fun mergeAPIs(tree: Element, fromApiNames: List<String>, toApiName: String) {
    val stack = ArrayDeque<Element>()
    stack.add(tree)

    while (stack.isNotEmpty()) {
        val parent = stack.removeLast()

        parent.getElementsByTagName("*").forEachElement { child ->
            if (child.tagName == "remove") {
                parent.removeChild(child)
            } else {
                stack.add(child)
            }

            if (child.hasAttribute("supported")) {
                val supportedList = child.getAttribute("supported").split(',')
                (listOf(toApiName) + fromApiNames).forEach { apiName ->
                    if (apiName in supportedList) {
                        child.setAttribute("supported", toApiName)
                    }
                }
            }

            if (child.hasAttribute("api")) {
                var definitionName: String? = null
                var definitionVariants: NodeList? = null

                if (child.tagName in listOf("type")) {
                    if (child.hasAttribute("name")) {
                        definitionName = child.getAttribute("name")
                        definitionVariants = parent.findAll("${child.tagName}[@name='$definitionName']")
                    } else {
                        definitionName = child.getElementsByTagName("name").item(0).textContent
                        definitionVariants = parent.findAll("${child.tagName}/name[.='$definitionName']/..")
                    }
                } else if (child.tagName in listOf("member", "param")) {
                    definitionName = child.getElementsByTagName("name").item(0).textContent
                    definitionVariants = parent.findAll("${child.tagName}/name[.='$definitionName']/..")
                } else if (child.tagName in listOf("enum", "feature")) {
                    definitionName = child.getAttribute("name")
                    definitionVariants = parent.findAll("${child.tagName}[@name='$definitionName']")
                } else if (child.tagName in listOf("require")) {
                    if (child.getAttribute("api") in fromApiNames) {
                        child.setAttribute("api", toApiName)
                    }
                } else if (child.tagName in listOf("command")) {
                    definitionName = child.find("proto/name")?.textContent
                    definitionVariants = parent.findAll("${child.tagName}/proto/name[.='$definitionName']/../..")
                }

                if (definitionName != null) {
                    var bestMatchApi: String? = null
                    var requires: String? = null
                    (listOf(toApiName) + fromApiNames).forEach { apiName ->
                        definitionVariants!!.forEachElement { variant ->
                            if (variant.hasAttribute("requires") && variant.getAttribute("api") == apiName) {
                                requires = variant.getAttribute("requires")
                            }
                            if (apiName in variant.getAttribute("api").split(',') && bestMatchApi == null) {
                                bestMatchApi = variant.getAttribute("api")
                            }
                        }
                    }

                    if (bestMatchApi != null) {
                        definitionVariants!!.forEachElement { variant ->
                            if (variant.getAttribute("api") != bestMatchApi) {
                                parent.removeChild(variant)
                            } else {
                                if (requires != null && !variant.hasAttribute("requires")) {
                                    variant.setAttribute("requires", requires)
                                }
                                variant.setAttribute("api", toApiName)
                            }
                        }
                    }
                }
            }
        }
    }
}

fun mergeInternalFeatures(tree: Element, apiName: String) {
    val internalFeatures = mutableListOf<Element>()
    val publicFeatures = mutableListOf<Element>()

    tree.getElementsByTagName("feature").forEachElement { feature ->
        val api = feature.getAttribute("api")
        val apiType = feature.getAttribute("apitype")

        if (apiName !in api.split(',')) {
            return@forEachElement
        }

        if (apiType == "internal") {
            internalFeatures.add(feature)
        } else {
            publicFeatures.add(feature)
        }
    }

    fun Element.getDependencies(): Set<String> {
        if (!hasAttribute("depends")) {
            return setOf()
        }
        val deps = mutableSetOf<String>()
        getAttribute("depends")
            .replace('+', ',')
            .split(',')
            .forEach { dep ->
                if (dep.trim().isNotEmpty()) {
                    deps.add(dep)
                }
            }
        return deps
    }

    fun Element.hasDependency(
        targetName: String,
        allFeaturesMap: Map<String, Element>,
        visited: MutableSet<String>? = null
    ): Boolean {
        var visited0 = visited
        if (visited0 == null) {
            visited0 = mutableSetOf()
        }

        val featureName = getAttribute("name")
        if (featureName in visited0) {
            return false
        }
        visited0.add(featureName)

        val deps = getDependencies()
        if (targetName in deps) {
            return true
        }

        deps.forEach { depName ->
            if (depName in allFeaturesMap) {
                if (allFeaturesMap[depName]!!.hasDependency(targetName, allFeaturesMap, visited0)) {
                    return true
                }
            }
        }
        return false
    }

    val allFeaturesMap = (publicFeatures + internalFeatures).associateBy { it.getAttribute("name") }

    internalFeatures.forEach { internalFeature ->
        val internalName = internalFeature.getAttribute("name")
        var targetFeature: Element? = null

        for (publicFeature in publicFeatures) {
            if (publicFeature.hasDependency(internalName, allFeaturesMap)) {
                targetFeature = publicFeature
                break
            }
        }

        if (targetFeature != null) {
            internalFeature.getElementsByTagName("require").forEachElement { require ->
                targetFeature.appendChild(require.cloneNode(true))
            }
            internalFeature.getElementsByTagName("deprecate").forEachElement { deprecate ->
                targetFeature.appendChild(deprecate.cloneNode(true))
            }
            internalFeature.getElementsByTagName("remove").forEachElement { remove ->
                targetFeature.appendChild(remove.cloneNode(true))
            }
            tree.removeChild(internalFeature)
        }
    }
}

fun stripNonmatchingAPIs(tree: Element, apiName: String, actuallyDelete: Boolean = true) {
    val stack = ArrayDeque<Element>()
    stack.add(tree)

    while (stack.isNotEmpty()) {
        val parent = stack.removeLast()

        parent.getElementsByTagName("*").forEachElement { child ->
            val api = child.getAttribute("api")

            if (apiNameMatch(apiName, api)) {
                stack.add(child)
            } else if (!apiNameMatch(apiName, api)) {
                if (actuallyDelete) {
                    parent.removeChild(child)
                }
            }
        }
    }
}

sealed class BaseInfo(val elem: Element) {
    var required = false
    var declared = false
    var deprecatedByVersion: String? = null
    val deprecatedByExtensions = mutableListOf<String>()
    var deprecatedLink: String? = null

    open fun resetState() {
        required = false
        declared = false
    }

    fun compareKeys(info: BaseInfo, key: String, required: Boolean = false): Boolean {
        if (required && key !in elem.keys()) {
            return false
        }
        return elem.getAttribute("key") == info.elem.getAttribute("key")
    }

    fun compareElem(info: BaseInfo, infoName: String): Boolean {
        if (infoName == "enum") {
            if (compareKeys(info, "extends")) {
                return if (compareKeys(info, "value", required = true) ||
                    compareKeys(info, "bitpos", required = true)
                ) {
                    true
                } else if (compareKeys(info, "extnumber") &&
                    compareKeys(info, "offset") &&
                    compareKeys(info, "dir")
                ) {
                    true
                } else if (compareKeys(info, "alias")) {
                    true
                } else {
                    false
                }
            } else {
                return false
            }
        } else {
            return false
        }
    }
}

class TypeInfo(elem: Element) : BaseInfo(elem) {
    val additionalValidity = mutableListOf<Element>()
    val removedValidity = mutableListOf<Element>()

    fun getMembers(): NodeList =
        elem.getElementsByTagName("member")

    override fun resetState() {
        super.resetState()
        additionalValidity.clear()
        removedValidity.clear()
    }
}

class GroupInfo(elem: Element) : BaseInfo(elem) {
    var flagType: TypeInfo? = null
}

class EnumInfo(elem: Element) : BaseInfo(elem) {
    val type = elem.getAttribute("type")
}

class CmdInfo(elem: Element) : BaseInfo(elem) {
    val additionalValidity = mutableListOf<Element>()
    val removedValidity = mutableListOf<Element>()

    fun getParams(): NodeList =
        elem.getElementsByTagName("param")

    override fun resetState() {
        super.resetState()
        additionalValidity.clear()
        removedValidity.clear()
    }
}

class FeatureInfo(elem: Element) : BaseInfo(elem) {
    val name = elem.getAttribute("name")
    var emit = false
    var sortOrder = elem.getAttributeOr("sortorder", "0").toInt()
    val category: String
    val version: String
    val versionNumber: String
    val number: Int
    val supported: String?
    val deprecates: NodeList?

    init {
        if (elem.tagName == "feature") {
            category = "VERSION"
            version = elem.getAttribute("name")
            versionNumber = elem.getAttribute("number")
            number = 0
            supported = null
            deprecates = elem.getElementsByTagName("deprecate")
        } else {
            category = name.split('_', limit = 2)[1]
            version = "0"
            versionNumber = "0"
            number = elem.getAttributeOr("number", "0").toInt()
            supported = elem.getAttributeOr("supported", "disabled")
            deprecates = null
        }
    }
}

class Registry(gen: OutputGenerator? = null, genOpts: GeneratorOptions? = null) {
    var gen = gen ?: OutputGenerator()
    val genOpts = genOpts ?: GeneratorOptions(apiName = APIConventions().xmlApiName)
    val mergeInternalApis: Boolean
    var tree: Document? = null
    val typeMap = mutableMapOf<String, TypeInfo>()
    val groupMap = mutableMapOf<String, GroupInfo>()
    val enumMap = mutableMapOf<String, EnumInfo>()
    val cmdMap = mutableMapOf<String, CmdInfo>()
    val aliasMap = mutableMapOf<String, String>()
    val enumValueMap = mutableMapOf<String, String>()
    val apiMap = mutableMapOf<String, FeatureInfo>()
    var extensions: NodeList? = null
    val extMap = mutableMapOf<String, FeatureInfo>()
    var emitFeatures = false
    var breakPat: Regex? = null
    val requiredExtensions = mutableListOf<String>()
    val validExtensionStructs = mutableMapOf<String, MutableList<String>>()
    val commandExtensionSuccesses = mutableListOf<CommandExtensionTuple>()
    val commandExtensionErrors = mutableListOf<CommandExtensionTuple>()
    var filename: String? = null
    var reg: Element? = null

    init {
        this.gen.registry = this
        this.gen.genOpts = this.genOpts
        this.gen.genOpts!!.registry = this

        mergeInternalApis = this.genOpts.mergeInternalApis
    }

    fun loadElementTree(tree: Document) {
        this.tree = tree
        parseTree()
    }

    fun loadFile(file: String) {
        val xmlFactory = DocumentBuilderFactory.newInstance()
        val xmlBuilder = xmlFactory.newDocumentBuilder()
        filename = file
        tree = ClassLoader.getSystemResourceAsStream(file)!!.use { xmlBuilder.parse(it) }
        parseTree()
    }

    fun setGenerator(gen: OutputGenerator?) {
        this.gen = gen ?: OutputGenerator()
        this.gen.registry = this
    }

    fun <T : BaseInfo> addElementInfo(elem: Element, info: T, infoName: String, map: MutableMap<String, T>) {
        val key = elem.getAttribute("name")
        if (key in map) {
            if (!map[key]!!.compareElem(info, infoName)) {
                gen.logWarn { "Attempt to redefine $key (this should not happen)" }
            }
        } else {
            map[key] = info
        }
    }

    fun <T : BaseInfo> lookupElementInfo(fname: String, map: Map<String, T>): T? =
        map[fname]

    fun breakOnName(regexp: String) {
        breakPat = Regex(regexp)
    }

    fun addEnumValue(enum: Element, typeName: String) {
        var typeName0 = typeName
        val value = enum.getAttribute("name")
        if (enum.hasAttribute("alias")) {
            val alias = enum.getAttribute("alias")
            aliasMap[value] = alias
        }
        if (typeName0 in aliasMap) {
            typeName0 = aliasMap[typeName0]!!
        }
        if (value in enumValueMap) {
            assert(typeName0 == enumValueMap[value])
        } else {
            enumValueMap[value] = typeName
        }
    }

    fun parseTree() {
        val tree = this.tree ?: throw RuntimeException("Tree not initialized!")
        reg = tree.documentElement

        if (genOpts.mergeApiNames != null) {
            mergeAPIs(reg!!, genOpts.mergeApiNames.split(','), genOpts.apiName!!)
        } else {
            stripNonmatchingAPIs(reg!!, genOpts.apiName!!, actuallyDelete = true)
        }

        if (mergeInternalApis) {
            mergeInternalFeatures(reg!!, genOpts.apiName)
        }

        aliasMap.clear()
        enumValueMap.clear()

        typeMap.clear()
        reg!!.findAll("types/type")!!.forEachElement { typeElem ->
            var name = typeElem.getAttribute("name")
            if (name.isEmpty()) {
                val nameElem = typeElem.getElementsByTagName("name").item(0)
                if (nameElem == null || nameElem.textContent == null) {
                    throw RuntimeException("Type without a name!")
                }
                name = nameElem.textContent
                typeElem.setAttribute("name", name)
            }
            addElementInfo(typeElem, TypeInfo(typeElem), "type", typeMap)
        }

        groupMap.clear()
        reg!!.getElementsByTagName("enums").forEachElement { group ->
            addElementInfo(group, GroupInfo(group), "group", groupMap)
        }

        enumMap.clear()
        reg!!.getElementsByTagName("enums").forEachElement { enums ->
            val required = enums.hasAttribute("type")
            val typeName = enums.getAttribute("name")
            assert(typeName !in aliasMap)
            enums.getElementsByTagName("enum").forEachElement { enum ->
                val enumInfo = EnumInfo(enum)
                enumInfo.required = required
                addElementInfo(enum, enumInfo, "enum", enumMap)
                addEnumValue(enum, typeName)
            }
        }

        cmdMap.clear()
        val cmdAlias = mutableListOf<CommandAlias>()
        reg!!.findAll("commands/command")!!.forEachElement { cmd ->
            var name = cmd.getAttribute("name")
            if (name.isEmpty()) {
                val nameElem = cmd.find("proto/name")
                if (nameElem == null || nameElem.textContent == null) {
                    throw RuntimeException("Command without a name!")
                }
                name = nameElem.textContent
                cmd.setAttribute("name", nameElem.textContent)
            }
            val ci = CmdInfo(cmd)
            addElementInfo(cmd, ci, "command", cmdMap)
            if (cmd.hasAttribute("alias")) {
                val alias = cmd.getAttribute("alias")
                cmdAlias.add(CommandAlias(name, alias, cmd))
                aliasMap[name] = alias
            }
        }

        cmdAlias.forEach { (name, alias, cmd) ->
            if (alias in cmdMap) {
                val aliasInfo = cmdMap[alias]!!
                val cmdElem = aliasInfo.elem.cloneNode(true) as Element
                cmdElem.find("proto/name")!!.textContent = name
                cmdElem.setAttribute("name", name)
                cmdElem.setAttribute("alias", alias)
                val export = cmd.getAttribute("export")
                if (export.isNotEmpty()) {
                    cmdElem.setAttribute("export", export)
                } else if (cmdElem.hasAttribute("export")) {
                    cmdElem.removeAttribute("export")
                }
                cmdMap[name] = CmdInfo(cmdElem)
            } else {
                gen.logWarn {
                    "No matching <command> found for command ${cmd.getAttribute("name")} alias $alias"
                }
            }
        }

        apiMap.clear()
        reg!!.getElementsByTagName("feature").forEachElement { feature ->
            val featureInfo = FeatureInfo(feature)
            addElementInfo(feature, featureInfo, "feature", apiMap)

            feature.getElementsByTagName("require").forEachElement { elem ->
                elem.getElementsByTagName("enum").forEachElement { enum ->
                    var addEnumInfo = false
                    val groupName = enum.getAttribute("extends")
                    if (groupName.isNotEmpty()) {
                        enum.setAttribute("version", featureInfo.version)
                        if (groupName in groupMap) {
                            groupMap[groupName]!!.elem.appendChild(enum.cloneNode(true))
                        } else {
                            gen.logWarn {
                                "NO matching group $groupName for enum ${enum.getAttribute("name")} found."
                            }
                        }
                        addEnumInfo = true
                    } else if (enum.hasAttribute("value") || enum.hasAttribute("bitpos") || enum.hasAttribute("alias")) {
                        addEnumInfo = true
                    }
                    if (addEnumInfo) {
                        val enumInfo = EnumInfo(enum)
                        addElementInfo(enum, enumInfo, "enum", enumMap)
                        addEnumValue(enum, groupName)
                    }
                }
            }
        }

        extensions = reg!!.findAll("extensions/extension")
        extMap.clear()
        extensions!!.forEachElement { feature ->
            val featureInfo = FeatureInfo(feature)
            addElementInfo(feature, featureInfo, "extension", extMap)

            feature.getElementsByTagName("require").forEachElement { elem ->
                elem.getElementsByTagName("enum").forEachElement { enum ->
                    var addEnumInfo = false
                    val groupName = enum.getAttribute("extends")
                    if (groupName.isNotEmpty()) {
                        if (!enum.hasAttribute("extnumber")) {
                            enum.setAttribute("extnumber", featureInfo.number.toString())
                        }

                        enum.setAttribute("extname", featureInfo.name)
                        enum.setAttribute("supported", featureInfo.supported ?: "")
                        if (groupName in groupMap) {
                            groupMap[groupName]!!.elem.appendChild(enum.cloneNode(true))
                        } else {
                            gen.logWarn {
                                "NO matching group $groupName for enum ${enum.getAttribute("name")} found."
                            }
                        }
                        addEnumInfo = true
                    } else if (enum.hasAttribute("value") || enum.hasAttribute("bitpos") || enum.hasAttribute("alias")) {
                        addEnumInfo = true
                    }
                    if (addEnumInfo) {
                        val enumInfo = EnumInfo(enum)
                        addElementInfo(enum, enumInfo, "enum", enumMap)
                        addEnumValue(enum, groupName)
                    }
                }
            }
        }
    }

    fun markTypeRequired(typename: String, required: Boolean) {
        gen.logInfo { "tagging type: $typename -> required = $required" }

        val typeInfo = lookupElementInfo(typename, typeMap)
        if (typeInfo != null) {
            if (required) {
                listOf("requires", "alias").forEach { attribName ->
                    val depName = typeInfo.elem.getAttribute(attribName)
                    if (depName.isNotEmpty()) {
                        gen.logInfo {
                            "Generating dependent type $depName for $attribName type $typename"
                        }
                        if (typename != depName) {
                            markTypeRequired(depName, required)
                        } else {
                            gen.logInfo {
                                "type $typename is self-referential"
                            }
                        }
                    }
                }
                typeInfo.elem.findAll(".//type")!!.forEachElement { subType ->
                    gen.logInfo {
                        "markRequired: type requires dependent <type>"
                    }
                    if (typename != subType.textContent) {
                        markTypeRequired(subType.textContent, required)
                    } else {
                        gen.logInfo {
                            "type $typename is self-referential"
                        }
                    }
                }
                typeInfo.elem.findAll(".//enum")!!.forEachElement { subEnum ->
                    gen.logInfo {
                        "markRequired: type requires dependent <enum>"
                    }
                    markEnumRequired(subEnum.textContent, required)
                }
                val depType = typeInfo.elem.getAttribute("bitvalues")
                if (depType.isNotEmpty()) {
                    gen.logInfo {
                        "Generating bitflag type $depType for type $typename"
                    }
                    markTypeRequired(depType, required)
                    val group = lookupElementInfo(depType, groupMap)
                    if (group != null) {
                        group.flagType = typeInfo
                    }
                }
            }

            typeInfo.required = required
        } else if (".h" !in typename) { // TODO: maybe .java
            gen.logWarn { "type: $typename IS NOT DEFINED" }
        }
    }

    fun markEnumRequired(enumName: String, required: Boolean) {
        gen.logInfo {
            "markEnumRequired: tagging enum: $enumName -> required = $required"
        }
        val enum = lookupElementInfo(enumName, enumMap)
        if (enum != null) {
            if (!required) {
                val groupName = enum.elem.getAttribute("extends")
                if (groupName.isNotEmpty()) {
                    gen.logInfo {
                        "markEnumRequired: Removing extending enum ${enum.elem.getAttribute("name")}"
                    }

                    if (groupName in groupMap) {
                        val gi = groupMap[groupName]!!
                        val giEnum = gi.elem.find("enum[@name='$enumName']")
                        if (giEnum != null) {
                            gi.elem.removeChild(giEnum)
                        } else {
                            gen.logWarn {
                                "markEnumRequired: Cannot remove enum $enumName not found in group $groupName"
                            }
                        }
                    } else {
                        gen.logWarn {
                            "markEnumRequired: Cannot remove enum $enumName from nonexistent group $groupName"
                        }
                    }
                } else {
                    val enumName = enum.elem.getAttribute("name")
                    gen.logInfo {
                        "markEnumRequired: Removing non-extending enum $enumName"
                    }

                    var count = 0
                    reg!!.getElementsByTagName("enums").forEachElement { enums ->
                        enums.getElementsByTagName("enum").forEachElement { thisEnum ->
                            if (thisEnum.getAttribute("name") == enumName) {
                                count++
                                enums.removeChild(thisEnum)
                            }
                        }
                    }

                    if (count == 0) {
                        gen.logWarn {
                            "markEnumRequired: $enumName not found in any <enums> tag"
                        }
                    }
                }
            }

            enum.required = required
            val depName = enum.elem.getAttribute("alias")
            if (depName.isNotEmpty()) {
                gen.logInfo {
                    "markEnumRequired: Generating dependent enum $depName for alias $enumName required = ${enum.required}"
                }
                markEnumRequired(depName, required)
            }
        } else {
            gen.logWarn {
                "markEnumRequired: $enumName IS NOT DEFINED"
            }
        }
    }

    fun markCmdRequired(cmdName: String, required: Boolean) {
        gen.logInfo {
            "tagging command: $cmdName -> required = $required"
        }
        val cmd = lookupElementInfo(cmdName, cmdMap)
        if (cmd != null) {
            cmd.required = required

            if (genOpts.requireCommandAliases) {
                val depName = cmd.elem.getAttribute("alias")
                if (depName.isNotEmpty()) {
                    gen.logInfo {
                        "Generating dependent command $depName for alias $cmdName"
                    }
                    markCmdRequired(depName, required)
                }
            }

            if (required) {
                cmd.elem.findAll(".//type")!!.forEachElement { typeElem ->
                    gen.logInfo {
                        "markRequired: command implicitly requires dependent type ${typeElem.textContent}"
                    }
                    markTypeRequired(typeElem.textContent, required)
                }
            }
        } else {
            gen.logWarn {
                "command: $cmdName IS NOT DEFINED"
            }
        }
    }

    fun markRequired(featureName: String, feature: Element, required: Boolean) {
        gen.logInfo {
            "markRequired (feature = <too long to print>, required = $required)"
        }

        feature.getElementsByTagName("type").forEachElement { typeElem ->
            markTypeRequired(typeElem.getAttribute("name"), required)
        }
        feature.getElementsByTagName("enum").forEachElement { enumElem ->
            markEnumRequired(enumElem.getAttribute("name"), required)
        }

        feature.getElementsByTagName("command").forEachElement { cmdElem ->
            markCmdRequired(cmdElem.getAttribute("name"), required)
        }

        feature.getElementsByTagName("extend").forEachElement { extendElem ->
            val extendType = extendElem.getAttribute("type")
            if (extendType == "command") {
                val commandName = extendElem.getAttribute("name")
                val successExtends = extendElem.getAttribute("successcodes")
                if (successExtends.isNotEmpty()) {
                    successExtends.split(',').forEach { success ->
                        commandExtensionSuccesses.add(
                            CommandExtensionTuple(
                                command = commandName,
                                value = success,
                                extension = featureName
                            )
                        )
                    }
                }

                val errorExtends = extendElem.getAttribute("errorcodes")
                if (errorExtends.isNotEmpty()) {
                    errorExtends.split(',').forEach { error ->
                        commandExtensionErrors.add(
                            CommandExtensionTuple(
                                command = commandName,
                                value = error,
                                extension = featureName
                            )
                        )
                    }
                }
            } else {
                gen.logWarn {
                    "extend type: $extendType IS NOT SUPPORTED"
                }
            }
        }
    }

    fun getAlias(elem: Element, map: Map<String, BaseInfo>): String {
        var alias = elem.getAttribute("alias")
        if (alias.isEmpty()) {
            val name = elem.getAttribute("name")
            val typeInfo = lookupElementInfo(name, map)
            if (typeInfo == null) {
                gen.logError {
                    "$name is not a known name"
                }
            }
            alias = typeInfo!!.elem.getAttribute("alias")
        }
        return alias
    }

    fun checkForCorrectionAliases(alias: String, require: Element, tag: String): Boolean {
        return false
    }

    @Suppress("UNCHECKED_CAST")
    fun fillFeatureMap(interfaceElem: Element, featureName: String, api: String?, profile: String?) {
        gen.featureMap[featureName] = FeatureMap()

        interfaceElem.getElementsByTagName("require").forEachElement { require ->
            if (matchAPIProfile(api, profile, require)) {
                val requiredKey = require.getAttribute("depends")

                require.getElementsByTagName("type").forEachElement { typeElem ->
                    val typeName = typeElem.getAttribute("name")
                    var typeInfo = lookupElementInfo(typeName, typeMap)

                    if (typeInfo != null) {
                        var alias = getAlias(typeElem, typeMap)
                        if (!checkForCorrectionAliases(alias, require, "type")) {
                            while (alias.isNotEmpty()) {
                                typeInfo = lookupElementInfo(alias, typeMap)
                                if (typeInfo == null) {
                                    throw RuntimeException("Missing alias $alias")
                                }
                                alias = typeInfo.elem.getAttribute("alias")
                            }

                            val typeCat = typeInfo.elem.getAttribute("category")
                            val typeExtends = typeInfo.elem.getAttribute("structextends")
                            if (requiredKey !in gen.featureMap[featureName]!![typeCat]) {
                                gen.featureMap[featureName]!![typeCat][requiredKey] = mutableMapOf<String, Any>()
                            }
                            if (typeExtends !in gen.featureMap[featureName]!![typeCat][requiredKey] as Map<*, *>) {
                                (gen.featureMap[featureName]!![typeCat][requiredKey] as MutableMap<String, List<String>>)[typeExtends] =
                                    mutableListOf()
                            }
                            ((gen.featureMap[featureName]!![typeCat][requiredKey] as MutableMap<String, List<String>>)[typeExtends] as MutableList<String>)
                                .add(typeName)
                        } else {
                            gen.logWarn {
                                "fillFeatureDictionary: NOT filling for $typeName"
                            }
                        }
                    }
                }

                require.getElementsByTagName("enum").forEachElement { enumElem ->
                    val enumName = enumElem.getAttribute("name")
                    val typeInfo = lookupElementInfo(enumName, enumMap)

                    val alias = getAlias(enumElem, enumMap)
                    if (!checkForCorrectionAliases(alias, require, "enum")) {
                        val enumExtends = typeInfo!!.elem.getAttribute("extends")
                        if (requiredKey !in gen.featureMap[featureName]!!.enumconstant) {
                            gen.featureMap[featureName]!!.enumconstant[requiredKey] = mutableMapOf<String, Any>()
                        }
                        if (enumExtends !in gen.featureMap[featureName]!!.enumconstant[requiredKey] as Map<*, *>) {
                            (gen.featureMap[featureName]!!.enumconstant[requiredKey] as MutableMap<String, List<String>>)[enumExtends] =
                                mutableListOf()
                        }
                        ((gen.featureMap[featureName]!!.enumconstant[requiredKey] as MutableMap<String, List<String>>)[enumExtends] as MutableList<String>)
                            .add(enumName)
                    } else {
                        gen.logWarn {
                            "fillFeatureDictionary: NOT filling for $enumName"
                        }
                    }
                }

                require.getElementsByTagName("command").forEachElement { cmdElem ->
                    val alias = getAlias(cmdElem, cmdMap)
                    if (!checkForCorrectionAliases(alias, require, "command")) {
                        if (requiredKey !in gen.featureMap[featureName]!!.command) {
                            gen.featureMap[featureName]!!.command[requiredKey] = mutableListOf<String>()
                        }
                        (gen.featureMap[featureName]!!.command[requiredKey] as MutableList<String>)
                            .add(cmdElem.getAttribute("name"))
                    } else {
                        gen.logWarn {
                            "fillFeatureDictionary: NOT filling for ${cmdElem.getAttribute("name")}"
                        }
                    }
                }
            }
        }
    }

    fun requireFeatures(interfaceElem: Element, featureName: String, api: String?, profile: String?) {
        interfaceElem.getElementsByTagName("require").forEachElement { feature ->
            if (matchAPIProfile(api, profile, feature)) {
                markRequired(featureName, feature, true)
            }
        }
    }

    fun deprecateFeatures(interfaceElem: Element, featureName: String, api: String?, profile: String?) {
        val versionMatch = APIConventions().isApiVersionName(featureName)

        interfaceElem.getElementsByTagName("deprecate").forEachElement { deprecation ->
            if (matchAPIProfile(api, profile, deprecation)) {
                fun setDeprecate(tag: String, map: Map<String, BaseInfo>) {
                    deprecation.getElementsByTagName(tag).forEachElement { elem ->
                        val info = lookupElementInfo(elem.getAttribute("name"), map)
                        if (info != null) {
                            if (versionMatch) {
                                info.deprecatedByVersion = featureName
                            } else {
                                info.deprecatedByExtensions.add(featureName)
                            }
                            info.deprecatedLink = deprecation.getAttribute("explanationlink")
                        } else {
                            gen.logError {
                                "${elem.getAttribute("name")} is tagged for deprecation but not present in registry"
                            }
                        }
                    }
                }

                setDeprecate("type", typeMap)
                setDeprecate("enum", enumMap)
                setDeprecate("command", cmdMap)
            }
        }
    }

    fun removeFeatures(interfaceElem: Element, featureName: String, api: String?, profile: String?) {
        interfaceElem.getElementsByTagName("remove").forEachElement { feature ->
            if (matchAPIProfile(api, profile, feature)) {
                markRequired(featureName, feature, false)
            }
        }
    }

    fun assignAdditionalValidity(interfaceElem: Element, api: String?, profile: String?) {
        interfaceElem.getElementsByTagName("require").forEachElement { feature ->
            if (matchAPIProfile(api, profile, feature)) {
                feature.getElementsByTagName("usage").forEachElement { v ->
                    if (v.hasAttribute("command")) {
                        cmdMap[v.getAttribute("command")]!!.additionalValidity.add(v.cloneNode(true) as Element)
                    }
                    if (v.hasAttribute("struct")) {
                        typeMap[v.getAttribute("struct")]!!.additionalValidity.add(v.cloneNode(true) as Element)
                    }
                }
            }
        }
    }

    fun removeAdditionalValidity(interfaceElem: Element, api: String?, profile: String?) {
        interfaceElem.getElementsByTagName("remove").forEachElement { feature ->
            if (matchAPIProfile(api, profile, feature)) {
                feature.getElementsByTagName("usage").forEachElement { v ->
                    if (v.hasAttribute("command")) {
                        cmdMap[v.getAttribute("command")]!!.removedValidity.add(v.cloneNode(true) as Element)
                    }
                    if (v.hasAttribute("struct")) {
                        typeMap[v.getAttribute("struct")]!!.removedValidity.add(v.cloneNode(true) as Element)
                    }
                }
            }
        }
    }

    @Suppress("UNCHECKED_CAST")
    fun generateFeature(fname: String, ftype: String, map: Map<String, BaseInfo>, explicit: Boolean = false) {
        gen.logInfo { "generateFeature: generating $ftype $fname" }

        if (!(explicit || genOpts.requireDepends)) {
            gen.logInfo { "generateFeature: NOT generating $ftype $fname because generator does not require dependencies" }
            return
        }

        var f = lookupElementInfo(fname, map)
        if (f == null) {
            gen.logInfo { "No entry found for feature $fname returning!" }
            return
        }

        if (!f.required) {
            gen.logInfo { "Skipping $ftype $fname (not required)" }
            return
        }
        if (!f.declared) {
            gen.logInfo { "Skipping $ftype $fname (already declared)" }
            return
        }
        f.declared = true

        val alias = f.elem.getAttribute("alias")
        if (alias.isNotEmpty()) {
            gen.logInfo { "$fname is an alias of $alias" }
        }

        var genProc: GenProc? = null
        var followupFeature: String? = null
        if (ftype == "type") {
            genProc = gen::genType as GenProc

            if (alias.isNotEmpty()) {
                generateFeature(alias, "type", typeMap)
            }
            val requires = f.elem.getAttribute("requires")
            if (requires.isNotEmpty()) {
                gen.logInfo { "Generating required dependent type $requires" }
                generateFeature(requires, "type", typeMap)
            }

            f.elem.findAll(".//type")!!.forEachElement { subtype ->
                gen.logInfo { "Generating required dependent <type> ${subtype.textContent}" }
                generateFeature(subtype.textContent, "type", typeMap)
            }

            f.elem.findAll(".//enum")!!.forEachElement { subtype ->
                gen.logInfo { "Generating required dependent <enum> ${subtype.textContent}" }
                generateFeature(subtype.textContent, "enum", typeMap)
            }

            if (f.elem.getAttribute("category") == "enum") {
                gen.logInfo {
                    "Type $fname is an enum group, so generate that instead"
                }
                val group = lookupElementInfo(fname, groupMap)
                if (alias.isNotEmpty()) {
                    gen.logInfo {
                        "Generating alias $fname for enumerated type $alias"
                    }
                    genProc = gen::genGroup as GenProc
                    f = lookupElementInfo(alias, groupMap)
                } else if (group == null) {
                    gen.logWarn {
                        "Skipping enum type $fname: No matching enumerate group"
                    }
                    return
                } else {
                    genProc = gen::genGroup as GenProc
                    f = group

                    gen.logInfo {
                        "generateFeature: checking enums for group $fname"
                    }

                    val enumAliases = mutableListOf<String>()
                    group.elem.getElementsByTagName("enum").forEachElement { elem ->
                        val name = elem.getAttribute("name")

                        var required = false

                        val extName = elem.getAttribute("extname")
                        val version = elem.getAttribute("version")
                        if (extName.isNotEmpty()) {
                            val supportedList = elem.getAttribute("supported").split(',')
                            if (genOpts.defaultExtensions in supportedList) {
                                required = true
                            } else if (Regex(genOpts.addExtensions).matches(extName)) {
                                required = true
                            }
                        } else if (version.isNotEmpty()) {
                            required = Regex(genOpts.emitVersions).matches(version)
                        } else {
                            required = true
                        }

                        gen.logInfo {
                            "* required = $required for $name"
                        }
                        if (required) {
                            elem.setAttribute("required", "true")
                            val enumAlias = elem.getAttribute("alias")
                            if (enumAlias.isNotEmpty()) {
                                enumAliases.add(enumAlias)
                            }
                        }
                    }
                    group.elem.getElementsByTagName("enum").forEachElement { elem ->
                        val name = elem.getAttribute("name")
                        if (name in enumAliases) {
                            elem.setAttribute("required", "true")
                            gen.logInfo {
                                "* also need to require alias $name"
                            }
                        }
                    }
                }
            }
            if (f == null) {
                throw RuntimeException("Should not get here")
            }
            if (f.elem.getAttribute("category") == "bitmask") {
                followupFeature = f.elem.getAttribute("bitvalues")
            }
        } else if (ftype == "command") {
            if (alias.isNotEmpty()) {
                generateFeature(alias, "command", cmdMap)
            }

            genProc = gen::genCmd as GenProc
            f.elem.findAll(".//type")!!.forEachElement { typeElem ->
                val depName = typeElem.textContent
                gen.logInfo {
                    "Generating required parameter type $depName"
                }
                generateFeature(depName, "type", typeMap)
            }
        } else if (ftype == "enum") {
            if (alias.isNotEmpty()) {
                generateFeature(alias, "enum", enumMap)
            }

            genProc = gen::genEnum as GenProc
        }

        if (emitFeatures) {
            gen.logInfo { "Emitting $ftype decl for $fname" }
            if (genProc == null) {
                throw RuntimeException("genProc is null when we should be emitting")
            }
            genProc(f, fname, alias)
        } else {
            gen.logInfo {
                "Skipping $ftype $fname (should not be emitted)"
            }
        }

        if (followupFeature != null) {
            gen.logInfo {
                "Generating required bitvalues <enum> $followupFeature"
            }
            generateFeature(followupFeature, "type", typeMap)
        }
    }

    fun generateRequiredInterface(interfaceElem: Element) {
        interfaceElem.getElementsByTagName("require").forEachElement { features ->
            features.getElementsByTagName("type").forEachElement { t ->
                generateFeature(t.getAttribute("name"), "type", typeMap, explicit = true)
            }
            features.getElementsByTagName("enum").forEachElement { e ->
                if (!e.hasAttribute("extends")) {
                    generateFeature(e.getAttribute("name"), "enum", enumMap, explicit = true)
                }
            }
            features.getElementsByTagName("command").forEachElement { c ->
                generateFeature(c.getAttribute("name"), "command", cmdMap, explicit = true)
            }
        }
    }

    fun stripUnsupportedAPIs(map: Map<String, BaseInfo>, attribute: String, supportedMap: Map<String, BaseInfo>) {
        map.values.forEach { elemInfo ->
            val attribString = elemInfo.elem.getAttribute(attribute)
            if (attribString.isNotEmpty()) {
                val apis = mutableListOf<String>()
                var stripped = false
                attribString.split(',').forEach { api ->
                    if (api in supportedMap && supportedMap[api]!!.required) {
                        apis.add(api)
                    } else {
                        stripped = true
                    }
                }

                if (stripped) {
                    elemInfo.elem.setAttribute(attribute, apis.joinToString(separator = ","))
                }
            }
        }
    }

    fun stripUnsupportedAPIsFromList(
        map: MutableMap<String, MutableList<String>>,
        supportedMap: Map<String, BaseInfo>
    ) {
        map.forEach { (key, attribString) ->
            val apis = mutableListOf<String>()
            var stripped = false
            attribString.forEach { api ->
                if (supportedMap[api]!!.required) {
                    apis.add(api)
                } else {
                    stripped = true
                }
            }

            if (stripped) {
                map[key] = apis
            }
        }
    }

    fun tagValidExtensionStructs() {
        typeMap.values.forEach { typeInfo ->
            val typeElem = typeInfo.elem
            if (typeInfo.required && typeElem.getAttribute("category") == "struct") {
                val structExtends = typeElem.getAttribute("structextends")
                if (structExtends.isNotEmpty()) {
                    structExtends.split(',').forEach { parent ->
                        validExtensionStructs.computeIfAbsent(parent) { mutableListOf() }
                            .add(typeElem.getAttribute("name"))
                    }
                }
            }
        }

        validExtensionStructs.values.forEach { it.sort() }
    }

    fun apiGen() {
        gen.logInfo { "*******************************************" }
        gen.logInfo {
            "  Registry.apiGen file: ${genOpts.filename} api: ${genOpts.apiName} profile: ${genOpts.profile}"
        }
        gen.logInfo { "*******************************************" }

        val regVersions = Regex(genOpts.versions)
        val regEmitVersions = Regex(genOpts.emitVersions)
        val regAddExtensions = Regex(genOpts.addExtensions)
        val regRemoveExtensions = Regex(genOpts.removeExtensions)
        val regEmitExtensions = Regex(genOpts.emitExtensions)

        val features = mutableListOf<FeatureInfo>()
        var apiMatch = false
        apiMap.values.forEach { fi ->
            val api = fi.elem.getAttribute("api")
            if (apiNameMatch(genOpts.apiName, api)) {
                apiMatch = true
                if (regVersions.matches(fi.name)) {
                    fi.emit = regEmitVersions.matches(fi.name)
                    features.add(fi)
                    if (!fi.emit) {
                        gen.logInfo {
                            "NOT tagging feature api = $api name = ${fi.name} version = ${fi.version} for emission (does not match emitVersions pattern)"
                        }
                    } else {
                        gen.logInfo {
                            "Including feature api = $api name = ${fi.name} version = ${fi.version} for emission (matches emitVersions pattern)"
                        }
                    }
                } else {
                    gen.logInfo {
                        "NOT including feature api = $api name = ${fi.name} version = ${fi.version} (does not match requested versions)"
                    }
                }
            } else {
                gen.logInfo {
                    "NOT including feature api = $api name = ${fi.name} (does not match requested API)"
                }
            }
        }
        if (!apiMatch) {
            gen.logWarn { "No matching API versions found!" }
        }

        extMap.values.sortedBy { it.number }.forEach { ei ->
            val extName = ei.name
            var include = false

            if (apiNameMatch(genOpts.defaultExtensions, ei.elem.getAttribute("supported"))) {
                gen.logInfo {
                    "Including extension $extName (defaultExtensions matches the 'supported' attribute)"
                }
                include = true
            }

            if (regAddExtensions.matches(extName)) {
                if (!apiNameMatch(genOpts.apiName, ei.elem.getAttribute("supported"))) {
                    gen.logInfo {
                        "NOT including extension $extName (matches explicitly requested, but does not match the 'supported' attribute)"
                    }
                    include = false
                } else {
                    gen.logInfo {
                        "Including extension $extName (matches explicitly requested extensions to add)"
                    }
                    include = true
                }
            }

            if (regRemoveExtensions.matches(extName)) {
                gen.logInfo {
                    "Removing extension $extName (matches explicitly requested extensions to remove)"
                }
                include = false
            }

            if (include) {
                ei.emit = regEmitExtensions.matches(extName)
                features.add(ei)
                if (!ei.emit) {
                    gen.logInfo {
                        "NOT tagging extension $extName for emission (does not match emitExtensions pattern)"
                    }
                }

                requiredExtensions.add(extName)
            } else {
                gen.logInfo {
                    "NOT tagging extension $extName (does not match api attribute or explicitly requested extensions)"
                }
            }
        }

        if (genOpts.sortProcedure != null) {
            genOpts.sortProcedure(features)
        }

        gen.logInfo { "PASS 1: TAG FEATURES" }
        features.forEach { f ->
            gen.logInfo { "PASS 1: Tagging required and features for ${f.name}" }
            fillFeatureMap(f.elem, f.name, genOpts.apiName, genOpts.profile)
            requireFeatures(f.elem, f.name, genOpts.apiName, genOpts.profile)
            deprecateFeatures(f.elem, f.name, genOpts.apiName, genOpts.profile)
            assignAdditionalValidity(f.elem, genOpts.apiName, genOpts.profile)
        }

        features.forEach { f ->
            gen.logInfo { "PASS 2: Tagging removed features for ${f.name}" }
            removeFeatures(f.elem, f.name, genOpts.apiName, genOpts.profile)
            removeAdditionalValidity(f.elem, genOpts.apiName, genOpts.profile)
        }

        stripUnsupportedAPIs(typeMap, "structextends", typeMap)
        stripUnsupportedAPIs(cmdMap, "successcodes", enumMap)
        stripUnsupportedAPIs(cmdMap, "errorcodes", enumMap)
        stripUnsupportedAPIsFromList(validExtensionStructs, typeMap)

        tagValidExtensionStructs()

        gen.logInfo { "PASS 3: GENERATE INTERFACES FOR FEATURES" }
        gen.beginFile(genOpts)
        features.forEach { f ->
            gen.logInfo { "PASS 3: Generating interface for ${f.name}" }
            emitFeatures = f.emit
            val emit = f.emit
            if (!emit) {
                gen.logInfo { "PASS 3: NOT declaring feature ${f.elem.getAttribute("name")} because it is not tagged for emission" }
            }
            gen.beginFeature(f.elem, emit)
            generateRequiredInterface(f.elem)
            gen.endFeature()
        }
        gen.endFile()
    }

    fun apiReset() {
        typeMap.values.forEach { it.resetState() }
        enumMap.values.forEach { it.resetState() }
        cmdMap.values.forEach { it.resetState() }
        apiMap.values.forEach { it.resetState() }
    }
}

data class CommandExtensionTuple(val command: String, val value: String, val extension: String)
data class CommandAlias(val name: String, val aliasName: String, val element: Element)
