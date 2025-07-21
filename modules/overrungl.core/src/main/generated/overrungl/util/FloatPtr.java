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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct FloatPtr {
///     jfloat value;
/// };
/// ```
public final class FloatPtr extends GroupType {
    /// The struct layout of `FloatPtr`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("value")
    );
    /// The byte offset of `value`.
    public static final long OFFSET_value = LAYOUT.byteOffset(PathElement.groupElement("value"));
    /// The memory layout of `value`.
    public static final MemoryLayout LAYOUT_value = LAYOUT.select(PathElement.groupElement("value"));
    /// The [VarHandle] of `value` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_value = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value"));

    /// Creates `FloatPtr` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public FloatPtr(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `FloatPtr` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static FloatPtr of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new FloatPtr(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `FloatPtr` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static FloatPtr ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new FloatPtr(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `FloatPtr` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static FloatPtr ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new FloatPtr(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `FloatPtr` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `FloatPtr`
    public static FloatPtr alloc(SegmentAllocator allocator) { return new FloatPtr(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `FloatPtr` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `FloatPtr`
    public static FloatPtr alloc(SegmentAllocator allocator, long count) { return new FloatPtr(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `FloatPtr` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param value `value`
    /// @return the allocated `FloatPtr`
    public static FloatPtr allocInit(SegmentAllocator allocator, float value) {
        return alloc(allocator).value(value);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public FloatPtr copyFrom(FloatPtr src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public FloatPtr reinterpret(long count) { return new FloatPtr(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `value` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float value(MemorySegment segment, long index) { return (float) VH_value.get(segment, 0L, index); }
    /// {@return `value`}
    public float value() { return value(this.segment(), 0L); }
    /// Sets `value` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void value(MemorySegment segment, long index, float value) { VH_value.set(segment, 0L, index, value); }
    /// Sets `value` with the given value.
    /// @param value the value
    /// @return `this`
    public FloatPtr value(float value) { value(this.segment(), 0L, value); return this; }

    /// Creates a slice of `FloatPtr`.
    /// @param index the index of the struct buffer
    /// @return the slice of `FloatPtr`
    public FloatPtr asSlice(long index) { return new FloatPtr(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `FloatPtr`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `FloatPtr`
    public FloatPtr asSlice(long index, long count) { return new FloatPtr(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `FloatPtr` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public FloatPtr at(long index, Consumer<FloatPtr> func) { func.accept(asSlice(index)); return this; }

    /// {@return `value` at the given index}
    /// @param index the index of the struct buffer
    public float valueAt(long index) { return value(this.segment(), index); }
    /// Sets `value` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public FloatPtr valueAt(long index, float value) { value(this.segment(), index, value); return this; }

}
