// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorSetLayoutCreateInfo`.
/// ## Layout
/// ```
/// struct VkDescriptorSetLayoutCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkDescriptorSetLayoutCreateFlags flags;
///     uint32_t bindingCount;
///     const VkDescriptorSetLayoutBinding* pBindings;
/// }
/// ```
public final class VkDescriptorSetLayoutCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("bindingCount"),
        ValueLayout.ADDRESS.withName("pBindings")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_bindingCount = LAYOUT.byteOffset(PathElement.groupElement("bindingCount"));
    public static final long OFFSET_pBindings = LAYOUT.byteOffset(PathElement.groupElement("pBindings"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_bindingCount = LAYOUT.select(PathElement.groupElement("bindingCount"));
    public static final MemoryLayout LAYOUT_pBindings = LAYOUT.select(PathElement.groupElement("pBindings"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_bindingCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bindingCount"));
    public static final VarHandle VH_pBindings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBindings"));

    public VkDescriptorSetLayoutCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDescriptorSetLayoutCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkDescriptorSetLayoutCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDescriptorSetLayoutCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDescriptorSetLayoutCreateInfo alloc(SegmentAllocator allocator) { return new VkDescriptorSetLayoutCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkDescriptorSetLayoutCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkDescriptorSetLayoutCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkDescriptorSetLayoutCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO); }
    public static VkDescriptorSetLayoutCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO);
        return s;
    }
    public VkDescriptorSetLayoutCreateInfo copyFrom(VkDescriptorSetLayoutCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDescriptorSetLayoutCreateInfo reinterpret(long count) { return new VkDescriptorSetLayoutCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDescriptorSetLayoutCreateInfo asSlice(long index) { return new VkDescriptorSetLayoutCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDescriptorSetLayoutCreateInfo asSlice(long index, long count) { return new VkDescriptorSetLayoutCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDescriptorSetLayoutCreateInfo at(long index, Consumer<VkDescriptorSetLayoutCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int bindingCountAt(long index) { return (int) VH_bindingCount.get(this.segment(), 0L, index); }
    public MemorySegment pBindingsAt(long index) { return (MemorySegment) VH_pBindings.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int bindingCount() { return (int) VH_bindingCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pBindings() { return (MemorySegment) VH_pBindings.get(this.segment(), 0L, 0L); }
    public VkDescriptorSetLayoutCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetLayoutCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetLayoutCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetLayoutCreateInfo bindingCountAt(long index, int value) { VH_bindingCount.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetLayoutCreateInfo pBindingsAt(long index, MemorySegment value) { VH_pBindings.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetLayoutCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetLayoutCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetLayoutCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetLayoutCreateInfo bindingCount(int value) { VH_bindingCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetLayoutCreateInfo pBindings(MemorySegment value) { VH_pBindings.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDescriptorSetLayoutCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDescriptorSetLayoutCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDescriptorSetLayoutCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDescriptorSetLayoutCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkDescriptorSetLayoutCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkDescriptorSetLayoutCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _bindingCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bindingCount, index), LAYOUT_bindingCount); }
    public MemorySegment _bindingCount() { return _bindingCountAt(0L); }
    public VkDescriptorSetLayoutCreateInfo _bindingCountAt(long index, MemorySegment src) { _bindingCountAt(index).copyFrom(src); return this; }
    public VkDescriptorSetLayoutCreateInfo _bindingCount(MemorySegment src) { return _bindingCountAt(0L, src); }
    public MemorySegment _pBindingsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pBindings, index), LAYOUT_pBindings); }
    public MemorySegment _pBindings() { return _pBindingsAt(0L); }
    public VkDescriptorSetLayoutCreateInfo _pBindingsAt(long index, MemorySegment src) { _pBindingsAt(index).copyFrom(src); return this; }
    public VkDescriptorSetLayoutCreateInfo _pBindings(MemorySegment src) { return _pBindingsAt(0L, src); }
}
