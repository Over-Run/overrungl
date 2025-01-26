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

import overrungl.internal.RuntimeHelper;

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
    public static final int VORBIS__no_error = 0;
    public static final int VORBIS_need_more_data = 1;
    public static final int VORBIS_invalid_api_mixing = 2;
    public static final int VORBIS_outofmem = 3;
    public static final int VORBIS_feature_not_supported = 4;
    public static final int VORBIS_too_many_channels = 5;
    public static final int VORBIS_file_open_failure = 6;
    public static final int VORBIS_seek_without_length = 7;
    public static final int VORBIS_unexpected_eof = 10;
    public static final int VORBIS_seek_invalid = 11;
    public static final int VORBIS_invalid_setup = 20;
    public static final int VORBIS_invalid_stream = 21;
    public static final int VORBIS_missing_capture_pattern = 30;
    public static final int VORBIS_invalid_stream_structure_version = 31;
    public static final int VORBIS_continued_packet_flag_invalid = 32;
    public static final int VORBIS_incorrect_stream_serial_number = 33;
    public static final int VORBIS_invalid_first_page = 34;
    public static final int VORBIS_bad_packet_type = 35;
    public static final int VORBIS_cant_find_last_page = 36;
    public static final int VORBIS_seek_failed = 37;
    public static final int VORBIS_ogg_skeleton_not_supported = 38;
    //endregion
    /// Method handles.
    public static final class Handles {
        /// The method handle of `stb_vorbis_get_info`.
        public static final MethodHandle MH_stb_vorbis_get_info = RuntimeHelper.downcall(FunctionDescriptor.of(STBVorbisInfo.LAYOUT, ValueLayout.ADDRESS));
        /// The method handle of `stb_vorbis_get_comment`.
        public static final MethodHandle MH_stb_vorbis_get_comment = RuntimeHelper.downcall(FunctionDescriptor.of(STBVorbisComment.LAYOUT, ValueLayout.ADDRESS));
        /// The method handle of `stb_vorbis_get_error`.
        public static final MethodHandle MH_stb_vorbis_get_error = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stb_vorbis_close`.
        public static final MethodHandle MH_stb_vorbis_close = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `stb_vorbis_get_sample_offset`.
        public static final MethodHandle MH_stb_vorbis_get_sample_offset = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stb_vorbis_get_file_offset`.
        public static final MethodHandle MH_stb_vorbis_get_file_offset = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stb_vorbis_open_pushdata`.
        public static final MethodHandle MH_stb_vorbis_open_pushdata = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stb_vorbis_decode_frame_pushdata`.
        public static final MethodHandle MH_stb_vorbis_decode_frame_pushdata = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stb_vorbis_flush_pushdata`.
        public static final MethodHandle MH_stb_vorbis_flush_pushdata = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `stb_vorbis_decode_filename`.
        public static final MethodHandle MH_stb_vorbis_decode_filename = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stb_vorbis_decode_memory`.
        public static final MethodHandle MH_stb_vorbis_decode_memory = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stb_vorbis_open_memory`.
        public static final MethodHandle MH_stb_vorbis_open_memory = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stb_vorbis_open_filename`.
        public static final MethodHandle MH_stb_vorbis_open_filename = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stb_vorbis_open_file`.
        public static final MethodHandle MH_stb_vorbis_open_file = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stb_vorbis_open_file_section`.
        public static final MethodHandle MH_stb_vorbis_open_file_section = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stb_vorbis_seek_frame`.
        public static final MethodHandle MH_stb_vorbis_seek_frame = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stb_vorbis_seek`.
        public static final MethodHandle MH_stb_vorbis_seek = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stb_vorbis_seek_start`.
        public static final MethodHandle MH_stb_vorbis_seek_start = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stb_vorbis_stream_length_in_samples`.
        public static final MethodHandle MH_stb_vorbis_stream_length_in_samples = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stb_vorbis_stream_length_in_seconds`.
        public static final MethodHandle MH_stb_vorbis_stream_length_in_seconds = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS));
        /// The method handle of `stb_vorbis_get_frame_float`.
        public static final MethodHandle MH_stb_vorbis_get_frame_float = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stb_vorbis_get_frame_short_interleaved`.
        public static final MethodHandle MH_stb_vorbis_get_frame_short_interleaved = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stb_vorbis_get_frame_short`.
        public static final MethodHandle MH_stb_vorbis_get_frame_short = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stb_vorbis_get_samples_float_interleaved`.
        public static final MethodHandle MH_stb_vorbis_get_samples_float_interleaved = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stb_vorbis_get_samples_float`.
        public static final MethodHandle MH_stb_vorbis_get_samples_float = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stb_vorbis_get_samples_short_interleaved`.
        public static final MethodHandle MH_stb_vorbis_get_samples_short_interleaved = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stb_vorbis_get_samples_short`.
        public static final MethodHandle MH_stb_vorbis_get_samples_short = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
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
        /// The function address of `stb_vorbis_open_file`.
        public final MemorySegment PFN_stb_vorbis_open_file;
        /// The function address of `stb_vorbis_open_file_section`.
        public final MemorySegment PFN_stb_vorbis_open_file_section;
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
            PFN_stb_vorbis_open_file = STBInternal.lookup().findOrThrow("stb_vorbis_open_file");
            PFN_stb_vorbis_open_file_section = STBInternal.lookup().findOrThrow("stb_vorbis_open_file_section");
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

    /// ```
    /// stb_vorbis_info stb_vorbis_get_info(stb_vorbis* f);
    /// ```
    public static MemorySegment stb_vorbis_get_info(SegmentAllocator __allocator, MemorySegment f) {
        try { return (MemorySegment) Handles.MH_stb_vorbis_get_info.invokeExact(Handles.get().PFN_stb_vorbis_get_info, __allocator, f); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_info", e); }
    }

    /// ```
    /// stb_vorbis_comment stb_vorbis_get_comment(stb_vorbis* f);
    /// ```
    public static MemorySegment stb_vorbis_get_comment(SegmentAllocator __allocator, MemorySegment f) {
        try { return (MemorySegment) Handles.MH_stb_vorbis_get_comment.invokeExact(Handles.get().PFN_stb_vorbis_get_comment, __allocator, f); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_comment", e); }
    }

    /// ```
    /// int stb_vorbis_get_error(stb_vorbis* f);
    /// ```
    public static int stb_vorbis_get_error(MemorySegment f) {
        try { return (int) Handles.MH_stb_vorbis_get_error.invokeExact(Handles.get().PFN_stb_vorbis_get_error, f); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_error", e); }
    }

    /// ```
    /// void stb_vorbis_close(stb_vorbis* f);
    /// ```
    public static void stb_vorbis_close(MemorySegment f) {
        try { Handles.MH_stb_vorbis_close.invokeExact(Handles.get().PFN_stb_vorbis_close, f); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_close", e); }
    }

    /// ```
    /// int stb_vorbis_get_sample_offset(stb_vorbis* f);
    /// ```
    public static int stb_vorbis_get_sample_offset(MemorySegment f) {
        try { return (int) Handles.MH_stb_vorbis_get_sample_offset.invokeExact(Handles.get().PFN_stb_vorbis_get_sample_offset, f); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_sample_offset", e); }
    }

    /// ```
    /// unsigned int stb_vorbis_get_file_offset(stb_vorbis* f);
    /// ```
    public static int stb_vorbis_get_file_offset(MemorySegment f) {
        try { return (int) Handles.MH_stb_vorbis_get_file_offset.invokeExact(Handles.get().PFN_stb_vorbis_get_file_offset, f); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_file_offset", e); }
    }

    /// ```
    /// stb_vorbis* stb_vorbis_open_pushdata(const unsigned char* datablock, int datablock_length_in_bytes, int* datablock_memory_consumed_in_bytes, int* error, const stb_vorbis_alloc* alloc_buffer);
    /// ```
    public static MemorySegment stb_vorbis_open_pushdata(MemorySegment datablock, int datablock_length_in_bytes, MemorySegment datablock_memory_consumed_in_bytes, MemorySegment error, MemorySegment alloc_buffer) {
        try { return (MemorySegment) Handles.MH_stb_vorbis_open_pushdata.invokeExact(Handles.get().PFN_stb_vorbis_open_pushdata, datablock, datablock_length_in_bytes, datablock_memory_consumed_in_bytes, error, alloc_buffer); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_pushdata", e); }
    }

    /// ```
    /// int stb_vorbis_decode_frame_pushdata(stb_vorbis* f, const unsigned char* datablock, int datablock_length_in_bytes, int* channels, float*** output, int* samples);
    /// ```
    public static int stb_vorbis_decode_frame_pushdata(MemorySegment f, MemorySegment datablock, int datablock_length_in_bytes, MemorySegment channels, MemorySegment output, MemorySegment samples) {
        try { return (int) Handles.MH_stb_vorbis_decode_frame_pushdata.invokeExact(Handles.get().PFN_stb_vorbis_decode_frame_pushdata, f, datablock, datablock_length_in_bytes, channels, output, samples); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_decode_frame_pushdata", e); }
    }

    /// ```
    /// void stb_vorbis_flush_pushdata(stb_vorbis* f);
    /// ```
    public static void stb_vorbis_flush_pushdata(MemorySegment f) {
        try { Handles.MH_stb_vorbis_flush_pushdata.invokeExact(Handles.get().PFN_stb_vorbis_flush_pushdata, f); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_flush_pushdata", e); }
    }

    /// ```
    /// int stb_vorbis_decode_filename(const char* filename, int* channels, int* sample_rate, short** output);
    /// ```
    public static int stb_vorbis_decode_filename(MemorySegment filename, MemorySegment channels, MemorySegment sample_rate, MemorySegment output) {
        try { return (int) Handles.MH_stb_vorbis_decode_filename.invokeExact(Handles.get().PFN_stb_vorbis_decode_filename, filename, channels, sample_rate, output); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_decode_filename", e); }
    }

    /// ```
    /// int stb_vorbis_decode_memory(const unsigned char* mem, int len, int* channels, int* sample_rate, short** output);
    /// ```
    public static int stb_vorbis_decode_memory(MemorySegment mem, int len, MemorySegment channels, MemorySegment sample_rate, MemorySegment output) {
        try { return (int) Handles.MH_stb_vorbis_decode_memory.invokeExact(Handles.get().PFN_stb_vorbis_decode_memory, mem, len, channels, sample_rate, output); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_decode_memory", e); }
    }

    /// ```
    /// stb_vorbis* stb_vorbis_open_memory(const unsigned char* data, int len, int* error, const stb_vorbis_alloc* alloc_buffer);
    /// ```
    public static MemorySegment stb_vorbis_open_memory(MemorySegment data, int len, MemorySegment error, MemorySegment alloc_buffer) {
        try { return (MemorySegment) Handles.MH_stb_vorbis_open_memory.invokeExact(Handles.get().PFN_stb_vorbis_open_memory, data, len, error, alloc_buffer); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_memory", e); }
    }

    /// ```
    /// stb_vorbis* stb_vorbis_open_filename(const char* filename, int* error, const stb_vorbis_alloc* alloc_buffer);
    /// ```
    public static MemorySegment stb_vorbis_open_filename(MemorySegment filename, MemorySegment error, MemorySegment alloc_buffer) {
        try { return (MemorySegment) Handles.MH_stb_vorbis_open_filename.invokeExact(Handles.get().PFN_stb_vorbis_open_filename, filename, error, alloc_buffer); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_filename", e); }
    }

    /// ```
    /// stb_vorbis* stb_vorbis_open_file(FILE* f, int close_handle_on_close, int* error, const stb_vorbis_alloc* alloc_buffer);
    /// ```
    public static MemorySegment stb_vorbis_open_file(MemorySegment f, int close_handle_on_close, MemorySegment error, MemorySegment alloc_buffer) {
        try { return (MemorySegment) Handles.MH_stb_vorbis_open_file.invokeExact(Handles.get().PFN_stb_vorbis_open_file, f, close_handle_on_close, error, alloc_buffer); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_file", e); }
    }

    /// ```
    /// stb_vorbis* stb_vorbis_open_file_section(FILE* f, int close_handle_on_close, int* error, const stb_vorbis_alloc* alloc_buffer, unsigned int len);
    /// ```
    public static MemorySegment stb_vorbis_open_file_section(MemorySegment f, int close_handle_on_close, MemorySegment error, MemorySegment alloc_buffer, int len) {
        try { return (MemorySegment) Handles.MH_stb_vorbis_open_file_section.invokeExact(Handles.get().PFN_stb_vorbis_open_file_section, f, close_handle_on_close, error, alloc_buffer, len); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_file_section", e); }
    }

    /// ```
    /// int stb_vorbis_seek_frame(stb_vorbis* f, unsigned int sample_number);
    /// ```
    public static int stb_vorbis_seek_frame(MemorySegment f, int sample_number) {
        try { return (int) Handles.MH_stb_vorbis_seek_frame.invokeExact(Handles.get().PFN_stb_vorbis_seek_frame, f, sample_number); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_seek_frame", e); }
    }

    /// ```
    /// int stb_vorbis_seek(stb_vorbis* f, unsigned int sample_number);
    /// ```
    public static int stb_vorbis_seek(MemorySegment f, int sample_number) {
        try { return (int) Handles.MH_stb_vorbis_seek.invokeExact(Handles.get().PFN_stb_vorbis_seek, f, sample_number); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_seek", e); }
    }

    /// ```
    /// int stb_vorbis_seek_start(stb_vorbis* f);
    /// ```
    public static int stb_vorbis_seek_start(MemorySegment f) {
        try { return (int) Handles.MH_stb_vorbis_seek_start.invokeExact(Handles.get().PFN_stb_vorbis_seek_start, f); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_seek_start", e); }
    }

    /// ```
    /// unsigned int stb_vorbis_stream_length_in_samples(stb_vorbis* f);
    /// ```
    public static int stb_vorbis_stream_length_in_samples(MemorySegment f) {
        try { return (int) Handles.MH_stb_vorbis_stream_length_in_samples.invokeExact(Handles.get().PFN_stb_vorbis_stream_length_in_samples, f); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_stream_length_in_samples", e); }
    }

    /// ```
    /// float stb_vorbis_stream_length_in_seconds(stb_vorbis* f);
    /// ```
    public static float stb_vorbis_stream_length_in_seconds(MemorySegment f) {
        try { return (float) Handles.MH_stb_vorbis_stream_length_in_seconds.invokeExact(Handles.get().PFN_stb_vorbis_stream_length_in_seconds, f); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_stream_length_in_seconds", e); }
    }

    /// ```
    /// int stb_vorbis_get_frame_float(stb_vorbis* f, int* channels, float*** output);
    /// ```
    public static int stb_vorbis_get_frame_float(MemorySegment f, MemorySegment channels, MemorySegment output) {
        try { return (int) Handles.MH_stb_vorbis_get_frame_float.invokeExact(Handles.get().PFN_stb_vorbis_get_frame_float, f, channels, output); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_frame_float", e); }
    }

    /// ```
    /// int stb_vorbis_get_frame_short_interleaved(stb_vorbis* f, int num_c, short* buffer, int num_shorts);
    /// ```
    public static int stb_vorbis_get_frame_short_interleaved(MemorySegment f, int num_c, MemorySegment buffer, int num_shorts) {
        try { return (int) Handles.MH_stb_vorbis_get_frame_short_interleaved.invokeExact(Handles.get().PFN_stb_vorbis_get_frame_short_interleaved, f, num_c, buffer, num_shorts); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_frame_short_interleaved", e); }
    }

    /// ```
    /// int stb_vorbis_get_frame_short(stb_vorbis* f, int num_c, short** buffer, int num_samples);
    /// ```
    public static int stb_vorbis_get_frame_short(MemorySegment f, int num_c, MemorySegment buffer, int num_samples) {
        try { return (int) Handles.MH_stb_vorbis_get_frame_short.invokeExact(Handles.get().PFN_stb_vorbis_get_frame_short, f, num_c, buffer, num_samples); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_frame_short", e); }
    }

    /// ```
    /// int stb_vorbis_get_samples_float_interleaved(stb_vorbis* f, int channels, float* buffer, int num_floats);
    /// ```
    public static int stb_vorbis_get_samples_float_interleaved(MemorySegment f, int channels, MemorySegment buffer, int num_floats) {
        try { return (int) Handles.MH_stb_vorbis_get_samples_float_interleaved.invokeExact(Handles.get().PFN_stb_vorbis_get_samples_float_interleaved, f, channels, buffer, num_floats); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_samples_float_interleaved", e); }
    }

    /// ```
    /// int stb_vorbis_get_samples_float(stb_vorbis* f, int channels, float** buffer, int num_samples);
    /// ```
    public static int stb_vorbis_get_samples_float(MemorySegment f, int channels, MemorySegment buffer, int num_samples) {
        try { return (int) Handles.MH_stb_vorbis_get_samples_float.invokeExact(Handles.get().PFN_stb_vorbis_get_samples_float, f, channels, buffer, num_samples); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_samples_float", e); }
    }

    /// ```
    /// int stb_vorbis_get_samples_short_interleaved(stb_vorbis* f, int channels, short* buffer, int num_shorts);
    /// ```
    public static int stb_vorbis_get_samples_short_interleaved(MemorySegment f, int channels, MemorySegment buffer, int num_shorts) {
        try { return (int) Handles.MH_stb_vorbis_get_samples_short_interleaved.invokeExact(Handles.get().PFN_stb_vorbis_get_samples_short_interleaved, f, channels, buffer, num_shorts); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_samples_short_interleaved", e); }
    }

    /// ```
    /// int stb_vorbis_get_samples_short(stb_vorbis* f, int channels, short** buffer, int num_samples);
    /// ```
    public static int stb_vorbis_get_samples_short(MemorySegment f, int channels, MemorySegment buffer, int num_samples) {
        try { return (int) Handles.MH_stb_vorbis_get_samples_short.invokeExact(Handles.get().PFN_stb_vorbis_get_samples_short, f, channels, buffer, num_samples); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_samples_short", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private STBVorbis() {
    }
}
