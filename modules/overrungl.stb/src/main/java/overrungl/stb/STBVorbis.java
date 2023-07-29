/*
 * MIT License
 *
 * Copyright (c) 2023 Overrun Organization
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

import overrungl.NativeType;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static overrungl.FunctionDescriptors.*;
import static overrungl.stb.Handles.downcall;
import static overrungl.stb.Handles.initialize;

/**
 * @author squid233
 * @since 0.1.0
 */
public final class STBVorbis {
    private static MethodHandle
        stb_vorbis_get_info, stb_vorbis_get_comment, stb_vorbis_get_error, stb_vorbis_close, stb_vorbis_get_sample_offset, stb_vorbis_get_file_offset,
        stb_vorbis_open_pushdata, stb_vorbis_decode_frame_pushdata, stb_vorbis_flush_pushdata, stb_vorbis_decode_filename, stb_vorbis_decode_memory, stb_vorbis_open_memory,
        stb_vorbis_open_filename, stb_vorbis_open_file, stb_vorbis_open_file_section, stb_vorbis_seek_frame, stb_vorbis_seek, stb_vorbis_seek_start,
        stb_vorbis_stream_length_in_samples, stb_vorbis_stream_length_in_seconds, stb_vorbis_get_frame_float, stb_vorbis_get_frame_short_interleaved, stb_vorbis_get_frame_short, stb_vorbis_get_samples_float_interleaved,
        stb_vorbis_get_samples_float, stb_vorbis_get_samples_short_interleaved, stb_vorbis_get_samples_short;

    static {
        initialize();
        create();
    }

    private static void create() {
        stb_vorbis_get_info = downcall("stb_vorbis_get_info", FunctionDescriptor.of(STBVorbisInfo.LAYOUT, ValueLayout.ADDRESS));
        stb_vorbis_get_comment = downcall("stb_vorbis_get_comment", FunctionDescriptor.of(STBVorbisComment.LAYOUT, ValueLayout.ADDRESS));
        stb_vorbis_get_error = downcall("stb_vorbis_get_error", fd_PI);
        stb_vorbis_close = downcall("stb_vorbis_close", PV);
        stb_vorbis_get_sample_offset = downcall("stb_vorbis_get_sample_offset", fd_PI);
        stb_vorbis_get_file_offset = downcall("stb_vorbis_get_file_offset", fd_PI);
        stb_vorbis_open_pushdata = downcall("stb_vorbis_open_pushdata", PIPPPP);
        stb_vorbis_decode_frame_pushdata = downcall("stb_vorbis_decode_frame_pushdata", PPIPPPI);
        stb_vorbis_flush_pushdata = downcall("stb_vorbis_flush_pushdata", PV);
        stb_vorbis_decode_filename = downcall("stb_vorbis_decode_filename", PPPPI);
        stb_vorbis_decode_memory = downcall("stb_vorbis_decode_memory", PIPPPI);
        stb_vorbis_open_memory = downcall("stb_vorbis_open_memory", PIPPP);
        stb_vorbis_open_filename = downcall("stb_vorbis_open_filename", PPPP);
        stb_vorbis_open_file = downcall("stb_vorbis_open_file", PIPPP);
        stb_vorbis_open_file_section = downcall("stb_vorbis_open_file_section", PIPPIP);
        stb_vorbis_seek_frame = downcall("stb_vorbis_seek_frame", PII);
        stb_vorbis_seek = downcall("stb_vorbis_seek", PII);
        stb_vorbis_seek_start = downcall("stb_vorbis_seek_start", fd_PI);
        stb_vorbis_stream_length_in_samples = downcall("stb_vorbis_stream_length_in_samples", fd_PI);
        stb_vorbis_stream_length_in_seconds = downcall("stb_vorbis_stream_length_in_seconds", PF);
        stb_vorbis_get_frame_float = downcall("stb_vorbis_get_frame_float", PPPI);
        stb_vorbis_get_frame_short_interleaved = downcall("stb_vorbis_get_frame_short_interleaved", PIPII);
        stb_vorbis_get_frame_short = downcall("stb_vorbis_get_frame_short", PIPII);
        stb_vorbis_get_samples_float_interleaved = downcall("stb_vorbis_get_samples_float_interleaved", PIPII);
        stb_vorbis_get_samples_float = downcall("stb_vorbis_get_samples_float", PIPII);
        stb_vorbis_get_samples_short_interleaved = downcall("stb_vorbis_get_samples_short_interleaved", PIPII);
        stb_vorbis_get_samples_short = downcall("stb_vorbis_get_samples_short", PIPII);
    }

    private STBVorbis() {
        //no instance
    }

    public static @NativeType("stb_vorbis_info") MemorySegment ngetInfo(SegmentAllocator allocator, @NativeType("stb_vorbis*") MemorySegment f) {
        try {
            return (MemorySegment) stb_vorbis_get_info.invokeExact(allocator, f);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static STBVorbisInfo getInfo(SegmentAllocator allocator, @NativeType("stb_vorbis*") MemorySegment f) {
        return new STBVorbisInfo(ngetInfo(allocator, f));
    }

    public static @NativeType("stb_vorbis_comment") MemorySegment ngetComment(SegmentAllocator allocator, @NativeType("stb_vorbis*") MemorySegment f) {
        try {
            return (MemorySegment) stb_vorbis_get_comment.invokeExact(allocator, f);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static STBVorbisComment getComment(SegmentAllocator allocator, @NativeType("stb_vorbis*") MemorySegment f) {
        return new STBVorbisComment(ngetComment(allocator, f));
    }

    public static int getError(@NativeType("stb_vorbis*") MemorySegment f) {
        try {
            return (int) stb_vorbis_get_error.invokeExact(f);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void close(@NativeType("stb_vorbis*") MemorySegment f) {
        try {
            stb_vorbis_close.invokeExact(f);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getSampleOffset(@NativeType("stb_vorbis*") MemorySegment f) {
        try {
            return (int) stb_vorbis_get_sample_offset.invokeExact(f);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getFileOffset(@NativeType("stb_vorbis*") MemorySegment f) {
        try {
            return (int) stb_vorbis_get_file_offset.invokeExact(f);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
