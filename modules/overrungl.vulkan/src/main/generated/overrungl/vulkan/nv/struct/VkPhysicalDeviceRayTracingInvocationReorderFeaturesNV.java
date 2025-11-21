// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 rayTracingInvocationReorder;
/// }
/// ```
public final class VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayTracingInvocationReorder")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_rayTracingInvocationReorder = LAYOUT.byteOffset(PathElement.groupElement("rayTracingInvocationReorder"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_rayTracingInvocationReorder = LAYOUT.select(PathElement.groupElement("rayTracingInvocationReorder"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_rayTracingInvocationReorder = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingInvocationReorder"));

    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVRayTracingInvocationReorder.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_NV); }
    public static VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVRayTracingInvocationReorder.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV copyFrom(VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV asSlice(long index) { return new VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV at(long index, Consumer<VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int rayTracingInvocationReorderAt(long index) { return (int) VH_rayTracingInvocationReorder.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int rayTracingInvocationReorder() { return (int) VH_rayTracingInvocationReorder.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV rayTracingInvocationReorderAt(long index, int value) { VH_rayTracingInvocationReorder.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV rayTracingInvocationReorder(int value) { VH_rayTracingInvocationReorder.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _rayTracingInvocationReorderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rayTracingInvocationReorder, index), LAYOUT_rayTracingInvocationReorder); }
    public MemorySegment _rayTracingInvocationReorder() { return _rayTracingInvocationReorderAt(0L); }
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV _rayTracingInvocationReorderAt(long index, MemorySegment src) { _rayTracingInvocationReorderAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV _rayTracingInvocationReorder(MemorySegment src) { return _rayTracingInvocationReorderAt(0L, src); }
}
