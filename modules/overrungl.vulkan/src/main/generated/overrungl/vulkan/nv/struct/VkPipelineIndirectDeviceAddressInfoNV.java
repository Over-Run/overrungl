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
/// struct VkPipelineIndirectDeviceAddressInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkPipelineBindPoint pipelineBindPoint;
///     (uint64_t) VkPipeline pipeline;
/// };
/// ```
public sealed class VkPipelineIndirectDeviceAddressInfoNV extends GroupType {
    /// The struct layout of `VkPipelineIndirectDeviceAddressInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineBindPoint"),
        ValueLayout.JAVA_LONG.withName("pipeline")
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
    /// The byte offset of `pipelineBindPoint`.
    public static final long OFFSET_pipelineBindPoint = LAYOUT.byteOffset(PathElement.groupElement("pipelineBindPoint"));
    /// The memory layout of `pipelineBindPoint`.
    public static final MemoryLayout LAYOUT_pipelineBindPoint = LAYOUT.select(PathElement.groupElement("pipelineBindPoint"));
    /// The [VarHandle] of `pipelineBindPoint` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineBindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBindPoint"));
    /// The byte offset of `pipeline`.
    public static final long OFFSET_pipeline = LAYOUT.byteOffset(PathElement.groupElement("pipeline"));
    /// The memory layout of `pipeline`.
    public static final MemoryLayout LAYOUT_pipeline = LAYOUT.select(PathElement.groupElement("pipeline"));
    /// The [VarHandle] of `pipeline` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipeline"));

    /// Creates `VkPipelineIndirectDeviceAddressInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkPipelineIndirectDeviceAddressInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineIndirectDeviceAddressInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineIndirectDeviceAddressInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineIndirectDeviceAddressInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineIndirectDeviceAddressInfoNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPipelineIndirectDeviceAddressInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineIndirectDeviceAddressInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineIndirectDeviceAddressInfoNV`
    public static VkPipelineIndirectDeviceAddressInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineIndirectDeviceAddressInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineIndirectDeviceAddressInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineIndirectDeviceAddressInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineIndirectDeviceAddressInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pipelineBindPoint `pipelineBindPoint`
    /// @param pipeline `pipeline`
    /// @return the allocated `VkPipelineIndirectDeviceAddressInfoNV`
    public static VkPipelineIndirectDeviceAddressInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int pipelineBindPoint, long pipeline) {
        return alloc(allocator).sType(sType).pNext(pNext).pipelineBindPoint(pipelineBindPoint).pipeline(pipeline);
    }

    /// Allocates a `VkPipelineIndirectDeviceAddressInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pipelineBindPoint `pipelineBindPoint`
    /// @return the allocated `VkPipelineIndirectDeviceAddressInfoNV`
    public static VkPipelineIndirectDeviceAddressInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int pipelineBindPoint) {
        return alloc(allocator).sType(sType).pNext(pNext).pipelineBindPoint(pipelineBindPoint);
    }

    /// Allocates a `VkPipelineIndirectDeviceAddressInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPipelineIndirectDeviceAddressInfoNV`
    public static VkPipelineIndirectDeviceAddressInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPipelineIndirectDeviceAddressInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPipelineIndirectDeviceAddressInfoNV`
    public static VkPipelineIndirectDeviceAddressInfoNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineIndirectDeviceAddressInfoNV copyFrom(VkPipelineIndirectDeviceAddressInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPipelineIndirectDeviceAddressInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineIndirectDeviceAddressInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pipelineBindPoint` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineBindPoint(MemorySegment segment, long index) { return (int) VH_pipelineBindPoint.get(segment, 0L, index); }
    /// {@return `pipelineBindPoint`}
    public int pipelineBindPoint() { return pipelineBindPoint(this.segment(), 0L); }
    /// Sets `pipelineBindPoint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineBindPoint(MemorySegment segment, long index, int value) { VH_pipelineBindPoint.set(segment, 0L, index, value); }
    /// Sets `pipelineBindPoint` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineIndirectDeviceAddressInfoNV pipelineBindPoint(int value) { pipelineBindPoint(this.segment(), 0L, value); return this; }

    /// {@return `pipeline` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long pipeline(MemorySegment segment, long index) { return (long) VH_pipeline.get(segment, 0L, index); }
    /// {@return `pipeline`}
    public long pipeline() { return pipeline(this.segment(), 0L); }
    /// Sets `pipeline` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipeline(MemorySegment segment, long index, long value) { VH_pipeline.set(segment, 0L, index, value); }
    /// Sets `pipeline` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineIndirectDeviceAddressInfoNV pipeline(long value) { pipeline(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPipelineIndirectDeviceAddressInfoNV].
    public static final class Buffer extends VkPipelineIndirectDeviceAddressInfoNV {
        private final long elementCount;

        /// Creates `VkPipelineIndirectDeviceAddressInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineIndirectDeviceAddressInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineIndirectDeviceAddressInfoNV`
        public VkPipelineIndirectDeviceAddressInfoNV asSlice(long index) { return new VkPipelineIndirectDeviceAddressInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineIndirectDeviceAddressInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineIndirectDeviceAddressInfoNV`
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

        /// {@return `pipelineBindPoint` at the given index}
        /// @param index the index of the struct buffer
        public int pipelineBindPointAt(long index) { return pipelineBindPoint(this.segment(), index); }
        /// Sets `pipelineBindPoint` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pipelineBindPointAt(long index, int value) { pipelineBindPoint(this.segment(), index, value); return this; }

        /// {@return `pipeline` at the given index}
        /// @param index the index of the struct buffer
        public long pipelineAt(long index) { return pipeline(this.segment(), index); }
        /// Sets `pipeline` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pipelineAt(long index, long value) { pipeline(this.segment(), index, value); return this; }

    }
}
