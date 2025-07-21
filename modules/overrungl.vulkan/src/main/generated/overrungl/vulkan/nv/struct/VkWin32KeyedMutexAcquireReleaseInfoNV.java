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
/// struct VkWin32KeyedMutexAcquireReleaseInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t acquireCount;
///     const VkDeviceMemory* pAcquireSyncs;
///     const uint64_t* pAcquireKeys;
///     const uint32_t* pAcquireTimeoutMilliseconds;
///     uint32_t releaseCount;
///     const VkDeviceMemory* pReleaseSyncs;
///     const uint64_t* pReleaseKeys;
/// };
/// ```
public final class VkWin32KeyedMutexAcquireReleaseInfoNV extends GroupType {
    /// The struct layout of `VkWin32KeyedMutexAcquireReleaseInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("acquireCount"),
        ValueLayout.ADDRESS.withName("pAcquireSyncs"),
        ValueLayout.ADDRESS.withName("pAcquireKeys"),
        ValueLayout.ADDRESS.withName("pAcquireTimeoutMilliseconds"),
        ValueLayout.JAVA_INT.withName("releaseCount"),
        ValueLayout.ADDRESS.withName("pReleaseSyncs"),
        ValueLayout.ADDRESS.withName("pReleaseKeys")
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
    /// The byte offset of `acquireCount`.
    public static final long OFFSET_acquireCount = LAYOUT.byteOffset(PathElement.groupElement("acquireCount"));
    /// The memory layout of `acquireCount`.
    public static final MemoryLayout LAYOUT_acquireCount = LAYOUT.select(PathElement.groupElement("acquireCount"));
    /// The [VarHandle] of `acquireCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_acquireCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("acquireCount"));
    /// The byte offset of `pAcquireSyncs`.
    public static final long OFFSET_pAcquireSyncs = LAYOUT.byteOffset(PathElement.groupElement("pAcquireSyncs"));
    /// The memory layout of `pAcquireSyncs`.
    public static final MemoryLayout LAYOUT_pAcquireSyncs = LAYOUT.select(PathElement.groupElement("pAcquireSyncs"));
    /// The [VarHandle] of `pAcquireSyncs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAcquireSyncs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAcquireSyncs"));
    /// The byte offset of `pAcquireKeys`.
    public static final long OFFSET_pAcquireKeys = LAYOUT.byteOffset(PathElement.groupElement("pAcquireKeys"));
    /// The memory layout of `pAcquireKeys`.
    public static final MemoryLayout LAYOUT_pAcquireKeys = LAYOUT.select(PathElement.groupElement("pAcquireKeys"));
    /// The [VarHandle] of `pAcquireKeys` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAcquireKeys = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAcquireKeys"));
    /// The byte offset of `pAcquireTimeoutMilliseconds`.
    public static final long OFFSET_pAcquireTimeoutMilliseconds = LAYOUT.byteOffset(PathElement.groupElement("pAcquireTimeoutMilliseconds"));
    /// The memory layout of `pAcquireTimeoutMilliseconds`.
    public static final MemoryLayout LAYOUT_pAcquireTimeoutMilliseconds = LAYOUT.select(PathElement.groupElement("pAcquireTimeoutMilliseconds"));
    /// The [VarHandle] of `pAcquireTimeoutMilliseconds` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAcquireTimeoutMilliseconds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAcquireTimeoutMilliseconds"));
    /// The byte offset of `releaseCount`.
    public static final long OFFSET_releaseCount = LAYOUT.byteOffset(PathElement.groupElement("releaseCount"));
    /// The memory layout of `releaseCount`.
    public static final MemoryLayout LAYOUT_releaseCount = LAYOUT.select(PathElement.groupElement("releaseCount"));
    /// The [VarHandle] of `releaseCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_releaseCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("releaseCount"));
    /// The byte offset of `pReleaseSyncs`.
    public static final long OFFSET_pReleaseSyncs = LAYOUT.byteOffset(PathElement.groupElement("pReleaseSyncs"));
    /// The memory layout of `pReleaseSyncs`.
    public static final MemoryLayout LAYOUT_pReleaseSyncs = LAYOUT.select(PathElement.groupElement("pReleaseSyncs"));
    /// The [VarHandle] of `pReleaseSyncs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pReleaseSyncs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pReleaseSyncs"));
    /// The byte offset of `pReleaseKeys`.
    public static final long OFFSET_pReleaseKeys = LAYOUT.byteOffset(PathElement.groupElement("pReleaseKeys"));
    /// The memory layout of `pReleaseKeys`.
    public static final MemoryLayout LAYOUT_pReleaseKeys = LAYOUT.select(PathElement.groupElement("pReleaseKeys"));
    /// The [VarHandle] of `pReleaseKeys` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pReleaseKeys = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pReleaseKeys"));

    /// Creates `VkWin32KeyedMutexAcquireReleaseInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkWin32KeyedMutexAcquireReleaseInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkWin32KeyedMutexAcquireReleaseInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWin32KeyedMutexAcquireReleaseInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWin32KeyedMutexAcquireReleaseInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkWin32KeyedMutexAcquireReleaseInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWin32KeyedMutexAcquireReleaseInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWin32KeyedMutexAcquireReleaseInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkWin32KeyedMutexAcquireReleaseInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWin32KeyedMutexAcquireReleaseInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkWin32KeyedMutexAcquireReleaseInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkWin32KeyedMutexAcquireReleaseInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkWin32KeyedMutexAcquireReleaseInfoNV`
    public static VkWin32KeyedMutexAcquireReleaseInfoNV alloc(SegmentAllocator allocator) { return new VkWin32KeyedMutexAcquireReleaseInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkWin32KeyedMutexAcquireReleaseInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkWin32KeyedMutexAcquireReleaseInfoNV`
    public static VkWin32KeyedMutexAcquireReleaseInfoNV alloc(SegmentAllocator allocator, long count) { return new VkWin32KeyedMutexAcquireReleaseInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkWin32KeyedMutexAcquireReleaseInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param acquireCount `acquireCount`
    /// @param pAcquireSyncs `pAcquireSyncs`
    /// @param pAcquireKeys `pAcquireKeys`
    /// @param pAcquireTimeoutMilliseconds `pAcquireTimeoutMilliseconds`
    /// @param releaseCount `releaseCount`
    /// @param pReleaseSyncs `pReleaseSyncs`
    /// @param pReleaseKeys `pReleaseKeys`
    /// @return the allocated `VkWin32KeyedMutexAcquireReleaseInfoNV`
    public static VkWin32KeyedMutexAcquireReleaseInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int acquireCount, MemorySegment pAcquireSyncs, MemorySegment pAcquireKeys, MemorySegment pAcquireTimeoutMilliseconds, int releaseCount, MemorySegment pReleaseSyncs, MemorySegment pReleaseKeys) {
        return alloc(allocator).sType(sType).pNext(pNext).acquireCount(acquireCount).pAcquireSyncs(pAcquireSyncs).pAcquireKeys(pAcquireKeys).pAcquireTimeoutMilliseconds(pAcquireTimeoutMilliseconds).releaseCount(releaseCount).pReleaseSyncs(pReleaseSyncs).pReleaseKeys(pReleaseKeys);
    }

    /// Allocates a `VkWin32KeyedMutexAcquireReleaseInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param acquireCount `acquireCount`
    /// @param pAcquireSyncs `pAcquireSyncs`
    /// @param pAcquireKeys `pAcquireKeys`
    /// @param pAcquireTimeoutMilliseconds `pAcquireTimeoutMilliseconds`
    /// @param releaseCount `releaseCount`
    /// @param pReleaseSyncs `pReleaseSyncs`
    /// @return the allocated `VkWin32KeyedMutexAcquireReleaseInfoNV`
    public static VkWin32KeyedMutexAcquireReleaseInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int acquireCount, MemorySegment pAcquireSyncs, MemorySegment pAcquireKeys, MemorySegment pAcquireTimeoutMilliseconds, int releaseCount, MemorySegment pReleaseSyncs) {
        return alloc(allocator).sType(sType).pNext(pNext).acquireCount(acquireCount).pAcquireSyncs(pAcquireSyncs).pAcquireKeys(pAcquireKeys).pAcquireTimeoutMilliseconds(pAcquireTimeoutMilliseconds).releaseCount(releaseCount).pReleaseSyncs(pReleaseSyncs);
    }

    /// Allocates a `VkWin32KeyedMutexAcquireReleaseInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param acquireCount `acquireCount`
    /// @param pAcquireSyncs `pAcquireSyncs`
    /// @param pAcquireKeys `pAcquireKeys`
    /// @param pAcquireTimeoutMilliseconds `pAcquireTimeoutMilliseconds`
    /// @param releaseCount `releaseCount`
    /// @return the allocated `VkWin32KeyedMutexAcquireReleaseInfoNV`
    public static VkWin32KeyedMutexAcquireReleaseInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int acquireCount, MemorySegment pAcquireSyncs, MemorySegment pAcquireKeys, MemorySegment pAcquireTimeoutMilliseconds, int releaseCount) {
        return alloc(allocator).sType(sType).pNext(pNext).acquireCount(acquireCount).pAcquireSyncs(pAcquireSyncs).pAcquireKeys(pAcquireKeys).pAcquireTimeoutMilliseconds(pAcquireTimeoutMilliseconds).releaseCount(releaseCount);
    }

    /// Allocates a `VkWin32KeyedMutexAcquireReleaseInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param acquireCount `acquireCount`
    /// @param pAcquireSyncs `pAcquireSyncs`
    /// @param pAcquireKeys `pAcquireKeys`
    /// @param pAcquireTimeoutMilliseconds `pAcquireTimeoutMilliseconds`
    /// @return the allocated `VkWin32KeyedMutexAcquireReleaseInfoNV`
    public static VkWin32KeyedMutexAcquireReleaseInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int acquireCount, MemorySegment pAcquireSyncs, MemorySegment pAcquireKeys, MemorySegment pAcquireTimeoutMilliseconds) {
        return alloc(allocator).sType(sType).pNext(pNext).acquireCount(acquireCount).pAcquireSyncs(pAcquireSyncs).pAcquireKeys(pAcquireKeys).pAcquireTimeoutMilliseconds(pAcquireTimeoutMilliseconds);
    }

    /// Allocates a `VkWin32KeyedMutexAcquireReleaseInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param acquireCount `acquireCount`
    /// @param pAcquireSyncs `pAcquireSyncs`
    /// @param pAcquireKeys `pAcquireKeys`
    /// @return the allocated `VkWin32KeyedMutexAcquireReleaseInfoNV`
    public static VkWin32KeyedMutexAcquireReleaseInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int acquireCount, MemorySegment pAcquireSyncs, MemorySegment pAcquireKeys) {
        return alloc(allocator).sType(sType).pNext(pNext).acquireCount(acquireCount).pAcquireSyncs(pAcquireSyncs).pAcquireKeys(pAcquireKeys);
    }

    /// Allocates a `VkWin32KeyedMutexAcquireReleaseInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param acquireCount `acquireCount`
    /// @param pAcquireSyncs `pAcquireSyncs`
    /// @return the allocated `VkWin32KeyedMutexAcquireReleaseInfoNV`
    public static VkWin32KeyedMutexAcquireReleaseInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int acquireCount, MemorySegment pAcquireSyncs) {
        return alloc(allocator).sType(sType).pNext(pNext).acquireCount(acquireCount).pAcquireSyncs(pAcquireSyncs);
    }

    /// Allocates a `VkWin32KeyedMutexAcquireReleaseInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param acquireCount `acquireCount`
    /// @return the allocated `VkWin32KeyedMutexAcquireReleaseInfoNV`
    public static VkWin32KeyedMutexAcquireReleaseInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int acquireCount) {
        return alloc(allocator).sType(sType).pNext(pNext).acquireCount(acquireCount);
    }

    /// Allocates a `VkWin32KeyedMutexAcquireReleaseInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkWin32KeyedMutexAcquireReleaseInfoNV`
    public static VkWin32KeyedMutexAcquireReleaseInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkWin32KeyedMutexAcquireReleaseInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkWin32KeyedMutexAcquireReleaseInfoNV`
    public static VkWin32KeyedMutexAcquireReleaseInfoNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV copyFrom(VkWin32KeyedMutexAcquireReleaseInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkWin32KeyedMutexAcquireReleaseInfoNV reinterpret(long count) { return new VkWin32KeyedMutexAcquireReleaseInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkWin32KeyedMutexAcquireReleaseInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkWin32KeyedMutexAcquireReleaseInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `acquireCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int acquireCount(MemorySegment segment, long index) { return (int) VH_acquireCount.get(segment, 0L, index); }
    /// {@return `acquireCount`}
    public int acquireCount() { return acquireCount(this.segment(), 0L); }
    /// Sets `acquireCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void acquireCount(MemorySegment segment, long index, int value) { VH_acquireCount.set(segment, 0L, index, value); }
    /// Sets `acquireCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV acquireCount(int value) { acquireCount(this.segment(), 0L, value); return this; }

    /// {@return `pAcquireSyncs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pAcquireSyncs(MemorySegment segment, long index) { return (MemorySegment) VH_pAcquireSyncs.get(segment, 0L, index); }
    /// {@return `pAcquireSyncs`}
    public MemorySegment pAcquireSyncs() { return pAcquireSyncs(this.segment(), 0L); }
    /// Sets `pAcquireSyncs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pAcquireSyncs(MemorySegment segment, long index, MemorySegment value) { VH_pAcquireSyncs.set(segment, 0L, index, value); }
    /// Sets `pAcquireSyncs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV pAcquireSyncs(MemorySegment value) { pAcquireSyncs(this.segment(), 0L, value); return this; }

    /// {@return `pAcquireKeys` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pAcquireKeys(MemorySegment segment, long index) { return (MemorySegment) VH_pAcquireKeys.get(segment, 0L, index); }
    /// {@return `pAcquireKeys`}
    public MemorySegment pAcquireKeys() { return pAcquireKeys(this.segment(), 0L); }
    /// Sets `pAcquireKeys` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pAcquireKeys(MemorySegment segment, long index, MemorySegment value) { VH_pAcquireKeys.set(segment, 0L, index, value); }
    /// Sets `pAcquireKeys` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV pAcquireKeys(MemorySegment value) { pAcquireKeys(this.segment(), 0L, value); return this; }

    /// {@return `pAcquireTimeoutMilliseconds` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pAcquireTimeoutMilliseconds(MemorySegment segment, long index) { return (MemorySegment) VH_pAcquireTimeoutMilliseconds.get(segment, 0L, index); }
    /// {@return `pAcquireTimeoutMilliseconds`}
    public MemorySegment pAcquireTimeoutMilliseconds() { return pAcquireTimeoutMilliseconds(this.segment(), 0L); }
    /// Sets `pAcquireTimeoutMilliseconds` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pAcquireTimeoutMilliseconds(MemorySegment segment, long index, MemorySegment value) { VH_pAcquireTimeoutMilliseconds.set(segment, 0L, index, value); }
    /// Sets `pAcquireTimeoutMilliseconds` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV pAcquireTimeoutMilliseconds(MemorySegment value) { pAcquireTimeoutMilliseconds(this.segment(), 0L, value); return this; }

    /// {@return `releaseCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int releaseCount(MemorySegment segment, long index) { return (int) VH_releaseCount.get(segment, 0L, index); }
    /// {@return `releaseCount`}
    public int releaseCount() { return releaseCount(this.segment(), 0L); }
    /// Sets `releaseCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void releaseCount(MemorySegment segment, long index, int value) { VH_releaseCount.set(segment, 0L, index, value); }
    /// Sets `releaseCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV releaseCount(int value) { releaseCount(this.segment(), 0L, value); return this; }

    /// {@return `pReleaseSyncs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pReleaseSyncs(MemorySegment segment, long index) { return (MemorySegment) VH_pReleaseSyncs.get(segment, 0L, index); }
    /// {@return `pReleaseSyncs`}
    public MemorySegment pReleaseSyncs() { return pReleaseSyncs(this.segment(), 0L); }
    /// Sets `pReleaseSyncs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pReleaseSyncs(MemorySegment segment, long index, MemorySegment value) { VH_pReleaseSyncs.set(segment, 0L, index, value); }
    /// Sets `pReleaseSyncs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV pReleaseSyncs(MemorySegment value) { pReleaseSyncs(this.segment(), 0L, value); return this; }

    /// {@return `pReleaseKeys` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pReleaseKeys(MemorySegment segment, long index) { return (MemorySegment) VH_pReleaseKeys.get(segment, 0L, index); }
    /// {@return `pReleaseKeys`}
    public MemorySegment pReleaseKeys() { return pReleaseKeys(this.segment(), 0L); }
    /// Sets `pReleaseKeys` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pReleaseKeys(MemorySegment segment, long index, MemorySegment value) { VH_pReleaseKeys.set(segment, 0L, index, value); }
    /// Sets `pReleaseKeys` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV pReleaseKeys(MemorySegment value) { pReleaseKeys(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkWin32KeyedMutexAcquireReleaseInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkWin32KeyedMutexAcquireReleaseInfoNV`
    public VkWin32KeyedMutexAcquireReleaseInfoNV asSlice(long index) { return new VkWin32KeyedMutexAcquireReleaseInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkWin32KeyedMutexAcquireReleaseInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkWin32KeyedMutexAcquireReleaseInfoNV`
    public VkWin32KeyedMutexAcquireReleaseInfoNV asSlice(long index, long count) { return new VkWin32KeyedMutexAcquireReleaseInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkWin32KeyedMutexAcquireReleaseInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV at(long index, Consumer<VkWin32KeyedMutexAcquireReleaseInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `acquireCount` at the given index}
    /// @param index the index of the struct buffer
    public int acquireCountAt(long index) { return acquireCount(this.segment(), index); }
    /// Sets `acquireCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV acquireCountAt(long index, int value) { acquireCount(this.segment(), index, value); return this; }

    /// {@return `pAcquireSyncs` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pAcquireSyncsAt(long index) { return pAcquireSyncs(this.segment(), index); }
    /// Sets `pAcquireSyncs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV pAcquireSyncsAt(long index, MemorySegment value) { pAcquireSyncs(this.segment(), index, value); return this; }

    /// {@return `pAcquireKeys` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pAcquireKeysAt(long index) { return pAcquireKeys(this.segment(), index); }
    /// Sets `pAcquireKeys` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV pAcquireKeysAt(long index, MemorySegment value) { pAcquireKeys(this.segment(), index, value); return this; }

    /// {@return `pAcquireTimeoutMilliseconds` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pAcquireTimeoutMillisecondsAt(long index) { return pAcquireTimeoutMilliseconds(this.segment(), index); }
    /// Sets `pAcquireTimeoutMilliseconds` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV pAcquireTimeoutMillisecondsAt(long index, MemorySegment value) { pAcquireTimeoutMilliseconds(this.segment(), index, value); return this; }

    /// {@return `releaseCount` at the given index}
    /// @param index the index of the struct buffer
    public int releaseCountAt(long index) { return releaseCount(this.segment(), index); }
    /// Sets `releaseCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV releaseCountAt(long index, int value) { releaseCount(this.segment(), index, value); return this; }

    /// {@return `pReleaseSyncs` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pReleaseSyncsAt(long index) { return pReleaseSyncs(this.segment(), index); }
    /// Sets `pReleaseSyncs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV pReleaseSyncsAt(long index, MemorySegment value) { pReleaseSyncs(this.segment(), index, value); return this; }

    /// {@return `pReleaseKeys` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pReleaseKeysAt(long index) { return pReleaseKeys(this.segment(), index); }
    /// Sets `pReleaseKeys` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV pReleaseKeysAt(long index, MemorySegment value) { pReleaseKeys(this.segment(), index, value); return this; }

}
