// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageFormatProperties`.
/// ## Layout
/// ```
/// struct VkImageFormatProperties {
///     VkExtent3D maxExtent;
///     uint32_t maxMipLevels;
///     uint32_t maxArrayLayers;
///     VkSampleCountFlags sampleCounts;
///     VkDeviceSize maxResourceSize;
/// }
/// ```
public final class VkImageFormatProperties extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("maxExtent"),
        ValueLayout.JAVA_INT.withName("maxMipLevels"),
        ValueLayout.JAVA_INT.withName("maxArrayLayers"),
        ValueLayout.JAVA_INT.withName("sampleCounts"),
        ValueLayout.JAVA_LONG.withName("maxResourceSize")
    );
    public static final long OFFSET_maxExtent = LAYOUT.byteOffset(PathElement.groupElement("maxExtent"));
    public static final long OFFSET_maxMipLevels = LAYOUT.byteOffset(PathElement.groupElement("maxMipLevels"));
    public static final long OFFSET_maxArrayLayers = LAYOUT.byteOffset(PathElement.groupElement("maxArrayLayers"));
    public static final long OFFSET_sampleCounts = LAYOUT.byteOffset(PathElement.groupElement("sampleCounts"));
    public static final long OFFSET_maxResourceSize = LAYOUT.byteOffset(PathElement.groupElement("maxResourceSize"));
    public static final MemoryLayout LAYOUT_maxExtent = LAYOUT.select(PathElement.groupElement("maxExtent"));
    public static final MemoryLayout LAYOUT_maxMipLevels = LAYOUT.select(PathElement.groupElement("maxMipLevels"));
    public static final MemoryLayout LAYOUT_maxArrayLayers = LAYOUT.select(PathElement.groupElement("maxArrayLayers"));
    public static final MemoryLayout LAYOUT_sampleCounts = LAYOUT.select(PathElement.groupElement("sampleCounts"));
    public static final MemoryLayout LAYOUT_maxResourceSize = LAYOUT.select(PathElement.groupElement("maxResourceSize"));
    public static final VarHandle VH_maxExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_maxExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_maxExtent$depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExtent"), PathElement.groupElement("depth"));
    public static final VarHandle VH_maxMipLevels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMipLevels"));
    public static final VarHandle VH_maxArrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxArrayLayers"));
    public static final VarHandle VH_sampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleCounts"));
    public static final VarHandle VH_maxResourceSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxResourceSize"));

    public VkImageFormatProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageFormatProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageFormatProperties(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageFormatProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageFormatProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageFormatProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageFormatProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageFormatProperties alloc(SegmentAllocator allocator) { return new VkImageFormatProperties(allocator.allocate(LAYOUT), 1); }
    public static VkImageFormatProperties alloc(SegmentAllocator allocator, long count) { return new VkImageFormatProperties(allocator.allocate(LAYOUT, count), count); }
    public VkImageFormatProperties copyFrom(VkImageFormatProperties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageFormatProperties reinterpret(long count) { return new VkImageFormatProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageFormatProperties asSlice(long index) { return new VkImageFormatProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageFormatProperties asSlice(long index, long count) { return new VkImageFormatProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageFormatProperties at(long index, Consumer<VkImageFormatProperties> func) { func.accept(asSlice(index)); return this; }
    public int maxExtent$widthAt(long index) { return (int) VH_maxExtent$width.get(this.segment(), 0L, index); }
    public int maxExtent$heightAt(long index) { return (int) VH_maxExtent$height.get(this.segment(), 0L, index); }
    public int maxExtent$depthAt(long index) { return (int) VH_maxExtent$depth.get(this.segment(), 0L, index); }
    public int maxMipLevelsAt(long index) { return (int) VH_maxMipLevels.get(this.segment(), 0L, index); }
    public int maxArrayLayersAt(long index) { return (int) VH_maxArrayLayers.get(this.segment(), 0L, index); }
    public int sampleCountsAt(long index) { return (int) VH_sampleCounts.get(this.segment(), 0L, index); }
    public long maxResourceSizeAt(long index) { return (long) VH_maxResourceSize.get(this.segment(), 0L, index); }
    public int maxExtent$width() { return (int) VH_maxExtent$width.get(this.segment(), 0L, 0L); }
    public int maxExtent$height() { return (int) VH_maxExtent$height.get(this.segment(), 0L, 0L); }
    public int maxExtent$depth() { return (int) VH_maxExtent$depth.get(this.segment(), 0L, 0L); }
    public int maxMipLevels() { return (int) VH_maxMipLevels.get(this.segment(), 0L, 0L); }
    public int maxArrayLayers() { return (int) VH_maxArrayLayers.get(this.segment(), 0L, 0L); }
    public int sampleCounts() { return (int) VH_sampleCounts.get(this.segment(), 0L, 0L); }
    public long maxResourceSize() { return (long) VH_maxResourceSize.get(this.segment(), 0L, 0L); }
    public VkImageFormatProperties maxExtent$widthAt(long index, int value) { VH_maxExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatProperties maxExtent$heightAt(long index, int value) { VH_maxExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatProperties maxExtent$depthAt(long index, int value) { VH_maxExtent$depth.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatProperties maxMipLevelsAt(long index, int value) { VH_maxMipLevels.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatProperties maxArrayLayersAt(long index, int value) { VH_maxArrayLayers.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatProperties sampleCountsAt(long index, int value) { VH_sampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatProperties maxResourceSizeAt(long index, long value) { VH_maxResourceSize.set(this.segment(), 0L, index, value); return this; }
    public VkImageFormatProperties maxExtent$width(int value) { VH_maxExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatProperties maxExtent$height(int value) { VH_maxExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatProperties maxExtent$depth(int value) { VH_maxExtent$depth.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatProperties maxMipLevels(int value) { VH_maxMipLevels.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatProperties maxArrayLayers(int value) { VH_maxArrayLayers.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatProperties sampleCounts(int value) { VH_sampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageFormatProperties maxResourceSize(long value) { VH_maxResourceSize.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _maxExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxExtent, index), LAYOUT_maxExtent); }
    public MemorySegment _maxExtent() { return _maxExtentAt(0L); }
    public VkImageFormatProperties _maxExtentAt(long index, MemorySegment src) { _maxExtentAt(index).copyFrom(src); return this; }
    public VkImageFormatProperties _maxExtent(MemorySegment src) { return _maxExtentAt(0L, src); }
    public MemorySegment _maxMipLevelsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMipLevels, index), LAYOUT_maxMipLevels); }
    public MemorySegment _maxMipLevels() { return _maxMipLevelsAt(0L); }
    public VkImageFormatProperties _maxMipLevelsAt(long index, MemorySegment src) { _maxMipLevelsAt(index).copyFrom(src); return this; }
    public VkImageFormatProperties _maxMipLevels(MemorySegment src) { return _maxMipLevelsAt(0L, src); }
    public MemorySegment _maxArrayLayersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxArrayLayers, index), LAYOUT_maxArrayLayers); }
    public MemorySegment _maxArrayLayers() { return _maxArrayLayersAt(0L); }
    public VkImageFormatProperties _maxArrayLayersAt(long index, MemorySegment src) { _maxArrayLayersAt(index).copyFrom(src); return this; }
    public VkImageFormatProperties _maxArrayLayers(MemorySegment src) { return _maxArrayLayersAt(0L, src); }
    public MemorySegment _sampleCountsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampleCounts, index), LAYOUT_sampleCounts); }
    public MemorySegment _sampleCounts() { return _sampleCountsAt(0L); }
    public VkImageFormatProperties _sampleCountsAt(long index, MemorySegment src) { _sampleCountsAt(index).copyFrom(src); return this; }
    public VkImageFormatProperties _sampleCounts(MemorySegment src) { return _sampleCountsAt(0L, src); }
    public MemorySegment _maxResourceSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxResourceSize, index), LAYOUT_maxResourceSize); }
    public MemorySegment _maxResourceSize() { return _maxResourceSizeAt(0L); }
    public VkImageFormatProperties _maxResourceSizeAt(long index, MemorySegment src) { _maxResourceSizeAt(index).copyFrom(src); return this; }
    public VkImageFormatProperties _maxResourceSize(MemorySegment src) { return _maxResourceSizeAt(0L, src); }
}
