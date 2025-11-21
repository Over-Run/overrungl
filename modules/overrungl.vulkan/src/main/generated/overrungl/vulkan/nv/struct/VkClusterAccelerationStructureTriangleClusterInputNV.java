// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkClusterAccelerationStructureTriangleClusterInputNV`.
/// ## Layout
/// ```
/// struct VkClusterAccelerationStructureTriangleClusterInputNV {
///     VkStructureType sType;
///     void* pNext;
///     VkFormat vertexFormat;
///     uint32_t maxGeometryIndexValue;
///     uint32_t maxClusterUniqueGeometryCount;
///     uint32_t maxClusterTriangleCount;
///     uint32_t maxClusterVertexCount;
///     uint32_t maxTotalTriangleCount;
///     uint32_t maxTotalVertexCount;
///     uint32_t minPositionTruncateBitCount;
/// }
/// ```
public final class VkClusterAccelerationStructureTriangleClusterInputNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexFormat"),
        ValueLayout.JAVA_INT.withName("maxGeometryIndexValue"),
        ValueLayout.JAVA_INT.withName("maxClusterUniqueGeometryCount"),
        ValueLayout.JAVA_INT.withName("maxClusterTriangleCount"),
        ValueLayout.JAVA_INT.withName("maxClusterVertexCount"),
        ValueLayout.JAVA_INT.withName("maxTotalTriangleCount"),
        ValueLayout.JAVA_INT.withName("maxTotalVertexCount"),
        ValueLayout.JAVA_INT.withName("minPositionTruncateBitCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_vertexFormat = LAYOUT.byteOffset(PathElement.groupElement("vertexFormat"));
    public static final long OFFSET_maxGeometryIndexValue = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryIndexValue"));
    public static final long OFFSET_maxClusterUniqueGeometryCount = LAYOUT.byteOffset(PathElement.groupElement("maxClusterUniqueGeometryCount"));
    public static final long OFFSET_maxClusterTriangleCount = LAYOUT.byteOffset(PathElement.groupElement("maxClusterTriangleCount"));
    public static final long OFFSET_maxClusterVertexCount = LAYOUT.byteOffset(PathElement.groupElement("maxClusterVertexCount"));
    public static final long OFFSET_maxTotalTriangleCount = LAYOUT.byteOffset(PathElement.groupElement("maxTotalTriangleCount"));
    public static final long OFFSET_maxTotalVertexCount = LAYOUT.byteOffset(PathElement.groupElement("maxTotalVertexCount"));
    public static final long OFFSET_minPositionTruncateBitCount = LAYOUT.byteOffset(PathElement.groupElement("minPositionTruncateBitCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_vertexFormat = LAYOUT.select(PathElement.groupElement("vertexFormat"));
    public static final MemoryLayout LAYOUT_maxGeometryIndexValue = LAYOUT.select(PathElement.groupElement("maxGeometryIndexValue"));
    public static final MemoryLayout LAYOUT_maxClusterUniqueGeometryCount = LAYOUT.select(PathElement.groupElement("maxClusterUniqueGeometryCount"));
    public static final MemoryLayout LAYOUT_maxClusterTriangleCount = LAYOUT.select(PathElement.groupElement("maxClusterTriangleCount"));
    public static final MemoryLayout LAYOUT_maxClusterVertexCount = LAYOUT.select(PathElement.groupElement("maxClusterVertexCount"));
    public static final MemoryLayout LAYOUT_maxTotalTriangleCount = LAYOUT.select(PathElement.groupElement("maxTotalTriangleCount"));
    public static final MemoryLayout LAYOUT_maxTotalVertexCount = LAYOUT.select(PathElement.groupElement("maxTotalVertexCount"));
    public static final MemoryLayout LAYOUT_minPositionTruncateBitCount = LAYOUT.select(PathElement.groupElement("minPositionTruncateBitCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_vertexFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexFormat"));
    public static final VarHandle VH_maxGeometryIndexValue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryIndexValue"));
    public static final VarHandle VH_maxClusterUniqueGeometryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxClusterUniqueGeometryCount"));
    public static final VarHandle VH_maxClusterTriangleCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxClusterTriangleCount"));
    public static final VarHandle VH_maxClusterVertexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxClusterVertexCount"));
    public static final VarHandle VH_maxTotalTriangleCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTotalTriangleCount"));
    public static final VarHandle VH_maxTotalVertexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTotalVertexCount"));
    public static final VarHandle VH_minPositionTruncateBitCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minPositionTruncateBitCount"));

    public VkClusterAccelerationStructureTriangleClusterInputNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkClusterAccelerationStructureTriangleClusterInputNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureTriangleClusterInputNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkClusterAccelerationStructureTriangleClusterInputNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureTriangleClusterInputNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkClusterAccelerationStructureTriangleClusterInputNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureTriangleClusterInputNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkClusterAccelerationStructureTriangleClusterInputNV alloc(SegmentAllocator allocator) { return new VkClusterAccelerationStructureTriangleClusterInputNV(allocator.allocate(LAYOUT), 1); }
    public static VkClusterAccelerationStructureTriangleClusterInputNV alloc(SegmentAllocator allocator, long count) { return new VkClusterAccelerationStructureTriangleClusterInputNV(allocator.allocate(LAYOUT, count), count); }
    public static VkClusterAccelerationStructureTriangleClusterInputNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_TRIANGLE_CLUSTER_INPUT_NV); }
    public static VkClusterAccelerationStructureTriangleClusterInputNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_TRIANGLE_CLUSTER_INPUT_NV);
        return s;
    }
    public VkClusterAccelerationStructureTriangleClusterInputNV copyFrom(VkClusterAccelerationStructureTriangleClusterInputNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV reinterpret(long count) { return new VkClusterAccelerationStructureTriangleClusterInputNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkClusterAccelerationStructureTriangleClusterInputNV asSlice(long index) { return new VkClusterAccelerationStructureTriangleClusterInputNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkClusterAccelerationStructureTriangleClusterInputNV asSlice(long index, long count) { return new VkClusterAccelerationStructureTriangleClusterInputNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkClusterAccelerationStructureTriangleClusterInputNV at(long index, Consumer<VkClusterAccelerationStructureTriangleClusterInputNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int vertexFormatAt(long index) { return (int) VH_vertexFormat.get(this.segment(), 0L, index); }
    public int maxGeometryIndexValueAt(long index) { return (int) VH_maxGeometryIndexValue.get(this.segment(), 0L, index); }
    public int maxClusterUniqueGeometryCountAt(long index) { return (int) VH_maxClusterUniqueGeometryCount.get(this.segment(), 0L, index); }
    public int maxClusterTriangleCountAt(long index) { return (int) VH_maxClusterTriangleCount.get(this.segment(), 0L, index); }
    public int maxClusterVertexCountAt(long index) { return (int) VH_maxClusterVertexCount.get(this.segment(), 0L, index); }
    public int maxTotalTriangleCountAt(long index) { return (int) VH_maxTotalTriangleCount.get(this.segment(), 0L, index); }
    public int maxTotalVertexCountAt(long index) { return (int) VH_maxTotalVertexCount.get(this.segment(), 0L, index); }
    public int minPositionTruncateBitCountAt(long index) { return (int) VH_minPositionTruncateBitCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int vertexFormat() { return (int) VH_vertexFormat.get(this.segment(), 0L, 0L); }
    public int maxGeometryIndexValue() { return (int) VH_maxGeometryIndexValue.get(this.segment(), 0L, 0L); }
    public int maxClusterUniqueGeometryCount() { return (int) VH_maxClusterUniqueGeometryCount.get(this.segment(), 0L, 0L); }
    public int maxClusterTriangleCount() { return (int) VH_maxClusterTriangleCount.get(this.segment(), 0L, 0L); }
    public int maxClusterVertexCount() { return (int) VH_maxClusterVertexCount.get(this.segment(), 0L, 0L); }
    public int maxTotalTriangleCount() { return (int) VH_maxTotalTriangleCount.get(this.segment(), 0L, 0L); }
    public int maxTotalVertexCount() { return (int) VH_maxTotalVertexCount.get(this.segment(), 0L, 0L); }
    public int minPositionTruncateBitCount() { return (int) VH_minPositionTruncateBitCount.get(this.segment(), 0L, 0L); }
    public VkClusterAccelerationStructureTriangleClusterInputNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV vertexFormatAt(long index, int value) { VH_vertexFormat.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV maxGeometryIndexValueAt(long index, int value) { VH_maxGeometryIndexValue.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV maxClusterUniqueGeometryCountAt(long index, int value) { VH_maxClusterUniqueGeometryCount.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV maxClusterTriangleCountAt(long index, int value) { VH_maxClusterTriangleCount.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV maxClusterVertexCountAt(long index, int value) { VH_maxClusterVertexCount.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV maxTotalTriangleCountAt(long index, int value) { VH_maxTotalTriangleCount.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV maxTotalVertexCountAt(long index, int value) { VH_maxTotalVertexCount.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV minPositionTruncateBitCountAt(long index, int value) { VH_minPositionTruncateBitCount.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV vertexFormat(int value) { VH_vertexFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV maxGeometryIndexValue(int value) { VH_maxGeometryIndexValue.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV maxClusterUniqueGeometryCount(int value) { VH_maxClusterUniqueGeometryCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV maxClusterTriangleCount(int value) { VH_maxClusterTriangleCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV maxClusterVertexCount(int value) { VH_maxClusterVertexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV maxTotalTriangleCount(int value) { VH_maxTotalTriangleCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV maxTotalVertexCount(int value) { VH_maxTotalVertexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV minPositionTruncateBitCount(int value) { VH_minPositionTruncateBitCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkClusterAccelerationStructureTriangleClusterInputNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkClusterAccelerationStructureTriangleClusterInputNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _vertexFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexFormat, index), LAYOUT_vertexFormat); }
    public MemorySegment _vertexFormat() { return _vertexFormatAt(0L); }
    public VkClusterAccelerationStructureTriangleClusterInputNV _vertexFormatAt(long index, MemorySegment src) { _vertexFormatAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV _vertexFormat(MemorySegment src) { return _vertexFormatAt(0L, src); }
    public MemorySegment _maxGeometryIndexValueAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxGeometryIndexValue, index), LAYOUT_maxGeometryIndexValue); }
    public MemorySegment _maxGeometryIndexValue() { return _maxGeometryIndexValueAt(0L); }
    public VkClusterAccelerationStructureTriangleClusterInputNV _maxGeometryIndexValueAt(long index, MemorySegment src) { _maxGeometryIndexValueAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV _maxGeometryIndexValue(MemorySegment src) { return _maxGeometryIndexValueAt(0L, src); }
    public MemorySegment _maxClusterUniqueGeometryCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxClusterUniqueGeometryCount, index), LAYOUT_maxClusterUniqueGeometryCount); }
    public MemorySegment _maxClusterUniqueGeometryCount() { return _maxClusterUniqueGeometryCountAt(0L); }
    public VkClusterAccelerationStructureTriangleClusterInputNV _maxClusterUniqueGeometryCountAt(long index, MemorySegment src) { _maxClusterUniqueGeometryCountAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV _maxClusterUniqueGeometryCount(MemorySegment src) { return _maxClusterUniqueGeometryCountAt(0L, src); }
    public MemorySegment _maxClusterTriangleCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxClusterTriangleCount, index), LAYOUT_maxClusterTriangleCount); }
    public MemorySegment _maxClusterTriangleCount() { return _maxClusterTriangleCountAt(0L); }
    public VkClusterAccelerationStructureTriangleClusterInputNV _maxClusterTriangleCountAt(long index, MemorySegment src) { _maxClusterTriangleCountAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV _maxClusterTriangleCount(MemorySegment src) { return _maxClusterTriangleCountAt(0L, src); }
    public MemorySegment _maxClusterVertexCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxClusterVertexCount, index), LAYOUT_maxClusterVertexCount); }
    public MemorySegment _maxClusterVertexCount() { return _maxClusterVertexCountAt(0L); }
    public VkClusterAccelerationStructureTriangleClusterInputNV _maxClusterVertexCountAt(long index, MemorySegment src) { _maxClusterVertexCountAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV _maxClusterVertexCount(MemorySegment src) { return _maxClusterVertexCountAt(0L, src); }
    public MemorySegment _maxTotalTriangleCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTotalTriangleCount, index), LAYOUT_maxTotalTriangleCount); }
    public MemorySegment _maxTotalTriangleCount() { return _maxTotalTriangleCountAt(0L); }
    public VkClusterAccelerationStructureTriangleClusterInputNV _maxTotalTriangleCountAt(long index, MemorySegment src) { _maxTotalTriangleCountAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV _maxTotalTriangleCount(MemorySegment src) { return _maxTotalTriangleCountAt(0L, src); }
    public MemorySegment _maxTotalVertexCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTotalVertexCount, index), LAYOUT_maxTotalVertexCount); }
    public MemorySegment _maxTotalVertexCount() { return _maxTotalVertexCountAt(0L); }
    public VkClusterAccelerationStructureTriangleClusterInputNV _maxTotalVertexCountAt(long index, MemorySegment src) { _maxTotalVertexCountAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV _maxTotalVertexCount(MemorySegment src) { return _maxTotalVertexCountAt(0L, src); }
    public MemorySegment _minPositionTruncateBitCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minPositionTruncateBitCount, index), LAYOUT_minPositionTruncateBitCount); }
    public MemorySegment _minPositionTruncateBitCount() { return _minPositionTruncateBitCountAt(0L); }
    public VkClusterAccelerationStructureTriangleClusterInputNV _minPositionTruncateBitCountAt(long index, MemorySegment src) { _minPositionTruncateBitCountAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureTriangleClusterInputNV _minPositionTruncateBitCount(MemorySegment src) { return _minPositionTruncateBitCountAt(0L, src); }
}
