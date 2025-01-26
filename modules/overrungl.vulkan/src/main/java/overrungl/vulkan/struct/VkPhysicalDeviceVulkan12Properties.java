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
/// struct VkPhysicalDeviceVulkan12Properties {
///     VkStructureType sType;
///     void* pNext;
///     VkDriverId driverID;
///     char driverName[256];
///     char driverInfo[256];
///     VkConformanceVersion conformanceVersion;
///     VkShaderFloatControlsIndependence denormBehaviorIndependence;
///     VkShaderFloatControlsIndependence roundingModeIndependence;
///     VkBool32 shaderSignedZeroInfNanPreserveFloat16;
///     VkBool32 shaderSignedZeroInfNanPreserveFloat32;
///     VkBool32 shaderSignedZeroInfNanPreserveFloat64;
///     VkBool32 shaderDenormPreserveFloat16;
///     VkBool32 shaderDenormPreserveFloat32;
///     VkBool32 shaderDenormPreserveFloat64;
///     VkBool32 shaderDenormFlushToZeroFloat16;
///     VkBool32 shaderDenormFlushToZeroFloat32;
///     VkBool32 shaderDenormFlushToZeroFloat64;
///     VkBool32 shaderRoundingModeRTEFloat16;
///     VkBool32 shaderRoundingModeRTEFloat32;
///     VkBool32 shaderRoundingModeRTEFloat64;
///     VkBool32 shaderRoundingModeRTZFloat16;
///     VkBool32 shaderRoundingModeRTZFloat32;
///     VkBool32 shaderRoundingModeRTZFloat64;
///     uint32_t maxUpdateAfterBindDescriptorsInAllPools;
///     VkBool32 shaderUniformBufferArrayNonUniformIndexingNative;
///     VkBool32 shaderSampledImageArrayNonUniformIndexingNative;
///     VkBool32 shaderStorageBufferArrayNonUniformIndexingNative;
///     VkBool32 shaderStorageImageArrayNonUniformIndexingNative;
///     VkBool32 shaderInputAttachmentArrayNonUniformIndexingNative;
///     VkBool32 robustBufferAccessUpdateAfterBind;
///     VkBool32 quadDivergentImplicitLod;
///     uint32_t maxPerStageDescriptorUpdateAfterBindSamplers;
///     uint32_t maxPerStageDescriptorUpdateAfterBindUniformBuffers;
///     uint32_t maxPerStageDescriptorUpdateAfterBindStorageBuffers;
///     uint32_t maxPerStageDescriptorUpdateAfterBindSampledImages;
///     uint32_t maxPerStageDescriptorUpdateAfterBindStorageImages;
///     uint32_t maxPerStageDescriptorUpdateAfterBindInputAttachments;
///     uint32_t maxPerStageUpdateAfterBindResources;
///     uint32_t maxDescriptorSetUpdateAfterBindSamplers;
///     uint32_t maxDescriptorSetUpdateAfterBindUniformBuffers;
///     uint32_t maxDescriptorSetUpdateAfterBindUniformBuffersDynamic;
///     uint32_t maxDescriptorSetUpdateAfterBindStorageBuffers;
///     uint32_t maxDescriptorSetUpdateAfterBindStorageBuffersDynamic;
///     uint32_t maxDescriptorSetUpdateAfterBindSampledImages;
///     uint32_t maxDescriptorSetUpdateAfterBindStorageImages;
///     uint32_t maxDescriptorSetUpdateAfterBindInputAttachments;
///     VkResolveModeFlags supportedDepthResolveModes;
///     VkResolveModeFlags supportedStencilResolveModes;
///     VkBool32 independentResolveNone;
///     VkBool32 independentResolve;
///     VkBool32 filterMinmaxSingleComponentFormats;
///     VkBool32 filterMinmaxImageComponentMapping;
///     uint64_t maxTimelineSemaphoreValueDifference;
///     VkSampleCountFlags framebufferIntegerColorSampleCounts;
/// };
/// ```
public sealed class VkPhysicalDeviceVulkan12Properties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceVulkan12Properties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("driverID"),
        MemoryLayout.sequenceLayout(256L, ValueLayout.JAVA_BYTE).withName("driverName"),
        MemoryLayout.sequenceLayout(256L, ValueLayout.JAVA_BYTE).withName("driverInfo"),
        overrungl.vulkan.struct.VkConformanceVersion.LAYOUT.withName("conformanceVersion"),
        ValueLayout.JAVA_INT.withName("denormBehaviorIndependence"),
        ValueLayout.JAVA_INT.withName("roundingModeIndependence"),
        ValueLayout.JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat16"),
        ValueLayout.JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat32"),
        ValueLayout.JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat64"),
        ValueLayout.JAVA_INT.withName("shaderDenormPreserveFloat16"),
        ValueLayout.JAVA_INT.withName("shaderDenormPreserveFloat32"),
        ValueLayout.JAVA_INT.withName("shaderDenormPreserveFloat64"),
        ValueLayout.JAVA_INT.withName("shaderDenormFlushToZeroFloat16"),
        ValueLayout.JAVA_INT.withName("shaderDenormFlushToZeroFloat32"),
        ValueLayout.JAVA_INT.withName("shaderDenormFlushToZeroFloat64"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTEFloat16"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTEFloat32"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTEFloat64"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTZFloat16"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTZFloat32"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTZFloat64"),
        ValueLayout.JAVA_INT.withName("maxUpdateAfterBindDescriptorsInAllPools"),
        ValueLayout.JAVA_INT.withName("shaderUniformBufferArrayNonUniformIndexingNative"),
        ValueLayout.JAVA_INT.withName("shaderSampledImageArrayNonUniformIndexingNative"),
        ValueLayout.JAVA_INT.withName("shaderStorageBufferArrayNonUniformIndexingNative"),
        ValueLayout.JAVA_INT.withName("shaderStorageImageArrayNonUniformIndexingNative"),
        ValueLayout.JAVA_INT.withName("shaderInputAttachmentArrayNonUniformIndexingNative"),
        ValueLayout.JAVA_INT.withName("robustBufferAccessUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("quadDivergentImplicitLod"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindSamplers"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindUniformBuffers"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindStorageBuffers"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindSampledImages"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindStorageImages"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindInputAttachments"),
        ValueLayout.JAVA_INT.withName("maxPerStageUpdateAfterBindResources"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindSamplers"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindUniformBuffers"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindStorageBuffers"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindSampledImages"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindStorageImages"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindInputAttachments"),
        ValueLayout.JAVA_INT.withName("supportedDepthResolveModes"),
        ValueLayout.JAVA_INT.withName("supportedStencilResolveModes"),
        ValueLayout.JAVA_INT.withName("independentResolveNone"),
        ValueLayout.JAVA_INT.withName("independentResolve"),
        ValueLayout.JAVA_INT.withName("filterMinmaxSingleComponentFormats"),
        ValueLayout.JAVA_INT.withName("filterMinmaxImageComponentMapping"),
        ValueLayout.JAVA_LONG.withName("maxTimelineSemaphoreValueDifference"),
        ValueLayout.JAVA_INT.withName("framebufferIntegerColorSampleCounts")
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
    /// The byte offset of `driverID`.
    public static final long OFFSET_driverID = LAYOUT.byteOffset(PathElement.groupElement("driverID"));
    /// The memory layout of `driverID`.
    public static final MemoryLayout LAYOUT_driverID = LAYOUT.select(PathElement.groupElement("driverID"));
    /// The [VarHandle] of `driverID` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_driverID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverID"));
    /// The byte offset of `driverName`.
    public static final long OFFSET_driverName = LAYOUT.byteOffset(PathElement.groupElement("driverName"));
    /// The memory layout of `driverName`.
    public static final MemoryLayout LAYOUT_driverName = LAYOUT.select(PathElement.groupElement("driverName"));
    /// The [VarHandle] of `driverName` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_driverName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverName"), PathElement.sequenceElement());
    /// The byte offset of `driverInfo`.
    public static final long OFFSET_driverInfo = LAYOUT.byteOffset(PathElement.groupElement("driverInfo"));
    /// The memory layout of `driverInfo`.
    public static final MemoryLayout LAYOUT_driverInfo = LAYOUT.select(PathElement.groupElement("driverInfo"));
    /// The [VarHandle] of `driverInfo` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_driverInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverInfo"), PathElement.sequenceElement());
    /// The byte offset of `conformanceVersion`.
    public static final long OFFSET_conformanceVersion = LAYOUT.byteOffset(PathElement.groupElement("conformanceVersion"));
    /// The memory layout of `conformanceVersion`.
    public static final MemoryLayout LAYOUT_conformanceVersion = LAYOUT.select(PathElement.groupElement("conformanceVersion"));
    /// The byte offset of `denormBehaviorIndependence`.
    public static final long OFFSET_denormBehaviorIndependence = LAYOUT.byteOffset(PathElement.groupElement("denormBehaviorIndependence"));
    /// The memory layout of `denormBehaviorIndependence`.
    public static final MemoryLayout LAYOUT_denormBehaviorIndependence = LAYOUT.select(PathElement.groupElement("denormBehaviorIndependence"));
    /// The [VarHandle] of `denormBehaviorIndependence` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_denormBehaviorIndependence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("denormBehaviorIndependence"));
    /// The byte offset of `roundingModeIndependence`.
    public static final long OFFSET_roundingModeIndependence = LAYOUT.byteOffset(PathElement.groupElement("roundingModeIndependence"));
    /// The memory layout of `roundingModeIndependence`.
    public static final MemoryLayout LAYOUT_roundingModeIndependence = LAYOUT.select(PathElement.groupElement("roundingModeIndependence"));
    /// The [VarHandle] of `roundingModeIndependence` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_roundingModeIndependence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("roundingModeIndependence"));
    /// The byte offset of `shaderSignedZeroInfNanPreserveFloat16`.
    public static final long OFFSET_shaderSignedZeroInfNanPreserveFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat16"));
    /// The memory layout of `shaderSignedZeroInfNanPreserveFloat16`.
    public static final MemoryLayout LAYOUT_shaderSignedZeroInfNanPreserveFloat16 = LAYOUT.select(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat16"));
    /// The [VarHandle] of `shaderSignedZeroInfNanPreserveFloat16` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderSignedZeroInfNanPreserveFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat16"));
    /// The byte offset of `shaderSignedZeroInfNanPreserveFloat32`.
    public static final long OFFSET_shaderSignedZeroInfNanPreserveFloat32 = LAYOUT.byteOffset(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat32"));
    /// The memory layout of `shaderSignedZeroInfNanPreserveFloat32`.
    public static final MemoryLayout LAYOUT_shaderSignedZeroInfNanPreserveFloat32 = LAYOUT.select(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat32"));
    /// The [VarHandle] of `shaderSignedZeroInfNanPreserveFloat32` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderSignedZeroInfNanPreserveFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat32"));
    /// The byte offset of `shaderSignedZeroInfNanPreserveFloat64`.
    public static final long OFFSET_shaderSignedZeroInfNanPreserveFloat64 = LAYOUT.byteOffset(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat64"));
    /// The memory layout of `shaderSignedZeroInfNanPreserveFloat64`.
    public static final MemoryLayout LAYOUT_shaderSignedZeroInfNanPreserveFloat64 = LAYOUT.select(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat64"));
    /// The [VarHandle] of `shaderSignedZeroInfNanPreserveFloat64` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderSignedZeroInfNanPreserveFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat64"));
    /// The byte offset of `shaderDenormPreserveFloat16`.
    public static final long OFFSET_shaderDenormPreserveFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormPreserveFloat16"));
    /// The memory layout of `shaderDenormPreserveFloat16`.
    public static final MemoryLayout LAYOUT_shaderDenormPreserveFloat16 = LAYOUT.select(PathElement.groupElement("shaderDenormPreserveFloat16"));
    /// The [VarHandle] of `shaderDenormPreserveFloat16` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderDenormPreserveFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormPreserveFloat16"));
    /// The byte offset of `shaderDenormPreserveFloat32`.
    public static final long OFFSET_shaderDenormPreserveFloat32 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormPreserveFloat32"));
    /// The memory layout of `shaderDenormPreserveFloat32`.
    public static final MemoryLayout LAYOUT_shaderDenormPreserveFloat32 = LAYOUT.select(PathElement.groupElement("shaderDenormPreserveFloat32"));
    /// The [VarHandle] of `shaderDenormPreserveFloat32` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderDenormPreserveFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormPreserveFloat32"));
    /// The byte offset of `shaderDenormPreserveFloat64`.
    public static final long OFFSET_shaderDenormPreserveFloat64 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormPreserveFloat64"));
    /// The memory layout of `shaderDenormPreserveFloat64`.
    public static final MemoryLayout LAYOUT_shaderDenormPreserveFloat64 = LAYOUT.select(PathElement.groupElement("shaderDenormPreserveFloat64"));
    /// The [VarHandle] of `shaderDenormPreserveFloat64` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderDenormPreserveFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormPreserveFloat64"));
    /// The byte offset of `shaderDenormFlushToZeroFloat16`.
    public static final long OFFSET_shaderDenormFlushToZeroFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormFlushToZeroFloat16"));
    /// The memory layout of `shaderDenormFlushToZeroFloat16`.
    public static final MemoryLayout LAYOUT_shaderDenormFlushToZeroFloat16 = LAYOUT.select(PathElement.groupElement("shaderDenormFlushToZeroFloat16"));
    /// The [VarHandle] of `shaderDenormFlushToZeroFloat16` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderDenormFlushToZeroFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat16"));
    /// The byte offset of `shaderDenormFlushToZeroFloat32`.
    public static final long OFFSET_shaderDenormFlushToZeroFloat32 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormFlushToZeroFloat32"));
    /// The memory layout of `shaderDenormFlushToZeroFloat32`.
    public static final MemoryLayout LAYOUT_shaderDenormFlushToZeroFloat32 = LAYOUT.select(PathElement.groupElement("shaderDenormFlushToZeroFloat32"));
    /// The [VarHandle] of `shaderDenormFlushToZeroFloat32` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderDenormFlushToZeroFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat32"));
    /// The byte offset of `shaderDenormFlushToZeroFloat64`.
    public static final long OFFSET_shaderDenormFlushToZeroFloat64 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormFlushToZeroFloat64"));
    /// The memory layout of `shaderDenormFlushToZeroFloat64`.
    public static final MemoryLayout LAYOUT_shaderDenormFlushToZeroFloat64 = LAYOUT.select(PathElement.groupElement("shaderDenormFlushToZeroFloat64"));
    /// The [VarHandle] of `shaderDenormFlushToZeroFloat64` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderDenormFlushToZeroFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat64"));
    /// The byte offset of `shaderRoundingModeRTEFloat16`.
    public static final long OFFSET_shaderRoundingModeRTEFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTEFloat16"));
    /// The memory layout of `shaderRoundingModeRTEFloat16`.
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTEFloat16 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTEFloat16"));
    /// The [VarHandle] of `shaderRoundingModeRTEFloat16` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderRoundingModeRTEFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTEFloat16"));
    /// The byte offset of `shaderRoundingModeRTEFloat32`.
    public static final long OFFSET_shaderRoundingModeRTEFloat32 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTEFloat32"));
    /// The memory layout of `shaderRoundingModeRTEFloat32`.
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTEFloat32 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTEFloat32"));
    /// The [VarHandle] of `shaderRoundingModeRTEFloat32` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderRoundingModeRTEFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTEFloat32"));
    /// The byte offset of `shaderRoundingModeRTEFloat64`.
    public static final long OFFSET_shaderRoundingModeRTEFloat64 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTEFloat64"));
    /// The memory layout of `shaderRoundingModeRTEFloat64`.
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTEFloat64 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTEFloat64"));
    /// The [VarHandle] of `shaderRoundingModeRTEFloat64` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderRoundingModeRTEFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTEFloat64"));
    /// The byte offset of `shaderRoundingModeRTZFloat16`.
    public static final long OFFSET_shaderRoundingModeRTZFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTZFloat16"));
    /// The memory layout of `shaderRoundingModeRTZFloat16`.
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTZFloat16 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTZFloat16"));
    /// The [VarHandle] of `shaderRoundingModeRTZFloat16` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderRoundingModeRTZFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTZFloat16"));
    /// The byte offset of `shaderRoundingModeRTZFloat32`.
    public static final long OFFSET_shaderRoundingModeRTZFloat32 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTZFloat32"));
    /// The memory layout of `shaderRoundingModeRTZFloat32`.
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTZFloat32 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTZFloat32"));
    /// The [VarHandle] of `shaderRoundingModeRTZFloat32` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderRoundingModeRTZFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTZFloat32"));
    /// The byte offset of `shaderRoundingModeRTZFloat64`.
    public static final long OFFSET_shaderRoundingModeRTZFloat64 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTZFloat64"));
    /// The memory layout of `shaderRoundingModeRTZFloat64`.
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTZFloat64 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTZFloat64"));
    /// The [VarHandle] of `shaderRoundingModeRTZFloat64` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderRoundingModeRTZFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTZFloat64"));
    /// The byte offset of `maxUpdateAfterBindDescriptorsInAllPools`.
    public static final long OFFSET_maxUpdateAfterBindDescriptorsInAllPools = LAYOUT.byteOffset(PathElement.groupElement("maxUpdateAfterBindDescriptorsInAllPools"));
    /// The memory layout of `maxUpdateAfterBindDescriptorsInAllPools`.
    public static final MemoryLayout LAYOUT_maxUpdateAfterBindDescriptorsInAllPools = LAYOUT.select(PathElement.groupElement("maxUpdateAfterBindDescriptorsInAllPools"));
    /// The [VarHandle] of `maxUpdateAfterBindDescriptorsInAllPools` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxUpdateAfterBindDescriptorsInAllPools = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxUpdateAfterBindDescriptorsInAllPools"));
    /// The byte offset of `shaderUniformBufferArrayNonUniformIndexingNative`.
    public static final long OFFSET_shaderUniformBufferArrayNonUniformIndexingNative = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexingNative"));
    /// The memory layout of `shaderUniformBufferArrayNonUniformIndexingNative`.
    public static final MemoryLayout LAYOUT_shaderUniformBufferArrayNonUniformIndexingNative = LAYOUT.select(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexingNative"));
    /// The [VarHandle] of `shaderUniformBufferArrayNonUniformIndexingNative` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderUniformBufferArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexingNative"));
    /// The byte offset of `shaderSampledImageArrayNonUniformIndexingNative`.
    public static final long OFFSET_shaderSampledImageArrayNonUniformIndexingNative = LAYOUT.byteOffset(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexingNative"));
    /// The memory layout of `shaderSampledImageArrayNonUniformIndexingNative`.
    public static final MemoryLayout LAYOUT_shaderSampledImageArrayNonUniformIndexingNative = LAYOUT.select(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexingNative"));
    /// The [VarHandle] of `shaderSampledImageArrayNonUniformIndexingNative` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderSampledImageArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexingNative"));
    /// The byte offset of `shaderStorageBufferArrayNonUniformIndexingNative`.
    public static final long OFFSET_shaderStorageBufferArrayNonUniformIndexingNative = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexingNative"));
    /// The memory layout of `shaderStorageBufferArrayNonUniformIndexingNative`.
    public static final MemoryLayout LAYOUT_shaderStorageBufferArrayNonUniformIndexingNative = LAYOUT.select(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexingNative"));
    /// The [VarHandle] of `shaderStorageBufferArrayNonUniformIndexingNative` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderStorageBufferArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexingNative"));
    /// The byte offset of `shaderStorageImageArrayNonUniformIndexingNative`.
    public static final long OFFSET_shaderStorageImageArrayNonUniformIndexingNative = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexingNative"));
    /// The memory layout of `shaderStorageImageArrayNonUniformIndexingNative`.
    public static final MemoryLayout LAYOUT_shaderStorageImageArrayNonUniformIndexingNative = LAYOUT.select(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexingNative"));
    /// The [VarHandle] of `shaderStorageImageArrayNonUniformIndexingNative` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderStorageImageArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexingNative"));
    /// The byte offset of `shaderInputAttachmentArrayNonUniformIndexingNative`.
    public static final long OFFSET_shaderInputAttachmentArrayNonUniformIndexingNative = LAYOUT.byteOffset(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexingNative"));
    /// The memory layout of `shaderInputAttachmentArrayNonUniformIndexingNative`.
    public static final MemoryLayout LAYOUT_shaderInputAttachmentArrayNonUniformIndexingNative = LAYOUT.select(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexingNative"));
    /// The [VarHandle] of `shaderInputAttachmentArrayNonUniformIndexingNative` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderInputAttachmentArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexingNative"));
    /// The byte offset of `robustBufferAccessUpdateAfterBind`.
    public static final long OFFSET_robustBufferAccessUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("robustBufferAccessUpdateAfterBind"));
    /// The memory layout of `robustBufferAccessUpdateAfterBind`.
    public static final MemoryLayout LAYOUT_robustBufferAccessUpdateAfterBind = LAYOUT.select(PathElement.groupElement("robustBufferAccessUpdateAfterBind"));
    /// The [VarHandle] of `robustBufferAccessUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_robustBufferAccessUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustBufferAccessUpdateAfterBind"));
    /// The byte offset of `quadDivergentImplicitLod`.
    public static final long OFFSET_quadDivergentImplicitLod = LAYOUT.byteOffset(PathElement.groupElement("quadDivergentImplicitLod"));
    /// The memory layout of `quadDivergentImplicitLod`.
    public static final MemoryLayout LAYOUT_quadDivergentImplicitLod = LAYOUT.select(PathElement.groupElement("quadDivergentImplicitLod"));
    /// The [VarHandle] of `quadDivergentImplicitLod` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_quadDivergentImplicitLod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("quadDivergentImplicitLod"));
    /// The byte offset of `maxPerStageDescriptorUpdateAfterBindSamplers`.
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindSamplers = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSamplers"));
    /// The memory layout of `maxPerStageDescriptorUpdateAfterBindSamplers`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindSamplers = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSamplers"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindSamplers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSamplers"));
    /// The byte offset of `maxPerStageDescriptorUpdateAfterBindUniformBuffers`.
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindUniformBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindUniformBuffers"));
    /// The memory layout of `maxPerStageDescriptorUpdateAfterBindUniformBuffers`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindUniformBuffers = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindUniformBuffers"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindUniformBuffers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindUniformBuffers"));
    /// The byte offset of `maxPerStageDescriptorUpdateAfterBindStorageBuffers`.
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindStorageBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageBuffers"));
    /// The memory layout of `maxPerStageDescriptorUpdateAfterBindStorageBuffers`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindStorageBuffers = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageBuffers"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindStorageBuffers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageBuffers"));
    /// The byte offset of `maxPerStageDescriptorUpdateAfterBindSampledImages`.
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindSampledImages = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSampledImages"));
    /// The memory layout of `maxPerStageDescriptorUpdateAfterBindSampledImages`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindSampledImages = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSampledImages"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindSampledImages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindSampledImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSampledImages"));
    /// The byte offset of `maxPerStageDescriptorUpdateAfterBindStorageImages`.
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindStorageImages = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageImages"));
    /// The memory layout of `maxPerStageDescriptorUpdateAfterBindStorageImages`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindStorageImages = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageImages"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindStorageImages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindStorageImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageImages"));
    /// The byte offset of `maxPerStageDescriptorUpdateAfterBindInputAttachments`.
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindInputAttachments = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInputAttachments"));
    /// The memory layout of `maxPerStageDescriptorUpdateAfterBindInputAttachments`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindInputAttachments = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInputAttachments"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindInputAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInputAttachments"));
    /// The byte offset of `maxPerStageUpdateAfterBindResources`.
    public static final long OFFSET_maxPerStageUpdateAfterBindResources = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageUpdateAfterBindResources"));
    /// The memory layout of `maxPerStageUpdateAfterBindResources`.
    public static final MemoryLayout LAYOUT_maxPerStageUpdateAfterBindResources = LAYOUT.select(PathElement.groupElement("maxPerStageUpdateAfterBindResources"));
    /// The [VarHandle] of `maxPerStageUpdateAfterBindResources` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPerStageUpdateAfterBindResources = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageUpdateAfterBindResources"));
    /// The byte offset of `maxDescriptorSetUpdateAfterBindSamplers`.
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindSamplers = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSamplers"));
    /// The memory layout of `maxDescriptorSetUpdateAfterBindSamplers`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindSamplers = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSamplers"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindSamplers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSamplers"));
    /// The byte offset of `maxDescriptorSetUpdateAfterBindUniformBuffers`.
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindUniformBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffers"));
    /// The memory layout of `maxDescriptorSetUpdateAfterBindUniformBuffers`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindUniformBuffers = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffers"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindUniformBuffers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffers"));
    /// The byte offset of `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic`.
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic"));
    /// The memory layout of `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic"));
    /// The byte offset of `maxDescriptorSetUpdateAfterBindStorageBuffers`.
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindStorageBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffers"));
    /// The memory layout of `maxDescriptorSetUpdateAfterBindStorageBuffers`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindStorageBuffers = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffers"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindStorageBuffers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffers"));
    /// The byte offset of `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic`.
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic"));
    /// The memory layout of `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic"));
    /// The byte offset of `maxDescriptorSetUpdateAfterBindSampledImages`.
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindSampledImages = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSampledImages"));
    /// The memory layout of `maxDescriptorSetUpdateAfterBindSampledImages`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindSampledImages = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSampledImages"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindSampledImages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindSampledImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSampledImages"));
    /// The byte offset of `maxDescriptorSetUpdateAfterBindStorageImages`.
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindStorageImages = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageImages"));
    /// The memory layout of `maxDescriptorSetUpdateAfterBindStorageImages`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindStorageImages = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageImages"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindStorageImages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindStorageImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageImages"));
    /// The byte offset of `maxDescriptorSetUpdateAfterBindInputAttachments`.
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindInputAttachments = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInputAttachments"));
    /// The memory layout of `maxDescriptorSetUpdateAfterBindInputAttachments`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindInputAttachments = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInputAttachments"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindInputAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInputAttachments"));
    /// The byte offset of `supportedDepthResolveModes`.
    public static final long OFFSET_supportedDepthResolveModes = LAYOUT.byteOffset(PathElement.groupElement("supportedDepthResolveModes"));
    /// The memory layout of `supportedDepthResolveModes`.
    public static final MemoryLayout LAYOUT_supportedDepthResolveModes = LAYOUT.select(PathElement.groupElement("supportedDepthResolveModes"));
    /// The [VarHandle] of `supportedDepthResolveModes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportedDepthResolveModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedDepthResolveModes"));
    /// The byte offset of `supportedStencilResolveModes`.
    public static final long OFFSET_supportedStencilResolveModes = LAYOUT.byteOffset(PathElement.groupElement("supportedStencilResolveModes"));
    /// The memory layout of `supportedStencilResolveModes`.
    public static final MemoryLayout LAYOUT_supportedStencilResolveModes = LAYOUT.select(PathElement.groupElement("supportedStencilResolveModes"));
    /// The [VarHandle] of `supportedStencilResolveModes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportedStencilResolveModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedStencilResolveModes"));
    /// The byte offset of `independentResolveNone`.
    public static final long OFFSET_independentResolveNone = LAYOUT.byteOffset(PathElement.groupElement("independentResolveNone"));
    /// The memory layout of `independentResolveNone`.
    public static final MemoryLayout LAYOUT_independentResolveNone = LAYOUT.select(PathElement.groupElement("independentResolveNone"));
    /// The [VarHandle] of `independentResolveNone` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_independentResolveNone = LAYOUT.arrayElementVarHandle(PathElement.groupElement("independentResolveNone"));
    /// The byte offset of `independentResolve`.
    public static final long OFFSET_independentResolve = LAYOUT.byteOffset(PathElement.groupElement("independentResolve"));
    /// The memory layout of `independentResolve`.
    public static final MemoryLayout LAYOUT_independentResolve = LAYOUT.select(PathElement.groupElement("independentResolve"));
    /// The [VarHandle] of `independentResolve` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_independentResolve = LAYOUT.arrayElementVarHandle(PathElement.groupElement("independentResolve"));
    /// The byte offset of `filterMinmaxSingleComponentFormats`.
    public static final long OFFSET_filterMinmaxSingleComponentFormats = LAYOUT.byteOffset(PathElement.groupElement("filterMinmaxSingleComponentFormats"));
    /// The memory layout of `filterMinmaxSingleComponentFormats`.
    public static final MemoryLayout LAYOUT_filterMinmaxSingleComponentFormats = LAYOUT.select(PathElement.groupElement("filterMinmaxSingleComponentFormats"));
    /// The [VarHandle] of `filterMinmaxSingleComponentFormats` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_filterMinmaxSingleComponentFormats = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterMinmaxSingleComponentFormats"));
    /// The byte offset of `filterMinmaxImageComponentMapping`.
    public static final long OFFSET_filterMinmaxImageComponentMapping = LAYOUT.byteOffset(PathElement.groupElement("filterMinmaxImageComponentMapping"));
    /// The memory layout of `filterMinmaxImageComponentMapping`.
    public static final MemoryLayout LAYOUT_filterMinmaxImageComponentMapping = LAYOUT.select(PathElement.groupElement("filterMinmaxImageComponentMapping"));
    /// The [VarHandle] of `filterMinmaxImageComponentMapping` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_filterMinmaxImageComponentMapping = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterMinmaxImageComponentMapping"));
    /// The byte offset of `maxTimelineSemaphoreValueDifference`.
    public static final long OFFSET_maxTimelineSemaphoreValueDifference = LAYOUT.byteOffset(PathElement.groupElement("maxTimelineSemaphoreValueDifference"));
    /// The memory layout of `maxTimelineSemaphoreValueDifference`.
    public static final MemoryLayout LAYOUT_maxTimelineSemaphoreValueDifference = LAYOUT.select(PathElement.groupElement("maxTimelineSemaphoreValueDifference"));
    /// The [VarHandle] of `maxTimelineSemaphoreValueDifference` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTimelineSemaphoreValueDifference = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTimelineSemaphoreValueDifference"));
    /// The byte offset of `framebufferIntegerColorSampleCounts`.
    public static final long OFFSET_framebufferIntegerColorSampleCounts = LAYOUT.byteOffset(PathElement.groupElement("framebufferIntegerColorSampleCounts"));
    /// The memory layout of `framebufferIntegerColorSampleCounts`.
    public static final MemoryLayout LAYOUT_framebufferIntegerColorSampleCounts = LAYOUT.select(PathElement.groupElement("framebufferIntegerColorSampleCounts"));
    /// The [VarHandle] of `framebufferIntegerColorSampleCounts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_framebufferIntegerColorSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebufferIntegerColorSampleCounts"));

    /// Creates `VkPhysicalDeviceVulkan12Properties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceVulkan12Properties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceVulkan12Properties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVulkan12Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan12Properties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan12Properties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceVulkan12Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceVulkan12Properties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkan12Properties`
    public static VkPhysicalDeviceVulkan12Properties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan12Properties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceVulkan12Properties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVulkan12Properties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties copyFrom(VkPhysicalDeviceVulkan12Properties src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceVulkan12Properties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan12Properties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `driverID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int driverID(MemorySegment segment, long index) { return (int) VH_driverID.get(segment, 0L, index); }
    /// {@return `driverID`}
    public int driverID() { return driverID(this.segment(), 0L); }
    /// Sets `driverID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void driverID(MemorySegment segment, long index, int value) { VH_driverID.set(segment, 0L, index, value); }
    /// Sets `driverID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties driverID(int value) { driverID(this.segment(), 0L, value); return this; }

    /// {@return `driverName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment driverName(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_driverName, index), LAYOUT_driverName); }
    /// {@return `driverName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte driverName(MemorySegment segment, long index, long index0) { return (byte) VH_driverName.get(segment, 0L, index, index0); }
    /// {@return `driverName`}
    public MemorySegment driverName() { return driverName(this.segment(), 0L); }
    /// {@return `driverName`}
    /// @param index0 the Index 0 of the array
    public byte driverName(long index0) { return driverName(this.segment(), 0L, index0); }
    /// Sets `driverName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void driverName(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_driverName, index), LAYOUT_driverName.byteSize()); }
    /// Sets `driverName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void driverName(MemorySegment segment, long index, long index0, byte value) { VH_driverName.set(segment, 0L, index, index0, value); }
    /// Sets `driverName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties driverName(MemorySegment value) { driverName(this.segment(), 0L, value); return this; }
    /// Sets `driverName` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties driverName(long index0, byte value) { driverName(this.segment(), 0L, index0, value); return this; }

    /// {@return `driverInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment driverInfo(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_driverInfo, index), LAYOUT_driverInfo); }
    /// {@return `driverInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte driverInfo(MemorySegment segment, long index, long index0) { return (byte) VH_driverInfo.get(segment, 0L, index, index0); }
    /// {@return `driverInfo`}
    public MemorySegment driverInfo() { return driverInfo(this.segment(), 0L); }
    /// {@return `driverInfo`}
    /// @param index0 the Index 0 of the array
    public byte driverInfo(long index0) { return driverInfo(this.segment(), 0L, index0); }
    /// Sets `driverInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void driverInfo(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_driverInfo, index), LAYOUT_driverInfo.byteSize()); }
    /// Sets `driverInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void driverInfo(MemorySegment segment, long index, long index0, byte value) { VH_driverInfo.set(segment, 0L, index, index0, value); }
    /// Sets `driverInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties driverInfo(MemorySegment value) { driverInfo(this.segment(), 0L, value); return this; }
    /// Sets `driverInfo` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties driverInfo(long index0, byte value) { driverInfo(this.segment(), 0L, index0, value); return this; }

    /// {@return `conformanceVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment conformanceVersion(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_conformanceVersion, index), LAYOUT_conformanceVersion); }
    /// {@return `conformanceVersion`}
    public MemorySegment conformanceVersion() { return conformanceVersion(this.segment(), 0L); }
    /// Sets `conformanceVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void conformanceVersion(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_conformanceVersion, index), LAYOUT_conformanceVersion.byteSize()); }
    /// Sets `conformanceVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties conformanceVersion(MemorySegment value) { conformanceVersion(this.segment(), 0L, value); return this; }

    /// {@return `denormBehaviorIndependence` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int denormBehaviorIndependence(MemorySegment segment, long index) { return (int) VH_denormBehaviorIndependence.get(segment, 0L, index); }
    /// {@return `denormBehaviorIndependence`}
    public int denormBehaviorIndependence() { return denormBehaviorIndependence(this.segment(), 0L); }
    /// Sets `denormBehaviorIndependence` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void denormBehaviorIndependence(MemorySegment segment, long index, int value) { VH_denormBehaviorIndependence.set(segment, 0L, index, value); }
    /// Sets `denormBehaviorIndependence` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties denormBehaviorIndependence(int value) { denormBehaviorIndependence(this.segment(), 0L, value); return this; }

    /// {@return `roundingModeIndependence` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int roundingModeIndependence(MemorySegment segment, long index) { return (int) VH_roundingModeIndependence.get(segment, 0L, index); }
    /// {@return `roundingModeIndependence`}
    public int roundingModeIndependence() { return roundingModeIndependence(this.segment(), 0L); }
    /// Sets `roundingModeIndependence` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void roundingModeIndependence(MemorySegment segment, long index, int value) { VH_roundingModeIndependence.set(segment, 0L, index, value); }
    /// Sets `roundingModeIndependence` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties roundingModeIndependence(int value) { roundingModeIndependence(this.segment(), 0L, value); return this; }

    /// {@return `shaderSignedZeroInfNanPreserveFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSignedZeroInfNanPreserveFloat16(MemorySegment segment, long index) { return (int) VH_shaderSignedZeroInfNanPreserveFloat16.get(segment, 0L, index); }
    /// {@return `shaderSignedZeroInfNanPreserveFloat16`}
    public int shaderSignedZeroInfNanPreserveFloat16() { return shaderSignedZeroInfNanPreserveFloat16(this.segment(), 0L); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSignedZeroInfNanPreserveFloat16(MemorySegment segment, long index, int value) { VH_shaderSignedZeroInfNanPreserveFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderSignedZeroInfNanPreserveFloat16(int value) { shaderSignedZeroInfNanPreserveFloat16(this.segment(), 0L, value); return this; }

    /// {@return `shaderSignedZeroInfNanPreserveFloat32` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSignedZeroInfNanPreserveFloat32(MemorySegment segment, long index) { return (int) VH_shaderSignedZeroInfNanPreserveFloat32.get(segment, 0L, index); }
    /// {@return `shaderSignedZeroInfNanPreserveFloat32`}
    public int shaderSignedZeroInfNanPreserveFloat32() { return shaderSignedZeroInfNanPreserveFloat32(this.segment(), 0L); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSignedZeroInfNanPreserveFloat32(MemorySegment segment, long index, int value) { VH_shaderSignedZeroInfNanPreserveFloat32.set(segment, 0L, index, value); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderSignedZeroInfNanPreserveFloat32(int value) { shaderSignedZeroInfNanPreserveFloat32(this.segment(), 0L, value); return this; }

    /// {@return `shaderSignedZeroInfNanPreserveFloat64` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSignedZeroInfNanPreserveFloat64(MemorySegment segment, long index) { return (int) VH_shaderSignedZeroInfNanPreserveFloat64.get(segment, 0L, index); }
    /// {@return `shaderSignedZeroInfNanPreserveFloat64`}
    public int shaderSignedZeroInfNanPreserveFloat64() { return shaderSignedZeroInfNanPreserveFloat64(this.segment(), 0L); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSignedZeroInfNanPreserveFloat64(MemorySegment segment, long index, int value) { VH_shaderSignedZeroInfNanPreserveFloat64.set(segment, 0L, index, value); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderSignedZeroInfNanPreserveFloat64(int value) { shaderSignedZeroInfNanPreserveFloat64(this.segment(), 0L, value); return this; }

    /// {@return `shaderDenormPreserveFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderDenormPreserveFloat16(MemorySegment segment, long index) { return (int) VH_shaderDenormPreserveFloat16.get(segment, 0L, index); }
    /// {@return `shaderDenormPreserveFloat16`}
    public int shaderDenormPreserveFloat16() { return shaderDenormPreserveFloat16(this.segment(), 0L); }
    /// Sets `shaderDenormPreserveFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderDenormPreserveFloat16(MemorySegment segment, long index, int value) { VH_shaderDenormPreserveFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderDenormPreserveFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderDenormPreserveFloat16(int value) { shaderDenormPreserveFloat16(this.segment(), 0L, value); return this; }

    /// {@return `shaderDenormPreserveFloat32` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderDenormPreserveFloat32(MemorySegment segment, long index) { return (int) VH_shaderDenormPreserveFloat32.get(segment, 0L, index); }
    /// {@return `shaderDenormPreserveFloat32`}
    public int shaderDenormPreserveFloat32() { return shaderDenormPreserveFloat32(this.segment(), 0L); }
    /// Sets `shaderDenormPreserveFloat32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderDenormPreserveFloat32(MemorySegment segment, long index, int value) { VH_shaderDenormPreserveFloat32.set(segment, 0L, index, value); }
    /// Sets `shaderDenormPreserveFloat32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderDenormPreserveFloat32(int value) { shaderDenormPreserveFloat32(this.segment(), 0L, value); return this; }

    /// {@return `shaderDenormPreserveFloat64` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderDenormPreserveFloat64(MemorySegment segment, long index) { return (int) VH_shaderDenormPreserveFloat64.get(segment, 0L, index); }
    /// {@return `shaderDenormPreserveFloat64`}
    public int shaderDenormPreserveFloat64() { return shaderDenormPreserveFloat64(this.segment(), 0L); }
    /// Sets `shaderDenormPreserveFloat64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderDenormPreserveFloat64(MemorySegment segment, long index, int value) { VH_shaderDenormPreserveFloat64.set(segment, 0L, index, value); }
    /// Sets `shaderDenormPreserveFloat64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderDenormPreserveFloat64(int value) { shaderDenormPreserveFloat64(this.segment(), 0L, value); return this; }

    /// {@return `shaderDenormFlushToZeroFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderDenormFlushToZeroFloat16(MemorySegment segment, long index) { return (int) VH_shaderDenormFlushToZeroFloat16.get(segment, 0L, index); }
    /// {@return `shaderDenormFlushToZeroFloat16`}
    public int shaderDenormFlushToZeroFloat16() { return shaderDenormFlushToZeroFloat16(this.segment(), 0L); }
    /// Sets `shaderDenormFlushToZeroFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderDenormFlushToZeroFloat16(MemorySegment segment, long index, int value) { VH_shaderDenormFlushToZeroFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderDenormFlushToZeroFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderDenormFlushToZeroFloat16(int value) { shaderDenormFlushToZeroFloat16(this.segment(), 0L, value); return this; }

    /// {@return `shaderDenormFlushToZeroFloat32` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderDenormFlushToZeroFloat32(MemorySegment segment, long index) { return (int) VH_shaderDenormFlushToZeroFloat32.get(segment, 0L, index); }
    /// {@return `shaderDenormFlushToZeroFloat32`}
    public int shaderDenormFlushToZeroFloat32() { return shaderDenormFlushToZeroFloat32(this.segment(), 0L); }
    /// Sets `shaderDenormFlushToZeroFloat32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderDenormFlushToZeroFloat32(MemorySegment segment, long index, int value) { VH_shaderDenormFlushToZeroFloat32.set(segment, 0L, index, value); }
    /// Sets `shaderDenormFlushToZeroFloat32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderDenormFlushToZeroFloat32(int value) { shaderDenormFlushToZeroFloat32(this.segment(), 0L, value); return this; }

    /// {@return `shaderDenormFlushToZeroFloat64` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderDenormFlushToZeroFloat64(MemorySegment segment, long index) { return (int) VH_shaderDenormFlushToZeroFloat64.get(segment, 0L, index); }
    /// {@return `shaderDenormFlushToZeroFloat64`}
    public int shaderDenormFlushToZeroFloat64() { return shaderDenormFlushToZeroFloat64(this.segment(), 0L); }
    /// Sets `shaderDenormFlushToZeroFloat64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderDenormFlushToZeroFloat64(MemorySegment segment, long index, int value) { VH_shaderDenormFlushToZeroFloat64.set(segment, 0L, index, value); }
    /// Sets `shaderDenormFlushToZeroFloat64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderDenormFlushToZeroFloat64(int value) { shaderDenormFlushToZeroFloat64(this.segment(), 0L, value); return this; }

    /// {@return `shaderRoundingModeRTEFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderRoundingModeRTEFloat16(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTEFloat16.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTEFloat16`}
    public int shaderRoundingModeRTEFloat16() { return shaderRoundingModeRTEFloat16(this.segment(), 0L); }
    /// Sets `shaderRoundingModeRTEFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderRoundingModeRTEFloat16(MemorySegment segment, long index, int value) { VH_shaderRoundingModeRTEFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTEFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTEFloat16(int value) { shaderRoundingModeRTEFloat16(this.segment(), 0L, value); return this; }

    /// {@return `shaderRoundingModeRTEFloat32` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderRoundingModeRTEFloat32(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTEFloat32.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTEFloat32`}
    public int shaderRoundingModeRTEFloat32() { return shaderRoundingModeRTEFloat32(this.segment(), 0L); }
    /// Sets `shaderRoundingModeRTEFloat32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderRoundingModeRTEFloat32(MemorySegment segment, long index, int value) { VH_shaderRoundingModeRTEFloat32.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTEFloat32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTEFloat32(int value) { shaderRoundingModeRTEFloat32(this.segment(), 0L, value); return this; }

    /// {@return `shaderRoundingModeRTEFloat64` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderRoundingModeRTEFloat64(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTEFloat64.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTEFloat64`}
    public int shaderRoundingModeRTEFloat64() { return shaderRoundingModeRTEFloat64(this.segment(), 0L); }
    /// Sets `shaderRoundingModeRTEFloat64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderRoundingModeRTEFloat64(MemorySegment segment, long index, int value) { VH_shaderRoundingModeRTEFloat64.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTEFloat64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTEFloat64(int value) { shaderRoundingModeRTEFloat64(this.segment(), 0L, value); return this; }

    /// {@return `shaderRoundingModeRTZFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderRoundingModeRTZFloat16(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTZFloat16.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTZFloat16`}
    public int shaderRoundingModeRTZFloat16() { return shaderRoundingModeRTZFloat16(this.segment(), 0L); }
    /// Sets `shaderRoundingModeRTZFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderRoundingModeRTZFloat16(MemorySegment segment, long index, int value) { VH_shaderRoundingModeRTZFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTZFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTZFloat16(int value) { shaderRoundingModeRTZFloat16(this.segment(), 0L, value); return this; }

    /// {@return `shaderRoundingModeRTZFloat32` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderRoundingModeRTZFloat32(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTZFloat32.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTZFloat32`}
    public int shaderRoundingModeRTZFloat32() { return shaderRoundingModeRTZFloat32(this.segment(), 0L); }
    /// Sets `shaderRoundingModeRTZFloat32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderRoundingModeRTZFloat32(MemorySegment segment, long index, int value) { VH_shaderRoundingModeRTZFloat32.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTZFloat32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTZFloat32(int value) { shaderRoundingModeRTZFloat32(this.segment(), 0L, value); return this; }

    /// {@return `shaderRoundingModeRTZFloat64` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderRoundingModeRTZFloat64(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTZFloat64.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTZFloat64`}
    public int shaderRoundingModeRTZFloat64() { return shaderRoundingModeRTZFloat64(this.segment(), 0L); }
    /// Sets `shaderRoundingModeRTZFloat64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderRoundingModeRTZFloat64(MemorySegment segment, long index, int value) { VH_shaderRoundingModeRTZFloat64.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTZFloat64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTZFloat64(int value) { shaderRoundingModeRTZFloat64(this.segment(), 0L, value); return this; }

    /// {@return `maxUpdateAfterBindDescriptorsInAllPools` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxUpdateAfterBindDescriptorsInAllPools(MemorySegment segment, long index) { return (int) VH_maxUpdateAfterBindDescriptorsInAllPools.get(segment, 0L, index); }
    /// {@return `maxUpdateAfterBindDescriptorsInAllPools`}
    public int maxUpdateAfterBindDescriptorsInAllPools() { return maxUpdateAfterBindDescriptorsInAllPools(this.segment(), 0L); }
    /// Sets `maxUpdateAfterBindDescriptorsInAllPools` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxUpdateAfterBindDescriptorsInAllPools(MemorySegment segment, long index, int value) { VH_maxUpdateAfterBindDescriptorsInAllPools.set(segment, 0L, index, value); }
    /// Sets `maxUpdateAfterBindDescriptorsInAllPools` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxUpdateAfterBindDescriptorsInAllPools(int value) { maxUpdateAfterBindDescriptorsInAllPools(this.segment(), 0L, value); return this; }

    /// {@return `shaderUniformBufferArrayNonUniformIndexingNative` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderUniformBufferArrayNonUniformIndexingNative(MemorySegment segment, long index) { return (int) VH_shaderUniformBufferArrayNonUniformIndexingNative.get(segment, 0L, index); }
    /// {@return `shaderUniformBufferArrayNonUniformIndexingNative`}
    public int shaderUniformBufferArrayNonUniformIndexingNative() { return shaderUniformBufferArrayNonUniformIndexingNative(this.segment(), 0L); }
    /// Sets `shaderUniformBufferArrayNonUniformIndexingNative` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderUniformBufferArrayNonUniformIndexingNative(MemorySegment segment, long index, int value) { VH_shaderUniformBufferArrayNonUniformIndexingNative.set(segment, 0L, index, value); }
    /// Sets `shaderUniformBufferArrayNonUniformIndexingNative` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderUniformBufferArrayNonUniformIndexingNative(int value) { shaderUniformBufferArrayNonUniformIndexingNative(this.segment(), 0L, value); return this; }

    /// {@return `shaderSampledImageArrayNonUniformIndexingNative` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSampledImageArrayNonUniformIndexingNative(MemorySegment segment, long index) { return (int) VH_shaderSampledImageArrayNonUniformIndexingNative.get(segment, 0L, index); }
    /// {@return `shaderSampledImageArrayNonUniformIndexingNative`}
    public int shaderSampledImageArrayNonUniformIndexingNative() { return shaderSampledImageArrayNonUniformIndexingNative(this.segment(), 0L); }
    /// Sets `shaderSampledImageArrayNonUniformIndexingNative` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSampledImageArrayNonUniformIndexingNative(MemorySegment segment, long index, int value) { VH_shaderSampledImageArrayNonUniformIndexingNative.set(segment, 0L, index, value); }
    /// Sets `shaderSampledImageArrayNonUniformIndexingNative` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderSampledImageArrayNonUniformIndexingNative(int value) { shaderSampledImageArrayNonUniformIndexingNative(this.segment(), 0L, value); return this; }

    /// {@return `shaderStorageBufferArrayNonUniformIndexingNative` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderStorageBufferArrayNonUniformIndexingNative(MemorySegment segment, long index) { return (int) VH_shaderStorageBufferArrayNonUniformIndexingNative.get(segment, 0L, index); }
    /// {@return `shaderStorageBufferArrayNonUniformIndexingNative`}
    public int shaderStorageBufferArrayNonUniformIndexingNative() { return shaderStorageBufferArrayNonUniformIndexingNative(this.segment(), 0L); }
    /// Sets `shaderStorageBufferArrayNonUniformIndexingNative` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderStorageBufferArrayNonUniformIndexingNative(MemorySegment segment, long index, int value) { VH_shaderStorageBufferArrayNonUniformIndexingNative.set(segment, 0L, index, value); }
    /// Sets `shaderStorageBufferArrayNonUniformIndexingNative` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderStorageBufferArrayNonUniformIndexingNative(int value) { shaderStorageBufferArrayNonUniformIndexingNative(this.segment(), 0L, value); return this; }

    /// {@return `shaderStorageImageArrayNonUniformIndexingNative` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderStorageImageArrayNonUniformIndexingNative(MemorySegment segment, long index) { return (int) VH_shaderStorageImageArrayNonUniformIndexingNative.get(segment, 0L, index); }
    /// {@return `shaderStorageImageArrayNonUniformIndexingNative`}
    public int shaderStorageImageArrayNonUniformIndexingNative() { return shaderStorageImageArrayNonUniformIndexingNative(this.segment(), 0L); }
    /// Sets `shaderStorageImageArrayNonUniformIndexingNative` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderStorageImageArrayNonUniformIndexingNative(MemorySegment segment, long index, int value) { VH_shaderStorageImageArrayNonUniformIndexingNative.set(segment, 0L, index, value); }
    /// Sets `shaderStorageImageArrayNonUniformIndexingNative` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderStorageImageArrayNonUniformIndexingNative(int value) { shaderStorageImageArrayNonUniformIndexingNative(this.segment(), 0L, value); return this; }

    /// {@return `shaderInputAttachmentArrayNonUniformIndexingNative` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderInputAttachmentArrayNonUniformIndexingNative(MemorySegment segment, long index) { return (int) VH_shaderInputAttachmentArrayNonUniformIndexingNative.get(segment, 0L, index); }
    /// {@return `shaderInputAttachmentArrayNonUniformIndexingNative`}
    public int shaderInputAttachmentArrayNonUniformIndexingNative() { return shaderInputAttachmentArrayNonUniformIndexingNative(this.segment(), 0L); }
    /// Sets `shaderInputAttachmentArrayNonUniformIndexingNative` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderInputAttachmentArrayNonUniformIndexingNative(MemorySegment segment, long index, int value) { VH_shaderInputAttachmentArrayNonUniformIndexingNative.set(segment, 0L, index, value); }
    /// Sets `shaderInputAttachmentArrayNonUniformIndexingNative` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderInputAttachmentArrayNonUniformIndexingNative(int value) { shaderInputAttachmentArrayNonUniformIndexingNative(this.segment(), 0L, value); return this; }

    /// {@return `robustBufferAccessUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int robustBufferAccessUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_robustBufferAccessUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `robustBufferAccessUpdateAfterBind`}
    public int robustBufferAccessUpdateAfterBind() { return robustBufferAccessUpdateAfterBind(this.segment(), 0L); }
    /// Sets `robustBufferAccessUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void robustBufferAccessUpdateAfterBind(MemorySegment segment, long index, int value) { VH_robustBufferAccessUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `robustBufferAccessUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties robustBufferAccessUpdateAfterBind(int value) { robustBufferAccessUpdateAfterBind(this.segment(), 0L, value); return this; }

    /// {@return `quadDivergentImplicitLod` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int quadDivergentImplicitLod(MemorySegment segment, long index) { return (int) VH_quadDivergentImplicitLod.get(segment, 0L, index); }
    /// {@return `quadDivergentImplicitLod`}
    public int quadDivergentImplicitLod() { return quadDivergentImplicitLod(this.segment(), 0L); }
    /// Sets `quadDivergentImplicitLod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void quadDivergentImplicitLod(MemorySegment segment, long index, int value) { VH_quadDivergentImplicitLod.set(segment, 0L, index, value); }
    /// Sets `quadDivergentImplicitLod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties quadDivergentImplicitLod(int value) { quadDivergentImplicitLod(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindSamplers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorUpdateAfterBindSamplers(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindSamplers.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindSamplers`}
    public int maxPerStageDescriptorUpdateAfterBindSamplers() { return maxPerStageDescriptorUpdateAfterBindSamplers(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindSamplers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorUpdateAfterBindSamplers(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindSamplers.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindSamplers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindSamplers(int value) { maxPerStageDescriptorUpdateAfterBindSamplers(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindUniformBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorUpdateAfterBindUniformBuffers(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindUniformBuffers`}
    public int maxPerStageDescriptorUpdateAfterBindUniformBuffers() { return maxPerStageDescriptorUpdateAfterBindUniformBuffers(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindUniformBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorUpdateAfterBindUniformBuffers(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindUniformBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindUniformBuffers(int value) { maxPerStageDescriptorUpdateAfterBindUniformBuffers(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindStorageBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorUpdateAfterBindStorageBuffers(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindStorageBuffers`}
    public int maxPerStageDescriptorUpdateAfterBindStorageBuffers() { return maxPerStageDescriptorUpdateAfterBindStorageBuffers(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindStorageBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorUpdateAfterBindStorageBuffers(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindStorageBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindStorageBuffers(int value) { maxPerStageDescriptorUpdateAfterBindStorageBuffers(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindSampledImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorUpdateAfterBindSampledImages(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindSampledImages.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindSampledImages`}
    public int maxPerStageDescriptorUpdateAfterBindSampledImages() { return maxPerStageDescriptorUpdateAfterBindSampledImages(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindSampledImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorUpdateAfterBindSampledImages(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindSampledImages.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindSampledImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindSampledImages(int value) { maxPerStageDescriptorUpdateAfterBindSampledImages(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindStorageImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorUpdateAfterBindStorageImages(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindStorageImages.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindStorageImages`}
    public int maxPerStageDescriptorUpdateAfterBindStorageImages() { return maxPerStageDescriptorUpdateAfterBindStorageImages(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindStorageImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorUpdateAfterBindStorageImages(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindStorageImages.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindStorageImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindStorageImages(int value) { maxPerStageDescriptorUpdateAfterBindStorageImages(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindInputAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorUpdateAfterBindInputAttachments(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindInputAttachments.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindInputAttachments`}
    public int maxPerStageDescriptorUpdateAfterBindInputAttachments() { return maxPerStageDescriptorUpdateAfterBindInputAttachments(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindInputAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorUpdateAfterBindInputAttachments(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindInputAttachments.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindInputAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindInputAttachments(int value) { maxPerStageDescriptorUpdateAfterBindInputAttachments(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageUpdateAfterBindResources` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageUpdateAfterBindResources(MemorySegment segment, long index) { return (int) VH_maxPerStageUpdateAfterBindResources.get(segment, 0L, index); }
    /// {@return `maxPerStageUpdateAfterBindResources`}
    public int maxPerStageUpdateAfterBindResources() { return maxPerStageUpdateAfterBindResources(this.segment(), 0L); }
    /// Sets `maxPerStageUpdateAfterBindResources` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageUpdateAfterBindResources(MemorySegment segment, long index, int value) { VH_maxPerStageUpdateAfterBindResources.set(segment, 0L, index, value); }
    /// Sets `maxPerStageUpdateAfterBindResources` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxPerStageUpdateAfterBindResources(int value) { maxPerStageUpdateAfterBindResources(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindSamplers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUpdateAfterBindSamplers(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindSamplers.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindSamplers`}
    public int maxDescriptorSetUpdateAfterBindSamplers() { return maxDescriptorSetUpdateAfterBindSamplers(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUpdateAfterBindSamplers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUpdateAfterBindSamplers(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUpdateAfterBindSamplers.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindSamplers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindSamplers(int value) { maxDescriptorSetUpdateAfterBindSamplers(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUpdateAfterBindUniformBuffers(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindUniformBuffers.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffers`}
    public int maxDescriptorSetUpdateAfterBindUniformBuffers() { return maxDescriptorSetUpdateAfterBindUniformBuffers(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUpdateAfterBindUniformBuffers(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUpdateAfterBindUniformBuffers.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindUniformBuffers(int value) { maxDescriptorSetUpdateAfterBindUniformBuffers(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic`}
    public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() { return maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(int value) { maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUpdateAfterBindStorageBuffers(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindStorageBuffers.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffers`}
    public int maxDescriptorSetUpdateAfterBindStorageBuffers() { return maxDescriptorSetUpdateAfterBindStorageBuffers(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUpdateAfterBindStorageBuffers(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUpdateAfterBindStorageBuffers.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindStorageBuffers(int value) { maxDescriptorSetUpdateAfterBindStorageBuffers(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic`}
    public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() { return maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(int value) { maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindSampledImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUpdateAfterBindSampledImages(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindSampledImages.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindSampledImages`}
    public int maxDescriptorSetUpdateAfterBindSampledImages() { return maxDescriptorSetUpdateAfterBindSampledImages(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUpdateAfterBindSampledImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUpdateAfterBindSampledImages(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUpdateAfterBindSampledImages.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindSampledImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindSampledImages(int value) { maxDescriptorSetUpdateAfterBindSampledImages(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindStorageImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUpdateAfterBindStorageImages(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindStorageImages.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindStorageImages`}
    public int maxDescriptorSetUpdateAfterBindStorageImages() { return maxDescriptorSetUpdateAfterBindStorageImages(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUpdateAfterBindStorageImages(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUpdateAfterBindStorageImages.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindStorageImages(int value) { maxDescriptorSetUpdateAfterBindStorageImages(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindInputAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUpdateAfterBindInputAttachments(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindInputAttachments.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindInputAttachments`}
    public int maxDescriptorSetUpdateAfterBindInputAttachments() { return maxDescriptorSetUpdateAfterBindInputAttachments(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUpdateAfterBindInputAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUpdateAfterBindInputAttachments(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUpdateAfterBindInputAttachments.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindInputAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindInputAttachments(int value) { maxDescriptorSetUpdateAfterBindInputAttachments(this.segment(), 0L, value); return this; }

    /// {@return `supportedDepthResolveModes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportedDepthResolveModes(MemorySegment segment, long index) { return (int) VH_supportedDepthResolveModes.get(segment, 0L, index); }
    /// {@return `supportedDepthResolveModes`}
    public int supportedDepthResolveModes() { return supportedDepthResolveModes(this.segment(), 0L); }
    /// Sets `supportedDepthResolveModes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportedDepthResolveModes(MemorySegment segment, long index, int value) { VH_supportedDepthResolveModes.set(segment, 0L, index, value); }
    /// Sets `supportedDepthResolveModes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties supportedDepthResolveModes(int value) { supportedDepthResolveModes(this.segment(), 0L, value); return this; }

    /// {@return `supportedStencilResolveModes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportedStencilResolveModes(MemorySegment segment, long index) { return (int) VH_supportedStencilResolveModes.get(segment, 0L, index); }
    /// {@return `supportedStencilResolveModes`}
    public int supportedStencilResolveModes() { return supportedStencilResolveModes(this.segment(), 0L); }
    /// Sets `supportedStencilResolveModes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportedStencilResolveModes(MemorySegment segment, long index, int value) { VH_supportedStencilResolveModes.set(segment, 0L, index, value); }
    /// Sets `supportedStencilResolveModes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties supportedStencilResolveModes(int value) { supportedStencilResolveModes(this.segment(), 0L, value); return this; }

    /// {@return `independentResolveNone` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int independentResolveNone(MemorySegment segment, long index) { return (int) VH_independentResolveNone.get(segment, 0L, index); }
    /// {@return `independentResolveNone`}
    public int independentResolveNone() { return independentResolveNone(this.segment(), 0L); }
    /// Sets `independentResolveNone` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void independentResolveNone(MemorySegment segment, long index, int value) { VH_independentResolveNone.set(segment, 0L, index, value); }
    /// Sets `independentResolveNone` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties independentResolveNone(int value) { independentResolveNone(this.segment(), 0L, value); return this; }

    /// {@return `independentResolve` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int independentResolve(MemorySegment segment, long index) { return (int) VH_independentResolve.get(segment, 0L, index); }
    /// {@return `independentResolve`}
    public int independentResolve() { return independentResolve(this.segment(), 0L); }
    /// Sets `independentResolve` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void independentResolve(MemorySegment segment, long index, int value) { VH_independentResolve.set(segment, 0L, index, value); }
    /// Sets `independentResolve` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties independentResolve(int value) { independentResolve(this.segment(), 0L, value); return this; }

    /// {@return `filterMinmaxSingleComponentFormats` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int filterMinmaxSingleComponentFormats(MemorySegment segment, long index) { return (int) VH_filterMinmaxSingleComponentFormats.get(segment, 0L, index); }
    /// {@return `filterMinmaxSingleComponentFormats`}
    public int filterMinmaxSingleComponentFormats() { return filterMinmaxSingleComponentFormats(this.segment(), 0L); }
    /// Sets `filterMinmaxSingleComponentFormats` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void filterMinmaxSingleComponentFormats(MemorySegment segment, long index, int value) { VH_filterMinmaxSingleComponentFormats.set(segment, 0L, index, value); }
    /// Sets `filterMinmaxSingleComponentFormats` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties filterMinmaxSingleComponentFormats(int value) { filterMinmaxSingleComponentFormats(this.segment(), 0L, value); return this; }

    /// {@return `filterMinmaxImageComponentMapping` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int filterMinmaxImageComponentMapping(MemorySegment segment, long index) { return (int) VH_filterMinmaxImageComponentMapping.get(segment, 0L, index); }
    /// {@return `filterMinmaxImageComponentMapping`}
    public int filterMinmaxImageComponentMapping() { return filterMinmaxImageComponentMapping(this.segment(), 0L); }
    /// Sets `filterMinmaxImageComponentMapping` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void filterMinmaxImageComponentMapping(MemorySegment segment, long index, int value) { VH_filterMinmaxImageComponentMapping.set(segment, 0L, index, value); }
    /// Sets `filterMinmaxImageComponentMapping` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties filterMinmaxImageComponentMapping(int value) { filterMinmaxImageComponentMapping(this.segment(), 0L, value); return this; }

    /// {@return `maxTimelineSemaphoreValueDifference` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxTimelineSemaphoreValueDifference(MemorySegment segment, long index) { return (long) VH_maxTimelineSemaphoreValueDifference.get(segment, 0L, index); }
    /// {@return `maxTimelineSemaphoreValueDifference`}
    public long maxTimelineSemaphoreValueDifference() { return maxTimelineSemaphoreValueDifference(this.segment(), 0L); }
    /// Sets `maxTimelineSemaphoreValueDifference` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTimelineSemaphoreValueDifference(MemorySegment segment, long index, long value) { VH_maxTimelineSemaphoreValueDifference.set(segment, 0L, index, value); }
    /// Sets `maxTimelineSemaphoreValueDifference` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxTimelineSemaphoreValueDifference(long value) { maxTimelineSemaphoreValueDifference(this.segment(), 0L, value); return this; }

    /// {@return `framebufferIntegerColorSampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int framebufferIntegerColorSampleCounts(MemorySegment segment, long index) { return (int) VH_framebufferIntegerColorSampleCounts.get(segment, 0L, index); }
    /// {@return `framebufferIntegerColorSampleCounts`}
    public int framebufferIntegerColorSampleCounts() { return framebufferIntegerColorSampleCounts(this.segment(), 0L); }
    /// Sets `framebufferIntegerColorSampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void framebufferIntegerColorSampleCounts(MemorySegment segment, long index, int value) { VH_framebufferIntegerColorSampleCounts.set(segment, 0L, index, value); }
    /// Sets `framebufferIntegerColorSampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties framebufferIntegerColorSampleCounts(int value) { framebufferIntegerColorSampleCounts(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceVulkan12Properties].
    public static final class Buffer extends VkPhysicalDeviceVulkan12Properties {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceVulkan12Properties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceVulkan12Properties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceVulkan12Properties`
        public VkPhysicalDeviceVulkan12Properties asSlice(long index) { return new VkPhysicalDeviceVulkan12Properties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceVulkan12Properties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceVulkan12Properties`
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

        /// {@return `driverID` at the given index}
        /// @param index the index of the struct buffer
        public int driverIDAt(long index) { return driverID(this.segment(), index); }
        /// Sets `driverID` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer driverIDAt(long index, int value) { driverID(this.segment(), index, value); return this; }

        /// {@return `driverName` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment driverNameAt(long index) { return driverName(this.segment(), index); }
        /// {@return `driverName` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte driverNameAt(long index, long index0) { return driverName(this.segment(), index, index0); }
        /// Sets `driverName` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer driverNameAt(long index, MemorySegment value) { driverName(this.segment(), index, value); return this; }
        /// Sets `driverName` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer driverNameAt(long index, long index0, byte value) { driverName(this.segment(), index, index0, value); return this; }

        /// {@return `driverInfo` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment driverInfoAt(long index) { return driverInfo(this.segment(), index); }
        /// {@return `driverInfo` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte driverInfoAt(long index, long index0) { return driverInfo(this.segment(), index, index0); }
        /// Sets `driverInfo` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer driverInfoAt(long index, MemorySegment value) { driverInfo(this.segment(), index, value); return this; }
        /// Sets `driverInfo` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer driverInfoAt(long index, long index0, byte value) { driverInfo(this.segment(), index, index0, value); return this; }

        /// {@return `conformanceVersion` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment conformanceVersionAt(long index) { return conformanceVersion(this.segment(), index); }
        /// Sets `conformanceVersion` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer conformanceVersionAt(long index, MemorySegment value) { conformanceVersion(this.segment(), index, value); return this; }

        /// {@return `denormBehaviorIndependence` at the given index}
        /// @param index the index of the struct buffer
        public int denormBehaviorIndependenceAt(long index) { return denormBehaviorIndependence(this.segment(), index); }
        /// Sets `denormBehaviorIndependence` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer denormBehaviorIndependenceAt(long index, int value) { denormBehaviorIndependence(this.segment(), index, value); return this; }

        /// {@return `roundingModeIndependence` at the given index}
        /// @param index the index of the struct buffer
        public int roundingModeIndependenceAt(long index) { return roundingModeIndependence(this.segment(), index); }
        /// Sets `roundingModeIndependence` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer roundingModeIndependenceAt(long index, int value) { roundingModeIndependence(this.segment(), index, value); return this; }

        /// {@return `shaderSignedZeroInfNanPreserveFloat16` at the given index}
        /// @param index the index of the struct buffer
        public int shaderSignedZeroInfNanPreserveFloat16At(long index) { return shaderSignedZeroInfNanPreserveFloat16(this.segment(), index); }
        /// Sets `shaderSignedZeroInfNanPreserveFloat16` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderSignedZeroInfNanPreserveFloat16At(long index, int value) { shaderSignedZeroInfNanPreserveFloat16(this.segment(), index, value); return this; }

        /// {@return `shaderSignedZeroInfNanPreserveFloat32` at the given index}
        /// @param index the index of the struct buffer
        public int shaderSignedZeroInfNanPreserveFloat32At(long index) { return shaderSignedZeroInfNanPreserveFloat32(this.segment(), index); }
        /// Sets `shaderSignedZeroInfNanPreserveFloat32` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderSignedZeroInfNanPreserveFloat32At(long index, int value) { shaderSignedZeroInfNanPreserveFloat32(this.segment(), index, value); return this; }

        /// {@return `shaderSignedZeroInfNanPreserveFloat64` at the given index}
        /// @param index the index of the struct buffer
        public int shaderSignedZeroInfNanPreserveFloat64At(long index) { return shaderSignedZeroInfNanPreserveFloat64(this.segment(), index); }
        /// Sets `shaderSignedZeroInfNanPreserveFloat64` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderSignedZeroInfNanPreserveFloat64At(long index, int value) { shaderSignedZeroInfNanPreserveFloat64(this.segment(), index, value); return this; }

        /// {@return `shaderDenormPreserveFloat16` at the given index}
        /// @param index the index of the struct buffer
        public int shaderDenormPreserveFloat16At(long index) { return shaderDenormPreserveFloat16(this.segment(), index); }
        /// Sets `shaderDenormPreserveFloat16` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderDenormPreserveFloat16At(long index, int value) { shaderDenormPreserveFloat16(this.segment(), index, value); return this; }

        /// {@return `shaderDenormPreserveFloat32` at the given index}
        /// @param index the index of the struct buffer
        public int shaderDenormPreserveFloat32At(long index) { return shaderDenormPreserveFloat32(this.segment(), index); }
        /// Sets `shaderDenormPreserveFloat32` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderDenormPreserveFloat32At(long index, int value) { shaderDenormPreserveFloat32(this.segment(), index, value); return this; }

        /// {@return `shaderDenormPreserveFloat64` at the given index}
        /// @param index the index of the struct buffer
        public int shaderDenormPreserveFloat64At(long index) { return shaderDenormPreserveFloat64(this.segment(), index); }
        /// Sets `shaderDenormPreserveFloat64` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderDenormPreserveFloat64At(long index, int value) { shaderDenormPreserveFloat64(this.segment(), index, value); return this; }

        /// {@return `shaderDenormFlushToZeroFloat16` at the given index}
        /// @param index the index of the struct buffer
        public int shaderDenormFlushToZeroFloat16At(long index) { return shaderDenormFlushToZeroFloat16(this.segment(), index); }
        /// Sets `shaderDenormFlushToZeroFloat16` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderDenormFlushToZeroFloat16At(long index, int value) { shaderDenormFlushToZeroFloat16(this.segment(), index, value); return this; }

        /// {@return `shaderDenormFlushToZeroFloat32` at the given index}
        /// @param index the index of the struct buffer
        public int shaderDenormFlushToZeroFloat32At(long index) { return shaderDenormFlushToZeroFloat32(this.segment(), index); }
        /// Sets `shaderDenormFlushToZeroFloat32` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderDenormFlushToZeroFloat32At(long index, int value) { shaderDenormFlushToZeroFloat32(this.segment(), index, value); return this; }

        /// {@return `shaderDenormFlushToZeroFloat64` at the given index}
        /// @param index the index of the struct buffer
        public int shaderDenormFlushToZeroFloat64At(long index) { return shaderDenormFlushToZeroFloat64(this.segment(), index); }
        /// Sets `shaderDenormFlushToZeroFloat64` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderDenormFlushToZeroFloat64At(long index, int value) { shaderDenormFlushToZeroFloat64(this.segment(), index, value); return this; }

        /// {@return `shaderRoundingModeRTEFloat16` at the given index}
        /// @param index the index of the struct buffer
        public int shaderRoundingModeRTEFloat16At(long index) { return shaderRoundingModeRTEFloat16(this.segment(), index); }
        /// Sets `shaderRoundingModeRTEFloat16` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderRoundingModeRTEFloat16At(long index, int value) { shaderRoundingModeRTEFloat16(this.segment(), index, value); return this; }

        /// {@return `shaderRoundingModeRTEFloat32` at the given index}
        /// @param index the index of the struct buffer
        public int shaderRoundingModeRTEFloat32At(long index) { return shaderRoundingModeRTEFloat32(this.segment(), index); }
        /// Sets `shaderRoundingModeRTEFloat32` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderRoundingModeRTEFloat32At(long index, int value) { shaderRoundingModeRTEFloat32(this.segment(), index, value); return this; }

        /// {@return `shaderRoundingModeRTEFloat64` at the given index}
        /// @param index the index of the struct buffer
        public int shaderRoundingModeRTEFloat64At(long index) { return shaderRoundingModeRTEFloat64(this.segment(), index); }
        /// Sets `shaderRoundingModeRTEFloat64` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderRoundingModeRTEFloat64At(long index, int value) { shaderRoundingModeRTEFloat64(this.segment(), index, value); return this; }

        /// {@return `shaderRoundingModeRTZFloat16` at the given index}
        /// @param index the index of the struct buffer
        public int shaderRoundingModeRTZFloat16At(long index) { return shaderRoundingModeRTZFloat16(this.segment(), index); }
        /// Sets `shaderRoundingModeRTZFloat16` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderRoundingModeRTZFloat16At(long index, int value) { shaderRoundingModeRTZFloat16(this.segment(), index, value); return this; }

        /// {@return `shaderRoundingModeRTZFloat32` at the given index}
        /// @param index the index of the struct buffer
        public int shaderRoundingModeRTZFloat32At(long index) { return shaderRoundingModeRTZFloat32(this.segment(), index); }
        /// Sets `shaderRoundingModeRTZFloat32` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderRoundingModeRTZFloat32At(long index, int value) { shaderRoundingModeRTZFloat32(this.segment(), index, value); return this; }

        /// {@return `shaderRoundingModeRTZFloat64` at the given index}
        /// @param index the index of the struct buffer
        public int shaderRoundingModeRTZFloat64At(long index) { return shaderRoundingModeRTZFloat64(this.segment(), index); }
        /// Sets `shaderRoundingModeRTZFloat64` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderRoundingModeRTZFloat64At(long index, int value) { shaderRoundingModeRTZFloat64(this.segment(), index, value); return this; }

        /// {@return `maxUpdateAfterBindDescriptorsInAllPools` at the given index}
        /// @param index the index of the struct buffer
        public int maxUpdateAfterBindDescriptorsInAllPoolsAt(long index) { return maxUpdateAfterBindDescriptorsInAllPools(this.segment(), index); }
        /// Sets `maxUpdateAfterBindDescriptorsInAllPools` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxUpdateAfterBindDescriptorsInAllPoolsAt(long index, int value) { maxUpdateAfterBindDescriptorsInAllPools(this.segment(), index, value); return this; }

        /// {@return `shaderUniformBufferArrayNonUniformIndexingNative` at the given index}
        /// @param index the index of the struct buffer
        public int shaderUniformBufferArrayNonUniformIndexingNativeAt(long index) { return shaderUniformBufferArrayNonUniformIndexingNative(this.segment(), index); }
        /// Sets `shaderUniformBufferArrayNonUniformIndexingNative` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderUniformBufferArrayNonUniformIndexingNativeAt(long index, int value) { shaderUniformBufferArrayNonUniformIndexingNative(this.segment(), index, value); return this; }

        /// {@return `shaderSampledImageArrayNonUniformIndexingNative` at the given index}
        /// @param index the index of the struct buffer
        public int shaderSampledImageArrayNonUniformIndexingNativeAt(long index) { return shaderSampledImageArrayNonUniformIndexingNative(this.segment(), index); }
        /// Sets `shaderSampledImageArrayNonUniformIndexingNative` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderSampledImageArrayNonUniformIndexingNativeAt(long index, int value) { shaderSampledImageArrayNonUniformIndexingNative(this.segment(), index, value); return this; }

        /// {@return `shaderStorageBufferArrayNonUniformIndexingNative` at the given index}
        /// @param index the index of the struct buffer
        public int shaderStorageBufferArrayNonUniformIndexingNativeAt(long index) { return shaderStorageBufferArrayNonUniformIndexingNative(this.segment(), index); }
        /// Sets `shaderStorageBufferArrayNonUniformIndexingNative` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderStorageBufferArrayNonUniformIndexingNativeAt(long index, int value) { shaderStorageBufferArrayNonUniformIndexingNative(this.segment(), index, value); return this; }

        /// {@return `shaderStorageImageArrayNonUniformIndexingNative` at the given index}
        /// @param index the index of the struct buffer
        public int shaderStorageImageArrayNonUniformIndexingNativeAt(long index) { return shaderStorageImageArrayNonUniformIndexingNative(this.segment(), index); }
        /// Sets `shaderStorageImageArrayNonUniformIndexingNative` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderStorageImageArrayNonUniformIndexingNativeAt(long index, int value) { shaderStorageImageArrayNonUniformIndexingNative(this.segment(), index, value); return this; }

        /// {@return `shaderInputAttachmentArrayNonUniformIndexingNative` at the given index}
        /// @param index the index of the struct buffer
        public int shaderInputAttachmentArrayNonUniformIndexingNativeAt(long index) { return shaderInputAttachmentArrayNonUniformIndexingNative(this.segment(), index); }
        /// Sets `shaderInputAttachmentArrayNonUniformIndexingNative` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderInputAttachmentArrayNonUniformIndexingNativeAt(long index, int value) { shaderInputAttachmentArrayNonUniformIndexingNative(this.segment(), index, value); return this; }

        /// {@return `robustBufferAccessUpdateAfterBind` at the given index}
        /// @param index the index of the struct buffer
        public int robustBufferAccessUpdateAfterBindAt(long index) { return robustBufferAccessUpdateAfterBind(this.segment(), index); }
        /// Sets `robustBufferAccessUpdateAfterBind` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer robustBufferAccessUpdateAfterBindAt(long index, int value) { robustBufferAccessUpdateAfterBind(this.segment(), index, value); return this; }

        /// {@return `quadDivergentImplicitLod` at the given index}
        /// @param index the index of the struct buffer
        public int quadDivergentImplicitLodAt(long index) { return quadDivergentImplicitLod(this.segment(), index); }
        /// Sets `quadDivergentImplicitLod` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer quadDivergentImplicitLodAt(long index, int value) { quadDivergentImplicitLod(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindSamplers` at the given index}
        /// @param index the index of the struct buffer
        public int maxPerStageDescriptorUpdateAfterBindSamplersAt(long index) { return maxPerStageDescriptorUpdateAfterBindSamplers(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindSamplers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindSamplersAt(long index, int value) { maxPerStageDescriptorUpdateAfterBindSamplers(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindUniformBuffers` at the given index}
        /// @param index the index of the struct buffer
        public int maxPerStageDescriptorUpdateAfterBindUniformBuffersAt(long index) { return maxPerStageDescriptorUpdateAfterBindUniformBuffers(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindUniformBuffers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindUniformBuffersAt(long index, int value) { maxPerStageDescriptorUpdateAfterBindUniformBuffers(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindStorageBuffers` at the given index}
        /// @param index the index of the struct buffer
        public int maxPerStageDescriptorUpdateAfterBindStorageBuffersAt(long index) { return maxPerStageDescriptorUpdateAfterBindStorageBuffers(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindStorageBuffers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindStorageBuffersAt(long index, int value) { maxPerStageDescriptorUpdateAfterBindStorageBuffers(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindSampledImages` at the given index}
        /// @param index the index of the struct buffer
        public int maxPerStageDescriptorUpdateAfterBindSampledImagesAt(long index) { return maxPerStageDescriptorUpdateAfterBindSampledImages(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindSampledImages` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindSampledImagesAt(long index, int value) { maxPerStageDescriptorUpdateAfterBindSampledImages(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindStorageImages` at the given index}
        /// @param index the index of the struct buffer
        public int maxPerStageDescriptorUpdateAfterBindStorageImagesAt(long index) { return maxPerStageDescriptorUpdateAfterBindStorageImages(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindStorageImages` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindStorageImagesAt(long index, int value) { maxPerStageDescriptorUpdateAfterBindStorageImages(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindInputAttachments` at the given index}
        /// @param index the index of the struct buffer
        public int maxPerStageDescriptorUpdateAfterBindInputAttachmentsAt(long index) { return maxPerStageDescriptorUpdateAfterBindInputAttachments(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindInputAttachments` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindInputAttachmentsAt(long index, int value) { maxPerStageDescriptorUpdateAfterBindInputAttachments(this.segment(), index, value); return this; }

        /// {@return `maxPerStageUpdateAfterBindResources` at the given index}
        /// @param index the index of the struct buffer
        public int maxPerStageUpdateAfterBindResourcesAt(long index) { return maxPerStageUpdateAfterBindResources(this.segment(), index); }
        /// Sets `maxPerStageUpdateAfterBindResources` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageUpdateAfterBindResourcesAt(long index, int value) { maxPerStageUpdateAfterBindResources(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindSamplers` at the given index}
        /// @param index the index of the struct buffer
        public int maxDescriptorSetUpdateAfterBindSamplersAt(long index) { return maxDescriptorSetUpdateAfterBindSamplers(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindSamplers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindSamplersAt(long index, int value) { maxDescriptorSetUpdateAfterBindSamplers(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffers` at the given index}
        /// @param index the index of the struct buffer
        public int maxDescriptorSetUpdateAfterBindUniformBuffersAt(long index) { return maxDescriptorSetUpdateAfterBindUniformBuffers(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindUniformBuffersAt(long index, int value) { maxDescriptorSetUpdateAfterBindUniformBuffers(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` at the given index}
        /// @param index the index of the struct buffer
        public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamicAt(long index) { return maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindUniformBuffersDynamicAt(long index, int value) { maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffers` at the given index}
        /// @param index the index of the struct buffer
        public int maxDescriptorSetUpdateAfterBindStorageBuffersAt(long index) { return maxDescriptorSetUpdateAfterBindStorageBuffers(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindStorageBuffersAt(long index, int value) { maxDescriptorSetUpdateAfterBindStorageBuffers(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` at the given index}
        /// @param index the index of the struct buffer
        public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamicAt(long index) { return maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindStorageBuffersDynamicAt(long index, int value) { maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindSampledImages` at the given index}
        /// @param index the index of the struct buffer
        public int maxDescriptorSetUpdateAfterBindSampledImagesAt(long index) { return maxDescriptorSetUpdateAfterBindSampledImages(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindSampledImages` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindSampledImagesAt(long index, int value) { maxDescriptorSetUpdateAfterBindSampledImages(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindStorageImages` at the given index}
        /// @param index the index of the struct buffer
        public int maxDescriptorSetUpdateAfterBindStorageImagesAt(long index) { return maxDescriptorSetUpdateAfterBindStorageImages(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindStorageImages` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindStorageImagesAt(long index, int value) { maxDescriptorSetUpdateAfterBindStorageImages(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindInputAttachments` at the given index}
        /// @param index the index of the struct buffer
        public int maxDescriptorSetUpdateAfterBindInputAttachmentsAt(long index) { return maxDescriptorSetUpdateAfterBindInputAttachments(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindInputAttachments` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindInputAttachmentsAt(long index, int value) { maxDescriptorSetUpdateAfterBindInputAttachments(this.segment(), index, value); return this; }

        /// {@return `supportedDepthResolveModes` at the given index}
        /// @param index the index of the struct buffer
        public int supportedDepthResolveModesAt(long index) { return supportedDepthResolveModes(this.segment(), index); }
        /// Sets `supportedDepthResolveModes` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer supportedDepthResolveModesAt(long index, int value) { supportedDepthResolveModes(this.segment(), index, value); return this; }

        /// {@return `supportedStencilResolveModes` at the given index}
        /// @param index the index of the struct buffer
        public int supportedStencilResolveModesAt(long index) { return supportedStencilResolveModes(this.segment(), index); }
        /// Sets `supportedStencilResolveModes` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer supportedStencilResolveModesAt(long index, int value) { supportedStencilResolveModes(this.segment(), index, value); return this; }

        /// {@return `independentResolveNone` at the given index}
        /// @param index the index of the struct buffer
        public int independentResolveNoneAt(long index) { return independentResolveNone(this.segment(), index); }
        /// Sets `independentResolveNone` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer independentResolveNoneAt(long index, int value) { independentResolveNone(this.segment(), index, value); return this; }

        /// {@return `independentResolve` at the given index}
        /// @param index the index of the struct buffer
        public int independentResolveAt(long index) { return independentResolve(this.segment(), index); }
        /// Sets `independentResolve` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer independentResolveAt(long index, int value) { independentResolve(this.segment(), index, value); return this; }

        /// {@return `filterMinmaxSingleComponentFormats` at the given index}
        /// @param index the index of the struct buffer
        public int filterMinmaxSingleComponentFormatsAt(long index) { return filterMinmaxSingleComponentFormats(this.segment(), index); }
        /// Sets `filterMinmaxSingleComponentFormats` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer filterMinmaxSingleComponentFormatsAt(long index, int value) { filterMinmaxSingleComponentFormats(this.segment(), index, value); return this; }

        /// {@return `filterMinmaxImageComponentMapping` at the given index}
        /// @param index the index of the struct buffer
        public int filterMinmaxImageComponentMappingAt(long index) { return filterMinmaxImageComponentMapping(this.segment(), index); }
        /// Sets `filterMinmaxImageComponentMapping` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer filterMinmaxImageComponentMappingAt(long index, int value) { filterMinmaxImageComponentMapping(this.segment(), index, value); return this; }

        /// {@return `maxTimelineSemaphoreValueDifference` at the given index}
        /// @param index the index of the struct buffer
        public long maxTimelineSemaphoreValueDifferenceAt(long index) { return maxTimelineSemaphoreValueDifference(this.segment(), index); }
        /// Sets `maxTimelineSemaphoreValueDifference` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxTimelineSemaphoreValueDifferenceAt(long index, long value) { maxTimelineSemaphoreValueDifference(this.segment(), index, value); return this; }

        /// {@return `framebufferIntegerColorSampleCounts` at the given index}
        /// @param index the index of the struct buffer
        public int framebufferIntegerColorSampleCountsAt(long index) { return framebufferIntegerColorSampleCounts(this.segment(), index); }
        /// Sets `framebufferIntegerColorSampleCounts` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer framebufferIntegerColorSampleCountsAt(long index, int value) { framebufferIntegerColorSampleCounts(this.segment(), index, value); return this; }

    }
}
