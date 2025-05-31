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
/// struct VkClusterAccelerationStructureCommandsInfoNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (struct VkClusterAccelerationStructureInputInfoNV) VkClusterAccelerationStructureInputInfoNV input;
///     (uint64_t) VkDeviceAddress dstImplicitData;
///     (uint64_t) VkDeviceAddress scratchData;
///     (struct VkStridedDeviceAddressRegionKHR) VkStridedDeviceAddressRegionKHR dstAddressesArray;
///     (struct VkStridedDeviceAddressRegionKHR) VkStridedDeviceAddressRegionKHR dstSizesArray;
///     (struct VkStridedDeviceAddressRegionKHR) VkStridedDeviceAddressRegionKHR srcInfosArray;
///     (uint64_t) VkDeviceAddress srcInfosCount;
///     ((uint32_t) VkFlags) VkClusterAccelerationStructureAddressResolutionFlagsNV addressResolutionFlags;
/// };
/// ```
public sealed class VkClusterAccelerationStructureCommandsInfoNV extends GroupType {
    /// The struct layout of `VkClusterAccelerationStructureCommandsInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.nv.struct.VkClusterAccelerationStructureInputInfoNV.LAYOUT.withName("input"),
        ValueLayout.JAVA_LONG.withName("dstImplicitData"),
        ValueLayout.JAVA_LONG.withName("scratchData"),
        overrungl.vulkan.khr.struct.VkStridedDeviceAddressRegionKHR.LAYOUT.withName("dstAddressesArray"),
        overrungl.vulkan.khr.struct.VkStridedDeviceAddressRegionKHR.LAYOUT.withName("dstSizesArray"),
        overrungl.vulkan.khr.struct.VkStridedDeviceAddressRegionKHR.LAYOUT.withName("srcInfosArray"),
        ValueLayout.JAVA_LONG.withName("srcInfosCount"),
        ValueLayout.JAVA_INT.withName("addressResolutionFlags")
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
    /// The byte offset of `input`.
    public static final long OFFSET_input = LAYOUT.byteOffset(PathElement.groupElement("input"));
    /// The memory layout of `input`.
    public static final MemoryLayout LAYOUT_input = LAYOUT.select(PathElement.groupElement("input"));
    /// The byte offset of `dstImplicitData`.
    public static final long OFFSET_dstImplicitData = LAYOUT.byteOffset(PathElement.groupElement("dstImplicitData"));
    /// The memory layout of `dstImplicitData`.
    public static final MemoryLayout LAYOUT_dstImplicitData = LAYOUT.select(PathElement.groupElement("dstImplicitData"));
    /// The [VarHandle] of `dstImplicitData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstImplicitData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstImplicitData"));
    /// The byte offset of `scratchData`.
    public static final long OFFSET_scratchData = LAYOUT.byteOffset(PathElement.groupElement("scratchData"));
    /// The memory layout of `scratchData`.
    public static final MemoryLayout LAYOUT_scratchData = LAYOUT.select(PathElement.groupElement("scratchData"));
    /// The [VarHandle] of `scratchData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_scratchData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scratchData"));
    /// The byte offset of `dstAddressesArray`.
    public static final long OFFSET_dstAddressesArray = LAYOUT.byteOffset(PathElement.groupElement("dstAddressesArray"));
    /// The memory layout of `dstAddressesArray`.
    public static final MemoryLayout LAYOUT_dstAddressesArray = LAYOUT.select(PathElement.groupElement("dstAddressesArray"));
    /// The byte offset of `dstSizesArray`.
    public static final long OFFSET_dstSizesArray = LAYOUT.byteOffset(PathElement.groupElement("dstSizesArray"));
    /// The memory layout of `dstSizesArray`.
    public static final MemoryLayout LAYOUT_dstSizesArray = LAYOUT.select(PathElement.groupElement("dstSizesArray"));
    /// The byte offset of `srcInfosArray`.
    public static final long OFFSET_srcInfosArray = LAYOUT.byteOffset(PathElement.groupElement("srcInfosArray"));
    /// The memory layout of `srcInfosArray`.
    public static final MemoryLayout LAYOUT_srcInfosArray = LAYOUT.select(PathElement.groupElement("srcInfosArray"));
    /// The byte offset of `srcInfosCount`.
    public static final long OFFSET_srcInfosCount = LAYOUT.byteOffset(PathElement.groupElement("srcInfosCount"));
    /// The memory layout of `srcInfosCount`.
    public static final MemoryLayout LAYOUT_srcInfosCount = LAYOUT.select(PathElement.groupElement("srcInfosCount"));
    /// The [VarHandle] of `srcInfosCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcInfosCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcInfosCount"));
    /// The byte offset of `addressResolutionFlags`.
    public static final long OFFSET_addressResolutionFlags = LAYOUT.byteOffset(PathElement.groupElement("addressResolutionFlags"));
    /// The memory layout of `addressResolutionFlags`.
    public static final MemoryLayout LAYOUT_addressResolutionFlags = LAYOUT.select(PathElement.groupElement("addressResolutionFlags"));
    /// The [VarHandle] of `addressResolutionFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_addressResolutionFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("addressResolutionFlags"));

    /// Creates `VkClusterAccelerationStructureCommandsInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkClusterAccelerationStructureCommandsInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkClusterAccelerationStructureCommandsInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkClusterAccelerationStructureCommandsInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureCommandsInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureCommandsInfoNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkClusterAccelerationStructureCommandsInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkClusterAccelerationStructureCommandsInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClusterAccelerationStructureCommandsInfoNV`
    public static VkClusterAccelerationStructureCommandsInfoNV alloc(SegmentAllocator allocator) { return new VkClusterAccelerationStructureCommandsInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkClusterAccelerationStructureCommandsInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClusterAccelerationStructureCommandsInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkClusterAccelerationStructureCommandsInfoNV copyFrom(VkClusterAccelerationStructureCommandsInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkClusterAccelerationStructureCommandsInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkClusterAccelerationStructureCommandsInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `input` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment input(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_input, index), LAYOUT_input); }
    /// {@return `input`}
    public MemorySegment input() { return input(this.segment(), 0L); }
    /// Sets `input` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void input(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_input, index), LAYOUT_input.byteSize()); }
    /// Sets `input` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureCommandsInfoNV input(MemorySegment value) { input(this.segment(), 0L, value); return this; }

    /// {@return `dstImplicitData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstImplicitData(MemorySegment segment, long index) { return (long) VH_dstImplicitData.get(segment, 0L, index); }
    /// {@return `dstImplicitData`}
    public long dstImplicitData() { return dstImplicitData(this.segment(), 0L); }
    /// Sets `dstImplicitData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstImplicitData(MemorySegment segment, long index, long value) { VH_dstImplicitData.set(segment, 0L, index, value); }
    /// Sets `dstImplicitData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureCommandsInfoNV dstImplicitData(long value) { dstImplicitData(this.segment(), 0L, value); return this; }

    /// {@return `scratchData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long scratchData(MemorySegment segment, long index) { return (long) VH_scratchData.get(segment, 0L, index); }
    /// {@return `scratchData`}
    public long scratchData() { return scratchData(this.segment(), 0L); }
    /// Sets `scratchData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void scratchData(MemorySegment segment, long index, long value) { VH_scratchData.set(segment, 0L, index, value); }
    /// Sets `scratchData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureCommandsInfoNV scratchData(long value) { scratchData(this.segment(), 0L, value); return this; }

    /// {@return `dstAddressesArray` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment dstAddressesArray(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_dstAddressesArray, index), LAYOUT_dstAddressesArray); }
    /// {@return `dstAddressesArray`}
    public MemorySegment dstAddressesArray() { return dstAddressesArray(this.segment(), 0L); }
    /// Sets `dstAddressesArray` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstAddressesArray(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_dstAddressesArray, index), LAYOUT_dstAddressesArray.byteSize()); }
    /// Sets `dstAddressesArray` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureCommandsInfoNV dstAddressesArray(MemorySegment value) { dstAddressesArray(this.segment(), 0L, value); return this; }

    /// {@return `dstSizesArray` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment dstSizesArray(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_dstSizesArray, index), LAYOUT_dstSizesArray); }
    /// {@return `dstSizesArray`}
    public MemorySegment dstSizesArray() { return dstSizesArray(this.segment(), 0L); }
    /// Sets `dstSizesArray` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstSizesArray(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_dstSizesArray, index), LAYOUT_dstSizesArray.byteSize()); }
    /// Sets `dstSizesArray` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureCommandsInfoNV dstSizesArray(MemorySegment value) { dstSizesArray(this.segment(), 0L, value); return this; }

    /// {@return `srcInfosArray` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment srcInfosArray(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_srcInfosArray, index), LAYOUT_srcInfosArray); }
    /// {@return `srcInfosArray`}
    public MemorySegment srcInfosArray() { return srcInfosArray(this.segment(), 0L); }
    /// Sets `srcInfosArray` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcInfosArray(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_srcInfosArray, index), LAYOUT_srcInfosArray.byteSize()); }
    /// Sets `srcInfosArray` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureCommandsInfoNV srcInfosArray(MemorySegment value) { srcInfosArray(this.segment(), 0L, value); return this; }

    /// {@return `srcInfosCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcInfosCount(MemorySegment segment, long index) { return (long) VH_srcInfosCount.get(segment, 0L, index); }
    /// {@return `srcInfosCount`}
    public long srcInfosCount() { return srcInfosCount(this.segment(), 0L); }
    /// Sets `srcInfosCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcInfosCount(MemorySegment segment, long index, long value) { VH_srcInfosCount.set(segment, 0L, index, value); }
    /// Sets `srcInfosCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureCommandsInfoNV srcInfosCount(long value) { srcInfosCount(this.segment(), 0L, value); return this; }

    /// {@return `addressResolutionFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int addressResolutionFlags(MemorySegment segment, long index) { return (int) VH_addressResolutionFlags.get(segment, 0L, index); }
    /// {@return `addressResolutionFlags`}
    public int addressResolutionFlags() { return addressResolutionFlags(this.segment(), 0L); }
    /// Sets `addressResolutionFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void addressResolutionFlags(MemorySegment segment, long index, int value) { VH_addressResolutionFlags.set(segment, 0L, index, value); }
    /// Sets `addressResolutionFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureCommandsInfoNV addressResolutionFlags(int value) { addressResolutionFlags(this.segment(), 0L, value); return this; }

    /// A buffer of [VkClusterAccelerationStructureCommandsInfoNV].
    public static final class Buffer extends VkClusterAccelerationStructureCommandsInfoNV {
        private final long elementCount;

        /// Creates `VkClusterAccelerationStructureCommandsInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkClusterAccelerationStructureCommandsInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkClusterAccelerationStructureCommandsInfoNV`
        public VkClusterAccelerationStructureCommandsInfoNV asSlice(long index) { return new VkClusterAccelerationStructureCommandsInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkClusterAccelerationStructureCommandsInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkClusterAccelerationStructureCommandsInfoNV`
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

        /// {@return `input` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment inputAt(long index) { return input(this.segment(), index); }
        /// Sets `input` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer inputAt(long index, MemorySegment value) { input(this.segment(), index, value); return this; }

        /// {@return `dstImplicitData` at the given index}
        /// @param index the index of the struct buffer
        public long dstImplicitDataAt(long index) { return dstImplicitData(this.segment(), index); }
        /// Sets `dstImplicitData` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstImplicitDataAt(long index, long value) { dstImplicitData(this.segment(), index, value); return this; }

        /// {@return `scratchData` at the given index}
        /// @param index the index of the struct buffer
        public long scratchDataAt(long index) { return scratchData(this.segment(), index); }
        /// Sets `scratchData` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer scratchDataAt(long index, long value) { scratchData(this.segment(), index, value); return this; }

        /// {@return `dstAddressesArray` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment dstAddressesArrayAt(long index) { return dstAddressesArray(this.segment(), index); }
        /// Sets `dstAddressesArray` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstAddressesArrayAt(long index, MemorySegment value) { dstAddressesArray(this.segment(), index, value); return this; }

        /// {@return `dstSizesArray` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment dstSizesArrayAt(long index) { return dstSizesArray(this.segment(), index); }
        /// Sets `dstSizesArray` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstSizesArrayAt(long index, MemorySegment value) { dstSizesArray(this.segment(), index, value); return this; }

        /// {@return `srcInfosArray` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment srcInfosArrayAt(long index) { return srcInfosArray(this.segment(), index); }
        /// Sets `srcInfosArray` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcInfosArrayAt(long index, MemorySegment value) { srcInfosArray(this.segment(), index, value); return this; }

        /// {@return `srcInfosCount` at the given index}
        /// @param index the index of the struct buffer
        public long srcInfosCountAt(long index) { return srcInfosCount(this.segment(), index); }
        /// Sets `srcInfosCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcInfosCountAt(long index, long value) { srcInfosCount(this.segment(), index, value); return this; }

        /// {@return `addressResolutionFlags` at the given index}
        /// @param index the index of the struct buffer
        public int addressResolutionFlagsAt(long index) { return addressResolutionFlags(this.segment(), index); }
        /// Sets `addressResolutionFlags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer addressResolutionFlagsAt(long index, int value) { addressResolutionFlags(this.segment(), index, value); return this; }

    }
}
