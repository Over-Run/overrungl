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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceVertexAttributeDivisorFeatures {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 vertexAttributeInstanceRateDivisor;
///     (uint32_t) VkBool32 vertexAttributeInstanceRateZeroDivisor;
/// };
/// ```
public final class VkPhysicalDeviceVertexAttributeDivisorFeatures extends GroupType {
    /// The struct layout of `VkPhysicalDeviceVertexAttributeDivisorFeatures`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexAttributeInstanceRateDivisor"),
        ValueLayout.JAVA_INT.withName("vertexAttributeInstanceRateZeroDivisor")
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
    /// The byte offset of `vertexAttributeInstanceRateDivisor`.
    public static final long OFFSET_vertexAttributeInstanceRateDivisor = LAYOUT.byteOffset(PathElement.groupElement("vertexAttributeInstanceRateDivisor"));
    /// The memory layout of `vertexAttributeInstanceRateDivisor`.
    public static final MemoryLayout LAYOUT_vertexAttributeInstanceRateDivisor = LAYOUT.select(PathElement.groupElement("vertexAttributeInstanceRateDivisor"));
    /// The [VarHandle] of `vertexAttributeInstanceRateDivisor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexAttributeInstanceRateDivisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexAttributeInstanceRateDivisor"));
    /// The byte offset of `vertexAttributeInstanceRateZeroDivisor`.
    public static final long OFFSET_vertexAttributeInstanceRateZeroDivisor = LAYOUT.byteOffset(PathElement.groupElement("vertexAttributeInstanceRateZeroDivisor"));
    /// The memory layout of `vertexAttributeInstanceRateZeroDivisor`.
    public static final MemoryLayout LAYOUT_vertexAttributeInstanceRateZeroDivisor = LAYOUT.select(PathElement.groupElement("vertexAttributeInstanceRateZeroDivisor"));
    /// The [VarHandle] of `vertexAttributeInstanceRateZeroDivisor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexAttributeInstanceRateZeroDivisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexAttributeInstanceRateZeroDivisor"));

    /// Creates `VkPhysicalDeviceVertexAttributeDivisorFeatures` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceVertexAttributeDivisorFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceVertexAttributeDivisorFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeDivisorFeatures(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVertexAttributeDivisorFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeDivisorFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceVertexAttributeDivisorFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeDivisorFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceVertexAttributeDivisorFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVertexAttributeDivisorFeatures`
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVertexAttributeDivisorFeatures(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceVertexAttributeDivisorFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVertexAttributeDivisorFeatures`
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVertexAttributeDivisorFeatures(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceVertexAttributeDivisorFeatures` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vertexAttributeInstanceRateDivisor `vertexAttributeInstanceRateDivisor`
    /// @param vertexAttributeInstanceRateZeroDivisor `vertexAttributeInstanceRateZeroDivisor`
    /// @return the allocated `VkPhysicalDeviceVertexAttributeDivisorFeatures`
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int vertexAttributeInstanceRateDivisor, int vertexAttributeInstanceRateZeroDivisor) {
        return alloc(allocator).sType(sType).pNext(pNext).vertexAttributeInstanceRateDivisor(vertexAttributeInstanceRateDivisor).vertexAttributeInstanceRateZeroDivisor(vertexAttributeInstanceRateZeroDivisor);
    }

    /// Allocates a `VkPhysicalDeviceVertexAttributeDivisorFeatures` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vertexAttributeInstanceRateDivisor `vertexAttributeInstanceRateDivisor`
    /// @return the allocated `VkPhysicalDeviceVertexAttributeDivisorFeatures`
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int vertexAttributeInstanceRateDivisor) {
        return alloc(allocator).sType(sType).pNext(pNext).vertexAttributeInstanceRateDivisor(vertexAttributeInstanceRateDivisor);
    }

    /// Allocates a `VkPhysicalDeviceVertexAttributeDivisorFeatures` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceVertexAttributeDivisorFeatures`
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceVertexAttributeDivisorFeatures` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceVertexAttributeDivisorFeatures`
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorFeatures copyFrom(VkPhysicalDeviceVertexAttributeDivisorFeatures src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceVertexAttributeDivisorFeatures reinterpret(long count) { return new VkPhysicalDeviceVertexAttributeDivisorFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceVertexAttributeDivisorFeatures sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVertexAttributeDivisorFeatures pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `vertexAttributeInstanceRateDivisor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vertexAttributeInstanceRateDivisor(MemorySegment segment, long index) { return (int) VH_vertexAttributeInstanceRateDivisor.get(segment, 0L, index); }
    /// {@return `vertexAttributeInstanceRateDivisor`}
    public int vertexAttributeInstanceRateDivisor() { return vertexAttributeInstanceRateDivisor(this.segment(), 0L); }
    /// Sets `vertexAttributeInstanceRateDivisor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexAttributeInstanceRateDivisor(MemorySegment segment, long index, int value) { VH_vertexAttributeInstanceRateDivisor.set(segment, 0L, index, value); }
    /// Sets `vertexAttributeInstanceRateDivisor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorFeatures vertexAttributeInstanceRateDivisor(int value) { vertexAttributeInstanceRateDivisor(this.segment(), 0L, value); return this; }

    /// {@return `vertexAttributeInstanceRateZeroDivisor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vertexAttributeInstanceRateZeroDivisor(MemorySegment segment, long index) { return (int) VH_vertexAttributeInstanceRateZeroDivisor.get(segment, 0L, index); }
    /// {@return `vertexAttributeInstanceRateZeroDivisor`}
    public int vertexAttributeInstanceRateZeroDivisor() { return vertexAttributeInstanceRateZeroDivisor(this.segment(), 0L); }
    /// Sets `vertexAttributeInstanceRateZeroDivisor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexAttributeInstanceRateZeroDivisor(MemorySegment segment, long index, int value) { VH_vertexAttributeInstanceRateZeroDivisor.set(segment, 0L, index, value); }
    /// Sets `vertexAttributeInstanceRateZeroDivisor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorFeatures vertexAttributeInstanceRateZeroDivisor(int value) { vertexAttributeInstanceRateZeroDivisor(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceVertexAttributeDivisorFeatures`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceVertexAttributeDivisorFeatures`
    public VkPhysicalDeviceVertexAttributeDivisorFeatures asSlice(long index) { return new VkPhysicalDeviceVertexAttributeDivisorFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceVertexAttributeDivisorFeatures`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceVertexAttributeDivisorFeatures`
    public VkPhysicalDeviceVertexAttributeDivisorFeatures asSlice(long index, long count) { return new VkPhysicalDeviceVertexAttributeDivisorFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceVertexAttributeDivisorFeatures` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorFeatures at(long index, Consumer<VkPhysicalDeviceVertexAttributeDivisorFeatures> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorFeatures sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorFeatures pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `vertexAttributeInstanceRateDivisor` at the given index}
    /// @param index the index of the struct buffer
    public int vertexAttributeInstanceRateDivisorAt(long index) { return vertexAttributeInstanceRateDivisor(this.segment(), index); }
    /// Sets `vertexAttributeInstanceRateDivisor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorFeatures vertexAttributeInstanceRateDivisorAt(long index, int value) { vertexAttributeInstanceRateDivisor(this.segment(), index, value); return this; }

    /// {@return `vertexAttributeInstanceRateZeroDivisor` at the given index}
    /// @param index the index of the struct buffer
    public int vertexAttributeInstanceRateZeroDivisorAt(long index) { return vertexAttributeInstanceRateZeroDivisor(this.segment(), index); }
    /// Sets `vertexAttributeInstanceRateZeroDivisor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorFeatures vertexAttributeInstanceRateZeroDivisorAt(long index, int value) { vertexAttributeInstanceRateZeroDivisor(this.segment(), index, value); return this; }

}
