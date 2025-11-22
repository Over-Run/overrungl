// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePerStageDescriptorSetFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePerStageDescriptorSetFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 perStageDescriptorSet;
///     VkBool32 dynamicPipelineLayout;
/// }
/// ```
public final class VkPhysicalDevicePerStageDescriptorSetFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("perStageDescriptorSet"),
        ValueLayout.JAVA_INT.withName("dynamicPipelineLayout")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_perStageDescriptorSet = LAYOUT.byteOffset(PathElement.groupElement("perStageDescriptorSet"));
    public static final long OFFSET_dynamicPipelineLayout = LAYOUT.byteOffset(PathElement.groupElement("dynamicPipelineLayout"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_perStageDescriptorSet = LAYOUT.select(PathElement.groupElement("perStageDescriptorSet"));
    public static final MemoryLayout LAYOUT_dynamicPipelineLayout = LAYOUT.select(PathElement.groupElement("dynamicPipelineLayout"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_perStageDescriptorSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("perStageDescriptorSet"));
    public static final VarHandle VH_dynamicPipelineLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicPipelineLayout"));

    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVPerStageDescriptorSet.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PER_STAGE_DESCRIPTOR_SET_FEATURES_NV); }
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVPerStageDescriptorSet.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PER_STAGE_DESCRIPTOR_SET_FEATURES_NV);
        return s;
    }
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV copyFrom(VkPhysicalDevicePerStageDescriptorSetFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV reinterpret(long count) { return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV asSlice(long index) { return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV asSlice(long index, long count) { return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV at(long index, Consumer<VkPhysicalDevicePerStageDescriptorSetFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int perStageDescriptorSetAt(long index) { return (int) VH_perStageDescriptorSet.get(this.segment(), 0L, index); }
    public int dynamicPipelineLayoutAt(long index) { return (int) VH_dynamicPipelineLayout.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int perStageDescriptorSet() { return (int) VH_perStageDescriptorSet.get(this.segment(), 0L, 0L); }
    public int dynamicPipelineLayout() { return (int) VH_dynamicPipelineLayout.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV perStageDescriptorSetAt(long index, int value) { VH_perStageDescriptorSet.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV dynamicPipelineLayoutAt(long index, int value) { VH_dynamicPipelineLayout.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV perStageDescriptorSet(int value) { VH_perStageDescriptorSet.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV dynamicPipelineLayout(int value) { VH_dynamicPipelineLayout.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _perStageDescriptorSetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_perStageDescriptorSet, index), LAYOUT_perStageDescriptorSet); }
    public MemorySegment _perStageDescriptorSet() { return _perStageDescriptorSetAt(0L); }
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV _perStageDescriptorSetAt(long index, MemorySegment src) { _perStageDescriptorSetAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV _perStageDescriptorSet(MemorySegment src) { return _perStageDescriptorSetAt(0L, src); }
    public MemorySegment _dynamicPipelineLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dynamicPipelineLayout, index), LAYOUT_dynamicPipelineLayout); }
    public MemorySegment _dynamicPipelineLayout() { return _dynamicPipelineLayoutAt(0L); }
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV _dynamicPipelineLayoutAt(long index, MemorySegment src) { _dynamicPipelineLayoutAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV _dynamicPipelineLayout(MemorySegment src) { return _dynamicPipelineLayoutAt(0L, src); }
}
