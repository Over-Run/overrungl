// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageViewCaptureDescriptorDataInfoEXT`.
/// ## Layout
/// ```
/// struct VkImageViewCaptureDescriptorDataInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkImageView imageView;
/// }
/// ```
public final class VkImageViewCaptureDescriptorDataInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("imageView")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_imageView = LAYOUT.byteOffset(PathElement.groupElement("imageView"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_imageView = LAYOUT.select(PathElement.groupElement("imageView"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_imageView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageView"));

    public VkImageViewCaptureDescriptorDataInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageViewCaptureDescriptorDataInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewCaptureDescriptorDataInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageViewCaptureDescriptorDataInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewCaptureDescriptorDataInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageViewCaptureDescriptorDataInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewCaptureDescriptorDataInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageViewCaptureDescriptorDataInfoEXT alloc(SegmentAllocator allocator) { return new VkImageViewCaptureDescriptorDataInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkImageViewCaptureDescriptorDataInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkImageViewCaptureDescriptorDataInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkImageViewCaptureDescriptorDataInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDescriptorBuffer.VK_STRUCTURE_TYPE_IMAGE_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_EXT); }
    public static VkImageViewCaptureDescriptorDataInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDescriptorBuffer.VK_STRUCTURE_TYPE_IMAGE_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_EXT);
        return s;
    }
    public VkImageViewCaptureDescriptorDataInfoEXT copyFrom(VkImageViewCaptureDescriptorDataInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageViewCaptureDescriptorDataInfoEXT reinterpret(long count) { return new VkImageViewCaptureDescriptorDataInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageViewCaptureDescriptorDataInfoEXT asSlice(long index) { return new VkImageViewCaptureDescriptorDataInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageViewCaptureDescriptorDataInfoEXT asSlice(long index, long count) { return new VkImageViewCaptureDescriptorDataInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageViewCaptureDescriptorDataInfoEXT at(long index, Consumer<VkImageViewCaptureDescriptorDataInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long imageViewAt(long index) { return (long) VH_imageView.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long imageView() { return (long) VH_imageView.get(this.segment(), 0L, 0L); }
    public VkImageViewCaptureDescriptorDataInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewCaptureDescriptorDataInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewCaptureDescriptorDataInfoEXT imageViewAt(long index, long value) { VH_imageView.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewCaptureDescriptorDataInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewCaptureDescriptorDataInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewCaptureDescriptorDataInfoEXT imageView(long value) { VH_imageView.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageViewCaptureDescriptorDataInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageViewCaptureDescriptorDataInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageViewCaptureDescriptorDataInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageViewCaptureDescriptorDataInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _imageViewAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageView, index), LAYOUT_imageView); }
    public MemorySegment _imageView() { return _imageViewAt(0L); }
    public VkImageViewCaptureDescriptorDataInfoEXT _imageViewAt(long index, MemorySegment src) { _imageViewAt(index).copyFrom(src); return this; }
    public VkImageViewCaptureDescriptorDataInfoEXT _imageView(MemorySegment src) { return _imageViewAt(0L, src); }
}
