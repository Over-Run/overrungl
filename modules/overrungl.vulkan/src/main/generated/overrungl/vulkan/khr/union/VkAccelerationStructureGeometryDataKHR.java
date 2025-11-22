// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.union;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureGeometryDataKHR`.
/// ## Layout
/// ```
/// union VkAccelerationStructureGeometryDataKHR {
///     VkAccelerationStructureGeometryTrianglesDataKHR triangles;
///     VkAccelerationStructureGeometryAabbsDataKHR aabbs;
///     VkAccelerationStructureGeometryInstancesDataKHR instances;
/// }
/// ```
public final class VkAccelerationStructureGeometryDataKHR extends GroupType {
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        overrungl.vulkan.khr.struct.VkAccelerationStructureGeometryTrianglesDataKHR.LAYOUT.withName("triangles"),
        overrungl.vulkan.khr.struct.VkAccelerationStructureGeometryAabbsDataKHR.LAYOUT.withName("aabbs"),
        overrungl.vulkan.khr.struct.VkAccelerationStructureGeometryInstancesDataKHR.LAYOUT.withName("instances")
    );
    public static final long OFFSET_triangles = LAYOUT.byteOffset(PathElement.groupElement("triangles"));
    public static final long OFFSET_aabbs = LAYOUT.byteOffset(PathElement.groupElement("aabbs"));
    public static final long OFFSET_instances = LAYOUT.byteOffset(PathElement.groupElement("instances"));
    public static final MemoryLayout LAYOUT_triangles = LAYOUT.select(PathElement.groupElement("triangles"));
    public static final MemoryLayout LAYOUT_aabbs = LAYOUT.select(PathElement.groupElement("aabbs"));
    public static final MemoryLayout LAYOUT_instances = LAYOUT.select(PathElement.groupElement("instances"));
    public static final VarHandle VH_triangles$sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("sType"));
    public static final VarHandle VH_triangles$pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("pNext"));
    public static final VarHandle VH_triangles$vertexFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("vertexFormat"));
    public static final VarHandle VH_triangles$vertexData$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("vertexData"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_triangles$vertexData$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("vertexData"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_triangles$vertexStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("vertexStride"));
    public static final VarHandle VH_triangles$maxVertex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("maxVertex"));
    public static final VarHandle VH_triangles$indexType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("indexType"));
    public static final VarHandle VH_triangles$indexData$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("indexData"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_triangles$indexData$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("indexData"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_triangles$transformData$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("transformData"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_triangles$transformData$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("transformData"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_aabbs$sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aabbs"), PathElement.groupElement("sType"));
    public static final VarHandle VH_aabbs$pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aabbs"), PathElement.groupElement("pNext"));
    public static final VarHandle VH_aabbs$data$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aabbs"), PathElement.groupElement("data"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_aabbs$data$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aabbs"), PathElement.groupElement("data"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_aabbs$stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aabbs"), PathElement.groupElement("stride"));
    public static final VarHandle VH_instances$sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instances"), PathElement.groupElement("sType"));
    public static final VarHandle VH_instances$pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instances"), PathElement.groupElement("pNext"));
    public static final VarHandle VH_instances$arrayOfPointers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instances"), PathElement.groupElement("arrayOfPointers"));
    public static final VarHandle VH_instances$data$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instances"), PathElement.groupElement("data"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_instances$data$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instances"), PathElement.groupElement("data"), PathElement.groupElement("hostAddress"));

    public VkAccelerationStructureGeometryDataKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAccelerationStructureGeometryDataKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryDataKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkAccelerationStructureGeometryDataKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryDataKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAccelerationStructureGeometryDataKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryDataKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAccelerationStructureGeometryDataKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureGeometryDataKHR(allocator.allocate(LAYOUT), 1); }
    public static VkAccelerationStructureGeometryDataKHR alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureGeometryDataKHR(allocator.allocate(LAYOUT, count), count); }
    public VkAccelerationStructureGeometryDataKHR copyFrom(VkAccelerationStructureGeometryDataKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAccelerationStructureGeometryDataKHR reinterpret(long count) { return new VkAccelerationStructureGeometryDataKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAccelerationStructureGeometryDataKHR asSlice(long index) { return new VkAccelerationStructureGeometryDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAccelerationStructureGeometryDataKHR asSlice(long index, long count) { return new VkAccelerationStructureGeometryDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAccelerationStructureGeometryDataKHR at(long index, Consumer<VkAccelerationStructureGeometryDataKHR> func) { func.accept(asSlice(index)); return this; }
    public int triangles$sTypeAt(long index) { return (int) VH_triangles$sType.get(this.segment(), 0L, index); }
    public MemorySegment triangles$pNextAt(long index) { return (MemorySegment) VH_triangles$pNext.get(this.segment(), 0L, index); }
    public int triangles$vertexFormatAt(long index) { return (int) VH_triangles$vertexFormat.get(this.segment(), 0L, index); }
    public long triangles$vertexData$deviceAddressAt(long index) { return (long) VH_triangles$vertexData$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment triangles$vertexData$hostAddressAt(long index) { return (MemorySegment) VH_triangles$vertexData$hostAddress.get(this.segment(), 0L, index); }
    public long triangles$vertexStrideAt(long index) { return (long) VH_triangles$vertexStride.get(this.segment(), 0L, index); }
    public int triangles$maxVertexAt(long index) { return (int) VH_triangles$maxVertex.get(this.segment(), 0L, index); }
    public int triangles$indexTypeAt(long index) { return (int) VH_triangles$indexType.get(this.segment(), 0L, index); }
    public long triangles$indexData$deviceAddressAt(long index) { return (long) VH_triangles$indexData$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment triangles$indexData$hostAddressAt(long index) { return (MemorySegment) VH_triangles$indexData$hostAddress.get(this.segment(), 0L, index); }
    public long triangles$transformData$deviceAddressAt(long index) { return (long) VH_triangles$transformData$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment triangles$transformData$hostAddressAt(long index) { return (MemorySegment) VH_triangles$transformData$hostAddress.get(this.segment(), 0L, index); }
    public int aabbs$sTypeAt(long index) { return (int) VH_aabbs$sType.get(this.segment(), 0L, index); }
    public MemorySegment aabbs$pNextAt(long index) { return (MemorySegment) VH_aabbs$pNext.get(this.segment(), 0L, index); }
    public long aabbs$data$deviceAddressAt(long index) { return (long) VH_aabbs$data$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment aabbs$data$hostAddressAt(long index) { return (MemorySegment) VH_aabbs$data$hostAddress.get(this.segment(), 0L, index); }
    public long aabbs$strideAt(long index) { return (long) VH_aabbs$stride.get(this.segment(), 0L, index); }
    public int instances$sTypeAt(long index) { return (int) VH_instances$sType.get(this.segment(), 0L, index); }
    public MemorySegment instances$pNextAt(long index) { return (MemorySegment) VH_instances$pNext.get(this.segment(), 0L, index); }
    public int instances$arrayOfPointersAt(long index) { return (int) VH_instances$arrayOfPointers.get(this.segment(), 0L, index); }
    public long instances$data$deviceAddressAt(long index) { return (long) VH_instances$data$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment instances$data$hostAddressAt(long index) { return (MemorySegment) VH_instances$data$hostAddress.get(this.segment(), 0L, index); }
    public int triangles$sType() { return (int) VH_triangles$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment triangles$pNext() { return (MemorySegment) VH_triangles$pNext.get(this.segment(), 0L, 0L); }
    public int triangles$vertexFormat() { return (int) VH_triangles$vertexFormat.get(this.segment(), 0L, 0L); }
    public long triangles$vertexData$deviceAddress() { return (long) VH_triangles$vertexData$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment triangles$vertexData$hostAddress() { return (MemorySegment) VH_triangles$vertexData$hostAddress.get(this.segment(), 0L, 0L); }
    public long triangles$vertexStride() { return (long) VH_triangles$vertexStride.get(this.segment(), 0L, 0L); }
    public int triangles$maxVertex() { return (int) VH_triangles$maxVertex.get(this.segment(), 0L, 0L); }
    public int triangles$indexType() { return (int) VH_triangles$indexType.get(this.segment(), 0L, 0L); }
    public long triangles$indexData$deviceAddress() { return (long) VH_triangles$indexData$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment triangles$indexData$hostAddress() { return (MemorySegment) VH_triangles$indexData$hostAddress.get(this.segment(), 0L, 0L); }
    public long triangles$transformData$deviceAddress() { return (long) VH_triangles$transformData$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment triangles$transformData$hostAddress() { return (MemorySegment) VH_triangles$transformData$hostAddress.get(this.segment(), 0L, 0L); }
    public int aabbs$sType() { return (int) VH_aabbs$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment aabbs$pNext() { return (MemorySegment) VH_aabbs$pNext.get(this.segment(), 0L, 0L); }
    public long aabbs$data$deviceAddress() { return (long) VH_aabbs$data$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment aabbs$data$hostAddress() { return (MemorySegment) VH_aabbs$data$hostAddress.get(this.segment(), 0L, 0L); }
    public long aabbs$stride() { return (long) VH_aabbs$stride.get(this.segment(), 0L, 0L); }
    public int instances$sType() { return (int) VH_instances$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment instances$pNext() { return (MemorySegment) VH_instances$pNext.get(this.segment(), 0L, 0L); }
    public int instances$arrayOfPointers() { return (int) VH_instances$arrayOfPointers.get(this.segment(), 0L, 0L); }
    public long instances$data$deviceAddress() { return (long) VH_instances$data$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment instances$data$hostAddress() { return (MemorySegment) VH_instances$data$hostAddress.get(this.segment(), 0L, 0L); }
    public VkAccelerationStructureGeometryDataKHR triangles$sTypeAt(long index, int value) { VH_triangles$sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryDataKHR triangles$pNextAt(long index, MemorySegment value) { VH_triangles$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryDataKHR triangles$vertexFormatAt(long index, int value) { VH_triangles$vertexFormat.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryDataKHR triangles$vertexData$deviceAddressAt(long index, long value) { VH_triangles$vertexData$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryDataKHR triangles$vertexData$hostAddressAt(long index, MemorySegment value) { VH_triangles$vertexData$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryDataKHR triangles$vertexStrideAt(long index, long value) { VH_triangles$vertexStride.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryDataKHR triangles$maxVertexAt(long index, int value) { VH_triangles$maxVertex.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryDataKHR triangles$indexTypeAt(long index, int value) { VH_triangles$indexType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryDataKHR triangles$indexData$deviceAddressAt(long index, long value) { VH_triangles$indexData$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryDataKHR triangles$indexData$hostAddressAt(long index, MemorySegment value) { VH_triangles$indexData$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryDataKHR triangles$transformData$deviceAddressAt(long index, long value) { VH_triangles$transformData$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryDataKHR triangles$transformData$hostAddressAt(long index, MemorySegment value) { VH_triangles$transformData$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryDataKHR aabbs$sTypeAt(long index, int value) { VH_aabbs$sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryDataKHR aabbs$pNextAt(long index, MemorySegment value) { VH_aabbs$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryDataKHR aabbs$data$deviceAddressAt(long index, long value) { VH_aabbs$data$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryDataKHR aabbs$data$hostAddressAt(long index, MemorySegment value) { VH_aabbs$data$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryDataKHR aabbs$strideAt(long index, long value) { VH_aabbs$stride.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryDataKHR instances$sTypeAt(long index, int value) { VH_instances$sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryDataKHR instances$pNextAt(long index, MemorySegment value) { VH_instances$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryDataKHR instances$arrayOfPointersAt(long index, int value) { VH_instances$arrayOfPointers.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryDataKHR instances$data$deviceAddressAt(long index, long value) { VH_instances$data$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryDataKHR instances$data$hostAddressAt(long index, MemorySegment value) { VH_instances$data$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryDataKHR triangles$sType(int value) { VH_triangles$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryDataKHR triangles$pNext(MemorySegment value) { VH_triangles$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryDataKHR triangles$vertexFormat(int value) { VH_triangles$vertexFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryDataKHR triangles$vertexData$deviceAddress(long value) { VH_triangles$vertexData$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryDataKHR triangles$vertexData$hostAddress(MemorySegment value) { VH_triangles$vertexData$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryDataKHR triangles$vertexStride(long value) { VH_triangles$vertexStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryDataKHR triangles$maxVertex(int value) { VH_triangles$maxVertex.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryDataKHR triangles$indexType(int value) { VH_triangles$indexType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryDataKHR triangles$indexData$deviceAddress(long value) { VH_triangles$indexData$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryDataKHR triangles$indexData$hostAddress(MemorySegment value) { VH_triangles$indexData$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryDataKHR triangles$transformData$deviceAddress(long value) { VH_triangles$transformData$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryDataKHR triangles$transformData$hostAddress(MemorySegment value) { VH_triangles$transformData$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryDataKHR aabbs$sType(int value) { VH_aabbs$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryDataKHR aabbs$pNext(MemorySegment value) { VH_aabbs$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryDataKHR aabbs$data$deviceAddress(long value) { VH_aabbs$data$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryDataKHR aabbs$data$hostAddress(MemorySegment value) { VH_aabbs$data$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryDataKHR aabbs$stride(long value) { VH_aabbs$stride.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryDataKHR instances$sType(int value) { VH_instances$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryDataKHR instances$pNext(MemorySegment value) { VH_instances$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryDataKHR instances$arrayOfPointers(int value) { VH_instances$arrayOfPointers.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryDataKHR instances$data$deviceAddress(long value) { VH_instances$data$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryDataKHR instances$data$hostAddress(MemorySegment value) { VH_instances$data$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _trianglesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_triangles, index), LAYOUT_triangles); }
    public MemorySegment _triangles() { return _trianglesAt(0L); }
    public VkAccelerationStructureGeometryDataKHR _trianglesAt(long index, MemorySegment src) { _trianglesAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryDataKHR _triangles(MemorySegment src) { return _trianglesAt(0L, src); }
    public MemorySegment _aabbsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_aabbs, index), LAYOUT_aabbs); }
    public MemorySegment _aabbs() { return _aabbsAt(0L); }
    public VkAccelerationStructureGeometryDataKHR _aabbsAt(long index, MemorySegment src) { _aabbsAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryDataKHR _aabbs(MemorySegment src) { return _aabbsAt(0L, src); }
    public MemorySegment _instancesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_instances, index), LAYOUT_instances); }
    public MemorySegment _instances() { return _instancesAt(0L); }
    public VkAccelerationStructureGeometryDataKHR _instancesAt(long index, MemorySegment src) { _instancesAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryDataKHR _instances(MemorySegment src) { return _instancesAt(0L, src); }
}
