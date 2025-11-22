// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFeatures2KHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFeatures2KHR {
///     VkStructureType sType;
///     void* pNext;
///     VkPhysicalDeviceFeatures features;
/// }
/// ```
public final class VkPhysicalDeviceFeatures2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkPhysicalDeviceFeatures.LAYOUT.withName("features")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_features = LAYOUT.byteOffset(PathElement.groupElement("features"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_features = LAYOUT.select(PathElement.groupElement("features"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_features$robustBufferAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("robustBufferAccess"));
    public static final VarHandle VH_features$fullDrawIndexUint32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("fullDrawIndexUint32"));
    public static final VarHandle VH_features$imageCubeArray = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("imageCubeArray"));
    public static final VarHandle VH_features$independentBlend = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("independentBlend"));
    public static final VarHandle VH_features$geometryShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("geometryShader"));
    public static final VarHandle VH_features$tessellationShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("tessellationShader"));
    public static final VarHandle VH_features$sampleRateShading = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("sampleRateShading"));
    public static final VarHandle VH_features$dualSrcBlend = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("dualSrcBlend"));
    public static final VarHandle VH_features$logicOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("logicOp"));
    public static final VarHandle VH_features$multiDrawIndirect = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("multiDrawIndirect"));
    public static final VarHandle VH_features$drawIndirectFirstInstance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("drawIndirectFirstInstance"));
    public static final VarHandle VH_features$depthClamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("depthClamp"));
    public static final VarHandle VH_features$depthBiasClamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("depthBiasClamp"));
    public static final VarHandle VH_features$fillModeNonSolid = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("fillModeNonSolid"));
    public static final VarHandle VH_features$depthBounds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("depthBounds"));
    public static final VarHandle VH_features$wideLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("wideLines"));
    public static final VarHandle VH_features$largePoints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("largePoints"));
    public static final VarHandle VH_features$alphaToOne = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("alphaToOne"));
    public static final VarHandle VH_features$multiViewport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("multiViewport"));
    public static final VarHandle VH_features$samplerAnisotropy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("samplerAnisotropy"));
    public static final VarHandle VH_features$textureCompressionETC2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("textureCompressionETC2"));
    public static final VarHandle VH_features$textureCompressionASTC_LDR = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("textureCompressionASTC_LDR"));
    public static final VarHandle VH_features$textureCompressionBC = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("textureCompressionBC"));
    public static final VarHandle VH_features$occlusionQueryPrecise = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("occlusionQueryPrecise"));
    public static final VarHandle VH_features$pipelineStatisticsQuery = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("pipelineStatisticsQuery"));
    public static final VarHandle VH_features$vertexPipelineStoresAndAtomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("vertexPipelineStoresAndAtomics"));
    public static final VarHandle VH_features$fragmentStoresAndAtomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("fragmentStoresAndAtomics"));
    public static final VarHandle VH_features$shaderTessellationAndGeometryPointSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("shaderTessellationAndGeometryPointSize"));
    public static final VarHandle VH_features$shaderImageGatherExtended = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("shaderImageGatherExtended"));
    public static final VarHandle VH_features$shaderStorageImageExtendedFormats = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("shaderStorageImageExtendedFormats"));
    public static final VarHandle VH_features$shaderStorageImageMultisample = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("shaderStorageImageMultisample"));
    public static final VarHandle VH_features$shaderStorageImageReadWithoutFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("shaderStorageImageReadWithoutFormat"));
    public static final VarHandle VH_features$shaderStorageImageWriteWithoutFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("shaderStorageImageWriteWithoutFormat"));
    public static final VarHandle VH_features$shaderUniformBufferArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("shaderUniformBufferArrayDynamicIndexing"));
    public static final VarHandle VH_features$shaderSampledImageArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("shaderSampledImageArrayDynamicIndexing"));
    public static final VarHandle VH_features$shaderStorageBufferArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("shaderStorageBufferArrayDynamicIndexing"));
    public static final VarHandle VH_features$shaderStorageImageArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("shaderStorageImageArrayDynamicIndexing"));
    public static final VarHandle VH_features$shaderClipDistance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("shaderClipDistance"));
    public static final VarHandle VH_features$shaderCullDistance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("shaderCullDistance"));
    public static final VarHandle VH_features$shaderFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("shaderFloat64"));
    public static final VarHandle VH_features$shaderInt64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("shaderInt64"));
    public static final VarHandle VH_features$shaderInt16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("shaderInt16"));
    public static final VarHandle VH_features$shaderResourceResidency = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("shaderResourceResidency"));
    public static final VarHandle VH_features$shaderResourceMinLod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("shaderResourceMinLod"));
    public static final VarHandle VH_features$sparseBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("sparseBinding"));
    public static final VarHandle VH_features$sparseResidencyBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("sparseResidencyBuffer"));
    public static final VarHandle VH_features$sparseResidencyImage2D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("sparseResidencyImage2D"));
    public static final VarHandle VH_features$sparseResidencyImage3D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("sparseResidencyImage3D"));
    public static final VarHandle VH_features$sparseResidency2Samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("sparseResidency2Samples"));
    public static final VarHandle VH_features$sparseResidency4Samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("sparseResidency4Samples"));
    public static final VarHandle VH_features$sparseResidency8Samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("sparseResidency8Samples"));
    public static final VarHandle VH_features$sparseResidency16Samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("sparseResidency16Samples"));
    public static final VarHandle VH_features$sparseResidencyAliased = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("sparseResidencyAliased"));
    public static final VarHandle VH_features$variableMultisampleRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("variableMultisampleRate"));
    public static final VarHandle VH_features$inheritedQueries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("features"), PathElement.groupElement("inheritedQueries"));

    public VkPhysicalDeviceFeatures2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceFeatures2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFeatures2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceFeatures2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFeatures2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceFeatures2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFeatures2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceFeatures2KHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFeatures2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceFeatures2KHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFeatures2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceFeatures2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2); }
    public static VkPhysicalDeviceFeatures2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2);
        return s;
    }
    public VkPhysicalDeviceFeatures2KHR copyFrom(VkPhysicalDeviceFeatures2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceFeatures2KHR reinterpret(long count) { return new VkPhysicalDeviceFeatures2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceFeatures2KHR asSlice(long index) { return new VkPhysicalDeviceFeatures2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceFeatures2KHR asSlice(long index, long count) { return new VkPhysicalDeviceFeatures2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceFeatures2KHR at(long index, Consumer<VkPhysicalDeviceFeatures2KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int features$robustBufferAccessAt(long index) { return (int) VH_features$robustBufferAccess.get(this.segment(), 0L, index); }
    public int features$fullDrawIndexUint32At(long index) { return (int) VH_features$fullDrawIndexUint32.get(this.segment(), 0L, index); }
    public int features$imageCubeArrayAt(long index) { return (int) VH_features$imageCubeArray.get(this.segment(), 0L, index); }
    public int features$independentBlendAt(long index) { return (int) VH_features$independentBlend.get(this.segment(), 0L, index); }
    public int features$geometryShaderAt(long index) { return (int) VH_features$geometryShader.get(this.segment(), 0L, index); }
    public int features$tessellationShaderAt(long index) { return (int) VH_features$tessellationShader.get(this.segment(), 0L, index); }
    public int features$sampleRateShadingAt(long index) { return (int) VH_features$sampleRateShading.get(this.segment(), 0L, index); }
    public int features$dualSrcBlendAt(long index) { return (int) VH_features$dualSrcBlend.get(this.segment(), 0L, index); }
    public int features$logicOpAt(long index) { return (int) VH_features$logicOp.get(this.segment(), 0L, index); }
    public int features$multiDrawIndirectAt(long index) { return (int) VH_features$multiDrawIndirect.get(this.segment(), 0L, index); }
    public int features$drawIndirectFirstInstanceAt(long index) { return (int) VH_features$drawIndirectFirstInstance.get(this.segment(), 0L, index); }
    public int features$depthClampAt(long index) { return (int) VH_features$depthClamp.get(this.segment(), 0L, index); }
    public int features$depthBiasClampAt(long index) { return (int) VH_features$depthBiasClamp.get(this.segment(), 0L, index); }
    public int features$fillModeNonSolidAt(long index) { return (int) VH_features$fillModeNonSolid.get(this.segment(), 0L, index); }
    public int features$depthBoundsAt(long index) { return (int) VH_features$depthBounds.get(this.segment(), 0L, index); }
    public int features$wideLinesAt(long index) { return (int) VH_features$wideLines.get(this.segment(), 0L, index); }
    public int features$largePointsAt(long index) { return (int) VH_features$largePoints.get(this.segment(), 0L, index); }
    public int features$alphaToOneAt(long index) { return (int) VH_features$alphaToOne.get(this.segment(), 0L, index); }
    public int features$multiViewportAt(long index) { return (int) VH_features$multiViewport.get(this.segment(), 0L, index); }
    public int features$samplerAnisotropyAt(long index) { return (int) VH_features$samplerAnisotropy.get(this.segment(), 0L, index); }
    public int features$textureCompressionETC2At(long index) { return (int) VH_features$textureCompressionETC2.get(this.segment(), 0L, index); }
    public int features$textureCompressionASTC_LDRAt(long index) { return (int) VH_features$textureCompressionASTC_LDR.get(this.segment(), 0L, index); }
    public int features$textureCompressionBCAt(long index) { return (int) VH_features$textureCompressionBC.get(this.segment(), 0L, index); }
    public int features$occlusionQueryPreciseAt(long index) { return (int) VH_features$occlusionQueryPrecise.get(this.segment(), 0L, index); }
    public int features$pipelineStatisticsQueryAt(long index) { return (int) VH_features$pipelineStatisticsQuery.get(this.segment(), 0L, index); }
    public int features$vertexPipelineStoresAndAtomicsAt(long index) { return (int) VH_features$vertexPipelineStoresAndAtomics.get(this.segment(), 0L, index); }
    public int features$fragmentStoresAndAtomicsAt(long index) { return (int) VH_features$fragmentStoresAndAtomics.get(this.segment(), 0L, index); }
    public int features$shaderTessellationAndGeometryPointSizeAt(long index) { return (int) VH_features$shaderTessellationAndGeometryPointSize.get(this.segment(), 0L, index); }
    public int features$shaderImageGatherExtendedAt(long index) { return (int) VH_features$shaderImageGatherExtended.get(this.segment(), 0L, index); }
    public int features$shaderStorageImageExtendedFormatsAt(long index) { return (int) VH_features$shaderStorageImageExtendedFormats.get(this.segment(), 0L, index); }
    public int features$shaderStorageImageMultisampleAt(long index) { return (int) VH_features$shaderStorageImageMultisample.get(this.segment(), 0L, index); }
    public int features$shaderStorageImageReadWithoutFormatAt(long index) { return (int) VH_features$shaderStorageImageReadWithoutFormat.get(this.segment(), 0L, index); }
    public int features$shaderStorageImageWriteWithoutFormatAt(long index) { return (int) VH_features$shaderStorageImageWriteWithoutFormat.get(this.segment(), 0L, index); }
    public int features$shaderUniformBufferArrayDynamicIndexingAt(long index) { return (int) VH_features$shaderUniformBufferArrayDynamicIndexing.get(this.segment(), 0L, index); }
    public int features$shaderSampledImageArrayDynamicIndexingAt(long index) { return (int) VH_features$shaderSampledImageArrayDynamicIndexing.get(this.segment(), 0L, index); }
    public int features$shaderStorageBufferArrayDynamicIndexingAt(long index) { return (int) VH_features$shaderStorageBufferArrayDynamicIndexing.get(this.segment(), 0L, index); }
    public int features$shaderStorageImageArrayDynamicIndexingAt(long index) { return (int) VH_features$shaderStorageImageArrayDynamicIndexing.get(this.segment(), 0L, index); }
    public int features$shaderClipDistanceAt(long index) { return (int) VH_features$shaderClipDistance.get(this.segment(), 0L, index); }
    public int features$shaderCullDistanceAt(long index) { return (int) VH_features$shaderCullDistance.get(this.segment(), 0L, index); }
    public int features$shaderFloat64At(long index) { return (int) VH_features$shaderFloat64.get(this.segment(), 0L, index); }
    public int features$shaderInt64At(long index) { return (int) VH_features$shaderInt64.get(this.segment(), 0L, index); }
    public int features$shaderInt16At(long index) { return (int) VH_features$shaderInt16.get(this.segment(), 0L, index); }
    public int features$shaderResourceResidencyAt(long index) { return (int) VH_features$shaderResourceResidency.get(this.segment(), 0L, index); }
    public int features$shaderResourceMinLodAt(long index) { return (int) VH_features$shaderResourceMinLod.get(this.segment(), 0L, index); }
    public int features$sparseBindingAt(long index) { return (int) VH_features$sparseBinding.get(this.segment(), 0L, index); }
    public int features$sparseResidencyBufferAt(long index) { return (int) VH_features$sparseResidencyBuffer.get(this.segment(), 0L, index); }
    public int features$sparseResidencyImage2DAt(long index) { return (int) VH_features$sparseResidencyImage2D.get(this.segment(), 0L, index); }
    public int features$sparseResidencyImage3DAt(long index) { return (int) VH_features$sparseResidencyImage3D.get(this.segment(), 0L, index); }
    public int features$sparseResidency2SamplesAt(long index) { return (int) VH_features$sparseResidency2Samples.get(this.segment(), 0L, index); }
    public int features$sparseResidency4SamplesAt(long index) { return (int) VH_features$sparseResidency4Samples.get(this.segment(), 0L, index); }
    public int features$sparseResidency8SamplesAt(long index) { return (int) VH_features$sparseResidency8Samples.get(this.segment(), 0L, index); }
    public int features$sparseResidency16SamplesAt(long index) { return (int) VH_features$sparseResidency16Samples.get(this.segment(), 0L, index); }
    public int features$sparseResidencyAliasedAt(long index) { return (int) VH_features$sparseResidencyAliased.get(this.segment(), 0L, index); }
    public int features$variableMultisampleRateAt(long index) { return (int) VH_features$variableMultisampleRate.get(this.segment(), 0L, index); }
    public int features$inheritedQueriesAt(long index) { return (int) VH_features$inheritedQueries.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int features$robustBufferAccess() { return (int) VH_features$robustBufferAccess.get(this.segment(), 0L, 0L); }
    public int features$fullDrawIndexUint32() { return (int) VH_features$fullDrawIndexUint32.get(this.segment(), 0L, 0L); }
    public int features$imageCubeArray() { return (int) VH_features$imageCubeArray.get(this.segment(), 0L, 0L); }
    public int features$independentBlend() { return (int) VH_features$independentBlend.get(this.segment(), 0L, 0L); }
    public int features$geometryShader() { return (int) VH_features$geometryShader.get(this.segment(), 0L, 0L); }
    public int features$tessellationShader() { return (int) VH_features$tessellationShader.get(this.segment(), 0L, 0L); }
    public int features$sampleRateShading() { return (int) VH_features$sampleRateShading.get(this.segment(), 0L, 0L); }
    public int features$dualSrcBlend() { return (int) VH_features$dualSrcBlend.get(this.segment(), 0L, 0L); }
    public int features$logicOp() { return (int) VH_features$logicOp.get(this.segment(), 0L, 0L); }
    public int features$multiDrawIndirect() { return (int) VH_features$multiDrawIndirect.get(this.segment(), 0L, 0L); }
    public int features$drawIndirectFirstInstance() { return (int) VH_features$drawIndirectFirstInstance.get(this.segment(), 0L, 0L); }
    public int features$depthClamp() { return (int) VH_features$depthClamp.get(this.segment(), 0L, 0L); }
    public int features$depthBiasClamp() { return (int) VH_features$depthBiasClamp.get(this.segment(), 0L, 0L); }
    public int features$fillModeNonSolid() { return (int) VH_features$fillModeNonSolid.get(this.segment(), 0L, 0L); }
    public int features$depthBounds() { return (int) VH_features$depthBounds.get(this.segment(), 0L, 0L); }
    public int features$wideLines() { return (int) VH_features$wideLines.get(this.segment(), 0L, 0L); }
    public int features$largePoints() { return (int) VH_features$largePoints.get(this.segment(), 0L, 0L); }
    public int features$alphaToOne() { return (int) VH_features$alphaToOne.get(this.segment(), 0L, 0L); }
    public int features$multiViewport() { return (int) VH_features$multiViewport.get(this.segment(), 0L, 0L); }
    public int features$samplerAnisotropy() { return (int) VH_features$samplerAnisotropy.get(this.segment(), 0L, 0L); }
    public int features$textureCompressionETC2() { return (int) VH_features$textureCompressionETC2.get(this.segment(), 0L, 0L); }
    public int features$textureCompressionASTC_LDR() { return (int) VH_features$textureCompressionASTC_LDR.get(this.segment(), 0L, 0L); }
    public int features$textureCompressionBC() { return (int) VH_features$textureCompressionBC.get(this.segment(), 0L, 0L); }
    public int features$occlusionQueryPrecise() { return (int) VH_features$occlusionQueryPrecise.get(this.segment(), 0L, 0L); }
    public int features$pipelineStatisticsQuery() { return (int) VH_features$pipelineStatisticsQuery.get(this.segment(), 0L, 0L); }
    public int features$vertexPipelineStoresAndAtomics() { return (int) VH_features$vertexPipelineStoresAndAtomics.get(this.segment(), 0L, 0L); }
    public int features$fragmentStoresAndAtomics() { return (int) VH_features$fragmentStoresAndAtomics.get(this.segment(), 0L, 0L); }
    public int features$shaderTessellationAndGeometryPointSize() { return (int) VH_features$shaderTessellationAndGeometryPointSize.get(this.segment(), 0L, 0L); }
    public int features$shaderImageGatherExtended() { return (int) VH_features$shaderImageGatherExtended.get(this.segment(), 0L, 0L); }
    public int features$shaderStorageImageExtendedFormats() { return (int) VH_features$shaderStorageImageExtendedFormats.get(this.segment(), 0L, 0L); }
    public int features$shaderStorageImageMultisample() { return (int) VH_features$shaderStorageImageMultisample.get(this.segment(), 0L, 0L); }
    public int features$shaderStorageImageReadWithoutFormat() { return (int) VH_features$shaderStorageImageReadWithoutFormat.get(this.segment(), 0L, 0L); }
    public int features$shaderStorageImageWriteWithoutFormat() { return (int) VH_features$shaderStorageImageWriteWithoutFormat.get(this.segment(), 0L, 0L); }
    public int features$shaderUniformBufferArrayDynamicIndexing() { return (int) VH_features$shaderUniformBufferArrayDynamicIndexing.get(this.segment(), 0L, 0L); }
    public int features$shaderSampledImageArrayDynamicIndexing() { return (int) VH_features$shaderSampledImageArrayDynamicIndexing.get(this.segment(), 0L, 0L); }
    public int features$shaderStorageBufferArrayDynamicIndexing() { return (int) VH_features$shaderStorageBufferArrayDynamicIndexing.get(this.segment(), 0L, 0L); }
    public int features$shaderStorageImageArrayDynamicIndexing() { return (int) VH_features$shaderStorageImageArrayDynamicIndexing.get(this.segment(), 0L, 0L); }
    public int features$shaderClipDistance() { return (int) VH_features$shaderClipDistance.get(this.segment(), 0L, 0L); }
    public int features$shaderCullDistance() { return (int) VH_features$shaderCullDistance.get(this.segment(), 0L, 0L); }
    public int features$shaderFloat64() { return (int) VH_features$shaderFloat64.get(this.segment(), 0L, 0L); }
    public int features$shaderInt64() { return (int) VH_features$shaderInt64.get(this.segment(), 0L, 0L); }
    public int features$shaderInt16() { return (int) VH_features$shaderInt16.get(this.segment(), 0L, 0L); }
    public int features$shaderResourceResidency() { return (int) VH_features$shaderResourceResidency.get(this.segment(), 0L, 0L); }
    public int features$shaderResourceMinLod() { return (int) VH_features$shaderResourceMinLod.get(this.segment(), 0L, 0L); }
    public int features$sparseBinding() { return (int) VH_features$sparseBinding.get(this.segment(), 0L, 0L); }
    public int features$sparseResidencyBuffer() { return (int) VH_features$sparseResidencyBuffer.get(this.segment(), 0L, 0L); }
    public int features$sparseResidencyImage2D() { return (int) VH_features$sparseResidencyImage2D.get(this.segment(), 0L, 0L); }
    public int features$sparseResidencyImage3D() { return (int) VH_features$sparseResidencyImage3D.get(this.segment(), 0L, 0L); }
    public int features$sparseResidency2Samples() { return (int) VH_features$sparseResidency2Samples.get(this.segment(), 0L, 0L); }
    public int features$sparseResidency4Samples() { return (int) VH_features$sparseResidency4Samples.get(this.segment(), 0L, 0L); }
    public int features$sparseResidency8Samples() { return (int) VH_features$sparseResidency8Samples.get(this.segment(), 0L, 0L); }
    public int features$sparseResidency16Samples() { return (int) VH_features$sparseResidency16Samples.get(this.segment(), 0L, 0L); }
    public int features$sparseResidencyAliased() { return (int) VH_features$sparseResidencyAliased.get(this.segment(), 0L, 0L); }
    public int features$variableMultisampleRate() { return (int) VH_features$variableMultisampleRate.get(this.segment(), 0L, 0L); }
    public int features$inheritedQueries() { return (int) VH_features$inheritedQueries.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceFeatures2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$robustBufferAccessAt(long index, int value) { VH_features$robustBufferAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$fullDrawIndexUint32At(long index, int value) { VH_features$fullDrawIndexUint32.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$imageCubeArrayAt(long index, int value) { VH_features$imageCubeArray.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$independentBlendAt(long index, int value) { VH_features$independentBlend.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$geometryShaderAt(long index, int value) { VH_features$geometryShader.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$tessellationShaderAt(long index, int value) { VH_features$tessellationShader.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$sampleRateShadingAt(long index, int value) { VH_features$sampleRateShading.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$dualSrcBlendAt(long index, int value) { VH_features$dualSrcBlend.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$logicOpAt(long index, int value) { VH_features$logicOp.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$multiDrawIndirectAt(long index, int value) { VH_features$multiDrawIndirect.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$drawIndirectFirstInstanceAt(long index, int value) { VH_features$drawIndirectFirstInstance.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$depthClampAt(long index, int value) { VH_features$depthClamp.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$depthBiasClampAt(long index, int value) { VH_features$depthBiasClamp.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$fillModeNonSolidAt(long index, int value) { VH_features$fillModeNonSolid.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$depthBoundsAt(long index, int value) { VH_features$depthBounds.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$wideLinesAt(long index, int value) { VH_features$wideLines.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$largePointsAt(long index, int value) { VH_features$largePoints.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$alphaToOneAt(long index, int value) { VH_features$alphaToOne.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$multiViewportAt(long index, int value) { VH_features$multiViewport.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$samplerAnisotropyAt(long index, int value) { VH_features$samplerAnisotropy.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$textureCompressionETC2At(long index, int value) { VH_features$textureCompressionETC2.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$textureCompressionASTC_LDRAt(long index, int value) { VH_features$textureCompressionASTC_LDR.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$textureCompressionBCAt(long index, int value) { VH_features$textureCompressionBC.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$occlusionQueryPreciseAt(long index, int value) { VH_features$occlusionQueryPrecise.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$pipelineStatisticsQueryAt(long index, int value) { VH_features$pipelineStatisticsQuery.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$vertexPipelineStoresAndAtomicsAt(long index, int value) { VH_features$vertexPipelineStoresAndAtomics.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$fragmentStoresAndAtomicsAt(long index, int value) { VH_features$fragmentStoresAndAtomics.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderTessellationAndGeometryPointSizeAt(long index, int value) { VH_features$shaderTessellationAndGeometryPointSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderImageGatherExtendedAt(long index, int value) { VH_features$shaderImageGatherExtended.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderStorageImageExtendedFormatsAt(long index, int value) { VH_features$shaderStorageImageExtendedFormats.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderStorageImageMultisampleAt(long index, int value) { VH_features$shaderStorageImageMultisample.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderStorageImageReadWithoutFormatAt(long index, int value) { VH_features$shaderStorageImageReadWithoutFormat.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderStorageImageWriteWithoutFormatAt(long index, int value) { VH_features$shaderStorageImageWriteWithoutFormat.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderUniformBufferArrayDynamicIndexingAt(long index, int value) { VH_features$shaderUniformBufferArrayDynamicIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderSampledImageArrayDynamicIndexingAt(long index, int value) { VH_features$shaderSampledImageArrayDynamicIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderStorageBufferArrayDynamicIndexingAt(long index, int value) { VH_features$shaderStorageBufferArrayDynamicIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderStorageImageArrayDynamicIndexingAt(long index, int value) { VH_features$shaderStorageImageArrayDynamicIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderClipDistanceAt(long index, int value) { VH_features$shaderClipDistance.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderCullDistanceAt(long index, int value) { VH_features$shaderCullDistance.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderFloat64At(long index, int value) { VH_features$shaderFloat64.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderInt64At(long index, int value) { VH_features$shaderInt64.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderInt16At(long index, int value) { VH_features$shaderInt16.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderResourceResidencyAt(long index, int value) { VH_features$shaderResourceResidency.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderResourceMinLodAt(long index, int value) { VH_features$shaderResourceMinLod.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$sparseBindingAt(long index, int value) { VH_features$sparseBinding.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$sparseResidencyBufferAt(long index, int value) { VH_features$sparseResidencyBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$sparseResidencyImage2DAt(long index, int value) { VH_features$sparseResidencyImage2D.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$sparseResidencyImage3DAt(long index, int value) { VH_features$sparseResidencyImage3D.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$sparseResidency2SamplesAt(long index, int value) { VH_features$sparseResidency2Samples.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$sparseResidency4SamplesAt(long index, int value) { VH_features$sparseResidency4Samples.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$sparseResidency8SamplesAt(long index, int value) { VH_features$sparseResidency8Samples.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$sparseResidency16SamplesAt(long index, int value) { VH_features$sparseResidency16Samples.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$sparseResidencyAliasedAt(long index, int value) { VH_features$sparseResidencyAliased.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$variableMultisampleRateAt(long index, int value) { VH_features$variableMultisampleRate.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$inheritedQueriesAt(long index, int value) { VH_features$inheritedQueries.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFeatures2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$robustBufferAccess(int value) { VH_features$robustBufferAccess.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$fullDrawIndexUint32(int value) { VH_features$fullDrawIndexUint32.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$imageCubeArray(int value) { VH_features$imageCubeArray.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$independentBlend(int value) { VH_features$independentBlend.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$geometryShader(int value) { VH_features$geometryShader.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$tessellationShader(int value) { VH_features$tessellationShader.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$sampleRateShading(int value) { VH_features$sampleRateShading.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$dualSrcBlend(int value) { VH_features$dualSrcBlend.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$logicOp(int value) { VH_features$logicOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$multiDrawIndirect(int value) { VH_features$multiDrawIndirect.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$drawIndirectFirstInstance(int value) { VH_features$drawIndirectFirstInstance.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$depthClamp(int value) { VH_features$depthClamp.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$depthBiasClamp(int value) { VH_features$depthBiasClamp.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$fillModeNonSolid(int value) { VH_features$fillModeNonSolid.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$depthBounds(int value) { VH_features$depthBounds.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$wideLines(int value) { VH_features$wideLines.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$largePoints(int value) { VH_features$largePoints.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$alphaToOne(int value) { VH_features$alphaToOne.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$multiViewport(int value) { VH_features$multiViewport.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$samplerAnisotropy(int value) { VH_features$samplerAnisotropy.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$textureCompressionETC2(int value) { VH_features$textureCompressionETC2.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$textureCompressionASTC_LDR(int value) { VH_features$textureCompressionASTC_LDR.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$textureCompressionBC(int value) { VH_features$textureCompressionBC.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$occlusionQueryPrecise(int value) { VH_features$occlusionQueryPrecise.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$pipelineStatisticsQuery(int value) { VH_features$pipelineStatisticsQuery.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$vertexPipelineStoresAndAtomics(int value) { VH_features$vertexPipelineStoresAndAtomics.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$fragmentStoresAndAtomics(int value) { VH_features$fragmentStoresAndAtomics.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderTessellationAndGeometryPointSize(int value) { VH_features$shaderTessellationAndGeometryPointSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderImageGatherExtended(int value) { VH_features$shaderImageGatherExtended.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderStorageImageExtendedFormats(int value) { VH_features$shaderStorageImageExtendedFormats.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderStorageImageMultisample(int value) { VH_features$shaderStorageImageMultisample.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderStorageImageReadWithoutFormat(int value) { VH_features$shaderStorageImageReadWithoutFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderStorageImageWriteWithoutFormat(int value) { VH_features$shaderStorageImageWriteWithoutFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderUniformBufferArrayDynamicIndexing(int value) { VH_features$shaderUniformBufferArrayDynamicIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderSampledImageArrayDynamicIndexing(int value) { VH_features$shaderSampledImageArrayDynamicIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderStorageBufferArrayDynamicIndexing(int value) { VH_features$shaderStorageBufferArrayDynamicIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderStorageImageArrayDynamicIndexing(int value) { VH_features$shaderStorageImageArrayDynamicIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderClipDistance(int value) { VH_features$shaderClipDistance.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderCullDistance(int value) { VH_features$shaderCullDistance.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderFloat64(int value) { VH_features$shaderFloat64.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderInt64(int value) { VH_features$shaderInt64.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderInt16(int value) { VH_features$shaderInt16.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderResourceResidency(int value) { VH_features$shaderResourceResidency.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$shaderResourceMinLod(int value) { VH_features$shaderResourceMinLod.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$sparseBinding(int value) { VH_features$sparseBinding.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$sparseResidencyBuffer(int value) { VH_features$sparseResidencyBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$sparseResidencyImage2D(int value) { VH_features$sparseResidencyImage2D.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$sparseResidencyImage3D(int value) { VH_features$sparseResidencyImage3D.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$sparseResidency2Samples(int value) { VH_features$sparseResidency2Samples.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$sparseResidency4Samples(int value) { VH_features$sparseResidency4Samples.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$sparseResidency8Samples(int value) { VH_features$sparseResidency8Samples.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$sparseResidency16Samples(int value) { VH_features$sparseResidency16Samples.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$sparseResidencyAliased(int value) { VH_features$sparseResidencyAliased.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$variableMultisampleRate(int value) { VH_features$variableMultisampleRate.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFeatures2KHR features$inheritedQueries(int value) { VH_features$inheritedQueries.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceFeatures2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceFeatures2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _featuresAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_features, index), LAYOUT_features); }
    public MemorySegment _features() { return _featuresAt(0L); }
    public VkPhysicalDeviceFeatures2KHR _featuresAt(long index, MemorySegment src) { _featuresAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFeatures2KHR _features(MemorySegment src) { return _featuresAt(0L, src); }
}
