// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDataGraphPipelineConstantARM`.
/// ## Layout
/// ```
/// struct VkDataGraphPipelineConstantARM {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t id;
///     const void* pConstantData;
/// }
/// ```
public final class VkDataGraphPipelineConstantARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("id"),
        ValueLayout.ADDRESS.withName("pConstantData")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_id = LAYOUT.byteOffset(PathElement.groupElement("id"));
    public static final long OFFSET_pConstantData = LAYOUT.byteOffset(PathElement.groupElement("pConstantData"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_id = LAYOUT.select(PathElement.groupElement("id"));
    public static final MemoryLayout LAYOUT_pConstantData = LAYOUT.select(PathElement.groupElement("pConstantData"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("id"));
    public static final VarHandle VH_pConstantData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pConstantData"));

    public VkDataGraphPipelineConstantARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDataGraphPipelineConstantARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineConstantARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkDataGraphPipelineConstantARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineConstantARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDataGraphPipelineConstantARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineConstantARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDataGraphPipelineConstantARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineConstantARM(allocator.allocate(LAYOUT), 1); }
    public static VkDataGraphPipelineConstantARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelineConstantARM(allocator.allocate(LAYOUT, count), count); }
    public static VkDataGraphPipelineConstantARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_ARM); }
    public static VkDataGraphPipelineConstantARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_ARM);
        return s;
    }
    public VkDataGraphPipelineConstantARM copyFrom(VkDataGraphPipelineConstantARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDataGraphPipelineConstantARM reinterpret(long count) { return new VkDataGraphPipelineConstantARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDataGraphPipelineConstantARM asSlice(long index) { return new VkDataGraphPipelineConstantARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDataGraphPipelineConstantARM asSlice(long index, long count) { return new VkDataGraphPipelineConstantARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDataGraphPipelineConstantARM at(long index, Consumer<VkDataGraphPipelineConstantARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int idAt(long index) { return (int) VH_id.get(this.segment(), 0L, index); }
    public MemorySegment pConstantDataAt(long index) { return (MemorySegment) VH_pConstantData.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int id() { return (int) VH_id.get(this.segment(), 0L, 0L); }
    public MemorySegment pConstantData() { return (MemorySegment) VH_pConstantData.get(this.segment(), 0L, 0L); }
    public VkDataGraphPipelineConstantARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineConstantARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineConstantARM idAt(long index, int value) { VH_id.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineConstantARM pConstantDataAt(long index, MemorySegment value) { VH_pConstantData.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineConstantARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineConstantARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineConstantARM id(int value) { VH_id.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineConstantARM pConstantData(MemorySegment value) { VH_pConstantData.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDataGraphPipelineConstantARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineConstantARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDataGraphPipelineConstantARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineConstantARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _idAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_id, index), LAYOUT_id); }
    public MemorySegment _id() { return _idAt(0L); }
    public VkDataGraphPipelineConstantARM _idAt(long index, MemorySegment src) { _idAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineConstantARM _id(MemorySegment src) { return _idAt(0L, src); }
    public MemorySegment _pConstantDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pConstantData, index), LAYOUT_pConstantData); }
    public MemorySegment _pConstantData() { return _pConstantDataAt(0L); }
    public VkDataGraphPipelineConstantARM _pConstantDataAt(long index, MemorySegment src) { _pConstantDataAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineConstantARM _pConstantData(MemorySegment src) { return _pConstantDataAt(0L, src); }
}
