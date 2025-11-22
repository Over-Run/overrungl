// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceGroupSwapchainCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkDeviceGroupSwapchainCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceGroupPresentModeFlagsKHR modes;
/// }
/// ```
public final class VkDeviceGroupSwapchainCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("modes")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_modes = LAYOUT.byteOffset(PathElement.groupElement("modes"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_modes = LAYOUT.select(PathElement.groupElement("modes"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_modes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("modes"));

    public VkDeviceGroupSwapchainCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceGroupSwapchainCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupSwapchainCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceGroupSwapchainCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupSwapchainCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceGroupSwapchainCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupSwapchainCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceGroupSwapchainCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkDeviceGroupSwapchainCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceGroupSwapchainCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkDeviceGroupSwapchainCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceGroupSwapchainCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRDeviceGroup.VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR); }
    public static VkDeviceGroupSwapchainCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRDeviceGroup.VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR);
        return s;
    }
    public VkDeviceGroupSwapchainCreateInfoKHR copyFrom(VkDeviceGroupSwapchainCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceGroupSwapchainCreateInfoKHR reinterpret(long count) { return new VkDeviceGroupSwapchainCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceGroupSwapchainCreateInfoKHR asSlice(long index) { return new VkDeviceGroupSwapchainCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceGroupSwapchainCreateInfoKHR asSlice(long index, long count) { return new VkDeviceGroupSwapchainCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceGroupSwapchainCreateInfoKHR at(long index, Consumer<VkDeviceGroupSwapchainCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int modesAt(long index) { return (int) VH_modes.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int modes() { return (int) VH_modes.get(this.segment(), 0L, 0L); }
    public VkDeviceGroupSwapchainCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupSwapchainCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupSwapchainCreateInfoKHR modesAt(long index, int value) { VH_modes.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupSwapchainCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupSwapchainCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupSwapchainCreateInfoKHR modes(int value) { VH_modes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceGroupSwapchainCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceGroupSwapchainCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceGroupSwapchainCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceGroupSwapchainCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _modesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_modes, index), LAYOUT_modes); }
    public MemorySegment _modes() { return _modesAt(0L); }
    public VkDeviceGroupSwapchainCreateInfoKHR _modesAt(long index, MemorySegment src) { _modesAt(index).copyFrom(src); return this; }
    public VkDeviceGroupSwapchainCreateInfoKHR _modes(MemorySegment src) { return _modesAt(0L, src); }
}
