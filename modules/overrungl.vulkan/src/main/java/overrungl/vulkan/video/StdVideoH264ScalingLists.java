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
package overrungl.vulkan.video;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### scaling_list_present_mask
/// [VarHandle][#VH_scaling_list_present_mask] - [Getter][#scaling_list_present_mask()] - [Setter][#scaling_list_present_mask(short)]
/// ### use_default_scaling_matrix_mask
/// [VarHandle][#VH_use_default_scaling_matrix_mask] - [Getter][#use_default_scaling_matrix_mask()] - [Setter][#use_default_scaling_matrix_mask(short)]
/// ### ScalingList4x4
/// [VarHandle][#VH_ScalingList4x4] - [Getter][#ScalingList4x4()] - [Setter][#ScalingList4x4(byte)]
/// ### ScalingList8x8
/// [VarHandle][#VH_ScalingList8x8] - [Getter][#ScalingList8x8()] - [Setter][#ScalingList8x8(byte)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH264ScalingLists {
///     uint16_t scaling_list_present_mask;
///     uint16_t use_default_scaling_matrix_mask;
///     uint8_t [ ][ ] ScalingList4x4;
///     uint8_t [ ][ ] ScalingList8x8;
/// } StdVideoH264ScalingLists;
/// ```
public sealed class StdVideoH264ScalingLists extends Struct {
    /// The struct layout of `StdVideoH264ScalingLists`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_SHORT.withName("scaling_list_present_mask"),
        ValueLayout.JAVA_SHORT.withName("use_default_scaling_matrix_mask"),
        ValueLayout.JAVA_BYTE.withName("ScalingList4x4"),
        ValueLayout.JAVA_BYTE.withName("ScalingList8x8")
    );
    /// The [VarHandle] of `scaling_list_present_mask` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_scaling_list_present_mask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scaling_list_present_mask"));
    /// The [VarHandle] of `use_default_scaling_matrix_mask` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_use_default_scaling_matrix_mask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("use_default_scaling_matrix_mask"));
    /// The [VarHandle] of `ScalingList4x4` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_ScalingList4x4 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ScalingList4x4"));
    /// The [VarHandle] of `ScalingList8x8` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_ScalingList8x8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ScalingList8x8"));

    /// Creates `StdVideoH264ScalingLists` with the given segment.
    /// @param segment the memory segment
    public StdVideoH264ScalingLists(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH264ScalingLists` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264ScalingLists of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH264ScalingLists(segment); }

    /// Creates `StdVideoH264ScalingLists` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `StdVideoH264ScalingLists` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH264ScalingLists ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH264ScalingLists(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH264ScalingLists` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `StdVideoH264ScalingLists` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH264ScalingLists`
    public static StdVideoH264ScalingLists alloc(SegmentAllocator allocator) { return new StdVideoH264ScalingLists(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH264ScalingLists` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH264ScalingLists`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `StdVideoH264ScalingLists` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH264ScalingLists`
    public static StdVideoH264ScalingLists allocInit(SegmentAllocator allocator, @CType("uint16_t") short scaling_list_present_mask, @CType("uint16_t") short use_default_scaling_matrix_mask, @CType("uint8_t [ ][ ]") byte ScalingList4x4, @CType("uint8_t [ ][ ]") byte ScalingList8x8) { return alloc(allocator).scaling_list_present_mask(scaling_list_present_mask).use_default_scaling_matrix_mask(use_default_scaling_matrix_mask).ScalingList4x4(ScalingList4x4).ScalingList8x8(ScalingList8x8); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public StdVideoH264ScalingLists copyFrom(StdVideoH264ScalingLists src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `scaling_list_present_mask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_scaling_list_present_mask(MemorySegment segment, long index) { return (short) VH_scaling_list_present_mask.get(segment, 0L, index); }
    /// {@return `scaling_list_present_mask`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_scaling_list_present_mask(MemorySegment segment) { return StdVideoH264ScalingLists.get_scaling_list_present_mask(segment, 0L); }
    /// {@return `scaling_list_present_mask`}
    public @CType("uint16_t") short scaling_list_present_mask() { return StdVideoH264ScalingLists.get_scaling_list_present_mask(this.segment()); }
    /// Sets `scaling_list_present_mask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_scaling_list_present_mask(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_scaling_list_present_mask.set(segment, 0L, index, value); }
    /// Sets `scaling_list_present_mask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_scaling_list_present_mask(MemorySegment segment, @CType("uint16_t") short value) { StdVideoH264ScalingLists.set_scaling_list_present_mask(segment, 0L, value); }
    /// Sets `scaling_list_present_mask` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264ScalingLists scaling_list_present_mask(@CType("uint16_t") short value) { StdVideoH264ScalingLists.set_scaling_list_present_mask(this.segment(), value); return this; }

    /// {@return `use_default_scaling_matrix_mask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_use_default_scaling_matrix_mask(MemorySegment segment, long index) { return (short) VH_use_default_scaling_matrix_mask.get(segment, 0L, index); }
    /// {@return `use_default_scaling_matrix_mask`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_use_default_scaling_matrix_mask(MemorySegment segment) { return StdVideoH264ScalingLists.get_use_default_scaling_matrix_mask(segment, 0L); }
    /// {@return `use_default_scaling_matrix_mask`}
    public @CType("uint16_t") short use_default_scaling_matrix_mask() { return StdVideoH264ScalingLists.get_use_default_scaling_matrix_mask(this.segment()); }
    /// Sets `use_default_scaling_matrix_mask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_use_default_scaling_matrix_mask(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_use_default_scaling_matrix_mask.set(segment, 0L, index, value); }
    /// Sets `use_default_scaling_matrix_mask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_use_default_scaling_matrix_mask(MemorySegment segment, @CType("uint16_t") short value) { StdVideoH264ScalingLists.set_use_default_scaling_matrix_mask(segment, 0L, value); }
    /// Sets `use_default_scaling_matrix_mask` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264ScalingLists use_default_scaling_matrix_mask(@CType("uint16_t") short value) { StdVideoH264ScalingLists.set_use_default_scaling_matrix_mask(this.segment(), value); return this; }

    /// {@return `ScalingList4x4` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ][ ]") byte get_ScalingList4x4(MemorySegment segment, long index) { return (byte) VH_ScalingList4x4.get(segment, 0L, index); }
    /// {@return `ScalingList4x4`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ][ ]") byte get_ScalingList4x4(MemorySegment segment) { return StdVideoH264ScalingLists.get_ScalingList4x4(segment, 0L); }
    /// {@return `ScalingList4x4`}
    public @CType("uint8_t [ ][ ]") byte ScalingList4x4() { return StdVideoH264ScalingLists.get_ScalingList4x4(this.segment()); }
    /// Sets `ScalingList4x4` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ScalingList4x4(MemorySegment segment, long index, @CType("uint8_t [ ][ ]") byte value) { VH_ScalingList4x4.set(segment, 0L, index, value); }
    /// Sets `ScalingList4x4` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ScalingList4x4(MemorySegment segment, @CType("uint8_t [ ][ ]") byte value) { StdVideoH264ScalingLists.set_ScalingList4x4(segment, 0L, value); }
    /// Sets `ScalingList4x4` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264ScalingLists ScalingList4x4(@CType("uint8_t [ ][ ]") byte value) { StdVideoH264ScalingLists.set_ScalingList4x4(this.segment(), value); return this; }

    /// {@return `ScalingList8x8` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ][ ]") byte get_ScalingList8x8(MemorySegment segment, long index) { return (byte) VH_ScalingList8x8.get(segment, 0L, index); }
    /// {@return `ScalingList8x8`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ][ ]") byte get_ScalingList8x8(MemorySegment segment) { return StdVideoH264ScalingLists.get_ScalingList8x8(segment, 0L); }
    /// {@return `ScalingList8x8`}
    public @CType("uint8_t [ ][ ]") byte ScalingList8x8() { return StdVideoH264ScalingLists.get_ScalingList8x8(this.segment()); }
    /// Sets `ScalingList8x8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ScalingList8x8(MemorySegment segment, long index, @CType("uint8_t [ ][ ]") byte value) { VH_ScalingList8x8.set(segment, 0L, index, value); }
    /// Sets `ScalingList8x8` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ScalingList8x8(MemorySegment segment, @CType("uint8_t [ ][ ]") byte value) { StdVideoH264ScalingLists.set_ScalingList8x8(segment, 0L, value); }
    /// Sets `ScalingList8x8` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH264ScalingLists ScalingList8x8(@CType("uint8_t [ ][ ]") byte value) { StdVideoH264ScalingLists.set_ScalingList8x8(this.segment(), value); return this; }

    /// A buffer of [StdVideoH264ScalingLists].
    public static final class Buffer extends StdVideoH264ScalingLists {
        private final long elementCount;

        /// Creates `StdVideoH264ScalingLists.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `StdVideoH264ScalingLists`.
        /// @param index the index of the struct buffer
        /// @return the slice of `StdVideoH264ScalingLists`
        public StdVideoH264ScalingLists asSlice(long index) { return new StdVideoH264ScalingLists(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `StdVideoH264ScalingLists`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `StdVideoH264ScalingLists`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `scaling_list_present_mask` at the given index}
        /// @param index the index
        public @CType("uint16_t") short scaling_list_present_maskAt(long index) { return StdVideoH264ScalingLists.get_scaling_list_present_mask(this.segment(), index); }
        /// Sets `scaling_list_present_mask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer scaling_list_present_maskAt(long index, @CType("uint16_t") short value) { StdVideoH264ScalingLists.set_scaling_list_present_mask(this.segment(), index, value); return this; }

        /// {@return `use_default_scaling_matrix_mask` at the given index}
        /// @param index the index
        public @CType("uint16_t") short use_default_scaling_matrix_maskAt(long index) { return StdVideoH264ScalingLists.get_use_default_scaling_matrix_mask(this.segment(), index); }
        /// Sets `use_default_scaling_matrix_mask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer use_default_scaling_matrix_maskAt(long index, @CType("uint16_t") short value) { StdVideoH264ScalingLists.set_use_default_scaling_matrix_mask(this.segment(), index, value); return this; }

        /// {@return `ScalingList4x4` at the given index}
        /// @param index the index
        public @CType("uint8_t [ ][ ]") byte ScalingList4x4At(long index) { return StdVideoH264ScalingLists.get_ScalingList4x4(this.segment(), index); }
        /// Sets `ScalingList4x4` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer ScalingList4x4At(long index, @CType("uint8_t [ ][ ]") byte value) { StdVideoH264ScalingLists.set_ScalingList4x4(this.segment(), index, value); return this; }

        /// {@return `ScalingList8x8` at the given index}
        /// @param index the index
        public @CType("uint8_t [ ][ ]") byte ScalingList8x8At(long index) { return StdVideoH264ScalingLists.get_ScalingList8x8(this.segment(), index); }
        /// Sets `ScalingList8x8` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer ScalingList8x8At(long index, @CType("uint8_t [ ][ ]") byte value) { StdVideoH264ScalingLists.set_ScalingList8x8(this.segment(), index, value); return this; }

    }
}
