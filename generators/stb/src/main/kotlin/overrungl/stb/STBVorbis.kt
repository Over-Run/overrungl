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

val char_ptr_ptr = address c "char **"
val stb_vorbis_ptr = address c "stb_vorbis *"
val float_ptr_ptr_ptr = address c "float ***"
val short_ptr_ptr = address c "short **"
val float_ptr_ptr = address c "float **"

fun STBVorbis() {
    val const_stb_vorbis_alloc_ptr = Struct(stbPackage, "STBVorbisAlloc", cType = "stb_vorbis_alloc") {
        (address c "char *")("alloc_buffer")
        int("alloc_buffer_length_in_bytes")
    }.pointerType c "const stb_vorbis_alloc *"
    val stb_vorbis_info = Struct(stbPackage, "STBVorbisInfo", cType = "stb_vorbis_info") {
        uint("sample_rate")
        int("channels")
        uint("setup_memory_required")
        uint("setup_temp_memory_required")
        uint("temp_memory_required")
        int("max_frame_size")
    }.byValueType
    val stb_vorbis_comment = Struct(stbPackage, "STBVorbisComment", cType = "stb_vorbis_comment") {
        (string_u8 c "char *")("vendor")
        int("comment_list_length")
        char_ptr_ptr("comment_list")
    }.byValueType

    StaticDowncall(stbPackage, "STBVorbis", symbolLookup = stbLookup) {
        // FUNCTIONS USEABLE WITH ALL INPUT MODES
        +"stb_vorbis_get_info_"(
            stb_vorbis_info,
            allocator("allocator"),
            stb_vorbis_ptr("f"),
            entrypoint = "stb_vorbis_get_info"
        ).overload(name = "stb_vorbis_get_info")
        +"stb_vorbis_get_comment_"(
            stb_vorbis_comment,
            allocator("allocator"),
            stb_vorbis_ptr("f"),
            entrypoint = "stb_vorbis_get_comment"
        ).overload(name = "stb_vorbis_get_comment")
        "stb_vorbis_get_error"(int, stb_vorbis_ptr("f"), entrypoint = "stb_vorbis_get_error")
        "stb_vorbis_close"(void, stb_vorbis_ptr("f"), entrypoint = "stb_vorbis_close")
        "stb_vorbis_get_sample_offset"(int, stb_vorbis_ptr("f"), entrypoint = "stb_vorbis_get_sample_offset")
        "stb_vorbis_get_file_offset"(uint, stb_vorbis_ptr("f"), entrypoint = "stb_vorbis_get_file_offset")


        // PUSHDATA API
        +"stb_vorbis_open_pushdata"(
            stb_vorbis_ptr,
            const_uchar_ptr("datablock"), int("datablock_length_in_bytes"),
            int_ptr("datablock_memory_consumed_in_bytes").ref(),
            int_ptr("error").ref(),
            const_stb_vorbis_alloc_ptr("alloc_buffer"),
            entrypoint = "stb_vorbis_open_pushdata"
        ).overload()
        "stb_vorbis_decode_frame_pushdata"(
            int,
            stb_vorbis_ptr("f"),
            const_uchar_ptr("datablock"), int("datablock_length_in_bytes"),
            int_ptr("channels").ref(),
            float_ptr_ptr_ptr("output").ref(),
            int_ptr("samples").ref(),
            entrypoint = "stb_vorbis_decode_frame_pushdata"
        )
        "stb_vorbis_flush_pushdata"(void, stb_vorbis_ptr("f"), entrypoint = "stb_vorbis_flush_pushdata")


        // PULLING INPUT API
        "stb_vorbis_decode_filename"(
            int,
            const_char_ptr("filename"),
            int_ptr("channels").ref(),
            int_ptr("sample_rate").ref(),
            short_ptr_ptr("output").ref(),
            entrypoint = "stb_vorbis_decode_filename"
        )
        "stb_vorbis_decode_memory"(
            int,
            const_uchar_ptr("mem"),
            int("len"),
            int_ptr("channels").ref(),
            int_ptr("sample_rate").ref(),
            short_ptr_ptr("output").ref(),
            entrypoint = "stb_vorbis_decode_memory"
        )
        +"stb_vorbis_open_memory"(
            stb_vorbis_ptr,
            const_uchar_ptr("data"),
            int("len"),
            int_ptr("error").ref(),
            const_stb_vorbis_alloc_ptr("alloc_buffer"),
            entrypoint = "stb_vorbis_open_memory"
        ).overload()
        +"stb_vorbis_open_filename"(
            stb_vorbis_ptr,
            const_char_ptr("filename"),
            int_ptr("error").ref(),
            const_stb_vorbis_alloc_ptr("alloc_buffer"),
            entrypoint = "stb_vorbis_open_filename"
        ).overload()
        "stb_vorbis_seek_frame"(
            int,
            stb_vorbis_ptr("f"),
            uint("sample_number"),
            entrypoint = "stb_vorbis_seek_frame"
        )
        "stb_vorbis_seek"(
            int,
            stb_vorbis_ptr("f"),
            uint("sample_number"),
            entrypoint = "stb_vorbis_seek"
        )
        "stb_vorbis_seek_start"(
            int,
            stb_vorbis_ptr("f"),
            entrypoint = "stb_vorbis_seek_start"
        )
        "stb_vorbis_stream_length_in_samples"(
            uint,
            stb_vorbis_ptr("f"),
            entrypoint = "stb_vorbis_stream_length_in_samples"
        )
        "stb_vorbis_stream_length_in_seconds"(
            float,
            stb_vorbis_ptr("f"),
            entrypoint = "stb_vorbis_stream_length_in_seconds"
        )
        "stb_vorbis_get_frame_float"(
            int,
            stb_vorbis_ptr("f"),
            int_ptr("channels").ref(),
            float_ptr_ptr_ptr("output").ref(),
            entrypoint = "stb_vorbis_get_frame_float"
        )
        "stb_vorbis_get_frame_short_interleaved"(
            int,
            stb_vorbis_ptr("f"),
            int("num_c"),
            short_ptr("buffer").ref(),
            int("num_shorts"),
            entrypoint = "stb_vorbis_get_frame_short_interleaved"
        )
        "stb_vorbis_get_frame_short"(
            int,
            stb_vorbis_ptr("f"),
            int("num_c"),
            short_ptr_ptr("buffer").ref(),
            int("num_samples"),
            entrypoint = "stb_vorbis_get_frame_short"
        )
        "stb_vorbis_get_samples_float_interleaved"(
            int,
            stb_vorbis_ptr("f"),
            int("channels"),
            float_ptr("buffer").ref(),
            int("num_floats"),
            entrypoint = "stb_vorbis_get_samples_float_interleaved"
        )
        "stb_vorbis_get_samples_float"(
            int,
            stb_vorbis_ptr("f"),
            int("channels"),
            float_ptr_ptr("buffer").ref(),
            int("num_samples"),
            entrypoint = "stb_vorbis_get_samples_float"
        )
        "stb_vorbis_get_samples_short_interleaved"(
            int,
            stb_vorbis_ptr("f"),
            int("channels"),
            short_ptr("buffer").ref(),
            int("num_shorts"),
            entrypoint = "stb_vorbis_get_samples_short_interleaved"
        )
        "stb_vorbis_get_samples_short"(
            int,
            stb_vorbis_ptr("f"),
            int("channels"),
            short_ptr_ptr("buffer").ref(),
            int("num_samples"),
            entrypoint = "stb_vorbis_get_samples_short"
        )

        int {
            "VORBIS__no_error"("0")

            "VORBIS_need_more_data"("1")

            "VORBIS_invalid_api_mixing"("2")
            "VORBIS_outofmem"("3")
            "VORBIS_feature_not_supported"("4")
            "VORBIS_too_many_channels"("5")
            "VORBIS_file_open_failure"("6")
            "VORBIS_seek_without_length"("7")

            "VORBIS_unexpected_eof"("10")
            "VORBIS_seek_invalid"("11")

            "VORBIS_invalid_setup"("20")
            "VORBIS_invalid_stream"("21")

            "VORBIS_missing_capture_pattern"("30")
            "VORBIS_invalid_stream_structure_version"("31")
            "VORBIS_continued_packet_flag_invalid"("32")
            "VORBIS_incorrect_stream_serial_number"("33")
            "VORBIS_invalid_first_page"("34")
            "VORBIS_bad_packet_type"("35")
            "VORBIS_cant_find_last_page"("36")
            "VORBIS_seek_failed"("37")
            "VORBIS_ogg_skeleton_not_supported"("38")
        }
    }
}
