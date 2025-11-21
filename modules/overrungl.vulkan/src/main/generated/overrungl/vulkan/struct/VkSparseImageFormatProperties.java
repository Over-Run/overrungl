// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSparseImageFormatProperties`.
/// ## Layout
/// ```
/// struct VkSparseImageFormatProperties {
///     VkImageAspectFlags aspectMask;
///     VkExtent3D imageGranularity;
///     VkSparseImageFormatFlags flags;
/// }
/// ```
public final class VkSparseImageFormatProperties extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("imageGranularity"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    public static final long OFFSET_aspectMask = LAYOUT.byteOffset(PathElement.groupElement("aspectMask"));
    public static final long OFFSET_imageGranularity = LAYOUT.byteOffset(PathElement.groupElement("imageGranularity"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_aspectMask = LAYOUT.select(PathElement.groupElement("aspectMask"));
    public static final MemoryLayout LAYOUT_imageGranularity = LAYOUT.select(PathElement.groupElement("imageGranularity"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final VarHandle VH_aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectMask"));
    public static final VarHandle VH_imageGranularity$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageGranularity"), PathElement.groupElement("width"));
    public static final VarHandle VH_imageGranularity$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageGranularity"), PathElement.groupElement("height"));
    public static final VarHandle VH_imageGranularity$depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageGranularity"), PathElement.groupElement("depth"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    public VkSparseImageFormatProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSparseImageFormatProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageFormatProperties(segment, estimateCount(segment, LAYOUT)); }
    public static VkSparseImageFormatProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageFormatProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSparseImageFormatProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageFormatProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSparseImageFormatProperties alloc(SegmentAllocator allocator) { return new VkSparseImageFormatProperties(allocator.allocate(LAYOUT), 1); }
    public static VkSparseImageFormatProperties alloc(SegmentAllocator allocator, long count) { return new VkSparseImageFormatProperties(allocator.allocate(LAYOUT, count), count); }
    public VkSparseImageFormatProperties copyFrom(VkSparseImageFormatProperties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSparseImageFormatProperties reinterpret(long count) { return new VkSparseImageFormatProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSparseImageFormatProperties asSlice(long index) { return new VkSparseImageFormatProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSparseImageFormatProperties asSlice(long index, long count) { return new VkSparseImageFormatProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSparseImageFormatProperties at(long index, Consumer<VkSparseImageFormatProperties> func) { func.accept(asSlice(index)); return this; }
    public int aspectMaskAt(long index) { return (int) VH_aspectMask.get(this.segment(), 0L, index); }
    public int imageGranularity$widthAt(long index) { return (int) VH_imageGranularity$width.get(this.segment(), 0L, index); }
    public int imageGranularity$heightAt(long index) { return (int) VH_imageGranularity$height.get(this.segment(), 0L, index); }
    public int imageGranularity$depthAt(long index) { return (int) VH_imageGranularity$depth.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int aspectMask() { return (int) VH_aspectMask.get(this.segment(), 0L, 0L); }
    public int imageGranularity$width() { return (int) VH_imageGranularity$width.get(this.segment(), 0L, 0L); }
    public int imageGranularity$height() { return (int) VH_imageGranularity$height.get(this.segment(), 0L, 0L); }
    public int imageGranularity$depth() { return (int) VH_imageGranularity$depth.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public VkSparseImageFormatProperties aspectMaskAt(long index, int value) { VH_aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageFormatProperties imageGranularity$widthAt(long index, int value) { VH_imageGranularity$width.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageFormatProperties imageGranularity$heightAt(long index, int value) { VH_imageGranularity$height.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageFormatProperties imageGranularity$depthAt(long index, int value) { VH_imageGranularity$depth.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageFormatProperties flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageFormatProperties aspectMask(int value) { VH_aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageFormatProperties imageGranularity$width(int value) { VH_imageGranularity$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageFormatProperties imageGranularity$height(int value) { VH_imageGranularity$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageFormatProperties imageGranularity$depth(int value) { VH_imageGranularity$depth.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageFormatProperties flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _aspectMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_aspectMask, index), LAYOUT_aspectMask); }
    public MemorySegment _aspectMask() { return _aspectMaskAt(0L); }
    public VkSparseImageFormatProperties _aspectMaskAt(long index, MemorySegment src) { _aspectMaskAt(index).copyFrom(src); return this; }
    public VkSparseImageFormatProperties _aspectMask(MemorySegment src) { return _aspectMaskAt(0L, src); }
    public MemorySegment _imageGranularityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageGranularity, index), LAYOUT_imageGranularity); }
    public MemorySegment _imageGranularity() { return _imageGranularityAt(0L); }
    public VkSparseImageFormatProperties _imageGranularityAt(long index, MemorySegment src) { _imageGranularityAt(index).copyFrom(src); return this; }
    public VkSparseImageFormatProperties _imageGranularity(MemorySegment src) { return _imageGranularityAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkSparseImageFormatProperties _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkSparseImageFormatProperties _flags(MemorySegment src) { return _flagsAt(0L, src); }
}
