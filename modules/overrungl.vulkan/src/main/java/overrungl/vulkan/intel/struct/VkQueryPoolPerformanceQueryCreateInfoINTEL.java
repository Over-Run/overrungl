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
package overrungl.vulkan.intel.struct;

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
/// ### performanceCountersSampling
/// [VarHandle][#VH_performanceCountersSampling] - [Getter][#performanceCountersSampling()] - [Setter][#performanceCountersSampling(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkQueryPoolPerformanceQueryCreateInfoINTEL {
///     VkStructureType sType;
///     const void * pNext;
///     VkQueryPoolSamplingModeINTEL performanceCountersSampling;
/// } VkQueryPoolPerformanceQueryCreateInfoINTEL;
/// ```
public sealed class VkQueryPoolPerformanceQueryCreateInfoINTEL extends Struct {
    /// The struct layout of `VkQueryPoolPerformanceQueryCreateInfoINTEL`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("performanceCountersSampling")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `performanceCountersSampling` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_performanceCountersSampling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("performanceCountersSampling"));

    /// Creates `VkQueryPoolPerformanceQueryCreateInfoINTEL` with the given segment.
    /// @param segment the memory segment
    public VkQueryPoolPerformanceQueryCreateInfoINTEL(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkQueryPoolPerformanceQueryCreateInfoINTEL` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueryPoolPerformanceQueryCreateInfoINTEL of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkQueryPoolPerformanceQueryCreateInfoINTEL(segment); }

    /// Creates `VkQueryPoolPerformanceQueryCreateInfoINTEL` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkQueryPoolPerformanceQueryCreateInfoINTEL` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueryPoolPerformanceQueryCreateInfoINTEL ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkQueryPoolPerformanceQueryCreateInfoINTEL(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkQueryPoolPerformanceQueryCreateInfoINTEL` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkQueryPoolPerformanceQueryCreateInfoINTEL` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkQueryPoolPerformanceQueryCreateInfoINTEL`
    public static VkQueryPoolPerformanceQueryCreateInfoINTEL alloc(SegmentAllocator allocator) { return new VkQueryPoolPerformanceQueryCreateInfoINTEL(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkQueryPoolPerformanceQueryCreateInfoINTEL` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkQueryPoolPerformanceQueryCreateInfoINTEL`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkQueryPoolPerformanceQueryCreateInfoINTEL` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkQueryPoolPerformanceQueryCreateInfoINTEL`
    public static VkQueryPoolPerformanceQueryCreateInfoINTEL allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkQueryPoolSamplingModeINTEL") int performanceCountersSampling) { return alloc(allocator).sType(sType).pNext(pNext).performanceCountersSampling(performanceCountersSampling); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkQueryPoolPerformanceQueryCreateInfoINTEL copyFrom(VkQueryPoolPerformanceQueryCreateInfoINTEL src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkQueryPoolPerformanceQueryCreateInfoINTEL.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkQueryPoolPerformanceQueryCreateInfoINTEL.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkQueryPoolPerformanceQueryCreateInfoINTEL.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceQueryCreateInfoINTEL sType(@CType("VkStructureType") int value) { VkQueryPoolPerformanceQueryCreateInfoINTEL.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkQueryPoolPerformanceQueryCreateInfoINTEL.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkQueryPoolPerformanceQueryCreateInfoINTEL.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkQueryPoolPerformanceQueryCreateInfoINTEL.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceQueryCreateInfoINTEL pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkQueryPoolPerformanceQueryCreateInfoINTEL.set_pNext(this.segment(), value); return this; }

    /// {@return `performanceCountersSampling` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkQueryPoolSamplingModeINTEL") int get_performanceCountersSampling(MemorySegment segment, long index) { return (int) VH_performanceCountersSampling.get(segment, 0L, index); }
    /// {@return `performanceCountersSampling`}
    /// @param segment the segment of the struct
    public static @CType("VkQueryPoolSamplingModeINTEL") int get_performanceCountersSampling(MemorySegment segment) { return VkQueryPoolPerformanceQueryCreateInfoINTEL.get_performanceCountersSampling(segment, 0L); }
    /// {@return `performanceCountersSampling`}
    public @CType("VkQueryPoolSamplingModeINTEL") int performanceCountersSampling() { return VkQueryPoolPerformanceQueryCreateInfoINTEL.get_performanceCountersSampling(this.segment()); }
    /// Sets `performanceCountersSampling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_performanceCountersSampling(MemorySegment segment, long index, @CType("VkQueryPoolSamplingModeINTEL") int value) { VH_performanceCountersSampling.set(segment, 0L, index, value); }
    /// Sets `performanceCountersSampling` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_performanceCountersSampling(MemorySegment segment, @CType("VkQueryPoolSamplingModeINTEL") int value) { VkQueryPoolPerformanceQueryCreateInfoINTEL.set_performanceCountersSampling(segment, 0L, value); }
    /// Sets `performanceCountersSampling` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceQueryCreateInfoINTEL performanceCountersSampling(@CType("VkQueryPoolSamplingModeINTEL") int value) { VkQueryPoolPerformanceQueryCreateInfoINTEL.set_performanceCountersSampling(this.segment(), value); return this; }

    /// A buffer of [VkQueryPoolPerformanceQueryCreateInfoINTEL].
    public static final class Buffer extends VkQueryPoolPerformanceQueryCreateInfoINTEL {
        private final long elementCount;

        /// Creates `VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkQueryPoolPerformanceQueryCreateInfoINTEL`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkQueryPoolPerformanceQueryCreateInfoINTEL`
        public VkQueryPoolPerformanceQueryCreateInfoINTEL asSlice(long index) { return new VkQueryPoolPerformanceQueryCreateInfoINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkQueryPoolPerformanceQueryCreateInfoINTEL`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkQueryPoolPerformanceQueryCreateInfoINTEL`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkQueryPoolPerformanceQueryCreateInfoINTEL.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkQueryPoolPerformanceQueryCreateInfoINTEL.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkQueryPoolPerformanceQueryCreateInfoINTEL.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkQueryPoolPerformanceQueryCreateInfoINTEL.set_pNext(this.segment(), index, value); return this; }

        /// {@return `performanceCountersSampling` at the given index}
        /// @param index the index
        public @CType("VkQueryPoolSamplingModeINTEL") int performanceCountersSamplingAt(long index) { return VkQueryPoolPerformanceQueryCreateInfoINTEL.get_performanceCountersSampling(this.segment(), index); }
        /// Sets `performanceCountersSampling` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer performanceCountersSamplingAt(long index, @CType("VkQueryPoolSamplingModeINTEL") int value) { VkQueryPoolPerformanceQueryCreateInfoINTEL.set_performanceCountersSampling(this.segment(), index, value); return this; }

    }
}
