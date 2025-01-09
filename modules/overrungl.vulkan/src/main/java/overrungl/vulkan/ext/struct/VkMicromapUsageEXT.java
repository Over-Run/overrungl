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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### count
/// [VarHandle][#VH_count] - [Getter][#count()] - [Setter][#count(int)]
/// ### subdivisionLevel
/// [VarHandle][#VH_subdivisionLevel] - [Getter][#subdivisionLevel()] - [Setter][#subdivisionLevel(int)]
/// ### format
/// [VarHandle][#VH_format] - [Getter][#format()] - [Setter][#format(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMicromapUsageEXT {
///     uint32_t count;
///     uint32_t subdivisionLevel;
///     uint32_t format;
/// } VkMicromapUsageEXT;
/// ```
public final class VkMicromapUsageEXT extends Struct {
    /// The struct layout of `VkMicromapUsageEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("count"),
        ValueLayout.JAVA_INT.withName("subdivisionLevel"),
        ValueLayout.JAVA_INT.withName("format")
    );
    /// The [VarHandle] of `count` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_count = LAYOUT.arrayElementVarHandle(PathElement.groupElement("count"));
    /// The [VarHandle] of `subdivisionLevel` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subdivisionLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subdivisionLevel"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));

    /// Creates `VkMicromapUsageEXT` with the given segment.
    /// @param segment the memory segment
    public VkMicromapUsageEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMicromapUsageEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapUsageEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMicromapUsageEXT(segment); }

    /// Creates `VkMicromapUsageEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapUsageEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMicromapUsageEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMicromapUsageEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapUsageEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkMicromapUsageEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkMicromapUsageEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMicromapUsageEXT`
    public static VkMicromapUsageEXT alloc(SegmentAllocator allocator) { return new VkMicromapUsageEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMicromapUsageEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMicromapUsageEXT`
    public static VkMicromapUsageEXT alloc(SegmentAllocator allocator, long count) { return new VkMicromapUsageEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkMicromapUsageEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMicromapUsageEXT`
    public VkMicromapUsageEXT asSlice(long index) { return new VkMicromapUsageEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkMicromapUsageEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMicromapUsageEXT`
    public VkMicromapUsageEXT asSlice(long index, long count) { return new VkMicromapUsageEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `count` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_count(MemorySegment segment, long index) { return (int) VH_count.get(segment, 0L, index); }
    /// {@return `count`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_count(MemorySegment segment) { return VkMicromapUsageEXT.get_count(segment, 0L); }
    /// {@return `count` at the given index}
    /// @param index the index
    public @CType("uint32_t") int countAt(long index) { return VkMicromapUsageEXT.get_count(this.segment(), index); }
    /// {@return `count`}
    public @CType("uint32_t") int count() { return VkMicromapUsageEXT.get_count(this.segment()); }
    /// Sets `count` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_count(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_count.set(segment, 0L, index, value); }
    /// Sets `count` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_count(MemorySegment segment, @CType("uint32_t") int value) { VkMicromapUsageEXT.set_count(segment, 0L, value); }
    /// Sets `count` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapUsageEXT countAt(long index, @CType("uint32_t") int value) { VkMicromapUsageEXT.set_count(this.segment(), index, value); return this; }
    /// Sets `count` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapUsageEXT count(@CType("uint32_t") int value) { VkMicromapUsageEXT.set_count(this.segment(), value); return this; }

    /// {@return `subdivisionLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_subdivisionLevel(MemorySegment segment, long index) { return (int) VH_subdivisionLevel.get(segment, 0L, index); }
    /// {@return `subdivisionLevel`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_subdivisionLevel(MemorySegment segment) { return VkMicromapUsageEXT.get_subdivisionLevel(segment, 0L); }
    /// {@return `subdivisionLevel` at the given index}
    /// @param index the index
    public @CType("uint32_t") int subdivisionLevelAt(long index) { return VkMicromapUsageEXT.get_subdivisionLevel(this.segment(), index); }
    /// {@return `subdivisionLevel`}
    public @CType("uint32_t") int subdivisionLevel() { return VkMicromapUsageEXT.get_subdivisionLevel(this.segment()); }
    /// Sets `subdivisionLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subdivisionLevel(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_subdivisionLevel.set(segment, 0L, index, value); }
    /// Sets `subdivisionLevel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subdivisionLevel(MemorySegment segment, @CType("uint32_t") int value) { VkMicromapUsageEXT.set_subdivisionLevel(segment, 0L, value); }
    /// Sets `subdivisionLevel` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapUsageEXT subdivisionLevelAt(long index, @CType("uint32_t") int value) { VkMicromapUsageEXT.set_subdivisionLevel(this.segment(), index, value); return this; }
    /// Sets `subdivisionLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapUsageEXT subdivisionLevel(@CType("uint32_t") int value) { VkMicromapUsageEXT.set_subdivisionLevel(this.segment(), value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_format(MemorySegment segment) { return VkMicromapUsageEXT.get_format(segment, 0L); }
    /// {@return `format` at the given index}
    /// @param index the index
    public @CType("uint32_t") int formatAt(long index) { return VkMicromapUsageEXT.get_format(this.segment(), index); }
    /// {@return `format`}
    public @CType("uint32_t") int format() { return VkMicromapUsageEXT.get_format(this.segment()); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_format(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_format(MemorySegment segment, @CType("uint32_t") int value) { VkMicromapUsageEXT.set_format(segment, 0L, value); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapUsageEXT formatAt(long index, @CType("uint32_t") int value) { VkMicromapUsageEXT.set_format(this.segment(), index, value); return this; }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapUsageEXT format(@CType("uint32_t") int value) { VkMicromapUsageEXT.set_format(this.segment(), value); return this; }

}
