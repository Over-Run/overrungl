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
import java.nio.file.Files
import java.nio.file.Path

// ported from scripts/generator.py

fun regSortCategoryKey(feature: FeatureInfo) =
    if (feature.elem.tagName == "feature") {
        if (feature.name.startsWith("VKSC")) 0.5
        else 0.0
    } else if (feature.category.uppercase() in listOf("ARB", "KHR", "OES")) 1.0
    else 2.0

fun regSortOrderKey(feature: FeatureInfo) = feature.sortOrder
fun regSortFeatureVersionKey(feature: FeatureInfo) = feature.versionNumber.toFloatOrNull()
fun regSortExtensionNumberKey(feature: FeatureInfo) = feature.number

fun regSortFeatures(featureList: MutableList<FeatureInfo>) {
    featureList.sortBy(::regSortExtensionNumberKey)
    featureList.sortBy(::regSortFeatureVersionKey)
    featureList.sortBy(::regSortCategoryKey)
    featureList.sortBy(::regSortOrderKey)
}

class MissingGeneratorOptionsError(msg: String? = null) :
    RuntimeException("MMissing generator options object genOpts${if (msg != null) ": $msg" else ""}")

class MissingGeneratorOptionsConventionsError(msg: String? = null) :
    RuntimeException("Missing Conventions object genOpts.conventions${if (msg != null) ": $msg" else ""}")

open class GeneratorOptions(
    val conventions: ConventionsBase? = null,
    val directory: String = ".",
    val genPath: String? = null,
    val apiName: String? = null,
    val mergeApiNames: String? = null,
    val mergeInternalApis: Boolean = true,
    val profile: String? = null,
    versions: String? = ".*",
    emitVersions: String? = ".*",
    val defaultExtensions: String? = null,
    addExtensions: String? = null,
    removeExtensions: String? = null,
    emitExtensions: String? = null,
    emitSpirv: String? = null,
    emitFormats: String? = null,
    val reparentEnums: Boolean = true,
    val sortProcedure: ((MutableList<FeatureInfo>) -> Unit)? = ::regSortFeatures,
    val requireCommandAliases: Boolean = false,
    val requireDepends: Boolean = true,
) {
    val versions = emptyRegex(versions)
    val emitVersions = emptyRegex(emitVersions)
    val addExtensions = emptyRegex(addExtensions)
    val removeExtensions = emptyRegex(removeExtensions)
    val emitExtensions = emptyRegex(emitExtensions)
    val emitSpirv = emptyRegex(emitSpirv)
    val emitFormats = emptyRegex(emitFormats)
    val codeGenerator = false
    var registry: Registry? = null
    var videoXmlPath: String? = null

    companion object {
        fun emptyRegex(pat: String?): String = pat ?: "_nomatch_^"
    }
}

open class OutputGenerator {
    private var featureName: String? = null
    var featureExtraProtect: String? = null
    var genOpts: GeneratorOptions? = null
    var registry: Registry? = null
    val featureMap = mutableMapOf<String, FeatureMap>()
    val extBase = 1000000000
    val extBlockSize = 1000
    val madeDirs = mutableMapOf<Path, Nothing?>()
    var emit = false
    var fileSuffix: String = ""
    var conventions: ConventionsBase? = null

    companion object {
        val categoryToPath = mapOf(
            "bitmask" to "flags",
            "enum" to "enums",
            "funcpointer" to "funcpointers",
            "handle" to "handles",
            "define" to "defines",
            "basetype" to "basetypes",
        )

        fun breakName(name: String, msg: String) {
            val bad = listOf<String>()

            if (name in bad) {
                println("breakName $name: $msg")
            }
        }
    }

    fun logMsg(level: System.Logger.Level, messageSupplier: () -> String) {
        if (level.severity <= System.Logger.Level.WARNING.severity)
            return
        System.getLogger("LOGGER").log(level, messageSupplier)
        if (level == System.Logger.Level.ERROR) {
            throw IllegalStateException(messageSupplier())
        }
    }

    fun logInfo(messageSupplier: () -> String) {
        logMsg(System.Logger.Level.INFO, messageSupplier)
    }

    fun logWarn(messageSupplier: () -> String) {
        logMsg(System.Logger.Level.WARNING, messageSupplier)
    }

    fun logError(messageSupplier: () -> String) {
        logMsg(System.Logger.Level.ERROR, messageSupplier)
    }

    fun enumToValue(
        elem: Element,
        needsNum: Boolean,
        bitWidth: Int = 32,
        forceSuffix: Boolean = false,
        parentForAliasDereference: Element? = null
    ): Pair<Int?, String?> {
        if (genOpts == null) {
            throw MissingGeneratorOptionsError()
        }
        if (genOpts!!.conventions == null) {
            throw MissingGeneratorOptionsConventionsError()
        }

        val name = elem.getAttribute("name")
        var numVal: Int? = null
        if (elem.hasAttribute("value")) {
            var value = elem.getAttribute("value")
            if (needsNum) {
                numVal = value.toInt0()
            }
            if (forceSuffix) {
                if (bitWidth == 64) {
                    value = "${value}L"
                }
            }
            return numVal to value
        }
        if (elem.hasAttribute("bitpos")) {
            var value = elem.getAttribute("bitpos")
            val bitpos = value.toInt0()
            numVal = 1 shl bitpos
            value = String.format("0x%08x", numVal)
            if (bitWidth == 64 || bitpos >= 32) {
                value = "${value}L"
            }
            return numVal to value
        }
        if (elem.hasAttribute("offset")) {
            var enumNegative = false
            val offset = elem.getAttribute("offset").toInt0()
            val extNumber = elem.getAttribute("extnumber").toInt0()
            val extends = elem.getAttribute("extends")
            if (elem.hasAttribute("dir")) {
                enumNegative = true
            }
            numVal = extBase + (extNumber - 1) * extBlockSize + offset
            if (enumNegative) {
                numVal *= -1
            }
            val value = numVal.toString()
            return numVal to value
        }
        if (elem.hasAttribute("alias")) {
            val aliasOf = elem.getAttribute("alias")
            if (parentForAliasDereference == null) {
                return null to aliasOf
            }
            val siblings = parentForAliasDereference.getElementsByTagName("enum")
            siblings.forEachElement { sib ->
                val sibName = sib.getAttribute("name")
                if (sibName == aliasOf) {
                    return enumToValue(sib, needsNum)
                }
            }
            throw RuntimeException("Could not find the aliased enum value")
        }
        return null to null
    }

    fun makeDir(path: Path) {
        logMsg(System.Logger.Level.INFO) { "OutputGenerator::makeDir($path)" }
        if (path !in madeDirs) {
            if (!Files.exists(path)) {
                Files.createDirectories(path)
            }
            madeDirs[path] = null
        }
    }

    fun outputGenBeginFile(genOpts: GeneratorOptions) {
        this.genOpts = genOpts
        if (genOpts.conventions == null) {
            throw MissingGeneratorOptionsConventionsError()
        }

        conventions = genOpts.conventions
    }

    open fun beginFile(genOpts: GeneratorOptions) {
        outputGenBeginFile(genOpts)
    }

    fun outputGenEndFile() {
        genOpts = null
    }

    open fun endFile() {
        outputGenEndFile()
    }

    fun outputGenBeginFeature(interfaceElem: Element, emit: Boolean) {
        this.emit = emit
        featureName = interfaceElem.getAttribute("name")
        featureExtraProtect = interfaceElem.getAttribute("protect")
    }

    open fun beginFeature(interfaceElem: Element, emit: Boolean) {
        outputGenBeginFeature(interfaceElem, emit)
    }

    fun outputGenEndFeature() {
        featureName = null
        featureExtraProtect = null
    }

    open fun endFeature() {
        outputGenEndFeature()
    }

    fun validateFeature(featureType: String, featureName: String) {
        if (this.featureName == null) {
            throw RuntimeException("Attempt to generate $featureType $featureName when not in feature")
        }
    }

    open fun genType(typeInfo: TypeInfo, typeName: String, alias: String?) {
        validateFeature("type", typeName)
    }

    open fun genStruct(typeInfo: TypeInfo, typeName: String, alias: String?) {
        validateFeature("struct", typeName)

        typeInfo.elem.getElementsByTagName("member").forEachElement { member ->
            member.getElementsByTagName("comment").toElementList().forEach { comment ->
                member.removeChild(comment)
            }
        }
    }

    open fun genGroup(groupInfo: GroupInfo, groupName: String, alias: String?) {
        validateFeature("group", groupName)
    }

    open fun genEnum(enumInfo: EnumInfo, typeName: String, alias: String?) {
        validateFeature("enum", typeName)
    }

    open fun genCmd(cmdInfo: CmdInfo, name: String, alias: String?) {
        validateFeature("command", name)
    }

    fun makeProtoName(name: String/*, tail: String*/): String {
        if (genOpts == null) {
            throw MissingGeneratorOptionsError()
        }
        return name// + tail
    }

    fun makeTypedefName(name: String/*, tail: String*/): String {
        if (genOpts == null) {
            throw MissingGeneratorOptionsError()
        }
        return "(*PFN_$name)"
    }

    fun makeCParamDecl(param: Element): String {
        if (genOpts == null) {
            throw MissingGeneratorOptionsError()
        }
        if (genOpts!!.conventions == null) {
            throw MissingGeneratorOptionsConventionsError()
        }

        val paramdecl = StringBuilder()
        var prefix = param.textContent ?: ""

        /*param.childNodes.forEach { elem ->
            if (elem !is Element) return@forEach

            val text = elem.textContent ?: ""
            val tail = elem.nextSibling?.let { if (it.nodeType == Node.TEXT_NODE) it.textContent else null } ?: ""

            paramdecl.append(prefix).append(text).append(tail)

            prefix = ""
        }*/

        paramdecl.append(prefix)
        return paramdecl.toString().split().joinToString(" ")
    }

    fun makeCDecls(cmd: Element): List<String> {
        if (genOpts == null) {
            throw MissingGeneratorOptionsError()
        }
        val proto = cmd.findChild("proto")
        val params = cmd.findChildren("param")
        val pdecl = StringBuilder()
        val tdecl = StringBuilder()
        tdecl.append("typedef ")

        /*pdecl.append(proto?.textContent ?: "")
        tdecl.append(proto?.textContent ?: "")*/
        proto!!.forEachImmediateChildren { elem ->
            val text = elem.textContent ?: ""
            //val tail = elem.nextSibling?.let { if (it.nodeType == Node.TEXT_NODE) it.textContent else null } ?: ""
            if (elem.tagName == "name") {
                pdecl.append(makeProtoName(text))
                tdecl.append(makeTypedefName(text))
            } else {
                pdecl.append(text).append(" ")//.append(tail)
                tdecl.append(text).append(" ")//.append(tail)
            }
        }

        val pdecl1 = pdecl.split().joinToString(" ")
        val tdecl1 = tdecl.split().joinToString(" ")

        val indentdecl = StringBuilder()
        if (params.isNotEmpty()) {
            indentdecl.append("(")
            params.joinTo(indentdecl, ", ") { makeCParamDecl(it) }
            indentdecl.append(");")
        } else {
            indentdecl.append("(void);")
        }

        val paramdecl = StringBuilder();
        paramdecl.append("(")
        if (params.isNotEmpty()) {
            val paramNames = params.map { it.textContent }
            paramNames.joinToString(paramdecl, ", ")
        } else {
            paramdecl.append("void")
        }
        paramdecl.append(");")

        return listOf(pdecl1 + indentdecl, tdecl1 + paramdecl)
    }
}

class FeatureMap {
    // Any: Map<String, List<String>> | List<String>

    val enumconstant = mutableMapOf<String?, Any>() // map dimensions: [requiredKey][enumExtends]
    val command = mutableMapOf<String?, Any>() // Any: List<String>
    val enum = mutableMapOf<String?, Any>()
    val struct = mutableMapOf<String?, Any>()
    val handle = mutableMapOf<String?, Any>()
    val basetype = mutableMapOf<String?, Any>()
    val include = mutableMapOf<String?, Any>()
    val define = mutableMapOf<String?, Any>()
    val bitmask = mutableMapOf<String?, Any>()
    val union = mutableMapOf<String?, Any>()
    val funcpointer = mutableMapOf<String?, Any>()

    operator fun get(typeCat: String): MutableMap<String?, Any> = when (typeCat) {
        "enumconstant" -> enumconstant
        "command" -> command
        "enum" -> enum
        "struct" -> struct
        "handle" -> handle
        "basetype" -> basetype
        "include" -> include
        "define" -> define
        "bitmask" -> bitmask
        "union" -> union
        "funcpointer" -> funcpointer
        else -> throw IllegalArgumentException(typeCat)
    }
}

typealias GenProc = (BaseInfo, name: String, alias: String?) -> Unit
