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
import com.palantir.javapoet.CodeBlock
import com.palantir.javapoet.TypeName
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import kotlin.reflect.KProperty

data class CustomTypeSpec(
    val carrier: TypeName,
    val cType: String? = null,
    val layout: CodeBlock
) {
    val array: CustomTypeSpec
        get() = copy(carrier = ArrayTypeName.of(carrier))

    infix fun c(cType: String?): CustomTypeSpec = copy(cType = cType)
    infix fun c(cType: CustomTypeSpec): CustomTypeSpec = copy(cType = cType.cType)

    operator fun getValue(thisRef: Any?, property: KProperty<*>): CustomTypeSpec = copy(cType = property.name)
}

val MemorySegment_: ClassName = ClassName.get(MemorySegment::class.java)

val CType = ClassName.get("overrun.marshal.gen", "CType")
val Entrypoint = ClassName.get("overrun.marshal.gen", "Entrypoint")
val Ref = ClassName.get("overrun.marshal.gen", "Ref")
val Struct = ClassName.get("overrun.marshal.struct", "Struct")
val Unmarshal = ClassName.get("overrun.marshal", "Unmarshal")

private fun javaPrimitive(carrier: TypeName, layoutName: String): CustomTypeSpec =
    CustomTypeSpec(carrier, layout = CodeBlock.of("\$T.\$L", ValueLayout::class.java, layoutName))

val jbyte = javaPrimitive(TypeName.BYTE, "JAVA_BYTE")
val jshort = javaPrimitive(TypeName.SHORT, "JAVA_SHORT")
val jint = javaPrimitive(TypeName.INT, "JAVA_INT")
val jlong = javaPrimitive(TypeName.LONG, "JAVA_LONG")
val jfloat = javaPrimitive(TypeName.FLOAT, "JAVA_FLOAT")
val jdouble = javaPrimitive(TypeName.DOUBLE, "JAVA_DOUBLE")
val void = CustomTypeSpec(TypeName.VOID, layout = CodeBlock.of(""))

val address = javaPrimitive(MemorySegment_, "ADDRESS")
val string = CustomTypeSpec(MemorySegment_, null, CodeBlock.of("\$T.STR_LAYOUT", Unmarshal))

val char = jbyte c "char"
val short = jshort c "short"
val int = jint c "int"
val float = jfloat c "float"
val double = jdouble c "double"
val size_t = jlong c "size_t"
