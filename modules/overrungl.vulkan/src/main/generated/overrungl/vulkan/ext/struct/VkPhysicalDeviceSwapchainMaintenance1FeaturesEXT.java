// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 swapchainMaintenance1;
/// }
/// ```
public final class VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainMaintenance1")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_swapchainMaintenance1 = LAYOUT.byteOffset(PathElement.groupElement("swapchainMaintenance1"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_swapchainMaintenance1 = LAYOUT.select(PathElement.groupElement("swapchainMaintenance1"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_swapchainMaintenance1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchainMaintenance1"));

    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_KHR); }
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT copyFrom(VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT asSlice(long index) { return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT at(long index, Consumer<VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int swapchainMaintenance1At(long index) { return (int) VH_swapchainMaintenance1.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int swapchainMaintenance1() { return (int) VH_swapchainMaintenance1.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT swapchainMaintenance1At(long index, int value) { VH_swapchainMaintenance1.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT swapchainMaintenance1(int value) { VH_swapchainMaintenance1.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _swapchainMaintenance1At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_swapchainMaintenance1, index), LAYOUT_swapchainMaintenance1); }
    public MemorySegment _swapchainMaintenance1() { return _swapchainMaintenance1At(0L); }
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT _swapchainMaintenance1At(long index, MemorySegment src) { _swapchainMaintenance1At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT _swapchainMaintenance1(MemorySegment src) { return _swapchainMaintenance1At(0L, src); }
}
