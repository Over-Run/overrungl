// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageSwapchainCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkImageSwapchainCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkSwapchainKHR swapchain;
/// }
/// ```
public final class VkImageSwapchainCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("swapchain")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_swapchain = LAYOUT.byteOffset(PathElement.groupElement("swapchain"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_swapchain = LAYOUT.select(PathElement.groupElement("swapchain"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_swapchain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchain"));

    public VkImageSwapchainCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageSwapchainCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSwapchainCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageSwapchainCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSwapchainCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageSwapchainCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSwapchainCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageSwapchainCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkImageSwapchainCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkImageSwapchainCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkImageSwapchainCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkImageSwapchainCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRDeviceGroup.VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR); }
    public static VkImageSwapchainCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRDeviceGroup.VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR);
        return s;
    }
    public VkImageSwapchainCreateInfoKHR copyFrom(VkImageSwapchainCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageSwapchainCreateInfoKHR reinterpret(long count) { return new VkImageSwapchainCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageSwapchainCreateInfoKHR asSlice(long index) { return new VkImageSwapchainCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageSwapchainCreateInfoKHR asSlice(long index, long count) { return new VkImageSwapchainCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageSwapchainCreateInfoKHR at(long index, Consumer<VkImageSwapchainCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long swapchainAt(long index) { return (long) VH_swapchain.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long swapchain() { return (long) VH_swapchain.get(this.segment(), 0L, 0L); }
    public VkImageSwapchainCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageSwapchainCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageSwapchainCreateInfoKHR swapchainAt(long index, long value) { VH_swapchain.set(this.segment(), 0L, index, value); return this; }
    public VkImageSwapchainCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageSwapchainCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageSwapchainCreateInfoKHR swapchain(long value) { VH_swapchain.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageSwapchainCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageSwapchainCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageSwapchainCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageSwapchainCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _swapchainAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_swapchain, index), LAYOUT_swapchain); }
    public MemorySegment _swapchain() { return _swapchainAt(0L); }
    public VkImageSwapchainCreateInfoKHR _swapchainAt(long index, MemorySegment src) { _swapchainAt(index).copyFrom(src); return this; }
    public VkImageSwapchainCreateInfoKHR _swapchain(MemorySegment src) { return _swapchainAt(0L, src); }
}
