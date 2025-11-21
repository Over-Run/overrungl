// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageBlit2`.
/// ## Layout
/// ```
/// struct VkImageBlit2 {
///     VkStructureType sType;
///     const void* pNext;
///     VkImageSubresourceLayers srcSubresource;
///     VkOffset3D srcOffsets[2];
///     VkImageSubresourceLayers dstSubresource;
///     VkOffset3D dstOffsets[2];
/// }
/// ```
public final class VkImageBlit2 extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("srcSubresource"),
        MemoryLayout.sequenceLayout(2, overrungl.vulkan.struct.VkOffset3D.LAYOUT).withName("srcOffsets"),
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("dstSubresource"),
        MemoryLayout.sequenceLayout(2, overrungl.vulkan.struct.VkOffset3D.LAYOUT).withName("dstOffsets")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_srcSubresource = LAYOUT.byteOffset(PathElement.groupElement("srcSubresource"));
    public static final long OFFSET_srcOffsets = LAYOUT.byteOffset(PathElement.groupElement("srcOffsets"));
    public static final long OFFSET_dstSubresource = LAYOUT.byteOffset(PathElement.groupElement("dstSubresource"));
    public static final long OFFSET_dstOffsets = LAYOUT.byteOffset(PathElement.groupElement("dstOffsets"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_srcSubresource = LAYOUT.select(PathElement.groupElement("srcSubresource"));
    public static final MemoryLayout LAYOUT_srcOffsets = LAYOUT.select(PathElement.groupElement("srcOffsets"));
    public static final MemoryLayout LAYOUT_dstSubresource = LAYOUT.select(PathElement.groupElement("dstSubresource"));
    public static final MemoryLayout LAYOUT_dstOffsets = LAYOUT.select(PathElement.groupElement("dstOffsets"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
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

    public VkImageBlit2(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageBlit2 of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageBlit2(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageBlit2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageBlit2(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageBlit2 ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageBlit2(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageBlit2 alloc(SegmentAllocator allocator) { return new VkImageBlit2(allocator.allocate(LAYOUT), 1); }
    public static VkImageBlit2 alloc(SegmentAllocator allocator, long count) { return new VkImageBlit2(allocator.allocate(LAYOUT, count), count); }
    public static VkImageBlit2 allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_IMAGE_BLIT_2); }
    public static VkImageBlit2 allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_IMAGE_BLIT_2);
        return s;
    }
    public VkImageBlit2 copyFrom(VkImageBlit2 src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageBlit2 reinterpret(long count) { return new VkImageBlit2(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageBlit2 asSlice(long index) { return new VkImageBlit2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageBlit2 asSlice(long index, long count) { return new VkImageBlit2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageBlit2 at(long index, Consumer<VkImageBlit2> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
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
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
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
    public VkImageBlit2 sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageBlit2 pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageBlit2 srcSubresource$aspectMaskAt(long index, int value) { VH_srcSubresource$aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkImageBlit2 srcSubresource$mipLevelAt(long index, int value) { VH_srcSubresource$mipLevel.set(this.segment(), 0L, index, value); return this; }
    public VkImageBlit2 srcSubresource$baseArrayLayerAt(long index, int value) { VH_srcSubresource$baseArrayLayer.set(this.segment(), 0L, index, value); return this; }
    public VkImageBlit2 srcSubresource$layerCountAt(long index, int value) { VH_srcSubresource$layerCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageBlit2 srcOffsetsAt(long index, long index0, MemorySegment value) { VH_srcOffsets.set(this.segment(), 0L, index, index0, value); return this; }
    public VkImageBlit2 dstSubresource$aspectMaskAt(long index, int value) { VH_dstSubresource$aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkImageBlit2 dstSubresource$mipLevelAt(long index, int value) { VH_dstSubresource$mipLevel.set(this.segment(), 0L, index, value); return this; }
    public VkImageBlit2 dstSubresource$baseArrayLayerAt(long index, int value) { VH_dstSubresource$baseArrayLayer.set(this.segment(), 0L, index, value); return this; }
    public VkImageBlit2 dstSubresource$layerCountAt(long index, int value) { VH_dstSubresource$layerCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageBlit2 dstOffsetsAt(long index, long index0, MemorySegment value) { VH_dstOffsets.set(this.segment(), 0L, index, index0, value); return this; }
    public VkImageBlit2 sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageBlit2 pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageBlit2 srcSubresource$aspectMask(int value) { VH_srcSubresource$aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageBlit2 srcSubresource$mipLevel(int value) { VH_srcSubresource$mipLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageBlit2 srcSubresource$baseArrayLayer(int value) { VH_srcSubresource$baseArrayLayer.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageBlit2 srcSubresource$layerCount(int value) { VH_srcSubresource$layerCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageBlit2 srcOffsets(long index0, MemorySegment value) { VH_srcOffsets.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkImageBlit2 dstSubresource$aspectMask(int value) { VH_dstSubresource$aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageBlit2 dstSubresource$mipLevel(int value) { VH_dstSubresource$mipLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageBlit2 dstSubresource$baseArrayLayer(int value) { VH_dstSubresource$baseArrayLayer.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageBlit2 dstSubresource$layerCount(int value) { VH_dstSubresource$layerCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageBlit2 dstOffsets(long index0, MemorySegment value) { VH_dstOffsets.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageBlit2 _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageBlit2 _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageBlit2 _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageBlit2 _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _srcSubresourceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcSubresource, index), LAYOUT_srcSubresource); }
    public MemorySegment _srcSubresource() { return _srcSubresourceAt(0L); }
    public VkImageBlit2 _srcSubresourceAt(long index, MemorySegment src) { _srcSubresourceAt(index).copyFrom(src); return this; }
    public VkImageBlit2 _srcSubresource(MemorySegment src) { return _srcSubresourceAt(0L, src); }
    public MemorySegment _srcOffsetsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcOffsets, index), LAYOUT_srcOffsets); }
    public MemorySegment _srcOffsets() { return _srcOffsetsAt(0L); }
    public VkImageBlit2 _srcOffsetsAt(long index, MemorySegment src) { _srcOffsetsAt(index).copyFrom(src); return this; }
    public VkImageBlit2 _srcOffsets(MemorySegment src) { return _srcOffsetsAt(0L, src); }
    public MemorySegment _dstSubresourceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstSubresource, index), LAYOUT_dstSubresource); }
    public MemorySegment _dstSubresource() { return _dstSubresourceAt(0L); }
    public VkImageBlit2 _dstSubresourceAt(long index, MemorySegment src) { _dstSubresourceAt(index).copyFrom(src); return this; }
    public VkImageBlit2 _dstSubresource(MemorySegment src) { return _dstSubresourceAt(0L, src); }
    public MemorySegment _dstOffsetsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstOffsets, index), LAYOUT_dstOffsets); }
    public MemorySegment _dstOffsets() { return _dstOffsetsAt(0L); }
    public VkImageBlit2 _dstOffsetsAt(long index, MemorySegment src) { _dstOffsetsAt(index).copyFrom(src); return this; }
    public VkImageBlit2 _dstOffsets(MemorySegment src) { return _dstOffsetsAt(0L, src); }
}
