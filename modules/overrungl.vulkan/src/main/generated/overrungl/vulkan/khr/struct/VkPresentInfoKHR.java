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
/// struct VkPresentInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t waitSemaphoreCount;
///     const VkSemaphore* pWaitSemaphores;
///     uint32_t swapchainCount;
///     const VkSwapchainKHR* pSwapchains;
///     const uint32_t* pImageIndices;
///     VkResult* pResults;
/// };
/// ```
public final class VkPresentInfoKHR extends GroupType {
    /// The struct layout of `VkPresentInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreCount"),
        ValueLayout.ADDRESS.withName("pWaitSemaphores"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withName("pSwapchains"),
        ValueLayout.ADDRESS.withName("pImageIndices"),
        ValueLayout.ADDRESS.withName("pResults")
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
    /// The byte offset of `waitSemaphoreCount`.
    public static final long OFFSET_waitSemaphoreCount = LAYOUT.byteOffset(PathElement.groupElement("waitSemaphoreCount"));
    /// The memory layout of `waitSemaphoreCount`.
    public static final MemoryLayout LAYOUT_waitSemaphoreCount = LAYOUT.select(PathElement.groupElement("waitSemaphoreCount"));
    /// The [VarHandle] of `waitSemaphoreCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_waitSemaphoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("waitSemaphoreCount"));
    /// The byte offset of `pWaitSemaphores`.
    public static final long OFFSET_pWaitSemaphores = LAYOUT.byteOffset(PathElement.groupElement("pWaitSemaphores"));
    /// The memory layout of `pWaitSemaphores`.
    public static final MemoryLayout LAYOUT_pWaitSemaphores = LAYOUT.select(PathElement.groupElement("pWaitSemaphores"));
    /// The [VarHandle] of `pWaitSemaphores` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pWaitSemaphores = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWaitSemaphores"));
    /// The byte offset of `swapchainCount`.
    public static final long OFFSET_swapchainCount = LAYOUT.byteOffset(PathElement.groupElement("swapchainCount"));
    /// The memory layout of `swapchainCount`.
    public static final MemoryLayout LAYOUT_swapchainCount = LAYOUT.select(PathElement.groupElement("swapchainCount"));
    /// The [VarHandle] of `swapchainCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_swapchainCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchainCount"));
    /// The byte offset of `pSwapchains`.
    public static final long OFFSET_pSwapchains = LAYOUT.byteOffset(PathElement.groupElement("pSwapchains"));
    /// The memory layout of `pSwapchains`.
    public static final MemoryLayout LAYOUT_pSwapchains = LAYOUT.select(PathElement.groupElement("pSwapchains"));
    /// The [VarHandle] of `pSwapchains` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSwapchains = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSwapchains"));
    /// The byte offset of `pImageIndices`.
    public static final long OFFSET_pImageIndices = LAYOUT.byteOffset(PathElement.groupElement("pImageIndices"));
    /// The memory layout of `pImageIndices`.
    public static final MemoryLayout LAYOUT_pImageIndices = LAYOUT.select(PathElement.groupElement("pImageIndices"));
    /// The [VarHandle] of `pImageIndices` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pImageIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImageIndices"));
    /// The byte offset of `pResults`.
    public static final long OFFSET_pResults = LAYOUT.byteOffset(PathElement.groupElement("pResults"));
    /// The memory layout of `pResults`.
    public static final MemoryLayout LAYOUT_pResults = LAYOUT.select(PathElement.groupElement("pResults"));
    /// The [VarHandle] of `pResults` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pResults = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pResults"));

    /// Creates `VkPresentInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPresentInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPresentInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPresentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPresentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPresentInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPresentInfoKHR`
    public static VkPresentInfoKHR alloc(SegmentAllocator allocator) { return new VkPresentInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPresentInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPresentInfoKHR`
    public static VkPresentInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPresentInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPresentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param waitSemaphoreCount `waitSemaphoreCount`
    /// @param pWaitSemaphores `pWaitSemaphores`
    /// @param swapchainCount `swapchainCount`
    /// @param pSwapchains `pSwapchains`
    /// @param pImageIndices `pImageIndices`
    /// @param pResults `pResults`
    /// @return the allocated `VkPresentInfoKHR`
    public static VkPresentInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int waitSemaphoreCount, MemorySegment pWaitSemaphores, int swapchainCount, MemorySegment pSwapchains, MemorySegment pImageIndices, MemorySegment pResults) {
        return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount).pWaitSemaphores(pWaitSemaphores).swapchainCount(swapchainCount).pSwapchains(pSwapchains).pImageIndices(pImageIndices).pResults(pResults);
    }

    /// Allocates a `VkPresentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param waitSemaphoreCount `waitSemaphoreCount`
    /// @param pWaitSemaphores `pWaitSemaphores`
    /// @param swapchainCount `swapchainCount`
    /// @param pSwapchains `pSwapchains`
    /// @param pImageIndices `pImageIndices`
    /// @return the allocated `VkPresentInfoKHR`
    public static VkPresentInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int waitSemaphoreCount, MemorySegment pWaitSemaphores, int swapchainCount, MemorySegment pSwapchains, MemorySegment pImageIndices) {
        return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount).pWaitSemaphores(pWaitSemaphores).swapchainCount(swapchainCount).pSwapchains(pSwapchains).pImageIndices(pImageIndices);
    }

    /// Allocates a `VkPresentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param waitSemaphoreCount `waitSemaphoreCount`
    /// @param pWaitSemaphores `pWaitSemaphores`
    /// @param swapchainCount `swapchainCount`
    /// @param pSwapchains `pSwapchains`
    /// @return the allocated `VkPresentInfoKHR`
    public static VkPresentInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int waitSemaphoreCount, MemorySegment pWaitSemaphores, int swapchainCount, MemorySegment pSwapchains) {
        return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount).pWaitSemaphores(pWaitSemaphores).swapchainCount(swapchainCount).pSwapchains(pSwapchains);
    }

    /// Allocates a `VkPresentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param waitSemaphoreCount `waitSemaphoreCount`
    /// @param pWaitSemaphores `pWaitSemaphores`
    /// @param swapchainCount `swapchainCount`
    /// @return the allocated `VkPresentInfoKHR`
    public static VkPresentInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int waitSemaphoreCount, MemorySegment pWaitSemaphores, int swapchainCount) {
        return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount).pWaitSemaphores(pWaitSemaphores).swapchainCount(swapchainCount);
    }

    /// Allocates a `VkPresentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param waitSemaphoreCount `waitSemaphoreCount`
    /// @param pWaitSemaphores `pWaitSemaphores`
    /// @return the allocated `VkPresentInfoKHR`
    public static VkPresentInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int waitSemaphoreCount, MemorySegment pWaitSemaphores) {
        return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount).pWaitSemaphores(pWaitSemaphores);
    }

    /// Allocates a `VkPresentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param waitSemaphoreCount `waitSemaphoreCount`
    /// @return the allocated `VkPresentInfoKHR`
    public static VkPresentInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int waitSemaphoreCount) {
        return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount);
    }

    /// Allocates a `VkPresentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPresentInfoKHR`
    public static VkPresentInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPresentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPresentInfoKHR`
    public static VkPresentInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPresentInfoKHR copyFrom(VkPresentInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPresentInfoKHR reinterpret(long count) { return new VkPresentInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPresentInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPresentInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `waitSemaphoreCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int waitSemaphoreCount(MemorySegment segment, long index) { return (int) VH_waitSemaphoreCount.get(segment, 0L, index); }
    /// {@return `waitSemaphoreCount`}
    public int waitSemaphoreCount() { return waitSemaphoreCount(this.segment(), 0L); }
    /// Sets `waitSemaphoreCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void waitSemaphoreCount(MemorySegment segment, long index, int value) { VH_waitSemaphoreCount.set(segment, 0L, index, value); }
    /// Sets `waitSemaphoreCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR waitSemaphoreCount(int value) { waitSemaphoreCount(this.segment(), 0L, value); return this; }

    /// {@return `pWaitSemaphores` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pWaitSemaphores(MemorySegment segment, long index) { return (MemorySegment) VH_pWaitSemaphores.get(segment, 0L, index); }
    /// {@return `pWaitSemaphores`}
    public MemorySegment pWaitSemaphores() { return pWaitSemaphores(this.segment(), 0L); }
    /// Sets `pWaitSemaphores` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pWaitSemaphores(MemorySegment segment, long index, MemorySegment value) { VH_pWaitSemaphores.set(segment, 0L, index, value); }
    /// Sets `pWaitSemaphores` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR pWaitSemaphores(MemorySegment value) { pWaitSemaphores(this.segment(), 0L, value); return this; }

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
    public VkPresentInfoKHR swapchainCount(int value) { swapchainCount(this.segment(), 0L, value); return this; }

    /// {@return `pSwapchains` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSwapchains(MemorySegment segment, long index) { return (MemorySegment) VH_pSwapchains.get(segment, 0L, index); }
    /// {@return `pSwapchains`}
    public MemorySegment pSwapchains() { return pSwapchains(this.segment(), 0L); }
    /// Sets `pSwapchains` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSwapchains(MemorySegment segment, long index, MemorySegment value) { VH_pSwapchains.set(segment, 0L, index, value); }
    /// Sets `pSwapchains` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR pSwapchains(MemorySegment value) { pSwapchains(this.segment(), 0L, value); return this; }

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
    public VkPresentInfoKHR pImageIndices(MemorySegment value) { pImageIndices(this.segment(), 0L, value); return this; }

    /// {@return `pResults` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pResults(MemorySegment segment, long index) { return (MemorySegment) VH_pResults.get(segment, 0L, index); }
    /// {@return `pResults`}
    public MemorySegment pResults() { return pResults(this.segment(), 0L); }
    /// Sets `pResults` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pResults(MemorySegment segment, long index, MemorySegment value) { VH_pResults.set(segment, 0L, index, value); }
    /// Sets `pResults` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR pResults(MemorySegment value) { pResults(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPresentInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPresentInfoKHR`
    public VkPresentInfoKHR asSlice(long index) { return new VkPresentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPresentInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPresentInfoKHR`
    public VkPresentInfoKHR asSlice(long index, long count) { return new VkPresentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPresentInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPresentInfoKHR at(long index, Consumer<VkPresentInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `waitSemaphoreCount` at the given index}
    /// @param index the index of the struct buffer
    public int waitSemaphoreCountAt(long index) { return waitSemaphoreCount(this.segment(), index); }
    /// Sets `waitSemaphoreCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR waitSemaphoreCountAt(long index, int value) { waitSemaphoreCount(this.segment(), index, value); return this; }

    /// {@return `pWaitSemaphores` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pWaitSemaphoresAt(long index) { return pWaitSemaphores(this.segment(), index); }
    /// Sets `pWaitSemaphores` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR pWaitSemaphoresAt(long index, MemorySegment value) { pWaitSemaphores(this.segment(), index, value); return this; }

    /// {@return `swapchainCount` at the given index}
    /// @param index the index of the struct buffer
    public int swapchainCountAt(long index) { return swapchainCount(this.segment(), index); }
    /// Sets `swapchainCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR swapchainCountAt(long index, int value) { swapchainCount(this.segment(), index, value); return this; }

    /// {@return `pSwapchains` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pSwapchainsAt(long index) { return pSwapchains(this.segment(), index); }
    /// Sets `pSwapchains` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR pSwapchainsAt(long index, MemorySegment value) { pSwapchains(this.segment(), index, value); return this; }

    /// {@return `pImageIndices` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pImageIndicesAt(long index) { return pImageIndices(this.segment(), index); }
    /// Sets `pImageIndices` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR pImageIndicesAt(long index, MemorySegment value) { pImageIndices(this.segment(), index, value); return this; }

    /// {@return `pResults` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pResultsAt(long index) { return pResults(this.segment(), index); }
    /// Sets `pResults` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR pResultsAt(long index, MemorySegment value) { pResults(this.segment(), index, value); return this; }

}
