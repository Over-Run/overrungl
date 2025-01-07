/*
 * MIT License
 *
 * Copyright (c) 2024-2025 Overrun Organization
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
        "stb_easy_font_get_spacing"(float, entrypoint = "stb_easy_font_get_spacing")
        "stb_easy_font_spacing"(void, float("spacing"), entrypoint = "stb_easy_font_spacing")
        "stb_easy_font_print"(
            int,
            float("x"),
            float("y"),
            char_ptr("text"),
            uchar_4("color"),
            void_ptr("vertex_buffer"),
            int("vbuf_size"),
            entrypoint = "stb_easy_font_print"
        )
        +"stb_easy_font_width"(int, char_ptr("width"), entrypoint = "stb_easy_font_width").overload(
            parameters = listOf(
                string_u8("width")
            )
        )
        +"stb_easy_font_height"(
            int,
            char_ptr("height"),
            entrypoint = "stb_easy_font_height"
        ).overload(parameters = listOf(string_u8("height")))
    }
}
