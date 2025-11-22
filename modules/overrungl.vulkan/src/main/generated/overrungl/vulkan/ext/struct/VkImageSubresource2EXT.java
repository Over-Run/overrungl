// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageSubresource2EXT`.
/// ## Layout
/// ```
/// struct VkImageSubresource2EXT {
///     VkStructureType sType;
///     void* pNext;
///     VkImageSubresource imageSubresource;
/// }
/// ```
public final class VkImageSubresource2EXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkImageSubresource.LAYOUT.withName("imageSubresource")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_imageSubresource = LAYOUT.byteOffset(PathElement.groupElement("imageSubresource"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_imageSubresource = LAYOUT.select(PathElement.groupElement("imageSubresource"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_imageSubresource$aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageSubresource"), PathElement.groupElement("aspectMask"));
    public static final VarHandle VH_imageSubresource$mipLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageSubresource"), PathElement.groupElement("mipLevel"));
    public static final VarHandle VH_imageSubresource$arrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageSubresource"), PathElement.groupElement("arrayLayer"));

    public VkImageSubresource2EXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageSubresource2EXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresource2EXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageSubresource2EXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresource2EXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageSubresource2EXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresource2EXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageSubresource2EXT alloc(SegmentAllocator allocator) { return new VkImageSubresource2EXT(allocator.allocate(LAYOUT), 1); }
    public static VkImageSubresource2EXT alloc(SegmentAllocator allocator, long count) { return new VkImageSubresource2EXT(allocator.allocate(LAYOUT, count), count); }
    public static VkImageSubresource2EXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2); }
    public static VkImageSubresource2EXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2);
        return s;
    }
    public VkImageSubresource2EXT copyFrom(VkImageSubresource2EXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageSubresource2EXT reinterpret(long count) { return new VkImageSubresource2EXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageSubresource2EXT asSlice(long index) { return new VkImageSubresource2EXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageSubresource2EXT asSlice(long index, long count) { return new VkImageSubresource2EXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageSubresource2EXT at(long index, Consumer<VkImageSubresource2EXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int imageSubresource$aspectMaskAt(long index) { return (int) VH_imageSubresource$aspectMask.get(this.segment(), 0L, index); }
    public int imageSubresource$mipLevelAt(long index) { return (int) VH_imageSubresource$mipLevel.get(this.segment(), 0L, index); }
    public int imageSubresource$arrayLayerAt(long index) { return (int) VH_imageSubresource$arrayLayer.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int imageSubresource$aspectMask() { return (int) VH_imageSubresource$aspectMask.get(this.segment(), 0L, 0L); }
    public int imageSubresource$mipLevel() { return (int) VH_imageSubresource$mipLevel.get(this.segment(), 0L, 0L); }
    public int imageSubresource$arrayLayer() { return (int) VH_imageSubresource$arrayLayer.get(this.segment(), 0L, 0L); }
    public VkImageSubresource2EXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageSubresource2EXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageSubresource2EXT imageSubresource$aspectMaskAt(long index, int value) { VH_imageSubresource$aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkImageSubresource2EXT imageSubresource$mipLevelAt(long index, int value) { VH_imageSubresource$mipLevel.set(this.segment(), 0L, index, value); return this; }
    public VkImageSubresource2EXT imageSubresource$arrayLayerAt(long index, int value) { VH_imageSubresource$arrayLayer.set(this.segment(), 0L, index, value); return this; }
    public VkImageSubresource2EXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageSubresource2EXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageSubresource2EXT imageSubresource$aspectMask(int value) { VH_imageSubresource$aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageSubresource2EXT imageSubresource$mipLevel(int value) { VH_imageSubresource$mipLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageSubresource2EXT imageSubresource$arrayLayer(int value) { VH_imageSubresource$arrayLayer.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageSubresource2EXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageSubresource2EXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageSubresource2EXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageSubresource2EXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _imageSubresourceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageSubresource, index), LAYOUT_imageSubresource); }
    public MemorySegment _imageSubresource() { return _imageSubresourceAt(0L); }
    public VkImageSubresource2EXT _imageSubresourceAt(long index, MemorySegment src) { _imageSubresourceAt(index).copyFrom(src); return this; }
    public VkImageSubresource2EXT _imageSubresource(MemorySegment src) { return _imageSubresourceAt(0L, src); }
}
