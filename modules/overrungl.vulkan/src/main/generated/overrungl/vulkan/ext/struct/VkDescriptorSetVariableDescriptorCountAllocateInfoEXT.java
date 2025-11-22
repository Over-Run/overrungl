// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorSetVariableDescriptorCountAllocateInfoEXT`.
/// ## Layout
/// ```
/// struct VkDescriptorSetVariableDescriptorCountAllocateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t descriptorSetCount;
///     const uint32_t* pDescriptorCounts;
/// }
/// ```
public final class VkDescriptorSetVariableDescriptorCountAllocateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("descriptorSetCount"),
        ValueLayout.ADDRESS.withName("pDescriptorCounts")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_descriptorSetCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorSetCount"));
    public static final long OFFSET_pDescriptorCounts = LAYOUT.byteOffset(PathElement.groupElement("pDescriptorCounts"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_descriptorSetCount = LAYOUT.select(PathElement.groupElement("descriptorSetCount"));
    public static final MemoryLayout LAYOUT_pDescriptorCounts = LAYOUT.select(PathElement.groupElement("pDescriptorCounts"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_descriptorSetCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetCount"));
    public static final VarHandle VH_pDescriptorCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDescriptorCounts"));

    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT alloc(SegmentAllocator allocator) { return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO); }
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO);
        return s;
    }
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT copyFrom(VkDescriptorSetVariableDescriptorCountAllocateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT reinterpret(long count) { return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT asSlice(long index) { return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT asSlice(long index, long count) { return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT at(long index, Consumer<VkDescriptorSetVariableDescriptorCountAllocateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int descriptorSetCountAt(long index) { return (int) VH_descriptorSetCount.get(this.segment(), 0L, index); }
    public MemorySegment pDescriptorCountsAt(long index) { return (MemorySegment) VH_pDescriptorCounts.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int descriptorSetCount() { return (int) VH_descriptorSetCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pDescriptorCounts() { return (MemorySegment) VH_pDescriptorCounts.get(this.segment(), 0L, 0L); }
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT descriptorSetCountAt(long index, int value) { VH_descriptorSetCount.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT pDescriptorCountsAt(long index, MemorySegment value) { VH_pDescriptorCounts.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT descriptorSetCount(int value) { VH_descriptorSetCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT pDescriptorCounts(MemorySegment value) { VH_pDescriptorCounts.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _descriptorSetCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorSetCount, index), LAYOUT_descriptorSetCount); }
    public MemorySegment _descriptorSetCount() { return _descriptorSetCountAt(0L); }
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT _descriptorSetCountAt(long index, MemorySegment src) { _descriptorSetCountAt(index).copyFrom(src); return this; }
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT _descriptorSetCount(MemorySegment src) { return _descriptorSetCountAt(0L, src); }
    public MemorySegment _pDescriptorCountsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDescriptorCounts, index), LAYOUT_pDescriptorCounts); }
    public MemorySegment _pDescriptorCounts() { return _pDescriptorCountsAt(0L); }
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT _pDescriptorCountsAt(long index, MemorySegment src) { _pDescriptorCountsAt(index).copyFrom(src); return this; }
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT _pDescriptorCounts(MemorySegment src) { return _pDescriptorCountsAt(0L, src); }
}
