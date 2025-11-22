// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceSurfaceInfo2KHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSurfaceInfo2KHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkSurfaceKHR surface;
/// }
/// ```
public final class VkPhysicalDeviceSurfaceInfo2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("surface")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_surface = LAYOUT.byteOffset(PathElement.groupElement("surface"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_surface = LAYOUT.select(PathElement.groupElement("surface"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_surface = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surface"));

    public VkPhysicalDeviceSurfaceInfo2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceSurfaceInfo2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSurfaceInfo2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceSurfaceInfo2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSurfaceInfo2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceSurfaceInfo2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSurfaceInfo2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceSurfaceInfo2KHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSurfaceInfo2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceSurfaceInfo2KHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSurfaceInfo2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceSurfaceInfo2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRGetSurfaceCapabilities2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR); }
    public static VkPhysicalDeviceSurfaceInfo2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRGetSurfaceCapabilities2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR);
        return s;
    }
    public VkPhysicalDeviceSurfaceInfo2KHR copyFrom(VkPhysicalDeviceSurfaceInfo2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceSurfaceInfo2KHR reinterpret(long count) { return new VkPhysicalDeviceSurfaceInfo2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceSurfaceInfo2KHR asSlice(long index) { return new VkPhysicalDeviceSurfaceInfo2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceSurfaceInfo2KHR asSlice(long index, long count) { return new VkPhysicalDeviceSurfaceInfo2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceSurfaceInfo2KHR at(long index, Consumer<VkPhysicalDeviceSurfaceInfo2KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long surfaceAt(long index) { return (long) VH_surface.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long surface() { return (long) VH_surface.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceSurfaceInfo2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSurfaceInfo2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSurfaceInfo2KHR surfaceAt(long index, long value) { VH_surface.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSurfaceInfo2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSurfaceInfo2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSurfaceInfo2KHR surface(long value) { VH_surface.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceSurfaceInfo2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSurfaceInfo2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceSurfaceInfo2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSurfaceInfo2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _surfaceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_surface, index), LAYOUT_surface); }
    public MemorySegment _surface() { return _surfaceAt(0L); }
    public VkPhysicalDeviceSurfaceInfo2KHR _surfaceAt(long index, MemorySegment src) { _surfaceAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSurfaceInfo2KHR _surface(MemorySegment src) { return _surfaceAt(0L, src); }
}
