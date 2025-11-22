// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageViewCreateInfo`.
/// ## Layout
/// ```
/// struct VkImageViewCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkImageViewCreateFlags flags;
///     VkImage image;
///     VkImageViewType viewType;
///     VkFormat format;
///     VkComponentMapping components;
///     VkImageSubresourceRange subresourceRange;
/// }
/// ```
public final class VkImageViewCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("image"),
        ValueLayout.JAVA_INT.withName("viewType"),
        ValueLayout.JAVA_INT.withName("format"),
        overrungl.vulkan.struct.VkComponentMapping.LAYOUT.withName("components"),
        overrungl.vulkan.struct.VkImageSubresourceRange.LAYOUT.withName("subresourceRange")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_image = LAYOUT.byteOffset(PathElement.groupElement("image"));
    public static final long OFFSET_viewType = LAYOUT.byteOffset(PathElement.groupElement("viewType"));
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    public static final long OFFSET_components = LAYOUT.byteOffset(PathElement.groupElement("components"));
    public static final long OFFSET_subresourceRange = LAYOUT.byteOffset(PathElement.groupElement("subresourceRange"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_image = LAYOUT.select(PathElement.groupElement("image"));
    public static final MemoryLayout LAYOUT_viewType = LAYOUT.select(PathElement.groupElement("viewType"));
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    public static final MemoryLayout LAYOUT_components = LAYOUT.select(PathElement.groupElement("components"));
    public static final MemoryLayout LAYOUT_subresourceRange = LAYOUT.select(PathElement.groupElement("subresourceRange"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_image = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image"));
    public static final VarHandle VH_viewType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewType"));
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    public static final VarHandle VH_components$r = LAYOUT.arrayElementVarHandle(PathElement.groupElement("components"), PathElement.groupElement("r"));
    public static final VarHandle VH_components$g = LAYOUT.arrayElementVarHandle(PathElement.groupElement("components"), PathElement.groupElement("g"));
    public static final VarHandle VH_components$b = LAYOUT.arrayElementVarHandle(PathElement.groupElement("components"), PathElement.groupElement("b"));
    public static final VarHandle VH_components$a = LAYOUT.arrayElementVarHandle(PathElement.groupElement("components"), PathElement.groupElement("a"));
    public static final VarHandle VH_subresourceRange$aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subresourceRange"), PathElement.groupElement("aspectMask"));
    public static final VarHandle VH_subresourceRange$baseMipLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subresourceRange"), PathElement.groupElement("baseMipLevel"));
    public static final VarHandle VH_subresourceRange$levelCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subresourceRange"), PathElement.groupElement("levelCount"));
    public static final VarHandle VH_subresourceRange$baseArrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subresourceRange"), PathElement.groupElement("baseArrayLayer"));
    public static final VarHandle VH_subresourceRange$layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subresourceRange"), PathElement.groupElement("layerCount"));

    public VkImageViewCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageViewCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageViewCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageViewCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageViewCreateInfo alloc(SegmentAllocator allocator) { return new VkImageViewCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkImageViewCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkImageViewCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkImageViewCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO); }
    public static VkImageViewCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO);
        return s;
    }
    public VkImageViewCreateInfo copyFrom(VkImageViewCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageViewCreateInfo reinterpret(long count) { return new VkImageViewCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageViewCreateInfo asSlice(long index) { return new VkImageViewCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageViewCreateInfo asSlice(long index, long count) { return new VkImageViewCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageViewCreateInfo at(long index, Consumer<VkImageViewCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long imageAt(long index) { return (long) VH_image.get(this.segment(), 0L, index); }
    public int viewTypeAt(long index) { return (int) VH_viewType.get(this.segment(), 0L, index); }
    public int formatAt(long index) { return (int) VH_format.get(this.segment(), 0L, index); }
    public int components$rAt(long index) { return (int) VH_components$r.get(this.segment(), 0L, index); }
    public int components$gAt(long index) { return (int) VH_components$g.get(this.segment(), 0L, index); }
    public int components$bAt(long index) { return (int) VH_components$b.get(this.segment(), 0L, index); }
    public int components$aAt(long index) { return (int) VH_components$a.get(this.segment(), 0L, index); }
    public int subresourceRange$aspectMaskAt(long index) { return (int) VH_subresourceRange$aspectMask.get(this.segment(), 0L, index); }
    public int subresourceRange$baseMipLevelAt(long index) { return (int) VH_subresourceRange$baseMipLevel.get(this.segment(), 0L, index); }
    public int subresourceRange$levelCountAt(long index) { return (int) VH_subresourceRange$levelCount.get(this.segment(), 0L, index); }
    public int subresourceRange$baseArrayLayerAt(long index) { return (int) VH_subresourceRange$baseArrayLayer.get(this.segment(), 0L, index); }
    public int subresourceRange$layerCountAt(long index) { return (int) VH_subresourceRange$layerCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public long image() { return (long) VH_image.get(this.segment(), 0L, 0L); }
    public int viewType() { return (int) VH_viewType.get(this.segment(), 0L, 0L); }
    public int format() { return (int) VH_format.get(this.segment(), 0L, 0L); }
    public int components$r() { return (int) VH_components$r.get(this.segment(), 0L, 0L); }
    public int components$g() { return (int) VH_components$g.get(this.segment(), 0L, 0L); }
    public int components$b() { return (int) VH_components$b.get(this.segment(), 0L, 0L); }
    public int components$a() { return (int) VH_components$a.get(this.segment(), 0L, 0L); }
    public int subresourceRange$aspectMask() { return (int) VH_subresourceRange$aspectMask.get(this.segment(), 0L, 0L); }
    public int subresourceRange$baseMipLevel() { return (int) VH_subresourceRange$baseMipLevel.get(this.segment(), 0L, 0L); }
    public int subresourceRange$levelCount() { return (int) VH_subresourceRange$levelCount.get(this.segment(), 0L, 0L); }
    public int subresourceRange$baseArrayLayer() { return (int) VH_subresourceRange$baseArrayLayer.get(this.segment(), 0L, 0L); }
    public int subresourceRange$layerCount() { return (int) VH_subresourceRange$layerCount.get(this.segment(), 0L, 0L); }
    public VkImageViewCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewCreateInfo imageAt(long index, long value) { VH_image.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewCreateInfo viewTypeAt(long index, int value) { VH_viewType.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewCreateInfo formatAt(long index, int value) { VH_format.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewCreateInfo components$rAt(long index, int value) { VH_components$r.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewCreateInfo components$gAt(long index, int value) { VH_components$g.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewCreateInfo components$bAt(long index, int value) { VH_components$b.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewCreateInfo components$aAt(long index, int value) { VH_components$a.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewCreateInfo subresourceRange$aspectMaskAt(long index, int value) { VH_subresourceRange$aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewCreateInfo subresourceRange$baseMipLevelAt(long index, int value) { VH_subresourceRange$baseMipLevel.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewCreateInfo subresourceRange$levelCountAt(long index, int value) { VH_subresourceRange$levelCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewCreateInfo subresourceRange$baseArrayLayerAt(long index, int value) { VH_subresourceRange$baseArrayLayer.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewCreateInfo subresourceRange$layerCountAt(long index, int value) { VH_subresourceRange$layerCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewCreateInfo image(long value) { VH_image.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewCreateInfo viewType(int value) { VH_viewType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewCreateInfo format(int value) { VH_format.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewCreateInfo components$r(int value) { VH_components$r.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewCreateInfo components$g(int value) { VH_components$g.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewCreateInfo components$b(int value) { VH_components$b.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewCreateInfo components$a(int value) { VH_components$a.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewCreateInfo subresourceRange$aspectMask(int value) { VH_subresourceRange$aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewCreateInfo subresourceRange$baseMipLevel(int value) { VH_subresourceRange$baseMipLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewCreateInfo subresourceRange$levelCount(int value) { VH_subresourceRange$levelCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewCreateInfo subresourceRange$baseArrayLayer(int value) { VH_subresourceRange$baseArrayLayer.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewCreateInfo subresourceRange$layerCount(int value) { VH_subresourceRange$layerCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageViewCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageViewCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageViewCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageViewCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkImageViewCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkImageViewCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _imageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_image, index), LAYOUT_image); }
    public MemorySegment _image() { return _imageAt(0L); }
    public VkImageViewCreateInfo _imageAt(long index, MemorySegment src) { _imageAt(index).copyFrom(src); return this; }
    public VkImageViewCreateInfo _image(MemorySegment src) { return _imageAt(0L, src); }
    public MemorySegment _viewTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_viewType, index), LAYOUT_viewType); }
    public MemorySegment _viewType() { return _viewTypeAt(0L); }
    public VkImageViewCreateInfo _viewTypeAt(long index, MemorySegment src) { _viewTypeAt(index).copyFrom(src); return this; }
    public VkImageViewCreateInfo _viewType(MemorySegment src) { return _viewTypeAt(0L, src); }
    public MemorySegment _formatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_format, index), LAYOUT_format); }
    public MemorySegment _format() { return _formatAt(0L); }
    public VkImageViewCreateInfo _formatAt(long index, MemorySegment src) { _formatAt(index).copyFrom(src); return this; }
    public VkImageViewCreateInfo _format(MemorySegment src) { return _formatAt(0L, src); }
    public MemorySegment _componentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_components, index), LAYOUT_components); }
    public MemorySegment _components() { return _componentsAt(0L); }
    public VkImageViewCreateInfo _componentsAt(long index, MemorySegment src) { _componentsAt(index).copyFrom(src); return this; }
    public VkImageViewCreateInfo _components(MemorySegment src) { return _componentsAt(0L, src); }
    public MemorySegment _subresourceRangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subresourceRange, index), LAYOUT_subresourceRange); }
    public MemorySegment _subresourceRange() { return _subresourceRangeAt(0L); }
    public VkImageViewCreateInfo _subresourceRangeAt(long index, MemorySegment src) { _subresourceRangeAt(index).copyFrom(src); return this; }
    public VkImageViewCreateInfo _subresourceRange(MemorySegment src) { return _subresourceRangeAt(0L, src); }
}
