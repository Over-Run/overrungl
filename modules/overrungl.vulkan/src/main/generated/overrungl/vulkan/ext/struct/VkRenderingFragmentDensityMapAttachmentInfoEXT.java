// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderingFragmentDensityMapAttachmentInfoEXT`.
/// ## Layout
/// ```
/// struct VkRenderingFragmentDensityMapAttachmentInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkImageView imageView;
///     VkImageLayout imageLayout;
/// }
/// ```
public final class VkRenderingFragmentDensityMapAttachmentInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("imageView"),
        ValueLayout.JAVA_INT.withName("imageLayout")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_imageView = LAYOUT.byteOffset(PathElement.groupElement("imageView"));
    public static final long OFFSET_imageLayout = LAYOUT.byteOffset(PathElement.groupElement("imageLayout"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_imageView = LAYOUT.select(PathElement.groupElement("imageView"));
    public static final MemoryLayout LAYOUT_imageLayout = LAYOUT.select(PathElement.groupElement("imageLayout"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_imageView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageView"));
    public static final VarHandle VH_imageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageLayout"));

    public VkRenderingFragmentDensityMapAttachmentInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingFragmentDensityMapAttachmentInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingFragmentDensityMapAttachmentInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingFragmentDensityMapAttachmentInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT alloc(SegmentAllocator allocator) { return new VkRenderingFragmentDensityMapAttachmentInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkRenderingFragmentDensityMapAttachmentInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTFragmentDensityMap.VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT); }
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTFragmentDensityMap.VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT);
        return s;
    }
    public VkRenderingFragmentDensityMapAttachmentInfoEXT copyFrom(VkRenderingFragmentDensityMapAttachmentInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderingFragmentDensityMapAttachmentInfoEXT reinterpret(long count) { return new VkRenderingFragmentDensityMapAttachmentInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderingFragmentDensityMapAttachmentInfoEXT asSlice(long index) { return new VkRenderingFragmentDensityMapAttachmentInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderingFragmentDensityMapAttachmentInfoEXT asSlice(long index, long count) { return new VkRenderingFragmentDensityMapAttachmentInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderingFragmentDensityMapAttachmentInfoEXT at(long index, Consumer<VkRenderingFragmentDensityMapAttachmentInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long imageViewAt(long index) { return (long) VH_imageView.get(this.segment(), 0L, index); }
    public int imageLayoutAt(long index) { return (int) VH_imageLayout.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long imageView() { return (long) VH_imageView.get(this.segment(), 0L, 0L); }
    public int imageLayout() { return (int) VH_imageLayout.get(this.segment(), 0L, 0L); }
    public VkRenderingFragmentDensityMapAttachmentInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingFragmentDensityMapAttachmentInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingFragmentDensityMapAttachmentInfoEXT imageViewAt(long index, long value) { VH_imageView.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingFragmentDensityMapAttachmentInfoEXT imageLayoutAt(long index, int value) { VH_imageLayout.set(this.segment(), 0L, index, value); return this; }
    public VkRenderingFragmentDensityMapAttachmentInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingFragmentDensityMapAttachmentInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingFragmentDensityMapAttachmentInfoEXT imageView(long value) { VH_imageView.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderingFragmentDensityMapAttachmentInfoEXT imageLayout(int value) { VH_imageLayout.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderingFragmentDensityMapAttachmentInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderingFragmentDensityMapAttachmentInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderingFragmentDensityMapAttachmentInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderingFragmentDensityMapAttachmentInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _imageViewAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageView, index), LAYOUT_imageView); }
    public MemorySegment _imageView() { return _imageViewAt(0L); }
    public VkRenderingFragmentDensityMapAttachmentInfoEXT _imageViewAt(long index, MemorySegment src) { _imageViewAt(index).copyFrom(src); return this; }
    public VkRenderingFragmentDensityMapAttachmentInfoEXT _imageView(MemorySegment src) { return _imageViewAt(0L, src); }
    public MemorySegment _imageLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageLayout, index), LAYOUT_imageLayout); }
    public MemorySegment _imageLayout() { return _imageLayoutAt(0L); }
    public VkRenderingFragmentDensityMapAttachmentInfoEXT _imageLayoutAt(long index, MemorySegment src) { _imageLayoutAt(index).copyFrom(src); return this; }
    public VkRenderingFragmentDensityMapAttachmentInfoEXT _imageLayout(MemorySegment src) { return _imageLayoutAt(0L, src); }
}
