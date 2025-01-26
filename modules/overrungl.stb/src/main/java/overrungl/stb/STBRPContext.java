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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct STBRPContext {
///     int width;
///     int height;
///     int align;
///     int init_mode;
///     int heuristic;
///     int num_nodes;
///     stbrp_node* active_head;
///     stbrp_node* free_head;
///     (struct STBRPNode) stbrp_node extra[2];
/// };
/// ```
public sealed class STBRPContext extends GroupType {
    /// The struct layout of `STBRPContext`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("align"),
        ValueLayout.JAVA_INT.withName("init_mode"),
        ValueLayout.JAVA_INT.withName("heuristic"),
        ValueLayout.JAVA_INT.withName("num_nodes"),
        ValueLayout.ADDRESS.withName("active_head"),
        ValueLayout.ADDRESS.withName("free_head"),
        MemoryLayout.sequenceLayout(2L, STBRPNode.LAYOUT).withName("extra")
    );
    /// The byte offset of `width`.
    public static final long OFFSET_width = LAYOUT.byteOffset(PathElement.groupElement("width"));
    /// The memory layout of `width`.
    public static final MemoryLayout LAYOUT_width = LAYOUT.select(PathElement.groupElement("width"));
    /// The [VarHandle] of `width` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    /// The byte offset of `height`.
    public static final long OFFSET_height = LAYOUT.byteOffset(PathElement.groupElement("height"));
    /// The memory layout of `height`.
    public static final MemoryLayout LAYOUT_height = LAYOUT.select(PathElement.groupElement("height"));
    /// The [VarHandle] of `height` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));
    /// The byte offset of `align`.
    public static final long OFFSET_align = LAYOUT.byteOffset(PathElement.groupElement("align"));
    /// The memory layout of `align`.
    public static final MemoryLayout LAYOUT_align = LAYOUT.select(PathElement.groupElement("align"));
    /// The [VarHandle] of `align` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_align = LAYOUT.arrayElementVarHandle(PathElement.groupElement("align"));
    /// The byte offset of `init_mode`.
    public static final long OFFSET_init_mode = LAYOUT.byteOffset(PathElement.groupElement("init_mode"));
    /// The memory layout of `init_mode`.
    public static final MemoryLayout LAYOUT_init_mode = LAYOUT.select(PathElement.groupElement("init_mode"));
    /// The [VarHandle] of `init_mode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_init_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("init_mode"));
    /// The byte offset of `heuristic`.
    public static final long OFFSET_heuristic = LAYOUT.byteOffset(PathElement.groupElement("heuristic"));
    /// The memory layout of `heuristic`.
    public static final MemoryLayout LAYOUT_heuristic = LAYOUT.select(PathElement.groupElement("heuristic"));
    /// The [VarHandle] of `heuristic` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_heuristic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("heuristic"));
    /// The byte offset of `num_nodes`.
    public static final long OFFSET_num_nodes = LAYOUT.byteOffset(PathElement.groupElement("num_nodes"));
    /// The memory layout of `num_nodes`.
    public static final MemoryLayout LAYOUT_num_nodes = LAYOUT.select(PathElement.groupElement("num_nodes"));
    /// The [VarHandle] of `num_nodes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_num_nodes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("num_nodes"));
    /// The byte offset of `active_head`.
    public static final long OFFSET_active_head = LAYOUT.byteOffset(PathElement.groupElement("active_head"));
    /// The memory layout of `active_head`.
    public static final MemoryLayout LAYOUT_active_head = LAYOUT.select(PathElement.groupElement("active_head"));
    /// The [VarHandle] of `active_head` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_active_head = LAYOUT.arrayElementVarHandle(PathElement.groupElement("active_head"));
    /// The byte offset of `free_head`.
    public static final long OFFSET_free_head = LAYOUT.byteOffset(PathElement.groupElement("free_head"));
    /// The memory layout of `free_head`.
    public static final MemoryLayout LAYOUT_free_head = LAYOUT.select(PathElement.groupElement("free_head"));
    /// The [VarHandle] of `free_head` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_free_head = LAYOUT.arrayElementVarHandle(PathElement.groupElement("free_head"));
    /// The byte offset of `extra`.
    public static final long OFFSET_extra = LAYOUT.byteOffset(PathElement.groupElement("extra"));
    /// The memory layout of `extra`.
    public static final MemoryLayout LAYOUT_extra = LAYOUT.select(PathElement.groupElement("extra"));

    /// Creates `STBRPContext` with the given segment.
    /// @param segment the memory segment
    public STBRPContext(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `STBRPContext` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBRPContext` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBRPContext ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBRPContext(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `STBRPContext` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

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
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `width` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int width(MemorySegment segment, long index) { return (int) VH_width.get(segment, 0L, index); }
    /// {@return `width`}
    public int width() { return width(this.segment(), 0L); }
    /// Sets `width` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void width(MemorySegment segment, long index, int value) { VH_width.set(segment, 0L, index, value); }
    /// Sets `width` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPContext width(int value) { width(this.segment(), 0L, value); return this; }

    /// {@return `height` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int height(MemorySegment segment, long index) { return (int) VH_height.get(segment, 0L, index); }
    /// {@return `height`}
    public int height() { return height(this.segment(), 0L); }
    /// Sets `height` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void height(MemorySegment segment, long index, int value) { VH_height.set(segment, 0L, index, value); }
    /// Sets `height` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPContext height(int value) { height(this.segment(), 0L, value); return this; }

    /// {@return `align` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int align(MemorySegment segment, long index) { return (int) VH_align.get(segment, 0L, index); }
    /// {@return `align`}
    public int align() { return align(this.segment(), 0L); }
    /// Sets `align` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void align(MemorySegment segment, long index, int value) { VH_align.set(segment, 0L, index, value); }
    /// Sets `align` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPContext align(int value) { align(this.segment(), 0L, value); return this; }

    /// {@return `init_mode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int init_mode(MemorySegment segment, long index) { return (int) VH_init_mode.get(segment, 0L, index); }
    /// {@return `init_mode`}
    public int init_mode() { return init_mode(this.segment(), 0L); }
    /// Sets `init_mode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void init_mode(MemorySegment segment, long index, int value) { VH_init_mode.set(segment, 0L, index, value); }
    /// Sets `init_mode` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPContext init_mode(int value) { init_mode(this.segment(), 0L, value); return this; }

    /// {@return `heuristic` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int heuristic(MemorySegment segment, long index) { return (int) VH_heuristic.get(segment, 0L, index); }
    /// {@return `heuristic`}
    public int heuristic() { return heuristic(this.segment(), 0L); }
    /// Sets `heuristic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void heuristic(MemorySegment segment, long index, int value) { VH_heuristic.set(segment, 0L, index, value); }
    /// Sets `heuristic` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPContext heuristic(int value) { heuristic(this.segment(), 0L, value); return this; }

    /// {@return `num_nodes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int num_nodes(MemorySegment segment, long index) { return (int) VH_num_nodes.get(segment, 0L, index); }
    /// {@return `num_nodes`}
    public int num_nodes() { return num_nodes(this.segment(), 0L); }
    /// Sets `num_nodes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void num_nodes(MemorySegment segment, long index, int value) { VH_num_nodes.set(segment, 0L, index, value); }
    /// Sets `num_nodes` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPContext num_nodes(int value) { num_nodes(this.segment(), 0L, value); return this; }

    /// {@return `active_head` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment active_head(MemorySegment segment, long index) { return (MemorySegment) VH_active_head.get(segment, 0L, index); }
    /// {@return `active_head`}
    public MemorySegment active_head() { return active_head(this.segment(), 0L); }
    /// Sets `active_head` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void active_head(MemorySegment segment, long index, MemorySegment value) { VH_active_head.set(segment, 0L, index, value); }
    /// Sets `active_head` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPContext active_head(MemorySegment value) { active_head(this.segment(), 0L, value); return this; }

    /// {@return `free_head` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment free_head(MemorySegment segment, long index) { return (MemorySegment) VH_free_head.get(segment, 0L, index); }
    /// {@return `free_head`}
    public MemorySegment free_head() { return free_head(this.segment(), 0L); }
    /// Sets `free_head` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void free_head(MemorySegment segment, long index, MemorySegment value) { VH_free_head.set(segment, 0L, index, value); }
    /// Sets `free_head` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPContext free_head(MemorySegment value) { free_head(this.segment(), 0L, value); return this; }

    /// {@return `extra` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment extra(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_extra, index), LAYOUT_extra); }
    /// {@return `extra`}
    public MemorySegment extra() { return extra(this.segment(), 0L); }
    /// Sets `extra` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extra(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_extra, index), LAYOUT_extra.byteSize()); }
    /// Sets `extra` with the given value.
    /// @param value the value
    /// @return `this`
    public STBRPContext extra(MemorySegment value) { extra(this.segment(), 0L, value); return this; }

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

        /// {@return `width` at the given index}
        /// @param index the index of the struct buffer
        public int widthAt(long index) { return width(this.segment(), index); }
        /// Sets `width` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer widthAt(long index, int value) { width(this.segment(), index, value); return this; }

        /// {@return `height` at the given index}
        /// @param index the index of the struct buffer
        public int heightAt(long index) { return height(this.segment(), index); }
        /// Sets `height` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer heightAt(long index, int value) { height(this.segment(), index, value); return this; }

        /// {@return `align` at the given index}
        /// @param index the index of the struct buffer
        public int alignAt(long index) { return align(this.segment(), index); }
        /// Sets `align` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer alignAt(long index, int value) { align(this.segment(), index, value); return this; }

        /// {@return `init_mode` at the given index}
        /// @param index the index of the struct buffer
        public int init_modeAt(long index) { return init_mode(this.segment(), index); }
        /// Sets `init_mode` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer init_modeAt(long index, int value) { init_mode(this.segment(), index, value); return this; }

        /// {@return `heuristic` at the given index}
        /// @param index the index of the struct buffer
        public int heuristicAt(long index) { return heuristic(this.segment(), index); }
        /// Sets `heuristic` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer heuristicAt(long index, int value) { heuristic(this.segment(), index, value); return this; }

        /// {@return `num_nodes` at the given index}
        /// @param index the index of the struct buffer
        public int num_nodesAt(long index) { return num_nodes(this.segment(), index); }
        /// Sets `num_nodes` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer num_nodesAt(long index, int value) { num_nodes(this.segment(), index, value); return this; }

        /// {@return `active_head` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment active_headAt(long index) { return active_head(this.segment(), index); }
        /// Sets `active_head` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer active_headAt(long index, MemorySegment value) { active_head(this.segment(), index, value); return this; }

        /// {@return `free_head` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment free_headAt(long index) { return free_head(this.segment(), index); }
        /// Sets `free_head` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer free_headAt(long index, MemorySegment value) { free_head(this.segment(), index, value); return this; }

        /// {@return `extra` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment extraAt(long index) { return extra(this.segment(), index); }
        /// Sets `extra` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer extraAt(long index, MemorySegment value) { extra(this.segment(), index, value); return this; }

    }
}
