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
/// struct VkPipelineRasterizationStateCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkPipelineRasterizationStateCreateFlags flags;
///     (uint32_t) VkBool32 depthClampEnable;
///     (uint32_t) VkBool32 rasterizerDiscardEnable;
///     (int) VkPolygonMode polygonMode;
///     ((uint32_t) VkFlags) VkCullModeFlags cullMode;
///     (int) VkFrontFace frontFace;
///     (uint32_t) VkBool32 depthBiasEnable;
///     float depthBiasConstantFactor;
///     float depthBiasClamp;
///     float depthBiasSlopeFactor;
///     float lineWidth;
/// };
/// ```
public sealed class VkPipelineRasterizationStateCreateInfo extends GroupType {
    /// The struct layout of `VkPipelineRasterizationStateCreateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("depthClampEnable"),
        ValueLayout.JAVA_INT.withName("rasterizerDiscardEnable"),
        ValueLayout.JAVA_INT.withName("polygonMode"),
        ValueLayout.JAVA_INT.withName("cullMode"),
        ValueLayout.JAVA_INT.withName("frontFace"),
        ValueLayout.JAVA_INT.withName("depthBiasEnable"),
        ValueLayout.JAVA_FLOAT.withName("depthBiasConstantFactor"),
        ValueLayout.JAVA_FLOAT.withName("depthBiasClamp"),
        ValueLayout.JAVA_FLOAT.withName("depthBiasSlopeFactor"),
        ValueLayout.JAVA_FLOAT.withName("lineWidth")
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
    /// The byte offset of `depthClampEnable`.
    public static final long OFFSET_depthClampEnable = LAYOUT.byteOffset(PathElement.groupElement("depthClampEnable"));
    /// The memory layout of `depthClampEnable`.
    public static final MemoryLayout LAYOUT_depthClampEnable = LAYOUT.select(PathElement.groupElement("depthClampEnable"));
    /// The [VarHandle] of `depthClampEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthClampEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthClampEnable"));
    /// The byte offset of `rasterizerDiscardEnable`.
    public static final long OFFSET_rasterizerDiscardEnable = LAYOUT.byteOffset(PathElement.groupElement("rasterizerDiscardEnable"));
    /// The memory layout of `rasterizerDiscardEnable`.
    public static final MemoryLayout LAYOUT_rasterizerDiscardEnable = LAYOUT.select(PathElement.groupElement("rasterizerDiscardEnable"));
    /// The [VarHandle] of `rasterizerDiscardEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rasterizerDiscardEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizerDiscardEnable"));
    /// The byte offset of `polygonMode`.
    public static final long OFFSET_polygonMode = LAYOUT.byteOffset(PathElement.groupElement("polygonMode"));
    /// The memory layout of `polygonMode`.
    public static final MemoryLayout LAYOUT_polygonMode = LAYOUT.select(PathElement.groupElement("polygonMode"));
    /// The [VarHandle] of `polygonMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_polygonMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("polygonMode"));
    /// The byte offset of `cullMode`.
    public static final long OFFSET_cullMode = LAYOUT.byteOffset(PathElement.groupElement("cullMode"));
    /// The memory layout of `cullMode`.
    public static final MemoryLayout LAYOUT_cullMode = LAYOUT.select(PathElement.groupElement("cullMode"));
    /// The [VarHandle] of `cullMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cullMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cullMode"));
    /// The byte offset of `frontFace`.
    public static final long OFFSET_frontFace = LAYOUT.byteOffset(PathElement.groupElement("frontFace"));
    /// The memory layout of `frontFace`.
    public static final MemoryLayout LAYOUT_frontFace = LAYOUT.select(PathElement.groupElement("frontFace"));
    /// The [VarHandle] of `frontFace` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frontFace = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frontFace"));
    /// The byte offset of `depthBiasEnable`.
    public static final long OFFSET_depthBiasEnable = LAYOUT.byteOffset(PathElement.groupElement("depthBiasEnable"));
    /// The memory layout of `depthBiasEnable`.
    public static final MemoryLayout LAYOUT_depthBiasEnable = LAYOUT.select(PathElement.groupElement("depthBiasEnable"));
    /// The [VarHandle] of `depthBiasEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthBiasEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasEnable"));
    /// The byte offset of `depthBiasConstantFactor`.
    public static final long OFFSET_depthBiasConstantFactor = LAYOUT.byteOffset(PathElement.groupElement("depthBiasConstantFactor"));
    /// The memory layout of `depthBiasConstantFactor`.
    public static final MemoryLayout LAYOUT_depthBiasConstantFactor = LAYOUT.select(PathElement.groupElement("depthBiasConstantFactor"));
    /// The [VarHandle] of `depthBiasConstantFactor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthBiasConstantFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasConstantFactor"));
    /// The byte offset of `depthBiasClamp`.
    public static final long OFFSET_depthBiasClamp = LAYOUT.byteOffset(PathElement.groupElement("depthBiasClamp"));
    /// The memory layout of `depthBiasClamp`.
    public static final MemoryLayout LAYOUT_depthBiasClamp = LAYOUT.select(PathElement.groupElement("depthBiasClamp"));
    /// The [VarHandle] of `depthBiasClamp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthBiasClamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasClamp"));
    /// The byte offset of `depthBiasSlopeFactor`.
    public static final long OFFSET_depthBiasSlopeFactor = LAYOUT.byteOffset(PathElement.groupElement("depthBiasSlopeFactor"));
    /// The memory layout of `depthBiasSlopeFactor`.
    public static final MemoryLayout LAYOUT_depthBiasSlopeFactor = LAYOUT.select(PathElement.groupElement("depthBiasSlopeFactor"));
    /// The [VarHandle] of `depthBiasSlopeFactor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthBiasSlopeFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasSlopeFactor"));
    /// The byte offset of `lineWidth`.
    public static final long OFFSET_lineWidth = LAYOUT.byteOffset(PathElement.groupElement("lineWidth"));
    /// The memory layout of `lineWidth`.
    public static final MemoryLayout LAYOUT_lineWidth = LAYOUT.select(PathElement.groupElement("lineWidth"));
    /// The [VarHandle] of `lineWidth` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_lineWidth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineWidth"));

    /// Creates `VkPipelineRasterizationStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPipelineRasterizationStateCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineRasterizationStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineRasterizationStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationStateCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationStateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineRasterizationStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineRasterizationStateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineRasterizationStateCreateInfo`
    public static VkPipelineRasterizationStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineRasterizationStateCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineRasterizationStateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineRasterizationStateCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo copyFrom(VkPipelineRasterizationStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPipelineRasterizationStateCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineRasterizationStateCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkPipelineRasterizationStateCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `depthClampEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int depthClampEnable(MemorySegment segment, long index) { return (int) VH_depthClampEnable.get(segment, 0L, index); }
    /// {@return `depthClampEnable`}
    public int depthClampEnable() { return depthClampEnable(this.segment(), 0L); }
    /// Sets `depthClampEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthClampEnable(MemorySegment segment, long index, int value) { VH_depthClampEnable.set(segment, 0L, index, value); }
    /// Sets `depthClampEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo depthClampEnable(int value) { depthClampEnable(this.segment(), 0L, value); return this; }

    /// {@return `rasterizerDiscardEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rasterizerDiscardEnable(MemorySegment segment, long index) { return (int) VH_rasterizerDiscardEnable.get(segment, 0L, index); }
    /// {@return `rasterizerDiscardEnable`}
    public int rasterizerDiscardEnable() { return rasterizerDiscardEnable(this.segment(), 0L); }
    /// Sets `rasterizerDiscardEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rasterizerDiscardEnable(MemorySegment segment, long index, int value) { VH_rasterizerDiscardEnable.set(segment, 0L, index, value); }
    /// Sets `rasterizerDiscardEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo rasterizerDiscardEnable(int value) { rasterizerDiscardEnable(this.segment(), 0L, value); return this; }

    /// {@return `polygonMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int polygonMode(MemorySegment segment, long index) { return (int) VH_polygonMode.get(segment, 0L, index); }
    /// {@return `polygonMode`}
    public int polygonMode() { return polygonMode(this.segment(), 0L); }
    /// Sets `polygonMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void polygonMode(MemorySegment segment, long index, int value) { VH_polygonMode.set(segment, 0L, index, value); }
    /// Sets `polygonMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo polygonMode(int value) { polygonMode(this.segment(), 0L, value); return this; }

    /// {@return `cullMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int cullMode(MemorySegment segment, long index) { return (int) VH_cullMode.get(segment, 0L, index); }
    /// {@return `cullMode`}
    public int cullMode() { return cullMode(this.segment(), 0L); }
    /// Sets `cullMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cullMode(MemorySegment segment, long index, int value) { VH_cullMode.set(segment, 0L, index, value); }
    /// Sets `cullMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo cullMode(int value) { cullMode(this.segment(), 0L, value); return this; }

    /// {@return `frontFace` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int frontFace(MemorySegment segment, long index) { return (int) VH_frontFace.get(segment, 0L, index); }
    /// {@return `frontFace`}
    public int frontFace() { return frontFace(this.segment(), 0L); }
    /// Sets `frontFace` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frontFace(MemorySegment segment, long index, int value) { VH_frontFace.set(segment, 0L, index, value); }
    /// Sets `frontFace` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo frontFace(int value) { frontFace(this.segment(), 0L, value); return this; }

    /// {@return `depthBiasEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int depthBiasEnable(MemorySegment segment, long index) { return (int) VH_depthBiasEnable.get(segment, 0L, index); }
    /// {@return `depthBiasEnable`}
    public int depthBiasEnable() { return depthBiasEnable(this.segment(), 0L); }
    /// Sets `depthBiasEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthBiasEnable(MemorySegment segment, long index, int value) { VH_depthBiasEnable.set(segment, 0L, index, value); }
    /// Sets `depthBiasEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo depthBiasEnable(int value) { depthBiasEnable(this.segment(), 0L, value); return this; }

    /// {@return `depthBiasConstantFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float depthBiasConstantFactor(MemorySegment segment, long index) { return (float) VH_depthBiasConstantFactor.get(segment, 0L, index); }
    /// {@return `depthBiasConstantFactor`}
    public float depthBiasConstantFactor() { return depthBiasConstantFactor(this.segment(), 0L); }
    /// Sets `depthBiasConstantFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthBiasConstantFactor(MemorySegment segment, long index, float value) { VH_depthBiasConstantFactor.set(segment, 0L, index, value); }
    /// Sets `depthBiasConstantFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo depthBiasConstantFactor(float value) { depthBiasConstantFactor(this.segment(), 0L, value); return this; }

    /// {@return `depthBiasClamp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float depthBiasClamp(MemorySegment segment, long index) { return (float) VH_depthBiasClamp.get(segment, 0L, index); }
    /// {@return `depthBiasClamp`}
    public float depthBiasClamp() { return depthBiasClamp(this.segment(), 0L); }
    /// Sets `depthBiasClamp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthBiasClamp(MemorySegment segment, long index, float value) { VH_depthBiasClamp.set(segment, 0L, index, value); }
    /// Sets `depthBiasClamp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo depthBiasClamp(float value) { depthBiasClamp(this.segment(), 0L, value); return this; }

    /// {@return `depthBiasSlopeFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float depthBiasSlopeFactor(MemorySegment segment, long index) { return (float) VH_depthBiasSlopeFactor.get(segment, 0L, index); }
    /// {@return `depthBiasSlopeFactor`}
    public float depthBiasSlopeFactor() { return depthBiasSlopeFactor(this.segment(), 0L); }
    /// Sets `depthBiasSlopeFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthBiasSlopeFactor(MemorySegment segment, long index, float value) { VH_depthBiasSlopeFactor.set(segment, 0L, index, value); }
    /// Sets `depthBiasSlopeFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo depthBiasSlopeFactor(float value) { depthBiasSlopeFactor(this.segment(), 0L, value); return this; }

    /// {@return `lineWidth` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float lineWidth(MemorySegment segment, long index) { return (float) VH_lineWidth.get(segment, 0L, index); }
    /// {@return `lineWidth`}
    public float lineWidth() { return lineWidth(this.segment(), 0L); }
    /// Sets `lineWidth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void lineWidth(MemorySegment segment, long index, float value) { VH_lineWidth.set(segment, 0L, index, value); }
    /// Sets `lineWidth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo lineWidth(float value) { lineWidth(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPipelineRasterizationStateCreateInfo].
    public static final class Buffer extends VkPipelineRasterizationStateCreateInfo {
        private final long elementCount;

        /// Creates `VkPipelineRasterizationStateCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineRasterizationStateCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineRasterizationStateCreateInfo`
        public VkPipelineRasterizationStateCreateInfo asSlice(long index) { return new VkPipelineRasterizationStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineRasterizationStateCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineRasterizationStateCreateInfo`
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

        /// {@return `depthClampEnable` at the given index}
        /// @param index the index of the struct buffer
        public int depthClampEnableAt(long index) { return depthClampEnable(this.segment(), index); }
        /// Sets `depthClampEnable` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer depthClampEnableAt(long index, int value) { depthClampEnable(this.segment(), index, value); return this; }

        /// {@return `rasterizerDiscardEnable` at the given index}
        /// @param index the index of the struct buffer
        public int rasterizerDiscardEnableAt(long index) { return rasterizerDiscardEnable(this.segment(), index); }
        /// Sets `rasterizerDiscardEnable` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer rasterizerDiscardEnableAt(long index, int value) { rasterizerDiscardEnable(this.segment(), index, value); return this; }

        /// {@return `polygonMode` at the given index}
        /// @param index the index of the struct buffer
        public int polygonModeAt(long index) { return polygonMode(this.segment(), index); }
        /// Sets `polygonMode` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer polygonModeAt(long index, int value) { polygonMode(this.segment(), index, value); return this; }

        /// {@return `cullMode` at the given index}
        /// @param index the index of the struct buffer
        public int cullModeAt(long index) { return cullMode(this.segment(), index); }
        /// Sets `cullMode` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cullModeAt(long index, int value) { cullMode(this.segment(), index, value); return this; }

        /// {@return `frontFace` at the given index}
        /// @param index the index of the struct buffer
        public int frontFaceAt(long index) { return frontFace(this.segment(), index); }
        /// Sets `frontFace` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer frontFaceAt(long index, int value) { frontFace(this.segment(), index, value); return this; }

        /// {@return `depthBiasEnable` at the given index}
        /// @param index the index of the struct buffer
        public int depthBiasEnableAt(long index) { return depthBiasEnable(this.segment(), index); }
        /// Sets `depthBiasEnable` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer depthBiasEnableAt(long index, int value) { depthBiasEnable(this.segment(), index, value); return this; }

        /// {@return `depthBiasConstantFactor` at the given index}
        /// @param index the index of the struct buffer
        public float depthBiasConstantFactorAt(long index) { return depthBiasConstantFactor(this.segment(), index); }
        /// Sets `depthBiasConstantFactor` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer depthBiasConstantFactorAt(long index, float value) { depthBiasConstantFactor(this.segment(), index, value); return this; }

        /// {@return `depthBiasClamp` at the given index}
        /// @param index the index of the struct buffer
        public float depthBiasClampAt(long index) { return depthBiasClamp(this.segment(), index); }
        /// Sets `depthBiasClamp` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer depthBiasClampAt(long index, float value) { depthBiasClamp(this.segment(), index, value); return this; }

        /// {@return `depthBiasSlopeFactor` at the given index}
        /// @param index the index of the struct buffer
        public float depthBiasSlopeFactorAt(long index) { return depthBiasSlopeFactor(this.segment(), index); }
        /// Sets `depthBiasSlopeFactor` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer depthBiasSlopeFactorAt(long index, float value) { depthBiasSlopeFactor(this.segment(), index, value); return this; }

        /// {@return `lineWidth` at the given index}
        /// @param index the index of the struct buffer
        public float lineWidthAt(long index) { return lineWidth(this.segment(), index); }
        /// Sets `lineWidth` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer lineWidthAt(long index, float value) { lineWidth(this.segment(), index, value); return this; }

    }
}
