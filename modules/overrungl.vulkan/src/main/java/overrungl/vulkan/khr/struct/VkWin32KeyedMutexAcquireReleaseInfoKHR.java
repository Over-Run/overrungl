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
/// ### acquireCount
/// [VarHandle][#VH_acquireCount] - [Getter][#acquireCount()] - [Setter][#acquireCount(int)]
/// ### pAcquireSyncs
/// [VarHandle][#VH_pAcquireSyncs] - [Getter][#pAcquireSyncs()] - [Setter][#pAcquireSyncs(java.lang.foreign.MemorySegment)]
/// ### pAcquireKeys
/// [VarHandle][#VH_pAcquireKeys] - [Getter][#pAcquireKeys()] - [Setter][#pAcquireKeys(java.lang.foreign.MemorySegment)]
/// ### pAcquireTimeouts
/// [VarHandle][#VH_pAcquireTimeouts] - [Getter][#pAcquireTimeouts()] - [Setter][#pAcquireTimeouts(java.lang.foreign.MemorySegment)]
/// ### releaseCount
/// [VarHandle][#VH_releaseCount] - [Getter][#releaseCount()] - [Setter][#releaseCount(int)]
/// ### pReleaseSyncs
/// [VarHandle][#VH_pReleaseSyncs] - [Getter][#pReleaseSyncs()] - [Setter][#pReleaseSyncs(java.lang.foreign.MemorySegment)]
/// ### pReleaseKeys
/// [VarHandle][#VH_pReleaseKeys] - [Getter][#pReleaseKeys()] - [Setter][#pReleaseKeys(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkWin32KeyedMutexAcquireReleaseInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t acquireCount;
///     const VkDeviceMemory * pAcquireSyncs;
///     const uint64_t * pAcquireKeys;
///     const uint32_t * pAcquireTimeouts;
///     uint32_t releaseCount;
///     const VkDeviceMemory * pReleaseSyncs;
///     const uint64_t * pReleaseKeys;
/// } VkWin32KeyedMutexAcquireReleaseInfoKHR;
/// ```
public sealed class VkWin32KeyedMutexAcquireReleaseInfoKHR extends Struct {
    /// The struct layout of `VkWin32KeyedMutexAcquireReleaseInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("acquireCount"),
        ValueLayout.ADDRESS.withName("pAcquireSyncs"),
        ValueLayout.ADDRESS.withName("pAcquireKeys"),
        ValueLayout.ADDRESS.withName("pAcquireTimeouts"),
        ValueLayout.JAVA_INT.withName("releaseCount"),
        ValueLayout.ADDRESS.withName("pReleaseSyncs"),
        ValueLayout.ADDRESS.withName("pReleaseKeys")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `acquireCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_acquireCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("acquireCount"));
    /// The [VarHandle] of `pAcquireSyncs` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pAcquireSyncs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAcquireSyncs"));
    /// The [VarHandle] of `pAcquireKeys` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pAcquireKeys = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAcquireKeys"));
    /// The [VarHandle] of `pAcquireTimeouts` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pAcquireTimeouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAcquireTimeouts"));
    /// The [VarHandle] of `releaseCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_releaseCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("releaseCount"));
    /// The [VarHandle] of `pReleaseSyncs` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pReleaseSyncs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pReleaseSyncs"));
    /// The [VarHandle] of `pReleaseKeys` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pReleaseKeys = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pReleaseKeys"));

    /// Creates `VkWin32KeyedMutexAcquireReleaseInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkWin32KeyedMutexAcquireReleaseInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkWin32KeyedMutexAcquireReleaseInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkWin32KeyedMutexAcquireReleaseInfoKHR(segment); }

    /// Creates `VkWin32KeyedMutexAcquireReleaseInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkWin32KeyedMutexAcquireReleaseInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkWin32KeyedMutexAcquireReleaseInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkWin32KeyedMutexAcquireReleaseInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkWin32KeyedMutexAcquireReleaseInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkWin32KeyedMutexAcquireReleaseInfoKHR`
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR alloc(SegmentAllocator allocator) { return new VkWin32KeyedMutexAcquireReleaseInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkWin32KeyedMutexAcquireReleaseInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkWin32KeyedMutexAcquireReleaseInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkWin32KeyedMutexAcquireReleaseInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkWin32KeyedMutexAcquireReleaseInfoKHR`
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int acquireCount, @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment pAcquireSyncs, @CType("const uint64_t *") java.lang.foreign.MemorySegment pAcquireKeys, @CType("const uint32_t *") java.lang.foreign.MemorySegment pAcquireTimeouts, @CType("uint32_t") int releaseCount, @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment pReleaseSyncs, @CType("const uint64_t *") java.lang.foreign.MemorySegment pReleaseKeys) { return alloc(allocator).sType(sType).pNext(pNext).acquireCount(acquireCount).pAcquireSyncs(pAcquireSyncs).pAcquireKeys(pAcquireKeys).pAcquireTimeouts(pAcquireTimeouts).releaseCount(releaseCount).pReleaseSyncs(pReleaseSyncs).pReleaseKeys(pReleaseKeys); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoKHR copyFrom(VkWin32KeyedMutexAcquireReleaseInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoKHR sType(@CType("VkStructureType") int value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `acquireCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_acquireCount(MemorySegment segment, long index) { return (int) VH_acquireCount.get(segment, 0L, index); }
    /// {@return `acquireCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_acquireCount(MemorySegment segment) { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_acquireCount(segment, 0L); }
    /// {@return `acquireCount`}
    public @CType("uint32_t") int acquireCount() { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_acquireCount(this.segment()); }
    /// Sets `acquireCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_acquireCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_acquireCount.set(segment, 0L, index, value); }
    /// Sets `acquireCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_acquireCount(MemorySegment segment, @CType("uint32_t") int value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_acquireCount(segment, 0L, value); }
    /// Sets `acquireCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoKHR acquireCount(@CType("uint32_t") int value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_acquireCount(this.segment(), value); return this; }

    /// {@return `pAcquireSyncs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment get_pAcquireSyncs(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pAcquireSyncs.get(segment, 0L, index); }
    /// {@return `pAcquireSyncs`}
    /// @param segment the segment of the struct
    public static @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment get_pAcquireSyncs(MemorySegment segment) { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_pAcquireSyncs(segment, 0L); }
    /// {@return `pAcquireSyncs`}
    public @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment pAcquireSyncs() { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_pAcquireSyncs(this.segment()); }
    /// Sets `pAcquireSyncs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pAcquireSyncs(MemorySegment segment, long index, @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment value) { VH_pAcquireSyncs.set(segment, 0L, index, value); }
    /// Sets `pAcquireSyncs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pAcquireSyncs(MemorySegment segment, @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_pAcquireSyncs(segment, 0L, value); }
    /// Sets `pAcquireSyncs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pAcquireSyncs(@CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_pAcquireSyncs(this.segment(), value); return this; }

    /// {@return `pAcquireKeys` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint64_t *") java.lang.foreign.MemorySegment get_pAcquireKeys(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pAcquireKeys.get(segment, 0L, index); }
    /// {@return `pAcquireKeys`}
    /// @param segment the segment of the struct
    public static @CType("const uint64_t *") java.lang.foreign.MemorySegment get_pAcquireKeys(MemorySegment segment) { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_pAcquireKeys(segment, 0L); }
    /// {@return `pAcquireKeys`}
    public @CType("const uint64_t *") java.lang.foreign.MemorySegment pAcquireKeys() { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_pAcquireKeys(this.segment()); }
    /// Sets `pAcquireKeys` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pAcquireKeys(MemorySegment segment, long index, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VH_pAcquireKeys.set(segment, 0L, index, value); }
    /// Sets `pAcquireKeys` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pAcquireKeys(MemorySegment segment, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_pAcquireKeys(segment, 0L, value); }
    /// Sets `pAcquireKeys` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pAcquireKeys(@CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_pAcquireKeys(this.segment(), value); return this; }

    /// {@return `pAcquireTimeouts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pAcquireTimeouts(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pAcquireTimeouts.get(segment, 0L, index); }
    /// {@return `pAcquireTimeouts`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pAcquireTimeouts(MemorySegment segment) { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_pAcquireTimeouts(segment, 0L); }
    /// {@return `pAcquireTimeouts`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pAcquireTimeouts() { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_pAcquireTimeouts(this.segment()); }
    /// Sets `pAcquireTimeouts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pAcquireTimeouts(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pAcquireTimeouts.set(segment, 0L, index, value); }
    /// Sets `pAcquireTimeouts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pAcquireTimeouts(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_pAcquireTimeouts(segment, 0L, value); }
    /// Sets `pAcquireTimeouts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pAcquireTimeouts(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_pAcquireTimeouts(this.segment(), value); return this; }

    /// {@return `releaseCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_releaseCount(MemorySegment segment, long index) { return (int) VH_releaseCount.get(segment, 0L, index); }
    /// {@return `releaseCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_releaseCount(MemorySegment segment) { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_releaseCount(segment, 0L); }
    /// {@return `releaseCount`}
    public @CType("uint32_t") int releaseCount() { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_releaseCount(this.segment()); }
    /// Sets `releaseCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_releaseCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_releaseCount.set(segment, 0L, index, value); }
    /// Sets `releaseCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_releaseCount(MemorySegment segment, @CType("uint32_t") int value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_releaseCount(segment, 0L, value); }
    /// Sets `releaseCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoKHR releaseCount(@CType("uint32_t") int value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_releaseCount(this.segment(), value); return this; }

    /// {@return `pReleaseSyncs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment get_pReleaseSyncs(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pReleaseSyncs.get(segment, 0L, index); }
    /// {@return `pReleaseSyncs`}
    /// @param segment the segment of the struct
    public static @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment get_pReleaseSyncs(MemorySegment segment) { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_pReleaseSyncs(segment, 0L); }
    /// {@return `pReleaseSyncs`}
    public @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment pReleaseSyncs() { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_pReleaseSyncs(this.segment()); }
    /// Sets `pReleaseSyncs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pReleaseSyncs(MemorySegment segment, long index, @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment value) { VH_pReleaseSyncs.set(segment, 0L, index, value); }
    /// Sets `pReleaseSyncs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pReleaseSyncs(MemorySegment segment, @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_pReleaseSyncs(segment, 0L, value); }
    /// Sets `pReleaseSyncs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pReleaseSyncs(@CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_pReleaseSyncs(this.segment(), value); return this; }

    /// {@return `pReleaseKeys` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint64_t *") java.lang.foreign.MemorySegment get_pReleaseKeys(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pReleaseKeys.get(segment, 0L, index); }
    /// {@return `pReleaseKeys`}
    /// @param segment the segment of the struct
    public static @CType("const uint64_t *") java.lang.foreign.MemorySegment get_pReleaseKeys(MemorySegment segment) { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_pReleaseKeys(segment, 0L); }
    /// {@return `pReleaseKeys`}
    public @CType("const uint64_t *") java.lang.foreign.MemorySegment pReleaseKeys() { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_pReleaseKeys(this.segment()); }
    /// Sets `pReleaseKeys` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pReleaseKeys(MemorySegment segment, long index, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VH_pReleaseKeys.set(segment, 0L, index, value); }
    /// Sets `pReleaseKeys` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pReleaseKeys(MemorySegment segment, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_pReleaseKeys(segment, 0L, value); }
    /// Sets `pReleaseKeys` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pReleaseKeys(@CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_pReleaseKeys(this.segment(), value); return this; }

    /// A buffer of [VkWin32KeyedMutexAcquireReleaseInfoKHR].
    public static final class Buffer extends VkWin32KeyedMutexAcquireReleaseInfoKHR {
        private final long elementCount;

        /// Creates `VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkWin32KeyedMutexAcquireReleaseInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkWin32KeyedMutexAcquireReleaseInfoKHR`
        public VkWin32KeyedMutexAcquireReleaseInfoKHR asSlice(long index) { return new VkWin32KeyedMutexAcquireReleaseInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkWin32KeyedMutexAcquireReleaseInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkWin32KeyedMutexAcquireReleaseInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `acquireCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int acquireCountAt(long index) { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_acquireCount(this.segment(), index); }
        /// Sets `acquireCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer acquireCountAt(long index, @CType("uint32_t") int value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_acquireCount(this.segment(), index, value); return this; }

        /// {@return `pAcquireSyncs` at the given index}
        /// @param index the index
        public @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment pAcquireSyncsAt(long index) { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_pAcquireSyncs(this.segment(), index); }
        /// Sets `pAcquireSyncs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pAcquireSyncsAt(long index, @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_pAcquireSyncs(this.segment(), index, value); return this; }

        /// {@return `pAcquireKeys` at the given index}
        /// @param index the index
        public @CType("const uint64_t *") java.lang.foreign.MemorySegment pAcquireKeysAt(long index) { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_pAcquireKeys(this.segment(), index); }
        /// Sets `pAcquireKeys` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pAcquireKeysAt(long index, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_pAcquireKeys(this.segment(), index, value); return this; }

        /// {@return `pAcquireTimeouts` at the given index}
        /// @param index the index
        public @CType("const uint32_t *") java.lang.foreign.MemorySegment pAcquireTimeoutsAt(long index) { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_pAcquireTimeouts(this.segment(), index); }
        /// Sets `pAcquireTimeouts` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pAcquireTimeoutsAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_pAcquireTimeouts(this.segment(), index, value); return this; }

        /// {@return `releaseCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int releaseCountAt(long index) { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_releaseCount(this.segment(), index); }
        /// Sets `releaseCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer releaseCountAt(long index, @CType("uint32_t") int value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_releaseCount(this.segment(), index, value); return this; }

        /// {@return `pReleaseSyncs` at the given index}
        /// @param index the index
        public @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment pReleaseSyncsAt(long index) { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_pReleaseSyncs(this.segment(), index); }
        /// Sets `pReleaseSyncs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pReleaseSyncsAt(long index, @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_pReleaseSyncs(this.segment(), index, value); return this; }

        /// {@return `pReleaseKeys` at the given index}
        /// @param index the index
        public @CType("const uint64_t *") java.lang.foreign.MemorySegment pReleaseKeysAt(long index) { return VkWin32KeyedMutexAcquireReleaseInfoKHR.get_pReleaseKeys(this.segment(), index); }
        /// Sets `pReleaseKeys` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pReleaseKeysAt(long index, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.set_pReleaseKeys(this.segment(), index, value); return this; }

    }
}
