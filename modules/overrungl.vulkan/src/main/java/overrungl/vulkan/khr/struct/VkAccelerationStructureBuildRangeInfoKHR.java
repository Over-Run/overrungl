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
public final class VkAccelerationStructureBuildRangeInfoKHR extends Struct {
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
    public static VkAccelerationStructureBuildRangeInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureBuildRangeInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkAccelerationStructureBuildRangeInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureBuildRangeInfoKHR`
    public static VkAccelerationStructureBuildRangeInfoKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureBuildRangeInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureBuildRangeInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureBuildRangeInfoKHR`
    public static VkAccelerationStructureBuildRangeInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureBuildRangeInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `primitiveCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_primitiveCount(MemorySegment segment, long index) { return (int) VH_primitiveCount.get(segment, 0L, index); }
    /// {@return `primitiveCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_primitiveCount(MemorySegment segment) { return VkAccelerationStructureBuildRangeInfoKHR.get_primitiveCount(segment, 0L); }
    /// {@return `primitiveCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int primitiveCountAt(long index) { return VkAccelerationStructureBuildRangeInfoKHR.get_primitiveCount(this.segment(), index); }
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
    /// Sets `primitiveCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildRangeInfoKHR primitiveCountAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.set_primitiveCount(this.segment(), index, value); return this; }
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
    /// {@return `primitiveOffset` at the given index}
    /// @param index the index
    public @CType("uint32_t") int primitiveOffsetAt(long index) { return VkAccelerationStructureBuildRangeInfoKHR.get_primitiveOffset(this.segment(), index); }
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
    /// Sets `primitiveOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildRangeInfoKHR primitiveOffsetAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.set_primitiveOffset(this.segment(), index, value); return this; }
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
    /// {@return `firstVertex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int firstVertexAt(long index) { return VkAccelerationStructureBuildRangeInfoKHR.get_firstVertex(this.segment(), index); }
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
    /// Sets `firstVertex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildRangeInfoKHR firstVertexAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.set_firstVertex(this.segment(), index, value); return this; }
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
    /// {@return `transformOffset` at the given index}
    /// @param index the index
    public @CType("uint32_t") int transformOffsetAt(long index) { return VkAccelerationStructureBuildRangeInfoKHR.get_transformOffset(this.segment(), index); }
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
    /// Sets `transformOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildRangeInfoKHR transformOffsetAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.set_transformOffset(this.segment(), index, value); return this; }
    /// Sets `transformOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildRangeInfoKHR transformOffset(@CType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.set_transformOffset(this.segment(), value); return this; }

}
