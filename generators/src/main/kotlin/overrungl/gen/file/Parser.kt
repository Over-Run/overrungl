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

internal class Parser(private val tokens: List<Token>) {
    private var current = 0

    fun parse(): List<Statement> {
        val list = mutableListOf<Statement>()
        while (!isAtEnd()) {
            list.add(declaration())
        }
        return list
    }

    private fun isAtEnd(): Boolean = current >= tokens.size || tokens[current].type == TokenType.EOF
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
        if (match(TokenType.DEFINE)) return define()
        if (match(TokenType.USING)) return using()
        if (match(TokenType.FN)) return functionDeclaration()
        if (match(TokenType.ENUM)) {
            val expression = enumExpression()
            consume("expect ';'", TokenType.SEMICOLON)
            return EnumDeclaration(expression as EnumExpression)
        }

        return statement()
    }

    private fun define(): Statement {
        val name = consume("expect identifier", TokenType.IDENTIFIER)
        val value = expression()
        return DefinePreprocessor(name, value)
    }

    private fun using(): Statement {
        // usingStatement = "using" identifier = typeExpression terminator
        val name = consume("expect identifier", TokenType.IDENTIFIER)
        consume("expect '='", TokenType.EQUAL)
        val type = typeExpression()
        consume("expect ';'", TokenType.SEMICOLON)
        return UsingStatement(name, type)
    }

    private fun functionDeclaration(): Statement {
        var optional = false
        if (match(TokenType.OPTIONAL)) {
            optional = true
        }
        val previous = current
        while (!isAtEnd() && !check(TokenType.LEFT_PARENTHESIS) && !check(TokenType.SEMICOLON)) {
            advance()
        }
        val funcNameIndex = current - 1
        current = previous
        val type = typeExpression(funcNameIndex)
        val name = consume("expect identifier", TokenType.IDENTIFIER)
        val parameters = parameterList()
        val entrypoint =
            if (match(TokenType.AT)) consume("expect identifier", TokenType.IDENTIFIER).lexeme
            else name.lexeme
        val body: MutableList<Statement>?
        if (match(TokenType.LEFT_BRACE)) {
            body = mutableListOf()
            while (!isAtEnd() && !check(TokenType.RIGHT_BRACE)) {
                body.add(statement())
            }
            consume("expect '}'", TokenType.RIGHT_BRACE)
        } else {
            body = null
            consume("expect ';'", TokenType.SEMICOLON)
        }
        return FunctionDeclaration(type, name, parameters, optional, entrypoint, body)
    }

    private fun parameterList(): List<TypeNamePair> {
        consume("expect '('", TokenType.LEFT_PARENTHESIS)
        val parameters = mutableListOf<TypeNamePair>()
        if (!check(TokenType.RIGHT_PARENTHESIS)) {
            do {
                val startParamIndex = current
                while (!isAtEnd() && !check(TokenType.COMMA) && !check(TokenType.RIGHT_PARENTHESIS) && !check(TokenType.LEFT_BRACKET)) {
                    advance()
                }
                val paramNameIndex = current - 1
                current = startParamIndex
                val paramType = typeExpression(paramNameIndex)
                val paramName = consume("expect identifier", TokenType.IDENTIFIER)
                val dims = mutableListOf<Long>()
                while (match(TokenType.LEFT_BRACKET)) {
                    if (match(TokenType.DEC_INTEGER, TokenType.HEX_INTEGER)) {
                        val dim = previous()!!
                        when (dim.type) {
                            TokenType.DEC_INTEGER -> dims.add(dim.lexeme.toLong())
                            TokenType.HEX_INTEGER -> dims.add(dim.lexeme.toLong(16))
                            else -> error(dim)
                        }
                        consume("expect ']'", TokenType.RIGHT_BRACKET)
                    } else {
                        consume("expect ']'", TokenType.RIGHT_BRACKET)
                        ((paramType as TypeExpression).components as MutableList).add(PointerExpression)
                    }
                }
                parameters.add(TypeNamePair(paramType, paramName, dims))
            } while (match(TokenType.COMMA))
        }
        consume("expect ')'", TokenType.RIGHT_PARENTHESIS)
        return parameters
    }

    private fun statement(): Statement {
        if (match(TokenType.RETURN)) return returnStatement()

        return ExpressionStatement(expression())
    }

    private fun returnStatement() :Statement{
        val value = expression()
        consume("expect ';'", TokenType.SEMICOLON)
        return ReturnStatement(value)
    }

    private fun typeExpression(scanUntil: Int = tokens.size): Expression {
        // typeExpression = "const"? rawType ("const" | "*")*
        // we don't use const in Java, but we capture it to show in CType.

        val list = mutableListOf<Expression>()

        if (match(TokenType.CONST)) list.add(ConstExpression)
        list.add(rawType(scanUntil))
        while (match(TokenType.CONST, TokenType.STAR)) {
            val previous = previous()!!
            when (previous.type) {
                TokenType.CONST -> list.add(ConstExpression)
                TokenType.STAR -> list.add(PointerExpression)
                else -> TODO(previous.toString())
            }
        }

        return TypeExpression(list)
    }

    private fun rawType(scanUntil: Int = tokens.size): Expression {
        if (check(TokenType.IDENTIFIER)) {
            val sb = StringBuilder()
            var i = 0
            while (current < scanUntil && match(TokenType.IDENTIFIER)) {
                if (i > 0) sb.append(" ")
                sb.append(previous()!!.lexeme)
                i++
            }
            return TypeReferenceExpression(sb.toString())
        } else if (match(TokenType.STRUCT)) {
            return structExpression()
        } else if (match(TokenType.UPCALL)) {
            return upcallExpression()
        } else if (match(TokenType.JAVA)) {
            return JavaTypeExpression(consume("expect identifier", TokenType.IDENTIFIER))
        } else if (match(TokenType.ENUM)) {
            return enumExpression()
        }
        reportError("expect identifier, 'struct', 'upcall', 'java' or 'enum'")
    }

    private fun structExpression(): Expression {
        // structExpression = "struct" identifier memberList?
        // memberList = "{" member* "}"
        // member = typeExpression identifier dims? ";"
        val name = consume("expect identifier", TokenType.IDENTIFIER)
        var opaque = true
        val members = mutableListOf<TypeNamePair>()
        if (match(TokenType.LEFT_BRACE)) {
            opaque = false
            while (!isAtEnd() && !check(TokenType.RIGHT_BRACE)) {
                // name
                val previous = current
                while (!isAtEnd() && !check(TokenType.LEFT_BRACKET) && !check(TokenType.SEMICOLON) && !check(TokenType.LEFT_BRACE)) {
                    advance()
                }
                val memberNameIndex = current - 1
                current = previous
                val memberType = typeExpression(memberNameIndex)
                val memberName = consume("expect identifier", TokenType.IDENTIFIER)
                val dims = mutableListOf<Long>()
                while (match(TokenType.LEFT_BRACKET)) {
                    if (match(TokenType.DEC_INTEGER, TokenType.HEX_INTEGER)) {
                        val dim = previous()!!
                        when (dim.type) {
                            TokenType.DEC_INTEGER -> dims.add(dim.lexeme.toLong())
                            TokenType.HEX_INTEGER -> dims.add(dim.lexeme.toLong(16))
                            else -> error(dim)
                        }
                        consume("expect ']'", TokenType.RIGHT_BRACKET)
                    } else {
                        consume("expect ']'", TokenType.RIGHT_BRACKET)
                        ((memberType as TypeExpression).components as MutableList).add(PointerExpression)
                    }
                }
                consume("expect ';'", TokenType.SEMICOLON)
                members.add(TypeNamePair(memberType, memberName, dims))
            }
            consume("expect '}'", TokenType.RIGHT_BRACE)
        }
        return StructExpression(name, opaque, members)
    }

    private fun upcallExpression(): Expression {
        // upcallExpression = "upcall" typeExpression identifier "(" parameters? ")"
        val startUpcallIndex = current
        while (!isAtEnd() && !check(TokenType.LEFT_PARENTHESIS)) {
            advance()
        }
        val upcallNameIndex = current - 1
        current = startUpcallIndex
        val type = typeExpression(upcallNameIndex)
        val name = consume("expect identifier", TokenType.IDENTIFIER)
        val parameters = parameterList()
        return UpcallExpression(type, name, parameters)
    }

    private fun enumExpression(): Expression {
        consume("expect '{'", TokenType.LEFT_BRACE)
        val pairs = mutableListOf<Pair<String, Int>>()
        var currentValue = 0
        while (!isAtEnd() && !check(TokenType.RIGHT_BRACE)) {
            val name = consume("expect identifier", TokenType.IDENTIFIER)
            if (match(TokenType.EQUAL)) {
                currentValue = if (match(TokenType.DEC_INTEGER)) {
                    previous()!!.lexeme.toInt()
                } else if (match(TokenType.HEX_INTEGER)) {
                    previous()!!.lexeme.toInt(16)
                } else {
                    reportError("expect integer")
                }
                pairs.add(name.lexeme to currentValue)
            } else {
                pairs.add(name.lexeme to currentValue)
                currentValue++
            }
            if (check(TokenType.COMMA)) {
                advance()
            }
        }
        consume("expect '}'", TokenType.RIGHT_BRACE)
        return EnumExpression(pairs)
    }

    private fun expression(): Expression {
        return bitwise()
    }

    private fun bitwise(): Expression {
        val left = unary()
        if (match(TokenType.PIPE)) {
            val operator = previous()!!
            val right = unary()
            return BinaryExpression(left, operator, right)
        }
        return left
    }

    private fun unary(): Expression {
        if (match(TokenType.MINUS)) {
            val operator = previous()!!
            val right = unary()
            return UnaryExpression(operator, right)
        }
        return functionCall()
    }

    private fun functionCall(): Expression {
        var expr = primary()
        while (true) {
            if (match(TokenType.LEFT_PARENTHESIS)) {
                expr = finishCall(expr)
            } else {
                break
            }
        }
        return expr
    }

    private fun finishCall(callee: Expression): Expression {
        val arguments = mutableListOf<Expression>()
        if (!check(TokenType.RIGHT_PARENTHESIS)) {
            do {
                arguments.add(expression())
            } while (match(TokenType.COMMA))
        }
        consume("expect ')'", TokenType.RIGHT_PARENTHESIS)
        return FunctionCallExpression(callee, arguments)
    }

    private fun primary(): Expression {
        if (match(TokenType.DEC_INTEGER, TokenType.HEX_INTEGER)) {
            val previous = previous()!!
            return when (previous.type) {
                TokenType.DEC_INTEGER -> IntegerExpression(previous.lexeme, 10)
                TokenType.HEX_INTEGER -> IntegerExpression(previous.lexeme, 16)
                else -> throw AssertionError()
            }
        }
        if (match(TokenType.FLOATING_POINT)) return FloatingPointExpression(previous()!!.lexeme)
        if (match(TokenType.IDENTIFIER)) return ReferenceExpression(previous()!!.lexeme)

        if (match(TokenType.LEFT_PARENTHESIS)) {
            val expression = expression()
            consume("expect ')'", TokenType.RIGHT_PARENTHESIS)
            return ParenthesisExpression(expression)
        }

        reportError("expect expression")
    }
}

internal sealed interface Statement
internal data class DefinePreprocessor(val name: Token, val value: Expression) : Statement
internal data class UsingStatement(val name: Token, val oldType: Expression) : Statement
internal data class FunctionDeclaration(
    val returnType: Expression,
    val name: Token,
    val parameters: List<TypeNamePair>,
    val optional: Boolean,
    val entrypoint: String,
    val body: List<Statement>?
) : Statement

internal data class EnumDeclaration(
    val enumExpression: EnumExpression
) : Statement

internal data class ReturnStatement(val value: Expression) : Statement
internal data class ExpressionStatement(val expression: Expression) : Statement

internal sealed interface Expression
internal data class IntegerExpression(val lexeme: String, val radix: Int) : Expression
internal data class FloatingPointExpression(val lexeme: String) : Expression
internal data class ParenthesisExpression(val expression: Expression) : Expression
internal data class UnaryExpression(val operator: Token, val right: Expression) : Expression
internal data class BinaryExpression(val left: Expression, val operator: Token, val right: Expression) : Expression
internal data class ReferenceExpression(val name: String) : Expression
internal data object ConstExpression : Expression
internal data object PointerExpression : Expression
internal data class TypeReferenceExpression(val name: String) : Expression
internal data class TypeExpression(val components: List<Expression>) : Expression

internal data class TypeNamePair(val type: Expression, val name: Token, val dimensions: List<Long>)
internal data class StructExpression(val name: Token, val opaque: Boolean, val members: List<TypeNamePair>) : Expression
internal data class UpcallExpression(
    val type: Expression,
    val name: Token,
    val parameters: List<TypeNamePair>
) : Expression


internal data class JavaTypeExpression(val name: Token) : Expression
internal data class EnumExpression(val nameValues: List<Pair<String, Int>>) : Expression
internal data class FunctionCallExpression(val callee: Expression, val arguments: List<Expression>) : Expression
