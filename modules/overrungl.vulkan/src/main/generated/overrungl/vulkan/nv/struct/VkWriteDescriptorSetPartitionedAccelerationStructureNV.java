// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkWriteDescriptorSetPartitionedAccelerationStructureNV`.
/// ## Layout
/// ```
/// struct VkWriteDescriptorSetPartitionedAccelerationStructureNV {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t accelerationStructureCount;
///     const VkDeviceAddress* pAccelerationStructures;
/// }
/// ```
public final class VkWriteDescriptorSetPartitionedAccelerationStructureNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("accelerationStructureCount"),
        ValueLayout.ADDRESS.withName("pAccelerationStructures")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_accelerationStructureCount = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureCount"));
    public static final long OFFSET_pAccelerationStructures = LAYOUT.byteOffset(PathElement.groupElement("pAccelerationStructures"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_accelerationStructureCount = LAYOUT.select(PathElement.groupElement("accelerationStructureCount"));
    public static final MemoryLayout LAYOUT_pAccelerationStructures = LAYOUT.select(PathElement.groupElement("pAccelerationStructures"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_accelerationStructureCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureCount"));
    public static final VarHandle VH_pAccelerationStructures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAccelerationStructures"));

    public VkWriteDescriptorSetPartitionedAccelerationStructureNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSetPartitionedAccelerationStructureNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSetPartitionedAccelerationStructureNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSetPartitionedAccelerationStructureNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV alloc(SegmentAllocator allocator) { return new VkWriteDescriptorSetPartitionedAccelerationStructureNV(allocator.allocate(LAYOUT), 1); }
    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV alloc(SegmentAllocator allocator, long count) { return new VkWriteDescriptorSetPartitionedAccelerationStructureNV(allocator.allocate(LAYOUT, count), count); }
    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_PARTITIONED_ACCELERATION_STRUCTURE_NV); }
    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_PARTITIONED_ACCELERATION_STRUCTURE_NV);
        return s;
    }
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV copyFrom(VkWriteDescriptorSetPartitionedAccelerationStructureNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV reinterpret(long count) { return new VkWriteDescriptorSetPartitionedAccelerationStructureNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV asSlice(long index) { return new VkWriteDescriptorSetPartitionedAccelerationStructureNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV asSlice(long index, long count) { return new VkWriteDescriptorSetPartitionedAccelerationStructureNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV at(long index, Consumer<VkWriteDescriptorSetPartitionedAccelerationStructureNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int accelerationStructureCountAt(long index) { return (int) VH_accelerationStructureCount.get(this.segment(), 0L, index); }
    public MemorySegment pAccelerationStructuresAt(long index) { return (MemorySegment) VH_pAccelerationStructures.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int accelerationStructureCount() { return (int) VH_accelerationStructureCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pAccelerationStructures() { return (MemorySegment) VH_pAccelerationStructures.get(this.segment(), 0L, 0L); }
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV accelerationStructureCountAt(long index, int value) { VH_accelerationStructureCount.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV pAccelerationStructuresAt(long index, MemorySegment value) { VH_pAccelerationStructures.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV accelerationStructureCount(int value) { VH_accelerationStructureCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV pAccelerationStructures(MemorySegment value) { VH_pAccelerationStructures.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _accelerationStructureCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_accelerationStructureCount, index), LAYOUT_accelerationStructureCount); }
    public MemorySegment _accelerationStructureCount() { return _accelerationStructureCountAt(0L); }
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV _accelerationStructureCountAt(long index, MemorySegment src) { _accelerationStructureCountAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV _accelerationStructureCount(MemorySegment src) { return _accelerationStructureCountAt(0L, src); }
    public MemorySegment _pAccelerationStructuresAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pAccelerationStructures, index), LAYOUT_pAccelerationStructures); }
    public MemorySegment _pAccelerationStructures() { return _pAccelerationStructuresAt(0L); }
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV _pAccelerationStructuresAt(long index, MemorySegment src) { _pAccelerationStructuresAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV _pAccelerationStructures(MemorySegment src) { return _pAccelerationStructuresAt(0L, src); }
}
