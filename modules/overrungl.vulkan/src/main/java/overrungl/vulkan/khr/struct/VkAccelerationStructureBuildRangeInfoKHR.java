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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### primitiveCount
/// [VarHandle][#VH_primitiveCount] - [Getter][#primitiveCount()] - [Setter][#primitiveCount(int)]
/// ### primitiveOffset
/// [VarHandle][#VH_primitiveOffset] - [Getter][#primitiveOffset()] - [Setter][#primitiveOffset(int)]
/// ### firstVertex
/// [VarHandle][#VH_firstVertex] - [Getter][#firstVertex()] - [Setter][#firstVertex(int)]
/// ### transformOffset
/// [VarHandle][#VH_transformOffset] - [Getter][#transformOffset()] - [Setter][#transformOffset(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAccelerationStructureBuildRangeInfoKHR {
///     uint32_t primitiveCount;
///     uint32_t primitiveOffset;
///     uint32_t firstVertex;
///     uint32_t transformOffset;
/// } VkAccelerationStructureBuildRangeInfoKHR;
/// ```
public sealed class VkAccelerationStructureBuildRangeInfoKHR extends Struct {
    /// The struct layout of `VkAccelerationStructureBuildRangeInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("primitiveCount"),
        ValueLayout.JAVA_INT.withName("primitiveOffset"),
        ValueLayout.JAVA_INT.withName("firstVertex"),
        ValueLayout.JAVA_INT.withName("transformOffset")
    );
    /// The [VarHandle] of `primitiveCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_primitiveCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveCount"));
    /// The [VarHandle] of `primitiveOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_primitiveOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveOffset"));
    /// The [VarHandle] of `firstVertex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_firstVertex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstVertex"));
    /// The [VarHandle] of `transformOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_transformOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformOffset"));

    /// Creates `VkAccelerationStructureBuildRangeInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureBuildRangeInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureBuildRangeInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureBuildRangeInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureBuildRangeInfoKHR(segment); }

    /// Creates `VkAccelerationStructureBuildRangeInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureBuildRangeInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureBuildRangeInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureBuildRangeInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureBuildRangeInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAccelerationStructureBuildRangeInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureBuildRangeInfoKHR`
    public static VkAccelerationStructureBuildRangeInfoKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureBuildRangeInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureBuildRangeInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureBuildRangeInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAccelerationStructureBuildRangeInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureBuildRangeInfoKHR`
    public static VkAccelerationStructureBuildRangeInfoKHR allocInit(SegmentAllocator allocator, @CType("uint32_t") int primitiveCount, @CType("uint32_t") int primitiveOffset, @CType("uint32_t") int firstVertex, @CType("uint32_t") int transformOffset) { return alloc(allocator).primitiveCount(primitiveCount).primitiveOffset(primitiveOffset).firstVertex(firstVertex).transformOffset(transformOffset); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureBuildRangeInfoKHR copyFrom(VkAccelerationStructureBuildRangeInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `primitiveCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_primitiveCount(MemorySegment segment, long index) { return (int) VH_primitiveCount.get(segment, 0L, index); }
    /// {@return `primitiveCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_primitiveCount(MemorySegment segment) { return VkAccelerationStructureBuildRangeInfoKHR.get_primitiveCount(segment, 0L); }
    /// {@return `primitiveCount`}
    public @CType("uint32_t") int primitiveCount() { return VkAccelerationStructureBuildRangeInfoKHR.get_primitiveCount(this.segment()); }
    /// Sets `primitiveCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_primitiveCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_primitiveCount.set(segment, 0L, index, value); }
    /// Sets `primitiveCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_primitiveCount(MemorySegment segment, @CType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.set_primitiveCount(segment, 0L, value); }
    /// Sets `primitiveCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildRangeInfoKHR primitiveCount(@CType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.set_primitiveCount(this.segment(), value); return this; }

    /// {@return `primitiveOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_primitiveOffset(MemorySegment segment, long index) { return (int) VH_primitiveOffset.get(segment, 0L, index); }
    /// {@return `primitiveOffset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_primitiveOffset(MemorySegment segment) { return VkAccelerationStructureBuildRangeInfoKHR.get_primitiveOffset(segment, 0L); }
    /// {@return `primitiveOffset`}
    public @CType("uint32_t") int primitiveOffset() { return VkAccelerationStructureBuildRangeInfoKHR.get_primitiveOffset(this.segment()); }
    /// Sets `primitiveOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_primitiveOffset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_primitiveOffset.set(segment, 0L, index, value); }
    /// Sets `primitiveOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_primitiveOffset(MemorySegment segment, @CType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.set_primitiveOffset(segment, 0L, value); }
    /// Sets `primitiveOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildRangeInfoKHR primitiveOffset(@CType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.set_primitiveOffset(this.segment(), value); return this; }

    /// {@return `firstVertex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_firstVertex(MemorySegment segment, long index) { return (int) VH_firstVertex.get(segment, 0L, index); }
    /// {@return `firstVertex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_firstVertex(MemorySegment segment) { return VkAccelerationStructureBuildRangeInfoKHR.get_firstVertex(segment, 0L); }
    /// {@return `firstVertex`}
    public @CType("uint32_t") int firstVertex() { return VkAccelerationStructureBuildRangeInfoKHR.get_firstVertex(this.segment()); }
    /// Sets `firstVertex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_firstVertex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_firstVertex.set(segment, 0L, index, value); }
    /// Sets `firstVertex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_firstVertex(MemorySegment segment, @CType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.set_firstVertex(segment, 0L, value); }
    /// Sets `firstVertex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildRangeInfoKHR firstVertex(@CType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.set_firstVertex(this.segment(), value); return this; }

    /// {@return `transformOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_transformOffset(MemorySegment segment, long index) { return (int) VH_transformOffset.get(segment, 0L, index); }
    /// {@return `transformOffset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_transformOffset(MemorySegment segment) { return VkAccelerationStructureBuildRangeInfoKHR.get_transformOffset(segment, 0L); }
    /// {@return `transformOffset`}
    public @CType("uint32_t") int transformOffset() { return VkAccelerationStructureBuildRangeInfoKHR.get_transformOffset(this.segment()); }
    /// Sets `transformOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transformOffset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_transformOffset.set(segment, 0L, index, value); }
    /// Sets `transformOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transformOffset(MemorySegment segment, @CType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.set_transformOffset(segment, 0L, value); }
    /// Sets `transformOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildRangeInfoKHR transformOffset(@CType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.set_transformOffset(this.segment(), value); return this; }

    /// A buffer of [VkAccelerationStructureBuildRangeInfoKHR].
    public static final class Buffer extends VkAccelerationStructureBuildRangeInfoKHR {
        private final long elementCount;

        /// Creates `VkAccelerationStructureBuildRangeInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAccelerationStructureBuildRangeInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAccelerationStructureBuildRangeInfoKHR`
        public VkAccelerationStructureBuildRangeInfoKHR asSlice(long index) { return new VkAccelerationStructureBuildRangeInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAccelerationStructureBuildRangeInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAccelerationStructureBuildRangeInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `primitiveCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int primitiveCountAt(long index) { return VkAccelerationStructureBuildRangeInfoKHR.get_primitiveCount(this.segment(), index); }
        /// Sets `primitiveCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer primitiveCountAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.set_primitiveCount(this.segment(), index, value); return this; }

        /// {@return `primitiveOffset` at the given index}
        /// @param index the index
        public @CType("uint32_t") int primitiveOffsetAt(long index) { return VkAccelerationStructureBuildRangeInfoKHR.get_primitiveOffset(this.segment(), index); }
        /// Sets `primitiveOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer primitiveOffsetAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.set_primitiveOffset(this.segment(), index, value); return this; }

        /// {@return `firstVertex` at the given index}
        /// @param index the index
        public @CType("uint32_t") int firstVertexAt(long index) { return VkAccelerationStructureBuildRangeInfoKHR.get_firstVertex(this.segment(), index); }
        /// Sets `firstVertex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer firstVertexAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.set_firstVertex(this.segment(), index, value); return this; }

        /// {@return `transformOffset` at the given index}
        /// @param index the index
        public @CType("uint32_t") int transformOffsetAt(long index) { return VkAccelerationStructureBuildRangeInfoKHR.get_transformOffset(this.segment(), index); }
        /// Sets `transformOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer transformOffsetAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.set_transformOffset(this.segment(), index, value); return this; }

    }
}
