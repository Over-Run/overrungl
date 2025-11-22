// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCopyImageToMemoryInfoEXT`.
/// ## Layout
/// ```
/// struct VkCopyImageToMemoryInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkHostImageCopyFlags flags;
///     VkImage srcImage;
///     VkImageLayout srcImageLayout;
///     uint32_t regionCount;
///     const VkImageToMemoryCopy* pRegions;
/// }
/// ```
public final class VkCopyImageToMemoryInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("srcImage"),
        ValueLayout.JAVA_INT.withName("srcImageLayout"),
        ValueLayout.JAVA_INT.withName("regionCount"),
        ValueLayout.ADDRESS.withName("pRegions")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_srcImage = LAYOUT.byteOffset(PathElement.groupElement("srcImage"));
    public static final long OFFSET_srcImageLayout = LAYOUT.byteOffset(PathElement.groupElement("srcImageLayout"));
    public static final long OFFSET_regionCount = LAYOUT.byteOffset(PathElement.groupElement("regionCount"));
    public static final long OFFSET_pRegions = LAYOUT.byteOffset(PathElement.groupElement("pRegions"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_srcImage = LAYOUT.select(PathElement.groupElement("srcImage"));
    public static final MemoryLayout LAYOUT_srcImageLayout = LAYOUT.select(PathElement.groupElement("srcImageLayout"));
    public static final MemoryLayout LAYOUT_regionCount = LAYOUT.select(PathElement.groupElement("regionCount"));
    public static final MemoryLayout LAYOUT_pRegions = LAYOUT.select(PathElement.groupElement("pRegions"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_srcImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcImage"));
    public static final VarHandle VH_srcImageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcImageLayout"));
    public static final VarHandle VH_regionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("regionCount"));
    public static final VarHandle VH_pRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRegions"));

    public VkCopyImageToMemoryInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCopyImageToMemoryInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyImageToMemoryInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkCopyImageToMemoryInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyImageToMemoryInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCopyImageToMemoryInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyImageToMemoryInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCopyImageToMemoryInfoEXT alloc(SegmentAllocator allocator) { return new VkCopyImageToMemoryInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkCopyImageToMemoryInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkCopyImageToMemoryInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkCopyImageToMemoryInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO); }
    public static VkCopyImageToMemoryInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO);
        return s;
    }
    public VkCopyImageToMemoryInfoEXT copyFrom(VkCopyImageToMemoryInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCopyImageToMemoryInfoEXT reinterpret(long count) { return new VkCopyImageToMemoryInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCopyImageToMemoryInfoEXT asSlice(long index) { return new VkCopyImageToMemoryInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCopyImageToMemoryInfoEXT asSlice(long index, long count) { return new VkCopyImageToMemoryInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCopyImageToMemoryInfoEXT at(long index, Consumer<VkCopyImageToMemoryInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long srcImageAt(long index) { return (long) VH_srcImage.get(this.segment(), 0L, index); }
    public int srcImageLayoutAt(long index) { return (int) VH_srcImageLayout.get(this.segment(), 0L, index); }
    public int regionCountAt(long index) { return (int) VH_regionCount.get(this.segment(), 0L, index); }
    public MemorySegment pRegionsAt(long index) { return (MemorySegment) VH_pRegions.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public long srcImage() { return (long) VH_srcImage.get(this.segment(), 0L, 0L); }
    public int srcImageLayout() { return (int) VH_srcImageLayout.get(this.segment(), 0L, 0L); }
    public int regionCount() { return (int) VH_regionCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pRegions() { return (MemorySegment) VH_pRegions.get(this.segment(), 0L, 0L); }
    public VkCopyImageToMemoryInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCopyImageToMemoryInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCopyImageToMemoryInfoEXT flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkCopyImageToMemoryInfoEXT srcImageAt(long index, long value) { VH_srcImage.set(this.segment(), 0L, index, value); return this; }
    public VkCopyImageToMemoryInfoEXT srcImageLayoutAt(long index, int value) { VH_srcImageLayout.set(this.segment(), 0L, index, value); return this; }
    public VkCopyImageToMemoryInfoEXT regionCountAt(long index, int value) { VH_regionCount.set(this.segment(), 0L, index, value); return this; }
    public VkCopyImageToMemoryInfoEXT pRegionsAt(long index, MemorySegment value) { VH_pRegions.set(this.segment(), 0L, index, value); return this; }
    public VkCopyImageToMemoryInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyImageToMemoryInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyImageToMemoryInfoEXT flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyImageToMemoryInfoEXT srcImage(long value) { VH_srcImage.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyImageToMemoryInfoEXT srcImageLayout(int value) { VH_srcImageLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyImageToMemoryInfoEXT regionCount(int value) { VH_regionCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyImageToMemoryInfoEXT pRegions(MemorySegment value) { VH_pRegions.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCopyImageToMemoryInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCopyImageToMemoryInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCopyImageToMemoryInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCopyImageToMemoryInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkCopyImageToMemoryInfoEXT _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkCopyImageToMemoryInfoEXT _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _srcImageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcImage, index), LAYOUT_srcImage); }
    public MemorySegment _srcImage() { return _srcImageAt(0L); }
    public VkCopyImageToMemoryInfoEXT _srcImageAt(long index, MemorySegment src) { _srcImageAt(index).copyFrom(src); return this; }
    public VkCopyImageToMemoryInfoEXT _srcImage(MemorySegment src) { return _srcImageAt(0L, src); }
    public MemorySegment _srcImageLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcImageLayout, index), LAYOUT_srcImageLayout); }
    public MemorySegment _srcImageLayout() { return _srcImageLayoutAt(0L); }
    public VkCopyImageToMemoryInfoEXT _srcImageLayoutAt(long index, MemorySegment src) { _srcImageLayoutAt(index).copyFrom(src); return this; }
    public VkCopyImageToMemoryInfoEXT _srcImageLayout(MemorySegment src) { return _srcImageLayoutAt(0L, src); }
    public MemorySegment _regionCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_regionCount, index), LAYOUT_regionCount); }
    public MemorySegment _regionCount() { return _regionCountAt(0L); }
    public VkCopyImageToMemoryInfoEXT _regionCountAt(long index, MemorySegment src) { _regionCountAt(index).copyFrom(src); return this; }
    public VkCopyImageToMemoryInfoEXT _regionCount(MemorySegment src) { return _regionCountAt(0L, src); }
    public MemorySegment _pRegionsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pRegions, index), LAYOUT_pRegions); }
    public MemorySegment _pRegions() { return _pRegionsAt(0L); }
    public VkCopyImageToMemoryInfoEXT _pRegionsAt(long index, MemorySegment src) { _pRegionsAt(index).copyFrom(src); return this; }
    public VkCopyImageToMemoryInfoEXT _pRegions(MemorySegment src) { return _pRegionsAt(0L, src); }
}
