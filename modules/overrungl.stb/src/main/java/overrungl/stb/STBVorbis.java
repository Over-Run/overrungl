/*
 * MIT License
 *
 * Copyright (c) 2023-2024 Overrun Organization
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

package overrungl.stb;

import overrungl.annotation.CType;
import overrungl.annotation.Out;
import overrungl.internal.RuntimeHelper;
import overrungl.util.Marshal;
import overrungl.util.MemoryStack;
import overrungl.util.Unmarshal;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

/// ## THREAD SAFETY
/// Individual stb_vorbis* handles are not thread-safe; you cannot decode from
/// them from multiple threads at the same time. However, you can have multiple
/// stb_vorbis* handles and decode from them independently in multiple thrads.
///
/// ## MEMORY ALLOCATION
/// normally stb_vorbis uses malloc() to allocate memory at startup,
/// and alloca() to allocate temporary memory during a frame on the
/// stack.
/// (Memory consumption will depend on the amount of setup
/// data in the file and how you set the compile flags for speed
/// vs. size. In my test files the maximal-size usage is ~150KB.)
///
/// You can modify the wrapper functions in the source (setup_malloc,
/// setup_temp_malloc, temp_malloc) to change this behavior, or you
/// can use a simpler allocation model: you pass in a buffer from
/// which stb_vorbis will allocate _all_ its memory (including the
/// temp memory).
/// "open" may fail with a VORBIS_outofmem if you
/// do not pass in enough data; there is no way to determine how
/// much you do need except to succeed (at which point you can
/// query get_info to find the exact amount required. yes I know
/// this is lame).
///
/// If you pass in a non-NULL buffer of the type below, allocation
/// will occur from it as described above.
/// Otherwise just pass NULL
/// to use malloc()/alloca()
///
/// ## PUSHDATA API
/// this API allows you to get blocks of data from any source and hand
/// them to stb_vorbis. you have to buffer them; stb_vorbis will tell
/// you how much it used, and you have to give it the rest next time;
/// and stb_vorbis may not have enough data to work with and you will
/// need to give it the same data again PLUS more. Note that the Vorbis
/// specification does not bound the size of an individual frame.
///
/// ## PULLING INPUT API
/// This API assumes stb_vorbis is allowed to pull data from a source--
/// either a block of memory containing the _entire_ vorbis stream, or a
/// FILE * that you or it create, or possibly some other reading mechanism
/// if you go modify the source to replace the FILE * case with some kind
/// of callback to your code. (But if you don't support seeking, you may
/// just want to go ahead and use pushdata.)
///
/// ## Channel coercion rules
/// Let M be the number of channels requested, and N the number of channels present,
/// and Cn be the nth channel; let stereo L be the sum of all L and center channels,
/// and stereo R be the sum of all R and center channels (channel assignment from the
/// vorbis spec).
/// | M | N |                output                |
/// |---|---|--------------------------------------|
/// | 1 | k | sum(Ck) for all k                    |
/// | 2 | * | stereo L, stereo R                   |
/// | k | l | k > l, the first l channels, then 0s |
/// | k | l | k <= l, the first k channels         |
/// Note that this is not _good_ surround etc. mixing at all! It's just so
/// you get something useful.
///
/// @author squid233
/// @since 0.1.0
public final class STBVorbis {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    ///STBVorbisError
    ///
    ///from 20: decoding errors (corrupt/invalid stream) -- you probably
    ///don't care about the exact details of these
    ///#### Documentation of fields
    ///##### VORBIS_need_more_data
    ///not a real error
    ///##### VORBIS_invalid_api_mixing
    ///can't mix API modes
    ///##### VORBIS_outofmem
    ///not enough memory
    ///##### VORBIS_feature_not_supported
    ///uses floor 0
    ///##### VORBIS_too_many_channels
    ///STB_VORBIS_MAX_CHANNELS is too small
    ///##### VORBIS_file_open_failure
    ///fopen() failed
    ///##### VORBIS_seek_without_length
    ///can't seek in unknown-length file
    ///##### VORBIS_unexpected_eof
    ///file is truncated?
    ///##### VORBIS_seek_invalid
    ///seek past EOF
    ///##### VORBIS_invalid_setup
    ///vorbis errors
    ///##### VORBIS_invalid_stream
    ///vorbis errors
    ///##### VORBIS_missing_capture_pattern
    ///ogg errors
    ///##### VORBIS_invalid_stream_structure_version
    ///ogg errors
    ///##### VORBIS_continued_packet_flag_invalid
    ///ogg errors
    ///##### VORBIS_incorrect_stream_serial_number
    ///ogg errors
    ///##### VORBIS_invalid_first_page
    ///ogg errors
    ///##### VORBIS_bad_packet_type
    ///ogg errors
    ///##### VORBIS_cant_find_last_page
    ///ogg errors
    ///##### VORBIS_seek_failed
    ///ogg errors
    ///##### VORBIS_ogg_skeleton_not_supported
    ///ogg errors
    public static final int
        VORBIS__no_error = 0,
        VORBIS_need_more_data = 1,
        VORBIS_invalid_api_mixing = 2,
        VORBIS_outofmem = 3,
        VORBIS_feature_not_supported = 4,
        VORBIS_too_many_channels = 5,
        VORBIS_file_open_failure = 6,
        VORBIS_seek_without_length = 7,
        VORBIS_unexpected_eof = 10,
        VORBIS_seek_invalid = 11,
        VORBIS_invalid_setup = 20,
        VORBIS_invalid_stream = 21,
        VORBIS_missing_capture_pattern = 30,
        VORBIS_invalid_stream_structure_version = 31,
        VORBIS_continued_packet_flag_invalid = 32,
        VORBIS_incorrect_stream_serial_number = 33,
        VORBIS_invalid_first_page = 34,
        VORBIS_bad_packet_type = 35,
        VORBIS_cant_find_last_page = 36,
        VORBIS_seek_failed = 37,
        VORBIS_ogg_skeleton_not_supported = 38;
    //endregion
    //region Method handles
    /// The method handle of `stb_vorbis_get_info`.
    public static final MethodHandle MH_stb_vorbis_get_info = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_get_info", FunctionDescriptor.of(overrungl.stb.STBVorbisInfo.LAYOUT, ValueLayout.ADDRESS));
    /// The method handle of `stb_vorbis_get_comment`.
    public static final MethodHandle MH_stb_vorbis_get_comment = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_get_comment", FunctionDescriptor.of(overrungl.stb.STBVorbisComment.LAYOUT, ValueLayout.ADDRESS));
    /// The method handle of `stb_vorbis_get_error`.
    public static final MethodHandle MH_stb_vorbis_get_error = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_get_error", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    /// The method handle of `stb_vorbis_close`.
    public static final MethodHandle MH_stb_vorbis_close = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_close", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    /// The method handle of `stb_vorbis_get_sample_offset`.
    public static final MethodHandle MH_stb_vorbis_get_sample_offset = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_get_sample_offset", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    /// The method handle of `stb_vorbis_get_file_offset`.
    public static final MethodHandle MH_stb_vorbis_get_file_offset = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_get_file_offset", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    /// The method handle of `stb_vorbis_open_pushdata`.
    public static final MethodHandle MH_stb_vorbis_open_pushdata = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_open_pushdata", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBVorbisAlloc.LAYOUT)));
    /// The method handle of `stb_vorbis_decode_frame_pushdata`.
    public static final MethodHandle MH_stb_vorbis_decode_frame_pushdata = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_decode_frame_pushdata", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `stb_vorbis_flush_pushdata`.
    public static final MethodHandle MH_stb_vorbis_flush_pushdata = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_flush_pushdata", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    /// The method handle of `stb_vorbis_decode_filename`.
    public static final MethodHandle MH_stb_vorbis_decode_filename = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_decode_filename", FunctionDescriptor.of(ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `stb_vorbis_decode_memory`.
    public static final MethodHandle MH_stb_vorbis_decode_memory = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_decode_memory", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `stb_vorbis_open_memory`.
    public static final MethodHandle MH_stb_vorbis_open_memory = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_open_memory", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBVorbisAlloc.LAYOUT)));
    /// The method handle of `stb_vorbis_open_filename`.
    public static final MethodHandle MH_stb_vorbis_open_filename = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_open_filename", FunctionDescriptor.of(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBVorbisAlloc.LAYOUT)));
    /// The method handle of `stb_vorbis_seek_frame`.
    public static final MethodHandle MH_stb_vorbis_seek_frame = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_seek_frame", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `stb_vorbis_seek`.
    public static final MethodHandle MH_stb_vorbis_seek = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_seek", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `stb_vorbis_seek_start`.
    public static final MethodHandle MH_stb_vorbis_seek_start = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_seek_start", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    /// The method handle of `stb_vorbis_stream_length_in_samples`.
    public static final MethodHandle MH_stb_vorbis_stream_length_in_samples = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_stream_length_in_samples", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    /// The method handle of `stb_vorbis_stream_length_in_seconds`.
    public static final MethodHandle MH_stb_vorbis_stream_length_in_seconds = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_stream_length_in_seconds", FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS));
    /// The method handle of `stb_vorbis_get_frame_float`.
    public static final MethodHandle MH_stb_vorbis_get_frame_float = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_get_frame_float", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `stb_vorbis_get_frame_short_interleaved`.
    public static final MethodHandle MH_stb_vorbis_get_frame_short_interleaved = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_get_frame_short_interleaved", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `stb_vorbis_get_frame_short`.
    public static final MethodHandle MH_stb_vorbis_get_frame_short = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_get_frame_short", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `stb_vorbis_get_samples_float_interleaved`.
    public static final MethodHandle MH_stb_vorbis_get_samples_float_interleaved = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_get_samples_float_interleaved", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `stb_vorbis_get_samples_float`.
    public static final MethodHandle MH_stb_vorbis_get_samples_float = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_get_samples_float", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `stb_vorbis_get_samples_short_interleaved`.
    public static final MethodHandle MH_stb_vorbis_get_samples_short_interleaved = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_get_samples_short_interleaved", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `stb_vorbis_get_samples_short`.
    public static final MethodHandle MH_stb_vorbis_get_samples_short = RuntimeHelper.downcall(Handles.lookup, "stb_vorbis_get_samples_short", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    //endregion

    ///get general information about the file
    public static @CType("stb_vorbis_info") java.lang.foreign.MemorySegment stb_vorbis_get_info_(java.lang.foreign.SegmentAllocator allocator, @CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            return (java.lang.foreign.MemorySegment) MH_stb_vorbis_get_info.invokeExact(allocator, f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_info", e); }
    }

    ///get general information about the file
    public static @CType("stb_vorbis_info") overrungl.stb.STBVorbisInfo stb_vorbis_get_info(java.lang.foreign.SegmentAllocator allocator, @CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            return overrungl.stb.STBVorbisInfo.of((java.lang.foreign.MemorySegment) MH_stb_vorbis_get_info.invokeExact(allocator, f));
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_info", e); }
    }

    ///get ogg comments
    public static @CType("stb_vorbis_comment") java.lang.foreign.MemorySegment stb_vorbis_get_comment_(java.lang.foreign.SegmentAllocator allocator, @CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            return (java.lang.foreign.MemorySegment) MH_stb_vorbis_get_comment.invokeExact(allocator, f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_comment", e); }
    }

    ///get ogg comments
    public static @CType("stb_vorbis_comment") overrungl.stb.STBVorbisComment stb_vorbis_get_comment(java.lang.foreign.SegmentAllocator allocator, @CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            return overrungl.stb.STBVorbisComment.of((java.lang.foreign.MemorySegment) MH_stb_vorbis_get_comment.invokeExact(allocator, f));
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_comment", e); }
    }

    ///get the last error detected (clears it, too)
    public static @CType("int") int stb_vorbis_get_error(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            return (int) MH_stb_vorbis_get_error.invokeExact(f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_error", e); }
    }

    ///close an ogg vorbis file and free all memory in use
    public static void stb_vorbis_close(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            MH_stb_vorbis_close.invokeExact(f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_close", e); }
    }

    ///this function returns the offset (in samples) from the beginning of the
    ///file that will be returned by the next decode, if it is known, or -1
    ///otherwise. after a flush_pushdata() call, this may take a while before
    ///it becomes valid again.
    ///
    ///NOT WORKING YET after a seek with PULLDATA API
    public static @CType("int") int stb_vorbis_get_sample_offset(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            return (int) MH_stb_vorbis_get_sample_offset.invokeExact(f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_sample_offset", e); }
    }

    ///@return the current seek point within the file, or offset from the beginning
    ///of the memory buffer. In pushdata mode it returns 0.
    public static @CType("unsigned int") int stb_vorbis_get_file_offset(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            return (int) MH_stb_vorbis_get_file_offset.invokeExact(f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_file_offset", e); }
    }

    ///create a vorbis decoder by passing in the initial data block containing
    ///the ogg&vorbis headers (you don't need to do parse them, just provide
    ///the first N bytes of the file--you're told if it's not enough, see below)
    ///
    ///on success, returns an stb_vorbis *, does not set error, returns the amount of
    ///data parsed/consumed on this call in *datablock_memory_consumed_in_bytes;
    ///
    ///on failure, returns NULL on error and sets *error, does not change *datablock_memory_consumed
    ///
    ///if returns NULL and *error is VORBIS_need_more_data, then the input block was
    ///incomplete and you need to pass in a larger block from the start of the file
    public static @CType("stb_vorbis *") java.lang.foreign.MemorySegment stb_vorbis_open_pushdata(@CType("const unsigned char *") java.lang.foreign.MemorySegment datablock, @CType("int") int datablock_length_in_bytes, @Out @CType("int*") java.lang.foreign.MemorySegment datablock_memory_consumed_in_bytes, @Out @CType("int*") java.lang.foreign.MemorySegment error, @CType("const stb_vorbis_alloc *") java.lang.foreign.MemorySegment alloc_buffer) {
        try {
            return (java.lang.foreign.MemorySegment) MH_stb_vorbis_open_pushdata.invokeExact(datablock, datablock_length_in_bytes, datablock_memory_consumed_in_bytes, error, alloc_buffer);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_pushdata", e); }
    }

    ///create a vorbis decoder by passing in the initial data block containing
    ///the ogg&vorbis headers (you don't need to do parse them, just provide
    ///the first N bytes of the file--you're told if it's not enough, see below)
    ///
    ///on success, returns an stb_vorbis *, does not set error, returns the amount of
    ///data parsed/consumed on this call in *datablock_memory_consumed_in_bytes;
    ///
    ///on failure, returns NULL on error and sets *error, does not change *datablock_memory_consumed
    ///
    ///if returns NULL and *error is VORBIS_need_more_data, then the input block was
    ///incomplete and you need to pass in a larger block from the start of the file
    public static @CType("stb_vorbis *") java.lang.foreign.MemorySegment stb_vorbis_open_pushdata(@CType("const unsigned char *") java.lang.foreign.MemorySegment datablock, @CType("int") int datablock_length_in_bytes, @Out @CType("int*") int[] datablock_memory_consumed_in_bytes, @Out @CType("int*") int[] error, @CType("const stb_vorbis_alloc *") overrungl.stb.STBVorbisAlloc alloc_buffer) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_datablock_memory_consumed_in_bytes = Marshal.marshal(__overrungl_stack, datablock_memory_consumed_in_bytes);
            var __overrungl_ref_error = Marshal.marshal(__overrungl_stack, error);
            var __overrungl_result = (java.lang.foreign.MemorySegment) MH_stb_vorbis_open_pushdata.invokeExact(datablock, datablock_length_in_bytes, __overrungl_ref_datablock_memory_consumed_in_bytes, __overrungl_ref_error, Marshal.marshal(alloc_buffer));
            Unmarshal.copy(__overrungl_ref_datablock_memory_consumed_in_bytes, datablock_memory_consumed_in_bytes);
            Unmarshal.copy(__overrungl_ref_error, error);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_pushdata", e); }
    }

    ///decode a frame of audio sample data if possible from the passed-in data block
    ///
    ///possible cases:
    ///- 0 bytes used, 0 samples output (need more data)
    ///- N bytes used, 0 samples output (resynching the stream, keep going)
    ///- N bytes used, M samples output (one frame of data)
    ///
    ///note that after opening a file, you will ALWAYS get one N-bytes,0-sample
    ///frame, because Vorbis always "discards" the first frame.
    ///
    ///Note that on resynch, stb_vorbis will rarely consume all of the buffer,
    ///instead only datablock_length_in_bytes-3 or less. This is because it wants
    ///to avoid missing parts of a page header if they cross a datablock boundary,
    ///without writing state-machiney code to record a partial detection.
    ///
    ///The number of channels returned are stored in *channels (which can be
    ///NULL--it is always the same as the number of channels reported by
    ///get_info). *output will contain an array of float* buffers, one per
    ///channel. In other words, (*output)[0][0] contains the first sample from
    ///the first channel, and (*output)[1][0] contains the first sample from
    ///the second channel.
    ///
    ///*output points into stb_vorbis's internal output buffer storage; these
    ///buffers are owned by stb_vorbis and application code should not free
    ///them or modify their contents. They are transient and will be overwritten
    ///once you ask for more data to get decoded, so be sure to grab any data
    ///you need before then.
    ///
    ///@param channels place to write number of float * buffers
    ///@param output   place to write float ** array of float * buffers
    ///@param samples  place to write number of output samples
    ///@return number of bytes we used from datablock
    public static @CType("int") int stb_vorbis_decode_frame_pushdata(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f, @CType("const unsigned char *") java.lang.foreign.MemorySegment datablock, @CType("int") int datablock_length_in_bytes, @Out @CType("int*") java.lang.foreign.MemorySegment channels, @Out @CType("float ***") java.lang.foreign.MemorySegment output, @Out @CType("int*") java.lang.foreign.MemorySegment samples) {
        try {
            return (int) MH_stb_vorbis_decode_frame_pushdata.invokeExact(f, datablock, datablock_length_in_bytes, channels, output, samples);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_decode_frame_pushdata", e); }
    }

    ///inform stb_vorbis that your next datablock will not be contiguous with
    ///previous ones (e.g. you've seeked in the data); future attempts to decode
    ///frames will cause stb_vorbis to resynchronize (as noted above), and
    ///once it sees a valid Ogg page (typically 4-8KB, as large as 64KB), it
    ///will begin decoding the _next_ frame.
    ///
    ///if you want to seek using pushdata, you need to seek in your file, then
    ///call stb_vorbis_flush_pushdata(), then start calling decoding, then once
    ///decoding is returning you data, call stb_vorbis_get_sample_offset, and
    ///if you don't like the result, seek your file again and repeat.
    public static void stb_vorbis_flush_pushdata(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            MH_stb_vorbis_flush_pushdata.invokeExact(f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_flush_pushdata", e); }
    }

    ///decode an entire file and output the data interleaved into a malloc()ed
    ///buffer stored in *output. The return value is the number of samples
    ///decoded, or -1 if the file could not be opened or was not an ogg vorbis file.
    ///When you're done with it, just free() the pointer returned in *output.
    public static @CType("int") int stb_vorbis_decode_filename(@CType("const char*") java.lang.foreign.MemorySegment filename, @Out @CType("int*") java.lang.foreign.MemorySegment channels, @Out @CType("int*") java.lang.foreign.MemorySegment sample_rate, @Out @CType("short **") java.lang.foreign.MemorySegment output) {
        try {
            return (int) MH_stb_vorbis_decode_filename.invokeExact(filename, channels, sample_rate, output);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_decode_filename", e); }
    }

    ///decode an entire file and output the data interleaved into a malloc()ed
    ///buffer stored in *output. The return value is the number of samples
    ///decoded, or -1 if the file could not be opened or was not an ogg vorbis file.
    ///When you're done with it, just free() the pointer returned in *output.
    public static @CType("int") int stb_vorbis_decode_memory(@CType("const unsigned char *") java.lang.foreign.MemorySegment mem, @CType("int") int len, @Out @CType("int*") java.lang.foreign.MemorySegment channels, @Out @CType("int*") java.lang.foreign.MemorySegment sample_rate, @Out @CType("short **") java.lang.foreign.MemorySegment output) {
        try {
            return (int) MH_stb_vorbis_decode_memory.invokeExact(mem, len, channels, sample_rate, output);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_decode_memory", e); }
    }

    ///create an ogg vorbis decoder from an ogg vorbis stream in memory (note
    ///this must be the entire stream!). on failure, returns NULL and sets *error
    public static @CType("stb_vorbis *") java.lang.foreign.MemorySegment stb_vorbis_open_memory(@CType("const unsigned char *") java.lang.foreign.MemorySegment data, @CType("int") int len, @Out @CType("int*") java.lang.foreign.MemorySegment error, @CType("const stb_vorbis_alloc *") java.lang.foreign.MemorySegment alloc_buffer) {
        try {
            return (java.lang.foreign.MemorySegment) MH_stb_vorbis_open_memory.invokeExact(data, len, error, alloc_buffer);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_memory", e); }
    }

    ///create an ogg vorbis decoder from an ogg vorbis stream in memory (note
    ///this must be the entire stream!). on failure, returns NULL and sets *error
    public static @CType("stb_vorbis *") java.lang.foreign.MemorySegment stb_vorbis_open_memory(@CType("const unsigned char *") java.lang.foreign.MemorySegment data, @CType("int") int len, @Out @CType("int*") int[] error, @CType("const stb_vorbis_alloc *") overrungl.stb.STBVorbisAlloc alloc_buffer) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_error = Marshal.marshal(__overrungl_stack, error);
            var __overrungl_result = (java.lang.foreign.MemorySegment) MH_stb_vorbis_open_memory.invokeExact(data, len, __overrungl_ref_error, Marshal.marshal(alloc_buffer));
            Unmarshal.copy(__overrungl_ref_error, error);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_memory", e); }
    }

    ///create an ogg vorbis decoder from a filename via fopen(). on failure,
    ///returns NULL and sets *error (possibly to VORBIS_file_open_failure).
    public static @CType("stb_vorbis *") java.lang.foreign.MemorySegment stb_vorbis_open_filename(@CType("const char*") java.lang.foreign.MemorySegment filename, @Out @CType("int*") java.lang.foreign.MemorySegment error, @CType("const stb_vorbis_alloc *") java.lang.foreign.MemorySegment alloc_buffer) {
        try {
            return (java.lang.foreign.MemorySegment) MH_stb_vorbis_open_filename.invokeExact(filename, error, alloc_buffer);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_filename", e); }
    }

    ///create an ogg vorbis decoder from a filename via fopen(). on failure,
    ///returns NULL and sets *error (possibly to VORBIS_file_open_failure).
    public static @CType("stb_vorbis *") java.lang.foreign.MemorySegment stb_vorbis_open_filename(@CType("const char*") java.lang.String filename, @Out @CType("int*") int[] error, @CType("const stb_vorbis_alloc *") overrungl.stb.STBVorbisAlloc alloc_buffer) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_error = Marshal.marshal(__overrungl_stack, error);
            var __overrungl_result = (java.lang.foreign.MemorySegment) MH_stb_vorbis_open_filename.invokeExact(Marshal.marshal(__overrungl_stack, filename), __overrungl_ref_error, Marshal.marshal(alloc_buffer));
            Unmarshal.copy(__overrungl_ref_error, error);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_filename", e); }
    }

    ///these functions seek in the Vorbis file to (approximately) 'sample_number'.
    ///after calling seek_frame(), the next call to get_frame_*() will include
    ///the specified sample. after calling stb_vorbis_seek(), the next call to
    ///stb_vorbis_get_samples_* will start with the specified sample. If you
    ///do not need to seek to EXACTLY the target sample when using get_samples_*,
    ///you can also use seek_frame().
    public static @CType("int") int stb_vorbis_seek_frame(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f, @CType("unsigned int") int sample_number) {
        try {
            return (int) MH_stb_vorbis_seek_frame.invokeExact(f, sample_number);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_seek_frame", e); }
    }

    ///these functions seek in the Vorbis file to (approximately) 'sample_number'.
    ///after calling seek_frame(), the next call to get_frame_*() will include
    ///the specified sample. after calling stb_vorbis_seek(), the next call to
    ///stb_vorbis_get_samples_* will start with the specified sample. If you
    ///do not need to seek to EXACTLY the target sample when using get_samples_*,
    ///you can also use seek_frame().
    public static @CType("int") int stb_vorbis_seek(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f, @CType("unsigned int") int sample_number) {
        try {
            return (int) MH_stb_vorbis_seek.invokeExact(f, sample_number);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_seek", e); }
    }

    ///this function is equivalent to stb_vorbis_seek(f,0)
    public static @CType("int") int stb_vorbis_seek_start(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            return (int) MH_stb_vorbis_seek_start.invokeExact(f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_seek_start", e); }
    }

    ///these functions return the total length of the vorbis stream
    public static @CType("unsigned int") int stb_vorbis_stream_length_in_samples(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            return (int) MH_stb_vorbis_stream_length_in_samples.invokeExact(f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_stream_length_in_samples", e); }
    }

    ///these functions return the total length of the vorbis stream
    public static @CType("float") float stb_vorbis_stream_length_in_seconds(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            return (float) MH_stb_vorbis_stream_length_in_seconds.invokeExact(f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_stream_length_in_seconds", e); }
    }

    ///decode the next frame and return the number of samples. the number of
    ///channels returned are stored in *channels (which can be NULL--it is always
    ///the same as the number of channels reported by get_info). *output will
    ///contain an array of float* buffers, one per channel. These outputs will
    ///be overwritten on the next call to stb_vorbis_get_frame_*.
    ///
    ///You generally should not intermix calls to stb_vorbis_get_frame_*()
    ///and stb_vorbis_get_samples_*(), since the latter calls the former.
    public static @CType("int") int stb_vorbis_get_frame_float(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f, @Out @CType("int*") java.lang.foreign.MemorySegment channels, @Out @CType("float ***") java.lang.foreign.MemorySegment output) {
        try {
            return (int) MH_stb_vorbis_get_frame_float.invokeExact(f, channels, output);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_frame_float", e); }
    }

    ///decode the next frame and return the number of *samples* per channel.
    ///Note that for interleaved data, you pass in the number of shorts (the
    ///size of your array), but the return value is the number of samples per
    ///channel, not the total number of samples.
    ///
    ///The data is coerced to the number of channels you request according to the
    ///channel coercion rules (see below). You must pass in the size of your
    ///buffer(s) so that stb_vorbis will not overwrite the end of the buffer.
    ///The maximum buffer size needed can be gotten from get_info(); however,
    ///the Vorbis I specification implies an absolute maximum of 4096 samples
    ///per channel.
    public static @CType("int") int stb_vorbis_get_frame_short_interleaved(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f, @CType("int") int num_c, @Out @CType("short*") java.lang.foreign.MemorySegment buffer, @CType("int") int num_shorts) {
        try {
            return (int) MH_stb_vorbis_get_frame_short_interleaved.invokeExact(f, num_c, buffer, num_shorts);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_frame_short_interleaved", e); }
    }

    ///decode the next frame and return the number of *samples* per channel.
    ///Note that for interleaved data, you pass in the number of shorts (the
    ///size of your array), but the return value is the number of samples per
    ///channel, not the total number of samples.
    ///
    ///The data is coerced to the number of channels you request according to the
    ///channel coercion rules (see below). You must pass in the size of your
    ///buffer(s) so that stb_vorbis will not overwrite the end of the buffer.
    ///The maximum buffer size needed can be gotten from get_info(); however,
    ///the Vorbis I specification implies an absolute maximum of 4096 samples
    ///per channel.
    public static @CType("int") int stb_vorbis_get_frame_short(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f, @CType("int") int num_c, @Out @CType("short **") java.lang.foreign.MemorySegment buffer, @CType("int") int num_samples) {
        try {
            return (int) MH_stb_vorbis_get_frame_short.invokeExact(f, num_c, buffer, num_samples);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_frame_short", e); }
    }

    ///gets num_samples samples, not necessarily on a frame boundary--this requires
    ///buffering so you have to supply the buffers. DOES NOT APPLY THE COERCION RULES.
    ///@return the number of samples stored per channel; it may be less than requested
    ///at the end of the file. If there are no more samples in the file, returns 0.
    public static @CType("int") int stb_vorbis_get_samples_float_interleaved(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f, @CType("int") int channels, @Out @CType("float*") java.lang.foreign.MemorySegment buffer, @CType("int") int num_floats) {
        try {
            return (int) MH_stb_vorbis_get_samples_float_interleaved.invokeExact(f, channels, buffer, num_floats);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_samples_float_interleaved", e); }
    }

    ///gets num_samples samples, not necessarily on a frame boundary--this requires
    ///buffering so you have to supply the buffers. DOES NOT APPLY THE COERCION RULES.
    ///@return the number of samples stored per channel; it may be less than requested
    ///at the end of the file. If there are no more samples in the file, returns 0.
    public static @CType("int") int stb_vorbis_get_samples_float(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f, @CType("int") int channels, @Out @CType("float **") java.lang.foreign.MemorySegment buffer, @CType("int") int num_samples) {
        try {
            return (int) MH_stb_vorbis_get_samples_float.invokeExact(f, channels, buffer, num_samples);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_samples_float", e); }
    }

    ///gets num_samples samples, not necessarily on a frame boundary--this requires
    ///buffering so you have to supply the buffers. Applies the coercion rules above
    ///to produce 'channels' channels.
    ///@return the number of samples stored per channel;
    ///it may be less than requested at the end of the file. If there are no more
    ///samples in the file, returns 0.
    public static @CType("int") int stb_vorbis_get_samples_short_interleaved(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f, @CType("int") int channels, @Out @CType("short*") java.lang.foreign.MemorySegment buffer, @CType("int") int num_shorts) {
        try {
            return (int) MH_stb_vorbis_get_samples_short_interleaved.invokeExact(f, channels, buffer, num_shorts);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_samples_short_interleaved", e); }
    }

    ///gets num_samples samples, not necessarily on a frame boundary--this requires
    ///buffering so you have to supply the buffers. Applies the coercion rules above
    ///to produce 'channels' channels.
    ///@return the number of samples stored per channel;
    ///it may be less than requested at the end of the file. If there are no more
    ///samples in the file, returns 0.
    public static @CType("int") int stb_vorbis_get_samples_short(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f, @CType("int") int channels, @Out @CType("short **") java.lang.foreign.MemorySegment buffer, @CType("int") int num_samples) {
        try {
            return (int) MH_stb_vorbis_get_samples_short.invokeExact(f, channels, buffer, num_samples);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_samples_short", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private STBVorbis() {
    }
}
