// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDataGraphPipelineResourceInfoARM`.
/// ## Layout
/// ```
/// struct VkDataGraphPipelineResourceInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t descriptorSet;
///     uint32_t binding;
///     uint32_t arrayElement;
/// }
/// ```
public final class VkDataGraphPipelineResourceInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("descriptorSet"),
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("arrayElement")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_descriptorSet = LAYOUT.byteOffset(PathElement.groupElement("descriptorSet"));
    public static final long OFFSET_binding = LAYOUT.byteOffset(PathElement.groupElement("binding"));
    public static final long OFFSET_arrayElement = LAYOUT.byteOffset(PathElement.groupElement("arrayElement"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_descriptorSet = LAYOUT.select(PathElement.groupElement("descriptorSet"));
    public static final MemoryLayout LAYOUT_binding = LAYOUT.select(PathElement.groupElement("binding"));
    public static final MemoryLayout LAYOUT_arrayElement = LAYOUT.select(PathElement.groupElement("arrayElement"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_descriptorSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSet"));
    public static final VarHandle VH_binding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding"));
    public static final VarHandle VH_arrayElement = LAYOUT.arrayElementVarHandle(PathElement.groupElement("arrayElement"));

    public VkDataGraphPipelineResourceInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDataGraphPipelineResourceInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineResourceInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkDataGraphPipelineResourceInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineResourceInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDataGraphPipelineResourceInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineResourceInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDataGraphPipelineResourceInfoARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineResourceInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkDataGraphPipelineResourceInfoARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelineResourceInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkDataGraphPipelineResourceInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_RESOURCE_INFO_ARM); }
    public static VkDataGraphPipelineResourceInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_RESOURCE_INFO_ARM);
        return s;
    }
    public VkDataGraphPipelineResourceInfoARM copyFrom(VkDataGraphPipelineResourceInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDataGraphPipelineResourceInfoARM reinterpret(long count) { return new VkDataGraphPipelineResourceInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDataGraphPipelineResourceInfoARM asSlice(long index) { return new VkDataGraphPipelineResourceInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDataGraphPipelineResourceInfoARM asSlice(long index, long count) { return new VkDataGraphPipelineResourceInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDataGraphPipelineResourceInfoARM at(long index, Consumer<VkDataGraphPipelineResourceInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int descriptorSetAt(long index) { return (int) VH_descriptorSet.get(this.segment(), 0L, index); }
    public int bindingAt(long index) { return (int) VH_binding.get(this.segment(), 0L, index); }
    public int arrayElementAt(long index) { return (int) VH_arrayElement.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int descriptorSet() { return (int) VH_descriptorSet.get(this.segment(), 0L, 0L); }
    public int binding() { return (int) VH_binding.get(this.segment(), 0L, 0L); }
    public int arrayElement() { return (int) VH_arrayElement.get(this.segment(), 0L, 0L); }
    public VkDataGraphPipelineResourceInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineResourceInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineResourceInfoARM descriptorSetAt(long index, int value) { VH_descriptorSet.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineResourceInfoARM bindingAt(long index, int value) { VH_binding.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineResourceInfoARM arrayElementAt(long index, int value) { VH_arrayElement.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelineResourceInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineResourceInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineResourceInfoARM descriptorSet(int value) { VH_descriptorSet.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineResourceInfoARM binding(int value) { VH_binding.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelineResourceInfoARM arrayElement(int value) { VH_arrayElement.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDataGraphPipelineResourceInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineResourceInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDataGraphPipelineResourceInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineResourceInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _descriptorSetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorSet, index), LAYOUT_descriptorSet); }
    public MemorySegment _descriptorSet() { return _descriptorSetAt(0L); }
    public VkDataGraphPipelineResourceInfoARM _descriptorSetAt(long index, MemorySegment src) { _descriptorSetAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineResourceInfoARM _descriptorSet(MemorySegment src) { return _descriptorSetAt(0L, src); }
    public MemorySegment _bindingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_binding, index), LAYOUT_binding); }
    public MemorySegment _binding() { return _bindingAt(0L); }
    public VkDataGraphPipelineResourceInfoARM _bindingAt(long index, MemorySegment src) { _bindingAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineResourceInfoARM _binding(MemorySegment src) { return _bindingAt(0L, src); }
    public MemorySegment _arrayElementAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_arrayElement, index), LAYOUT_arrayElement); }
    public MemorySegment _arrayElement() { return _arrayElementAt(0L); }
    public VkDataGraphPipelineResourceInfoARM _arrayElementAt(long index, MemorySegment src) { _arrayElementAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelineResourceInfoARM _arrayElement(MemorySegment src) { return _arrayElementAt(0L, src); }
}
