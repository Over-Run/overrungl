// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageFormatListCreateInfo`.
/// ## Layout
/// ```
/// struct VkImageFormatListCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t viewFormatCount;
///     const VkFormat* pViewFormats;
/// }
/// ```
public final class VkImageFormatListCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("viewFormatCount"),
        ValueLayout.ADDRESS.withName("pViewFormats")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_viewFormatCount = LAYOUT.byteOffset(PathElement.groupElement("viewFormatCount"));
    public static final long OFFSET_pViewFormats = LAYOUT.byteOffset(PathElement.groupElement("pViewFormats"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_viewFormatCount = LAYOUT.select(PathElement.groupElement("viewFormatCount"));
    public static final MemoryLayout LAYOUT_pViewFormats = LAYOUT.select(PathElement.groupElement("pViewFormats"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_viewFormatCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewFormatCount"));
    public static final VarHandle VH_pViewFormats = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewFormats"));

    public VkImageFormatListCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageFormatListCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageFormatListCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageFormatListCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageFormatListCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageFormatListCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageFormatListCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageFormatListCreateInfo alloc(SegmentAllocator allocator) { return new VkImageFormatListCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkImageFormatListCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkImageFormatListCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkImageFormatListCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO); }
    public static VkImageFormatListCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO);
        return s;
    }
    public VkImageFormatListCreateInfo copyFrom(VkImageFormatListCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageFormatListCreateInfo reinterpret(long count) { return new VkImageFormatListCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageFormatListCreateInfo asSlice(long index) { return new VkImageFormatListCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageFormatListCreateInfo asSlice(long index, long count) { return new VkImageFormatListCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageFormatListCreateInfo at(long index, Consumer<VkImageFormatListCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int viewFormatCountAt(long index) { return (int) VH_viewFormatCount.get(this.segment(), 0L, index); }
    public MemorySegment pViewFormatsAt(long index) { return (MemorySegment) VH_pViewFormats.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int viewFormatCount() { return (int) VH_viewFormatCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pViewFormats() { return (MemorySegment) VH_pViewFormats.get(this.segment(), 0L, 0L); }
    public VkImageFormatListCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatListCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatListCreateInfo viewFormatCountAt(long index, int value) { VH_viewFormatCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatListCreateInfo pViewFormatsAt(long index, MemorySegment value) { VH_pViewFormats.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatListCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatListCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatListCreateInfo viewFormatCount(int value) { VH_viewFormatCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatListCreateInfo pViewFormats(MemorySegment value) { VH_pViewFormats.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageFormatListCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageFormatListCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageFormatListCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageFormatListCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _viewFormatCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_viewFormatCount, index), LAYOUT_viewFormatCount); }
    public MemorySegment _viewFormatCount() { return _viewFormatCountAt(0L); }
    public VkImageFormatListCreateInfo _viewFormatCountAt(long index, MemorySegment src) { _viewFormatCountAt(index).copyFrom(src); return this; }
    public VkImageFormatListCreateInfo _viewFormatCount(MemorySegment src) { return _viewFormatCountAt(0L, src); }
    public MemorySegment _pViewFormatsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pViewFormats, index), LAYOUT_pViewFormats); }
    public MemorySegment _pViewFormats() { return _pViewFormatsAt(0L); }
    public VkImageFormatListCreateInfo _pViewFormatsAt(long index, MemorySegment src) { _pViewFormatsAt(index).copyFrom(src); return this; }
    public VkImageFormatListCreateInfo _pViewFormats(MemorySegment src) { return _pViewFormatsAt(0L, src); }
}
