// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.intel.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPerformanceMarkerInfoINTEL`.
/// ## Layout
/// ```
/// struct VkPerformanceMarkerInfoINTEL {
///     VkStructureType sType;
///     const void* pNext;
///     uint64_t marker;
/// }
/// ```
public final class VkPerformanceMarkerInfoINTEL extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("marker")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_marker = LAYOUT.byteOffset(PathElement.groupElement("marker"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_marker = LAYOUT.select(PathElement.groupElement("marker"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_marker = LAYOUT.arrayElementVarHandle(PathElement.groupElement("marker"));

    public VkPerformanceMarkerInfoINTEL(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPerformanceMarkerInfoINTEL of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceMarkerInfoINTEL(segment, estimateCount(segment, LAYOUT)); }
    public static VkPerformanceMarkerInfoINTEL ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceMarkerInfoINTEL(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPerformanceMarkerInfoINTEL ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceMarkerInfoINTEL(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPerformanceMarkerInfoINTEL alloc(SegmentAllocator allocator) { return new VkPerformanceMarkerInfoINTEL(allocator.allocate(LAYOUT), 1); }
    public static VkPerformanceMarkerInfoINTEL alloc(SegmentAllocator allocator, long count) { return new VkPerformanceMarkerInfoINTEL(allocator.allocate(LAYOUT, count), count); }
    public static VkPerformanceMarkerInfoINTEL allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.intel.VKINTELPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_MARKER_INFO_INTEL); }
    public static VkPerformanceMarkerInfoINTEL allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.intel.VKINTELPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_MARKER_INFO_INTEL);
        return s;
    }
    public VkPerformanceMarkerInfoINTEL copyFrom(VkPerformanceMarkerInfoINTEL src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPerformanceMarkerInfoINTEL reinterpret(long count) { return new VkPerformanceMarkerInfoINTEL(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPerformanceMarkerInfoINTEL asSlice(long index) { return new VkPerformanceMarkerInfoINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPerformanceMarkerInfoINTEL asSlice(long index, long count) { return new VkPerformanceMarkerInfoINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPerformanceMarkerInfoINTEL at(long index, Consumer<VkPerformanceMarkerInfoINTEL> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long markerAt(long index) { return (long) VH_marker.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long marker() { return (long) VH_marker.get(this.segment(), 0L, 0L); }
    public VkPerformanceMarkerInfoINTEL sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceMarkerInfoINTEL pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceMarkerInfoINTEL markerAt(long index, long value) { VH_marker.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceMarkerInfoINTEL sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceMarkerInfoINTEL pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceMarkerInfoINTEL marker(long value) { VH_marker.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPerformanceMarkerInfoINTEL _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPerformanceMarkerInfoINTEL _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPerformanceMarkerInfoINTEL _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPerformanceMarkerInfoINTEL _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _markerAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_marker, index), LAYOUT_marker); }
    public MemorySegment _marker() { return _markerAt(0L); }
    public VkPerformanceMarkerInfoINTEL _markerAt(long index, MemorySegment src) { _markerAt(index).copyFrom(src); return this; }
    public VkPerformanceMarkerInfoINTEL _marker(MemorySegment src) { return _markerAt(0L, src); }
}
