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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkSemaphoreSciSyncCreateInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkSemaphoreSciSyncPoolNV semaphorePool;
///     const NvSciSyncFence* pFence;
/// };
/// ```
public final class VkSemaphoreSciSyncCreateInfoNV extends GroupType {
    /// The struct layout of `VkSemaphoreSciSyncCreateInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("semaphorePool"),
        ValueLayout.ADDRESS.withName("pFence")
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
    /// The byte offset of `semaphorePool`.
    public static final long OFFSET_semaphorePool = LAYOUT.byteOffset(PathElement.groupElement("semaphorePool"));
    /// The memory layout of `semaphorePool`.
    public static final MemoryLayout LAYOUT_semaphorePool = LAYOUT.select(PathElement.groupElement("semaphorePool"));
    /// The [VarHandle] of `semaphorePool` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_semaphorePool = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphorePool"));
    /// The byte offset of `pFence`.
    public static final long OFFSET_pFence = LAYOUT.byteOffset(PathElement.groupElement("pFence"));
    /// The memory layout of `pFence`.
    public static final MemoryLayout LAYOUT_pFence = LAYOUT.select(PathElement.groupElement("pFence"));
    /// The [VarHandle] of `pFence` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pFence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pFence"));

    /// Creates `VkSemaphoreSciSyncCreateInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSemaphoreSciSyncCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSemaphoreSciSyncCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreSciSyncCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreSciSyncCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSemaphoreSciSyncCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreSciSyncCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreSciSyncCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSemaphoreSciSyncCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreSciSyncCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreSciSyncCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSemaphoreSciSyncCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSemaphoreSciSyncCreateInfoNV`
    public static VkSemaphoreSciSyncCreateInfoNV alloc(SegmentAllocator allocator) { return new VkSemaphoreSciSyncCreateInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSemaphoreSciSyncCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSemaphoreSciSyncCreateInfoNV`
    public static VkSemaphoreSciSyncCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkSemaphoreSciSyncCreateInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSemaphoreSciSyncCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param semaphorePool `semaphorePool`
    /// @param pFence `pFence`
    /// @return the allocated `VkSemaphoreSciSyncCreateInfoNV`
    public static VkSemaphoreSciSyncCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long semaphorePool, MemorySegment pFence) {
        return alloc(allocator).sType(sType).pNext(pNext).semaphorePool(semaphorePool).pFence(pFence);
    }

    /// Allocates a `VkSemaphoreSciSyncCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param semaphorePool `semaphorePool`
    /// @return the allocated `VkSemaphoreSciSyncCreateInfoNV`
    public static VkSemaphoreSciSyncCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long semaphorePool) {
        return alloc(allocator).sType(sType).pNext(pNext).semaphorePool(semaphorePool);
    }

    /// Allocates a `VkSemaphoreSciSyncCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkSemaphoreSciSyncCreateInfoNV`
    public static VkSemaphoreSciSyncCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkSemaphoreSciSyncCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkSemaphoreSciSyncCreateInfoNV`
    public static VkSemaphoreSciSyncCreateInfoNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSemaphoreSciSyncCreateInfoNV copyFrom(VkSemaphoreSciSyncCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSemaphoreSciSyncCreateInfoNV reinterpret(long count) { return new VkSemaphoreSciSyncCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSemaphoreSciSyncCreateInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSemaphoreSciSyncCreateInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `semaphorePool` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long semaphorePool(MemorySegment segment, long index) { return (long) VH_semaphorePool.get(segment, 0L, index); }
    /// {@return `semaphorePool`}
    public long semaphorePool() { return semaphorePool(this.segment(), 0L); }
    /// Sets `semaphorePool` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void semaphorePool(MemorySegment segment, long index, long value) { VH_semaphorePool.set(segment, 0L, index, value); }
    /// Sets `semaphorePool` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSciSyncCreateInfoNV semaphorePool(long value) { semaphorePool(this.segment(), 0L, value); return this; }

    /// {@return `pFence` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pFence(MemorySegment segment, long index) { return (MemorySegment) VH_pFence.get(segment, 0L, index); }
    /// {@return `pFence`}
    public MemorySegment pFence() { return pFence(this.segment(), 0L); }
    /// Sets `pFence` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pFence(MemorySegment segment, long index, MemorySegment value) { VH_pFence.set(segment, 0L, index, value); }
    /// Sets `pFence` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSciSyncCreateInfoNV pFence(MemorySegment value) { pFence(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSemaphoreSciSyncCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSemaphoreSciSyncCreateInfoNV`
    public VkSemaphoreSciSyncCreateInfoNV asSlice(long index) { return new VkSemaphoreSciSyncCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSemaphoreSciSyncCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSemaphoreSciSyncCreateInfoNV`
    public VkSemaphoreSciSyncCreateInfoNV asSlice(long index, long count) { return new VkSemaphoreSciSyncCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSemaphoreSciSyncCreateInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSemaphoreSciSyncCreateInfoNV at(long index, Consumer<VkSemaphoreSciSyncCreateInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSciSyncCreateInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSciSyncCreateInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `semaphorePool` at the given index}
    /// @param index the index of the struct buffer
    public long semaphorePoolAt(long index) { return semaphorePool(this.segment(), index); }
    /// Sets `semaphorePool` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSciSyncCreateInfoNV semaphorePoolAt(long index, long value) { semaphorePool(this.segment(), index, value); return this; }

    /// {@return `pFence` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pFenceAt(long index) { return pFence(this.segment(), index); }
    /// Sets `pFence` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSciSyncCreateInfoNV pFenceAt(long index, MemorySegment value) { pFence(this.segment(), index, value); return this; }

}
