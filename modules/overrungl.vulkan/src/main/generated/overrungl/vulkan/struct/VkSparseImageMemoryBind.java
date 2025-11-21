// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSparseImageMemoryBind`.
/// ## Layout
/// ```
/// struct VkSparseImageMemoryBind {
///     VkImageSubresource subresource;
///     VkOffset3D offset;
///     VkExtent3D extent;
///     VkDeviceMemory memory;
///     VkDeviceSize memoryOffset;
///     VkSparseMemoryBindFlags flags;
/// }
/// ```
public final class VkSparseImageMemoryBind extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkImageSubresource.LAYOUT.withName("subresource"),
        overrungl.vulkan.struct.VkOffset3D.LAYOUT.withName("offset"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("extent"),
        ValueLayout.JAVA_LONG.withName("memory"),
        ValueLayout.JAVA_LONG.withName("memoryOffset"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    public static final long OFFSET_subresource = LAYOUT.byteOffset(PathElement.groupElement("subresource"));
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    public static final long OFFSET_extent = LAYOUT.byteOffset(PathElement.groupElement("extent"));
    public static final long OFFSET_memory = LAYOUT.byteOffset(PathElement.groupElement("memory"));
    public static final long OFFSET_memoryOffset = LAYOUT.byteOffset(PathElement.groupElement("memoryOffset"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_subresource = LAYOUT.select(PathElement.groupElement("subresource"));
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    public static final MemoryLayout LAYOUT_extent = LAYOUT.select(PathElement.groupElement("extent"));
    public static final MemoryLayout LAYOUT_memory = LAYOUT.select(PathElement.groupElement("memory"));
    public static final MemoryLayout LAYOUT_memoryOffset = LAYOUT.select(PathElement.groupElement("memoryOffset"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final VarHandle VH_subresource$aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subresource"), PathElement.groupElement("aspectMask"));
    public static final VarHandle VH_subresource$mipLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subresource"), PathElement.groupElement("mipLevel"));
    public static final VarHandle VH_subresource$arrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subresource"), PathElement.groupElement("arrayLayer"));
    public static final VarHandle VH_offset$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"), PathElement.groupElement("x"));
    public static final VarHandle VH_offset$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"), PathElement.groupElement("y"));
    public static final VarHandle VH_offset$z = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"), PathElement.groupElement("z"));
    public static final VarHandle VH_extent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extent"), PathElement.groupElement("width"));
    public static final VarHandle VH_extent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extent"), PathElement.groupElement("height"));
    public static final VarHandle VH_extent$depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extent"), PathElement.groupElement("depth"));
    public static final VarHandle VH_memory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory"));
    public static final VarHandle VH_memoryOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryOffset"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    public VkSparseImageMemoryBind(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSparseImageMemoryBind of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageMemoryBind(segment, estimateCount(segment, LAYOUT)); }
    public static VkSparseImageMemoryBind ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageMemoryBind(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSparseImageMemoryBind ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageMemoryBind(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSparseImageMemoryBind alloc(SegmentAllocator allocator) { return new VkSparseImageMemoryBind(allocator.allocate(LAYOUT), 1); }
    public static VkSparseImageMemoryBind alloc(SegmentAllocator allocator, long count) { return new VkSparseImageMemoryBind(allocator.allocate(LAYOUT, count), count); }
    public VkSparseImageMemoryBind copyFrom(VkSparseImageMemoryBind src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSparseImageMemoryBind reinterpret(long count) { return new VkSparseImageMemoryBind(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSparseImageMemoryBind asSlice(long index) { return new VkSparseImageMemoryBind(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSparseImageMemoryBind asSlice(long index, long count) { return new VkSparseImageMemoryBind(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSparseImageMemoryBind at(long index, Consumer<VkSparseImageMemoryBind> func) { func.accept(asSlice(index)); return this; }
    public int subresource$aspectMaskAt(long index) { return (int) VH_subresource$aspectMask.get(this.segment(), 0L, index); }
    public int subresource$mipLevelAt(long index) { return (int) VH_subresource$mipLevel.get(this.segment(), 0L, index); }
    public int subresource$arrayLayerAt(long index) { return (int) VH_subresource$arrayLayer.get(this.segment(), 0L, index); }
    public int offset$xAt(long index) { return (int) VH_offset$x.get(this.segment(), 0L, index); }
    public int offset$yAt(long index) { return (int) VH_offset$y.get(this.segment(), 0L, index); }
    public int offset$zAt(long index) { return (int) VH_offset$z.get(this.segment(), 0L, index); }
    public int extent$widthAt(long index) { return (int) VH_extent$width.get(this.segment(), 0L, index); }
    public int extent$heightAt(long index) { return (int) VH_extent$height.get(this.segment(), 0L, index); }
    public int extent$depthAt(long index) { return (int) VH_extent$depth.get(this.segment(), 0L, index); }
    public long memoryAt(long index) { return (long) VH_memory.get(this.segment(), 0L, index); }
    public long memoryOffsetAt(long index) { return (long) VH_memoryOffset.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int subresource$aspectMask() { return (int) VH_subresource$aspectMask.get(this.segment(), 0L, 0L); }
    public int subresource$mipLevel() { return (int) VH_subresource$mipLevel.get(this.segment(), 0L, 0L); }
    public int subresource$arrayLayer() { return (int) VH_subresource$arrayLayer.get(this.segment(), 0L, 0L); }
    public int offset$x() { return (int) VH_offset$x.get(this.segment(), 0L, 0L); }
    public int offset$y() { return (int) VH_offset$y.get(this.segment(), 0L, 0L); }
    public int offset$z() { return (int) VH_offset$z.get(this.segment(), 0L, 0L); }
    public int extent$width() { return (int) VH_extent$width.get(this.segment(), 0L, 0L); }
    public int extent$height() { return (int) VH_extent$height.get(this.segment(), 0L, 0L); }
    public int extent$depth() { return (int) VH_extent$depth.get(this.segment(), 0L, 0L); }
    public long memory() { return (long) VH_memory.get(this.segment(), 0L, 0L); }
    public long memoryOffset() { return (long) VH_memoryOffset.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public VkSparseImageMemoryBind subresource$aspectMaskAt(long index, int value) { VH_subresource$aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryBind subresource$mipLevelAt(long index, int value) { VH_subresource$mipLevel.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryBind subresource$arrayLayerAt(long index, int value) { VH_subresource$arrayLayer.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryBind offset$xAt(long index, int value) { VH_offset$x.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryBind offset$yAt(long index, int value) { VH_offset$y.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryBind offset$zAt(long index, int value) { VH_offset$z.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryBind extent$widthAt(long index, int value) { VH_extent$width.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryBind extent$heightAt(long index, int value) { VH_extent$height.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryBind extent$depthAt(long index, int value) { VH_extent$depth.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryBind memoryAt(long index, long value) { VH_memory.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryBind memoryOffsetAt(long index, long value) { VH_memoryOffset.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryBind flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkSparseImageMemoryBind subresource$aspectMask(int value) { VH_subresource$aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryBind subresource$mipLevel(int value) { VH_subresource$mipLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryBind subresource$arrayLayer(int value) { VH_subresource$arrayLayer.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryBind offset$x(int value) { VH_offset$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryBind offset$y(int value) { VH_offset$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryBind offset$z(int value) { VH_offset$z.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryBind extent$width(int value) { VH_extent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryBind extent$height(int value) { VH_extent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryBind extent$depth(int value) { VH_extent$depth.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryBind memory(long value) { VH_memory.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryBind memoryOffset(long value) { VH_memoryOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseImageMemoryBind flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _subresourceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subresource, index), LAYOUT_subresource); }
    public MemorySegment _subresource() { return _subresourceAt(0L); }
    public VkSparseImageMemoryBind _subresourceAt(long index, MemorySegment src) { _subresourceAt(index).copyFrom(src); return this; }
    public VkSparseImageMemoryBind _subresource(MemorySegment src) { return _subresourceAt(0L, src); }
    public MemorySegment _offsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    public MemorySegment _offset() { return _offsetAt(0L); }
    public VkSparseImageMemoryBind _offsetAt(long index, MemorySegment src) { _offsetAt(index).copyFrom(src); return this; }
    public VkSparseImageMemoryBind _offset(MemorySegment src) { return _offsetAt(0L, src); }
    public MemorySegment _extentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extent, index), LAYOUT_extent); }
    public MemorySegment _extent() { return _extentAt(0L); }
    public VkSparseImageMemoryBind _extentAt(long index, MemorySegment src) { _extentAt(index).copyFrom(src); return this; }
    public VkSparseImageMemoryBind _extent(MemorySegment src) { return _extentAt(0L, src); }
    public MemorySegment _memoryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memory, index), LAYOUT_memory); }
    public MemorySegment _memory() { return _memoryAt(0L); }
    public VkSparseImageMemoryBind _memoryAt(long index, MemorySegment src) { _memoryAt(index).copyFrom(src); return this; }
    public VkSparseImageMemoryBind _memory(MemorySegment src) { return _memoryAt(0L, src); }
    public MemorySegment _memoryOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryOffset, index), LAYOUT_memoryOffset); }
    public MemorySegment _memoryOffset() { return _memoryOffsetAt(0L); }
    public VkSparseImageMemoryBind _memoryOffsetAt(long index, MemorySegment src) { _memoryOffsetAt(index).copyFrom(src); return this; }
    public VkSparseImageMemoryBind _memoryOffset(MemorySegment src) { return _memoryOffsetAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkSparseImageMemoryBind _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkSparseImageMemoryBind _flags(MemorySegment src) { return _flagsAt(0L, src); }
}
