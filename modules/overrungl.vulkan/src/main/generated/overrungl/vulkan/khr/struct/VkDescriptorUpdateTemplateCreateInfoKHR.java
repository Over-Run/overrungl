// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorUpdateTemplateCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkDescriptorUpdateTemplateCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkDescriptorUpdateTemplateCreateFlags flags;
///     uint32_t descriptorUpdateEntryCount;
///     const VkDescriptorUpdateTemplateEntry* pDescriptorUpdateEntries;
///     VkDescriptorUpdateTemplateType templateType;
///     VkDescriptorSetLayout descriptorSetLayout;
///     VkPipelineBindPoint pipelineBindPoint;
///     VkPipelineLayout pipelineLayout;
///     uint32_t set;
/// }
/// ```
public final class VkDescriptorUpdateTemplateCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("descriptorUpdateEntryCount"),
        ValueLayout.ADDRESS.withName("pDescriptorUpdateEntries"),
        ValueLayout.JAVA_INT.withName("templateType"),
        ValueLayout.JAVA_LONG.withName("descriptorSetLayout"),
        ValueLayout.JAVA_INT.withName("pipelineBindPoint"),
        ValueLayout.JAVA_LONG.withName("pipelineLayout"),
        ValueLayout.JAVA_INT.withName("set")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_descriptorUpdateEntryCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorUpdateEntryCount"));
    public static final long OFFSET_pDescriptorUpdateEntries = LAYOUT.byteOffset(PathElement.groupElement("pDescriptorUpdateEntries"));
    public static final long OFFSET_templateType = LAYOUT.byteOffset(PathElement.groupElement("templateType"));
    public static final long OFFSET_descriptorSetLayout = LAYOUT.byteOffset(PathElement.groupElement("descriptorSetLayout"));
    public static final long OFFSET_pipelineBindPoint = LAYOUT.byteOffset(PathElement.groupElement("pipelineBindPoint"));
    public static final long OFFSET_pipelineLayout = LAYOUT.byteOffset(PathElement.groupElement("pipelineLayout"));
    public static final long OFFSET_set = LAYOUT.byteOffset(PathElement.groupElement("set"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_descriptorUpdateEntryCount = LAYOUT.select(PathElement.groupElement("descriptorUpdateEntryCount"));
    public static final MemoryLayout LAYOUT_pDescriptorUpdateEntries = LAYOUT.select(PathElement.groupElement("pDescriptorUpdateEntries"));
    public static final MemoryLayout LAYOUT_templateType = LAYOUT.select(PathElement.groupElement("templateType"));
    public static final MemoryLayout LAYOUT_descriptorSetLayout = LAYOUT.select(PathElement.groupElement("descriptorSetLayout"));
    public static final MemoryLayout LAYOUT_pipelineBindPoint = LAYOUT.select(PathElement.groupElement("pipelineBindPoint"));
    public static final MemoryLayout LAYOUT_pipelineLayout = LAYOUT.select(PathElement.groupElement("pipelineLayout"));
    public static final MemoryLayout LAYOUT_set = LAYOUT.select(PathElement.groupElement("set"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_descriptorUpdateEntryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorUpdateEntryCount"));
    public static final VarHandle VH_pDescriptorUpdateEntries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDescriptorUpdateEntries"));
    public static final VarHandle VH_templateType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("templateType"));
    public static final VarHandle VH_descriptorSetLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetLayout"));
    public static final VarHandle VH_pipelineBindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBindPoint"));
    public static final VarHandle VH_pipelineLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineLayout"));
    public static final VarHandle VH_set = LAYOUT.arrayElementVarHandle(PathElement.groupElement("set"));

    public VkDescriptorUpdateTemplateCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDescriptorUpdateTemplateCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorUpdateTemplateCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDescriptorUpdateTemplateCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorUpdateTemplateCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDescriptorUpdateTemplateCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorUpdateTemplateCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDescriptorUpdateTemplateCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkDescriptorUpdateTemplateCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkDescriptorUpdateTemplateCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkDescriptorUpdateTemplateCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkDescriptorUpdateTemplateCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO); }
    public static VkDescriptorUpdateTemplateCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO);
        return s;
    }
    public VkDescriptorUpdateTemplateCreateInfoKHR copyFrom(VkDescriptorUpdateTemplateCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR reinterpret(long count) { return new VkDescriptorUpdateTemplateCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDescriptorUpdateTemplateCreateInfoKHR asSlice(long index) { return new VkDescriptorUpdateTemplateCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDescriptorUpdateTemplateCreateInfoKHR asSlice(long index, long count) { return new VkDescriptorUpdateTemplateCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDescriptorUpdateTemplateCreateInfoKHR at(long index, Consumer<VkDescriptorUpdateTemplateCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int descriptorUpdateEntryCountAt(long index) { return (int) VH_descriptorUpdateEntryCount.get(this.segment(), 0L, index); }
    public MemorySegment pDescriptorUpdateEntriesAt(long index) { return (MemorySegment) VH_pDescriptorUpdateEntries.get(this.segment(), 0L, index); }
    public int templateTypeAt(long index) { return (int) VH_templateType.get(this.segment(), 0L, index); }
    public long descriptorSetLayoutAt(long index) { return (long) VH_descriptorSetLayout.get(this.segment(), 0L, index); }
    public int pipelineBindPointAt(long index) { return (int) VH_pipelineBindPoint.get(this.segment(), 0L, index); }
    public long pipelineLayoutAt(long index) { return (long) VH_pipelineLayout.get(this.segment(), 0L, index); }
    public int setAt(long index) { return (int) VH_set.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int descriptorUpdateEntryCount() { return (int) VH_descriptorUpdateEntryCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pDescriptorUpdateEntries() { return (MemorySegment) VH_pDescriptorUpdateEntries.get(this.segment(), 0L, 0L); }
    public int templateType() { return (int) VH_templateType.get(this.segment(), 0L, 0L); }
    public long descriptorSetLayout() { return (long) VH_descriptorSetLayout.get(this.segment(), 0L, 0L); }
    public int pipelineBindPoint() { return (int) VH_pipelineBindPoint.get(this.segment(), 0L, 0L); }
    public long pipelineLayout() { return (long) VH_pipelineLayout.get(this.segment(), 0L, 0L); }
    public int set() { return (int) VH_set.get(this.segment(), 0L, 0L); }
    public VkDescriptorUpdateTemplateCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR descriptorUpdateEntryCountAt(long index, int value) { VH_descriptorUpdateEntryCount.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR pDescriptorUpdateEntriesAt(long index, MemorySegment value) { VH_pDescriptorUpdateEntries.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR templateTypeAt(long index, int value) { VH_templateType.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR descriptorSetLayoutAt(long index, long value) { VH_descriptorSetLayout.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR pipelineBindPointAt(long index, int value) { VH_pipelineBindPoint.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR pipelineLayoutAt(long index, long value) { VH_pipelineLayout.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR setAt(long index, int value) { VH_set.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR descriptorUpdateEntryCount(int value) { VH_descriptorUpdateEntryCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR pDescriptorUpdateEntries(MemorySegment value) { VH_pDescriptorUpdateEntries.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR templateType(int value) { VH_templateType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR descriptorSetLayout(long value) { VH_descriptorSetLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR pipelineBindPoint(int value) { VH_pipelineBindPoint.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR pipelineLayout(long value) { VH_pipelineLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR set(int value) { VH_set.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDescriptorUpdateTemplateCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDescriptorUpdateTemplateCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkDescriptorUpdateTemplateCreateInfoKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _descriptorUpdateEntryCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorUpdateEntryCount, index), LAYOUT_descriptorUpdateEntryCount); }
    public MemorySegment _descriptorUpdateEntryCount() { return _descriptorUpdateEntryCountAt(0L); }
    public VkDescriptorUpdateTemplateCreateInfoKHR _descriptorUpdateEntryCountAt(long index, MemorySegment src) { _descriptorUpdateEntryCountAt(index).copyFrom(src); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR _descriptorUpdateEntryCount(MemorySegment src) { return _descriptorUpdateEntryCountAt(0L, src); }
    public MemorySegment _pDescriptorUpdateEntriesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDescriptorUpdateEntries, index), LAYOUT_pDescriptorUpdateEntries); }
    public MemorySegment _pDescriptorUpdateEntries() { return _pDescriptorUpdateEntriesAt(0L); }
    public VkDescriptorUpdateTemplateCreateInfoKHR _pDescriptorUpdateEntriesAt(long index, MemorySegment src) { _pDescriptorUpdateEntriesAt(index).copyFrom(src); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR _pDescriptorUpdateEntries(MemorySegment src) { return _pDescriptorUpdateEntriesAt(0L, src); }
    public MemorySegment _templateTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_templateType, index), LAYOUT_templateType); }
    public MemorySegment _templateType() { return _templateTypeAt(0L); }
    public VkDescriptorUpdateTemplateCreateInfoKHR _templateTypeAt(long index, MemorySegment src) { _templateTypeAt(index).copyFrom(src); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR _templateType(MemorySegment src) { return _templateTypeAt(0L, src); }
    public MemorySegment _descriptorSetLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorSetLayout, index), LAYOUT_descriptorSetLayout); }
    public MemorySegment _descriptorSetLayout() { return _descriptorSetLayoutAt(0L); }
    public VkDescriptorUpdateTemplateCreateInfoKHR _descriptorSetLayoutAt(long index, MemorySegment src) { _descriptorSetLayoutAt(index).copyFrom(src); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR _descriptorSetLayout(MemorySegment src) { return _descriptorSetLayoutAt(0L, src); }
    public MemorySegment _pipelineBindPointAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineBindPoint, index), LAYOUT_pipelineBindPoint); }
    public MemorySegment _pipelineBindPoint() { return _pipelineBindPointAt(0L); }
    public VkDescriptorUpdateTemplateCreateInfoKHR _pipelineBindPointAt(long index, MemorySegment src) { _pipelineBindPointAt(index).copyFrom(src); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR _pipelineBindPoint(MemorySegment src) { return _pipelineBindPointAt(0L, src); }
    public MemorySegment _pipelineLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineLayout, index), LAYOUT_pipelineLayout); }
    public MemorySegment _pipelineLayout() { return _pipelineLayoutAt(0L); }
    public VkDescriptorUpdateTemplateCreateInfoKHR _pipelineLayoutAt(long index, MemorySegment src) { _pipelineLayoutAt(index).copyFrom(src); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR _pipelineLayout(MemorySegment src) { return _pipelineLayoutAt(0L, src); }
    public MemorySegment _setAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_set, index), LAYOUT_set); }
    public MemorySegment _set() { return _setAt(0L); }
    public VkDescriptorUpdateTemplateCreateInfoKHR _setAt(long index, MemorySegment src) { _setAt(index).copyFrom(src); return this; }
    public VkDescriptorUpdateTemplateCreateInfoKHR _set(MemorySegment src) { return _setAt(0L, src); }
}
