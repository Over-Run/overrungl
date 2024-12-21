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
/// ### x
/// [VarHandle][#VH_x] - [Getter][#x()] - [Setter][#x(int)]
/// ### y
/// [VarHandle][#VH_y] - [Getter][#y()] - [Setter][#y(int)]
/// ### next
/// [VarHandle][#VH_next] - [Getter][#next()] - [Setter][#next(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct stbrp_node {
///     stbrp_coord x;
///     stbrp_coord y;
///     stbrp_node * next;
/// } STBRPNode;
/// ```
public final class STBRPNode extends Struct {
    /// The struct layout of `stbrp_node`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y"),
        ValueLayout.ADDRESS.withName("next")
    );
    /// The [VarHandle] of `x` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x"));
    /// The [VarHandle] of `y` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y"));
    /// The [VarHandle] of `next` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_next = LAYOUT.arrayElementVarHandle(PathElement.groupElement("next"));

    /// Creates `STBRPNode` with the given segment.
    /// @param segment the memory segment
    public STBRPNode(MemorySegment segment) { super(segment, LAYOUT); }

    /// Allocates a `STBRPNode` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBRPNode`
    public static STBRPNode alloc(SegmentAllocator allocator) { return new STBRPNode(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBRPNode` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBRPNode`
    public static STBRPNode alloc(SegmentAllocator allocator, long count) { return new STBRPNode(allocator.allocate(LAYOUT, count)); }

    /// {@return `x` at the given index}
    /// @param index the index
    public @CType("stbrp_coord") int xAt(long index) { return (int) VH_x.get(this.segment(), 0L, index); }
    /// {@return `x`}
    public @CType("stbrp_coord") int x() { return this.xAt(0L); }
    /// Sets `x` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBRPNode xAt(long index, @CType("stbrp_coord") int value) { VH_x.set(this.segment(), 0L, index, value); return this; }
    /// Sets `x` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPNode x(@CType("stbrp_coord") int value) { return this.xAt(0L, value); }

    /// {@return `y` at the given index}
    /// @param index the index
    public @CType("stbrp_coord") int yAt(long index) { return (int) VH_y.get(this.segment(), 0L, index); }
    /// {@return `y`}
    public @CType("stbrp_coord") int y() { return this.yAt(0L); }
    /// Sets `y` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBRPNode yAt(long index, @CType("stbrp_coord") int value) { VH_y.set(this.segment(), 0L, index, value); return this; }
    /// Sets `y` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPNode y(@CType("stbrp_coord") int value) { return this.yAt(0L, value); }

    /// {@return `next` at the given index}
    /// @param index the index
    public @CType("stbrp_node *") java.lang.foreign.MemorySegment nextAt(long index) { return (java.lang.foreign.MemorySegment) VH_next.get(this.segment(), 0L, index); }
    /// {@return `next`}
    public @CType("stbrp_node *") java.lang.foreign.MemorySegment next() { return this.nextAt(0L); }
    /// Sets `next` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBRPNode nextAt(long index, @CType("stbrp_node *") java.lang.foreign.MemorySegment value) { VH_next.set(this.segment(), 0L, index, value); return this; }
    /// Sets `next` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPNode next(@CType("stbrp_node *") java.lang.foreign.MemorySegment value) { return this.nextAt(0L, value); }

}
