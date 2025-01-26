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
/// struct VkPipelineMultisampleStateCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkPipelineMultisampleStateCreateFlags flags;
///     (int) VkSampleCountFlagBits rasterizationSamples;
///     (uint32_t) VkBool32 sampleShadingEnable;
///     float minSampleShading;
///     const VkSampleMask* pSampleMask;
///     (uint32_t) VkBool32 alphaToCoverageEnable;
///     (uint32_t) VkBool32 alphaToOneEnable;
/// };
/// ```
public sealed class VkPipelineMultisampleStateCreateInfo extends GroupType {
    /// The struct layout of `VkPipelineMultisampleStateCreateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("rasterizationSamples"),
        ValueLayout.JAVA_INT.withName("sampleShadingEnable"),
        ValueLayout.JAVA_FLOAT.withName("minSampleShading"),
        ValueLayout.ADDRESS.withName("pSampleMask"),
        ValueLayout.JAVA_INT.withName("alphaToCoverageEnable"),
        ValueLayout.JAVA_INT.withName("alphaToOneEnable")
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
    /// The byte offset of `rasterizationSamples`.
    public static final long OFFSET_rasterizationSamples = LAYOUT.byteOffset(PathElement.groupElement("rasterizationSamples"));
    /// The memory layout of `rasterizationSamples`.
    public static final MemoryLayout LAYOUT_rasterizationSamples = LAYOUT.select(PathElement.groupElement("rasterizationSamples"));
    /// The [VarHandle] of `rasterizationSamples` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rasterizationSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationSamples"));
    /// The byte offset of `sampleShadingEnable`.
    public static final long OFFSET_sampleShadingEnable = LAYOUT.byteOffset(PathElement.groupElement("sampleShadingEnable"));
    /// The memory layout of `sampleShadingEnable`.
    public static final MemoryLayout LAYOUT_sampleShadingEnable = LAYOUT.select(PathElement.groupElement("sampleShadingEnable"));
    /// The [VarHandle] of `sampleShadingEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sampleShadingEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleShadingEnable"));
    /// The byte offset of `minSampleShading`.
    public static final long OFFSET_minSampleShading = LAYOUT.byteOffset(PathElement.groupElement("minSampleShading"));
    /// The memory layout of `minSampleShading`.
    public static final MemoryLayout LAYOUT_minSampleShading = LAYOUT.select(PathElement.groupElement("minSampleShading"));
    /// The [VarHandle] of `minSampleShading` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minSampleShading = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSampleShading"));
    /// The byte offset of `pSampleMask`.
    public static final long OFFSET_pSampleMask = LAYOUT.byteOffset(PathElement.groupElement("pSampleMask"));
    /// The memory layout of `pSampleMask`.
    public static final MemoryLayout LAYOUT_pSampleMask = LAYOUT.select(PathElement.groupElement("pSampleMask"));
    /// The [VarHandle] of `pSampleMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSampleMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSampleMask"));
    /// The byte offset of `alphaToCoverageEnable`.
    public static final long OFFSET_alphaToCoverageEnable = LAYOUT.byteOffset(PathElement.groupElement("alphaToCoverageEnable"));
    /// The memory layout of `alphaToCoverageEnable`.
    public static final MemoryLayout LAYOUT_alphaToCoverageEnable = LAYOUT.select(PathElement.groupElement("alphaToCoverageEnable"));
    /// The [VarHandle] of `alphaToCoverageEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_alphaToCoverageEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alphaToCoverageEnable"));
    /// The byte offset of `alphaToOneEnable`.
    public static final long OFFSET_alphaToOneEnable = LAYOUT.byteOffset(PathElement.groupElement("alphaToOneEnable"));
    /// The memory layout of `alphaToOneEnable`.
    public static final MemoryLayout LAYOUT_alphaToOneEnable = LAYOUT.select(PathElement.groupElement("alphaToOneEnable"));
    /// The [VarHandle] of `alphaToOneEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_alphaToOneEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alphaToOneEnable"));

    /// Creates `VkPipelineMultisampleStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPipelineMultisampleStateCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineMultisampleStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineMultisampleStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineMultisampleStateCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineMultisampleStateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineMultisampleStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineMultisampleStateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineMultisampleStateCreateInfo`
    public static VkPipelineMultisampleStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineMultisampleStateCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineMultisampleStateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineMultisampleStateCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo copyFrom(VkPipelineMultisampleStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPipelineMultisampleStateCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineMultisampleStateCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkPipelineMultisampleStateCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `rasterizationSamples` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rasterizationSamples(MemorySegment segment, long index) { return (int) VH_rasterizationSamples.get(segment, 0L, index); }
    /// {@return `rasterizationSamples`}
    public int rasterizationSamples() { return rasterizationSamples(this.segment(), 0L); }
    /// Sets `rasterizationSamples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rasterizationSamples(MemorySegment segment, long index, int value) { VH_rasterizationSamples.set(segment, 0L, index, value); }
    /// Sets `rasterizationSamples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo rasterizationSamples(int value) { rasterizationSamples(this.segment(), 0L, value); return this; }

    /// {@return `sampleShadingEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sampleShadingEnable(MemorySegment segment, long index) { return (int) VH_sampleShadingEnable.get(segment, 0L, index); }
    /// {@return `sampleShadingEnable`}
    public int sampleShadingEnable() { return sampleShadingEnable(this.segment(), 0L); }
    /// Sets `sampleShadingEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampleShadingEnable(MemorySegment segment, long index, int value) { VH_sampleShadingEnable.set(segment, 0L, index, value); }
    /// Sets `sampleShadingEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo sampleShadingEnable(int value) { sampleShadingEnable(this.segment(), 0L, value); return this; }

    /// {@return `minSampleShading` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float minSampleShading(MemorySegment segment, long index) { return (float) VH_minSampleShading.get(segment, 0L, index); }
    /// {@return `minSampleShading`}
    public float minSampleShading() { return minSampleShading(this.segment(), 0L); }
    /// Sets `minSampleShading` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minSampleShading(MemorySegment segment, long index, float value) { VH_minSampleShading.set(segment, 0L, index, value); }
    /// Sets `minSampleShading` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo minSampleShading(float value) { minSampleShading(this.segment(), 0L, value); return this; }

    /// {@return `pSampleMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSampleMask(MemorySegment segment, long index) { return (MemorySegment) VH_pSampleMask.get(segment, 0L, index); }
    /// {@return `pSampleMask`}
    public MemorySegment pSampleMask() { return pSampleMask(this.segment(), 0L); }
    /// Sets `pSampleMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSampleMask(MemorySegment segment, long index, MemorySegment value) { VH_pSampleMask.set(segment, 0L, index, value); }
    /// Sets `pSampleMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo pSampleMask(MemorySegment value) { pSampleMask(this.segment(), 0L, value); return this; }

    /// {@return `alphaToCoverageEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int alphaToCoverageEnable(MemorySegment segment, long index) { return (int) VH_alphaToCoverageEnable.get(segment, 0L, index); }
    /// {@return `alphaToCoverageEnable`}
    public int alphaToCoverageEnable() { return alphaToCoverageEnable(this.segment(), 0L); }
    /// Sets `alphaToCoverageEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void alphaToCoverageEnable(MemorySegment segment, long index, int value) { VH_alphaToCoverageEnable.set(segment, 0L, index, value); }
    /// Sets `alphaToCoverageEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo alphaToCoverageEnable(int value) { alphaToCoverageEnable(this.segment(), 0L, value); return this; }

    /// {@return `alphaToOneEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int alphaToOneEnable(MemorySegment segment, long index) { return (int) VH_alphaToOneEnable.get(segment, 0L, index); }
    /// {@return `alphaToOneEnable`}
    public int alphaToOneEnable() { return alphaToOneEnable(this.segment(), 0L); }
    /// Sets `alphaToOneEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void alphaToOneEnable(MemorySegment segment, long index, int value) { VH_alphaToOneEnable.set(segment, 0L, index, value); }
    /// Sets `alphaToOneEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo alphaToOneEnable(int value) { alphaToOneEnable(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPipelineMultisampleStateCreateInfo].
    public static final class Buffer extends VkPipelineMultisampleStateCreateInfo {
        private final long elementCount;

        /// Creates `VkPipelineMultisampleStateCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineMultisampleStateCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineMultisampleStateCreateInfo`
        public VkPipelineMultisampleStateCreateInfo asSlice(long index) { return new VkPipelineMultisampleStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineMultisampleStateCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineMultisampleStateCreateInfo`
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

        /// {@return `rasterizationSamples` at the given index}
        /// @param index the index of the struct buffer
        public int rasterizationSamplesAt(long index) { return rasterizationSamples(this.segment(), index); }
        /// Sets `rasterizationSamples` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer rasterizationSamplesAt(long index, int value) { rasterizationSamples(this.segment(), index, value); return this; }

        /// {@return `sampleShadingEnable` at the given index}
        /// @param index the index of the struct buffer
        public int sampleShadingEnableAt(long index) { return sampleShadingEnable(this.segment(), index); }
        /// Sets `sampleShadingEnable` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sampleShadingEnableAt(long index, int value) { sampleShadingEnable(this.segment(), index, value); return this; }

        /// {@return `minSampleShading` at the given index}
        /// @param index the index of the struct buffer
        public float minSampleShadingAt(long index) { return minSampleShading(this.segment(), index); }
        /// Sets `minSampleShading` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minSampleShadingAt(long index, float value) { minSampleShading(this.segment(), index, value); return this; }

        /// {@return `pSampleMask` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pSampleMaskAt(long index) { return pSampleMask(this.segment(), index); }
        /// Sets `pSampleMask` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pSampleMaskAt(long index, MemorySegment value) { pSampleMask(this.segment(), index, value); return this; }

        /// {@return `alphaToCoverageEnable` at the given index}
        /// @param index the index of the struct buffer
        public int alphaToCoverageEnableAt(long index) { return alphaToCoverageEnable(this.segment(), index); }
        /// Sets `alphaToCoverageEnable` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer alphaToCoverageEnableAt(long index, int value) { alphaToCoverageEnable(this.segment(), index, value); return this; }

        /// {@return `alphaToOneEnable` at the given index}
        /// @param index the index of the struct buffer
        public int alphaToOneEnableAt(long index) { return alphaToOneEnable(this.segment(), index); }
        /// Sets `alphaToOneEnable` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer alphaToOneEnableAt(long index, int value) { alphaToOneEnable(this.segment(), index, value); return this; }

    }
}
