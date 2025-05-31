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
/// struct VkIndirectExecutionSetShaderInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t shaderCount;
///     const VkShaderEXT* pInitialShaders;
///     const VkIndirectExecutionSetShaderLayoutInfoEXT* pSetLayoutInfos;
///     uint32_t maxShaderCount;
///     uint32_t pushConstantRangeCount;
///     const VkPushConstantRange* pPushConstantRanges;
/// };
/// ```
public sealed class VkIndirectExecutionSetShaderInfoEXT extends GroupType {
    /// The struct layout of `VkIndirectExecutionSetShaderInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderCount"),
        ValueLayout.ADDRESS.withName("pInitialShaders"),
        ValueLayout.ADDRESS.withName("pSetLayoutInfos"),
        ValueLayout.JAVA_INT.withName("maxShaderCount"),
        ValueLayout.JAVA_INT.withName("pushConstantRangeCount"),
        ValueLayout.ADDRESS.withName("pPushConstantRanges")
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
    /// The byte offset of `shaderCount`.
    public static final long OFFSET_shaderCount = LAYOUT.byteOffset(PathElement.groupElement("shaderCount"));
    /// The memory layout of `shaderCount`.
    public static final MemoryLayout LAYOUT_shaderCount = LAYOUT.select(PathElement.groupElement("shaderCount"));
    /// The [VarHandle] of `shaderCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderCount"));
    /// The byte offset of `pInitialShaders`.
    public static final long OFFSET_pInitialShaders = LAYOUT.byteOffset(PathElement.groupElement("pInitialShaders"));
    /// The memory layout of `pInitialShaders`.
    public static final MemoryLayout LAYOUT_pInitialShaders = LAYOUT.select(PathElement.groupElement("pInitialShaders"));
    /// The [VarHandle] of `pInitialShaders` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pInitialShaders = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pInitialShaders"));
    /// The byte offset of `pSetLayoutInfos`.
    public static final long OFFSET_pSetLayoutInfos = LAYOUT.byteOffset(PathElement.groupElement("pSetLayoutInfos"));
    /// The memory layout of `pSetLayoutInfos`.
    public static final MemoryLayout LAYOUT_pSetLayoutInfos = LAYOUT.select(PathElement.groupElement("pSetLayoutInfos"));
    /// The [VarHandle] of `pSetLayoutInfos` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSetLayoutInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSetLayoutInfos"));
    /// The byte offset of `maxShaderCount`.
    public static final long OFFSET_maxShaderCount = LAYOUT.byteOffset(PathElement.groupElement("maxShaderCount"));
    /// The memory layout of `maxShaderCount`.
    public static final MemoryLayout LAYOUT_maxShaderCount = LAYOUT.select(PathElement.groupElement("maxShaderCount"));
    /// The [VarHandle] of `maxShaderCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxShaderCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxShaderCount"));
    /// The byte offset of `pushConstantRangeCount`.
    public static final long OFFSET_pushConstantRangeCount = LAYOUT.byteOffset(PathElement.groupElement("pushConstantRangeCount"));
    /// The memory layout of `pushConstantRangeCount`.
    public static final MemoryLayout LAYOUT_pushConstantRangeCount = LAYOUT.select(PathElement.groupElement("pushConstantRangeCount"));
    /// The [VarHandle] of `pushConstantRangeCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pushConstantRangeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pushConstantRangeCount"));
    /// The byte offset of `pPushConstantRanges`.
    public static final long OFFSET_pPushConstantRanges = LAYOUT.byteOffset(PathElement.groupElement("pPushConstantRanges"));
    /// The memory layout of `pPushConstantRanges`.
    public static final MemoryLayout LAYOUT_pPushConstantRanges = LAYOUT.select(PathElement.groupElement("pPushConstantRanges"));
    /// The [VarHandle] of `pPushConstantRanges` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPushConstantRanges = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPushConstantRanges"));

    /// Creates `VkIndirectExecutionSetShaderInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkIndirectExecutionSetShaderInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkIndirectExecutionSetShaderInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkIndirectExecutionSetShaderInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetShaderInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetShaderInfoEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkIndirectExecutionSetShaderInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkIndirectExecutionSetShaderInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectExecutionSetShaderInfoEXT`
    public static VkIndirectExecutionSetShaderInfoEXT alloc(SegmentAllocator allocator) { return new VkIndirectExecutionSetShaderInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkIndirectExecutionSetShaderInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectExecutionSetShaderInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkIndirectExecutionSetShaderInfoEXT copyFrom(VkIndirectExecutionSetShaderInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkIndirectExecutionSetShaderInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkIndirectExecutionSetShaderInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderCount(MemorySegment segment, long index) { return (int) VH_shaderCount.get(segment, 0L, index); }
    /// {@return `shaderCount`}
    public int shaderCount() { return shaderCount(this.segment(), 0L); }
    /// Sets `shaderCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderCount(MemorySegment segment, long index, int value) { VH_shaderCount.set(segment, 0L, index, value); }
    /// Sets `shaderCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderInfoEXT shaderCount(int value) { shaderCount(this.segment(), 0L, value); return this; }

    /// {@return `pInitialShaders` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pInitialShaders(MemorySegment segment, long index) { return (MemorySegment) VH_pInitialShaders.get(segment, 0L, index); }
    /// {@return `pInitialShaders`}
    public MemorySegment pInitialShaders() { return pInitialShaders(this.segment(), 0L); }
    /// Sets `pInitialShaders` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pInitialShaders(MemorySegment segment, long index, MemorySegment value) { VH_pInitialShaders.set(segment, 0L, index, value); }
    /// Sets `pInitialShaders` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderInfoEXT pInitialShaders(MemorySegment value) { pInitialShaders(this.segment(), 0L, value); return this; }

    /// {@return `pSetLayoutInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSetLayoutInfos(MemorySegment segment, long index) { return (MemorySegment) VH_pSetLayoutInfos.get(segment, 0L, index); }
    /// {@return `pSetLayoutInfos`}
    public MemorySegment pSetLayoutInfos() { return pSetLayoutInfos(this.segment(), 0L); }
    /// Sets `pSetLayoutInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSetLayoutInfos(MemorySegment segment, long index, MemorySegment value) { VH_pSetLayoutInfos.set(segment, 0L, index, value); }
    /// Sets `pSetLayoutInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderInfoEXT pSetLayoutInfos(MemorySegment value) { pSetLayoutInfos(this.segment(), 0L, value); return this; }

    /// {@return `maxShaderCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxShaderCount(MemorySegment segment, long index) { return (int) VH_maxShaderCount.get(segment, 0L, index); }
    /// {@return `maxShaderCount`}
    public int maxShaderCount() { return maxShaderCount(this.segment(), 0L); }
    /// Sets `maxShaderCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxShaderCount(MemorySegment segment, long index, int value) { VH_maxShaderCount.set(segment, 0L, index, value); }
    /// Sets `maxShaderCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderInfoEXT maxShaderCount(int value) { maxShaderCount(this.segment(), 0L, value); return this; }

    /// {@return `pushConstantRangeCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pushConstantRangeCount(MemorySegment segment, long index) { return (int) VH_pushConstantRangeCount.get(segment, 0L, index); }
    /// {@return `pushConstantRangeCount`}
    public int pushConstantRangeCount() { return pushConstantRangeCount(this.segment(), 0L); }
    /// Sets `pushConstantRangeCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pushConstantRangeCount(MemorySegment segment, long index, int value) { VH_pushConstantRangeCount.set(segment, 0L, index, value); }
    /// Sets `pushConstantRangeCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderInfoEXT pushConstantRangeCount(int value) { pushConstantRangeCount(this.segment(), 0L, value); return this; }

    /// {@return `pPushConstantRanges` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPushConstantRanges(MemorySegment segment, long index) { return (MemorySegment) VH_pPushConstantRanges.get(segment, 0L, index); }
    /// {@return `pPushConstantRanges`}
    public MemorySegment pPushConstantRanges() { return pPushConstantRanges(this.segment(), 0L); }
    /// Sets `pPushConstantRanges` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPushConstantRanges(MemorySegment segment, long index, MemorySegment value) { VH_pPushConstantRanges.set(segment, 0L, index, value); }
    /// Sets `pPushConstantRanges` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderInfoEXT pPushConstantRanges(MemorySegment value) { pPushConstantRanges(this.segment(), 0L, value); return this; }

    /// A buffer of [VkIndirectExecutionSetShaderInfoEXT].
    public static final class Buffer extends VkIndirectExecutionSetShaderInfoEXT {
        private final long elementCount;

        /// Creates `VkIndirectExecutionSetShaderInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkIndirectExecutionSetShaderInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkIndirectExecutionSetShaderInfoEXT`
        public VkIndirectExecutionSetShaderInfoEXT asSlice(long index) { return new VkIndirectExecutionSetShaderInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkIndirectExecutionSetShaderInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkIndirectExecutionSetShaderInfoEXT`
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

        /// {@return `shaderCount` at the given index}
        /// @param index the index of the struct buffer
        public int shaderCountAt(long index) { return shaderCount(this.segment(), index); }
        /// Sets `shaderCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderCountAt(long index, int value) { shaderCount(this.segment(), index, value); return this; }

        /// {@return `pInitialShaders` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pInitialShadersAt(long index) { return pInitialShaders(this.segment(), index); }
        /// Sets `pInitialShaders` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pInitialShadersAt(long index, MemorySegment value) { pInitialShaders(this.segment(), index, value); return this; }

        /// {@return `pSetLayoutInfos` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pSetLayoutInfosAt(long index) { return pSetLayoutInfos(this.segment(), index); }
        /// Sets `pSetLayoutInfos` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pSetLayoutInfosAt(long index, MemorySegment value) { pSetLayoutInfos(this.segment(), index, value); return this; }

        /// {@return `maxShaderCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxShaderCountAt(long index) { return maxShaderCount(this.segment(), index); }
        /// Sets `maxShaderCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxShaderCountAt(long index, int value) { maxShaderCount(this.segment(), index, value); return this; }

        /// {@return `pushConstantRangeCount` at the given index}
        /// @param index the index of the struct buffer
        public int pushConstantRangeCountAt(long index) { return pushConstantRangeCount(this.segment(), index); }
        /// Sets `pushConstantRangeCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pushConstantRangeCountAt(long index, int value) { pushConstantRangeCount(this.segment(), index, value); return this; }

        /// {@return `pPushConstantRanges` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pPushConstantRangesAt(long index) { return pPushConstantRanges(this.segment(), index); }
        /// Sets `pPushConstantRanges` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pPushConstantRangesAt(long index, MemorySegment value) { pPushConstantRanges(this.segment(), index, value); return this; }

    }
}
