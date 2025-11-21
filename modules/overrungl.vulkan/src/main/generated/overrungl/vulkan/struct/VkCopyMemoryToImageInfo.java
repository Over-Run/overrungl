// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCopyMemoryToImageInfo`.
/// ## Layout
/// ```
/// struct VkCopyMemoryToImageInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkHostImageCopyFlags flags;
///     VkImage dstImage;
///     VkImageLayout dstImageLayout;
///     uint32_t regionCount;
///     const VkMemoryToImageCopy* pRegions;
/// }
/// ```
public final class VkCopyMemoryToImageInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("dstImage"),
        ValueLayout.JAVA_INT.withName("dstImageLayout"),
        ValueLayout.JAVA_INT.withName("regionCount"),
        ValueLayout.ADDRESS.withName("pRegions")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_dstImage = LAYOUT.byteOffset(PathElement.groupElement("dstImage"));
    public static final long OFFSET_dstImageLayout = LAYOUT.byteOffset(PathElement.groupElement("dstImageLayout"));
    public static final long OFFSET_regionCount = LAYOUT.byteOffset(PathElement.groupElement("regionCount"));
    public static final long OFFSET_pRegions = LAYOUT.byteOffset(PathElement.groupElement("pRegions"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_dstImage = LAYOUT.select(PathElement.groupElement("dstImage"));
    public static final MemoryLayout LAYOUT_dstImageLayout = LAYOUT.select(PathElement.groupElement("dstImageLayout"));
    public static final MemoryLayout LAYOUT_regionCount = LAYOUT.select(PathElement.groupElement("regionCount"));
    public static final MemoryLayout LAYOUT_pRegions = LAYOUT.select(PathElement.groupElement("pRegions"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_dstImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstImage"));
    public static final VarHandle VH_dstImageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstImageLayout"));
    public static final VarHandle VH_regionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("regionCount"));
    public static final VarHandle VH_pRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRegions"));

    public VkCopyMemoryToImageInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCopyMemoryToImageInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryToImageInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkCopyMemoryToImageInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryToImageInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCopyMemoryToImageInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryToImageInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCopyMemoryToImageInfo alloc(SegmentAllocator allocator) { return new VkCopyMemoryToImageInfo(allocator.allocate(LAYOUT), 1); }
    public static VkCopyMemoryToImageInfo alloc(SegmentAllocator allocator, long count) { return new VkCopyMemoryToImageInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkCopyMemoryToImageInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO); }
    public static VkCopyMemoryToImageInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO);
        return s;
    }
    public VkCopyMemoryToImageInfo copyFrom(VkCopyMemoryToImageInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCopyMemoryToImageInfo reinterpret(long count) { return new VkCopyMemoryToImageInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCopyMemoryToImageInfo asSlice(long index) { return new VkCopyMemoryToImageInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCopyMemoryToImageInfo asSlice(long index, long count) { return new VkCopyMemoryToImageInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCopyMemoryToImageInfo at(long index, Consumer<VkCopyMemoryToImageInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long dstImageAt(long index) { return (long) VH_dstImage.get(this.segment(), 0L, index); }
    public int dstImageLayoutAt(long index) { return (int) VH_dstImageLayout.get(this.segment(), 0L, index); }
    public int regionCountAt(long index) { return (int) VH_regionCount.get(this.segment(), 0L, index); }
    public MemorySegment pRegionsAt(long index) { return (MemorySegment) VH_pRegions.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public long dstImage() { return (long) VH_dstImage.get(this.segment(), 0L, 0L); }
    public int dstImageLayout() { return (int) VH_dstImageLayout.get(this.segment(), 0L, 0L); }
    public int regionCount() { return (int) VH_regionCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pRegions() { return (MemorySegment) VH_pRegions.get(this.segment(), 0L, 0L); }
    public VkCopyMemoryToImageInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageInfo dstImageAt(long index, long value) { VH_dstImage.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageInfo dstImageLayoutAt(long index, int value) { VH_dstImageLayout.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageInfo regionCountAt(long index, int value) { VH_regionCount.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageInfo pRegionsAt(long index, MemorySegment value) { VH_pRegions.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageInfo dstImage(long value) { VH_dstImage.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageInfo dstImageLayout(int value) { VH_dstImageLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageInfo regionCount(int value) { VH_regionCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageInfo pRegions(MemorySegment value) { VH_pRegions.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCopyMemoryToImageInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToImageInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCopyMemoryToImageInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToImageInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkCopyMemoryToImageInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToImageInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _dstImageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstImage, index), LAYOUT_dstImage); }
    public MemorySegment _dstImage() { return _dstImageAt(0L); }
    public VkCopyMemoryToImageInfo _dstImageAt(long index, MemorySegment src) { _dstImageAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToImageInfo _dstImage(MemorySegment src) { return _dstImageAt(0L, src); }
    public MemorySegment _dstImageLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstImageLayout, index), LAYOUT_dstImageLayout); }
    public MemorySegment _dstImageLayout() { return _dstImageLayoutAt(0L); }
    public VkCopyMemoryToImageInfo _dstImageLayoutAt(long index, MemorySegment src) { _dstImageLayoutAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToImageInfo _dstImageLayout(MemorySegment src) { return _dstImageLayoutAt(0L, src); }
    public MemorySegment _regionCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_regionCount, index), LAYOUT_regionCount); }
    public MemorySegment _regionCount() { return _regionCountAt(0L); }
    public VkCopyMemoryToImageInfo _regionCountAt(long index, MemorySegment src) { _regionCountAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToImageInfo _regionCount(MemorySegment src) { return _regionCountAt(0L, src); }
    public MemorySegment _pRegionsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pRegions, index), LAYOUT_pRegions); }
    public MemorySegment _pRegions() { return _pRegionsAt(0L); }
    public VkCopyMemoryToImageInfo _pRegionsAt(long index, MemorySegment src) { _pRegionsAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToImageInfo _pRegions(MemorySegment src) { return _pRegionsAt(0L, src); }
}
