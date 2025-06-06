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
/// struct VkSwapchainPresentBarrierCreateInfoNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 presentBarrierEnable;
/// };
/// ```
public sealed class VkSwapchainPresentBarrierCreateInfoNV extends GroupType {
    /// The struct layout of `VkSwapchainPresentBarrierCreateInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentBarrierEnable")
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
    /// The byte offset of `presentBarrierEnable`.
    public static final long OFFSET_presentBarrierEnable = LAYOUT.byteOffset(PathElement.groupElement("presentBarrierEnable"));
    /// The memory layout of `presentBarrierEnable`.
    public static final MemoryLayout LAYOUT_presentBarrierEnable = LAYOUT.select(PathElement.groupElement("presentBarrierEnable"));
    /// The [VarHandle] of `presentBarrierEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_presentBarrierEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentBarrierEnable"));

    /// Creates `VkSwapchainPresentBarrierCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkSwapchainPresentBarrierCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSwapchainPresentBarrierCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSwapchainPresentBarrierCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainPresentBarrierCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentBarrierCreateInfoNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkSwapchainPresentBarrierCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSwapchainPresentBarrierCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSwapchainPresentBarrierCreateInfoNV`
    public static VkSwapchainPresentBarrierCreateInfoNV alloc(SegmentAllocator allocator) { return new VkSwapchainPresentBarrierCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSwapchainPresentBarrierCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSwapchainPresentBarrierCreateInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSwapchainPresentBarrierCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param presentBarrierEnable `presentBarrierEnable`
    /// @return the allocated `VkSwapchainPresentBarrierCreateInfoNV`
    public static VkSwapchainPresentBarrierCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int presentBarrierEnable) {
        return alloc(allocator).sType(sType).pNext(pNext).presentBarrierEnable(presentBarrierEnable);
    }

    /// Allocates a `VkSwapchainPresentBarrierCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkSwapchainPresentBarrierCreateInfoNV`
    public static VkSwapchainPresentBarrierCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkSwapchainPresentBarrierCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkSwapchainPresentBarrierCreateInfoNV`
    public static VkSwapchainPresentBarrierCreateInfoNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSwapchainPresentBarrierCreateInfoNV copyFrom(VkSwapchainPresentBarrierCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkSwapchainPresentBarrierCreateInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSwapchainPresentBarrierCreateInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `presentBarrierEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int presentBarrierEnable(MemorySegment segment, long index) { return (int) VH_presentBarrierEnable.get(segment, 0L, index); }
    /// {@return `presentBarrierEnable`}
    public int presentBarrierEnable() { return presentBarrierEnable(this.segment(), 0L); }
    /// Sets `presentBarrierEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentBarrierEnable(MemorySegment segment, long index, int value) { VH_presentBarrierEnable.set(segment, 0L, index, value); }
    /// Sets `presentBarrierEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentBarrierCreateInfoNV presentBarrierEnable(int value) { presentBarrierEnable(this.segment(), 0L, value); return this; }

    /// A buffer of [VkSwapchainPresentBarrierCreateInfoNV].
    public static final class Buffer extends VkSwapchainPresentBarrierCreateInfoNV {
        private final long elementCount;

        /// Creates `VkSwapchainPresentBarrierCreateInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSwapchainPresentBarrierCreateInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSwapchainPresentBarrierCreateInfoNV`
        public VkSwapchainPresentBarrierCreateInfoNV asSlice(long index) { return new VkSwapchainPresentBarrierCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSwapchainPresentBarrierCreateInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSwapchainPresentBarrierCreateInfoNV`
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

        /// {@return `presentBarrierEnable` at the given index}
        /// @param index the index of the struct buffer
        public int presentBarrierEnableAt(long index) { return presentBarrierEnable(this.segment(), index); }
        /// Sets `presentBarrierEnable` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer presentBarrierEnableAt(long index, int value) { presentBarrierEnable(this.segment(), index, value); return this; }

    }
}
