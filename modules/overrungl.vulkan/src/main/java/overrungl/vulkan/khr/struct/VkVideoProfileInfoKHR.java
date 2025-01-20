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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### videoCodecOperation
/// [VarHandle][#VH_videoCodecOperation] - [Getter][#videoCodecOperation()] - [Setter][#videoCodecOperation(int)]
/// ### chromaSubsampling
/// [VarHandle][#VH_chromaSubsampling] - [Getter][#chromaSubsampling()] - [Setter][#chromaSubsampling(int)]
/// ### lumaBitDepth
/// [VarHandle][#VH_lumaBitDepth] - [Getter][#lumaBitDepth()] - [Setter][#lumaBitDepth(int)]
/// ### chromaBitDepth
/// [VarHandle][#VH_chromaBitDepth] - [Getter][#chromaBitDepth()] - [Setter][#chromaBitDepth(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoProfileInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkVideoCodecOperationFlagBitsKHR videoCodecOperation;
///     VkVideoChromaSubsamplingFlagsKHR chromaSubsampling;
///     VkVideoComponentBitDepthFlagsKHR lumaBitDepth;
///     VkVideoComponentBitDepthFlagsKHR chromaBitDepth;
/// } VkVideoProfileInfoKHR;
/// ```
public sealed class VkVideoProfileInfoKHR extends Struct {
    /// The struct layout of `VkVideoProfileInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("videoCodecOperation"),
        ValueLayout.JAVA_INT.withName("chromaSubsampling"),
        ValueLayout.JAVA_INT.withName("lumaBitDepth"),
        ValueLayout.JAVA_INT.withName("chromaBitDepth")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `videoCodecOperation` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_videoCodecOperation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoCodecOperation"));
    /// The [VarHandle] of `chromaSubsampling` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_chromaSubsampling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chromaSubsampling"));
    /// The [VarHandle] of `lumaBitDepth` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_lumaBitDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lumaBitDepth"));
    /// The [VarHandle] of `chromaBitDepth` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_chromaBitDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chromaBitDepth"));

    /// Creates `VkVideoProfileInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoProfileInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoProfileInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoProfileInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoProfileInfoKHR(segment); }

    /// Creates `VkVideoProfileInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoProfileInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoProfileInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoProfileInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoProfileInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoProfileInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoProfileInfoKHR`
    public static VkVideoProfileInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoProfileInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoProfileInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoProfileInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoProfileInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoProfileInfoKHR`
    public static VkVideoProfileInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkVideoCodecOperationFlagBitsKHR") int videoCodecOperation, @CType("VkVideoChromaSubsamplingFlagsKHR") int chromaSubsampling, @CType("VkVideoComponentBitDepthFlagsKHR") int lumaBitDepth, @CType("VkVideoComponentBitDepthFlagsKHR") int chromaBitDepth) { return alloc(allocator).sType(sType).pNext(pNext).videoCodecOperation(videoCodecOperation).chromaSubsampling(chromaSubsampling).lumaBitDepth(lumaBitDepth).chromaBitDepth(chromaBitDepth); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoProfileInfoKHR copyFrom(VkVideoProfileInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoProfileInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoProfileInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoProfileInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoProfileInfoKHR sType(@CType("VkStructureType") int value) { VkVideoProfileInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkVideoProfileInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkVideoProfileInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkVideoProfileInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoProfileInfoKHR pNext(@CType("const void *") MemorySegment value) { VkVideoProfileInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `videoCodecOperation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoCodecOperationFlagBitsKHR") int get_videoCodecOperation(MemorySegment segment, long index) { return (int) VH_videoCodecOperation.get(segment, 0L, index); }
    /// {@return `videoCodecOperation`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoCodecOperationFlagBitsKHR") int get_videoCodecOperation(MemorySegment segment) { return VkVideoProfileInfoKHR.get_videoCodecOperation(segment, 0L); }
    /// {@return `videoCodecOperation`}
    public @CType("VkVideoCodecOperationFlagBitsKHR") int videoCodecOperation() { return VkVideoProfileInfoKHR.get_videoCodecOperation(this.segment()); }
    /// Sets `videoCodecOperation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_videoCodecOperation(MemorySegment segment, long index, @CType("VkVideoCodecOperationFlagBitsKHR") int value) { VH_videoCodecOperation.set(segment, 0L, index, value); }
    /// Sets `videoCodecOperation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_videoCodecOperation(MemorySegment segment, @CType("VkVideoCodecOperationFlagBitsKHR") int value) { VkVideoProfileInfoKHR.set_videoCodecOperation(segment, 0L, value); }
    /// Sets `videoCodecOperation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoProfileInfoKHR videoCodecOperation(@CType("VkVideoCodecOperationFlagBitsKHR") int value) { VkVideoProfileInfoKHR.set_videoCodecOperation(this.segment(), value); return this; }

    /// {@return `chromaSubsampling` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoChromaSubsamplingFlagsKHR") int get_chromaSubsampling(MemorySegment segment, long index) { return (int) VH_chromaSubsampling.get(segment, 0L, index); }
    /// {@return `chromaSubsampling`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoChromaSubsamplingFlagsKHR") int get_chromaSubsampling(MemorySegment segment) { return VkVideoProfileInfoKHR.get_chromaSubsampling(segment, 0L); }
    /// {@return `chromaSubsampling`}
    public @CType("VkVideoChromaSubsamplingFlagsKHR") int chromaSubsampling() { return VkVideoProfileInfoKHR.get_chromaSubsampling(this.segment()); }
    /// Sets `chromaSubsampling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chromaSubsampling(MemorySegment segment, long index, @CType("VkVideoChromaSubsamplingFlagsKHR") int value) { VH_chromaSubsampling.set(segment, 0L, index, value); }
    /// Sets `chromaSubsampling` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chromaSubsampling(MemorySegment segment, @CType("VkVideoChromaSubsamplingFlagsKHR") int value) { VkVideoProfileInfoKHR.set_chromaSubsampling(segment, 0L, value); }
    /// Sets `chromaSubsampling` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoProfileInfoKHR chromaSubsampling(@CType("VkVideoChromaSubsamplingFlagsKHR") int value) { VkVideoProfileInfoKHR.set_chromaSubsampling(this.segment(), value); return this; }

    /// {@return `lumaBitDepth` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoComponentBitDepthFlagsKHR") int get_lumaBitDepth(MemorySegment segment, long index) { return (int) VH_lumaBitDepth.get(segment, 0L, index); }
    /// {@return `lumaBitDepth`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoComponentBitDepthFlagsKHR") int get_lumaBitDepth(MemorySegment segment) { return VkVideoProfileInfoKHR.get_lumaBitDepth(segment, 0L); }
    /// {@return `lumaBitDepth`}
    public @CType("VkVideoComponentBitDepthFlagsKHR") int lumaBitDepth() { return VkVideoProfileInfoKHR.get_lumaBitDepth(this.segment()); }
    /// Sets `lumaBitDepth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_lumaBitDepth(MemorySegment segment, long index, @CType("VkVideoComponentBitDepthFlagsKHR") int value) { VH_lumaBitDepth.set(segment, 0L, index, value); }
    /// Sets `lumaBitDepth` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_lumaBitDepth(MemorySegment segment, @CType("VkVideoComponentBitDepthFlagsKHR") int value) { VkVideoProfileInfoKHR.set_lumaBitDepth(segment, 0L, value); }
    /// Sets `lumaBitDepth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoProfileInfoKHR lumaBitDepth(@CType("VkVideoComponentBitDepthFlagsKHR") int value) { VkVideoProfileInfoKHR.set_lumaBitDepth(this.segment(), value); return this; }

    /// {@return `chromaBitDepth` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoComponentBitDepthFlagsKHR") int get_chromaBitDepth(MemorySegment segment, long index) { return (int) VH_chromaBitDepth.get(segment, 0L, index); }
    /// {@return `chromaBitDepth`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoComponentBitDepthFlagsKHR") int get_chromaBitDepth(MemorySegment segment) { return VkVideoProfileInfoKHR.get_chromaBitDepth(segment, 0L); }
    /// {@return `chromaBitDepth`}
    public @CType("VkVideoComponentBitDepthFlagsKHR") int chromaBitDepth() { return VkVideoProfileInfoKHR.get_chromaBitDepth(this.segment()); }
    /// Sets `chromaBitDepth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chromaBitDepth(MemorySegment segment, long index, @CType("VkVideoComponentBitDepthFlagsKHR") int value) { VH_chromaBitDepth.set(segment, 0L, index, value); }
    /// Sets `chromaBitDepth` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chromaBitDepth(MemorySegment segment, @CType("VkVideoComponentBitDepthFlagsKHR") int value) { VkVideoProfileInfoKHR.set_chromaBitDepth(segment, 0L, value); }
    /// Sets `chromaBitDepth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoProfileInfoKHR chromaBitDepth(@CType("VkVideoComponentBitDepthFlagsKHR") int value) { VkVideoProfileInfoKHR.set_chromaBitDepth(this.segment(), value); return this; }

    /// A buffer of [VkVideoProfileInfoKHR].
    public static final class Buffer extends VkVideoProfileInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoProfileInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoProfileInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoProfileInfoKHR`
        public VkVideoProfileInfoKHR asSlice(long index) { return new VkVideoProfileInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoProfileInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoProfileInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoProfileInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoProfileInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkVideoProfileInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkVideoProfileInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `videoCodecOperation` at the given index}
        /// @param index the index
        public @CType("VkVideoCodecOperationFlagBitsKHR") int videoCodecOperationAt(long index) { return VkVideoProfileInfoKHR.get_videoCodecOperation(this.segment(), index); }
        /// Sets `videoCodecOperation` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer videoCodecOperationAt(long index, @CType("VkVideoCodecOperationFlagBitsKHR") int value) { VkVideoProfileInfoKHR.set_videoCodecOperation(this.segment(), index, value); return this; }

        /// {@return `chromaSubsampling` at the given index}
        /// @param index the index
        public @CType("VkVideoChromaSubsamplingFlagsKHR") int chromaSubsamplingAt(long index) { return VkVideoProfileInfoKHR.get_chromaSubsampling(this.segment(), index); }
        /// Sets `chromaSubsampling` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer chromaSubsamplingAt(long index, @CType("VkVideoChromaSubsamplingFlagsKHR") int value) { VkVideoProfileInfoKHR.set_chromaSubsampling(this.segment(), index, value); return this; }

        /// {@return `lumaBitDepth` at the given index}
        /// @param index the index
        public @CType("VkVideoComponentBitDepthFlagsKHR") int lumaBitDepthAt(long index) { return VkVideoProfileInfoKHR.get_lumaBitDepth(this.segment(), index); }
        /// Sets `lumaBitDepth` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer lumaBitDepthAt(long index, @CType("VkVideoComponentBitDepthFlagsKHR") int value) { VkVideoProfileInfoKHR.set_lumaBitDepth(this.segment(), index, value); return this; }

        /// {@return `chromaBitDepth` at the given index}
        /// @param index the index
        public @CType("VkVideoComponentBitDepthFlagsKHR") int chromaBitDepthAt(long index) { return VkVideoProfileInfoKHR.get_chromaBitDepth(this.segment(), index); }
        /// Sets `chromaBitDepth` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer chromaBitDepthAt(long index, @CType("VkVideoComponentBitDepthFlagsKHR") int value) { VkVideoProfileInfoKHR.set_chromaBitDepth(this.segment(), index, value); return this; }

    }
}
