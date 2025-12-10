// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPastPresentationTimingPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPastPresentationTimingPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint64_t timingPropertiesCounter;
///     uint64_t timeDomainsCounter;
///     uint32_t presentationTimingCount;
///     VkPastPresentationTimingEXT* pPresentationTimings;
/// }
/// ```
public final class VkPastPresentationTimingPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("timingPropertiesCounter"),
        ValueLayout.JAVA_LONG.withName("timeDomainsCounter"),
        ValueLayout.JAVA_INT.withName("presentationTimingCount"),
        ValueLayout.ADDRESS.withName("pPresentationTimings")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_timingPropertiesCounter = LAYOUT.byteOffset(PathElement.groupElement("timingPropertiesCounter"));
    public static final long OFFSET_timeDomainsCounter = LAYOUT.byteOffset(PathElement.groupElement("timeDomainsCounter"));
    public static final long OFFSET_presentationTimingCount = LAYOUT.byteOffset(PathElement.groupElement("presentationTimingCount"));
    public static final long OFFSET_pPresentationTimings = LAYOUT.byteOffset(PathElement.groupElement("pPresentationTimings"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_timingPropertiesCounter = LAYOUT.select(PathElement.groupElement("timingPropertiesCounter"));
    public static final MemoryLayout LAYOUT_timeDomainsCounter = LAYOUT.select(PathElement.groupElement("timeDomainsCounter"));
    public static final MemoryLayout LAYOUT_presentationTimingCount = LAYOUT.select(PathElement.groupElement("presentationTimingCount"));
    public static final MemoryLayout LAYOUT_pPresentationTimings = LAYOUT.select(PathElement.groupElement("pPresentationTimings"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_timingPropertiesCounter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timingPropertiesCounter"));
    public static final VarHandle VH_timeDomainsCounter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timeDomainsCounter"));
    public static final VarHandle VH_presentationTimingCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentationTimingCount"));
    public static final VarHandle VH_pPresentationTimings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPresentationTimings"));

    public VkPastPresentationTimingPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPastPresentationTimingPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPastPresentationTimingPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPastPresentationTimingPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPastPresentationTimingPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPastPresentationTimingPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPastPresentationTimingPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPastPresentationTimingPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPastPresentationTimingPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPastPresentationTimingPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPastPresentationTimingPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPastPresentationTimingPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTPresentTiming.VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_PROPERTIES_EXT); }
    public static VkPastPresentationTimingPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTPresentTiming.VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_PROPERTIES_EXT);
        return s;
    }
    public VkPastPresentationTimingPropertiesEXT copyFrom(VkPastPresentationTimingPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPastPresentationTimingPropertiesEXT reinterpret(long count) { return new VkPastPresentationTimingPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPastPresentationTimingPropertiesEXT asSlice(long index) { return new VkPastPresentationTimingPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPastPresentationTimingPropertiesEXT asSlice(long index, long count) { return new VkPastPresentationTimingPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPastPresentationTimingPropertiesEXT at(long index, Consumer<VkPastPresentationTimingPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long timingPropertiesCounterAt(long index) { return (long) VH_timingPropertiesCounter.get(this.segment(), 0L, index); }
    public long timeDomainsCounterAt(long index) { return (long) VH_timeDomainsCounter.get(this.segment(), 0L, index); }
    public int presentationTimingCountAt(long index) { return (int) VH_presentationTimingCount.get(this.segment(), 0L, index); }
    public MemorySegment pPresentationTimingsAt(long index) { return (MemorySegment) VH_pPresentationTimings.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long timingPropertiesCounter() { return (long) VH_timingPropertiesCounter.get(this.segment(), 0L, 0L); }
    public long timeDomainsCounter() { return (long) VH_timeDomainsCounter.get(this.segment(), 0L, 0L); }
    public int presentationTimingCount() { return (int) VH_presentationTimingCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pPresentationTimings() { return (MemorySegment) VH_pPresentationTimings.get(this.segment(), 0L, 0L); }
    public VkPastPresentationTimingPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPastPresentationTimingPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPastPresentationTimingPropertiesEXT timingPropertiesCounterAt(long index, long value) { VH_timingPropertiesCounter.set(this.segment(), 0L, index, value); return this; }
    public VkPastPresentationTimingPropertiesEXT timeDomainsCounterAt(long index, long value) { VH_timeDomainsCounter.set(this.segment(), 0L, index, value); return this; }
    public VkPastPresentationTimingPropertiesEXT presentationTimingCountAt(long index, int value) { VH_presentationTimingCount.set(this.segment(), 0L, index, value); return this; }
    public VkPastPresentationTimingPropertiesEXT pPresentationTimingsAt(long index, MemorySegment value) { VH_pPresentationTimings.set(this.segment(), 0L, index, value); return this; }
    public VkPastPresentationTimingPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPastPresentationTimingPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPastPresentationTimingPropertiesEXT timingPropertiesCounter(long value) { VH_timingPropertiesCounter.set(this.segment(), 0L, 0L, value); return this; }
    public VkPastPresentationTimingPropertiesEXT timeDomainsCounter(long value) { VH_timeDomainsCounter.set(this.segment(), 0L, 0L, value); return this; }
    public VkPastPresentationTimingPropertiesEXT presentationTimingCount(int value) { VH_presentationTimingCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPastPresentationTimingPropertiesEXT pPresentationTimings(MemorySegment value) { VH_pPresentationTimings.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPastPresentationTimingPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPastPresentationTimingPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPastPresentationTimingPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPastPresentationTimingPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _timingPropertiesCounterAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_timingPropertiesCounter, index), LAYOUT_timingPropertiesCounter); }
    public MemorySegment _timingPropertiesCounter() { return _timingPropertiesCounterAt(0L); }
    public VkPastPresentationTimingPropertiesEXT _timingPropertiesCounterAt(long index, MemorySegment src) { _timingPropertiesCounterAt(index).copyFrom(src); return this; }
    public VkPastPresentationTimingPropertiesEXT _timingPropertiesCounter(MemorySegment src) { return _timingPropertiesCounterAt(0L, src); }
    public MemorySegment _timeDomainsCounterAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_timeDomainsCounter, index), LAYOUT_timeDomainsCounter); }
    public MemorySegment _timeDomainsCounter() { return _timeDomainsCounterAt(0L); }
    public VkPastPresentationTimingPropertiesEXT _timeDomainsCounterAt(long index, MemorySegment src) { _timeDomainsCounterAt(index).copyFrom(src); return this; }
    public VkPastPresentationTimingPropertiesEXT _timeDomainsCounter(MemorySegment src) { return _timeDomainsCounterAt(0L, src); }
    public MemorySegment _presentationTimingCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentationTimingCount, index), LAYOUT_presentationTimingCount); }
    public MemorySegment _presentationTimingCount() { return _presentationTimingCountAt(0L); }
    public VkPastPresentationTimingPropertiesEXT _presentationTimingCountAt(long index, MemorySegment src) { _presentationTimingCountAt(index).copyFrom(src); return this; }
    public VkPastPresentationTimingPropertiesEXT _presentationTimingCount(MemorySegment src) { return _presentationTimingCountAt(0L, src); }
    public MemorySegment _pPresentationTimingsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPresentationTimings, index), LAYOUT_pPresentationTimings); }
    public MemorySegment _pPresentationTimings() { return _pPresentationTimingsAt(0L); }
    public VkPastPresentationTimingPropertiesEXT _pPresentationTimingsAt(long index, MemorySegment src) { _pPresentationTimingsAt(index).copyFrom(src); return this; }
    public VkPastPresentationTimingPropertiesEXT _pPresentationTimings(MemorySegment src) { return _pPresentationTimingsAt(0L, src); }
}
