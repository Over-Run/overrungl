// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineRasterizationConservativeStateCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkPipelineRasterizationConservativeStateCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineRasterizationConservativeStateCreateFlagsEXT flags;
///     VkConservativeRasterizationModeEXT conservativeRasterizationMode;
///     float extraPrimitiveOverestimationSize;
/// }
/// ```
public final class VkPipelineRasterizationConservativeStateCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("conservativeRasterizationMode"),
        ValueLayout.JAVA_FLOAT.withName("extraPrimitiveOverestimationSize")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_conservativeRasterizationMode = LAYOUT.byteOffset(PathElement.groupElement("conservativeRasterizationMode"));
    public static final long OFFSET_extraPrimitiveOverestimationSize = LAYOUT.byteOffset(PathElement.groupElement("extraPrimitiveOverestimationSize"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_conservativeRasterizationMode = LAYOUT.select(PathElement.groupElement("conservativeRasterizationMode"));
    public static final MemoryLayout LAYOUT_extraPrimitiveOverestimationSize = LAYOUT.select(PathElement.groupElement("extraPrimitiveOverestimationSize"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_conservativeRasterizationMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conservativeRasterizationMode"));
    public static final VarHandle VH_extraPrimitiveOverestimationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extraPrimitiveOverestimationSize"));

    public VkPipelineRasterizationConservativeStateCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationConservativeStateCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationConservativeStateCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationConservativeStateCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineRasterizationConservativeStateCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineRasterizationConservativeStateCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTConservativeRasterization.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT); }
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTConservativeRasterization.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT);
        return s;
    }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT copyFrom(VkPipelineRasterizationConservativeStateCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT reinterpret(long count) { return new VkPipelineRasterizationConservativeStateCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT asSlice(long index) { return new VkPipelineRasterizationConservativeStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT asSlice(long index, long count) { return new VkPipelineRasterizationConservativeStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT at(long index, Consumer<VkPipelineRasterizationConservativeStateCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int conservativeRasterizationModeAt(long index) { return (int) VH_conservativeRasterizationMode.get(this.segment(), 0L, index); }
    public float extraPrimitiveOverestimationSizeAt(long index) { return (float) VH_extraPrimitiveOverestimationSize.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int conservativeRasterizationMode() { return (int) VH_conservativeRasterizationMode.get(this.segment(), 0L, 0L); }
    public float extraPrimitiveOverestimationSize() { return (float) VH_extraPrimitiveOverestimationSize.get(this.segment(), 0L, 0L); }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT conservativeRasterizationModeAt(long index, int value) { VH_conservativeRasterizationMode.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT extraPrimitiveOverestimationSizeAt(long index, float value) { VH_extraPrimitiveOverestimationSize.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT conservativeRasterizationMode(int value) { VH_conservativeRasterizationMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT extraPrimitiveOverestimationSize(float value) { VH_extraPrimitiveOverestimationSize.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _conservativeRasterizationModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_conservativeRasterizationMode, index), LAYOUT_conservativeRasterizationMode); }
    public MemorySegment _conservativeRasterizationMode() { return _conservativeRasterizationModeAt(0L); }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT _conservativeRasterizationModeAt(long index, MemorySegment src) { _conservativeRasterizationModeAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT _conservativeRasterizationMode(MemorySegment src) { return _conservativeRasterizationModeAt(0L, src); }
    public MemorySegment _extraPrimitiveOverestimationSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extraPrimitiveOverestimationSize, index), LAYOUT_extraPrimitiveOverestimationSize); }
    public MemorySegment _extraPrimitiveOverestimationSize() { return _extraPrimitiveOverestimationSizeAt(0L); }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT _extraPrimitiveOverestimationSizeAt(long index, MemorySegment src) { _extraPrimitiveOverestimationSizeAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationConservativeStateCreateInfoEXT _extraPrimitiveOverestimationSize(MemorySegment src) { return _extraPrimitiveOverestimationSizeAt(0L, src); }
}
