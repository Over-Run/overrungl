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
package overrungl.util;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VoidPtr`.
/// ## Layout
/// ```
/// struct VoidPtr {
///     void* value;
/// };
/// ```
public final class VoidPtr extends GroupType {
    /// The struct layout of `VoidPtr`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("value")
    );
    /// The byte offset of `value`.
    public static final long OFFSET_value = LAYOUT.byteOffset(PathElement.groupElement("value"));
    /// The memory layout of `value`.
    public static final MemoryLayout LAYOUT_value = LAYOUT.select(PathElement.groupElement("value"));
    /// The [VarHandle] of `value` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_value = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value"));

    /// Creates `VoidPtr` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VoidPtr(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VoidPtr` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VoidPtr of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VoidPtr(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VoidPtr` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VoidPtr ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VoidPtr(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VoidPtr` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VoidPtr ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VoidPtr(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VoidPtr` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VoidPtr`
    public static VoidPtr alloc(SegmentAllocator allocator) { return new VoidPtr(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VoidPtr` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VoidPtr`
    public static VoidPtr alloc(SegmentAllocator allocator, long count) { return new VoidPtr(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VoidPtr copyFrom(VoidPtr src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VoidPtr reinterpret(long count) { return new VoidPtr(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `value` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment value(MemorySegment segment, long index) { return (MemorySegment) VH_value.get(segment, 0L, index); }
    /// {@return `value`}
    public MemorySegment value() { return value(this.segment(), 0L); }
    /// Sets `value` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void value(MemorySegment segment, long index, MemorySegment value) { VH_value.set(segment, 0L, index, value); }
    /// Sets `value` with the given value.
    /// @param value the value
    /// @return `this`
    public VoidPtr value(MemorySegment value) { value(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VoidPtr`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VoidPtr`
    public VoidPtr asSlice(long index) { return new VoidPtr(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VoidPtr`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VoidPtr`
    public VoidPtr asSlice(long index, long count) { return new VoidPtr(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VoidPtr` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VoidPtr at(long index, Consumer<VoidPtr> func) { func.accept(asSlice(index)); return this; }

    /// {@return `value` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment valueAt(long index) { return value(this.segment(), index); }
    /// Sets `value` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VoidPtr valueAt(long index, MemorySegment value) { value(this.segment(), index, value); return this; }

}
