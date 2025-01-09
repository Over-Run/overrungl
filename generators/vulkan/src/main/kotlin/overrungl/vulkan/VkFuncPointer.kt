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

package overrungl.vulkan

private val keywords = listOf(
    "typedef",
    "const",
    "VKAPI_PTR"
)

data class VkFuncPointerParam(val type: List<VkTypeComponent>, val name: String)
data class VkFuncPointer(val type: List<VkTypeComponent>, val name: String, val params: List<VkFuncPointerParam>)

class VkFuncPointerLexer(private val source: String) {
    private var start = 0
    private var position = 0
    private val tokens = mutableListOf<Token>()

    fun parse(): List<Token> {
        while (!isEOF()) {
            start = position
            scan()
        }
        tokens.add(Token(TokenType.EOF, null))
        return tokens
    }

    private fun isEOF(): Boolean = position >= source.length
    private fun advance(): Int {
        return if (isEOF()) -1
        else source.codePointAt(position++)
    }

    private fun peek(): Int {
        return if (isEOF()) -1
        else source.codePointAt(position)
    }

    private fun scan() {
        when (val c = advance()) {
            '('.code -> addToken(TokenType.LEFT_PARENTHESIS)
            ')'.code -> addToken(TokenType.RIGHT_PARENTHESIS)
            '*'.code -> addToken(TokenType.STAR)
            ','.code -> addToken(TokenType.COMMA)
            ';'.code -> addToken(TokenType.SEMICOLON)
            else -> {
                if (Character.isWhitespace(c)) return
                else if (Character.isJavaIdentifierStart(c)) scanIdentifier()
                else error("Unexpected character: ${c.toChar()}")
            }
        }
    }

    private fun scanIdentifier() {
        while (!isEOF() && Character.isJavaIdentifierPart(peek())) {
            advance()
        }
        if (keywords.contains(source.substring(start, position))) {
            addToken(TokenType.KEYWORD)
        } else {
            addToken(TokenType.LITERAL)
        }
    }

    private fun addToken(type: TokenType) {
        tokens.add(Token(type, source.substring(start, position)))
    }
}

class VkFuncPointerParser(private val tokens: List<Token>) {
    private var position = 0
    private val type = mutableListOf<VkTypeComponent>()
    private var name: String? = null
    private val params = mutableListOf<VkFuncPointerParam>()

    fun parse(): VkFuncPointer {
        while (!isEOF()) {
            scanTypedef()
        }
        return VkFuncPointer(type, name!!, params)
    }

    private fun isEOF(): Boolean = position >= tokens.size || tokens[position].type == TokenType.EOF
    private fun advance(): Token? = if (isEOF()) null else tokens[position++]
    private fun peek(): Token? = if (isEOF()) null else tokens[position]
    private fun next(): Token? = if (position + 1 >= tokens.size) null else tokens[++position]

    private fun scanTypedef() {
        val token = peek()
        if (token != null && token.type == TokenType.KEYWORD && token.literal == "typedef") {
            next()
            scanPFNType()
            scanPFNName()
            scanPFNParams()
            next() // ;
        } else error(token.toString())
    }

    private fun scanPFNType() {
        var token = peek()
        while (token != null && token.type != TokenType.LEFT_PARENTHESIS) {
            if (token.type == TokenType.LITERAL) {
                type.add(VkTypeResolving(token.literal!!))
            } else if (token.type == TokenType.KEYWORD || token.type == TokenType.STAR) {
                type.add(VkTypeLiteral(token.literal!!))
            }
            token = next()
        }
    }

    private fun scanPFNName() {
        advance() // (
        advance() // VKAPI_PTR
        advance() // *
        name = advance()!!.literal
        advance() // )
    }

    private fun scanPFNParams() {
        var token = peek()
        if (token != null && token.type == TokenType.LEFT_PARENTHESIS) {
            token = next()
            while (token != null && token.type != TokenType.RIGHT_PARENTHESIS) {
                token = scanPFNParam()
            }
            next()
        } else error(token.toString())
    }

    private fun scanPFNParam(): Token? {
        val pendingTokens = mutableListOf<Token>()
        var token = peek()
        while (token != null && token.type != TokenType.COMMA && token.type != TokenType.RIGHT_PARENTHESIS) {
            pendingTokens.add(token)
            token = next()
        }
        val type = mutableListOf<VkTypeComponent>()
        val name = pendingTokens.last().literal
        pendingTokens.forEachIndexed { index, token ->
            if (index != pendingTokens.lastIndex) {
                if (token.type == TokenType.LITERAL) {
                    type.add(VkTypeResolving(token.literal!!))
                } else if (token.type == TokenType.KEYWORD || token.type == TokenType.STAR) {
                    type.add(VkTypeLiteral(token.literal!!))
                }
            }
        }
        params.add(VkFuncPointerParam(type, name!!))
        return advance()
    }
}

enum class TokenType {
    EOF,
    LITERAL,
    KEYWORD,
    LEFT_PARENTHESIS,
    RIGHT_PARENTHESIS,
    STAR,
    COMMA,
    SEMICOLON,
}

data class Token(val type: TokenType, val literal: String?)
