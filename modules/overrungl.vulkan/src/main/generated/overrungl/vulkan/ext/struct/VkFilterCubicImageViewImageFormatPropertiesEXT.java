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
/// struct VkFilterCubicImageViewImageFormatPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 filterCubic;
///     (uint32_t) VkBool32 filterCubicMinmax;
/// };
/// ```
public sealed class VkFilterCubicImageViewImageFormatPropertiesEXT extends GroupType {
    /// The struct layout of `VkFilterCubicImageViewImageFormatPropertiesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("filterCubic"),
        ValueLayout.JAVA_INT.withName("filterCubicMinmax")
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
    /// The byte offset of `filterCubic`.
    public static final long OFFSET_filterCubic = LAYOUT.byteOffset(PathElement.groupElement("filterCubic"));
    /// The memory layout of `filterCubic`.
    public static final MemoryLayout LAYOUT_filterCubic = LAYOUT.select(PathElement.groupElement("filterCubic"));
    /// The [VarHandle] of `filterCubic` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_filterCubic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterCubic"));
    /// The byte offset of `filterCubicMinmax`.
    public static final long OFFSET_filterCubicMinmax = LAYOUT.byteOffset(PathElement.groupElement("filterCubicMinmax"));
    /// The memory layout of `filterCubicMinmax`.
    public static final MemoryLayout LAYOUT_filterCubicMinmax = LAYOUT.select(PathElement.groupElement("filterCubicMinmax"));
    /// The [VarHandle] of `filterCubicMinmax` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_filterCubicMinmax = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterCubicMinmax"));

    /// Creates `VkFilterCubicImageViewImageFormatPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkFilterCubicImageViewImageFormatPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkFilterCubicImageViewImageFormatPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkFilterCubicImageViewImageFormatPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFilterCubicImageViewImageFormatPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFilterCubicImageViewImageFormatPropertiesEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkFilterCubicImageViewImageFormatPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkFilterCubicImageViewImageFormatPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFilterCubicImageViewImageFormatPropertiesEXT`
    public static VkFilterCubicImageViewImageFormatPropertiesEXT alloc(SegmentAllocator allocator) { return new VkFilterCubicImageViewImageFormatPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkFilterCubicImageViewImageFormatPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFilterCubicImageViewImageFormatPropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkFilterCubicImageViewImageFormatPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param filterCubic `filterCubic`
    /// @param filterCubicMinmax `filterCubicMinmax`
    /// @return the allocated `VkFilterCubicImageViewImageFormatPropertiesEXT`
    public static VkFilterCubicImageViewImageFormatPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int filterCubic, int filterCubicMinmax) {
        return alloc(allocator).sType(sType).pNext(pNext).filterCubic(filterCubic).filterCubicMinmax(filterCubicMinmax);
    }

    /// Allocates a `VkFilterCubicImageViewImageFormatPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param filterCubic `filterCubic`
    /// @return the allocated `VkFilterCubicImageViewImageFormatPropertiesEXT`
    public static VkFilterCubicImageViewImageFormatPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int filterCubic) {
        return alloc(allocator).sType(sType).pNext(pNext).filterCubic(filterCubic);
    }

    /// Allocates a `VkFilterCubicImageViewImageFormatPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkFilterCubicImageViewImageFormatPropertiesEXT`
    public static VkFilterCubicImageViewImageFormatPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkFilterCubicImageViewImageFormatPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkFilterCubicImageViewImageFormatPropertiesEXT`
    public static VkFilterCubicImageViewImageFormatPropertiesEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkFilterCubicImageViewImageFormatPropertiesEXT copyFrom(VkFilterCubicImageViewImageFormatPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkFilterCubicImageViewImageFormatPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkFilterCubicImageViewImageFormatPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `filterCubic` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int filterCubic(MemorySegment segment, long index) { return (int) VH_filterCubic.get(segment, 0L, index); }
    /// {@return `filterCubic`}
    public int filterCubic() { return filterCubic(this.segment(), 0L); }
    /// Sets `filterCubic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void filterCubic(MemorySegment segment, long index, int value) { VH_filterCubic.set(segment, 0L, index, value); }
    /// Sets `filterCubic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFilterCubicImageViewImageFormatPropertiesEXT filterCubic(int value) { filterCubic(this.segment(), 0L, value); return this; }

    /// {@return `filterCubicMinmax` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int filterCubicMinmax(MemorySegment segment, long index) { return (int) VH_filterCubicMinmax.get(segment, 0L, index); }
    /// {@return `filterCubicMinmax`}
    public int filterCubicMinmax() { return filterCubicMinmax(this.segment(), 0L); }
    /// Sets `filterCubicMinmax` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void filterCubicMinmax(MemorySegment segment, long index, int value) { VH_filterCubicMinmax.set(segment, 0L, index, value); }
    /// Sets `filterCubicMinmax` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFilterCubicImageViewImageFormatPropertiesEXT filterCubicMinmax(int value) { filterCubicMinmax(this.segment(), 0L, value); return this; }

    /// A buffer of [VkFilterCubicImageViewImageFormatPropertiesEXT].
    public static final class Buffer extends VkFilterCubicImageViewImageFormatPropertiesEXT {
        private final long elementCount;

        /// Creates `VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkFilterCubicImageViewImageFormatPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkFilterCubicImageViewImageFormatPropertiesEXT`
        public VkFilterCubicImageViewImageFormatPropertiesEXT asSlice(long index) { return new VkFilterCubicImageViewImageFormatPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkFilterCubicImageViewImageFormatPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkFilterCubicImageViewImageFormatPropertiesEXT`
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

        /// {@return `filterCubic` at the given index}
        /// @param index the index of the struct buffer
        public int filterCubicAt(long index) { return filterCubic(this.segment(), index); }
        /// Sets `filterCubic` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer filterCubicAt(long index, int value) { filterCubic(this.segment(), index, value); return this; }

        /// {@return `filterCubicMinmax` at the given index}
        /// @param index the index of the struct buffer
        public int filterCubicMinmaxAt(long index) { return filterCubicMinmax(this.segment(), index); }
        /// Sets `filterCubicMinmax` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer filterCubicMinmaxAt(long index, int value) { filterCubicMinmax(this.segment(), index, value); return this; }

    }
}
