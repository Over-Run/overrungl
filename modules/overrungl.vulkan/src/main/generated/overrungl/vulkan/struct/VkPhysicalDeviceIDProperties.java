// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceIDProperties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceIDProperties {
///     VkStructureType sType;
///     void* pNext;
///     uint8_t deviceUUID[VK_UUID_SIZE];
///     uint8_t driverUUID[VK_UUID_SIZE];
///     uint8_t deviceLUID[VK_LUID_SIZE];
///     uint32_t deviceNodeMask;
///     VkBool32 deviceLUIDValid;
/// }
/// ```
public final class VkPhysicalDeviceIDProperties extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("deviceUUID"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("driverUUID"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK11.VK_LUID_SIZE, ValueLayout.JAVA_BYTE).withName("deviceLUID"),
        ValueLayout.JAVA_INT.withName("deviceNodeMask"),
        ValueLayout.JAVA_INT.withName("deviceLUIDValid")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_deviceUUID = LAYOUT.byteOffset(PathElement.groupElement("deviceUUID"));
    public static final long OFFSET_driverUUID = LAYOUT.byteOffset(PathElement.groupElement("driverUUID"));
    public static final long OFFSET_deviceLUID = LAYOUT.byteOffset(PathElement.groupElement("deviceLUID"));
    public static final long OFFSET_deviceNodeMask = LAYOUT.byteOffset(PathElement.groupElement("deviceNodeMask"));
    public static final long OFFSET_deviceLUIDValid = LAYOUT.byteOffset(PathElement.groupElement("deviceLUIDValid"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_deviceUUID = LAYOUT.select(PathElement.groupElement("deviceUUID"));
    public static final MemoryLayout LAYOUT_driverUUID = LAYOUT.select(PathElement.groupElement("driverUUID"));
    public static final MemoryLayout LAYOUT_deviceLUID = LAYOUT.select(PathElement.groupElement("deviceLUID"));
    public static final MemoryLayout LAYOUT_deviceNodeMask = LAYOUT.select(PathElement.groupElement("deviceNodeMask"));
    public static final MemoryLayout LAYOUT_deviceLUIDValid = LAYOUT.select(PathElement.groupElement("deviceLUIDValid"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_deviceUUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceUUID"), PathElement.sequenceElement());
    public static final VarHandle VH_driverUUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverUUID"), PathElement.sequenceElement());
    public static final VarHandle VH_deviceLUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceLUID"), PathElement.sequenceElement());
    public static final VarHandle VH_deviceNodeMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceNodeMask"));
    public static final VarHandle VH_deviceLUIDValid = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceLUIDValid"));

    public VkPhysicalDeviceIDProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceIDProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceIDProperties(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceIDProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceIDProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceIDProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceIDProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceIDProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceIDProperties(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceIDProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceIDProperties(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceIDProperties allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES); }
    public static VkPhysicalDeviceIDProperties allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceIDProperties copyFrom(VkPhysicalDeviceIDProperties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceIDProperties reinterpret(long count) { return new VkPhysicalDeviceIDProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceIDProperties asSlice(long index) { return new VkPhysicalDeviceIDProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceIDProperties asSlice(long index, long count) { return new VkPhysicalDeviceIDProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceIDProperties at(long index, Consumer<VkPhysicalDeviceIDProperties> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public byte deviceUUIDAt(long index, long index0) { return (byte) VH_deviceUUID.get(this.segment(), 0L, index, index0); }
    public byte driverUUIDAt(long index, long index0) { return (byte) VH_driverUUID.get(this.segment(), 0L, index, index0); }
    public byte deviceLUIDAt(long index, long index0) { return (byte) VH_deviceLUID.get(this.segment(), 0L, index, index0); }
    public int deviceNodeMaskAt(long index) { return (int) VH_deviceNodeMask.get(this.segment(), 0L, index); }
    public int deviceLUIDValidAt(long index) { return (int) VH_deviceLUIDValid.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public byte deviceUUID(long index0) { return (byte) VH_deviceUUID.get(this.segment(), 0L, 0L, index0); }
    public byte driverUUID(long index0) { return (byte) VH_driverUUID.get(this.segment(), 0L, 0L, index0); }
    public byte deviceLUID(long index0) { return (byte) VH_deviceLUID.get(this.segment(), 0L, 0L, index0); }
    public int deviceNodeMask() { return (int) VH_deviceNodeMask.get(this.segment(), 0L, 0L); }
    public int deviceLUIDValid() { return (int) VH_deviceLUIDValid.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceIDProperties sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceIDProperties pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceIDProperties deviceUUIDAt(long index, long index0, byte value) { VH_deviceUUID.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceIDProperties driverUUIDAt(long index, long index0, byte value) { VH_driverUUID.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceIDProperties deviceLUIDAt(long index, long index0, byte value) { VH_deviceLUID.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceIDProperties deviceNodeMaskAt(long index, int value) { VH_deviceNodeMask.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceIDProperties deviceLUIDValidAt(long index, int value) { VH_deviceLUIDValid.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceIDProperties sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceIDProperties pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceIDProperties deviceUUID(long index0, byte value) { VH_deviceUUID.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceIDProperties driverUUID(long index0, byte value) { VH_driverUUID.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceIDProperties deviceLUID(long index0, byte value) { VH_deviceLUID.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceIDProperties deviceNodeMask(int value) { VH_deviceNodeMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceIDProperties deviceLUIDValid(int value) { VH_deviceLUIDValid.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceIDProperties _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceIDProperties _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceIDProperties _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceIDProperties _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _deviceUUIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceUUID, index), LAYOUT_deviceUUID); }
    public MemorySegment _deviceUUID() { return _deviceUUIDAt(0L); }
    public VkPhysicalDeviceIDProperties _deviceUUIDAt(long index, MemorySegment src) { _deviceUUIDAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceIDProperties _deviceUUID(MemorySegment src) { return _deviceUUIDAt(0L, src); }
    public MemorySegment _driverUUIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_driverUUID, index), LAYOUT_driverUUID); }
    public MemorySegment _driverUUID() { return _driverUUIDAt(0L); }
    public VkPhysicalDeviceIDProperties _driverUUIDAt(long index, MemorySegment src) { _driverUUIDAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceIDProperties _driverUUID(MemorySegment src) { return _driverUUIDAt(0L, src); }
    public MemorySegment _deviceLUIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceLUID, index), LAYOUT_deviceLUID); }
    public MemorySegment _deviceLUID() { return _deviceLUIDAt(0L); }
    public VkPhysicalDeviceIDProperties _deviceLUIDAt(long index, MemorySegment src) { _deviceLUIDAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceIDProperties _deviceLUID(MemorySegment src) { return _deviceLUIDAt(0L, src); }
    public MemorySegment _deviceNodeMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceNodeMask, index), LAYOUT_deviceNodeMask); }
    public MemorySegment _deviceNodeMask() { return _deviceNodeMaskAt(0L); }
    public VkPhysicalDeviceIDProperties _deviceNodeMaskAt(long index, MemorySegment src) { _deviceNodeMaskAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceIDProperties _deviceNodeMask(MemorySegment src) { return _deviceNodeMaskAt(0L, src); }
    public MemorySegment _deviceLUIDValidAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceLUIDValid, index), LAYOUT_deviceLUIDValid); }
    public MemorySegment _deviceLUIDValid() { return _deviceLUIDValidAt(0L); }
    public VkPhysicalDeviceIDProperties _deviceLUIDValidAt(long index, MemorySegment src) { _deviceLUIDValidAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceIDProperties _deviceLUIDValid(MemorySegment src) { return _deviceLUIDValidAt(0L, src); }
}
