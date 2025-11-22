// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.intel.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkInitializePerformanceApiInfoINTEL`.
/// ## Layout
/// ```
/// struct VkInitializePerformanceApiInfoINTEL {
///     VkStructureType sType;
///     const void* pNext;
///     void* pUserData;
/// }
/// ```
public final class VkInitializePerformanceApiInfoINTEL extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pUserData")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pUserData = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pUserData = LAYOUT.select(PathElement.groupElement("pUserData"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pUserData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUserData"));

    public VkInitializePerformanceApiInfoINTEL(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkInitializePerformanceApiInfoINTEL of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkInitializePerformanceApiInfoINTEL(segment, estimateCount(segment, LAYOUT)); }
    public static VkInitializePerformanceApiInfoINTEL ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkInitializePerformanceApiInfoINTEL(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkInitializePerformanceApiInfoINTEL ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkInitializePerformanceApiInfoINTEL(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkInitializePerformanceApiInfoINTEL alloc(SegmentAllocator allocator) { return new VkInitializePerformanceApiInfoINTEL(allocator.allocate(LAYOUT), 1); }
    public static VkInitializePerformanceApiInfoINTEL alloc(SegmentAllocator allocator, long count) { return new VkInitializePerformanceApiInfoINTEL(allocator.allocate(LAYOUT, count), count); }
    public static VkInitializePerformanceApiInfoINTEL allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.intel.VKINTELPerformanceQuery.VK_STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL); }
    public static VkInitializePerformanceApiInfoINTEL allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.intel.VKINTELPerformanceQuery.VK_STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL);
        return s;
    }
    public VkInitializePerformanceApiInfoINTEL copyFrom(VkInitializePerformanceApiInfoINTEL src) { this.segment().copyFrom(src.segment()); return this; }
    public VkInitializePerformanceApiInfoINTEL reinterpret(long count) { return new VkInitializePerformanceApiInfoINTEL(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkInitializePerformanceApiInfoINTEL asSlice(long index) { return new VkInitializePerformanceApiInfoINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkInitializePerformanceApiInfoINTEL asSlice(long index, long count) { return new VkInitializePerformanceApiInfoINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkInitializePerformanceApiInfoINTEL at(long index, Consumer<VkInitializePerformanceApiInfoINTEL> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pUserDataAt(long index) { return (MemorySegment) VH_pUserData.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pUserData() { return (MemorySegment) VH_pUserData.get(this.segment(), 0L, 0L); }
    public VkInitializePerformanceApiInfoINTEL sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkInitializePerformanceApiInfoINTEL pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkInitializePerformanceApiInfoINTEL pUserDataAt(long index, MemorySegment value) { VH_pUserData.set(this.segment(), 0L, index, value); return this; }
    public VkInitializePerformanceApiInfoINTEL sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkInitializePerformanceApiInfoINTEL pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkInitializePerformanceApiInfoINTEL pUserData(MemorySegment value) { VH_pUserData.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkInitializePerformanceApiInfoINTEL _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkInitializePerformanceApiInfoINTEL _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkInitializePerformanceApiInfoINTEL _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkInitializePerformanceApiInfoINTEL _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pUserDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pUserData, index), LAYOUT_pUserData); }
    public MemorySegment _pUserData() { return _pUserDataAt(0L); }
    public VkInitializePerformanceApiInfoINTEL _pUserDataAt(long index, MemorySegment src) { _pUserDataAt(index).copyFrom(src); return this; }
    public VkInitializePerformanceApiInfoINTEL _pUserData(MemorySegment src) { return _pUserDataAt(0L, src); }
}
