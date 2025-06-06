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
/// struct VkMutableDescriptorTypeCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t mutableDescriptorTypeListCount;
///     const VkMutableDescriptorTypeListEXT* pMutableDescriptorTypeLists;
/// };
/// ```
public sealed class VkMutableDescriptorTypeCreateInfoEXT extends GroupType {
    /// The struct layout of `VkMutableDescriptorTypeCreateInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("mutableDescriptorTypeListCount"),
        ValueLayout.ADDRESS.withName("pMutableDescriptorTypeLists")
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
    /// The byte offset of `mutableDescriptorTypeListCount`.
    public static final long OFFSET_mutableDescriptorTypeListCount = LAYOUT.byteOffset(PathElement.groupElement("mutableDescriptorTypeListCount"));
    /// The memory layout of `mutableDescriptorTypeListCount`.
    public static final MemoryLayout LAYOUT_mutableDescriptorTypeListCount = LAYOUT.select(PathElement.groupElement("mutableDescriptorTypeListCount"));
    /// The [VarHandle] of `mutableDescriptorTypeListCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mutableDescriptorTypeListCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mutableDescriptorTypeListCount"));
    /// The byte offset of `pMutableDescriptorTypeLists`.
    public static final long OFFSET_pMutableDescriptorTypeLists = LAYOUT.byteOffset(PathElement.groupElement("pMutableDescriptorTypeLists"));
    /// The memory layout of `pMutableDescriptorTypeLists`.
    public static final MemoryLayout LAYOUT_pMutableDescriptorTypeLists = LAYOUT.select(PathElement.groupElement("pMutableDescriptorTypeLists"));
    /// The [VarHandle] of `pMutableDescriptorTypeLists` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pMutableDescriptorTypeLists = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMutableDescriptorTypeLists"));

    /// Creates `VkMutableDescriptorTypeCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkMutableDescriptorTypeCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMutableDescriptorTypeCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMutableDescriptorTypeCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMutableDescriptorTypeCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMutableDescriptorTypeCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkMutableDescriptorTypeCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMutableDescriptorTypeCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMutableDescriptorTypeCreateInfoEXT`
    public static VkMutableDescriptorTypeCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkMutableDescriptorTypeCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMutableDescriptorTypeCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMutableDescriptorTypeCreateInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkMutableDescriptorTypeCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param mutableDescriptorTypeListCount `mutableDescriptorTypeListCount`
    /// @param pMutableDescriptorTypeLists `pMutableDescriptorTypeLists`
    /// @return the allocated `VkMutableDescriptorTypeCreateInfoEXT`
    public static VkMutableDescriptorTypeCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int mutableDescriptorTypeListCount, MemorySegment pMutableDescriptorTypeLists) {
        return alloc(allocator).sType(sType).pNext(pNext).mutableDescriptorTypeListCount(mutableDescriptorTypeListCount).pMutableDescriptorTypeLists(pMutableDescriptorTypeLists);
    }

    /// Allocates a `VkMutableDescriptorTypeCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param mutableDescriptorTypeListCount `mutableDescriptorTypeListCount`
    /// @return the allocated `VkMutableDescriptorTypeCreateInfoEXT`
    public static VkMutableDescriptorTypeCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int mutableDescriptorTypeListCount) {
        return alloc(allocator).sType(sType).pNext(pNext).mutableDescriptorTypeListCount(mutableDescriptorTypeListCount);
    }

    /// Allocates a `VkMutableDescriptorTypeCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkMutableDescriptorTypeCreateInfoEXT`
    public static VkMutableDescriptorTypeCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkMutableDescriptorTypeCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkMutableDescriptorTypeCreateInfoEXT`
    public static VkMutableDescriptorTypeCreateInfoEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMutableDescriptorTypeCreateInfoEXT copyFrom(VkMutableDescriptorTypeCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkMutableDescriptorTypeCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkMutableDescriptorTypeCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `mutableDescriptorTypeListCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int mutableDescriptorTypeListCount(MemorySegment segment, long index) { return (int) VH_mutableDescriptorTypeListCount.get(segment, 0L, index); }
    /// {@return `mutableDescriptorTypeListCount`}
    public int mutableDescriptorTypeListCount() { return mutableDescriptorTypeListCount(this.segment(), 0L); }
    /// Sets `mutableDescriptorTypeListCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mutableDescriptorTypeListCount(MemorySegment segment, long index, int value) { VH_mutableDescriptorTypeListCount.set(segment, 0L, index, value); }
    /// Sets `mutableDescriptorTypeListCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMutableDescriptorTypeCreateInfoEXT mutableDescriptorTypeListCount(int value) { mutableDescriptorTypeListCount(this.segment(), 0L, value); return this; }

    /// {@return `pMutableDescriptorTypeLists` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pMutableDescriptorTypeLists(MemorySegment segment, long index) { return (MemorySegment) VH_pMutableDescriptorTypeLists.get(segment, 0L, index); }
    /// {@return `pMutableDescriptorTypeLists`}
    public MemorySegment pMutableDescriptorTypeLists() { return pMutableDescriptorTypeLists(this.segment(), 0L); }
    /// Sets `pMutableDescriptorTypeLists` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pMutableDescriptorTypeLists(MemorySegment segment, long index, MemorySegment value) { VH_pMutableDescriptorTypeLists.set(segment, 0L, index, value); }
    /// Sets `pMutableDescriptorTypeLists` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMutableDescriptorTypeCreateInfoEXT pMutableDescriptorTypeLists(MemorySegment value) { pMutableDescriptorTypeLists(this.segment(), 0L, value); return this; }

    /// A buffer of [VkMutableDescriptorTypeCreateInfoEXT].
    public static final class Buffer extends VkMutableDescriptorTypeCreateInfoEXT {
        private final long elementCount;

        /// Creates `VkMutableDescriptorTypeCreateInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkMutableDescriptorTypeCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkMutableDescriptorTypeCreateInfoEXT`
        public VkMutableDescriptorTypeCreateInfoEXT asSlice(long index) { return new VkMutableDescriptorTypeCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkMutableDescriptorTypeCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkMutableDescriptorTypeCreateInfoEXT`
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

        /// {@return `mutableDescriptorTypeListCount` at the given index}
        /// @param index the index of the struct buffer
        public int mutableDescriptorTypeListCountAt(long index) { return mutableDescriptorTypeListCount(this.segment(), index); }
        /// Sets `mutableDescriptorTypeListCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer mutableDescriptorTypeListCountAt(long index, int value) { mutableDescriptorTypeListCount(this.segment(), index, value); return this; }

        /// {@return `pMutableDescriptorTypeLists` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pMutableDescriptorTypeListsAt(long index) { return pMutableDescriptorTypeLists(this.segment(), index); }
        /// Sets `pMutableDescriptorTypeLists` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pMutableDescriptorTypeListsAt(long index, MemorySegment value) { pMutableDescriptorTypeLists(this.segment(), index, value); return this; }

    }
}
