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
/// struct VkDeviceGroupPresentInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t swapchainCount;
///     const uint32_t* pDeviceMasks;
///     (int) VkDeviceGroupPresentModeFlagBitsKHR mode;
/// };
/// ```
public sealed class VkDeviceGroupPresentInfoKHR extends GroupType {
    /// The struct layout of `VkDeviceGroupPresentInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withName("pDeviceMasks"),
        ValueLayout.JAVA_INT.withName("mode")
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
    /// The byte offset of `swapchainCount`.
    public static final long OFFSET_swapchainCount = LAYOUT.byteOffset(PathElement.groupElement("swapchainCount"));
    /// The memory layout of `swapchainCount`.
    public static final MemoryLayout LAYOUT_swapchainCount = LAYOUT.select(PathElement.groupElement("swapchainCount"));
    /// The [VarHandle] of `swapchainCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_swapchainCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchainCount"));
    /// The byte offset of `pDeviceMasks`.
    public static final long OFFSET_pDeviceMasks = LAYOUT.byteOffset(PathElement.groupElement("pDeviceMasks"));
    /// The memory layout of `pDeviceMasks`.
    public static final MemoryLayout LAYOUT_pDeviceMasks = LAYOUT.select(PathElement.groupElement("pDeviceMasks"));
    /// The [VarHandle] of `pDeviceMasks` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDeviceMasks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDeviceMasks"));
    /// The byte offset of `mode`.
    public static final long OFFSET_mode = LAYOUT.byteOffset(PathElement.groupElement("mode"));
    /// The memory layout of `mode`.
    public static final MemoryLayout LAYOUT_mode = LAYOUT.select(PathElement.groupElement("mode"));
    /// The [VarHandle] of `mode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));

    /// Creates `VkDeviceGroupPresentInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkDeviceGroupPresentInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceGroupPresentInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceGroupPresentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupPresentInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupPresentInfoKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkDeviceGroupPresentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDeviceGroupPresentInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceGroupPresentInfoKHR`
    public static VkDeviceGroupPresentInfoKHR alloc(SegmentAllocator allocator) { return new VkDeviceGroupPresentInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceGroupPresentInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceGroupPresentInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDeviceGroupPresentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param swapchainCount `swapchainCount`
    /// @param pDeviceMasks `pDeviceMasks`
    /// @param mode `mode`
    /// @return the allocated `VkDeviceGroupPresentInfoKHR`
    public static VkDeviceGroupPresentInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int swapchainCount, MemorySegment pDeviceMasks, int mode) {
        return alloc(allocator).sType(sType).pNext(pNext).swapchainCount(swapchainCount).pDeviceMasks(pDeviceMasks).mode(mode);
    }

    /// Allocates a `VkDeviceGroupPresentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param swapchainCount `swapchainCount`
    /// @param pDeviceMasks `pDeviceMasks`
    /// @return the allocated `VkDeviceGroupPresentInfoKHR`
    public static VkDeviceGroupPresentInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int swapchainCount, MemorySegment pDeviceMasks) {
        return alloc(allocator).sType(sType).pNext(pNext).swapchainCount(swapchainCount).pDeviceMasks(pDeviceMasks);
    }

    /// Allocates a `VkDeviceGroupPresentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param swapchainCount `swapchainCount`
    /// @return the allocated `VkDeviceGroupPresentInfoKHR`
    public static VkDeviceGroupPresentInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int swapchainCount) {
        return alloc(allocator).sType(sType).pNext(pNext).swapchainCount(swapchainCount);
    }

    /// Allocates a `VkDeviceGroupPresentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkDeviceGroupPresentInfoKHR`
    public static VkDeviceGroupPresentInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkDeviceGroupPresentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkDeviceGroupPresentInfoKHR`
    public static VkDeviceGroupPresentInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceGroupPresentInfoKHR copyFrom(VkDeviceGroupPresentInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkDeviceGroupPresentInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDeviceGroupPresentInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `swapchainCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int swapchainCount(MemorySegment segment, long index) { return (int) VH_swapchainCount.get(segment, 0L, index); }
    /// {@return `swapchainCount`}
    public int swapchainCount() { return swapchainCount(this.segment(), 0L); }
    /// Sets `swapchainCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void swapchainCount(MemorySegment segment, long index, int value) { VH_swapchainCount.set(segment, 0L, index, value); }
    /// Sets `swapchainCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupPresentInfoKHR swapchainCount(int value) { swapchainCount(this.segment(), 0L, value); return this; }

    /// {@return `pDeviceMasks` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDeviceMasks(MemorySegment segment, long index) { return (MemorySegment) VH_pDeviceMasks.get(segment, 0L, index); }
    /// {@return `pDeviceMasks`}
    public MemorySegment pDeviceMasks() { return pDeviceMasks(this.segment(), 0L); }
    /// Sets `pDeviceMasks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDeviceMasks(MemorySegment segment, long index, MemorySegment value) { VH_pDeviceMasks.set(segment, 0L, index, value); }
    /// Sets `pDeviceMasks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupPresentInfoKHR pDeviceMasks(MemorySegment value) { pDeviceMasks(this.segment(), 0L, value); return this; }

    /// {@return `mode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int mode(MemorySegment segment, long index) { return (int) VH_mode.get(segment, 0L, index); }
    /// {@return `mode`}
    public int mode() { return mode(this.segment(), 0L); }
    /// Sets `mode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mode(MemorySegment segment, long index, int value) { VH_mode.set(segment, 0L, index, value); }
    /// Sets `mode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupPresentInfoKHR mode(int value) { mode(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDeviceGroupPresentInfoKHR].
    public static final class Buffer extends VkDeviceGroupPresentInfoKHR {
        private final long elementCount;

        /// Creates `VkDeviceGroupPresentInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDeviceGroupPresentInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDeviceGroupPresentInfoKHR`
        public VkDeviceGroupPresentInfoKHR asSlice(long index) { return new VkDeviceGroupPresentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDeviceGroupPresentInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDeviceGroupPresentInfoKHR`
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

        /// {@return `swapchainCount` at the given index}
        /// @param index the index of the struct buffer
        public int swapchainCountAt(long index) { return swapchainCount(this.segment(), index); }
        /// Sets `swapchainCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer swapchainCountAt(long index, int value) { swapchainCount(this.segment(), index, value); return this; }

        /// {@return `pDeviceMasks` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pDeviceMasksAt(long index) { return pDeviceMasks(this.segment(), index); }
        /// Sets `pDeviceMasks` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pDeviceMasksAt(long index, MemorySegment value) { pDeviceMasks(this.segment(), index, value); return this; }

        /// {@return `mode` at the given index}
        /// @param index the index of the struct buffer
        public int modeAt(long index) { return mode(this.segment(), index); }
        /// Sets `mode` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer modeAt(long index, int value) { mode(this.segment(), index, value); return this; }

    }
}
