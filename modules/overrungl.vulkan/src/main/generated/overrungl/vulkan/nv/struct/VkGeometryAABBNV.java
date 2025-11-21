// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkGeometryAABBNV`.
/// ## Layout
/// ```
/// struct VkGeometryAABBNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkBuffer aabbData;
///     uint32_t numAABBs;
///     uint32_t stride;
///     VkDeviceSize offset;
/// }
/// ```
public final class VkGeometryAABBNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("aabbData"),
        ValueLayout.JAVA_INT.withName("numAABBs"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.JAVA_LONG.withName("offset")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_aabbData = LAYOUT.byteOffset(PathElement.groupElement("aabbData"));
    public static final long OFFSET_numAABBs = LAYOUT.byteOffset(PathElement.groupElement("numAABBs"));
    public static final long OFFSET_stride = LAYOUT.byteOffset(PathElement.groupElement("stride"));
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_aabbData = LAYOUT.select(PathElement.groupElement("aabbData"));
    public static final MemoryLayout LAYOUT_numAABBs = LAYOUT.select(PathElement.groupElement("numAABBs"));
    public static final MemoryLayout LAYOUT_stride = LAYOUT.select(PathElement.groupElement("stride"));
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_aabbData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aabbData"));
    public static final VarHandle VH_numAABBs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numAABBs"));
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));

    public VkGeometryAABBNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkGeometryAABBNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryAABBNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkGeometryAABBNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryAABBNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkGeometryAABBNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeometryAABBNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkGeometryAABBNV alloc(SegmentAllocator allocator) { return new VkGeometryAABBNV(allocator.allocate(LAYOUT), 1); }
    public static VkGeometryAABBNV alloc(SegmentAllocator allocator, long count) { return new VkGeometryAABBNV(allocator.allocate(LAYOUT, count), count); }
    public static VkGeometryAABBNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVRayTracing.VK_STRUCTURE_TYPE_GEOMETRY_AABB_NV); }
    public static VkGeometryAABBNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVRayTracing.VK_STRUCTURE_TYPE_GEOMETRY_AABB_NV);
        return s;
    }
    public VkGeometryAABBNV copyFrom(VkGeometryAABBNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkGeometryAABBNV reinterpret(long count) { return new VkGeometryAABBNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkGeometryAABBNV asSlice(long index) { return new VkGeometryAABBNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkGeometryAABBNV asSlice(long index, long count) { return new VkGeometryAABBNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkGeometryAABBNV at(long index, Consumer<VkGeometryAABBNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long aabbDataAt(long index) { return (long) VH_aabbData.get(this.segment(), 0L, index); }
    public int numAABBsAt(long index) { return (int) VH_numAABBs.get(this.segment(), 0L, index); }
    public int strideAt(long index) { return (int) VH_stride.get(this.segment(), 0L, index); }
    public long offsetAt(long index) { return (long) VH_offset.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long aabbData() { return (long) VH_aabbData.get(this.segment(), 0L, 0L); }
    public int numAABBs() { return (int) VH_numAABBs.get(this.segment(), 0L, 0L); }
    public int stride() { return (int) VH_stride.get(this.segment(), 0L, 0L); }
    public long offset() { return (long) VH_offset.get(this.segment(), 0L, 0L); }
    public VkGeometryAABBNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryAABBNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryAABBNV aabbDataAt(long index, long value) { VH_aabbData.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryAABBNV numAABBsAt(long index, int value) { VH_numAABBs.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryAABBNV strideAt(long index, int value) { VH_stride.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryAABBNV offsetAt(long index, long value) { VH_offset.set(this.segment(), 0L, index, value); return this; }
    public VkGeometryAABBNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryAABBNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryAABBNV aabbData(long value) { VH_aabbData.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryAABBNV numAABBs(int value) { VH_numAABBs.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryAABBNV stride(int value) { VH_stride.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeometryAABBNV offset(long value) { VH_offset.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkGeometryAABBNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkGeometryAABBNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkGeometryAABBNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkGeometryAABBNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _aabbDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_aabbData, index), LAYOUT_aabbData); }
    public MemorySegment _aabbData() { return _aabbDataAt(0L); }
    public VkGeometryAABBNV _aabbDataAt(long index, MemorySegment src) { _aabbDataAt(index).copyFrom(src); return this; }
    public VkGeometryAABBNV _aabbData(MemorySegment src) { return _aabbDataAt(0L, src); }
    public MemorySegment _numAABBsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_numAABBs, index), LAYOUT_numAABBs); }
    public MemorySegment _numAABBs() { return _numAABBsAt(0L); }
    public VkGeometryAABBNV _numAABBsAt(long index, MemorySegment src) { _numAABBsAt(index).copyFrom(src); return this; }
    public VkGeometryAABBNV _numAABBs(MemorySegment src) { return _numAABBsAt(0L, src); }
    public MemorySegment _strideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stride, index), LAYOUT_stride); }
    public MemorySegment _stride() { return _strideAt(0L); }
    public VkGeometryAABBNV _strideAt(long index, MemorySegment src) { _strideAt(index).copyFrom(src); return this; }
    public VkGeometryAABBNV _stride(MemorySegment src) { return _strideAt(0L, src); }
    public MemorySegment _offsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    public MemorySegment _offset() { return _offsetAt(0L); }
    public VkGeometryAABBNV _offsetAt(long index, MemorySegment src) { _offsetAt(index).copyFrom(src); return this; }
    public VkGeometryAABBNV _offset(MemorySegment src) { return _offsetAt(0L, src); }
}
