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
/// struct VkAttachmentReference2 {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t attachment;
///     VkImageLayout layout;
///     VkImageAspectFlags aspectMask;
/// };
/// ```
public sealed class VkAttachmentReference2 extends GroupType {
    /// The struct layout of `VkAttachmentReference2`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachment"),
        ValueLayout.JAVA_INT.withName("layout"),
        ValueLayout.JAVA_INT.withName("aspectMask")
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
    /// The byte offset of `aspectMask`.
    public static final long OFFSET_aspectMask = LAYOUT.byteOffset(PathElement.groupElement("aspectMask"));
    /// The memory layout of `aspectMask`.
    public static final MemoryLayout LAYOUT_aspectMask = LAYOUT.select(PathElement.groupElement("aspectMask"));
    /// The [VarHandle] of `aspectMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectMask"));

    /// Creates `VkAttachmentReference2` with the given segment.
    /// @param segment the memory segment
    public VkAttachmentReference2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAttachmentReference2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAttachmentReference2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentReference2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentReference2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAttachmentReference2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAttachmentReference2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAttachmentReference2`
    public static VkAttachmentReference2 alloc(SegmentAllocator allocator) { return new VkAttachmentReference2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAttachmentReference2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAttachmentReference2`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAttachmentReference2 copyFrom(VkAttachmentReference2 src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkAttachmentReference2 sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkAttachmentReference2 pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkAttachmentReference2 attachment(int value) { attachment(this.segment(), 0L, value); return this; }

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
    public VkAttachmentReference2 layout(int value) { layout(this.segment(), 0L, value); return this; }

    /// {@return `aspectMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int aspectMask(MemorySegment segment, long index) { return (int) VH_aspectMask.get(segment, 0L, index); }
    /// {@return `aspectMask`}
    public int aspectMask() { return aspectMask(this.segment(), 0L); }
    /// Sets `aspectMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void aspectMask(MemorySegment segment, long index, int value) { VH_aspectMask.set(segment, 0L, index, value); }
    /// Sets `aspectMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentReference2 aspectMask(int value) { aspectMask(this.segment(), 0L, value); return this; }

    /// A buffer of [VkAttachmentReference2].
    public static final class Buffer extends VkAttachmentReference2 {
        private final long elementCount;

        /// Creates `VkAttachmentReference2.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAttachmentReference2`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAttachmentReference2`
        public VkAttachmentReference2 asSlice(long index) { return new VkAttachmentReference2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAttachmentReference2`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAttachmentReference2`
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

        /// {@return `aspectMask` at the given index}
        /// @param index the index of the struct buffer
        public int aspectMaskAt(long index) { return aspectMask(this.segment(), index); }
        /// Sets `aspectMask` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer aspectMaskAt(long index, int value) { aspectMask(this.segment(), index, value); return this; }

    }
}
