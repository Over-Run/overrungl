// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceImageViewImageFormatInfoEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceImageViewImageFormatInfoEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkImageViewType imageViewType;
/// }
/// ```
public final class VkPhysicalDeviceImageViewImageFormatInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageViewType")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_imageViewType = LAYOUT.byteOffset(PathElement.groupElement("imageViewType"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_imageViewType = LAYOUT.select(PathElement.groupElement("imageViewType"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_imageViewType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageViewType"));

    public VkPhysicalDeviceImageViewImageFormatInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceImageViewImageFormatInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageViewImageFormatInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceImageViewImageFormatInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageViewImageFormatInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceImageViewImageFormatInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageViewImageFormatInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceImageViewImageFormatInfoEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageViewImageFormatInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceImageViewImageFormatInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImageViewImageFormatInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceImageViewImageFormatInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTFilterCubic.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_IMAGE_FORMAT_INFO_EXT); }
    public static VkPhysicalDeviceImageViewImageFormatInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTFilterCubic.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_IMAGE_FORMAT_INFO_EXT);
        return s;
    }
    public VkPhysicalDeviceImageViewImageFormatInfoEXT copyFrom(VkPhysicalDeviceImageViewImageFormatInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceImageViewImageFormatInfoEXT reinterpret(long count) { return new VkPhysicalDeviceImageViewImageFormatInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceImageViewImageFormatInfoEXT asSlice(long index) { return new VkPhysicalDeviceImageViewImageFormatInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceImageViewImageFormatInfoEXT asSlice(long index, long count) { return new VkPhysicalDeviceImageViewImageFormatInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceImageViewImageFormatInfoEXT at(long index, Consumer<VkPhysicalDeviceImageViewImageFormatInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int imageViewTypeAt(long index) { return (int) VH_imageViewType.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int imageViewType() { return (int) VH_imageViewType.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceImageViewImageFormatInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageViewImageFormatInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageViewImageFormatInfoEXT imageViewTypeAt(long index, int value) { VH_imageViewType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageViewImageFormatInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageViewImageFormatInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageViewImageFormatInfoEXT imageViewType(int value) { VH_imageViewType.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceImageViewImageFormatInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageViewImageFormatInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceImageViewImageFormatInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageViewImageFormatInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _imageViewTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageViewType, index), LAYOUT_imageViewType); }
    public MemorySegment _imageViewType() { return _imageViewTypeAt(0L); }
    public VkPhysicalDeviceImageViewImageFormatInfoEXT _imageViewTypeAt(long index, MemorySegment src) { _imageViewTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageViewImageFormatInfoEXT _imageViewType(MemorySegment src) { return _imageViewTypeAt(0L, src); }
}
