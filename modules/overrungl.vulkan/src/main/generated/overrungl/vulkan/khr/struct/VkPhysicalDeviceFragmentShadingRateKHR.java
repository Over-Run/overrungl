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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentShadingRateKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkSampleCountFlags sampleCounts;
///     (struct VkExtent2D) VkExtent2D fragmentSize;
/// };
/// ```
public sealed class VkPhysicalDeviceFragmentShadingRateKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceFragmentShadingRateKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleCounts"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("fragmentSize")
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
    /// The byte offset of `sampleCounts`.
    public static final long OFFSET_sampleCounts = LAYOUT.byteOffset(PathElement.groupElement("sampleCounts"));
    /// The memory layout of `sampleCounts`.
    public static final MemoryLayout LAYOUT_sampleCounts = LAYOUT.select(PathElement.groupElement("sampleCounts"));
    /// The [VarHandle] of `sampleCounts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleCounts"));
    /// The byte offset of `fragmentSize`.
    public static final long OFFSET_fragmentSize = LAYOUT.byteOffset(PathElement.groupElement("fragmentSize"));
    /// The memory layout of `fragmentSize`.
    public static final MemoryLayout LAYOUT_fragmentSize = LAYOUT.select(PathElement.groupElement("fragmentSize"));

    /// Creates `VkPhysicalDeviceFragmentShadingRateKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceFragmentShadingRateKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRateKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRateKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRateKHR`
    public static VkPhysicalDeviceFragmentShadingRateKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentShadingRateKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRateKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRateKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRateKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param sampleCounts `sampleCounts`
    /// @param fragmentSize `fragmentSize`
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRateKHR`
    public static VkPhysicalDeviceFragmentShadingRateKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int sampleCounts, MemorySegment fragmentSize) {
        return alloc(allocator).sType(sType).pNext(pNext).sampleCounts(sampleCounts).fragmentSize(fragmentSize);
    }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRateKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param sampleCounts `sampleCounts`
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRateKHR`
    public static VkPhysicalDeviceFragmentShadingRateKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int sampleCounts) {
        return alloc(allocator).sType(sType).pNext(pNext).sampleCounts(sampleCounts);
    }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRateKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRateKHR`
    public static VkPhysicalDeviceFragmentShadingRateKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRateKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRateKHR`
    public static VkPhysicalDeviceFragmentShadingRateKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateKHR copyFrom(VkPhysicalDeviceFragmentShadingRateKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkPhysicalDeviceFragmentShadingRateKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceFragmentShadingRateKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `sampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sampleCounts(MemorySegment segment, long index) { return (int) VH_sampleCounts.get(segment, 0L, index); }
    /// {@return `sampleCounts`}
    public int sampleCounts() { return sampleCounts(this.segment(), 0L); }
    /// Sets `sampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampleCounts(MemorySegment segment, long index, int value) { VH_sampleCounts.set(segment, 0L, index, value); }
    /// Sets `sampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateKHR sampleCounts(int value) { sampleCounts(this.segment(), 0L, value); return this; }

    /// {@return `fragmentSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment fragmentSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_fragmentSize, index), LAYOUT_fragmentSize); }
    /// {@return `fragmentSize`}
    public MemorySegment fragmentSize() { return fragmentSize(this.segment(), 0L); }
    /// Sets `fragmentSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_fragmentSize, index), LAYOUT_fragmentSize.byteSize()); }
    /// Sets `fragmentSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateKHR fragmentSize(MemorySegment value) { fragmentSize(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceFragmentShadingRateKHR].
    public static final class Buffer extends VkPhysicalDeviceFragmentShadingRateKHR {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceFragmentShadingRateKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceFragmentShadingRateKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceFragmentShadingRateKHR`
        public VkPhysicalDeviceFragmentShadingRateKHR asSlice(long index) { return new VkPhysicalDeviceFragmentShadingRateKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceFragmentShadingRateKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceFragmentShadingRateKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `sampleCounts` at the given index}
        /// @param index the index of the struct buffer
        public int sampleCountsAt(long index) { return sampleCounts(this.segment(), index); }
        /// Sets `sampleCounts` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sampleCountsAt(long index, int value) { sampleCounts(this.segment(), index, value); return this; }

        /// {@return `fragmentSize` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment fragmentSizeAt(long index) { return fragmentSize(this.segment(), index); }
        /// Sets `fragmentSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer fragmentSizeAt(long index, MemorySegment value) { fragmentSize(this.segment(), index, value); return this; }

    }
}
