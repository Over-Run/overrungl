// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorSetLayoutBinding`.
/// ## Layout
/// ```
/// struct VkDescriptorSetLayoutBinding {
///     uint32_t binding;
///     VkDescriptorType descriptorType;
///     uint32_t descriptorCount;
///     VkShaderStageFlags stageFlags;
///     const VkSampler* pImmutableSamplers;
/// }
/// ```
public final class VkDescriptorSetLayoutBinding extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("descriptorType"),
        ValueLayout.JAVA_INT.withName("descriptorCount"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.ADDRESS.withName("pImmutableSamplers")
    );
    public static final long OFFSET_binding = LAYOUT.byteOffset(PathElement.groupElement("binding"));
    public static final long OFFSET_descriptorType = LAYOUT.byteOffset(PathElement.groupElement("descriptorType"));
    public static final long OFFSET_descriptorCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorCount"));
    public static final long OFFSET_stageFlags = LAYOUT.byteOffset(PathElement.groupElement("stageFlags"));
    public static final long OFFSET_pImmutableSamplers = LAYOUT.byteOffset(PathElement.groupElement("pImmutableSamplers"));
    public static final MemoryLayout LAYOUT_binding = LAYOUT.select(PathElement.groupElement("binding"));
    public static final MemoryLayout LAYOUT_descriptorType = LAYOUT.select(PathElement.groupElement("descriptorType"));
    public static final MemoryLayout LAYOUT_descriptorCount = LAYOUT.select(PathElement.groupElement("descriptorCount"));
    public static final MemoryLayout LAYOUT_stageFlags = LAYOUT.select(PathElement.groupElement("stageFlags"));
    public static final MemoryLayout LAYOUT_pImmutableSamplers = LAYOUT.select(PathElement.groupElement("pImmutableSamplers"));
    public static final VarHandle VH_binding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding"));
    public static final VarHandle VH_descriptorType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorType"));
    public static final VarHandle VH_descriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorCount"));
    public static final VarHandle VH_stageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageFlags"));
    public static final VarHandle VH_pImmutableSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImmutableSamplers"));

    public VkDescriptorSetLayoutBinding(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDescriptorSetLayoutBinding of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutBinding(segment, estimateCount(segment, LAYOUT)); }
    public static VkDescriptorSetLayoutBinding ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutBinding(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDescriptorSetLayoutBinding ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutBinding(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDescriptorSetLayoutBinding alloc(SegmentAllocator allocator) { return new VkDescriptorSetLayoutBinding(allocator.allocate(LAYOUT), 1); }
    public static VkDescriptorSetLayoutBinding alloc(SegmentAllocator allocator, long count) { return new VkDescriptorSetLayoutBinding(allocator.allocate(LAYOUT, count), count); }
    public VkDescriptorSetLayoutBinding copyFrom(VkDescriptorSetLayoutBinding src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDescriptorSetLayoutBinding reinterpret(long count) { return new VkDescriptorSetLayoutBinding(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDescriptorSetLayoutBinding asSlice(long index) { return new VkDescriptorSetLayoutBinding(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDescriptorSetLayoutBinding asSlice(long index, long count) { return new VkDescriptorSetLayoutBinding(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDescriptorSetLayoutBinding at(long index, Consumer<VkDescriptorSetLayoutBinding> func) { func.accept(asSlice(index)); return this; }
    public int bindingAt(long index) { return (int) VH_binding.get(this.segment(), 0L, index); }
    public int descriptorTypeAt(long index) { return (int) VH_descriptorType.get(this.segment(), 0L, index); }
    public int descriptorCountAt(long index) { return (int) VH_descriptorCount.get(this.segment(), 0L, index); }
    public int stageFlagsAt(long index) { return (int) VH_stageFlags.get(this.segment(), 0L, index); }
    public MemorySegment pImmutableSamplersAt(long index) { return (MemorySegment) VH_pImmutableSamplers.get(this.segment(), 0L, index); }
    public int binding() { return (int) VH_binding.get(this.segment(), 0L, 0L); }
    public int descriptorType() { return (int) VH_descriptorType.get(this.segment(), 0L, 0L); }
    public int descriptorCount() { return (int) VH_descriptorCount.get(this.segment(), 0L, 0L); }
    public int stageFlags() { return (int) VH_stageFlags.get(this.segment(), 0L, 0L); }
    public MemorySegment pImmutableSamplers() { return (MemorySegment) VH_pImmutableSamplers.get(this.segment(), 0L, 0L); }
    public VkDescriptorSetLayoutBinding bindingAt(long index, int value) { VH_binding.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetLayoutBinding descriptorTypeAt(long index, int value) { VH_descriptorType.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetLayoutBinding descriptorCountAt(long index, int value) { VH_descriptorCount.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetLayoutBinding stageFlagsAt(long index, int value) { VH_stageFlags.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetLayoutBinding pImmutableSamplersAt(long index, MemorySegment value) { VH_pImmutableSamplers.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetLayoutBinding binding(int value) { VH_binding.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetLayoutBinding descriptorType(int value) { VH_descriptorType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetLayoutBinding descriptorCount(int value) { VH_descriptorCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetLayoutBinding stageFlags(int value) { VH_stageFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetLayoutBinding pImmutableSamplers(MemorySegment value) { VH_pImmutableSamplers.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _bindingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_binding, index), LAYOUT_binding); }
    public MemorySegment _binding() { return _bindingAt(0L); }
    public VkDescriptorSetLayoutBinding _bindingAt(long index, MemorySegment src) { _bindingAt(index).copyFrom(src); return this; }
    public VkDescriptorSetLayoutBinding _binding(MemorySegment src) { return _bindingAt(0L, src); }
    public MemorySegment _descriptorTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorType, index), LAYOUT_descriptorType); }
    public MemorySegment _descriptorType() { return _descriptorTypeAt(0L); }
    public VkDescriptorSetLayoutBinding _descriptorTypeAt(long index, MemorySegment src) { _descriptorTypeAt(index).copyFrom(src); return this; }
    public VkDescriptorSetLayoutBinding _descriptorType(MemorySegment src) { return _descriptorTypeAt(0L, src); }
    public MemorySegment _descriptorCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorCount, index), LAYOUT_descriptorCount); }
    public MemorySegment _descriptorCount() { return _descriptorCountAt(0L); }
    public VkDescriptorSetLayoutBinding _descriptorCountAt(long index, MemorySegment src) { _descriptorCountAt(index).copyFrom(src); return this; }
    public VkDescriptorSetLayoutBinding _descriptorCount(MemorySegment src) { return _descriptorCountAt(0L, src); }
    public MemorySegment _stageFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stageFlags, index), LAYOUT_stageFlags); }
    public MemorySegment _stageFlags() { return _stageFlagsAt(0L); }
    public VkDescriptorSetLayoutBinding _stageFlagsAt(long index, MemorySegment src) { _stageFlagsAt(index).copyFrom(src); return this; }
    public VkDescriptorSetLayoutBinding _stageFlags(MemorySegment src) { return _stageFlagsAt(0L, src); }
    public MemorySegment _pImmutableSamplersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pImmutableSamplers, index), LAYOUT_pImmutableSamplers); }
    public MemorySegment _pImmutableSamplers() { return _pImmutableSamplersAt(0L); }
    public VkDescriptorSetLayoutBinding _pImmutableSamplersAt(long index, MemorySegment src) { _pImmutableSamplersAt(index).copyFrom(src); return this; }
    public VkDescriptorSetLayoutBinding _pImmutableSamplers(MemorySegment src) { return _pImmutableSamplersAt(0L, src); }
}
