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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDevicePortabilitySubsetFeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 constantAlphaColorBlendFactors;
///     (uint32_t) VkBool32 events;
///     (uint32_t) VkBool32 imageViewFormatReinterpretation;
///     (uint32_t) VkBool32 imageViewFormatSwizzle;
///     (uint32_t) VkBool32 imageView2DOn3DImage;
///     (uint32_t) VkBool32 multisampleArrayImage;
///     (uint32_t) VkBool32 mutableComparisonSamplers;
///     (uint32_t) VkBool32 pointPolygons;
///     (uint32_t) VkBool32 samplerMipLodBias;
///     (uint32_t) VkBool32 separateStencilMaskRef;
///     (uint32_t) VkBool32 shaderSampleRateInterpolationFunctions;
///     (uint32_t) VkBool32 tessellationIsolines;
///     (uint32_t) VkBool32 tessellationPointMode;
///     (uint32_t) VkBool32 triangleFans;
///     (uint32_t) VkBool32 vertexAttributeAccessBeyondStride;
/// };
/// ```
public final class VkPhysicalDevicePortabilitySubsetFeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDevicePortabilitySubsetFeaturesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("constantAlphaColorBlendFactors"),
        ValueLayout.JAVA_INT.withName("events"),
        ValueLayout.JAVA_INT.withName("imageViewFormatReinterpretation"),
        ValueLayout.JAVA_INT.withName("imageViewFormatSwizzle"),
        ValueLayout.JAVA_INT.withName("imageView2DOn3DImage"),
        ValueLayout.JAVA_INT.withName("multisampleArrayImage"),
        ValueLayout.JAVA_INT.withName("mutableComparisonSamplers"),
        ValueLayout.JAVA_INT.withName("pointPolygons"),
        ValueLayout.JAVA_INT.withName("samplerMipLodBias"),
        ValueLayout.JAVA_INT.withName("separateStencilMaskRef"),
        ValueLayout.JAVA_INT.withName("shaderSampleRateInterpolationFunctions"),
        ValueLayout.JAVA_INT.withName("tessellationIsolines"),
        ValueLayout.JAVA_INT.withName("tessellationPointMode"),
        ValueLayout.JAVA_INT.withName("triangleFans"),
        ValueLayout.JAVA_INT.withName("vertexAttributeAccessBeyondStride")
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
    /// The byte offset of `constantAlphaColorBlendFactors`.
    public static final long OFFSET_constantAlphaColorBlendFactors = LAYOUT.byteOffset(PathElement.groupElement("constantAlphaColorBlendFactors"));
    /// The memory layout of `constantAlphaColorBlendFactors`.
    public static final MemoryLayout LAYOUT_constantAlphaColorBlendFactors = LAYOUT.select(PathElement.groupElement("constantAlphaColorBlendFactors"));
    /// The [VarHandle] of `constantAlphaColorBlendFactors` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_constantAlphaColorBlendFactors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constantAlphaColorBlendFactors"));
    /// The byte offset of `events`.
    public static final long OFFSET_events = LAYOUT.byteOffset(PathElement.groupElement("events"));
    /// The memory layout of `events`.
    public static final MemoryLayout LAYOUT_events = LAYOUT.select(PathElement.groupElement("events"));
    /// The [VarHandle] of `events` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_events = LAYOUT.arrayElementVarHandle(PathElement.groupElement("events"));
    /// The byte offset of `imageViewFormatReinterpretation`.
    public static final long OFFSET_imageViewFormatReinterpretation = LAYOUT.byteOffset(PathElement.groupElement("imageViewFormatReinterpretation"));
    /// The memory layout of `imageViewFormatReinterpretation`.
    public static final MemoryLayout LAYOUT_imageViewFormatReinterpretation = LAYOUT.select(PathElement.groupElement("imageViewFormatReinterpretation"));
    /// The [VarHandle] of `imageViewFormatReinterpretation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageViewFormatReinterpretation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageViewFormatReinterpretation"));
    /// The byte offset of `imageViewFormatSwizzle`.
    public static final long OFFSET_imageViewFormatSwizzle = LAYOUT.byteOffset(PathElement.groupElement("imageViewFormatSwizzle"));
    /// The memory layout of `imageViewFormatSwizzle`.
    public static final MemoryLayout LAYOUT_imageViewFormatSwizzle = LAYOUT.select(PathElement.groupElement("imageViewFormatSwizzle"));
    /// The [VarHandle] of `imageViewFormatSwizzle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageViewFormatSwizzle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageViewFormatSwizzle"));
    /// The byte offset of `imageView2DOn3DImage`.
    public static final long OFFSET_imageView2DOn3DImage = LAYOUT.byteOffset(PathElement.groupElement("imageView2DOn3DImage"));
    /// The memory layout of `imageView2DOn3DImage`.
    public static final MemoryLayout LAYOUT_imageView2DOn3DImage = LAYOUT.select(PathElement.groupElement("imageView2DOn3DImage"));
    /// The [VarHandle] of `imageView2DOn3DImage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageView2DOn3DImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageView2DOn3DImage"));
    /// The byte offset of `multisampleArrayImage`.
    public static final long OFFSET_multisampleArrayImage = LAYOUT.byteOffset(PathElement.groupElement("multisampleArrayImage"));
    /// The memory layout of `multisampleArrayImage`.
    public static final MemoryLayout LAYOUT_multisampleArrayImage = LAYOUT.select(PathElement.groupElement("multisampleArrayImage"));
    /// The [VarHandle] of `multisampleArrayImage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_multisampleArrayImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multisampleArrayImage"));
    /// The byte offset of `mutableComparisonSamplers`.
    public static final long OFFSET_mutableComparisonSamplers = LAYOUT.byteOffset(PathElement.groupElement("mutableComparisonSamplers"));
    /// The memory layout of `mutableComparisonSamplers`.
    public static final MemoryLayout LAYOUT_mutableComparisonSamplers = LAYOUT.select(PathElement.groupElement("mutableComparisonSamplers"));
    /// The [VarHandle] of `mutableComparisonSamplers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mutableComparisonSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mutableComparisonSamplers"));
    /// The byte offset of `pointPolygons`.
    public static final long OFFSET_pointPolygons = LAYOUT.byteOffset(PathElement.groupElement("pointPolygons"));
    /// The memory layout of `pointPolygons`.
    public static final MemoryLayout LAYOUT_pointPolygons = LAYOUT.select(PathElement.groupElement("pointPolygons"));
    /// The [VarHandle] of `pointPolygons` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pointPolygons = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pointPolygons"));
    /// The byte offset of `samplerMipLodBias`.
    public static final long OFFSET_samplerMipLodBias = LAYOUT.byteOffset(PathElement.groupElement("samplerMipLodBias"));
    /// The memory layout of `samplerMipLodBias`.
    public static final MemoryLayout LAYOUT_samplerMipLodBias = LAYOUT.select(PathElement.groupElement("samplerMipLodBias"));
    /// The [VarHandle] of `samplerMipLodBias` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_samplerMipLodBias = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerMipLodBias"));
    /// The byte offset of `separateStencilMaskRef`.
    public static final long OFFSET_separateStencilMaskRef = LAYOUT.byteOffset(PathElement.groupElement("separateStencilMaskRef"));
    /// The memory layout of `separateStencilMaskRef`.
    public static final MemoryLayout LAYOUT_separateStencilMaskRef = LAYOUT.select(PathElement.groupElement("separateStencilMaskRef"));
    /// The [VarHandle] of `separateStencilMaskRef` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_separateStencilMaskRef = LAYOUT.arrayElementVarHandle(PathElement.groupElement("separateStencilMaskRef"));
    /// The byte offset of `shaderSampleRateInterpolationFunctions`.
    public static final long OFFSET_shaderSampleRateInterpolationFunctions = LAYOUT.byteOffset(PathElement.groupElement("shaderSampleRateInterpolationFunctions"));
    /// The memory layout of `shaderSampleRateInterpolationFunctions`.
    public static final MemoryLayout LAYOUT_shaderSampleRateInterpolationFunctions = LAYOUT.select(PathElement.groupElement("shaderSampleRateInterpolationFunctions"));
    /// The [VarHandle] of `shaderSampleRateInterpolationFunctions` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderSampleRateInterpolationFunctions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSampleRateInterpolationFunctions"));
    /// The byte offset of `tessellationIsolines`.
    public static final long OFFSET_tessellationIsolines = LAYOUT.byteOffset(PathElement.groupElement("tessellationIsolines"));
    /// The memory layout of `tessellationIsolines`.
    public static final MemoryLayout LAYOUT_tessellationIsolines = LAYOUT.select(PathElement.groupElement("tessellationIsolines"));
    /// The [VarHandle] of `tessellationIsolines` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tessellationIsolines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tessellationIsolines"));
    /// The byte offset of `tessellationPointMode`.
    public static final long OFFSET_tessellationPointMode = LAYOUT.byteOffset(PathElement.groupElement("tessellationPointMode"));
    /// The memory layout of `tessellationPointMode`.
    public static final MemoryLayout LAYOUT_tessellationPointMode = LAYOUT.select(PathElement.groupElement("tessellationPointMode"));
    /// The [VarHandle] of `tessellationPointMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tessellationPointMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tessellationPointMode"));
    /// The byte offset of `triangleFans`.
    public static final long OFFSET_triangleFans = LAYOUT.byteOffset(PathElement.groupElement("triangleFans"));
    /// The memory layout of `triangleFans`.
    public static final MemoryLayout LAYOUT_triangleFans = LAYOUT.select(PathElement.groupElement("triangleFans"));
    /// The [VarHandle] of `triangleFans` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_triangleFans = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangleFans"));
    /// The byte offset of `vertexAttributeAccessBeyondStride`.
    public static final long OFFSET_vertexAttributeAccessBeyondStride = LAYOUT.byteOffset(PathElement.groupElement("vertexAttributeAccessBeyondStride"));
    /// The memory layout of `vertexAttributeAccessBeyondStride`.
    public static final MemoryLayout LAYOUT_vertexAttributeAccessBeyondStride = LAYOUT.select(PathElement.groupElement("vertexAttributeAccessBeyondStride"));
    /// The [VarHandle] of `vertexAttributeAccessBeyondStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexAttributeAccessBeyondStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexAttributeAccessBeyondStride"));

    /// Creates `VkPhysicalDevicePortabilitySubsetFeaturesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDevicePortabilitySubsetFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePortabilitySubsetFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDevicePortabilitySubsetFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePortabilitySubsetFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDevicePortabilitySubsetFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePortabilitySubsetFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDevicePortabilitySubsetFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePortabilitySubsetFeaturesKHR`
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDevicePortabilitySubsetFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevicePortabilitySubsetFeaturesKHR`
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR copyFrom(VkPhysicalDevicePortabilitySubsetFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR reinterpret(long count) { return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `constantAlphaColorBlendFactors` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int constantAlphaColorBlendFactors(MemorySegment segment, long index) { return (int) VH_constantAlphaColorBlendFactors.get(segment, 0L, index); }
    /// {@return `constantAlphaColorBlendFactors`}
    public int constantAlphaColorBlendFactors() { return constantAlphaColorBlendFactors(this.segment(), 0L); }
    /// Sets `constantAlphaColorBlendFactors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void constantAlphaColorBlendFactors(MemorySegment segment, long index, int value) { VH_constantAlphaColorBlendFactors.set(segment, 0L, index, value); }
    /// Sets `constantAlphaColorBlendFactors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR constantAlphaColorBlendFactors(int value) { constantAlphaColorBlendFactors(this.segment(), 0L, value); return this; }

    /// {@return `events` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int events(MemorySegment segment, long index) { return (int) VH_events.get(segment, 0L, index); }
    /// {@return `events`}
    public int events() { return events(this.segment(), 0L); }
    /// Sets `events` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void events(MemorySegment segment, long index, int value) { VH_events.set(segment, 0L, index, value); }
    /// Sets `events` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR events(int value) { events(this.segment(), 0L, value); return this; }

    /// {@return `imageViewFormatReinterpretation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageViewFormatReinterpretation(MemorySegment segment, long index) { return (int) VH_imageViewFormatReinterpretation.get(segment, 0L, index); }
    /// {@return `imageViewFormatReinterpretation`}
    public int imageViewFormatReinterpretation() { return imageViewFormatReinterpretation(this.segment(), 0L); }
    /// Sets `imageViewFormatReinterpretation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageViewFormatReinterpretation(MemorySegment segment, long index, int value) { VH_imageViewFormatReinterpretation.set(segment, 0L, index, value); }
    /// Sets `imageViewFormatReinterpretation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageViewFormatReinterpretation(int value) { imageViewFormatReinterpretation(this.segment(), 0L, value); return this; }

    /// {@return `imageViewFormatSwizzle` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageViewFormatSwizzle(MemorySegment segment, long index) { return (int) VH_imageViewFormatSwizzle.get(segment, 0L, index); }
    /// {@return `imageViewFormatSwizzle`}
    public int imageViewFormatSwizzle() { return imageViewFormatSwizzle(this.segment(), 0L); }
    /// Sets `imageViewFormatSwizzle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageViewFormatSwizzle(MemorySegment segment, long index, int value) { VH_imageViewFormatSwizzle.set(segment, 0L, index, value); }
    /// Sets `imageViewFormatSwizzle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageViewFormatSwizzle(int value) { imageViewFormatSwizzle(this.segment(), 0L, value); return this; }

    /// {@return `imageView2DOn3DImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageView2DOn3DImage(MemorySegment segment, long index) { return (int) VH_imageView2DOn3DImage.get(segment, 0L, index); }
    /// {@return `imageView2DOn3DImage`}
    public int imageView2DOn3DImage() { return imageView2DOn3DImage(this.segment(), 0L); }
    /// Sets `imageView2DOn3DImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageView2DOn3DImage(MemorySegment segment, long index, int value) { VH_imageView2DOn3DImage.set(segment, 0L, index, value); }
    /// Sets `imageView2DOn3DImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageView2DOn3DImage(int value) { imageView2DOn3DImage(this.segment(), 0L, value); return this; }

    /// {@return `multisampleArrayImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int multisampleArrayImage(MemorySegment segment, long index) { return (int) VH_multisampleArrayImage.get(segment, 0L, index); }
    /// {@return `multisampleArrayImage`}
    public int multisampleArrayImage() { return multisampleArrayImage(this.segment(), 0L); }
    /// Sets `multisampleArrayImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void multisampleArrayImage(MemorySegment segment, long index, int value) { VH_multisampleArrayImage.set(segment, 0L, index, value); }
    /// Sets `multisampleArrayImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR multisampleArrayImage(int value) { multisampleArrayImage(this.segment(), 0L, value); return this; }

    /// {@return `mutableComparisonSamplers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int mutableComparisonSamplers(MemorySegment segment, long index) { return (int) VH_mutableComparisonSamplers.get(segment, 0L, index); }
    /// {@return `mutableComparisonSamplers`}
    public int mutableComparisonSamplers() { return mutableComparisonSamplers(this.segment(), 0L); }
    /// Sets `mutableComparisonSamplers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mutableComparisonSamplers(MemorySegment segment, long index, int value) { VH_mutableComparisonSamplers.set(segment, 0L, index, value); }
    /// Sets `mutableComparisonSamplers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR mutableComparisonSamplers(int value) { mutableComparisonSamplers(this.segment(), 0L, value); return this; }

    /// {@return `pointPolygons` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pointPolygons(MemorySegment segment, long index) { return (int) VH_pointPolygons.get(segment, 0L, index); }
    /// {@return `pointPolygons`}
    public int pointPolygons() { return pointPolygons(this.segment(), 0L); }
    /// Sets `pointPolygons` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pointPolygons(MemorySegment segment, long index, int value) { VH_pointPolygons.set(segment, 0L, index, value); }
    /// Sets `pointPolygons` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR pointPolygons(int value) { pointPolygons(this.segment(), 0L, value); return this; }

    /// {@return `samplerMipLodBias` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int samplerMipLodBias(MemorySegment segment, long index) { return (int) VH_samplerMipLodBias.get(segment, 0L, index); }
    /// {@return `samplerMipLodBias`}
    public int samplerMipLodBias() { return samplerMipLodBias(this.segment(), 0L); }
    /// Sets `samplerMipLodBias` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void samplerMipLodBias(MemorySegment segment, long index, int value) { VH_samplerMipLodBias.set(segment, 0L, index, value); }
    /// Sets `samplerMipLodBias` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR samplerMipLodBias(int value) { samplerMipLodBias(this.segment(), 0L, value); return this; }

    /// {@return `separateStencilMaskRef` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int separateStencilMaskRef(MemorySegment segment, long index) { return (int) VH_separateStencilMaskRef.get(segment, 0L, index); }
    /// {@return `separateStencilMaskRef`}
    public int separateStencilMaskRef() { return separateStencilMaskRef(this.segment(), 0L); }
    /// Sets `separateStencilMaskRef` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void separateStencilMaskRef(MemorySegment segment, long index, int value) { VH_separateStencilMaskRef.set(segment, 0L, index, value); }
    /// Sets `separateStencilMaskRef` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR separateStencilMaskRef(int value) { separateStencilMaskRef(this.segment(), 0L, value); return this; }

    /// {@return `shaderSampleRateInterpolationFunctions` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSampleRateInterpolationFunctions(MemorySegment segment, long index) { return (int) VH_shaderSampleRateInterpolationFunctions.get(segment, 0L, index); }
    /// {@return `shaderSampleRateInterpolationFunctions`}
    public int shaderSampleRateInterpolationFunctions() { return shaderSampleRateInterpolationFunctions(this.segment(), 0L); }
    /// Sets `shaderSampleRateInterpolationFunctions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSampleRateInterpolationFunctions(MemorySegment segment, long index, int value) { VH_shaderSampleRateInterpolationFunctions.set(segment, 0L, index, value); }
    /// Sets `shaderSampleRateInterpolationFunctions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR shaderSampleRateInterpolationFunctions(int value) { shaderSampleRateInterpolationFunctions(this.segment(), 0L, value); return this; }

    /// {@return `tessellationIsolines` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tessellationIsolines(MemorySegment segment, long index) { return (int) VH_tessellationIsolines.get(segment, 0L, index); }
    /// {@return `tessellationIsolines`}
    public int tessellationIsolines() { return tessellationIsolines(this.segment(), 0L); }
    /// Sets `tessellationIsolines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tessellationIsolines(MemorySegment segment, long index, int value) { VH_tessellationIsolines.set(segment, 0L, index, value); }
    /// Sets `tessellationIsolines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR tessellationIsolines(int value) { tessellationIsolines(this.segment(), 0L, value); return this; }

    /// {@return `tessellationPointMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tessellationPointMode(MemorySegment segment, long index) { return (int) VH_tessellationPointMode.get(segment, 0L, index); }
    /// {@return `tessellationPointMode`}
    public int tessellationPointMode() { return tessellationPointMode(this.segment(), 0L); }
    /// Sets `tessellationPointMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tessellationPointMode(MemorySegment segment, long index, int value) { VH_tessellationPointMode.set(segment, 0L, index, value); }
    /// Sets `tessellationPointMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR tessellationPointMode(int value) { tessellationPointMode(this.segment(), 0L, value); return this; }

    /// {@return `triangleFans` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int triangleFans(MemorySegment segment, long index) { return (int) VH_triangleFans.get(segment, 0L, index); }
    /// {@return `triangleFans`}
    public int triangleFans() { return triangleFans(this.segment(), 0L); }
    /// Sets `triangleFans` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void triangleFans(MemorySegment segment, long index, int value) { VH_triangleFans.set(segment, 0L, index, value); }
    /// Sets `triangleFans` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR triangleFans(int value) { triangleFans(this.segment(), 0L, value); return this; }

    /// {@return `vertexAttributeAccessBeyondStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vertexAttributeAccessBeyondStride(MemorySegment segment, long index) { return (int) VH_vertexAttributeAccessBeyondStride.get(segment, 0L, index); }
    /// {@return `vertexAttributeAccessBeyondStride`}
    public int vertexAttributeAccessBeyondStride() { return vertexAttributeAccessBeyondStride(this.segment(), 0L); }
    /// Sets `vertexAttributeAccessBeyondStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexAttributeAccessBeyondStride(MemorySegment segment, long index, int value) { VH_vertexAttributeAccessBeyondStride.set(segment, 0L, index, value); }
    /// Sets `vertexAttributeAccessBeyondStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR vertexAttributeAccessBeyondStride(int value) { vertexAttributeAccessBeyondStride(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDevicePortabilitySubsetFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDevicePortabilitySubsetFeaturesKHR`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR asSlice(long index) { return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDevicePortabilitySubsetFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDevicePortabilitySubsetFeaturesKHR`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDevicePortabilitySubsetFeaturesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR at(long index, Consumer<VkPhysicalDevicePortabilitySubsetFeaturesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `constantAlphaColorBlendFactors` at the given index}
    /// @param index the index of the struct buffer
    public int constantAlphaColorBlendFactorsAt(long index) { return constantAlphaColorBlendFactors(this.segment(), index); }
    /// Sets `constantAlphaColorBlendFactors` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR constantAlphaColorBlendFactorsAt(long index, int value) { constantAlphaColorBlendFactors(this.segment(), index, value); return this; }

    /// {@return `events` at the given index}
    /// @param index the index of the struct buffer
    public int eventsAt(long index) { return events(this.segment(), index); }
    /// Sets `events` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR eventsAt(long index, int value) { events(this.segment(), index, value); return this; }

    /// {@return `imageViewFormatReinterpretation` at the given index}
    /// @param index the index of the struct buffer
    public int imageViewFormatReinterpretationAt(long index) { return imageViewFormatReinterpretation(this.segment(), index); }
    /// Sets `imageViewFormatReinterpretation` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageViewFormatReinterpretationAt(long index, int value) { imageViewFormatReinterpretation(this.segment(), index, value); return this; }

    /// {@return `imageViewFormatSwizzle` at the given index}
    /// @param index the index of the struct buffer
    public int imageViewFormatSwizzleAt(long index) { return imageViewFormatSwizzle(this.segment(), index); }
    /// Sets `imageViewFormatSwizzle` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageViewFormatSwizzleAt(long index, int value) { imageViewFormatSwizzle(this.segment(), index, value); return this; }

    /// {@return `imageView2DOn3DImage` at the given index}
    /// @param index the index of the struct buffer
    public int imageView2DOn3DImageAt(long index) { return imageView2DOn3DImage(this.segment(), index); }
    /// Sets `imageView2DOn3DImage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageView2DOn3DImageAt(long index, int value) { imageView2DOn3DImage(this.segment(), index, value); return this; }

    /// {@return `multisampleArrayImage` at the given index}
    /// @param index the index of the struct buffer
    public int multisampleArrayImageAt(long index) { return multisampleArrayImage(this.segment(), index); }
    /// Sets `multisampleArrayImage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR multisampleArrayImageAt(long index, int value) { multisampleArrayImage(this.segment(), index, value); return this; }

    /// {@return `mutableComparisonSamplers` at the given index}
    /// @param index the index of the struct buffer
    public int mutableComparisonSamplersAt(long index) { return mutableComparisonSamplers(this.segment(), index); }
    /// Sets `mutableComparisonSamplers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR mutableComparisonSamplersAt(long index, int value) { mutableComparisonSamplers(this.segment(), index, value); return this; }

    /// {@return `pointPolygons` at the given index}
    /// @param index the index of the struct buffer
    public int pointPolygonsAt(long index) { return pointPolygons(this.segment(), index); }
    /// Sets `pointPolygons` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR pointPolygonsAt(long index, int value) { pointPolygons(this.segment(), index, value); return this; }

    /// {@return `samplerMipLodBias` at the given index}
    /// @param index the index of the struct buffer
    public int samplerMipLodBiasAt(long index) { return samplerMipLodBias(this.segment(), index); }
    /// Sets `samplerMipLodBias` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR samplerMipLodBiasAt(long index, int value) { samplerMipLodBias(this.segment(), index, value); return this; }

    /// {@return `separateStencilMaskRef` at the given index}
    /// @param index the index of the struct buffer
    public int separateStencilMaskRefAt(long index) { return separateStencilMaskRef(this.segment(), index); }
    /// Sets `separateStencilMaskRef` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR separateStencilMaskRefAt(long index, int value) { separateStencilMaskRef(this.segment(), index, value); return this; }

    /// {@return `shaderSampleRateInterpolationFunctions` at the given index}
    /// @param index the index of the struct buffer
    public int shaderSampleRateInterpolationFunctionsAt(long index) { return shaderSampleRateInterpolationFunctions(this.segment(), index); }
    /// Sets `shaderSampleRateInterpolationFunctions` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR shaderSampleRateInterpolationFunctionsAt(long index, int value) { shaderSampleRateInterpolationFunctions(this.segment(), index, value); return this; }

    /// {@return `tessellationIsolines` at the given index}
    /// @param index the index of the struct buffer
    public int tessellationIsolinesAt(long index) { return tessellationIsolines(this.segment(), index); }
    /// Sets `tessellationIsolines` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR tessellationIsolinesAt(long index, int value) { tessellationIsolines(this.segment(), index, value); return this; }

    /// {@return `tessellationPointMode` at the given index}
    /// @param index the index of the struct buffer
    public int tessellationPointModeAt(long index) { return tessellationPointMode(this.segment(), index); }
    /// Sets `tessellationPointMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR tessellationPointModeAt(long index, int value) { tessellationPointMode(this.segment(), index, value); return this; }

    /// {@return `triangleFans` at the given index}
    /// @param index the index of the struct buffer
    public int triangleFansAt(long index) { return triangleFans(this.segment(), index); }
    /// Sets `triangleFans` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR triangleFansAt(long index, int value) { triangleFans(this.segment(), index, value); return this; }

    /// {@return `vertexAttributeAccessBeyondStride` at the given index}
    /// @param index the index of the struct buffer
    public int vertexAttributeAccessBeyondStrideAt(long index) { return vertexAttributeAccessBeyondStride(this.segment(), index); }
    /// Sets `vertexAttributeAccessBeyondStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR vertexAttributeAccessBeyondStrideAt(long index, int value) { vertexAttributeAccessBeyondStride(this.segment(), index, value); return this; }

}
