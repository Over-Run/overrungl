// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorSetAllocateInfo`.
/// ## Layout
/// ```
/// struct VkDescriptorSetAllocateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkDescriptorPool descriptorPool;
///     uint32_t descriptorSetCount;
///     const VkDescriptorSetLayout* pSetLayouts;
/// }
/// ```
public final class VkDescriptorSetAllocateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("descriptorPool"),
        ValueLayout.JAVA_INT.withName("descriptorSetCount"),
        ValueLayout.ADDRESS.withName("pSetLayouts")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_descriptorPool = LAYOUT.byteOffset(PathElement.groupElement("descriptorPool"));
    public static final long OFFSET_descriptorSetCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorSetCount"));
    public static final long OFFSET_pSetLayouts = LAYOUT.byteOffset(PathElement.groupElement("pSetLayouts"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_descriptorPool = LAYOUT.select(PathElement.groupElement("descriptorPool"));
    public static final MemoryLayout LAYOUT_descriptorSetCount = LAYOUT.select(PathElement.groupElement("descriptorSetCount"));
    public static final MemoryLayout LAYOUT_pSetLayouts = LAYOUT.select(PathElement.groupElement("pSetLayouts"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_descriptorPool = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorPool"));
    public static final VarHandle VH_descriptorSetCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetCount"));
    public static final VarHandle VH_pSetLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSetLayouts"));

    public VkDescriptorSetAllocateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDescriptorSetAllocateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetAllocateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkDescriptorSetAllocateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetAllocateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDescriptorSetAllocateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetAllocateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDescriptorSetAllocateInfo alloc(SegmentAllocator allocator) { return new VkDescriptorSetAllocateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkDescriptorSetAllocateInfo alloc(SegmentAllocator allocator, long count) { return new VkDescriptorSetAllocateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkDescriptorSetAllocateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO); }
    public static VkDescriptorSetAllocateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO);
        return s;
    }
    public VkDescriptorSetAllocateInfo copyFrom(VkDescriptorSetAllocateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDescriptorSetAllocateInfo reinterpret(long count) { return new VkDescriptorSetAllocateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDescriptorSetAllocateInfo asSlice(long index) { return new VkDescriptorSetAllocateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDescriptorSetAllocateInfo asSlice(long index, long count) { return new VkDescriptorSetAllocateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDescriptorSetAllocateInfo at(long index, Consumer<VkDescriptorSetAllocateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long descriptorPoolAt(long index) { return (long) VH_descriptorPool.get(this.segment(), 0L, index); }
    public int descriptorSetCountAt(long index) { return (int) VH_descriptorSetCount.get(this.segment(), 0L, index); }
    public MemorySegment pSetLayoutsAt(long index) { return (MemorySegment) VH_pSetLayouts.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long descriptorPool() { return (long) VH_descriptorPool.get(this.segment(), 0L, 0L); }
    public int descriptorSetCount() { return (int) VH_descriptorSetCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pSetLayouts() { return (MemorySegment) VH_pSetLayouts.get(this.segment(), 0L, 0L); }
    public VkDescriptorSetAllocateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetAllocateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetAllocateInfo descriptorPoolAt(long index, long value) { VH_descriptorPool.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetAllocateInfo descriptorSetCountAt(long index, int value) { VH_descriptorSetCount.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetAllocateInfo pSetLayoutsAt(long index, MemorySegment value) { VH_pSetLayouts.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetAllocateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetAllocateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetAllocateInfo descriptorPool(long value) { VH_descriptorPool.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetAllocateInfo descriptorSetCount(int value) { VH_descriptorSetCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetAllocateInfo pSetLayouts(MemorySegment value) { VH_pSetLayouts.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDescriptorSetAllocateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDescriptorSetAllocateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDescriptorSetAllocateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDescriptorSetAllocateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _descriptorPoolAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorPool, index), LAYOUT_descriptorPool); }
    public MemorySegment _descriptorPool() { return _descriptorPoolAt(0L); }
    public VkDescriptorSetAllocateInfo _descriptorPoolAt(long index, MemorySegment src) { _descriptorPoolAt(index).copyFrom(src); return this; }
    public VkDescriptorSetAllocateInfo _descriptorPool(MemorySegment src) { return _descriptorPoolAt(0L, src); }
    public MemorySegment _descriptorSetCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorSetCount, index), LAYOUT_descriptorSetCount); }
    public MemorySegment _descriptorSetCount() { return _descriptorSetCountAt(0L); }
    public VkDescriptorSetAllocateInfo _descriptorSetCountAt(long index, MemorySegment src) { _descriptorSetCountAt(index).copyFrom(src); return this; }
    public VkDescriptorSetAllocateInfo _descriptorSetCount(MemorySegment src) { return _descriptorSetCountAt(0L, src); }
    public MemorySegment _pSetLayoutsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSetLayouts, index), LAYOUT_pSetLayouts); }
    public MemorySegment _pSetLayouts() { return _pSetLayoutsAt(0L); }
    public VkDescriptorSetAllocateInfo _pSetLayoutsAt(long index, MemorySegment src) { _pSetLayoutsAt(index).copyFrom(src); return this; }
    public VkDescriptorSetAllocateInfo _pSetLayouts(MemorySegment src) { return _pSetLayoutsAt(0L, src); }
}
