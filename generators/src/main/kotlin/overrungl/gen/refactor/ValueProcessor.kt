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

import com.palantir.javapoet.CodeBlock

data class ProcessorContext(
    val allocatorName: String?
)

interface ValueProcessor {
    fun marshal(context: ProcessorContext, builder: CodeBlock.Builder, action: (CodeBlock.Builder) -> Unit)
    fun unmarshal(context: ProcessorContext, builder: CodeBlock.Builder, action: (CodeBlock.Builder) -> Unit)
}

object IdentityValueProcessor : ValueProcessor {
    override fun marshal(context: ProcessorContext, builder: CodeBlock.Builder, action: (CodeBlock.Builder) -> Unit) =
        action(builder)

    override fun unmarshal(context: ProcessorContext, builder: CodeBlock.Builder, action: (CodeBlock.Builder) -> Unit) =
        action(builder)
}

object StringU8ValueProcessor : ValueProcessor {
    override fun marshal(context: ProcessorContext, builder: CodeBlock.Builder, action: (CodeBlock.Builder) -> Unit) {
        builder.add("$1T.marshal($2L, ", Marshal, context.allocatorName)
        action(builder)
        builder.add(")")
    }

    override fun unmarshal(context: ProcessorContext, builder: CodeBlock.Builder, action: (CodeBlock.Builder) -> Unit) {
        builder.add("$1T.unmarshalAsString(", Unmarshal)
        action(builder)
        builder.add(")")
    }
}
