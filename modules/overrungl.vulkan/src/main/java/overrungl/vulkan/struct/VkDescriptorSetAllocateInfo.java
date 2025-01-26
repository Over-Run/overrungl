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
/// struct VkDescriptorSetAllocateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkDescriptorPool descriptorPool;
///     uint32_t descriptorSetCount;
///     const VkDescriptorSetLayout* pSetLayouts;
/// };
/// ```
public sealed class VkDescriptorSetAllocateInfo extends GroupType {
    /// The struct layout of `VkDescriptorSetAllocateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("descriptorPool"),
        ValueLayout.JAVA_INT.withName("descriptorSetCount"),
        ValueLayout.ADDRESS.withName("pSetLayouts")
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
    /// The byte offset of `descriptorPool`.
    public static final long OFFSET_descriptorPool = LAYOUT.byteOffset(PathElement.groupElement("descriptorPool"));
    /// The memory layout of `descriptorPool`.
    public static final MemoryLayout LAYOUT_descriptorPool = LAYOUT.select(PathElement.groupElement("descriptorPool"));
    /// The [VarHandle] of `descriptorPool` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorPool = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorPool"));
    /// The byte offset of `descriptorSetCount`.
    public static final long OFFSET_descriptorSetCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorSetCount"));
    /// The memory layout of `descriptorSetCount`.
    public static final MemoryLayout LAYOUT_descriptorSetCount = LAYOUT.select(PathElement.groupElement("descriptorSetCount"));
    /// The [VarHandle] of `descriptorSetCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorSetCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetCount"));
    /// The byte offset of `pSetLayouts`.
    public static final long OFFSET_pSetLayouts = LAYOUT.byteOffset(PathElement.groupElement("pSetLayouts"));
    /// The memory layout of `pSetLayouts`.
    public static final MemoryLayout LAYOUT_pSetLayouts = LAYOUT.select(PathElement.groupElement("pSetLayouts"));
    /// The [VarHandle] of `pSetLayouts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSetLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSetLayouts"));

    /// Creates `VkDescriptorSetAllocateInfo` with the given segment.
    /// @param segment the memory segment
    public VkDescriptorSetAllocateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDescriptorSetAllocateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorSetAllocateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetAllocateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetAllocateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDescriptorSetAllocateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDescriptorSetAllocateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorSetAllocateInfo`
    public static VkDescriptorSetAllocateInfo alloc(SegmentAllocator allocator) { return new VkDescriptorSetAllocateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDescriptorSetAllocateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorSetAllocateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorSetAllocateInfo copyFrom(VkDescriptorSetAllocateInfo src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkDescriptorSetAllocateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDescriptorSetAllocateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `descriptorPool` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long descriptorPool(MemorySegment segment, long index) { return (long) VH_descriptorPool.get(segment, 0L, index); }
    /// {@return `descriptorPool`}
    public long descriptorPool() { return descriptorPool(this.segment(), 0L); }
    /// Sets `descriptorPool` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorPool(MemorySegment segment, long index, long value) { VH_descriptorPool.set(segment, 0L, index, value); }
    /// Sets `descriptorPool` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetAllocateInfo descriptorPool(long value) { descriptorPool(this.segment(), 0L, value); return this; }

    /// {@return `descriptorSetCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorSetCount(MemorySegment segment, long index) { return (int) VH_descriptorSetCount.get(segment, 0L, index); }
    /// {@return `descriptorSetCount`}
    public int descriptorSetCount() { return descriptorSetCount(this.segment(), 0L); }
    /// Sets `descriptorSetCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorSetCount(MemorySegment segment, long index, int value) { VH_descriptorSetCount.set(segment, 0L, index, value); }
    /// Sets `descriptorSetCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetAllocateInfo descriptorSetCount(int value) { descriptorSetCount(this.segment(), 0L, value); return this; }

    /// {@return `pSetLayouts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSetLayouts(MemorySegment segment, long index) { return (MemorySegment) VH_pSetLayouts.get(segment, 0L, index); }
    /// {@return `pSetLayouts`}
    public MemorySegment pSetLayouts() { return pSetLayouts(this.segment(), 0L); }
    /// Sets `pSetLayouts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSetLayouts(MemorySegment segment, long index, MemorySegment value) { VH_pSetLayouts.set(segment, 0L, index, value); }
    /// Sets `pSetLayouts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetAllocateInfo pSetLayouts(MemorySegment value) { pSetLayouts(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDescriptorSetAllocateInfo].
    public static final class Buffer extends VkDescriptorSetAllocateInfo {
        private final long elementCount;

        /// Creates `VkDescriptorSetAllocateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDescriptorSetAllocateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDescriptorSetAllocateInfo`
        public VkDescriptorSetAllocateInfo asSlice(long index) { return new VkDescriptorSetAllocateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDescriptorSetAllocateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDescriptorSetAllocateInfo`
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

        /// {@return `descriptorPool` at the given index}
        /// @param index the index of the struct buffer
        public long descriptorPoolAt(long index) { return descriptorPool(this.segment(), index); }
        /// Sets `descriptorPool` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorPoolAt(long index, long value) { descriptorPool(this.segment(), index, value); return this; }

        /// {@return `descriptorSetCount` at the given index}
        /// @param index the index of the struct buffer
        public int descriptorSetCountAt(long index) { return descriptorSetCount(this.segment(), index); }
        /// Sets `descriptorSetCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorSetCountAt(long index, int value) { descriptorSetCount(this.segment(), index, value); return this; }

        /// {@return `pSetLayouts` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pSetLayoutsAt(long index) { return pSetLayouts(this.segment(), index); }
        /// Sets `pSetLayouts` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pSetLayoutsAt(long index, MemorySegment value) { pSetLayouts(this.segment(), index, value); return this; }

    }
}
