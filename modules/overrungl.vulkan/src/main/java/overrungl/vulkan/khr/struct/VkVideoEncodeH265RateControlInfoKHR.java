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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### gopFrameCount
/// [VarHandle][#VH_gopFrameCount] - [Getter][#gopFrameCount()] - [Setter][#gopFrameCount(int)]
/// ### idrPeriod
/// [VarHandle][#VH_idrPeriod] - [Getter][#idrPeriod()] - [Setter][#idrPeriod(int)]
/// ### consecutiveBFrameCount
/// [VarHandle][#VH_consecutiveBFrameCount] - [Getter][#consecutiveBFrameCount()] - [Setter][#consecutiveBFrameCount(int)]
/// ### subLayerCount
/// [VarHandle][#VH_subLayerCount] - [Getter][#subLayerCount()] - [Setter][#subLayerCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeH265RateControlInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkVideoEncodeH265RateControlFlagsKHR flags;
///     uint32_t gopFrameCount;
///     uint32_t idrPeriod;
///     uint32_t consecutiveBFrameCount;
///     uint32_t subLayerCount;
/// } VkVideoEncodeH265RateControlInfoKHR;
/// ```
public sealed class VkVideoEncodeH265RateControlInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH265RateControlInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("gopFrameCount"),
        ValueLayout.JAVA_INT.withName("idrPeriod"),
        ValueLayout.JAVA_INT.withName("consecutiveBFrameCount"),
        ValueLayout.JAVA_INT.withName("subLayerCount")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `gopFrameCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_gopFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopFrameCount"));
    /// The [VarHandle] of `idrPeriod` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_idrPeriod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("idrPeriod"));
    /// The [VarHandle] of `consecutiveBFrameCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_consecutiveBFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("consecutiveBFrameCount"));
    /// The [VarHandle] of `subLayerCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subLayerCount"));

    /// Creates `VkVideoEncodeH265RateControlInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH265RateControlInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH265RateControlInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265RateControlInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265RateControlInfoKHR(segment); }

    /// Creates `VkVideoEncodeH265RateControlInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH265RateControlInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265RateControlInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265RateControlInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH265RateControlInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeH265RateControlInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265RateControlInfoKHR`
    public static VkVideoEncodeH265RateControlInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265RateControlInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH265RateControlInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265RateControlInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeH265RateControlInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265RateControlInfoKHR`
    public static VkVideoEncodeH265RateControlInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkVideoEncodeH265RateControlFlagsKHR") int flags, @CType("uint32_t") int gopFrameCount, @CType("uint32_t") int idrPeriod, @CType("uint32_t") int consecutiveBFrameCount, @CType("uint32_t") int subLayerCount) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).gopFrameCount(gopFrameCount).idrPeriod(idrPeriod).consecutiveBFrameCount(consecutiveBFrameCount).subLayerCount(subLayerCount); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH265RateControlInfoKHR copyFrom(VkVideoEncodeH265RateControlInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeH265RateControlInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeH265RateControlInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeH265RateControlInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeH265RateControlInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeH265RateControlInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkVideoEncodeH265RateControlInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkVideoEncodeH265RateControlInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlInfoKHR pNext(@CType("const void *") MemorySegment value) { VkVideoEncodeH265RateControlInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeH265RateControlFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeH265RateControlFlagsKHR") int get_flags(MemorySegment segment) { return VkVideoEncodeH265RateControlInfoKHR.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkVideoEncodeH265RateControlFlagsKHR") int flags() { return VkVideoEncodeH265RateControlInfoKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkVideoEncodeH265RateControlFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkVideoEncodeH265RateControlFlagsKHR") int value) { VkVideoEncodeH265RateControlInfoKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlInfoKHR flags(@CType("VkVideoEncodeH265RateControlFlagsKHR") int value) { VkVideoEncodeH265RateControlInfoKHR.set_flags(this.segment(), value); return this; }

    /// {@return `gopFrameCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_gopFrameCount(MemorySegment segment, long index) { return (int) VH_gopFrameCount.get(segment, 0L, index); }
    /// {@return `gopFrameCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_gopFrameCount(MemorySegment segment) { return VkVideoEncodeH265RateControlInfoKHR.get_gopFrameCount(segment, 0L); }
    /// {@return `gopFrameCount`}
    public @CType("uint32_t") int gopFrameCount() { return VkVideoEncodeH265RateControlInfoKHR.get_gopFrameCount(this.segment()); }
    /// Sets `gopFrameCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_gopFrameCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_gopFrameCount.set(segment, 0L, index, value); }
    /// Sets `gopFrameCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_gopFrameCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH265RateControlInfoKHR.set_gopFrameCount(segment, 0L, value); }
    /// Sets `gopFrameCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlInfoKHR gopFrameCount(@CType("uint32_t") int value) { VkVideoEncodeH265RateControlInfoKHR.set_gopFrameCount(this.segment(), value); return this; }

    /// {@return `idrPeriod` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_idrPeriod(MemorySegment segment, long index) { return (int) VH_idrPeriod.get(segment, 0L, index); }
    /// {@return `idrPeriod`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_idrPeriod(MemorySegment segment) { return VkVideoEncodeH265RateControlInfoKHR.get_idrPeriod(segment, 0L); }
    /// {@return `idrPeriod`}
    public @CType("uint32_t") int idrPeriod() { return VkVideoEncodeH265RateControlInfoKHR.get_idrPeriod(this.segment()); }
    /// Sets `idrPeriod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_idrPeriod(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_idrPeriod.set(segment, 0L, index, value); }
    /// Sets `idrPeriod` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_idrPeriod(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH265RateControlInfoKHR.set_idrPeriod(segment, 0L, value); }
    /// Sets `idrPeriod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlInfoKHR idrPeriod(@CType("uint32_t") int value) { VkVideoEncodeH265RateControlInfoKHR.set_idrPeriod(this.segment(), value); return this; }

    /// {@return `consecutiveBFrameCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_consecutiveBFrameCount(MemorySegment segment, long index) { return (int) VH_consecutiveBFrameCount.get(segment, 0L, index); }
    /// {@return `consecutiveBFrameCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_consecutiveBFrameCount(MemorySegment segment) { return VkVideoEncodeH265RateControlInfoKHR.get_consecutiveBFrameCount(segment, 0L); }
    /// {@return `consecutiveBFrameCount`}
    public @CType("uint32_t") int consecutiveBFrameCount() { return VkVideoEncodeH265RateControlInfoKHR.get_consecutiveBFrameCount(this.segment()); }
    /// Sets `consecutiveBFrameCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_consecutiveBFrameCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_consecutiveBFrameCount.set(segment, 0L, index, value); }
    /// Sets `consecutiveBFrameCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_consecutiveBFrameCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH265RateControlInfoKHR.set_consecutiveBFrameCount(segment, 0L, value); }
    /// Sets `consecutiveBFrameCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlInfoKHR consecutiveBFrameCount(@CType("uint32_t") int value) { VkVideoEncodeH265RateControlInfoKHR.set_consecutiveBFrameCount(this.segment(), value); return this; }

    /// {@return `subLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_subLayerCount(MemorySegment segment, long index) { return (int) VH_subLayerCount.get(segment, 0L, index); }
    /// {@return `subLayerCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_subLayerCount(MemorySegment segment) { return VkVideoEncodeH265RateControlInfoKHR.get_subLayerCount(segment, 0L); }
    /// {@return `subLayerCount`}
    public @CType("uint32_t") int subLayerCount() { return VkVideoEncodeH265RateControlInfoKHR.get_subLayerCount(this.segment()); }
    /// Sets `subLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subLayerCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_subLayerCount.set(segment, 0L, index, value); }
    /// Sets `subLayerCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subLayerCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH265RateControlInfoKHR.set_subLayerCount(segment, 0L, value); }
    /// Sets `subLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlInfoKHR subLayerCount(@CType("uint32_t") int value) { VkVideoEncodeH265RateControlInfoKHR.set_subLayerCount(this.segment(), value); return this; }

    /// A buffer of [VkVideoEncodeH265RateControlInfoKHR].
    public static final class Buffer extends VkVideoEncodeH265RateControlInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeH265RateControlInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeH265RateControlInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeH265RateControlInfoKHR`
        public VkVideoEncodeH265RateControlInfoKHR asSlice(long index) { return new VkVideoEncodeH265RateControlInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeH265RateControlInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeH265RateControlInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeH265RateControlInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeH265RateControlInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkVideoEncodeH265RateControlInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkVideoEncodeH265RateControlInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkVideoEncodeH265RateControlFlagsKHR") int flagsAt(long index) { return VkVideoEncodeH265RateControlInfoKHR.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkVideoEncodeH265RateControlFlagsKHR") int value) { VkVideoEncodeH265RateControlInfoKHR.set_flags(this.segment(), index, value); return this; }

        /// {@return `gopFrameCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int gopFrameCountAt(long index) { return VkVideoEncodeH265RateControlInfoKHR.get_gopFrameCount(this.segment(), index); }
        /// Sets `gopFrameCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer gopFrameCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH265RateControlInfoKHR.set_gopFrameCount(this.segment(), index, value); return this; }

        /// {@return `idrPeriod` at the given index}
        /// @param index the index
        public @CType("uint32_t") int idrPeriodAt(long index) { return VkVideoEncodeH265RateControlInfoKHR.get_idrPeriod(this.segment(), index); }
        /// Sets `idrPeriod` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer idrPeriodAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH265RateControlInfoKHR.set_idrPeriod(this.segment(), index, value); return this; }

        /// {@return `consecutiveBFrameCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int consecutiveBFrameCountAt(long index) { return VkVideoEncodeH265RateControlInfoKHR.get_consecutiveBFrameCount(this.segment(), index); }
        /// Sets `consecutiveBFrameCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer consecutiveBFrameCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH265RateControlInfoKHR.set_consecutiveBFrameCount(this.segment(), index, value); return this; }

        /// {@return `subLayerCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int subLayerCountAt(long index) { return VkVideoEncodeH265RateControlInfoKHR.get_subLayerCount(this.segment(), index); }
        /// Sets `subLayerCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer subLayerCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH265RateControlInfoKHR.set_subLayerCount(this.segment(), index, value); return this; }

    }
}
