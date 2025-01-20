/*
 * MIT License
 *
 * Copyright (c) 2023-2025 Overrun Organization
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
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.util.List;

/// [stb_vorbis.c](https://github.com/nothings/stb/blob/master/stb_vorbis.c)
///
/// @author squid233
/// @since 0.1.0
public final class STBVorbis {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
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
    /// Function descriptors.
    public static final class Descriptors {
        private Descriptors() { }
        /// The function descriptor of `stb_vorbis_get_info`.
        public static final FunctionDescriptor FD_stb_vorbis_get_info = FunctionDescriptor.of(overrungl.stb.STBVorbisInfo.LAYOUT, ValueLayout.ADDRESS);
        /// The function descriptor of `stb_vorbis_get_comment`.
        public static final FunctionDescriptor FD_stb_vorbis_get_comment = FunctionDescriptor.of(overrungl.stb.STBVorbisComment.LAYOUT, ValueLayout.ADDRESS);
        /// The function descriptor of `stb_vorbis_get_error`.
        public static final FunctionDescriptor FD_stb_vorbis_get_error = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `stb_vorbis_close`.
        public static final FunctionDescriptor FD_stb_vorbis_close = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        /// The function descriptor of `stb_vorbis_get_sample_offset`.
        public static final FunctionDescriptor FD_stb_vorbis_get_sample_offset = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `stb_vorbis_get_file_offset`.
        public static final FunctionDescriptor FD_stb_vorbis_get_file_offset = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `stb_vorbis_open_pushdata`.
        public static final FunctionDescriptor FD_stb_vorbis_open_pushdata = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBVorbisAlloc.LAYOUT));
        /// The function descriptor of `stb_vorbis_decode_frame_pushdata`.
        public static final FunctionDescriptor FD_stb_vorbis_decode_frame_pushdata = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `stb_vorbis_flush_pushdata`.
        public static final FunctionDescriptor FD_stb_vorbis_flush_pushdata = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        /// The function descriptor of `stb_vorbis_decode_filename`.
        public static final FunctionDescriptor FD_stb_vorbis_decode_filename = FunctionDescriptor.of(ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `stb_vorbis_decode_memory`.
        public static final FunctionDescriptor FD_stb_vorbis_decode_memory = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `stb_vorbis_open_memory`.
        public static final FunctionDescriptor FD_stb_vorbis_open_memory = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBVorbisAlloc.LAYOUT));
        /// The function descriptor of `stb_vorbis_open_filename`.
        public static final FunctionDescriptor FD_stb_vorbis_open_filename = FunctionDescriptor.of(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBVorbisAlloc.LAYOUT));
        /// The function descriptor of `stb_vorbis_seek_frame`.
        public static final FunctionDescriptor FD_stb_vorbis_seek_frame = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `stb_vorbis_seek`.
        public static final FunctionDescriptor FD_stb_vorbis_seek = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `stb_vorbis_seek_start`.
        public static final FunctionDescriptor FD_stb_vorbis_seek_start = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `stb_vorbis_stream_length_in_samples`.
        public static final FunctionDescriptor FD_stb_vorbis_stream_length_in_samples = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `stb_vorbis_stream_length_in_seconds`.
        public static final FunctionDescriptor FD_stb_vorbis_stream_length_in_seconds = FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS);
        /// The function descriptor of `stb_vorbis_get_frame_float`.
        public static final FunctionDescriptor FD_stb_vorbis_get_frame_float = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `stb_vorbis_get_frame_short_interleaved`.
        public static final FunctionDescriptor FD_stb_vorbis_get_frame_short_interleaved = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `stb_vorbis_get_frame_short`.
        public static final FunctionDescriptor FD_stb_vorbis_get_frame_short = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `stb_vorbis_get_samples_float_interleaved`.
        public static final FunctionDescriptor FD_stb_vorbis_get_samples_float_interleaved = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `stb_vorbis_get_samples_float`.
        public static final FunctionDescriptor FD_stb_vorbis_get_samples_float = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `stb_vorbis_get_samples_short_interleaved`.
        public static final FunctionDescriptor FD_stb_vorbis_get_samples_short_interleaved = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `stb_vorbis_get_samples_short`.
        public static final FunctionDescriptor FD_stb_vorbis_get_samples_short = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// Function descriptors.
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_stb_vorbis_get_info,
            FD_stb_vorbis_get_comment,
            FD_stb_vorbis_get_error,
            FD_stb_vorbis_close,
            FD_stb_vorbis_get_sample_offset,
            FD_stb_vorbis_get_file_offset,
            FD_stb_vorbis_open_pushdata,
            FD_stb_vorbis_decode_frame_pushdata,
            FD_stb_vorbis_flush_pushdata,
            FD_stb_vorbis_decode_filename,
            FD_stb_vorbis_decode_memory,
            FD_stb_vorbis_open_memory,
            FD_stb_vorbis_open_filename,
            FD_stb_vorbis_seek_frame,
            FD_stb_vorbis_seek,
            FD_stb_vorbis_seek_start,
            FD_stb_vorbis_stream_length_in_samples,
            FD_stb_vorbis_stream_length_in_seconds,
            FD_stb_vorbis_get_frame_float,
            FD_stb_vorbis_get_frame_short_interleaved,
            FD_stb_vorbis_get_frame_short,
            FD_stb_vorbis_get_samples_float_interleaved,
            FD_stb_vorbis_get_samples_float,
            FD_stb_vorbis_get_samples_short_interleaved,
            FD_stb_vorbis_get_samples_short
        );
    }
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `stb_vorbis_get_info`.
        public static final MethodHandle MH_stb_vorbis_get_info = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_get_info", Descriptors.FD_stb_vorbis_get_info);
        /// The method handle of `stb_vorbis_get_comment`.
        public static final MethodHandle MH_stb_vorbis_get_comment = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_get_comment", Descriptors.FD_stb_vorbis_get_comment);
        /// The method handle of `stb_vorbis_get_error`.
        public static final MethodHandle MH_stb_vorbis_get_error = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_get_error", Descriptors.FD_stb_vorbis_get_error);
        /// The method handle of `stb_vorbis_close`.
        public static final MethodHandle MH_stb_vorbis_close = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_close", Descriptors.FD_stb_vorbis_close);
        /// The method handle of `stb_vorbis_get_sample_offset`.
        public static final MethodHandle MH_stb_vorbis_get_sample_offset = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_get_sample_offset", Descriptors.FD_stb_vorbis_get_sample_offset);
        /// The method handle of `stb_vorbis_get_file_offset`.
        public static final MethodHandle MH_stb_vorbis_get_file_offset = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_get_file_offset", Descriptors.FD_stb_vorbis_get_file_offset);
        /// The method handle of `stb_vorbis_open_pushdata`.
        public static final MethodHandle MH_stb_vorbis_open_pushdata = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_open_pushdata", Descriptors.FD_stb_vorbis_open_pushdata);
        /// The method handle of `stb_vorbis_decode_frame_pushdata`.
        public static final MethodHandle MH_stb_vorbis_decode_frame_pushdata = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_decode_frame_pushdata", Descriptors.FD_stb_vorbis_decode_frame_pushdata);
        /// The method handle of `stb_vorbis_flush_pushdata`.
        public static final MethodHandle MH_stb_vorbis_flush_pushdata = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_flush_pushdata", Descriptors.FD_stb_vorbis_flush_pushdata);
        /// The method handle of `stb_vorbis_decode_filename`.
        public static final MethodHandle MH_stb_vorbis_decode_filename = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_decode_filename", Descriptors.FD_stb_vorbis_decode_filename);
        /// The method handle of `stb_vorbis_decode_memory`.
        public static final MethodHandle MH_stb_vorbis_decode_memory = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_decode_memory", Descriptors.FD_stb_vorbis_decode_memory);
        /// The method handle of `stb_vorbis_open_memory`.
        public static final MethodHandle MH_stb_vorbis_open_memory = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_open_memory", Descriptors.FD_stb_vorbis_open_memory);
        /// The method handle of `stb_vorbis_open_filename`.
        public static final MethodHandle MH_stb_vorbis_open_filename = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_open_filename", Descriptors.FD_stb_vorbis_open_filename);
        /// The method handle of `stb_vorbis_seek_frame`.
        public static final MethodHandle MH_stb_vorbis_seek_frame = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_seek_frame", Descriptors.FD_stb_vorbis_seek_frame);
        /// The method handle of `stb_vorbis_seek`.
        public static final MethodHandle MH_stb_vorbis_seek = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_seek", Descriptors.FD_stb_vorbis_seek);
        /// The method handle of `stb_vorbis_seek_start`.
        public static final MethodHandle MH_stb_vorbis_seek_start = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_seek_start", Descriptors.FD_stb_vorbis_seek_start);
        /// The method handle of `stb_vorbis_stream_length_in_samples`.
        public static final MethodHandle MH_stb_vorbis_stream_length_in_samples = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_stream_length_in_samples", Descriptors.FD_stb_vorbis_stream_length_in_samples);
        /// The method handle of `stb_vorbis_stream_length_in_seconds`.
        public static final MethodHandle MH_stb_vorbis_stream_length_in_seconds = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_stream_length_in_seconds", Descriptors.FD_stb_vorbis_stream_length_in_seconds);
        /// The method handle of `stb_vorbis_get_frame_float`.
        public static final MethodHandle MH_stb_vorbis_get_frame_float = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_get_frame_float", Descriptors.FD_stb_vorbis_get_frame_float);
        /// The method handle of `stb_vorbis_get_frame_short_interleaved`.
        public static final MethodHandle MH_stb_vorbis_get_frame_short_interleaved = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_get_frame_short_interleaved", Descriptors.FD_stb_vorbis_get_frame_short_interleaved);
        /// The method handle of `stb_vorbis_get_frame_short`.
        public static final MethodHandle MH_stb_vorbis_get_frame_short = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_get_frame_short", Descriptors.FD_stb_vorbis_get_frame_short);
        /// The method handle of `stb_vorbis_get_samples_float_interleaved`.
        public static final MethodHandle MH_stb_vorbis_get_samples_float_interleaved = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_get_samples_float_interleaved", Descriptors.FD_stb_vorbis_get_samples_float_interleaved);
        /// The method handle of `stb_vorbis_get_samples_float`.
        public static final MethodHandle MH_stb_vorbis_get_samples_float = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_get_samples_float", Descriptors.FD_stb_vorbis_get_samples_float);
        /// The method handle of `stb_vorbis_get_samples_short_interleaved`.
        public static final MethodHandle MH_stb_vorbis_get_samples_short_interleaved = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_get_samples_short_interleaved", Descriptors.FD_stb_vorbis_get_samples_short_interleaved);
        /// The method handle of `stb_vorbis_get_samples_short`.
        public static final MethodHandle MH_stb_vorbis_get_samples_short = RuntimeHelper.downcall(STBInternal.lookup(), "stb_vorbis_get_samples_short", Descriptors.FD_stb_vorbis_get_samples_short);
    }

    public static @CType("stb_vorbis_info") java.lang.foreign.MemorySegment stb_vorbis_get_info_(java.lang.foreign.SegmentAllocator allocator, @CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_stb_vorbis_get_info.invokeExact(allocator, f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_info", e); }
    }

    public static @CType("stb_vorbis_info") overrungl.stb.STBVorbisInfo stb_vorbis_get_info(java.lang.foreign.SegmentAllocator allocator, @CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            return overrungl.stb.STBVorbisInfo.of((java.lang.foreign.MemorySegment) Handles.MH_stb_vorbis_get_info.invokeExact(allocator, f));
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_info", e); }
    }

    public static @CType("stb_vorbis_comment") java.lang.foreign.MemorySegment stb_vorbis_get_comment_(java.lang.foreign.SegmentAllocator allocator, @CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_stb_vorbis_get_comment.invokeExact(allocator, f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_comment", e); }
    }

    public static @CType("stb_vorbis_comment") overrungl.stb.STBVorbisComment stb_vorbis_get_comment(java.lang.foreign.SegmentAllocator allocator, @CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            return overrungl.stb.STBVorbisComment.of((java.lang.foreign.MemorySegment) Handles.MH_stb_vorbis_get_comment.invokeExact(allocator, f));
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_comment", e); }
    }

    public static @CType("int") int stb_vorbis_get_error(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            return (int) Handles.MH_stb_vorbis_get_error.invokeExact(f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_error", e); }
    }

    public static void stb_vorbis_close(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            Handles.MH_stb_vorbis_close.invokeExact(f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_close", e); }
    }

    public static @CType("int") int stb_vorbis_get_sample_offset(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            return (int) Handles.MH_stb_vorbis_get_sample_offset.invokeExact(f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_sample_offset", e); }
    }

    public static @CType("unsigned int") int stb_vorbis_get_file_offset(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            return (int) Handles.MH_stb_vorbis_get_file_offset.invokeExact(f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_file_offset", e); }
    }

    public static @CType("stb_vorbis *") java.lang.foreign.MemorySegment stb_vorbis_open_pushdata(@CType("const unsigned char *") java.lang.foreign.MemorySegment datablock, @CType("int") int datablock_length_in_bytes, @Out @CType("int*") java.lang.foreign.MemorySegment datablock_memory_consumed_in_bytes, @Out @CType("int*") java.lang.foreign.MemorySegment error, @CType("const stb_vorbis_alloc *") java.lang.foreign.MemorySegment alloc_buffer) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_stb_vorbis_open_pushdata.invokeExact(datablock, datablock_length_in_bytes, datablock_memory_consumed_in_bytes, error, alloc_buffer);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_pushdata", e); }
    }

    public static @CType("stb_vorbis *") java.lang.foreign.MemorySegment stb_vorbis_open_pushdata(@CType("const unsigned char *") java.lang.foreign.MemorySegment datablock, @CType("int") int datablock_length_in_bytes, @Out @CType("int*") int[] datablock_memory_consumed_in_bytes, @Out @CType("int*") int[] error, @CType("const stb_vorbis_alloc *") overrungl.stb.STBVorbisAlloc alloc_buffer) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_datablock_memory_consumed_in_bytes = Marshal.marshal(__overrungl_stack, datablock_memory_consumed_in_bytes);
            var __overrungl_ref_error = Marshal.marshal(__overrungl_stack, error);
            var __overrungl_result = (java.lang.foreign.MemorySegment) Handles.MH_stb_vorbis_open_pushdata.invokeExact(datablock, datablock_length_in_bytes, __overrungl_ref_datablock_memory_consumed_in_bytes, __overrungl_ref_error, Marshal.marshal(alloc_buffer));
            Unmarshal.copy(__overrungl_ref_datablock_memory_consumed_in_bytes, datablock_memory_consumed_in_bytes);
            Unmarshal.copy(__overrungl_ref_error, error);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_pushdata", e); }
    }

    public static @CType("int") int stb_vorbis_decode_frame_pushdata(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f, @CType("const unsigned char *") java.lang.foreign.MemorySegment datablock, @CType("int") int datablock_length_in_bytes, @Out @CType("int*") java.lang.foreign.MemorySegment channels, @Out @CType("float ***") java.lang.foreign.MemorySegment output, @Out @CType("int*") java.lang.foreign.MemorySegment samples) {
        try {
            return (int) Handles.MH_stb_vorbis_decode_frame_pushdata.invokeExact(f, datablock, datablock_length_in_bytes, channels, output, samples);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_decode_frame_pushdata", e); }
    }

    public static void stb_vorbis_flush_pushdata(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            Handles.MH_stb_vorbis_flush_pushdata.invokeExact(f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_flush_pushdata", e); }
    }

    public static @CType("int") int stb_vorbis_decode_filename(@CType("const char*") java.lang.foreign.MemorySegment filename, @Out @CType("int*") java.lang.foreign.MemorySegment channels, @Out @CType("int*") java.lang.foreign.MemorySegment sample_rate, @Out @CType("short **") java.lang.foreign.MemorySegment output) {
        try {
            return (int) Handles.MH_stb_vorbis_decode_filename.invokeExact(filename, channels, sample_rate, output);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_decode_filename", e); }
    }

    public static @CType("int") int stb_vorbis_decode_memory(@CType("const unsigned char *") java.lang.foreign.MemorySegment mem, @CType("int") int len, @Out @CType("int*") java.lang.foreign.MemorySegment channels, @Out @CType("int*") java.lang.foreign.MemorySegment sample_rate, @Out @CType("short **") java.lang.foreign.MemorySegment output) {
        try {
            return (int) Handles.MH_stb_vorbis_decode_memory.invokeExact(mem, len, channels, sample_rate, output);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_decode_memory", e); }
    }

    public static @CType("stb_vorbis *") java.lang.foreign.MemorySegment stb_vorbis_open_memory(@CType("const unsigned char *") java.lang.foreign.MemorySegment data, @CType("int") int len, @Out @CType("int*") java.lang.foreign.MemorySegment error, @CType("const stb_vorbis_alloc *") java.lang.foreign.MemorySegment alloc_buffer) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_stb_vorbis_open_memory.invokeExact(data, len, error, alloc_buffer);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_memory", e); }
    }

    public static @CType("stb_vorbis *") java.lang.foreign.MemorySegment stb_vorbis_open_memory(@CType("const unsigned char *") java.lang.foreign.MemorySegment data, @CType("int") int len, @Out @CType("int*") int[] error, @CType("const stb_vorbis_alloc *") overrungl.stb.STBVorbisAlloc alloc_buffer) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_error = Marshal.marshal(__overrungl_stack, error);
            var __overrungl_result = (java.lang.foreign.MemorySegment) Handles.MH_stb_vorbis_open_memory.invokeExact(data, len, __overrungl_ref_error, Marshal.marshal(alloc_buffer));
            Unmarshal.copy(__overrungl_ref_error, error);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_memory", e); }
    }

    public static @CType("stb_vorbis *") java.lang.foreign.MemorySegment stb_vorbis_open_filename(@CType("const char*") java.lang.foreign.MemorySegment filename, @Out @CType("int*") java.lang.foreign.MemorySegment error, @CType("const stb_vorbis_alloc *") java.lang.foreign.MemorySegment alloc_buffer) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_stb_vorbis_open_filename.invokeExact(filename, error, alloc_buffer);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_filename", e); }
    }

    public static @CType("stb_vorbis *") java.lang.foreign.MemorySegment stb_vorbis_open_filename(@CType("const char*") java.lang.String filename, @Out @CType("int*") int[] error, @CType("const stb_vorbis_alloc *") overrungl.stb.STBVorbisAlloc alloc_buffer) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_error = Marshal.marshal(__overrungl_stack, error);
            var __overrungl_result = (java.lang.foreign.MemorySegment) Handles.MH_stb_vorbis_open_filename.invokeExact(Marshal.marshal(__overrungl_stack, filename), __overrungl_ref_error, Marshal.marshal(alloc_buffer));
            Unmarshal.copy(__overrungl_ref_error, error);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_filename", e); }
    }

    public static @CType("int") int stb_vorbis_seek_frame(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f, @CType("unsigned int") int sample_number) {
        try {
            return (int) Handles.MH_stb_vorbis_seek_frame.invokeExact(f, sample_number);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_seek_frame", e); }
    }

    public static @CType("int") int stb_vorbis_seek(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f, @CType("unsigned int") int sample_number) {
        try {
            return (int) Handles.MH_stb_vorbis_seek.invokeExact(f, sample_number);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_seek", e); }
    }

    public static @CType("int") int stb_vorbis_seek_start(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            return (int) Handles.MH_stb_vorbis_seek_start.invokeExact(f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_seek_start", e); }
    }

    public static @CType("unsigned int") int stb_vorbis_stream_length_in_samples(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            return (int) Handles.MH_stb_vorbis_stream_length_in_samples.invokeExact(f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_stream_length_in_samples", e); }
    }

    public static @CType("float") float stb_vorbis_stream_length_in_seconds(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f) {
        try {
            return (float) Handles.MH_stb_vorbis_stream_length_in_seconds.invokeExact(f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_stream_length_in_seconds", e); }
    }

    public static @CType("int") int stb_vorbis_get_frame_float(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f, @Out @CType("int*") java.lang.foreign.MemorySegment channels, @Out @CType("float ***") java.lang.foreign.MemorySegment output) {
        try {
            return (int) Handles.MH_stb_vorbis_get_frame_float.invokeExact(f, channels, output);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_frame_float", e); }
    }

    public static @CType("int") int stb_vorbis_get_frame_short_interleaved(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f, @CType("int") int num_c, @Out @CType("short*") java.lang.foreign.MemorySegment buffer, @CType("int") int num_shorts) {
        try {
            return (int) Handles.MH_stb_vorbis_get_frame_short_interleaved.invokeExact(f, num_c, buffer, num_shorts);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_frame_short_interleaved", e); }
    }

    public static @CType("int") int stb_vorbis_get_frame_short(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f, @CType("int") int num_c, @Out @CType("short **") java.lang.foreign.MemorySegment buffer, @CType("int") int num_samples) {
        try {
            return (int) Handles.MH_stb_vorbis_get_frame_short.invokeExact(f, num_c, buffer, num_samples);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_frame_short", e); }
    }

    public static @CType("int") int stb_vorbis_get_samples_float_interleaved(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f, @CType("int") int channels, @Out @CType("float*") java.lang.foreign.MemorySegment buffer, @CType("int") int num_floats) {
        try {
            return (int) Handles.MH_stb_vorbis_get_samples_float_interleaved.invokeExact(f, channels, buffer, num_floats);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_samples_float_interleaved", e); }
    }

    public static @CType("int") int stb_vorbis_get_samples_float(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f, @CType("int") int channels, @Out @CType("float **") java.lang.foreign.MemorySegment buffer, @CType("int") int num_samples) {
        try {
            return (int) Handles.MH_stb_vorbis_get_samples_float.invokeExact(f, channels, buffer, num_samples);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_samples_float", e); }
    }

    public static @CType("int") int stb_vorbis_get_samples_short_interleaved(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f, @CType("int") int channels, @Out @CType("short*") java.lang.foreign.MemorySegment buffer, @CType("int") int num_shorts) {
        try {
            return (int) Handles.MH_stb_vorbis_get_samples_short_interleaved.invokeExact(f, channels, buffer, num_shorts);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_samples_short_interleaved", e); }
    }

    public static @CType("int") int stb_vorbis_get_samples_short(@CType("stb_vorbis *") java.lang.foreign.MemorySegment f, @CType("int") int channels, @Out @CType("short **") java.lang.foreign.MemorySegment buffer, @CType("int") int num_samples) {
        try {
            return (int) Handles.MH_stb_vorbis_get_samples_short.invokeExact(f, channels, buffer, num_samples);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_samples_short", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private STBVorbis() {
    }
}
