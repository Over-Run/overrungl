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

import overrungl.gen.file.TokenType.*

private val whitespaceRegex = Regex("\\s+")

internal class Parser(private val tokens: List<Token>) {
    private var current = 0

    fun parse(): List<Statement> {
        val list = mutableListOf<Statement>()
        while (!isAtEnd()) {
            list.add(declaration())
        }
        return list
    }

    private fun isAtEnd(): Boolean = current >= tokens.size || tokens[current].type == EOF
    private fun advance(): Token? = if (isAtEnd()) null else tokens[current++]
    private fun peek(): Token? = if (isAtEnd()) null else tokens[current]
    private fun previous(): Token? = if (current < 1) null else tokens[current - 1]
    private fun check(type: TokenType): Boolean = peek()?.type == type
    private fun match(vararg types: TokenType): Boolean {
        types.forEach {
            if (check(it)) {
                advance()
                return true
            }
        }
        return false
    }

    private fun consume(message: String, vararg types: TokenType): Token {
        if (!match(*types)) {
            reportError(message)
        }
        return previous()!!
    }

    private fun reportError(message: String): Nothing {
        error("$message at ${peek()}")
    }

    private fun declaration(): Statement {
        if (match(PREPROCESSOR)) {
            val previous = previous()!!
            if (previous.lexeme.startsWith("#define ")) {
                val split = previous.lexeme.split(whitespaceRegex, 3)
                if (split.size < 3) {
                    reportError("expect name and value")
                }
                return DefinePreprocessor(split[1], split[2])
            } else if (previous.lexeme.startsWith("#defineAs ")) {
                val split = previous.lexeme.split(whitespaceRegex, 4)
                if (split.size < 4) {
                    reportError("expect type, name and value")
                }
                return DefineAsPreprocessor(split[1], split[2], split[3])
            } else if (previous.lexeme.startsWith("#extern ")) {
                val split = previous.lexeme.split(whitespaceRegex, 3)
                if (split.size < 3) {
                    reportError("expect name and value")
                }
                return ExternPreprocessor(split[1], split[2])
            }
        }
        if (match(USING)) return using()
        if (match(FN)) return functionDeclaration()
        if (match(ENUM)) {
            val expression = enumExpression()
            consume("expect ';'", SEMICOLON)
            return EnumDeclaration(expression as EnumExpression)
        }

        return statement()
    }

    private fun using(): Statement {
        // usingStatement = "using" identifier = typeExpression terminator
        val name = consume("expect identifier", IDENTIFIER)
        consume("expect '='", EQUAL)
        val type = typeExpression()
        consume("expect ';'", SEMICOLON)
        return UsingStatement(name, type)
    }

    private fun functionDeclaration(): Statement {
        var optional = false
        if (match(OPTIONAL)) {
            optional = true
        }
        val previous = current
        while (!isAtEnd() && !check(LEFT_PARENTHESIS) && !check(SEMICOLON)) {
            advance()
        }
        val funcNameIndex = current - 1
        current = previous
        val type = typeExpression(funcNameIndex)
        val name = consume("expect identifier", IDENTIFIER)
        val parameters = parameterList()
        val entrypoint =
            if (match(AT)) consume("expect identifier", IDENTIFIER).lexeme
            else name.lexeme
        val body: MutableList<String>?
        if (match(LEFT_BRACE)) {
            body = mutableListOf()
            while (!isAtEnd() && !check(RIGHT_BRACE)) {
                body.add(consume("expect string", STRING).literal!! as String)
            }
            consume("expect '}'", RIGHT_BRACE)
        } else {
            body = null
            consume("expect ';'", SEMICOLON)
        }
        return FunctionDeclaration(type, name, parameters, optional, entrypoint, body)
    }

    private fun parameterList(): List<TypeNamePair> {
        consume("expect '('", LEFT_PARENTHESIS)
        val parameters = mutableListOf<TypeNamePair>()
        if (!check(RIGHT_PARENTHESIS)) {
            do {
                val startParamIndex = current
                while (!isAtEnd() && !check(COMMA) && !check(RIGHT_PARENTHESIS) && !check(LEFT_BRACKET)) {
                    advance()
                }
                val paramNameIndex = current - 1
                current = startParamIndex
                val paramType = typeExpression(paramNameIndex)
                val paramName = consume("expect identifier", IDENTIFIER)
                val dims = mutableListOf<Expression>()
                while (match(LEFT_BRACKET)) {
                    if (match(RIGHT_BRACKET)) {
                        ((paramType as TypeExpression).components as MutableList).add(PointerExpression)
                    } else {
                        val dim = expression()
                        dims.add(dim)
                        consume("expect ']'", RIGHT_BRACKET)
                    }
                }
                parameters.add(TypeNamePair(paramType, paramName, dims))
            } while (match(COMMA))
        }
        consume("expect ')'", RIGHT_PARENTHESIS)
        return parameters
    }

    private fun statement(): Statement {
        if (match(IMPORT)) return importStatement()

        return ExpressionStatement(expression())
    }

    private fun importStatement(): Statement {
        val string = consume("expect string", STRING)
        consume("expect ';'", SEMICOLON)
        return ImportStatement(string.literal as String)
    }

    private fun typeExpression(scanUntil: Int = tokens.size): Expression {
        // typeExpression = "const"? rawType ("const" | "*")*
        // we don't use const in Java, but we capture it to show in CType.

        val list = mutableListOf<Expression>()

        if (match(CONST)) list.add(ConstExpression)
        list.add(rawType(scanUntil))
        while (match(CONST, STAR)) {
            val previous = previous()!!
            when (previous.type) {
                CONST -> list.add(ConstExpression)
                STAR -> list.add(PointerExpression)
                else -> error(previous)
            }
        }

        return TypeExpression(list)
    }

    private fun rawType(scanUntil: Int = tokens.size): Expression {
        if (check(IDENTIFIER)) {
            val sb = StringBuilder()
            var i = 0
            while (current < scanUntil && match(IDENTIFIER)) {
                if (i > 0) sb.append(" ")
                sb.append(previous()!!.lexeme)
                i++
            }
            return TypeReferenceExpression(sb.toString(), previous()!!)
        } else if (match(STRUCT, UNION)) {
            return groupTypeExpression()
        } else if (match(UPCALL)) {
            return upcallExpression()
        } else if (match(JAVA)) {
            return JavaTypeExpression(consume("expect identifier", IDENTIFIER))
        } else if (match(ENUM)) {
            return enumExpression()
        }
        reportError("expect identifier, 'struct', 'upcall', 'java' or 'enum'")
    }

    private fun groupTypeExpression(): Expression {
        // groupTypeExpression = ("struct" | "union") identifier memberList?
        // memberList = "{" member* "}"
        // member = typeExpression identifier dims? ";"
        val kind = when (previous()!!.type) {
            STRUCT -> GroupTypeKind.STRUCT
            UNION -> GroupTypeKind.UNION
            else -> error(previous()!!)
        }
        val name = consume("expect identifier", IDENTIFIER)
        var opaque = true
        val members = mutableListOf<ParserGroupTypeMember>()
        var packageName: Token? = null
        var hasBitfield = false
        val imports = mutableListOf<String>()
        if (match(LEFT_BRACE)) {
            opaque = false
            if (match(PACKAGE)) {
                packageName = consume("expect string", STRING)
                consume("expect ';'", SEMICOLON)
            }
            while (match(IMPORT)) {
                imports.add(consume("expect string", STRING).literal.toString())
                consume("expect ';'", SEMICOLON)
            }
            while (!isAtEnd() && !check(RIGHT_BRACE)) {
                // type
                val previous = current
                while (!isAtEnd()
                    && !check(LEFT_BRACKET)
                    && !check(SEMICOLON)
                    && !check(COMMA)
                    && !check(COLON)
                ) {
                    advance()
                }
                val memberNameIndex = current - 1
                current = previous
                val memberType = typeExpression(memberNameIndex)
                do {
                    val memberName = consume("expect identifier", IDENTIFIER)
                    val dims = mutableListOf<Expression>()
                    var bits: Int? = null
                    if (check(LEFT_BRACKET)) {
                        while (match(LEFT_BRACKET)) {
                            val dim = expression()
                            dims.add(dim)
                            consume("expect ']'", RIGHT_BRACKET)
                        }
                    } else if (match(COLON)) {
                        bits = consume("expect integer", INTEGER).literal as Int
                        hasBitfield = true
                    }
                    members.add(ParserGroupTypeMember(TypeNamePair(memberType, memberName, dims), bits))
                } while (match(COMMA))
                consume("expect ';'", SEMICOLON)
            }
            consume("expect '}'", RIGHT_BRACE)
        }
        return GroupTypeExpression(
            name,
            opaque,
            members,
            packageName,
            if (hasBitfield && kind == GroupTypeKind.STRUCT) GroupTypeKind.BITFIELD
            else kind,
            imports
        )
    }

    private fun upcallExpression(): Expression {
        // upcallExpression = "upcall" typeExpression identifier "(" parameters? ")"
        val startUpcallIndex = current
        while (!isAtEnd() && !check(LEFT_PARENTHESIS)) {
            advance()
        }
        val upcallNameIndex = current - 1
        current = startUpcallIndex
        val type = typeExpression(upcallNameIndex)
        val name = consume("expect identifier", IDENTIFIER)
        val parameters = parameterList()
        var pkgName: Token? = null
        if (match(PACKAGE)) {
            pkgName = consume("expect string", STRING)
        }
        return UpcallExpression(type, name, parameters, pkgName)
    }

    private fun enumExpression(): Expression {
        consume("expect '{'", LEFT_BRACE)
        val pairs = mutableListOf<Pair<String, Expression?>>()
        while (!isAtEnd() && !check(RIGHT_BRACE)) {
            val name = consume("expect identifier", IDENTIFIER)
            if (match(EQUAL)) {
                val expression = expression()
                pairs.add(name.lexeme to expression)
            } else {
                pairs.add(name.lexeme to null)
            }
            if (check(COMMA)) {
                advance()
            }
        }
        consume("expect '}'", RIGHT_BRACE)
        return EnumExpression(pairs)
    }

    private fun expression(): Expression {
        return bitwise()
    }

    private fun bitwise(): Expression {
        val left = unary()
        if (match(VERTICAL_BAR)) {
            val operator = previous()!!
            val right = unary()
            return BinaryExpression(left, operator, right)
        }
        return left
    }

    private fun unary(): Expression {
        if (match(MINUS)) {
            val operator = previous()!!
            val right = unary()
            return UnaryExpression(operator, right)
        }
        return primary()
    }

    private fun primary(): Expression {
        if (match(INTEGER, FLOATING_POINT, STRING)) {
            val previous = previous()!!
            return LiteralExpression(previous.literal!!)
        }
        if (match(IDENTIFIER)) return ReferenceExpression(previous()!!.lexeme)

        if (match(LEFT_PARENTHESIS)) {
            val expression = expression()
            consume("expect ')'", RIGHT_PARENTHESIS)
            return ParenthesisExpression(expression)
        }

        reportError("expect expression")
    }
}

internal sealed interface Statement
internal data class DefinePreprocessor(val name: String, val value: String) : Statement // regard #define as statement
internal data class DefineAsPreprocessor(val type: String, val name: String, val value: String) : Statement
internal data class ExternPreprocessor(val name: String, val value: String) : Statement
internal data class UsingStatement(val name: Token, val oldType: Expression) : Statement
internal data class FunctionDeclaration(
    val returnType: Expression,
    val name: Token,
    val parameters: List<TypeNamePair>,
    val optional: Boolean,
    val entrypoint: String,
    val body: List<String>?
) : Statement

internal data class EnumDeclaration(
    val enumExpression: EnumExpression
) : Statement

internal data class ImportStatement(val filename: String) : Statement
internal data class ExpressionStatement(val expression: Expression) : Statement

internal sealed interface Expression
internal data class LiteralExpression(val literal: Any) : Expression
internal data class ParenthesisExpression(val expression: Expression) : Expression
internal data class UnaryExpression(val operator: Token, val right: Expression) : Expression
internal data class BinaryExpression(val left: Expression, val operator: Token, val right: Expression) : Expression
internal data class ReferenceExpression(val name: String) : Expression
internal data object ConstExpression : Expression
internal data object PointerExpression : Expression
internal data class TypeReferenceExpression(val name: String, val token: Token) : Expression
internal data class TypeExpression(val components: List<Expression>) : Expression

internal data class TypeNamePair(val type: Expression, val name: Token, val dimensions: List<Expression>)
internal data class ParserGroupTypeMember(val pair: TypeNamePair, val bits: Int?)
internal data class GroupTypeExpression(
    val name: Token,
    val opaque: Boolean,
    val members: List<ParserGroupTypeMember>,
    val packageName: Token?,
    val kind: GroupTypeKind,
    val imports: List<String>
) : Expression

internal data class UpcallExpression(
    val type: Expression,
    val name: Token,
    val parameters: List<TypeNamePair>,
    val packageName: Token?
) : Expression


internal data class JavaTypeExpression(val name: Token) : Expression
internal data class EnumExpression(val nameValues: List<Pair<String, Expression?>>) : Expression
