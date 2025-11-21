// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkRayTracingInvocationReorderModeEXT rayTracingInvocationReorderReorderingHint;
///     uint32_t maxShaderBindingTableRecordIndex;
/// }
/// ```
public final class VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayTracingInvocationReorderReorderingHint"),
        ValueLayout.JAVA_INT.withName("maxShaderBindingTableRecordIndex")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_rayTracingInvocationReorderReorderingHint = LAYOUT.byteOffset(PathElement.groupElement("rayTracingInvocationReorderReorderingHint"));
    public static final long OFFSET_maxShaderBindingTableRecordIndex = LAYOUT.byteOffset(PathElement.groupElement("maxShaderBindingTableRecordIndex"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_rayTracingInvocationReorderReorderingHint = LAYOUT.select(PathElement.groupElement("rayTracingInvocationReorderReorderingHint"));
    public static final MemoryLayout LAYOUT_maxShaderBindingTableRecordIndex = LAYOUT.select(PathElement.groupElement("maxShaderBindingTableRecordIndex"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_rayTracingInvocationReorderReorderingHint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingInvocationReorderReorderingHint"));
    public static final VarHandle VH_maxShaderBindingTableRecordIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxShaderBindingTableRecordIndex"));

    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTRayTracingInvocationReorder.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_EXT); }
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTRayTracingInvocationReorder.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT copyFrom(VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT at(long index, Consumer<VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int rayTracingInvocationReorderReorderingHintAt(long index) { return (int) VH_rayTracingInvocationReorderReorderingHint.get(this.segment(), 0L, index); }
    public int maxShaderBindingTableRecordIndexAt(long index) { return (int) VH_maxShaderBindingTableRecordIndex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int rayTracingInvocationReorderReorderingHint() { return (int) VH_rayTracingInvocationReorderReorderingHint.get(this.segment(), 0L, 0L); }
    public int maxShaderBindingTableRecordIndex() { return (int) VH_maxShaderBindingTableRecordIndex.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT rayTracingInvocationReorderReorderingHintAt(long index, int value) { VH_rayTracingInvocationReorderReorderingHint.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT maxShaderBindingTableRecordIndexAt(long index, int value) { VH_maxShaderBindingTableRecordIndex.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT rayTracingInvocationReorderReorderingHint(int value) { VH_rayTracingInvocationReorderReorderingHint.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT maxShaderBindingTableRecordIndex(int value) { VH_maxShaderBindingTableRecordIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _rayTracingInvocationReorderReorderingHintAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rayTracingInvocationReorderReorderingHint, index), LAYOUT_rayTracingInvocationReorderReorderingHint); }
    public MemorySegment _rayTracingInvocationReorderReorderingHint() { return _rayTracingInvocationReorderReorderingHintAt(0L); }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT _rayTracingInvocationReorderReorderingHintAt(long index, MemorySegment src) { _rayTracingInvocationReorderReorderingHintAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT _rayTracingInvocationReorderReorderingHint(MemorySegment src) { return _rayTracingInvocationReorderReorderingHintAt(0L, src); }
    public MemorySegment _maxShaderBindingTableRecordIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxShaderBindingTableRecordIndex, index), LAYOUT_maxShaderBindingTableRecordIndex); }
    public MemorySegment _maxShaderBindingTableRecordIndex() { return _maxShaderBindingTableRecordIndexAt(0L); }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT _maxShaderBindingTableRecordIndexAt(long index, MemorySegment src) { _maxShaderBindingTableRecordIndexAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT _maxShaderBindingTableRecordIndex(MemorySegment src) { return _maxShaderBindingTableRecordIndexAt(0L, src); }
}
