// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureGeometryLinearSweptSpheresDataNV`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureGeometryLinearSweptSpheresDataNV {
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
///     VkRayTracingLssIndexingModeNV indexingMode;
///     VkRayTracingLssPrimitiveEndCapsModeNV endCapsMode;
/// }
/// ```
public final class VkAccelerationStructureGeometryLinearSweptSpheresDataNV extends GroupType {
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
        ValueLayout.JAVA_LONG.withName("indexStride"),
        ValueLayout.JAVA_INT.withName("indexingMode"),
        ValueLayout.JAVA_INT.withName("endCapsMode")
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
    public static final long OFFSET_indexingMode = LAYOUT.byteOffset(PathElement.groupElement("indexingMode"));
    public static final long OFFSET_endCapsMode = LAYOUT.byteOffset(PathElement.groupElement("endCapsMode"));
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
    public static final MemoryLayout LAYOUT_indexingMode = LAYOUT.select(PathElement.groupElement("indexingMode"));
    public static final MemoryLayout LAYOUT_endCapsMode = LAYOUT.select(PathElement.groupElement("endCapsMode"));
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
    public static final VarHandle VH_indexingMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexingMode"));
    public static final VarHandle VH_endCapsMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("endCapsMode"));

    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(allocator.allocate(LAYOUT), 1); }
    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(allocator.allocate(LAYOUT, count), count); }
    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVRayTracingLinearSweptSpheres.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_LINEAR_SWEPT_SPHERES_DATA_NV); }
    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVRayTracingLinearSweptSpheres.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_LINEAR_SWEPT_SPHERES_DATA_NV);
        return s;
    }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV copyFrom(VkAccelerationStructureGeometryLinearSweptSpheresDataNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV reinterpret(long count) { return new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV asSlice(long index) { return new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV asSlice(long index, long count) { return new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV at(long index, Consumer<VkAccelerationStructureGeometryLinearSweptSpheresDataNV> func) { func.accept(asSlice(index)); return this; }
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
    public int indexingModeAt(long index) { return (int) VH_indexingMode.get(this.segment(), 0L, index); }
    public int endCapsModeAt(long index) { return (int) VH_endCapsMode.get(this.segment(), 0L, index); }
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
    public int indexingMode() { return (int) VH_indexingMode.get(this.segment(), 0L, 0L); }
    public int endCapsMode() { return (int) VH_endCapsMode.get(this.segment(), 0L, 0L); }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexFormatAt(long index, int value) { VH_vertexFormat.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexData$deviceAddressAt(long index, long value) { VH_vertexData$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexData$hostAddressAt(long index, MemorySegment value) { VH_vertexData$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexStrideAt(long index, long value) { VH_vertexStride.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusFormatAt(long index, int value) { VH_radiusFormat.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusData$deviceAddressAt(long index, long value) { VH_radiusData$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusData$hostAddressAt(long index, MemorySegment value) { VH_radiusData$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusStrideAt(long index, long value) { VH_radiusStride.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexTypeAt(long index, int value) { VH_indexType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexData$deviceAddressAt(long index, long value) { VH_indexData$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexData$hostAddressAt(long index, MemorySegment value) { VH_indexData$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexStrideAt(long index, long value) { VH_indexStride.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexingModeAt(long index, int value) { VH_indexingMode.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV endCapsModeAt(long index, int value) { VH_endCapsMode.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexFormat(int value) { VH_vertexFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexData$deviceAddress(long value) { VH_vertexData$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexData$hostAddress(MemorySegment value) { VH_vertexData$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexStride(long value) { VH_vertexStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusFormat(int value) { VH_radiusFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusData$deviceAddress(long value) { VH_radiusData$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusData$hostAddress(MemorySegment value) { VH_radiusData$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusStride(long value) { VH_radiusStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexType(int value) { VH_indexType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexData$deviceAddress(long value) { VH_indexData$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexData$hostAddress(MemorySegment value) { VH_indexData$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexStride(long value) { VH_indexStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexingMode(int value) { VH_indexingMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV endCapsMode(int value) { VH_endCapsMode.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _vertexFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexFormat, index), LAYOUT_vertexFormat); }
    public MemorySegment _vertexFormat() { return _vertexFormatAt(0L); }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _vertexFormatAt(long index, MemorySegment src) { _vertexFormatAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _vertexFormat(MemorySegment src) { return _vertexFormatAt(0L, src); }
    public MemorySegment _vertexDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexData, index), LAYOUT_vertexData); }
    public MemorySegment _vertexData() { return _vertexDataAt(0L); }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _vertexDataAt(long index, MemorySegment src) { _vertexDataAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _vertexData(MemorySegment src) { return _vertexDataAt(0L, src); }
    public MemorySegment _vertexStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexStride, index), LAYOUT_vertexStride); }
    public MemorySegment _vertexStride() { return _vertexStrideAt(0L); }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _vertexStrideAt(long index, MemorySegment src) { _vertexStrideAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _vertexStride(MemorySegment src) { return _vertexStrideAt(0L, src); }
    public MemorySegment _radiusFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_radiusFormat, index), LAYOUT_radiusFormat); }
    public MemorySegment _radiusFormat() { return _radiusFormatAt(0L); }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _radiusFormatAt(long index, MemorySegment src) { _radiusFormatAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _radiusFormat(MemorySegment src) { return _radiusFormatAt(0L, src); }
    public MemorySegment _radiusDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_radiusData, index), LAYOUT_radiusData); }
    public MemorySegment _radiusData() { return _radiusDataAt(0L); }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _radiusDataAt(long index, MemorySegment src) { _radiusDataAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _radiusData(MemorySegment src) { return _radiusDataAt(0L, src); }
    public MemorySegment _radiusStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_radiusStride, index), LAYOUT_radiusStride); }
    public MemorySegment _radiusStride() { return _radiusStrideAt(0L); }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _radiusStrideAt(long index, MemorySegment src) { _radiusStrideAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _radiusStride(MemorySegment src) { return _radiusStrideAt(0L, src); }
    public MemorySegment _indexTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexType, index), LAYOUT_indexType); }
    public MemorySegment _indexType() { return _indexTypeAt(0L); }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _indexTypeAt(long index, MemorySegment src) { _indexTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _indexType(MemorySegment src) { return _indexTypeAt(0L, src); }
    public MemorySegment _indexDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexData, index), LAYOUT_indexData); }
    public MemorySegment _indexData() { return _indexDataAt(0L); }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _indexDataAt(long index, MemorySegment src) { _indexDataAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _indexData(MemorySegment src) { return _indexDataAt(0L, src); }
    public MemorySegment _indexStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexStride, index), LAYOUT_indexStride); }
    public MemorySegment _indexStride() { return _indexStrideAt(0L); }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _indexStrideAt(long index, MemorySegment src) { _indexStrideAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _indexStride(MemorySegment src) { return _indexStrideAt(0L, src); }
    public MemorySegment _indexingModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexingMode, index), LAYOUT_indexingMode); }
    public MemorySegment _indexingMode() { return _indexingModeAt(0L); }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _indexingModeAt(long index, MemorySegment src) { _indexingModeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _indexingMode(MemorySegment src) { return _indexingModeAt(0L, src); }
    public MemorySegment _endCapsModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_endCapsMode, index), LAYOUT_endCapsMode); }
    public MemorySegment _endCapsMode() { return _endCapsModeAt(0L); }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _endCapsModeAt(long index, MemorySegment src) { _endCapsModeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV _endCapsMode(MemorySegment src) { return _endCapsModeAt(0L, src); }
}
