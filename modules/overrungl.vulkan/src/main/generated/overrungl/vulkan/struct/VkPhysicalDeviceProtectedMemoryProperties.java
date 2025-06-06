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
/// struct VkPhysicalDeviceProtectedMemoryProperties {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 protectedNoFault;
/// };
/// ```
public sealed class VkPhysicalDeviceProtectedMemoryProperties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceProtectedMemoryProperties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("protectedNoFault")
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
    /// The byte offset of `protectedNoFault`.
    public static final long OFFSET_protectedNoFault = LAYOUT.byteOffset(PathElement.groupElement("protectedNoFault"));
    /// The memory layout of `protectedNoFault`.
    public static final MemoryLayout LAYOUT_protectedNoFault = LAYOUT.select(PathElement.groupElement("protectedNoFault"));
    /// The [VarHandle] of `protectedNoFault` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_protectedNoFault = LAYOUT.arrayElementVarHandle(PathElement.groupElement("protectedNoFault"));

    /// Creates `VkPhysicalDeviceProtectedMemoryProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceProtectedMemoryProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceProtectedMemoryProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceProtectedMemoryProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceProtectedMemoryProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceProtectedMemoryProperties(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceProtectedMemoryProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceProtectedMemoryProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceProtectedMemoryProperties`
    public static VkPhysicalDeviceProtectedMemoryProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceProtectedMemoryProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceProtectedMemoryProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceProtectedMemoryProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceProtectedMemoryProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param protectedNoFault `protectedNoFault`
    /// @return the allocated `VkPhysicalDeviceProtectedMemoryProperties`
    public static VkPhysicalDeviceProtectedMemoryProperties allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int protectedNoFault) {
        return alloc(allocator).sType(sType).pNext(pNext).protectedNoFault(protectedNoFault);
    }

    /// Allocates a `VkPhysicalDeviceProtectedMemoryProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceProtectedMemoryProperties`
    public static VkPhysicalDeviceProtectedMemoryProperties allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceProtectedMemoryProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceProtectedMemoryProperties`
    public static VkPhysicalDeviceProtectedMemoryProperties allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceProtectedMemoryProperties copyFrom(VkPhysicalDeviceProtectedMemoryProperties src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceProtectedMemoryProperties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceProtectedMemoryProperties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `protectedNoFault` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int protectedNoFault(MemorySegment segment, long index) { return (int) VH_protectedNoFault.get(segment, 0L, index); }
    /// {@return `protectedNoFault`}
    public int protectedNoFault() { return protectedNoFault(this.segment(), 0L); }
    /// Sets `protectedNoFault` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void protectedNoFault(MemorySegment segment, long index, int value) { VH_protectedNoFault.set(segment, 0L, index, value); }
    /// Sets `protectedNoFault` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProtectedMemoryProperties protectedNoFault(int value) { protectedNoFault(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceProtectedMemoryProperties].
    public static final class Buffer extends VkPhysicalDeviceProtectedMemoryProperties {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceProtectedMemoryProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceProtectedMemoryProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceProtectedMemoryProperties`
        public VkPhysicalDeviceProtectedMemoryProperties asSlice(long index) { return new VkPhysicalDeviceProtectedMemoryProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceProtectedMemoryProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceProtectedMemoryProperties`
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

        /// {@return `protectedNoFault` at the given index}
        /// @param index the index of the struct buffer
        public int protectedNoFaultAt(long index) { return protectedNoFault(this.segment(), index); }
        /// Sets `protectedNoFault` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer protectedNoFaultAt(long index, int value) { protectedNoFault(this.segment(), index, value); return this; }

    }
}
