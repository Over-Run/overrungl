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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### subpassIndex
/// [VarHandle][#VH_subpassIndex] - [Getter][#subpassIndex()] - [Setter][#subpassIndex(int)]
/// ### sampleLocationsInfo
/// [Byte offset][#OFFSET_sampleLocationsInfo] - [Memory layout][#ML_sampleLocationsInfo] - [Getter][#sampleLocationsInfo()] - [Setter][#sampleLocationsInfo(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSubpassSampleLocationsEXT {
///     uint32_t subpassIndex;
///     VkSampleLocationsInfoEXT sampleLocationsInfo;
/// } VkSubpassSampleLocationsEXT;
/// ```
public sealed class VkSubpassSampleLocationsEXT extends Struct {
    /// The struct layout of `VkSubpassSampleLocationsEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("subpassIndex"),
        overrungl.vulkan.ext.struct.VkSampleLocationsInfoEXT.LAYOUT.withName("sampleLocationsInfo")
    );
    /// The [VarHandle] of `subpassIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subpassIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpassIndex"));
    /// The byte offset of `sampleLocationsInfo`.
    public static final long OFFSET_sampleLocationsInfo = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationsInfo"));
    /// The memory layout of `sampleLocationsInfo`.
    public static final MemoryLayout ML_sampleLocationsInfo = LAYOUT.select(PathElement.groupElement("sampleLocationsInfo"));

    /// Creates `VkSubpassSampleLocationsEXT` with the given segment.
    /// @param segment the memory segment
    public VkSubpassSampleLocationsEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSubpassSampleLocationsEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassSampleLocationsEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubpassSampleLocationsEXT(segment); }

    /// Creates `VkSubpassSampleLocationsEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSubpassSampleLocationsEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassSampleLocationsEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubpassSampleLocationsEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSubpassSampleLocationsEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSubpassSampleLocationsEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubpassSampleLocationsEXT`
    public static VkSubpassSampleLocationsEXT alloc(SegmentAllocator allocator) { return new VkSubpassSampleLocationsEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSubpassSampleLocationsEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubpassSampleLocationsEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSubpassSampleLocationsEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubpassSampleLocationsEXT`
    public static VkSubpassSampleLocationsEXT allocInit(SegmentAllocator allocator, @CType("uint32_t") int subpassIndex, @CType("VkSampleLocationsInfoEXT") MemorySegment sampleLocationsInfo) { return alloc(allocator).subpassIndex(subpassIndex).sampleLocationsInfo(sampleLocationsInfo); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSubpassSampleLocationsEXT copyFrom(VkSubpassSampleLocationsEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `subpassIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_subpassIndex(MemorySegment segment, long index) { return (int) VH_subpassIndex.get(segment, 0L, index); }
    /// {@return `subpassIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_subpassIndex(MemorySegment segment) { return VkSubpassSampleLocationsEXT.get_subpassIndex(segment, 0L); }
    /// {@return `subpassIndex`}
    public @CType("uint32_t") int subpassIndex() { return VkSubpassSampleLocationsEXT.get_subpassIndex(this.segment()); }
    /// Sets `subpassIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subpassIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_subpassIndex.set(segment, 0L, index, value); }
    /// Sets `subpassIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subpassIndex(MemorySegment segment, @CType("uint32_t") int value) { VkSubpassSampleLocationsEXT.set_subpassIndex(segment, 0L, value); }
    /// Sets `subpassIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassSampleLocationsEXT subpassIndex(@CType("uint32_t") int value) { VkSubpassSampleLocationsEXT.set_subpassIndex(this.segment(), value); return this; }

    /// {@return `sampleLocationsInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleLocationsInfoEXT") MemorySegment get_sampleLocationsInfo(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_sampleLocationsInfo, index), ML_sampleLocationsInfo); }
    /// {@return `sampleLocationsInfo`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleLocationsInfoEXT") MemorySegment get_sampleLocationsInfo(MemorySegment segment) { return VkSubpassSampleLocationsEXT.get_sampleLocationsInfo(segment, 0L); }
    /// {@return `sampleLocationsInfo`}
    public @CType("VkSampleLocationsInfoEXT") MemorySegment sampleLocationsInfo() { return VkSubpassSampleLocationsEXT.get_sampleLocationsInfo(this.segment()); }
    /// Sets `sampleLocationsInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampleLocationsInfo(MemorySegment segment, long index, @CType("VkSampleLocationsInfoEXT") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_sampleLocationsInfo, index), ML_sampleLocationsInfo.byteSize()); }
    /// Sets `sampleLocationsInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampleLocationsInfo(MemorySegment segment, @CType("VkSampleLocationsInfoEXT") MemorySegment value) { VkSubpassSampleLocationsEXT.set_sampleLocationsInfo(segment, 0L, value); }
    /// Sets `sampleLocationsInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassSampleLocationsEXT sampleLocationsInfo(@CType("VkSampleLocationsInfoEXT") MemorySegment value) { VkSubpassSampleLocationsEXT.set_sampleLocationsInfo(this.segment(), value); return this; }

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
        /// @param index the index
        public @CType("uint32_t") int subpassIndexAt(long index) { return VkSubpassSampleLocationsEXT.get_subpassIndex(this.segment(), index); }
        /// Sets `subpassIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer subpassIndexAt(long index, @CType("uint32_t") int value) { VkSubpassSampleLocationsEXT.set_subpassIndex(this.segment(), index, value); return this; }

        /// {@return `sampleLocationsInfo` at the given index}
        /// @param index the index
        public @CType("VkSampleLocationsInfoEXT") MemorySegment sampleLocationsInfoAt(long index) { return VkSubpassSampleLocationsEXT.get_sampleLocationsInfo(this.segment(), index); }
        /// Sets `sampleLocationsInfo` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sampleLocationsInfoAt(long index, @CType("VkSampleLocationsInfoEXT") MemorySegment value) { VkSubpassSampleLocationsEXT.set_sampleLocationsInfo(this.segment(), index, value); return this; }

    }
}
