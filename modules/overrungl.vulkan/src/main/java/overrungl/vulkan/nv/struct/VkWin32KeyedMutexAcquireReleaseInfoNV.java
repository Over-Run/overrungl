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
package overrungl.vulkan.nv.struct;

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
/// ### pAcquireTimeoutMilliseconds
/// [VarHandle][#VH_pAcquireTimeoutMilliseconds] - [Getter][#pAcquireTimeoutMilliseconds()] - [Setter][#pAcquireTimeoutMilliseconds(java.lang.foreign.MemorySegment)]
/// ### releaseCount
/// [VarHandle][#VH_releaseCount] - [Getter][#releaseCount()] - [Setter][#releaseCount(int)]
/// ### pReleaseSyncs
/// [VarHandle][#VH_pReleaseSyncs] - [Getter][#pReleaseSyncs()] - [Setter][#pReleaseSyncs(java.lang.foreign.MemorySegment)]
/// ### pReleaseKeys
/// [VarHandle][#VH_pReleaseKeys] - [Getter][#pReleaseKeys()] - [Setter][#pReleaseKeys(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkWin32KeyedMutexAcquireReleaseInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t acquireCount;
///     const VkDeviceMemory * pAcquireSyncs;
///     const uint64_t * pAcquireKeys;
///     const uint32_t * pAcquireTimeoutMilliseconds;
///     uint32_t releaseCount;
///     const VkDeviceMemory * pReleaseSyncs;
///     const uint64_t * pReleaseKeys;
/// } VkWin32KeyedMutexAcquireReleaseInfoNV;
/// ```
public final class VkWin32KeyedMutexAcquireReleaseInfoNV extends Struct {
    /// The struct layout of `VkWin32KeyedMutexAcquireReleaseInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
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
    /// The [VarHandle] of `pAcquireTimeoutMilliseconds` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pAcquireTimeoutMilliseconds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAcquireTimeoutMilliseconds"));
    /// The [VarHandle] of `releaseCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_releaseCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("releaseCount"));
    /// The [VarHandle] of `pReleaseSyncs` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pReleaseSyncs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pReleaseSyncs"));
    /// The [VarHandle] of `pReleaseKeys` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pReleaseKeys = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pReleaseKeys"));

    /// Creates `VkWin32KeyedMutexAcquireReleaseInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkWin32KeyedMutexAcquireReleaseInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkWin32KeyedMutexAcquireReleaseInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWin32KeyedMutexAcquireReleaseInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkWin32KeyedMutexAcquireReleaseInfoNV(segment); }

    /// Creates `VkWin32KeyedMutexAcquireReleaseInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWin32KeyedMutexAcquireReleaseInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkWin32KeyedMutexAcquireReleaseInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkWin32KeyedMutexAcquireReleaseInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWin32KeyedMutexAcquireReleaseInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkWin32KeyedMutexAcquireReleaseInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkWin32KeyedMutexAcquireReleaseInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkWin32KeyedMutexAcquireReleaseInfoNV`
    public static VkWin32KeyedMutexAcquireReleaseInfoNV alloc(SegmentAllocator allocator) { return new VkWin32KeyedMutexAcquireReleaseInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkWin32KeyedMutexAcquireReleaseInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkWin32KeyedMutexAcquireReleaseInfoNV`
    public static VkWin32KeyedMutexAcquireReleaseInfoNV alloc(SegmentAllocator allocator, long count) { return new VkWin32KeyedMutexAcquireReleaseInfoNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkWin32KeyedMutexAcquireReleaseInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkWin32KeyedMutexAcquireReleaseInfoNV`
    public VkWin32KeyedMutexAcquireReleaseInfoNV asSlice(long index) { return new VkWin32KeyedMutexAcquireReleaseInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkWin32KeyedMutexAcquireReleaseInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkWin32KeyedMutexAcquireReleaseInfoNV`
    public VkWin32KeyedMutexAcquireReleaseInfoNV asSlice(long index, long count) { return new VkWin32KeyedMutexAcquireReleaseInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV sType(@CType("VkStructureType") int value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `acquireCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_acquireCount(MemorySegment segment, long index) { return (int) VH_acquireCount.get(segment, 0L, index); }
    /// {@return `acquireCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_acquireCount(MemorySegment segment) { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_acquireCount(segment, 0L); }
    /// {@return `acquireCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int acquireCountAt(long index) { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_acquireCount(this.segment(), index); }
    /// {@return `acquireCount`}
    public @CType("uint32_t") int acquireCount() { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_acquireCount(this.segment()); }
    /// Sets `acquireCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_acquireCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_acquireCount.set(segment, 0L, index, value); }
    /// Sets `acquireCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_acquireCount(MemorySegment segment, @CType("uint32_t") int value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_acquireCount(segment, 0L, value); }
    /// Sets `acquireCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV acquireCountAt(long index, @CType("uint32_t") int value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_acquireCount(this.segment(), index, value); return this; }
    /// Sets `acquireCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV acquireCount(@CType("uint32_t") int value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_acquireCount(this.segment(), value); return this; }

    /// {@return `pAcquireSyncs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment get_pAcquireSyncs(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pAcquireSyncs.get(segment, 0L, index); }
    /// {@return `pAcquireSyncs`}
    /// @param segment the segment of the struct
    public static @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment get_pAcquireSyncs(MemorySegment segment) { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_pAcquireSyncs(segment, 0L); }
    /// {@return `pAcquireSyncs` at the given index}
    /// @param index the index
    public @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment pAcquireSyncsAt(long index) { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_pAcquireSyncs(this.segment(), index); }
    /// {@return `pAcquireSyncs`}
    public @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment pAcquireSyncs() { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_pAcquireSyncs(this.segment()); }
    /// Sets `pAcquireSyncs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pAcquireSyncs(MemorySegment segment, long index, @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment value) { VH_pAcquireSyncs.set(segment, 0L, index, value); }
    /// Sets `pAcquireSyncs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pAcquireSyncs(MemorySegment segment, @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_pAcquireSyncs(segment, 0L, value); }
    /// Sets `pAcquireSyncs` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV pAcquireSyncsAt(long index, @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_pAcquireSyncs(this.segment(), index, value); return this; }
    /// Sets `pAcquireSyncs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV pAcquireSyncs(@CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_pAcquireSyncs(this.segment(), value); return this; }

    /// {@return `pAcquireKeys` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint64_t *") java.lang.foreign.MemorySegment get_pAcquireKeys(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pAcquireKeys.get(segment, 0L, index); }
    /// {@return `pAcquireKeys`}
    /// @param segment the segment of the struct
    public static @CType("const uint64_t *") java.lang.foreign.MemorySegment get_pAcquireKeys(MemorySegment segment) { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_pAcquireKeys(segment, 0L); }
    /// {@return `pAcquireKeys` at the given index}
    /// @param index the index
    public @CType("const uint64_t *") java.lang.foreign.MemorySegment pAcquireKeysAt(long index) { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_pAcquireKeys(this.segment(), index); }
    /// {@return `pAcquireKeys`}
    public @CType("const uint64_t *") java.lang.foreign.MemorySegment pAcquireKeys() { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_pAcquireKeys(this.segment()); }
    /// Sets `pAcquireKeys` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pAcquireKeys(MemorySegment segment, long index, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VH_pAcquireKeys.set(segment, 0L, index, value); }
    /// Sets `pAcquireKeys` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pAcquireKeys(MemorySegment segment, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_pAcquireKeys(segment, 0L, value); }
    /// Sets `pAcquireKeys` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV pAcquireKeysAt(long index, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_pAcquireKeys(this.segment(), index, value); return this; }
    /// Sets `pAcquireKeys` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV pAcquireKeys(@CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_pAcquireKeys(this.segment(), value); return this; }

    /// {@return `pAcquireTimeoutMilliseconds` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pAcquireTimeoutMilliseconds(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pAcquireTimeoutMilliseconds.get(segment, 0L, index); }
    /// {@return `pAcquireTimeoutMilliseconds`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pAcquireTimeoutMilliseconds(MemorySegment segment) { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_pAcquireTimeoutMilliseconds(segment, 0L); }
    /// {@return `pAcquireTimeoutMilliseconds` at the given index}
    /// @param index the index
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pAcquireTimeoutMillisecondsAt(long index) { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_pAcquireTimeoutMilliseconds(this.segment(), index); }
    /// {@return `pAcquireTimeoutMilliseconds`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pAcquireTimeoutMilliseconds() { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_pAcquireTimeoutMilliseconds(this.segment()); }
    /// Sets `pAcquireTimeoutMilliseconds` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pAcquireTimeoutMilliseconds(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pAcquireTimeoutMilliseconds.set(segment, 0L, index, value); }
    /// Sets `pAcquireTimeoutMilliseconds` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pAcquireTimeoutMilliseconds(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_pAcquireTimeoutMilliseconds(segment, 0L, value); }
    /// Sets `pAcquireTimeoutMilliseconds` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV pAcquireTimeoutMillisecondsAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_pAcquireTimeoutMilliseconds(this.segment(), index, value); return this; }
    /// Sets `pAcquireTimeoutMilliseconds` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV pAcquireTimeoutMilliseconds(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_pAcquireTimeoutMilliseconds(this.segment(), value); return this; }

    /// {@return `releaseCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_releaseCount(MemorySegment segment, long index) { return (int) VH_releaseCount.get(segment, 0L, index); }
    /// {@return `releaseCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_releaseCount(MemorySegment segment) { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_releaseCount(segment, 0L); }
    /// {@return `releaseCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int releaseCountAt(long index) { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_releaseCount(this.segment(), index); }
    /// {@return `releaseCount`}
    public @CType("uint32_t") int releaseCount() { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_releaseCount(this.segment()); }
    /// Sets `releaseCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_releaseCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_releaseCount.set(segment, 0L, index, value); }
    /// Sets `releaseCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_releaseCount(MemorySegment segment, @CType("uint32_t") int value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_releaseCount(segment, 0L, value); }
    /// Sets `releaseCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV releaseCountAt(long index, @CType("uint32_t") int value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_releaseCount(this.segment(), index, value); return this; }
    /// Sets `releaseCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV releaseCount(@CType("uint32_t") int value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_releaseCount(this.segment(), value); return this; }

    /// {@return `pReleaseSyncs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment get_pReleaseSyncs(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pReleaseSyncs.get(segment, 0L, index); }
    /// {@return `pReleaseSyncs`}
    /// @param segment the segment of the struct
    public static @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment get_pReleaseSyncs(MemorySegment segment) { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_pReleaseSyncs(segment, 0L); }
    /// {@return `pReleaseSyncs` at the given index}
    /// @param index the index
    public @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment pReleaseSyncsAt(long index) { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_pReleaseSyncs(this.segment(), index); }
    /// {@return `pReleaseSyncs`}
    public @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment pReleaseSyncs() { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_pReleaseSyncs(this.segment()); }
    /// Sets `pReleaseSyncs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pReleaseSyncs(MemorySegment segment, long index, @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment value) { VH_pReleaseSyncs.set(segment, 0L, index, value); }
    /// Sets `pReleaseSyncs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pReleaseSyncs(MemorySegment segment, @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_pReleaseSyncs(segment, 0L, value); }
    /// Sets `pReleaseSyncs` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV pReleaseSyncsAt(long index, @CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_pReleaseSyncs(this.segment(), index, value); return this; }
    /// Sets `pReleaseSyncs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV pReleaseSyncs(@CType("const VkDeviceMemory *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_pReleaseSyncs(this.segment(), value); return this; }

    /// {@return `pReleaseKeys` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint64_t *") java.lang.foreign.MemorySegment get_pReleaseKeys(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pReleaseKeys.get(segment, 0L, index); }
    /// {@return `pReleaseKeys`}
    /// @param segment the segment of the struct
    public static @CType("const uint64_t *") java.lang.foreign.MemorySegment get_pReleaseKeys(MemorySegment segment) { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_pReleaseKeys(segment, 0L); }
    /// {@return `pReleaseKeys` at the given index}
    /// @param index the index
    public @CType("const uint64_t *") java.lang.foreign.MemorySegment pReleaseKeysAt(long index) { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_pReleaseKeys(this.segment(), index); }
    /// {@return `pReleaseKeys`}
    public @CType("const uint64_t *") java.lang.foreign.MemorySegment pReleaseKeys() { return VkWin32KeyedMutexAcquireReleaseInfoNV.get_pReleaseKeys(this.segment()); }
    /// Sets `pReleaseKeys` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pReleaseKeys(MemorySegment segment, long index, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VH_pReleaseKeys.set(segment, 0L, index, value); }
    /// Sets `pReleaseKeys` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pReleaseKeys(MemorySegment segment, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_pReleaseKeys(segment, 0L, value); }
    /// Sets `pReleaseKeys` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV pReleaseKeysAt(long index, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_pReleaseKeys(this.segment(), index, value); return this; }
    /// Sets `pReleaseKeys` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoNV pReleaseKeys(@CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkWin32KeyedMutexAcquireReleaseInfoNV.set_pReleaseKeys(this.segment(), value); return this; }

}
