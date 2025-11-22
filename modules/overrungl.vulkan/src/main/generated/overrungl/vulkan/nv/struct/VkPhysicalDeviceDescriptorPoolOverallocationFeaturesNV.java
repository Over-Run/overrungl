// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 descriptorPoolOverallocation;
/// }
/// ```
public final class VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("descriptorPoolOverallocation")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_descriptorPoolOverallocation = LAYOUT.byteOffset(PathElement.groupElement("descriptorPoolOverallocation"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_descriptorPoolOverallocation = LAYOUT.select(PathElement.groupElement("descriptorPoolOverallocation"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_descriptorPoolOverallocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorPoolOverallocation"));

    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVDescriptorPoolOverallocation.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_POOL_OVERALLOCATION_FEATURES_NV); }
    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVDescriptorPoolOverallocation.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_POOL_OVERALLOCATION_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV copyFrom(VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV asSlice(long index) { return new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV at(long index, Consumer<VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int descriptorPoolOverallocationAt(long index) { return (int) VH_descriptorPoolOverallocation.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int descriptorPoolOverallocation() { return (int) VH_descriptorPoolOverallocation.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV descriptorPoolOverallocationAt(long index, int value) { VH_descriptorPoolOverallocation.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV descriptorPoolOverallocation(int value) { VH_descriptorPoolOverallocation.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _descriptorPoolOverallocationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorPoolOverallocation, index), LAYOUT_descriptorPoolOverallocation); }
    public MemorySegment _descriptorPoolOverallocation() { return _descriptorPoolOverallocationAt(0L); }
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV _descriptorPoolOverallocationAt(long index, MemorySegment src) { _descriptorPoolOverallocationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV _descriptorPoolOverallocation(MemorySegment src) { return _descriptorPoolOverallocationAt(0L, src); }
}
