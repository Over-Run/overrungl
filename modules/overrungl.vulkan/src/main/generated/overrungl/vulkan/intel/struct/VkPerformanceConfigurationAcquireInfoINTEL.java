// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.intel.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPerformanceConfigurationAcquireInfoINTEL`.
/// ## Layout
/// ```
/// struct VkPerformanceConfigurationAcquireInfoINTEL {
///     VkStructureType sType;
///     const void* pNext;
///     VkPerformanceConfigurationTypeINTEL type;
/// }
/// ```
public final class VkPerformanceConfigurationAcquireInfoINTEL extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));

    public VkPerformanceConfigurationAcquireInfoINTEL(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPerformanceConfigurationAcquireInfoINTEL of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceConfigurationAcquireInfoINTEL(segment, estimateCount(segment, LAYOUT)); }
    public static VkPerformanceConfigurationAcquireInfoINTEL ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceConfigurationAcquireInfoINTEL(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPerformanceConfigurationAcquireInfoINTEL ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceConfigurationAcquireInfoINTEL(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPerformanceConfigurationAcquireInfoINTEL alloc(SegmentAllocator allocator) { return new VkPerformanceConfigurationAcquireInfoINTEL(allocator.allocate(LAYOUT), 1); }
    public static VkPerformanceConfigurationAcquireInfoINTEL alloc(SegmentAllocator allocator, long count) { return new VkPerformanceConfigurationAcquireInfoINTEL(allocator.allocate(LAYOUT, count), count); }
    public static VkPerformanceConfigurationAcquireInfoINTEL allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.intel.VKINTELPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL); }
    public static VkPerformanceConfigurationAcquireInfoINTEL allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.intel.VKINTELPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL);
        return s;
    }
    public VkPerformanceConfigurationAcquireInfoINTEL copyFrom(VkPerformanceConfigurationAcquireInfoINTEL src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPerformanceConfigurationAcquireInfoINTEL reinterpret(long count) { return new VkPerformanceConfigurationAcquireInfoINTEL(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPerformanceConfigurationAcquireInfoINTEL asSlice(long index) { return new VkPerformanceConfigurationAcquireInfoINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPerformanceConfigurationAcquireInfoINTEL asSlice(long index, long count) { return new VkPerformanceConfigurationAcquireInfoINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPerformanceConfigurationAcquireInfoINTEL at(long index, Consumer<VkPerformanceConfigurationAcquireInfoINTEL> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int typeAt(long index) { return (int) VH_type.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int type() { return (int) VH_type.get(this.segment(), 0L, 0L); }
    public VkPerformanceConfigurationAcquireInfoINTEL sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceConfigurationAcquireInfoINTEL pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceConfigurationAcquireInfoINTEL typeAt(long index, int value) { VH_type.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceConfigurationAcquireInfoINTEL sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceConfigurationAcquireInfoINTEL pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceConfigurationAcquireInfoINTEL type(int value) { VH_type.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPerformanceConfigurationAcquireInfoINTEL _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPerformanceConfigurationAcquireInfoINTEL _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPerformanceConfigurationAcquireInfoINTEL _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPerformanceConfigurationAcquireInfoINTEL _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _typeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_type, index), LAYOUT_type); }
    public MemorySegment _type() { return _typeAt(0L); }
    public VkPerformanceConfigurationAcquireInfoINTEL _typeAt(long index, MemorySegment src) { _typeAt(index).copyFrom(src); return this; }
    public VkPerformanceConfigurationAcquireInfoINTEL _type(MemorySegment src) { return _typeAt(0L, src); }
}
