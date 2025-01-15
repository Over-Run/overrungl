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
/// ### constantQp
/// [VarHandle][#VH_constantQp] - [Getter][#constantQp()] - [Setter][#constantQp(int)]
/// ### pStdSliceSegmentHeader
/// [VarHandle][#VH_pStdSliceSegmentHeader] - [Getter][#pStdSliceSegmentHeader()] - [Setter][#pStdSliceSegmentHeader(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeH265NaluSliceSegmentInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     int32_t constantQp;
///     const StdVideoEncodeH265SliceSegmentHeader * pStdSliceSegmentHeader;
/// } VkVideoEncodeH265NaluSliceSegmentInfoKHR;
/// ```
public sealed class VkVideoEncodeH265NaluSliceSegmentInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH265NaluSliceSegmentInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("constantQp"),
        ValueLayout.ADDRESS.withName("pStdSliceSegmentHeader")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `constantQp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_constantQp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constantQp"));
    /// The [VarHandle] of `pStdSliceSegmentHeader` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStdSliceSegmentHeader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdSliceSegmentHeader"));

    /// Creates `VkVideoEncodeH265NaluSliceSegmentInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH265NaluSliceSegmentInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265NaluSliceSegmentInfoKHR(segment); }

    /// Creates `VkVideoEncodeH265NaluSliceSegmentInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH265NaluSliceSegmentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265NaluSliceSegmentInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH265NaluSliceSegmentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeH265NaluSliceSegmentInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265NaluSliceSegmentInfoKHR`
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH265NaluSliceSegmentInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265NaluSliceSegmentInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeH265NaluSliceSegmentInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265NaluSliceSegmentInfoKHR`
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("int32_t") int constantQp, @CType("const StdVideoEncodeH265SliceSegmentHeader *") java.lang.foreign.MemorySegment pStdSliceSegmentHeader) { return alloc(allocator).sType(sType).pNext(pNext).constantQp(constantQp).pStdSliceSegmentHeader(pStdSliceSegmentHeader); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR copyFrom(VkVideoEncodeH265NaluSliceSegmentInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeH265NaluSliceSegmentInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeH265NaluSliceSegmentInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeH265NaluSliceSegmentInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeH265NaluSliceSegmentInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeH265NaluSliceSegmentInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeH265NaluSliceSegmentInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265NaluSliceSegmentInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265NaluSliceSegmentInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `constantQp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_constantQp(MemorySegment segment, long index) { return (int) VH_constantQp.get(segment, 0L, index); }
    /// {@return `constantQp`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_constantQp(MemorySegment segment) { return VkVideoEncodeH265NaluSliceSegmentInfoKHR.get_constantQp(segment, 0L); }
    /// {@return `constantQp`}
    public @CType("int32_t") int constantQp() { return VkVideoEncodeH265NaluSliceSegmentInfoKHR.get_constantQp(this.segment()); }
    /// Sets `constantQp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_constantQp(MemorySegment segment, long index, @CType("int32_t") int value) { VH_constantQp.set(segment, 0L, index, value); }
    /// Sets `constantQp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_constantQp(MemorySegment segment, @CType("int32_t") int value) { VkVideoEncodeH265NaluSliceSegmentInfoKHR.set_constantQp(segment, 0L, value); }
    /// Sets `constantQp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR constantQp(@CType("int32_t") int value) { VkVideoEncodeH265NaluSliceSegmentInfoKHR.set_constantQp(this.segment(), value); return this; }

    /// {@return `pStdSliceSegmentHeader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoEncodeH265SliceSegmentHeader *") java.lang.foreign.MemorySegment get_pStdSliceSegmentHeader(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStdSliceSegmentHeader.get(segment, 0L, index); }
    /// {@return `pStdSliceSegmentHeader`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoEncodeH265SliceSegmentHeader *") java.lang.foreign.MemorySegment get_pStdSliceSegmentHeader(MemorySegment segment) { return VkVideoEncodeH265NaluSliceSegmentInfoKHR.get_pStdSliceSegmentHeader(segment, 0L); }
    /// {@return `pStdSliceSegmentHeader`}
    public @CType("const StdVideoEncodeH265SliceSegmentHeader *") java.lang.foreign.MemorySegment pStdSliceSegmentHeader() { return VkVideoEncodeH265NaluSliceSegmentInfoKHR.get_pStdSliceSegmentHeader(this.segment()); }
    /// Sets `pStdSliceSegmentHeader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStdSliceSegmentHeader(MemorySegment segment, long index, @CType("const StdVideoEncodeH265SliceSegmentHeader *") java.lang.foreign.MemorySegment value) { VH_pStdSliceSegmentHeader.set(segment, 0L, index, value); }
    /// Sets `pStdSliceSegmentHeader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStdSliceSegmentHeader(MemorySegment segment, @CType("const StdVideoEncodeH265SliceSegmentHeader *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265NaluSliceSegmentInfoKHR.set_pStdSliceSegmentHeader(segment, 0L, value); }
    /// Sets `pStdSliceSegmentHeader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR pStdSliceSegmentHeader(@CType("const StdVideoEncodeH265SliceSegmentHeader *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265NaluSliceSegmentInfoKHR.set_pStdSliceSegmentHeader(this.segment(), value); return this; }

    /// A buffer of [VkVideoEncodeH265NaluSliceSegmentInfoKHR].
    public static final class Buffer extends VkVideoEncodeH265NaluSliceSegmentInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeH265NaluSliceSegmentInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeH265NaluSliceSegmentInfoKHR`
        public VkVideoEncodeH265NaluSliceSegmentInfoKHR asSlice(long index) { return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeH265NaluSliceSegmentInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeH265NaluSliceSegmentInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeH265NaluSliceSegmentInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeH265NaluSliceSegmentInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeH265NaluSliceSegmentInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265NaluSliceSegmentInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `constantQp` at the given index}
        /// @param index the index
        public @CType("int32_t") int constantQpAt(long index) { return VkVideoEncodeH265NaluSliceSegmentInfoKHR.get_constantQp(this.segment(), index); }
        /// Sets `constantQp` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer constantQpAt(long index, @CType("int32_t") int value) { VkVideoEncodeH265NaluSliceSegmentInfoKHR.set_constantQp(this.segment(), index, value); return this; }

        /// {@return `pStdSliceSegmentHeader` at the given index}
        /// @param index the index
        public @CType("const StdVideoEncodeH265SliceSegmentHeader *") java.lang.foreign.MemorySegment pStdSliceSegmentHeaderAt(long index) { return VkVideoEncodeH265NaluSliceSegmentInfoKHR.get_pStdSliceSegmentHeader(this.segment(), index); }
        /// Sets `pStdSliceSegmentHeader` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pStdSliceSegmentHeaderAt(long index, @CType("const StdVideoEncodeH265SliceSegmentHeader *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265NaluSliceSegmentInfoKHR.set_pStdSliceSegmentHeader(this.segment(), index, value); return this; }

    }
}
