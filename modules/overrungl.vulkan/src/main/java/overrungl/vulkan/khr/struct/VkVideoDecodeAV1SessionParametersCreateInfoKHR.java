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
/// ### pStdSequenceHeader
/// [VarHandle][#VH_pStdSequenceHeader] - [Getter][#pStdSequenceHeader()] - [Setter][#pStdSequenceHeader(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoDecodeAV1SessionParametersCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     const StdVideoAV1SequenceHeader * pStdSequenceHeader;
/// } VkVideoDecodeAV1SessionParametersCreateInfoKHR;
/// ```
public sealed class VkVideoDecodeAV1SessionParametersCreateInfoKHR extends Struct {
    /// The struct layout of `VkVideoDecodeAV1SessionParametersCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pStdSequenceHeader")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pStdSequenceHeader` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStdSequenceHeader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdSequenceHeader"));

    /// Creates `VkVideoDecodeAV1SessionParametersCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoDecodeAV1SessionParametersCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeAV1SessionParametersCreateInfoKHR(segment); }

    /// Creates `VkVideoDecodeAV1SessionParametersCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoDecodeAV1SessionParametersCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeAV1SessionParametersCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoDecodeAV1SessionParametersCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoDecodeAV1SessionParametersCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeAV1SessionParametersCreateInfoKHR`
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeAV1SessionParametersCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoDecodeAV1SessionParametersCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeAV1SessionParametersCreateInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoDecodeAV1SessionParametersCreateInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeAV1SessionParametersCreateInfoKHR`
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("const StdVideoAV1SequenceHeader *") java.lang.foreign.MemorySegment pStdSequenceHeader) { return alloc(allocator).sType(sType).pNext(pNext).pStdSequenceHeader(pStdSequenceHeader); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR copyFrom(VkVideoDecodeAV1SessionParametersCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoDecodeAV1SessionParametersCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoDecodeAV1SessionParametersCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoDecodeAV1SessionParametersCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR sType(@CType("VkStructureType") int value) { VkVideoDecodeAV1SessionParametersCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoDecodeAV1SessionParametersCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoDecodeAV1SessionParametersCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1SessionParametersCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1SessionParametersCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `pStdSequenceHeader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoAV1SequenceHeader *") java.lang.foreign.MemorySegment get_pStdSequenceHeader(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStdSequenceHeader.get(segment, 0L, index); }
    /// {@return `pStdSequenceHeader`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoAV1SequenceHeader *") java.lang.foreign.MemorySegment get_pStdSequenceHeader(MemorySegment segment) { return VkVideoDecodeAV1SessionParametersCreateInfoKHR.get_pStdSequenceHeader(segment, 0L); }
    /// {@return `pStdSequenceHeader`}
    public @CType("const StdVideoAV1SequenceHeader *") java.lang.foreign.MemorySegment pStdSequenceHeader() { return VkVideoDecodeAV1SessionParametersCreateInfoKHR.get_pStdSequenceHeader(this.segment()); }
    /// Sets `pStdSequenceHeader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStdSequenceHeader(MemorySegment segment, long index, @CType("const StdVideoAV1SequenceHeader *") java.lang.foreign.MemorySegment value) { VH_pStdSequenceHeader.set(segment, 0L, index, value); }
    /// Sets `pStdSequenceHeader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStdSequenceHeader(MemorySegment segment, @CType("const StdVideoAV1SequenceHeader *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1SessionParametersCreateInfoKHR.set_pStdSequenceHeader(segment, 0L, value); }
    /// Sets `pStdSequenceHeader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR pStdSequenceHeader(@CType("const StdVideoAV1SequenceHeader *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1SessionParametersCreateInfoKHR.set_pStdSequenceHeader(this.segment(), value); return this; }

    /// A buffer of [VkVideoDecodeAV1SessionParametersCreateInfoKHR].
    public static final class Buffer extends VkVideoDecodeAV1SessionParametersCreateInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoDecodeAV1SessionParametersCreateInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoDecodeAV1SessionParametersCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoDecodeAV1SessionParametersCreateInfoKHR`
        public VkVideoDecodeAV1SessionParametersCreateInfoKHR asSlice(long index) { return new VkVideoDecodeAV1SessionParametersCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoDecodeAV1SessionParametersCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoDecodeAV1SessionParametersCreateInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoDecodeAV1SessionParametersCreateInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoDecodeAV1SessionParametersCreateInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoDecodeAV1SessionParametersCreateInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1SessionParametersCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `pStdSequenceHeader` at the given index}
        /// @param index the index
        public @CType("const StdVideoAV1SequenceHeader *") java.lang.foreign.MemorySegment pStdSequenceHeaderAt(long index) { return VkVideoDecodeAV1SessionParametersCreateInfoKHR.get_pStdSequenceHeader(this.segment(), index); }
        /// Sets `pStdSequenceHeader` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pStdSequenceHeaderAt(long index, @CType("const StdVideoAV1SequenceHeader *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1SessionParametersCreateInfoKHR.set_pStdSequenceHeader(this.segment(), index, value); return this; }

    }
}
