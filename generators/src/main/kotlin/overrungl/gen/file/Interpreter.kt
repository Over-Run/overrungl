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

data class DefineMacro(val type: String, val name: String, val value: String)
data class UndeterminedType(val type: DefinitionType, val complete: Boolean)

class Interpreter {
    internal val macros = mutableMapOf<String, DefineMacro>()
    internal val using = mutableMapOf<String, UndeterminedType>()
    internal val structs = mutableMapOf<String, GroupLayoutType>()
    internal val upcalls = mutableMapOf<String, UpcallType>()
    internal val enums = LinkedHashMap<String, Int>()
    internal val functions = mutableMapOf<String, DefinitionFunction>()

    fun macros(): Map<String, DefineMacro> = macros
    fun enums(): Map<String, Int> = enums
    fun functions(): Map<String, DefinitionFunction> = functions

    internal fun interpret(statements: List<Statement>) {
        // scan twice
        statements.forEach { execute(it, true) }
        statements.forEach { execute(it, false) }
    }

    private fun import(interpreter: Interpreter) {
        using.putAll(interpreter.using)
    }

    private fun execute(statement: Statement, typeSkipUnknownType: Boolean) {
        when (statement) {
            is DefinePreprocessor -> macros[statement.name] = DefineMacro(
                inferenceType(statement.value),
                statement.name,
                statement.value
            )

            is DefineAsPreprocessor -> macros[statement.name] =
                DefineMacro(statement.type, statement.name, statement.value)

            is UsingStatement -> using[statement.name.lexeme] =
                evaluate(statement.oldType, typeSkipUnknownType = typeSkipUnknownType) as UndeterminedType

            is FunctionDeclaration -> functions[statement.entrypoint] = DefinitionFunction(
                (evaluate(statement.returnType, typeSkipUnknownType = typeSkipUnknownType) as UndeterminedType).type,
                statement.name.lexeme,
                statement.parameters.map {
                    val pair = convertTypeNamePair(it, skipUnknownType = false)
                    pair.first
                },
                statement.optional,
                statement.entrypoint,
                statement.body?.joinToString(separator = "\n")
            )

            is EnumDeclaration -> evaluate(statement.enumExpression, typeSkipUnknownType = typeSkipUnknownType)

            is ExpressionStatement -> evaluate(statement.expression, typeSkipUnknownType = typeSkipUnknownType)

            is ImportStatement -> import(DefinitionFile(statement.filename).interpreter)
        }
    }

    private fun inferenceType(value: String): String {
        val tokenize = Lexer(value).tokenize()
        var current = 0
        if (tokenize[current].type == TokenType.LEFT_PARENTHESIS) current++
        if (tokenize[current].type == TokenType.MINUS
            || tokenize[current].type == TokenType.TILDE
        ) current++
        return inferenceType(tokenize[current])
    }

    private fun inferenceType(token: Token): String {
        return when (token.type) {
            TokenType.INTEGER ->
                if (token.lexeme.endsWith("L", ignoreCase = true)) "long"
                else "int"

            TokenType.FLOATING_POINT ->
                if (token.lexeme.endsWith("F", ignoreCase = true)) "float"
                else "double"

            TokenType.STRING -> "String"

            else -> "int"
        }
    }

    private fun evaluate(expression: Expression, typeSkipUnknownType: Boolean = false): Any {
        return when (expression) {
            is TypeExpression -> definitionType(expression.components, skipUnknownType = typeSkipUnknownType)
            is LiteralExpression -> expression.literal

            is ReferenceExpression -> {
                if (macros.containsKey(expression.name)) {
                    return macros[expression.name]!!
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
                val enumType = EnumType(nameValues, "int")
                return enumType
            }

            else -> error(expression)
        }
    }

    private fun definitionType(typeComponents: List<Expression>, skipUnknownType: Boolean = false): UndeterminedType {
        var previous: Expression? = null
        val originalNameComp = StringBuilder()
        var type: UndeterminedType? = null
        typeComponents.forEach { expression ->
            when (expression) {
                ConstExpression -> {
                    if (previous != null) {
                        originalNameComp.append(" ")
                    }
                    originalNameComp.append("const")
                }

                PointerExpression -> {
                    when (previous) {
                        null,
                        PointerExpression,
                        is TypeReferenceExpression -> {
                        }

                        else -> originalNameComp.append(" ")
                    }
                    originalNameComp.append("*")
                    val prevType = type!!
                    type = UndeterminedType(
                        PointerType(originalNameComp.toString(), prevType.type),
                        prevType.complete
                    )
                }

                is TypeReferenceExpression -> {
                    if (previous != null) {
                        originalNameComp.append(" ")
                    }
                    originalNameComp.append(expression.name)
                    type = using.getOrElse(expression.name) {
                        val find = findBuiltinType(expression.name)
                        if (find == null) {
                            if (skipUnknownType) {
                                UndeterminedType(VoidType("void"), false)
                            } else {
                                error("unknown type ${expression.name} at ${expression.token}")
                            }
                        } else {
                            UndeterminedType(find, true)
                        }
                    }.let {
                        it.copy(type = it.type.withName(buildString {
                            if (it.type.originalName != expression.name) {
                                append("(${it.type.originalName}) ")
                            }
                            append(expression.name)
                        }))
                    }
                }

                is GroupTypeExpression -> {
                    if (previous != null) {
                        originalNameComp.append(" ")
                    }
                    val name = expression.name.lexeme
                    var complete = true
                    val originalName = "${expression.kind.typedef} $name"
                    originalNameComp.append(originalName)
                    val t = GroupLayoutType(
                        originalName,
                        name,
                        expression.opaque,
                        expression.members.map {
                            val pair = convertTypeNamePair(
                                it.pair,
                                skipUnknownType = skipUnknownType
                            )
                            if (!pair.second.complete) {
                                complete = false
                            }
                            GroupTypeMember(pair.first, it.bits)
                        },
                        expression.kind,
                        expression.packageName?.literal as String?
                    )
                    type = UndeterminedType(t, complete)
                    structs[name] = t
                }

                is UpcallExpression -> {
                    if (previous != null) {
                        originalNameComp.append(" ")
                    }
                    val name = expression.name.lexeme
                    val returnType = evaluate(expression.type) as UndeterminedType
                    var complete = returnType.complete
                    val parameters = expression.parameters.map {
                        val pair = convertTypeNamePair(it, skipUnknownType = skipUnknownType)
                        if (!pair.second.complete) {
                            complete = false
                        }
                        pair.first
                    }
                    val originalName =
                        "${returnType.type.originalName} (*$name)(${parameters.joinToString { "${it.type.originalName} ${it.name}" }})"
                    originalNameComp.append(originalName)
                    val upcallType = UpcallType(
                        originalName = originalName,
                        name,
                        returnType.type,
                        parameters,
                        expression.packageName?.literal as String?,
                    )
                    type = UndeterminedType(upcallType, complete)
                    upcalls[name] = upcallType
                }

                is JavaTypeExpression -> {
                    type = UndeterminedType(
                        (registeredType[expression.name.lexeme]
                            ?: error("unknown type at ${expression.name}")),
                        true
                    )
                }

                is EnumExpression -> type =
                    UndeterminedType(
                        evaluate(expression, typeSkipUnknownType = skipUnknownType) as EnumType,
                        true
                    )

                else -> error(expression)
            }
            previous = expression
        }
        return type!!
    }

    private fun convertTypeNamePair(
        pair: TypeNamePair,
        skipUnknownType: Boolean
    ): Pair<DefTypeNamePair, UndeterminedType> {
        val type = evaluate(pair.type, typeSkipUnknownType = skipUnknownType) as UndeterminedType
        return DefTypeNamePair(
            type.type,
            pair.name.lexeme,
            pair.dimensions.map {
                var value: Any? = it
                while (value !is Long) {
                    value = evaluate(value as Expression)
                    when (value) {
                        is Int -> value = value.toLong()
                        is Long -> {}
                        is ReferenceExpression -> {}
                        is DefineMacro -> value = value.value.toLong()
                        else -> error(value)
                    }
                }
                value
            }
        ) to type
    }
}
