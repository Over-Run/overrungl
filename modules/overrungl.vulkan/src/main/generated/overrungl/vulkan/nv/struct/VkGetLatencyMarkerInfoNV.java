// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkGetLatencyMarkerInfoNV`.
/// ## Layout
/// ```
/// struct VkGetLatencyMarkerInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t timingCount;
///     VkLatencyTimingsFrameReportNV* pTimings;
/// }
/// ```
public final class VkGetLatencyMarkerInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("timingCount"),
        ValueLayout.ADDRESS.withName("pTimings")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_timingCount = LAYOUT.byteOffset(PathElement.groupElement("timingCount"));
    public static final long OFFSET_pTimings = LAYOUT.byteOffset(PathElement.groupElement("pTimings"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_timingCount = LAYOUT.select(PathElement.groupElement("timingCount"));
    public static final MemoryLayout LAYOUT_pTimings = LAYOUT.select(PathElement.groupElement("pTimings"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_timingCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timingCount"));
    public static final VarHandle VH_pTimings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTimings"));

    public VkGetLatencyMarkerInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkGetLatencyMarkerInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGetLatencyMarkerInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkGetLatencyMarkerInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGetLatencyMarkerInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkGetLatencyMarkerInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkGetLatencyMarkerInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkGetLatencyMarkerInfoNV alloc(SegmentAllocator allocator) { return new VkGetLatencyMarkerInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkGetLatencyMarkerInfoNV alloc(SegmentAllocator allocator, long count) { return new VkGetLatencyMarkerInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkGetLatencyMarkerInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVLowLatency2.VK_STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV); }
    public static VkGetLatencyMarkerInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVLowLatency2.VK_STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV);
        return s;
    }
    public VkGetLatencyMarkerInfoNV copyFrom(VkGetLatencyMarkerInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkGetLatencyMarkerInfoNV reinterpret(long count) { return new VkGetLatencyMarkerInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkGetLatencyMarkerInfoNV asSlice(long index) { return new VkGetLatencyMarkerInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkGetLatencyMarkerInfoNV asSlice(long index, long count) { return new VkGetLatencyMarkerInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkGetLatencyMarkerInfoNV at(long index, Consumer<VkGetLatencyMarkerInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int timingCountAt(long index) { return (int) VH_timingCount.get(this.segment(), 0L, index); }
    public MemorySegment pTimingsAt(long index) { return (MemorySegment) VH_pTimings.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int timingCount() { return (int) VH_timingCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pTimings() { return (MemorySegment) VH_pTimings.get(this.segment(), 0L, 0L); }
    public VkGetLatencyMarkerInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkGetLatencyMarkerInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkGetLatencyMarkerInfoNV timingCountAt(long index, int value) { VH_timingCount.set(this.segment(), 0L, index, value); return this; }
    public VkGetLatencyMarkerInfoNV pTimingsAt(long index, MemorySegment value) { VH_pTimings.set(this.segment(), 0L, index, value); return this; }
    public VkGetLatencyMarkerInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkGetLatencyMarkerInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkGetLatencyMarkerInfoNV timingCount(int value) { VH_timingCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkGetLatencyMarkerInfoNV pTimings(MemorySegment value) { VH_pTimings.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkGetLatencyMarkerInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkGetLatencyMarkerInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkGetLatencyMarkerInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkGetLatencyMarkerInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _timingCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_timingCount, index), LAYOUT_timingCount); }
    public MemorySegment _timingCount() { return _timingCountAt(0L); }
    public VkGetLatencyMarkerInfoNV _timingCountAt(long index, MemorySegment src) { _timingCountAt(index).copyFrom(src); return this; }
    public VkGetLatencyMarkerInfoNV _timingCount(MemorySegment src) { return _timingCountAt(0L, src); }
    public MemorySegment _pTimingsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pTimings, index), LAYOUT_pTimings); }
    public MemorySegment _pTimings() { return _pTimingsAt(0L); }
    public VkGetLatencyMarkerInfoNV _pTimingsAt(long index, MemorySegment src) { _pTimingsAt(index).copyFrom(src); return this; }
    public VkGetLatencyMarkerInfoNV _pTimings(MemorySegment src) { return _pTimingsAt(0L, src); }
}
