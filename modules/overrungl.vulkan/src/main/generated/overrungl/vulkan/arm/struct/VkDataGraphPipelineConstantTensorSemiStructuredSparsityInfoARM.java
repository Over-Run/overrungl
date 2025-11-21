// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM`.
/// ## Layout
/// ```
/// struct VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t dimension;
///     uint32_t zeroCount;
///     uint32_t groupSize;
/// }
/// ```
public final class VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dimension"),
        ValueLayout.JAVA_INT.withName("zeroCount"),
        ValueLayout.JAVA_INT.withName("groupSize")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_dimension = LAYOUT.byteOffset(PathElement.groupElement("dimension"));
    public static final long OFFSET_zeroCount = LAYOUT.byteOffset(PathElement.groupElement("zeroCount"));
    public static final long OFFSET_groupSize = LAYOUT.byteOffset(PathElement.groupElement("groupSize"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_dimension = LAYOUT.select(PathElement.groupElement("dimension"));
    public static final MemoryLayout LAYOUT_zeroCount = LAYOUT.select(PathElement.groupElement("zeroCount"));
    public static final MemoryLayout LAYOUT_groupSize = LAYOUT.select(PathElement.groupElement("groupSize"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_dimension = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dimension"));
    public static final VarHandle VH_zeroCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("zeroCount"));
    public static final VarHandle VH_groupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("groupSize"));

    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_TENSOR_SEMI_STRUCTURED_SPARSITY_INFO_ARM); }
    public static VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_TENSOR_SEMI_STRUCTURED_SPARSITY_INFO_ARM);
        return s;
    }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM copyFrom(VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM reinterpret(long count) { return new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM asSlice(long index) { return new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM asSlice(long index, long count) { return new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM at(long index, Consumer<VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int dimensionAt(long index) { return (int) VH_dimension.get(this.segment(), 0L, index); }
    public int zeroCountAt(long index) { return (int) VH_zeroCount.get(this.segment(), 0L, index); }
    public int groupSizeAt(long index) { return (int) VH_groupSize.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int dimension() { return (int) VH_dimension.get(this.segment(), 0L, 0L); }
    public int zeroCount() { return (int) VH_zeroCount.get(this.segment(), 0L, 0L); }
    public int groupSize() { return (int) VH_groupSize.get(this.segment(), 0L, 0L); }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM dimensionAt(long index, int value) { VH_dimension.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM zeroCountAt(long index, int value) { VH_zeroCount.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM groupSizeAt(long index, int value) { VH_groupSize.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM dimension(int value) { VH_dimension.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM zeroCount(int value) { VH_zeroCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM groupSize(int value) { VH_groupSize.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _dimensionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dimension, index), LAYOUT_dimension); }
    public MemorySegment _dimension() { return _dimensionAt(0L); }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM _dimensionAt(long index, MemorySegment src) { _dimensionAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM _dimension(MemorySegment src) { return _dimensionAt(0L, src); }
    public MemorySegment _zeroCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_zeroCount, index), LAYOUT_zeroCount); }
    public MemorySegment _zeroCount() { return _zeroCountAt(0L); }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM _zeroCountAt(long index, MemorySegment src) { _zeroCountAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM _zeroCount(MemorySegment src) { return _zeroCountAt(0L, src); }
    public MemorySegment _groupSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_groupSize, index), LAYOUT_groupSize); }
    public MemorySegment _groupSize() { return _groupSizeAt(0L); }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM _groupSizeAt(long index, MemorySegment src) { _groupSizeAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM _groupSize(MemorySegment src) { return _groupSizeAt(0L, src); }
}
