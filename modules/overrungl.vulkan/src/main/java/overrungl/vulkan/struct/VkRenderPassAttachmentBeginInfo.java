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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkRenderPassAttachmentBeginInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t attachmentCount;
///     const VkImageView* pAttachments;
/// };
/// ```
public sealed class VkRenderPassAttachmentBeginInfo extends GroupType {
    /// The struct layout of `VkRenderPassAttachmentBeginInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentCount"),
        ValueLayout.ADDRESS.withName("pAttachments")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `attachmentCount`.
    public static final long OFFSET_attachmentCount = LAYOUT.byteOffset(PathElement.groupElement("attachmentCount"));
    /// The memory layout of `attachmentCount`.
    public static final MemoryLayout LAYOUT_attachmentCount = LAYOUT.select(PathElement.groupElement("attachmentCount"));
    /// The [VarHandle] of `attachmentCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_attachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentCount"));
    /// The byte offset of `pAttachments`.
    public static final long OFFSET_pAttachments = LAYOUT.byteOffset(PathElement.groupElement("pAttachments"));
    /// The memory layout of `pAttachments`.
    public static final MemoryLayout LAYOUT_pAttachments = LAYOUT.select(PathElement.groupElement("pAttachments"));
    /// The [VarHandle] of `pAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttachments"));

    /// Creates `VkRenderPassAttachmentBeginInfo` with the given segment.
    /// @param segment the memory segment
    public VkRenderPassAttachmentBeginInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderPassAttachmentBeginInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderPassAttachmentBeginInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassAttachmentBeginInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassAttachmentBeginInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderPassAttachmentBeginInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkRenderPassAttachmentBeginInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassAttachmentBeginInfo`
    public static VkRenderPassAttachmentBeginInfo alloc(SegmentAllocator allocator) { return new VkRenderPassAttachmentBeginInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderPassAttachmentBeginInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassAttachmentBeginInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderPassAttachmentBeginInfo copyFrom(VkRenderPassAttachmentBeginInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassAttachmentBeginInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassAttachmentBeginInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `attachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int attachmentCount(MemorySegment segment, long index) { return (int) VH_attachmentCount.get(segment, 0L, index); }
    /// {@return `attachmentCount`}
    public int attachmentCount() { return attachmentCount(this.segment(), 0L); }
    /// Sets `attachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void attachmentCount(MemorySegment segment, long index, int value) { VH_attachmentCount.set(segment, 0L, index, value); }
    /// Sets `attachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassAttachmentBeginInfo attachmentCount(int value) { attachmentCount(this.segment(), 0L, value); return this; }

    /// {@return `pAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pAttachments(MemorySegment segment, long index) { return (MemorySegment) VH_pAttachments.get(segment, 0L, index); }
    /// {@return `pAttachments`}
    public MemorySegment pAttachments() { return pAttachments(this.segment(), 0L); }
    /// Sets `pAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pAttachments(MemorySegment segment, long index, MemorySegment value) { VH_pAttachments.set(segment, 0L, index, value); }
    /// Sets `pAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassAttachmentBeginInfo pAttachments(MemorySegment value) { pAttachments(this.segment(), 0L, value); return this; }

    /// A buffer of [VkRenderPassAttachmentBeginInfo].
    public static final class Buffer extends VkRenderPassAttachmentBeginInfo {
        private final long elementCount;

        /// Creates `VkRenderPassAttachmentBeginInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkRenderPassAttachmentBeginInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkRenderPassAttachmentBeginInfo`
        public VkRenderPassAttachmentBeginInfo asSlice(long index) { return new VkRenderPassAttachmentBeginInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkRenderPassAttachmentBeginInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkRenderPassAttachmentBeginInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `attachmentCount` at the given index}
        /// @param index the index of the struct buffer
        public int attachmentCountAt(long index) { return attachmentCount(this.segment(), index); }
        /// Sets `attachmentCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer attachmentCountAt(long index, int value) { attachmentCount(this.segment(), index, value); return this; }

        /// {@return `pAttachments` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pAttachmentsAt(long index) { return pAttachments(this.segment(), index); }
        /// Sets `pAttachments` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pAttachmentsAt(long index, MemorySegment value) { pAttachments(this.segment(), index, value); return this; }

    }
}
