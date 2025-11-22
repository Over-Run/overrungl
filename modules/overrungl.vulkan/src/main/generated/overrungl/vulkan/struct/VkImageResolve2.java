// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageResolve2`.
/// ## Layout
/// ```
/// struct VkImageResolve2 {
///     VkStructureType sType;
///     const void* pNext;
///     VkImageSubresourceLayers srcSubresource;
///     VkOffset3D srcOffset;
///     VkImageSubresourceLayers dstSubresource;
///     VkOffset3D dstOffset;
///     VkExtent3D extent;
/// }
/// ```
public final class VkImageResolve2 extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("srcSubresource"),
        overrungl.vulkan.struct.VkOffset3D.LAYOUT.withName("srcOffset"),
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("dstSubresource"),
        overrungl.vulkan.struct.VkOffset3D.LAYOUT.withName("dstOffset"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("extent")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_srcSubresource = LAYOUT.byteOffset(PathElement.groupElement("srcSubresource"));
    public static final long OFFSET_srcOffset = LAYOUT.byteOffset(PathElement.groupElement("srcOffset"));
    public static final long OFFSET_dstSubresource = LAYOUT.byteOffset(PathElement.groupElement("dstSubresource"));
    public static final long OFFSET_dstOffset = LAYOUT.byteOffset(PathElement.groupElement("dstOffset"));
    public static final long OFFSET_extent = LAYOUT.byteOffset(PathElement.groupElement("extent"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_srcSubresource = LAYOUT.select(PathElement.groupElement("srcSubresource"));
    public static final MemoryLayout LAYOUT_srcOffset = LAYOUT.select(PathElement.groupElement("srcOffset"));
    public static final MemoryLayout LAYOUT_dstSubresource = LAYOUT.select(PathElement.groupElement("dstSubresource"));
    public static final MemoryLayout LAYOUT_dstOffset = LAYOUT.select(PathElement.groupElement("dstOffset"));
    public static final MemoryLayout LAYOUT_extent = LAYOUT.select(PathElement.groupElement("extent"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_srcSubresource$aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcSubresource"), PathElement.groupElement("aspectMask"));
    public static final VarHandle VH_srcSubresource$mipLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcSubresource"), PathElement.groupElement("mipLevel"));
    public static final VarHandle VH_srcSubresource$baseArrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcSubresource"), PathElement.groupElement("baseArrayLayer"));
    public static final VarHandle VH_srcSubresource$layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcSubresource"), PathElement.groupElement("layerCount"));
    public static final VarHandle VH_srcOffset$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcOffset"), PathElement.groupElement("x"));
    public static final VarHandle VH_srcOffset$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcOffset"), PathElement.groupElement("y"));
    public static final VarHandle VH_srcOffset$z = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcOffset"), PathElement.groupElement("z"));
    public static final VarHandle VH_dstSubresource$aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstSubresource"), PathElement.groupElement("aspectMask"));
    public static final VarHandle VH_dstSubresource$mipLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstSubresource"), PathElement.groupElement("mipLevel"));
    public static final VarHandle VH_dstSubresource$baseArrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstSubresource"), PathElement.groupElement("baseArrayLayer"));
    public static final VarHandle VH_dstSubresource$layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstSubresource"), PathElement.groupElement("layerCount"));
    public static final VarHandle VH_dstOffset$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstOffset"), PathElement.groupElement("x"));
    public static final VarHandle VH_dstOffset$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstOffset"), PathElement.groupElement("y"));
    public static final VarHandle VH_dstOffset$z = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstOffset"), PathElement.groupElement("z"));
    public static final VarHandle VH_extent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extent"), PathElement.groupElement("width"));
    public static final VarHandle VH_extent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extent"), PathElement.groupElement("height"));
    public static final VarHandle VH_extent$depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extent"), PathElement.groupElement("depth"));

    public VkImageResolve2(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageResolve2 of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageResolve2(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageResolve2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageResolve2(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageResolve2 ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageResolve2(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageResolve2 alloc(SegmentAllocator allocator) { return new VkImageResolve2(allocator.allocate(LAYOUT), 1); }
    public static VkImageResolve2 alloc(SegmentAllocator allocator, long count) { return new VkImageResolve2(allocator.allocate(LAYOUT, count), count); }
    public static VkImageResolve2 allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2); }
    public static VkImageResolve2 allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2);
        return s;
    }
    public VkImageResolve2 copyFrom(VkImageResolve2 src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageResolve2 reinterpret(long count) { return new VkImageResolve2(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageResolve2 asSlice(long index) { return new VkImageResolve2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageResolve2 asSlice(long index, long count) { return new VkImageResolve2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageResolve2 at(long index, Consumer<VkImageResolve2> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int srcSubresource$aspectMaskAt(long index) { return (int) VH_srcSubresource$aspectMask.get(this.segment(), 0L, index); }
    public int srcSubresource$mipLevelAt(long index) { return (int) VH_srcSubresource$mipLevel.get(this.segment(), 0L, index); }
    public int srcSubresource$baseArrayLayerAt(long index) { return (int) VH_srcSubresource$baseArrayLayer.get(this.segment(), 0L, index); }
    public int srcSubresource$layerCountAt(long index) { return (int) VH_srcSubresource$layerCount.get(this.segment(), 0L, index); }
    public int srcOffset$xAt(long index) { return (int) VH_srcOffset$x.get(this.segment(), 0L, index); }
    public int srcOffset$yAt(long index) { return (int) VH_srcOffset$y.get(this.segment(), 0L, index); }
    public int srcOffset$zAt(long index) { return (int) VH_srcOffset$z.get(this.segment(), 0L, index); }
    public int dstSubresource$aspectMaskAt(long index) { return (int) VH_dstSubresource$aspectMask.get(this.segment(), 0L, index); }
    public int dstSubresource$mipLevelAt(long index) { return (int) VH_dstSubresource$mipLevel.get(this.segment(), 0L, index); }
    public int dstSubresource$baseArrayLayerAt(long index) { return (int) VH_dstSubresource$baseArrayLayer.get(this.segment(), 0L, index); }
    public int dstSubresource$layerCountAt(long index) { return (int) VH_dstSubresource$layerCount.get(this.segment(), 0L, index); }
    public int dstOffset$xAt(long index) { return (int) VH_dstOffset$x.get(this.segment(), 0L, index); }
    public int dstOffset$yAt(long index) { return (int) VH_dstOffset$y.get(this.segment(), 0L, index); }
    public int dstOffset$zAt(long index) { return (int) VH_dstOffset$z.get(this.segment(), 0L, index); }
    public int extent$widthAt(long index) { return (int) VH_extent$width.get(this.segment(), 0L, index); }
    public int extent$heightAt(long index) { return (int) VH_extent$height.get(this.segment(), 0L, index); }
    public int extent$depthAt(long index) { return (int) VH_extent$depth.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int srcSubresource$aspectMask() { return (int) VH_srcSubresource$aspectMask.get(this.segment(), 0L, 0L); }
    public int srcSubresource$mipLevel() { return (int) VH_srcSubresource$mipLevel.get(this.segment(), 0L, 0L); }
    public int srcSubresource$baseArrayLayer() { return (int) VH_srcSubresource$baseArrayLayer.get(this.segment(), 0L, 0L); }
    public int srcSubresource$layerCount() { return (int) VH_srcSubresource$layerCount.get(this.segment(), 0L, 0L); }
    public int srcOffset$x() { return (int) VH_srcOffset$x.get(this.segment(), 0L, 0L); }
    public int srcOffset$y() { return (int) VH_srcOffset$y.get(this.segment(), 0L, 0L); }
    public int srcOffset$z() { return (int) VH_srcOffset$z.get(this.segment(), 0L, 0L); }
    public int dstSubresource$aspectMask() { return (int) VH_dstSubresource$aspectMask.get(this.segment(), 0L, 0L); }
    public int dstSubresource$mipLevel() { return (int) VH_dstSubresource$mipLevel.get(this.segment(), 0L, 0L); }
    public int dstSubresource$baseArrayLayer() { return (int) VH_dstSubresource$baseArrayLayer.get(this.segment(), 0L, 0L); }
    public int dstSubresource$layerCount() { return (int) VH_dstSubresource$layerCount.get(this.segment(), 0L, 0L); }
    public int dstOffset$x() { return (int) VH_dstOffset$x.get(this.segment(), 0L, 0L); }
    public int dstOffset$y() { return (int) VH_dstOffset$y.get(this.segment(), 0L, 0L); }
    public int dstOffset$z() { return (int) VH_dstOffset$z.get(this.segment(), 0L, 0L); }
    public int extent$width() { return (int) VH_extent$width.get(this.segment(), 0L, 0L); }
    public int extent$height() { return (int) VH_extent$height.get(this.segment(), 0L, 0L); }
    public int extent$depth() { return (int) VH_extent$depth.get(this.segment(), 0L, 0L); }
    public VkImageResolve2 sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageResolve2 pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageResolve2 srcSubresource$aspectMaskAt(long index, int value) { VH_srcSubresource$aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkImageResolve2 srcSubresource$mipLevelAt(long index, int value) { VH_srcSubresource$mipLevel.set(this.segment(), 0L, index, value); return this; }
    public VkImageResolve2 srcSubresource$baseArrayLayerAt(long index, int value) { VH_srcSubresource$baseArrayLayer.set(this.segment(), 0L, index, value); return this; }
    public VkImageResolve2 srcSubresource$layerCountAt(long index, int value) { VH_srcSubresource$layerCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageResolve2 srcOffset$xAt(long index, int value) { VH_srcOffset$x.set(this.segment(), 0L, index, value); return this; }
    public VkImageResolve2 srcOffset$yAt(long index, int value) { VH_srcOffset$y.set(this.segment(), 0L, index, value); return this; }
    public VkImageResolve2 srcOffset$zAt(long index, int value) { VH_srcOffset$z.set(this.segment(), 0L, index, value); return this; }
    public VkImageResolve2 dstSubresource$aspectMaskAt(long index, int value) { VH_dstSubresource$aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkImageResolve2 dstSubresource$mipLevelAt(long index, int value) { VH_dstSubresource$mipLevel.set(this.segment(), 0L, index, value); return this; }
    public VkImageResolve2 dstSubresource$baseArrayLayerAt(long index, int value) { VH_dstSubresource$baseArrayLayer.set(this.segment(), 0L, index, value); return this; }
    public VkImageResolve2 dstSubresource$layerCountAt(long index, int value) { VH_dstSubresource$layerCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageResolve2 dstOffset$xAt(long index, int value) { VH_dstOffset$x.set(this.segment(), 0L, index, value); return this; }
    public VkImageResolve2 dstOffset$yAt(long index, int value) { VH_dstOffset$y.set(this.segment(), 0L, index, value); return this; }
    public VkImageResolve2 dstOffset$zAt(long index, int value) { VH_dstOffset$z.set(this.segment(), 0L, index, value); return this; }
    public VkImageResolve2 extent$widthAt(long index, int value) { VH_extent$width.set(this.segment(), 0L, index, value); return this; }
    public VkImageResolve2 extent$heightAt(long index, int value) { VH_extent$height.set(this.segment(), 0L, index, value); return this; }
    public VkImageResolve2 extent$depthAt(long index, int value) { VH_extent$depth.set(this.segment(), 0L, index, value); return this; }
    public VkImageResolve2 sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageResolve2 pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageResolve2 srcSubresource$aspectMask(int value) { VH_srcSubresource$aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageResolve2 srcSubresource$mipLevel(int value) { VH_srcSubresource$mipLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageResolve2 srcSubresource$baseArrayLayer(int value) { VH_srcSubresource$baseArrayLayer.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageResolve2 srcSubresource$layerCount(int value) { VH_srcSubresource$layerCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageResolve2 srcOffset$x(int value) { VH_srcOffset$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageResolve2 srcOffset$y(int value) { VH_srcOffset$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageResolve2 srcOffset$z(int value) { VH_srcOffset$z.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageResolve2 dstSubresource$aspectMask(int value) { VH_dstSubresource$aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageResolve2 dstSubresource$mipLevel(int value) { VH_dstSubresource$mipLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageResolve2 dstSubresource$baseArrayLayer(int value) { VH_dstSubresource$baseArrayLayer.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageResolve2 dstSubresource$layerCount(int value) { VH_dstSubresource$layerCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageResolve2 dstOffset$x(int value) { VH_dstOffset$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageResolve2 dstOffset$y(int value) { VH_dstOffset$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageResolve2 dstOffset$z(int value) { VH_dstOffset$z.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageResolve2 extent$width(int value) { VH_extent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageResolve2 extent$height(int value) { VH_extent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageResolve2 extent$depth(int value) { VH_extent$depth.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageResolve2 _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageResolve2 _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageResolve2 _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageResolve2 _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _srcSubresourceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcSubresource, index), LAYOUT_srcSubresource); }
    public MemorySegment _srcSubresource() { return _srcSubresourceAt(0L); }
    public VkImageResolve2 _srcSubresourceAt(long index, MemorySegment src) { _srcSubresourceAt(index).copyFrom(src); return this; }
    public VkImageResolve2 _srcSubresource(MemorySegment src) { return _srcSubresourceAt(0L, src); }
    public MemorySegment _srcOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcOffset, index), LAYOUT_srcOffset); }
    public MemorySegment _srcOffset() { return _srcOffsetAt(0L); }
    public VkImageResolve2 _srcOffsetAt(long index, MemorySegment src) { _srcOffsetAt(index).copyFrom(src); return this; }
    public VkImageResolve2 _srcOffset(MemorySegment src) { return _srcOffsetAt(0L, src); }
    public MemorySegment _dstSubresourceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstSubresource, index), LAYOUT_dstSubresource); }
    public MemorySegment _dstSubresource() { return _dstSubresourceAt(0L); }
    public VkImageResolve2 _dstSubresourceAt(long index, MemorySegment src) { _dstSubresourceAt(index).copyFrom(src); return this; }
    public VkImageResolve2 _dstSubresource(MemorySegment src) { return _dstSubresourceAt(0L, src); }
    public MemorySegment _dstOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstOffset, index), LAYOUT_dstOffset); }
    public MemorySegment _dstOffset() { return _dstOffsetAt(0L); }
    public VkImageResolve2 _dstOffsetAt(long index, MemorySegment src) { _dstOffsetAt(index).copyFrom(src); return this; }
    public VkImageResolve2 _dstOffset(MemorySegment src) { return _dstOffsetAt(0L, src); }
    public MemorySegment _extentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extent, index), LAYOUT_extent); }
    public MemorySegment _extent() { return _extentAt(0L); }
    public VkImageResolve2 _extentAt(long index, MemorySegment src) { _extentAt(index).copyFrom(src); return this; }
    public VkImageResolve2 _extent(MemorySegment src) { return _extentAt(0L, src); }
}
