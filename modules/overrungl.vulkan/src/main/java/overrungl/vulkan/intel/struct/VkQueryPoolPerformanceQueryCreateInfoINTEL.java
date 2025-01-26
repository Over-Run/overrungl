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
//@formatter:off
package overrungl.vulkan.intel.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkQueryPoolPerformanceQueryCreateInfoINTEL {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkQueryPoolSamplingModeINTEL performanceCountersSampling;
/// };
/// ```
public sealed class VkQueryPoolPerformanceQueryCreateInfoINTEL extends GroupType {
    /// The struct layout of `VkQueryPoolPerformanceQueryCreateInfoINTEL`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("performanceCountersSampling")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `performanceCountersSampling`.
    public static final long OFFSET_performanceCountersSampling = LAYOUT.byteOffset(PathElement.groupElement("performanceCountersSampling"));
    /// The memory layout of `performanceCountersSampling`.
    public static final MemoryLayout LAYOUT_performanceCountersSampling = LAYOUT.select(PathElement.groupElement("performanceCountersSampling"));
    /// The [VarHandle] of `performanceCountersSampling` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_performanceCountersSampling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("performanceCountersSampling"));

    /// Creates `VkQueryPoolPerformanceQueryCreateInfoINTEL` with the given segment.
    /// @param segment the memory segment
    public VkQueryPoolPerformanceQueryCreateInfoINTEL(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkQueryPoolPerformanceQueryCreateInfoINTEL` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkQueryPoolPerformanceQueryCreateInfoINTEL` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueryPoolPerformanceQueryCreateInfoINTEL ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueryPoolPerformanceQueryCreateInfoINTEL(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkQueryPoolPerformanceQueryCreateInfoINTEL` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkQueryPoolPerformanceQueryCreateInfoINTEL` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkQueryPoolPerformanceQueryCreateInfoINTEL`
    public static VkQueryPoolPerformanceQueryCreateInfoINTEL alloc(SegmentAllocator allocator) { return new VkQueryPoolPerformanceQueryCreateInfoINTEL(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkQueryPoolPerformanceQueryCreateInfoINTEL` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkQueryPoolPerformanceQueryCreateInfoINTEL`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkQueryPoolPerformanceQueryCreateInfoINTEL copyFrom(VkQueryPoolPerformanceQueryCreateInfoINTEL src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceQueryCreateInfoINTEL sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceQueryCreateInfoINTEL pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `performanceCountersSampling` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int performanceCountersSampling(MemorySegment segment, long index) { return (int) VH_performanceCountersSampling.get(segment, 0L, index); }
    /// {@return `performanceCountersSampling`}
    public int performanceCountersSampling() { return performanceCountersSampling(this.segment(), 0L); }
    /// Sets `performanceCountersSampling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void performanceCountersSampling(MemorySegment segment, long index, int value) { VH_performanceCountersSampling.set(segment, 0L, index, value); }
    /// Sets `performanceCountersSampling` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueryPoolPerformanceQueryCreateInfoINTEL performanceCountersSampling(int value) { performanceCountersSampling(this.segment(), 0L, value); return this; }

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
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `performanceCountersSampling` at the given index}
        /// @param index the index of the struct buffer
        public int performanceCountersSamplingAt(long index) { return performanceCountersSampling(this.segment(), index); }
        /// Sets `performanceCountersSampling` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer performanceCountersSamplingAt(long index, int value) { performanceCountersSampling(this.segment(), index, value); return this; }

    }
}
