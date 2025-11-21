// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDataGraphPipelineSessionCreateInfoARM`.
/// ## Layout
/// ```
/// struct VkDataGraphPipelineSessionCreateInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     VkDataGraphPipelineSessionCreateFlagsARM flags;
///     VkPipeline dataGraphPipeline;
/// }
/// ```
public final class VkDataGraphPipelineSessionCreateInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("flags"),
        ValueLayout.JAVA_LONG.withName("dataGraphPipeline")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_dataGraphPipeline = LAYOUT.byteOffset(PathElement.groupElement("dataGraphPipeline"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_dataGraphPipeline = LAYOUT.select(PathElement.groupElement("dataGraphPipeline"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_dataGraphPipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataGraphPipeline"));

    public VkDataGraphPipelineSessionCreateInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDataGraphPipelineSessionCreateInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineSessionCreateInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkDataGraphPipelineSessionCreateInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineSessionCreateInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDataGraphPipelineSessionCreateInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineSessionCreateInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDataGraphPipelineSessionCreateInfoARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineSessionCreateInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkDataGraphPipelineSessionCreateInfoARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelineSessionCreateInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkDataGraphPipelineSessionCreateInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_CREATE_INFO_ARM); }
    public static VkDataGraphPipelineSessionCreateInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_CREATE_INFO_ARM);
        return s;
    }
    public VkDataGraphPipelineSessionCreateInfoARM copyFrom(VkDataGraphPipelineSessionCreateInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDataGraphPipelineSessionCreateInfoARM reinterpret(long count) { return new VkDataGraphPipelineSessionCreateInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDataGraphPipelineSessionCreateInfoARM asSlice(long index) { return new VkDataGraphPipelineSessionCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDataGraphPipelineSessionCreateInfoARM asSlice(long index, long count) { return new VkDataGraphPipelineSessionCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDataGraphPipelineSessionCreateInfoARM at(long index, Consumer<VkDataGraphPipelineSessionCreateInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long flagsAt(long index) { return (long) VH_flags.get(this.segment(), 0L, index); }
    public long dataGraphPipelineAt(long index) { return (long) VH_dataGraphPipeline.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long flags() { return (long) VH_flags.get(this.segment(), 0L, 0L); }
    public long dataGraphPipeline() { return (long) VH_dataGraphPipeline.get(this.segment(), 0L, 0L); }
    public VkDataGraphPipelineSessionCreateInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineSessionCreateInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineSessionCreateInfoARM flagsAt(long index, long value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineSessionCreateInfoARM dataGraphPipelineAt(long index, long value) { VH_dataGraphPipeline.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineSessionCreateInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineSessionCreateInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineSessionCreateInfoARM flags(long value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineSessionCreateInfoARM dataGraphPipeline(long value) { VH_dataGraphPipeline.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDataGraphPipelineSessionCreateInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineSessionCreateInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDataGraphPipelineSessionCreateInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineSessionCreateInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkDataGraphPipelineSessionCreateInfoARM _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineSessionCreateInfoARM _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _dataGraphPipelineAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dataGraphPipeline, index), LAYOUT_dataGraphPipeline); }
    public MemorySegment _dataGraphPipeline() { return _dataGraphPipelineAt(0L); }
    public VkDataGraphPipelineSessionCreateInfoARM _dataGraphPipelineAt(long index, MemorySegment src) { _dataGraphPipelineAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineSessionCreateInfoARM _dataGraphPipeline(MemorySegment src) { return _dataGraphPipelineAt(0L, src); }
}
