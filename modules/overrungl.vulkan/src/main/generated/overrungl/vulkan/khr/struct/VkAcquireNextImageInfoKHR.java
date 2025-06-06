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
/// struct VkAcquireNextImageInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkSwapchainKHR swapchain;
///     uint64_t timeout;
///     (uint64_t) VkSemaphore semaphore;
///     (uint64_t) VkFence fence;
///     uint32_t deviceMask;
/// };
/// ```
public sealed class VkAcquireNextImageInfoKHR extends GroupType {
    /// The struct layout of `VkAcquireNextImageInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("swapchain"),
        ValueLayout.JAVA_LONG.withName("timeout"),
        ValueLayout.JAVA_LONG.withName("semaphore"),
        ValueLayout.JAVA_LONG.withName("fence"),
        ValueLayout.JAVA_INT.withName("deviceMask")
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
    /// The byte offset of `timeout`.
    public static final long OFFSET_timeout = LAYOUT.byteOffset(PathElement.groupElement("timeout"));
    /// The memory layout of `timeout`.
    public static final MemoryLayout LAYOUT_timeout = LAYOUT.select(PathElement.groupElement("timeout"));
    /// The [VarHandle] of `timeout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_timeout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timeout"));
    /// The byte offset of `semaphore`.
    public static final long OFFSET_semaphore = LAYOUT.byteOffset(PathElement.groupElement("semaphore"));
    /// The memory layout of `semaphore`.
    public static final MemoryLayout LAYOUT_semaphore = LAYOUT.select(PathElement.groupElement("semaphore"));
    /// The [VarHandle] of `semaphore` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_semaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphore"));
    /// The byte offset of `fence`.
    public static final long OFFSET_fence = LAYOUT.byteOffset(PathElement.groupElement("fence"));
    /// The memory layout of `fence`.
    public static final MemoryLayout LAYOUT_fence = LAYOUT.select(PathElement.groupElement("fence"));
    /// The [VarHandle] of `fence` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fence"));
    /// The byte offset of `deviceMask`.
    public static final long OFFSET_deviceMask = LAYOUT.byteOffset(PathElement.groupElement("deviceMask"));
    /// The memory layout of `deviceMask`.
    public static final MemoryLayout LAYOUT_deviceMask = LAYOUT.select(PathElement.groupElement("deviceMask"));
    /// The [VarHandle] of `deviceMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceMask"));

    /// Creates `VkAcquireNextImageInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkAcquireNextImageInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAcquireNextImageInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAcquireNextImageInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAcquireNextImageInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAcquireNextImageInfoKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkAcquireNextImageInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAcquireNextImageInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAcquireNextImageInfoKHR`
    public static VkAcquireNextImageInfoKHR alloc(SegmentAllocator allocator) { return new VkAcquireNextImageInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAcquireNextImageInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAcquireNextImageInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAcquireNextImageInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param swapchain `swapchain`
    /// @param timeout `timeout`
    /// @param semaphore `semaphore`
    /// @param fence `fence`
    /// @param deviceMask `deviceMask`
    /// @return the allocated `VkAcquireNextImageInfoKHR`
    public static VkAcquireNextImageInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long swapchain, long timeout, long semaphore, long fence, int deviceMask) {
        return alloc(allocator).sType(sType).pNext(pNext).swapchain(swapchain).timeout(timeout).semaphore(semaphore).fence(fence).deviceMask(deviceMask);
    }

    /// Allocates a `VkAcquireNextImageInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param swapchain `swapchain`
    /// @param timeout `timeout`
    /// @param semaphore `semaphore`
    /// @param fence `fence`
    /// @return the allocated `VkAcquireNextImageInfoKHR`
    public static VkAcquireNextImageInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long swapchain, long timeout, long semaphore, long fence) {
        return alloc(allocator).sType(sType).pNext(pNext).swapchain(swapchain).timeout(timeout).semaphore(semaphore).fence(fence);
    }

    /// Allocates a `VkAcquireNextImageInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param swapchain `swapchain`
    /// @param timeout `timeout`
    /// @param semaphore `semaphore`
    /// @return the allocated `VkAcquireNextImageInfoKHR`
    public static VkAcquireNextImageInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long swapchain, long timeout, long semaphore) {
        return alloc(allocator).sType(sType).pNext(pNext).swapchain(swapchain).timeout(timeout).semaphore(semaphore);
    }

    /// Allocates a `VkAcquireNextImageInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param swapchain `swapchain`
    /// @param timeout `timeout`
    /// @return the allocated `VkAcquireNextImageInfoKHR`
    public static VkAcquireNextImageInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long swapchain, long timeout) {
        return alloc(allocator).sType(sType).pNext(pNext).swapchain(swapchain).timeout(timeout);
    }

    /// Allocates a `VkAcquireNextImageInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param swapchain `swapchain`
    /// @return the allocated `VkAcquireNextImageInfoKHR`
    public static VkAcquireNextImageInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long swapchain) {
        return alloc(allocator).sType(sType).pNext(pNext).swapchain(swapchain);
    }

    /// Allocates a `VkAcquireNextImageInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkAcquireNextImageInfoKHR`
    public static VkAcquireNextImageInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkAcquireNextImageInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkAcquireNextImageInfoKHR`
    public static VkAcquireNextImageInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAcquireNextImageInfoKHR copyFrom(VkAcquireNextImageInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkAcquireNextImageInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkAcquireNextImageInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkAcquireNextImageInfoKHR swapchain(long value) { swapchain(this.segment(), 0L, value); return this; }

    /// {@return `timeout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long timeout(MemorySegment segment, long index) { return (long) VH_timeout.get(segment, 0L, index); }
    /// {@return `timeout`}
    public long timeout() { return timeout(this.segment(), 0L); }
    /// Sets `timeout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void timeout(MemorySegment segment, long index, long value) { VH_timeout.set(segment, 0L, index, value); }
    /// Sets `timeout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAcquireNextImageInfoKHR timeout(long value) { timeout(this.segment(), 0L, value); return this; }

    /// {@return `semaphore` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long semaphore(MemorySegment segment, long index) { return (long) VH_semaphore.get(segment, 0L, index); }
    /// {@return `semaphore`}
    public long semaphore() { return semaphore(this.segment(), 0L); }
    /// Sets `semaphore` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void semaphore(MemorySegment segment, long index, long value) { VH_semaphore.set(segment, 0L, index, value); }
    /// Sets `semaphore` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAcquireNextImageInfoKHR semaphore(long value) { semaphore(this.segment(), 0L, value); return this; }

    /// {@return `fence` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long fence(MemorySegment segment, long index) { return (long) VH_fence.get(segment, 0L, index); }
    /// {@return `fence`}
    public long fence() { return fence(this.segment(), 0L); }
    /// Sets `fence` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fence(MemorySegment segment, long index, long value) { VH_fence.set(segment, 0L, index, value); }
    /// Sets `fence` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAcquireNextImageInfoKHR fence(long value) { fence(this.segment(), 0L, value); return this; }

    /// {@return `deviceMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceMask(MemorySegment segment, long index) { return (int) VH_deviceMask.get(segment, 0L, index); }
    /// {@return `deviceMask`}
    public int deviceMask() { return deviceMask(this.segment(), 0L); }
    /// Sets `deviceMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceMask(MemorySegment segment, long index, int value) { VH_deviceMask.set(segment, 0L, index, value); }
    /// Sets `deviceMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAcquireNextImageInfoKHR deviceMask(int value) { deviceMask(this.segment(), 0L, value); return this; }

    /// A buffer of [VkAcquireNextImageInfoKHR].
    public static final class Buffer extends VkAcquireNextImageInfoKHR {
        private final long elementCount;

        /// Creates `VkAcquireNextImageInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAcquireNextImageInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAcquireNextImageInfoKHR`
        public VkAcquireNextImageInfoKHR asSlice(long index) { return new VkAcquireNextImageInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAcquireNextImageInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAcquireNextImageInfoKHR`
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

        /// {@return `timeout` at the given index}
        /// @param index the index of the struct buffer
        public long timeoutAt(long index) { return timeout(this.segment(), index); }
        /// Sets `timeout` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer timeoutAt(long index, long value) { timeout(this.segment(), index, value); return this; }

        /// {@return `semaphore` at the given index}
        /// @param index the index of the struct buffer
        public long semaphoreAt(long index) { return semaphore(this.segment(), index); }
        /// Sets `semaphore` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer semaphoreAt(long index, long value) { semaphore(this.segment(), index, value); return this; }

        /// {@return `fence` at the given index}
        /// @param index the index of the struct buffer
        public long fenceAt(long index) { return fence(this.segment(), index); }
        /// Sets `fence` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer fenceAt(long index, long value) { fence(this.segment(), index, value); return this; }

        /// {@return `deviceMask` at the given index}
        /// @param index the index of the struct buffer
        public int deviceMaskAt(long index) { return deviceMask(this.segment(), index); }
        /// Sets `deviceMask` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer deviceMaskAt(long index, int value) { deviceMask(this.segment(), index, value); return this; }

    }
}
