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
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 extendedDynamicState3TessellationDomainOrigin;
///     (uint32_t) VkBool32 extendedDynamicState3DepthClampEnable;
///     (uint32_t) VkBool32 extendedDynamicState3PolygonMode;
///     (uint32_t) VkBool32 extendedDynamicState3RasterizationSamples;
///     (uint32_t) VkBool32 extendedDynamicState3SampleMask;
///     (uint32_t) VkBool32 extendedDynamicState3AlphaToCoverageEnable;
///     (uint32_t) VkBool32 extendedDynamicState3AlphaToOneEnable;
///     (uint32_t) VkBool32 extendedDynamicState3LogicOpEnable;
///     (uint32_t) VkBool32 extendedDynamicState3ColorBlendEnable;
///     (uint32_t) VkBool32 extendedDynamicState3ColorBlendEquation;
///     (uint32_t) VkBool32 extendedDynamicState3ColorWriteMask;
///     (uint32_t) VkBool32 extendedDynamicState3RasterizationStream;
///     (uint32_t) VkBool32 extendedDynamicState3ConservativeRasterizationMode;
///     (uint32_t) VkBool32 extendedDynamicState3ExtraPrimitiveOverestimationSize;
///     (uint32_t) VkBool32 extendedDynamicState3DepthClipEnable;
///     (uint32_t) VkBool32 extendedDynamicState3SampleLocationsEnable;
///     (uint32_t) VkBool32 extendedDynamicState3ColorBlendAdvanced;
///     (uint32_t) VkBool32 extendedDynamicState3ProvokingVertexMode;
///     (uint32_t) VkBool32 extendedDynamicState3LineRasterizationMode;
///     (uint32_t) VkBool32 extendedDynamicState3LineStippleEnable;
///     (uint32_t) VkBool32 extendedDynamicState3DepthClipNegativeOneToOne;
///     (uint32_t) VkBool32 extendedDynamicState3ViewportWScalingEnable;
///     (uint32_t) VkBool32 extendedDynamicState3ViewportSwizzle;
///     (uint32_t) VkBool32 extendedDynamicState3CoverageToColorEnable;
///     (uint32_t) VkBool32 extendedDynamicState3CoverageToColorLocation;
///     (uint32_t) VkBool32 extendedDynamicState3CoverageModulationMode;
///     (uint32_t) VkBool32 extendedDynamicState3CoverageModulationTableEnable;
///     (uint32_t) VkBool32 extendedDynamicState3CoverageModulationTable;
///     (uint32_t) VkBool32 extendedDynamicState3CoverageReductionMode;
///     (uint32_t) VkBool32 extendedDynamicState3RepresentativeFragmentTestEnable;
///     (uint32_t) VkBool32 extendedDynamicState3ShadingRateImageEnable;
/// };
/// ```
public final class VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceExtendedDynamicState3FeaturesEXT`.
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
    /// The byte offset of `extendedDynamicState3TessellationDomainOrigin`.
    public static final long OFFSET_extendedDynamicState3TessellationDomainOrigin = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3TessellationDomainOrigin"));
    /// The memory layout of `extendedDynamicState3TessellationDomainOrigin`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3TessellationDomainOrigin = LAYOUT.select(PathElement.groupElement("extendedDynamicState3TessellationDomainOrigin"));
    /// The [VarHandle] of `extendedDynamicState3TessellationDomainOrigin` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3TessellationDomainOrigin = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3TessellationDomainOrigin"));
    /// The byte offset of `extendedDynamicState3DepthClampEnable`.
    public static final long OFFSET_extendedDynamicState3DepthClampEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3DepthClampEnable"));
    /// The memory layout of `extendedDynamicState3DepthClampEnable`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3DepthClampEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3DepthClampEnable"));
    /// The [VarHandle] of `extendedDynamicState3DepthClampEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3DepthClampEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3DepthClampEnable"));
    /// The byte offset of `extendedDynamicState3PolygonMode`.
    public static final long OFFSET_extendedDynamicState3PolygonMode = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3PolygonMode"));
    /// The memory layout of `extendedDynamicState3PolygonMode`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3PolygonMode = LAYOUT.select(PathElement.groupElement("extendedDynamicState3PolygonMode"));
    /// The [VarHandle] of `extendedDynamicState3PolygonMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3PolygonMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3PolygonMode"));
    /// The byte offset of `extendedDynamicState3RasterizationSamples`.
    public static final long OFFSET_extendedDynamicState3RasterizationSamples = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3RasterizationSamples"));
    /// The memory layout of `extendedDynamicState3RasterizationSamples`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3RasterizationSamples = LAYOUT.select(PathElement.groupElement("extendedDynamicState3RasterizationSamples"));
    /// The [VarHandle] of `extendedDynamicState3RasterizationSamples` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3RasterizationSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3RasterizationSamples"));
    /// The byte offset of `extendedDynamicState3SampleMask`.
    public static final long OFFSET_extendedDynamicState3SampleMask = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3SampleMask"));
    /// The memory layout of `extendedDynamicState3SampleMask`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3SampleMask = LAYOUT.select(PathElement.groupElement("extendedDynamicState3SampleMask"));
    /// The [VarHandle] of `extendedDynamicState3SampleMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3SampleMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3SampleMask"));
    /// The byte offset of `extendedDynamicState3AlphaToCoverageEnable`.
    public static final long OFFSET_extendedDynamicState3AlphaToCoverageEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3AlphaToCoverageEnable"));
    /// The memory layout of `extendedDynamicState3AlphaToCoverageEnable`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3AlphaToCoverageEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3AlphaToCoverageEnable"));
    /// The [VarHandle] of `extendedDynamicState3AlphaToCoverageEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3AlphaToCoverageEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3AlphaToCoverageEnable"));
    /// The byte offset of `extendedDynamicState3AlphaToOneEnable`.
    public static final long OFFSET_extendedDynamicState3AlphaToOneEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3AlphaToOneEnable"));
    /// The memory layout of `extendedDynamicState3AlphaToOneEnable`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3AlphaToOneEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3AlphaToOneEnable"));
    /// The [VarHandle] of `extendedDynamicState3AlphaToOneEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3AlphaToOneEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3AlphaToOneEnable"));
    /// The byte offset of `extendedDynamicState3LogicOpEnable`.
    public static final long OFFSET_extendedDynamicState3LogicOpEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3LogicOpEnable"));
    /// The memory layout of `extendedDynamicState3LogicOpEnable`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3LogicOpEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3LogicOpEnable"));
    /// The [VarHandle] of `extendedDynamicState3LogicOpEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3LogicOpEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3LogicOpEnable"));
    /// The byte offset of `extendedDynamicState3ColorBlendEnable`.
    public static final long OFFSET_extendedDynamicState3ColorBlendEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ColorBlendEnable"));
    /// The memory layout of `extendedDynamicState3ColorBlendEnable`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3ColorBlendEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3ColorBlendEnable"));
    /// The [VarHandle] of `extendedDynamicState3ColorBlendEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3ColorBlendEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3ColorBlendEnable"));
    /// The byte offset of `extendedDynamicState3ColorBlendEquation`.
    public static final long OFFSET_extendedDynamicState3ColorBlendEquation = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ColorBlendEquation"));
    /// The memory layout of `extendedDynamicState3ColorBlendEquation`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3ColorBlendEquation = LAYOUT.select(PathElement.groupElement("extendedDynamicState3ColorBlendEquation"));
    /// The [VarHandle] of `extendedDynamicState3ColorBlendEquation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3ColorBlendEquation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3ColorBlendEquation"));
    /// The byte offset of `extendedDynamicState3ColorWriteMask`.
    public static final long OFFSET_extendedDynamicState3ColorWriteMask = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ColorWriteMask"));
    /// The memory layout of `extendedDynamicState3ColorWriteMask`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3ColorWriteMask = LAYOUT.select(PathElement.groupElement("extendedDynamicState3ColorWriteMask"));
    /// The [VarHandle] of `extendedDynamicState3ColorWriteMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3ColorWriteMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3ColorWriteMask"));
    /// The byte offset of `extendedDynamicState3RasterizationStream`.
    public static final long OFFSET_extendedDynamicState3RasterizationStream = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3RasterizationStream"));
    /// The memory layout of `extendedDynamicState3RasterizationStream`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3RasterizationStream = LAYOUT.select(PathElement.groupElement("extendedDynamicState3RasterizationStream"));
    /// The [VarHandle] of `extendedDynamicState3RasterizationStream` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3RasterizationStream = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3RasterizationStream"));
    /// The byte offset of `extendedDynamicState3ConservativeRasterizationMode`.
    public static final long OFFSET_extendedDynamicState3ConservativeRasterizationMode = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ConservativeRasterizationMode"));
    /// The memory layout of `extendedDynamicState3ConservativeRasterizationMode`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3ConservativeRasterizationMode = LAYOUT.select(PathElement.groupElement("extendedDynamicState3ConservativeRasterizationMode"));
    /// The [VarHandle] of `extendedDynamicState3ConservativeRasterizationMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3ConservativeRasterizationMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3ConservativeRasterizationMode"));
    /// The byte offset of `extendedDynamicState3ExtraPrimitiveOverestimationSize`.
    public static final long OFFSET_extendedDynamicState3ExtraPrimitiveOverestimationSize = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ExtraPrimitiveOverestimationSize"));
    /// The memory layout of `extendedDynamicState3ExtraPrimitiveOverestimationSize`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3ExtraPrimitiveOverestimationSize = LAYOUT.select(PathElement.groupElement("extendedDynamicState3ExtraPrimitiveOverestimationSize"));
    /// The [VarHandle] of `extendedDynamicState3ExtraPrimitiveOverestimationSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3ExtraPrimitiveOverestimationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3ExtraPrimitiveOverestimationSize"));
    /// The byte offset of `extendedDynamicState3DepthClipEnable`.
    public static final long OFFSET_extendedDynamicState3DepthClipEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3DepthClipEnable"));
    /// The memory layout of `extendedDynamicState3DepthClipEnable`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3DepthClipEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3DepthClipEnable"));
    /// The [VarHandle] of `extendedDynamicState3DepthClipEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3DepthClipEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3DepthClipEnable"));
    /// The byte offset of `extendedDynamicState3SampleLocationsEnable`.
    public static final long OFFSET_extendedDynamicState3SampleLocationsEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3SampleLocationsEnable"));
    /// The memory layout of `extendedDynamicState3SampleLocationsEnable`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3SampleLocationsEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3SampleLocationsEnable"));
    /// The [VarHandle] of `extendedDynamicState3SampleLocationsEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3SampleLocationsEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3SampleLocationsEnable"));
    /// The byte offset of `extendedDynamicState3ColorBlendAdvanced`.
    public static final long OFFSET_extendedDynamicState3ColorBlendAdvanced = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ColorBlendAdvanced"));
    /// The memory layout of `extendedDynamicState3ColorBlendAdvanced`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3ColorBlendAdvanced = LAYOUT.select(PathElement.groupElement("extendedDynamicState3ColorBlendAdvanced"));
    /// The [VarHandle] of `extendedDynamicState3ColorBlendAdvanced` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3ColorBlendAdvanced = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3ColorBlendAdvanced"));
    /// The byte offset of `extendedDynamicState3ProvokingVertexMode`.
    public static final long OFFSET_extendedDynamicState3ProvokingVertexMode = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ProvokingVertexMode"));
    /// The memory layout of `extendedDynamicState3ProvokingVertexMode`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3ProvokingVertexMode = LAYOUT.select(PathElement.groupElement("extendedDynamicState3ProvokingVertexMode"));
    /// The [VarHandle] of `extendedDynamicState3ProvokingVertexMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3ProvokingVertexMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3ProvokingVertexMode"));
    /// The byte offset of `extendedDynamicState3LineRasterizationMode`.
    public static final long OFFSET_extendedDynamicState3LineRasterizationMode = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3LineRasterizationMode"));
    /// The memory layout of `extendedDynamicState3LineRasterizationMode`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3LineRasterizationMode = LAYOUT.select(PathElement.groupElement("extendedDynamicState3LineRasterizationMode"));
    /// The [VarHandle] of `extendedDynamicState3LineRasterizationMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3LineRasterizationMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3LineRasterizationMode"));
    /// The byte offset of `extendedDynamicState3LineStippleEnable`.
    public static final long OFFSET_extendedDynamicState3LineStippleEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3LineStippleEnable"));
    /// The memory layout of `extendedDynamicState3LineStippleEnable`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3LineStippleEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3LineStippleEnable"));
    /// The [VarHandle] of `extendedDynamicState3LineStippleEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3LineStippleEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3LineStippleEnable"));
    /// The byte offset of `extendedDynamicState3DepthClipNegativeOneToOne`.
    public static final long OFFSET_extendedDynamicState3DepthClipNegativeOneToOne = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3DepthClipNegativeOneToOne"));
    /// The memory layout of `extendedDynamicState3DepthClipNegativeOneToOne`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3DepthClipNegativeOneToOne = LAYOUT.select(PathElement.groupElement("extendedDynamicState3DepthClipNegativeOneToOne"));
    /// The [VarHandle] of `extendedDynamicState3DepthClipNegativeOneToOne` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3DepthClipNegativeOneToOne = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3DepthClipNegativeOneToOne"));
    /// The byte offset of `extendedDynamicState3ViewportWScalingEnable`.
    public static final long OFFSET_extendedDynamicState3ViewportWScalingEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ViewportWScalingEnable"));
    /// The memory layout of `extendedDynamicState3ViewportWScalingEnable`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3ViewportWScalingEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3ViewportWScalingEnable"));
    /// The [VarHandle] of `extendedDynamicState3ViewportWScalingEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3ViewportWScalingEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3ViewportWScalingEnable"));
    /// The byte offset of `extendedDynamicState3ViewportSwizzle`.
    public static final long OFFSET_extendedDynamicState3ViewportSwizzle = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ViewportSwizzle"));
    /// The memory layout of `extendedDynamicState3ViewportSwizzle`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3ViewportSwizzle = LAYOUT.select(PathElement.groupElement("extendedDynamicState3ViewportSwizzle"));
    /// The [VarHandle] of `extendedDynamicState3ViewportSwizzle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3ViewportSwizzle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3ViewportSwizzle"));
    /// The byte offset of `extendedDynamicState3CoverageToColorEnable`.
    public static final long OFFSET_extendedDynamicState3CoverageToColorEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3CoverageToColorEnable"));
    /// The memory layout of `extendedDynamicState3CoverageToColorEnable`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3CoverageToColorEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3CoverageToColorEnable"));
    /// The [VarHandle] of `extendedDynamicState3CoverageToColorEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3CoverageToColorEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3CoverageToColorEnable"));
    /// The byte offset of `extendedDynamicState3CoverageToColorLocation`.
    public static final long OFFSET_extendedDynamicState3CoverageToColorLocation = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3CoverageToColorLocation"));
    /// The memory layout of `extendedDynamicState3CoverageToColorLocation`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3CoverageToColorLocation = LAYOUT.select(PathElement.groupElement("extendedDynamicState3CoverageToColorLocation"));
    /// The [VarHandle] of `extendedDynamicState3CoverageToColorLocation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3CoverageToColorLocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3CoverageToColorLocation"));
    /// The byte offset of `extendedDynamicState3CoverageModulationMode`.
    public static final long OFFSET_extendedDynamicState3CoverageModulationMode = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3CoverageModulationMode"));
    /// The memory layout of `extendedDynamicState3CoverageModulationMode`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3CoverageModulationMode = LAYOUT.select(PathElement.groupElement("extendedDynamicState3CoverageModulationMode"));
    /// The [VarHandle] of `extendedDynamicState3CoverageModulationMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3CoverageModulationMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3CoverageModulationMode"));
    /// The byte offset of `extendedDynamicState3CoverageModulationTableEnable`.
    public static final long OFFSET_extendedDynamicState3CoverageModulationTableEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3CoverageModulationTableEnable"));
    /// The memory layout of `extendedDynamicState3CoverageModulationTableEnable`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3CoverageModulationTableEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3CoverageModulationTableEnable"));
    /// The [VarHandle] of `extendedDynamicState3CoverageModulationTableEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3CoverageModulationTableEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3CoverageModulationTableEnable"));
    /// The byte offset of `extendedDynamicState3CoverageModulationTable`.
    public static final long OFFSET_extendedDynamicState3CoverageModulationTable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3CoverageModulationTable"));
    /// The memory layout of `extendedDynamicState3CoverageModulationTable`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3CoverageModulationTable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3CoverageModulationTable"));
    /// The [VarHandle] of `extendedDynamicState3CoverageModulationTable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3CoverageModulationTable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3CoverageModulationTable"));
    /// The byte offset of `extendedDynamicState3CoverageReductionMode`.
    public static final long OFFSET_extendedDynamicState3CoverageReductionMode = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3CoverageReductionMode"));
    /// The memory layout of `extendedDynamicState3CoverageReductionMode`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3CoverageReductionMode = LAYOUT.select(PathElement.groupElement("extendedDynamicState3CoverageReductionMode"));
    /// The [VarHandle] of `extendedDynamicState3CoverageReductionMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3CoverageReductionMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3CoverageReductionMode"));
    /// The byte offset of `extendedDynamicState3RepresentativeFragmentTestEnable`.
    public static final long OFFSET_extendedDynamicState3RepresentativeFragmentTestEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3RepresentativeFragmentTestEnable"));
    /// The memory layout of `extendedDynamicState3RepresentativeFragmentTestEnable`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3RepresentativeFragmentTestEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3RepresentativeFragmentTestEnable"));
    /// The [VarHandle] of `extendedDynamicState3RepresentativeFragmentTestEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3RepresentativeFragmentTestEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3RepresentativeFragmentTestEnable"));
    /// The byte offset of `extendedDynamicState3ShadingRateImageEnable`.
    public static final long OFFSET_extendedDynamicState3ShadingRateImageEnable = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ShadingRateImageEnable"));
    /// The memory layout of `extendedDynamicState3ShadingRateImageEnable`.
    public static final MemoryLayout LAYOUT_extendedDynamicState3ShadingRateImageEnable = LAYOUT.select(PathElement.groupElement("extendedDynamicState3ShadingRateImageEnable"));
    /// The [VarHandle] of `extendedDynamicState3ShadingRateImageEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState3ShadingRateImageEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState3ShadingRateImageEnable"));

    /// Creates `VkPhysicalDeviceExtendedDynamicState3FeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceExtendedDynamicState3FeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceExtendedDynamicState3FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceExtendedDynamicState3FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceExtendedDynamicState3FeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExtendedDynamicState3FeaturesEXT`
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceExtendedDynamicState3FeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceExtendedDynamicState3FeaturesEXT`
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT copyFrom(VkPhysicalDeviceExtendedDynamicState3FeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3TessellationDomainOrigin` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3TessellationDomainOrigin(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3TessellationDomainOrigin.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3TessellationDomainOrigin`}
    public int extendedDynamicState3TessellationDomainOrigin() { return extendedDynamicState3TessellationDomainOrigin(this.segment(), 0L); }
    /// Sets `extendedDynamicState3TessellationDomainOrigin` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3TessellationDomainOrigin(MemorySegment segment, long index, int value) { VH_extendedDynamicState3TessellationDomainOrigin.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3TessellationDomainOrigin` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3TessellationDomainOrigin(int value) { extendedDynamicState3TessellationDomainOrigin(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3DepthClampEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3DepthClampEnable(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3DepthClampEnable.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3DepthClampEnable`}
    public int extendedDynamicState3DepthClampEnable() { return extendedDynamicState3DepthClampEnable(this.segment(), 0L); }
    /// Sets `extendedDynamicState3DepthClampEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3DepthClampEnable(MemorySegment segment, long index, int value) { VH_extendedDynamicState3DepthClampEnable.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3DepthClampEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClampEnable(int value) { extendedDynamicState3DepthClampEnable(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3PolygonMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3PolygonMode(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3PolygonMode.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3PolygonMode`}
    public int extendedDynamicState3PolygonMode() { return extendedDynamicState3PolygonMode(this.segment(), 0L); }
    /// Sets `extendedDynamicState3PolygonMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3PolygonMode(MemorySegment segment, long index, int value) { VH_extendedDynamicState3PolygonMode.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3PolygonMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3PolygonMode(int value) { extendedDynamicState3PolygonMode(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3RasterizationSamples` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3RasterizationSamples(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3RasterizationSamples.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3RasterizationSamples`}
    public int extendedDynamicState3RasterizationSamples() { return extendedDynamicState3RasterizationSamples(this.segment(), 0L); }
    /// Sets `extendedDynamicState3RasterizationSamples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3RasterizationSamples(MemorySegment segment, long index, int value) { VH_extendedDynamicState3RasterizationSamples.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3RasterizationSamples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RasterizationSamples(int value) { extendedDynamicState3RasterizationSamples(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3SampleMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3SampleMask(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3SampleMask.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3SampleMask`}
    public int extendedDynamicState3SampleMask() { return extendedDynamicState3SampleMask(this.segment(), 0L); }
    /// Sets `extendedDynamicState3SampleMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3SampleMask(MemorySegment segment, long index, int value) { VH_extendedDynamicState3SampleMask.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3SampleMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3SampleMask(int value) { extendedDynamicState3SampleMask(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3AlphaToCoverageEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3AlphaToCoverageEnable(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3AlphaToCoverageEnable.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3AlphaToCoverageEnable`}
    public int extendedDynamicState3AlphaToCoverageEnable() { return extendedDynamicState3AlphaToCoverageEnable(this.segment(), 0L); }
    /// Sets `extendedDynamicState3AlphaToCoverageEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3AlphaToCoverageEnable(MemorySegment segment, long index, int value) { VH_extendedDynamicState3AlphaToCoverageEnable.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3AlphaToCoverageEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3AlphaToCoverageEnable(int value) { extendedDynamicState3AlphaToCoverageEnable(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3AlphaToOneEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3AlphaToOneEnable(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3AlphaToOneEnable.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3AlphaToOneEnable`}
    public int extendedDynamicState3AlphaToOneEnable() { return extendedDynamicState3AlphaToOneEnable(this.segment(), 0L); }
    /// Sets `extendedDynamicState3AlphaToOneEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3AlphaToOneEnable(MemorySegment segment, long index, int value) { VH_extendedDynamicState3AlphaToOneEnable.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3AlphaToOneEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3AlphaToOneEnable(int value) { extendedDynamicState3AlphaToOneEnable(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3LogicOpEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3LogicOpEnable(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3LogicOpEnable.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3LogicOpEnable`}
    public int extendedDynamicState3LogicOpEnable() { return extendedDynamicState3LogicOpEnable(this.segment(), 0L); }
    /// Sets `extendedDynamicState3LogicOpEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3LogicOpEnable(MemorySegment segment, long index, int value) { VH_extendedDynamicState3LogicOpEnable.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3LogicOpEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LogicOpEnable(int value) { extendedDynamicState3LogicOpEnable(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3ColorBlendEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3ColorBlendEnable(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3ColorBlendEnable.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3ColorBlendEnable`}
    public int extendedDynamicState3ColorBlendEnable() { return extendedDynamicState3ColorBlendEnable(this.segment(), 0L); }
    /// Sets `extendedDynamicState3ColorBlendEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3ColorBlendEnable(MemorySegment segment, long index, int value) { VH_extendedDynamicState3ColorBlendEnable.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3ColorBlendEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendEnable(int value) { extendedDynamicState3ColorBlendEnable(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3ColorBlendEquation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3ColorBlendEquation(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3ColorBlendEquation.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3ColorBlendEquation`}
    public int extendedDynamicState3ColorBlendEquation() { return extendedDynamicState3ColorBlendEquation(this.segment(), 0L); }
    /// Sets `extendedDynamicState3ColorBlendEquation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3ColorBlendEquation(MemorySegment segment, long index, int value) { VH_extendedDynamicState3ColorBlendEquation.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3ColorBlendEquation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendEquation(int value) { extendedDynamicState3ColorBlendEquation(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3ColorWriteMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3ColorWriteMask(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3ColorWriteMask.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3ColorWriteMask`}
    public int extendedDynamicState3ColorWriteMask() { return extendedDynamicState3ColorWriteMask(this.segment(), 0L); }
    /// Sets `extendedDynamicState3ColorWriteMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3ColorWriteMask(MemorySegment segment, long index, int value) { VH_extendedDynamicState3ColorWriteMask.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3ColorWriteMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorWriteMask(int value) { extendedDynamicState3ColorWriteMask(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3RasterizationStream` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3RasterizationStream(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3RasterizationStream.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3RasterizationStream`}
    public int extendedDynamicState3RasterizationStream() { return extendedDynamicState3RasterizationStream(this.segment(), 0L); }
    /// Sets `extendedDynamicState3RasterizationStream` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3RasterizationStream(MemorySegment segment, long index, int value) { VH_extendedDynamicState3RasterizationStream.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3RasterizationStream` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RasterizationStream(int value) { extendedDynamicState3RasterizationStream(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3ConservativeRasterizationMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3ConservativeRasterizationMode(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3ConservativeRasterizationMode.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3ConservativeRasterizationMode`}
    public int extendedDynamicState3ConservativeRasterizationMode() { return extendedDynamicState3ConservativeRasterizationMode(this.segment(), 0L); }
    /// Sets `extendedDynamicState3ConservativeRasterizationMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3ConservativeRasterizationMode(MemorySegment segment, long index, int value) { VH_extendedDynamicState3ConservativeRasterizationMode.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3ConservativeRasterizationMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ConservativeRasterizationMode(int value) { extendedDynamicState3ConservativeRasterizationMode(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3ExtraPrimitiveOverestimationSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3ExtraPrimitiveOverestimationSize(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3ExtraPrimitiveOverestimationSize.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3ExtraPrimitiveOverestimationSize`}
    public int extendedDynamicState3ExtraPrimitiveOverestimationSize() { return extendedDynamicState3ExtraPrimitiveOverestimationSize(this.segment(), 0L); }
    /// Sets `extendedDynamicState3ExtraPrimitiveOverestimationSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3ExtraPrimitiveOverestimationSize(MemorySegment segment, long index, int value) { VH_extendedDynamicState3ExtraPrimitiveOverestimationSize.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3ExtraPrimitiveOverestimationSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ExtraPrimitiveOverestimationSize(int value) { extendedDynamicState3ExtraPrimitiveOverestimationSize(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3DepthClipEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3DepthClipEnable(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3DepthClipEnable.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3DepthClipEnable`}
    public int extendedDynamicState3DepthClipEnable() { return extendedDynamicState3DepthClipEnable(this.segment(), 0L); }
    /// Sets `extendedDynamicState3DepthClipEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3DepthClipEnable(MemorySegment segment, long index, int value) { VH_extendedDynamicState3DepthClipEnable.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3DepthClipEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClipEnable(int value) { extendedDynamicState3DepthClipEnable(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3SampleLocationsEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3SampleLocationsEnable(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3SampleLocationsEnable.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3SampleLocationsEnable`}
    public int extendedDynamicState3SampleLocationsEnable() { return extendedDynamicState3SampleLocationsEnable(this.segment(), 0L); }
    /// Sets `extendedDynamicState3SampleLocationsEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3SampleLocationsEnable(MemorySegment segment, long index, int value) { VH_extendedDynamicState3SampleLocationsEnable.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3SampleLocationsEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3SampleLocationsEnable(int value) { extendedDynamicState3SampleLocationsEnable(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3ColorBlendAdvanced` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3ColorBlendAdvanced(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3ColorBlendAdvanced.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3ColorBlendAdvanced`}
    public int extendedDynamicState3ColorBlendAdvanced() { return extendedDynamicState3ColorBlendAdvanced(this.segment(), 0L); }
    /// Sets `extendedDynamicState3ColorBlendAdvanced` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3ColorBlendAdvanced(MemorySegment segment, long index, int value) { VH_extendedDynamicState3ColorBlendAdvanced.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3ColorBlendAdvanced` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendAdvanced(int value) { extendedDynamicState3ColorBlendAdvanced(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3ProvokingVertexMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3ProvokingVertexMode(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3ProvokingVertexMode.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3ProvokingVertexMode`}
    public int extendedDynamicState3ProvokingVertexMode() { return extendedDynamicState3ProvokingVertexMode(this.segment(), 0L); }
    /// Sets `extendedDynamicState3ProvokingVertexMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3ProvokingVertexMode(MemorySegment segment, long index, int value) { VH_extendedDynamicState3ProvokingVertexMode.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3ProvokingVertexMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ProvokingVertexMode(int value) { extendedDynamicState3ProvokingVertexMode(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3LineRasterizationMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3LineRasterizationMode(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3LineRasterizationMode.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3LineRasterizationMode`}
    public int extendedDynamicState3LineRasterizationMode() { return extendedDynamicState3LineRasterizationMode(this.segment(), 0L); }
    /// Sets `extendedDynamicState3LineRasterizationMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3LineRasterizationMode(MemorySegment segment, long index, int value) { VH_extendedDynamicState3LineRasterizationMode.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3LineRasterizationMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LineRasterizationMode(int value) { extendedDynamicState3LineRasterizationMode(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3LineStippleEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3LineStippleEnable(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3LineStippleEnable.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3LineStippleEnable`}
    public int extendedDynamicState3LineStippleEnable() { return extendedDynamicState3LineStippleEnable(this.segment(), 0L); }
    /// Sets `extendedDynamicState3LineStippleEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3LineStippleEnable(MemorySegment segment, long index, int value) { VH_extendedDynamicState3LineStippleEnable.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3LineStippleEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LineStippleEnable(int value) { extendedDynamicState3LineStippleEnable(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3DepthClipNegativeOneToOne` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3DepthClipNegativeOneToOne(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3DepthClipNegativeOneToOne.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3DepthClipNegativeOneToOne`}
    public int extendedDynamicState3DepthClipNegativeOneToOne() { return extendedDynamicState3DepthClipNegativeOneToOne(this.segment(), 0L); }
    /// Sets `extendedDynamicState3DepthClipNegativeOneToOne` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3DepthClipNegativeOneToOne(MemorySegment segment, long index, int value) { VH_extendedDynamicState3DepthClipNegativeOneToOne.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3DepthClipNegativeOneToOne` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClipNegativeOneToOne(int value) { extendedDynamicState3DepthClipNegativeOneToOne(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3ViewportWScalingEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3ViewportWScalingEnable(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3ViewportWScalingEnable.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3ViewportWScalingEnable`}
    public int extendedDynamicState3ViewportWScalingEnable() { return extendedDynamicState3ViewportWScalingEnable(this.segment(), 0L); }
    /// Sets `extendedDynamicState3ViewportWScalingEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3ViewportWScalingEnable(MemorySegment segment, long index, int value) { VH_extendedDynamicState3ViewportWScalingEnable.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3ViewportWScalingEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ViewportWScalingEnable(int value) { extendedDynamicState3ViewportWScalingEnable(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3ViewportSwizzle` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3ViewportSwizzle(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3ViewportSwizzle.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3ViewportSwizzle`}
    public int extendedDynamicState3ViewportSwizzle() { return extendedDynamicState3ViewportSwizzle(this.segment(), 0L); }
    /// Sets `extendedDynamicState3ViewportSwizzle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3ViewportSwizzle(MemorySegment segment, long index, int value) { VH_extendedDynamicState3ViewportSwizzle.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3ViewportSwizzle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ViewportSwizzle(int value) { extendedDynamicState3ViewportSwizzle(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3CoverageToColorEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3CoverageToColorEnable(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3CoverageToColorEnable.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3CoverageToColorEnable`}
    public int extendedDynamicState3CoverageToColorEnable() { return extendedDynamicState3CoverageToColorEnable(this.segment(), 0L); }
    /// Sets `extendedDynamicState3CoverageToColorEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3CoverageToColorEnable(MemorySegment segment, long index, int value) { VH_extendedDynamicState3CoverageToColorEnable.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3CoverageToColorEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageToColorEnable(int value) { extendedDynamicState3CoverageToColorEnable(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3CoverageToColorLocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3CoverageToColorLocation(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3CoverageToColorLocation.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3CoverageToColorLocation`}
    public int extendedDynamicState3CoverageToColorLocation() { return extendedDynamicState3CoverageToColorLocation(this.segment(), 0L); }
    /// Sets `extendedDynamicState3CoverageToColorLocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3CoverageToColorLocation(MemorySegment segment, long index, int value) { VH_extendedDynamicState3CoverageToColorLocation.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3CoverageToColorLocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageToColorLocation(int value) { extendedDynamicState3CoverageToColorLocation(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3CoverageModulationMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3CoverageModulationMode(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3CoverageModulationMode.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3CoverageModulationMode`}
    public int extendedDynamicState3CoverageModulationMode() { return extendedDynamicState3CoverageModulationMode(this.segment(), 0L); }
    /// Sets `extendedDynamicState3CoverageModulationMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3CoverageModulationMode(MemorySegment segment, long index, int value) { VH_extendedDynamicState3CoverageModulationMode.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3CoverageModulationMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationMode(int value) { extendedDynamicState3CoverageModulationMode(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3CoverageModulationTableEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3CoverageModulationTableEnable(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3CoverageModulationTableEnable.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3CoverageModulationTableEnable`}
    public int extendedDynamicState3CoverageModulationTableEnable() { return extendedDynamicState3CoverageModulationTableEnable(this.segment(), 0L); }
    /// Sets `extendedDynamicState3CoverageModulationTableEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3CoverageModulationTableEnable(MemorySegment segment, long index, int value) { VH_extendedDynamicState3CoverageModulationTableEnable.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3CoverageModulationTableEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationTableEnable(int value) { extendedDynamicState3CoverageModulationTableEnable(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3CoverageModulationTable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3CoverageModulationTable(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3CoverageModulationTable.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3CoverageModulationTable`}
    public int extendedDynamicState3CoverageModulationTable() { return extendedDynamicState3CoverageModulationTable(this.segment(), 0L); }
    /// Sets `extendedDynamicState3CoverageModulationTable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3CoverageModulationTable(MemorySegment segment, long index, int value) { VH_extendedDynamicState3CoverageModulationTable.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3CoverageModulationTable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationTable(int value) { extendedDynamicState3CoverageModulationTable(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3CoverageReductionMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3CoverageReductionMode(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3CoverageReductionMode.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3CoverageReductionMode`}
    public int extendedDynamicState3CoverageReductionMode() { return extendedDynamicState3CoverageReductionMode(this.segment(), 0L); }
    /// Sets `extendedDynamicState3CoverageReductionMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3CoverageReductionMode(MemorySegment segment, long index, int value) { VH_extendedDynamicState3CoverageReductionMode.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3CoverageReductionMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageReductionMode(int value) { extendedDynamicState3CoverageReductionMode(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3RepresentativeFragmentTestEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3RepresentativeFragmentTestEnable(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3RepresentativeFragmentTestEnable.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3RepresentativeFragmentTestEnable`}
    public int extendedDynamicState3RepresentativeFragmentTestEnable() { return extendedDynamicState3RepresentativeFragmentTestEnable(this.segment(), 0L); }
    /// Sets `extendedDynamicState3RepresentativeFragmentTestEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3RepresentativeFragmentTestEnable(MemorySegment segment, long index, int value) { VH_extendedDynamicState3RepresentativeFragmentTestEnable.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3RepresentativeFragmentTestEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RepresentativeFragmentTestEnable(int value) { extendedDynamicState3RepresentativeFragmentTestEnable(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState3ShadingRateImageEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState3ShadingRateImageEnable(MemorySegment segment, long index) { return (int) VH_extendedDynamicState3ShadingRateImageEnable.get(segment, 0L, index); }
    /// {@return `extendedDynamicState3ShadingRateImageEnable`}
    public int extendedDynamicState3ShadingRateImageEnable() { return extendedDynamicState3ShadingRateImageEnable(this.segment(), 0L); }
    /// Sets `extendedDynamicState3ShadingRateImageEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState3ShadingRateImageEnable(MemorySegment segment, long index, int value) { VH_extendedDynamicState3ShadingRateImageEnable.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState3ShadingRateImageEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ShadingRateImageEnable(int value) { extendedDynamicState3ShadingRateImageEnable(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceExtendedDynamicState3FeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceExtendedDynamicState3FeaturesEXT`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT asSlice(long index) { return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceExtendedDynamicState3FeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceExtendedDynamicState3FeaturesEXT`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceExtendedDynamicState3FeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT at(long index, Consumer<VkPhysicalDeviceExtendedDynamicState3FeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3TessellationDomainOrigin` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3TessellationDomainOriginAt(long index) { return extendedDynamicState3TessellationDomainOrigin(this.segment(), index); }
    /// Sets `extendedDynamicState3TessellationDomainOrigin` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3TessellationDomainOriginAt(long index, int value) { extendedDynamicState3TessellationDomainOrigin(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3DepthClampEnable` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3DepthClampEnableAt(long index) { return extendedDynamicState3DepthClampEnable(this.segment(), index); }
    /// Sets `extendedDynamicState3DepthClampEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClampEnableAt(long index, int value) { extendedDynamicState3DepthClampEnable(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3PolygonMode` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3PolygonModeAt(long index) { return extendedDynamicState3PolygonMode(this.segment(), index); }
    /// Sets `extendedDynamicState3PolygonMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3PolygonModeAt(long index, int value) { extendedDynamicState3PolygonMode(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3RasterizationSamples` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3RasterizationSamplesAt(long index) { return extendedDynamicState3RasterizationSamples(this.segment(), index); }
    /// Sets `extendedDynamicState3RasterizationSamples` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RasterizationSamplesAt(long index, int value) { extendedDynamicState3RasterizationSamples(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3SampleMask` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3SampleMaskAt(long index) { return extendedDynamicState3SampleMask(this.segment(), index); }
    /// Sets `extendedDynamicState3SampleMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3SampleMaskAt(long index, int value) { extendedDynamicState3SampleMask(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3AlphaToCoverageEnable` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3AlphaToCoverageEnableAt(long index) { return extendedDynamicState3AlphaToCoverageEnable(this.segment(), index); }
    /// Sets `extendedDynamicState3AlphaToCoverageEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3AlphaToCoverageEnableAt(long index, int value) { extendedDynamicState3AlphaToCoverageEnable(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3AlphaToOneEnable` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3AlphaToOneEnableAt(long index) { return extendedDynamicState3AlphaToOneEnable(this.segment(), index); }
    /// Sets `extendedDynamicState3AlphaToOneEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3AlphaToOneEnableAt(long index, int value) { extendedDynamicState3AlphaToOneEnable(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3LogicOpEnable` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3LogicOpEnableAt(long index) { return extendedDynamicState3LogicOpEnable(this.segment(), index); }
    /// Sets `extendedDynamicState3LogicOpEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LogicOpEnableAt(long index, int value) { extendedDynamicState3LogicOpEnable(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3ColorBlendEnable` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3ColorBlendEnableAt(long index) { return extendedDynamicState3ColorBlendEnable(this.segment(), index); }
    /// Sets `extendedDynamicState3ColorBlendEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendEnableAt(long index, int value) { extendedDynamicState3ColorBlendEnable(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3ColorBlendEquation` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3ColorBlendEquationAt(long index) { return extendedDynamicState3ColorBlendEquation(this.segment(), index); }
    /// Sets `extendedDynamicState3ColorBlendEquation` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendEquationAt(long index, int value) { extendedDynamicState3ColorBlendEquation(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3ColorWriteMask` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3ColorWriteMaskAt(long index) { return extendedDynamicState3ColorWriteMask(this.segment(), index); }
    /// Sets `extendedDynamicState3ColorWriteMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorWriteMaskAt(long index, int value) { extendedDynamicState3ColorWriteMask(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3RasterizationStream` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3RasterizationStreamAt(long index) { return extendedDynamicState3RasterizationStream(this.segment(), index); }
    /// Sets `extendedDynamicState3RasterizationStream` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RasterizationStreamAt(long index, int value) { extendedDynamicState3RasterizationStream(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3ConservativeRasterizationMode` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3ConservativeRasterizationModeAt(long index) { return extendedDynamicState3ConservativeRasterizationMode(this.segment(), index); }
    /// Sets `extendedDynamicState3ConservativeRasterizationMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ConservativeRasterizationModeAt(long index, int value) { extendedDynamicState3ConservativeRasterizationMode(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3ExtraPrimitiveOverestimationSize` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3ExtraPrimitiveOverestimationSizeAt(long index) { return extendedDynamicState3ExtraPrimitiveOverestimationSize(this.segment(), index); }
    /// Sets `extendedDynamicState3ExtraPrimitiveOverestimationSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ExtraPrimitiveOverestimationSizeAt(long index, int value) { extendedDynamicState3ExtraPrimitiveOverestimationSize(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3DepthClipEnable` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3DepthClipEnableAt(long index) { return extendedDynamicState3DepthClipEnable(this.segment(), index); }
    /// Sets `extendedDynamicState3DepthClipEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClipEnableAt(long index, int value) { extendedDynamicState3DepthClipEnable(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3SampleLocationsEnable` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3SampleLocationsEnableAt(long index) { return extendedDynamicState3SampleLocationsEnable(this.segment(), index); }
    /// Sets `extendedDynamicState3SampleLocationsEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3SampleLocationsEnableAt(long index, int value) { extendedDynamicState3SampleLocationsEnable(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3ColorBlendAdvanced` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3ColorBlendAdvancedAt(long index) { return extendedDynamicState3ColorBlendAdvanced(this.segment(), index); }
    /// Sets `extendedDynamicState3ColorBlendAdvanced` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendAdvancedAt(long index, int value) { extendedDynamicState3ColorBlendAdvanced(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3ProvokingVertexMode` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3ProvokingVertexModeAt(long index) { return extendedDynamicState3ProvokingVertexMode(this.segment(), index); }
    /// Sets `extendedDynamicState3ProvokingVertexMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ProvokingVertexModeAt(long index, int value) { extendedDynamicState3ProvokingVertexMode(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3LineRasterizationMode` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3LineRasterizationModeAt(long index) { return extendedDynamicState3LineRasterizationMode(this.segment(), index); }
    /// Sets `extendedDynamicState3LineRasterizationMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LineRasterizationModeAt(long index, int value) { extendedDynamicState3LineRasterizationMode(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3LineStippleEnable` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3LineStippleEnableAt(long index) { return extendedDynamicState3LineStippleEnable(this.segment(), index); }
    /// Sets `extendedDynamicState3LineStippleEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LineStippleEnableAt(long index, int value) { extendedDynamicState3LineStippleEnable(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3DepthClipNegativeOneToOne` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3DepthClipNegativeOneToOneAt(long index) { return extendedDynamicState3DepthClipNegativeOneToOne(this.segment(), index); }
    /// Sets `extendedDynamicState3DepthClipNegativeOneToOne` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClipNegativeOneToOneAt(long index, int value) { extendedDynamicState3DepthClipNegativeOneToOne(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3ViewportWScalingEnable` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3ViewportWScalingEnableAt(long index) { return extendedDynamicState3ViewportWScalingEnable(this.segment(), index); }
    /// Sets `extendedDynamicState3ViewportWScalingEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ViewportWScalingEnableAt(long index, int value) { extendedDynamicState3ViewportWScalingEnable(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3ViewportSwizzle` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3ViewportSwizzleAt(long index) { return extendedDynamicState3ViewportSwizzle(this.segment(), index); }
    /// Sets `extendedDynamicState3ViewportSwizzle` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ViewportSwizzleAt(long index, int value) { extendedDynamicState3ViewportSwizzle(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3CoverageToColorEnable` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3CoverageToColorEnableAt(long index) { return extendedDynamicState3CoverageToColorEnable(this.segment(), index); }
    /// Sets `extendedDynamicState3CoverageToColorEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageToColorEnableAt(long index, int value) { extendedDynamicState3CoverageToColorEnable(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3CoverageToColorLocation` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3CoverageToColorLocationAt(long index) { return extendedDynamicState3CoverageToColorLocation(this.segment(), index); }
    /// Sets `extendedDynamicState3CoverageToColorLocation` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageToColorLocationAt(long index, int value) { extendedDynamicState3CoverageToColorLocation(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3CoverageModulationMode` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3CoverageModulationModeAt(long index) { return extendedDynamicState3CoverageModulationMode(this.segment(), index); }
    /// Sets `extendedDynamicState3CoverageModulationMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationModeAt(long index, int value) { extendedDynamicState3CoverageModulationMode(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3CoverageModulationTableEnable` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3CoverageModulationTableEnableAt(long index) { return extendedDynamicState3CoverageModulationTableEnable(this.segment(), index); }
    /// Sets `extendedDynamicState3CoverageModulationTableEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationTableEnableAt(long index, int value) { extendedDynamicState3CoverageModulationTableEnable(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3CoverageModulationTable` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3CoverageModulationTableAt(long index) { return extendedDynamicState3CoverageModulationTable(this.segment(), index); }
    /// Sets `extendedDynamicState3CoverageModulationTable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationTableAt(long index, int value) { extendedDynamicState3CoverageModulationTable(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3CoverageReductionMode` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3CoverageReductionModeAt(long index) { return extendedDynamicState3CoverageReductionMode(this.segment(), index); }
    /// Sets `extendedDynamicState3CoverageReductionMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageReductionModeAt(long index, int value) { extendedDynamicState3CoverageReductionMode(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3RepresentativeFragmentTestEnable` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3RepresentativeFragmentTestEnableAt(long index) { return extendedDynamicState3RepresentativeFragmentTestEnable(this.segment(), index); }
    /// Sets `extendedDynamicState3RepresentativeFragmentTestEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RepresentativeFragmentTestEnableAt(long index, int value) { extendedDynamicState3RepresentativeFragmentTestEnable(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState3ShadingRateImageEnable` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState3ShadingRateImageEnableAt(long index) { return extendedDynamicState3ShadingRateImageEnable(this.segment(), index); }
    /// Sets `extendedDynamicState3ShadingRateImageEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ShadingRateImageEnableAt(long index, int value) { extendedDynamicState3ShadingRateImageEnable(this.segment(), index, value); return this; }

}
