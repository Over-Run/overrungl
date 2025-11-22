// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkGeometryNV`.
/// ## Layout
/// ```
/// struct VkGeometryNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkGeometryTypeKHR geometryType;
///     VkGeometryDataNV geometry;
///     VkGeometryFlagsKHR flags;
/// }
/// ```
public final class VkGeometryNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("geometryType"),
        overrungl.vulkan.nv.struct.VkGeometryDataNV.LAYOUT.withName("geometry"),
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
    public static final VarHandle VH_geometry$triangles$vertexData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("triangles"), PathElement.groupElement("vertexData"));
    public static final VarHandle VH_geometry$triangles$vertexOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("triangles"), PathElement.groupElement("vertexOffset"));
    public static final VarHandle VH_geometry$triangles$vertexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("triangles"), PathElement.groupElement("vertexCount"));
    public static final VarHandle VH_geometry$triangles$vertexStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("triangles"), PathElement.groupElement("vertexStride"));
    public static final VarHandle VH_geometry$triangles$vertexFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("triangles"), PathElement.groupElement("vertexFormat"));
    public static final VarHandle VH_geometry$triangles$indexData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("triangles"), PathElement.groupElement("indexData"));
    public static final VarHandle VH_geometry$triangles$indexOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("triangles"), PathElement.groupElement("indexOffset"));
    public static final VarHandle VH_geometry$triangles$indexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("triangles"), PathElement.groupElement("indexCount"));
    public static final VarHandle VH_geometry$triangles$indexType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("triangles"), PathElement.groupElement("indexType"));
    public static final VarHandle VH_geometry$triangles$transformData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("triangles"), PathElement.groupElement("transformData"));
    public static final VarHandle VH_geometry$triangles$transformOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("triangles"), PathElement.groupElement("transformOffset"));
    public static final VarHandle VH_geometry$aabbs$sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("aabbs"), PathElement.groupElement("sType"));
    public static final VarHandle VH_geometry$aabbs$pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("aabbs"), PathElement.groupElement("pNext"));
    public static final VarHandle VH_geometry$aabbs$aabbData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("aabbs"), PathElement.groupElement("aabbData"));
    public static final VarHandle VH_geometry$aabbs$numAABBs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("aabbs"), PathElement.groupElement("numAABBs"));
    public static final VarHandle VH_geometry$aabbs$stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("aabbs"), PathElement.groupElement("stride"));
    public static final VarHandle VH_geometry$aabbs$offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometry"), PathElement.groupElement("aabbs"), PathElement.groupElement("offset"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    public VkGeometryNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkGeometryNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkGeometryNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkGeometryNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkGeometryNV alloc(SegmentAllocator allocator) { return new VkGeometryNV(allocator.allocate(LAYOUT), 1); }
    public static VkGeometryNV alloc(SegmentAllocator allocator, long count) { return new VkGeometryNV(allocator.allocate(LAYOUT, count), count); }
    public static VkGeometryNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVRayTracing.VK_STRUCTURE_TYPE_GEOMETRY_NV); }
    public static VkGeometryNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVRayTracing.VK_STRUCTURE_TYPE_GEOMETRY_NV);
        return s;
    }
    public VkGeometryNV copyFrom(VkGeometryNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkGeometryNV reinterpret(long count) { return new VkGeometryNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkGeometryNV asSlice(long index) { return new VkGeometryNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkGeometryNV asSlice(long index, long count) { return new VkGeometryNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkGeometryNV at(long index, Consumer<VkGeometryNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int geometryTypeAt(long index) { return (int) VH_geometryType.get(this.segment(), 0L, index); }
    public int geometry$triangles$sTypeAt(long index) { return (int) VH_geometry$triangles$sType.get(this.segment(), 0L, index); }
    public MemorySegment geometry$triangles$pNextAt(long index) { return (MemorySegment) VH_geometry$triangles$pNext.get(this.segment(), 0L, index); }
    public long geometry$triangles$vertexDataAt(long index) { return (long) VH_geometry$triangles$vertexData.get(this.segment(), 0L, index); }
    public long geometry$triangles$vertexOffsetAt(long index) { return (long) VH_geometry$triangles$vertexOffset.get(this.segment(), 0L, index); }
    public int geometry$triangles$vertexCountAt(long index) { return (int) VH_geometry$triangles$vertexCount.get(this.segment(), 0L, index); }
    public long geometry$triangles$vertexStrideAt(long index) { return (long) VH_geometry$triangles$vertexStride.get(this.segment(), 0L, index); }
    public int geometry$triangles$vertexFormatAt(long index) { return (int) VH_geometry$triangles$vertexFormat.get(this.segment(), 0L, index); }
    public long geometry$triangles$indexDataAt(long index) { return (long) VH_geometry$triangles$indexData.get(this.segment(), 0L, index); }
    public long geometry$triangles$indexOffsetAt(long index) { return (long) VH_geometry$triangles$indexOffset.get(this.segment(), 0L, index); }
    public int geometry$triangles$indexCountAt(long index) { return (int) VH_geometry$triangles$indexCount.get(this.segment(), 0L, index); }
    public int geometry$triangles$indexTypeAt(long index) { return (int) VH_geometry$triangles$indexType.get(this.segment(), 0L, index); }
    public long geometry$triangles$transformDataAt(long index) { return (long) VH_geometry$triangles$transformData.get(this.segment(), 0L, index); }
    public long geometry$triangles$transformOffsetAt(long index) { return (long) VH_geometry$triangles$transformOffset.get(this.segment(), 0L, index); }
    public int geometry$aabbs$sTypeAt(long index) { return (int) VH_geometry$aabbs$sType.get(this.segment(), 0L, index); }
    public MemorySegment geometry$aabbs$pNextAt(long index) { return (MemorySegment) VH_geometry$aabbs$pNext.get(this.segment(), 0L, index); }
    public long geometry$aabbs$aabbDataAt(long index) { return (long) VH_geometry$aabbs$aabbData.get(this.segment(), 0L, index); }
    public int geometry$aabbs$numAABBsAt(long index) { return (int) VH_geometry$aabbs$numAABBs.get(this.segment(), 0L, index); }
    public int geometry$aabbs$strideAt(long index) { return (int) VH_geometry$aabbs$stride.get(this.segment(), 0L, index); }
    public long geometry$aabbs$offsetAt(long index) { return (long) VH_geometry$aabbs$offset.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int geometryType() { return (int) VH_geometryType.get(this.segment(), 0L, 0L); }
    public int geometry$triangles$sType() { return (int) VH_geometry$triangles$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment geometry$triangles$pNext() { return (MemorySegment) VH_geometry$triangles$pNext.get(this.segment(), 0L, 0L); }
    public long geometry$triangles$vertexData() { return (long) VH_geometry$triangles$vertexData.get(this.segment(), 0L, 0L); }
    public long geometry$triangles$vertexOffset() { return (long) VH_geometry$triangles$vertexOffset.get(this.segment(), 0L, 0L); }
    public int geometry$triangles$vertexCount() { return (int) VH_geometry$triangles$vertexCount.get(this.segment(), 0L, 0L); }
    public long geometry$triangles$vertexStride() { return (long) VH_geometry$triangles$vertexStride.get(this.segment(), 0L, 0L); }
    public int geometry$triangles$vertexFormat() { return (int) VH_geometry$triangles$vertexFormat.get(this.segment(), 0L, 0L); }
    public long geometry$triangles$indexData() { return (long) VH_geometry$triangles$indexData.get(this.segment(), 0L, 0L); }
    public long geometry$triangles$indexOffset() { return (long) VH_geometry$triangles$indexOffset.get(this.segment(), 0L, 0L); }
    public int geometry$triangles$indexCount() { return (int) VH_geometry$triangles$indexCount.get(this.segment(), 0L, 0L); }
    public int geometry$triangles$indexType() { return (int) VH_geometry$triangles$indexType.get(this.segment(), 0L, 0L); }
    public long geometry$triangles$transformData() { return (long) VH_geometry$triangles$transformData.get(this.segment(), 0L, 0L); }
    public long geometry$triangles$transformOffset() { return (long) VH_geometry$triangles$transformOffset.get(this.segment(), 0L, 0L); }
    public int geometry$aabbs$sType() { return (int) VH_geometry$aabbs$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment geometry$aabbs$pNext() { return (MemorySegment) VH_geometry$aabbs$pNext.get(this.segment(), 0L, 0L); }
    public long geometry$aabbs$aabbData() { return (long) VH_geometry$aabbs$aabbData.get(this.segment(), 0L, 0L); }
    public int geometry$aabbs$numAABBs() { return (int) VH_geometry$aabbs$numAABBs.get(this.segment(), 0L, 0L); }
    public int geometry$aabbs$stride() { return (int) VH_geometry$aabbs$stride.get(this.segment(), 0L, 0L); }
    public long geometry$aabbs$offset() { return (long) VH_geometry$aabbs$offset.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public VkGeometryNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryNV geometryTypeAt(long index, int value) { VH_geometryType.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryNV geometry$triangles$sTypeAt(long index, int value) { VH_geometry$triangles$sType.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryNV geometry$triangles$pNextAt(long index, MemorySegment value) { VH_geometry$triangles$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryNV geometry$triangles$vertexDataAt(long index, long value) { VH_geometry$triangles$vertexData.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryNV geometry$triangles$vertexOffsetAt(long index, long value) { VH_geometry$triangles$vertexOffset.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryNV geometry$triangles$vertexCountAt(long index, int value) { VH_geometry$triangles$vertexCount.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryNV geometry$triangles$vertexStrideAt(long index, long value) { VH_geometry$triangles$vertexStride.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryNV geometry$triangles$vertexFormatAt(long index, int value) { VH_geometry$triangles$vertexFormat.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryNV geometry$triangles$indexDataAt(long index, long value) { VH_geometry$triangles$indexData.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryNV geometry$triangles$indexOffsetAt(long index, long value) { VH_geometry$triangles$indexOffset.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryNV geometry$triangles$indexCountAt(long index, int value) { VH_geometry$triangles$indexCount.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryNV geometry$triangles$indexTypeAt(long index, int value) { VH_geometry$triangles$indexType.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryNV geometry$triangles$transformDataAt(long index, long value) { VH_geometry$triangles$transformData.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryNV geometry$triangles$transformOffsetAt(long index, long value) { VH_geometry$triangles$transformOffset.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryNV geometry$aabbs$sTypeAt(long index, int value) { VH_geometry$aabbs$sType.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryNV geometry$aabbs$pNextAt(long index, MemorySegment value) { VH_geometry$aabbs$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryNV geometry$aabbs$aabbDataAt(long index, long value) { VH_geometry$aabbs$aabbData.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryNV geometry$aabbs$numAABBsAt(long index, int value) { VH_geometry$aabbs$numAABBs.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryNV geometry$aabbs$strideAt(long index, int value) { VH_geometry$aabbs$stride.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryNV geometry$aabbs$offsetAt(long index, long value) { VH_geometry$aabbs$offset.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryNV flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryNV geometryType(int value) { VH_geometryType.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryNV geometry$triangles$sType(int value) { VH_geometry$triangles$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryNV geometry$triangles$pNext(MemorySegment value) { VH_geometry$triangles$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryNV geometry$triangles$vertexData(long value) { VH_geometry$triangles$vertexData.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryNV geometry$triangles$vertexOffset(long value) { VH_geometry$triangles$vertexOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryNV geometry$triangles$vertexCount(int value) { VH_geometry$triangles$vertexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryNV geometry$triangles$vertexStride(long value) { VH_geometry$triangles$vertexStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryNV geometry$triangles$vertexFormat(int value) { VH_geometry$triangles$vertexFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryNV geometry$triangles$indexData(long value) { VH_geometry$triangles$indexData.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryNV geometry$triangles$indexOffset(long value) { VH_geometry$triangles$indexOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryNV geometry$triangles$indexCount(int value) { VH_geometry$triangles$indexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryNV geometry$triangles$indexType(int value) { VH_geometry$triangles$indexType.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryNV geometry$triangles$transformData(long value) { VH_geometry$triangles$transformData.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryNV geometry$triangles$transformOffset(long value) { VH_geometry$triangles$transformOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryNV geometry$aabbs$sType(int value) { VH_geometry$aabbs$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryNV geometry$aabbs$pNext(MemorySegment value) { VH_geometry$aabbs$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryNV geometry$aabbs$aabbData(long value) { VH_geometry$aabbs$aabbData.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryNV geometry$aabbs$numAABBs(int value) { VH_geometry$aabbs$numAABBs.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryNV geometry$aabbs$stride(int value) { VH_geometry$aabbs$stride.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryNV geometry$aabbs$offset(long value) { VH_geometry$aabbs$offset.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryNV flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkGeometryNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkGeometryNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkGeometryNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkGeometryNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _geometryTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_geometryType, index), LAYOUT_geometryType); }
    public MemorySegment _geometryType() { return _geometryTypeAt(0L); }
    public VkGeometryNV _geometryTypeAt(long index, MemorySegment src) { _geometryTypeAt(index).copyFrom(src); return this; }
    public VkGeometryNV _geometryType(MemorySegment src) { return _geometryTypeAt(0L, src); }
    public MemorySegment _geometryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_geometry, index), LAYOUT_geometry); }
    public MemorySegment _geometry() { return _geometryAt(0L); }
    public VkGeometryNV _geometryAt(long index, MemorySegment src) { _geometryAt(index).copyFrom(src); return this; }
    public VkGeometryNV _geometry(MemorySegment src) { return _geometryAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkGeometryNV _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkGeometryNV _flags(MemorySegment src) { return _flagsAt(0L, src); }
}
