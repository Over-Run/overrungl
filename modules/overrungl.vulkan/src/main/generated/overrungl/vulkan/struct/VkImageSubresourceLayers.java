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
/// struct VkImageSubresourceLayers {
///     ((uint32_t) VkFlags) VkImageAspectFlags aspectMask;
///     uint32_t mipLevel;
///     uint32_t baseArrayLayer;
///     uint32_t layerCount;
/// };
/// ```
public sealed class VkImageSubresourceLayers extends GroupType {
    /// The struct layout of `VkImageSubresourceLayers`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        ValueLayout.JAVA_INT.withName("mipLevel"),
        ValueLayout.JAVA_INT.withName("baseArrayLayer"),
        ValueLayout.JAVA_INT.withName("layerCount")
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
    /// The byte offset of `baseArrayLayer`.
    public static final long OFFSET_baseArrayLayer = LAYOUT.byteOffset(PathElement.groupElement("baseArrayLayer"));
    /// The memory layout of `baseArrayLayer`.
    public static final MemoryLayout LAYOUT_baseArrayLayer = LAYOUT.select(PathElement.groupElement("baseArrayLayer"));
    /// The [VarHandle] of `baseArrayLayer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_baseArrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseArrayLayer"));
    /// The byte offset of `layerCount`.
    public static final long OFFSET_layerCount = LAYOUT.byteOffset(PathElement.groupElement("layerCount"));
    /// The memory layout of `layerCount`.
    public static final MemoryLayout LAYOUT_layerCount = LAYOUT.select(PathElement.groupElement("layerCount"));
    /// The [VarHandle] of `layerCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layerCount"));

    /// Creates `VkImageSubresourceLayers` with the given segment.
    /// @param segment the memory segment
    public VkImageSubresourceLayers(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageSubresourceLayers` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageSubresourceLayers` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSubresourceLayers ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresourceLayers(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkImageSubresourceLayers` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageSubresourceLayers` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageSubresourceLayers`
    public static VkImageSubresourceLayers alloc(SegmentAllocator allocator) { return new VkImageSubresourceLayers(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageSubresourceLayers` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageSubresourceLayers`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImageSubresourceLayers` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param aspectMask `aspectMask`
    /// @param mipLevel `mipLevel`
    /// @param baseArrayLayer `baseArrayLayer`
    /// @param layerCount `layerCount`
    /// @return the allocated `VkImageSubresourceLayers`
    public static VkImageSubresourceLayers allocInit(SegmentAllocator allocator, int aspectMask, int mipLevel, int baseArrayLayer, int layerCount) {
        return alloc(allocator).aspectMask(aspectMask).mipLevel(mipLevel).baseArrayLayer(baseArrayLayer).layerCount(layerCount);
    }

    /// Allocates a `VkImageSubresourceLayers` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param aspectMask `aspectMask`
    /// @param mipLevel `mipLevel`
    /// @param baseArrayLayer `baseArrayLayer`
    /// @return the allocated `VkImageSubresourceLayers`
    public static VkImageSubresourceLayers allocInit(SegmentAllocator allocator, int aspectMask, int mipLevel, int baseArrayLayer) {
        return alloc(allocator).aspectMask(aspectMask).mipLevel(mipLevel).baseArrayLayer(baseArrayLayer);
    }

    /// Allocates a `VkImageSubresourceLayers` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param aspectMask `aspectMask`
    /// @param mipLevel `mipLevel`
    /// @return the allocated `VkImageSubresourceLayers`
    public static VkImageSubresourceLayers allocInit(SegmentAllocator allocator, int aspectMask, int mipLevel) {
        return alloc(allocator).aspectMask(aspectMask).mipLevel(mipLevel);
    }

    /// Allocates a `VkImageSubresourceLayers` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param aspectMask `aspectMask`
    /// @return the allocated `VkImageSubresourceLayers`
    public static VkImageSubresourceLayers allocInit(SegmentAllocator allocator, int aspectMask) {
        return alloc(allocator).aspectMask(aspectMask);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageSubresourceLayers copyFrom(VkImageSubresourceLayers src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkImageSubresourceLayers aspectMask(int value) { aspectMask(this.segment(), 0L, value); return this; }

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
    public VkImageSubresourceLayers mipLevel(int value) { mipLevel(this.segment(), 0L, value); return this; }

    /// {@return `baseArrayLayer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int baseArrayLayer(MemorySegment segment, long index) { return (int) VH_baseArrayLayer.get(segment, 0L, index); }
    /// {@return `baseArrayLayer`}
    public int baseArrayLayer() { return baseArrayLayer(this.segment(), 0L); }
    /// Sets `baseArrayLayer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void baseArrayLayer(MemorySegment segment, long index, int value) { VH_baseArrayLayer.set(segment, 0L, index, value); }
    /// Sets `baseArrayLayer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceLayers baseArrayLayer(int value) { baseArrayLayer(this.segment(), 0L, value); return this; }

    /// {@return `layerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int layerCount(MemorySegment segment, long index) { return (int) VH_layerCount.get(segment, 0L, index); }
    /// {@return `layerCount`}
    public int layerCount() { return layerCount(this.segment(), 0L); }
    /// Sets `layerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layerCount(MemorySegment segment, long index, int value) { VH_layerCount.set(segment, 0L, index, value); }
    /// Sets `layerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceLayers layerCount(int value) { layerCount(this.segment(), 0L, value); return this; }

    /// A buffer of [VkImageSubresourceLayers].
    public static final class Buffer extends VkImageSubresourceLayers {
        private final long elementCount;

        /// Creates `VkImageSubresourceLayers.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImageSubresourceLayers`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImageSubresourceLayers`
        public VkImageSubresourceLayers asSlice(long index) { return new VkImageSubresourceLayers(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImageSubresourceLayers`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImageSubresourceLayers`
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

        /// {@return `baseArrayLayer` at the given index}
        /// @param index the index of the struct buffer
        public int baseArrayLayerAt(long index) { return baseArrayLayer(this.segment(), index); }
        /// Sets `baseArrayLayer` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer baseArrayLayerAt(long index, int value) { baseArrayLayer(this.segment(), index, value); return this; }

        /// {@return `layerCount` at the given index}
        /// @param index the index of the struct buffer
        public int layerCountAt(long index) { return layerCount(this.segment(), index); }
        /// Sets `layerCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer layerCountAt(long index, int value) { layerCount(this.segment(), index, value); return this; }

    }
}
