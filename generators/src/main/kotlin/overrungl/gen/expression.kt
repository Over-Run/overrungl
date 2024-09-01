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

interface Expression {
    fun append(builder: StringBuilder)
}

data class LiteralExpr(val value: String) : Expression {
    override fun append(builder: StringBuilder) {
        builder.append(value)
    }
}

data class FieldAccessExpr(val expression: Expression, val field: String) : Expression {
    constructor(type: Type, field: String) : this(LiteralExpr(type.javaName), field)

    override fun append(builder: StringBuilder) {
        expression.append(builder)
        builder.append(".$field")
    }
}

data class MethodInvokeExpr(
    val expression: Expression,
    val method: String,
    val arguments: List<Expression>? = null
) : Expression {
    override fun append(builder: StringBuilder) {
        expression.append(builder)
        builder.append(".$method(")
        if (arguments != null) {
            for (i in arguments.indices) {
                if (i > 0) {
                    builder.append(", ")
                }
                arguments[i].append(builder)
            }
        }
        builder.append(")")
    }
}
