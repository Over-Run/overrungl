// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBufferCopy2KHR`.
/// ## Layout
/// ```
/// struct VkBufferCopy2KHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceSize srcOffset;
///     VkDeviceSize dstOffset;
///     VkDeviceSize size;
/// }
/// ```
public final class VkBufferCopy2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("srcOffset"),
        ValueLayout.JAVA_LONG.withName("dstOffset"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_srcOffset = LAYOUT.byteOffset(PathElement.groupElement("srcOffset"));
    public static final long OFFSET_dstOffset = LAYOUT.byteOffset(PathElement.groupElement("dstOffset"));
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_srcOffset = LAYOUT.select(PathElement.groupElement("srcOffset"));
    public static final MemoryLayout LAYOUT_dstOffset = LAYOUT.select(PathElement.groupElement("dstOffset"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_srcOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcOffset"));
    public static final VarHandle VH_dstOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstOffset"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    public VkBufferCopy2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBufferCopy2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCopy2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkBufferCopy2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCopy2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBufferCopy2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCopy2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBufferCopy2KHR alloc(SegmentAllocator allocator) { return new VkBufferCopy2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkBufferCopy2KHR alloc(SegmentAllocator allocator, long count) { return new VkBufferCopy2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkBufferCopy2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_BUFFER_COPY_2); }
    public static VkBufferCopy2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_BUFFER_COPY_2);
        return s;
    }
    public VkBufferCopy2KHR copyFrom(VkBufferCopy2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBufferCopy2KHR reinterpret(long count) { return new VkBufferCopy2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBufferCopy2KHR asSlice(long index) { return new VkBufferCopy2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBufferCopy2KHR asSlice(long index, long count) { return new VkBufferCopy2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBufferCopy2KHR at(long index, Consumer<VkBufferCopy2KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long srcOffsetAt(long index) { return (long) VH_srcOffset.get(this.segment(), 0L, index); }
    public long dstOffsetAt(long index) { return (long) VH_dstOffset.get(this.segment(), 0L, index); }
    public long sizeAt(long index) { return (long) VH_size.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long srcOffset() { return (long) VH_srcOffset.get(this.segment(), 0L, 0L); }
    public long dstOffset() { return (long) VH_dstOffset.get(this.segment(), 0L, 0L); }
    public long size() { return (long) VH_size.get(this.segment(), 0L, 0L); }
    public VkBufferCopy2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCopy2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCopy2KHR srcOffsetAt(long index, long value) { VH_srcOffset.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCopy2KHR dstOffsetAt(long index, long value) { VH_dstOffset.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCopy2KHR sizeAt(long index, long value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCopy2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCopy2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCopy2KHR srcOffset(long value) { VH_srcOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCopy2KHR dstOffset(long value) { VH_dstOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCopy2KHR size(long value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBufferCopy2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBufferCopy2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBufferCopy2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBufferCopy2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _srcOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcOffset, index), LAYOUT_srcOffset); }
    public MemorySegment _srcOffset() { return _srcOffsetAt(0L); }
    public VkBufferCopy2KHR _srcOffsetAt(long index, MemorySegment src) { _srcOffsetAt(index).copyFrom(src); return this; }
    public VkBufferCopy2KHR _srcOffset(MemorySegment src) { return _srcOffsetAt(0L, src); }
    public MemorySegment _dstOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstOffset, index), LAYOUT_dstOffset); }
    public MemorySegment _dstOffset() { return _dstOffsetAt(0L); }
    public VkBufferCopy2KHR _dstOffsetAt(long index, MemorySegment src) { _dstOffsetAt(index).copyFrom(src); return this; }
    public VkBufferCopy2KHR _dstOffset(MemorySegment src) { return _dstOffsetAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkBufferCopy2KHR _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkBufferCopy2KHR _size(MemorySegment src) { return _sizeAt(0L, src); }
}
