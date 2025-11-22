// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceGroupProperties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceGroupProperties {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t physicalDeviceCount;
///     VkPhysicalDevice physicalDevices[VK_MAX_DEVICE_GROUP_SIZE];
///     VkBool32 subsetAllocation;
/// }
/// ```
public final class VkPhysicalDeviceGroupProperties extends GroupType {
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

    public VkPhysicalDeviceGroupProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceGroupProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceGroupProperties(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceGroupProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceGroupProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceGroupProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceGroupProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceGroupProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceGroupProperties(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceGroupProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceGroupProperties(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceGroupProperties allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES); }
    public static VkPhysicalDeviceGroupProperties allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceGroupProperties copyFrom(VkPhysicalDeviceGroupProperties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceGroupProperties reinterpret(long count) { return new VkPhysicalDeviceGroupProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceGroupProperties asSlice(long index) { return new VkPhysicalDeviceGroupProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceGroupProperties asSlice(long index, long count) { return new VkPhysicalDeviceGroupProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceGroupProperties at(long index, Consumer<VkPhysicalDeviceGroupProperties> func) { func.accept(asSlice(index)); return this; }
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
    public VkPhysicalDeviceGroupProperties sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceGroupProperties pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceGroupProperties physicalDeviceCountAt(long index, int value) { VH_physicalDeviceCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceGroupProperties physicalDevicesAt(long index, long index0, MemorySegment value) { VH_physicalDevices.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceGroupProperties subsetAllocationAt(long index, int value) { VH_subsetAllocation.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceGroupProperties sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceGroupProperties pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceGroupProperties physicalDeviceCount(int value) { VH_physicalDeviceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceGroupProperties physicalDevices(long index0, MemorySegment value) { VH_physicalDevices.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceGroupProperties subsetAllocation(int value) { VH_subsetAllocation.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceGroupProperties _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceGroupProperties _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceGroupProperties _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceGroupProperties _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _physicalDeviceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_physicalDeviceCount, index), LAYOUT_physicalDeviceCount); }
    public MemorySegment _physicalDeviceCount() { return _physicalDeviceCountAt(0L); }
    public VkPhysicalDeviceGroupProperties _physicalDeviceCountAt(long index, MemorySegment src) { _physicalDeviceCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceGroupProperties _physicalDeviceCount(MemorySegment src) { return _physicalDeviceCountAt(0L, src); }
    public MemorySegment _physicalDevicesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_physicalDevices, index), LAYOUT_physicalDevices); }
    public MemorySegment _physicalDevices() { return _physicalDevicesAt(0L); }
    public VkPhysicalDeviceGroupProperties _physicalDevicesAt(long index, MemorySegment src) { _physicalDevicesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceGroupProperties _physicalDevices(MemorySegment src) { return _physicalDevicesAt(0L, src); }
    public MemorySegment _subsetAllocationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subsetAllocation, index), LAYOUT_subsetAllocation); }
    public MemorySegment _subsetAllocation() { return _subsetAllocationAt(0L); }
    public VkPhysicalDeviceGroupProperties _subsetAllocationAt(long index, MemorySegment src) { _subsetAllocationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceGroupProperties _subsetAllocation(MemorySegment src) { return _subsetAllocationAt(0L, src); }
}
