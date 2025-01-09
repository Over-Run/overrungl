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
/// ### commandPoolReservedSize
/// [VarHandle][#VH_commandPoolReservedSize] - [Getter][#commandPoolReservedSize()] - [Setter][#commandPoolReservedSize(long)]
/// ### commandPoolMaxCommandBuffers
/// [VarHandle][#VH_commandPoolMaxCommandBuffers] - [Getter][#commandPoolMaxCommandBuffers()] - [Setter][#commandPoolMaxCommandBuffers(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCommandPoolMemoryReservationCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkDeviceSize commandPoolReservedSize;
///     uint32_t commandPoolMaxCommandBuffers;
/// } VkCommandPoolMemoryReservationCreateInfo;
/// ```
public final class VkCommandPoolMemoryReservationCreateInfo extends Struct {
    /// The struct layout of `VkCommandPoolMemoryReservationCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("commandPoolReservedSize"),
        ValueLayout.JAVA_INT.withName("commandPoolMaxCommandBuffers")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `commandPoolReservedSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_commandPoolReservedSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandPoolReservedSize"));
    /// The [VarHandle] of `commandPoolMaxCommandBuffers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_commandPoolMaxCommandBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandPoolMaxCommandBuffers"));

    /// Creates `VkCommandPoolMemoryReservationCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkCommandPoolMemoryReservationCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCommandPoolMemoryReservationCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandPoolMemoryReservationCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandPoolMemoryReservationCreateInfo(segment); }

    /// Creates `VkCommandPoolMemoryReservationCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandPoolMemoryReservationCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandPoolMemoryReservationCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCommandPoolMemoryReservationCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandPoolMemoryReservationCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandPoolMemoryReservationCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkCommandPoolMemoryReservationCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCommandPoolMemoryReservationCreateInfo`
    public static VkCommandPoolMemoryReservationCreateInfo alloc(SegmentAllocator allocator) { return new VkCommandPoolMemoryReservationCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCommandPoolMemoryReservationCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCommandPoolMemoryReservationCreateInfo`
    public static VkCommandPoolMemoryReservationCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkCommandPoolMemoryReservationCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCommandPoolMemoryReservationCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkCommandPoolMemoryReservationCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCommandPoolMemoryReservationCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCommandPoolMemoryReservationCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryReservationCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkCommandPoolMemoryReservationCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryReservationCreateInfo sType(@CType("VkStructureType") int value) { VkCommandPoolMemoryReservationCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkCommandPoolMemoryReservationCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkCommandPoolMemoryReservationCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkCommandPoolMemoryReservationCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCommandPoolMemoryReservationCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryReservationCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCommandPoolMemoryReservationCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryReservationCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkCommandPoolMemoryReservationCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `commandPoolReservedSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_commandPoolReservedSize(MemorySegment segment, long index) { return (long) VH_commandPoolReservedSize.get(segment, 0L, index); }
    /// {@return `commandPoolReservedSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_commandPoolReservedSize(MemorySegment segment) { return VkCommandPoolMemoryReservationCreateInfo.get_commandPoolReservedSize(segment, 0L); }
    /// {@return `commandPoolReservedSize` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long commandPoolReservedSizeAt(long index) { return VkCommandPoolMemoryReservationCreateInfo.get_commandPoolReservedSize(this.segment(), index); }
    /// {@return `commandPoolReservedSize`}
    public @CType("VkDeviceSize") long commandPoolReservedSize() { return VkCommandPoolMemoryReservationCreateInfo.get_commandPoolReservedSize(this.segment()); }
    /// Sets `commandPoolReservedSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_commandPoolReservedSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_commandPoolReservedSize.set(segment, 0L, index, value); }
    /// Sets `commandPoolReservedSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_commandPoolReservedSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkCommandPoolMemoryReservationCreateInfo.set_commandPoolReservedSize(segment, 0L, value); }
    /// Sets `commandPoolReservedSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryReservationCreateInfo commandPoolReservedSizeAt(long index, @CType("VkDeviceSize") long value) { VkCommandPoolMemoryReservationCreateInfo.set_commandPoolReservedSize(this.segment(), index, value); return this; }
    /// Sets `commandPoolReservedSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryReservationCreateInfo commandPoolReservedSize(@CType("VkDeviceSize") long value) { VkCommandPoolMemoryReservationCreateInfo.set_commandPoolReservedSize(this.segment(), value); return this; }

    /// {@return `commandPoolMaxCommandBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_commandPoolMaxCommandBuffers(MemorySegment segment, long index) { return (int) VH_commandPoolMaxCommandBuffers.get(segment, 0L, index); }
    /// {@return `commandPoolMaxCommandBuffers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_commandPoolMaxCommandBuffers(MemorySegment segment) { return VkCommandPoolMemoryReservationCreateInfo.get_commandPoolMaxCommandBuffers(segment, 0L); }
    /// {@return `commandPoolMaxCommandBuffers` at the given index}
    /// @param index the index
    public @CType("uint32_t") int commandPoolMaxCommandBuffersAt(long index) { return VkCommandPoolMemoryReservationCreateInfo.get_commandPoolMaxCommandBuffers(this.segment(), index); }
    /// {@return `commandPoolMaxCommandBuffers`}
    public @CType("uint32_t") int commandPoolMaxCommandBuffers() { return VkCommandPoolMemoryReservationCreateInfo.get_commandPoolMaxCommandBuffers(this.segment()); }
    /// Sets `commandPoolMaxCommandBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_commandPoolMaxCommandBuffers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_commandPoolMaxCommandBuffers.set(segment, 0L, index, value); }
    /// Sets `commandPoolMaxCommandBuffers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_commandPoolMaxCommandBuffers(MemorySegment segment, @CType("uint32_t") int value) { VkCommandPoolMemoryReservationCreateInfo.set_commandPoolMaxCommandBuffers(segment, 0L, value); }
    /// Sets `commandPoolMaxCommandBuffers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryReservationCreateInfo commandPoolMaxCommandBuffersAt(long index, @CType("uint32_t") int value) { VkCommandPoolMemoryReservationCreateInfo.set_commandPoolMaxCommandBuffers(this.segment(), index, value); return this; }
    /// Sets `commandPoolMaxCommandBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryReservationCreateInfo commandPoolMaxCommandBuffers(@CType("uint32_t") int value) { VkCommandPoolMemoryReservationCreateInfo.set_commandPoolMaxCommandBuffers(this.segment(), value); return this; }

}
