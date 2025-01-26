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
package overrungl.vulkan.qcom.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkSubpassFragmentDensityMapOffsetEndInfoQCOM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t fragmentDensityOffsetCount;
///     const VkOffset2D* pFragmentDensityOffsets;
/// };
/// ```
public sealed class VkSubpassFragmentDensityMapOffsetEndInfoQCOM extends GroupType {
    /// The struct layout of `VkSubpassFragmentDensityMapOffsetEndInfoQCOM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentDensityOffsetCount"),
        ValueLayout.ADDRESS.withName("pFragmentDensityOffsets")
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
    /// The byte offset of `fragmentDensityOffsetCount`.
    public static final long OFFSET_fragmentDensityOffsetCount = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityOffsetCount"));
    /// The memory layout of `fragmentDensityOffsetCount`.
    public static final MemoryLayout LAYOUT_fragmentDensityOffsetCount = LAYOUT.select(PathElement.groupElement("fragmentDensityOffsetCount"));
    /// The [VarHandle] of `fragmentDensityOffsetCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fragmentDensityOffsetCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityOffsetCount"));
    /// The byte offset of `pFragmentDensityOffsets`.
    public static final long OFFSET_pFragmentDensityOffsets = LAYOUT.byteOffset(PathElement.groupElement("pFragmentDensityOffsets"));
    /// The memory layout of `pFragmentDensityOffsets`.
    public static final MemoryLayout LAYOUT_pFragmentDensityOffsets = LAYOUT.select(PathElement.groupElement("pFragmentDensityOffsets"));
    /// The [VarHandle] of `pFragmentDensityOffsets` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pFragmentDensityOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pFragmentDensityOffsets"));

    /// Creates `VkSubpassFragmentDensityMapOffsetEndInfoQCOM` with the given segment.
    /// @param segment the memory segment
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSubpassFragmentDensityMapOffsetEndInfoQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSubpassFragmentDensityMapOffsetEndInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSubpassFragmentDensityMapOffsetEndInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSubpassFragmentDensityMapOffsetEndInfoQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubpassFragmentDensityMapOffsetEndInfoQCOM`
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM alloc(SegmentAllocator allocator) { return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSubpassFragmentDensityMapOffsetEndInfoQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubpassFragmentDensityMapOffsetEndInfoQCOM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM copyFrom(VkSubpassFragmentDensityMapOffsetEndInfoQCOM src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `fragmentDensityOffsetCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentDensityOffsetCount(MemorySegment segment, long index) { return (int) VH_fragmentDensityOffsetCount.get(segment, 0L, index); }
    /// {@return `fragmentDensityOffsetCount`}
    public int fragmentDensityOffsetCount() { return fragmentDensityOffsetCount(this.segment(), 0L); }
    /// Sets `fragmentDensityOffsetCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentDensityOffsetCount(MemorySegment segment, long index, int value) { VH_fragmentDensityOffsetCount.set(segment, 0L, index, value); }
    /// Sets `fragmentDensityOffsetCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM fragmentDensityOffsetCount(int value) { fragmentDensityOffsetCount(this.segment(), 0L, value); return this; }

    /// {@return `pFragmentDensityOffsets` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pFragmentDensityOffsets(MemorySegment segment, long index) { return (MemorySegment) VH_pFragmentDensityOffsets.get(segment, 0L, index); }
    /// {@return `pFragmentDensityOffsets`}
    public MemorySegment pFragmentDensityOffsets() { return pFragmentDensityOffsets(this.segment(), 0L); }
    /// Sets `pFragmentDensityOffsets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pFragmentDensityOffsets(MemorySegment segment, long index, MemorySegment value) { VH_pFragmentDensityOffsets.set(segment, 0L, index, value); }
    /// Sets `pFragmentDensityOffsets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM pFragmentDensityOffsets(MemorySegment value) { pFragmentDensityOffsets(this.segment(), 0L, value); return this; }

    /// A buffer of [VkSubpassFragmentDensityMapOffsetEndInfoQCOM].
    public static final class Buffer extends VkSubpassFragmentDensityMapOffsetEndInfoQCOM {
        private final long elementCount;

        /// Creates `VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSubpassFragmentDensityMapOffsetEndInfoQCOM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSubpassFragmentDensityMapOffsetEndInfoQCOM`
        public VkSubpassFragmentDensityMapOffsetEndInfoQCOM asSlice(long index) { return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSubpassFragmentDensityMapOffsetEndInfoQCOM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSubpassFragmentDensityMapOffsetEndInfoQCOM`
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

        /// {@return `fragmentDensityOffsetCount` at the given index}
        /// @param index the index of the struct buffer
        public int fragmentDensityOffsetCountAt(long index) { return fragmentDensityOffsetCount(this.segment(), index); }
        /// Sets `fragmentDensityOffsetCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer fragmentDensityOffsetCountAt(long index, int value) { fragmentDensityOffsetCount(this.segment(), index, value); return this; }

        /// {@return `pFragmentDensityOffsets` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pFragmentDensityOffsetsAt(long index) { return pFragmentDensityOffsets(this.segment(), index); }
        /// Sets `pFragmentDensityOffsets` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pFragmentDensityOffsetsAt(long index, MemorySegment value) { pFragmentDensityOffsets(this.segment(), index, value); return this; }

    }
}
