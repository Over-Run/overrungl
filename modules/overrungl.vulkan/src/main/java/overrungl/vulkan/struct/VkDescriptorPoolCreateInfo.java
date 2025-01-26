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
/// struct VkDescriptorPoolCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkDescriptorPoolCreateFlags flags;
///     uint32_t maxSets;
///     uint32_t poolSizeCount;
///     const VkDescriptorPoolSize* pPoolSizes;
/// };
/// ```
public sealed class VkDescriptorPoolCreateInfo extends GroupType {
    /// The struct layout of `VkDescriptorPoolCreateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("maxSets"),
        ValueLayout.JAVA_INT.withName("poolSizeCount"),
        ValueLayout.ADDRESS.withName("pPoolSizes")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `maxSets`.
    public static final long OFFSET_maxSets = LAYOUT.byteOffset(PathElement.groupElement("maxSets"));
    /// The memory layout of `maxSets`.
    public static final MemoryLayout LAYOUT_maxSets = LAYOUT.select(PathElement.groupElement("maxSets"));
    /// The [VarHandle] of `maxSets` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxSets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSets"));
    /// The byte offset of `poolSizeCount`.
    public static final long OFFSET_poolSizeCount = LAYOUT.byteOffset(PathElement.groupElement("poolSizeCount"));
    /// The memory layout of `poolSizeCount`.
    public static final MemoryLayout LAYOUT_poolSizeCount = LAYOUT.select(PathElement.groupElement("poolSizeCount"));
    /// The [VarHandle] of `poolSizeCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_poolSizeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("poolSizeCount"));
    /// The byte offset of `pPoolSizes`.
    public static final long OFFSET_pPoolSizes = LAYOUT.byteOffset(PathElement.groupElement("pPoolSizes"));
    /// The memory layout of `pPoolSizes`.
    public static final MemoryLayout LAYOUT_pPoolSizes = LAYOUT.select(PathElement.groupElement("pPoolSizes"));
    /// The [VarHandle] of `pPoolSizes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPoolSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPoolSizes"));

    /// Creates `VkDescriptorPoolCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkDescriptorPoolCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDescriptorPoolCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorPoolCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorPoolCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorPoolCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDescriptorPoolCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDescriptorPoolCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorPoolCreateInfo`
    public static VkDescriptorPoolCreateInfo alloc(SegmentAllocator allocator) { return new VkDescriptorPoolCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDescriptorPoolCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorPoolCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorPoolCreateInfo copyFrom(VkDescriptorPoolCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkDescriptorPoolCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDescriptorPoolCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorPoolCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `maxSets` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxSets(MemorySegment segment, long index) { return (int) VH_maxSets.get(segment, 0L, index); }
    /// {@return `maxSets`}
    public int maxSets() { return maxSets(this.segment(), 0L); }
    /// Sets `maxSets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSets(MemorySegment segment, long index, int value) { VH_maxSets.set(segment, 0L, index, value); }
    /// Sets `maxSets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorPoolCreateInfo maxSets(int value) { maxSets(this.segment(), 0L, value); return this; }

    /// {@return `poolSizeCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int poolSizeCount(MemorySegment segment, long index) { return (int) VH_poolSizeCount.get(segment, 0L, index); }
    /// {@return `poolSizeCount`}
    public int poolSizeCount() { return poolSizeCount(this.segment(), 0L); }
    /// Sets `poolSizeCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void poolSizeCount(MemorySegment segment, long index, int value) { VH_poolSizeCount.set(segment, 0L, index, value); }
    /// Sets `poolSizeCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorPoolCreateInfo poolSizeCount(int value) { poolSizeCount(this.segment(), 0L, value); return this; }

    /// {@return `pPoolSizes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPoolSizes(MemorySegment segment, long index) { return (MemorySegment) VH_pPoolSizes.get(segment, 0L, index); }
    /// {@return `pPoolSizes`}
    public MemorySegment pPoolSizes() { return pPoolSizes(this.segment(), 0L); }
    /// Sets `pPoolSizes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPoolSizes(MemorySegment segment, long index, MemorySegment value) { VH_pPoolSizes.set(segment, 0L, index, value); }
    /// Sets `pPoolSizes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorPoolCreateInfo pPoolSizes(MemorySegment value) { pPoolSizes(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDescriptorPoolCreateInfo].
    public static final class Buffer extends VkDescriptorPoolCreateInfo {
        private final long elementCount;

        /// Creates `VkDescriptorPoolCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDescriptorPoolCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDescriptorPoolCreateInfo`
        public VkDescriptorPoolCreateInfo asSlice(long index) { return new VkDescriptorPoolCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDescriptorPoolCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDescriptorPoolCreateInfo`
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

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public int flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

        /// {@return `maxSets` at the given index}
        /// @param index the index of the struct buffer
        public int maxSetsAt(long index) { return maxSets(this.segment(), index); }
        /// Sets `maxSets` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxSetsAt(long index, int value) { maxSets(this.segment(), index, value); return this; }

        /// {@return `poolSizeCount` at the given index}
        /// @param index the index of the struct buffer
        public int poolSizeCountAt(long index) { return poolSizeCount(this.segment(), index); }
        /// Sets `poolSizeCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer poolSizeCountAt(long index, int value) { poolSizeCount(this.segment(), index, value); return this; }

        /// {@return `pPoolSizes` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pPoolSizesAt(long index) { return pPoolSizes(this.segment(), index); }
        /// Sets `pPoolSizes` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pPoolSizesAt(long index, MemorySegment value) { pPoolSizes(this.segment(), index, value); return this; }

    }
}
