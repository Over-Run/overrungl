// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceLayeredApiPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceLayeredApiPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t vendorID;
///     uint32_t deviceID;
///     VkPhysicalDeviceLayeredApiKHR layeredAPI;
///     char deviceName[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE];
/// }
/// ```
public final class VkPhysicalDeviceLayeredApiPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        ValueLayout.JAVA_INT.withName("layeredAPI"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_PHYSICAL_DEVICE_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("deviceName")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_vendorID = LAYOUT.byteOffset(PathElement.groupElement("vendorID"));
    public static final long OFFSET_deviceID = LAYOUT.byteOffset(PathElement.groupElement("deviceID"));
    public static final long OFFSET_layeredAPI = LAYOUT.byteOffset(PathElement.groupElement("layeredAPI"));
    public static final long OFFSET_deviceName = LAYOUT.byteOffset(PathElement.groupElement("deviceName"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_vendorID = LAYOUT.select(PathElement.groupElement("vendorID"));
    public static final MemoryLayout LAYOUT_deviceID = LAYOUT.select(PathElement.groupElement("deviceID"));
    public static final MemoryLayout LAYOUT_layeredAPI = LAYOUT.select(PathElement.groupElement("layeredAPI"));
    public static final MemoryLayout LAYOUT_deviceName = LAYOUT.select(PathElement.groupElement("deviceName"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_vendorID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorID"));
    public static final VarHandle VH_deviceID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceID"));
    public static final VarHandle VH_layeredAPI = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layeredAPI"));
    public static final VarHandle VH_deviceName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceName"), PathElement.sequenceElement());

    public VkPhysicalDeviceLayeredApiPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceLayeredApiPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredApiPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceLayeredApiPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredApiPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceLayeredApiPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredApiPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceLayeredApiPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLayeredApiPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceLayeredApiPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceLayeredApiPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceLayeredApiPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR); }
    public static VkPhysicalDeviceLayeredApiPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR);
        return s;
    }
    public VkPhysicalDeviceLayeredApiPropertiesKHR copyFrom(VkPhysicalDeviceLayeredApiPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceLayeredApiPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceLayeredApiPropertiesKHR asSlice(long index) { return new VkPhysicalDeviceLayeredApiPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceLayeredApiPropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceLayeredApiPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceLayeredApiPropertiesKHR at(long index, Consumer<VkPhysicalDeviceLayeredApiPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int vendorIDAt(long index) { return (int) VH_vendorID.get(this.segment(), 0L, index); }
    public int deviceIDAt(long index) { return (int) VH_deviceID.get(this.segment(), 0L, index); }
    public int layeredAPIAt(long index) { return (int) VH_layeredAPI.get(this.segment(), 0L, index); }
    public byte deviceNameAt(long index, long index0) { return (byte) VH_deviceName.get(this.segment(), 0L, index, index0); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int vendorID() { return (int) VH_vendorID.get(this.segment(), 0L, 0L); }
    public int deviceID() { return (int) VH_deviceID.get(this.segment(), 0L, 0L); }
    public int layeredAPI() { return (int) VH_layeredAPI.get(this.segment(), 0L, 0L); }
    public byte deviceName(long index0) { return (byte) VH_deviceName.get(this.segment(), 0L, 0L, index0); }
    public VkPhysicalDeviceLayeredApiPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesKHR vendorIDAt(long index, int value) { VH_vendorID.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesKHR deviceIDAt(long index, int value) { VH_deviceID.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesKHR layeredAPIAt(long index, int value) { VH_layeredAPI.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesKHR deviceNameAt(long index, long index0, byte value) { VH_deviceName.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesKHR vendorID(int value) { VH_vendorID.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesKHR deviceID(int value) { VH_deviceID.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesKHR layeredAPI(int value) { VH_layeredAPI.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesKHR deviceName(long index0, byte value) { VH_deviceName.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceLayeredApiPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceLayeredApiPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _vendorIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vendorID, index), LAYOUT_vendorID); }
    public MemorySegment _vendorID() { return _vendorIDAt(0L); }
    public VkPhysicalDeviceLayeredApiPropertiesKHR _vendorIDAt(long index, MemorySegment src) { _vendorIDAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesKHR _vendorID(MemorySegment src) { return _vendorIDAt(0L, src); }
    public MemorySegment _deviceIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceID, index), LAYOUT_deviceID); }
    public MemorySegment _deviceID() { return _deviceIDAt(0L); }
    public VkPhysicalDeviceLayeredApiPropertiesKHR _deviceIDAt(long index, MemorySegment src) { _deviceIDAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesKHR _deviceID(MemorySegment src) { return _deviceIDAt(0L, src); }
    public MemorySegment _layeredAPIAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layeredAPI, index), LAYOUT_layeredAPI); }
    public MemorySegment _layeredAPI() { return _layeredAPIAt(0L); }
    public VkPhysicalDeviceLayeredApiPropertiesKHR _layeredAPIAt(long index, MemorySegment src) { _layeredAPIAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesKHR _layeredAPI(MemorySegment src) { return _layeredAPIAt(0L, src); }
    public MemorySegment _deviceNameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceName, index), LAYOUT_deviceName); }
    public MemorySegment _deviceName() { return _deviceNameAt(0L); }
    public VkPhysicalDeviceLayeredApiPropertiesKHR _deviceNameAt(long index, MemorySegment src) { _deviceNameAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesKHR _deviceName(MemorySegment src) { return _deviceNameAt(0L, src); }
}
