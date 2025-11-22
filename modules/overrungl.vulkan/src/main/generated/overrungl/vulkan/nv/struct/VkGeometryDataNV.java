// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkGeometryDataNV`.
/// ## Layout
/// ```
/// struct VkGeometryDataNV {
///     VkGeometryTrianglesNV triangles;
///     VkGeometryAABBNV aabbs;
/// }
/// ```
public final class VkGeometryDataNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.nv.struct.VkGeometryTrianglesNV.LAYOUT.withName("triangles"),
        overrungl.vulkan.nv.struct.VkGeometryAABBNV.LAYOUT.withName("aabbs")
    );
    public static final long OFFSET_triangles = LAYOUT.byteOffset(PathElement.groupElement("triangles"));
    public static final long OFFSET_aabbs = LAYOUT.byteOffset(PathElement.groupElement("aabbs"));
    public static final MemoryLayout LAYOUT_triangles = LAYOUT.select(PathElement.groupElement("triangles"));
    public static final MemoryLayout LAYOUT_aabbs = LAYOUT.select(PathElement.groupElement("aabbs"));
    public static final VarHandle VH_triangles$sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("sType"));
    public static final VarHandle VH_triangles$pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("pNext"));
    public static final VarHandle VH_triangles$vertexData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("vertexData"));
    public static final VarHandle VH_triangles$vertexOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("vertexOffset"));
    public static final VarHandle VH_triangles$vertexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("vertexCount"));
    public static final VarHandle VH_triangles$vertexStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("vertexStride"));
    public static final VarHandle VH_triangles$vertexFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("vertexFormat"));
    public static final VarHandle VH_triangles$indexData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("indexData"));
    public static final VarHandle VH_triangles$indexOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("indexOffset"));
    public static final VarHandle VH_triangles$indexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("indexCount"));
    public static final VarHandle VH_triangles$indexType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("indexType"));
    public static final VarHandle VH_triangles$transformData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("transformData"));
    public static final VarHandle VH_triangles$transformOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangles"), PathElement.groupElement("transformOffset"));
    public static final VarHandle VH_aabbs$sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aabbs"), PathElement.groupElement("sType"));
    public static final VarHandle VH_aabbs$pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aabbs"), PathElement.groupElement("pNext"));
    public static final VarHandle VH_aabbs$aabbData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aabbs"), PathElement.groupElement("aabbData"));
    public static final VarHandle VH_aabbs$numAABBs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aabbs"), PathElement.groupElement("numAABBs"));
    public static final VarHandle VH_aabbs$stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aabbs"), PathElement.groupElement("stride"));
    public static final VarHandle VH_aabbs$offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aabbs"), PathElement.groupElement("offset"));

    public VkGeometryDataNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkGeometryDataNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryDataNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkGeometryDataNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryDataNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkGeometryDataNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryDataNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkGeometryDataNV alloc(SegmentAllocator allocator) { return new VkGeometryDataNV(allocator.allocate(LAYOUT), 1); }
    public static VkGeometryDataNV alloc(SegmentAllocator allocator, long count) { return new VkGeometryDataNV(allocator.allocate(LAYOUT, count), count); }
    public VkGeometryDataNV copyFrom(VkGeometryDataNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkGeometryDataNV reinterpret(long count) { return new VkGeometryDataNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkGeometryDataNV asSlice(long index) { return new VkGeometryDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkGeometryDataNV asSlice(long index, long count) { return new VkGeometryDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkGeometryDataNV at(long index, Consumer<VkGeometryDataNV> func) { func.accept(asSlice(index)); return this; }
    public int triangles$sTypeAt(long index) { return (int) VH_triangles$sType.get(this.segment(), 0L, index); }
    public MemorySegment triangles$pNextAt(long index) { return (MemorySegment) VH_triangles$pNext.get(this.segment(), 0L, index); }
    public long triangles$vertexDataAt(long index) { return (long) VH_triangles$vertexData.get(this.segment(), 0L, index); }
    public long triangles$vertexOffsetAt(long index) { return (long) VH_triangles$vertexOffset.get(this.segment(), 0L, index); }
    public int triangles$vertexCountAt(long index) { return (int) VH_triangles$vertexCount.get(this.segment(), 0L, index); }
    public long triangles$vertexStrideAt(long index) { return (long) VH_triangles$vertexStride.get(this.segment(), 0L, index); }
    public int triangles$vertexFormatAt(long index) { return (int) VH_triangles$vertexFormat.get(this.segment(), 0L, index); }
    public long triangles$indexDataAt(long index) { return (long) VH_triangles$indexData.get(this.segment(), 0L, index); }
    public long triangles$indexOffsetAt(long index) { return (long) VH_triangles$indexOffset.get(this.segment(), 0L, index); }
    public int triangles$indexCountAt(long index) { return (int) VH_triangles$indexCount.get(this.segment(), 0L, index); }
    public int triangles$indexTypeAt(long index) { return (int) VH_triangles$indexType.get(this.segment(), 0L, index); }
    public long triangles$transformDataAt(long index) { return (long) VH_triangles$transformData.get(this.segment(), 0L, index); }
    public long triangles$transformOffsetAt(long index) { return (long) VH_triangles$transformOffset.get(this.segment(), 0L, index); }
    public int aabbs$sTypeAt(long index) { return (int) VH_aabbs$sType.get(this.segment(), 0L, index); }
    public MemorySegment aabbs$pNextAt(long index) { return (MemorySegment) VH_aabbs$pNext.get(this.segment(), 0L, index); }
    public long aabbs$aabbDataAt(long index) { return (long) VH_aabbs$aabbData.get(this.segment(), 0L, index); }
    public int aabbs$numAABBsAt(long index) { return (int) VH_aabbs$numAABBs.get(this.segment(), 0L, index); }
    public int aabbs$strideAt(long index) { return (int) VH_aabbs$stride.get(this.segment(), 0L, index); }
    public long aabbs$offsetAt(long index) { return (long) VH_aabbs$offset.get(this.segment(), 0L, index); }
    public int triangles$sType() { return (int) VH_triangles$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment triangles$pNext() { return (MemorySegment) VH_triangles$pNext.get(this.segment(), 0L, 0L); }
    public long triangles$vertexData() { return (long) VH_triangles$vertexData.get(this.segment(), 0L, 0L); }
    public long triangles$vertexOffset() { return (long) VH_triangles$vertexOffset.get(this.segment(), 0L, 0L); }
    public int triangles$vertexCount() { return (int) VH_triangles$vertexCount.get(this.segment(), 0L, 0L); }
    public long triangles$vertexStride() { return (long) VH_triangles$vertexStride.get(this.segment(), 0L, 0L); }
    public int triangles$vertexFormat() { return (int) VH_triangles$vertexFormat.get(this.segment(), 0L, 0L); }
    public long triangles$indexData() { return (long) VH_triangles$indexData.get(this.segment(), 0L, 0L); }
    public long triangles$indexOffset() { return (long) VH_triangles$indexOffset.get(this.segment(), 0L, 0L); }
    public int triangles$indexCount() { return (int) VH_triangles$indexCount.get(this.segment(), 0L, 0L); }
    public int triangles$indexType() { return (int) VH_triangles$indexType.get(this.segment(), 0L, 0L); }
    public long triangles$transformData() { return (long) VH_triangles$transformData.get(this.segment(), 0L, 0L); }
    public long triangles$transformOffset() { return (long) VH_triangles$transformOffset.get(this.segment(), 0L, 0L); }
    public int aabbs$sType() { return (int) VH_aabbs$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment aabbs$pNext() { return (MemorySegment) VH_aabbs$pNext.get(this.segment(), 0L, 0L); }
    public long aabbs$aabbData() { return (long) VH_aabbs$aabbData.get(this.segment(), 0L, 0L); }
    public int aabbs$numAABBs() { return (int) VH_aabbs$numAABBs.get(this.segment(), 0L, 0L); }
    public int aabbs$stride() { return (int) VH_aabbs$stride.get(this.segment(), 0L, 0L); }
    public long aabbs$offset() { return (long) VH_aabbs$offset.get(this.segment(), 0L, 0L); }
    public VkGeometryDataNV triangles$sTypeAt(long index, int value) { VH_triangles$sType.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryDataNV triangles$pNextAt(long index, MemorySegment value) { VH_triangles$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryDataNV triangles$vertexDataAt(long index, long value) { VH_triangles$vertexData.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryDataNV triangles$vertexOffsetAt(long index, long value) { VH_triangles$vertexOffset.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryDataNV triangles$vertexCountAt(long index, int value) { VH_triangles$vertexCount.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryDataNV triangles$vertexStrideAt(long index, long value) { VH_triangles$vertexStride.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryDataNV triangles$vertexFormatAt(long index, int value) { VH_triangles$vertexFormat.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryDataNV triangles$indexDataAt(long index, long value) { VH_triangles$indexData.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryDataNV triangles$indexOffsetAt(long index, long value) { VH_triangles$indexOffset.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryDataNV triangles$indexCountAt(long index, int value) { VH_triangles$indexCount.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryDataNV triangles$indexTypeAt(long index, int value) { VH_triangles$indexType.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryDataNV triangles$transformDataAt(long index, long value) { VH_triangles$transformData.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryDataNV triangles$transformOffsetAt(long index, long value) { VH_triangles$transformOffset.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryDataNV aabbs$sTypeAt(long index, int value) { VH_aabbs$sType.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryDataNV aabbs$pNextAt(long index, MemorySegment value) { VH_aabbs$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryDataNV aabbs$aabbDataAt(long index, long value) { VH_aabbs$aabbData.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryDataNV aabbs$numAABBsAt(long index, int value) { VH_aabbs$numAABBs.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryDataNV aabbs$strideAt(long index, int value) { VH_aabbs$stride.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryDataNV aabbs$offsetAt(long index, long value) { VH_aabbs$offset.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryDataNV triangles$sType(int value) { VH_triangles$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryDataNV triangles$pNext(MemorySegment value) { VH_triangles$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryDataNV triangles$vertexData(long value) { VH_triangles$vertexData.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryDataNV triangles$vertexOffset(long value) { VH_triangles$vertexOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryDataNV triangles$vertexCount(int value) { VH_triangles$vertexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryDataNV triangles$vertexStride(long value) { VH_triangles$vertexStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryDataNV triangles$vertexFormat(int value) { VH_triangles$vertexFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryDataNV triangles$indexData(long value) { VH_triangles$indexData.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryDataNV triangles$indexOffset(long value) { VH_triangles$indexOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryDataNV triangles$indexCount(int value) { VH_triangles$indexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryDataNV triangles$indexType(int value) { VH_triangles$indexType.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryDataNV triangles$transformData(long value) { VH_triangles$transformData.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryDataNV triangles$transformOffset(long value) { VH_triangles$transformOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryDataNV aabbs$sType(int value) { VH_aabbs$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryDataNV aabbs$pNext(MemorySegment value) { VH_aabbs$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryDataNV aabbs$aabbData(long value) { VH_aabbs$aabbData.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryDataNV aabbs$numAABBs(int value) { VH_aabbs$numAABBs.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryDataNV aabbs$stride(int value) { VH_aabbs$stride.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryDataNV aabbs$offset(long value) { VH_aabbs$offset.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _trianglesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_triangles, index), LAYOUT_triangles); }
    public MemorySegment _triangles() { return _trianglesAt(0L); }
    public VkGeometryDataNV _trianglesAt(long index, MemorySegment src) { _trianglesAt(index).copyFrom(src); return this; }
    public VkGeometryDataNV _triangles(MemorySegment src) { return _trianglesAt(0L, src); }
    public MemorySegment _aabbsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_aabbs, index), LAYOUT_aabbs); }
    public MemorySegment _aabbs() { return _aabbsAt(0L); }
    public VkGeometryDataNV _aabbsAt(long index, MemorySegment src) { _aabbsAt(index).copyFrom(src); return this; }
    public VkGeometryDataNV _aabbs(MemorySegment src) { return _aabbsAt(0L, src); }
}
