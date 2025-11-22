// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 partitionedAccelerationStructure;
/// }
/// ```
public final class VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("partitionedAccelerationStructure")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_partitionedAccelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("partitionedAccelerationStructure"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_partitionedAccelerationStructure = LAYOUT.select(PathElement.groupElement("partitionedAccelerationStructure"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_partitionedAccelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("partitionedAccelerationStructure"));

    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_FEATURES_NV); }
    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_FEATURES_NV);
        return s;
    }
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV copyFrom(VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV reinterpret(long count) { return new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV asSlice(long index) { return new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV asSlice(long index, long count) { return new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV at(long index, Consumer<VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int partitionedAccelerationStructureAt(long index) { return (int) VH_partitionedAccelerationStructure.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int partitionedAccelerationStructure() { return (int) VH_partitionedAccelerationStructure.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV partitionedAccelerationStructureAt(long index, int value) { VH_partitionedAccelerationStructure.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV partitionedAccelerationStructure(int value) { VH_partitionedAccelerationStructure.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _partitionedAccelerationStructureAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_partitionedAccelerationStructure, index), LAYOUT_partitionedAccelerationStructure); }
    public MemorySegment _partitionedAccelerationStructure() { return _partitionedAccelerationStructureAt(0L); }
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV _partitionedAccelerationStructureAt(long index, MemorySegment src) { _partitionedAccelerationStructureAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV _partitionedAccelerationStructure(MemorySegment src) { return _partitionedAccelerationStructureAt(0L, src); }
}
