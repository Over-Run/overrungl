// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageSubresourceLayers`.
/// ## Layout
/// ```
/// struct VkImageSubresourceLayers {
///     VkImageAspectFlags aspectMask;
///     uint32_t mipLevel;
///     uint32_t baseArrayLayer;
///     uint32_t layerCount;
/// }
/// ```
public final class VkImageSubresourceLayers extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        ValueLayout.JAVA_INT.withName("mipLevel"),
        ValueLayout.JAVA_INT.withName("baseArrayLayer"),
        ValueLayout.JAVA_INT.withName("layerCount")
    );
    public static final long OFFSET_aspectMask = LAYOUT.byteOffset(PathElement.groupElement("aspectMask"));
    public static final long OFFSET_mipLevel = LAYOUT.byteOffset(PathElement.groupElement("mipLevel"));
    public static final long OFFSET_baseArrayLayer = LAYOUT.byteOffset(PathElement.groupElement("baseArrayLayer"));
    public static final long OFFSET_layerCount = LAYOUT.byteOffset(PathElement.groupElement("layerCount"));
    public static final MemoryLayout LAYOUT_aspectMask = LAYOUT.select(PathElement.groupElement("aspectMask"));
    public static final MemoryLayout LAYOUT_mipLevel = LAYOUT.select(PathElement.groupElement("mipLevel"));
    public static final MemoryLayout LAYOUT_baseArrayLayer = LAYOUT.select(PathElement.groupElement("baseArrayLayer"));
    public static final MemoryLayout LAYOUT_layerCount = LAYOUT.select(PathElement.groupElement("layerCount"));
    public static final VarHandle VH_aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectMask"));
    public static final VarHandle VH_mipLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mipLevel"));
    public static final VarHandle VH_baseArrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseArrayLayer"));
    public static final VarHandle VH_layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layerCount"));

    public VkImageSubresourceLayers(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageSubresourceLayers of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresourceLayers(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageSubresourceLayers ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresourceLayers(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageSubresourceLayers ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresourceLayers(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageSubresourceLayers alloc(SegmentAllocator allocator) { return new VkImageSubresourceLayers(allocator.allocate(LAYOUT), 1); }
    public static VkImageSubresourceLayers alloc(SegmentAllocator allocator, long count) { return new VkImageSubresourceLayers(allocator.allocate(LAYOUT, count), count); }
    public VkImageSubresourceLayers copyFrom(VkImageSubresourceLayers src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageSubresourceLayers reinterpret(long count) { return new VkImageSubresourceLayers(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageSubresourceLayers asSlice(long index) { return new VkImageSubresourceLayers(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageSubresourceLayers asSlice(long index, long count) { return new VkImageSubresourceLayers(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageSubresourceLayers at(long index, Consumer<VkImageSubresourceLayers> func) { func.accept(asSlice(index)); return this; }
    public int aspectMaskAt(long index) { return (int) VH_aspectMask.get(this.segment(), 0L, index); }
    public int mipLevelAt(long index) { return (int) VH_mipLevel.get(this.segment(), 0L, index); }
    public int baseArrayLayerAt(long index) { return (int) VH_baseArrayLayer.get(this.segment(), 0L, index); }
    public int layerCountAt(long index) { return (int) VH_layerCount.get(this.segment(), 0L, index); }
    public int aspectMask() { return (int) VH_aspectMask.get(this.segment(), 0L, 0L); }
    public int mipLevel() { return (int) VH_mipLevel.get(this.segment(), 0L, 0L); }
    public int baseArrayLayer() { return (int) VH_baseArrayLayer.get(this.segment(), 0L, 0L); }
    public int layerCount() { return (int) VH_layerCount.get(this.segment(), 0L, 0L); }
    public VkImageSubresourceLayers aspectMaskAt(long index, int value) { VH_aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkImageSubresourceLayers mipLevelAt(long index, int value) { VH_mipLevel.set(this.segment(), 0L, index, value); return this; }
    public VkImageSubresourceLayers baseArrayLayerAt(long index, int value) { VH_baseArrayLayer.set(this.segment(), 0L, index, value); return this; }
    public VkImageSubresourceLayers layerCountAt(long index, int value) { VH_layerCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageSubresourceLayers aspectMask(int value) { VH_aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageSubresourceLayers mipLevel(int value) { VH_mipLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageSubresourceLayers baseArrayLayer(int value) { VH_baseArrayLayer.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageSubresourceLayers layerCount(int value) { VH_layerCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _aspectMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_aspectMask, index), LAYOUT_aspectMask); }
    public MemorySegment _aspectMask() { return _aspectMaskAt(0L); }
    public VkImageSubresourceLayers _aspectMaskAt(long index, MemorySegment src) { _aspectMaskAt(index).copyFrom(src); return this; }
    public VkImageSubresourceLayers _aspectMask(MemorySegment src) { return _aspectMaskAt(0L, src); }
    public MemorySegment _mipLevelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mipLevel, index), LAYOUT_mipLevel); }
    public MemorySegment _mipLevel() { return _mipLevelAt(0L); }
    public VkImageSubresourceLayers _mipLevelAt(long index, MemorySegment src) { _mipLevelAt(index).copyFrom(src); return this; }
    public VkImageSubresourceLayers _mipLevel(MemorySegment src) { return _mipLevelAt(0L, src); }
    public MemorySegment _baseArrayLayerAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_baseArrayLayer, index), LAYOUT_baseArrayLayer); }
    public MemorySegment _baseArrayLayer() { return _baseArrayLayerAt(0L); }
    public VkImageSubresourceLayers _baseArrayLayerAt(long index, MemorySegment src) { _baseArrayLayerAt(index).copyFrom(src); return this; }
    public VkImageSubresourceLayers _baseArrayLayer(MemorySegment src) { return _baseArrayLayerAt(0L, src); }
    public MemorySegment _layerCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layerCount, index), LAYOUT_layerCount); }
    public MemorySegment _layerCount() { return _layerCountAt(0L); }
    public VkImageSubresourceLayers _layerCountAt(long index, MemorySegment src) { _layerCountAt(index).copyFrom(src); return this; }
    public VkImageSubresourceLayers _layerCount(MemorySegment src) { return _layerCountAt(0L, src); }
}
