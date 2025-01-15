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
/// ### averageBitrate
/// [VarHandle][#VH_averageBitrate] - [Getter][#averageBitrate()] - [Setter][#averageBitrate(long)]
/// ### maxBitrate
/// [VarHandle][#VH_maxBitrate] - [Getter][#maxBitrate()] - [Setter][#maxBitrate(long)]
/// ### frameRateNumerator
/// [VarHandle][#VH_frameRateNumerator] - [Getter][#frameRateNumerator()] - [Setter][#frameRateNumerator(int)]
/// ### frameRateDenominator
/// [VarHandle][#VH_frameRateDenominator] - [Getter][#frameRateDenominator()] - [Setter][#frameRateDenominator(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeRateControlLayerInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     uint64_t averageBitrate;
///     uint64_t maxBitrate;
///     uint32_t frameRateNumerator;
///     uint32_t frameRateDenominator;
/// } VkVideoEncodeRateControlLayerInfoKHR;
/// ```
public sealed class VkVideoEncodeRateControlLayerInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeRateControlLayerInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("averageBitrate"),
        ValueLayout.JAVA_LONG.withName("maxBitrate"),
        ValueLayout.JAVA_INT.withName("frameRateNumerator"),
        ValueLayout.JAVA_INT.withName("frameRateDenominator")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `averageBitrate` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_averageBitrate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("averageBitrate"));
    /// The [VarHandle] of `maxBitrate` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_maxBitrate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBitrate"));
    /// The [VarHandle] of `frameRateNumerator` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_frameRateNumerator = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameRateNumerator"));
    /// The [VarHandle] of `frameRateDenominator` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_frameRateDenominator = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameRateDenominator"));

    /// Creates `VkVideoEncodeRateControlLayerInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeRateControlLayerInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeRateControlLayerInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeRateControlLayerInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeRateControlLayerInfoKHR(segment); }

    /// Creates `VkVideoEncodeRateControlLayerInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeRateControlLayerInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeRateControlLayerInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeRateControlLayerInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeRateControlLayerInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeRateControlLayerInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeRateControlLayerInfoKHR`
    public static VkVideoEncodeRateControlLayerInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeRateControlLayerInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeRateControlLayerInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeRateControlLayerInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeRateControlLayerInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeRateControlLayerInfoKHR`
    public static VkVideoEncodeRateControlLayerInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("uint64_t") long averageBitrate, @CType("uint64_t") long maxBitrate, @CType("uint32_t") int frameRateNumerator, @CType("uint32_t") int frameRateDenominator) { return alloc(allocator).sType(sType).pNext(pNext).averageBitrate(averageBitrate).maxBitrate(maxBitrate).frameRateNumerator(frameRateNumerator).frameRateDenominator(frameRateDenominator); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeRateControlLayerInfoKHR copyFrom(VkVideoEncodeRateControlLayerInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeRateControlLayerInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeRateControlLayerInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeRateControlLayerInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlLayerInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeRateControlLayerInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeRateControlLayerInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeRateControlLayerInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeRateControlLayerInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlLayerInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeRateControlLayerInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `averageBitrate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_averageBitrate(MemorySegment segment, long index) { return (long) VH_averageBitrate.get(segment, 0L, index); }
    /// {@return `averageBitrate`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_averageBitrate(MemorySegment segment) { return VkVideoEncodeRateControlLayerInfoKHR.get_averageBitrate(segment, 0L); }
    /// {@return `averageBitrate`}
    public @CType("uint64_t") long averageBitrate() { return VkVideoEncodeRateControlLayerInfoKHR.get_averageBitrate(this.segment()); }
    /// Sets `averageBitrate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_averageBitrate(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_averageBitrate.set(segment, 0L, index, value); }
    /// Sets `averageBitrate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_averageBitrate(MemorySegment segment, @CType("uint64_t") long value) { VkVideoEncodeRateControlLayerInfoKHR.set_averageBitrate(segment, 0L, value); }
    /// Sets `averageBitrate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlLayerInfoKHR averageBitrate(@CType("uint64_t") long value) { VkVideoEncodeRateControlLayerInfoKHR.set_averageBitrate(this.segment(), value); return this; }

    /// {@return `maxBitrate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_maxBitrate(MemorySegment segment, long index) { return (long) VH_maxBitrate.get(segment, 0L, index); }
    /// {@return `maxBitrate`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_maxBitrate(MemorySegment segment) { return VkVideoEncodeRateControlLayerInfoKHR.get_maxBitrate(segment, 0L); }
    /// {@return `maxBitrate`}
    public @CType("uint64_t") long maxBitrate() { return VkVideoEncodeRateControlLayerInfoKHR.get_maxBitrate(this.segment()); }
    /// Sets `maxBitrate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxBitrate(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_maxBitrate.set(segment, 0L, index, value); }
    /// Sets `maxBitrate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxBitrate(MemorySegment segment, @CType("uint64_t") long value) { VkVideoEncodeRateControlLayerInfoKHR.set_maxBitrate(segment, 0L, value); }
    /// Sets `maxBitrate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlLayerInfoKHR maxBitrate(@CType("uint64_t") long value) { VkVideoEncodeRateControlLayerInfoKHR.set_maxBitrate(this.segment(), value); return this; }

    /// {@return `frameRateNumerator` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_frameRateNumerator(MemorySegment segment, long index) { return (int) VH_frameRateNumerator.get(segment, 0L, index); }
    /// {@return `frameRateNumerator`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_frameRateNumerator(MemorySegment segment) { return VkVideoEncodeRateControlLayerInfoKHR.get_frameRateNumerator(segment, 0L); }
    /// {@return `frameRateNumerator`}
    public @CType("uint32_t") int frameRateNumerator() { return VkVideoEncodeRateControlLayerInfoKHR.get_frameRateNumerator(this.segment()); }
    /// Sets `frameRateNumerator` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frameRateNumerator(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_frameRateNumerator.set(segment, 0L, index, value); }
    /// Sets `frameRateNumerator` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frameRateNumerator(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeRateControlLayerInfoKHR.set_frameRateNumerator(segment, 0L, value); }
    /// Sets `frameRateNumerator` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlLayerInfoKHR frameRateNumerator(@CType("uint32_t") int value) { VkVideoEncodeRateControlLayerInfoKHR.set_frameRateNumerator(this.segment(), value); return this; }

    /// {@return `frameRateDenominator` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_frameRateDenominator(MemorySegment segment, long index) { return (int) VH_frameRateDenominator.get(segment, 0L, index); }
    /// {@return `frameRateDenominator`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_frameRateDenominator(MemorySegment segment) { return VkVideoEncodeRateControlLayerInfoKHR.get_frameRateDenominator(segment, 0L); }
    /// {@return `frameRateDenominator`}
    public @CType("uint32_t") int frameRateDenominator() { return VkVideoEncodeRateControlLayerInfoKHR.get_frameRateDenominator(this.segment()); }
    /// Sets `frameRateDenominator` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frameRateDenominator(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_frameRateDenominator.set(segment, 0L, index, value); }
    /// Sets `frameRateDenominator` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frameRateDenominator(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeRateControlLayerInfoKHR.set_frameRateDenominator(segment, 0L, value); }
    /// Sets `frameRateDenominator` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlLayerInfoKHR frameRateDenominator(@CType("uint32_t") int value) { VkVideoEncodeRateControlLayerInfoKHR.set_frameRateDenominator(this.segment(), value); return this; }

    /// A buffer of [VkVideoEncodeRateControlLayerInfoKHR].
    public static final class Buffer extends VkVideoEncodeRateControlLayerInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeRateControlLayerInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeRateControlLayerInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeRateControlLayerInfoKHR`
        public VkVideoEncodeRateControlLayerInfoKHR asSlice(long index) { return new VkVideoEncodeRateControlLayerInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeRateControlLayerInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeRateControlLayerInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeRateControlLayerInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeRateControlLayerInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeRateControlLayerInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeRateControlLayerInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `averageBitrate` at the given index}
        /// @param index the index
        public @CType("uint64_t") long averageBitrateAt(long index) { return VkVideoEncodeRateControlLayerInfoKHR.get_averageBitrate(this.segment(), index); }
        /// Sets `averageBitrate` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer averageBitrateAt(long index, @CType("uint64_t") long value) { VkVideoEncodeRateControlLayerInfoKHR.set_averageBitrate(this.segment(), index, value); return this; }

        /// {@return `maxBitrate` at the given index}
        /// @param index the index
        public @CType("uint64_t") long maxBitrateAt(long index) { return VkVideoEncodeRateControlLayerInfoKHR.get_maxBitrate(this.segment(), index); }
        /// Sets `maxBitrate` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxBitrateAt(long index, @CType("uint64_t") long value) { VkVideoEncodeRateControlLayerInfoKHR.set_maxBitrate(this.segment(), index, value); return this; }

        /// {@return `frameRateNumerator` at the given index}
        /// @param index the index
        public @CType("uint32_t") int frameRateNumeratorAt(long index) { return VkVideoEncodeRateControlLayerInfoKHR.get_frameRateNumerator(this.segment(), index); }
        /// Sets `frameRateNumerator` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer frameRateNumeratorAt(long index, @CType("uint32_t") int value) { VkVideoEncodeRateControlLayerInfoKHR.set_frameRateNumerator(this.segment(), index, value); return this; }

        /// {@return `frameRateDenominator` at the given index}
        /// @param index the index
        public @CType("uint32_t") int frameRateDenominatorAt(long index) { return VkVideoEncodeRateControlLayerInfoKHR.get_frameRateDenominator(this.segment(), index); }
        /// Sets `frameRateDenominator` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer frameRateDenominatorAt(long index, @CType("uint32_t") int value) { VkVideoEncodeRateControlLayerInfoKHR.set_frameRateDenominator(this.segment(), index, value); return this; }

    }
}
