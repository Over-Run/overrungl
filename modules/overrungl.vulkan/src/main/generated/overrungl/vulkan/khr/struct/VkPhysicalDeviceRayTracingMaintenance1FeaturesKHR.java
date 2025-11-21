// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 rayTracingMaintenance1;
///     VkBool32 rayTracingPipelineTraceRaysIndirect2;
/// }
/// ```
public final class VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayTracingMaintenance1"),
        ValueLayout.JAVA_INT.withName("rayTracingPipelineTraceRaysIndirect2")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_rayTracingMaintenance1 = LAYOUT.byteOffset(PathElement.groupElement("rayTracingMaintenance1"));
    public static final long OFFSET_rayTracingPipelineTraceRaysIndirect2 = LAYOUT.byteOffset(PathElement.groupElement("rayTracingPipelineTraceRaysIndirect2"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_rayTracingMaintenance1 = LAYOUT.select(PathElement.groupElement("rayTracingMaintenance1"));
    public static final MemoryLayout LAYOUT_rayTracingPipelineTraceRaysIndirect2 = LAYOUT.select(PathElement.groupElement("rayTracingPipelineTraceRaysIndirect2"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_rayTracingMaintenance1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingMaintenance1"));
    public static final VarHandle VH_rayTracingPipelineTraceRaysIndirect2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingPipelineTraceRaysIndirect2"));

    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRRayTracingMaintenance1.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR); }
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRRayTracingMaintenance1.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR copyFrom(VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR asSlice(long index) { return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR at(long index, Consumer<VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int rayTracingMaintenance1At(long index) { return (int) VH_rayTracingMaintenance1.get(this.segment(), 0L, index); }
    public int rayTracingPipelineTraceRaysIndirect2At(long index) { return (int) VH_rayTracingPipelineTraceRaysIndirect2.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int rayTracingMaintenance1() { return (int) VH_rayTracingMaintenance1.get(this.segment(), 0L, 0L); }
    public int rayTracingPipelineTraceRaysIndirect2() { return (int) VH_rayTracingPipelineTraceRaysIndirect2.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR rayTracingMaintenance1At(long index, int value) { VH_rayTracingMaintenance1.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR rayTracingPipelineTraceRaysIndirect2At(long index, int value) { VH_rayTracingPipelineTraceRaysIndirect2.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR rayTracingMaintenance1(int value) { VH_rayTracingMaintenance1.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR rayTracingPipelineTraceRaysIndirect2(int value) { VH_rayTracingPipelineTraceRaysIndirect2.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _rayTracingMaintenance1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rayTracingMaintenance1, index), LAYOUT_rayTracingMaintenance1); }
    public MemorySegment _rayTracingMaintenance1() { return _rayTracingMaintenance1At(0L); }
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR _rayTracingMaintenance1At(long index, MemorySegment src) { _rayTracingMaintenance1At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR _rayTracingMaintenance1(MemorySegment src) { return _rayTracingMaintenance1At(0L, src); }
    public MemorySegment _rayTracingPipelineTraceRaysIndirect2At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rayTracingPipelineTraceRaysIndirect2, index), LAYOUT_rayTracingPipelineTraceRaysIndirect2); }
    public MemorySegment _rayTracingPipelineTraceRaysIndirect2() { return _rayTracingPipelineTraceRaysIndirect2At(0L); }
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR _rayTracingPipelineTraceRaysIndirect2At(long index, MemorySegment src) { _rayTracingPipelineTraceRaysIndirect2At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR _rayTracingPipelineTraceRaysIndirect2(MemorySegment src) { return _rayTracingPipelineTraceRaysIndirect2At(0L, src); }
}
