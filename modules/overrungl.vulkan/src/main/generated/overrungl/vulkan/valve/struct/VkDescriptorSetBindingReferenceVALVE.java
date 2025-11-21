// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.valve.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorSetBindingReferenceVALVE`.
/// ## Layout
/// ```
/// struct VkDescriptorSetBindingReferenceVALVE {
///     VkStructureType sType;
///     const void* pNext;
///     VkDescriptorSetLayout descriptorSetLayout;
///     uint32_t binding;
/// }
/// ```
public final class VkDescriptorSetBindingReferenceVALVE extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("descriptorSetLayout"),
        ValueLayout.JAVA_INT.withName("binding")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_descriptorSetLayout = LAYOUT.byteOffset(PathElement.groupElement("descriptorSetLayout"));
    public static final long OFFSET_binding = LAYOUT.byteOffset(PathElement.groupElement("binding"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_descriptorSetLayout = LAYOUT.select(PathElement.groupElement("descriptorSetLayout"));
    public static final MemoryLayout LAYOUT_binding = LAYOUT.select(PathElement.groupElement("binding"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_descriptorSetLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetLayout"));
    public static final VarHandle VH_binding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding"));

    public VkDescriptorSetBindingReferenceVALVE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDescriptorSetBindingReferenceVALVE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetBindingReferenceVALVE(segment, estimateCount(segment, LAYOUT)); }
    public static VkDescriptorSetBindingReferenceVALVE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetBindingReferenceVALVE(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDescriptorSetBindingReferenceVALVE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetBindingReferenceVALVE(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDescriptorSetBindingReferenceVALVE alloc(SegmentAllocator allocator) { return new VkDescriptorSetBindingReferenceVALVE(allocator.allocate(LAYOUT), 1); }
    public static VkDescriptorSetBindingReferenceVALVE alloc(SegmentAllocator allocator, long count) { return new VkDescriptorSetBindingReferenceVALVE(allocator.allocate(LAYOUT, count), count); }
    public static VkDescriptorSetBindingReferenceVALVE allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.valve.VKVALVEDescriptorSetHostMapping.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_BINDING_REFERENCE_VALVE); }
    public static VkDescriptorSetBindingReferenceVALVE allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.valve.VKVALVEDescriptorSetHostMapping.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_BINDING_REFERENCE_VALVE);
        return s;
    }
    public VkDescriptorSetBindingReferenceVALVE copyFrom(VkDescriptorSetBindingReferenceVALVE src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDescriptorSetBindingReferenceVALVE reinterpret(long count) { return new VkDescriptorSetBindingReferenceVALVE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDescriptorSetBindingReferenceVALVE asSlice(long index) { return new VkDescriptorSetBindingReferenceVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDescriptorSetBindingReferenceVALVE asSlice(long index, long count) { return new VkDescriptorSetBindingReferenceVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDescriptorSetBindingReferenceVALVE at(long index, Consumer<VkDescriptorSetBindingReferenceVALVE> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long descriptorSetLayoutAt(long index) { return (long) VH_descriptorSetLayout.get(this.segment(), 0L, index); }
    public int bindingAt(long index) { return (int) VH_binding.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long descriptorSetLayout() { return (long) VH_descriptorSetLayout.get(this.segment(), 0L, 0L); }
    public int binding() { return (int) VH_binding.get(this.segment(), 0L, 0L); }
    public VkDescriptorSetBindingReferenceVALVE sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetBindingReferenceVALVE pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetBindingReferenceVALVE descriptorSetLayoutAt(long index, long value) { VH_descriptorSetLayout.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetBindingReferenceVALVE bindingAt(long index, int value) { VH_binding.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetBindingReferenceVALVE sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetBindingReferenceVALVE pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetBindingReferenceVALVE descriptorSetLayout(long value) { VH_descriptorSetLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetBindingReferenceVALVE binding(int value) { VH_binding.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDescriptorSetBindingReferenceVALVE _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDescriptorSetBindingReferenceVALVE _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDescriptorSetBindingReferenceVALVE _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDescriptorSetBindingReferenceVALVE _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _descriptorSetLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorSetLayout, index), LAYOUT_descriptorSetLayout); }
    public MemorySegment _descriptorSetLayout() { return _descriptorSetLayoutAt(0L); }
    public VkDescriptorSetBindingReferenceVALVE _descriptorSetLayoutAt(long index, MemorySegment src) { _descriptorSetLayoutAt(index).copyFrom(src); return this; }
    public VkDescriptorSetBindingReferenceVALVE _descriptorSetLayout(MemorySegment src) { return _descriptorSetLayoutAt(0L, src); }
    public MemorySegment _bindingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_binding, index), LAYOUT_binding); }
    public MemorySegment _binding() { return _bindingAt(0L); }
    public VkDescriptorSetBindingReferenceVALVE _bindingAt(long index, MemorySegment src) { _bindingAt(index).copyFrom(src); return this; }
    public VkDescriptorSetBindingReferenceVALVE _binding(MemorySegment src) { return _bindingAt(0L, src); }
}
