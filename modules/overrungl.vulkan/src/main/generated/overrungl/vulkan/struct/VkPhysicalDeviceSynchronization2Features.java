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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceSynchronization2Features {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 synchronization2;
/// };
/// ```
public sealed class VkPhysicalDeviceSynchronization2Features extends GroupType {
    /// The struct layout of `VkPhysicalDeviceSynchronization2Features`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("synchronization2")
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
    /// The byte offset of `synchronization2`.
    public static final long OFFSET_synchronization2 = LAYOUT.byteOffset(PathElement.groupElement("synchronization2"));
    /// The memory layout of `synchronization2`.
    public static final MemoryLayout LAYOUT_synchronization2 = LAYOUT.select(PathElement.groupElement("synchronization2"));
    /// The [VarHandle] of `synchronization2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_synchronization2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("synchronization2"));

    /// Creates `VkPhysicalDeviceSynchronization2Features` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceSynchronization2Features(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceSynchronization2Features` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceSynchronization2Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSynchronization2Features ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSynchronization2Features(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceSynchronization2Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceSynchronization2Features` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSynchronization2Features`
    public static VkPhysicalDeviceSynchronization2Features alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSynchronization2Features(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceSynchronization2Features` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSynchronization2Features`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceSynchronization2Features` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param synchronization2 `synchronization2`
    /// @return the allocated `VkPhysicalDeviceSynchronization2Features`
    public static VkPhysicalDeviceSynchronization2Features allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int synchronization2) {
        return alloc(allocator).sType(sType).pNext(pNext).synchronization2(synchronization2);
    }

    /// Allocates a `VkPhysicalDeviceSynchronization2Features` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceSynchronization2Features`
    public static VkPhysicalDeviceSynchronization2Features allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceSynchronization2Features` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceSynchronization2Features`
    public static VkPhysicalDeviceSynchronization2Features allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceSynchronization2Features copyFrom(VkPhysicalDeviceSynchronization2Features src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceSynchronization2Features sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceSynchronization2Features pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `synchronization2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int synchronization2(MemorySegment segment, long index) { return (int) VH_synchronization2.get(segment, 0L, index); }
    /// {@return `synchronization2`}
    public int synchronization2() { return synchronization2(this.segment(), 0L); }
    /// Sets `synchronization2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void synchronization2(MemorySegment segment, long index, int value) { VH_synchronization2.set(segment, 0L, index, value); }
    /// Sets `synchronization2` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSynchronization2Features synchronization2(int value) { synchronization2(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceSynchronization2Features].
    public static final class Buffer extends VkPhysicalDeviceSynchronization2Features {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceSynchronization2Features.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceSynchronization2Features`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceSynchronization2Features`
        public VkPhysicalDeviceSynchronization2Features asSlice(long index) { return new VkPhysicalDeviceSynchronization2Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceSynchronization2Features`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceSynchronization2Features`
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

        /// {@return `synchronization2` at the given index}
        /// @param index the index of the struct buffer
        public int synchronization2At(long index) { return synchronization2(this.segment(), index); }
        /// Sets `synchronization2` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer synchronization2At(long index, int value) { synchronization2(this.segment(), index, value); return this; }

    }
}
