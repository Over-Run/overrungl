// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCopyMemoryToImageIndirectCommandNV`.
/// ## Layout
/// ```
/// struct VkCopyMemoryToImageIndirectCommandNV {
///     VkDeviceAddress srcAddress;
///     uint32_t bufferRowLength;
///     uint32_t bufferImageHeight;
///     VkImageSubresourceLayers imageSubresource;
///     VkOffset3D imageOffset;
///     VkExtent3D imageExtent;
/// }
/// ```
public final class VkCopyMemoryToImageIndirectCommandNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("srcAddress"),
        ValueLayout.JAVA_INT.withName("bufferRowLength"),
        ValueLayout.JAVA_INT.withName("bufferImageHeight"),
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("imageSubresource"),
        overrungl.vulkan.struct.VkOffset3D.LAYOUT.withName("imageOffset"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("imageExtent")
    );
    public static final long OFFSET_srcAddress = LAYOUT.byteOffset(PathElement.groupElement("srcAddress"));
    public static final long OFFSET_bufferRowLength = LAYOUT.byteOffset(PathElement.groupElement("bufferRowLength"));
    public static final long OFFSET_bufferImageHeight = LAYOUT.byteOffset(PathElement.groupElement("bufferImageHeight"));
    public static final long OFFSET_imageSubresource = LAYOUT.byteOffset(PathElement.groupElement("imageSubresource"));
    public static final long OFFSET_imageOffset = LAYOUT.byteOffset(PathElement.groupElement("imageOffset"));
    public static final long OFFSET_imageExtent = LAYOUT.byteOffset(PathElement.groupElement("imageExtent"));
    public static final MemoryLayout LAYOUT_srcAddress = LAYOUT.select(PathElement.groupElement("srcAddress"));
    public static final MemoryLayout LAYOUT_bufferRowLength = LAYOUT.select(PathElement.groupElement("bufferRowLength"));
    public static final MemoryLayout LAYOUT_bufferImageHeight = LAYOUT.select(PathElement.groupElement("bufferImageHeight"));
    public static final MemoryLayout LAYOUT_imageSubresource = LAYOUT.select(PathElement.groupElement("imageSubresource"));
    public static final MemoryLayout LAYOUT_imageOffset = LAYOUT.select(PathElement.groupElement("imageOffset"));
    public static final MemoryLayout LAYOUT_imageExtent = LAYOUT.select(PathElement.groupElement("imageExtent"));
    public static final VarHandle VH_srcAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAddress"));
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

    public VkCopyMemoryToImageIndirectCommandNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCopyMemoryToImageIndirectCommandNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryToImageIndirectCommandNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkCopyMemoryToImageIndirectCommandNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryToImageIndirectCommandNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCopyMemoryToImageIndirectCommandNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryToImageIndirectCommandNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCopyMemoryToImageIndirectCommandNV alloc(SegmentAllocator allocator) { return new VkCopyMemoryToImageIndirectCommandNV(allocator.allocate(LAYOUT), 1); }
    public static VkCopyMemoryToImageIndirectCommandNV alloc(SegmentAllocator allocator, long count) { return new VkCopyMemoryToImageIndirectCommandNV(allocator.allocate(LAYOUT, count), count); }
    public VkCopyMemoryToImageIndirectCommandNV copyFrom(VkCopyMemoryToImageIndirectCommandNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCopyMemoryToImageIndirectCommandNV reinterpret(long count) { return new VkCopyMemoryToImageIndirectCommandNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCopyMemoryToImageIndirectCommandNV asSlice(long index) { return new VkCopyMemoryToImageIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCopyMemoryToImageIndirectCommandNV asSlice(long index, long count) { return new VkCopyMemoryToImageIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCopyMemoryToImageIndirectCommandNV at(long index, Consumer<VkCopyMemoryToImageIndirectCommandNV> func) { func.accept(asSlice(index)); return this; }
    public long srcAddressAt(long index) { return (long) VH_srcAddress.get(this.segment(), 0L, index); }
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
    public long srcAddress() { return (long) VH_srcAddress.get(this.segment(), 0L, 0L); }
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
    public VkCopyMemoryToImageIndirectCommandNV srcAddressAt(long index, long value) { VH_srcAddress.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV bufferRowLengthAt(long index, int value) { VH_bufferRowLength.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV bufferImageHeightAt(long index, int value) { VH_bufferImageHeight.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV imageSubresource$aspectMaskAt(long index, int value) { VH_imageSubresource$aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV imageSubresource$mipLevelAt(long index, int value) { VH_imageSubresource$mipLevel.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV imageSubresource$baseArrayLayerAt(long index, int value) { VH_imageSubresource$baseArrayLayer.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV imageSubresource$layerCountAt(long index, int value) { VH_imageSubresource$layerCount.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV imageOffset$xAt(long index, int value) { VH_imageOffset$x.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV imageOffset$yAt(long index, int value) { VH_imageOffset$y.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV imageOffset$zAt(long index, int value) { VH_imageOffset$z.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV imageExtent$widthAt(long index, int value) { VH_imageExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV imageExtent$heightAt(long index, int value) { VH_imageExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV imageExtent$depthAt(long index, int value) { VH_imageExtent$depth.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV srcAddress(long value) { VH_srcAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV bufferRowLength(int value) { VH_bufferRowLength.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV bufferImageHeight(int value) { VH_bufferImageHeight.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV imageSubresource$aspectMask(int value) { VH_imageSubresource$aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV imageSubresource$mipLevel(int value) { VH_imageSubresource$mipLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV imageSubresource$baseArrayLayer(int value) { VH_imageSubresource$baseArrayLayer.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV imageSubresource$layerCount(int value) { VH_imageSubresource$layerCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV imageOffset$x(int value) { VH_imageOffset$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV imageOffset$y(int value) { VH_imageOffset$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV imageOffset$z(int value) { VH_imageOffset$z.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV imageExtent$width(int value) { VH_imageExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV imageExtent$height(int value) { VH_imageExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToImageIndirectCommandNV imageExtent$depth(int value) { VH_imageExtent$depth.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _srcAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcAddress, index), LAYOUT_srcAddress); }
    public MemorySegment _srcAddress() { return _srcAddressAt(0L); }
    public VkCopyMemoryToImageIndirectCommandNV _srcAddressAt(long index, MemorySegment src) { _srcAddressAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToImageIndirectCommandNV _srcAddress(MemorySegment src) { return _srcAddressAt(0L, src); }
    public MemorySegment _bufferRowLengthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferRowLength, index), LAYOUT_bufferRowLength); }
    public MemorySegment _bufferRowLength() { return _bufferRowLengthAt(0L); }
    public VkCopyMemoryToImageIndirectCommandNV _bufferRowLengthAt(long index, MemorySegment src) { _bufferRowLengthAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToImageIndirectCommandNV _bufferRowLength(MemorySegment src) { return _bufferRowLengthAt(0L, src); }
    public MemorySegment _bufferImageHeightAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferImageHeight, index), LAYOUT_bufferImageHeight); }
    public MemorySegment _bufferImageHeight() { return _bufferImageHeightAt(0L); }
    public VkCopyMemoryToImageIndirectCommandNV _bufferImageHeightAt(long index, MemorySegment src) { _bufferImageHeightAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToImageIndirectCommandNV _bufferImageHeight(MemorySegment src) { return _bufferImageHeightAt(0L, src); }
    public MemorySegment _imageSubresourceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageSubresource, index), LAYOUT_imageSubresource); }
    public MemorySegment _imageSubresource() { return _imageSubresourceAt(0L); }
    public VkCopyMemoryToImageIndirectCommandNV _imageSubresourceAt(long index, MemorySegment src) { _imageSubresourceAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToImageIndirectCommandNV _imageSubresource(MemorySegment src) { return _imageSubresourceAt(0L, src); }
    public MemorySegment _imageOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageOffset, index), LAYOUT_imageOffset); }
    public MemorySegment _imageOffset() { return _imageOffsetAt(0L); }
    public VkCopyMemoryToImageIndirectCommandNV _imageOffsetAt(long index, MemorySegment src) { _imageOffsetAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToImageIndirectCommandNV _imageOffset(MemorySegment src) { return _imageOffsetAt(0L, src); }
    public MemorySegment _imageExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageExtent, index), LAYOUT_imageExtent); }
    public MemorySegment _imageExtent() { return _imageExtentAt(0L); }
    public VkCopyMemoryToImageIndirectCommandNV _imageExtentAt(long index, MemorySegment src) { _imageExtentAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToImageIndirectCommandNV _imageExtent(MemorySegment src) { return _imageExtentAt(0L, src); }
}
