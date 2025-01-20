/*
 * MIT License
 *
 * Copyright (c) 2024-2025 Overrun Organization
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

data class CustomTypeSpec(
    val carrier: String,
    val javaType: String,
    val processor: ValueProcessor = IdentityValueProcessor,
    val layout: String?,
    val cType: String? = null,
    val allocatorRequirement: AllocatorRequirement = AllocatorRequirement.NO
) {
    val array: CustomTypeSpec by lazy {
        CustomTypeSpec(
            MemorySegment_,
            "$javaType[]",
            processor,
            layout,
            cType,
            AllocatorRequirement.STACK
        )
    }

    infix fun c(cType: String?): CustomTypeSpec = copy(cType = cType)

    fun typeNameWithC(typeName: String): String =
        if (cType != null) """@CType("$cType") $typeName""" else typeName.toString()

    fun selectTypeName(overload: Boolean): String =
        if (overload) javaType else carrier

    fun carrierWithC(): String = typeNameWithC(carrier)
    fun javaTypeWithC(): String = typeNameWithC(javaType)
}

const val Arena_: String = "Arena"
const val MemorySegment_: String = "MemorySegment"
const val SegmentAllocator_: String = "SegmentAllocator"
const val String_: String = "String"

private fun javaPrimitive(typeName: String, layoutName: String): CustomTypeSpec =
    CustomTypeSpec(typeName, typeName, layout = "ValueLayout.$layoutName")

val arena = CustomTypeSpec(Arena_, Arena_, layout = null)
val allocator = CustomTypeSpec(SegmentAllocator_, SegmentAllocator_, layout = null)

val jboolean = javaPrimitive("boolean", "JAVA_BOOLEAN")
val jchar = javaPrimitive("char", "JAVA_CHAR")
val jbyte = javaPrimitive("byte", "JAVA_BYTE")
val jshort = javaPrimitive("short", "JAVA_SHORT")
val jint = javaPrimitive("int", "JAVA_INT")
val jlong = javaPrimitive("long", "JAVA_LONG")
val jfloat = javaPrimitive("float", "JAVA_FLOAT")
val jdouble = javaPrimitive("double", "JAVA_DOUBLE")
val void = CustomTypeSpec("void", "void", layout = "No layout for void")

val address = javaPrimitive(MemorySegment_, "ADDRESS")
val string_u8 = CustomTypeSpec(
    carrier = MemorySegment_,
    javaType = String_,
    processor = StringU8ValueProcessor,
    layout = "Unmarshal.STR_LAYOUT",
    allocatorRequirement = AllocatorRequirement.STACK
)

val jchar_array = jchar.array.copy(processor = ArrayValueProcessor("Char"), layout = address.layout)
val jbyte_array = jbyte.array.copy(processor = ArrayValueProcessor("Byte"), layout = address.layout)
val jshort_array = jshort.array.copy(processor = ArrayValueProcessor("Short"), layout = address.layout)
val jint_array = jint.array.copy(processor = ArrayValueProcessor("Int"), layout = address.layout)
val jlong_array = jlong.array.copy(processor = ArrayValueProcessor("Long"), layout = address.layout)
val jfloat_array = jfloat.array.copy(processor = ArrayValueProcessor("Float"), layout = address.layout)
val jdouble_array = jdouble.array.copy(processor = ArrayValueProcessor("Double"), layout = address.layout)
val string_u8_array = string_u8.array.copy(processor = ArrayValueProcessor("String"), layout = address.layout)

val bool = jboolean c "bool"
val char = jbyte c "char"
val short = jshort c "short"
val int = jint c "int"
val long = jlong c "long"
val long_long = jlong c "long long"
val float = jfloat c "float"
val double = jdouble c "double"
val void_ptr = address c "void*"
val size_t = jlong c "size_t"
val wchar_t = jint c "wchar_t"

val uchar = jbyte c "unsigned char"
val ushort = jshort c "unsigned short"
val uint = jint c "unsigned int"
val ulong = jlong c "unsigned long"
val ulong_long = jlong c "unsigned long long"
val ufloat = jfloat c "unsigned float"
val udouble = jdouble c "unsigned double"

val uint32_t = jint c "uint32_t"
val uint64_t = jlong c "uint64_t"

val const_char_ptr = string_u8 c "const char*"
val const_void_ptr = address c "const void*"

val short_ptr = jshort_array c "short*"
val int_ptr = jint_array c "int*"
val float_ptr = jfloat_array c "float*"
val double_ptr = jdouble_array c "double*"

val void_ptr_ptr = address c "void**"
