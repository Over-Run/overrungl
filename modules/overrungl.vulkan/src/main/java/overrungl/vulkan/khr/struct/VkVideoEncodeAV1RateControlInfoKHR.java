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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### gopFrameCount
/// [VarHandle][#VH_gopFrameCount] - [Getter][#gopFrameCount()] - [Setter][#gopFrameCount(int)]
/// ### keyFramePeriod
/// [VarHandle][#VH_keyFramePeriod] - [Getter][#keyFramePeriod()] - [Setter][#keyFramePeriod(int)]
/// ### consecutiveBipredictiveFrameCount
/// [VarHandle][#VH_consecutiveBipredictiveFrameCount] - [Getter][#consecutiveBipredictiveFrameCount()] - [Setter][#consecutiveBipredictiveFrameCount(int)]
/// ### temporalLayerCount
/// [VarHandle][#VH_temporalLayerCount] - [Getter][#temporalLayerCount()] - [Setter][#temporalLayerCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeAV1RateControlInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkVideoEncodeAV1RateControlFlagsKHR flags;
///     uint32_t gopFrameCount;
///     uint32_t keyFramePeriod;
///     uint32_t consecutiveBipredictiveFrameCount;
///     uint32_t temporalLayerCount;
/// } VkVideoEncodeAV1RateControlInfoKHR;
/// ```
public sealed class VkVideoEncodeAV1RateControlInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeAV1RateControlInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("gopFrameCount"),
        ValueLayout.JAVA_INT.withName("keyFramePeriod"),
        ValueLayout.JAVA_INT.withName("consecutiveBipredictiveFrameCount"),
        ValueLayout.JAVA_INT.withName("temporalLayerCount")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `gopFrameCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_gopFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopFrameCount"));
    /// The [VarHandle] of `keyFramePeriod` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_keyFramePeriod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("keyFramePeriod"));
    /// The [VarHandle] of `consecutiveBipredictiveFrameCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_consecutiveBipredictiveFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("consecutiveBipredictiveFrameCount"));
    /// The [VarHandle] of `temporalLayerCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_temporalLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("temporalLayerCount"));

    /// Creates `VkVideoEncodeAV1RateControlInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeAV1RateControlInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeAV1RateControlInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1RateControlInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1RateControlInfoKHR(segment); }

    /// Creates `VkVideoEncodeAV1RateControlInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeAV1RateControlInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1RateControlInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1RateControlInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeAV1RateControlInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeAV1RateControlInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1RateControlInfoKHR`
    public static VkVideoEncodeAV1RateControlInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1RateControlInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeAV1RateControlInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeAV1RateControlInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeAV1RateControlInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1RateControlInfoKHR`
    public static VkVideoEncodeAV1RateControlInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkVideoEncodeAV1RateControlFlagsKHR") int flags, @CType("uint32_t") int gopFrameCount, @CType("uint32_t") int keyFramePeriod, @CType("uint32_t") int consecutiveBipredictiveFrameCount, @CType("uint32_t") int temporalLayerCount) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).gopFrameCount(gopFrameCount).keyFramePeriod(keyFramePeriod).consecutiveBipredictiveFrameCount(consecutiveBipredictiveFrameCount).temporalLayerCount(temporalLayerCount); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeAV1RateControlInfoKHR copyFrom(VkVideoEncodeAV1RateControlInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeAV1RateControlInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeAV1RateControlInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeAV1RateControlInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeAV1RateControlInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeAV1RateControlInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeAV1RateControlInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1RateControlInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1RateControlInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeAV1RateControlFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeAV1RateControlFlagsKHR") int get_flags(MemorySegment segment) { return VkVideoEncodeAV1RateControlInfoKHR.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkVideoEncodeAV1RateControlFlagsKHR") int flags() { return VkVideoEncodeAV1RateControlInfoKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkVideoEncodeAV1RateControlFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkVideoEncodeAV1RateControlFlagsKHR") int value) { VkVideoEncodeAV1RateControlInfoKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlInfoKHR flags(@CType("VkVideoEncodeAV1RateControlFlagsKHR") int value) { VkVideoEncodeAV1RateControlInfoKHR.set_flags(this.segment(), value); return this; }

    /// {@return `gopFrameCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_gopFrameCount(MemorySegment segment, long index) { return (int) VH_gopFrameCount.get(segment, 0L, index); }
    /// {@return `gopFrameCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_gopFrameCount(MemorySegment segment) { return VkVideoEncodeAV1RateControlInfoKHR.get_gopFrameCount(segment, 0L); }
    /// {@return `gopFrameCount`}
    public @CType("uint32_t") int gopFrameCount() { return VkVideoEncodeAV1RateControlInfoKHR.get_gopFrameCount(this.segment()); }
    /// Sets `gopFrameCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_gopFrameCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_gopFrameCount.set(segment, 0L, index, value); }
    /// Sets `gopFrameCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_gopFrameCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1RateControlInfoKHR.set_gopFrameCount(segment, 0L, value); }
    /// Sets `gopFrameCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlInfoKHR gopFrameCount(@CType("uint32_t") int value) { VkVideoEncodeAV1RateControlInfoKHR.set_gopFrameCount(this.segment(), value); return this; }

    /// {@return `keyFramePeriod` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_keyFramePeriod(MemorySegment segment, long index) { return (int) VH_keyFramePeriod.get(segment, 0L, index); }
    /// {@return `keyFramePeriod`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_keyFramePeriod(MemorySegment segment) { return VkVideoEncodeAV1RateControlInfoKHR.get_keyFramePeriod(segment, 0L); }
    /// {@return `keyFramePeriod`}
    public @CType("uint32_t") int keyFramePeriod() { return VkVideoEncodeAV1RateControlInfoKHR.get_keyFramePeriod(this.segment()); }
    /// Sets `keyFramePeriod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_keyFramePeriod(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_keyFramePeriod.set(segment, 0L, index, value); }
    /// Sets `keyFramePeriod` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_keyFramePeriod(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1RateControlInfoKHR.set_keyFramePeriod(segment, 0L, value); }
    /// Sets `keyFramePeriod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlInfoKHR keyFramePeriod(@CType("uint32_t") int value) { VkVideoEncodeAV1RateControlInfoKHR.set_keyFramePeriod(this.segment(), value); return this; }

    /// {@return `consecutiveBipredictiveFrameCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_consecutiveBipredictiveFrameCount(MemorySegment segment, long index) { return (int) VH_consecutiveBipredictiveFrameCount.get(segment, 0L, index); }
    /// {@return `consecutiveBipredictiveFrameCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_consecutiveBipredictiveFrameCount(MemorySegment segment) { return VkVideoEncodeAV1RateControlInfoKHR.get_consecutiveBipredictiveFrameCount(segment, 0L); }
    /// {@return `consecutiveBipredictiveFrameCount`}
    public @CType("uint32_t") int consecutiveBipredictiveFrameCount() { return VkVideoEncodeAV1RateControlInfoKHR.get_consecutiveBipredictiveFrameCount(this.segment()); }
    /// Sets `consecutiveBipredictiveFrameCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_consecutiveBipredictiveFrameCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_consecutiveBipredictiveFrameCount.set(segment, 0L, index, value); }
    /// Sets `consecutiveBipredictiveFrameCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_consecutiveBipredictiveFrameCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1RateControlInfoKHR.set_consecutiveBipredictiveFrameCount(segment, 0L, value); }
    /// Sets `consecutiveBipredictiveFrameCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlInfoKHR consecutiveBipredictiveFrameCount(@CType("uint32_t") int value) { VkVideoEncodeAV1RateControlInfoKHR.set_consecutiveBipredictiveFrameCount(this.segment(), value); return this; }

    /// {@return `temporalLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_temporalLayerCount(MemorySegment segment, long index) { return (int) VH_temporalLayerCount.get(segment, 0L, index); }
    /// {@return `temporalLayerCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_temporalLayerCount(MemorySegment segment) { return VkVideoEncodeAV1RateControlInfoKHR.get_temporalLayerCount(segment, 0L); }
    /// {@return `temporalLayerCount`}
    public @CType("uint32_t") int temporalLayerCount() { return VkVideoEncodeAV1RateControlInfoKHR.get_temporalLayerCount(this.segment()); }
    /// Sets `temporalLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_temporalLayerCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_temporalLayerCount.set(segment, 0L, index, value); }
    /// Sets `temporalLayerCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_temporalLayerCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1RateControlInfoKHR.set_temporalLayerCount(segment, 0L, value); }
    /// Sets `temporalLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlInfoKHR temporalLayerCount(@CType("uint32_t") int value) { VkVideoEncodeAV1RateControlInfoKHR.set_temporalLayerCount(this.segment(), value); return this; }

    /// A buffer of [VkVideoEncodeAV1RateControlInfoKHR].
    public static final class Buffer extends VkVideoEncodeAV1RateControlInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeAV1RateControlInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeAV1RateControlInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeAV1RateControlInfoKHR`
        public VkVideoEncodeAV1RateControlInfoKHR asSlice(long index) { return new VkVideoEncodeAV1RateControlInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeAV1RateControlInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeAV1RateControlInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeAV1RateControlInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeAV1RateControlInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeAV1RateControlInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1RateControlInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkVideoEncodeAV1RateControlFlagsKHR") int flagsAt(long index) { return VkVideoEncodeAV1RateControlInfoKHR.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkVideoEncodeAV1RateControlFlagsKHR") int value) { VkVideoEncodeAV1RateControlInfoKHR.set_flags(this.segment(), index, value); return this; }

        /// {@return `gopFrameCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int gopFrameCountAt(long index) { return VkVideoEncodeAV1RateControlInfoKHR.get_gopFrameCount(this.segment(), index); }
        /// Sets `gopFrameCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer gopFrameCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1RateControlInfoKHR.set_gopFrameCount(this.segment(), index, value); return this; }

        /// {@return `keyFramePeriod` at the given index}
        /// @param index the index
        public @CType("uint32_t") int keyFramePeriodAt(long index) { return VkVideoEncodeAV1RateControlInfoKHR.get_keyFramePeriod(this.segment(), index); }
        /// Sets `keyFramePeriod` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer keyFramePeriodAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1RateControlInfoKHR.set_keyFramePeriod(this.segment(), index, value); return this; }

        /// {@return `consecutiveBipredictiveFrameCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int consecutiveBipredictiveFrameCountAt(long index) { return VkVideoEncodeAV1RateControlInfoKHR.get_consecutiveBipredictiveFrameCount(this.segment(), index); }
        /// Sets `consecutiveBipredictiveFrameCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer consecutiveBipredictiveFrameCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1RateControlInfoKHR.set_consecutiveBipredictiveFrameCount(this.segment(), index, value); return this; }

        /// {@return `temporalLayerCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int temporalLayerCountAt(long index) { return VkVideoEncodeAV1RateControlInfoKHR.get_temporalLayerCount(this.segment(), index); }
        /// Sets `temporalLayerCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer temporalLayerCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1RateControlInfoKHR.set_temporalLayerCount(this.segment(), index, value); return this; }

    }
}
