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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### width
/// [VarHandle][#VH_width] - [Getter][#width()] - [Setter][#width(int)]
/// ### height
/// [VarHandle][#VH_height] - [Getter][#height()] - [Setter][#height(int)]
/// ### depth
/// [VarHandle][#VH_depth] - [Getter][#depth()] - [Setter][#depth(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkExtent3D {
///     uint32_t width;
///     uint32_t height;
///     uint32_t depth;
/// } VkExtent3D;
/// ```
public sealed class VkExtent3D extends Struct {
    /// The struct layout of `VkExtent3D`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("depth")
    );
    /// The [VarHandle] of `width` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    /// The [VarHandle] of `height` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));
    /// The [VarHandle] of `depth` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depth"));

    /// Creates `VkExtent3D` with the given segment.
    /// @param segment the memory segment
    public VkExtent3D(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExtent3D` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExtent3D of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExtent3D(segment); }

    /// Creates `VkExtent3D` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExtent3D` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExtent3D ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExtent3D(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkExtent3D` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkExtent3D` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExtent3D`
    public static VkExtent3D alloc(SegmentAllocator allocator) { return new VkExtent3D(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExtent3D` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExtent3D`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkExtent3D` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExtent3D`
    public static VkExtent3D allocInit(SegmentAllocator allocator, @CType("uint32_t") int width, @CType("uint32_t") int height, @CType("uint32_t") int depth) { return alloc(allocator).width(width).height(height).depth(depth); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExtent3D copyFrom(VkExtent3D src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `width` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_width(MemorySegment segment, long index) { return (int) VH_width.get(segment, 0L, index); }
    /// {@return `width`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_width(MemorySegment segment) { return VkExtent3D.get_width(segment, 0L); }
    /// {@return `width`}
    public @CType("uint32_t") int width() { return VkExtent3D.get_width(this.segment()); }
    /// Sets `width` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_width(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_width.set(segment, 0L, index, value); }
    /// Sets `width` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_width(MemorySegment segment, @CType("uint32_t") int value) { VkExtent3D.set_width(segment, 0L, value); }
    /// Sets `width` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExtent3D width(@CType("uint32_t") int value) { VkExtent3D.set_width(this.segment(), value); return this; }

    /// {@return `height` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_height(MemorySegment segment, long index) { return (int) VH_height.get(segment, 0L, index); }
    /// {@return `height`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_height(MemorySegment segment) { return VkExtent3D.get_height(segment, 0L); }
    /// {@return `height`}
    public @CType("uint32_t") int height() { return VkExtent3D.get_height(this.segment()); }
    /// Sets `height` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_height(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_height.set(segment, 0L, index, value); }
    /// Sets `height` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_height(MemorySegment segment, @CType("uint32_t") int value) { VkExtent3D.set_height(segment, 0L, value); }
    /// Sets `height` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExtent3D height(@CType("uint32_t") int value) { VkExtent3D.set_height(this.segment(), value); return this; }

    /// {@return `depth` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_depth(MemorySegment segment, long index) { return (int) VH_depth.get(segment, 0L, index); }
    /// {@return `depth`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_depth(MemorySegment segment) { return VkExtent3D.get_depth(segment, 0L); }
    /// {@return `depth`}
    public @CType("uint32_t") int depth() { return VkExtent3D.get_depth(this.segment()); }
    /// Sets `depth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depth(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_depth.set(segment, 0L, index, value); }
    /// Sets `depth` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depth(MemorySegment segment, @CType("uint32_t") int value) { VkExtent3D.set_depth(segment, 0L, value); }
    /// Sets `depth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExtent3D depth(@CType("uint32_t") int value) { VkExtent3D.set_depth(this.segment(), value); return this; }

    /// A buffer of [VkExtent3D].
    public static final class Buffer extends VkExtent3D {
        private final long elementCount;

        /// Creates `VkExtent3D.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkExtent3D`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkExtent3D`
        public VkExtent3D asSlice(long index) { return new VkExtent3D(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkExtent3D`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkExtent3D`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `width` at the given index}
        /// @param index the index
        public @CType("uint32_t") int widthAt(long index) { return VkExtent3D.get_width(this.segment(), index); }
        /// Sets `width` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer widthAt(long index, @CType("uint32_t") int value) { VkExtent3D.set_width(this.segment(), index, value); return this; }

        /// {@return `height` at the given index}
        /// @param index the index
        public @CType("uint32_t") int heightAt(long index) { return VkExtent3D.get_height(this.segment(), index); }
        /// Sets `height` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer heightAt(long index, @CType("uint32_t") int value) { VkExtent3D.set_height(this.segment(), index, value); return this; }

        /// {@return `depth` at the given index}
        /// @param index the index
        public @CType("uint32_t") int depthAt(long index) { return VkExtent3D.get_depth(this.segment(), index); }
        /// Sets `depth` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer depthAt(long index, @CType("uint32_t") int value) { VkExtent3D.set_depth(this.segment(), index, value); return this; }

    }
}
