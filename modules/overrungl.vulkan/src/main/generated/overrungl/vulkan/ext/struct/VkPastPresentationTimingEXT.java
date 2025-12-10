// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPastPresentationTimingEXT`.
/// ## Layout
/// ```
/// struct VkPastPresentationTimingEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint64_t presentId;
///     uint64_t targetTime;
///     uint32_t presentStageCount;
///     VkPresentStageTimeEXT* pPresentStages;
///     VkTimeDomainKHR timeDomain;
///     uint64_t timeDomainId;
///     VkBool32 reportComplete;
/// }
/// ```
public final class VkPastPresentationTimingEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("presentId"),
        ValueLayout.JAVA_LONG.withName("targetTime"),
        ValueLayout.JAVA_INT.withName("presentStageCount"),
        ValueLayout.ADDRESS.withName("pPresentStages"),
        ValueLayout.JAVA_INT.withName("timeDomain"),
        ValueLayout.JAVA_LONG.withName("timeDomainId"),
        ValueLayout.JAVA_INT.withName("reportComplete")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_presentId = LAYOUT.byteOffset(PathElement.groupElement("presentId"));
    public static final long OFFSET_targetTime = LAYOUT.byteOffset(PathElement.groupElement("targetTime"));
    public static final long OFFSET_presentStageCount = LAYOUT.byteOffset(PathElement.groupElement("presentStageCount"));
    public static final long OFFSET_pPresentStages = LAYOUT.byteOffset(PathElement.groupElement("pPresentStages"));
    public static final long OFFSET_timeDomain = LAYOUT.byteOffset(PathElement.groupElement("timeDomain"));
    public static final long OFFSET_timeDomainId = LAYOUT.byteOffset(PathElement.groupElement("timeDomainId"));
    public static final long OFFSET_reportComplete = LAYOUT.byteOffset(PathElement.groupElement("reportComplete"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_presentId = LAYOUT.select(PathElement.groupElement("presentId"));
    public static final MemoryLayout LAYOUT_targetTime = LAYOUT.select(PathElement.groupElement("targetTime"));
    public static final MemoryLayout LAYOUT_presentStageCount = LAYOUT.select(PathElement.groupElement("presentStageCount"));
    public static final MemoryLayout LAYOUT_pPresentStages = LAYOUT.select(PathElement.groupElement("pPresentStages"));
    public static final MemoryLayout LAYOUT_timeDomain = LAYOUT.select(PathElement.groupElement("timeDomain"));
    public static final MemoryLayout LAYOUT_timeDomainId = LAYOUT.select(PathElement.groupElement("timeDomainId"));
    public static final MemoryLayout LAYOUT_reportComplete = LAYOUT.select(PathElement.groupElement("reportComplete"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_presentId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentId"));
    public static final VarHandle VH_targetTime = LAYOUT.arrayElementVarHandle(PathElement.groupElement("targetTime"));
    public static final VarHandle VH_presentStageCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentStageCount"));
    public static final VarHandle VH_pPresentStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPresentStages"));
    public static final VarHandle VH_timeDomain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timeDomain"));
    public static final VarHandle VH_timeDomainId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timeDomainId"));
    public static final VarHandle VH_reportComplete = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reportComplete"));

    public VkPastPresentationTimingEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPastPresentationTimingEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPastPresentationTimingEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPastPresentationTimingEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPastPresentationTimingEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPastPresentationTimingEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPastPresentationTimingEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPastPresentationTimingEXT alloc(SegmentAllocator allocator) { return new VkPastPresentationTimingEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPastPresentationTimingEXT alloc(SegmentAllocator allocator, long count) { return new VkPastPresentationTimingEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPastPresentationTimingEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTPresentTiming.VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_EXT); }
    public static VkPastPresentationTimingEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTPresentTiming.VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_EXT);
        return s;
    }
    public VkPastPresentationTimingEXT copyFrom(VkPastPresentationTimingEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPastPresentationTimingEXT reinterpret(long count) { return new VkPastPresentationTimingEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPastPresentationTimingEXT asSlice(long index) { return new VkPastPresentationTimingEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPastPresentationTimingEXT asSlice(long index, long count) { return new VkPastPresentationTimingEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPastPresentationTimingEXT at(long index, Consumer<VkPastPresentationTimingEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long presentIdAt(long index) { return (long) VH_presentId.get(this.segment(), 0L, index); }
    public long targetTimeAt(long index) { return (long) VH_targetTime.get(this.segment(), 0L, index); }
    public int presentStageCountAt(long index) { return (int) VH_presentStageCount.get(this.segment(), 0L, index); }
    public MemorySegment pPresentStagesAt(long index) { return (MemorySegment) VH_pPresentStages.get(this.segment(), 0L, index); }
    public int timeDomainAt(long index) { return (int) VH_timeDomain.get(this.segment(), 0L, index); }
    public long timeDomainIdAt(long index) { return (long) VH_timeDomainId.get(this.segment(), 0L, index); }
    public int reportCompleteAt(long index) { return (int) VH_reportComplete.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long presentId() { return (long) VH_presentId.get(this.segment(), 0L, 0L); }
    public long targetTime() { return (long) VH_targetTime.get(this.segment(), 0L, 0L); }
    public int presentStageCount() { return (int) VH_presentStageCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pPresentStages() { return (MemorySegment) VH_pPresentStages.get(this.segment(), 0L, 0L); }
    public int timeDomain() { return (int) VH_timeDomain.get(this.segment(), 0L, 0L); }
    public long timeDomainId() { return (long) VH_timeDomainId.get(this.segment(), 0L, 0L); }
    public int reportComplete() { return (int) VH_reportComplete.get(this.segment(), 0L, 0L); }
    public VkPastPresentationTimingEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPastPresentationTimingEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPastPresentationTimingEXT presentIdAt(long index, long value) { VH_presentId.set(this.segment(), 0L, index, value); return this; }
    public VkPastPresentationTimingEXT targetTimeAt(long index, long value) { VH_targetTime.set(this.segment(), 0L, index, value); return this; }
    public VkPastPresentationTimingEXT presentStageCountAt(long index, int value) { VH_presentStageCount.set(this.segment(), 0L, index, value); return this; }
    public VkPastPresentationTimingEXT pPresentStagesAt(long index, MemorySegment value) { VH_pPresentStages.set(this.segment(), 0L, index, value); return this; }
    public VkPastPresentationTimingEXT timeDomainAt(long index, int value) { VH_timeDomain.set(this.segment(), 0L, index, value); return this; }
    public VkPastPresentationTimingEXT timeDomainIdAt(long index, long value) { VH_timeDomainId.set(this.segment(), 0L, index, value); return this; }
    public VkPastPresentationTimingEXT reportCompleteAt(long index, int value) { VH_reportComplete.set(this.segment(), 0L, index, value); return this; }
    public VkPastPresentationTimingEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPastPresentationTimingEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPastPresentationTimingEXT presentId(long value) { VH_presentId.set(this.segment(), 0L, 0L, value); return this; }
    public VkPastPresentationTimingEXT targetTime(long value) { VH_targetTime.set(this.segment(), 0L, 0L, value); return this; }
    public VkPastPresentationTimingEXT presentStageCount(int value) { VH_presentStageCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPastPresentationTimingEXT pPresentStages(MemorySegment value) { VH_pPresentStages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPastPresentationTimingEXT timeDomain(int value) { VH_timeDomain.set(this.segment(), 0L, 0L, value); return this; }
    public VkPastPresentationTimingEXT timeDomainId(long value) { VH_timeDomainId.set(this.segment(), 0L, 0L, value); return this; }
    public VkPastPresentationTimingEXT reportComplete(int value) { VH_reportComplete.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPastPresentationTimingEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPastPresentationTimingEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPastPresentationTimingEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPastPresentationTimingEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _presentIdAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentId, index), LAYOUT_presentId); }
    public MemorySegment _presentId() { return _presentIdAt(0L); }
    public VkPastPresentationTimingEXT _presentIdAt(long index, MemorySegment src) { _presentIdAt(index).copyFrom(src); return this; }
    public VkPastPresentationTimingEXT _presentId(MemorySegment src) { return _presentIdAt(0L, src); }
    public MemorySegment _targetTimeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_targetTime, index), LAYOUT_targetTime); }
    public MemorySegment _targetTime() { return _targetTimeAt(0L); }
    public VkPastPresentationTimingEXT _targetTimeAt(long index, MemorySegment src) { _targetTimeAt(index).copyFrom(src); return this; }
    public VkPastPresentationTimingEXT _targetTime(MemorySegment src) { return _targetTimeAt(0L, src); }
    public MemorySegment _presentStageCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentStageCount, index), LAYOUT_presentStageCount); }
    public MemorySegment _presentStageCount() { return _presentStageCountAt(0L); }
    public VkPastPresentationTimingEXT _presentStageCountAt(long index, MemorySegment src) { _presentStageCountAt(index).copyFrom(src); return this; }
    public VkPastPresentationTimingEXT _presentStageCount(MemorySegment src) { return _presentStageCountAt(0L, src); }
    public MemorySegment _pPresentStagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPresentStages, index), LAYOUT_pPresentStages); }
    public MemorySegment _pPresentStages() { return _pPresentStagesAt(0L); }
    public VkPastPresentationTimingEXT _pPresentStagesAt(long index, MemorySegment src) { _pPresentStagesAt(index).copyFrom(src); return this; }
    public VkPastPresentationTimingEXT _pPresentStages(MemorySegment src) { return _pPresentStagesAt(0L, src); }
    public MemorySegment _timeDomainAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_timeDomain, index), LAYOUT_timeDomain); }
    public MemorySegment _timeDomain() { return _timeDomainAt(0L); }
    public VkPastPresentationTimingEXT _timeDomainAt(long index, MemorySegment src) { _timeDomainAt(index).copyFrom(src); return this; }
    public VkPastPresentationTimingEXT _timeDomain(MemorySegment src) { return _timeDomainAt(0L, src); }
    public MemorySegment _timeDomainIdAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_timeDomainId, index), LAYOUT_timeDomainId); }
    public MemorySegment _timeDomainId() { return _timeDomainIdAt(0L); }
    public VkPastPresentationTimingEXT _timeDomainIdAt(long index, MemorySegment src) { _timeDomainIdAt(index).copyFrom(src); return this; }
    public VkPastPresentationTimingEXT _timeDomainId(MemorySegment src) { return _timeDomainIdAt(0L, src); }
    public MemorySegment _reportCompleteAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_reportComplete, index), LAYOUT_reportComplete); }
    public MemorySegment _reportComplete() { return _reportCompleteAt(0L); }
    public VkPastPresentationTimingEXT _reportCompleteAt(long index, MemorySegment src) { _reportCompleteAt(index).copyFrom(src); return this; }
    public VkPastPresentationTimingEXT _reportComplete(MemorySegment src) { return _reportCompleteAt(0L, src); }
}
