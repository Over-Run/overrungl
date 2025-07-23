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
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkReleaseSwapchainImagesInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkSwapchainKHR swapchain;
///     uint32_t imageIndexCount;
///     const uint32_t* pImageIndices;
/// };
/// ```
public final class VkReleaseSwapchainImagesInfoKHR extends GroupType {
    /// The struct layout of `VkReleaseSwapchainImagesInfoKHR`.
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

    /// Creates `VkReleaseSwapchainImagesInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkReleaseSwapchainImagesInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkReleaseSwapchainImagesInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkReleaseSwapchainImagesInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkReleaseSwapchainImagesInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkReleaseSwapchainImagesInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkReleaseSwapchainImagesInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkReleaseSwapchainImagesInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkReleaseSwapchainImagesInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkReleaseSwapchainImagesInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkReleaseSwapchainImagesInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkReleaseSwapchainImagesInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkReleaseSwapchainImagesInfoKHR`
    public static VkReleaseSwapchainImagesInfoKHR alloc(SegmentAllocator allocator) { return new VkReleaseSwapchainImagesInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkReleaseSwapchainImagesInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkReleaseSwapchainImagesInfoKHR`
    public static VkReleaseSwapchainImagesInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkReleaseSwapchainImagesInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkReleaseSwapchainImagesInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param swapchain `swapchain`
    /// @param imageIndexCount `imageIndexCount`
    /// @param pImageIndices `pImageIndices`
    /// @return the allocated `VkReleaseSwapchainImagesInfoKHR`
    public static VkReleaseSwapchainImagesInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long swapchain, int imageIndexCount, MemorySegment pImageIndices) {
        return alloc(allocator).sType(sType).pNext(pNext).swapchain(swapchain).imageIndexCount(imageIndexCount).pImageIndices(pImageIndices);
    }

    /// Allocates a `VkReleaseSwapchainImagesInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param swapchain `swapchain`
    /// @param imageIndexCount `imageIndexCount`
    /// @return the allocated `VkReleaseSwapchainImagesInfoKHR`
    public static VkReleaseSwapchainImagesInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long swapchain, int imageIndexCount) {
        return alloc(allocator).sType(sType).pNext(pNext).swapchain(swapchain).imageIndexCount(imageIndexCount);
    }

    /// Allocates a `VkReleaseSwapchainImagesInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param swapchain `swapchain`
    /// @return the allocated `VkReleaseSwapchainImagesInfoKHR`
    public static VkReleaseSwapchainImagesInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long swapchain) {
        return alloc(allocator).sType(sType).pNext(pNext).swapchain(swapchain);
    }

    /// Allocates a `VkReleaseSwapchainImagesInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkReleaseSwapchainImagesInfoKHR`
    public static VkReleaseSwapchainImagesInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkReleaseSwapchainImagesInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkReleaseSwapchainImagesInfoKHR`
    public static VkReleaseSwapchainImagesInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkReleaseSwapchainImagesInfoKHR copyFrom(VkReleaseSwapchainImagesInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkReleaseSwapchainImagesInfoKHR reinterpret(long count) { return new VkReleaseSwapchainImagesInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkReleaseSwapchainImagesInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkReleaseSwapchainImagesInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkReleaseSwapchainImagesInfoKHR swapchain(long value) { swapchain(this.segment(), 0L, value); return this; }

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
    public VkReleaseSwapchainImagesInfoKHR imageIndexCount(int value) { imageIndexCount(this.segment(), 0L, value); return this; }

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
    public VkReleaseSwapchainImagesInfoKHR pImageIndices(MemorySegment value) { pImageIndices(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkReleaseSwapchainImagesInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkReleaseSwapchainImagesInfoKHR`
    public VkReleaseSwapchainImagesInfoKHR asSlice(long index) { return new VkReleaseSwapchainImagesInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkReleaseSwapchainImagesInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkReleaseSwapchainImagesInfoKHR`
    public VkReleaseSwapchainImagesInfoKHR asSlice(long index, long count) { return new VkReleaseSwapchainImagesInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkReleaseSwapchainImagesInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkReleaseSwapchainImagesInfoKHR at(long index, Consumer<VkReleaseSwapchainImagesInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkReleaseSwapchainImagesInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkReleaseSwapchainImagesInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `swapchain` at the given index}
    /// @param index the index of the struct buffer
    public long swapchainAt(long index) { return swapchain(this.segment(), index); }
    /// Sets `swapchain` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkReleaseSwapchainImagesInfoKHR swapchainAt(long index, long value) { swapchain(this.segment(), index, value); return this; }

    /// {@return `imageIndexCount` at the given index}
    /// @param index the index of the struct buffer
    public int imageIndexCountAt(long index) { return imageIndexCount(this.segment(), index); }
    /// Sets `imageIndexCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkReleaseSwapchainImagesInfoKHR imageIndexCountAt(long index, int value) { imageIndexCount(this.segment(), index, value); return this; }

    /// {@return `pImageIndices` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pImageIndicesAt(long index) { return pImageIndices(this.segment(), index); }
    /// Sets `pImageIndices` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkReleaseSwapchainImagesInfoKHR pImageIndicesAt(long index, MemorySegment value) { pImageIndices(this.segment(), index, value); return this; }

}
