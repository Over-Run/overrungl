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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPartitionedAccelerationStructureWritePartitionTranslationDataNV {
///     uint32_t partitionIndex;
///     float partitionTranslation[3];
/// };
/// ```
public sealed class VkPartitionedAccelerationStructureWritePartitionTranslationDataNV extends GroupType {
    /// The struct layout of `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("partitionIndex"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_FLOAT).withName("partitionTranslation")
    );
    /// The byte offset of `partitionIndex`.
    public static final long OFFSET_partitionIndex = LAYOUT.byteOffset(PathElement.groupElement("partitionIndex"));
    /// The memory layout of `partitionIndex`.
    public static final MemoryLayout LAYOUT_partitionIndex = LAYOUT.select(PathElement.groupElement("partitionIndex"));
    /// The [VarHandle] of `partitionIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_partitionIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("partitionIndex"));
    /// The byte offset of `partitionTranslation`.
    public static final long OFFSET_partitionTranslation = LAYOUT.byteOffset(PathElement.groupElement("partitionTranslation"));
    /// The memory layout of `partitionTranslation`.
    public static final MemoryLayout LAYOUT_partitionTranslation = LAYOUT.select(PathElement.groupElement("partitionTranslation"));
    /// The [VarHandle] of `partitionTranslation` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_partitionTranslation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("partitionTranslation"), PathElement.sequenceElement());

    /// Creates `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV` with the given segment.
    /// @param segment the memory segment
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV`
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV alloc(SegmentAllocator allocator) { return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param partitionIndex `partitionIndex`
    /// @param partitionTranslation `partitionTranslation`
    /// @return the allocated `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV`
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV allocInit(SegmentAllocator allocator, int partitionIndex, MemorySegment partitionTranslation) {
        return alloc(allocator).partitionIndex(partitionIndex).partitionTranslation(partitionTranslation);
    }

    /// Allocates a `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param partitionIndex `partitionIndex`
    /// @return the allocated `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV`
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV allocInit(SegmentAllocator allocator, int partitionIndex) {
        return alloc(allocator).partitionIndex(partitionIndex);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV copyFrom(VkPartitionedAccelerationStructureWritePartitionTranslationDataNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `partitionIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int partitionIndex(MemorySegment segment, long index) { return (int) VH_partitionIndex.get(segment, 0L, index); }
    /// {@return `partitionIndex`}
    public int partitionIndex() { return partitionIndex(this.segment(), 0L); }
    /// Sets `partitionIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void partitionIndex(MemorySegment segment, long index, int value) { VH_partitionIndex.set(segment, 0L, index, value); }
    /// Sets `partitionIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV partitionIndex(int value) { partitionIndex(this.segment(), 0L, value); return this; }

    /// {@return `partitionTranslation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment partitionTranslation(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_partitionTranslation, index), LAYOUT_partitionTranslation); }
    /// {@return `partitionTranslation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static float partitionTranslation(MemorySegment segment, long index, long index0) { return (float) VH_partitionTranslation.get(segment, 0L, index, index0); }
    /// {@return `partitionTranslation`}
    public MemorySegment partitionTranslation() { return partitionTranslation(this.segment(), 0L); }
    /// {@return `partitionTranslation`}
    /// @param index0 the Index 0 of the array
    public float partitionTranslation(long index0) { return partitionTranslation(this.segment(), 0L, index0); }
    /// Sets `partitionTranslation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void partitionTranslation(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_partitionTranslation, index), LAYOUT_partitionTranslation.byteSize()); }
    /// Sets `partitionTranslation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void partitionTranslation(MemorySegment segment, long index, long index0, float value) { VH_partitionTranslation.set(segment, 0L, index, index0, value); }
    /// Sets `partitionTranslation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV partitionTranslation(MemorySegment value) { partitionTranslation(this.segment(), 0L, value); return this; }
    /// Sets `partitionTranslation` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV partitionTranslation(long index0, float value) { partitionTranslation(this.segment(), 0L, index0, value); return this; }

    /// A buffer of [VkPartitionedAccelerationStructureWritePartitionTranslationDataNV].
    public static final class Buffer extends VkPartitionedAccelerationStructureWritePartitionTranslationDataNV {
        private final long elementCount;

        /// Creates `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV`
        public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV asSlice(long index) { return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `partitionIndex` at the given index}
        /// @param index the index of the struct buffer
        public int partitionIndexAt(long index) { return partitionIndex(this.segment(), index); }
        /// Sets `partitionIndex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer partitionIndexAt(long index, int value) { partitionIndex(this.segment(), index, value); return this; }

        /// {@return `partitionTranslation` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment partitionTranslationAt(long index) { return partitionTranslation(this.segment(), index); }
        /// {@return `partitionTranslation` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public float partitionTranslationAt(long index, long index0) { return partitionTranslation(this.segment(), index, index0); }
        /// Sets `partitionTranslation` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer partitionTranslationAt(long index, MemorySegment value) { partitionTranslation(this.segment(), index, value); return this; }
        /// Sets `partitionTranslation` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer partitionTranslationAt(long index, long index0, float value) { partitionTranslation(this.segment(), index, index0, value); return this; }

    }
}
