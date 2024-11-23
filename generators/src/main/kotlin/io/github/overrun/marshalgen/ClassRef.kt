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

package io.github.overrun.marshalgen

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import kotlin.reflect.KProperty

class ClassRefs {
    val importedClasses = mutableListOf<String>()
    val importedModules = mutableListOf<String>()

    fun import(string: String) {
        importedClasses.add(string)
    }

    fun importModule(module: String) {
        importedModules.add(module)
    }

    fun appendString(builder: StringBuilder, selfName: String) {
        importedClasses
            .filterNot {
                (it.startsWith("java.lang.") && it.lastIndexOf('.') == 9) ||
                    it == selfName
            }
            .sorted()
            .forEach {
                builder.appendLine("import $it;")
            }
        importedModules.sorted().forEach { builder.appendLine("import module $it;") }
    }
}

interface ClassRef {
    val qualifiedName: String
    val cType: String?
    val canonicalType: String?
    val carrier: ClassRef?
    val memoryLayout: ((ClassRefs) -> String)?

    fun simpleName(classRefs: ClassRefs): String

    infix fun c(cType: String?): ClassRef =
        if (cType == this.cType) this
        else classRef(
            qualifiedName,
            carrier,
            cType,
            canonicalType,
            memoryLayout
        )

    infix fun canonical(canonicalType: String?): ClassRef =
        if (canonicalType == this.canonicalType) this
        else classRef(
            qualifiedName,
            carrier,
            cType,
            canonicalType,
            memoryLayout
        )

    infix fun layout(memoryLayout: ((ClassRefs) -> String)?): ClassRef =
        classRef(
            qualifiedName,
            carrier,
            cType,
            canonicalType,
            memoryLayout
        )

    fun array(cType: String?, carrier: ClassRef?, memoryLayout: ((ClassRefs) -> String)?): ClassRef =
        ArrayClassRef(this, cType, carrier, memoryLayout)

    fun array(): ClassRef =
        array(null, address, address.memoryLayout)

    fun T(vararg classRefs: ClassRef): ClassRef =
        GenericClassRef(this, classRefs.toList(), cType = cType, carrier = carrier, memoryLayout = memoryLayout)

    fun isValueClassRef(): Boolean = when (qualifiedName) {
        "boolean", "char", "byte", "short", "int", "long", "float", "double", "java.lang.foreign.MemorySegment" -> true
        else -> false
    }

    operator fun getValue(thisRef: Any?, property: KProperty<*>): ClassRef =
        c(property.name)
}

internal open class ObjectClassRef(
    override val qualifiedName: String,
    override val cType: String?,
    override val canonicalType: String?,
    override val carrier: ClassRef?,
    override val memoryLayout: ((ClassRefs) -> String)?
) : ClassRef {
    override fun simpleName(classRefs: ClassRefs): String =
        if (classRefs.importedClasses.contains(qualifiedName)) {
            qualifiedName.substringAfterLast('.')
        } else if (classRefs.importedClasses.any { it.substringAfterLast('.') == qualifiedName.substringAfterLast('.') }) {
            qualifiedName
        } else {
            classRefs.import(qualifiedName)
            qualifiedName.substringAfterLast('.')
        }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ObjectClassRef) return false

        if (qualifiedName != other.qualifiedName) return false
        if (carrier != other.carrier) return false

        return true
    }

    override fun hashCode(): Int {
        var result = qualifiedName.hashCode()
        result = 31 * result + carrier.hashCode()
        return result
    }
}

internal class PrimitiveClassRef(
    override val qualifiedName: String,
    override val cType: String?,
    override val canonicalType: String?,
    override val memoryLayout: ((ClassRefs) -> String)?
) : ClassRef {
    override val carrier: ClassRef = this
    override fun simpleName(classRefs: ClassRefs): String = qualifiedName

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrimitiveClassRef) return false

        if (qualifiedName != other.qualifiedName) return false
        if (carrier != other.carrier) return false

        return true
    }

    override fun hashCode(): Int {
        var result = qualifiedName.hashCode()
        result = 31 * result + carrier.hashCode()
        return result
    }

    override fun toString(): String = qualifiedName
}

internal class ArrayClassRef(
    private val componentType: ClassRef,
    override val cType: String?,
    override val carrier: ClassRef?,
    override val memoryLayout: ((ClassRefs) -> String)?
) : ClassRef {
    override val canonicalType: String? = null
    override val qualifiedName: String = "${componentType.qualifiedName}[]"
    override fun simpleName(classRefs: ClassRefs): String {
        return "${componentType.simpleName(classRefs)}[]"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ArrayClassRef) return false

        if (carrier != other.carrier) return false
        if (qualifiedName != other.qualifiedName) return false

        return true
    }

    override fun hashCode(): Int {
        var result = carrier?.hashCode() ?: 0
        result = 31 * result + qualifiedName.hashCode()
        return result
    }
}

internal class GenericClassRef(
    private val type: ClassRef,
    private val typeArgument: List<ClassRef>,
    override val cType: String?,
    override val carrier: ClassRef?,
    override val memoryLayout: ((ClassRefs) -> String)?
) : ClassRef {
    override val canonicalType: String? = null
    override val qualifiedName: String =
        "${type.qualifiedName}<${typeArgument.joinToString(", ") { it.qualifiedName }}>"

    override fun simpleName(classRefs: ClassRefs): String {
        return "${type.simpleName(classRefs)}<${typeArgument.joinToString(", ") { it.simpleName(classRefs) }}>"
    }
}

class StructClassRef(
    private val classRef: ClassRef,
    val members: List<StructMemberSpec>,
) : ClassRef by classRef

fun findPrimitiveRef(
    name: String,
    cType: String?,
    canonicalType: String?,
    memoryLayout: ((ClassRefs) -> String)?
): ClassRef? = when (name) {
    "void" -> void
    "boolean" -> PrimitiveClassRef(name, cType, canonicalType, memoryLayout)
    "char" -> PrimitiveClassRef(name, cType, canonicalType, memoryLayout)
    "byte" -> PrimitiveClassRef(name, cType, canonicalType, memoryLayout)
    "short" -> PrimitiveClassRef(name, cType, canonicalType, memoryLayout)
    "int" -> PrimitiveClassRef(name, cType, canonicalType, memoryLayout)
    "long" -> PrimitiveClassRef(name, cType, canonicalType, memoryLayout)
    "float" -> PrimitiveClassRef(name, cType, canonicalType, memoryLayout)
    "double" -> PrimitiveClassRef(name, cType, canonicalType, memoryLayout)
    else -> null
}

fun classRef(
    name: String,
    carrier: ClassRef? = null,
    cType: String? = null,
    canonicalType: String? = null,
    memoryLayout: ((ClassRefs) -> String)? = null
): ClassRef =
    findPrimitiveRef(name, cType, canonicalType, memoryLayout) ?: ObjectClassRef(
        name,
        cType,
        canonicalType,
        carrier,
        memoryLayout
    )

inline fun <reified T> classRef(
    carrier: ClassRef? = null,
    noinline memoryLayout: ((ClassRefs) -> String)? = carrier?.memoryLayout
): ClassRef =
    classRef(T::class.java.name, carrier, memoryLayout = memoryLayout)

// Java types
val void: ClassRef = PrimitiveClassRef("void", null, null, null)
val java_boolean: ClassRef = PrimitiveClassRef("boolean", null, null) { "${valueLayout.simpleName(it)}.JAVA_BOOLEAN" }
val java_char: ClassRef = PrimitiveClassRef("char", null, null) { "${valueLayout.simpleName(it)}.JAVA_CHAR" }
val java_byte: ClassRef = PrimitiveClassRef("byte", null, null) { "${valueLayout.simpleName(it)}.JAVA_BYTE" }
val java_short: ClassRef = PrimitiveClassRef("short", null, null) { "${valueLayout.simpleName(it)}.JAVA_SHORT" }
val java_int: ClassRef = PrimitiveClassRef("int", null, null) { "${valueLayout.simpleName(it)}.JAVA_INT" }
val java_long: ClassRef = PrimitiveClassRef("long", null, null) { "${valueLayout.simpleName(it)}.JAVA_LONG" }
val java_float: ClassRef = PrimitiveClassRef("float", null, null) { "${valueLayout.simpleName(it)}.JAVA_FLOAT" }
val java_double: ClassRef = PrimitiveClassRef("double", null, null) { "${valueLayout.simpleName(it)}.JAVA_DOUBLE" }

val address: ClassRef = object : ObjectClassRef(
    "java.lang.foreign.MemorySegment",
    null,
    null,
    null,
    memoryLayout = { "${valueLayout.simpleName(it)}.ADDRESS" }
) {
    override val carrier: ClassRef = this

    override fun hashCode(): Int {
        return qualifiedName.hashCode()
    }
}
val string = classRef<String>(address) { "${Unmarshal.simpleName(it)}.STR_LAYOUT" }

// TODO: JDK 22
val arena = classRef("java.lang.foreign.Arena")
val allocator = classRef("java.lang.foreign.SegmentAllocator")
val handle = classRef<MethodHandle>()
val handles = classRef<MethodHandles>()
val linker = classRef("java.lang.foreign.Linker")
val override = classRef<Override>()
val valueLayout = classRef("java.lang.foreign.ValueLayout")

val boolean_array = java_boolean.array()
val char_array = java_char.array()
val byte_array = java_byte.array()
val short_array = java_short.array()
val int_array = java_int.array()
val long_array = java_long.array()
val float_array = java_float.array()
val double_array = java_double.array()
val address_array = address.array()
val string_array = string.array()

// C types
val bool = canonicalType(java_boolean, "bool", "BOOL")
val char = canonicalType(java_byte, "char", "CHAR")
val short = canonicalType(java_short, "short", "SHORT")
val int = canonicalType(java_int, "int", "INT")
val float = canonicalType(java_float, "float", "FLOAT")
val long = canonicalType(java_long, "long", "LONG")
val long_long = canonicalType(java_long, "long long", "LONG_LONG")
val double = canonicalType(java_double, "double", "DOUBLE")
val size_t = canonicalType(java_long, "size_t", "SIZE_T")
val wchar_t = canonicalType(java_short, "wchar_t", "WCHAR_T")

private fun canonicalType(from: ClassRef, type: String, layoutName: String) =
    from c type canonical type layout { """${CanonicalLayouts.simpleName(it)}.$layoutName""" }

val void_pointer = address c "void*" canonical "void*"
val const_char_pointer = string c "const char*"

// objects

val MemoryStack = classRef("io.github.overrun.memstack.MemoryStack")

val Convert = classRef("overrun.marshal.gen.Convert")
val Critical = classRef("overrun.marshal.gen.Critical")
val CType = classRef("overrun.marshal.gen.CType")
val CanonicalType = classRef("overrun.marshal.gen.CanonicalType")
val Entrypoint = classRef("overrun.marshal.gen.Entrypoint")
val Ref = classRef("overrun.marshal.gen.Ref")
val Sized = classRef("overrun.marshal.gen.Sized")
val Skip = classRef("overrun.marshal.gen.Skip")
val StrCharset = classRef("overrun.marshal.gen.StrCharset")

val ProcessorType_BoolConvert = classRef("overrun.marshal.gen.processor.ProcessorType.BoolConvert")

val CanonicalLayouts = classRef("overrun.marshal.CanonicalLayouts")
val DirectAccess = classRef("overrun.marshal.DirectAccess")
val Downcall = classRef("overrun.marshal.Downcall")
val LayoutBuilder = classRef("overrun.marshal.LayoutBuilder")
val Marshal = classRef("overrun.marshal.Marshal")
val Unmarshal = classRef("overrun.marshal.Unmarshal")

val ByValue = classRef("overrun.marshal.struct.ByValue")
val Struct = classRef("overrun.marshal.struct.Struct")
val StructAllocator = classRef("overrun.marshal.struct.StructAllocator")

enum class BoolConvert {
    CHAR,
    BYTE,
    SHORT,
    INT,
    LONG,
    FLOAT,
    DOUBLE,
}
