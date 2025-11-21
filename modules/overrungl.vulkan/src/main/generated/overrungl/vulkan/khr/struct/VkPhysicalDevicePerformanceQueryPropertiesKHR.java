// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePerformanceQueryPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePerformanceQueryPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 allowCommandBufferQueryCopies;
/// }
/// ```
public final class VkPhysicalDevicePerformanceQueryPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("allowCommandBufferQueryCopies")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_allowCommandBufferQueryCopies = LAYOUT.byteOffset(PathElement.groupElement("allowCommandBufferQueryCopies"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_allowCommandBufferQueryCopies = LAYOUT.select(PathElement.groupElement("allowCommandBufferQueryCopies"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_allowCommandBufferQueryCopies = LAYOUT.arrayElementVarHandle(PathElement.groupElement("allowCommandBufferQueryCopies"));

    public VkPhysicalDevicePerformanceQueryPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePerformanceQueryPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePerformanceQueryPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePerformanceQueryPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePerformanceQueryPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePerformanceQueryPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePerformanceQueryPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePerformanceQueryPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePerformanceQueryPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePerformanceQueryPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePerformanceQueryPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePerformanceQueryPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPerformanceQuery.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES_KHR); }
    public static VkPhysicalDevicePerformanceQueryPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPerformanceQuery.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES_KHR);
        return s;
    }
    public VkPhysicalDevicePerformanceQueryPropertiesKHR copyFrom(VkPhysicalDevicePerformanceQueryPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePerformanceQueryPropertiesKHR reinterpret(long count) { return new VkPhysicalDevicePerformanceQueryPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePerformanceQueryPropertiesKHR asSlice(long index) { return new VkPhysicalDevicePerformanceQueryPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePerformanceQueryPropertiesKHR asSlice(long index, long count) { return new VkPhysicalDevicePerformanceQueryPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePerformanceQueryPropertiesKHR at(long index, Consumer<VkPhysicalDevicePerformanceQueryPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int allowCommandBufferQueryCopiesAt(long index) { return (int) VH_allowCommandBufferQueryCopies.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int allowCommandBufferQueryCopies() { return (int) VH_allowCommandBufferQueryCopies.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePerformanceQueryPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePerformanceQueryPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePerformanceQueryPropertiesKHR allowCommandBufferQueryCopiesAt(long index, int value) { VH_allowCommandBufferQueryCopies.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePerformanceQueryPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePerformanceQueryPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePerformanceQueryPropertiesKHR allowCommandBufferQueryCopies(int value) { VH_allowCommandBufferQueryCopies.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePerformanceQueryPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePerformanceQueryPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePerformanceQueryPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePerformanceQueryPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _allowCommandBufferQueryCopiesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_allowCommandBufferQueryCopies, index), LAYOUT_allowCommandBufferQueryCopies); }
    public MemorySegment _allowCommandBufferQueryCopies() { return _allowCommandBufferQueryCopiesAt(0L); }
    public VkPhysicalDevicePerformanceQueryPropertiesKHR _allowCommandBufferQueryCopiesAt(long index, MemorySegment src) { _allowCommandBufferQueryCopiesAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePerformanceQueryPropertiesKHR _allowCommandBufferQueryCopies(MemorySegment src) { return _allowCommandBufferQueryCopiesAt(0L, src); }
}
