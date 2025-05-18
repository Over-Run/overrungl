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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceGroupProperties {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t physicalDeviceCount;
///     (struct VkPhysicalDevice*) VkPhysicalDevice physicalDevices[32];
///     (uint32_t) VkBool32 subsetAllocation;
/// };
/// ```
public sealed class VkPhysicalDeviceGroupProperties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceGroupProperties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("physicalDeviceCount"),
        MemoryLayout.sequenceLayout(32, ValueLayout.ADDRESS).withName("physicalDevices"),
        ValueLayout.JAVA_INT.withName("subsetAllocation")
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
    /// The byte offset of `physicalDeviceCount`.
    public static final long OFFSET_physicalDeviceCount = LAYOUT.byteOffset(PathElement.groupElement("physicalDeviceCount"));
    /// The memory layout of `physicalDeviceCount`.
    public static final MemoryLayout LAYOUT_physicalDeviceCount = LAYOUT.select(PathElement.groupElement("physicalDeviceCount"));
    /// The [VarHandle] of `physicalDeviceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_physicalDeviceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("physicalDeviceCount"));
    /// The byte offset of `physicalDevices`.
    public static final long OFFSET_physicalDevices = LAYOUT.byteOffset(PathElement.groupElement("physicalDevices"));
    /// The memory layout of `physicalDevices`.
    public static final MemoryLayout LAYOUT_physicalDevices = LAYOUT.select(PathElement.groupElement("physicalDevices"));
    /// The [VarHandle] of `physicalDevices` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_physicalDevices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("physicalDevices"), PathElement.sequenceElement());
    /// The byte offset of `subsetAllocation`.
    public static final long OFFSET_subsetAllocation = LAYOUT.byteOffset(PathElement.groupElement("subsetAllocation"));
    /// The memory layout of `subsetAllocation`.
    public static final MemoryLayout LAYOUT_subsetAllocation = LAYOUT.select(PathElement.groupElement("subsetAllocation"));
    /// The [VarHandle] of `subsetAllocation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subsetAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subsetAllocation"));

    /// Creates `VkPhysicalDeviceGroupProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceGroupProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceGroupProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceGroupProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceGroupProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceGroupProperties(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceGroupProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceGroupProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceGroupProperties`
    public static VkPhysicalDeviceGroupProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceGroupProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceGroupProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceGroupProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceGroupProperties copyFrom(VkPhysicalDeviceGroupProperties src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceGroupProperties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceGroupProperties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `physicalDeviceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int physicalDeviceCount(MemorySegment segment, long index) { return (int) VH_physicalDeviceCount.get(segment, 0L, index); }
    /// {@return `physicalDeviceCount`}
    public int physicalDeviceCount() { return physicalDeviceCount(this.segment(), 0L); }
    /// Sets `physicalDeviceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void physicalDeviceCount(MemorySegment segment, long index, int value) { VH_physicalDeviceCount.set(segment, 0L, index, value); }
    /// Sets `physicalDeviceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGroupProperties physicalDeviceCount(int value) { physicalDeviceCount(this.segment(), 0L, value); return this; }

    /// {@return `physicalDevices` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment physicalDevices(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_physicalDevices, index), LAYOUT_physicalDevices); }
    /// {@return `physicalDevices` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static MemorySegment physicalDevices(MemorySegment segment, long index, long index0) { return (MemorySegment) VH_physicalDevices.get(segment, 0L, index, index0); }
    /// {@return `physicalDevices`}
    public MemorySegment physicalDevices() { return physicalDevices(this.segment(), 0L); }
    /// {@return `physicalDevices`}
    /// @param index0 the Index 0 of the array
    public MemorySegment physicalDevices(long index0) { return physicalDevices(this.segment(), 0L, index0); }
    /// Sets `physicalDevices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void physicalDevices(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_physicalDevices, index), LAYOUT_physicalDevices.byteSize()); }
    /// Sets `physicalDevices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void physicalDevices(MemorySegment segment, long index, long index0, MemorySegment value) { VH_physicalDevices.set(segment, 0L, index, index0, value); }
    /// Sets `physicalDevices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGroupProperties physicalDevices(MemorySegment value) { physicalDevices(this.segment(), 0L, value); return this; }
    /// Sets `physicalDevices` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGroupProperties physicalDevices(long index0, MemorySegment value) { physicalDevices(this.segment(), 0L, index0, value); return this; }

    /// {@return `subsetAllocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subsetAllocation(MemorySegment segment, long index) { return (int) VH_subsetAllocation.get(segment, 0L, index); }
    /// {@return `subsetAllocation`}
    public int subsetAllocation() { return subsetAllocation(this.segment(), 0L); }
    /// Sets `subsetAllocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subsetAllocation(MemorySegment segment, long index, int value) { VH_subsetAllocation.set(segment, 0L, index, value); }
    /// Sets `subsetAllocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGroupProperties subsetAllocation(int value) { subsetAllocation(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceGroupProperties].
    public static final class Buffer extends VkPhysicalDeviceGroupProperties {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceGroupProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceGroupProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceGroupProperties`
        public VkPhysicalDeviceGroupProperties asSlice(long index) { return new VkPhysicalDeviceGroupProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceGroupProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceGroupProperties`
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

        /// {@return `physicalDeviceCount` at the given index}
        /// @param index the index of the struct buffer
        public int physicalDeviceCountAt(long index) { return physicalDeviceCount(this.segment(), index); }
        /// Sets `physicalDeviceCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer physicalDeviceCountAt(long index, int value) { physicalDeviceCount(this.segment(), index, value); return this; }

        /// {@return `physicalDevices` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment physicalDevicesAt(long index) { return physicalDevices(this.segment(), index); }
        /// {@return `physicalDevices` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public MemorySegment physicalDevicesAt(long index, long index0) { return physicalDevices(this.segment(), index, index0); }
        /// Sets `physicalDevices` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer physicalDevicesAt(long index, MemorySegment value) { physicalDevices(this.segment(), index, value); return this; }
        /// Sets `physicalDevices` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer physicalDevicesAt(long index, long index0, MemorySegment value) { physicalDevices(this.segment(), index, index0, value); return this; }

        /// {@return `subsetAllocation` at the given index}
        /// @param index the index of the struct buffer
        public int subsetAllocationAt(long index) { return subsetAllocation(this.segment(), index); }
        /// Sets `subsetAllocation` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer subsetAllocationAt(long index, int value) { subsetAllocation(this.segment(), index, value); return this; }

    }
}
