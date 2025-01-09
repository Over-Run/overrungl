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
package overrungl.stb;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### user_data
/// [VarHandle][#VH_user_data] - [Getter][#user_data()] - [Setter][#user_data(java.lang.foreign.MemorySegment)]
/// ### input_pixels
/// [VarHandle][#VH_input_pixels] - [Getter][#input_pixels()] - [Setter][#input_pixels(java.lang.foreign.MemorySegment)]
/// ### input_w
/// [VarHandle][#VH_input_w] - [Getter][#input_w()] - [Setter][#input_w(int)]
/// ### input_h
/// [VarHandle][#VH_input_h] - [Getter][#input_h()] - [Setter][#input_h(int)]
/// ### input_s0
/// [VarHandle][#VH_input_s0] - [Getter][#input_s0()] - [Setter][#input_s0(double)]
/// ### input_t0
/// [VarHandle][#VH_input_t0] - [Getter][#input_t0()] - [Setter][#input_t0(double)]
/// ### input_s1
/// [VarHandle][#VH_input_s1] - [Getter][#input_s1()] - [Setter][#input_s1(double)]
/// ### input_t1
/// [VarHandle][#VH_input_t1] - [Getter][#input_t1()] - [Setter][#input_t1(double)]
/// ### input_cb
/// [VarHandle][#VH_input_cb] - [Getter][#input_cb()] - [Setter][#input_cb(java.lang.foreign.MemorySegment)]
/// ### output_pixels
/// [VarHandle][#VH_output_pixels] - [Getter][#output_pixels()] - [Setter][#output_pixels(java.lang.foreign.MemorySegment)]
/// ### output_w
/// [VarHandle][#VH_output_w] - [Getter][#output_w()] - [Setter][#output_w(int)]
/// ### output_h
/// [VarHandle][#VH_output_h] - [Getter][#output_h()] - [Setter][#output_h(int)]
/// ### output_subx
/// [VarHandle][#VH_output_subx] - [Getter][#output_subx()] - [Setter][#output_subx(int)]
/// ### output_suby
/// [VarHandle][#VH_output_suby] - [Getter][#output_suby()] - [Setter][#output_suby(int)]
/// ### output_subw
/// [VarHandle][#VH_output_subw] - [Getter][#output_subw()] - [Setter][#output_subw(int)]
/// ### output_subh
/// [VarHandle][#VH_output_subh] - [Getter][#output_subh()] - [Setter][#output_subh(int)]
/// ### output_cb
/// [VarHandle][#VH_output_cb] - [Getter][#output_cb()] - [Setter][#output_cb(java.lang.foreign.MemorySegment)]
/// ### input_stride_in_bytes
/// [VarHandle][#VH_input_stride_in_bytes] - [Getter][#input_stride_in_bytes()] - [Setter][#input_stride_in_bytes(int)]
/// ### output_stride_in_bytes
/// [VarHandle][#VH_output_stride_in_bytes] - [Getter][#output_stride_in_bytes()] - [Setter][#output_stride_in_bytes(int)]
/// ### splits
/// [VarHandle][#VH_splits] - [Getter][#splits()] - [Setter][#splits(int)]
/// ### fast_alpha
/// [VarHandle][#VH_fast_alpha] - [Getter][#fast_alpha()] - [Setter][#fast_alpha(int)]
/// ### needs_rebuild
/// [VarHandle][#VH_needs_rebuild] - [Getter][#needs_rebuild()] - [Setter][#needs_rebuild(int)]
/// ### called_alloc
/// [VarHandle][#VH_called_alloc] - [Getter][#called_alloc()] - [Setter][#called_alloc(int)]
/// ### input_pixel_layout_public
/// [VarHandle][#VH_input_pixel_layout_public] - [Getter][#input_pixel_layout_public()] - [Setter][#input_pixel_layout_public(int)]
/// ### output_pixel_layout_public
/// [VarHandle][#VH_output_pixel_layout_public] - [Getter][#output_pixel_layout_public()] - [Setter][#output_pixel_layout_public(int)]
/// ### input_data_type
/// [VarHandle][#VH_input_data_type] - [Getter][#input_data_type()] - [Setter][#input_data_type(int)]
/// ### output_data_type
/// [VarHandle][#VH_output_data_type] - [Getter][#output_data_type()] - [Setter][#output_data_type(int)]
/// ### horizontal_filter
/// [VarHandle][#VH_horizontal_filter] - [Getter][#horizontal_filter()] - [Setter][#horizontal_filter(int)]
/// ### vertical_filter
/// [VarHandle][#VH_vertical_filter] - [Getter][#vertical_filter()] - [Setter][#vertical_filter(int)]
/// ### horizontal_edge
/// [VarHandle][#VH_horizontal_edge] - [Getter][#horizontal_edge()] - [Setter][#horizontal_edge(int)]
/// ### vertical_edge
/// [VarHandle][#VH_vertical_edge] - [Getter][#vertical_edge()] - [Setter][#vertical_edge(int)]
/// ### horizontal_filter_kernel
/// [VarHandle][#VH_horizontal_filter_kernel] - [Getter][#horizontal_filter_kernel()] - [Setter][#horizontal_filter_kernel(java.lang.foreign.MemorySegment)]
/// ### horizontal_filter_support
/// [VarHandle][#VH_horizontal_filter_support] - [Getter][#horizontal_filter_support()] - [Setter][#horizontal_filter_support(java.lang.foreign.MemorySegment)]
/// ### vertical_filter_kernel
/// [VarHandle][#VH_vertical_filter_kernel] - [Getter][#vertical_filter_kernel()] - [Setter][#vertical_filter_kernel(java.lang.foreign.MemorySegment)]
/// ### vertical_filter_support
/// [VarHandle][#VH_vertical_filter_support] - [Getter][#vertical_filter_support()] - [Setter][#vertical_filter_support(java.lang.foreign.MemorySegment)]
/// ### samplers
/// [VarHandle][#VH_samplers] - [Getter][#samplers()] - [Setter][#samplers(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct STBIR_RESIZE {
///     void* user_data;
///     void const * input_pixels;
///     int input_w;
///     int input_h;
///     double input_s0;
///     double input_t0;
///     double input_s1;
///     double input_t1;
///     stbir_input_callback * input_cb;
///     void* output_pixels;
///     int output_w;
///     int output_h;
///     int output_subx;
///     int output_suby;
///     int output_subw;
///     int output_subh;
///     stbir_output_callback * output_cb;
///     int input_stride_in_bytes;
///     int output_stride_in_bytes;
///     int splits;
///     int fast_alpha;
///     int needs_rebuild;
///     int called_alloc;
///     stbir_pixel_layout input_pixel_layout_public;
///     stbir_pixel_layout output_pixel_layout_public;
///     stbir_datatype input_data_type;
///     stbir_datatype output_data_type;
///     stbir_filter horizontal_filter;
///     stbir_filter vertical_filter;
///     stbir_edge horizontal_edge;
///     stbir_edge vertical_edge;
///     stbir__kernel_callback * horizontal_filter_kernel;
///     stbir__support_callback * horizontal_filter_support;
///     stbir__kernel_callback * vertical_filter_kernel;
///     stbir__support_callback * vertical_filter_support;
///     stbir__info * samplers;
/// } STBIR_RESIZE;
/// ```
public final class STBIR_RESIZE extends Struct {
    /// The struct layout of `STBIR_RESIZE`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
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
    /// The [VarHandle] of `user_data` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_user_data = LAYOUT.arrayElementVarHandle(PathElement.groupElement("user_data"));
    /// The [VarHandle] of `input_pixels` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_input_pixels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input_pixels"));
    /// The [VarHandle] of `input_w` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_input_w = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input_w"));
    /// The [VarHandle] of `input_h` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_input_h = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input_h"));
    /// The [VarHandle] of `input_s0` of type `(MemorySegment base, long baseOffset, long index)double`.
    public static final VarHandle VH_input_s0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input_s0"));
    /// The [VarHandle] of `input_t0` of type `(MemorySegment base, long baseOffset, long index)double`.
    public static final VarHandle VH_input_t0 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input_t0"));
    /// The [VarHandle] of `input_s1` of type `(MemorySegment base, long baseOffset, long index)double`.
    public static final VarHandle VH_input_s1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input_s1"));
    /// The [VarHandle] of `input_t1` of type `(MemorySegment base, long baseOffset, long index)double`.
    public static final VarHandle VH_input_t1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input_t1"));
    /// The [VarHandle] of `input_cb` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_input_cb = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input_cb"));
    /// The [VarHandle] of `output_pixels` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_output_pixels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("output_pixels"));
    /// The [VarHandle] of `output_w` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_output_w = LAYOUT.arrayElementVarHandle(PathElement.groupElement("output_w"));
    /// The [VarHandle] of `output_h` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_output_h = LAYOUT.arrayElementVarHandle(PathElement.groupElement("output_h"));
    /// The [VarHandle] of `output_subx` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_output_subx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("output_subx"));
    /// The [VarHandle] of `output_suby` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_output_suby = LAYOUT.arrayElementVarHandle(PathElement.groupElement("output_suby"));
    /// The [VarHandle] of `output_subw` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_output_subw = LAYOUT.arrayElementVarHandle(PathElement.groupElement("output_subw"));
    /// The [VarHandle] of `output_subh` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_output_subh = LAYOUT.arrayElementVarHandle(PathElement.groupElement("output_subh"));
    /// The [VarHandle] of `output_cb` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_output_cb = LAYOUT.arrayElementVarHandle(PathElement.groupElement("output_cb"));
    /// The [VarHandle] of `input_stride_in_bytes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_input_stride_in_bytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input_stride_in_bytes"));
    /// The [VarHandle] of `output_stride_in_bytes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_output_stride_in_bytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("output_stride_in_bytes"));
    /// The [VarHandle] of `splits` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_splits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("splits"));
    /// The [VarHandle] of `fast_alpha` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fast_alpha = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fast_alpha"));
    /// The [VarHandle] of `needs_rebuild` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_needs_rebuild = LAYOUT.arrayElementVarHandle(PathElement.groupElement("needs_rebuild"));
    /// The [VarHandle] of `called_alloc` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_called_alloc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("called_alloc"));
    /// The [VarHandle] of `input_pixel_layout_public` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_input_pixel_layout_public = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input_pixel_layout_public"));
    /// The [VarHandle] of `output_pixel_layout_public` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_output_pixel_layout_public = LAYOUT.arrayElementVarHandle(PathElement.groupElement("output_pixel_layout_public"));
    /// The [VarHandle] of `input_data_type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_input_data_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("input_data_type"));
    /// The [VarHandle] of `output_data_type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_output_data_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("output_data_type"));
    /// The [VarHandle] of `horizontal_filter` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_horizontal_filter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("horizontal_filter"));
    /// The [VarHandle] of `vertical_filter` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vertical_filter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertical_filter"));
    /// The [VarHandle] of `horizontal_edge` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_horizontal_edge = LAYOUT.arrayElementVarHandle(PathElement.groupElement("horizontal_edge"));
    /// The [VarHandle] of `vertical_edge` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vertical_edge = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertical_edge"));
    /// The [VarHandle] of `horizontal_filter_kernel` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_horizontal_filter_kernel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("horizontal_filter_kernel"));
    /// The [VarHandle] of `horizontal_filter_support` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_horizontal_filter_support = LAYOUT.arrayElementVarHandle(PathElement.groupElement("horizontal_filter_support"));
    /// The [VarHandle] of `vertical_filter_kernel` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_vertical_filter_kernel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertical_filter_kernel"));
    /// The [VarHandle] of `vertical_filter_support` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_vertical_filter_support = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertical_filter_support"));
    /// The [VarHandle] of `samplers` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_samplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplers"));

    /// Creates `STBIR_RESIZE` with the given segment.
    /// @param segment the memory segment
    public STBIR_RESIZE(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `STBIR_RESIZE` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBIR_RESIZE of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBIR_RESIZE(segment); }

    /// Creates `STBIR_RESIZE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBIR_RESIZE ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBIR_RESIZE(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `STBIR_RESIZE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBIR_RESIZE ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new STBIR_RESIZE(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE alloc(SegmentAllocator allocator) { return new STBIR_RESIZE(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE alloc(SegmentAllocator allocator, long count) { return new STBIR_RESIZE(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `STBIR_RESIZE`.
    /// @param index the index of the struct buffer
    /// @return the slice of `STBIR_RESIZE`
    public STBIR_RESIZE asSlice(long index) { return new STBIR_RESIZE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `STBIR_RESIZE`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `STBIR_RESIZE`
    public STBIR_RESIZE asSlice(long index, long count) { return new STBIR_RESIZE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `user_data` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void*") java.lang.foreign.MemorySegment get_user_data(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_user_data.get(segment, 0L, index); }
    /// {@return `user_data`}
    /// @param segment the segment of the struct
    public static @CType("void*") java.lang.foreign.MemorySegment get_user_data(MemorySegment segment) { return STBIR_RESIZE.get_user_data(segment, 0L); }
    /// {@return `user_data` at the given index}
    /// @param index the index
    public @CType("void*") java.lang.foreign.MemorySegment user_dataAt(long index) { return STBIR_RESIZE.get_user_data(this.segment(), index); }
    /// {@return `user_data`}
    public @CType("void*") java.lang.foreign.MemorySegment user_data() { return STBIR_RESIZE.get_user_data(this.segment()); }
    /// Sets `user_data` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_user_data(MemorySegment segment, long index, @CType("void*") java.lang.foreign.MemorySegment value) { VH_user_data.set(segment, 0L, index, value); }
    /// Sets `user_data` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_user_data(MemorySegment segment, @CType("void*") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_user_data(segment, 0L, value); }
    /// Sets `user_data` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE user_dataAt(long index, @CType("void*") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_user_data(this.segment(), index, value); return this; }
    /// Sets `user_data` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE user_data(@CType("void*") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_user_data(this.segment(), value); return this; }

    /// {@return `input_pixels` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void const *") java.lang.foreign.MemorySegment get_input_pixels(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_input_pixels.get(segment, 0L, index); }
    /// {@return `input_pixels`}
    /// @param segment the segment of the struct
    public static @CType("void const *") java.lang.foreign.MemorySegment get_input_pixels(MemorySegment segment) { return STBIR_RESIZE.get_input_pixels(segment, 0L); }
    /// {@return `input_pixels` at the given index}
    /// @param index the index
    public @CType("void const *") java.lang.foreign.MemorySegment input_pixelsAt(long index) { return STBIR_RESIZE.get_input_pixels(this.segment(), index); }
    /// {@return `input_pixels`}
    public @CType("void const *") java.lang.foreign.MemorySegment input_pixels() { return STBIR_RESIZE.get_input_pixels(this.segment()); }
    /// Sets `input_pixels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_input_pixels(MemorySegment segment, long index, @CType("void const *") java.lang.foreign.MemorySegment value) { VH_input_pixels.set(segment, 0L, index, value); }
    /// Sets `input_pixels` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_input_pixels(MemorySegment segment, @CType("void const *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_input_pixels(segment, 0L, value); }
    /// Sets `input_pixels` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_pixelsAt(long index, @CType("void const *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_input_pixels(this.segment(), index, value); return this; }
    /// Sets `input_pixels` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_pixels(@CType("void const *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_input_pixels(this.segment(), value); return this; }

    /// {@return `input_w` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_input_w(MemorySegment segment, long index) { return (int) VH_input_w.get(segment, 0L, index); }
    /// {@return `input_w`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_input_w(MemorySegment segment) { return STBIR_RESIZE.get_input_w(segment, 0L); }
    /// {@return `input_w` at the given index}
    /// @param index the index
    public @CType("int") int input_wAt(long index) { return STBIR_RESIZE.get_input_w(this.segment(), index); }
    /// {@return `input_w`}
    public @CType("int") int input_w() { return STBIR_RESIZE.get_input_w(this.segment()); }
    /// Sets `input_w` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_input_w(MemorySegment segment, long index, @CType("int") int value) { VH_input_w.set(segment, 0L, index, value); }
    /// Sets `input_w` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_input_w(MemorySegment segment, @CType("int") int value) { STBIR_RESIZE.set_input_w(segment, 0L, value); }
    /// Sets `input_w` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_wAt(long index, @CType("int") int value) { STBIR_RESIZE.set_input_w(this.segment(), index, value); return this; }
    /// Sets `input_w` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_w(@CType("int") int value) { STBIR_RESIZE.set_input_w(this.segment(), value); return this; }

    /// {@return `input_h` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_input_h(MemorySegment segment, long index) { return (int) VH_input_h.get(segment, 0L, index); }
    /// {@return `input_h`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_input_h(MemorySegment segment) { return STBIR_RESIZE.get_input_h(segment, 0L); }
    /// {@return `input_h` at the given index}
    /// @param index the index
    public @CType("int") int input_hAt(long index) { return STBIR_RESIZE.get_input_h(this.segment(), index); }
    /// {@return `input_h`}
    public @CType("int") int input_h() { return STBIR_RESIZE.get_input_h(this.segment()); }
    /// Sets `input_h` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_input_h(MemorySegment segment, long index, @CType("int") int value) { VH_input_h.set(segment, 0L, index, value); }
    /// Sets `input_h` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_input_h(MemorySegment segment, @CType("int") int value) { STBIR_RESIZE.set_input_h(segment, 0L, value); }
    /// Sets `input_h` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_hAt(long index, @CType("int") int value) { STBIR_RESIZE.set_input_h(this.segment(), index, value); return this; }
    /// Sets `input_h` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_h(@CType("int") int value) { STBIR_RESIZE.set_input_h(this.segment(), value); return this; }

    /// {@return `input_s0` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("double") double get_input_s0(MemorySegment segment, long index) { return (double) VH_input_s0.get(segment, 0L, index); }
    /// {@return `input_s0`}
    /// @param segment the segment of the struct
    public static @CType("double") double get_input_s0(MemorySegment segment) { return STBIR_RESIZE.get_input_s0(segment, 0L); }
    /// {@return `input_s0` at the given index}
    /// @param index the index
    public @CType("double") double input_s0At(long index) { return STBIR_RESIZE.get_input_s0(this.segment(), index); }
    /// {@return `input_s0`}
    public @CType("double") double input_s0() { return STBIR_RESIZE.get_input_s0(this.segment()); }
    /// Sets `input_s0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_input_s0(MemorySegment segment, long index, @CType("double") double value) { VH_input_s0.set(segment, 0L, index, value); }
    /// Sets `input_s0` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_input_s0(MemorySegment segment, @CType("double") double value) { STBIR_RESIZE.set_input_s0(segment, 0L, value); }
    /// Sets `input_s0` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_s0At(long index, @CType("double") double value) { STBIR_RESIZE.set_input_s0(this.segment(), index, value); return this; }
    /// Sets `input_s0` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_s0(@CType("double") double value) { STBIR_RESIZE.set_input_s0(this.segment(), value); return this; }

    /// {@return `input_t0` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("double") double get_input_t0(MemorySegment segment, long index) { return (double) VH_input_t0.get(segment, 0L, index); }
    /// {@return `input_t0`}
    /// @param segment the segment of the struct
    public static @CType("double") double get_input_t0(MemorySegment segment) { return STBIR_RESIZE.get_input_t0(segment, 0L); }
    /// {@return `input_t0` at the given index}
    /// @param index the index
    public @CType("double") double input_t0At(long index) { return STBIR_RESIZE.get_input_t0(this.segment(), index); }
    /// {@return `input_t0`}
    public @CType("double") double input_t0() { return STBIR_RESIZE.get_input_t0(this.segment()); }
    /// Sets `input_t0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_input_t0(MemorySegment segment, long index, @CType("double") double value) { VH_input_t0.set(segment, 0L, index, value); }
    /// Sets `input_t0` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_input_t0(MemorySegment segment, @CType("double") double value) { STBIR_RESIZE.set_input_t0(segment, 0L, value); }
    /// Sets `input_t0` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_t0At(long index, @CType("double") double value) { STBIR_RESIZE.set_input_t0(this.segment(), index, value); return this; }
    /// Sets `input_t0` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_t0(@CType("double") double value) { STBIR_RESIZE.set_input_t0(this.segment(), value); return this; }

    /// {@return `input_s1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("double") double get_input_s1(MemorySegment segment, long index) { return (double) VH_input_s1.get(segment, 0L, index); }
    /// {@return `input_s1`}
    /// @param segment the segment of the struct
    public static @CType("double") double get_input_s1(MemorySegment segment) { return STBIR_RESIZE.get_input_s1(segment, 0L); }
    /// {@return `input_s1` at the given index}
    /// @param index the index
    public @CType("double") double input_s1At(long index) { return STBIR_RESIZE.get_input_s1(this.segment(), index); }
    /// {@return `input_s1`}
    public @CType("double") double input_s1() { return STBIR_RESIZE.get_input_s1(this.segment()); }
    /// Sets `input_s1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_input_s1(MemorySegment segment, long index, @CType("double") double value) { VH_input_s1.set(segment, 0L, index, value); }
    /// Sets `input_s1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_input_s1(MemorySegment segment, @CType("double") double value) { STBIR_RESIZE.set_input_s1(segment, 0L, value); }
    /// Sets `input_s1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_s1At(long index, @CType("double") double value) { STBIR_RESIZE.set_input_s1(this.segment(), index, value); return this; }
    /// Sets `input_s1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_s1(@CType("double") double value) { STBIR_RESIZE.set_input_s1(this.segment(), value); return this; }

    /// {@return `input_t1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("double") double get_input_t1(MemorySegment segment, long index) { return (double) VH_input_t1.get(segment, 0L, index); }
    /// {@return `input_t1`}
    /// @param segment the segment of the struct
    public static @CType("double") double get_input_t1(MemorySegment segment) { return STBIR_RESIZE.get_input_t1(segment, 0L); }
    /// {@return `input_t1` at the given index}
    /// @param index the index
    public @CType("double") double input_t1At(long index) { return STBIR_RESIZE.get_input_t1(this.segment(), index); }
    /// {@return `input_t1`}
    public @CType("double") double input_t1() { return STBIR_RESIZE.get_input_t1(this.segment()); }
    /// Sets `input_t1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_input_t1(MemorySegment segment, long index, @CType("double") double value) { VH_input_t1.set(segment, 0L, index, value); }
    /// Sets `input_t1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_input_t1(MemorySegment segment, @CType("double") double value) { STBIR_RESIZE.set_input_t1(segment, 0L, value); }
    /// Sets `input_t1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_t1At(long index, @CType("double") double value) { STBIR_RESIZE.set_input_t1(this.segment(), index, value); return this; }
    /// Sets `input_t1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_t1(@CType("double") double value) { STBIR_RESIZE.set_input_t1(this.segment(), value); return this; }

    /// {@return `input_cb` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbir_input_callback *") java.lang.foreign.MemorySegment get_input_cb(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_input_cb.get(segment, 0L, index); }
    /// {@return `input_cb`}
    /// @param segment the segment of the struct
    public static @CType("stbir_input_callback *") java.lang.foreign.MemorySegment get_input_cb(MemorySegment segment) { return STBIR_RESIZE.get_input_cb(segment, 0L); }
    /// {@return `input_cb` at the given index}
    /// @param index the index
    public @CType("stbir_input_callback *") java.lang.foreign.MemorySegment input_cbAt(long index) { return STBIR_RESIZE.get_input_cb(this.segment(), index); }
    /// {@return `input_cb`}
    public @CType("stbir_input_callback *") java.lang.foreign.MemorySegment input_cb() { return STBIR_RESIZE.get_input_cb(this.segment()); }
    /// Sets `input_cb` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_input_cb(MemorySegment segment, long index, @CType("stbir_input_callback *") java.lang.foreign.MemorySegment value) { VH_input_cb.set(segment, 0L, index, value); }
    /// Sets `input_cb` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_input_cb(MemorySegment segment, @CType("stbir_input_callback *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_input_cb(segment, 0L, value); }
    /// Sets `input_cb` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_cbAt(long index, @CType("stbir_input_callback *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_input_cb(this.segment(), index, value); return this; }
    /// Sets `input_cb` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_cb(@CType("stbir_input_callback *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_input_cb(this.segment(), value); return this; }

    /// {@return `output_pixels` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void*") java.lang.foreign.MemorySegment get_output_pixels(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_output_pixels.get(segment, 0L, index); }
    /// {@return `output_pixels`}
    /// @param segment the segment of the struct
    public static @CType("void*") java.lang.foreign.MemorySegment get_output_pixels(MemorySegment segment) { return STBIR_RESIZE.get_output_pixels(segment, 0L); }
    /// {@return `output_pixels` at the given index}
    /// @param index the index
    public @CType("void*") java.lang.foreign.MemorySegment output_pixelsAt(long index) { return STBIR_RESIZE.get_output_pixels(this.segment(), index); }
    /// {@return `output_pixels`}
    public @CType("void*") java.lang.foreign.MemorySegment output_pixels() { return STBIR_RESIZE.get_output_pixels(this.segment()); }
    /// Sets `output_pixels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_output_pixels(MemorySegment segment, long index, @CType("void*") java.lang.foreign.MemorySegment value) { VH_output_pixels.set(segment, 0L, index, value); }
    /// Sets `output_pixels` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_output_pixels(MemorySegment segment, @CType("void*") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_output_pixels(segment, 0L, value); }
    /// Sets `output_pixels` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_pixelsAt(long index, @CType("void*") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_output_pixels(this.segment(), index, value); return this; }
    /// Sets `output_pixels` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_pixels(@CType("void*") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_output_pixels(this.segment(), value); return this; }

    /// {@return `output_w` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_output_w(MemorySegment segment, long index) { return (int) VH_output_w.get(segment, 0L, index); }
    /// {@return `output_w`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_output_w(MemorySegment segment) { return STBIR_RESIZE.get_output_w(segment, 0L); }
    /// {@return `output_w` at the given index}
    /// @param index the index
    public @CType("int") int output_wAt(long index) { return STBIR_RESIZE.get_output_w(this.segment(), index); }
    /// {@return `output_w`}
    public @CType("int") int output_w() { return STBIR_RESIZE.get_output_w(this.segment()); }
    /// Sets `output_w` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_output_w(MemorySegment segment, long index, @CType("int") int value) { VH_output_w.set(segment, 0L, index, value); }
    /// Sets `output_w` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_output_w(MemorySegment segment, @CType("int") int value) { STBIR_RESIZE.set_output_w(segment, 0L, value); }
    /// Sets `output_w` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_wAt(long index, @CType("int") int value) { STBIR_RESIZE.set_output_w(this.segment(), index, value); return this; }
    /// Sets `output_w` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_w(@CType("int") int value) { STBIR_RESIZE.set_output_w(this.segment(), value); return this; }

    /// {@return `output_h` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_output_h(MemorySegment segment, long index) { return (int) VH_output_h.get(segment, 0L, index); }
    /// {@return `output_h`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_output_h(MemorySegment segment) { return STBIR_RESIZE.get_output_h(segment, 0L); }
    /// {@return `output_h` at the given index}
    /// @param index the index
    public @CType("int") int output_hAt(long index) { return STBIR_RESIZE.get_output_h(this.segment(), index); }
    /// {@return `output_h`}
    public @CType("int") int output_h() { return STBIR_RESIZE.get_output_h(this.segment()); }
    /// Sets `output_h` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_output_h(MemorySegment segment, long index, @CType("int") int value) { VH_output_h.set(segment, 0L, index, value); }
    /// Sets `output_h` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_output_h(MemorySegment segment, @CType("int") int value) { STBIR_RESIZE.set_output_h(segment, 0L, value); }
    /// Sets `output_h` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_hAt(long index, @CType("int") int value) { STBIR_RESIZE.set_output_h(this.segment(), index, value); return this; }
    /// Sets `output_h` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_h(@CType("int") int value) { STBIR_RESIZE.set_output_h(this.segment(), value); return this; }

    /// {@return `output_subx` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_output_subx(MemorySegment segment, long index) { return (int) VH_output_subx.get(segment, 0L, index); }
    /// {@return `output_subx`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_output_subx(MemorySegment segment) { return STBIR_RESIZE.get_output_subx(segment, 0L); }
    /// {@return `output_subx` at the given index}
    /// @param index the index
    public @CType("int") int output_subxAt(long index) { return STBIR_RESIZE.get_output_subx(this.segment(), index); }
    /// {@return `output_subx`}
    public @CType("int") int output_subx() { return STBIR_RESIZE.get_output_subx(this.segment()); }
    /// Sets `output_subx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_output_subx(MemorySegment segment, long index, @CType("int") int value) { VH_output_subx.set(segment, 0L, index, value); }
    /// Sets `output_subx` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_output_subx(MemorySegment segment, @CType("int") int value) { STBIR_RESIZE.set_output_subx(segment, 0L, value); }
    /// Sets `output_subx` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_subxAt(long index, @CType("int") int value) { STBIR_RESIZE.set_output_subx(this.segment(), index, value); return this; }
    /// Sets `output_subx` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_subx(@CType("int") int value) { STBIR_RESIZE.set_output_subx(this.segment(), value); return this; }

    /// {@return `output_suby` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_output_suby(MemorySegment segment, long index) { return (int) VH_output_suby.get(segment, 0L, index); }
    /// {@return `output_suby`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_output_suby(MemorySegment segment) { return STBIR_RESIZE.get_output_suby(segment, 0L); }
    /// {@return `output_suby` at the given index}
    /// @param index the index
    public @CType("int") int output_subyAt(long index) { return STBIR_RESIZE.get_output_suby(this.segment(), index); }
    /// {@return `output_suby`}
    public @CType("int") int output_suby() { return STBIR_RESIZE.get_output_suby(this.segment()); }
    /// Sets `output_suby` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_output_suby(MemorySegment segment, long index, @CType("int") int value) { VH_output_suby.set(segment, 0L, index, value); }
    /// Sets `output_suby` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_output_suby(MemorySegment segment, @CType("int") int value) { STBIR_RESIZE.set_output_suby(segment, 0L, value); }
    /// Sets `output_suby` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_subyAt(long index, @CType("int") int value) { STBIR_RESIZE.set_output_suby(this.segment(), index, value); return this; }
    /// Sets `output_suby` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_suby(@CType("int") int value) { STBIR_RESIZE.set_output_suby(this.segment(), value); return this; }

    /// {@return `output_subw` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_output_subw(MemorySegment segment, long index) { return (int) VH_output_subw.get(segment, 0L, index); }
    /// {@return `output_subw`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_output_subw(MemorySegment segment) { return STBIR_RESIZE.get_output_subw(segment, 0L); }
    /// {@return `output_subw` at the given index}
    /// @param index the index
    public @CType("int") int output_subwAt(long index) { return STBIR_RESIZE.get_output_subw(this.segment(), index); }
    /// {@return `output_subw`}
    public @CType("int") int output_subw() { return STBIR_RESIZE.get_output_subw(this.segment()); }
    /// Sets `output_subw` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_output_subw(MemorySegment segment, long index, @CType("int") int value) { VH_output_subw.set(segment, 0L, index, value); }
    /// Sets `output_subw` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_output_subw(MemorySegment segment, @CType("int") int value) { STBIR_RESIZE.set_output_subw(segment, 0L, value); }
    /// Sets `output_subw` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_subwAt(long index, @CType("int") int value) { STBIR_RESIZE.set_output_subw(this.segment(), index, value); return this; }
    /// Sets `output_subw` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_subw(@CType("int") int value) { STBIR_RESIZE.set_output_subw(this.segment(), value); return this; }

    /// {@return `output_subh` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_output_subh(MemorySegment segment, long index) { return (int) VH_output_subh.get(segment, 0L, index); }
    /// {@return `output_subh`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_output_subh(MemorySegment segment) { return STBIR_RESIZE.get_output_subh(segment, 0L); }
    /// {@return `output_subh` at the given index}
    /// @param index the index
    public @CType("int") int output_subhAt(long index) { return STBIR_RESIZE.get_output_subh(this.segment(), index); }
    /// {@return `output_subh`}
    public @CType("int") int output_subh() { return STBIR_RESIZE.get_output_subh(this.segment()); }
    /// Sets `output_subh` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_output_subh(MemorySegment segment, long index, @CType("int") int value) { VH_output_subh.set(segment, 0L, index, value); }
    /// Sets `output_subh` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_output_subh(MemorySegment segment, @CType("int") int value) { STBIR_RESIZE.set_output_subh(segment, 0L, value); }
    /// Sets `output_subh` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_subhAt(long index, @CType("int") int value) { STBIR_RESIZE.set_output_subh(this.segment(), index, value); return this; }
    /// Sets `output_subh` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_subh(@CType("int") int value) { STBIR_RESIZE.set_output_subh(this.segment(), value); return this; }

    /// {@return `output_cb` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbir_output_callback *") java.lang.foreign.MemorySegment get_output_cb(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_output_cb.get(segment, 0L, index); }
    /// {@return `output_cb`}
    /// @param segment the segment of the struct
    public static @CType("stbir_output_callback *") java.lang.foreign.MemorySegment get_output_cb(MemorySegment segment) { return STBIR_RESIZE.get_output_cb(segment, 0L); }
    /// {@return `output_cb` at the given index}
    /// @param index the index
    public @CType("stbir_output_callback *") java.lang.foreign.MemorySegment output_cbAt(long index) { return STBIR_RESIZE.get_output_cb(this.segment(), index); }
    /// {@return `output_cb`}
    public @CType("stbir_output_callback *") java.lang.foreign.MemorySegment output_cb() { return STBIR_RESIZE.get_output_cb(this.segment()); }
    /// Sets `output_cb` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_output_cb(MemorySegment segment, long index, @CType("stbir_output_callback *") java.lang.foreign.MemorySegment value) { VH_output_cb.set(segment, 0L, index, value); }
    /// Sets `output_cb` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_output_cb(MemorySegment segment, @CType("stbir_output_callback *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_output_cb(segment, 0L, value); }
    /// Sets `output_cb` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_cbAt(long index, @CType("stbir_output_callback *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_output_cb(this.segment(), index, value); return this; }
    /// Sets `output_cb` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_cb(@CType("stbir_output_callback *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_output_cb(this.segment(), value); return this; }

    /// {@return `input_stride_in_bytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_input_stride_in_bytes(MemorySegment segment, long index) { return (int) VH_input_stride_in_bytes.get(segment, 0L, index); }
    /// {@return `input_stride_in_bytes`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_input_stride_in_bytes(MemorySegment segment) { return STBIR_RESIZE.get_input_stride_in_bytes(segment, 0L); }
    /// {@return `input_stride_in_bytes` at the given index}
    /// @param index the index
    public @CType("int") int input_stride_in_bytesAt(long index) { return STBIR_RESIZE.get_input_stride_in_bytes(this.segment(), index); }
    /// {@return `input_stride_in_bytes`}
    public @CType("int") int input_stride_in_bytes() { return STBIR_RESIZE.get_input_stride_in_bytes(this.segment()); }
    /// Sets `input_stride_in_bytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_input_stride_in_bytes(MemorySegment segment, long index, @CType("int") int value) { VH_input_stride_in_bytes.set(segment, 0L, index, value); }
    /// Sets `input_stride_in_bytes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_input_stride_in_bytes(MemorySegment segment, @CType("int") int value) { STBIR_RESIZE.set_input_stride_in_bytes(segment, 0L, value); }
    /// Sets `input_stride_in_bytes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_stride_in_bytesAt(long index, @CType("int") int value) { STBIR_RESIZE.set_input_stride_in_bytes(this.segment(), index, value); return this; }
    /// Sets `input_stride_in_bytes` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_stride_in_bytes(@CType("int") int value) { STBIR_RESIZE.set_input_stride_in_bytes(this.segment(), value); return this; }

    /// {@return `output_stride_in_bytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_output_stride_in_bytes(MemorySegment segment, long index) { return (int) VH_output_stride_in_bytes.get(segment, 0L, index); }
    /// {@return `output_stride_in_bytes`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_output_stride_in_bytes(MemorySegment segment) { return STBIR_RESIZE.get_output_stride_in_bytes(segment, 0L); }
    /// {@return `output_stride_in_bytes` at the given index}
    /// @param index the index
    public @CType("int") int output_stride_in_bytesAt(long index) { return STBIR_RESIZE.get_output_stride_in_bytes(this.segment(), index); }
    /// {@return `output_stride_in_bytes`}
    public @CType("int") int output_stride_in_bytes() { return STBIR_RESIZE.get_output_stride_in_bytes(this.segment()); }
    /// Sets `output_stride_in_bytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_output_stride_in_bytes(MemorySegment segment, long index, @CType("int") int value) { VH_output_stride_in_bytes.set(segment, 0L, index, value); }
    /// Sets `output_stride_in_bytes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_output_stride_in_bytes(MemorySegment segment, @CType("int") int value) { STBIR_RESIZE.set_output_stride_in_bytes(segment, 0L, value); }
    /// Sets `output_stride_in_bytes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_stride_in_bytesAt(long index, @CType("int") int value) { STBIR_RESIZE.set_output_stride_in_bytes(this.segment(), index, value); return this; }
    /// Sets `output_stride_in_bytes` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_stride_in_bytes(@CType("int") int value) { STBIR_RESIZE.set_output_stride_in_bytes(this.segment(), value); return this; }

    /// {@return `splits` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_splits(MemorySegment segment, long index) { return (int) VH_splits.get(segment, 0L, index); }
    /// {@return `splits`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_splits(MemorySegment segment) { return STBIR_RESIZE.get_splits(segment, 0L); }
    /// {@return `splits` at the given index}
    /// @param index the index
    public @CType("int") int splitsAt(long index) { return STBIR_RESIZE.get_splits(this.segment(), index); }
    /// {@return `splits`}
    public @CType("int") int splits() { return STBIR_RESIZE.get_splits(this.segment()); }
    /// Sets `splits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_splits(MemorySegment segment, long index, @CType("int") int value) { VH_splits.set(segment, 0L, index, value); }
    /// Sets `splits` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_splits(MemorySegment segment, @CType("int") int value) { STBIR_RESIZE.set_splits(segment, 0L, value); }
    /// Sets `splits` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE splitsAt(long index, @CType("int") int value) { STBIR_RESIZE.set_splits(this.segment(), index, value); return this; }
    /// Sets `splits` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE splits(@CType("int") int value) { STBIR_RESIZE.set_splits(this.segment(), value); return this; }

    /// {@return `fast_alpha` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_fast_alpha(MemorySegment segment, long index) { return (int) VH_fast_alpha.get(segment, 0L, index); }
    /// {@return `fast_alpha`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_fast_alpha(MemorySegment segment) { return STBIR_RESIZE.get_fast_alpha(segment, 0L); }
    /// {@return `fast_alpha` at the given index}
    /// @param index the index
    public @CType("int") int fast_alphaAt(long index) { return STBIR_RESIZE.get_fast_alpha(this.segment(), index); }
    /// {@return `fast_alpha`}
    public @CType("int") int fast_alpha() { return STBIR_RESIZE.get_fast_alpha(this.segment()); }
    /// Sets `fast_alpha` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fast_alpha(MemorySegment segment, long index, @CType("int") int value) { VH_fast_alpha.set(segment, 0L, index, value); }
    /// Sets `fast_alpha` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fast_alpha(MemorySegment segment, @CType("int") int value) { STBIR_RESIZE.set_fast_alpha(segment, 0L, value); }
    /// Sets `fast_alpha` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE fast_alphaAt(long index, @CType("int") int value) { STBIR_RESIZE.set_fast_alpha(this.segment(), index, value); return this; }
    /// Sets `fast_alpha` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE fast_alpha(@CType("int") int value) { STBIR_RESIZE.set_fast_alpha(this.segment(), value); return this; }

    /// {@return `needs_rebuild` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_needs_rebuild(MemorySegment segment, long index) { return (int) VH_needs_rebuild.get(segment, 0L, index); }
    /// {@return `needs_rebuild`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_needs_rebuild(MemorySegment segment) { return STBIR_RESIZE.get_needs_rebuild(segment, 0L); }
    /// {@return `needs_rebuild` at the given index}
    /// @param index the index
    public @CType("int") int needs_rebuildAt(long index) { return STBIR_RESIZE.get_needs_rebuild(this.segment(), index); }
    /// {@return `needs_rebuild`}
    public @CType("int") int needs_rebuild() { return STBIR_RESIZE.get_needs_rebuild(this.segment()); }
    /// Sets `needs_rebuild` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_needs_rebuild(MemorySegment segment, long index, @CType("int") int value) { VH_needs_rebuild.set(segment, 0L, index, value); }
    /// Sets `needs_rebuild` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_needs_rebuild(MemorySegment segment, @CType("int") int value) { STBIR_RESIZE.set_needs_rebuild(segment, 0L, value); }
    /// Sets `needs_rebuild` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE needs_rebuildAt(long index, @CType("int") int value) { STBIR_RESIZE.set_needs_rebuild(this.segment(), index, value); return this; }
    /// Sets `needs_rebuild` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE needs_rebuild(@CType("int") int value) { STBIR_RESIZE.set_needs_rebuild(this.segment(), value); return this; }

    /// {@return `called_alloc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_called_alloc(MemorySegment segment, long index) { return (int) VH_called_alloc.get(segment, 0L, index); }
    /// {@return `called_alloc`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_called_alloc(MemorySegment segment) { return STBIR_RESIZE.get_called_alloc(segment, 0L); }
    /// {@return `called_alloc` at the given index}
    /// @param index the index
    public @CType("int") int called_allocAt(long index) { return STBIR_RESIZE.get_called_alloc(this.segment(), index); }
    /// {@return `called_alloc`}
    public @CType("int") int called_alloc() { return STBIR_RESIZE.get_called_alloc(this.segment()); }
    /// Sets `called_alloc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_called_alloc(MemorySegment segment, long index, @CType("int") int value) { VH_called_alloc.set(segment, 0L, index, value); }
    /// Sets `called_alloc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_called_alloc(MemorySegment segment, @CType("int") int value) { STBIR_RESIZE.set_called_alloc(segment, 0L, value); }
    /// Sets `called_alloc` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE called_allocAt(long index, @CType("int") int value) { STBIR_RESIZE.set_called_alloc(this.segment(), index, value); return this; }
    /// Sets `called_alloc` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE called_alloc(@CType("int") int value) { STBIR_RESIZE.set_called_alloc(this.segment(), value); return this; }

    /// {@return `input_pixel_layout_public` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbir_pixel_layout") int get_input_pixel_layout_public(MemorySegment segment, long index) { return (int) VH_input_pixel_layout_public.get(segment, 0L, index); }
    /// {@return `input_pixel_layout_public`}
    /// @param segment the segment of the struct
    public static @CType("stbir_pixel_layout") int get_input_pixel_layout_public(MemorySegment segment) { return STBIR_RESIZE.get_input_pixel_layout_public(segment, 0L); }
    /// {@return `input_pixel_layout_public` at the given index}
    /// @param index the index
    public @CType("stbir_pixel_layout") int input_pixel_layout_publicAt(long index) { return STBIR_RESIZE.get_input_pixel_layout_public(this.segment(), index); }
    /// {@return `input_pixel_layout_public`}
    public @CType("stbir_pixel_layout") int input_pixel_layout_public() { return STBIR_RESIZE.get_input_pixel_layout_public(this.segment()); }
    /// Sets `input_pixel_layout_public` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_input_pixel_layout_public(MemorySegment segment, long index, @CType("stbir_pixel_layout") int value) { VH_input_pixel_layout_public.set(segment, 0L, index, value); }
    /// Sets `input_pixel_layout_public` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_input_pixel_layout_public(MemorySegment segment, @CType("stbir_pixel_layout") int value) { STBIR_RESIZE.set_input_pixel_layout_public(segment, 0L, value); }
    /// Sets `input_pixel_layout_public` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_pixel_layout_publicAt(long index, @CType("stbir_pixel_layout") int value) { STBIR_RESIZE.set_input_pixel_layout_public(this.segment(), index, value); return this; }
    /// Sets `input_pixel_layout_public` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_pixel_layout_public(@CType("stbir_pixel_layout") int value) { STBIR_RESIZE.set_input_pixel_layout_public(this.segment(), value); return this; }

    /// {@return `output_pixel_layout_public` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbir_pixel_layout") int get_output_pixel_layout_public(MemorySegment segment, long index) { return (int) VH_output_pixel_layout_public.get(segment, 0L, index); }
    /// {@return `output_pixel_layout_public`}
    /// @param segment the segment of the struct
    public static @CType("stbir_pixel_layout") int get_output_pixel_layout_public(MemorySegment segment) { return STBIR_RESIZE.get_output_pixel_layout_public(segment, 0L); }
    /// {@return `output_pixel_layout_public` at the given index}
    /// @param index the index
    public @CType("stbir_pixel_layout") int output_pixel_layout_publicAt(long index) { return STBIR_RESIZE.get_output_pixel_layout_public(this.segment(), index); }
    /// {@return `output_pixel_layout_public`}
    public @CType("stbir_pixel_layout") int output_pixel_layout_public() { return STBIR_RESIZE.get_output_pixel_layout_public(this.segment()); }
    /// Sets `output_pixel_layout_public` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_output_pixel_layout_public(MemorySegment segment, long index, @CType("stbir_pixel_layout") int value) { VH_output_pixel_layout_public.set(segment, 0L, index, value); }
    /// Sets `output_pixel_layout_public` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_output_pixel_layout_public(MemorySegment segment, @CType("stbir_pixel_layout") int value) { STBIR_RESIZE.set_output_pixel_layout_public(segment, 0L, value); }
    /// Sets `output_pixel_layout_public` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_pixel_layout_publicAt(long index, @CType("stbir_pixel_layout") int value) { STBIR_RESIZE.set_output_pixel_layout_public(this.segment(), index, value); return this; }
    /// Sets `output_pixel_layout_public` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_pixel_layout_public(@CType("stbir_pixel_layout") int value) { STBIR_RESIZE.set_output_pixel_layout_public(this.segment(), value); return this; }

    /// {@return `input_data_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbir_datatype") int get_input_data_type(MemorySegment segment, long index) { return (int) VH_input_data_type.get(segment, 0L, index); }
    /// {@return `input_data_type`}
    /// @param segment the segment of the struct
    public static @CType("stbir_datatype") int get_input_data_type(MemorySegment segment) { return STBIR_RESIZE.get_input_data_type(segment, 0L); }
    /// {@return `input_data_type` at the given index}
    /// @param index the index
    public @CType("stbir_datatype") int input_data_typeAt(long index) { return STBIR_RESIZE.get_input_data_type(this.segment(), index); }
    /// {@return `input_data_type`}
    public @CType("stbir_datatype") int input_data_type() { return STBIR_RESIZE.get_input_data_type(this.segment()); }
    /// Sets `input_data_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_input_data_type(MemorySegment segment, long index, @CType("stbir_datatype") int value) { VH_input_data_type.set(segment, 0L, index, value); }
    /// Sets `input_data_type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_input_data_type(MemorySegment segment, @CType("stbir_datatype") int value) { STBIR_RESIZE.set_input_data_type(segment, 0L, value); }
    /// Sets `input_data_type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_data_typeAt(long index, @CType("stbir_datatype") int value) { STBIR_RESIZE.set_input_data_type(this.segment(), index, value); return this; }
    /// Sets `input_data_type` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_data_type(@CType("stbir_datatype") int value) { STBIR_RESIZE.set_input_data_type(this.segment(), value); return this; }

    /// {@return `output_data_type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbir_datatype") int get_output_data_type(MemorySegment segment, long index) { return (int) VH_output_data_type.get(segment, 0L, index); }
    /// {@return `output_data_type`}
    /// @param segment the segment of the struct
    public static @CType("stbir_datatype") int get_output_data_type(MemorySegment segment) { return STBIR_RESIZE.get_output_data_type(segment, 0L); }
    /// {@return `output_data_type` at the given index}
    /// @param index the index
    public @CType("stbir_datatype") int output_data_typeAt(long index) { return STBIR_RESIZE.get_output_data_type(this.segment(), index); }
    /// {@return `output_data_type`}
    public @CType("stbir_datatype") int output_data_type() { return STBIR_RESIZE.get_output_data_type(this.segment()); }
    /// Sets `output_data_type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_output_data_type(MemorySegment segment, long index, @CType("stbir_datatype") int value) { VH_output_data_type.set(segment, 0L, index, value); }
    /// Sets `output_data_type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_output_data_type(MemorySegment segment, @CType("stbir_datatype") int value) { STBIR_RESIZE.set_output_data_type(segment, 0L, value); }
    /// Sets `output_data_type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_data_typeAt(long index, @CType("stbir_datatype") int value) { STBIR_RESIZE.set_output_data_type(this.segment(), index, value); return this; }
    /// Sets `output_data_type` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_data_type(@CType("stbir_datatype") int value) { STBIR_RESIZE.set_output_data_type(this.segment(), value); return this; }

    /// {@return `horizontal_filter` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbir_filter") int get_horizontal_filter(MemorySegment segment, long index) { return (int) VH_horizontal_filter.get(segment, 0L, index); }
    /// {@return `horizontal_filter`}
    /// @param segment the segment of the struct
    public static @CType("stbir_filter") int get_horizontal_filter(MemorySegment segment) { return STBIR_RESIZE.get_horizontal_filter(segment, 0L); }
    /// {@return `horizontal_filter` at the given index}
    /// @param index the index
    public @CType("stbir_filter") int horizontal_filterAt(long index) { return STBIR_RESIZE.get_horizontal_filter(this.segment(), index); }
    /// {@return `horizontal_filter`}
    public @CType("stbir_filter") int horizontal_filter() { return STBIR_RESIZE.get_horizontal_filter(this.segment()); }
    /// Sets `horizontal_filter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_horizontal_filter(MemorySegment segment, long index, @CType("stbir_filter") int value) { VH_horizontal_filter.set(segment, 0L, index, value); }
    /// Sets `horizontal_filter` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_horizontal_filter(MemorySegment segment, @CType("stbir_filter") int value) { STBIR_RESIZE.set_horizontal_filter(segment, 0L, value); }
    /// Sets `horizontal_filter` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_filterAt(long index, @CType("stbir_filter") int value) { STBIR_RESIZE.set_horizontal_filter(this.segment(), index, value); return this; }
    /// Sets `horizontal_filter` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_filter(@CType("stbir_filter") int value) { STBIR_RESIZE.set_horizontal_filter(this.segment(), value); return this; }

    /// {@return `vertical_filter` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbir_filter") int get_vertical_filter(MemorySegment segment, long index) { return (int) VH_vertical_filter.get(segment, 0L, index); }
    /// {@return `vertical_filter`}
    /// @param segment the segment of the struct
    public static @CType("stbir_filter") int get_vertical_filter(MemorySegment segment) { return STBIR_RESIZE.get_vertical_filter(segment, 0L); }
    /// {@return `vertical_filter` at the given index}
    /// @param index the index
    public @CType("stbir_filter") int vertical_filterAt(long index) { return STBIR_RESIZE.get_vertical_filter(this.segment(), index); }
    /// {@return `vertical_filter`}
    public @CType("stbir_filter") int vertical_filter() { return STBIR_RESIZE.get_vertical_filter(this.segment()); }
    /// Sets `vertical_filter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertical_filter(MemorySegment segment, long index, @CType("stbir_filter") int value) { VH_vertical_filter.set(segment, 0L, index, value); }
    /// Sets `vertical_filter` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertical_filter(MemorySegment segment, @CType("stbir_filter") int value) { STBIR_RESIZE.set_vertical_filter(segment, 0L, value); }
    /// Sets `vertical_filter` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_filterAt(long index, @CType("stbir_filter") int value) { STBIR_RESIZE.set_vertical_filter(this.segment(), index, value); return this; }
    /// Sets `vertical_filter` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_filter(@CType("stbir_filter") int value) { STBIR_RESIZE.set_vertical_filter(this.segment(), value); return this; }

    /// {@return `horizontal_edge` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbir_edge") int get_horizontal_edge(MemorySegment segment, long index) { return (int) VH_horizontal_edge.get(segment, 0L, index); }
    /// {@return `horizontal_edge`}
    /// @param segment the segment of the struct
    public static @CType("stbir_edge") int get_horizontal_edge(MemorySegment segment) { return STBIR_RESIZE.get_horizontal_edge(segment, 0L); }
    /// {@return `horizontal_edge` at the given index}
    /// @param index the index
    public @CType("stbir_edge") int horizontal_edgeAt(long index) { return STBIR_RESIZE.get_horizontal_edge(this.segment(), index); }
    /// {@return `horizontal_edge`}
    public @CType("stbir_edge") int horizontal_edge() { return STBIR_RESIZE.get_horizontal_edge(this.segment()); }
    /// Sets `horizontal_edge` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_horizontal_edge(MemorySegment segment, long index, @CType("stbir_edge") int value) { VH_horizontal_edge.set(segment, 0L, index, value); }
    /// Sets `horizontal_edge` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_horizontal_edge(MemorySegment segment, @CType("stbir_edge") int value) { STBIR_RESIZE.set_horizontal_edge(segment, 0L, value); }
    /// Sets `horizontal_edge` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_edgeAt(long index, @CType("stbir_edge") int value) { STBIR_RESIZE.set_horizontal_edge(this.segment(), index, value); return this; }
    /// Sets `horizontal_edge` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_edge(@CType("stbir_edge") int value) { STBIR_RESIZE.set_horizontal_edge(this.segment(), value); return this; }

    /// {@return `vertical_edge` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbir_edge") int get_vertical_edge(MemorySegment segment, long index) { return (int) VH_vertical_edge.get(segment, 0L, index); }
    /// {@return `vertical_edge`}
    /// @param segment the segment of the struct
    public static @CType("stbir_edge") int get_vertical_edge(MemorySegment segment) { return STBIR_RESIZE.get_vertical_edge(segment, 0L); }
    /// {@return `vertical_edge` at the given index}
    /// @param index the index
    public @CType("stbir_edge") int vertical_edgeAt(long index) { return STBIR_RESIZE.get_vertical_edge(this.segment(), index); }
    /// {@return `vertical_edge`}
    public @CType("stbir_edge") int vertical_edge() { return STBIR_RESIZE.get_vertical_edge(this.segment()); }
    /// Sets `vertical_edge` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertical_edge(MemorySegment segment, long index, @CType("stbir_edge") int value) { VH_vertical_edge.set(segment, 0L, index, value); }
    /// Sets `vertical_edge` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertical_edge(MemorySegment segment, @CType("stbir_edge") int value) { STBIR_RESIZE.set_vertical_edge(segment, 0L, value); }
    /// Sets `vertical_edge` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_edgeAt(long index, @CType("stbir_edge") int value) { STBIR_RESIZE.set_vertical_edge(this.segment(), index, value); return this; }
    /// Sets `vertical_edge` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_edge(@CType("stbir_edge") int value) { STBIR_RESIZE.set_vertical_edge(this.segment(), value); return this; }

    /// {@return `horizontal_filter_kernel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment get_horizontal_filter_kernel(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_horizontal_filter_kernel.get(segment, 0L, index); }
    /// {@return `horizontal_filter_kernel`}
    /// @param segment the segment of the struct
    public static @CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment get_horizontal_filter_kernel(MemorySegment segment) { return STBIR_RESIZE.get_horizontal_filter_kernel(segment, 0L); }
    /// {@return `horizontal_filter_kernel` at the given index}
    /// @param index the index
    public @CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment horizontal_filter_kernelAt(long index) { return STBIR_RESIZE.get_horizontal_filter_kernel(this.segment(), index); }
    /// {@return `horizontal_filter_kernel`}
    public @CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment horizontal_filter_kernel() { return STBIR_RESIZE.get_horizontal_filter_kernel(this.segment()); }
    /// Sets `horizontal_filter_kernel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_horizontal_filter_kernel(MemorySegment segment, long index, @CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment value) { VH_horizontal_filter_kernel.set(segment, 0L, index, value); }
    /// Sets `horizontal_filter_kernel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_horizontal_filter_kernel(MemorySegment segment, @CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_horizontal_filter_kernel(segment, 0L, value); }
    /// Sets `horizontal_filter_kernel` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_filter_kernelAt(long index, @CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_horizontal_filter_kernel(this.segment(), index, value); return this; }
    /// Sets `horizontal_filter_kernel` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_filter_kernel(@CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_horizontal_filter_kernel(this.segment(), value); return this; }

    /// {@return `horizontal_filter_support` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbir__support_callback *") java.lang.foreign.MemorySegment get_horizontal_filter_support(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_horizontal_filter_support.get(segment, 0L, index); }
    /// {@return `horizontal_filter_support`}
    /// @param segment the segment of the struct
    public static @CType("stbir__support_callback *") java.lang.foreign.MemorySegment get_horizontal_filter_support(MemorySegment segment) { return STBIR_RESIZE.get_horizontal_filter_support(segment, 0L); }
    /// {@return `horizontal_filter_support` at the given index}
    /// @param index the index
    public @CType("stbir__support_callback *") java.lang.foreign.MemorySegment horizontal_filter_supportAt(long index) { return STBIR_RESIZE.get_horizontal_filter_support(this.segment(), index); }
    /// {@return `horizontal_filter_support`}
    public @CType("stbir__support_callback *") java.lang.foreign.MemorySegment horizontal_filter_support() { return STBIR_RESIZE.get_horizontal_filter_support(this.segment()); }
    /// Sets `horizontal_filter_support` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_horizontal_filter_support(MemorySegment segment, long index, @CType("stbir__support_callback *") java.lang.foreign.MemorySegment value) { VH_horizontal_filter_support.set(segment, 0L, index, value); }
    /// Sets `horizontal_filter_support` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_horizontal_filter_support(MemorySegment segment, @CType("stbir__support_callback *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_horizontal_filter_support(segment, 0L, value); }
    /// Sets `horizontal_filter_support` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_filter_supportAt(long index, @CType("stbir__support_callback *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_horizontal_filter_support(this.segment(), index, value); return this; }
    /// Sets `horizontal_filter_support` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_filter_support(@CType("stbir__support_callback *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_horizontal_filter_support(this.segment(), value); return this; }

    /// {@return `vertical_filter_kernel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment get_vertical_filter_kernel(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_vertical_filter_kernel.get(segment, 0L, index); }
    /// {@return `vertical_filter_kernel`}
    /// @param segment the segment of the struct
    public static @CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment get_vertical_filter_kernel(MemorySegment segment) { return STBIR_RESIZE.get_vertical_filter_kernel(segment, 0L); }
    /// {@return `vertical_filter_kernel` at the given index}
    /// @param index the index
    public @CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment vertical_filter_kernelAt(long index) { return STBIR_RESIZE.get_vertical_filter_kernel(this.segment(), index); }
    /// {@return `vertical_filter_kernel`}
    public @CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment vertical_filter_kernel() { return STBIR_RESIZE.get_vertical_filter_kernel(this.segment()); }
    /// Sets `vertical_filter_kernel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertical_filter_kernel(MemorySegment segment, long index, @CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment value) { VH_vertical_filter_kernel.set(segment, 0L, index, value); }
    /// Sets `vertical_filter_kernel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertical_filter_kernel(MemorySegment segment, @CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_vertical_filter_kernel(segment, 0L, value); }
    /// Sets `vertical_filter_kernel` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_filter_kernelAt(long index, @CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_vertical_filter_kernel(this.segment(), index, value); return this; }
    /// Sets `vertical_filter_kernel` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_filter_kernel(@CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_vertical_filter_kernel(this.segment(), value); return this; }

    /// {@return `vertical_filter_support` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbir__support_callback *") java.lang.foreign.MemorySegment get_vertical_filter_support(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_vertical_filter_support.get(segment, 0L, index); }
    /// {@return `vertical_filter_support`}
    /// @param segment the segment of the struct
    public static @CType("stbir__support_callback *") java.lang.foreign.MemorySegment get_vertical_filter_support(MemorySegment segment) { return STBIR_RESIZE.get_vertical_filter_support(segment, 0L); }
    /// {@return `vertical_filter_support` at the given index}
    /// @param index the index
    public @CType("stbir__support_callback *") java.lang.foreign.MemorySegment vertical_filter_supportAt(long index) { return STBIR_RESIZE.get_vertical_filter_support(this.segment(), index); }
    /// {@return `vertical_filter_support`}
    public @CType("stbir__support_callback *") java.lang.foreign.MemorySegment vertical_filter_support() { return STBIR_RESIZE.get_vertical_filter_support(this.segment()); }
    /// Sets `vertical_filter_support` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertical_filter_support(MemorySegment segment, long index, @CType("stbir__support_callback *") java.lang.foreign.MemorySegment value) { VH_vertical_filter_support.set(segment, 0L, index, value); }
    /// Sets `vertical_filter_support` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertical_filter_support(MemorySegment segment, @CType("stbir__support_callback *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_vertical_filter_support(segment, 0L, value); }
    /// Sets `vertical_filter_support` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_filter_supportAt(long index, @CType("stbir__support_callback *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_vertical_filter_support(this.segment(), index, value); return this; }
    /// Sets `vertical_filter_support` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_filter_support(@CType("stbir__support_callback *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_vertical_filter_support(this.segment(), value); return this; }

    /// {@return `samplers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("stbir__info *") java.lang.foreign.MemorySegment get_samplers(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_samplers.get(segment, 0L, index); }
    /// {@return `samplers`}
    /// @param segment the segment of the struct
    public static @CType("stbir__info *") java.lang.foreign.MemorySegment get_samplers(MemorySegment segment) { return STBIR_RESIZE.get_samplers(segment, 0L); }
    /// {@return `samplers` at the given index}
    /// @param index the index
    public @CType("stbir__info *") java.lang.foreign.MemorySegment samplersAt(long index) { return STBIR_RESIZE.get_samplers(this.segment(), index); }
    /// {@return `samplers`}
    public @CType("stbir__info *") java.lang.foreign.MemorySegment samplers() { return STBIR_RESIZE.get_samplers(this.segment()); }
    /// Sets `samplers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_samplers(MemorySegment segment, long index, @CType("stbir__info *") java.lang.foreign.MemorySegment value) { VH_samplers.set(segment, 0L, index, value); }
    /// Sets `samplers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_samplers(MemorySegment segment, @CType("stbir__info *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_samplers(segment, 0L, value); }
    /// Sets `samplers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE samplersAt(long index, @CType("stbir__info *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_samplers(this.segment(), index, value); return this; }
    /// Sets `samplers` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE samplers(@CType("stbir__info *") java.lang.foreign.MemorySegment value) { STBIR_RESIZE.set_samplers(this.segment(), value); return this; }

}
