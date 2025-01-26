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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDeviceFaultCountsEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t addressInfoCount;
///     uint32_t vendorInfoCount;
///     VkDeviceSize vendorBinarySize;
/// };
/// ```
public sealed class VkDeviceFaultCountsEXT extends GroupType {
    /// The struct layout of `VkDeviceFaultCountsEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("addressInfoCount"),
        ValueLayout.JAVA_INT.withName("vendorInfoCount"),
        ValueLayout.JAVA_LONG.withName("vendorBinarySize")
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
    /// The byte offset of `addressInfoCount`.
    public static final long OFFSET_addressInfoCount = LAYOUT.byteOffset(PathElement.groupElement("addressInfoCount"));
    /// The memory layout of `addressInfoCount`.
    public static final MemoryLayout LAYOUT_addressInfoCount = LAYOUT.select(PathElement.groupElement("addressInfoCount"));
    /// The [VarHandle] of `addressInfoCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_addressInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("addressInfoCount"));
    /// The byte offset of `vendorInfoCount`.
    public static final long OFFSET_vendorInfoCount = LAYOUT.byteOffset(PathElement.groupElement("vendorInfoCount"));
    /// The memory layout of `vendorInfoCount`.
    public static final MemoryLayout LAYOUT_vendorInfoCount = LAYOUT.select(PathElement.groupElement("vendorInfoCount"));
    /// The [VarHandle] of `vendorInfoCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vendorInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorInfoCount"));
    /// The byte offset of `vendorBinarySize`.
    public static final long OFFSET_vendorBinarySize = LAYOUT.byteOffset(PathElement.groupElement("vendorBinarySize"));
    /// The memory layout of `vendorBinarySize`.
    public static final MemoryLayout LAYOUT_vendorBinarySize = LAYOUT.select(PathElement.groupElement("vendorBinarySize"));
    /// The [VarHandle] of `vendorBinarySize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vendorBinarySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorBinarySize"));

    /// Creates `VkDeviceFaultCountsEXT` with the given segment.
    /// @param segment the memory segment
    public VkDeviceFaultCountsEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceFaultCountsEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceFaultCountsEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceFaultCountsEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultCountsEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceFaultCountsEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDeviceFaultCountsEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceFaultCountsEXT`
    public static VkDeviceFaultCountsEXT alloc(SegmentAllocator allocator) { return new VkDeviceFaultCountsEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceFaultCountsEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceFaultCountsEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceFaultCountsEXT copyFrom(VkDeviceFaultCountsEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkDeviceFaultCountsEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDeviceFaultCountsEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `addressInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int addressInfoCount(MemorySegment segment, long index) { return (int) VH_addressInfoCount.get(segment, 0L, index); }
    /// {@return `addressInfoCount`}
    public int addressInfoCount() { return addressInfoCount(this.segment(), 0L); }
    /// Sets `addressInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void addressInfoCount(MemorySegment segment, long index, int value) { VH_addressInfoCount.set(segment, 0L, index, value); }
    /// Sets `addressInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultCountsEXT addressInfoCount(int value) { addressInfoCount(this.segment(), 0L, value); return this; }

    /// {@return `vendorInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vendorInfoCount(MemorySegment segment, long index) { return (int) VH_vendorInfoCount.get(segment, 0L, index); }
    /// {@return `vendorInfoCount`}
    public int vendorInfoCount() { return vendorInfoCount(this.segment(), 0L); }
    /// Sets `vendorInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vendorInfoCount(MemorySegment segment, long index, int value) { VH_vendorInfoCount.set(segment, 0L, index, value); }
    /// Sets `vendorInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultCountsEXT vendorInfoCount(int value) { vendorInfoCount(this.segment(), 0L, value); return this; }

    /// {@return `vendorBinarySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long vendorBinarySize(MemorySegment segment, long index) { return (long) VH_vendorBinarySize.get(segment, 0L, index); }
    /// {@return `vendorBinarySize`}
    public long vendorBinarySize() { return vendorBinarySize(this.segment(), 0L); }
    /// Sets `vendorBinarySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vendorBinarySize(MemorySegment segment, long index, long value) { VH_vendorBinarySize.set(segment, 0L, index, value); }
    /// Sets `vendorBinarySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultCountsEXT vendorBinarySize(long value) { vendorBinarySize(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDeviceFaultCountsEXT].
    public static final class Buffer extends VkDeviceFaultCountsEXT {
        private final long elementCount;

        /// Creates `VkDeviceFaultCountsEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDeviceFaultCountsEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDeviceFaultCountsEXT`
        public VkDeviceFaultCountsEXT asSlice(long index) { return new VkDeviceFaultCountsEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDeviceFaultCountsEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDeviceFaultCountsEXT`
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

        /// {@return `addressInfoCount` at the given index}
        /// @param index the index of the struct buffer
        public int addressInfoCountAt(long index) { return addressInfoCount(this.segment(), index); }
        /// Sets `addressInfoCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer addressInfoCountAt(long index, int value) { addressInfoCount(this.segment(), index, value); return this; }

        /// {@return `vendorInfoCount` at the given index}
        /// @param index the index of the struct buffer
        public int vendorInfoCountAt(long index) { return vendorInfoCount(this.segment(), index); }
        /// Sets `vendorInfoCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer vendorInfoCountAt(long index, int value) { vendorInfoCount(this.segment(), index, value); return this; }

        /// {@return `vendorBinarySize` at the given index}
        /// @param index the index of the struct buffer
        public long vendorBinarySizeAt(long index) { return vendorBinarySize(this.segment(), index); }
        /// Sets `vendorBinarySize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer vendorBinarySizeAt(long index, long value) { vendorBinarySize(this.segment(), index, value); return this; }

    }
}
