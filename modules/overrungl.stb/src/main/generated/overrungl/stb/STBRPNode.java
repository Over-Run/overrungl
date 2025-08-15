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
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `STBRPNode`.
/// ## Layout
/// ```
/// struct STBRPNode {
///     (int) stbrp_coord x;
///     (int) stbrp_coord y;
///     stbrp_node* next;
/// };
/// ```
public final class STBRPNode extends GroupType {
    /// The struct layout of `STBRPNode`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y"),
        ValueLayout.ADDRESS.withName("next")
    );
    /// The byte offset of `x`.
    public static final long OFFSET_x = LAYOUT.byteOffset(PathElement.groupElement("x"));
    /// The memory layout of `x`.
    public static final MemoryLayout LAYOUT_x = LAYOUT.select(PathElement.groupElement("x"));
    /// The [VarHandle] of `x` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x"));
    /// The byte offset of `y`.
    public static final long OFFSET_y = LAYOUT.byteOffset(PathElement.groupElement("y"));
    /// The memory layout of `y`.
    public static final MemoryLayout LAYOUT_y = LAYOUT.select(PathElement.groupElement("y"));
    /// The [VarHandle] of `y` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y"));
    /// The byte offset of `next`.
    public static final long OFFSET_next = LAYOUT.byteOffset(PathElement.groupElement("next"));
    /// The memory layout of `next`.
    public static final MemoryLayout LAYOUT_next = LAYOUT.select(PathElement.groupElement("next"));
    /// The [VarHandle] of `next` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_next = LAYOUT.arrayElementVarHandle(PathElement.groupElement("next"));

    /// Creates `STBRPNode` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public STBRPNode(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `STBRPNode` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBRPNode of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBRPNode(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBRPNode` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBRPNode ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBRPNode(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `STBRPNode` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBRPNode ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new STBRPNode(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `STBRPNode` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBRPNode`
    public static STBRPNode alloc(SegmentAllocator allocator) { return new STBRPNode(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `STBRPNode` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBRPNode`
    public static STBRPNode alloc(SegmentAllocator allocator, long count) { return new STBRPNode(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public STBRPNode copyFrom(STBRPNode src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public STBRPNode reinterpret(long count) { return new STBRPNode(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `x` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int x(MemorySegment segment, long index) { return (int) VH_x.get(segment, 0L, index); }
    /// {@return `x`}
    public int x() { return x(this.segment(), 0L); }
    /// Sets `x` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void x(MemorySegment segment, long index, int value) { VH_x.set(segment, 0L, index, value); }
    /// Sets `x` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPNode x(int value) { x(this.segment(), 0L, value); return this; }

    /// {@return `y` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int y(MemorySegment segment, long index) { return (int) VH_y.get(segment, 0L, index); }
    /// {@return `y`}
    public int y() { return y(this.segment(), 0L); }
    /// Sets `y` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void y(MemorySegment segment, long index, int value) { VH_y.set(segment, 0L, index, value); }
    /// Sets `y` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPNode y(int value) { y(this.segment(), 0L, value); return this; }

    /// {@return `next` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment next(MemorySegment segment, long index) { return (MemorySegment) VH_next.get(segment, 0L, index); }
    /// {@return `next`}
    public MemorySegment next() { return next(this.segment(), 0L); }
    /// Sets `next` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void next(MemorySegment segment, long index, MemorySegment value) { VH_next.set(segment, 0L, index, value); }
    /// Sets `next` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPNode next(MemorySegment value) { next(this.segment(), 0L, value); return this; }

    /// Creates a slice of `STBRPNode`.
    /// @param index the index of the struct buffer
    /// @return the slice of `STBRPNode`
    public STBRPNode asSlice(long index) { return new STBRPNode(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `STBRPNode`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `STBRPNode`
    public STBRPNode asSlice(long index, long count) { return new STBRPNode(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `STBRPNode` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public STBRPNode at(long index, Consumer<STBRPNode> func) { func.accept(asSlice(index)); return this; }

    /// {@return `x` at the given index}
    /// @param index the index of the struct buffer
    public int xAt(long index) { return x(this.segment(), index); }
    /// Sets `x` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBRPNode xAt(long index, int value) { x(this.segment(), index, value); return this; }

    /// {@return `y` at the given index}
    /// @param index the index of the struct buffer
    public int yAt(long index) { return y(this.segment(), index); }
    /// Sets `y` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBRPNode yAt(long index, int value) { y(this.segment(), index, value); return this; }

    /// {@return `next` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment nextAt(long index) { return next(this.segment(), index); }
    /// Sets `next` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBRPNode nextAt(long index, MemorySegment value) { next(this.segment(), index, value); return this; }

}
