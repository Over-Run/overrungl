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
/// struct VkRenderPassSubpassFeedbackInfoEXT {
///     (int) VkSubpassMergeStatusEXT subpassMergeStatus;
///     char description[256];
///     uint32_t postMergeIndex;
/// };
/// ```
public final class VkRenderPassSubpassFeedbackInfoEXT extends GroupType {
    /// The struct layout of `VkRenderPassSubpassFeedbackInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("subpassMergeStatus"),
        MemoryLayout.sequenceLayout(256, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.JAVA_INT.withName("postMergeIndex")
    );
    /// The byte offset of `subpassMergeStatus`.
    public static final long OFFSET_subpassMergeStatus = LAYOUT.byteOffset(PathElement.groupElement("subpassMergeStatus"));
    /// The memory layout of `subpassMergeStatus`.
    public static final MemoryLayout LAYOUT_subpassMergeStatus = LAYOUT.select(PathElement.groupElement("subpassMergeStatus"));
    /// The [VarHandle] of `subpassMergeStatus` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subpassMergeStatus = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpassMergeStatus"));
    /// The byte offset of `description`.
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
    /// The memory layout of `description`.
    public static final MemoryLayout LAYOUT_description = LAYOUT.select(PathElement.groupElement("description"));
    /// The [VarHandle] of `description` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_description = LAYOUT.arrayElementVarHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
    /// The byte offset of `postMergeIndex`.
    public static final long OFFSET_postMergeIndex = LAYOUT.byteOffset(PathElement.groupElement("postMergeIndex"));
    /// The memory layout of `postMergeIndex`.
    public static final MemoryLayout LAYOUT_postMergeIndex = LAYOUT.select(PathElement.groupElement("postMergeIndex"));
    /// The [VarHandle] of `postMergeIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_postMergeIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("postMergeIndex"));

    /// Creates `VkRenderPassSubpassFeedbackInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkRenderPassSubpassFeedbackInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkRenderPassSubpassFeedbackInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassSubpassFeedbackInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassSubpassFeedbackInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderPassSubpassFeedbackInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassSubpassFeedbackInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassSubpassFeedbackInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkRenderPassSubpassFeedbackInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassSubpassFeedbackInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassSubpassFeedbackInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRenderPassSubpassFeedbackInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassSubpassFeedbackInfoEXT`
    public static VkRenderPassSubpassFeedbackInfoEXT alloc(SegmentAllocator allocator) { return new VkRenderPassSubpassFeedbackInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkRenderPassSubpassFeedbackInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassSubpassFeedbackInfoEXT`
    public static VkRenderPassSubpassFeedbackInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkRenderPassSubpassFeedbackInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkRenderPassSubpassFeedbackInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param subpassMergeStatus `subpassMergeStatus`
    /// @param description `description`
    /// @param postMergeIndex `postMergeIndex`
    /// @return the allocated `VkRenderPassSubpassFeedbackInfoEXT`
    public static VkRenderPassSubpassFeedbackInfoEXT allocInit(SegmentAllocator allocator, int subpassMergeStatus, MemorySegment description, int postMergeIndex) {
        return alloc(allocator).subpassMergeStatus(subpassMergeStatus).description(description).postMergeIndex(postMergeIndex);
    }

    /// Allocates a `VkRenderPassSubpassFeedbackInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param subpassMergeStatus `subpassMergeStatus`
    /// @param description `description`
    /// @return the allocated `VkRenderPassSubpassFeedbackInfoEXT`
    public static VkRenderPassSubpassFeedbackInfoEXT allocInit(SegmentAllocator allocator, int subpassMergeStatus, MemorySegment description) {
        return alloc(allocator).subpassMergeStatus(subpassMergeStatus).description(description);
    }

    /// Allocates a `VkRenderPassSubpassFeedbackInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param subpassMergeStatus `subpassMergeStatus`
    /// @return the allocated `VkRenderPassSubpassFeedbackInfoEXT`
    public static VkRenderPassSubpassFeedbackInfoEXT allocInit(SegmentAllocator allocator, int subpassMergeStatus) {
        return alloc(allocator).subpassMergeStatus(subpassMergeStatus);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderPassSubpassFeedbackInfoEXT copyFrom(VkRenderPassSubpassFeedbackInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkRenderPassSubpassFeedbackInfoEXT reinterpret(long count) { return new VkRenderPassSubpassFeedbackInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `subpassMergeStatus` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subpassMergeStatus(MemorySegment segment, long index) { return (int) VH_subpassMergeStatus.get(segment, 0L, index); }
    /// {@return `subpassMergeStatus`}
    public int subpassMergeStatus() { return subpassMergeStatus(this.segment(), 0L); }
    /// Sets `subpassMergeStatus` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subpassMergeStatus(MemorySegment segment, long index, int value) { VH_subpassMergeStatus.set(segment, 0L, index, value); }
    /// Sets `subpassMergeStatus` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassSubpassFeedbackInfoEXT subpassMergeStatus(int value) { subpassMergeStatus(this.segment(), 0L, value); return this; }

    /// {@return `description` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment description(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_description, index), LAYOUT_description); }
    /// {@return `description` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte description(MemorySegment segment, long index, long index0) { return (byte) VH_description.get(segment, 0L, index, index0); }
    /// {@return `description`}
    public MemorySegment description() { return description(this.segment(), 0L); }
    /// {@return `description`}
    /// @param index0 the Index 0 of the array
    public byte description(long index0) { return description(this.segment(), 0L, index0); }
    /// Sets `description` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void description(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_description, index), LAYOUT_description.byteSize()); }
    /// Sets `description` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void description(MemorySegment segment, long index, long index0, byte value) { VH_description.set(segment, 0L, index, index0, value); }
    /// Sets `description` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassSubpassFeedbackInfoEXT description(MemorySegment value) { description(this.segment(), 0L, value); return this; }
    /// Sets `description` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkRenderPassSubpassFeedbackInfoEXT description(long index0, byte value) { description(this.segment(), 0L, index0, value); return this; }

    /// {@return `postMergeIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int postMergeIndex(MemorySegment segment, long index) { return (int) VH_postMergeIndex.get(segment, 0L, index); }
    /// {@return `postMergeIndex`}
    public int postMergeIndex() { return postMergeIndex(this.segment(), 0L); }
    /// Sets `postMergeIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void postMergeIndex(MemorySegment segment, long index, int value) { VH_postMergeIndex.set(segment, 0L, index, value); }
    /// Sets `postMergeIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassSubpassFeedbackInfoEXT postMergeIndex(int value) { postMergeIndex(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkRenderPassSubpassFeedbackInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRenderPassSubpassFeedbackInfoEXT`
    public VkRenderPassSubpassFeedbackInfoEXT asSlice(long index) { return new VkRenderPassSubpassFeedbackInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkRenderPassSubpassFeedbackInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRenderPassSubpassFeedbackInfoEXT`
    public VkRenderPassSubpassFeedbackInfoEXT asSlice(long index, long count) { return new VkRenderPassSubpassFeedbackInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkRenderPassSubpassFeedbackInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkRenderPassSubpassFeedbackInfoEXT at(long index, Consumer<VkRenderPassSubpassFeedbackInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `subpassMergeStatus` at the given index}
    /// @param index the index of the struct buffer
    public int subpassMergeStatusAt(long index) { return subpassMergeStatus(this.segment(), index); }
    /// Sets `subpassMergeStatus` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassSubpassFeedbackInfoEXT subpassMergeStatusAt(long index, int value) { subpassMergeStatus(this.segment(), index, value); return this; }

    /// {@return `description` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment descriptionAt(long index) { return description(this.segment(), index); }
    /// {@return `description` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte descriptionAt(long index, long index0) { return description(this.segment(), index, index0); }
    /// Sets `description` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassSubpassFeedbackInfoEXT descriptionAt(long index, MemorySegment value) { description(this.segment(), index, value); return this; }
    /// Sets `description` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkRenderPassSubpassFeedbackInfoEXT descriptionAt(long index, long index0, byte value) { description(this.segment(), index, index0, value); return this; }

    /// {@return `postMergeIndex` at the given index}
    /// @param index the index of the struct buffer
    public int postMergeIndexAt(long index) { return postMergeIndex(this.segment(), index); }
    /// Sets `postMergeIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassSubpassFeedbackInfoEXT postMergeIndexAt(long index, int value) { postMergeIndex(this.segment(), index, value); return this; }

}
