// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPerformanceQuerySubmitInfoKHR`.
/// ## Layout
/// ```
/// struct VkPerformanceQuerySubmitInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t counterPassIndex;
/// }
/// ```
public final class VkPerformanceQuerySubmitInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("counterPassIndex")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_counterPassIndex = LAYOUT.byteOffset(PathElement.groupElement("counterPassIndex"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_counterPassIndex = LAYOUT.select(PathElement.groupElement("counterPassIndex"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_counterPassIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("counterPassIndex"));

    public VkPerformanceQuerySubmitInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPerformanceQuerySubmitInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceQuerySubmitInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPerformanceQuerySubmitInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceQuerySubmitInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPerformanceQuerySubmitInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceQuerySubmitInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPerformanceQuerySubmitInfoKHR alloc(SegmentAllocator allocator) { return new VkPerformanceQuerySubmitInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPerformanceQuerySubmitInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPerformanceQuerySubmitInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPerformanceQuerySubmitInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR); }
    public static VkPerformanceQuerySubmitInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR);
        return s;
    }
    public VkPerformanceQuerySubmitInfoKHR copyFrom(VkPerformanceQuerySubmitInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPerformanceQuerySubmitInfoKHR reinterpret(long count) { return new VkPerformanceQuerySubmitInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPerformanceQuerySubmitInfoKHR asSlice(long index) { return new VkPerformanceQuerySubmitInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPerformanceQuerySubmitInfoKHR asSlice(long index, long count) { return new VkPerformanceQuerySubmitInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPerformanceQuerySubmitInfoKHR at(long index, Consumer<VkPerformanceQuerySubmitInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int counterPassIndexAt(long index) { return (int) VH_counterPassIndex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int counterPassIndex() { return (int) VH_counterPassIndex.get(this.segment(), 0L, 0L); }
    public VkPerformanceQuerySubmitInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceQuerySubmitInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceQuerySubmitInfoKHR counterPassIndexAt(long index, int value) { VH_counterPassIndex.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceQuerySubmitInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceQuerySubmitInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceQuerySubmitInfoKHR counterPassIndex(int value) { VH_counterPassIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPerformanceQuerySubmitInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPerformanceQuerySubmitInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPerformanceQuerySubmitInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPerformanceQuerySubmitInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _counterPassIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_counterPassIndex, index), LAYOUT_counterPassIndex); }
    public MemorySegment _counterPassIndex() { return _counterPassIndexAt(0L); }
    public VkPerformanceQuerySubmitInfoKHR _counterPassIndexAt(long index, MemorySegment src) { _counterPassIndexAt(index).copyFrom(src); return this; }
    public VkPerformanceQuerySubmitInfoKHR _counterPassIndex(MemorySegment src) { return _counterPassIndexAt(0L, src); }
}
