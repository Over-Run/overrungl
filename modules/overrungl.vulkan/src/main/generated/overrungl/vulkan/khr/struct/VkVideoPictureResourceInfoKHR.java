// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoPictureResourceInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoPictureResourceInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkOffset2D codedOffset;
///     VkExtent2D codedExtent;
///     uint32_t baseArrayLayer;
///     VkImageView imageViewBinding;
/// }
/// ```
public final class VkVideoPictureResourceInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("codedOffset"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("codedExtent"),
        ValueLayout.JAVA_INT.withName("baseArrayLayer"),
        ValueLayout.JAVA_LONG.withName("imageViewBinding")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_codedOffset = LAYOUT.byteOffset(PathElement.groupElement("codedOffset"));
    public static final long OFFSET_codedExtent = LAYOUT.byteOffset(PathElement.groupElement("codedExtent"));
    public static final long OFFSET_baseArrayLayer = LAYOUT.byteOffset(PathElement.groupElement("baseArrayLayer"));
    public static final long OFFSET_imageViewBinding = LAYOUT.byteOffset(PathElement.groupElement("imageViewBinding"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_codedOffset = LAYOUT.select(PathElement.groupElement("codedOffset"));
    public static final MemoryLayout LAYOUT_codedExtent = LAYOUT.select(PathElement.groupElement("codedExtent"));
    public static final MemoryLayout LAYOUT_baseArrayLayer = LAYOUT.select(PathElement.groupElement("baseArrayLayer"));
    public static final MemoryLayout LAYOUT_imageViewBinding = LAYOUT.select(PathElement.groupElement("imageViewBinding"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_codedOffset$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("codedOffset"), PathElement.groupElement("x"));
    public static final VarHandle VH_codedOffset$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("codedOffset"), PathElement.groupElement("y"));
    public static final VarHandle VH_codedExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("codedExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_codedExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("codedExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_baseArrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseArrayLayer"));
    public static final VarHandle VH_imageViewBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageViewBinding"));

    public VkVideoPictureResourceInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoPictureResourceInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoPictureResourceInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoPictureResourceInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoPictureResourceInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoPictureResourceInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoPictureResourceInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoPictureResourceInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoPictureResourceInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoPictureResourceInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoPictureResourceInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoPictureResourceInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_INFO_KHR); }
    public static VkVideoPictureResourceInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_INFO_KHR);
        return s;
    }
    public VkVideoPictureResourceInfoKHR copyFrom(VkVideoPictureResourceInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoPictureResourceInfoKHR reinterpret(long count) { return new VkVideoPictureResourceInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoPictureResourceInfoKHR asSlice(long index) { return new VkVideoPictureResourceInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoPictureResourceInfoKHR asSlice(long index, long count) { return new VkVideoPictureResourceInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoPictureResourceInfoKHR at(long index, Consumer<VkVideoPictureResourceInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int codedOffset$xAt(long index) { return (int) VH_codedOffset$x.get(this.segment(), 0L, index); }
    public int codedOffset$yAt(long index) { return (int) VH_codedOffset$y.get(this.segment(), 0L, index); }
    public int codedExtent$widthAt(long index) { return (int) VH_codedExtent$width.get(this.segment(), 0L, index); }
    public int codedExtent$heightAt(long index) { return (int) VH_codedExtent$height.get(this.segment(), 0L, index); }
    public int baseArrayLayerAt(long index) { return (int) VH_baseArrayLayer.get(this.segment(), 0L, index); }
    public long imageViewBindingAt(long index) { return (long) VH_imageViewBinding.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int codedOffset$x() { return (int) VH_codedOffset$x.get(this.segment(), 0L, 0L); }
    public int codedOffset$y() { return (int) VH_codedOffset$y.get(this.segment(), 0L, 0L); }
    public int codedExtent$width() { return (int) VH_codedExtent$width.get(this.segment(), 0L, 0L); }
    public int codedExtent$height() { return (int) VH_codedExtent$height.get(this.segment(), 0L, 0L); }
    public int baseArrayLayer() { return (int) VH_baseArrayLayer.get(this.segment(), 0L, 0L); }
    public long imageViewBinding() { return (long) VH_imageViewBinding.get(this.segment(), 0L, 0L); }
    public VkVideoPictureResourceInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoPictureResourceInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoPictureResourceInfoKHR codedOffset$xAt(long index, int value) { VH_codedOffset$x.set(this.segment(), 0L, index, value); return this; }
    public VkVideoPictureResourceInfoKHR codedOffset$yAt(long index, int value) { VH_codedOffset$y.set(this.segment(), 0L, index, value); return this; }
    public VkVideoPictureResourceInfoKHR codedExtent$widthAt(long index, int value) { VH_codedExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkVideoPictureResourceInfoKHR codedExtent$heightAt(long index, int value) { VH_codedExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkVideoPictureResourceInfoKHR baseArrayLayerAt(long index, int value) { VH_baseArrayLayer.set(this.segment(), 0L, index, value); return this; }
    public VkVideoPictureResourceInfoKHR imageViewBindingAt(long index, long value) { VH_imageViewBinding.set(this.segment(), 0L, index, value); return this; }
    public VkVideoPictureResourceInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoPictureResourceInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoPictureResourceInfoKHR codedOffset$x(int value) { VH_codedOffset$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoPictureResourceInfoKHR codedOffset$y(int value) { VH_codedOffset$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoPictureResourceInfoKHR codedExtent$width(int value) { VH_codedExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoPictureResourceInfoKHR codedExtent$height(int value) { VH_codedExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoPictureResourceInfoKHR baseArrayLayer(int value) { VH_baseArrayLayer.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoPictureResourceInfoKHR imageViewBinding(long value) { VH_imageViewBinding.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoPictureResourceInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoPictureResourceInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoPictureResourceInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoPictureResourceInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _codedOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_codedOffset, index), LAYOUT_codedOffset); }
    public MemorySegment _codedOffset() { return _codedOffsetAt(0L); }
    public VkVideoPictureResourceInfoKHR _codedOffsetAt(long index, MemorySegment src) { _codedOffsetAt(index).copyFrom(src); return this; }
    public VkVideoPictureResourceInfoKHR _codedOffset(MemorySegment src) { return _codedOffsetAt(0L, src); }
    public MemorySegment _codedExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_codedExtent, index), LAYOUT_codedExtent); }
    public MemorySegment _codedExtent() { return _codedExtentAt(0L); }
    public VkVideoPictureResourceInfoKHR _codedExtentAt(long index, MemorySegment src) { _codedExtentAt(index).copyFrom(src); return this; }
    public VkVideoPictureResourceInfoKHR _codedExtent(MemorySegment src) { return _codedExtentAt(0L, src); }
    public MemorySegment _baseArrayLayerAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_baseArrayLayer, index), LAYOUT_baseArrayLayer); }
    public MemorySegment _baseArrayLayer() { return _baseArrayLayerAt(0L); }
    public VkVideoPictureResourceInfoKHR _baseArrayLayerAt(long index, MemorySegment src) { _baseArrayLayerAt(index).copyFrom(src); return this; }
    public VkVideoPictureResourceInfoKHR _baseArrayLayer(MemorySegment src) { return _baseArrayLayerAt(0L, src); }
    public MemorySegment _imageViewBindingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageViewBinding, index), LAYOUT_imageViewBinding); }
    public MemorySegment _imageViewBinding() { return _imageViewBindingAt(0L); }
    public VkVideoPictureResourceInfoKHR _imageViewBindingAt(long index, MemorySegment src) { _imageViewBindingAt(index).copyFrom(src); return this; }
    public VkVideoPictureResourceInfoKHR _imageViewBinding(MemorySegment src) { return _imageViewBindingAt(0L, src); }
}
