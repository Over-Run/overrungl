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
/// struct VkRenderPassCreationFeedbackInfoEXT {
///     uint32_t postMergeSubpassCount;
/// };
/// ```
public sealed class VkRenderPassCreationFeedbackInfoEXT extends GroupType {
    /// The struct layout of `VkRenderPassCreationFeedbackInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("postMergeSubpassCount")
    );
    /// The byte offset of `postMergeSubpassCount`.
    public static final long OFFSET_postMergeSubpassCount = LAYOUT.byteOffset(PathElement.groupElement("postMergeSubpassCount"));
    /// The memory layout of `postMergeSubpassCount`.
    public static final MemoryLayout LAYOUT_postMergeSubpassCount = LAYOUT.select(PathElement.groupElement("postMergeSubpassCount"));
    /// The [VarHandle] of `postMergeSubpassCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_postMergeSubpassCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("postMergeSubpassCount"));

    /// Creates `VkRenderPassCreationFeedbackInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkRenderPassCreationFeedbackInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderPassCreationFeedbackInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderPassCreationFeedbackInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassCreationFeedbackInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassCreationFeedbackInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderPassCreationFeedbackInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkRenderPassCreationFeedbackInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassCreationFeedbackInfoEXT`
    public static VkRenderPassCreationFeedbackInfoEXT alloc(SegmentAllocator allocator) { return new VkRenderPassCreationFeedbackInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderPassCreationFeedbackInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassCreationFeedbackInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderPassCreationFeedbackInfoEXT copyFrom(VkRenderPassCreationFeedbackInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `postMergeSubpassCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int postMergeSubpassCount(MemorySegment segment, long index) { return (int) VH_postMergeSubpassCount.get(segment, 0L, index); }
    /// {@return `postMergeSubpassCount`}
    public int postMergeSubpassCount() { return postMergeSubpassCount(this.segment(), 0L); }
    /// Sets `postMergeSubpassCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void postMergeSubpassCount(MemorySegment segment, long index, int value) { VH_postMergeSubpassCount.set(segment, 0L, index, value); }
    /// Sets `postMergeSubpassCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreationFeedbackInfoEXT postMergeSubpassCount(int value) { postMergeSubpassCount(this.segment(), 0L, value); return this; }

    /// A buffer of [VkRenderPassCreationFeedbackInfoEXT].
    public static final class Buffer extends VkRenderPassCreationFeedbackInfoEXT {
        private final long elementCount;

        /// Creates `VkRenderPassCreationFeedbackInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkRenderPassCreationFeedbackInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkRenderPassCreationFeedbackInfoEXT`
        public VkRenderPassCreationFeedbackInfoEXT asSlice(long index) { return new VkRenderPassCreationFeedbackInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkRenderPassCreationFeedbackInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkRenderPassCreationFeedbackInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `postMergeSubpassCount` at the given index}
        /// @param index the index of the struct buffer
        public int postMergeSubpassCountAt(long index) { return postMergeSubpassCount(this.segment(), index); }
        /// Sets `postMergeSubpassCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer postMergeSubpassCountAt(long index, int value) { postMergeSubpassCount(this.segment(), index, value); return this; }

    }
}
