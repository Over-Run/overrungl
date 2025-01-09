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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### timeout
/// [VarHandle][#VH_timeout] - [Getter][#timeout()] - [Setter][#timeout(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAcquireProfilingLockInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkAcquireProfilingLockFlagsKHR flags;
///     uint64_t timeout;
/// } VkAcquireProfilingLockInfoKHR;
/// ```
public final class VkAcquireProfilingLockInfoKHR extends Struct {
    /// The struct layout of `VkAcquireProfilingLockInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("timeout")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `timeout` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_timeout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timeout"));

    /// Creates `VkAcquireProfilingLockInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkAcquireProfilingLockInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAcquireProfilingLockInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAcquireProfilingLockInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAcquireProfilingLockInfoKHR(segment); }

    /// Creates `VkAcquireProfilingLockInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAcquireProfilingLockInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAcquireProfilingLockInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAcquireProfilingLockInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAcquireProfilingLockInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkAcquireProfilingLockInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkAcquireProfilingLockInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAcquireProfilingLockInfoKHR`
    public static VkAcquireProfilingLockInfoKHR alloc(SegmentAllocator allocator) { return new VkAcquireProfilingLockInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAcquireProfilingLockInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAcquireProfilingLockInfoKHR`
    public static VkAcquireProfilingLockInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkAcquireProfilingLockInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAcquireProfilingLockInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkAcquireProfilingLockInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAcquireProfilingLockInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAcquireProfilingLockInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAcquireProfilingLockInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkAcquireProfilingLockInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAcquireProfilingLockInfoKHR sType(@CType("VkStructureType") int value) { VkAcquireProfilingLockInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkAcquireProfilingLockInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkAcquireProfilingLockInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkAcquireProfilingLockInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAcquireProfilingLockInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAcquireProfilingLockInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAcquireProfilingLockInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAcquireProfilingLockInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkAcquireProfilingLockInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAcquireProfilingLockFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkAcquireProfilingLockFlagsKHR") int get_flags(MemorySegment segment) { return VkAcquireProfilingLockInfoKHR.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkAcquireProfilingLockFlagsKHR") int flagsAt(long index) { return VkAcquireProfilingLockInfoKHR.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkAcquireProfilingLockFlagsKHR") int flags() { return VkAcquireProfilingLockInfoKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkAcquireProfilingLockFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkAcquireProfilingLockFlagsKHR") int value) { VkAcquireProfilingLockInfoKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAcquireProfilingLockInfoKHR flagsAt(long index, @CType("VkAcquireProfilingLockFlagsKHR") int value) { VkAcquireProfilingLockInfoKHR.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAcquireProfilingLockInfoKHR flags(@CType("VkAcquireProfilingLockFlagsKHR") int value) { VkAcquireProfilingLockInfoKHR.set_flags(this.segment(), value); return this; }

    /// {@return `timeout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_timeout(MemorySegment segment, long index) { return (long) VH_timeout.get(segment, 0L, index); }
    /// {@return `timeout`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_timeout(MemorySegment segment) { return VkAcquireProfilingLockInfoKHR.get_timeout(segment, 0L); }
    /// {@return `timeout` at the given index}
    /// @param index the index
    public @CType("uint64_t") long timeoutAt(long index) { return VkAcquireProfilingLockInfoKHR.get_timeout(this.segment(), index); }
    /// {@return `timeout`}
    public @CType("uint64_t") long timeout() { return VkAcquireProfilingLockInfoKHR.get_timeout(this.segment()); }
    /// Sets `timeout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_timeout(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_timeout.set(segment, 0L, index, value); }
    /// Sets `timeout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_timeout(MemorySegment segment, @CType("uint64_t") long value) { VkAcquireProfilingLockInfoKHR.set_timeout(segment, 0L, value); }
    /// Sets `timeout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAcquireProfilingLockInfoKHR timeoutAt(long index, @CType("uint64_t") long value) { VkAcquireProfilingLockInfoKHR.set_timeout(this.segment(), index, value); return this; }
    /// Sets `timeout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAcquireProfilingLockInfoKHR timeout(@CType("uint64_t") long value) { VkAcquireProfilingLockInfoKHR.set_timeout(this.segment(), value); return this; }

}
