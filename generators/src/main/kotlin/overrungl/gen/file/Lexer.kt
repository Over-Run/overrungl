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

private val preprocessors = mapOf(
    "#define" to TokenType.DEFINE
)
private val keywords = mapOf(
    "const" to TokenType.CONST,
    "enum" to TokenType.ENUM,
    "fn" to TokenType.FN,
    "java" to TokenType.JAVA,
    "opt" to TokenType.OPTIONAL,
    "return" to TokenType.RETURN,
    "struct" to TokenType.STRUCT,
    "upcall" to TokenType.UPCALL,
    "using" to TokenType.USING
)

internal class Lexer(private val source: String) {
    private var start = 0
    private var current = 0
    private var line = 1
    private val tokens = mutableListOf<Token>()

    fun tokenize(): List<Token> {
        while (!isAtEnd()) {
            start = current
            scanTokens()
        }
        tokens.add(Token(TokenType.EOF, line, ""))
        return tokens
    }

    private fun isAtEnd(): Boolean = current == source.length
    private fun advance(): Int = if (isAtEnd()) -1 else source.codePointAt(current++)
    private fun peek(): Int = if (isAtEnd()) -1 else source.codePointAt(current)
    private fun peekNext(): Int = if (current + 1 >= source.length) -1 else source.codePointAt(current + 1)
    private fun previous(): Int = if (current < 1) -1 else source.codePointAt(current - 1)
    private fun match(ch: Int): Boolean {
        if (isAtEnd()) return false
        if (peek() != ch) return false
        current++
        return true
    }

    private fun addToken(type: TokenType) {
        tokens.add(Token(type, line, source.substring(start, current)))
    }

    private fun isDigit(ch: Int): Boolean = ch >= '0'.code && ch <= '9'.code
    private fun isHexDigit(ch: Int): Boolean =
        (ch >= '0'.code && ch <= '9'.code)
            || (ch >= 'A'.code && ch <= 'F'.code)
            || (ch >= 'a'.code && ch <= 'f'.code)

    private fun reportError(message: String): Nothing {
        error("$message at line $line")
    }

    private fun scanTokens() {
        when (val ch = advance()) {
            '('.code -> addToken(TokenType.LEFT_PARENTHESIS)
            ')'.code -> addToken(TokenType.RIGHT_PARENTHESIS)
            '['.code -> addToken(TokenType.LEFT_BRACKET)
            ']'.code -> addToken(TokenType.RIGHT_BRACKET)
            '{'.code -> addToken(TokenType.LEFT_BRACE)
            '}'.code -> addToken(TokenType.RIGHT_BRACE)
            ':'.code -> addToken(TokenType.COLON)
            ';'.code -> addToken(TokenType.SEMICOLON)
            ','.code -> addToken(TokenType.COMMA)
            '.'.code -> addToken(TokenType.DOT)
            '@'.code -> addToken(TokenType.AT)
            '-'.code -> addToken(TokenType.MINUS)
            '*'.code -> addToken(TokenType.STAR)
            '/'.code -> {
                if (match('/'.code)) {
                    while (peek() != '\n'.code && !isAtEnd()) {
                        advance()
                    }
                } else {
                    addToken(TokenType.SLASH)
                }
            }

            '|'.code -> addToken(TokenType.PIPE)
            '='.code -> addToken(TokenType.EQUAL)
            '#'.code -> scanPreprocessor()
            '\n'.code -> line++

            else -> {
                if (Character.isWhitespace(ch)) {
                    return
                } else if (isDigit(ch)) {
                    scanNumber()
                } else if (Character.isJavaIdentifierStart(ch)) {
                    scanIdentifier()
                } else {
                    reportError("unexpected char '${ch.toChar()}'")
                }
            }
        }
    }

    private fun scanPreprocessor() {
        while (Character.isJavaIdentifierPart(peek())) {
            advance()
        }
        addToken(preprocessors[source.substring(start, current)]!!)
    }

    private fun scanNumber() {
        var hex = false
        var floatingPoint = false
        if (previous() == '0'.code && (peek() == 'x'.code || peek() == 'X'.code) && isHexDigit(peekNext())) {
            advance()
            hex = true
        }
        if (hex) {
            while (isHexDigit(peek())) {
                advance()
            }
        } else {
            while (isDigit(peek())) {
                advance()
            }
        }
        if (peek() == '.'.code && isDigit(peekNext())) {
            if (!hex) {
                floatingPoint = true
                advance()
                while (isDigit(peek())) {
                    advance()
                }
            } else {
                reportError("can't combine floating point with hex")
            }
        }
        if (floatingPoint) {
            addToken(TokenType.FLOATING_POINT)
        } else if (hex) {
            addToken(TokenType.HEX_INTEGER)
        } else {
            addToken(TokenType.DEC_INTEGER)
        }
    }

    private fun scanIdentifier() {
        while (Character.isJavaIdentifierPart(peek())) {
            advance()
        }
        addToken(keywords.getOrDefault(source.substring(start, current), TokenType.IDENTIFIER))
    }
}

internal enum class TokenType {
    EOF,

    // characters
    LEFT_PARENTHESIS,
    RIGHT_PARENTHESIS,
    LEFT_BRACKET,
    RIGHT_BRACKET,
    LEFT_BRACE,
    RIGHT_BRACE,
    COLON,
    SEMICOLON,
    COMMA,
    DOT,
    AT,

    // operators
    MINUS,
    STAR,
    SLASH,
    PIPE,
    EQUAL,

    // preprocessors
    DEFINE,

    // literals
    DEC_INTEGER,
    HEX_INTEGER,
    FLOATING_POINT,

    // keywords
    CONST,
    ENUM,
    FN,
    JAVA,
    OPTIONAL,
    RETURN,
    STRUCT,
    UPCALL,
    USING,

    // other
    IDENTIFIER,
}

internal data class Token(val type: TokenType, val line: Int, val lexeme: String)
