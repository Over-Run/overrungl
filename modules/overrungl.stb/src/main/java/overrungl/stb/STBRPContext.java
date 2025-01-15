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
/// ### width
/// ### height
/// ### align
/// ### init_mode
/// ### heuristic
/// ### num_nodes
/// ### active_head
/// ### free_head
/// ### extra
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct stbrp_context {
///     int width;
///     int height;
///     int align;
///     int init_mode;
///     int heuristic;
///     int num_nodes;
///     stbrp_node * active_head;
///     stbrp_node * free_head;
///     stbrp_node[2] extra;
/// } STBRPContext;
/// ```
public sealed class STBRPContext extends Struct {
    /// The struct layout of `stbrp_context`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("align"),
        ValueLayout.JAVA_INT.withName("init_mode"),
        ValueLayout.JAVA_INT.withName("heuristic"),
        ValueLayout.JAVA_INT.withName("num_nodes"),
        ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBRPNode.LAYOUT).withName("active_head"),
        ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBRPNode.LAYOUT).withName("free_head"),
        MemoryLayout.sequenceLayout(2, overrungl.stb.STBRPNode.LAYOUT).withName("extra")
    );

    /// Creates `STBRPContext` with the given segment.
    /// @param segment the memory segment
    public STBRPContext(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `STBRPContext` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBRPContext of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBRPContext(segment); }

    /// Creates `STBRPContext` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBRPContext` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBRPContext ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBRPContext(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `STBRPContext` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `STBRPContext` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBRPContext`
    public static STBRPContext alloc(SegmentAllocator allocator) { return new STBRPContext(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBRPContext` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBRPContext`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public STBRPContext copyFrom(STBRPContext src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// A buffer of [STBRPContext].
    public static final class Buffer extends STBRPContext {
        private final long elementCount;

        /// Creates `STBRPContext.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `STBRPContext`.
        /// @param index the index of the struct buffer
        /// @return the slice of `STBRPContext`
        public STBRPContext asSlice(long index) { return new STBRPContext(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `STBRPContext`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `STBRPContext`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    }
}
