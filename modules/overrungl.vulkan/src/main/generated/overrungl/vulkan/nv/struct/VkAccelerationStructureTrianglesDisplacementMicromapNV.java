// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureTrianglesDisplacementMicromapNV`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureTrianglesDisplacementMicromapNV {
///     VkStructureType sType;
///     void* pNext;
///     VkFormat displacementBiasAndScaleFormat;
///     VkFormat displacementVectorFormat;
///     VkDeviceOrHostAddressConstKHR displacementBiasAndScaleBuffer;
///     VkDeviceSize displacementBiasAndScaleStride;
///     VkDeviceOrHostAddressConstKHR displacementVectorBuffer;
///     VkDeviceSize displacementVectorStride;
///     VkDeviceOrHostAddressConstKHR displacedMicromapPrimitiveFlags;
///     VkDeviceSize displacedMicromapPrimitiveFlagsStride;
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
public final class VkAccelerationStructureTrianglesDisplacementMicromapNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("displacementBiasAndScaleFormat"),
        ValueLayout.JAVA_INT.withName("displacementVectorFormat"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("displacementBiasAndScaleBuffer"),
        ValueLayout.JAVA_LONG.withName("displacementBiasAndScaleStride"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("displacementVectorBuffer"),
        ValueLayout.JAVA_LONG.withName("displacementVectorStride"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("displacedMicromapPrimitiveFlags"),
        ValueLayout.JAVA_LONG.withName("displacedMicromapPrimitiveFlagsStride"),
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
    public static final long OFFSET_displacementBiasAndScaleFormat = LAYOUT.byteOffset(PathElement.groupElement("displacementBiasAndScaleFormat"));
    public static final long OFFSET_displacementVectorFormat = LAYOUT.byteOffset(PathElement.groupElement("displacementVectorFormat"));
    public static final long OFFSET_displacementBiasAndScaleBuffer = LAYOUT.byteOffset(PathElement.groupElement("displacementBiasAndScaleBuffer"));
    public static final long OFFSET_displacementBiasAndScaleStride = LAYOUT.byteOffset(PathElement.groupElement("displacementBiasAndScaleStride"));
    public static final long OFFSET_displacementVectorBuffer = LAYOUT.byteOffset(PathElement.groupElement("displacementVectorBuffer"));
    public static final long OFFSET_displacementVectorStride = LAYOUT.byteOffset(PathElement.groupElement("displacementVectorStride"));
    public static final long OFFSET_displacedMicromapPrimitiveFlags = LAYOUT.byteOffset(PathElement.groupElement("displacedMicromapPrimitiveFlags"));
    public static final long OFFSET_displacedMicromapPrimitiveFlagsStride = LAYOUT.byteOffset(PathElement.groupElement("displacedMicromapPrimitiveFlagsStride"));
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
    public static final MemoryLayout LAYOUT_displacementBiasAndScaleFormat = LAYOUT.select(PathElement.groupElement("displacementBiasAndScaleFormat"));
    public static final MemoryLayout LAYOUT_displacementVectorFormat = LAYOUT.select(PathElement.groupElement("displacementVectorFormat"));
    public static final MemoryLayout LAYOUT_displacementBiasAndScaleBuffer = LAYOUT.select(PathElement.groupElement("displacementBiasAndScaleBuffer"));
    public static final MemoryLayout LAYOUT_displacementBiasAndScaleStride = LAYOUT.select(PathElement.groupElement("displacementBiasAndScaleStride"));
    public static final MemoryLayout LAYOUT_displacementVectorBuffer = LAYOUT.select(PathElement.groupElement("displacementVectorBuffer"));
    public static final MemoryLayout LAYOUT_displacementVectorStride = LAYOUT.select(PathElement.groupElement("displacementVectorStride"));
    public static final MemoryLayout LAYOUT_displacedMicromapPrimitiveFlags = LAYOUT.select(PathElement.groupElement("displacedMicromapPrimitiveFlags"));
    public static final MemoryLayout LAYOUT_displacedMicromapPrimitiveFlagsStride = LAYOUT.select(PathElement.groupElement("displacedMicromapPrimitiveFlagsStride"));
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
    public static final VarHandle VH_displacementBiasAndScaleFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displacementBiasAndScaleFormat"));
    public static final VarHandle VH_displacementVectorFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displacementVectorFormat"));
    public static final VarHandle VH_displacementBiasAndScaleBuffer$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displacementBiasAndScaleBuffer"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_displacementBiasAndScaleBuffer$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displacementBiasAndScaleBuffer"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_displacementBiasAndScaleStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displacementBiasAndScaleStride"));
    public static final VarHandle VH_displacementVectorBuffer$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displacementVectorBuffer"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_displacementVectorBuffer$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displacementVectorBuffer"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_displacementVectorStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displacementVectorStride"));
    public static final VarHandle VH_displacedMicromapPrimitiveFlags$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displacedMicromapPrimitiveFlags"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_displacedMicromapPrimitiveFlags$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displacedMicromapPrimitiveFlags"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_displacedMicromapPrimitiveFlagsStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displacedMicromapPrimitiveFlagsStride"));
    public static final VarHandle VH_indexType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexType"));
    public static final VarHandle VH_indexBuffer$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexBuffer"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_indexBuffer$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexBuffer"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_indexStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexStride"));
    public static final VarHandle VH_baseTriangle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseTriangle"));
    public static final VarHandle VH_usageCountsCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usageCountsCount"));
    public static final VarHandle VH_pUsageCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUsageCounts"));
    public static final VarHandle VH_ppUsageCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ppUsageCounts"));
    public static final VarHandle VH_micromap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("micromap"));

    public VkAccelerationStructureTrianglesDisplacementMicromapNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureTrianglesDisplacementMicromapNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureTrianglesDisplacementMicromapNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureTrianglesDisplacementMicromapNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureTrianglesDisplacementMicromapNV(allocator.allocate(LAYOUT), 1); }
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureTrianglesDisplacementMicromapNV(allocator.allocate(LAYOUT, count), count); }
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVDisplacementMicromap.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_DISPLACEMENT_MICROMAP_NV); }
    public static VkAccelerationStructureTrianglesDisplacementMicromapNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVDisplacementMicromap.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_DISPLACEMENT_MICROMAP_NV);
        return s;
    }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV copyFrom(VkAccelerationStructureTrianglesDisplacementMicromapNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV reinterpret(long count) { return new VkAccelerationStructureTrianglesDisplacementMicromapNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV asSlice(long index) { return new VkAccelerationStructureTrianglesDisplacementMicromapNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV asSlice(long index, long count) { return new VkAccelerationStructureTrianglesDisplacementMicromapNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV at(long index, Consumer<VkAccelerationStructureTrianglesDisplacementMicromapNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int displacementBiasAndScaleFormatAt(long index) { return (int) VH_displacementBiasAndScaleFormat.get(this.segment(), 0L, index); }
    public int displacementVectorFormatAt(long index) { return (int) VH_displacementVectorFormat.get(this.segment(), 0L, index); }
    public long displacementBiasAndScaleBuffer$deviceAddressAt(long index) { return (long) VH_displacementBiasAndScaleBuffer$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment displacementBiasAndScaleBuffer$hostAddressAt(long index) { return (MemorySegment) VH_displacementBiasAndScaleBuffer$hostAddress.get(this.segment(), 0L, index); }
    public long displacementBiasAndScaleStrideAt(long index) { return (long) VH_displacementBiasAndScaleStride.get(this.segment(), 0L, index); }
    public long displacementVectorBuffer$deviceAddressAt(long index) { return (long) VH_displacementVectorBuffer$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment displacementVectorBuffer$hostAddressAt(long index) { return (MemorySegment) VH_displacementVectorBuffer$hostAddress.get(this.segment(), 0L, index); }
    public long displacementVectorStrideAt(long index) { return (long) VH_displacementVectorStride.get(this.segment(), 0L, index); }
    public long displacedMicromapPrimitiveFlags$deviceAddressAt(long index) { return (long) VH_displacedMicromapPrimitiveFlags$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment displacedMicromapPrimitiveFlags$hostAddressAt(long index) { return (MemorySegment) VH_displacedMicromapPrimitiveFlags$hostAddress.get(this.segment(), 0L, index); }
    public long displacedMicromapPrimitiveFlagsStrideAt(long index) { return (long) VH_displacedMicromapPrimitiveFlagsStride.get(this.segment(), 0L, index); }
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
    public int displacementBiasAndScaleFormat() { return (int) VH_displacementBiasAndScaleFormat.get(this.segment(), 0L, 0L); }
    public int displacementVectorFormat() { return (int) VH_displacementVectorFormat.get(this.segment(), 0L, 0L); }
    public long displacementBiasAndScaleBuffer$deviceAddress() { return (long) VH_displacementBiasAndScaleBuffer$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment displacementBiasAndScaleBuffer$hostAddress() { return (MemorySegment) VH_displacementBiasAndScaleBuffer$hostAddress.get(this.segment(), 0L, 0L); }
    public long displacementBiasAndScaleStride() { return (long) VH_displacementBiasAndScaleStride.get(this.segment(), 0L, 0L); }
    public long displacementVectorBuffer$deviceAddress() { return (long) VH_displacementVectorBuffer$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment displacementVectorBuffer$hostAddress() { return (MemorySegment) VH_displacementVectorBuffer$hostAddress.get(this.segment(), 0L, 0L); }
    public long displacementVectorStride() { return (long) VH_displacementVectorStride.get(this.segment(), 0L, 0L); }
    public long displacedMicromapPrimitiveFlags$deviceAddress() { return (long) VH_displacedMicromapPrimitiveFlags$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment displacedMicromapPrimitiveFlags$hostAddress() { return (MemorySegment) VH_displacedMicromapPrimitiveFlags$hostAddress.get(this.segment(), 0L, 0L); }
    public long displacedMicromapPrimitiveFlagsStride() { return (long) VH_displacedMicromapPrimitiveFlagsStride.get(this.segment(), 0L, 0L); }
    public int indexType() { return (int) VH_indexType.get(this.segment(), 0L, 0L); }
    public long indexBuffer$deviceAddress() { return (long) VH_indexBuffer$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment indexBuffer$hostAddress() { return (MemorySegment) VH_indexBuffer$hostAddress.get(this.segment(), 0L, 0L); }
    public long indexStride() { return (long) VH_indexStride.get(this.segment(), 0L, 0L); }
    public int baseTriangle() { return (int) VH_baseTriangle.get(this.segment(), 0L, 0L); }
    public int usageCountsCount() { return (int) VH_usageCountsCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pUsageCounts() { return (MemorySegment) VH_pUsageCounts.get(this.segment(), 0L, 0L); }
    public MemorySegment ppUsageCounts() { return (MemorySegment) VH_ppUsageCounts.get(this.segment(), 0L, 0L); }
    public long micromap() { return (long) VH_micromap.get(this.segment(), 0L, 0L); }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleFormatAt(long index, int value) { VH_displacementBiasAndScaleFormat.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorFormatAt(long index, int value) { VH_displacementVectorFormat.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleBuffer$deviceAddressAt(long index, long value) { VH_displacementBiasAndScaleBuffer$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleBuffer$hostAddressAt(long index, MemorySegment value) { VH_displacementBiasAndScaleBuffer$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleStrideAt(long index, long value) { VH_displacementBiasAndScaleStride.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorBuffer$deviceAddressAt(long index, long value) { VH_displacementVectorBuffer$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorBuffer$hostAddressAt(long index, MemorySegment value) { VH_displacementVectorBuffer$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorStrideAt(long index, long value) { VH_displacementVectorStride.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacedMicromapPrimitiveFlags$deviceAddressAt(long index, long value) { VH_displacedMicromapPrimitiveFlags$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacedMicromapPrimitiveFlags$hostAddressAt(long index, MemorySegment value) { VH_displacedMicromapPrimitiveFlags$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacedMicromapPrimitiveFlagsStrideAt(long index, long value) { VH_displacedMicromapPrimitiveFlagsStride.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV indexTypeAt(long index, int value) { VH_indexType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV indexBuffer$deviceAddressAt(long index, long value) { VH_indexBuffer$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV indexBuffer$hostAddressAt(long index, MemorySegment value) { VH_indexBuffer$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV indexStrideAt(long index, long value) { VH_indexStride.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV baseTriangleAt(long index, int value) { VH_baseTriangle.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV usageCountsCountAt(long index, int value) { VH_usageCountsCount.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV pUsageCountsAt(long index, MemorySegment value) { VH_pUsageCounts.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV ppUsageCountsAt(long index, MemorySegment value) { VH_ppUsageCounts.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV micromapAt(long index, long value) { VH_micromap.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleFormat(int value) { VH_displacementBiasAndScaleFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorFormat(int value) { VH_displacementVectorFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleBuffer$deviceAddress(long value) { VH_displacementBiasAndScaleBuffer$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleBuffer$hostAddress(MemorySegment value) { VH_displacementBiasAndScaleBuffer$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleStride(long value) { VH_displacementBiasAndScaleStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorBuffer$deviceAddress(long value) { VH_displacementVectorBuffer$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorBuffer$hostAddress(MemorySegment value) { VH_displacementVectorBuffer$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorStride(long value) { VH_displacementVectorStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacedMicromapPrimitiveFlags$deviceAddress(long value) { VH_displacedMicromapPrimitiveFlags$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacedMicromapPrimitiveFlags$hostAddress(MemorySegment value) { VH_displacedMicromapPrimitiveFlags$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacedMicromapPrimitiveFlagsStride(long value) { VH_displacedMicromapPrimitiveFlagsStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV indexType(int value) { VH_indexType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV indexBuffer$deviceAddress(long value) { VH_indexBuffer$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV indexBuffer$hostAddress(MemorySegment value) { VH_indexBuffer$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV indexStride(long value) { VH_indexStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV baseTriangle(int value) { VH_baseTriangle.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV usageCountsCount(int value) { VH_usageCountsCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV pUsageCounts(MemorySegment value) { VH_pUsageCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV ppUsageCounts(MemorySegment value) { VH_ppUsageCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV micromap(long value) { VH_micromap.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _displacementBiasAndScaleFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_displacementBiasAndScaleFormat, index), LAYOUT_displacementBiasAndScaleFormat); }
    public MemorySegment _displacementBiasAndScaleFormat() { return _displacementBiasAndScaleFormatAt(0L); }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _displacementBiasAndScaleFormatAt(long index, MemorySegment src) { _displacementBiasAndScaleFormatAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _displacementBiasAndScaleFormat(MemorySegment src) { return _displacementBiasAndScaleFormatAt(0L, src); }
    public MemorySegment _displacementVectorFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_displacementVectorFormat, index), LAYOUT_displacementVectorFormat); }
    public MemorySegment _displacementVectorFormat() { return _displacementVectorFormatAt(0L); }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _displacementVectorFormatAt(long index, MemorySegment src) { _displacementVectorFormatAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _displacementVectorFormat(MemorySegment src) { return _displacementVectorFormatAt(0L, src); }
    public MemorySegment _displacementBiasAndScaleBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_displacementBiasAndScaleBuffer, index), LAYOUT_displacementBiasAndScaleBuffer); }
    public MemorySegment _displacementBiasAndScaleBuffer() { return _displacementBiasAndScaleBufferAt(0L); }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _displacementBiasAndScaleBufferAt(long index, MemorySegment src) { _displacementBiasAndScaleBufferAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _displacementBiasAndScaleBuffer(MemorySegment src) { return _displacementBiasAndScaleBufferAt(0L, src); }
    public MemorySegment _displacementBiasAndScaleStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_displacementBiasAndScaleStride, index), LAYOUT_displacementBiasAndScaleStride); }
    public MemorySegment _displacementBiasAndScaleStride() { return _displacementBiasAndScaleStrideAt(0L); }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _displacementBiasAndScaleStrideAt(long index, MemorySegment src) { _displacementBiasAndScaleStrideAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _displacementBiasAndScaleStride(MemorySegment src) { return _displacementBiasAndScaleStrideAt(0L, src); }
    public MemorySegment _displacementVectorBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_displacementVectorBuffer, index), LAYOUT_displacementVectorBuffer); }
    public MemorySegment _displacementVectorBuffer() { return _displacementVectorBufferAt(0L); }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _displacementVectorBufferAt(long index, MemorySegment src) { _displacementVectorBufferAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _displacementVectorBuffer(MemorySegment src) { return _displacementVectorBufferAt(0L, src); }
    public MemorySegment _displacementVectorStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_displacementVectorStride, index), LAYOUT_displacementVectorStride); }
    public MemorySegment _displacementVectorStride() { return _displacementVectorStrideAt(0L); }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _displacementVectorStrideAt(long index, MemorySegment src) { _displacementVectorStrideAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _displacementVectorStride(MemorySegment src) { return _displacementVectorStrideAt(0L, src); }
    public MemorySegment _displacedMicromapPrimitiveFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_displacedMicromapPrimitiveFlags, index), LAYOUT_displacedMicromapPrimitiveFlags); }
    public MemorySegment _displacedMicromapPrimitiveFlags() { return _displacedMicromapPrimitiveFlagsAt(0L); }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _displacedMicromapPrimitiveFlagsAt(long index, MemorySegment src) { _displacedMicromapPrimitiveFlagsAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _displacedMicromapPrimitiveFlags(MemorySegment src) { return _displacedMicromapPrimitiveFlagsAt(0L, src); }
    public MemorySegment _displacedMicromapPrimitiveFlagsStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_displacedMicromapPrimitiveFlagsStride, index), LAYOUT_displacedMicromapPrimitiveFlagsStride); }
    public MemorySegment _displacedMicromapPrimitiveFlagsStride() { return _displacedMicromapPrimitiveFlagsStrideAt(0L); }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _displacedMicromapPrimitiveFlagsStrideAt(long index, MemorySegment src) { _displacedMicromapPrimitiveFlagsStrideAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _displacedMicromapPrimitiveFlagsStride(MemorySegment src) { return _displacedMicromapPrimitiveFlagsStrideAt(0L, src); }
    public MemorySegment _indexTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexType, index), LAYOUT_indexType); }
    public MemorySegment _indexType() { return _indexTypeAt(0L); }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _indexTypeAt(long index, MemorySegment src) { _indexTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _indexType(MemorySegment src) { return _indexTypeAt(0L, src); }
    public MemorySegment _indexBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexBuffer, index), LAYOUT_indexBuffer); }
    public MemorySegment _indexBuffer() { return _indexBufferAt(0L); }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _indexBufferAt(long index, MemorySegment src) { _indexBufferAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _indexBuffer(MemorySegment src) { return _indexBufferAt(0L, src); }
    public MemorySegment _indexStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexStride, index), LAYOUT_indexStride); }
    public MemorySegment _indexStride() { return _indexStrideAt(0L); }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _indexStrideAt(long index, MemorySegment src) { _indexStrideAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _indexStride(MemorySegment src) { return _indexStrideAt(0L, src); }
    public MemorySegment _baseTriangleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_baseTriangle, index), LAYOUT_baseTriangle); }
    public MemorySegment _baseTriangle() { return _baseTriangleAt(0L); }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _baseTriangleAt(long index, MemorySegment src) { _baseTriangleAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _baseTriangle(MemorySegment src) { return _baseTriangleAt(0L, src); }
    public MemorySegment _usageCountsCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_usageCountsCount, index), LAYOUT_usageCountsCount); }
    public MemorySegment _usageCountsCount() { return _usageCountsCountAt(0L); }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _usageCountsCountAt(long index, MemorySegment src) { _usageCountsCountAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _usageCountsCount(MemorySegment src) { return _usageCountsCountAt(0L, src); }
    public MemorySegment _pUsageCountsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pUsageCounts, index), LAYOUT_pUsageCounts); }
    public MemorySegment _pUsageCounts() { return _pUsageCountsAt(0L); }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _pUsageCountsAt(long index, MemorySegment src) { _pUsageCountsAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _pUsageCounts(MemorySegment src) { return _pUsageCountsAt(0L, src); }
    public MemorySegment _ppUsageCountsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ppUsageCounts, index), LAYOUT_ppUsageCounts); }
    public MemorySegment _ppUsageCounts() { return _ppUsageCountsAt(0L); }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _ppUsageCountsAt(long index, MemorySegment src) { _ppUsageCountsAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _ppUsageCounts(MemorySegment src) { return _ppUsageCountsAt(0L, src); }
    public MemorySegment _micromapAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_micromap, index), LAYOUT_micromap); }
    public MemorySegment _micromap() { return _micromapAt(0L); }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _micromapAt(long index, MemorySegment src) { _micromapAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureTrianglesDisplacementMicromapNV _micromap(MemorySegment src) { return _micromapAt(0L, src); }
}
