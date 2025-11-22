// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRayTracingPipelineCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkRayTracingPipelineCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineCreateFlags flags;
///     uint32_t stageCount;
///     const VkPipelineShaderStageCreateInfo* pStages;
///     uint32_t groupCount;
///     const VkRayTracingShaderGroupCreateInfoKHR* pGroups;
///     uint32_t maxPipelineRayRecursionDepth;
///     const VkPipelineLibraryCreateInfoKHR* pLibraryInfo;
///     const VkRayTracingPipelineInterfaceCreateInfoKHR* pLibraryInterface;
///     const VkPipelineDynamicStateCreateInfo* pDynamicState;
///     VkPipelineLayout layout;
///     VkPipeline basePipelineHandle;
///     int32_t basePipelineIndex;
/// }
/// ```
public final class VkRayTracingPipelineCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("stageCount"),
        ValueLayout.ADDRESS.withName("pStages"),
        ValueLayout.JAVA_INT.withName("groupCount"),
        ValueLayout.ADDRESS.withName("pGroups"),
        ValueLayout.JAVA_INT.withName("maxPipelineRayRecursionDepth"),
        ValueLayout.ADDRESS.withName("pLibraryInfo"),
        ValueLayout.ADDRESS.withName("pLibraryInterface"),
        ValueLayout.ADDRESS.withName("pDynamicState"),
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
    public static final long OFFSET_maxPipelineRayRecursionDepth = LAYOUT.byteOffset(PathElement.groupElement("maxPipelineRayRecursionDepth"));
    public static final long OFFSET_pLibraryInfo = LAYOUT.byteOffset(PathElement.groupElement("pLibraryInfo"));
    public static final long OFFSET_pLibraryInterface = LAYOUT.byteOffset(PathElement.groupElement("pLibraryInterface"));
    public static final long OFFSET_pDynamicState = LAYOUT.byteOffset(PathElement.groupElement("pDynamicState"));
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
    public static final MemoryLayout LAYOUT_maxPipelineRayRecursionDepth = LAYOUT.select(PathElement.groupElement("maxPipelineRayRecursionDepth"));
    public static final MemoryLayout LAYOUT_pLibraryInfo = LAYOUT.select(PathElement.groupElement("pLibraryInfo"));
    public static final MemoryLayout LAYOUT_pLibraryInterface = LAYOUT.select(PathElement.groupElement("pLibraryInterface"));
    public static final MemoryLayout LAYOUT_pDynamicState = LAYOUT.select(PathElement.groupElement("pDynamicState"));
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
    public static final VarHandle VH_maxPipelineRayRecursionDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPipelineRayRecursionDepth"));
    public static final VarHandle VH_pLibraryInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLibraryInfo"));
    public static final VarHandle VH_pLibraryInterface = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLibraryInterface"));
    public static final VarHandle VH_pDynamicState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDynamicState"));
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    public static final VarHandle VH_basePipelineHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineHandle"));
    public static final VarHandle VH_basePipelineIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineIndex"));

    public VkRayTracingPipelineCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRayTracingPipelineCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingPipelineCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkRayTracingPipelineCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingPipelineCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRayTracingPipelineCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingPipelineCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRayTracingPipelineCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkRayTracingPipelineCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkRayTracingPipelineCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkRayTracingPipelineCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkRayTracingPipelineCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRRayTracingPipeline.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR); }
    public static VkRayTracingPipelineCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRRayTracingPipeline.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR);
        return s;
    }
    public VkRayTracingPipelineCreateInfoKHR copyFrom(VkRayTracingPipelineCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRayTracingPipelineCreateInfoKHR reinterpret(long count) { return new VkRayTracingPipelineCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRayTracingPipelineCreateInfoKHR asSlice(long index) { return new VkRayTracingPipelineCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRayTracingPipelineCreateInfoKHR asSlice(long index, long count) { return new VkRayTracingPipelineCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRayTracingPipelineCreateInfoKHR at(long index, Consumer<VkRayTracingPipelineCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int stageCountAt(long index) { return (int) VH_stageCount.get(this.segment(), 0L, index); }
    public MemorySegment pStagesAt(long index) { return (MemorySegment) VH_pStages.get(this.segment(), 0L, index); }
    public int groupCountAt(long index) { return (int) VH_groupCount.get(this.segment(), 0L, index); }
    public MemorySegment pGroupsAt(long index) { return (MemorySegment) VH_pGroups.get(this.segment(), 0L, index); }
    public int maxPipelineRayRecursionDepthAt(long index) { return (int) VH_maxPipelineRayRecursionDepth.get(this.segment(), 0L, index); }
    public MemorySegment pLibraryInfoAt(long index) { return (MemorySegment) VH_pLibraryInfo.get(this.segment(), 0L, index); }
    public MemorySegment pLibraryInterfaceAt(long index) { return (MemorySegment) VH_pLibraryInterface.get(this.segment(), 0L, index); }
    public MemorySegment pDynamicStateAt(long index) { return (MemorySegment) VH_pDynamicState.get(this.segment(), 0L, index); }
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
    public int maxPipelineRayRecursionDepth() { return (int) VH_maxPipelineRayRecursionDepth.get(this.segment(), 0L, 0L); }
    public MemorySegment pLibraryInfo() { return (MemorySegment) VH_pLibraryInfo.get(this.segment(), 0L, 0L); }
    public MemorySegment pLibraryInterface() { return (MemorySegment) VH_pLibraryInterface.get(this.segment(), 0L, 0L); }
    public MemorySegment pDynamicState() { return (MemorySegment) VH_pDynamicState.get(this.segment(), 0L, 0L); }
    public long layout() { return (long) VH_layout.get(this.segment(), 0L, 0L); }
    public long basePipelineHandle() { return (long) VH_basePipelineHandle.get(this.segment(), 0L, 0L); }
    public int basePipelineIndex() { return (int) VH_basePipelineIndex.get(this.segment(), 0L, 0L); }
    public VkRayTracingPipelineCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR stageCountAt(long index, int value) { VH_stageCount.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR pStagesAt(long index, MemorySegment value) { VH_pStages.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR groupCountAt(long index, int value) { VH_groupCount.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR pGroupsAt(long index, MemorySegment value) { VH_pGroups.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR maxPipelineRayRecursionDepthAt(long index, int value) { VH_maxPipelineRayRecursionDepth.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR pLibraryInfoAt(long index, MemorySegment value) { VH_pLibraryInfo.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR pLibraryInterfaceAt(long index, MemorySegment value) { VH_pLibraryInterface.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR pDynamicStateAt(long index, MemorySegment value) { VH_pDynamicState.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR layoutAt(long index, long value) { VH_layout.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR basePipelineHandleAt(long index, long value) { VH_basePipelineHandle.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR basePipelineIndexAt(long index, int value) { VH_basePipelineIndex.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR stageCount(int value) { VH_stageCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR pStages(MemorySegment value) { VH_pStages.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR groupCount(int value) { VH_groupCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR pGroups(MemorySegment value) { VH_pGroups.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR maxPipelineRayRecursionDepth(int value) { VH_maxPipelineRayRecursionDepth.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR pLibraryInfo(MemorySegment value) { VH_pLibraryInfo.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR pLibraryInterface(MemorySegment value) { VH_pLibraryInterface.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR pDynamicState(MemorySegment value) { VH_pDynamicState.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR layout(long value) { VH_layout.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR basePipelineHandle(long value) { VH_basePipelineHandle.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingPipelineCreateInfoKHR basePipelineIndex(int value) { VH_basePipelineIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRayTracingPipelineCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRayTracingPipelineCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkRayTracingPipelineCreateInfoKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _stageCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stageCount, index), LAYOUT_stageCount); }
    public MemorySegment _stageCount() { return _stageCountAt(0L); }
    public VkRayTracingPipelineCreateInfoKHR _stageCountAt(long index, MemorySegment src) { _stageCountAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoKHR _stageCount(MemorySegment src) { return _stageCountAt(0L, src); }
    public MemorySegment _pStagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStages, index), LAYOUT_pStages); }
    public MemorySegment _pStages() { return _pStagesAt(0L); }
    public VkRayTracingPipelineCreateInfoKHR _pStagesAt(long index, MemorySegment src) { _pStagesAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoKHR _pStages(MemorySegment src) { return _pStagesAt(0L, src); }
    public MemorySegment _groupCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_groupCount, index), LAYOUT_groupCount); }
    public MemorySegment _groupCount() { return _groupCountAt(0L); }
    public VkRayTracingPipelineCreateInfoKHR _groupCountAt(long index, MemorySegment src) { _groupCountAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoKHR _groupCount(MemorySegment src) { return _groupCountAt(0L, src); }
    public MemorySegment _pGroupsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pGroups, index), LAYOUT_pGroups); }
    public MemorySegment _pGroups() { return _pGroupsAt(0L); }
    public VkRayTracingPipelineCreateInfoKHR _pGroupsAt(long index, MemorySegment src) { _pGroupsAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoKHR _pGroups(MemorySegment src) { return _pGroupsAt(0L, src); }
    public MemorySegment _maxPipelineRayRecursionDepthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPipelineRayRecursionDepth, index), LAYOUT_maxPipelineRayRecursionDepth); }
    public MemorySegment _maxPipelineRayRecursionDepth() { return _maxPipelineRayRecursionDepthAt(0L); }
    public VkRayTracingPipelineCreateInfoKHR _maxPipelineRayRecursionDepthAt(long index, MemorySegment src) { _maxPipelineRayRecursionDepthAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoKHR _maxPipelineRayRecursionDepth(MemorySegment src) { return _maxPipelineRayRecursionDepthAt(0L, src); }
    public MemorySegment _pLibraryInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pLibraryInfo, index), LAYOUT_pLibraryInfo); }
    public MemorySegment _pLibraryInfo() { return _pLibraryInfoAt(0L); }
    public VkRayTracingPipelineCreateInfoKHR _pLibraryInfoAt(long index, MemorySegment src) { _pLibraryInfoAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoKHR _pLibraryInfo(MemorySegment src) { return _pLibraryInfoAt(0L, src); }
    public MemorySegment _pLibraryInterfaceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pLibraryInterface, index), LAYOUT_pLibraryInterface); }
    public MemorySegment _pLibraryInterface() { return _pLibraryInterfaceAt(0L); }
    public VkRayTracingPipelineCreateInfoKHR _pLibraryInterfaceAt(long index, MemorySegment src) { _pLibraryInterfaceAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoKHR _pLibraryInterface(MemorySegment src) { return _pLibraryInterfaceAt(0L, src); }
    public MemorySegment _pDynamicStateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDynamicState, index), LAYOUT_pDynamicState); }
    public MemorySegment _pDynamicState() { return _pDynamicStateAt(0L); }
    public VkRayTracingPipelineCreateInfoKHR _pDynamicStateAt(long index, MemorySegment src) { _pDynamicStateAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoKHR _pDynamicState(MemorySegment src) { return _pDynamicStateAt(0L, src); }
    public MemorySegment _layoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layout, index), LAYOUT_layout); }
    public MemorySegment _layout() { return _layoutAt(0L); }
    public VkRayTracingPipelineCreateInfoKHR _layoutAt(long index, MemorySegment src) { _layoutAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoKHR _layout(MemorySegment src) { return _layoutAt(0L, src); }
    public MemorySegment _basePipelineHandleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_basePipelineHandle, index), LAYOUT_basePipelineHandle); }
    public MemorySegment _basePipelineHandle() { return _basePipelineHandleAt(0L); }
    public VkRayTracingPipelineCreateInfoKHR _basePipelineHandleAt(long index, MemorySegment src) { _basePipelineHandleAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoKHR _basePipelineHandle(MemorySegment src) { return _basePipelineHandleAt(0L, src); }
    public MemorySegment _basePipelineIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_basePipelineIndex, index), LAYOUT_basePipelineIndex); }
    public MemorySegment _basePipelineIndex() { return _basePipelineIndexAt(0L); }
    public VkRayTracingPipelineCreateInfoKHR _basePipelineIndexAt(long index, MemorySegment src) { _basePipelineIndexAt(index).copyFrom(src); return this; }
    public VkRayTracingPipelineCreateInfoKHR _basePipelineIndex(MemorySegment src) { return _basePipelineIndexAt(0L, src); }
}
