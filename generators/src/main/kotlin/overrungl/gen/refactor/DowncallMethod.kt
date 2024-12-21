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

import com.palantir.javapoet.TypeName

enum class AllocatorRequirement {
    NO,
    STACK,
    SEGMENT_ALLOCATOR,
    ARENA;

    fun stricter(other: AllocatorRequirement): AllocatorRequirement {
        return if (other > this) other else this
    }
}

data class DowncallMethod(
    val returnType: CustomTypeSpecNew,
    val name: String,
    val parameters: List<DowncallParameter>,
    val entrypoint: String?,
    val javadoc: String?,
    val code: String?,
    val overload: Boolean
) {
    val allocatorRequirement: AllocatorRequirement by lazy {
        parameters.map { p ->
            if (p.ref) p.type.allocatorRequirement.stricter(AllocatorRequirement.STACK)
            else p.type.allocatorRequirement
        }.reduceOrNull(AllocatorRequirement::stricter) ?: AllocatorRequirement.NO
    }

    fun overload(
        name: String = this.name,
        parameters: List<DowncallParameter> = this.parameters
    ): DowncallMethod = copy(name = name, parameters = parameters, overload = true)

    fun functionDescriptor(): String {
        val sb = StringBuilder()
        sb.append("FunctionDescriptor.of")
        if (returnType.carrier == TypeName.VOID) {
            sb.append("Void")
        }
        sb.append("(")
        if (returnType.carrier != TypeName.VOID) {
            sb.append(returnType.layout)
            if (parameters.isNotEmpty()) {
                sb.append(", ")
            }
        }
        sb.append(parameters.filter { it.type.layout != null }.joinToString { it.type.layout!! })
        sb.append(")")
        return sb.toString()
    }
}

data class DowncallParameter(
    val type: CustomTypeSpecNew,
    val name: String,
    val javadoc: String?,
    val ref: Boolean = false
) {
    fun ref(): DowncallParameter = copy(ref = true)

    fun marshalRef(overload: Boolean): Boolean = ref && type.selectTypeName(overload) != MemorySegment_

    fun toString(typeName: TypeName): String {
        return buildString {
            if (ref) {
                append("@Out ")
            }
            append(type.typeNameWithC(typeName))
            append(" ")
            append(name)
        }
    }
}
