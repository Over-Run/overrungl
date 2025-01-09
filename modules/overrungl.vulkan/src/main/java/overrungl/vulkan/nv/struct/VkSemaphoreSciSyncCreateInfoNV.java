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
/// ### semaphorePool
/// [VarHandle][#VH_semaphorePool] - [Getter][#semaphorePool()] - [Setter][#semaphorePool(java.lang.foreign.MemorySegment)]
/// ### pFence
/// [VarHandle][#VH_pFence] - [Getter][#pFence()] - [Setter][#pFence(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSemaphoreSciSyncCreateInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkSemaphoreSciSyncPoolNV semaphorePool;
///     const NvSciSyncFence * pFence;
/// } VkSemaphoreSciSyncCreateInfoNV;
/// ```
public final class VkSemaphoreSciSyncCreateInfoNV extends Struct {
    /// The struct layout of `VkSemaphoreSciSyncCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("semaphorePool"),
        ValueLayout.ADDRESS.withName("pFence")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `semaphorePool` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_semaphorePool = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphorePool"));
    /// The [VarHandle] of `pFence` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pFence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pFence"));

    /// Creates `VkSemaphoreSciSyncCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkSemaphoreSciSyncCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSemaphoreSciSyncCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreSciSyncCreateInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSemaphoreSciSyncCreateInfoNV(segment); }

    /// Creates `VkSemaphoreSciSyncCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreSciSyncCreateInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSemaphoreSciSyncCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSemaphoreSciSyncCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreSciSyncCreateInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSemaphoreSciSyncCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSemaphoreSciSyncCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSemaphoreSciSyncCreateInfoNV`
    public static VkSemaphoreSciSyncCreateInfoNV alloc(SegmentAllocator allocator) { return new VkSemaphoreSciSyncCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSemaphoreSciSyncCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSemaphoreSciSyncCreateInfoNV`
    public static VkSemaphoreSciSyncCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkSemaphoreSciSyncCreateInfoNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkSemaphoreSciSyncCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSemaphoreSciSyncCreateInfoNV`
    public VkSemaphoreSciSyncCreateInfoNV asSlice(long index) { return new VkSemaphoreSciSyncCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkSemaphoreSciSyncCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSemaphoreSciSyncCreateInfoNV`
    public VkSemaphoreSciSyncCreateInfoNV asSlice(long index, long count) { return new VkSemaphoreSciSyncCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSemaphoreSciSyncCreateInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkSemaphoreSciSyncCreateInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSemaphoreSciSyncCreateInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSemaphoreSciSyncCreateInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSciSyncCreateInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkSemaphoreSciSyncCreateInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSciSyncCreateInfoNV sType(@CType("VkStructureType") int value) { VkSemaphoreSciSyncCreateInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSemaphoreSciSyncCreateInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSemaphoreSciSyncCreateInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkSemaphoreSciSyncCreateInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSemaphoreSciSyncCreateInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSciSyncCreateInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSemaphoreSciSyncCreateInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSciSyncCreateInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkSemaphoreSciSyncCreateInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `semaphorePool` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSemaphoreSciSyncPoolNV") java.lang.foreign.MemorySegment get_semaphorePool(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_semaphorePool.get(segment, 0L, index); }
    /// {@return `semaphorePool`}
    /// @param segment the segment of the struct
    public static @CType("VkSemaphoreSciSyncPoolNV") java.lang.foreign.MemorySegment get_semaphorePool(MemorySegment segment) { return VkSemaphoreSciSyncCreateInfoNV.get_semaphorePool(segment, 0L); }
    /// {@return `semaphorePool` at the given index}
    /// @param index the index
    public @CType("VkSemaphoreSciSyncPoolNV") java.lang.foreign.MemorySegment semaphorePoolAt(long index) { return VkSemaphoreSciSyncCreateInfoNV.get_semaphorePool(this.segment(), index); }
    /// {@return `semaphorePool`}
    public @CType("VkSemaphoreSciSyncPoolNV") java.lang.foreign.MemorySegment semaphorePool() { return VkSemaphoreSciSyncCreateInfoNV.get_semaphorePool(this.segment()); }
    /// Sets `semaphorePool` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_semaphorePool(MemorySegment segment, long index, @CType("VkSemaphoreSciSyncPoolNV") java.lang.foreign.MemorySegment value) { VH_semaphorePool.set(segment, 0L, index, value); }
    /// Sets `semaphorePool` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_semaphorePool(MemorySegment segment, @CType("VkSemaphoreSciSyncPoolNV") java.lang.foreign.MemorySegment value) { VkSemaphoreSciSyncCreateInfoNV.set_semaphorePool(segment, 0L, value); }
    /// Sets `semaphorePool` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSciSyncCreateInfoNV semaphorePoolAt(long index, @CType("VkSemaphoreSciSyncPoolNV") java.lang.foreign.MemorySegment value) { VkSemaphoreSciSyncCreateInfoNV.set_semaphorePool(this.segment(), index, value); return this; }
    /// Sets `semaphorePool` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSciSyncCreateInfoNV semaphorePool(@CType("VkSemaphoreSciSyncPoolNV") java.lang.foreign.MemorySegment value) { VkSemaphoreSciSyncCreateInfoNV.set_semaphorePool(this.segment(), value); return this; }

    /// {@return `pFence` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const NvSciSyncFence *") java.lang.foreign.MemorySegment get_pFence(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pFence.get(segment, 0L, index); }
    /// {@return `pFence`}
    /// @param segment the segment of the struct
    public static @CType("const NvSciSyncFence *") java.lang.foreign.MemorySegment get_pFence(MemorySegment segment) { return VkSemaphoreSciSyncCreateInfoNV.get_pFence(segment, 0L); }
    /// {@return `pFence` at the given index}
    /// @param index the index
    public @CType("const NvSciSyncFence *") java.lang.foreign.MemorySegment pFenceAt(long index) { return VkSemaphoreSciSyncCreateInfoNV.get_pFence(this.segment(), index); }
    /// {@return `pFence`}
    public @CType("const NvSciSyncFence *") java.lang.foreign.MemorySegment pFence() { return VkSemaphoreSciSyncCreateInfoNV.get_pFence(this.segment()); }
    /// Sets `pFence` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pFence(MemorySegment segment, long index, @CType("const NvSciSyncFence *") java.lang.foreign.MemorySegment value) { VH_pFence.set(segment, 0L, index, value); }
    /// Sets `pFence` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pFence(MemorySegment segment, @CType("const NvSciSyncFence *") java.lang.foreign.MemorySegment value) { VkSemaphoreSciSyncCreateInfoNV.set_pFence(segment, 0L, value); }
    /// Sets `pFence` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSciSyncCreateInfoNV pFenceAt(long index, @CType("const NvSciSyncFence *") java.lang.foreign.MemorySegment value) { VkSemaphoreSciSyncCreateInfoNV.set_pFence(this.segment(), index, value); return this; }
    /// Sets `pFence` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSciSyncCreateInfoNV pFence(@CType("const NvSciSyncFence *") java.lang.foreign.MemorySegment value) { VkSemaphoreSciSyncCreateInfoNV.set_pFence(this.segment(), value); return this; }

}
