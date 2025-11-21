// This file is auto-generated. DO NOT EDIT!
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
/// }
/// ```
public final class VkPhysicalDeviceFeatures extends GroupType {
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
    public static final long OFFSET_robustBufferAccess = LAYOUT.byteOffset(PathElement.groupElement("robustBufferAccess"));
    public static final long OFFSET_fullDrawIndexUint32 = LAYOUT.byteOffset(PathElement.groupElement("fullDrawIndexUint32"));
    public static final long OFFSET_imageCubeArray = LAYOUT.byteOffset(PathElement.groupElement("imageCubeArray"));
    public static final long OFFSET_independentBlend = LAYOUT.byteOffset(PathElement.groupElement("independentBlend"));
    public static final long OFFSET_geometryShader = LAYOUT.byteOffset(PathElement.groupElement("geometryShader"));
    public static final long OFFSET_tessellationShader = LAYOUT.byteOffset(PathElement.groupElement("tessellationShader"));
    public static final long OFFSET_sampleRateShading = LAYOUT.byteOffset(PathElement.groupElement("sampleRateShading"));
    public static final long OFFSET_dualSrcBlend = LAYOUT.byteOffset(PathElement.groupElement("dualSrcBlend"));
    public static final long OFFSET_logicOp = LAYOUT.byteOffset(PathElement.groupElement("logicOp"));
    public static final long OFFSET_multiDrawIndirect = LAYOUT.byteOffset(PathElement.groupElement("multiDrawIndirect"));
    public static final long OFFSET_drawIndirectFirstInstance = LAYOUT.byteOffset(PathElement.groupElement("drawIndirectFirstInstance"));
    public static final long OFFSET_depthClamp = LAYOUT.byteOffset(PathElement.groupElement("depthClamp"));
    public static final long OFFSET_depthBiasClamp = LAYOUT.byteOffset(PathElement.groupElement("depthBiasClamp"));
    public static final long OFFSET_fillModeNonSolid = LAYOUT.byteOffset(PathElement.groupElement("fillModeNonSolid"));
    public static final long OFFSET_depthBounds = LAYOUT.byteOffset(PathElement.groupElement("depthBounds"));
    public static final long OFFSET_wideLines = LAYOUT.byteOffset(PathElement.groupElement("wideLines"));
    public static final long OFFSET_largePoints = LAYOUT.byteOffset(PathElement.groupElement("largePoints"));
    public static final long OFFSET_alphaToOne = LAYOUT.byteOffset(PathElement.groupElement("alphaToOne"));
    public static final long OFFSET_multiViewport = LAYOUT.byteOffset(PathElement.groupElement("multiViewport"));
    public static final long OFFSET_samplerAnisotropy = LAYOUT.byteOffset(PathElement.groupElement("samplerAnisotropy"));
    public static final long OFFSET_textureCompressionETC2 = LAYOUT.byteOffset(PathElement.groupElement("textureCompressionETC2"));
    public static final long OFFSET_textureCompressionASTC_LDR = LAYOUT.byteOffset(PathElement.groupElement("textureCompressionASTC_LDR"));
    public static final long OFFSET_textureCompressionBC = LAYOUT.byteOffset(PathElement.groupElement("textureCompressionBC"));
    public static final long OFFSET_occlusionQueryPrecise = LAYOUT.byteOffset(PathElement.groupElement("occlusionQueryPrecise"));
    public static final long OFFSET_pipelineStatisticsQuery = LAYOUT.byteOffset(PathElement.groupElement("pipelineStatisticsQuery"));
    public static final long OFFSET_vertexPipelineStoresAndAtomics = LAYOUT.byteOffset(PathElement.groupElement("vertexPipelineStoresAndAtomics"));
    public static final long OFFSET_fragmentStoresAndAtomics = LAYOUT.byteOffset(PathElement.groupElement("fragmentStoresAndAtomics"));
    public static final long OFFSET_shaderTessellationAndGeometryPointSize = LAYOUT.byteOffset(PathElement.groupElement("shaderTessellationAndGeometryPointSize"));
    public static final long OFFSET_shaderImageGatherExtended = LAYOUT.byteOffset(PathElement.groupElement("shaderImageGatherExtended"));
    public static final long OFFSET_shaderStorageImageExtendedFormats = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageExtendedFormats"));
    public static final long OFFSET_shaderStorageImageMultisample = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageMultisample"));
    public static final long OFFSET_shaderStorageImageReadWithoutFormat = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageReadWithoutFormat"));
    public static final long OFFSET_shaderStorageImageWriteWithoutFormat = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageWriteWithoutFormat"));
    public static final long OFFSET_shaderUniformBufferArrayDynamicIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformBufferArrayDynamicIndexing"));
    public static final long OFFSET_shaderSampledImageArrayDynamicIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderSampledImageArrayDynamicIndexing"));
    public static final long OFFSET_shaderStorageBufferArrayDynamicIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageBufferArrayDynamicIndexing"));
    public static final long OFFSET_shaderStorageImageArrayDynamicIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageArrayDynamicIndexing"));
    public static final long OFFSET_shaderClipDistance = LAYOUT.byteOffset(PathElement.groupElement("shaderClipDistance"));
    public static final long OFFSET_shaderCullDistance = LAYOUT.byteOffset(PathElement.groupElement("shaderCullDistance"));
    public static final long OFFSET_shaderFloat64 = LAYOUT.byteOffset(PathElement.groupElement("shaderFloat64"));
    public static final long OFFSET_shaderInt64 = LAYOUT.byteOffset(PathElement.groupElement("shaderInt64"));
    public static final long OFFSET_shaderInt16 = LAYOUT.byteOffset(PathElement.groupElement("shaderInt16"));
    public static final long OFFSET_shaderResourceResidency = LAYOUT.byteOffset(PathElement.groupElement("shaderResourceResidency"));
    public static final long OFFSET_shaderResourceMinLod = LAYOUT.byteOffset(PathElement.groupElement("shaderResourceMinLod"));
    public static final long OFFSET_sparseBinding = LAYOUT.byteOffset(PathElement.groupElement("sparseBinding"));
    public static final long OFFSET_sparseResidencyBuffer = LAYOUT.byteOffset(PathElement.groupElement("sparseResidencyBuffer"));
    public static final long OFFSET_sparseResidencyImage2D = LAYOUT.byteOffset(PathElement.groupElement("sparseResidencyImage2D"));
    public static final long OFFSET_sparseResidencyImage3D = LAYOUT.byteOffset(PathElement.groupElement("sparseResidencyImage3D"));
    public static final long OFFSET_sparseResidency2Samples = LAYOUT.byteOffset(PathElement.groupElement("sparseResidency2Samples"));
    public static final long OFFSET_sparseResidency4Samples = LAYOUT.byteOffset(PathElement.groupElement("sparseResidency4Samples"));
    public static final long OFFSET_sparseResidency8Samples = LAYOUT.byteOffset(PathElement.groupElement("sparseResidency8Samples"));
    public static final long OFFSET_sparseResidency16Samples = LAYOUT.byteOffset(PathElement.groupElement("sparseResidency16Samples"));
    public static final long OFFSET_sparseResidencyAliased = LAYOUT.byteOffset(PathElement.groupElement("sparseResidencyAliased"));
    public static final long OFFSET_variableMultisampleRate = LAYOUT.byteOffset(PathElement.groupElement("variableMultisampleRate"));
    public static final long OFFSET_inheritedQueries = LAYOUT.byteOffset(PathElement.groupElement("inheritedQueries"));
    public static final MemoryLayout LAYOUT_robustBufferAccess = LAYOUT.select(PathElement.groupElement("robustBufferAccess"));
    public static final MemoryLayout LAYOUT_fullDrawIndexUint32 = LAYOUT.select(PathElement.groupElement("fullDrawIndexUint32"));
    public static final MemoryLayout LAYOUT_imageCubeArray = LAYOUT.select(PathElement.groupElement("imageCubeArray"));
    public static final MemoryLayout LAYOUT_independentBlend = LAYOUT.select(PathElement.groupElement("independentBlend"));
    public static final MemoryLayout LAYOUT_geometryShader = LAYOUT.select(PathElement.groupElement("geometryShader"));
    public static final MemoryLayout LAYOUT_tessellationShader = LAYOUT.select(PathElement.groupElement("tessellationShader"));
    public static final MemoryLayout LAYOUT_sampleRateShading = LAYOUT.select(PathElement.groupElement("sampleRateShading"));
    public static final MemoryLayout LAYOUT_dualSrcBlend = LAYOUT.select(PathElement.groupElement("dualSrcBlend"));
    public static final MemoryLayout LAYOUT_logicOp = LAYOUT.select(PathElement.groupElement("logicOp"));
    public static final MemoryLayout LAYOUT_multiDrawIndirect = LAYOUT.select(PathElement.groupElement("multiDrawIndirect"));
    public static final MemoryLayout LAYOUT_drawIndirectFirstInstance = LAYOUT.select(PathElement.groupElement("drawIndirectFirstInstance"));
    public static final MemoryLayout LAYOUT_depthClamp = LAYOUT.select(PathElement.groupElement("depthClamp"));
    public static final MemoryLayout LAYOUT_depthBiasClamp = LAYOUT.select(PathElement.groupElement("depthBiasClamp"));
    public static final MemoryLayout LAYOUT_fillModeNonSolid = LAYOUT.select(PathElement.groupElement("fillModeNonSolid"));
    public static final MemoryLayout LAYOUT_depthBounds = LAYOUT.select(PathElement.groupElement("depthBounds"));
    public static final MemoryLayout LAYOUT_wideLines = LAYOUT.select(PathElement.groupElement("wideLines"));
    public static final MemoryLayout LAYOUT_largePoints = LAYOUT.select(PathElement.groupElement("largePoints"));
    public static final MemoryLayout LAYOUT_alphaToOne = LAYOUT.select(PathElement.groupElement("alphaToOne"));
    public static final MemoryLayout LAYOUT_multiViewport = LAYOUT.select(PathElement.groupElement("multiViewport"));
    public static final MemoryLayout LAYOUT_samplerAnisotropy = LAYOUT.select(PathElement.groupElement("samplerAnisotropy"));
    public static final MemoryLayout LAYOUT_textureCompressionETC2 = LAYOUT.select(PathElement.groupElement("textureCompressionETC2"));
    public static final MemoryLayout LAYOUT_textureCompressionASTC_LDR = LAYOUT.select(PathElement.groupElement("textureCompressionASTC_LDR"));
    public static final MemoryLayout LAYOUT_textureCompressionBC = LAYOUT.select(PathElement.groupElement("textureCompressionBC"));
    public static final MemoryLayout LAYOUT_occlusionQueryPrecise = LAYOUT.select(PathElement.groupElement("occlusionQueryPrecise"));
    public static final MemoryLayout LAYOUT_pipelineStatisticsQuery = LAYOUT.select(PathElement.groupElement("pipelineStatisticsQuery"));
    public static final MemoryLayout LAYOUT_vertexPipelineStoresAndAtomics = LAYOUT.select(PathElement.groupElement("vertexPipelineStoresAndAtomics"));
    public static final MemoryLayout LAYOUT_fragmentStoresAndAtomics = LAYOUT.select(PathElement.groupElement("fragmentStoresAndAtomics"));
    public static final MemoryLayout LAYOUT_shaderTessellationAndGeometryPointSize = LAYOUT.select(PathElement.groupElement("shaderTessellationAndGeometryPointSize"));
    public static final MemoryLayout LAYOUT_shaderImageGatherExtended = LAYOUT.select(PathElement.groupElement("shaderImageGatherExtended"));
    public static final MemoryLayout LAYOUT_shaderStorageImageExtendedFormats = LAYOUT.select(PathElement.groupElement("shaderStorageImageExtendedFormats"));
    public static final MemoryLayout LAYOUT_shaderStorageImageMultisample = LAYOUT.select(PathElement.groupElement("shaderStorageImageMultisample"));
    public static final MemoryLayout LAYOUT_shaderStorageImageReadWithoutFormat = LAYOUT.select(PathElement.groupElement("shaderStorageImageReadWithoutFormat"));
    public static final MemoryLayout LAYOUT_shaderStorageImageWriteWithoutFormat = LAYOUT.select(PathElement.groupElement("shaderStorageImageWriteWithoutFormat"));
    public static final MemoryLayout LAYOUT_shaderUniformBufferArrayDynamicIndexing = LAYOUT.select(PathElement.groupElement("shaderUniformBufferArrayDynamicIndexing"));
    public static final MemoryLayout LAYOUT_shaderSampledImageArrayDynamicIndexing = LAYOUT.select(PathElement.groupElement("shaderSampledImageArrayDynamicIndexing"));
    public static final MemoryLayout LAYOUT_shaderStorageBufferArrayDynamicIndexing = LAYOUT.select(PathElement.groupElement("shaderStorageBufferArrayDynamicIndexing"));
    public static final MemoryLayout LAYOUT_shaderStorageImageArrayDynamicIndexing = LAYOUT.select(PathElement.groupElement("shaderStorageImageArrayDynamicIndexing"));
    public static final MemoryLayout LAYOUT_shaderClipDistance = LAYOUT.select(PathElement.groupElement("shaderClipDistance"));
    public static final MemoryLayout LAYOUT_shaderCullDistance = LAYOUT.select(PathElement.groupElement("shaderCullDistance"));
    public static final MemoryLayout LAYOUT_shaderFloat64 = LAYOUT.select(PathElement.groupElement("shaderFloat64"));
    public static final MemoryLayout LAYOUT_shaderInt64 = LAYOUT.select(PathElement.groupElement("shaderInt64"));
    public static final MemoryLayout LAYOUT_shaderInt16 = LAYOUT.select(PathElement.groupElement("shaderInt16"));
    public static final MemoryLayout LAYOUT_shaderResourceResidency = LAYOUT.select(PathElement.groupElement("shaderResourceResidency"));
    public static final MemoryLayout LAYOUT_shaderResourceMinLod = LAYOUT.select(PathElement.groupElement("shaderResourceMinLod"));
    public static final MemoryLayout LAYOUT_sparseBinding = LAYOUT.select(PathElement.groupElement("sparseBinding"));
    public static final MemoryLayout LAYOUT_sparseResidencyBuffer = LAYOUT.select(PathElement.groupElement("sparseResidencyBuffer"));
    public static final MemoryLayout LAYOUT_sparseResidencyImage2D = LAYOUT.select(PathElement.groupElement("sparseResidencyImage2D"));
    public static final MemoryLayout LAYOUT_sparseResidencyImage3D = LAYOUT.select(PathElement.groupElement("sparseResidencyImage3D"));
    public static final MemoryLayout LAYOUT_sparseResidency2Samples = LAYOUT.select(PathElement.groupElement("sparseResidency2Samples"));
    public static final MemoryLayout LAYOUT_sparseResidency4Samples = LAYOUT.select(PathElement.groupElement("sparseResidency4Samples"));
    public static final MemoryLayout LAYOUT_sparseResidency8Samples = LAYOUT.select(PathElement.groupElement("sparseResidency8Samples"));
    public static final MemoryLayout LAYOUT_sparseResidency16Samples = LAYOUT.select(PathElement.groupElement("sparseResidency16Samples"));
    public static final MemoryLayout LAYOUT_sparseResidencyAliased = LAYOUT.select(PathElement.groupElement("sparseResidencyAliased"));
    public static final MemoryLayout LAYOUT_variableMultisampleRate = LAYOUT.select(PathElement.groupElement("variableMultisampleRate"));
    public static final MemoryLayout LAYOUT_inheritedQueries = LAYOUT.select(PathElement.groupElement("inheritedQueries"));
    public static final VarHandle VH_robustBufferAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustBufferAccess"));
    public static final VarHandle VH_fullDrawIndexUint32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fullDrawIndexUint32"));
    public static final VarHandle VH_imageCubeArray = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCubeArray"));
    public static final VarHandle VH_independentBlend = LAYOUT.arrayElementVarHandle(PathElement.groupElement("independentBlend"));
    public static final VarHandle VH_geometryShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometryShader"));
    public static final VarHandle VH_tessellationShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tessellationShader"));
    public static final VarHandle VH_sampleRateShading = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleRateShading"));
    public static final VarHandle VH_dualSrcBlend = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dualSrcBlend"));
    public static final VarHandle VH_logicOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("logicOp"));
    public static final VarHandle VH_multiDrawIndirect = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiDrawIndirect"));
    public static final VarHandle VH_drawIndirectFirstInstance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drawIndirectFirstInstance"));
    public static final VarHandle VH_depthClamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthClamp"));
    public static final VarHandle VH_depthBiasClamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasClamp"));
    public static final VarHandle VH_fillModeNonSolid = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fillModeNonSolid"));
    public static final VarHandle VH_depthBounds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBounds"));
    public static final VarHandle VH_wideLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("wideLines"));
    public static final VarHandle VH_largePoints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("largePoints"));
    public static final VarHandle VH_alphaToOne = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alphaToOne"));
    public static final VarHandle VH_multiViewport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiViewport"));
    public static final VarHandle VH_samplerAnisotropy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerAnisotropy"));
    public static final VarHandle VH_textureCompressionETC2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("textureCompressionETC2"));
    public static final VarHandle VH_textureCompressionASTC_LDR = LAYOUT.arrayElementVarHandle(PathElement.groupElement("textureCompressionASTC_LDR"));
    public static final VarHandle VH_textureCompressionBC = LAYOUT.arrayElementVarHandle(PathElement.groupElement("textureCompressionBC"));
    public static final VarHandle VH_occlusionQueryPrecise = LAYOUT.arrayElementVarHandle(PathElement.groupElement("occlusionQueryPrecise"));
    public static final VarHandle VH_pipelineStatisticsQuery = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineStatisticsQuery"));
    public static final VarHandle VH_vertexPipelineStoresAndAtomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexPipelineStoresAndAtomics"));
    public static final VarHandle VH_fragmentStoresAndAtomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentStoresAndAtomics"));
    public static final VarHandle VH_shaderTessellationAndGeometryPointSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTessellationAndGeometryPointSize"));
    public static final VarHandle VH_shaderImageGatherExtended = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderImageGatherExtended"));
    public static final VarHandle VH_shaderStorageImageExtendedFormats = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageExtendedFormats"));
    public static final VarHandle VH_shaderStorageImageMultisample = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageMultisample"));
    public static final VarHandle VH_shaderStorageImageReadWithoutFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageReadWithoutFormat"));
    public static final VarHandle VH_shaderStorageImageWriteWithoutFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageWriteWithoutFormat"));
    public static final VarHandle VH_shaderUniformBufferArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderUniformBufferArrayDynamicIndexing"));
    public static final VarHandle VH_shaderSampledImageArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSampledImageArrayDynamicIndexing"));
    public static final VarHandle VH_shaderStorageBufferArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageBufferArrayDynamicIndexing"));
    public static final VarHandle VH_shaderStorageImageArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageArrayDynamicIndexing"));
    public static final VarHandle VH_shaderClipDistance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderClipDistance"));
    public static final VarHandle VH_shaderCullDistance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderCullDistance"));
    public static final VarHandle VH_shaderFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFloat64"));
    public static final VarHandle VH_shaderInt64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInt64"));
    public static final VarHandle VH_shaderInt16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInt16"));
    public static final VarHandle VH_shaderResourceResidency = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderResourceResidency"));
    public static final VarHandle VH_shaderResourceMinLod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderResourceMinLod"));
    public static final VarHandle VH_sparseBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseBinding"));
    public static final VarHandle VH_sparseResidencyBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidencyBuffer"));
    public static final VarHandle VH_sparseResidencyImage2D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidencyImage2D"));
    public static final VarHandle VH_sparseResidencyImage3D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidencyImage3D"));
    public static final VarHandle VH_sparseResidency2Samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidency2Samples"));
    public static final VarHandle VH_sparseResidency4Samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidency4Samples"));
    public static final VarHandle VH_sparseResidency8Samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidency8Samples"));
    public static final VarHandle VH_sparseResidency16Samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidency16Samples"));
    public static final VarHandle VH_sparseResidencyAliased = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseResidencyAliased"));
    public static final VarHandle VH_variableMultisampleRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("variableMultisampleRate"));
    public static final VarHandle VH_inheritedQueries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inheritedQueries"));

    public VkPhysicalDeviceFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFeatures(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFeatures(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFeatures(allocator.allocate(LAYOUT, count), count); }
    public VkPhysicalDeviceFeatures copyFrom(VkPhysicalDeviceFeatures src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceFeatures reinterpret(long count) { return new VkPhysicalDeviceFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceFeatures asSlice(long index) { return new VkPhysicalDeviceFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceFeatures asSlice(long index, long count) { return new VkPhysicalDeviceFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceFeatures at(long index, Consumer<VkPhysicalDeviceFeatures> func) { func.accept(asSlice(index)); return this; }
    public int robustBufferAccessAt(long index) { return (int) VH_robustBufferAccess.get(this.segment(), 0L, index); }
    public int fullDrawIndexUint32At(long index) { return (int) VH_fullDrawIndexUint32.get(this.segment(), 0L, index); }
    public int imageCubeArrayAt(long index) { return (int) VH_imageCubeArray.get(this.segment(), 0L, index); }
    public int independentBlendAt(long index) { return (int) VH_independentBlend.get(this.segment(), 0L, index); }
    public int geometryShaderAt(long index) { return (int) VH_geometryShader.get(this.segment(), 0L, index); }
    public int tessellationShaderAt(long index) { return (int) VH_tessellationShader.get(this.segment(), 0L, index); }
    public int sampleRateShadingAt(long index) { return (int) VH_sampleRateShading.get(this.segment(), 0L, index); }
    public int dualSrcBlendAt(long index) { return (int) VH_dualSrcBlend.get(this.segment(), 0L, index); }
    public int logicOpAt(long index) { return (int) VH_logicOp.get(this.segment(), 0L, index); }
    public int multiDrawIndirectAt(long index) { return (int) VH_multiDrawIndirect.get(this.segment(), 0L, index); }
    public int drawIndirectFirstInstanceAt(long index) { return (int) VH_drawIndirectFirstInstance.get(this.segment(), 0L, index); }
    public int depthClampAt(long index) { return (int) VH_depthClamp.get(this.segment(), 0L, index); }
    public int depthBiasClampAt(long index) { return (int) VH_depthBiasClamp.get(this.segment(), 0L, index); }
    public int fillModeNonSolidAt(long index) { return (int) VH_fillModeNonSolid.get(this.segment(), 0L, index); }
    public int depthBoundsAt(long index) { return (int) VH_depthBounds.get(this.segment(), 0L, index); }
    public int wideLinesAt(long index) { return (int) VH_wideLines.get(this.segment(), 0L, index); }
    public int largePointsAt(long index) { return (int) VH_largePoints.get(this.segment(), 0L, index); }
    public int alphaToOneAt(long index) { return (int) VH_alphaToOne.get(this.segment(), 0L, index); }
    public int multiViewportAt(long index) { return (int) VH_multiViewport.get(this.segment(), 0L, index); }
    public int samplerAnisotropyAt(long index) { return (int) VH_samplerAnisotropy.get(this.segment(), 0L, index); }
    public int textureCompressionETC2At(long index) { return (int) VH_textureCompressionETC2.get(this.segment(), 0L, index); }
    public int textureCompressionASTC_LDRAt(long index) { return (int) VH_textureCompressionASTC_LDR.get(this.segment(), 0L, index); }
    public int textureCompressionBCAt(long index) { return (int) VH_textureCompressionBC.get(this.segment(), 0L, index); }
    public int occlusionQueryPreciseAt(long index) { return (int) VH_occlusionQueryPrecise.get(this.segment(), 0L, index); }
    public int pipelineStatisticsQueryAt(long index) { return (int) VH_pipelineStatisticsQuery.get(this.segment(), 0L, index); }
    public int vertexPipelineStoresAndAtomicsAt(long index) { return (int) VH_vertexPipelineStoresAndAtomics.get(this.segment(), 0L, index); }
    public int fragmentStoresAndAtomicsAt(long index) { return (int) VH_fragmentStoresAndAtomics.get(this.segment(), 0L, index); }
    public int shaderTessellationAndGeometryPointSizeAt(long index) { return (int) VH_shaderTessellationAndGeometryPointSize.get(this.segment(), 0L, index); }
    public int shaderImageGatherExtendedAt(long index) { return (int) VH_shaderImageGatherExtended.get(this.segment(), 0L, index); }
    public int shaderStorageImageExtendedFormatsAt(long index) { return (int) VH_shaderStorageImageExtendedFormats.get(this.segment(), 0L, index); }
    public int shaderStorageImageMultisampleAt(long index) { return (int) VH_shaderStorageImageMultisample.get(this.segment(), 0L, index); }
    public int shaderStorageImageReadWithoutFormatAt(long index) { return (int) VH_shaderStorageImageReadWithoutFormat.get(this.segment(), 0L, index); }
    public int shaderStorageImageWriteWithoutFormatAt(long index) { return (int) VH_shaderStorageImageWriteWithoutFormat.get(this.segment(), 0L, index); }
    public int shaderUniformBufferArrayDynamicIndexingAt(long index) { return (int) VH_shaderUniformBufferArrayDynamicIndexing.get(this.segment(), 0L, index); }
    public int shaderSampledImageArrayDynamicIndexingAt(long index) { return (int) VH_shaderSampledImageArrayDynamicIndexing.get(this.segment(), 0L, index); }
    public int shaderStorageBufferArrayDynamicIndexingAt(long index) { return (int) VH_shaderStorageBufferArrayDynamicIndexing.get(this.segment(), 0L, index); }
    public int shaderStorageImageArrayDynamicIndexingAt(long index) { return (int) VH_shaderStorageImageArrayDynamicIndexing.get(this.segment(), 0L, index); }
    public int shaderClipDistanceAt(long index) { return (int) VH_shaderClipDistance.get(this.segment(), 0L, index); }
    public int shaderCullDistanceAt(long index) { return (int) VH_shaderCullDistance.get(this.segment(), 0L, index); }
    public int shaderFloat64At(long index) { return (int) VH_shaderFloat64.get(this.segment(), 0L, index); }
    public int shaderInt64At(long index) { return (int) VH_shaderInt64.get(this.segment(), 0L, index); }
    public int shaderInt16At(long index) { return (int) VH_shaderInt16.get(this.segment(), 0L, index); }
    public int shaderResourceResidencyAt(long index) { return (int) VH_shaderResourceResidency.get(this.segment(), 0L, index); }
    public int shaderResourceMinLodAt(long index) { return (int) VH_shaderResourceMinLod.get(this.segment(), 0L, index); }
    public int sparseBindingAt(long index) { return (int) VH_sparseBinding.get(this.segment(), 0L, index); }
    public int sparseResidencyBufferAt(long index) { return (int) VH_sparseResidencyBuffer.get(this.segment(), 0L, index); }
    public int sparseResidencyImage2DAt(long index) { return (int) VH_sparseResidencyImage2D.get(this.segment(), 0L, index); }
    public int sparseResidencyImage3DAt(long index) { return (int) VH_sparseResidencyImage3D.get(this.segment(), 0L, index); }
    public int sparseResidency2SamplesAt(long index) { return (int) VH_sparseResidency2Samples.get(this.segment(), 0L, index); }
    public int sparseResidency4SamplesAt(long index) { return (int) VH_sparseResidency4Samples.get(this.segment(), 0L, index); }
    public int sparseResidency8SamplesAt(long index) { return (int) VH_sparseResidency8Samples.get(this.segment(), 0L, index); }
    public int sparseResidency16SamplesAt(long index) { return (int) VH_sparseResidency16Samples.get(this.segment(), 0L, index); }
    public int sparseResidencyAliasedAt(long index) { return (int) VH_sparseResidencyAliased.get(this.segment(), 0L, index); }
    public int variableMultisampleRateAt(long index) { return (int) VH_variableMultisampleRate.get(this.segment(), 0L, index); }
    public int inheritedQueriesAt(long index) { return (int) VH_inheritedQueries.get(this.segment(), 0L, index); }
    public int robustBufferAccess() { return (int) VH_robustBufferAccess.get(this.segment(), 0L, 0L); }
    public int fullDrawIndexUint32() { return (int) VH_fullDrawIndexUint32.get(this.segment(), 0L, 0L); }
    public int imageCubeArray() { return (int) VH_imageCubeArray.get(this.segment(), 0L, 0L); }
    public int independentBlend() { return (int) VH_independentBlend.get(this.segment(), 0L, 0L); }
    public int geometryShader() { return (int) VH_geometryShader.get(this.segment(), 0L, 0L); }
    public int tessellationShader() { return (int) VH_tessellationShader.get(this.segment(), 0L, 0L); }
    public int sampleRateShading() { return (int) VH_sampleRateShading.get(this.segment(), 0L, 0L); }
    public int dualSrcBlend() { return (int) VH_dualSrcBlend.get(this.segment(), 0L, 0L); }
    public int logicOp() { return (int) VH_logicOp.get(this.segment(), 0L, 0L); }
    public int multiDrawIndirect() { return (int) VH_multiDrawIndirect.get(this.segment(), 0L, 0L); }
    public int drawIndirectFirstInstance() { return (int) VH_drawIndirectFirstInstance.get(this.segment(), 0L, 0L); }
    public int depthClamp() { return (int) VH_depthClamp.get(this.segment(), 0L, 0L); }
    public int depthBiasClamp() { return (int) VH_depthBiasClamp.get(this.segment(), 0L, 0L); }
    public int fillModeNonSolid() { return (int) VH_fillModeNonSolid.get(this.segment(), 0L, 0L); }
    public int depthBounds() { return (int) VH_depthBounds.get(this.segment(), 0L, 0L); }
    public int wideLines() { return (int) VH_wideLines.get(this.segment(), 0L, 0L); }
    public int largePoints() { return (int) VH_largePoints.get(this.segment(), 0L, 0L); }
    public int alphaToOne() { return (int) VH_alphaToOne.get(this.segment(), 0L, 0L); }
    public int multiViewport() { return (int) VH_multiViewport.get(this.segment(), 0L, 0L); }
    public int samplerAnisotropy() { return (int) VH_samplerAnisotropy.get(this.segment(), 0L, 0L); }
    public int textureCompressionETC2() { return (int) VH_textureCompressionETC2.get(this.segment(), 0L, 0L); }
    public int textureCompressionASTC_LDR() { return (int) VH_textureCompressionASTC_LDR.get(this.segment(), 0L, 0L); }
    public int textureCompressionBC() { return (int) VH_textureCompressionBC.get(this.segment(), 0L, 0L); }
    public int occlusionQueryPrecise() { return (int) VH_occlusionQueryPrecise.get(this.segment(), 0L, 0L); }
    public int pipelineStatisticsQuery() { return (int) VH_pipelineStatisticsQuery.get(this.segment(), 0L, 0L); }
    public int vertexPipelineStoresAndAtomics() { return (int) VH_vertexPipelineStoresAndAtomics.get(this.segment(), 0L, 0L); }
    public int fragmentStoresAndAtomics() { return (int) VH_fragmentStoresAndAtomics.get(this.segment(), 0L, 0L); }
    public int shaderTessellationAndGeometryPointSize() { return (int) VH_shaderTessellationAndGeometryPointSize.get(this.segment(), 0L, 0L); }
    public int shaderImageGatherExtended() { return (int) VH_shaderImageGatherExtended.get(this.segment(), 0L, 0L); }
    public int shaderStorageImageExtendedFormats() { return (int) VH_shaderStorageImageExtendedFormats.get(this.segment(), 0L, 0L); }
    public int shaderStorageImageMultisample() { return (int) VH_shaderStorageImageMultisample.get(this.segment(), 0L, 0L); }
    public int shaderStorageImageReadWithoutFormat() { return (int) VH_shaderStorageImageReadWithoutFormat.get(this.segment(), 0L, 0L); }
    public int shaderStorageImageWriteWithoutFormat() { return (int) VH_shaderStorageImageWriteWithoutFormat.get(this.segment(), 0L, 0L); }
    public int shaderUniformBufferArrayDynamicIndexing() { return (int) VH_shaderUniformBufferArrayDynamicIndexing.get(this.segment(), 0L, 0L); }
    public int shaderSampledImageArrayDynamicIndexing() { return (int) VH_shaderSampledImageArrayDynamicIndexing.get(this.segment(), 0L, 0L); }
    public int shaderStorageBufferArrayDynamicIndexing() { return (int) VH_shaderStorageBufferArrayDynamicIndexing.get(this.segment(), 0L, 0L); }
    public int shaderStorageImageArrayDynamicIndexing() { return (int) VH_shaderStorageImageArrayDynamicIndexing.get(this.segment(), 0L, 0L); }
    public int shaderClipDistance() { return (int) VH_shaderClipDistance.get(this.segment(), 0L, 0L); }
    public int shaderCullDistance() { return (int) VH_shaderCullDistance.get(this.segment(), 0L, 0L); }
    public int shaderFloat64() { return (int) VH_shaderFloat64.get(this.segment(), 0L, 0L); }
    public int shaderInt64() { return (int) VH_shaderInt64.get(this.segment(), 0L, 0L); }
    public int shaderInt16() { return (int) VH_shaderInt16.get(this.segment(), 0L, 0L); }
    public int shaderResourceResidency() { return (int) VH_shaderResourceResidency.get(this.segment(), 0L, 0L); }
    public int shaderResourceMinLod() { return (int) VH_shaderResourceMinLod.get(this.segment(), 0L, 0L); }
    public int sparseBinding() { return (int) VH_sparseBinding.get(this.segment(), 0L, 0L); }
    public int sparseResidencyBuffer() { return (int) VH_sparseResidencyBuffer.get(this.segment(), 0L, 0L); }
    public int sparseResidencyImage2D() { return (int) VH_sparseResidencyImage2D.get(this.segment(), 0L, 0L); }
    public int sparseResidencyImage3D() { return (int) VH_sparseResidencyImage3D.get(this.segment(), 0L, 0L); }
    public int sparseResidency2Samples() { return (int) VH_sparseResidency2Samples.get(this.segment(), 0L, 0L); }
    public int sparseResidency4Samples() { return (int) VH_sparseResidency4Samples.get(this.segment(), 0L, 0L); }
    public int sparseResidency8Samples() { return (int) VH_sparseResidency8Samples.get(this.segment(), 0L, 0L); }
    public int sparseResidency16Samples() { return (int) VH_sparseResidency16Samples.get(this.segment(), 0L, 0L); }
    public int sparseResidencyAliased() { return (int) VH_sparseResidencyAliased.get(this.segment(), 0L, 0L); }
    public int variableMultisampleRate() { return (int) VH_variableMultisampleRate.get(this.segment(), 0L, 0L); }
    public int inheritedQueries() { return (int) VH_inheritedQueries.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceFeatures robustBufferAccessAt(long index, int value) { VH_robustBufferAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures fullDrawIndexUint32At(long index, int value) { VH_fullDrawIndexUint32.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures imageCubeArrayAt(long index, int value) { VH_imageCubeArray.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures independentBlendAt(long index, int value) { VH_independentBlend.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures geometryShaderAt(long index, int value) { VH_geometryShader.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures tessellationShaderAt(long index, int value) { VH_tessellationShader.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures sampleRateShadingAt(long index, int value) { VH_sampleRateShading.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures dualSrcBlendAt(long index, int value) { VH_dualSrcBlend.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures logicOpAt(long index, int value) { VH_logicOp.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures multiDrawIndirectAt(long index, int value) { VH_multiDrawIndirect.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures drawIndirectFirstInstanceAt(long index, int value) { VH_drawIndirectFirstInstance.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures depthClampAt(long index, int value) { VH_depthClamp.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures depthBiasClampAt(long index, int value) { VH_depthBiasClamp.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures fillModeNonSolidAt(long index, int value) { VH_fillModeNonSolid.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures depthBoundsAt(long index, int value) { VH_depthBounds.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures wideLinesAt(long index, int value) { VH_wideLines.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures largePointsAt(long index, int value) { VH_largePoints.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures alphaToOneAt(long index, int value) { VH_alphaToOne.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures multiViewportAt(long index, int value) { VH_multiViewport.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures samplerAnisotropyAt(long index, int value) { VH_samplerAnisotropy.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures textureCompressionETC2At(long index, int value) { VH_textureCompressionETC2.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures textureCompressionASTC_LDRAt(long index, int value) { VH_textureCompressionASTC_LDR.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures textureCompressionBCAt(long index, int value) { VH_textureCompressionBC.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures occlusionQueryPreciseAt(long index, int value) { VH_occlusionQueryPrecise.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures pipelineStatisticsQueryAt(long index, int value) { VH_pipelineStatisticsQuery.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures vertexPipelineStoresAndAtomicsAt(long index, int value) { VH_vertexPipelineStoresAndAtomics.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures fragmentStoresAndAtomicsAt(long index, int value) { VH_fragmentStoresAndAtomics.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures shaderTessellationAndGeometryPointSizeAt(long index, int value) { VH_shaderTessellationAndGeometryPointSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures shaderImageGatherExtendedAt(long index, int value) { VH_shaderImageGatherExtended.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures shaderStorageImageExtendedFormatsAt(long index, int value) { VH_shaderStorageImageExtendedFormats.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures shaderStorageImageMultisampleAt(long index, int value) { VH_shaderStorageImageMultisample.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures shaderStorageImageReadWithoutFormatAt(long index, int value) { VH_shaderStorageImageReadWithoutFormat.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures shaderStorageImageWriteWithoutFormatAt(long index, int value) { VH_shaderStorageImageWriteWithoutFormat.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures shaderUniformBufferArrayDynamicIndexingAt(long index, int value) { VH_shaderUniformBufferArrayDynamicIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures shaderSampledImageArrayDynamicIndexingAt(long index, int value) { VH_shaderSampledImageArrayDynamicIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures shaderStorageBufferArrayDynamicIndexingAt(long index, int value) { VH_shaderStorageBufferArrayDynamicIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures shaderStorageImageArrayDynamicIndexingAt(long index, int value) { VH_shaderStorageImageArrayDynamicIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures shaderClipDistanceAt(long index, int value) { VH_shaderClipDistance.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures shaderCullDistanceAt(long index, int value) { VH_shaderCullDistance.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures shaderFloat64At(long index, int value) { VH_shaderFloat64.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures shaderInt64At(long index, int value) { VH_shaderInt64.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures shaderInt16At(long index, int value) { VH_shaderInt16.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures shaderResourceResidencyAt(long index, int value) { VH_shaderResourceResidency.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures shaderResourceMinLodAt(long index, int value) { VH_shaderResourceMinLod.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures sparseBindingAt(long index, int value) { VH_sparseBinding.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures sparseResidencyBufferAt(long index, int value) { VH_sparseResidencyBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures sparseResidencyImage2DAt(long index, int value) { VH_sparseResidencyImage2D.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures sparseResidencyImage3DAt(long index, int value) { VH_sparseResidencyImage3D.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures sparseResidency2SamplesAt(long index, int value) { VH_sparseResidency2Samples.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures sparseResidency4SamplesAt(long index, int value) { VH_sparseResidency4Samples.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures sparseResidency8SamplesAt(long index, int value) { VH_sparseResidency8Samples.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures sparseResidency16SamplesAt(long index, int value) { VH_sparseResidency16Samples.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures sparseResidencyAliasedAt(long index, int value) { VH_sparseResidencyAliased.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures variableMultisampleRateAt(long index, int value) { VH_variableMultisampleRate.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures inheritedQueriesAt(long index, int value) { VH_inheritedQueries.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures robustBufferAccess(int value) { VH_robustBufferAccess.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures fullDrawIndexUint32(int value) { VH_fullDrawIndexUint32.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures imageCubeArray(int value) { VH_imageCubeArray.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures independentBlend(int value) { VH_independentBlend.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures geometryShader(int value) { VH_geometryShader.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures tessellationShader(int value) { VH_tessellationShader.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures sampleRateShading(int value) { VH_sampleRateShading.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures dualSrcBlend(int value) { VH_dualSrcBlend.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures logicOp(int value) { VH_logicOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures multiDrawIndirect(int value) { VH_multiDrawIndirect.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures drawIndirectFirstInstance(int value) { VH_drawIndirectFirstInstance.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures depthClamp(int value) { VH_depthClamp.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures depthBiasClamp(int value) { VH_depthBiasClamp.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures fillModeNonSolid(int value) { VH_fillModeNonSolid.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures depthBounds(int value) { VH_depthBounds.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures wideLines(int value) { VH_wideLines.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures largePoints(int value) { VH_largePoints.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures alphaToOne(int value) { VH_alphaToOne.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures multiViewport(int value) { VH_multiViewport.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures samplerAnisotropy(int value) { VH_samplerAnisotropy.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures textureCompressionETC2(int value) { VH_textureCompressionETC2.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures textureCompressionASTC_LDR(int value) { VH_textureCompressionASTC_LDR.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures textureCompressionBC(int value) { VH_textureCompressionBC.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures occlusionQueryPrecise(int value) { VH_occlusionQueryPrecise.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures pipelineStatisticsQuery(int value) { VH_pipelineStatisticsQuery.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures vertexPipelineStoresAndAtomics(int value) { VH_vertexPipelineStoresAndAtomics.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures fragmentStoresAndAtomics(int value) { VH_fragmentStoresAndAtomics.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures shaderTessellationAndGeometryPointSize(int value) { VH_shaderTessellationAndGeometryPointSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures shaderImageGatherExtended(int value) { VH_shaderImageGatherExtended.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures shaderStorageImageExtendedFormats(int value) { VH_shaderStorageImageExtendedFormats.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures shaderStorageImageMultisample(int value) { VH_shaderStorageImageMultisample.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures shaderStorageImageReadWithoutFormat(int value) { VH_shaderStorageImageReadWithoutFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures shaderStorageImageWriteWithoutFormat(int value) { VH_shaderStorageImageWriteWithoutFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures shaderUniformBufferArrayDynamicIndexing(int value) { VH_shaderUniformBufferArrayDynamicIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures shaderSampledImageArrayDynamicIndexing(int value) { VH_shaderSampledImageArrayDynamicIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures shaderStorageBufferArrayDynamicIndexing(int value) { VH_shaderStorageBufferArrayDynamicIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures shaderStorageImageArrayDynamicIndexing(int value) { VH_shaderStorageImageArrayDynamicIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures shaderClipDistance(int value) { VH_shaderClipDistance.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures shaderCullDistance(int value) { VH_shaderCullDistance.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures shaderFloat64(int value) { VH_shaderFloat64.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures shaderInt64(int value) { VH_shaderInt64.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures shaderInt16(int value) { VH_shaderInt16.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures shaderResourceResidency(int value) { VH_shaderResourceResidency.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures shaderResourceMinLod(int value) { VH_shaderResourceMinLod.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures sparseBinding(int value) { VH_sparseBinding.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures sparseResidencyBuffer(int value) { VH_sparseResidencyBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures sparseResidencyImage2D(int value) { VH_sparseResidencyImage2D.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures sparseResidencyImage3D(int value) { VH_sparseResidencyImage3D.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures sparseResidency2Samples(int value) { VH_sparseResidency2Samples.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures sparseResidency4Samples(int value) { VH_sparseResidency4Samples.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures sparseResidency8Samples(int value) { VH_sparseResidency8Samples.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures sparseResidency16Samples(int value) { VH_sparseResidency16Samples.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures sparseResidencyAliased(int value) { VH_sparseResidencyAliased.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures variableMultisampleRate(int value) { VH_variableMultisampleRate.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures inheritedQueries(int value) { VH_inheritedQueries.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _robustBufferAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_robustBufferAccess, index), LAYOUT_robustBufferAccess); }
    public MemorySegment _robustBufferAccess() { return _robustBufferAccessAt(0L); }
    public VkPhysicalDeviceFeatures _robustBufferAccessAt(long index, MemorySegment src) { _robustBufferAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _robustBufferAccess(MemorySegment src) { return _robustBufferAccessAt(0L, src); }
    public MemorySegment _fullDrawIndexUint32At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fullDrawIndexUint32, index), LAYOUT_fullDrawIndexUint32); }
    public MemorySegment _fullDrawIndexUint32() { return _fullDrawIndexUint32At(0L); }
    public VkPhysicalDeviceFeatures _fullDrawIndexUint32At(long index, MemorySegment src) { _fullDrawIndexUint32At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _fullDrawIndexUint32(MemorySegment src) { return _fullDrawIndexUint32At(0L, src); }
    public MemorySegment _imageCubeArrayAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageCubeArray, index), LAYOUT_imageCubeArray); }
    public MemorySegment _imageCubeArray() { return _imageCubeArrayAt(0L); }
    public VkPhysicalDeviceFeatures _imageCubeArrayAt(long index, MemorySegment src) { _imageCubeArrayAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _imageCubeArray(MemorySegment src) { return _imageCubeArrayAt(0L, src); }
    public MemorySegment _independentBlendAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_independentBlend, index), LAYOUT_independentBlend); }
    public MemorySegment _independentBlend() { return _independentBlendAt(0L); }
    public VkPhysicalDeviceFeatures _independentBlendAt(long index, MemorySegment src) { _independentBlendAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _independentBlend(MemorySegment src) { return _independentBlendAt(0L, src); }
    public MemorySegment _geometryShaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_geometryShader, index), LAYOUT_geometryShader); }
    public MemorySegment _geometryShader() { return _geometryShaderAt(0L); }
    public VkPhysicalDeviceFeatures _geometryShaderAt(long index, MemorySegment src) { _geometryShaderAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _geometryShader(MemorySegment src) { return _geometryShaderAt(0L, src); }
    public MemorySegment _tessellationShaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tessellationShader, index), LAYOUT_tessellationShader); }
    public MemorySegment _tessellationShader() { return _tessellationShaderAt(0L); }
    public VkPhysicalDeviceFeatures _tessellationShaderAt(long index, MemorySegment src) { _tessellationShaderAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _tessellationShader(MemorySegment src) { return _tessellationShaderAt(0L, src); }
    public MemorySegment _sampleRateShadingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampleRateShading, index), LAYOUT_sampleRateShading); }
    public MemorySegment _sampleRateShading() { return _sampleRateShadingAt(0L); }
    public VkPhysicalDeviceFeatures _sampleRateShadingAt(long index, MemorySegment src) { _sampleRateShadingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _sampleRateShading(MemorySegment src) { return _sampleRateShadingAt(0L, src); }
    public MemorySegment _dualSrcBlendAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dualSrcBlend, index), LAYOUT_dualSrcBlend); }
    public MemorySegment _dualSrcBlend() { return _dualSrcBlendAt(0L); }
    public VkPhysicalDeviceFeatures _dualSrcBlendAt(long index, MemorySegment src) { _dualSrcBlendAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _dualSrcBlend(MemorySegment src) { return _dualSrcBlendAt(0L, src); }
    public MemorySegment _logicOpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_logicOp, index), LAYOUT_logicOp); }
    public MemorySegment _logicOp() { return _logicOpAt(0L); }
    public VkPhysicalDeviceFeatures _logicOpAt(long index, MemorySegment src) { _logicOpAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _logicOp(MemorySegment src) { return _logicOpAt(0L, src); }
    public MemorySegment _multiDrawIndirectAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_multiDrawIndirect, index), LAYOUT_multiDrawIndirect); }
    public MemorySegment _multiDrawIndirect() { return _multiDrawIndirectAt(0L); }
    public VkPhysicalDeviceFeatures _multiDrawIndirectAt(long index, MemorySegment src) { _multiDrawIndirectAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _multiDrawIndirect(MemorySegment src) { return _multiDrawIndirectAt(0L, src); }
    public MemorySegment _drawIndirectFirstInstanceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_drawIndirectFirstInstance, index), LAYOUT_drawIndirectFirstInstance); }
    public MemorySegment _drawIndirectFirstInstance() { return _drawIndirectFirstInstanceAt(0L); }
    public VkPhysicalDeviceFeatures _drawIndirectFirstInstanceAt(long index, MemorySegment src) { _drawIndirectFirstInstanceAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _drawIndirectFirstInstance(MemorySegment src) { return _drawIndirectFirstInstanceAt(0L, src); }
    public MemorySegment _depthClampAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthClamp, index), LAYOUT_depthClamp); }
    public MemorySegment _depthClamp() { return _depthClampAt(0L); }
    public VkPhysicalDeviceFeatures _depthClampAt(long index, MemorySegment src) { _depthClampAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _depthClamp(MemorySegment src) { return _depthClampAt(0L, src); }
    public MemorySegment _depthBiasClampAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthBiasClamp, index), LAYOUT_depthBiasClamp); }
    public MemorySegment _depthBiasClamp() { return _depthBiasClampAt(0L); }
    public VkPhysicalDeviceFeatures _depthBiasClampAt(long index, MemorySegment src) { _depthBiasClampAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _depthBiasClamp(MemorySegment src) { return _depthBiasClampAt(0L, src); }
    public MemorySegment _fillModeNonSolidAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fillModeNonSolid, index), LAYOUT_fillModeNonSolid); }
    public MemorySegment _fillModeNonSolid() { return _fillModeNonSolidAt(0L); }
    public VkPhysicalDeviceFeatures _fillModeNonSolidAt(long index, MemorySegment src) { _fillModeNonSolidAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _fillModeNonSolid(MemorySegment src) { return _fillModeNonSolidAt(0L, src); }
    public MemorySegment _depthBoundsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthBounds, index), LAYOUT_depthBounds); }
    public MemorySegment _depthBounds() { return _depthBoundsAt(0L); }
    public VkPhysicalDeviceFeatures _depthBoundsAt(long index, MemorySegment src) { _depthBoundsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _depthBounds(MemorySegment src) { return _depthBoundsAt(0L, src); }
    public MemorySegment _wideLinesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_wideLines, index), LAYOUT_wideLines); }
    public MemorySegment _wideLines() { return _wideLinesAt(0L); }
    public VkPhysicalDeviceFeatures _wideLinesAt(long index, MemorySegment src) { _wideLinesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _wideLines(MemorySegment src) { return _wideLinesAt(0L, src); }
    public MemorySegment _largePointsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_largePoints, index), LAYOUT_largePoints); }
    public MemorySegment _largePoints() { return _largePointsAt(0L); }
    public VkPhysicalDeviceFeatures _largePointsAt(long index, MemorySegment src) { _largePointsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _largePoints(MemorySegment src) { return _largePointsAt(0L, src); }
    public MemorySegment _alphaToOneAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_alphaToOne, index), LAYOUT_alphaToOne); }
    public MemorySegment _alphaToOne() { return _alphaToOneAt(0L); }
    public VkPhysicalDeviceFeatures _alphaToOneAt(long index, MemorySegment src) { _alphaToOneAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _alphaToOne(MemorySegment src) { return _alphaToOneAt(0L, src); }
    public MemorySegment _multiViewportAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_multiViewport, index), LAYOUT_multiViewport); }
    public MemorySegment _multiViewport() { return _multiViewportAt(0L); }
    public VkPhysicalDeviceFeatures _multiViewportAt(long index, MemorySegment src) { _multiViewportAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _multiViewport(MemorySegment src) { return _multiViewportAt(0L, src); }
    public MemorySegment _samplerAnisotropyAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_samplerAnisotropy, index), LAYOUT_samplerAnisotropy); }
    public MemorySegment _samplerAnisotropy() { return _samplerAnisotropyAt(0L); }
    public VkPhysicalDeviceFeatures _samplerAnisotropyAt(long index, MemorySegment src) { _samplerAnisotropyAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _samplerAnisotropy(MemorySegment src) { return _samplerAnisotropyAt(0L, src); }
    public MemorySegment _textureCompressionETC2At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_textureCompressionETC2, index), LAYOUT_textureCompressionETC2); }
    public MemorySegment _textureCompressionETC2() { return _textureCompressionETC2At(0L); }
    public VkPhysicalDeviceFeatures _textureCompressionETC2At(long index, MemorySegment src) { _textureCompressionETC2At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _textureCompressionETC2(MemorySegment src) { return _textureCompressionETC2At(0L, src); }
    public MemorySegment _textureCompressionASTC_LDRAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_textureCompressionASTC_LDR, index), LAYOUT_textureCompressionASTC_LDR); }
    public MemorySegment _textureCompressionASTC_LDR() { return _textureCompressionASTC_LDRAt(0L); }
    public VkPhysicalDeviceFeatures _textureCompressionASTC_LDRAt(long index, MemorySegment src) { _textureCompressionASTC_LDRAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _textureCompressionASTC_LDR(MemorySegment src) { return _textureCompressionASTC_LDRAt(0L, src); }
    public MemorySegment _textureCompressionBCAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_textureCompressionBC, index), LAYOUT_textureCompressionBC); }
    public MemorySegment _textureCompressionBC() { return _textureCompressionBCAt(0L); }
    public VkPhysicalDeviceFeatures _textureCompressionBCAt(long index, MemorySegment src) { _textureCompressionBCAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _textureCompressionBC(MemorySegment src) { return _textureCompressionBCAt(0L, src); }
    public MemorySegment _occlusionQueryPreciseAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_occlusionQueryPrecise, index), LAYOUT_occlusionQueryPrecise); }
    public MemorySegment _occlusionQueryPrecise() { return _occlusionQueryPreciseAt(0L); }
    public VkPhysicalDeviceFeatures _occlusionQueryPreciseAt(long index, MemorySegment src) { _occlusionQueryPreciseAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _occlusionQueryPrecise(MemorySegment src) { return _occlusionQueryPreciseAt(0L, src); }
    public MemorySegment _pipelineStatisticsQueryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineStatisticsQuery, index), LAYOUT_pipelineStatisticsQuery); }
    public MemorySegment _pipelineStatisticsQuery() { return _pipelineStatisticsQueryAt(0L); }
    public VkPhysicalDeviceFeatures _pipelineStatisticsQueryAt(long index, MemorySegment src) { _pipelineStatisticsQueryAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _pipelineStatisticsQuery(MemorySegment src) { return _pipelineStatisticsQueryAt(0L, src); }
    public MemorySegment _vertexPipelineStoresAndAtomicsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexPipelineStoresAndAtomics, index), LAYOUT_vertexPipelineStoresAndAtomics); }
    public MemorySegment _vertexPipelineStoresAndAtomics() { return _vertexPipelineStoresAndAtomicsAt(0L); }
    public VkPhysicalDeviceFeatures _vertexPipelineStoresAndAtomicsAt(long index, MemorySegment src) { _vertexPipelineStoresAndAtomicsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _vertexPipelineStoresAndAtomics(MemorySegment src) { return _vertexPipelineStoresAndAtomicsAt(0L, src); }
    public MemorySegment _fragmentStoresAndAtomicsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentStoresAndAtomics, index), LAYOUT_fragmentStoresAndAtomics); }
    public MemorySegment _fragmentStoresAndAtomics() { return _fragmentStoresAndAtomicsAt(0L); }
    public VkPhysicalDeviceFeatures _fragmentStoresAndAtomicsAt(long index, MemorySegment src) { _fragmentStoresAndAtomicsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _fragmentStoresAndAtomics(MemorySegment src) { return _fragmentStoresAndAtomicsAt(0L, src); }
    public MemorySegment _shaderTessellationAndGeometryPointSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderTessellationAndGeometryPointSize, index), LAYOUT_shaderTessellationAndGeometryPointSize); }
    public MemorySegment _shaderTessellationAndGeometryPointSize() { return _shaderTessellationAndGeometryPointSizeAt(0L); }
    public VkPhysicalDeviceFeatures _shaderTessellationAndGeometryPointSizeAt(long index, MemorySegment src) { _shaderTessellationAndGeometryPointSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _shaderTessellationAndGeometryPointSize(MemorySegment src) { return _shaderTessellationAndGeometryPointSizeAt(0L, src); }
    public MemorySegment _shaderImageGatherExtendedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderImageGatherExtended, index), LAYOUT_shaderImageGatherExtended); }
    public MemorySegment _shaderImageGatherExtended() { return _shaderImageGatherExtendedAt(0L); }
    public VkPhysicalDeviceFeatures _shaderImageGatherExtendedAt(long index, MemorySegment src) { _shaderImageGatherExtendedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _shaderImageGatherExtended(MemorySegment src) { return _shaderImageGatherExtendedAt(0L, src); }
    public MemorySegment _shaderStorageImageExtendedFormatsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStorageImageExtendedFormats, index), LAYOUT_shaderStorageImageExtendedFormats); }
    public MemorySegment _shaderStorageImageExtendedFormats() { return _shaderStorageImageExtendedFormatsAt(0L); }
    public VkPhysicalDeviceFeatures _shaderStorageImageExtendedFormatsAt(long index, MemorySegment src) { _shaderStorageImageExtendedFormatsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _shaderStorageImageExtendedFormats(MemorySegment src) { return _shaderStorageImageExtendedFormatsAt(0L, src); }
    public MemorySegment _shaderStorageImageMultisampleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStorageImageMultisample, index), LAYOUT_shaderStorageImageMultisample); }
    public MemorySegment _shaderStorageImageMultisample() { return _shaderStorageImageMultisampleAt(0L); }
    public VkPhysicalDeviceFeatures _shaderStorageImageMultisampleAt(long index, MemorySegment src) { _shaderStorageImageMultisampleAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _shaderStorageImageMultisample(MemorySegment src) { return _shaderStorageImageMultisampleAt(0L, src); }
    public MemorySegment _shaderStorageImageReadWithoutFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStorageImageReadWithoutFormat, index), LAYOUT_shaderStorageImageReadWithoutFormat); }
    public MemorySegment _shaderStorageImageReadWithoutFormat() { return _shaderStorageImageReadWithoutFormatAt(0L); }
    public VkPhysicalDeviceFeatures _shaderStorageImageReadWithoutFormatAt(long index, MemorySegment src) { _shaderStorageImageReadWithoutFormatAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _shaderStorageImageReadWithoutFormat(MemorySegment src) { return _shaderStorageImageReadWithoutFormatAt(0L, src); }
    public MemorySegment _shaderStorageImageWriteWithoutFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStorageImageWriteWithoutFormat, index), LAYOUT_shaderStorageImageWriteWithoutFormat); }
    public MemorySegment _shaderStorageImageWriteWithoutFormat() { return _shaderStorageImageWriteWithoutFormatAt(0L); }
    public VkPhysicalDeviceFeatures _shaderStorageImageWriteWithoutFormatAt(long index, MemorySegment src) { _shaderStorageImageWriteWithoutFormatAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _shaderStorageImageWriteWithoutFormat(MemorySegment src) { return _shaderStorageImageWriteWithoutFormatAt(0L, src); }
    public MemorySegment _shaderUniformBufferArrayDynamicIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderUniformBufferArrayDynamicIndexing, index), LAYOUT_shaderUniformBufferArrayDynamicIndexing); }
    public MemorySegment _shaderUniformBufferArrayDynamicIndexing() { return _shaderUniformBufferArrayDynamicIndexingAt(0L); }
    public VkPhysicalDeviceFeatures _shaderUniformBufferArrayDynamicIndexingAt(long index, MemorySegment src) { _shaderUniformBufferArrayDynamicIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _shaderUniformBufferArrayDynamicIndexing(MemorySegment src) { return _shaderUniformBufferArrayDynamicIndexingAt(0L, src); }
    public MemorySegment _shaderSampledImageArrayDynamicIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSampledImageArrayDynamicIndexing, index), LAYOUT_shaderSampledImageArrayDynamicIndexing); }
    public MemorySegment _shaderSampledImageArrayDynamicIndexing() { return _shaderSampledImageArrayDynamicIndexingAt(0L); }
    public VkPhysicalDeviceFeatures _shaderSampledImageArrayDynamicIndexingAt(long index, MemorySegment src) { _shaderSampledImageArrayDynamicIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _shaderSampledImageArrayDynamicIndexing(MemorySegment src) { return _shaderSampledImageArrayDynamicIndexingAt(0L, src); }
    public MemorySegment _shaderStorageBufferArrayDynamicIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStorageBufferArrayDynamicIndexing, index), LAYOUT_shaderStorageBufferArrayDynamicIndexing); }
    public MemorySegment _shaderStorageBufferArrayDynamicIndexing() { return _shaderStorageBufferArrayDynamicIndexingAt(0L); }
    public VkPhysicalDeviceFeatures _shaderStorageBufferArrayDynamicIndexingAt(long index, MemorySegment src) { _shaderStorageBufferArrayDynamicIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _shaderStorageBufferArrayDynamicIndexing(MemorySegment src) { return _shaderStorageBufferArrayDynamicIndexingAt(0L, src); }
    public MemorySegment _shaderStorageImageArrayDynamicIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStorageImageArrayDynamicIndexing, index), LAYOUT_shaderStorageImageArrayDynamicIndexing); }
    public MemorySegment _shaderStorageImageArrayDynamicIndexing() { return _shaderStorageImageArrayDynamicIndexingAt(0L); }
    public VkPhysicalDeviceFeatures _shaderStorageImageArrayDynamicIndexingAt(long index, MemorySegment src) { _shaderStorageImageArrayDynamicIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _shaderStorageImageArrayDynamicIndexing(MemorySegment src) { return _shaderStorageImageArrayDynamicIndexingAt(0L, src); }
    public MemorySegment _shaderClipDistanceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderClipDistance, index), LAYOUT_shaderClipDistance); }
    public MemorySegment _shaderClipDistance() { return _shaderClipDistanceAt(0L); }
    public VkPhysicalDeviceFeatures _shaderClipDistanceAt(long index, MemorySegment src) { _shaderClipDistanceAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _shaderClipDistance(MemorySegment src) { return _shaderClipDistanceAt(0L, src); }
    public MemorySegment _shaderCullDistanceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderCullDistance, index), LAYOUT_shaderCullDistance); }
    public MemorySegment _shaderCullDistance() { return _shaderCullDistanceAt(0L); }
    public VkPhysicalDeviceFeatures _shaderCullDistanceAt(long index, MemorySegment src) { _shaderCullDistanceAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _shaderCullDistance(MemorySegment src) { return _shaderCullDistanceAt(0L, src); }
    public MemorySegment _shaderFloat64At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderFloat64, index), LAYOUT_shaderFloat64); }
    public MemorySegment _shaderFloat64() { return _shaderFloat64At(0L); }
    public VkPhysicalDeviceFeatures _shaderFloat64At(long index, MemorySegment src) { _shaderFloat64At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _shaderFloat64(MemorySegment src) { return _shaderFloat64At(0L, src); }
    public MemorySegment _shaderInt64At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderInt64, index), LAYOUT_shaderInt64); }
    public MemorySegment _shaderInt64() { return _shaderInt64At(0L); }
    public VkPhysicalDeviceFeatures _shaderInt64At(long index, MemorySegment src) { _shaderInt64At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _shaderInt64(MemorySegment src) { return _shaderInt64At(0L, src); }
    public MemorySegment _shaderInt16At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderInt16, index), LAYOUT_shaderInt16); }
    public MemorySegment _shaderInt16() { return _shaderInt16At(0L); }
    public VkPhysicalDeviceFeatures _shaderInt16At(long index, MemorySegment src) { _shaderInt16At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _shaderInt16(MemorySegment src) { return _shaderInt16At(0L, src); }
    public MemorySegment _shaderResourceResidencyAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderResourceResidency, index), LAYOUT_shaderResourceResidency); }
    public MemorySegment _shaderResourceResidency() { return _shaderResourceResidencyAt(0L); }
    public VkPhysicalDeviceFeatures _shaderResourceResidencyAt(long index, MemorySegment src) { _shaderResourceResidencyAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _shaderResourceResidency(MemorySegment src) { return _shaderResourceResidencyAt(0L, src); }
    public MemorySegment _shaderResourceMinLodAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderResourceMinLod, index), LAYOUT_shaderResourceMinLod); }
    public MemorySegment _shaderResourceMinLod() { return _shaderResourceMinLodAt(0L); }
    public VkPhysicalDeviceFeatures _shaderResourceMinLodAt(long index, MemorySegment src) { _shaderResourceMinLodAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _shaderResourceMinLod(MemorySegment src) { return _shaderResourceMinLodAt(0L, src); }
    public MemorySegment _sparseBindingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sparseBinding, index), LAYOUT_sparseBinding); }
    public MemorySegment _sparseBinding() { return _sparseBindingAt(0L); }
    public VkPhysicalDeviceFeatures _sparseBindingAt(long index, MemorySegment src) { _sparseBindingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _sparseBinding(MemorySegment src) { return _sparseBindingAt(0L, src); }
    public MemorySegment _sparseResidencyBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sparseResidencyBuffer, index), LAYOUT_sparseResidencyBuffer); }
    public MemorySegment _sparseResidencyBuffer() { return _sparseResidencyBufferAt(0L); }
    public VkPhysicalDeviceFeatures _sparseResidencyBufferAt(long index, MemorySegment src) { _sparseResidencyBufferAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _sparseResidencyBuffer(MemorySegment src) { return _sparseResidencyBufferAt(0L, src); }
    public MemorySegment _sparseResidencyImage2DAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sparseResidencyImage2D, index), LAYOUT_sparseResidencyImage2D); }
    public MemorySegment _sparseResidencyImage2D() { return _sparseResidencyImage2DAt(0L); }
    public VkPhysicalDeviceFeatures _sparseResidencyImage2DAt(long index, MemorySegment src) { _sparseResidencyImage2DAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _sparseResidencyImage2D(MemorySegment src) { return _sparseResidencyImage2DAt(0L, src); }
    public MemorySegment _sparseResidencyImage3DAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sparseResidencyImage3D, index), LAYOUT_sparseResidencyImage3D); }
    public MemorySegment _sparseResidencyImage3D() { return _sparseResidencyImage3DAt(0L); }
    public VkPhysicalDeviceFeatures _sparseResidencyImage3DAt(long index, MemorySegment src) { _sparseResidencyImage3DAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _sparseResidencyImage3D(MemorySegment src) { return _sparseResidencyImage3DAt(0L, src); }
    public MemorySegment _sparseResidency2SamplesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sparseResidency2Samples, index), LAYOUT_sparseResidency2Samples); }
    public MemorySegment _sparseResidency2Samples() { return _sparseResidency2SamplesAt(0L); }
    public VkPhysicalDeviceFeatures _sparseResidency2SamplesAt(long index, MemorySegment src) { _sparseResidency2SamplesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _sparseResidency2Samples(MemorySegment src) { return _sparseResidency2SamplesAt(0L, src); }
    public MemorySegment _sparseResidency4SamplesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sparseResidency4Samples, index), LAYOUT_sparseResidency4Samples); }
    public MemorySegment _sparseResidency4Samples() { return _sparseResidency4SamplesAt(0L); }
    public VkPhysicalDeviceFeatures _sparseResidency4SamplesAt(long index, MemorySegment src) { _sparseResidency4SamplesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _sparseResidency4Samples(MemorySegment src) { return _sparseResidency4SamplesAt(0L, src); }
    public MemorySegment _sparseResidency8SamplesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sparseResidency8Samples, index), LAYOUT_sparseResidency8Samples); }
    public MemorySegment _sparseResidency8Samples() { return _sparseResidency8SamplesAt(0L); }
    public VkPhysicalDeviceFeatures _sparseResidency8SamplesAt(long index, MemorySegment src) { _sparseResidency8SamplesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _sparseResidency8Samples(MemorySegment src) { return _sparseResidency8SamplesAt(0L, src); }
    public MemorySegment _sparseResidency16SamplesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sparseResidency16Samples, index), LAYOUT_sparseResidency16Samples); }
    public MemorySegment _sparseResidency16Samples() { return _sparseResidency16SamplesAt(0L); }
    public VkPhysicalDeviceFeatures _sparseResidency16SamplesAt(long index, MemorySegment src) { _sparseResidency16SamplesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _sparseResidency16Samples(MemorySegment src) { return _sparseResidency16SamplesAt(0L, src); }
    public MemorySegment _sparseResidencyAliasedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sparseResidencyAliased, index), LAYOUT_sparseResidencyAliased); }
    public MemorySegment _sparseResidencyAliased() { return _sparseResidencyAliasedAt(0L); }
    public VkPhysicalDeviceFeatures _sparseResidencyAliasedAt(long index, MemorySegment src) { _sparseResidencyAliasedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _sparseResidencyAliased(MemorySegment src) { return _sparseResidencyAliasedAt(0L, src); }
    public MemorySegment _variableMultisampleRateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_variableMultisampleRate, index), LAYOUT_variableMultisampleRate); }
    public MemorySegment _variableMultisampleRate() { return _variableMultisampleRateAt(0L); }
    public VkPhysicalDeviceFeatures _variableMultisampleRateAt(long index, MemorySegment src) { _variableMultisampleRateAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _variableMultisampleRate(MemorySegment src) { return _variableMultisampleRateAt(0L, src); }
    public MemorySegment _inheritedQueriesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_inheritedQueries, index), LAYOUT_inheritedQueries); }
    public MemorySegment _inheritedQueries() { return _inheritedQueriesAt(0L); }
    public VkPhysicalDeviceFeatures _inheritedQueriesAt(long index, MemorySegment src) { _inheritedQueriesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures _inheritedQueries(MemorySegment src) { return _inheritedQueriesAt(0L, src); }
}
