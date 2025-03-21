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
/// struct VkImageCompressionPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkImageCompressionFlagsEXT imageCompressionFlags;
///     ((uint32_t) VkFlags) VkImageCompressionFixedRateFlagsEXT imageCompressionFixedRateFlags;
/// };
/// ```
public sealed class VkImageCompressionPropertiesEXT extends GroupType {
    /// The struct layout of `VkImageCompressionPropertiesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageCompressionFlags"),
        ValueLayout.JAVA_INT.withName("imageCompressionFixedRateFlags")
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
    /// The byte offset of `imageCompressionFlags`.
    public static final long OFFSET_imageCompressionFlags = LAYOUT.byteOffset(PathElement.groupElement("imageCompressionFlags"));
    /// The memory layout of `imageCompressionFlags`.
    public static final MemoryLayout LAYOUT_imageCompressionFlags = LAYOUT.select(PathElement.groupElement("imageCompressionFlags"));
    /// The [VarHandle] of `imageCompressionFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageCompressionFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCompressionFlags"));
    /// The byte offset of `imageCompressionFixedRateFlags`.
    public static final long OFFSET_imageCompressionFixedRateFlags = LAYOUT.byteOffset(PathElement.groupElement("imageCompressionFixedRateFlags"));
    /// The memory layout of `imageCompressionFixedRateFlags`.
    public static final MemoryLayout LAYOUT_imageCompressionFixedRateFlags = LAYOUT.select(PathElement.groupElement("imageCompressionFixedRateFlags"));
    /// The [VarHandle] of `imageCompressionFixedRateFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageCompressionFixedRateFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCompressionFixedRateFlags"));

    /// Creates `VkImageCompressionPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkImageCompressionPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageCompressionPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageCompressionPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageCompressionPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageCompressionPropertiesEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkImageCompressionPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageCompressionPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageCompressionPropertiesEXT`
    public static VkImageCompressionPropertiesEXT alloc(SegmentAllocator allocator) { return new VkImageCompressionPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageCompressionPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageCompressionPropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageCompressionPropertiesEXT copyFrom(VkImageCompressionPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkImageCompressionPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImageCompressionPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `imageCompressionFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageCompressionFlags(MemorySegment segment, long index) { return (int) VH_imageCompressionFlags.get(segment, 0L, index); }
    /// {@return `imageCompressionFlags`}
    public int imageCompressionFlags() { return imageCompressionFlags(this.segment(), 0L); }
    /// Sets `imageCompressionFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageCompressionFlags(MemorySegment segment, long index, int value) { VH_imageCompressionFlags.set(segment, 0L, index, value); }
    /// Sets `imageCompressionFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCompressionPropertiesEXT imageCompressionFlags(int value) { imageCompressionFlags(this.segment(), 0L, value); return this; }

    /// {@return `imageCompressionFixedRateFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageCompressionFixedRateFlags(MemorySegment segment, long index) { return (int) VH_imageCompressionFixedRateFlags.get(segment, 0L, index); }
    /// {@return `imageCompressionFixedRateFlags`}
    public int imageCompressionFixedRateFlags() { return imageCompressionFixedRateFlags(this.segment(), 0L); }
    /// Sets `imageCompressionFixedRateFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageCompressionFixedRateFlags(MemorySegment segment, long index, int value) { VH_imageCompressionFixedRateFlags.set(segment, 0L, index, value); }
    /// Sets `imageCompressionFixedRateFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCompressionPropertiesEXT imageCompressionFixedRateFlags(int value) { imageCompressionFixedRateFlags(this.segment(), 0L, value); return this; }

    /// A buffer of [VkImageCompressionPropertiesEXT].
    public static final class Buffer extends VkImageCompressionPropertiesEXT {
        private final long elementCount;

        /// Creates `VkImageCompressionPropertiesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImageCompressionPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImageCompressionPropertiesEXT`
        public VkImageCompressionPropertiesEXT asSlice(long index) { return new VkImageCompressionPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImageCompressionPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImageCompressionPropertiesEXT`
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

        /// {@return `imageCompressionFlags` at the given index}
        /// @param index the index of the struct buffer
        public int imageCompressionFlagsAt(long index) { return imageCompressionFlags(this.segment(), index); }
        /// Sets `imageCompressionFlags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageCompressionFlagsAt(long index, int value) { imageCompressionFlags(this.segment(), index, value); return this; }

        /// {@return `imageCompressionFixedRateFlags` at the given index}
        /// @param index the index of the struct buffer
        public int imageCompressionFixedRateFlagsAt(long index) { return imageCompressionFixedRateFlags(this.segment(), index); }
        /// Sets `imageCompressionFixedRateFlags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageCompressionFixedRateFlagsAt(long index, int value) { imageCompressionFixedRateFlags(this.segment(), index, value); return this; }

    }
}
