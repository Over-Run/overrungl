// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindDescriptorSetsInfo`.
/// ## Layout
/// ```
/// struct VkBindDescriptorSetsInfo {
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
public final class VkBindDescriptorSetsInfo extends GroupType {
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

    public VkBindDescriptorSetsInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBindDescriptorSetsInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindDescriptorSetsInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkBindDescriptorSetsInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindDescriptorSetsInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBindDescriptorSetsInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindDescriptorSetsInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBindDescriptorSetsInfo alloc(SegmentAllocator allocator) { return new VkBindDescriptorSetsInfo(allocator.allocate(LAYOUT), 1); }
    public static VkBindDescriptorSetsInfo alloc(SegmentAllocator allocator, long count) { return new VkBindDescriptorSetsInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkBindDescriptorSetsInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO); }
    public static VkBindDescriptorSetsInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO);
        return s;
    }
    public VkBindDescriptorSetsInfo copyFrom(VkBindDescriptorSetsInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBindDescriptorSetsInfo reinterpret(long count) { return new VkBindDescriptorSetsInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBindDescriptorSetsInfo asSlice(long index) { return new VkBindDescriptorSetsInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBindDescriptorSetsInfo asSlice(long index, long count) { return new VkBindDescriptorSetsInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBindDescriptorSetsInfo at(long index, Consumer<VkBindDescriptorSetsInfo> func) { func.accept(asSlice(index)); return this; }
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
    public VkBindDescriptorSetsInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBindDescriptorSetsInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBindDescriptorSetsInfo stageFlagsAt(long index, int value) { VH_stageFlags.set(this.segment(), 0L, index, value); return this; }
    public VkBindDescriptorSetsInfo layoutAt(long index, long value) { VH_layout.set(this.segment(), 0L, index, value); return this; }
    public VkBindDescriptorSetsInfo firstSetAt(long index, int value) { VH_firstSet.set(this.segment(), 0L, index, value); return this; }
    public VkBindDescriptorSetsInfo descriptorSetCountAt(long index, int value) { VH_descriptorSetCount.set(this.segment(), 0L, index, value); return this; }
    public VkBindDescriptorSetsInfo pDescriptorSetsAt(long index, MemorySegment value) { VH_pDescriptorSets.set(this.segment(), 0L, index, value); return this; }
    public VkBindDescriptorSetsInfo dynamicOffsetCountAt(long index, int value) { VH_dynamicOffsetCount.set(this.segment(), 0L, index, value); return this; }
    public VkBindDescriptorSetsInfo pDynamicOffsetsAt(long index, MemorySegment value) { VH_pDynamicOffsets.set(this.segment(), 0L, index, value); return this; }
    public VkBindDescriptorSetsInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDescriptorSetsInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDescriptorSetsInfo stageFlags(int value) { VH_stageFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDescriptorSetsInfo layout(long value) { VH_layout.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDescriptorSetsInfo firstSet(int value) { VH_firstSet.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDescriptorSetsInfo descriptorSetCount(int value) { VH_descriptorSetCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDescriptorSetsInfo pDescriptorSets(MemorySegment value) { VH_pDescriptorSets.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDescriptorSetsInfo dynamicOffsetCount(int value) { VH_dynamicOffsetCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindDescriptorSetsInfo pDynamicOffsets(MemorySegment value) { VH_pDynamicOffsets.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBindDescriptorSetsInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBindDescriptorSetsInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBindDescriptorSetsInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBindDescriptorSetsInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _stageFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stageFlags, index), LAYOUT_stageFlags); }
    public MemorySegment _stageFlags() { return _stageFlagsAt(0L); }
    public VkBindDescriptorSetsInfo _stageFlagsAt(long index, MemorySegment src) { _stageFlagsAt(index).copyFrom(src); return this; }
    public VkBindDescriptorSetsInfo _stageFlags(MemorySegment src) { return _stageFlagsAt(0L, src); }
    public MemorySegment _layoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layout, index), LAYOUT_layout); }
    public MemorySegment _layout() { return _layoutAt(0L); }
    public VkBindDescriptorSetsInfo _layoutAt(long index, MemorySegment src) { _layoutAt(index).copyFrom(src); return this; }
    public VkBindDescriptorSetsInfo _layout(MemorySegment src) { return _layoutAt(0L, src); }
    public MemorySegment _firstSetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_firstSet, index), LAYOUT_firstSet); }
    public MemorySegment _firstSet() { return _firstSetAt(0L); }
    public VkBindDescriptorSetsInfo _firstSetAt(long index, MemorySegment src) { _firstSetAt(index).copyFrom(src); return this; }
    public VkBindDescriptorSetsInfo _firstSet(MemorySegment src) { return _firstSetAt(0L, src); }
    public MemorySegment _descriptorSetCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorSetCount, index), LAYOUT_descriptorSetCount); }
    public MemorySegment _descriptorSetCount() { return _descriptorSetCountAt(0L); }
    public VkBindDescriptorSetsInfo _descriptorSetCountAt(long index, MemorySegment src) { _descriptorSetCountAt(index).copyFrom(src); return this; }
    public VkBindDescriptorSetsInfo _descriptorSetCount(MemorySegment src) { return _descriptorSetCountAt(0L, src); }
    public MemorySegment _pDescriptorSetsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDescriptorSets, index), LAYOUT_pDescriptorSets); }
    public MemorySegment _pDescriptorSets() { return _pDescriptorSetsAt(0L); }
    public VkBindDescriptorSetsInfo _pDescriptorSetsAt(long index, MemorySegment src) { _pDescriptorSetsAt(index).copyFrom(src); return this; }
    public VkBindDescriptorSetsInfo _pDescriptorSets(MemorySegment src) { return _pDescriptorSetsAt(0L, src); }
    public MemorySegment _dynamicOffsetCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dynamicOffsetCount, index), LAYOUT_dynamicOffsetCount); }
    public MemorySegment _dynamicOffsetCount() { return _dynamicOffsetCountAt(0L); }
    public VkBindDescriptorSetsInfo _dynamicOffsetCountAt(long index, MemorySegment src) { _dynamicOffsetCountAt(index).copyFrom(src); return this; }
    public VkBindDescriptorSetsInfo _dynamicOffsetCount(MemorySegment src) { return _dynamicOffsetCountAt(0L, src); }
    public MemorySegment _pDynamicOffsetsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDynamicOffsets, index), LAYOUT_pDynamicOffsets); }
    public MemorySegment _pDynamicOffsets() { return _pDynamicOffsetsAt(0L); }
    public VkBindDescriptorSetsInfo _pDynamicOffsetsAt(long index, MemorySegment src) { _pDynamicOffsetsAt(index).copyFrom(src); return this; }
    public VkBindDescriptorSetsInfo _pDynamicOffsets(MemorySegment src) { return _pDynamicOffsetsAt(0L, src); }
}
