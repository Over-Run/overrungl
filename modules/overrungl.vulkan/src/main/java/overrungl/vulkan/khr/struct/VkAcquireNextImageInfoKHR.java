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
/// ### swapchain
/// [VarHandle][#VH_swapchain] - [Getter][#swapchain()] - [Setter][#swapchain(java.lang.foreign.MemorySegment)]
/// ### timeout
/// [VarHandle][#VH_timeout] - [Getter][#timeout()] - [Setter][#timeout(long)]
/// ### semaphore
/// [VarHandle][#VH_semaphore] - [Getter][#semaphore()] - [Setter][#semaphore(java.lang.foreign.MemorySegment)]
/// ### fence
/// [VarHandle][#VH_fence] - [Getter][#fence()] - [Setter][#fence(java.lang.foreign.MemorySegment)]
/// ### deviceMask
/// [VarHandle][#VH_deviceMask] - [Getter][#deviceMask()] - [Setter][#deviceMask(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAcquireNextImageInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkSwapchainKHR swapchain;
///     uint64_t timeout;
///     VkSemaphore semaphore;
///     VkFence fence;
///     uint32_t deviceMask;
/// } VkAcquireNextImageInfoKHR;
/// ```
public final class VkAcquireNextImageInfoKHR extends Struct {
    /// The struct layout of `VkAcquireNextImageInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("swapchain"),
        ValueLayout.JAVA_LONG.withName("timeout"),
        ValueLayout.ADDRESS.withName("semaphore"),
        ValueLayout.ADDRESS.withName("fence"),
        ValueLayout.JAVA_INT.withName("deviceMask")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `swapchain` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_swapchain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchain"));
    /// The [VarHandle] of `timeout` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_timeout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timeout"));
    /// The [VarHandle] of `semaphore` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_semaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphore"));
    /// The [VarHandle] of `fence` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_fence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fence"));
    /// The [VarHandle] of `deviceMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceMask"));

    /// Creates `VkAcquireNextImageInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkAcquireNextImageInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAcquireNextImageInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAcquireNextImageInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAcquireNextImageInfoKHR(segment); }

    /// Creates `VkAcquireNextImageInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAcquireNextImageInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAcquireNextImageInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAcquireNextImageInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAcquireNextImageInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkAcquireNextImageInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkAcquireNextImageInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAcquireNextImageInfoKHR`
    public static VkAcquireNextImageInfoKHR alloc(SegmentAllocator allocator) { return new VkAcquireNextImageInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAcquireNextImageInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAcquireNextImageInfoKHR`
    public static VkAcquireNextImageInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkAcquireNextImageInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAcquireNextImageInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkAcquireNextImageInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAcquireNextImageInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAcquireNextImageInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAcquireNextImageInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkAcquireNextImageInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAcquireNextImageInfoKHR sType(@CType("VkStructureType") int value) { VkAcquireNextImageInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkAcquireNextImageInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkAcquireNextImageInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkAcquireNextImageInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAcquireNextImageInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAcquireNextImageInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAcquireNextImageInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAcquireNextImageInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkAcquireNextImageInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `swapchain` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSwapchainKHR") java.lang.foreign.MemorySegment get_swapchain(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_swapchain.get(segment, 0L, index); }
    /// {@return `swapchain`}
    /// @param segment the segment of the struct
    public static @CType("VkSwapchainKHR") java.lang.foreign.MemorySegment get_swapchain(MemorySegment segment) { return VkAcquireNextImageInfoKHR.get_swapchain(segment, 0L); }
    /// {@return `swapchain` at the given index}
    /// @param index the index
    public @CType("VkSwapchainKHR") java.lang.foreign.MemorySegment swapchainAt(long index) { return VkAcquireNextImageInfoKHR.get_swapchain(this.segment(), index); }
    /// {@return `swapchain`}
    public @CType("VkSwapchainKHR") java.lang.foreign.MemorySegment swapchain() { return VkAcquireNextImageInfoKHR.get_swapchain(this.segment()); }
    /// Sets `swapchain` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_swapchain(MemorySegment segment, long index, @CType("VkSwapchainKHR") java.lang.foreign.MemorySegment value) { VH_swapchain.set(segment, 0L, index, value); }
    /// Sets `swapchain` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_swapchain(MemorySegment segment, @CType("VkSwapchainKHR") java.lang.foreign.MemorySegment value) { VkAcquireNextImageInfoKHR.set_swapchain(segment, 0L, value); }
    /// Sets `swapchain` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAcquireNextImageInfoKHR swapchainAt(long index, @CType("VkSwapchainKHR") java.lang.foreign.MemorySegment value) { VkAcquireNextImageInfoKHR.set_swapchain(this.segment(), index, value); return this; }
    /// Sets `swapchain` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAcquireNextImageInfoKHR swapchain(@CType("VkSwapchainKHR") java.lang.foreign.MemorySegment value) { VkAcquireNextImageInfoKHR.set_swapchain(this.segment(), value); return this; }

    /// {@return `timeout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_timeout(MemorySegment segment, long index) { return (long) VH_timeout.get(segment, 0L, index); }
    /// {@return `timeout`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_timeout(MemorySegment segment) { return VkAcquireNextImageInfoKHR.get_timeout(segment, 0L); }
    /// {@return `timeout` at the given index}
    /// @param index the index
    public @CType("uint64_t") long timeoutAt(long index) { return VkAcquireNextImageInfoKHR.get_timeout(this.segment(), index); }
    /// {@return `timeout`}
    public @CType("uint64_t") long timeout() { return VkAcquireNextImageInfoKHR.get_timeout(this.segment()); }
    /// Sets `timeout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_timeout(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_timeout.set(segment, 0L, index, value); }
    /// Sets `timeout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_timeout(MemorySegment segment, @CType("uint64_t") long value) { VkAcquireNextImageInfoKHR.set_timeout(segment, 0L, value); }
    /// Sets `timeout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAcquireNextImageInfoKHR timeoutAt(long index, @CType("uint64_t") long value) { VkAcquireNextImageInfoKHR.set_timeout(this.segment(), index, value); return this; }
    /// Sets `timeout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAcquireNextImageInfoKHR timeout(@CType("uint64_t") long value) { VkAcquireNextImageInfoKHR.set_timeout(this.segment(), value); return this; }

    /// {@return `semaphore` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSemaphore") java.lang.foreign.MemorySegment get_semaphore(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_semaphore.get(segment, 0L, index); }
    /// {@return `semaphore`}
    /// @param segment the segment of the struct
    public static @CType("VkSemaphore") java.lang.foreign.MemorySegment get_semaphore(MemorySegment segment) { return VkAcquireNextImageInfoKHR.get_semaphore(segment, 0L); }
    /// {@return `semaphore` at the given index}
    /// @param index the index
    public @CType("VkSemaphore") java.lang.foreign.MemorySegment semaphoreAt(long index) { return VkAcquireNextImageInfoKHR.get_semaphore(this.segment(), index); }
    /// {@return `semaphore`}
    public @CType("VkSemaphore") java.lang.foreign.MemorySegment semaphore() { return VkAcquireNextImageInfoKHR.get_semaphore(this.segment()); }
    /// Sets `semaphore` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_semaphore(MemorySegment segment, long index, @CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VH_semaphore.set(segment, 0L, index, value); }
    /// Sets `semaphore` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_semaphore(MemorySegment segment, @CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VkAcquireNextImageInfoKHR.set_semaphore(segment, 0L, value); }
    /// Sets `semaphore` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAcquireNextImageInfoKHR semaphoreAt(long index, @CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VkAcquireNextImageInfoKHR.set_semaphore(this.segment(), index, value); return this; }
    /// Sets `semaphore` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAcquireNextImageInfoKHR semaphore(@CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VkAcquireNextImageInfoKHR.set_semaphore(this.segment(), value); return this; }

    /// {@return `fence` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFence") java.lang.foreign.MemorySegment get_fence(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_fence.get(segment, 0L, index); }
    /// {@return `fence`}
    /// @param segment the segment of the struct
    public static @CType("VkFence") java.lang.foreign.MemorySegment get_fence(MemorySegment segment) { return VkAcquireNextImageInfoKHR.get_fence(segment, 0L); }
    /// {@return `fence` at the given index}
    /// @param index the index
    public @CType("VkFence") java.lang.foreign.MemorySegment fenceAt(long index) { return VkAcquireNextImageInfoKHR.get_fence(this.segment(), index); }
    /// {@return `fence`}
    public @CType("VkFence") java.lang.foreign.MemorySegment fence() { return VkAcquireNextImageInfoKHR.get_fence(this.segment()); }
    /// Sets `fence` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fence(MemorySegment segment, long index, @CType("VkFence") java.lang.foreign.MemorySegment value) { VH_fence.set(segment, 0L, index, value); }
    /// Sets `fence` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fence(MemorySegment segment, @CType("VkFence") java.lang.foreign.MemorySegment value) { VkAcquireNextImageInfoKHR.set_fence(segment, 0L, value); }
    /// Sets `fence` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAcquireNextImageInfoKHR fenceAt(long index, @CType("VkFence") java.lang.foreign.MemorySegment value) { VkAcquireNextImageInfoKHR.set_fence(this.segment(), index, value); return this; }
    /// Sets `fence` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAcquireNextImageInfoKHR fence(@CType("VkFence") java.lang.foreign.MemorySegment value) { VkAcquireNextImageInfoKHR.set_fence(this.segment(), value); return this; }

    /// {@return `deviceMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_deviceMask(MemorySegment segment, long index) { return (int) VH_deviceMask.get(segment, 0L, index); }
    /// {@return `deviceMask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_deviceMask(MemorySegment segment) { return VkAcquireNextImageInfoKHR.get_deviceMask(segment, 0L); }
    /// {@return `deviceMask` at the given index}
    /// @param index the index
    public @CType("uint32_t") int deviceMaskAt(long index) { return VkAcquireNextImageInfoKHR.get_deviceMask(this.segment(), index); }
    /// {@return `deviceMask`}
    public @CType("uint32_t") int deviceMask() { return VkAcquireNextImageInfoKHR.get_deviceMask(this.segment()); }
    /// Sets `deviceMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceMask(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_deviceMask.set(segment, 0L, index, value); }
    /// Sets `deviceMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceMask(MemorySegment segment, @CType("uint32_t") int value) { VkAcquireNextImageInfoKHR.set_deviceMask(segment, 0L, value); }
    /// Sets `deviceMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAcquireNextImageInfoKHR deviceMaskAt(long index, @CType("uint32_t") int value) { VkAcquireNextImageInfoKHR.set_deviceMask(this.segment(), index, value); return this; }
    /// Sets `deviceMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAcquireNextImageInfoKHR deviceMask(@CType("uint32_t") int value) { VkAcquireNextImageInfoKHR.set_deviceMask(this.segment(), value); return this; }

}
