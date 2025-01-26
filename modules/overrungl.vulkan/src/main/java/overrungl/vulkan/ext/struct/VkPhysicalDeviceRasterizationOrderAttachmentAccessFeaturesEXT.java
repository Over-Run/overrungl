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
/// struct VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 rasterizationOrderColorAttachmentAccess;
///     (uint32_t) VkBool32 rasterizationOrderDepthAttachmentAccess;
///     (uint32_t) VkBool32 rasterizationOrderStencilAttachmentAccess;
/// };
/// ```
public sealed class VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rasterizationOrderColorAttachmentAccess"),
        ValueLayout.JAVA_INT.withName("rasterizationOrderDepthAttachmentAccess"),
        ValueLayout.JAVA_INT.withName("rasterizationOrderStencilAttachmentAccess")
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
    /// The byte offset of `rasterizationOrderColorAttachmentAccess`.
    public static final long OFFSET_rasterizationOrderColorAttachmentAccess = LAYOUT.byteOffset(PathElement.groupElement("rasterizationOrderColorAttachmentAccess"));
    /// The memory layout of `rasterizationOrderColorAttachmentAccess`.
    public static final MemoryLayout LAYOUT_rasterizationOrderColorAttachmentAccess = LAYOUT.select(PathElement.groupElement("rasterizationOrderColorAttachmentAccess"));
    /// The [VarHandle] of `rasterizationOrderColorAttachmentAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rasterizationOrderColorAttachmentAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationOrderColorAttachmentAccess"));
    /// The byte offset of `rasterizationOrderDepthAttachmentAccess`.
    public static final long OFFSET_rasterizationOrderDepthAttachmentAccess = LAYOUT.byteOffset(PathElement.groupElement("rasterizationOrderDepthAttachmentAccess"));
    /// The memory layout of `rasterizationOrderDepthAttachmentAccess`.
    public static final MemoryLayout LAYOUT_rasterizationOrderDepthAttachmentAccess = LAYOUT.select(PathElement.groupElement("rasterizationOrderDepthAttachmentAccess"));
    /// The [VarHandle] of `rasterizationOrderDepthAttachmentAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rasterizationOrderDepthAttachmentAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationOrderDepthAttachmentAccess"));
    /// The byte offset of `rasterizationOrderStencilAttachmentAccess`.
    public static final long OFFSET_rasterizationOrderStencilAttachmentAccess = LAYOUT.byteOffset(PathElement.groupElement("rasterizationOrderStencilAttachmentAccess"));
    /// The memory layout of `rasterizationOrderStencilAttachmentAccess`.
    public static final MemoryLayout LAYOUT_rasterizationOrderStencilAttachmentAccess = LAYOUT.select(PathElement.groupElement("rasterizationOrderStencilAttachmentAccess"));
    /// The [VarHandle] of `rasterizationOrderStencilAttachmentAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rasterizationOrderStencilAttachmentAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationOrderStencilAttachmentAccess"));

    /// Creates `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT`
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT copyFrom(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `rasterizationOrderColorAttachmentAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rasterizationOrderColorAttachmentAccess(MemorySegment segment, long index) { return (int) VH_rasterizationOrderColorAttachmentAccess.get(segment, 0L, index); }
    /// {@return `rasterizationOrderColorAttachmentAccess`}
    public int rasterizationOrderColorAttachmentAccess() { return rasterizationOrderColorAttachmentAccess(this.segment(), 0L); }
    /// Sets `rasterizationOrderColorAttachmentAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rasterizationOrderColorAttachmentAccess(MemorySegment segment, long index, int value) { VH_rasterizationOrderColorAttachmentAccess.set(segment, 0L, index, value); }
    /// Sets `rasterizationOrderColorAttachmentAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT rasterizationOrderColorAttachmentAccess(int value) { rasterizationOrderColorAttachmentAccess(this.segment(), 0L, value); return this; }

    /// {@return `rasterizationOrderDepthAttachmentAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rasterizationOrderDepthAttachmentAccess(MemorySegment segment, long index) { return (int) VH_rasterizationOrderDepthAttachmentAccess.get(segment, 0L, index); }
    /// {@return `rasterizationOrderDepthAttachmentAccess`}
    public int rasterizationOrderDepthAttachmentAccess() { return rasterizationOrderDepthAttachmentAccess(this.segment(), 0L); }
    /// Sets `rasterizationOrderDepthAttachmentAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rasterizationOrderDepthAttachmentAccess(MemorySegment segment, long index, int value) { VH_rasterizationOrderDepthAttachmentAccess.set(segment, 0L, index, value); }
    /// Sets `rasterizationOrderDepthAttachmentAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT rasterizationOrderDepthAttachmentAccess(int value) { rasterizationOrderDepthAttachmentAccess(this.segment(), 0L, value); return this; }

    /// {@return `rasterizationOrderStencilAttachmentAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rasterizationOrderStencilAttachmentAccess(MemorySegment segment, long index) { return (int) VH_rasterizationOrderStencilAttachmentAccess.get(segment, 0L, index); }
    /// {@return `rasterizationOrderStencilAttachmentAccess`}
    public int rasterizationOrderStencilAttachmentAccess() { return rasterizationOrderStencilAttachmentAccess(this.segment(), 0L); }
    /// Sets `rasterizationOrderStencilAttachmentAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rasterizationOrderStencilAttachmentAccess(MemorySegment segment, long index, int value) { VH_rasterizationOrderStencilAttachmentAccess.set(segment, 0L, index, value); }
    /// Sets `rasterizationOrderStencilAttachmentAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT rasterizationOrderStencilAttachmentAccess(int value) { rasterizationOrderStencilAttachmentAccess(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT`
        public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT`
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

        /// {@return `rasterizationOrderColorAttachmentAccess` at the given index}
        /// @param index the index of the struct buffer
        public int rasterizationOrderColorAttachmentAccessAt(long index) { return rasterizationOrderColorAttachmentAccess(this.segment(), index); }
        /// Sets `rasterizationOrderColorAttachmentAccess` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer rasterizationOrderColorAttachmentAccessAt(long index, int value) { rasterizationOrderColorAttachmentAccess(this.segment(), index, value); return this; }

        /// {@return `rasterizationOrderDepthAttachmentAccess` at the given index}
        /// @param index the index of the struct buffer
        public int rasterizationOrderDepthAttachmentAccessAt(long index) { return rasterizationOrderDepthAttachmentAccess(this.segment(), index); }
        /// Sets `rasterizationOrderDepthAttachmentAccess` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer rasterizationOrderDepthAttachmentAccessAt(long index, int value) { rasterizationOrderDepthAttachmentAccess(this.segment(), index, value); return this; }

        /// {@return `rasterizationOrderStencilAttachmentAccess` at the given index}
        /// @param index the index of the struct buffer
        public int rasterizationOrderStencilAttachmentAccessAt(long index) { return rasterizationOrderStencilAttachmentAccess(this.segment(), index); }
        /// Sets `rasterizationOrderStencilAttachmentAccess` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer rasterizationOrderStencilAttachmentAccessAt(long index, int value) { rasterizationOrderStencilAttachmentAccess(this.segment(), index, value); return this; }

    }
}
