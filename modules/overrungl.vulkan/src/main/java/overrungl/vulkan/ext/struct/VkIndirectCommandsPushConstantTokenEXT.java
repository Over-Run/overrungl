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
/// ### updateRange
/// [Byte offset][#OFFSET_updateRange] - [Memory layout][#ML_updateRange] - [Getter][#updateRange()] - [Setter][#updateRange(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkIndirectCommandsPushConstantTokenEXT {
///     VkPushConstantRange updateRange;
/// } VkIndirectCommandsPushConstantTokenEXT;
/// ```
public sealed class VkIndirectCommandsPushConstantTokenEXT extends Struct {
    /// The struct layout of `VkIndirectCommandsPushConstantTokenEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkPushConstantRange.LAYOUT.withName("updateRange")
    );
    /// The byte offset of `updateRange`.
    public static final long OFFSET_updateRange = LAYOUT.byteOffset(PathElement.groupElement("updateRange"));
    /// The memory layout of `updateRange`.
    public static final MemoryLayout ML_updateRange = LAYOUT.select(PathElement.groupElement("updateRange"));

    /// Creates `VkIndirectCommandsPushConstantTokenEXT` with the given segment.
    /// @param segment the memory segment
    public VkIndirectCommandsPushConstantTokenEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkIndirectCommandsPushConstantTokenEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsPushConstantTokenEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsPushConstantTokenEXT(segment); }

    /// Creates `VkIndirectCommandsPushConstantTokenEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkIndirectCommandsPushConstantTokenEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsPushConstantTokenEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsPushConstantTokenEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkIndirectCommandsPushConstantTokenEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkIndirectCommandsPushConstantTokenEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsPushConstantTokenEXT`
    public static VkIndirectCommandsPushConstantTokenEXT alloc(SegmentAllocator allocator) { return new VkIndirectCommandsPushConstantTokenEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkIndirectCommandsPushConstantTokenEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectCommandsPushConstantTokenEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkIndirectCommandsPushConstantTokenEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsPushConstantTokenEXT`
    public static VkIndirectCommandsPushConstantTokenEXT allocInit(SegmentAllocator allocator, @CType("VkPushConstantRange") MemorySegment updateRange) { return alloc(allocator).updateRange(updateRange); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkIndirectCommandsPushConstantTokenEXT copyFrom(VkIndirectCommandsPushConstantTokenEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `updateRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPushConstantRange") MemorySegment get_updateRange(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_updateRange, index), ML_updateRange); }
    /// {@return `updateRange`}
    /// @param segment the segment of the struct
    public static @CType("VkPushConstantRange") MemorySegment get_updateRange(MemorySegment segment) { return VkIndirectCommandsPushConstantTokenEXT.get_updateRange(segment, 0L); }
    /// {@return `updateRange`}
    public @CType("VkPushConstantRange") MemorySegment updateRange() { return VkIndirectCommandsPushConstantTokenEXT.get_updateRange(this.segment()); }
    /// Sets `updateRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_updateRange(MemorySegment segment, long index, @CType("VkPushConstantRange") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_updateRange, index), ML_updateRange.byteSize()); }
    /// Sets `updateRange` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_updateRange(MemorySegment segment, @CType("VkPushConstantRange") MemorySegment value) { VkIndirectCommandsPushConstantTokenEXT.set_updateRange(segment, 0L, value); }
    /// Sets `updateRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsPushConstantTokenEXT updateRange(@CType("VkPushConstantRange") MemorySegment value) { VkIndirectCommandsPushConstantTokenEXT.set_updateRange(this.segment(), value); return this; }

    /// A buffer of [VkIndirectCommandsPushConstantTokenEXT].
    public static final class Buffer extends VkIndirectCommandsPushConstantTokenEXT {
        private final long elementCount;

        /// Creates `VkIndirectCommandsPushConstantTokenEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkIndirectCommandsPushConstantTokenEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkIndirectCommandsPushConstantTokenEXT`
        public VkIndirectCommandsPushConstantTokenEXT asSlice(long index) { return new VkIndirectCommandsPushConstantTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkIndirectCommandsPushConstantTokenEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkIndirectCommandsPushConstantTokenEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `updateRange` at the given index}
        /// @param index the index
        public @CType("VkPushConstantRange") MemorySegment updateRangeAt(long index) { return VkIndirectCommandsPushConstantTokenEXT.get_updateRange(this.segment(), index); }
        /// Sets `updateRange` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer updateRangeAt(long index, @CType("VkPushConstantRange") MemorySegment value) { VkIndirectCommandsPushConstantTokenEXT.set_updateRange(this.segment(), index, value); return this; }

    }
}
