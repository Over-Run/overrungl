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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceCudaKernelLaunchPropertiesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t computeCapabilityMinor;
///     uint32_t computeCapabilityMajor;
/// };
/// ```
public sealed class VkPhysicalDeviceCudaKernelLaunchPropertiesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceCudaKernelLaunchPropertiesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("computeCapabilityMinor"),
        ValueLayout.JAVA_INT.withName("computeCapabilityMajor")
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
    /// The byte offset of `computeCapabilityMinor`.
    public static final long OFFSET_computeCapabilityMinor = LAYOUT.byteOffset(PathElement.groupElement("computeCapabilityMinor"));
    /// The memory layout of `computeCapabilityMinor`.
    public static final MemoryLayout LAYOUT_computeCapabilityMinor = LAYOUT.select(PathElement.groupElement("computeCapabilityMinor"));
    /// The [VarHandle] of `computeCapabilityMinor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_computeCapabilityMinor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeCapabilityMinor"));
    /// The byte offset of `computeCapabilityMajor`.
    public static final long OFFSET_computeCapabilityMajor = LAYOUT.byteOffset(PathElement.groupElement("computeCapabilityMajor"));
    /// The memory layout of `computeCapabilityMajor`.
    public static final MemoryLayout LAYOUT_computeCapabilityMajor = LAYOUT.select(PathElement.groupElement("computeCapabilityMajor"));
    /// The [VarHandle] of `computeCapabilityMajor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_computeCapabilityMajor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeCapabilityMajor"));

    /// Creates `VkPhysicalDeviceCudaKernelLaunchPropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceCudaKernelLaunchPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceCudaKernelLaunchPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceCudaKernelLaunchPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceCudaKernelLaunchPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceCudaKernelLaunchPropertiesNV`
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceCudaKernelLaunchPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceCudaKernelLaunchPropertiesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceCudaKernelLaunchPropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param computeCapabilityMinor `computeCapabilityMinor`
    /// @param computeCapabilityMajor `computeCapabilityMajor`
    /// @return the allocated `VkPhysicalDeviceCudaKernelLaunchPropertiesNV`
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int computeCapabilityMinor, int computeCapabilityMajor) {
        return alloc(allocator).sType(sType).pNext(pNext).computeCapabilityMinor(computeCapabilityMinor).computeCapabilityMajor(computeCapabilityMajor);
    }

    /// Allocates a `VkPhysicalDeviceCudaKernelLaunchPropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param computeCapabilityMinor `computeCapabilityMinor`
    /// @return the allocated `VkPhysicalDeviceCudaKernelLaunchPropertiesNV`
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int computeCapabilityMinor) {
        return alloc(allocator).sType(sType).pNext(pNext).computeCapabilityMinor(computeCapabilityMinor);
    }

    /// Allocates a `VkPhysicalDeviceCudaKernelLaunchPropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceCudaKernelLaunchPropertiesNV`
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceCudaKernelLaunchPropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceCudaKernelLaunchPropertiesNV`
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV copyFrom(VkPhysicalDeviceCudaKernelLaunchPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `computeCapabilityMinor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int computeCapabilityMinor(MemorySegment segment, long index) { return (int) VH_computeCapabilityMinor.get(segment, 0L, index); }
    /// {@return `computeCapabilityMinor`}
    public int computeCapabilityMinor() { return computeCapabilityMinor(this.segment(), 0L); }
    /// Sets `computeCapabilityMinor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void computeCapabilityMinor(MemorySegment segment, long index, int value) { VH_computeCapabilityMinor.set(segment, 0L, index, value); }
    /// Sets `computeCapabilityMinor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV computeCapabilityMinor(int value) { computeCapabilityMinor(this.segment(), 0L, value); return this; }

    /// {@return `computeCapabilityMajor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int computeCapabilityMajor(MemorySegment segment, long index) { return (int) VH_computeCapabilityMajor.get(segment, 0L, index); }
    /// {@return `computeCapabilityMajor`}
    public int computeCapabilityMajor() { return computeCapabilityMajor(this.segment(), 0L); }
    /// Sets `computeCapabilityMajor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void computeCapabilityMajor(MemorySegment segment, long index, int value) { VH_computeCapabilityMajor.set(segment, 0L, index, value); }
    /// Sets `computeCapabilityMajor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV computeCapabilityMajor(int value) { computeCapabilityMajor(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceCudaKernelLaunchPropertiesNV].
    public static final class Buffer extends VkPhysicalDeviceCudaKernelLaunchPropertiesNV {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceCudaKernelLaunchPropertiesNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceCudaKernelLaunchPropertiesNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceCudaKernelLaunchPropertiesNV`
        public VkPhysicalDeviceCudaKernelLaunchPropertiesNV asSlice(long index) { return new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceCudaKernelLaunchPropertiesNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceCudaKernelLaunchPropertiesNV`
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

        /// {@return `computeCapabilityMinor` at the given index}
        /// @param index the index of the struct buffer
        public int computeCapabilityMinorAt(long index) { return computeCapabilityMinor(this.segment(), index); }
        /// Sets `computeCapabilityMinor` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer computeCapabilityMinorAt(long index, int value) { computeCapabilityMinor(this.segment(), index, value); return this; }

        /// {@return `computeCapabilityMajor` at the given index}
        /// @param index the index of the struct buffer
        public int computeCapabilityMajorAt(long index) { return computeCapabilityMajor(this.segment(), index); }
        /// Sets `computeCapabilityMajor` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer computeCapabilityMajorAt(long index, int value) { computeCapabilityMajor(this.segment(), index, value); return this; }

    }
}
