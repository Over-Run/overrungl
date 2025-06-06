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
package overrungl.vulkan.qcom.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceImageProcessingFeaturesQCOM {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 textureSampleWeighted;
///     (uint32_t) VkBool32 textureBoxFilter;
///     (uint32_t) VkBool32 textureBlockMatch;
/// };
/// ```
public sealed class VkPhysicalDeviceImageProcessingFeaturesQCOM extends GroupType {
    /// The struct layout of `VkPhysicalDeviceImageProcessingFeaturesQCOM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("textureSampleWeighted"),
        ValueLayout.JAVA_INT.withName("textureBoxFilter"),
        ValueLayout.JAVA_INT.withName("textureBlockMatch")
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
    /// The byte offset of `textureSampleWeighted`.
    public static final long OFFSET_textureSampleWeighted = LAYOUT.byteOffset(PathElement.groupElement("textureSampleWeighted"));
    /// The memory layout of `textureSampleWeighted`.
    public static final MemoryLayout LAYOUT_textureSampleWeighted = LAYOUT.select(PathElement.groupElement("textureSampleWeighted"));
    /// The [VarHandle] of `textureSampleWeighted` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_textureSampleWeighted = LAYOUT.arrayElementVarHandle(PathElement.groupElement("textureSampleWeighted"));
    /// The byte offset of `textureBoxFilter`.
    public static final long OFFSET_textureBoxFilter = LAYOUT.byteOffset(PathElement.groupElement("textureBoxFilter"));
    /// The memory layout of `textureBoxFilter`.
    public static final MemoryLayout LAYOUT_textureBoxFilter = LAYOUT.select(PathElement.groupElement("textureBoxFilter"));
    /// The [VarHandle] of `textureBoxFilter` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_textureBoxFilter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("textureBoxFilter"));
    /// The byte offset of `textureBlockMatch`.
    public static final long OFFSET_textureBlockMatch = LAYOUT.byteOffset(PathElement.groupElement("textureBlockMatch"));
    /// The memory layout of `textureBlockMatch`.
    public static final MemoryLayout LAYOUT_textureBlockMatch = LAYOUT.select(PathElement.groupElement("textureBlockMatch"));
    /// The [VarHandle] of `textureBlockMatch` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_textureBlockMatch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("textureBlockMatch"));

    /// Creates `VkPhysicalDeviceImageProcessingFeaturesQCOM` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceImageProcessingFeaturesQCOM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceImageProcessingFeaturesQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceImageProcessingFeaturesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessingFeaturesQCOM(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceImageProcessingFeaturesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceImageProcessingFeaturesQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceImageProcessingFeaturesQCOM`
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageProcessingFeaturesQCOM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceImageProcessingFeaturesQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceImageProcessingFeaturesQCOM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceImageProcessingFeaturesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param textureSampleWeighted `textureSampleWeighted`
    /// @param textureBoxFilter `textureBoxFilter`
    /// @param textureBlockMatch `textureBlockMatch`
    /// @return the allocated `VkPhysicalDeviceImageProcessingFeaturesQCOM`
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int textureSampleWeighted, int textureBoxFilter, int textureBlockMatch) {
        return alloc(allocator).sType(sType).pNext(pNext).textureSampleWeighted(textureSampleWeighted).textureBoxFilter(textureBoxFilter).textureBlockMatch(textureBlockMatch);
    }

    /// Allocates a `VkPhysicalDeviceImageProcessingFeaturesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param textureSampleWeighted `textureSampleWeighted`
    /// @param textureBoxFilter `textureBoxFilter`
    /// @return the allocated `VkPhysicalDeviceImageProcessingFeaturesQCOM`
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int textureSampleWeighted, int textureBoxFilter) {
        return alloc(allocator).sType(sType).pNext(pNext).textureSampleWeighted(textureSampleWeighted).textureBoxFilter(textureBoxFilter);
    }

    /// Allocates a `VkPhysicalDeviceImageProcessingFeaturesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param textureSampleWeighted `textureSampleWeighted`
    /// @return the allocated `VkPhysicalDeviceImageProcessingFeaturesQCOM`
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int textureSampleWeighted) {
        return alloc(allocator).sType(sType).pNext(pNext).textureSampleWeighted(textureSampleWeighted);
    }

    /// Allocates a `VkPhysicalDeviceImageProcessingFeaturesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceImageProcessingFeaturesQCOM`
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceImageProcessingFeaturesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceImageProcessingFeaturesQCOM`
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceImageProcessingFeaturesQCOM copyFrom(VkPhysicalDeviceImageProcessingFeaturesQCOM src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceImageProcessingFeaturesQCOM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceImageProcessingFeaturesQCOM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `textureSampleWeighted` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int textureSampleWeighted(MemorySegment segment, long index) { return (int) VH_textureSampleWeighted.get(segment, 0L, index); }
    /// {@return `textureSampleWeighted`}
    public int textureSampleWeighted() { return textureSampleWeighted(this.segment(), 0L); }
    /// Sets `textureSampleWeighted` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void textureSampleWeighted(MemorySegment segment, long index, int value) { VH_textureSampleWeighted.set(segment, 0L, index, value); }
    /// Sets `textureSampleWeighted` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureSampleWeighted(int value) { textureSampleWeighted(this.segment(), 0L, value); return this; }

    /// {@return `textureBoxFilter` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int textureBoxFilter(MemorySegment segment, long index) { return (int) VH_textureBoxFilter.get(segment, 0L, index); }
    /// {@return `textureBoxFilter`}
    public int textureBoxFilter() { return textureBoxFilter(this.segment(), 0L); }
    /// Sets `textureBoxFilter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void textureBoxFilter(MemorySegment segment, long index, int value) { VH_textureBoxFilter.set(segment, 0L, index, value); }
    /// Sets `textureBoxFilter` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureBoxFilter(int value) { textureBoxFilter(this.segment(), 0L, value); return this; }

    /// {@return `textureBlockMatch` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int textureBlockMatch(MemorySegment segment, long index) { return (int) VH_textureBlockMatch.get(segment, 0L, index); }
    /// {@return `textureBlockMatch`}
    public int textureBlockMatch() { return textureBlockMatch(this.segment(), 0L); }
    /// Sets `textureBlockMatch` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void textureBlockMatch(MemorySegment segment, long index, int value) { VH_textureBlockMatch.set(segment, 0L, index, value); }
    /// Sets `textureBlockMatch` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureBlockMatch(int value) { textureBlockMatch(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceImageProcessingFeaturesQCOM].
    public static final class Buffer extends VkPhysicalDeviceImageProcessingFeaturesQCOM {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceImageProcessingFeaturesQCOM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceImageProcessingFeaturesQCOM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceImageProcessingFeaturesQCOM`
        public VkPhysicalDeviceImageProcessingFeaturesQCOM asSlice(long index) { return new VkPhysicalDeviceImageProcessingFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceImageProcessingFeaturesQCOM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceImageProcessingFeaturesQCOM`
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

        /// {@return `textureSampleWeighted` at the given index}
        /// @param index the index of the struct buffer
        public int textureSampleWeightedAt(long index) { return textureSampleWeighted(this.segment(), index); }
        /// Sets `textureSampleWeighted` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer textureSampleWeightedAt(long index, int value) { textureSampleWeighted(this.segment(), index, value); return this; }

        /// {@return `textureBoxFilter` at the given index}
        /// @param index the index of the struct buffer
        public int textureBoxFilterAt(long index) { return textureBoxFilter(this.segment(), index); }
        /// Sets `textureBoxFilter` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer textureBoxFilterAt(long index, int value) { textureBoxFilter(this.segment(), index, value); return this; }

        /// {@return `textureBlockMatch` at the given index}
        /// @param index the index of the struct buffer
        public int textureBlockMatchAt(long index) { return textureBlockMatch(this.segment(), index); }
        /// Sets `textureBlockMatch` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer textureBlockMatchAt(long index, int value) { textureBlockMatch(this.segment(), index, value); return this; }

    }
}
