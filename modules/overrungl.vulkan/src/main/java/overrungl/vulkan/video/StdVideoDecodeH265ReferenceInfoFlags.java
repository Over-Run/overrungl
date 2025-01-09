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
/// ### used_for_long_term_reference
/// [VarHandle][#VH_used_for_long_term_reference] - [Getter][#used_for_long_term_reference()] - [Setter][#used_for_long_term_reference(int)]
/// ### unused_for_reference
/// [VarHandle][#VH_unused_for_reference] - [Getter][#unused_for_reference()] - [Setter][#unused_for_reference(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct StdVideoDecodeH265ReferenceInfoFlags {
///     uint32_t : 1 used_for_long_term_reference;
///     uint32_t : 1 unused_for_reference;
/// } StdVideoDecodeH265ReferenceInfoFlags;
/// ```
public final class StdVideoDecodeH265ReferenceInfoFlags extends Struct {
    /// The struct layout of `StdVideoDecodeH265ReferenceInfoFlags`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("used_for_long_term_reference"),
        ValueLayout.JAVA_INT.withName("unused_for_reference")
    );
    /// The [VarHandle] of `used_for_long_term_reference` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_used_for_long_term_reference = LAYOUT.arrayElementVarHandle(PathElement.groupElement("used_for_long_term_reference"));
    /// The [VarHandle] of `unused_for_reference` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_unused_for_reference = LAYOUT.arrayElementVarHandle(PathElement.groupElement("unused_for_reference"));

    /// Creates `StdVideoDecodeH265ReferenceInfoFlags` with the given segment.
    /// @param segment the memory segment
    public StdVideoDecodeH265ReferenceInfoFlags(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `StdVideoDecodeH265ReferenceInfoFlags` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH265ReferenceInfoFlags of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeH265ReferenceInfoFlags(segment); }

    /// Creates `StdVideoDecodeH265ReferenceInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH265ReferenceInfoFlags ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeH265ReferenceInfoFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `StdVideoDecodeH265ReferenceInfoFlags` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static StdVideoDecodeH265ReferenceInfoFlags ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new StdVideoDecodeH265ReferenceInfoFlags(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `StdVideoDecodeH265ReferenceInfoFlags` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `StdVideoDecodeH265ReferenceInfoFlags`
    public static StdVideoDecodeH265ReferenceInfoFlags alloc(SegmentAllocator allocator) { return new StdVideoDecodeH265ReferenceInfoFlags(allocator.allocate(LAYOUT)); }

    /// Allocates a `StdVideoDecodeH265ReferenceInfoFlags` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `StdVideoDecodeH265ReferenceInfoFlags`
    public static StdVideoDecodeH265ReferenceInfoFlags alloc(SegmentAllocator allocator, long count) { return new StdVideoDecodeH265ReferenceInfoFlags(allocator.allocate(LAYOUT, count)); }

    /// {@return `used_for_long_term_reference` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_used_for_long_term_reference(MemorySegment segment, long index) { return (int) VH_used_for_long_term_reference.get(segment, 0L, index); }
    /// {@return `used_for_long_term_reference`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_used_for_long_term_reference(MemorySegment segment) { return StdVideoDecodeH265ReferenceInfoFlags.get_used_for_long_term_reference(segment, 0L); }
    /// {@return `used_for_long_term_reference` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int used_for_long_term_referenceAt(long index) { return StdVideoDecodeH265ReferenceInfoFlags.get_used_for_long_term_reference(this.segment(), index); }
    /// {@return `used_for_long_term_reference`}
    public @CType("uint32_t : 1") int used_for_long_term_reference() { return StdVideoDecodeH265ReferenceInfoFlags.get_used_for_long_term_reference(this.segment()); }
    /// Sets `used_for_long_term_reference` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_used_for_long_term_reference(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_used_for_long_term_reference.set(segment, 0L, index, value); }
    /// Sets `used_for_long_term_reference` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_used_for_long_term_reference(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeH265ReferenceInfoFlags.set_used_for_long_term_reference(segment, 0L, value); }
    /// Sets `used_for_long_term_reference` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265ReferenceInfoFlags used_for_long_term_referenceAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeH265ReferenceInfoFlags.set_used_for_long_term_reference(this.segment(), index, value); return this; }
    /// Sets `used_for_long_term_reference` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265ReferenceInfoFlags used_for_long_term_reference(@CType("uint32_t : 1") int value) { StdVideoDecodeH265ReferenceInfoFlags.set_used_for_long_term_reference(this.segment(), value); return this; }

    /// {@return `unused_for_reference` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t : 1") int get_unused_for_reference(MemorySegment segment, long index) { return (int) VH_unused_for_reference.get(segment, 0L, index); }
    /// {@return `unused_for_reference`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t : 1") int get_unused_for_reference(MemorySegment segment) { return StdVideoDecodeH265ReferenceInfoFlags.get_unused_for_reference(segment, 0L); }
    /// {@return `unused_for_reference` at the given index}
    /// @param index the index
    public @CType("uint32_t : 1") int unused_for_referenceAt(long index) { return StdVideoDecodeH265ReferenceInfoFlags.get_unused_for_reference(this.segment(), index); }
    /// {@return `unused_for_reference`}
    public @CType("uint32_t : 1") int unused_for_reference() { return StdVideoDecodeH265ReferenceInfoFlags.get_unused_for_reference(this.segment()); }
    /// Sets `unused_for_reference` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_unused_for_reference(MemorySegment segment, long index, @CType("uint32_t : 1") int value) { VH_unused_for_reference.set(segment, 0L, index, value); }
    /// Sets `unused_for_reference` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_unused_for_reference(MemorySegment segment, @CType("uint32_t : 1") int value) { StdVideoDecodeH265ReferenceInfoFlags.set_unused_for_reference(segment, 0L, value); }
    /// Sets `unused_for_reference` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265ReferenceInfoFlags unused_for_referenceAt(long index, @CType("uint32_t : 1") int value) { StdVideoDecodeH265ReferenceInfoFlags.set_unused_for_reference(this.segment(), index, value); return this; }
    /// Sets `unused_for_reference` with the given value.
    /// @param value the value
    /// @return `this`
    public StdVideoDecodeH265ReferenceInfoFlags unused_for_reference(@CType("uint32_t : 1") int value) { StdVideoDecodeH265ReferenceInfoFlags.set_unused_for_reference(this.segment(), value); return this; }

}
