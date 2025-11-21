// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.intel.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPerformanceOverrideInfoINTEL`.
/// ## Layout
/// ```
/// struct VkPerformanceOverrideInfoINTEL {
///     VkStructureType sType;
///     const void* pNext;
///     VkPerformanceOverrideTypeINTEL type;
///     VkBool32 enable;
///     uint64_t parameter;
/// }
/// ```
public final class VkPerformanceOverrideInfoINTEL extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("enable"),
        ValueLayout.JAVA_LONG.withName("parameter")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    public static final long OFFSET_enable = LAYOUT.byteOffset(PathElement.groupElement("enable"));
    public static final long OFFSET_parameter = LAYOUT.byteOffset(PathElement.groupElement("parameter"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    public static final MemoryLayout LAYOUT_enable = LAYOUT.select(PathElement.groupElement("enable"));
    public static final MemoryLayout LAYOUT_parameter = LAYOUT.select(PathElement.groupElement("parameter"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    public static final VarHandle VH_enable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enable"));
    public static final VarHandle VH_parameter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("parameter"));

    public VkPerformanceOverrideInfoINTEL(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPerformanceOverrideInfoINTEL of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceOverrideInfoINTEL(segment, estimateCount(segment, LAYOUT)); }
    public static VkPerformanceOverrideInfoINTEL ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceOverrideInfoINTEL(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPerformanceOverrideInfoINTEL ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceOverrideInfoINTEL(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPerformanceOverrideInfoINTEL alloc(SegmentAllocator allocator) { return new VkPerformanceOverrideInfoINTEL(allocator.allocate(LAYOUT), 1); }
    public static VkPerformanceOverrideInfoINTEL alloc(SegmentAllocator allocator, long count) { return new VkPerformanceOverrideInfoINTEL(allocator.allocate(LAYOUT, count), count); }
    public static VkPerformanceOverrideInfoINTEL allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.intel.VKINTELPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL); }
    public static VkPerformanceOverrideInfoINTEL allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.intel.VKINTELPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL);
        return s;
    }
    public VkPerformanceOverrideInfoINTEL copyFrom(VkPerformanceOverrideInfoINTEL src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPerformanceOverrideInfoINTEL reinterpret(long count) { return new VkPerformanceOverrideInfoINTEL(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPerformanceOverrideInfoINTEL asSlice(long index) { return new VkPerformanceOverrideInfoINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPerformanceOverrideInfoINTEL asSlice(long index, long count) { return new VkPerformanceOverrideInfoINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPerformanceOverrideInfoINTEL at(long index, Consumer<VkPerformanceOverrideInfoINTEL> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int typeAt(long index) { return (int) VH_type.get(this.segment(), 0L, index); }
    public int enableAt(long index) { return (int) VH_enable.get(this.segment(), 0L, index); }
    public long parameterAt(long index) { return (long) VH_parameter.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int type() { return (int) VH_type.get(this.segment(), 0L, 0L); }
    public int enable() { return (int) VH_enable.get(this.segment(), 0L, 0L); }
    public long parameter() { return (long) VH_parameter.get(this.segment(), 0L, 0L); }
    public VkPerformanceOverrideInfoINTEL sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceOverrideInfoINTEL pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceOverrideInfoINTEL typeAt(long index, int value) { VH_type.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceOverrideInfoINTEL enableAt(long index, int value) { VH_enable.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceOverrideInfoINTEL parameterAt(long index, long value) { VH_parameter.set(this.segment(), 0L, index, value); return this; }
    public VkPerformanceOverrideInfoINTEL sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceOverrideInfoINTEL pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceOverrideInfoINTEL type(int value) { VH_type.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceOverrideInfoINTEL enable(int value) { VH_enable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPerformanceOverrideInfoINTEL parameter(long value) { VH_parameter.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPerformanceOverrideInfoINTEL _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPerformanceOverrideInfoINTEL _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPerformanceOverrideInfoINTEL _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPerformanceOverrideInfoINTEL _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _typeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_type, index), LAYOUT_type); }
    public MemorySegment _type() { return _typeAt(0L); }
    public VkPerformanceOverrideInfoINTEL _typeAt(long index, MemorySegment src) { _typeAt(index).copyFrom(src); return this; }
    public VkPerformanceOverrideInfoINTEL _type(MemorySegment src) { return _typeAt(0L, src); }
    public MemorySegment _enableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_enable, index), LAYOUT_enable); }
    public MemorySegment _enable() { return _enableAt(0L); }
    public VkPerformanceOverrideInfoINTEL _enableAt(long index, MemorySegment src) { _enableAt(index).copyFrom(src); return this; }
    public VkPerformanceOverrideInfoINTEL _enable(MemorySegment src) { return _enableAt(0L, src); }
    public MemorySegment _parameterAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_parameter, index), LAYOUT_parameter); }
    public MemorySegment _parameter() { return _parameterAt(0L); }
    public VkPerformanceOverrideInfoINTEL _parameterAt(long index, MemorySegment src) { _parameterAt(index).copyFrom(src); return this; }
    public VkPerformanceOverrideInfoINTEL _parameter(MemorySegment src) { return _parameterAt(0L, src); }
}
