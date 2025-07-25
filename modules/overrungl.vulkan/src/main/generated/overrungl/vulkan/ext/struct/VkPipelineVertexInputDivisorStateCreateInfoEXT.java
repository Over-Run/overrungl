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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPipelineVertexInputDivisorStateCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t vertexBindingDivisorCount;
///     const VkVertexInputBindingDivisorDescription* pVertexBindingDivisors;
/// };
/// ```
public final class VkPipelineVertexInputDivisorStateCreateInfoEXT extends GroupType {
    /// The struct layout of `VkPipelineVertexInputDivisorStateCreateInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexBindingDivisorCount"),
        ValueLayout.ADDRESS.withName("pVertexBindingDivisors")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `vertexBindingDivisorCount`.
    public static final long OFFSET_vertexBindingDivisorCount = LAYOUT.byteOffset(PathElement.groupElement("vertexBindingDivisorCount"));
    /// The memory layout of `vertexBindingDivisorCount`.
    public static final MemoryLayout LAYOUT_vertexBindingDivisorCount = LAYOUT.select(PathElement.groupElement("vertexBindingDivisorCount"));
    /// The [VarHandle] of `vertexBindingDivisorCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexBindingDivisorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexBindingDivisorCount"));
    /// The byte offset of `pVertexBindingDivisors`.
    public static final long OFFSET_pVertexBindingDivisors = LAYOUT.byteOffset(PathElement.groupElement("pVertexBindingDivisors"));
    /// The memory layout of `pVertexBindingDivisors`.
    public static final MemoryLayout LAYOUT_pVertexBindingDivisors = LAYOUT.select(PathElement.groupElement("pVertexBindingDivisors"));
    /// The [VarHandle] of `pVertexBindingDivisors` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pVertexBindingDivisors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVertexBindingDivisors"));

    /// Creates `VkPipelineVertexInputDivisorStateCreateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineVertexInputDivisorStateCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineVertexInputDivisorStateCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineVertexInputDivisorStateCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineVertexInputDivisorStateCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineVertexInputDivisorStateCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineVertexInputDivisorStateCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineVertexInputDivisorStateCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineVertexInputDivisorStateCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineVertexInputDivisorStateCreateInfoEXT`
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineVertexInputDivisorStateCreateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineVertexInputDivisorStateCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineVertexInputDivisorStateCreateInfoEXT`
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineVertexInputDivisorStateCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineVertexInputDivisorStateCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vertexBindingDivisorCount `vertexBindingDivisorCount`
    /// @param pVertexBindingDivisors `pVertexBindingDivisors`
    /// @return the allocated `VkPipelineVertexInputDivisorStateCreateInfoEXT`
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int vertexBindingDivisorCount, MemorySegment pVertexBindingDivisors) {
        return alloc(allocator).sType(sType).pNext(pNext).vertexBindingDivisorCount(vertexBindingDivisorCount).pVertexBindingDivisors(pVertexBindingDivisors);
    }

    /// Allocates a `VkPipelineVertexInputDivisorStateCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vertexBindingDivisorCount `vertexBindingDivisorCount`
    /// @return the allocated `VkPipelineVertexInputDivisorStateCreateInfoEXT`
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int vertexBindingDivisorCount) {
        return alloc(allocator).sType(sType).pNext(pNext).vertexBindingDivisorCount(vertexBindingDivisorCount);
    }

    /// Allocates a `VkPipelineVertexInputDivisorStateCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPipelineVertexInputDivisorStateCreateInfoEXT`
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPipelineVertexInputDivisorStateCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPipelineVertexInputDivisorStateCreateInfoEXT`
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineVertexInputDivisorStateCreateInfoEXT copyFrom(VkPipelineVertexInputDivisorStateCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineVertexInputDivisorStateCreateInfoEXT reinterpret(long count) { return new VkPipelineVertexInputDivisorStateCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputDivisorStateCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputDivisorStateCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `vertexBindingDivisorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vertexBindingDivisorCount(MemorySegment segment, long index) { return (int) VH_vertexBindingDivisorCount.get(segment, 0L, index); }
    /// {@return `vertexBindingDivisorCount`}
    public int vertexBindingDivisorCount() { return vertexBindingDivisorCount(this.segment(), 0L); }
    /// Sets `vertexBindingDivisorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexBindingDivisorCount(MemorySegment segment, long index, int value) { VH_vertexBindingDivisorCount.set(segment, 0L, index, value); }
    /// Sets `vertexBindingDivisorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputDivisorStateCreateInfoEXT vertexBindingDivisorCount(int value) { vertexBindingDivisorCount(this.segment(), 0L, value); return this; }

    /// {@return `pVertexBindingDivisors` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pVertexBindingDivisors(MemorySegment segment, long index) { return (MemorySegment) VH_pVertexBindingDivisors.get(segment, 0L, index); }
    /// {@return `pVertexBindingDivisors`}
    public MemorySegment pVertexBindingDivisors() { return pVertexBindingDivisors(this.segment(), 0L); }
    /// Sets `pVertexBindingDivisors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pVertexBindingDivisors(MemorySegment segment, long index, MemorySegment value) { VH_pVertexBindingDivisors.set(segment, 0L, index, value); }
    /// Sets `pVertexBindingDivisors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputDivisorStateCreateInfoEXT pVertexBindingDivisors(MemorySegment value) { pVertexBindingDivisors(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineVertexInputDivisorStateCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineVertexInputDivisorStateCreateInfoEXT`
    public VkPipelineVertexInputDivisorStateCreateInfoEXT asSlice(long index) { return new VkPipelineVertexInputDivisorStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineVertexInputDivisorStateCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineVertexInputDivisorStateCreateInfoEXT`
    public VkPipelineVertexInputDivisorStateCreateInfoEXT asSlice(long index, long count) { return new VkPipelineVertexInputDivisorStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineVertexInputDivisorStateCreateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineVertexInputDivisorStateCreateInfoEXT at(long index, Consumer<VkPipelineVertexInputDivisorStateCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputDivisorStateCreateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputDivisorStateCreateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `vertexBindingDivisorCount` at the given index}
    /// @param index the index of the struct buffer
    public int vertexBindingDivisorCountAt(long index) { return vertexBindingDivisorCount(this.segment(), index); }
    /// Sets `vertexBindingDivisorCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputDivisorStateCreateInfoEXT vertexBindingDivisorCountAt(long index, int value) { vertexBindingDivisorCount(this.segment(), index, value); return this; }

    /// {@return `pVertexBindingDivisors` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pVertexBindingDivisorsAt(long index) { return pVertexBindingDivisors(this.segment(), index); }
    /// Sets `pVertexBindingDivisors` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputDivisorStateCreateInfoEXT pVertexBindingDivisorsAt(long index, MemorySegment value) { pVertexBindingDivisors(this.segment(), index, value); return this; }

}
