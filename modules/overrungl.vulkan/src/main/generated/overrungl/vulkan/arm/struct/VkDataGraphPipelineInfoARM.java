// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDataGraphPipelineInfoARM`.
/// ## Layout
/// ```
/// struct VkDataGraphPipelineInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipeline dataGraphPipeline;
/// }
/// ```
public final class VkDataGraphPipelineInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("dataGraphPipeline")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_dataGraphPipeline = LAYOUT.byteOffset(PathElement.groupElement("dataGraphPipeline"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_dataGraphPipeline = LAYOUT.select(PathElement.groupElement("dataGraphPipeline"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_dataGraphPipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataGraphPipeline"));

    public VkDataGraphPipelineInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDataGraphPipelineInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkDataGraphPipelineInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDataGraphPipelineInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDataGraphPipelineInfoARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkDataGraphPipelineInfoARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelineInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkDataGraphPipelineInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_INFO_ARM); }
    public static VkDataGraphPipelineInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_INFO_ARM);
        return s;
    }
    public VkDataGraphPipelineInfoARM copyFrom(VkDataGraphPipelineInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDataGraphPipelineInfoARM reinterpret(long count) { return new VkDataGraphPipelineInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDataGraphPipelineInfoARM asSlice(long index) { return new VkDataGraphPipelineInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDataGraphPipelineInfoARM asSlice(long index, long count) { return new VkDataGraphPipelineInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDataGraphPipelineInfoARM at(long index, Consumer<VkDataGraphPipelineInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long dataGraphPipelineAt(long index) { return (long) VH_dataGraphPipeline.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long dataGraphPipeline() { return (long) VH_dataGraphPipeline.get(this.segment(), 0L, 0L); }
    public VkDataGraphPipelineInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineInfoARM dataGraphPipelineAt(long index, long value) { VH_dataGraphPipeline.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineInfoARM dataGraphPipeline(long value) { VH_dataGraphPipeline.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDataGraphPipelineInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDataGraphPipelineInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _dataGraphPipelineAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dataGraphPipeline, index), LAYOUT_dataGraphPipeline); }
    public MemorySegment _dataGraphPipeline() { return _dataGraphPipelineAt(0L); }
    public VkDataGraphPipelineInfoARM _dataGraphPipelineAt(long index, MemorySegment src) { _dataGraphPipelineAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineInfoARM _dataGraphPipeline(MemorySegment src) { return _dataGraphPipelineAt(0L, src); }
}
