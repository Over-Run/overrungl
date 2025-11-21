// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nvx.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageViewHandleInfoNVX`.
/// ## Layout
/// ```
/// struct VkImageViewHandleInfoNVX {
///     VkStructureType sType;
///     const void* pNext;
///     VkImageView imageView;
///     VkDescriptorType descriptorType;
///     VkSampler sampler;
/// }
/// ```
public final class VkImageViewHandleInfoNVX extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("imageView"),
        ValueLayout.JAVA_INT.withName("descriptorType"),
        ValueLayout.JAVA_LONG.withName("sampler")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_imageView = LAYOUT.byteOffset(PathElement.groupElement("imageView"));
    public static final long OFFSET_descriptorType = LAYOUT.byteOffset(PathElement.groupElement("descriptorType"));
    public static final long OFFSET_sampler = LAYOUT.byteOffset(PathElement.groupElement("sampler"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_imageView = LAYOUT.select(PathElement.groupElement("imageView"));
    public static final MemoryLayout LAYOUT_descriptorType = LAYOUT.select(PathElement.groupElement("descriptorType"));
    public static final MemoryLayout LAYOUT_sampler = LAYOUT.select(PathElement.groupElement("sampler"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_imageView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageView"));
    public static final VarHandle VH_descriptorType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorType"));
    public static final VarHandle VH_sampler = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampler"));

    public VkImageViewHandleInfoNVX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageViewHandleInfoNVX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewHandleInfoNVX(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageViewHandleInfoNVX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewHandleInfoNVX(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageViewHandleInfoNVX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewHandleInfoNVX(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageViewHandleInfoNVX alloc(SegmentAllocator allocator) { return new VkImageViewHandleInfoNVX(allocator.allocate(LAYOUT), 1); }
    public static VkImageViewHandleInfoNVX alloc(SegmentAllocator allocator, long count) { return new VkImageViewHandleInfoNVX(allocator.allocate(LAYOUT, count), count); }
    public static VkImageViewHandleInfoNVX allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nvx.VKNVXImageViewHandle.VK_STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX); }
    public static VkImageViewHandleInfoNVX allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nvx.VKNVXImageViewHandle.VK_STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX);
        return s;
    }
    public VkImageViewHandleInfoNVX copyFrom(VkImageViewHandleInfoNVX src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageViewHandleInfoNVX reinterpret(long count) { return new VkImageViewHandleInfoNVX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageViewHandleInfoNVX asSlice(long index) { return new VkImageViewHandleInfoNVX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageViewHandleInfoNVX asSlice(long index, long count) { return new VkImageViewHandleInfoNVX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageViewHandleInfoNVX at(long index, Consumer<VkImageViewHandleInfoNVX> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long imageViewAt(long index) { return (long) VH_imageView.get(this.segment(), 0L, index); }
    public int descriptorTypeAt(long index) { return (int) VH_descriptorType.get(this.segment(), 0L, index); }
    public long samplerAt(long index) { return (long) VH_sampler.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long imageView() { return (long) VH_imageView.get(this.segment(), 0L, 0L); }
    public int descriptorType() { return (int) VH_descriptorType.get(this.segment(), 0L, 0L); }
    public long sampler() { return (long) VH_sampler.get(this.segment(), 0L, 0L); }
    public VkImageViewHandleInfoNVX sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewHandleInfoNVX pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewHandleInfoNVX imageViewAt(long index, long value) { VH_imageView.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewHandleInfoNVX descriptorTypeAt(long index, int value) { VH_descriptorType.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewHandleInfoNVX samplerAt(long index, long value) { VH_sampler.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewHandleInfoNVX sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewHandleInfoNVX pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewHandleInfoNVX imageView(long value) { VH_imageView.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewHandleInfoNVX descriptorType(int value) { VH_descriptorType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewHandleInfoNVX sampler(long value) { VH_sampler.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageViewHandleInfoNVX _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageViewHandleInfoNVX _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageViewHandleInfoNVX _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageViewHandleInfoNVX _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _imageViewAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageView, index), LAYOUT_imageView); }
    public MemorySegment _imageView() { return _imageViewAt(0L); }
    public VkImageViewHandleInfoNVX _imageViewAt(long index, MemorySegment src) { _imageViewAt(index).copyFrom(src); return this; }
    public VkImageViewHandleInfoNVX _imageView(MemorySegment src) { return _imageViewAt(0L, src); }
    public MemorySegment _descriptorTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorType, index), LAYOUT_descriptorType); }
    public MemorySegment _descriptorType() { return _descriptorTypeAt(0L); }
    public VkImageViewHandleInfoNVX _descriptorTypeAt(long index, MemorySegment src) { _descriptorTypeAt(index).copyFrom(src); return this; }
    public VkImageViewHandleInfoNVX _descriptorType(MemorySegment src) { return _descriptorTypeAt(0L, src); }
    public MemorySegment _samplerAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampler, index), LAYOUT_sampler); }
    public MemorySegment _sampler() { return _samplerAt(0L); }
    public VkImageViewHandleInfoNVX _samplerAt(long index, MemorySegment src) { _samplerAt(index).copyFrom(src); return this; }
    public VkImageViewHandleInfoNVX _sampler(MemorySegment src) { return _samplerAt(0L, src); }
}
