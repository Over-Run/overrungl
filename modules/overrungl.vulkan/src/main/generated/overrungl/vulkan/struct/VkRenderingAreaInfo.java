// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderingAreaInfo`.
/// ## Layout
/// ```
/// struct VkRenderingAreaInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t viewMask;
///     uint32_t colorAttachmentCount;
///     const VkFormat* pColorAttachmentFormats;
///     VkFormat depthAttachmentFormat;
///     VkFormat stencilAttachmentFormat;
/// }
/// ```
public final class VkRenderingAreaInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("viewMask"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withName("pColorAttachmentFormats"),
        ValueLayout.JAVA_INT.withName("depthAttachmentFormat"),
        ValueLayout.JAVA_INT.withName("stencilAttachmentFormat")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_viewMask = LAYOUT.byteOffset(PathElement.groupElement("viewMask"));
    public static final long OFFSET_colorAttachmentCount = LAYOUT.byteOffset(PathElement.groupElement("colorAttachmentCount"));
    public static final long OFFSET_pColorAttachmentFormats = LAYOUT.byteOffset(PathElement.groupElement("pColorAttachmentFormats"));
    public static final long OFFSET_depthAttachmentFormat = LAYOUT.byteOffset(PathElement.groupElement("depthAttachmentFormat"));
    public static final long OFFSET_stencilAttachmentFormat = LAYOUT.byteOffset(PathElement.groupElement("stencilAttachmentFormat"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_viewMask = LAYOUT.select(PathElement.groupElement("viewMask"));
    public static final MemoryLayout LAYOUT_colorAttachmentCount = LAYOUT.select(PathElement.groupElement("colorAttachmentCount"));
    public static final MemoryLayout LAYOUT_pColorAttachmentFormats = LAYOUT.select(PathElement.groupElement("pColorAttachmentFormats"));
    public static final MemoryLayout LAYOUT_depthAttachmentFormat = LAYOUT.select(PathElement.groupElement("depthAttachmentFormat"));
    public static final MemoryLayout LAYOUT_stencilAttachmentFormat = LAYOUT.select(PathElement.groupElement("stencilAttachmentFormat"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_viewMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewMask"));
    public static final VarHandle VH_colorAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachmentCount"));
    public static final VarHandle VH_pColorAttachmentFormats = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorAttachmentFormats"));
    public static final VarHandle VH_depthAttachmentFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthAttachmentFormat"));
    public static final VarHandle VH_stencilAttachmentFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilAttachmentFormat"));

    public VkRenderingAreaInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderingAreaInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingAreaInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderingAreaInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingAreaInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderingAreaInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingAreaInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderingAreaInfo alloc(SegmentAllocator allocator) { return new VkRenderingAreaInfo(allocator.allocate(LAYOUT), 1); }
    public static VkRenderingAreaInfo alloc(SegmentAllocator allocator, long count) { return new VkRenderingAreaInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderingAreaInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_RENDERING_AREA_INFO); }
    public static VkRenderingAreaInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_RENDERING_AREA_INFO);
        return s;
    }
    public VkRenderingAreaInfo copyFrom(VkRenderingAreaInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderingAreaInfo reinterpret(long count) { return new VkRenderingAreaInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderingAreaInfo asSlice(long index) { return new VkRenderingAreaInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderingAreaInfo asSlice(long index, long count) { return new VkRenderingAreaInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderingAreaInfo at(long index, Consumer<VkRenderingAreaInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int viewMaskAt(long index) { return (int) VH_viewMask.get(this.segment(), 0L, index); }
    public int colorAttachmentCountAt(long index) { return (int) VH_colorAttachmentCount.get(this.segment(), 0L, index); }
    public MemorySegment pColorAttachmentFormatsAt(long index) { return (MemorySegment) VH_pColorAttachmentFormats.get(this.segment(), 0L, index); }
    public int depthAttachmentFormatAt(long index) { return (int) VH_depthAttachmentFormat.get(this.segment(), 0L, index); }
    public int stencilAttachmentFormatAt(long index) { return (int) VH_stencilAttachmentFormat.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int viewMask() { return (int) VH_viewMask.get(this.segment(), 0L, 0L); }
    public int colorAttachmentCount() { return (int) VH_colorAttachmentCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pColorAttachmentFormats() { return (MemorySegment) VH_pColorAttachmentFormats.get(this.segment(), 0L, 0L); }
    public int depthAttachmentFormat() { return (int) VH_depthAttachmentFormat.get(this.segment(), 0L, 0L); }
    public int stencilAttachmentFormat() { return (int) VH_stencilAttachmentFormat.get(this.segment(), 0L, 0L); }
    public VkRenderingAreaInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingAreaInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingAreaInfo viewMaskAt(long index, int value) { VH_viewMask.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingAreaInfo colorAttachmentCountAt(long index, int value) { VH_colorAttachmentCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingAreaInfo pColorAttachmentFormatsAt(long index, MemorySegment value) { VH_pColorAttachmentFormats.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingAreaInfo depthAttachmentFormatAt(long index, int value) { VH_depthAttachmentFormat.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingAreaInfo stencilAttachmentFormatAt(long index, int value) { VH_stencilAttachmentFormat.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingAreaInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingAreaInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingAreaInfo viewMask(int value) { VH_viewMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingAreaInfo colorAttachmentCount(int value) { VH_colorAttachmentCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingAreaInfo pColorAttachmentFormats(MemorySegment value) { VH_pColorAttachmentFormats.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingAreaInfo depthAttachmentFormat(int value) { VH_depthAttachmentFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingAreaInfo stencilAttachmentFormat(int value) { VH_stencilAttachmentFormat.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderingAreaInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderingAreaInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderingAreaInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderingAreaInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _viewMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_viewMask, index), LAYOUT_viewMask); }
    public MemorySegment _viewMask() { return _viewMaskAt(0L); }
    public VkRenderingAreaInfo _viewMaskAt(long index, MemorySegment src) { _viewMaskAt(index).copyFrom(src); return this; }
    public VkRenderingAreaInfo _viewMask(MemorySegment src) { return _viewMaskAt(0L, src); }
    public MemorySegment _colorAttachmentCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_colorAttachmentCount, index), LAYOUT_colorAttachmentCount); }
    public MemorySegment _colorAttachmentCount() { return _colorAttachmentCountAt(0L); }
    public VkRenderingAreaInfo _colorAttachmentCountAt(long index, MemorySegment src) { _colorAttachmentCountAt(index).copyFrom(src); return this; }
    public VkRenderingAreaInfo _colorAttachmentCount(MemorySegment src) { return _colorAttachmentCountAt(0L, src); }
    public MemorySegment _pColorAttachmentFormatsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pColorAttachmentFormats, index), LAYOUT_pColorAttachmentFormats); }
    public MemorySegment _pColorAttachmentFormats() { return _pColorAttachmentFormatsAt(0L); }
    public VkRenderingAreaInfo _pColorAttachmentFormatsAt(long index, MemorySegment src) { _pColorAttachmentFormatsAt(index).copyFrom(src); return this; }
    public VkRenderingAreaInfo _pColorAttachmentFormats(MemorySegment src) { return _pColorAttachmentFormatsAt(0L, src); }
    public MemorySegment _depthAttachmentFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthAttachmentFormat, index), LAYOUT_depthAttachmentFormat); }
    public MemorySegment _depthAttachmentFormat() { return _depthAttachmentFormatAt(0L); }
    public VkRenderingAreaInfo _depthAttachmentFormatAt(long index, MemorySegment src) { _depthAttachmentFormatAt(index).copyFrom(src); return this; }
    public VkRenderingAreaInfo _depthAttachmentFormat(MemorySegment src) { return _depthAttachmentFormatAt(0L, src); }
    public MemorySegment _stencilAttachmentFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stencilAttachmentFormat, index), LAYOUT_stencilAttachmentFormat); }
    public MemorySegment _stencilAttachmentFormat() { return _stencilAttachmentFormatAt(0L); }
    public VkRenderingAreaInfo _stencilAttachmentFormatAt(long index, MemorySegment src) { _stencilAttachmentFormatAt(index).copyFrom(src); return this; }
    public VkRenderingAreaInfo _stencilAttachmentFormat(MemorySegment src) { return _stencilAttachmentFormatAt(0L, src); }
}
