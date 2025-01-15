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
/// ### attachmentIndex
/// [VarHandle][#VH_attachmentIndex] - [Getter][#attachmentIndex()] - [Setter][#attachmentIndex(int)]
/// ### sampleLocationsInfo
/// [Byte offset][#OFFSET_sampleLocationsInfo] - [Memory layout][#ML_sampleLocationsInfo] - [Getter][#sampleLocationsInfo()] - [Setter][#sampleLocationsInfo(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAttachmentSampleLocationsEXT {
///     uint32_t attachmentIndex;
///     VkSampleLocationsInfoEXT sampleLocationsInfo;
/// } VkAttachmentSampleLocationsEXT;
/// ```
public sealed class VkAttachmentSampleLocationsEXT extends Struct {
    /// The struct layout of `VkAttachmentSampleLocationsEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("attachmentIndex"),
        overrungl.vulkan.ext.struct.VkSampleLocationsInfoEXT.LAYOUT.withName("sampleLocationsInfo")
    );
    /// The [VarHandle] of `attachmentIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_attachmentIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentIndex"));
    /// The byte offset of `sampleLocationsInfo`.
    public static final long OFFSET_sampleLocationsInfo = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationsInfo"));
    /// The memory layout of `sampleLocationsInfo`.
    public static final MemoryLayout ML_sampleLocationsInfo = LAYOUT.select(PathElement.groupElement("sampleLocationsInfo"));

    /// Creates `VkAttachmentSampleLocationsEXT` with the given segment.
    /// @param segment the memory segment
    public VkAttachmentSampleLocationsEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAttachmentSampleLocationsEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentSampleLocationsEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAttachmentSampleLocationsEXT(segment); }

    /// Creates `VkAttachmentSampleLocationsEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAttachmentSampleLocationsEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentSampleLocationsEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAttachmentSampleLocationsEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAttachmentSampleLocationsEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAttachmentSampleLocationsEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAttachmentSampleLocationsEXT`
    public static VkAttachmentSampleLocationsEXT alloc(SegmentAllocator allocator) { return new VkAttachmentSampleLocationsEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAttachmentSampleLocationsEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAttachmentSampleLocationsEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAttachmentSampleLocationsEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAttachmentSampleLocationsEXT`
    public static VkAttachmentSampleLocationsEXT allocInit(SegmentAllocator allocator, @CType("uint32_t") int attachmentIndex, @CType("VkSampleLocationsInfoEXT") java.lang.foreign.MemorySegment sampleLocationsInfo) { return alloc(allocator).attachmentIndex(attachmentIndex).sampleLocationsInfo(sampleLocationsInfo); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAttachmentSampleLocationsEXT copyFrom(VkAttachmentSampleLocationsEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `attachmentIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_attachmentIndex(MemorySegment segment, long index) { return (int) VH_attachmentIndex.get(segment, 0L, index); }
    /// {@return `attachmentIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_attachmentIndex(MemorySegment segment) { return VkAttachmentSampleLocationsEXT.get_attachmentIndex(segment, 0L); }
    /// {@return `attachmentIndex`}
    public @CType("uint32_t") int attachmentIndex() { return VkAttachmentSampleLocationsEXT.get_attachmentIndex(this.segment()); }
    /// Sets `attachmentIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_attachmentIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_attachmentIndex.set(segment, 0L, index, value); }
    /// Sets `attachmentIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_attachmentIndex(MemorySegment segment, @CType("uint32_t") int value) { VkAttachmentSampleLocationsEXT.set_attachmentIndex(segment, 0L, value); }
    /// Sets `attachmentIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentSampleLocationsEXT attachmentIndex(@CType("uint32_t") int value) { VkAttachmentSampleLocationsEXT.set_attachmentIndex(this.segment(), value); return this; }

    /// {@return `sampleLocationsInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleLocationsInfoEXT") java.lang.foreign.MemorySegment get_sampleLocationsInfo(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_sampleLocationsInfo, index), ML_sampleLocationsInfo); }
    /// {@return `sampleLocationsInfo`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleLocationsInfoEXT") java.lang.foreign.MemorySegment get_sampleLocationsInfo(MemorySegment segment) { return VkAttachmentSampleLocationsEXT.get_sampleLocationsInfo(segment, 0L); }
    /// {@return `sampleLocationsInfo`}
    public @CType("VkSampleLocationsInfoEXT") java.lang.foreign.MemorySegment sampleLocationsInfo() { return VkAttachmentSampleLocationsEXT.get_sampleLocationsInfo(this.segment()); }
    /// Sets `sampleLocationsInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampleLocationsInfo(MemorySegment segment, long index, @CType("VkSampleLocationsInfoEXT") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_sampleLocationsInfo, index), ML_sampleLocationsInfo.byteSize()); }
    /// Sets `sampleLocationsInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampleLocationsInfo(MemorySegment segment, @CType("VkSampleLocationsInfoEXT") java.lang.foreign.MemorySegment value) { VkAttachmentSampleLocationsEXT.set_sampleLocationsInfo(segment, 0L, value); }
    /// Sets `sampleLocationsInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentSampleLocationsEXT sampleLocationsInfo(@CType("VkSampleLocationsInfoEXT") java.lang.foreign.MemorySegment value) { VkAttachmentSampleLocationsEXT.set_sampleLocationsInfo(this.segment(), value); return this; }

    /// A buffer of [VkAttachmentSampleLocationsEXT].
    public static final class Buffer extends VkAttachmentSampleLocationsEXT {
        private final long elementCount;

        /// Creates `VkAttachmentSampleLocationsEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAttachmentSampleLocationsEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAttachmentSampleLocationsEXT`
        public VkAttachmentSampleLocationsEXT asSlice(long index) { return new VkAttachmentSampleLocationsEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAttachmentSampleLocationsEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAttachmentSampleLocationsEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `attachmentIndex` at the given index}
        /// @param index the index
        public @CType("uint32_t") int attachmentIndexAt(long index) { return VkAttachmentSampleLocationsEXT.get_attachmentIndex(this.segment(), index); }
        /// Sets `attachmentIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer attachmentIndexAt(long index, @CType("uint32_t") int value) { VkAttachmentSampleLocationsEXT.set_attachmentIndex(this.segment(), index, value); return this; }

        /// {@return `sampleLocationsInfo` at the given index}
        /// @param index the index
        public @CType("VkSampleLocationsInfoEXT") java.lang.foreign.MemorySegment sampleLocationsInfoAt(long index) { return VkAttachmentSampleLocationsEXT.get_sampleLocationsInfo(this.segment(), index); }
        /// Sets `sampleLocationsInfo` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sampleLocationsInfoAt(long index, @CType("VkSampleLocationsInfoEXT") java.lang.foreign.MemorySegment value) { VkAttachmentSampleLocationsEXT.set_sampleLocationsInfo(this.segment(), index, value); return this; }

    }
}
