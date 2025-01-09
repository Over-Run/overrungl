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
/// ### usage
/// [VarHandle][#VH_usage] - [Getter][#usage()] - [Setter][#usage(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkBufferUsageFlags2CreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkBufferUsageFlags2 usage;
/// } VkBufferUsageFlags2CreateInfo;
/// ```
public final class VkBufferUsageFlags2CreateInfo extends Struct {
    /// The struct layout of `VkBufferUsageFlags2CreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("usage")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `usage` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage"));

    /// Creates `VkBufferUsageFlags2CreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkBufferUsageFlags2CreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBufferUsageFlags2CreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferUsageFlags2CreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferUsageFlags2CreateInfo(segment); }

    /// Creates `VkBufferUsageFlags2CreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferUsageFlags2CreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferUsageFlags2CreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBufferUsageFlags2CreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferUsageFlags2CreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferUsageFlags2CreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkBufferUsageFlags2CreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferUsageFlags2CreateInfo`
    public static VkBufferUsageFlags2CreateInfo alloc(SegmentAllocator allocator) { return new VkBufferUsageFlags2CreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBufferUsageFlags2CreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBufferUsageFlags2CreateInfo`
    public static VkBufferUsageFlags2CreateInfo alloc(SegmentAllocator allocator, long count) { return new VkBufferUsageFlags2CreateInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkBufferUsageFlags2CreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkBufferUsageFlags2CreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkBufferUsageFlags2CreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkBufferUsageFlags2CreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferUsageFlags2CreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkBufferUsageFlags2CreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferUsageFlags2CreateInfo sType(@CType("VkStructureType") int value) { VkBufferUsageFlags2CreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkBufferUsageFlags2CreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkBufferUsageFlags2CreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkBufferUsageFlags2CreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkBufferUsageFlags2CreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferUsageFlags2CreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkBufferUsageFlags2CreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferUsageFlags2CreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkBufferUsageFlags2CreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `usage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBufferUsageFlags2") long get_usage(MemorySegment segment, long index) { return (long) VH_usage.get(segment, 0L, index); }
    /// {@return `usage`}
    /// @param segment the segment of the struct
    public static @CType("VkBufferUsageFlags2") long get_usage(MemorySegment segment) { return VkBufferUsageFlags2CreateInfo.get_usage(segment, 0L); }
    /// {@return `usage` at the given index}
    /// @param index the index
    public @CType("VkBufferUsageFlags2") long usageAt(long index) { return VkBufferUsageFlags2CreateInfo.get_usage(this.segment(), index); }
    /// {@return `usage`}
    public @CType("VkBufferUsageFlags2") long usage() { return VkBufferUsageFlags2CreateInfo.get_usage(this.segment()); }
    /// Sets `usage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_usage(MemorySegment segment, long index, @CType("VkBufferUsageFlags2") long value) { VH_usage.set(segment, 0L, index, value); }
    /// Sets `usage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_usage(MemorySegment segment, @CType("VkBufferUsageFlags2") long value) { VkBufferUsageFlags2CreateInfo.set_usage(segment, 0L, value); }
    /// Sets `usage` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferUsageFlags2CreateInfo usageAt(long index, @CType("VkBufferUsageFlags2") long value) { VkBufferUsageFlags2CreateInfo.set_usage(this.segment(), index, value); return this; }
    /// Sets `usage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferUsageFlags2CreateInfo usage(@CType("VkBufferUsageFlags2") long value) { VkBufferUsageFlags2CreateInfo.set_usage(this.segment(), value); return this; }

}
