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
/// struct VkImageSubresource {
///     ((uint32_t) VkFlags) VkImageAspectFlags aspectMask;
///     uint32_t mipLevel;
///     uint32_t arrayLayer;
/// };
/// ```
public sealed class VkImageSubresource extends GroupType {
    /// The struct layout of `VkImageSubresource`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        ValueLayout.JAVA_INT.withName("mipLevel"),
        ValueLayout.JAVA_INT.withName("arrayLayer")
    );
    /// The byte offset of `aspectMask`.
    public static final long OFFSET_aspectMask = LAYOUT.byteOffset(PathElement.groupElement("aspectMask"));
    /// The memory layout of `aspectMask`.
    public static final MemoryLayout LAYOUT_aspectMask = LAYOUT.select(PathElement.groupElement("aspectMask"));
    /// The [VarHandle] of `aspectMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectMask"));
    /// The byte offset of `mipLevel`.
    public static final long OFFSET_mipLevel = LAYOUT.byteOffset(PathElement.groupElement("mipLevel"));
    /// The memory layout of `mipLevel`.
    public static final MemoryLayout LAYOUT_mipLevel = LAYOUT.select(PathElement.groupElement("mipLevel"));
    /// The [VarHandle] of `mipLevel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mipLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mipLevel"));
    /// The byte offset of `arrayLayer`.
    public static final long OFFSET_arrayLayer = LAYOUT.byteOffset(PathElement.groupElement("arrayLayer"));
    /// The memory layout of `arrayLayer`.
    public static final MemoryLayout LAYOUT_arrayLayer = LAYOUT.select(PathElement.groupElement("arrayLayer"));
    /// The [VarHandle] of `arrayLayer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_arrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("arrayLayer"));

    /// Creates `VkImageSubresource` with the given segment.
    /// @param segment the memory segment
    public VkImageSubresource(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageSubresource` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageSubresource` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSubresource ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresource(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkImageSubresource` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageSubresource` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageSubresource`
    public static VkImageSubresource alloc(SegmentAllocator allocator) { return new VkImageSubresource(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageSubresource` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageSubresource`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImageSubresource` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param aspectMask `aspectMask`
    /// @param mipLevel `mipLevel`
    /// @param arrayLayer `arrayLayer`
    /// @return the allocated `VkImageSubresource`
    public static VkImageSubresource allocInit(SegmentAllocator allocator, int aspectMask, int mipLevel, int arrayLayer) {
        return alloc(allocator).aspectMask(aspectMask).mipLevel(mipLevel).arrayLayer(arrayLayer);
    }

    /// Allocates a `VkImageSubresource` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param aspectMask `aspectMask`
    /// @param mipLevel `mipLevel`
    /// @return the allocated `VkImageSubresource`
    public static VkImageSubresource allocInit(SegmentAllocator allocator, int aspectMask, int mipLevel) {
        return alloc(allocator).aspectMask(aspectMask).mipLevel(mipLevel);
    }

    /// Allocates a `VkImageSubresource` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param aspectMask `aspectMask`
    /// @return the allocated `VkImageSubresource`
    public static VkImageSubresource allocInit(SegmentAllocator allocator, int aspectMask) {
        return alloc(allocator).aspectMask(aspectMask);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageSubresource copyFrom(VkImageSubresource src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkImageSubresource aspectMask(int value) { aspectMask(this.segment(), 0L, value); return this; }

    /// {@return `mipLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int mipLevel(MemorySegment segment, long index) { return (int) VH_mipLevel.get(segment, 0L, index); }
    /// {@return `mipLevel`}
    public int mipLevel() { return mipLevel(this.segment(), 0L); }
    /// Sets `mipLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mipLevel(MemorySegment segment, long index, int value) { VH_mipLevel.set(segment, 0L, index, value); }
    /// Sets `mipLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresource mipLevel(int value) { mipLevel(this.segment(), 0L, value); return this; }

    /// {@return `arrayLayer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int arrayLayer(MemorySegment segment, long index) { return (int) VH_arrayLayer.get(segment, 0L, index); }
    /// {@return `arrayLayer`}
    public int arrayLayer() { return arrayLayer(this.segment(), 0L); }
    /// Sets `arrayLayer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void arrayLayer(MemorySegment segment, long index, int value) { VH_arrayLayer.set(segment, 0L, index, value); }
    /// Sets `arrayLayer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresource arrayLayer(int value) { arrayLayer(this.segment(), 0L, value); return this; }

    /// A buffer of [VkImageSubresource].
    public static final class Buffer extends VkImageSubresource {
        private final long elementCount;

        /// Creates `VkImageSubresource.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImageSubresource`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImageSubresource`
        public VkImageSubresource asSlice(long index) { return new VkImageSubresource(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImageSubresource`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImageSubresource`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `aspectMask` at the given index}
        /// @param index the index of the struct buffer
        public int aspectMaskAt(long index) { return aspectMask(this.segment(), index); }
        /// Sets `aspectMask` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer aspectMaskAt(long index, int value) { aspectMask(this.segment(), index, value); return this; }

        /// {@return `mipLevel` at the given index}
        /// @param index the index of the struct buffer
        public int mipLevelAt(long index) { return mipLevel(this.segment(), index); }
        /// Sets `mipLevel` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer mipLevelAt(long index, int value) { mipLevel(this.segment(), index, value); return this; }

        /// {@return `arrayLayer` at the given index}
        /// @param index the index of the struct buffer
        public int arrayLayerAt(long index) { return arrayLayer(this.segment(), index); }
        /// Sets `arrayLayer` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer arrayLayerAt(long index, int value) { arrayLayer(this.segment(), index, value); return this; }

    }
}
