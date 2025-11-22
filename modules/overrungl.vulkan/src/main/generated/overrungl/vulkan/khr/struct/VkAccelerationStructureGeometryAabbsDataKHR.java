// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureGeometryAabbsDataKHR`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureGeometryAabbsDataKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceOrHostAddressConstKHR data;
///     VkDeviceSize stride;
/// }
/// ```
public final class VkAccelerationStructureGeometryAabbsDataKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("data"),
        ValueLayout.JAVA_LONG.withName("stride")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_data = LAYOUT.byteOffset(PathElement.groupElement("data"));
    public static final long OFFSET_stride = LAYOUT.byteOffset(PathElement.groupElement("stride"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_data = LAYOUT.select(PathElement.groupElement("data"));
    public static final MemoryLayout LAYOUT_stride = LAYOUT.select(PathElement.groupElement("stride"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_data$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_data$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));

    public VkAccelerationStructureGeometryAabbsDataKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAccelerationStructureGeometryAabbsDataKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryAabbsDataKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkAccelerationStructureGeometryAabbsDataKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryAabbsDataKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAccelerationStructureGeometryAabbsDataKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryAabbsDataKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAccelerationStructureGeometryAabbsDataKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureGeometryAabbsDataKHR(allocator.allocate(LAYOUT), 1); }
    public static VkAccelerationStructureGeometryAabbsDataKHR alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureGeometryAabbsDataKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkAccelerationStructureGeometryAabbsDataKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA_KHR); }
    public static VkAccelerationStructureGeometryAabbsDataKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA_KHR);
        return s;
    }
    public VkAccelerationStructureGeometryAabbsDataKHR copyFrom(VkAccelerationStructureGeometryAabbsDataKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAccelerationStructureGeometryAabbsDataKHR reinterpret(long count) { return new VkAccelerationStructureGeometryAabbsDataKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAccelerationStructureGeometryAabbsDataKHR asSlice(long index) { return new VkAccelerationStructureGeometryAabbsDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAccelerationStructureGeometryAabbsDataKHR asSlice(long index, long count) { return new VkAccelerationStructureGeometryAabbsDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAccelerationStructureGeometryAabbsDataKHR at(long index, Consumer<VkAccelerationStructureGeometryAabbsDataKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long data$deviceAddressAt(long index) { return (long) VH_data$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment data$hostAddressAt(long index) { return (MemorySegment) VH_data$hostAddress.get(this.segment(), 0L, index); }
    public long strideAt(long index) { return (long) VH_stride.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long data$deviceAddress() { return (long) VH_data$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment data$hostAddress() { return (MemorySegment) VH_data$hostAddress.get(this.segment(), 0L, 0L); }
    public long stride() { return (long) VH_stride.get(this.segment(), 0L, 0L); }
    public VkAccelerationStructureGeometryAabbsDataKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryAabbsDataKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryAabbsDataKHR data$deviceAddressAt(long index, long value) { VH_data$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryAabbsDataKHR data$hostAddressAt(long index, MemorySegment value) { VH_data$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryAabbsDataKHR strideAt(long index, long value) { VH_stride.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryAabbsDataKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryAabbsDataKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryAabbsDataKHR data$deviceAddress(long value) { VH_data$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryAabbsDataKHR data$hostAddress(MemorySegment value) { VH_data$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryAabbsDataKHR stride(long value) { VH_stride.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAccelerationStructureGeometryAabbsDataKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryAabbsDataKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAccelerationStructureGeometryAabbsDataKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryAabbsDataKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _dataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_data, index), LAYOUT_data); }
    public MemorySegment _data() { return _dataAt(0L); }
    public VkAccelerationStructureGeometryAabbsDataKHR _dataAt(long index, MemorySegment src) { _dataAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryAabbsDataKHR _data(MemorySegment src) { return _dataAt(0L, src); }
    public MemorySegment _strideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stride, index), LAYOUT_stride); }
    public MemorySegment _stride() { return _strideAt(0L); }
    public VkAccelerationStructureGeometryAabbsDataKHR _strideAt(long index, MemorySegment src) { _strideAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryAabbsDataKHR _stride(MemorySegment src) { return _strideAt(0L, src); }
}
