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
            entrypoint = "stb_vorbis_get_info",
            javadoc = "get general information about the file"
        ).overload(name = "stb_vorbis_get_info")
        +"stb_vorbis_get_comment_"(
            stb_vorbis_comment,
            allocator("allocator"),
            stb_vorbis_ptr("f"),
            entrypoint = "stb_vorbis_get_comment",
            javadoc = "get ogg comments"
        ).overload(name = "stb_vorbis_get_comment")
        "stb_vorbis_get_error"(
            int,
            stb_vorbis_ptr("f"),
            entrypoint = "stb_vorbis_get_error",
            javadoc = "get the last error detected (clears it, too)"
        )
        "stb_vorbis_close"(
            void,
            stb_vorbis_ptr("f"),
            entrypoint = "stb_vorbis_close",
            javadoc = "close an ogg vorbis file and free all memory in use"
        )
        "stb_vorbis_get_sample_offset"(
            int,
            stb_vorbis_ptr("f"),
            entrypoint = "stb_vorbis_get_sample_offset",
            javadoc = """
                this function returns the offset (in samples) from the beginning of the
                file that will be returned by the next decode, if it is known, or -1
                otherwise. after a flush_pushdata() call, this may take a while before
                it becomes valid again.

                NOT WORKING YET after a seek with PULLDATA API
            """.trimIndent()
        )
        "stb_vorbis_get_file_offset"(
            uint,
            stb_vorbis_ptr("f"),
            entrypoint = "stb_vorbis_get_file_offset",
            javadoc = """
                @return the current seek point within the file, or offset from the beginning
                of the memory buffer. In pushdata mode it returns 0.
            """.trimIndent()
        )


        // PUSHDATA API
        +"stb_vorbis_open_pushdata"(
            stb_vorbis_ptr,
            const_uchar_ptr("datablock"), int("datablock_length_in_bytes"),
            int_ptr("datablock_memory_consumed_in_bytes").ref(),
            int_ptr("error").ref(),
            const_stb_vorbis_alloc_ptr("alloc_buffer"),
            entrypoint = "stb_vorbis_open_pushdata",
            javadoc = """
                create a vorbis decoder by passing in the initial data block containing
                the ogg&vorbis headers (you don't need to do parse them, just provide
                the first N bytes of the file--you're told if it's not enough, see below)

                on success, returns an stb_vorbis *, does not set error, returns the amount of
                data parsed/consumed on this call in *datablock_memory_consumed_in_bytes;

                on failure, returns NULL on error and sets *error, does not change *datablock_memory_consumed

                if returns NULL and *error is VORBIS_need_more_data, then the input block was
                incomplete and you need to pass in a larger block from the start of the file
            """.trimIndent()
        ).overload()
        "stb_vorbis_decode_frame_pushdata"(
            int,
            stb_vorbis_ptr("f"),
            const_uchar_ptr("datablock"), int("datablock_length_in_bytes"),
            int_ptr("channels").ref(),
            float_ptr_ptr_ptr("output").ref(),
            int_ptr("samples").ref(),
            entrypoint = "stb_vorbis_decode_frame_pushdata",
            javadoc = """
                decode a frame of audio sample data if possible from the passed-in data block

                possible cases:
                - 0 bytes used, 0 samples output (need more data)
                - N bytes used, 0 samples output (resynching the stream, keep going)
                - N bytes used, M samples output (one frame of data)

                note that after opening a file, you will ALWAYS get one N-bytes,0-sample
                frame, because Vorbis always "discards" the first frame.

                Note that on resynch, stb_vorbis will rarely consume all of the buffer,
                instead only datablock_length_in_bytes-3 or less. This is because it wants
                to avoid missing parts of a page header if they cross a datablock boundary,
                without writing state-machiney code to record a partial detection.

                The number of channels returned are stored in *channels (which can be
                NULL--it is always the same as the number of channels reported by
                get_info). *output will contain an array of float* buffers, one per
                channel. In other words, (*output)[0][0] contains the first sample from
                the first channel, and (*output)[1][0] contains the first sample from
                the second channel.

                *output points into stb_vorbis's internal output buffer storage; these
                buffers are owned by stb_vorbis and application code should not free
                them or modify their contents. They are transient and will be overwritten
                once you ask for more data to get decoded, so be sure to grab any data
                you need before then.

                @param channels place to write number of float * buffers
                @param output   place to write float ** array of float * buffers
                @param samples  place to write number of output samples
                @return number of bytes we used from datablock
            """.trimIndent()
        )
        "stb_vorbis_flush_pushdata"(
            void,
            stb_vorbis_ptr("f"),
            entrypoint = "stb_vorbis_flush_pushdata",
            javadoc = """
                inform stb_vorbis that your next datablock will not be contiguous with
                previous ones (e.g. you've seeked in the data); future attempts to decode
                frames will cause stb_vorbis to resynchronize (as noted above), and
                once it sees a valid Ogg page (typically 4-8KB, as large as 64KB), it
                will begin decoding the _next_ frame.

                if you want to seek using pushdata, you need to seek in your file, then
                call stb_vorbis_flush_pushdata(), then start calling decoding, then once
                decoding is returning you data, call stb_vorbis_get_sample_offset, and
                if you don't like the result, seek your file again and repeat.
            """.trimIndent()
        )


        // PULLING INPUT API
        val doc_decode = """
            decode an entire file and output the data interleaved into a malloc()ed
            buffer stored in *output. The return value is the number of samples
            decoded, or -1 if the file could not be opened or was not an ogg vorbis file.
            When you're done with it, just free() the pointer returned in *output.
        """.trimIndent()
        "stb_vorbis_decode_filename"(
            int,
            const_char_ptr("filename"),
            int_ptr("channels").ref(),
            int_ptr("sample_rate").ref(),
            short_ptr_ptr("output").ref(),
            entrypoint = "stb_vorbis_decode_filename",
            javadoc = doc_decode
        )
        "stb_vorbis_decode_memory"(
            int,
            const_uchar_ptr("mem"),
            int("len"),
            int_ptr("channels").ref(),
            int_ptr("sample_rate").ref(),
            short_ptr_ptr("output").ref(),
            entrypoint = "stb_vorbis_decode_memory",
            javadoc = doc_decode
        )
        +"stb_vorbis_open_memory"(
            stb_vorbis_ptr,
            const_uchar_ptr("data"),
            int("len"),
            int_ptr("error").ref(),
            const_stb_vorbis_alloc_ptr("alloc_buffer"),
            entrypoint = "stb_vorbis_open_memory",
            javadoc = """
                create an ogg vorbis decoder from an ogg vorbis stream in memory (note
                this must be the entire stream!). on failure, returns NULL and sets *error
            """.trimIndent()
        ).overload()
        +"stb_vorbis_open_filename"(
            stb_vorbis_ptr,
            const_char_ptr("filename"),
            int_ptr("error").ref(),
            const_stb_vorbis_alloc_ptr("alloc_buffer"),
            entrypoint = "stb_vorbis_open_filename",
            javadoc = """
                create an ogg vorbis decoder from a filename via fopen(). on failure,
                returns NULL and sets *error (possibly to VORBIS_file_open_failure).
            """.trimIndent()
        ).overload()
        val doc_seek = """
            these functions seek in the Vorbis file to (approximately) 'sample_number'.
            after calling seek_frame(), the next call to get_frame_*() will include
            the specified sample. after calling stb_vorbis_seek(), the next call to
            stb_vorbis_get_samples_* will start with the specified sample. If you
            do not need to seek to EXACTLY the target sample when using get_samples_*,
            you can also use seek_frame().
        """.trimIndent()
        "stb_vorbis_seek_frame"(
            int,
            stb_vorbis_ptr("f"),
            uint("sample_number"),
            entrypoint = "stb_vorbis_seek_frame",
            javadoc = doc_seek
        )
        "stb_vorbis_seek"(
            int,
            stb_vorbis_ptr("f"),
            uint("sample_number"),
            entrypoint = "stb_vorbis_seek",
            javadoc = doc_seek
        )
        "stb_vorbis_seek_start"(
            int,
            stb_vorbis_ptr("f"),
            entrypoint = "stb_vorbis_seek_start",
            javadoc = "this function is equivalent to stb_vorbis_seek(f,0)"
        )
        val doc_stream_len = "these functions return the total length of the vorbis stream"
        "stb_vorbis_stream_length_in_samples"(
            uint,
            stb_vorbis_ptr("f"),
            entrypoint = "stb_vorbis_stream_length_in_samples",
            javadoc = doc_stream_len
        )
        "stb_vorbis_stream_length_in_seconds"(
            float,
            stb_vorbis_ptr("f"),
            entrypoint = "stb_vorbis_stream_length_in_seconds",
            javadoc = doc_stream_len
        )
        "stb_vorbis_get_frame_float"(
            int,
            stb_vorbis_ptr("f"),
            int_ptr("channels").ref(),
            float_ptr_ptr_ptr("output").ref(),
            entrypoint = "stb_vorbis_get_frame_float",
            javadoc = """
                decode the next frame and return the number of samples. the number of
                channels returned are stored in *channels (which can be NULL--it is always
                the same as the number of channels reported by get_info). *output will
                contain an array of float* buffers, one per channel. These outputs will
                be overwritten on the next call to stb_vorbis_get_frame_*.

                You generally should not intermix calls to stb_vorbis_get_frame_*()
                and stb_vorbis_get_samples_*(), since the latter calls the former.
            """.trimIndent()
        )
        val doc_get_frame_short = """
            decode the next frame and return the number of *samples* per channel.
            Note that for interleaved data, you pass in the number of shorts (the
            size of your array), but the return value is the number of samples per
            channel, not the total number of samples.

            The data is coerced to the number of channels you request according to the
            channel coercion rules (see below). You must pass in the size of your
            buffer(s) so that stb_vorbis will not overwrite the end of the buffer.
            The maximum buffer size needed can be gotten from get_info(); however,
            the Vorbis I specification implies an absolute maximum of 4096 samples
            per channel.
        """.trimIndent()
        "stb_vorbis_get_frame_short_interleaved"(
            int,
            stb_vorbis_ptr("f"),
            int("num_c"),
            short_ptr("buffer").ref(),
            int("num_shorts"),
            entrypoint = "stb_vorbis_get_frame_short_interleaved",
            javadoc = doc_get_frame_short
        )
        "stb_vorbis_get_frame_short"(
            int,
            stb_vorbis_ptr("f"),
            int("num_c"),
            short_ptr_ptr("buffer").ref(),
            int("num_samples"),
            entrypoint = "stb_vorbis_get_frame_short",
            javadoc = doc_get_frame_short
        )
        val doc_get_samples_float = """
            gets num_samples samples, not necessarily on a frame boundary--this requires
            buffering so you have to supply the buffers. DOES NOT APPLY THE COERCION RULES.
            @return the number of samples stored per channel; it may be less than requested
            at the end of the file. If there are no more samples in the file, returns 0.
        """.trimIndent()
        "stb_vorbis_get_samples_float_interleaved"(
            int,
            stb_vorbis_ptr("f"),
            int("channels"),
            float_ptr("buffer").ref(),
            int("num_floats"),
            entrypoint = "stb_vorbis_get_samples_float_interleaved",
            javadoc = doc_get_samples_float
        )
        "stb_vorbis_get_samples_float"(
            int,
            stb_vorbis_ptr("f"),
            int("channels"),
            float_ptr_ptr("buffer").ref(),
            int("num_samples"),
            entrypoint = "stb_vorbis_get_samples_float",
            javadoc = doc_get_samples_float
        )
        val doc_get_samples_short = """
            gets num_samples samples, not necessarily on a frame boundary--this requires
            buffering so you have to supply the buffers. Applies the coercion rules above
            to produce 'channels' channels.
            @return the number of samples stored per channel;
            it may be less than requested at the end of the file. If there are no more
            samples in the file, returns 0.
        """.trimIndent()
        "stb_vorbis_get_samples_short_interleaved"(
            int,
            stb_vorbis_ptr("f"),
            int("channels"),
            short_ptr("buffer").ref(),
            int("num_shorts"),
            entrypoint = "stb_vorbis_get_samples_short_interleaved",
            javadoc = doc_get_samples_short
        )
        "stb_vorbis_get_samples_short"(
            int,
            stb_vorbis_ptr("f"),
            int("channels"),
            short_ptr_ptr("buffer").ref(),
            int("num_samples"),
            entrypoint = "stb_vorbis_get_samples_short",
            javadoc = doc_get_samples_short
        )

        int(
            javadoc = """
                STBVorbisError

                from 20: decoding errors (corrupt/invalid stream) -- you probably
                don't care about the exact details of these
            """.trimIndent()
        ) {
            "VORBIS__no_error"("0")

            "VORBIS_need_more_data"("1", javadoc = "not a real error")

            "VORBIS_invalid_api_mixing"("2", javadoc = "can't mix API modes")
            "VORBIS_outofmem"("3", javadoc = "not enough memory")
            "VORBIS_feature_not_supported"("4", javadoc = "uses floor 0")
            "VORBIS_too_many_channels"("5", javadoc = "STB_VORBIS_MAX_CHANNELS is too small")
            "VORBIS_file_open_failure"("6", javadoc = "fopen() failed")
            "VORBIS_seek_without_length"("7", javadoc = "can't seek in unknown-length file")

            "VORBIS_unexpected_eof"("10", javadoc = "file is truncated?")
            "VORBIS_seek_invalid"("11", javadoc = "seek past EOF")

            val doc_vorbis_err = "vorbis errors"
            "VORBIS_invalid_setup"("20", javadoc = doc_vorbis_err)
            "VORBIS_invalid_stream"("21", javadoc = doc_vorbis_err)

            val doc_ogg_err = "ogg errors"
            "VORBIS_missing_capture_pattern"("30", javadoc = doc_ogg_err)
            "VORBIS_invalid_stream_structure_version"("31", javadoc = doc_ogg_err)
            "VORBIS_continued_packet_flag_invalid"("32", javadoc = doc_ogg_err)
            "VORBIS_incorrect_stream_serial_number"("33", javadoc = doc_ogg_err)
            "VORBIS_invalid_first_page"("34", javadoc = doc_ogg_err)
            "VORBIS_bad_packet_type"("35", javadoc = doc_ogg_err)
            "VORBIS_cant_find_last_page"("36", javadoc = doc_ogg_err)
            "VORBIS_seek_failed"("37", javadoc = doc_ogg_err)
            "VORBIS_ogg_skeleton_not_supported"("38", javadoc = doc_ogg_err)
        }
    }
}
