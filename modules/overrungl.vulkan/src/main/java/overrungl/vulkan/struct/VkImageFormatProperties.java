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
/// struct VkImageFormatProperties {
///     (struct VkExtent3D) VkExtent3D maxExtent;
///     uint32_t maxMipLevels;
///     uint32_t maxArrayLayers;
///     ((uint32_t) VkFlags) VkSampleCountFlags sampleCounts;
///     (uint64_t) VkDeviceSize maxResourceSize;
/// };
/// ```
public sealed class VkImageFormatProperties extends GroupType {
    /// The struct layout of `VkImageFormatProperties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("maxExtent"),
        ValueLayout.JAVA_INT.withName("maxMipLevels"),
        ValueLayout.JAVA_INT.withName("maxArrayLayers"),
        ValueLayout.JAVA_INT.withName("sampleCounts"),
        ValueLayout.JAVA_LONG.withName("maxResourceSize")
    );
    /// The byte offset of `maxExtent`.
    public static final long OFFSET_maxExtent = LAYOUT.byteOffset(PathElement.groupElement("maxExtent"));
    /// The memory layout of `maxExtent`.
    public static final MemoryLayout LAYOUT_maxExtent = LAYOUT.select(PathElement.groupElement("maxExtent"));
    /// The byte offset of `maxMipLevels`.
    public static final long OFFSET_maxMipLevels = LAYOUT.byteOffset(PathElement.groupElement("maxMipLevels"));
    /// The memory layout of `maxMipLevels`.
    public static final MemoryLayout LAYOUT_maxMipLevels = LAYOUT.select(PathElement.groupElement("maxMipLevels"));
    /// The [VarHandle] of `maxMipLevels` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxMipLevels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMipLevels"));
    /// The byte offset of `maxArrayLayers`.
    public static final long OFFSET_maxArrayLayers = LAYOUT.byteOffset(PathElement.groupElement("maxArrayLayers"));
    /// The memory layout of `maxArrayLayers`.
    public static final MemoryLayout LAYOUT_maxArrayLayers = LAYOUT.select(PathElement.groupElement("maxArrayLayers"));
    /// The [VarHandle] of `maxArrayLayers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxArrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxArrayLayers"));
    /// The byte offset of `sampleCounts`.
    public static final long OFFSET_sampleCounts = LAYOUT.byteOffset(PathElement.groupElement("sampleCounts"));
    /// The memory layout of `sampleCounts`.
    public static final MemoryLayout LAYOUT_sampleCounts = LAYOUT.select(PathElement.groupElement("sampleCounts"));
    /// The [VarHandle] of `sampleCounts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleCounts"));
    /// The byte offset of `maxResourceSize`.
    public static final long OFFSET_maxResourceSize = LAYOUT.byteOffset(PathElement.groupElement("maxResourceSize"));
    /// The memory layout of `maxResourceSize`.
    public static final MemoryLayout LAYOUT_maxResourceSize = LAYOUT.select(PathElement.groupElement("maxResourceSize"));
    /// The [VarHandle] of `maxResourceSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxResourceSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxResourceSize"));

    /// Creates `VkImageFormatProperties` with the given segment.
    /// @param segment the memory segment
    public VkImageFormatProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageFormatProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageFormatProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageFormatProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageFormatProperties(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkImageFormatProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageFormatProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageFormatProperties`
    public static VkImageFormatProperties alloc(SegmentAllocator allocator) { return new VkImageFormatProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageFormatProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageFormatProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageFormatProperties copyFrom(VkImageFormatProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `maxExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxExtent, index), LAYOUT_maxExtent); }
    /// {@return `maxExtent`}
    public MemorySegment maxExtent() { return maxExtent(this.segment(), 0L); }
    /// Sets `maxExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxExtent, index), LAYOUT_maxExtent.byteSize()); }
    /// Sets `maxExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties maxExtent(MemorySegment value) { maxExtent(this.segment(), 0L, value); return this; }

    /// {@return `maxMipLevels` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxMipLevels(MemorySegment segment, long index) { return (int) VH_maxMipLevels.get(segment, 0L, index); }
    /// {@return `maxMipLevels`}
    public int maxMipLevels() { return maxMipLevels(this.segment(), 0L); }
    /// Sets `maxMipLevels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMipLevels(MemorySegment segment, long index, int value) { VH_maxMipLevels.set(segment, 0L, index, value); }
    /// Sets `maxMipLevels` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties maxMipLevels(int value) { maxMipLevels(this.segment(), 0L, value); return this; }

    /// {@return `maxArrayLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxArrayLayers(MemorySegment segment, long index) { return (int) VH_maxArrayLayers.get(segment, 0L, index); }
    /// {@return `maxArrayLayers`}
    public int maxArrayLayers() { return maxArrayLayers(this.segment(), 0L); }
    /// Sets `maxArrayLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxArrayLayers(MemorySegment segment, long index, int value) { VH_maxArrayLayers.set(segment, 0L, index, value); }
    /// Sets `maxArrayLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties maxArrayLayers(int value) { maxArrayLayers(this.segment(), 0L, value); return this; }

    /// {@return `sampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sampleCounts(MemorySegment segment, long index) { return (int) VH_sampleCounts.get(segment, 0L, index); }
    /// {@return `sampleCounts`}
    public int sampleCounts() { return sampleCounts(this.segment(), 0L); }
    /// Sets `sampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampleCounts(MemorySegment segment, long index, int value) { VH_sampleCounts.set(segment, 0L, index, value); }
    /// Sets `sampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties sampleCounts(int value) { sampleCounts(this.segment(), 0L, value); return this; }

    /// {@return `maxResourceSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxResourceSize(MemorySegment segment, long index) { return (long) VH_maxResourceSize.get(segment, 0L, index); }
    /// {@return `maxResourceSize`}
    public long maxResourceSize() { return maxResourceSize(this.segment(), 0L); }
    /// Sets `maxResourceSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxResourceSize(MemorySegment segment, long index, long value) { VH_maxResourceSize.set(segment, 0L, index, value); }
    /// Sets `maxResourceSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties maxResourceSize(long value) { maxResourceSize(this.segment(), 0L, value); return this; }

    /// A buffer of [VkImageFormatProperties].
    public static final class Buffer extends VkImageFormatProperties {
        private final long elementCount;

        /// Creates `VkImageFormatProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImageFormatProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImageFormatProperties`
        public VkImageFormatProperties asSlice(long index) { return new VkImageFormatProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImageFormatProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImageFormatProperties`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `maxExtent` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment maxExtentAt(long index) { return maxExtent(this.segment(), index); }
        /// Sets `maxExtent` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxExtentAt(long index, MemorySegment value) { maxExtent(this.segment(), index, value); return this; }

        /// {@return `maxMipLevels` at the given index}
        /// @param index the index of the struct buffer
        public int maxMipLevelsAt(long index) { return maxMipLevels(this.segment(), index); }
        /// Sets `maxMipLevels` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxMipLevelsAt(long index, int value) { maxMipLevels(this.segment(), index, value); return this; }

        /// {@return `maxArrayLayers` at the given index}
        /// @param index the index of the struct buffer
        public int maxArrayLayersAt(long index) { return maxArrayLayers(this.segment(), index); }
        /// Sets `maxArrayLayers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxArrayLayersAt(long index, int value) { maxArrayLayers(this.segment(), index, value); return this; }

        /// {@return `sampleCounts` at the given index}
        /// @param index the index of the struct buffer
        public int sampleCountsAt(long index) { return sampleCounts(this.segment(), index); }
        /// Sets `sampleCounts` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sampleCountsAt(long index, int value) { sampleCounts(this.segment(), index, value); return this; }

        /// {@return `maxResourceSize` at the given index}
        /// @param index the index of the struct buffer
        public long maxResourceSizeAt(long index) { return maxResourceSize(this.segment(), index); }
        /// Sets `maxResourceSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxResourceSizeAt(long index, long value) { maxResourceSize(this.segment(), index, value); return this; }

    }
}
