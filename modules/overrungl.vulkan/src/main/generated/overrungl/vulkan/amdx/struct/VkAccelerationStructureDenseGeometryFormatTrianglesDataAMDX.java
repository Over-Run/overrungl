// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amdx.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceOrHostAddressConstKHR compressedData;
///     VkDeviceSize dataSize;
///     uint32_t numTriangles;
///     uint32_t numVertices;
///     uint32_t maxPrimitiveIndex;
///     uint32_t maxGeometryIndex;
///     VkCompressedTriangleFormatAMDX format;
/// }
/// ```
public final class VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("compressedData"),
        ValueLayout.JAVA_LONG.withName("dataSize"),
        ValueLayout.JAVA_INT.withName("numTriangles"),
        ValueLayout.JAVA_INT.withName("numVertices"),
        ValueLayout.JAVA_INT.withName("maxPrimitiveIndex"),
        ValueLayout.JAVA_INT.withName("maxGeometryIndex"),
        ValueLayout.JAVA_INT.withName("format")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_compressedData = LAYOUT.byteOffset(PathElement.groupElement("compressedData"));
    public static final long OFFSET_dataSize = LAYOUT.byteOffset(PathElement.groupElement("dataSize"));
    public static final long OFFSET_numTriangles = LAYOUT.byteOffset(PathElement.groupElement("numTriangles"));
    public static final long OFFSET_numVertices = LAYOUT.byteOffset(PathElement.groupElement("numVertices"));
    public static final long OFFSET_maxPrimitiveIndex = LAYOUT.byteOffset(PathElement.groupElement("maxPrimitiveIndex"));
    public static final long OFFSET_maxGeometryIndex = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryIndex"));
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_compressedData = LAYOUT.select(PathElement.groupElement("compressedData"));
    public static final MemoryLayout LAYOUT_dataSize = LAYOUT.select(PathElement.groupElement("dataSize"));
    public static final MemoryLayout LAYOUT_numTriangles = LAYOUT.select(PathElement.groupElement("numTriangles"));
    public static final MemoryLayout LAYOUT_numVertices = LAYOUT.select(PathElement.groupElement("numVertices"));
    public static final MemoryLayout LAYOUT_maxPrimitiveIndex = LAYOUT.select(PathElement.groupElement("maxPrimitiveIndex"));
    public static final MemoryLayout LAYOUT_maxGeometryIndex = LAYOUT.select(PathElement.groupElement("maxGeometryIndex"));
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_compressedData$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compressedData"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_compressedData$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compressedData"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_dataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataSize"));
    public static final VarHandle VH_numTriangles = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numTriangles"));
    public static final VarHandle VH_numVertices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numVertices"));
    public static final VarHandle VH_maxPrimitiveIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPrimitiveIndex"));
    public static final VarHandle VH_maxGeometryIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryIndex"));
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));

    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(segment, estimateCount(segment, LAYOUT)); }
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX alloc(SegmentAllocator allocator) { return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(allocator.allocate(LAYOUT), 1); }
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(allocator.allocate(LAYOUT, count), count); }
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.amdx.VKAMDXDenseGeometryFormat.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DENSE_GEOMETRY_FORMAT_TRIANGLES_DATA_AMDX); }
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.amdx.VKAMDXDenseGeometryFormat.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DENSE_GEOMETRY_FORMAT_TRIANGLES_DATA_AMDX);
        return s;
    }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX copyFrom(VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX reinterpret(long count) { return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX asSlice(long index) { return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX asSlice(long index, long count) { return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX at(long index, Consumer<VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long compressedData$deviceAddressAt(long index) { return (long) VH_compressedData$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment compressedData$hostAddressAt(long index) { return (MemorySegment) VH_compressedData$hostAddress.get(this.segment(), 0L, index); }
    public long dataSizeAt(long index) { return (long) VH_dataSize.get(this.segment(), 0L, index); }
    public int numTrianglesAt(long index) { return (int) VH_numTriangles.get(this.segment(), 0L, index); }
    public int numVerticesAt(long index) { return (int) VH_numVertices.get(this.segment(), 0L, index); }
    public int maxPrimitiveIndexAt(long index) { return (int) VH_maxPrimitiveIndex.get(this.segment(), 0L, index); }
    public int maxGeometryIndexAt(long index) { return (int) VH_maxGeometryIndex.get(this.segment(), 0L, index); }
    public int formatAt(long index) { return (int) VH_format.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long compressedData$deviceAddress() { return (long) VH_compressedData$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment compressedData$hostAddress() { return (MemorySegment) VH_compressedData$hostAddress.get(this.segment(), 0L, 0L); }
    public long dataSize() { return (long) VH_dataSize.get(this.segment(), 0L, 0L); }
    public int numTriangles() { return (int) VH_numTriangles.get(this.segment(), 0L, 0L); }
    public int numVertices() { return (int) VH_numVertices.get(this.segment(), 0L, 0L); }
    public int maxPrimitiveIndex() { return (int) VH_maxPrimitiveIndex.get(this.segment(), 0L, 0L); }
    public int maxGeometryIndex() { return (int) VH_maxGeometryIndex.get(this.segment(), 0L, 0L); }
    public int format() { return (int) VH_format.get(this.segment(), 0L, 0L); }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX compressedData$deviceAddressAt(long index, long value) { VH_compressedData$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX compressedData$hostAddressAt(long index, MemorySegment value) { VH_compressedData$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX dataSizeAt(long index, long value) { VH_dataSize.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX numTrianglesAt(long index, int value) { VH_numTriangles.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX numVerticesAt(long index, int value) { VH_numVertices.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX maxPrimitiveIndexAt(long index, int value) { VH_maxPrimitiveIndex.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX maxGeometryIndexAt(long index, int value) { VH_maxGeometryIndex.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX formatAt(long index, int value) { VH_format.set(this.segment(), 0L, index, value); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX compressedData$deviceAddress(long value) { VH_compressedData$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX compressedData$hostAddress(MemorySegment value) { VH_compressedData$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX dataSize(long value) { VH_dataSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX numTriangles(int value) { VH_numTriangles.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX numVertices(int value) { VH_numVertices.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX maxPrimitiveIndex(int value) { VH_maxPrimitiveIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX maxGeometryIndex(int value) { VH_maxGeometryIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX format(int value) { VH_format.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _compressedDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_compressedData, index), LAYOUT_compressedData); }
    public MemorySegment _compressedData() { return _compressedDataAt(0L); }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX _compressedDataAt(long index, MemorySegment src) { _compressedDataAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX _compressedData(MemorySegment src) { return _compressedDataAt(0L, src); }
    public MemorySegment _dataSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dataSize, index), LAYOUT_dataSize); }
    public MemorySegment _dataSize() { return _dataSizeAt(0L); }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX _dataSizeAt(long index, MemorySegment src) { _dataSizeAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX _dataSize(MemorySegment src) { return _dataSizeAt(0L, src); }
    public MemorySegment _numTrianglesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_numTriangles, index), LAYOUT_numTriangles); }
    public MemorySegment _numTriangles() { return _numTrianglesAt(0L); }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX _numTrianglesAt(long index, MemorySegment src) { _numTrianglesAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX _numTriangles(MemorySegment src) { return _numTrianglesAt(0L, src); }
    public MemorySegment _numVerticesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_numVertices, index), LAYOUT_numVertices); }
    public MemorySegment _numVertices() { return _numVerticesAt(0L); }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX _numVerticesAt(long index, MemorySegment src) { _numVerticesAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX _numVertices(MemorySegment src) { return _numVerticesAt(0L, src); }
    public MemorySegment _maxPrimitiveIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPrimitiveIndex, index), LAYOUT_maxPrimitiveIndex); }
    public MemorySegment _maxPrimitiveIndex() { return _maxPrimitiveIndexAt(0L); }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX _maxPrimitiveIndexAt(long index, MemorySegment src) { _maxPrimitiveIndexAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX _maxPrimitiveIndex(MemorySegment src) { return _maxPrimitiveIndexAt(0L, src); }
    public MemorySegment _maxGeometryIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxGeometryIndex, index), LAYOUT_maxGeometryIndex); }
    public MemorySegment _maxGeometryIndex() { return _maxGeometryIndexAt(0L); }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX _maxGeometryIndexAt(long index, MemorySegment src) { _maxGeometryIndexAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX _maxGeometryIndex(MemorySegment src) { return _maxGeometryIndexAt(0L, src); }
    public MemorySegment _formatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_format, index), LAYOUT_format); }
    public MemorySegment _format() { return _formatAt(0L); }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX _formatAt(long index, MemorySegment src) { _formatAt(index).copyFrom(src); return this; }
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX _format(MemorySegment src) { return _formatAt(0L, src); }
}
