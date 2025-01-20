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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### deviceIndexCount
/// [VarHandle][#VH_deviceIndexCount] - [Getter][#deviceIndexCount()] - [Setter][#deviceIndexCount(int)]
/// ### pDeviceIndices
/// [VarHandle][#VH_pDeviceIndices] - [Getter][#pDeviceIndices()] - [Setter][#pDeviceIndices(MemorySegment)]
/// ### splitInstanceBindRegionCount
/// [VarHandle][#VH_splitInstanceBindRegionCount] - [Getter][#splitInstanceBindRegionCount()] - [Setter][#splitInstanceBindRegionCount(int)]
/// ### pSplitInstanceBindRegions
/// [VarHandle][#VH_pSplitInstanceBindRegions] - [Getter][#pSplitInstanceBindRegions()] - [Setter][#pSplitInstanceBindRegions(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkBindImageMemoryDeviceGroupInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t deviceIndexCount;
///     const uint32_t * pDeviceIndices;
///     uint32_t splitInstanceBindRegionCount;
///     const VkRect2D * pSplitInstanceBindRegions;
/// } VkBindImageMemoryDeviceGroupInfo;
/// ```
public sealed class VkBindImageMemoryDeviceGroupInfo extends Struct {
    /// The struct layout of `VkBindImageMemoryDeviceGroupInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceIndexCount"),
        ValueLayout.ADDRESS.withName("pDeviceIndices"),
        ValueLayout.JAVA_INT.withName("splitInstanceBindRegionCount"),
        ValueLayout.ADDRESS.withName("pSplitInstanceBindRegions")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `deviceIndexCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceIndexCount"));
    /// The [VarHandle] of `pDeviceIndices` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDeviceIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDeviceIndices"));
    /// The [VarHandle] of `splitInstanceBindRegionCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_splitInstanceBindRegionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("splitInstanceBindRegionCount"));
    /// The [VarHandle] of `pSplitInstanceBindRegions` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSplitInstanceBindRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSplitInstanceBindRegions"));

    /// Creates `VkBindImageMemoryDeviceGroupInfo` with the given segment.
    /// @param segment the memory segment
    public VkBindImageMemoryDeviceGroupInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBindImageMemoryDeviceGroupInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindImageMemoryDeviceGroupInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindImageMemoryDeviceGroupInfo(segment); }

    /// Creates `VkBindImageMemoryDeviceGroupInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindImageMemoryDeviceGroupInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindImageMemoryDeviceGroupInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindImageMemoryDeviceGroupInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBindImageMemoryDeviceGroupInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkBindImageMemoryDeviceGroupInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindImageMemoryDeviceGroupInfo`
    public static VkBindImageMemoryDeviceGroupInfo alloc(SegmentAllocator allocator) { return new VkBindImageMemoryDeviceGroupInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBindImageMemoryDeviceGroupInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindImageMemoryDeviceGroupInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBindImageMemoryDeviceGroupInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindImageMemoryDeviceGroupInfo`
    public static VkBindImageMemoryDeviceGroupInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("uint32_t") int deviceIndexCount, @CType("const uint32_t *") MemorySegment pDeviceIndices, @CType("uint32_t") int splitInstanceBindRegionCount, @CType("const VkRect2D *") MemorySegment pSplitInstanceBindRegions) { return alloc(allocator).sType(sType).pNext(pNext).deviceIndexCount(deviceIndexCount).pDeviceIndices(pDeviceIndices).splitInstanceBindRegionCount(splitInstanceBindRegionCount).pSplitInstanceBindRegions(pSplitInstanceBindRegions); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindImageMemoryDeviceGroupInfo copyFrom(VkBindImageMemoryDeviceGroupInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkBindImageMemoryDeviceGroupInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkBindImageMemoryDeviceGroupInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkBindImageMemoryDeviceGroupInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindImageMemoryDeviceGroupInfo sType(@CType("VkStructureType") int value) { VkBindImageMemoryDeviceGroupInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkBindImageMemoryDeviceGroupInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkBindImageMemoryDeviceGroupInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkBindImageMemoryDeviceGroupInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindImageMemoryDeviceGroupInfo pNext(@CType("const void *") MemorySegment value) { VkBindImageMemoryDeviceGroupInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `deviceIndexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_deviceIndexCount(MemorySegment segment, long index) { return (int) VH_deviceIndexCount.get(segment, 0L, index); }
    /// {@return `deviceIndexCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_deviceIndexCount(MemorySegment segment) { return VkBindImageMemoryDeviceGroupInfo.get_deviceIndexCount(segment, 0L); }
    /// {@return `deviceIndexCount`}
    public @CType("uint32_t") int deviceIndexCount() { return VkBindImageMemoryDeviceGroupInfo.get_deviceIndexCount(this.segment()); }
    /// Sets `deviceIndexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceIndexCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_deviceIndexCount.set(segment, 0L, index, value); }
    /// Sets `deviceIndexCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceIndexCount(MemorySegment segment, @CType("uint32_t") int value) { VkBindImageMemoryDeviceGroupInfo.set_deviceIndexCount(segment, 0L, value); }
    /// Sets `deviceIndexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindImageMemoryDeviceGroupInfo deviceIndexCount(@CType("uint32_t") int value) { VkBindImageMemoryDeviceGroupInfo.set_deviceIndexCount(this.segment(), value); return this; }

    /// {@return `pDeviceIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") MemorySegment get_pDeviceIndices(MemorySegment segment, long index) { return (MemorySegment) VH_pDeviceIndices.get(segment, 0L, index); }
    /// {@return `pDeviceIndices`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") MemorySegment get_pDeviceIndices(MemorySegment segment) { return VkBindImageMemoryDeviceGroupInfo.get_pDeviceIndices(segment, 0L); }
    /// {@return `pDeviceIndices`}
    public @CType("const uint32_t *") MemorySegment pDeviceIndices() { return VkBindImageMemoryDeviceGroupInfo.get_pDeviceIndices(this.segment()); }
    /// Sets `pDeviceIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDeviceIndices(MemorySegment segment, long index, @CType("const uint32_t *") MemorySegment value) { VH_pDeviceIndices.set(segment, 0L, index, value); }
    /// Sets `pDeviceIndices` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDeviceIndices(MemorySegment segment, @CType("const uint32_t *") MemorySegment value) { VkBindImageMemoryDeviceGroupInfo.set_pDeviceIndices(segment, 0L, value); }
    /// Sets `pDeviceIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindImageMemoryDeviceGroupInfo pDeviceIndices(@CType("const uint32_t *") MemorySegment value) { VkBindImageMemoryDeviceGroupInfo.set_pDeviceIndices(this.segment(), value); return this; }

    /// {@return `splitInstanceBindRegionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_splitInstanceBindRegionCount(MemorySegment segment, long index) { return (int) VH_splitInstanceBindRegionCount.get(segment, 0L, index); }
    /// {@return `splitInstanceBindRegionCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_splitInstanceBindRegionCount(MemorySegment segment) { return VkBindImageMemoryDeviceGroupInfo.get_splitInstanceBindRegionCount(segment, 0L); }
    /// {@return `splitInstanceBindRegionCount`}
    public @CType("uint32_t") int splitInstanceBindRegionCount() { return VkBindImageMemoryDeviceGroupInfo.get_splitInstanceBindRegionCount(this.segment()); }
    /// Sets `splitInstanceBindRegionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_splitInstanceBindRegionCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_splitInstanceBindRegionCount.set(segment, 0L, index, value); }
    /// Sets `splitInstanceBindRegionCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_splitInstanceBindRegionCount(MemorySegment segment, @CType("uint32_t") int value) { VkBindImageMemoryDeviceGroupInfo.set_splitInstanceBindRegionCount(segment, 0L, value); }
    /// Sets `splitInstanceBindRegionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindImageMemoryDeviceGroupInfo splitInstanceBindRegionCount(@CType("uint32_t") int value) { VkBindImageMemoryDeviceGroupInfo.set_splitInstanceBindRegionCount(this.segment(), value); return this; }

    /// {@return `pSplitInstanceBindRegions` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkRect2D *") MemorySegment get_pSplitInstanceBindRegions(MemorySegment segment, long index) { return (MemorySegment) VH_pSplitInstanceBindRegions.get(segment, 0L, index); }
    /// {@return `pSplitInstanceBindRegions`}
    /// @param segment the segment of the struct
    public static @CType("const VkRect2D *") MemorySegment get_pSplitInstanceBindRegions(MemorySegment segment) { return VkBindImageMemoryDeviceGroupInfo.get_pSplitInstanceBindRegions(segment, 0L); }
    /// {@return `pSplitInstanceBindRegions`}
    public @CType("const VkRect2D *") MemorySegment pSplitInstanceBindRegions() { return VkBindImageMemoryDeviceGroupInfo.get_pSplitInstanceBindRegions(this.segment()); }
    /// Sets `pSplitInstanceBindRegions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSplitInstanceBindRegions(MemorySegment segment, long index, @CType("const VkRect2D *") MemorySegment value) { VH_pSplitInstanceBindRegions.set(segment, 0L, index, value); }
    /// Sets `pSplitInstanceBindRegions` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSplitInstanceBindRegions(MemorySegment segment, @CType("const VkRect2D *") MemorySegment value) { VkBindImageMemoryDeviceGroupInfo.set_pSplitInstanceBindRegions(segment, 0L, value); }
    /// Sets `pSplitInstanceBindRegions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindImageMemoryDeviceGroupInfo pSplitInstanceBindRegions(@CType("const VkRect2D *") MemorySegment value) { VkBindImageMemoryDeviceGroupInfo.set_pSplitInstanceBindRegions(this.segment(), value); return this; }

    /// A buffer of [VkBindImageMemoryDeviceGroupInfo].
    public static final class Buffer extends VkBindImageMemoryDeviceGroupInfo {
        private final long elementCount;

        /// Creates `VkBindImageMemoryDeviceGroupInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBindImageMemoryDeviceGroupInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBindImageMemoryDeviceGroupInfo`
        public VkBindImageMemoryDeviceGroupInfo asSlice(long index) { return new VkBindImageMemoryDeviceGroupInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBindImageMemoryDeviceGroupInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBindImageMemoryDeviceGroupInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkBindImageMemoryDeviceGroupInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkBindImageMemoryDeviceGroupInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkBindImageMemoryDeviceGroupInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkBindImageMemoryDeviceGroupInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `deviceIndexCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int deviceIndexCountAt(long index) { return VkBindImageMemoryDeviceGroupInfo.get_deviceIndexCount(this.segment(), index); }
        /// Sets `deviceIndexCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceIndexCountAt(long index, @CType("uint32_t") int value) { VkBindImageMemoryDeviceGroupInfo.set_deviceIndexCount(this.segment(), index, value); return this; }

        /// {@return `pDeviceIndices` at the given index}
        /// @param index the index
        public @CType("const uint32_t *") MemorySegment pDeviceIndicesAt(long index) { return VkBindImageMemoryDeviceGroupInfo.get_pDeviceIndices(this.segment(), index); }
        /// Sets `pDeviceIndices` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDeviceIndicesAt(long index, @CType("const uint32_t *") MemorySegment value) { VkBindImageMemoryDeviceGroupInfo.set_pDeviceIndices(this.segment(), index, value); return this; }

        /// {@return `splitInstanceBindRegionCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int splitInstanceBindRegionCountAt(long index) { return VkBindImageMemoryDeviceGroupInfo.get_splitInstanceBindRegionCount(this.segment(), index); }
        /// Sets `splitInstanceBindRegionCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer splitInstanceBindRegionCountAt(long index, @CType("uint32_t") int value) { VkBindImageMemoryDeviceGroupInfo.set_splitInstanceBindRegionCount(this.segment(), index, value); return this; }

        /// {@return `pSplitInstanceBindRegions` at the given index}
        /// @param index the index
        public @CType("const VkRect2D *") MemorySegment pSplitInstanceBindRegionsAt(long index) { return VkBindImageMemoryDeviceGroupInfo.get_pSplitInstanceBindRegions(this.segment(), index); }
        /// Sets `pSplitInstanceBindRegions` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pSplitInstanceBindRegionsAt(long index, @CType("const VkRect2D *") MemorySegment value) { VkBindImageMemoryDeviceGroupInfo.set_pSplitInstanceBindRegions(this.segment(), index, value); return this; }

    }
}
