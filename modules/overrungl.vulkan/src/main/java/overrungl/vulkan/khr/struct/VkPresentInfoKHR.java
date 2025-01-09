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
package overrungl.vulkan.khr.struct;

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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### waitSemaphoreCount
/// [VarHandle][#VH_waitSemaphoreCount] - [Getter][#waitSemaphoreCount()] - [Setter][#waitSemaphoreCount(int)]
/// ### pWaitSemaphores
/// [VarHandle][#VH_pWaitSemaphores] - [Getter][#pWaitSemaphores()] - [Setter][#pWaitSemaphores(java.lang.foreign.MemorySegment)]
/// ### swapchainCount
/// [VarHandle][#VH_swapchainCount] - [Getter][#swapchainCount()] - [Setter][#swapchainCount(int)]
/// ### pSwapchains
/// [VarHandle][#VH_pSwapchains] - [Getter][#pSwapchains()] - [Setter][#pSwapchains(java.lang.foreign.MemorySegment)]
/// ### pImageIndices
/// [VarHandle][#VH_pImageIndices] - [Getter][#pImageIndices()] - [Setter][#pImageIndices(java.lang.foreign.MemorySegment)]
/// ### pResults
/// [VarHandle][#VH_pResults] - [Getter][#pResults()] - [Setter][#pResults(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPresentInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t waitSemaphoreCount;
///     const VkSemaphore * pWaitSemaphores;
///     uint32_t swapchainCount;
///     const VkSwapchainKHR * pSwapchains;
///     const uint32_t * pImageIndices;
///     VkResult * pResults;
/// } VkPresentInfoKHR;
/// ```
public final class VkPresentInfoKHR extends Struct {
    /// The struct layout of `VkPresentInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreCount"),
        ValueLayout.ADDRESS.withName("pWaitSemaphores"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withName("pSwapchains"),
        ValueLayout.ADDRESS.withName("pImageIndices"),
        ValueLayout.ADDRESS.withName("pResults")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `waitSemaphoreCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_waitSemaphoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("waitSemaphoreCount"));
    /// The [VarHandle] of `pWaitSemaphores` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pWaitSemaphores = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWaitSemaphores"));
    /// The [VarHandle] of `swapchainCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_swapchainCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchainCount"));
    /// The [VarHandle] of `pSwapchains` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSwapchains = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSwapchains"));
    /// The [VarHandle] of `pImageIndices` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pImageIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImageIndices"));
    /// The [VarHandle] of `pResults` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pResults = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pResults"));

    /// Creates `VkPresentInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkPresentInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPresentInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPresentInfoKHR(segment); }

    /// Creates `VkPresentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPresentInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPresentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPresentInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPresentInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPresentInfoKHR`
    public static VkPresentInfoKHR alloc(SegmentAllocator allocator) { return new VkPresentInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPresentInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPresentInfoKHR`
    public static VkPresentInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPresentInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPresentInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPresentInfoKHR`
    public VkPresentInfoKHR asSlice(long index) { return new VkPresentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPresentInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPresentInfoKHR`
    public VkPresentInfoKHR asSlice(long index, long count) { return new VkPresentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPresentInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPresentInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPresentInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPresentInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPresentInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR sType(@CType("VkStructureType") int value) { VkPresentInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPresentInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPresentInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPresentInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPresentInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPresentInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPresentInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `waitSemaphoreCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_waitSemaphoreCount(MemorySegment segment, long index) { return (int) VH_waitSemaphoreCount.get(segment, 0L, index); }
    /// {@return `waitSemaphoreCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_waitSemaphoreCount(MemorySegment segment) { return VkPresentInfoKHR.get_waitSemaphoreCount(segment, 0L); }
    /// {@return `waitSemaphoreCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int waitSemaphoreCountAt(long index) { return VkPresentInfoKHR.get_waitSemaphoreCount(this.segment(), index); }
    /// {@return `waitSemaphoreCount`}
    public @CType("uint32_t") int waitSemaphoreCount() { return VkPresentInfoKHR.get_waitSemaphoreCount(this.segment()); }
    /// Sets `waitSemaphoreCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_waitSemaphoreCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_waitSemaphoreCount.set(segment, 0L, index, value); }
    /// Sets `waitSemaphoreCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_waitSemaphoreCount(MemorySegment segment, @CType("uint32_t") int value) { VkPresentInfoKHR.set_waitSemaphoreCount(segment, 0L, value); }
    /// Sets `waitSemaphoreCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR waitSemaphoreCountAt(long index, @CType("uint32_t") int value) { VkPresentInfoKHR.set_waitSemaphoreCount(this.segment(), index, value); return this; }
    /// Sets `waitSemaphoreCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR waitSemaphoreCount(@CType("uint32_t") int value) { VkPresentInfoKHR.set_waitSemaphoreCount(this.segment(), value); return this; }

    /// {@return `pWaitSemaphores` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSemaphore *") java.lang.foreign.MemorySegment get_pWaitSemaphores(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pWaitSemaphores.get(segment, 0L, index); }
    /// {@return `pWaitSemaphores`}
    /// @param segment the segment of the struct
    public static @CType("const VkSemaphore *") java.lang.foreign.MemorySegment get_pWaitSemaphores(MemorySegment segment) { return VkPresentInfoKHR.get_pWaitSemaphores(segment, 0L); }
    /// {@return `pWaitSemaphores` at the given index}
    /// @param index the index
    public @CType("const VkSemaphore *") java.lang.foreign.MemorySegment pWaitSemaphoresAt(long index) { return VkPresentInfoKHR.get_pWaitSemaphores(this.segment(), index); }
    /// {@return `pWaitSemaphores`}
    public @CType("const VkSemaphore *") java.lang.foreign.MemorySegment pWaitSemaphores() { return VkPresentInfoKHR.get_pWaitSemaphores(this.segment()); }
    /// Sets `pWaitSemaphores` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pWaitSemaphores(MemorySegment segment, long index, @CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VH_pWaitSemaphores.set(segment, 0L, index, value); }
    /// Sets `pWaitSemaphores` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pWaitSemaphores(MemorySegment segment, @CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VkPresentInfoKHR.set_pWaitSemaphores(segment, 0L, value); }
    /// Sets `pWaitSemaphores` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR pWaitSemaphoresAt(long index, @CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VkPresentInfoKHR.set_pWaitSemaphores(this.segment(), index, value); return this; }
    /// Sets `pWaitSemaphores` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR pWaitSemaphores(@CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VkPresentInfoKHR.set_pWaitSemaphores(this.segment(), value); return this; }

    /// {@return `swapchainCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_swapchainCount(MemorySegment segment, long index) { return (int) VH_swapchainCount.get(segment, 0L, index); }
    /// {@return `swapchainCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_swapchainCount(MemorySegment segment) { return VkPresentInfoKHR.get_swapchainCount(segment, 0L); }
    /// {@return `swapchainCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int swapchainCountAt(long index) { return VkPresentInfoKHR.get_swapchainCount(this.segment(), index); }
    /// {@return `swapchainCount`}
    public @CType("uint32_t") int swapchainCount() { return VkPresentInfoKHR.get_swapchainCount(this.segment()); }
    /// Sets `swapchainCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_swapchainCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_swapchainCount.set(segment, 0L, index, value); }
    /// Sets `swapchainCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_swapchainCount(MemorySegment segment, @CType("uint32_t") int value) { VkPresentInfoKHR.set_swapchainCount(segment, 0L, value); }
    /// Sets `swapchainCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR swapchainCountAt(long index, @CType("uint32_t") int value) { VkPresentInfoKHR.set_swapchainCount(this.segment(), index, value); return this; }
    /// Sets `swapchainCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR swapchainCount(@CType("uint32_t") int value) { VkPresentInfoKHR.set_swapchainCount(this.segment(), value); return this; }

    /// {@return `pSwapchains` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSwapchainKHR *") java.lang.foreign.MemorySegment get_pSwapchains(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSwapchains.get(segment, 0L, index); }
    /// {@return `pSwapchains`}
    /// @param segment the segment of the struct
    public static @CType("const VkSwapchainKHR *") java.lang.foreign.MemorySegment get_pSwapchains(MemorySegment segment) { return VkPresentInfoKHR.get_pSwapchains(segment, 0L); }
    /// {@return `pSwapchains` at the given index}
    /// @param index the index
    public @CType("const VkSwapchainKHR *") java.lang.foreign.MemorySegment pSwapchainsAt(long index) { return VkPresentInfoKHR.get_pSwapchains(this.segment(), index); }
    /// {@return `pSwapchains`}
    public @CType("const VkSwapchainKHR *") java.lang.foreign.MemorySegment pSwapchains() { return VkPresentInfoKHR.get_pSwapchains(this.segment()); }
    /// Sets `pSwapchains` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSwapchains(MemorySegment segment, long index, @CType("const VkSwapchainKHR *") java.lang.foreign.MemorySegment value) { VH_pSwapchains.set(segment, 0L, index, value); }
    /// Sets `pSwapchains` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSwapchains(MemorySegment segment, @CType("const VkSwapchainKHR *") java.lang.foreign.MemorySegment value) { VkPresentInfoKHR.set_pSwapchains(segment, 0L, value); }
    /// Sets `pSwapchains` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR pSwapchainsAt(long index, @CType("const VkSwapchainKHR *") java.lang.foreign.MemorySegment value) { VkPresentInfoKHR.set_pSwapchains(this.segment(), index, value); return this; }
    /// Sets `pSwapchains` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR pSwapchains(@CType("const VkSwapchainKHR *") java.lang.foreign.MemorySegment value) { VkPresentInfoKHR.set_pSwapchains(this.segment(), value); return this; }

    /// {@return `pImageIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pImageIndices(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pImageIndices.get(segment, 0L, index); }
    /// {@return `pImageIndices`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pImageIndices(MemorySegment segment) { return VkPresentInfoKHR.get_pImageIndices(segment, 0L); }
    /// {@return `pImageIndices` at the given index}
    /// @param index the index
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pImageIndicesAt(long index) { return VkPresentInfoKHR.get_pImageIndices(this.segment(), index); }
    /// {@return `pImageIndices`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pImageIndices() { return VkPresentInfoKHR.get_pImageIndices(this.segment()); }
    /// Sets `pImageIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pImageIndices(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pImageIndices.set(segment, 0L, index, value); }
    /// Sets `pImageIndices` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pImageIndices(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkPresentInfoKHR.set_pImageIndices(segment, 0L, value); }
    /// Sets `pImageIndices` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR pImageIndicesAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkPresentInfoKHR.set_pImageIndices(this.segment(), index, value); return this; }
    /// Sets `pImageIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR pImageIndices(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkPresentInfoKHR.set_pImageIndices(this.segment(), value); return this; }

    /// {@return `pResults` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkResult *") java.lang.foreign.MemorySegment get_pResults(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pResults.get(segment, 0L, index); }
    /// {@return `pResults`}
    /// @param segment the segment of the struct
    public static @CType("VkResult *") java.lang.foreign.MemorySegment get_pResults(MemorySegment segment) { return VkPresentInfoKHR.get_pResults(segment, 0L); }
    /// {@return `pResults` at the given index}
    /// @param index the index
    public @CType("VkResult *") java.lang.foreign.MemorySegment pResultsAt(long index) { return VkPresentInfoKHR.get_pResults(this.segment(), index); }
    /// {@return `pResults`}
    public @CType("VkResult *") java.lang.foreign.MemorySegment pResults() { return VkPresentInfoKHR.get_pResults(this.segment()); }
    /// Sets `pResults` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pResults(MemorySegment segment, long index, @CType("VkResult *") java.lang.foreign.MemorySegment value) { VH_pResults.set(segment, 0L, index, value); }
    /// Sets `pResults` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pResults(MemorySegment segment, @CType("VkResult *") java.lang.foreign.MemorySegment value) { VkPresentInfoKHR.set_pResults(segment, 0L, value); }
    /// Sets `pResults` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR pResultsAt(long index, @CType("VkResult *") java.lang.foreign.MemorySegment value) { VkPresentInfoKHR.set_pResults(this.segment(), index, value); return this; }
    /// Sets `pResults` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentInfoKHR pResults(@CType("VkResult *") java.lang.foreign.MemorySegment value) { VkPresentInfoKHR.set_pResults(this.segment(), value); return this; }

}
