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

fun STBImageWrite() {
    val stbi_write_func_ptr = Upcall(stbPackage, "STBIWriteFunc") {
        targetMethod = "invoke"(
            void,
            void_ptr("context"),
            void_ptr("data"),
            int("size")
        )
    }.pointerType c "stbi_write_func *"

    StaticDowncall(stbPackage, "STBImageWrite", symbolLookup = stbLookup) {
        +"stbi_write_png"(
            boolean_int,
            const_char_ptr("filename"),
            int("w"),
            int("h"),
            int("comp"),
            const_void_ptr("data"),
            int("stride_in_bytes"),
            entrypoint = "stbi_write_png"
        ).overload()
        +"stbi_write_bmp"(
            boolean_int,
            const_char_ptr("filename"),
            int("w"),
            int("h"),
            int("comp"),
            const_void_ptr("data"),
            entrypoint = "stbi_write_bmp"
        ).overload()
        +"stbi_write_tga"(
            boolean_int,
            const_char_ptr("filename"),
            int("w"),
            int("h"),
            int("comp"),
            const_void_ptr("data"),
            entrypoint = "stbi_write_tga"
        ).overload()
        +"stbi_write_hdr"(
            boolean_int,
            const_char_ptr("filename"),
            int("w"),
            int("h"),
            int("comp"),
            const_void_ptr("data"),
            entrypoint = "stbi_write_hdr"
        ).overload()
        +"stbi_write_jpg"(
            boolean_int,
            const_char_ptr("filename"),
            int("x"),
            int("y"),
            int("comp"),
            const_void_ptr("data"),
            int("quality"),
            entrypoint = "stbi_write_jpg"
        ).overload()

        +"stbi_write_png_to_func"(
            boolean_int,
            stbi_write_func_ptr("func"),
            void_ptr("context"),
            int("w"),
            int("h"),
            int("comp"),
            const_void_ptr("data"),
            int("stride_in_bytes"),
            entrypoint = "stbi_write_png_to_func"
        ).insertArena()
        +"stbi_write_bmp_to_func"(
            boolean_int,
            stbi_write_func_ptr("func"),
            void_ptr("context"),
            int("w"),
            int("h"),
            int("comp"),
            const_void_ptr("data"),
            entrypoint = "stbi_write_bmp_to_func"
        ).insertArena()
        +"stbi_write_tga_to_func"(
            boolean_int,
            stbi_write_func_ptr("func"),
            void_ptr("context"),
            int("w"),
            int("h"),
            int("comp"),
            const_void_ptr("data"),
            entrypoint = "stbi_write_tga_to_func"
        ).insertArena()
        +"stbi_write_hdr_to_func"(
            boolean_int,
            stbi_write_func_ptr("func"),
            void_ptr("context"),
            int("w"),
            int("h"),
            int("comp"),
            const_void_ptr("data"),
            entrypoint = "stbi_write_hdr_to_func"
        ).insertArena()
        +"stbi_write_jpg_to_func"(
            boolean_int,
            stbi_write_func_ptr("func"),
            void_ptr("context"),
            int("x"),
            int("y"),
            int("comp"),
            const_void_ptr("data"),
            int("quality"),
            entrypoint = "stbi_write_jpg_to_func"
        ).insertArena()

        "stbi_flip_vertically_on_write"(
            void,
            boolean_int("flip_boolean"),
            entrypoint = "stbi_flip_vertically_on_write"
        )
    }
}
