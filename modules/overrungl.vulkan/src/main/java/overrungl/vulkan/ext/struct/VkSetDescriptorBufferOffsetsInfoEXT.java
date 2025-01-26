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
/// struct VkSetDescriptorBufferOffsetsInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkShaderStageFlags stageFlags;
///     (uint64_t) VkPipelineLayout layout;
///     uint32_t firstSet;
///     uint32_t setCount;
///     const uint32_t* pBufferIndices;
///     const VkDeviceSize* pOffsets;
/// };
/// ```
public sealed class VkSetDescriptorBufferOffsetsInfoEXT extends GroupType {
    /// The struct layout of `VkSetDescriptorBufferOffsetsInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_INT.withName("firstSet"),
        ValueLayout.JAVA_INT.withName("setCount"),
        ValueLayout.ADDRESS.withName("pBufferIndices"),
        ValueLayout.ADDRESS.withName("pOffsets")
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
    /// The byte offset of `stageFlags`.
    public static final long OFFSET_stageFlags = LAYOUT.byteOffset(PathElement.groupElement("stageFlags"));
    /// The memory layout of `stageFlags`.
    public static final MemoryLayout LAYOUT_stageFlags = LAYOUT.select(PathElement.groupElement("stageFlags"));
    /// The [VarHandle] of `stageFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageFlags"));
    /// The byte offset of `layout`.
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    /// The memory layout of `layout`.
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    /// The byte offset of `firstSet`.
    public static final long OFFSET_firstSet = LAYOUT.byteOffset(PathElement.groupElement("firstSet"));
    /// The memory layout of `firstSet`.
    public static final MemoryLayout LAYOUT_firstSet = LAYOUT.select(PathElement.groupElement("firstSet"));
    /// The [VarHandle] of `firstSet` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_firstSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstSet"));
    /// The byte offset of `setCount`.
    public static final long OFFSET_setCount = LAYOUT.byteOffset(PathElement.groupElement("setCount"));
    /// The memory layout of `setCount`.
    public static final MemoryLayout LAYOUT_setCount = LAYOUT.select(PathElement.groupElement("setCount"));
    /// The [VarHandle] of `setCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_setCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("setCount"));
    /// The byte offset of `pBufferIndices`.
    public static final long OFFSET_pBufferIndices = LAYOUT.byteOffset(PathElement.groupElement("pBufferIndices"));
    /// The memory layout of `pBufferIndices`.
    public static final MemoryLayout LAYOUT_pBufferIndices = LAYOUT.select(PathElement.groupElement("pBufferIndices"));
    /// The [VarHandle] of `pBufferIndices` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pBufferIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBufferIndices"));
    /// The byte offset of `pOffsets`.
    public static final long OFFSET_pOffsets = LAYOUT.byteOffset(PathElement.groupElement("pOffsets"));
    /// The memory layout of `pOffsets`.
    public static final MemoryLayout LAYOUT_pOffsets = LAYOUT.select(PathElement.groupElement("pOffsets"));
    /// The [VarHandle] of `pOffsets` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pOffsets"));

    /// Creates `VkSetDescriptorBufferOffsetsInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkSetDescriptorBufferOffsetsInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSetDescriptorBufferOffsetsInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSetDescriptorBufferOffsetsInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSetDescriptorBufferOffsetsInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSetDescriptorBufferOffsetsInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSetDescriptorBufferOffsetsInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSetDescriptorBufferOffsetsInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSetDescriptorBufferOffsetsInfoEXT`
    public static VkSetDescriptorBufferOffsetsInfoEXT alloc(SegmentAllocator allocator) { return new VkSetDescriptorBufferOffsetsInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSetDescriptorBufferOffsetsInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSetDescriptorBufferOffsetsInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT copyFrom(VkSetDescriptorBufferOffsetsInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkSetDescriptorBufferOffsetsInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSetDescriptorBufferOffsetsInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `stageFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stageFlags(MemorySegment segment, long index) { return (int) VH_stageFlags.get(segment, 0L, index); }
    /// {@return `stageFlags`}
    public int stageFlags() { return stageFlags(this.segment(), 0L); }
    /// Sets `stageFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stageFlags(MemorySegment segment, long index, int value) { VH_stageFlags.set(segment, 0L, index, value); }
    /// Sets `stageFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT stageFlags(int value) { stageFlags(this.segment(), 0L, value); return this; }

    /// {@return `layout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long layout(MemorySegment segment, long index) { return (long) VH_layout.get(segment, 0L, index); }
    /// {@return `layout`}
    public long layout() { return layout(this.segment(), 0L); }
    /// Sets `layout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layout(MemorySegment segment, long index, long value) { VH_layout.set(segment, 0L, index, value); }
    /// Sets `layout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT layout(long value) { layout(this.segment(), 0L, value); return this; }

    /// {@return `firstSet` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int firstSet(MemorySegment segment, long index) { return (int) VH_firstSet.get(segment, 0L, index); }
    /// {@return `firstSet`}
    public int firstSet() { return firstSet(this.segment(), 0L); }
    /// Sets `firstSet` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void firstSet(MemorySegment segment, long index, int value) { VH_firstSet.set(segment, 0L, index, value); }
    /// Sets `firstSet` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT firstSet(int value) { firstSet(this.segment(), 0L, value); return this; }

    /// {@return `setCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int setCount(MemorySegment segment, long index) { return (int) VH_setCount.get(segment, 0L, index); }
    /// {@return `setCount`}
    public int setCount() { return setCount(this.segment(), 0L); }
    /// Sets `setCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void setCount(MemorySegment segment, long index, int value) { VH_setCount.set(segment, 0L, index, value); }
    /// Sets `setCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT setCount(int value) { setCount(this.segment(), 0L, value); return this; }

    /// {@return `pBufferIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pBufferIndices(MemorySegment segment, long index) { return (MemorySegment) VH_pBufferIndices.get(segment, 0L, index); }
    /// {@return `pBufferIndices`}
    public MemorySegment pBufferIndices() { return pBufferIndices(this.segment(), 0L); }
    /// Sets `pBufferIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pBufferIndices(MemorySegment segment, long index, MemorySegment value) { VH_pBufferIndices.set(segment, 0L, index, value); }
    /// Sets `pBufferIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT pBufferIndices(MemorySegment value) { pBufferIndices(this.segment(), 0L, value); return this; }

    /// {@return `pOffsets` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pOffsets(MemorySegment segment, long index) { return (MemorySegment) VH_pOffsets.get(segment, 0L, index); }
    /// {@return `pOffsets`}
    public MemorySegment pOffsets() { return pOffsets(this.segment(), 0L); }
    /// Sets `pOffsets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pOffsets(MemorySegment segment, long index, MemorySegment value) { VH_pOffsets.set(segment, 0L, index, value); }
    /// Sets `pOffsets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT pOffsets(MemorySegment value) { pOffsets(this.segment(), 0L, value); return this; }

    /// A buffer of [VkSetDescriptorBufferOffsetsInfoEXT].
    public static final class Buffer extends VkSetDescriptorBufferOffsetsInfoEXT {
        private final long elementCount;

        /// Creates `VkSetDescriptorBufferOffsetsInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSetDescriptorBufferOffsetsInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSetDescriptorBufferOffsetsInfoEXT`
        public VkSetDescriptorBufferOffsetsInfoEXT asSlice(long index) { return new VkSetDescriptorBufferOffsetsInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSetDescriptorBufferOffsetsInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSetDescriptorBufferOffsetsInfoEXT`
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

        /// {@return `stageFlags` at the given index}
        /// @param index the index of the struct buffer
        public int stageFlagsAt(long index) { return stageFlags(this.segment(), index); }
        /// Sets `stageFlags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer stageFlagsAt(long index, int value) { stageFlags(this.segment(), index, value); return this; }

        /// {@return `layout` at the given index}
        /// @param index the index of the struct buffer
        public long layoutAt(long index) { return layout(this.segment(), index); }
        /// Sets `layout` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer layoutAt(long index, long value) { layout(this.segment(), index, value); return this; }

        /// {@return `firstSet` at the given index}
        /// @param index the index of the struct buffer
        public int firstSetAt(long index) { return firstSet(this.segment(), index); }
        /// Sets `firstSet` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer firstSetAt(long index, int value) { firstSet(this.segment(), index, value); return this; }

        /// {@return `setCount` at the given index}
        /// @param index the index of the struct buffer
        public int setCountAt(long index) { return setCount(this.segment(), index); }
        /// Sets `setCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer setCountAt(long index, int value) { setCount(this.segment(), index, value); return this; }

        /// {@return `pBufferIndices` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pBufferIndicesAt(long index) { return pBufferIndices(this.segment(), index); }
        /// Sets `pBufferIndices` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pBufferIndicesAt(long index, MemorySegment value) { pBufferIndices(this.segment(), index, value); return this; }

        /// {@return `pOffsets` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pOffsetsAt(long index) { return pOffsets(this.segment(), index); }
        /// Sets `pOffsets` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pOffsetsAt(long index, MemorySegment value) { pOffsets(this.segment(), index, value); return this; }

    }
}
