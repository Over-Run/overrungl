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
/// struct VkPhysicalDeviceMaintenance3Properties {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxPerSetDescriptors;
///     (uint64_t) VkDeviceSize maxMemoryAllocationSize;
/// };
/// ```
public final class VkPhysicalDeviceMaintenance3Properties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceMaintenance3Properties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxPerSetDescriptors"),
        ValueLayout.JAVA_LONG.withName("maxMemoryAllocationSize")
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
    /// The byte offset of `maxPerSetDescriptors`.
    public static final long OFFSET_maxPerSetDescriptors = LAYOUT.byteOffset(PathElement.groupElement("maxPerSetDescriptors"));
    /// The memory layout of `maxPerSetDescriptors`.
    public static final MemoryLayout LAYOUT_maxPerSetDescriptors = LAYOUT.select(PathElement.groupElement("maxPerSetDescriptors"));
    /// The [VarHandle] of `maxPerSetDescriptors` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPerSetDescriptors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerSetDescriptors"));
    /// The byte offset of `maxMemoryAllocationSize`.
    public static final long OFFSET_maxMemoryAllocationSize = LAYOUT.byteOffset(PathElement.groupElement("maxMemoryAllocationSize"));
    /// The memory layout of `maxMemoryAllocationSize`.
    public static final MemoryLayout LAYOUT_maxMemoryAllocationSize = LAYOUT.select(PathElement.groupElement("maxMemoryAllocationSize"));
    /// The [VarHandle] of `maxMemoryAllocationSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxMemoryAllocationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMemoryAllocationSize"));

    /// Creates `VkPhysicalDeviceMaintenance3Properties` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceMaintenance3Properties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceMaintenance3Properties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance3Properties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance3Properties(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMaintenance3Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance3Properties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance3Properties(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceMaintenance3Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance3Properties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance3Properties(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceMaintenance3Properties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMaintenance3Properties`
    public static VkPhysicalDeviceMaintenance3Properties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMaintenance3Properties(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceMaintenance3Properties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMaintenance3Properties`
    public static VkPhysicalDeviceMaintenance3Properties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMaintenance3Properties(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceMaintenance3Properties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param maxPerSetDescriptors `maxPerSetDescriptors`
    /// @param maxMemoryAllocationSize `maxMemoryAllocationSize`
    /// @return the allocated `VkPhysicalDeviceMaintenance3Properties`
    public static VkPhysicalDeviceMaintenance3Properties allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int maxPerSetDescriptors, long maxMemoryAllocationSize) {
        return alloc(allocator).sType(sType).pNext(pNext).maxPerSetDescriptors(maxPerSetDescriptors).maxMemoryAllocationSize(maxMemoryAllocationSize);
    }

    /// Allocates a `VkPhysicalDeviceMaintenance3Properties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param maxPerSetDescriptors `maxPerSetDescriptors`
    /// @return the allocated `VkPhysicalDeviceMaintenance3Properties`
    public static VkPhysicalDeviceMaintenance3Properties allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int maxPerSetDescriptors) {
        return alloc(allocator).sType(sType).pNext(pNext).maxPerSetDescriptors(maxPerSetDescriptors);
    }

    /// Allocates a `VkPhysicalDeviceMaintenance3Properties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceMaintenance3Properties`
    public static VkPhysicalDeviceMaintenance3Properties allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceMaintenance3Properties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceMaintenance3Properties`
    public static VkPhysicalDeviceMaintenance3Properties allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMaintenance3Properties copyFrom(VkPhysicalDeviceMaintenance3Properties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceMaintenance3Properties reinterpret(long count) { return new VkPhysicalDeviceMaintenance3Properties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceMaintenance3Properties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMaintenance3Properties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxPerSetDescriptors` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerSetDescriptors(MemorySegment segment, long index) { return (int) VH_maxPerSetDescriptors.get(segment, 0L, index); }
    /// {@return `maxPerSetDescriptors`}
    public int maxPerSetDescriptors() { return maxPerSetDescriptors(this.segment(), 0L); }
    /// Sets `maxPerSetDescriptors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerSetDescriptors(MemorySegment segment, long index, int value) { VH_maxPerSetDescriptors.set(segment, 0L, index, value); }
    /// Sets `maxPerSetDescriptors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance3Properties maxPerSetDescriptors(int value) { maxPerSetDescriptors(this.segment(), 0L, value); return this; }

    /// {@return `maxMemoryAllocationSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxMemoryAllocationSize(MemorySegment segment, long index) { return (long) VH_maxMemoryAllocationSize.get(segment, 0L, index); }
    /// {@return `maxMemoryAllocationSize`}
    public long maxMemoryAllocationSize() { return maxMemoryAllocationSize(this.segment(), 0L); }
    /// Sets `maxMemoryAllocationSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMemoryAllocationSize(MemorySegment segment, long index, long value) { VH_maxMemoryAllocationSize.set(segment, 0L, index, value); }
    /// Sets `maxMemoryAllocationSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance3Properties maxMemoryAllocationSize(long value) { maxMemoryAllocationSize(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceMaintenance3Properties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMaintenance3Properties`
    public VkPhysicalDeviceMaintenance3Properties asSlice(long index) { return new VkPhysicalDeviceMaintenance3Properties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceMaintenance3Properties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMaintenance3Properties`
    public VkPhysicalDeviceMaintenance3Properties asSlice(long index, long count) { return new VkPhysicalDeviceMaintenance3Properties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceMaintenance3Properties` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceMaintenance3Properties at(long index, Consumer<VkPhysicalDeviceMaintenance3Properties> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance3Properties sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance3Properties pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxPerSetDescriptors` at the given index}
    /// @param index the index of the struct buffer
    public int maxPerSetDescriptorsAt(long index) { return maxPerSetDescriptors(this.segment(), index); }
    /// Sets `maxPerSetDescriptors` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance3Properties maxPerSetDescriptorsAt(long index, int value) { maxPerSetDescriptors(this.segment(), index, value); return this; }

    /// {@return `maxMemoryAllocationSize` at the given index}
    /// @param index the index of the struct buffer
    public long maxMemoryAllocationSizeAt(long index) { return maxMemoryAllocationSize(this.segment(), index); }
    /// Sets `maxMemoryAllocationSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance3Properties maxMemoryAllocationSizeAt(long index, long value) { maxMemoryAllocationSize(this.segment(), index, value); return this; }

}
