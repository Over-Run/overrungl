// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderingFragmentShadingRateAttachmentInfoKHR`.
/// ## Layout
/// ```
/// struct VkRenderingFragmentShadingRateAttachmentInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkImageView imageView;
///     VkImageLayout imageLayout;
///     VkExtent2D shadingRateAttachmentTexelSize;
/// }
/// ```
public final class VkRenderingFragmentShadingRateAttachmentInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("imageView"),
        ValueLayout.JAVA_INT.withName("imageLayout"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("shadingRateAttachmentTexelSize")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_imageView = LAYOUT.byteOffset(PathElement.groupElement("imageView"));
    public static final long OFFSET_imageLayout = LAYOUT.byteOffset(PathElement.groupElement("imageLayout"));
    public static final long OFFSET_shadingRateAttachmentTexelSize = LAYOUT.byteOffset(PathElement.groupElement("shadingRateAttachmentTexelSize"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_imageView = LAYOUT.select(PathElement.groupElement("imageView"));
    public static final MemoryLayout LAYOUT_imageLayout = LAYOUT.select(PathElement.groupElement("imageLayout"));
    public static final MemoryLayout LAYOUT_shadingRateAttachmentTexelSize = LAYOUT.select(PathElement.groupElement("shadingRateAttachmentTexelSize"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_imageView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageView"));
    public static final VarHandle VH_imageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageLayout"));
    public static final VarHandle VH_shadingRateAttachmentTexelSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateAttachmentTexelSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_shadingRateAttachmentTexelSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateAttachmentTexelSize"), PathElement.groupElement("height"));

    public VkRenderingFragmentShadingRateAttachmentInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingFragmentShadingRateAttachmentInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingFragmentShadingRateAttachmentInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingFragmentShadingRateAttachmentInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR alloc(SegmentAllocator allocator) { return new VkRenderingFragmentShadingRateAttachmentInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkRenderingFragmentShadingRateAttachmentInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRFragmentShadingRate.VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR); }
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRFragmentShadingRate.VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR);
        return s;
    }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR copyFrom(VkRenderingFragmentShadingRateAttachmentInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR reinterpret(long count) { return new VkRenderingFragmentShadingRateAttachmentInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR asSlice(long index) { return new VkRenderingFragmentShadingRateAttachmentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR asSlice(long index, long count) { return new VkRenderingFragmentShadingRateAttachmentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR at(long index, Consumer<VkRenderingFragmentShadingRateAttachmentInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long imageViewAt(long index) { return (long) VH_imageView.get(this.segment(), 0L, index); }
    public int imageLayoutAt(long index) { return (int) VH_imageLayout.get(this.segment(), 0L, index); }
    public int shadingRateAttachmentTexelSize$widthAt(long index) { return (int) VH_shadingRateAttachmentTexelSize$width.get(this.segment(), 0L, index); }
    public int shadingRateAttachmentTexelSize$heightAt(long index) { return (int) VH_shadingRateAttachmentTexelSize$height.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long imageView() { return (long) VH_imageView.get(this.segment(), 0L, 0L); }
    public int imageLayout() { return (int) VH_imageLayout.get(this.segment(), 0L, 0L); }
    public int shadingRateAttachmentTexelSize$width() { return (int) VH_shadingRateAttachmentTexelSize$width.get(this.segment(), 0L, 0L); }
    public int shadingRateAttachmentTexelSize$height() { return (int) VH_shadingRateAttachmentTexelSize$height.get(this.segment(), 0L, 0L); }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR imageViewAt(long index, long value) { VH_imageView.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR imageLayoutAt(long index, int value) { VH_imageLayout.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize$widthAt(long index, int value) { VH_shadingRateAttachmentTexelSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize$heightAt(long index, int value) { VH_shadingRateAttachmentTexelSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR imageView(long value) { VH_imageView.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR imageLayout(int value) { VH_imageLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize$width(int value) { VH_shadingRateAttachmentTexelSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize$height(int value) { VH_shadingRateAttachmentTexelSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _imageViewAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageView, index), LAYOUT_imageView); }
    public MemorySegment _imageView() { return _imageViewAt(0L); }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR _imageViewAt(long index, MemorySegment src) { _imageViewAt(index).copyFrom(src); return this; }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR _imageView(MemorySegment src) { return _imageViewAt(0L, src); }
    public MemorySegment _imageLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageLayout, index), LAYOUT_imageLayout); }
    public MemorySegment _imageLayout() { return _imageLayoutAt(0L); }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR _imageLayoutAt(long index, MemorySegment src) { _imageLayoutAt(index).copyFrom(src); return this; }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR _imageLayout(MemorySegment src) { return _imageLayoutAt(0L, src); }
    public MemorySegment _shadingRateAttachmentTexelSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shadingRateAttachmentTexelSize, index), LAYOUT_shadingRateAttachmentTexelSize); }
    public MemorySegment _shadingRateAttachmentTexelSize() { return _shadingRateAttachmentTexelSizeAt(0L); }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR _shadingRateAttachmentTexelSizeAt(long index, MemorySegment src) { _shadingRateAttachmentTexelSizeAt(index).copyFrom(src); return this; }
    public VkRenderingFragmentShadingRateAttachmentInfoKHR _shadingRateAttachmentTexelSize(MemorySegment src) { return _shadingRateAttachmentTexelSizeAt(0L, src); }
}
