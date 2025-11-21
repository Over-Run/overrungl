// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSetLatencyMarkerInfoNV`.
/// ## Layout
/// ```
/// struct VkSetLatencyMarkerInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     uint64_t presentID;
///     VkLatencyMarkerNV marker;
/// }
/// ```
public final class VkSetLatencyMarkerInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("presentID"),
        ValueLayout.JAVA_INT.withName("marker")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_presentID = LAYOUT.byteOffset(PathElement.groupElement("presentID"));
    public static final long OFFSET_marker = LAYOUT.byteOffset(PathElement.groupElement("marker"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_presentID = LAYOUT.select(PathElement.groupElement("presentID"));
    public static final MemoryLayout LAYOUT_marker = LAYOUT.select(PathElement.groupElement("marker"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_presentID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentID"));
    public static final VarHandle VH_marker = LAYOUT.arrayElementVarHandle(PathElement.groupElement("marker"));

    public VkSetLatencyMarkerInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSetLatencyMarkerInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSetLatencyMarkerInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkSetLatencyMarkerInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSetLatencyMarkerInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSetLatencyMarkerInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSetLatencyMarkerInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSetLatencyMarkerInfoNV alloc(SegmentAllocator allocator) { return new VkSetLatencyMarkerInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkSetLatencyMarkerInfoNV alloc(SegmentAllocator allocator, long count) { return new VkSetLatencyMarkerInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkSetLatencyMarkerInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVLowLatency2.VK_STRUCTURE_TYPE_SET_LATENCY_MARKER_INFO_NV); }
    public static VkSetLatencyMarkerInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVLowLatency2.VK_STRUCTURE_TYPE_SET_LATENCY_MARKER_INFO_NV);
        return s;
    }
    public VkSetLatencyMarkerInfoNV copyFrom(VkSetLatencyMarkerInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSetLatencyMarkerInfoNV reinterpret(long count) { return new VkSetLatencyMarkerInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSetLatencyMarkerInfoNV asSlice(long index) { return new VkSetLatencyMarkerInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSetLatencyMarkerInfoNV asSlice(long index, long count) { return new VkSetLatencyMarkerInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSetLatencyMarkerInfoNV at(long index, Consumer<VkSetLatencyMarkerInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long presentIDAt(long index) { return (long) VH_presentID.get(this.segment(), 0L, index); }
    public int markerAt(long index) { return (int) VH_marker.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long presentID() { return (long) VH_presentID.get(this.segment(), 0L, 0L); }
    public int marker() { return (int) VH_marker.get(this.segment(), 0L, 0L); }
    public VkSetLatencyMarkerInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSetLatencyMarkerInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSetLatencyMarkerInfoNV presentIDAt(long index, long value) { VH_presentID.set(this.segment(), 0L, index, value); return this; }
    public VkSetLatencyMarkerInfoNV markerAt(long index, int value) { VH_marker.set(this.segment(), 0L, index, value); return this; }
    public VkSetLatencyMarkerInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSetLatencyMarkerInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSetLatencyMarkerInfoNV presentID(long value) { VH_presentID.set(this.segment(), 0L, 0L, value); return this; }
    public VkSetLatencyMarkerInfoNV marker(int value) { VH_marker.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSetLatencyMarkerInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSetLatencyMarkerInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSetLatencyMarkerInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSetLatencyMarkerInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _presentIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentID, index), LAYOUT_presentID); }
    public MemorySegment _presentID() { return _presentIDAt(0L); }
    public VkSetLatencyMarkerInfoNV _presentIDAt(long index, MemorySegment src) { _presentIDAt(index).copyFrom(src); return this; }
    public VkSetLatencyMarkerInfoNV _presentID(MemorySegment src) { return _presentIDAt(0L, src); }
    public MemorySegment _markerAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_marker, index), LAYOUT_marker); }
    public MemorySegment _marker() { return _markerAt(0L); }
    public VkSetLatencyMarkerInfoNV _markerAt(long index, MemorySegment src) { _markerAt(index).copyFrom(src); return this; }
    public VkSetLatencyMarkerInfoNV _marker(MemorySegment src) { return _markerAt(0L, src); }
}
