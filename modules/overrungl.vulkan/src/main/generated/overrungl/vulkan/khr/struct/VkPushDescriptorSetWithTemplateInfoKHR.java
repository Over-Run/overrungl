// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPushDescriptorSetWithTemplateInfoKHR`.
/// ## Layout
/// ```
/// struct VkPushDescriptorSetWithTemplateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkDescriptorUpdateTemplate descriptorUpdateTemplate;
///     VkPipelineLayout layout;
///     uint32_t set;
///     const void* pData;
/// }
/// ```
public final class VkPushDescriptorSetWithTemplateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("descriptorUpdateTemplate"),
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_INT.withName("set"),
        ValueLayout.ADDRESS.withName("pData")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_descriptorUpdateTemplate = LAYOUT.byteOffset(PathElement.groupElement("descriptorUpdateTemplate"));
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    public static final long OFFSET_set = LAYOUT.byteOffset(PathElement.groupElement("set"));
    public static final long OFFSET_pData = LAYOUT.byteOffset(PathElement.groupElement("pData"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_descriptorUpdateTemplate = LAYOUT.select(PathElement.groupElement("descriptorUpdateTemplate"));
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    public static final MemoryLayout LAYOUT_set = LAYOUT.select(PathElement.groupElement("set"));
    public static final MemoryLayout LAYOUT_pData = LAYOUT.select(PathElement.groupElement("pData"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_descriptorUpdateTemplate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorUpdateTemplate"));
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    public static final VarHandle VH_set = LAYOUT.arrayElementVarHandle(PathElement.groupElement("set"));
    public static final VarHandle VH_pData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pData"));

    public VkPushDescriptorSetWithTemplateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPushDescriptorSetWithTemplateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPushDescriptorSetWithTemplateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPushDescriptorSetWithTemplateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPushDescriptorSetWithTemplateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPushDescriptorSetWithTemplateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPushDescriptorSetWithTemplateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPushDescriptorSetWithTemplateInfoKHR alloc(SegmentAllocator allocator) { return new VkPushDescriptorSetWithTemplateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPushDescriptorSetWithTemplateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPushDescriptorSetWithTemplateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPushDescriptorSetWithTemplateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO); }
    public static VkPushDescriptorSetWithTemplateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO);
        return s;
    }
    public VkPushDescriptorSetWithTemplateInfoKHR copyFrom(VkPushDescriptorSetWithTemplateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPushDescriptorSetWithTemplateInfoKHR reinterpret(long count) { return new VkPushDescriptorSetWithTemplateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPushDescriptorSetWithTemplateInfoKHR asSlice(long index) { return new VkPushDescriptorSetWithTemplateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPushDescriptorSetWithTemplateInfoKHR asSlice(long index, long count) { return new VkPushDescriptorSetWithTemplateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPushDescriptorSetWithTemplateInfoKHR at(long index, Consumer<VkPushDescriptorSetWithTemplateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long descriptorUpdateTemplateAt(long index) { return (long) VH_descriptorUpdateTemplate.get(this.segment(), 0L, index); }
    public long layoutAt(long index) { return (long) VH_layout.get(this.segment(), 0L, index); }
    public int setAt(long index) { return (int) VH_set.get(this.segment(), 0L, index); }
    public MemorySegment pDataAt(long index) { return (MemorySegment) VH_pData.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long descriptorUpdateTemplate() { return (long) VH_descriptorUpdateTemplate.get(this.segment(), 0L, 0L); }
    public long layout() { return (long) VH_layout.get(this.segment(), 0L, 0L); }
    public int set() { return (int) VH_set.get(this.segment(), 0L, 0L); }
    public MemorySegment pData() { return (MemorySegment) VH_pData.get(this.segment(), 0L, 0L); }
    public VkPushDescriptorSetWithTemplateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPushDescriptorSetWithTemplateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPushDescriptorSetWithTemplateInfoKHR descriptorUpdateTemplateAt(long index, long value) { VH_descriptorUpdateTemplate.set(this.segment(), 0L, index, value); return this; }
    public VkPushDescriptorSetWithTemplateInfoKHR layoutAt(long index, long value) { VH_layout.set(this.segment(), 0L, index, value); return this; }
    public VkPushDescriptorSetWithTemplateInfoKHR setAt(long index, int value) { VH_set.set(this.segment(), 0L, index, value); return this; }
    public VkPushDescriptorSetWithTemplateInfoKHR pDataAt(long index, MemorySegment value) { VH_pData.set(this.segment(), 0L, index, value); return this; }
    public VkPushDescriptorSetWithTemplateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPushDescriptorSetWithTemplateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPushDescriptorSetWithTemplateInfoKHR descriptorUpdateTemplate(long value) { VH_descriptorUpdateTemplate.set(this.segment(), 0L, 0L, value); return this; }
    public VkPushDescriptorSetWithTemplateInfoKHR layout(long value) { VH_layout.set(this.segment(), 0L, 0L, value); return this; }
    public VkPushDescriptorSetWithTemplateInfoKHR set(int value) { VH_set.set(this.segment(), 0L, 0L, value); return this; }
    public VkPushDescriptorSetWithTemplateInfoKHR pData(MemorySegment value) { VH_pData.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPushDescriptorSetWithTemplateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPushDescriptorSetWithTemplateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPushDescriptorSetWithTemplateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPushDescriptorSetWithTemplateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _descriptorUpdateTemplateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorUpdateTemplate, index), LAYOUT_descriptorUpdateTemplate); }
    public MemorySegment _descriptorUpdateTemplate() { return _descriptorUpdateTemplateAt(0L); }
    public VkPushDescriptorSetWithTemplateInfoKHR _descriptorUpdateTemplateAt(long index, MemorySegment src) { _descriptorUpdateTemplateAt(index).copyFrom(src); return this; }
    public VkPushDescriptorSetWithTemplateInfoKHR _descriptorUpdateTemplate(MemorySegment src) { return _descriptorUpdateTemplateAt(0L, src); }
    public MemorySegment _layoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layout, index), LAYOUT_layout); }
    public MemorySegment _layout() { return _layoutAt(0L); }
    public VkPushDescriptorSetWithTemplateInfoKHR _layoutAt(long index, MemorySegment src) { _layoutAt(index).copyFrom(src); return this; }
    public VkPushDescriptorSetWithTemplateInfoKHR _layout(MemorySegment src) { return _layoutAt(0L, src); }
    public MemorySegment _setAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_set, index), LAYOUT_set); }
    public MemorySegment _set() { return _setAt(0L); }
    public VkPushDescriptorSetWithTemplateInfoKHR _setAt(long index, MemorySegment src) { _setAt(index).copyFrom(src); return this; }
    public VkPushDescriptorSetWithTemplateInfoKHR _set(MemorySegment src) { return _setAt(0L, src); }
    public MemorySegment _pDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pData, index), LAYOUT_pData); }
    public MemorySegment _pData() { return _pDataAt(0L); }
    public VkPushDescriptorSetWithTemplateInfoKHR _pDataAt(long index, MemorySegment src) { _pDataAt(index).copyFrom(src); return this; }
    public VkPushDescriptorSetWithTemplateInfoKHR _pData(MemorySegment src) { return _pDataAt(0L, src); }
}
