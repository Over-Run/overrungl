/*
 * MIT License
 * 
 * Copyright (c) 2022-2024 Overrun Organization
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

    /// Allocates a `STBIR_RESIZE` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE alloc(SegmentAllocator allocator) { return new STBIR_RESIZE(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBIR_RESIZE` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBIR_RESIZE`
    public static STBIR_RESIZE alloc(SegmentAllocator allocator, long count) { return new STBIR_RESIZE(allocator.allocate(LAYOUT, count)); }

    /// {@return `user_data` at the given index}
    /// @param index the index
    public @CType("void*") java.lang.foreign.MemorySegment user_dataAt(long index) { return (java.lang.foreign.MemorySegment) VH_user_data.get(this.segment(), 0L, index); }
    /// {@return `user_data`}
    public @CType("void*") java.lang.foreign.MemorySegment user_data() { return this.user_dataAt(0L); }
    /// Sets `user_data` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE user_dataAt(long index, @CType("void*") java.lang.foreign.MemorySegment value) { VH_user_data.set(this.segment(), 0L, index, value); return this; }
    /// Sets `user_data` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE user_data(@CType("void*") java.lang.foreign.MemorySegment value) { return this.user_dataAt(0L, value); }

    /// {@return `input_pixels` at the given index}
    /// @param index the index
    public @CType("void const *") java.lang.foreign.MemorySegment input_pixelsAt(long index) { return (java.lang.foreign.MemorySegment) VH_input_pixels.get(this.segment(), 0L, index); }
    /// {@return `input_pixels`}
    public @CType("void const *") java.lang.foreign.MemorySegment input_pixels() { return this.input_pixelsAt(0L); }
    /// Sets `input_pixels` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_pixelsAt(long index, @CType("void const *") java.lang.foreign.MemorySegment value) { VH_input_pixels.set(this.segment(), 0L, index, value); return this; }
    /// Sets `input_pixels` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_pixels(@CType("void const *") java.lang.foreign.MemorySegment value) { return this.input_pixelsAt(0L, value); }

    /// {@return `input_w` at the given index}
    /// @param index the index
    public @CType("int") int input_wAt(long index) { return (int) VH_input_w.get(this.segment(), 0L, index); }
    /// {@return `input_w`}
    public @CType("int") int input_w() { return this.input_wAt(0L); }
    /// Sets `input_w` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_wAt(long index, @CType("int") int value) { VH_input_w.set(this.segment(), 0L, index, value); return this; }
    /// Sets `input_w` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_w(@CType("int") int value) { return this.input_wAt(0L, value); }

    /// {@return `input_h` at the given index}
    /// @param index the index
    public @CType("int") int input_hAt(long index) { return (int) VH_input_h.get(this.segment(), 0L, index); }
    /// {@return `input_h`}
    public @CType("int") int input_h() { return this.input_hAt(0L); }
    /// Sets `input_h` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_hAt(long index, @CType("int") int value) { VH_input_h.set(this.segment(), 0L, index, value); return this; }
    /// Sets `input_h` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_h(@CType("int") int value) { return this.input_hAt(0L, value); }

    /// {@return `input_s0` at the given index}
    /// @param index the index
    public @CType("double") double input_s0At(long index) { return (double) VH_input_s0.get(this.segment(), 0L, index); }
    /// {@return `input_s0`}
    public @CType("double") double input_s0() { return this.input_s0At(0L); }
    /// Sets `input_s0` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_s0At(long index, @CType("double") double value) { VH_input_s0.set(this.segment(), 0L, index, value); return this; }
    /// Sets `input_s0` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_s0(@CType("double") double value) { return this.input_s0At(0L, value); }

    /// {@return `input_t0` at the given index}
    /// @param index the index
    public @CType("double") double input_t0At(long index) { return (double) VH_input_t0.get(this.segment(), 0L, index); }
    /// {@return `input_t0`}
    public @CType("double") double input_t0() { return this.input_t0At(0L); }
    /// Sets `input_t0` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_t0At(long index, @CType("double") double value) { VH_input_t0.set(this.segment(), 0L, index, value); return this; }
    /// Sets `input_t0` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_t0(@CType("double") double value) { return this.input_t0At(0L, value); }

    /// {@return `input_s1` at the given index}
    /// @param index the index
    public @CType("double") double input_s1At(long index) { return (double) VH_input_s1.get(this.segment(), 0L, index); }
    /// {@return `input_s1`}
    public @CType("double") double input_s1() { return this.input_s1At(0L); }
    /// Sets `input_s1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_s1At(long index, @CType("double") double value) { VH_input_s1.set(this.segment(), 0L, index, value); return this; }
    /// Sets `input_s1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_s1(@CType("double") double value) { return this.input_s1At(0L, value); }

    /// {@return `input_t1` at the given index}
    /// @param index the index
    public @CType("double") double input_t1At(long index) { return (double) VH_input_t1.get(this.segment(), 0L, index); }
    /// {@return `input_t1`}
    public @CType("double") double input_t1() { return this.input_t1At(0L); }
    /// Sets `input_t1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_t1At(long index, @CType("double") double value) { VH_input_t1.set(this.segment(), 0L, index, value); return this; }
    /// Sets `input_t1` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_t1(@CType("double") double value) { return this.input_t1At(0L, value); }

    /// {@return `input_cb` at the given index}
    /// @param index the index
    public @CType("stbir_input_callback *") java.lang.foreign.MemorySegment input_cbAt(long index) { return (java.lang.foreign.MemorySegment) VH_input_cb.get(this.segment(), 0L, index); }
    /// {@return `input_cb`}
    public @CType("stbir_input_callback *") java.lang.foreign.MemorySegment input_cb() { return this.input_cbAt(0L); }
    /// Sets `input_cb` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_cbAt(long index, @CType("stbir_input_callback *") java.lang.foreign.MemorySegment value) { VH_input_cb.set(this.segment(), 0L, index, value); return this; }
    /// Sets `input_cb` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_cb(@CType("stbir_input_callback *") java.lang.foreign.MemorySegment value) { return this.input_cbAt(0L, value); }

    /// {@return `output_pixels` at the given index}
    /// @param index the index
    public @CType("void*") java.lang.foreign.MemorySegment output_pixelsAt(long index) { return (java.lang.foreign.MemorySegment) VH_output_pixels.get(this.segment(), 0L, index); }
    /// {@return `output_pixels`}
    public @CType("void*") java.lang.foreign.MemorySegment output_pixels() { return this.output_pixelsAt(0L); }
    /// Sets `output_pixels` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_pixelsAt(long index, @CType("void*") java.lang.foreign.MemorySegment value) { VH_output_pixels.set(this.segment(), 0L, index, value); return this; }
    /// Sets `output_pixels` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_pixels(@CType("void*") java.lang.foreign.MemorySegment value) { return this.output_pixelsAt(0L, value); }

    /// {@return `output_w` at the given index}
    /// @param index the index
    public @CType("int") int output_wAt(long index) { return (int) VH_output_w.get(this.segment(), 0L, index); }
    /// {@return `output_w`}
    public @CType("int") int output_w() { return this.output_wAt(0L); }
    /// Sets `output_w` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_wAt(long index, @CType("int") int value) { VH_output_w.set(this.segment(), 0L, index, value); return this; }
    /// Sets `output_w` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_w(@CType("int") int value) { return this.output_wAt(0L, value); }

    /// {@return `output_h` at the given index}
    /// @param index the index
    public @CType("int") int output_hAt(long index) { return (int) VH_output_h.get(this.segment(), 0L, index); }
    /// {@return `output_h`}
    public @CType("int") int output_h() { return this.output_hAt(0L); }
    /// Sets `output_h` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_hAt(long index, @CType("int") int value) { VH_output_h.set(this.segment(), 0L, index, value); return this; }
    /// Sets `output_h` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_h(@CType("int") int value) { return this.output_hAt(0L, value); }

    /// {@return `output_subx` at the given index}
    /// @param index the index
    public @CType("int") int output_subxAt(long index) { return (int) VH_output_subx.get(this.segment(), 0L, index); }
    /// {@return `output_subx`}
    public @CType("int") int output_subx() { return this.output_subxAt(0L); }
    /// Sets `output_subx` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_subxAt(long index, @CType("int") int value) { VH_output_subx.set(this.segment(), 0L, index, value); return this; }
    /// Sets `output_subx` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_subx(@CType("int") int value) { return this.output_subxAt(0L, value); }

    /// {@return `output_suby` at the given index}
    /// @param index the index
    public @CType("int") int output_subyAt(long index) { return (int) VH_output_suby.get(this.segment(), 0L, index); }
    /// {@return `output_suby`}
    public @CType("int") int output_suby() { return this.output_subyAt(0L); }
    /// Sets `output_suby` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_subyAt(long index, @CType("int") int value) { VH_output_suby.set(this.segment(), 0L, index, value); return this; }
    /// Sets `output_suby` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_suby(@CType("int") int value) { return this.output_subyAt(0L, value); }

    /// {@return `output_subw` at the given index}
    /// @param index the index
    public @CType("int") int output_subwAt(long index) { return (int) VH_output_subw.get(this.segment(), 0L, index); }
    /// {@return `output_subw`}
    public @CType("int") int output_subw() { return this.output_subwAt(0L); }
    /// Sets `output_subw` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_subwAt(long index, @CType("int") int value) { VH_output_subw.set(this.segment(), 0L, index, value); return this; }
    /// Sets `output_subw` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_subw(@CType("int") int value) { return this.output_subwAt(0L, value); }

    /// {@return `output_subh` at the given index}
    /// @param index the index
    public @CType("int") int output_subhAt(long index) { return (int) VH_output_subh.get(this.segment(), 0L, index); }
    /// {@return `output_subh`}
    public @CType("int") int output_subh() { return this.output_subhAt(0L); }
    /// Sets `output_subh` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_subhAt(long index, @CType("int") int value) { VH_output_subh.set(this.segment(), 0L, index, value); return this; }
    /// Sets `output_subh` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_subh(@CType("int") int value) { return this.output_subhAt(0L, value); }

    /// {@return `output_cb` at the given index}
    /// @param index the index
    public @CType("stbir_output_callback *") java.lang.foreign.MemorySegment output_cbAt(long index) { return (java.lang.foreign.MemorySegment) VH_output_cb.get(this.segment(), 0L, index); }
    /// {@return `output_cb`}
    public @CType("stbir_output_callback *") java.lang.foreign.MemorySegment output_cb() { return this.output_cbAt(0L); }
    /// Sets `output_cb` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_cbAt(long index, @CType("stbir_output_callback *") java.lang.foreign.MemorySegment value) { VH_output_cb.set(this.segment(), 0L, index, value); return this; }
    /// Sets `output_cb` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_cb(@CType("stbir_output_callback *") java.lang.foreign.MemorySegment value) { return this.output_cbAt(0L, value); }

    /// {@return `input_stride_in_bytes` at the given index}
    /// @param index the index
    public @CType("int") int input_stride_in_bytesAt(long index) { return (int) VH_input_stride_in_bytes.get(this.segment(), 0L, index); }
    /// {@return `input_stride_in_bytes`}
    public @CType("int") int input_stride_in_bytes() { return this.input_stride_in_bytesAt(0L); }
    /// Sets `input_stride_in_bytes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_stride_in_bytesAt(long index, @CType("int") int value) { VH_input_stride_in_bytes.set(this.segment(), 0L, index, value); return this; }
    /// Sets `input_stride_in_bytes` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_stride_in_bytes(@CType("int") int value) { return this.input_stride_in_bytesAt(0L, value); }

    /// {@return `output_stride_in_bytes` at the given index}
    /// @param index the index
    public @CType("int") int output_stride_in_bytesAt(long index) { return (int) VH_output_stride_in_bytes.get(this.segment(), 0L, index); }
    /// {@return `output_stride_in_bytes`}
    public @CType("int") int output_stride_in_bytes() { return this.output_stride_in_bytesAt(0L); }
    /// Sets `output_stride_in_bytes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_stride_in_bytesAt(long index, @CType("int") int value) { VH_output_stride_in_bytes.set(this.segment(), 0L, index, value); return this; }
    /// Sets `output_stride_in_bytes` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_stride_in_bytes(@CType("int") int value) { return this.output_stride_in_bytesAt(0L, value); }

    /// {@return `splits` at the given index}
    /// @param index the index
    public @CType("int") int splitsAt(long index) { return (int) VH_splits.get(this.segment(), 0L, index); }
    /// {@return `splits`}
    public @CType("int") int splits() { return this.splitsAt(0L); }
    /// Sets `splits` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE splitsAt(long index, @CType("int") int value) { VH_splits.set(this.segment(), 0L, index, value); return this; }
    /// Sets `splits` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE splits(@CType("int") int value) { return this.splitsAt(0L, value); }

    /// {@return `fast_alpha` at the given index}
    /// @param index the index
    public @CType("int") int fast_alphaAt(long index) { return (int) VH_fast_alpha.get(this.segment(), 0L, index); }
    /// {@return `fast_alpha`}
    public @CType("int") int fast_alpha() { return this.fast_alphaAt(0L); }
    /// Sets `fast_alpha` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE fast_alphaAt(long index, @CType("int") int value) { VH_fast_alpha.set(this.segment(), 0L, index, value); return this; }
    /// Sets `fast_alpha` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE fast_alpha(@CType("int") int value) { return this.fast_alphaAt(0L, value); }

    /// {@return `needs_rebuild` at the given index}
    /// @param index the index
    public @CType("int") int needs_rebuildAt(long index) { return (int) VH_needs_rebuild.get(this.segment(), 0L, index); }
    /// {@return `needs_rebuild`}
    public @CType("int") int needs_rebuild() { return this.needs_rebuildAt(0L); }
    /// Sets `needs_rebuild` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE needs_rebuildAt(long index, @CType("int") int value) { VH_needs_rebuild.set(this.segment(), 0L, index, value); return this; }
    /// Sets `needs_rebuild` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE needs_rebuild(@CType("int") int value) { return this.needs_rebuildAt(0L, value); }

    /// {@return `called_alloc` at the given index}
    /// @param index the index
    public @CType("int") int called_allocAt(long index) { return (int) VH_called_alloc.get(this.segment(), 0L, index); }
    /// {@return `called_alloc`}
    public @CType("int") int called_alloc() { return this.called_allocAt(0L); }
    /// Sets `called_alloc` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE called_allocAt(long index, @CType("int") int value) { VH_called_alloc.set(this.segment(), 0L, index, value); return this; }
    /// Sets `called_alloc` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE called_alloc(@CType("int") int value) { return this.called_allocAt(0L, value); }

    /// {@return `input_pixel_layout_public` at the given index}
    /// @param index the index
    public @CType("stbir_pixel_layout") int input_pixel_layout_publicAt(long index) { return (int) VH_input_pixel_layout_public.get(this.segment(), 0L, index); }
    /// {@return `input_pixel_layout_public`}
    public @CType("stbir_pixel_layout") int input_pixel_layout_public() { return this.input_pixel_layout_publicAt(0L); }
    /// Sets `input_pixel_layout_public` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_pixel_layout_publicAt(long index, @CType("stbir_pixel_layout") int value) { VH_input_pixel_layout_public.set(this.segment(), 0L, index, value); return this; }
    /// Sets `input_pixel_layout_public` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_pixel_layout_public(@CType("stbir_pixel_layout") int value) { return this.input_pixel_layout_publicAt(0L, value); }

    /// {@return `output_pixel_layout_public` at the given index}
    /// @param index the index
    public @CType("stbir_pixel_layout") int output_pixel_layout_publicAt(long index) { return (int) VH_output_pixel_layout_public.get(this.segment(), 0L, index); }
    /// {@return `output_pixel_layout_public`}
    public @CType("stbir_pixel_layout") int output_pixel_layout_public() { return this.output_pixel_layout_publicAt(0L); }
    /// Sets `output_pixel_layout_public` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_pixel_layout_publicAt(long index, @CType("stbir_pixel_layout") int value) { VH_output_pixel_layout_public.set(this.segment(), 0L, index, value); return this; }
    /// Sets `output_pixel_layout_public` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_pixel_layout_public(@CType("stbir_pixel_layout") int value) { return this.output_pixel_layout_publicAt(0L, value); }

    /// {@return `input_data_type` at the given index}
    /// @param index the index
    public @CType("stbir_datatype") int input_data_typeAt(long index) { return (int) VH_input_data_type.get(this.segment(), 0L, index); }
    /// {@return `input_data_type`}
    public @CType("stbir_datatype") int input_data_type() { return this.input_data_typeAt(0L); }
    /// Sets `input_data_type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_data_typeAt(long index, @CType("stbir_datatype") int value) { VH_input_data_type.set(this.segment(), 0L, index, value); return this; }
    /// Sets `input_data_type` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE input_data_type(@CType("stbir_datatype") int value) { return this.input_data_typeAt(0L, value); }

    /// {@return `output_data_type` at the given index}
    /// @param index the index
    public @CType("stbir_datatype") int output_data_typeAt(long index) { return (int) VH_output_data_type.get(this.segment(), 0L, index); }
    /// {@return `output_data_type`}
    public @CType("stbir_datatype") int output_data_type() { return this.output_data_typeAt(0L); }
    /// Sets `output_data_type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_data_typeAt(long index, @CType("stbir_datatype") int value) { VH_output_data_type.set(this.segment(), 0L, index, value); return this; }
    /// Sets `output_data_type` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE output_data_type(@CType("stbir_datatype") int value) { return this.output_data_typeAt(0L, value); }

    /// {@return `horizontal_filter` at the given index}
    /// @param index the index
    public @CType("stbir_filter") int horizontal_filterAt(long index) { return (int) VH_horizontal_filter.get(this.segment(), 0L, index); }
    /// {@return `horizontal_filter`}
    public @CType("stbir_filter") int horizontal_filter() { return this.horizontal_filterAt(0L); }
    /// Sets `horizontal_filter` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_filterAt(long index, @CType("stbir_filter") int value) { VH_horizontal_filter.set(this.segment(), 0L, index, value); return this; }
    /// Sets `horizontal_filter` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_filter(@CType("stbir_filter") int value) { return this.horizontal_filterAt(0L, value); }

    /// {@return `vertical_filter` at the given index}
    /// @param index the index
    public @CType("stbir_filter") int vertical_filterAt(long index) { return (int) VH_vertical_filter.get(this.segment(), 0L, index); }
    /// {@return `vertical_filter`}
    public @CType("stbir_filter") int vertical_filter() { return this.vertical_filterAt(0L); }
    /// Sets `vertical_filter` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_filterAt(long index, @CType("stbir_filter") int value) { VH_vertical_filter.set(this.segment(), 0L, index, value); return this; }
    /// Sets `vertical_filter` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_filter(@CType("stbir_filter") int value) { return this.vertical_filterAt(0L, value); }

    /// {@return `horizontal_edge` at the given index}
    /// @param index the index
    public @CType("stbir_edge") int horizontal_edgeAt(long index) { return (int) VH_horizontal_edge.get(this.segment(), 0L, index); }
    /// {@return `horizontal_edge`}
    public @CType("stbir_edge") int horizontal_edge() { return this.horizontal_edgeAt(0L); }
    /// Sets `horizontal_edge` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_edgeAt(long index, @CType("stbir_edge") int value) { VH_horizontal_edge.set(this.segment(), 0L, index, value); return this; }
    /// Sets `horizontal_edge` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_edge(@CType("stbir_edge") int value) { return this.horizontal_edgeAt(0L, value); }

    /// {@return `vertical_edge` at the given index}
    /// @param index the index
    public @CType("stbir_edge") int vertical_edgeAt(long index) { return (int) VH_vertical_edge.get(this.segment(), 0L, index); }
    /// {@return `vertical_edge`}
    public @CType("stbir_edge") int vertical_edge() { return this.vertical_edgeAt(0L); }
    /// Sets `vertical_edge` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_edgeAt(long index, @CType("stbir_edge") int value) { VH_vertical_edge.set(this.segment(), 0L, index, value); return this; }
    /// Sets `vertical_edge` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_edge(@CType("stbir_edge") int value) { return this.vertical_edgeAt(0L, value); }

    /// {@return `horizontal_filter_kernel` at the given index}
    /// @param index the index
    public @CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment horizontal_filter_kernelAt(long index) { return (java.lang.foreign.MemorySegment) VH_horizontal_filter_kernel.get(this.segment(), 0L, index); }
    /// {@return `horizontal_filter_kernel`}
    public @CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment horizontal_filter_kernel() { return this.horizontal_filter_kernelAt(0L); }
    /// Sets `horizontal_filter_kernel` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_filter_kernelAt(long index, @CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment value) { VH_horizontal_filter_kernel.set(this.segment(), 0L, index, value); return this; }
    /// Sets `horizontal_filter_kernel` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_filter_kernel(@CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment value) { return this.horizontal_filter_kernelAt(0L, value); }

    /// {@return `horizontal_filter_support` at the given index}
    /// @param index the index
    public @CType("stbir__support_callback *") java.lang.foreign.MemorySegment horizontal_filter_supportAt(long index) { return (java.lang.foreign.MemorySegment) VH_horizontal_filter_support.get(this.segment(), 0L, index); }
    /// {@return `horizontal_filter_support`}
    public @CType("stbir__support_callback *") java.lang.foreign.MemorySegment horizontal_filter_support() { return this.horizontal_filter_supportAt(0L); }
    /// Sets `horizontal_filter_support` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_filter_supportAt(long index, @CType("stbir__support_callback *") java.lang.foreign.MemorySegment value) { VH_horizontal_filter_support.set(this.segment(), 0L, index, value); return this; }
    /// Sets `horizontal_filter_support` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE horizontal_filter_support(@CType("stbir__support_callback *") java.lang.foreign.MemorySegment value) { return this.horizontal_filter_supportAt(0L, value); }

    /// {@return `vertical_filter_kernel` at the given index}
    /// @param index the index
    public @CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment vertical_filter_kernelAt(long index) { return (java.lang.foreign.MemorySegment) VH_vertical_filter_kernel.get(this.segment(), 0L, index); }
    /// {@return `vertical_filter_kernel`}
    public @CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment vertical_filter_kernel() { return this.vertical_filter_kernelAt(0L); }
    /// Sets `vertical_filter_kernel` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_filter_kernelAt(long index, @CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment value) { VH_vertical_filter_kernel.set(this.segment(), 0L, index, value); return this; }
    /// Sets `vertical_filter_kernel` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_filter_kernel(@CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment value) { return this.vertical_filter_kernelAt(0L, value); }

    /// {@return `vertical_filter_support` at the given index}
    /// @param index the index
    public @CType("stbir__support_callback *") java.lang.foreign.MemorySegment vertical_filter_supportAt(long index) { return (java.lang.foreign.MemorySegment) VH_vertical_filter_support.get(this.segment(), 0L, index); }
    /// {@return `vertical_filter_support`}
    public @CType("stbir__support_callback *") java.lang.foreign.MemorySegment vertical_filter_support() { return this.vertical_filter_supportAt(0L); }
    /// Sets `vertical_filter_support` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_filter_supportAt(long index, @CType("stbir__support_callback *") java.lang.foreign.MemorySegment value) { VH_vertical_filter_support.set(this.segment(), 0L, index, value); return this; }
    /// Sets `vertical_filter_support` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE vertical_filter_support(@CType("stbir__support_callback *") java.lang.foreign.MemorySegment value) { return this.vertical_filter_supportAt(0L, value); }

    /// {@return `samplers` at the given index}
    /// @param index the index
    public @CType("stbir__info *") java.lang.foreign.MemorySegment samplersAt(long index) { return (java.lang.foreign.MemorySegment) VH_samplers.get(this.segment(), 0L, index); }
    /// {@return `samplers`}
    public @CType("stbir__info *") java.lang.foreign.MemorySegment samplers() { return this.samplersAt(0L); }
    /// Sets `samplers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE samplersAt(long index, @CType("stbir__info *") java.lang.foreign.MemorySegment value) { VH_samplers.set(this.segment(), 0L, index, value); return this; }
    /// Sets `samplers` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIR_RESIZE samplers(@CType("stbir__info *") java.lang.foreign.MemorySegment value) { return this.samplersAt(0L, value); }

}
