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
import static overrungl.vulkan.VK12.*;
import static overrungl.vulkan.VK12.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### driverID
/// [VarHandle][#VH_driverID] - [Getter][#driverID()] - [Setter][#driverID(int)]
/// ### driverName
/// [Byte offset][#OFFSET_driverName] - [Memory layout][#ML_driverName] - [Getter][#driverName()] - [Setter][#driverName(MemorySegment)]
/// ### driverInfo
/// [Byte offset][#OFFSET_driverInfo] - [Memory layout][#ML_driverInfo] - [Getter][#driverInfo()] - [Setter][#driverInfo(MemorySegment)]
/// ### conformanceVersion
/// [Byte offset][#OFFSET_conformanceVersion] - [Memory layout][#ML_conformanceVersion] - [Getter][#conformanceVersion()] - [Setter][#conformanceVersion(MemorySegment)]
/// ### denormBehaviorIndependence
/// [VarHandle][#VH_denormBehaviorIndependence] - [Getter][#denormBehaviorIndependence()] - [Setter][#denormBehaviorIndependence(int)]
/// ### roundingModeIndependence
/// [VarHandle][#VH_roundingModeIndependence] - [Getter][#roundingModeIndependence()] - [Setter][#roundingModeIndependence(int)]
/// ### shaderSignedZeroInfNanPreserveFloat16
/// [VarHandle][#VH_shaderSignedZeroInfNanPreserveFloat16] - [Getter][#shaderSignedZeroInfNanPreserveFloat16()] - [Setter][#shaderSignedZeroInfNanPreserveFloat16(int)]
/// ### shaderSignedZeroInfNanPreserveFloat32
/// [VarHandle][#VH_shaderSignedZeroInfNanPreserveFloat32] - [Getter][#shaderSignedZeroInfNanPreserveFloat32()] - [Setter][#shaderSignedZeroInfNanPreserveFloat32(int)]
/// ### shaderSignedZeroInfNanPreserveFloat64
/// [VarHandle][#VH_shaderSignedZeroInfNanPreserveFloat64] - [Getter][#shaderSignedZeroInfNanPreserveFloat64()] - [Setter][#shaderSignedZeroInfNanPreserveFloat64(int)]
/// ### shaderDenormPreserveFloat16
/// [VarHandle][#VH_shaderDenormPreserveFloat16] - [Getter][#shaderDenormPreserveFloat16()] - [Setter][#shaderDenormPreserveFloat16(int)]
/// ### shaderDenormPreserveFloat32
/// [VarHandle][#VH_shaderDenormPreserveFloat32] - [Getter][#shaderDenormPreserveFloat32()] - [Setter][#shaderDenormPreserveFloat32(int)]
/// ### shaderDenormPreserveFloat64
/// [VarHandle][#VH_shaderDenormPreserveFloat64] - [Getter][#shaderDenormPreserveFloat64()] - [Setter][#shaderDenormPreserveFloat64(int)]
/// ### shaderDenormFlushToZeroFloat16
/// [VarHandle][#VH_shaderDenormFlushToZeroFloat16] - [Getter][#shaderDenormFlushToZeroFloat16()] - [Setter][#shaderDenormFlushToZeroFloat16(int)]
/// ### shaderDenormFlushToZeroFloat32
/// [VarHandle][#VH_shaderDenormFlushToZeroFloat32] - [Getter][#shaderDenormFlushToZeroFloat32()] - [Setter][#shaderDenormFlushToZeroFloat32(int)]
/// ### shaderDenormFlushToZeroFloat64
/// [VarHandle][#VH_shaderDenormFlushToZeroFloat64] - [Getter][#shaderDenormFlushToZeroFloat64()] - [Setter][#shaderDenormFlushToZeroFloat64(int)]
/// ### shaderRoundingModeRTEFloat16
/// [VarHandle][#VH_shaderRoundingModeRTEFloat16] - [Getter][#shaderRoundingModeRTEFloat16()] - [Setter][#shaderRoundingModeRTEFloat16(int)]
/// ### shaderRoundingModeRTEFloat32
/// [VarHandle][#VH_shaderRoundingModeRTEFloat32] - [Getter][#shaderRoundingModeRTEFloat32()] - [Setter][#shaderRoundingModeRTEFloat32(int)]
/// ### shaderRoundingModeRTEFloat64
/// [VarHandle][#VH_shaderRoundingModeRTEFloat64] - [Getter][#shaderRoundingModeRTEFloat64()] - [Setter][#shaderRoundingModeRTEFloat64(int)]
/// ### shaderRoundingModeRTZFloat16
/// [VarHandle][#VH_shaderRoundingModeRTZFloat16] - [Getter][#shaderRoundingModeRTZFloat16()] - [Setter][#shaderRoundingModeRTZFloat16(int)]
/// ### shaderRoundingModeRTZFloat32
/// [VarHandle][#VH_shaderRoundingModeRTZFloat32] - [Getter][#shaderRoundingModeRTZFloat32()] - [Setter][#shaderRoundingModeRTZFloat32(int)]
/// ### shaderRoundingModeRTZFloat64
/// [VarHandle][#VH_shaderRoundingModeRTZFloat64] - [Getter][#shaderRoundingModeRTZFloat64()] - [Setter][#shaderRoundingModeRTZFloat64(int)]
/// ### maxUpdateAfterBindDescriptorsInAllPools
/// [VarHandle][#VH_maxUpdateAfterBindDescriptorsInAllPools] - [Getter][#maxUpdateAfterBindDescriptorsInAllPools()] - [Setter][#maxUpdateAfterBindDescriptorsInAllPools(int)]
/// ### shaderUniformBufferArrayNonUniformIndexingNative
/// [VarHandle][#VH_shaderUniformBufferArrayNonUniformIndexingNative] - [Getter][#shaderUniformBufferArrayNonUniformIndexingNative()] - [Setter][#shaderUniformBufferArrayNonUniformIndexingNative(int)]
/// ### shaderSampledImageArrayNonUniformIndexingNative
/// [VarHandle][#VH_shaderSampledImageArrayNonUniformIndexingNative] - [Getter][#shaderSampledImageArrayNonUniformIndexingNative()] - [Setter][#shaderSampledImageArrayNonUniformIndexingNative(int)]
/// ### shaderStorageBufferArrayNonUniformIndexingNative
/// [VarHandle][#VH_shaderStorageBufferArrayNonUniformIndexingNative] - [Getter][#shaderStorageBufferArrayNonUniformIndexingNative()] - [Setter][#shaderStorageBufferArrayNonUniformIndexingNative(int)]
/// ### shaderStorageImageArrayNonUniformIndexingNative
/// [VarHandle][#VH_shaderStorageImageArrayNonUniformIndexingNative] - [Getter][#shaderStorageImageArrayNonUniformIndexingNative()] - [Setter][#shaderStorageImageArrayNonUniformIndexingNative(int)]
/// ### shaderInputAttachmentArrayNonUniformIndexingNative
/// [VarHandle][#VH_shaderInputAttachmentArrayNonUniformIndexingNative] - [Getter][#shaderInputAttachmentArrayNonUniformIndexingNative()] - [Setter][#shaderInputAttachmentArrayNonUniformIndexingNative(int)]
/// ### robustBufferAccessUpdateAfterBind
/// [VarHandle][#VH_robustBufferAccessUpdateAfterBind] - [Getter][#robustBufferAccessUpdateAfterBind()] - [Setter][#robustBufferAccessUpdateAfterBind(int)]
/// ### quadDivergentImplicitLod
/// [VarHandle][#VH_quadDivergentImplicitLod] - [Getter][#quadDivergentImplicitLod()] - [Setter][#quadDivergentImplicitLod(int)]
/// ### maxPerStageDescriptorUpdateAfterBindSamplers
/// [VarHandle][#VH_maxPerStageDescriptorUpdateAfterBindSamplers] - [Getter][#maxPerStageDescriptorUpdateAfterBindSamplers()] - [Setter][#maxPerStageDescriptorUpdateAfterBindSamplers(int)]
/// ### maxPerStageDescriptorUpdateAfterBindUniformBuffers
/// [VarHandle][#VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers] - [Getter][#maxPerStageDescriptorUpdateAfterBindUniformBuffers()] - [Setter][#maxPerStageDescriptorUpdateAfterBindUniformBuffers(int)]
/// ### maxPerStageDescriptorUpdateAfterBindStorageBuffers
/// [VarHandle][#VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers] - [Getter][#maxPerStageDescriptorUpdateAfterBindStorageBuffers()] - [Setter][#maxPerStageDescriptorUpdateAfterBindStorageBuffers(int)]
/// ### maxPerStageDescriptorUpdateAfterBindSampledImages
/// [VarHandle][#VH_maxPerStageDescriptorUpdateAfterBindSampledImages] - [Getter][#maxPerStageDescriptorUpdateAfterBindSampledImages()] - [Setter][#maxPerStageDescriptorUpdateAfterBindSampledImages(int)]
/// ### maxPerStageDescriptorUpdateAfterBindStorageImages
/// [VarHandle][#VH_maxPerStageDescriptorUpdateAfterBindStorageImages] - [Getter][#maxPerStageDescriptorUpdateAfterBindStorageImages()] - [Setter][#maxPerStageDescriptorUpdateAfterBindStorageImages(int)]
/// ### maxPerStageDescriptorUpdateAfterBindInputAttachments
/// [VarHandle][#VH_maxPerStageDescriptorUpdateAfterBindInputAttachments] - [Getter][#maxPerStageDescriptorUpdateAfterBindInputAttachments()] - [Setter][#maxPerStageDescriptorUpdateAfterBindInputAttachments(int)]
/// ### maxPerStageUpdateAfterBindResources
/// [VarHandle][#VH_maxPerStageUpdateAfterBindResources] - [Getter][#maxPerStageUpdateAfterBindResources()] - [Setter][#maxPerStageUpdateAfterBindResources(int)]
/// ### maxDescriptorSetUpdateAfterBindSamplers
/// [VarHandle][#VH_maxDescriptorSetUpdateAfterBindSamplers] - [Getter][#maxDescriptorSetUpdateAfterBindSamplers()] - [Setter][#maxDescriptorSetUpdateAfterBindSamplers(int)]
/// ### maxDescriptorSetUpdateAfterBindUniformBuffers
/// [VarHandle][#VH_maxDescriptorSetUpdateAfterBindUniformBuffers] - [Getter][#maxDescriptorSetUpdateAfterBindUniformBuffers()] - [Setter][#maxDescriptorSetUpdateAfterBindUniformBuffers(int)]
/// ### maxDescriptorSetUpdateAfterBindUniformBuffersDynamic
/// [VarHandle][#VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic] - [Getter][#maxDescriptorSetUpdateAfterBindUniformBuffersDynamic()] - [Setter][#maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(int)]
/// ### maxDescriptorSetUpdateAfterBindStorageBuffers
/// [VarHandle][#VH_maxDescriptorSetUpdateAfterBindStorageBuffers] - [Getter][#maxDescriptorSetUpdateAfterBindStorageBuffers()] - [Setter][#maxDescriptorSetUpdateAfterBindStorageBuffers(int)]
/// ### maxDescriptorSetUpdateAfterBindStorageBuffersDynamic
/// [VarHandle][#VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic] - [Getter][#maxDescriptorSetUpdateAfterBindStorageBuffersDynamic()] - [Setter][#maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(int)]
/// ### maxDescriptorSetUpdateAfterBindSampledImages
/// [VarHandle][#VH_maxDescriptorSetUpdateAfterBindSampledImages] - [Getter][#maxDescriptorSetUpdateAfterBindSampledImages()] - [Setter][#maxDescriptorSetUpdateAfterBindSampledImages(int)]
/// ### maxDescriptorSetUpdateAfterBindStorageImages
/// [VarHandle][#VH_maxDescriptorSetUpdateAfterBindStorageImages] - [Getter][#maxDescriptorSetUpdateAfterBindStorageImages()] - [Setter][#maxDescriptorSetUpdateAfterBindStorageImages(int)]
/// ### maxDescriptorSetUpdateAfterBindInputAttachments
/// [VarHandle][#VH_maxDescriptorSetUpdateAfterBindInputAttachments] - [Getter][#maxDescriptorSetUpdateAfterBindInputAttachments()] - [Setter][#maxDescriptorSetUpdateAfterBindInputAttachments(int)]
/// ### supportedDepthResolveModes
/// [VarHandle][#VH_supportedDepthResolveModes] - [Getter][#supportedDepthResolveModes()] - [Setter][#supportedDepthResolveModes(int)]
/// ### supportedStencilResolveModes
/// [VarHandle][#VH_supportedStencilResolveModes] - [Getter][#supportedStencilResolveModes()] - [Setter][#supportedStencilResolveModes(int)]
/// ### independentResolveNone
/// [VarHandle][#VH_independentResolveNone] - [Getter][#independentResolveNone()] - [Setter][#independentResolveNone(int)]
/// ### independentResolve
/// [VarHandle][#VH_independentResolve] - [Getter][#independentResolve()] - [Setter][#independentResolve(int)]
/// ### filterMinmaxSingleComponentFormats
/// [VarHandle][#VH_filterMinmaxSingleComponentFormats] - [Getter][#filterMinmaxSingleComponentFormats()] - [Setter][#filterMinmaxSingleComponentFormats(int)]
/// ### filterMinmaxImageComponentMapping
/// [VarHandle][#VH_filterMinmaxImageComponentMapping] - [Getter][#filterMinmaxImageComponentMapping()] - [Setter][#filterMinmaxImageComponentMapping(int)]
/// ### maxTimelineSemaphoreValueDifference
/// [VarHandle][#VH_maxTimelineSemaphoreValueDifference] - [Getter][#maxTimelineSemaphoreValueDifference()] - [Setter][#maxTimelineSemaphoreValueDifference(long)]
/// ### framebufferIntegerColorSampleCounts
/// [VarHandle][#VH_framebufferIntegerColorSampleCounts] - [Getter][#framebufferIntegerColorSampleCounts()] - [Setter][#framebufferIntegerColorSampleCounts(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceVulkan12Properties {
///     VkStructureType sType;
///     void * pNext;
///     VkDriverId driverID;
///     char[VK_MAX_DRIVER_NAME_SIZE] driverName;
///     char[VK_MAX_DRIVER_INFO_SIZE] driverInfo;
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
/// } VkPhysicalDeviceVulkan12Properties;
/// ```
public sealed class VkPhysicalDeviceVulkan12Properties extends Struct {
    /// The struct layout of `VkPhysicalDeviceVulkan12Properties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("driverID"),
        MemoryLayout.sequenceLayout(VK_MAX_DRIVER_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("driverName"),
        MemoryLayout.sequenceLayout(VK_MAX_DRIVER_INFO_SIZE, ValueLayout.JAVA_BYTE).withName("driverInfo"),
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
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `driverID` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_driverID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverID"));
    /// The byte offset of `driverName`.
    public static final long OFFSET_driverName = LAYOUT.byteOffset(PathElement.groupElement("driverName"));
    /// The memory layout of `driverName`.
    public static final MemoryLayout ML_driverName = LAYOUT.select(PathElement.groupElement("driverName"));
    /// The byte offset of `driverInfo`.
    public static final long OFFSET_driverInfo = LAYOUT.byteOffset(PathElement.groupElement("driverInfo"));
    /// The memory layout of `driverInfo`.
    public static final MemoryLayout ML_driverInfo = LAYOUT.select(PathElement.groupElement("driverInfo"));
    /// The byte offset of `conformanceVersion`.
    public static final long OFFSET_conformanceVersion = LAYOUT.byteOffset(PathElement.groupElement("conformanceVersion"));
    /// The memory layout of `conformanceVersion`.
    public static final MemoryLayout ML_conformanceVersion = LAYOUT.select(PathElement.groupElement("conformanceVersion"));
    /// The [VarHandle] of `denormBehaviorIndependence` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_denormBehaviorIndependence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("denormBehaviorIndependence"));
    /// The [VarHandle] of `roundingModeIndependence` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_roundingModeIndependence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("roundingModeIndependence"));
    /// The [VarHandle] of `shaderSignedZeroInfNanPreserveFloat16` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSignedZeroInfNanPreserveFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat16"));
    /// The [VarHandle] of `shaderSignedZeroInfNanPreserveFloat32` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSignedZeroInfNanPreserveFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat32"));
    /// The [VarHandle] of `shaderSignedZeroInfNanPreserveFloat64` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSignedZeroInfNanPreserveFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat64"));
    /// The [VarHandle] of `shaderDenormPreserveFloat16` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderDenormPreserveFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormPreserveFloat16"));
    /// The [VarHandle] of `shaderDenormPreserveFloat32` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderDenormPreserveFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormPreserveFloat32"));
    /// The [VarHandle] of `shaderDenormPreserveFloat64` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderDenormPreserveFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormPreserveFloat64"));
    /// The [VarHandle] of `shaderDenormFlushToZeroFloat16` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderDenormFlushToZeroFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat16"));
    /// The [VarHandle] of `shaderDenormFlushToZeroFloat32` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderDenormFlushToZeroFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat32"));
    /// The [VarHandle] of `shaderDenormFlushToZeroFloat64` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderDenormFlushToZeroFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat64"));
    /// The [VarHandle] of `shaderRoundingModeRTEFloat16` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderRoundingModeRTEFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTEFloat16"));
    /// The [VarHandle] of `shaderRoundingModeRTEFloat32` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderRoundingModeRTEFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTEFloat32"));
    /// The [VarHandle] of `shaderRoundingModeRTEFloat64` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderRoundingModeRTEFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTEFloat64"));
    /// The [VarHandle] of `shaderRoundingModeRTZFloat16` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderRoundingModeRTZFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTZFloat16"));
    /// The [VarHandle] of `shaderRoundingModeRTZFloat32` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderRoundingModeRTZFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTZFloat32"));
    /// The [VarHandle] of `shaderRoundingModeRTZFloat64` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderRoundingModeRTZFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTZFloat64"));
    /// The [VarHandle] of `maxUpdateAfterBindDescriptorsInAllPools` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxUpdateAfterBindDescriptorsInAllPools = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxUpdateAfterBindDescriptorsInAllPools"));
    /// The [VarHandle] of `shaderUniformBufferArrayNonUniformIndexingNative` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderUniformBufferArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexingNative"));
    /// The [VarHandle] of `shaderSampledImageArrayNonUniformIndexingNative` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSampledImageArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexingNative"));
    /// The [VarHandle] of `shaderStorageBufferArrayNonUniformIndexingNative` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderStorageBufferArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexingNative"));
    /// The [VarHandle] of `shaderStorageImageArrayNonUniformIndexingNative` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderStorageImageArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexingNative"));
    /// The [VarHandle] of `shaderInputAttachmentArrayNonUniformIndexingNative` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderInputAttachmentArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexingNative"));
    /// The [VarHandle] of `robustBufferAccessUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_robustBufferAccessUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustBufferAccessUpdateAfterBind"));
    /// The [VarHandle] of `quadDivergentImplicitLod` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_quadDivergentImplicitLod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("quadDivergentImplicitLod"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindSamplers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSamplers"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindUniformBuffers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindUniformBuffers"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindStorageBuffers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageBuffers"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindSampledImages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindSampledImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSampledImages"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindStorageImages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindStorageImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageImages"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindInputAttachments` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInputAttachments"));
    /// The [VarHandle] of `maxPerStageUpdateAfterBindResources` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageUpdateAfterBindResources = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageUpdateAfterBindResources"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindSamplers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSamplers"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindUniformBuffers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffers"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindStorageBuffers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffers"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindSampledImages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindSampledImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSampledImages"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindStorageImages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindStorageImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageImages"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindInputAttachments` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInputAttachments"));
    /// The [VarHandle] of `supportedDepthResolveModes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportedDepthResolveModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedDepthResolveModes"));
    /// The [VarHandle] of `supportedStencilResolveModes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportedStencilResolveModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedStencilResolveModes"));
    /// The [VarHandle] of `independentResolveNone` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_independentResolveNone = LAYOUT.arrayElementVarHandle(PathElement.groupElement("independentResolveNone"));
    /// The [VarHandle] of `independentResolve` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_independentResolve = LAYOUT.arrayElementVarHandle(PathElement.groupElement("independentResolve"));
    /// The [VarHandle] of `filterMinmaxSingleComponentFormats` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_filterMinmaxSingleComponentFormats = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterMinmaxSingleComponentFormats"));
    /// The [VarHandle] of `filterMinmaxImageComponentMapping` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_filterMinmaxImageComponentMapping = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterMinmaxImageComponentMapping"));
    /// The [VarHandle] of `maxTimelineSemaphoreValueDifference` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_maxTimelineSemaphoreValueDifference = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTimelineSemaphoreValueDifference"));
    /// The [VarHandle] of `framebufferIntegerColorSampleCounts` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_framebufferIntegerColorSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebufferIntegerColorSampleCounts"));

    /// Creates `VkPhysicalDeviceVulkan12Properties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceVulkan12Properties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceVulkan12Properties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan12Properties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan12Properties(segment); }

    /// Creates `VkPhysicalDeviceVulkan12Properties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVulkan12Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan12Properties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan12Properties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceVulkan12Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceVulkan12Properties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkan12Properties`
    public static VkPhysicalDeviceVulkan12Properties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan12Properties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceVulkan12Properties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVulkan12Properties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceVulkan12Properties` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkan12Properties`
    public static VkPhysicalDeviceVulkan12Properties allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkDriverId") int driverID, @CType("char[VK_MAX_DRIVER_NAME_SIZE]") MemorySegment driverName, @CType("char[VK_MAX_DRIVER_INFO_SIZE]") MemorySegment driverInfo, @CType("VkConformanceVersion") MemorySegment conformanceVersion, @CType("VkShaderFloatControlsIndependence") int denormBehaviorIndependence, @CType("VkShaderFloatControlsIndependence") int roundingModeIndependence, @CType("VkBool32") int shaderSignedZeroInfNanPreserveFloat16, @CType("VkBool32") int shaderSignedZeroInfNanPreserveFloat32, @CType("VkBool32") int shaderSignedZeroInfNanPreserveFloat64, @CType("VkBool32") int shaderDenormPreserveFloat16, @CType("VkBool32") int shaderDenormPreserveFloat32, @CType("VkBool32") int shaderDenormPreserveFloat64, @CType("VkBool32") int shaderDenormFlushToZeroFloat16, @CType("VkBool32") int shaderDenormFlushToZeroFloat32, @CType("VkBool32") int shaderDenormFlushToZeroFloat64, @CType("VkBool32") int shaderRoundingModeRTEFloat16, @CType("VkBool32") int shaderRoundingModeRTEFloat32, @CType("VkBool32") int shaderRoundingModeRTEFloat64, @CType("VkBool32") int shaderRoundingModeRTZFloat16, @CType("VkBool32") int shaderRoundingModeRTZFloat32, @CType("VkBool32") int shaderRoundingModeRTZFloat64, @CType("uint32_t") int maxUpdateAfterBindDescriptorsInAllPools, @CType("VkBool32") int shaderUniformBufferArrayNonUniformIndexingNative, @CType("VkBool32") int shaderSampledImageArrayNonUniformIndexingNative, @CType("VkBool32") int shaderStorageBufferArrayNonUniformIndexingNative, @CType("VkBool32") int shaderStorageImageArrayNonUniformIndexingNative, @CType("VkBool32") int shaderInputAttachmentArrayNonUniformIndexingNative, @CType("VkBool32") int robustBufferAccessUpdateAfterBind, @CType("VkBool32") int quadDivergentImplicitLod, @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindSamplers, @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindUniformBuffers, @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindStorageBuffers, @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindSampledImages, @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindStorageImages, @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindInputAttachments, @CType("uint32_t") int maxPerStageUpdateAfterBindResources, @CType("uint32_t") int maxDescriptorSetUpdateAfterBindSamplers, @CType("uint32_t") int maxDescriptorSetUpdateAfterBindUniformBuffers, @CType("uint32_t") int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic, @CType("uint32_t") int maxDescriptorSetUpdateAfterBindStorageBuffers, @CType("uint32_t") int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic, @CType("uint32_t") int maxDescriptorSetUpdateAfterBindSampledImages, @CType("uint32_t") int maxDescriptorSetUpdateAfterBindStorageImages, @CType("uint32_t") int maxDescriptorSetUpdateAfterBindInputAttachments, @CType("VkResolveModeFlags") int supportedDepthResolveModes, @CType("VkResolveModeFlags") int supportedStencilResolveModes, @CType("VkBool32") int independentResolveNone, @CType("VkBool32") int independentResolve, @CType("VkBool32") int filterMinmaxSingleComponentFormats, @CType("VkBool32") int filterMinmaxImageComponentMapping, @CType("uint64_t") long maxTimelineSemaphoreValueDifference, @CType("VkSampleCountFlags") int framebufferIntegerColorSampleCounts) { return alloc(allocator).sType(sType).pNext(pNext).driverID(driverID).driverName(driverName).driverInfo(driverInfo).conformanceVersion(conformanceVersion).denormBehaviorIndependence(denormBehaviorIndependence).roundingModeIndependence(roundingModeIndependence).shaderSignedZeroInfNanPreserveFloat16(shaderSignedZeroInfNanPreserveFloat16).shaderSignedZeroInfNanPreserveFloat32(shaderSignedZeroInfNanPreserveFloat32).shaderSignedZeroInfNanPreserveFloat64(shaderSignedZeroInfNanPreserveFloat64).shaderDenormPreserveFloat16(shaderDenormPreserveFloat16).shaderDenormPreserveFloat32(shaderDenormPreserveFloat32).shaderDenormPreserveFloat64(shaderDenormPreserveFloat64).shaderDenormFlushToZeroFloat16(shaderDenormFlushToZeroFloat16).shaderDenormFlushToZeroFloat32(shaderDenormFlushToZeroFloat32).shaderDenormFlushToZeroFloat64(shaderDenormFlushToZeroFloat64).shaderRoundingModeRTEFloat16(shaderRoundingModeRTEFloat16).shaderRoundingModeRTEFloat32(shaderRoundingModeRTEFloat32).shaderRoundingModeRTEFloat64(shaderRoundingModeRTEFloat64).shaderRoundingModeRTZFloat16(shaderRoundingModeRTZFloat16).shaderRoundingModeRTZFloat32(shaderRoundingModeRTZFloat32).shaderRoundingModeRTZFloat64(shaderRoundingModeRTZFloat64).maxUpdateAfterBindDescriptorsInAllPools(maxUpdateAfterBindDescriptorsInAllPools).shaderUniformBufferArrayNonUniformIndexingNative(shaderUniformBufferArrayNonUniformIndexingNative).shaderSampledImageArrayNonUniformIndexingNative(shaderSampledImageArrayNonUniformIndexingNative).shaderStorageBufferArrayNonUniformIndexingNative(shaderStorageBufferArrayNonUniformIndexingNative).shaderStorageImageArrayNonUniformIndexingNative(shaderStorageImageArrayNonUniformIndexingNative).shaderInputAttachmentArrayNonUniformIndexingNative(shaderInputAttachmentArrayNonUniformIndexingNative).robustBufferAccessUpdateAfterBind(robustBufferAccessUpdateAfterBind).quadDivergentImplicitLod(quadDivergentImplicitLod).maxPerStageDescriptorUpdateAfterBindSamplers(maxPerStageDescriptorUpdateAfterBindSamplers).maxPerStageDescriptorUpdateAfterBindUniformBuffers(maxPerStageDescriptorUpdateAfterBindUniformBuffers).maxPerStageDescriptorUpdateAfterBindStorageBuffers(maxPerStageDescriptorUpdateAfterBindStorageBuffers).maxPerStageDescriptorUpdateAfterBindSampledImages(maxPerStageDescriptorUpdateAfterBindSampledImages).maxPerStageDescriptorUpdateAfterBindStorageImages(maxPerStageDescriptorUpdateAfterBindStorageImages).maxPerStageDescriptorUpdateAfterBindInputAttachments(maxPerStageDescriptorUpdateAfterBindInputAttachments).maxPerStageUpdateAfterBindResources(maxPerStageUpdateAfterBindResources).maxDescriptorSetUpdateAfterBindSamplers(maxDescriptorSetUpdateAfterBindSamplers).maxDescriptorSetUpdateAfterBindUniformBuffers(maxDescriptorSetUpdateAfterBindUniformBuffers).maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(maxDescriptorSetUpdateAfterBindUniformBuffersDynamic).maxDescriptorSetUpdateAfterBindStorageBuffers(maxDescriptorSetUpdateAfterBindStorageBuffers).maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(maxDescriptorSetUpdateAfterBindStorageBuffersDynamic).maxDescriptorSetUpdateAfterBindSampledImages(maxDescriptorSetUpdateAfterBindSampledImages).maxDescriptorSetUpdateAfterBindStorageImages(maxDescriptorSetUpdateAfterBindStorageImages).maxDescriptorSetUpdateAfterBindInputAttachments(maxDescriptorSetUpdateAfterBindInputAttachments).supportedDepthResolveModes(supportedDepthResolveModes).supportedStencilResolveModes(supportedStencilResolveModes).independentResolveNone(independentResolveNone).independentResolve(independentResolve).filterMinmaxSingleComponentFormats(filterMinmaxSingleComponentFormats).filterMinmaxImageComponentMapping(filterMinmaxImageComponentMapping).maxTimelineSemaphoreValueDifference(maxTimelineSemaphoreValueDifference).framebufferIntegerColorSampleCounts(framebufferIntegerColorSampleCounts); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties copyFrom(VkPhysicalDeviceVulkan12Properties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceVulkan12Properties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceVulkan12Properties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceVulkan12Properties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceVulkan12Properties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceVulkan12Properties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceVulkan12Properties.set_pNext(this.segment(), value); return this; }

    /// {@return `driverID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDriverId") int get_driverID(MemorySegment segment, long index) { return (int) VH_driverID.get(segment, 0L, index); }
    /// {@return `driverID`}
    /// @param segment the segment of the struct
    public static @CType("VkDriverId") int get_driverID(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_driverID(segment, 0L); }
    /// {@return `driverID`}
    public @CType("VkDriverId") int driverID() { return VkPhysicalDeviceVulkan12Properties.get_driverID(this.segment()); }
    /// Sets `driverID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_driverID(MemorySegment segment, long index, @CType("VkDriverId") int value) { VH_driverID.set(segment, 0L, index, value); }
    /// Sets `driverID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_driverID(MemorySegment segment, @CType("VkDriverId") int value) { VkPhysicalDeviceVulkan12Properties.set_driverID(segment, 0L, value); }
    /// Sets `driverID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties driverID(@CType("VkDriverId") int value) { VkPhysicalDeviceVulkan12Properties.set_driverID(this.segment(), value); return this; }

    /// {@return `driverName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char[VK_MAX_DRIVER_NAME_SIZE]") MemorySegment get_driverName(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_driverName, index), ML_driverName); }
    /// {@return `driverName`}
    /// @param segment the segment of the struct
    public static @CType("char[VK_MAX_DRIVER_NAME_SIZE]") MemorySegment get_driverName(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_driverName(segment, 0L); }
    /// {@return `driverName`}
    public @CType("char[VK_MAX_DRIVER_NAME_SIZE]") MemorySegment driverName() { return VkPhysicalDeviceVulkan12Properties.get_driverName(this.segment()); }
    /// Sets `driverName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_driverName(MemorySegment segment, long index, @CType("char[VK_MAX_DRIVER_NAME_SIZE]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_driverName, index), ML_driverName.byteSize()); }
    /// Sets `driverName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_driverName(MemorySegment segment, @CType("char[VK_MAX_DRIVER_NAME_SIZE]") MemorySegment value) { VkPhysicalDeviceVulkan12Properties.set_driverName(segment, 0L, value); }
    /// Sets `driverName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties driverName(@CType("char[VK_MAX_DRIVER_NAME_SIZE]") MemorySegment value) { VkPhysicalDeviceVulkan12Properties.set_driverName(this.segment(), value); return this; }

    /// {@return `driverInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char[VK_MAX_DRIVER_INFO_SIZE]") MemorySegment get_driverInfo(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_driverInfo, index), ML_driverInfo); }
    /// {@return `driverInfo`}
    /// @param segment the segment of the struct
    public static @CType("char[VK_MAX_DRIVER_INFO_SIZE]") MemorySegment get_driverInfo(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_driverInfo(segment, 0L); }
    /// {@return `driverInfo`}
    public @CType("char[VK_MAX_DRIVER_INFO_SIZE]") MemorySegment driverInfo() { return VkPhysicalDeviceVulkan12Properties.get_driverInfo(this.segment()); }
    /// Sets `driverInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_driverInfo(MemorySegment segment, long index, @CType("char[VK_MAX_DRIVER_INFO_SIZE]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_driverInfo, index), ML_driverInfo.byteSize()); }
    /// Sets `driverInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_driverInfo(MemorySegment segment, @CType("char[VK_MAX_DRIVER_INFO_SIZE]") MemorySegment value) { VkPhysicalDeviceVulkan12Properties.set_driverInfo(segment, 0L, value); }
    /// Sets `driverInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties driverInfo(@CType("char[VK_MAX_DRIVER_INFO_SIZE]") MemorySegment value) { VkPhysicalDeviceVulkan12Properties.set_driverInfo(this.segment(), value); return this; }

    /// {@return `conformanceVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkConformanceVersion") MemorySegment get_conformanceVersion(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_conformanceVersion, index), ML_conformanceVersion); }
    /// {@return `conformanceVersion`}
    /// @param segment the segment of the struct
    public static @CType("VkConformanceVersion") MemorySegment get_conformanceVersion(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_conformanceVersion(segment, 0L); }
    /// {@return `conformanceVersion`}
    public @CType("VkConformanceVersion") MemorySegment conformanceVersion() { return VkPhysicalDeviceVulkan12Properties.get_conformanceVersion(this.segment()); }
    /// Sets `conformanceVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_conformanceVersion(MemorySegment segment, long index, @CType("VkConformanceVersion") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_conformanceVersion, index), ML_conformanceVersion.byteSize()); }
    /// Sets `conformanceVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_conformanceVersion(MemorySegment segment, @CType("VkConformanceVersion") MemorySegment value) { VkPhysicalDeviceVulkan12Properties.set_conformanceVersion(segment, 0L, value); }
    /// Sets `conformanceVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties conformanceVersion(@CType("VkConformanceVersion") MemorySegment value) { VkPhysicalDeviceVulkan12Properties.set_conformanceVersion(this.segment(), value); return this; }

    /// {@return `denormBehaviorIndependence` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderFloatControlsIndependence") int get_denormBehaviorIndependence(MemorySegment segment, long index) { return (int) VH_denormBehaviorIndependence.get(segment, 0L, index); }
    /// {@return `denormBehaviorIndependence`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderFloatControlsIndependence") int get_denormBehaviorIndependence(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_denormBehaviorIndependence(segment, 0L); }
    /// {@return `denormBehaviorIndependence`}
    public @CType("VkShaderFloatControlsIndependence") int denormBehaviorIndependence() { return VkPhysicalDeviceVulkan12Properties.get_denormBehaviorIndependence(this.segment()); }
    /// Sets `denormBehaviorIndependence` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_denormBehaviorIndependence(MemorySegment segment, long index, @CType("VkShaderFloatControlsIndependence") int value) { VH_denormBehaviorIndependence.set(segment, 0L, index, value); }
    /// Sets `denormBehaviorIndependence` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_denormBehaviorIndependence(MemorySegment segment, @CType("VkShaderFloatControlsIndependence") int value) { VkPhysicalDeviceVulkan12Properties.set_denormBehaviorIndependence(segment, 0L, value); }
    /// Sets `denormBehaviorIndependence` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties denormBehaviorIndependence(@CType("VkShaderFloatControlsIndependence") int value) { VkPhysicalDeviceVulkan12Properties.set_denormBehaviorIndependence(this.segment(), value); return this; }

    /// {@return `roundingModeIndependence` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderFloatControlsIndependence") int get_roundingModeIndependence(MemorySegment segment, long index) { return (int) VH_roundingModeIndependence.get(segment, 0L, index); }
    /// {@return `roundingModeIndependence`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderFloatControlsIndependence") int get_roundingModeIndependence(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_roundingModeIndependence(segment, 0L); }
    /// {@return `roundingModeIndependence`}
    public @CType("VkShaderFloatControlsIndependence") int roundingModeIndependence() { return VkPhysicalDeviceVulkan12Properties.get_roundingModeIndependence(this.segment()); }
    /// Sets `roundingModeIndependence` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_roundingModeIndependence(MemorySegment segment, long index, @CType("VkShaderFloatControlsIndependence") int value) { VH_roundingModeIndependence.set(segment, 0L, index, value); }
    /// Sets `roundingModeIndependence` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_roundingModeIndependence(MemorySegment segment, @CType("VkShaderFloatControlsIndependence") int value) { VkPhysicalDeviceVulkan12Properties.set_roundingModeIndependence(segment, 0L, value); }
    /// Sets `roundingModeIndependence` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties roundingModeIndependence(@CType("VkShaderFloatControlsIndependence") int value) { VkPhysicalDeviceVulkan12Properties.set_roundingModeIndependence(this.segment(), value); return this; }

    /// {@return `shaderSignedZeroInfNanPreserveFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSignedZeroInfNanPreserveFloat16(MemorySegment segment, long index) { return (int) VH_shaderSignedZeroInfNanPreserveFloat16.get(segment, 0L, index); }
    /// {@return `shaderSignedZeroInfNanPreserveFloat16`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSignedZeroInfNanPreserveFloat16(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_shaderSignedZeroInfNanPreserveFloat16(segment, 0L); }
    /// {@return `shaderSignedZeroInfNanPreserveFloat16`}
    public @CType("VkBool32") int shaderSignedZeroInfNanPreserveFloat16() { return VkPhysicalDeviceVulkan12Properties.get_shaderSignedZeroInfNanPreserveFloat16(this.segment()); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSignedZeroInfNanPreserveFloat16(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSignedZeroInfNanPreserveFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat16` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSignedZeroInfNanPreserveFloat16(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderSignedZeroInfNanPreserveFloat16(segment, 0L, value); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderSignedZeroInfNanPreserveFloat16(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderSignedZeroInfNanPreserveFloat16(this.segment(), value); return this; }

    /// {@return `shaderSignedZeroInfNanPreserveFloat32` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSignedZeroInfNanPreserveFloat32(MemorySegment segment, long index) { return (int) VH_shaderSignedZeroInfNanPreserveFloat32.get(segment, 0L, index); }
    /// {@return `shaderSignedZeroInfNanPreserveFloat32`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSignedZeroInfNanPreserveFloat32(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_shaderSignedZeroInfNanPreserveFloat32(segment, 0L); }
    /// {@return `shaderSignedZeroInfNanPreserveFloat32`}
    public @CType("VkBool32") int shaderSignedZeroInfNanPreserveFloat32() { return VkPhysicalDeviceVulkan12Properties.get_shaderSignedZeroInfNanPreserveFloat32(this.segment()); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSignedZeroInfNanPreserveFloat32(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSignedZeroInfNanPreserveFloat32.set(segment, 0L, index, value); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat32` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSignedZeroInfNanPreserveFloat32(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderSignedZeroInfNanPreserveFloat32(segment, 0L, value); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderSignedZeroInfNanPreserveFloat32(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderSignedZeroInfNanPreserveFloat32(this.segment(), value); return this; }

    /// {@return `shaderSignedZeroInfNanPreserveFloat64` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSignedZeroInfNanPreserveFloat64(MemorySegment segment, long index) { return (int) VH_shaderSignedZeroInfNanPreserveFloat64.get(segment, 0L, index); }
    /// {@return `shaderSignedZeroInfNanPreserveFloat64`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSignedZeroInfNanPreserveFloat64(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_shaderSignedZeroInfNanPreserveFloat64(segment, 0L); }
    /// {@return `shaderSignedZeroInfNanPreserveFloat64`}
    public @CType("VkBool32") int shaderSignedZeroInfNanPreserveFloat64() { return VkPhysicalDeviceVulkan12Properties.get_shaderSignedZeroInfNanPreserveFloat64(this.segment()); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSignedZeroInfNanPreserveFloat64(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSignedZeroInfNanPreserveFloat64.set(segment, 0L, index, value); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat64` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSignedZeroInfNanPreserveFloat64(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderSignedZeroInfNanPreserveFloat64(segment, 0L, value); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderSignedZeroInfNanPreserveFloat64(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderSignedZeroInfNanPreserveFloat64(this.segment(), value); return this; }

    /// {@return `shaderDenormPreserveFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderDenormPreserveFloat16(MemorySegment segment, long index) { return (int) VH_shaderDenormPreserveFloat16.get(segment, 0L, index); }
    /// {@return `shaderDenormPreserveFloat16`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderDenormPreserveFloat16(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_shaderDenormPreserveFloat16(segment, 0L); }
    /// {@return `shaderDenormPreserveFloat16`}
    public @CType("VkBool32") int shaderDenormPreserveFloat16() { return VkPhysicalDeviceVulkan12Properties.get_shaderDenormPreserveFloat16(this.segment()); }
    /// Sets `shaderDenormPreserveFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderDenormPreserveFloat16(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderDenormPreserveFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderDenormPreserveFloat16` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderDenormPreserveFloat16(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderDenormPreserveFloat16(segment, 0L, value); }
    /// Sets `shaderDenormPreserveFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderDenormPreserveFloat16(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderDenormPreserveFloat16(this.segment(), value); return this; }

    /// {@return `shaderDenormPreserveFloat32` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderDenormPreserveFloat32(MemorySegment segment, long index) { return (int) VH_shaderDenormPreserveFloat32.get(segment, 0L, index); }
    /// {@return `shaderDenormPreserveFloat32`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderDenormPreserveFloat32(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_shaderDenormPreserveFloat32(segment, 0L); }
    /// {@return `shaderDenormPreserveFloat32`}
    public @CType("VkBool32") int shaderDenormPreserveFloat32() { return VkPhysicalDeviceVulkan12Properties.get_shaderDenormPreserveFloat32(this.segment()); }
    /// Sets `shaderDenormPreserveFloat32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderDenormPreserveFloat32(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderDenormPreserveFloat32.set(segment, 0L, index, value); }
    /// Sets `shaderDenormPreserveFloat32` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderDenormPreserveFloat32(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderDenormPreserveFloat32(segment, 0L, value); }
    /// Sets `shaderDenormPreserveFloat32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderDenormPreserveFloat32(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderDenormPreserveFloat32(this.segment(), value); return this; }

    /// {@return `shaderDenormPreserveFloat64` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderDenormPreserveFloat64(MemorySegment segment, long index) { return (int) VH_shaderDenormPreserveFloat64.get(segment, 0L, index); }
    /// {@return `shaderDenormPreserveFloat64`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderDenormPreserveFloat64(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_shaderDenormPreserveFloat64(segment, 0L); }
    /// {@return `shaderDenormPreserveFloat64`}
    public @CType("VkBool32") int shaderDenormPreserveFloat64() { return VkPhysicalDeviceVulkan12Properties.get_shaderDenormPreserveFloat64(this.segment()); }
    /// Sets `shaderDenormPreserveFloat64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderDenormPreserveFloat64(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderDenormPreserveFloat64.set(segment, 0L, index, value); }
    /// Sets `shaderDenormPreserveFloat64` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderDenormPreserveFloat64(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderDenormPreserveFloat64(segment, 0L, value); }
    /// Sets `shaderDenormPreserveFloat64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderDenormPreserveFloat64(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderDenormPreserveFloat64(this.segment(), value); return this; }

    /// {@return `shaderDenormFlushToZeroFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderDenormFlushToZeroFloat16(MemorySegment segment, long index) { return (int) VH_shaderDenormFlushToZeroFloat16.get(segment, 0L, index); }
    /// {@return `shaderDenormFlushToZeroFloat16`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderDenormFlushToZeroFloat16(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_shaderDenormFlushToZeroFloat16(segment, 0L); }
    /// {@return `shaderDenormFlushToZeroFloat16`}
    public @CType("VkBool32") int shaderDenormFlushToZeroFloat16() { return VkPhysicalDeviceVulkan12Properties.get_shaderDenormFlushToZeroFloat16(this.segment()); }
    /// Sets `shaderDenormFlushToZeroFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderDenormFlushToZeroFloat16(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderDenormFlushToZeroFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderDenormFlushToZeroFloat16` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderDenormFlushToZeroFloat16(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderDenormFlushToZeroFloat16(segment, 0L, value); }
    /// Sets `shaderDenormFlushToZeroFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderDenormFlushToZeroFloat16(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderDenormFlushToZeroFloat16(this.segment(), value); return this; }

    /// {@return `shaderDenormFlushToZeroFloat32` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderDenormFlushToZeroFloat32(MemorySegment segment, long index) { return (int) VH_shaderDenormFlushToZeroFloat32.get(segment, 0L, index); }
    /// {@return `shaderDenormFlushToZeroFloat32`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderDenormFlushToZeroFloat32(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_shaderDenormFlushToZeroFloat32(segment, 0L); }
    /// {@return `shaderDenormFlushToZeroFloat32`}
    public @CType("VkBool32") int shaderDenormFlushToZeroFloat32() { return VkPhysicalDeviceVulkan12Properties.get_shaderDenormFlushToZeroFloat32(this.segment()); }
    /// Sets `shaderDenormFlushToZeroFloat32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderDenormFlushToZeroFloat32(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderDenormFlushToZeroFloat32.set(segment, 0L, index, value); }
    /// Sets `shaderDenormFlushToZeroFloat32` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderDenormFlushToZeroFloat32(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderDenormFlushToZeroFloat32(segment, 0L, value); }
    /// Sets `shaderDenormFlushToZeroFloat32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderDenormFlushToZeroFloat32(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderDenormFlushToZeroFloat32(this.segment(), value); return this; }

    /// {@return `shaderDenormFlushToZeroFloat64` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderDenormFlushToZeroFloat64(MemorySegment segment, long index) { return (int) VH_shaderDenormFlushToZeroFloat64.get(segment, 0L, index); }
    /// {@return `shaderDenormFlushToZeroFloat64`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderDenormFlushToZeroFloat64(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_shaderDenormFlushToZeroFloat64(segment, 0L); }
    /// {@return `shaderDenormFlushToZeroFloat64`}
    public @CType("VkBool32") int shaderDenormFlushToZeroFloat64() { return VkPhysicalDeviceVulkan12Properties.get_shaderDenormFlushToZeroFloat64(this.segment()); }
    /// Sets `shaderDenormFlushToZeroFloat64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderDenormFlushToZeroFloat64(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderDenormFlushToZeroFloat64.set(segment, 0L, index, value); }
    /// Sets `shaderDenormFlushToZeroFloat64` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderDenormFlushToZeroFloat64(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderDenormFlushToZeroFloat64(segment, 0L, value); }
    /// Sets `shaderDenormFlushToZeroFloat64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderDenormFlushToZeroFloat64(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderDenormFlushToZeroFloat64(this.segment(), value); return this; }

    /// {@return `shaderRoundingModeRTEFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderRoundingModeRTEFloat16(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTEFloat16.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTEFloat16`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderRoundingModeRTEFloat16(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_shaderRoundingModeRTEFloat16(segment, 0L); }
    /// {@return `shaderRoundingModeRTEFloat16`}
    public @CType("VkBool32") int shaderRoundingModeRTEFloat16() { return VkPhysicalDeviceVulkan12Properties.get_shaderRoundingModeRTEFloat16(this.segment()); }
    /// Sets `shaderRoundingModeRTEFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderRoundingModeRTEFloat16(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderRoundingModeRTEFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTEFloat16` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderRoundingModeRTEFloat16(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderRoundingModeRTEFloat16(segment, 0L, value); }
    /// Sets `shaderRoundingModeRTEFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTEFloat16(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderRoundingModeRTEFloat16(this.segment(), value); return this; }

    /// {@return `shaderRoundingModeRTEFloat32` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderRoundingModeRTEFloat32(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTEFloat32.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTEFloat32`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderRoundingModeRTEFloat32(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_shaderRoundingModeRTEFloat32(segment, 0L); }
    /// {@return `shaderRoundingModeRTEFloat32`}
    public @CType("VkBool32") int shaderRoundingModeRTEFloat32() { return VkPhysicalDeviceVulkan12Properties.get_shaderRoundingModeRTEFloat32(this.segment()); }
    /// Sets `shaderRoundingModeRTEFloat32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderRoundingModeRTEFloat32(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderRoundingModeRTEFloat32.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTEFloat32` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderRoundingModeRTEFloat32(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderRoundingModeRTEFloat32(segment, 0L, value); }
    /// Sets `shaderRoundingModeRTEFloat32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTEFloat32(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderRoundingModeRTEFloat32(this.segment(), value); return this; }

    /// {@return `shaderRoundingModeRTEFloat64` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderRoundingModeRTEFloat64(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTEFloat64.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTEFloat64`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderRoundingModeRTEFloat64(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_shaderRoundingModeRTEFloat64(segment, 0L); }
    /// {@return `shaderRoundingModeRTEFloat64`}
    public @CType("VkBool32") int shaderRoundingModeRTEFloat64() { return VkPhysicalDeviceVulkan12Properties.get_shaderRoundingModeRTEFloat64(this.segment()); }
    /// Sets `shaderRoundingModeRTEFloat64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderRoundingModeRTEFloat64(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderRoundingModeRTEFloat64.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTEFloat64` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderRoundingModeRTEFloat64(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderRoundingModeRTEFloat64(segment, 0L, value); }
    /// Sets `shaderRoundingModeRTEFloat64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTEFloat64(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderRoundingModeRTEFloat64(this.segment(), value); return this; }

    /// {@return `shaderRoundingModeRTZFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderRoundingModeRTZFloat16(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTZFloat16.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTZFloat16`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderRoundingModeRTZFloat16(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_shaderRoundingModeRTZFloat16(segment, 0L); }
    /// {@return `shaderRoundingModeRTZFloat16`}
    public @CType("VkBool32") int shaderRoundingModeRTZFloat16() { return VkPhysicalDeviceVulkan12Properties.get_shaderRoundingModeRTZFloat16(this.segment()); }
    /// Sets `shaderRoundingModeRTZFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderRoundingModeRTZFloat16(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderRoundingModeRTZFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTZFloat16` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderRoundingModeRTZFloat16(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderRoundingModeRTZFloat16(segment, 0L, value); }
    /// Sets `shaderRoundingModeRTZFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTZFloat16(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderRoundingModeRTZFloat16(this.segment(), value); return this; }

    /// {@return `shaderRoundingModeRTZFloat32` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderRoundingModeRTZFloat32(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTZFloat32.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTZFloat32`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderRoundingModeRTZFloat32(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_shaderRoundingModeRTZFloat32(segment, 0L); }
    /// {@return `shaderRoundingModeRTZFloat32`}
    public @CType("VkBool32") int shaderRoundingModeRTZFloat32() { return VkPhysicalDeviceVulkan12Properties.get_shaderRoundingModeRTZFloat32(this.segment()); }
    /// Sets `shaderRoundingModeRTZFloat32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderRoundingModeRTZFloat32(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderRoundingModeRTZFloat32.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTZFloat32` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderRoundingModeRTZFloat32(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderRoundingModeRTZFloat32(segment, 0L, value); }
    /// Sets `shaderRoundingModeRTZFloat32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTZFloat32(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderRoundingModeRTZFloat32(this.segment(), value); return this; }

    /// {@return `shaderRoundingModeRTZFloat64` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderRoundingModeRTZFloat64(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTZFloat64.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTZFloat64`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderRoundingModeRTZFloat64(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_shaderRoundingModeRTZFloat64(segment, 0L); }
    /// {@return `shaderRoundingModeRTZFloat64`}
    public @CType("VkBool32") int shaderRoundingModeRTZFloat64() { return VkPhysicalDeviceVulkan12Properties.get_shaderRoundingModeRTZFloat64(this.segment()); }
    /// Sets `shaderRoundingModeRTZFloat64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderRoundingModeRTZFloat64(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderRoundingModeRTZFloat64.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTZFloat64` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderRoundingModeRTZFloat64(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderRoundingModeRTZFloat64(segment, 0L, value); }
    /// Sets `shaderRoundingModeRTZFloat64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTZFloat64(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderRoundingModeRTZFloat64(this.segment(), value); return this; }

    /// {@return `maxUpdateAfterBindDescriptorsInAllPools` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxUpdateAfterBindDescriptorsInAllPools(MemorySegment segment, long index) { return (int) VH_maxUpdateAfterBindDescriptorsInAllPools.get(segment, 0L, index); }
    /// {@return `maxUpdateAfterBindDescriptorsInAllPools`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxUpdateAfterBindDescriptorsInAllPools(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_maxUpdateAfterBindDescriptorsInAllPools(segment, 0L); }
    /// {@return `maxUpdateAfterBindDescriptorsInAllPools`}
    public @CType("uint32_t") int maxUpdateAfterBindDescriptorsInAllPools() { return VkPhysicalDeviceVulkan12Properties.get_maxUpdateAfterBindDescriptorsInAllPools(this.segment()); }
    /// Sets `maxUpdateAfterBindDescriptorsInAllPools` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxUpdateAfterBindDescriptorsInAllPools(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxUpdateAfterBindDescriptorsInAllPools.set(segment, 0L, index, value); }
    /// Sets `maxUpdateAfterBindDescriptorsInAllPools` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxUpdateAfterBindDescriptorsInAllPools(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxUpdateAfterBindDescriptorsInAllPools(segment, 0L, value); }
    /// Sets `maxUpdateAfterBindDescriptorsInAllPools` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxUpdateAfterBindDescriptorsInAllPools(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxUpdateAfterBindDescriptorsInAllPools(this.segment(), value); return this; }

    /// {@return `shaderUniformBufferArrayNonUniformIndexingNative` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderUniformBufferArrayNonUniformIndexingNative(MemorySegment segment, long index) { return (int) VH_shaderUniformBufferArrayNonUniformIndexingNative.get(segment, 0L, index); }
    /// {@return `shaderUniformBufferArrayNonUniformIndexingNative`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderUniformBufferArrayNonUniformIndexingNative(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_shaderUniformBufferArrayNonUniformIndexingNative(segment, 0L); }
    /// {@return `shaderUniformBufferArrayNonUniformIndexingNative`}
    public @CType("VkBool32") int shaderUniformBufferArrayNonUniformIndexingNative() { return VkPhysicalDeviceVulkan12Properties.get_shaderUniformBufferArrayNonUniformIndexingNative(this.segment()); }
    /// Sets `shaderUniformBufferArrayNonUniformIndexingNative` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderUniformBufferArrayNonUniformIndexingNative(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderUniformBufferArrayNonUniformIndexingNative.set(segment, 0L, index, value); }
    /// Sets `shaderUniformBufferArrayNonUniformIndexingNative` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderUniformBufferArrayNonUniformIndexingNative(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderUniformBufferArrayNonUniformIndexingNative(segment, 0L, value); }
    /// Sets `shaderUniformBufferArrayNonUniformIndexingNative` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderUniformBufferArrayNonUniformIndexingNative(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderUniformBufferArrayNonUniformIndexingNative(this.segment(), value); return this; }

    /// {@return `shaderSampledImageArrayNonUniformIndexingNative` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSampledImageArrayNonUniformIndexingNative(MemorySegment segment, long index) { return (int) VH_shaderSampledImageArrayNonUniformIndexingNative.get(segment, 0L, index); }
    /// {@return `shaderSampledImageArrayNonUniformIndexingNative`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSampledImageArrayNonUniformIndexingNative(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_shaderSampledImageArrayNonUniformIndexingNative(segment, 0L); }
    /// {@return `shaderSampledImageArrayNonUniformIndexingNative`}
    public @CType("VkBool32") int shaderSampledImageArrayNonUniformIndexingNative() { return VkPhysicalDeviceVulkan12Properties.get_shaderSampledImageArrayNonUniformIndexingNative(this.segment()); }
    /// Sets `shaderSampledImageArrayNonUniformIndexingNative` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSampledImageArrayNonUniformIndexingNative(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSampledImageArrayNonUniformIndexingNative.set(segment, 0L, index, value); }
    /// Sets `shaderSampledImageArrayNonUniformIndexingNative` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSampledImageArrayNonUniformIndexingNative(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderSampledImageArrayNonUniformIndexingNative(segment, 0L, value); }
    /// Sets `shaderSampledImageArrayNonUniformIndexingNative` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderSampledImageArrayNonUniformIndexingNative(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderSampledImageArrayNonUniformIndexingNative(this.segment(), value); return this; }

    /// {@return `shaderStorageBufferArrayNonUniformIndexingNative` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderStorageBufferArrayNonUniformIndexingNative(MemorySegment segment, long index) { return (int) VH_shaderStorageBufferArrayNonUniformIndexingNative.get(segment, 0L, index); }
    /// {@return `shaderStorageBufferArrayNonUniformIndexingNative`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderStorageBufferArrayNonUniformIndexingNative(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_shaderStorageBufferArrayNonUniformIndexingNative(segment, 0L); }
    /// {@return `shaderStorageBufferArrayNonUniformIndexingNative`}
    public @CType("VkBool32") int shaderStorageBufferArrayNonUniformIndexingNative() { return VkPhysicalDeviceVulkan12Properties.get_shaderStorageBufferArrayNonUniformIndexingNative(this.segment()); }
    /// Sets `shaderStorageBufferArrayNonUniformIndexingNative` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderStorageBufferArrayNonUniformIndexingNative(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderStorageBufferArrayNonUniformIndexingNative.set(segment, 0L, index, value); }
    /// Sets `shaderStorageBufferArrayNonUniformIndexingNative` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderStorageBufferArrayNonUniformIndexingNative(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderStorageBufferArrayNonUniformIndexingNative(segment, 0L, value); }
    /// Sets `shaderStorageBufferArrayNonUniformIndexingNative` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderStorageBufferArrayNonUniformIndexingNative(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderStorageBufferArrayNonUniformIndexingNative(this.segment(), value); return this; }

    /// {@return `shaderStorageImageArrayNonUniformIndexingNative` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderStorageImageArrayNonUniformIndexingNative(MemorySegment segment, long index) { return (int) VH_shaderStorageImageArrayNonUniformIndexingNative.get(segment, 0L, index); }
    /// {@return `shaderStorageImageArrayNonUniformIndexingNative`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderStorageImageArrayNonUniformIndexingNative(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_shaderStorageImageArrayNonUniformIndexingNative(segment, 0L); }
    /// {@return `shaderStorageImageArrayNonUniformIndexingNative`}
    public @CType("VkBool32") int shaderStorageImageArrayNonUniformIndexingNative() { return VkPhysicalDeviceVulkan12Properties.get_shaderStorageImageArrayNonUniformIndexingNative(this.segment()); }
    /// Sets `shaderStorageImageArrayNonUniformIndexingNative` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderStorageImageArrayNonUniformIndexingNative(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderStorageImageArrayNonUniformIndexingNative.set(segment, 0L, index, value); }
    /// Sets `shaderStorageImageArrayNonUniformIndexingNative` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderStorageImageArrayNonUniformIndexingNative(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderStorageImageArrayNonUniformIndexingNative(segment, 0L, value); }
    /// Sets `shaderStorageImageArrayNonUniformIndexingNative` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderStorageImageArrayNonUniformIndexingNative(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderStorageImageArrayNonUniformIndexingNative(this.segment(), value); return this; }

    /// {@return `shaderInputAttachmentArrayNonUniformIndexingNative` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderInputAttachmentArrayNonUniformIndexingNative(MemorySegment segment, long index) { return (int) VH_shaderInputAttachmentArrayNonUniformIndexingNative.get(segment, 0L, index); }
    /// {@return `shaderInputAttachmentArrayNonUniformIndexingNative`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderInputAttachmentArrayNonUniformIndexingNative(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_shaderInputAttachmentArrayNonUniformIndexingNative(segment, 0L); }
    /// {@return `shaderInputAttachmentArrayNonUniformIndexingNative`}
    public @CType("VkBool32") int shaderInputAttachmentArrayNonUniformIndexingNative() { return VkPhysicalDeviceVulkan12Properties.get_shaderInputAttachmentArrayNonUniformIndexingNative(this.segment()); }
    /// Sets `shaderInputAttachmentArrayNonUniformIndexingNative` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderInputAttachmentArrayNonUniformIndexingNative(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderInputAttachmentArrayNonUniformIndexingNative.set(segment, 0L, index, value); }
    /// Sets `shaderInputAttachmentArrayNonUniformIndexingNative` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderInputAttachmentArrayNonUniformIndexingNative(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderInputAttachmentArrayNonUniformIndexingNative(segment, 0L, value); }
    /// Sets `shaderInputAttachmentArrayNonUniformIndexingNative` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties shaderInputAttachmentArrayNonUniformIndexingNative(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderInputAttachmentArrayNonUniformIndexingNative(this.segment(), value); return this; }

    /// {@return `robustBufferAccessUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_robustBufferAccessUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_robustBufferAccessUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `robustBufferAccessUpdateAfterBind`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_robustBufferAccessUpdateAfterBind(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_robustBufferAccessUpdateAfterBind(segment, 0L); }
    /// {@return `robustBufferAccessUpdateAfterBind`}
    public @CType("VkBool32") int robustBufferAccessUpdateAfterBind() { return VkPhysicalDeviceVulkan12Properties.get_robustBufferAccessUpdateAfterBind(this.segment()); }
    /// Sets `robustBufferAccessUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_robustBufferAccessUpdateAfterBind(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_robustBufferAccessUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `robustBufferAccessUpdateAfterBind` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_robustBufferAccessUpdateAfterBind(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_robustBufferAccessUpdateAfterBind(segment, 0L, value); }
    /// Sets `robustBufferAccessUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties robustBufferAccessUpdateAfterBind(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_robustBufferAccessUpdateAfterBind(this.segment(), value); return this; }

    /// {@return `quadDivergentImplicitLod` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_quadDivergentImplicitLod(MemorySegment segment, long index) { return (int) VH_quadDivergentImplicitLod.get(segment, 0L, index); }
    /// {@return `quadDivergentImplicitLod`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_quadDivergentImplicitLod(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_quadDivergentImplicitLod(segment, 0L); }
    /// {@return `quadDivergentImplicitLod`}
    public @CType("VkBool32") int quadDivergentImplicitLod() { return VkPhysicalDeviceVulkan12Properties.get_quadDivergentImplicitLod(this.segment()); }
    /// Sets `quadDivergentImplicitLod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_quadDivergentImplicitLod(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_quadDivergentImplicitLod.set(segment, 0L, index, value); }
    /// Sets `quadDivergentImplicitLod` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_quadDivergentImplicitLod(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_quadDivergentImplicitLod(segment, 0L, value); }
    /// Sets `quadDivergentImplicitLod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties quadDivergentImplicitLod(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_quadDivergentImplicitLod(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindSamplers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindSamplers(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindSamplers.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindSamplers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindSamplers(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_maxPerStageDescriptorUpdateAfterBindSamplers(segment, 0L); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindSamplers`}
    public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindSamplers() { return VkPhysicalDeviceVulkan12Properties.get_maxPerStageDescriptorUpdateAfterBindSamplers(this.segment()); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindSamplers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindSamplers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorUpdateAfterBindSamplers.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindSamplers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindSamplers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxPerStageDescriptorUpdateAfterBindSamplers(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindSamplers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindSamplers(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxPerStageDescriptorUpdateAfterBindSamplers(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindUniformBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindUniformBuffers(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindUniformBuffers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindUniformBuffers(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_maxPerStageDescriptorUpdateAfterBindUniformBuffers(segment, 0L); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindUniformBuffers`}
    public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindUniformBuffers() { return VkPhysicalDeviceVulkan12Properties.get_maxPerStageDescriptorUpdateAfterBindUniformBuffers(this.segment()); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindUniformBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindUniformBuffers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindUniformBuffers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindUniformBuffers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxPerStageDescriptorUpdateAfterBindUniformBuffers(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindUniformBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindUniformBuffers(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxPerStageDescriptorUpdateAfterBindUniformBuffers(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindStorageBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindStorageBuffers(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindStorageBuffers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindStorageBuffers(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_maxPerStageDescriptorUpdateAfterBindStorageBuffers(segment, 0L); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindStorageBuffers`}
    public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindStorageBuffers() { return VkPhysicalDeviceVulkan12Properties.get_maxPerStageDescriptorUpdateAfterBindStorageBuffers(this.segment()); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindStorageBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindStorageBuffers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindStorageBuffers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindStorageBuffers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxPerStageDescriptorUpdateAfterBindStorageBuffers(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindStorageBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindStorageBuffers(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxPerStageDescriptorUpdateAfterBindStorageBuffers(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindSampledImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindSampledImages(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindSampledImages.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindSampledImages`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindSampledImages(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_maxPerStageDescriptorUpdateAfterBindSampledImages(segment, 0L); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindSampledImages`}
    public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindSampledImages() { return VkPhysicalDeviceVulkan12Properties.get_maxPerStageDescriptorUpdateAfterBindSampledImages(this.segment()); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindSampledImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindSampledImages(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorUpdateAfterBindSampledImages.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindSampledImages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindSampledImages(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxPerStageDescriptorUpdateAfterBindSampledImages(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindSampledImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindSampledImages(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxPerStageDescriptorUpdateAfterBindSampledImages(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindStorageImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindStorageImages(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindStorageImages.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindStorageImages`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindStorageImages(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_maxPerStageDescriptorUpdateAfterBindStorageImages(segment, 0L); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindStorageImages`}
    public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindStorageImages() { return VkPhysicalDeviceVulkan12Properties.get_maxPerStageDescriptorUpdateAfterBindStorageImages(this.segment()); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindStorageImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindStorageImages(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorUpdateAfterBindStorageImages.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindStorageImages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindStorageImages(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxPerStageDescriptorUpdateAfterBindStorageImages(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindStorageImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindStorageImages(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxPerStageDescriptorUpdateAfterBindStorageImages(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindInputAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindInputAttachments(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindInputAttachments.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindInputAttachments`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindInputAttachments(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_maxPerStageDescriptorUpdateAfterBindInputAttachments(segment, 0L); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindInputAttachments`}
    public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindInputAttachments() { return VkPhysicalDeviceVulkan12Properties.get_maxPerStageDescriptorUpdateAfterBindInputAttachments(this.segment()); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindInputAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindInputAttachments(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorUpdateAfterBindInputAttachments.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindInputAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindInputAttachments(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxPerStageDescriptorUpdateAfterBindInputAttachments(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindInputAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindInputAttachments(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxPerStageDescriptorUpdateAfterBindInputAttachments(this.segment(), value); return this; }

    /// {@return `maxPerStageUpdateAfterBindResources` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageUpdateAfterBindResources(MemorySegment segment, long index) { return (int) VH_maxPerStageUpdateAfterBindResources.get(segment, 0L, index); }
    /// {@return `maxPerStageUpdateAfterBindResources`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageUpdateAfterBindResources(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_maxPerStageUpdateAfterBindResources(segment, 0L); }
    /// {@return `maxPerStageUpdateAfterBindResources`}
    public @CType("uint32_t") int maxPerStageUpdateAfterBindResources() { return VkPhysicalDeviceVulkan12Properties.get_maxPerStageUpdateAfterBindResources(this.segment()); }
    /// Sets `maxPerStageUpdateAfterBindResources` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageUpdateAfterBindResources(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageUpdateAfterBindResources.set(segment, 0L, index, value); }
    /// Sets `maxPerStageUpdateAfterBindResources` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageUpdateAfterBindResources(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxPerStageUpdateAfterBindResources(segment, 0L, value); }
    /// Sets `maxPerStageUpdateAfterBindResources` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxPerStageUpdateAfterBindResources(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxPerStageUpdateAfterBindResources(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindSamplers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindSamplers(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindSamplers.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindSamplers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindSamplers(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindSamplers(segment, 0L); }
    /// {@return `maxDescriptorSetUpdateAfterBindSamplers`}
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindSamplers() { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindSamplers(this.segment()); }
    /// Sets `maxDescriptorSetUpdateAfterBindSamplers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindSamplers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUpdateAfterBindSamplers.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindSamplers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindSamplers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindSamplers(segment, 0L, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindSamplers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindSamplers(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindSamplers(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindUniformBuffers(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindUniformBuffers.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindUniformBuffers(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindUniformBuffers(segment, 0L); }
    /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffers`}
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindUniformBuffers() { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindUniformBuffers(this.segment()); }
    /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindUniformBuffers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUpdateAfterBindUniformBuffers.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindUniformBuffers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindUniformBuffers(segment, 0L, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindUniformBuffers(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindUniformBuffers(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(segment, 0L); }
    /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic`}
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(this.segment()); }
    /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(segment, 0L, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindStorageBuffers(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindStorageBuffers.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindStorageBuffers(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindStorageBuffers(segment, 0L); }
    /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffers`}
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindStorageBuffers() { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindStorageBuffers(this.segment()); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindStorageBuffers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUpdateAfterBindStorageBuffers.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindStorageBuffers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindStorageBuffers(segment, 0L, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindStorageBuffers(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindStorageBuffers(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(segment, 0L); }
    /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic`}
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(this.segment()); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(segment, 0L, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindSampledImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindSampledImages(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindSampledImages.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindSampledImages`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindSampledImages(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindSampledImages(segment, 0L); }
    /// {@return `maxDescriptorSetUpdateAfterBindSampledImages`}
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindSampledImages() { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindSampledImages(this.segment()); }
    /// Sets `maxDescriptorSetUpdateAfterBindSampledImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindSampledImages(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUpdateAfterBindSampledImages.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindSampledImages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindSampledImages(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindSampledImages(segment, 0L, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindSampledImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindSampledImages(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindSampledImages(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindStorageImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindStorageImages(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindStorageImages.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindStorageImages`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindStorageImages(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindStorageImages(segment, 0L); }
    /// {@return `maxDescriptorSetUpdateAfterBindStorageImages`}
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindStorageImages() { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindStorageImages(this.segment()); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindStorageImages(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUpdateAfterBindStorageImages.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageImages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindStorageImages(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindStorageImages(segment, 0L, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindStorageImages(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindStorageImages(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindInputAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindInputAttachments(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindInputAttachments.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindInputAttachments`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindInputAttachments(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindInputAttachments(segment, 0L); }
    /// {@return `maxDescriptorSetUpdateAfterBindInputAttachments`}
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindInputAttachments() { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindInputAttachments(this.segment()); }
    /// Sets `maxDescriptorSetUpdateAfterBindInputAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindInputAttachments(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUpdateAfterBindInputAttachments.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindInputAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindInputAttachments(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindInputAttachments(segment, 0L, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindInputAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindInputAttachments(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindInputAttachments(this.segment(), value); return this; }

    /// {@return `supportedDepthResolveModes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkResolveModeFlags") int get_supportedDepthResolveModes(MemorySegment segment, long index) { return (int) VH_supportedDepthResolveModes.get(segment, 0L, index); }
    /// {@return `supportedDepthResolveModes`}
    /// @param segment the segment of the struct
    public static @CType("VkResolveModeFlags") int get_supportedDepthResolveModes(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_supportedDepthResolveModes(segment, 0L); }
    /// {@return `supportedDepthResolveModes`}
    public @CType("VkResolveModeFlags") int supportedDepthResolveModes() { return VkPhysicalDeviceVulkan12Properties.get_supportedDepthResolveModes(this.segment()); }
    /// Sets `supportedDepthResolveModes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportedDepthResolveModes(MemorySegment segment, long index, @CType("VkResolveModeFlags") int value) { VH_supportedDepthResolveModes.set(segment, 0L, index, value); }
    /// Sets `supportedDepthResolveModes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportedDepthResolveModes(MemorySegment segment, @CType("VkResolveModeFlags") int value) { VkPhysicalDeviceVulkan12Properties.set_supportedDepthResolveModes(segment, 0L, value); }
    /// Sets `supportedDepthResolveModes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties supportedDepthResolveModes(@CType("VkResolveModeFlags") int value) { VkPhysicalDeviceVulkan12Properties.set_supportedDepthResolveModes(this.segment(), value); return this; }

    /// {@return `supportedStencilResolveModes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkResolveModeFlags") int get_supportedStencilResolveModes(MemorySegment segment, long index) { return (int) VH_supportedStencilResolveModes.get(segment, 0L, index); }
    /// {@return `supportedStencilResolveModes`}
    /// @param segment the segment of the struct
    public static @CType("VkResolveModeFlags") int get_supportedStencilResolveModes(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_supportedStencilResolveModes(segment, 0L); }
    /// {@return `supportedStencilResolveModes`}
    public @CType("VkResolveModeFlags") int supportedStencilResolveModes() { return VkPhysicalDeviceVulkan12Properties.get_supportedStencilResolveModes(this.segment()); }
    /// Sets `supportedStencilResolveModes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportedStencilResolveModes(MemorySegment segment, long index, @CType("VkResolveModeFlags") int value) { VH_supportedStencilResolveModes.set(segment, 0L, index, value); }
    /// Sets `supportedStencilResolveModes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportedStencilResolveModes(MemorySegment segment, @CType("VkResolveModeFlags") int value) { VkPhysicalDeviceVulkan12Properties.set_supportedStencilResolveModes(segment, 0L, value); }
    /// Sets `supportedStencilResolveModes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties supportedStencilResolveModes(@CType("VkResolveModeFlags") int value) { VkPhysicalDeviceVulkan12Properties.set_supportedStencilResolveModes(this.segment(), value); return this; }

    /// {@return `independentResolveNone` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_independentResolveNone(MemorySegment segment, long index) { return (int) VH_independentResolveNone.get(segment, 0L, index); }
    /// {@return `independentResolveNone`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_independentResolveNone(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_independentResolveNone(segment, 0L); }
    /// {@return `independentResolveNone`}
    public @CType("VkBool32") int independentResolveNone() { return VkPhysicalDeviceVulkan12Properties.get_independentResolveNone(this.segment()); }
    /// Sets `independentResolveNone` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_independentResolveNone(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_independentResolveNone.set(segment, 0L, index, value); }
    /// Sets `independentResolveNone` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_independentResolveNone(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_independentResolveNone(segment, 0L, value); }
    /// Sets `independentResolveNone` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties independentResolveNone(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_independentResolveNone(this.segment(), value); return this; }

    /// {@return `independentResolve` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_independentResolve(MemorySegment segment, long index) { return (int) VH_independentResolve.get(segment, 0L, index); }
    /// {@return `independentResolve`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_independentResolve(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_independentResolve(segment, 0L); }
    /// {@return `independentResolve`}
    public @CType("VkBool32") int independentResolve() { return VkPhysicalDeviceVulkan12Properties.get_independentResolve(this.segment()); }
    /// Sets `independentResolve` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_independentResolve(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_independentResolve.set(segment, 0L, index, value); }
    /// Sets `independentResolve` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_independentResolve(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_independentResolve(segment, 0L, value); }
    /// Sets `independentResolve` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties independentResolve(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_independentResolve(this.segment(), value); return this; }

    /// {@return `filterMinmaxSingleComponentFormats` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_filterMinmaxSingleComponentFormats(MemorySegment segment, long index) { return (int) VH_filterMinmaxSingleComponentFormats.get(segment, 0L, index); }
    /// {@return `filterMinmaxSingleComponentFormats`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_filterMinmaxSingleComponentFormats(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_filterMinmaxSingleComponentFormats(segment, 0L); }
    /// {@return `filterMinmaxSingleComponentFormats`}
    public @CType("VkBool32") int filterMinmaxSingleComponentFormats() { return VkPhysicalDeviceVulkan12Properties.get_filterMinmaxSingleComponentFormats(this.segment()); }
    /// Sets `filterMinmaxSingleComponentFormats` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_filterMinmaxSingleComponentFormats(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_filterMinmaxSingleComponentFormats.set(segment, 0L, index, value); }
    /// Sets `filterMinmaxSingleComponentFormats` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_filterMinmaxSingleComponentFormats(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_filterMinmaxSingleComponentFormats(segment, 0L, value); }
    /// Sets `filterMinmaxSingleComponentFormats` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties filterMinmaxSingleComponentFormats(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_filterMinmaxSingleComponentFormats(this.segment(), value); return this; }

    /// {@return `filterMinmaxImageComponentMapping` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_filterMinmaxImageComponentMapping(MemorySegment segment, long index) { return (int) VH_filterMinmaxImageComponentMapping.get(segment, 0L, index); }
    /// {@return `filterMinmaxImageComponentMapping`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_filterMinmaxImageComponentMapping(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_filterMinmaxImageComponentMapping(segment, 0L); }
    /// {@return `filterMinmaxImageComponentMapping`}
    public @CType("VkBool32") int filterMinmaxImageComponentMapping() { return VkPhysicalDeviceVulkan12Properties.get_filterMinmaxImageComponentMapping(this.segment()); }
    /// Sets `filterMinmaxImageComponentMapping` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_filterMinmaxImageComponentMapping(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_filterMinmaxImageComponentMapping.set(segment, 0L, index, value); }
    /// Sets `filterMinmaxImageComponentMapping` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_filterMinmaxImageComponentMapping(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_filterMinmaxImageComponentMapping(segment, 0L, value); }
    /// Sets `filterMinmaxImageComponentMapping` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties filterMinmaxImageComponentMapping(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_filterMinmaxImageComponentMapping(this.segment(), value); return this; }

    /// {@return `maxTimelineSemaphoreValueDifference` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_maxTimelineSemaphoreValueDifference(MemorySegment segment, long index) { return (long) VH_maxTimelineSemaphoreValueDifference.get(segment, 0L, index); }
    /// {@return `maxTimelineSemaphoreValueDifference`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_maxTimelineSemaphoreValueDifference(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_maxTimelineSemaphoreValueDifference(segment, 0L); }
    /// {@return `maxTimelineSemaphoreValueDifference`}
    public @CType("uint64_t") long maxTimelineSemaphoreValueDifference() { return VkPhysicalDeviceVulkan12Properties.get_maxTimelineSemaphoreValueDifference(this.segment()); }
    /// Sets `maxTimelineSemaphoreValueDifference` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTimelineSemaphoreValueDifference(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_maxTimelineSemaphoreValueDifference.set(segment, 0L, index, value); }
    /// Sets `maxTimelineSemaphoreValueDifference` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTimelineSemaphoreValueDifference(MemorySegment segment, @CType("uint64_t") long value) { VkPhysicalDeviceVulkan12Properties.set_maxTimelineSemaphoreValueDifference(segment, 0L, value); }
    /// Sets `maxTimelineSemaphoreValueDifference` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties maxTimelineSemaphoreValueDifference(@CType("uint64_t") long value) { VkPhysicalDeviceVulkan12Properties.set_maxTimelineSemaphoreValueDifference(this.segment(), value); return this; }

    /// {@return `framebufferIntegerColorSampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlags") int get_framebufferIntegerColorSampleCounts(MemorySegment segment, long index) { return (int) VH_framebufferIntegerColorSampleCounts.get(segment, 0L, index); }
    /// {@return `framebufferIntegerColorSampleCounts`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlags") int get_framebufferIntegerColorSampleCounts(MemorySegment segment) { return VkPhysicalDeviceVulkan12Properties.get_framebufferIntegerColorSampleCounts(segment, 0L); }
    /// {@return `framebufferIntegerColorSampleCounts`}
    public @CType("VkSampleCountFlags") int framebufferIntegerColorSampleCounts() { return VkPhysicalDeviceVulkan12Properties.get_framebufferIntegerColorSampleCounts(this.segment()); }
    /// Sets `framebufferIntegerColorSampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_framebufferIntegerColorSampleCounts(MemorySegment segment, long index, @CType("VkSampleCountFlags") int value) { VH_framebufferIntegerColorSampleCounts.set(segment, 0L, index, value); }
    /// Sets `framebufferIntegerColorSampleCounts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_framebufferIntegerColorSampleCounts(MemorySegment segment, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceVulkan12Properties.set_framebufferIntegerColorSampleCounts(segment, 0L, value); }
    /// Sets `framebufferIntegerColorSampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Properties framebufferIntegerColorSampleCounts(@CType("VkSampleCountFlags") int value) { VkPhysicalDeviceVulkan12Properties.set_framebufferIntegerColorSampleCounts(this.segment(), value); return this; }

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
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceVulkan12Properties.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceVulkan12Properties.set_pNext(this.segment(), index, value); return this; }

        /// {@return `driverID` at the given index}
        /// @param index the index
        public @CType("VkDriverId") int driverIDAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_driverID(this.segment(), index); }
        /// Sets `driverID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer driverIDAt(long index, @CType("VkDriverId") int value) { VkPhysicalDeviceVulkan12Properties.set_driverID(this.segment(), index, value); return this; }

        /// {@return `driverName` at the given index}
        /// @param index the index
        public @CType("char[VK_MAX_DRIVER_NAME_SIZE]") MemorySegment driverNameAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_driverName(this.segment(), index); }
        /// Sets `driverName` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer driverNameAt(long index, @CType("char[VK_MAX_DRIVER_NAME_SIZE]") MemorySegment value) { VkPhysicalDeviceVulkan12Properties.set_driverName(this.segment(), index, value); return this; }

        /// {@return `driverInfo` at the given index}
        /// @param index the index
        public @CType("char[VK_MAX_DRIVER_INFO_SIZE]") MemorySegment driverInfoAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_driverInfo(this.segment(), index); }
        /// Sets `driverInfo` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer driverInfoAt(long index, @CType("char[VK_MAX_DRIVER_INFO_SIZE]") MemorySegment value) { VkPhysicalDeviceVulkan12Properties.set_driverInfo(this.segment(), index, value); return this; }

        /// {@return `conformanceVersion` at the given index}
        /// @param index the index
        public @CType("VkConformanceVersion") MemorySegment conformanceVersionAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_conformanceVersion(this.segment(), index); }
        /// Sets `conformanceVersion` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer conformanceVersionAt(long index, @CType("VkConformanceVersion") MemorySegment value) { VkPhysicalDeviceVulkan12Properties.set_conformanceVersion(this.segment(), index, value); return this; }

        /// {@return `denormBehaviorIndependence` at the given index}
        /// @param index the index
        public @CType("VkShaderFloatControlsIndependence") int denormBehaviorIndependenceAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_denormBehaviorIndependence(this.segment(), index); }
        /// Sets `denormBehaviorIndependence` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer denormBehaviorIndependenceAt(long index, @CType("VkShaderFloatControlsIndependence") int value) { VkPhysicalDeviceVulkan12Properties.set_denormBehaviorIndependence(this.segment(), index, value); return this; }

        /// {@return `roundingModeIndependence` at the given index}
        /// @param index the index
        public @CType("VkShaderFloatControlsIndependence") int roundingModeIndependenceAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_roundingModeIndependence(this.segment(), index); }
        /// Sets `roundingModeIndependence` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer roundingModeIndependenceAt(long index, @CType("VkShaderFloatControlsIndependence") int value) { VkPhysicalDeviceVulkan12Properties.set_roundingModeIndependence(this.segment(), index, value); return this; }

        /// {@return `shaderSignedZeroInfNanPreserveFloat16` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderSignedZeroInfNanPreserveFloat16At(long index) { return VkPhysicalDeviceVulkan12Properties.get_shaderSignedZeroInfNanPreserveFloat16(this.segment(), index); }
        /// Sets `shaderSignedZeroInfNanPreserveFloat16` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderSignedZeroInfNanPreserveFloat16At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderSignedZeroInfNanPreserveFloat16(this.segment(), index, value); return this; }

        /// {@return `shaderSignedZeroInfNanPreserveFloat32` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderSignedZeroInfNanPreserveFloat32At(long index) { return VkPhysicalDeviceVulkan12Properties.get_shaderSignedZeroInfNanPreserveFloat32(this.segment(), index); }
        /// Sets `shaderSignedZeroInfNanPreserveFloat32` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderSignedZeroInfNanPreserveFloat32At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderSignedZeroInfNanPreserveFloat32(this.segment(), index, value); return this; }

        /// {@return `shaderSignedZeroInfNanPreserveFloat64` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderSignedZeroInfNanPreserveFloat64At(long index) { return VkPhysicalDeviceVulkan12Properties.get_shaderSignedZeroInfNanPreserveFloat64(this.segment(), index); }
        /// Sets `shaderSignedZeroInfNanPreserveFloat64` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderSignedZeroInfNanPreserveFloat64At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderSignedZeroInfNanPreserveFloat64(this.segment(), index, value); return this; }

        /// {@return `shaderDenormPreserveFloat16` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderDenormPreserveFloat16At(long index) { return VkPhysicalDeviceVulkan12Properties.get_shaderDenormPreserveFloat16(this.segment(), index); }
        /// Sets `shaderDenormPreserveFloat16` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderDenormPreserveFloat16At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderDenormPreserveFloat16(this.segment(), index, value); return this; }

        /// {@return `shaderDenormPreserveFloat32` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderDenormPreserveFloat32At(long index) { return VkPhysicalDeviceVulkan12Properties.get_shaderDenormPreserveFloat32(this.segment(), index); }
        /// Sets `shaderDenormPreserveFloat32` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderDenormPreserveFloat32At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderDenormPreserveFloat32(this.segment(), index, value); return this; }

        /// {@return `shaderDenormPreserveFloat64` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderDenormPreserveFloat64At(long index) { return VkPhysicalDeviceVulkan12Properties.get_shaderDenormPreserveFloat64(this.segment(), index); }
        /// Sets `shaderDenormPreserveFloat64` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderDenormPreserveFloat64At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderDenormPreserveFloat64(this.segment(), index, value); return this; }

        /// {@return `shaderDenormFlushToZeroFloat16` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderDenormFlushToZeroFloat16At(long index) { return VkPhysicalDeviceVulkan12Properties.get_shaderDenormFlushToZeroFloat16(this.segment(), index); }
        /// Sets `shaderDenormFlushToZeroFloat16` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderDenormFlushToZeroFloat16At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderDenormFlushToZeroFloat16(this.segment(), index, value); return this; }

        /// {@return `shaderDenormFlushToZeroFloat32` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderDenormFlushToZeroFloat32At(long index) { return VkPhysicalDeviceVulkan12Properties.get_shaderDenormFlushToZeroFloat32(this.segment(), index); }
        /// Sets `shaderDenormFlushToZeroFloat32` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderDenormFlushToZeroFloat32At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderDenormFlushToZeroFloat32(this.segment(), index, value); return this; }

        /// {@return `shaderDenormFlushToZeroFloat64` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderDenormFlushToZeroFloat64At(long index) { return VkPhysicalDeviceVulkan12Properties.get_shaderDenormFlushToZeroFloat64(this.segment(), index); }
        /// Sets `shaderDenormFlushToZeroFloat64` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderDenormFlushToZeroFloat64At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderDenormFlushToZeroFloat64(this.segment(), index, value); return this; }

        /// {@return `shaderRoundingModeRTEFloat16` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderRoundingModeRTEFloat16At(long index) { return VkPhysicalDeviceVulkan12Properties.get_shaderRoundingModeRTEFloat16(this.segment(), index); }
        /// Sets `shaderRoundingModeRTEFloat16` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderRoundingModeRTEFloat16At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderRoundingModeRTEFloat16(this.segment(), index, value); return this; }

        /// {@return `shaderRoundingModeRTEFloat32` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderRoundingModeRTEFloat32At(long index) { return VkPhysicalDeviceVulkan12Properties.get_shaderRoundingModeRTEFloat32(this.segment(), index); }
        /// Sets `shaderRoundingModeRTEFloat32` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderRoundingModeRTEFloat32At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderRoundingModeRTEFloat32(this.segment(), index, value); return this; }

        /// {@return `shaderRoundingModeRTEFloat64` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderRoundingModeRTEFloat64At(long index) { return VkPhysicalDeviceVulkan12Properties.get_shaderRoundingModeRTEFloat64(this.segment(), index); }
        /// Sets `shaderRoundingModeRTEFloat64` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderRoundingModeRTEFloat64At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderRoundingModeRTEFloat64(this.segment(), index, value); return this; }

        /// {@return `shaderRoundingModeRTZFloat16` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderRoundingModeRTZFloat16At(long index) { return VkPhysicalDeviceVulkan12Properties.get_shaderRoundingModeRTZFloat16(this.segment(), index); }
        /// Sets `shaderRoundingModeRTZFloat16` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderRoundingModeRTZFloat16At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderRoundingModeRTZFloat16(this.segment(), index, value); return this; }

        /// {@return `shaderRoundingModeRTZFloat32` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderRoundingModeRTZFloat32At(long index) { return VkPhysicalDeviceVulkan12Properties.get_shaderRoundingModeRTZFloat32(this.segment(), index); }
        /// Sets `shaderRoundingModeRTZFloat32` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderRoundingModeRTZFloat32At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderRoundingModeRTZFloat32(this.segment(), index, value); return this; }

        /// {@return `shaderRoundingModeRTZFloat64` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderRoundingModeRTZFloat64At(long index) { return VkPhysicalDeviceVulkan12Properties.get_shaderRoundingModeRTZFloat64(this.segment(), index); }
        /// Sets `shaderRoundingModeRTZFloat64` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderRoundingModeRTZFloat64At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderRoundingModeRTZFloat64(this.segment(), index, value); return this; }

        /// {@return `maxUpdateAfterBindDescriptorsInAllPools` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxUpdateAfterBindDescriptorsInAllPoolsAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_maxUpdateAfterBindDescriptorsInAllPools(this.segment(), index); }
        /// Sets `maxUpdateAfterBindDescriptorsInAllPools` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxUpdateAfterBindDescriptorsInAllPoolsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxUpdateAfterBindDescriptorsInAllPools(this.segment(), index, value); return this; }

        /// {@return `shaderUniformBufferArrayNonUniformIndexingNative` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderUniformBufferArrayNonUniformIndexingNativeAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_shaderUniformBufferArrayNonUniformIndexingNative(this.segment(), index); }
        /// Sets `shaderUniformBufferArrayNonUniformIndexingNative` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderUniformBufferArrayNonUniformIndexingNativeAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderUniformBufferArrayNonUniformIndexingNative(this.segment(), index, value); return this; }

        /// {@return `shaderSampledImageArrayNonUniformIndexingNative` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderSampledImageArrayNonUniformIndexingNativeAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_shaderSampledImageArrayNonUniformIndexingNative(this.segment(), index); }
        /// Sets `shaderSampledImageArrayNonUniformIndexingNative` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderSampledImageArrayNonUniformIndexingNativeAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderSampledImageArrayNonUniformIndexingNative(this.segment(), index, value); return this; }

        /// {@return `shaderStorageBufferArrayNonUniformIndexingNative` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderStorageBufferArrayNonUniformIndexingNativeAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_shaderStorageBufferArrayNonUniformIndexingNative(this.segment(), index); }
        /// Sets `shaderStorageBufferArrayNonUniformIndexingNative` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderStorageBufferArrayNonUniformIndexingNativeAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderStorageBufferArrayNonUniformIndexingNative(this.segment(), index, value); return this; }

        /// {@return `shaderStorageImageArrayNonUniformIndexingNative` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderStorageImageArrayNonUniformIndexingNativeAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_shaderStorageImageArrayNonUniformIndexingNative(this.segment(), index); }
        /// Sets `shaderStorageImageArrayNonUniformIndexingNative` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderStorageImageArrayNonUniformIndexingNativeAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderStorageImageArrayNonUniformIndexingNative(this.segment(), index, value); return this; }

        /// {@return `shaderInputAttachmentArrayNonUniformIndexingNative` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderInputAttachmentArrayNonUniformIndexingNativeAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_shaderInputAttachmentArrayNonUniformIndexingNative(this.segment(), index); }
        /// Sets `shaderInputAttachmentArrayNonUniformIndexingNative` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderInputAttachmentArrayNonUniformIndexingNativeAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_shaderInputAttachmentArrayNonUniformIndexingNative(this.segment(), index, value); return this; }

        /// {@return `robustBufferAccessUpdateAfterBind` at the given index}
        /// @param index the index
        public @CType("VkBool32") int robustBufferAccessUpdateAfterBindAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_robustBufferAccessUpdateAfterBind(this.segment(), index); }
        /// Sets `robustBufferAccessUpdateAfterBind` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer robustBufferAccessUpdateAfterBindAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_robustBufferAccessUpdateAfterBind(this.segment(), index, value); return this; }

        /// {@return `quadDivergentImplicitLod` at the given index}
        /// @param index the index
        public @CType("VkBool32") int quadDivergentImplicitLodAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_quadDivergentImplicitLod(this.segment(), index); }
        /// Sets `quadDivergentImplicitLod` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer quadDivergentImplicitLodAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_quadDivergentImplicitLod(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindSamplers` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindSamplersAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_maxPerStageDescriptorUpdateAfterBindSamplers(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindSamplers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindSamplersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxPerStageDescriptorUpdateAfterBindSamplers(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindUniformBuffers` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindUniformBuffersAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_maxPerStageDescriptorUpdateAfterBindUniformBuffers(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindUniformBuffers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindUniformBuffersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxPerStageDescriptorUpdateAfterBindUniformBuffers(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindStorageBuffers` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindStorageBuffersAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_maxPerStageDescriptorUpdateAfterBindStorageBuffers(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindStorageBuffers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindStorageBuffersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxPerStageDescriptorUpdateAfterBindStorageBuffers(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindSampledImages` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindSampledImagesAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_maxPerStageDescriptorUpdateAfterBindSampledImages(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindSampledImages` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindSampledImagesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxPerStageDescriptorUpdateAfterBindSampledImages(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindStorageImages` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindStorageImagesAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_maxPerStageDescriptorUpdateAfterBindStorageImages(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindStorageImages` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindStorageImagesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxPerStageDescriptorUpdateAfterBindStorageImages(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindInputAttachments` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindInputAttachmentsAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_maxPerStageDescriptorUpdateAfterBindInputAttachments(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindInputAttachments` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindInputAttachmentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxPerStageDescriptorUpdateAfterBindInputAttachments(this.segment(), index, value); return this; }

        /// {@return `maxPerStageUpdateAfterBindResources` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageUpdateAfterBindResourcesAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_maxPerStageUpdateAfterBindResources(this.segment(), index); }
        /// Sets `maxPerStageUpdateAfterBindResources` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageUpdateAfterBindResourcesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxPerStageUpdateAfterBindResources(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindSamplers` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindSamplersAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindSamplers(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindSamplers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindSamplersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindSamplers(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffers` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindUniformBuffersAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindUniformBuffers(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindUniformBuffersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindUniformBuffers(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindUniformBuffersDynamicAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindUniformBuffersDynamicAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffers` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindStorageBuffersAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindStorageBuffers(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindStorageBuffersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindStorageBuffers(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindStorageBuffersDynamicAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindStorageBuffersDynamicAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindSampledImages` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindSampledImagesAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindSampledImages(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindSampledImages` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindSampledImagesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindSampledImages(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindStorageImages` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindStorageImagesAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindStorageImages(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindStorageImages` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindStorageImagesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindStorageImages(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindInputAttachments` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindInputAttachmentsAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_maxDescriptorSetUpdateAfterBindInputAttachments(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindInputAttachments` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindInputAttachmentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan12Properties.set_maxDescriptorSetUpdateAfterBindInputAttachments(this.segment(), index, value); return this; }

        /// {@return `supportedDepthResolveModes` at the given index}
        /// @param index the index
        public @CType("VkResolveModeFlags") int supportedDepthResolveModesAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_supportedDepthResolveModes(this.segment(), index); }
        /// Sets `supportedDepthResolveModes` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer supportedDepthResolveModesAt(long index, @CType("VkResolveModeFlags") int value) { VkPhysicalDeviceVulkan12Properties.set_supportedDepthResolveModes(this.segment(), index, value); return this; }

        /// {@return `supportedStencilResolveModes` at the given index}
        /// @param index the index
        public @CType("VkResolveModeFlags") int supportedStencilResolveModesAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_supportedStencilResolveModes(this.segment(), index); }
        /// Sets `supportedStencilResolveModes` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer supportedStencilResolveModesAt(long index, @CType("VkResolveModeFlags") int value) { VkPhysicalDeviceVulkan12Properties.set_supportedStencilResolveModes(this.segment(), index, value); return this; }

        /// {@return `independentResolveNone` at the given index}
        /// @param index the index
        public @CType("VkBool32") int independentResolveNoneAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_independentResolveNone(this.segment(), index); }
        /// Sets `independentResolveNone` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer independentResolveNoneAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_independentResolveNone(this.segment(), index, value); return this; }

        /// {@return `independentResolve` at the given index}
        /// @param index the index
        public @CType("VkBool32") int independentResolveAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_independentResolve(this.segment(), index); }
        /// Sets `independentResolve` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer independentResolveAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_independentResolve(this.segment(), index, value); return this; }

        /// {@return `filterMinmaxSingleComponentFormats` at the given index}
        /// @param index the index
        public @CType("VkBool32") int filterMinmaxSingleComponentFormatsAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_filterMinmaxSingleComponentFormats(this.segment(), index); }
        /// Sets `filterMinmaxSingleComponentFormats` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer filterMinmaxSingleComponentFormatsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_filterMinmaxSingleComponentFormats(this.segment(), index, value); return this; }

        /// {@return `filterMinmaxImageComponentMapping` at the given index}
        /// @param index the index
        public @CType("VkBool32") int filterMinmaxImageComponentMappingAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_filterMinmaxImageComponentMapping(this.segment(), index); }
        /// Sets `filterMinmaxImageComponentMapping` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer filterMinmaxImageComponentMappingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Properties.set_filterMinmaxImageComponentMapping(this.segment(), index, value); return this; }

        /// {@return `maxTimelineSemaphoreValueDifference` at the given index}
        /// @param index the index
        public @CType("uint64_t") long maxTimelineSemaphoreValueDifferenceAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_maxTimelineSemaphoreValueDifference(this.segment(), index); }
        /// Sets `maxTimelineSemaphoreValueDifference` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxTimelineSemaphoreValueDifferenceAt(long index, @CType("uint64_t") long value) { VkPhysicalDeviceVulkan12Properties.set_maxTimelineSemaphoreValueDifference(this.segment(), index, value); return this; }

        /// {@return `framebufferIntegerColorSampleCounts` at the given index}
        /// @param index the index
        public @CType("VkSampleCountFlags") int framebufferIntegerColorSampleCountsAt(long index) { return VkPhysicalDeviceVulkan12Properties.get_framebufferIntegerColorSampleCounts(this.segment(), index); }
        /// Sets `framebufferIntegerColorSampleCounts` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer framebufferIntegerColorSampleCountsAt(long index, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceVulkan12Properties.set_framebufferIntegerColorSampleCounts(this.segment(), index, value); return this; }

    }
}
