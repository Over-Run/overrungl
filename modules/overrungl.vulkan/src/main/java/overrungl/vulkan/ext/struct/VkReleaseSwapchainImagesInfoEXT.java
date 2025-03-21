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
/// struct VkReleaseSwapchainImagesInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkSwapchainKHR swapchain;
///     uint32_t imageIndexCount;
///     const uint32_t* pImageIndices;
/// };
/// ```
public sealed class VkReleaseSwapchainImagesInfoEXT extends GroupType {
    /// The struct layout of `VkReleaseSwapchainImagesInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("swapchain"),
        ValueLayout.JAVA_INT.withName("imageIndexCount"),
        ValueLayout.ADDRESS.withName("pImageIndices")
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
    /// The byte offset of `imageIndexCount`.
    public static final long OFFSET_imageIndexCount = LAYOUT.byteOffset(PathElement.groupElement("imageIndexCount"));
    /// The memory layout of `imageIndexCount`.
    public static final MemoryLayout LAYOUT_imageIndexCount = LAYOUT.select(PathElement.groupElement("imageIndexCount"));
    /// The [VarHandle] of `imageIndexCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageIndexCount"));
    /// The byte offset of `pImageIndices`.
    public static final long OFFSET_pImageIndices = LAYOUT.byteOffset(PathElement.groupElement("pImageIndices"));
    /// The memory layout of `pImageIndices`.
    public static final MemoryLayout LAYOUT_pImageIndices = LAYOUT.select(PathElement.groupElement("pImageIndices"));
    /// The [VarHandle] of `pImageIndices` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pImageIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImageIndices"));

    /// Creates `VkReleaseSwapchainImagesInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkReleaseSwapchainImagesInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkReleaseSwapchainImagesInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkReleaseSwapchainImagesInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkReleaseSwapchainImagesInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkReleaseSwapchainImagesInfoEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkReleaseSwapchainImagesInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkReleaseSwapchainImagesInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkReleaseSwapchainImagesInfoEXT`
    public static VkReleaseSwapchainImagesInfoEXT alloc(SegmentAllocator allocator) { return new VkReleaseSwapchainImagesInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkReleaseSwapchainImagesInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkReleaseSwapchainImagesInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkReleaseSwapchainImagesInfoEXT copyFrom(VkReleaseSwapchainImagesInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkReleaseSwapchainImagesInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkReleaseSwapchainImagesInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkReleaseSwapchainImagesInfoEXT swapchain(long value) { swapchain(this.segment(), 0L, value); return this; }

    /// {@return `imageIndexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageIndexCount(MemorySegment segment, long index) { return (int) VH_imageIndexCount.get(segment, 0L, index); }
    /// {@return `imageIndexCount`}
    public int imageIndexCount() { return imageIndexCount(this.segment(), 0L); }
    /// Sets `imageIndexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageIndexCount(MemorySegment segment, long index, int value) { VH_imageIndexCount.set(segment, 0L, index, value); }
    /// Sets `imageIndexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkReleaseSwapchainImagesInfoEXT imageIndexCount(int value) { imageIndexCount(this.segment(), 0L, value); return this; }

    /// {@return `pImageIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pImageIndices(MemorySegment segment, long index) { return (MemorySegment) VH_pImageIndices.get(segment, 0L, index); }
    /// {@return `pImageIndices`}
    public MemorySegment pImageIndices() { return pImageIndices(this.segment(), 0L); }
    /// Sets `pImageIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pImageIndices(MemorySegment segment, long index, MemorySegment value) { VH_pImageIndices.set(segment, 0L, index, value); }
    /// Sets `pImageIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkReleaseSwapchainImagesInfoEXT pImageIndices(MemorySegment value) { pImageIndices(this.segment(), 0L, value); return this; }

    /// A buffer of [VkReleaseSwapchainImagesInfoEXT].
    public static final class Buffer extends VkReleaseSwapchainImagesInfoEXT {
        private final long elementCount;

        /// Creates `VkReleaseSwapchainImagesInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkReleaseSwapchainImagesInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkReleaseSwapchainImagesInfoEXT`
        public VkReleaseSwapchainImagesInfoEXT asSlice(long index) { return new VkReleaseSwapchainImagesInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkReleaseSwapchainImagesInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkReleaseSwapchainImagesInfoEXT`
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

        /// {@return `imageIndexCount` at the given index}
        /// @param index the index of the struct buffer
        public int imageIndexCountAt(long index) { return imageIndexCount(this.segment(), index); }
        /// Sets `imageIndexCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageIndexCountAt(long index, int value) { imageIndexCount(this.segment(), index, value); return this; }

        /// {@return `pImageIndices` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pImageIndicesAt(long index) { return pImageIndices(this.segment(), index); }
        /// Sets `pImageIndices` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pImageIndicesAt(long index, MemorySegment value) { pImageIndices(this.segment(), index, value); return this; }

    }
}
