// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.intel.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPerformanceStreamMarkerInfoINTEL`.
/// ## Layout
/// ```
/// struct VkPerformanceStreamMarkerInfoINTEL {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t marker;
/// }
/// ```
public final class VkPerformanceStreamMarkerInfoINTEL extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("marker")
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

    public VkPerformanceStreamMarkerInfoINTEL(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPerformanceStreamMarkerInfoINTEL of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceStreamMarkerInfoINTEL(segment, estimateCount(segment, LAYOUT)); }
    public static VkPerformanceStreamMarkerInfoINTEL ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceStreamMarkerInfoINTEL(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPerformanceStreamMarkerInfoINTEL ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceStreamMarkerInfoINTEL(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPerformanceStreamMarkerInfoINTEL alloc(SegmentAllocator allocator) { return new VkPerformanceStreamMarkerInfoINTEL(allocator.allocate(LAYOUT), 1); }
    public static VkPerformanceStreamMarkerInfoINTEL alloc(SegmentAllocator allocator, long count) { return new VkPerformanceStreamMarkerInfoINTEL(allocator.allocate(LAYOUT, count), count); }
    public static VkPerformanceStreamMarkerInfoINTEL allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.intel.VKINTELPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL); }
    public static VkPerformanceStreamMarkerInfoINTEL allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.intel.VKINTELPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL);
        return s;
    }
    public VkPerformanceStreamMarkerInfoINTEL copyFrom(VkPerformanceStreamMarkerInfoINTEL src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPerformanceStreamMarkerInfoINTEL reinterpret(long count) { return new VkPerformanceStreamMarkerInfoINTEL(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPerformanceStreamMarkerInfoINTEL asSlice(long index) { return new VkPerformanceStreamMarkerInfoINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPerformanceStreamMarkerInfoINTEL asSlice(long index, long count) { return new VkPerformanceStreamMarkerInfoINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPerformanceStreamMarkerInfoINTEL at(long index, Consumer<VkPerformanceStreamMarkerInfoINTEL> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int markerAt(long index) { return (int) VH_marker.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int marker() { return (int) VH_marker.get(this.segment(), 0L, 0L); }
    public VkPerformanceStreamMarkerInfoINTEL sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceStreamMarkerInfoINTEL pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceStreamMarkerInfoINTEL markerAt(long index, int value) { VH_marker.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceStreamMarkerInfoINTEL sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceStreamMarkerInfoINTEL pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceStreamMarkerInfoINTEL marker(int value) { VH_marker.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPerformanceStreamMarkerInfoINTEL _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPerformanceStreamMarkerInfoINTEL _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPerformanceStreamMarkerInfoINTEL _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPerformanceStreamMarkerInfoINTEL _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _markerAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_marker, index), LAYOUT_marker); }
    public MemorySegment _marker() { return _markerAt(0L); }
    public VkPerformanceStreamMarkerInfoINTEL _markerAt(long index, MemorySegment src) { _markerAt(index).copyFrom(src); return this; }
    public VkPerformanceStreamMarkerInfoINTEL _marker(MemorySegment src) { return _markerAt(0L, src); }
}
