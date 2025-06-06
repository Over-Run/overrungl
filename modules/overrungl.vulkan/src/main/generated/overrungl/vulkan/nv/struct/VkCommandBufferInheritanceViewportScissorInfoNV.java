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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkCommandBufferInheritanceViewportScissorInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint32_t) VkBool32 viewportScissor2D;
///     uint32_t viewportDepthCount;
///     const VkViewport* pViewportDepths;
/// };
/// ```
public sealed class VkCommandBufferInheritanceViewportScissorInfoNV extends GroupType {
    /// The struct layout of `VkCommandBufferInheritanceViewportScissorInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("viewportScissor2D"),
        ValueLayout.JAVA_INT.withName("viewportDepthCount"),
        ValueLayout.ADDRESS.withName("pViewportDepths")
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
    /// The byte offset of `viewportScissor2D`.
    public static final long OFFSET_viewportScissor2D = LAYOUT.byteOffset(PathElement.groupElement("viewportScissor2D"));
    /// The memory layout of `viewportScissor2D`.
    public static final MemoryLayout LAYOUT_viewportScissor2D = LAYOUT.select(PathElement.groupElement("viewportScissor2D"));
    /// The [VarHandle] of `viewportScissor2D` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_viewportScissor2D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportScissor2D"));
    /// The byte offset of `viewportDepthCount`.
    public static final long OFFSET_viewportDepthCount = LAYOUT.byteOffset(PathElement.groupElement("viewportDepthCount"));
    /// The memory layout of `viewportDepthCount`.
    public static final MemoryLayout LAYOUT_viewportDepthCount = LAYOUT.select(PathElement.groupElement("viewportDepthCount"));
    /// The [VarHandle] of `viewportDepthCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_viewportDepthCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportDepthCount"));
    /// The byte offset of `pViewportDepths`.
    public static final long OFFSET_pViewportDepths = LAYOUT.byteOffset(PathElement.groupElement("pViewportDepths"));
    /// The memory layout of `pViewportDepths`.
    public static final MemoryLayout LAYOUT_pViewportDepths = LAYOUT.select(PathElement.groupElement("pViewportDepths"));
    /// The [VarHandle] of `pViewportDepths` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pViewportDepths = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewportDepths"));

    /// Creates `VkCommandBufferInheritanceViewportScissorInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkCommandBufferInheritanceViewportScissorInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCommandBufferInheritanceViewportScissorInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCommandBufferInheritanceViewportScissorInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferInheritanceViewportScissorInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferInheritanceViewportScissorInfoNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkCommandBufferInheritanceViewportScissorInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCommandBufferInheritanceViewportScissorInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCommandBufferInheritanceViewportScissorInfoNV`
    public static VkCommandBufferInheritanceViewportScissorInfoNV alloc(SegmentAllocator allocator) { return new VkCommandBufferInheritanceViewportScissorInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCommandBufferInheritanceViewportScissorInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCommandBufferInheritanceViewportScissorInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkCommandBufferInheritanceViewportScissorInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param viewportScissor2D `viewportScissor2D`
    /// @param viewportDepthCount `viewportDepthCount`
    /// @param pViewportDepths `pViewportDepths`
    /// @return the allocated `VkCommandBufferInheritanceViewportScissorInfoNV`
    public static VkCommandBufferInheritanceViewportScissorInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int viewportScissor2D, int viewportDepthCount, MemorySegment pViewportDepths) {
        return alloc(allocator).sType(sType).pNext(pNext).viewportScissor2D(viewportScissor2D).viewportDepthCount(viewportDepthCount).pViewportDepths(pViewportDepths);
    }

    /// Allocates a `VkCommandBufferInheritanceViewportScissorInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param viewportScissor2D `viewportScissor2D`
    /// @param viewportDepthCount `viewportDepthCount`
    /// @return the allocated `VkCommandBufferInheritanceViewportScissorInfoNV`
    public static VkCommandBufferInheritanceViewportScissorInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int viewportScissor2D, int viewportDepthCount) {
        return alloc(allocator).sType(sType).pNext(pNext).viewportScissor2D(viewportScissor2D).viewportDepthCount(viewportDepthCount);
    }

    /// Allocates a `VkCommandBufferInheritanceViewportScissorInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param viewportScissor2D `viewportScissor2D`
    /// @return the allocated `VkCommandBufferInheritanceViewportScissorInfoNV`
    public static VkCommandBufferInheritanceViewportScissorInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int viewportScissor2D) {
        return alloc(allocator).sType(sType).pNext(pNext).viewportScissor2D(viewportScissor2D);
    }

    /// Allocates a `VkCommandBufferInheritanceViewportScissorInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkCommandBufferInheritanceViewportScissorInfoNV`
    public static VkCommandBufferInheritanceViewportScissorInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkCommandBufferInheritanceViewportScissorInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkCommandBufferInheritanceViewportScissorInfoNV`
    public static VkCommandBufferInheritanceViewportScissorInfoNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCommandBufferInheritanceViewportScissorInfoNV copyFrom(VkCommandBufferInheritanceViewportScissorInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkCommandBufferInheritanceViewportScissorInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkCommandBufferInheritanceViewportScissorInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `viewportScissor2D` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int viewportScissor2D(MemorySegment segment, long index) { return (int) VH_viewportScissor2D.get(segment, 0L, index); }
    /// {@return `viewportScissor2D`}
    public int viewportScissor2D() { return viewportScissor2D(this.segment(), 0L); }
    /// Sets `viewportScissor2D` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void viewportScissor2D(MemorySegment segment, long index, int value) { VH_viewportScissor2D.set(segment, 0L, index, value); }
    /// Sets `viewportScissor2D` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceViewportScissorInfoNV viewportScissor2D(int value) { viewportScissor2D(this.segment(), 0L, value); return this; }

    /// {@return `viewportDepthCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int viewportDepthCount(MemorySegment segment, long index) { return (int) VH_viewportDepthCount.get(segment, 0L, index); }
    /// {@return `viewportDepthCount`}
    public int viewportDepthCount() { return viewportDepthCount(this.segment(), 0L); }
    /// Sets `viewportDepthCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void viewportDepthCount(MemorySegment segment, long index, int value) { VH_viewportDepthCount.set(segment, 0L, index, value); }
    /// Sets `viewportDepthCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceViewportScissorInfoNV viewportDepthCount(int value) { viewportDepthCount(this.segment(), 0L, value); return this; }

    /// {@return `pViewportDepths` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pViewportDepths(MemorySegment segment, long index) { return (MemorySegment) VH_pViewportDepths.get(segment, 0L, index); }
    /// {@return `pViewportDepths`}
    public MemorySegment pViewportDepths() { return pViewportDepths(this.segment(), 0L); }
    /// Sets `pViewportDepths` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pViewportDepths(MemorySegment segment, long index, MemorySegment value) { VH_pViewportDepths.set(segment, 0L, index, value); }
    /// Sets `pViewportDepths` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceViewportScissorInfoNV pViewportDepths(MemorySegment value) { pViewportDepths(this.segment(), 0L, value); return this; }

    /// A buffer of [VkCommandBufferInheritanceViewportScissorInfoNV].
    public static final class Buffer extends VkCommandBufferInheritanceViewportScissorInfoNV {
        private final long elementCount;

        /// Creates `VkCommandBufferInheritanceViewportScissorInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkCommandBufferInheritanceViewportScissorInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkCommandBufferInheritanceViewportScissorInfoNV`
        public VkCommandBufferInheritanceViewportScissorInfoNV asSlice(long index) { return new VkCommandBufferInheritanceViewportScissorInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkCommandBufferInheritanceViewportScissorInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkCommandBufferInheritanceViewportScissorInfoNV`
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

        /// {@return `viewportScissor2D` at the given index}
        /// @param index the index of the struct buffer
        public int viewportScissor2DAt(long index) { return viewportScissor2D(this.segment(), index); }
        /// Sets `viewportScissor2D` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer viewportScissor2DAt(long index, int value) { viewportScissor2D(this.segment(), index, value); return this; }

        /// {@return `viewportDepthCount` at the given index}
        /// @param index the index of the struct buffer
        public int viewportDepthCountAt(long index) { return viewportDepthCount(this.segment(), index); }
        /// Sets `viewportDepthCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer viewportDepthCountAt(long index, int value) { viewportDepthCount(this.segment(), index, value); return this; }

        /// {@return `pViewportDepths` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pViewportDepthsAt(long index) { return pViewportDepths(this.segment(), index); }
        /// Sets `pViewportDepths` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pViewportDepthsAt(long index, MemorySegment value) { pViewportDepths(this.segment(), index, value); return this; }

    }
}
