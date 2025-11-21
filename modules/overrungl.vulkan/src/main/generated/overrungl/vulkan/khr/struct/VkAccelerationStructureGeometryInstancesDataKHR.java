// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureGeometryInstancesDataKHR`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureGeometryInstancesDataKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 arrayOfPointers;
///     VkDeviceOrHostAddressConstKHR data;
/// }
/// ```
public final class VkAccelerationStructureGeometryInstancesDataKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("arrayOfPointers"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("data")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_arrayOfPointers = LAYOUT.byteOffset(PathElement.groupElement("arrayOfPointers"));
    public static final long OFFSET_data = LAYOUT.byteOffset(PathElement.groupElement("data"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_arrayOfPointers = LAYOUT.select(PathElement.groupElement("arrayOfPointers"));
    public static final MemoryLayout LAYOUT_data = LAYOUT.select(PathElement.groupElement("data"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_arrayOfPointers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("arrayOfPointers"));
    public static final VarHandle VH_data$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_data$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("hostAddress"));

    public VkAccelerationStructureGeometryInstancesDataKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAccelerationStructureGeometryInstancesDataKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryInstancesDataKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkAccelerationStructureGeometryInstancesDataKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryInstancesDataKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAccelerationStructureGeometryInstancesDataKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryInstancesDataKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAccelerationStructureGeometryInstancesDataKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureGeometryInstancesDataKHR(allocator.allocate(LAYOUT), 1); }
    public static VkAccelerationStructureGeometryInstancesDataKHR alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureGeometryInstancesDataKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkAccelerationStructureGeometryInstancesDataKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR); }
    public static VkAccelerationStructureGeometryInstancesDataKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR);
        return s;
    }
    public VkAccelerationStructureGeometryInstancesDataKHR copyFrom(VkAccelerationStructureGeometryInstancesDataKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAccelerationStructureGeometryInstancesDataKHR reinterpret(long count) { return new VkAccelerationStructureGeometryInstancesDataKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAccelerationStructureGeometryInstancesDataKHR asSlice(long index) { return new VkAccelerationStructureGeometryInstancesDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAccelerationStructureGeometryInstancesDataKHR asSlice(long index, long count) { return new VkAccelerationStructureGeometryInstancesDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAccelerationStructureGeometryInstancesDataKHR at(long index, Consumer<VkAccelerationStructureGeometryInstancesDataKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int arrayOfPointersAt(long index) { return (int) VH_arrayOfPointers.get(this.segment(), 0L, index); }
    public long data$deviceAddressAt(long index) { return (long) VH_data$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment data$hostAddressAt(long index) { return (MemorySegment) VH_data$hostAddress.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int arrayOfPointers() { return (int) VH_arrayOfPointers.get(this.segment(), 0L, 0L); }
    public long data$deviceAddress() { return (long) VH_data$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment data$hostAddress() { return (MemorySegment) VH_data$hostAddress.get(this.segment(), 0L, 0L); }
    public VkAccelerationStructureGeometryInstancesDataKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryInstancesDataKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryInstancesDataKHR arrayOfPointersAt(long index, int value) { VH_arrayOfPointers.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryInstancesDataKHR data$deviceAddressAt(long index, long value) { VH_data$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryInstancesDataKHR data$hostAddressAt(long index, MemorySegment value) { VH_data$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryInstancesDataKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryInstancesDataKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryInstancesDataKHR arrayOfPointers(int value) { VH_arrayOfPointers.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryInstancesDataKHR data$deviceAddress(long value) { VH_data$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryInstancesDataKHR data$hostAddress(MemorySegment value) { VH_data$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAccelerationStructureGeometryInstancesDataKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryInstancesDataKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAccelerationStructureGeometryInstancesDataKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryInstancesDataKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _arrayOfPointersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_arrayOfPointers, index), LAYOUT_arrayOfPointers); }
    public MemorySegment _arrayOfPointers() { return _arrayOfPointersAt(0L); }
    public VkAccelerationStructureGeometryInstancesDataKHR _arrayOfPointersAt(long index, MemorySegment src) { _arrayOfPointersAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryInstancesDataKHR _arrayOfPointers(MemorySegment src) { return _arrayOfPointersAt(0L, src); }
    public MemorySegment _dataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_data, index), LAYOUT_data); }
    public MemorySegment _data() { return _dataAt(0L); }
    public VkAccelerationStructureGeometryInstancesDataKHR _dataAt(long index, MemorySegment src) { _dataAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryInstancesDataKHR _data(MemorySegment src) { return _dataAt(0L, src); }
}
