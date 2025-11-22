// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVulkan12Properties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVulkan12Properties {
///     VkStructureType sType;
///     void* pNext;
///     VkDriverId driverID;
///     char driverName[VK_MAX_DRIVER_NAME_SIZE];
///     char driverInfo[VK_MAX_DRIVER_INFO_SIZE];
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
/// }
/// ```
public final class VkPhysicalDeviceVulkan12Properties extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("driverID"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK12.VK_MAX_DRIVER_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("driverName"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK12.VK_MAX_DRIVER_INFO_SIZE, ValueLayout.JAVA_BYTE).withName("driverInfo"),
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
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_driverID = LAYOUT.byteOffset(PathElement.groupElement("driverID"));
    public static final long OFFSET_driverName = LAYOUT.byteOffset(PathElement.groupElement("driverName"));
    public static final long OFFSET_driverInfo = LAYOUT.byteOffset(PathElement.groupElement("driverInfo"));
    public static final long OFFSET_conformanceVersion = LAYOUT.byteOffset(PathElement.groupElement("conformanceVersion"));
    public static final long OFFSET_denormBehaviorIndependence = LAYOUT.byteOffset(PathElement.groupElement("denormBehaviorIndependence"));
    public static final long OFFSET_roundingModeIndependence = LAYOUT.byteOffset(PathElement.groupElement("roundingModeIndependence"));
    public static final long OFFSET_shaderSignedZeroInfNanPreserveFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat16"));
    public static final long OFFSET_shaderSignedZeroInfNanPreserveFloat32 = LAYOUT.byteOffset(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat32"));
    public static final long OFFSET_shaderSignedZeroInfNanPreserveFloat64 = LAYOUT.byteOffset(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat64"));
    public static final long OFFSET_shaderDenormPreserveFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormPreserveFloat16"));
    public static final long OFFSET_shaderDenormPreserveFloat32 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormPreserveFloat32"));
    public static final long OFFSET_shaderDenormPreserveFloat64 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormPreserveFloat64"));
    public static final long OFFSET_shaderDenormFlushToZeroFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormFlushToZeroFloat16"));
    public static final long OFFSET_shaderDenormFlushToZeroFloat32 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormFlushToZeroFloat32"));
    public static final long OFFSET_shaderDenormFlushToZeroFloat64 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormFlushToZeroFloat64"));
    public static final long OFFSET_shaderRoundingModeRTEFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTEFloat16"));
    public static final long OFFSET_shaderRoundingModeRTEFloat32 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTEFloat32"));
    public static final long OFFSET_shaderRoundingModeRTEFloat64 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTEFloat64"));
    public static final long OFFSET_shaderRoundingModeRTZFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTZFloat16"));
    public static final long OFFSET_shaderRoundingModeRTZFloat32 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTZFloat32"));
    public static final long OFFSET_shaderRoundingModeRTZFloat64 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTZFloat64"));
    public static final long OFFSET_maxUpdateAfterBindDescriptorsInAllPools = LAYOUT.byteOffset(PathElement.groupElement("maxUpdateAfterBindDescriptorsInAllPools"));
    public static final long OFFSET_shaderUniformBufferArrayNonUniformIndexingNative = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexingNative"));
    public static final long OFFSET_shaderSampledImageArrayNonUniformIndexingNative = LAYOUT.byteOffset(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexingNative"));
    public static final long OFFSET_shaderStorageBufferArrayNonUniformIndexingNative = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexingNative"));
    public static final long OFFSET_shaderStorageImageArrayNonUniformIndexingNative = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexingNative"));
    public static final long OFFSET_shaderInputAttachmentArrayNonUniformIndexingNative = LAYOUT.byteOffset(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexingNative"));
    public static final long OFFSET_robustBufferAccessUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("robustBufferAccessUpdateAfterBind"));
    public static final long OFFSET_quadDivergentImplicitLod = LAYOUT.byteOffset(PathElement.groupElement("quadDivergentImplicitLod"));
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindSamplers = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSamplers"));
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindUniformBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindUniformBuffers"));
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindStorageBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageBuffers"));
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindSampledImages = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSampledImages"));
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindStorageImages = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageImages"));
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindInputAttachments = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInputAttachments"));
    public static final long OFFSET_maxPerStageUpdateAfterBindResources = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageUpdateAfterBindResources"));
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindSamplers = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSamplers"));
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindUniformBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffers"));
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic"));
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindStorageBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffers"));
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic"));
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindSampledImages = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSampledImages"));
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindStorageImages = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageImages"));
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindInputAttachments = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInputAttachments"));
    public static final long OFFSET_supportedDepthResolveModes = LAYOUT.byteOffset(PathElement.groupElement("supportedDepthResolveModes"));
    public static final long OFFSET_supportedStencilResolveModes = LAYOUT.byteOffset(PathElement.groupElement("supportedStencilResolveModes"));
    public static final long OFFSET_independentResolveNone = LAYOUT.byteOffset(PathElement.groupElement("independentResolveNone"));
    public static final long OFFSET_independentResolve = LAYOUT.byteOffset(PathElement.groupElement("independentResolve"));
    public static final long OFFSET_filterMinmaxSingleComponentFormats = LAYOUT.byteOffset(PathElement.groupElement("filterMinmaxSingleComponentFormats"));
    public static final long OFFSET_filterMinmaxImageComponentMapping = LAYOUT.byteOffset(PathElement.groupElement("filterMinmaxImageComponentMapping"));
    public static final long OFFSET_maxTimelineSemaphoreValueDifference = LAYOUT.byteOffset(PathElement.groupElement("maxTimelineSemaphoreValueDifference"));
    public static final long OFFSET_framebufferIntegerColorSampleCounts = LAYOUT.byteOffset(PathElement.groupElement("framebufferIntegerColorSampleCounts"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_driverID = LAYOUT.select(PathElement.groupElement("driverID"));
    public static final MemoryLayout LAYOUT_driverName = LAYOUT.select(PathElement.groupElement("driverName"));
    public static final MemoryLayout LAYOUT_driverInfo = LAYOUT.select(PathElement.groupElement("driverInfo"));
    public static final MemoryLayout LAYOUT_conformanceVersion = LAYOUT.select(PathElement.groupElement("conformanceVersion"));
    public static final MemoryLayout LAYOUT_denormBehaviorIndependence = LAYOUT.select(PathElement.groupElement("denormBehaviorIndependence"));
    public static final MemoryLayout LAYOUT_roundingModeIndependence = LAYOUT.select(PathElement.groupElement("roundingModeIndependence"));
    public static final MemoryLayout LAYOUT_shaderSignedZeroInfNanPreserveFloat16 = LAYOUT.select(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat16"));
    public static final MemoryLayout LAYOUT_shaderSignedZeroInfNanPreserveFloat32 = LAYOUT.select(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat32"));
    public static final MemoryLayout LAYOUT_shaderSignedZeroInfNanPreserveFloat64 = LAYOUT.select(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat64"));
    public static final MemoryLayout LAYOUT_shaderDenormPreserveFloat16 = LAYOUT.select(PathElement.groupElement("shaderDenormPreserveFloat16"));
    public static final MemoryLayout LAYOUT_shaderDenormPreserveFloat32 = LAYOUT.select(PathElement.groupElement("shaderDenormPreserveFloat32"));
    public static final MemoryLayout LAYOUT_shaderDenormPreserveFloat64 = LAYOUT.select(PathElement.groupElement("shaderDenormPreserveFloat64"));
    public static final MemoryLayout LAYOUT_shaderDenormFlushToZeroFloat16 = LAYOUT.select(PathElement.groupElement("shaderDenormFlushToZeroFloat16"));
    public static final MemoryLayout LAYOUT_shaderDenormFlushToZeroFloat32 = LAYOUT.select(PathElement.groupElement("shaderDenormFlushToZeroFloat32"));
    public static final MemoryLayout LAYOUT_shaderDenormFlushToZeroFloat64 = LAYOUT.select(PathElement.groupElement("shaderDenormFlushToZeroFloat64"));
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTEFloat16 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTEFloat16"));
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTEFloat32 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTEFloat32"));
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTEFloat64 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTEFloat64"));
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTZFloat16 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTZFloat16"));
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTZFloat32 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTZFloat32"));
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTZFloat64 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTZFloat64"));
    public static final MemoryLayout LAYOUT_maxUpdateAfterBindDescriptorsInAllPools = LAYOUT.select(PathElement.groupElement("maxUpdateAfterBindDescriptorsInAllPools"));
    public static final MemoryLayout LAYOUT_shaderUniformBufferArrayNonUniformIndexingNative = LAYOUT.select(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexingNative"));
    public static final MemoryLayout LAYOUT_shaderSampledImageArrayNonUniformIndexingNative = LAYOUT.select(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexingNative"));
    public static final MemoryLayout LAYOUT_shaderStorageBufferArrayNonUniformIndexingNative = LAYOUT.select(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexingNative"));
    public static final MemoryLayout LAYOUT_shaderStorageImageArrayNonUniformIndexingNative = LAYOUT.select(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexingNative"));
    public static final MemoryLayout LAYOUT_shaderInputAttachmentArrayNonUniformIndexingNative = LAYOUT.select(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexingNative"));
    public static final MemoryLayout LAYOUT_robustBufferAccessUpdateAfterBind = LAYOUT.select(PathElement.groupElement("robustBufferAccessUpdateAfterBind"));
    public static final MemoryLayout LAYOUT_quadDivergentImplicitLod = LAYOUT.select(PathElement.groupElement("quadDivergentImplicitLod"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindSamplers = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSamplers"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindUniformBuffers = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindUniformBuffers"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindStorageBuffers = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageBuffers"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindSampledImages = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSampledImages"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindStorageImages = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageImages"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindInputAttachments = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInputAttachments"));
    public static final MemoryLayout LAYOUT_maxPerStageUpdateAfterBindResources = LAYOUT.select(PathElement.groupElement("maxPerStageUpdateAfterBindResources"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindSamplers = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSamplers"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindUniformBuffers = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffers"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindStorageBuffers = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffers"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindSampledImages = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSampledImages"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindStorageImages = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageImages"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindInputAttachments = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInputAttachments"));
    public static final MemoryLayout LAYOUT_supportedDepthResolveModes = LAYOUT.select(PathElement.groupElement("supportedDepthResolveModes"));
    public static final MemoryLayout LAYOUT_supportedStencilResolveModes = LAYOUT.select(PathElement.groupElement("supportedStencilResolveModes"));
    public static final MemoryLayout LAYOUT_independentResolveNone = LAYOUT.select(PathElement.groupElement("independentResolveNone"));
    public static final MemoryLayout LAYOUT_independentResolve = LAYOUT.select(PathElement.groupElement("independentResolve"));
    public static final MemoryLayout LAYOUT_filterMinmaxSingleComponentFormats = LAYOUT.select(PathElement.groupElement("filterMinmaxSingleComponentFormats"));
    public static final MemoryLayout LAYOUT_filterMinmaxImageComponentMapping = LAYOUT.select(PathElement.groupElement("filterMinmaxImageComponentMapping"));
    public static final MemoryLayout LAYOUT_maxTimelineSemaphoreValueDifference = LAYOUT.select(PathElement.groupElement("maxTimelineSemaphoreValueDifference"));
    public static final MemoryLayout LAYOUT_framebufferIntegerColorSampleCounts = LAYOUT.select(PathElement.groupElement("framebufferIntegerColorSampleCounts"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_driverID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverID"));
    public static final VarHandle VH_driverName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverName"), PathElement.sequenceElement());
    public static final VarHandle VH_driverInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverInfo"), PathElement.sequenceElement());
    public static final VarHandle VH_conformanceVersion$major = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conformanceVersion"), PathElement.groupElement("major"));
    public static final VarHandle VH_conformanceVersion$minor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conformanceVersion"), PathElement.groupElement("minor"));
    public static final VarHandle VH_conformanceVersion$subminor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conformanceVersion"), PathElement.groupElement("subminor"));
    public static final VarHandle VH_conformanceVersion$patch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conformanceVersion"), PathElement.groupElement("patch"));
    public static final VarHandle VH_denormBehaviorIndependence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("denormBehaviorIndependence"));
    public static final VarHandle VH_roundingModeIndependence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("roundingModeIndependence"));
    public static final VarHandle VH_shaderSignedZeroInfNanPreserveFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat16"));
    public static final VarHandle VH_shaderSignedZeroInfNanPreserveFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat32"));
    public static final VarHandle VH_shaderSignedZeroInfNanPreserveFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat64"));
    public static final VarHandle VH_shaderDenormPreserveFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormPreserveFloat16"));
    public static final VarHandle VH_shaderDenormPreserveFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormPreserveFloat32"));
    public static final VarHandle VH_shaderDenormPreserveFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormPreserveFloat64"));
    public static final VarHandle VH_shaderDenormFlushToZeroFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat16"));
    public static final VarHandle VH_shaderDenormFlushToZeroFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat32"));
    public static final VarHandle VH_shaderDenormFlushToZeroFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat64"));
    public static final VarHandle VH_shaderRoundingModeRTEFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTEFloat16"));
    public static final VarHandle VH_shaderRoundingModeRTEFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTEFloat32"));
    public static final VarHandle VH_shaderRoundingModeRTEFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTEFloat64"));
    public static final VarHandle VH_shaderRoundingModeRTZFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTZFloat16"));
    public static final VarHandle VH_shaderRoundingModeRTZFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTZFloat32"));
    public static final VarHandle VH_shaderRoundingModeRTZFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTZFloat64"));
    public static final VarHandle VH_maxUpdateAfterBindDescriptorsInAllPools = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxUpdateAfterBindDescriptorsInAllPools"));
    public static final VarHandle VH_shaderUniformBufferArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexingNative"));
    public static final VarHandle VH_shaderSampledImageArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexingNative"));
    public static final VarHandle VH_shaderStorageBufferArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexingNative"));
    public static final VarHandle VH_shaderStorageImageArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexingNative"));
    public static final VarHandle VH_shaderInputAttachmentArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexingNative"));
    public static final VarHandle VH_robustBufferAccessUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustBufferAccessUpdateAfterBind"));
    public static final VarHandle VH_quadDivergentImplicitLod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("quadDivergentImplicitLod"));
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSamplers"));
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindUniformBuffers"));
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageBuffers"));
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindSampledImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSampledImages"));
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindStorageImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageImages"));
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInputAttachments"));
    public static final VarHandle VH_maxPerStageUpdateAfterBindResources = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageUpdateAfterBindResources"));
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSamplers"));
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffers"));
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic"));
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffers"));
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic"));
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindSampledImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSampledImages"));
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindStorageImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageImages"));
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInputAttachments"));
    public static final VarHandle VH_supportedDepthResolveModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedDepthResolveModes"));
    public static final VarHandle VH_supportedStencilResolveModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedStencilResolveModes"));
    public static final VarHandle VH_independentResolveNone = LAYOUT.arrayElementVarHandle(PathElement.groupElement("independentResolveNone"));
    public static final VarHandle VH_independentResolve = LAYOUT.arrayElementVarHandle(PathElement.groupElement("independentResolve"));
    public static final VarHandle VH_filterMinmaxSingleComponentFormats = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterMinmaxSingleComponentFormats"));
    public static final VarHandle VH_filterMinmaxImageComponentMapping = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterMinmaxImageComponentMapping"));
    public static final VarHandle VH_maxTimelineSemaphoreValueDifference = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTimelineSemaphoreValueDifference"));
    public static final VarHandle VH_framebufferIntegerColorSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebufferIntegerColorSampleCounts"));

    public VkPhysicalDeviceVulkan12Properties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceVulkan12Properties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan12Properties(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceVulkan12Properties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan12Properties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceVulkan12Properties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan12Properties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceVulkan12Properties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan12Properties(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceVulkan12Properties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVulkan12Properties(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceVulkan12Properties allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES); }
    public static VkPhysicalDeviceVulkan12Properties allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceVulkan12Properties copyFrom(VkPhysicalDeviceVulkan12Properties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceVulkan12Properties reinterpret(long count) { return new VkPhysicalDeviceVulkan12Properties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceVulkan12Properties asSlice(long index) { return new VkPhysicalDeviceVulkan12Properties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceVulkan12Properties asSlice(long index, long count) { return new VkPhysicalDeviceVulkan12Properties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceVulkan12Properties at(long index, Consumer<VkPhysicalDeviceVulkan12Properties> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int driverIDAt(long index) { return (int) VH_driverID.get(this.segment(), 0L, index); }
    public byte driverNameAt(long index, long index0) { return (byte) VH_driverName.get(this.segment(), 0L, index, index0); }
    public byte driverInfoAt(long index, long index0) { return (byte) VH_driverInfo.get(this.segment(), 0L, index, index0); }
    public byte conformanceVersion$majorAt(long index) { return (byte) VH_conformanceVersion$major.get(this.segment(), 0L, index); }
    public byte conformanceVersion$minorAt(long index) { return (byte) VH_conformanceVersion$minor.get(this.segment(), 0L, index); }
    public byte conformanceVersion$subminorAt(long index) { return (byte) VH_conformanceVersion$subminor.get(this.segment(), 0L, index); }
    public byte conformanceVersion$patchAt(long index) { return (byte) VH_conformanceVersion$patch.get(this.segment(), 0L, index); }
    public int denormBehaviorIndependenceAt(long index) { return (int) VH_denormBehaviorIndependence.get(this.segment(), 0L, index); }
    public int roundingModeIndependenceAt(long index) { return (int) VH_roundingModeIndependence.get(this.segment(), 0L, index); }
    public int shaderSignedZeroInfNanPreserveFloat16At(long index) { return (int) VH_shaderSignedZeroInfNanPreserveFloat16.get(this.segment(), 0L, index); }
    public int shaderSignedZeroInfNanPreserveFloat32At(long index) { return (int) VH_shaderSignedZeroInfNanPreserveFloat32.get(this.segment(), 0L, index); }
    public int shaderSignedZeroInfNanPreserveFloat64At(long index) { return (int) VH_shaderSignedZeroInfNanPreserveFloat64.get(this.segment(), 0L, index); }
    public int shaderDenormPreserveFloat16At(long index) { return (int) VH_shaderDenormPreserveFloat16.get(this.segment(), 0L, index); }
    public int shaderDenormPreserveFloat32At(long index) { return (int) VH_shaderDenormPreserveFloat32.get(this.segment(), 0L, index); }
    public int shaderDenormPreserveFloat64At(long index) { return (int) VH_shaderDenormPreserveFloat64.get(this.segment(), 0L, index); }
    public int shaderDenormFlushToZeroFloat16At(long index) { return (int) VH_shaderDenormFlushToZeroFloat16.get(this.segment(), 0L, index); }
    public int shaderDenormFlushToZeroFloat32At(long index) { return (int) VH_shaderDenormFlushToZeroFloat32.get(this.segment(), 0L, index); }
    public int shaderDenormFlushToZeroFloat64At(long index) { return (int) VH_shaderDenormFlushToZeroFloat64.get(this.segment(), 0L, index); }
    public int shaderRoundingModeRTEFloat16At(long index) { return (int) VH_shaderRoundingModeRTEFloat16.get(this.segment(), 0L, index); }
    public int shaderRoundingModeRTEFloat32At(long index) { return (int) VH_shaderRoundingModeRTEFloat32.get(this.segment(), 0L, index); }
    public int shaderRoundingModeRTEFloat64At(long index) { return (int) VH_shaderRoundingModeRTEFloat64.get(this.segment(), 0L, index); }
    public int shaderRoundingModeRTZFloat16At(long index) { return (int) VH_shaderRoundingModeRTZFloat16.get(this.segment(), 0L, index); }
    public int shaderRoundingModeRTZFloat32At(long index) { return (int) VH_shaderRoundingModeRTZFloat32.get(this.segment(), 0L, index); }
    public int shaderRoundingModeRTZFloat64At(long index) { return (int) VH_shaderRoundingModeRTZFloat64.get(this.segment(), 0L, index); }
    public int maxUpdateAfterBindDescriptorsInAllPoolsAt(long index) { return (int) VH_maxUpdateAfterBindDescriptorsInAllPools.get(this.segment(), 0L, index); }
    public int shaderUniformBufferArrayNonUniformIndexingNativeAt(long index) { return (int) VH_shaderUniformBufferArrayNonUniformIndexingNative.get(this.segment(), 0L, index); }
    public int shaderSampledImageArrayNonUniformIndexingNativeAt(long index) { return (int) VH_shaderSampledImageArrayNonUniformIndexingNative.get(this.segment(), 0L, index); }
    public int shaderStorageBufferArrayNonUniformIndexingNativeAt(long index) { return (int) VH_shaderStorageBufferArrayNonUniformIndexingNative.get(this.segment(), 0L, index); }
    public int shaderStorageImageArrayNonUniformIndexingNativeAt(long index) { return (int) VH_shaderStorageImageArrayNonUniformIndexingNative.get(this.segment(), 0L, index); }
    public int shaderInputAttachmentArrayNonUniformIndexingNativeAt(long index) { return (int) VH_shaderInputAttachmentArrayNonUniformIndexingNative.get(this.segment(), 0L, index); }
    public int robustBufferAccessUpdateAfterBindAt(long index) { return (int) VH_robustBufferAccessUpdateAfterBind.get(this.segment(), 0L, index); }
    public int quadDivergentImplicitLodAt(long index) { return (int) VH_quadDivergentImplicitLod.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorUpdateAfterBindSamplersAt(long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindSamplers.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorUpdateAfterBindUniformBuffersAt(long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorUpdateAfterBindStorageBuffersAt(long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorUpdateAfterBindSampledImagesAt(long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindSampledImages.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorUpdateAfterBindStorageImagesAt(long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindStorageImages.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorUpdateAfterBindInputAttachmentsAt(long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindInputAttachments.get(this.segment(), 0L, index); }
    public int maxPerStageUpdateAfterBindResourcesAt(long index) { return (int) VH_maxPerStageUpdateAfterBindResources.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUpdateAfterBindSamplersAt(long index) { return (int) VH_maxDescriptorSetUpdateAfterBindSamplers.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUpdateAfterBindUniformBuffersAt(long index) { return (int) VH_maxDescriptorSetUpdateAfterBindUniformBuffers.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamicAt(long index) { return (int) VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUpdateAfterBindStorageBuffersAt(long index) { return (int) VH_maxDescriptorSetUpdateAfterBindStorageBuffers.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamicAt(long index) { return (int) VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUpdateAfterBindSampledImagesAt(long index) { return (int) VH_maxDescriptorSetUpdateAfterBindSampledImages.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUpdateAfterBindStorageImagesAt(long index) { return (int) VH_maxDescriptorSetUpdateAfterBindStorageImages.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUpdateAfterBindInputAttachmentsAt(long index) { return (int) VH_maxDescriptorSetUpdateAfterBindInputAttachments.get(this.segment(), 0L, index); }
    public int supportedDepthResolveModesAt(long index) { return (int) VH_supportedDepthResolveModes.get(this.segment(), 0L, index); }
    public int supportedStencilResolveModesAt(long index) { return (int) VH_supportedStencilResolveModes.get(this.segment(), 0L, index); }
    public int independentResolveNoneAt(long index) { return (int) VH_independentResolveNone.get(this.segment(), 0L, index); }
    public int independentResolveAt(long index) { return (int) VH_independentResolve.get(this.segment(), 0L, index); }
    public int filterMinmaxSingleComponentFormatsAt(long index) { return (int) VH_filterMinmaxSingleComponentFormats.get(this.segment(), 0L, index); }
    public int filterMinmaxImageComponentMappingAt(long index) { return (int) VH_filterMinmaxImageComponentMapping.get(this.segment(), 0L, index); }
    public long maxTimelineSemaphoreValueDifferenceAt(long index) { return (long) VH_maxTimelineSemaphoreValueDifference.get(this.segment(), 0L, index); }
    public int framebufferIntegerColorSampleCountsAt(long index) { return (int) VH_framebufferIntegerColorSampleCounts.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int driverID() { return (int) VH_driverID.get(this.segment(), 0L, 0L); }
    public byte driverName(long index0) { return (byte) VH_driverName.get(this.segment(), 0L, 0L, index0); }
    public byte driverInfo(long index0) { return (byte) VH_driverInfo.get(this.segment(), 0L, 0L, index0); }
    public byte conformanceVersion$major() { return (byte) VH_conformanceVersion$major.get(this.segment(), 0L, 0L); }
    public byte conformanceVersion$minor() { return (byte) VH_conformanceVersion$minor.get(this.segment(), 0L, 0L); }
    public byte conformanceVersion$subminor() { return (byte) VH_conformanceVersion$subminor.get(this.segment(), 0L, 0L); }
    public byte conformanceVersion$patch() { return (byte) VH_conformanceVersion$patch.get(this.segment(), 0L, 0L); }
    public int denormBehaviorIndependence() { return (int) VH_denormBehaviorIndependence.get(this.segment(), 0L, 0L); }
    public int roundingModeIndependence() { return (int) VH_roundingModeIndependence.get(this.segment(), 0L, 0L); }
    public int shaderSignedZeroInfNanPreserveFloat16() { return (int) VH_shaderSignedZeroInfNanPreserveFloat16.get(this.segment(), 0L, 0L); }
    public int shaderSignedZeroInfNanPreserveFloat32() { return (int) VH_shaderSignedZeroInfNanPreserveFloat32.get(this.segment(), 0L, 0L); }
    public int shaderSignedZeroInfNanPreserveFloat64() { return (int) VH_shaderSignedZeroInfNanPreserveFloat64.get(this.segment(), 0L, 0L); }
    public int shaderDenormPreserveFloat16() { return (int) VH_shaderDenormPreserveFloat16.get(this.segment(), 0L, 0L); }
    public int shaderDenormPreserveFloat32() { return (int) VH_shaderDenormPreserveFloat32.get(this.segment(), 0L, 0L); }
    public int shaderDenormPreserveFloat64() { return (int) VH_shaderDenormPreserveFloat64.get(this.segment(), 0L, 0L); }
    public int shaderDenormFlushToZeroFloat16() { return (int) VH_shaderDenormFlushToZeroFloat16.get(this.segment(), 0L, 0L); }
    public int shaderDenormFlushToZeroFloat32() { return (int) VH_shaderDenormFlushToZeroFloat32.get(this.segment(), 0L, 0L); }
    public int shaderDenormFlushToZeroFloat64() { return (int) VH_shaderDenormFlushToZeroFloat64.get(this.segment(), 0L, 0L); }
    public int shaderRoundingModeRTEFloat16() { return (int) VH_shaderRoundingModeRTEFloat16.get(this.segment(), 0L, 0L); }
    public int shaderRoundingModeRTEFloat32() { return (int) VH_shaderRoundingModeRTEFloat32.get(this.segment(), 0L, 0L); }
    public int shaderRoundingModeRTEFloat64() { return (int) VH_shaderRoundingModeRTEFloat64.get(this.segment(), 0L, 0L); }
    public int shaderRoundingModeRTZFloat16() { return (int) VH_shaderRoundingModeRTZFloat16.get(this.segment(), 0L, 0L); }
    public int shaderRoundingModeRTZFloat32() { return (int) VH_shaderRoundingModeRTZFloat32.get(this.segment(), 0L, 0L); }
    public int shaderRoundingModeRTZFloat64() { return (int) VH_shaderRoundingModeRTZFloat64.get(this.segment(), 0L, 0L); }
    public int maxUpdateAfterBindDescriptorsInAllPools() { return (int) VH_maxUpdateAfterBindDescriptorsInAllPools.get(this.segment(), 0L, 0L); }
    public int shaderUniformBufferArrayNonUniformIndexingNative() { return (int) VH_shaderUniformBufferArrayNonUniformIndexingNative.get(this.segment(), 0L, 0L); }
    public int shaderSampledImageArrayNonUniformIndexingNative() { return (int) VH_shaderSampledImageArrayNonUniformIndexingNative.get(this.segment(), 0L, 0L); }
    public int shaderStorageBufferArrayNonUniformIndexingNative() { return (int) VH_shaderStorageBufferArrayNonUniformIndexingNative.get(this.segment(), 0L, 0L); }
    public int shaderStorageImageArrayNonUniformIndexingNative() { return (int) VH_shaderStorageImageArrayNonUniformIndexingNative.get(this.segment(), 0L, 0L); }
    public int shaderInputAttachmentArrayNonUniformIndexingNative() { return (int) VH_shaderInputAttachmentArrayNonUniformIndexingNative.get(this.segment(), 0L, 0L); }
    public int robustBufferAccessUpdateAfterBind() { return (int) VH_robustBufferAccessUpdateAfterBind.get(this.segment(), 0L, 0L); }
    public int quadDivergentImplicitLod() { return (int) VH_quadDivergentImplicitLod.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorUpdateAfterBindSamplers() { return (int) VH_maxPerStageDescriptorUpdateAfterBindSamplers.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorUpdateAfterBindUniformBuffers() { return (int) VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorUpdateAfterBindStorageBuffers() { return (int) VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorUpdateAfterBindSampledImages() { return (int) VH_maxPerStageDescriptorUpdateAfterBindSampledImages.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorUpdateAfterBindStorageImages() { return (int) VH_maxPerStageDescriptorUpdateAfterBindStorageImages.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorUpdateAfterBindInputAttachments() { return (int) VH_maxPerStageDescriptorUpdateAfterBindInputAttachments.get(this.segment(), 0L, 0L); }
    public int maxPerStageUpdateAfterBindResources() { return (int) VH_maxPerStageUpdateAfterBindResources.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUpdateAfterBindSamplers() { return (int) VH_maxDescriptorSetUpdateAfterBindSamplers.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUpdateAfterBindUniformBuffers() { return (int) VH_maxDescriptorSetUpdateAfterBindUniformBuffers.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() { return (int) VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUpdateAfterBindStorageBuffers() { return (int) VH_maxDescriptorSetUpdateAfterBindStorageBuffers.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() { return (int) VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUpdateAfterBindSampledImages() { return (int) VH_maxDescriptorSetUpdateAfterBindSampledImages.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUpdateAfterBindStorageImages() { return (int) VH_maxDescriptorSetUpdateAfterBindStorageImages.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUpdateAfterBindInputAttachments() { return (int) VH_maxDescriptorSetUpdateAfterBindInputAttachments.get(this.segment(), 0L, 0L); }
    public int supportedDepthResolveModes() { return (int) VH_supportedDepthResolveModes.get(this.segment(), 0L, 0L); }
    public int supportedStencilResolveModes() { return (int) VH_supportedStencilResolveModes.get(this.segment(), 0L, 0L); }
    public int independentResolveNone() { return (int) VH_independentResolveNone.get(this.segment(), 0L, 0L); }
    public int independentResolve() { return (int) VH_independentResolve.get(this.segment(), 0L, 0L); }
    public int filterMinmaxSingleComponentFormats() { return (int) VH_filterMinmaxSingleComponentFormats.get(this.segment(), 0L, 0L); }
    public int filterMinmaxImageComponentMapping() { return (int) VH_filterMinmaxImageComponentMapping.get(this.segment(), 0L, 0L); }
    public long maxTimelineSemaphoreValueDifference() { return (long) VH_maxTimelineSemaphoreValueDifference.get(this.segment(), 0L, 0L); }
    public int framebufferIntegerColorSampleCounts() { return (int) VH_framebufferIntegerColorSampleCounts.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceVulkan12Properties sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties driverIDAt(long index, int value) { VH_driverID.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties driverNameAt(long index, long index0, byte value) { VH_driverName.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceVulkan12Properties driverInfoAt(long index, long index0, byte value) { VH_driverInfo.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceVulkan12Properties conformanceVersion$majorAt(long index, byte value) { VH_conformanceVersion$major.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties conformanceVersion$minorAt(long index, byte value) { VH_conformanceVersion$minor.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties conformanceVersion$subminorAt(long index, byte value) { VH_conformanceVersion$subminor.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties conformanceVersion$patchAt(long index, byte value) { VH_conformanceVersion$patch.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties denormBehaviorIndependenceAt(long index, int value) { VH_denormBehaviorIndependence.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties roundingModeIndependenceAt(long index, int value) { VH_roundingModeIndependence.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderSignedZeroInfNanPreserveFloat16At(long index, int value) { VH_shaderSignedZeroInfNanPreserveFloat16.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderSignedZeroInfNanPreserveFloat32At(long index, int value) { VH_shaderSignedZeroInfNanPreserveFloat32.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderSignedZeroInfNanPreserveFloat64At(long index, int value) { VH_shaderSignedZeroInfNanPreserveFloat64.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderDenormPreserveFloat16At(long index, int value) { VH_shaderDenormPreserveFloat16.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderDenormPreserveFloat32At(long index, int value) { VH_shaderDenormPreserveFloat32.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderDenormPreserveFloat64At(long index, int value) { VH_shaderDenormPreserveFloat64.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderDenormFlushToZeroFloat16At(long index, int value) { VH_shaderDenormFlushToZeroFloat16.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderDenormFlushToZeroFloat32At(long index, int value) { VH_shaderDenormFlushToZeroFloat32.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderDenormFlushToZeroFloat64At(long index, int value) { VH_shaderDenormFlushToZeroFloat64.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTEFloat16At(long index, int value) { VH_shaderRoundingModeRTEFloat16.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTEFloat32At(long index, int value) { VH_shaderRoundingModeRTEFloat32.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTEFloat64At(long index, int value) { VH_shaderRoundingModeRTEFloat64.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTZFloat16At(long index, int value) { VH_shaderRoundingModeRTZFloat16.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTZFloat32At(long index, int value) { VH_shaderRoundingModeRTZFloat32.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTZFloat64At(long index, int value) { VH_shaderRoundingModeRTZFloat64.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxUpdateAfterBindDescriptorsInAllPoolsAt(long index, int value) { VH_maxUpdateAfterBindDescriptorsInAllPools.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderUniformBufferArrayNonUniformIndexingNativeAt(long index, int value) { VH_shaderUniformBufferArrayNonUniformIndexingNative.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderSampledImageArrayNonUniformIndexingNativeAt(long index, int value) { VH_shaderSampledImageArrayNonUniformIndexingNative.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderStorageBufferArrayNonUniformIndexingNativeAt(long index, int value) { VH_shaderStorageBufferArrayNonUniformIndexingNative.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderStorageImageArrayNonUniformIndexingNativeAt(long index, int value) { VH_shaderStorageImageArrayNonUniformIndexingNative.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderInputAttachmentArrayNonUniformIndexingNativeAt(long index, int value) { VH_shaderInputAttachmentArrayNonUniformIndexingNative.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties robustBufferAccessUpdateAfterBindAt(long index, int value) { VH_robustBufferAccessUpdateAfterBind.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties quadDivergentImplicitLodAt(long index, int value) { VH_quadDivergentImplicitLod.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindSamplersAt(long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindSamplers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindUniformBuffersAt(long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindStorageBuffersAt(long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindSampledImagesAt(long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindSampledImages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindStorageImagesAt(long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindStorageImages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindInputAttachmentsAt(long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindInputAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxPerStageUpdateAfterBindResourcesAt(long index, int value) { VH_maxPerStageUpdateAfterBindResources.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindSamplersAt(long index, int value) { VH_maxDescriptorSetUpdateAfterBindSamplers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindUniformBuffersAt(long index, int value) { VH_maxDescriptorSetUpdateAfterBindUniformBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindUniformBuffersDynamicAt(long index, int value) { VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindStorageBuffersAt(long index, int value) { VH_maxDescriptorSetUpdateAfterBindStorageBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindStorageBuffersDynamicAt(long index, int value) { VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindSampledImagesAt(long index, int value) { VH_maxDescriptorSetUpdateAfterBindSampledImages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindStorageImagesAt(long index, int value) { VH_maxDescriptorSetUpdateAfterBindStorageImages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindInputAttachmentsAt(long index, int value) { VH_maxDescriptorSetUpdateAfterBindInputAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties supportedDepthResolveModesAt(long index, int value) { VH_supportedDepthResolveModes.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties supportedStencilResolveModesAt(long index, int value) { VH_supportedStencilResolveModes.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties independentResolveNoneAt(long index, int value) { VH_independentResolveNone.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties independentResolveAt(long index, int value) { VH_independentResolve.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties filterMinmaxSingleComponentFormatsAt(long index, int value) { VH_filterMinmaxSingleComponentFormats.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties filterMinmaxImageComponentMappingAt(long index, int value) { VH_filterMinmaxImageComponentMapping.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxTimelineSemaphoreValueDifferenceAt(long index, long value) { VH_maxTimelineSemaphoreValueDifference.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties framebufferIntegerColorSampleCountsAt(long index, int value) { VH_framebufferIntegerColorSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Properties sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties driverID(int value) { VH_driverID.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties driverName(long index0, byte value) { VH_driverName.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceVulkan12Properties driverInfo(long index0, byte value) { VH_driverInfo.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceVulkan12Properties conformanceVersion$major(byte value) { VH_conformanceVersion$major.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties conformanceVersion$minor(byte value) { VH_conformanceVersion$minor.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties conformanceVersion$subminor(byte value) { VH_conformanceVersion$subminor.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties conformanceVersion$patch(byte value) { VH_conformanceVersion$patch.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties denormBehaviorIndependence(int value) { VH_denormBehaviorIndependence.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties roundingModeIndependence(int value) { VH_roundingModeIndependence.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderSignedZeroInfNanPreserveFloat16(int value) { VH_shaderSignedZeroInfNanPreserveFloat16.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderSignedZeroInfNanPreserveFloat32(int value) { VH_shaderSignedZeroInfNanPreserveFloat32.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderSignedZeroInfNanPreserveFloat64(int value) { VH_shaderSignedZeroInfNanPreserveFloat64.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderDenormPreserveFloat16(int value) { VH_shaderDenormPreserveFloat16.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderDenormPreserveFloat32(int value) { VH_shaderDenormPreserveFloat32.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderDenormPreserveFloat64(int value) { VH_shaderDenormPreserveFloat64.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderDenormFlushToZeroFloat16(int value) { VH_shaderDenormFlushToZeroFloat16.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderDenormFlushToZeroFloat32(int value) { VH_shaderDenormFlushToZeroFloat32.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderDenormFlushToZeroFloat64(int value) { VH_shaderDenormFlushToZeroFloat64.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTEFloat16(int value) { VH_shaderRoundingModeRTEFloat16.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTEFloat32(int value) { VH_shaderRoundingModeRTEFloat32.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTEFloat64(int value) { VH_shaderRoundingModeRTEFloat64.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTZFloat16(int value) { VH_shaderRoundingModeRTZFloat16.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTZFloat32(int value) { VH_shaderRoundingModeRTZFloat32.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTZFloat64(int value) { VH_shaderRoundingModeRTZFloat64.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxUpdateAfterBindDescriptorsInAllPools(int value) { VH_maxUpdateAfterBindDescriptorsInAllPools.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderUniformBufferArrayNonUniformIndexingNative(int value) { VH_shaderUniformBufferArrayNonUniformIndexingNative.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderSampledImageArrayNonUniformIndexingNative(int value) { VH_shaderSampledImageArrayNonUniformIndexingNative.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderStorageBufferArrayNonUniformIndexingNative(int value) { VH_shaderStorageBufferArrayNonUniformIndexingNative.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderStorageImageArrayNonUniformIndexingNative(int value) { VH_shaderStorageImageArrayNonUniformIndexingNative.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties shaderInputAttachmentArrayNonUniformIndexingNative(int value) { VH_shaderInputAttachmentArrayNonUniformIndexingNative.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties robustBufferAccessUpdateAfterBind(int value) { VH_robustBufferAccessUpdateAfterBind.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties quadDivergentImplicitLod(int value) { VH_quadDivergentImplicitLod.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindSamplers(int value) { VH_maxPerStageDescriptorUpdateAfterBindSamplers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindUniformBuffers(int value) { VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindStorageBuffers(int value) { VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindSampledImages(int value) { VH_maxPerStageDescriptorUpdateAfterBindSampledImages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindStorageImages(int value) { VH_maxPerStageDescriptorUpdateAfterBindStorageImages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindInputAttachments(int value) { VH_maxPerStageDescriptorUpdateAfterBindInputAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxPerStageUpdateAfterBindResources(int value) { VH_maxPerStageUpdateAfterBindResources.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindSamplers(int value) { VH_maxDescriptorSetUpdateAfterBindSamplers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindUniformBuffers(int value) { VH_maxDescriptorSetUpdateAfterBindUniformBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(int value) { VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindStorageBuffers(int value) { VH_maxDescriptorSetUpdateAfterBindStorageBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(int value) { VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindSampledImages(int value) { VH_maxDescriptorSetUpdateAfterBindSampledImages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindStorageImages(int value) { VH_maxDescriptorSetUpdateAfterBindStorageImages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindInputAttachments(int value) { VH_maxDescriptorSetUpdateAfterBindInputAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties supportedDepthResolveModes(int value) { VH_supportedDepthResolveModes.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties supportedStencilResolveModes(int value) { VH_supportedStencilResolveModes.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties independentResolveNone(int value) { VH_independentResolveNone.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties independentResolve(int value) { VH_independentResolve.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties filterMinmaxSingleComponentFormats(int value) { VH_filterMinmaxSingleComponentFormats.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties filterMinmaxImageComponentMapping(int value) { VH_filterMinmaxImageComponentMapping.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties maxTimelineSemaphoreValueDifference(long value) { VH_maxTimelineSemaphoreValueDifference.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Properties framebufferIntegerColorSampleCounts(int value) { VH_framebufferIntegerColorSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _driverIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_driverID, index), LAYOUT_driverID); }
    public MemorySegment _driverID() { return _driverIDAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _driverIDAt(long index, MemorySegment src) { _driverIDAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _driverID(MemorySegment src) { return _driverIDAt(0L, src); }
    public MemorySegment _driverNameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_driverName, index), LAYOUT_driverName); }
    public MemorySegment _driverName() { return _driverNameAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _driverNameAt(long index, MemorySegment src) { _driverNameAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _driverName(MemorySegment src) { return _driverNameAt(0L, src); }
    public MemorySegment _driverInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_driverInfo, index), LAYOUT_driverInfo); }
    public MemorySegment _driverInfo() { return _driverInfoAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _driverInfoAt(long index, MemorySegment src) { _driverInfoAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _driverInfo(MemorySegment src) { return _driverInfoAt(0L, src); }
    public MemorySegment _conformanceVersionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_conformanceVersion, index), LAYOUT_conformanceVersion); }
    public MemorySegment _conformanceVersion() { return _conformanceVersionAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _conformanceVersionAt(long index, MemorySegment src) { _conformanceVersionAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _conformanceVersion(MemorySegment src) { return _conformanceVersionAt(0L, src); }
    public MemorySegment _denormBehaviorIndependenceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_denormBehaviorIndependence, index), LAYOUT_denormBehaviorIndependence); }
    public MemorySegment _denormBehaviorIndependence() { return _denormBehaviorIndependenceAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _denormBehaviorIndependenceAt(long index, MemorySegment src) { _denormBehaviorIndependenceAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _denormBehaviorIndependence(MemorySegment src) { return _denormBehaviorIndependenceAt(0L, src); }
    public MemorySegment _roundingModeIndependenceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_roundingModeIndependence, index), LAYOUT_roundingModeIndependence); }
    public MemorySegment _roundingModeIndependence() { return _roundingModeIndependenceAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _roundingModeIndependenceAt(long index, MemorySegment src) { _roundingModeIndependenceAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _roundingModeIndependence(MemorySegment src) { return _roundingModeIndependenceAt(0L, src); }
    public MemorySegment _shaderSignedZeroInfNanPreserveFloat16At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSignedZeroInfNanPreserveFloat16, index), LAYOUT_shaderSignedZeroInfNanPreserveFloat16); }
    public MemorySegment _shaderSignedZeroInfNanPreserveFloat16() { return _shaderSignedZeroInfNanPreserveFloat16At(0L); }
    public VkPhysicalDeviceVulkan12Properties _shaderSignedZeroInfNanPreserveFloat16At(long index, MemorySegment src) { _shaderSignedZeroInfNanPreserveFloat16At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _shaderSignedZeroInfNanPreserveFloat16(MemorySegment src) { return _shaderSignedZeroInfNanPreserveFloat16At(0L, src); }
    public MemorySegment _shaderSignedZeroInfNanPreserveFloat32At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSignedZeroInfNanPreserveFloat32, index), LAYOUT_shaderSignedZeroInfNanPreserveFloat32); }
    public MemorySegment _shaderSignedZeroInfNanPreserveFloat32() { return _shaderSignedZeroInfNanPreserveFloat32At(0L); }
    public VkPhysicalDeviceVulkan12Properties _shaderSignedZeroInfNanPreserveFloat32At(long index, MemorySegment src) { _shaderSignedZeroInfNanPreserveFloat32At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _shaderSignedZeroInfNanPreserveFloat32(MemorySegment src) { return _shaderSignedZeroInfNanPreserveFloat32At(0L, src); }
    public MemorySegment _shaderSignedZeroInfNanPreserveFloat64At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSignedZeroInfNanPreserveFloat64, index), LAYOUT_shaderSignedZeroInfNanPreserveFloat64); }
    public MemorySegment _shaderSignedZeroInfNanPreserveFloat64() { return _shaderSignedZeroInfNanPreserveFloat64At(0L); }
    public VkPhysicalDeviceVulkan12Properties _shaderSignedZeroInfNanPreserveFloat64At(long index, MemorySegment src) { _shaderSignedZeroInfNanPreserveFloat64At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _shaderSignedZeroInfNanPreserveFloat64(MemorySegment src) { return _shaderSignedZeroInfNanPreserveFloat64At(0L, src); }
    public MemorySegment _shaderDenormPreserveFloat16At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderDenormPreserveFloat16, index), LAYOUT_shaderDenormPreserveFloat16); }
    public MemorySegment _shaderDenormPreserveFloat16() { return _shaderDenormPreserveFloat16At(0L); }
    public VkPhysicalDeviceVulkan12Properties _shaderDenormPreserveFloat16At(long index, MemorySegment src) { _shaderDenormPreserveFloat16At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _shaderDenormPreserveFloat16(MemorySegment src) { return _shaderDenormPreserveFloat16At(0L, src); }
    public MemorySegment _shaderDenormPreserveFloat32At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderDenormPreserveFloat32, index), LAYOUT_shaderDenormPreserveFloat32); }
    public MemorySegment _shaderDenormPreserveFloat32() { return _shaderDenormPreserveFloat32At(0L); }
    public VkPhysicalDeviceVulkan12Properties _shaderDenormPreserveFloat32At(long index, MemorySegment src) { _shaderDenormPreserveFloat32At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _shaderDenormPreserveFloat32(MemorySegment src) { return _shaderDenormPreserveFloat32At(0L, src); }
    public MemorySegment _shaderDenormPreserveFloat64At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderDenormPreserveFloat64, index), LAYOUT_shaderDenormPreserveFloat64); }
    public MemorySegment _shaderDenormPreserveFloat64() { return _shaderDenormPreserveFloat64At(0L); }
    public VkPhysicalDeviceVulkan12Properties _shaderDenormPreserveFloat64At(long index, MemorySegment src) { _shaderDenormPreserveFloat64At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _shaderDenormPreserveFloat64(MemorySegment src) { return _shaderDenormPreserveFloat64At(0L, src); }
    public MemorySegment _shaderDenormFlushToZeroFloat16At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderDenormFlushToZeroFloat16, index), LAYOUT_shaderDenormFlushToZeroFloat16); }
    public MemorySegment _shaderDenormFlushToZeroFloat16() { return _shaderDenormFlushToZeroFloat16At(0L); }
    public VkPhysicalDeviceVulkan12Properties _shaderDenormFlushToZeroFloat16At(long index, MemorySegment src) { _shaderDenormFlushToZeroFloat16At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _shaderDenormFlushToZeroFloat16(MemorySegment src) { return _shaderDenormFlushToZeroFloat16At(0L, src); }
    public MemorySegment _shaderDenormFlushToZeroFloat32At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderDenormFlushToZeroFloat32, index), LAYOUT_shaderDenormFlushToZeroFloat32); }
    public MemorySegment _shaderDenormFlushToZeroFloat32() { return _shaderDenormFlushToZeroFloat32At(0L); }
    public VkPhysicalDeviceVulkan12Properties _shaderDenormFlushToZeroFloat32At(long index, MemorySegment src) { _shaderDenormFlushToZeroFloat32At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _shaderDenormFlushToZeroFloat32(MemorySegment src) { return _shaderDenormFlushToZeroFloat32At(0L, src); }
    public MemorySegment _shaderDenormFlushToZeroFloat64At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderDenormFlushToZeroFloat64, index), LAYOUT_shaderDenormFlushToZeroFloat64); }
    public MemorySegment _shaderDenormFlushToZeroFloat64() { return _shaderDenormFlushToZeroFloat64At(0L); }
    public VkPhysicalDeviceVulkan12Properties _shaderDenormFlushToZeroFloat64At(long index, MemorySegment src) { _shaderDenormFlushToZeroFloat64At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _shaderDenormFlushToZeroFloat64(MemorySegment src) { return _shaderDenormFlushToZeroFloat64At(0L, src); }
    public MemorySegment _shaderRoundingModeRTEFloat16At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderRoundingModeRTEFloat16, index), LAYOUT_shaderRoundingModeRTEFloat16); }
    public MemorySegment _shaderRoundingModeRTEFloat16() { return _shaderRoundingModeRTEFloat16At(0L); }
    public VkPhysicalDeviceVulkan12Properties _shaderRoundingModeRTEFloat16At(long index, MemorySegment src) { _shaderRoundingModeRTEFloat16At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _shaderRoundingModeRTEFloat16(MemorySegment src) { return _shaderRoundingModeRTEFloat16At(0L, src); }
    public MemorySegment _shaderRoundingModeRTEFloat32At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderRoundingModeRTEFloat32, index), LAYOUT_shaderRoundingModeRTEFloat32); }
    public MemorySegment _shaderRoundingModeRTEFloat32() { return _shaderRoundingModeRTEFloat32At(0L); }
    public VkPhysicalDeviceVulkan12Properties _shaderRoundingModeRTEFloat32At(long index, MemorySegment src) { _shaderRoundingModeRTEFloat32At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _shaderRoundingModeRTEFloat32(MemorySegment src) { return _shaderRoundingModeRTEFloat32At(0L, src); }
    public MemorySegment _shaderRoundingModeRTEFloat64At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderRoundingModeRTEFloat64, index), LAYOUT_shaderRoundingModeRTEFloat64); }
    public MemorySegment _shaderRoundingModeRTEFloat64() { return _shaderRoundingModeRTEFloat64At(0L); }
    public VkPhysicalDeviceVulkan12Properties _shaderRoundingModeRTEFloat64At(long index, MemorySegment src) { _shaderRoundingModeRTEFloat64At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _shaderRoundingModeRTEFloat64(MemorySegment src) { return _shaderRoundingModeRTEFloat64At(0L, src); }
    public MemorySegment _shaderRoundingModeRTZFloat16At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderRoundingModeRTZFloat16, index), LAYOUT_shaderRoundingModeRTZFloat16); }
    public MemorySegment _shaderRoundingModeRTZFloat16() { return _shaderRoundingModeRTZFloat16At(0L); }
    public VkPhysicalDeviceVulkan12Properties _shaderRoundingModeRTZFloat16At(long index, MemorySegment src) { _shaderRoundingModeRTZFloat16At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _shaderRoundingModeRTZFloat16(MemorySegment src) { return _shaderRoundingModeRTZFloat16At(0L, src); }
    public MemorySegment _shaderRoundingModeRTZFloat32At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderRoundingModeRTZFloat32, index), LAYOUT_shaderRoundingModeRTZFloat32); }
    public MemorySegment _shaderRoundingModeRTZFloat32() { return _shaderRoundingModeRTZFloat32At(0L); }
    public VkPhysicalDeviceVulkan12Properties _shaderRoundingModeRTZFloat32At(long index, MemorySegment src) { _shaderRoundingModeRTZFloat32At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _shaderRoundingModeRTZFloat32(MemorySegment src) { return _shaderRoundingModeRTZFloat32At(0L, src); }
    public MemorySegment _shaderRoundingModeRTZFloat64At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderRoundingModeRTZFloat64, index), LAYOUT_shaderRoundingModeRTZFloat64); }
    public MemorySegment _shaderRoundingModeRTZFloat64() { return _shaderRoundingModeRTZFloat64At(0L); }
    public VkPhysicalDeviceVulkan12Properties _shaderRoundingModeRTZFloat64At(long index, MemorySegment src) { _shaderRoundingModeRTZFloat64At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _shaderRoundingModeRTZFloat64(MemorySegment src) { return _shaderRoundingModeRTZFloat64At(0L, src); }
    public MemorySegment _maxUpdateAfterBindDescriptorsInAllPoolsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxUpdateAfterBindDescriptorsInAllPools, index), LAYOUT_maxUpdateAfterBindDescriptorsInAllPools); }
    public MemorySegment _maxUpdateAfterBindDescriptorsInAllPools() { return _maxUpdateAfterBindDescriptorsInAllPoolsAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _maxUpdateAfterBindDescriptorsInAllPoolsAt(long index, MemorySegment src) { _maxUpdateAfterBindDescriptorsInAllPoolsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _maxUpdateAfterBindDescriptorsInAllPools(MemorySegment src) { return _maxUpdateAfterBindDescriptorsInAllPoolsAt(0L, src); }
    public MemorySegment _shaderUniformBufferArrayNonUniformIndexingNativeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderUniformBufferArrayNonUniformIndexingNative, index), LAYOUT_shaderUniformBufferArrayNonUniformIndexingNative); }
    public MemorySegment _shaderUniformBufferArrayNonUniformIndexingNative() { return _shaderUniformBufferArrayNonUniformIndexingNativeAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _shaderUniformBufferArrayNonUniformIndexingNativeAt(long index, MemorySegment src) { _shaderUniformBufferArrayNonUniformIndexingNativeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _shaderUniformBufferArrayNonUniformIndexingNative(MemorySegment src) { return _shaderUniformBufferArrayNonUniformIndexingNativeAt(0L, src); }
    public MemorySegment _shaderSampledImageArrayNonUniformIndexingNativeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSampledImageArrayNonUniformIndexingNative, index), LAYOUT_shaderSampledImageArrayNonUniformIndexingNative); }
    public MemorySegment _shaderSampledImageArrayNonUniformIndexingNative() { return _shaderSampledImageArrayNonUniformIndexingNativeAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _shaderSampledImageArrayNonUniformIndexingNativeAt(long index, MemorySegment src) { _shaderSampledImageArrayNonUniformIndexingNativeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _shaderSampledImageArrayNonUniformIndexingNative(MemorySegment src) { return _shaderSampledImageArrayNonUniformIndexingNativeAt(0L, src); }
    public MemorySegment _shaderStorageBufferArrayNonUniformIndexingNativeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStorageBufferArrayNonUniformIndexingNative, index), LAYOUT_shaderStorageBufferArrayNonUniformIndexingNative); }
    public MemorySegment _shaderStorageBufferArrayNonUniformIndexingNative() { return _shaderStorageBufferArrayNonUniformIndexingNativeAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _shaderStorageBufferArrayNonUniformIndexingNativeAt(long index, MemorySegment src) { _shaderStorageBufferArrayNonUniformIndexingNativeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _shaderStorageBufferArrayNonUniformIndexingNative(MemorySegment src) { return _shaderStorageBufferArrayNonUniformIndexingNativeAt(0L, src); }
    public MemorySegment _shaderStorageImageArrayNonUniformIndexingNativeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStorageImageArrayNonUniformIndexingNative, index), LAYOUT_shaderStorageImageArrayNonUniformIndexingNative); }
    public MemorySegment _shaderStorageImageArrayNonUniformIndexingNative() { return _shaderStorageImageArrayNonUniformIndexingNativeAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _shaderStorageImageArrayNonUniformIndexingNativeAt(long index, MemorySegment src) { _shaderStorageImageArrayNonUniformIndexingNativeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _shaderStorageImageArrayNonUniformIndexingNative(MemorySegment src) { return _shaderStorageImageArrayNonUniformIndexingNativeAt(0L, src); }
    public MemorySegment _shaderInputAttachmentArrayNonUniformIndexingNativeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderInputAttachmentArrayNonUniformIndexingNative, index), LAYOUT_shaderInputAttachmentArrayNonUniformIndexingNative); }
    public MemorySegment _shaderInputAttachmentArrayNonUniformIndexingNative() { return _shaderInputAttachmentArrayNonUniformIndexingNativeAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _shaderInputAttachmentArrayNonUniformIndexingNativeAt(long index, MemorySegment src) { _shaderInputAttachmentArrayNonUniformIndexingNativeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _shaderInputAttachmentArrayNonUniformIndexingNative(MemorySegment src) { return _shaderInputAttachmentArrayNonUniformIndexingNativeAt(0L, src); }
    public MemorySegment _robustBufferAccessUpdateAfterBindAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_robustBufferAccessUpdateAfterBind, index), LAYOUT_robustBufferAccessUpdateAfterBind); }
    public MemorySegment _robustBufferAccessUpdateAfterBind() { return _robustBufferAccessUpdateAfterBindAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _robustBufferAccessUpdateAfterBindAt(long index, MemorySegment src) { _robustBufferAccessUpdateAfterBindAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _robustBufferAccessUpdateAfterBind(MemorySegment src) { return _robustBufferAccessUpdateAfterBindAt(0L, src); }
    public MemorySegment _quadDivergentImplicitLodAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_quadDivergentImplicitLod, index), LAYOUT_quadDivergentImplicitLod); }
    public MemorySegment _quadDivergentImplicitLod() { return _quadDivergentImplicitLodAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _quadDivergentImplicitLodAt(long index, MemorySegment src) { _quadDivergentImplicitLodAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _quadDivergentImplicitLod(MemorySegment src) { return _quadDivergentImplicitLodAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindSamplersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorUpdateAfterBindSamplers, index), LAYOUT_maxPerStageDescriptorUpdateAfterBindSamplers); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindSamplers() { return _maxPerStageDescriptorUpdateAfterBindSamplersAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _maxPerStageDescriptorUpdateAfterBindSamplersAt(long index, MemorySegment src) { _maxPerStageDescriptorUpdateAfterBindSamplersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _maxPerStageDescriptorUpdateAfterBindSamplers(MemorySegment src) { return _maxPerStageDescriptorUpdateAfterBindSamplersAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindUniformBuffersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorUpdateAfterBindUniformBuffers, index), LAYOUT_maxPerStageDescriptorUpdateAfterBindUniformBuffers); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindUniformBuffers() { return _maxPerStageDescriptorUpdateAfterBindUniformBuffersAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _maxPerStageDescriptorUpdateAfterBindUniformBuffersAt(long index, MemorySegment src) { _maxPerStageDescriptorUpdateAfterBindUniformBuffersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _maxPerStageDescriptorUpdateAfterBindUniformBuffers(MemorySegment src) { return _maxPerStageDescriptorUpdateAfterBindUniformBuffersAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindStorageBuffersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorUpdateAfterBindStorageBuffers, index), LAYOUT_maxPerStageDescriptorUpdateAfterBindStorageBuffers); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindStorageBuffers() { return _maxPerStageDescriptorUpdateAfterBindStorageBuffersAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _maxPerStageDescriptorUpdateAfterBindStorageBuffersAt(long index, MemorySegment src) { _maxPerStageDescriptorUpdateAfterBindStorageBuffersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _maxPerStageDescriptorUpdateAfterBindStorageBuffers(MemorySegment src) { return _maxPerStageDescriptorUpdateAfterBindStorageBuffersAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindSampledImagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorUpdateAfterBindSampledImages, index), LAYOUT_maxPerStageDescriptorUpdateAfterBindSampledImages); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindSampledImages() { return _maxPerStageDescriptorUpdateAfterBindSampledImagesAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _maxPerStageDescriptorUpdateAfterBindSampledImagesAt(long index, MemorySegment src) { _maxPerStageDescriptorUpdateAfterBindSampledImagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _maxPerStageDescriptorUpdateAfterBindSampledImages(MemorySegment src) { return _maxPerStageDescriptorUpdateAfterBindSampledImagesAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindStorageImagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorUpdateAfterBindStorageImages, index), LAYOUT_maxPerStageDescriptorUpdateAfterBindStorageImages); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindStorageImages() { return _maxPerStageDescriptorUpdateAfterBindStorageImagesAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _maxPerStageDescriptorUpdateAfterBindStorageImagesAt(long index, MemorySegment src) { _maxPerStageDescriptorUpdateAfterBindStorageImagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _maxPerStageDescriptorUpdateAfterBindStorageImages(MemorySegment src) { return _maxPerStageDescriptorUpdateAfterBindStorageImagesAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindInputAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorUpdateAfterBindInputAttachments, index), LAYOUT_maxPerStageDescriptorUpdateAfterBindInputAttachments); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindInputAttachments() { return _maxPerStageDescriptorUpdateAfterBindInputAttachmentsAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _maxPerStageDescriptorUpdateAfterBindInputAttachmentsAt(long index, MemorySegment src) { _maxPerStageDescriptorUpdateAfterBindInputAttachmentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _maxPerStageDescriptorUpdateAfterBindInputAttachments(MemorySegment src) { return _maxPerStageDescriptorUpdateAfterBindInputAttachmentsAt(0L, src); }
    public MemorySegment _maxPerStageUpdateAfterBindResourcesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageUpdateAfterBindResources, index), LAYOUT_maxPerStageUpdateAfterBindResources); }
    public MemorySegment _maxPerStageUpdateAfterBindResources() { return _maxPerStageUpdateAfterBindResourcesAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _maxPerStageUpdateAfterBindResourcesAt(long index, MemorySegment src) { _maxPerStageUpdateAfterBindResourcesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _maxPerStageUpdateAfterBindResources(MemorySegment src) { return _maxPerStageUpdateAfterBindResourcesAt(0L, src); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindSamplersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUpdateAfterBindSamplers, index), LAYOUT_maxDescriptorSetUpdateAfterBindSamplers); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindSamplers() { return _maxDescriptorSetUpdateAfterBindSamplersAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _maxDescriptorSetUpdateAfterBindSamplersAt(long index, MemorySegment src) { _maxDescriptorSetUpdateAfterBindSamplersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _maxDescriptorSetUpdateAfterBindSamplers(MemorySegment src) { return _maxDescriptorSetUpdateAfterBindSamplersAt(0L, src); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindUniformBuffersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUpdateAfterBindUniformBuffers, index), LAYOUT_maxDescriptorSetUpdateAfterBindUniformBuffers); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindUniformBuffers() { return _maxDescriptorSetUpdateAfterBindUniformBuffersAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _maxDescriptorSetUpdateAfterBindUniformBuffersAt(long index, MemorySegment src) { _maxDescriptorSetUpdateAfterBindUniformBuffersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _maxDescriptorSetUpdateAfterBindUniformBuffers(MemorySegment src) { return _maxDescriptorSetUpdateAfterBindUniformBuffersAt(0L, src); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindUniformBuffersDynamicAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic, index), LAYOUT_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() { return _maxDescriptorSetUpdateAfterBindUniformBuffersDynamicAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _maxDescriptorSetUpdateAfterBindUniformBuffersDynamicAt(long index, MemorySegment src) { _maxDescriptorSetUpdateAfterBindUniformBuffersDynamicAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(MemorySegment src) { return _maxDescriptorSetUpdateAfterBindUniformBuffersDynamicAt(0L, src); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindStorageBuffersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUpdateAfterBindStorageBuffers, index), LAYOUT_maxDescriptorSetUpdateAfterBindStorageBuffers); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindStorageBuffers() { return _maxDescriptorSetUpdateAfterBindStorageBuffersAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _maxDescriptorSetUpdateAfterBindStorageBuffersAt(long index, MemorySegment src) { _maxDescriptorSetUpdateAfterBindStorageBuffersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _maxDescriptorSetUpdateAfterBindStorageBuffers(MemorySegment src) { return _maxDescriptorSetUpdateAfterBindStorageBuffersAt(0L, src); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindStorageBuffersDynamicAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic, index), LAYOUT_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() { return _maxDescriptorSetUpdateAfterBindStorageBuffersDynamicAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _maxDescriptorSetUpdateAfterBindStorageBuffersDynamicAt(long index, MemorySegment src) { _maxDescriptorSetUpdateAfterBindStorageBuffersDynamicAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(MemorySegment src) { return _maxDescriptorSetUpdateAfterBindStorageBuffersDynamicAt(0L, src); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindSampledImagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUpdateAfterBindSampledImages, index), LAYOUT_maxDescriptorSetUpdateAfterBindSampledImages); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindSampledImages() { return _maxDescriptorSetUpdateAfterBindSampledImagesAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _maxDescriptorSetUpdateAfterBindSampledImagesAt(long index, MemorySegment src) { _maxDescriptorSetUpdateAfterBindSampledImagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _maxDescriptorSetUpdateAfterBindSampledImages(MemorySegment src) { return _maxDescriptorSetUpdateAfterBindSampledImagesAt(0L, src); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindStorageImagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUpdateAfterBindStorageImages, index), LAYOUT_maxDescriptorSetUpdateAfterBindStorageImages); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindStorageImages() { return _maxDescriptorSetUpdateAfterBindStorageImagesAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _maxDescriptorSetUpdateAfterBindStorageImagesAt(long index, MemorySegment src) { _maxDescriptorSetUpdateAfterBindStorageImagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _maxDescriptorSetUpdateAfterBindStorageImages(MemorySegment src) { return _maxDescriptorSetUpdateAfterBindStorageImagesAt(0L, src); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindInputAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUpdateAfterBindInputAttachments, index), LAYOUT_maxDescriptorSetUpdateAfterBindInputAttachments); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindInputAttachments() { return _maxDescriptorSetUpdateAfterBindInputAttachmentsAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _maxDescriptorSetUpdateAfterBindInputAttachmentsAt(long index, MemorySegment src) { _maxDescriptorSetUpdateAfterBindInputAttachmentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _maxDescriptorSetUpdateAfterBindInputAttachments(MemorySegment src) { return _maxDescriptorSetUpdateAfterBindInputAttachmentsAt(0L, src); }
    public MemorySegment _supportedDepthResolveModesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedDepthResolveModes, index), LAYOUT_supportedDepthResolveModes); }
    public MemorySegment _supportedDepthResolveModes() { return _supportedDepthResolveModesAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _supportedDepthResolveModesAt(long index, MemorySegment src) { _supportedDepthResolveModesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _supportedDepthResolveModes(MemorySegment src) { return _supportedDepthResolveModesAt(0L, src); }
    public MemorySegment _supportedStencilResolveModesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedStencilResolveModes, index), LAYOUT_supportedStencilResolveModes); }
    public MemorySegment _supportedStencilResolveModes() { return _supportedStencilResolveModesAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _supportedStencilResolveModesAt(long index, MemorySegment src) { _supportedStencilResolveModesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _supportedStencilResolveModes(MemorySegment src) { return _supportedStencilResolveModesAt(0L, src); }
    public MemorySegment _independentResolveNoneAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_independentResolveNone, index), LAYOUT_independentResolveNone); }
    public MemorySegment _independentResolveNone() { return _independentResolveNoneAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _independentResolveNoneAt(long index, MemorySegment src) { _independentResolveNoneAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _independentResolveNone(MemorySegment src) { return _independentResolveNoneAt(0L, src); }
    public MemorySegment _independentResolveAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_independentResolve, index), LAYOUT_independentResolve); }
    public MemorySegment _independentResolve() { return _independentResolveAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _independentResolveAt(long index, MemorySegment src) { _independentResolveAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _independentResolve(MemorySegment src) { return _independentResolveAt(0L, src); }
    public MemorySegment _filterMinmaxSingleComponentFormatsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_filterMinmaxSingleComponentFormats, index), LAYOUT_filterMinmaxSingleComponentFormats); }
    public MemorySegment _filterMinmaxSingleComponentFormats() { return _filterMinmaxSingleComponentFormatsAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _filterMinmaxSingleComponentFormatsAt(long index, MemorySegment src) { _filterMinmaxSingleComponentFormatsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _filterMinmaxSingleComponentFormats(MemorySegment src) { return _filterMinmaxSingleComponentFormatsAt(0L, src); }
    public MemorySegment _filterMinmaxImageComponentMappingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_filterMinmaxImageComponentMapping, index), LAYOUT_filterMinmaxImageComponentMapping); }
    public MemorySegment _filterMinmaxImageComponentMapping() { return _filterMinmaxImageComponentMappingAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _filterMinmaxImageComponentMappingAt(long index, MemorySegment src) { _filterMinmaxImageComponentMappingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _filterMinmaxImageComponentMapping(MemorySegment src) { return _filterMinmaxImageComponentMappingAt(0L, src); }
    public MemorySegment _maxTimelineSemaphoreValueDifferenceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTimelineSemaphoreValueDifference, index), LAYOUT_maxTimelineSemaphoreValueDifference); }
    public MemorySegment _maxTimelineSemaphoreValueDifference() { return _maxTimelineSemaphoreValueDifferenceAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _maxTimelineSemaphoreValueDifferenceAt(long index, MemorySegment src) { _maxTimelineSemaphoreValueDifferenceAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _maxTimelineSemaphoreValueDifference(MemorySegment src) { return _maxTimelineSemaphoreValueDifferenceAt(0L, src); }
    public MemorySegment _framebufferIntegerColorSampleCountsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_framebufferIntegerColorSampleCounts, index), LAYOUT_framebufferIntegerColorSampleCounts); }
    public MemorySegment _framebufferIntegerColorSampleCounts() { return _framebufferIntegerColorSampleCountsAt(0L); }
    public VkPhysicalDeviceVulkan12Properties _framebufferIntegerColorSampleCountsAt(long index, MemorySegment src) { _framebufferIntegerColorSampleCountsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Properties _framebufferIntegerColorSampleCounts(MemorySegment src) { return _framebufferIntegerColorSampleCountsAt(0L, src); }
}
