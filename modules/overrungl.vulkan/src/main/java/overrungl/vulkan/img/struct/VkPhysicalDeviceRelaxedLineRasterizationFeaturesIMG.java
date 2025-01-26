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
package overrungl.vulkan.img.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 relaxedLineRasterization;
/// };
/// ```
public sealed class VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG extends GroupType {
    /// The struct layout of `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("relaxedLineRasterization")
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
    /// The byte offset of `relaxedLineRasterization`.
    public static final long OFFSET_relaxedLineRasterization = LAYOUT.byteOffset(PathElement.groupElement("relaxedLineRasterization"));
    /// The memory layout of `relaxedLineRasterization`.
    public static final MemoryLayout LAYOUT_relaxedLineRasterization = LAYOUT.select(PathElement.groupElement("relaxedLineRasterization"));
    /// The [VarHandle] of `relaxedLineRasterization` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_relaxedLineRasterization = LAYOUT.arrayElementVarHandle(PathElement.groupElement("relaxedLineRasterization"));

    /// Creates `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG`
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG copyFrom(VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `relaxedLineRasterization` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int relaxedLineRasterization(MemorySegment segment, long index) { return (int) VH_relaxedLineRasterization.get(segment, 0L, index); }
    /// {@return `relaxedLineRasterization`}
    public int relaxedLineRasterization() { return relaxedLineRasterization(this.segment(), 0L); }
    /// Sets `relaxedLineRasterization` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void relaxedLineRasterization(MemorySegment segment, long index, int value) { VH_relaxedLineRasterization.set(segment, 0L, index, value); }
    /// Sets `relaxedLineRasterization` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG relaxedLineRasterization(int value) { relaxedLineRasterization(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG].
    public static final class Buffer extends VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG`
        public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG asSlice(long index) { return new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG`
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

        /// {@return `relaxedLineRasterization` at the given index}
        /// @param index the index of the struct buffer
        public int relaxedLineRasterizationAt(long index) { return relaxedLineRasterization(this.segment(), index); }
        /// Sets `relaxedLineRasterization` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer relaxedLineRasterizationAt(long index, int value) { relaxedLineRasterization(this.segment(), index, value); return this; }

    }
}
