// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkHostImageLayoutTransitionInfo`.
/// ## Layout
/// ```
/// struct VkHostImageLayoutTransitionInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkImage image;
///     VkImageLayout oldLayout;
///     VkImageLayout newLayout;
///     VkImageSubresourceRange subresourceRange;
/// }
/// ```
public final class VkHostImageLayoutTransitionInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("image"),
        ValueLayout.JAVA_INT.withName("oldLayout"),
        ValueLayout.JAVA_INT.withName("newLayout"),
        overrungl.vulkan.struct.VkImageSubresourceRange.LAYOUT.withName("subresourceRange")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_image = LAYOUT.byteOffset(PathElement.groupElement("image"));
    public static final long OFFSET_oldLayout = LAYOUT.byteOffset(PathElement.groupElement("oldLayout"));
    public static final long OFFSET_newLayout = LAYOUT.byteOffset(PathElement.groupElement("newLayout"));
    public static final long OFFSET_subresourceRange = LAYOUT.byteOffset(PathElement.groupElement("subresourceRange"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_image = LAYOUT.select(PathElement.groupElement("image"));
    public static final MemoryLayout LAYOUT_oldLayout = LAYOUT.select(PathElement.groupElement("oldLayout"));
    public static final MemoryLayout LAYOUT_newLayout = LAYOUT.select(PathElement.groupElement("newLayout"));
    public static final MemoryLayout LAYOUT_subresourceRange = LAYOUT.select(PathElement.groupElement("subresourceRange"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_image = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image"));
    public static final VarHandle VH_oldLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("oldLayout"));
    public static final VarHandle VH_newLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("newLayout"));
    public static final VarHandle VH_subresourceRange$aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subresourceRange"), PathElement.groupElement("aspectMask"));
    public static final VarHandle VH_subresourceRange$baseMipLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subresourceRange"), PathElement.groupElement("baseMipLevel"));
    public static final VarHandle VH_subresourceRange$levelCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subresourceRange"), PathElement.groupElement("levelCount"));
    public static final VarHandle VH_subresourceRange$baseArrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subresourceRange"), PathElement.groupElement("baseArrayLayer"));
    public static final VarHandle VH_subresourceRange$layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subresourceRange"), PathElement.groupElement("layerCount"));

    public VkHostImageLayoutTransitionInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkHostImageLayoutTransitionInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkHostImageLayoutTransitionInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkHostImageLayoutTransitionInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkHostImageLayoutTransitionInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkHostImageLayoutTransitionInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkHostImageLayoutTransitionInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkHostImageLayoutTransitionInfo alloc(SegmentAllocator allocator) { return new VkHostImageLayoutTransitionInfo(allocator.allocate(LAYOUT), 1); }
    public static VkHostImageLayoutTransitionInfo alloc(SegmentAllocator allocator, long count) { return new VkHostImageLayoutTransitionInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkHostImageLayoutTransitionInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO); }
    public static VkHostImageLayoutTransitionInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO);
        return s;
    }
    public VkHostImageLayoutTransitionInfo copyFrom(VkHostImageLayoutTransitionInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkHostImageLayoutTransitionInfo reinterpret(long count) { return new VkHostImageLayoutTransitionInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkHostImageLayoutTransitionInfo asSlice(long index) { return new VkHostImageLayoutTransitionInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkHostImageLayoutTransitionInfo asSlice(long index, long count) { return new VkHostImageLayoutTransitionInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkHostImageLayoutTransitionInfo at(long index, Consumer<VkHostImageLayoutTransitionInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long imageAt(long index) { return (long) VH_image.get(this.segment(), 0L, index); }
    public int oldLayoutAt(long index) { return (int) VH_oldLayout.get(this.segment(), 0L, index); }
    public int newLayoutAt(long index) { return (int) VH_newLayout.get(this.segment(), 0L, index); }
    public int subresourceRange$aspectMaskAt(long index) { return (int) VH_subresourceRange$aspectMask.get(this.segment(), 0L, index); }
    public int subresourceRange$baseMipLevelAt(long index) { return (int) VH_subresourceRange$baseMipLevel.get(this.segment(), 0L, index); }
    public int subresourceRange$levelCountAt(long index) { return (int) VH_subresourceRange$levelCount.get(this.segment(), 0L, index); }
    public int subresourceRange$baseArrayLayerAt(long index) { return (int) VH_subresourceRange$baseArrayLayer.get(this.segment(), 0L, index); }
    public int subresourceRange$layerCountAt(long index) { return (int) VH_subresourceRange$layerCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long image() { return (long) VH_image.get(this.segment(), 0L, 0L); }
    public int oldLayout() { return (int) VH_oldLayout.get(this.segment(), 0L, 0L); }
    public int newLayout() { return (int) VH_newLayout.get(this.segment(), 0L, 0L); }
    public int subresourceRange$aspectMask() { return (int) VH_subresourceRange$aspectMask.get(this.segment(), 0L, 0L); }
    public int subresourceRange$baseMipLevel() { return (int) VH_subresourceRange$baseMipLevel.get(this.segment(), 0L, 0L); }
    public int subresourceRange$levelCount() { return (int) VH_subresourceRange$levelCount.get(this.segment(), 0L, 0L); }
    public int subresourceRange$baseArrayLayer() { return (int) VH_subresourceRange$baseArrayLayer.get(this.segment(), 0L, 0L); }
    public int subresourceRange$layerCount() { return (int) VH_subresourceRange$layerCount.get(this.segment(), 0L, 0L); }
    public VkHostImageLayoutTransitionInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkHostImageLayoutTransitionInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkHostImageLayoutTransitionInfo imageAt(long index, long value) { VH_image.set(this.segment(), 0L, index, value); return this; }
    public VkHostImageLayoutTransitionInfo oldLayoutAt(long index, int value) { VH_oldLayout.set(this.segment(), 0L, index, value); return this; }
    public VkHostImageLayoutTransitionInfo newLayoutAt(long index, int value) { VH_newLayout.set(this.segment(), 0L, index, value); return this; }
    public VkHostImageLayoutTransitionInfo subresourceRange$aspectMaskAt(long index, int value) { VH_subresourceRange$aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkHostImageLayoutTransitionInfo subresourceRange$baseMipLevelAt(long index, int value) { VH_subresourceRange$baseMipLevel.set(this.segment(), 0L, index, value); return this; }
    public VkHostImageLayoutTransitionInfo subresourceRange$levelCountAt(long index, int value) { VH_subresourceRange$levelCount.set(this.segment(), 0L, index, value); return this; }
    public VkHostImageLayoutTransitionInfo subresourceRange$baseArrayLayerAt(long index, int value) { VH_subresourceRange$baseArrayLayer.set(this.segment(), 0L, index, value); return this; }
    public VkHostImageLayoutTransitionInfo subresourceRange$layerCountAt(long index, int value) { VH_subresourceRange$layerCount.set(this.segment(), 0L, index, value); return this; }
    public VkHostImageLayoutTransitionInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkHostImageLayoutTransitionInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkHostImageLayoutTransitionInfo image(long value) { VH_image.set(this.segment(), 0L, 0L, value); return this; }
    public VkHostImageLayoutTransitionInfo oldLayout(int value) { VH_oldLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkHostImageLayoutTransitionInfo newLayout(int value) { VH_newLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkHostImageLayoutTransitionInfo subresourceRange$aspectMask(int value) { VH_subresourceRange$aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkHostImageLayoutTransitionInfo subresourceRange$baseMipLevel(int value) { VH_subresourceRange$baseMipLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkHostImageLayoutTransitionInfo subresourceRange$levelCount(int value) { VH_subresourceRange$levelCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkHostImageLayoutTransitionInfo subresourceRange$baseArrayLayer(int value) { VH_subresourceRange$baseArrayLayer.set(this.segment(), 0L, 0L, value); return this; }
    public VkHostImageLayoutTransitionInfo subresourceRange$layerCount(int value) { VH_subresourceRange$layerCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkHostImageLayoutTransitionInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkHostImageLayoutTransitionInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkHostImageLayoutTransitionInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkHostImageLayoutTransitionInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _imageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_image, index), LAYOUT_image); }
    public MemorySegment _image() { return _imageAt(0L); }
    public VkHostImageLayoutTransitionInfo _imageAt(long index, MemorySegment src) { _imageAt(index).copyFrom(src); return this; }
    public VkHostImageLayoutTransitionInfo _image(MemorySegment src) { return _imageAt(0L, src); }
    public MemorySegment _oldLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_oldLayout, index), LAYOUT_oldLayout); }
    public MemorySegment _oldLayout() { return _oldLayoutAt(0L); }
    public VkHostImageLayoutTransitionInfo _oldLayoutAt(long index, MemorySegment src) { _oldLayoutAt(index).copyFrom(src); return this; }
    public VkHostImageLayoutTransitionInfo _oldLayout(MemorySegment src) { return _oldLayoutAt(0L, src); }
    public MemorySegment _newLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_newLayout, index), LAYOUT_newLayout); }
    public MemorySegment _newLayout() { return _newLayoutAt(0L); }
    public VkHostImageLayoutTransitionInfo _newLayoutAt(long index, MemorySegment src) { _newLayoutAt(index).copyFrom(src); return this; }
    public VkHostImageLayoutTransitionInfo _newLayout(MemorySegment src) { return _newLayoutAt(0L, src); }
    public MemorySegment _subresourceRangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subresourceRange, index), LAYOUT_subresourceRange); }
    public MemorySegment _subresourceRange() { return _subresourceRangeAt(0L); }
    public VkHostImageLayoutTransitionInfo _subresourceRangeAt(long index, MemorySegment src) { _subresourceRangeAt(index).copyFrom(src); return this; }
    public VkHostImageLayoutTransitionInfo _subresourceRange(MemorySegment src) { return _subresourceRangeAt(0L, src); }
}
