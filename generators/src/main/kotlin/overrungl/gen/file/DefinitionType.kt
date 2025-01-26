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
 */

package overrungl.gen.file

interface DefTypeMemoryLayout {
    val memoryLayout: String?
    val possibleActualTypes: List<String>?
    fun carrier(actualType: String?): String
    fun asChar(actualType: String?): Char
}

data object DefTypeVoidLayout : DefTypeMemoryLayout {
    override val memoryLayout: String? = null
    override val possibleActualTypes: List<String>? = null

    override fun carrier(actualType: String?): String = "void"
    override fun asChar(actualType: String?): Char = 'V'
}

data class DefTypeValueLayout(override val memoryLayout: String, val carrier: String, val asChar: Char) :
    DefTypeMemoryLayout {
    override val possibleActualTypes: List<String>? = null
    override fun carrier(actualType: String?): String = carrier
    override fun asChar(actualType: String?): Char = asChar
}

data class DefTypeDynamicValueLayout(
    override val memoryLayout: String,
    override val possibleActualTypes: List<String>,
    private val carrierMap: Map<String, String>,
    private val asCharMap: Map<String, Char>
) : DefTypeMemoryLayout {
    override fun carrier(actualType: String?): String = carrierMap[actualType!!]!!
    override fun asChar(actualType: String?): Char = asCharMap[actualType!!]!!
}

data class DefTypeSequenceLayout(val size: Long, val layout: DefTypeMemoryLayout) : DefTypeMemoryLayout {
    override val memoryLayout: String = "MemoryLayout.sequenceLayout(${size}L, ${layout.memoryLayout})"
    override val possibleActualTypes: List<String>? = null
    override fun carrier(actualType: String?): String = throw UnsupportedOperationException()
    override fun asChar(actualType: String?): Char = throw UnsupportedOperationException()
}


interface DefTypeProcessor {
    fun processDowncall(originalValue: String): String
    fun processUpcall(originalValue: String): String
}

data object IdentityProcessor : DefTypeProcessor {
    override fun processDowncall(originalValue: String) = originalValue
    override fun processUpcall(originalValue: String) = originalValue
}

data class SizingProcessor(val memoryLayout: String, val suffix: String) : DefTypeProcessor {
    override fun processDowncall(originalValue: String): String =
        "MemoryUtil.narrowing$suffix($memoryLayout, $originalValue)"

    override fun processUpcall(originalValue: String): String =
        "MemoryUtil.wideningTo$suffix($memoryLayout, $originalValue)"
}


interface DefinitionType {
    val originalName: String
    val javaType: String
    val memoryLayout: DefTypeMemoryLayout
    val processor: DefTypeProcessor

    fun withName(originalName: String): DefinitionType
}

data class DefTypeNamePair(val type: DefinitionType, val name: String, val dimensions: List<Long>) {
    val memoryLayoutWithDimensions: DefTypeMemoryLayout by lazy {
        if (dimensions.isEmpty()) {
            type.memoryLayout
        } else {
            PointerLayout
        }
    }
}

data class GroupTypeMember(val pair: DefTypeNamePair, val bits: Int?)

data class VoidType(override val originalName: String) : DefinitionType {
    override val javaType: String = "void"
    override val memoryLayout: DefTypeMemoryLayout = DefTypeVoidLayout
    override val processor: DefTypeProcessor = IdentityProcessor
    override fun withName(originalName: String): DefinitionType = copy(originalName = originalName)
}

data class ValueType(
    override val originalName: String,
    override val javaType: String,
    override val memoryLayout: DefTypeMemoryLayout
) : DefinitionType {
    override val processor: DefTypeProcessor = IdentityProcessor
    override fun withName(originalName: String): DefinitionType = copy(originalName = originalName)
}

data class DynamicValueType(
    override val originalName: String,
    override val javaType: String,
    override val memoryLayout: DefTypeMemoryLayout,
    override val processor: DefTypeProcessor
) : DefinitionType {
    override fun withName(originalName: String): DefinitionType = copy(originalName = originalName)
}

data class PointerType(
    override val originalName: String,
    val type: DefinitionType
) : DefinitionType {
    override val javaType: String = "MemorySegment"
    override val memoryLayout: DefTypeMemoryLayout
        get() = PointerLayout
    override val processor: DefTypeProcessor = IdentityProcessor
    override fun withName(originalName: String): DefinitionType = copy(originalName = originalName)
}

enum class GroupTypeKind(val typedef: String, val layoutBuilder: String) {
    STRUCT("struct", "LayoutBuilder.struct"),
    UNION("union", "MemoryLayout.unionLayout")
}

data class GroupLayoutType(
    override val originalName: String,
    val name: String,
    val opaque: Boolean,
    val members: List<GroupTypeMember>,
    val kind: GroupTypeKind,
    val packageName: String?
) : DefinitionType {
    override val javaType: String = "MemorySegment"
    override val memoryLayout: DefTypeMemoryLayout
        get() = DefTypeValueLayout(
            memoryLayout = if (opaque) ADDRESS_LAYOUT else "${if (packageName != null) "$packageName." else ""}$name.LAYOUT",
            carrier = "MemorySegment",
            asChar = 'P'
        )
    override val processor: DefTypeProcessor = IdentityProcessor
    override fun withName(originalName: String): DefinitionType = copy(originalName = originalName)
}

data class UpcallType(
    override val originalName: String,
    val name: String,
    val returnType: DefinitionType,
    val parameters: List<DefTypeNamePair>,
    val packageName: String?
) : DefinitionType {
    override val javaType: String = "MemorySegment"
    override val memoryLayout: DefTypeMemoryLayout =
        DefTypeValueLayout(memoryLayout = ADDRESS_LAYOUT, carrier = "MemorySegment", asChar = 'P')
    override val processor: DefTypeProcessor = IdentityProcessor
    override fun withName(originalName: String): DefinitionType = copy(originalName = originalName)
}

data class CustomDefType(
    override val originalName: String,
    override val javaType: String,
    override val memoryLayout: DefTypeMemoryLayout,
    override val processor: DefTypeProcessor
) : DefinitionType {
    override fun withName(originalName: String): DefinitionType = copy(originalName = originalName)
}

data class EnumType(
    val nameValues: List<Pair<String, Int>>,
    override val originalName: String
) : DefinitionType {
    override val javaType: String
        get() = "int"
    override val memoryLayout: DefTypeMemoryLayout
        get() = c_int.memoryLayout
    override val processor: DefTypeProcessor
        get() = c_int.processor

    override fun withName(originalName: String): DefinitionType = copy(originalName = originalName)
}


const val BYTE_LAYOUT = "ValueLayout.JAVA_BYTE"
const val SHORT_LAYOUT = "ValueLayout.JAVA_SHORT"
const val INT_LAYOUT = "ValueLayout.JAVA_INT"
const val LONG_LAYOUT = "ValueLayout.JAVA_LONG"
const val FLOAT_LAYOUT = "ValueLayout.JAVA_FLOAT"
const val DOUBLE_LAYOUT = "ValueLayout.JAVA_DOUBLE"
const val ADDRESS_LAYOUT = "ValueLayout.ADDRESS"
const val C_LONG_LAYOUT = "CanonicalTypes.C_LONG"
const val SIZE_T_LAYOUT = "CanonicalTypes.SIZE_T"
const val WCHAR_T_LAYOUT = "CanonicalTypes.WCHAR_T"

val PointerLayout = DefTypeValueLayout(memoryLayout = ADDRESS_LAYOUT, carrier = "MemorySegment", asChar = 'P')

private val builtinType = mutableMapOf<String, DefinitionType>().also {
    it["void"] = VoidType("void")
}
private val _registeredType = mutableMapOf<String, DefinitionType>()
val registeredType: Map<String, DefinitionType>
    get() = _registeredType

fun registerDefType(name: String, type: DefinitionType) {
    _registeredType[name] = type
}

private fun value(
    originalName: String,
    javaType: String,
    memoryLayout: String,
    memoryLayoutAsChar: Char
): ValueType =
    ValueType(
        originalName,
        javaType,
        DefTypeValueLayout(memoryLayout = memoryLayout, carrier = javaType, asChar = memoryLayoutAsChar)
    ).also { builtinType[originalName] = it }

private fun dynamic(
    originalName: String,
    javaType: String,
    memoryLayout: DefTypeMemoryLayout,
    processor: DefTypeProcessor
): DynamicValueType =
    DynamicValueType(originalName, javaType, memoryLayout, processor).also {
        builtinType[originalName] = it
    }

val c_char = value("char", "byte", BYTE_LAYOUT, 'B')
val c_short = value("short", "short", SHORT_LAYOUT, 'S')
val c_int = value("int", "int", INT_LAYOUT, 'I')
val c_long = dynamic(
    "long",
    "long",
    DefTypeDynamicValueLayout(
        C_LONG_LAYOUT,
        listOf("ValueLayout.OfInt", "ValueLayout.OfLong"),
        mapOf("ValueLayout.OfInt" to "int", "ValueLayout.OfLong" to "long"),
        mapOf("ValueLayout.OfInt" to 'I', "ValueLayout.OfLong" to 'J')
    ),
    SizingProcessor(C_LONG_LAYOUT, "Long")
)
val c_long_long = value("long long", "long", LONG_LAYOUT, 'J')
val c_float = value("float", "float", FLOAT_LAYOUT, 'F')
val c_double = value("double", "double", DOUBLE_LAYOUT, 'D')
val c_signed_char = value("signed char", "byte", BYTE_LAYOUT, 'B')
val c_unsigned_char = value("unsigned char", "byte", BYTE_LAYOUT, 'B')
val c_signed_short = value("signed short", "short", SHORT_LAYOUT, 'S')
val c_unsigned_short = value("unsigned short", "short", SHORT_LAYOUT, 'S')
val c_unsigned_int = value("unsigned int", "int", INT_LAYOUT, 'I')
val c_unsigned_long = dynamic("unsigned long", "long", c_long.memoryLayout, c_long.processor)
val c_signed_long_long = value("signed long long", "long", LONG_LAYOUT, 'J')
val c_unsigned_long_long = value("unsigned long long", "long", LONG_LAYOUT, 'J')
val int8_t = value("int8_t", "byte", BYTE_LAYOUT, 'B')
val int16_t = value("int16_t", "short", SHORT_LAYOUT, 'S')
val int32_t = value("int32_t", "int", INT_LAYOUT, 'I')
val int64_t = value("int64_t", "long", LONG_LAYOUT, 'J')
val uint8_t = value("uint8_t", "byte", BYTE_LAYOUT, 'B')
val uint16_t = value("uint16_t", "short", SHORT_LAYOUT, 'S')
val uint32_t = value("uint32_t", "int", INT_LAYOUT, 'I')
val uint64_t = value("uint64_t", "long", LONG_LAYOUT, 'J')
val size_t = dynamic(
    "size_t",
    "long",
    DefTypeDynamicValueLayout(
        SIZE_T_LAYOUT,
        listOf("ValueLayout.OfInt", "ValueLayout.OfLong"),
        mapOf("ValueLayout.OfInt" to "int", "ValueLayout.OfLong" to "long"),
        mapOf("ValueLayout.OfInt" to 'I', "ValueLayout.OfLong" to 'J')
    ),
    SizingProcessor(SIZE_T_LAYOUT, "Long")
)
val wchar_t = dynamic(
    "wchar_t",
    "int",
    DefTypeDynamicValueLayout(
        WCHAR_T_LAYOUT,
        listOf("ValueLayout.OfChar", "ValueLayout.OfInt"),
        mapOf("ValueLayout.OfInt" to "int", "ValueLayout.OfChar" to "char"),
        mapOf("ValueLayout.OfInt" to 'I', "ValueLayout.OfChar" to 'C')
    ),
    SizingProcessor(WCHAR_T_LAYOUT, "Int")
)
val intptr_t = dynamic(
    "intptr_t",
    "long",
    memoryLayout = size_t.memoryLayout,
    processor = size_t.processor
)
val uintptr_t = dynamic(
    "uintptr_t",
    "long",
    memoryLayout = size_t.memoryLayout,
    processor = size_t.processor
)

fun findBuiltinType(name: String): DefinitionType? {
    return builtinType[name]
}

val int_boolean = CustomDefType(
    "int",
    "boolean",
    c_int.memoryLayout,
    object : DefTypeProcessor {
        override fun processDowncall(originalValue: String): String =
            "(($originalValue) ? 1 : 0)"

        override fun processUpcall(originalValue: String): String {
            return "(($originalValue) != 0)"
        }
    }
)
val char_boolean = CustomDefType(
    "char",
    "boolean",
    c_char.memoryLayout,
    object : DefTypeProcessor {
        override fun processDowncall(originalValue: String): String =
            "(($originalValue) ? (byte)1 : (byte)0)"

        override fun processUpcall(originalValue: String): String {
            return "(($originalValue) != 0)"
        }
    }
)
val unsigned_char_boolean = char_boolean.copy(originalName = "unsigned char")
