/*
 * MIT License
 *
 * Copyright (c) 2025 Overrun Organization
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

package overrungl.gen.file

internal class Interpreter {
    val macros = mutableMapOf<String, Expression>()
    val using = mutableMapOf<String, DefinitionType>()
    val structs = mutableMapOf<String, GroupLayoutType>()
    val upcalls = mutableMapOf<String, UpcallType>()
    val enums = LinkedHashMap<String, Int>()
    val functions = mutableMapOf<String, DefinitionFunction>()

    fun interpret(statements: List<Statement>) {
        statements.forEach { execute(it) }
    }

    private fun execute(statement: Statement) {
        when (statement) {
            is DefinePreprocessor -> macros[statement.name.lexeme] = statement.value
            is UsingStatement -> using[statement.name.lexeme] = evaluate(statement.oldType) as DefinitionType
            is FunctionDeclaration -> functions[statement.entrypoint] = DefinitionFunction(
                evaluate(statement.returnType) as DefinitionType,
                statement.name.lexeme,
                statement.parameters.map(::convertTypeNamePair),
                statement.optional,
                statement.entrypoint,
                statement.body?.joinToString(separator = "\n", transform = ::stringifyStatement)
            )

            is EnumDeclaration -> evaluate(statement.enumExpression)

            is ExpressionStatement -> evaluate(statement.expression)

            is ReturnStatement -> {}
        }
    }

    private fun stringifyStatement(statement: Statement): String {
        return when (statement) {
            is ReturnStatement -> "return ${stringify(statement.value)};"
            else -> error(statement)
        }
    }

    fun stringify(expression: Expression): String {
        return when (expression) {
            is IntegerExpression -> expression.lexeme
            is FloatingPointExpression -> expression.lexeme
            is ParenthesisExpression -> "(${stringify(expression.expression)})"
            is UnaryExpression -> "${expression.operator.lexeme}${stringify(expression.right)}"
            is BinaryExpression -> "${stringify(expression.left)} ${expression.operator.lexeme} ${stringify(expression.right)}"
            is ReferenceExpression -> expression.name
            is ConstExpression -> "const"
            is PointerExpression -> "*"
            is TypeReferenceExpression -> expression.name
            is TypeExpression -> definitionType(expression.components).originalName
            is StructExpression -> expression.name.lexeme
            is UpcallExpression -> "${stringify(expression.type)} (*${expression.name.lexeme})(${
                expression.parameters.joinToString { p ->
                    "${stringify(p.type)} ${p.name.lexeme}"
                }
            })"

            is JavaTypeExpression -> registeredType[expression.name.lexeme]?.originalName
                ?: error("unknown type at ${expression.name}")

            is FunctionCallExpression -> "${stringify(expression.callee)}(${
                expression.arguments.joinToString { stringify(it) }
            })"

            else -> error(expression.toString())
        }
    }

    fun inferenceType(expression: Expression): String {
        return when (expression) {
            is IntegerExpression -> "int" // TODO long
            is FloatingPointExpression -> "double" // TODO float
            is ParenthesisExpression -> inferenceType(expression.expression)
            is UnaryExpression -> inferenceType(expression.right)
            is BinaryExpression -> inferenceType(expression.left)
            is ReferenceExpression -> {
                val macro = macros[expression.name]
                if (macro != null) {
                    return inferenceType(macro)
                }
                if (enums.keys.any { it == expression.name }) {
                    return "int"
                }
                error("symbol not found: ${expression.name}")
            }

            else -> error(expression)
        }
    }

    private fun evaluate(expression: Expression): Any {
        return when (expression) {
            is TypeExpression -> definitionType(expression.components)
            is IntegerExpression -> {
                if (expression.radix == 16) return expression.lexeme.substring(2).toInt(16)
                else expression.lexeme.toInt(expression.radix)
            }

            is ReferenceExpression -> {
                val macro = macros[expression.name]
                if (macro != null) {
                    return evaluate(macro)
                }
                if (enums.containsKey(expression.name)) {
                    return enums[expression.name]!!
                }
                error("symbol not found: ${expression.name}")
            }

            is EnumExpression -> {
                val nameValues = mutableListOf<Pair<String, Int>>()
                var currentValue = 0
                expression.nameValues.map { (k, v) ->
                    if (v == null) {
                        nameValues.add(k to currentValue)
                        enums[k] = currentValue
                        currentValue++
                    } else {
                        val i = evaluate(v) as Int
                        nameValues.add(k to i)
                        enums[k] = i
                        currentValue = i + 1
                    }
                }
                val enumType = EnumType(nameValues)
                return enumType
            }

            else -> error(expression)
        }
    }

    private fun definitionType(typeComponents: List<Expression>): DefinitionType {
        var previous: Expression? = null
        val originalNameComp = StringBuilder()
        var type: DefinitionType? = null
        typeComponents.forEach { expression ->
            when (expression) {
                ConstExpression -> {
                    val stringify = stringify(expression)
                    when (previous) {
                        null -> {}
                        ConstExpression,
                        PointerExpression,
                        is TypeReferenceExpression,
                        is StructExpression,
                        is UpcallExpression -> originalNameComp.append(" ")

                        else -> error(previous.toString())
                    }
                    originalNameComp.append(stringify)
                }

                PointerExpression -> {
                    val stringify = stringify(expression)
                    when (previous) {
                        null,
                        PointerExpression,
                        is TypeReferenceExpression -> {
                        }

                        ConstExpression,
                        is StructExpression -> originalNameComp.append(" ")

                        else -> error(previous.toString())
                    }
                    originalNameComp.append(stringify)
                    type = PointerType(originalNameComp.toString(), type!!)
                }

                is TypeReferenceExpression -> {
                    val stringify = stringify(expression)
                    when (previous) {
                        null -> {}
                        ConstExpression -> originalNameComp.append(" ")
                        else -> error(previous.toString())
                    }
                    originalNameComp.append(stringify)
                    type = using.getOrElse(expression.name) { findBuiltinType(expression.name) }
                        ?: error("unknown type ${expression.name} at ${expression.token}")
                }

                is StructExpression -> {
                    val stringify = stringify(expression)
                    when (previous) {
                        null -> {}
                        ConstExpression -> originalNameComp.append(" ")
                        else -> error(previous.toString())
                    }
                    originalNameComp.append(stringify)
                    val t = GroupLayoutType(
                        stringify,
                        expression.opaque,
                        expression.members.map(::convertTypeNamePair),
                        GroupTypeKind.STRUCT
                    )
                    type = t
                    structs[stringify] = t
                }

                is UpcallExpression -> {
                    val stringify = stringify(expression)
                    when (previous) {
                        null -> {}
                        ConstExpression -> originalNameComp.append(" ")
                        else -> error(previous.toString())
                    }
                    originalNameComp.append(stringify)
                    val upcallType = UpcallType(
                        stringify,
                        expression.name.lexeme,
                        evaluate(expression.type) as DefinitionType,
                        expression.parameters.map(::convertTypeNamePair)
                    )
                    type = upcallType
                    upcalls[stringify] = upcallType
                }

                is JavaTypeExpression -> type =
                    registeredType[expression.name.lexeme] ?: error("unknown type at ${expression.name}")

                is EnumExpression -> type = evaluate(expression) as DefinitionType

                else -> error(expression)
            }
            previous = expression
        }
        return type!!
    }

    private fun convertTypeNamePair(pair: TypeNamePair): DefTypeNamePair =
        DefTypeNamePair(
            evaluate(pair.type) as DefinitionType,
            pair.name.lexeme,
            pair.dimensions
        )
}
