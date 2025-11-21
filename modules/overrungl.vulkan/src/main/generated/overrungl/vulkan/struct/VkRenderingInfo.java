// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderingInfo`.
/// ## Layout
/// ```
/// struct VkRenderingInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkRenderingFlags flags;
///     VkRect2D renderArea;
///     uint32_t layerCount;
///     uint32_t viewMask;
///     uint32_t colorAttachmentCount;
///     const VkRenderingAttachmentInfo* pColorAttachments;
///     const VkRenderingAttachmentInfo* pDepthAttachment;
///     const VkRenderingAttachmentInfo* pStencilAttachment;
/// }
/// ```
public final class VkRenderingInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        overrungl.vulkan.struct.VkRect2D.LAYOUT.withName("renderArea"),
        ValueLayout.JAVA_INT.withName("layerCount"),
        ValueLayout.JAVA_INT.withName("viewMask"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withName("pColorAttachments"),
        ValueLayout.ADDRESS.withName("pDepthAttachment"),
        ValueLayout.ADDRESS.withName("pStencilAttachment")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_renderArea = LAYOUT.byteOffset(PathElement.groupElement("renderArea"));
    public static final long OFFSET_layerCount = LAYOUT.byteOffset(PathElement.groupElement("layerCount"));
    public static final long OFFSET_viewMask = LAYOUT.byteOffset(PathElement.groupElement("viewMask"));
    public static final long OFFSET_colorAttachmentCount = LAYOUT.byteOffset(PathElement.groupElement("colorAttachmentCount"));
    public static final long OFFSET_pColorAttachments = LAYOUT.byteOffset(PathElement.groupElement("pColorAttachments"));
    public static final long OFFSET_pDepthAttachment = LAYOUT.byteOffset(PathElement.groupElement("pDepthAttachment"));
    public static final long OFFSET_pStencilAttachment = LAYOUT.byteOffset(PathElement.groupElement("pStencilAttachment"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_renderArea = LAYOUT.select(PathElement.groupElement("renderArea"));
    public static final MemoryLayout LAYOUT_layerCount = LAYOUT.select(PathElement.groupElement("layerCount"));
    public static final MemoryLayout LAYOUT_viewMask = LAYOUT.select(PathElement.groupElement("viewMask"));
    public static final MemoryLayout LAYOUT_colorAttachmentCount = LAYOUT.select(PathElement.groupElement("colorAttachmentCount"));
    public static final MemoryLayout LAYOUT_pColorAttachments = LAYOUT.select(PathElement.groupElement("pColorAttachments"));
    public static final MemoryLayout LAYOUT_pDepthAttachment = LAYOUT.select(PathElement.groupElement("pDepthAttachment"));
    public static final MemoryLayout LAYOUT_pStencilAttachment = LAYOUT.select(PathElement.groupElement("pStencilAttachment"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_renderArea$offset$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderArea"), PathElement.groupElement("offset"), PathElement.groupElement("x"));
    public static final VarHandle VH_renderArea$offset$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderArea"), PathElement.groupElement("offset"), PathElement.groupElement("y"));
    public static final VarHandle VH_renderArea$extent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderArea"), PathElement.groupElement("extent"), PathElement.groupElement("width"));
    public static final VarHandle VH_renderArea$extent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderArea"), PathElement.groupElement("extent"), PathElement.groupElement("height"));
    public static final VarHandle VH_layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layerCount"));
    public static final VarHandle VH_viewMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewMask"));
    public static final VarHandle VH_colorAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachmentCount"));
    public static final VarHandle VH_pColorAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorAttachments"));
    public static final VarHandle VH_pDepthAttachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDepthAttachment"));
    public static final VarHandle VH_pStencilAttachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStencilAttachment"));

    public VkRenderingInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderingInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderingInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderingInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderingInfo alloc(SegmentAllocator allocator) { return new VkRenderingInfo(allocator.allocate(LAYOUT), 1); }
    public static VkRenderingInfo alloc(SegmentAllocator allocator, long count) { return new VkRenderingInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderingInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_RENDERING_INFO); }
    public static VkRenderingInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_RENDERING_INFO);
        return s;
    }
    public VkRenderingInfo copyFrom(VkRenderingInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderingInfo reinterpret(long count) { return new VkRenderingInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderingInfo asSlice(long index) { return new VkRenderingInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderingInfo asSlice(long index, long count) { return new VkRenderingInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderingInfo at(long index, Consumer<VkRenderingInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int renderArea$offset$xAt(long index) { return (int) VH_renderArea$offset$x.get(this.segment(), 0L, index); }
    public int renderArea$offset$yAt(long index) { return (int) VH_renderArea$offset$y.get(this.segment(), 0L, index); }
    public int renderArea$extent$widthAt(long index) { return (int) VH_renderArea$extent$width.get(this.segment(), 0L, index); }
    public int renderArea$extent$heightAt(long index) { return (int) VH_renderArea$extent$height.get(this.segment(), 0L, index); }
    public int layerCountAt(long index) { return (int) VH_layerCount.get(this.segment(), 0L, index); }
    public int viewMaskAt(long index) { return (int) VH_viewMask.get(this.segment(), 0L, index); }
    public int colorAttachmentCountAt(long index) { return (int) VH_colorAttachmentCount.get(this.segment(), 0L, index); }
    public MemorySegment pColorAttachmentsAt(long index) { return (MemorySegment) VH_pColorAttachments.get(this.segment(), 0L, index); }
    public MemorySegment pDepthAttachmentAt(long index) { return (MemorySegment) VH_pDepthAttachment.get(this.segment(), 0L, index); }
    public MemorySegment pStencilAttachmentAt(long index) { return (MemorySegment) VH_pStencilAttachment.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int renderArea$offset$x() { return (int) VH_renderArea$offset$x.get(this.segment(), 0L, 0L); }
    public int renderArea$offset$y() { return (int) VH_renderArea$offset$y.get(this.segment(), 0L, 0L); }
    public int renderArea$extent$width() { return (int) VH_renderArea$extent$width.get(this.segment(), 0L, 0L); }
    public int renderArea$extent$height() { return (int) VH_renderArea$extent$height.get(this.segment(), 0L, 0L); }
    public int layerCount() { return (int) VH_layerCount.get(this.segment(), 0L, 0L); }
    public int viewMask() { return (int) VH_viewMask.get(this.segment(), 0L, 0L); }
    public int colorAttachmentCount() { return (int) VH_colorAttachmentCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pColorAttachments() { return (MemorySegment) VH_pColorAttachments.get(this.segment(), 0L, 0L); }
    public MemorySegment pDepthAttachment() { return (MemorySegment) VH_pDepthAttachment.get(this.segment(), 0L, 0L); }
    public MemorySegment pStencilAttachment() { return (MemorySegment) VH_pStencilAttachment.get(this.segment(), 0L, 0L); }
    public VkRenderingInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingInfo renderArea$offset$xAt(long index, int value) { VH_renderArea$offset$x.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingInfo renderArea$offset$yAt(long index, int value) { VH_renderArea$offset$y.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingInfo renderArea$extent$widthAt(long index, int value) { VH_renderArea$extent$width.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingInfo renderArea$extent$heightAt(long index, int value) { VH_renderArea$extent$height.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingInfo layerCountAt(long index, int value) { VH_layerCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingInfo viewMaskAt(long index, int value) { VH_viewMask.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingInfo colorAttachmentCountAt(long index, int value) { VH_colorAttachmentCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingInfo pColorAttachmentsAt(long index, MemorySegment value) { VH_pColorAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingInfo pDepthAttachmentAt(long index, MemorySegment value) { VH_pDepthAttachment.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingInfo pStencilAttachmentAt(long index, MemorySegment value) { VH_pStencilAttachment.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingInfo renderArea$offset$x(int value) { VH_renderArea$offset$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingInfo renderArea$offset$y(int value) { VH_renderArea$offset$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingInfo renderArea$extent$width(int value) { VH_renderArea$extent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingInfo renderArea$extent$height(int value) { VH_renderArea$extent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingInfo layerCount(int value) { VH_layerCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingInfo viewMask(int value) { VH_viewMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingInfo colorAttachmentCount(int value) { VH_colorAttachmentCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingInfo pColorAttachments(MemorySegment value) { VH_pColorAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingInfo pDepthAttachment(MemorySegment value) { VH_pDepthAttachment.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingInfo pStencilAttachment(MemorySegment value) { VH_pStencilAttachment.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderingInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderingInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderingInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderingInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkRenderingInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkRenderingInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _renderAreaAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_renderArea, index), LAYOUT_renderArea); }
    public MemorySegment _renderArea() { return _renderAreaAt(0L); }
    public VkRenderingInfo _renderAreaAt(long index, MemorySegment src) { _renderAreaAt(index).copyFrom(src); return this; }
    public VkRenderingInfo _renderArea(MemorySegment src) { return _renderAreaAt(0L, src); }
    public MemorySegment _layerCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layerCount, index), LAYOUT_layerCount); }
    public MemorySegment _layerCount() { return _layerCountAt(0L); }
    public VkRenderingInfo _layerCountAt(long index, MemorySegment src) { _layerCountAt(index).copyFrom(src); return this; }
    public VkRenderingInfo _layerCount(MemorySegment src) { return _layerCountAt(0L, src); }
    public MemorySegment _viewMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_viewMask, index), LAYOUT_viewMask); }
    public MemorySegment _viewMask() { return _viewMaskAt(0L); }
    public VkRenderingInfo _viewMaskAt(long index, MemorySegment src) { _viewMaskAt(index).copyFrom(src); return this; }
    public VkRenderingInfo _viewMask(MemorySegment src) { return _viewMaskAt(0L, src); }
    public MemorySegment _colorAttachmentCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_colorAttachmentCount, index), LAYOUT_colorAttachmentCount); }
    public MemorySegment _colorAttachmentCount() { return _colorAttachmentCountAt(0L); }
    public VkRenderingInfo _colorAttachmentCountAt(long index, MemorySegment src) { _colorAttachmentCountAt(index).copyFrom(src); return this; }
    public VkRenderingInfo _colorAttachmentCount(MemorySegment src) { return _colorAttachmentCountAt(0L, src); }
    public MemorySegment _pColorAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pColorAttachments, index), LAYOUT_pColorAttachments); }
    public MemorySegment _pColorAttachments() { return _pColorAttachmentsAt(0L); }
    public VkRenderingInfo _pColorAttachmentsAt(long index, MemorySegment src) { _pColorAttachmentsAt(index).copyFrom(src); return this; }
    public VkRenderingInfo _pColorAttachments(MemorySegment src) { return _pColorAttachmentsAt(0L, src); }
    public MemorySegment _pDepthAttachmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDepthAttachment, index), LAYOUT_pDepthAttachment); }
    public MemorySegment _pDepthAttachment() { return _pDepthAttachmentAt(0L); }
    public VkRenderingInfo _pDepthAttachmentAt(long index, MemorySegment src) { _pDepthAttachmentAt(index).copyFrom(src); return this; }
    public VkRenderingInfo _pDepthAttachment(MemorySegment src) { return _pDepthAttachmentAt(0L, src); }
    public MemorySegment _pStencilAttachmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStencilAttachment, index), LAYOUT_pStencilAttachment); }
    public MemorySegment _pStencilAttachment() { return _pStencilAttachmentAt(0L); }
    public VkRenderingInfo _pStencilAttachmentAt(long index, MemorySegment src) { _pStencilAttachmentAt(index).copyFrom(src); return this; }
    public VkRenderingInfo _pStencilAttachment(MemorySegment src) { return _pStencilAttachmentAt(0L, src); }
}
