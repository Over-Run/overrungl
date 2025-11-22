// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkWriteDescriptorSet`.
/// ## Layout
/// ```
/// struct VkWriteDescriptorSet {
///     VkStructureType sType;
///     const void* pNext;
///     VkDescriptorSet dstSet;
///     uint32_t dstBinding;
///     uint32_t dstArrayElement;
///     uint32_t descriptorCount;
///     VkDescriptorType descriptorType;
///     const VkDescriptorImageInfo* pImageInfo;
///     const VkDescriptorBufferInfo* pBufferInfo;
///     const VkBufferView* pTexelBufferView;
/// }
/// ```
public final class VkWriteDescriptorSet extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("dstSet"),
        ValueLayout.JAVA_INT.withName("dstBinding"),
        ValueLayout.JAVA_INT.withName("dstArrayElement"),
        ValueLayout.JAVA_INT.withName("descriptorCount"),
        ValueLayout.JAVA_INT.withName("descriptorType"),
        ValueLayout.ADDRESS.withName("pImageInfo"),
        ValueLayout.ADDRESS.withName("pBufferInfo"),
        ValueLayout.ADDRESS.withName("pTexelBufferView")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_dstSet = LAYOUT.byteOffset(PathElement.groupElement("dstSet"));
    public static final long OFFSET_dstBinding = LAYOUT.byteOffset(PathElement.groupElement("dstBinding"));
    public static final long OFFSET_dstArrayElement = LAYOUT.byteOffset(PathElement.groupElement("dstArrayElement"));
    public static final long OFFSET_descriptorCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorCount"));
    public static final long OFFSET_descriptorType = LAYOUT.byteOffset(PathElement.groupElement("descriptorType"));
    public static final long OFFSET_pImageInfo = LAYOUT.byteOffset(PathElement.groupElement("pImageInfo"));
    public static final long OFFSET_pBufferInfo = LAYOUT.byteOffset(PathElement.groupElement("pBufferInfo"));
    public static final long OFFSET_pTexelBufferView = LAYOUT.byteOffset(PathElement.groupElement("pTexelBufferView"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_dstSet = LAYOUT.select(PathElement.groupElement("dstSet"));
    public static final MemoryLayout LAYOUT_dstBinding = LAYOUT.select(PathElement.groupElement("dstBinding"));
    public static final MemoryLayout LAYOUT_dstArrayElement = LAYOUT.select(PathElement.groupElement("dstArrayElement"));
    public static final MemoryLayout LAYOUT_descriptorCount = LAYOUT.select(PathElement.groupElement("descriptorCount"));
    public static final MemoryLayout LAYOUT_descriptorType = LAYOUT.select(PathElement.groupElement("descriptorType"));
    public static final MemoryLayout LAYOUT_pImageInfo = LAYOUT.select(PathElement.groupElement("pImageInfo"));
    public static final MemoryLayout LAYOUT_pBufferInfo = LAYOUT.select(PathElement.groupElement("pBufferInfo"));
    public static final MemoryLayout LAYOUT_pTexelBufferView = LAYOUT.select(PathElement.groupElement("pTexelBufferView"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_dstSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstSet"));
    public static final VarHandle VH_dstBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstBinding"));
    public static final VarHandle VH_dstArrayElement = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstArrayElement"));
    public static final VarHandle VH_descriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorCount"));
    public static final VarHandle VH_descriptorType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorType"));
    public static final VarHandle VH_pImageInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImageInfo"));
    public static final VarHandle VH_pBufferInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBufferInfo"));
    public static final VarHandle VH_pTexelBufferView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTexelBufferView"));

    public VkWriteDescriptorSet(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkWriteDescriptorSet of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSet(segment, estimateCount(segment, LAYOUT)); }
    public static VkWriteDescriptorSet ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSet(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkWriteDescriptorSet ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSet(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkWriteDescriptorSet alloc(SegmentAllocator allocator) { return new VkWriteDescriptorSet(allocator.allocate(LAYOUT), 1); }
    public static VkWriteDescriptorSet alloc(SegmentAllocator allocator, long count) { return new VkWriteDescriptorSet(allocator.allocate(LAYOUT, count), count); }
    public static VkWriteDescriptorSet allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET); }
    public static VkWriteDescriptorSet allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET);
        return s;
    }
    public VkWriteDescriptorSet copyFrom(VkWriteDescriptorSet src) { this.segment().copyFrom(src.segment()); return this; }
    public VkWriteDescriptorSet reinterpret(long count) { return new VkWriteDescriptorSet(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkWriteDescriptorSet asSlice(long index) { return new VkWriteDescriptorSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkWriteDescriptorSet asSlice(long index, long count) { return new VkWriteDescriptorSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkWriteDescriptorSet at(long index, Consumer<VkWriteDescriptorSet> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long dstSetAt(long index) { return (long) VH_dstSet.get(this.segment(), 0L, index); }
    public int dstBindingAt(long index) { return (int) VH_dstBinding.get(this.segment(), 0L, index); }
    public int dstArrayElementAt(long index) { return (int) VH_dstArrayElement.get(this.segment(), 0L, index); }
    public int descriptorCountAt(long index) { return (int) VH_descriptorCount.get(this.segment(), 0L, index); }
    public int descriptorTypeAt(long index) { return (int) VH_descriptorType.get(this.segment(), 0L, index); }
    public MemorySegment pImageInfoAt(long index) { return (MemorySegment) VH_pImageInfo.get(this.segment(), 0L, index); }
    public MemorySegment pBufferInfoAt(long index) { return (MemorySegment) VH_pBufferInfo.get(this.segment(), 0L, index); }
    public MemorySegment pTexelBufferViewAt(long index) { return (MemorySegment) VH_pTexelBufferView.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long dstSet() { return (long) VH_dstSet.get(this.segment(), 0L, 0L); }
    public int dstBinding() { return (int) VH_dstBinding.get(this.segment(), 0L, 0L); }
    public int dstArrayElement() { return (int) VH_dstArrayElement.get(this.segment(), 0L, 0L); }
    public int descriptorCount() { return (int) VH_descriptorCount.get(this.segment(), 0L, 0L); }
    public int descriptorType() { return (int) VH_descriptorType.get(this.segment(), 0L, 0L); }
    public MemorySegment pImageInfo() { return (MemorySegment) VH_pImageInfo.get(this.segment(), 0L, 0L); }
    public MemorySegment pBufferInfo() { return (MemorySegment) VH_pBufferInfo.get(this.segment(), 0L, 0L); }
    public MemorySegment pTexelBufferView() { return (MemorySegment) VH_pTexelBufferView.get(this.segment(), 0L, 0L); }
    public VkWriteDescriptorSet sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSet pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSet dstSetAt(long index, long value) { VH_dstSet.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSet dstBindingAt(long index, int value) { VH_dstBinding.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSet dstArrayElementAt(long index, int value) { VH_dstArrayElement.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSet descriptorCountAt(long index, int value) { VH_descriptorCount.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSet descriptorTypeAt(long index, int value) { VH_descriptorType.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSet pImageInfoAt(long index, MemorySegment value) { VH_pImageInfo.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSet pBufferInfoAt(long index, MemorySegment value) { VH_pBufferInfo.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSet pTexelBufferViewAt(long index, MemorySegment value) { VH_pTexelBufferView.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSet sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteDescriptorSet pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteDescriptorSet dstSet(long value) { VH_dstSet.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteDescriptorSet dstBinding(int value) { VH_dstBinding.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteDescriptorSet dstArrayElement(int value) { VH_dstArrayElement.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteDescriptorSet descriptorCount(int value) { VH_descriptorCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteDescriptorSet descriptorType(int value) { VH_descriptorType.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteDescriptorSet pImageInfo(MemorySegment value) { VH_pImageInfo.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteDescriptorSet pBufferInfo(MemorySegment value) { VH_pBufferInfo.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteDescriptorSet pTexelBufferView(MemorySegment value) { VH_pTexelBufferView.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkWriteDescriptorSet _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSet _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkWriteDescriptorSet _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSet _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _dstSetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstSet, index), LAYOUT_dstSet); }
    public MemorySegment _dstSet() { return _dstSetAt(0L); }
    public VkWriteDescriptorSet _dstSetAt(long index, MemorySegment src) { _dstSetAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSet _dstSet(MemorySegment src) { return _dstSetAt(0L, src); }
    public MemorySegment _dstBindingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstBinding, index), LAYOUT_dstBinding); }
    public MemorySegment _dstBinding() { return _dstBindingAt(0L); }
    public VkWriteDescriptorSet _dstBindingAt(long index, MemorySegment src) { _dstBindingAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSet _dstBinding(MemorySegment src) { return _dstBindingAt(0L, src); }
    public MemorySegment _dstArrayElementAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstArrayElement, index), LAYOUT_dstArrayElement); }
    public MemorySegment _dstArrayElement() { return _dstArrayElementAt(0L); }
    public VkWriteDescriptorSet _dstArrayElementAt(long index, MemorySegment src) { _dstArrayElementAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSet _dstArrayElement(MemorySegment src) { return _dstArrayElementAt(0L, src); }
    public MemorySegment _descriptorCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorCount, index), LAYOUT_descriptorCount); }
    public MemorySegment _descriptorCount() { return _descriptorCountAt(0L); }
    public VkWriteDescriptorSet _descriptorCountAt(long index, MemorySegment src) { _descriptorCountAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSet _descriptorCount(MemorySegment src) { return _descriptorCountAt(0L, src); }
    public MemorySegment _descriptorTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorType, index), LAYOUT_descriptorType); }
    public MemorySegment _descriptorType() { return _descriptorTypeAt(0L); }
    public VkWriteDescriptorSet _descriptorTypeAt(long index, MemorySegment src) { _descriptorTypeAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSet _descriptorType(MemorySegment src) { return _descriptorTypeAt(0L, src); }
    public MemorySegment _pImageInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pImageInfo, index), LAYOUT_pImageInfo); }
    public MemorySegment _pImageInfo() { return _pImageInfoAt(0L); }
    public VkWriteDescriptorSet _pImageInfoAt(long index, MemorySegment src) { _pImageInfoAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSet _pImageInfo(MemorySegment src) { return _pImageInfoAt(0L, src); }
    public MemorySegment _pBufferInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pBufferInfo, index), LAYOUT_pBufferInfo); }
    public MemorySegment _pBufferInfo() { return _pBufferInfoAt(0L); }
    public VkWriteDescriptorSet _pBufferInfoAt(long index, MemorySegment src) { _pBufferInfoAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSet _pBufferInfo(MemorySegment src) { return _pBufferInfoAt(0L, src); }
    public MemorySegment _pTexelBufferViewAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pTexelBufferView, index), LAYOUT_pTexelBufferView); }
    public MemorySegment _pTexelBufferView() { return _pTexelBufferViewAt(0L); }
    public VkWriteDescriptorSet _pTexelBufferViewAt(long index, MemorySegment src) { _pTexelBufferViewAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSet _pTexelBufferView(MemorySegment src) { return _pTexelBufferViewAt(0L, src); }
}
