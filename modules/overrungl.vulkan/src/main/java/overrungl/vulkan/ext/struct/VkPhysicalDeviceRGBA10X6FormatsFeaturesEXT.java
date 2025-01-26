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
/// struct VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 formatRgba10x6WithoutYCbCrSampler;
/// };
/// ```
public sealed class VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("formatRgba10x6WithoutYCbCrSampler")
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
    /// The byte offset of `formatRgba10x6WithoutYCbCrSampler`.
    public static final long OFFSET_formatRgba10x6WithoutYCbCrSampler = LAYOUT.byteOffset(PathElement.groupElement("formatRgba10x6WithoutYCbCrSampler"));
    /// The memory layout of `formatRgba10x6WithoutYCbCrSampler`.
    public static final MemoryLayout LAYOUT_formatRgba10x6WithoutYCbCrSampler = LAYOUT.select(PathElement.groupElement("formatRgba10x6WithoutYCbCrSampler"));
    /// The [VarHandle] of `formatRgba10x6WithoutYCbCrSampler` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_formatRgba10x6WithoutYCbCrSampler = LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatRgba10x6WithoutYCbCrSampler"));

    /// Creates `VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT`
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT copyFrom(VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `formatRgba10x6WithoutYCbCrSampler` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int formatRgba10x6WithoutYCbCrSampler(MemorySegment segment, long index) { return (int) VH_formatRgba10x6WithoutYCbCrSampler.get(segment, 0L, index); }
    /// {@return `formatRgba10x6WithoutYCbCrSampler`}
    public int formatRgba10x6WithoutYCbCrSampler() { return formatRgba10x6WithoutYCbCrSampler(this.segment(), 0L); }
    /// Sets `formatRgba10x6WithoutYCbCrSampler` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void formatRgba10x6WithoutYCbCrSampler(MemorySegment segment, long index, int value) { VH_formatRgba10x6WithoutYCbCrSampler.set(segment, 0L, index, value); }
    /// Sets `formatRgba10x6WithoutYCbCrSampler` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT formatRgba10x6WithoutYCbCrSampler(int value) { formatRgba10x6WithoutYCbCrSampler(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT`
        public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT`
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

        /// {@return `formatRgba10x6WithoutYCbCrSampler` at the given index}
        /// @param index the index of the struct buffer
        public int formatRgba10x6WithoutYCbCrSamplerAt(long index) { return formatRgba10x6WithoutYCbCrSampler(this.segment(), index); }
        /// Sets `formatRgba10x6WithoutYCbCrSampler` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer formatRgba10x6WithoutYCbCrSamplerAt(long index, int value) { formatRgba10x6WithoutYCbCrSampler(this.segment(), index, value); return this; }

    }
}
