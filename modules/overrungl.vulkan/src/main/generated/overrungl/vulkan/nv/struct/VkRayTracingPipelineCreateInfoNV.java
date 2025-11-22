// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRayTracingPipelineCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkRayTracingPipelineCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineCreateFlags flags;
///     uint32_t stageCount;
///     const VkPipelineShaderStageCreateInfo* pStages;
///     uint32_t groupCount;
///     const VkRayTracingShaderGroupCreateInfoNV* pGroups;
///     uint32_t maxRecursionDepth;
///     VkPipelineLayout layout;
///     VkPipeline basePipelineHandle;
///     int32_t basePipelineIndex;
/// }
/// ```
public final class VkRayTracingPipelineCreateInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("stageCount"),
        ValueLayout.ADDRESS.withName("pStages"),
        ValueLayout.JAVA_INT.withName("groupCount"),
        ValueLayout.ADDRESS.withName("pGroups"),
        ValueLayout.JAVA_INT.withName("maxRecursionDepth"),
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_LONG.withName("basePipelineHandle"),
        ValueLayout.JAVA_INT.withName("basePipelineIndex")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_stageCount = LAYOUT.byteOffset(PathElement.groupElement("stageCount"));
    public static final long OFFSET_pStages = LAYOUT.byteOffset(PathElement.groupElement("pStages"));
    public static final long OFFSET_groupCount = LAYOUT.byteOffset(PathElement.groupElement("groupCount"));
    public static final long OFFSET_pGroups = LAYOUT.byteOffset(PathElement.groupElement("pGroups"));
    public static final long OFFSET_maxRecursionDepth = LAYOUT.byteOffset(PathElement.groupElement("maxRecursionDepth"));
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    public static final long OFFSET_basePipelineHandle = LAYOUT.byteOffset(PathElement.groupElement("basePipelineHandle"));
    public static final long OFFSET_basePipelineIndex = LAYOUT.byteOffset(PathElement.groupElement("basePipelineIndex"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_stageCount = LAYOUT.select(PathElement.groupElement("stageCount"));
    public static final MemoryLayout LAYOUT_pStages = LAYOUT.select(PathElement.groupElement("pStages"));
    public static final MemoryLayout LAYOUT_groupCount = LAYOUT.select(PathElement.groupElement("groupCount"));
    public static final MemoryLayout LAYOUT_pGroups = LAYOUT.select(PathElement.groupElement("pGroups"));
    public static final MemoryLayout LAYOUT_maxRecursionDepth = LAYOUT.select(PathElement.groupElement("maxRecursionDepth"));
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    public static final MemoryLayout LAYOUT_basePipelineHandle = LAYOUT.select(PathElement.groupElement("basePipelineHandle"));
    public static final MemoryLayout LAYOUT_basePipelineIndex = LAYOUT.select(PathElement.groupElement("basePipelineIndex"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_stageCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageCount"));
    public static final VarHandle VH_pStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStages"));
    public static final VarHandle VH_groupCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("groupCount"));
    public static final VarHandle VH_pGroups = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pGroups"));
    public static final VarHandle VH_maxRecursionDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxRecursionDepth"));
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    public static final VarHandle VH_basePipelineHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineHandle"));
    public static final VarHandle VH_basePipelineIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineIndex"));

    public VkRayTracingPipelineCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRayTracingPipelineCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingPipelineCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkRayTracingPipelineCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingPipelineCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRayTracingPipelineCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingPipelineCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRayTracingPipelineCreateInfoNV alloc(SegmentAllocator allocator) { return new VkRayTracingPipelineCreateInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkRayTracingPipelineCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkRayTracingPipelineCreateInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkRayTracingPipelineCreateInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVRayTracing.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV); }
    public static VkRayTracingPipelineCreateInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVRayTracing.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV);
        return s;
    }
    public VkRayTracingPipelineCreateInfoNV copyFrom(VkRayTracingPipelineCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRayTracingPipelineCreateInfoNV reinterpret(long count) { return new VkRayTracingPipelineCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRayTracingPipelineCreateInfoNV asSlice(long index) { return new VkRayTracingPipelineCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRayTracingPipelineCreateInfoNV asSlice(long index, long count) { return new VkRayTracingPipelineCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRayTracingPipelineCreateInfoNV at(long index, Consumer<VkRayTracingPipelineCreateInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int stageCountAt(long index) { return (int) VH_stageCount.get(this.segment(), 0L, index); }
    public MemorySegment pStagesAt(long index) { return (MemorySegment) VH_pStages.get(this.segment(), 0L, index); }
    public int groupCountAt(long index) { return (int) VH_groupCount.get(this.segment(), 0L, index); }
    public MemorySegment pGroupsAt(long index) { return (MemorySegment) VH_pGroups.get(this.segment(), 0L, index); }
    public int maxRecursionDepthAt(long index) { return (int) VH_maxRecursionDepth.get(this.segment(), 0L, index); }
    public long layoutAt(long index) { return (long) VH_layout.get(this.segment(), 0L, index); }
    public long basePipelineHandleAt(long index) { return (long) VH_basePipelineHandle.get(this.segment(), 0L, index); }
    public int basePipelineIndexAt(long index) { return (int) VH_basePipelineIndex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int stageCount() { return (int) VH_stageCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pStages() { return (MemorySegment) VH_pStages.get(this.segment(), 0L, 0L); }
    public int groupCount() { return (int) VH_groupCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pGroups() { return (MemorySegment) VH_pGroups.get(this.segment(), 0L, 0L); }
    public int maxRecursionDepth() { return (int) VH_maxRecursionDepth.get(this.segment(), 0L, 0L); }
    public long layout() { return (long) VH_layout.get(this.segment(), 0L, 0L); }
    public long basePipelineHandle() { return (long) VH_basePipelineHandle.get(this.segment(), 0L, 0L); }
    public int basePipelineIndex() { return (int) VH_basePipelineIndex.get(this.segment(), 0L, 0L); }
    public VkRayTracingPipelineCreateInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoNV flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoNV stageCountAt(long index, int value) { VH_stageCount.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoNV pStagesAt(long index, MemorySegment value) { VH_pStages.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoNV groupCountAt(long index, int value) { VH_groupCount.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoNV pGroupsAt(long index, MemorySegment value) { VH_pGroups.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoNV maxRecursionDepthAt(long index, int value) { VH_maxRecursionDepth.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoNV layoutAt(long index, long value) { VH_layout.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoNV basePipelineHandleAt(long index, long value) { VH_basePipelineHandle.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoNV basePipelineIndexAt(long index, int value) { VH_basePipelineIndex.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineCreateInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineCreateInfoNV flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineCreateInfoNV stageCount(int value) { VH_stageCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineCreateInfoNV pStages(MemorySegment value) { VH_pStages.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineCreateInfoNV groupCount(int value) { VH_groupCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineCreateInfoNV pGroups(MemorySegment value) { VH_pGroups.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineCreateInfoNV maxRecursionDepth(int value) { VH_maxRecursionDepth.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineCreateInfoNV layout(long value) { VH_layout.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineCreateInfoNV basePipelineHandle(long value) { VH_basePipelineHandle.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineCreateInfoNV basePipelineIndex(int value) { VH_basePipelineIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRayTracingPipelineCreateInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRayTracingPipelineCreateInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkRayTracingPipelineCreateInfoNV _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoNV _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _stageCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stageCount, index), LAYOUT_stageCount); }
    public MemorySegment _stageCount() { return _stageCountAt(0L); }
    public VkRayTracingPipelineCreateInfoNV _stageCountAt(long index, MemorySegment src) { _stageCountAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoNV _stageCount(MemorySegment src) { return _stageCountAt(0L, src); }
    public MemorySegment _pStagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStages, index), LAYOUT_pStages); }
    public MemorySegment _pStages() { return _pStagesAt(0L); }
    public VkRayTracingPipelineCreateInfoNV _pStagesAt(long index, MemorySegment src) { _pStagesAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoNV _pStages(MemorySegment src) { return _pStagesAt(0L, src); }
    public MemorySegment _groupCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_groupCount, index), LAYOUT_groupCount); }
    public MemorySegment _groupCount() { return _groupCountAt(0L); }
    public VkRayTracingPipelineCreateInfoNV _groupCountAt(long index, MemorySegment src) { _groupCountAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoNV _groupCount(MemorySegment src) { return _groupCountAt(0L, src); }
    public MemorySegment _pGroupsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pGroups, index), LAYOUT_pGroups); }
    public MemorySegment _pGroups() { return _pGroupsAt(0L); }
    public VkRayTracingPipelineCreateInfoNV _pGroupsAt(long index, MemorySegment src) { _pGroupsAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoNV _pGroups(MemorySegment src) { return _pGroupsAt(0L, src); }
    public MemorySegment _maxRecursionDepthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxRecursionDepth, index), LAYOUT_maxRecursionDepth); }
    public MemorySegment _maxRecursionDepth() { return _maxRecursionDepthAt(0L); }
    public VkRayTracingPipelineCreateInfoNV _maxRecursionDepthAt(long index, MemorySegment src) { _maxRecursionDepthAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoNV _maxRecursionDepth(MemorySegment src) { return _maxRecursionDepthAt(0L, src); }
    public MemorySegment _layoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layout, index), LAYOUT_layout); }
    public MemorySegment _layout() { return _layoutAt(0L); }
    public VkRayTracingPipelineCreateInfoNV _layoutAt(long index, MemorySegment src) { _layoutAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoNV _layout(MemorySegment src) { return _layoutAt(0L, src); }
    public MemorySegment _basePipelineHandleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_basePipelineHandle, index), LAYOUT_basePipelineHandle); }
    public MemorySegment _basePipelineHandle() { return _basePipelineHandleAt(0L); }
    public VkRayTracingPipelineCreateInfoNV _basePipelineHandleAt(long index, MemorySegment src) { _basePipelineHandleAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoNV _basePipelineHandle(MemorySegment src) { return _basePipelineHandleAt(0L, src); }
    public MemorySegment _basePipelineIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_basePipelineIndex, index), LAYOUT_basePipelineIndex); }
    public MemorySegment _basePipelineIndex() { return _basePipelineIndexAt(0L); }
    public VkRayTracingPipelineCreateInfoNV _basePipelineIndexAt(long index, MemorySegment src) { _basePipelineIndexAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoNV _basePipelineIndex(MemorySegment src) { return _basePipelineIndexAt(0L, src); }
}
