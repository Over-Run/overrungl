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

data class ProcessorContext(
    val allocatorName: String?,
    val builder: StringBuilder,
    val action: (StringBuilder) -> Unit
)

interface ValueProcessor {
    fun marshal(context: ProcessorContext)
    fun unmarshal(context: ProcessorContext)
    fun copy(context: ProcessorContext)
}

object IdentityValueProcessor : ValueProcessor {
    override fun marshal(context: ProcessorContext) = context.action(context.builder)
    override fun unmarshal(context: ProcessorContext) = context.action(context.builder)
    override fun copy(context: ProcessorContext) = context.action(context.builder)
}

class StructProcessor(private val typeName: String) : ValueProcessor {
    override fun marshal(context: ProcessorContext) {
        val builder = context.builder
        builder.append("Marshal.marshal(")
        context.action(builder)
        builder.append(")")
    }

    override fun unmarshal(context: ProcessorContext) {
        val builder = context.builder
        builder.append("$typeName.of(")
        context.action(builder)
        builder.append(")")
    }

    override fun copy(context: ProcessorContext) {
        TODO("Not yet implemented: copy $typeName")
    }
}
