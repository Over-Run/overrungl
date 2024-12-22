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

val stbi_uc = char c "stbi_uc"
val stbi_us = short c "stbi_us"
val stbi_uc_ptr = address c "stbi_uc*"
val stbi_us_ptr = address c "stbi_us*"
val stbi_uc_const_ptr = address c "stbi_uc const *"
val stbi_us_const_ptr = address c "stbi_us_const *"
val stbi_io_read_fp = address c "<FP int (*read)(void *user,char *data,int size)>"
val stbi_io_skip_fp = address c "<FP void (*skip)(void *user,int n)>"
val stbi_io_eof_fp = address c "<FP int (*eof)(void *user)>"

fun STBImage() {
    val stbi_io_callbacks = Struct(stbPackage, "STBIIOCallbacks", cType = "stbi_io_callbacks") {
        stbi_io_read_fp("read")
        stbi_io_skip_fp("skip")
        stbi_io_eof_fp("eof")
    }
    val stbi_io_callbacks_const_ptr = stbi_io_callbacks.pointerType c "stbi_io_callbacks const *"

    StaticDowncall(stbPackage, "STBImage", symbolLookup = stbLookup) {
        int("STBI_default" to "0", javadoc = "only used for desired_channels")
        int("STBI_grey" to "1")
        int("STBI_grey_alpha" to "2")
        int("STBI_rgb" to "3")
        int("STBI_rgb_alpha" to "4")

        // 8-bits-per-channel interface
        "stbi_load_from_memory"(
            stbi_uc_ptr,
            stbi_uc_const_ptr("buffer"),
            int("len"),
            int_ptr("x").ref(),
            int_ptr("y").ref(),
            int_ptr("channels_in_file").ref(),
            int("desired_channels"),
            entrypoint = "stbi_load_from_memory"
        )
        +"stbi_load_from_callbacks"(
            stbi_uc_ptr,
            stbi_io_callbacks_const_ptr("clbk"),
            void_ptr("user"),
            int_ptr("x").ref(),
            int_ptr("y").ref(),
            int_ptr("channels_in_file").ref(),
            int("desired_channels"),
            entrypoint = "stbi_load_from_callbacks"
        ).overload()
        +"stbi_load"(
            stbi_uc_ptr,
            const_char_ptr("filename"),
            int_ptr("x").ref(),
            int_ptr("y").ref(),
            int_ptr("channels_in_file").ref(),
            int("desired_channels"),
            entrypoint = "stbi_load"
        ).overload()
        "stbi_load_gif_from_memory"(
            stbi_uc_ptr,
            stbi_uc_const_ptr("buffer"),
            int("len"),
            int_ptr_ptr("delays").ref(),
            int_ptr("x").ref(),
            int_ptr("y").ref(),
            int_ptr("z").ref(),
            int_ptr("comp").ref(),
            int("req_comp"),
            entrypoint = "stbi_load_gif_from_memory"
        )

        // 16-bits-per-channel interface
        "stbi_load_16_from_memory"(
            stbi_us_ptr,
            stbi_uc_const_ptr("buffer"),
            int("len"),
            int_ptr("x").ref(),
            int_ptr("y").ref(),
            int_ptr("channels_in_file").ref(),
            int("desired_channels"),
            entrypoint = "stbi_load_16_from_memory"
        )
        +"stbi_load_16_from_callbacks"(
            stbi_us_ptr,
            stbi_io_callbacks_const_ptr("clbk"),
            void_ptr("user"),
            int_ptr("x").ref(),
            int_ptr("y").ref(),
            int_ptr("channels_in_file").ref(),
            int("desired_channels"),
            entrypoint = "stbi_load_16_from_callbacks"
        ).overload()
        +"stbi_load_16"(
            stbi_us_ptr,
            const_char_ptr("filename"),
            int_ptr("x").ref(),
            int_ptr("y").ref(),
            int_ptr("channels_in_file").ref(),
            int("desired_channels"),
            entrypoint = "stbi_load_16"
        ).overload()

        // float-per-channel interface
        val float_ptr_ret = address c "float*"
        "stbi_loadf_from_memory"(
            float_ptr_ret,
            stbi_uc_const_ptr("buffer"),
            int("len"),
            int_ptr("x").ref(),
            int_ptr("y").ref(),
            int_ptr("channels_in_file").ref(),
            int("desired_channels"),
            entrypoint = "stbi_loadf_from_memory"
        )
        +"stbi_loadf_from_callbacks"(
            float_ptr_ret,
            stbi_io_callbacks_const_ptr("clbk"),
            void_ptr("user"),
            int_ptr("x").ref(),
            int_ptr("y").ref(),
            int_ptr("channels_in_file").ref(),
            int("desired_channels"),
            entrypoint = "stbi_loadf_from_callbacks"
        ).overload()
        +"stbi_loadf"(
            float_ptr_ret,
            const_char_ptr("filename"),
            int_ptr("x").ref(),
            int_ptr("y").ref(),
            int_ptr("channels_in_file").ref(),
            int("desired_channels"),
            entrypoint = "stbi_loadf"
        ).overload()

        "stbi_hdr_to_ldr_gamma"(void, float("gamma"), entrypoint = "stbi_hdr_to_ldr_gamma")
        "stbi_hdr_to_ldr_scale"(void, float("scale"), entrypoint = "stbi_hdr_to_ldr_scale")
        "stbi_ldr_to_hdr_gamma"(void, float("gamma"), entrypoint = "stbi_ldr_to_hdr_gamma")
        "stbi_ldr_to_hdr_scale"(void, float("scale"), entrypoint = "stbi_ldr_to_hdr_scale")
        +"stbi_is_hdr_from_callbacks"(
            boolean_int,
            stbi_io_callbacks_const_ptr("clbk"),
            void_ptr("user"),
            entrypoint = "stbi_is_hdr_from_callbacks"
        ).overload()
        "stbi_is_hdr_from_memory"(
            boolean_int,
            stbi_uc_const_ptr("buffer"),
            int("len"),
            entrypoint = "stbi_is_hdr_from_memory"
        )
        +"stbi_is_hdr"(
            boolean_int,
            const_char_ptr("filename"),
            entrypoint = "stbi_is_hdr"
        ).overload()

        +"stbi_failure_reason_"(
            const_char_ptr,
            entrypoint = "stbi_failure_reason",
            javadoc = """
                get a VERY brief reason for failure

                on most compilers (and ALL modern mainstream compilers) this is threadsafe
            """.trimIndent()
        ).overload(name = "stbi_failure_reason")
        "stbi_image_free"(
            void,
            void_ptr("retval_from_stbi_load"),
            entrypoint = "stbi_image_free",
            javadoc = "free the loaded image -- this is just free()"
        )

        // get image dimensions & components without fully decoding
        "stbi_info_from_memory"(
            boolean_int,
            stbi_uc_const_ptr("buffer"),
            int("len"),
            int_ptr("x").ref(),
            int_ptr("y").ref(),
            int_ptr("comp").ref(),
            entrypoint = "stbi_info_from_memory"
        )
        +"stbi_info_from_callbacks"(
            boolean_int,
            stbi_io_callbacks_const_ptr("clbk"),
            void_ptr("user"),
            int_ptr("x").ref(),
            int_ptr("y").ref(),
            int_ptr("comp").ref(),
            entrypoint = "stbi_info_from_callbacks"
        ).overload()
        "stbi_is_16_bit_from_memory"(
            boolean_int,
            stbi_uc_const_ptr("buffer"),
            int("len"),
            entrypoint = "stbi_is_16_bit_from_memory"
        )
        "stbi_is_16_bit_from_callbacks"(
            boolean_int,
            stbi_io_callbacks_const_ptr("clbk"),
            void_ptr("user"),
            entrypoint = "stbi_is_16_bit_from_callbacks"
        )
        +"stbi_info"(
            boolean_int,
            const_char_ptr("filename"),
            int_ptr("x").ref(),
            int_ptr("y").ref(),
            int_ptr("comp").ref(),
            entrypoint = "stbi_info"
        ).overload()
        +"stbi_is_16_bit"(
            boolean_int,
            const_char_ptr("filename"),
            entrypoint = "stbi_is_16_bit"
        ).overload()

        "stbi_set_unpremultiply_on_load"(
            void,
            boolean_int("flag_true_if_should_unpremultiply"),
            entrypoint = "stbi_set_unpremultiply_on_load",
            javadoc = """
                for image formats that explicitly notate that they have premultiplied alpha,
                we just return the colors as stored in the file. set this flag to force
                unpremultiplication. results are undefined if the unpremultiply overflow.
            """.trimIndent()
        )
        "stbi_convert_iphone_png_to_rgb"(
            void,
            boolean_int("flag_true_if_should_convert"),
            entrypoint = "stbi_convert_iphone_png_to_rgb",
            javadoc = """
                indicate whether we should process iphone images back to canonical format,
                or just pass them through "as-is"
            """.trimIndent()
        )
        "stbi_set_flip_vertically_on_load"(
            void,
            boolean_int("flag_true_if_should_flip"),
            entrypoint = "stbi_set_flip_vertically_on_load",
            javadoc = "flip the image vertically, so the first pixel in the output array is the bottom left"
        )

        "stbi_set_unpremultiply_on_load_thread"(
            void,
            boolean_int("flag_true_if_should_unpremultiply"),
            entrypoint = "stbi_set_unpremultiply_on_load"
        )
        "stbi_convert_iphone_png_to_rgb_thread"(
            void,
            boolean_int("flag_true_if_should_convert"),
            entrypoint = "stbi_convert_iphone_png_to_rgb"
        )
        "stbi_set_flip_vertically_on_load_thread"(
            void,
            boolean_int("flag_true_if_should_flip"),
            entrypoint = "stbi_set_flip_vertically_on_load"
        )

        "stbi_zlib_decode_malloc_guesssize"(
            char_ptr,
            const_char_ptr("buffer"),
            int("len"),
            int("initial_size"),
            int_ptr("outlen").ref(),
            entrypoint = "stbi_zlib_decode_malloc_guesssize"
        )
        "stbi_zlib_decode_malloc_guesssize_headerflag"(
            char_ptr,
            const_char_ptr("buffer"),
            int("len"),
            int("initial_size"),
            int_ptr("outlen").ref(),
            int("parse_header"),
            entrypoint = "stbi_zlib_decode_malloc_guesssize_headerflag"
        )
        "stbi_zlib_decode_malloc"(
            char_ptr,
            const_char_ptr("buffer"),
            int("len"),
            int_ptr("outlen").ref(),
            entrypoint = "stbi_zlib_decode_malloc"
        )
        "stbi_zlib_decode_buffer"(
            int,
            char_ptr("obuffer"),
            int("olen"),
            const_char_ptr("ibuffer"),
            int("ilen"),
            entrypoint = "stbi_zlib_decode_buffer"
        )
        "stbi_zlib_decode_noheader_malloc"(
            char_ptr,
            const_char_ptr("buffer"),
            int("len"),
            int_ptr("outlen"),
            entrypoint = "stbi_zlib_decode_noheader_malloc"
        )
        "stbi_zlib_decode_noheader_buffer"(
            int,
            char_ptr("obuffer"),
            int("olen"),
            const_char_ptr("ibuffer"),
            int("ilen"),
            entrypoint = "stbi_zlib_decode_noheader_buffer"
        )
    }
}
