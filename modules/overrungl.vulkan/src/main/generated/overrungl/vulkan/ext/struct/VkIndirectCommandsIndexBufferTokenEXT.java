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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkIndirectCommandsIndexBufferTokenEXT {
///     (int) VkIndirectCommandsInputModeFlagBitsEXT mode;
/// };
/// ```
public sealed class VkIndirectCommandsIndexBufferTokenEXT extends GroupType {
    /// The struct layout of `VkIndirectCommandsIndexBufferTokenEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("mode")
    );
    /// The byte offset of `mode`.
    public static final long OFFSET_mode = LAYOUT.byteOffset(PathElement.groupElement("mode"));
    /// The memory layout of `mode`.
    public static final MemoryLayout LAYOUT_mode = LAYOUT.select(PathElement.groupElement("mode"));
    /// The [VarHandle] of `mode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));

    /// Creates `VkIndirectCommandsIndexBufferTokenEXT` with the given segment.
    /// @param segment the memory segment
    public VkIndirectCommandsIndexBufferTokenEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkIndirectCommandsIndexBufferTokenEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkIndirectCommandsIndexBufferTokenEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsIndexBufferTokenEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsIndexBufferTokenEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkIndirectCommandsIndexBufferTokenEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkIndirectCommandsIndexBufferTokenEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsIndexBufferTokenEXT`
    public static VkIndirectCommandsIndexBufferTokenEXT alloc(SegmentAllocator allocator) { return new VkIndirectCommandsIndexBufferTokenEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkIndirectCommandsIndexBufferTokenEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectCommandsIndexBufferTokenEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkIndirectCommandsIndexBufferTokenEXT copyFrom(VkIndirectCommandsIndexBufferTokenEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `mode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int mode(MemorySegment segment, long index) { return (int) VH_mode.get(segment, 0L, index); }
    /// {@return `mode`}
    public int mode() { return mode(this.segment(), 0L); }
    /// Sets `mode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mode(MemorySegment segment, long index, int value) { VH_mode.set(segment, 0L, index, value); }
    /// Sets `mode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsIndexBufferTokenEXT mode(int value) { mode(this.segment(), 0L, value); return this; }

    /// A buffer of [VkIndirectCommandsIndexBufferTokenEXT].
    public static final class Buffer extends VkIndirectCommandsIndexBufferTokenEXT {
        private final long elementCount;

        /// Creates `VkIndirectCommandsIndexBufferTokenEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkIndirectCommandsIndexBufferTokenEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkIndirectCommandsIndexBufferTokenEXT`
        public VkIndirectCommandsIndexBufferTokenEXT asSlice(long index) { return new VkIndirectCommandsIndexBufferTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkIndirectCommandsIndexBufferTokenEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkIndirectCommandsIndexBufferTokenEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `mode` at the given index}
        /// @param index the index of the struct buffer
        public int modeAt(long index) { return mode(this.segment(), index); }
        /// Sets `mode` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer modeAt(long index, int value) { mode(this.segment(), index, value); return this; }

    }
}
