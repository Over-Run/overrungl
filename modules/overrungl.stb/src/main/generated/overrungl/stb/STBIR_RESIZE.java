/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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

// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.stb;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct STBIR_RESIZE {
///     void* user_data;
///     void const * input_pixels;
///     int input_w;
///     int input_h;
///     double input_s0;
///     double input_t0;
///     double input_s1;
///     double input_t1;
///     stbir_input_callback* input_cb;
///     void* output_pixels;
///     int output_w;
///     int output_h;
///     int output_subx;
///     int output_suby;
///     int output_subw;
///     int output_subh;
///     stbir_output_callback* output_cb;
///     int input_stride_in_bytes;
///     int output_stride_in_bytes;
///     int splits;
///     int fast_alpha;
///     int needs_rebuild;
///     int called_alloc;
///     (int) stbir_pixel_layout input_pixel_layout_public;
///     (int) stbir_pixel_layout output_pixel_layout_public;
///     (int) stbir_datatype input_data_type;
///     (int) stbir_datatype output_data_type;
///     (int) stbir_filter horizontal_filter;
///     (int) stbir_filter vertical_filter;
///     (int) stbir_edge horizontal_edge;
///     (int) stbir_edge vertical_edge;
///     stbir__kernel_callback* horizontal_filter_kernel;
///     stbir__support_callback* horizontal_filter_support;
///     stbir__kernel_callback* vertical_filter_kernel;
///     stbir__support_callback* vertical_filter_support;
///     stbir__info* samplers;
/// };
/// ```
public final class STBIR_RESIZE extends GroupType {
    /// The struct layout of `STBIR_RESIZE`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("user_data"),
        ValueLayout.ADDRESS.withName("input_pixels"),
        ValueLayout.JAVA_INT.withName("input_w"),
        ValueLayout.JAVA_INT.withName("input_h"),
        ValueLayout.JAVA_DOUBLE.withName("input_s0"),
        ValueLayout.JAVA_DOUBLE.withName("input_t0"),
        ValueLayout.JAVA_DOUBLE.withName("input_s1"),
        ValueLayout.JAVA_DOUBLE.withName("input_t1"),
        ValueLayout.ADDRESS.withName("input_cb"),
        ValueLayout.ADDRESS.withName("output_pixels"),
        ValueLayout.JAVA_INT.withName("output_w"),
        ValueLayout.JAVA_INT.withName("output_h"),
        ValueLayout.JAVA_INT.withName("output_subx"),
        ValueLayout.JAVA_INT.withName("output_suby"),
        ValueLayout.JAVA_INT.withName("output_subw"),
        ValueLayout.JAVA_INT.withName("output_subh"),
        ValueLayout.ADDRESS.withName("output_cb"),
        ValueLayout.JAVA_INT.withName("input_stride_in_bytes"),
        ValueLayout.JAVA_INT.withName("output_stride_in_bytes"),
        ValueLayout.JAVA_INT.withName("splits"),
        ValueLayout.JAVA_INT.withName("fast_alpha"),
        ValueLayout.JAVA_INT.withName("needs_rebuild"),
        ValueLayout.JAVA_INT.withName("called_alloc"),
        ValueLayout.JAVA_INT.withName("input_pixel_layout_public"),
        ValueLayout.JAVA_INT.withName("output_pixel_layout_public"),
        ValueLayout.JAVA_INT.withName("input_data_type"),
        ValueLayout.JAVA_INT.withName("output_data_type"),
        ValueLayout.JAVA_INT.withName("horizontal_filter"),
        ValueLayout.JAVA_INT.withName("vertical_filter"),
        ValueLayout.JAVA_INT.withName("horizontal_edge"),
        ValueLayout.JAVA_INT.withName("vertical_edge"),
        ValueLayout.ADDRESS.withName("horizontal_filter_kernel"),
        ValueLayout.ADDRESS.withName("horizontal_filter_support"),
        ValueLayout.ADDRESS.withName("vertical_filter_kernel"),
        ValueLayout.ADDRESS.withName("vertical_filter_support"),
        ValueLayout.ADDRESS.withName("samplers")
    );
    /// The byte offset of `user_data`.
    public static final long OFFSET_user_data = LAYOUT.byteOffset(PathElement.groupElement("user_data"));
    /// The memory layout of `user_data`.
    public static final MemoryLayout LAYOUT_user_data = LAYOUT.select(PathElement.groupElement("user_data"));
    /// The [VarHandle] of `user_data` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_user_data = LAYOUT.arrayElementVarHandle(PathElement.groupElement("user_data"));
    /// The byte offset of `input_pixels`.
    public static final long OFFSET_input_pixels = LAYOUT.byteOffset(PathElement.groupElement("input_pixels"));
    /// The memory layout of `input_pixels`.
    public static final MemoryLayout LAYOUT_input_pixels = LAYOUT.select(PathElement.groupElement("input_pixels"));
    /// The [VarHandle] of `input_pixels` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_input_pixels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input_pixels"));
    /// The byte offset of `input_w`.
    public static final long OFFSET_input_w = LAYOUT.byteOffset(PathElement.groupElement("input_w"));
    /// The memory layout of `input_w`.
    public static final MemoryLayout LAYOUT_input_w = LAYOUT.select(PathElement.groupElement("input_w"));
    /// The [VarHandle] of `input_w` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_input_w = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input_w"));
    /// The byte offset of `input_h`.
    public static final long OFFSET_input_h = LAYOUT.byteOffset(PathElement.groupElement("input_h"));
    /// The memory layout of `input_h`.
    public static final MemoryLayout LAYOUT_input_h = LAYOUT.select(PathElement.groupElement("input_h"));
    /// The [VarHandle] of `input_h` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_input_h = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input_h"));
    /// The byte offset of `input_s0`.
    public static final long OFFSET_input_s0 = LAYOUT.byteOffset(PathElement.groupElement("input_s0"));
    /// The memory layout of `input_s0`.
    public static final MemoryLayout LAYOUT_input_s0 = LAYOUT.select(PathElement.groupElement("input_s0"));
    /// The [VarHandle] of `input_s0` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_input_s0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input_s0"));
    /// The byte offset of `input_t0`.
    public static final long OFFSET_input_t0 = LAYOUT.byteOffset(PathElement.groupElement("input_t0"));
    /// The memory layout of `input_t0`.
    public static final MemoryLayout LAYOUT_input_t0 = LAYOUT.select(PathElement.groupElement("input_t0"));
    /// The [VarHandle] of `input_t0` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_input_t0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input_t0"));
    /// The byte offset of `input_s1`.
    public static final long OFFSET_input_s1 = LAYOUT.byteOffset(PathElement.groupElement("input_s1"));
    /// The memory layout of `input_s1`.
    public static final MemoryLayout LAYOUT_input_s1 = LAYOUT.select(PathElement.groupElement("input_s1"));
    /// The [VarHandle] of `input_s1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_input_s1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input_s1"));
    /// The byte offset of `input_t1`.
    public static final long OFFSET_input_t1 = LAYOUT.byteOffset(PathElement.groupElement("input_t1"));
    /// The memory layout of `input_t1`.
    public static final MemoryLayout LAYOUT_input_t1 = LAYOUT.select(PathElement.groupElement("input_t1"));
    /// The [VarHandle] of `input_t1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_input_t1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input_t1"));
    /// The byte offset of `input_cb`.
    public static final long OFFSET_input_cb = LAYOUT.byteOffset(PathElement.groupElement("input_cb"));
    /// The memory layout of `input_cb`.
    public static final MemoryLayout LAYOUT_input_cb = LAYOUT.select(PathElement.groupElement("input_cb"));
    /// The [VarHandle] of `input_cb` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_input_cb = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input_cb"));
    /// The byte offset of `output_pixels`.
    public static final long OFFSET_output_pixels = LAYOUT.byteOffset(PathElement.groupElement("output_pixels"));
    /// The memory layout of `output_pixels`.
    public static final MemoryLayout LAYOUT_output_pixels = LAYOUT.select(PathElement.groupElement("output_pixels"));
    /// The [VarHandle] of `output_pixels` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_output_pixels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("output_pixels"));
    /// The byte offset of `output_w`.
    public static final long OFFSET_output_w = LAYOUT.byteOffset(PathElement.groupElement("output_w"));
    /// The memory layout of `output_w`.
    public static final MemoryLayout LAYOUT_output_w = LAYOUT.select(PathElement.groupElement("output_w"));
    /// The [VarHandle] of `output_w` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_output_w = LAYOUT.arrayElementVarHandle(PathElement.groupElement("output_w"));
    /// The byte offset of `output_h`.
    public static final long OFFSET_output_h = LAYOUT.byteOffset(PathElement.groupElement("output_h"));
    /// The memory layout of `output_h`.
    public static final MemoryLayout LAYOUT_output_h = LAYOUT.select(PathElement.groupElement("output_h"));
    /// The [VarHandle] of `output_h` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_output_h = LAYOUT.arrayElementVarHandle(PathElement.groupElement("output_h"));
    /// The byte offset of `output_subx`.
    public static final long OFFSET_output_subx = LAYOUT.byteOffset(PathElement.groupElement("output_subx"));
    /// The memory layout of `output_subx`.
    public static final MemoryLayout LAYOUT_output_subx = LAYOUT.select(PathElement.groupElement("output_subx"));
    /// The [VarHandle] of `output_subx` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_output_subx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("output_subx"));
    /// The byte offset of `output_suby`.
    public static final long OFFSET_output_suby = LAYOUT.byteOffset(PathElement.groupElement("output_suby"));
    /// The memory layout of `output_suby`.
    public static final MemoryLayout LAYOUT_output_suby = LAYOUT.select(PathElement.groupElement("output_suby"));
    /// The [VarHandle] of `output_suby` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_output_suby = LAYOUT.arrayElementVarHandle(PathElement.groupElement("output_suby"));
    /// The byte offset of `output_subw`.
    public static final long OFFSET_output_subw = LAYOUT.byteOffset(PathElement.groupElement("output_subw"));
    /// The memory layout of `output_subw`.
    public static final MemoryLayout LAYOUT_output_subw = LAYOUT.select(PathElement.groupElement("output_subw"));
    /// The [VarHandle] of `output_subw` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_output_subw = LAYOUT.arrayElementVarHandle(PathElement.groupElement("output_subw"));
    /// The byte offset of `output_subh`.
    public static final long OFFSET_output_subh = LAYOUT.byteOffset(PathElement.groupElement("output_subh"));
    /// The memory layout of `output_subh`.
    public static final MemoryLayout LAYOUT_output_subh = LAYOUT.select(PathElement.groupElement("output_subh"));
    /// The [VarHandle] of `output_subh` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_output_subh = LAYOUT.arrayElementVarHandle(PathElement.groupElement("output_subh"));
    /// The byte offset of `output_cb`.
    public static final long OFFSET_output_cb = LAYOUT.byteOffset(PathElement.groupElement("output_cb"));
    /// The memory layout of `output_cb`.
    public static final MemoryLayout LAYOUT_output_cb = LAYOUT.select(PathElement.groupElement("output_cb"));
    /// The [VarHandle] of `output_cb` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_output_cb = LAYOUT.arrayElementVarHandle(PathElement.groupElement("output_cb"));
    /// The byte offset of `input_stride_in_bytes`.
    public static final long OFFSET_input_stride_in_bytes = LAYOUT.byteOffset(PathElement.groupElement("input_stride_in_bytes"));
    /// The memory layout of `input_stride_in_bytes`.
    public static final MemoryLayout LAYOUT_input_stride_in_bytes = LAYOUT.select(PathElement.groupElement("input_stride_in_bytes"));
    /// The [VarHandle] of `input_stride_in_bytes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_input_stride_in_bytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input_stride_in_bytes"));
    /// The byte offset of `output_stride_in_bytes`.
    public static final long OFFSET_output_stride_in_bytes = LAYOUT.byteOffset(PathElement.groupElement("output_stride_in_bytes"));
    /// The memory layout of `output_stride_in_bytes`.
    public static final MemoryLayout LAYOUT_output_stride_in_bytes = LAYOUT.select(PathElement.groupElement("output_stride_in_bytes"));
    /// The [VarHandle] of `output_stride_in_bytes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_output_stride_in_bytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("output_stride_in_bytes"));
    /// The byte offset of `splits`.
    public static final long OFFSET_splits = LAYOUT.byteOffset(PathElement.groupElement("splits"));
    /// The memory layout of `splits`.
    public static final MemoryLayout LAYOUT_splits = LAYOUT.select(PathElement.groupElement("splits"));
    /// The [VarHandle] of `splits` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_splits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("splits"));
    /// The byte offset of `fast_alpha`.
    public static final long OFFSET_fast_alpha = LAYOUT.byteOffset(PathElement.groupElement("fast_alpha"));
    /// The memory layout of `fast_alpha`.
    public static final MemoryLayout LAYOUT_fast_alpha = LAYOUT.select(PathElement.groupElement("fast_alpha"));
    /// The [VarHandle] of `fast_alpha` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fast_alpha = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fast_alpha"));
    /// The byte offset of `needs_rebuild`.
    public static final long OFFSET_needs_rebuild = LAYOUT.byteOffset(PathElement.groupElement("needs_rebuild"));
    /// The memory layout of `needs_rebuild`.
    public static final MemoryLayout LAYOUT_needs_rebuild = LAYOUT.select(PathElement.groupElement("needs_rebuild"));
    /// The [VarHandle] of `needs_rebuild` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_needs_rebuild = LAYOUT.arrayElementVarHandle(PathElement.groupElement("needs_rebuild"));
    /// The byte offset of `called_alloc`.
    public static final long OFFSET_called_alloc = LAYOUT.byteOffset(PathElement.groupElement("called_alloc"));
    /// The memory layout of `called_alloc`.
    public static final MemoryLayout LAYOUT_called_alloc = LAYOUT.select(PathElement.groupElement("called_alloc"));
    /// The [VarHandle] of `called_alloc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_called_alloc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("called_alloc"));
    /// The byte offset of `input_pixel_layout_public`.
    public static final long OFFSET_input_pixel_layout_public = LAYOUT.byteOffset(PathElement.groupElement("input_pixel_layout_public"));
    /// The memory layout of `input_pixel_layout_public`.
    public static final MemoryLayout LAYOUT_input_pixel_layout_public = LAYOUT.select(PathElement.groupElement("input_pixel_layout_public"));
    /// The [VarHandle] of `input_pixel_layout_public` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_input_pixel_layout_public = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input_pixel_layout_public"));
    /// The byte offset of `output_pixel_layout_public`.
    public static final long OFFSET_output_pixel_layout_public = LAYOUT.byteOffset(PathElement.groupElement("output_pixel_layout_public"));
    /// The memory layout of `output_pixel_layout_public`.
    public static final MemoryLayout LAYOUT_output_pixel_layout_public = LAYOUT.select(PathElement.groupElement("output_pixel_layout_public"));
    /// The [VarHandle] of `output_pixel_layout_public` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_output_pixel_layout_public = LAYOUT.arrayElementVarHandle(PathElement.groupElement("output_pixel_layout_public"));
    /// The byte offset of `input_data_type`.
    public static final long OFFSET_input_data_type = LAYOUT.byteOffset(PathElement.groupElement("input_data_type"));
    /// The memory layout of `input_data_type`.
    public static final MemoryLayout LAYOUT_input_data_type = LAYOUT.select(PathElement.groupElement("input_data_type"));
    /// The [VarHandle] of `input_data_type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_input_data_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input_data_type"));
    /// The byte offset of `output_data_type`.
    public static final long OFFSET_output_data_type = LAYOUT.byteOffset(PathElement.groupElement("output_data_type"));
    /// The memory layout of `output_data_type`.
    public static final MemoryLayout LAYOUT_output_data_type = LAYOUT.select(PathElement.groupElement("output_data_type"));
    /// The [VarHandle] of `output_data_type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_output_data_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("output_data_type"));
    /// The byte offset of `horizontal_filter`.
    public static final long OFFSET_horizontal_filter = LAYOUT.byteOffset(PathElement.groupElement("horizontal_filter"));
    /// The memory layout of `horizontal_filter`.
    public static final MemoryLayout LAYOUT_horizontal_filter = LAYOUT.select(PathElement.groupElement("horizontal_filter"));
    /// The [VarHandle] of `horizontal_filter` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_horizontal_filter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("horizontal_filter"));
    /// The byte offset of `vertical_filter`.
    public static final long OFFSET_vertical_filter = LAYOUT.byteOffset(PathElement.groupElement("vertical_filter"));
    /// The memory layout of `vertical_filter`.
    public static final MemoryLayout LAYOUT_vertical_filter = LAYOUT.select(PathElement.groupElement("vertical_filter"));
    /// The [VarHandle] of `vertical_filter` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertical_filter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertical_filter"));
    /// The byte offset of `horizontal_edge`.
    public static final long OFFSET_horizontal_edge = LAYOUT.byteOffset(PathElement.groupElement("horizontal_edge"));
    /// The memory layout of `horizontal_edge`.
    public static final MemoryLayout LAYOUT_horizontal_edge = LAYOUT.select(PathElement.groupElement("horizontal_edge"));
    /// The [VarHandle] of `horizontal_edge` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_horizontal_edge = LAYOUT.arrayElementVarHandle(PathElement.groupElement("horizontal_edge"));
    /// The byte offset of `vertical_edge`.
    public static final long OFFSET_vertical_edge = LAYOUT.byteOffset(PathElement.groupElement("vertical_edge"));
    /// The memory layout of `vertical_edge`.
    public static final MemoryLayout LAYOUT_vertical_edge = LAYOUT.select(PathElement.groupElement("vertical_edge"));
    /// The [VarHandle] of `vertical_edge` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertical_edge = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertical_edge"));
    /// The byte offset of `horizontal_filter_kernel`.
    public static final long OFFSET_horizontal_filter_kernel = LAYOUT.byteOffset(PathElement.groupElement("horizontal_filter_kernel"));
    /// The memory layout of `horizontal_filter_kernel`.
    public static final MemoryLayout LAYOUT_horizontal_filter_kernel = LAYOUT.select(PathElement.groupElement("horizontal_filter_kernel"));
    /// The [VarHandle] of `horizontal_filter_kernel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_horizontal_filter_kernel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("horizontal_filter_kernel"));
    /// The byte offset of `horizontal_filter_support`.
    public static final long OFFSET_horizontal_filter_support = LAYOUT.byteOffset(PathElement.groupElement("horizontal_filter_support"));
    /// The memory layout of `horizontal_filter_support`.
    public static final MemoryLayout LAYOUT_horizontal_filter_support = LAYOUT.select(PathElement.groupElement("horizontal_filter_support"));
    /// The [VarHandle] of `horizontal_filter_support` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_horizontal_filter_support = LAYOUT.arrayElementVarHandle(PathElement.groupElement("horizontal_filter_support"));
    /// The byte offset of `vertical_filter_kernel`.
    public static final long OFFSET_vertical_filter_kernel = LAYOUT.byteOffset(PathElement.groupElement("vertical_filter_kernel"));
    /// The memory layout of `vertical_filter_kernel`.
    public static final MemoryLayout LAYOUT_vertical_filter_kernel = LAYOUT.select(PathElement.groupElement("vertical_filter_kernel"));
    /// The [VarHandle] of `vertical_filter_kernel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertical_filter_kernel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertical_filter_kernel"));
    /// The byte offset of `vertical_filter_support`.
    public static final long OFFSET_vertical_filter_support = LAYOUT.byteOffset(PathElement.groupElement("vertical_filter_support"));
    /// The memory layout of `vertical_filter_support`.
    public static final MemoryLayout LAYOUT_vertical_filter_support = LAYOUT.select(PathElement.groupElement("vertical_filter_support"));
    /// The [VarHandle] of `vertical_filter_support` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertical_filter_support = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertical_filter_support"));
    /// The byte offset of `samplers`.
    public static final long OFFSET_samplers = LAYOUT.byteOffset(PathElement.groupElement("samplers"));
    /// The memory layout of `samplers`.
    public static final MemoryLayout LAYOUT_samplers = LAYOUT.select(PathElement.groupElement("samplers"));
    /// The [VarHandle] of `samplers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_samplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplers"));

    /// Creates `STBIR_RESIZE` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public STBIR_RESIZE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `STBIR_RESIZE` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBIR_RESIZE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBIR_RESIZE(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBIR_RESIZE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBIR_RESIZE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBIR_RESIZE(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `STBIR_RESIZE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBIR_RESIZE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new STBIR_RESIZE(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE alloc(SegmentAllocator allocator) { return new STBIR_RESIZE(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE alloc(SegmentAllocator allocator, long count) { return new STBIR_RESIZE(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @param output_suby `output_suby`
    /// @param output_subw `output_subw`
    /// @param output_subh `output_subh`
    /// @param output_cb `output_cb`
    /// @param input_stride_in_bytes `input_stride_in_bytes`
    /// @param output_stride_in_bytes `output_stride_in_bytes`
    /// @param splits `splits`
    /// @param fast_alpha `fast_alpha`
    /// @param needs_rebuild `needs_rebuild`
    /// @param called_alloc `called_alloc`
    /// @param input_pixel_layout_public `input_pixel_layout_public`
    /// @param output_pixel_layout_public `output_pixel_layout_public`
    /// @param input_data_type `input_data_type`
    /// @param output_data_type `output_data_type`
    /// @param horizontal_filter `horizontal_filter`
    /// @param vertical_filter `vertical_filter`
    /// @param horizontal_edge `horizontal_edge`
    /// @param vertical_edge `vertical_edge`
    /// @param horizontal_filter_kernel `horizontal_filter_kernel`
    /// @param horizontal_filter_support `horizontal_filter_support`
    /// @param vertical_filter_kernel `vertical_filter_kernel`
    /// @param vertical_filter_support `vertical_filter_support`
    /// @param samplers `samplers`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx, int output_suby, int output_subw, int output_subh, MemorySegment output_cb, int input_stride_in_bytes, int output_stride_in_bytes, int splits, int fast_alpha, int needs_rebuild, int called_alloc, int input_pixel_layout_public, int output_pixel_layout_public, int input_data_type, int output_data_type, int horizontal_filter, int vertical_filter, int horizontal_edge, int vertical_edge, MemorySegment horizontal_filter_kernel, MemorySegment horizontal_filter_support, MemorySegment vertical_filter_kernel, MemorySegment vertical_filter_support, MemorySegment samplers) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx).output_suby(output_suby).output_subw(output_subw).output_subh(output_subh).output_cb(output_cb).input_stride_in_bytes(input_stride_in_bytes).output_stride_in_bytes(output_stride_in_bytes).splits(splits).fast_alpha(fast_alpha).needs_rebuild(needs_rebuild).called_alloc(called_alloc).input_pixel_layout_public(input_pixel_layout_public).output_pixel_layout_public(output_pixel_layout_public).input_data_type(input_data_type).output_data_type(output_data_type).horizontal_filter(horizontal_filter).vertical_filter(vertical_filter).horizontal_edge(horizontal_edge).vertical_edge(vertical_edge).horizontal_filter_kernel(horizontal_filter_kernel).horizontal_filter_support(horizontal_filter_support).vertical_filter_kernel(vertical_filter_kernel).vertical_filter_support(vertical_filter_support).samplers(samplers);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @param output_suby `output_suby`
    /// @param output_subw `output_subw`
    /// @param output_subh `output_subh`
    /// @param output_cb `output_cb`
    /// @param input_stride_in_bytes `input_stride_in_bytes`
    /// @param output_stride_in_bytes `output_stride_in_bytes`
    /// @param splits `splits`
    /// @param fast_alpha `fast_alpha`
    /// @param needs_rebuild `needs_rebuild`
    /// @param called_alloc `called_alloc`
    /// @param input_pixel_layout_public `input_pixel_layout_public`
    /// @param output_pixel_layout_public `output_pixel_layout_public`
    /// @param input_data_type `input_data_type`
    /// @param output_data_type `output_data_type`
    /// @param horizontal_filter `horizontal_filter`
    /// @param vertical_filter `vertical_filter`
    /// @param horizontal_edge `horizontal_edge`
    /// @param vertical_edge `vertical_edge`
    /// @param horizontal_filter_kernel `horizontal_filter_kernel`
    /// @param horizontal_filter_support `horizontal_filter_support`
    /// @param vertical_filter_kernel `vertical_filter_kernel`
    /// @param vertical_filter_support `vertical_filter_support`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx, int output_suby, int output_subw, int output_subh, MemorySegment output_cb, int input_stride_in_bytes, int output_stride_in_bytes, int splits, int fast_alpha, int needs_rebuild, int called_alloc, int input_pixel_layout_public, int output_pixel_layout_public, int input_data_type, int output_data_type, int horizontal_filter, int vertical_filter, int horizontal_edge, int vertical_edge, MemorySegment horizontal_filter_kernel, MemorySegment horizontal_filter_support, MemorySegment vertical_filter_kernel, MemorySegment vertical_filter_support) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx).output_suby(output_suby).output_subw(output_subw).output_subh(output_subh).output_cb(output_cb).input_stride_in_bytes(input_stride_in_bytes).output_stride_in_bytes(output_stride_in_bytes).splits(splits).fast_alpha(fast_alpha).needs_rebuild(needs_rebuild).called_alloc(called_alloc).input_pixel_layout_public(input_pixel_layout_public).output_pixel_layout_public(output_pixel_layout_public).input_data_type(input_data_type).output_data_type(output_data_type).horizontal_filter(horizontal_filter).vertical_filter(vertical_filter).horizontal_edge(horizontal_edge).vertical_edge(vertical_edge).horizontal_filter_kernel(horizontal_filter_kernel).horizontal_filter_support(horizontal_filter_support).vertical_filter_kernel(vertical_filter_kernel).vertical_filter_support(vertical_filter_support);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @param output_suby `output_suby`
    /// @param output_subw `output_subw`
    /// @param output_subh `output_subh`
    /// @param output_cb `output_cb`
    /// @param input_stride_in_bytes `input_stride_in_bytes`
    /// @param output_stride_in_bytes `output_stride_in_bytes`
    /// @param splits `splits`
    /// @param fast_alpha `fast_alpha`
    /// @param needs_rebuild `needs_rebuild`
    /// @param called_alloc `called_alloc`
    /// @param input_pixel_layout_public `input_pixel_layout_public`
    /// @param output_pixel_layout_public `output_pixel_layout_public`
    /// @param input_data_type `input_data_type`
    /// @param output_data_type `output_data_type`
    /// @param horizontal_filter `horizontal_filter`
    /// @param vertical_filter `vertical_filter`
    /// @param horizontal_edge `horizontal_edge`
    /// @param vertical_edge `vertical_edge`
    /// @param horizontal_filter_kernel `horizontal_filter_kernel`
    /// @param horizontal_filter_support `horizontal_filter_support`
    /// @param vertical_filter_kernel `vertical_filter_kernel`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx, int output_suby, int output_subw, int output_subh, MemorySegment output_cb, int input_stride_in_bytes, int output_stride_in_bytes, int splits, int fast_alpha, int needs_rebuild, int called_alloc, int input_pixel_layout_public, int output_pixel_layout_public, int input_data_type, int output_data_type, int horizontal_filter, int vertical_filter, int horizontal_edge, int vertical_edge, MemorySegment horizontal_filter_kernel, MemorySegment horizontal_filter_support, MemorySegment vertical_filter_kernel) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx).output_suby(output_suby).output_subw(output_subw).output_subh(output_subh).output_cb(output_cb).input_stride_in_bytes(input_stride_in_bytes).output_stride_in_bytes(output_stride_in_bytes).splits(splits).fast_alpha(fast_alpha).needs_rebuild(needs_rebuild).called_alloc(called_alloc).input_pixel_layout_public(input_pixel_layout_public).output_pixel_layout_public(output_pixel_layout_public).input_data_type(input_data_type).output_data_type(output_data_type).horizontal_filter(horizontal_filter).vertical_filter(vertical_filter).horizontal_edge(horizontal_edge).vertical_edge(vertical_edge).horizontal_filter_kernel(horizontal_filter_kernel).horizontal_filter_support(horizontal_filter_support).vertical_filter_kernel(vertical_filter_kernel);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @param output_suby `output_suby`
    /// @param output_subw `output_subw`
    /// @param output_subh `output_subh`
    /// @param output_cb `output_cb`
    /// @param input_stride_in_bytes `input_stride_in_bytes`
    /// @param output_stride_in_bytes `output_stride_in_bytes`
    /// @param splits `splits`
    /// @param fast_alpha `fast_alpha`
    /// @param needs_rebuild `needs_rebuild`
    /// @param called_alloc `called_alloc`
    /// @param input_pixel_layout_public `input_pixel_layout_public`
    /// @param output_pixel_layout_public `output_pixel_layout_public`
    /// @param input_data_type `input_data_type`
    /// @param output_data_type `output_data_type`
    /// @param horizontal_filter `horizontal_filter`
    /// @param vertical_filter `vertical_filter`
    /// @param horizontal_edge `horizontal_edge`
    /// @param vertical_edge `vertical_edge`
    /// @param horizontal_filter_kernel `horizontal_filter_kernel`
    /// @param horizontal_filter_support `horizontal_filter_support`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx, int output_suby, int output_subw, int output_subh, MemorySegment output_cb, int input_stride_in_bytes, int output_stride_in_bytes, int splits, int fast_alpha, int needs_rebuild, int called_alloc, int input_pixel_layout_public, int output_pixel_layout_public, int input_data_type, int output_data_type, int horizontal_filter, int vertical_filter, int horizontal_edge, int vertical_edge, MemorySegment horizontal_filter_kernel, MemorySegment horizontal_filter_support) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx).output_suby(output_suby).output_subw(output_subw).output_subh(output_subh).output_cb(output_cb).input_stride_in_bytes(input_stride_in_bytes).output_stride_in_bytes(output_stride_in_bytes).splits(splits).fast_alpha(fast_alpha).needs_rebuild(needs_rebuild).called_alloc(called_alloc).input_pixel_layout_public(input_pixel_layout_public).output_pixel_layout_public(output_pixel_layout_public).input_data_type(input_data_type).output_data_type(output_data_type).horizontal_filter(horizontal_filter).vertical_filter(vertical_filter).horizontal_edge(horizontal_edge).vertical_edge(vertical_edge).horizontal_filter_kernel(horizontal_filter_kernel).horizontal_filter_support(horizontal_filter_support);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @param output_suby `output_suby`
    /// @param output_subw `output_subw`
    /// @param output_subh `output_subh`
    /// @param output_cb `output_cb`
    /// @param input_stride_in_bytes `input_stride_in_bytes`
    /// @param output_stride_in_bytes `output_stride_in_bytes`
    /// @param splits `splits`
    /// @param fast_alpha `fast_alpha`
    /// @param needs_rebuild `needs_rebuild`
    /// @param called_alloc `called_alloc`
    /// @param input_pixel_layout_public `input_pixel_layout_public`
    /// @param output_pixel_layout_public `output_pixel_layout_public`
    /// @param input_data_type `input_data_type`
    /// @param output_data_type `output_data_type`
    /// @param horizontal_filter `horizontal_filter`
    /// @param vertical_filter `vertical_filter`
    /// @param horizontal_edge `horizontal_edge`
    /// @param vertical_edge `vertical_edge`
    /// @param horizontal_filter_kernel `horizontal_filter_kernel`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx, int output_suby, int output_subw, int output_subh, MemorySegment output_cb, int input_stride_in_bytes, int output_stride_in_bytes, int splits, int fast_alpha, int needs_rebuild, int called_alloc, int input_pixel_layout_public, int output_pixel_layout_public, int input_data_type, int output_data_type, int horizontal_filter, int vertical_filter, int horizontal_edge, int vertical_edge, MemorySegment horizontal_filter_kernel) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx).output_suby(output_suby).output_subw(output_subw).output_subh(output_subh).output_cb(output_cb).input_stride_in_bytes(input_stride_in_bytes).output_stride_in_bytes(output_stride_in_bytes).splits(splits).fast_alpha(fast_alpha).needs_rebuild(needs_rebuild).called_alloc(called_alloc).input_pixel_layout_public(input_pixel_layout_public).output_pixel_layout_public(output_pixel_layout_public).input_data_type(input_data_type).output_data_type(output_data_type).horizontal_filter(horizontal_filter).vertical_filter(vertical_filter).horizontal_edge(horizontal_edge).vertical_edge(vertical_edge).horizontal_filter_kernel(horizontal_filter_kernel);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @param output_suby `output_suby`
    /// @param output_subw `output_subw`
    /// @param output_subh `output_subh`
    /// @param output_cb `output_cb`
    /// @param input_stride_in_bytes `input_stride_in_bytes`
    /// @param output_stride_in_bytes `output_stride_in_bytes`
    /// @param splits `splits`
    /// @param fast_alpha `fast_alpha`
    /// @param needs_rebuild `needs_rebuild`
    /// @param called_alloc `called_alloc`
    /// @param input_pixel_layout_public `input_pixel_layout_public`
    /// @param output_pixel_layout_public `output_pixel_layout_public`
    /// @param input_data_type `input_data_type`
    /// @param output_data_type `output_data_type`
    /// @param horizontal_filter `horizontal_filter`
    /// @param vertical_filter `vertical_filter`
    /// @param horizontal_edge `horizontal_edge`
    /// @param vertical_edge `vertical_edge`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx, int output_suby, int output_subw, int output_subh, MemorySegment output_cb, int input_stride_in_bytes, int output_stride_in_bytes, int splits, int fast_alpha, int needs_rebuild, int called_alloc, int input_pixel_layout_public, int output_pixel_layout_public, int input_data_type, int output_data_type, int horizontal_filter, int vertical_filter, int horizontal_edge, int vertical_edge) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx).output_suby(output_suby).output_subw(output_subw).output_subh(output_subh).output_cb(output_cb).input_stride_in_bytes(input_stride_in_bytes).output_stride_in_bytes(output_stride_in_bytes).splits(splits).fast_alpha(fast_alpha).needs_rebuild(needs_rebuild).called_alloc(called_alloc).input_pixel_layout_public(input_pixel_layout_public).output_pixel_layout_public(output_pixel_layout_public).input_data_type(input_data_type).output_data_type(output_data_type).horizontal_filter(horizontal_filter).vertical_filter(vertical_filter).horizontal_edge(horizontal_edge).vertical_edge(vertical_edge);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @param output_suby `output_suby`
    /// @param output_subw `output_subw`
    /// @param output_subh `output_subh`
    /// @param output_cb `output_cb`
    /// @param input_stride_in_bytes `input_stride_in_bytes`
    /// @param output_stride_in_bytes `output_stride_in_bytes`
    /// @param splits `splits`
    /// @param fast_alpha `fast_alpha`
    /// @param needs_rebuild `needs_rebuild`
    /// @param called_alloc `called_alloc`
    /// @param input_pixel_layout_public `input_pixel_layout_public`
    /// @param output_pixel_layout_public `output_pixel_layout_public`
    /// @param input_data_type `input_data_type`
    /// @param output_data_type `output_data_type`
    /// @param horizontal_filter `horizontal_filter`
    /// @param vertical_filter `vertical_filter`
    /// @param horizontal_edge `horizontal_edge`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx, int output_suby, int output_subw, int output_subh, MemorySegment output_cb, int input_stride_in_bytes, int output_stride_in_bytes, int splits, int fast_alpha, int needs_rebuild, int called_alloc, int input_pixel_layout_public, int output_pixel_layout_public, int input_data_type, int output_data_type, int horizontal_filter, int vertical_filter, int horizontal_edge) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx).output_suby(output_suby).output_subw(output_subw).output_subh(output_subh).output_cb(output_cb).input_stride_in_bytes(input_stride_in_bytes).output_stride_in_bytes(output_stride_in_bytes).splits(splits).fast_alpha(fast_alpha).needs_rebuild(needs_rebuild).called_alloc(called_alloc).input_pixel_layout_public(input_pixel_layout_public).output_pixel_layout_public(output_pixel_layout_public).input_data_type(input_data_type).output_data_type(output_data_type).horizontal_filter(horizontal_filter).vertical_filter(vertical_filter).horizontal_edge(horizontal_edge);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @param output_suby `output_suby`
    /// @param output_subw `output_subw`
    /// @param output_subh `output_subh`
    /// @param output_cb `output_cb`
    /// @param input_stride_in_bytes `input_stride_in_bytes`
    /// @param output_stride_in_bytes `output_stride_in_bytes`
    /// @param splits `splits`
    /// @param fast_alpha `fast_alpha`
    /// @param needs_rebuild `needs_rebuild`
    /// @param called_alloc `called_alloc`
    /// @param input_pixel_layout_public `input_pixel_layout_public`
    /// @param output_pixel_layout_public `output_pixel_layout_public`
    /// @param input_data_type `input_data_type`
    /// @param output_data_type `output_data_type`
    /// @param horizontal_filter `horizontal_filter`
    /// @param vertical_filter `vertical_filter`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx, int output_suby, int output_subw, int output_subh, MemorySegment output_cb, int input_stride_in_bytes, int output_stride_in_bytes, int splits, int fast_alpha, int needs_rebuild, int called_alloc, int input_pixel_layout_public, int output_pixel_layout_public, int input_data_type, int output_data_type, int horizontal_filter, int vertical_filter) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx).output_suby(output_suby).output_subw(output_subw).output_subh(output_subh).output_cb(output_cb).input_stride_in_bytes(input_stride_in_bytes).output_stride_in_bytes(output_stride_in_bytes).splits(splits).fast_alpha(fast_alpha).needs_rebuild(needs_rebuild).called_alloc(called_alloc).input_pixel_layout_public(input_pixel_layout_public).output_pixel_layout_public(output_pixel_layout_public).input_data_type(input_data_type).output_data_type(output_data_type).horizontal_filter(horizontal_filter).vertical_filter(vertical_filter);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @param output_suby `output_suby`
    /// @param output_subw `output_subw`
    /// @param output_subh `output_subh`
    /// @param output_cb `output_cb`
    /// @param input_stride_in_bytes `input_stride_in_bytes`
    /// @param output_stride_in_bytes `output_stride_in_bytes`
    /// @param splits `splits`
    /// @param fast_alpha `fast_alpha`
    /// @param needs_rebuild `needs_rebuild`
    /// @param called_alloc `called_alloc`
    /// @param input_pixel_layout_public `input_pixel_layout_public`
    /// @param output_pixel_layout_public `output_pixel_layout_public`
    /// @param input_data_type `input_data_type`
    /// @param output_data_type `output_data_type`
    /// @param horizontal_filter `horizontal_filter`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx, int output_suby, int output_subw, int output_subh, MemorySegment output_cb, int input_stride_in_bytes, int output_stride_in_bytes, int splits, int fast_alpha, int needs_rebuild, int called_alloc, int input_pixel_layout_public, int output_pixel_layout_public, int input_data_type, int output_data_type, int horizontal_filter) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx).output_suby(output_suby).output_subw(output_subw).output_subh(output_subh).output_cb(output_cb).input_stride_in_bytes(input_stride_in_bytes).output_stride_in_bytes(output_stride_in_bytes).splits(splits).fast_alpha(fast_alpha).needs_rebuild(needs_rebuild).called_alloc(called_alloc).input_pixel_layout_public(input_pixel_layout_public).output_pixel_layout_public(output_pixel_layout_public).input_data_type(input_data_type).output_data_type(output_data_type).horizontal_filter(horizontal_filter);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @param output_suby `output_suby`
    /// @param output_subw `output_subw`
    /// @param output_subh `output_subh`
    /// @param output_cb `output_cb`
    /// @param input_stride_in_bytes `input_stride_in_bytes`
    /// @param output_stride_in_bytes `output_stride_in_bytes`
    /// @param splits `splits`
    /// @param fast_alpha `fast_alpha`
    /// @param needs_rebuild `needs_rebuild`
    /// @param called_alloc `called_alloc`
    /// @param input_pixel_layout_public `input_pixel_layout_public`
    /// @param output_pixel_layout_public `output_pixel_layout_public`
    /// @param input_data_type `input_data_type`
    /// @param output_data_type `output_data_type`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx, int output_suby, int output_subw, int output_subh, MemorySegment output_cb, int input_stride_in_bytes, int output_stride_in_bytes, int splits, int fast_alpha, int needs_rebuild, int called_alloc, int input_pixel_layout_public, int output_pixel_layout_public, int input_data_type, int output_data_type) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx).output_suby(output_suby).output_subw(output_subw).output_subh(output_subh).output_cb(output_cb).input_stride_in_bytes(input_stride_in_bytes).output_stride_in_bytes(output_stride_in_bytes).splits(splits).fast_alpha(fast_alpha).needs_rebuild(needs_rebuild).called_alloc(called_alloc).input_pixel_layout_public(input_pixel_layout_public).output_pixel_layout_public(output_pixel_layout_public).input_data_type(input_data_type).output_data_type(output_data_type);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @param output_suby `output_suby`
    /// @param output_subw `output_subw`
    /// @param output_subh `output_subh`
    /// @param output_cb `output_cb`
    /// @param input_stride_in_bytes `input_stride_in_bytes`
    /// @param output_stride_in_bytes `output_stride_in_bytes`
    /// @param splits `splits`
    /// @param fast_alpha `fast_alpha`
    /// @param needs_rebuild `needs_rebuild`
    /// @param called_alloc `called_alloc`
    /// @param input_pixel_layout_public `input_pixel_layout_public`
    /// @param output_pixel_layout_public `output_pixel_layout_public`
    /// @param input_data_type `input_data_type`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx, int output_suby, int output_subw, int output_subh, MemorySegment output_cb, int input_stride_in_bytes, int output_stride_in_bytes, int splits, int fast_alpha, int needs_rebuild, int called_alloc, int input_pixel_layout_public, int output_pixel_layout_public, int input_data_type) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx).output_suby(output_suby).output_subw(output_subw).output_subh(output_subh).output_cb(output_cb).input_stride_in_bytes(input_stride_in_bytes).output_stride_in_bytes(output_stride_in_bytes).splits(splits).fast_alpha(fast_alpha).needs_rebuild(needs_rebuild).called_alloc(called_alloc).input_pixel_layout_public(input_pixel_layout_public).output_pixel_layout_public(output_pixel_layout_public).input_data_type(input_data_type);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @param output_suby `output_suby`
    /// @param output_subw `output_subw`
    /// @param output_subh `output_subh`
    /// @param output_cb `output_cb`
    /// @param input_stride_in_bytes `input_stride_in_bytes`
    /// @param output_stride_in_bytes `output_stride_in_bytes`
    /// @param splits `splits`
    /// @param fast_alpha `fast_alpha`
    /// @param needs_rebuild `needs_rebuild`
    /// @param called_alloc `called_alloc`
    /// @param input_pixel_layout_public `input_pixel_layout_public`
    /// @param output_pixel_layout_public `output_pixel_layout_public`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx, int output_suby, int output_subw, int output_subh, MemorySegment output_cb, int input_stride_in_bytes, int output_stride_in_bytes, int splits, int fast_alpha, int needs_rebuild, int called_alloc, int input_pixel_layout_public, int output_pixel_layout_public) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx).output_suby(output_suby).output_subw(output_subw).output_subh(output_subh).output_cb(output_cb).input_stride_in_bytes(input_stride_in_bytes).output_stride_in_bytes(output_stride_in_bytes).splits(splits).fast_alpha(fast_alpha).needs_rebuild(needs_rebuild).called_alloc(called_alloc).input_pixel_layout_public(input_pixel_layout_public).output_pixel_layout_public(output_pixel_layout_public);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @param output_suby `output_suby`
    /// @param output_subw `output_subw`
    /// @param output_subh `output_subh`
    /// @param output_cb `output_cb`
    /// @param input_stride_in_bytes `input_stride_in_bytes`
    /// @param output_stride_in_bytes `output_stride_in_bytes`
    /// @param splits `splits`
    /// @param fast_alpha `fast_alpha`
    /// @param needs_rebuild `needs_rebuild`
    /// @param called_alloc `called_alloc`
    /// @param input_pixel_layout_public `input_pixel_layout_public`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx, int output_suby, int output_subw, int output_subh, MemorySegment output_cb, int input_stride_in_bytes, int output_stride_in_bytes, int splits, int fast_alpha, int needs_rebuild, int called_alloc, int input_pixel_layout_public) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx).output_suby(output_suby).output_subw(output_subw).output_subh(output_subh).output_cb(output_cb).input_stride_in_bytes(input_stride_in_bytes).output_stride_in_bytes(output_stride_in_bytes).splits(splits).fast_alpha(fast_alpha).needs_rebuild(needs_rebuild).called_alloc(called_alloc).input_pixel_layout_public(input_pixel_layout_public);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @param output_suby `output_suby`
    /// @param output_subw `output_subw`
    /// @param output_subh `output_subh`
    /// @param output_cb `output_cb`
    /// @param input_stride_in_bytes `input_stride_in_bytes`
    /// @param output_stride_in_bytes `output_stride_in_bytes`
    /// @param splits `splits`
    /// @param fast_alpha `fast_alpha`
    /// @param needs_rebuild `needs_rebuild`
    /// @param called_alloc `called_alloc`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx, int output_suby, int output_subw, int output_subh, MemorySegment output_cb, int input_stride_in_bytes, int output_stride_in_bytes, int splits, int fast_alpha, int needs_rebuild, int called_alloc) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx).output_suby(output_suby).output_subw(output_subw).output_subh(output_subh).output_cb(output_cb).input_stride_in_bytes(input_stride_in_bytes).output_stride_in_bytes(output_stride_in_bytes).splits(splits).fast_alpha(fast_alpha).needs_rebuild(needs_rebuild).called_alloc(called_alloc);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @param output_suby `output_suby`
    /// @param output_subw `output_subw`
    /// @param output_subh `output_subh`
    /// @param output_cb `output_cb`
    /// @param input_stride_in_bytes `input_stride_in_bytes`
    /// @param output_stride_in_bytes `output_stride_in_bytes`
    /// @param splits `splits`
    /// @param fast_alpha `fast_alpha`
    /// @param needs_rebuild `needs_rebuild`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx, int output_suby, int output_subw, int output_subh, MemorySegment output_cb, int input_stride_in_bytes, int output_stride_in_bytes, int splits, int fast_alpha, int needs_rebuild) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx).output_suby(output_suby).output_subw(output_subw).output_subh(output_subh).output_cb(output_cb).input_stride_in_bytes(input_stride_in_bytes).output_stride_in_bytes(output_stride_in_bytes).splits(splits).fast_alpha(fast_alpha).needs_rebuild(needs_rebuild);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @param output_suby `output_suby`
    /// @param output_subw `output_subw`
    /// @param output_subh `output_subh`
    /// @param output_cb `output_cb`
    /// @param input_stride_in_bytes `input_stride_in_bytes`
    /// @param output_stride_in_bytes `output_stride_in_bytes`
    /// @param splits `splits`
    /// @param fast_alpha `fast_alpha`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx, int output_suby, int output_subw, int output_subh, MemorySegment output_cb, int input_stride_in_bytes, int output_stride_in_bytes, int splits, int fast_alpha) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx).output_suby(output_suby).output_subw(output_subw).output_subh(output_subh).output_cb(output_cb).input_stride_in_bytes(input_stride_in_bytes).output_stride_in_bytes(output_stride_in_bytes).splits(splits).fast_alpha(fast_alpha);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @param output_suby `output_suby`
    /// @param output_subw `output_subw`
    /// @param output_subh `output_subh`
    /// @param output_cb `output_cb`
    /// @param input_stride_in_bytes `input_stride_in_bytes`
    /// @param output_stride_in_bytes `output_stride_in_bytes`
    /// @param splits `splits`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx, int output_suby, int output_subw, int output_subh, MemorySegment output_cb, int input_stride_in_bytes, int output_stride_in_bytes, int splits) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx).output_suby(output_suby).output_subw(output_subw).output_subh(output_subh).output_cb(output_cb).input_stride_in_bytes(input_stride_in_bytes).output_stride_in_bytes(output_stride_in_bytes).splits(splits);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @param output_suby `output_suby`
    /// @param output_subw `output_subw`
    /// @param output_subh `output_subh`
    /// @param output_cb `output_cb`
    /// @param input_stride_in_bytes `input_stride_in_bytes`
    /// @param output_stride_in_bytes `output_stride_in_bytes`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx, int output_suby, int output_subw, int output_subh, MemorySegment output_cb, int input_stride_in_bytes, int output_stride_in_bytes) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx).output_suby(output_suby).output_subw(output_subw).output_subh(output_subh).output_cb(output_cb).input_stride_in_bytes(input_stride_in_bytes).output_stride_in_bytes(output_stride_in_bytes);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @param output_suby `output_suby`
    /// @param output_subw `output_subw`
    /// @param output_subh `output_subh`
    /// @param output_cb `output_cb`
    /// @param input_stride_in_bytes `input_stride_in_bytes`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx, int output_suby, int output_subw, int output_subh, MemorySegment output_cb, int input_stride_in_bytes) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx).output_suby(output_suby).output_subw(output_subw).output_subh(output_subh).output_cb(output_cb).input_stride_in_bytes(input_stride_in_bytes);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @param output_suby `output_suby`
    /// @param output_subw `output_subw`
    /// @param output_subh `output_subh`
    /// @param output_cb `output_cb`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx, int output_suby, int output_subw, int output_subh, MemorySegment output_cb) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx).output_suby(output_suby).output_subw(output_subw).output_subh(output_subh).output_cb(output_cb);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @param output_suby `output_suby`
    /// @param output_subw `output_subw`
    /// @param output_subh `output_subh`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx, int output_suby, int output_subw, int output_subh) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx).output_suby(output_suby).output_subw(output_subw).output_subh(output_subh);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @param output_suby `output_suby`
    /// @param output_subw `output_subw`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx, int output_suby, int output_subw) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx).output_suby(output_suby).output_subw(output_subw);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @param output_suby `output_suby`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx, int output_suby) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx).output_suby(output_suby);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @param output_subx `output_subx`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h, int output_subx) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h).output_subx(output_subx);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @param output_h `output_h`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w, int output_h) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w).output_h(output_h);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @param output_w `output_w`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels, int output_w) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels).output_w(output_w);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @param output_pixels `output_pixels`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb, MemorySegment output_pixels) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb).output_pixels(output_pixels);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @param input_cb `input_cb`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1, MemorySegment input_cb) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1).input_cb(input_cb);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @param input_t1 `input_t1`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1, double input_t1) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1).input_t1(input_t1);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @param input_s1 `input_s1`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0, double input_s1) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0).input_s1(input_s1);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @param input_t0 `input_t0`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0, double input_t0) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0).input_t0(input_t0);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @param input_s0 `input_s0`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h, double input_s0) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h).input_s0(input_s0);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @param input_h `input_h`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w, int input_h) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w).input_h(input_h);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @param input_w `input_w`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels, int input_w) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels).input_w(input_w);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @param input_pixels `input_pixels`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data, MemorySegment input_pixels) {
        return alloc(allocator).user_data(user_data).input_pixels(input_pixels);
    }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param user_data `user_data`
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE allocInit(SegmentAllocator allocator, MemorySegment user_data) {
        return alloc(allocator).user_data(user_data);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public STBIR_RESIZE copyFrom(STBIR_RESIZE src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public STBIR_RESIZE reinterpret(long count) { return new STBIR_RESIZE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `user_data` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment user_data(MemorySegment segment, long index) { return (MemorySegment) VH_user_data.get(segment, 0L, index); }
    /// {@return `user_data`}
    public MemorySegment user_data() { return user_data(this.segment(), 0L); }
    /// Sets `user_data` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void user_data(MemorySegment segment, long index, MemorySegment value) { VH_user_data.set(segment, 0L, index, value); }
    /// Sets `user_data` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE user_data(MemorySegment value) { user_data(this.segment(), 0L, value); return this; }

    /// {@return `input_pixels` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment input_pixels(MemorySegment segment, long index) { return (MemorySegment) VH_input_pixels.get(segment, 0L, index); }
    /// {@return `input_pixels`}
    public MemorySegment input_pixels() { return input_pixels(this.segment(), 0L); }
    /// Sets `input_pixels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void input_pixels(MemorySegment segment, long index, MemorySegment value) { VH_input_pixels.set(segment, 0L, index, value); }
    /// Sets `input_pixels` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_pixels(MemorySegment value) { input_pixels(this.segment(), 0L, value); return this; }

    /// {@return `input_w` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int input_w(MemorySegment segment, long index) { return (int) VH_input_w.get(segment, 0L, index); }
    /// {@return `input_w`}
    public int input_w() { return input_w(this.segment(), 0L); }
    /// Sets `input_w` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void input_w(MemorySegment segment, long index, int value) { VH_input_w.set(segment, 0L, index, value); }
    /// Sets `input_w` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_w(int value) { input_w(this.segment(), 0L, value); return this; }

    /// {@return `input_h` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int input_h(MemorySegment segment, long index) { return (int) VH_input_h.get(segment, 0L, index); }
    /// {@return `input_h`}
    public int input_h() { return input_h(this.segment(), 0L); }
    /// Sets `input_h` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void input_h(MemorySegment segment, long index, int value) { VH_input_h.set(segment, 0L, index, value); }
    /// Sets `input_h` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_h(int value) { input_h(this.segment(), 0L, value); return this; }

    /// {@return `input_s0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static double input_s0(MemorySegment segment, long index) { return (double) VH_input_s0.get(segment, 0L, index); }
    /// {@return `input_s0`}
    public double input_s0() { return input_s0(this.segment(), 0L); }
    /// Sets `input_s0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void input_s0(MemorySegment segment, long index, double value) { VH_input_s0.set(segment, 0L, index, value); }
    /// Sets `input_s0` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_s0(double value) { input_s0(this.segment(), 0L, value); return this; }

    /// {@return `input_t0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static double input_t0(MemorySegment segment, long index) { return (double) VH_input_t0.get(segment, 0L, index); }
    /// {@return `input_t0`}
    public double input_t0() { return input_t0(this.segment(), 0L); }
    /// Sets `input_t0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void input_t0(MemorySegment segment, long index, double value) { VH_input_t0.set(segment, 0L, index, value); }
    /// Sets `input_t0` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_t0(double value) { input_t0(this.segment(), 0L, value); return this; }

    /// {@return `input_s1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static double input_s1(MemorySegment segment, long index) { return (double) VH_input_s1.get(segment, 0L, index); }
    /// {@return `input_s1`}
    public double input_s1() { return input_s1(this.segment(), 0L); }
    /// Sets `input_s1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void input_s1(MemorySegment segment, long index, double value) { VH_input_s1.set(segment, 0L, index, value); }
    /// Sets `input_s1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_s1(double value) { input_s1(this.segment(), 0L, value); return this; }

    /// {@return `input_t1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static double input_t1(MemorySegment segment, long index) { return (double) VH_input_t1.get(segment, 0L, index); }
    /// {@return `input_t1`}
    public double input_t1() { return input_t1(this.segment(), 0L); }
    /// Sets `input_t1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void input_t1(MemorySegment segment, long index, double value) { VH_input_t1.set(segment, 0L, index, value); }
    /// Sets `input_t1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_t1(double value) { input_t1(this.segment(), 0L, value); return this; }

    /// {@return `input_cb` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment input_cb(MemorySegment segment, long index) { return (MemorySegment) VH_input_cb.get(segment, 0L, index); }
    /// {@return `input_cb`}
    public MemorySegment input_cb() { return input_cb(this.segment(), 0L); }
    /// Sets `input_cb` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void input_cb(MemorySegment segment, long index, MemorySegment value) { VH_input_cb.set(segment, 0L, index, value); }
    /// Sets `input_cb` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_cb(MemorySegment value) { input_cb(this.segment(), 0L, value); return this; }

    /// {@return `output_pixels` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment output_pixels(MemorySegment segment, long index) { return (MemorySegment) VH_output_pixels.get(segment, 0L, index); }
    /// {@return `output_pixels`}
    public MemorySegment output_pixels() { return output_pixels(this.segment(), 0L); }
    /// Sets `output_pixels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void output_pixels(MemorySegment segment, long index, MemorySegment value) { VH_output_pixels.set(segment, 0L, index, value); }
    /// Sets `output_pixels` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_pixels(MemorySegment value) { output_pixels(this.segment(), 0L, value); return this; }

    /// {@return `output_w` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int output_w(MemorySegment segment, long index) { return (int) VH_output_w.get(segment, 0L, index); }
    /// {@return `output_w`}
    public int output_w() { return output_w(this.segment(), 0L); }
    /// Sets `output_w` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void output_w(MemorySegment segment, long index, int value) { VH_output_w.set(segment, 0L, index, value); }
    /// Sets `output_w` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_w(int value) { output_w(this.segment(), 0L, value); return this; }

    /// {@return `output_h` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int output_h(MemorySegment segment, long index) { return (int) VH_output_h.get(segment, 0L, index); }
    /// {@return `output_h`}
    public int output_h() { return output_h(this.segment(), 0L); }
    /// Sets `output_h` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void output_h(MemorySegment segment, long index, int value) { VH_output_h.set(segment, 0L, index, value); }
    /// Sets `output_h` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_h(int value) { output_h(this.segment(), 0L, value); return this; }

    /// {@return `output_subx` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int output_subx(MemorySegment segment, long index) { return (int) VH_output_subx.get(segment, 0L, index); }
    /// {@return `output_subx`}
    public int output_subx() { return output_subx(this.segment(), 0L); }
    /// Sets `output_subx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void output_subx(MemorySegment segment, long index, int value) { VH_output_subx.set(segment, 0L, index, value); }
    /// Sets `output_subx` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_subx(int value) { output_subx(this.segment(), 0L, value); return this; }

    /// {@return `output_suby` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int output_suby(MemorySegment segment, long index) { return (int) VH_output_suby.get(segment, 0L, index); }
    /// {@return `output_suby`}
    public int output_suby() { return output_suby(this.segment(), 0L); }
    /// Sets `output_suby` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void output_suby(MemorySegment segment, long index, int value) { VH_output_suby.set(segment, 0L, index, value); }
    /// Sets `output_suby` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_suby(int value) { output_suby(this.segment(), 0L, value); return this; }

    /// {@return `output_subw` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int output_subw(MemorySegment segment, long index) { return (int) VH_output_subw.get(segment, 0L, index); }
    /// {@return `output_subw`}
    public int output_subw() { return output_subw(this.segment(), 0L); }
    /// Sets `output_subw` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void output_subw(MemorySegment segment, long index, int value) { VH_output_subw.set(segment, 0L, index, value); }
    /// Sets `output_subw` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_subw(int value) { output_subw(this.segment(), 0L, value); return this; }

    /// {@return `output_subh` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int output_subh(MemorySegment segment, long index) { return (int) VH_output_subh.get(segment, 0L, index); }
    /// {@return `output_subh`}
    public int output_subh() { return output_subh(this.segment(), 0L); }
    /// Sets `output_subh` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void output_subh(MemorySegment segment, long index, int value) { VH_output_subh.set(segment, 0L, index, value); }
    /// Sets `output_subh` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_subh(int value) { output_subh(this.segment(), 0L, value); return this; }

    /// {@return `output_cb` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment output_cb(MemorySegment segment, long index) { return (MemorySegment) VH_output_cb.get(segment, 0L, index); }
    /// {@return `output_cb`}
    public MemorySegment output_cb() { return output_cb(this.segment(), 0L); }
    /// Sets `output_cb` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void output_cb(MemorySegment segment, long index, MemorySegment value) { VH_output_cb.set(segment, 0L, index, value); }
    /// Sets `output_cb` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_cb(MemorySegment value) { output_cb(this.segment(), 0L, value); return this; }

    /// {@return `input_stride_in_bytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int input_stride_in_bytes(MemorySegment segment, long index) { return (int) VH_input_stride_in_bytes.get(segment, 0L, index); }
    /// {@return `input_stride_in_bytes`}
    public int input_stride_in_bytes() { return input_stride_in_bytes(this.segment(), 0L); }
    /// Sets `input_stride_in_bytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void input_stride_in_bytes(MemorySegment segment, long index, int value) { VH_input_stride_in_bytes.set(segment, 0L, index, value); }
    /// Sets `input_stride_in_bytes` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_stride_in_bytes(int value) { input_stride_in_bytes(this.segment(), 0L, value); return this; }

    /// {@return `output_stride_in_bytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int output_stride_in_bytes(MemorySegment segment, long index) { return (int) VH_output_stride_in_bytes.get(segment, 0L, index); }
    /// {@return `output_stride_in_bytes`}
    public int output_stride_in_bytes() { return output_stride_in_bytes(this.segment(), 0L); }
    /// Sets `output_stride_in_bytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void output_stride_in_bytes(MemorySegment segment, long index, int value) { VH_output_stride_in_bytes.set(segment, 0L, index, value); }
    /// Sets `output_stride_in_bytes` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_stride_in_bytes(int value) { output_stride_in_bytes(this.segment(), 0L, value); return this; }

    /// {@return `splits` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int splits(MemorySegment segment, long index) { return (int) VH_splits.get(segment, 0L, index); }
    /// {@return `splits`}
    public int splits() { return splits(this.segment(), 0L); }
    /// Sets `splits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void splits(MemorySegment segment, long index, int value) { VH_splits.set(segment, 0L, index, value); }
    /// Sets `splits` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE splits(int value) { splits(this.segment(), 0L, value); return this; }

    /// {@return `fast_alpha` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fast_alpha(MemorySegment segment, long index) { return (int) VH_fast_alpha.get(segment, 0L, index); }
    /// {@return `fast_alpha`}
    public int fast_alpha() { return fast_alpha(this.segment(), 0L); }
    /// Sets `fast_alpha` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fast_alpha(MemorySegment segment, long index, int value) { VH_fast_alpha.set(segment, 0L, index, value); }
    /// Sets `fast_alpha` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE fast_alpha(int value) { fast_alpha(this.segment(), 0L, value); return this; }

    /// {@return `needs_rebuild` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int needs_rebuild(MemorySegment segment, long index) { return (int) VH_needs_rebuild.get(segment, 0L, index); }
    /// {@return `needs_rebuild`}
    public int needs_rebuild() { return needs_rebuild(this.segment(), 0L); }
    /// Sets `needs_rebuild` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void needs_rebuild(MemorySegment segment, long index, int value) { VH_needs_rebuild.set(segment, 0L, index, value); }
    /// Sets `needs_rebuild` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE needs_rebuild(int value) { needs_rebuild(this.segment(), 0L, value); return this; }

    /// {@return `called_alloc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int called_alloc(MemorySegment segment, long index) { return (int) VH_called_alloc.get(segment, 0L, index); }
    /// {@return `called_alloc`}
    public int called_alloc() { return called_alloc(this.segment(), 0L); }
    /// Sets `called_alloc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void called_alloc(MemorySegment segment, long index, int value) { VH_called_alloc.set(segment, 0L, index, value); }
    /// Sets `called_alloc` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE called_alloc(int value) { called_alloc(this.segment(), 0L, value); return this; }

    /// {@return `input_pixel_layout_public` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int input_pixel_layout_public(MemorySegment segment, long index) { return (int) VH_input_pixel_layout_public.get(segment, 0L, index); }
    /// {@return `input_pixel_layout_public`}
    public int input_pixel_layout_public() { return input_pixel_layout_public(this.segment(), 0L); }
    /// Sets `input_pixel_layout_public` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void input_pixel_layout_public(MemorySegment segment, long index, int value) { VH_input_pixel_layout_public.set(segment, 0L, index, value); }
    /// Sets `input_pixel_layout_public` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_pixel_layout_public(int value) { input_pixel_layout_public(this.segment(), 0L, value); return this; }

    /// {@return `output_pixel_layout_public` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int output_pixel_layout_public(MemorySegment segment, long index) { return (int) VH_output_pixel_layout_public.get(segment, 0L, index); }
    /// {@return `output_pixel_layout_public`}
    public int output_pixel_layout_public() { return output_pixel_layout_public(this.segment(), 0L); }
    /// Sets `output_pixel_layout_public` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void output_pixel_layout_public(MemorySegment segment, long index, int value) { VH_output_pixel_layout_public.set(segment, 0L, index, value); }
    /// Sets `output_pixel_layout_public` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_pixel_layout_public(int value) { output_pixel_layout_public(this.segment(), 0L, value); return this; }

    /// {@return `input_data_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int input_data_type(MemorySegment segment, long index) { return (int) VH_input_data_type.get(segment, 0L, index); }
    /// {@return `input_data_type`}
    public int input_data_type() { return input_data_type(this.segment(), 0L); }
    /// Sets `input_data_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void input_data_type(MemorySegment segment, long index, int value) { VH_input_data_type.set(segment, 0L, index, value); }
    /// Sets `input_data_type` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_data_type(int value) { input_data_type(this.segment(), 0L, value); return this; }

    /// {@return `output_data_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int output_data_type(MemorySegment segment, long index) { return (int) VH_output_data_type.get(segment, 0L, index); }
    /// {@return `output_data_type`}
    public int output_data_type() { return output_data_type(this.segment(), 0L); }
    /// Sets `output_data_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void output_data_type(MemorySegment segment, long index, int value) { VH_output_data_type.set(segment, 0L, index, value); }
    /// Sets `output_data_type` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_data_type(int value) { output_data_type(this.segment(), 0L, value); return this; }

    /// {@return `horizontal_filter` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int horizontal_filter(MemorySegment segment, long index) { return (int) VH_horizontal_filter.get(segment, 0L, index); }
    /// {@return `horizontal_filter`}
    public int horizontal_filter() { return horizontal_filter(this.segment(), 0L); }
    /// Sets `horizontal_filter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void horizontal_filter(MemorySegment segment, long index, int value) { VH_horizontal_filter.set(segment, 0L, index, value); }
    /// Sets `horizontal_filter` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_filter(int value) { horizontal_filter(this.segment(), 0L, value); return this; }

    /// {@return `vertical_filter` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vertical_filter(MemorySegment segment, long index) { return (int) VH_vertical_filter.get(segment, 0L, index); }
    /// {@return `vertical_filter`}
    public int vertical_filter() { return vertical_filter(this.segment(), 0L); }
    /// Sets `vertical_filter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertical_filter(MemorySegment segment, long index, int value) { VH_vertical_filter.set(segment, 0L, index, value); }
    /// Sets `vertical_filter` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_filter(int value) { vertical_filter(this.segment(), 0L, value); return this; }

    /// {@return `horizontal_edge` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int horizontal_edge(MemorySegment segment, long index) { return (int) VH_horizontal_edge.get(segment, 0L, index); }
    /// {@return `horizontal_edge`}
    public int horizontal_edge() { return horizontal_edge(this.segment(), 0L); }
    /// Sets `horizontal_edge` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void horizontal_edge(MemorySegment segment, long index, int value) { VH_horizontal_edge.set(segment, 0L, index, value); }
    /// Sets `horizontal_edge` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_edge(int value) { horizontal_edge(this.segment(), 0L, value); return this; }

    /// {@return `vertical_edge` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vertical_edge(MemorySegment segment, long index) { return (int) VH_vertical_edge.get(segment, 0L, index); }
    /// {@return `vertical_edge`}
    public int vertical_edge() { return vertical_edge(this.segment(), 0L); }
    /// Sets `vertical_edge` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertical_edge(MemorySegment segment, long index, int value) { VH_vertical_edge.set(segment, 0L, index, value); }
    /// Sets `vertical_edge` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_edge(int value) { vertical_edge(this.segment(), 0L, value); return this; }

    /// {@return `horizontal_filter_kernel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment horizontal_filter_kernel(MemorySegment segment, long index) { return (MemorySegment) VH_horizontal_filter_kernel.get(segment, 0L, index); }
    /// {@return `horizontal_filter_kernel`}
    public MemorySegment horizontal_filter_kernel() { return horizontal_filter_kernel(this.segment(), 0L); }
    /// Sets `horizontal_filter_kernel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void horizontal_filter_kernel(MemorySegment segment, long index, MemorySegment value) { VH_horizontal_filter_kernel.set(segment, 0L, index, value); }
    /// Sets `horizontal_filter_kernel` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_filter_kernel(MemorySegment value) { horizontal_filter_kernel(this.segment(), 0L, value); return this; }

    /// {@return `horizontal_filter_support` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment horizontal_filter_support(MemorySegment segment, long index) { return (MemorySegment) VH_horizontal_filter_support.get(segment, 0L, index); }
    /// {@return `horizontal_filter_support`}
    public MemorySegment horizontal_filter_support() { return horizontal_filter_support(this.segment(), 0L); }
    /// Sets `horizontal_filter_support` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void horizontal_filter_support(MemorySegment segment, long index, MemorySegment value) { VH_horizontal_filter_support.set(segment, 0L, index, value); }
    /// Sets `horizontal_filter_support` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_filter_support(MemorySegment value) { horizontal_filter_support(this.segment(), 0L, value); return this; }

    /// {@return `vertical_filter_kernel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vertical_filter_kernel(MemorySegment segment, long index) { return (MemorySegment) VH_vertical_filter_kernel.get(segment, 0L, index); }
    /// {@return `vertical_filter_kernel`}
    public MemorySegment vertical_filter_kernel() { return vertical_filter_kernel(this.segment(), 0L); }
    /// Sets `vertical_filter_kernel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertical_filter_kernel(MemorySegment segment, long index, MemorySegment value) { VH_vertical_filter_kernel.set(segment, 0L, index, value); }
    /// Sets `vertical_filter_kernel` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_filter_kernel(MemorySegment value) { vertical_filter_kernel(this.segment(), 0L, value); return this; }

    /// {@return `vertical_filter_support` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment vertical_filter_support(MemorySegment segment, long index) { return (MemorySegment) VH_vertical_filter_support.get(segment, 0L, index); }
    /// {@return `vertical_filter_support`}
    public MemorySegment vertical_filter_support() { return vertical_filter_support(this.segment(), 0L); }
    /// Sets `vertical_filter_support` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertical_filter_support(MemorySegment segment, long index, MemorySegment value) { VH_vertical_filter_support.set(segment, 0L, index, value); }
    /// Sets `vertical_filter_support` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_filter_support(MemorySegment value) { vertical_filter_support(this.segment(), 0L, value); return this; }

    /// {@return `samplers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment samplers(MemorySegment segment, long index) { return (MemorySegment) VH_samplers.get(segment, 0L, index); }
    /// {@return `samplers`}
    public MemorySegment samplers() { return samplers(this.segment(), 0L); }
    /// Sets `samplers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void samplers(MemorySegment segment, long index, MemorySegment value) { VH_samplers.set(segment, 0L, index, value); }
    /// Sets `samplers` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE samplers(MemorySegment value) { samplers(this.segment(), 0L, value); return this; }

    /// Creates a slice of `STBIR_RESIZE`.
    /// @param index the index of the struct buffer
    /// @return the slice of `STBIR_RESIZE`
    public STBIR_RESIZE asSlice(long index) { return new STBIR_RESIZE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `STBIR_RESIZE`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `STBIR_RESIZE`
    public STBIR_RESIZE asSlice(long index, long count) { return new STBIR_RESIZE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `STBIR_RESIZE` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public STBIR_RESIZE at(long index, Consumer<STBIR_RESIZE> func) { func.accept(asSlice(index)); return this; }

    /// {@return `user_data` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment user_dataAt(long index) { return user_data(this.segment(), index); }
    /// Sets `user_data` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE user_dataAt(long index, MemorySegment value) { user_data(this.segment(), index, value); return this; }

    /// {@return `input_pixels` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment input_pixelsAt(long index) { return input_pixels(this.segment(), index); }
    /// Sets `input_pixels` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_pixelsAt(long index, MemorySegment value) { input_pixels(this.segment(), index, value); return this; }

    /// {@return `input_w` at the given index}
    /// @param index the index of the struct buffer
    public int input_wAt(long index) { return input_w(this.segment(), index); }
    /// Sets `input_w` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_wAt(long index, int value) { input_w(this.segment(), index, value); return this; }

    /// {@return `input_h` at the given index}
    /// @param index the index of the struct buffer
    public int input_hAt(long index) { return input_h(this.segment(), index); }
    /// Sets `input_h` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_hAt(long index, int value) { input_h(this.segment(), index, value); return this; }

    /// {@return `input_s0` at the given index}
    /// @param index the index of the struct buffer
    public double input_s0At(long index) { return input_s0(this.segment(), index); }
    /// Sets `input_s0` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_s0At(long index, double value) { input_s0(this.segment(), index, value); return this; }

    /// {@return `input_t0` at the given index}
    /// @param index the index of the struct buffer
    public double input_t0At(long index) { return input_t0(this.segment(), index); }
    /// Sets `input_t0` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_t0At(long index, double value) { input_t0(this.segment(), index, value); return this; }

    /// {@return `input_s1` at the given index}
    /// @param index the index of the struct buffer
    public double input_s1At(long index) { return input_s1(this.segment(), index); }
    /// Sets `input_s1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_s1At(long index, double value) { input_s1(this.segment(), index, value); return this; }

    /// {@return `input_t1` at the given index}
    /// @param index the index of the struct buffer
    public double input_t1At(long index) { return input_t1(this.segment(), index); }
    /// Sets `input_t1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_t1At(long index, double value) { input_t1(this.segment(), index, value); return this; }

    /// {@return `input_cb` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment input_cbAt(long index) { return input_cb(this.segment(), index); }
    /// Sets `input_cb` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_cbAt(long index, MemorySegment value) { input_cb(this.segment(), index, value); return this; }

    /// {@return `output_pixels` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment output_pixelsAt(long index) { return output_pixels(this.segment(), index); }
    /// Sets `output_pixels` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_pixelsAt(long index, MemorySegment value) { output_pixels(this.segment(), index, value); return this; }

    /// {@return `output_w` at the given index}
    /// @param index the index of the struct buffer
    public int output_wAt(long index) { return output_w(this.segment(), index); }
    /// Sets `output_w` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_wAt(long index, int value) { output_w(this.segment(), index, value); return this; }

    /// {@return `output_h` at the given index}
    /// @param index the index of the struct buffer
    public int output_hAt(long index) { return output_h(this.segment(), index); }
    /// Sets `output_h` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_hAt(long index, int value) { output_h(this.segment(), index, value); return this; }

    /// {@return `output_subx` at the given index}
    /// @param index the index of the struct buffer
    public int output_subxAt(long index) { return output_subx(this.segment(), index); }
    /// Sets `output_subx` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_subxAt(long index, int value) { output_subx(this.segment(), index, value); return this; }

    /// {@return `output_suby` at the given index}
    /// @param index the index of the struct buffer
    public int output_subyAt(long index) { return output_suby(this.segment(), index); }
    /// Sets `output_suby` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_subyAt(long index, int value) { output_suby(this.segment(), index, value); return this; }

    /// {@return `output_subw` at the given index}
    /// @param index the index of the struct buffer
    public int output_subwAt(long index) { return output_subw(this.segment(), index); }
    /// Sets `output_subw` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_subwAt(long index, int value) { output_subw(this.segment(), index, value); return this; }

    /// {@return `output_subh` at the given index}
    /// @param index the index of the struct buffer
    public int output_subhAt(long index) { return output_subh(this.segment(), index); }
    /// Sets `output_subh` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_subhAt(long index, int value) { output_subh(this.segment(), index, value); return this; }

    /// {@return `output_cb` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment output_cbAt(long index) { return output_cb(this.segment(), index); }
    /// Sets `output_cb` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_cbAt(long index, MemorySegment value) { output_cb(this.segment(), index, value); return this; }

    /// {@return `input_stride_in_bytes` at the given index}
    /// @param index the index of the struct buffer
    public int input_stride_in_bytesAt(long index) { return input_stride_in_bytes(this.segment(), index); }
    /// Sets `input_stride_in_bytes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_stride_in_bytesAt(long index, int value) { input_stride_in_bytes(this.segment(), index, value); return this; }

    /// {@return `output_stride_in_bytes` at the given index}
    /// @param index the index of the struct buffer
    public int output_stride_in_bytesAt(long index) { return output_stride_in_bytes(this.segment(), index); }
    /// Sets `output_stride_in_bytes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_stride_in_bytesAt(long index, int value) { output_stride_in_bytes(this.segment(), index, value); return this; }

    /// {@return `splits` at the given index}
    /// @param index the index of the struct buffer
    public int splitsAt(long index) { return splits(this.segment(), index); }
    /// Sets `splits` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE splitsAt(long index, int value) { splits(this.segment(), index, value); return this; }

    /// {@return `fast_alpha` at the given index}
    /// @param index the index of the struct buffer
    public int fast_alphaAt(long index) { return fast_alpha(this.segment(), index); }
    /// Sets `fast_alpha` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE fast_alphaAt(long index, int value) { fast_alpha(this.segment(), index, value); return this; }

    /// {@return `needs_rebuild` at the given index}
    /// @param index the index of the struct buffer
    public int needs_rebuildAt(long index) { return needs_rebuild(this.segment(), index); }
    /// Sets `needs_rebuild` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE needs_rebuildAt(long index, int value) { needs_rebuild(this.segment(), index, value); return this; }

    /// {@return `called_alloc` at the given index}
    /// @param index the index of the struct buffer
    public int called_allocAt(long index) { return called_alloc(this.segment(), index); }
    /// Sets `called_alloc` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE called_allocAt(long index, int value) { called_alloc(this.segment(), index, value); return this; }

    /// {@return `input_pixel_layout_public` at the given index}
    /// @param index the index of the struct buffer
    public int input_pixel_layout_publicAt(long index) { return input_pixel_layout_public(this.segment(), index); }
    /// Sets `input_pixel_layout_public` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_pixel_layout_publicAt(long index, int value) { input_pixel_layout_public(this.segment(), index, value); return this; }

    /// {@return `output_pixel_layout_public` at the given index}
    /// @param index the index of the struct buffer
    public int output_pixel_layout_publicAt(long index) { return output_pixel_layout_public(this.segment(), index); }
    /// Sets `output_pixel_layout_public` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_pixel_layout_publicAt(long index, int value) { output_pixel_layout_public(this.segment(), index, value); return this; }

    /// {@return `input_data_type` at the given index}
    /// @param index the index of the struct buffer
    public int input_data_typeAt(long index) { return input_data_type(this.segment(), index); }
    /// Sets `input_data_type` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_data_typeAt(long index, int value) { input_data_type(this.segment(), index, value); return this; }

    /// {@return `output_data_type` at the given index}
    /// @param index the index of the struct buffer
    public int output_data_typeAt(long index) { return output_data_type(this.segment(), index); }
    /// Sets `output_data_type` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_data_typeAt(long index, int value) { output_data_type(this.segment(), index, value); return this; }

    /// {@return `horizontal_filter` at the given index}
    /// @param index the index of the struct buffer
    public int horizontal_filterAt(long index) { return horizontal_filter(this.segment(), index); }
    /// Sets `horizontal_filter` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_filterAt(long index, int value) { horizontal_filter(this.segment(), index, value); return this; }

    /// {@return `vertical_filter` at the given index}
    /// @param index the index of the struct buffer
    public int vertical_filterAt(long index) { return vertical_filter(this.segment(), index); }
    /// Sets `vertical_filter` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_filterAt(long index, int value) { vertical_filter(this.segment(), index, value); return this; }

    /// {@return `horizontal_edge` at the given index}
    /// @param index the index of the struct buffer
    public int horizontal_edgeAt(long index) { return horizontal_edge(this.segment(), index); }
    /// Sets `horizontal_edge` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_edgeAt(long index, int value) { horizontal_edge(this.segment(), index, value); return this; }

    /// {@return `vertical_edge` at the given index}
    /// @param index the index of the struct buffer
    public int vertical_edgeAt(long index) { return vertical_edge(this.segment(), index); }
    /// Sets `vertical_edge` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_edgeAt(long index, int value) { vertical_edge(this.segment(), index, value); return this; }

    /// {@return `horizontal_filter_kernel` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment horizontal_filter_kernelAt(long index) { return horizontal_filter_kernel(this.segment(), index); }
    /// Sets `horizontal_filter_kernel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_filter_kernelAt(long index, MemorySegment value) { horizontal_filter_kernel(this.segment(), index, value); return this; }

    /// {@return `horizontal_filter_support` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment horizontal_filter_supportAt(long index) { return horizontal_filter_support(this.segment(), index); }
    /// Sets `horizontal_filter_support` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_filter_supportAt(long index, MemorySegment value) { horizontal_filter_support(this.segment(), index, value); return this; }

    /// {@return `vertical_filter_kernel` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vertical_filter_kernelAt(long index) { return vertical_filter_kernel(this.segment(), index); }
    /// Sets `vertical_filter_kernel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_filter_kernelAt(long index, MemorySegment value) { vertical_filter_kernel(this.segment(), index, value); return this; }

    /// {@return `vertical_filter_support` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment vertical_filter_supportAt(long index) { return vertical_filter_support(this.segment(), index); }
    /// Sets `vertical_filter_support` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_filter_supportAt(long index, MemorySegment value) { vertical_filter_support(this.segment(), index, value); return this; }

    /// {@return `samplers` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment samplersAt(long index) { return samplers(this.segment(), index); }
    /// Sets `samplers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE samplersAt(long index, MemorySegment value) { samplers(this.segment(), index, value); return this; }

}
