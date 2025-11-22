// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkGeometryTrianglesNV`.
/// ## Layout
/// ```
/// struct VkGeometryTrianglesNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkBuffer vertexData;
///     VkDeviceSize vertexOffset;
///     uint32_t vertexCount;
///     VkDeviceSize vertexStride;
///     VkFormat vertexFormat;
///     VkBuffer indexData;
///     VkDeviceSize indexOffset;
///     uint32_t indexCount;
///     VkIndexType indexType;
///     VkBuffer transformData;
///     VkDeviceSize transformOffset;
/// }
/// ```
public final class VkGeometryTrianglesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("vertexData"),
        ValueLayout.JAVA_LONG.withName("vertexOffset"),
        ValueLayout.JAVA_INT.withName("vertexCount"),
        ValueLayout.JAVA_LONG.withName("vertexStride"),
        ValueLayout.JAVA_INT.withName("vertexFormat"),
        ValueLayout.JAVA_LONG.withName("indexData"),
        ValueLayout.JAVA_LONG.withName("indexOffset"),
        ValueLayout.JAVA_INT.withName("indexCount"),
        ValueLayout.JAVA_INT.withName("indexType"),
        ValueLayout.JAVA_LONG.withName("transformData"),
        ValueLayout.JAVA_LONG.withName("transformOffset")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_vertexData = LAYOUT.byteOffset(PathElement.groupElement("vertexData"));
    public static final long OFFSET_vertexOffset = LAYOUT.byteOffset(PathElement.groupElement("vertexOffset"));
    public static final long OFFSET_vertexCount = LAYOUT.byteOffset(PathElement.groupElement("vertexCount"));
    public static final long OFFSET_vertexStride = LAYOUT.byteOffset(PathElement.groupElement("vertexStride"));
    public static final long OFFSET_vertexFormat = LAYOUT.byteOffset(PathElement.groupElement("vertexFormat"));
    public static final long OFFSET_indexData = LAYOUT.byteOffset(PathElement.groupElement("indexData"));
    public static final long OFFSET_indexOffset = LAYOUT.byteOffset(PathElement.groupElement("indexOffset"));
    public static final long OFFSET_indexCount = LAYOUT.byteOffset(PathElement.groupElement("indexCount"));
    public static final long OFFSET_indexType = LAYOUT.byteOffset(PathElement.groupElement("indexType"));
    public static final long OFFSET_transformData = LAYOUT.byteOffset(PathElement.groupElement("transformData"));
    public static final long OFFSET_transformOffset = LAYOUT.byteOffset(PathElement.groupElement("transformOffset"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_vertexData = LAYOUT.select(PathElement.groupElement("vertexData"));
    public static final MemoryLayout LAYOUT_vertexOffset = LAYOUT.select(PathElement.groupElement("vertexOffset"));
    public static final MemoryLayout LAYOUT_vertexCount = LAYOUT.select(PathElement.groupElement("vertexCount"));
    public static final MemoryLayout LAYOUT_vertexStride = LAYOUT.select(PathElement.groupElement("vertexStride"));
    public static final MemoryLayout LAYOUT_vertexFormat = LAYOUT.select(PathElement.groupElement("vertexFormat"));
    public static final MemoryLayout LAYOUT_indexData = LAYOUT.select(PathElement.groupElement("indexData"));
    public static final MemoryLayout LAYOUT_indexOffset = LAYOUT.select(PathElement.groupElement("indexOffset"));
    public static final MemoryLayout LAYOUT_indexCount = LAYOUT.select(PathElement.groupElement("indexCount"));
    public static final MemoryLayout LAYOUT_indexType = LAYOUT.select(PathElement.groupElement("indexType"));
    public static final MemoryLayout LAYOUT_transformData = LAYOUT.select(PathElement.groupElement("transformData"));
    public static final MemoryLayout LAYOUT_transformOffset = LAYOUT.select(PathElement.groupElement("transformOffset"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_vertexData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexData"));
    public static final VarHandle VH_vertexOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexOffset"));
    public static final VarHandle VH_vertexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexCount"));
    public static final VarHandle VH_vertexStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexStride"));
    public static final VarHandle VH_vertexFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexFormat"));
    public static final VarHandle VH_indexData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexData"));
    public static final VarHandle VH_indexOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexOffset"));
    public static final VarHandle VH_indexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexCount"));
    public static final VarHandle VH_indexType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexType"));
    public static final VarHandle VH_transformData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformData"));
    public static final VarHandle VH_transformOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformOffset"));

    public VkGeometryTrianglesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkGeometryTrianglesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryTrianglesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkGeometryTrianglesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryTrianglesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkGeometryTrianglesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryTrianglesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkGeometryTrianglesNV alloc(SegmentAllocator allocator) { return new VkGeometryTrianglesNV(allocator.allocate(LAYOUT), 1); }
    public static VkGeometryTrianglesNV alloc(SegmentAllocator allocator, long count) { return new VkGeometryTrianglesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkGeometryTrianglesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVRayTracing.VK_STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV); }
    public static VkGeometryTrianglesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVRayTracing.VK_STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV);
        return s;
    }
    public VkGeometryTrianglesNV copyFrom(VkGeometryTrianglesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkGeometryTrianglesNV reinterpret(long count) { return new VkGeometryTrianglesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkGeometryTrianglesNV asSlice(long index) { return new VkGeometryTrianglesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkGeometryTrianglesNV asSlice(long index, long count) { return new VkGeometryTrianglesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkGeometryTrianglesNV at(long index, Consumer<VkGeometryTrianglesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long vertexDataAt(long index) { return (long) VH_vertexData.get(this.segment(), 0L, index); }
    public long vertexOffsetAt(long index) { return (long) VH_vertexOffset.get(this.segment(), 0L, index); }
    public int vertexCountAt(long index) { return (int) VH_vertexCount.get(this.segment(), 0L, index); }
    public long vertexStrideAt(long index) { return (long) VH_vertexStride.get(this.segment(), 0L, index); }
    public int vertexFormatAt(long index) { return (int) VH_vertexFormat.get(this.segment(), 0L, index); }
    public long indexDataAt(long index) { return (long) VH_indexData.get(this.segment(), 0L, index); }
    public long indexOffsetAt(long index) { return (long) VH_indexOffset.get(this.segment(), 0L, index); }
    public int indexCountAt(long index) { return (int) VH_indexCount.get(this.segment(), 0L, index); }
    public int indexTypeAt(long index) { return (int) VH_indexType.get(this.segment(), 0L, index); }
    public long transformDataAt(long index) { return (long) VH_transformData.get(this.segment(), 0L, index); }
    public long transformOffsetAt(long index) { return (long) VH_transformOffset.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long vertexData() { return (long) VH_vertexData.get(this.segment(), 0L, 0L); }
    public long vertexOffset() { return (long) VH_vertexOffset.get(this.segment(), 0L, 0L); }
    public int vertexCount() { return (int) VH_vertexCount.get(this.segment(), 0L, 0L); }
    public long vertexStride() { return (long) VH_vertexStride.get(this.segment(), 0L, 0L); }
    public int vertexFormat() { return (int) VH_vertexFormat.get(this.segment(), 0L, 0L); }
    public long indexData() { return (long) VH_indexData.get(this.segment(), 0L, 0L); }
    public long indexOffset() { return (long) VH_indexOffset.get(this.segment(), 0L, 0L); }
    public int indexCount() { return (int) VH_indexCount.get(this.segment(), 0L, 0L); }
    public int indexType() { return (int) VH_indexType.get(this.segment(), 0L, 0L); }
    public long transformData() { return (long) VH_transformData.get(this.segment(), 0L, 0L); }
    public long transformOffset() { return (long) VH_transformOffset.get(this.segment(), 0L, 0L); }
    public VkGeometryTrianglesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryTrianglesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryTrianglesNV vertexDataAt(long index, long value) { VH_vertexData.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryTrianglesNV vertexOffsetAt(long index, long value) { VH_vertexOffset.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryTrianglesNV vertexCountAt(long index, int value) { VH_vertexCount.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryTrianglesNV vertexStrideAt(long index, long value) { VH_vertexStride.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryTrianglesNV vertexFormatAt(long index, int value) { VH_vertexFormat.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryTrianglesNV indexDataAt(long index, long value) { VH_indexData.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryTrianglesNV indexOffsetAt(long index, long value) { VH_indexOffset.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryTrianglesNV indexCountAt(long index, int value) { VH_indexCount.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryTrianglesNV indexTypeAt(long index, int value) { VH_indexType.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryTrianglesNV transformDataAt(long index, long value) { VH_transformData.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryTrianglesNV transformOffsetAt(long index, long value) { VH_transformOffset.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryTrianglesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryTrianglesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryTrianglesNV vertexData(long value) { VH_vertexData.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryTrianglesNV vertexOffset(long value) { VH_vertexOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryTrianglesNV vertexCount(int value) { VH_vertexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryTrianglesNV vertexStride(long value) { VH_vertexStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryTrianglesNV vertexFormat(int value) { VH_vertexFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryTrianglesNV indexData(long value) { VH_indexData.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryTrianglesNV indexOffset(long value) { VH_indexOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryTrianglesNV indexCount(int value) { VH_indexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryTrianglesNV indexType(int value) { VH_indexType.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryTrianglesNV transformData(long value) { VH_transformData.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryTrianglesNV transformOffset(long value) { VH_transformOffset.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkGeometryTrianglesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkGeometryTrianglesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkGeometryTrianglesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkGeometryTrianglesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _vertexDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexData, index), LAYOUT_vertexData); }
    public MemorySegment _vertexData() { return _vertexDataAt(0L); }
    public VkGeometryTrianglesNV _vertexDataAt(long index, MemorySegment src) { _vertexDataAt(index).copyFrom(src); return this; }
    public VkGeometryTrianglesNV _vertexData(MemorySegment src) { return _vertexDataAt(0L, src); }
    public MemorySegment _vertexOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexOffset, index), LAYOUT_vertexOffset); }
    public MemorySegment _vertexOffset() { return _vertexOffsetAt(0L); }
    public VkGeometryTrianglesNV _vertexOffsetAt(long index, MemorySegment src) { _vertexOffsetAt(index).copyFrom(src); return this; }
    public VkGeometryTrianglesNV _vertexOffset(MemorySegment src) { return _vertexOffsetAt(0L, src); }
    public MemorySegment _vertexCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexCount, index), LAYOUT_vertexCount); }
    public MemorySegment _vertexCount() { return _vertexCountAt(0L); }
    public VkGeometryTrianglesNV _vertexCountAt(long index, MemorySegment src) { _vertexCountAt(index).copyFrom(src); return this; }
    public VkGeometryTrianglesNV _vertexCount(MemorySegment src) { return _vertexCountAt(0L, src); }
    public MemorySegment _vertexStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexStride, index), LAYOUT_vertexStride); }
    public MemorySegment _vertexStride() { return _vertexStrideAt(0L); }
    public VkGeometryTrianglesNV _vertexStrideAt(long index, MemorySegment src) { _vertexStrideAt(index).copyFrom(src); return this; }
    public VkGeometryTrianglesNV _vertexStride(MemorySegment src) { return _vertexStrideAt(0L, src); }
    public MemorySegment _vertexFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexFormat, index), LAYOUT_vertexFormat); }
    public MemorySegment _vertexFormat() { return _vertexFormatAt(0L); }
    public VkGeometryTrianglesNV _vertexFormatAt(long index, MemorySegment src) { _vertexFormatAt(index).copyFrom(src); return this; }
    public VkGeometryTrianglesNV _vertexFormat(MemorySegment src) { return _vertexFormatAt(0L, src); }
    public MemorySegment _indexDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexData, index), LAYOUT_indexData); }
    public MemorySegment _indexData() { return _indexDataAt(0L); }
    public VkGeometryTrianglesNV _indexDataAt(long index, MemorySegment src) { _indexDataAt(index).copyFrom(src); return this; }
    public VkGeometryTrianglesNV _indexData(MemorySegment src) { return _indexDataAt(0L, src); }
    public MemorySegment _indexOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexOffset, index), LAYOUT_indexOffset); }
    public MemorySegment _indexOffset() { return _indexOffsetAt(0L); }
    public VkGeometryTrianglesNV _indexOffsetAt(long index, MemorySegment src) { _indexOffsetAt(index).copyFrom(src); return this; }
    public VkGeometryTrianglesNV _indexOffset(MemorySegment src) { return _indexOffsetAt(0L, src); }
    public MemorySegment _indexCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexCount, index), LAYOUT_indexCount); }
    public MemorySegment _indexCount() { return _indexCountAt(0L); }
    public VkGeometryTrianglesNV _indexCountAt(long index, MemorySegment src) { _indexCountAt(index).copyFrom(src); return this; }
    public VkGeometryTrianglesNV _indexCount(MemorySegment src) { return _indexCountAt(0L, src); }
    public MemorySegment _indexTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexType, index), LAYOUT_indexType); }
    public MemorySegment _indexType() { return _indexTypeAt(0L); }
    public VkGeometryTrianglesNV _indexTypeAt(long index, MemorySegment src) { _indexTypeAt(index).copyFrom(src); return this; }
    public VkGeometryTrianglesNV _indexType(MemorySegment src) { return _indexTypeAt(0L, src); }
    public MemorySegment _transformDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_transformData, index), LAYOUT_transformData); }
    public MemorySegment _transformData() { return _transformDataAt(0L); }
    public VkGeometryTrianglesNV _transformDataAt(long index, MemorySegment src) { _transformDataAt(index).copyFrom(src); return this; }
    public VkGeometryTrianglesNV _transformData(MemorySegment src) { return _transformDataAt(0L, src); }
    public MemorySegment _transformOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_transformOffset, index), LAYOUT_transformOffset); }
    public MemorySegment _transformOffset() { return _transformOffsetAt(0L); }
    public VkGeometryTrianglesNV _transformOffsetAt(long index, MemorySegment src) { _transformOffsetAt(index).copyFrom(src); return this; }
    public VkGeometryTrianglesNV _transformOffset(MemorySegment src) { return _transformOffsetAt(0L, src); }
}
