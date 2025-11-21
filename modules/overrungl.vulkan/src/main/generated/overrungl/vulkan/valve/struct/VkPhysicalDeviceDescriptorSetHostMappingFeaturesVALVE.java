// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.valve.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 descriptorSetHostMapping;
/// }
/// ```
public final class VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("descriptorSetHostMapping")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_descriptorSetHostMapping = LAYOUT.byteOffset(PathElement.groupElement("descriptorSetHostMapping"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_descriptorSetHostMapping = LAYOUT.select(PathElement.groupElement("descriptorSetHostMapping"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_descriptorSetHostMapping = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetHostMapping"));

    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.valve.VKVALVEDescriptorSetHostMapping.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_SET_HOST_MAPPING_FEATURES_VALVE); }
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.valve.VKVALVEDescriptorSetHostMapping.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_SET_HOST_MAPPING_FEATURES_VALVE);
        return s;
    }
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE copyFrom(VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE reinterpret(long count) { return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE asSlice(long index) { return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE asSlice(long index, long count) { return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE at(long index, Consumer<VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int descriptorSetHostMappingAt(long index) { return (int) VH_descriptorSetHostMapping.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int descriptorSetHostMapping() { return (int) VH_descriptorSetHostMapping.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE descriptorSetHostMappingAt(long index, int value) { VH_descriptorSetHostMapping.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE descriptorSetHostMapping(int value) { VH_descriptorSetHostMapping.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _descriptorSetHostMappingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorSetHostMapping, index), LAYOUT_descriptorSetHostMapping); }
    public MemorySegment _descriptorSetHostMapping() { return _descriptorSetHostMappingAt(0L); }
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE _descriptorSetHostMappingAt(long index, MemorySegment src) { _descriptorSetHostMappingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE _descriptorSetHostMapping(MemorySegment src) { return _descriptorSetHostMappingAt(0L, src); }
}
