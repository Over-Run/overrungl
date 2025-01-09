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
/// ### constantID
/// [VarHandle][#VH_constantID] - [Getter][#constantID()] - [Setter][#constantID(int)]
/// ### offset
/// [VarHandle][#VH_offset] - [Getter][#offset()] - [Setter][#offset(int)]
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSpecializationMapEntry {
///     uint32_t constantID;
///     uint32_t offset;
///     size_t size;
/// } VkSpecializationMapEntry;
/// ```
public final class VkSpecializationMapEntry extends Struct {
    /// The struct layout of `VkSpecializationMapEntry`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("constantID"),
        ValueLayout.JAVA_INT.withName("offset"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    /// The [VarHandle] of `constantID` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_constantID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constantID"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    /// Creates `VkSpecializationMapEntry` with the given segment.
    /// @param segment the memory segment
    public VkSpecializationMapEntry(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSpecializationMapEntry` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSpecializationMapEntry of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSpecializationMapEntry(segment); }

    /// Creates `VkSpecializationMapEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSpecializationMapEntry ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSpecializationMapEntry(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSpecializationMapEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSpecializationMapEntry ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSpecializationMapEntry(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSpecializationMapEntry` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSpecializationMapEntry`
    public static VkSpecializationMapEntry alloc(SegmentAllocator allocator) { return new VkSpecializationMapEntry(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSpecializationMapEntry` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSpecializationMapEntry`
    public static VkSpecializationMapEntry alloc(SegmentAllocator allocator, long count) { return new VkSpecializationMapEntry(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkSpecializationMapEntry`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSpecializationMapEntry`
    public VkSpecializationMapEntry asSlice(long index) { return new VkSpecializationMapEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkSpecializationMapEntry`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSpecializationMapEntry`
    public VkSpecializationMapEntry asSlice(long index, long count) { return new VkSpecializationMapEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `constantID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_constantID(MemorySegment segment, long index) { return (int) VH_constantID.get(segment, 0L, index); }
    /// {@return `constantID`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_constantID(MemorySegment segment) { return VkSpecializationMapEntry.get_constantID(segment, 0L); }
    /// {@return `constantID` at the given index}
    /// @param index the index
    public @CType("uint32_t") int constantIDAt(long index) { return VkSpecializationMapEntry.get_constantID(this.segment(), index); }
    /// {@return `constantID`}
    public @CType("uint32_t") int constantID() { return VkSpecializationMapEntry.get_constantID(this.segment()); }
    /// Sets `constantID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_constantID(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_constantID.set(segment, 0L, index, value); }
    /// Sets `constantID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_constantID(MemorySegment segment, @CType("uint32_t") int value) { VkSpecializationMapEntry.set_constantID(segment, 0L, value); }
    /// Sets `constantID` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSpecializationMapEntry constantIDAt(long index, @CType("uint32_t") int value) { VkSpecializationMapEntry.set_constantID(this.segment(), index, value); return this; }
    /// Sets `constantID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSpecializationMapEntry constantID(@CType("uint32_t") int value) { VkSpecializationMapEntry.set_constantID(this.segment(), value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_offset(MemorySegment segment, long index) { return (int) VH_offset.get(segment, 0L, index); }
    /// {@return `offset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_offset(MemorySegment segment) { return VkSpecializationMapEntry.get_offset(segment, 0L); }
    /// {@return `offset` at the given index}
    /// @param index the index
    public @CType("uint32_t") int offsetAt(long index) { return VkSpecializationMapEntry.get_offset(this.segment(), index); }
    /// {@return `offset`}
    public @CType("uint32_t") int offset() { return VkSpecializationMapEntry.get_offset(this.segment()); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_offset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_offset.set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_offset(MemorySegment segment, @CType("uint32_t") int value) { VkSpecializationMapEntry.set_offset(segment, 0L, value); }
    /// Sets `offset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSpecializationMapEntry offsetAt(long index, @CType("uint32_t") int value) { VkSpecializationMapEntry.set_offset(this.segment(), index, value); return this; }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSpecializationMapEntry offset(@CType("uint32_t") int value) { VkSpecializationMapEntry.set_offset(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_size(MemorySegment segment) { return VkSpecializationMapEntry.get_size(segment, 0L); }
    /// {@return `size` at the given index}
    /// @param index the index
    public @CType("size_t") long sizeAt(long index) { return VkSpecializationMapEntry.get_size(this.segment(), index); }
    /// {@return `size`}
    public @CType("size_t") long size() { return VkSpecializationMapEntry.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("size_t") long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("size_t") long value) { VkSpecializationMapEntry.set_size(segment, 0L, value); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSpecializationMapEntry sizeAt(long index, @CType("size_t") long value) { VkSpecializationMapEntry.set_size(this.segment(), index, value); return this; }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSpecializationMapEntry size(@CType("size_t") long value) { VkSpecializationMapEntry.set_size(this.segment(), value); return this; }

}
