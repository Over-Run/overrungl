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
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDataGraphPipelineSessionBindPointRequirementARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkDataGraphPipelineSessionBindPointARM bindPoint;
///     (int) VkDataGraphPipelineSessionBindPointTypeARM bindPointType;
///     uint32_t numObjects;
/// };
/// ```
public sealed class VkDataGraphPipelineSessionBindPointRequirementARM extends GroupType {
    /// The struct layout of `VkDataGraphPipelineSessionBindPointRequirementARM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("bindPoint"),
        ValueLayout.JAVA_INT.withName("bindPointType"),
        ValueLayout.JAVA_INT.withName("numObjects")
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
    /// The byte offset of `bindPoint`.
    public static final long OFFSET_bindPoint = LAYOUT.byteOffset(PathElement.groupElement("bindPoint"));
    /// The memory layout of `bindPoint`.
    public static final MemoryLayout LAYOUT_bindPoint = LAYOUT.select(PathElement.groupElement("bindPoint"));
    /// The [VarHandle] of `bindPoint` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bindPoint"));
    /// The byte offset of `bindPointType`.
    public static final long OFFSET_bindPointType = LAYOUT.byteOffset(PathElement.groupElement("bindPointType"));
    /// The memory layout of `bindPointType`.
    public static final MemoryLayout LAYOUT_bindPointType = LAYOUT.select(PathElement.groupElement("bindPointType"));
    /// The [VarHandle] of `bindPointType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bindPointType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bindPointType"));
    /// The byte offset of `numObjects`.
    public static final long OFFSET_numObjects = LAYOUT.byteOffset(PathElement.groupElement("numObjects"));
    /// The memory layout of `numObjects`.
    public static final MemoryLayout LAYOUT_numObjects = LAYOUT.select(PathElement.groupElement("numObjects"));
    /// The [VarHandle] of `numObjects` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_numObjects = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numObjects"));

    /// Creates `VkDataGraphPipelineSessionBindPointRequirementARM` with the given segment.
    /// @param segment the memory segment
    public VkDataGraphPipelineSessionBindPointRequirementARM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDataGraphPipelineSessionBindPointRequirementARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDataGraphPipelineSessionBindPointRequirementARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineSessionBindPointRequirementARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineSessionBindPointRequirementARM(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkDataGraphPipelineSessionBindPointRequirementARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDataGraphPipelineSessionBindPointRequirementARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDataGraphPipelineSessionBindPointRequirementARM`
    public static VkDataGraphPipelineSessionBindPointRequirementARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineSessionBindPointRequirementARM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDataGraphPipelineSessionBindPointRequirementARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDataGraphPipelineSessionBindPointRequirementARM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDataGraphPipelineSessionBindPointRequirementARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param bindPoint `bindPoint`
    /// @param bindPointType `bindPointType`
    /// @param numObjects `numObjects`
    /// @return the allocated `VkDataGraphPipelineSessionBindPointRequirementARM`
    public static VkDataGraphPipelineSessionBindPointRequirementARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int bindPoint, int bindPointType, int numObjects) {
        return alloc(allocator).sType(sType).pNext(pNext).bindPoint(bindPoint).bindPointType(bindPointType).numObjects(numObjects);
    }

    /// Allocates a `VkDataGraphPipelineSessionBindPointRequirementARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param bindPoint `bindPoint`
    /// @param bindPointType `bindPointType`
    /// @return the allocated `VkDataGraphPipelineSessionBindPointRequirementARM`
    public static VkDataGraphPipelineSessionBindPointRequirementARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int bindPoint, int bindPointType) {
        return alloc(allocator).sType(sType).pNext(pNext).bindPoint(bindPoint).bindPointType(bindPointType);
    }

    /// Allocates a `VkDataGraphPipelineSessionBindPointRequirementARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param bindPoint `bindPoint`
    /// @return the allocated `VkDataGraphPipelineSessionBindPointRequirementARM`
    public static VkDataGraphPipelineSessionBindPointRequirementARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int bindPoint) {
        return alloc(allocator).sType(sType).pNext(pNext).bindPoint(bindPoint);
    }

    /// Allocates a `VkDataGraphPipelineSessionBindPointRequirementARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkDataGraphPipelineSessionBindPointRequirementARM`
    public static VkDataGraphPipelineSessionBindPointRequirementARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkDataGraphPipelineSessionBindPointRequirementARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkDataGraphPipelineSessionBindPointRequirementARM`
    public static VkDataGraphPipelineSessionBindPointRequirementARM allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDataGraphPipelineSessionBindPointRequirementARM copyFrom(VkDataGraphPipelineSessionBindPointRequirementARM src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkDataGraphPipelineSessionBindPointRequirementARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDataGraphPipelineSessionBindPointRequirementARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `bindPoint` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bindPoint(MemorySegment segment, long index) { return (int) VH_bindPoint.get(segment, 0L, index); }
    /// {@return `bindPoint`}
    public int bindPoint() { return bindPoint(this.segment(), 0L); }
    /// Sets `bindPoint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bindPoint(MemorySegment segment, long index, int value) { VH_bindPoint.set(segment, 0L, index, value); }
    /// Sets `bindPoint` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineSessionBindPointRequirementARM bindPoint(int value) { bindPoint(this.segment(), 0L, value); return this; }

    /// {@return `bindPointType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bindPointType(MemorySegment segment, long index) { return (int) VH_bindPointType.get(segment, 0L, index); }
    /// {@return `bindPointType`}
    public int bindPointType() { return bindPointType(this.segment(), 0L); }
    /// Sets `bindPointType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bindPointType(MemorySegment segment, long index, int value) { VH_bindPointType.set(segment, 0L, index, value); }
    /// Sets `bindPointType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineSessionBindPointRequirementARM bindPointType(int value) { bindPointType(this.segment(), 0L, value); return this; }

    /// {@return `numObjects` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int numObjects(MemorySegment segment, long index) { return (int) VH_numObjects.get(segment, 0L, index); }
    /// {@return `numObjects`}
    public int numObjects() { return numObjects(this.segment(), 0L); }
    /// Sets `numObjects` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void numObjects(MemorySegment segment, long index, int value) { VH_numObjects.set(segment, 0L, index, value); }
    /// Sets `numObjects` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineSessionBindPointRequirementARM numObjects(int value) { numObjects(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDataGraphPipelineSessionBindPointRequirementARM].
    public static final class Buffer extends VkDataGraphPipelineSessionBindPointRequirementARM {
        private final long elementCount;

        /// Creates `VkDataGraphPipelineSessionBindPointRequirementARM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDataGraphPipelineSessionBindPointRequirementARM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDataGraphPipelineSessionBindPointRequirementARM`
        public VkDataGraphPipelineSessionBindPointRequirementARM asSlice(long index) { return new VkDataGraphPipelineSessionBindPointRequirementARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDataGraphPipelineSessionBindPointRequirementARM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDataGraphPipelineSessionBindPointRequirementARM`
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

        /// {@return `bindPoint` at the given index}
        /// @param index the index of the struct buffer
        public int bindPointAt(long index) { return bindPoint(this.segment(), index); }
        /// Sets `bindPoint` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer bindPointAt(long index, int value) { bindPoint(this.segment(), index, value); return this; }

        /// {@return `bindPointType` at the given index}
        /// @param index the index of the struct buffer
        public int bindPointTypeAt(long index) { return bindPointType(this.segment(), index); }
        /// Sets `bindPointType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer bindPointTypeAt(long index, int value) { bindPointType(this.segment(), index, value); return this; }

        /// {@return `numObjects` at the given index}
        /// @param index the index of the struct buffer
        public int numObjectsAt(long index) { return numObjects(this.segment(), index); }
        /// Sets `numObjects` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer numObjectsAt(long index, int value) { numObjects(this.segment(), index, value); return this; }

    }
}
