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
/// struct VkDescriptorImageInfo {
///     (uint64_t) VkSampler sampler;
///     (uint64_t) VkImageView imageView;
///     (int) VkImageLayout imageLayout;
/// };
/// ```
public sealed class VkDescriptorImageInfo extends GroupType {
    /// The struct layout of `VkDescriptorImageInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("sampler"),
        ValueLayout.JAVA_LONG.withName("imageView"),
        ValueLayout.JAVA_INT.withName("imageLayout")
    );
    /// The byte offset of `sampler`.
    public static final long OFFSET_sampler = LAYOUT.byteOffset(PathElement.groupElement("sampler"));
    /// The memory layout of `sampler`.
    public static final MemoryLayout LAYOUT_sampler = LAYOUT.select(PathElement.groupElement("sampler"));
    /// The [VarHandle] of `sampler` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sampler = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampler"));
    /// The byte offset of `imageView`.
    public static final long OFFSET_imageView = LAYOUT.byteOffset(PathElement.groupElement("imageView"));
    /// The memory layout of `imageView`.
    public static final MemoryLayout LAYOUT_imageView = LAYOUT.select(PathElement.groupElement("imageView"));
    /// The [VarHandle] of `imageView` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageView"));
    /// The byte offset of `imageLayout`.
    public static final long OFFSET_imageLayout = LAYOUT.byteOffset(PathElement.groupElement("imageLayout"));
    /// The memory layout of `imageLayout`.
    public static final MemoryLayout LAYOUT_imageLayout = LAYOUT.select(PathElement.groupElement("imageLayout"));
    /// The [VarHandle] of `imageLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageLayout"));

    /// Creates `VkDescriptorImageInfo` with the given segment.
    /// @param segment the memory segment
    public VkDescriptorImageInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDescriptorImageInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorImageInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorImageInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorImageInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDescriptorImageInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDescriptorImageInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorImageInfo`
    public static VkDescriptorImageInfo alloc(SegmentAllocator allocator) { return new VkDescriptorImageInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDescriptorImageInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorImageInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorImageInfo copyFrom(VkDescriptorImageInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sampler` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long sampler(MemorySegment segment, long index) { return (long) VH_sampler.get(segment, 0L, index); }
    /// {@return `sampler`}
    public long sampler() { return sampler(this.segment(), 0L); }
    /// Sets `sampler` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampler(MemorySegment segment, long index, long value) { VH_sampler.set(segment, 0L, index, value); }
    /// Sets `sampler` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorImageInfo sampler(long value) { sampler(this.segment(), 0L, value); return this; }

    /// {@return `imageView` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long imageView(MemorySegment segment, long index) { return (long) VH_imageView.get(segment, 0L, index); }
    /// {@return `imageView`}
    public long imageView() { return imageView(this.segment(), 0L); }
    /// Sets `imageView` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageView(MemorySegment segment, long index, long value) { VH_imageView.set(segment, 0L, index, value); }
    /// Sets `imageView` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorImageInfo imageView(long value) { imageView(this.segment(), 0L, value); return this; }

    /// {@return `imageLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageLayout(MemorySegment segment, long index) { return (int) VH_imageLayout.get(segment, 0L, index); }
    /// {@return `imageLayout`}
    public int imageLayout() { return imageLayout(this.segment(), 0L); }
    /// Sets `imageLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageLayout(MemorySegment segment, long index, int value) { VH_imageLayout.set(segment, 0L, index, value); }
    /// Sets `imageLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorImageInfo imageLayout(int value) { imageLayout(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDescriptorImageInfo].
    public static final class Buffer extends VkDescriptorImageInfo {
        private final long elementCount;

        /// Creates `VkDescriptorImageInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDescriptorImageInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDescriptorImageInfo`
        public VkDescriptorImageInfo asSlice(long index) { return new VkDescriptorImageInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDescriptorImageInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDescriptorImageInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sampler` at the given index}
        /// @param index the index of the struct buffer
        public long samplerAt(long index) { return sampler(this.segment(), index); }
        /// Sets `sampler` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer samplerAt(long index, long value) { sampler(this.segment(), index, value); return this; }

        /// {@return `imageView` at the given index}
        /// @param index the index of the struct buffer
        public long imageViewAt(long index) { return imageView(this.segment(), index); }
        /// Sets `imageView` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageViewAt(long index, long value) { imageView(this.segment(), index, value); return this; }

        /// {@return `imageLayout` at the given index}
        /// @param index the index of the struct buffer
        public int imageLayoutAt(long index) { return imageLayout(this.segment(), index); }
        /// Sets `imageLayout` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageLayoutAt(long index, int value) { imageLayout(this.segment(), index, value); return this; }

    }
}
