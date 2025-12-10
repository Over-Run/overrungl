// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPresentTimingInfoEXT`.
/// ## Layout
/// ```
/// struct VkPresentTimingInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkPresentTimingInfoFlagsEXT flags;
///     uint64_t targetTime;
///     uint64_t timeDomainId;
///     VkPresentStageFlagsEXT presentStageQueries;
///     VkPresentStageFlagsEXT targetTimeDomainPresentStage;
/// }
/// ```
public final class VkPresentTimingInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("targetTime"),
        ValueLayout.JAVA_LONG.withName("timeDomainId"),
        ValueLayout.JAVA_INT.withName("presentStageQueries"),
        ValueLayout.JAVA_INT.withName("targetTimeDomainPresentStage")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_targetTime = LAYOUT.byteOffset(PathElement.groupElement("targetTime"));
    public static final long OFFSET_timeDomainId = LAYOUT.byteOffset(PathElement.groupElement("timeDomainId"));
    public static final long OFFSET_presentStageQueries = LAYOUT.byteOffset(PathElement.groupElement("presentStageQueries"));
    public static final long OFFSET_targetTimeDomainPresentStage = LAYOUT.byteOffset(PathElement.groupElement("targetTimeDomainPresentStage"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_targetTime = LAYOUT.select(PathElement.groupElement("targetTime"));
    public static final MemoryLayout LAYOUT_timeDomainId = LAYOUT.select(PathElement.groupElement("timeDomainId"));
    public static final MemoryLayout LAYOUT_presentStageQueries = LAYOUT.select(PathElement.groupElement("presentStageQueries"));
    public static final MemoryLayout LAYOUT_targetTimeDomainPresentStage = LAYOUT.select(PathElement.groupElement("targetTimeDomainPresentStage"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_targetTime = LAYOUT.arrayElementVarHandle(PathElement.groupElement("targetTime"));
    public static final VarHandle VH_timeDomainId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timeDomainId"));
    public static final VarHandle VH_presentStageQueries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentStageQueries"));
    public static final VarHandle VH_targetTimeDomainPresentStage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("targetTimeDomainPresentStage"));

    public VkPresentTimingInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPresentTimingInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentTimingInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPresentTimingInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentTimingInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPresentTimingInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentTimingInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPresentTimingInfoEXT alloc(SegmentAllocator allocator) { return new VkPresentTimingInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPresentTimingInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPresentTimingInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPresentTimingInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTPresentTiming.VK_STRUCTURE_TYPE_PRESENT_TIMING_INFO_EXT); }
    public static VkPresentTimingInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTPresentTiming.VK_STRUCTURE_TYPE_PRESENT_TIMING_INFO_EXT);
        return s;
    }
    public VkPresentTimingInfoEXT copyFrom(VkPresentTimingInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPresentTimingInfoEXT reinterpret(long count) { return new VkPresentTimingInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPresentTimingInfoEXT asSlice(long index) { return new VkPresentTimingInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPresentTimingInfoEXT asSlice(long index, long count) { return new VkPresentTimingInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPresentTimingInfoEXT at(long index, Consumer<VkPresentTimingInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long targetTimeAt(long index) { return (long) VH_targetTime.get(this.segment(), 0L, index); }
    public long timeDomainIdAt(long index) { return (long) VH_timeDomainId.get(this.segment(), 0L, index); }
    public int presentStageQueriesAt(long index) { return (int) VH_presentStageQueries.get(this.segment(), 0L, index); }
    public int targetTimeDomainPresentStageAt(long index) { return (int) VH_targetTimeDomainPresentStage.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public long targetTime() { return (long) VH_targetTime.get(this.segment(), 0L, 0L); }
    public long timeDomainId() { return (long) VH_timeDomainId.get(this.segment(), 0L, 0L); }
    public int presentStageQueries() { return (int) VH_presentStageQueries.get(this.segment(), 0L, 0L); }
    public int targetTimeDomainPresentStage() { return (int) VH_targetTimeDomainPresentStage.get(this.segment(), 0L, 0L); }
    public VkPresentTimingInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPresentTimingInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPresentTimingInfoEXT flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPresentTimingInfoEXT targetTimeAt(long index, long value) { VH_targetTime.set(this.segment(), 0L, index, value); return this; }
    public VkPresentTimingInfoEXT timeDomainIdAt(long index, long value) { VH_timeDomainId.set(this.segment(), 0L, index, value); return this; }
    public VkPresentTimingInfoEXT presentStageQueriesAt(long index, int value) { VH_presentStageQueries.set(this.segment(), 0L, index, value); return this; }
    public VkPresentTimingInfoEXT targetTimeDomainPresentStageAt(long index, int value) { VH_targetTimeDomainPresentStage.set(this.segment(), 0L, index, value); return this; }
    public VkPresentTimingInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentTimingInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentTimingInfoEXT flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentTimingInfoEXT targetTime(long value) { VH_targetTime.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentTimingInfoEXT timeDomainId(long value) { VH_timeDomainId.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentTimingInfoEXT presentStageQueries(int value) { VH_presentStageQueries.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentTimingInfoEXT targetTimeDomainPresentStage(int value) { VH_targetTimeDomainPresentStage.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPresentTimingInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPresentTimingInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPresentTimingInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPresentTimingInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPresentTimingInfoEXT _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPresentTimingInfoEXT _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _targetTimeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_targetTime, index), LAYOUT_targetTime); }
    public MemorySegment _targetTime() { return _targetTimeAt(0L); }
    public VkPresentTimingInfoEXT _targetTimeAt(long index, MemorySegment src) { _targetTimeAt(index).copyFrom(src); return this; }
    public VkPresentTimingInfoEXT _targetTime(MemorySegment src) { return _targetTimeAt(0L, src); }
    public MemorySegment _timeDomainIdAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_timeDomainId, index), LAYOUT_timeDomainId); }
    public MemorySegment _timeDomainId() { return _timeDomainIdAt(0L); }
    public VkPresentTimingInfoEXT _timeDomainIdAt(long index, MemorySegment src) { _timeDomainIdAt(index).copyFrom(src); return this; }
    public VkPresentTimingInfoEXT _timeDomainId(MemorySegment src) { return _timeDomainIdAt(0L, src); }
    public MemorySegment _presentStageQueriesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentStageQueries, index), LAYOUT_presentStageQueries); }
    public MemorySegment _presentStageQueries() { return _presentStageQueriesAt(0L); }
    public VkPresentTimingInfoEXT _presentStageQueriesAt(long index, MemorySegment src) { _presentStageQueriesAt(index).copyFrom(src); return this; }
    public VkPresentTimingInfoEXT _presentStageQueries(MemorySegment src) { return _presentStageQueriesAt(0L, src); }
    public MemorySegment _targetTimeDomainPresentStageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_targetTimeDomainPresentStage, index), LAYOUT_targetTimeDomainPresentStage); }
    public MemorySegment _targetTimeDomainPresentStage() { return _targetTimeDomainPresentStageAt(0L); }
    public VkPresentTimingInfoEXT _targetTimeDomainPresentStageAt(long index, MemorySegment src) { _targetTimeDomainPresentStageAt(index).copyFrom(src); return this; }
    public VkPresentTimingInfoEXT _targetTimeDomainPresentStage(MemorySegment src) { return _targetTimeDomainPresentStageAt(0L, src); }
}
