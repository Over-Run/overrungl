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
/// ### stdSPSCount
/// [VarHandle][#VH_stdSPSCount] - [Getter][#stdSPSCount()] - [Setter][#stdSPSCount(int)]
/// ### pStdSPSs
/// [VarHandle][#VH_pStdSPSs] - [Getter][#pStdSPSs()] - [Setter][#pStdSPSs(java.lang.foreign.MemorySegment)]
/// ### stdPPSCount
/// [VarHandle][#VH_stdPPSCount] - [Getter][#stdPPSCount()] - [Setter][#stdPPSCount(int)]
/// ### pStdPPSs
/// [VarHandle][#VH_pStdPPSs] - [Getter][#pStdPPSs()] - [Setter][#pStdPPSs(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeH264SessionParametersAddInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t stdSPSCount;
///     const StdVideoH264SequenceParameterSet * pStdSPSs;
///     uint32_t stdPPSCount;
///     const StdVideoH264PictureParameterSet * pStdPPSs;
/// } VkVideoEncodeH264SessionParametersAddInfoKHR;
/// ```
public sealed class VkVideoEncodeH264SessionParametersAddInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH264SessionParametersAddInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stdSPSCount"),
        ValueLayout.ADDRESS.withName("pStdSPSs"),
        ValueLayout.JAVA_INT.withName("stdPPSCount"),
        ValueLayout.ADDRESS.withName("pStdPPSs")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `stdSPSCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stdSPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdSPSCount"));
    /// The [VarHandle] of `pStdSPSs` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStdSPSs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdSPSs"));
    /// The [VarHandle] of `stdPPSCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stdPPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdPPSCount"));
    /// The [VarHandle] of `pStdPPSs` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStdPPSs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPPSs"));

    /// Creates `VkVideoEncodeH264SessionParametersAddInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH264SessionParametersAddInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH264SessionParametersAddInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264SessionParametersAddInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264SessionParametersAddInfoKHR(segment); }

    /// Creates `VkVideoEncodeH264SessionParametersAddInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH264SessionParametersAddInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264SessionParametersAddInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264SessionParametersAddInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH264SessionParametersAddInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeH264SessionParametersAddInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264SessionParametersAddInfoKHR`
    public static VkVideoEncodeH264SessionParametersAddInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264SessionParametersAddInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH264SessionParametersAddInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH264SessionParametersAddInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeH264SessionParametersAddInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264SessionParametersAddInfoKHR`
    public static VkVideoEncodeH264SessionParametersAddInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int stdSPSCount, @CType("const StdVideoH264SequenceParameterSet *") java.lang.foreign.MemorySegment pStdSPSs, @CType("uint32_t") int stdPPSCount, @CType("const StdVideoH264PictureParameterSet *") java.lang.foreign.MemorySegment pStdPPSs) { return alloc(allocator).sType(sType).pNext(pNext).stdSPSCount(stdSPSCount).pStdSPSs(pStdSPSs).stdPPSCount(stdPPSCount).pStdPPSs(pStdPPSs); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH264SessionParametersAddInfoKHR copyFrom(VkVideoEncodeH264SessionParametersAddInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeH264SessionParametersAddInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeH264SessionParametersAddInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeH264SessionParametersAddInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersAddInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeH264SessionParametersAddInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeH264SessionParametersAddInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeH264SessionParametersAddInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264SessionParametersAddInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersAddInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264SessionParametersAddInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `stdSPSCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_stdSPSCount(MemorySegment segment, long index) { return (int) VH_stdSPSCount.get(segment, 0L, index); }
    /// {@return `stdSPSCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_stdSPSCount(MemorySegment segment) { return VkVideoEncodeH264SessionParametersAddInfoKHR.get_stdSPSCount(segment, 0L); }
    /// {@return `stdSPSCount`}
    public @CType("uint32_t") int stdSPSCount() { return VkVideoEncodeH264SessionParametersAddInfoKHR.get_stdSPSCount(this.segment()); }
    /// Sets `stdSPSCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stdSPSCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_stdSPSCount.set(segment, 0L, index, value); }
    /// Sets `stdSPSCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stdSPSCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH264SessionParametersAddInfoKHR.set_stdSPSCount(segment, 0L, value); }
    /// Sets `stdSPSCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersAddInfoKHR stdSPSCount(@CType("uint32_t") int value) { VkVideoEncodeH264SessionParametersAddInfoKHR.set_stdSPSCount(this.segment(), value); return this; }

    /// {@return `pStdSPSs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH264SequenceParameterSet *") java.lang.foreign.MemorySegment get_pStdSPSs(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStdSPSs.get(segment, 0L, index); }
    /// {@return `pStdSPSs`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH264SequenceParameterSet *") java.lang.foreign.MemorySegment get_pStdSPSs(MemorySegment segment) { return VkVideoEncodeH264SessionParametersAddInfoKHR.get_pStdSPSs(segment, 0L); }
    /// {@return `pStdSPSs`}
    public @CType("const StdVideoH264SequenceParameterSet *") java.lang.foreign.MemorySegment pStdSPSs() { return VkVideoEncodeH264SessionParametersAddInfoKHR.get_pStdSPSs(this.segment()); }
    /// Sets `pStdSPSs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStdSPSs(MemorySegment segment, long index, @CType("const StdVideoH264SequenceParameterSet *") java.lang.foreign.MemorySegment value) { VH_pStdSPSs.set(segment, 0L, index, value); }
    /// Sets `pStdSPSs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStdSPSs(MemorySegment segment, @CType("const StdVideoH264SequenceParameterSet *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264SessionParametersAddInfoKHR.set_pStdSPSs(segment, 0L, value); }
    /// Sets `pStdSPSs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersAddInfoKHR pStdSPSs(@CType("const StdVideoH264SequenceParameterSet *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264SessionParametersAddInfoKHR.set_pStdSPSs(this.segment(), value); return this; }

    /// {@return `stdPPSCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_stdPPSCount(MemorySegment segment, long index) { return (int) VH_stdPPSCount.get(segment, 0L, index); }
    /// {@return `stdPPSCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_stdPPSCount(MemorySegment segment) { return VkVideoEncodeH264SessionParametersAddInfoKHR.get_stdPPSCount(segment, 0L); }
    /// {@return `stdPPSCount`}
    public @CType("uint32_t") int stdPPSCount() { return VkVideoEncodeH264SessionParametersAddInfoKHR.get_stdPPSCount(this.segment()); }
    /// Sets `stdPPSCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stdPPSCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_stdPPSCount.set(segment, 0L, index, value); }
    /// Sets `stdPPSCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stdPPSCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH264SessionParametersAddInfoKHR.set_stdPPSCount(segment, 0L, value); }
    /// Sets `stdPPSCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersAddInfoKHR stdPPSCount(@CType("uint32_t") int value) { VkVideoEncodeH264SessionParametersAddInfoKHR.set_stdPPSCount(this.segment(), value); return this; }

    /// {@return `pStdPPSs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoH264PictureParameterSet *") java.lang.foreign.MemorySegment get_pStdPPSs(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStdPPSs.get(segment, 0L, index); }
    /// {@return `pStdPPSs`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoH264PictureParameterSet *") java.lang.foreign.MemorySegment get_pStdPPSs(MemorySegment segment) { return VkVideoEncodeH264SessionParametersAddInfoKHR.get_pStdPPSs(segment, 0L); }
    /// {@return `pStdPPSs`}
    public @CType("const StdVideoH264PictureParameterSet *") java.lang.foreign.MemorySegment pStdPPSs() { return VkVideoEncodeH264SessionParametersAddInfoKHR.get_pStdPPSs(this.segment()); }
    /// Sets `pStdPPSs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStdPPSs(MemorySegment segment, long index, @CType("const StdVideoH264PictureParameterSet *") java.lang.foreign.MemorySegment value) { VH_pStdPPSs.set(segment, 0L, index, value); }
    /// Sets `pStdPPSs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStdPPSs(MemorySegment segment, @CType("const StdVideoH264PictureParameterSet *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264SessionParametersAddInfoKHR.set_pStdPPSs(segment, 0L, value); }
    /// Sets `pStdPPSs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersAddInfoKHR pStdPPSs(@CType("const StdVideoH264PictureParameterSet *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264SessionParametersAddInfoKHR.set_pStdPPSs(this.segment(), value); return this; }

    /// A buffer of [VkVideoEncodeH264SessionParametersAddInfoKHR].
    public static final class Buffer extends VkVideoEncodeH264SessionParametersAddInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeH264SessionParametersAddInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeH264SessionParametersAddInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeH264SessionParametersAddInfoKHR`
        public VkVideoEncodeH264SessionParametersAddInfoKHR asSlice(long index) { return new VkVideoEncodeH264SessionParametersAddInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeH264SessionParametersAddInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeH264SessionParametersAddInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeH264SessionParametersAddInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeH264SessionParametersAddInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeH264SessionParametersAddInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264SessionParametersAddInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `stdSPSCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int stdSPSCountAt(long index) { return VkVideoEncodeH264SessionParametersAddInfoKHR.get_stdSPSCount(this.segment(), index); }
        /// Sets `stdSPSCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer stdSPSCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH264SessionParametersAddInfoKHR.set_stdSPSCount(this.segment(), index, value); return this; }

        /// {@return `pStdSPSs` at the given index}
        /// @param index the index
        public @CType("const StdVideoH264SequenceParameterSet *") java.lang.foreign.MemorySegment pStdSPSsAt(long index) { return VkVideoEncodeH264SessionParametersAddInfoKHR.get_pStdSPSs(this.segment(), index); }
        /// Sets `pStdSPSs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pStdSPSsAt(long index, @CType("const StdVideoH264SequenceParameterSet *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264SessionParametersAddInfoKHR.set_pStdSPSs(this.segment(), index, value); return this; }

        /// {@return `stdPPSCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int stdPPSCountAt(long index) { return VkVideoEncodeH264SessionParametersAddInfoKHR.get_stdPPSCount(this.segment(), index); }
        /// Sets `stdPPSCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer stdPPSCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH264SessionParametersAddInfoKHR.set_stdPPSCount(this.segment(), index, value); return this; }

        /// {@return `pStdPPSs` at the given index}
        /// @param index the index
        public @CType("const StdVideoH264PictureParameterSet *") java.lang.foreign.MemorySegment pStdPPSsAt(long index) { return VkVideoEncodeH264SessionParametersAddInfoKHR.get_pStdPPSs(this.segment(), index); }
        /// Sets `pStdPPSs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pStdPPSsAt(long index, @CType("const StdVideoH264PictureParameterSet *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264SessionParametersAddInfoKHR.set_pStdPPSs(this.segment(), index, value); return this; }

    }
}
