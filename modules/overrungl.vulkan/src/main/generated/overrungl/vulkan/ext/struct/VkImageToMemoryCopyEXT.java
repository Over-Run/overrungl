// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageToMemoryCopyEXT`.
/// ## Layout
/// ```
/// struct VkImageToMemoryCopyEXT {
///     VkStructureType sType;
///     const void* pNext;
///     void* pHostPointer;
///     uint32_t memoryRowLength;
///     uint32_t memoryImageHeight;
///     VkImageSubresourceLayers imageSubresource;
///     VkOffset3D imageOffset;
///     VkExtent3D imageExtent;
/// }
/// ```
public final class VkImageToMemoryCopyEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pHostPointer"),
        ValueLayout.JAVA_INT.withName("memoryRowLength"),
        ValueLayout.JAVA_INT.withName("memoryImageHeight"),
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("imageSubresource"),
        overrungl.vulkan.struct.VkOffset3D.LAYOUT.withName("imageOffset"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("imageExtent")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pHostPointer = LAYOUT.byteOffset(PathElement.groupElement("pHostPointer"));
    public static final long OFFSET_memoryRowLength = LAYOUT.byteOffset(PathElement.groupElement("memoryRowLength"));
    public static final long OFFSET_memoryImageHeight = LAYOUT.byteOffset(PathElement.groupElement("memoryImageHeight"));
    public static final long OFFSET_imageSubresource = LAYOUT.byteOffset(PathElement.groupElement("imageSubresource"));
    public static final long OFFSET_imageOffset = LAYOUT.byteOffset(PathElement.groupElement("imageOffset"));
    public static final long OFFSET_imageExtent = LAYOUT.byteOffset(PathElement.groupElement("imageExtent"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pHostPointer = LAYOUT.select(PathElement.groupElement("pHostPointer"));
    public static final MemoryLayout LAYOUT_memoryRowLength = LAYOUT.select(PathElement.groupElement("memoryRowLength"));
    public static final MemoryLayout LAYOUT_memoryImageHeight = LAYOUT.select(PathElement.groupElement("memoryImageHeight"));
    public static final MemoryLayout LAYOUT_imageSubresource = LAYOUT.select(PathElement.groupElement("imageSubresource"));
    public static final MemoryLayout LAYOUT_imageOffset = LAYOUT.select(PathElement.groupElement("imageOffset"));
    public static final MemoryLayout LAYOUT_imageExtent = LAYOUT.select(PathElement.groupElement("imageExtent"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pHostPointer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pHostPointer"));
    public static final VarHandle VH_memoryRowLength = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryRowLength"));
    public static final VarHandle VH_memoryImageHeight = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryImageHeight"));
    public static final VarHandle VH_imageSubresource$aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageSubresource"), PathElement.groupElement("aspectMask"));
    public static final VarHandle VH_imageSubresource$mipLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageSubresource"), PathElement.groupElement("mipLevel"));
    public static final VarHandle VH_imageSubresource$baseArrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageSubresource"), PathElement.groupElement("baseArrayLayer"));
    public static final VarHandle VH_imageSubresource$layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageSubresource"), PathElement.groupElement("layerCount"));
    public static final VarHandle VH_imageOffset$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageOffset"), PathElement.groupElement("x"));
    public static final VarHandle VH_imageOffset$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageOffset"), PathElement.groupElement("y"));
    public static final VarHandle VH_imageOffset$z = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageOffset"), PathElement.groupElement("z"));
    public static final VarHandle VH_imageExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_imageExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_imageExtent$depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageExtent"), PathElement.groupElement("depth"));

    public VkImageToMemoryCopyEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageToMemoryCopyEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageToMemoryCopyEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageToMemoryCopyEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageToMemoryCopyEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageToMemoryCopyEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageToMemoryCopyEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageToMemoryCopyEXT alloc(SegmentAllocator allocator) { return new VkImageToMemoryCopyEXT(allocator.allocate(LAYOUT), 1); }
    public static VkImageToMemoryCopyEXT alloc(SegmentAllocator allocator, long count) { return new VkImageToMemoryCopyEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkImageToMemoryCopyEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY); }
    public static VkImageToMemoryCopyEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY);
        return s;
    }
    public VkImageToMemoryCopyEXT copyFrom(VkImageToMemoryCopyEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageToMemoryCopyEXT reinterpret(long count) { return new VkImageToMemoryCopyEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageToMemoryCopyEXT asSlice(long index) { return new VkImageToMemoryCopyEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageToMemoryCopyEXT asSlice(long index, long count) { return new VkImageToMemoryCopyEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageToMemoryCopyEXT at(long index, Consumer<VkImageToMemoryCopyEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pHostPointerAt(long index) { return (MemorySegment) VH_pHostPointer.get(this.segment(), 0L, index); }
    public int memoryRowLengthAt(long index) { return (int) VH_memoryRowLength.get(this.segment(), 0L, index); }
    public int memoryImageHeightAt(long index) { return (int) VH_memoryImageHeight.get(this.segment(), 0L, index); }
    public int imageSubresource$aspectMaskAt(long index) { return (int) VH_imageSubresource$aspectMask.get(this.segment(), 0L, index); }
    public int imageSubresource$mipLevelAt(long index) { return (int) VH_imageSubresource$mipLevel.get(this.segment(), 0L, index); }
    public int imageSubresource$baseArrayLayerAt(long index) { return (int) VH_imageSubresource$baseArrayLayer.get(this.segment(), 0L, index); }
    public int imageSubresource$layerCountAt(long index) { return (int) VH_imageSubresource$layerCount.get(this.segment(), 0L, index); }
    public int imageOffset$xAt(long index) { return (int) VH_imageOffset$x.get(this.segment(), 0L, index); }
    public int imageOffset$yAt(long index) { return (int) VH_imageOffset$y.get(this.segment(), 0L, index); }
    public int imageOffset$zAt(long index) { return (int) VH_imageOffset$z.get(this.segment(), 0L, index); }
    public int imageExtent$widthAt(long index) { return (int) VH_imageExtent$width.get(this.segment(), 0L, index); }
    public int imageExtent$heightAt(long index) { return (int) VH_imageExtent$height.get(this.segment(), 0L, index); }
    public int imageExtent$depthAt(long index) { return (int) VH_imageExtent$depth.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pHostPointer() { return (MemorySegment) VH_pHostPointer.get(this.segment(), 0L, 0L); }
    public int memoryRowLength() { return (int) VH_memoryRowLength.get(this.segment(), 0L, 0L); }
    public int memoryImageHeight() { return (int) VH_memoryImageHeight.get(this.segment(), 0L, 0L); }
    public int imageSubresource$aspectMask() { return (int) VH_imageSubresource$aspectMask.get(this.segment(), 0L, 0L); }
    public int imageSubresource$mipLevel() { return (int) VH_imageSubresource$mipLevel.get(this.segment(), 0L, 0L); }
    public int imageSubresource$baseArrayLayer() { return (int) VH_imageSubresource$baseArrayLayer.get(this.segment(), 0L, 0L); }
    public int imageSubresource$layerCount() { return (int) VH_imageSubresource$layerCount.get(this.segment(), 0L, 0L); }
    public int imageOffset$x() { return (int) VH_imageOffset$x.get(this.segment(), 0L, 0L); }
    public int imageOffset$y() { return (int) VH_imageOffset$y.get(this.segment(), 0L, 0L); }
    public int imageOffset$z() { return (int) VH_imageOffset$z.get(this.segment(), 0L, 0L); }
    public int imageExtent$width() { return (int) VH_imageExtent$width.get(this.segment(), 0L, 0L); }
    public int imageExtent$height() { return (int) VH_imageExtent$height.get(this.segment(), 0L, 0L); }
    public int imageExtent$depth() { return (int) VH_imageExtent$depth.get(this.segment(), 0L, 0L); }
    public VkImageToMemoryCopyEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageToMemoryCopyEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageToMemoryCopyEXT pHostPointerAt(long index, MemorySegment value) { VH_pHostPointer.set(this.segment(), 0L, index, value); return this; }
    public VkImageToMemoryCopyEXT memoryRowLengthAt(long index, int value) { VH_memoryRowLength.set(this.segment(), 0L, index, value); return this; }
    public VkImageToMemoryCopyEXT memoryImageHeightAt(long index, int value) { VH_memoryImageHeight.set(this.segment(), 0L, index, value); return this; }
    public VkImageToMemoryCopyEXT imageSubresource$aspectMaskAt(long index, int value) { VH_imageSubresource$aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkImageToMemoryCopyEXT imageSubresource$mipLevelAt(long index, int value) { VH_imageSubresource$mipLevel.set(this.segment(), 0L, index, value); return this; }
    public VkImageToMemoryCopyEXT imageSubresource$baseArrayLayerAt(long index, int value) { VH_imageSubresource$baseArrayLayer.set(this.segment(), 0L, index, value); return this; }
    public VkImageToMemoryCopyEXT imageSubresource$layerCountAt(long index, int value) { VH_imageSubresource$layerCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageToMemoryCopyEXT imageOffset$xAt(long index, int value) { VH_imageOffset$x.set(this.segment(), 0L, index, value); return this; }
    public VkImageToMemoryCopyEXT imageOffset$yAt(long index, int value) { VH_imageOffset$y.set(this.segment(), 0L, index, value); return this; }
    public VkImageToMemoryCopyEXT imageOffset$zAt(long index, int value) { VH_imageOffset$z.set(this.segment(), 0L, index, value); return this; }
    public VkImageToMemoryCopyEXT imageExtent$widthAt(long index, int value) { VH_imageExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkImageToMemoryCopyEXT imageExtent$heightAt(long index, int value) { VH_imageExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkImageToMemoryCopyEXT imageExtent$depthAt(long index, int value) { VH_imageExtent$depth.set(this.segment(), 0L, index, value); return this; }
    public VkImageToMemoryCopyEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageToMemoryCopyEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageToMemoryCopyEXT pHostPointer(MemorySegment value) { VH_pHostPointer.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageToMemoryCopyEXT memoryRowLength(int value) { VH_memoryRowLength.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageToMemoryCopyEXT memoryImageHeight(int value) { VH_memoryImageHeight.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageToMemoryCopyEXT imageSubresource$aspectMask(int value) { VH_imageSubresource$aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageToMemoryCopyEXT imageSubresource$mipLevel(int value) { VH_imageSubresource$mipLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageToMemoryCopyEXT imageSubresource$baseArrayLayer(int value) { VH_imageSubresource$baseArrayLayer.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageToMemoryCopyEXT imageSubresource$layerCount(int value) { VH_imageSubresource$layerCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageToMemoryCopyEXT imageOffset$x(int value) { VH_imageOffset$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageToMemoryCopyEXT imageOffset$y(int value) { VH_imageOffset$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageToMemoryCopyEXT imageOffset$z(int value) { VH_imageOffset$z.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageToMemoryCopyEXT imageExtent$width(int value) { VH_imageExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageToMemoryCopyEXT imageExtent$height(int value) { VH_imageExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageToMemoryCopyEXT imageExtent$depth(int value) { VH_imageExtent$depth.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageToMemoryCopyEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageToMemoryCopyEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageToMemoryCopyEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageToMemoryCopyEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pHostPointerAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pHostPointer, index), LAYOUT_pHostPointer); }
    public MemorySegment _pHostPointer() { return _pHostPointerAt(0L); }
    public VkImageToMemoryCopyEXT _pHostPointerAt(long index, MemorySegment src) { _pHostPointerAt(index).copyFrom(src); return this; }
    public VkImageToMemoryCopyEXT _pHostPointer(MemorySegment src) { return _pHostPointerAt(0L, src); }
    public MemorySegment _memoryRowLengthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryRowLength, index), LAYOUT_memoryRowLength); }
    public MemorySegment _memoryRowLength() { return _memoryRowLengthAt(0L); }
    public VkImageToMemoryCopyEXT _memoryRowLengthAt(long index, MemorySegment src) { _memoryRowLengthAt(index).copyFrom(src); return this; }
    public VkImageToMemoryCopyEXT _memoryRowLength(MemorySegment src) { return _memoryRowLengthAt(0L, src); }
    public MemorySegment _memoryImageHeightAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryImageHeight, index), LAYOUT_memoryImageHeight); }
    public MemorySegment _memoryImageHeight() { return _memoryImageHeightAt(0L); }
    public VkImageToMemoryCopyEXT _memoryImageHeightAt(long index, MemorySegment src) { _memoryImageHeightAt(index).copyFrom(src); return this; }
    public VkImageToMemoryCopyEXT _memoryImageHeight(MemorySegment src) { return _memoryImageHeightAt(0L, src); }
    public MemorySegment _imageSubresourceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageSubresource, index), LAYOUT_imageSubresource); }
    public MemorySegment _imageSubresource() { return _imageSubresourceAt(0L); }
    public VkImageToMemoryCopyEXT _imageSubresourceAt(long index, MemorySegment src) { _imageSubresourceAt(index).copyFrom(src); return this; }
    public VkImageToMemoryCopyEXT _imageSubresource(MemorySegment src) { return _imageSubresourceAt(0L, src); }
    public MemorySegment _imageOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageOffset, index), LAYOUT_imageOffset); }
    public MemorySegment _imageOffset() { return _imageOffsetAt(0L); }
    public VkImageToMemoryCopyEXT _imageOffsetAt(long index, MemorySegment src) { _imageOffsetAt(index).copyFrom(src); return this; }
    public VkImageToMemoryCopyEXT _imageOffset(MemorySegment src) { return _imageOffsetAt(0L, src); }
    public MemorySegment _imageExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageExtent, index), LAYOUT_imageExtent); }
    public MemorySegment _imageExtent() { return _imageExtentAt(0L); }
    public VkImageToMemoryCopyEXT _imageExtentAt(long index, MemorySegment src) { _imageExtentAt(index).copyFrom(src); return this; }
    public VkImageToMemoryCopyEXT _imageExtent(MemorySegment src) { return _imageExtentAt(0L, src); }
}
