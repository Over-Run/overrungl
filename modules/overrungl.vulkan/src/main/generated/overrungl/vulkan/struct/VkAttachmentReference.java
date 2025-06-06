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
/// struct VkAttachmentReference {
///     uint32_t attachment;
///     (int) VkImageLayout layout;
/// };
/// ```
public sealed class VkAttachmentReference extends GroupType {
    /// The struct layout of `VkAttachmentReference`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("attachment"),
        ValueLayout.JAVA_INT.withName("layout")
    );
    /// The byte offset of `attachment`.
    public static final long OFFSET_attachment = LAYOUT.byteOffset(PathElement.groupElement("attachment"));
    /// The memory layout of `attachment`.
    public static final MemoryLayout LAYOUT_attachment = LAYOUT.select(PathElement.groupElement("attachment"));
    /// The [VarHandle] of `attachment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_attachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachment"));
    /// The byte offset of `layout`.
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    /// The memory layout of `layout`.
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));

    /// Creates `VkAttachmentReference` with the given segment.
    /// @param segment the memory segment
    public VkAttachmentReference(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAttachmentReference` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAttachmentReference` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentReference ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentReference(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkAttachmentReference` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAttachmentReference` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAttachmentReference`
    public static VkAttachmentReference alloc(SegmentAllocator allocator) { return new VkAttachmentReference(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAttachmentReference` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAttachmentReference`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAttachmentReference` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param attachment `attachment`
    /// @param layout `layout`
    /// @return the allocated `VkAttachmentReference`
    public static VkAttachmentReference allocInit(SegmentAllocator allocator, int attachment, int layout) {
        return alloc(allocator).attachment(attachment).layout(layout);
    }

    /// Allocates a `VkAttachmentReference` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param attachment `attachment`
    /// @return the allocated `VkAttachmentReference`
    public static VkAttachmentReference allocInit(SegmentAllocator allocator, int attachment) {
        return alloc(allocator).attachment(attachment);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAttachmentReference copyFrom(VkAttachmentReference src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `attachment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int attachment(MemorySegment segment, long index) { return (int) VH_attachment.get(segment, 0L, index); }
    /// {@return `attachment`}
    public int attachment() { return attachment(this.segment(), 0L); }
    /// Sets `attachment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void attachment(MemorySegment segment, long index, int value) { VH_attachment.set(segment, 0L, index, value); }
    /// Sets `attachment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentReference attachment(int value) { attachment(this.segment(), 0L, value); return this; }

    /// {@return `layout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int layout(MemorySegment segment, long index) { return (int) VH_layout.get(segment, 0L, index); }
    /// {@return `layout`}
    public int layout() { return layout(this.segment(), 0L); }
    /// Sets `layout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layout(MemorySegment segment, long index, int value) { VH_layout.set(segment, 0L, index, value); }
    /// Sets `layout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentReference layout(int value) { layout(this.segment(), 0L, value); return this; }

    /// A buffer of [VkAttachmentReference].
    public static final class Buffer extends VkAttachmentReference {
        private final long elementCount;

        /// Creates `VkAttachmentReference.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAttachmentReference`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAttachmentReference`
        public VkAttachmentReference asSlice(long index) { return new VkAttachmentReference(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAttachmentReference`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAttachmentReference`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `attachment` at the given index}
        /// @param index the index of the struct buffer
        public int attachmentAt(long index) { return attachment(this.segment(), index); }
        /// Sets `attachment` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer attachmentAt(long index, int value) { attachment(this.segment(), index, value); return this; }

        /// {@return `layout` at the given index}
        /// @param index the index of the struct buffer
        public int layoutAt(long index) { return layout(this.segment(), index); }
        /// Sets `layout` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer layoutAt(long index, int value) { layout(this.segment(), index, value); return this; }

    }
}
