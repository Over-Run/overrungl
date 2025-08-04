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
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkCommandPoolMemoryReservationCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkDeviceSize commandPoolReservedSize;
///     uint32_t commandPoolMaxCommandBuffers;
/// };
/// ```
public final class VkCommandPoolMemoryReservationCreateInfo extends GroupType {
    /// The struct layout of `VkCommandPoolMemoryReservationCreateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("commandPoolReservedSize"),
        ValueLayout.JAVA_INT.withName("commandPoolMaxCommandBuffers")
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
    /// The byte offset of `commandPoolReservedSize`.
    public static final long OFFSET_commandPoolReservedSize = LAYOUT.byteOffset(PathElement.groupElement("commandPoolReservedSize"));
    /// The memory layout of `commandPoolReservedSize`.
    public static final MemoryLayout LAYOUT_commandPoolReservedSize = LAYOUT.select(PathElement.groupElement("commandPoolReservedSize"));
    /// The [VarHandle] of `commandPoolReservedSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_commandPoolReservedSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandPoolReservedSize"));
    /// The byte offset of `commandPoolMaxCommandBuffers`.
    public static final long OFFSET_commandPoolMaxCommandBuffers = LAYOUT.byteOffset(PathElement.groupElement("commandPoolMaxCommandBuffers"));
    /// The memory layout of `commandPoolMaxCommandBuffers`.
    public static final MemoryLayout LAYOUT_commandPoolMaxCommandBuffers = LAYOUT.select(PathElement.groupElement("commandPoolMaxCommandBuffers"));
    /// The [VarHandle] of `commandPoolMaxCommandBuffers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_commandPoolMaxCommandBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandPoolMaxCommandBuffers"));

    /// Creates `VkCommandPoolMemoryReservationCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkCommandPoolMemoryReservationCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkCommandPoolMemoryReservationCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandPoolMemoryReservationCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandPoolMemoryReservationCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCommandPoolMemoryReservationCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandPoolMemoryReservationCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandPoolMemoryReservationCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkCommandPoolMemoryReservationCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandPoolMemoryReservationCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandPoolMemoryReservationCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCommandPoolMemoryReservationCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCommandPoolMemoryReservationCreateInfo`
    public static VkCommandPoolMemoryReservationCreateInfo alloc(SegmentAllocator allocator) { return new VkCommandPoolMemoryReservationCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkCommandPoolMemoryReservationCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCommandPoolMemoryReservationCreateInfo`
    public static VkCommandPoolMemoryReservationCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkCommandPoolMemoryReservationCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCommandPoolMemoryReservationCreateInfo copyFrom(VkCommandPoolMemoryReservationCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkCommandPoolMemoryReservationCreateInfo reinterpret(long count) { return new VkCommandPoolMemoryReservationCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkCommandPoolMemoryReservationCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkCommandPoolMemoryReservationCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `commandPoolReservedSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long commandPoolReservedSize(MemorySegment segment, long index) { return (long) VH_commandPoolReservedSize.get(segment, 0L, index); }
    /// {@return `commandPoolReservedSize`}
    public long commandPoolReservedSize() { return commandPoolReservedSize(this.segment(), 0L); }
    /// Sets `commandPoolReservedSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void commandPoolReservedSize(MemorySegment segment, long index, long value) { VH_commandPoolReservedSize.set(segment, 0L, index, value); }
    /// Sets `commandPoolReservedSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryReservationCreateInfo commandPoolReservedSize(long value) { commandPoolReservedSize(this.segment(), 0L, value); return this; }

    /// {@return `commandPoolMaxCommandBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int commandPoolMaxCommandBuffers(MemorySegment segment, long index) { return (int) VH_commandPoolMaxCommandBuffers.get(segment, 0L, index); }
    /// {@return `commandPoolMaxCommandBuffers`}
    public int commandPoolMaxCommandBuffers() { return commandPoolMaxCommandBuffers(this.segment(), 0L); }
    /// Sets `commandPoolMaxCommandBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void commandPoolMaxCommandBuffers(MemorySegment segment, long index, int value) { VH_commandPoolMaxCommandBuffers.set(segment, 0L, index, value); }
    /// Sets `commandPoolMaxCommandBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryReservationCreateInfo commandPoolMaxCommandBuffers(int value) { commandPoolMaxCommandBuffers(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkCommandPoolMemoryReservationCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCommandPoolMemoryReservationCreateInfo`
    public VkCommandPoolMemoryReservationCreateInfo asSlice(long index) { return new VkCommandPoolMemoryReservationCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkCommandPoolMemoryReservationCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCommandPoolMemoryReservationCreateInfo`
    public VkCommandPoolMemoryReservationCreateInfo asSlice(long index, long count) { return new VkCommandPoolMemoryReservationCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkCommandPoolMemoryReservationCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkCommandPoolMemoryReservationCreateInfo at(long index, Consumer<VkCommandPoolMemoryReservationCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryReservationCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryReservationCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `commandPoolReservedSize` at the given index}
    /// @param index the index of the struct buffer
    public long commandPoolReservedSizeAt(long index) { return commandPoolReservedSize(this.segment(), index); }
    /// Sets `commandPoolReservedSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryReservationCreateInfo commandPoolReservedSizeAt(long index, long value) { commandPoolReservedSize(this.segment(), index, value); return this; }

    /// {@return `commandPoolMaxCommandBuffers` at the given index}
    /// @param index the index of the struct buffer
    public int commandPoolMaxCommandBuffersAt(long index) { return commandPoolMaxCommandBuffers(this.segment(), index); }
    /// Sets `commandPoolMaxCommandBuffers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCommandPoolMemoryReservationCreateInfo commandPoolMaxCommandBuffersAt(long index, int value) { commandPoolMaxCommandBuffers(this.segment(), index, value); return this; }

}
