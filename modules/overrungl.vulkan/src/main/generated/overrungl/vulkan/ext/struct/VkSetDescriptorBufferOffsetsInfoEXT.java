// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSetDescriptorBufferOffsetsInfoEXT`.
/// ## Layout
/// ```
/// struct VkSetDescriptorBufferOffsetsInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkShaderStageFlags stageFlags;
///     VkPipelineLayout layout;
///     uint32_t firstSet;
///     uint32_t setCount;
///     const uint32_t* pBufferIndices;
///     const VkDeviceSize* pOffsets;
/// }
/// ```
public final class VkSetDescriptorBufferOffsetsInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_INT.withName("firstSet"),
        ValueLayout.JAVA_INT.withName("setCount"),
        ValueLayout.ADDRESS.withName("pBufferIndices"),
        ValueLayout.ADDRESS.withName("pOffsets")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_stageFlags = LAYOUT.byteOffset(PathElement.groupElement("stageFlags"));
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    public static final long OFFSET_firstSet = LAYOUT.byteOffset(PathElement.groupElement("firstSet"));
    public static final long OFFSET_setCount = LAYOUT.byteOffset(PathElement.groupElement("setCount"));
    public static final long OFFSET_pBufferIndices = LAYOUT.byteOffset(PathElement.groupElement("pBufferIndices"));
    public static final long OFFSET_pOffsets = LAYOUT.byteOffset(PathElement.groupElement("pOffsets"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_stageFlags = LAYOUT.select(PathElement.groupElement("stageFlags"));
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    public static final MemoryLayout LAYOUT_firstSet = LAYOUT.select(PathElement.groupElement("firstSet"));
    public static final MemoryLayout LAYOUT_setCount = LAYOUT.select(PathElement.groupElement("setCount"));
    public static final MemoryLayout LAYOUT_pBufferIndices = LAYOUT.select(PathElement.groupElement("pBufferIndices"));
    public static final MemoryLayout LAYOUT_pOffsets = LAYOUT.select(PathElement.groupElement("pOffsets"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_stageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageFlags"));
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    public static final VarHandle VH_firstSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstSet"));
    public static final VarHandle VH_setCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("setCount"));
    public static final VarHandle VH_pBufferIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBufferIndices"));
    public static final VarHandle VH_pOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pOffsets"));

    public VkSetDescriptorBufferOffsetsInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSetDescriptorBufferOffsetsInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSetDescriptorBufferOffsetsInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkSetDescriptorBufferOffsetsInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSetDescriptorBufferOffsetsInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSetDescriptorBufferOffsetsInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSetDescriptorBufferOffsetsInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSetDescriptorBufferOffsetsInfoEXT alloc(SegmentAllocator allocator) { return new VkSetDescriptorBufferOffsetsInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkSetDescriptorBufferOffsetsInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkSetDescriptorBufferOffsetsInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkSetDescriptorBufferOffsetsInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRMaintenance6.VK_STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT); }
    public static VkSetDescriptorBufferOffsetsInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRMaintenance6.VK_STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT);
        return s;
    }
    public VkSetDescriptorBufferOffsetsInfoEXT copyFrom(VkSetDescriptorBufferOffsetsInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT reinterpret(long count) { return new VkSetDescriptorBufferOffsetsInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSetDescriptorBufferOffsetsInfoEXT asSlice(long index) { return new VkSetDescriptorBufferOffsetsInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSetDescriptorBufferOffsetsInfoEXT asSlice(long index, long count) { return new VkSetDescriptorBufferOffsetsInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSetDescriptorBufferOffsetsInfoEXT at(long index, Consumer<VkSetDescriptorBufferOffsetsInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int stageFlagsAt(long index) { return (int) VH_stageFlags.get(this.segment(), 0L, index); }
    public long layoutAt(long index) { return (long) VH_layout.get(this.segment(), 0L, index); }
    public int firstSetAt(long index) { return (int) VH_firstSet.get(this.segment(), 0L, index); }
    public int setCountAt(long index) { return (int) VH_setCount.get(this.segment(), 0L, index); }
    public MemorySegment pBufferIndicesAt(long index) { return (MemorySegment) VH_pBufferIndices.get(this.segment(), 0L, index); }
    public MemorySegment pOffsetsAt(long index) { return (MemorySegment) VH_pOffsets.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int stageFlags() { return (int) VH_stageFlags.get(this.segment(), 0L, 0L); }
    public long layout() { return (long) VH_layout.get(this.segment(), 0L, 0L); }
    public int firstSet() { return (int) VH_firstSet.get(this.segment(), 0L, 0L); }
    public int setCount() { return (int) VH_setCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pBufferIndices() { return (MemorySegment) VH_pBufferIndices.get(this.segment(), 0L, 0L); }
    public MemorySegment pOffsets() { return (MemorySegment) VH_pOffsets.get(this.segment(), 0L, 0L); }
    public VkSetDescriptorBufferOffsetsInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT stageFlagsAt(long index, int value) { VH_stageFlags.set(this.segment(), 0L, index, value); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT layoutAt(long index, long value) { VH_layout.set(this.segment(), 0L, index, value); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT firstSetAt(long index, int value) { VH_firstSet.set(this.segment(), 0L, index, value); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT setCountAt(long index, int value) { VH_setCount.set(this.segment(), 0L, index, value); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT pBufferIndicesAt(long index, MemorySegment value) { VH_pBufferIndices.set(this.segment(), 0L, index, value); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT pOffsetsAt(long index, MemorySegment value) { VH_pOffsets.set(this.segment(), 0L, index, value); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT stageFlags(int value) { VH_stageFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT layout(long value) { VH_layout.set(this.segment(), 0L, 0L, value); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT firstSet(int value) { VH_firstSet.set(this.segment(), 0L, 0L, value); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT setCount(int value) { VH_setCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT pBufferIndices(MemorySegment value) { VH_pBufferIndices.set(this.segment(), 0L, 0L, value); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT pOffsets(MemorySegment value) { VH_pOffsets.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSetDescriptorBufferOffsetsInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSetDescriptorBufferOffsetsInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _stageFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stageFlags, index), LAYOUT_stageFlags); }
    public MemorySegment _stageFlags() { return _stageFlagsAt(0L); }
    public VkSetDescriptorBufferOffsetsInfoEXT _stageFlagsAt(long index, MemorySegment src) { _stageFlagsAt(index).copyFrom(src); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT _stageFlags(MemorySegment src) { return _stageFlagsAt(0L, src); }
    public MemorySegment _layoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layout, index), LAYOUT_layout); }
    public MemorySegment _layout() { return _layoutAt(0L); }
    public VkSetDescriptorBufferOffsetsInfoEXT _layoutAt(long index, MemorySegment src) { _layoutAt(index).copyFrom(src); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT _layout(MemorySegment src) { return _layoutAt(0L, src); }
    public MemorySegment _firstSetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_firstSet, index), LAYOUT_firstSet); }
    public MemorySegment _firstSet() { return _firstSetAt(0L); }
    public VkSetDescriptorBufferOffsetsInfoEXT _firstSetAt(long index, MemorySegment src) { _firstSetAt(index).copyFrom(src); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT _firstSet(MemorySegment src) { return _firstSetAt(0L, src); }
    public MemorySegment _setCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_setCount, index), LAYOUT_setCount); }
    public MemorySegment _setCount() { return _setCountAt(0L); }
    public VkSetDescriptorBufferOffsetsInfoEXT _setCountAt(long index, MemorySegment src) { _setCountAt(index).copyFrom(src); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT _setCount(MemorySegment src) { return _setCountAt(0L, src); }
    public MemorySegment _pBufferIndicesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pBufferIndices, index), LAYOUT_pBufferIndices); }
    public MemorySegment _pBufferIndices() { return _pBufferIndicesAt(0L); }
    public VkSetDescriptorBufferOffsetsInfoEXT _pBufferIndicesAt(long index, MemorySegment src) { _pBufferIndicesAt(index).copyFrom(src); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT _pBufferIndices(MemorySegment src) { return _pBufferIndicesAt(0L, src); }
    public MemorySegment _pOffsetsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pOffsets, index), LAYOUT_pOffsets); }
    public MemorySegment _pOffsets() { return _pOffsetsAt(0L); }
    public VkSetDescriptorBufferOffsetsInfoEXT _pOffsetsAt(long index, MemorySegment src) { _pOffsetsAt(index).copyFrom(src); return this; }
    public VkSetDescriptorBufferOffsetsInfoEXT _pOffsets(MemorySegment src) { return _pOffsetsAt(0L, src); }
}
