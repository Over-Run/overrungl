// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCopyDescriptorSet`.
/// ## Layout
/// ```
/// struct VkCopyDescriptorSet {
///     VkStructureType sType;
///     const void* pNext;
///     VkDescriptorSet srcSet;
///     uint32_t srcBinding;
///     uint32_t srcArrayElement;
///     VkDescriptorSet dstSet;
///     uint32_t dstBinding;
///     uint32_t dstArrayElement;
///     uint32_t descriptorCount;
/// }
/// ```
public final class VkCopyDescriptorSet extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("srcSet"),
        ValueLayout.JAVA_INT.withName("srcBinding"),
        ValueLayout.JAVA_INT.withName("srcArrayElement"),
        ValueLayout.JAVA_LONG.withName("dstSet"),
        ValueLayout.JAVA_INT.withName("dstBinding"),
        ValueLayout.JAVA_INT.withName("dstArrayElement"),
        ValueLayout.JAVA_INT.withName("descriptorCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_srcSet = LAYOUT.byteOffset(PathElement.groupElement("srcSet"));
    public static final long OFFSET_srcBinding = LAYOUT.byteOffset(PathElement.groupElement("srcBinding"));
    public static final long OFFSET_srcArrayElement = LAYOUT.byteOffset(PathElement.groupElement("srcArrayElement"));
    public static final long OFFSET_dstSet = LAYOUT.byteOffset(PathElement.groupElement("dstSet"));
    public static final long OFFSET_dstBinding = LAYOUT.byteOffset(PathElement.groupElement("dstBinding"));
    public static final long OFFSET_dstArrayElement = LAYOUT.byteOffset(PathElement.groupElement("dstArrayElement"));
    public static final long OFFSET_descriptorCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_srcSet = LAYOUT.select(PathElement.groupElement("srcSet"));
    public static final MemoryLayout LAYOUT_srcBinding = LAYOUT.select(PathElement.groupElement("srcBinding"));
    public static final MemoryLayout LAYOUT_srcArrayElement = LAYOUT.select(PathElement.groupElement("srcArrayElement"));
    public static final MemoryLayout LAYOUT_dstSet = LAYOUT.select(PathElement.groupElement("dstSet"));
    public static final MemoryLayout LAYOUT_dstBinding = LAYOUT.select(PathElement.groupElement("dstBinding"));
    public static final MemoryLayout LAYOUT_dstArrayElement = LAYOUT.select(PathElement.groupElement("dstArrayElement"));
    public static final MemoryLayout LAYOUT_descriptorCount = LAYOUT.select(PathElement.groupElement("descriptorCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_srcSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcSet"));
    public static final VarHandle VH_srcBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcBinding"));
    public static final VarHandle VH_srcArrayElement = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcArrayElement"));
    public static final VarHandle VH_dstSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstSet"));
    public static final VarHandle VH_dstBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstBinding"));
    public static final VarHandle VH_dstArrayElement = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstArrayElement"));
    public static final VarHandle VH_descriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorCount"));

    public VkCopyDescriptorSet(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCopyDescriptorSet of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyDescriptorSet(segment, estimateCount(segment, LAYOUT)); }
    public static VkCopyDescriptorSet ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyDescriptorSet(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCopyDescriptorSet ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyDescriptorSet(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCopyDescriptorSet alloc(SegmentAllocator allocator) { return new VkCopyDescriptorSet(allocator.allocate(LAYOUT), 1); }
    public static VkCopyDescriptorSet alloc(SegmentAllocator allocator, long count) { return new VkCopyDescriptorSet(allocator.allocate(LAYOUT, count), count); }
    public static VkCopyDescriptorSet allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET); }
    public static VkCopyDescriptorSet allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET);
        return s;
    }
    public VkCopyDescriptorSet copyFrom(VkCopyDescriptorSet src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCopyDescriptorSet reinterpret(long count) { return new VkCopyDescriptorSet(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCopyDescriptorSet asSlice(long index) { return new VkCopyDescriptorSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCopyDescriptorSet asSlice(long index, long count) { return new VkCopyDescriptorSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCopyDescriptorSet at(long index, Consumer<VkCopyDescriptorSet> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long srcSetAt(long index) { return (long) VH_srcSet.get(this.segment(), 0L, index); }
    public int srcBindingAt(long index) { return (int) VH_srcBinding.get(this.segment(), 0L, index); }
    public int srcArrayElementAt(long index) { return (int) VH_srcArrayElement.get(this.segment(), 0L, index); }
    public long dstSetAt(long index) { return (long) VH_dstSet.get(this.segment(), 0L, index); }
    public int dstBindingAt(long index) { return (int) VH_dstBinding.get(this.segment(), 0L, index); }
    public int dstArrayElementAt(long index) { return (int) VH_dstArrayElement.get(this.segment(), 0L, index); }
    public int descriptorCountAt(long index) { return (int) VH_descriptorCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long srcSet() { return (long) VH_srcSet.get(this.segment(), 0L, 0L); }
    public int srcBinding() { return (int) VH_srcBinding.get(this.segment(), 0L, 0L); }
    public int srcArrayElement() { return (int) VH_srcArrayElement.get(this.segment(), 0L, 0L); }
    public long dstSet() { return (long) VH_dstSet.get(this.segment(), 0L, 0L); }
    public int dstBinding() { return (int) VH_dstBinding.get(this.segment(), 0L, 0L); }
    public int dstArrayElement() { return (int) VH_dstArrayElement.get(this.segment(), 0L, 0L); }
    public int descriptorCount() { return (int) VH_descriptorCount.get(this.segment(), 0L, 0L); }
    public VkCopyDescriptorSet sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCopyDescriptorSet pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCopyDescriptorSet srcSetAt(long index, long value) { VH_srcSet.set(this.segment(), 0L, index, value); return this; }
    public VkCopyDescriptorSet srcBindingAt(long index, int value) { VH_srcBinding.set(this.segment(), 0L, index, value); return this; }
    public VkCopyDescriptorSet srcArrayElementAt(long index, int value) { VH_srcArrayElement.set(this.segment(), 0L, index, value); return this; }
    public VkCopyDescriptorSet dstSetAt(long index, long value) { VH_dstSet.set(this.segment(), 0L, index, value); return this; }
    public VkCopyDescriptorSet dstBindingAt(long index, int value) { VH_dstBinding.set(this.segment(), 0L, index, value); return this; }
    public VkCopyDescriptorSet dstArrayElementAt(long index, int value) { VH_dstArrayElement.set(this.segment(), 0L, index, value); return this; }
    public VkCopyDescriptorSet descriptorCountAt(long index, int value) { VH_descriptorCount.set(this.segment(), 0L, index, value); return this; }
    public VkCopyDescriptorSet sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyDescriptorSet pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyDescriptorSet srcSet(long value) { VH_srcSet.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyDescriptorSet srcBinding(int value) { VH_srcBinding.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyDescriptorSet srcArrayElement(int value) { VH_srcArrayElement.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyDescriptorSet dstSet(long value) { VH_dstSet.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyDescriptorSet dstBinding(int value) { VH_dstBinding.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyDescriptorSet dstArrayElement(int value) { VH_dstArrayElement.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyDescriptorSet descriptorCount(int value) { VH_descriptorCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCopyDescriptorSet _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCopyDescriptorSet _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCopyDescriptorSet _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCopyDescriptorSet _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _srcSetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcSet, index), LAYOUT_srcSet); }
    public MemorySegment _srcSet() { return _srcSetAt(0L); }
    public VkCopyDescriptorSet _srcSetAt(long index, MemorySegment src) { _srcSetAt(index).copyFrom(src); return this; }
    public VkCopyDescriptorSet _srcSet(MemorySegment src) { return _srcSetAt(0L, src); }
    public MemorySegment _srcBindingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcBinding, index), LAYOUT_srcBinding); }
    public MemorySegment _srcBinding() { return _srcBindingAt(0L); }
    public VkCopyDescriptorSet _srcBindingAt(long index, MemorySegment src) { _srcBindingAt(index).copyFrom(src); return this; }
    public VkCopyDescriptorSet _srcBinding(MemorySegment src) { return _srcBindingAt(0L, src); }
    public MemorySegment _srcArrayElementAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcArrayElement, index), LAYOUT_srcArrayElement); }
    public MemorySegment _srcArrayElement() { return _srcArrayElementAt(0L); }
    public VkCopyDescriptorSet _srcArrayElementAt(long index, MemorySegment src) { _srcArrayElementAt(index).copyFrom(src); return this; }
    public VkCopyDescriptorSet _srcArrayElement(MemorySegment src) { return _srcArrayElementAt(0L, src); }
    public MemorySegment _dstSetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstSet, index), LAYOUT_dstSet); }
    public MemorySegment _dstSet() { return _dstSetAt(0L); }
    public VkCopyDescriptorSet _dstSetAt(long index, MemorySegment src) { _dstSetAt(index).copyFrom(src); return this; }
    public VkCopyDescriptorSet _dstSet(MemorySegment src) { return _dstSetAt(0L, src); }
    public MemorySegment _dstBindingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstBinding, index), LAYOUT_dstBinding); }
    public MemorySegment _dstBinding() { return _dstBindingAt(0L); }
    public VkCopyDescriptorSet _dstBindingAt(long index, MemorySegment src) { _dstBindingAt(index).copyFrom(src); return this; }
    public VkCopyDescriptorSet _dstBinding(MemorySegment src) { return _dstBindingAt(0L, src); }
    public MemorySegment _dstArrayElementAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstArrayElement, index), LAYOUT_dstArrayElement); }
    public MemorySegment _dstArrayElement() { return _dstArrayElementAt(0L); }
    public VkCopyDescriptorSet _dstArrayElementAt(long index, MemorySegment src) { _dstArrayElementAt(index).copyFrom(src); return this; }
    public VkCopyDescriptorSet _dstArrayElement(MemorySegment src) { return _dstArrayElementAt(0L, src); }
    public MemorySegment _descriptorCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorCount, index), LAYOUT_descriptorCount); }
    public MemorySegment _descriptorCount() { return _descriptorCountAt(0L); }
    public VkCopyDescriptorSet _descriptorCountAt(long index, MemorySegment src) { _descriptorCountAt(index).copyFrom(src); return this; }
    public VkCopyDescriptorSet _descriptorCount(MemorySegment src) { return _descriptorCountAt(0L, src); }
}
