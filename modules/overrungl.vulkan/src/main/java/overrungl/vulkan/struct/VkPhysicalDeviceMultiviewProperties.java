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
/// struct VkPhysicalDeviceMultiviewProperties {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxMultiviewViewCount;
///     uint32_t maxMultiviewInstanceIndex;
/// };
/// ```
public sealed class VkPhysicalDeviceMultiviewProperties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceMultiviewProperties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxMultiviewViewCount"),
        ValueLayout.JAVA_INT.withName("maxMultiviewInstanceIndex")
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
    /// The byte offset of `maxMultiviewViewCount`.
    public static final long OFFSET_maxMultiviewViewCount = LAYOUT.byteOffset(PathElement.groupElement("maxMultiviewViewCount"));
    /// The memory layout of `maxMultiviewViewCount`.
    public static final MemoryLayout LAYOUT_maxMultiviewViewCount = LAYOUT.select(PathElement.groupElement("maxMultiviewViewCount"));
    /// The [VarHandle] of `maxMultiviewViewCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxMultiviewViewCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMultiviewViewCount"));
    /// The byte offset of `maxMultiviewInstanceIndex`.
    public static final long OFFSET_maxMultiviewInstanceIndex = LAYOUT.byteOffset(PathElement.groupElement("maxMultiviewInstanceIndex"));
    /// The memory layout of `maxMultiviewInstanceIndex`.
    public static final MemoryLayout LAYOUT_maxMultiviewInstanceIndex = LAYOUT.select(PathElement.groupElement("maxMultiviewInstanceIndex"));
    /// The [VarHandle] of `maxMultiviewInstanceIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxMultiviewInstanceIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMultiviewInstanceIndex"));

    /// Creates `VkPhysicalDeviceMultiviewProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceMultiviewProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceMultiviewProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMultiviewProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMultiviewProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceMultiviewProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceMultiviewProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMultiviewProperties`
    public static VkPhysicalDeviceMultiviewProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMultiviewProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMultiviewProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMultiviewProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMultiviewProperties copyFrom(VkPhysicalDeviceMultiviewProperties src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceMultiviewProperties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMultiviewProperties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxMultiviewViewCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxMultiviewViewCount(MemorySegment segment, long index) { return (int) VH_maxMultiviewViewCount.get(segment, 0L, index); }
    /// {@return `maxMultiviewViewCount`}
    public int maxMultiviewViewCount() { return maxMultiviewViewCount(this.segment(), 0L); }
    /// Sets `maxMultiviewViewCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMultiviewViewCount(MemorySegment segment, long index, int value) { VH_maxMultiviewViewCount.set(segment, 0L, index, value); }
    /// Sets `maxMultiviewViewCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewProperties maxMultiviewViewCount(int value) { maxMultiviewViewCount(this.segment(), 0L, value); return this; }

    /// {@return `maxMultiviewInstanceIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxMultiviewInstanceIndex(MemorySegment segment, long index) { return (int) VH_maxMultiviewInstanceIndex.get(segment, 0L, index); }
    /// {@return `maxMultiviewInstanceIndex`}
    public int maxMultiviewInstanceIndex() { return maxMultiviewInstanceIndex(this.segment(), 0L); }
    /// Sets `maxMultiviewInstanceIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMultiviewInstanceIndex(MemorySegment segment, long index, int value) { VH_maxMultiviewInstanceIndex.set(segment, 0L, index, value); }
    /// Sets `maxMultiviewInstanceIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewProperties maxMultiviewInstanceIndex(int value) { maxMultiviewInstanceIndex(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceMultiviewProperties].
    public static final class Buffer extends VkPhysicalDeviceMultiviewProperties {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceMultiviewProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceMultiviewProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceMultiviewProperties`
        public VkPhysicalDeviceMultiviewProperties asSlice(long index) { return new VkPhysicalDeviceMultiviewProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceMultiviewProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceMultiviewProperties`
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

        /// {@return `maxMultiviewViewCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxMultiviewViewCountAt(long index) { return maxMultiviewViewCount(this.segment(), index); }
        /// Sets `maxMultiviewViewCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxMultiviewViewCountAt(long index, int value) { maxMultiviewViewCount(this.segment(), index, value); return this; }

        /// {@return `maxMultiviewInstanceIndex` at the given index}
        /// @param index the index of the struct buffer
        public int maxMultiviewInstanceIndexAt(long index) { return maxMultiviewInstanceIndex(this.segment(), index); }
        /// Sets `maxMultiviewInstanceIndex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxMultiviewInstanceIndexAt(long index, int value) { maxMultiviewInstanceIndex(this.segment(), index, value); return this; }

    }
}
