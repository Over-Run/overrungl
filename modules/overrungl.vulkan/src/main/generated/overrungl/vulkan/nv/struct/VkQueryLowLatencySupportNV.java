// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkQueryLowLatencySupportNV`.
/// ## Layout
/// ```
/// struct VkQueryLowLatencySupportNV {
///     VkStructureType sType;
///     const void* pNext;
///     void* pQueriedLowLatencyData;
/// }
/// ```
public final class VkQueryLowLatencySupportNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pQueriedLowLatencyData")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pQueriedLowLatencyData = LAYOUT.byteOffset(PathElement.groupElement("pQueriedLowLatencyData"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pQueriedLowLatencyData = LAYOUT.select(PathElement.groupElement("pQueriedLowLatencyData"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pQueriedLowLatencyData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQueriedLowLatencyData"));

    public VkQueryLowLatencySupportNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkQueryLowLatencySupportNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueryLowLatencySupportNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkQueryLowLatencySupportNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueryLowLatencySupportNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkQueryLowLatencySupportNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueryLowLatencySupportNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkQueryLowLatencySupportNV alloc(SegmentAllocator allocator) { return new VkQueryLowLatencySupportNV(allocator.allocate(LAYOUT), 1); }
    public static VkQueryLowLatencySupportNV alloc(SegmentAllocator allocator, long count) { return new VkQueryLowLatencySupportNV(allocator.allocate(LAYOUT, count), count); }
    public static VkQueryLowLatencySupportNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVLowLatency.VK_STRUCTURE_TYPE_QUERY_LOW_LATENCY_SUPPORT_NV); }
    public static VkQueryLowLatencySupportNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVLowLatency.VK_STRUCTURE_TYPE_QUERY_LOW_LATENCY_SUPPORT_NV);
        return s;
    }
    public VkQueryLowLatencySupportNV copyFrom(VkQueryLowLatencySupportNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkQueryLowLatencySupportNV reinterpret(long count) { return new VkQueryLowLatencySupportNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkQueryLowLatencySupportNV asSlice(long index) { return new VkQueryLowLatencySupportNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkQueryLowLatencySupportNV asSlice(long index, long count) { return new VkQueryLowLatencySupportNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkQueryLowLatencySupportNV at(long index, Consumer<VkQueryLowLatencySupportNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pQueriedLowLatencyDataAt(long index) { return (MemorySegment) VH_pQueriedLowLatencyData.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pQueriedLowLatencyData() { return (MemorySegment) VH_pQueriedLowLatencyData.get(this.segment(), 0L, 0L); }
    public VkQueryLowLatencySupportNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkQueryLowLatencySupportNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkQueryLowLatencySupportNV pQueriedLowLatencyDataAt(long index, MemorySegment value) { VH_pQueriedLowLatencyData.set(this.segment(), 0L, index, value); return this; }
    public VkQueryLowLatencySupportNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueryLowLatencySupportNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueryLowLatencySupportNV pQueriedLowLatencyData(MemorySegment value) { VH_pQueriedLowLatencyData.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkQueryLowLatencySupportNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkQueryLowLatencySupportNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkQueryLowLatencySupportNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkQueryLowLatencySupportNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pQueriedLowLatencyDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pQueriedLowLatencyData, index), LAYOUT_pQueriedLowLatencyData); }
    public MemorySegment _pQueriedLowLatencyData() { return _pQueriedLowLatencyDataAt(0L); }
    public VkQueryLowLatencySupportNV _pQueriedLowLatencyDataAt(long index, MemorySegment src) { _pQueriedLowLatencyDataAt(index).copyFrom(src); return this; }
    public VkQueryLowLatencySupportNV _pQueriedLowLatencyData(MemorySegment src) { return _pQueriedLowLatencyDataAt(0L, src); }
}
