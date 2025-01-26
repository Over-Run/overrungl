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
/// struct VkPhysicalDeviceLineRasterizationProperties {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t lineSubPixelPrecisionBits;
/// };
/// ```
public sealed class VkPhysicalDeviceLineRasterizationProperties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceLineRasterizationProperties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("lineSubPixelPrecisionBits")
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
    /// The byte offset of `lineSubPixelPrecisionBits`.
    public static final long OFFSET_lineSubPixelPrecisionBits = LAYOUT.byteOffset(PathElement.groupElement("lineSubPixelPrecisionBits"));
    /// The memory layout of `lineSubPixelPrecisionBits`.
    public static final MemoryLayout LAYOUT_lineSubPixelPrecisionBits = LAYOUT.select(PathElement.groupElement("lineSubPixelPrecisionBits"));
    /// The [VarHandle] of `lineSubPixelPrecisionBits` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_lineSubPixelPrecisionBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineSubPixelPrecisionBits"));

    /// Creates `VkPhysicalDeviceLineRasterizationProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceLineRasterizationProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceLineRasterizationProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceLineRasterizationProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLineRasterizationProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLineRasterizationProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceLineRasterizationProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceLineRasterizationProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceLineRasterizationProperties`
    public static VkPhysicalDeviceLineRasterizationProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLineRasterizationProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceLineRasterizationProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceLineRasterizationProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationProperties copyFrom(VkPhysicalDeviceLineRasterizationProperties src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceLineRasterizationProperties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceLineRasterizationProperties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `lineSubPixelPrecisionBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int lineSubPixelPrecisionBits(MemorySegment segment, long index) { return (int) VH_lineSubPixelPrecisionBits.get(segment, 0L, index); }
    /// {@return `lineSubPixelPrecisionBits`}
    public int lineSubPixelPrecisionBits() { return lineSubPixelPrecisionBits(this.segment(), 0L); }
    /// Sets `lineSubPixelPrecisionBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void lineSubPixelPrecisionBits(MemorySegment segment, long index, int value) { VH_lineSubPixelPrecisionBits.set(segment, 0L, index, value); }
    /// Sets `lineSubPixelPrecisionBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationProperties lineSubPixelPrecisionBits(int value) { lineSubPixelPrecisionBits(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceLineRasterizationProperties].
    public static final class Buffer extends VkPhysicalDeviceLineRasterizationProperties {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceLineRasterizationProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceLineRasterizationProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceLineRasterizationProperties`
        public VkPhysicalDeviceLineRasterizationProperties asSlice(long index) { return new VkPhysicalDeviceLineRasterizationProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceLineRasterizationProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceLineRasterizationProperties`
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

        /// {@return `lineSubPixelPrecisionBits` at the given index}
        /// @param index the index of the struct buffer
        public int lineSubPixelPrecisionBitsAt(long index) { return lineSubPixelPrecisionBits(this.segment(), index); }
        /// Sets `lineSubPixelPrecisionBits` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer lineSubPixelPrecisionBitsAt(long index, int value) { lineSubPixelPrecisionBits(this.segment(), index, value); return this; }

    }
}
