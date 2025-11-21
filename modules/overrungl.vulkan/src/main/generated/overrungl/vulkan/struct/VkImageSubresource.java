// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageSubresource`.
/// ## Layout
/// ```
/// struct VkImageSubresource {
///     VkImageAspectFlags aspectMask;
///     uint32_t mipLevel;
///     uint32_t arrayLayer;
/// }
/// ```
public final class VkImageSubresource extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        ValueLayout.JAVA_INT.withName("mipLevel"),
        ValueLayout.JAVA_INT.withName("arrayLayer")
    );
    public static final long OFFSET_aspectMask = LAYOUT.byteOffset(PathElement.groupElement("aspectMask"));
    public static final long OFFSET_mipLevel = LAYOUT.byteOffset(PathElement.groupElement("mipLevel"));
    public static final long OFFSET_arrayLayer = LAYOUT.byteOffset(PathElement.groupElement("arrayLayer"));
    public static final MemoryLayout LAYOUT_aspectMask = LAYOUT.select(PathElement.groupElement("aspectMask"));
    public static final MemoryLayout LAYOUT_mipLevel = LAYOUT.select(PathElement.groupElement("mipLevel"));
    public static final MemoryLayout LAYOUT_arrayLayer = LAYOUT.select(PathElement.groupElement("arrayLayer"));
    public static final VarHandle VH_aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectMask"));
    public static final VarHandle VH_mipLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mipLevel"));
    public static final VarHandle VH_arrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("arrayLayer"));

    public VkImageSubresource(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageSubresource of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresource(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageSubresource ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresource(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageSubresource ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresource(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageSubresource alloc(SegmentAllocator allocator) { return new VkImageSubresource(allocator.allocate(LAYOUT), 1); }
    public static VkImageSubresource alloc(SegmentAllocator allocator, long count) { return new VkImageSubresource(allocator.allocate(LAYOUT, count), count); }
    public VkImageSubresource copyFrom(VkImageSubresource src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageSubresource reinterpret(long count) { return new VkImageSubresource(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageSubresource asSlice(long index) { return new VkImageSubresource(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageSubresource asSlice(long index, long count) { return new VkImageSubresource(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageSubresource at(long index, Consumer<VkImageSubresource> func) { func.accept(asSlice(index)); return this; }
    public int aspectMaskAt(long index) { return (int) VH_aspectMask.get(this.segment(), 0L, index); }
    public int mipLevelAt(long index) { return (int) VH_mipLevel.get(this.segment(), 0L, index); }
    public int arrayLayerAt(long index) { return (int) VH_arrayLayer.get(this.segment(), 0L, index); }
    public int aspectMask() { return (int) VH_aspectMask.get(this.segment(), 0L, 0L); }
    public int mipLevel() { return (int) VH_mipLevel.get(this.segment(), 0L, 0L); }
    public int arrayLayer() { return (int) VH_arrayLayer.get(this.segment(), 0L, 0L); }
    public VkImageSubresource aspectMaskAt(long index, int value) { VH_aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkImageSubresource mipLevelAt(long index, int value) { VH_mipLevel.set(this.segment(), 0L, index, value); return this; }
    public VkImageSubresource arrayLayerAt(long index, int value) { VH_arrayLayer.set(this.segment(), 0L, index, value); return this; }
    public VkImageSubresource aspectMask(int value) { VH_aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageSubresource mipLevel(int value) { VH_mipLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageSubresource arrayLayer(int value) { VH_arrayLayer.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _aspectMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_aspectMask, index), LAYOUT_aspectMask); }
    public MemorySegment _aspectMask() { return _aspectMaskAt(0L); }
    public VkImageSubresource _aspectMaskAt(long index, MemorySegment src) { _aspectMaskAt(index).copyFrom(src); return this; }
    public VkImageSubresource _aspectMask(MemorySegment src) { return _aspectMaskAt(0L, src); }
    public MemorySegment _mipLevelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mipLevel, index), LAYOUT_mipLevel); }
    public MemorySegment _mipLevel() { return _mipLevelAt(0L); }
    public VkImageSubresource _mipLevelAt(long index, MemorySegment src) { _mipLevelAt(index).copyFrom(src); return this; }
    public VkImageSubresource _mipLevel(MemorySegment src) { return _mipLevelAt(0L, src); }
    public MemorySegment _arrayLayerAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_arrayLayer, index), LAYOUT_arrayLayer); }
    public MemorySegment _arrayLayer() { return _arrayLayerAt(0L); }
    public VkImageSubresource _arrayLayerAt(long index, MemorySegment src) { _arrayLayerAt(index).copyFrom(src); return this; }
    public VkImageSubresource _arrayLayer(MemorySegment src) { return _arrayLayerAt(0L, src); }
}
