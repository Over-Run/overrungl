// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSparseImageFormatProperties2KHR`.
/// ## Layout
/// ```
/// struct VkSparseImageFormatProperties2KHR {
///     VkStructureType sType;
///     void* pNext;
///     VkSparseImageFormatProperties properties;
/// }
/// ```
public final class VkSparseImageFormatProperties2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkSparseImageFormatProperties.LAYOUT.withName("properties")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_properties = LAYOUT.byteOffset(PathElement.groupElement("properties"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_properties = LAYOUT.select(PathElement.groupElement("properties"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_properties$aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("aspectMask"));
    public static final VarHandle VH_properties$imageGranularity$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("imageGranularity"), PathElement.groupElement("width"));
    public static final VarHandle VH_properties$imageGranularity$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("imageGranularity"), PathElement.groupElement("height"));
    public static final VarHandle VH_properties$imageGranularity$depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("imageGranularity"), PathElement.groupElement("depth"));
    public static final VarHandle VH_properties$flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("flags"));

    public VkSparseImageFormatProperties2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSparseImageFormatProperties2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageFormatProperties2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkSparseImageFormatProperties2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageFormatProperties2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSparseImageFormatProperties2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageFormatProperties2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSparseImageFormatProperties2KHR alloc(SegmentAllocator allocator) { return new VkSparseImageFormatProperties2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkSparseImageFormatProperties2KHR alloc(SegmentAllocator allocator, long count) { return new VkSparseImageFormatProperties2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkSparseImageFormatProperties2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2); }
    public static VkSparseImageFormatProperties2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2);
        return s;
    }
    public VkSparseImageFormatProperties2KHR copyFrom(VkSparseImageFormatProperties2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSparseImageFormatProperties2KHR reinterpret(long count) { return new VkSparseImageFormatProperties2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSparseImageFormatProperties2KHR asSlice(long index) { return new VkSparseImageFormatProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSparseImageFormatProperties2KHR asSlice(long index, long count) { return new VkSparseImageFormatProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSparseImageFormatProperties2KHR at(long index, Consumer<VkSparseImageFormatProperties2KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int properties$aspectMaskAt(long index) { return (int) VH_properties$aspectMask.get(this.segment(), 0L, index); }
    public int properties$imageGranularity$widthAt(long index) { return (int) VH_properties$imageGranularity$width.get(this.segment(), 0L, index); }
    public int properties$imageGranularity$heightAt(long index) { return (int) VH_properties$imageGranularity$height.get(this.segment(), 0L, index); }
    public int properties$imageGranularity$depthAt(long index) { return (int) VH_properties$imageGranularity$depth.get(this.segment(), 0L, index); }
    public int properties$flagsAt(long index) { return (int) VH_properties$flags.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int properties$aspectMask() { return (int) VH_properties$aspectMask.get(this.segment(), 0L, 0L); }
    public int properties$imageGranularity$width() { return (int) VH_properties$imageGranularity$width.get(this.segment(), 0L, 0L); }
    public int properties$imageGranularity$height() { return (int) VH_properties$imageGranularity$height.get(this.segment(), 0L, 0L); }
    public int properties$imageGranularity$depth() { return (int) VH_properties$imageGranularity$depth.get(this.segment(), 0L, 0L); }
    public int properties$flags() { return (int) VH_properties$flags.get(this.segment(), 0L, 0L); }
    public VkSparseImageFormatProperties2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageFormatProperties2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageFormatProperties2KHR properties$aspectMaskAt(long index, int value) { VH_properties$aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageFormatProperties2KHR properties$imageGranularity$widthAt(long index, int value) { VH_properties$imageGranularity$width.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageFormatProperties2KHR properties$imageGranularity$heightAt(long index, int value) { VH_properties$imageGranularity$height.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageFormatProperties2KHR properties$imageGranularity$depthAt(long index, int value) { VH_properties$imageGranularity$depth.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageFormatProperties2KHR properties$flagsAt(long index, int value) { VH_properties$flags.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageFormatProperties2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageFormatProperties2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageFormatProperties2KHR properties$aspectMask(int value) { VH_properties$aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageFormatProperties2KHR properties$imageGranularity$width(int value) { VH_properties$imageGranularity$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageFormatProperties2KHR properties$imageGranularity$height(int value) { VH_properties$imageGranularity$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageFormatProperties2KHR properties$imageGranularity$depth(int value) { VH_properties$imageGranularity$depth.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageFormatProperties2KHR properties$flags(int value) { VH_properties$flags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSparseImageFormatProperties2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSparseImageFormatProperties2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSparseImageFormatProperties2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSparseImageFormatProperties2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _propertiesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_properties, index), LAYOUT_properties); }
    public MemorySegment _properties() { return _propertiesAt(0L); }
    public VkSparseImageFormatProperties2KHR _propertiesAt(long index, MemorySegment src) { _propertiesAt(index).copyFrom(src); return this; }
    public VkSparseImageFormatProperties2KHR _properties(MemorySegment src) { return _propertiesAt(0L, src); }
}
