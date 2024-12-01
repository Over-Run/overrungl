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

import com.palantir.javapoet.ClassName
import com.palantir.javapoet.CodeBlock
import com.palantir.javapoet.TypeName
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import kotlin.reflect.KProperty

data class CustomTypeSpec(
    val carrier: TypeName,
    val cType: String? = null,
    val canonicalType: String? = null,
    val layout: CodeBlock
) {
    infix fun c(cType: String?): CustomTypeSpec = copy(cType = cType)

    operator fun getValue(thisRef: Any?, property: KProperty<*>): CustomTypeSpec = copy(cType = property.name)
}

val MemorySegment_: ClassName = ClassName.get(MemorySegment::class.java)

val CanonicalLayouts = ClassName.get("overrun.marshal", "CanonicalLayouts")
val CanonicalType = ClassName.get("overrun.marshal.gen", "CanonicalType")
val CType = ClassName.get("overrun.marshal.gen", "CType")
val DirectAccess = ClassName.get("overrun.marshal", "DirectAccess")
val Entrypoint = ClassName.get("overrun.marshal.gen", "Entrypoint")
val LayoutBuilder = ClassName.get("overrun.marshal", "LayoutBuilder")
val Marshal = ClassName.get("overrun.marshal", "Marshal")
val ProcessorTypes = ClassName.get("overrun.marshal.gen.processor", "ProcessorTypes")
val Skip = ClassName.get("overrun.marshal.gen", "Skip")
val Struct = ClassName.get("overrun.marshal.struct", "Struct")
val StructAllocator = ClassName.get("overrun.marshal.struct", "StructAllocator")
val Unmarshal = ClassName.get("overrun.marshal", "Unmarshal")

private fun cPrimitive(carrier: TypeName, name: String, layoutName: String): CustomTypeSpec =
    CustomTypeSpec(carrier, name, name, CodeBlock.of("\$T.\$L", CanonicalLayouts, layoutName))

private fun javaPrimitive(carrier: TypeName, layoutName: String): CustomTypeSpec =
    CustomTypeSpec(carrier, layout = CodeBlock.of("\$T.\$L", ValueLayout::class.java, layoutName))

val bool = cPrimitive(TypeName.BOOLEAN, "bool", "BOOL")
val char = cPrimitive(TypeName.BYTE, "char", "CHAR")
val short = cPrimitive(TypeName.SHORT, "short", "SHORT")
val int = cPrimitive(TypeName.INT, "int", "INT")
val long = cPrimitive(TypeName.LONG, "long", "LONG")
val long_long = cPrimitive(TypeName.LONG, "long long", "LONG_LONG")
val float = cPrimitive(TypeName.FLOAT, "float", "FLOAT")
val double = cPrimitive(TypeName.DOUBLE, "double", "DOUBLE")
val void_ptr = cPrimitive(MemorySegment_, "void*", "VOID_POINTER")
val size_t = cPrimitive(TypeName.LONG, "size_t", "SIZE_T")
val wchar_t = cPrimitive(TypeName.CHAR, "wchar_t", "WCHART_T")

val jboolean = javaPrimitive(TypeName.BOOLEAN, "JAVA_BOOLEAN")
val jchar = javaPrimitive(TypeName.CHAR, "JAVA_CHAR")
val jbyte = javaPrimitive(TypeName.BYTE, "JAVA_BYTE")
val jshort = javaPrimitive(TypeName.SHORT, "JAVA_SHORT")
val jint = javaPrimitive(TypeName.INT, "JAVA_INT")
val jlong = javaPrimitive(TypeName.LONG, "JAVA_LONG")
val jfloat = javaPrimitive(TypeName.FLOAT, "JAVA_FLOAT")
val jdouble = javaPrimitive(TypeName.DOUBLE, "JAVA_DOUBLE")
val void = CustomTypeSpec(TypeName.VOID, layout = CodeBlock.of(""))

val address = javaPrimitive(MemorySegment_, "ADDRESS")
val string = CustomTypeSpec(MemorySegment_, null, null, CodeBlock.of("\$T.STR_LAYOUT", Unmarshal))

val const_char_ptr = string c "const char*"
