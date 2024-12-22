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

import com.palantir.javapoet.ArrayTypeName
import com.palantir.javapoet.ClassName
import com.palantir.javapoet.TypeName
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.SegmentAllocator

data class CustomTypeSpec(
    val carrier: TypeName,
    val javaType: TypeName,
    val processor: ValueProcessor = IdentityValueProcessor,
    val layout: String?,
    val cType: String? = null,
    val allocatorRequirement: AllocatorRequirement = AllocatorRequirement.NO
) {
    val array: CustomTypeSpec by lazy {
        CustomTypeSpec(
            MemorySegment_,
            ArrayTypeName.of(javaType),
            processor,
            layout,
            cType,
            AllocatorRequirement.STACK
        )
    }

    infix fun c(cType: String?): CustomTypeSpec = copy(cType = cType)

    fun typeNameWithC(typeName: TypeName): String =
        if (cType != null) """@CType("$cType") $typeName""" else typeName.toString()

    fun selectTypeName(overload: Boolean): TypeName =
        if (overload) javaType else carrier

    fun carrierWithC(): String = typeNameWithC(carrier)
    fun javaTypeWithC(): String = typeNameWithC(javaType)
}

val Arena_: ClassName = ClassName.get(Arena::class.java)
val MemorySegment_: ClassName = ClassName.get(MemorySegment::class.java)
val SegmentAllocator_: ClassName = ClassName.get(SegmentAllocator::class.java)
val String_: ClassName = ClassName.get(String::class.java)

private fun javaPrimitive(typeName: TypeName, layoutName: String): CustomTypeSpec =
    CustomTypeSpec(typeName, typeName, layout = "ValueLayout.$layoutName")

val arena = CustomTypeSpec(Arena_, Arena_, layout = null)
val allocator = CustomTypeSpec(SegmentAllocator_, SegmentAllocator_, layout = null)

val jboolean = javaPrimitive(TypeName.BOOLEAN, "JAVA_BOOLEAN")
val jchar = javaPrimitive(TypeName.CHAR, "JAVA_CHAR")
val jbyte = javaPrimitive(TypeName.BYTE, "JAVA_BYTE")
val jshort = javaPrimitive(TypeName.SHORT, "JAVA_SHORT")
val jint = javaPrimitive(TypeName.INT, "JAVA_INT")
val jlong = javaPrimitive(TypeName.LONG, "JAVA_LONG")
val jfloat = javaPrimitive(TypeName.FLOAT, "JAVA_FLOAT")
val jdouble = javaPrimitive(TypeName.DOUBLE, "JAVA_DOUBLE")
val void = CustomTypeSpec(TypeName.VOID, TypeName.VOID, layout = "No layout for void")

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

val const_char_ptr = string_u8 c "const char*"
val const_void_ptr = address c "const void*"

val char_ptr = string_u8 c "char*"
val int_ptr = jint_array c "int*"
val float_ptr = jfloat_array c "float*"
