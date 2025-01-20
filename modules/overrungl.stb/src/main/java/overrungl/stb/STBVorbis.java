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
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

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
    }
    /// Method handles.
    public static final class Handles {
        /// The method handle of `stb_vorbis_get_info`.
        public static final MethodHandle MH_stb_vorbis_get_info = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_get_info);
        /// The method handle of `stb_vorbis_get_comment`.
        public static final MethodHandle MH_stb_vorbis_get_comment = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_get_comment);
        /// The method handle of `stb_vorbis_get_error`.
        public static final MethodHandle MH_stb_vorbis_get_error = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_get_error);
        /// The method handle of `stb_vorbis_close`.
        public static final MethodHandle MH_stb_vorbis_close = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_close);
        /// The method handle of `stb_vorbis_get_sample_offset`.
        public static final MethodHandle MH_stb_vorbis_get_sample_offset = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_get_sample_offset);
        /// The method handle of `stb_vorbis_get_file_offset`.
        public static final MethodHandle MH_stb_vorbis_get_file_offset = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_get_file_offset);
        /// The method handle of `stb_vorbis_open_pushdata`.
        public static final MethodHandle MH_stb_vorbis_open_pushdata = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_open_pushdata);
        /// The method handle of `stb_vorbis_decode_frame_pushdata`.
        public static final MethodHandle MH_stb_vorbis_decode_frame_pushdata = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_decode_frame_pushdata);
        /// The method handle of `stb_vorbis_flush_pushdata`.
        public static final MethodHandle MH_stb_vorbis_flush_pushdata = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_flush_pushdata);
        /// The method handle of `stb_vorbis_decode_filename`.
        public static final MethodHandle MH_stb_vorbis_decode_filename = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_decode_filename);
        /// The method handle of `stb_vorbis_decode_memory`.
        public static final MethodHandle MH_stb_vorbis_decode_memory = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_decode_memory);
        /// The method handle of `stb_vorbis_open_memory`.
        public static final MethodHandle MH_stb_vorbis_open_memory = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_open_memory);
        /// The method handle of `stb_vorbis_open_filename`.
        public static final MethodHandle MH_stb_vorbis_open_filename = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_open_filename);
        /// The method handle of `stb_vorbis_seek_frame`.
        public static final MethodHandle MH_stb_vorbis_seek_frame = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_seek_frame);
        /// The method handle of `stb_vorbis_seek`.
        public static final MethodHandle MH_stb_vorbis_seek = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_seek);
        /// The method handle of `stb_vorbis_seek_start`.
        public static final MethodHandle MH_stb_vorbis_seek_start = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_seek_start);
        /// The method handle of `stb_vorbis_stream_length_in_samples`.
        public static final MethodHandle MH_stb_vorbis_stream_length_in_samples = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_stream_length_in_samples);
        /// The method handle of `stb_vorbis_stream_length_in_seconds`.
        public static final MethodHandle MH_stb_vorbis_stream_length_in_seconds = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_stream_length_in_seconds);
        /// The method handle of `stb_vorbis_get_frame_float`.
        public static final MethodHandle MH_stb_vorbis_get_frame_float = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_get_frame_float);
        /// The method handle of `stb_vorbis_get_frame_short_interleaved`.
        public static final MethodHandle MH_stb_vorbis_get_frame_short_interleaved = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_get_frame_short_interleaved);
        /// The method handle of `stb_vorbis_get_frame_short`.
        public static final MethodHandle MH_stb_vorbis_get_frame_short = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_get_frame_short);
        /// The method handle of `stb_vorbis_get_samples_float_interleaved`.
        public static final MethodHandle MH_stb_vorbis_get_samples_float_interleaved = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_get_samples_float_interleaved);
        /// The method handle of `stb_vorbis_get_samples_float`.
        public static final MethodHandle MH_stb_vorbis_get_samples_float = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_get_samples_float);
        /// The method handle of `stb_vorbis_get_samples_short_interleaved`.
        public static final MethodHandle MH_stb_vorbis_get_samples_short_interleaved = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_get_samples_short_interleaved);
        /// The method handle of `stb_vorbis_get_samples_short`.
        public static final MethodHandle MH_stb_vorbis_get_samples_short = RuntimeHelper.downcall(Descriptors.FD_stb_vorbis_get_samples_short);
        /// The function address of `stb_vorbis_get_info`.
        public final MemorySegment PFN_stb_vorbis_get_info;
        /// The function address of `stb_vorbis_get_comment`.
        public final MemorySegment PFN_stb_vorbis_get_comment;
        /// The function address of `stb_vorbis_get_error`.
        public final MemorySegment PFN_stb_vorbis_get_error;
        /// The function address of `stb_vorbis_close`.
        public final MemorySegment PFN_stb_vorbis_close;
        /// The function address of `stb_vorbis_get_sample_offset`.
        public final MemorySegment PFN_stb_vorbis_get_sample_offset;
        /// The function address of `stb_vorbis_get_file_offset`.
        public final MemorySegment PFN_stb_vorbis_get_file_offset;
        /// The function address of `stb_vorbis_open_pushdata`.
        public final MemorySegment PFN_stb_vorbis_open_pushdata;
        /// The function address of `stb_vorbis_decode_frame_pushdata`.
        public final MemorySegment PFN_stb_vorbis_decode_frame_pushdata;
        /// The function address of `stb_vorbis_flush_pushdata`.
        public final MemorySegment PFN_stb_vorbis_flush_pushdata;
        /// The function address of `stb_vorbis_decode_filename`.
        public final MemorySegment PFN_stb_vorbis_decode_filename;
        /// The function address of `stb_vorbis_decode_memory`.
        public final MemorySegment PFN_stb_vorbis_decode_memory;
        /// The function address of `stb_vorbis_open_memory`.
        public final MemorySegment PFN_stb_vorbis_open_memory;
        /// The function address of `stb_vorbis_open_filename`.
        public final MemorySegment PFN_stb_vorbis_open_filename;
        /// The function address of `stb_vorbis_seek_frame`.
        public final MemorySegment PFN_stb_vorbis_seek_frame;
        /// The function address of `stb_vorbis_seek`.
        public final MemorySegment PFN_stb_vorbis_seek;
        /// The function address of `stb_vorbis_seek_start`.
        public final MemorySegment PFN_stb_vorbis_seek_start;
        /// The function address of `stb_vorbis_stream_length_in_samples`.
        public final MemorySegment PFN_stb_vorbis_stream_length_in_samples;
        /// The function address of `stb_vorbis_stream_length_in_seconds`.
        public final MemorySegment PFN_stb_vorbis_stream_length_in_seconds;
        /// The function address of `stb_vorbis_get_frame_float`.
        public final MemorySegment PFN_stb_vorbis_get_frame_float;
        /// The function address of `stb_vorbis_get_frame_short_interleaved`.
        public final MemorySegment PFN_stb_vorbis_get_frame_short_interleaved;
        /// The function address of `stb_vorbis_get_frame_short`.
        public final MemorySegment PFN_stb_vorbis_get_frame_short;
        /// The function address of `stb_vorbis_get_samples_float_interleaved`.
        public final MemorySegment PFN_stb_vorbis_get_samples_float_interleaved;
        /// The function address of `stb_vorbis_get_samples_float`.
        public final MemorySegment PFN_stb_vorbis_get_samples_float;
        /// The function address of `stb_vorbis_get_samples_short_interleaved`.
        public final MemorySegment PFN_stb_vorbis_get_samples_short_interleaved;
        /// The function address of `stb_vorbis_get_samples_short`.
        public final MemorySegment PFN_stb_vorbis_get_samples_short;
        private Handles() {
            PFN_stb_vorbis_get_info = STBInternal.lookup().findOrThrow("stb_vorbis_get_info");
            PFN_stb_vorbis_get_comment = STBInternal.lookup().findOrThrow("stb_vorbis_get_comment");
            PFN_stb_vorbis_get_error = STBInternal.lookup().findOrThrow("stb_vorbis_get_error");
            PFN_stb_vorbis_close = STBInternal.lookup().findOrThrow("stb_vorbis_close");
            PFN_stb_vorbis_get_sample_offset = STBInternal.lookup().findOrThrow("stb_vorbis_get_sample_offset");
            PFN_stb_vorbis_get_file_offset = STBInternal.lookup().findOrThrow("stb_vorbis_get_file_offset");
            PFN_stb_vorbis_open_pushdata = STBInternal.lookup().findOrThrow("stb_vorbis_open_pushdata");
            PFN_stb_vorbis_decode_frame_pushdata = STBInternal.lookup().findOrThrow("stb_vorbis_decode_frame_pushdata");
            PFN_stb_vorbis_flush_pushdata = STBInternal.lookup().findOrThrow("stb_vorbis_flush_pushdata");
            PFN_stb_vorbis_decode_filename = STBInternal.lookup().findOrThrow("stb_vorbis_decode_filename");
            PFN_stb_vorbis_decode_memory = STBInternal.lookup().findOrThrow("stb_vorbis_decode_memory");
            PFN_stb_vorbis_open_memory = STBInternal.lookup().findOrThrow("stb_vorbis_open_memory");
            PFN_stb_vorbis_open_filename = STBInternal.lookup().findOrThrow("stb_vorbis_open_filename");
            PFN_stb_vorbis_seek_frame = STBInternal.lookup().findOrThrow("stb_vorbis_seek_frame");
            PFN_stb_vorbis_seek = STBInternal.lookup().findOrThrow("stb_vorbis_seek");
            PFN_stb_vorbis_seek_start = STBInternal.lookup().findOrThrow("stb_vorbis_seek_start");
            PFN_stb_vorbis_stream_length_in_samples = STBInternal.lookup().findOrThrow("stb_vorbis_stream_length_in_samples");
            PFN_stb_vorbis_stream_length_in_seconds = STBInternal.lookup().findOrThrow("stb_vorbis_stream_length_in_seconds");
            PFN_stb_vorbis_get_frame_float = STBInternal.lookup().findOrThrow("stb_vorbis_get_frame_float");
            PFN_stb_vorbis_get_frame_short_interleaved = STBInternal.lookup().findOrThrow("stb_vorbis_get_frame_short_interleaved");
            PFN_stb_vorbis_get_frame_short = STBInternal.lookup().findOrThrow("stb_vorbis_get_frame_short");
            PFN_stb_vorbis_get_samples_float_interleaved = STBInternal.lookup().findOrThrow("stb_vorbis_get_samples_float_interleaved");
            PFN_stb_vorbis_get_samples_float = STBInternal.lookup().findOrThrow("stb_vorbis_get_samples_float");
            PFN_stb_vorbis_get_samples_short_interleaved = STBInternal.lookup().findOrThrow("stb_vorbis_get_samples_short_interleaved");
            PFN_stb_vorbis_get_samples_short = STBInternal.lookup().findOrThrow("stb_vorbis_get_samples_short");
        }
        private static volatile Handles instance;
        private static Handles get() {
            if (instance == null) {
                synchronized (Handles.class) {
                    if (instance == null) { instance = new Handles(); }
                }
            }
            return instance;
        }
    }

    public static @CType("stb_vorbis_info") MemorySegment stb_vorbis_get_info_(SegmentAllocator allocator, @CType("stb_vorbis *") MemorySegment f) {
        try {
            return (MemorySegment) Handles.MH_stb_vorbis_get_info.invokeExact(Handles.get().PFN_stb_vorbis_get_info, allocator, f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_info", e); }
    }

    public static @CType("stb_vorbis_info") overrungl.stb.STBVorbisInfo stb_vorbis_get_info(SegmentAllocator allocator, @CType("stb_vorbis *") MemorySegment f) {
        try {
            return overrungl.stb.STBVorbisInfo.of((MemorySegment) Handles.MH_stb_vorbis_get_info.invokeExact(Handles.get().PFN_stb_vorbis_get_info, allocator, f));
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_info", e); }
    }

    public static @CType("stb_vorbis_comment") MemorySegment stb_vorbis_get_comment_(SegmentAllocator allocator, @CType("stb_vorbis *") MemorySegment f) {
        try {
            return (MemorySegment) Handles.MH_stb_vorbis_get_comment.invokeExact(Handles.get().PFN_stb_vorbis_get_comment, allocator, f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_comment", e); }
    }

    public static @CType("stb_vorbis_comment") overrungl.stb.STBVorbisComment stb_vorbis_get_comment(SegmentAllocator allocator, @CType("stb_vorbis *") MemorySegment f) {
        try {
            return overrungl.stb.STBVorbisComment.of((MemorySegment) Handles.MH_stb_vorbis_get_comment.invokeExact(Handles.get().PFN_stb_vorbis_get_comment, allocator, f));
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_comment", e); }
    }

    public static @CType("int") int stb_vorbis_get_error(@CType("stb_vorbis *") MemorySegment f) {
        try {
            return (int) Handles.MH_stb_vorbis_get_error.invokeExact(Handles.get().PFN_stb_vorbis_get_error, f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_error", e); }
    }

    public static void stb_vorbis_close(@CType("stb_vorbis *") MemorySegment f) {
        try {
            Handles.MH_stb_vorbis_close.invokeExact(Handles.get().PFN_stb_vorbis_close, f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_close", e); }
    }

    public static @CType("int") int stb_vorbis_get_sample_offset(@CType("stb_vorbis *") MemorySegment f) {
        try {
            return (int) Handles.MH_stb_vorbis_get_sample_offset.invokeExact(Handles.get().PFN_stb_vorbis_get_sample_offset, f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_sample_offset", e); }
    }

    public static @CType("unsigned int") int stb_vorbis_get_file_offset(@CType("stb_vorbis *") MemorySegment f) {
        try {
            return (int) Handles.MH_stb_vorbis_get_file_offset.invokeExact(Handles.get().PFN_stb_vorbis_get_file_offset, f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_file_offset", e); }
    }

    public static @CType("stb_vorbis *") MemorySegment stb_vorbis_open_pushdata(@CType("const unsigned char *") MemorySegment datablock, @CType("int") int datablock_length_in_bytes, @Out @CType("int*") MemorySegment datablock_memory_consumed_in_bytes, @Out @CType("int*") MemorySegment error, @CType("const stb_vorbis_alloc *") MemorySegment alloc_buffer) {
        try {
            return (MemorySegment) Handles.MH_stb_vorbis_open_pushdata.invokeExact(Handles.get().PFN_stb_vorbis_open_pushdata, datablock, datablock_length_in_bytes, datablock_memory_consumed_in_bytes, error, alloc_buffer);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_pushdata", e); }
    }

    public static @CType("stb_vorbis *") MemorySegment stb_vorbis_open_pushdata(@CType("const unsigned char *") MemorySegment datablock, @CType("int") int datablock_length_in_bytes, @Out @CType("int*") int[] datablock_memory_consumed_in_bytes, @Out @CType("int*") int[] error, @CType("const stb_vorbis_alloc *") overrungl.stb.STBVorbisAlloc alloc_buffer) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_datablock_memory_consumed_in_bytes = Marshal.marshal(__overrungl_stack, datablock_memory_consumed_in_bytes);
            var __overrungl_ref_error = Marshal.marshal(__overrungl_stack, error);
            var __overrungl_result = (MemorySegment) Handles.MH_stb_vorbis_open_pushdata.invokeExact(Handles.get().PFN_stb_vorbis_open_pushdata, datablock, datablock_length_in_bytes, __overrungl_ref_datablock_memory_consumed_in_bytes, __overrungl_ref_error, Marshal.marshal(alloc_buffer));
            Unmarshal.copy(__overrungl_ref_datablock_memory_consumed_in_bytes, datablock_memory_consumed_in_bytes);
            Unmarshal.copy(__overrungl_ref_error, error);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_pushdata", e); }
    }

    public static @CType("int") int stb_vorbis_decode_frame_pushdata(@CType("stb_vorbis *") MemorySegment f, @CType("const unsigned char *") MemorySegment datablock, @CType("int") int datablock_length_in_bytes, @Out @CType("int*") MemorySegment channels, @Out @CType("float ***") MemorySegment output, @Out @CType("int*") MemorySegment samples) {
        try {
            return (int) Handles.MH_stb_vorbis_decode_frame_pushdata.invokeExact(Handles.get().PFN_stb_vorbis_decode_frame_pushdata, f, datablock, datablock_length_in_bytes, channels, output, samples);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_decode_frame_pushdata", e); }
    }

    public static void stb_vorbis_flush_pushdata(@CType("stb_vorbis *") MemorySegment f) {
        try {
            Handles.MH_stb_vorbis_flush_pushdata.invokeExact(Handles.get().PFN_stb_vorbis_flush_pushdata, f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_flush_pushdata", e); }
    }

    public static @CType("int") int stb_vorbis_decode_filename(@CType("const char*") MemorySegment filename, @Out @CType("int*") MemorySegment channels, @Out @CType("int*") MemorySegment sample_rate, @Out @CType("short **") MemorySegment output) {
        try {
            return (int) Handles.MH_stb_vorbis_decode_filename.invokeExact(Handles.get().PFN_stb_vorbis_decode_filename, filename, channels, sample_rate, output);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_decode_filename", e); }
    }

    public static @CType("int") int stb_vorbis_decode_memory(@CType("const unsigned char *") MemorySegment mem, @CType("int") int len, @Out @CType("int*") MemorySegment channels, @Out @CType("int*") MemorySegment sample_rate, @Out @CType("short **") MemorySegment output) {
        try {
            return (int) Handles.MH_stb_vorbis_decode_memory.invokeExact(Handles.get().PFN_stb_vorbis_decode_memory, mem, len, channels, sample_rate, output);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_decode_memory", e); }
    }

    public static @CType("stb_vorbis *") MemorySegment stb_vorbis_open_memory(@CType("const unsigned char *") MemorySegment data, @CType("int") int len, @Out @CType("int*") MemorySegment error, @CType("const stb_vorbis_alloc *") MemorySegment alloc_buffer) {
        try {
            return (MemorySegment) Handles.MH_stb_vorbis_open_memory.invokeExact(Handles.get().PFN_stb_vorbis_open_memory, data, len, error, alloc_buffer);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_memory", e); }
    }

    public static @CType("stb_vorbis *") MemorySegment stb_vorbis_open_memory(@CType("const unsigned char *") MemorySegment data, @CType("int") int len, @Out @CType("int*") int[] error, @CType("const stb_vorbis_alloc *") overrungl.stb.STBVorbisAlloc alloc_buffer) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_error = Marshal.marshal(__overrungl_stack, error);
            var __overrungl_result = (MemorySegment) Handles.MH_stb_vorbis_open_memory.invokeExact(Handles.get().PFN_stb_vorbis_open_memory, data, len, __overrungl_ref_error, Marshal.marshal(alloc_buffer));
            Unmarshal.copy(__overrungl_ref_error, error);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_memory", e); }
    }

    public static @CType("stb_vorbis *") MemorySegment stb_vorbis_open_filename(@CType("const char*") MemorySegment filename, @Out @CType("int*") MemorySegment error, @CType("const stb_vorbis_alloc *") MemorySegment alloc_buffer) {
        try {
            return (MemorySegment) Handles.MH_stb_vorbis_open_filename.invokeExact(Handles.get().PFN_stb_vorbis_open_filename, filename, error, alloc_buffer);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_filename", e); }
    }

    public static @CType("stb_vorbis *") MemorySegment stb_vorbis_open_filename(@CType("const char*") String filename, @Out @CType("int*") int[] error, @CType("const stb_vorbis_alloc *") overrungl.stb.STBVorbisAlloc alloc_buffer) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_error = Marshal.marshal(__overrungl_stack, error);
            var __overrungl_result = (MemorySegment) Handles.MH_stb_vorbis_open_filename.invokeExact(Handles.get().PFN_stb_vorbis_open_filename, Marshal.marshal(__overrungl_stack, filename), __overrungl_ref_error, Marshal.marshal(alloc_buffer));
            Unmarshal.copy(__overrungl_ref_error, error);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_filename", e); }
    }

    public static @CType("int") int stb_vorbis_seek_frame(@CType("stb_vorbis *") MemorySegment f, @CType("unsigned int") int sample_number) {
        try {
            return (int) Handles.MH_stb_vorbis_seek_frame.invokeExact(Handles.get().PFN_stb_vorbis_seek_frame, f, sample_number);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_seek_frame", e); }
    }

    public static @CType("int") int stb_vorbis_seek(@CType("stb_vorbis *") MemorySegment f, @CType("unsigned int") int sample_number) {
        try {
            return (int) Handles.MH_stb_vorbis_seek.invokeExact(Handles.get().PFN_stb_vorbis_seek, f, sample_number);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_seek", e); }
    }

    public static @CType("int") int stb_vorbis_seek_start(@CType("stb_vorbis *") MemorySegment f) {
        try {
            return (int) Handles.MH_stb_vorbis_seek_start.invokeExact(Handles.get().PFN_stb_vorbis_seek_start, f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_seek_start", e); }
    }

    public static @CType("unsigned int") int stb_vorbis_stream_length_in_samples(@CType("stb_vorbis *") MemorySegment f) {
        try {
            return (int) Handles.MH_stb_vorbis_stream_length_in_samples.invokeExact(Handles.get().PFN_stb_vorbis_stream_length_in_samples, f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_stream_length_in_samples", e); }
    }

    public static @CType("float") float stb_vorbis_stream_length_in_seconds(@CType("stb_vorbis *") MemorySegment f) {
        try {
            return (float) Handles.MH_stb_vorbis_stream_length_in_seconds.invokeExact(Handles.get().PFN_stb_vorbis_stream_length_in_seconds, f);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_stream_length_in_seconds", e); }
    }

    public static @CType("int") int stb_vorbis_get_frame_float(@CType("stb_vorbis *") MemorySegment f, @Out @CType("int*") MemorySegment channels, @Out @CType("float ***") MemorySegment output) {
        try {
            return (int) Handles.MH_stb_vorbis_get_frame_float.invokeExact(Handles.get().PFN_stb_vorbis_get_frame_float, f, channels, output);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_frame_float", e); }
    }

    public static @CType("int") int stb_vorbis_get_frame_short_interleaved(@CType("stb_vorbis *") MemorySegment f, @CType("int") int num_c, @Out @CType("short*") MemorySegment buffer, @CType("int") int num_shorts) {
        try {
            return (int) Handles.MH_stb_vorbis_get_frame_short_interleaved.invokeExact(Handles.get().PFN_stb_vorbis_get_frame_short_interleaved, f, num_c, buffer, num_shorts);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_frame_short_interleaved", e); }
    }

    public static @CType("int") int stb_vorbis_get_frame_short(@CType("stb_vorbis *") MemorySegment f, @CType("int") int num_c, @Out @CType("short **") MemorySegment buffer, @CType("int") int num_samples) {
        try {
            return (int) Handles.MH_stb_vorbis_get_frame_short.invokeExact(Handles.get().PFN_stb_vorbis_get_frame_short, f, num_c, buffer, num_samples);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_frame_short", e); }
    }

    public static @CType("int") int stb_vorbis_get_samples_float_interleaved(@CType("stb_vorbis *") MemorySegment f, @CType("int") int channels, @Out @CType("float*") MemorySegment buffer, @CType("int") int num_floats) {
        try {
            return (int) Handles.MH_stb_vorbis_get_samples_float_interleaved.invokeExact(Handles.get().PFN_stb_vorbis_get_samples_float_interleaved, f, channels, buffer, num_floats);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_samples_float_interleaved", e); }
    }

    public static @CType("int") int stb_vorbis_get_samples_float(@CType("stb_vorbis *") MemorySegment f, @CType("int") int channels, @Out @CType("float **") MemorySegment buffer, @CType("int") int num_samples) {
        try {
            return (int) Handles.MH_stb_vorbis_get_samples_float.invokeExact(Handles.get().PFN_stb_vorbis_get_samples_float, f, channels, buffer, num_samples);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_samples_float", e); }
    }

    public static @CType("int") int stb_vorbis_get_samples_short_interleaved(@CType("stb_vorbis *") MemorySegment f, @CType("int") int channels, @Out @CType("short*") MemorySegment buffer, @CType("int") int num_shorts) {
        try {
            return (int) Handles.MH_stb_vorbis_get_samples_short_interleaved.invokeExact(Handles.get().PFN_stb_vorbis_get_samples_short_interleaved, f, channels, buffer, num_shorts);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_samples_short_interleaved", e); }
    }

    public static @CType("int") int stb_vorbis_get_samples_short(@CType("stb_vorbis *") MemorySegment f, @CType("int") int channels, @Out @CType("short **") MemorySegment buffer, @CType("int") int num_samples) {
        try {
            return (int) Handles.MH_stb_vorbis_get_samples_short.invokeExact(Handles.get().PFN_stb_vorbis_get_samples_short, f, channels, buffer, num_samples);
        } catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_samples_short", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private STBVorbis() {
    }
}
