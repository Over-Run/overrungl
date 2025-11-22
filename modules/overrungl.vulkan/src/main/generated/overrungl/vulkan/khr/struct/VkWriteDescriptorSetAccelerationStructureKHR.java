// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkWriteDescriptorSetAccelerationStructureKHR`.
/// ## Layout
/// ```
/// struct VkWriteDescriptorSetAccelerationStructureKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t accelerationStructureCount;
///     const VkAccelerationStructureKHR* pAccelerationStructures;
/// }
/// ```
public final class VkWriteDescriptorSetAccelerationStructureKHR extends GroupType {
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

    public VkWriteDescriptorSetAccelerationStructureKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkWriteDescriptorSetAccelerationStructureKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSetAccelerationStructureKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkWriteDescriptorSetAccelerationStructureKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSetAccelerationStructureKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkWriteDescriptorSetAccelerationStructureKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSetAccelerationStructureKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkWriteDescriptorSetAccelerationStructureKHR alloc(SegmentAllocator allocator) { return new VkWriteDescriptorSetAccelerationStructureKHR(allocator.allocate(LAYOUT), 1); }
    public static VkWriteDescriptorSetAccelerationStructureKHR alloc(SegmentAllocator allocator, long count) { return new VkWriteDescriptorSetAccelerationStructureKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkWriteDescriptorSetAccelerationStructureKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_KHR); }
    public static VkWriteDescriptorSetAccelerationStructureKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_KHR);
        return s;
    }
    public VkWriteDescriptorSetAccelerationStructureKHR copyFrom(VkWriteDescriptorSetAccelerationStructureKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkWriteDescriptorSetAccelerationStructureKHR reinterpret(long count) { return new VkWriteDescriptorSetAccelerationStructureKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkWriteDescriptorSetAccelerationStructureKHR asSlice(long index) { return new VkWriteDescriptorSetAccelerationStructureKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkWriteDescriptorSetAccelerationStructureKHR asSlice(long index, long count) { return new VkWriteDescriptorSetAccelerationStructureKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkWriteDescriptorSetAccelerationStructureKHR at(long index, Consumer<VkWriteDescriptorSetAccelerationStructureKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int accelerationStructureCountAt(long index) { return (int) VH_accelerationStructureCount.get(this.segment(), 0L, index); }
    public MemorySegment pAccelerationStructuresAt(long index) { return (MemorySegment) VH_pAccelerationStructures.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int accelerationStructureCount() { return (int) VH_accelerationStructureCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pAccelerationStructures() { return (MemorySegment) VH_pAccelerationStructures.get(this.segment(), 0L, 0L); }
    public VkWriteDescriptorSetAccelerationStructureKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSetAccelerationStructureKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSetAccelerationStructureKHR accelerationStructureCountAt(long index, int value) { VH_accelerationStructureCount.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSetAccelerationStructureKHR pAccelerationStructuresAt(long index, MemorySegment value) { VH_pAccelerationStructures.set(this.segment(), 0L, index, value); return this; }
    public VkWriteDescriptorSetAccelerationStructureKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteDescriptorSetAccelerationStructureKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteDescriptorSetAccelerationStructureKHR accelerationStructureCount(int value) { VH_accelerationStructureCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteDescriptorSetAccelerationStructureKHR pAccelerationStructures(MemorySegment value) { VH_pAccelerationStructures.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkWriteDescriptorSetAccelerationStructureKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSetAccelerationStructureKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkWriteDescriptorSetAccelerationStructureKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSetAccelerationStructureKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _accelerationStructureCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_accelerationStructureCount, index), LAYOUT_accelerationStructureCount); }
    public MemorySegment _accelerationStructureCount() { return _accelerationStructureCountAt(0L); }
    public VkWriteDescriptorSetAccelerationStructureKHR _accelerationStructureCountAt(long index, MemorySegment src) { _accelerationStructureCountAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSetAccelerationStructureKHR _accelerationStructureCount(MemorySegment src) { return _accelerationStructureCountAt(0L, src); }
    public MemorySegment _pAccelerationStructuresAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pAccelerationStructures, index), LAYOUT_pAccelerationStructures); }
    public MemorySegment _pAccelerationStructures() { return _pAccelerationStructuresAt(0L); }
    public VkWriteDescriptorSetAccelerationStructureKHR _pAccelerationStructuresAt(long index, MemorySegment src) { _pAccelerationStructuresAt(index).copyFrom(src); return this; }
    public VkWriteDescriptorSetAccelerationStructureKHR _pAccelerationStructures(MemorySegment src) { return _pAccelerationStructuresAt(0L, src); }
}
