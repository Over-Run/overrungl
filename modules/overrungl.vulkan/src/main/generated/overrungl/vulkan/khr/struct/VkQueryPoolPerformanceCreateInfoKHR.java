// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkQueryPoolPerformanceCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkQueryPoolPerformanceCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t queueFamilyIndex;
///     uint32_t counterIndexCount;
///     const uint32_t* pCounterIndices;
/// }
/// ```
public final class VkQueryPoolPerformanceCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("counterIndexCount"),
        ValueLayout.ADDRESS.withName("pCounterIndices")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_queueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndex"));
    public static final long OFFSET_counterIndexCount = LAYOUT.byteOffset(PathElement.groupElement("counterIndexCount"));
    public static final long OFFSET_pCounterIndices = LAYOUT.byteOffset(PathElement.groupElement("pCounterIndices"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_queueFamilyIndex = LAYOUT.select(PathElement.groupElement("queueFamilyIndex"));
    public static final MemoryLayout LAYOUT_counterIndexCount = LAYOUT.select(PathElement.groupElement("counterIndexCount"));
    public static final MemoryLayout LAYOUT_pCounterIndices = LAYOUT.select(PathElement.groupElement("pCounterIndices"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_queueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndex"));
    public static final VarHandle VH_counterIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("counterIndexCount"));
    public static final VarHandle VH_pCounterIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCounterIndices"));

    public VkQueryPoolPerformanceCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkQueryPoolPerformanceCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueryPoolPerformanceCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkQueryPoolPerformanceCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueryPoolPerformanceCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkQueryPoolPerformanceCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueryPoolPerformanceCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkQueryPoolPerformanceCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkQueryPoolPerformanceCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkQueryPoolPerformanceCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkQueryPoolPerformanceCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkQueryPoolPerformanceCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPerformanceQuery.VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR); }
    public static VkQueryPoolPerformanceCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPerformanceQuery.VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR);
        return s;
    }
    public VkQueryPoolPerformanceCreateInfoKHR copyFrom(VkQueryPoolPerformanceCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkQueryPoolPerformanceCreateInfoKHR reinterpret(long count) { return new VkQueryPoolPerformanceCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkQueryPoolPerformanceCreateInfoKHR asSlice(long index) { return new VkQueryPoolPerformanceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkQueryPoolPerformanceCreateInfoKHR asSlice(long index, long count) { return new VkQueryPoolPerformanceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkQueryPoolPerformanceCreateInfoKHR at(long index, Consumer<VkQueryPoolPerformanceCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int queueFamilyIndexAt(long index) { return (int) VH_queueFamilyIndex.get(this.segment(), 0L, index); }
    public int counterIndexCountAt(long index) { return (int) VH_counterIndexCount.get(this.segment(), 0L, index); }
    public MemorySegment pCounterIndicesAt(long index) { return (MemorySegment) VH_pCounterIndices.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int queueFamilyIndex() { return (int) VH_queueFamilyIndex.get(this.segment(), 0L, 0L); }
    public int counterIndexCount() { return (int) VH_counterIndexCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pCounterIndices() { return (MemorySegment) VH_pCounterIndices.get(this.segment(), 0L, 0L); }
    public VkQueryPoolPerformanceCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkQueryPoolPerformanceCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkQueryPoolPerformanceCreateInfoKHR queueFamilyIndexAt(long index, int value) { VH_queueFamilyIndex.set(this.segment(), 0L, index, value); return this; }
    public VkQueryPoolPerformanceCreateInfoKHR counterIndexCountAt(long index, int value) { VH_counterIndexCount.set(this.segment(), 0L, index, value); return this; }
    public VkQueryPoolPerformanceCreateInfoKHR pCounterIndicesAt(long index, MemorySegment value) { VH_pCounterIndices.set(this.segment(), 0L, index, value); return this; }
    public VkQueryPoolPerformanceCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueryPoolPerformanceCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueryPoolPerformanceCreateInfoKHR queueFamilyIndex(int value) { VH_queueFamilyIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueryPoolPerformanceCreateInfoKHR counterIndexCount(int value) { VH_counterIndexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueryPoolPerformanceCreateInfoKHR pCounterIndices(MemorySegment value) { VH_pCounterIndices.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkQueryPoolPerformanceCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkQueryPoolPerformanceCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkQueryPoolPerformanceCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkQueryPoolPerformanceCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _queueFamilyIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queueFamilyIndex, index), LAYOUT_queueFamilyIndex); }
    public MemorySegment _queueFamilyIndex() { return _queueFamilyIndexAt(0L); }
    public VkQueryPoolPerformanceCreateInfoKHR _queueFamilyIndexAt(long index, MemorySegment src) { _queueFamilyIndexAt(index).copyFrom(src); return this; }
    public VkQueryPoolPerformanceCreateInfoKHR _queueFamilyIndex(MemorySegment src) { return _queueFamilyIndexAt(0L, src); }
    public MemorySegment _counterIndexCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_counterIndexCount, index), LAYOUT_counterIndexCount); }
    public MemorySegment _counterIndexCount() { return _counterIndexCountAt(0L); }
    public VkQueryPoolPerformanceCreateInfoKHR _counterIndexCountAt(long index, MemorySegment src) { _counterIndexCountAt(index).copyFrom(src); return this; }
    public VkQueryPoolPerformanceCreateInfoKHR _counterIndexCount(MemorySegment src) { return _counterIndexCountAt(0L, src); }
    public MemorySegment _pCounterIndicesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pCounterIndices, index), LAYOUT_pCounterIndices); }
    public MemorySegment _pCounterIndices() { return _pCounterIndicesAt(0L); }
    public VkQueryPoolPerformanceCreateInfoKHR _pCounterIndicesAt(long index, MemorySegment src) { _pCounterIndicesAt(index).copyFrom(src); return this; }
    public VkQueryPoolPerformanceCreateInfoKHR _pCounterIndices(MemorySegment src) { return _pCounterIndicesAt(0L, src); }
}
