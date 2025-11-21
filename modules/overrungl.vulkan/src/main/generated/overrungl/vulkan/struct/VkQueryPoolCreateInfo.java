// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkQueryPoolCreateInfo`.
/// ## Layout
/// ```
/// struct VkQueryPoolCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkQueryPoolCreateFlags flags;
///     VkQueryType queryType;
///     uint32_t queryCount;
///     VkQueryPipelineStatisticFlags pipelineStatistics;
/// }
/// ```
public final class VkQueryPoolCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("queryType"),
        ValueLayout.JAVA_INT.withName("queryCount"),
        ValueLayout.JAVA_INT.withName("pipelineStatistics")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_queryType = LAYOUT.byteOffset(PathElement.groupElement("queryType"));
    public static final long OFFSET_queryCount = LAYOUT.byteOffset(PathElement.groupElement("queryCount"));
    public static final long OFFSET_pipelineStatistics = LAYOUT.byteOffset(PathElement.groupElement("pipelineStatistics"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_queryType = LAYOUT.select(PathElement.groupElement("queryType"));
    public static final MemoryLayout LAYOUT_queryCount = LAYOUT.select(PathElement.groupElement("queryCount"));
    public static final MemoryLayout LAYOUT_pipelineStatistics = LAYOUT.select(PathElement.groupElement("pipelineStatistics"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_queryType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queryType"));
    public static final VarHandle VH_queryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queryCount"));
    public static final VarHandle VH_pipelineStatistics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineStatistics"));

    public VkQueryPoolCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkQueryPoolCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueryPoolCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkQueryPoolCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueryPoolCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkQueryPoolCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueryPoolCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkQueryPoolCreateInfo alloc(SegmentAllocator allocator) { return new VkQueryPoolCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkQueryPoolCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkQueryPoolCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkQueryPoolCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO); }
    public static VkQueryPoolCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO);
        return s;
    }
    public VkQueryPoolCreateInfo copyFrom(VkQueryPoolCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkQueryPoolCreateInfo reinterpret(long count) { return new VkQueryPoolCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkQueryPoolCreateInfo asSlice(long index) { return new VkQueryPoolCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkQueryPoolCreateInfo asSlice(long index, long count) { return new VkQueryPoolCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkQueryPoolCreateInfo at(long index, Consumer<VkQueryPoolCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int queryTypeAt(long index) { return (int) VH_queryType.get(this.segment(), 0L, index); }
    public int queryCountAt(long index) { return (int) VH_queryCount.get(this.segment(), 0L, index); }
    public int pipelineStatisticsAt(long index) { return (int) VH_pipelineStatistics.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int queryType() { return (int) VH_queryType.get(this.segment(), 0L, 0L); }
    public int queryCount() { return (int) VH_queryCount.get(this.segment(), 0L, 0L); }
    public int pipelineStatistics() { return (int) VH_pipelineStatistics.get(this.segment(), 0L, 0L); }
    public VkQueryPoolCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkQueryPoolCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkQueryPoolCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkQueryPoolCreateInfo queryTypeAt(long index, int value) { VH_queryType.set(this.segment(), 0L, index, value); return this; }
    public VkQueryPoolCreateInfo queryCountAt(long index, int value) { VH_queryCount.set(this.segment(), 0L, index, value); return this; }
    public VkQueryPoolCreateInfo pipelineStatisticsAt(long index, int value) { VH_pipelineStatistics.set(this.segment(), 0L, index, value); return this; }
    public VkQueryPoolCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueryPoolCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueryPoolCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueryPoolCreateInfo queryType(int value) { VH_queryType.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueryPoolCreateInfo queryCount(int value) { VH_queryCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueryPoolCreateInfo pipelineStatistics(int value) { VH_pipelineStatistics.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkQueryPoolCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkQueryPoolCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkQueryPoolCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkQueryPoolCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkQueryPoolCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkQueryPoolCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _queryTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queryType, index), LAYOUT_queryType); }
    public MemorySegment _queryType() { return _queryTypeAt(0L); }
    public VkQueryPoolCreateInfo _queryTypeAt(long index, MemorySegment src) { _queryTypeAt(index).copyFrom(src); return this; }
    public VkQueryPoolCreateInfo _queryType(MemorySegment src) { return _queryTypeAt(0L, src); }
    public MemorySegment _queryCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queryCount, index), LAYOUT_queryCount); }
    public MemorySegment _queryCount() { return _queryCountAt(0L); }
    public VkQueryPoolCreateInfo _queryCountAt(long index, MemorySegment src) { _queryCountAt(index).copyFrom(src); return this; }
    public VkQueryPoolCreateInfo _queryCount(MemorySegment src) { return _queryCountAt(0L, src); }
    public MemorySegment _pipelineStatisticsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineStatistics, index), LAYOUT_pipelineStatistics); }
    public MemorySegment _pipelineStatistics() { return _pipelineStatisticsAt(0L); }
    public VkQueryPoolCreateInfo _pipelineStatisticsAt(long index, MemorySegment src) { _pipelineStatisticsAt(index).copyFrom(src); return this; }
    public VkQueryPoolCreateInfo _pipelineStatistics(MemorySegment src) { return _pipelineStatisticsAt(0L, src); }
}
