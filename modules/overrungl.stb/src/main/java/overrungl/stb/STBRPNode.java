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
/// ### x
/// ### y
/// ### next
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct stbrp_node {
///     stbrp_coord x;
///     stbrp_coord y;
///     stbrp_node * next;
/// } STBRPNode;
/// ```
public sealed class STBRPNode extends Struct {
    /// The struct layout of `stbrp_node`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y"),
        ValueLayout.ADDRESS.withName("next")
    );

    /// Creates `STBRPNode` with the given segment.
    /// @param segment the memory segment
    public STBRPNode(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `STBRPNode` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBRPNode of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBRPNode(segment); }

    /// Creates `STBRPNode` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBRPNode` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBRPNode ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBRPNode(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `STBRPNode` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `STBRPNode` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBRPNode`
    public static STBRPNode alloc(SegmentAllocator allocator) { return new STBRPNode(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBRPNode` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBRPNode`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public STBRPNode copyFrom(STBRPNode src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// A buffer of [STBRPNode].
    public static final class Buffer extends STBRPNode {
        private final long elementCount;

        /// Creates `STBRPNode.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `STBRPNode`.
        /// @param index the index of the struct buffer
        /// @return the slice of `STBRPNode`
        public STBRPNode asSlice(long index) { return new STBRPNode(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `STBRPNode`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `STBRPNode`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    }
}
