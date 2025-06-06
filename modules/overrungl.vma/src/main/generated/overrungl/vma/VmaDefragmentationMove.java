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
package overrungl.vma;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VmaDefragmentationMove {
///     (int) VmaDefragmentationMoveOperation operation;
///     (struct VmaAllocation *) VmaAllocation srcAllocation;
///     (struct VmaAllocation *) VmaAllocation dstTmpAllocation;
/// };
/// ```
public sealed class VmaDefragmentationMove extends GroupType {
    /// The struct layout of `VmaDefragmentationMove`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("operation"),
        ValueLayout.ADDRESS.withName("srcAllocation"),
        ValueLayout.ADDRESS.withName("dstTmpAllocation")
    );
    /// The byte offset of `operation`.
    public static final long OFFSET_operation = LAYOUT.byteOffset(PathElement.groupElement("operation"));
    /// The memory layout of `operation`.
    public static final MemoryLayout LAYOUT_operation = LAYOUT.select(PathElement.groupElement("operation"));
    /// The [VarHandle] of `operation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_operation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("operation"));
    /// The byte offset of `srcAllocation`.
    public static final long OFFSET_srcAllocation = LAYOUT.byteOffset(PathElement.groupElement("srcAllocation"));
    /// The memory layout of `srcAllocation`.
    public static final MemoryLayout LAYOUT_srcAllocation = LAYOUT.select(PathElement.groupElement("srcAllocation"));
    /// The [VarHandle] of `srcAllocation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAllocation"));
    /// The byte offset of `dstTmpAllocation`.
    public static final long OFFSET_dstTmpAllocation = LAYOUT.byteOffset(PathElement.groupElement("dstTmpAllocation"));
    /// The memory layout of `dstTmpAllocation`.
    public static final MemoryLayout LAYOUT_dstTmpAllocation = LAYOUT.select(PathElement.groupElement("dstTmpAllocation"));
    /// The [VarHandle] of `dstTmpAllocation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstTmpAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstTmpAllocation"));

    /// Creates `VmaDefragmentationMove` with the given segment.
    /// @param segment the memory segment
    public VmaDefragmentationMove(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VmaDefragmentationMove` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VmaDefragmentationMove` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaDefragmentationMove ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaDefragmentationMove(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VmaDefragmentationMove` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VmaDefragmentationMove` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VmaDefragmentationMove`
    public static VmaDefragmentationMove alloc(SegmentAllocator allocator) { return new VmaDefragmentationMove(allocator.allocate(LAYOUT)); }

    /// Allocates a `VmaDefragmentationMove` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VmaDefragmentationMove`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VmaDefragmentationMove` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param operation `operation`
    /// @param srcAllocation `srcAllocation`
    /// @param dstTmpAllocation `dstTmpAllocation`
    /// @return the allocated `VmaDefragmentationMove`
    public static VmaDefragmentationMove allocInit(SegmentAllocator allocator, int operation, MemorySegment srcAllocation, MemorySegment dstTmpAllocation) {
        return alloc(allocator).operation(operation).srcAllocation(srcAllocation).dstTmpAllocation(dstTmpAllocation);
    }

    /// Allocates a `VmaDefragmentationMove` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param operation `operation`
    /// @param srcAllocation `srcAllocation`
    /// @return the allocated `VmaDefragmentationMove`
    public static VmaDefragmentationMove allocInit(SegmentAllocator allocator, int operation, MemorySegment srcAllocation) {
        return alloc(allocator).operation(operation).srcAllocation(srcAllocation);
    }

    /// Allocates a `VmaDefragmentationMove` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param operation `operation`
    /// @return the allocated `VmaDefragmentationMove`
    public static VmaDefragmentationMove allocInit(SegmentAllocator allocator, int operation) {
        return alloc(allocator).operation(operation);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VmaDefragmentationMove copyFrom(VmaDefragmentationMove src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `operation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int operation(MemorySegment segment, long index) { return (int) VH_operation.get(segment, 0L, index); }
    /// {@return `operation`}
    public int operation() { return operation(this.segment(), 0L); }
    /// Sets `operation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void operation(MemorySegment segment, long index, int value) { VH_operation.set(segment, 0L, index, value); }
    /// Sets `operation` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaDefragmentationMove operation(int value) { operation(this.segment(), 0L, value); return this; }

    /// {@return `srcAllocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment srcAllocation(MemorySegment segment, long index) { return (MemorySegment) VH_srcAllocation.get(segment, 0L, index); }
    /// {@return `srcAllocation`}
    public MemorySegment srcAllocation() { return srcAllocation(this.segment(), 0L); }
    /// Sets `srcAllocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcAllocation(MemorySegment segment, long index, MemorySegment value) { VH_srcAllocation.set(segment, 0L, index, value); }
    /// Sets `srcAllocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaDefragmentationMove srcAllocation(MemorySegment value) { srcAllocation(this.segment(), 0L, value); return this; }

    /// {@return `dstTmpAllocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment dstTmpAllocation(MemorySegment segment, long index) { return (MemorySegment) VH_dstTmpAllocation.get(segment, 0L, index); }
    /// {@return `dstTmpAllocation`}
    public MemorySegment dstTmpAllocation() { return dstTmpAllocation(this.segment(), 0L); }
    /// Sets `dstTmpAllocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstTmpAllocation(MemorySegment segment, long index, MemorySegment value) { VH_dstTmpAllocation.set(segment, 0L, index, value); }
    /// Sets `dstTmpAllocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaDefragmentationMove dstTmpAllocation(MemorySegment value) { dstTmpAllocation(this.segment(), 0L, value); return this; }

    /// A buffer of [VmaDefragmentationMove].
    public static final class Buffer extends VmaDefragmentationMove {
        private final long elementCount;

        /// Creates `VmaDefragmentationMove.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VmaDefragmentationMove`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VmaDefragmentationMove`
        public VmaDefragmentationMove asSlice(long index) { return new VmaDefragmentationMove(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VmaDefragmentationMove`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VmaDefragmentationMove`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `operation` at the given index}
        /// @param index the index of the struct buffer
        public int operationAt(long index) { return operation(this.segment(), index); }
        /// Sets `operation` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer operationAt(long index, int value) { operation(this.segment(), index, value); return this; }

        /// {@return `srcAllocation` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment srcAllocationAt(long index) { return srcAllocation(this.segment(), index); }
        /// Sets `srcAllocation` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcAllocationAt(long index, MemorySegment value) { srcAllocation(this.segment(), index, value); return this; }

        /// {@return `dstTmpAllocation` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment dstTmpAllocationAt(long index) { return dstTmpAllocation(this.segment(), index); }
        /// Sets `dstTmpAllocation` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstTmpAllocationAt(long index, MemorySegment value) { dstTmpAllocation(this.segment(), index, value); return this; }

    }
}
