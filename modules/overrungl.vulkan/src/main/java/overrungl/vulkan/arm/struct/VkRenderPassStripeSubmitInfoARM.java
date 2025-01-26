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
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkRenderPassStripeSubmitInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t stripeSemaphoreInfoCount;
///     const VkSemaphoreSubmitInfo* pStripeSemaphoreInfos;
/// };
/// ```
public sealed class VkRenderPassStripeSubmitInfoARM extends GroupType {
    /// The struct layout of `VkRenderPassStripeSubmitInfoARM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stripeSemaphoreInfoCount"),
        ValueLayout.ADDRESS.withName("pStripeSemaphoreInfos")
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
    /// The byte offset of `stripeSemaphoreInfoCount`.
    public static final long OFFSET_stripeSemaphoreInfoCount = LAYOUT.byteOffset(PathElement.groupElement("stripeSemaphoreInfoCount"));
    /// The memory layout of `stripeSemaphoreInfoCount`.
    public static final MemoryLayout LAYOUT_stripeSemaphoreInfoCount = LAYOUT.select(PathElement.groupElement("stripeSemaphoreInfoCount"));
    /// The [VarHandle] of `stripeSemaphoreInfoCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stripeSemaphoreInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stripeSemaphoreInfoCount"));
    /// The byte offset of `pStripeSemaphoreInfos`.
    public static final long OFFSET_pStripeSemaphoreInfos = LAYOUT.byteOffset(PathElement.groupElement("pStripeSemaphoreInfos"));
    /// The memory layout of `pStripeSemaphoreInfos`.
    public static final MemoryLayout LAYOUT_pStripeSemaphoreInfos = LAYOUT.select(PathElement.groupElement("pStripeSemaphoreInfos"));
    /// The [VarHandle] of `pStripeSemaphoreInfos` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStripeSemaphoreInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStripeSemaphoreInfos"));

    /// Creates `VkRenderPassStripeSubmitInfoARM` with the given segment.
    /// @param segment the memory segment
    public VkRenderPassStripeSubmitInfoARM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderPassStripeSubmitInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderPassStripeSubmitInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassStripeSubmitInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassStripeSubmitInfoARM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderPassStripeSubmitInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkRenderPassStripeSubmitInfoARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassStripeSubmitInfoARM`
    public static VkRenderPassStripeSubmitInfoARM alloc(SegmentAllocator allocator) { return new VkRenderPassStripeSubmitInfoARM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderPassStripeSubmitInfoARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassStripeSubmitInfoARM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderPassStripeSubmitInfoARM copyFrom(VkRenderPassStripeSubmitInfoARM src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkRenderPassStripeSubmitInfoARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkRenderPassStripeSubmitInfoARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `stripeSemaphoreInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stripeSemaphoreInfoCount(MemorySegment segment, long index) { return (int) VH_stripeSemaphoreInfoCount.get(segment, 0L, index); }
    /// {@return `stripeSemaphoreInfoCount`}
    public int stripeSemaphoreInfoCount() { return stripeSemaphoreInfoCount(this.segment(), 0L); }
    /// Sets `stripeSemaphoreInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stripeSemaphoreInfoCount(MemorySegment segment, long index, int value) { VH_stripeSemaphoreInfoCount.set(segment, 0L, index, value); }
    /// Sets `stripeSemaphoreInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeSubmitInfoARM stripeSemaphoreInfoCount(int value) { stripeSemaphoreInfoCount(this.segment(), 0L, value); return this; }

    /// {@return `pStripeSemaphoreInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStripeSemaphoreInfos(MemorySegment segment, long index) { return (MemorySegment) VH_pStripeSemaphoreInfos.get(segment, 0L, index); }
    /// {@return `pStripeSemaphoreInfos`}
    public MemorySegment pStripeSemaphoreInfos() { return pStripeSemaphoreInfos(this.segment(), 0L); }
    /// Sets `pStripeSemaphoreInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStripeSemaphoreInfos(MemorySegment segment, long index, MemorySegment value) { VH_pStripeSemaphoreInfos.set(segment, 0L, index, value); }
    /// Sets `pStripeSemaphoreInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeSubmitInfoARM pStripeSemaphoreInfos(MemorySegment value) { pStripeSemaphoreInfos(this.segment(), 0L, value); return this; }

    /// A buffer of [VkRenderPassStripeSubmitInfoARM].
    public static final class Buffer extends VkRenderPassStripeSubmitInfoARM {
        private final long elementCount;

        /// Creates `VkRenderPassStripeSubmitInfoARM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkRenderPassStripeSubmitInfoARM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkRenderPassStripeSubmitInfoARM`
        public VkRenderPassStripeSubmitInfoARM asSlice(long index) { return new VkRenderPassStripeSubmitInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkRenderPassStripeSubmitInfoARM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkRenderPassStripeSubmitInfoARM`
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

        /// {@return `stripeSemaphoreInfoCount` at the given index}
        /// @param index the index of the struct buffer
        public int stripeSemaphoreInfoCountAt(long index) { return stripeSemaphoreInfoCount(this.segment(), index); }
        /// Sets `stripeSemaphoreInfoCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer stripeSemaphoreInfoCountAt(long index, int value) { stripeSemaphoreInfoCount(this.segment(), index, value); return this; }

        /// {@return `pStripeSemaphoreInfos` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pStripeSemaphoreInfosAt(long index) { return pStripeSemaphoreInfos(this.segment(), index); }
        /// Sets `pStripeSemaphoreInfos` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pStripeSemaphoreInfosAt(long index, MemorySegment value) { pStripeSemaphoreInfos(this.segment(), index, value); return this; }

    }
}
