// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPerformanceCounterARM`.
/// ## Layout
/// ```
/// struct VkPerformanceCounterARM {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t counterID;
/// }
/// ```
public final class VkPerformanceCounterARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("counterID")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_counterID = LAYOUT.byteOffset(PathElement.groupElement("counterID"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_counterID = LAYOUT.select(PathElement.groupElement("counterID"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_counterID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("counterID"));

    public VkPerformanceCounterARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPerformanceCounterARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceCounterARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPerformanceCounterARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceCounterARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPerformanceCounterARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceCounterARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPerformanceCounterARM alloc(SegmentAllocator allocator) { return new VkPerformanceCounterARM(allocator.allocate(LAYOUT), 1); }
    public static VkPerformanceCounterARM alloc(SegmentAllocator allocator, long count) { return new VkPerformanceCounterARM(allocator.allocate(LAYOUT, count), count); }
    public static VkPerformanceCounterARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_ARM); }
    public static VkPerformanceCounterARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_ARM);
        return s;
    }
    public VkPerformanceCounterARM copyFrom(VkPerformanceCounterARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPerformanceCounterARM reinterpret(long count) { return new VkPerformanceCounterARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPerformanceCounterARM asSlice(long index) { return new VkPerformanceCounterARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPerformanceCounterARM asSlice(long index, long count) { return new VkPerformanceCounterARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPerformanceCounterARM at(long index, Consumer<VkPerformanceCounterARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int counterIDAt(long index) { return (int) VH_counterID.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int counterID() { return (int) VH_counterID.get(this.segment(), 0L, 0L); }
    public VkPerformanceCounterARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceCounterARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceCounterARM counterIDAt(long index, int value) { VH_counterID.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceCounterARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceCounterARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceCounterARM counterID(int value) { VH_counterID.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPerformanceCounterARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPerformanceCounterARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPerformanceCounterARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPerformanceCounterARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _counterIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_counterID, index), LAYOUT_counterID); }
    public MemorySegment _counterID() { return _counterIDAt(0L); }
    public VkPerformanceCounterARM _counterIDAt(long index, MemorySegment src) { _counterIDAt(index).copyFrom(src); return this; }
    public VkPerformanceCounterARM _counterID(MemorySegment src) { return _counterIDAt(0L, src); }
}
