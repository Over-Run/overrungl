// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceGroupPresentInfoKHR`.
/// ## Layout
/// ```
/// struct VkDeviceGroupPresentInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t swapchainCount;
///     const uint32_t* pDeviceMasks;
///     VkDeviceGroupPresentModeFlagBitsKHR mode;
/// }
/// ```
public final class VkDeviceGroupPresentInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withName("pDeviceMasks"),
        ValueLayout.JAVA_INT.withName("mode")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_swapchainCount = LAYOUT.byteOffset(PathElement.groupElement("swapchainCount"));
    public static final long OFFSET_pDeviceMasks = LAYOUT.byteOffset(PathElement.groupElement("pDeviceMasks"));
    public static final long OFFSET_mode = LAYOUT.byteOffset(PathElement.groupElement("mode"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_swapchainCount = LAYOUT.select(PathElement.groupElement("swapchainCount"));
    public static final MemoryLayout LAYOUT_pDeviceMasks = LAYOUT.select(PathElement.groupElement("pDeviceMasks"));
    public static final MemoryLayout LAYOUT_mode = LAYOUT.select(PathElement.groupElement("mode"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_swapchainCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchainCount"));
    public static final VarHandle VH_pDeviceMasks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDeviceMasks"));
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));

    public VkDeviceGroupPresentInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceGroupPresentInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupPresentInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceGroupPresentInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupPresentInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceGroupPresentInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupPresentInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceGroupPresentInfoKHR alloc(SegmentAllocator allocator) { return new VkDeviceGroupPresentInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceGroupPresentInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkDeviceGroupPresentInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceGroupPresentInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRDeviceGroup.VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR); }
    public static VkDeviceGroupPresentInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRDeviceGroup.VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR);
        return s;
    }
    public VkDeviceGroupPresentInfoKHR copyFrom(VkDeviceGroupPresentInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceGroupPresentInfoKHR reinterpret(long count) { return new VkDeviceGroupPresentInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceGroupPresentInfoKHR asSlice(long index) { return new VkDeviceGroupPresentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceGroupPresentInfoKHR asSlice(long index, long count) { return new VkDeviceGroupPresentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceGroupPresentInfoKHR at(long index, Consumer<VkDeviceGroupPresentInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int swapchainCountAt(long index) { return (int) VH_swapchainCount.get(this.segment(), 0L, index); }
    public MemorySegment pDeviceMasksAt(long index) { return (MemorySegment) VH_pDeviceMasks.get(this.segment(), 0L, index); }
    public int modeAt(long index) { return (int) VH_mode.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int swapchainCount() { return (int) VH_swapchainCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pDeviceMasks() { return (MemorySegment) VH_pDeviceMasks.get(this.segment(), 0L, 0L); }
    public int mode() { return (int) VH_mode.get(this.segment(), 0L, 0L); }
    public VkDeviceGroupPresentInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupPresentInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupPresentInfoKHR swapchainCountAt(long index, int value) { VH_swapchainCount.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupPresentInfoKHR pDeviceMasksAt(long index, MemorySegment value) { VH_pDeviceMasks.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupPresentInfoKHR modeAt(long index, int value) { VH_mode.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceGroupPresentInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupPresentInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupPresentInfoKHR swapchainCount(int value) { VH_swapchainCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupPresentInfoKHR pDeviceMasks(MemorySegment value) { VH_pDeviceMasks.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceGroupPresentInfoKHR mode(int value) { VH_mode.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceGroupPresentInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceGroupPresentInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceGroupPresentInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceGroupPresentInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _swapchainCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_swapchainCount, index), LAYOUT_swapchainCount); }
    public MemorySegment _swapchainCount() { return _swapchainCountAt(0L); }
    public VkDeviceGroupPresentInfoKHR _swapchainCountAt(long index, MemorySegment src) { _swapchainCountAt(index).copyFrom(src); return this; }
    public VkDeviceGroupPresentInfoKHR _swapchainCount(MemorySegment src) { return _swapchainCountAt(0L, src); }
    public MemorySegment _pDeviceMasksAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDeviceMasks, index), LAYOUT_pDeviceMasks); }
    public MemorySegment _pDeviceMasks() { return _pDeviceMasksAt(0L); }
    public VkDeviceGroupPresentInfoKHR _pDeviceMasksAt(long index, MemorySegment src) { _pDeviceMasksAt(index).copyFrom(src); return this; }
    public VkDeviceGroupPresentInfoKHR _pDeviceMasks(MemorySegment src) { return _pDeviceMasksAt(0L, src); }
    public MemorySegment _modeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mode, index), LAYOUT_mode); }
    public MemorySegment _mode() { return _modeAt(0L); }
    public VkDeviceGroupPresentInfoKHR _modeAt(long index, MemorySegment src) { _modeAt(index).copyFrom(src); return this; }
    public VkDeviceGroupPresentInfoKHR _mode(MemorySegment src) { return _modeAt(0L, src); }
}
