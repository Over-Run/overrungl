// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePortabilitySubsetFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePortabilitySubsetFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
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
/// }
/// ```
public final class VkPhysicalDevicePortabilitySubsetFeaturesKHR extends GroupType {
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
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_constantAlphaColorBlendFactors = LAYOUT.byteOffset(PathElement.groupElement("constantAlphaColorBlendFactors"));
    public static final long OFFSET_events = LAYOUT.byteOffset(PathElement.groupElement("events"));
    public static final long OFFSET_imageViewFormatReinterpretation = LAYOUT.byteOffset(PathElement.groupElement("imageViewFormatReinterpretation"));
    public static final long OFFSET_imageViewFormatSwizzle = LAYOUT.byteOffset(PathElement.groupElement("imageViewFormatSwizzle"));
    public static final long OFFSET_imageView2DOn3DImage = LAYOUT.byteOffset(PathElement.groupElement("imageView2DOn3DImage"));
    public static final long OFFSET_multisampleArrayImage = LAYOUT.byteOffset(PathElement.groupElement("multisampleArrayImage"));
    public static final long OFFSET_mutableComparisonSamplers = LAYOUT.byteOffset(PathElement.groupElement("mutableComparisonSamplers"));
    public static final long OFFSET_pointPolygons = LAYOUT.byteOffset(PathElement.groupElement("pointPolygons"));
    public static final long OFFSET_samplerMipLodBias = LAYOUT.byteOffset(PathElement.groupElement("samplerMipLodBias"));
    public static final long OFFSET_separateStencilMaskRef = LAYOUT.byteOffset(PathElement.groupElement("separateStencilMaskRef"));
    public static final long OFFSET_shaderSampleRateInterpolationFunctions = LAYOUT.byteOffset(PathElement.groupElement("shaderSampleRateInterpolationFunctions"));
    public static final long OFFSET_tessellationIsolines = LAYOUT.byteOffset(PathElement.groupElement("tessellationIsolines"));
    public static final long OFFSET_tessellationPointMode = LAYOUT.byteOffset(PathElement.groupElement("tessellationPointMode"));
    public static final long OFFSET_triangleFans = LAYOUT.byteOffset(PathElement.groupElement("triangleFans"));
    public static final long OFFSET_vertexAttributeAccessBeyondStride = LAYOUT.byteOffset(PathElement.groupElement("vertexAttributeAccessBeyondStride"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_constantAlphaColorBlendFactors = LAYOUT.select(PathElement.groupElement("constantAlphaColorBlendFactors"));
    public static final MemoryLayout LAYOUT_events = LAYOUT.select(PathElement.groupElement("events"));
    public static final MemoryLayout LAYOUT_imageViewFormatReinterpretation = LAYOUT.select(PathElement.groupElement("imageViewFormatReinterpretation"));
    public static final MemoryLayout LAYOUT_imageViewFormatSwizzle = LAYOUT.select(PathElement.groupElement("imageViewFormatSwizzle"));
    public static final MemoryLayout LAYOUT_imageView2DOn3DImage = LAYOUT.select(PathElement.groupElement("imageView2DOn3DImage"));
    public static final MemoryLayout LAYOUT_multisampleArrayImage = LAYOUT.select(PathElement.groupElement("multisampleArrayImage"));
    public static final MemoryLayout LAYOUT_mutableComparisonSamplers = LAYOUT.select(PathElement.groupElement("mutableComparisonSamplers"));
    public static final MemoryLayout LAYOUT_pointPolygons = LAYOUT.select(PathElement.groupElement("pointPolygons"));
    public static final MemoryLayout LAYOUT_samplerMipLodBias = LAYOUT.select(PathElement.groupElement("samplerMipLodBias"));
    public static final MemoryLayout LAYOUT_separateStencilMaskRef = LAYOUT.select(PathElement.groupElement("separateStencilMaskRef"));
    public static final MemoryLayout LAYOUT_shaderSampleRateInterpolationFunctions = LAYOUT.select(PathElement.groupElement("shaderSampleRateInterpolationFunctions"));
    public static final MemoryLayout LAYOUT_tessellationIsolines = LAYOUT.select(PathElement.groupElement("tessellationIsolines"));
    public static final MemoryLayout LAYOUT_tessellationPointMode = LAYOUT.select(PathElement.groupElement("tessellationPointMode"));
    public static final MemoryLayout LAYOUT_triangleFans = LAYOUT.select(PathElement.groupElement("triangleFans"));
    public static final MemoryLayout LAYOUT_vertexAttributeAccessBeyondStride = LAYOUT.select(PathElement.groupElement("vertexAttributeAccessBeyondStride"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_constantAlphaColorBlendFactors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constantAlphaColorBlendFactors"));
    public static final VarHandle VH_events = LAYOUT.arrayElementVarHandle(PathElement.groupElement("events"));
    public static final VarHandle VH_imageViewFormatReinterpretation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageViewFormatReinterpretation"));
    public static final VarHandle VH_imageViewFormatSwizzle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageViewFormatSwizzle"));
    public static final VarHandle VH_imageView2DOn3DImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageView2DOn3DImage"));
    public static final VarHandle VH_multisampleArrayImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multisampleArrayImage"));
    public static final VarHandle VH_mutableComparisonSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mutableComparisonSamplers"));
    public static final VarHandle VH_pointPolygons = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pointPolygons"));
    public static final VarHandle VH_samplerMipLodBias = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerMipLodBias"));
    public static final VarHandle VH_separateStencilMaskRef = LAYOUT.arrayElementVarHandle(PathElement.groupElement("separateStencilMaskRef"));
    public static final VarHandle VH_shaderSampleRateInterpolationFunctions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSampleRateInterpolationFunctions"));
    public static final VarHandle VH_tessellationIsolines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tessellationIsolines"));
    public static final VarHandle VH_tessellationPointMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tessellationPointMode"));
    public static final VarHandle VH_triangleFans = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangleFans"));
    public static final VarHandle VH_vertexAttributeAccessBeyondStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexAttributeAccessBeyondStride"));

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePortabilitySubsetFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePortabilitySubsetFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePortabilitySubsetFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPortabilitySubset.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PORTABILITY_SUBSET_FEATURES_KHR); }
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPortabilitySubset.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PORTABILITY_SUBSET_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR copyFrom(VkPhysicalDevicePortabilitySubsetFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR reinterpret(long count) { return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR asSlice(long index) { return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR at(long index, Consumer<VkPhysicalDevicePortabilitySubsetFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int constantAlphaColorBlendFactorsAt(long index) { return (int) VH_constantAlphaColorBlendFactors.get(this.segment(), 0L, index); }
    public int eventsAt(long index) { return (int) VH_events.get(this.segment(), 0L, index); }
    public int imageViewFormatReinterpretationAt(long index) { return (int) VH_imageViewFormatReinterpretation.get(this.segment(), 0L, index); }
    public int imageViewFormatSwizzleAt(long index) { return (int) VH_imageViewFormatSwizzle.get(this.segment(), 0L, index); }
    public int imageView2DOn3DImageAt(long index) { return (int) VH_imageView2DOn3DImage.get(this.segment(), 0L, index); }
    public int multisampleArrayImageAt(long index) { return (int) VH_multisampleArrayImage.get(this.segment(), 0L, index); }
    public int mutableComparisonSamplersAt(long index) { return (int) VH_mutableComparisonSamplers.get(this.segment(), 0L, index); }
    public int pointPolygonsAt(long index) { return (int) VH_pointPolygons.get(this.segment(), 0L, index); }
    public int samplerMipLodBiasAt(long index) { return (int) VH_samplerMipLodBias.get(this.segment(), 0L, index); }
    public int separateStencilMaskRefAt(long index) { return (int) VH_separateStencilMaskRef.get(this.segment(), 0L, index); }
    public int shaderSampleRateInterpolationFunctionsAt(long index) { return (int) VH_shaderSampleRateInterpolationFunctions.get(this.segment(), 0L, index); }
    public int tessellationIsolinesAt(long index) { return (int) VH_tessellationIsolines.get(this.segment(), 0L, index); }
    public int tessellationPointModeAt(long index) { return (int) VH_tessellationPointMode.get(this.segment(), 0L, index); }
    public int triangleFansAt(long index) { return (int) VH_triangleFans.get(this.segment(), 0L, index); }
    public int vertexAttributeAccessBeyondStrideAt(long index) { return (int) VH_vertexAttributeAccessBeyondStride.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int constantAlphaColorBlendFactors() { return (int) VH_constantAlphaColorBlendFactors.get(this.segment(), 0L, 0L); }
    public int events() { return (int) VH_events.get(this.segment(), 0L, 0L); }
    public int imageViewFormatReinterpretation() { return (int) VH_imageViewFormatReinterpretation.get(this.segment(), 0L, 0L); }
    public int imageViewFormatSwizzle() { return (int) VH_imageViewFormatSwizzle.get(this.segment(), 0L, 0L); }
    public int imageView2DOn3DImage() { return (int) VH_imageView2DOn3DImage.get(this.segment(), 0L, 0L); }
    public int multisampleArrayImage() { return (int) VH_multisampleArrayImage.get(this.segment(), 0L, 0L); }
    public int mutableComparisonSamplers() { return (int) VH_mutableComparisonSamplers.get(this.segment(), 0L, 0L); }
    public int pointPolygons() { return (int) VH_pointPolygons.get(this.segment(), 0L, 0L); }
    public int samplerMipLodBias() { return (int) VH_samplerMipLodBias.get(this.segment(), 0L, 0L); }
    public int separateStencilMaskRef() { return (int) VH_separateStencilMaskRef.get(this.segment(), 0L, 0L); }
    public int shaderSampleRateInterpolationFunctions() { return (int) VH_shaderSampleRateInterpolationFunctions.get(this.segment(), 0L, 0L); }
    public int tessellationIsolines() { return (int) VH_tessellationIsolines.get(this.segment(), 0L, 0L); }
    public int tessellationPointMode() { return (int) VH_tessellationPointMode.get(this.segment(), 0L, 0L); }
    public int triangleFans() { return (int) VH_triangleFans.get(this.segment(), 0L, 0L); }
    public int vertexAttributeAccessBeyondStride() { return (int) VH_vertexAttributeAccessBeyondStride.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR constantAlphaColorBlendFactorsAt(long index, int value) { VH_constantAlphaColorBlendFactors.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR eventsAt(long index, int value) { VH_events.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageViewFormatReinterpretationAt(long index, int value) { VH_imageViewFormatReinterpretation.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageViewFormatSwizzleAt(long index, int value) { VH_imageViewFormatSwizzle.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageView2DOn3DImageAt(long index, int value) { VH_imageView2DOn3DImage.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR multisampleArrayImageAt(long index, int value) { VH_multisampleArrayImage.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR mutableComparisonSamplersAt(long index, int value) { VH_mutableComparisonSamplers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR pointPolygonsAt(long index, int value) { VH_pointPolygons.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR samplerMipLodBiasAt(long index, int value) { VH_samplerMipLodBias.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR separateStencilMaskRefAt(long index, int value) { VH_separateStencilMaskRef.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR shaderSampleRateInterpolationFunctionsAt(long index, int value) { VH_shaderSampleRateInterpolationFunctions.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR tessellationIsolinesAt(long index, int value) { VH_tessellationIsolines.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR tessellationPointModeAt(long index, int value) { VH_tessellationPointMode.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR triangleFansAt(long index, int value) { VH_triangleFans.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR vertexAttributeAccessBeyondStrideAt(long index, int value) { VH_vertexAttributeAccessBeyondStride.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR constantAlphaColorBlendFactors(int value) { VH_constantAlphaColorBlendFactors.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR events(int value) { VH_events.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageViewFormatReinterpretation(int value) { VH_imageViewFormatReinterpretation.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageViewFormatSwizzle(int value) { VH_imageViewFormatSwizzle.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageView2DOn3DImage(int value) { VH_imageView2DOn3DImage.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR multisampleArrayImage(int value) { VH_multisampleArrayImage.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR mutableComparisonSamplers(int value) { VH_mutableComparisonSamplers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR pointPolygons(int value) { VH_pointPolygons.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR samplerMipLodBias(int value) { VH_samplerMipLodBias.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR separateStencilMaskRef(int value) { VH_separateStencilMaskRef.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR shaderSampleRateInterpolationFunctions(int value) { VH_shaderSampleRateInterpolationFunctions.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR tessellationIsolines(int value) { VH_tessellationIsolines.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR tessellationPointMode(int value) { VH_tessellationPointMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR triangleFans(int value) { VH_triangleFans.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR vertexAttributeAccessBeyondStride(int value) { VH_vertexAttributeAccessBeyondStride.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _constantAlphaColorBlendFactorsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_constantAlphaColorBlendFactors, index), LAYOUT_constantAlphaColorBlendFactors); }
    public MemorySegment _constantAlphaColorBlendFactors() { return _constantAlphaColorBlendFactorsAt(0L); }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _constantAlphaColorBlendFactorsAt(long index, MemorySegment src) { _constantAlphaColorBlendFactorsAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _constantAlphaColorBlendFactors(MemorySegment src) { return _constantAlphaColorBlendFactorsAt(0L, src); }
    public MemorySegment _eventsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_events, index), LAYOUT_events); }
    public MemorySegment _events() { return _eventsAt(0L); }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _eventsAt(long index, MemorySegment src) { _eventsAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _events(MemorySegment src) { return _eventsAt(0L, src); }
    public MemorySegment _imageViewFormatReinterpretationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageViewFormatReinterpretation, index), LAYOUT_imageViewFormatReinterpretation); }
    public MemorySegment _imageViewFormatReinterpretation() { return _imageViewFormatReinterpretationAt(0L); }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _imageViewFormatReinterpretationAt(long index, MemorySegment src) { _imageViewFormatReinterpretationAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _imageViewFormatReinterpretation(MemorySegment src) { return _imageViewFormatReinterpretationAt(0L, src); }
    public MemorySegment _imageViewFormatSwizzleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageViewFormatSwizzle, index), LAYOUT_imageViewFormatSwizzle); }
    public MemorySegment _imageViewFormatSwizzle() { return _imageViewFormatSwizzleAt(0L); }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _imageViewFormatSwizzleAt(long index, MemorySegment src) { _imageViewFormatSwizzleAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _imageViewFormatSwizzle(MemorySegment src) { return _imageViewFormatSwizzleAt(0L, src); }
    public MemorySegment _imageView2DOn3DImageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageView2DOn3DImage, index), LAYOUT_imageView2DOn3DImage); }
    public MemorySegment _imageView2DOn3DImage() { return _imageView2DOn3DImageAt(0L); }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _imageView2DOn3DImageAt(long index, MemorySegment src) { _imageView2DOn3DImageAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _imageView2DOn3DImage(MemorySegment src) { return _imageView2DOn3DImageAt(0L, src); }
    public MemorySegment _multisampleArrayImageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_multisampleArrayImage, index), LAYOUT_multisampleArrayImage); }
    public MemorySegment _multisampleArrayImage() { return _multisampleArrayImageAt(0L); }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _multisampleArrayImageAt(long index, MemorySegment src) { _multisampleArrayImageAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _multisampleArrayImage(MemorySegment src) { return _multisampleArrayImageAt(0L, src); }
    public MemorySegment _mutableComparisonSamplersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mutableComparisonSamplers, index), LAYOUT_mutableComparisonSamplers); }
    public MemorySegment _mutableComparisonSamplers() { return _mutableComparisonSamplersAt(0L); }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _mutableComparisonSamplersAt(long index, MemorySegment src) { _mutableComparisonSamplersAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _mutableComparisonSamplers(MemorySegment src) { return _mutableComparisonSamplersAt(0L, src); }
    public MemorySegment _pointPolygonsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pointPolygons, index), LAYOUT_pointPolygons); }
    public MemorySegment _pointPolygons() { return _pointPolygonsAt(0L); }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _pointPolygonsAt(long index, MemorySegment src) { _pointPolygonsAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _pointPolygons(MemorySegment src) { return _pointPolygonsAt(0L, src); }
    public MemorySegment _samplerMipLodBiasAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_samplerMipLodBias, index), LAYOUT_samplerMipLodBias); }
    public MemorySegment _samplerMipLodBias() { return _samplerMipLodBiasAt(0L); }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _samplerMipLodBiasAt(long index, MemorySegment src) { _samplerMipLodBiasAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _samplerMipLodBias(MemorySegment src) { return _samplerMipLodBiasAt(0L, src); }
    public MemorySegment _separateStencilMaskRefAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_separateStencilMaskRef, index), LAYOUT_separateStencilMaskRef); }
    public MemorySegment _separateStencilMaskRef() { return _separateStencilMaskRefAt(0L); }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _separateStencilMaskRefAt(long index, MemorySegment src) { _separateStencilMaskRefAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _separateStencilMaskRef(MemorySegment src) { return _separateStencilMaskRefAt(0L, src); }
    public MemorySegment _shaderSampleRateInterpolationFunctionsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSampleRateInterpolationFunctions, index), LAYOUT_shaderSampleRateInterpolationFunctions); }
    public MemorySegment _shaderSampleRateInterpolationFunctions() { return _shaderSampleRateInterpolationFunctionsAt(0L); }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _shaderSampleRateInterpolationFunctionsAt(long index, MemorySegment src) { _shaderSampleRateInterpolationFunctionsAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _shaderSampleRateInterpolationFunctions(MemorySegment src) { return _shaderSampleRateInterpolationFunctionsAt(0L, src); }
    public MemorySegment _tessellationIsolinesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tessellationIsolines, index), LAYOUT_tessellationIsolines); }
    public MemorySegment _tessellationIsolines() { return _tessellationIsolinesAt(0L); }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _tessellationIsolinesAt(long index, MemorySegment src) { _tessellationIsolinesAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _tessellationIsolines(MemorySegment src) { return _tessellationIsolinesAt(0L, src); }
    public MemorySegment _tessellationPointModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tessellationPointMode, index), LAYOUT_tessellationPointMode); }
    public MemorySegment _tessellationPointMode() { return _tessellationPointModeAt(0L); }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _tessellationPointModeAt(long index, MemorySegment src) { _tessellationPointModeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _tessellationPointMode(MemorySegment src) { return _tessellationPointModeAt(0L, src); }
    public MemorySegment _triangleFansAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_triangleFans, index), LAYOUT_triangleFans); }
    public MemorySegment _triangleFans() { return _triangleFansAt(0L); }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _triangleFansAt(long index, MemorySegment src) { _triangleFansAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _triangleFans(MemorySegment src) { return _triangleFansAt(0L, src); }
    public MemorySegment _vertexAttributeAccessBeyondStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexAttributeAccessBeyondStride, index), LAYOUT_vertexAttributeAccessBeyondStride); }
    public MemorySegment _vertexAttributeAccessBeyondStride() { return _vertexAttributeAccessBeyondStrideAt(0L); }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _vertexAttributeAccessBeyondStrideAt(long index, MemorySegment src) { _vertexAttributeAccessBeyondStrideAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR _vertexAttributeAccessBeyondStride(MemorySegment src) { return _vertexAttributeAccessBeyondStrideAt(0L, src); }
}
