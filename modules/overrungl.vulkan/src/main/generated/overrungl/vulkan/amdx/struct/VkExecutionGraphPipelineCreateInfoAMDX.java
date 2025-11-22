// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amdx.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExecutionGraphPipelineCreateInfoAMDX`.
/// ## Layout
/// ```
/// struct VkExecutionGraphPipelineCreateInfoAMDX {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineCreateFlags flags;
///     uint32_t stageCount;
///     const VkPipelineShaderStageCreateInfo* pStages;
///     const VkPipelineLibraryCreateInfoKHR* pLibraryInfo;
///     VkPipelineLayout layout;
///     VkPipeline basePipelineHandle;
///     int32_t basePipelineIndex;
/// }
/// ```
public final class VkExecutionGraphPipelineCreateInfoAMDX extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("stageCount"),
        ValueLayout.ADDRESS.withName("pStages"),
        ValueLayout.ADDRESS.withName("pLibraryInfo"),
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_LONG.withName("basePipelineHandle"),
        ValueLayout.JAVA_INT.withName("basePipelineIndex")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_stageCount = LAYOUT.byteOffset(PathElement.groupElement("stageCount"));
    public static final long OFFSET_pStages = LAYOUT.byteOffset(PathElement.groupElement("pStages"));
    public static final long OFFSET_pLibraryInfo = LAYOUT.byteOffset(PathElement.groupElement("pLibraryInfo"));
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    public static final long OFFSET_basePipelineHandle = LAYOUT.byteOffset(PathElement.groupElement("basePipelineHandle"));
    public static final long OFFSET_basePipelineIndex = LAYOUT.byteOffset(PathElement.groupElement("basePipelineIndex"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_stageCount = LAYOUT.select(PathElement.groupElement("stageCount"));
    public static final MemoryLayout LAYOUT_pStages = LAYOUT.select(PathElement.groupElement("pStages"));
    public static final MemoryLayout LAYOUT_pLibraryInfo = LAYOUT.select(PathElement.groupElement("pLibraryInfo"));
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    public static final MemoryLayout LAYOUT_basePipelineHandle = LAYOUT.select(PathElement.groupElement("basePipelineHandle"));
    public static final MemoryLayout LAYOUT_basePipelineIndex = LAYOUT.select(PathElement.groupElement("basePipelineIndex"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_stageCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageCount"));
    public static final VarHandle VH_pStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStages"));
    public static final VarHandle VH_pLibraryInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLibraryInfo"));
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    public static final VarHandle VH_basePipelineHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineHandle"));
    public static final VarHandle VH_basePipelineIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineIndex"));

    public VkExecutionGraphPipelineCreateInfoAMDX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExecutionGraphPipelineCreateInfoAMDX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExecutionGraphPipelineCreateInfoAMDX(segment, estimateCount(segment, LAYOUT)); }
    public static VkExecutionGraphPipelineCreateInfoAMDX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExecutionGraphPipelineCreateInfoAMDX(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExecutionGraphPipelineCreateInfoAMDX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExecutionGraphPipelineCreateInfoAMDX(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExecutionGraphPipelineCreateInfoAMDX alloc(SegmentAllocator allocator) { return new VkExecutionGraphPipelineCreateInfoAMDX(allocator.allocate(LAYOUT), 1); }
    public static VkExecutionGraphPipelineCreateInfoAMDX alloc(SegmentAllocator allocator, long count) { return new VkExecutionGraphPipelineCreateInfoAMDX(allocator.allocate(LAYOUT, count), count); }
    public static VkExecutionGraphPipelineCreateInfoAMDX allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.amdx.VKAMDXShaderEnqueue.VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX); }
    public static VkExecutionGraphPipelineCreateInfoAMDX allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.amdx.VKAMDXShaderEnqueue.VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX);
        return s;
    }
    public VkExecutionGraphPipelineCreateInfoAMDX copyFrom(VkExecutionGraphPipelineCreateInfoAMDX src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX reinterpret(long count) { return new VkExecutionGraphPipelineCreateInfoAMDX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExecutionGraphPipelineCreateInfoAMDX asSlice(long index) { return new VkExecutionGraphPipelineCreateInfoAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExecutionGraphPipelineCreateInfoAMDX asSlice(long index, long count) { return new VkExecutionGraphPipelineCreateInfoAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExecutionGraphPipelineCreateInfoAMDX at(long index, Consumer<VkExecutionGraphPipelineCreateInfoAMDX> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int stageCountAt(long index) { return (int) VH_stageCount.get(this.segment(), 0L, index); }
    public MemorySegment pStagesAt(long index) { return (MemorySegment) VH_pStages.get(this.segment(), 0L, index); }
    public MemorySegment pLibraryInfoAt(long index) { return (MemorySegment) VH_pLibraryInfo.get(this.segment(), 0L, index); }
    public long layoutAt(long index) { return (long) VH_layout.get(this.segment(), 0L, index); }
    public long basePipelineHandleAt(long index) { return (long) VH_basePipelineHandle.get(this.segment(), 0L, index); }
    public int basePipelineIndexAt(long index) { return (int) VH_basePipelineIndex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int stageCount() { return (int) VH_stageCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pStages() { return (MemorySegment) VH_pStages.get(this.segment(), 0L, 0L); }
    public MemorySegment pLibraryInfo() { return (MemorySegment) VH_pLibraryInfo.get(this.segment(), 0L, 0L); }
    public long layout() { return (long) VH_layout.get(this.segment(), 0L, 0L); }
    public long basePipelineHandle() { return (long) VH_basePipelineHandle.get(this.segment(), 0L, 0L); }
    public int basePipelineIndex() { return (int) VH_basePipelineIndex.get(this.segment(), 0L, 0L); }
    public VkExecutionGraphPipelineCreateInfoAMDX sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX stageCountAt(long index, int value) { VH_stageCount.set(this.segment(), 0L, index, value); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX pStagesAt(long index, MemorySegment value) { VH_pStages.set(this.segment(), 0L, index, value); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX pLibraryInfoAt(long index, MemorySegment value) { VH_pLibraryInfo.set(this.segment(), 0L, index, value); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX layoutAt(long index, long value) { VH_layout.set(this.segment(), 0L, index, value); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX basePipelineHandleAt(long index, long value) { VH_basePipelineHandle.set(this.segment(), 0L, index, value); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX basePipelineIndexAt(long index, int value) { VH_basePipelineIndex.set(this.segment(), 0L, index, value); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX stageCount(int value) { VH_stageCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX pStages(MemorySegment value) { VH_pStages.set(this.segment(), 0L, 0L, value); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX pLibraryInfo(MemorySegment value) { VH_pLibraryInfo.set(this.segment(), 0L, 0L, value); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX layout(long value) { VH_layout.set(this.segment(), 0L, 0L, value); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX basePipelineHandle(long value) { VH_basePipelineHandle.set(this.segment(), 0L, 0L, value); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX basePipelineIndex(int value) { VH_basePipelineIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkExecutionGraphPipelineCreateInfoAMDX _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkExecutionGraphPipelineCreateInfoAMDX _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkExecutionGraphPipelineCreateInfoAMDX _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _stageCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stageCount, index), LAYOUT_stageCount); }
    public MemorySegment _stageCount() { return _stageCountAt(0L); }
    public VkExecutionGraphPipelineCreateInfoAMDX _stageCountAt(long index, MemorySegment src) { _stageCountAt(index).copyFrom(src); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX _stageCount(MemorySegment src) { return _stageCountAt(0L, src); }
    public MemorySegment _pStagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStages, index), LAYOUT_pStages); }
    public MemorySegment _pStages() { return _pStagesAt(0L); }
    public VkExecutionGraphPipelineCreateInfoAMDX _pStagesAt(long index, MemorySegment src) { _pStagesAt(index).copyFrom(src); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX _pStages(MemorySegment src) { return _pStagesAt(0L, src); }
    public MemorySegment _pLibraryInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pLibraryInfo, index), LAYOUT_pLibraryInfo); }
    public MemorySegment _pLibraryInfo() { return _pLibraryInfoAt(0L); }
    public VkExecutionGraphPipelineCreateInfoAMDX _pLibraryInfoAt(long index, MemorySegment src) { _pLibraryInfoAt(index).copyFrom(src); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX _pLibraryInfo(MemorySegment src) { return _pLibraryInfoAt(0L, src); }
    public MemorySegment _layoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layout, index), LAYOUT_layout); }
    public MemorySegment _layout() { return _layoutAt(0L); }
    public VkExecutionGraphPipelineCreateInfoAMDX _layoutAt(long index, MemorySegment src) { _layoutAt(index).copyFrom(src); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX _layout(MemorySegment src) { return _layoutAt(0L, src); }
    public MemorySegment _basePipelineHandleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_basePipelineHandle, index), LAYOUT_basePipelineHandle); }
    public MemorySegment _basePipelineHandle() { return _basePipelineHandleAt(0L); }
    public VkExecutionGraphPipelineCreateInfoAMDX _basePipelineHandleAt(long index, MemorySegment src) { _basePipelineHandleAt(index).copyFrom(src); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX _basePipelineHandle(MemorySegment src) { return _basePipelineHandleAt(0L, src); }
    public MemorySegment _basePipelineIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_basePipelineIndex, index), LAYOUT_basePipelineIndex); }
    public MemorySegment _basePipelineIndex() { return _basePipelineIndexAt(0L); }
    public VkExecutionGraphPipelineCreateInfoAMDX _basePipelineIndexAt(long index, MemorySegment src) { _basePipelineIndexAt(index).copyFrom(src); return this; }
    public VkExecutionGraphPipelineCreateInfoAMDX _basePipelineIndex(MemorySegment src) { return _basePipelineIndexAt(0L, src); }
}
