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
/// struct VkComputePipelineCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkPipelineCreateFlags flags;
///     (struct VkPipelineShaderStageCreateInfo) VkPipelineShaderStageCreateInfo stage;
///     (uint64_t) VkPipelineLayout layout;
///     (uint64_t) VkPipeline basePipelineHandle;
///     int32_t basePipelineIndex;
/// };
/// ```
public sealed class VkComputePipelineCreateInfo extends GroupType {
    /// The struct layout of `VkComputePipelineCreateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        overrungl.vulkan.struct.VkPipelineShaderStageCreateInfo.LAYOUT.withName("stage"),
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_LONG.withName("basePipelineHandle"),
        ValueLayout.JAVA_INT.withName("basePipelineIndex")
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
    /// The byte offset of `stage`.
    public static final long OFFSET_stage = LAYOUT.byteOffset(PathElement.groupElement("stage"));
    /// The memory layout of `stage`.
    public static final MemoryLayout LAYOUT_stage = LAYOUT.select(PathElement.groupElement("stage"));
    /// The byte offset of `layout`.
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    /// The memory layout of `layout`.
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    /// The byte offset of `basePipelineHandle`.
    public static final long OFFSET_basePipelineHandle = LAYOUT.byteOffset(PathElement.groupElement("basePipelineHandle"));
    /// The memory layout of `basePipelineHandle`.
    public static final MemoryLayout LAYOUT_basePipelineHandle = LAYOUT.select(PathElement.groupElement("basePipelineHandle"));
    /// The [VarHandle] of `basePipelineHandle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_basePipelineHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineHandle"));
    /// The byte offset of `basePipelineIndex`.
    public static final long OFFSET_basePipelineIndex = LAYOUT.byteOffset(PathElement.groupElement("basePipelineIndex"));
    /// The memory layout of `basePipelineIndex`.
    public static final MemoryLayout LAYOUT_basePipelineIndex = LAYOUT.select(PathElement.groupElement("basePipelineIndex"));
    /// The [VarHandle] of `basePipelineIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_basePipelineIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineIndex"));

    /// Creates `VkComputePipelineCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkComputePipelineCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkComputePipelineCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkComputePipelineCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkComputePipelineCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkComputePipelineCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkComputePipelineCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkComputePipelineCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkComputePipelineCreateInfo`
    public static VkComputePipelineCreateInfo alloc(SegmentAllocator allocator) { return new VkComputePipelineCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkComputePipelineCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkComputePipelineCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkComputePipelineCreateInfo copyFrom(VkComputePipelineCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkComputePipelineCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkComputePipelineCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkComputePipelineCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `stage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment stage(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_stage, index), LAYOUT_stage); }
    /// {@return `stage`}
    public MemorySegment stage() { return stage(this.segment(), 0L); }
    /// Sets `stage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stage(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_stage, index), LAYOUT_stage.byteSize()); }
    /// Sets `stage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComputePipelineCreateInfo stage(MemorySegment value) { stage(this.segment(), 0L, value); return this; }

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
    public VkComputePipelineCreateInfo layout(long value) { layout(this.segment(), 0L, value); return this; }

    /// {@return `basePipelineHandle` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long basePipelineHandle(MemorySegment segment, long index) { return (long) VH_basePipelineHandle.get(segment, 0L, index); }
    /// {@return `basePipelineHandle`}
    public long basePipelineHandle() { return basePipelineHandle(this.segment(), 0L); }
    /// Sets `basePipelineHandle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void basePipelineHandle(MemorySegment segment, long index, long value) { VH_basePipelineHandle.set(segment, 0L, index, value); }
    /// Sets `basePipelineHandle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComputePipelineCreateInfo basePipelineHandle(long value) { basePipelineHandle(this.segment(), 0L, value); return this; }

    /// {@return `basePipelineIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int basePipelineIndex(MemorySegment segment, long index) { return (int) VH_basePipelineIndex.get(segment, 0L, index); }
    /// {@return `basePipelineIndex`}
    public int basePipelineIndex() { return basePipelineIndex(this.segment(), 0L); }
    /// Sets `basePipelineIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void basePipelineIndex(MemorySegment segment, long index, int value) { VH_basePipelineIndex.set(segment, 0L, index, value); }
    /// Sets `basePipelineIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComputePipelineCreateInfo basePipelineIndex(int value) { basePipelineIndex(this.segment(), 0L, value); return this; }

    /// A buffer of [VkComputePipelineCreateInfo].
    public static final class Buffer extends VkComputePipelineCreateInfo {
        private final long elementCount;

        /// Creates `VkComputePipelineCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkComputePipelineCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkComputePipelineCreateInfo`
        public VkComputePipelineCreateInfo asSlice(long index) { return new VkComputePipelineCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkComputePipelineCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkComputePipelineCreateInfo`
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

        /// {@return `stage` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment stageAt(long index) { return stage(this.segment(), index); }
        /// Sets `stage` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer stageAt(long index, MemorySegment value) { stage(this.segment(), index, value); return this; }

        /// {@return `layout` at the given index}
        /// @param index the index of the struct buffer
        public long layoutAt(long index) { return layout(this.segment(), index); }
        /// Sets `layout` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer layoutAt(long index, long value) { layout(this.segment(), index, value); return this; }

        /// {@return `basePipelineHandle` at the given index}
        /// @param index the index of the struct buffer
        public long basePipelineHandleAt(long index) { return basePipelineHandle(this.segment(), index); }
        /// Sets `basePipelineHandle` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer basePipelineHandleAt(long index, long value) { basePipelineHandle(this.segment(), index, value); return this; }

        /// {@return `basePipelineIndex` at the given index}
        /// @param index the index of the struct buffer
        public int basePipelineIndexAt(long index) { return basePipelineIndex(this.segment(), index); }
        /// Sets `basePipelineIndex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer basePipelineIndexAt(long index, int value) { basePipelineIndex(this.segment(), index, value); return this; }

    }
}
