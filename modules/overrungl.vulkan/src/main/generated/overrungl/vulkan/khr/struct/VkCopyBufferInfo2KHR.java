// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCopyBufferInfo2KHR`.
/// ## Layout
/// ```
/// struct VkCopyBufferInfo2KHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkBuffer srcBuffer;
///     VkBuffer dstBuffer;
///     uint32_t regionCount;
///     const VkBufferCopy2* pRegions;
/// }
/// ```
public final class VkCopyBufferInfo2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("srcBuffer"),
        ValueLayout.JAVA_LONG.withName("dstBuffer"),
        ValueLayout.JAVA_INT.withName("regionCount"),
        ValueLayout.ADDRESS.withName("pRegions")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_srcBuffer = LAYOUT.byteOffset(PathElement.groupElement("srcBuffer"));
    public static final long OFFSET_dstBuffer = LAYOUT.byteOffset(PathElement.groupElement("dstBuffer"));
    public static final long OFFSET_regionCount = LAYOUT.byteOffset(PathElement.groupElement("regionCount"));
    public static final long OFFSET_pRegions = LAYOUT.byteOffset(PathElement.groupElement("pRegions"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_srcBuffer = LAYOUT.select(PathElement.groupElement("srcBuffer"));
    public static final MemoryLayout LAYOUT_dstBuffer = LAYOUT.select(PathElement.groupElement("dstBuffer"));
    public static final MemoryLayout LAYOUT_regionCount = LAYOUT.select(PathElement.groupElement("regionCount"));
    public static final MemoryLayout LAYOUT_pRegions = LAYOUT.select(PathElement.groupElement("pRegions"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_srcBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcBuffer"));
    public static final VarHandle VH_dstBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstBuffer"));
    public static final VarHandle VH_regionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("regionCount"));
    public static final VarHandle VH_pRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRegions"));

    public VkCopyBufferInfo2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCopyBufferInfo2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyBufferInfo2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkCopyBufferInfo2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyBufferInfo2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCopyBufferInfo2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyBufferInfo2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCopyBufferInfo2KHR alloc(SegmentAllocator allocator) { return new VkCopyBufferInfo2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkCopyBufferInfo2KHR alloc(SegmentAllocator allocator, long count) { return new VkCopyBufferInfo2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkCopyBufferInfo2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2); }
    public static VkCopyBufferInfo2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2);
        return s;
    }
    public VkCopyBufferInfo2KHR copyFrom(VkCopyBufferInfo2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCopyBufferInfo2KHR reinterpret(long count) { return new VkCopyBufferInfo2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCopyBufferInfo2KHR asSlice(long index) { return new VkCopyBufferInfo2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCopyBufferInfo2KHR asSlice(long index, long count) { return new VkCopyBufferInfo2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCopyBufferInfo2KHR at(long index, Consumer<VkCopyBufferInfo2KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long srcBufferAt(long index) { return (long) VH_srcBuffer.get(this.segment(), 0L, index); }
    public long dstBufferAt(long index) { return (long) VH_dstBuffer.get(this.segment(), 0L, index); }
    public int regionCountAt(long index) { return (int) VH_regionCount.get(this.segment(), 0L, index); }
    public MemorySegment pRegionsAt(long index) { return (MemorySegment) VH_pRegions.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long srcBuffer() { return (long) VH_srcBuffer.get(this.segment(), 0L, 0L); }
    public long dstBuffer() { return (long) VH_dstBuffer.get(this.segment(), 0L, 0L); }
    public int regionCount() { return (int) VH_regionCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pRegions() { return (MemorySegment) VH_pRegions.get(this.segment(), 0L, 0L); }
    public VkCopyBufferInfo2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCopyBufferInfo2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCopyBufferInfo2KHR srcBufferAt(long index, long value) { VH_srcBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkCopyBufferInfo2KHR dstBufferAt(long index, long value) { VH_dstBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkCopyBufferInfo2KHR regionCountAt(long index, int value) { VH_regionCount.set(this.segment(), 0L, index, value); return this; }
    public VkCopyBufferInfo2KHR pRegionsAt(long index, MemorySegment value) { VH_pRegions.set(this.segment(), 0L, index, value); return this; }
    public VkCopyBufferInfo2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyBufferInfo2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyBufferInfo2KHR srcBuffer(long value) { VH_srcBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyBufferInfo2KHR dstBuffer(long value) { VH_dstBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyBufferInfo2KHR regionCount(int value) { VH_regionCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyBufferInfo2KHR pRegions(MemorySegment value) { VH_pRegions.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCopyBufferInfo2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCopyBufferInfo2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCopyBufferInfo2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCopyBufferInfo2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _srcBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcBuffer, index), LAYOUT_srcBuffer); }
    public MemorySegment _srcBuffer() { return _srcBufferAt(0L); }
    public VkCopyBufferInfo2KHR _srcBufferAt(long index, MemorySegment src) { _srcBufferAt(index).copyFrom(src); return this; }
    public VkCopyBufferInfo2KHR _srcBuffer(MemorySegment src) { return _srcBufferAt(0L, src); }
    public MemorySegment _dstBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstBuffer, index), LAYOUT_dstBuffer); }
    public MemorySegment _dstBuffer() { return _dstBufferAt(0L); }
    public VkCopyBufferInfo2KHR _dstBufferAt(long index, MemorySegment src) { _dstBufferAt(index).copyFrom(src); return this; }
    public VkCopyBufferInfo2KHR _dstBuffer(MemorySegment src) { return _dstBufferAt(0L, src); }
    public MemorySegment _regionCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_regionCount, index), LAYOUT_regionCount); }
    public MemorySegment _regionCount() { return _regionCountAt(0L); }
    public VkCopyBufferInfo2KHR _regionCountAt(long index, MemorySegment src) { _regionCountAt(index).copyFrom(src); return this; }
    public VkCopyBufferInfo2KHR _regionCount(MemorySegment src) { return _regionCountAt(0L, src); }
    public MemorySegment _pRegionsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pRegions, index), LAYOUT_pRegions); }
    public MemorySegment _pRegions() { return _pRegionsAt(0L); }
    public VkCopyBufferInfo2KHR _pRegionsAt(long index, MemorySegment src) { _pRegionsAt(index).copyFrom(src); return this; }
    public VkCopyBufferInfo2KHR _pRegions(MemorySegment src) { return _pRegionsAt(0L, src); }
}
