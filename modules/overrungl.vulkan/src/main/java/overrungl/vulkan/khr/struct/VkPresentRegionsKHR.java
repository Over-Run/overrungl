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
/// struct VkPresentRegionsKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t swapchainCount;
///     const VkPresentRegionKHR* pRegions;
/// };
/// ```
public sealed class VkPresentRegionsKHR extends GroupType {
    /// The struct layout of `VkPresentRegionsKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withName("pRegions")
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
    /// The byte offset of `pRegions`.
    public static final long OFFSET_pRegions = LAYOUT.byteOffset(PathElement.groupElement("pRegions"));
    /// The memory layout of `pRegions`.
    public static final MemoryLayout LAYOUT_pRegions = LAYOUT.select(PathElement.groupElement("pRegions"));
    /// The [VarHandle] of `pRegions` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRegions"));

    /// Creates `VkPresentRegionsKHR` with the given segment.
    /// @param segment the memory segment
    public VkPresentRegionsKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPresentRegionsKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPresentRegionsKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentRegionsKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentRegionsKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPresentRegionsKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPresentRegionsKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPresentRegionsKHR`
    public static VkPresentRegionsKHR alloc(SegmentAllocator allocator) { return new VkPresentRegionsKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPresentRegionsKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPresentRegionsKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPresentRegionsKHR copyFrom(VkPresentRegionsKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPresentRegionsKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPresentRegionsKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkPresentRegionsKHR swapchainCount(int value) { swapchainCount(this.segment(), 0L, value); return this; }

    /// {@return `pRegions` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pRegions(MemorySegment segment, long index) { return (MemorySegment) VH_pRegions.get(segment, 0L, index); }
    /// {@return `pRegions`}
    public MemorySegment pRegions() { return pRegions(this.segment(), 0L); }
    /// Sets `pRegions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pRegions(MemorySegment segment, long index, MemorySegment value) { VH_pRegions.set(segment, 0L, index, value); }
    /// Sets `pRegions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentRegionsKHR pRegions(MemorySegment value) { pRegions(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPresentRegionsKHR].
    public static final class Buffer extends VkPresentRegionsKHR {
        private final long elementCount;

        /// Creates `VkPresentRegionsKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPresentRegionsKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPresentRegionsKHR`
        public VkPresentRegionsKHR asSlice(long index) { return new VkPresentRegionsKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPresentRegionsKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPresentRegionsKHR`
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

        /// {@return `pRegions` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pRegionsAt(long index) { return pRegions(this.segment(), index); }
        /// Sets `pRegions` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pRegionsAt(long index, MemorySegment value) { pRegions(this.segment(), index, value); return this; }

    }
}
