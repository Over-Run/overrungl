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
/// ### subresource
/// [Byte offset][#OFFSET_subresource] - [Memory layout][#ML_subresource] - [Getter][#subresource()] - [Setter][#subresource(java.lang.foreign.MemorySegment)]
/// ### offset
/// [Byte offset][#OFFSET_offset] - [Memory layout][#ML_offset] - [Getter][#offset()] - [Setter][#offset(java.lang.foreign.MemorySegment)]
/// ### extent
/// [Byte offset][#OFFSET_extent] - [Memory layout][#ML_extent] - [Getter][#extent()] - [Setter][#extent(java.lang.foreign.MemorySegment)]
/// ### memory
/// [VarHandle][#VH_memory] - [Getter][#memory()] - [Setter][#memory(java.lang.foreign.MemorySegment)]
/// ### memoryOffset
/// [VarHandle][#VH_memoryOffset] - [Getter][#memoryOffset()] - [Setter][#memoryOffset(long)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSparseImageMemoryBind {
///     VkImageSubresource subresource;
///     VkOffset3D offset;
///     VkExtent3D extent;
///     VkDeviceMemory memory;
///     VkDeviceSize memoryOffset;
///     VkSparseMemoryBindFlags flags;
/// } VkSparseImageMemoryBind;
/// ```
public final class VkSparseImageMemoryBind extends Struct {
    /// The struct layout of `VkSparseImageMemoryBind`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkImageSubresource.LAYOUT.withName("subresource"),
        overrungl.vulkan.struct.VkOffset3D.LAYOUT.withName("offset"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("extent"),
        ValueLayout.ADDRESS.withName("memory"),
        ValueLayout.JAVA_LONG.withName("memoryOffset"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    /// The byte offset of `subresource`.
    public static final long OFFSET_subresource = LAYOUT.byteOffset(PathElement.groupElement("subresource"));
    /// The memory layout of `subresource`.
    public static final MemoryLayout ML_subresource = LAYOUT.select(PathElement.groupElement("subresource"));
    /// The byte offset of `offset`.
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    /// The memory layout of `offset`.
    public static final MemoryLayout ML_offset = LAYOUT.select(PathElement.groupElement("offset"));
    /// The byte offset of `extent`.
    public static final long OFFSET_extent = LAYOUT.byteOffset(PathElement.groupElement("extent"));
    /// The memory layout of `extent`.
    public static final MemoryLayout ML_extent = LAYOUT.select(PathElement.groupElement("extent"));
    /// The [VarHandle] of `memory` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_memory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory"));
    /// The [VarHandle] of `memoryOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_memoryOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryOffset"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    /// Creates `VkSparseImageMemoryBind` with the given segment.
    /// @param segment the memory segment
    public VkSparseImageMemoryBind(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSparseImageMemoryBind` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageMemoryBind of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseImageMemoryBind(segment); }

    /// Creates `VkSparseImageMemoryBind` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageMemoryBind ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseImageMemoryBind(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSparseImageMemoryBind` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageMemoryBind ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseImageMemoryBind(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSparseImageMemoryBind` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSparseImageMemoryBind`
    public static VkSparseImageMemoryBind alloc(SegmentAllocator allocator) { return new VkSparseImageMemoryBind(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSparseImageMemoryBind` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSparseImageMemoryBind`
    public static VkSparseImageMemoryBind alloc(SegmentAllocator allocator, long count) { return new VkSparseImageMemoryBind(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkSparseImageMemoryBind`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSparseImageMemoryBind`
    public VkSparseImageMemoryBind asSlice(long index) { return new VkSparseImageMemoryBind(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkSparseImageMemoryBind`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSparseImageMemoryBind`
    public VkSparseImageMemoryBind asSlice(long index, long count) { return new VkSparseImageMemoryBind(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `subresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageSubresource") java.lang.foreign.MemorySegment get_subresource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_subresource, index), ML_subresource); }
    /// {@return `subresource`}
    /// @param segment the segment of the struct
    public static @CType("VkImageSubresource") java.lang.foreign.MemorySegment get_subresource(MemorySegment segment) { return VkSparseImageMemoryBind.get_subresource(segment, 0L); }
    /// {@return `subresource` at the given index}
    /// @param index the index
    public @CType("VkImageSubresource") java.lang.foreign.MemorySegment subresourceAt(long index) { return VkSparseImageMemoryBind.get_subresource(this.segment(), index); }
    /// {@return `subresource`}
    public @CType("VkImageSubresource") java.lang.foreign.MemorySegment subresource() { return VkSparseImageMemoryBind.get_subresource(this.segment()); }
    /// Sets `subresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subresource(MemorySegment segment, long index, @CType("VkImageSubresource") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_subresource, index), ML_subresource.byteSize()); }
    /// Sets `subresource` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subresource(MemorySegment segment, @CType("VkImageSubresource") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryBind.set_subresource(segment, 0L, value); }
    /// Sets `subresource` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryBind subresourceAt(long index, @CType("VkImageSubresource") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryBind.set_subresource(this.segment(), index, value); return this; }
    /// Sets `subresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryBind subresource(@CType("VkImageSubresource") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryBind.set_subresource(this.segment(), value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOffset3D") java.lang.foreign.MemorySegment get_offset(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_offset, index), ML_offset); }
    /// {@return `offset`}
    /// @param segment the segment of the struct
    public static @CType("VkOffset3D") java.lang.foreign.MemorySegment get_offset(MemorySegment segment) { return VkSparseImageMemoryBind.get_offset(segment, 0L); }
    /// {@return `offset` at the given index}
    /// @param index the index
    public @CType("VkOffset3D") java.lang.foreign.MemorySegment offsetAt(long index) { return VkSparseImageMemoryBind.get_offset(this.segment(), index); }
    /// {@return `offset`}
    public @CType("VkOffset3D") java.lang.foreign.MemorySegment offset() { return VkSparseImageMemoryBind.get_offset(this.segment()); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_offset(MemorySegment segment, long index, @CType("VkOffset3D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_offset, index), ML_offset.byteSize()); }
    /// Sets `offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_offset(MemorySegment segment, @CType("VkOffset3D") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryBind.set_offset(segment, 0L, value); }
    /// Sets `offset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryBind offsetAt(long index, @CType("VkOffset3D") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryBind.set_offset(this.segment(), index, value); return this; }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryBind offset(@CType("VkOffset3D") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryBind.set_offset(this.segment(), value); return this; }

    /// {@return `extent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent3D") java.lang.foreign.MemorySegment get_extent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_extent, index), ML_extent); }
    /// {@return `extent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent3D") java.lang.foreign.MemorySegment get_extent(MemorySegment segment) { return VkSparseImageMemoryBind.get_extent(segment, 0L); }
    /// {@return `extent` at the given index}
    /// @param index the index
    public @CType("VkExtent3D") java.lang.foreign.MemorySegment extentAt(long index) { return VkSparseImageMemoryBind.get_extent(this.segment(), index); }
    /// {@return `extent`}
    public @CType("VkExtent3D") java.lang.foreign.MemorySegment extent() { return VkSparseImageMemoryBind.get_extent(this.segment()); }
    /// Sets `extent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_extent(MemorySegment segment, long index, @CType("VkExtent3D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_extent, index), ML_extent.byteSize()); }
    /// Sets `extent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_extent(MemorySegment segment, @CType("VkExtent3D") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryBind.set_extent(segment, 0L, value); }
    /// Sets `extent` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryBind extentAt(long index, @CType("VkExtent3D") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryBind.set_extent(this.segment(), index, value); return this; }
    /// Sets `extent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryBind extent(@CType("VkExtent3D") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryBind.set_extent(this.segment(), value); return this; }

    /// {@return `memory` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceMemory") java.lang.foreign.MemorySegment get_memory(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_memory.get(segment, 0L, index); }
    /// {@return `memory`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceMemory") java.lang.foreign.MemorySegment get_memory(MemorySegment segment) { return VkSparseImageMemoryBind.get_memory(segment, 0L); }
    /// {@return `memory` at the given index}
    /// @param index the index
    public @CType("VkDeviceMemory") java.lang.foreign.MemorySegment memoryAt(long index) { return VkSparseImageMemoryBind.get_memory(this.segment(), index); }
    /// {@return `memory`}
    public @CType("VkDeviceMemory") java.lang.foreign.MemorySegment memory() { return VkSparseImageMemoryBind.get_memory(this.segment()); }
    /// Sets `memory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memory(MemorySegment segment, long index, @CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VH_memory.set(segment, 0L, index, value); }
    /// Sets `memory` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memory(MemorySegment segment, @CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryBind.set_memory(segment, 0L, value); }
    /// Sets `memory` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryBind memoryAt(long index, @CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryBind.set_memory(this.segment(), index, value); return this; }
    /// Sets `memory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryBind memory(@CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryBind.set_memory(this.segment(), value); return this; }

    /// {@return `memoryOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_memoryOffset(MemorySegment segment, long index) { return (long) VH_memoryOffset.get(segment, 0L, index); }
    /// {@return `memoryOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_memoryOffset(MemorySegment segment) { return VkSparseImageMemoryBind.get_memoryOffset(segment, 0L); }
    /// {@return `memoryOffset` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long memoryOffsetAt(long index) { return VkSparseImageMemoryBind.get_memoryOffset(this.segment(), index); }
    /// {@return `memoryOffset`}
    public @CType("VkDeviceSize") long memoryOffset() { return VkSparseImageMemoryBind.get_memoryOffset(this.segment()); }
    /// Sets `memoryOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryOffset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_memoryOffset.set(segment, 0L, index, value); }
    /// Sets `memoryOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryOffset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkSparseImageMemoryBind.set_memoryOffset(segment, 0L, value); }
    /// Sets `memoryOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryBind memoryOffsetAt(long index, @CType("VkDeviceSize") long value) { VkSparseImageMemoryBind.set_memoryOffset(this.segment(), index, value); return this; }
    /// Sets `memoryOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryBind memoryOffset(@CType("VkDeviceSize") long value) { VkSparseImageMemoryBind.set_memoryOffset(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSparseMemoryBindFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkSparseMemoryBindFlags") int get_flags(MemorySegment segment) { return VkSparseImageMemoryBind.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkSparseMemoryBindFlags") int flagsAt(long index) { return VkSparseImageMemoryBind.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkSparseMemoryBindFlags") int flags() { return VkSparseImageMemoryBind.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkSparseMemoryBindFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkSparseMemoryBindFlags") int value) { VkSparseImageMemoryBind.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryBind flagsAt(long index, @CType("VkSparseMemoryBindFlags") int value) { VkSparseImageMemoryBind.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryBind flags(@CType("VkSparseMemoryBindFlags") int value) { VkSparseImageMemoryBind.set_flags(this.segment(), value); return this; }

}
