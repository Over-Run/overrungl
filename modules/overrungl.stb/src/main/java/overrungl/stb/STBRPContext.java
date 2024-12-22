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

/// the details of the following structures don't matter to you, but they must
/// be visible so you can handle the memory allocations for them
///
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
///
/// we allocate two extra nodes so optimal user-node-count is 'width' not 'width+2'
///
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
public final class STBRPContext extends Struct {
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
        MemoryLayout.sequenceLayout(2L, overrungl.stb.STBRPNode.LAYOUT).withName("extra")
    );

    /// Creates `STBRPContext` with the given segment.
    /// @param segment the memory segment
    public STBRPContext(MemorySegment segment) { super(segment, LAYOUT); }

    /// Allocates a `STBRPContext` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBRPContext`
    public static STBRPContext alloc(SegmentAllocator allocator) { return new STBRPContext(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBRPContext` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBRPContext`
    public static STBRPContext alloc(SegmentAllocator allocator, long count) { return new STBRPContext(allocator.allocate(LAYOUT, count)); }

}
