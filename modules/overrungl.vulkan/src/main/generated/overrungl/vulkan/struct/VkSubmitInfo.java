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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkSubmitInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t waitSemaphoreCount;
///     const VkSemaphore* pWaitSemaphores;
///     const VkPipelineStageFlags* pWaitDstStageMask;
///     uint32_t commandBufferCount;
///     const VkCommandBuffer* pCommandBuffers;
///     uint32_t signalSemaphoreCount;
///     const VkSemaphore* pSignalSemaphores;
/// };
/// ```
public final class VkSubmitInfo extends GroupType {
    /// The struct layout of `VkSubmitInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreCount"),
        ValueLayout.ADDRESS.withName("pWaitSemaphores"),
        ValueLayout.ADDRESS.withName("pWaitDstStageMask"),
        ValueLayout.JAVA_INT.withName("commandBufferCount"),
        ValueLayout.ADDRESS.withName("pCommandBuffers"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreCount"),
        ValueLayout.ADDRESS.withName("pSignalSemaphores")
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
    /// The byte offset of `pWaitDstStageMask`.
    public static final long OFFSET_pWaitDstStageMask = LAYOUT.byteOffset(PathElement.groupElement("pWaitDstStageMask"));
    /// The memory layout of `pWaitDstStageMask`.
    public static final MemoryLayout LAYOUT_pWaitDstStageMask = LAYOUT.select(PathElement.groupElement("pWaitDstStageMask"));
    /// The [VarHandle] of `pWaitDstStageMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pWaitDstStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWaitDstStageMask"));
    /// The byte offset of `commandBufferCount`.
    public static final long OFFSET_commandBufferCount = LAYOUT.byteOffset(PathElement.groupElement("commandBufferCount"));
    /// The memory layout of `commandBufferCount`.
    public static final MemoryLayout LAYOUT_commandBufferCount = LAYOUT.select(PathElement.groupElement("commandBufferCount"));
    /// The [VarHandle] of `commandBufferCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_commandBufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandBufferCount"));
    /// The byte offset of `pCommandBuffers`.
    public static final long OFFSET_pCommandBuffers = LAYOUT.byteOffset(PathElement.groupElement("pCommandBuffers"));
    /// The memory layout of `pCommandBuffers`.
    public static final MemoryLayout LAYOUT_pCommandBuffers = LAYOUT.select(PathElement.groupElement("pCommandBuffers"));
    /// The [VarHandle] of `pCommandBuffers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCommandBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCommandBuffers"));
    /// The byte offset of `signalSemaphoreCount`.
    public static final long OFFSET_signalSemaphoreCount = LAYOUT.byteOffset(PathElement.groupElement("signalSemaphoreCount"));
    /// The memory layout of `signalSemaphoreCount`.
    public static final MemoryLayout LAYOUT_signalSemaphoreCount = LAYOUT.select(PathElement.groupElement("signalSemaphoreCount"));
    /// The [VarHandle] of `signalSemaphoreCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_signalSemaphoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("signalSemaphoreCount"));
    /// The byte offset of `pSignalSemaphores`.
    public static final long OFFSET_pSignalSemaphores = LAYOUT.byteOffset(PathElement.groupElement("pSignalSemaphores"));
    /// The memory layout of `pSignalSemaphores`.
    public static final MemoryLayout LAYOUT_pSignalSemaphores = LAYOUT.select(PathElement.groupElement("pSignalSemaphores"));
    /// The [VarHandle] of `pSignalSemaphores` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSignalSemaphores = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSignalSemaphores"));

    /// Creates `VkSubmitInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSubmitInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSubmitInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubmitInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubmitInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSubmitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubmitInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubmitInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSubmitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubmitInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubmitInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSubmitInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubmitInfo`
    public static VkSubmitInfo alloc(SegmentAllocator allocator) { return new VkSubmitInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSubmitInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubmitInfo`
    public static VkSubmitInfo alloc(SegmentAllocator allocator, long count) { return new VkSubmitInfo(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSubmitInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param waitSemaphoreCount `waitSemaphoreCount`
    /// @param pWaitSemaphores `pWaitSemaphores`
    /// @param pWaitDstStageMask `pWaitDstStageMask`
    /// @param commandBufferCount `commandBufferCount`
    /// @param pCommandBuffers `pCommandBuffers`
    /// @param signalSemaphoreCount `signalSemaphoreCount`
    /// @param pSignalSemaphores `pSignalSemaphores`
    /// @return the allocated `VkSubmitInfo`
    public static VkSubmitInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int waitSemaphoreCount, MemorySegment pWaitSemaphores, MemorySegment pWaitDstStageMask, int commandBufferCount, MemorySegment pCommandBuffers, int signalSemaphoreCount, MemorySegment pSignalSemaphores) {
        return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount).pWaitSemaphores(pWaitSemaphores).pWaitDstStageMask(pWaitDstStageMask).commandBufferCount(commandBufferCount).pCommandBuffers(pCommandBuffers).signalSemaphoreCount(signalSemaphoreCount).pSignalSemaphores(pSignalSemaphores);
    }

    /// Allocates a `VkSubmitInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param waitSemaphoreCount `waitSemaphoreCount`
    /// @param pWaitSemaphores `pWaitSemaphores`
    /// @param pWaitDstStageMask `pWaitDstStageMask`
    /// @param commandBufferCount `commandBufferCount`
    /// @param pCommandBuffers `pCommandBuffers`
    /// @param signalSemaphoreCount `signalSemaphoreCount`
    /// @return the allocated `VkSubmitInfo`
    public static VkSubmitInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int waitSemaphoreCount, MemorySegment pWaitSemaphores, MemorySegment pWaitDstStageMask, int commandBufferCount, MemorySegment pCommandBuffers, int signalSemaphoreCount) {
        return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount).pWaitSemaphores(pWaitSemaphores).pWaitDstStageMask(pWaitDstStageMask).commandBufferCount(commandBufferCount).pCommandBuffers(pCommandBuffers).signalSemaphoreCount(signalSemaphoreCount);
    }

    /// Allocates a `VkSubmitInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param waitSemaphoreCount `waitSemaphoreCount`
    /// @param pWaitSemaphores `pWaitSemaphores`
    /// @param pWaitDstStageMask `pWaitDstStageMask`
    /// @param commandBufferCount `commandBufferCount`
    /// @param pCommandBuffers `pCommandBuffers`
    /// @return the allocated `VkSubmitInfo`
    public static VkSubmitInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int waitSemaphoreCount, MemorySegment pWaitSemaphores, MemorySegment pWaitDstStageMask, int commandBufferCount, MemorySegment pCommandBuffers) {
        return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount).pWaitSemaphores(pWaitSemaphores).pWaitDstStageMask(pWaitDstStageMask).commandBufferCount(commandBufferCount).pCommandBuffers(pCommandBuffers);
    }

    /// Allocates a `VkSubmitInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param waitSemaphoreCount `waitSemaphoreCount`
    /// @param pWaitSemaphores `pWaitSemaphores`
    /// @param pWaitDstStageMask `pWaitDstStageMask`
    /// @param commandBufferCount `commandBufferCount`
    /// @return the allocated `VkSubmitInfo`
    public static VkSubmitInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int waitSemaphoreCount, MemorySegment pWaitSemaphores, MemorySegment pWaitDstStageMask, int commandBufferCount) {
        return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount).pWaitSemaphores(pWaitSemaphores).pWaitDstStageMask(pWaitDstStageMask).commandBufferCount(commandBufferCount);
    }

    /// Allocates a `VkSubmitInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param waitSemaphoreCount `waitSemaphoreCount`
    /// @param pWaitSemaphores `pWaitSemaphores`
    /// @param pWaitDstStageMask `pWaitDstStageMask`
    /// @return the allocated `VkSubmitInfo`
    public static VkSubmitInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int waitSemaphoreCount, MemorySegment pWaitSemaphores, MemorySegment pWaitDstStageMask) {
        return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount).pWaitSemaphores(pWaitSemaphores).pWaitDstStageMask(pWaitDstStageMask);
    }

    /// Allocates a `VkSubmitInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param waitSemaphoreCount `waitSemaphoreCount`
    /// @param pWaitSemaphores `pWaitSemaphores`
    /// @return the allocated `VkSubmitInfo`
    public static VkSubmitInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int waitSemaphoreCount, MemorySegment pWaitSemaphores) {
        return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount).pWaitSemaphores(pWaitSemaphores);
    }

    /// Allocates a `VkSubmitInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param waitSemaphoreCount `waitSemaphoreCount`
    /// @return the allocated `VkSubmitInfo`
    public static VkSubmitInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int waitSemaphoreCount) {
        return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount);
    }

    /// Allocates a `VkSubmitInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkSubmitInfo`
    public static VkSubmitInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkSubmitInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkSubmitInfo`
    public static VkSubmitInfo allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSubmitInfo copyFrom(VkSubmitInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSubmitInfo reinterpret(long count) { return new VkSubmitInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSubmitInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSubmitInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkSubmitInfo waitSemaphoreCount(int value) { waitSemaphoreCount(this.segment(), 0L, value); return this; }

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
    public VkSubmitInfo pWaitSemaphores(MemorySegment value) { pWaitSemaphores(this.segment(), 0L, value); return this; }

    /// {@return `pWaitDstStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pWaitDstStageMask(MemorySegment segment, long index) { return (MemorySegment) VH_pWaitDstStageMask.get(segment, 0L, index); }
    /// {@return `pWaitDstStageMask`}
    public MemorySegment pWaitDstStageMask() { return pWaitDstStageMask(this.segment(), 0L); }
    /// Sets `pWaitDstStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pWaitDstStageMask(MemorySegment segment, long index, MemorySegment value) { VH_pWaitDstStageMask.set(segment, 0L, index, value); }
    /// Sets `pWaitDstStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo pWaitDstStageMask(MemorySegment value) { pWaitDstStageMask(this.segment(), 0L, value); return this; }

    /// {@return `commandBufferCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int commandBufferCount(MemorySegment segment, long index) { return (int) VH_commandBufferCount.get(segment, 0L, index); }
    /// {@return `commandBufferCount`}
    public int commandBufferCount() { return commandBufferCount(this.segment(), 0L); }
    /// Sets `commandBufferCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void commandBufferCount(MemorySegment segment, long index, int value) { VH_commandBufferCount.set(segment, 0L, index, value); }
    /// Sets `commandBufferCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo commandBufferCount(int value) { commandBufferCount(this.segment(), 0L, value); return this; }

    /// {@return `pCommandBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pCommandBuffers(MemorySegment segment, long index) { return (MemorySegment) VH_pCommandBuffers.get(segment, 0L, index); }
    /// {@return `pCommandBuffers`}
    public MemorySegment pCommandBuffers() { return pCommandBuffers(this.segment(), 0L); }
    /// Sets `pCommandBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pCommandBuffers(MemorySegment segment, long index, MemorySegment value) { VH_pCommandBuffers.set(segment, 0L, index, value); }
    /// Sets `pCommandBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo pCommandBuffers(MemorySegment value) { pCommandBuffers(this.segment(), 0L, value); return this; }

    /// {@return `signalSemaphoreCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int signalSemaphoreCount(MemorySegment segment, long index) { return (int) VH_signalSemaphoreCount.get(segment, 0L, index); }
    /// {@return `signalSemaphoreCount`}
    public int signalSemaphoreCount() { return signalSemaphoreCount(this.segment(), 0L); }
    /// Sets `signalSemaphoreCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void signalSemaphoreCount(MemorySegment segment, long index, int value) { VH_signalSemaphoreCount.set(segment, 0L, index, value); }
    /// Sets `signalSemaphoreCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo signalSemaphoreCount(int value) { signalSemaphoreCount(this.segment(), 0L, value); return this; }

    /// {@return `pSignalSemaphores` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSignalSemaphores(MemorySegment segment, long index) { return (MemorySegment) VH_pSignalSemaphores.get(segment, 0L, index); }
    /// {@return `pSignalSemaphores`}
    public MemorySegment pSignalSemaphores() { return pSignalSemaphores(this.segment(), 0L); }
    /// Sets `pSignalSemaphores` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSignalSemaphores(MemorySegment segment, long index, MemorySegment value) { VH_pSignalSemaphores.set(segment, 0L, index, value); }
    /// Sets `pSignalSemaphores` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo pSignalSemaphores(MemorySegment value) { pSignalSemaphores(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSubmitInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSubmitInfo`
    public VkSubmitInfo asSlice(long index) { return new VkSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSubmitInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSubmitInfo`
    public VkSubmitInfo asSlice(long index, long count) { return new VkSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSubmitInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSubmitInfo at(long index, Consumer<VkSubmitInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `waitSemaphoreCount` at the given index}
    /// @param index the index of the struct buffer
    public int waitSemaphoreCountAt(long index) { return waitSemaphoreCount(this.segment(), index); }
    /// Sets `waitSemaphoreCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo waitSemaphoreCountAt(long index, int value) { waitSemaphoreCount(this.segment(), index, value); return this; }

    /// {@return `pWaitSemaphores` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pWaitSemaphoresAt(long index) { return pWaitSemaphores(this.segment(), index); }
    /// Sets `pWaitSemaphores` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo pWaitSemaphoresAt(long index, MemorySegment value) { pWaitSemaphores(this.segment(), index, value); return this; }

    /// {@return `pWaitDstStageMask` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pWaitDstStageMaskAt(long index) { return pWaitDstStageMask(this.segment(), index); }
    /// Sets `pWaitDstStageMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo pWaitDstStageMaskAt(long index, MemorySegment value) { pWaitDstStageMask(this.segment(), index, value); return this; }

    /// {@return `commandBufferCount` at the given index}
    /// @param index the index of the struct buffer
    public int commandBufferCountAt(long index) { return commandBufferCount(this.segment(), index); }
    /// Sets `commandBufferCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo commandBufferCountAt(long index, int value) { commandBufferCount(this.segment(), index, value); return this; }

    /// {@return `pCommandBuffers` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pCommandBuffersAt(long index) { return pCommandBuffers(this.segment(), index); }
    /// Sets `pCommandBuffers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo pCommandBuffersAt(long index, MemorySegment value) { pCommandBuffers(this.segment(), index, value); return this; }

    /// {@return `signalSemaphoreCount` at the given index}
    /// @param index the index of the struct buffer
    public int signalSemaphoreCountAt(long index) { return signalSemaphoreCount(this.segment(), index); }
    /// Sets `signalSemaphoreCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo signalSemaphoreCountAt(long index, int value) { signalSemaphoreCount(this.segment(), index, value); return this; }

    /// {@return `pSignalSemaphores` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pSignalSemaphoresAt(long index) { return pSignalSemaphores(this.segment(), index); }
    /// Sets `pSignalSemaphores` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo pSignalSemaphoresAt(long index, MemorySegment value) { pSignalSemaphores(this.segment(), index, value); return this; }

}
