// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSparseImageMemoryRequirements`.
/// ## Layout
/// ```
/// struct VkSparseImageMemoryRequirements {
///     VkSparseImageFormatProperties formatProperties;
///     uint32_t imageMipTailFirstLod;
///     VkDeviceSize imageMipTailSize;
///     VkDeviceSize imageMipTailOffset;
///     VkDeviceSize imageMipTailStride;
/// }
/// ```
public final class VkSparseImageMemoryRequirements extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkSparseImageFormatProperties.LAYOUT.withName("formatProperties"),
        ValueLayout.JAVA_INT.withName("imageMipTailFirstLod"),
        ValueLayout.JAVA_LONG.withName("imageMipTailSize"),
        ValueLayout.JAVA_LONG.withName("imageMipTailOffset"),
        ValueLayout.JAVA_LONG.withName("imageMipTailStride")
    );
    public static final long OFFSET_formatProperties = LAYOUT.byteOffset(PathElement.groupElement("formatProperties"));
    public static final long OFFSET_imageMipTailFirstLod = LAYOUT.byteOffset(PathElement.groupElement("imageMipTailFirstLod"));
    public static final long OFFSET_imageMipTailSize = LAYOUT.byteOffset(PathElement.groupElement("imageMipTailSize"));
    public static final long OFFSET_imageMipTailOffset = LAYOUT.byteOffset(PathElement.groupElement("imageMipTailOffset"));
    public static final long OFFSET_imageMipTailStride = LAYOUT.byteOffset(PathElement.groupElement("imageMipTailStride"));
    public static final MemoryLayout LAYOUT_formatProperties = LAYOUT.select(PathElement.groupElement("formatProperties"));
    public static final MemoryLayout LAYOUT_imageMipTailFirstLod = LAYOUT.select(PathElement.groupElement("imageMipTailFirstLod"));
    public static final MemoryLayout LAYOUT_imageMipTailSize = LAYOUT.select(PathElement.groupElement("imageMipTailSize"));
    public static final MemoryLayout LAYOUT_imageMipTailOffset = LAYOUT.select(PathElement.groupElement("imageMipTailOffset"));
    public static final MemoryLayout LAYOUT_imageMipTailStride = LAYOUT.select(PathElement.groupElement("imageMipTailStride"));
    public static final VarHandle VH_formatProperties$aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatProperties"), PathElement.groupElement("aspectMask"));
    public static final VarHandle VH_formatProperties$imageGranularity$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatProperties"), PathElement.groupElement("imageGranularity"), PathElement.groupElement("width"));
    public static final VarHandle VH_formatProperties$imageGranularity$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatProperties"), PathElement.groupElement("imageGranularity"), PathElement.groupElement("height"));
    public static final VarHandle VH_formatProperties$imageGranularity$depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatProperties"), PathElement.groupElement("imageGranularity"), PathElement.groupElement("depth"));
    public static final VarHandle VH_formatProperties$flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatProperties"), PathElement.groupElement("flags"));
    public static final VarHandle VH_imageMipTailFirstLod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageMipTailFirstLod"));
    public static final VarHandle VH_imageMipTailSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageMipTailSize"));
    public static final VarHandle VH_imageMipTailOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageMipTailOffset"));
    public static final VarHandle VH_imageMipTailStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageMipTailStride"));

    public VkSparseImageMemoryRequirements(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSparseImageMemoryRequirements of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageMemoryRequirements(segment, estimateCount(segment, LAYOUT)); }
    public static VkSparseImageMemoryRequirements ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageMemoryRequirements(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSparseImageMemoryRequirements ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageMemoryRequirements(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSparseImageMemoryRequirements alloc(SegmentAllocator allocator) { return new VkSparseImageMemoryRequirements(allocator.allocate(LAYOUT), 1); }
    public static VkSparseImageMemoryRequirements alloc(SegmentAllocator allocator, long count) { return new VkSparseImageMemoryRequirements(allocator.allocate(LAYOUT, count), count); }
    public VkSparseImageMemoryRequirements copyFrom(VkSparseImageMemoryRequirements src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSparseImageMemoryRequirements reinterpret(long count) { return new VkSparseImageMemoryRequirements(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSparseImageMemoryRequirements asSlice(long index) { return new VkSparseImageMemoryRequirements(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSparseImageMemoryRequirements asSlice(long index, long count) { return new VkSparseImageMemoryRequirements(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSparseImageMemoryRequirements at(long index, Consumer<VkSparseImageMemoryRequirements> func) { func.accept(asSlice(index)); return this; }
    public int formatProperties$aspectMaskAt(long index) { return (int) VH_formatProperties$aspectMask.get(this.segment(), 0L, index); }
    public int formatProperties$imageGranularity$widthAt(long index) { return (int) VH_formatProperties$imageGranularity$width.get(this.segment(), 0L, index); }
    public int formatProperties$imageGranularity$heightAt(long index) { return (int) VH_formatProperties$imageGranularity$height.get(this.segment(), 0L, index); }
    public int formatProperties$imageGranularity$depthAt(long index) { return (int) VH_formatProperties$imageGranularity$depth.get(this.segment(), 0L, index); }
    public int formatProperties$flagsAt(long index) { return (int) VH_formatProperties$flags.get(this.segment(), 0L, index); }
    public int imageMipTailFirstLodAt(long index) { return (int) VH_imageMipTailFirstLod.get(this.segment(), 0L, index); }
    public long imageMipTailSizeAt(long index) { return (long) VH_imageMipTailSize.get(this.segment(), 0L, index); }
    public long imageMipTailOffsetAt(long index) { return (long) VH_imageMipTailOffset.get(this.segment(), 0L, index); }
    public long imageMipTailStrideAt(long index) { return (long) VH_imageMipTailStride.get(this.segment(), 0L, index); }
    public int formatProperties$aspectMask() { return (int) VH_formatProperties$aspectMask.get(this.segment(), 0L, 0L); }
    public int formatProperties$imageGranularity$width() { return (int) VH_formatProperties$imageGranularity$width.get(this.segment(), 0L, 0L); }
    public int formatProperties$imageGranularity$height() { return (int) VH_formatProperties$imageGranularity$height.get(this.segment(), 0L, 0L); }
    public int formatProperties$imageGranularity$depth() { return (int) VH_formatProperties$imageGranularity$depth.get(this.segment(), 0L, 0L); }
    public int formatProperties$flags() { return (int) VH_formatProperties$flags.get(this.segment(), 0L, 0L); }
    public int imageMipTailFirstLod() { return (int) VH_imageMipTailFirstLod.get(this.segment(), 0L, 0L); }
    public long imageMipTailSize() { return (long) VH_imageMipTailSize.get(this.segment(), 0L, 0L); }
    public long imageMipTailOffset() { return (long) VH_imageMipTailOffset.get(this.segment(), 0L, 0L); }
    public long imageMipTailStride() { return (long) VH_imageMipTailStride.get(this.segment(), 0L, 0L); }
    public VkSparseImageMemoryRequirements formatProperties$aspectMaskAt(long index, int value) { VH_formatProperties$aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryRequirements formatProperties$imageGranularity$widthAt(long index, int value) { VH_formatProperties$imageGranularity$width.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryRequirements formatProperties$imageGranularity$heightAt(long index, int value) { VH_formatProperties$imageGranularity$height.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryRequirements formatProperties$imageGranularity$depthAt(long index, int value) { VH_formatProperties$imageGranularity$depth.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryRequirements formatProperties$flagsAt(long index, int value) { VH_formatProperties$flags.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryRequirements imageMipTailFirstLodAt(long index, int value) { VH_imageMipTailFirstLod.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryRequirements imageMipTailSizeAt(long index, long value) { VH_imageMipTailSize.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryRequirements imageMipTailOffsetAt(long index, long value) { VH_imageMipTailOffset.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryRequirements imageMipTailStrideAt(long index, long value) { VH_imageMipTailStride.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryRequirements formatProperties$aspectMask(int value) { VH_formatProperties$aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryRequirements formatProperties$imageGranularity$width(int value) { VH_formatProperties$imageGranularity$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryRequirements formatProperties$imageGranularity$height(int value) { VH_formatProperties$imageGranularity$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryRequirements formatProperties$imageGranularity$depth(int value) { VH_formatProperties$imageGranularity$depth.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryRequirements formatProperties$flags(int value) { VH_formatProperties$flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryRequirements imageMipTailFirstLod(int value) { VH_imageMipTailFirstLod.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryRequirements imageMipTailSize(long value) { VH_imageMipTailSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryRequirements imageMipTailOffset(long value) { VH_imageMipTailOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryRequirements imageMipTailStride(long value) { VH_imageMipTailStride.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _formatPropertiesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_formatProperties, index), LAYOUT_formatProperties); }
    public MemorySegment _formatProperties() { return _formatPropertiesAt(0L); }
    public VkSparseImageMemoryRequirements _formatPropertiesAt(long index, MemorySegment src) { _formatPropertiesAt(index).copyFrom(src); return this; }
    public VkSparseImageMemoryRequirements _formatProperties(MemorySegment src) { return _formatPropertiesAt(0L, src); }
    public MemorySegment _imageMipTailFirstLodAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageMipTailFirstLod, index), LAYOUT_imageMipTailFirstLod); }
    public MemorySegment _imageMipTailFirstLod() { return _imageMipTailFirstLodAt(0L); }
    public VkSparseImageMemoryRequirements _imageMipTailFirstLodAt(long index, MemorySegment src) { _imageMipTailFirstLodAt(index).copyFrom(src); return this; }
    public VkSparseImageMemoryRequirements _imageMipTailFirstLod(MemorySegment src) { return _imageMipTailFirstLodAt(0L, src); }
    public MemorySegment _imageMipTailSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageMipTailSize, index), LAYOUT_imageMipTailSize); }
    public MemorySegment _imageMipTailSize() { return _imageMipTailSizeAt(0L); }
    public VkSparseImageMemoryRequirements _imageMipTailSizeAt(long index, MemorySegment src) { _imageMipTailSizeAt(index).copyFrom(src); return this; }
    public VkSparseImageMemoryRequirements _imageMipTailSize(MemorySegment src) { return _imageMipTailSizeAt(0L, src); }
    public MemorySegment _imageMipTailOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageMipTailOffset, index), LAYOUT_imageMipTailOffset); }
    public MemorySegment _imageMipTailOffset() { return _imageMipTailOffsetAt(0L); }
    public VkSparseImageMemoryRequirements _imageMipTailOffsetAt(long index, MemorySegment src) { _imageMipTailOffsetAt(index).copyFrom(src); return this; }
    public VkSparseImageMemoryRequirements _imageMipTailOffset(MemorySegment src) { return _imageMipTailOffsetAt(0L, src); }
    public MemorySegment _imageMipTailStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageMipTailStride, index), LAYOUT_imageMipTailStride); }
    public MemorySegment _imageMipTailStride() { return _imageMipTailStrideAt(0L); }
    public VkSparseImageMemoryRequirements _imageMipTailStrideAt(long index, MemorySegment src) { _imageMipTailStrideAt(index).copyFrom(src); return this; }
    public VkSparseImageMemoryRequirements _imageMipTailStride(MemorySegment src) { return _imageMipTailStrideAt(0L, src); }
}
