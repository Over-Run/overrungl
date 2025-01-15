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
package overrungl.vulkan.khr.struct;

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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### quantizationMap
/// [VarHandle][#VH_quantizationMap] - [Getter][#quantizationMap()] - [Setter][#quantizationMap(java.lang.foreign.MemorySegment)]
/// ### quantizationMapExtent
/// [Byte offset][#OFFSET_quantizationMapExtent] - [Memory layout][#ML_quantizationMapExtent] - [Getter][#quantizationMapExtent()] - [Setter][#quantizationMapExtent(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeQuantizationMapInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkImageView quantizationMap;
///     VkExtent2D quantizationMapExtent;
/// } VkVideoEncodeQuantizationMapInfoKHR;
/// ```
public sealed class VkVideoEncodeQuantizationMapInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeQuantizationMapInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("quantizationMap"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("quantizationMapExtent")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `quantizationMap` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_quantizationMap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("quantizationMap"));
    /// The byte offset of `quantizationMapExtent`.
    public static final long OFFSET_quantizationMapExtent = LAYOUT.byteOffset(PathElement.groupElement("quantizationMapExtent"));
    /// The memory layout of `quantizationMapExtent`.
    public static final MemoryLayout ML_quantizationMapExtent = LAYOUT.select(PathElement.groupElement("quantizationMapExtent"));

    /// Creates `VkVideoEncodeQuantizationMapInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeQuantizationMapInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeQuantizationMapInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeQuantizationMapInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapInfoKHR(segment); }

    /// Creates `VkVideoEncodeQuantizationMapInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeQuantizationMapInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeQuantizationMapInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeQuantizationMapInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeQuantizationMapInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeQuantizationMapInfoKHR`
    public static VkVideoEncodeQuantizationMapInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeQuantizationMapInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeQuantizationMapInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeQuantizationMapInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeQuantizationMapInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeQuantizationMapInfoKHR`
    public static VkVideoEncodeQuantizationMapInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkImageView") java.lang.foreign.MemorySegment quantizationMap, @CType("VkExtent2D") java.lang.foreign.MemorySegment quantizationMapExtent) { return alloc(allocator).sType(sType).pNext(pNext).quantizationMap(quantizationMap).quantizationMapExtent(quantizationMapExtent); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeQuantizationMapInfoKHR copyFrom(VkVideoEncodeQuantizationMapInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeQuantizationMapInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeQuantizationMapInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeQuantizationMapInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeQuantizationMapInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeQuantizationMapInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeQuantizationMapInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeQuantizationMapInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeQuantizationMapInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `quantizationMap` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageView") java.lang.foreign.MemorySegment get_quantizationMap(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_quantizationMap.get(segment, 0L, index); }
    /// {@return `quantizationMap`}
    /// @param segment the segment of the struct
    public static @CType("VkImageView") java.lang.foreign.MemorySegment get_quantizationMap(MemorySegment segment) { return VkVideoEncodeQuantizationMapInfoKHR.get_quantizationMap(segment, 0L); }
    /// {@return `quantizationMap`}
    public @CType("VkImageView") java.lang.foreign.MemorySegment quantizationMap() { return VkVideoEncodeQuantizationMapInfoKHR.get_quantizationMap(this.segment()); }
    /// Sets `quantizationMap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_quantizationMap(MemorySegment segment, long index, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VH_quantizationMap.set(segment, 0L, index, value); }
    /// Sets `quantizationMap` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_quantizationMap(MemorySegment segment, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VkVideoEncodeQuantizationMapInfoKHR.set_quantizationMap(segment, 0L, value); }
    /// Sets `quantizationMap` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapInfoKHR quantizationMap(@CType("VkImageView") java.lang.foreign.MemorySegment value) { VkVideoEncodeQuantizationMapInfoKHR.set_quantizationMap(this.segment(), value); return this; }

    /// {@return `quantizationMapExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_quantizationMapExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_quantizationMapExtent, index), ML_quantizationMapExtent); }
    /// {@return `quantizationMapExtent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_quantizationMapExtent(MemorySegment segment) { return VkVideoEncodeQuantizationMapInfoKHR.get_quantizationMapExtent(segment, 0L); }
    /// {@return `quantizationMapExtent`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment quantizationMapExtent() { return VkVideoEncodeQuantizationMapInfoKHR.get_quantizationMapExtent(this.segment()); }
    /// Sets `quantizationMapExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_quantizationMapExtent(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_quantizationMapExtent, index), ML_quantizationMapExtent.byteSize()); }
    /// Sets `quantizationMapExtent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_quantizationMapExtent(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoEncodeQuantizationMapInfoKHR.set_quantizationMapExtent(segment, 0L, value); }
    /// Sets `quantizationMapExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapInfoKHR quantizationMapExtent(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoEncodeQuantizationMapInfoKHR.set_quantizationMapExtent(this.segment(), value); return this; }

    /// A buffer of [VkVideoEncodeQuantizationMapInfoKHR].
    public static final class Buffer extends VkVideoEncodeQuantizationMapInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeQuantizationMapInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeQuantizationMapInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeQuantizationMapInfoKHR`
        public VkVideoEncodeQuantizationMapInfoKHR asSlice(long index) { return new VkVideoEncodeQuantizationMapInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeQuantizationMapInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeQuantizationMapInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeQuantizationMapInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeQuantizationMapInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeQuantizationMapInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeQuantizationMapInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `quantizationMap` at the given index}
        /// @param index the index
        public @CType("VkImageView") java.lang.foreign.MemorySegment quantizationMapAt(long index) { return VkVideoEncodeQuantizationMapInfoKHR.get_quantizationMap(this.segment(), index); }
        /// Sets `quantizationMap` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer quantizationMapAt(long index, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VkVideoEncodeQuantizationMapInfoKHR.set_quantizationMap(this.segment(), index, value); return this; }

        /// {@return `quantizationMapExtent` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") java.lang.foreign.MemorySegment quantizationMapExtentAt(long index) { return VkVideoEncodeQuantizationMapInfoKHR.get_quantizationMapExtent(this.segment(), index); }
        /// Sets `quantizationMapExtent` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer quantizationMapExtentAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoEncodeQuantizationMapInfoKHR.set_quantizationMapExtent(this.segment(), index, value); return this; }

    }
}
