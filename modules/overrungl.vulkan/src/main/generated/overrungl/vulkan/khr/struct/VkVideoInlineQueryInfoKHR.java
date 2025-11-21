// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoInlineQueryInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoInlineQueryInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkQueryPool queryPool;
///     uint32_t firstQuery;
///     uint32_t queryCount;
/// }
/// ```
public final class VkVideoInlineQueryInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("queryPool"),
        ValueLayout.JAVA_INT.withName("firstQuery"),
        ValueLayout.JAVA_INT.withName("queryCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_queryPool = LAYOUT.byteOffset(PathElement.groupElement("queryPool"));
    public static final long OFFSET_firstQuery = LAYOUT.byteOffset(PathElement.groupElement("firstQuery"));
    public static final long OFFSET_queryCount = LAYOUT.byteOffset(PathElement.groupElement("queryCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_queryPool = LAYOUT.select(PathElement.groupElement("queryPool"));
    public static final MemoryLayout LAYOUT_firstQuery = LAYOUT.select(PathElement.groupElement("firstQuery"));
    public static final MemoryLayout LAYOUT_queryCount = LAYOUT.select(PathElement.groupElement("queryCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_queryPool = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queryPool"));
    public static final VarHandle VH_firstQuery = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstQuery"));
    public static final VarHandle VH_queryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queryCount"));

    public VkVideoInlineQueryInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoInlineQueryInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoInlineQueryInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoInlineQueryInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoInlineQueryInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoInlineQueryInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoInlineQueryInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoInlineQueryInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoInlineQueryInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoInlineQueryInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoInlineQueryInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoInlineQueryInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoMaintenance1.VK_STRUCTURE_TYPE_VIDEO_INLINE_QUERY_INFO_KHR); }
    public static VkVideoInlineQueryInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoMaintenance1.VK_STRUCTURE_TYPE_VIDEO_INLINE_QUERY_INFO_KHR);
        return s;
    }
    public VkVideoInlineQueryInfoKHR copyFrom(VkVideoInlineQueryInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoInlineQueryInfoKHR reinterpret(long count) { return new VkVideoInlineQueryInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoInlineQueryInfoKHR asSlice(long index) { return new VkVideoInlineQueryInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoInlineQueryInfoKHR asSlice(long index, long count) { return new VkVideoInlineQueryInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoInlineQueryInfoKHR at(long index, Consumer<VkVideoInlineQueryInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long queryPoolAt(long index) { return (long) VH_queryPool.get(this.segment(), 0L, index); }
    public int firstQueryAt(long index) { return (int) VH_firstQuery.get(this.segment(), 0L, index); }
    public int queryCountAt(long index) { return (int) VH_queryCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long queryPool() { return (long) VH_queryPool.get(this.segment(), 0L, 0L); }
    public int firstQuery() { return (int) VH_firstQuery.get(this.segment(), 0L, 0L); }
    public int queryCount() { return (int) VH_queryCount.get(this.segment(), 0L, 0L); }
    public VkVideoInlineQueryInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoInlineQueryInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoInlineQueryInfoKHR queryPoolAt(long index, long value) { VH_queryPool.set(this.segment(), 0L, index, value); return this; }
    public VkVideoInlineQueryInfoKHR firstQueryAt(long index, int value) { VH_firstQuery.set(this.segment(), 0L, index, value); return this; }
    public VkVideoInlineQueryInfoKHR queryCountAt(long index, int value) { VH_queryCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoInlineQueryInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoInlineQueryInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoInlineQueryInfoKHR queryPool(long value) { VH_queryPool.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoInlineQueryInfoKHR firstQuery(int value) { VH_firstQuery.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoInlineQueryInfoKHR queryCount(int value) { VH_queryCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoInlineQueryInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoInlineQueryInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoInlineQueryInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoInlineQueryInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _queryPoolAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queryPool, index), LAYOUT_queryPool); }
    public MemorySegment _queryPool() { return _queryPoolAt(0L); }
    public VkVideoInlineQueryInfoKHR _queryPoolAt(long index, MemorySegment src) { _queryPoolAt(index).copyFrom(src); return this; }
    public VkVideoInlineQueryInfoKHR _queryPool(MemorySegment src) { return _queryPoolAt(0L, src); }
    public MemorySegment _firstQueryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_firstQuery, index), LAYOUT_firstQuery); }
    public MemorySegment _firstQuery() { return _firstQueryAt(0L); }
    public VkVideoInlineQueryInfoKHR _firstQueryAt(long index, MemorySegment src) { _firstQueryAt(index).copyFrom(src); return this; }
    public VkVideoInlineQueryInfoKHR _firstQuery(MemorySegment src) { return _firstQueryAt(0L, src); }
    public MemorySegment _queryCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queryCount, index), LAYOUT_queryCount); }
    public MemorySegment _queryCount() { return _queryCountAt(0L); }
    public VkVideoInlineQueryInfoKHR _queryCountAt(long index, MemorySegment src) { _queryCountAt(index).copyFrom(src); return this; }
    public VkVideoInlineQueryInfoKHR _queryCount(MemorySegment src) { return _queryCountAt(0L, src); }
}
