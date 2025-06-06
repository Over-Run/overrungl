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
/// struct VkDisplayPresentInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (struct VkRect2D) VkRect2D srcRect;
///     (struct VkRect2D) VkRect2D dstRect;
///     (uint32_t) VkBool32 persistent;
/// };
/// ```
public sealed class VkDisplayPresentInfoKHR extends GroupType {
    /// The struct layout of `VkDisplayPresentInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkRect2D.LAYOUT.withName("srcRect"),
        overrungl.vulkan.struct.VkRect2D.LAYOUT.withName("dstRect"),
        ValueLayout.JAVA_INT.withName("persistent")
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
    /// The byte offset of `srcRect`.
    public static final long OFFSET_srcRect = LAYOUT.byteOffset(PathElement.groupElement("srcRect"));
    /// The memory layout of `srcRect`.
    public static final MemoryLayout LAYOUT_srcRect = LAYOUT.select(PathElement.groupElement("srcRect"));
    /// The byte offset of `dstRect`.
    public static final long OFFSET_dstRect = LAYOUT.byteOffset(PathElement.groupElement("dstRect"));
    /// The memory layout of `dstRect`.
    public static final MemoryLayout LAYOUT_dstRect = LAYOUT.select(PathElement.groupElement("dstRect"));
    /// The byte offset of `persistent`.
    public static final long OFFSET_persistent = LAYOUT.byteOffset(PathElement.groupElement("persistent"));
    /// The memory layout of `persistent`.
    public static final MemoryLayout LAYOUT_persistent = LAYOUT.select(PathElement.groupElement("persistent"));
    /// The [VarHandle] of `persistent` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_persistent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("persistent"));

    /// Creates `VkDisplayPresentInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkDisplayPresentInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDisplayPresentInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDisplayPresentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPresentInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPresentInfoKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkDisplayPresentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDisplayPresentInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayPresentInfoKHR`
    public static VkDisplayPresentInfoKHR alloc(SegmentAllocator allocator) { return new VkDisplayPresentInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDisplayPresentInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayPresentInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDisplayPresentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcRect `srcRect`
    /// @param dstRect `dstRect`
    /// @param persistent `persistent`
    /// @return the allocated `VkDisplayPresentInfoKHR`
    public static VkDisplayPresentInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment srcRect, MemorySegment dstRect, int persistent) {
        return alloc(allocator).sType(sType).pNext(pNext).srcRect(srcRect).dstRect(dstRect).persistent(persistent);
    }

    /// Allocates a `VkDisplayPresentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcRect `srcRect`
    /// @param dstRect `dstRect`
    /// @return the allocated `VkDisplayPresentInfoKHR`
    public static VkDisplayPresentInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment srcRect, MemorySegment dstRect) {
        return alloc(allocator).sType(sType).pNext(pNext).srcRect(srcRect).dstRect(dstRect);
    }

    /// Allocates a `VkDisplayPresentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcRect `srcRect`
    /// @return the allocated `VkDisplayPresentInfoKHR`
    public static VkDisplayPresentInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment srcRect) {
        return alloc(allocator).sType(sType).pNext(pNext).srcRect(srcRect);
    }

    /// Allocates a `VkDisplayPresentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkDisplayPresentInfoKHR`
    public static VkDisplayPresentInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkDisplayPresentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkDisplayPresentInfoKHR`
    public static VkDisplayPresentInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDisplayPresentInfoKHR copyFrom(VkDisplayPresentInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkDisplayPresentInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDisplayPresentInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `srcRect` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment srcRect(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_srcRect, index), LAYOUT_srcRect); }
    /// {@return `srcRect`}
    public MemorySegment srcRect() { return srcRect(this.segment(), 0L); }
    /// Sets `srcRect` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcRect(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_srcRect, index), LAYOUT_srcRect.byteSize()); }
    /// Sets `srcRect` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPresentInfoKHR srcRect(MemorySegment value) { srcRect(this.segment(), 0L, value); return this; }

    /// {@return `dstRect` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment dstRect(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_dstRect, index), LAYOUT_dstRect); }
    /// {@return `dstRect`}
    public MemorySegment dstRect() { return dstRect(this.segment(), 0L); }
    /// Sets `dstRect` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstRect(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_dstRect, index), LAYOUT_dstRect.byteSize()); }
    /// Sets `dstRect` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPresentInfoKHR dstRect(MemorySegment value) { dstRect(this.segment(), 0L, value); return this; }

    /// {@return `persistent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int persistent(MemorySegment segment, long index) { return (int) VH_persistent.get(segment, 0L, index); }
    /// {@return `persistent`}
    public int persistent() { return persistent(this.segment(), 0L); }
    /// Sets `persistent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void persistent(MemorySegment segment, long index, int value) { VH_persistent.set(segment, 0L, index, value); }
    /// Sets `persistent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPresentInfoKHR persistent(int value) { persistent(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDisplayPresentInfoKHR].
    public static final class Buffer extends VkDisplayPresentInfoKHR {
        private final long elementCount;

        /// Creates `VkDisplayPresentInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDisplayPresentInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDisplayPresentInfoKHR`
        public VkDisplayPresentInfoKHR asSlice(long index) { return new VkDisplayPresentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDisplayPresentInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDisplayPresentInfoKHR`
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

        /// {@return `srcRect` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment srcRectAt(long index) { return srcRect(this.segment(), index); }
        /// Sets `srcRect` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcRectAt(long index, MemorySegment value) { srcRect(this.segment(), index, value); return this; }

        /// {@return `dstRect` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment dstRectAt(long index) { return dstRect(this.segment(), index); }
        /// Sets `dstRect` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstRectAt(long index, MemorySegment value) { dstRect(this.segment(), index, value); return this; }

        /// {@return `persistent` at the given index}
        /// @param index the index of the struct buffer
        public int persistentAt(long index) { return persistent(this.segment(), index); }
        /// Sets `persistent` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer persistentAt(long index, int value) { persistent(this.segment(), index, value); return this; }

    }
}
