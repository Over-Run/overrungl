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

package overrungl.stb

import overrungl.gen.*

private val char_ptr = string_u8 c "char *"
val uchar_4 = jbyte_array c "unsigned char[4]"

fun STBEasyFont() {
    StaticDowncall(stbPackage, "STBEasyFont", symbolLookup = stbLookup) {
        "stb_easy_font_get_spacing"(
            float,
            entrypoint = "stb_easy_font_get_spacing",
            javadoc = "{@return `stb_easy_font_spacing_val`}"
        )
        "stb_easy_font_spacing"(
            void,
            float("spacing"),
            entrypoint = "stb_easy_font_spacing",
            javadoc = """
                Use positive values to expand the space between characters,
                and small negative values (no smaller than -1.5) to contract
                the space between characters.

                E.g. spacing = 1 adds one "pixel" of spacing between the
                characters. spacing = -1 is reasonable but feels a bit too
                compact to me; -0.5 is a reasonable compromise as long as
                you're scaling the font up.
                @param spacing value
            """.trimIndent()
        )
        "stb_easy_font_print"(
            int,
            float("x"),
            float("y"),
            char_ptr("text"),
            uchar_4("color"),
            void_ptr("vertex_buffer"),
            int("vbuf_size"),
            entrypoint = "stb_easy_font_print",
            javadoc = """
                Takes a string (which can contain '\n') and fills out a
                vertex buffer with renderable data to draw the string.
                Output data assumes increasing x is rightwards, increasing y
                is downwards.

                The vertex data is divided into quads, i.e. there are four
                vertices in the vertex buffer for each quad.

                The vertices are stored in an interleaved format:

                - x:`float`
                - y:`float`
                - z:`float`
                - color:`uint8[4]`

                You can ignore z and color if you get them from elsewhere
                This format was chosen in the hopes it would make it
                easier for you to reuse existing vertex-buffer-drawing code.

                If you pass in NULL for color, it becomes 255,255,255,255.

                If the buffer isn't large enough, it will truncate.
                Expect it to use an average of ~270 bytes per character.

                If your API doesn't draw quads, build a reusable index
                list that allows you to render quads as indexed triangles.

                @return the number of quads.
            """.trimIndent()
        )
        +"stb_easy_font_width"(
            int,
            char_ptr("width"),
            entrypoint = "stb_easy_font_width",
            javadoc = """
                Takes a string and returns the horizontal size and the
                vertical size (which can vary if 'text' has newlines).
                @return the horizontal size
            """.trimIndent()
        ).overload(parameters = listOf(string_u8("width")))
        +"stb_easy_font_height"(
            int,
            char_ptr("height"),
            entrypoint = "stb_easy_font_height",
            javadoc = """
                Takes a string and returns the horizontal size and the
                vertical size (which can vary if 'text' has newlines).
                @return the vertical size
            """.trimIndent()
        ).overload(parameters = listOf(string_u8("height")))
    }
}
