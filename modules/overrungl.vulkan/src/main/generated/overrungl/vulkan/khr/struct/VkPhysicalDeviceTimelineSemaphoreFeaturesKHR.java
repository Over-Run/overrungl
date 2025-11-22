// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceTimelineSemaphoreFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceTimelineSemaphoreFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 timelineSemaphore;
/// }
/// ```
public final class VkPhysicalDeviceTimelineSemaphoreFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("timelineSemaphore")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_timelineSemaphore = LAYOUT.byteOffset(PathElement.groupElement("timelineSemaphore"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_timelineSemaphore = LAYOUT.select(PathElement.groupElement("timelineSemaphore"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_timelineSemaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timelineSemaphore"));

    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTimelineSemaphoreFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTimelineSemaphoreFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTimelineSemaphoreFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTimelineSemaphoreFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTimelineSemaphoreFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES); }
    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES);
        return s;
    }
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR copyFrom(VkPhysicalDeviceTimelineSemaphoreFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceTimelineSemaphoreFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceTimelineSemaphoreFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceTimelineSemaphoreFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR at(long index, Consumer<VkPhysicalDeviceTimelineSemaphoreFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int timelineSemaphoreAt(long index) { return (int) VH_timelineSemaphore.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int timelineSemaphore() { return (int) VH_timelineSemaphore.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR timelineSemaphoreAt(long index, int value) { VH_timelineSemaphore.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR timelineSemaphore(int value) { VH_timelineSemaphore.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _timelineSemaphoreAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_timelineSemaphore, index), LAYOUT_timelineSemaphore); }
    public MemorySegment _timelineSemaphore() { return _timelineSemaphoreAt(0L); }
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR _timelineSemaphoreAt(long index, MemorySegment src) { _timelineSemaphoreAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR _timelineSemaphore(MemorySegment src) { return _timelineSemaphoreAt(0L, src); }
}
