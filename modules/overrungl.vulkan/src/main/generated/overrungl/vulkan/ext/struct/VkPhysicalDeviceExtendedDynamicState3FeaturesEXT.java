// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceExtendedDynamicState3FeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceExtendedDynamicState3FeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 extendedDynamicState3TessellationDomainOrigin;
///     VkBool32 extendedDynamicState3DepthClampEnable;
///     VkBool32 extendedDynamicState3PolygonMode;
///     VkBool32 extendedDynamicState3RasterizationSamples;
///     VkBool32 extendedDynamicState3SampleMask;
///     VkBool32 extendedDynamicState3AlphaToCoverageEnable;
///     VkBool32 extendedDynamicState3AlphaToOneEnable;
///     VkBool32 extendedDynamicState3LogicOpEnable;
///     VkBool32 extendedDynamicState3ColorBlendEnable;
///     VkBool32 extendedDynamicState3ColorBlendEquation;
///     VkBool32 extendedDynamicState3ColorWriteMask;
///     VkBool32 extendedDynamicState3RasterizationStream;
///     VkBool32 extendedDynamicState3ConservativeRasterizationMode;
///     VkBool32 extendedDynamicState3ExtraPrimitiveOverestimationSize;
///     VkBool32 extendedDynamicState3DepthClipEnable;
///     VkBool32 extendedDynamicState3SampleLocationsEnable;
///     VkBool32 extendedDynamicState3ColorBlendAdvanced;
///     VkBool32 extendedDynamicState3ProvokingVertexMode;
///     VkBool32 extendedDynamicState3LineRasterizationMode;
///     VkBool32 extendedDynamicState3LineStippleEnable;
///     VkBool32 extendedDynamicState3DepthClipNegativeOneToOne;
///     VkBool32 extendedDynamicState3ViewportWScalingEnable;
///     VkBool32 extendedDynamicState3ViewportSwizzle;
///     VkBool32 extendedDynamicState3CoverageToColorEnable;
///     VkBool32 extendedDynamicState3CoverageToColorLocation;
///     VkBool32 extendedDynamicState3CoverageModulationMode;
///     VkBool32 extendedDynamicState3CoverageModulationTableEnable;
///     VkBool32 extendedDynamicState3CoverageModulationTable;
///     VkBool32 extendedDynamicState3CoverageReductionMode;
///     VkBool32 extendedDynamicState3RepresentativeFragmentTestEnable;
///     VkBool32 extendedDynamicState3ShadingRateImageEnable;
/// }
/// ```
public final class VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3TessellationDomainOrigin"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3DepthClampEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3PolygonMode"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3RasterizationSamples"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3SampleMask"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3AlphaToCoverageEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3AlphaToOneEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3LogicOpEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3ColorBlendEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3ColorBlendEquation"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3ColorWriteMask"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3RasterizationStream"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3ConservativeRasterizationMode"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3ExtraPrimitiveOverestimationSize"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3DepthClipEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3SampleLocationsEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3ColorBlendAdvanced"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3ProvokingVertexMode"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3LineRasterizationMode"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3LineStippleEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3DepthClipNegativeOneToOne"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3ViewportWScalingEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3ViewportSwizzle"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3CoverageToColorEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3CoverageToColorLocation"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3CoverageModulationMode"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3CoverageModulationTableEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3CoverageModulationTable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3CoverageReductionMode"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3RepresentativeFragmentTestEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3ShadingRateImageEnable")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_extendedDynamicState3TessellationDomainOrigin = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3TessellationDomainOrigin"));
    public static final long OFFSET_extendedDynamicState3DepthClampEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3DepthClampEnable"));
    public static final long OFFSET_extendedDynamicState3PolygonMode = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3PolygonMode"));
    public static final long OFFSET_extendedDynamicState3RasterizationSamples = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3RasterizationSamples"));
    public static final long OFFSET_extendedDynamicState3SampleMask = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3SampleMask"));
    public static final long OFFSET_extendedDynamicState3AlphaToCoverageEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3AlphaToCoverageEnable"));
    public static final long OFFSET_extendedDynamicState3AlphaToOneEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3AlphaToOneEnable"));
    public static final long OFFSET_extendedDynamicState3LogicOpEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3LogicOpEnable"));
    public static final long OFFSET_extendedDynamicState3ColorBlendEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ColorBlendEnable"));
    public static final long OFFSET_extendedDynamicState3ColorBlendEquation = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ColorBlendEquation"));
    public static final long OFFSET_extendedDynamicState3ColorWriteMask = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ColorWriteMask"));
    public static final long OFFSET_extendedDynamicState3RasterizationStream = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3RasterizationStream"));
    public static final long OFFSET_extendedDynamicState3ConservativeRasterizationMode = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ConservativeRasterizationMode"));
    public static final long OFFSET_extendedDynamicState3ExtraPrimitiveOverestimationSize = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ExtraPrimitiveOverestimationSize"));
    public static final long OFFSET_extendedDynamicState3DepthClipEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3DepthClipEnable"));
    public static final long OFFSET_extendedDynamicState3SampleLocationsEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3SampleLocationsEnable"));
    public static final long OFFSET_extendedDynamicState3ColorBlendAdvanced = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ColorBlendAdvanced"));
    public static final long OFFSET_extendedDynamicState3ProvokingVertexMode = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ProvokingVertexMode"));
    public static final long OFFSET_extendedDynamicState3LineRasterizationMode = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3LineRasterizationMode"));
    public static final long OFFSET_extendedDynamicState3LineStippleEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3LineStippleEnable"));
    public static final long OFFSET_extendedDynamicState3DepthClipNegativeOneToOne = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3DepthClipNegativeOneToOne"));
    public static final long OFFSET_extendedDynamicState3ViewportWScalingEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ViewportWScalingEnable"));
    public static final long OFFSET_extendedDynamicState3ViewportSwizzle = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ViewportSwizzle"));
    public static final long OFFSET_extendedDynamicState3CoverageToColorEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3CoverageToColorEnable"));
    public static final long OFFSET_extendedDynamicState3CoverageToColorLocation = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3CoverageToColorLocation"));
    public static final long OFFSET_extendedDynamicState3CoverageModulationMode = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3CoverageModulationMode"));
    public static final long OFFSET_extendedDynamicState3CoverageModulationTableEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3CoverageModulationTableEnable"));
    public static final long OFFSET_extendedDynamicState3CoverageModulationTable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3CoverageModulationTable"));
    public static final long OFFSET_extendedDynamicState3CoverageReductionMode = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3CoverageReductionMode"));
    public static final long OFFSET_extendedDynamicState3RepresentativeFragmentTestEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3RepresentativeFragmentTestEnable"));
    public static final long OFFSET_extendedDynamicState3ShadingRateImageEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ShadingRateImageEnable"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3TessellationDomainOrigin = LAYOUT.select(PathElement.groupElement("extendedDynamicState3TessellationDomainOrigin"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3DepthClampEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3DepthClampEnable"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3PolygonMode = LAYOUT.select(PathElement.groupElement("extendedDynamicState3PolygonMode"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3RasterizationSamples = LAYOUT.select(PathElement.groupElement("extendedDynamicState3RasterizationSamples"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3SampleMask = LAYOUT.select(PathElement.groupElement("extendedDynamicState3SampleMask"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3AlphaToCoverageEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3AlphaToCoverageEnable"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3AlphaToOneEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3AlphaToOneEnable"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3LogicOpEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3LogicOpEnable"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3ColorBlendEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3ColorBlendEnable"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3ColorBlendEquation = LAYOUT.select(PathElement.groupElement("extendedDynamicState3ColorBlendEquation"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3ColorWriteMask = LAYOUT.select(PathElement.groupElement("extendedDynamicState3ColorWriteMask"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3RasterizationStream = LAYOUT.select(PathElement.groupElement("extendedDynamicState3RasterizationStream"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3ConservativeRasterizationMode = LAYOUT.select(PathElement.groupElement("extendedDynamicState3ConservativeRasterizationMode"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3ExtraPrimitiveOverestimationSize = LAYOUT.select(PathElement.groupElement("extendedDynamicState3ExtraPrimitiveOverestimationSize"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3DepthClipEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3DepthClipEnable"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3SampleLocationsEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3SampleLocationsEnable"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3ColorBlendAdvanced = LAYOUT.select(PathElement.groupElement("extendedDynamicState3ColorBlendAdvanced"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3ProvokingVertexMode = LAYOUT.select(PathElement.groupElement("extendedDynamicState3ProvokingVertexMode"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3LineRasterizationMode = LAYOUT.select(PathElement.groupElement("extendedDynamicState3LineRasterizationMode"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3LineStippleEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3LineStippleEnable"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3DepthClipNegativeOneToOne = LAYOUT.select(PathElement.groupElement("extendedDynamicState3DepthClipNegativeOneToOne"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3ViewportWScalingEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3ViewportWScalingEnable"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3ViewportSwizzle = LAYOUT.select(PathElement.groupElement("extendedDynamicState3ViewportSwizzle"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3CoverageToColorEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3CoverageToColorEnable"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3CoverageToColorLocation = LAYOUT.select(PathElement.groupElement("extendedDynamicState3CoverageToColorLocation"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3CoverageModulationMode = LAYOUT.select(PathElement.groupElement("extendedDynamicState3CoverageModulationMode"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3CoverageModulationTableEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3CoverageModulationTableEnable"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3CoverageModulationTable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3CoverageModulationTable"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3CoverageReductionMode = LAYOUT.select(PathElement.groupElement("extendedDynamicState3CoverageReductionMode"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3RepresentativeFragmentTestEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3RepresentativeFragmentTestEnable"));
    public static final MemoryLayout LAYOUT_extendedDynamicState3ShadingRateImageEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3ShadingRateImageEnable"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_extendedDynamicState3TessellationDomainOrigin = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3TessellationDomainOrigin"));
    public static final VarHandle VH_extendedDynamicState3DepthClampEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3DepthClampEnable"));
    public static final VarHandle VH_extendedDynamicState3PolygonMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3PolygonMode"));
    public static final VarHandle VH_extendedDynamicState3RasterizationSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3RasterizationSamples"));
    public static final VarHandle VH_extendedDynamicState3SampleMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3SampleMask"));
    public static final VarHandle VH_extendedDynamicState3AlphaToCoverageEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3AlphaToCoverageEnable"));
    public static final VarHandle VH_extendedDynamicState3AlphaToOneEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3AlphaToOneEnable"));
    public static final VarHandle VH_extendedDynamicState3LogicOpEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3LogicOpEnable"));
    public static final VarHandle VH_extendedDynamicState3ColorBlendEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3ColorBlendEnable"));
    public static final VarHandle VH_extendedDynamicState3ColorBlendEquation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3ColorBlendEquation"));
    public static final VarHandle VH_extendedDynamicState3ColorWriteMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3ColorWriteMask"));
    public static final VarHandle VH_extendedDynamicState3RasterizationStream = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3RasterizationStream"));
    public static final VarHandle VH_extendedDynamicState3ConservativeRasterizationMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3ConservativeRasterizationMode"));
    public static final VarHandle VH_extendedDynamicState3ExtraPrimitiveOverestimationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3ExtraPrimitiveOverestimationSize"));
    public static final VarHandle VH_extendedDynamicState3DepthClipEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3DepthClipEnable"));
    public static final VarHandle VH_extendedDynamicState3SampleLocationsEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3SampleLocationsEnable"));
    public static final VarHandle VH_extendedDynamicState3ColorBlendAdvanced = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3ColorBlendAdvanced"));
    public static final VarHandle VH_extendedDynamicState3ProvokingVertexMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3ProvokingVertexMode"));
    public static final VarHandle VH_extendedDynamicState3LineRasterizationMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3LineRasterizationMode"));
    public static final VarHandle VH_extendedDynamicState3LineStippleEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3LineStippleEnable"));
    public static final VarHandle VH_extendedDynamicState3DepthClipNegativeOneToOne = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3DepthClipNegativeOneToOne"));
    public static final VarHandle VH_extendedDynamicState3ViewportWScalingEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3ViewportWScalingEnable"));
    public static final VarHandle VH_extendedDynamicState3ViewportSwizzle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3ViewportSwizzle"));
    public static final VarHandle VH_extendedDynamicState3CoverageToColorEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3CoverageToColorEnable"));
    public static final VarHandle VH_extendedDynamicState3CoverageToColorLocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3CoverageToColorLocation"));
    public static final VarHandle VH_extendedDynamicState3CoverageModulationMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3CoverageModulationMode"));
    public static final VarHandle VH_extendedDynamicState3CoverageModulationTableEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3CoverageModulationTableEnable"));
    public static final VarHandle VH_extendedDynamicState3CoverageModulationTable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3CoverageModulationTable"));
    public static final VarHandle VH_extendedDynamicState3CoverageReductionMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3CoverageReductionMode"));
    public static final VarHandle VH_extendedDynamicState3RepresentativeFragmentTestEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3RepresentativeFragmentTestEnable"));
    public static final VarHandle VH_extendedDynamicState3ShadingRateImageEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3ShadingRateImageEnable"));

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTExtendedDynamicState3.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_FEATURES_EXT); }
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTExtendedDynamicState3.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT copyFrom(VkPhysicalDeviceExtendedDynamicState3FeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT asSlice(long index) { return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT at(long index, Consumer<VkPhysicalDeviceExtendedDynamicState3FeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int extendedDynamicState3TessellationDomainOriginAt(long index) { return (int) VH_extendedDynamicState3TessellationDomainOrigin.get(this.segment(), 0L, index); }
    public int extendedDynamicState3DepthClampEnableAt(long index) { return (int) VH_extendedDynamicState3DepthClampEnable.get(this.segment(), 0L, index); }
    public int extendedDynamicState3PolygonModeAt(long index) { return (int) VH_extendedDynamicState3PolygonMode.get(this.segment(), 0L, index); }
    public int extendedDynamicState3RasterizationSamplesAt(long index) { return (int) VH_extendedDynamicState3RasterizationSamples.get(this.segment(), 0L, index); }
    public int extendedDynamicState3SampleMaskAt(long index) { return (int) VH_extendedDynamicState3SampleMask.get(this.segment(), 0L, index); }
    public int extendedDynamicState3AlphaToCoverageEnableAt(long index) { return (int) VH_extendedDynamicState3AlphaToCoverageEnable.get(this.segment(), 0L, index); }
    public int extendedDynamicState3AlphaToOneEnableAt(long index) { return (int) VH_extendedDynamicState3AlphaToOneEnable.get(this.segment(), 0L, index); }
    public int extendedDynamicState3LogicOpEnableAt(long index) { return (int) VH_extendedDynamicState3LogicOpEnable.get(this.segment(), 0L, index); }
    public int extendedDynamicState3ColorBlendEnableAt(long index) { return (int) VH_extendedDynamicState3ColorBlendEnable.get(this.segment(), 0L, index); }
    public int extendedDynamicState3ColorBlendEquationAt(long index) { return (int) VH_extendedDynamicState3ColorBlendEquation.get(this.segment(), 0L, index); }
    public int extendedDynamicState3ColorWriteMaskAt(long index) { return (int) VH_extendedDynamicState3ColorWriteMask.get(this.segment(), 0L, index); }
    public int extendedDynamicState3RasterizationStreamAt(long index) { return (int) VH_extendedDynamicState3RasterizationStream.get(this.segment(), 0L, index); }
    public int extendedDynamicState3ConservativeRasterizationModeAt(long index) { return (int) VH_extendedDynamicState3ConservativeRasterizationMode.get(this.segment(), 0L, index); }
    public int extendedDynamicState3ExtraPrimitiveOverestimationSizeAt(long index) { return (int) VH_extendedDynamicState3ExtraPrimitiveOverestimationSize.get(this.segment(), 0L, index); }
    public int extendedDynamicState3DepthClipEnableAt(long index) { return (int) VH_extendedDynamicState3DepthClipEnable.get(this.segment(), 0L, index); }
    public int extendedDynamicState3SampleLocationsEnableAt(long index) { return (int) VH_extendedDynamicState3SampleLocationsEnable.get(this.segment(), 0L, index); }
    public int extendedDynamicState3ColorBlendAdvancedAt(long index) { return (int) VH_extendedDynamicState3ColorBlendAdvanced.get(this.segment(), 0L, index); }
    public int extendedDynamicState3ProvokingVertexModeAt(long index) { return (int) VH_extendedDynamicState3ProvokingVertexMode.get(this.segment(), 0L, index); }
    public int extendedDynamicState3LineRasterizationModeAt(long index) { return (int) VH_extendedDynamicState3LineRasterizationMode.get(this.segment(), 0L, index); }
    public int extendedDynamicState3LineStippleEnableAt(long index) { return (int) VH_extendedDynamicState3LineStippleEnable.get(this.segment(), 0L, index); }
    public int extendedDynamicState3DepthClipNegativeOneToOneAt(long index) { return (int) VH_extendedDynamicState3DepthClipNegativeOneToOne.get(this.segment(), 0L, index); }
    public int extendedDynamicState3ViewportWScalingEnableAt(long index) { return (int) VH_extendedDynamicState3ViewportWScalingEnable.get(this.segment(), 0L, index); }
    public int extendedDynamicState3ViewportSwizzleAt(long index) { return (int) VH_extendedDynamicState3ViewportSwizzle.get(this.segment(), 0L, index); }
    public int extendedDynamicState3CoverageToColorEnableAt(long index) { return (int) VH_extendedDynamicState3CoverageToColorEnable.get(this.segment(), 0L, index); }
    public int extendedDynamicState3CoverageToColorLocationAt(long index) { return (int) VH_extendedDynamicState3CoverageToColorLocation.get(this.segment(), 0L, index); }
    public int extendedDynamicState3CoverageModulationModeAt(long index) { return (int) VH_extendedDynamicState3CoverageModulationMode.get(this.segment(), 0L, index); }
    public int extendedDynamicState3CoverageModulationTableEnableAt(long index) { return (int) VH_extendedDynamicState3CoverageModulationTableEnable.get(this.segment(), 0L, index); }
    public int extendedDynamicState3CoverageModulationTableAt(long index) { return (int) VH_extendedDynamicState3CoverageModulationTable.get(this.segment(), 0L, index); }
    public int extendedDynamicState3CoverageReductionModeAt(long index) { return (int) VH_extendedDynamicState3CoverageReductionMode.get(this.segment(), 0L, index); }
    public int extendedDynamicState3RepresentativeFragmentTestEnableAt(long index) { return (int) VH_extendedDynamicState3RepresentativeFragmentTestEnable.get(this.segment(), 0L, index); }
    public int extendedDynamicState3ShadingRateImageEnableAt(long index) { return (int) VH_extendedDynamicState3ShadingRateImageEnable.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3TessellationDomainOrigin() { return (int) VH_extendedDynamicState3TessellationDomainOrigin.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3DepthClampEnable() { return (int) VH_extendedDynamicState3DepthClampEnable.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3PolygonMode() { return (int) VH_extendedDynamicState3PolygonMode.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3RasterizationSamples() { return (int) VH_extendedDynamicState3RasterizationSamples.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3SampleMask() { return (int) VH_extendedDynamicState3SampleMask.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3AlphaToCoverageEnable() { return (int) VH_extendedDynamicState3AlphaToCoverageEnable.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3AlphaToOneEnable() { return (int) VH_extendedDynamicState3AlphaToOneEnable.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3LogicOpEnable() { return (int) VH_extendedDynamicState3LogicOpEnable.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3ColorBlendEnable() { return (int) VH_extendedDynamicState3ColorBlendEnable.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3ColorBlendEquation() { return (int) VH_extendedDynamicState3ColorBlendEquation.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3ColorWriteMask() { return (int) VH_extendedDynamicState3ColorWriteMask.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3RasterizationStream() { return (int) VH_extendedDynamicState3RasterizationStream.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3ConservativeRasterizationMode() { return (int) VH_extendedDynamicState3ConservativeRasterizationMode.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3ExtraPrimitiveOverestimationSize() { return (int) VH_extendedDynamicState3ExtraPrimitiveOverestimationSize.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3DepthClipEnable() { return (int) VH_extendedDynamicState3DepthClipEnable.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3SampleLocationsEnable() { return (int) VH_extendedDynamicState3SampleLocationsEnable.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3ColorBlendAdvanced() { return (int) VH_extendedDynamicState3ColorBlendAdvanced.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3ProvokingVertexMode() { return (int) VH_extendedDynamicState3ProvokingVertexMode.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3LineRasterizationMode() { return (int) VH_extendedDynamicState3LineRasterizationMode.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3LineStippleEnable() { return (int) VH_extendedDynamicState3LineStippleEnable.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3DepthClipNegativeOneToOne() { return (int) VH_extendedDynamicState3DepthClipNegativeOneToOne.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3ViewportWScalingEnable() { return (int) VH_extendedDynamicState3ViewportWScalingEnable.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3ViewportSwizzle() { return (int) VH_extendedDynamicState3ViewportSwizzle.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3CoverageToColorEnable() { return (int) VH_extendedDynamicState3CoverageToColorEnable.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3CoverageToColorLocation() { return (int) VH_extendedDynamicState3CoverageToColorLocation.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3CoverageModulationMode() { return (int) VH_extendedDynamicState3CoverageModulationMode.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3CoverageModulationTableEnable() { return (int) VH_extendedDynamicState3CoverageModulationTableEnable.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3CoverageModulationTable() { return (int) VH_extendedDynamicState3CoverageModulationTable.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3CoverageReductionMode() { return (int) VH_extendedDynamicState3CoverageReductionMode.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3RepresentativeFragmentTestEnable() { return (int) VH_extendedDynamicState3RepresentativeFragmentTestEnable.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState3ShadingRateImageEnable() { return (int) VH_extendedDynamicState3ShadingRateImageEnable.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3TessellationDomainOriginAt(long index, int value) { VH_extendedDynamicState3TessellationDomainOrigin.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClampEnableAt(long index, int value) { VH_extendedDynamicState3DepthClampEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3PolygonModeAt(long index, int value) { VH_extendedDynamicState3PolygonMode.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RasterizationSamplesAt(long index, int value) { VH_extendedDynamicState3RasterizationSamples.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3SampleMaskAt(long index, int value) { VH_extendedDynamicState3SampleMask.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3AlphaToCoverageEnableAt(long index, int value) { VH_extendedDynamicState3AlphaToCoverageEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3AlphaToOneEnableAt(long index, int value) { VH_extendedDynamicState3AlphaToOneEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LogicOpEnableAt(long index, int value) { VH_extendedDynamicState3LogicOpEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendEnableAt(long index, int value) { VH_extendedDynamicState3ColorBlendEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendEquationAt(long index, int value) { VH_extendedDynamicState3ColorBlendEquation.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorWriteMaskAt(long index, int value) { VH_extendedDynamicState3ColorWriteMask.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RasterizationStreamAt(long index, int value) { VH_extendedDynamicState3RasterizationStream.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ConservativeRasterizationModeAt(long index, int value) { VH_extendedDynamicState3ConservativeRasterizationMode.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ExtraPrimitiveOverestimationSizeAt(long index, int value) { VH_extendedDynamicState3ExtraPrimitiveOverestimationSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClipEnableAt(long index, int value) { VH_extendedDynamicState3DepthClipEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3SampleLocationsEnableAt(long index, int value) { VH_extendedDynamicState3SampleLocationsEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendAdvancedAt(long index, int value) { VH_extendedDynamicState3ColorBlendAdvanced.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ProvokingVertexModeAt(long index, int value) { VH_extendedDynamicState3ProvokingVertexMode.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LineRasterizationModeAt(long index, int value) { VH_extendedDynamicState3LineRasterizationMode.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LineStippleEnableAt(long index, int value) { VH_extendedDynamicState3LineStippleEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClipNegativeOneToOneAt(long index, int value) { VH_extendedDynamicState3DepthClipNegativeOneToOne.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ViewportWScalingEnableAt(long index, int value) { VH_extendedDynamicState3ViewportWScalingEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ViewportSwizzleAt(long index, int value) { VH_extendedDynamicState3ViewportSwizzle.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageToColorEnableAt(long index, int value) { VH_extendedDynamicState3CoverageToColorEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageToColorLocationAt(long index, int value) { VH_extendedDynamicState3CoverageToColorLocation.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationModeAt(long index, int value) { VH_extendedDynamicState3CoverageModulationMode.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationTableEnableAt(long index, int value) { VH_extendedDynamicState3CoverageModulationTableEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationTableAt(long index, int value) { VH_extendedDynamicState3CoverageModulationTable.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageReductionModeAt(long index, int value) { VH_extendedDynamicState3CoverageReductionMode.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RepresentativeFragmentTestEnableAt(long index, int value) { VH_extendedDynamicState3RepresentativeFragmentTestEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ShadingRateImageEnableAt(long index, int value) { VH_extendedDynamicState3ShadingRateImageEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3TessellationDomainOrigin(int value) { VH_extendedDynamicState3TessellationDomainOrigin.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClampEnable(int value) { VH_extendedDynamicState3DepthClampEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3PolygonMode(int value) { VH_extendedDynamicState3PolygonMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RasterizationSamples(int value) { VH_extendedDynamicState3RasterizationSamples.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3SampleMask(int value) { VH_extendedDynamicState3SampleMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3AlphaToCoverageEnable(int value) { VH_extendedDynamicState3AlphaToCoverageEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3AlphaToOneEnable(int value) { VH_extendedDynamicState3AlphaToOneEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LogicOpEnable(int value) { VH_extendedDynamicState3LogicOpEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendEnable(int value) { VH_extendedDynamicState3ColorBlendEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendEquation(int value) { VH_extendedDynamicState3ColorBlendEquation.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorWriteMask(int value) { VH_extendedDynamicState3ColorWriteMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RasterizationStream(int value) { VH_extendedDynamicState3RasterizationStream.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ConservativeRasterizationMode(int value) { VH_extendedDynamicState3ConservativeRasterizationMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ExtraPrimitiveOverestimationSize(int value) { VH_extendedDynamicState3ExtraPrimitiveOverestimationSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClipEnable(int value) { VH_extendedDynamicState3DepthClipEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3SampleLocationsEnable(int value) { VH_extendedDynamicState3SampleLocationsEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendAdvanced(int value) { VH_extendedDynamicState3ColorBlendAdvanced.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ProvokingVertexMode(int value) { VH_extendedDynamicState3ProvokingVertexMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LineRasterizationMode(int value) { VH_extendedDynamicState3LineRasterizationMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LineStippleEnable(int value) { VH_extendedDynamicState3LineStippleEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClipNegativeOneToOne(int value) { VH_extendedDynamicState3DepthClipNegativeOneToOne.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ViewportWScalingEnable(int value) { VH_extendedDynamicState3ViewportWScalingEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ViewportSwizzle(int value) { VH_extendedDynamicState3ViewportSwizzle.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageToColorEnable(int value) { VH_extendedDynamicState3CoverageToColorEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageToColorLocation(int value) { VH_extendedDynamicState3CoverageToColorLocation.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationMode(int value) { VH_extendedDynamicState3CoverageModulationMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationTableEnable(int value) { VH_extendedDynamicState3CoverageModulationTableEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationTable(int value) { VH_extendedDynamicState3CoverageModulationTable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageReductionMode(int value) { VH_extendedDynamicState3CoverageReductionMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RepresentativeFragmentTestEnable(int value) { VH_extendedDynamicState3RepresentativeFragmentTestEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ShadingRateImageEnable(int value) { VH_extendedDynamicState3ShadingRateImageEnable.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _extendedDynamicState3TessellationDomainOriginAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3TessellationDomainOrigin, index), LAYOUT_extendedDynamicState3TessellationDomainOrigin); }
    public MemorySegment _extendedDynamicState3TessellationDomainOrigin() { return _extendedDynamicState3TessellationDomainOriginAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3TessellationDomainOriginAt(long index, MemorySegment src) { _extendedDynamicState3TessellationDomainOriginAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3TessellationDomainOrigin(MemorySegment src) { return _extendedDynamicState3TessellationDomainOriginAt(0L, src); }
    public MemorySegment _extendedDynamicState3DepthClampEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3DepthClampEnable, index), LAYOUT_extendedDynamicState3DepthClampEnable); }
    public MemorySegment _extendedDynamicState3DepthClampEnable() { return _extendedDynamicState3DepthClampEnableAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3DepthClampEnableAt(long index, MemorySegment src) { _extendedDynamicState3DepthClampEnableAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3DepthClampEnable(MemorySegment src) { return _extendedDynamicState3DepthClampEnableAt(0L, src); }
    public MemorySegment _extendedDynamicState3PolygonModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3PolygonMode, index), LAYOUT_extendedDynamicState3PolygonMode); }
    public MemorySegment _extendedDynamicState3PolygonMode() { return _extendedDynamicState3PolygonModeAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3PolygonModeAt(long index, MemorySegment src) { _extendedDynamicState3PolygonModeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3PolygonMode(MemorySegment src) { return _extendedDynamicState3PolygonModeAt(0L, src); }
    public MemorySegment _extendedDynamicState3RasterizationSamplesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3RasterizationSamples, index), LAYOUT_extendedDynamicState3RasterizationSamples); }
    public MemorySegment _extendedDynamicState3RasterizationSamples() { return _extendedDynamicState3RasterizationSamplesAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3RasterizationSamplesAt(long index, MemorySegment src) { _extendedDynamicState3RasterizationSamplesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3RasterizationSamples(MemorySegment src) { return _extendedDynamicState3RasterizationSamplesAt(0L, src); }
    public MemorySegment _extendedDynamicState3SampleMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3SampleMask, index), LAYOUT_extendedDynamicState3SampleMask); }
    public MemorySegment _extendedDynamicState3SampleMask() { return _extendedDynamicState3SampleMaskAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3SampleMaskAt(long index, MemorySegment src) { _extendedDynamicState3SampleMaskAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3SampleMask(MemorySegment src) { return _extendedDynamicState3SampleMaskAt(0L, src); }
    public MemorySegment _extendedDynamicState3AlphaToCoverageEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3AlphaToCoverageEnable, index), LAYOUT_extendedDynamicState3AlphaToCoverageEnable); }
    public MemorySegment _extendedDynamicState3AlphaToCoverageEnable() { return _extendedDynamicState3AlphaToCoverageEnableAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3AlphaToCoverageEnableAt(long index, MemorySegment src) { _extendedDynamicState3AlphaToCoverageEnableAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3AlphaToCoverageEnable(MemorySegment src) { return _extendedDynamicState3AlphaToCoverageEnableAt(0L, src); }
    public MemorySegment _extendedDynamicState3AlphaToOneEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3AlphaToOneEnable, index), LAYOUT_extendedDynamicState3AlphaToOneEnable); }
    public MemorySegment _extendedDynamicState3AlphaToOneEnable() { return _extendedDynamicState3AlphaToOneEnableAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3AlphaToOneEnableAt(long index, MemorySegment src) { _extendedDynamicState3AlphaToOneEnableAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3AlphaToOneEnable(MemorySegment src) { return _extendedDynamicState3AlphaToOneEnableAt(0L, src); }
    public MemorySegment _extendedDynamicState3LogicOpEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3LogicOpEnable, index), LAYOUT_extendedDynamicState3LogicOpEnable); }
    public MemorySegment _extendedDynamicState3LogicOpEnable() { return _extendedDynamicState3LogicOpEnableAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3LogicOpEnableAt(long index, MemorySegment src) { _extendedDynamicState3LogicOpEnableAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3LogicOpEnable(MemorySegment src) { return _extendedDynamicState3LogicOpEnableAt(0L, src); }
    public MemorySegment _extendedDynamicState3ColorBlendEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3ColorBlendEnable, index), LAYOUT_extendedDynamicState3ColorBlendEnable); }
    public MemorySegment _extendedDynamicState3ColorBlendEnable() { return _extendedDynamicState3ColorBlendEnableAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3ColorBlendEnableAt(long index, MemorySegment src) { _extendedDynamicState3ColorBlendEnableAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3ColorBlendEnable(MemorySegment src) { return _extendedDynamicState3ColorBlendEnableAt(0L, src); }
    public MemorySegment _extendedDynamicState3ColorBlendEquationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3ColorBlendEquation, index), LAYOUT_extendedDynamicState3ColorBlendEquation); }
    public MemorySegment _extendedDynamicState3ColorBlendEquation() { return _extendedDynamicState3ColorBlendEquationAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3ColorBlendEquationAt(long index, MemorySegment src) { _extendedDynamicState3ColorBlendEquationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3ColorBlendEquation(MemorySegment src) { return _extendedDynamicState3ColorBlendEquationAt(0L, src); }
    public MemorySegment _extendedDynamicState3ColorWriteMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3ColorWriteMask, index), LAYOUT_extendedDynamicState3ColorWriteMask); }
    public MemorySegment _extendedDynamicState3ColorWriteMask() { return _extendedDynamicState3ColorWriteMaskAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3ColorWriteMaskAt(long index, MemorySegment src) { _extendedDynamicState3ColorWriteMaskAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3ColorWriteMask(MemorySegment src) { return _extendedDynamicState3ColorWriteMaskAt(0L, src); }
    public MemorySegment _extendedDynamicState3RasterizationStreamAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3RasterizationStream, index), LAYOUT_extendedDynamicState3RasterizationStream); }
    public MemorySegment _extendedDynamicState3RasterizationStream() { return _extendedDynamicState3RasterizationStreamAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3RasterizationStreamAt(long index, MemorySegment src) { _extendedDynamicState3RasterizationStreamAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3RasterizationStream(MemorySegment src) { return _extendedDynamicState3RasterizationStreamAt(0L, src); }
    public MemorySegment _extendedDynamicState3ConservativeRasterizationModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3ConservativeRasterizationMode, index), LAYOUT_extendedDynamicState3ConservativeRasterizationMode); }
    public MemorySegment _extendedDynamicState3ConservativeRasterizationMode() { return _extendedDynamicState3ConservativeRasterizationModeAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3ConservativeRasterizationModeAt(long index, MemorySegment src) { _extendedDynamicState3ConservativeRasterizationModeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3ConservativeRasterizationMode(MemorySegment src) { return _extendedDynamicState3ConservativeRasterizationModeAt(0L, src); }
    public MemorySegment _extendedDynamicState3ExtraPrimitiveOverestimationSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3ExtraPrimitiveOverestimationSize, index), LAYOUT_extendedDynamicState3ExtraPrimitiveOverestimationSize); }
    public MemorySegment _extendedDynamicState3ExtraPrimitiveOverestimationSize() { return _extendedDynamicState3ExtraPrimitiveOverestimationSizeAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3ExtraPrimitiveOverestimationSizeAt(long index, MemorySegment src) { _extendedDynamicState3ExtraPrimitiveOverestimationSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3ExtraPrimitiveOverestimationSize(MemorySegment src) { return _extendedDynamicState3ExtraPrimitiveOverestimationSizeAt(0L, src); }
    public MemorySegment _extendedDynamicState3DepthClipEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3DepthClipEnable, index), LAYOUT_extendedDynamicState3DepthClipEnable); }
    public MemorySegment _extendedDynamicState3DepthClipEnable() { return _extendedDynamicState3DepthClipEnableAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3DepthClipEnableAt(long index, MemorySegment src) { _extendedDynamicState3DepthClipEnableAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3DepthClipEnable(MemorySegment src) { return _extendedDynamicState3DepthClipEnableAt(0L, src); }
    public MemorySegment _extendedDynamicState3SampleLocationsEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3SampleLocationsEnable, index), LAYOUT_extendedDynamicState3SampleLocationsEnable); }
    public MemorySegment _extendedDynamicState3SampleLocationsEnable() { return _extendedDynamicState3SampleLocationsEnableAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3SampleLocationsEnableAt(long index, MemorySegment src) { _extendedDynamicState3SampleLocationsEnableAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3SampleLocationsEnable(MemorySegment src) { return _extendedDynamicState3SampleLocationsEnableAt(0L, src); }
    public MemorySegment _extendedDynamicState3ColorBlendAdvancedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3ColorBlendAdvanced, index), LAYOUT_extendedDynamicState3ColorBlendAdvanced); }
    public MemorySegment _extendedDynamicState3ColorBlendAdvanced() { return _extendedDynamicState3ColorBlendAdvancedAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3ColorBlendAdvancedAt(long index, MemorySegment src) { _extendedDynamicState3ColorBlendAdvancedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3ColorBlendAdvanced(MemorySegment src) { return _extendedDynamicState3ColorBlendAdvancedAt(0L, src); }
    public MemorySegment _extendedDynamicState3ProvokingVertexModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3ProvokingVertexMode, index), LAYOUT_extendedDynamicState3ProvokingVertexMode); }
    public MemorySegment _extendedDynamicState3ProvokingVertexMode() { return _extendedDynamicState3ProvokingVertexModeAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3ProvokingVertexModeAt(long index, MemorySegment src) { _extendedDynamicState3ProvokingVertexModeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3ProvokingVertexMode(MemorySegment src) { return _extendedDynamicState3ProvokingVertexModeAt(0L, src); }
    public MemorySegment _extendedDynamicState3LineRasterizationModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3LineRasterizationMode, index), LAYOUT_extendedDynamicState3LineRasterizationMode); }
    public MemorySegment _extendedDynamicState3LineRasterizationMode() { return _extendedDynamicState3LineRasterizationModeAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3LineRasterizationModeAt(long index, MemorySegment src) { _extendedDynamicState3LineRasterizationModeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3LineRasterizationMode(MemorySegment src) { return _extendedDynamicState3LineRasterizationModeAt(0L, src); }
    public MemorySegment _extendedDynamicState3LineStippleEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3LineStippleEnable, index), LAYOUT_extendedDynamicState3LineStippleEnable); }
    public MemorySegment _extendedDynamicState3LineStippleEnable() { return _extendedDynamicState3LineStippleEnableAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3LineStippleEnableAt(long index, MemorySegment src) { _extendedDynamicState3LineStippleEnableAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3LineStippleEnable(MemorySegment src) { return _extendedDynamicState3LineStippleEnableAt(0L, src); }
    public MemorySegment _extendedDynamicState3DepthClipNegativeOneToOneAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3DepthClipNegativeOneToOne, index), LAYOUT_extendedDynamicState3DepthClipNegativeOneToOne); }
    public MemorySegment _extendedDynamicState3DepthClipNegativeOneToOne() { return _extendedDynamicState3DepthClipNegativeOneToOneAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3DepthClipNegativeOneToOneAt(long index, MemorySegment src) { _extendedDynamicState3DepthClipNegativeOneToOneAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3DepthClipNegativeOneToOne(MemorySegment src) { return _extendedDynamicState3DepthClipNegativeOneToOneAt(0L, src); }
    public MemorySegment _extendedDynamicState3ViewportWScalingEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3ViewportWScalingEnable, index), LAYOUT_extendedDynamicState3ViewportWScalingEnable); }
    public MemorySegment _extendedDynamicState3ViewportWScalingEnable() { return _extendedDynamicState3ViewportWScalingEnableAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3ViewportWScalingEnableAt(long index, MemorySegment src) { _extendedDynamicState3ViewportWScalingEnableAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3ViewportWScalingEnable(MemorySegment src) { return _extendedDynamicState3ViewportWScalingEnableAt(0L, src); }
    public MemorySegment _extendedDynamicState3ViewportSwizzleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3ViewportSwizzle, index), LAYOUT_extendedDynamicState3ViewportSwizzle); }
    public MemorySegment _extendedDynamicState3ViewportSwizzle() { return _extendedDynamicState3ViewportSwizzleAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3ViewportSwizzleAt(long index, MemorySegment src) { _extendedDynamicState3ViewportSwizzleAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3ViewportSwizzle(MemorySegment src) { return _extendedDynamicState3ViewportSwizzleAt(0L, src); }
    public MemorySegment _extendedDynamicState3CoverageToColorEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3CoverageToColorEnable, index), LAYOUT_extendedDynamicState3CoverageToColorEnable); }
    public MemorySegment _extendedDynamicState3CoverageToColorEnable() { return _extendedDynamicState3CoverageToColorEnableAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3CoverageToColorEnableAt(long index, MemorySegment src) { _extendedDynamicState3CoverageToColorEnableAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3CoverageToColorEnable(MemorySegment src) { return _extendedDynamicState3CoverageToColorEnableAt(0L, src); }
    public MemorySegment _extendedDynamicState3CoverageToColorLocationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3CoverageToColorLocation, index), LAYOUT_extendedDynamicState3CoverageToColorLocation); }
    public MemorySegment _extendedDynamicState3CoverageToColorLocation() { return _extendedDynamicState3CoverageToColorLocationAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3CoverageToColorLocationAt(long index, MemorySegment src) { _extendedDynamicState3CoverageToColorLocationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3CoverageToColorLocation(MemorySegment src) { return _extendedDynamicState3CoverageToColorLocationAt(0L, src); }
    public MemorySegment _extendedDynamicState3CoverageModulationModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3CoverageModulationMode, index), LAYOUT_extendedDynamicState3CoverageModulationMode); }
    public MemorySegment _extendedDynamicState3CoverageModulationMode() { return _extendedDynamicState3CoverageModulationModeAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3CoverageModulationModeAt(long index, MemorySegment src) { _extendedDynamicState3CoverageModulationModeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3CoverageModulationMode(MemorySegment src) { return _extendedDynamicState3CoverageModulationModeAt(0L, src); }
    public MemorySegment _extendedDynamicState3CoverageModulationTableEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3CoverageModulationTableEnable, index), LAYOUT_extendedDynamicState3CoverageModulationTableEnable); }
    public MemorySegment _extendedDynamicState3CoverageModulationTableEnable() { return _extendedDynamicState3CoverageModulationTableEnableAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3CoverageModulationTableEnableAt(long index, MemorySegment src) { _extendedDynamicState3CoverageModulationTableEnableAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3CoverageModulationTableEnable(MemorySegment src) { return _extendedDynamicState3CoverageModulationTableEnableAt(0L, src); }
    public MemorySegment _extendedDynamicState3CoverageModulationTableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3CoverageModulationTable, index), LAYOUT_extendedDynamicState3CoverageModulationTable); }
    public MemorySegment _extendedDynamicState3CoverageModulationTable() { return _extendedDynamicState3CoverageModulationTableAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3CoverageModulationTableAt(long index, MemorySegment src) { _extendedDynamicState3CoverageModulationTableAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3CoverageModulationTable(MemorySegment src) { return _extendedDynamicState3CoverageModulationTableAt(0L, src); }
    public MemorySegment _extendedDynamicState3CoverageReductionModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3CoverageReductionMode, index), LAYOUT_extendedDynamicState3CoverageReductionMode); }
    public MemorySegment _extendedDynamicState3CoverageReductionMode() { return _extendedDynamicState3CoverageReductionModeAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3CoverageReductionModeAt(long index, MemorySegment src) { _extendedDynamicState3CoverageReductionModeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3CoverageReductionMode(MemorySegment src) { return _extendedDynamicState3CoverageReductionModeAt(0L, src); }
    public MemorySegment _extendedDynamicState3RepresentativeFragmentTestEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3RepresentativeFragmentTestEnable, index), LAYOUT_extendedDynamicState3RepresentativeFragmentTestEnable); }
    public MemorySegment _extendedDynamicState3RepresentativeFragmentTestEnable() { return _extendedDynamicState3RepresentativeFragmentTestEnableAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3RepresentativeFragmentTestEnableAt(long index, MemorySegment src) { _extendedDynamicState3RepresentativeFragmentTestEnableAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3RepresentativeFragmentTestEnable(MemorySegment src) { return _extendedDynamicState3RepresentativeFragmentTestEnableAt(0L, src); }
    public MemorySegment _extendedDynamicState3ShadingRateImageEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState3ShadingRateImageEnable, index), LAYOUT_extendedDynamicState3ShadingRateImageEnable); }
    public MemorySegment _extendedDynamicState3ShadingRateImageEnable() { return _extendedDynamicState3ShadingRateImageEnableAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3ShadingRateImageEnableAt(long index, MemorySegment src) { _extendedDynamicState3ShadingRateImageEnableAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT _extendedDynamicState3ShadingRateImageEnable(MemorySegment src) { return _extendedDynamicState3ShadingRateImageEnableAt(0L, src); }
}
