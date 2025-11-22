// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceClusterAccelerationStructureFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceClusterAccelerationStructureFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 clusterAccelerationStructure;
/// }
/// ```
public final class VkPhysicalDeviceClusterAccelerationStructureFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("clusterAccelerationStructure")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_clusterAccelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("clusterAccelerationStructure"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_clusterAccelerationStructure = LAYOUT.select(PathElement.groupElement("clusterAccelerationStructure"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_clusterAccelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterAccelerationStructure"));

    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVClusterAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_FEATURES_NV); }
    public static VkPhysicalDeviceClusterAccelerationStructureFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVClusterAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV copyFrom(VkPhysicalDeviceClusterAccelerationStructureFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV asSlice(long index) { return new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceClusterAccelerationStructureFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV at(long index, Consumer<VkPhysicalDeviceClusterAccelerationStructureFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int clusterAccelerationStructureAt(long index) { return (int) VH_clusterAccelerationStructure.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int clusterAccelerationStructure() { return (int) VH_clusterAccelerationStructure.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV clusterAccelerationStructureAt(long index, int value) { VH_clusterAccelerationStructure.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV clusterAccelerationStructure(int value) { VH_clusterAccelerationStructure.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _clusterAccelerationStructureAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_clusterAccelerationStructure, index), LAYOUT_clusterAccelerationStructure); }
    public MemorySegment _clusterAccelerationStructure() { return _clusterAccelerationStructureAt(0L); }
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV _clusterAccelerationStructureAt(long index, MemorySegment src) { _clusterAccelerationStructureAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterAccelerationStructureFeaturesNV _clusterAccelerationStructure(MemorySegment src) { return _clusterAccelerationStructureAt(0L, src); }
}
