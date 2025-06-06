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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkBindSparseInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t waitSemaphoreCount;
///     const VkSemaphore* pWaitSemaphores;
///     uint32_t bufferBindCount;
///     const VkSparseBufferMemoryBindInfo* pBufferBinds;
///     uint32_t imageOpaqueBindCount;
///     const VkSparseImageOpaqueMemoryBindInfo* pImageOpaqueBinds;
///     uint32_t imageBindCount;
///     const VkSparseImageMemoryBindInfo* pImageBinds;
///     uint32_t signalSemaphoreCount;
///     const VkSemaphore* pSignalSemaphores;
/// };
/// ```
public sealed class VkBindSparseInfo extends GroupType {
    /// The struct layout of `VkBindSparseInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreCount"),
        ValueLayout.ADDRESS.withName("pWaitSemaphores"),
        ValueLayout.JAVA_INT.withName("bufferBindCount"),
        ValueLayout.ADDRESS.withName("pBufferBinds"),
        ValueLayout.JAVA_INT.withName("imageOpaqueBindCount"),
        ValueLayout.ADDRESS.withName("pImageOpaqueBinds"),
        ValueLayout.JAVA_INT.withName("imageBindCount"),
        ValueLayout.ADDRESS.withName("pImageBinds"),
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
    /// The byte offset of `bufferBindCount`.
    public static final long OFFSET_bufferBindCount = LAYOUT.byteOffset(PathElement.groupElement("bufferBindCount"));
    /// The memory layout of `bufferBindCount`.
    public static final MemoryLayout LAYOUT_bufferBindCount = LAYOUT.select(PathElement.groupElement("bufferBindCount"));
    /// The [VarHandle] of `bufferBindCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferBindCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferBindCount"));
    /// The byte offset of `pBufferBinds`.
    public static final long OFFSET_pBufferBinds = LAYOUT.byteOffset(PathElement.groupElement("pBufferBinds"));
    /// The memory layout of `pBufferBinds`.
    public static final MemoryLayout LAYOUT_pBufferBinds = LAYOUT.select(PathElement.groupElement("pBufferBinds"));
    /// The [VarHandle] of `pBufferBinds` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pBufferBinds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBufferBinds"));
    /// The byte offset of `imageOpaqueBindCount`.
    public static final long OFFSET_imageOpaqueBindCount = LAYOUT.byteOffset(PathElement.groupElement("imageOpaqueBindCount"));
    /// The memory layout of `imageOpaqueBindCount`.
    public static final MemoryLayout LAYOUT_imageOpaqueBindCount = LAYOUT.select(PathElement.groupElement("imageOpaqueBindCount"));
    /// The [VarHandle] of `imageOpaqueBindCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageOpaqueBindCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageOpaqueBindCount"));
    /// The byte offset of `pImageOpaqueBinds`.
    public static final long OFFSET_pImageOpaqueBinds = LAYOUT.byteOffset(PathElement.groupElement("pImageOpaqueBinds"));
    /// The memory layout of `pImageOpaqueBinds`.
    public static final MemoryLayout LAYOUT_pImageOpaqueBinds = LAYOUT.select(PathElement.groupElement("pImageOpaqueBinds"));
    /// The [VarHandle] of `pImageOpaqueBinds` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pImageOpaqueBinds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImageOpaqueBinds"));
    /// The byte offset of `imageBindCount`.
    public static final long OFFSET_imageBindCount = LAYOUT.byteOffset(PathElement.groupElement("imageBindCount"));
    /// The memory layout of `imageBindCount`.
    public static final MemoryLayout LAYOUT_imageBindCount = LAYOUT.select(PathElement.groupElement("imageBindCount"));
    /// The [VarHandle] of `imageBindCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageBindCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageBindCount"));
    /// The byte offset of `pImageBinds`.
    public static final long OFFSET_pImageBinds = LAYOUT.byteOffset(PathElement.groupElement("pImageBinds"));
    /// The memory layout of `pImageBinds`.
    public static final MemoryLayout LAYOUT_pImageBinds = LAYOUT.select(PathElement.groupElement("pImageBinds"));
    /// The [VarHandle] of `pImageBinds` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pImageBinds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImageBinds"));
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

    /// Creates `VkBindSparseInfo` with the given segment.
    /// @param segment the memory segment
    public VkBindSparseInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBindSparseInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindSparseInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindSparseInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindSparseInfo(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkBindSparseInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBindSparseInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindSparseInfo`
    public static VkBindSparseInfo alloc(SegmentAllocator allocator) { return new VkBindSparseInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBindSparseInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindSparseInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBindSparseInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param waitSemaphoreCount `waitSemaphoreCount`
    /// @param pWaitSemaphores `pWaitSemaphores`
    /// @param bufferBindCount `bufferBindCount`
    /// @param pBufferBinds `pBufferBinds`
    /// @param imageOpaqueBindCount `imageOpaqueBindCount`
    /// @param pImageOpaqueBinds `pImageOpaqueBinds`
    /// @param imageBindCount `imageBindCount`
    /// @param pImageBinds `pImageBinds`
    /// @param signalSemaphoreCount `signalSemaphoreCount`
    /// @param pSignalSemaphores `pSignalSemaphores`
    /// @return the allocated `VkBindSparseInfo`
    public static VkBindSparseInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int waitSemaphoreCount, MemorySegment pWaitSemaphores, int bufferBindCount, MemorySegment pBufferBinds, int imageOpaqueBindCount, MemorySegment pImageOpaqueBinds, int imageBindCount, MemorySegment pImageBinds, int signalSemaphoreCount, MemorySegment pSignalSemaphores) {
        return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount).pWaitSemaphores(pWaitSemaphores).bufferBindCount(bufferBindCount).pBufferBinds(pBufferBinds).imageOpaqueBindCount(imageOpaqueBindCount).pImageOpaqueBinds(pImageOpaqueBinds).imageBindCount(imageBindCount).pImageBinds(pImageBinds).signalSemaphoreCount(signalSemaphoreCount).pSignalSemaphores(pSignalSemaphores);
    }

    /// Allocates a `VkBindSparseInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param waitSemaphoreCount `waitSemaphoreCount`
    /// @param pWaitSemaphores `pWaitSemaphores`
    /// @param bufferBindCount `bufferBindCount`
    /// @param pBufferBinds `pBufferBinds`
    /// @param imageOpaqueBindCount `imageOpaqueBindCount`
    /// @param pImageOpaqueBinds `pImageOpaqueBinds`
    /// @param imageBindCount `imageBindCount`
    /// @param pImageBinds `pImageBinds`
    /// @param signalSemaphoreCount `signalSemaphoreCount`
    /// @return the allocated `VkBindSparseInfo`
    public static VkBindSparseInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int waitSemaphoreCount, MemorySegment pWaitSemaphores, int bufferBindCount, MemorySegment pBufferBinds, int imageOpaqueBindCount, MemorySegment pImageOpaqueBinds, int imageBindCount, MemorySegment pImageBinds, int signalSemaphoreCount) {
        return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount).pWaitSemaphores(pWaitSemaphores).bufferBindCount(bufferBindCount).pBufferBinds(pBufferBinds).imageOpaqueBindCount(imageOpaqueBindCount).pImageOpaqueBinds(pImageOpaqueBinds).imageBindCount(imageBindCount).pImageBinds(pImageBinds).signalSemaphoreCount(signalSemaphoreCount);
    }

    /// Allocates a `VkBindSparseInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param waitSemaphoreCount `waitSemaphoreCount`
    /// @param pWaitSemaphores `pWaitSemaphores`
    /// @param bufferBindCount `bufferBindCount`
    /// @param pBufferBinds `pBufferBinds`
    /// @param imageOpaqueBindCount `imageOpaqueBindCount`
    /// @param pImageOpaqueBinds `pImageOpaqueBinds`
    /// @param imageBindCount `imageBindCount`
    /// @param pImageBinds `pImageBinds`
    /// @return the allocated `VkBindSparseInfo`
    public static VkBindSparseInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int waitSemaphoreCount, MemorySegment pWaitSemaphores, int bufferBindCount, MemorySegment pBufferBinds, int imageOpaqueBindCount, MemorySegment pImageOpaqueBinds, int imageBindCount, MemorySegment pImageBinds) {
        return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount).pWaitSemaphores(pWaitSemaphores).bufferBindCount(bufferBindCount).pBufferBinds(pBufferBinds).imageOpaqueBindCount(imageOpaqueBindCount).pImageOpaqueBinds(pImageOpaqueBinds).imageBindCount(imageBindCount).pImageBinds(pImageBinds);
    }

    /// Allocates a `VkBindSparseInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param waitSemaphoreCount `waitSemaphoreCount`
    /// @param pWaitSemaphores `pWaitSemaphores`
    /// @param bufferBindCount `bufferBindCount`
    /// @param pBufferBinds `pBufferBinds`
    /// @param imageOpaqueBindCount `imageOpaqueBindCount`
    /// @param pImageOpaqueBinds `pImageOpaqueBinds`
    /// @param imageBindCount `imageBindCount`
    /// @return the allocated `VkBindSparseInfo`
    public static VkBindSparseInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int waitSemaphoreCount, MemorySegment pWaitSemaphores, int bufferBindCount, MemorySegment pBufferBinds, int imageOpaqueBindCount, MemorySegment pImageOpaqueBinds, int imageBindCount) {
        return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount).pWaitSemaphores(pWaitSemaphores).bufferBindCount(bufferBindCount).pBufferBinds(pBufferBinds).imageOpaqueBindCount(imageOpaqueBindCount).pImageOpaqueBinds(pImageOpaqueBinds).imageBindCount(imageBindCount);
    }

    /// Allocates a `VkBindSparseInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param waitSemaphoreCount `waitSemaphoreCount`
    /// @param pWaitSemaphores `pWaitSemaphores`
    /// @param bufferBindCount `bufferBindCount`
    /// @param pBufferBinds `pBufferBinds`
    /// @param imageOpaqueBindCount `imageOpaqueBindCount`
    /// @param pImageOpaqueBinds `pImageOpaqueBinds`
    /// @return the allocated `VkBindSparseInfo`
    public static VkBindSparseInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int waitSemaphoreCount, MemorySegment pWaitSemaphores, int bufferBindCount, MemorySegment pBufferBinds, int imageOpaqueBindCount, MemorySegment pImageOpaqueBinds) {
        return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount).pWaitSemaphores(pWaitSemaphores).bufferBindCount(bufferBindCount).pBufferBinds(pBufferBinds).imageOpaqueBindCount(imageOpaqueBindCount).pImageOpaqueBinds(pImageOpaqueBinds);
    }

    /// Allocates a `VkBindSparseInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param waitSemaphoreCount `waitSemaphoreCount`
    /// @param pWaitSemaphores `pWaitSemaphores`
    /// @param bufferBindCount `bufferBindCount`
    /// @param pBufferBinds `pBufferBinds`
    /// @param imageOpaqueBindCount `imageOpaqueBindCount`
    /// @return the allocated `VkBindSparseInfo`
    public static VkBindSparseInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int waitSemaphoreCount, MemorySegment pWaitSemaphores, int bufferBindCount, MemorySegment pBufferBinds, int imageOpaqueBindCount) {
        return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount).pWaitSemaphores(pWaitSemaphores).bufferBindCount(bufferBindCount).pBufferBinds(pBufferBinds).imageOpaqueBindCount(imageOpaqueBindCount);
    }

    /// Allocates a `VkBindSparseInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param waitSemaphoreCount `waitSemaphoreCount`
    /// @param pWaitSemaphores `pWaitSemaphores`
    /// @param bufferBindCount `bufferBindCount`
    /// @param pBufferBinds `pBufferBinds`
    /// @return the allocated `VkBindSparseInfo`
    public static VkBindSparseInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int waitSemaphoreCount, MemorySegment pWaitSemaphores, int bufferBindCount, MemorySegment pBufferBinds) {
        return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount).pWaitSemaphores(pWaitSemaphores).bufferBindCount(bufferBindCount).pBufferBinds(pBufferBinds);
    }

    /// Allocates a `VkBindSparseInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param waitSemaphoreCount `waitSemaphoreCount`
    /// @param pWaitSemaphores `pWaitSemaphores`
    /// @param bufferBindCount `bufferBindCount`
    /// @return the allocated `VkBindSparseInfo`
    public static VkBindSparseInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int waitSemaphoreCount, MemorySegment pWaitSemaphores, int bufferBindCount) {
        return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount).pWaitSemaphores(pWaitSemaphores).bufferBindCount(bufferBindCount);
    }

    /// Allocates a `VkBindSparseInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param waitSemaphoreCount `waitSemaphoreCount`
    /// @param pWaitSemaphores `pWaitSemaphores`
    /// @return the allocated `VkBindSparseInfo`
    public static VkBindSparseInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int waitSemaphoreCount, MemorySegment pWaitSemaphores) {
        return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount).pWaitSemaphores(pWaitSemaphores);
    }

    /// Allocates a `VkBindSparseInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param waitSemaphoreCount `waitSemaphoreCount`
    /// @return the allocated `VkBindSparseInfo`
    public static VkBindSparseInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int waitSemaphoreCount) {
        return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreCount(waitSemaphoreCount);
    }

    /// Allocates a `VkBindSparseInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkBindSparseInfo`
    public static VkBindSparseInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkBindSparseInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkBindSparseInfo`
    public static VkBindSparseInfo allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindSparseInfo copyFrom(VkBindSparseInfo src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkBindSparseInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkBindSparseInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkBindSparseInfo waitSemaphoreCount(int value) { waitSemaphoreCount(this.segment(), 0L, value); return this; }

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
    public VkBindSparseInfo pWaitSemaphores(MemorySegment value) { pWaitSemaphores(this.segment(), 0L, value); return this; }

    /// {@return `bufferBindCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bufferBindCount(MemorySegment segment, long index) { return (int) VH_bufferBindCount.get(segment, 0L, index); }
    /// {@return `bufferBindCount`}
    public int bufferBindCount() { return bufferBindCount(this.segment(), 0L); }
    /// Sets `bufferBindCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferBindCount(MemorySegment segment, long index, int value) { VH_bufferBindCount.set(segment, 0L, index, value); }
    /// Sets `bufferBindCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindSparseInfo bufferBindCount(int value) { bufferBindCount(this.segment(), 0L, value); return this; }

    /// {@return `pBufferBinds` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pBufferBinds(MemorySegment segment, long index) { return (MemorySegment) VH_pBufferBinds.get(segment, 0L, index); }
    /// {@return `pBufferBinds`}
    public MemorySegment pBufferBinds() { return pBufferBinds(this.segment(), 0L); }
    /// Sets `pBufferBinds` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pBufferBinds(MemorySegment segment, long index, MemorySegment value) { VH_pBufferBinds.set(segment, 0L, index, value); }
    /// Sets `pBufferBinds` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindSparseInfo pBufferBinds(MemorySegment value) { pBufferBinds(this.segment(), 0L, value); return this; }

    /// {@return `imageOpaqueBindCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageOpaqueBindCount(MemorySegment segment, long index) { return (int) VH_imageOpaqueBindCount.get(segment, 0L, index); }
    /// {@return `imageOpaqueBindCount`}
    public int imageOpaqueBindCount() { return imageOpaqueBindCount(this.segment(), 0L); }
    /// Sets `imageOpaqueBindCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageOpaqueBindCount(MemorySegment segment, long index, int value) { VH_imageOpaqueBindCount.set(segment, 0L, index, value); }
    /// Sets `imageOpaqueBindCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindSparseInfo imageOpaqueBindCount(int value) { imageOpaqueBindCount(this.segment(), 0L, value); return this; }

    /// {@return `pImageOpaqueBinds` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pImageOpaqueBinds(MemorySegment segment, long index) { return (MemorySegment) VH_pImageOpaqueBinds.get(segment, 0L, index); }
    /// {@return `pImageOpaqueBinds`}
    public MemorySegment pImageOpaqueBinds() { return pImageOpaqueBinds(this.segment(), 0L); }
    /// Sets `pImageOpaqueBinds` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pImageOpaqueBinds(MemorySegment segment, long index, MemorySegment value) { VH_pImageOpaqueBinds.set(segment, 0L, index, value); }
    /// Sets `pImageOpaqueBinds` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindSparseInfo pImageOpaqueBinds(MemorySegment value) { pImageOpaqueBinds(this.segment(), 0L, value); return this; }

    /// {@return `imageBindCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageBindCount(MemorySegment segment, long index) { return (int) VH_imageBindCount.get(segment, 0L, index); }
    /// {@return `imageBindCount`}
    public int imageBindCount() { return imageBindCount(this.segment(), 0L); }
    /// Sets `imageBindCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageBindCount(MemorySegment segment, long index, int value) { VH_imageBindCount.set(segment, 0L, index, value); }
    /// Sets `imageBindCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindSparseInfo imageBindCount(int value) { imageBindCount(this.segment(), 0L, value); return this; }

    /// {@return `pImageBinds` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pImageBinds(MemorySegment segment, long index) { return (MemorySegment) VH_pImageBinds.get(segment, 0L, index); }
    /// {@return `pImageBinds`}
    public MemorySegment pImageBinds() { return pImageBinds(this.segment(), 0L); }
    /// Sets `pImageBinds` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pImageBinds(MemorySegment segment, long index, MemorySegment value) { VH_pImageBinds.set(segment, 0L, index, value); }
    /// Sets `pImageBinds` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindSparseInfo pImageBinds(MemorySegment value) { pImageBinds(this.segment(), 0L, value); return this; }

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
    public VkBindSparseInfo signalSemaphoreCount(int value) { signalSemaphoreCount(this.segment(), 0L, value); return this; }

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
    public VkBindSparseInfo pSignalSemaphores(MemorySegment value) { pSignalSemaphores(this.segment(), 0L, value); return this; }

    /// A buffer of [VkBindSparseInfo].
    public static final class Buffer extends VkBindSparseInfo {
        private final long elementCount;

        /// Creates `VkBindSparseInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBindSparseInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBindSparseInfo`
        public VkBindSparseInfo asSlice(long index) { return new VkBindSparseInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBindSparseInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBindSparseInfo`
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

        /// {@return `waitSemaphoreCount` at the given index}
        /// @param index the index of the struct buffer
        public int waitSemaphoreCountAt(long index) { return waitSemaphoreCount(this.segment(), index); }
        /// Sets `waitSemaphoreCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer waitSemaphoreCountAt(long index, int value) { waitSemaphoreCount(this.segment(), index, value); return this; }

        /// {@return `pWaitSemaphores` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pWaitSemaphoresAt(long index) { return pWaitSemaphores(this.segment(), index); }
        /// Sets `pWaitSemaphores` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pWaitSemaphoresAt(long index, MemorySegment value) { pWaitSemaphores(this.segment(), index, value); return this; }

        /// {@return `bufferBindCount` at the given index}
        /// @param index the index of the struct buffer
        public int bufferBindCountAt(long index) { return bufferBindCount(this.segment(), index); }
        /// Sets `bufferBindCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer bufferBindCountAt(long index, int value) { bufferBindCount(this.segment(), index, value); return this; }

        /// {@return `pBufferBinds` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pBufferBindsAt(long index) { return pBufferBinds(this.segment(), index); }
        /// Sets `pBufferBinds` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pBufferBindsAt(long index, MemorySegment value) { pBufferBinds(this.segment(), index, value); return this; }

        /// {@return `imageOpaqueBindCount` at the given index}
        /// @param index the index of the struct buffer
        public int imageOpaqueBindCountAt(long index) { return imageOpaqueBindCount(this.segment(), index); }
        /// Sets `imageOpaqueBindCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageOpaqueBindCountAt(long index, int value) { imageOpaqueBindCount(this.segment(), index, value); return this; }

        /// {@return `pImageOpaqueBinds` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pImageOpaqueBindsAt(long index) { return pImageOpaqueBinds(this.segment(), index); }
        /// Sets `pImageOpaqueBinds` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pImageOpaqueBindsAt(long index, MemorySegment value) { pImageOpaqueBinds(this.segment(), index, value); return this; }

        /// {@return `imageBindCount` at the given index}
        /// @param index the index of the struct buffer
        public int imageBindCountAt(long index) { return imageBindCount(this.segment(), index); }
        /// Sets `imageBindCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageBindCountAt(long index, int value) { imageBindCount(this.segment(), index, value); return this; }

        /// {@return `pImageBinds` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pImageBindsAt(long index) { return pImageBinds(this.segment(), index); }
        /// Sets `pImageBinds` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pImageBindsAt(long index, MemorySegment value) { pImageBinds(this.segment(), index, value); return this; }

        /// {@return `signalSemaphoreCount` at the given index}
        /// @param index the index of the struct buffer
        public int signalSemaphoreCountAt(long index) { return signalSemaphoreCount(this.segment(), index); }
        /// Sets `signalSemaphoreCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer signalSemaphoreCountAt(long index, int value) { signalSemaphoreCount(this.segment(), index, value); return this; }

        /// {@return `pSignalSemaphores` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pSignalSemaphoresAt(long index) { return pSignalSemaphores(this.segment(), index); }
        /// Sets `pSignalSemaphores` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pSignalSemaphoresAt(long index, MemorySegment value) { pSignalSemaphores(this.segment(), index, value); return this; }

    }
}
