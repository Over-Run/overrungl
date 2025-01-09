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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### constantAlphaColorBlendFactors
/// [VarHandle][#VH_constantAlphaColorBlendFactors] - [Getter][#constantAlphaColorBlendFactors()] - [Setter][#constantAlphaColorBlendFactors(int)]
/// ### events
/// [VarHandle][#VH_events] - [Getter][#events()] - [Setter][#events(int)]
/// ### imageViewFormatReinterpretation
/// [VarHandle][#VH_imageViewFormatReinterpretation] - [Getter][#imageViewFormatReinterpretation()] - [Setter][#imageViewFormatReinterpretation(int)]
/// ### imageViewFormatSwizzle
/// [VarHandle][#VH_imageViewFormatSwizzle] - [Getter][#imageViewFormatSwizzle()] - [Setter][#imageViewFormatSwizzle(int)]
/// ### imageView2DOn3DImage
/// [VarHandle][#VH_imageView2DOn3DImage] - [Getter][#imageView2DOn3DImage()] - [Setter][#imageView2DOn3DImage(int)]
/// ### multisampleArrayImage
/// [VarHandle][#VH_multisampleArrayImage] - [Getter][#multisampleArrayImage()] - [Setter][#multisampleArrayImage(int)]
/// ### mutableComparisonSamplers
/// [VarHandle][#VH_mutableComparisonSamplers] - [Getter][#mutableComparisonSamplers()] - [Setter][#mutableComparisonSamplers(int)]
/// ### pointPolygons
/// [VarHandle][#VH_pointPolygons] - [Getter][#pointPolygons()] - [Setter][#pointPolygons(int)]
/// ### samplerMipLodBias
/// [VarHandle][#VH_samplerMipLodBias] - [Getter][#samplerMipLodBias()] - [Setter][#samplerMipLodBias(int)]
/// ### separateStencilMaskRef
/// [VarHandle][#VH_separateStencilMaskRef] - [Getter][#separateStencilMaskRef()] - [Setter][#separateStencilMaskRef(int)]
/// ### shaderSampleRateInterpolationFunctions
/// [VarHandle][#VH_shaderSampleRateInterpolationFunctions] - [Getter][#shaderSampleRateInterpolationFunctions()] - [Setter][#shaderSampleRateInterpolationFunctions(int)]
/// ### tessellationIsolines
/// [VarHandle][#VH_tessellationIsolines] - [Getter][#tessellationIsolines()] - [Setter][#tessellationIsolines(int)]
/// ### tessellationPointMode
/// [VarHandle][#VH_tessellationPointMode] - [Getter][#tessellationPointMode()] - [Setter][#tessellationPointMode(int)]
/// ### triangleFans
/// [VarHandle][#VH_triangleFans] - [Getter][#triangleFans()] - [Setter][#triangleFans(int)]
/// ### vertexAttributeAccessBeyondStride
/// [VarHandle][#VH_vertexAttributeAccessBeyondStride] - [Getter][#vertexAttributeAccessBeyondStride()] - [Setter][#vertexAttributeAccessBeyondStride(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDevicePortabilitySubsetFeaturesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 constantAlphaColorBlendFactors;
///     VkBool32 events;
///     VkBool32 imageViewFormatReinterpretation;
///     VkBool32 imageViewFormatSwizzle;
///     VkBool32 imageView2DOn3DImage;
///     VkBool32 multisampleArrayImage;
///     VkBool32 mutableComparisonSamplers;
///     VkBool32 pointPolygons;
///     VkBool32 samplerMipLodBias;
///     VkBool32 separateStencilMaskRef;
///     VkBool32 shaderSampleRateInterpolationFunctions;
///     VkBool32 tessellationIsolines;
///     VkBool32 tessellationPointMode;
///     VkBool32 triangleFans;
///     VkBool32 vertexAttributeAccessBeyondStride;
/// } VkPhysicalDevicePortabilitySubsetFeaturesKHR;
/// ```
public final class VkPhysicalDevicePortabilitySubsetFeaturesKHR extends Struct {
    /// The struct layout of `VkPhysicalDevicePortabilitySubsetFeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
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
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `constantAlphaColorBlendFactors` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_constantAlphaColorBlendFactors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constantAlphaColorBlendFactors"));
    /// The [VarHandle] of `events` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_events = LAYOUT.arrayElementVarHandle(PathElement.groupElement("events"));
    /// The [VarHandle] of `imageViewFormatReinterpretation` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageViewFormatReinterpretation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageViewFormatReinterpretation"));
    /// The [VarHandle] of `imageViewFormatSwizzle` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageViewFormatSwizzle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageViewFormatSwizzle"));
    /// The [VarHandle] of `imageView2DOn3DImage` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageView2DOn3DImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageView2DOn3DImage"));
    /// The [VarHandle] of `multisampleArrayImage` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_multisampleArrayImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multisampleArrayImage"));
    /// The [VarHandle] of `mutableComparisonSamplers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_mutableComparisonSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mutableComparisonSamplers"));
    /// The [VarHandle] of `pointPolygons` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pointPolygons = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pointPolygons"));
    /// The [VarHandle] of `samplerMipLodBias` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_samplerMipLodBias = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerMipLodBias"));
    /// The [VarHandle] of `separateStencilMaskRef` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_separateStencilMaskRef = LAYOUT.arrayElementVarHandle(PathElement.groupElement("separateStencilMaskRef"));
    /// The [VarHandle] of `shaderSampleRateInterpolationFunctions` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSampleRateInterpolationFunctions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSampleRateInterpolationFunctions"));
    /// The [VarHandle] of `tessellationIsolines` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_tessellationIsolines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tessellationIsolines"));
    /// The [VarHandle] of `tessellationPointMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_tessellationPointMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tessellationPointMode"));
    /// The [VarHandle] of `triangleFans` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_triangleFans = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangleFans"));
    /// The [VarHandle] of `vertexAttributeAccessBeyondStride` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vertexAttributeAccessBeyondStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexAttributeAccessBeyondStride"));

    /// Creates `VkPhysicalDevicePortabilitySubsetFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDevicePortabilitySubsetFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePortabilitySubsetFeaturesKHR(segment); }

    /// Creates `VkPhysicalDevicePortabilitySubsetFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePortabilitySubsetFeaturesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDevicePortabilitySubsetFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePortabilitySubsetFeaturesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDevicePortabilitySubsetFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePortabilitySubsetFeaturesKHR`
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDevicePortabilitySubsetFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevicePortabilitySubsetFeaturesKHR`
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDevicePortabilitySubsetFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDevicePortabilitySubsetFeaturesKHR`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR asSlice(long index) { return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDevicePortabilitySubsetFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDevicePortabilitySubsetFeaturesKHR`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR sType(@CType("VkStructureType") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `constantAlphaColorBlendFactors` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_constantAlphaColorBlendFactors(MemorySegment segment, long index) { return (int) VH_constantAlphaColorBlendFactors.get(segment, 0L, index); }
    /// {@return `constantAlphaColorBlendFactors`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_constantAlphaColorBlendFactors(MemorySegment segment) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_constantAlphaColorBlendFactors(segment, 0L); }
    /// {@return `constantAlphaColorBlendFactors` at the given index}
    /// @param index the index
    public @CType("VkBool32") int constantAlphaColorBlendFactorsAt(long index) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_constantAlphaColorBlendFactors(this.segment(), index); }
    /// {@return `constantAlphaColorBlendFactors`}
    public @CType("VkBool32") int constantAlphaColorBlendFactors() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_constantAlphaColorBlendFactors(this.segment()); }
    /// Sets `constantAlphaColorBlendFactors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_constantAlphaColorBlendFactors(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_constantAlphaColorBlendFactors.set(segment, 0L, index, value); }
    /// Sets `constantAlphaColorBlendFactors` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_constantAlphaColorBlendFactors(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_constantAlphaColorBlendFactors(segment, 0L, value); }
    /// Sets `constantAlphaColorBlendFactors` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR constantAlphaColorBlendFactorsAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_constantAlphaColorBlendFactors(this.segment(), index, value); return this; }
    /// Sets `constantAlphaColorBlendFactors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR constantAlphaColorBlendFactors(@CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_constantAlphaColorBlendFactors(this.segment(), value); return this; }

    /// {@return `events` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_events(MemorySegment segment, long index) { return (int) VH_events.get(segment, 0L, index); }
    /// {@return `events`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_events(MemorySegment segment) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_events(segment, 0L); }
    /// {@return `events` at the given index}
    /// @param index the index
    public @CType("VkBool32") int eventsAt(long index) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_events(this.segment(), index); }
    /// {@return `events`}
    public @CType("VkBool32") int events() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_events(this.segment()); }
    /// Sets `events` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_events(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_events.set(segment, 0L, index, value); }
    /// Sets `events` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_events(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_events(segment, 0L, value); }
    /// Sets `events` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR eventsAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_events(this.segment(), index, value); return this; }
    /// Sets `events` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR events(@CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_events(this.segment(), value); return this; }

    /// {@return `imageViewFormatReinterpretation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_imageViewFormatReinterpretation(MemorySegment segment, long index) { return (int) VH_imageViewFormatReinterpretation.get(segment, 0L, index); }
    /// {@return `imageViewFormatReinterpretation`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_imageViewFormatReinterpretation(MemorySegment segment) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_imageViewFormatReinterpretation(segment, 0L); }
    /// {@return `imageViewFormatReinterpretation` at the given index}
    /// @param index the index
    public @CType("VkBool32") int imageViewFormatReinterpretationAt(long index) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_imageViewFormatReinterpretation(this.segment(), index); }
    /// {@return `imageViewFormatReinterpretation`}
    public @CType("VkBool32") int imageViewFormatReinterpretation() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_imageViewFormatReinterpretation(this.segment()); }
    /// Sets `imageViewFormatReinterpretation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageViewFormatReinterpretation(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_imageViewFormatReinterpretation.set(segment, 0L, index, value); }
    /// Sets `imageViewFormatReinterpretation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageViewFormatReinterpretation(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_imageViewFormatReinterpretation(segment, 0L, value); }
    /// Sets `imageViewFormatReinterpretation` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageViewFormatReinterpretationAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_imageViewFormatReinterpretation(this.segment(), index, value); return this; }
    /// Sets `imageViewFormatReinterpretation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageViewFormatReinterpretation(@CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_imageViewFormatReinterpretation(this.segment(), value); return this; }

    /// {@return `imageViewFormatSwizzle` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_imageViewFormatSwizzle(MemorySegment segment, long index) { return (int) VH_imageViewFormatSwizzle.get(segment, 0L, index); }
    /// {@return `imageViewFormatSwizzle`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_imageViewFormatSwizzle(MemorySegment segment) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_imageViewFormatSwizzle(segment, 0L); }
    /// {@return `imageViewFormatSwizzle` at the given index}
    /// @param index the index
    public @CType("VkBool32") int imageViewFormatSwizzleAt(long index) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_imageViewFormatSwizzle(this.segment(), index); }
    /// {@return `imageViewFormatSwizzle`}
    public @CType("VkBool32") int imageViewFormatSwizzle() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_imageViewFormatSwizzle(this.segment()); }
    /// Sets `imageViewFormatSwizzle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageViewFormatSwizzle(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_imageViewFormatSwizzle.set(segment, 0L, index, value); }
    /// Sets `imageViewFormatSwizzle` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageViewFormatSwizzle(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_imageViewFormatSwizzle(segment, 0L, value); }
    /// Sets `imageViewFormatSwizzle` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageViewFormatSwizzleAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_imageViewFormatSwizzle(this.segment(), index, value); return this; }
    /// Sets `imageViewFormatSwizzle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageViewFormatSwizzle(@CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_imageViewFormatSwizzle(this.segment(), value); return this; }

    /// {@return `imageView2DOn3DImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_imageView2DOn3DImage(MemorySegment segment, long index) { return (int) VH_imageView2DOn3DImage.get(segment, 0L, index); }
    /// {@return `imageView2DOn3DImage`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_imageView2DOn3DImage(MemorySegment segment) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_imageView2DOn3DImage(segment, 0L); }
    /// {@return `imageView2DOn3DImage` at the given index}
    /// @param index the index
    public @CType("VkBool32") int imageView2DOn3DImageAt(long index) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_imageView2DOn3DImage(this.segment(), index); }
    /// {@return `imageView2DOn3DImage`}
    public @CType("VkBool32") int imageView2DOn3DImage() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_imageView2DOn3DImage(this.segment()); }
    /// Sets `imageView2DOn3DImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageView2DOn3DImage(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_imageView2DOn3DImage.set(segment, 0L, index, value); }
    /// Sets `imageView2DOn3DImage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageView2DOn3DImage(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_imageView2DOn3DImage(segment, 0L, value); }
    /// Sets `imageView2DOn3DImage` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageView2DOn3DImageAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_imageView2DOn3DImage(this.segment(), index, value); return this; }
    /// Sets `imageView2DOn3DImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageView2DOn3DImage(@CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_imageView2DOn3DImage(this.segment(), value); return this; }

    /// {@return `multisampleArrayImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_multisampleArrayImage(MemorySegment segment, long index) { return (int) VH_multisampleArrayImage.get(segment, 0L, index); }
    /// {@return `multisampleArrayImage`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_multisampleArrayImage(MemorySegment segment) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_multisampleArrayImage(segment, 0L); }
    /// {@return `multisampleArrayImage` at the given index}
    /// @param index the index
    public @CType("VkBool32") int multisampleArrayImageAt(long index) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_multisampleArrayImage(this.segment(), index); }
    /// {@return `multisampleArrayImage`}
    public @CType("VkBool32") int multisampleArrayImage() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_multisampleArrayImage(this.segment()); }
    /// Sets `multisampleArrayImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_multisampleArrayImage(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_multisampleArrayImage.set(segment, 0L, index, value); }
    /// Sets `multisampleArrayImage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_multisampleArrayImage(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_multisampleArrayImage(segment, 0L, value); }
    /// Sets `multisampleArrayImage` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR multisampleArrayImageAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_multisampleArrayImage(this.segment(), index, value); return this; }
    /// Sets `multisampleArrayImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR multisampleArrayImage(@CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_multisampleArrayImage(this.segment(), value); return this; }

    /// {@return `mutableComparisonSamplers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_mutableComparisonSamplers(MemorySegment segment, long index) { return (int) VH_mutableComparisonSamplers.get(segment, 0L, index); }
    /// {@return `mutableComparisonSamplers`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_mutableComparisonSamplers(MemorySegment segment) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_mutableComparisonSamplers(segment, 0L); }
    /// {@return `mutableComparisonSamplers` at the given index}
    /// @param index the index
    public @CType("VkBool32") int mutableComparisonSamplersAt(long index) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_mutableComparisonSamplers(this.segment(), index); }
    /// {@return `mutableComparisonSamplers`}
    public @CType("VkBool32") int mutableComparisonSamplers() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_mutableComparisonSamplers(this.segment()); }
    /// Sets `mutableComparisonSamplers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mutableComparisonSamplers(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_mutableComparisonSamplers.set(segment, 0L, index, value); }
    /// Sets `mutableComparisonSamplers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mutableComparisonSamplers(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_mutableComparisonSamplers(segment, 0L, value); }
    /// Sets `mutableComparisonSamplers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR mutableComparisonSamplersAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_mutableComparisonSamplers(this.segment(), index, value); return this; }
    /// Sets `mutableComparisonSamplers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR mutableComparisonSamplers(@CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_mutableComparisonSamplers(this.segment(), value); return this; }

    /// {@return `pointPolygons` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_pointPolygons(MemorySegment segment, long index) { return (int) VH_pointPolygons.get(segment, 0L, index); }
    /// {@return `pointPolygons`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_pointPolygons(MemorySegment segment) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_pointPolygons(segment, 0L); }
    /// {@return `pointPolygons` at the given index}
    /// @param index the index
    public @CType("VkBool32") int pointPolygonsAt(long index) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_pointPolygons(this.segment(), index); }
    /// {@return `pointPolygons`}
    public @CType("VkBool32") int pointPolygons() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_pointPolygons(this.segment()); }
    /// Sets `pointPolygons` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pointPolygons(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_pointPolygons.set(segment, 0L, index, value); }
    /// Sets `pointPolygons` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pointPolygons(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_pointPolygons(segment, 0L, value); }
    /// Sets `pointPolygons` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR pointPolygonsAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_pointPolygons(this.segment(), index, value); return this; }
    /// Sets `pointPolygons` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR pointPolygons(@CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_pointPolygons(this.segment(), value); return this; }

    /// {@return `samplerMipLodBias` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_samplerMipLodBias(MemorySegment segment, long index) { return (int) VH_samplerMipLodBias.get(segment, 0L, index); }
    /// {@return `samplerMipLodBias`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_samplerMipLodBias(MemorySegment segment) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_samplerMipLodBias(segment, 0L); }
    /// {@return `samplerMipLodBias` at the given index}
    /// @param index the index
    public @CType("VkBool32") int samplerMipLodBiasAt(long index) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_samplerMipLodBias(this.segment(), index); }
    /// {@return `samplerMipLodBias`}
    public @CType("VkBool32") int samplerMipLodBias() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_samplerMipLodBias(this.segment()); }
    /// Sets `samplerMipLodBias` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_samplerMipLodBias(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_samplerMipLodBias.set(segment, 0L, index, value); }
    /// Sets `samplerMipLodBias` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_samplerMipLodBias(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_samplerMipLodBias(segment, 0L, value); }
    /// Sets `samplerMipLodBias` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR samplerMipLodBiasAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_samplerMipLodBias(this.segment(), index, value); return this; }
    /// Sets `samplerMipLodBias` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR samplerMipLodBias(@CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_samplerMipLodBias(this.segment(), value); return this; }

    /// {@return `separateStencilMaskRef` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_separateStencilMaskRef(MemorySegment segment, long index) { return (int) VH_separateStencilMaskRef.get(segment, 0L, index); }
    /// {@return `separateStencilMaskRef`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_separateStencilMaskRef(MemorySegment segment) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_separateStencilMaskRef(segment, 0L); }
    /// {@return `separateStencilMaskRef` at the given index}
    /// @param index the index
    public @CType("VkBool32") int separateStencilMaskRefAt(long index) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_separateStencilMaskRef(this.segment(), index); }
    /// {@return `separateStencilMaskRef`}
    public @CType("VkBool32") int separateStencilMaskRef() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_separateStencilMaskRef(this.segment()); }
    /// Sets `separateStencilMaskRef` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_separateStencilMaskRef(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_separateStencilMaskRef.set(segment, 0L, index, value); }
    /// Sets `separateStencilMaskRef` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_separateStencilMaskRef(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_separateStencilMaskRef(segment, 0L, value); }
    /// Sets `separateStencilMaskRef` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR separateStencilMaskRefAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_separateStencilMaskRef(this.segment(), index, value); return this; }
    /// Sets `separateStencilMaskRef` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR separateStencilMaskRef(@CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_separateStencilMaskRef(this.segment(), value); return this; }

    /// {@return `shaderSampleRateInterpolationFunctions` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSampleRateInterpolationFunctions(MemorySegment segment, long index) { return (int) VH_shaderSampleRateInterpolationFunctions.get(segment, 0L, index); }
    /// {@return `shaderSampleRateInterpolationFunctions`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSampleRateInterpolationFunctions(MemorySegment segment) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_shaderSampleRateInterpolationFunctions(segment, 0L); }
    /// {@return `shaderSampleRateInterpolationFunctions` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderSampleRateInterpolationFunctionsAt(long index) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_shaderSampleRateInterpolationFunctions(this.segment(), index); }
    /// {@return `shaderSampleRateInterpolationFunctions`}
    public @CType("VkBool32") int shaderSampleRateInterpolationFunctions() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_shaderSampleRateInterpolationFunctions(this.segment()); }
    /// Sets `shaderSampleRateInterpolationFunctions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSampleRateInterpolationFunctions(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSampleRateInterpolationFunctions.set(segment, 0L, index, value); }
    /// Sets `shaderSampleRateInterpolationFunctions` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSampleRateInterpolationFunctions(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_shaderSampleRateInterpolationFunctions(segment, 0L, value); }
    /// Sets `shaderSampleRateInterpolationFunctions` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR shaderSampleRateInterpolationFunctionsAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_shaderSampleRateInterpolationFunctions(this.segment(), index, value); return this; }
    /// Sets `shaderSampleRateInterpolationFunctions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR shaderSampleRateInterpolationFunctions(@CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_shaderSampleRateInterpolationFunctions(this.segment(), value); return this; }

    /// {@return `tessellationIsolines` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_tessellationIsolines(MemorySegment segment, long index) { return (int) VH_tessellationIsolines.get(segment, 0L, index); }
    /// {@return `tessellationIsolines`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_tessellationIsolines(MemorySegment segment) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_tessellationIsolines(segment, 0L); }
    /// {@return `tessellationIsolines` at the given index}
    /// @param index the index
    public @CType("VkBool32") int tessellationIsolinesAt(long index) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_tessellationIsolines(this.segment(), index); }
    /// {@return `tessellationIsolines`}
    public @CType("VkBool32") int tessellationIsolines() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_tessellationIsolines(this.segment()); }
    /// Sets `tessellationIsolines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tessellationIsolines(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_tessellationIsolines.set(segment, 0L, index, value); }
    /// Sets `tessellationIsolines` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tessellationIsolines(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_tessellationIsolines(segment, 0L, value); }
    /// Sets `tessellationIsolines` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR tessellationIsolinesAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_tessellationIsolines(this.segment(), index, value); return this; }
    /// Sets `tessellationIsolines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR tessellationIsolines(@CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_tessellationIsolines(this.segment(), value); return this; }

    /// {@return `tessellationPointMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_tessellationPointMode(MemorySegment segment, long index) { return (int) VH_tessellationPointMode.get(segment, 0L, index); }
    /// {@return `tessellationPointMode`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_tessellationPointMode(MemorySegment segment) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_tessellationPointMode(segment, 0L); }
    /// {@return `tessellationPointMode` at the given index}
    /// @param index the index
    public @CType("VkBool32") int tessellationPointModeAt(long index) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_tessellationPointMode(this.segment(), index); }
    /// {@return `tessellationPointMode`}
    public @CType("VkBool32") int tessellationPointMode() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_tessellationPointMode(this.segment()); }
    /// Sets `tessellationPointMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tessellationPointMode(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_tessellationPointMode.set(segment, 0L, index, value); }
    /// Sets `tessellationPointMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tessellationPointMode(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_tessellationPointMode(segment, 0L, value); }
    /// Sets `tessellationPointMode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR tessellationPointModeAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_tessellationPointMode(this.segment(), index, value); return this; }
    /// Sets `tessellationPointMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR tessellationPointMode(@CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_tessellationPointMode(this.segment(), value); return this; }

    /// {@return `triangleFans` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_triangleFans(MemorySegment segment, long index) { return (int) VH_triangleFans.get(segment, 0L, index); }
    /// {@return `triangleFans`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_triangleFans(MemorySegment segment) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_triangleFans(segment, 0L); }
    /// {@return `triangleFans` at the given index}
    /// @param index the index
    public @CType("VkBool32") int triangleFansAt(long index) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_triangleFans(this.segment(), index); }
    /// {@return `triangleFans`}
    public @CType("VkBool32") int triangleFans() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_triangleFans(this.segment()); }
    /// Sets `triangleFans` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_triangleFans(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_triangleFans.set(segment, 0L, index, value); }
    /// Sets `triangleFans` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_triangleFans(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_triangleFans(segment, 0L, value); }
    /// Sets `triangleFans` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR triangleFansAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_triangleFans(this.segment(), index, value); return this; }
    /// Sets `triangleFans` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR triangleFans(@CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_triangleFans(this.segment(), value); return this; }

    /// {@return `vertexAttributeAccessBeyondStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_vertexAttributeAccessBeyondStride(MemorySegment segment, long index) { return (int) VH_vertexAttributeAccessBeyondStride.get(segment, 0L, index); }
    /// {@return `vertexAttributeAccessBeyondStride`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_vertexAttributeAccessBeyondStride(MemorySegment segment) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_vertexAttributeAccessBeyondStride(segment, 0L); }
    /// {@return `vertexAttributeAccessBeyondStride` at the given index}
    /// @param index the index
    public @CType("VkBool32") int vertexAttributeAccessBeyondStrideAt(long index) { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_vertexAttributeAccessBeyondStride(this.segment(), index); }
    /// {@return `vertexAttributeAccessBeyondStride`}
    public @CType("VkBool32") int vertexAttributeAccessBeyondStride() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.get_vertexAttributeAccessBeyondStride(this.segment()); }
    /// Sets `vertexAttributeAccessBeyondStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexAttributeAccessBeyondStride(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_vertexAttributeAccessBeyondStride.set(segment, 0L, index, value); }
    /// Sets `vertexAttributeAccessBeyondStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexAttributeAccessBeyondStride(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_vertexAttributeAccessBeyondStride(segment, 0L, value); }
    /// Sets `vertexAttributeAccessBeyondStride` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR vertexAttributeAccessBeyondStrideAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_vertexAttributeAccessBeyondStride(this.segment(), index, value); return this; }
    /// Sets `vertexAttributeAccessBeyondStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR vertexAttributeAccessBeyondStride(@CType("VkBool32") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.set_vertexAttributeAccessBeyondStride(this.segment(), value); return this; }

}
