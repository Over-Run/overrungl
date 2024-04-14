/*
 * MIT License
 *
 * Copyright (c) 2024 Overrun Organization
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

import org.w3c.dom.NamedNodeMap
import org.w3c.dom.Node
import org.w3c.dom.NodeList
import overrungl.gen.fileHeader
import java.nio.file.Files
import javax.xml.parsers.DocumentBuilderFactory
import kotlin.io.path.Path

// vulkan_core update: 2024-04-13
// vk.xml: 2024-04-13

val UPPERCASE = Regex("([A-Z])")

fun indent(indent: Int) = " ".repeat(indent)
fun String.removeConstPrefix(): String {
    val s = this.removePrefix("VK_")
    return if (!s.first().isJavaIdentifierStart()) "_$s" else s
}

fun formatNumber(string: String) = string
    .removeSurrounding("(", ")")
    .removeSuffix("LL")
    .removeSuffix("U")

fun StringBuilder.appendDocument(document: String?, indent: Int) {
    if (document != null) {
        appendLine(buildString {
            appendLine("/**")
            appendLine(document.prependIndent(" * "))
            append(" */")
        }.prependIndent(indent(indent)))
    }
}

@JvmInline
value class Type(val value: String) {
    val mappedValue: String
        get() = TYPE_MAPPING.getOrDefault(value, value)
}

val float = Type("float")
val int = Type("int")
val long = Type("long")

val TYPE_MAPPING = mapOf(
    "uint32_t" to "int",
    "uint64_t" to "long"
)

interface Component {
    fun append(builder: StringBuilder, indent: Int)
}

object EmptyStatement : Component {
    override fun append(builder: StringBuilder, indent: Int) {
        builder.append(indent(indent))
        builder.appendLine(';')
    }
}

@JvmInline
value class LiteralStatement(val value: String) : Component {
    override fun append(builder: StringBuilder, indent: Int) {
        builder.appendLine(value.prependIndent(indent(indent)))
    }
}

data class Constant(val type: Type, val name: String, val value: String) : Component {
    override fun append(builder: StringBuilder, indent: Int) {
        builder.appendLine("${type.mappedValue} $name = $value;".prependIndent(indent(indent)))
    }
}

data class EnumValue(
    val name: String,
    val args: List<String>? = null,
    val document: String? = null,
    val deprecated: Boolean = false
) : Component {
    override fun append(builder: StringBuilder, indent: Int) {
        builder.appendDocument(document, indent)
        builder.append(indent(indent))
        if (deprecated) {
            builder.append("@Deprecated ")
        }
        builder.append(name)
        if (args != null) {
            builder.append("(")
            builder.append(args.joinToString(separator = ", "))
            builder.appendLine("),")
        }
    }
}

class VKFile(
    val name: String,
    val subpackage: String? = null,
    val document: String? = null,
    val classType: String = "interface"
) {
    private val components = ArrayList<Component>()
    val superclasses = ArrayList<String>()
    val superinterfaces = ArrayList<String>()

    fun addComponent(component: Component) {
        components.add(component)
    }

    fun generate() {
        Files.writeString(
            Path("$name.java"),
            buildString {
                appendLine(fileHeader)

                append("package overrungl.vulkan")
                if (subpackage != null) {
                    append(".$subpackage")
                }
                appendLine(';')
                appendLine()

                appendDocument(document, 0)

                append("public $classType $name")
                if (superclasses.isNotEmpty()) {
                    append(" extends ")
                    append(superclasses.joinToString(separator = ", "))
                }
                if (superinterfaces.isNotEmpty()) {
                    append(" implements ")
                    append(superinterfaces.joinToString(separator = ", "))
                }
                appendLine(" {")

                components.forEach {
                    it.append(this, 4)
                }

                appendLine("}")
            }
        )
    }
}

/**
 * @author squid233
 * @since 0.1.0
 */
fun main() {
    val Vk10 = VKFile(
        "Vk10", document = """
        The Vulkan binding.
        @since 0.1.0
    """.trimIndent()
    )
    Vk10.superclasses.add("overrun.marshal.DirectAccess")

    val builder = DocumentBuilderFactory.newInstance().newDocumentBuilder()
    ClassLoader.getSystemResourceAsStream("vk.xml")!!.use { stream ->
        val doc = builder.parse(stream)
        doc.documentElement.normalize()

        val vendors = ArrayList<String>(64)
        doc.getElementsByTagName("tags").forEach { tags ->
            tags.childNodes.forEach {
                if (it.nodeName == "tag") {
                    vendors.add(it.attributes["name"].nodeValue)
                }
            }
        }

        fun endsWithVendor(string: String) =
            vendors.firstOrNull(string::endsWith)

        fun removeVendorSuffix(string: String) =
            endsWithVendor(string)
                ?.let { string.removeSuffix(it) }
                ?: string

        doc.getElementsByTagName("enums").forEach { enumsNode ->
            val attributes = enumsNode.attributes
            when (val enumName = attributes["name"].nodeValue) {
                "API Constants" -> {
                    val list = ArrayList<Constant>()
                    enumsNode.childNodes.forEach { node ->
                        if (node.nodeName == "enum") {
                            val attrib = node.attributes
                            val name = attrib["name"].nodeValue.removeConstPrefix()
                            val alias = attrib["alias"]?.nodeValue?.removeConstPrefix()
                            if (alias != null) {
                                list.add(Constant(list.find { it.name == alias }!!.type, name, alias))
                            } else {
                                val value = attrib["value"].nodeValue
                                list.add(Constant(Type(attrib["type"].nodeValue), name, formatNumber(value)))
                            }
                        }
                    }
                    list.forEach(Vk10::addComponent)
                }

                else -> {
                    when (attributes["type"].nodeValue) {
                        "enum" -> {
                            val clazz = VKFile(enumName, classType = "enum")
                            clazz.superinterfaces.add("overrun.marshal.CEnum")
                            val endsWithVendor = endsWithVendor(enumName) != null
                            val prefix = "${
                                removeVendorSuffix(enumName)
                                    .replace(UPPERCASE) { "_${it.groupValues[1]}" }
                                    .uppercase()
                                    .removePrefix("_")
                            }_"
                            enumsNode.childNodes.forEach { node ->
                                if (node.nodeName == "enum") {
                                    val attrib = node.attributes
                                    val name =
                                        attrib["name"].nodeValue.removePrefix(prefix)
                                            .let { if (endsWithVendor) removeVendorSuffix(it) else it }
                                            .removeSuffix("_")
                                            .removeConstPrefix()
                                    val alias = attrib["alias"]?.nodeValue
                                        ?.removePrefix(prefix)
                                        ?.let { if (endsWithVendor) removeVendorSuffix(it) else it }
                                        ?.removeSuffix("_")
                                        ?.removeConstPrefix()
                                    if (alias != null) {
                                        clazz.addComponent(
                                            EnumValue(
                                                name = name,
                                                args = listOf("$alias.value"),
                                                deprecated = attrib["deprecated"]?.nodeValue.toBoolean()
                                            )
                                        )
                                    } else {
                                        clazz.addComponent(
                                            EnumValue(
                                                name = name,
                                                args = listOf(attrib["value"].nodeValue),
                                                document = attrib["comment"]?.nodeValue
                                            )
                                        )
                                    }
                                }
                            }
                            clazz.addComponent(EmptyStatement)
                            clazz.addComponent(
                                LiteralStatement(
                                    """
                                private final int value;
                                $enumName(int value) { this.value = value; }
                                @Override public int value() { return value; }
                            """.trimIndent()
                                )
                            )
                            clazz.generate()
                        }
                    }
                }
            }
        }
    }
    Vk10.generate()
}

private inline fun NodeList.forEach(action: (Node) -> Unit) {
    for (i in 0..<length) {
        action(item(i))
    }
}

private operator fun NamedNodeMap.get(name: String) = this.getNamedItem(name)
