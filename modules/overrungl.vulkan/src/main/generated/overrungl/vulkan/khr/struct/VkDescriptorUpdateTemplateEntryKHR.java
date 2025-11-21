// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorUpdateTemplateEntryKHR`.
/// ## Layout
/// ```
/// struct VkDescriptorUpdateTemplateEntryKHR {
///     uint32_t dstBinding;
///     uint32_t dstArrayElement;
///     uint32_t descriptorCount;
///     VkDescriptorType descriptorType;
///     size_t offset;
///     size_t stride;
/// }
/// ```
public final class VkDescriptorUpdateTemplateEntryKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("dstBinding"),
        ValueLayout.JAVA_INT.withName("dstArrayElement"),
        ValueLayout.JAVA_INT.withName("descriptorCount"),
        ValueLayout.JAVA_INT.withName("descriptorType"),
        CanonicalTypes.SIZE_T.withName("offset"),
        CanonicalTypes.SIZE_T.withName("stride")
    );
    public static final long OFFSET_dstBinding = LAYOUT.byteOffset(PathElement.groupElement("dstBinding"));
    public static final long OFFSET_dstArrayElement = LAYOUT.byteOffset(PathElement.groupElement("dstArrayElement"));
    public static final long OFFSET_descriptorCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorCount"));
    public static final long OFFSET_descriptorType = LAYOUT.byteOffset(PathElement.groupElement("descriptorType"));
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    public static final long OFFSET_stride = LAYOUT.byteOffset(PathElement.groupElement("stride"));
    public static final MemoryLayout LAYOUT_dstBinding = LAYOUT.select(PathElement.groupElement("dstBinding"));
    public static final MemoryLayout LAYOUT_dstArrayElement = LAYOUT.select(PathElement.groupElement("dstArrayElement"));
    public static final MemoryLayout LAYOUT_descriptorCount = LAYOUT.select(PathElement.groupElement("descriptorCount"));
    public static final MemoryLayout LAYOUT_descriptorType = LAYOUT.select(PathElement.groupElement("descriptorType"));
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    public static final MemoryLayout LAYOUT_stride = LAYOUT.select(PathElement.groupElement("stride"));
    public static final VarHandle VH_dstBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstBinding"));
    public static final VarHandle VH_dstArrayElement = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstArrayElement"));
    public static final VarHandle VH_descriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorCount"));
    public static final VarHandle VH_descriptorType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorType"));
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));

    public VkDescriptorUpdateTemplateEntryKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDescriptorUpdateTemplateEntryKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorUpdateTemplateEntryKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDescriptorUpdateTemplateEntryKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorUpdateTemplateEntryKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDescriptorUpdateTemplateEntryKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorUpdateTemplateEntryKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDescriptorUpdateTemplateEntryKHR alloc(SegmentAllocator allocator) { return new VkDescriptorUpdateTemplateEntryKHR(allocator.allocate(LAYOUT), 1); }
    public static VkDescriptorUpdateTemplateEntryKHR alloc(SegmentAllocator allocator, long count) { return new VkDescriptorUpdateTemplateEntryKHR(allocator.allocate(LAYOUT, count), count); }
    public VkDescriptorUpdateTemplateEntryKHR copyFrom(VkDescriptorUpdateTemplateEntryKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDescriptorUpdateTemplateEntryKHR reinterpret(long count) { return new VkDescriptorUpdateTemplateEntryKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDescriptorUpdateTemplateEntryKHR asSlice(long index) { return new VkDescriptorUpdateTemplateEntryKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDescriptorUpdateTemplateEntryKHR asSlice(long index, long count) { return new VkDescriptorUpdateTemplateEntryKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDescriptorUpdateTemplateEntryKHR at(long index, Consumer<VkDescriptorUpdateTemplateEntryKHR> func) { func.accept(asSlice(index)); return this; }
    public int dstBindingAt(long index) { return (int) VH_dstBinding.get(this.segment(), 0L, index); }
    public int dstArrayElementAt(long index) { return (int) VH_dstArrayElement.get(this.segment(), 0L, index); }
    public int descriptorCountAt(long index) { return (int) VH_descriptorCount.get(this.segment(), 0L, index); }
    public int descriptorTypeAt(long index) { return (int) VH_descriptorType.get(this.segment(), 0L, index); }
    public long offsetAt(long index) { return (long) VH_offset.get(this.segment(), 0L, index); }
    public long strideAt(long index) { return (long) VH_stride.get(this.segment(), 0L, index); }
    public int dstBinding() { return (int) VH_dstBinding.get(this.segment(), 0L, 0L); }
    public int dstArrayElement() { return (int) VH_dstArrayElement.get(this.segment(), 0L, 0L); }
    public int descriptorCount() { return (int) VH_descriptorCount.get(this.segment(), 0L, 0L); }
    public int descriptorType() { return (int) VH_descriptorType.get(this.segment(), 0L, 0L); }
    public long offset() { return (long) VH_offset.get(this.segment(), 0L, 0L); }
    public long stride() { return (long) VH_stride.get(this.segment(), 0L, 0L); }
    public VkDescriptorUpdateTemplateEntryKHR dstBindingAt(long index, int value) { VH_dstBinding.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorUpdateTemplateEntryKHR dstArrayElementAt(long index, int value) { VH_dstArrayElement.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorUpdateTemplateEntryKHR descriptorCountAt(long index, int value) { VH_descriptorCount.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorUpdateTemplateEntryKHR descriptorTypeAt(long index, int value) { VH_descriptorType.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorUpdateTemplateEntryKHR offsetAt(long index, long value) { VH_offset.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorUpdateTemplateEntryKHR strideAt(long index, long value) { VH_stride.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorUpdateTemplateEntryKHR dstBinding(int value) { VH_dstBinding.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorUpdateTemplateEntryKHR dstArrayElement(int value) { VH_dstArrayElement.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorUpdateTemplateEntryKHR descriptorCount(int value) { VH_descriptorCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorUpdateTemplateEntryKHR descriptorType(int value) { VH_descriptorType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorUpdateTemplateEntryKHR offset(long value) { VH_offset.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorUpdateTemplateEntryKHR stride(long value) { VH_stride.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _dstBindingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstBinding, index), LAYOUT_dstBinding); }
    public MemorySegment _dstBinding() { return _dstBindingAt(0L); }
    public VkDescriptorUpdateTemplateEntryKHR _dstBindingAt(long index, MemorySegment src) { _dstBindingAt(index).copyFrom(src); return this; }
    public VkDescriptorUpdateTemplateEntryKHR _dstBinding(MemorySegment src) { return _dstBindingAt(0L, src); }
    public MemorySegment _dstArrayElementAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstArrayElement, index), LAYOUT_dstArrayElement); }
    public MemorySegment _dstArrayElement() { return _dstArrayElementAt(0L); }
    public VkDescriptorUpdateTemplateEntryKHR _dstArrayElementAt(long index, MemorySegment src) { _dstArrayElementAt(index).copyFrom(src); return this; }
    public VkDescriptorUpdateTemplateEntryKHR _dstArrayElement(MemorySegment src) { return _dstArrayElementAt(0L, src); }
    public MemorySegment _descriptorCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorCount, index), LAYOUT_descriptorCount); }
    public MemorySegment _descriptorCount() { return _descriptorCountAt(0L); }
    public VkDescriptorUpdateTemplateEntryKHR _descriptorCountAt(long index, MemorySegment src) { _descriptorCountAt(index).copyFrom(src); return this; }
    public VkDescriptorUpdateTemplateEntryKHR _descriptorCount(MemorySegment src) { return _descriptorCountAt(0L, src); }
    public MemorySegment _descriptorTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorType, index), LAYOUT_descriptorType); }
    public MemorySegment _descriptorType() { return _descriptorTypeAt(0L); }
    public VkDescriptorUpdateTemplateEntryKHR _descriptorTypeAt(long index, MemorySegment src) { _descriptorTypeAt(index).copyFrom(src); return this; }
    public VkDescriptorUpdateTemplateEntryKHR _descriptorType(MemorySegment src) { return _descriptorTypeAt(0L, src); }
    public MemorySegment _offsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    public MemorySegment _offset() { return _offsetAt(0L); }
    public VkDescriptorUpdateTemplateEntryKHR _offsetAt(long index, MemorySegment src) { _offsetAt(index).copyFrom(src); return this; }
    public VkDescriptorUpdateTemplateEntryKHR _offset(MemorySegment src) { return _offsetAt(0L, src); }
    public MemorySegment _strideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stride, index), LAYOUT_stride); }
    public MemorySegment _stride() { return _strideAt(0L); }
    public VkDescriptorUpdateTemplateEntryKHR _strideAt(long index, MemorySegment src) { _strideAt(index).copyFrom(src); return this; }
    public VkDescriptorUpdateTemplateEntryKHR _stride(MemorySegment src) { return _strideAt(0L, src); }
}
