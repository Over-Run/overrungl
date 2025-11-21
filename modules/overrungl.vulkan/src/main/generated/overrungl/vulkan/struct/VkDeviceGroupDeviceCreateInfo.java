// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceGroupDeviceCreateInfo`.
/// ## Layout
/// ```
/// struct VkDeviceGroupDeviceCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t physicalDeviceCount;
///     const VkPhysicalDevice* pPhysicalDevices;
/// }
/// ```
public final class VkDeviceGroupDeviceCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("physicalDeviceCount"),
        ValueLayout.ADDRESS.withName("pPhysicalDevices")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_physicalDeviceCount = LAYOUT.byteOffset(PathElement.groupElement("physicalDeviceCount"));
    public static final long OFFSET_pPhysicalDevices = LAYOUT.byteOffset(PathElement.groupElement("pPhysicalDevices"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_physicalDeviceCount = LAYOUT.select(PathElement.groupElement("physicalDeviceCount"));
    public static final MemoryLayout LAYOUT_pPhysicalDevices = LAYOUT.select(PathElement.groupElement("pPhysicalDevices"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_physicalDeviceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("physicalDeviceCount"));
    public static final VarHandle VH_pPhysicalDevices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPhysicalDevices"));

    public VkDeviceGroupDeviceCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceGroupDeviceCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupDeviceCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceGroupDeviceCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupDeviceCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceGroupDeviceCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupDeviceCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceGroupDeviceCreateInfo alloc(SegmentAllocator allocator) { return new VkDeviceGroupDeviceCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceGroupDeviceCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkDeviceGroupDeviceCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceGroupDeviceCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO); }
    public static VkDeviceGroupDeviceCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO);
        return s;
    }
    public VkDeviceGroupDeviceCreateInfo copyFrom(VkDeviceGroupDeviceCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceGroupDeviceCreateInfo reinterpret(long count) { return new VkDeviceGroupDeviceCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceGroupDeviceCreateInfo asSlice(long index) { return new VkDeviceGroupDeviceCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceGroupDeviceCreateInfo asSlice(long index, long count) { return new VkDeviceGroupDeviceCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceGroupDeviceCreateInfo at(long index, Consumer<VkDeviceGroupDeviceCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int physicalDeviceCountAt(long index) { return (int) VH_physicalDeviceCount.get(this.segment(), 0L, index); }
    public MemorySegment pPhysicalDevicesAt(long index) { return (MemorySegment) VH_pPhysicalDevices.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int physicalDeviceCount() { return (int) VH_physicalDeviceCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pPhysicalDevices() { return (MemorySegment) VH_pPhysicalDevices.get(this.segment(), 0L, 0L); }
    public VkDeviceGroupDeviceCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupDeviceCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupDeviceCreateInfo physicalDeviceCountAt(long index, int value) { VH_physicalDeviceCount.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupDeviceCreateInfo pPhysicalDevicesAt(long index, MemorySegment value) { VH_pPhysicalDevices.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupDeviceCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupDeviceCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupDeviceCreateInfo physicalDeviceCount(int value) { VH_physicalDeviceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupDeviceCreateInfo pPhysicalDevices(MemorySegment value) { VH_pPhysicalDevices.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceGroupDeviceCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceGroupDeviceCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceGroupDeviceCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceGroupDeviceCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _physicalDeviceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_physicalDeviceCount, index), LAYOUT_physicalDeviceCount); }
    public MemorySegment _physicalDeviceCount() { return _physicalDeviceCountAt(0L); }
    public VkDeviceGroupDeviceCreateInfo _physicalDeviceCountAt(long index, MemorySegment src) { _physicalDeviceCountAt(index).copyFrom(src); return this; }
    public VkDeviceGroupDeviceCreateInfo _physicalDeviceCount(MemorySegment src) { return _physicalDeviceCountAt(0L, src); }
    public MemorySegment _pPhysicalDevicesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPhysicalDevices, index), LAYOUT_pPhysicalDevices); }
    public MemorySegment _pPhysicalDevices() { return _pPhysicalDevicesAt(0L); }
    public VkDeviceGroupDeviceCreateInfo _pPhysicalDevicesAt(long index, MemorySegment src) { _pPhysicalDevicesAt(index).copyFrom(src); return this; }
    public VkDeviceGroupDeviceCreateInfo _pPhysicalDevices(MemorySegment src) { return _pPhysicalDevicesAt(0L, src); }
}
