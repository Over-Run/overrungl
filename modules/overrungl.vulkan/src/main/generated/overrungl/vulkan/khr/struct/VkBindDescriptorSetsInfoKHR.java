// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindDescriptorSetsInfoKHR`.
/// ## Layout
/// ```
/// struct VkBindDescriptorSetsInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkShaderStageFlags stageFlags;
///     VkPipelineLayout layout;
///     uint32_t firstSet;
///     uint32_t descriptorSetCount;
///     const VkDescriptorSet* pDescriptorSets;
///     uint32_t dynamicOffsetCount;
///     const uint32_t* pDynamicOffsets;
/// }
/// ```
public final class VkBindDescriptorSetsInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_INT.withName("firstSet"),
        ValueLayout.JAVA_INT.withName("descriptorSetCount"),
        ValueLayout.ADDRESS.withName("pDescriptorSets"),
        ValueLayout.JAVA_INT.withName("dynamicOffsetCount"),
        ValueLayout.ADDRESS.withName("pDynamicOffsets")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_stageFlags = LAYOUT.byteOffset(PathElement.groupElement("stageFlags"));
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    public static final long OFFSET_firstSet = LAYOUT.byteOffset(PathElement.groupElement("firstSet"));
    public static final long OFFSET_descriptorSetCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorSetCount"));
    public static final long OFFSET_pDescriptorSets = LAYOUT.byteOffset(PathElement.groupElement("pDescriptorSets"));
    public static final long OFFSET_dynamicOffsetCount = LAYOUT.byteOffset(PathElement.groupElement("dynamicOffsetCount"));
    public static final long OFFSET_pDynamicOffsets = LAYOUT.byteOffset(PathElement.groupElement("pDynamicOffsets"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_stageFlags = LAYOUT.select(PathElement.groupElement("stageFlags"));
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    public static final MemoryLayout LAYOUT_firstSet = LAYOUT.select(PathElement.groupElement("firstSet"));
    public static final MemoryLayout LAYOUT_descriptorSetCount = LAYOUT.select(PathElement.groupElement("descriptorSetCount"));
    public static final MemoryLayout LAYOUT_pDescriptorSets = LAYOUT.select(PathElement.groupElement("pDescriptorSets"));
    public static final MemoryLayout LAYOUT_dynamicOffsetCount = LAYOUT.select(PathElement.groupElement("dynamicOffsetCount"));
    public static final MemoryLayout LAYOUT_pDynamicOffsets = LAYOUT.select(PathElement.groupElement("pDynamicOffsets"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_stageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageFlags"));
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    public static final VarHandle VH_firstSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstSet"));
    public static final VarHandle VH_descriptorSetCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetCount"));
    public static final VarHandle VH_pDescriptorSets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDescriptorSets"));
    public static final VarHandle VH_dynamicOffsetCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicOffsetCount"));
    public static final VarHandle VH_pDynamicOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDynamicOffsets"));

    public VkBindDescriptorSetsInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBindDescriptorSetsInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindDescriptorSetsInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkBindDescriptorSetsInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindDescriptorSetsInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBindDescriptorSetsInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindDescriptorSetsInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBindDescriptorSetsInfoKHR alloc(SegmentAllocator allocator) { return new VkBindDescriptorSetsInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkBindDescriptorSetsInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkBindDescriptorSetsInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkBindDescriptorSetsInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO); }
    public static VkBindDescriptorSetsInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO);
        return s;
    }
    public VkBindDescriptorSetsInfoKHR copyFrom(VkBindDescriptorSetsInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBindDescriptorSetsInfoKHR reinterpret(long count) { return new VkBindDescriptorSetsInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBindDescriptorSetsInfoKHR asSlice(long index) { return new VkBindDescriptorSetsInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBindDescriptorSetsInfoKHR asSlice(long index, long count) { return new VkBindDescriptorSetsInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBindDescriptorSetsInfoKHR at(long index, Consumer<VkBindDescriptorSetsInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int stageFlagsAt(long index) { return (int) VH_stageFlags.get(this.segment(), 0L, index); }
    public long layoutAt(long index) { return (long) VH_layout.get(this.segment(), 0L, index); }
    public int firstSetAt(long index) { return (int) VH_firstSet.get(this.segment(), 0L, index); }
    public int descriptorSetCountAt(long index) { return (int) VH_descriptorSetCount.get(this.segment(), 0L, index); }
    public MemorySegment pDescriptorSetsAt(long index) { return (MemorySegment) VH_pDescriptorSets.get(this.segment(), 0L, index); }
    public int dynamicOffsetCountAt(long index) { return (int) VH_dynamicOffsetCount.get(this.segment(), 0L, index); }
    public MemorySegment pDynamicOffsetsAt(long index) { return (MemorySegment) VH_pDynamicOffsets.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int stageFlags() { return (int) VH_stageFlags.get(this.segment(), 0L, 0L); }
    public long layout() { return (long) VH_layout.get(this.segment(), 0L, 0L); }
    public int firstSet() { return (int) VH_firstSet.get(this.segment(), 0L, 0L); }
    public int descriptorSetCount() { return (int) VH_descriptorSetCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pDescriptorSets() { return (MemorySegment) VH_pDescriptorSets.get(this.segment(), 0L, 0L); }
    public int dynamicOffsetCount() { return (int) VH_dynamicOffsetCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pDynamicOffsets() { return (MemorySegment) VH_pDynamicOffsets.get(this.segment(), 0L, 0L); }
    public VkBindDescriptorSetsInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBindDescriptorSetsInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBindDescriptorSetsInfoKHR stageFlagsAt(long index, int value) { VH_stageFlags.set(this.segment(), 0L, index, value); return this; }
    public VkBindDescriptorSetsInfoKHR layoutAt(long index, long value) { VH_layout.set(this.segment(), 0L, index, value); return this; }
    public VkBindDescriptorSetsInfoKHR firstSetAt(long index, int value) { VH_firstSet.set(this.segment(), 0L, index, value); return this; }
    public VkBindDescriptorSetsInfoKHR descriptorSetCountAt(long index, int value) { VH_descriptorSetCount.set(this.segment(), 0L, index, value); return this; }
    public VkBindDescriptorSetsInfoKHR pDescriptorSetsAt(long index, MemorySegment value) { VH_pDescriptorSets.set(this.segment(), 0L, index, value); return this; }
    public VkBindDescriptorSetsInfoKHR dynamicOffsetCountAt(long index, int value) { VH_dynamicOffsetCount.set(this.segment(), 0L, index, value); return this; }
    public VkBindDescriptorSetsInfoKHR pDynamicOffsetsAt(long index, MemorySegment value) { VH_pDynamicOffsets.set(this.segment(), 0L, index, value); return this; }
    public VkBindDescriptorSetsInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDescriptorSetsInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDescriptorSetsInfoKHR stageFlags(int value) { VH_stageFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDescriptorSetsInfoKHR layout(long value) { VH_layout.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDescriptorSetsInfoKHR firstSet(int value) { VH_firstSet.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDescriptorSetsInfoKHR descriptorSetCount(int value) { VH_descriptorSetCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDescriptorSetsInfoKHR pDescriptorSets(MemorySegment value) { VH_pDescriptorSets.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDescriptorSetsInfoKHR dynamicOffsetCount(int value) { VH_dynamicOffsetCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDescriptorSetsInfoKHR pDynamicOffsets(MemorySegment value) { VH_pDynamicOffsets.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBindDescriptorSetsInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBindDescriptorSetsInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBindDescriptorSetsInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBindDescriptorSetsInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _stageFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stageFlags, index), LAYOUT_stageFlags); }
    public MemorySegment _stageFlags() { return _stageFlagsAt(0L); }
    public VkBindDescriptorSetsInfoKHR _stageFlagsAt(long index, MemorySegment src) { _stageFlagsAt(index).copyFrom(src); return this; }
    public VkBindDescriptorSetsInfoKHR _stageFlags(MemorySegment src) { return _stageFlagsAt(0L, src); }
    public MemorySegment _layoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layout, index), LAYOUT_layout); }
    public MemorySegment _layout() { return _layoutAt(0L); }
    public VkBindDescriptorSetsInfoKHR _layoutAt(long index, MemorySegment src) { _layoutAt(index).copyFrom(src); return this; }
    public VkBindDescriptorSetsInfoKHR _layout(MemorySegment src) { return _layoutAt(0L, src); }
    public MemorySegment _firstSetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_firstSet, index), LAYOUT_firstSet); }
    public MemorySegment _firstSet() { return _firstSetAt(0L); }
    public VkBindDescriptorSetsInfoKHR _firstSetAt(long index, MemorySegment src) { _firstSetAt(index).copyFrom(src); return this; }
    public VkBindDescriptorSetsInfoKHR _firstSet(MemorySegment src) { return _firstSetAt(0L, src); }
    public MemorySegment _descriptorSetCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorSetCount, index), LAYOUT_descriptorSetCount); }
    public MemorySegment _descriptorSetCount() { return _descriptorSetCountAt(0L); }
    public VkBindDescriptorSetsInfoKHR _descriptorSetCountAt(long index, MemorySegment src) { _descriptorSetCountAt(index).copyFrom(src); return this; }
    public VkBindDescriptorSetsInfoKHR _descriptorSetCount(MemorySegment src) { return _descriptorSetCountAt(0L, src); }
    public MemorySegment _pDescriptorSetsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDescriptorSets, index), LAYOUT_pDescriptorSets); }
    public MemorySegment _pDescriptorSets() { return _pDescriptorSetsAt(0L); }
    public VkBindDescriptorSetsInfoKHR _pDescriptorSetsAt(long index, MemorySegment src) { _pDescriptorSetsAt(index).copyFrom(src); return this; }
    public VkBindDescriptorSetsInfoKHR _pDescriptorSets(MemorySegment src) { return _pDescriptorSetsAt(0L, src); }
    public MemorySegment _dynamicOffsetCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dynamicOffsetCount, index), LAYOUT_dynamicOffsetCount); }
    public MemorySegment _dynamicOffsetCount() { return _dynamicOffsetCountAt(0L); }
    public VkBindDescriptorSetsInfoKHR _dynamicOffsetCountAt(long index, MemorySegment src) { _dynamicOffsetCountAt(index).copyFrom(src); return this; }
    public VkBindDescriptorSetsInfoKHR _dynamicOffsetCount(MemorySegment src) { return _dynamicOffsetCountAt(0L, src); }
    public MemorySegment _pDynamicOffsetsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDynamicOffsets, index), LAYOUT_pDynamicOffsets); }
    public MemorySegment _pDynamicOffsets() { return _pDynamicOffsetsAt(0L); }
    public VkBindDescriptorSetsInfoKHR _pDynamicOffsetsAt(long index, MemorySegment src) { _pDynamicOffsetsAt(index).copyFrom(src); return this; }
    public VkBindDescriptorSetsInfoKHR _pDynamicOffsets(MemorySegment src) { return _pDynamicOffsetsAt(0L, src); }
}
