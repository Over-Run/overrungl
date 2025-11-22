// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amd.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineRasterizationStateRasterizationOrderAMD`.
/// ## Layout
/// ```
/// struct VkPipelineRasterizationStateRasterizationOrderAMD {
///     VkStructureType sType;
///     const void* pNext;
///     VkRasterizationOrderAMD rasterizationOrder;
/// }
/// ```
public final class VkPipelineRasterizationStateRasterizationOrderAMD extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rasterizationOrder")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_rasterizationOrder = LAYOUT.byteOffset(PathElement.groupElement("rasterizationOrder"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_rasterizationOrder = LAYOUT.select(PathElement.groupElement("rasterizationOrder"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_rasterizationOrder = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationOrder"));

    public VkPipelineRasterizationStateRasterizationOrderAMD(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineRasterizationStateRasterizationOrderAMD of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationStateRasterizationOrderAMD(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineRasterizationStateRasterizationOrderAMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationStateRasterizationOrderAMD(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineRasterizationStateRasterizationOrderAMD ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationStateRasterizationOrderAMD(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineRasterizationStateRasterizationOrderAMD alloc(SegmentAllocator allocator) { return new VkPipelineRasterizationStateRasterizationOrderAMD(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineRasterizationStateRasterizationOrderAMD alloc(SegmentAllocator allocator, long count) { return new VkPipelineRasterizationStateRasterizationOrderAMD(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineRasterizationStateRasterizationOrderAMD allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.amd.VKAMDRasterizationOrder.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD); }
    public static VkPipelineRasterizationStateRasterizationOrderAMD allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.amd.VKAMDRasterizationOrder.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD);
        return s;
    }
    public VkPipelineRasterizationStateRasterizationOrderAMD copyFrom(VkPipelineRasterizationStateRasterizationOrderAMD src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineRasterizationStateRasterizationOrderAMD reinterpret(long count) { return new VkPipelineRasterizationStateRasterizationOrderAMD(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineRasterizationStateRasterizationOrderAMD asSlice(long index) { return new VkPipelineRasterizationStateRasterizationOrderAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineRasterizationStateRasterizationOrderAMD asSlice(long index, long count) { return new VkPipelineRasterizationStateRasterizationOrderAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineRasterizationStateRasterizationOrderAMD at(long index, Consumer<VkPipelineRasterizationStateRasterizationOrderAMD> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int rasterizationOrderAt(long index) { return (int) VH_rasterizationOrder.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int rasterizationOrder() { return (int) VH_rasterizationOrder.get(this.segment(), 0L, 0L); }
    public VkPipelineRasterizationStateRasterizationOrderAMD sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationStateRasterizationOrderAMD pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationStateRasterizationOrderAMD rasterizationOrderAt(long index, int value) { VH_rasterizationOrder.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRasterizationStateRasterizationOrderAMD sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationStateRasterizationOrderAMD pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRasterizationStateRasterizationOrderAMD rasterizationOrder(int value) { VH_rasterizationOrder.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineRasterizationStateRasterizationOrderAMD _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationStateRasterizationOrderAMD _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineRasterizationStateRasterizationOrderAMD _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationStateRasterizationOrderAMD _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _rasterizationOrderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rasterizationOrder, index), LAYOUT_rasterizationOrder); }
    public MemorySegment _rasterizationOrder() { return _rasterizationOrderAt(0L); }
    public VkPipelineRasterizationStateRasterizationOrderAMD _rasterizationOrderAt(long index, MemorySegment src) { _rasterizationOrderAt(index).copyFrom(src); return this; }
    public VkPipelineRasterizationStateRasterizationOrderAMD _rasterizationOrder(MemorySegment src) { return _rasterizationOrderAt(0L, src); }
}
