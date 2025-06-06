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
/// struct VkRenderPassCreationControlEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint32_t) VkBool32 disallowMerging;
/// };
/// ```
public sealed class VkRenderPassCreationControlEXT extends GroupType {
    /// The struct layout of `VkRenderPassCreationControlEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("disallowMerging")
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
    /// The byte offset of `disallowMerging`.
    public static final long OFFSET_disallowMerging = LAYOUT.byteOffset(PathElement.groupElement("disallowMerging"));
    /// The memory layout of `disallowMerging`.
    public static final MemoryLayout LAYOUT_disallowMerging = LAYOUT.select(PathElement.groupElement("disallowMerging"));
    /// The [VarHandle] of `disallowMerging` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_disallowMerging = LAYOUT.arrayElementVarHandle(PathElement.groupElement("disallowMerging"));

    /// Creates `VkRenderPassCreationControlEXT` with the given segment.
    /// @param segment the memory segment
    public VkRenderPassCreationControlEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderPassCreationControlEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderPassCreationControlEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassCreationControlEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassCreationControlEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkRenderPassCreationControlEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRenderPassCreationControlEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassCreationControlEXT`
    public static VkRenderPassCreationControlEXT alloc(SegmentAllocator allocator) { return new VkRenderPassCreationControlEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderPassCreationControlEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassCreationControlEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkRenderPassCreationControlEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param disallowMerging `disallowMerging`
    /// @return the allocated `VkRenderPassCreationControlEXT`
    public static VkRenderPassCreationControlEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int disallowMerging) {
        return alloc(allocator).sType(sType).pNext(pNext).disallowMerging(disallowMerging);
    }

    /// Allocates a `VkRenderPassCreationControlEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkRenderPassCreationControlEXT`
    public static VkRenderPassCreationControlEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkRenderPassCreationControlEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkRenderPassCreationControlEXT`
    public static VkRenderPassCreationControlEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderPassCreationControlEXT copyFrom(VkRenderPassCreationControlEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkRenderPassCreationControlEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkRenderPassCreationControlEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `disallowMerging` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int disallowMerging(MemorySegment segment, long index) { return (int) VH_disallowMerging.get(segment, 0L, index); }
    /// {@return `disallowMerging`}
    public int disallowMerging() { return disallowMerging(this.segment(), 0L); }
    /// Sets `disallowMerging` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void disallowMerging(MemorySegment segment, long index, int value) { VH_disallowMerging.set(segment, 0L, index, value); }
    /// Sets `disallowMerging` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreationControlEXT disallowMerging(int value) { disallowMerging(this.segment(), 0L, value); return this; }

    /// A buffer of [VkRenderPassCreationControlEXT].
    public static final class Buffer extends VkRenderPassCreationControlEXT {
        private final long elementCount;

        /// Creates `VkRenderPassCreationControlEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkRenderPassCreationControlEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkRenderPassCreationControlEXT`
        public VkRenderPassCreationControlEXT asSlice(long index) { return new VkRenderPassCreationControlEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkRenderPassCreationControlEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkRenderPassCreationControlEXT`
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

        /// {@return `disallowMerging` at the given index}
        /// @param index the index of the struct buffer
        public int disallowMergingAt(long index) { return disallowMerging(this.segment(), index); }
        /// Sets `disallowMerging` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer disallowMergingAt(long index, int value) { disallowMerging(this.segment(), index, value); return this; }

    }
}
