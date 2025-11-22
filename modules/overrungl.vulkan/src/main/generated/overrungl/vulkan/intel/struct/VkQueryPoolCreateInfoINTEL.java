// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.intel.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkQueryPoolCreateInfoINTEL`.
/// ## Layout
/// ```
/// struct VkQueryPoolCreateInfoINTEL {
///     VkStructureType sType;
///     const void* pNext;
///     VkQueryPoolSamplingModeINTEL performanceCountersSampling;
/// }
/// ```
public final class VkQueryPoolCreateInfoINTEL extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("performanceCountersSampling")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_performanceCountersSampling = LAYOUT.byteOffset(PathElement.groupElement("performanceCountersSampling"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_performanceCountersSampling = LAYOUT.select(PathElement.groupElement("performanceCountersSampling"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_performanceCountersSampling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("performanceCountersSampling"));

    public VkQueryPoolCreateInfoINTEL(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkQueryPoolCreateInfoINTEL of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueryPoolCreateInfoINTEL(segment, estimateCount(segment, LAYOUT)); }
    public static VkQueryPoolCreateInfoINTEL ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueryPoolCreateInfoINTEL(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkQueryPoolCreateInfoINTEL ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueryPoolCreateInfoINTEL(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkQueryPoolCreateInfoINTEL alloc(SegmentAllocator allocator) { return new VkQueryPoolCreateInfoINTEL(allocator.allocate(LAYOUT), 1); }
    public static VkQueryPoolCreateInfoINTEL alloc(SegmentAllocator allocator, long count) { return new VkQueryPoolCreateInfoINTEL(allocator.allocate(LAYOUT, count), count); }
    public static VkQueryPoolCreateInfoINTEL allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.intel.VKINTELPerformanceQuery.VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL); }
    public static VkQueryPoolCreateInfoINTEL allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.intel.VKINTELPerformanceQuery.VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL);
        return s;
    }
    public VkQueryPoolCreateInfoINTEL copyFrom(VkQueryPoolCreateInfoINTEL src) { this.segment().copyFrom(src.segment()); return this; }
    public VkQueryPoolCreateInfoINTEL reinterpret(long count) { return new VkQueryPoolCreateInfoINTEL(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkQueryPoolCreateInfoINTEL asSlice(long index) { return new VkQueryPoolCreateInfoINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkQueryPoolCreateInfoINTEL asSlice(long index, long count) { return new VkQueryPoolCreateInfoINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkQueryPoolCreateInfoINTEL at(long index, Consumer<VkQueryPoolCreateInfoINTEL> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int performanceCountersSamplingAt(long index) { return (int) VH_performanceCountersSampling.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int performanceCountersSampling() { return (int) VH_performanceCountersSampling.get(this.segment(), 0L, 0L); }
    public VkQueryPoolCreateInfoINTEL sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkQueryPoolCreateInfoINTEL pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkQueryPoolCreateInfoINTEL performanceCountersSamplingAt(long index, int value) { VH_performanceCountersSampling.set(this.segment(), 0L, index, value); return this; }
    public VkQueryPoolCreateInfoINTEL sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueryPoolCreateInfoINTEL pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkQueryPoolCreateInfoINTEL performanceCountersSampling(int value) { VH_performanceCountersSampling.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkQueryPoolCreateInfoINTEL _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkQueryPoolCreateInfoINTEL _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkQueryPoolCreateInfoINTEL _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkQueryPoolCreateInfoINTEL _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _performanceCountersSamplingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_performanceCountersSampling, index), LAYOUT_performanceCountersSampling); }
    public MemorySegment _performanceCountersSampling() { return _performanceCountersSamplingAt(0L); }
    public VkQueryPoolCreateInfoINTEL _performanceCountersSamplingAt(long index, MemorySegment src) { _performanceCountersSamplingAt(index).copyFrom(src); return this; }
    public VkQueryPoolCreateInfoINTEL _performanceCountersSampling(MemorySegment src) { return _performanceCountersSamplingAt(0L, src); }
}
