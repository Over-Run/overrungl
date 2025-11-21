// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorPoolCreateInfo`.
/// ## Layout
/// ```
/// struct VkDescriptorPoolCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkDescriptorPoolCreateFlags flags;
///     uint32_t maxSets;
///     uint32_t poolSizeCount;
///     const VkDescriptorPoolSize* pPoolSizes;
/// }
/// ```
public final class VkDescriptorPoolCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("maxSets"),
        ValueLayout.JAVA_INT.withName("poolSizeCount"),
        ValueLayout.ADDRESS.withName("pPoolSizes")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_maxSets = LAYOUT.byteOffset(PathElement.groupElement("maxSets"));
    public static final long OFFSET_poolSizeCount = LAYOUT.byteOffset(PathElement.groupElement("poolSizeCount"));
    public static final long OFFSET_pPoolSizes = LAYOUT.byteOffset(PathElement.groupElement("pPoolSizes"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_maxSets = LAYOUT.select(PathElement.groupElement("maxSets"));
    public static final MemoryLayout LAYOUT_poolSizeCount = LAYOUT.select(PathElement.groupElement("poolSizeCount"));
    public static final MemoryLayout LAYOUT_pPoolSizes = LAYOUT.select(PathElement.groupElement("pPoolSizes"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_maxSets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSets"));
    public static final VarHandle VH_poolSizeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("poolSizeCount"));
    public static final VarHandle VH_pPoolSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPoolSizes"));

    public VkDescriptorPoolCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDescriptorPoolCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorPoolCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkDescriptorPoolCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorPoolCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDescriptorPoolCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorPoolCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDescriptorPoolCreateInfo alloc(SegmentAllocator allocator) { return new VkDescriptorPoolCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkDescriptorPoolCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkDescriptorPoolCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkDescriptorPoolCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO); }
    public static VkDescriptorPoolCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO);
        return s;
    }
    public VkDescriptorPoolCreateInfo copyFrom(VkDescriptorPoolCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDescriptorPoolCreateInfo reinterpret(long count) { return new VkDescriptorPoolCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDescriptorPoolCreateInfo asSlice(long index) { return new VkDescriptorPoolCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDescriptorPoolCreateInfo asSlice(long index, long count) { return new VkDescriptorPoolCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDescriptorPoolCreateInfo at(long index, Consumer<VkDescriptorPoolCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int maxSetsAt(long index) { return (int) VH_maxSets.get(this.segment(), 0L, index); }
    public int poolSizeCountAt(long index) { return (int) VH_poolSizeCount.get(this.segment(), 0L, index); }
    public MemorySegment pPoolSizesAt(long index) { return (MemorySegment) VH_pPoolSizes.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int maxSets() { return (int) VH_maxSets.get(this.segment(), 0L, 0L); }
    public int poolSizeCount() { return (int) VH_poolSizeCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pPoolSizes() { return (MemorySegment) VH_pPoolSizes.get(this.segment(), 0L, 0L); }
    public VkDescriptorPoolCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorPoolCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorPoolCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorPoolCreateInfo maxSetsAt(long index, int value) { VH_maxSets.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorPoolCreateInfo poolSizeCountAt(long index, int value) { VH_poolSizeCount.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorPoolCreateInfo pPoolSizesAt(long index, MemorySegment value) { VH_pPoolSizes.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorPoolCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorPoolCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorPoolCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorPoolCreateInfo maxSets(int value) { VH_maxSets.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorPoolCreateInfo poolSizeCount(int value) { VH_poolSizeCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorPoolCreateInfo pPoolSizes(MemorySegment value) { VH_pPoolSizes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDescriptorPoolCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDescriptorPoolCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDescriptorPoolCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDescriptorPoolCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkDescriptorPoolCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkDescriptorPoolCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _maxSetsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSets, index), LAYOUT_maxSets); }
    public MemorySegment _maxSets() { return _maxSetsAt(0L); }
    public VkDescriptorPoolCreateInfo _maxSetsAt(long index, MemorySegment src) { _maxSetsAt(index).copyFrom(src); return this; }
    public VkDescriptorPoolCreateInfo _maxSets(MemorySegment src) { return _maxSetsAt(0L, src); }
    public MemorySegment _poolSizeCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_poolSizeCount, index), LAYOUT_poolSizeCount); }
    public MemorySegment _poolSizeCount() { return _poolSizeCountAt(0L); }
    public VkDescriptorPoolCreateInfo _poolSizeCountAt(long index, MemorySegment src) { _poolSizeCountAt(index).copyFrom(src); return this; }
    public VkDescriptorPoolCreateInfo _poolSizeCount(MemorySegment src) { return _poolSizeCountAt(0L, src); }
    public MemorySegment _pPoolSizesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPoolSizes, index), LAYOUT_pPoolSizes); }
    public MemorySegment _pPoolSizes() { return _pPoolSizesAt(0L); }
    public VkDescriptorPoolCreateInfo _pPoolSizesAt(long index, MemorySegment src) { _pPoolSizesAt(index).copyFrom(src); return this; }
    public VkDescriptorPoolCreateInfo _pPoolSizes(MemorySegment src) { return _pPoolSizesAt(0L, src); }
}
