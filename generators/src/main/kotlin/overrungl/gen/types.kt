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

import java.lang.foreign.ValueLayout
import kotlin.reflect.KClass
import kotlin.reflect.KProperty

sealed interface Type {
    val originalName: String
    val javaName: String
    val memoryLayout: Expression?

    fun appendType(builder: StringBuilder)
}

data class DowncallType(
    override val originalName: String,
    override val javaName: String,
    override val memoryLayout: Expression?,
    val overloadName: String? = null
) : Type {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): DowncallType =
        DowncallType(originalName = property.name, javaName = javaName, memoryLayout = memoryLayout)

    fun nativeType(originalName: String): DowncallType =
        DowncallType(originalName = originalName, javaName = javaName, memoryLayout = memoryLayout)

    override fun appendType(builder: StringBuilder) {
        if (originalName != javaName) {
            builder.append("""@NativeType("$originalName") $javaName""")
        } else {
            builder.append(javaName)
        }
    }
}

fun type(name: String): DowncallType = DowncallType(originalName = name, javaName = name, memoryLayout = null)
fun type(clazz: KClass<*>): DowncallType = type(clazz.simpleName!!)

// Java
val ValueLayout_ = type(ValueLayout::class)

// Marshal
val Struct_ = type("Struct")
val Unmarshal_ = type("Unmarshal")

// OverrunGL
val PlatformLayouts_ = type("PlatformLayouts")

val boolean by Primitive("JAVA_BOOLEAN")
val char by Primitive("JAVA_CHAR")
val byte by Primitive("JAVA_BYTE")
val short by Primitive("JAVA_SHORT")
val int by Primitive("JAVA_INT")
val long by Primitive("JAVA_LONG")
val float by Primitive("JAVA_FLOAT")
val double by Primitive("JAVA_DOUBLE")
val address = DowncallType(
    "MemorySegment",
    "MemorySegment",
    FieldAccessExpr(ValueLayout_, "ADDRESS")
)

val string = DowncallType(
    originalName = "String",
    javaName = "MemorySegment",
    memoryLayout = FieldAccessExpr(Unmarshal_, "STR_LAYOUT"),
    overloadName = "String"
)

val size_t = DowncallType(
    originalName = "size_t",
    javaName = "long",
    memoryLayout = FieldAccessExpr(PlatformLayouts_, "SIZE_T")
)

val void_pointer = DowncallType(
    originalName = "void*",
    javaName = address.javaName,
    memoryLayout = address.memoryLayout
)

private class Primitive(val layout: String) {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): DowncallType =
        DowncallType(
            originalName = property.name,
            javaName = property.name,
            memoryLayout = FieldAccessExpr(ValueLayout_, layout)
        )
}
