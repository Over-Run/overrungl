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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkMicromapUsageEXT {
///     uint32_t count;
///     uint32_t subdivisionLevel;
///     uint32_t format;
/// };
/// ```
public final class VkMicromapUsageEXT extends GroupType {
    /// The struct layout of `VkMicromapUsageEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("count"),
        ValueLayout.JAVA_INT.withName("subdivisionLevel"),
        ValueLayout.JAVA_INT.withName("format")
    );
    /// The byte offset of `count`.
    public static final long OFFSET_count = LAYOUT.byteOffset(PathElement.groupElement("count"));
    /// The memory layout of `count`.
    public static final MemoryLayout LAYOUT_count = LAYOUT.select(PathElement.groupElement("count"));
    /// The [VarHandle] of `count` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_count = LAYOUT.arrayElementVarHandle(PathElement.groupElement("count"));
    /// The byte offset of `subdivisionLevel`.
    public static final long OFFSET_subdivisionLevel = LAYOUT.byteOffset(PathElement.groupElement("subdivisionLevel"));
    /// The memory layout of `subdivisionLevel`.
    public static final MemoryLayout LAYOUT_subdivisionLevel = LAYOUT.select(PathElement.groupElement("subdivisionLevel"));
    /// The [VarHandle] of `subdivisionLevel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subdivisionLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subdivisionLevel"));
    /// The byte offset of `format`.
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    /// The memory layout of `format`.
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));

    /// Creates `VkMicromapUsageEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkMicromapUsageEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkMicromapUsageEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapUsageEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapUsageEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMicromapUsageEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapUsageEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapUsageEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkMicromapUsageEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapUsageEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapUsageEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMicromapUsageEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMicromapUsageEXT`
    public static VkMicromapUsageEXT alloc(SegmentAllocator allocator) { return new VkMicromapUsageEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkMicromapUsageEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMicromapUsageEXT`
    public static VkMicromapUsageEXT alloc(SegmentAllocator allocator, long count) { return new VkMicromapUsageEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkMicromapUsageEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param count `count`
    /// @param subdivisionLevel `subdivisionLevel`
    /// @param format `format`
    /// @return the allocated `VkMicromapUsageEXT`
    public static VkMicromapUsageEXT allocInit(SegmentAllocator allocator, int count, int subdivisionLevel, int format) {
        return alloc(allocator).count(count).subdivisionLevel(subdivisionLevel).format(format);
    }

    /// Allocates a `VkMicromapUsageEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param count `count`
    /// @param subdivisionLevel `subdivisionLevel`
    /// @return the allocated `VkMicromapUsageEXT`
    public static VkMicromapUsageEXT allocInit(SegmentAllocator allocator, int count, int subdivisionLevel) {
        return alloc(allocator).count(count).subdivisionLevel(subdivisionLevel);
    }

    /// Allocates a `VkMicromapUsageEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param count `count`
    /// @return the allocated `VkMicromapUsageEXT`
    public static VkMicromapUsageEXT allocInit(SegmentAllocator allocator, int count) {
        return alloc(allocator).count(count);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMicromapUsageEXT copyFrom(VkMicromapUsageEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkMicromapUsageEXT reinterpret(long count) { return new VkMicromapUsageEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `count` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int count(MemorySegment segment, long index) { return (int) VH_count.get(segment, 0L, index); }
    /// {@return `count`}
    public int count() { return count(this.segment(), 0L); }
    /// Sets `count` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void count(MemorySegment segment, long index, int value) { VH_count.set(segment, 0L, index, value); }
    /// Sets `count` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapUsageEXT count(int value) { count(this.segment(), 0L, value); return this; }

    /// {@return `subdivisionLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subdivisionLevel(MemorySegment segment, long index) { return (int) VH_subdivisionLevel.get(segment, 0L, index); }
    /// {@return `subdivisionLevel`}
    public int subdivisionLevel() { return subdivisionLevel(this.segment(), 0L); }
    /// Sets `subdivisionLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subdivisionLevel(MemorySegment segment, long index, int value) { VH_subdivisionLevel.set(segment, 0L, index, value); }
    /// Sets `subdivisionLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapUsageEXT subdivisionLevel(int value) { subdivisionLevel(this.segment(), 0L, value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    public int format() { return format(this.segment(), 0L); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void format(MemorySegment segment, long index, int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapUsageEXT format(int value) { format(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkMicromapUsageEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMicromapUsageEXT`
    public VkMicromapUsageEXT asSlice(long index) { return new VkMicromapUsageEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkMicromapUsageEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMicromapUsageEXT`
    public VkMicromapUsageEXT asSlice(long index, long count) { return new VkMicromapUsageEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkMicromapUsageEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkMicromapUsageEXT at(long index, Consumer<VkMicromapUsageEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `count` at the given index}
    /// @param index the index of the struct buffer
    public int countAt(long index) { return count(this.segment(), index); }
    /// Sets `count` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMicromapUsageEXT countAt(long index, int value) { count(this.segment(), index, value); return this; }

    /// {@return `subdivisionLevel` at the given index}
    /// @param index the index of the struct buffer
    public int subdivisionLevelAt(long index) { return subdivisionLevel(this.segment(), index); }
    /// Sets `subdivisionLevel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMicromapUsageEXT subdivisionLevelAt(long index, int value) { subdivisionLevel(this.segment(), index, value); return this; }

    /// {@return `format` at the given index}
    /// @param index the index of the struct buffer
    public int formatAt(long index) { return format(this.segment(), index); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMicromapUsageEXT formatAt(long index, int value) { format(this.segment(), index, value); return this; }

}
