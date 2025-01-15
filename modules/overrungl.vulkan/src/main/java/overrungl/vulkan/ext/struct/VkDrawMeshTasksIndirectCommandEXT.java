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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### groupCountX
/// [VarHandle][#VH_groupCountX] - [Getter][#groupCountX()] - [Setter][#groupCountX(int)]
/// ### groupCountY
/// [VarHandle][#VH_groupCountY] - [Getter][#groupCountY()] - [Setter][#groupCountY(int)]
/// ### groupCountZ
/// [VarHandle][#VH_groupCountZ] - [Getter][#groupCountZ()] - [Setter][#groupCountZ(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDrawMeshTasksIndirectCommandEXT {
///     uint32_t groupCountX;
///     uint32_t groupCountY;
///     uint32_t groupCountZ;
/// } VkDrawMeshTasksIndirectCommandEXT;
/// ```
public sealed class VkDrawMeshTasksIndirectCommandEXT extends Struct {
    /// The struct layout of `VkDrawMeshTasksIndirectCommandEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("groupCountX"),
        ValueLayout.JAVA_INT.withName("groupCountY"),
        ValueLayout.JAVA_INT.withName("groupCountZ")
    );
    /// The [VarHandle] of `groupCountX` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_groupCountX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("groupCountX"));
    /// The [VarHandle] of `groupCountY` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_groupCountY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("groupCountY"));
    /// The [VarHandle] of `groupCountZ` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_groupCountZ = LAYOUT.arrayElementVarHandle(PathElement.groupElement("groupCountZ"));

    /// Creates `VkDrawMeshTasksIndirectCommandEXT` with the given segment.
    /// @param segment the memory segment
    public VkDrawMeshTasksIndirectCommandEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDrawMeshTasksIndirectCommandEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawMeshTasksIndirectCommandEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDrawMeshTasksIndirectCommandEXT(segment); }

    /// Creates `VkDrawMeshTasksIndirectCommandEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDrawMeshTasksIndirectCommandEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrawMeshTasksIndirectCommandEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDrawMeshTasksIndirectCommandEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDrawMeshTasksIndirectCommandEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDrawMeshTasksIndirectCommandEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDrawMeshTasksIndirectCommandEXT`
    public static VkDrawMeshTasksIndirectCommandEXT alloc(SegmentAllocator allocator) { return new VkDrawMeshTasksIndirectCommandEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDrawMeshTasksIndirectCommandEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDrawMeshTasksIndirectCommandEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDrawMeshTasksIndirectCommandEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDrawMeshTasksIndirectCommandEXT`
    public static VkDrawMeshTasksIndirectCommandEXT allocInit(SegmentAllocator allocator, @CType("uint32_t") int groupCountX, @CType("uint32_t") int groupCountY, @CType("uint32_t") int groupCountZ) { return alloc(allocator).groupCountX(groupCountX).groupCountY(groupCountY).groupCountZ(groupCountZ); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDrawMeshTasksIndirectCommandEXT copyFrom(VkDrawMeshTasksIndirectCommandEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `groupCountX` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_groupCountX(MemorySegment segment, long index) { return (int) VH_groupCountX.get(segment, 0L, index); }
    /// {@return `groupCountX`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_groupCountX(MemorySegment segment) { return VkDrawMeshTasksIndirectCommandEXT.get_groupCountX(segment, 0L); }
    /// {@return `groupCountX`}
    public @CType("uint32_t") int groupCountX() { return VkDrawMeshTasksIndirectCommandEXT.get_groupCountX(this.segment()); }
    /// Sets `groupCountX` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_groupCountX(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_groupCountX.set(segment, 0L, index, value); }
    /// Sets `groupCountX` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_groupCountX(MemorySegment segment, @CType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandEXT.set_groupCountX(segment, 0L, value); }
    /// Sets `groupCountX` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawMeshTasksIndirectCommandEXT groupCountX(@CType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandEXT.set_groupCountX(this.segment(), value); return this; }

    /// {@return `groupCountY` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_groupCountY(MemorySegment segment, long index) { return (int) VH_groupCountY.get(segment, 0L, index); }
    /// {@return `groupCountY`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_groupCountY(MemorySegment segment) { return VkDrawMeshTasksIndirectCommandEXT.get_groupCountY(segment, 0L); }
    /// {@return `groupCountY`}
    public @CType("uint32_t") int groupCountY() { return VkDrawMeshTasksIndirectCommandEXT.get_groupCountY(this.segment()); }
    /// Sets `groupCountY` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_groupCountY(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_groupCountY.set(segment, 0L, index, value); }
    /// Sets `groupCountY` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_groupCountY(MemorySegment segment, @CType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandEXT.set_groupCountY(segment, 0L, value); }
    /// Sets `groupCountY` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawMeshTasksIndirectCommandEXT groupCountY(@CType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandEXT.set_groupCountY(this.segment(), value); return this; }

    /// {@return `groupCountZ` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_groupCountZ(MemorySegment segment, long index) { return (int) VH_groupCountZ.get(segment, 0L, index); }
    /// {@return `groupCountZ`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_groupCountZ(MemorySegment segment) { return VkDrawMeshTasksIndirectCommandEXT.get_groupCountZ(segment, 0L); }
    /// {@return `groupCountZ`}
    public @CType("uint32_t") int groupCountZ() { return VkDrawMeshTasksIndirectCommandEXT.get_groupCountZ(this.segment()); }
    /// Sets `groupCountZ` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_groupCountZ(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_groupCountZ.set(segment, 0L, index, value); }
    /// Sets `groupCountZ` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_groupCountZ(MemorySegment segment, @CType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandEXT.set_groupCountZ(segment, 0L, value); }
    /// Sets `groupCountZ` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrawMeshTasksIndirectCommandEXT groupCountZ(@CType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandEXT.set_groupCountZ(this.segment(), value); return this; }

    /// A buffer of [VkDrawMeshTasksIndirectCommandEXT].
    public static final class Buffer extends VkDrawMeshTasksIndirectCommandEXT {
        private final long elementCount;

        /// Creates `VkDrawMeshTasksIndirectCommandEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDrawMeshTasksIndirectCommandEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDrawMeshTasksIndirectCommandEXT`
        public VkDrawMeshTasksIndirectCommandEXT asSlice(long index) { return new VkDrawMeshTasksIndirectCommandEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDrawMeshTasksIndirectCommandEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDrawMeshTasksIndirectCommandEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `groupCountX` at the given index}
        /// @param index the index
        public @CType("uint32_t") int groupCountXAt(long index) { return VkDrawMeshTasksIndirectCommandEXT.get_groupCountX(this.segment(), index); }
        /// Sets `groupCountX` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer groupCountXAt(long index, @CType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandEXT.set_groupCountX(this.segment(), index, value); return this; }

        /// {@return `groupCountY` at the given index}
        /// @param index the index
        public @CType("uint32_t") int groupCountYAt(long index) { return VkDrawMeshTasksIndirectCommandEXT.get_groupCountY(this.segment(), index); }
        /// Sets `groupCountY` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer groupCountYAt(long index, @CType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandEXT.set_groupCountY(this.segment(), index, value); return this; }

        /// {@return `groupCountZ` at the given index}
        /// @param index the index
        public @CType("uint32_t") int groupCountZAt(long index) { return VkDrawMeshTasksIndirectCommandEXT.get_groupCountZ(this.segment(), index); }
        /// Sets `groupCountZ` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer groupCountZAt(long index, @CType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandEXT.set_groupCountZ(this.segment(), index, value); return this; }

    }
}
