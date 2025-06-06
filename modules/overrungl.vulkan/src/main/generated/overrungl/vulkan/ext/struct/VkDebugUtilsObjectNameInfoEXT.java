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
/// struct VkDebugUtilsObjectNameInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkObjectType objectType;
///     uint64_t objectHandle;
///     const char* pObjectName;
/// };
/// ```
public sealed class VkDebugUtilsObjectNameInfoEXT extends GroupType {
    /// The struct layout of `VkDebugUtilsObjectNameInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("objectType"),
        ValueLayout.JAVA_LONG.withName("objectHandle"),
        ValueLayout.ADDRESS.withName("pObjectName")
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
    /// The byte offset of `objectType`.
    public static final long OFFSET_objectType = LAYOUT.byteOffset(PathElement.groupElement("objectType"));
    /// The memory layout of `objectType`.
    public static final MemoryLayout LAYOUT_objectType = LAYOUT.select(PathElement.groupElement("objectType"));
    /// The [VarHandle] of `objectType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_objectType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectType"));
    /// The byte offset of `objectHandle`.
    public static final long OFFSET_objectHandle = LAYOUT.byteOffset(PathElement.groupElement("objectHandle"));
    /// The memory layout of `objectHandle`.
    public static final MemoryLayout LAYOUT_objectHandle = LAYOUT.select(PathElement.groupElement("objectHandle"));
    /// The [VarHandle] of `objectHandle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_objectHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectHandle"));
    /// The byte offset of `pObjectName`.
    public static final long OFFSET_pObjectName = LAYOUT.byteOffset(PathElement.groupElement("pObjectName"));
    /// The memory layout of `pObjectName`.
    public static final MemoryLayout LAYOUT_pObjectName = LAYOUT.select(PathElement.groupElement("pObjectName"));
    /// The [VarHandle] of `pObjectName` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pObjectName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pObjectName"));

    /// Creates `VkDebugUtilsObjectNameInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkDebugUtilsObjectNameInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDebugUtilsObjectNameInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDebugUtilsObjectNameInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugUtilsObjectNameInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugUtilsObjectNameInfoEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkDebugUtilsObjectNameInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDebugUtilsObjectNameInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDebugUtilsObjectNameInfoEXT`
    public static VkDebugUtilsObjectNameInfoEXT alloc(SegmentAllocator allocator) { return new VkDebugUtilsObjectNameInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDebugUtilsObjectNameInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDebugUtilsObjectNameInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDebugUtilsObjectNameInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param objectType `objectType`
    /// @param objectHandle `objectHandle`
    /// @param pObjectName `pObjectName`
    /// @return the allocated `VkDebugUtilsObjectNameInfoEXT`
    public static VkDebugUtilsObjectNameInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int objectType, long objectHandle, MemorySegment pObjectName) {
        return alloc(allocator).sType(sType).pNext(pNext).objectType(objectType).objectHandle(objectHandle).pObjectName(pObjectName);
    }

    /// Allocates a `VkDebugUtilsObjectNameInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param objectType `objectType`
    /// @param objectHandle `objectHandle`
    /// @return the allocated `VkDebugUtilsObjectNameInfoEXT`
    public static VkDebugUtilsObjectNameInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int objectType, long objectHandle) {
        return alloc(allocator).sType(sType).pNext(pNext).objectType(objectType).objectHandle(objectHandle);
    }

    /// Allocates a `VkDebugUtilsObjectNameInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param objectType `objectType`
    /// @return the allocated `VkDebugUtilsObjectNameInfoEXT`
    public static VkDebugUtilsObjectNameInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int objectType) {
        return alloc(allocator).sType(sType).pNext(pNext).objectType(objectType);
    }

    /// Allocates a `VkDebugUtilsObjectNameInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkDebugUtilsObjectNameInfoEXT`
    public static VkDebugUtilsObjectNameInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkDebugUtilsObjectNameInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkDebugUtilsObjectNameInfoEXT`
    public static VkDebugUtilsObjectNameInfoEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDebugUtilsObjectNameInfoEXT copyFrom(VkDebugUtilsObjectNameInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkDebugUtilsObjectNameInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDebugUtilsObjectNameInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `objectType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int objectType(MemorySegment segment, long index) { return (int) VH_objectType.get(segment, 0L, index); }
    /// {@return `objectType`}
    public int objectType() { return objectType(this.segment(), 0L); }
    /// Sets `objectType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void objectType(MemorySegment segment, long index, int value) { VH_objectType.set(segment, 0L, index, value); }
    /// Sets `objectType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsObjectNameInfoEXT objectType(int value) { objectType(this.segment(), 0L, value); return this; }

    /// {@return `objectHandle` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long objectHandle(MemorySegment segment, long index) { return (long) VH_objectHandle.get(segment, 0L, index); }
    /// {@return `objectHandle`}
    public long objectHandle() { return objectHandle(this.segment(), 0L); }
    /// Sets `objectHandle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void objectHandle(MemorySegment segment, long index, long value) { VH_objectHandle.set(segment, 0L, index, value); }
    /// Sets `objectHandle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsObjectNameInfoEXT objectHandle(long value) { objectHandle(this.segment(), 0L, value); return this; }

    /// {@return `pObjectName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pObjectName(MemorySegment segment, long index) { return (MemorySegment) VH_pObjectName.get(segment, 0L, index); }
    /// {@return `pObjectName`}
    public MemorySegment pObjectName() { return pObjectName(this.segment(), 0L); }
    /// Sets `pObjectName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pObjectName(MemorySegment segment, long index, MemorySegment value) { VH_pObjectName.set(segment, 0L, index, value); }
    /// Sets `pObjectName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsObjectNameInfoEXT pObjectName(MemorySegment value) { pObjectName(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDebugUtilsObjectNameInfoEXT].
    public static final class Buffer extends VkDebugUtilsObjectNameInfoEXT {
        private final long elementCount;

        /// Creates `VkDebugUtilsObjectNameInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDebugUtilsObjectNameInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDebugUtilsObjectNameInfoEXT`
        public VkDebugUtilsObjectNameInfoEXT asSlice(long index) { return new VkDebugUtilsObjectNameInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDebugUtilsObjectNameInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDebugUtilsObjectNameInfoEXT`
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

        /// {@return `objectType` at the given index}
        /// @param index the index of the struct buffer
        public int objectTypeAt(long index) { return objectType(this.segment(), index); }
        /// Sets `objectType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer objectTypeAt(long index, int value) { objectType(this.segment(), index, value); return this; }

        /// {@return `objectHandle` at the given index}
        /// @param index the index of the struct buffer
        public long objectHandleAt(long index) { return objectHandle(this.segment(), index); }
        /// Sets `objectHandle` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer objectHandleAt(long index, long value) { objectHandle(this.segment(), index, value); return this; }

        /// {@return `pObjectName` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pObjectNameAt(long index) { return pObjectName(this.segment(), index); }
        /// Sets `pObjectName` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pObjectNameAt(long index, MemorySegment value) { pObjectName(this.segment(), index, value); return this; }

    }
}
