// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorSetLayoutBindingFlagsCreateInfo`.
/// ## Layout
/// ```
/// struct VkDescriptorSetLayoutBindingFlagsCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t bindingCount;
///     const VkDescriptorBindingFlags* pBindingFlags;
/// }
/// ```
public final class VkDescriptorSetLayoutBindingFlagsCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("bindingCount"),
        ValueLayout.ADDRESS.withName("pBindingFlags")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_bindingCount = LAYOUT.byteOffset(PathElement.groupElement("bindingCount"));
    public static final long OFFSET_pBindingFlags = LAYOUT.byteOffset(PathElement.groupElement("pBindingFlags"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_bindingCount = LAYOUT.select(PathElement.groupElement("bindingCount"));
    public static final MemoryLayout LAYOUT_pBindingFlags = LAYOUT.select(PathElement.groupElement("pBindingFlags"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_bindingCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bindingCount"));
    public static final VarHandle VH_pBindingFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBindingFlags"));

    public VkDescriptorSetLayoutBindingFlagsCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutBindingFlagsCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutBindingFlagsCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutBindingFlagsCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo alloc(SegmentAllocator allocator) { return new VkDescriptorSetLayoutBindingFlagsCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkDescriptorSetLayoutBindingFlagsCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO); }
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO);
        return s;
    }
    public VkDescriptorSetLayoutBindingFlagsCreateInfo copyFrom(VkDescriptorSetLayoutBindingFlagsCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDescriptorSetLayoutBindingFlagsCreateInfo reinterpret(long count) { return new VkDescriptorSetLayoutBindingFlagsCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDescriptorSetLayoutBindingFlagsCreateInfo asSlice(long index) { return new VkDescriptorSetLayoutBindingFlagsCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDescriptorSetLayoutBindingFlagsCreateInfo asSlice(long index, long count) { return new VkDescriptorSetLayoutBindingFlagsCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDescriptorSetLayoutBindingFlagsCreateInfo at(long index, Consumer<VkDescriptorSetLayoutBindingFlagsCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int bindingCountAt(long index) { return (int) VH_bindingCount.get(this.segment(), 0L, index); }
    public MemorySegment pBindingFlagsAt(long index) { return (MemorySegment) VH_pBindingFlags.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int bindingCount() { return (int) VH_bindingCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pBindingFlags() { return (MemorySegment) VH_pBindingFlags.get(this.segment(), 0L, 0L); }
    public VkDescriptorSetLayoutBindingFlagsCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetLayoutBindingFlagsCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetLayoutBindingFlagsCreateInfo bindingCountAt(long index, int value) { VH_bindingCount.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetLayoutBindingFlagsCreateInfo pBindingFlagsAt(long index, MemorySegment value) { VH_pBindingFlags.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetLayoutBindingFlagsCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetLayoutBindingFlagsCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetLayoutBindingFlagsCreateInfo bindingCount(int value) { VH_bindingCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetLayoutBindingFlagsCreateInfo pBindingFlags(MemorySegment value) { VH_pBindingFlags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDescriptorSetLayoutBindingFlagsCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDescriptorSetLayoutBindingFlagsCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDescriptorSetLayoutBindingFlagsCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDescriptorSetLayoutBindingFlagsCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _bindingCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bindingCount, index), LAYOUT_bindingCount); }
    public MemorySegment _bindingCount() { return _bindingCountAt(0L); }
    public VkDescriptorSetLayoutBindingFlagsCreateInfo _bindingCountAt(long index, MemorySegment src) { _bindingCountAt(index).copyFrom(src); return this; }
    public VkDescriptorSetLayoutBindingFlagsCreateInfo _bindingCount(MemorySegment src) { return _bindingCountAt(0L, src); }
    public MemorySegment _pBindingFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pBindingFlags, index), LAYOUT_pBindingFlags); }
    public MemorySegment _pBindingFlags() { return _pBindingFlagsAt(0L); }
    public VkDescriptorSetLayoutBindingFlagsCreateInfo _pBindingFlagsAt(long index, MemorySegment src) { _pBindingFlagsAt(index).copyFrom(src); return this; }
    public VkDescriptorSetLayoutBindingFlagsCreateInfo _pBindingFlags(MemorySegment src) { return _pBindingFlagsAt(0L, src); }
}
