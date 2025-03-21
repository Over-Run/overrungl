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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceMemoryDecompressionPropertiesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint64_t) VkFlags64) VkMemoryDecompressionMethodFlagsNV decompressionMethods;
///     uint64_t maxDecompressionIndirectCount;
/// };
/// ```
public sealed class VkPhysicalDeviceMemoryDecompressionPropertiesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceMemoryDecompressionPropertiesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("decompressionMethods"),
        ValueLayout.JAVA_LONG.withName("maxDecompressionIndirectCount")
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
    /// The byte offset of `decompressionMethods`.
    public static final long OFFSET_decompressionMethods = LAYOUT.byteOffset(PathElement.groupElement("decompressionMethods"));
    /// The memory layout of `decompressionMethods`.
    public static final MemoryLayout LAYOUT_decompressionMethods = LAYOUT.select(PathElement.groupElement("decompressionMethods"));
    /// The [VarHandle] of `decompressionMethods` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_decompressionMethods = LAYOUT.arrayElementVarHandle(PathElement.groupElement("decompressionMethods"));
    /// The byte offset of `maxDecompressionIndirectCount`.
    public static final long OFFSET_maxDecompressionIndirectCount = LAYOUT.byteOffset(PathElement.groupElement("maxDecompressionIndirectCount"));
    /// The memory layout of `maxDecompressionIndirectCount`.
    public static final MemoryLayout LAYOUT_maxDecompressionIndirectCount = LAYOUT.select(PathElement.groupElement("maxDecompressionIndirectCount"));
    /// The [VarHandle] of `maxDecompressionIndirectCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDecompressionIndirectCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDecompressionIndirectCount"));

    /// Creates `VkPhysicalDeviceMemoryDecompressionPropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceMemoryDecompressionPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMemoryDecompressionPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryDecompressionPropertiesNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceMemoryDecompressionPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceMemoryDecompressionPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMemoryDecompressionPropertiesNV`
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMemoryDecompressionPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMemoryDecompressionPropertiesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV copyFrom(VkPhysicalDeviceMemoryDecompressionPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `decompressionMethods` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long decompressionMethods(MemorySegment segment, long index) { return (long) VH_decompressionMethods.get(segment, 0L, index); }
    /// {@return `decompressionMethods`}
    public long decompressionMethods() { return decompressionMethods(this.segment(), 0L); }
    /// Sets `decompressionMethods` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void decompressionMethods(MemorySegment segment, long index, long value) { VH_decompressionMethods.set(segment, 0L, index, value); }
    /// Sets `decompressionMethods` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV decompressionMethods(long value) { decompressionMethods(this.segment(), 0L, value); return this; }

    /// {@return `maxDecompressionIndirectCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxDecompressionIndirectCount(MemorySegment segment, long index) { return (long) VH_maxDecompressionIndirectCount.get(segment, 0L, index); }
    /// {@return `maxDecompressionIndirectCount`}
    public long maxDecompressionIndirectCount() { return maxDecompressionIndirectCount(this.segment(), 0L); }
    /// Sets `maxDecompressionIndirectCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDecompressionIndirectCount(MemorySegment segment, long index, long value) { VH_maxDecompressionIndirectCount.set(segment, 0L, index, value); }
    /// Sets `maxDecompressionIndirectCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV maxDecompressionIndirectCount(long value) { maxDecompressionIndirectCount(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceMemoryDecompressionPropertiesNV].
    public static final class Buffer extends VkPhysicalDeviceMemoryDecompressionPropertiesNV {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceMemoryDecompressionPropertiesNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceMemoryDecompressionPropertiesNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceMemoryDecompressionPropertiesNV`
        public VkPhysicalDeviceMemoryDecompressionPropertiesNV asSlice(long index) { return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceMemoryDecompressionPropertiesNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceMemoryDecompressionPropertiesNV`
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

        /// {@return `decompressionMethods` at the given index}
        /// @param index the index of the struct buffer
        public long decompressionMethodsAt(long index) { return decompressionMethods(this.segment(), index); }
        /// Sets `decompressionMethods` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer decompressionMethodsAt(long index, long value) { decompressionMethods(this.segment(), index, value); return this; }

        /// {@return `maxDecompressionIndirectCount` at the given index}
        /// @param index the index of the struct buffer
        public long maxDecompressionIndirectCountAt(long index) { return maxDecompressionIndirectCount(this.segment(), index); }
        /// Sets `maxDecompressionIndirectCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDecompressionIndirectCountAt(long index, long value) { maxDecompressionIndirectCount(this.segment(), index, value); return this; }

    }
}
