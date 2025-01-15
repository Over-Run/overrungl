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
/// ### depth
/// [VarHandle][#VH_depth] - [Getter][#depth()] - [Setter][#depth(float)]
/// ### stencil
/// [VarHandle][#VH_stencil] - [Getter][#stencil()] - [Setter][#stencil(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkClearDepthStencilValue {
///     float depth;
///     uint32_t stencil;
/// } VkClearDepthStencilValue;
/// ```
public sealed class VkClearDepthStencilValue extends Struct {
    /// The struct layout of `VkClearDepthStencilValue`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("depth"),
        ValueLayout.JAVA_INT.withName("stencil")
    );
    /// The [VarHandle] of `depth` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depth"));
    /// The [VarHandle] of `stencil` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stencil = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencil"));

    /// Creates `VkClearDepthStencilValue` with the given segment.
    /// @param segment the memory segment
    public VkClearDepthStencilValue(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkClearDepthStencilValue` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearDepthStencilValue of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkClearDepthStencilValue(segment); }

    /// Creates `VkClearDepthStencilValue` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkClearDepthStencilValue` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearDepthStencilValue ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkClearDepthStencilValue(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkClearDepthStencilValue` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkClearDepthStencilValue` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClearDepthStencilValue`
    public static VkClearDepthStencilValue alloc(SegmentAllocator allocator) { return new VkClearDepthStencilValue(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkClearDepthStencilValue` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClearDepthStencilValue`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkClearDepthStencilValue` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClearDepthStencilValue`
    public static VkClearDepthStencilValue allocInit(SegmentAllocator allocator, @CType("float") float depth, @CType("uint32_t") int stencil) { return alloc(allocator).depth(depth).stencil(stencil); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkClearDepthStencilValue copyFrom(VkClearDepthStencilValue src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `depth` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_depth(MemorySegment segment, long index) { return (float) VH_depth.get(segment, 0L, index); }
    /// {@return `depth`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_depth(MemorySegment segment) { return VkClearDepthStencilValue.get_depth(segment, 0L); }
    /// {@return `depth`}
    public @CType("float") float depth() { return VkClearDepthStencilValue.get_depth(this.segment()); }
    /// Sets `depth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depth(MemorySegment segment, long index, @CType("float") float value) { VH_depth.set(segment, 0L, index, value); }
    /// Sets `depth` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depth(MemorySegment segment, @CType("float") float value) { VkClearDepthStencilValue.set_depth(segment, 0L, value); }
    /// Sets `depth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearDepthStencilValue depth(@CType("float") float value) { VkClearDepthStencilValue.set_depth(this.segment(), value); return this; }

    /// {@return `stencil` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_stencil(MemorySegment segment, long index) { return (int) VH_stencil.get(segment, 0L, index); }
    /// {@return `stencil`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_stencil(MemorySegment segment) { return VkClearDepthStencilValue.get_stencil(segment, 0L); }
    /// {@return `stencil`}
    public @CType("uint32_t") int stencil() { return VkClearDepthStencilValue.get_stencil(this.segment()); }
    /// Sets `stencil` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stencil(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_stencil.set(segment, 0L, index, value); }
    /// Sets `stencil` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stencil(MemorySegment segment, @CType("uint32_t") int value) { VkClearDepthStencilValue.set_stencil(segment, 0L, value); }
    /// Sets `stencil` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearDepthStencilValue stencil(@CType("uint32_t") int value) { VkClearDepthStencilValue.set_stencil(this.segment(), value); return this; }

    /// A buffer of [VkClearDepthStencilValue].
    public static final class Buffer extends VkClearDepthStencilValue {
        private final long elementCount;

        /// Creates `VkClearDepthStencilValue.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkClearDepthStencilValue`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkClearDepthStencilValue`
        public VkClearDepthStencilValue asSlice(long index) { return new VkClearDepthStencilValue(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkClearDepthStencilValue`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkClearDepthStencilValue`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `depth` at the given index}
        /// @param index the index
        public @CType("float") float depthAt(long index) { return VkClearDepthStencilValue.get_depth(this.segment(), index); }
        /// Sets `depth` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer depthAt(long index, @CType("float") float value) { VkClearDepthStencilValue.set_depth(this.segment(), index, value); return this; }

        /// {@return `stencil` at the given index}
        /// @param index the index
        public @CType("uint32_t") int stencilAt(long index) { return VkClearDepthStencilValue.get_stencil(this.segment(), index); }
        /// Sets `stencil` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer stencilAt(long index, @CType("uint32_t") int value) { VkClearDepthStencilValue.set_stencil(this.segment(), index, value); return this; }

    }
}
