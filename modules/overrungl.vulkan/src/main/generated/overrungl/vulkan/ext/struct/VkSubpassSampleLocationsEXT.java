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
import java.util.function.*;

/// ## Layout
/// ```
/// struct VkSubpassSampleLocationsEXT {
///     uint32_t subpassIndex;
///     (struct VkSampleLocationsInfoEXT) VkSampleLocationsInfoEXT sampleLocationsInfo;
/// };
/// ```
public sealed class VkSubpassSampleLocationsEXT extends GroupType {
    /// The struct layout of `VkSubpassSampleLocationsEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("subpassIndex"),
        overrungl.vulkan.ext.struct.VkSampleLocationsInfoEXT.LAYOUT.withName("sampleLocationsInfo")
    );
    /// The byte offset of `subpassIndex`.
    public static final long OFFSET_subpassIndex = LAYOUT.byteOffset(PathElement.groupElement("subpassIndex"));
    /// The memory layout of `subpassIndex`.
    public static final MemoryLayout LAYOUT_subpassIndex = LAYOUT.select(PathElement.groupElement("subpassIndex"));
    /// The [VarHandle] of `subpassIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subpassIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpassIndex"));
    /// The byte offset of `sampleLocationsInfo`.
    public static final long OFFSET_sampleLocationsInfo = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationsInfo"));
    /// The memory layout of `sampleLocationsInfo`.
    public static final MemoryLayout LAYOUT_sampleLocationsInfo = LAYOUT.select(PathElement.groupElement("sampleLocationsInfo"));

    /// Creates `VkSubpassSampleLocationsEXT` with the given segment.
    /// @param segment the memory segment
    public VkSubpassSampleLocationsEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSubpassSampleLocationsEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSubpassSampleLocationsEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassSampleLocationsEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassSampleLocationsEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkSubpassSampleLocationsEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSubpassSampleLocationsEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubpassSampleLocationsEXT`
    public static VkSubpassSampleLocationsEXT alloc(SegmentAllocator allocator) { return new VkSubpassSampleLocationsEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSubpassSampleLocationsEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubpassSampleLocationsEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSubpassSampleLocationsEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param subpassIndex `subpassIndex`
    /// @param sampleLocationsInfo `sampleLocationsInfo`
    /// @return the allocated `VkSubpassSampleLocationsEXT`
    public static VkSubpassSampleLocationsEXT allocInit(SegmentAllocator allocator, int subpassIndex, MemorySegment sampleLocationsInfo) {
        return alloc(allocator).subpassIndex(subpassIndex).sampleLocationsInfo(sampleLocationsInfo);
    }

    /// Allocates a `VkSubpassSampleLocationsEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param subpassIndex `subpassIndex`
    /// @return the allocated `VkSubpassSampleLocationsEXT`
    public static VkSubpassSampleLocationsEXT allocInit(SegmentAllocator allocator, int subpassIndex) {
        return alloc(allocator).subpassIndex(subpassIndex);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSubpassSampleLocationsEXT copyFrom(VkSubpassSampleLocationsEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `subpassIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subpassIndex(MemorySegment segment, long index) { return (int) VH_subpassIndex.get(segment, 0L, index); }
    /// {@return `subpassIndex`}
    public int subpassIndex() { return subpassIndex(this.segment(), 0L); }
    /// Sets `subpassIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subpassIndex(MemorySegment segment, long index, int value) { VH_subpassIndex.set(segment, 0L, index, value); }
    /// Sets `subpassIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassSampleLocationsEXT subpassIndex(int value) { subpassIndex(this.segment(), 0L, value); return this; }

    /// {@return `sampleLocationsInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment sampleLocationsInfo(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_sampleLocationsInfo, index), LAYOUT_sampleLocationsInfo); }
    /// {@return `sampleLocationsInfo`}
    public MemorySegment sampleLocationsInfo() { return sampleLocationsInfo(this.segment(), 0L); }
    /// Sets `sampleLocationsInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampleLocationsInfo(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_sampleLocationsInfo, index), LAYOUT_sampleLocationsInfo.byteSize()); }
    /// Sets `sampleLocationsInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassSampleLocationsEXT sampleLocationsInfo(MemorySegment value) { sampleLocationsInfo(this.segment(), 0L, value); return this; }
    /// Accepts `sampleLocationsInfo` with the given function.
    /// @param func the function
    /// @return `this`
    public VkSubpassSampleLocationsEXT sampleLocationsInfo(Consumer<overrungl.vulkan.ext.struct.VkSampleLocationsInfoEXT> func) { func.accept(overrungl.vulkan.ext.struct.VkSampleLocationsInfoEXT.of(sampleLocationsInfo())); return this; }

    /// A buffer of [VkSubpassSampleLocationsEXT].
    public static final class Buffer extends VkSubpassSampleLocationsEXT {
        private final long elementCount;

        /// Creates `VkSubpassSampleLocationsEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSubpassSampleLocationsEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSubpassSampleLocationsEXT`
        public VkSubpassSampleLocationsEXT asSlice(long index) { return new VkSubpassSampleLocationsEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSubpassSampleLocationsEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSubpassSampleLocationsEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `subpassIndex` at the given index}
        /// @param index the index of the struct buffer
        public int subpassIndexAt(long index) { return subpassIndex(this.segment(), index); }
        /// Sets `subpassIndex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer subpassIndexAt(long index, int value) { subpassIndex(this.segment(), index, value); return this; }

        /// {@return `sampleLocationsInfo` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment sampleLocationsInfoAt(long index) { return sampleLocationsInfo(this.segment(), index); }
        /// Sets `sampleLocationsInfo` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sampleLocationsInfoAt(long index, MemorySegment value) { sampleLocationsInfo(this.segment(), index, value); return this; }
        /// Accepts `sampleLocationsInfo` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer sampleLocationsInfoAt(long index, Consumer<overrungl.vulkan.ext.struct.VkSampleLocationsInfoEXT> func) { func.accept(overrungl.vulkan.ext.struct.VkSampleLocationsInfoEXT.of(sampleLocationsInfoAt(index))); return this; }

    }
}
