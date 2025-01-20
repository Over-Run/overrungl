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
import static overrungl.vulkan.VK10.*;

/// ## Members
/// ### subpassMergeStatus
/// [VarHandle][#VH_subpassMergeStatus] - [Getter][#subpassMergeStatus()] - [Setter][#subpassMergeStatus(int)]
/// ### description
/// [Byte offset][#OFFSET_description] - [Memory layout][#ML_description] - [Getter][#description()] - [Setter][#description(MemorySegment)]
/// ### postMergeIndex
/// [VarHandle][#VH_postMergeIndex] - [Getter][#postMergeIndex()] - [Setter][#postMergeIndex(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRenderPassSubpassFeedbackInfoEXT {
///     VkSubpassMergeStatusEXT subpassMergeStatus;
///     char[VK_MAX_DESCRIPTION_SIZE] description;
///     uint32_t postMergeIndex;
/// } VkRenderPassSubpassFeedbackInfoEXT;
/// ```
public sealed class VkRenderPassSubpassFeedbackInfoEXT extends Struct {
    /// The struct layout of `VkRenderPassSubpassFeedbackInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("subpassMergeStatus"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.JAVA_INT.withName("postMergeIndex")
    );
    /// The [VarHandle] of `subpassMergeStatus` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subpassMergeStatus = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpassMergeStatus"));
    /// The byte offset of `description`.
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
    /// The memory layout of `description`.
    public static final MemoryLayout ML_description = LAYOUT.select(PathElement.groupElement("description"));
    /// The [VarHandle] of `postMergeIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_postMergeIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("postMergeIndex"));

    /// Creates `VkRenderPassSubpassFeedbackInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkRenderPassSubpassFeedbackInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderPassSubpassFeedbackInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassSubpassFeedbackInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassSubpassFeedbackInfoEXT(segment); }

    /// Creates `VkRenderPassSubpassFeedbackInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderPassSubpassFeedbackInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassSubpassFeedbackInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassSubpassFeedbackInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderPassSubpassFeedbackInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkRenderPassSubpassFeedbackInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassSubpassFeedbackInfoEXT`
    public static VkRenderPassSubpassFeedbackInfoEXT alloc(SegmentAllocator allocator) { return new VkRenderPassSubpassFeedbackInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderPassSubpassFeedbackInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassSubpassFeedbackInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkRenderPassSubpassFeedbackInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassSubpassFeedbackInfoEXT`
    public static VkRenderPassSubpassFeedbackInfoEXT allocInit(SegmentAllocator allocator, @CType("VkSubpassMergeStatusEXT") int subpassMergeStatus, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment description, @CType("uint32_t") int postMergeIndex) { return alloc(allocator).subpassMergeStatus(subpassMergeStatus).description(description).postMergeIndex(postMergeIndex); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderPassSubpassFeedbackInfoEXT copyFrom(VkRenderPassSubpassFeedbackInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `subpassMergeStatus` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSubpassMergeStatusEXT") int get_subpassMergeStatus(MemorySegment segment, long index) { return (int) VH_subpassMergeStatus.get(segment, 0L, index); }
    /// {@return `subpassMergeStatus`}
    /// @param segment the segment of the struct
    public static @CType("VkSubpassMergeStatusEXT") int get_subpassMergeStatus(MemorySegment segment) { return VkRenderPassSubpassFeedbackInfoEXT.get_subpassMergeStatus(segment, 0L); }
    /// {@return `subpassMergeStatus`}
    public @CType("VkSubpassMergeStatusEXT") int subpassMergeStatus() { return VkRenderPassSubpassFeedbackInfoEXT.get_subpassMergeStatus(this.segment()); }
    /// Sets `subpassMergeStatus` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subpassMergeStatus(MemorySegment segment, long index, @CType("VkSubpassMergeStatusEXT") int value) { VH_subpassMergeStatus.set(segment, 0L, index, value); }
    /// Sets `subpassMergeStatus` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subpassMergeStatus(MemorySegment segment, @CType("VkSubpassMergeStatusEXT") int value) { VkRenderPassSubpassFeedbackInfoEXT.set_subpassMergeStatus(segment, 0L, value); }
    /// Sets `subpassMergeStatus` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassSubpassFeedbackInfoEXT subpassMergeStatus(@CType("VkSubpassMergeStatusEXT") int value) { VkRenderPassSubpassFeedbackInfoEXT.set_subpassMergeStatus(this.segment(), value); return this; }

    /// {@return `description` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment get_description(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_description, index), ML_description); }
    /// {@return `description`}
    /// @param segment the segment of the struct
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment get_description(MemorySegment segment) { return VkRenderPassSubpassFeedbackInfoEXT.get_description(segment, 0L); }
    /// {@return `description`}
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment description() { return VkRenderPassSubpassFeedbackInfoEXT.get_description(this.segment()); }
    /// Sets `description` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_description(MemorySegment segment, long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_description, index), ML_description.byteSize()); }
    /// Sets `description` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_description(MemorySegment segment, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { VkRenderPassSubpassFeedbackInfoEXT.set_description(segment, 0L, value); }
    /// Sets `description` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassSubpassFeedbackInfoEXT description(@CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { VkRenderPassSubpassFeedbackInfoEXT.set_description(this.segment(), value); return this; }

    /// {@return `postMergeIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_postMergeIndex(MemorySegment segment, long index) { return (int) VH_postMergeIndex.get(segment, 0L, index); }
    /// {@return `postMergeIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_postMergeIndex(MemorySegment segment) { return VkRenderPassSubpassFeedbackInfoEXT.get_postMergeIndex(segment, 0L); }
    /// {@return `postMergeIndex`}
    public @CType("uint32_t") int postMergeIndex() { return VkRenderPassSubpassFeedbackInfoEXT.get_postMergeIndex(this.segment()); }
    /// Sets `postMergeIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_postMergeIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_postMergeIndex.set(segment, 0L, index, value); }
    /// Sets `postMergeIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_postMergeIndex(MemorySegment segment, @CType("uint32_t") int value) { VkRenderPassSubpassFeedbackInfoEXT.set_postMergeIndex(segment, 0L, value); }
    /// Sets `postMergeIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassSubpassFeedbackInfoEXT postMergeIndex(@CType("uint32_t") int value) { VkRenderPassSubpassFeedbackInfoEXT.set_postMergeIndex(this.segment(), value); return this; }

    /// A buffer of [VkRenderPassSubpassFeedbackInfoEXT].
    public static final class Buffer extends VkRenderPassSubpassFeedbackInfoEXT {
        private final long elementCount;

        /// Creates `VkRenderPassSubpassFeedbackInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkRenderPassSubpassFeedbackInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkRenderPassSubpassFeedbackInfoEXT`
        public VkRenderPassSubpassFeedbackInfoEXT asSlice(long index) { return new VkRenderPassSubpassFeedbackInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkRenderPassSubpassFeedbackInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkRenderPassSubpassFeedbackInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `subpassMergeStatus` at the given index}
        /// @param index the index
        public @CType("VkSubpassMergeStatusEXT") int subpassMergeStatusAt(long index) { return VkRenderPassSubpassFeedbackInfoEXT.get_subpassMergeStatus(this.segment(), index); }
        /// Sets `subpassMergeStatus` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer subpassMergeStatusAt(long index, @CType("VkSubpassMergeStatusEXT") int value) { VkRenderPassSubpassFeedbackInfoEXT.set_subpassMergeStatus(this.segment(), index, value); return this; }

        /// {@return `description` at the given index}
        /// @param index the index
        public @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment descriptionAt(long index) { return VkRenderPassSubpassFeedbackInfoEXT.get_description(this.segment(), index); }
        /// Sets `description` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptionAt(long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { VkRenderPassSubpassFeedbackInfoEXT.set_description(this.segment(), index, value); return this; }

        /// {@return `postMergeIndex` at the given index}
        /// @param index the index
        public @CType("uint32_t") int postMergeIndexAt(long index) { return VkRenderPassSubpassFeedbackInfoEXT.get_postMergeIndex(this.segment(), index); }
        /// Sets `postMergeIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer postMergeIndexAt(long index, @CType("uint32_t") int value) { VkRenderPassSubpassFeedbackInfoEXT.set_postMergeIndex(this.segment(), index, value); return this; }

    }
}
