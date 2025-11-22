// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureGeometryKHR`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureGeometryKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkGeometryTypeKHR geometryType;
///     VkAccelerationStructureGeometryDataKHR geometry;
///     VkGeometryFlagsKHR flags;
/// }
/// ```
public final class VkAccelerationStructureGeometryKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("geometryType"),
        overrungl.vulkan.khr.union.VkAccelerationStructureGeometryDataKHR.LAYOUT.withName("geometry"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_geometryType = LAYOUT.byteOffset(PathElement.groupElement("geometryType"));
    public static final long OFFSET_geometry = LAYOUT.byteOffset(PathElement.groupElement("geometry"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_geometryType = LAYOUT.select(PathElement.groupElement("geometryType"));
    public static final MemoryLayout LAYOUT_geometry = LAYOUT.select(PathElement.groupElement("geometry"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_geometryType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometryType"));
    public static final VarHandle VH_geometry$triangles$sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("triangles"), PathElement.groupElement("sType"));
    public static final VarHandle VH_geometry$triangles$pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("triangles"), PathElement.groupElement("pNext"));
    public static final VarHandle VH_geometry$triangles$vertexFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("triangles"), PathElement.groupElement("vertexFormat"));
    public static final VarHandle VH_geometry$triangles$vertexData$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("triangles"), PathElement.groupElement("vertexData"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_geometry$triangles$vertexData$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("triangles"), PathElement.groupElement("vertexData"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_geometry$triangles$vertexStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("triangles"), PathElement.groupElement("vertexStride"));
    public static final VarHandle VH_geometry$triangles$maxVertex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("triangles"), PathElement.groupElement("maxVertex"));
    public static final VarHandle VH_geometry$triangles$indexType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("triangles"), PathElement.groupElement("indexType"));
    public static final VarHandle VH_geometry$triangles$indexData$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("triangles"), PathElement.groupElement("indexData"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_geometry$triangles$indexData$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("triangles"), PathElement.groupElement("indexData"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_geometry$triangles$transformData$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("triangles"), PathElement.groupElement("transformData"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_geometry$triangles$transformData$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("triangles"), PathElement.groupElement("transformData"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_geometry$aabbs$sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("aabbs"), PathElement.groupElement("sType"));
    public static final VarHandle VH_geometry$aabbs$pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("aabbs"), PathElement.groupElement("pNext"));
    public static final VarHandle VH_geometry$aabbs$data$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("aabbs"), PathElement.groupElement("data"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_geometry$aabbs$data$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("aabbs"), PathElement.groupElement("data"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_geometry$aabbs$stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("aabbs"), PathElement.groupElement("stride"));
    public static final VarHandle VH_geometry$instances$sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("instances"), PathElement.groupElement("sType"));
    public static final VarHandle VH_geometry$instances$pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("instances"), PathElement.groupElement("pNext"));
    public static final VarHandle VH_geometry$instances$arrayOfPointers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("instances"), PathElement.groupElement("arrayOfPointers"));
    public static final VarHandle VH_geometry$instances$data$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("instances"), PathElement.groupElement("data"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_geometry$instances$data$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("instances"), PathElement.groupElement("data"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    public VkAccelerationStructureGeometryKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAccelerationStructureGeometryKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkAccelerationStructureGeometryKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAccelerationStructureGeometryKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAccelerationStructureGeometryKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureGeometryKHR(allocator.allocate(LAYOUT), 1); }
    public static VkAccelerationStructureGeometryKHR alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureGeometryKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkAccelerationStructureGeometryKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR); }
    public static VkAccelerationStructureGeometryKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR);
        return s;
    }
    public VkAccelerationStructureGeometryKHR copyFrom(VkAccelerationStructureGeometryKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAccelerationStructureGeometryKHR reinterpret(long count) { return new VkAccelerationStructureGeometryKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAccelerationStructureGeometryKHR asSlice(long index) { return new VkAccelerationStructureGeometryKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAccelerationStructureGeometryKHR asSlice(long index, long count) { return new VkAccelerationStructureGeometryKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAccelerationStructureGeometryKHR at(long index, Consumer<VkAccelerationStructureGeometryKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int geometryTypeAt(long index) { return (int) VH_geometryType.get(this.segment(), 0L, index); }
    public int geometry$triangles$sTypeAt(long index) { return (int) VH_geometry$triangles$sType.get(this.segment(), 0L, index); }
    public MemorySegment geometry$triangles$pNextAt(long index) { return (MemorySegment) VH_geometry$triangles$pNext.get(this.segment(), 0L, index); }
    public int geometry$triangles$vertexFormatAt(long index) { return (int) VH_geometry$triangles$vertexFormat.get(this.segment(), 0L, index); }
    public long geometry$triangles$vertexData$deviceAddressAt(long index) { return (long) VH_geometry$triangles$vertexData$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment geometry$triangles$vertexData$hostAddressAt(long index) { return (MemorySegment) VH_geometry$triangles$vertexData$hostAddress.get(this.segment(), 0L, index); }
    public long geometry$triangles$vertexStrideAt(long index) { return (long) VH_geometry$triangles$vertexStride.get(this.segment(), 0L, index); }
    public int geometry$triangles$maxVertexAt(long index) { return (int) VH_geometry$triangles$maxVertex.get(this.segment(), 0L, index); }
    public int geometry$triangles$indexTypeAt(long index) { return (int) VH_geometry$triangles$indexType.get(this.segment(), 0L, index); }
    public long geometry$triangles$indexData$deviceAddressAt(long index) { return (long) VH_geometry$triangles$indexData$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment geometry$triangles$indexData$hostAddressAt(long index) { return (MemorySegment) VH_geometry$triangles$indexData$hostAddress.get(this.segment(), 0L, index); }
    public long geometry$triangles$transformData$deviceAddressAt(long index) { return (long) VH_geometry$triangles$transformData$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment geometry$triangles$transformData$hostAddressAt(long index) { return (MemorySegment) VH_geometry$triangles$transformData$hostAddress.get(this.segment(), 0L, index); }
    public int geometry$aabbs$sTypeAt(long index) { return (int) VH_geometry$aabbs$sType.get(this.segment(), 0L, index); }
    public MemorySegment geometry$aabbs$pNextAt(long index) { return (MemorySegment) VH_geometry$aabbs$pNext.get(this.segment(), 0L, index); }
    public long geometry$aabbs$data$deviceAddressAt(long index) { return (long) VH_geometry$aabbs$data$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment geometry$aabbs$data$hostAddressAt(long index) { return (MemorySegment) VH_geometry$aabbs$data$hostAddress.get(this.segment(), 0L, index); }
    public long geometry$aabbs$strideAt(long index) { return (long) VH_geometry$aabbs$stride.get(this.segment(), 0L, index); }
    public int geometry$instances$sTypeAt(long index) { return (int) VH_geometry$instances$sType.get(this.segment(), 0L, index); }
    public MemorySegment geometry$instances$pNextAt(long index) { return (MemorySegment) VH_geometry$instances$pNext.get(this.segment(), 0L, index); }
    public int geometry$instances$arrayOfPointersAt(long index) { return (int) VH_geometry$instances$arrayOfPointers.get(this.segment(), 0L, index); }
    public long geometry$instances$data$deviceAddressAt(long index) { return (long) VH_geometry$instances$data$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment geometry$instances$data$hostAddressAt(long index) { return (MemorySegment) VH_geometry$instances$data$hostAddress.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int geometryType() { return (int) VH_geometryType.get(this.segment(), 0L, 0L); }
    public int geometry$triangles$sType() { return (int) VH_geometry$triangles$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment geometry$triangles$pNext() { return (MemorySegment) VH_geometry$triangles$pNext.get(this.segment(), 0L, 0L); }
    public int geometry$triangles$vertexFormat() { return (int) VH_geometry$triangles$vertexFormat.get(this.segment(), 0L, 0L); }
    public long geometry$triangles$vertexData$deviceAddress() { return (long) VH_geometry$triangles$vertexData$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment geometry$triangles$vertexData$hostAddress() { return (MemorySegment) VH_geometry$triangles$vertexData$hostAddress.get(this.segment(), 0L, 0L); }
    public long geometry$triangles$vertexStride() { return (long) VH_geometry$triangles$vertexStride.get(this.segment(), 0L, 0L); }
    public int geometry$triangles$maxVertex() { return (int) VH_geometry$triangles$maxVertex.get(this.segment(), 0L, 0L); }
    public int geometry$triangles$indexType() { return (int) VH_geometry$triangles$indexType.get(this.segment(), 0L, 0L); }
    public long geometry$triangles$indexData$deviceAddress() { return (long) VH_geometry$triangles$indexData$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment geometry$triangles$indexData$hostAddress() { return (MemorySegment) VH_geometry$triangles$indexData$hostAddress.get(this.segment(), 0L, 0L); }
    public long geometry$triangles$transformData$deviceAddress() { return (long) VH_geometry$triangles$transformData$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment geometry$triangles$transformData$hostAddress() { return (MemorySegment) VH_geometry$triangles$transformData$hostAddress.get(this.segment(), 0L, 0L); }
    public int geometry$aabbs$sType() { return (int) VH_geometry$aabbs$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment geometry$aabbs$pNext() { return (MemorySegment) VH_geometry$aabbs$pNext.get(this.segment(), 0L, 0L); }
    public long geometry$aabbs$data$deviceAddress() { return (long) VH_geometry$aabbs$data$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment geometry$aabbs$data$hostAddress() { return (MemorySegment) VH_geometry$aabbs$data$hostAddress.get(this.segment(), 0L, 0L); }
    public long geometry$aabbs$stride() { return (long) VH_geometry$aabbs$stride.get(this.segment(), 0L, 0L); }
    public int geometry$instances$sType() { return (int) VH_geometry$instances$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment geometry$instances$pNext() { return (MemorySegment) VH_geometry$instances$pNext.get(this.segment(), 0L, 0L); }
    public int geometry$instances$arrayOfPointers() { return (int) VH_geometry$instances$arrayOfPointers.get(this.segment(), 0L, 0L); }
    public long geometry$instances$data$deviceAddress() { return (long) VH_geometry$instances$data$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment geometry$instances$data$hostAddress() { return (MemorySegment) VH_geometry$instances$data$hostAddress.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public VkAccelerationStructureGeometryKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR geometryTypeAt(long index, int value) { VH_geometryType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$sTypeAt(long index, int value) { VH_geometry$triangles$sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$pNextAt(long index, MemorySegment value) { VH_geometry$triangles$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$vertexFormatAt(long index, int value) { VH_geometry$triangles$vertexFormat.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$vertexData$deviceAddressAt(long index, long value) { VH_geometry$triangles$vertexData$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$vertexData$hostAddressAt(long index, MemorySegment value) { VH_geometry$triangles$vertexData$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$vertexStrideAt(long index, long value) { VH_geometry$triangles$vertexStride.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$maxVertexAt(long index, int value) { VH_geometry$triangles$maxVertex.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$indexTypeAt(long index, int value) { VH_geometry$triangles$indexType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$indexData$deviceAddressAt(long index, long value) { VH_geometry$triangles$indexData$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$indexData$hostAddressAt(long index, MemorySegment value) { VH_geometry$triangles$indexData$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$transformData$deviceAddressAt(long index, long value) { VH_geometry$triangles$transformData$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$transformData$hostAddressAt(long index, MemorySegment value) { VH_geometry$triangles$transformData$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$aabbs$sTypeAt(long index, int value) { VH_geometry$aabbs$sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$aabbs$pNextAt(long index, MemorySegment value) { VH_geometry$aabbs$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$aabbs$data$deviceAddressAt(long index, long value) { VH_geometry$aabbs$data$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$aabbs$data$hostAddressAt(long index, MemorySegment value) { VH_geometry$aabbs$data$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$aabbs$strideAt(long index, long value) { VH_geometry$aabbs$stride.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$instances$sTypeAt(long index, int value) { VH_geometry$instances$sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$instances$pNextAt(long index, MemorySegment value) { VH_geometry$instances$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$instances$arrayOfPointersAt(long index, int value) { VH_geometry$instances$arrayOfPointers.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$instances$data$deviceAddressAt(long index, long value) { VH_geometry$instances$data$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$instances$data$hostAddressAt(long index, MemorySegment value) { VH_geometry$instances$data$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureGeometryKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR geometryType(int value) { VH_geometryType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$sType(int value) { VH_geometry$triangles$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$pNext(MemorySegment value) { VH_geometry$triangles$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$vertexFormat(int value) { VH_geometry$triangles$vertexFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$vertexData$deviceAddress(long value) { VH_geometry$triangles$vertexData$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$vertexData$hostAddress(MemorySegment value) { VH_geometry$triangles$vertexData$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$vertexStride(long value) { VH_geometry$triangles$vertexStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$maxVertex(int value) { VH_geometry$triangles$maxVertex.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$indexType(int value) { VH_geometry$triangles$indexType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$indexData$deviceAddress(long value) { VH_geometry$triangles$indexData$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$indexData$hostAddress(MemorySegment value) { VH_geometry$triangles$indexData$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$transformData$deviceAddress(long value) { VH_geometry$triangles$transformData$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$triangles$transformData$hostAddress(MemorySegment value) { VH_geometry$triangles$transformData$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$aabbs$sType(int value) { VH_geometry$aabbs$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$aabbs$pNext(MemorySegment value) { VH_geometry$aabbs$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$aabbs$data$deviceAddress(long value) { VH_geometry$aabbs$data$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$aabbs$data$hostAddress(MemorySegment value) { VH_geometry$aabbs$data$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$aabbs$stride(long value) { VH_geometry$aabbs$stride.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$instances$sType(int value) { VH_geometry$instances$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$instances$pNext(MemorySegment value) { VH_geometry$instances$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$instances$arrayOfPointers(int value) { VH_geometry$instances$arrayOfPointers.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$instances$data$deviceAddress(long value) { VH_geometry$instances$data$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR geometry$instances$data$hostAddress(MemorySegment value) { VH_geometry$instances$data$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureGeometryKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAccelerationStructureGeometryKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAccelerationStructureGeometryKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _geometryTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_geometryType, index), LAYOUT_geometryType); }
    public MemorySegment _geometryType() { return _geometryTypeAt(0L); }
    public VkAccelerationStructureGeometryKHR _geometryTypeAt(long index, MemorySegment src) { _geometryTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryKHR _geometryType(MemorySegment src) { return _geometryTypeAt(0L, src); }
    public MemorySegment _geometryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_geometry, index), LAYOUT_geometry); }
    public MemorySegment _geometry() { return _geometryAt(0L); }
    public VkAccelerationStructureGeometryKHR _geometryAt(long index, MemorySegment src) { _geometryAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryKHR _geometry(MemorySegment src) { return _geometryAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkAccelerationStructureGeometryKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureGeometryKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
}
