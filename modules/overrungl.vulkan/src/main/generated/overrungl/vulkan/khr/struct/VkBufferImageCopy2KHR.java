// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBufferImageCopy2KHR`.
/// ## Layout
/// ```
/// struct VkBufferImageCopy2KHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceSize bufferOffset;
///     uint32_t bufferRowLength;
///     uint32_t bufferImageHeight;
///     VkImageSubresourceLayers imageSubresource;
///     VkOffset3D imageOffset;
///     VkExtent3D imageExtent;
/// }
/// ```
public final class VkBufferImageCopy2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("bufferOffset"),
        ValueLayout.JAVA_INT.withName("bufferRowLength"),
        ValueLayout.JAVA_INT.withName("bufferImageHeight"),
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("imageSubresource"),
        overrungl.vulkan.struct.VkOffset3D.LAYOUT.withName("imageOffset"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("imageExtent")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_bufferOffset = LAYOUT.byteOffset(PathElement.groupElement("bufferOffset"));
    public static final long OFFSET_bufferRowLength = LAYOUT.byteOffset(PathElement.groupElement("bufferRowLength"));
    public static final long OFFSET_bufferImageHeight = LAYOUT.byteOffset(PathElement.groupElement("bufferImageHeight"));
    public static final long OFFSET_imageSubresource = LAYOUT.byteOffset(PathElement.groupElement("imageSubresource"));
    public static final long OFFSET_imageOffset = LAYOUT.byteOffset(PathElement.groupElement("imageOffset"));
    public static final long OFFSET_imageExtent = LAYOUT.byteOffset(PathElement.groupElement("imageExtent"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_bufferOffset = LAYOUT.select(PathElement.groupElement("bufferOffset"));
    public static final MemoryLayout LAYOUT_bufferRowLength = LAYOUT.select(PathElement.groupElement("bufferRowLength"));
    public static final MemoryLayout LAYOUT_bufferImageHeight = LAYOUT.select(PathElement.groupElement("bufferImageHeight"));
    public static final MemoryLayout LAYOUT_imageSubresource = LAYOUT.select(PathElement.groupElement("imageSubresource"));
    public static final MemoryLayout LAYOUT_imageOffset = LAYOUT.select(PathElement.groupElement("imageOffset"));
    public static final MemoryLayout LAYOUT_imageExtent = LAYOUT.select(PathElement.groupElement("imageExtent"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_bufferOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferOffset"));
    public static final VarHandle VH_bufferRowLength = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferRowLength"));
    public static final VarHandle VH_bufferImageHeight = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferImageHeight"));
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

    public VkBufferImageCopy2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBufferImageCopy2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferImageCopy2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkBufferImageCopy2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferImageCopy2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBufferImageCopy2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferImageCopy2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBufferImageCopy2KHR alloc(SegmentAllocator allocator) { return new VkBufferImageCopy2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkBufferImageCopy2KHR alloc(SegmentAllocator allocator, long count) { return new VkBufferImageCopy2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkBufferImageCopy2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2); }
    public static VkBufferImageCopy2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2);
        return s;
    }
    public VkBufferImageCopy2KHR copyFrom(VkBufferImageCopy2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBufferImageCopy2KHR reinterpret(long count) { return new VkBufferImageCopy2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBufferImageCopy2KHR asSlice(long index) { return new VkBufferImageCopy2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBufferImageCopy2KHR asSlice(long index, long count) { return new VkBufferImageCopy2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBufferImageCopy2KHR at(long index, Consumer<VkBufferImageCopy2KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long bufferOffsetAt(long index) { return (long) VH_bufferOffset.get(this.segment(), 0L, index); }
    public int bufferRowLengthAt(long index) { return (int) VH_bufferRowLength.get(this.segment(), 0L, index); }
    public int bufferImageHeightAt(long index) { return (int) VH_bufferImageHeight.get(this.segment(), 0L, index); }
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
    public long bufferOffset() { return (long) VH_bufferOffset.get(this.segment(), 0L, 0L); }
    public int bufferRowLength() { return (int) VH_bufferRowLength.get(this.segment(), 0L, 0L); }
    public int bufferImageHeight() { return (int) VH_bufferImageHeight.get(this.segment(), 0L, 0L); }
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
    public VkBufferImageCopy2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBufferImageCopy2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBufferImageCopy2KHR bufferOffsetAt(long index, long value) { VH_bufferOffset.set(this.segment(), 0L, index, value); return this; }
    public VkBufferImageCopy2KHR bufferRowLengthAt(long index, int value) { VH_bufferRowLength.set(this.segment(), 0L, index, value); return this; }
    public VkBufferImageCopy2KHR bufferImageHeightAt(long index, int value) { VH_bufferImageHeight.set(this.segment(), 0L, index, value); return this; }
    public VkBufferImageCopy2KHR imageSubresource$aspectMaskAt(long index, int value) { VH_imageSubresource$aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkBufferImageCopy2KHR imageSubresource$mipLevelAt(long index, int value) { VH_imageSubresource$mipLevel.set(this.segment(), 0L, index, value); return this; }
    public VkBufferImageCopy2KHR imageSubresource$baseArrayLayerAt(long index, int value) { VH_imageSubresource$baseArrayLayer.set(this.segment(), 0L, index, value); return this; }
    public VkBufferImageCopy2KHR imageSubresource$layerCountAt(long index, int value) { VH_imageSubresource$layerCount.set(this.segment(), 0L, index, value); return this; }
    public VkBufferImageCopy2KHR imageOffset$xAt(long index, int value) { VH_imageOffset$x.set(this.segment(), 0L, index, value); return this; }
    public VkBufferImageCopy2KHR imageOffset$yAt(long index, int value) { VH_imageOffset$y.set(this.segment(), 0L, index, value); return this; }
    public VkBufferImageCopy2KHR imageOffset$zAt(long index, int value) { VH_imageOffset$z.set(this.segment(), 0L, index, value); return this; }
    public VkBufferImageCopy2KHR imageExtent$widthAt(long index, int value) { VH_imageExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkBufferImageCopy2KHR imageExtent$heightAt(long index, int value) { VH_imageExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkBufferImageCopy2KHR imageExtent$depthAt(long index, int value) { VH_imageExtent$depth.set(this.segment(), 0L, index, value); return this; }
    public VkBufferImageCopy2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferImageCopy2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferImageCopy2KHR bufferOffset(long value) { VH_bufferOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferImageCopy2KHR bufferRowLength(int value) { VH_bufferRowLength.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferImageCopy2KHR bufferImageHeight(int value) { VH_bufferImageHeight.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferImageCopy2KHR imageSubresource$aspectMask(int value) { VH_imageSubresource$aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferImageCopy2KHR imageSubresource$mipLevel(int value) { VH_imageSubresource$mipLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferImageCopy2KHR imageSubresource$baseArrayLayer(int value) { VH_imageSubresource$baseArrayLayer.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferImageCopy2KHR imageSubresource$layerCount(int value) { VH_imageSubresource$layerCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferImageCopy2KHR imageOffset$x(int value) { VH_imageOffset$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferImageCopy2KHR imageOffset$y(int value) { VH_imageOffset$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferImageCopy2KHR imageOffset$z(int value) { VH_imageOffset$z.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferImageCopy2KHR imageExtent$width(int value) { VH_imageExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferImageCopy2KHR imageExtent$height(int value) { VH_imageExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferImageCopy2KHR imageExtent$depth(int value) { VH_imageExtent$depth.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBufferImageCopy2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBufferImageCopy2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBufferImageCopy2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBufferImageCopy2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _bufferOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferOffset, index), LAYOUT_bufferOffset); }
    public MemorySegment _bufferOffset() { return _bufferOffsetAt(0L); }
    public VkBufferImageCopy2KHR _bufferOffsetAt(long index, MemorySegment src) { _bufferOffsetAt(index).copyFrom(src); return this; }
    public VkBufferImageCopy2KHR _bufferOffset(MemorySegment src) { return _bufferOffsetAt(0L, src); }
    public MemorySegment _bufferRowLengthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferRowLength, index), LAYOUT_bufferRowLength); }
    public MemorySegment _bufferRowLength() { return _bufferRowLengthAt(0L); }
    public VkBufferImageCopy2KHR _bufferRowLengthAt(long index, MemorySegment src) { _bufferRowLengthAt(index).copyFrom(src); return this; }
    public VkBufferImageCopy2KHR _bufferRowLength(MemorySegment src) { return _bufferRowLengthAt(0L, src); }
    public MemorySegment _bufferImageHeightAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferImageHeight, index), LAYOUT_bufferImageHeight); }
    public MemorySegment _bufferImageHeight() { return _bufferImageHeightAt(0L); }
    public VkBufferImageCopy2KHR _bufferImageHeightAt(long index, MemorySegment src) { _bufferImageHeightAt(index).copyFrom(src); return this; }
    public VkBufferImageCopy2KHR _bufferImageHeight(MemorySegment src) { return _bufferImageHeightAt(0L, src); }
    public MemorySegment _imageSubresourceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageSubresource, index), LAYOUT_imageSubresource); }
    public MemorySegment _imageSubresource() { return _imageSubresourceAt(0L); }
    public VkBufferImageCopy2KHR _imageSubresourceAt(long index, MemorySegment src) { _imageSubresourceAt(index).copyFrom(src); return this; }
    public VkBufferImageCopy2KHR _imageSubresource(MemorySegment src) { return _imageSubresourceAt(0L, src); }
    public MemorySegment _imageOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageOffset, index), LAYOUT_imageOffset); }
    public MemorySegment _imageOffset() { return _imageOffsetAt(0L); }
    public VkBufferImageCopy2KHR _imageOffsetAt(long index, MemorySegment src) { _imageOffsetAt(index).copyFrom(src); return this; }
    public VkBufferImageCopy2KHR _imageOffset(MemorySegment src) { return _imageOffsetAt(0L, src); }
    public MemorySegment _imageExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageExtent, index), LAYOUT_imageExtent); }
    public MemorySegment _imageExtent() { return _imageExtentAt(0L); }
    public VkBufferImageCopy2KHR _imageExtentAt(long index, MemorySegment src) { _imageExtentAt(index).copyFrom(src); return this; }
    public VkBufferImageCopy2KHR _imageExtent(MemorySegment src) { return _imageExtentAt(0L, src); }
}
