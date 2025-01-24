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
    infix fun c(cType: String?): CustomTypeSpec = copy(cType = cType)

    fun typeNameWithC(typeName: String): String =
        if (cType != null) """@CType("$cType") $typeName""" else typeName.toString()

    fun carrierWithC(): String = typeNameWithC(carrier)
    fun javaTypeWithC(): String = typeNameWithC(javaType)
}

const val MemorySegment_: String = "MemorySegment"
