// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureTrianglesOpacityMicromapEXT`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureTrianglesOpacityMicromapEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkIndexType indexType;
///     VkDeviceOrHostAddressConstKHR indexBuffer;
///     VkDeviceSize indexStride;
///     uint32_t baseTriangle;
///     uint32_t usageCountsCount;
///     const VkMicromapUsageEXT* pUsageCounts;
///     const VkMicromapUsageEXT* const* ppUsageCounts;
///     VkMicromapEXT micromap;
/// }
/// ```
public final class VkAccelerationStructureTrianglesOpacityMicromapEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("indexType"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("indexBuffer"),
        ValueLayout.JAVA_LONG.withName("indexStride"),
        ValueLayout.JAVA_INT.withName("baseTriangle"),
        ValueLayout.JAVA_INT.withName("usageCountsCount"),
        ValueLayout.ADDRESS.withName("pUsageCounts"),
        ValueLayout.ADDRESS.withName("ppUsageCounts"),
        ValueLayout.JAVA_LONG.withName("micromap")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_indexType = LAYOUT.byteOffset(PathElement.groupElement("indexType"));
    public static final long OFFSET_indexBuffer = LAYOUT.byteOffset(PathElement.groupElement("indexBuffer"));
    public static final long OFFSET_indexStride = LAYOUT.byteOffset(PathElement.groupElement("indexStride"));
    public static final long OFFSET_baseTriangle = LAYOUT.byteOffset(PathElement.groupElement("baseTriangle"));
    public static final long OFFSET_usageCountsCount = LAYOUT.byteOffset(PathElement.groupElement("usageCountsCount"));
    public static final long OFFSET_pUsageCounts = LAYOUT.byteOffset(PathElement.groupElement("pUsageCounts"));
    public static final long OFFSET_ppUsageCounts = LAYOUT.byteOffset(PathElement.groupElement("ppUsageCounts"));
    public static final long OFFSET_micromap = LAYOUT.byteOffset(PathElement.groupElement("micromap"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_indexType = LAYOUT.select(PathElement.groupElement("indexType"));
    public static final MemoryLayout LAYOUT_indexBuffer = LAYOUT.select(PathElement.groupElement("indexBuffer"));
    public static final MemoryLayout LAYOUT_indexStride = LAYOUT.select(PathElement.groupElement("indexStride"));
    public static final MemoryLayout LAYOUT_baseTriangle = LAYOUT.select(PathElement.groupElement("baseTriangle"));
    public static final MemoryLayout LAYOUT_usageCountsCount = LAYOUT.select(PathElement.groupElement("usageCountsCount"));
    public static final MemoryLayout LAYOUT_pUsageCounts = LAYOUT.select(PathElement.groupElement("pUsageCounts"));
    public static final MemoryLayout LAYOUT_ppUsageCounts = LAYOUT.select(PathElement.groupElement("ppUsageCounts"));
    public static final MemoryLayout LAYOUT_micromap = LAYOUT.select(PathElement.groupElement("micromap"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_indexType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexType"));
    public static final VarHandle VH_indexBuffer$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexBuffer"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_indexBuffer$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexBuffer"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_indexStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexStride"));
    public static final VarHandle VH_baseTriangle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseTriangle"));
    public static final VarHandle VH_usageCountsCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usageCountsCount"));
    public static final VarHandle VH_pUsageCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUsageCounts"));
    public static final VarHandle VH_ppUsageCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ppUsageCounts"));
    public static final VarHandle VH_micromap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("micromap"));

    public VkAccelerationStructureTrianglesOpacityMicromapEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureTrianglesOpacityMicromapEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureTrianglesOpacityMicromapEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureTrianglesOpacityMicromapEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT alloc(SegmentAllocator allocator) { return new VkAccelerationStructureTrianglesOpacityMicromapEXT(allocator.allocate(LAYOUT), 1); }
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureTrianglesOpacityMicromapEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTOpacityMicromap.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT); }
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTOpacityMicromap.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT);
        return s;
    }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT copyFrom(VkAccelerationStructureTrianglesOpacityMicromapEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT reinterpret(long count) { return new VkAccelerationStructureTrianglesOpacityMicromapEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT asSlice(long index) { return new VkAccelerationStructureTrianglesOpacityMicromapEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT asSlice(long index, long count) { return new VkAccelerationStructureTrianglesOpacityMicromapEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT at(long index, Consumer<VkAccelerationStructureTrianglesOpacityMicromapEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int indexTypeAt(long index) { return (int) VH_indexType.get(this.segment(), 0L, index); }
    public long indexBuffer$deviceAddressAt(long index) { return (long) VH_indexBuffer$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment indexBuffer$hostAddressAt(long index) { return (MemorySegment) VH_indexBuffer$hostAddress.get(this.segment(), 0L, index); }
    public long indexStrideAt(long index) { return (long) VH_indexStride.get(this.segment(), 0L, index); }
    public int baseTriangleAt(long index) { return (int) VH_baseTriangle.get(this.segment(), 0L, index); }
    public int usageCountsCountAt(long index) { return (int) VH_usageCountsCount.get(this.segment(), 0L, index); }
    public MemorySegment pUsageCountsAt(long index) { return (MemorySegment) VH_pUsageCounts.get(this.segment(), 0L, index); }
    public MemorySegment ppUsageCountsAt(long index) { return (MemorySegment) VH_ppUsageCounts.get(this.segment(), 0L, index); }
    public long micromapAt(long index) { return (long) VH_micromap.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int indexType() { return (int) VH_indexType.get(this.segment(), 0L, 0L); }
    public long indexBuffer$deviceAddress() { return (long) VH_indexBuffer$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment indexBuffer$hostAddress() { return (MemorySegment) VH_indexBuffer$hostAddress.get(this.segment(), 0L, 0L); }
    public long indexStride() { return (long) VH_indexStride.get(this.segment(), 0L, 0L); }
    public int baseTriangle() { return (int) VH_baseTriangle.get(this.segment(), 0L, 0L); }
    public int usageCountsCount() { return (int) VH_usageCountsCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pUsageCounts() { return (MemorySegment) VH_pUsageCounts.get(this.segment(), 0L, 0L); }
    public MemorySegment ppUsageCounts() { return (MemorySegment) VH_ppUsageCounts.get(this.segment(), 0L, 0L); }
    public long micromap() { return (long) VH_micromap.get(this.segment(), 0L, 0L); }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexTypeAt(long index, int value) { VH_indexType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexBuffer$deviceAddressAt(long index, long value) { VH_indexBuffer$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexBuffer$hostAddressAt(long index, MemorySegment value) { VH_indexBuffer$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexStrideAt(long index, long value) { VH_indexStride.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT baseTriangleAt(long index, int value) { VH_baseTriangle.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT usageCountsCountAt(long index, int value) { VH_usageCountsCount.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT pUsageCountsAt(long index, MemorySegment value) { VH_pUsageCounts.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT ppUsageCountsAt(long index, MemorySegment value) { VH_ppUsageCounts.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT micromapAt(long index, long value) { VH_micromap.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexType(int value) { VH_indexType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexBuffer$deviceAddress(long value) { VH_indexBuffer$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexBuffer$hostAddress(MemorySegment value) { VH_indexBuffer$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexStride(long value) { VH_indexStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT baseTriangle(int value) { VH_baseTriangle.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT usageCountsCount(int value) { VH_usageCountsCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT pUsageCounts(MemorySegment value) { VH_pUsageCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT ppUsageCounts(MemorySegment value) { VH_ppUsageCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT micromap(long value) { VH_micromap.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _indexTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexType, index), LAYOUT_indexType); }
    public MemorySegment _indexType() { return _indexTypeAt(0L); }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT _indexTypeAt(long index, MemorySegment src) { _indexTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT _indexType(MemorySegment src) { return _indexTypeAt(0L, src); }
    public MemorySegment _indexBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexBuffer, index), LAYOUT_indexBuffer); }
    public MemorySegment _indexBuffer() { return _indexBufferAt(0L); }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT _indexBufferAt(long index, MemorySegment src) { _indexBufferAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT _indexBuffer(MemorySegment src) { return _indexBufferAt(0L, src); }
    public MemorySegment _indexStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexStride, index), LAYOUT_indexStride); }
    public MemorySegment _indexStride() { return _indexStrideAt(0L); }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT _indexStrideAt(long index, MemorySegment src) { _indexStrideAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT _indexStride(MemorySegment src) { return _indexStrideAt(0L, src); }
    public MemorySegment _baseTriangleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_baseTriangle, index), LAYOUT_baseTriangle); }
    public MemorySegment _baseTriangle() { return _baseTriangleAt(0L); }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT _baseTriangleAt(long index, MemorySegment src) { _baseTriangleAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT _baseTriangle(MemorySegment src) { return _baseTriangleAt(0L, src); }
    public MemorySegment _usageCountsCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_usageCountsCount, index), LAYOUT_usageCountsCount); }
    public MemorySegment _usageCountsCount() { return _usageCountsCountAt(0L); }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT _usageCountsCountAt(long index, MemorySegment src) { _usageCountsCountAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT _usageCountsCount(MemorySegment src) { return _usageCountsCountAt(0L, src); }
    public MemorySegment _pUsageCountsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pUsageCounts, index), LAYOUT_pUsageCounts); }
    public MemorySegment _pUsageCounts() { return _pUsageCountsAt(0L); }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT _pUsageCountsAt(long index, MemorySegment src) { _pUsageCountsAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT _pUsageCounts(MemorySegment src) { return _pUsageCountsAt(0L, src); }
    public MemorySegment _ppUsageCountsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ppUsageCounts, index), LAYOUT_ppUsageCounts); }
    public MemorySegment _ppUsageCounts() { return _ppUsageCountsAt(0L); }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT _ppUsageCountsAt(long index, MemorySegment src) { _ppUsageCountsAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT _ppUsageCounts(MemorySegment src) { return _ppUsageCountsAt(0L, src); }
    public MemorySegment _micromapAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_micromap, index), LAYOUT_micromap); }
    public MemorySegment _micromap() { return _micromapAt(0L); }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT _micromapAt(long index, MemorySegment src) { _micromapAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesOpacityMicromapEXT _micromap(MemorySegment src) { return _micromapAt(0L, src); }
}
