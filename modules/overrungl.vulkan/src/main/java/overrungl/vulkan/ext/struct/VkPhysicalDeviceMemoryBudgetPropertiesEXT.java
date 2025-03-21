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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceMemoryBudgetPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint64_t) VkDeviceSize heapBudget[16];
///     (uint64_t) VkDeviceSize heapUsage[16];
/// };
/// ```
public sealed class VkPhysicalDeviceMemoryBudgetPropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceMemoryBudgetPropertiesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(16L, ValueLayout.JAVA_LONG).withName("heapBudget"),
        MemoryLayout.sequenceLayout(16L, ValueLayout.JAVA_LONG).withName("heapUsage")
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
    /// The byte offset of `heapBudget`.
    public static final long OFFSET_heapBudget = LAYOUT.byteOffset(PathElement.groupElement("heapBudget"));
    /// The memory layout of `heapBudget`.
    public static final MemoryLayout LAYOUT_heapBudget = LAYOUT.select(PathElement.groupElement("heapBudget"));
    /// The [VarHandle] of `heapBudget` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_heapBudget = LAYOUT.arrayElementVarHandle(PathElement.groupElement("heapBudget"), PathElement.sequenceElement());
    /// The byte offset of `heapUsage`.
    public static final long OFFSET_heapUsage = LAYOUT.byteOffset(PathElement.groupElement("heapUsage"));
    /// The memory layout of `heapUsage`.
    public static final MemoryLayout LAYOUT_heapUsage = LAYOUT.select(PathElement.groupElement("heapUsage"));
    /// The [VarHandle] of `heapUsage` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_heapUsage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("heapUsage"), PathElement.sequenceElement());

    /// Creates `VkPhysicalDeviceMemoryBudgetPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceMemoryBudgetPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMemoryBudgetPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryBudgetPropertiesEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceMemoryBudgetPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceMemoryBudgetPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMemoryBudgetPropertiesEXT`
    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMemoryBudgetPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMemoryBudgetPropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT copyFrom(VkPhysicalDeviceMemoryBudgetPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `heapBudget` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment heapBudget(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_heapBudget, index), LAYOUT_heapBudget); }
    /// {@return `heapBudget` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static long heapBudget(MemorySegment segment, long index, long index0) { return (long) VH_heapBudget.get(segment, 0L, index, index0); }
    /// {@return `heapBudget`}
    public MemorySegment heapBudget() { return heapBudget(this.segment(), 0L); }
    /// {@return `heapBudget`}
    /// @param index0 the Index 0 of the array
    public long heapBudget(long index0) { return heapBudget(this.segment(), 0L, index0); }
    /// Sets `heapBudget` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void heapBudget(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_heapBudget, index), LAYOUT_heapBudget.byteSize()); }
    /// Sets `heapBudget` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void heapBudget(MemorySegment segment, long index, long index0, long value) { VH_heapBudget.set(segment, 0L, index, index0, value); }
    /// Sets `heapBudget` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT heapBudget(MemorySegment value) { heapBudget(this.segment(), 0L, value); return this; }
    /// Sets `heapBudget` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT heapBudget(long index0, long value) { heapBudget(this.segment(), 0L, index0, value); return this; }

    /// {@return `heapUsage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment heapUsage(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_heapUsage, index), LAYOUT_heapUsage); }
    /// {@return `heapUsage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static long heapUsage(MemorySegment segment, long index, long index0) { return (long) VH_heapUsage.get(segment, 0L, index, index0); }
    /// {@return `heapUsage`}
    public MemorySegment heapUsage() { return heapUsage(this.segment(), 0L); }
    /// {@return `heapUsage`}
    /// @param index0 the Index 0 of the array
    public long heapUsage(long index0) { return heapUsage(this.segment(), 0L, index0); }
    /// Sets `heapUsage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void heapUsage(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_heapUsage, index), LAYOUT_heapUsage.byteSize()); }
    /// Sets `heapUsage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void heapUsage(MemorySegment segment, long index, long index0, long value) { VH_heapUsage.set(segment, 0L, index, index0, value); }
    /// Sets `heapUsage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT heapUsage(MemorySegment value) { heapUsage(this.segment(), 0L, value); return this; }
    /// Sets `heapUsage` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT heapUsage(long index0, long value) { heapUsage(this.segment(), 0L, index0, value); return this; }

    /// A buffer of [VkPhysicalDeviceMemoryBudgetPropertiesEXT].
    public static final class Buffer extends VkPhysicalDeviceMemoryBudgetPropertiesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceMemoryBudgetPropertiesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceMemoryBudgetPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceMemoryBudgetPropertiesEXT`
        public VkPhysicalDeviceMemoryBudgetPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceMemoryBudgetPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceMemoryBudgetPropertiesEXT`
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

        /// {@return `heapBudget` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment heapBudgetAt(long index) { return heapBudget(this.segment(), index); }
        /// {@return `heapBudget` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public long heapBudgetAt(long index, long index0) { return heapBudget(this.segment(), index, index0); }
        /// Sets `heapBudget` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer heapBudgetAt(long index, MemorySegment value) { heapBudget(this.segment(), index, value); return this; }
        /// Sets `heapBudget` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer heapBudgetAt(long index, long index0, long value) { heapBudget(this.segment(), index, index0, value); return this; }

        /// {@return `heapUsage` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment heapUsageAt(long index) { return heapUsage(this.segment(), index); }
        /// {@return `heapUsage` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public long heapUsageAt(long index, long index0) { return heapUsage(this.segment(), index, index0); }
        /// Sets `heapUsage` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer heapUsageAt(long index, MemorySegment value) { heapUsage(this.segment(), index, value); return this; }
        /// Sets `heapUsage` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer heapUsageAt(long index, long index0, long value) { heapUsage(this.segment(), index, index0, value); return this; }

    }
}
