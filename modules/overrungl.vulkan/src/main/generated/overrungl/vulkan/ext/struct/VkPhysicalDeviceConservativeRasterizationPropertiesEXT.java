// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceConservativeRasterizationPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceConservativeRasterizationPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     float primitiveOverestimationSize;
///     float maxExtraPrimitiveOverestimationSize;
///     float extraPrimitiveOverestimationSizeGranularity;
///     VkBool32 primitiveUnderestimation;
///     VkBool32 conservativePointAndLineRasterization;
///     VkBool32 degenerateTrianglesRasterized;
///     VkBool32 degenerateLinesRasterized;
///     VkBool32 fullyCoveredFragmentShaderInputVariable;
///     VkBool32 conservativeRasterizationPostDepthCoverage;
/// }
/// ```
public final class VkPhysicalDeviceConservativeRasterizationPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_FLOAT.withName("primitiveOverestimationSize"),
        ValueLayout.JAVA_FLOAT.withName("maxExtraPrimitiveOverestimationSize"),
        ValueLayout.JAVA_FLOAT.withName("extraPrimitiveOverestimationSizeGranularity"),
        ValueLayout.JAVA_INT.withName("primitiveUnderestimation"),
        ValueLayout.JAVA_INT.withName("conservativePointAndLineRasterization"),
        ValueLayout.JAVA_INT.withName("degenerateTrianglesRasterized"),
        ValueLayout.JAVA_INT.withName("degenerateLinesRasterized"),
        ValueLayout.JAVA_INT.withName("fullyCoveredFragmentShaderInputVariable"),
        ValueLayout.JAVA_INT.withName("conservativeRasterizationPostDepthCoverage")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_primitiveOverestimationSize = LAYOUT.byteOffset(PathElement.groupElement("primitiveOverestimationSize"));
    public static final long OFFSET_maxExtraPrimitiveOverestimationSize = LAYOUT.byteOffset(PathElement.groupElement("maxExtraPrimitiveOverestimationSize"));
    public static final long OFFSET_extraPrimitiveOverestimationSizeGranularity = LAYOUT.byteOffset(PathElement.groupElement("extraPrimitiveOverestimationSizeGranularity"));
    public static final long OFFSET_primitiveUnderestimation = LAYOUT.byteOffset(PathElement.groupElement("primitiveUnderestimation"));
    public static final long OFFSET_conservativePointAndLineRasterization = LAYOUT.byteOffset(PathElement.groupElement("conservativePointAndLineRasterization"));
    public static final long OFFSET_degenerateTrianglesRasterized = LAYOUT.byteOffset(PathElement.groupElement("degenerateTrianglesRasterized"));
    public static final long OFFSET_degenerateLinesRasterized = LAYOUT.byteOffset(PathElement.groupElement("degenerateLinesRasterized"));
    public static final long OFFSET_fullyCoveredFragmentShaderInputVariable = LAYOUT.byteOffset(PathElement.groupElement("fullyCoveredFragmentShaderInputVariable"));
    public static final long OFFSET_conservativeRasterizationPostDepthCoverage = LAYOUT.byteOffset(PathElement.groupElement("conservativeRasterizationPostDepthCoverage"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_primitiveOverestimationSize = LAYOUT.select(PathElement.groupElement("primitiveOverestimationSize"));
    public static final MemoryLayout LAYOUT_maxExtraPrimitiveOverestimationSize = LAYOUT.select(PathElement.groupElement("maxExtraPrimitiveOverestimationSize"));
    public static final MemoryLayout LAYOUT_extraPrimitiveOverestimationSizeGranularity = LAYOUT.select(PathElement.groupElement("extraPrimitiveOverestimationSizeGranularity"));
    public static final MemoryLayout LAYOUT_primitiveUnderestimation = LAYOUT.select(PathElement.groupElement("primitiveUnderestimation"));
    public static final MemoryLayout LAYOUT_conservativePointAndLineRasterization = LAYOUT.select(PathElement.groupElement("conservativePointAndLineRasterization"));
    public static final MemoryLayout LAYOUT_degenerateTrianglesRasterized = LAYOUT.select(PathElement.groupElement("degenerateTrianglesRasterized"));
    public static final MemoryLayout LAYOUT_degenerateLinesRasterized = LAYOUT.select(PathElement.groupElement("degenerateLinesRasterized"));
    public static final MemoryLayout LAYOUT_fullyCoveredFragmentShaderInputVariable = LAYOUT.select(PathElement.groupElement("fullyCoveredFragmentShaderInputVariable"));
    public static final MemoryLayout LAYOUT_conservativeRasterizationPostDepthCoverage = LAYOUT.select(PathElement.groupElement("conservativeRasterizationPostDepthCoverage"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_primitiveOverestimationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveOverestimationSize"));
    public static final VarHandle VH_maxExtraPrimitiveOverestimationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExtraPrimitiveOverestimationSize"));
    public static final VarHandle VH_extraPrimitiveOverestimationSizeGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extraPrimitiveOverestimationSizeGranularity"));
    public static final VarHandle VH_primitiveUnderestimation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveUnderestimation"));
    public static final VarHandle VH_conservativePointAndLineRasterization = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conservativePointAndLineRasterization"));
    public static final VarHandle VH_degenerateTrianglesRasterized = LAYOUT.arrayElementVarHandle(PathElement.groupElement("degenerateTrianglesRasterized"));
    public static final VarHandle VH_degenerateLinesRasterized = LAYOUT.arrayElementVarHandle(PathElement.groupElement("degenerateLinesRasterized"));
    public static final VarHandle VH_fullyCoveredFragmentShaderInputVariable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fullyCoveredFragmentShaderInputVariable"));
    public static final VarHandle VH_conservativeRasterizationPostDepthCoverage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conservativeRasterizationPostDepthCoverage"));

    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTConservativeRasterization.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT); }
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTConservativeRasterization.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT copyFrom(VkPhysicalDeviceConservativeRasterizationPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT at(long index, Consumer<VkPhysicalDeviceConservativeRasterizationPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public float primitiveOverestimationSizeAt(long index) { return (float) VH_primitiveOverestimationSize.get(this.segment(), 0L, index); }
    public float maxExtraPrimitiveOverestimationSizeAt(long index) { return (float) VH_maxExtraPrimitiveOverestimationSize.get(this.segment(), 0L, index); }
    public float extraPrimitiveOverestimationSizeGranularityAt(long index) { return (float) VH_extraPrimitiveOverestimationSizeGranularity.get(this.segment(), 0L, index); }
    public int primitiveUnderestimationAt(long index) { return (int) VH_primitiveUnderestimation.get(this.segment(), 0L, index); }
    public int conservativePointAndLineRasterizationAt(long index) { return (int) VH_conservativePointAndLineRasterization.get(this.segment(), 0L, index); }
    public int degenerateTrianglesRasterizedAt(long index) { return (int) VH_degenerateTrianglesRasterized.get(this.segment(), 0L, index); }
    public int degenerateLinesRasterizedAt(long index) { return (int) VH_degenerateLinesRasterized.get(this.segment(), 0L, index); }
    public int fullyCoveredFragmentShaderInputVariableAt(long index) { return (int) VH_fullyCoveredFragmentShaderInputVariable.get(this.segment(), 0L, index); }
    public int conservativeRasterizationPostDepthCoverageAt(long index) { return (int) VH_conservativeRasterizationPostDepthCoverage.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public float primitiveOverestimationSize() { return (float) VH_primitiveOverestimationSize.get(this.segment(), 0L, 0L); }
    public float maxExtraPrimitiveOverestimationSize() { return (float) VH_maxExtraPrimitiveOverestimationSize.get(this.segment(), 0L, 0L); }
    public float extraPrimitiveOverestimationSizeGranularity() { return (float) VH_extraPrimitiveOverestimationSizeGranularity.get(this.segment(), 0L, 0L); }
    public int primitiveUnderestimation() { return (int) VH_primitiveUnderestimation.get(this.segment(), 0L, 0L); }
    public int conservativePointAndLineRasterization() { return (int) VH_conservativePointAndLineRasterization.get(this.segment(), 0L, 0L); }
    public int degenerateTrianglesRasterized() { return (int) VH_degenerateTrianglesRasterized.get(this.segment(), 0L, 0L); }
    public int degenerateLinesRasterized() { return (int) VH_degenerateLinesRasterized.get(this.segment(), 0L, 0L); }
    public int fullyCoveredFragmentShaderInputVariable() { return (int) VH_fullyCoveredFragmentShaderInputVariable.get(this.segment(), 0L, 0L); }
    public int conservativeRasterizationPostDepthCoverage() { return (int) VH_conservativeRasterizationPostDepthCoverage.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT primitiveOverestimationSizeAt(long index, float value) { VH_primitiveOverestimationSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT maxExtraPrimitiveOverestimationSizeAt(long index, float value) { VH_maxExtraPrimitiveOverestimationSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT extraPrimitiveOverestimationSizeGranularityAt(long index, float value) { VH_extraPrimitiveOverestimationSizeGranularity.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT primitiveUnderestimationAt(long index, int value) { VH_primitiveUnderestimation.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT conservativePointAndLineRasterizationAt(long index, int value) { VH_conservativePointAndLineRasterization.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT degenerateTrianglesRasterizedAt(long index, int value) { VH_degenerateTrianglesRasterized.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT degenerateLinesRasterizedAt(long index, int value) { VH_degenerateLinesRasterized.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT fullyCoveredFragmentShaderInputVariableAt(long index, int value) { VH_fullyCoveredFragmentShaderInputVariable.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT conservativeRasterizationPostDepthCoverageAt(long index, int value) { VH_conservativeRasterizationPostDepthCoverage.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT primitiveOverestimationSize(float value) { VH_primitiveOverestimationSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT maxExtraPrimitiveOverestimationSize(float value) { VH_maxExtraPrimitiveOverestimationSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT extraPrimitiveOverestimationSizeGranularity(float value) { VH_extraPrimitiveOverestimationSizeGranularity.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT primitiveUnderestimation(int value) { VH_primitiveUnderestimation.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT conservativePointAndLineRasterization(int value) { VH_conservativePointAndLineRasterization.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT degenerateTrianglesRasterized(int value) { VH_degenerateTrianglesRasterized.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT degenerateLinesRasterized(int value) { VH_degenerateLinesRasterized.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT fullyCoveredFragmentShaderInputVariable(int value) { VH_fullyCoveredFragmentShaderInputVariable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT conservativeRasterizationPostDepthCoverage(int value) { VH_conservativeRasterizationPostDepthCoverage.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _primitiveOverestimationSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_primitiveOverestimationSize, index), LAYOUT_primitiveOverestimationSize); }
    public MemorySegment _primitiveOverestimationSize() { return _primitiveOverestimationSizeAt(0L); }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT _primitiveOverestimationSizeAt(long index, MemorySegment src) { _primitiveOverestimationSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT _primitiveOverestimationSize(MemorySegment src) { return _primitiveOverestimationSizeAt(0L, src); }
    public MemorySegment _maxExtraPrimitiveOverestimationSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxExtraPrimitiveOverestimationSize, index), LAYOUT_maxExtraPrimitiveOverestimationSize); }
    public MemorySegment _maxExtraPrimitiveOverestimationSize() { return _maxExtraPrimitiveOverestimationSizeAt(0L); }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT _maxExtraPrimitiveOverestimationSizeAt(long index, MemorySegment src) { _maxExtraPrimitiveOverestimationSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT _maxExtraPrimitiveOverestimationSize(MemorySegment src) { return _maxExtraPrimitiveOverestimationSizeAt(0L, src); }
    public MemorySegment _extraPrimitiveOverestimationSizeGranularityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extraPrimitiveOverestimationSizeGranularity, index), LAYOUT_extraPrimitiveOverestimationSizeGranularity); }
    public MemorySegment _extraPrimitiveOverestimationSizeGranularity() { return _extraPrimitiveOverestimationSizeGranularityAt(0L); }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT _extraPrimitiveOverestimationSizeGranularityAt(long index, MemorySegment src) { _extraPrimitiveOverestimationSizeGranularityAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT _extraPrimitiveOverestimationSizeGranularity(MemorySegment src) { return _extraPrimitiveOverestimationSizeGranularityAt(0L, src); }
    public MemorySegment _primitiveUnderestimationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_primitiveUnderestimation, index), LAYOUT_primitiveUnderestimation); }
    public MemorySegment _primitiveUnderestimation() { return _primitiveUnderestimationAt(0L); }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT _primitiveUnderestimationAt(long index, MemorySegment src) { _primitiveUnderestimationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT _primitiveUnderestimation(MemorySegment src) { return _primitiveUnderestimationAt(0L, src); }
    public MemorySegment _conservativePointAndLineRasterizationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_conservativePointAndLineRasterization, index), LAYOUT_conservativePointAndLineRasterization); }
    public MemorySegment _conservativePointAndLineRasterization() { return _conservativePointAndLineRasterizationAt(0L); }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT _conservativePointAndLineRasterizationAt(long index, MemorySegment src) { _conservativePointAndLineRasterizationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT _conservativePointAndLineRasterization(MemorySegment src) { return _conservativePointAndLineRasterizationAt(0L, src); }
    public MemorySegment _degenerateTrianglesRasterizedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_degenerateTrianglesRasterized, index), LAYOUT_degenerateTrianglesRasterized); }
    public MemorySegment _degenerateTrianglesRasterized() { return _degenerateTrianglesRasterizedAt(0L); }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT _degenerateTrianglesRasterizedAt(long index, MemorySegment src) { _degenerateTrianglesRasterizedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT _degenerateTrianglesRasterized(MemorySegment src) { return _degenerateTrianglesRasterizedAt(0L, src); }
    public MemorySegment _degenerateLinesRasterizedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_degenerateLinesRasterized, index), LAYOUT_degenerateLinesRasterized); }
    public MemorySegment _degenerateLinesRasterized() { return _degenerateLinesRasterizedAt(0L); }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT _degenerateLinesRasterizedAt(long index, MemorySegment src) { _degenerateLinesRasterizedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT _degenerateLinesRasterized(MemorySegment src) { return _degenerateLinesRasterizedAt(0L, src); }
    public MemorySegment _fullyCoveredFragmentShaderInputVariableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fullyCoveredFragmentShaderInputVariable, index), LAYOUT_fullyCoveredFragmentShaderInputVariable); }
    public MemorySegment _fullyCoveredFragmentShaderInputVariable() { return _fullyCoveredFragmentShaderInputVariableAt(0L); }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT _fullyCoveredFragmentShaderInputVariableAt(long index, MemorySegment src) { _fullyCoveredFragmentShaderInputVariableAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT _fullyCoveredFragmentShaderInputVariable(MemorySegment src) { return _fullyCoveredFragmentShaderInputVariableAt(0L, src); }
    public MemorySegment _conservativeRasterizationPostDepthCoverageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_conservativeRasterizationPostDepthCoverage, index), LAYOUT_conservativeRasterizationPostDepthCoverage); }
    public MemorySegment _conservativeRasterizationPostDepthCoverage() { return _conservativeRasterizationPostDepthCoverageAt(0L); }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT _conservativeRasterizationPostDepthCoverageAt(long index, MemorySegment src) { _conservativeRasterizationPostDepthCoverageAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT _conservativeRasterizationPostDepthCoverage(MemorySegment src) { return _conservativeRasterizationPostDepthCoverageAt(0L, src); }
}
