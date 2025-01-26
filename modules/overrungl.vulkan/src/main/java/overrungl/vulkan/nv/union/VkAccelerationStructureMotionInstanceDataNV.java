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
package overrungl.vulkan.nv.union;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// union VkAccelerationStructureMotionInstanceDataNV {
///     (struct VkAccelerationStructureInstanceKHR) VkAccelerationStructureInstanceKHR staticInstance;
///     (struct VkAccelerationStructureMatrixMotionInstanceNV) VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance;
///     (struct VkAccelerationStructureSRTMotionInstanceNV) VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance;
/// };
/// ```
public sealed class VkAccelerationStructureMotionInstanceDataNV extends GroupType {
    /// The union layout of `VkAccelerationStructureMotionInstanceDataNV`.
    public static final GroupLayout LAYOUT = MemoryLayout.unionLayout(
        overrungl.vulkan.khr.struct.VkAccelerationStructureInstanceKHR.LAYOUT.withName("staticInstance"),
        overrungl.vulkan.nv.struct.VkAccelerationStructureMatrixMotionInstanceNV.LAYOUT.withName("matrixMotionInstance"),
        overrungl.vulkan.nv.struct.VkAccelerationStructureSRTMotionInstanceNV.LAYOUT.withName("srtMotionInstance")
    );
    /// The byte offset of `staticInstance`.
    public static final long OFFSET_staticInstance = LAYOUT.byteOffset(PathElement.groupElement("staticInstance"));
    /// The memory layout of `staticInstance`.
    public static final MemoryLayout LAYOUT_staticInstance = LAYOUT.select(PathElement.groupElement("staticInstance"));
    /// The byte offset of `matrixMotionInstance`.
    public static final long OFFSET_matrixMotionInstance = LAYOUT.byteOffset(PathElement.groupElement("matrixMotionInstance"));
    /// The memory layout of `matrixMotionInstance`.
    public static final MemoryLayout LAYOUT_matrixMotionInstance = LAYOUT.select(PathElement.groupElement("matrixMotionInstance"));
    /// The byte offset of `srtMotionInstance`.
    public static final long OFFSET_srtMotionInstance = LAYOUT.byteOffset(PathElement.groupElement("srtMotionInstance"));
    /// The memory layout of `srtMotionInstance`.
    public static final MemoryLayout LAYOUT_srtMotionInstance = LAYOUT.select(PathElement.groupElement("srtMotionInstance"));

    /// Creates `VkAccelerationStructureMotionInstanceDataNV` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureMotionInstanceDataNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureMotionInstanceDataNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureMotionInstanceDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureMotionInstanceDataNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureMotionInstanceDataNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureMotionInstanceDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAccelerationStructureMotionInstanceDataNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureMotionInstanceDataNV`
    public static VkAccelerationStructureMotionInstanceDataNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureMotionInstanceDataNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureMotionInstanceDataNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureMotionInstanceDataNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureMotionInstanceDataNV copyFrom(VkAccelerationStructureMotionInstanceDataNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `staticInstance` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment staticInstance(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_staticInstance, index), LAYOUT_staticInstance); }
    /// {@return `staticInstance`}
    public MemorySegment staticInstance() { return staticInstance(this.segment(), 0L); }
    /// Sets `staticInstance` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void staticInstance(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_staticInstance, index), LAYOUT_staticInstance.byteSize()); }
    /// Sets `staticInstance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInstanceDataNV staticInstance(MemorySegment value) { staticInstance(this.segment(), 0L, value); return this; }

    /// {@return `matrixMotionInstance` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment matrixMotionInstance(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_matrixMotionInstance, index), LAYOUT_matrixMotionInstance); }
    /// {@return `matrixMotionInstance`}
    public MemorySegment matrixMotionInstance() { return matrixMotionInstance(this.segment(), 0L); }
    /// Sets `matrixMotionInstance` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void matrixMotionInstance(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_matrixMotionInstance, index), LAYOUT_matrixMotionInstance.byteSize()); }
    /// Sets `matrixMotionInstance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInstanceDataNV matrixMotionInstance(MemorySegment value) { matrixMotionInstance(this.segment(), 0L, value); return this; }

    /// {@return `srtMotionInstance` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment srtMotionInstance(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_srtMotionInstance, index), LAYOUT_srtMotionInstance); }
    /// {@return `srtMotionInstance`}
    public MemorySegment srtMotionInstance() { return srtMotionInstance(this.segment(), 0L); }
    /// Sets `srtMotionInstance` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void srtMotionInstance(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_srtMotionInstance, index), LAYOUT_srtMotionInstance.byteSize()); }
    /// Sets `srtMotionInstance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInstanceDataNV srtMotionInstance(MemorySegment value) { srtMotionInstance(this.segment(), 0L, value); return this; }

    /// A buffer of [VkAccelerationStructureMotionInstanceDataNV].
    public static final class Buffer extends VkAccelerationStructureMotionInstanceDataNV {
        private final long elementCount;

        /// Creates `VkAccelerationStructureMotionInstanceDataNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAccelerationStructureMotionInstanceDataNV`.
        /// @param index the index of the union buffer
        /// @return the slice of `VkAccelerationStructureMotionInstanceDataNV`
        public VkAccelerationStructureMotionInstanceDataNV asSlice(long index) { return new VkAccelerationStructureMotionInstanceDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAccelerationStructureMotionInstanceDataNV`.
        /// @param index the index of the union buffer
        /// @param count the count
        /// @return the slice of `VkAccelerationStructureMotionInstanceDataNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `staticInstance` at the given index}
        /// @param index the index of the union buffer
        public MemorySegment staticInstanceAt(long index) { return staticInstance(this.segment(), index); }
        /// Sets `staticInstance` with the given value at the given index.
        /// @param index the index of the union buffer
        /// @param value the value
        /// @return `this`
        public Buffer staticInstanceAt(long index, MemorySegment value) { staticInstance(this.segment(), index, value); return this; }

        /// {@return `matrixMotionInstance` at the given index}
        /// @param index the index of the union buffer
        public MemorySegment matrixMotionInstanceAt(long index) { return matrixMotionInstance(this.segment(), index); }
        /// Sets `matrixMotionInstance` with the given value at the given index.
        /// @param index the index of the union buffer
        /// @param value the value
        /// @return `this`
        public Buffer matrixMotionInstanceAt(long index, MemorySegment value) { matrixMotionInstance(this.segment(), index, value); return this; }

        /// {@return `srtMotionInstance` at the given index}
        /// @param index the index of the union buffer
        public MemorySegment srtMotionInstanceAt(long index) { return srtMotionInstance(this.segment(), index); }
        /// Sets `srtMotionInstance` with the given value at the given index.
        /// @param index the index of the union buffer
        /// @param value the value
        /// @return `this`
        public Buffer srtMotionInstanceAt(long index, MemorySegment value) { srtMotionInstance(this.segment(), index, value); return this; }

    }
}
