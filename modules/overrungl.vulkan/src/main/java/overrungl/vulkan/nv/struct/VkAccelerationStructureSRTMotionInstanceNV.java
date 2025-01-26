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
/// struct VkAccelerationStructureSRTMotionInstanceNV {
///     (struct VkSRTDataNV) VkSRTDataNV transformT0;
///     (struct VkSRTDataNV) VkSRTDataNV transformT1;
///     uint32_t instanceCustomIndex : 24;
///     uint32_t mask : 8;
///     uint32_t instanceShaderBindingTableRecordOffset : 24;
///     ((uint32_t) VkFlags) VkGeometryInstanceFlagsKHR flags : 8;
///     uint64_t accelerationStructureReference;
/// };
/// ```
public sealed class VkAccelerationStructureSRTMotionInstanceNV extends GroupType {
    /// The struct layout of `VkAccelerationStructureSRTMotionInstanceNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.bitfields(
        overrungl.vulkan.nv.struct.VkSRTDataNV.LAYOUT.withName("transformT0"), -1,
        overrungl.vulkan.nv.struct.VkSRTDataNV.LAYOUT.withName("transformT1"), -1,
        ValueLayout.JAVA_INT.withName("instanceCustomIndex"), 24,
        ValueLayout.JAVA_INT.withName("mask"), 8,
        ValueLayout.JAVA_INT.withName("instanceShaderBindingTableRecordOffset"), 24,
        ValueLayout.JAVA_INT.withName("flags"), 8,
        ValueLayout.JAVA_LONG.withName("accelerationStructureReference"), -1
    );
    /// The byte offset of `transformT0`.
    public static final long OFFSET_transformT0 = LAYOUT.byteOffset(PathElement.groupElement("transformT0"));
    /// The memory layout of `transformT0`.
    public static final MemoryLayout LAYOUT_transformT0 = LAYOUT.select(PathElement.groupElement("transformT0"));
    /// The byte offset of `transformT1`.
    public static final long OFFSET_transformT1 = LAYOUT.byteOffset(PathElement.groupElement("transformT1"));
    /// The memory layout of `transformT1`.
    public static final MemoryLayout LAYOUT_transformT1 = LAYOUT.select(PathElement.groupElement("transformT1"));
    /// The byte offset of `accelerationStructureReference`.
    public static final long OFFSET_accelerationStructureReference = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureReference"));
    /// The memory layout of `accelerationStructureReference`.
    public static final MemoryLayout LAYOUT_accelerationStructureReference = LAYOUT.select(PathElement.groupElement("accelerationStructureReference"));
    /// The [VarHandle] of `accelerationStructureReference` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_accelerationStructureReference = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureReference"));

    /// Creates `VkAccelerationStructureSRTMotionInstanceNV` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureSRTMotionInstanceNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureSRTMotionInstanceNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureSRTMotionInstanceNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureSRTMotionInstanceNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureSRTMotionInstanceNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureSRTMotionInstanceNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAccelerationStructureSRTMotionInstanceNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureSRTMotionInstanceNV`
    public static VkAccelerationStructureSRTMotionInstanceNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureSRTMotionInstanceNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureSRTMotionInstanceNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureSRTMotionInstanceNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureSRTMotionInstanceNV copyFrom(VkAccelerationStructureSRTMotionInstanceNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `transformT0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment transformT0(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_transformT0, index), LAYOUT_transformT0); }
    /// {@return `transformT0`}
    public MemorySegment transformT0() { return transformT0(this.segment(), 0L); }
    /// Sets `transformT0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void transformT0(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_transformT0, index), LAYOUT_transformT0.byteSize()); }
    /// Sets `transformT0` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureSRTMotionInstanceNV transformT0(MemorySegment value) { transformT0(this.segment(), 0L, value); return this; }

    /// {@return `transformT1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment transformT1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_transformT1, index), LAYOUT_transformT1); }
    /// {@return `transformT1`}
    public MemorySegment transformT1() { return transformT1(this.segment(), 0L); }
    /// Sets `transformT1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void transformT1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_transformT1, index), LAYOUT_transformT1.byteSize()); }
    /// Sets `transformT1` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureSRTMotionInstanceNV transformT1(MemorySegment value) { transformT1(this.segment(), 0L, value); return this; }

    /// {@return `accelerationStructureReference` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long accelerationStructureReference(MemorySegment segment, long index) { return (long) VH_accelerationStructureReference.get(segment, 0L, index); }
    /// {@return `accelerationStructureReference`}
    public long accelerationStructureReference() { return accelerationStructureReference(this.segment(), 0L); }
    /// Sets `accelerationStructureReference` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void accelerationStructureReference(MemorySegment segment, long index, long value) { VH_accelerationStructureReference.set(segment, 0L, index, value); }
    /// Sets `accelerationStructureReference` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureSRTMotionInstanceNV accelerationStructureReference(long value) { accelerationStructureReference(this.segment(), 0L, value); return this; }

    /// A buffer of [VkAccelerationStructureSRTMotionInstanceNV].
    public static final class Buffer extends VkAccelerationStructureSRTMotionInstanceNV {
        private final long elementCount;

        /// Creates `VkAccelerationStructureSRTMotionInstanceNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAccelerationStructureSRTMotionInstanceNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAccelerationStructureSRTMotionInstanceNV`
        public VkAccelerationStructureSRTMotionInstanceNV asSlice(long index) { return new VkAccelerationStructureSRTMotionInstanceNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAccelerationStructureSRTMotionInstanceNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAccelerationStructureSRTMotionInstanceNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `transformT0` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment transformT0At(long index) { return transformT0(this.segment(), index); }
        /// Sets `transformT0` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer transformT0At(long index, MemorySegment value) { transformT0(this.segment(), index, value); return this; }

        /// {@return `transformT1` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment transformT1At(long index) { return transformT1(this.segment(), index); }
        /// Sets `transformT1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer transformT1At(long index, MemorySegment value) { transformT1(this.segment(), index, value); return this; }

        /// {@return `accelerationStructureReference` at the given index}
        /// @param index the index of the struct buffer
        public long accelerationStructureReferenceAt(long index) { return accelerationStructureReference(this.segment(), index); }
        /// Sets `accelerationStructureReference` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer accelerationStructureReferenceAt(long index, long value) { accelerationStructureReference(this.segment(), index, value); return this; }

    }
}
