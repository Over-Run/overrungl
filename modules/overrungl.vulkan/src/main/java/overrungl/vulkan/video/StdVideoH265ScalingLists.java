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
/// ### ScalingList4x4
/// [VarHandle][#VH_ScalingList4x4] - [Getter][#ScalingList4x4()] - [Setter][#ScalingList4x4(byte)]
/// ### ScalingList8x8
/// [VarHandle][#VH_ScalingList8x8] - [Getter][#ScalingList8x8()] - [Setter][#ScalingList8x8(byte)]
/// ### ScalingList16x16
/// [VarHandle][#VH_ScalingList16x16] - [Getter][#ScalingList16x16()] - [Setter][#ScalingList16x16(byte)]
/// ### ScalingList32x32
/// [VarHandle][#VH_ScalingList32x32] - [Getter][#ScalingList32x32()] - [Setter][#ScalingList32x32(byte)]
/// ### ScalingListDCCoef16x16
/// [VarHandle][#VH_ScalingListDCCoef16x16] - [Getter][#ScalingListDCCoef16x16()] - [Setter][#ScalingListDCCoef16x16(byte)]
/// ### ScalingListDCCoef32x32
/// [VarHandle][#VH_ScalingListDCCoef32x32] - [Getter][#ScalingListDCCoef32x32()] - [Setter][#ScalingListDCCoef32x32(byte)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoH265ScalingLists {
///     uint8_t [ ][ ] ScalingList4x4;
///     uint8_t [ ][ ] ScalingList8x8;
///     uint8_t [ ][ ] ScalingList16x16;
///     uint8_t [ ][ ] ScalingList32x32;
///     uint8_t [ ] ScalingListDCCoef16x16;
///     uint8_t [ ] ScalingListDCCoef32x32;
/// } StdVideoH265ScalingLists;
/// ```
public final class StdVideoH265ScalingLists extends Struct {
    /// The struct layout of `StdVideoH265ScalingLists`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_BYTE.withName("ScalingList4x4"),
        ValueLayout.JAVA_BYTE.withName("ScalingList8x8"),
        ValueLayout.JAVA_BYTE.withName("ScalingList16x16"),
        ValueLayout.JAVA_BYTE.withName("ScalingList32x32"),
        ValueLayout.JAVA_BYTE.withName("ScalingListDCCoef16x16"),
        ValueLayout.JAVA_BYTE.withName("ScalingListDCCoef32x32")
    );
    /// The [VarHandle] of `ScalingList4x4` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_ScalingList4x4 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ScalingList4x4"));
    /// The [VarHandle] of `ScalingList8x8` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_ScalingList8x8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ScalingList8x8"));
    /// The [VarHandle] of `ScalingList16x16` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_ScalingList16x16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ScalingList16x16"));
    /// The [VarHandle] of `ScalingList32x32` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_ScalingList32x32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ScalingList32x32"));
    /// The [VarHandle] of `ScalingListDCCoef16x16` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_ScalingListDCCoef16x16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ScalingListDCCoef16x16"));
    /// The [VarHandle] of `ScalingListDCCoef32x32` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_ScalingListDCCoef32x32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ScalingListDCCoef32x32"));

    /// Creates `StdVideoH265ScalingLists` with the given segment.
    /// @param segment the memory segment
    public StdVideoH265ScalingLists(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoH265ScalingLists` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ScalingLists of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265ScalingLists(segment); }

    /// Creates `StdVideoH265ScalingLists` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ScalingLists ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265ScalingLists(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoH265ScalingLists` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoH265ScalingLists ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoH265ScalingLists(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoH265ScalingLists` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoH265ScalingLists`
    public static StdVideoH265ScalingLists alloc(SegmentAllocator allocator) { return new StdVideoH265ScalingLists(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoH265ScalingLists` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoH265ScalingLists`
    public static StdVideoH265ScalingLists alloc(SegmentAllocator allocator, long count) { return new StdVideoH265ScalingLists(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `StdVideoH265ScalingLists`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoH265ScalingLists`
    public StdVideoH265ScalingLists asSlice(long index) { return new StdVideoH265ScalingLists(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `StdVideoH265ScalingLists`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoH265ScalingLists`
    public StdVideoH265ScalingLists asSlice(long index, long count) { return new StdVideoH265ScalingLists(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `ScalingList4x4` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ][ ]") byte get_ScalingList4x4(MemorySegment segment, long index) { return (byte) VH_ScalingList4x4.get(segment, 0L, index); }
    /// {@return `ScalingList4x4`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ][ ]") byte get_ScalingList4x4(MemorySegment segment) { return StdVideoH265ScalingLists.get_ScalingList4x4(segment, 0L); }
    /// {@return `ScalingList4x4` at the given index}
    /// @param index the index
    public @CType("uint8_t [ ][ ]") byte ScalingList4x4At(long index) { return StdVideoH265ScalingLists.get_ScalingList4x4(this.segment(), index); }
    /// {@return `ScalingList4x4`}
    public @CType("uint8_t [ ][ ]") byte ScalingList4x4() { return StdVideoH265ScalingLists.get_ScalingList4x4(this.segment()); }
    /// Sets `ScalingList4x4` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ScalingList4x4(MemorySegment segment, long index, @CType("uint8_t [ ][ ]") byte value) { VH_ScalingList4x4.set(segment, 0L, index, value); }
    /// Sets `ScalingList4x4` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ScalingList4x4(MemorySegment segment, @CType("uint8_t [ ][ ]") byte value) { StdVideoH265ScalingLists.set_ScalingList4x4(segment, 0L, value); }
    /// Sets `ScalingList4x4` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingList4x4At(long index, @CType("uint8_t [ ][ ]") byte value) { StdVideoH265ScalingLists.set_ScalingList4x4(this.segment(), index, value); return this; }
    /// Sets `ScalingList4x4` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingList4x4(@CType("uint8_t [ ][ ]") byte value) { StdVideoH265ScalingLists.set_ScalingList4x4(this.segment(), value); return this; }

    /// {@return `ScalingList8x8` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ][ ]") byte get_ScalingList8x8(MemorySegment segment, long index) { return (byte) VH_ScalingList8x8.get(segment, 0L, index); }
    /// {@return `ScalingList8x8`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ][ ]") byte get_ScalingList8x8(MemorySegment segment) { return StdVideoH265ScalingLists.get_ScalingList8x8(segment, 0L); }
    /// {@return `ScalingList8x8` at the given index}
    /// @param index the index
    public @CType("uint8_t [ ][ ]") byte ScalingList8x8At(long index) { return StdVideoH265ScalingLists.get_ScalingList8x8(this.segment(), index); }
    /// {@return `ScalingList8x8`}
    public @CType("uint8_t [ ][ ]") byte ScalingList8x8() { return StdVideoH265ScalingLists.get_ScalingList8x8(this.segment()); }
    /// Sets `ScalingList8x8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ScalingList8x8(MemorySegment segment, long index, @CType("uint8_t [ ][ ]") byte value) { VH_ScalingList8x8.set(segment, 0L, index, value); }
    /// Sets `ScalingList8x8` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ScalingList8x8(MemorySegment segment, @CType("uint8_t [ ][ ]") byte value) { StdVideoH265ScalingLists.set_ScalingList8x8(segment, 0L, value); }
    /// Sets `ScalingList8x8` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingList8x8At(long index, @CType("uint8_t [ ][ ]") byte value) { StdVideoH265ScalingLists.set_ScalingList8x8(this.segment(), index, value); return this; }
    /// Sets `ScalingList8x8` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingList8x8(@CType("uint8_t [ ][ ]") byte value) { StdVideoH265ScalingLists.set_ScalingList8x8(this.segment(), value); return this; }

    /// {@return `ScalingList16x16` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ][ ]") byte get_ScalingList16x16(MemorySegment segment, long index) { return (byte) VH_ScalingList16x16.get(segment, 0L, index); }
    /// {@return `ScalingList16x16`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ][ ]") byte get_ScalingList16x16(MemorySegment segment) { return StdVideoH265ScalingLists.get_ScalingList16x16(segment, 0L); }
    /// {@return `ScalingList16x16` at the given index}
    /// @param index the index
    public @CType("uint8_t [ ][ ]") byte ScalingList16x16At(long index) { return StdVideoH265ScalingLists.get_ScalingList16x16(this.segment(), index); }
    /// {@return `ScalingList16x16`}
    public @CType("uint8_t [ ][ ]") byte ScalingList16x16() { return StdVideoH265ScalingLists.get_ScalingList16x16(this.segment()); }
    /// Sets `ScalingList16x16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ScalingList16x16(MemorySegment segment, long index, @CType("uint8_t [ ][ ]") byte value) { VH_ScalingList16x16.set(segment, 0L, index, value); }
    /// Sets `ScalingList16x16` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ScalingList16x16(MemorySegment segment, @CType("uint8_t [ ][ ]") byte value) { StdVideoH265ScalingLists.set_ScalingList16x16(segment, 0L, value); }
    /// Sets `ScalingList16x16` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingList16x16At(long index, @CType("uint8_t [ ][ ]") byte value) { StdVideoH265ScalingLists.set_ScalingList16x16(this.segment(), index, value); return this; }
    /// Sets `ScalingList16x16` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingList16x16(@CType("uint8_t [ ][ ]") byte value) { StdVideoH265ScalingLists.set_ScalingList16x16(this.segment(), value); return this; }

    /// {@return `ScalingList32x32` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ][ ]") byte get_ScalingList32x32(MemorySegment segment, long index) { return (byte) VH_ScalingList32x32.get(segment, 0L, index); }
    /// {@return `ScalingList32x32`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ][ ]") byte get_ScalingList32x32(MemorySegment segment) { return StdVideoH265ScalingLists.get_ScalingList32x32(segment, 0L); }
    /// {@return `ScalingList32x32` at the given index}
    /// @param index the index
    public @CType("uint8_t [ ][ ]") byte ScalingList32x32At(long index) { return StdVideoH265ScalingLists.get_ScalingList32x32(this.segment(), index); }
    /// {@return `ScalingList32x32`}
    public @CType("uint8_t [ ][ ]") byte ScalingList32x32() { return StdVideoH265ScalingLists.get_ScalingList32x32(this.segment()); }
    /// Sets `ScalingList32x32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ScalingList32x32(MemorySegment segment, long index, @CType("uint8_t [ ][ ]") byte value) { VH_ScalingList32x32.set(segment, 0L, index, value); }
    /// Sets `ScalingList32x32` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ScalingList32x32(MemorySegment segment, @CType("uint8_t [ ][ ]") byte value) { StdVideoH265ScalingLists.set_ScalingList32x32(segment, 0L, value); }
    /// Sets `ScalingList32x32` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingList32x32At(long index, @CType("uint8_t [ ][ ]") byte value) { StdVideoH265ScalingLists.set_ScalingList32x32(this.segment(), index, value); return this; }
    /// Sets `ScalingList32x32` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingList32x32(@CType("uint8_t [ ][ ]") byte value) { StdVideoH265ScalingLists.set_ScalingList32x32(this.segment(), value); return this; }

    /// {@return `ScalingListDCCoef16x16` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_ScalingListDCCoef16x16(MemorySegment segment, long index) { return (byte) VH_ScalingListDCCoef16x16.get(segment, 0L, index); }
    /// {@return `ScalingListDCCoef16x16`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_ScalingListDCCoef16x16(MemorySegment segment) { return StdVideoH265ScalingLists.get_ScalingListDCCoef16x16(segment, 0L); }
    /// {@return `ScalingListDCCoef16x16` at the given index}
    /// @param index the index
    public @CType("uint8_t [ ]") byte ScalingListDCCoef16x16At(long index) { return StdVideoH265ScalingLists.get_ScalingListDCCoef16x16(this.segment(), index); }
    /// {@return `ScalingListDCCoef16x16`}
    public @CType("uint8_t [ ]") byte ScalingListDCCoef16x16() { return StdVideoH265ScalingLists.get_ScalingListDCCoef16x16(this.segment()); }
    /// Sets `ScalingListDCCoef16x16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ScalingListDCCoef16x16(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_ScalingListDCCoef16x16.set(segment, 0L, index, value); }
    /// Sets `ScalingListDCCoef16x16` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ScalingListDCCoef16x16(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoH265ScalingLists.set_ScalingListDCCoef16x16(segment, 0L, value); }
    /// Sets `ScalingListDCCoef16x16` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingListDCCoef16x16At(long index, @CType("uint8_t [ ]") byte value) { StdVideoH265ScalingLists.set_ScalingListDCCoef16x16(this.segment(), index, value); return this; }
    /// Sets `ScalingListDCCoef16x16` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingListDCCoef16x16(@CType("uint8_t [ ]") byte value) { StdVideoH265ScalingLists.set_ScalingListDCCoef16x16(this.segment(), value); return this; }

    /// {@return `ScalingListDCCoef32x32` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_ScalingListDCCoef32x32(MemorySegment segment, long index) { return (byte) VH_ScalingListDCCoef32x32.get(segment, 0L, index); }
    /// {@return `ScalingListDCCoef32x32`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_ScalingListDCCoef32x32(MemorySegment segment) { return StdVideoH265ScalingLists.get_ScalingListDCCoef32x32(segment, 0L); }
    /// {@return `ScalingListDCCoef32x32` at the given index}
    /// @param index the index
    public @CType("uint8_t [ ]") byte ScalingListDCCoef32x32At(long index) { return StdVideoH265ScalingLists.get_ScalingListDCCoef32x32(this.segment(), index); }
    /// {@return `ScalingListDCCoef32x32`}
    public @CType("uint8_t [ ]") byte ScalingListDCCoef32x32() { return StdVideoH265ScalingLists.get_ScalingListDCCoef32x32(this.segment()); }
    /// Sets `ScalingListDCCoef32x32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ScalingListDCCoef32x32(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_ScalingListDCCoef32x32.set(segment, 0L, index, value); }
    /// Sets `ScalingListDCCoef32x32` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ScalingListDCCoef32x32(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoH265ScalingLists.set_ScalingListDCCoef32x32(segment, 0L, value); }
    /// Sets `ScalingListDCCoef32x32` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingListDCCoef32x32At(long index, @CType("uint8_t [ ]") byte value) { StdVideoH265ScalingLists.set_ScalingListDCCoef32x32(this.segment(), index, value); return this; }
    /// Sets `ScalingListDCCoef32x32` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoH265ScalingLists ScalingListDCCoef32x32(@CType("uint8_t [ ]") byte value) { StdVideoH265ScalingLists.set_ScalingListDCCoef32x32(this.segment(), value); return this; }

}
