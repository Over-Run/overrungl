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
/// struct VkSpecializationMapEntry {
///     uint32_t constantID;
///     uint32_t offset;
///     size_t size;
/// };
/// ```
public sealed class VkSpecializationMapEntry extends GroupType {
    /// The struct layout of `VkSpecializationMapEntry`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("constantID"),
        ValueLayout.JAVA_INT.withName("offset"),
        CanonicalTypes.SIZE_T.withName("size")
    );
    /// The byte offset of `constantID`.
    public static final long OFFSET_constantID = LAYOUT.byteOffset(PathElement.groupElement("constantID"));
    /// The memory layout of `constantID`.
    public static final MemoryLayout LAYOUT_constantID = LAYOUT.select(PathElement.groupElement("constantID"));
    /// The [VarHandle] of `constantID` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_constantID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constantID"));
    /// The byte offset of `offset`.
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    /// The memory layout of `offset`.
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    /// Creates `VkSpecializationMapEntry` with the given segment.
    /// @param segment the memory segment
    public VkSpecializationMapEntry(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSpecializationMapEntry` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSpecializationMapEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSpecializationMapEntry ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSpecializationMapEntry(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkSpecializationMapEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSpecializationMapEntry` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSpecializationMapEntry`
    public static VkSpecializationMapEntry alloc(SegmentAllocator allocator) { return new VkSpecializationMapEntry(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSpecializationMapEntry` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSpecializationMapEntry`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSpecializationMapEntry` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param constantID `constantID`
    /// @param offset `offset`
    /// @param size `size`
    /// @return the allocated `VkSpecializationMapEntry`
    public static VkSpecializationMapEntry allocInit(SegmentAllocator allocator, int constantID, int offset, long size) {
        return alloc(allocator).constantID(constantID).offset(offset).size(size);
    }

    /// Allocates a `VkSpecializationMapEntry` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param constantID `constantID`
    /// @param offset `offset`
    /// @return the allocated `VkSpecializationMapEntry`
    public static VkSpecializationMapEntry allocInit(SegmentAllocator allocator, int constantID, int offset) {
        return alloc(allocator).constantID(constantID).offset(offset);
    }

    /// Allocates a `VkSpecializationMapEntry` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param constantID `constantID`
    /// @return the allocated `VkSpecializationMapEntry`
    public static VkSpecializationMapEntry allocInit(SegmentAllocator allocator, int constantID) {
        return alloc(allocator).constantID(constantID);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSpecializationMapEntry copyFrom(VkSpecializationMapEntry src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `constantID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int constantID(MemorySegment segment, long index) { return (int) VH_constantID.get(segment, 0L, index); }
    /// {@return `constantID`}
    public int constantID() { return constantID(this.segment(), 0L); }
    /// Sets `constantID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void constantID(MemorySegment segment, long index, int value) { VH_constantID.set(segment, 0L, index, value); }
    /// Sets `constantID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSpecializationMapEntry constantID(int value) { constantID(this.segment(), 0L, value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int offset(MemorySegment segment, long index) { return (int) VH_offset.get(segment, 0L, index); }
    /// {@return `offset`}
    public int offset() { return offset(this.segment(), 0L); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void offset(MemorySegment segment, long index, int value) { VH_offset.set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSpecializationMapEntry offset(int value) { offset(this.segment(), 0L, value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long size(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_size.get(segment, 0L, index)); }
    /// {@return `size`}
    public long size() { return size(this.segment(), 0L); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void size(MemorySegment segment, long index, long value) { VH_size.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSpecializationMapEntry size(long value) { size(this.segment(), 0L, value); return this; }

    /// A buffer of [VkSpecializationMapEntry].
    public static final class Buffer extends VkSpecializationMapEntry {
        private final long elementCount;

        /// Creates `VkSpecializationMapEntry.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSpecializationMapEntry`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSpecializationMapEntry`
        public VkSpecializationMapEntry asSlice(long index) { return new VkSpecializationMapEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSpecializationMapEntry`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSpecializationMapEntry`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `constantID` at the given index}
        /// @param index the index of the struct buffer
        public int constantIDAt(long index) { return constantID(this.segment(), index); }
        /// Sets `constantID` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer constantIDAt(long index, int value) { constantID(this.segment(), index, value); return this; }

        /// {@return `offset` at the given index}
        /// @param index the index of the struct buffer
        public int offsetAt(long index) { return offset(this.segment(), index); }
        /// Sets `offset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer offsetAt(long index, int value) { offset(this.segment(), index, value); return this; }

        /// {@return `size` at the given index}
        /// @param index the index of the struct buffer
        public long sizeAt(long index) { return size(this.segment(), index); }
        /// Sets `size` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sizeAt(long index, long value) { size(this.segment(), index, value); return this; }

    }
}
