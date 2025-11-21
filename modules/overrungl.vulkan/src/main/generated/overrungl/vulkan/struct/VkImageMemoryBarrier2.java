// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageMemoryBarrier2`.
/// ## Layout
/// ```
/// struct VkImageMemoryBarrier2 {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineStageFlags2 srcStageMask;
///     VkAccessFlags2 srcAccessMask;
///     VkPipelineStageFlags2 dstStageMask;
///     VkAccessFlags2 dstAccessMask;
///     VkImageLayout oldLayout;
///     VkImageLayout newLayout;
///     uint32_t srcQueueFamilyIndex;
///     uint32_t dstQueueFamilyIndex;
///     VkImage image;
///     VkImageSubresourceRange subresourceRange;
/// }
/// ```
public final class VkImageMemoryBarrier2 extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("srcStageMask"),
        ValueLayout.JAVA_LONG.withName("srcAccessMask"),
        ValueLayout.JAVA_LONG.withName("dstStageMask"),
        ValueLayout.JAVA_LONG.withName("dstAccessMask"),
        ValueLayout.JAVA_INT.withName("oldLayout"),
        ValueLayout.JAVA_INT.withName("newLayout"),
        ValueLayout.JAVA_INT.withName("srcQueueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("dstQueueFamilyIndex"),
        ValueLayout.JAVA_LONG.withName("image"),
        overrungl.vulkan.struct.VkImageSubresourceRange.LAYOUT.withName("subresourceRange")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_srcStageMask = LAYOUT.byteOffset(PathElement.groupElement("srcStageMask"));
    public static final long OFFSET_srcAccessMask = LAYOUT.byteOffset(PathElement.groupElement("srcAccessMask"));
    public static final long OFFSET_dstStageMask = LAYOUT.byteOffset(PathElement.groupElement("dstStageMask"));
    public static final long OFFSET_dstAccessMask = LAYOUT.byteOffset(PathElement.groupElement("dstAccessMask"));
    public static final long OFFSET_oldLayout = LAYOUT.byteOffset(PathElement.groupElement("oldLayout"));
    public static final long OFFSET_newLayout = LAYOUT.byteOffset(PathElement.groupElement("newLayout"));
    public static final long OFFSET_srcQueueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("srcQueueFamilyIndex"));
    public static final long OFFSET_dstQueueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("dstQueueFamilyIndex"));
    public static final long OFFSET_image = LAYOUT.byteOffset(PathElement.groupElement("image"));
    public static final long OFFSET_subresourceRange = LAYOUT.byteOffset(PathElement.groupElement("subresourceRange"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_srcStageMask = LAYOUT.select(PathElement.groupElement("srcStageMask"));
    public static final MemoryLayout LAYOUT_srcAccessMask = LAYOUT.select(PathElement.groupElement("srcAccessMask"));
    public static final MemoryLayout LAYOUT_dstStageMask = LAYOUT.select(PathElement.groupElement("dstStageMask"));
    public static final MemoryLayout LAYOUT_dstAccessMask = LAYOUT.select(PathElement.groupElement("dstAccessMask"));
    public static final MemoryLayout LAYOUT_oldLayout = LAYOUT.select(PathElement.groupElement("oldLayout"));
    public static final MemoryLayout LAYOUT_newLayout = LAYOUT.select(PathElement.groupElement("newLayout"));
    public static final MemoryLayout LAYOUT_srcQueueFamilyIndex = LAYOUT.select(PathElement.groupElement("srcQueueFamilyIndex"));
    public static final MemoryLayout LAYOUT_dstQueueFamilyIndex = LAYOUT.select(PathElement.groupElement("dstQueueFamilyIndex"));
    public static final MemoryLayout LAYOUT_image = LAYOUT.select(PathElement.groupElement("image"));
    public static final MemoryLayout LAYOUT_subresourceRange = LAYOUT.select(PathElement.groupElement("subresourceRange"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_srcStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcStageMask"));
    public static final VarHandle VH_srcAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccessMask"));
    public static final VarHandle VH_dstStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstStageMask"));
    public static final VarHandle VH_dstAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAccessMask"));
    public static final VarHandle VH_oldLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("oldLayout"));
    public static final VarHandle VH_newLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("newLayout"));
    public static final VarHandle VH_srcQueueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcQueueFamilyIndex"));
    public static final VarHandle VH_dstQueueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstQueueFamilyIndex"));
    public static final VarHandle VH_image = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image"));
    public static final VarHandle VH_subresourceRange$aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subresourceRange"), PathElement.groupElement("aspectMask"));
    public static final VarHandle VH_subresourceRange$baseMipLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subresourceRange"), PathElement.groupElement("baseMipLevel"));
    public static final VarHandle VH_subresourceRange$levelCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subresourceRange"), PathElement.groupElement("levelCount"));
    public static final VarHandle VH_subresourceRange$baseArrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subresourceRange"), PathElement.groupElement("baseArrayLayer"));
    public static final VarHandle VH_subresourceRange$layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subresourceRange"), PathElement.groupElement("layerCount"));

    public VkImageMemoryBarrier2(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageMemoryBarrier2 of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageMemoryBarrier2(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageMemoryBarrier2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageMemoryBarrier2(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageMemoryBarrier2 ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageMemoryBarrier2(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageMemoryBarrier2 alloc(SegmentAllocator allocator) { return new VkImageMemoryBarrier2(allocator.allocate(LAYOUT), 1); }
    public static VkImageMemoryBarrier2 alloc(SegmentAllocator allocator, long count) { return new VkImageMemoryBarrier2(allocator.allocate(LAYOUT, count), count); }
    public static VkImageMemoryBarrier2 allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2); }
    public static VkImageMemoryBarrier2 allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2);
        return s;
    }
    public VkImageMemoryBarrier2 copyFrom(VkImageMemoryBarrier2 src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageMemoryBarrier2 reinterpret(long count) { return new VkImageMemoryBarrier2(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageMemoryBarrier2 asSlice(long index) { return new VkImageMemoryBarrier2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageMemoryBarrier2 asSlice(long index, long count) { return new VkImageMemoryBarrier2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageMemoryBarrier2 at(long index, Consumer<VkImageMemoryBarrier2> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long srcStageMaskAt(long index) { return (long) VH_srcStageMask.get(this.segment(), 0L, index); }
    public long srcAccessMaskAt(long index) { return (long) VH_srcAccessMask.get(this.segment(), 0L, index); }
    public long dstStageMaskAt(long index) { return (long) VH_dstStageMask.get(this.segment(), 0L, index); }
    public long dstAccessMaskAt(long index) { return (long) VH_dstAccessMask.get(this.segment(), 0L, index); }
    public int oldLayoutAt(long index) { return (int) VH_oldLayout.get(this.segment(), 0L, index); }
    public int newLayoutAt(long index) { return (int) VH_newLayout.get(this.segment(), 0L, index); }
    public int srcQueueFamilyIndexAt(long index) { return (int) VH_srcQueueFamilyIndex.get(this.segment(), 0L, index); }
    public int dstQueueFamilyIndexAt(long index) { return (int) VH_dstQueueFamilyIndex.get(this.segment(), 0L, index); }
    public long imageAt(long index) { return (long) VH_image.get(this.segment(), 0L, index); }
    public int subresourceRange$aspectMaskAt(long index) { return (int) VH_subresourceRange$aspectMask.get(this.segment(), 0L, index); }
    public int subresourceRange$baseMipLevelAt(long index) { return (int) VH_subresourceRange$baseMipLevel.get(this.segment(), 0L, index); }
    public int subresourceRange$levelCountAt(long index) { return (int) VH_subresourceRange$levelCount.get(this.segment(), 0L, index); }
    public int subresourceRange$baseArrayLayerAt(long index) { return (int) VH_subresourceRange$baseArrayLayer.get(this.segment(), 0L, index); }
    public int subresourceRange$layerCountAt(long index) { return (int) VH_subresourceRange$layerCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long srcStageMask() { return (long) VH_srcStageMask.get(this.segment(), 0L, 0L); }
    public long srcAccessMask() { return (long) VH_srcAccessMask.get(this.segment(), 0L, 0L); }
    public long dstStageMask() { return (long) VH_dstStageMask.get(this.segment(), 0L, 0L); }
    public long dstAccessMask() { return (long) VH_dstAccessMask.get(this.segment(), 0L, 0L); }
    public int oldLayout() { return (int) VH_oldLayout.get(this.segment(), 0L, 0L); }
    public int newLayout() { return (int) VH_newLayout.get(this.segment(), 0L, 0L); }
    public int srcQueueFamilyIndex() { return (int) VH_srcQueueFamilyIndex.get(this.segment(), 0L, 0L); }
    public int dstQueueFamilyIndex() { return (int) VH_dstQueueFamilyIndex.get(this.segment(), 0L, 0L); }
    public long image() { return (long) VH_image.get(this.segment(), 0L, 0L); }
    public int subresourceRange$aspectMask() { return (int) VH_subresourceRange$aspectMask.get(this.segment(), 0L, 0L); }
    public int subresourceRange$baseMipLevel() { return (int) VH_subresourceRange$baseMipLevel.get(this.segment(), 0L, 0L); }
    public int subresourceRange$levelCount() { return (int) VH_subresourceRange$levelCount.get(this.segment(), 0L, 0L); }
    public int subresourceRange$baseArrayLayer() { return (int) VH_subresourceRange$baseArrayLayer.get(this.segment(), 0L, 0L); }
    public int subresourceRange$layerCount() { return (int) VH_subresourceRange$layerCount.get(this.segment(), 0L, 0L); }
    public VkImageMemoryBarrier2 sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageMemoryBarrier2 pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageMemoryBarrier2 srcStageMaskAt(long index, long value) { VH_srcStageMask.set(this.segment(), 0L, index, value); return this; }
    public VkImageMemoryBarrier2 srcAccessMaskAt(long index, long value) { VH_srcAccessMask.set(this.segment(), 0L, index, value); return this; }
    public VkImageMemoryBarrier2 dstStageMaskAt(long index, long value) { VH_dstStageMask.set(this.segment(), 0L, index, value); return this; }
    public VkImageMemoryBarrier2 dstAccessMaskAt(long index, long value) { VH_dstAccessMask.set(this.segment(), 0L, index, value); return this; }
    public VkImageMemoryBarrier2 oldLayoutAt(long index, int value) { VH_oldLayout.set(this.segment(), 0L, index, value); return this; }
    public VkImageMemoryBarrier2 newLayoutAt(long index, int value) { VH_newLayout.set(this.segment(), 0L, index, value); return this; }
    public VkImageMemoryBarrier2 srcQueueFamilyIndexAt(long index, int value) { VH_srcQueueFamilyIndex.set(this.segment(), 0L, index, value); return this; }
    public VkImageMemoryBarrier2 dstQueueFamilyIndexAt(long index, int value) { VH_dstQueueFamilyIndex.set(this.segment(), 0L, index, value); return this; }
    public VkImageMemoryBarrier2 imageAt(long index, long value) { VH_image.set(this.segment(), 0L, index, value); return this; }
    public VkImageMemoryBarrier2 subresourceRange$aspectMaskAt(long index, int value) { VH_subresourceRange$aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkImageMemoryBarrier2 subresourceRange$baseMipLevelAt(long index, int value) { VH_subresourceRange$baseMipLevel.set(this.segment(), 0L, index, value); return this; }
    public VkImageMemoryBarrier2 subresourceRange$levelCountAt(long index, int value) { VH_subresourceRange$levelCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageMemoryBarrier2 subresourceRange$baseArrayLayerAt(long index, int value) { VH_subresourceRange$baseArrayLayer.set(this.segment(), 0L, index, value); return this; }
    public VkImageMemoryBarrier2 subresourceRange$layerCountAt(long index, int value) { VH_subresourceRange$layerCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageMemoryBarrier2 sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageMemoryBarrier2 pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageMemoryBarrier2 srcStageMask(long value) { VH_srcStageMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageMemoryBarrier2 srcAccessMask(long value) { VH_srcAccessMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageMemoryBarrier2 dstStageMask(long value) { VH_dstStageMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageMemoryBarrier2 dstAccessMask(long value) { VH_dstAccessMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageMemoryBarrier2 oldLayout(int value) { VH_oldLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageMemoryBarrier2 newLayout(int value) { VH_newLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageMemoryBarrier2 srcQueueFamilyIndex(int value) { VH_srcQueueFamilyIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageMemoryBarrier2 dstQueueFamilyIndex(int value) { VH_dstQueueFamilyIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageMemoryBarrier2 image(long value) { VH_image.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageMemoryBarrier2 subresourceRange$aspectMask(int value) { VH_subresourceRange$aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageMemoryBarrier2 subresourceRange$baseMipLevel(int value) { VH_subresourceRange$baseMipLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageMemoryBarrier2 subresourceRange$levelCount(int value) { VH_subresourceRange$levelCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageMemoryBarrier2 subresourceRange$baseArrayLayer(int value) { VH_subresourceRange$baseArrayLayer.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageMemoryBarrier2 subresourceRange$layerCount(int value) { VH_subresourceRange$layerCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageMemoryBarrier2 _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageMemoryBarrier2 _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageMemoryBarrier2 _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageMemoryBarrier2 _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _srcStageMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcStageMask, index), LAYOUT_srcStageMask); }
    public MemorySegment _srcStageMask() { return _srcStageMaskAt(0L); }
    public VkImageMemoryBarrier2 _srcStageMaskAt(long index, MemorySegment src) { _srcStageMaskAt(index).copyFrom(src); return this; }
    public VkImageMemoryBarrier2 _srcStageMask(MemorySegment src) { return _srcStageMaskAt(0L, src); }
    public MemorySegment _srcAccessMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcAccessMask, index), LAYOUT_srcAccessMask); }
    public MemorySegment _srcAccessMask() { return _srcAccessMaskAt(0L); }
    public VkImageMemoryBarrier2 _srcAccessMaskAt(long index, MemorySegment src) { _srcAccessMaskAt(index).copyFrom(src); return this; }
    public VkImageMemoryBarrier2 _srcAccessMask(MemorySegment src) { return _srcAccessMaskAt(0L, src); }
    public MemorySegment _dstStageMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstStageMask, index), LAYOUT_dstStageMask); }
    public MemorySegment _dstStageMask() { return _dstStageMaskAt(0L); }
    public VkImageMemoryBarrier2 _dstStageMaskAt(long index, MemorySegment src) { _dstStageMaskAt(index).copyFrom(src); return this; }
    public VkImageMemoryBarrier2 _dstStageMask(MemorySegment src) { return _dstStageMaskAt(0L, src); }
    public MemorySegment _dstAccessMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstAccessMask, index), LAYOUT_dstAccessMask); }
    public MemorySegment _dstAccessMask() { return _dstAccessMaskAt(0L); }
    public VkImageMemoryBarrier2 _dstAccessMaskAt(long index, MemorySegment src) { _dstAccessMaskAt(index).copyFrom(src); return this; }
    public VkImageMemoryBarrier2 _dstAccessMask(MemorySegment src) { return _dstAccessMaskAt(0L, src); }
    public MemorySegment _oldLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_oldLayout, index), LAYOUT_oldLayout); }
    public MemorySegment _oldLayout() { return _oldLayoutAt(0L); }
    public VkImageMemoryBarrier2 _oldLayoutAt(long index, MemorySegment src) { _oldLayoutAt(index).copyFrom(src); return this; }
    public VkImageMemoryBarrier2 _oldLayout(MemorySegment src) { return _oldLayoutAt(0L, src); }
    public MemorySegment _newLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_newLayout, index), LAYOUT_newLayout); }
    public MemorySegment _newLayout() { return _newLayoutAt(0L); }
    public VkImageMemoryBarrier2 _newLayoutAt(long index, MemorySegment src) { _newLayoutAt(index).copyFrom(src); return this; }
    public VkImageMemoryBarrier2 _newLayout(MemorySegment src) { return _newLayoutAt(0L, src); }
    public MemorySegment _srcQueueFamilyIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcQueueFamilyIndex, index), LAYOUT_srcQueueFamilyIndex); }
    public MemorySegment _srcQueueFamilyIndex() { return _srcQueueFamilyIndexAt(0L); }
    public VkImageMemoryBarrier2 _srcQueueFamilyIndexAt(long index, MemorySegment src) { _srcQueueFamilyIndexAt(index).copyFrom(src); return this; }
    public VkImageMemoryBarrier2 _srcQueueFamilyIndex(MemorySegment src) { return _srcQueueFamilyIndexAt(0L, src); }
    public MemorySegment _dstQueueFamilyIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstQueueFamilyIndex, index), LAYOUT_dstQueueFamilyIndex); }
    public MemorySegment _dstQueueFamilyIndex() { return _dstQueueFamilyIndexAt(0L); }
    public VkImageMemoryBarrier2 _dstQueueFamilyIndexAt(long index, MemorySegment src) { _dstQueueFamilyIndexAt(index).copyFrom(src); return this; }
    public VkImageMemoryBarrier2 _dstQueueFamilyIndex(MemorySegment src) { return _dstQueueFamilyIndexAt(0L, src); }
    public MemorySegment _imageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_image, index), LAYOUT_image); }
    public MemorySegment _image() { return _imageAt(0L); }
    public VkImageMemoryBarrier2 _imageAt(long index, MemorySegment src) { _imageAt(index).copyFrom(src); return this; }
    public VkImageMemoryBarrier2 _image(MemorySegment src) { return _imageAt(0L, src); }
    public MemorySegment _subresourceRangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subresourceRange, index), LAYOUT_subresourceRange); }
    public MemorySegment _subresourceRange() { return _subresourceRangeAt(0L); }
    public VkImageMemoryBarrier2 _subresourceRangeAt(long index, MemorySegment src) { _subresourceRangeAt(index).copyFrom(src); return this; }
    public VkImageMemoryBarrier2 _subresourceRange(MemorySegment src) { return _subresourceRangeAt(0L, src); }
}
