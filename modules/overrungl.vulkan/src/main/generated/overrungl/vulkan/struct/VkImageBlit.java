// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageBlit`.
/// ## Layout
/// ```
/// struct VkImageBlit {
///     VkImageSubresourceLayers srcSubresource;
///     VkOffset3D srcOffsets[2];
///     VkImageSubresourceLayers dstSubresource;
///     VkOffset3D dstOffsets[2];
/// }
/// ```
public final class VkImageBlit extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("srcSubresource"),
        MemoryLayout.sequenceLayout(2, overrungl.vulkan.struct.VkOffset3D.LAYOUT).withName("srcOffsets"),
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("dstSubresource"),
        MemoryLayout.sequenceLayout(2, overrungl.vulkan.struct.VkOffset3D.LAYOUT).withName("dstOffsets")
    );
    public static final long OFFSET_srcSubresource = LAYOUT.byteOffset(PathElement.groupElement("srcSubresource"));
    public static final long OFFSET_srcOffsets = LAYOUT.byteOffset(PathElement.groupElement("srcOffsets"));
    public static final long OFFSET_dstSubresource = LAYOUT.byteOffset(PathElement.groupElement("dstSubresource"));
    public static final long OFFSET_dstOffsets = LAYOUT.byteOffset(PathElement.groupElement("dstOffsets"));
    public static final MemoryLayout LAYOUT_srcSubresource = LAYOUT.select(PathElement.groupElement("srcSubresource"));
    public static final MemoryLayout LAYOUT_srcOffsets = LAYOUT.select(PathElement.groupElement("srcOffsets"));
    public static final MemoryLayout LAYOUT_dstSubresource = LAYOUT.select(PathElement.groupElement("dstSubresource"));
    public static final MemoryLayout LAYOUT_dstOffsets = LAYOUT.select(PathElement.groupElement("dstOffsets"));
    public static final VarHandle VH_srcSubresource$aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcSubresource"), PathElement.groupElement("aspectMask"));
    public static final VarHandle VH_srcSubresource$mipLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcSubresource"), PathElement.groupElement("mipLevel"));
    public static final VarHandle VH_srcSubresource$baseArrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcSubresource"), PathElement.groupElement("baseArrayLayer"));
    public static final VarHandle VH_srcSubresource$layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcSubresource"), PathElement.groupElement("layerCount"));
    public static final VarHandle VH_srcOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcOffsets"), PathElement.sequenceElement());
    public static final VarHandle VH_dstSubresource$aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstSubresource"), PathElement.groupElement("aspectMask"));
    public static final VarHandle VH_dstSubresource$mipLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstSubresource"), PathElement.groupElement("mipLevel"));
    public static final VarHandle VH_dstSubresource$baseArrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstSubresource"), PathElement.groupElement("baseArrayLayer"));
    public static final VarHandle VH_dstSubresource$layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstSubresource"), PathElement.groupElement("layerCount"));
    public static final VarHandle VH_dstOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstOffsets"), PathElement.sequenceElement());

    public VkImageBlit(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageBlit of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageBlit(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageBlit ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageBlit(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageBlit ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageBlit(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageBlit alloc(SegmentAllocator allocator) { return new VkImageBlit(allocator.allocate(LAYOUT), 1); }
    public static VkImageBlit alloc(SegmentAllocator allocator, long count) { return new VkImageBlit(allocator.allocate(LAYOUT, count), count); }
    public VkImageBlit copyFrom(VkImageBlit src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageBlit reinterpret(long count) { return new VkImageBlit(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageBlit asSlice(long index) { return new VkImageBlit(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageBlit asSlice(long index, long count) { return new VkImageBlit(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageBlit at(long index, Consumer<VkImageBlit> func) { func.accept(asSlice(index)); return this; }
    public int srcSubresource$aspectMaskAt(long index) { return (int) VH_srcSubresource$aspectMask.get(this.segment(), 0L, index); }
    public int srcSubresource$mipLevelAt(long index) { return (int) VH_srcSubresource$mipLevel.get(this.segment(), 0L, index); }
    public int srcSubresource$baseArrayLayerAt(long index) { return (int) VH_srcSubresource$baseArrayLayer.get(this.segment(), 0L, index); }
    public int srcSubresource$layerCountAt(long index) { return (int) VH_srcSubresource$layerCount.get(this.segment(), 0L, index); }
    public MemorySegment srcOffsetsAt(long index, long index0) { return (MemorySegment) VH_srcOffsets.get(this.segment(), 0L, index, index0); }
    public int dstSubresource$aspectMaskAt(long index) { return (int) VH_dstSubresource$aspectMask.get(this.segment(), 0L, index); }
    public int dstSubresource$mipLevelAt(long index) { return (int) VH_dstSubresource$mipLevel.get(this.segment(), 0L, index); }
    public int dstSubresource$baseArrayLayerAt(long index) { return (int) VH_dstSubresource$baseArrayLayer.get(this.segment(), 0L, index); }
    public int dstSubresource$layerCountAt(long index) { return (int) VH_dstSubresource$layerCount.get(this.segment(), 0L, index); }
    public MemorySegment dstOffsetsAt(long index, long index0) { return (MemorySegment) VH_dstOffsets.get(this.segment(), 0L, index, index0); }
    public int srcSubresource$aspectMask() { return (int) VH_srcSubresource$aspectMask.get(this.segment(), 0L, 0L); }
    public int srcSubresource$mipLevel() { return (int) VH_srcSubresource$mipLevel.get(this.segment(), 0L, 0L); }
    public int srcSubresource$baseArrayLayer() { return (int) VH_srcSubresource$baseArrayLayer.get(this.segment(), 0L, 0L); }
    public int srcSubresource$layerCount() { return (int) VH_srcSubresource$layerCount.get(this.segment(), 0L, 0L); }
    public MemorySegment srcOffsets(long index0) { return (MemorySegment) VH_srcOffsets.get(this.segment(), 0L, 0L, index0); }
    public int dstSubresource$aspectMask() { return (int) VH_dstSubresource$aspectMask.get(this.segment(), 0L, 0L); }
    public int dstSubresource$mipLevel() { return (int) VH_dstSubresource$mipLevel.get(this.segment(), 0L, 0L); }
    public int dstSubresource$baseArrayLayer() { return (int) VH_dstSubresource$baseArrayLayer.get(this.segment(), 0L, 0L); }
    public int dstSubresource$layerCount() { return (int) VH_dstSubresource$layerCount.get(this.segment(), 0L, 0L); }
    public MemorySegment dstOffsets(long index0) { return (MemorySegment) VH_dstOffsets.get(this.segment(), 0L, 0L, index0); }
    public VkImageBlit srcSubresource$aspectMaskAt(long index, int value) { VH_srcSubresource$aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkImageBlit srcSubresource$mipLevelAt(long index, int value) { VH_srcSubresource$mipLevel.set(this.segment(), 0L, index, value); return this; }
    public VkImageBlit srcSubresource$baseArrayLayerAt(long index, int value) { VH_srcSubresource$baseArrayLayer.set(this.segment(), 0L, index, value); return this; }
    public VkImageBlit srcSubresource$layerCountAt(long index, int value) { VH_srcSubresource$layerCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageBlit srcOffsetsAt(long index, long index0, MemorySegment value) { VH_srcOffsets.set(this.segment(), 0L, index, index0, value); return this; }
    public VkImageBlit dstSubresource$aspectMaskAt(long index, int value) { VH_dstSubresource$aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkImageBlit dstSubresource$mipLevelAt(long index, int value) { VH_dstSubresource$mipLevel.set(this.segment(), 0L, index, value); return this; }
    public VkImageBlit dstSubresource$baseArrayLayerAt(long index, int value) { VH_dstSubresource$baseArrayLayer.set(this.segment(), 0L, index, value); return this; }
    public VkImageBlit dstSubresource$layerCountAt(long index, int value) { VH_dstSubresource$layerCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageBlit dstOffsetsAt(long index, long index0, MemorySegment value) { VH_dstOffsets.set(this.segment(), 0L, index, index0, value); return this; }
    public VkImageBlit srcSubresource$aspectMask(int value) { VH_srcSubresource$aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageBlit srcSubresource$mipLevel(int value) { VH_srcSubresource$mipLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageBlit srcSubresource$baseArrayLayer(int value) { VH_srcSubresource$baseArrayLayer.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageBlit srcSubresource$layerCount(int value) { VH_srcSubresource$layerCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageBlit srcOffsets(long index0, MemorySegment value) { VH_srcOffsets.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkImageBlit dstSubresource$aspectMask(int value) { VH_dstSubresource$aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageBlit dstSubresource$mipLevel(int value) { VH_dstSubresource$mipLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageBlit dstSubresource$baseArrayLayer(int value) { VH_dstSubresource$baseArrayLayer.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageBlit dstSubresource$layerCount(int value) { VH_dstSubresource$layerCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageBlit dstOffsets(long index0, MemorySegment value) { VH_dstOffsets.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _srcSubresourceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcSubresource, index), LAYOUT_srcSubresource); }
    public MemorySegment _srcSubresource() { return _srcSubresourceAt(0L); }
    public VkImageBlit _srcSubresourceAt(long index, MemorySegment src) { _srcSubresourceAt(index).copyFrom(src); return this; }
    public VkImageBlit _srcSubresource(MemorySegment src) { return _srcSubresourceAt(0L, src); }
    public MemorySegment _srcOffsetsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcOffsets, index), LAYOUT_srcOffsets); }
    public MemorySegment _srcOffsets() { return _srcOffsetsAt(0L); }
    public VkImageBlit _srcOffsetsAt(long index, MemorySegment src) { _srcOffsetsAt(index).copyFrom(src); return this; }
    public VkImageBlit _srcOffsets(MemorySegment src) { return _srcOffsetsAt(0L, src); }
    public MemorySegment _dstSubresourceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstSubresource, index), LAYOUT_dstSubresource); }
    public MemorySegment _dstSubresource() { return _dstSubresourceAt(0L); }
    public VkImageBlit _dstSubresourceAt(long index, MemorySegment src) { _dstSubresourceAt(index).copyFrom(src); return this; }
    public VkImageBlit _dstSubresource(MemorySegment src) { return _dstSubresourceAt(0L, src); }
    public MemorySegment _dstOffsetsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstOffsets, index), LAYOUT_dstOffsets); }
    public MemorySegment _dstOffsets() { return _dstOffsetsAt(0L); }
    public VkImageBlit _dstOffsetsAt(long index, MemorySegment src) { _dstOffsetsAt(index).copyFrom(src); return this; }
    public VkImageBlit _dstOffsets(MemorySegment src) { return _dstOffsetsAt(0L, src); }
}
