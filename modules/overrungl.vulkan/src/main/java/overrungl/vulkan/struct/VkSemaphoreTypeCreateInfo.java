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
package overrungl.vulkan.struct;

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
/// ### semaphoreType
/// [VarHandle][#VH_semaphoreType] - [Getter][#semaphoreType()] - [Setter][#semaphoreType(int)]
/// ### initialValue
/// [VarHandle][#VH_initialValue] - [Getter][#initialValue()] - [Setter][#initialValue(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSemaphoreTypeCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkSemaphoreType semaphoreType;
///     uint64_t initialValue;
/// } VkSemaphoreTypeCreateInfo;
/// ```
public final class VkSemaphoreTypeCreateInfo extends Struct {
    /// The struct layout of `VkSemaphoreTypeCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("semaphoreType"),
        ValueLayout.JAVA_LONG.withName("initialValue")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `semaphoreType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_semaphoreType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphoreType"));
    /// The [VarHandle] of `initialValue` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_initialValue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initialValue"));

    /// Creates `VkSemaphoreTypeCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkSemaphoreTypeCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSemaphoreTypeCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreTypeCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSemaphoreTypeCreateInfo(segment); }

    /// Creates `VkSemaphoreTypeCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreTypeCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSemaphoreTypeCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSemaphoreTypeCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreTypeCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSemaphoreTypeCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSemaphoreTypeCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSemaphoreTypeCreateInfo`
    public static VkSemaphoreTypeCreateInfo alloc(SegmentAllocator allocator) { return new VkSemaphoreTypeCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSemaphoreTypeCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSemaphoreTypeCreateInfo`
    public static VkSemaphoreTypeCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkSemaphoreTypeCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSemaphoreTypeCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkSemaphoreTypeCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSemaphoreTypeCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSemaphoreTypeCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSemaphoreTypeCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkSemaphoreTypeCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreTypeCreateInfo sType(@CType("VkStructureType") int value) { VkSemaphoreTypeCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSemaphoreTypeCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSemaphoreTypeCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkSemaphoreTypeCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSemaphoreTypeCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSemaphoreTypeCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSemaphoreTypeCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreTypeCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkSemaphoreTypeCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `semaphoreType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSemaphoreType") int get_semaphoreType(MemorySegment segment, long index) { return (int) VH_semaphoreType.get(segment, 0L, index); }
    /// {@return `semaphoreType`}
    /// @param segment the segment of the struct
    public static @CType("VkSemaphoreType") int get_semaphoreType(MemorySegment segment) { return VkSemaphoreTypeCreateInfo.get_semaphoreType(segment, 0L); }
    /// {@return `semaphoreType` at the given index}
    /// @param index the index
    public @CType("VkSemaphoreType") int semaphoreTypeAt(long index) { return VkSemaphoreTypeCreateInfo.get_semaphoreType(this.segment(), index); }
    /// {@return `semaphoreType`}
    public @CType("VkSemaphoreType") int semaphoreType() { return VkSemaphoreTypeCreateInfo.get_semaphoreType(this.segment()); }
    /// Sets `semaphoreType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_semaphoreType(MemorySegment segment, long index, @CType("VkSemaphoreType") int value) { VH_semaphoreType.set(segment, 0L, index, value); }
    /// Sets `semaphoreType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_semaphoreType(MemorySegment segment, @CType("VkSemaphoreType") int value) { VkSemaphoreTypeCreateInfo.set_semaphoreType(segment, 0L, value); }
    /// Sets `semaphoreType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSemaphoreTypeCreateInfo semaphoreTypeAt(long index, @CType("VkSemaphoreType") int value) { VkSemaphoreTypeCreateInfo.set_semaphoreType(this.segment(), index, value); return this; }
    /// Sets `semaphoreType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreTypeCreateInfo semaphoreType(@CType("VkSemaphoreType") int value) { VkSemaphoreTypeCreateInfo.set_semaphoreType(this.segment(), value); return this; }

    /// {@return `initialValue` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_initialValue(MemorySegment segment, long index) { return (long) VH_initialValue.get(segment, 0L, index); }
    /// {@return `initialValue`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_initialValue(MemorySegment segment) { return VkSemaphoreTypeCreateInfo.get_initialValue(segment, 0L); }
    /// {@return `initialValue` at the given index}
    /// @param index the index
    public @CType("uint64_t") long initialValueAt(long index) { return VkSemaphoreTypeCreateInfo.get_initialValue(this.segment(), index); }
    /// {@return `initialValue`}
    public @CType("uint64_t") long initialValue() { return VkSemaphoreTypeCreateInfo.get_initialValue(this.segment()); }
    /// Sets `initialValue` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_initialValue(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_initialValue.set(segment, 0L, index, value); }
    /// Sets `initialValue` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_initialValue(MemorySegment segment, @CType("uint64_t") long value) { VkSemaphoreTypeCreateInfo.set_initialValue(segment, 0L, value); }
    /// Sets `initialValue` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSemaphoreTypeCreateInfo initialValueAt(long index, @CType("uint64_t") long value) { VkSemaphoreTypeCreateInfo.set_initialValue(this.segment(), index, value); return this; }
    /// Sets `initialValue` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreTypeCreateInfo initialValue(@CType("uint64_t") long value) { VkSemaphoreTypeCreateInfo.set_initialValue(this.segment(), value); return this; }

}
