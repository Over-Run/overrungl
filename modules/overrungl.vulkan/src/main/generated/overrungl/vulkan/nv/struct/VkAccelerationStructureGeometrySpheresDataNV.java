// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureGeometrySpheresDataNV`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureGeometrySpheresDataNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkFormat vertexFormat;
///     VkDeviceOrHostAddressConstKHR vertexData;
///     VkDeviceSize vertexStride;
///     VkFormat radiusFormat;
///     VkDeviceOrHostAddressConstKHR radiusData;
///     VkDeviceSize radiusStride;
///     VkIndexType indexType;
///     VkDeviceOrHostAddressConstKHR indexData;
///     VkDeviceSize indexStride;
/// }
/// ```
public final class VkAccelerationStructureGeometrySpheresDataNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexFormat"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("vertexData"),
        ValueLayout.JAVA_LONG.withName("vertexStride"),
        ValueLayout.JAVA_INT.withName("radiusFormat"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("radiusData"),
        ValueLayout.JAVA_LONG.withName("radiusStride"),
        ValueLayout.JAVA_INT.withName("indexType"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("indexData"),
        ValueLayout.JAVA_LONG.withName("indexStride")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_vertexFormat = LAYOUT.byteOffset(PathElement.groupElement("vertexFormat"));
    public static final long OFFSET_vertexData = LAYOUT.byteOffset(PathElement.groupElement("vertexData"));
    public static final long OFFSET_vertexStride = LAYOUT.byteOffset(PathElement.groupElement("vertexStride"));
    public static final long OFFSET_radiusFormat = LAYOUT.byteOffset(PathElement.groupElement("radiusFormat"));
    public static final long OFFSET_radiusData = LAYOUT.byteOffset(PathElement.groupElement("radiusData"));
    public static final long OFFSET_radiusStride = LAYOUT.byteOffset(PathElement.groupElement("radiusStride"));
    public static final long OFFSET_indexType = LAYOUT.byteOffset(PathElement.groupElement("indexType"));
    public static final long OFFSET_indexData = LAYOUT.byteOffset(PathElement.groupElement("indexData"));
    public static final long OFFSET_indexStride = LAYOUT.byteOffset(PathElement.groupElement("indexStride"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_vertexFormat = LAYOUT.select(PathElement.groupElement("vertexFormat"));
    public static final MemoryLayout LAYOUT_vertexData = LAYOUT.select(PathElement.groupElement("vertexData"));
    public static final MemoryLayout LAYOUT_vertexStride = LAYOUT.select(PathElement.groupElement("vertexStride"));
    public static final MemoryLayout LAYOUT_radiusFormat = LAYOUT.select(PathElement.groupElement("radiusFormat"));
    public static final MemoryLayout LAYOUT_radiusData = LAYOUT.select(PathElement.groupElement("radiusData"));
    public static final MemoryLayout LAYOUT_radiusStride = LAYOUT.select(PathElement.groupElement("radiusStride"));
    public static final MemoryLayout LAYOUT_indexType = LAYOUT.select(PathElement.groupElement("indexType"));
    public static final MemoryLayout LAYOUT_indexData = LAYOUT.select(PathElement.groupElement("indexData"));
    public static final MemoryLayout LAYOUT_indexStride = LAYOUT.select(PathElement.groupElement("indexStride"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_vertexFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexFormat"));
    public static final VarHandle VH_vertexData$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexData"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_vertexData$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexData"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_vertexStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexStride"));
    public static final VarHandle VH_radiusFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("radiusFormat"));
    public static final VarHandle VH_radiusData$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("radiusData"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_radiusData$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("radiusData"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_radiusStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("radiusStride"));
    public static final VarHandle VH_indexType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexType"));
    public static final VarHandle VH_indexData$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexData"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_indexData$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexData"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_indexStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexStride"));

    public VkAccelerationStructureGeometrySpheresDataNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAccelerationStructureGeometrySpheresDataNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometrySpheresDataNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkAccelerationStructureGeometrySpheresDataNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometrySpheresDataNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAccelerationStructureGeometrySpheresDataNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometrySpheresDataNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAccelerationStructureGeometrySpheresDataNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureGeometrySpheresDataNV(allocator.allocate(LAYOUT), 1); }
    public static VkAccelerationStructureGeometrySpheresDataNV alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureGeometrySpheresDataNV(allocator.allocate(LAYOUT, count), count); }
    public static VkAccelerationStructureGeometrySpheresDataNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVRayTracingLinearSweptSpheres.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_SPHERES_DATA_NV); }
    public static VkAccelerationStructureGeometrySpheresDataNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVRayTracingLinearSweptSpheres.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_SPHERES_DATA_NV);
        return s;
    }
    public VkAccelerationStructureGeometrySpheresDataNV copyFrom(VkAccelerationStructureGeometrySpheresDataNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV reinterpret(long count) { return new VkAccelerationStructureGeometrySpheresDataNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAccelerationStructureGeometrySpheresDataNV asSlice(long index) { return new VkAccelerationStructureGeometrySpheresDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAccelerationStructureGeometrySpheresDataNV asSlice(long index, long count) { return new VkAccelerationStructureGeometrySpheresDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAccelerationStructureGeometrySpheresDataNV at(long index, Consumer<VkAccelerationStructureGeometrySpheresDataNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int vertexFormatAt(long index) { return (int) VH_vertexFormat.get(this.segment(), 0L, index); }
    public long vertexData$deviceAddressAt(long index) { return (long) VH_vertexData$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment vertexData$hostAddressAt(long index) { return (MemorySegment) VH_vertexData$hostAddress.get(this.segment(), 0L, index); }
    public long vertexStrideAt(long index) { return (long) VH_vertexStride.get(this.segment(), 0L, index); }
    public int radiusFormatAt(long index) { return (int) VH_radiusFormat.get(this.segment(), 0L, index); }
    public long radiusData$deviceAddressAt(long index) { return (long) VH_radiusData$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment radiusData$hostAddressAt(long index) { return (MemorySegment) VH_radiusData$hostAddress.get(this.segment(), 0L, index); }
    public long radiusStrideAt(long index) { return (long) VH_radiusStride.get(this.segment(), 0L, index); }
    public int indexTypeAt(long index) { return (int) VH_indexType.get(this.segment(), 0L, index); }
    public long indexData$deviceAddressAt(long index) { return (long) VH_indexData$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment indexData$hostAddressAt(long index) { return (MemorySegment) VH_indexData$hostAddress.get(this.segment(), 0L, index); }
    public long indexStrideAt(long index) { return (long) VH_indexStride.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int vertexFormat() { return (int) VH_vertexFormat.get(this.segment(), 0L, 0L); }
    public long vertexData$deviceAddress() { return (long) VH_vertexData$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment vertexData$hostAddress() { return (MemorySegment) VH_vertexData$hostAddress.get(this.segment(), 0L, 0L); }
    public long vertexStride() { return (long) VH_vertexStride.get(this.segment(), 0L, 0L); }
    public int radiusFormat() { return (int) VH_radiusFormat.get(this.segment(), 0L, 0L); }
    public long radiusData$deviceAddress() { return (long) VH_radiusData$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment radiusData$hostAddress() { return (MemorySegment) VH_radiusData$hostAddress.get(this.segment(), 0L, 0L); }
    public long radiusStride() { return (long) VH_radiusStride.get(this.segment(), 0L, 0L); }
    public int indexType() { return (int) VH_indexType.get(this.segment(), 0L, 0L); }
    public long indexData$deviceAddress() { return (long) VH_indexData$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment indexData$hostAddress() { return (MemorySegment) VH_indexData$hostAddress.get(this.segment(), 0L, 0L); }
    public long indexStride() { return (long) VH_indexStride.get(this.segment(), 0L, 0L); }
    public VkAccelerationStructureGeometrySpheresDataNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV vertexFormatAt(long index, int value) { VH_vertexFormat.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV vertexData$deviceAddressAt(long index, long value) { VH_vertexData$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV vertexData$hostAddressAt(long index, MemorySegment value) { VH_vertexData$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV vertexStrideAt(long index, long value) { VH_vertexStride.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV radiusFormatAt(long index, int value) { VH_radiusFormat.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV radiusData$deviceAddressAt(long index, long value) { VH_radiusData$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV radiusData$hostAddressAt(long index, MemorySegment value) { VH_radiusData$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV radiusStrideAt(long index, long value) { VH_radiusStride.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV indexTypeAt(long index, int value) { VH_indexType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV indexData$deviceAddressAt(long index, long value) { VH_indexData$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV indexData$hostAddressAt(long index, MemorySegment value) { VH_indexData$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV indexStrideAt(long index, long value) { VH_indexStride.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV vertexFormat(int value) { VH_vertexFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV vertexData$deviceAddress(long value) { VH_vertexData$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV vertexData$hostAddress(MemorySegment value) { VH_vertexData$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV vertexStride(long value) { VH_vertexStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV radiusFormat(int value) { VH_radiusFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV radiusData$deviceAddress(long value) { VH_radiusData$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV radiusData$hostAddress(MemorySegment value) { VH_radiusData$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV radiusStride(long value) { VH_radiusStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV indexType(int value) { VH_indexType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV indexData$deviceAddress(long value) { VH_indexData$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV indexData$hostAddress(MemorySegment value) { VH_indexData$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV indexStride(long value) { VH_indexStride.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAccelerationStructureGeometrySpheresDataNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAccelerationStructureGeometrySpheresDataNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _vertexFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexFormat, index), LAYOUT_vertexFormat); }
    public MemorySegment _vertexFormat() { return _vertexFormatAt(0L); }
    public VkAccelerationStructureGeometrySpheresDataNV _vertexFormatAt(long index, MemorySegment src) { _vertexFormatAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV _vertexFormat(MemorySegment src) { return _vertexFormatAt(0L, src); }
    public MemorySegment _vertexDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexData, index), LAYOUT_vertexData); }
    public MemorySegment _vertexData() { return _vertexDataAt(0L); }
    public VkAccelerationStructureGeometrySpheresDataNV _vertexDataAt(long index, MemorySegment src) { _vertexDataAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV _vertexData(MemorySegment src) { return _vertexDataAt(0L, src); }
    public MemorySegment _vertexStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexStride, index), LAYOUT_vertexStride); }
    public MemorySegment _vertexStride() { return _vertexStrideAt(0L); }
    public VkAccelerationStructureGeometrySpheresDataNV _vertexStrideAt(long index, MemorySegment src) { _vertexStrideAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV _vertexStride(MemorySegment src) { return _vertexStrideAt(0L, src); }
    public MemorySegment _radiusFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_radiusFormat, index), LAYOUT_radiusFormat); }
    public MemorySegment _radiusFormat() { return _radiusFormatAt(0L); }
    public VkAccelerationStructureGeometrySpheresDataNV _radiusFormatAt(long index, MemorySegment src) { _radiusFormatAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV _radiusFormat(MemorySegment src) { return _radiusFormatAt(0L, src); }
    public MemorySegment _radiusDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_radiusData, index), LAYOUT_radiusData); }
    public MemorySegment _radiusData() { return _radiusDataAt(0L); }
    public VkAccelerationStructureGeometrySpheresDataNV _radiusDataAt(long index, MemorySegment src) { _radiusDataAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV _radiusData(MemorySegment src) { return _radiusDataAt(0L, src); }
    public MemorySegment _radiusStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_radiusStride, index), LAYOUT_radiusStride); }
    public MemorySegment _radiusStride() { return _radiusStrideAt(0L); }
    public VkAccelerationStructureGeometrySpheresDataNV _radiusStrideAt(long index, MemorySegment src) { _radiusStrideAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV _radiusStride(MemorySegment src) { return _radiusStrideAt(0L, src); }
    public MemorySegment _indexTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexType, index), LAYOUT_indexType); }
    public MemorySegment _indexType() { return _indexTypeAt(0L); }
    public VkAccelerationStructureGeometrySpheresDataNV _indexTypeAt(long index, MemorySegment src) { _indexTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV _indexType(MemorySegment src) { return _indexTypeAt(0L, src); }
    public MemorySegment _indexDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexData, index), LAYOUT_indexData); }
    public MemorySegment _indexData() { return _indexDataAt(0L); }
    public VkAccelerationStructureGeometrySpheresDataNV _indexDataAt(long index, MemorySegment src) { _indexDataAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV _indexData(MemorySegment src) { return _indexDataAt(0L, src); }
    public MemorySegment _indexStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexStride, index), LAYOUT_indexStride); }
    public MemorySegment _indexStride() { return _indexStrideAt(0L); }
    public VkAccelerationStructureGeometrySpheresDataNV _indexStrideAt(long index, MemorySegment src) { _indexStrideAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometrySpheresDataNV _indexStride(MemorySegment src) { return _indexStrideAt(0L, src); }
}
