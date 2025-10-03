// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFeatures {
///     (uint32_t) VkBool32 robustBufferAccess;
///     (uint32_t) VkBool32 fullDrawIndexUint32;
///     (uint32_t) VkBool32 imageCubeArray;
///     (uint32_t) VkBool32 independentBlend;
///     (uint32_t) VkBool32 geometryShader;
///     (uint32_t) VkBool32 tessellationShader;
///     (uint32_t) VkBool32 sampleRateShading;
///     (uint32_t) VkBool32 dualSrcBlend;
///     (uint32_t) VkBool32 logicOp;
///     (uint32_t) VkBool32 multiDrawIndirect;
///     (uint32_t) VkBool32 drawIndirectFirstInstance;
///     (uint32_t) VkBool32 depthClamp;
///     (uint32_t) VkBool32 depthBiasClamp;
///     (uint32_t) VkBool32 fillModeNonSolid;
///     (uint32_t) VkBool32 depthBounds;
///     (uint32_t) VkBool32 wideLines;
///     (uint32_t) VkBool32 largePoints;
///     (uint32_t) VkBool32 alphaToOne;
///     (uint32_t) VkBool32 multiViewport;
///     (uint32_t) VkBool32 samplerAnisotropy;
///     (uint32_t) VkBool32 textureCompressionETC2;
///     (uint32_t) VkBool32 textureCompressionASTC_LDR;
///     (uint32_t) VkBool32 textureCompressionBC;
///     (uint32_t) VkBool32 occlusionQueryPrecise;
///     (uint32_t) VkBool32 pipelineStatisticsQuery;
///     (uint32_t) VkBool32 vertexPipelineStoresAndAtomics;
///     (uint32_t) VkBool32 fragmentStoresAndAtomics;
///     (uint32_t) VkBool32 shaderTessellationAndGeometryPointSize;
///     (uint32_t) VkBool32 shaderImageGatherExtended;
///     (uint32_t) VkBool32 shaderStorageImageExtendedFormats;
///     (uint32_t) VkBool32 shaderStorageImageMultisample;
///     (uint32_t) VkBool32 shaderStorageImageReadWithoutFormat;
///     (uint32_t) VkBool32 shaderStorageImageWriteWithoutFormat;
///     (uint32_t) VkBool32 shaderUniformBufferArrayDynamicIndexing;
///     (uint32_t) VkBool32 shaderSampledImageArrayDynamicIndexing;
///     (uint32_t) VkBool32 shaderStorageBufferArrayDynamicIndexing;
///     (uint32_t) VkBool32 shaderStorageImageArrayDynamicIndexing;
///     (uint32_t) VkBool32 shaderClipDistance;
///     (uint32_t) VkBool32 shaderCullDistance;
///     (uint32_t) VkBool32 shaderFloat64;
///     (uint32_t) VkBool32 shaderInt64;
///     (uint32_t) VkBool32 shaderInt16;
///     (uint32_t) VkBool32 shaderResourceResidency;
///     (uint32_t) VkBool32 shaderResourceMinLod;
///     (uint32_t) VkBool32 sparseBinding;
///     (uint32_t) VkBool32 sparseResidencyBuffer;
///     (uint32_t) VkBool32 sparseResidencyImage2D;
///     (uint32_t) VkBool32 sparseResidencyImage3D;
///     (uint32_t) VkBool32 sparseResidency2Samples;
///     (uint32_t) VkBool32 sparseResidency4Samples;
///     (uint32_t) VkBool32 sparseResidency8Samples;
///     (uint32_t) VkBool32 sparseResidency16Samples;
///     (uint32_t) VkBool32 sparseResidencyAliased;
///     (uint32_t) VkBool32 variableMultisampleRate;
///     (uint32_t) VkBool32 inheritedQueries;
/// };
/// ```
public final class VkPhysicalDeviceFeatures extends GroupType {
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
    /// The byte offset of `robustBufferAccess`.
    public static final long OFFSET_robustBufferAccess = LAYOUT.byteOffset(PathElement.groupElement("robustBufferAccess"));
    /// The memory layout of `robustBufferAccess`.
    public static final MemoryLayout LAYOUT_robustBufferAccess = LAYOUT.select(PathElement.groupElement("robustBufferAccess"));
    /// The [VarHandle] of `robustBufferAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_robustBufferAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustBufferAccess"));
    /// The byte offset of `fullDrawIndexUint32`.
    public static final long OFFSET_fullDrawIndexUint32 = LAYOUT.byteOffset(PathElement.groupElement("fullDrawIndexUint32"));
    /// The memory layout of `fullDrawIndexUint32`.
    public static final MemoryLayout LAYOUT_fullDrawIndexUint32 = LAYOUT.select(PathElement.groupElement("fullDrawIndexUint32"));
    /// The [VarHandle] of `fullDrawIndexUint32` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fullDrawIndexUint32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fullDrawIndexUint32"));
    /// The byte offset of `imageCubeArray`.
    public static final long OFFSET_imageCubeArray = LAYOUT.byteOffset(PathElement.groupElement("imageCubeArray"));
    /// The memory layout of `imageCubeArray`.
    public static final MemoryLayout LAYOUT_imageCubeArray = LAYOUT.select(PathElement.groupElement("imageCubeArray"));
    /// The [VarHandle] of `imageCubeArray` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageCubeArray = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCubeArray"));
    /// The byte offset of `independentBlend`.
    public static final long OFFSET_independentBlend = LAYOUT.byteOffset(PathElement.groupElement("independentBlend"));
    /// The memory layout of `independentBlend`.
    public static final MemoryLayout LAYOUT_independentBlend = LAYOUT.select(PathElement.groupElement("independentBlend"));
    /// The [VarHandle] of `independentBlend` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_independentBlend = LAYOUT.arrayElementVarHandle(PathElement.groupElement("independentBlend"));
    /// The byte offset of `geometryShader`.
    public static final long OFFSET_geometryShader = LAYOUT.byteOffset(PathElement.groupElement("geometryShader"));
    /// The memory layout of `geometryShader`.
    public static final MemoryLayout LAYOUT_geometryShader = LAYOUT.select(PathElement.groupElement("geometryShader"));
    /// The [VarHandle] of `geometryShader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_geometryShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometryShader"));
    /// The byte offset of `tessellationShader`.
    public static final long OFFSET_tessellationShader = LAYOUT.byteOffset(PathElement.groupElement("tessellationShader"));
    /// The memory layout of `tessellationShader`.
    public static final MemoryLayout LAYOUT_tessellationShader = LAYOUT.select(PathElement.groupElement("tessellationShader"));
    /// The [VarHandle] of `tessellationShader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tessellationShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tessellationShader"));
    /// The byte offset of `sampleRateShading`.
    public static final long OFFSET_sampleRateShading = LAYOUT.byteOffset(PathElement.groupElement("sampleRateShading"));
    /// The memory layout of `sampleRateShading`.
    public static final MemoryLayout LAYOUT_sampleRateShading = LAYOUT.select(PathElement.groupElement("sampleRateShading"));
    /// The [VarHandle] of `sampleRateShading` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sampleRateShading = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleRateShading"));
    /// The byte offset of `dualSrcBlend`.
    public static final long OFFSET_dualSrcBlend = LAYOUT.byteOffset(PathElement.groupElement("dualSrcBlend"));
    /// The memory layout of `dualSrcBlend`.
    public static final MemoryLayout LAYOUT_dualSrcBlend = LAYOUT.select(PathElement.groupElement("dualSrcBlend"));
    /// The [VarHandle] of `dualSrcBlend` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dualSrcBlend = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dualSrcBlend"));
    /// The byte offset of `logicOp`.
    public static final long OFFSET_logicOp = LAYOUT.byteOffset(PathElement.groupElement("logicOp"));
    /// The memory layout of `logicOp`.
    public static final MemoryLayout LAYOUT_logicOp = LAYOUT.select(PathElement.groupElement("logicOp"));
    /// The [VarHandle] of `logicOp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_logicOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("logicOp"));
    /// The byte offset of `multiDrawIndirect`.
    public static final long OFFSET_multiDrawIndirect = LAYOUT.byteOffset(PathElement.groupElement("multiDrawIndirect"));
    /// The memory layout of `multiDrawIndirect`.
    public static final MemoryLayout LAYOUT_multiDrawIndirect = LAYOUT.select(PathElement.groupElement("multiDrawIndirect"));
    /// The [VarHandle] of `multiDrawIndirect` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_multiDrawIndirect = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiDrawIndirect"));
    /// The byte offset of `drawIndirectFirstInstance`.
    public static final long OFFSET_drawIndirectFirstInstance = LAYOUT.byteOffset(PathElement.groupElement("drawIndirectFirstInstance"));
    /// The memory layout of `drawIndirectFirstInstance`.
    public static final MemoryLayout LAYOUT_drawIndirectFirstInstance = LAYOUT.select(PathElement.groupElement("drawIndirectFirstInstance"));
    /// The [VarHandle] of `drawIndirectFirstInstance` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_drawIndirectFirstInstance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drawIndirectFirstInstance"));
    /// The byte offset of `depthClamp`.
    public static final long OFFSET_depthClamp = LAYOUT.byteOffset(PathElement.groupElement("depthClamp"));
    /// The memory layout of `depthClamp`.
    public static final MemoryLayout LAYOUT_depthClamp = LAYOUT.select(PathElement.groupElement("depthClamp"));
    /// The [VarHandle] of `depthClamp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthClamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthClamp"));
    /// The byte offset of `depthBiasClamp`.
    public static final long OFFSET_depthBiasClamp = LAYOUT.byteOffset(PathElement.groupElement("depthBiasClamp"));
    /// The memory layout of `depthBiasClamp`.
    public static final MemoryLayout LAYOUT_depthBiasClamp = LAYOUT.select(PathElement.groupElement("depthBiasClamp"));
    /// The [VarHandle] of `depthBiasClamp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthBiasClamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasClamp"));
    /// The byte offset of `fillModeNonSolid`.
    public static final long OFFSET_fillModeNonSolid = LAYOUT.byteOffset(PathElement.groupElement("fillModeNonSolid"));
    /// The memory layout of `fillModeNonSolid`.
    public static final MemoryLayout LAYOUT_fillModeNonSolid = LAYOUT.select(PathElement.groupElement("fillModeNonSolid"));
    /// The [VarHandle] of `fillModeNonSolid` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fillModeNonSolid = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fillModeNonSolid"));
    /// The byte offset of `depthBounds`.
    public static final long OFFSET_depthBounds = LAYOUT.byteOffset(PathElement.groupElement("depthBounds"));
    /// The memory layout of `depthBounds`.
    public static final MemoryLayout LAYOUT_depthBounds = LAYOUT.select(PathElement.groupElement("depthBounds"));
    /// The [VarHandle] of `depthBounds` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthBounds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBounds"));
    /// The byte offset of `wideLines`.
    public static final long OFFSET_wideLines = LAYOUT.byteOffset(PathElement.groupElement("wideLines"));
    /// The memory layout of `wideLines`.
    public static final MemoryLayout LAYOUT_wideLines = LAYOUT.select(PathElement.groupElement("wideLines"));
    /// The [VarHandle] of `wideLines` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_wideLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("wideLines"));
    /// The byte offset of `largePoints`.
    public static final long OFFSET_largePoints = LAYOUT.byteOffset(PathElement.groupElement("largePoints"));
    /// The memory layout of `largePoints`.
    public static final MemoryLayout LAYOUT_largePoints = LAYOUT.select(PathElement.groupElement("largePoints"));
    /// The [VarHandle] of `largePoints` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_largePoints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("largePoints"));
    /// The byte offset of `alphaToOne`.
    public static final long OFFSET_alphaToOne = LAYOUT.byteOffset(PathElement.groupElement("alphaToOne"));
    /// The memory layout of `alphaToOne`.
    public static final MemoryLayout LAYOUT_alphaToOne = LAYOUT.select(PathElement.groupElement("alphaToOne"));
    /// The [VarHandle] of `alphaToOne` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_alphaToOne = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alphaToOne"));
    /// The byte offset of `multiViewport`.
    public static final long OFFSET_multiViewport = LAYOUT.byteOffset(PathElement.groupElement("multiViewport"));
    /// The memory layout of `multiViewport`.
    public static final MemoryLayout LAYOUT_multiViewport = LAYOUT.select(PathElement.groupElement("multiViewport"));
    /// The [VarHandle] of `multiViewport` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_multiViewport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiViewport"));
    /// The byte offset of `samplerAnisotropy`.
    public static final long OFFSET_samplerAnisotropy = LAYOUT.byteOffset(PathElement.groupElement("samplerAnisotropy"));
    /// The memory layout of `samplerAnisotropy`.
    public static final MemoryLayout LAYOUT_samplerAnisotropy = LAYOUT.select(PathElement.groupElement("samplerAnisotropy"));
    /// The [VarHandle] of `samplerAnisotropy` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_samplerAnisotropy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerAnisotropy"));
    /// The byte offset of `textureCompressionETC2`.
    public static final long OFFSET_textureCompressionETC2 = LAYOUT.byteOffset(PathElement.groupElement("textureCompressionETC2"));
    /// The memory layout of `textureCompressionETC2`.
    public static final MemoryLayout LAYOUT_textureCompressionETC2 = LAYOUT.select(PathElement.groupElement("textureCompressionETC2"));
    /// The [VarHandle] of `textureCompressionETC2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_textureCompressionETC2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("textureCompressionETC2"));
    /// The byte offset of `textureCompressionASTC_LDR`.
    public static final long OFFSET_textureCompressionASTC_LDR = LAYOUT.byteOffset(PathElement.groupElement("textureCompressionASTC_LDR"));
    /// The memory layout of `textureCompressionASTC_LDR`.
    public static final MemoryLayout LAYOUT_textureCompressionASTC_LDR = LAYOUT.select(PathElement.groupElement("textureCompressionASTC_LDR"));
    /// The [VarHandle] of `textureCompressionASTC_LDR` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_textureCompressionASTC_LDR = LAYOUT.arrayElementVarHandle(PathElement.groupElement("textureCompressionASTC_LDR"));
    /// The byte offset of `textureCompressionBC`.
    public static final long OFFSET_textureCompressionBC = LAYOUT.byteOffset(PathElement.groupElement("textureCompressionBC"));
    /// The memory layout of `textureCompressionBC`.
    public static final MemoryLayout LAYOUT_textureCompressionBC = LAYOUT.select(PathElement.groupElement("textureCompressionBC"));
    /// The [VarHandle] of `textureCompressionBC` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_textureCompressionBC = LAYOUT.arrayElementVarHandle(PathElement.groupElement("textureCompressionBC"));
    /// The byte offset of `occlusionQueryPrecise`.
    public static final long OFFSET_occlusionQueryPrecise = LAYOUT.byteOffset(PathElement.groupElement("occlusionQueryPrecise"));
    /// The memory layout of `occlusionQueryPrecise`.
    public static final MemoryLayout LAYOUT_occlusionQueryPrecise = LAYOUT.select(PathElement.groupElement("occlusionQueryPrecise"));
    /// The [VarHandle] of `occlusionQueryPrecise` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_occlusionQueryPrecise = LAYOUT.arrayElementVarHandle(PathElement.groupElement("occlusionQueryPrecise"));
    /// The byte offset of `pipelineStatisticsQuery`.
    public static final long OFFSET_pipelineStatisticsQuery = LAYOUT.byteOffset(PathElement.groupElement("pipelineStatisticsQuery"));
    /// The memory layout of `pipelineStatisticsQuery`.
    public static final MemoryLayout LAYOUT_pipelineStatisticsQuery = LAYOUT.select(PathElement.groupElement("pipelineStatisticsQuery"));
    /// The [VarHandle] of `pipelineStatisticsQuery` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineStatisticsQuery = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineStatisticsQuery"));
    /// The byte offset of `vertexPipelineStoresAndAtomics`.
    public static final long OFFSET_vertexPipelineStoresAndAtomics = LAYOUT.byteOffset(PathElement.groupElement("vertexPipelineStoresAndAtomics"));
    /// The memory layout of `vertexPipelineStoresAndAtomics`.
    public static final MemoryLayout LAYOUT_vertexPipelineStoresAndAtomics = LAYOUT.select(PathElement.groupElement("vertexPipelineStoresAndAtomics"));
    /// The [VarHandle] of `vertexPipelineStoresAndAtomics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexPipelineStoresAndAtomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexPipelineStoresAndAtomics"));
    /// The byte offset of `fragmentStoresAndAtomics`.
    public static final long OFFSET_fragmentStoresAndAtomics = LAYOUT.byteOffset(PathElement.groupElement("fragmentStoresAndAtomics"));
    /// The memory layout of `fragmentStoresAndAtomics`.
    public static final MemoryLayout LAYOUT_fragmentStoresAndAtomics = LAYOUT.select(PathElement.groupElement("fragmentStoresAndAtomics"));
    /// The [VarHandle] of `fragmentStoresAndAtomics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fragmentStoresAndAtomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentStoresAndAtomics"));
    /// The byte offset of `shaderTessellationAndGeometryPointSize`.
    public static final long OFFSET_shaderTessellationAndGeometryPointSize = LAYOUT.byteOffset(PathElement.groupElement("shaderTessellationAndGeometryPointSize"));
    /// The memory layout of `shaderTessellationAndGeometryPointSize`.
    public static final MemoryLayout LAYOUT_shaderTessellationAndGeometryPointSize = LAYOUT.select(PathElement.groupElement("shaderTessellationAndGeometryPointSize"));
    /// The [VarHandle] of `shaderTessellationAndGeometryPointSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderTessellationAndGeometryPointSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTessellationAndGeometryPointSize"));
    /// The byte offset of `shaderImageGatherExtended`.
    public static final long OFFSET_shaderImageGatherExtended = LAYOUT.byteOffset(PathElement.groupElement("shaderImageGatherExtended"));
    /// The memory layout of `shaderImageGatherExtended`.
    public static final MemoryLayout LAYOUT_shaderImageGatherExtended = LAYOUT.select(PathElement.groupElement("shaderImageGatherExtended"));
    /// The [VarHandle] of `shaderImageGatherExtended` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderImageGatherExtended = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderImageGatherExtended"));
    /// The byte offset of `shaderStorageImageExtendedFormats`.
    public static final long OFFSET_shaderStorageImageExtendedFormats = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageExtendedFormats"));
    /// The memory layout of `shaderStorageImageExtendedFormats`.
    public static final MemoryLayout LAYOUT_shaderStorageImageExtendedFormats = LAYOUT.select(PathElement.groupElement("shaderStorageImageExtendedFormats"));
    /// The [VarHandle] of `shaderStorageImageExtendedFormats` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderStorageImageExtendedFormats = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageExtendedFormats"));
    /// The byte offset of `shaderStorageImageMultisample`.
    public static final long OFFSET_shaderStorageImageMultisample = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageMultisample"));
    /// The memory layout of `shaderStorageImageMultisample`.
    public static final MemoryLayout LAYOUT_shaderStorageImageMultisample = LAYOUT.select(PathElement.groupElement("shaderStorageImageMultisample"));
    /// The [VarHandle] of `shaderStorageImageMultisample` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderStorageImageMultisample = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageMultisample"));
    /// The byte offset of `shaderStorageImageReadWithoutFormat`.
    public static final long OFFSET_shaderStorageImageReadWithoutFormat = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageReadWithoutFormat"));
    /// The memory layout of `shaderStorageImageReadWithoutFormat`.
    public static final MemoryLayout LAYOUT_shaderStorageImageReadWithoutFormat = LAYOUT.select(PathElement.groupElement("shaderStorageImageReadWithoutFormat"));
    /// The [VarHandle] of `shaderStorageImageReadWithoutFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderStorageImageReadWithoutFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageReadWithoutFormat"));
    /// The byte offset of `shaderStorageImageWriteWithoutFormat`.
    public static final long OFFSET_shaderStorageImageWriteWithoutFormat = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageWriteWithoutFormat"));
    /// The memory layout of `shaderStorageImageWriteWithoutFormat`.
    public static final MemoryLayout LAYOUT_shaderStorageImageWriteWithoutFormat = LAYOUT.select(PathElement.groupElement("shaderStorageImageWriteWithoutFormat"));
    /// The [VarHandle] of `shaderStorageImageWriteWithoutFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderStorageImageWriteWithoutFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageWriteWithoutFormat"));
    /// The byte offset of `shaderUniformBufferArrayDynamicIndexing`.
    public static final long OFFSET_shaderUniformBufferArrayDynamicIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformBufferArrayDynamicIndexing"));
    /// The memory layout of `shaderUniformBufferArrayDynamicIndexing`.
    public static final MemoryLayout LAYOUT_shaderUniformBufferArrayDynamicIndexing = LAYOUT.select(PathElement.groupElement("shaderUniformBufferArrayDynamicIndexing"));
    /// The [VarHandle] of `shaderUniformBufferArrayDynamicIndexing` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderUniformBufferArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderUniformBufferArrayDynamicIndexing"));
    /// The byte offset of `shaderSampledImageArrayDynamicIndexing`.
    public static final long OFFSET_shaderSampledImageArrayDynamicIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderSampledImageArrayDynamicIndexing"));
    /// The memory layout of `shaderSampledImageArrayDynamicIndexing`.
    public static final MemoryLayout LAYOUT_shaderSampledImageArrayDynamicIndexing = LAYOUT.select(PathElement.groupElement("shaderSampledImageArrayDynamicIndexing"));
    /// The [VarHandle] of `shaderSampledImageArrayDynamicIndexing` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderSampledImageArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSampledImageArrayDynamicIndexing"));
    /// The byte offset of `shaderStorageBufferArrayDynamicIndexing`.
    public static final long OFFSET_shaderStorageBufferArrayDynamicIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageBufferArrayDynamicIndexing"));
    /// The memory layout of `shaderStorageBufferArrayDynamicIndexing`.
    public static final MemoryLayout LAYOUT_shaderStorageBufferArrayDynamicIndexing = LAYOUT.select(PathElement.groupElement("shaderStorageBufferArrayDynamicIndexing"));
    /// The [VarHandle] of `shaderStorageBufferArrayDynamicIndexing` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderStorageBufferArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageBufferArrayDynamicIndexing"));
    /// The byte offset of `shaderStorageImageArrayDynamicIndexing`.
    public static final long OFFSET_shaderStorageImageArrayDynamicIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageArrayDynamicIndexing"));
    /// The memory layout of `shaderStorageImageArrayDynamicIndexing`.
    public static final MemoryLayout LAYOUT_shaderStorageImageArrayDynamicIndexing = LAYOUT.select(PathElement.groupElement("shaderStorageImageArrayDynamicIndexing"));
    /// The [VarHandle] of `shaderStorageImageArrayDynamicIndexing` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderStorageImageArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageArrayDynamicIndexing"));
    /// The byte offset of `shaderClipDistance`.
    public static final long OFFSET_shaderClipDistance = LAYOUT.byteOffset(PathElement.groupElement("shaderClipDistance"));
    /// The memory layout of `shaderClipDistance`.
    public static final MemoryLayout LAYOUT_shaderClipDistance = LAYOUT.select(PathElement.groupElement("shaderClipDistance"));
    /// The [VarHandle] of `shaderClipDistance` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderClipDistance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderClipDistance"));
    /// The byte offset of `shaderCullDistance`.
    public static final long OFFSET_shaderCullDistance = LAYOUT.byteOffset(PathElement.groupElement("shaderCullDistance"));
    /// The memory layout of `shaderCullDistance`.
    public static final MemoryLayout LAYOUT_shaderCullDistance = LAYOUT.select(PathElement.groupElement("shaderCullDistance"));
    /// The [VarHandle] of `shaderCullDistance` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderCullDistance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderCullDistance"));
    /// The byte offset of `shaderFloat64`.
    public static final long OFFSET_shaderFloat64 = LAYOUT.byteOffset(PathElement.groupElement("shaderFloat64"));
    /// The memory layout of `shaderFloat64`.
    public static final MemoryLayout LAYOUT_shaderFloat64 = LAYOUT.select(PathElement.groupElement("shaderFloat64"));
    /// The [VarHandle] of `shaderFloat64` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFloat64"));
    /// The byte offset of `shaderInt64`.
    public static final long OFFSET_shaderInt64 = LAYOUT.byteOffset(PathElement.groupElement("shaderInt64"));
    /// The memory layout of `shaderInt64`.
    public static final MemoryLayout LAYOUT_shaderInt64 = LAYOUT.select(PathElement.groupElement("shaderInt64"));
    /// The [VarHandle] of `shaderInt64` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderInt64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInt64"));
    /// The byte offset of `shaderInt16`.
    public static final long OFFSET_shaderInt16 = LAYOUT.byteOffset(PathElement.groupElement("shaderInt16"));
    /// The memory layout of `shaderInt16`.
    public static final MemoryLayout LAYOUT_shaderInt16 = LAYOUT.select(PathElement.groupElement("shaderInt16"));
    /// The [VarHandle] of `shaderInt16` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderInt16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInt16"));
    /// The byte offset of `shaderResourceResidency`.
    public static final long OFFSET_shaderResourceResidency = LAYOUT.byteOffset(PathElement.groupElement("shaderResourceResidency"));
    /// The memory layout of `shaderResourceResidency`.
    public static final MemoryLayout LAYOUT_shaderResourceResidency = LAYOUT.select(PathElement.groupElement("shaderResourceResidency"));
    /// The [VarHandle] of `shaderResourceResidency` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderResourceResidency = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderResourceResidency"));
    /// The byte offset of `shaderResourceMinLod`.
    public static final long OFFSET_shaderResourceMinLod = LAYOUT.byteOffset(PathElement.groupElement("shaderResourceMinLod"));
    /// The memory layout of `shaderResourceMinLod`.
    public static final MemoryLayout LAYOUT_shaderResourceMinLod = LAYOUT.select(PathElement.groupElement("shaderResourceMinLod"));
    /// The [VarHandle] of `shaderResourceMinLod` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderResourceMinLod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderResourceMinLod"));
    /// The byte offset of `sparseBinding`.
    public static final long OFFSET_sparseBinding = LAYOUT.byteOffset(PathElement.groupElement("sparseBinding"));
    /// The memory layout of `sparseBinding`.
    public static final MemoryLayout LAYOUT_sparseBinding = LAYOUT.select(PathElement.groupElement("sparseBinding"));
    /// The [VarHandle] of `sparseBinding` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sparseBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseBinding"));
    /// The byte offset of `sparseResidencyBuffer`.
    public static final long OFFSET_sparseResidencyBuffer = LAYOUT.byteOffset(PathElement.groupElement("sparseResidencyBuffer"));
    /// The memory layout of `sparseResidencyBuffer`.
    public static final MemoryLayout LAYOUT_sparseResidencyBuffer = LAYOUT.select(PathElement.groupElement("sparseResidencyBuffer"));
    /// The [VarHandle] of `sparseResidencyBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sparseResidencyBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidencyBuffer"));
    /// The byte offset of `sparseResidencyImage2D`.
    public static final long OFFSET_sparseResidencyImage2D = LAYOUT.byteOffset(PathElement.groupElement("sparseResidencyImage2D"));
    /// The memory layout of `sparseResidencyImage2D`.
    public static final MemoryLayout LAYOUT_sparseResidencyImage2D = LAYOUT.select(PathElement.groupElement("sparseResidencyImage2D"));
    /// The [VarHandle] of `sparseResidencyImage2D` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sparseResidencyImage2D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidencyImage2D"));
    /// The byte offset of `sparseResidencyImage3D`.
    public static final long OFFSET_sparseResidencyImage3D = LAYOUT.byteOffset(PathElement.groupElement("sparseResidencyImage3D"));
    /// The memory layout of `sparseResidencyImage3D`.
    public static final MemoryLayout LAYOUT_sparseResidencyImage3D = LAYOUT.select(PathElement.groupElement("sparseResidencyImage3D"));
    /// The [VarHandle] of `sparseResidencyImage3D` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sparseResidencyImage3D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidencyImage3D"));
    /// The byte offset of `sparseResidency2Samples`.
    public static final long OFFSET_sparseResidency2Samples = LAYOUT.byteOffset(PathElement.groupElement("sparseResidency2Samples"));
    /// The memory layout of `sparseResidency2Samples`.
    public static final MemoryLayout LAYOUT_sparseResidency2Samples = LAYOUT.select(PathElement.groupElement("sparseResidency2Samples"));
    /// The [VarHandle] of `sparseResidency2Samples` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sparseResidency2Samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidency2Samples"));
    /// The byte offset of `sparseResidency4Samples`.
    public static final long OFFSET_sparseResidency4Samples = LAYOUT.byteOffset(PathElement.groupElement("sparseResidency4Samples"));
    /// The memory layout of `sparseResidency4Samples`.
    public static final MemoryLayout LAYOUT_sparseResidency4Samples = LAYOUT.select(PathElement.groupElement("sparseResidency4Samples"));
    /// The [VarHandle] of `sparseResidency4Samples` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sparseResidency4Samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidency4Samples"));
    /// The byte offset of `sparseResidency8Samples`.
    public static final long OFFSET_sparseResidency8Samples = LAYOUT.byteOffset(PathElement.groupElement("sparseResidency8Samples"));
    /// The memory layout of `sparseResidency8Samples`.
    public static final MemoryLayout LAYOUT_sparseResidency8Samples = LAYOUT.select(PathElement.groupElement("sparseResidency8Samples"));
    /// The [VarHandle] of `sparseResidency8Samples` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sparseResidency8Samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidency8Samples"));
    /// The byte offset of `sparseResidency16Samples`.
    public static final long OFFSET_sparseResidency16Samples = LAYOUT.byteOffset(PathElement.groupElement("sparseResidency16Samples"));
    /// The memory layout of `sparseResidency16Samples`.
    public static final MemoryLayout LAYOUT_sparseResidency16Samples = LAYOUT.select(PathElement.groupElement("sparseResidency16Samples"));
    /// The [VarHandle] of `sparseResidency16Samples` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sparseResidency16Samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidency16Samples"));
    /// The byte offset of `sparseResidencyAliased`.
    public static final long OFFSET_sparseResidencyAliased = LAYOUT.byteOffset(PathElement.groupElement("sparseResidencyAliased"));
    /// The memory layout of `sparseResidencyAliased`.
    public static final MemoryLayout LAYOUT_sparseResidencyAliased = LAYOUT.select(PathElement.groupElement("sparseResidencyAliased"));
    /// The [VarHandle] of `sparseResidencyAliased` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sparseResidencyAliased = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidencyAliased"));
    /// The byte offset of `variableMultisampleRate`.
    public static final long OFFSET_variableMultisampleRate = LAYOUT.byteOffset(PathElement.groupElement("variableMultisampleRate"));
    /// The memory layout of `variableMultisampleRate`.
    public static final MemoryLayout LAYOUT_variableMultisampleRate = LAYOUT.select(PathElement.groupElement("variableMultisampleRate"));
    /// The [VarHandle] of `variableMultisampleRate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_variableMultisampleRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("variableMultisampleRate"));
    /// The byte offset of `inheritedQueries`.
    public static final long OFFSET_inheritedQueries = LAYOUT.byteOffset(PathElement.groupElement("inheritedQueries"));
    /// The memory layout of `inheritedQueries`.
    public static final MemoryLayout LAYOUT_inheritedQueries = LAYOUT.select(PathElement.groupElement("inheritedQueries"));
    /// The [VarHandle] of `inheritedQueries` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_inheritedQueries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inheritedQueries"));

    /// Creates `VkPhysicalDeviceFeatures` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFeatures(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFeatures`
    public static VkPhysicalDeviceFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFeatures(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFeatures`
    public static VkPhysicalDeviceFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFeatures(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceFeatures copyFrom(VkPhysicalDeviceFeatures src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceFeatures reinterpret(long count) { return new VkPhysicalDeviceFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `robustBufferAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int robustBufferAccess(MemorySegment segment, long index) { return (int) VH_robustBufferAccess.get(segment, 0L, index); }
    /// {@return `robustBufferAccess`}
    public int robustBufferAccess() { return robustBufferAccess(this.segment(), 0L); }
    /// Sets `robustBufferAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void robustBufferAccess(MemorySegment segment, long index, int value) { VH_robustBufferAccess.set(segment, 0L, index, value); }
    /// Sets `robustBufferAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures robustBufferAccess(int value) { robustBufferAccess(this.segment(), 0L, value); return this; }

    /// {@return `fullDrawIndexUint32` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fullDrawIndexUint32(MemorySegment segment, long index) { return (int) VH_fullDrawIndexUint32.get(segment, 0L, index); }
    /// {@return `fullDrawIndexUint32`}
    public int fullDrawIndexUint32() { return fullDrawIndexUint32(this.segment(), 0L); }
    /// Sets `fullDrawIndexUint32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fullDrawIndexUint32(MemorySegment segment, long index, int value) { VH_fullDrawIndexUint32.set(segment, 0L, index, value); }
    /// Sets `fullDrawIndexUint32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures fullDrawIndexUint32(int value) { fullDrawIndexUint32(this.segment(), 0L, value); return this; }

    /// {@return `imageCubeArray` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageCubeArray(MemorySegment segment, long index) { return (int) VH_imageCubeArray.get(segment, 0L, index); }
    /// {@return `imageCubeArray`}
    public int imageCubeArray() { return imageCubeArray(this.segment(), 0L); }
    /// Sets `imageCubeArray` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageCubeArray(MemorySegment segment, long index, int value) { VH_imageCubeArray.set(segment, 0L, index, value); }
    /// Sets `imageCubeArray` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures imageCubeArray(int value) { imageCubeArray(this.segment(), 0L, value); return this; }

    /// {@return `independentBlend` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int independentBlend(MemorySegment segment, long index) { return (int) VH_independentBlend.get(segment, 0L, index); }
    /// {@return `independentBlend`}
    public int independentBlend() { return independentBlend(this.segment(), 0L); }
    /// Sets `independentBlend` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void independentBlend(MemorySegment segment, long index, int value) { VH_independentBlend.set(segment, 0L, index, value); }
    /// Sets `independentBlend` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures independentBlend(int value) { independentBlend(this.segment(), 0L, value); return this; }

    /// {@return `geometryShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int geometryShader(MemorySegment segment, long index) { return (int) VH_geometryShader.get(segment, 0L, index); }
    /// {@return `geometryShader`}
    public int geometryShader() { return geometryShader(this.segment(), 0L); }
    /// Sets `geometryShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void geometryShader(MemorySegment segment, long index, int value) { VH_geometryShader.set(segment, 0L, index, value); }
    /// Sets `geometryShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures geometryShader(int value) { geometryShader(this.segment(), 0L, value); return this; }

    /// {@return `tessellationShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tessellationShader(MemorySegment segment, long index) { return (int) VH_tessellationShader.get(segment, 0L, index); }
    /// {@return `tessellationShader`}
    public int tessellationShader() { return tessellationShader(this.segment(), 0L); }
    /// Sets `tessellationShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tessellationShader(MemorySegment segment, long index, int value) { VH_tessellationShader.set(segment, 0L, index, value); }
    /// Sets `tessellationShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures tessellationShader(int value) { tessellationShader(this.segment(), 0L, value); return this; }

    /// {@return `sampleRateShading` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sampleRateShading(MemorySegment segment, long index) { return (int) VH_sampleRateShading.get(segment, 0L, index); }
    /// {@return `sampleRateShading`}
    public int sampleRateShading() { return sampleRateShading(this.segment(), 0L); }
    /// Sets `sampleRateShading` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampleRateShading(MemorySegment segment, long index, int value) { VH_sampleRateShading.set(segment, 0L, index, value); }
    /// Sets `sampleRateShading` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sampleRateShading(int value) { sampleRateShading(this.segment(), 0L, value); return this; }

    /// {@return `dualSrcBlend` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dualSrcBlend(MemorySegment segment, long index) { return (int) VH_dualSrcBlend.get(segment, 0L, index); }
    /// {@return `dualSrcBlend`}
    public int dualSrcBlend() { return dualSrcBlend(this.segment(), 0L); }
    /// Sets `dualSrcBlend` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dualSrcBlend(MemorySegment segment, long index, int value) { VH_dualSrcBlend.set(segment, 0L, index, value); }
    /// Sets `dualSrcBlend` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures dualSrcBlend(int value) { dualSrcBlend(this.segment(), 0L, value); return this; }

    /// {@return `logicOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int logicOp(MemorySegment segment, long index) { return (int) VH_logicOp.get(segment, 0L, index); }
    /// {@return `logicOp`}
    public int logicOp() { return logicOp(this.segment(), 0L); }
    /// Sets `logicOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void logicOp(MemorySegment segment, long index, int value) { VH_logicOp.set(segment, 0L, index, value); }
    /// Sets `logicOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures logicOp(int value) { logicOp(this.segment(), 0L, value); return this; }

    /// {@return `multiDrawIndirect` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int multiDrawIndirect(MemorySegment segment, long index) { return (int) VH_multiDrawIndirect.get(segment, 0L, index); }
    /// {@return `multiDrawIndirect`}
    public int multiDrawIndirect() { return multiDrawIndirect(this.segment(), 0L); }
    /// Sets `multiDrawIndirect` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void multiDrawIndirect(MemorySegment segment, long index, int value) { VH_multiDrawIndirect.set(segment, 0L, index, value); }
    /// Sets `multiDrawIndirect` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures multiDrawIndirect(int value) { multiDrawIndirect(this.segment(), 0L, value); return this; }

    /// {@return `drawIndirectFirstInstance` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int drawIndirectFirstInstance(MemorySegment segment, long index) { return (int) VH_drawIndirectFirstInstance.get(segment, 0L, index); }
    /// {@return `drawIndirectFirstInstance`}
    public int drawIndirectFirstInstance() { return drawIndirectFirstInstance(this.segment(), 0L); }
    /// Sets `drawIndirectFirstInstance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void drawIndirectFirstInstance(MemorySegment segment, long index, int value) { VH_drawIndirectFirstInstance.set(segment, 0L, index, value); }
    /// Sets `drawIndirectFirstInstance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures drawIndirectFirstInstance(int value) { drawIndirectFirstInstance(this.segment(), 0L, value); return this; }

    /// {@return `depthClamp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int depthClamp(MemorySegment segment, long index) { return (int) VH_depthClamp.get(segment, 0L, index); }
    /// {@return `depthClamp`}
    public int depthClamp() { return depthClamp(this.segment(), 0L); }
    /// Sets `depthClamp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthClamp(MemorySegment segment, long index, int value) { VH_depthClamp.set(segment, 0L, index, value); }
    /// Sets `depthClamp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures depthClamp(int value) { depthClamp(this.segment(), 0L, value); return this; }

    /// {@return `depthBiasClamp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int depthBiasClamp(MemorySegment segment, long index) { return (int) VH_depthBiasClamp.get(segment, 0L, index); }
    /// {@return `depthBiasClamp`}
    public int depthBiasClamp() { return depthBiasClamp(this.segment(), 0L); }
    /// Sets `depthBiasClamp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthBiasClamp(MemorySegment segment, long index, int value) { VH_depthBiasClamp.set(segment, 0L, index, value); }
    /// Sets `depthBiasClamp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures depthBiasClamp(int value) { depthBiasClamp(this.segment(), 0L, value); return this; }

    /// {@return `fillModeNonSolid` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fillModeNonSolid(MemorySegment segment, long index) { return (int) VH_fillModeNonSolid.get(segment, 0L, index); }
    /// {@return `fillModeNonSolid`}
    public int fillModeNonSolid() { return fillModeNonSolid(this.segment(), 0L); }
    /// Sets `fillModeNonSolid` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fillModeNonSolid(MemorySegment segment, long index, int value) { VH_fillModeNonSolid.set(segment, 0L, index, value); }
    /// Sets `fillModeNonSolid` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures fillModeNonSolid(int value) { fillModeNonSolid(this.segment(), 0L, value); return this; }

    /// {@return `depthBounds` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int depthBounds(MemorySegment segment, long index) { return (int) VH_depthBounds.get(segment, 0L, index); }
    /// {@return `depthBounds`}
    public int depthBounds() { return depthBounds(this.segment(), 0L); }
    /// Sets `depthBounds` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthBounds(MemorySegment segment, long index, int value) { VH_depthBounds.set(segment, 0L, index, value); }
    /// Sets `depthBounds` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures depthBounds(int value) { depthBounds(this.segment(), 0L, value); return this; }

    /// {@return `wideLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int wideLines(MemorySegment segment, long index) { return (int) VH_wideLines.get(segment, 0L, index); }
    /// {@return `wideLines`}
    public int wideLines() { return wideLines(this.segment(), 0L); }
    /// Sets `wideLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void wideLines(MemorySegment segment, long index, int value) { VH_wideLines.set(segment, 0L, index, value); }
    /// Sets `wideLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures wideLines(int value) { wideLines(this.segment(), 0L, value); return this; }

    /// {@return `largePoints` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int largePoints(MemorySegment segment, long index) { return (int) VH_largePoints.get(segment, 0L, index); }
    /// {@return `largePoints`}
    public int largePoints() { return largePoints(this.segment(), 0L); }
    /// Sets `largePoints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void largePoints(MemorySegment segment, long index, int value) { VH_largePoints.set(segment, 0L, index, value); }
    /// Sets `largePoints` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures largePoints(int value) { largePoints(this.segment(), 0L, value); return this; }

    /// {@return `alphaToOne` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int alphaToOne(MemorySegment segment, long index) { return (int) VH_alphaToOne.get(segment, 0L, index); }
    /// {@return `alphaToOne`}
    public int alphaToOne() { return alphaToOne(this.segment(), 0L); }
    /// Sets `alphaToOne` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void alphaToOne(MemorySegment segment, long index, int value) { VH_alphaToOne.set(segment, 0L, index, value); }
    /// Sets `alphaToOne` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures alphaToOne(int value) { alphaToOne(this.segment(), 0L, value); return this; }

    /// {@return `multiViewport` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int multiViewport(MemorySegment segment, long index) { return (int) VH_multiViewport.get(segment, 0L, index); }
    /// {@return `multiViewport`}
    public int multiViewport() { return multiViewport(this.segment(), 0L); }
    /// Sets `multiViewport` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void multiViewport(MemorySegment segment, long index, int value) { VH_multiViewport.set(segment, 0L, index, value); }
    /// Sets `multiViewport` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures multiViewport(int value) { multiViewport(this.segment(), 0L, value); return this; }

    /// {@return `samplerAnisotropy` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int samplerAnisotropy(MemorySegment segment, long index) { return (int) VH_samplerAnisotropy.get(segment, 0L, index); }
    /// {@return `samplerAnisotropy`}
    public int samplerAnisotropy() { return samplerAnisotropy(this.segment(), 0L); }
    /// Sets `samplerAnisotropy` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void samplerAnisotropy(MemorySegment segment, long index, int value) { VH_samplerAnisotropy.set(segment, 0L, index, value); }
    /// Sets `samplerAnisotropy` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures samplerAnisotropy(int value) { samplerAnisotropy(this.segment(), 0L, value); return this; }

    /// {@return `textureCompressionETC2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int textureCompressionETC2(MemorySegment segment, long index) { return (int) VH_textureCompressionETC2.get(segment, 0L, index); }
    /// {@return `textureCompressionETC2`}
    public int textureCompressionETC2() { return textureCompressionETC2(this.segment(), 0L); }
    /// Sets `textureCompressionETC2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void textureCompressionETC2(MemorySegment segment, long index, int value) { VH_textureCompressionETC2.set(segment, 0L, index, value); }
    /// Sets `textureCompressionETC2` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures textureCompressionETC2(int value) { textureCompressionETC2(this.segment(), 0L, value); return this; }

    /// {@return `textureCompressionASTC_LDR` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int textureCompressionASTC_LDR(MemorySegment segment, long index) { return (int) VH_textureCompressionASTC_LDR.get(segment, 0L, index); }
    /// {@return `textureCompressionASTC_LDR`}
    public int textureCompressionASTC_LDR() { return textureCompressionASTC_LDR(this.segment(), 0L); }
    /// Sets `textureCompressionASTC_LDR` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void textureCompressionASTC_LDR(MemorySegment segment, long index, int value) { VH_textureCompressionASTC_LDR.set(segment, 0L, index, value); }
    /// Sets `textureCompressionASTC_LDR` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures textureCompressionASTC_LDR(int value) { textureCompressionASTC_LDR(this.segment(), 0L, value); return this; }

    /// {@return `textureCompressionBC` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int textureCompressionBC(MemorySegment segment, long index) { return (int) VH_textureCompressionBC.get(segment, 0L, index); }
    /// {@return `textureCompressionBC`}
    public int textureCompressionBC() { return textureCompressionBC(this.segment(), 0L); }
    /// Sets `textureCompressionBC` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void textureCompressionBC(MemorySegment segment, long index, int value) { VH_textureCompressionBC.set(segment, 0L, index, value); }
    /// Sets `textureCompressionBC` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures textureCompressionBC(int value) { textureCompressionBC(this.segment(), 0L, value); return this; }

    /// {@return `occlusionQueryPrecise` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int occlusionQueryPrecise(MemorySegment segment, long index) { return (int) VH_occlusionQueryPrecise.get(segment, 0L, index); }
    /// {@return `occlusionQueryPrecise`}
    public int occlusionQueryPrecise() { return occlusionQueryPrecise(this.segment(), 0L); }
    /// Sets `occlusionQueryPrecise` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void occlusionQueryPrecise(MemorySegment segment, long index, int value) { VH_occlusionQueryPrecise.set(segment, 0L, index, value); }
    /// Sets `occlusionQueryPrecise` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures occlusionQueryPrecise(int value) { occlusionQueryPrecise(this.segment(), 0L, value); return this; }

    /// {@return `pipelineStatisticsQuery` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineStatisticsQuery(MemorySegment segment, long index) { return (int) VH_pipelineStatisticsQuery.get(segment, 0L, index); }
    /// {@return `pipelineStatisticsQuery`}
    public int pipelineStatisticsQuery() { return pipelineStatisticsQuery(this.segment(), 0L); }
    /// Sets `pipelineStatisticsQuery` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineStatisticsQuery(MemorySegment segment, long index, int value) { VH_pipelineStatisticsQuery.set(segment, 0L, index, value); }
    /// Sets `pipelineStatisticsQuery` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures pipelineStatisticsQuery(int value) { pipelineStatisticsQuery(this.segment(), 0L, value); return this; }

    /// {@return `vertexPipelineStoresAndAtomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vertexPipelineStoresAndAtomics(MemorySegment segment, long index) { return (int) VH_vertexPipelineStoresAndAtomics.get(segment, 0L, index); }
    /// {@return `vertexPipelineStoresAndAtomics`}
    public int vertexPipelineStoresAndAtomics() { return vertexPipelineStoresAndAtomics(this.segment(), 0L); }
    /// Sets `vertexPipelineStoresAndAtomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexPipelineStoresAndAtomics(MemorySegment segment, long index, int value) { VH_vertexPipelineStoresAndAtomics.set(segment, 0L, index, value); }
    /// Sets `vertexPipelineStoresAndAtomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures vertexPipelineStoresAndAtomics(int value) { vertexPipelineStoresAndAtomics(this.segment(), 0L, value); return this; }

    /// {@return `fragmentStoresAndAtomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentStoresAndAtomics(MemorySegment segment, long index) { return (int) VH_fragmentStoresAndAtomics.get(segment, 0L, index); }
    /// {@return `fragmentStoresAndAtomics`}
    public int fragmentStoresAndAtomics() { return fragmentStoresAndAtomics(this.segment(), 0L); }
    /// Sets `fragmentStoresAndAtomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentStoresAndAtomics(MemorySegment segment, long index, int value) { VH_fragmentStoresAndAtomics.set(segment, 0L, index, value); }
    /// Sets `fragmentStoresAndAtomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures fragmentStoresAndAtomics(int value) { fragmentStoresAndAtomics(this.segment(), 0L, value); return this; }

    /// {@return `shaderTessellationAndGeometryPointSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderTessellationAndGeometryPointSize(MemorySegment segment, long index) { return (int) VH_shaderTessellationAndGeometryPointSize.get(segment, 0L, index); }
    /// {@return `shaderTessellationAndGeometryPointSize`}
    public int shaderTessellationAndGeometryPointSize() { return shaderTessellationAndGeometryPointSize(this.segment(), 0L); }
    /// Sets `shaderTessellationAndGeometryPointSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderTessellationAndGeometryPointSize(MemorySegment segment, long index, int value) { VH_shaderTessellationAndGeometryPointSize.set(segment, 0L, index, value); }
    /// Sets `shaderTessellationAndGeometryPointSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderTessellationAndGeometryPointSize(int value) { shaderTessellationAndGeometryPointSize(this.segment(), 0L, value); return this; }

    /// {@return `shaderImageGatherExtended` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderImageGatherExtended(MemorySegment segment, long index) { return (int) VH_shaderImageGatherExtended.get(segment, 0L, index); }
    /// {@return `shaderImageGatherExtended`}
    public int shaderImageGatherExtended() { return shaderImageGatherExtended(this.segment(), 0L); }
    /// Sets `shaderImageGatherExtended` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderImageGatherExtended(MemorySegment segment, long index, int value) { VH_shaderImageGatherExtended.set(segment, 0L, index, value); }
    /// Sets `shaderImageGatherExtended` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderImageGatherExtended(int value) { shaderImageGatherExtended(this.segment(), 0L, value); return this; }

    /// {@return `shaderStorageImageExtendedFormats` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderStorageImageExtendedFormats(MemorySegment segment, long index) { return (int) VH_shaderStorageImageExtendedFormats.get(segment, 0L, index); }
    /// {@return `shaderStorageImageExtendedFormats`}
    public int shaderStorageImageExtendedFormats() { return shaderStorageImageExtendedFormats(this.segment(), 0L); }
    /// Sets `shaderStorageImageExtendedFormats` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderStorageImageExtendedFormats(MemorySegment segment, long index, int value) { VH_shaderStorageImageExtendedFormats.set(segment, 0L, index, value); }
    /// Sets `shaderStorageImageExtendedFormats` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageImageExtendedFormats(int value) { shaderStorageImageExtendedFormats(this.segment(), 0L, value); return this; }

    /// {@return `shaderStorageImageMultisample` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderStorageImageMultisample(MemorySegment segment, long index) { return (int) VH_shaderStorageImageMultisample.get(segment, 0L, index); }
    /// {@return `shaderStorageImageMultisample`}
    public int shaderStorageImageMultisample() { return shaderStorageImageMultisample(this.segment(), 0L); }
    /// Sets `shaderStorageImageMultisample` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderStorageImageMultisample(MemorySegment segment, long index, int value) { VH_shaderStorageImageMultisample.set(segment, 0L, index, value); }
    /// Sets `shaderStorageImageMultisample` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageImageMultisample(int value) { shaderStorageImageMultisample(this.segment(), 0L, value); return this; }

    /// {@return `shaderStorageImageReadWithoutFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderStorageImageReadWithoutFormat(MemorySegment segment, long index) { return (int) VH_shaderStorageImageReadWithoutFormat.get(segment, 0L, index); }
    /// {@return `shaderStorageImageReadWithoutFormat`}
    public int shaderStorageImageReadWithoutFormat() { return shaderStorageImageReadWithoutFormat(this.segment(), 0L); }
    /// Sets `shaderStorageImageReadWithoutFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderStorageImageReadWithoutFormat(MemorySegment segment, long index, int value) { VH_shaderStorageImageReadWithoutFormat.set(segment, 0L, index, value); }
    /// Sets `shaderStorageImageReadWithoutFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageImageReadWithoutFormat(int value) { shaderStorageImageReadWithoutFormat(this.segment(), 0L, value); return this; }

    /// {@return `shaderStorageImageWriteWithoutFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderStorageImageWriteWithoutFormat(MemorySegment segment, long index) { return (int) VH_shaderStorageImageWriteWithoutFormat.get(segment, 0L, index); }
    /// {@return `shaderStorageImageWriteWithoutFormat`}
    public int shaderStorageImageWriteWithoutFormat() { return shaderStorageImageWriteWithoutFormat(this.segment(), 0L); }
    /// Sets `shaderStorageImageWriteWithoutFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderStorageImageWriteWithoutFormat(MemorySegment segment, long index, int value) { VH_shaderStorageImageWriteWithoutFormat.set(segment, 0L, index, value); }
    /// Sets `shaderStorageImageWriteWithoutFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageImageWriteWithoutFormat(int value) { shaderStorageImageWriteWithoutFormat(this.segment(), 0L, value); return this; }

    /// {@return `shaderUniformBufferArrayDynamicIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderUniformBufferArrayDynamicIndexing(MemorySegment segment, long index) { return (int) VH_shaderUniformBufferArrayDynamicIndexing.get(segment, 0L, index); }
    /// {@return `shaderUniformBufferArrayDynamicIndexing`}
    public int shaderUniformBufferArrayDynamicIndexing() { return shaderUniformBufferArrayDynamicIndexing(this.segment(), 0L); }
    /// Sets `shaderUniformBufferArrayDynamicIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderUniformBufferArrayDynamicIndexing(MemorySegment segment, long index, int value) { VH_shaderUniformBufferArrayDynamicIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderUniformBufferArrayDynamicIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderUniformBufferArrayDynamicIndexing(int value) { shaderUniformBufferArrayDynamicIndexing(this.segment(), 0L, value); return this; }

    /// {@return `shaderSampledImageArrayDynamicIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSampledImageArrayDynamicIndexing(MemorySegment segment, long index) { return (int) VH_shaderSampledImageArrayDynamicIndexing.get(segment, 0L, index); }
    /// {@return `shaderSampledImageArrayDynamicIndexing`}
    public int shaderSampledImageArrayDynamicIndexing() { return shaderSampledImageArrayDynamicIndexing(this.segment(), 0L); }
    /// Sets `shaderSampledImageArrayDynamicIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSampledImageArrayDynamicIndexing(MemorySegment segment, long index, int value) { VH_shaderSampledImageArrayDynamicIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderSampledImageArrayDynamicIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderSampledImageArrayDynamicIndexing(int value) { shaderSampledImageArrayDynamicIndexing(this.segment(), 0L, value); return this; }

    /// {@return `shaderStorageBufferArrayDynamicIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderStorageBufferArrayDynamicIndexing(MemorySegment segment, long index) { return (int) VH_shaderStorageBufferArrayDynamicIndexing.get(segment, 0L, index); }
    /// {@return `shaderStorageBufferArrayDynamicIndexing`}
    public int shaderStorageBufferArrayDynamicIndexing() { return shaderStorageBufferArrayDynamicIndexing(this.segment(), 0L); }
    /// Sets `shaderStorageBufferArrayDynamicIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderStorageBufferArrayDynamicIndexing(MemorySegment segment, long index, int value) { VH_shaderStorageBufferArrayDynamicIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderStorageBufferArrayDynamicIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageBufferArrayDynamicIndexing(int value) { shaderStorageBufferArrayDynamicIndexing(this.segment(), 0L, value); return this; }

    /// {@return `shaderStorageImageArrayDynamicIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderStorageImageArrayDynamicIndexing(MemorySegment segment, long index) { return (int) VH_shaderStorageImageArrayDynamicIndexing.get(segment, 0L, index); }
    /// {@return `shaderStorageImageArrayDynamicIndexing`}
    public int shaderStorageImageArrayDynamicIndexing() { return shaderStorageImageArrayDynamicIndexing(this.segment(), 0L); }
    /// Sets `shaderStorageImageArrayDynamicIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderStorageImageArrayDynamicIndexing(MemorySegment segment, long index, int value) { VH_shaderStorageImageArrayDynamicIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderStorageImageArrayDynamicIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageImageArrayDynamicIndexing(int value) { shaderStorageImageArrayDynamicIndexing(this.segment(), 0L, value); return this; }

    /// {@return `shaderClipDistance` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderClipDistance(MemorySegment segment, long index) { return (int) VH_shaderClipDistance.get(segment, 0L, index); }
    /// {@return `shaderClipDistance`}
    public int shaderClipDistance() { return shaderClipDistance(this.segment(), 0L); }
    /// Sets `shaderClipDistance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderClipDistance(MemorySegment segment, long index, int value) { VH_shaderClipDistance.set(segment, 0L, index, value); }
    /// Sets `shaderClipDistance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderClipDistance(int value) { shaderClipDistance(this.segment(), 0L, value); return this; }

    /// {@return `shaderCullDistance` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderCullDistance(MemorySegment segment, long index) { return (int) VH_shaderCullDistance.get(segment, 0L, index); }
    /// {@return `shaderCullDistance`}
    public int shaderCullDistance() { return shaderCullDistance(this.segment(), 0L); }
    /// Sets `shaderCullDistance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderCullDistance(MemorySegment segment, long index, int value) { VH_shaderCullDistance.set(segment, 0L, index, value); }
    /// Sets `shaderCullDistance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderCullDistance(int value) { shaderCullDistance(this.segment(), 0L, value); return this; }

    /// {@return `shaderFloat64` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderFloat64(MemorySegment segment, long index) { return (int) VH_shaderFloat64.get(segment, 0L, index); }
    /// {@return `shaderFloat64`}
    public int shaderFloat64() { return shaderFloat64(this.segment(), 0L); }
    /// Sets `shaderFloat64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderFloat64(MemorySegment segment, long index, int value) { VH_shaderFloat64.set(segment, 0L, index, value); }
    /// Sets `shaderFloat64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderFloat64(int value) { shaderFloat64(this.segment(), 0L, value); return this; }

    /// {@return `shaderInt64` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderInt64(MemorySegment segment, long index) { return (int) VH_shaderInt64.get(segment, 0L, index); }
    /// {@return `shaderInt64`}
    public int shaderInt64() { return shaderInt64(this.segment(), 0L); }
    /// Sets `shaderInt64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderInt64(MemorySegment segment, long index, int value) { VH_shaderInt64.set(segment, 0L, index, value); }
    /// Sets `shaderInt64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderInt64(int value) { shaderInt64(this.segment(), 0L, value); return this; }

    /// {@return `shaderInt16` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderInt16(MemorySegment segment, long index) { return (int) VH_shaderInt16.get(segment, 0L, index); }
    /// {@return `shaderInt16`}
    public int shaderInt16() { return shaderInt16(this.segment(), 0L); }
    /// Sets `shaderInt16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderInt16(MemorySegment segment, long index, int value) { VH_shaderInt16.set(segment, 0L, index, value); }
    /// Sets `shaderInt16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderInt16(int value) { shaderInt16(this.segment(), 0L, value); return this; }

    /// {@return `shaderResourceResidency` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderResourceResidency(MemorySegment segment, long index) { return (int) VH_shaderResourceResidency.get(segment, 0L, index); }
    /// {@return `shaderResourceResidency`}
    public int shaderResourceResidency() { return shaderResourceResidency(this.segment(), 0L); }
    /// Sets `shaderResourceResidency` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderResourceResidency(MemorySegment segment, long index, int value) { VH_shaderResourceResidency.set(segment, 0L, index, value); }
    /// Sets `shaderResourceResidency` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderResourceResidency(int value) { shaderResourceResidency(this.segment(), 0L, value); return this; }

    /// {@return `shaderResourceMinLod` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderResourceMinLod(MemorySegment segment, long index) { return (int) VH_shaderResourceMinLod.get(segment, 0L, index); }
    /// {@return `shaderResourceMinLod`}
    public int shaderResourceMinLod() { return shaderResourceMinLod(this.segment(), 0L); }
    /// Sets `shaderResourceMinLod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderResourceMinLod(MemorySegment segment, long index, int value) { VH_shaderResourceMinLod.set(segment, 0L, index, value); }
    /// Sets `shaderResourceMinLod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderResourceMinLod(int value) { shaderResourceMinLod(this.segment(), 0L, value); return this; }

    /// {@return `sparseBinding` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sparseBinding(MemorySegment segment, long index) { return (int) VH_sparseBinding.get(segment, 0L, index); }
    /// {@return `sparseBinding`}
    public int sparseBinding() { return sparseBinding(this.segment(), 0L); }
    /// Sets `sparseBinding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sparseBinding(MemorySegment segment, long index, int value) { VH_sparseBinding.set(segment, 0L, index, value); }
    /// Sets `sparseBinding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseBinding(int value) { sparseBinding(this.segment(), 0L, value); return this; }

    /// {@return `sparseResidencyBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sparseResidencyBuffer(MemorySegment segment, long index) { return (int) VH_sparseResidencyBuffer.get(segment, 0L, index); }
    /// {@return `sparseResidencyBuffer`}
    public int sparseResidencyBuffer() { return sparseResidencyBuffer(this.segment(), 0L); }
    /// Sets `sparseResidencyBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sparseResidencyBuffer(MemorySegment segment, long index, int value) { VH_sparseResidencyBuffer.set(segment, 0L, index, value); }
    /// Sets `sparseResidencyBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidencyBuffer(int value) { sparseResidencyBuffer(this.segment(), 0L, value); return this; }

    /// {@return `sparseResidencyImage2D` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sparseResidencyImage2D(MemorySegment segment, long index) { return (int) VH_sparseResidencyImage2D.get(segment, 0L, index); }
    /// {@return `sparseResidencyImage2D`}
    public int sparseResidencyImage2D() { return sparseResidencyImage2D(this.segment(), 0L); }
    /// Sets `sparseResidencyImage2D` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sparseResidencyImage2D(MemorySegment segment, long index, int value) { VH_sparseResidencyImage2D.set(segment, 0L, index, value); }
    /// Sets `sparseResidencyImage2D` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidencyImage2D(int value) { sparseResidencyImage2D(this.segment(), 0L, value); return this; }

    /// {@return `sparseResidencyImage3D` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sparseResidencyImage3D(MemorySegment segment, long index) { return (int) VH_sparseResidencyImage3D.get(segment, 0L, index); }
    /// {@return `sparseResidencyImage3D`}
    public int sparseResidencyImage3D() { return sparseResidencyImage3D(this.segment(), 0L); }
    /// Sets `sparseResidencyImage3D` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sparseResidencyImage3D(MemorySegment segment, long index, int value) { VH_sparseResidencyImage3D.set(segment, 0L, index, value); }
    /// Sets `sparseResidencyImage3D` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidencyImage3D(int value) { sparseResidencyImage3D(this.segment(), 0L, value); return this; }

    /// {@return `sparseResidency2Samples` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sparseResidency2Samples(MemorySegment segment, long index) { return (int) VH_sparseResidency2Samples.get(segment, 0L, index); }
    /// {@return `sparseResidency2Samples`}
    public int sparseResidency2Samples() { return sparseResidency2Samples(this.segment(), 0L); }
    /// Sets `sparseResidency2Samples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sparseResidency2Samples(MemorySegment segment, long index, int value) { VH_sparseResidency2Samples.set(segment, 0L, index, value); }
    /// Sets `sparseResidency2Samples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidency2Samples(int value) { sparseResidency2Samples(this.segment(), 0L, value); return this; }

    /// {@return `sparseResidency4Samples` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sparseResidency4Samples(MemorySegment segment, long index) { return (int) VH_sparseResidency4Samples.get(segment, 0L, index); }
    /// {@return `sparseResidency4Samples`}
    public int sparseResidency4Samples() { return sparseResidency4Samples(this.segment(), 0L); }
    /// Sets `sparseResidency4Samples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sparseResidency4Samples(MemorySegment segment, long index, int value) { VH_sparseResidency4Samples.set(segment, 0L, index, value); }
    /// Sets `sparseResidency4Samples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidency4Samples(int value) { sparseResidency4Samples(this.segment(), 0L, value); return this; }

    /// {@return `sparseResidency8Samples` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sparseResidency8Samples(MemorySegment segment, long index) { return (int) VH_sparseResidency8Samples.get(segment, 0L, index); }
    /// {@return `sparseResidency8Samples`}
    public int sparseResidency8Samples() { return sparseResidency8Samples(this.segment(), 0L); }
    /// Sets `sparseResidency8Samples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sparseResidency8Samples(MemorySegment segment, long index, int value) { VH_sparseResidency8Samples.set(segment, 0L, index, value); }
    /// Sets `sparseResidency8Samples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidency8Samples(int value) { sparseResidency8Samples(this.segment(), 0L, value); return this; }

    /// {@return `sparseResidency16Samples` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sparseResidency16Samples(MemorySegment segment, long index) { return (int) VH_sparseResidency16Samples.get(segment, 0L, index); }
    /// {@return `sparseResidency16Samples`}
    public int sparseResidency16Samples() { return sparseResidency16Samples(this.segment(), 0L); }
    /// Sets `sparseResidency16Samples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sparseResidency16Samples(MemorySegment segment, long index, int value) { VH_sparseResidency16Samples.set(segment, 0L, index, value); }
    /// Sets `sparseResidency16Samples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidency16Samples(int value) { sparseResidency16Samples(this.segment(), 0L, value); return this; }

    /// {@return `sparseResidencyAliased` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sparseResidencyAliased(MemorySegment segment, long index) { return (int) VH_sparseResidencyAliased.get(segment, 0L, index); }
    /// {@return `sparseResidencyAliased`}
    public int sparseResidencyAliased() { return sparseResidencyAliased(this.segment(), 0L); }
    /// Sets `sparseResidencyAliased` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sparseResidencyAliased(MemorySegment segment, long index, int value) { VH_sparseResidencyAliased.set(segment, 0L, index, value); }
    /// Sets `sparseResidencyAliased` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidencyAliased(int value) { sparseResidencyAliased(this.segment(), 0L, value); return this; }

    /// {@return `variableMultisampleRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int variableMultisampleRate(MemorySegment segment, long index) { return (int) VH_variableMultisampleRate.get(segment, 0L, index); }
    /// {@return `variableMultisampleRate`}
    public int variableMultisampleRate() { return variableMultisampleRate(this.segment(), 0L); }
    /// Sets `variableMultisampleRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void variableMultisampleRate(MemorySegment segment, long index, int value) { VH_variableMultisampleRate.set(segment, 0L, index, value); }
    /// Sets `variableMultisampleRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures variableMultisampleRate(int value) { variableMultisampleRate(this.segment(), 0L, value); return this; }

    /// {@return `inheritedQueries` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int inheritedQueries(MemorySegment segment, long index) { return (int) VH_inheritedQueries.get(segment, 0L, index); }
    /// {@return `inheritedQueries`}
    public int inheritedQueries() { return inheritedQueries(this.segment(), 0L); }
    /// Sets `inheritedQueries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void inheritedQueries(MemorySegment segment, long index, int value) { VH_inheritedQueries.set(segment, 0L, index, value); }
    /// Sets `inheritedQueries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures inheritedQueries(int value) { inheritedQueries(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceFeatures`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceFeatures`
    public VkPhysicalDeviceFeatures asSlice(long index) { return new VkPhysicalDeviceFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceFeatures`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceFeatures`
    public VkPhysicalDeviceFeatures asSlice(long index, long count) { return new VkPhysicalDeviceFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceFeatures` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceFeatures at(long index, Consumer<VkPhysicalDeviceFeatures> func) { func.accept(asSlice(index)); return this; }

    /// {@return `robustBufferAccess` at the given index}
    /// @param index the index of the struct buffer
    public int robustBufferAccessAt(long index) { return robustBufferAccess(this.segment(), index); }
    /// Sets `robustBufferAccess` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures robustBufferAccessAt(long index, int value) { robustBufferAccess(this.segment(), index, value); return this; }

    /// {@return `fullDrawIndexUint32` at the given index}
    /// @param index the index of the struct buffer
    public int fullDrawIndexUint32At(long index) { return fullDrawIndexUint32(this.segment(), index); }
    /// Sets `fullDrawIndexUint32` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures fullDrawIndexUint32At(long index, int value) { fullDrawIndexUint32(this.segment(), index, value); return this; }

    /// {@return `imageCubeArray` at the given index}
    /// @param index the index of the struct buffer
    public int imageCubeArrayAt(long index) { return imageCubeArray(this.segment(), index); }
    /// Sets `imageCubeArray` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures imageCubeArrayAt(long index, int value) { imageCubeArray(this.segment(), index, value); return this; }

    /// {@return `independentBlend` at the given index}
    /// @param index the index of the struct buffer
    public int independentBlendAt(long index) { return independentBlend(this.segment(), index); }
    /// Sets `independentBlend` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures independentBlendAt(long index, int value) { independentBlend(this.segment(), index, value); return this; }

    /// {@return `geometryShader` at the given index}
    /// @param index the index of the struct buffer
    public int geometryShaderAt(long index) { return geometryShader(this.segment(), index); }
    /// Sets `geometryShader` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures geometryShaderAt(long index, int value) { geometryShader(this.segment(), index, value); return this; }

    /// {@return `tessellationShader` at the given index}
    /// @param index the index of the struct buffer
    public int tessellationShaderAt(long index) { return tessellationShader(this.segment(), index); }
    /// Sets `tessellationShader` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures tessellationShaderAt(long index, int value) { tessellationShader(this.segment(), index, value); return this; }

    /// {@return `sampleRateShading` at the given index}
    /// @param index the index of the struct buffer
    public int sampleRateShadingAt(long index) { return sampleRateShading(this.segment(), index); }
    /// Sets `sampleRateShading` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sampleRateShadingAt(long index, int value) { sampleRateShading(this.segment(), index, value); return this; }

    /// {@return `dualSrcBlend` at the given index}
    /// @param index the index of the struct buffer
    public int dualSrcBlendAt(long index) { return dualSrcBlend(this.segment(), index); }
    /// Sets `dualSrcBlend` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures dualSrcBlendAt(long index, int value) { dualSrcBlend(this.segment(), index, value); return this; }

    /// {@return `logicOp` at the given index}
    /// @param index the index of the struct buffer
    public int logicOpAt(long index) { return logicOp(this.segment(), index); }
    /// Sets `logicOp` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures logicOpAt(long index, int value) { logicOp(this.segment(), index, value); return this; }

    /// {@return `multiDrawIndirect` at the given index}
    /// @param index the index of the struct buffer
    public int multiDrawIndirectAt(long index) { return multiDrawIndirect(this.segment(), index); }
    /// Sets `multiDrawIndirect` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures multiDrawIndirectAt(long index, int value) { multiDrawIndirect(this.segment(), index, value); return this; }

    /// {@return `drawIndirectFirstInstance` at the given index}
    /// @param index the index of the struct buffer
    public int drawIndirectFirstInstanceAt(long index) { return drawIndirectFirstInstance(this.segment(), index); }
    /// Sets `drawIndirectFirstInstance` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures drawIndirectFirstInstanceAt(long index, int value) { drawIndirectFirstInstance(this.segment(), index, value); return this; }

    /// {@return `depthClamp` at the given index}
    /// @param index the index of the struct buffer
    public int depthClampAt(long index) { return depthClamp(this.segment(), index); }
    /// Sets `depthClamp` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures depthClampAt(long index, int value) { depthClamp(this.segment(), index, value); return this; }

    /// {@return `depthBiasClamp` at the given index}
    /// @param index the index of the struct buffer
    public int depthBiasClampAt(long index) { return depthBiasClamp(this.segment(), index); }
    /// Sets `depthBiasClamp` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures depthBiasClampAt(long index, int value) { depthBiasClamp(this.segment(), index, value); return this; }

    /// {@return `fillModeNonSolid` at the given index}
    /// @param index the index of the struct buffer
    public int fillModeNonSolidAt(long index) { return fillModeNonSolid(this.segment(), index); }
    /// Sets `fillModeNonSolid` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures fillModeNonSolidAt(long index, int value) { fillModeNonSolid(this.segment(), index, value); return this; }

    /// {@return `depthBounds` at the given index}
    /// @param index the index of the struct buffer
    public int depthBoundsAt(long index) { return depthBounds(this.segment(), index); }
    /// Sets `depthBounds` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures depthBoundsAt(long index, int value) { depthBounds(this.segment(), index, value); return this; }

    /// {@return `wideLines` at the given index}
    /// @param index the index of the struct buffer
    public int wideLinesAt(long index) { return wideLines(this.segment(), index); }
    /// Sets `wideLines` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures wideLinesAt(long index, int value) { wideLines(this.segment(), index, value); return this; }

    /// {@return `largePoints` at the given index}
    /// @param index the index of the struct buffer
    public int largePointsAt(long index) { return largePoints(this.segment(), index); }
    /// Sets `largePoints` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures largePointsAt(long index, int value) { largePoints(this.segment(), index, value); return this; }

    /// {@return `alphaToOne` at the given index}
    /// @param index the index of the struct buffer
    public int alphaToOneAt(long index) { return alphaToOne(this.segment(), index); }
    /// Sets `alphaToOne` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures alphaToOneAt(long index, int value) { alphaToOne(this.segment(), index, value); return this; }

    /// {@return `multiViewport` at the given index}
    /// @param index the index of the struct buffer
    public int multiViewportAt(long index) { return multiViewport(this.segment(), index); }
    /// Sets `multiViewport` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures multiViewportAt(long index, int value) { multiViewport(this.segment(), index, value); return this; }

    /// {@return `samplerAnisotropy` at the given index}
    /// @param index the index of the struct buffer
    public int samplerAnisotropyAt(long index) { return samplerAnisotropy(this.segment(), index); }
    /// Sets `samplerAnisotropy` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures samplerAnisotropyAt(long index, int value) { samplerAnisotropy(this.segment(), index, value); return this; }

    /// {@return `textureCompressionETC2` at the given index}
    /// @param index the index of the struct buffer
    public int textureCompressionETC2At(long index) { return textureCompressionETC2(this.segment(), index); }
    /// Sets `textureCompressionETC2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures textureCompressionETC2At(long index, int value) { textureCompressionETC2(this.segment(), index, value); return this; }

    /// {@return `textureCompressionASTC_LDR` at the given index}
    /// @param index the index of the struct buffer
    public int textureCompressionASTC_LDRAt(long index) { return textureCompressionASTC_LDR(this.segment(), index); }
    /// Sets `textureCompressionASTC_LDR` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures textureCompressionASTC_LDRAt(long index, int value) { textureCompressionASTC_LDR(this.segment(), index, value); return this; }

    /// {@return `textureCompressionBC` at the given index}
    /// @param index the index of the struct buffer
    public int textureCompressionBCAt(long index) { return textureCompressionBC(this.segment(), index); }
    /// Sets `textureCompressionBC` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures textureCompressionBCAt(long index, int value) { textureCompressionBC(this.segment(), index, value); return this; }

    /// {@return `occlusionQueryPrecise` at the given index}
    /// @param index the index of the struct buffer
    public int occlusionQueryPreciseAt(long index) { return occlusionQueryPrecise(this.segment(), index); }
    /// Sets `occlusionQueryPrecise` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures occlusionQueryPreciseAt(long index, int value) { occlusionQueryPrecise(this.segment(), index, value); return this; }

    /// {@return `pipelineStatisticsQuery` at the given index}
    /// @param index the index of the struct buffer
    public int pipelineStatisticsQueryAt(long index) { return pipelineStatisticsQuery(this.segment(), index); }
    /// Sets `pipelineStatisticsQuery` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures pipelineStatisticsQueryAt(long index, int value) { pipelineStatisticsQuery(this.segment(), index, value); return this; }

    /// {@return `vertexPipelineStoresAndAtomics` at the given index}
    /// @param index the index of the struct buffer
    public int vertexPipelineStoresAndAtomicsAt(long index) { return vertexPipelineStoresAndAtomics(this.segment(), index); }
    /// Sets `vertexPipelineStoresAndAtomics` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures vertexPipelineStoresAndAtomicsAt(long index, int value) { vertexPipelineStoresAndAtomics(this.segment(), index, value); return this; }

    /// {@return `fragmentStoresAndAtomics` at the given index}
    /// @param index the index of the struct buffer
    public int fragmentStoresAndAtomicsAt(long index) { return fragmentStoresAndAtomics(this.segment(), index); }
    /// Sets `fragmentStoresAndAtomics` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures fragmentStoresAndAtomicsAt(long index, int value) { fragmentStoresAndAtomics(this.segment(), index, value); return this; }

    /// {@return `shaderTessellationAndGeometryPointSize` at the given index}
    /// @param index the index of the struct buffer
    public int shaderTessellationAndGeometryPointSizeAt(long index) { return shaderTessellationAndGeometryPointSize(this.segment(), index); }
    /// Sets `shaderTessellationAndGeometryPointSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderTessellationAndGeometryPointSizeAt(long index, int value) { shaderTessellationAndGeometryPointSize(this.segment(), index, value); return this; }

    /// {@return `shaderImageGatherExtended` at the given index}
    /// @param index the index of the struct buffer
    public int shaderImageGatherExtendedAt(long index) { return shaderImageGatherExtended(this.segment(), index); }
    /// Sets `shaderImageGatherExtended` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderImageGatherExtendedAt(long index, int value) { shaderImageGatherExtended(this.segment(), index, value); return this; }

    /// {@return `shaderStorageImageExtendedFormats` at the given index}
    /// @param index the index of the struct buffer
    public int shaderStorageImageExtendedFormatsAt(long index) { return shaderStorageImageExtendedFormats(this.segment(), index); }
    /// Sets `shaderStorageImageExtendedFormats` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageImageExtendedFormatsAt(long index, int value) { shaderStorageImageExtendedFormats(this.segment(), index, value); return this; }

    /// {@return `shaderStorageImageMultisample` at the given index}
    /// @param index the index of the struct buffer
    public int shaderStorageImageMultisampleAt(long index) { return shaderStorageImageMultisample(this.segment(), index); }
    /// Sets `shaderStorageImageMultisample` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageImageMultisampleAt(long index, int value) { shaderStorageImageMultisample(this.segment(), index, value); return this; }

    /// {@return `shaderStorageImageReadWithoutFormat` at the given index}
    /// @param index the index of the struct buffer
    public int shaderStorageImageReadWithoutFormatAt(long index) { return shaderStorageImageReadWithoutFormat(this.segment(), index); }
    /// Sets `shaderStorageImageReadWithoutFormat` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageImageReadWithoutFormatAt(long index, int value) { shaderStorageImageReadWithoutFormat(this.segment(), index, value); return this; }

    /// {@return `shaderStorageImageWriteWithoutFormat` at the given index}
    /// @param index the index of the struct buffer
    public int shaderStorageImageWriteWithoutFormatAt(long index) { return shaderStorageImageWriteWithoutFormat(this.segment(), index); }
    /// Sets `shaderStorageImageWriteWithoutFormat` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageImageWriteWithoutFormatAt(long index, int value) { shaderStorageImageWriteWithoutFormat(this.segment(), index, value); return this; }

    /// {@return `shaderUniformBufferArrayDynamicIndexing` at the given index}
    /// @param index the index of the struct buffer
    public int shaderUniformBufferArrayDynamicIndexingAt(long index) { return shaderUniformBufferArrayDynamicIndexing(this.segment(), index); }
    /// Sets `shaderUniformBufferArrayDynamicIndexing` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderUniformBufferArrayDynamicIndexingAt(long index, int value) { shaderUniformBufferArrayDynamicIndexing(this.segment(), index, value); return this; }

    /// {@return `shaderSampledImageArrayDynamicIndexing` at the given index}
    /// @param index the index of the struct buffer
    public int shaderSampledImageArrayDynamicIndexingAt(long index) { return shaderSampledImageArrayDynamicIndexing(this.segment(), index); }
    /// Sets `shaderSampledImageArrayDynamicIndexing` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderSampledImageArrayDynamicIndexingAt(long index, int value) { shaderSampledImageArrayDynamicIndexing(this.segment(), index, value); return this; }

    /// {@return `shaderStorageBufferArrayDynamicIndexing` at the given index}
    /// @param index the index of the struct buffer
    public int shaderStorageBufferArrayDynamicIndexingAt(long index) { return shaderStorageBufferArrayDynamicIndexing(this.segment(), index); }
    /// Sets `shaderStorageBufferArrayDynamicIndexing` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageBufferArrayDynamicIndexingAt(long index, int value) { shaderStorageBufferArrayDynamicIndexing(this.segment(), index, value); return this; }

    /// {@return `shaderStorageImageArrayDynamicIndexing` at the given index}
    /// @param index the index of the struct buffer
    public int shaderStorageImageArrayDynamicIndexingAt(long index) { return shaderStorageImageArrayDynamicIndexing(this.segment(), index); }
    /// Sets `shaderStorageImageArrayDynamicIndexing` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderStorageImageArrayDynamicIndexingAt(long index, int value) { shaderStorageImageArrayDynamicIndexing(this.segment(), index, value); return this; }

    /// {@return `shaderClipDistance` at the given index}
    /// @param index the index of the struct buffer
    public int shaderClipDistanceAt(long index) { return shaderClipDistance(this.segment(), index); }
    /// Sets `shaderClipDistance` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderClipDistanceAt(long index, int value) { shaderClipDistance(this.segment(), index, value); return this; }

    /// {@return `shaderCullDistance` at the given index}
    /// @param index the index of the struct buffer
    public int shaderCullDistanceAt(long index) { return shaderCullDistance(this.segment(), index); }
    /// Sets `shaderCullDistance` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderCullDistanceAt(long index, int value) { shaderCullDistance(this.segment(), index, value); return this; }

    /// {@return `shaderFloat64` at the given index}
    /// @param index the index of the struct buffer
    public int shaderFloat64At(long index) { return shaderFloat64(this.segment(), index); }
    /// Sets `shaderFloat64` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderFloat64At(long index, int value) { shaderFloat64(this.segment(), index, value); return this; }

    /// {@return `shaderInt64` at the given index}
    /// @param index the index of the struct buffer
    public int shaderInt64At(long index) { return shaderInt64(this.segment(), index); }
    /// Sets `shaderInt64` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderInt64At(long index, int value) { shaderInt64(this.segment(), index, value); return this; }

    /// {@return `shaderInt16` at the given index}
    /// @param index the index of the struct buffer
    public int shaderInt16At(long index) { return shaderInt16(this.segment(), index); }
    /// Sets `shaderInt16` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderInt16At(long index, int value) { shaderInt16(this.segment(), index, value); return this; }

    /// {@return `shaderResourceResidency` at the given index}
    /// @param index the index of the struct buffer
    public int shaderResourceResidencyAt(long index) { return shaderResourceResidency(this.segment(), index); }
    /// Sets `shaderResourceResidency` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderResourceResidencyAt(long index, int value) { shaderResourceResidency(this.segment(), index, value); return this; }

    /// {@return `shaderResourceMinLod` at the given index}
    /// @param index the index of the struct buffer
    public int shaderResourceMinLodAt(long index) { return shaderResourceMinLod(this.segment(), index); }
    /// Sets `shaderResourceMinLod` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures shaderResourceMinLodAt(long index, int value) { shaderResourceMinLod(this.segment(), index, value); return this; }

    /// {@return `sparseBinding` at the given index}
    /// @param index the index of the struct buffer
    public int sparseBindingAt(long index) { return sparseBinding(this.segment(), index); }
    /// Sets `sparseBinding` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseBindingAt(long index, int value) { sparseBinding(this.segment(), index, value); return this; }

    /// {@return `sparseResidencyBuffer` at the given index}
    /// @param index the index of the struct buffer
    public int sparseResidencyBufferAt(long index) { return sparseResidencyBuffer(this.segment(), index); }
    /// Sets `sparseResidencyBuffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidencyBufferAt(long index, int value) { sparseResidencyBuffer(this.segment(), index, value); return this; }

    /// {@return `sparseResidencyImage2D` at the given index}
    /// @param index the index of the struct buffer
    public int sparseResidencyImage2DAt(long index) { return sparseResidencyImage2D(this.segment(), index); }
    /// Sets `sparseResidencyImage2D` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidencyImage2DAt(long index, int value) { sparseResidencyImage2D(this.segment(), index, value); return this; }

    /// {@return `sparseResidencyImage3D` at the given index}
    /// @param index the index of the struct buffer
    public int sparseResidencyImage3DAt(long index) { return sparseResidencyImage3D(this.segment(), index); }
    /// Sets `sparseResidencyImage3D` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidencyImage3DAt(long index, int value) { sparseResidencyImage3D(this.segment(), index, value); return this; }

    /// {@return `sparseResidency2Samples` at the given index}
    /// @param index the index of the struct buffer
    public int sparseResidency2SamplesAt(long index) { return sparseResidency2Samples(this.segment(), index); }
    /// Sets `sparseResidency2Samples` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidency2SamplesAt(long index, int value) { sparseResidency2Samples(this.segment(), index, value); return this; }

    /// {@return `sparseResidency4Samples` at the given index}
    /// @param index the index of the struct buffer
    public int sparseResidency4SamplesAt(long index) { return sparseResidency4Samples(this.segment(), index); }
    /// Sets `sparseResidency4Samples` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidency4SamplesAt(long index, int value) { sparseResidency4Samples(this.segment(), index, value); return this; }

    /// {@return `sparseResidency8Samples` at the given index}
    /// @param index the index of the struct buffer
    public int sparseResidency8SamplesAt(long index) { return sparseResidency8Samples(this.segment(), index); }
    /// Sets `sparseResidency8Samples` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidency8SamplesAt(long index, int value) { sparseResidency8Samples(this.segment(), index, value); return this; }

    /// {@return `sparseResidency16Samples` at the given index}
    /// @param index the index of the struct buffer
    public int sparseResidency16SamplesAt(long index) { return sparseResidency16Samples(this.segment(), index); }
    /// Sets `sparseResidency16Samples` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidency16SamplesAt(long index, int value) { sparseResidency16Samples(this.segment(), index, value); return this; }

    /// {@return `sparseResidencyAliased` at the given index}
    /// @param index the index of the struct buffer
    public int sparseResidencyAliasedAt(long index) { return sparseResidencyAliased(this.segment(), index); }
    /// Sets `sparseResidencyAliased` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures sparseResidencyAliasedAt(long index, int value) { sparseResidencyAliased(this.segment(), index, value); return this; }

    /// {@return `variableMultisampleRate` at the given index}
    /// @param index the index of the struct buffer
    public int variableMultisampleRateAt(long index) { return variableMultisampleRate(this.segment(), index); }
    /// Sets `variableMultisampleRate` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures variableMultisampleRateAt(long index, int value) { variableMultisampleRate(this.segment(), index, value); return this; }

    /// {@return `inheritedQueries` at the given index}
    /// @param index the index of the struct buffer
    public int inheritedQueriesAt(long index) { return inheritedQueries(this.segment(), index); }
    /// Sets `inheritedQueries` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures inheritedQueriesAt(long index, int value) { inheritedQueries(this.segment(), index, value); return this; }

}
