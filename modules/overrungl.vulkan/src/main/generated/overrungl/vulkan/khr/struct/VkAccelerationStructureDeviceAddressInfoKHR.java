// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureDeviceAddressInfoKHR`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureDeviceAddressInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkAccelerationStructureKHR accelerationStructure;
/// }
/// ```
public final class VkAccelerationStructureDeviceAddressInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("accelerationStructure")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_accelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructure"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_accelerationStructure = LAYOUT.select(PathElement.groupElement("accelerationStructure"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_accelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructure"));

    public VkAccelerationStructureDeviceAddressInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAccelerationStructureDeviceAddressInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureDeviceAddressInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkAccelerationStructureDeviceAddressInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureDeviceAddressInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAccelerationStructureDeviceAddressInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureDeviceAddressInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAccelerationStructureDeviceAddressInfoKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureDeviceAddressInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkAccelerationStructureDeviceAddressInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureDeviceAddressInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkAccelerationStructureDeviceAddressInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO_KHR); }
    public static VkAccelerationStructureDeviceAddressInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO_KHR);
        return s;
    }
    public VkAccelerationStructureDeviceAddressInfoKHR copyFrom(VkAccelerationStructureDeviceAddressInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAccelerationStructureDeviceAddressInfoKHR reinterpret(long count) { return new VkAccelerationStructureDeviceAddressInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAccelerationStructureDeviceAddressInfoKHR asSlice(long index) { return new VkAccelerationStructureDeviceAddressInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAccelerationStructureDeviceAddressInfoKHR asSlice(long index, long count) { return new VkAccelerationStructureDeviceAddressInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAccelerationStructureDeviceAddressInfoKHR at(long index, Consumer<VkAccelerationStructureDeviceAddressInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long accelerationStructureAt(long index) { return (long) VH_accelerationStructure.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long accelerationStructure() { return (long) VH_accelerationStructure.get(this.segment(), 0L, 0L); }
    public VkAccelerationStructureDeviceAddressInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureDeviceAddressInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureDeviceAddressInfoKHR accelerationStructureAt(long index, long value) { VH_accelerationStructure.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureDeviceAddressInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureDeviceAddressInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureDeviceAddressInfoKHR accelerationStructure(long value) { VH_accelerationStructure.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAccelerationStructureDeviceAddressInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureDeviceAddressInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAccelerationStructureDeviceAddressInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureDeviceAddressInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _accelerationStructureAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_accelerationStructure, index), LAYOUT_accelerationStructure); }
    public MemorySegment _accelerationStructure() { return _accelerationStructureAt(0L); }
    public VkAccelerationStructureDeviceAddressInfoKHR _accelerationStructureAt(long index, MemorySegment src) { _accelerationStructureAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureDeviceAddressInfoKHR _accelerationStructure(MemorySegment src) { return _accelerationStructureAt(0L, src); }
}
