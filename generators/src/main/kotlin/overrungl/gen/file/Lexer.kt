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

private val keywords = mapOf(
    "const" to CONST,
    "enum" to ENUM,
    "fn" to FN,
    "import" to IMPORT,
    "java" to JAVA,
    "opt" to OPTIONAL,
    "package" to PACKAGE,
    "struct" to STRUCT,
    "union" to UNION,
    "upcall" to UPCALL,
    "using" to USING,
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
        tokens.add(Token(EOF, line, "", null))
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

    private fun addToken(type: TokenType, literal: Any? = null) {
        tokens.add(Token(type, line, source.substring(start, current), literal))
    }

    private fun isDigit(ch: Int): Boolean = ch >= '0'.code && ch <= '9'.code
    private fun isHexDigit(ch: Int): Boolean =
        (ch >= '0'.code && ch <= '9'.code)
            || (ch >= 'A'.code && ch <= 'F'.code)
            || (ch >= 'a'.code && ch <= 'f'.code)

    private fun reportError(message: String): Nothing {
        error("$message at line $line: ${source.lines()[line - 1]}")
    }

    private fun scanTokens() {
        when (val ch = advance()) {
            '('.code -> addToken(LEFT_PARENTHESIS)
            ')'.code -> addToken(RIGHT_PARENTHESIS)
            '['.code -> addToken(LEFT_BRACKET)
            ']'.code -> addToken(RIGHT_BRACKET)
            '{'.code -> addToken(LEFT_BRACE)
            '}'.code -> addToken(RIGHT_BRACE)
            ':'.code -> addToken(COLON)
            ';'.code -> addToken(SEMICOLON)
            ','.code -> addToken(COMMA)
            '.'.code -> addToken(DOT)
            '@'.code -> addToken(AT)
            '-'.code -> addToken(MINUS)
            '*'.code -> addToken(STAR)
            '/'.code -> {
                if (match('/'.code)) {
                    while (peek() != '\n'.code && !isAtEnd()) {
                        advance()
                    }
                } else {
                    addToken(SLASH)
                }
            }

            '|'.code -> addToken(VERTICAL_BAR)
            '='.code -> addToken(EQUAL)
            '~'.code -> addToken(TILDE)
            '#'.code -> {
                while (!isAtEnd() && peek() != '\n'.code) {
                    advance()
                }
                line++
                addToken(PREPROCESSOR)
            }

            '"'.code -> scanString()
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

    private fun scanString() {
        while (!isAtEnd() && peek() != '"'.code) {
            advance()
        }
        if (!match('"'.code)) {
            reportError("unterminated string")
        }
        addToken(STRING, source.substring(start + 1, current - 1))
    }

    private fun scanNumber() {
        var hex = false
        var floatingPoint = false
        var isFloat = false
        var isLong = false
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
                if (peek() == 'f'.code || peek() == 'F'.code) {
                    isFloat = true
                    advance()
                }
            } else {
                reportError("can't combine floating point with hex")
            }
        } else if (peek() == 'l'.code || peek() == 'L'.code) {
            isLong = true
            advance()
        }
        if (floatingPoint) {
            addToken(
                FLOATING_POINT,
                if (isFloat) source.substring(start, current - 1).toFloat()
                else source.substring(start, current).toDouble()
            )
        } else if (hex) {
            if (isLong) {
                addToken(INTEGER, source.substring(start + 2, current - 1).toLong(16))
            } else {
                addToken(INTEGER, source.substring(start + 2, current).toLong(16).toInt())
            }
        } else {
            if (isLong) {
                addToken(INTEGER, source.substring(start, current - 1).toLong())
            } else {
                addToken(INTEGER, source.substring(start, current).toLong().toInt())
            }
        }
    }

    private fun scanIdentifier() {
        while (Character.isJavaIdentifierPart(peek())) {
            advance()
        }
        addToken(keywords.getOrDefault(source.substring(start, current), IDENTIFIER))
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
    VERTICAL_BAR,
    EQUAL,
    TILDE,

    // literals
    INTEGER,
    FLOATING_POINT,
    STRING,

    // keywords
    CONST,
    ENUM,
    FN,
    IMPORT,
    JAVA,
    OPTIONAL,
    PACKAGE,
    STRUCT,
    UNION,
    UPCALL,
    USING,

    // other
    IDENTIFIER,
    PREPROCESSOR,
}

internal data class Token(val type: TokenType, val line: Int, val lexeme: String, val literal: Any?)
