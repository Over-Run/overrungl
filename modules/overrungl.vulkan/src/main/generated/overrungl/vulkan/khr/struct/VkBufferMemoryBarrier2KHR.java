// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBufferMemoryBarrier2KHR`.
/// ## Layout
/// ```
/// struct VkBufferMemoryBarrier2KHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineStageFlags2 srcStageMask;
///     VkAccessFlags2 srcAccessMask;
///     VkPipelineStageFlags2 dstStageMask;
///     VkAccessFlags2 dstAccessMask;
///     uint32_t srcQueueFamilyIndex;
///     uint32_t dstQueueFamilyIndex;
///     VkBuffer buffer;
///     VkDeviceSize offset;
///     VkDeviceSize size;
/// }
/// ```
public final class VkBufferMemoryBarrier2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("srcStageMask"),
        ValueLayout.JAVA_LONG.withName("srcAccessMask"),
        ValueLayout.JAVA_LONG.withName("dstStageMask"),
        ValueLayout.JAVA_LONG.withName("dstAccessMask"),
        ValueLayout.JAVA_INT.withName("srcQueueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("dstQueueFamilyIndex"),
        ValueLayout.JAVA_LONG.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_srcStageMask = LAYOUT.byteOffset(PathElement.groupElement("srcStageMask"));
    public static final long OFFSET_srcAccessMask = LAYOUT.byteOffset(PathElement.groupElement("srcAccessMask"));
    public static final long OFFSET_dstStageMask = LAYOUT.byteOffset(PathElement.groupElement("dstStageMask"));
    public static final long OFFSET_dstAccessMask = LAYOUT.byteOffset(PathElement.groupElement("dstAccessMask"));
    public static final long OFFSET_srcQueueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("srcQueueFamilyIndex"));
    public static final long OFFSET_dstQueueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("dstQueueFamilyIndex"));
    public static final long OFFSET_buffer = LAYOUT.byteOffset(PathElement.groupElement("buffer"));
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_srcStageMask = LAYOUT.select(PathElement.groupElement("srcStageMask"));
    public static final MemoryLayout LAYOUT_srcAccessMask = LAYOUT.select(PathElement.groupElement("srcAccessMask"));
    public static final MemoryLayout LAYOUT_dstStageMask = LAYOUT.select(PathElement.groupElement("dstStageMask"));
    public static final MemoryLayout LAYOUT_dstAccessMask = LAYOUT.select(PathElement.groupElement("dstAccessMask"));
    public static final MemoryLayout LAYOUT_srcQueueFamilyIndex = LAYOUT.select(PathElement.groupElement("srcQueueFamilyIndex"));
    public static final MemoryLayout LAYOUT_dstQueueFamilyIndex = LAYOUT.select(PathElement.groupElement("dstQueueFamilyIndex"));
    public static final MemoryLayout LAYOUT_buffer = LAYOUT.select(PathElement.groupElement("buffer"));
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_srcStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcStageMask"));
    public static final VarHandle VH_srcAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccessMask"));
    public static final VarHandle VH_dstStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstStageMask"));
    public static final VarHandle VH_dstAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAccessMask"));
    public static final VarHandle VH_srcQueueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcQueueFamilyIndex"));
    public static final VarHandle VH_dstQueueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstQueueFamilyIndex"));
    public static final VarHandle VH_buffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer"));
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    public VkBufferMemoryBarrier2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBufferMemoryBarrier2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferMemoryBarrier2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkBufferMemoryBarrier2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferMemoryBarrier2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBufferMemoryBarrier2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferMemoryBarrier2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBufferMemoryBarrier2KHR alloc(SegmentAllocator allocator) { return new VkBufferMemoryBarrier2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkBufferMemoryBarrier2KHR alloc(SegmentAllocator allocator, long count) { return new VkBufferMemoryBarrier2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkBufferMemoryBarrier2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2); }
    public static VkBufferMemoryBarrier2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2);
        return s;
    }
    public VkBufferMemoryBarrier2KHR copyFrom(VkBufferMemoryBarrier2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBufferMemoryBarrier2KHR reinterpret(long count) { return new VkBufferMemoryBarrier2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBufferMemoryBarrier2KHR asSlice(long index) { return new VkBufferMemoryBarrier2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBufferMemoryBarrier2KHR asSlice(long index, long count) { return new VkBufferMemoryBarrier2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBufferMemoryBarrier2KHR at(long index, Consumer<VkBufferMemoryBarrier2KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long srcStageMaskAt(long index) { return (long) VH_srcStageMask.get(this.segment(), 0L, index); }
    public long srcAccessMaskAt(long index) { return (long) VH_srcAccessMask.get(this.segment(), 0L, index); }
    public long dstStageMaskAt(long index) { return (long) VH_dstStageMask.get(this.segment(), 0L, index); }
    public long dstAccessMaskAt(long index) { return (long) VH_dstAccessMask.get(this.segment(), 0L, index); }
    public int srcQueueFamilyIndexAt(long index) { return (int) VH_srcQueueFamilyIndex.get(this.segment(), 0L, index); }
    public int dstQueueFamilyIndexAt(long index) { return (int) VH_dstQueueFamilyIndex.get(this.segment(), 0L, index); }
    public long bufferAt(long index) { return (long) VH_buffer.get(this.segment(), 0L, index); }
    public long offsetAt(long index) { return (long) VH_offset.get(this.segment(), 0L, index); }
    public long sizeAt(long index) { return (long) VH_size.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long srcStageMask() { return (long) VH_srcStageMask.get(this.segment(), 0L, 0L); }
    public long srcAccessMask() { return (long) VH_srcAccessMask.get(this.segment(), 0L, 0L); }
    public long dstStageMask() { return (long) VH_dstStageMask.get(this.segment(), 0L, 0L); }
    public long dstAccessMask() { return (long) VH_dstAccessMask.get(this.segment(), 0L, 0L); }
    public int srcQueueFamilyIndex() { return (int) VH_srcQueueFamilyIndex.get(this.segment(), 0L, 0L); }
    public int dstQueueFamilyIndex() { return (int) VH_dstQueueFamilyIndex.get(this.segment(), 0L, 0L); }
    public long buffer() { return (long) VH_buffer.get(this.segment(), 0L, 0L); }
    public long offset() { return (long) VH_offset.get(this.segment(), 0L, 0L); }
    public long size() { return (long) VH_size.get(this.segment(), 0L, 0L); }
    public VkBufferMemoryBarrier2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBufferMemoryBarrier2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBufferMemoryBarrier2KHR srcStageMaskAt(long index, long value) { VH_srcStageMask.set(this.segment(), 0L, index, value); return this; }
    public VkBufferMemoryBarrier2KHR srcAccessMaskAt(long index, long value) { VH_srcAccessMask.set(this.segment(), 0L, index, value); return this; }
    public VkBufferMemoryBarrier2KHR dstStageMaskAt(long index, long value) { VH_dstStageMask.set(this.segment(), 0L, index, value); return this; }
    public VkBufferMemoryBarrier2KHR dstAccessMaskAt(long index, long value) { VH_dstAccessMask.set(this.segment(), 0L, index, value); return this; }
    public VkBufferMemoryBarrier2KHR srcQueueFamilyIndexAt(long index, int value) { VH_srcQueueFamilyIndex.set(this.segment(), 0L, index, value); return this; }
    public VkBufferMemoryBarrier2KHR dstQueueFamilyIndexAt(long index, int value) { VH_dstQueueFamilyIndex.set(this.segment(), 0L, index, value); return this; }
    public VkBufferMemoryBarrier2KHR bufferAt(long index, long value) { VH_buffer.set(this.segment(), 0L, index, value); return this; }
    public VkBufferMemoryBarrier2KHR offsetAt(long index, long value) { VH_offset.set(this.segment(), 0L, index, value); return this; }
    public VkBufferMemoryBarrier2KHR sizeAt(long index, long value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkBufferMemoryBarrier2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferMemoryBarrier2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferMemoryBarrier2KHR srcStageMask(long value) { VH_srcStageMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferMemoryBarrier2KHR srcAccessMask(long value) { VH_srcAccessMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferMemoryBarrier2KHR dstStageMask(long value) { VH_dstStageMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferMemoryBarrier2KHR dstAccessMask(long value) { VH_dstAccessMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferMemoryBarrier2KHR srcQueueFamilyIndex(int value) { VH_srcQueueFamilyIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferMemoryBarrier2KHR dstQueueFamilyIndex(int value) { VH_dstQueueFamilyIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferMemoryBarrier2KHR buffer(long value) { VH_buffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferMemoryBarrier2KHR offset(long value) { VH_offset.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferMemoryBarrier2KHR size(long value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBufferMemoryBarrier2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBufferMemoryBarrier2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBufferMemoryBarrier2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBufferMemoryBarrier2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _srcStageMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcStageMask, index), LAYOUT_srcStageMask); }
    public MemorySegment _srcStageMask() { return _srcStageMaskAt(0L); }
    public VkBufferMemoryBarrier2KHR _srcStageMaskAt(long index, MemorySegment src) { _srcStageMaskAt(index).copyFrom(src); return this; }
    public VkBufferMemoryBarrier2KHR _srcStageMask(MemorySegment src) { return _srcStageMaskAt(0L, src); }
    public MemorySegment _srcAccessMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcAccessMask, index), LAYOUT_srcAccessMask); }
    public MemorySegment _srcAccessMask() { return _srcAccessMaskAt(0L); }
    public VkBufferMemoryBarrier2KHR _srcAccessMaskAt(long index, MemorySegment src) { _srcAccessMaskAt(index).copyFrom(src); return this; }
    public VkBufferMemoryBarrier2KHR _srcAccessMask(MemorySegment src) { return _srcAccessMaskAt(0L, src); }
    public MemorySegment _dstStageMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstStageMask, index), LAYOUT_dstStageMask); }
    public MemorySegment _dstStageMask() { return _dstStageMaskAt(0L); }
    public VkBufferMemoryBarrier2KHR _dstStageMaskAt(long index, MemorySegment src) { _dstStageMaskAt(index).copyFrom(src); return this; }
    public VkBufferMemoryBarrier2KHR _dstStageMask(MemorySegment src) { return _dstStageMaskAt(0L, src); }
    public MemorySegment _dstAccessMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstAccessMask, index), LAYOUT_dstAccessMask); }
    public MemorySegment _dstAccessMask() { return _dstAccessMaskAt(0L); }
    public VkBufferMemoryBarrier2KHR _dstAccessMaskAt(long index, MemorySegment src) { _dstAccessMaskAt(index).copyFrom(src); return this; }
    public VkBufferMemoryBarrier2KHR _dstAccessMask(MemorySegment src) { return _dstAccessMaskAt(0L, src); }
    public MemorySegment _srcQueueFamilyIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcQueueFamilyIndex, index), LAYOUT_srcQueueFamilyIndex); }
    public MemorySegment _srcQueueFamilyIndex() { return _srcQueueFamilyIndexAt(0L); }
    public VkBufferMemoryBarrier2KHR _srcQueueFamilyIndexAt(long index, MemorySegment src) { _srcQueueFamilyIndexAt(index).copyFrom(src); return this; }
    public VkBufferMemoryBarrier2KHR _srcQueueFamilyIndex(MemorySegment src) { return _srcQueueFamilyIndexAt(0L, src); }
    public MemorySegment _dstQueueFamilyIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstQueueFamilyIndex, index), LAYOUT_dstQueueFamilyIndex); }
    public MemorySegment _dstQueueFamilyIndex() { return _dstQueueFamilyIndexAt(0L); }
    public VkBufferMemoryBarrier2KHR _dstQueueFamilyIndexAt(long index, MemorySegment src) { _dstQueueFamilyIndexAt(index).copyFrom(src); return this; }
    public VkBufferMemoryBarrier2KHR _dstQueueFamilyIndex(MemorySegment src) { return _dstQueueFamilyIndexAt(0L, src); }
    public MemorySegment _bufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_buffer, index), LAYOUT_buffer); }
    public MemorySegment _buffer() { return _bufferAt(0L); }
    public VkBufferMemoryBarrier2KHR _bufferAt(long index, MemorySegment src) { _bufferAt(index).copyFrom(src); return this; }
    public VkBufferMemoryBarrier2KHR _buffer(MemorySegment src) { return _bufferAt(0L, src); }
    public MemorySegment _offsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    public MemorySegment _offset() { return _offsetAt(0L); }
    public VkBufferMemoryBarrier2KHR _offsetAt(long index, MemorySegment src) { _offsetAt(index).copyFrom(src); return this; }
    public VkBufferMemoryBarrier2KHR _offset(MemorySegment src) { return _offsetAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkBufferMemoryBarrier2KHR _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkBufferMemoryBarrier2KHR _size(MemorySegment src) { return _sizeAt(0L, src); }
}
