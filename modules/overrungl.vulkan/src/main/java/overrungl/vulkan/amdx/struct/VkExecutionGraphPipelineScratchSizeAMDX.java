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
package overrungl.vulkan.amdx.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### minSize
/// [VarHandle][#VH_minSize] - [Getter][#minSize()] - [Setter][#minSize(long)]
/// ### maxSize
/// [VarHandle][#VH_maxSize] - [Getter][#maxSize()] - [Setter][#maxSize(long)]
/// ### sizeGranularity
/// [VarHandle][#VH_sizeGranularity] - [Getter][#sizeGranularity()] - [Setter][#sizeGranularity(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkExecutionGraphPipelineScratchSizeAMDX {
///     VkStructureType sType;
///     void * pNext;
///     VkDeviceSize minSize;
///     VkDeviceSize maxSize;
///     VkDeviceSize sizeGranularity;
/// } VkExecutionGraphPipelineScratchSizeAMDX;
/// ```
public sealed class VkExecutionGraphPipelineScratchSizeAMDX extends Struct {
    /// The struct layout of `VkExecutionGraphPipelineScratchSizeAMDX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("minSize"),
        ValueLayout.JAVA_LONG.withName("maxSize"),
        ValueLayout.JAVA_LONG.withName("sizeGranularity")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `minSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_minSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSize"));
    /// The [VarHandle] of `maxSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_maxSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSize"));
    /// The [VarHandle] of `sizeGranularity` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_sizeGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sizeGranularity"));

    /// Creates `VkExecutionGraphPipelineScratchSizeAMDX` with the given segment.
    /// @param segment the memory segment
    public VkExecutionGraphPipelineScratchSizeAMDX(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExecutionGraphPipelineScratchSizeAMDX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExecutionGraphPipelineScratchSizeAMDX of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExecutionGraphPipelineScratchSizeAMDX(segment); }

    /// Creates `VkExecutionGraphPipelineScratchSizeAMDX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExecutionGraphPipelineScratchSizeAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExecutionGraphPipelineScratchSizeAMDX ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExecutionGraphPipelineScratchSizeAMDX(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkExecutionGraphPipelineScratchSizeAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkExecutionGraphPipelineScratchSizeAMDX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExecutionGraphPipelineScratchSizeAMDX`
    public static VkExecutionGraphPipelineScratchSizeAMDX alloc(SegmentAllocator allocator) { return new VkExecutionGraphPipelineScratchSizeAMDX(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExecutionGraphPipelineScratchSizeAMDX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExecutionGraphPipelineScratchSizeAMDX`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkExecutionGraphPipelineScratchSizeAMDX` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExecutionGraphPipelineScratchSizeAMDX`
    public static VkExecutionGraphPipelineScratchSizeAMDX allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkDeviceSize") long minSize, @CType("VkDeviceSize") long maxSize, @CType("VkDeviceSize") long sizeGranularity) { return alloc(allocator).sType(sType).pNext(pNext).minSize(minSize).maxSize(maxSize).sizeGranularity(sizeGranularity); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExecutionGraphPipelineScratchSizeAMDX copyFrom(VkExecutionGraphPipelineScratchSizeAMDX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkExecutionGraphPipelineScratchSizeAMDX.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkExecutionGraphPipelineScratchSizeAMDX.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkExecutionGraphPipelineScratchSizeAMDX.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExecutionGraphPipelineScratchSizeAMDX sType(@CType("VkStructureType") int value) { VkExecutionGraphPipelineScratchSizeAMDX.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkExecutionGraphPipelineScratchSizeAMDX.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkExecutionGraphPipelineScratchSizeAMDX.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkExecutionGraphPipelineScratchSizeAMDX.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExecutionGraphPipelineScratchSizeAMDX pNext(@CType("void *") MemorySegment value) { VkExecutionGraphPipelineScratchSizeAMDX.set_pNext(this.segment(), value); return this; }

    /// {@return `minSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_minSize(MemorySegment segment, long index) { return (long) VH_minSize.get(segment, 0L, index); }
    /// {@return `minSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_minSize(MemorySegment segment) { return VkExecutionGraphPipelineScratchSizeAMDX.get_minSize(segment, 0L); }
    /// {@return `minSize`}
    public @CType("VkDeviceSize") long minSize() { return VkExecutionGraphPipelineScratchSizeAMDX.get_minSize(this.segment()); }
    /// Sets `minSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_minSize.set(segment, 0L, index, value); }
    /// Sets `minSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkExecutionGraphPipelineScratchSizeAMDX.set_minSize(segment, 0L, value); }
    /// Sets `minSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExecutionGraphPipelineScratchSizeAMDX minSize(@CType("VkDeviceSize") long value) { VkExecutionGraphPipelineScratchSizeAMDX.set_minSize(this.segment(), value); return this; }

    /// {@return `maxSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_maxSize(MemorySegment segment, long index) { return (long) VH_maxSize.get(segment, 0L, index); }
    /// {@return `maxSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_maxSize(MemorySegment segment) { return VkExecutionGraphPipelineScratchSizeAMDX.get_maxSize(segment, 0L); }
    /// {@return `maxSize`}
    public @CType("VkDeviceSize") long maxSize() { return VkExecutionGraphPipelineScratchSizeAMDX.get_maxSize(this.segment()); }
    /// Sets `maxSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_maxSize.set(segment, 0L, index, value); }
    /// Sets `maxSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkExecutionGraphPipelineScratchSizeAMDX.set_maxSize(segment, 0L, value); }
    /// Sets `maxSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExecutionGraphPipelineScratchSizeAMDX maxSize(@CType("VkDeviceSize") long value) { VkExecutionGraphPipelineScratchSizeAMDX.set_maxSize(this.segment(), value); return this; }

    /// {@return `sizeGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_sizeGranularity(MemorySegment segment, long index) { return (long) VH_sizeGranularity.get(segment, 0L, index); }
    /// {@return `sizeGranularity`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_sizeGranularity(MemorySegment segment) { return VkExecutionGraphPipelineScratchSizeAMDX.get_sizeGranularity(segment, 0L); }
    /// {@return `sizeGranularity`}
    public @CType("VkDeviceSize") long sizeGranularity() { return VkExecutionGraphPipelineScratchSizeAMDX.get_sizeGranularity(this.segment()); }
    /// Sets `sizeGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sizeGranularity(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_sizeGranularity.set(segment, 0L, index, value); }
    /// Sets `sizeGranularity` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sizeGranularity(MemorySegment segment, @CType("VkDeviceSize") long value) { VkExecutionGraphPipelineScratchSizeAMDX.set_sizeGranularity(segment, 0L, value); }
    /// Sets `sizeGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExecutionGraphPipelineScratchSizeAMDX sizeGranularity(@CType("VkDeviceSize") long value) { VkExecutionGraphPipelineScratchSizeAMDX.set_sizeGranularity(this.segment(), value); return this; }

    /// A buffer of [VkExecutionGraphPipelineScratchSizeAMDX].
    public static final class Buffer extends VkExecutionGraphPipelineScratchSizeAMDX {
        private final long elementCount;

        /// Creates `VkExecutionGraphPipelineScratchSizeAMDX.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkExecutionGraphPipelineScratchSizeAMDX`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkExecutionGraphPipelineScratchSizeAMDX`
        public VkExecutionGraphPipelineScratchSizeAMDX asSlice(long index) { return new VkExecutionGraphPipelineScratchSizeAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkExecutionGraphPipelineScratchSizeAMDX`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkExecutionGraphPipelineScratchSizeAMDX`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkExecutionGraphPipelineScratchSizeAMDX.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkExecutionGraphPipelineScratchSizeAMDX.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkExecutionGraphPipelineScratchSizeAMDX.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkExecutionGraphPipelineScratchSizeAMDX.set_pNext(this.segment(), index, value); return this; }

        /// {@return `minSize` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long minSizeAt(long index) { return VkExecutionGraphPipelineScratchSizeAMDX.get_minSize(this.segment(), index); }
        /// Sets `minSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minSizeAt(long index, @CType("VkDeviceSize") long value) { VkExecutionGraphPipelineScratchSizeAMDX.set_minSize(this.segment(), index, value); return this; }

        /// {@return `maxSize` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long maxSizeAt(long index) { return VkExecutionGraphPipelineScratchSizeAMDX.get_maxSize(this.segment(), index); }
        /// Sets `maxSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxSizeAt(long index, @CType("VkDeviceSize") long value) { VkExecutionGraphPipelineScratchSizeAMDX.set_maxSize(this.segment(), index, value); return this; }

        /// {@return `sizeGranularity` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long sizeGranularityAt(long index) { return VkExecutionGraphPipelineScratchSizeAMDX.get_sizeGranularity(this.segment(), index); }
        /// Sets `sizeGranularity` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sizeGranularityAt(long index, @CType("VkDeviceSize") long value) { VkExecutionGraphPipelineScratchSizeAMDX.set_sizeGranularity(this.segment(), index, value); return this; }

    }
}
