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

object StringU8ValueProcessor : ValueProcessor {
    override fun marshal(context: ProcessorContext) {
        val builder = context.builder
        val action = context.action
        builder.append("Marshal.marshal(${context.allocatorName}, ")
        action(builder)
        builder.append(")")
    }

    override fun unmarshal(context: ProcessorContext) {
        val builder = context.builder
        val action = context.action
        builder.append("Unmarshal.unmarshalAsString(")
        action(builder)
        builder.append(")")
    }

    override fun copy(context: ProcessorContext) = IdentityValueProcessor.copy(context)
}

class ArrayValueProcessor(private val asType: String) : ValueProcessor {
    override fun marshal(context: ProcessorContext) {
        val builder = context.builder
        val action = context.action
        builder.append("Marshal.marshal(${context.allocatorName}, ")
        action(builder)
        builder.append(")")
    }

    override fun unmarshal(context: ProcessorContext) {
        val builder = context.builder
        val action = context.action
        builder.append("Unmarshal.unmarshalAs${asType}Array(")
        action(builder)
        builder.append(")")
    }

    override fun copy(context: ProcessorContext) {
        val builder = context.builder
        val action = context.action
        builder.append("Unmarshal.copy(")
        action(builder)
        builder.append(")")
    }
}
