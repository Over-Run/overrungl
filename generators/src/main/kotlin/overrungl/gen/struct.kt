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

package overrungl.gen

import java.nio.file.Files
import kotlin.io.path.Path
import kotlin.io.path.createDirectories

object Structs {
    val structs = mutableListOf<Struct>()

    fun generate(qualifiedName: String) {
        val packageName = qualifiedName.substringBeforeLast('.')
        val javaName = qualifiedName.substringAfterLast('.')
        Files.writeString(Path(packageName.replace('.', '/'))
            .createDirectories()
            .resolve("$javaName.java"), buildString {
            appendLine(fileHeader)
            appendLine("package $packageName;")
            appendLine("import static overrun.marshal.gen.processor.ProcessorTypes.registerStruct;")
            appendLine("final class $javaName {")
            appendLine("    private $javaName() { }")
            appendLine("    static void registerAll() {")
            structs.forEach {
                val refName = if (it.packageName == packageName) it.javaName else it.qualifiedName
                appendLine("        registerStruct($refName.class, $refName.OF);")
            }
            appendLine("    }")
            appendLine("}")
        })
    }
}

class StructType(val struct: Struct, val byValue: Boolean) : Type {
    override val originalName: String = struct.originalName
    override val javaName: String = address.javaName
    override val memoryLayout: Expression =
        if (byValue) struct.memoryLayout else MethodInvokeExpr(address.memoryLayout!!, "withTargetLayout")

    override fun appendType(builder: StringBuilder) {
        builder.append("""@NativeType("$originalName") $javaName""")
    }
}

class Struct(
    internal val originalName: String,
    internal val qualifiedName: String,
    val javadoc: String? = null,
    action: Struct.() -> Unit
) {
    internal val packageName = qualifiedName.substringBeforeLast('.')
    internal val javaName = qualifiedName.substringAfterLast('.')
    private val layout = mutableListOf<Pair<String, Type>>()

    internal val memoryLayout: Expression = MethodInvokeExpr(FieldAccessExpr(LiteralExpr(javaName), "OF"), "layout")

    private var customCode: String? = null

    init {
        Structs.structs.add(this)
        action(this)
        generate()
    }

    operator fun Type.invoke(memberName: String) {
        layout.add(memberName to this)
    }

    fun type(byValue: Boolean): StructType = StructType(this, byValue)

    fun code(code: String) {
        customCode = code
    }

    fun generate() {
        Files.writeString(Path(packageName.replace('.', '/'))
            .createDirectories()
            .resolve("$javaName.java"), buildString {
            appendLine(fileHeader)
            appendLine("package $packageName;")
            appendLine(imports)

            if (javadoc != null) {
                appendLine(javadoc.prependIndent("/// "))
            }
            appendLine("/// ## Layout")
            appendLine("/// ```")
            appendLine("/// struct $originalName {")
            layout.forEach {
                appendLine("///     ${it.second.originalName} ${it.first};")
            }
            appendLine("/// }")
            appendLine("/// ```")
            appendLine("public interface $javaName extends ${Struct_.javaName}<$javaName> {")

            appendLine("    /// The struct allocator.")
            appendLine("    StructAllocator<$javaName> OF = new StructAllocator<>(MethodHandles.lookup(), LayoutBuilder.struct()")
            layout.forEach {
                append("        .add(")
                it.second.memoryLayout!!.append(this)
                appendLine(""", "${it.first}")""")
            }
            appendLine("    .build());")
            appendLine()

            layout.forEach {
                when (it.second) {
                    is DowncallType, is StructType -> {
                        if (it.second !is StructType || (!(it.second as StructType).byValue)) {
                            appendLine("    /// {@return `${it.first}`}")
                            append("    ")
                            it.second.appendType(this)
                            appendLine(" ${it.first}();")
                            appendLine()

                            appendLine("    /// Sets `${it.first}` with the given value.")
                            appendLine("    /// @param ${it.first} the value")
                            appendLine("    /// @return `this`")
                            append("    $javaName ${it.first}(")
                            it.second.appendType(this)
                            appendLine(" ${it.first});")
                            appendLine()
                        } else if ((it.second as StructType).byValue) {
                            (it.second as StructType).struct.also { struct ->
                                struct.layout.forEach { structLayout ->
                                    appendLine("    /// {@return `${it.first}.${structLayout.first}`}")
                                    append("    ")
                                    structLayout.second.appendType(this)
                                    appendLine(" ${it.first}$${structLayout.first}();")
                                    appendLine()

                                    appendLine("    /// Sets `${it.first}.${structLayout.first}` with the given value.")
                                    appendLine("    /// @param ${it.first}$${structLayout.first} the value")
                                    appendLine("    /// @return `this`")
                                    append("    $javaName ${it.first}$${structLayout.first}(")
                                    structLayout.second.appendType(this)
                                    appendLine(" ${it.first}$${structLayout.first});")
                                    appendLine()
                                }
                            }
                        }
                    }
                }
            }

            if (customCode != null) {
                appendLine(customCode!!.prependIndent("    "))
            }

            appendLine("}")
        })
    }
}
