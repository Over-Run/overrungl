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
package overrungl.vulkan.android.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkAndroidHardwareBufferUsageANDROID {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint64_t androidHardwareBufferUsage;
/// };
/// ```
public sealed class VkAndroidHardwareBufferUsageANDROID extends GroupType {
    /// The struct layout of `VkAndroidHardwareBufferUsageANDROID`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("androidHardwareBufferUsage")
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
    /// The byte offset of `androidHardwareBufferUsage`.
    public static final long OFFSET_androidHardwareBufferUsage = LAYOUT.byteOffset(PathElement.groupElement("androidHardwareBufferUsage"));
    /// The memory layout of `androidHardwareBufferUsage`.
    public static final MemoryLayout LAYOUT_androidHardwareBufferUsage = LAYOUT.select(PathElement.groupElement("androidHardwareBufferUsage"));
    /// The [VarHandle] of `androidHardwareBufferUsage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_androidHardwareBufferUsage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("androidHardwareBufferUsage"));

    /// Creates `VkAndroidHardwareBufferUsageANDROID` with the given segment.
    /// @param segment the memory segment
    public VkAndroidHardwareBufferUsageANDROID(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAndroidHardwareBufferUsageANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAndroidHardwareBufferUsageANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAndroidHardwareBufferUsageANDROID ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAndroidHardwareBufferUsageANDROID(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkAndroidHardwareBufferUsageANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAndroidHardwareBufferUsageANDROID` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAndroidHardwareBufferUsageANDROID`
    public static VkAndroidHardwareBufferUsageANDROID alloc(SegmentAllocator allocator) { return new VkAndroidHardwareBufferUsageANDROID(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAndroidHardwareBufferUsageANDROID` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAndroidHardwareBufferUsageANDROID`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAndroidHardwareBufferUsageANDROID` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param androidHardwareBufferUsage `androidHardwareBufferUsage`
    /// @return the allocated `VkAndroidHardwareBufferUsageANDROID`
    public static VkAndroidHardwareBufferUsageANDROID allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long androidHardwareBufferUsage) {
        return alloc(allocator).sType(sType).pNext(pNext).androidHardwareBufferUsage(androidHardwareBufferUsage);
    }

    /// Allocates a `VkAndroidHardwareBufferUsageANDROID` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkAndroidHardwareBufferUsageANDROID`
    public static VkAndroidHardwareBufferUsageANDROID allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkAndroidHardwareBufferUsageANDROID` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkAndroidHardwareBufferUsageANDROID`
    public static VkAndroidHardwareBufferUsageANDROID allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAndroidHardwareBufferUsageANDROID copyFrom(VkAndroidHardwareBufferUsageANDROID src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkAndroidHardwareBufferUsageANDROID sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkAndroidHardwareBufferUsageANDROID pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `androidHardwareBufferUsage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long androidHardwareBufferUsage(MemorySegment segment, long index) { return (long) VH_androidHardwareBufferUsage.get(segment, 0L, index); }
    /// {@return `androidHardwareBufferUsage`}
    public long androidHardwareBufferUsage() { return androidHardwareBufferUsage(this.segment(), 0L); }
    /// Sets `androidHardwareBufferUsage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void androidHardwareBufferUsage(MemorySegment segment, long index, long value) { VH_androidHardwareBufferUsage.set(segment, 0L, index, value); }
    /// Sets `androidHardwareBufferUsage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferUsageANDROID androidHardwareBufferUsage(long value) { androidHardwareBufferUsage(this.segment(), 0L, value); return this; }

    /// A buffer of [VkAndroidHardwareBufferUsageANDROID].
    public static final class Buffer extends VkAndroidHardwareBufferUsageANDROID {
        private final long elementCount;

        /// Creates `VkAndroidHardwareBufferUsageANDROID.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAndroidHardwareBufferUsageANDROID`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAndroidHardwareBufferUsageANDROID`
        public VkAndroidHardwareBufferUsageANDROID asSlice(long index) { return new VkAndroidHardwareBufferUsageANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAndroidHardwareBufferUsageANDROID`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAndroidHardwareBufferUsageANDROID`
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

        /// {@return `androidHardwareBufferUsage` at the given index}
        /// @param index the index of the struct buffer
        public long androidHardwareBufferUsageAt(long index) { return androidHardwareBufferUsage(this.segment(), index); }
        /// Sets `androidHardwareBufferUsage` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer androidHardwareBufferUsageAt(long index, long value) { androidHardwareBufferUsage(this.segment(), index, value); return this; }

    }
}
