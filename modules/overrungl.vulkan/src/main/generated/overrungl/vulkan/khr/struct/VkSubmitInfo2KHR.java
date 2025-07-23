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
/// struct VkSubmitInfo2KHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkSubmitFlags flags;
///     uint32_t waitSemaphoreInfoCount;
///     const VkSemaphoreSubmitInfo* pWaitSemaphoreInfos;
///     uint32_t commandBufferInfoCount;
///     const VkCommandBufferSubmitInfo* pCommandBufferInfos;
///     uint32_t signalSemaphoreInfoCount;
///     const VkSemaphoreSubmitInfo* pSignalSemaphoreInfos;
/// };
/// ```
public final class VkSubmitInfo2KHR extends GroupType {
    /// The struct layout of `VkSubmitInfo2KHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreInfoCount"),
        ValueLayout.ADDRESS.withName("pWaitSemaphoreInfos"),
        ValueLayout.JAVA_INT.withName("commandBufferInfoCount"),
        ValueLayout.ADDRESS.withName("pCommandBufferInfos"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreInfoCount"),
        ValueLayout.ADDRESS.withName("pSignalSemaphoreInfos")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `waitSemaphoreInfoCount`.
    public static final long OFFSET_waitSemaphoreInfoCount = LAYOUT.byteOffset(PathElement.groupElement("waitSemaphoreInfoCount"));
    /// The memory layout of `waitSemaphoreInfoCount`.
    public static final MemoryLayout LAYOUT_waitSemaphoreInfoCount = LAYOUT.select(PathElement.groupElement("waitSemaphoreInfoCount"));
    /// The [VarHandle] of `waitSemaphoreInfoCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_waitSemaphoreInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("waitSemaphoreInfoCount"));
    /// The byte offset of `pWaitSemaphoreInfos`.
    public static final long OFFSET_pWaitSemaphoreInfos = LAYOUT.byteOffset(PathElement.groupElement("pWaitSemaphoreInfos"));
    /// The memory layout of `pWaitSemaphoreInfos`.
    public static final MemoryLayout LAYOUT_pWaitSemaphoreInfos = LAYOUT.select(PathElement.groupElement("pWaitSemaphoreInfos"));
    /// The [VarHandle] of `pWaitSemaphoreInfos` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pWaitSemaphoreInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWaitSemaphoreInfos"));
    /// The byte offset of `commandBufferInfoCount`.
    public static final long OFFSET_commandBufferInfoCount = LAYOUT.byteOffset(PathElement.groupElement("commandBufferInfoCount"));
    /// The memory layout of `commandBufferInfoCount`.
    public static final MemoryLayout LAYOUT_commandBufferInfoCount = LAYOUT.select(PathElement.groupElement("commandBufferInfoCount"));
    /// The [VarHandle] of `commandBufferInfoCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_commandBufferInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandBufferInfoCount"));
    /// The byte offset of `pCommandBufferInfos`.
    public static final long OFFSET_pCommandBufferInfos = LAYOUT.byteOffset(PathElement.groupElement("pCommandBufferInfos"));
    /// The memory layout of `pCommandBufferInfos`.
    public static final MemoryLayout LAYOUT_pCommandBufferInfos = LAYOUT.select(PathElement.groupElement("pCommandBufferInfos"));
    /// The [VarHandle] of `pCommandBufferInfos` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCommandBufferInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCommandBufferInfos"));
    /// The byte offset of `signalSemaphoreInfoCount`.
    public static final long OFFSET_signalSemaphoreInfoCount = LAYOUT.byteOffset(PathElement.groupElement("signalSemaphoreInfoCount"));
    /// The memory layout of `signalSemaphoreInfoCount`.
    public static final MemoryLayout LAYOUT_signalSemaphoreInfoCount = LAYOUT.select(PathElement.groupElement("signalSemaphoreInfoCount"));
    /// The [VarHandle] of `signalSemaphoreInfoCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_signalSemaphoreInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("signalSemaphoreInfoCount"));
    /// The byte offset of `pSignalSemaphoreInfos`.
    public static final long OFFSET_pSignalSemaphoreInfos = LAYOUT.byteOffset(PathElement.groupElement("pSignalSemaphoreInfos"));
    /// The memory layout of `pSignalSemaphoreInfos`.
    public static final MemoryLayout LAYOUT_pSignalSemaphoreInfos = LAYOUT.select(PathElement.groupElement("pSignalSemaphoreInfos"));
    /// The [VarHandle] of `pSignalSemaphoreInfos` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSignalSemaphoreInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSignalSemaphoreInfos"));

    /// Creates `VkSubmitInfo2KHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSubmitInfo2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSubmitInfo2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubmitInfo2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubmitInfo2KHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSubmitInfo2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubmitInfo2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubmitInfo2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSubmitInfo2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubmitInfo2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubmitInfo2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSubmitInfo2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubmitInfo2KHR`
    public static VkSubmitInfo2KHR alloc(SegmentAllocator allocator) { return new VkSubmitInfo2KHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSubmitInfo2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubmitInfo2KHR`
    public static VkSubmitInfo2KHR alloc(SegmentAllocator allocator, long count) { return new VkSubmitInfo2KHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSubmitInfo2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param waitSemaphoreInfoCount `waitSemaphoreInfoCount`
    /// @param pWaitSemaphoreInfos `pWaitSemaphoreInfos`
    /// @param commandBufferInfoCount `commandBufferInfoCount`
    /// @param pCommandBufferInfos `pCommandBufferInfos`
    /// @param signalSemaphoreInfoCount `signalSemaphoreInfoCount`
    /// @param pSignalSemaphoreInfos `pSignalSemaphoreInfos`
    /// @return the allocated `VkSubmitInfo2KHR`
    public static VkSubmitInfo2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int waitSemaphoreInfoCount, MemorySegment pWaitSemaphoreInfos, int commandBufferInfoCount, MemorySegment pCommandBufferInfos, int signalSemaphoreInfoCount, MemorySegment pSignalSemaphoreInfos) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).waitSemaphoreInfoCount(waitSemaphoreInfoCount).pWaitSemaphoreInfos(pWaitSemaphoreInfos).commandBufferInfoCount(commandBufferInfoCount).pCommandBufferInfos(pCommandBufferInfos).signalSemaphoreInfoCount(signalSemaphoreInfoCount).pSignalSemaphoreInfos(pSignalSemaphoreInfos);
    }

    /// Allocates a `VkSubmitInfo2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param waitSemaphoreInfoCount `waitSemaphoreInfoCount`
    /// @param pWaitSemaphoreInfos `pWaitSemaphoreInfos`
    /// @param commandBufferInfoCount `commandBufferInfoCount`
    /// @param pCommandBufferInfos `pCommandBufferInfos`
    /// @param signalSemaphoreInfoCount `signalSemaphoreInfoCount`
    /// @return the allocated `VkSubmitInfo2KHR`
    public static VkSubmitInfo2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int waitSemaphoreInfoCount, MemorySegment pWaitSemaphoreInfos, int commandBufferInfoCount, MemorySegment pCommandBufferInfos, int signalSemaphoreInfoCount) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).waitSemaphoreInfoCount(waitSemaphoreInfoCount).pWaitSemaphoreInfos(pWaitSemaphoreInfos).commandBufferInfoCount(commandBufferInfoCount).pCommandBufferInfos(pCommandBufferInfos).signalSemaphoreInfoCount(signalSemaphoreInfoCount);
    }

    /// Allocates a `VkSubmitInfo2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param waitSemaphoreInfoCount `waitSemaphoreInfoCount`
    /// @param pWaitSemaphoreInfos `pWaitSemaphoreInfos`
    /// @param commandBufferInfoCount `commandBufferInfoCount`
    /// @param pCommandBufferInfos `pCommandBufferInfos`
    /// @return the allocated `VkSubmitInfo2KHR`
    public static VkSubmitInfo2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int waitSemaphoreInfoCount, MemorySegment pWaitSemaphoreInfos, int commandBufferInfoCount, MemorySegment pCommandBufferInfos) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).waitSemaphoreInfoCount(waitSemaphoreInfoCount).pWaitSemaphoreInfos(pWaitSemaphoreInfos).commandBufferInfoCount(commandBufferInfoCount).pCommandBufferInfos(pCommandBufferInfos);
    }

    /// Allocates a `VkSubmitInfo2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param waitSemaphoreInfoCount `waitSemaphoreInfoCount`
    /// @param pWaitSemaphoreInfos `pWaitSemaphoreInfos`
    /// @param commandBufferInfoCount `commandBufferInfoCount`
    /// @return the allocated `VkSubmitInfo2KHR`
    public static VkSubmitInfo2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int waitSemaphoreInfoCount, MemorySegment pWaitSemaphoreInfos, int commandBufferInfoCount) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).waitSemaphoreInfoCount(waitSemaphoreInfoCount).pWaitSemaphoreInfos(pWaitSemaphoreInfos).commandBufferInfoCount(commandBufferInfoCount);
    }

    /// Allocates a `VkSubmitInfo2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param waitSemaphoreInfoCount `waitSemaphoreInfoCount`
    /// @param pWaitSemaphoreInfos `pWaitSemaphoreInfos`
    /// @return the allocated `VkSubmitInfo2KHR`
    public static VkSubmitInfo2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int waitSemaphoreInfoCount, MemorySegment pWaitSemaphoreInfos) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).waitSemaphoreInfoCount(waitSemaphoreInfoCount).pWaitSemaphoreInfos(pWaitSemaphoreInfos);
    }

    /// Allocates a `VkSubmitInfo2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param waitSemaphoreInfoCount `waitSemaphoreInfoCount`
    /// @return the allocated `VkSubmitInfo2KHR`
    public static VkSubmitInfo2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int waitSemaphoreInfoCount) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).waitSemaphoreInfoCount(waitSemaphoreInfoCount);
    }

    /// Allocates a `VkSubmitInfo2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @return the allocated `VkSubmitInfo2KHR`
    public static VkSubmitInfo2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags);
    }

    /// Allocates a `VkSubmitInfo2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkSubmitInfo2KHR`
    public static VkSubmitInfo2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkSubmitInfo2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkSubmitInfo2KHR`
    public static VkSubmitInfo2KHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSubmitInfo2KHR copyFrom(VkSubmitInfo2KHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSubmitInfo2KHR reinterpret(long count) { return new VkSubmitInfo2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSubmitInfo2KHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSubmitInfo2KHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2KHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `waitSemaphoreInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int waitSemaphoreInfoCount(MemorySegment segment, long index) { return (int) VH_waitSemaphoreInfoCount.get(segment, 0L, index); }
    /// {@return `waitSemaphoreInfoCount`}
    public int waitSemaphoreInfoCount() { return waitSemaphoreInfoCount(this.segment(), 0L); }
    /// Sets `waitSemaphoreInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void waitSemaphoreInfoCount(MemorySegment segment, long index, int value) { VH_waitSemaphoreInfoCount.set(segment, 0L, index, value); }
    /// Sets `waitSemaphoreInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2KHR waitSemaphoreInfoCount(int value) { waitSemaphoreInfoCount(this.segment(), 0L, value); return this; }

    /// {@return `pWaitSemaphoreInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pWaitSemaphoreInfos(MemorySegment segment, long index) { return (MemorySegment) VH_pWaitSemaphoreInfos.get(segment, 0L, index); }
    /// {@return `pWaitSemaphoreInfos`}
    public MemorySegment pWaitSemaphoreInfos() { return pWaitSemaphoreInfos(this.segment(), 0L); }
    /// Sets `pWaitSemaphoreInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pWaitSemaphoreInfos(MemorySegment segment, long index, MemorySegment value) { VH_pWaitSemaphoreInfos.set(segment, 0L, index, value); }
    /// Sets `pWaitSemaphoreInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2KHR pWaitSemaphoreInfos(MemorySegment value) { pWaitSemaphoreInfos(this.segment(), 0L, value); return this; }

    /// {@return `commandBufferInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int commandBufferInfoCount(MemorySegment segment, long index) { return (int) VH_commandBufferInfoCount.get(segment, 0L, index); }
    /// {@return `commandBufferInfoCount`}
    public int commandBufferInfoCount() { return commandBufferInfoCount(this.segment(), 0L); }
    /// Sets `commandBufferInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void commandBufferInfoCount(MemorySegment segment, long index, int value) { VH_commandBufferInfoCount.set(segment, 0L, index, value); }
    /// Sets `commandBufferInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2KHR commandBufferInfoCount(int value) { commandBufferInfoCount(this.segment(), 0L, value); return this; }

    /// {@return `pCommandBufferInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pCommandBufferInfos(MemorySegment segment, long index) { return (MemorySegment) VH_pCommandBufferInfos.get(segment, 0L, index); }
    /// {@return `pCommandBufferInfos`}
    public MemorySegment pCommandBufferInfos() { return pCommandBufferInfos(this.segment(), 0L); }
    /// Sets `pCommandBufferInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pCommandBufferInfos(MemorySegment segment, long index, MemorySegment value) { VH_pCommandBufferInfos.set(segment, 0L, index, value); }
    /// Sets `pCommandBufferInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2KHR pCommandBufferInfos(MemorySegment value) { pCommandBufferInfos(this.segment(), 0L, value); return this; }

    /// {@return `signalSemaphoreInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int signalSemaphoreInfoCount(MemorySegment segment, long index) { return (int) VH_signalSemaphoreInfoCount.get(segment, 0L, index); }
    /// {@return `signalSemaphoreInfoCount`}
    public int signalSemaphoreInfoCount() { return signalSemaphoreInfoCount(this.segment(), 0L); }
    /// Sets `signalSemaphoreInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void signalSemaphoreInfoCount(MemorySegment segment, long index, int value) { VH_signalSemaphoreInfoCount.set(segment, 0L, index, value); }
    /// Sets `signalSemaphoreInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2KHR signalSemaphoreInfoCount(int value) { signalSemaphoreInfoCount(this.segment(), 0L, value); return this; }

    /// {@return `pSignalSemaphoreInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSignalSemaphoreInfos(MemorySegment segment, long index) { return (MemorySegment) VH_pSignalSemaphoreInfos.get(segment, 0L, index); }
    /// {@return `pSignalSemaphoreInfos`}
    public MemorySegment pSignalSemaphoreInfos() { return pSignalSemaphoreInfos(this.segment(), 0L); }
    /// Sets `pSignalSemaphoreInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSignalSemaphoreInfos(MemorySegment segment, long index, MemorySegment value) { VH_pSignalSemaphoreInfos.set(segment, 0L, index, value); }
    /// Sets `pSignalSemaphoreInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2KHR pSignalSemaphoreInfos(MemorySegment value) { pSignalSemaphoreInfos(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSubmitInfo2KHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSubmitInfo2KHR`
    public VkSubmitInfo2KHR asSlice(long index) { return new VkSubmitInfo2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSubmitInfo2KHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSubmitInfo2KHR`
    public VkSubmitInfo2KHR asSlice(long index, long count) { return new VkSubmitInfo2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSubmitInfo2KHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSubmitInfo2KHR at(long index, Consumer<VkSubmitInfo2KHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2KHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2KHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2KHR flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `waitSemaphoreInfoCount` at the given index}
    /// @param index the index of the struct buffer
    public int waitSemaphoreInfoCountAt(long index) { return waitSemaphoreInfoCount(this.segment(), index); }
    /// Sets `waitSemaphoreInfoCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2KHR waitSemaphoreInfoCountAt(long index, int value) { waitSemaphoreInfoCount(this.segment(), index, value); return this; }

    /// {@return `pWaitSemaphoreInfos` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pWaitSemaphoreInfosAt(long index) { return pWaitSemaphoreInfos(this.segment(), index); }
    /// Sets `pWaitSemaphoreInfos` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2KHR pWaitSemaphoreInfosAt(long index, MemorySegment value) { pWaitSemaphoreInfos(this.segment(), index, value); return this; }

    /// {@return `commandBufferInfoCount` at the given index}
    /// @param index the index of the struct buffer
    public int commandBufferInfoCountAt(long index) { return commandBufferInfoCount(this.segment(), index); }
    /// Sets `commandBufferInfoCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2KHR commandBufferInfoCountAt(long index, int value) { commandBufferInfoCount(this.segment(), index, value); return this; }

    /// {@return `pCommandBufferInfos` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pCommandBufferInfosAt(long index) { return pCommandBufferInfos(this.segment(), index); }
    /// Sets `pCommandBufferInfos` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2KHR pCommandBufferInfosAt(long index, MemorySegment value) { pCommandBufferInfos(this.segment(), index, value); return this; }

    /// {@return `signalSemaphoreInfoCount` at the given index}
    /// @param index the index of the struct buffer
    public int signalSemaphoreInfoCountAt(long index) { return signalSemaphoreInfoCount(this.segment(), index); }
    /// Sets `signalSemaphoreInfoCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2KHR signalSemaphoreInfoCountAt(long index, int value) { signalSemaphoreInfoCount(this.segment(), index, value); return this; }

    /// {@return `pSignalSemaphoreInfos` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pSignalSemaphoreInfosAt(long index) { return pSignalSemaphoreInfos(this.segment(), index); }
    /// Sets `pSignalSemaphoreInfos` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2KHR pSignalSemaphoreInfosAt(long index, MemorySegment value) { pSignalSemaphoreInfos(this.segment(), index, value); return this; }

}
