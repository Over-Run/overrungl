// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkRayTracingInvocationReorderModeEXT rayTracingInvocationReorderReorderingHint;
/// }
/// ```
public final class VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayTracingInvocationReorderReorderingHint")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_rayTracingInvocationReorderReorderingHint = LAYOUT.byteOffset(PathElement.groupElement("rayTracingInvocationReorderReorderingHint"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_rayTracingInvocationReorderReorderingHint = LAYOUT.select(PathElement.groupElement("rayTracingInvocationReorderReorderingHint"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_rayTracingInvocationReorderReorderingHint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingInvocationReorderReorderingHint"));

    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVRayTracingInvocationReorder.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_NV); }
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVRayTracingInvocationReorder.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_NV);
        return s;
    }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV copyFrom(VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV reinterpret(long count) { return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV asSlice(long index) { return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV at(long index, Consumer<VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int rayTracingInvocationReorderReorderingHintAt(long index) { return (int) VH_rayTracingInvocationReorderReorderingHint.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int rayTracingInvocationReorderReorderingHint() { return (int) VH_rayTracingInvocationReorderReorderingHint.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV rayTracingInvocationReorderReorderingHintAt(long index, int value) { VH_rayTracingInvocationReorderReorderingHint.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV rayTracingInvocationReorderReorderingHint(int value) { VH_rayTracingInvocationReorderReorderingHint.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _rayTracingInvocationReorderReorderingHintAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rayTracingInvocationReorderReorderingHint, index), LAYOUT_rayTracingInvocationReorderReorderingHint); }
    public MemorySegment _rayTracingInvocationReorderReorderingHint() { return _rayTracingInvocationReorderReorderingHintAt(0L); }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV _rayTracingInvocationReorderReorderingHintAt(long index, MemorySegment src) { _rayTracingInvocationReorderReorderingHintAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV _rayTracingInvocationReorderReorderingHint(MemorySegment src) { return _rayTracingInvocationReorderReorderingHintAt(0L, src); }
}
