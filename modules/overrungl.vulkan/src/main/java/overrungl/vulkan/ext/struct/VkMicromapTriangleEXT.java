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
/// ### dataOffset
/// [VarHandle][#VH_dataOffset] - [Getter][#dataOffset()] - [Setter][#dataOffset(int)]
/// ### subdivisionLevel
/// [VarHandle][#VH_subdivisionLevel] - [Getter][#subdivisionLevel()] - [Setter][#subdivisionLevel(short)]
/// ### format
/// [VarHandle][#VH_format] - [Getter][#format()] - [Setter][#format(short)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMicromapTriangleEXT {
///     uint32_t dataOffset;
///     uint16_t subdivisionLevel;
///     uint16_t format;
/// } VkMicromapTriangleEXT;
/// ```
public sealed class VkMicromapTriangleEXT extends Struct {
    /// The struct layout of `VkMicromapTriangleEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("dataOffset"),
        ValueLayout.JAVA_SHORT.withName("subdivisionLevel"),
        ValueLayout.JAVA_SHORT.withName("format")
    );
    /// The [VarHandle] of `dataOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dataOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataOffset"));
    /// The [VarHandle] of `subdivisionLevel` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_subdivisionLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subdivisionLevel"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)short`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));

    /// Creates `VkMicromapTriangleEXT` with the given segment.
    /// @param segment the memory segment
    public VkMicromapTriangleEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMicromapTriangleEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapTriangleEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMicromapTriangleEXT(segment); }

    /// Creates `VkMicromapTriangleEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMicromapTriangleEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapTriangleEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMicromapTriangleEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMicromapTriangleEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkMicromapTriangleEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMicromapTriangleEXT`
    public static VkMicromapTriangleEXT alloc(SegmentAllocator allocator) { return new VkMicromapTriangleEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMicromapTriangleEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMicromapTriangleEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkMicromapTriangleEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMicromapTriangleEXT`
    public static VkMicromapTriangleEXT allocInit(SegmentAllocator allocator, @CType("uint32_t") int dataOffset, @CType("uint16_t") short subdivisionLevel, @CType("uint16_t") short format) { return alloc(allocator).dataOffset(dataOffset).subdivisionLevel(subdivisionLevel).format(format); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMicromapTriangleEXT copyFrom(VkMicromapTriangleEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `dataOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_dataOffset(MemorySegment segment, long index) { return (int) VH_dataOffset.get(segment, 0L, index); }
    /// {@return `dataOffset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_dataOffset(MemorySegment segment) { return VkMicromapTriangleEXT.get_dataOffset(segment, 0L); }
    /// {@return `dataOffset`}
    public @CType("uint32_t") int dataOffset() { return VkMicromapTriangleEXT.get_dataOffset(this.segment()); }
    /// Sets `dataOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dataOffset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_dataOffset.set(segment, 0L, index, value); }
    /// Sets `dataOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dataOffset(MemorySegment segment, @CType("uint32_t") int value) { VkMicromapTriangleEXT.set_dataOffset(segment, 0L, value); }
    /// Sets `dataOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapTriangleEXT dataOffset(@CType("uint32_t") int value) { VkMicromapTriangleEXT.set_dataOffset(this.segment(), value); return this; }

    /// {@return `subdivisionLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_subdivisionLevel(MemorySegment segment, long index) { return (short) VH_subdivisionLevel.get(segment, 0L, index); }
    /// {@return `subdivisionLevel`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_subdivisionLevel(MemorySegment segment) { return VkMicromapTriangleEXT.get_subdivisionLevel(segment, 0L); }
    /// {@return `subdivisionLevel`}
    public @CType("uint16_t") short subdivisionLevel() { return VkMicromapTriangleEXT.get_subdivisionLevel(this.segment()); }
    /// Sets `subdivisionLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subdivisionLevel(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_subdivisionLevel.set(segment, 0L, index, value); }
    /// Sets `subdivisionLevel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subdivisionLevel(MemorySegment segment, @CType("uint16_t") short value) { VkMicromapTriangleEXT.set_subdivisionLevel(segment, 0L, value); }
    /// Sets `subdivisionLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapTriangleEXT subdivisionLevel(@CType("uint16_t") short value) { VkMicromapTriangleEXT.set_subdivisionLevel(this.segment(), value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint16_t") short get_format(MemorySegment segment, long index) { return (short) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    /// @param segment the segment of the struct
    public static @CType("uint16_t") short get_format(MemorySegment segment) { return VkMicromapTriangleEXT.get_format(segment, 0L); }
    /// {@return `format`}
    public @CType("uint16_t") short format() { return VkMicromapTriangleEXT.get_format(this.segment()); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_format(MemorySegment segment, long index, @CType("uint16_t") short value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_format(MemorySegment segment, @CType("uint16_t") short value) { VkMicromapTriangleEXT.set_format(segment, 0L, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapTriangleEXT format(@CType("uint16_t") short value) { VkMicromapTriangleEXT.set_format(this.segment(), value); return this; }

    /// A buffer of [VkMicromapTriangleEXT].
    public static final class Buffer extends VkMicromapTriangleEXT {
        private final long elementCount;

        /// Creates `VkMicromapTriangleEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkMicromapTriangleEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkMicromapTriangleEXT`
        public VkMicromapTriangleEXT asSlice(long index) { return new VkMicromapTriangleEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkMicromapTriangleEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkMicromapTriangleEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `dataOffset` at the given index}
        /// @param index the index
        public @CType("uint32_t") int dataOffsetAt(long index) { return VkMicromapTriangleEXT.get_dataOffset(this.segment(), index); }
        /// Sets `dataOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dataOffsetAt(long index, @CType("uint32_t") int value) { VkMicromapTriangleEXT.set_dataOffset(this.segment(), index, value); return this; }

        /// {@return `subdivisionLevel` at the given index}
        /// @param index the index
        public @CType("uint16_t") short subdivisionLevelAt(long index) { return VkMicromapTriangleEXT.get_subdivisionLevel(this.segment(), index); }
        /// Sets `subdivisionLevel` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer subdivisionLevelAt(long index, @CType("uint16_t") short value) { VkMicromapTriangleEXT.set_subdivisionLevel(this.segment(), index, value); return this; }

        /// {@return `format` at the given index}
        /// @param index the index
        public @CType("uint16_t") short formatAt(long index) { return VkMicromapTriangleEXT.get_format(this.segment(), index); }
        /// Sets `format` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer formatAt(long index, @CType("uint16_t") short value) { VkMicromapTriangleEXT.set_format(this.segment(), index, value); return this; }

    }
}
