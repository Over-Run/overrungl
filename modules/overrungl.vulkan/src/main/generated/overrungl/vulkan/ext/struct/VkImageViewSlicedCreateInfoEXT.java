// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageViewSlicedCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkImageViewSlicedCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t sliceOffset;
///     uint32_t sliceCount;
/// }
/// ```
public final class VkImageViewSlicedCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sliceOffset"),
        ValueLayout.JAVA_INT.withName("sliceCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_sliceOffset = LAYOUT.byteOffset(PathElement.groupElement("sliceOffset"));
    public static final long OFFSET_sliceCount = LAYOUT.byteOffset(PathElement.groupElement("sliceCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_sliceOffset = LAYOUT.select(PathElement.groupElement("sliceOffset"));
    public static final MemoryLayout LAYOUT_sliceCount = LAYOUT.select(PathElement.groupElement("sliceCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_sliceOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sliceOffset"));
    public static final VarHandle VH_sliceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sliceCount"));

    public VkImageViewSlicedCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageViewSlicedCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewSlicedCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageViewSlicedCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewSlicedCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageViewSlicedCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewSlicedCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageViewSlicedCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkImageViewSlicedCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkImageViewSlicedCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkImageViewSlicedCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkImageViewSlicedCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTImageSlicedViewOf3d.VK_STRUCTURE_TYPE_IMAGE_VIEW_SLICED_CREATE_INFO_EXT); }
    public static VkImageViewSlicedCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTImageSlicedViewOf3d.VK_STRUCTURE_TYPE_IMAGE_VIEW_SLICED_CREATE_INFO_EXT);
        return s;
    }
    public VkImageViewSlicedCreateInfoEXT copyFrom(VkImageViewSlicedCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageViewSlicedCreateInfoEXT reinterpret(long count) { return new VkImageViewSlicedCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageViewSlicedCreateInfoEXT asSlice(long index) { return new VkImageViewSlicedCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageViewSlicedCreateInfoEXT asSlice(long index, long count) { return new VkImageViewSlicedCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageViewSlicedCreateInfoEXT at(long index, Consumer<VkImageViewSlicedCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int sliceOffsetAt(long index) { return (int) VH_sliceOffset.get(this.segment(), 0L, index); }
    public int sliceCountAt(long index) { return (int) VH_sliceCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int sliceOffset() { return (int) VH_sliceOffset.get(this.segment(), 0L, 0L); }
    public int sliceCount() { return (int) VH_sliceCount.get(this.segment(), 0L, 0L); }
    public VkImageViewSlicedCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewSlicedCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewSlicedCreateInfoEXT sliceOffsetAt(long index, int value) { VH_sliceOffset.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewSlicedCreateInfoEXT sliceCountAt(long index, int value) { VH_sliceCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewSlicedCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewSlicedCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewSlicedCreateInfoEXT sliceOffset(int value) { VH_sliceOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewSlicedCreateInfoEXT sliceCount(int value) { VH_sliceCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageViewSlicedCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageViewSlicedCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageViewSlicedCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageViewSlicedCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _sliceOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sliceOffset, index), LAYOUT_sliceOffset); }
    public MemorySegment _sliceOffset() { return _sliceOffsetAt(0L); }
    public VkImageViewSlicedCreateInfoEXT _sliceOffsetAt(long index, MemorySegment src) { _sliceOffsetAt(index).copyFrom(src); return this; }
    public VkImageViewSlicedCreateInfoEXT _sliceOffset(MemorySegment src) { return _sliceOffsetAt(0L, src); }
    public MemorySegment _sliceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sliceCount, index), LAYOUT_sliceCount); }
    public MemorySegment _sliceCount() { return _sliceCountAt(0L); }
    public VkImageViewSlicedCreateInfoEXT _sliceCountAt(long index, MemorySegment src) { _sliceCountAt(index).copyFrom(src); return this; }
    public VkImageViewSlicedCreateInfoEXT _sliceCount(MemorySegment src) { return _sliceCountAt(0L, src); }
}
