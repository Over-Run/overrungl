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
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVertexAttributeDivisorProperties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVertexAttributeDivisorProperties {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxVertexAttribDivisor;
///     (uint32_t) VkBool32 supportsNonZeroFirstInstance;
/// };
/// ```
public final class VkPhysicalDeviceVertexAttributeDivisorProperties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceVertexAttributeDivisorProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxVertexAttribDivisor"),
        ValueLayout.JAVA_INT.withName("supportsNonZeroFirstInstance")
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
    /// The byte offset of `maxVertexAttribDivisor`.
    public static final long OFFSET_maxVertexAttribDivisor = LAYOUT.byteOffset(PathElement.groupElement("maxVertexAttribDivisor"));
    /// The memory layout of `maxVertexAttribDivisor`.
    public static final MemoryLayout LAYOUT_maxVertexAttribDivisor = LAYOUT.select(PathElement.groupElement("maxVertexAttribDivisor"));
    /// The [VarHandle] of `maxVertexAttribDivisor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxVertexAttribDivisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertexAttribDivisor"));
    /// The byte offset of `supportsNonZeroFirstInstance`.
    public static final long OFFSET_supportsNonZeroFirstInstance = LAYOUT.byteOffset(PathElement.groupElement("supportsNonZeroFirstInstance"));
    /// The memory layout of `supportsNonZeroFirstInstance`.
    public static final MemoryLayout LAYOUT_supportsNonZeroFirstInstance = LAYOUT.select(PathElement.groupElement("supportsNonZeroFirstInstance"));
    /// The [VarHandle] of `supportsNonZeroFirstInstance` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportsNonZeroFirstInstance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportsNonZeroFirstInstance"));

    /// Creates `VkPhysicalDeviceVertexAttributeDivisorProperties` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceVertexAttributeDivisorProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceVertexAttributeDivisorProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVertexAttributeDivisorProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeDivisorProperties(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVertexAttributeDivisorProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVertexAttributeDivisorProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeDivisorProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceVertexAttributeDivisorProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVertexAttributeDivisorProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeDivisorProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceVertexAttributeDivisorProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVertexAttributeDivisorProperties`
    public static VkPhysicalDeviceVertexAttributeDivisorProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVertexAttributeDivisorProperties(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceVertexAttributeDivisorProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVertexAttributeDivisorProperties`
    public static VkPhysicalDeviceVertexAttributeDivisorProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVertexAttributeDivisorProperties(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorProperties copyFrom(VkPhysicalDeviceVertexAttributeDivisorProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceVertexAttributeDivisorProperties reinterpret(long count) { return new VkPhysicalDeviceVertexAttributeDivisorProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceVertexAttributeDivisorProperties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVertexAttributeDivisorProperties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxVertexAttribDivisor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxVertexAttribDivisor(MemorySegment segment, long index) { return (int) VH_maxVertexAttribDivisor.get(segment, 0L, index); }
    /// {@return `maxVertexAttribDivisor`}
    public int maxVertexAttribDivisor() { return maxVertexAttribDivisor(this.segment(), 0L); }
    /// Sets `maxVertexAttribDivisor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxVertexAttribDivisor(MemorySegment segment, long index, int value) { VH_maxVertexAttribDivisor.set(segment, 0L, index, value); }
    /// Sets `maxVertexAttribDivisor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorProperties maxVertexAttribDivisor(int value) { maxVertexAttribDivisor(this.segment(), 0L, value); return this; }

    /// {@return `supportsNonZeroFirstInstance` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportsNonZeroFirstInstance(MemorySegment segment, long index) { return (int) VH_supportsNonZeroFirstInstance.get(segment, 0L, index); }
    /// {@return `supportsNonZeroFirstInstance`}
    public int supportsNonZeroFirstInstance() { return supportsNonZeroFirstInstance(this.segment(), 0L); }
    /// Sets `supportsNonZeroFirstInstance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportsNonZeroFirstInstance(MemorySegment segment, long index, int value) { VH_supportsNonZeroFirstInstance.set(segment, 0L, index, value); }
    /// Sets `supportsNonZeroFirstInstance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorProperties supportsNonZeroFirstInstance(int value) { supportsNonZeroFirstInstance(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceVertexAttributeDivisorProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceVertexAttributeDivisorProperties`
    public VkPhysicalDeviceVertexAttributeDivisorProperties asSlice(long index) { return new VkPhysicalDeviceVertexAttributeDivisorProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceVertexAttributeDivisorProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceVertexAttributeDivisorProperties`
    public VkPhysicalDeviceVertexAttributeDivisorProperties asSlice(long index, long count) { return new VkPhysicalDeviceVertexAttributeDivisorProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceVertexAttributeDivisorProperties` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorProperties at(long index, Consumer<VkPhysicalDeviceVertexAttributeDivisorProperties> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorProperties sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorProperties pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxVertexAttribDivisor` at the given index}
    /// @param index the index of the struct buffer
    public int maxVertexAttribDivisorAt(long index) { return maxVertexAttribDivisor(this.segment(), index); }
    /// Sets `maxVertexAttribDivisor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorProperties maxVertexAttribDivisorAt(long index, int value) { maxVertexAttribDivisor(this.segment(), index, value); return this; }

    /// {@return `supportsNonZeroFirstInstance` at the given index}
    /// @param index the index of the struct buffer
    public int supportsNonZeroFirstInstanceAt(long index) { return supportsNonZeroFirstInstance(this.segment(), index); }
    /// Sets `supportsNonZeroFirstInstance` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorProperties supportsNonZeroFirstInstanceAt(long index, int value) { supportsNonZeroFirstInstance(this.segment(), index, value); return this; }

}
