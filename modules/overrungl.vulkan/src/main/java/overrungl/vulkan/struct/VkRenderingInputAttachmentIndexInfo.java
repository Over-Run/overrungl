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
/// struct VkRenderingInputAttachmentIndexInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t colorAttachmentCount;
///     const uint32_t* pColorAttachmentInputIndices;
///     const uint32_t* pDepthInputAttachmentIndex;
///     const uint32_t* pStencilInputAttachmentIndex;
/// };
/// ```
public sealed class VkRenderingInputAttachmentIndexInfo extends GroupType {
    /// The struct layout of `VkRenderingInputAttachmentIndexInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withName("pColorAttachmentInputIndices"),
        ValueLayout.ADDRESS.withName("pDepthInputAttachmentIndex"),
        ValueLayout.ADDRESS.withName("pStencilInputAttachmentIndex")
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
    /// The byte offset of `colorAttachmentCount`.
    public static final long OFFSET_colorAttachmentCount = LAYOUT.byteOffset(PathElement.groupElement("colorAttachmentCount"));
    /// The memory layout of `colorAttachmentCount`.
    public static final MemoryLayout LAYOUT_colorAttachmentCount = LAYOUT.select(PathElement.groupElement("colorAttachmentCount"));
    /// The [VarHandle] of `colorAttachmentCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_colorAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachmentCount"));
    /// The byte offset of `pColorAttachmentInputIndices`.
    public static final long OFFSET_pColorAttachmentInputIndices = LAYOUT.byteOffset(PathElement.groupElement("pColorAttachmentInputIndices"));
    /// The memory layout of `pColorAttachmentInputIndices`.
    public static final MemoryLayout LAYOUT_pColorAttachmentInputIndices = LAYOUT.select(PathElement.groupElement("pColorAttachmentInputIndices"));
    /// The [VarHandle] of `pColorAttachmentInputIndices` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pColorAttachmentInputIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorAttachmentInputIndices"));
    /// The byte offset of `pDepthInputAttachmentIndex`.
    public static final long OFFSET_pDepthInputAttachmentIndex = LAYOUT.byteOffset(PathElement.groupElement("pDepthInputAttachmentIndex"));
    /// The memory layout of `pDepthInputAttachmentIndex`.
    public static final MemoryLayout LAYOUT_pDepthInputAttachmentIndex = LAYOUT.select(PathElement.groupElement("pDepthInputAttachmentIndex"));
    /// The [VarHandle] of `pDepthInputAttachmentIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDepthInputAttachmentIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDepthInputAttachmentIndex"));
    /// The byte offset of `pStencilInputAttachmentIndex`.
    public static final long OFFSET_pStencilInputAttachmentIndex = LAYOUT.byteOffset(PathElement.groupElement("pStencilInputAttachmentIndex"));
    /// The memory layout of `pStencilInputAttachmentIndex`.
    public static final MemoryLayout LAYOUT_pStencilInputAttachmentIndex = LAYOUT.select(PathElement.groupElement("pStencilInputAttachmentIndex"));
    /// The [VarHandle] of `pStencilInputAttachmentIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStencilInputAttachmentIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStencilInputAttachmentIndex"));

    /// Creates `VkRenderingInputAttachmentIndexInfo` with the given segment.
    /// @param segment the memory segment
    public VkRenderingInputAttachmentIndexInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderingInputAttachmentIndexInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderingInputAttachmentIndexInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingInputAttachmentIndexInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingInputAttachmentIndexInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderingInputAttachmentIndexInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkRenderingInputAttachmentIndexInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderingInputAttachmentIndexInfo`
    public static VkRenderingInputAttachmentIndexInfo alloc(SegmentAllocator allocator) { return new VkRenderingInputAttachmentIndexInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderingInputAttachmentIndexInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderingInputAttachmentIndexInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderingInputAttachmentIndexInfo copyFrom(VkRenderingInputAttachmentIndexInfo src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkRenderingInputAttachmentIndexInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkRenderingInputAttachmentIndexInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `colorAttachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int colorAttachmentCount(MemorySegment segment, long index) { return (int) VH_colorAttachmentCount.get(segment, 0L, index); }
    /// {@return `colorAttachmentCount`}
    public int colorAttachmentCount() { return colorAttachmentCount(this.segment(), 0L); }
    /// Sets `colorAttachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void colorAttachmentCount(MemorySegment segment, long index, int value) { VH_colorAttachmentCount.set(segment, 0L, index, value); }
    /// Sets `colorAttachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInputAttachmentIndexInfo colorAttachmentCount(int value) { colorAttachmentCount(this.segment(), 0L, value); return this; }

    /// {@return `pColorAttachmentInputIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pColorAttachmentInputIndices(MemorySegment segment, long index) { return (MemorySegment) VH_pColorAttachmentInputIndices.get(segment, 0L, index); }
    /// {@return `pColorAttachmentInputIndices`}
    public MemorySegment pColorAttachmentInputIndices() { return pColorAttachmentInputIndices(this.segment(), 0L); }
    /// Sets `pColorAttachmentInputIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pColorAttachmentInputIndices(MemorySegment segment, long index, MemorySegment value) { VH_pColorAttachmentInputIndices.set(segment, 0L, index, value); }
    /// Sets `pColorAttachmentInputIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInputAttachmentIndexInfo pColorAttachmentInputIndices(MemorySegment value) { pColorAttachmentInputIndices(this.segment(), 0L, value); return this; }

    /// {@return `pDepthInputAttachmentIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDepthInputAttachmentIndex(MemorySegment segment, long index) { return (MemorySegment) VH_pDepthInputAttachmentIndex.get(segment, 0L, index); }
    /// {@return `pDepthInputAttachmentIndex`}
    public MemorySegment pDepthInputAttachmentIndex() { return pDepthInputAttachmentIndex(this.segment(), 0L); }
    /// Sets `pDepthInputAttachmentIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDepthInputAttachmentIndex(MemorySegment segment, long index, MemorySegment value) { VH_pDepthInputAttachmentIndex.set(segment, 0L, index, value); }
    /// Sets `pDepthInputAttachmentIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInputAttachmentIndexInfo pDepthInputAttachmentIndex(MemorySegment value) { pDepthInputAttachmentIndex(this.segment(), 0L, value); return this; }

    /// {@return `pStencilInputAttachmentIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStencilInputAttachmentIndex(MemorySegment segment, long index) { return (MemorySegment) VH_pStencilInputAttachmentIndex.get(segment, 0L, index); }
    /// {@return `pStencilInputAttachmentIndex`}
    public MemorySegment pStencilInputAttachmentIndex() { return pStencilInputAttachmentIndex(this.segment(), 0L); }
    /// Sets `pStencilInputAttachmentIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStencilInputAttachmentIndex(MemorySegment segment, long index, MemorySegment value) { VH_pStencilInputAttachmentIndex.set(segment, 0L, index, value); }
    /// Sets `pStencilInputAttachmentIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInputAttachmentIndexInfo pStencilInputAttachmentIndex(MemorySegment value) { pStencilInputAttachmentIndex(this.segment(), 0L, value); return this; }

    /// A buffer of [VkRenderingInputAttachmentIndexInfo].
    public static final class Buffer extends VkRenderingInputAttachmentIndexInfo {
        private final long elementCount;

        /// Creates `VkRenderingInputAttachmentIndexInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkRenderingInputAttachmentIndexInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkRenderingInputAttachmentIndexInfo`
        public VkRenderingInputAttachmentIndexInfo asSlice(long index) { return new VkRenderingInputAttachmentIndexInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkRenderingInputAttachmentIndexInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkRenderingInputAttachmentIndexInfo`
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

        /// {@return `colorAttachmentCount` at the given index}
        /// @param index the index of the struct buffer
        public int colorAttachmentCountAt(long index) { return colorAttachmentCount(this.segment(), index); }
        /// Sets `colorAttachmentCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer colorAttachmentCountAt(long index, int value) { colorAttachmentCount(this.segment(), index, value); return this; }

        /// {@return `pColorAttachmentInputIndices` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pColorAttachmentInputIndicesAt(long index) { return pColorAttachmentInputIndices(this.segment(), index); }
        /// Sets `pColorAttachmentInputIndices` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pColorAttachmentInputIndicesAt(long index, MemorySegment value) { pColorAttachmentInputIndices(this.segment(), index, value); return this; }

        /// {@return `pDepthInputAttachmentIndex` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pDepthInputAttachmentIndexAt(long index) { return pDepthInputAttachmentIndex(this.segment(), index); }
        /// Sets `pDepthInputAttachmentIndex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pDepthInputAttachmentIndexAt(long index, MemorySegment value) { pDepthInputAttachmentIndex(this.segment(), index, value); return this; }

        /// {@return `pStencilInputAttachmentIndex` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pStencilInputAttachmentIndexAt(long index) { return pStencilInputAttachmentIndex(this.segment(), index); }
        /// Sets `pStencilInputAttachmentIndex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pStencilInputAttachmentIndexAt(long index, MemorySegment value) { pStencilInputAttachmentIndex(this.segment(), index, value); return this; }

    }
}
