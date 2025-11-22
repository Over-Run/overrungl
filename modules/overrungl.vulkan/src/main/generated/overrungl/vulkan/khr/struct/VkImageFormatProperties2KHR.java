// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageFormatProperties2KHR`.
/// ## Layout
/// ```
/// struct VkImageFormatProperties2KHR {
///     VkStructureType sType;
///     void* pNext;
///     VkImageFormatProperties imageFormatProperties;
/// }
/// ```
public final class VkImageFormatProperties2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkImageFormatProperties.LAYOUT.withName("imageFormatProperties")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_imageFormatProperties = LAYOUT.byteOffset(PathElement.groupElement("imageFormatProperties"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_imageFormatProperties = LAYOUT.select(PathElement.groupElement("imageFormatProperties"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_imageFormatProperties$maxExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageFormatProperties"), PathElement.groupElement("maxExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_imageFormatProperties$maxExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageFormatProperties"), PathElement.groupElement("maxExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_imageFormatProperties$maxExtent$depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageFormatProperties"), PathElement.groupElement("maxExtent"), PathElement.groupElement("depth"));
    public static final VarHandle VH_imageFormatProperties$maxMipLevels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageFormatProperties"), PathElement.groupElement("maxMipLevels"));
    public static final VarHandle VH_imageFormatProperties$maxArrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageFormatProperties"), PathElement.groupElement("maxArrayLayers"));
    public static final VarHandle VH_imageFormatProperties$sampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageFormatProperties"), PathElement.groupElement("sampleCounts"));
    public static final VarHandle VH_imageFormatProperties$maxResourceSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageFormatProperties"), PathElement.groupElement("maxResourceSize"));

    public VkImageFormatProperties2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageFormatProperties2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageFormatProperties2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageFormatProperties2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageFormatProperties2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageFormatProperties2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageFormatProperties2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageFormatProperties2KHR alloc(SegmentAllocator allocator) { return new VkImageFormatProperties2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkImageFormatProperties2KHR alloc(SegmentAllocator allocator, long count) { return new VkImageFormatProperties2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkImageFormatProperties2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2); }
    public static VkImageFormatProperties2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2);
        return s;
    }
    public VkImageFormatProperties2KHR copyFrom(VkImageFormatProperties2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageFormatProperties2KHR reinterpret(long count) { return new VkImageFormatProperties2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageFormatProperties2KHR asSlice(long index) { return new VkImageFormatProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageFormatProperties2KHR asSlice(long index, long count) { return new VkImageFormatProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageFormatProperties2KHR at(long index, Consumer<VkImageFormatProperties2KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int imageFormatProperties$maxExtent$widthAt(long index) { return (int) VH_imageFormatProperties$maxExtent$width.get(this.segment(), 0L, index); }
    public int imageFormatProperties$maxExtent$heightAt(long index) { return (int) VH_imageFormatProperties$maxExtent$height.get(this.segment(), 0L, index); }
    public int imageFormatProperties$maxExtent$depthAt(long index) { return (int) VH_imageFormatProperties$maxExtent$depth.get(this.segment(), 0L, index); }
    public int imageFormatProperties$maxMipLevelsAt(long index) { return (int) VH_imageFormatProperties$maxMipLevels.get(this.segment(), 0L, index); }
    public int imageFormatProperties$maxArrayLayersAt(long index) { return (int) VH_imageFormatProperties$maxArrayLayers.get(this.segment(), 0L, index); }
    public int imageFormatProperties$sampleCountsAt(long index) { return (int) VH_imageFormatProperties$sampleCounts.get(this.segment(), 0L, index); }
    public long imageFormatProperties$maxResourceSizeAt(long index) { return (long) VH_imageFormatProperties$maxResourceSize.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int imageFormatProperties$maxExtent$width() { return (int) VH_imageFormatProperties$maxExtent$width.get(this.segment(), 0L, 0L); }
    public int imageFormatProperties$maxExtent$height() { return (int) VH_imageFormatProperties$maxExtent$height.get(this.segment(), 0L, 0L); }
    public int imageFormatProperties$maxExtent$depth() { return (int) VH_imageFormatProperties$maxExtent$depth.get(this.segment(), 0L, 0L); }
    public int imageFormatProperties$maxMipLevels() { return (int) VH_imageFormatProperties$maxMipLevels.get(this.segment(), 0L, 0L); }
    public int imageFormatProperties$maxArrayLayers() { return (int) VH_imageFormatProperties$maxArrayLayers.get(this.segment(), 0L, 0L); }
    public int imageFormatProperties$sampleCounts() { return (int) VH_imageFormatProperties$sampleCounts.get(this.segment(), 0L, 0L); }
    public long imageFormatProperties$maxResourceSize() { return (long) VH_imageFormatProperties$maxResourceSize.get(this.segment(), 0L, 0L); }
    public VkImageFormatProperties2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatProperties2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatProperties2KHR imageFormatProperties$maxExtent$widthAt(long index, int value) { VH_imageFormatProperties$maxExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatProperties2KHR imageFormatProperties$maxExtent$heightAt(long index, int value) { VH_imageFormatProperties$maxExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatProperties2KHR imageFormatProperties$maxExtent$depthAt(long index, int value) { VH_imageFormatProperties$maxExtent$depth.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatProperties2KHR imageFormatProperties$maxMipLevelsAt(long index, int value) { VH_imageFormatProperties$maxMipLevels.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatProperties2KHR imageFormatProperties$maxArrayLayersAt(long index, int value) { VH_imageFormatProperties$maxArrayLayers.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatProperties2KHR imageFormatProperties$sampleCountsAt(long index, int value) { VH_imageFormatProperties$sampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatProperties2KHR imageFormatProperties$maxResourceSizeAt(long index, long value) { VH_imageFormatProperties$maxResourceSize.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatProperties2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatProperties2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatProperties2KHR imageFormatProperties$maxExtent$width(int value) { VH_imageFormatProperties$maxExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatProperties2KHR imageFormatProperties$maxExtent$height(int value) { VH_imageFormatProperties$maxExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatProperties2KHR imageFormatProperties$maxExtent$depth(int value) { VH_imageFormatProperties$maxExtent$depth.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatProperties2KHR imageFormatProperties$maxMipLevels(int value) { VH_imageFormatProperties$maxMipLevels.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatProperties2KHR imageFormatProperties$maxArrayLayers(int value) { VH_imageFormatProperties$maxArrayLayers.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatProperties2KHR imageFormatProperties$sampleCounts(int value) { VH_imageFormatProperties$sampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatProperties2KHR imageFormatProperties$maxResourceSize(long value) { VH_imageFormatProperties$maxResourceSize.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageFormatProperties2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageFormatProperties2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageFormatProperties2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageFormatProperties2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _imageFormatPropertiesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageFormatProperties, index), LAYOUT_imageFormatProperties); }
    public MemorySegment _imageFormatProperties() { return _imageFormatPropertiesAt(0L); }
    public VkImageFormatProperties2KHR _imageFormatPropertiesAt(long index, MemorySegment src) { _imageFormatPropertiesAt(index).copyFrom(src); return this; }
    public VkImageFormatProperties2KHR _imageFormatProperties(MemorySegment src) { return _imageFormatPropertiesAt(0L, src); }
}
