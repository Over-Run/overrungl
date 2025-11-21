// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPushDescriptorSetInfoKHR`.
/// ## Layout
/// ```
/// struct VkPushDescriptorSetInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkShaderStageFlags stageFlags;
///     VkPipelineLayout layout;
///     uint32_t set;
///     uint32_t descriptorWriteCount;
///     const VkWriteDescriptorSet* pDescriptorWrites;
/// }
/// ```
public final class VkPushDescriptorSetInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_INT.withName("set"),
        ValueLayout.JAVA_INT.withName("descriptorWriteCount"),
        ValueLayout.ADDRESS.withName("pDescriptorWrites")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_stageFlags = LAYOUT.byteOffset(PathElement.groupElement("stageFlags"));
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    public static final long OFFSET_set = LAYOUT.byteOffset(PathElement.groupElement("set"));
    public static final long OFFSET_descriptorWriteCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorWriteCount"));
    public static final long OFFSET_pDescriptorWrites = LAYOUT.byteOffset(PathElement.groupElement("pDescriptorWrites"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_stageFlags = LAYOUT.select(PathElement.groupElement("stageFlags"));
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    public static final MemoryLayout LAYOUT_set = LAYOUT.select(PathElement.groupElement("set"));
    public static final MemoryLayout LAYOUT_descriptorWriteCount = LAYOUT.select(PathElement.groupElement("descriptorWriteCount"));
    public static final MemoryLayout LAYOUT_pDescriptorWrites = LAYOUT.select(PathElement.groupElement("pDescriptorWrites"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_stageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageFlags"));
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    public static final VarHandle VH_set = LAYOUT.arrayElementVarHandle(PathElement.groupElement("set"));
    public static final VarHandle VH_descriptorWriteCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorWriteCount"));
    public static final VarHandle VH_pDescriptorWrites = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDescriptorWrites"));

    public VkPushDescriptorSetInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPushDescriptorSetInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPushDescriptorSetInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPushDescriptorSetInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPushDescriptorSetInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPushDescriptorSetInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPushDescriptorSetInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPushDescriptorSetInfoKHR alloc(SegmentAllocator allocator) { return new VkPushDescriptorSetInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPushDescriptorSetInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPushDescriptorSetInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPushDescriptorSetInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO); }
    public static VkPushDescriptorSetInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO);
        return s;
    }
    public VkPushDescriptorSetInfoKHR copyFrom(VkPushDescriptorSetInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPushDescriptorSetInfoKHR reinterpret(long count) { return new VkPushDescriptorSetInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPushDescriptorSetInfoKHR asSlice(long index) { return new VkPushDescriptorSetInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPushDescriptorSetInfoKHR asSlice(long index, long count) { return new VkPushDescriptorSetInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPushDescriptorSetInfoKHR at(long index, Consumer<VkPushDescriptorSetInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int stageFlagsAt(long index) { return (int) VH_stageFlags.get(this.segment(), 0L, index); }
    public long layoutAt(long index) { return (long) VH_layout.get(this.segment(), 0L, index); }
    public int setAt(long index) { return (int) VH_set.get(this.segment(), 0L, index); }
    public int descriptorWriteCountAt(long index) { return (int) VH_descriptorWriteCount.get(this.segment(), 0L, index); }
    public MemorySegment pDescriptorWritesAt(long index) { return (MemorySegment) VH_pDescriptorWrites.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int stageFlags() { return (int) VH_stageFlags.get(this.segment(), 0L, 0L); }
    public long layout() { return (long) VH_layout.get(this.segment(), 0L, 0L); }
    public int set() { return (int) VH_set.get(this.segment(), 0L, 0L); }
    public int descriptorWriteCount() { return (int) VH_descriptorWriteCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pDescriptorWrites() { return (MemorySegment) VH_pDescriptorWrites.get(this.segment(), 0L, 0L); }
    public VkPushDescriptorSetInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPushDescriptorSetInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPushDescriptorSetInfoKHR stageFlagsAt(long index, int value) { VH_stageFlags.set(this.segment(), 0L, index, value); return this; }
    public VkPushDescriptorSetInfoKHR layoutAt(long index, long value) { VH_layout.set(this.segment(), 0L, index, value); return this; }
    public VkPushDescriptorSetInfoKHR setAt(long index, int value) { VH_set.set(this.segment(), 0L, index, value); return this; }
    public VkPushDescriptorSetInfoKHR descriptorWriteCountAt(long index, int value) { VH_descriptorWriteCount.set(this.segment(), 0L, index, value); return this; }
    public VkPushDescriptorSetInfoKHR pDescriptorWritesAt(long index, MemorySegment value) { VH_pDescriptorWrites.set(this.segment(), 0L, index, value); return this; }
    public VkPushDescriptorSetInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPushDescriptorSetInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPushDescriptorSetInfoKHR stageFlags(int value) { VH_stageFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPushDescriptorSetInfoKHR layout(long value) { VH_layout.set(this.segment(), 0L, 0L, value); return this; }
    public VkPushDescriptorSetInfoKHR set(int value) { VH_set.set(this.segment(), 0L, 0L, value); return this; }
    public VkPushDescriptorSetInfoKHR descriptorWriteCount(int value) { VH_descriptorWriteCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPushDescriptorSetInfoKHR pDescriptorWrites(MemorySegment value) { VH_pDescriptorWrites.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPushDescriptorSetInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPushDescriptorSetInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPushDescriptorSetInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPushDescriptorSetInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _stageFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stageFlags, index), LAYOUT_stageFlags); }
    public MemorySegment _stageFlags() { return _stageFlagsAt(0L); }
    public VkPushDescriptorSetInfoKHR _stageFlagsAt(long index, MemorySegment src) { _stageFlagsAt(index).copyFrom(src); return this; }
    public VkPushDescriptorSetInfoKHR _stageFlags(MemorySegment src) { return _stageFlagsAt(0L, src); }
    public MemorySegment _layoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layout, index), LAYOUT_layout); }
    public MemorySegment _layout() { return _layoutAt(0L); }
    public VkPushDescriptorSetInfoKHR _layoutAt(long index, MemorySegment src) { _layoutAt(index).copyFrom(src); return this; }
    public VkPushDescriptorSetInfoKHR _layout(MemorySegment src) { return _layoutAt(0L, src); }
    public MemorySegment _setAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_set, index), LAYOUT_set); }
    public MemorySegment _set() { return _setAt(0L); }
    public VkPushDescriptorSetInfoKHR _setAt(long index, MemorySegment src) { _setAt(index).copyFrom(src); return this; }
    public VkPushDescriptorSetInfoKHR _set(MemorySegment src) { return _setAt(0L, src); }
    public MemorySegment _descriptorWriteCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorWriteCount, index), LAYOUT_descriptorWriteCount); }
    public MemorySegment _descriptorWriteCount() { return _descriptorWriteCountAt(0L); }
    public VkPushDescriptorSetInfoKHR _descriptorWriteCountAt(long index, MemorySegment src) { _descriptorWriteCountAt(index).copyFrom(src); return this; }
    public VkPushDescriptorSetInfoKHR _descriptorWriteCount(MemorySegment src) { return _descriptorWriteCountAt(0L, src); }
    public MemorySegment _pDescriptorWritesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDescriptorWrites, index), LAYOUT_pDescriptorWrites); }
    public MemorySegment _pDescriptorWrites() { return _pDescriptorWritesAt(0L); }
    public VkPushDescriptorSetInfoKHR _pDescriptorWritesAt(long index, MemorySegment src) { _pDescriptorWritesAt(index).copyFrom(src); return this; }
    public VkPushDescriptorSetInfoKHR _pDescriptorWrites(MemorySegment src) { return _pDescriptorWritesAt(0L, src); }
}
