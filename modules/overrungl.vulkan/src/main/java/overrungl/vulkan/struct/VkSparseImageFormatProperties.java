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
/// struct VkSparseImageFormatProperties {
///     ((uint32_t) VkFlags) VkImageAspectFlags aspectMask;
///     (struct VkExtent3D) VkExtent3D imageGranularity;
///     ((uint32_t) VkFlags) VkSparseImageFormatFlags flags;
/// };
/// ```
public sealed class VkSparseImageFormatProperties extends GroupType {
    /// The struct layout of `VkSparseImageFormatProperties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("imageGranularity"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    /// The byte offset of `aspectMask`.
    public static final long OFFSET_aspectMask = LAYOUT.byteOffset(PathElement.groupElement("aspectMask"));
    /// The memory layout of `aspectMask`.
    public static final MemoryLayout LAYOUT_aspectMask = LAYOUT.select(PathElement.groupElement("aspectMask"));
    /// The [VarHandle] of `aspectMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectMask"));
    /// The byte offset of `imageGranularity`.
    public static final long OFFSET_imageGranularity = LAYOUT.byteOffset(PathElement.groupElement("imageGranularity"));
    /// The memory layout of `imageGranularity`.
    public static final MemoryLayout LAYOUT_imageGranularity = LAYOUT.select(PathElement.groupElement("imageGranularity"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    /// Creates `VkSparseImageFormatProperties` with the given segment.
    /// @param segment the memory segment
    public VkSparseImageFormatProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSparseImageFormatProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSparseImageFormatProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageFormatProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageFormatProperties(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkSparseImageFormatProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSparseImageFormatProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSparseImageFormatProperties`
    public static VkSparseImageFormatProperties alloc(SegmentAllocator allocator) { return new VkSparseImageFormatProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSparseImageFormatProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSparseImageFormatProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSparseImageFormatProperties copyFrom(VkSparseImageFormatProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkSparseImageFormatProperties aspectMask(int value) { aspectMask(this.segment(), 0L, value); return this; }

    /// {@return `imageGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment imageGranularity(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageGranularity, index), LAYOUT_imageGranularity); }
    /// {@return `imageGranularity`}
    public MemorySegment imageGranularity() { return imageGranularity(this.segment(), 0L); }
    /// Sets `imageGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageGranularity(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageGranularity, index), LAYOUT_imageGranularity.byteSize()); }
    /// Sets `imageGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageFormatProperties imageGranularity(MemorySegment value) { imageGranularity(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageFormatProperties flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// A buffer of [VkSparseImageFormatProperties].
    public static final class Buffer extends VkSparseImageFormatProperties {
        private final long elementCount;

        /// Creates `VkSparseImageFormatProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSparseImageFormatProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSparseImageFormatProperties`
        public VkSparseImageFormatProperties asSlice(long index) { return new VkSparseImageFormatProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSparseImageFormatProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSparseImageFormatProperties`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `aspectMask` at the given index}
        /// @param index the index of the struct buffer
        public int aspectMaskAt(long index) { return aspectMask(this.segment(), index); }
        /// Sets `aspectMask` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer aspectMaskAt(long index, int value) { aspectMask(this.segment(), index, value); return this; }

        /// {@return `imageGranularity` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment imageGranularityAt(long index) { return imageGranularity(this.segment(), index); }
        /// Sets `imageGranularity` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageGranularityAt(long index, MemorySegment value) { imageGranularity(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public int flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    }
}
