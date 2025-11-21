// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDataGraphPipelineBuiltinModelCreateInfoQCOM`.
/// ## Layout
/// ```
/// struct VkDataGraphPipelineBuiltinModelCreateInfoQCOM {
///     VkStructureType sType;
///     const void* pNext;
///     const VkPhysicalDeviceDataGraphOperationSupportARM* pOperation;
/// }
/// ```
public final class VkDataGraphPipelineBuiltinModelCreateInfoQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pOperation")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pOperation = LAYOUT.byteOffset(PathElement.groupElement("pOperation"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pOperation = LAYOUT.select(PathElement.groupElement("pOperation"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pOperation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pOperation"));

    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMDataGraphModel.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_BUILTIN_MODEL_CREATE_INFO_QCOM); }
    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMDataGraphModel.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_BUILTIN_MODEL_CREATE_INFO_QCOM);
        return s;
    }
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM copyFrom(VkDataGraphPipelineBuiltinModelCreateInfoQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM reinterpret(long count) { return new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM asSlice(long index) { return new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM asSlice(long index, long count) { return new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM at(long index, Consumer<VkDataGraphPipelineBuiltinModelCreateInfoQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pOperationAt(long index) { return (MemorySegment) VH_pOperation.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pOperation() { return (MemorySegment) VH_pOperation.get(this.segment(), 0L, 0L); }
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM pOperationAt(long index, MemorySegment value) { VH_pOperation.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM pOperation(MemorySegment value) { VH_pOperation.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pOperationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pOperation, index), LAYOUT_pOperation); }
    public MemorySegment _pOperation() { return _pOperationAt(0L); }
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM _pOperationAt(long index, MemorySegment src) { _pOperationAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM _pOperation(MemorySegment src) { return _pOperationAt(0L, src); }
}
