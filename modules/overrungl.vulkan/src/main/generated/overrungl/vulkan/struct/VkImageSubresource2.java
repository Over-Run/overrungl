// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageSubresource2`.
/// ## Layout
/// ```
/// struct VkImageSubresource2 {
///     VkStructureType sType;
///     void* pNext;
///     VkImageSubresource imageSubresource;
/// }
/// ```
public final class VkImageSubresource2 extends GroupType {
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

    public VkImageSubresource2(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageSubresource2 of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresource2(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageSubresource2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresource2(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageSubresource2 ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresource2(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageSubresource2 alloc(SegmentAllocator allocator) { return new VkImageSubresource2(allocator.allocate(LAYOUT), 1); }
    public static VkImageSubresource2 alloc(SegmentAllocator allocator, long count) { return new VkImageSubresource2(allocator.allocate(LAYOUT, count), count); }
    public static VkImageSubresource2 allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2); }
    public static VkImageSubresource2 allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2);
        return s;
    }
    public VkImageSubresource2 copyFrom(VkImageSubresource2 src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageSubresource2 reinterpret(long count) { return new VkImageSubresource2(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageSubresource2 asSlice(long index) { return new VkImageSubresource2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageSubresource2 asSlice(long index, long count) { return new VkImageSubresource2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageSubresource2 at(long index, Consumer<VkImageSubresource2> func) { func.accept(asSlice(index)); return this; }
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
    public VkImageSubresource2 sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageSubresource2 pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageSubresource2 imageSubresource$aspectMaskAt(long index, int value) { VH_imageSubresource$aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkImageSubresource2 imageSubresource$mipLevelAt(long index, int value) { VH_imageSubresource$mipLevel.set(this.segment(), 0L, index, value); return this; }
    public VkImageSubresource2 imageSubresource$arrayLayerAt(long index, int value) { VH_imageSubresource$arrayLayer.set(this.segment(), 0L, index, value); return this; }
    public VkImageSubresource2 sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageSubresource2 pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageSubresource2 imageSubresource$aspectMask(int value) { VH_imageSubresource$aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageSubresource2 imageSubresource$mipLevel(int value) { VH_imageSubresource$mipLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageSubresource2 imageSubresource$arrayLayer(int value) { VH_imageSubresource$arrayLayer.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageSubresource2 _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageSubresource2 _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageSubresource2 _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageSubresource2 _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _imageSubresourceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageSubresource, index), LAYOUT_imageSubresource); }
    public MemorySegment _imageSubresource() { return _imageSubresourceAt(0L); }
    public VkImageSubresource2 _imageSubresourceAt(long index, MemorySegment src) { _imageSubresourceAt(index).copyFrom(src); return this; }
    public VkImageSubresource2 _imageSubresource(MemorySegment src) { return _imageSubresourceAt(0L, src); }
}
