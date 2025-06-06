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
/// struct VkBindImageMemorySwapchainInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkSwapchainKHR swapchain;
///     uint32_t imageIndex;
/// };
/// ```
public sealed class VkBindImageMemorySwapchainInfoKHR extends GroupType {
    /// The struct layout of `VkBindImageMemorySwapchainInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("swapchain"),
        ValueLayout.JAVA_INT.withName("imageIndex")
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
    /// The byte offset of `swapchain`.
    public static final long OFFSET_swapchain = LAYOUT.byteOffset(PathElement.groupElement("swapchain"));
    /// The memory layout of `swapchain`.
    public static final MemoryLayout LAYOUT_swapchain = LAYOUT.select(PathElement.groupElement("swapchain"));
    /// The [VarHandle] of `swapchain` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_swapchain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchain"));
    /// The byte offset of `imageIndex`.
    public static final long OFFSET_imageIndex = LAYOUT.byteOffset(PathElement.groupElement("imageIndex"));
    /// The memory layout of `imageIndex`.
    public static final MemoryLayout LAYOUT_imageIndex = LAYOUT.select(PathElement.groupElement("imageIndex"));
    /// The [VarHandle] of `imageIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageIndex"));

    /// Creates `VkBindImageMemorySwapchainInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkBindImageMemorySwapchainInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBindImageMemorySwapchainInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindImageMemorySwapchainInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindImageMemorySwapchainInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindImageMemorySwapchainInfoKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkBindImageMemorySwapchainInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBindImageMemorySwapchainInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindImageMemorySwapchainInfoKHR`
    public static VkBindImageMemorySwapchainInfoKHR alloc(SegmentAllocator allocator) { return new VkBindImageMemorySwapchainInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBindImageMemorySwapchainInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindImageMemorySwapchainInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBindImageMemorySwapchainInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param swapchain `swapchain`
    /// @param imageIndex `imageIndex`
    /// @return the allocated `VkBindImageMemorySwapchainInfoKHR`
    public static VkBindImageMemorySwapchainInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long swapchain, int imageIndex) {
        return alloc(allocator).sType(sType).pNext(pNext).swapchain(swapchain).imageIndex(imageIndex);
    }

    /// Allocates a `VkBindImageMemorySwapchainInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param swapchain `swapchain`
    /// @return the allocated `VkBindImageMemorySwapchainInfoKHR`
    public static VkBindImageMemorySwapchainInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long swapchain) {
        return alloc(allocator).sType(sType).pNext(pNext).swapchain(swapchain);
    }

    /// Allocates a `VkBindImageMemorySwapchainInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkBindImageMemorySwapchainInfoKHR`
    public static VkBindImageMemorySwapchainInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkBindImageMemorySwapchainInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkBindImageMemorySwapchainInfoKHR`
    public static VkBindImageMemorySwapchainInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindImageMemorySwapchainInfoKHR copyFrom(VkBindImageMemorySwapchainInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkBindImageMemorySwapchainInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkBindImageMemorySwapchainInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `swapchain` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long swapchain(MemorySegment segment, long index) { return (long) VH_swapchain.get(segment, 0L, index); }
    /// {@return `swapchain`}
    public long swapchain() { return swapchain(this.segment(), 0L); }
    /// Sets `swapchain` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void swapchain(MemorySegment segment, long index, long value) { VH_swapchain.set(segment, 0L, index, value); }
    /// Sets `swapchain` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindImageMemorySwapchainInfoKHR swapchain(long value) { swapchain(this.segment(), 0L, value); return this; }

    /// {@return `imageIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageIndex(MemorySegment segment, long index) { return (int) VH_imageIndex.get(segment, 0L, index); }
    /// {@return `imageIndex`}
    public int imageIndex() { return imageIndex(this.segment(), 0L); }
    /// Sets `imageIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageIndex(MemorySegment segment, long index, int value) { VH_imageIndex.set(segment, 0L, index, value); }
    /// Sets `imageIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindImageMemorySwapchainInfoKHR imageIndex(int value) { imageIndex(this.segment(), 0L, value); return this; }

    /// A buffer of [VkBindImageMemorySwapchainInfoKHR].
    public static final class Buffer extends VkBindImageMemorySwapchainInfoKHR {
        private final long elementCount;

        /// Creates `VkBindImageMemorySwapchainInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBindImageMemorySwapchainInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBindImageMemorySwapchainInfoKHR`
        public VkBindImageMemorySwapchainInfoKHR asSlice(long index) { return new VkBindImageMemorySwapchainInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBindImageMemorySwapchainInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBindImageMemorySwapchainInfoKHR`
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

        /// {@return `swapchain` at the given index}
        /// @param index the index of the struct buffer
        public long swapchainAt(long index) { return swapchain(this.segment(), index); }
        /// Sets `swapchain` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer swapchainAt(long index, long value) { swapchain(this.segment(), index, value); return this; }

        /// {@return `imageIndex` at the given index}
        /// @param index the index of the struct buffer
        public int imageIndexAt(long index) { return imageIndex(this.segment(), index); }
        /// Sets `imageIndex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageIndexAt(long index, int value) { imageIndex(this.segment(), index, value); return this; }

    }
}
