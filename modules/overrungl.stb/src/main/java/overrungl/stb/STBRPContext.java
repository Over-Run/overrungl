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
/// [VarHandle][#VH_width] - [Getter][#width()] - [Setter][#width(int)]
/// ### height
/// [VarHandle][#VH_height] - [Getter][#height()] - [Setter][#height(int)]
/// ### align
/// [VarHandle][#VH_align] - [Getter][#align()] - [Setter][#align(int)]
/// ### init_mode
/// [VarHandle][#VH_init_mode] - [Getter][#init_mode()] - [Setter][#init_mode(int)]
/// ### heuristic
/// [VarHandle][#VH_heuristic] - [Getter][#heuristic()] - [Setter][#heuristic(int)]
/// ### num_nodes
/// [VarHandle][#VH_num_nodes] - [Getter][#num_nodes()] - [Setter][#num_nodes(int)]
/// ### active_head
/// [VarHandle][#VH_active_head] - [Getter][#active_head()] - [Setter][#active_head(java.lang.foreign.MemorySegment)]
/// ### free_head
/// [VarHandle][#VH_free_head] - [Getter][#free_head()] - [Setter][#free_head(java.lang.foreign.MemorySegment)]
/// ### extra
/// TODO [Byte offset handle][#MH_extra] - [Memory layout][#ML_extra] - Getter - Setter
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
    /// The [VarHandle] of `width` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    /// The [VarHandle] of `height` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));
    /// The [VarHandle] of `align` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_align = LAYOUT.arrayElementVarHandle(PathElement.groupElement("align"));
    /// The [VarHandle] of `init_mode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_init_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("init_mode"));
    /// The [VarHandle] of `heuristic` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_heuristic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("heuristic"));
    /// The [VarHandle] of `num_nodes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_num_nodes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_nodes"));
    /// The [VarHandle] of `active_head` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_active_head = LAYOUT.arrayElementVarHandle(PathElement.groupElement("active_head"));
    /// The [VarHandle] of `free_head` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_free_head = LAYOUT.arrayElementVarHandle(PathElement.groupElement("free_head"));
    /// The byte offset handle of `extra` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_extra = LAYOUT.byteOffsetHandle(PathElement.sequenceElement(), PathElement.groupElement("extra"));
    /// The memory layout of `extra`.
    public static final MemoryLayout ML_extra = LAYOUT.select(PathElement.groupElement("extra"));

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

    /// {@return `width` at the given index}
    /// @param index the index
    public @CType("int") int widthAt(long index) { return (int) VH_width.get(this.segment(), 0L, index); }
    /// {@return `width`}
    public @CType("int") int width() { return this.widthAt(0L); }
    /// Sets `width` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBRPContext widthAt(long index, @CType("int") int value) { VH_width.set(this.segment(), 0L, index, value); return this; }
    /// Sets `width` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPContext width(@CType("int") int value) { return this.widthAt(0L, value); }

    /// {@return `height` at the given index}
    /// @param index the index
    public @CType("int") int heightAt(long index) { return (int) VH_height.get(this.segment(), 0L, index); }
    /// {@return `height`}
    public @CType("int") int height() { return this.heightAt(0L); }
    /// Sets `height` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBRPContext heightAt(long index, @CType("int") int value) { VH_height.set(this.segment(), 0L, index, value); return this; }
    /// Sets `height` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPContext height(@CType("int") int value) { return this.heightAt(0L, value); }

    /// {@return `align` at the given index}
    /// @param index the index
    public @CType("int") int alignAt(long index) { return (int) VH_align.get(this.segment(), 0L, index); }
    /// {@return `align`}
    public @CType("int") int align() { return this.alignAt(0L); }
    /// Sets `align` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBRPContext alignAt(long index, @CType("int") int value) { VH_align.set(this.segment(), 0L, index, value); return this; }
    /// Sets `align` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPContext align(@CType("int") int value) { return this.alignAt(0L, value); }

    /// {@return `init_mode` at the given index}
    /// @param index the index
    public @CType("int") int init_modeAt(long index) { return (int) VH_init_mode.get(this.segment(), 0L, index); }
    /// {@return `init_mode`}
    public @CType("int") int init_mode() { return this.init_modeAt(0L); }
    /// Sets `init_mode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBRPContext init_modeAt(long index, @CType("int") int value) { VH_init_mode.set(this.segment(), 0L, index, value); return this; }
    /// Sets `init_mode` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPContext init_mode(@CType("int") int value) { return this.init_modeAt(0L, value); }

    /// {@return `heuristic` at the given index}
    /// @param index the index
    public @CType("int") int heuristicAt(long index) { return (int) VH_heuristic.get(this.segment(), 0L, index); }
    /// {@return `heuristic`}
    public @CType("int") int heuristic() { return this.heuristicAt(0L); }
    /// Sets `heuristic` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBRPContext heuristicAt(long index, @CType("int") int value) { VH_heuristic.set(this.segment(), 0L, index, value); return this; }
    /// Sets `heuristic` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPContext heuristic(@CType("int") int value) { return this.heuristicAt(0L, value); }

    /// {@return `num_nodes` at the given index}
    /// @param index the index
    public @CType("int") int num_nodesAt(long index) { return (int) VH_num_nodes.get(this.segment(), 0L, index); }
    /// {@return `num_nodes`}
    public @CType("int") int num_nodes() { return this.num_nodesAt(0L); }
    /// Sets `num_nodes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBRPContext num_nodesAt(long index, @CType("int") int value) { VH_num_nodes.set(this.segment(), 0L, index, value); return this; }
    /// Sets `num_nodes` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPContext num_nodes(@CType("int") int value) { return this.num_nodesAt(0L, value); }

    /// {@return `active_head` at the given index}
    /// @param index the index
    public @CType("stbrp_node *") java.lang.foreign.MemorySegment active_headAt(long index) { return (java.lang.foreign.MemorySegment) VH_active_head.get(this.segment(), 0L, index); }
    /// {@return `active_head`}
    public @CType("stbrp_node *") java.lang.foreign.MemorySegment active_head() { return this.active_headAt(0L); }
    /// Sets `active_head` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBRPContext active_headAt(long index, @CType("stbrp_node *") java.lang.foreign.MemorySegment value) { VH_active_head.set(this.segment(), 0L, index, value); return this; }
    /// Sets `active_head` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPContext active_head(@CType("stbrp_node *") java.lang.foreign.MemorySegment value) { return this.active_headAt(0L, value); }

    /// {@return `free_head` at the given index}
    /// @param index the index
    public @CType("stbrp_node *") java.lang.foreign.MemorySegment free_headAt(long index) { return (java.lang.foreign.MemorySegment) VH_free_head.get(this.segment(), 0L, index); }
    /// {@return `free_head`}
    public @CType("stbrp_node *") java.lang.foreign.MemorySegment free_head() { return this.free_headAt(0L); }
    /// Sets `free_head` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBRPContext free_headAt(long index, @CType("stbrp_node *") java.lang.foreign.MemorySegment value) { VH_free_head.set(this.segment(), 0L, index, value); return this; }
    /// Sets `free_head` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPContext free_head(@CType("stbrp_node *") java.lang.foreign.MemorySegment value) { return this.free_headAt(0L, value); }

    /// {@return `extra` at the given index}
    /// @param index the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("stbrp_node[2]") java.lang.foreign.MemorySegment extraAt(long index, long elementIndex) {
        try { return this.segment().asSlice(LAYOUT.scale((long) MH_extra.invokeExact(0L, elementIndex), index), ML_extra); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `extra`}
    public @CType("stbrp_node[2]") java.lang.foreign.MemorySegment extraAt(long elementIndex) { return this.extraAt(0L, elementIndex); }
    /// Sets `extra` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value the value
    /// @return `this`
    public STBRPContext extraAt(long index, long elementIndex, @CType("stbrp_node[2]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, this.segment(), LAYOUT.scale((long) MH_extra.invokeExact(0L, elementIndex), index), ML_extra.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
        return this;
    }
    /// Sets `extra` with the given value.
    /// @param elementIndex the index of the element
    /// @param value the value
    /// @return `this`
    public STBRPContext extra(long elementIndex, @CType("stbrp_node[2]") java.lang.foreign.MemorySegment value) { return this.extraAt(0L, elementIndex, value); }

}
