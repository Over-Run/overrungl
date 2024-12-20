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

package overrungl.gen.refactor

import com.palantir.javapoet.ArrayTypeName
import com.palantir.javapoet.ClassName
import com.palantir.javapoet.TypeName
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.SegmentAllocator

data class CustomTypeSpecNew(
    val carrier: TypeName,
    val javaType: TypeName,
    val processor: ValueProcessor = IdentityValueProcessor,
    val layout: String?,
    val cType: String? = null
) {
    val array: CustomTypeSpecNew by lazy {
        CustomTypeSpecNew(MemorySegment_, ArrayTypeName.of(javaType), processor, layout, cType)
    }

    infix fun c(cType: String?): CustomTypeSpecNew = copy(cType = cType)

    fun carrierWithC(): String {
        if (cType != null)
            return """@CType("$cType") $carrier"""
        return carrier.toString()
    }

    fun javaTypeWithC(): String {
        if (cType != null)
            return """@CType("$cType") $javaType"""
        return javaType.toString()
    }
}

val Arena_: ClassName = ClassName.get(Arena::class.java)
val MemorySegment_: ClassName = ClassName.get(MemorySegment::class.java)
val SegmentAllocator_: ClassName = ClassName.get(SegmentAllocator::class.java)
val String_: ClassName = ClassName.get(String::class.java)

val Marshal: ClassName = ClassName.get("overrungl.util", "Marshal")
val Unmarshal: ClassName = ClassName.get("overrungl.util", "Unmarshal")

private fun javaPrimitive(typeName: TypeName, layoutName: String): CustomTypeSpecNew =
    CustomTypeSpecNew(typeName, typeName, layout = "ValueLayout.$layoutName")

val arena = CustomTypeSpecNew(Arena_, Arena_, layout = null)
val allocator = CustomTypeSpecNew(SegmentAllocator_, SegmentAllocator_, layout = null)

val jboolean = javaPrimitive(TypeName.BOOLEAN, "JAVA_BOOLEAN")
val jchar = javaPrimitive(TypeName.CHAR, "JAVA_CHAR")
val jbyte = javaPrimitive(TypeName.BYTE, "JAVA_BYTE")
val jshort = javaPrimitive(TypeName.SHORT, "JAVA_SHORT")
val jint = javaPrimitive(TypeName.INT, "JAVA_INT")
val jlong = javaPrimitive(TypeName.LONG, "JAVA_LONG")
val jfloat = javaPrimitive(TypeName.FLOAT, "JAVA_FLOAT")
val jdouble = javaPrimitive(TypeName.DOUBLE, "JAVA_DOUBLE")
val void = CustomTypeSpecNew(TypeName.VOID, TypeName.VOID, layout = "No layout for void")

val address = javaPrimitive(MemorySegment_, "ADDRESS")
val string_u8 =
    CustomTypeSpecNew(MemorySegment_, String_, processor = StringU8ValueProcessor, layout = "Unmarshal.STR_LAYOUT")

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

val const_char_ptr = string_u8 c "const char*"
