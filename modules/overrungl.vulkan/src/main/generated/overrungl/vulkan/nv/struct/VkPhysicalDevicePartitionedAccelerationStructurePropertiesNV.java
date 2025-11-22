// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxPartitionCount;
/// }
/// ```
public final class VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxPartitionCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxPartitionCount = LAYOUT.byteOffset(PathElement.groupElement("maxPartitionCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxPartitionCount = LAYOUT.select(PathElement.groupElement("maxPartitionCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxPartitionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPartitionCount"));

    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_PROPERTIES_NV); }
    public static VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_PROPERTIES_NV);
        return s;
    }
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV copyFrom(VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV reinterpret(long count) { return new VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV asSlice(long index) { return new VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV asSlice(long index, long count) { return new VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV at(long index, Consumer<VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxPartitionCountAt(long index) { return (int) VH_maxPartitionCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxPartitionCount() { return (int) VH_maxPartitionCount.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV maxPartitionCountAt(long index, int value) { VH_maxPartitionCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV maxPartitionCount(int value) { VH_maxPartitionCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxPartitionCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPartitionCount, index), LAYOUT_maxPartitionCount); }
    public MemorySegment _maxPartitionCount() { return _maxPartitionCountAt(0L); }
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV _maxPartitionCountAt(long index, MemorySegment src) { _maxPartitionCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV _maxPartitionCount(MemorySegment src) { return _maxPartitionCountAt(0L, src); }
}
