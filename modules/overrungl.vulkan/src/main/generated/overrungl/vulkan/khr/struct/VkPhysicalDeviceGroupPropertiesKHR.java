// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceGroupPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceGroupPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t physicalDeviceCount;
///     VkPhysicalDevice physicalDevices[VK_MAX_DEVICE_GROUP_SIZE];
///     VkBool32 subsetAllocation;
/// }
/// ```
public final class VkPhysicalDeviceGroupPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("physicalDeviceCount"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK11.VK_MAX_DEVICE_GROUP_SIZE, ValueLayout.ADDRESS).withName("physicalDevices"),
        ValueLayout.JAVA_INT.withName("subsetAllocation")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_physicalDeviceCount = LAYOUT.byteOffset(PathElement.groupElement("physicalDeviceCount"));
    public static final long OFFSET_physicalDevices = LAYOUT.byteOffset(PathElement.groupElement("physicalDevices"));
    public static final long OFFSET_subsetAllocation = LAYOUT.byteOffset(PathElement.groupElement("subsetAllocation"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_physicalDeviceCount = LAYOUT.select(PathElement.groupElement("physicalDeviceCount"));
    public static final MemoryLayout LAYOUT_physicalDevices = LAYOUT.select(PathElement.groupElement("physicalDevices"));
    public static final MemoryLayout LAYOUT_subsetAllocation = LAYOUT.select(PathElement.groupElement("subsetAllocation"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_physicalDeviceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("physicalDeviceCount"));
    public static final VarHandle VH_physicalDevices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("physicalDevices"), PathElement.sequenceElement());
    public static final VarHandle VH_subsetAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subsetAllocation"));

    public VkPhysicalDeviceGroupPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceGroupPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceGroupPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceGroupPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceGroupPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceGroupPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceGroupPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceGroupPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceGroupPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceGroupPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceGroupPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceGroupPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES); }
    public static VkPhysicalDeviceGroupPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceGroupPropertiesKHR copyFrom(VkPhysicalDeviceGroupPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceGroupPropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceGroupPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceGroupPropertiesKHR asSlice(long index) { return new VkPhysicalDeviceGroupPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceGroupPropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceGroupPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceGroupPropertiesKHR at(long index, Consumer<VkPhysicalDeviceGroupPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int physicalDeviceCountAt(long index) { return (int) VH_physicalDeviceCount.get(this.segment(), 0L, index); }
    public MemorySegment physicalDevicesAt(long index, long index0) { return (MemorySegment) VH_physicalDevices.get(this.segment(), 0L, index, index0); }
    public int subsetAllocationAt(long index) { return (int) VH_subsetAllocation.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int physicalDeviceCount() { return (int) VH_physicalDeviceCount.get(this.segment(), 0L, 0L); }
    public MemorySegment physicalDevices(long index0) { return (MemorySegment) VH_physicalDevices.get(this.segment(), 0L, 0L, index0); }
    public int subsetAllocation() { return (int) VH_subsetAllocation.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceGroupPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceGroupPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceGroupPropertiesKHR physicalDeviceCountAt(long index, int value) { VH_physicalDeviceCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceGroupPropertiesKHR physicalDevicesAt(long index, long index0, MemorySegment value) { VH_physicalDevices.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceGroupPropertiesKHR subsetAllocationAt(long index, int value) { VH_subsetAllocation.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceGroupPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceGroupPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceGroupPropertiesKHR physicalDeviceCount(int value) { VH_physicalDeviceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceGroupPropertiesKHR physicalDevices(long index0, MemorySegment value) { VH_physicalDevices.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceGroupPropertiesKHR subsetAllocation(int value) { VH_subsetAllocation.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceGroupPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceGroupPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceGroupPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceGroupPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _physicalDeviceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_physicalDeviceCount, index), LAYOUT_physicalDeviceCount); }
    public MemorySegment _physicalDeviceCount() { return _physicalDeviceCountAt(0L); }
    public VkPhysicalDeviceGroupPropertiesKHR _physicalDeviceCountAt(long index, MemorySegment src) { _physicalDeviceCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceGroupPropertiesKHR _physicalDeviceCount(MemorySegment src) { return _physicalDeviceCountAt(0L, src); }
    public MemorySegment _physicalDevicesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_physicalDevices, index), LAYOUT_physicalDevices); }
    public MemorySegment _physicalDevices() { return _physicalDevicesAt(0L); }
    public VkPhysicalDeviceGroupPropertiesKHR _physicalDevicesAt(long index, MemorySegment src) { _physicalDevicesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceGroupPropertiesKHR _physicalDevices(MemorySegment src) { return _physicalDevicesAt(0L, src); }
    public MemorySegment _subsetAllocationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subsetAllocation, index), LAYOUT_subsetAllocation); }
    public MemorySegment _subsetAllocation() { return _subsetAllocationAt(0L); }
    public VkPhysicalDeviceGroupPropertiesKHR _subsetAllocationAt(long index, MemorySegment src) { _subsetAllocationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceGroupPropertiesKHR _subsetAllocation(MemorySegment src) { return _subsetAllocationAt(0L, src); }
}
