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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkRefreshObjectListKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t objectCount;
///     const VkRefreshObjectKHR* pObjects;
/// };
/// ```
public sealed class VkRefreshObjectListKHR extends GroupType {
    /// The struct layout of `VkRefreshObjectListKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("objectCount"),
        ValueLayout.ADDRESS.withName("pObjects")
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
    /// The byte offset of `objectCount`.
    public static final long OFFSET_objectCount = LAYOUT.byteOffset(PathElement.groupElement("objectCount"));
    /// The memory layout of `objectCount`.
    public static final MemoryLayout LAYOUT_objectCount = LAYOUT.select(PathElement.groupElement("objectCount"));
    /// The [VarHandle] of `objectCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_objectCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectCount"));
    /// The byte offset of `pObjects`.
    public static final long OFFSET_pObjects = LAYOUT.byteOffset(PathElement.groupElement("pObjects"));
    /// The memory layout of `pObjects`.
    public static final MemoryLayout LAYOUT_pObjects = LAYOUT.select(PathElement.groupElement("pObjects"));
    /// The [VarHandle] of `pObjects` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pObjects = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pObjects"));

    /// Creates `VkRefreshObjectListKHR` with the given segment.
    /// @param segment the memory segment
    public VkRefreshObjectListKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRefreshObjectListKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRefreshObjectListKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRefreshObjectListKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRefreshObjectListKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkRefreshObjectListKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRefreshObjectListKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRefreshObjectListKHR`
    public static VkRefreshObjectListKHR alloc(SegmentAllocator allocator) { return new VkRefreshObjectListKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRefreshObjectListKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRefreshObjectListKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkRefreshObjectListKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param objectCount `objectCount`
    /// @param pObjects `pObjects`
    /// @return the allocated `VkRefreshObjectListKHR`
    public static VkRefreshObjectListKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int objectCount, MemorySegment pObjects) {
        return alloc(allocator).sType(sType).pNext(pNext).objectCount(objectCount).pObjects(pObjects);
    }

    /// Allocates a `VkRefreshObjectListKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param objectCount `objectCount`
    /// @return the allocated `VkRefreshObjectListKHR`
    public static VkRefreshObjectListKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int objectCount) {
        return alloc(allocator).sType(sType).pNext(pNext).objectCount(objectCount);
    }

    /// Allocates a `VkRefreshObjectListKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkRefreshObjectListKHR`
    public static VkRefreshObjectListKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkRefreshObjectListKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkRefreshObjectListKHR`
    public static VkRefreshObjectListKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRefreshObjectListKHR copyFrom(VkRefreshObjectListKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkRefreshObjectListKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkRefreshObjectListKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `objectCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int objectCount(MemorySegment segment, long index) { return (int) VH_objectCount.get(segment, 0L, index); }
    /// {@return `objectCount`}
    public int objectCount() { return objectCount(this.segment(), 0L); }
    /// Sets `objectCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void objectCount(MemorySegment segment, long index, int value) { VH_objectCount.set(segment, 0L, index, value); }
    /// Sets `objectCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRefreshObjectListKHR objectCount(int value) { objectCount(this.segment(), 0L, value); return this; }

    /// {@return `pObjects` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pObjects(MemorySegment segment, long index) { return (MemorySegment) VH_pObjects.get(segment, 0L, index); }
    /// {@return `pObjects`}
    public MemorySegment pObjects() { return pObjects(this.segment(), 0L); }
    /// Sets `pObjects` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pObjects(MemorySegment segment, long index, MemorySegment value) { VH_pObjects.set(segment, 0L, index, value); }
    /// Sets `pObjects` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRefreshObjectListKHR pObjects(MemorySegment value) { pObjects(this.segment(), 0L, value); return this; }

    /// A buffer of [VkRefreshObjectListKHR].
    public static final class Buffer extends VkRefreshObjectListKHR {
        private final long elementCount;

        /// Creates `VkRefreshObjectListKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkRefreshObjectListKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkRefreshObjectListKHR`
        public VkRefreshObjectListKHR asSlice(long index) { return new VkRefreshObjectListKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkRefreshObjectListKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkRefreshObjectListKHR`
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

        /// {@return `objectCount` at the given index}
        /// @param index the index of the struct buffer
        public int objectCountAt(long index) { return objectCount(this.segment(), index); }
        /// Sets `objectCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer objectCountAt(long index, int value) { objectCount(this.segment(), index, value); return this; }

        /// {@return `pObjects` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pObjectsAt(long index) { return pObjects(this.segment(), index); }
        /// Sets `pObjects` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pObjectsAt(long index, MemorySegment value) { pObjects(this.segment(), index, value); return this; }

    }
}
