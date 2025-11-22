// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkResolveImageInfo2`.
/// ## Layout
/// ```
/// struct VkResolveImageInfo2 {
///     VkStructureType sType;
///     const void* pNext;
///     VkImage srcImage;
///     VkImageLayout srcImageLayout;
///     VkImage dstImage;
///     VkImageLayout dstImageLayout;
///     uint32_t regionCount;
///     const VkImageResolve2* pRegions;
/// }
/// ```
public final class VkResolveImageInfo2 extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("srcImage"),
        ValueLayout.JAVA_INT.withName("srcImageLayout"),
        ValueLayout.JAVA_LONG.withName("dstImage"),
        ValueLayout.JAVA_INT.withName("dstImageLayout"),
        ValueLayout.JAVA_INT.withName("regionCount"),
        ValueLayout.ADDRESS.withName("pRegions")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_srcImage = LAYOUT.byteOffset(PathElement.groupElement("srcImage"));
    public static final long OFFSET_srcImageLayout = LAYOUT.byteOffset(PathElement.groupElement("srcImageLayout"));
    public static final long OFFSET_dstImage = LAYOUT.byteOffset(PathElement.groupElement("dstImage"));
    public static final long OFFSET_dstImageLayout = LAYOUT.byteOffset(PathElement.groupElement("dstImageLayout"));
    public static final long OFFSET_regionCount = LAYOUT.byteOffset(PathElement.groupElement("regionCount"));
    public static final long OFFSET_pRegions = LAYOUT.byteOffset(PathElement.groupElement("pRegions"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_srcImage = LAYOUT.select(PathElement.groupElement("srcImage"));
    public static final MemoryLayout LAYOUT_srcImageLayout = LAYOUT.select(PathElement.groupElement("srcImageLayout"));
    public static final MemoryLayout LAYOUT_dstImage = LAYOUT.select(PathElement.groupElement("dstImage"));
    public static final MemoryLayout LAYOUT_dstImageLayout = LAYOUT.select(PathElement.groupElement("dstImageLayout"));
    public static final MemoryLayout LAYOUT_regionCount = LAYOUT.select(PathElement.groupElement("regionCount"));
    public static final MemoryLayout LAYOUT_pRegions = LAYOUT.select(PathElement.groupElement("pRegions"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_srcImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcImage"));
    public static final VarHandle VH_srcImageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcImageLayout"));
    public static final VarHandle VH_dstImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstImage"));
    public static final VarHandle VH_dstImageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstImageLayout"));
    public static final VarHandle VH_regionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("regionCount"));
    public static final VarHandle VH_pRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRegions"));

    public VkResolveImageInfo2(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkResolveImageInfo2 of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkResolveImageInfo2(segment, estimateCount(segment, LAYOUT)); }
    public static VkResolveImageInfo2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkResolveImageInfo2(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkResolveImageInfo2 ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkResolveImageInfo2(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkResolveImageInfo2 alloc(SegmentAllocator allocator) { return new VkResolveImageInfo2(allocator.allocate(LAYOUT), 1); }
    public static VkResolveImageInfo2 alloc(SegmentAllocator allocator, long count) { return new VkResolveImageInfo2(allocator.allocate(LAYOUT, count), count); }
    public static VkResolveImageInfo2 allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2); }
    public static VkResolveImageInfo2 allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2);
        return s;
    }
    public VkResolveImageInfo2 copyFrom(VkResolveImageInfo2 src) { this.segment().copyFrom(src.segment()); return this; }
    public VkResolveImageInfo2 reinterpret(long count) { return new VkResolveImageInfo2(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkResolveImageInfo2 asSlice(long index) { return new VkResolveImageInfo2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkResolveImageInfo2 asSlice(long index, long count) { return new VkResolveImageInfo2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkResolveImageInfo2 at(long index, Consumer<VkResolveImageInfo2> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long srcImageAt(long index) { return (long) VH_srcImage.get(this.segment(), 0L, index); }
    public int srcImageLayoutAt(long index) { return (int) VH_srcImageLayout.get(this.segment(), 0L, index); }
    public long dstImageAt(long index) { return (long) VH_dstImage.get(this.segment(), 0L, index); }
    public int dstImageLayoutAt(long index) { return (int) VH_dstImageLayout.get(this.segment(), 0L, index); }
    public int regionCountAt(long index) { return (int) VH_regionCount.get(this.segment(), 0L, index); }
    public MemorySegment pRegionsAt(long index) { return (MemorySegment) VH_pRegions.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long srcImage() { return (long) VH_srcImage.get(this.segment(), 0L, 0L); }
    public int srcImageLayout() { return (int) VH_srcImageLayout.get(this.segment(), 0L, 0L); }
    public long dstImage() { return (long) VH_dstImage.get(this.segment(), 0L, 0L); }
    public int dstImageLayout() { return (int) VH_dstImageLayout.get(this.segment(), 0L, 0L); }
    public int regionCount() { return (int) VH_regionCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pRegions() { return (MemorySegment) VH_pRegions.get(this.segment(), 0L, 0L); }
    public VkResolveImageInfo2 sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkResolveImageInfo2 pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkResolveImageInfo2 srcImageAt(long index, long value) { VH_srcImage.set(this.segment(), 0L, index, value); return this; }
    public VkResolveImageInfo2 srcImageLayoutAt(long index, int value) { VH_srcImageLayout.set(this.segment(), 0L, index, value); return this; }
    public VkResolveImageInfo2 dstImageAt(long index, long value) { VH_dstImage.set(this.segment(), 0L, index, value); return this; }
    public VkResolveImageInfo2 dstImageLayoutAt(long index, int value) { VH_dstImageLayout.set(this.segment(), 0L, index, value); return this; }
    public VkResolveImageInfo2 regionCountAt(long index, int value) { VH_regionCount.set(this.segment(), 0L, index, value); return this; }
    public VkResolveImageInfo2 pRegionsAt(long index, MemorySegment value) { VH_pRegions.set(this.segment(), 0L, index, value); return this; }
    public VkResolveImageInfo2 sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkResolveImageInfo2 pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkResolveImageInfo2 srcImage(long value) { VH_srcImage.set(this.segment(), 0L, 0L, value); return this; }
    public VkResolveImageInfo2 srcImageLayout(int value) { VH_srcImageLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkResolveImageInfo2 dstImage(long value) { VH_dstImage.set(this.segment(), 0L, 0L, value); return this; }
    public VkResolveImageInfo2 dstImageLayout(int value) { VH_dstImageLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkResolveImageInfo2 regionCount(int value) { VH_regionCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkResolveImageInfo2 pRegions(MemorySegment value) { VH_pRegions.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkResolveImageInfo2 _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkResolveImageInfo2 _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkResolveImageInfo2 _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkResolveImageInfo2 _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _srcImageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcImage, index), LAYOUT_srcImage); }
    public MemorySegment _srcImage() { return _srcImageAt(0L); }
    public VkResolveImageInfo2 _srcImageAt(long index, MemorySegment src) { _srcImageAt(index).copyFrom(src); return this; }
    public VkResolveImageInfo2 _srcImage(MemorySegment src) { return _srcImageAt(0L, src); }
    public MemorySegment _srcImageLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcImageLayout, index), LAYOUT_srcImageLayout); }
    public MemorySegment _srcImageLayout() { return _srcImageLayoutAt(0L); }
    public VkResolveImageInfo2 _srcImageLayoutAt(long index, MemorySegment src) { _srcImageLayoutAt(index).copyFrom(src); return this; }
    public VkResolveImageInfo2 _srcImageLayout(MemorySegment src) { return _srcImageLayoutAt(0L, src); }
    public MemorySegment _dstImageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstImage, index), LAYOUT_dstImage); }
    public MemorySegment _dstImage() { return _dstImageAt(0L); }
    public VkResolveImageInfo2 _dstImageAt(long index, MemorySegment src) { _dstImageAt(index).copyFrom(src); return this; }
    public VkResolveImageInfo2 _dstImage(MemorySegment src) { return _dstImageAt(0L, src); }
    public MemorySegment _dstImageLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstImageLayout, index), LAYOUT_dstImageLayout); }
    public MemorySegment _dstImageLayout() { return _dstImageLayoutAt(0L); }
    public VkResolveImageInfo2 _dstImageLayoutAt(long index, MemorySegment src) { _dstImageLayoutAt(index).copyFrom(src); return this; }
    public VkResolveImageInfo2 _dstImageLayout(MemorySegment src) { return _dstImageLayoutAt(0L, src); }
    public MemorySegment _regionCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_regionCount, index), LAYOUT_regionCount); }
    public MemorySegment _regionCount() { return _regionCountAt(0L); }
    public VkResolveImageInfo2 _regionCountAt(long index, MemorySegment src) { _regionCountAt(index).copyFrom(src); return this; }
    public VkResolveImageInfo2 _regionCount(MemorySegment src) { return _regionCountAt(0L, src); }
    public MemorySegment _pRegionsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pRegions, index), LAYOUT_pRegions); }
    public MemorySegment _pRegions() { return _pRegionsAt(0L); }
    public VkResolveImageInfo2 _pRegionsAt(long index, MemorySegment src) { _pRegionsAt(index).copyFrom(src); return this; }
    public VkResolveImageInfo2 _pRegions(MemorySegment src) { return _pRegionsAt(0L, src); }
}
