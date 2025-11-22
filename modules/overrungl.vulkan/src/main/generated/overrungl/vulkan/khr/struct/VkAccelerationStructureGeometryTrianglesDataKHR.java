// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureGeometryTrianglesDataKHR`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureGeometryTrianglesDataKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkFormat vertexFormat;
///     VkDeviceOrHostAddressConstKHR vertexData;
///     VkDeviceSize vertexStride;
///     uint32_t maxVertex;
///     VkIndexType indexType;
///     VkDeviceOrHostAddressConstKHR indexData;
///     VkDeviceOrHostAddressConstKHR transformData;
/// }
/// ```
public final class VkAccelerationStructureGeometryTrianglesDataKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexFormat"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("vertexData"),
        ValueLayout.JAVA_LONG.withName("vertexStride"),
        ValueLayout.JAVA_INT.withName("maxVertex"),
        ValueLayout.JAVA_INT.withName("indexType"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("indexData"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("transformData")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_vertexFormat = LAYOUT.byteOffset(PathElement.groupElement("vertexFormat"));
    public static final long OFFSET_vertexData = LAYOUT.byteOffset(PathElement.groupElement("vertexData"));
    public static final long OFFSET_vertexStride = LAYOUT.byteOffset(PathElement.groupElement("vertexStride"));
    public static final long OFFSET_maxVertex = LAYOUT.byteOffset(PathElement.groupElement("maxVertex"));
    public static final long OFFSET_indexType = LAYOUT.byteOffset(PathElement.groupElement("indexType"));
    public static final long OFFSET_indexData = LAYOUT.byteOffset(PathElement.groupElement("indexData"));
    public static final long OFFSET_transformData = LAYOUT.byteOffset(PathElement.groupElement("transformData"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_vertexFormat = LAYOUT.select(PathElement.groupElement("vertexFormat"));
    public static final MemoryLayout LAYOUT_vertexData = LAYOUT.select(PathElement.groupElement("vertexData"));
    public static final MemoryLayout LAYOUT_vertexStride = LAYOUT.select(PathElement.groupElement("vertexStride"));
    public static final MemoryLayout LAYOUT_maxVertex = LAYOUT.select(PathElement.groupElement("maxVertex"));
    public static final MemoryLayout LAYOUT_indexType = LAYOUT.select(PathElement.groupElement("indexType"));
    public static final MemoryLayout LAYOUT_indexData = LAYOUT.select(PathElement.groupElement("indexData"));
    public static final MemoryLayout LAYOUT_transformData = LAYOUT.select(PathElement.groupElement("transformData"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_vertexFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexFormat"));
    public static final VarHandle VH_vertexData$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexData"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_vertexData$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexData"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_vertexStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexStride"));
    public static final VarHandle VH_maxVertex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertex"));
    public static final VarHandle VH_indexType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexType"));
    public static final VarHandle VH_indexData$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexData"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_indexData$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexData"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_transformData$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformData"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_transformData$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformData"), PathElement.groupElement("hostAddress"));

    public VkAccelerationStructureGeometryTrianglesDataKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAccelerationStructureGeometryTrianglesDataKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryTrianglesDataKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkAccelerationStructureGeometryTrianglesDataKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryTrianglesDataKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAccelerationStructureGeometryTrianglesDataKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryTrianglesDataKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAccelerationStructureGeometryTrianglesDataKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureGeometryTrianglesDataKHR(allocator.allocate(LAYOUT), 1); }
    public static VkAccelerationStructureGeometryTrianglesDataKHR alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureGeometryTrianglesDataKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkAccelerationStructureGeometryTrianglesDataKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR); }
    public static VkAccelerationStructureGeometryTrianglesDataKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR);
        return s;
    }
    public VkAccelerationStructureGeometryTrianglesDataKHR copyFrom(VkAccelerationStructureGeometryTrianglesDataKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR reinterpret(long count) { return new VkAccelerationStructureGeometryTrianglesDataKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAccelerationStructureGeometryTrianglesDataKHR asSlice(long index) { return new VkAccelerationStructureGeometryTrianglesDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAccelerationStructureGeometryTrianglesDataKHR asSlice(long index, long count) { return new VkAccelerationStructureGeometryTrianglesDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAccelerationStructureGeometryTrianglesDataKHR at(long index, Consumer<VkAccelerationStructureGeometryTrianglesDataKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int vertexFormatAt(long index) { return (int) VH_vertexFormat.get(this.segment(), 0L, index); }
    public long vertexData$deviceAddressAt(long index) { return (long) VH_vertexData$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment vertexData$hostAddressAt(long index) { return (MemorySegment) VH_vertexData$hostAddress.get(this.segment(), 0L, index); }
    public long vertexStrideAt(long index) { return (long) VH_vertexStride.get(this.segment(), 0L, index); }
    public int maxVertexAt(long index) { return (int) VH_maxVertex.get(this.segment(), 0L, index); }
    public int indexTypeAt(long index) { return (int) VH_indexType.get(this.segment(), 0L, index); }
    public long indexData$deviceAddressAt(long index) { return (long) VH_indexData$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment indexData$hostAddressAt(long index) { return (MemorySegment) VH_indexData$hostAddress.get(this.segment(), 0L, index); }
    public long transformData$deviceAddressAt(long index) { return (long) VH_transformData$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment transformData$hostAddressAt(long index) { return (MemorySegment) VH_transformData$hostAddress.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int vertexFormat() { return (int) VH_vertexFormat.get(this.segment(), 0L, 0L); }
    public long vertexData$deviceAddress() { return (long) VH_vertexData$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment vertexData$hostAddress() { return (MemorySegment) VH_vertexData$hostAddress.get(this.segment(), 0L, 0L); }
    public long vertexStride() { return (long) VH_vertexStride.get(this.segment(), 0L, 0L); }
    public int maxVertex() { return (int) VH_maxVertex.get(this.segment(), 0L, 0L); }
    public int indexType() { return (int) VH_indexType.get(this.segment(), 0L, 0L); }
    public long indexData$deviceAddress() { return (long) VH_indexData$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment indexData$hostAddress() { return (MemorySegment) VH_indexData$hostAddress.get(this.segment(), 0L, 0L); }
    public long transformData$deviceAddress() { return (long) VH_transformData$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment transformData$hostAddress() { return (MemorySegment) VH_transformData$hostAddress.get(this.segment(), 0L, 0L); }
    public VkAccelerationStructureGeometryTrianglesDataKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexFormatAt(long index, int value) { VH_vertexFormat.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexData$deviceAddressAt(long index, long value) { VH_vertexData$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexData$hostAddressAt(long index, MemorySegment value) { VH_vertexData$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexStrideAt(long index, long value) { VH_vertexStride.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR maxVertexAt(long index, int value) { VH_maxVertex.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR indexTypeAt(long index, int value) { VH_indexType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR indexData$deviceAddressAt(long index, long value) { VH_indexData$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR indexData$hostAddressAt(long index, MemorySegment value) { VH_indexData$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR transformData$deviceAddressAt(long index, long value) { VH_transformData$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR transformData$hostAddressAt(long index, MemorySegment value) { VH_transformData$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexFormat(int value) { VH_vertexFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexData$deviceAddress(long value) { VH_vertexData$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexData$hostAddress(MemorySegment value) { VH_vertexData$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexStride(long value) { VH_vertexStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR maxVertex(int value) { VH_maxVertex.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR indexType(int value) { VH_indexType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR indexData$deviceAddress(long value) { VH_indexData$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR indexData$hostAddress(MemorySegment value) { VH_indexData$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR transformData$deviceAddress(long value) { VH_transformData$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR transformData$hostAddress(MemorySegment value) { VH_transformData$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAccelerationStructureGeometryTrianglesDataKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAccelerationStructureGeometryTrianglesDataKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _vertexFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexFormat, index), LAYOUT_vertexFormat); }
    public MemorySegment _vertexFormat() { return _vertexFormatAt(0L); }
    public VkAccelerationStructureGeometryTrianglesDataKHR _vertexFormatAt(long index, MemorySegment src) { _vertexFormatAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR _vertexFormat(MemorySegment src) { return _vertexFormatAt(0L, src); }
    public MemorySegment _vertexDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexData, index), LAYOUT_vertexData); }
    public MemorySegment _vertexData() { return _vertexDataAt(0L); }
    public VkAccelerationStructureGeometryTrianglesDataKHR _vertexDataAt(long index, MemorySegment src) { _vertexDataAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR _vertexData(MemorySegment src) { return _vertexDataAt(0L, src); }
    public MemorySegment _vertexStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexStride, index), LAYOUT_vertexStride); }
    public MemorySegment _vertexStride() { return _vertexStrideAt(0L); }
    public VkAccelerationStructureGeometryTrianglesDataKHR _vertexStrideAt(long index, MemorySegment src) { _vertexStrideAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR _vertexStride(MemorySegment src) { return _vertexStrideAt(0L, src); }
    public MemorySegment _maxVertexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxVertex, index), LAYOUT_maxVertex); }
    public MemorySegment _maxVertex() { return _maxVertexAt(0L); }
    public VkAccelerationStructureGeometryTrianglesDataKHR _maxVertexAt(long index, MemorySegment src) { _maxVertexAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR _maxVertex(MemorySegment src) { return _maxVertexAt(0L, src); }
    public MemorySegment _indexTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexType, index), LAYOUT_indexType); }
    public MemorySegment _indexType() { return _indexTypeAt(0L); }
    public VkAccelerationStructureGeometryTrianglesDataKHR _indexTypeAt(long index, MemorySegment src) { _indexTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR _indexType(MemorySegment src) { return _indexTypeAt(0L, src); }
    public MemorySegment _indexDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexData, index), LAYOUT_indexData); }
    public MemorySegment _indexData() { return _indexDataAt(0L); }
    public VkAccelerationStructureGeometryTrianglesDataKHR _indexDataAt(long index, MemorySegment src) { _indexDataAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR _indexData(MemorySegment src) { return _indexDataAt(0L, src); }
    public MemorySegment _transformDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_transformData, index), LAYOUT_transformData); }
    public MemorySegment _transformData() { return _transformDataAt(0L); }
    public VkAccelerationStructureGeometryTrianglesDataKHR _transformDataAt(long index, MemorySegment src) { _transformDataAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryTrianglesDataKHR _transformData(MemorySegment src) { return _transformDataAt(0L, src); }
}
