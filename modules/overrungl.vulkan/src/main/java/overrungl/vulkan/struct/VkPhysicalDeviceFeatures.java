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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### robustBufferAccess
/// [VarHandle][#VH_robustBufferAccess] - [Getter][#robustBufferAccess()] - [Setter][#robustBufferAccess(int)]
/// ### fullDrawIndexUint32
/// [VarHandle][#VH_fullDrawIndexUint32] - [Getter][#fullDrawIndexUint32()] - [Setter][#fullDrawIndexUint32(int)]
/// ### imageCubeArray
/// [VarHandle][#VH_imageCubeArray] - [Getter][#imageCubeArray()] - [Setter][#imageCubeArray(int)]
/// ### independentBlend
/// [VarHandle][#VH_independentBlend] - [Getter][#independentBlend()] - [Setter][#independentBlend(int)]
/// ### geometryShader
/// [VarHandle][#VH_geometryShader] - [Getter][#geometryShader()] - [Setter][#geometryShader(int)]
/// ### tessellationShader
/// [VarHandle][#VH_tessellationShader] - [Getter][#tessellationShader()] - [Setter][#tessellationShader(int)]
/// ### sampleRateShading
/// [VarHandle][#VH_sampleRateShading] - [Getter][#sampleRateShading()] - [Setter][#sampleRateShading(int)]
/// ### dualSrcBlend
/// [VarHandle][#VH_dualSrcBlend] - [Getter][#dualSrcBlend()] - [Setter][#dualSrcBlend(int)]
/// ### logicOp
/// [VarHandle][#VH_logicOp] - [Getter][#logicOp()] - [Setter][#logicOp(int)]
/// ### multiDrawIndirect
/// [VarHandle][#VH_multiDrawIndirect] - [Getter][#multiDrawIndirect()] - [Setter][#multiDrawIndirect(int)]
/// ### drawIndirectFirstInstance
/// [VarHandle][#VH_drawIndirectFirstInstance] - [Getter][#drawIndirectFirstInstance()] - [Setter][#drawIndirectFirstInstance(int)]
/// ### depthClamp
/// [VarHandle][#VH_depthClamp] - [Getter][#depthClamp()] - [Setter][#depthClamp(int)]
/// ### depthBiasClamp
/// [VarHandle][#VH_depthBiasClamp] - [Getter][#depthBiasClamp()] - [Setter][#depthBiasClamp(int)]
/// ### fillModeNonSolid
/// [VarHandle][#VH_fillModeNonSolid] - [Getter][#fillModeNonSolid()] - [Setter][#fillModeNonSolid(int)]
/// ### depthBounds
/// [VarHandle][#VH_depthBounds] - [Getter][#depthBounds()] - [Setter][#depthBounds(int)]
/// ### wideLines
/// [VarHandle][#VH_wideLines] - [Getter][#wideLines()] - [Setter][#wideLines(int)]
/// ### largePoints
/// [VarHandle][#VH_largePoints] - [Getter][#largePoints()] - [Setter][#largePoints(int)]
/// ### alphaToOne
/// [VarHandle][#VH_alphaToOne] - [Getter][#alphaToOne()] - [Setter][#alphaToOne(int)]
/// ### multiViewport
/// [VarHandle][#VH_multiViewport] - [Getter][#multiViewport()] - [Setter][#multiViewport(int)]
/// ### samplerAnisotropy
/// [VarHandle][#VH_samplerAnisotropy] - [Getter][#samplerAnisotropy()] - [Setter][#samplerAnisotropy(int)]
/// ### textureCompressionETC2
/// [VarHandle][#VH_textureCompressionETC2] - [Getter][#textureCompressionETC2()] - [Setter][#textureCompressionETC2(int)]
/// ### textureCompressionASTC_LDR
/// [VarHandle][#VH_textureCompressionASTC_LDR] - [Getter][#textureCompressionASTC_LDR()] - [Setter][#textureCompressionASTC_LDR(int)]
/// ### textureCompressionBC
/// [VarHandle][#VH_textureCompressionBC] - [Getter][#textureCompressionBC()] - [Setter][#textureCompressionBC(int)]
/// ### occlusionQueryPrecise
/// [VarHandle][#VH_occlusionQueryPrecise] - [Getter][#occlusionQueryPrecise()] - [Setter][#occlusionQueryPrecise(int)]
/// ### pipelineStatisticsQuery
/// [VarHandle][#VH_pipelineStatisticsQuery] - [Getter][#pipelineStatisticsQuery()] - [Setter][#pipelineStatisticsQuery(int)]
/// ### vertexPipelineStoresAndAtomics
/// [VarHandle][#VH_vertexPipelineStoresAndAtomics] - [Getter][#vertexPipelineStoresAndAtomics()] - [Setter][#vertexPipelineStoresAndAtomics(int)]
/// ### fragmentStoresAndAtomics
/// [VarHandle][#VH_fragmentStoresAndAtomics] - [Getter][#fragmentStoresAndAtomics()] - [Setter][#fragmentStoresAndAtomics(int)]
/// ### shaderTessellationAndGeometryPointSize
/// [VarHandle][#VH_shaderTessellationAndGeometryPointSize] - [Getter][#shaderTessellationAndGeometryPointSize()] - [Setter][#shaderTessellationAndGeometryPointSize(int)]
/// ### shaderImageGatherExtended
/// [VarHandle][#VH_shaderImageGatherExtended] - [Getter][#shaderImageGatherExtended()] - [Setter][#shaderImageGatherExtended(int)]
/// ### shaderStorageImageExtendedFormats
/// [VarHandle][#VH_shaderStorageImageExtendedFormats] - [Getter][#shaderStorageImageExtendedFormats()] - [Setter][#shaderStorageImageExtendedFormats(int)]
/// ### shaderStorageImageMultisample
/// [VarHandle][#VH_shaderStorageImageMultisample] - [Getter][#shaderStorageImageMultisample()] - [Setter][#shaderStorageImageMultisample(int)]
/// ### shaderStorageImageReadWithoutFormat
/// [VarHandle][#VH_shaderStorageImageReadWithoutFormat] - [Getter][#shaderStorageImageReadWithoutFormat()] - [Setter][#shaderStorageImageReadWithoutFormat(int)]
/// ### shaderStorageImageWriteWithoutFormat
/// [VarHandle][#VH_shaderStorageImageWriteWithoutFormat] - [Getter][#shaderStorageImageWriteWithoutFormat()] - [Setter][#shaderStorageImageWriteWithoutFormat(int)]
/// ### shaderUniformBufferArrayDynamicIndexing
/// [VarHandle][#VH_shaderUniformBufferArrayDynamicIndexing] - [Getter][#shaderUniformBufferArrayDynamicIndexing()] - [Setter][#shaderUniformBufferArrayDynamicIndexing(int)]
/// ### shaderSampledImageArrayDynamicIndexing
/// [VarHandle][#VH_shaderSampledImageArrayDynamicIndexing] - [Getter][#shaderSampledImageArrayDynamicIndexing()] - [Setter][#shaderSampledImageArrayDynamicIndexing(int)]
/// ### shaderStorageBufferArrayDynamicIndexing
/// [VarHandle][#VH_shaderStorageBufferArrayDynamicIndexing] - [Getter][#shaderStorageBufferArrayDynamicIndexing()] - [Setter][#shaderStorageBufferArrayDynamicIndexing(int)]
/// ### shaderStorageImageArrayDynamicIndexing
/// [VarHandle][#VH_shaderStorageImageArrayDynamicIndexing] - [Getter][#shaderStorageImageArrayDynamicIndexing()] - [Setter][#shaderStorageImageArrayDynamicIndexing(int)]
/// ### shaderClipDistance
/// [VarHandle][#VH_shaderClipDistance] - [Getter][#shaderClipDistance()] - [Setter][#shaderClipDistance(int)]
/// ### shaderCullDistance
/// [VarHandle][#VH_shaderCullDistance] - [Getter][#shaderCullDistance()] - [Setter][#shaderCullDistance(int)]
/// ### shaderFloat64
/// [VarHandle][#VH_shaderFloat64] - [Getter][#shaderFloat64()] - [Setter][#shaderFloat64(int)]
/// ### shaderInt64
/// [VarHandle][#VH_shaderInt64] - [Getter][#shaderInt64()] - [Setter][#shaderInt64(int)]
/// ### shaderInt16
/// [VarHandle][#VH_shaderInt16] - [Getter][#shaderInt16()] - [Setter][#shaderInt16(int)]
/// ### shaderResourceResidency
/// [VarHandle][#VH_shaderResourceResidency] - [Getter][#shaderResourceResidency()] - [Setter][#shaderResourceResidency(int)]
/// ### shaderResourceMinLod
/// [VarHandle][#VH_shaderResourceMinLod] - [Getter][#shaderResourceMinLod()] - [Setter][#shaderResourceMinLod(int)]
/// ### sparseBinding
/// [VarHandle][#VH_sparseBinding] - [Getter][#sparseBinding()] - [Setter][#sparseBinding(int)]
/// ### sparseResidencyBuffer
/// [VarHandle][#VH_sparseResidencyBuffer] - [Getter][#sparseResidencyBuffer()] - [Setter][#sparseResidencyBuffer(int)]
/// ### sparseResidencyImage2D
/// [VarHandle][#VH_sparseResidencyImage2D] - [Getter][#sparseResidencyImage2D()] - [Setter][#sparseResidencyImage2D(int)]
/// ### sparseResidencyImage3D
/// [VarHandle][#VH_sparseResidencyImage3D] - [Getter][#sparseResidencyImage3D()] - [Setter][#sparseResidencyImage3D(int)]
/// ### sparseResidency2Samples
/// [VarHandle][#VH_sparseResidency2Samples] - [Getter][#sparseResidency2Samples()] - [Setter][#sparseResidency2Samples(int)]
/// ### sparseResidency4Samples
/// [VarHandle][#VH_sparseResidency4Samples] - [Getter][#sparseResidency4Samples()] - [Setter][#sparseResidency4Samples(int)]
/// ### sparseResidency8Samples
/// [VarHandle][#VH_sparseResidency8Samples] - [Getter][#sparseResidency8Samples()] - [Setter][#sparseResidency8Samples(int)]
/// ### sparseResidency16Samples
/// [VarHandle][#VH_sparseResidency16Samples] - [Getter][#sparseResidency16Samples()] - [Setter][#sparseResidency16Samples(int)]
/// ### sparseResidencyAliased
/// [VarHandle][#VH_sparseResidencyAliased] - [Getter][#sparseResidencyAliased()] - [Setter][#sparseResidencyAliased(int)]
/// ### variableMultisampleRate
/// [VarHandle][#VH_variableMultisampleRate] - [Getter][#variableMultisampleRate()] - [Setter][#variableMultisampleRate(int)]
/// ### inheritedQueries
/// [VarHandle][#VH_inheritedQueries] - [Getter][#inheritedQueries()] - [Setter][#inheritedQueries(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceFeatures {
///     VkBool32 robustBufferAccess;
///     VkBool32 fullDrawIndexUint32;
///     VkBool32 imageCubeArray;
///     VkBool32 independentBlend;
///     VkBool32 geometryShader;
///     VkBool32 tessellationShader;
///     VkBool32 sampleRateShading;
///     VkBool32 dualSrcBlend;
///     VkBool32 logicOp;
///     VkBool32 multiDrawIndirect;
///     VkBool32 drawIndirectFirstInstance;
///     VkBool32 depthClamp;
///     VkBool32 depthBiasClamp;
///     VkBool32 fillModeNonSolid;
///     VkBool32 depthBounds;
///     VkBool32 wideLines;
///     VkBool32 largePoints;
///     VkBool32 alphaToOne;
///     VkBool32 multiViewport;
///     VkBool32 samplerAnisotropy;
///     VkBool32 textureCompressionETC2;
///     VkBool32 textureCompressionASTC_LDR;
///     VkBool32 textureCompressionBC;
///     VkBool32 occlusionQueryPrecise;
///     VkBool32 pipelineStatisticsQuery;
///     VkBool32 vertexPipelineStoresAndAtomics;
///     VkBool32 fragmentStoresAndAtomics;
///     VkBool32 shaderTessellationAndGeometryPointSize;
///     VkBool32 shaderImageGatherExtended;
///     VkBool32 shaderStorageImageExtendedFormats;
///     VkBool32 shaderStorageImageMultisample;
///     VkBool32 shaderStorageImageReadWithoutFormat;
///     VkBool32 shaderStorageImageWriteWithoutFormat;
///     VkBool32 shaderUniformBufferArrayDynamicIndexing;
///     VkBool32 shaderSampledImageArrayDynamicIndexing;
///     VkBool32 shaderStorageBufferArrayDynamicIndexing;
///     VkBool32 shaderStorageImageArrayDynamicIndexing;
///     VkBool32 shaderClipDistance;
///     VkBool32 shaderCullDistance;
///     VkBool32 shaderFloat64;
///     VkBool32 shaderInt64;
///     VkBool32 shaderInt16;
///     VkBool32 shaderResourceResidency;
///     VkBool32 shaderResourceMinLod;
///     VkBool32 sparseBinding;
///     VkBool32 sparseResidencyBuffer;
///     VkBool32 sparseResidencyImage2D;
///     VkBool32 sparseResidencyImage3D;
///     VkBool32 sparseResidency2Samples;
///     VkBool32 sparseResidency4Samples;
///     VkBool32 sparseResidency8Samples;
///     VkBool32 sparseResidency16Samples;
///     VkBool32 sparseResidencyAliased;
///     VkBool32 variableMultisampleRate;
///     VkBool32 inheritedQueries;
/// } VkPhysicalDeviceFeatures;
/// ```
public final class VkPhysicalDeviceFeatures extends Struct {
    /// The struct layout of `VkPhysicalDeviceFeatures`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("robustBufferAccess"),
        ValueLayout.JAVA_INT.withName("fullDrawIndexUint32"),
        ValueLayout.JAVA_INT.withName("imageCubeArray"),
        ValueLayout.JAVA_INT.withName("independentBlend"),
        ValueLayout.JAVA_INT.withName("geometryShader"),
        ValueLayout.JAVA_INT.withName("tessellationShader"),
        ValueLayout.JAVA_INT.withName("sampleRateShading"),
        ValueLayout.JAVA_INT.withName("dualSrcBlend"),
        ValueLayout.JAVA_INT.withName("logicOp"),
        ValueLayout.JAVA_INT.withName("multiDrawIndirect"),
        ValueLayout.JAVA_INT.withName("drawIndirectFirstInstance"),
        ValueLayout.JAVA_INT.withName("depthClamp"),
        ValueLayout.JAVA_INT.withName("depthBiasClamp"),
        ValueLayout.JAVA_INT.withName("fillModeNonSolid"),
        ValueLayout.JAVA_INT.withName("depthBounds"),
        ValueLayout.JAVA_INT.withName("wideLines"),
        ValueLayout.JAVA_INT.withName("largePoints"),
        ValueLayout.JAVA_INT.withName("alphaToOne"),
        ValueLayout.JAVA_INT.withName("multiViewport"),
        ValueLayout.JAVA_INT.withName("samplerAnisotropy"),
        ValueLayout.JAVA_INT.withName("textureCompressionETC2"),
        ValueLayout.JAVA_INT.withName("textureCompressionASTC_LDR"),
        ValueLayout.JAVA_INT.withName("textureCompressionBC"),
        ValueLayout.JAVA_INT.withName("occlusionQueryPrecise"),
        ValueLayout.JAVA_INT.withName("pipelineStatisticsQuery"),
        ValueLayout.JAVA_INT.withName("vertexPipelineStoresAndAtomics"),
        ValueLayout.JAVA_INT.withName("fragmentStoresAndAtomics"),
        ValueLayout.JAVA_INT.withName("shaderTessellationAndGeometryPointSize"),
        ValueLayout.JAVA_INT.withName("shaderImageGatherExtended"),
        ValueLayout.JAVA_INT.withName("shaderStorageImageExtendedFormats"),
        ValueLayout.JAVA_INT.withName("shaderStorageImageMultisample"),
        ValueLayout.JAVA_INT.withName("shaderStorageImageReadWithoutFormat"),
        ValueLayout.JAVA_INT.withName("shaderStorageImageWriteWithoutFormat"),
        ValueLayout.JAVA_INT.withName("shaderUniformBufferArrayDynamicIndexing"),
        ValueLayout.JAVA_INT.withName("shaderSampledImageArrayDynamicIndexing"),
        ValueLayout.JAVA_INT.withName("shaderStorageBufferArrayDynamicIndexing"),
        ValueLayout.JAVA_INT.withName("shaderStorageImageArrayDynamicIndexing"),
        ValueLayout.JAVA_INT.withName("shaderClipDistance"),
        ValueLayout.JAVA_INT.withName("shaderCullDistance"),
        ValueLayout.JAVA_INT.withName("shaderFloat64"),
        ValueLayout.JAVA_INT.withName("shaderInt64"),
        ValueLayout.JAVA_INT.withName("shaderInt16"),
        ValueLayout.JAVA_INT.withName("shaderResourceResidency"),
        ValueLayout.JAVA_INT.withName("shaderResourceMinLod"),
        ValueLayout.JAVA_INT.withName("sparseBinding"),
        ValueLayout.JAVA_INT.withName("sparseResidencyBuffer"),
        ValueLayout.JAVA_INT.withName("sparseResidencyImage2D"),
        ValueLayout.JAVA_INT.withName("sparseResidencyImage3D"),
        ValueLayout.JAVA_INT.withName("sparseResidency2Samples"),
        ValueLayout.JAVA_INT.withName("sparseResidency4Samples"),
        ValueLayout.JAVA_INT.withName("sparseResidency8Samples"),
        ValueLayout.JAVA_INT.withName("sparseResidency16Samples"),
        ValueLayout.JAVA_INT.withName("sparseResidencyAliased"),
        ValueLayout.JAVA_INT.withName("variableMultisampleRate"),
        ValueLayout.JAVA_INT.withName("inheritedQueries")
    );
    /// The [VarHandle] of `robustBufferAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_robustBufferAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustBufferAccess"));
    /// The [VarHandle] of `fullDrawIndexUint32` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fullDrawIndexUint32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fullDrawIndexUint32"));
    /// The [VarHandle] of `imageCubeArray` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageCubeArray = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCubeArray"));
    /// The [VarHandle] of `independentBlend` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_independentBlend = LAYOUT.arrayElementVarHandle(PathElement.groupElement("independentBlend"));
    /// The [VarHandle] of `geometryShader` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_geometryShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometryShader"));
    /// The [VarHandle] of `tessellationShader` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_tessellationShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tessellationShader"));
    /// The [VarHandle] of `sampleRateShading` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sampleRateShading = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleRateShading"));
    /// The [VarHandle] of `dualSrcBlend` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dualSrcBlend = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dualSrcBlend"));
    /// The [VarHandle] of `logicOp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_logicOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("logicOp"));
    /// The [VarHandle] of `multiDrawIndirect` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_multiDrawIndirect = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiDrawIndirect"));
    /// The [VarHandle] of `drawIndirectFirstInstance` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_drawIndirectFirstInstance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drawIndirectFirstInstance"));
    /// The [VarHandle] of `depthClamp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depthClamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthClamp"));
    /// The [VarHandle] of `depthBiasClamp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depthBiasClamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasClamp"));
    /// The [VarHandle] of `fillModeNonSolid` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fillModeNonSolid = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fillModeNonSolid"));
    /// The [VarHandle] of `depthBounds` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depthBounds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBounds"));
    /// The [VarHandle] of `wideLines` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_wideLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("wideLines"));
    /// The [VarHandle] of `largePoints` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_largePoints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("largePoints"));
    /// The [VarHandle] of `alphaToOne` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_alphaToOne = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alphaToOne"));
    /// The [VarHandle] of `multiViewport` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_multiViewport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiViewport"));
    /// The [VarHandle] of `samplerAnisotropy` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_samplerAnisotropy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerAnisotropy"));
    /// The [VarHandle] of `textureCompressionETC2` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_textureCompressionETC2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("textureCompressionETC2"));
    /// The [VarHandle] of `textureCompressionASTC_LDR` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_textureCompressionASTC_LDR = LAYOUT.arrayElementVarHandle(PathElement.groupElement("textureCompressionASTC_LDR"));
    /// The [VarHandle] of `textureCompressionBC` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_textureCompressionBC = LAYOUT.arrayElementVarHandle(PathElement.groupElement("textureCompressionBC"));
    /// The [VarHandle] of `occlusionQueryPrecise` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_occlusionQueryPrecise = LAYOUT.arrayElementVarHandle(PathElement.groupElement("occlusionQueryPrecise"));
    /// The [VarHandle] of `pipelineStatisticsQuery` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineStatisticsQuery = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineStatisticsQuery"));
    /// The [VarHandle] of `vertexPipelineStoresAndAtomics` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vertexPipelineStoresAndAtomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexPipelineStoresAndAtomics"));
    /// The [VarHandle] of `fragmentStoresAndAtomics` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fragmentStoresAndAtomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentStoresAndAtomics"));
    /// The [VarHandle] of `shaderTessellationAndGeometryPointSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderTessellationAndGeometryPointSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTessellationAndGeometryPointSize"));
    /// The [VarHandle] of `shaderImageGatherExtended` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderImageGatherExtended = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderImageGatherExtended"));
    /// The [VarHandle] of `shaderStorageImageExtendedFormats` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderStorageImageExtendedFormats = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageExtendedFormats"));
    /// The [VarHandle] of `shaderStorageImageMultisample` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderStorageImageMultisample = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageMultisample"));
    /// The [VarHandle] of `shaderStorageImageReadWithoutFormat` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderStorageImageReadWithoutFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageReadWithoutFormat"));
    /// The [VarHandle] of `shaderStorageImageWriteWithoutFormat` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderStorageImageWriteWithoutFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageWriteWithoutFormat"));
    /// The [VarHandle] of `shaderUniformBufferArrayDynamicIndexing` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderUniformBufferArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderUniformBufferArrayDynamicIndexing"));
    /// The [VarHandle] of `shaderSampledImageArrayDynamicIndexing` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSampledImageArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSampledImageArrayDynamicIndexing"));
    /// The [VarHandle] of `shaderStorageBufferArrayDynamicIndexing` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderStorageBufferArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageBufferArrayDynamicIndexing"));
    /// The [VarHandle] of `shaderStorageImageArrayDynamicIndexing` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderStorageImageArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageArrayDynamicIndexing"));
    /// The [VarHandle] of `shaderClipDistance` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderClipDistance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderClipDistance"));
    /// The [VarHandle] of `shaderCullDistance` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderCullDistance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderCullDistance"));
    /// The [VarHandle] of `shaderFloat64` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFloat64"));
    /// The [VarHandle] of `shaderInt64` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderInt64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInt64"));
    /// The [VarHandle] of `shaderInt16` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderInt16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInt16"));
    /// The [VarHandle] of `shaderResourceResidency` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderResourceResidency = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderResourceResidency"));
    /// The [VarHandle] of `shaderResourceMinLod` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderResourceMinLod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderResourceMinLod"));
    /// The [VarHandle] of `sparseBinding` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sparseBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseBinding"));
    /// The [VarHandle] of `sparseResidencyBuffer` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sparseResidencyBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidencyBuffer"));
    /// The [VarHandle] of `sparseResidencyImage2D` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sparseResidencyImage2D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidencyImage2D"));
    /// The [VarHandle] of `sparseResidencyImage3D` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sparseResidencyImage3D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidencyImage3D"));
    /// The [VarHandle] of `sparseResidency2Samples` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sparseResidency2Samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidency2Samples"));
    /// The [VarHandle] of `sparseResidency4Samples` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sparseResidency4Samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidency4Samples"));
    /// The [VarHandle] of `sparseResidency8Samples` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sparseResidency8Samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidency8Samples"));
    /// The [VarHandle] of `sparseResidency16Samples` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sparseResidency16Samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidency16Samples"));
    /// The [VarHandle] of `sparseResidencyAliased` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sparseResidencyAliased = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidencyAliased"));
    /// The [VarHandle] of `variableMultisampleRate` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_variableMultisampleRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("variableMultisampleRate"));
    /// The [VarHandle] of `inheritedQueries` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_inheritedQueries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inheritedQueries"));

    /// Creates `VkPhysicalDeviceFeatures` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceFeatures(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFeatures of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFeatures(segment); }

    /// Creates `VkPhysicalDeviceFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFeatures ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFeatures ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFeatures`
    public static VkPhysicalDeviceFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFeatures(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFeatures`
    public static VkPhysicalDeviceFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFeatures(allocator.allocate(LAYOUT, count)); }

    /// {@return `robustBufferAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_robustBufferAccess(MemorySegment segment, long index) { return (int) VH_robustBufferAccess.get(segment, 0L, index); }
    /// {@return `robustBufferAccess`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_robustBufferAccess(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_robustBufferAccess(segment, 0L); }
    /// {@return `robustBufferAccess` at the given index}
    /// @param index the index
    public @CType("VkBool32") int robustBufferAccessAt(long index) { return VkPhysicalDeviceFeatures.get_robustBufferAccess(this.segment(), index); }
    /// {@return `robustBufferAccess`}
    public @CType("VkBool32") int robustBufferAccess() { return VkPhysicalDeviceFeatures.get_robustBufferAccess(this.segment()); }
    /// Sets `robustBufferAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_robustBufferAccess(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_robustBufferAccess.set(segment, 0L, index, value); }
    /// Sets `robustBufferAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_robustBufferAccess(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_robustBufferAccess(segment, 0L, value); }
    /// Sets `robustBufferAccess` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures robustBufferAccessAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_robustBufferAccess(this.segment(), index, value); return this; }
    /// Sets `robustBufferAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures robustBufferAccess(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_robustBufferAccess(this.segment(), value); return this; }

    /// {@return `fullDrawIndexUint32` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fullDrawIndexUint32(MemorySegment segment, long index) { return (int) VH_fullDrawIndexUint32.get(segment, 0L, index); }
    /// {@return `fullDrawIndexUint32`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fullDrawIndexUint32(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_fullDrawIndexUint32(segment, 0L); }
    /// {@return `fullDrawIndexUint32` at the given index}
    /// @param index the index
    public @CType("VkBool32") int fullDrawIndexUint32At(long index) { return VkPhysicalDeviceFeatures.get_fullDrawIndexUint32(this.segment(), index); }
    /// {@return `fullDrawIndexUint32`}
    public @CType("VkBool32") int fullDrawIndexUint32() { return VkPhysicalDeviceFeatures.get_fullDrawIndexUint32(this.segment()); }
    /// Sets `fullDrawIndexUint32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fullDrawIndexUint32(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fullDrawIndexUint32.set(segment, 0L, index, value); }
    /// Sets `fullDrawIndexUint32` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fullDrawIndexUint32(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_fullDrawIndexUint32(segment, 0L, value); }
    /// Sets `fullDrawIndexUint32` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures fullDrawIndexUint32At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_fullDrawIndexUint32(this.segment(), index, value); return this; }
    /// Sets `fullDrawIndexUint32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures fullDrawIndexUint32(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_fullDrawIndexUint32(this.segment(), value); return this; }

    /// {@return `imageCubeArray` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_imageCubeArray(MemorySegment segment, long index) { return (int) VH_imageCubeArray.get(segment, 0L, index); }
    /// {@return `imageCubeArray`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_imageCubeArray(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_imageCubeArray(segment, 0L); }
    /// {@return `imageCubeArray` at the given index}
    /// @param index the index
    public @CType("VkBool32") int imageCubeArrayAt(long index) { return VkPhysicalDeviceFeatures.get_imageCubeArray(this.segment(), index); }
    /// {@return `imageCubeArray`}
    public @CType("VkBool32") int imageCubeArray() { return VkPhysicalDeviceFeatures.get_imageCubeArray(this.segment()); }
    /// Sets `imageCubeArray` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageCubeArray(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_imageCubeArray.set(segment, 0L, index, value); }
    /// Sets `imageCubeArray` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageCubeArray(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_imageCubeArray(segment, 0L, value); }
    /// Sets `imageCubeArray` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures imageCubeArrayAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_imageCubeArray(this.segment(), index, value); return this; }
    /// Sets `imageCubeArray` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures imageCubeArray(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_imageCubeArray(this.segment(), value); return this; }

    /// {@return `independentBlend` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_independentBlend(MemorySegment segment, long index) { return (int) VH_independentBlend.get(segment, 0L, index); }
    /// {@return `independentBlend`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_independentBlend(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_independentBlend(segment, 0L); }
    /// {@return `independentBlend` at the given index}
    /// @param index the index
    public @CType("VkBool32") int independentBlendAt(long index) { return VkPhysicalDeviceFeatures.get_independentBlend(this.segment(), index); }
    /// {@return `independentBlend`}
    public @CType("VkBool32") int independentBlend() { return VkPhysicalDeviceFeatures.get_independentBlend(this.segment()); }
    /// Sets `independentBlend` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_independentBlend(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_independentBlend.set(segment, 0L, index, value); }
    /// Sets `independentBlend` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_independentBlend(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_independentBlend(segment, 0L, value); }
    /// Sets `independentBlend` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures independentBlendAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_independentBlend(this.segment(), index, value); return this; }
    /// Sets `independentBlend` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures independentBlend(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_independentBlend(this.segment(), value); return this; }

    /// {@return `geometryShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_geometryShader(MemorySegment segment, long index) { return (int) VH_geometryShader.get(segment, 0L, index); }
    /// {@return `geometryShader`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_geometryShader(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_geometryShader(segment, 0L); }
    /// {@return `geometryShader` at the given index}
    /// @param index the index
    public @CType("VkBool32") int geometryShaderAt(long index) { return VkPhysicalDeviceFeatures.get_geometryShader(this.segment(), index); }
    /// {@return `geometryShader`}
    public @CType("VkBool32") int geometryShader() { return VkPhysicalDeviceFeatures.get_geometryShader(this.segment()); }
    /// Sets `geometryShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_geometryShader(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_geometryShader.set(segment, 0L, index, value); }
    /// Sets `geometryShader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_geometryShader(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_geometryShader(segment, 0L, value); }
    /// Sets `geometryShader` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures geometryShaderAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_geometryShader(this.segment(), index, value); return this; }
    /// Sets `geometryShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures geometryShader(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_geometryShader(this.segment(), value); return this; }

    /// {@return `tessellationShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_tessellationShader(MemorySegment segment, long index) { return (int) VH_tessellationShader.get(segment, 0L, index); }
    /// {@return `tessellationShader`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_tessellationShader(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_tessellationShader(segment, 0L); }
    /// {@return `tessellationShader` at the given index}
    /// @param index the index
    public @CType("VkBool32") int tessellationShaderAt(long index) { return VkPhysicalDeviceFeatures.get_tessellationShader(this.segment(), index); }
    /// {@return `tessellationShader`}
    public @CType("VkBool32") int tessellationShader() { return VkPhysicalDeviceFeatures.get_tessellationShader(this.segment()); }
    /// Sets `tessellationShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tessellationShader(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_tessellationShader.set(segment, 0L, index, value); }
    /// Sets `tessellationShader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tessellationShader(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_tessellationShader(segment, 0L, value); }
    /// Sets `tessellationShader` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures tessellationShaderAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_tessellationShader(this.segment(), index, value); return this; }
    /// Sets `tessellationShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures tessellationShader(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_tessellationShader(this.segment(), value); return this; }

    /// {@return `sampleRateShading` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sampleRateShading(MemorySegment segment, long index) { return (int) VH_sampleRateShading.get(segment, 0L, index); }
    /// {@return `sampleRateShading`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sampleRateShading(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_sampleRateShading(segment, 0L); }
    /// {@return `sampleRateShading` at the given index}
    /// @param index the index
    public @CType("VkBool32") int sampleRateShadingAt(long index) { return VkPhysicalDeviceFeatures.get_sampleRateShading(this.segment(), index); }
    /// {@return `sampleRateShading`}
    public @CType("VkBool32") int sampleRateShading() { return VkPhysicalDeviceFeatures.get_sampleRateShading(this.segment()); }
    /// Sets `sampleRateShading` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampleRateShading(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sampleRateShading.set(segment, 0L, index, value); }
    /// Sets `sampleRateShading` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampleRateShading(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sampleRateShading(segment, 0L, value); }
    /// Sets `sampleRateShading` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sampleRateShadingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sampleRateShading(this.segment(), index, value); return this; }
    /// Sets `sampleRateShading` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sampleRateShading(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sampleRateShading(this.segment(), value); return this; }

    /// {@return `dualSrcBlend` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_dualSrcBlend(MemorySegment segment, long index) { return (int) VH_dualSrcBlend.get(segment, 0L, index); }
    /// {@return `dualSrcBlend`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_dualSrcBlend(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_dualSrcBlend(segment, 0L); }
    /// {@return `dualSrcBlend` at the given index}
    /// @param index the index
    public @CType("VkBool32") int dualSrcBlendAt(long index) { return VkPhysicalDeviceFeatures.get_dualSrcBlend(this.segment(), index); }
    /// {@return `dualSrcBlend`}
    public @CType("VkBool32") int dualSrcBlend() { return VkPhysicalDeviceFeatures.get_dualSrcBlend(this.segment()); }
    /// Sets `dualSrcBlend` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dualSrcBlend(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_dualSrcBlend.set(segment, 0L, index, value); }
    /// Sets `dualSrcBlend` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dualSrcBlend(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_dualSrcBlend(segment, 0L, value); }
    /// Sets `dualSrcBlend` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures dualSrcBlendAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_dualSrcBlend(this.segment(), index, value); return this; }
    /// Sets `dualSrcBlend` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures dualSrcBlend(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_dualSrcBlend(this.segment(), value); return this; }

    /// {@return `logicOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_logicOp(MemorySegment segment, long index) { return (int) VH_logicOp.get(segment, 0L, index); }
    /// {@return `logicOp`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_logicOp(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_logicOp(segment, 0L); }
    /// {@return `logicOp` at the given index}
    /// @param index the index
    public @CType("VkBool32") int logicOpAt(long index) { return VkPhysicalDeviceFeatures.get_logicOp(this.segment(), index); }
    /// {@return `logicOp`}
    public @CType("VkBool32") int logicOp() { return VkPhysicalDeviceFeatures.get_logicOp(this.segment()); }
    /// Sets `logicOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_logicOp(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_logicOp.set(segment, 0L, index, value); }
    /// Sets `logicOp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_logicOp(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_logicOp(segment, 0L, value); }
    /// Sets `logicOp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures logicOpAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_logicOp(this.segment(), index, value); return this; }
    /// Sets `logicOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures logicOp(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_logicOp(this.segment(), value); return this; }

    /// {@return `multiDrawIndirect` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_multiDrawIndirect(MemorySegment segment, long index) { return (int) VH_multiDrawIndirect.get(segment, 0L, index); }
    /// {@return `multiDrawIndirect`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_multiDrawIndirect(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_multiDrawIndirect(segment, 0L); }
    /// {@return `multiDrawIndirect` at the given index}
    /// @param index the index
    public @CType("VkBool32") int multiDrawIndirectAt(long index) { return VkPhysicalDeviceFeatures.get_multiDrawIndirect(this.segment(), index); }
    /// {@return `multiDrawIndirect`}
    public @CType("VkBool32") int multiDrawIndirect() { return VkPhysicalDeviceFeatures.get_multiDrawIndirect(this.segment()); }
    /// Sets `multiDrawIndirect` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_multiDrawIndirect(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_multiDrawIndirect.set(segment, 0L, index, value); }
    /// Sets `multiDrawIndirect` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_multiDrawIndirect(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_multiDrawIndirect(segment, 0L, value); }
    /// Sets `multiDrawIndirect` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures multiDrawIndirectAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_multiDrawIndirect(this.segment(), index, value); return this; }
    /// Sets `multiDrawIndirect` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures multiDrawIndirect(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_multiDrawIndirect(this.segment(), value); return this; }

    /// {@return `drawIndirectFirstInstance` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_drawIndirectFirstInstance(MemorySegment segment, long index) { return (int) VH_drawIndirectFirstInstance.get(segment, 0L, index); }
    /// {@return `drawIndirectFirstInstance`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_drawIndirectFirstInstance(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_drawIndirectFirstInstance(segment, 0L); }
    /// {@return `drawIndirectFirstInstance` at the given index}
    /// @param index the index
    public @CType("VkBool32") int drawIndirectFirstInstanceAt(long index) { return VkPhysicalDeviceFeatures.get_drawIndirectFirstInstance(this.segment(), index); }
    /// {@return `drawIndirectFirstInstance`}
    public @CType("VkBool32") int drawIndirectFirstInstance() { return VkPhysicalDeviceFeatures.get_drawIndirectFirstInstance(this.segment()); }
    /// Sets `drawIndirectFirstInstance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_drawIndirectFirstInstance(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_drawIndirectFirstInstance.set(segment, 0L, index, value); }
    /// Sets `drawIndirectFirstInstance` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_drawIndirectFirstInstance(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_drawIndirectFirstInstance(segment, 0L, value); }
    /// Sets `drawIndirectFirstInstance` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures drawIndirectFirstInstanceAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_drawIndirectFirstInstance(this.segment(), index, value); return this; }
    /// Sets `drawIndirectFirstInstance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures drawIndirectFirstInstance(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_drawIndirectFirstInstance(this.segment(), value); return this; }

    /// {@return `depthClamp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_depthClamp(MemorySegment segment, long index) { return (int) VH_depthClamp.get(segment, 0L, index); }
    /// {@return `depthClamp`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_depthClamp(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_depthClamp(segment, 0L); }
    /// {@return `depthClamp` at the given index}
    /// @param index the index
    public @CType("VkBool32") int depthClampAt(long index) { return VkPhysicalDeviceFeatures.get_depthClamp(this.segment(), index); }
    /// {@return `depthClamp`}
    public @CType("VkBool32") int depthClamp() { return VkPhysicalDeviceFeatures.get_depthClamp(this.segment()); }
    /// Sets `depthClamp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthClamp(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_depthClamp.set(segment, 0L, index, value); }
    /// Sets `depthClamp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthClamp(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_depthClamp(segment, 0L, value); }
    /// Sets `depthClamp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures depthClampAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_depthClamp(this.segment(), index, value); return this; }
    /// Sets `depthClamp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures depthClamp(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_depthClamp(this.segment(), value); return this; }

    /// {@return `depthBiasClamp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_depthBiasClamp(MemorySegment segment, long index) { return (int) VH_depthBiasClamp.get(segment, 0L, index); }
    /// {@return `depthBiasClamp`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_depthBiasClamp(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_depthBiasClamp(segment, 0L); }
    /// {@return `depthBiasClamp` at the given index}
    /// @param index the index
    public @CType("VkBool32") int depthBiasClampAt(long index) { return VkPhysicalDeviceFeatures.get_depthBiasClamp(this.segment(), index); }
    /// {@return `depthBiasClamp`}
    public @CType("VkBool32") int depthBiasClamp() { return VkPhysicalDeviceFeatures.get_depthBiasClamp(this.segment()); }
    /// Sets `depthBiasClamp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthBiasClamp(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_depthBiasClamp.set(segment, 0L, index, value); }
    /// Sets `depthBiasClamp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthBiasClamp(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_depthBiasClamp(segment, 0L, value); }
    /// Sets `depthBiasClamp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures depthBiasClampAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_depthBiasClamp(this.segment(), index, value); return this; }
    /// Sets `depthBiasClamp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures depthBiasClamp(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_depthBiasClamp(this.segment(), value); return this; }

    /// {@return `fillModeNonSolid` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fillModeNonSolid(MemorySegment segment, long index) { return (int) VH_fillModeNonSolid.get(segment, 0L, index); }
    /// {@return `fillModeNonSolid`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fillModeNonSolid(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_fillModeNonSolid(segment, 0L); }
    /// {@return `fillModeNonSolid` at the given index}
    /// @param index the index
    public @CType("VkBool32") int fillModeNonSolidAt(long index) { return VkPhysicalDeviceFeatures.get_fillModeNonSolid(this.segment(), index); }
    /// {@return `fillModeNonSolid`}
    public @CType("VkBool32") int fillModeNonSolid() { return VkPhysicalDeviceFeatures.get_fillModeNonSolid(this.segment()); }
    /// Sets `fillModeNonSolid` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fillModeNonSolid(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fillModeNonSolid.set(segment, 0L, index, value); }
    /// Sets `fillModeNonSolid` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fillModeNonSolid(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_fillModeNonSolid(segment, 0L, value); }
    /// Sets `fillModeNonSolid` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures fillModeNonSolidAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_fillModeNonSolid(this.segment(), index, value); return this; }
    /// Sets `fillModeNonSolid` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures fillModeNonSolid(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_fillModeNonSolid(this.segment(), value); return this; }

    /// {@return `depthBounds` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_depthBounds(MemorySegment segment, long index) { return (int) VH_depthBounds.get(segment, 0L, index); }
    /// {@return `depthBounds`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_depthBounds(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_depthBounds(segment, 0L); }
    /// {@return `depthBounds` at the given index}
    /// @param index the index
    public @CType("VkBool32") int depthBoundsAt(long index) { return VkPhysicalDeviceFeatures.get_depthBounds(this.segment(), index); }
    /// {@return `depthBounds`}
    public @CType("VkBool32") int depthBounds() { return VkPhysicalDeviceFeatures.get_depthBounds(this.segment()); }
    /// Sets `depthBounds` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthBounds(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_depthBounds.set(segment, 0L, index, value); }
    /// Sets `depthBounds` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthBounds(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_depthBounds(segment, 0L, value); }
    /// Sets `depthBounds` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures depthBoundsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_depthBounds(this.segment(), index, value); return this; }
    /// Sets `depthBounds` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures depthBounds(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_depthBounds(this.segment(), value); return this; }

    /// {@return `wideLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_wideLines(MemorySegment segment, long index) { return (int) VH_wideLines.get(segment, 0L, index); }
    /// {@return `wideLines`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_wideLines(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_wideLines(segment, 0L); }
    /// {@return `wideLines` at the given index}
    /// @param index the index
    public @CType("VkBool32") int wideLinesAt(long index) { return VkPhysicalDeviceFeatures.get_wideLines(this.segment(), index); }
    /// {@return `wideLines`}
    public @CType("VkBool32") int wideLines() { return VkPhysicalDeviceFeatures.get_wideLines(this.segment()); }
    /// Sets `wideLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_wideLines(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_wideLines.set(segment, 0L, index, value); }
    /// Sets `wideLines` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_wideLines(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_wideLines(segment, 0L, value); }
    /// Sets `wideLines` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures wideLinesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_wideLines(this.segment(), index, value); return this; }
    /// Sets `wideLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures wideLines(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_wideLines(this.segment(), value); return this; }

    /// {@return `largePoints` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_largePoints(MemorySegment segment, long index) { return (int) VH_largePoints.get(segment, 0L, index); }
    /// {@return `largePoints`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_largePoints(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_largePoints(segment, 0L); }
    /// {@return `largePoints` at the given index}
    /// @param index the index
    public @CType("VkBool32") int largePointsAt(long index) { return VkPhysicalDeviceFeatures.get_largePoints(this.segment(), index); }
    /// {@return `largePoints`}
    public @CType("VkBool32") int largePoints() { return VkPhysicalDeviceFeatures.get_largePoints(this.segment()); }
    /// Sets `largePoints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_largePoints(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_largePoints.set(segment, 0L, index, value); }
    /// Sets `largePoints` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_largePoints(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_largePoints(segment, 0L, value); }
    /// Sets `largePoints` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures largePointsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_largePoints(this.segment(), index, value); return this; }
    /// Sets `largePoints` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures largePoints(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_largePoints(this.segment(), value); return this; }

    /// {@return `alphaToOne` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_alphaToOne(MemorySegment segment, long index) { return (int) VH_alphaToOne.get(segment, 0L, index); }
    /// {@return `alphaToOne`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_alphaToOne(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_alphaToOne(segment, 0L); }
    /// {@return `alphaToOne` at the given index}
    /// @param index the index
    public @CType("VkBool32") int alphaToOneAt(long index) { return VkPhysicalDeviceFeatures.get_alphaToOne(this.segment(), index); }
    /// {@return `alphaToOne`}
    public @CType("VkBool32") int alphaToOne() { return VkPhysicalDeviceFeatures.get_alphaToOne(this.segment()); }
    /// Sets `alphaToOne` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_alphaToOne(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_alphaToOne.set(segment, 0L, index, value); }
    /// Sets `alphaToOne` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_alphaToOne(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_alphaToOne(segment, 0L, value); }
    /// Sets `alphaToOne` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures alphaToOneAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_alphaToOne(this.segment(), index, value); return this; }
    /// Sets `alphaToOne` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures alphaToOne(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_alphaToOne(this.segment(), value); return this; }

    /// {@return `multiViewport` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_multiViewport(MemorySegment segment, long index) { return (int) VH_multiViewport.get(segment, 0L, index); }
    /// {@return `multiViewport`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_multiViewport(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_multiViewport(segment, 0L); }
    /// {@return `multiViewport` at the given index}
    /// @param index the index
    public @CType("VkBool32") int multiViewportAt(long index) { return VkPhysicalDeviceFeatures.get_multiViewport(this.segment(), index); }
    /// {@return `multiViewport`}
    public @CType("VkBool32") int multiViewport() { return VkPhysicalDeviceFeatures.get_multiViewport(this.segment()); }
    /// Sets `multiViewport` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_multiViewport(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_multiViewport.set(segment, 0L, index, value); }
    /// Sets `multiViewport` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_multiViewport(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_multiViewport(segment, 0L, value); }
    /// Sets `multiViewport` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures multiViewportAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_multiViewport(this.segment(), index, value); return this; }
    /// Sets `multiViewport` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures multiViewport(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_multiViewport(this.segment(), value); return this; }

    /// {@return `samplerAnisotropy` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_samplerAnisotropy(MemorySegment segment, long index) { return (int) VH_samplerAnisotropy.get(segment, 0L, index); }
    /// {@return `samplerAnisotropy`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_samplerAnisotropy(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_samplerAnisotropy(segment, 0L); }
    /// {@return `samplerAnisotropy` at the given index}
    /// @param index the index
    public @CType("VkBool32") int samplerAnisotropyAt(long index) { return VkPhysicalDeviceFeatures.get_samplerAnisotropy(this.segment(), index); }
    /// {@return `samplerAnisotropy`}
    public @CType("VkBool32") int samplerAnisotropy() { return VkPhysicalDeviceFeatures.get_samplerAnisotropy(this.segment()); }
    /// Sets `samplerAnisotropy` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_samplerAnisotropy(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_samplerAnisotropy.set(segment, 0L, index, value); }
    /// Sets `samplerAnisotropy` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_samplerAnisotropy(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_samplerAnisotropy(segment, 0L, value); }
    /// Sets `samplerAnisotropy` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures samplerAnisotropyAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_samplerAnisotropy(this.segment(), index, value); return this; }
    /// Sets `samplerAnisotropy` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures samplerAnisotropy(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_samplerAnisotropy(this.segment(), value); return this; }

    /// {@return `textureCompressionETC2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_textureCompressionETC2(MemorySegment segment, long index) { return (int) VH_textureCompressionETC2.get(segment, 0L, index); }
    /// {@return `textureCompressionETC2`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_textureCompressionETC2(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_textureCompressionETC2(segment, 0L); }
    /// {@return `textureCompressionETC2` at the given index}
    /// @param index the index
    public @CType("VkBool32") int textureCompressionETC2At(long index) { return VkPhysicalDeviceFeatures.get_textureCompressionETC2(this.segment(), index); }
    /// {@return `textureCompressionETC2`}
    public @CType("VkBool32") int textureCompressionETC2() { return VkPhysicalDeviceFeatures.get_textureCompressionETC2(this.segment()); }
    /// Sets `textureCompressionETC2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_textureCompressionETC2(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_textureCompressionETC2.set(segment, 0L, index, value); }
    /// Sets `textureCompressionETC2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_textureCompressionETC2(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_textureCompressionETC2(segment, 0L, value); }
    /// Sets `textureCompressionETC2` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures textureCompressionETC2At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_textureCompressionETC2(this.segment(), index, value); return this; }
    /// Sets `textureCompressionETC2` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures textureCompressionETC2(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_textureCompressionETC2(this.segment(), value); return this; }

    /// {@return `textureCompressionASTC_LDR` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_textureCompressionASTC_LDR(MemorySegment segment, long index) { return (int) VH_textureCompressionASTC_LDR.get(segment, 0L, index); }
    /// {@return `textureCompressionASTC_LDR`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_textureCompressionASTC_LDR(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_textureCompressionASTC_LDR(segment, 0L); }
    /// {@return `textureCompressionASTC_LDR` at the given index}
    /// @param index the index
    public @CType("VkBool32") int textureCompressionASTC_LDRAt(long index) { return VkPhysicalDeviceFeatures.get_textureCompressionASTC_LDR(this.segment(), index); }
    /// {@return `textureCompressionASTC_LDR`}
    public @CType("VkBool32") int textureCompressionASTC_LDR() { return VkPhysicalDeviceFeatures.get_textureCompressionASTC_LDR(this.segment()); }
    /// Sets `textureCompressionASTC_LDR` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_textureCompressionASTC_LDR(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_textureCompressionASTC_LDR.set(segment, 0L, index, value); }
    /// Sets `textureCompressionASTC_LDR` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_textureCompressionASTC_LDR(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_textureCompressionASTC_LDR(segment, 0L, value); }
    /// Sets `textureCompressionASTC_LDR` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures textureCompressionASTC_LDRAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_textureCompressionASTC_LDR(this.segment(), index, value); return this; }
    /// Sets `textureCompressionASTC_LDR` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures textureCompressionASTC_LDR(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_textureCompressionASTC_LDR(this.segment(), value); return this; }

    /// {@return `textureCompressionBC` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_textureCompressionBC(MemorySegment segment, long index) { return (int) VH_textureCompressionBC.get(segment, 0L, index); }
    /// {@return `textureCompressionBC`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_textureCompressionBC(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_textureCompressionBC(segment, 0L); }
    /// {@return `textureCompressionBC` at the given index}
    /// @param index the index
    public @CType("VkBool32") int textureCompressionBCAt(long index) { return VkPhysicalDeviceFeatures.get_textureCompressionBC(this.segment(), index); }
    /// {@return `textureCompressionBC`}
    public @CType("VkBool32") int textureCompressionBC() { return VkPhysicalDeviceFeatures.get_textureCompressionBC(this.segment()); }
    /// Sets `textureCompressionBC` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_textureCompressionBC(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_textureCompressionBC.set(segment, 0L, index, value); }
    /// Sets `textureCompressionBC` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_textureCompressionBC(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_textureCompressionBC(segment, 0L, value); }
    /// Sets `textureCompressionBC` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures textureCompressionBCAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_textureCompressionBC(this.segment(), index, value); return this; }
    /// Sets `textureCompressionBC` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures textureCompressionBC(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_textureCompressionBC(this.segment(), value); return this; }

    /// {@return `occlusionQueryPrecise` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_occlusionQueryPrecise(MemorySegment segment, long index) { return (int) VH_occlusionQueryPrecise.get(segment, 0L, index); }
    /// {@return `occlusionQueryPrecise`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_occlusionQueryPrecise(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_occlusionQueryPrecise(segment, 0L); }
    /// {@return `occlusionQueryPrecise` at the given index}
    /// @param index the index
    public @CType("VkBool32") int occlusionQueryPreciseAt(long index) { return VkPhysicalDeviceFeatures.get_occlusionQueryPrecise(this.segment(), index); }
    /// {@return `occlusionQueryPrecise`}
    public @CType("VkBool32") int occlusionQueryPrecise() { return VkPhysicalDeviceFeatures.get_occlusionQueryPrecise(this.segment()); }
    /// Sets `occlusionQueryPrecise` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_occlusionQueryPrecise(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_occlusionQueryPrecise.set(segment, 0L, index, value); }
    /// Sets `occlusionQueryPrecise` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_occlusionQueryPrecise(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_occlusionQueryPrecise(segment, 0L, value); }
    /// Sets `occlusionQueryPrecise` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures occlusionQueryPreciseAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_occlusionQueryPrecise(this.segment(), index, value); return this; }
    /// Sets `occlusionQueryPrecise` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures occlusionQueryPrecise(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_occlusionQueryPrecise(this.segment(), value); return this; }

    /// {@return `pipelineStatisticsQuery` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_pipelineStatisticsQuery(MemorySegment segment, long index) { return (int) VH_pipelineStatisticsQuery.get(segment, 0L, index); }
    /// {@return `pipelineStatisticsQuery`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_pipelineStatisticsQuery(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_pipelineStatisticsQuery(segment, 0L); }
    /// {@return `pipelineStatisticsQuery` at the given index}
    /// @param index the index
    public @CType("VkBool32") int pipelineStatisticsQueryAt(long index) { return VkPhysicalDeviceFeatures.get_pipelineStatisticsQuery(this.segment(), index); }
    /// {@return `pipelineStatisticsQuery`}
    public @CType("VkBool32") int pipelineStatisticsQuery() { return VkPhysicalDeviceFeatures.get_pipelineStatisticsQuery(this.segment()); }
    /// Sets `pipelineStatisticsQuery` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineStatisticsQuery(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_pipelineStatisticsQuery.set(segment, 0L, index, value); }
    /// Sets `pipelineStatisticsQuery` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineStatisticsQuery(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_pipelineStatisticsQuery(segment, 0L, value); }
    /// Sets `pipelineStatisticsQuery` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures pipelineStatisticsQueryAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_pipelineStatisticsQuery(this.segment(), index, value); return this; }
    /// Sets `pipelineStatisticsQuery` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures pipelineStatisticsQuery(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_pipelineStatisticsQuery(this.segment(), value); return this; }

    /// {@return `vertexPipelineStoresAndAtomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_vertexPipelineStoresAndAtomics(MemorySegment segment, long index) { return (int) VH_vertexPipelineStoresAndAtomics.get(segment, 0L, index); }
    /// {@return `vertexPipelineStoresAndAtomics`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_vertexPipelineStoresAndAtomics(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_vertexPipelineStoresAndAtomics(segment, 0L); }
    /// {@return `vertexPipelineStoresAndAtomics` at the given index}
    /// @param index the index
    public @CType("VkBool32") int vertexPipelineStoresAndAtomicsAt(long index) { return VkPhysicalDeviceFeatures.get_vertexPipelineStoresAndAtomics(this.segment(), index); }
    /// {@return `vertexPipelineStoresAndAtomics`}
    public @CType("VkBool32") int vertexPipelineStoresAndAtomics() { return VkPhysicalDeviceFeatures.get_vertexPipelineStoresAndAtomics(this.segment()); }
    /// Sets `vertexPipelineStoresAndAtomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexPipelineStoresAndAtomics(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_vertexPipelineStoresAndAtomics.set(segment, 0L, index, value); }
    /// Sets `vertexPipelineStoresAndAtomics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexPipelineStoresAndAtomics(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_vertexPipelineStoresAndAtomics(segment, 0L, value); }
    /// Sets `vertexPipelineStoresAndAtomics` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures vertexPipelineStoresAndAtomicsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_vertexPipelineStoresAndAtomics(this.segment(), index, value); return this; }
    /// Sets `vertexPipelineStoresAndAtomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures vertexPipelineStoresAndAtomics(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_vertexPipelineStoresAndAtomics(this.segment(), value); return this; }

    /// {@return `fragmentStoresAndAtomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fragmentStoresAndAtomics(MemorySegment segment, long index) { return (int) VH_fragmentStoresAndAtomics.get(segment, 0L, index); }
    /// {@return `fragmentStoresAndAtomics`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fragmentStoresAndAtomics(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_fragmentStoresAndAtomics(segment, 0L); }
    /// {@return `fragmentStoresAndAtomics` at the given index}
    /// @param index the index
    public @CType("VkBool32") int fragmentStoresAndAtomicsAt(long index) { return VkPhysicalDeviceFeatures.get_fragmentStoresAndAtomics(this.segment(), index); }
    /// {@return `fragmentStoresAndAtomics`}
    public @CType("VkBool32") int fragmentStoresAndAtomics() { return VkPhysicalDeviceFeatures.get_fragmentStoresAndAtomics(this.segment()); }
    /// Sets `fragmentStoresAndAtomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentStoresAndAtomics(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fragmentStoresAndAtomics.set(segment, 0L, index, value); }
    /// Sets `fragmentStoresAndAtomics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentStoresAndAtomics(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_fragmentStoresAndAtomics(segment, 0L, value); }
    /// Sets `fragmentStoresAndAtomics` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures fragmentStoresAndAtomicsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_fragmentStoresAndAtomics(this.segment(), index, value); return this; }
    /// Sets `fragmentStoresAndAtomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures fragmentStoresAndAtomics(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_fragmentStoresAndAtomics(this.segment(), value); return this; }

    /// {@return `shaderTessellationAndGeometryPointSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderTessellationAndGeometryPointSize(MemorySegment segment, long index) { return (int) VH_shaderTessellationAndGeometryPointSize.get(segment, 0L, index); }
    /// {@return `shaderTessellationAndGeometryPointSize`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderTessellationAndGeometryPointSize(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_shaderTessellationAndGeometryPointSize(segment, 0L); }
    /// {@return `shaderTessellationAndGeometryPointSize` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderTessellationAndGeometryPointSizeAt(long index) { return VkPhysicalDeviceFeatures.get_shaderTessellationAndGeometryPointSize(this.segment(), index); }
    /// {@return `shaderTessellationAndGeometryPointSize`}
    public @CType("VkBool32") int shaderTessellationAndGeometryPointSize() { return VkPhysicalDeviceFeatures.get_shaderTessellationAndGeometryPointSize(this.segment()); }
    /// Sets `shaderTessellationAndGeometryPointSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderTessellationAndGeometryPointSize(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderTessellationAndGeometryPointSize.set(segment, 0L, index, value); }
    /// Sets `shaderTessellationAndGeometryPointSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderTessellationAndGeometryPointSize(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderTessellationAndGeometryPointSize(segment, 0L, value); }
    /// Sets `shaderTessellationAndGeometryPointSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderTessellationAndGeometryPointSizeAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderTessellationAndGeometryPointSize(this.segment(), index, value); return this; }
    /// Sets `shaderTessellationAndGeometryPointSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderTessellationAndGeometryPointSize(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderTessellationAndGeometryPointSize(this.segment(), value); return this; }

    /// {@return `shaderImageGatherExtended` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderImageGatherExtended(MemorySegment segment, long index) { return (int) VH_shaderImageGatherExtended.get(segment, 0L, index); }
    /// {@return `shaderImageGatherExtended`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderImageGatherExtended(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_shaderImageGatherExtended(segment, 0L); }
    /// {@return `shaderImageGatherExtended` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderImageGatherExtendedAt(long index) { return VkPhysicalDeviceFeatures.get_shaderImageGatherExtended(this.segment(), index); }
    /// {@return `shaderImageGatherExtended`}
    public @CType("VkBool32") int shaderImageGatherExtended() { return VkPhysicalDeviceFeatures.get_shaderImageGatherExtended(this.segment()); }
    /// Sets `shaderImageGatherExtended` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderImageGatherExtended(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderImageGatherExtended.set(segment, 0L, index, value); }
    /// Sets `shaderImageGatherExtended` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderImageGatherExtended(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderImageGatherExtended(segment, 0L, value); }
    /// Sets `shaderImageGatherExtended` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderImageGatherExtendedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderImageGatherExtended(this.segment(), index, value); return this; }
    /// Sets `shaderImageGatherExtended` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderImageGatherExtended(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderImageGatherExtended(this.segment(), value); return this; }

    /// {@return `shaderStorageImageExtendedFormats` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderStorageImageExtendedFormats(MemorySegment segment, long index) { return (int) VH_shaderStorageImageExtendedFormats.get(segment, 0L, index); }
    /// {@return `shaderStorageImageExtendedFormats`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderStorageImageExtendedFormats(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_shaderStorageImageExtendedFormats(segment, 0L); }
    /// {@return `shaderStorageImageExtendedFormats` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderStorageImageExtendedFormatsAt(long index) { return VkPhysicalDeviceFeatures.get_shaderStorageImageExtendedFormats(this.segment(), index); }
    /// {@return `shaderStorageImageExtendedFormats`}
    public @CType("VkBool32") int shaderStorageImageExtendedFormats() { return VkPhysicalDeviceFeatures.get_shaderStorageImageExtendedFormats(this.segment()); }
    /// Sets `shaderStorageImageExtendedFormats` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderStorageImageExtendedFormats(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderStorageImageExtendedFormats.set(segment, 0L, index, value); }
    /// Sets `shaderStorageImageExtendedFormats` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderStorageImageExtendedFormats(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderStorageImageExtendedFormats(segment, 0L, value); }
    /// Sets `shaderStorageImageExtendedFormats` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageImageExtendedFormatsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderStorageImageExtendedFormats(this.segment(), index, value); return this; }
    /// Sets `shaderStorageImageExtendedFormats` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageImageExtendedFormats(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderStorageImageExtendedFormats(this.segment(), value); return this; }

    /// {@return `shaderStorageImageMultisample` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderStorageImageMultisample(MemorySegment segment, long index) { return (int) VH_shaderStorageImageMultisample.get(segment, 0L, index); }
    /// {@return `shaderStorageImageMultisample`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderStorageImageMultisample(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_shaderStorageImageMultisample(segment, 0L); }
    /// {@return `shaderStorageImageMultisample` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderStorageImageMultisampleAt(long index) { return VkPhysicalDeviceFeatures.get_shaderStorageImageMultisample(this.segment(), index); }
    /// {@return `shaderStorageImageMultisample`}
    public @CType("VkBool32") int shaderStorageImageMultisample() { return VkPhysicalDeviceFeatures.get_shaderStorageImageMultisample(this.segment()); }
    /// Sets `shaderStorageImageMultisample` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderStorageImageMultisample(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderStorageImageMultisample.set(segment, 0L, index, value); }
    /// Sets `shaderStorageImageMultisample` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderStorageImageMultisample(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderStorageImageMultisample(segment, 0L, value); }
    /// Sets `shaderStorageImageMultisample` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageImageMultisampleAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderStorageImageMultisample(this.segment(), index, value); return this; }
    /// Sets `shaderStorageImageMultisample` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageImageMultisample(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderStorageImageMultisample(this.segment(), value); return this; }

    /// {@return `shaderStorageImageReadWithoutFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderStorageImageReadWithoutFormat(MemorySegment segment, long index) { return (int) VH_shaderStorageImageReadWithoutFormat.get(segment, 0L, index); }
    /// {@return `shaderStorageImageReadWithoutFormat`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderStorageImageReadWithoutFormat(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_shaderStorageImageReadWithoutFormat(segment, 0L); }
    /// {@return `shaderStorageImageReadWithoutFormat` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderStorageImageReadWithoutFormatAt(long index) { return VkPhysicalDeviceFeatures.get_shaderStorageImageReadWithoutFormat(this.segment(), index); }
    /// {@return `shaderStorageImageReadWithoutFormat`}
    public @CType("VkBool32") int shaderStorageImageReadWithoutFormat() { return VkPhysicalDeviceFeatures.get_shaderStorageImageReadWithoutFormat(this.segment()); }
    /// Sets `shaderStorageImageReadWithoutFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderStorageImageReadWithoutFormat(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderStorageImageReadWithoutFormat.set(segment, 0L, index, value); }
    /// Sets `shaderStorageImageReadWithoutFormat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderStorageImageReadWithoutFormat(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderStorageImageReadWithoutFormat(segment, 0L, value); }
    /// Sets `shaderStorageImageReadWithoutFormat` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageImageReadWithoutFormatAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderStorageImageReadWithoutFormat(this.segment(), index, value); return this; }
    /// Sets `shaderStorageImageReadWithoutFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageImageReadWithoutFormat(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderStorageImageReadWithoutFormat(this.segment(), value); return this; }

    /// {@return `shaderStorageImageWriteWithoutFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderStorageImageWriteWithoutFormat(MemorySegment segment, long index) { return (int) VH_shaderStorageImageWriteWithoutFormat.get(segment, 0L, index); }
    /// {@return `shaderStorageImageWriteWithoutFormat`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderStorageImageWriteWithoutFormat(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_shaderStorageImageWriteWithoutFormat(segment, 0L); }
    /// {@return `shaderStorageImageWriteWithoutFormat` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderStorageImageWriteWithoutFormatAt(long index) { return VkPhysicalDeviceFeatures.get_shaderStorageImageWriteWithoutFormat(this.segment(), index); }
    /// {@return `shaderStorageImageWriteWithoutFormat`}
    public @CType("VkBool32") int shaderStorageImageWriteWithoutFormat() { return VkPhysicalDeviceFeatures.get_shaderStorageImageWriteWithoutFormat(this.segment()); }
    /// Sets `shaderStorageImageWriteWithoutFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderStorageImageWriteWithoutFormat(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderStorageImageWriteWithoutFormat.set(segment, 0L, index, value); }
    /// Sets `shaderStorageImageWriteWithoutFormat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderStorageImageWriteWithoutFormat(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderStorageImageWriteWithoutFormat(segment, 0L, value); }
    /// Sets `shaderStorageImageWriteWithoutFormat` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageImageWriteWithoutFormatAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderStorageImageWriteWithoutFormat(this.segment(), index, value); return this; }
    /// Sets `shaderStorageImageWriteWithoutFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageImageWriteWithoutFormat(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderStorageImageWriteWithoutFormat(this.segment(), value); return this; }

    /// {@return `shaderUniformBufferArrayDynamicIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderUniformBufferArrayDynamicIndexing(MemorySegment segment, long index) { return (int) VH_shaderUniformBufferArrayDynamicIndexing.get(segment, 0L, index); }
    /// {@return `shaderUniformBufferArrayDynamicIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderUniformBufferArrayDynamicIndexing(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_shaderUniformBufferArrayDynamicIndexing(segment, 0L); }
    /// {@return `shaderUniformBufferArrayDynamicIndexing` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderUniformBufferArrayDynamicIndexingAt(long index) { return VkPhysicalDeviceFeatures.get_shaderUniformBufferArrayDynamicIndexing(this.segment(), index); }
    /// {@return `shaderUniformBufferArrayDynamicIndexing`}
    public @CType("VkBool32") int shaderUniformBufferArrayDynamicIndexing() { return VkPhysicalDeviceFeatures.get_shaderUniformBufferArrayDynamicIndexing(this.segment()); }
    /// Sets `shaderUniformBufferArrayDynamicIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderUniformBufferArrayDynamicIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderUniformBufferArrayDynamicIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderUniformBufferArrayDynamicIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderUniformBufferArrayDynamicIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderUniformBufferArrayDynamicIndexing(segment, 0L, value); }
    /// Sets `shaderUniformBufferArrayDynamicIndexing` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderUniformBufferArrayDynamicIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderUniformBufferArrayDynamicIndexing(this.segment(), index, value); return this; }
    /// Sets `shaderUniformBufferArrayDynamicIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderUniformBufferArrayDynamicIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderUniformBufferArrayDynamicIndexing(this.segment(), value); return this; }

    /// {@return `shaderSampledImageArrayDynamicIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSampledImageArrayDynamicIndexing(MemorySegment segment, long index) { return (int) VH_shaderSampledImageArrayDynamicIndexing.get(segment, 0L, index); }
    /// {@return `shaderSampledImageArrayDynamicIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSampledImageArrayDynamicIndexing(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_shaderSampledImageArrayDynamicIndexing(segment, 0L); }
    /// {@return `shaderSampledImageArrayDynamicIndexing` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderSampledImageArrayDynamicIndexingAt(long index) { return VkPhysicalDeviceFeatures.get_shaderSampledImageArrayDynamicIndexing(this.segment(), index); }
    /// {@return `shaderSampledImageArrayDynamicIndexing`}
    public @CType("VkBool32") int shaderSampledImageArrayDynamicIndexing() { return VkPhysicalDeviceFeatures.get_shaderSampledImageArrayDynamicIndexing(this.segment()); }
    /// Sets `shaderSampledImageArrayDynamicIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSampledImageArrayDynamicIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSampledImageArrayDynamicIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderSampledImageArrayDynamicIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSampledImageArrayDynamicIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderSampledImageArrayDynamicIndexing(segment, 0L, value); }
    /// Sets `shaderSampledImageArrayDynamicIndexing` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderSampledImageArrayDynamicIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderSampledImageArrayDynamicIndexing(this.segment(), index, value); return this; }
    /// Sets `shaderSampledImageArrayDynamicIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderSampledImageArrayDynamicIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderSampledImageArrayDynamicIndexing(this.segment(), value); return this; }

    /// {@return `shaderStorageBufferArrayDynamicIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderStorageBufferArrayDynamicIndexing(MemorySegment segment, long index) { return (int) VH_shaderStorageBufferArrayDynamicIndexing.get(segment, 0L, index); }
    /// {@return `shaderStorageBufferArrayDynamicIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderStorageBufferArrayDynamicIndexing(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_shaderStorageBufferArrayDynamicIndexing(segment, 0L); }
    /// {@return `shaderStorageBufferArrayDynamicIndexing` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderStorageBufferArrayDynamicIndexingAt(long index) { return VkPhysicalDeviceFeatures.get_shaderStorageBufferArrayDynamicIndexing(this.segment(), index); }
    /// {@return `shaderStorageBufferArrayDynamicIndexing`}
    public @CType("VkBool32") int shaderStorageBufferArrayDynamicIndexing() { return VkPhysicalDeviceFeatures.get_shaderStorageBufferArrayDynamicIndexing(this.segment()); }
    /// Sets `shaderStorageBufferArrayDynamicIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderStorageBufferArrayDynamicIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderStorageBufferArrayDynamicIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderStorageBufferArrayDynamicIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderStorageBufferArrayDynamicIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderStorageBufferArrayDynamicIndexing(segment, 0L, value); }
    /// Sets `shaderStorageBufferArrayDynamicIndexing` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageBufferArrayDynamicIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderStorageBufferArrayDynamicIndexing(this.segment(), index, value); return this; }
    /// Sets `shaderStorageBufferArrayDynamicIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageBufferArrayDynamicIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderStorageBufferArrayDynamicIndexing(this.segment(), value); return this; }

    /// {@return `shaderStorageImageArrayDynamicIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderStorageImageArrayDynamicIndexing(MemorySegment segment, long index) { return (int) VH_shaderStorageImageArrayDynamicIndexing.get(segment, 0L, index); }
    /// {@return `shaderStorageImageArrayDynamicIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderStorageImageArrayDynamicIndexing(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_shaderStorageImageArrayDynamicIndexing(segment, 0L); }
    /// {@return `shaderStorageImageArrayDynamicIndexing` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderStorageImageArrayDynamicIndexingAt(long index) { return VkPhysicalDeviceFeatures.get_shaderStorageImageArrayDynamicIndexing(this.segment(), index); }
    /// {@return `shaderStorageImageArrayDynamicIndexing`}
    public @CType("VkBool32") int shaderStorageImageArrayDynamicIndexing() { return VkPhysicalDeviceFeatures.get_shaderStorageImageArrayDynamicIndexing(this.segment()); }
    /// Sets `shaderStorageImageArrayDynamicIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderStorageImageArrayDynamicIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderStorageImageArrayDynamicIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderStorageImageArrayDynamicIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderStorageImageArrayDynamicIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderStorageImageArrayDynamicIndexing(segment, 0L, value); }
    /// Sets `shaderStorageImageArrayDynamicIndexing` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageImageArrayDynamicIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderStorageImageArrayDynamicIndexing(this.segment(), index, value); return this; }
    /// Sets `shaderStorageImageArrayDynamicIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageImageArrayDynamicIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderStorageImageArrayDynamicIndexing(this.segment(), value); return this; }

    /// {@return `shaderClipDistance` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderClipDistance(MemorySegment segment, long index) { return (int) VH_shaderClipDistance.get(segment, 0L, index); }
    /// {@return `shaderClipDistance`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderClipDistance(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_shaderClipDistance(segment, 0L); }
    /// {@return `shaderClipDistance` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderClipDistanceAt(long index) { return VkPhysicalDeviceFeatures.get_shaderClipDistance(this.segment(), index); }
    /// {@return `shaderClipDistance`}
    public @CType("VkBool32") int shaderClipDistance() { return VkPhysicalDeviceFeatures.get_shaderClipDistance(this.segment()); }
    /// Sets `shaderClipDistance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderClipDistance(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderClipDistance.set(segment, 0L, index, value); }
    /// Sets `shaderClipDistance` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderClipDistance(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderClipDistance(segment, 0L, value); }
    /// Sets `shaderClipDistance` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderClipDistanceAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderClipDistance(this.segment(), index, value); return this; }
    /// Sets `shaderClipDistance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderClipDistance(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderClipDistance(this.segment(), value); return this; }

    /// {@return `shaderCullDistance` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderCullDistance(MemorySegment segment, long index) { return (int) VH_shaderCullDistance.get(segment, 0L, index); }
    /// {@return `shaderCullDistance`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderCullDistance(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_shaderCullDistance(segment, 0L); }
    /// {@return `shaderCullDistance` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderCullDistanceAt(long index) { return VkPhysicalDeviceFeatures.get_shaderCullDistance(this.segment(), index); }
    /// {@return `shaderCullDistance`}
    public @CType("VkBool32") int shaderCullDistance() { return VkPhysicalDeviceFeatures.get_shaderCullDistance(this.segment()); }
    /// Sets `shaderCullDistance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderCullDistance(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderCullDistance.set(segment, 0L, index, value); }
    /// Sets `shaderCullDistance` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderCullDistance(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderCullDistance(segment, 0L, value); }
    /// Sets `shaderCullDistance` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderCullDistanceAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderCullDistance(this.segment(), index, value); return this; }
    /// Sets `shaderCullDistance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderCullDistance(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderCullDistance(this.segment(), value); return this; }

    /// {@return `shaderFloat64` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderFloat64(MemorySegment segment, long index) { return (int) VH_shaderFloat64.get(segment, 0L, index); }
    /// {@return `shaderFloat64`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderFloat64(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_shaderFloat64(segment, 0L); }
    /// {@return `shaderFloat64` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderFloat64At(long index) { return VkPhysicalDeviceFeatures.get_shaderFloat64(this.segment(), index); }
    /// {@return `shaderFloat64`}
    public @CType("VkBool32") int shaderFloat64() { return VkPhysicalDeviceFeatures.get_shaderFloat64(this.segment()); }
    /// Sets `shaderFloat64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderFloat64(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderFloat64.set(segment, 0L, index, value); }
    /// Sets `shaderFloat64` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderFloat64(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderFloat64(segment, 0L, value); }
    /// Sets `shaderFloat64` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderFloat64At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderFloat64(this.segment(), index, value); return this; }
    /// Sets `shaderFloat64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderFloat64(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderFloat64(this.segment(), value); return this; }

    /// {@return `shaderInt64` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderInt64(MemorySegment segment, long index) { return (int) VH_shaderInt64.get(segment, 0L, index); }
    /// {@return `shaderInt64`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderInt64(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_shaderInt64(segment, 0L); }
    /// {@return `shaderInt64` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderInt64At(long index) { return VkPhysicalDeviceFeatures.get_shaderInt64(this.segment(), index); }
    /// {@return `shaderInt64`}
    public @CType("VkBool32") int shaderInt64() { return VkPhysicalDeviceFeatures.get_shaderInt64(this.segment()); }
    /// Sets `shaderInt64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderInt64(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderInt64.set(segment, 0L, index, value); }
    /// Sets `shaderInt64` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderInt64(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderInt64(segment, 0L, value); }
    /// Sets `shaderInt64` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderInt64At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderInt64(this.segment(), index, value); return this; }
    /// Sets `shaderInt64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderInt64(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderInt64(this.segment(), value); return this; }

    /// {@return `shaderInt16` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderInt16(MemorySegment segment, long index) { return (int) VH_shaderInt16.get(segment, 0L, index); }
    /// {@return `shaderInt16`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderInt16(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_shaderInt16(segment, 0L); }
    /// {@return `shaderInt16` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderInt16At(long index) { return VkPhysicalDeviceFeatures.get_shaderInt16(this.segment(), index); }
    /// {@return `shaderInt16`}
    public @CType("VkBool32") int shaderInt16() { return VkPhysicalDeviceFeatures.get_shaderInt16(this.segment()); }
    /// Sets `shaderInt16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderInt16(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderInt16.set(segment, 0L, index, value); }
    /// Sets `shaderInt16` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderInt16(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderInt16(segment, 0L, value); }
    /// Sets `shaderInt16` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderInt16At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderInt16(this.segment(), index, value); return this; }
    /// Sets `shaderInt16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderInt16(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderInt16(this.segment(), value); return this; }

    /// {@return `shaderResourceResidency` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderResourceResidency(MemorySegment segment, long index) { return (int) VH_shaderResourceResidency.get(segment, 0L, index); }
    /// {@return `shaderResourceResidency`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderResourceResidency(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_shaderResourceResidency(segment, 0L); }
    /// {@return `shaderResourceResidency` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderResourceResidencyAt(long index) { return VkPhysicalDeviceFeatures.get_shaderResourceResidency(this.segment(), index); }
    /// {@return `shaderResourceResidency`}
    public @CType("VkBool32") int shaderResourceResidency() { return VkPhysicalDeviceFeatures.get_shaderResourceResidency(this.segment()); }
    /// Sets `shaderResourceResidency` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderResourceResidency(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderResourceResidency.set(segment, 0L, index, value); }
    /// Sets `shaderResourceResidency` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderResourceResidency(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderResourceResidency(segment, 0L, value); }
    /// Sets `shaderResourceResidency` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderResourceResidencyAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderResourceResidency(this.segment(), index, value); return this; }
    /// Sets `shaderResourceResidency` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderResourceResidency(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderResourceResidency(this.segment(), value); return this; }

    /// {@return `shaderResourceMinLod` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderResourceMinLod(MemorySegment segment, long index) { return (int) VH_shaderResourceMinLod.get(segment, 0L, index); }
    /// {@return `shaderResourceMinLod`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderResourceMinLod(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_shaderResourceMinLod(segment, 0L); }
    /// {@return `shaderResourceMinLod` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderResourceMinLodAt(long index) { return VkPhysicalDeviceFeatures.get_shaderResourceMinLod(this.segment(), index); }
    /// {@return `shaderResourceMinLod`}
    public @CType("VkBool32") int shaderResourceMinLod() { return VkPhysicalDeviceFeatures.get_shaderResourceMinLod(this.segment()); }
    /// Sets `shaderResourceMinLod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderResourceMinLod(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderResourceMinLod.set(segment, 0L, index, value); }
    /// Sets `shaderResourceMinLod` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderResourceMinLod(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderResourceMinLod(segment, 0L, value); }
    /// Sets `shaderResourceMinLod` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderResourceMinLodAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderResourceMinLod(this.segment(), index, value); return this; }
    /// Sets `shaderResourceMinLod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderResourceMinLod(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_shaderResourceMinLod(this.segment(), value); return this; }

    /// {@return `sparseBinding` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sparseBinding(MemorySegment segment, long index) { return (int) VH_sparseBinding.get(segment, 0L, index); }
    /// {@return `sparseBinding`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sparseBinding(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_sparseBinding(segment, 0L); }
    /// {@return `sparseBinding` at the given index}
    /// @param index the index
    public @CType("VkBool32") int sparseBindingAt(long index) { return VkPhysicalDeviceFeatures.get_sparseBinding(this.segment(), index); }
    /// {@return `sparseBinding`}
    public @CType("VkBool32") int sparseBinding() { return VkPhysicalDeviceFeatures.get_sparseBinding(this.segment()); }
    /// Sets `sparseBinding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sparseBinding(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sparseBinding.set(segment, 0L, index, value); }
    /// Sets `sparseBinding` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sparseBinding(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseBinding(segment, 0L, value); }
    /// Sets `sparseBinding` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseBindingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseBinding(this.segment(), index, value); return this; }
    /// Sets `sparseBinding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseBinding(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseBinding(this.segment(), value); return this; }

    /// {@return `sparseResidencyBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sparseResidencyBuffer(MemorySegment segment, long index) { return (int) VH_sparseResidencyBuffer.get(segment, 0L, index); }
    /// {@return `sparseResidencyBuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sparseResidencyBuffer(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_sparseResidencyBuffer(segment, 0L); }
    /// {@return `sparseResidencyBuffer` at the given index}
    /// @param index the index
    public @CType("VkBool32") int sparseResidencyBufferAt(long index) { return VkPhysicalDeviceFeatures.get_sparseResidencyBuffer(this.segment(), index); }
    /// {@return `sparseResidencyBuffer`}
    public @CType("VkBool32") int sparseResidencyBuffer() { return VkPhysicalDeviceFeatures.get_sparseResidencyBuffer(this.segment()); }
    /// Sets `sparseResidencyBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sparseResidencyBuffer(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sparseResidencyBuffer.set(segment, 0L, index, value); }
    /// Sets `sparseResidencyBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sparseResidencyBuffer(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidencyBuffer(segment, 0L, value); }
    /// Sets `sparseResidencyBuffer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidencyBufferAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidencyBuffer(this.segment(), index, value); return this; }
    /// Sets `sparseResidencyBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidencyBuffer(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidencyBuffer(this.segment(), value); return this; }

    /// {@return `sparseResidencyImage2D` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sparseResidencyImage2D(MemorySegment segment, long index) { return (int) VH_sparseResidencyImage2D.get(segment, 0L, index); }
    /// {@return `sparseResidencyImage2D`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sparseResidencyImage2D(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_sparseResidencyImage2D(segment, 0L); }
    /// {@return `sparseResidencyImage2D` at the given index}
    /// @param index the index
    public @CType("VkBool32") int sparseResidencyImage2DAt(long index) { return VkPhysicalDeviceFeatures.get_sparseResidencyImage2D(this.segment(), index); }
    /// {@return `sparseResidencyImage2D`}
    public @CType("VkBool32") int sparseResidencyImage2D() { return VkPhysicalDeviceFeatures.get_sparseResidencyImage2D(this.segment()); }
    /// Sets `sparseResidencyImage2D` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sparseResidencyImage2D(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sparseResidencyImage2D.set(segment, 0L, index, value); }
    /// Sets `sparseResidencyImage2D` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sparseResidencyImage2D(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidencyImage2D(segment, 0L, value); }
    /// Sets `sparseResidencyImage2D` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidencyImage2DAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidencyImage2D(this.segment(), index, value); return this; }
    /// Sets `sparseResidencyImage2D` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidencyImage2D(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidencyImage2D(this.segment(), value); return this; }

    /// {@return `sparseResidencyImage3D` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sparseResidencyImage3D(MemorySegment segment, long index) { return (int) VH_sparseResidencyImage3D.get(segment, 0L, index); }
    /// {@return `sparseResidencyImage3D`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sparseResidencyImage3D(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_sparseResidencyImage3D(segment, 0L); }
    /// {@return `sparseResidencyImage3D` at the given index}
    /// @param index the index
    public @CType("VkBool32") int sparseResidencyImage3DAt(long index) { return VkPhysicalDeviceFeatures.get_sparseResidencyImage3D(this.segment(), index); }
    /// {@return `sparseResidencyImage3D`}
    public @CType("VkBool32") int sparseResidencyImage3D() { return VkPhysicalDeviceFeatures.get_sparseResidencyImage3D(this.segment()); }
    /// Sets `sparseResidencyImage3D` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sparseResidencyImage3D(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sparseResidencyImage3D.set(segment, 0L, index, value); }
    /// Sets `sparseResidencyImage3D` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sparseResidencyImage3D(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidencyImage3D(segment, 0L, value); }
    /// Sets `sparseResidencyImage3D` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidencyImage3DAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidencyImage3D(this.segment(), index, value); return this; }
    /// Sets `sparseResidencyImage3D` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidencyImage3D(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidencyImage3D(this.segment(), value); return this; }

    /// {@return `sparseResidency2Samples` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sparseResidency2Samples(MemorySegment segment, long index) { return (int) VH_sparseResidency2Samples.get(segment, 0L, index); }
    /// {@return `sparseResidency2Samples`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sparseResidency2Samples(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_sparseResidency2Samples(segment, 0L); }
    /// {@return `sparseResidency2Samples` at the given index}
    /// @param index the index
    public @CType("VkBool32") int sparseResidency2SamplesAt(long index) { return VkPhysicalDeviceFeatures.get_sparseResidency2Samples(this.segment(), index); }
    /// {@return `sparseResidency2Samples`}
    public @CType("VkBool32") int sparseResidency2Samples() { return VkPhysicalDeviceFeatures.get_sparseResidency2Samples(this.segment()); }
    /// Sets `sparseResidency2Samples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sparseResidency2Samples(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sparseResidency2Samples.set(segment, 0L, index, value); }
    /// Sets `sparseResidency2Samples` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sparseResidency2Samples(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidency2Samples(segment, 0L, value); }
    /// Sets `sparseResidency2Samples` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidency2SamplesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidency2Samples(this.segment(), index, value); return this; }
    /// Sets `sparseResidency2Samples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidency2Samples(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidency2Samples(this.segment(), value); return this; }

    /// {@return `sparseResidency4Samples` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sparseResidency4Samples(MemorySegment segment, long index) { return (int) VH_sparseResidency4Samples.get(segment, 0L, index); }
    /// {@return `sparseResidency4Samples`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sparseResidency4Samples(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_sparseResidency4Samples(segment, 0L); }
    /// {@return `sparseResidency4Samples` at the given index}
    /// @param index the index
    public @CType("VkBool32") int sparseResidency4SamplesAt(long index) { return VkPhysicalDeviceFeatures.get_sparseResidency4Samples(this.segment(), index); }
    /// {@return `sparseResidency4Samples`}
    public @CType("VkBool32") int sparseResidency4Samples() { return VkPhysicalDeviceFeatures.get_sparseResidency4Samples(this.segment()); }
    /// Sets `sparseResidency4Samples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sparseResidency4Samples(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sparseResidency4Samples.set(segment, 0L, index, value); }
    /// Sets `sparseResidency4Samples` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sparseResidency4Samples(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidency4Samples(segment, 0L, value); }
    /// Sets `sparseResidency4Samples` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidency4SamplesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidency4Samples(this.segment(), index, value); return this; }
    /// Sets `sparseResidency4Samples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidency4Samples(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidency4Samples(this.segment(), value); return this; }

    /// {@return `sparseResidency8Samples` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sparseResidency8Samples(MemorySegment segment, long index) { return (int) VH_sparseResidency8Samples.get(segment, 0L, index); }
    /// {@return `sparseResidency8Samples`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sparseResidency8Samples(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_sparseResidency8Samples(segment, 0L); }
    /// {@return `sparseResidency8Samples` at the given index}
    /// @param index the index
    public @CType("VkBool32") int sparseResidency8SamplesAt(long index) { return VkPhysicalDeviceFeatures.get_sparseResidency8Samples(this.segment(), index); }
    /// {@return `sparseResidency8Samples`}
    public @CType("VkBool32") int sparseResidency8Samples() { return VkPhysicalDeviceFeatures.get_sparseResidency8Samples(this.segment()); }
    /// Sets `sparseResidency8Samples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sparseResidency8Samples(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sparseResidency8Samples.set(segment, 0L, index, value); }
    /// Sets `sparseResidency8Samples` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sparseResidency8Samples(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidency8Samples(segment, 0L, value); }
    /// Sets `sparseResidency8Samples` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidency8SamplesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidency8Samples(this.segment(), index, value); return this; }
    /// Sets `sparseResidency8Samples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidency8Samples(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidency8Samples(this.segment(), value); return this; }

    /// {@return `sparseResidency16Samples` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sparseResidency16Samples(MemorySegment segment, long index) { return (int) VH_sparseResidency16Samples.get(segment, 0L, index); }
    /// {@return `sparseResidency16Samples`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sparseResidency16Samples(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_sparseResidency16Samples(segment, 0L); }
    /// {@return `sparseResidency16Samples` at the given index}
    /// @param index the index
    public @CType("VkBool32") int sparseResidency16SamplesAt(long index) { return VkPhysicalDeviceFeatures.get_sparseResidency16Samples(this.segment(), index); }
    /// {@return `sparseResidency16Samples`}
    public @CType("VkBool32") int sparseResidency16Samples() { return VkPhysicalDeviceFeatures.get_sparseResidency16Samples(this.segment()); }
    /// Sets `sparseResidency16Samples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sparseResidency16Samples(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sparseResidency16Samples.set(segment, 0L, index, value); }
    /// Sets `sparseResidency16Samples` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sparseResidency16Samples(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidency16Samples(segment, 0L, value); }
    /// Sets `sparseResidency16Samples` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidency16SamplesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidency16Samples(this.segment(), index, value); return this; }
    /// Sets `sparseResidency16Samples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidency16Samples(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidency16Samples(this.segment(), value); return this; }

    /// {@return `sparseResidencyAliased` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sparseResidencyAliased(MemorySegment segment, long index) { return (int) VH_sparseResidencyAliased.get(segment, 0L, index); }
    /// {@return `sparseResidencyAliased`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sparseResidencyAliased(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_sparseResidencyAliased(segment, 0L); }
    /// {@return `sparseResidencyAliased` at the given index}
    /// @param index the index
    public @CType("VkBool32") int sparseResidencyAliasedAt(long index) { return VkPhysicalDeviceFeatures.get_sparseResidencyAliased(this.segment(), index); }
    /// {@return `sparseResidencyAliased`}
    public @CType("VkBool32") int sparseResidencyAliased() { return VkPhysicalDeviceFeatures.get_sparseResidencyAliased(this.segment()); }
    /// Sets `sparseResidencyAliased` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sparseResidencyAliased(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sparseResidencyAliased.set(segment, 0L, index, value); }
    /// Sets `sparseResidencyAliased` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sparseResidencyAliased(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidencyAliased(segment, 0L, value); }
    /// Sets `sparseResidencyAliased` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidencyAliasedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidencyAliased(this.segment(), index, value); return this; }
    /// Sets `sparseResidencyAliased` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidencyAliased(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_sparseResidencyAliased(this.segment(), value); return this; }

    /// {@return `variableMultisampleRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_variableMultisampleRate(MemorySegment segment, long index) { return (int) VH_variableMultisampleRate.get(segment, 0L, index); }
    /// {@return `variableMultisampleRate`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_variableMultisampleRate(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_variableMultisampleRate(segment, 0L); }
    /// {@return `variableMultisampleRate` at the given index}
    /// @param index the index
    public @CType("VkBool32") int variableMultisampleRateAt(long index) { return VkPhysicalDeviceFeatures.get_variableMultisampleRate(this.segment(), index); }
    /// {@return `variableMultisampleRate`}
    public @CType("VkBool32") int variableMultisampleRate() { return VkPhysicalDeviceFeatures.get_variableMultisampleRate(this.segment()); }
    /// Sets `variableMultisampleRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_variableMultisampleRate(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_variableMultisampleRate.set(segment, 0L, index, value); }
    /// Sets `variableMultisampleRate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_variableMultisampleRate(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_variableMultisampleRate(segment, 0L, value); }
    /// Sets `variableMultisampleRate` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures variableMultisampleRateAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_variableMultisampleRate(this.segment(), index, value); return this; }
    /// Sets `variableMultisampleRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures variableMultisampleRate(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_variableMultisampleRate(this.segment(), value); return this; }

    /// {@return `inheritedQueries` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_inheritedQueries(MemorySegment segment, long index) { return (int) VH_inheritedQueries.get(segment, 0L, index); }
    /// {@return `inheritedQueries`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_inheritedQueries(MemorySegment segment) { return VkPhysicalDeviceFeatures.get_inheritedQueries(segment, 0L); }
    /// {@return `inheritedQueries` at the given index}
    /// @param index the index
    public @CType("VkBool32") int inheritedQueriesAt(long index) { return VkPhysicalDeviceFeatures.get_inheritedQueries(this.segment(), index); }
    /// {@return `inheritedQueries`}
    public @CType("VkBool32") int inheritedQueries() { return VkPhysicalDeviceFeatures.get_inheritedQueries(this.segment()); }
    /// Sets `inheritedQueries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_inheritedQueries(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_inheritedQueries.set(segment, 0L, index, value); }
    /// Sets `inheritedQueries` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_inheritedQueries(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_inheritedQueries(segment, 0L, value); }
    /// Sets `inheritedQueries` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures inheritedQueriesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_inheritedQueries(this.segment(), index, value); return this; }
    /// Sets `inheritedQueries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures inheritedQueries(@CType("VkBool32") int value) { VkPhysicalDeviceFeatures.set_inheritedQueries(this.segment(), value); return this; }

}
