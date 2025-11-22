// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineFragmentShadingRateEnumStateCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkPipelineFragmentShadingRateEnumStateCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkFragmentShadingRateTypeNV shadingRateType;
///     VkFragmentShadingRateNV shadingRate;
///     VkFragmentShadingRateCombinerOpKHR combinerOps[2];
/// }
/// ```
public final class VkPipelineFragmentShadingRateEnumStateCreateInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shadingRateType"),
        ValueLayout.JAVA_INT.withName("shadingRate"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_INT).withName("combinerOps")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shadingRateType = LAYOUT.byteOffset(PathElement.groupElement("shadingRateType"));
    public static final long OFFSET_shadingRate = LAYOUT.byteOffset(PathElement.groupElement("shadingRate"));
    public static final long OFFSET_combinerOps = LAYOUT.byteOffset(PathElement.groupElement("combinerOps"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shadingRateType = LAYOUT.select(PathElement.groupElement("shadingRateType"));
    public static final MemoryLayout LAYOUT_shadingRate = LAYOUT.select(PathElement.groupElement("shadingRate"));
    public static final MemoryLayout LAYOUT_combinerOps = LAYOUT.select(PathElement.groupElement("combinerOps"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shadingRateType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateType"));
    public static final VarHandle VH_shadingRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRate"));
    public static final VarHandle VH_combinerOps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("combinerOps"), PathElement.sequenceElement());

    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVFragmentShadingRateEnums.VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV); }
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVFragmentShadingRateEnums.VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV);
        return s;
    }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV copyFrom(VkPipelineFragmentShadingRateEnumStateCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV reinterpret(long count) { return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV asSlice(long index) { return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV asSlice(long index, long count) { return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV at(long index, Consumer<VkPipelineFragmentShadingRateEnumStateCreateInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shadingRateTypeAt(long index) { return (int) VH_shadingRateType.get(this.segment(), 0L, index); }
    public int shadingRateAt(long index) { return (int) VH_shadingRate.get(this.segment(), 0L, index); }
    public int combinerOpsAt(long index, long index0) { return (int) VH_combinerOps.get(this.segment(), 0L, index, index0); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shadingRateType() { return (int) VH_shadingRateType.get(this.segment(), 0L, 0L); }
    public int shadingRate() { return (int) VH_shadingRate.get(this.segment(), 0L, 0L); }
    public int combinerOps(long index0) { return (int) VH_combinerOps.get(this.segment(), 0L, 0L, index0); }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV shadingRateTypeAt(long index, int value) { VH_shadingRateType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV shadingRateAt(long index, int value) { VH_shadingRate.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV combinerOpsAt(long index, long index0, int value) { VH_combinerOps.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV shadingRateType(int value) { VH_shadingRateType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV shadingRate(int value) { VH_shadingRate.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV combinerOps(long index0, int value) { VH_combinerOps.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shadingRateTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shadingRateType, index), LAYOUT_shadingRateType); }
    public MemorySegment _shadingRateType() { return _shadingRateTypeAt(0L); }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV _shadingRateTypeAt(long index, MemorySegment src) { _shadingRateTypeAt(index).copyFrom(src); return this; }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV _shadingRateType(MemorySegment src) { return _shadingRateTypeAt(0L, src); }
    public MemorySegment _shadingRateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shadingRate, index), LAYOUT_shadingRate); }
    public MemorySegment _shadingRate() { return _shadingRateAt(0L); }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV _shadingRateAt(long index, MemorySegment src) { _shadingRateAt(index).copyFrom(src); return this; }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV _shadingRate(MemorySegment src) { return _shadingRateAt(0L, src); }
    public MemorySegment _combinerOpsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_combinerOps, index), LAYOUT_combinerOps); }
    public MemorySegment _combinerOps() { return _combinerOpsAt(0L); }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV _combinerOpsAt(long index, MemorySegment src) { _combinerOpsAt(index).copyFrom(src); return this; }
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV _combinerOps(MemorySegment src) { return _combinerOpsAt(0L, src); }
}
