// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePerformanceQueryFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePerformanceQueryFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 performanceCounterQueryPools;
///     VkBool32 performanceCounterMultipleQueryPools;
/// }
/// ```
public final class VkPhysicalDevicePerformanceQueryFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("performanceCounterQueryPools"),
        ValueLayout.JAVA_INT.withName("performanceCounterMultipleQueryPools")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_performanceCounterQueryPools = LAYOUT.byteOffset(PathElement.groupElement("performanceCounterQueryPools"));
    public static final long OFFSET_performanceCounterMultipleQueryPools = LAYOUT.byteOffset(PathElement.groupElement("performanceCounterMultipleQueryPools"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_performanceCounterQueryPools = LAYOUT.select(PathElement.groupElement("performanceCounterQueryPools"));
    public static final MemoryLayout LAYOUT_performanceCounterMultipleQueryPools = LAYOUT.select(PathElement.groupElement("performanceCounterMultipleQueryPools"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_performanceCounterQueryPools = LAYOUT.arrayElementVarHandle(PathElement.groupElement("performanceCounterQueryPools"));
    public static final VarHandle VH_performanceCounterMultipleQueryPools = LAYOUT.arrayElementVarHandle(PathElement.groupElement("performanceCounterMultipleQueryPools"));

    public VkPhysicalDevicePerformanceQueryFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePerformanceQueryFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePerformanceQueryFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePerformanceQueryFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePerformanceQueryFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePerformanceQueryFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPerformanceQuery.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR); }
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPerformanceQuery.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDevicePerformanceQueryFeaturesKHR copyFrom(VkPhysicalDevicePerformanceQueryFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePerformanceQueryFeaturesKHR reinterpret(long count) { return new VkPhysicalDevicePerformanceQueryFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePerformanceQueryFeaturesKHR asSlice(long index) { return new VkPhysicalDevicePerformanceQueryFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePerformanceQueryFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDevicePerformanceQueryFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePerformanceQueryFeaturesKHR at(long index, Consumer<VkPhysicalDevicePerformanceQueryFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int performanceCounterQueryPoolsAt(long index) { return (int) VH_performanceCounterQueryPools.get(this.segment(), 0L, index); }
    public int performanceCounterMultipleQueryPoolsAt(long index) { return (int) VH_performanceCounterMultipleQueryPools.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int performanceCounterQueryPools() { return (int) VH_performanceCounterQueryPools.get(this.segment(), 0L, 0L); }
    public int performanceCounterMultipleQueryPools() { return (int) VH_performanceCounterMultipleQueryPools.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePerformanceQueryFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePerformanceQueryFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePerformanceQueryFeaturesKHR performanceCounterQueryPoolsAt(long index, int value) { VH_performanceCounterQueryPools.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePerformanceQueryFeaturesKHR performanceCounterMultipleQueryPoolsAt(long index, int value) { VH_performanceCounterMultipleQueryPools.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePerformanceQueryFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePerformanceQueryFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePerformanceQueryFeaturesKHR performanceCounterQueryPools(int value) { VH_performanceCounterQueryPools.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePerformanceQueryFeaturesKHR performanceCounterMultipleQueryPools(int value) { VH_performanceCounterMultipleQueryPools.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePerformanceQueryFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePerformanceQueryFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePerformanceQueryFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePerformanceQueryFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _performanceCounterQueryPoolsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_performanceCounterQueryPools, index), LAYOUT_performanceCounterQueryPools); }
    public MemorySegment _performanceCounterQueryPools() { return _performanceCounterQueryPoolsAt(0L); }
    public VkPhysicalDevicePerformanceQueryFeaturesKHR _performanceCounterQueryPoolsAt(long index, MemorySegment src) { _performanceCounterQueryPoolsAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePerformanceQueryFeaturesKHR _performanceCounterQueryPools(MemorySegment src) { return _performanceCounterQueryPoolsAt(0L, src); }
    public MemorySegment _performanceCounterMultipleQueryPoolsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_performanceCounterMultipleQueryPools, index), LAYOUT_performanceCounterMultipleQueryPools); }
    public MemorySegment _performanceCounterMultipleQueryPools() { return _performanceCounterMultipleQueryPoolsAt(0L); }
    public VkPhysicalDevicePerformanceQueryFeaturesKHR _performanceCounterMultipleQueryPoolsAt(long index, MemorySegment src) { _performanceCounterMultipleQueryPoolsAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePerformanceQueryFeaturesKHR _performanceCounterMultipleQueryPools(MemorySegment src) { return _performanceCounterMultipleQueryPoolsAt(0L, src); }
}
