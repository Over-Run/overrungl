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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceFaultFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 deviceFault;
///     (uint32_t) VkBool32 deviceFaultVendorBinary;
/// };
/// ```
public sealed class VkPhysicalDeviceFaultFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceFaultFeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceFault"),
        ValueLayout.JAVA_INT.withName("deviceFaultVendorBinary")
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
    /// The byte offset of `deviceFault`.
    public static final long OFFSET_deviceFault = LAYOUT.byteOffset(PathElement.groupElement("deviceFault"));
    /// The memory layout of `deviceFault`.
    public static final MemoryLayout LAYOUT_deviceFault = LAYOUT.select(PathElement.groupElement("deviceFault"));
    /// The [VarHandle] of `deviceFault` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceFault = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceFault"));
    /// The byte offset of `deviceFaultVendorBinary`.
    public static final long OFFSET_deviceFaultVendorBinary = LAYOUT.byteOffset(PathElement.groupElement("deviceFaultVendorBinary"));
    /// The memory layout of `deviceFaultVendorBinary`.
    public static final MemoryLayout LAYOUT_deviceFaultVendorBinary = LAYOUT.select(PathElement.groupElement("deviceFaultVendorBinary"));
    /// The [VarHandle] of `deviceFaultVendorBinary` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceFaultVendorBinary = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceFaultVendorBinary"));

    /// Creates `VkPhysicalDeviceFaultFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceFaultFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceFaultFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceFaultFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFaultFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFaultFeaturesEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceFaultFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceFaultFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFaultFeaturesEXT`
    public static VkPhysicalDeviceFaultFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFaultFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceFaultFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFaultFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceFaultFeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param deviceFault `deviceFault`
    /// @param deviceFaultVendorBinary `deviceFaultVendorBinary`
    /// @return the allocated `VkPhysicalDeviceFaultFeaturesEXT`
    public static VkPhysicalDeviceFaultFeaturesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int deviceFault, int deviceFaultVendorBinary) {
        return alloc(allocator).sType(sType).pNext(pNext).deviceFault(deviceFault).deviceFaultVendorBinary(deviceFaultVendorBinary);
    }

    /// Allocates a `VkPhysicalDeviceFaultFeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param deviceFault `deviceFault`
    /// @return the allocated `VkPhysicalDeviceFaultFeaturesEXT`
    public static VkPhysicalDeviceFaultFeaturesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int deviceFault) {
        return alloc(allocator).sType(sType).pNext(pNext).deviceFault(deviceFault);
    }

    /// Allocates a `VkPhysicalDeviceFaultFeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceFaultFeaturesEXT`
    public static VkPhysicalDeviceFaultFeaturesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceFaultFeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceFaultFeaturesEXT`
    public static VkPhysicalDeviceFaultFeaturesEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceFaultFeaturesEXT copyFrom(VkPhysicalDeviceFaultFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceFaultFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceFaultFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `deviceFault` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceFault(MemorySegment segment, long index) { return (int) VH_deviceFault.get(segment, 0L, index); }
    /// {@return `deviceFault`}
    public int deviceFault() { return deviceFault(this.segment(), 0L); }
    /// Sets `deviceFault` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceFault(MemorySegment segment, long index, int value) { VH_deviceFault.set(segment, 0L, index, value); }
    /// Sets `deviceFault` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFaultFeaturesEXT deviceFault(int value) { deviceFault(this.segment(), 0L, value); return this; }

    /// {@return `deviceFaultVendorBinary` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceFaultVendorBinary(MemorySegment segment, long index) { return (int) VH_deviceFaultVendorBinary.get(segment, 0L, index); }
    /// {@return `deviceFaultVendorBinary`}
    public int deviceFaultVendorBinary() { return deviceFaultVendorBinary(this.segment(), 0L); }
    /// Sets `deviceFaultVendorBinary` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceFaultVendorBinary(MemorySegment segment, long index, int value) { VH_deviceFaultVendorBinary.set(segment, 0L, index, value); }
    /// Sets `deviceFaultVendorBinary` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFaultFeaturesEXT deviceFaultVendorBinary(int value) { deviceFaultVendorBinary(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceFaultFeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceFaultFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceFaultFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceFaultFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceFaultFeaturesEXT`
        public VkPhysicalDeviceFaultFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceFaultFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceFaultFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceFaultFeaturesEXT`
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

        /// {@return `deviceFault` at the given index}
        /// @param index the index of the struct buffer
        public int deviceFaultAt(long index) { return deviceFault(this.segment(), index); }
        /// Sets `deviceFault` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer deviceFaultAt(long index, int value) { deviceFault(this.segment(), index, value); return this; }

        /// {@return `deviceFaultVendorBinary` at the given index}
        /// @param index the index of the struct buffer
        public int deviceFaultVendorBinaryAt(long index) { return deviceFaultVendorBinary(this.segment(), index); }
        /// Sets `deviceFaultVendorBinary` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer deviceFaultVendorBinaryAt(long index, int value) { deviceFaultVendorBinary(this.segment(), index, value); return this; }

    }
}
