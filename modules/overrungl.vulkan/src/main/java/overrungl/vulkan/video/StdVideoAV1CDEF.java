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
/// ### cdef_damping_minus_3
/// [VarHandle][#VH_cdef_damping_minus_3] - [Getter][#cdef_damping_minus_3()] - [Setter][#cdef_damping_minus_3(byte)]
/// ### cdef_bits
/// [VarHandle][#VH_cdef_bits] - [Getter][#cdef_bits()] - [Setter][#cdef_bits(byte)]
/// ### cdef_y_pri_strength
/// [VarHandle][#VH_cdef_y_pri_strength] - [Getter][#cdef_y_pri_strength()] - [Setter][#cdef_y_pri_strength(byte)]
/// ### cdef_y_sec_strength
/// [VarHandle][#VH_cdef_y_sec_strength] - [Getter][#cdef_y_sec_strength()] - [Setter][#cdef_y_sec_strength(byte)]
/// ### cdef_uv_pri_strength
/// [VarHandle][#VH_cdef_uv_pri_strength] - [Getter][#cdef_uv_pri_strength()] - [Setter][#cdef_uv_pri_strength(byte)]
/// ### cdef_uv_sec_strength
/// [VarHandle][#VH_cdef_uv_sec_strength] - [Getter][#cdef_uv_sec_strength()] - [Setter][#cdef_uv_sec_strength(byte)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoAV1CDEF {
///     uint8_t cdef_damping_minus_3;
///     uint8_t cdef_bits;
///     uint8_t [ ] cdef_y_pri_strength;
///     uint8_t [ ] cdef_y_sec_strength;
///     uint8_t [ ] cdef_uv_pri_strength;
///     uint8_t [ ] cdef_uv_sec_strength;
/// } StdVideoAV1CDEF;
/// ```
public final class StdVideoAV1CDEF extends Struct {
    /// The struct layout of `StdVideoAV1CDEF`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_BYTE.withName("cdef_damping_minus_3"),
        ValueLayout.JAVA_BYTE.withName("cdef_bits"),
        ValueLayout.JAVA_BYTE.withName("cdef_y_pri_strength"),
        ValueLayout.JAVA_BYTE.withName("cdef_y_sec_strength"),
        ValueLayout.JAVA_BYTE.withName("cdef_uv_pri_strength"),
        ValueLayout.JAVA_BYTE.withName("cdef_uv_sec_strength")
    );
    /// The [VarHandle] of `cdef_damping_minus_3` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_cdef_damping_minus_3 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cdef_damping_minus_3"));
    /// The [VarHandle] of `cdef_bits` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_cdef_bits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cdef_bits"));
    /// The [VarHandle] of `cdef_y_pri_strength` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_cdef_y_pri_strength = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cdef_y_pri_strength"));
    /// The [VarHandle] of `cdef_y_sec_strength` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_cdef_y_sec_strength = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cdef_y_sec_strength"));
    /// The [VarHandle] of `cdef_uv_pri_strength` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_cdef_uv_pri_strength = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cdef_uv_pri_strength"));
    /// The [VarHandle] of `cdef_uv_sec_strength` of type `(MemorySegment base, long baseOffset, long index)byte`.
    public static final VarHandle VH_cdef_uv_sec_strength = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cdef_uv_sec_strength"));

    /// Creates `StdVideoAV1CDEF` with the given segment.
    /// @param segment the memory segment
    public StdVideoAV1CDEF(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoAV1CDEF` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1CDEF of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1CDEF(segment); }

    /// Creates `StdVideoAV1CDEF` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1CDEF ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1CDEF(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoAV1CDEF` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoAV1CDEF ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoAV1CDEF(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoAV1CDEF` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoAV1CDEF`
    public static StdVideoAV1CDEF alloc(SegmentAllocator allocator) { return new StdVideoAV1CDEF(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoAV1CDEF` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoAV1CDEF`
    public static StdVideoAV1CDEF alloc(SegmentAllocator allocator, long count) { return new StdVideoAV1CDEF(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `StdVideoAV1CDEF`.
    /// @param index the index of the struct buffer
    /// @return the slice of `StdVideoAV1CDEF`
    public StdVideoAV1CDEF asSlice(long index) { return new StdVideoAV1CDEF(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `StdVideoAV1CDEF`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `StdVideoAV1CDEF`
    public StdVideoAV1CDEF asSlice(long index, long count) { return new StdVideoAV1CDEF(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `cdef_damping_minus_3` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_cdef_damping_minus_3(MemorySegment segment, long index) { return (byte) VH_cdef_damping_minus_3.get(segment, 0L, index); }
    /// {@return `cdef_damping_minus_3`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_cdef_damping_minus_3(MemorySegment segment) { return StdVideoAV1CDEF.get_cdef_damping_minus_3(segment, 0L); }
    /// {@return `cdef_damping_minus_3` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte cdef_damping_minus_3At(long index) { return StdVideoAV1CDEF.get_cdef_damping_minus_3(this.segment(), index); }
    /// {@return `cdef_damping_minus_3`}
    public @CType("uint8_t") byte cdef_damping_minus_3() { return StdVideoAV1CDEF.get_cdef_damping_minus_3(this.segment()); }
    /// Sets `cdef_damping_minus_3` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cdef_damping_minus_3(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_cdef_damping_minus_3.set(segment, 0L, index, value); }
    /// Sets `cdef_damping_minus_3` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cdef_damping_minus_3(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1CDEF.set_cdef_damping_minus_3(segment, 0L, value); }
    /// Sets `cdef_damping_minus_3` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1CDEF cdef_damping_minus_3At(long index, @CType("uint8_t") byte value) { StdVideoAV1CDEF.set_cdef_damping_minus_3(this.segment(), index, value); return this; }
    /// Sets `cdef_damping_minus_3` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1CDEF cdef_damping_minus_3(@CType("uint8_t") byte value) { StdVideoAV1CDEF.set_cdef_damping_minus_3(this.segment(), value); return this; }

    /// {@return `cdef_bits` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t") byte get_cdef_bits(MemorySegment segment, long index) { return (byte) VH_cdef_bits.get(segment, 0L, index); }
    /// {@return `cdef_bits`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t") byte get_cdef_bits(MemorySegment segment) { return StdVideoAV1CDEF.get_cdef_bits(segment, 0L); }
    /// {@return `cdef_bits` at the given index}
    /// @param index the index
    public @CType("uint8_t") byte cdef_bitsAt(long index) { return StdVideoAV1CDEF.get_cdef_bits(this.segment(), index); }
    /// {@return `cdef_bits`}
    public @CType("uint8_t") byte cdef_bits() { return StdVideoAV1CDEF.get_cdef_bits(this.segment()); }
    /// Sets `cdef_bits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cdef_bits(MemorySegment segment, long index, @CType("uint8_t") byte value) { VH_cdef_bits.set(segment, 0L, index, value); }
    /// Sets `cdef_bits` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cdef_bits(MemorySegment segment, @CType("uint8_t") byte value) { StdVideoAV1CDEF.set_cdef_bits(segment, 0L, value); }
    /// Sets `cdef_bits` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1CDEF cdef_bitsAt(long index, @CType("uint8_t") byte value) { StdVideoAV1CDEF.set_cdef_bits(this.segment(), index, value); return this; }
    /// Sets `cdef_bits` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1CDEF cdef_bits(@CType("uint8_t") byte value) { StdVideoAV1CDEF.set_cdef_bits(this.segment(), value); return this; }

    /// {@return `cdef_y_pri_strength` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_cdef_y_pri_strength(MemorySegment segment, long index) { return (byte) VH_cdef_y_pri_strength.get(segment, 0L, index); }
    /// {@return `cdef_y_pri_strength`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_cdef_y_pri_strength(MemorySegment segment) { return StdVideoAV1CDEF.get_cdef_y_pri_strength(segment, 0L); }
    /// {@return `cdef_y_pri_strength` at the given index}
    /// @param index the index
    public @CType("uint8_t [ ]") byte cdef_y_pri_strengthAt(long index) { return StdVideoAV1CDEF.get_cdef_y_pri_strength(this.segment(), index); }
    /// {@return `cdef_y_pri_strength`}
    public @CType("uint8_t [ ]") byte cdef_y_pri_strength() { return StdVideoAV1CDEF.get_cdef_y_pri_strength(this.segment()); }
    /// Sets `cdef_y_pri_strength` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cdef_y_pri_strength(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_cdef_y_pri_strength.set(segment, 0L, index, value); }
    /// Sets `cdef_y_pri_strength` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cdef_y_pri_strength(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoAV1CDEF.set_cdef_y_pri_strength(segment, 0L, value); }
    /// Sets `cdef_y_pri_strength` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1CDEF cdef_y_pri_strengthAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoAV1CDEF.set_cdef_y_pri_strength(this.segment(), index, value); return this; }
    /// Sets `cdef_y_pri_strength` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1CDEF cdef_y_pri_strength(@CType("uint8_t [ ]") byte value) { StdVideoAV1CDEF.set_cdef_y_pri_strength(this.segment(), value); return this; }

    /// {@return `cdef_y_sec_strength` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_cdef_y_sec_strength(MemorySegment segment, long index) { return (byte) VH_cdef_y_sec_strength.get(segment, 0L, index); }
    /// {@return `cdef_y_sec_strength`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_cdef_y_sec_strength(MemorySegment segment) { return StdVideoAV1CDEF.get_cdef_y_sec_strength(segment, 0L); }
    /// {@return `cdef_y_sec_strength` at the given index}
    /// @param index the index
    public @CType("uint8_t [ ]") byte cdef_y_sec_strengthAt(long index) { return StdVideoAV1CDEF.get_cdef_y_sec_strength(this.segment(), index); }
    /// {@return `cdef_y_sec_strength`}
    public @CType("uint8_t [ ]") byte cdef_y_sec_strength() { return StdVideoAV1CDEF.get_cdef_y_sec_strength(this.segment()); }
    /// Sets `cdef_y_sec_strength` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cdef_y_sec_strength(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_cdef_y_sec_strength.set(segment, 0L, index, value); }
    /// Sets `cdef_y_sec_strength` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cdef_y_sec_strength(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoAV1CDEF.set_cdef_y_sec_strength(segment, 0L, value); }
    /// Sets `cdef_y_sec_strength` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1CDEF cdef_y_sec_strengthAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoAV1CDEF.set_cdef_y_sec_strength(this.segment(), index, value); return this; }
    /// Sets `cdef_y_sec_strength` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1CDEF cdef_y_sec_strength(@CType("uint8_t [ ]") byte value) { StdVideoAV1CDEF.set_cdef_y_sec_strength(this.segment(), value); return this; }

    /// {@return `cdef_uv_pri_strength` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_cdef_uv_pri_strength(MemorySegment segment, long index) { return (byte) VH_cdef_uv_pri_strength.get(segment, 0L, index); }
    /// {@return `cdef_uv_pri_strength`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_cdef_uv_pri_strength(MemorySegment segment) { return StdVideoAV1CDEF.get_cdef_uv_pri_strength(segment, 0L); }
    /// {@return `cdef_uv_pri_strength` at the given index}
    /// @param index the index
    public @CType("uint8_t [ ]") byte cdef_uv_pri_strengthAt(long index) { return StdVideoAV1CDEF.get_cdef_uv_pri_strength(this.segment(), index); }
    /// {@return `cdef_uv_pri_strength`}
    public @CType("uint8_t [ ]") byte cdef_uv_pri_strength() { return StdVideoAV1CDEF.get_cdef_uv_pri_strength(this.segment()); }
    /// Sets `cdef_uv_pri_strength` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cdef_uv_pri_strength(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_cdef_uv_pri_strength.set(segment, 0L, index, value); }
    /// Sets `cdef_uv_pri_strength` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cdef_uv_pri_strength(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoAV1CDEF.set_cdef_uv_pri_strength(segment, 0L, value); }
    /// Sets `cdef_uv_pri_strength` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1CDEF cdef_uv_pri_strengthAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoAV1CDEF.set_cdef_uv_pri_strength(this.segment(), index, value); return this; }
    /// Sets `cdef_uv_pri_strength` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1CDEF cdef_uv_pri_strength(@CType("uint8_t [ ]") byte value) { StdVideoAV1CDEF.set_cdef_uv_pri_strength(this.segment(), value); return this; }

    /// {@return `cdef_uv_sec_strength` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t [ ]") byte get_cdef_uv_sec_strength(MemorySegment segment, long index) { return (byte) VH_cdef_uv_sec_strength.get(segment, 0L, index); }
    /// {@return `cdef_uv_sec_strength`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t [ ]") byte get_cdef_uv_sec_strength(MemorySegment segment) { return StdVideoAV1CDEF.get_cdef_uv_sec_strength(segment, 0L); }
    /// {@return `cdef_uv_sec_strength` at the given index}
    /// @param index the index
    public @CType("uint8_t [ ]") byte cdef_uv_sec_strengthAt(long index) { return StdVideoAV1CDEF.get_cdef_uv_sec_strength(this.segment(), index); }
    /// {@return `cdef_uv_sec_strength`}
    public @CType("uint8_t [ ]") byte cdef_uv_sec_strength() { return StdVideoAV1CDEF.get_cdef_uv_sec_strength(this.segment()); }
    /// Sets `cdef_uv_sec_strength` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cdef_uv_sec_strength(MemorySegment segment, long index, @CType("uint8_t [ ]") byte value) { VH_cdef_uv_sec_strength.set(segment, 0L, index, value); }
    /// Sets `cdef_uv_sec_strength` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cdef_uv_sec_strength(MemorySegment segment, @CType("uint8_t [ ]") byte value) { StdVideoAV1CDEF.set_cdef_uv_sec_strength(segment, 0L, value); }
    /// Sets `cdef_uv_sec_strength` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoAV1CDEF cdef_uv_sec_strengthAt(long index, @CType("uint8_t [ ]") byte value) { StdVideoAV1CDEF.set_cdef_uv_sec_strength(this.segment(), index, value); return this; }
    /// Sets `cdef_uv_sec_strength` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoAV1CDEF cdef_uv_sec_strength(@CType("uint8_t [ ]") byte value) { StdVideoAV1CDEF.set_cdef_uv_sec_strength(this.segment(), value); return this; }

}
