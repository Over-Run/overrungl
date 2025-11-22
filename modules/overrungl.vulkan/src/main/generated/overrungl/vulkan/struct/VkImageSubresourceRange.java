// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageSubresourceRange`.
/// ## Layout
/// ```
/// struct VkImageSubresourceRange {
///     VkImageAspectFlags aspectMask;
///     uint32_t baseMipLevel;
///     uint32_t levelCount;
///     uint32_t baseArrayLayer;
///     uint32_t layerCount;
/// }
/// ```
public final class VkImageSubresourceRange extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        ValueLayout.JAVA_INT.withName("baseMipLevel"),
        ValueLayout.JAVA_INT.withName("levelCount"),
        ValueLayout.JAVA_INT.withName("baseArrayLayer"),
        ValueLayout.JAVA_INT.withName("layerCount")
    );
    public static final long OFFSET_aspectMask = LAYOUT.byteOffset(PathElement.groupElement("aspectMask"));
    public static final long OFFSET_baseMipLevel = LAYOUT.byteOffset(PathElement.groupElement("baseMipLevel"));
    public static final long OFFSET_levelCount = LAYOUT.byteOffset(PathElement.groupElement("levelCount"));
    public static final long OFFSET_baseArrayLayer = LAYOUT.byteOffset(PathElement.groupElement("baseArrayLayer"));
    public static final long OFFSET_layerCount = LAYOUT.byteOffset(PathElement.groupElement("layerCount"));
    public static final MemoryLayout LAYOUT_aspectMask = LAYOUT.select(PathElement.groupElement("aspectMask"));
    public static final MemoryLayout LAYOUT_baseMipLevel = LAYOUT.select(PathElement.groupElement("baseMipLevel"));
    public static final MemoryLayout LAYOUT_levelCount = LAYOUT.select(PathElement.groupElement("levelCount"));
    public static final MemoryLayout LAYOUT_baseArrayLayer = LAYOUT.select(PathElement.groupElement("baseArrayLayer"));
    public static final MemoryLayout LAYOUT_layerCount = LAYOUT.select(PathElement.groupElement("layerCount"));
    public static final VarHandle VH_aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectMask"));
    public static final VarHandle VH_baseMipLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseMipLevel"));
    public static final VarHandle VH_levelCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("levelCount"));
    public static final VarHandle VH_baseArrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseArrayLayer"));
    public static final VarHandle VH_layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layerCount"));

    public VkImageSubresourceRange(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageSubresourceRange of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresourceRange(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageSubresourceRange ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresourceRange(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageSubresourceRange ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresourceRange(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageSubresourceRange alloc(SegmentAllocator allocator) { return new VkImageSubresourceRange(allocator.allocate(LAYOUT), 1); }
    public static VkImageSubresourceRange alloc(SegmentAllocator allocator, long count) { return new VkImageSubresourceRange(allocator.allocate(LAYOUT, count), count); }
    public VkImageSubresourceRange copyFrom(VkImageSubresourceRange src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageSubresourceRange reinterpret(long count) { return new VkImageSubresourceRange(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageSubresourceRange asSlice(long index) { return new VkImageSubresourceRange(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageSubresourceRange asSlice(long index, long count) { return new VkImageSubresourceRange(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageSubresourceRange at(long index, Consumer<VkImageSubresourceRange> func) { func.accept(asSlice(index)); return this; }
    public int aspectMaskAt(long index) { return (int) VH_aspectMask.get(this.segment(), 0L, index); }
    public int baseMipLevelAt(long index) { return (int) VH_baseMipLevel.get(this.segment(), 0L, index); }
    public int levelCountAt(long index) { return (int) VH_levelCount.get(this.segment(), 0L, index); }
    public int baseArrayLayerAt(long index) { return (int) VH_baseArrayLayer.get(this.segment(), 0L, index); }
    public int layerCountAt(long index) { return (int) VH_layerCount.get(this.segment(), 0L, index); }
    public int aspectMask() { return (int) VH_aspectMask.get(this.segment(), 0L, 0L); }
    public int baseMipLevel() { return (int) VH_baseMipLevel.get(this.segment(), 0L, 0L); }
    public int levelCount() { return (int) VH_levelCount.get(this.segment(), 0L, 0L); }
    public int baseArrayLayer() { return (int) VH_baseArrayLayer.get(this.segment(), 0L, 0L); }
    public int layerCount() { return (int) VH_layerCount.get(this.segment(), 0L, 0L); }
    public VkImageSubresourceRange aspectMaskAt(long index, int value) { VH_aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkImageSubresourceRange baseMipLevelAt(long index, int value) { VH_baseMipLevel.set(this.segment(), 0L, index, value); return this; }
    public VkImageSubresourceRange levelCountAt(long index, int value) { VH_levelCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageSubresourceRange baseArrayLayerAt(long index, int value) { VH_baseArrayLayer.set(this.segment(), 0L, index, value); return this; }
    public VkImageSubresourceRange layerCountAt(long index, int value) { VH_layerCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageSubresourceRange aspectMask(int value) { VH_aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageSubresourceRange baseMipLevel(int value) { VH_baseMipLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageSubresourceRange levelCount(int value) { VH_levelCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageSubresourceRange baseArrayLayer(int value) { VH_baseArrayLayer.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageSubresourceRange layerCount(int value) { VH_layerCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _aspectMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_aspectMask, index), LAYOUT_aspectMask); }
    public MemorySegment _aspectMask() { return _aspectMaskAt(0L); }
    public VkImageSubresourceRange _aspectMaskAt(long index, MemorySegment src) { _aspectMaskAt(index).copyFrom(src); return this; }
    public VkImageSubresourceRange _aspectMask(MemorySegment src) { return _aspectMaskAt(0L, src); }
    public MemorySegment _baseMipLevelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_baseMipLevel, index), LAYOUT_baseMipLevel); }
    public MemorySegment _baseMipLevel() { return _baseMipLevelAt(0L); }
    public VkImageSubresourceRange _baseMipLevelAt(long index, MemorySegment src) { _baseMipLevelAt(index).copyFrom(src); return this; }
    public VkImageSubresourceRange _baseMipLevel(MemorySegment src) { return _baseMipLevelAt(0L, src); }
    public MemorySegment _levelCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_levelCount, index), LAYOUT_levelCount); }
    public MemorySegment _levelCount() { return _levelCountAt(0L); }
    public VkImageSubresourceRange _levelCountAt(long index, MemorySegment src) { _levelCountAt(index).copyFrom(src); return this; }
    public VkImageSubresourceRange _levelCount(MemorySegment src) { return _levelCountAt(0L, src); }
    public MemorySegment _baseArrayLayerAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_baseArrayLayer, index), LAYOUT_baseArrayLayer); }
    public MemorySegment _baseArrayLayer() { return _baseArrayLayerAt(0L); }
    public VkImageSubresourceRange _baseArrayLayerAt(long index, MemorySegment src) { _baseArrayLayerAt(index).copyFrom(src); return this; }
    public VkImageSubresourceRange _baseArrayLayer(MemorySegment src) { return _baseArrayLayerAt(0L, src); }
    public MemorySegment _layerCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layerCount, index), LAYOUT_layerCount); }
    public MemorySegment _layerCount() { return _layerCountAt(0L); }
    public VkImageSubresourceRange _layerCountAt(long index, MemorySegment src) { _layerCountAt(index).copyFrom(src); return this; }
    public VkImageSubresourceRange _layerCount(MemorySegment src) { return _layerCountAt(0L, src); }
}
