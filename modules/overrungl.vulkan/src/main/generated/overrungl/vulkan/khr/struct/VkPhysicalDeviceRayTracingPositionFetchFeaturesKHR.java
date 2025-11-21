// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 rayTracingPositionFetch;
/// }
/// ```
public final class VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayTracingPositionFetch")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_rayTracingPositionFetch = LAYOUT.byteOffset(PathElement.groupElement("rayTracingPositionFetch"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_rayTracingPositionFetch = LAYOUT.select(PathElement.groupElement("rayTracingPositionFetch"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_rayTracingPositionFetch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingPositionFetch"));

    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRRayTracingPositionFetch.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_POSITION_FETCH_FEATURES_KHR); }
    public static VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRRayTracingPositionFetch.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_POSITION_FETCH_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR copyFrom(VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR at(long index, Consumer<VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int rayTracingPositionFetchAt(long index) { return (int) VH_rayTracingPositionFetch.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int rayTracingPositionFetch() { return (int) VH_rayTracingPositionFetch.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR rayTracingPositionFetchAt(long index, int value) { VH_rayTracingPositionFetch.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR rayTracingPositionFetch(int value) { VH_rayTracingPositionFetch.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _rayTracingPositionFetchAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rayTracingPositionFetch, index), LAYOUT_rayTracingPositionFetch); }
    public MemorySegment _rayTracingPositionFetch() { return _rayTracingPositionFetchAt(0L); }
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR _rayTracingPositionFetchAt(long index, MemorySegment src) { _rayTracingPositionFetchAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR _rayTracingPositionFetch(MemorySegment src) { return _rayTracingPositionFetchAt(0L, src); }
}
