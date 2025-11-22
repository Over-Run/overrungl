// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAcquireNextImageInfoKHR`.
/// ## Layout
/// ```
/// struct VkAcquireNextImageInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkSwapchainKHR swapchain;
///     uint64_t timeout;
///     VkSemaphore semaphore;
///     VkFence fence;
///     uint32_t deviceMask;
/// }
/// ```
public final class VkAcquireNextImageInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("swapchain"),
        ValueLayout.JAVA_LONG.withName("timeout"),
        ValueLayout.JAVA_LONG.withName("semaphore"),
        ValueLayout.JAVA_LONG.withName("fence"),
        ValueLayout.JAVA_INT.withName("deviceMask")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_swapchain = LAYOUT.byteOffset(PathElement.groupElement("swapchain"));
    public static final long OFFSET_timeout = LAYOUT.byteOffset(PathElement.groupElement("timeout"));
    public static final long OFFSET_semaphore = LAYOUT.byteOffset(PathElement.groupElement("semaphore"));
    public static final long OFFSET_fence = LAYOUT.byteOffset(PathElement.groupElement("fence"));
    public static final long OFFSET_deviceMask = LAYOUT.byteOffset(PathElement.groupElement("deviceMask"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_swapchain = LAYOUT.select(PathElement.groupElement("swapchain"));
    public static final MemoryLayout LAYOUT_timeout = LAYOUT.select(PathElement.groupElement("timeout"));
    public static final MemoryLayout LAYOUT_semaphore = LAYOUT.select(PathElement.groupElement("semaphore"));
    public static final MemoryLayout LAYOUT_fence = LAYOUT.select(PathElement.groupElement("fence"));
    public static final MemoryLayout LAYOUT_deviceMask = LAYOUT.select(PathElement.groupElement("deviceMask"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_swapchain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchain"));
    public static final VarHandle VH_timeout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timeout"));
    public static final VarHandle VH_semaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphore"));
    public static final VarHandle VH_fence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fence"));
    public static final VarHandle VH_deviceMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceMask"));

    public VkAcquireNextImageInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAcquireNextImageInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAcquireNextImageInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkAcquireNextImageInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAcquireNextImageInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAcquireNextImageInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAcquireNextImageInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAcquireNextImageInfoKHR alloc(SegmentAllocator allocator) { return new VkAcquireNextImageInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkAcquireNextImageInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkAcquireNextImageInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkAcquireNextImageInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRDeviceGroup.VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR); }
    public static VkAcquireNextImageInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRDeviceGroup.VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR);
        return s;
    }
    public VkAcquireNextImageInfoKHR copyFrom(VkAcquireNextImageInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAcquireNextImageInfoKHR reinterpret(long count) { return new VkAcquireNextImageInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAcquireNextImageInfoKHR asSlice(long index) { return new VkAcquireNextImageInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAcquireNextImageInfoKHR asSlice(long index, long count) { return new VkAcquireNextImageInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAcquireNextImageInfoKHR at(long index, Consumer<VkAcquireNextImageInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long swapchainAt(long index) { return (long) VH_swapchain.get(this.segment(), 0L, index); }
    public long timeoutAt(long index) { return (long) VH_timeout.get(this.segment(), 0L, index); }
    public long semaphoreAt(long index) { return (long) VH_semaphore.get(this.segment(), 0L, index); }
    public long fenceAt(long index) { return (long) VH_fence.get(this.segment(), 0L, index); }
    public int deviceMaskAt(long index) { return (int) VH_deviceMask.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long swapchain() { return (long) VH_swapchain.get(this.segment(), 0L, 0L); }
    public long timeout() { return (long) VH_timeout.get(this.segment(), 0L, 0L); }
    public long semaphore() { return (long) VH_semaphore.get(this.segment(), 0L, 0L); }
    public long fence() { return (long) VH_fence.get(this.segment(), 0L, 0L); }
    public int deviceMask() { return (int) VH_deviceMask.get(this.segment(), 0L, 0L); }
    public VkAcquireNextImageInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAcquireNextImageInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAcquireNextImageInfoKHR swapchainAt(long index, long value) { VH_swapchain.set(this.segment(), 0L, index, value); return this; }
    public VkAcquireNextImageInfoKHR timeoutAt(long index, long value) { VH_timeout.set(this.segment(), 0L, index, value); return this; }
    public VkAcquireNextImageInfoKHR semaphoreAt(long index, long value) { VH_semaphore.set(this.segment(), 0L, index, value); return this; }
    public VkAcquireNextImageInfoKHR fenceAt(long index, long value) { VH_fence.set(this.segment(), 0L, index, value); return this; }
    public VkAcquireNextImageInfoKHR deviceMaskAt(long index, int value) { VH_deviceMask.set(this.segment(), 0L, index, value); return this; }
    public VkAcquireNextImageInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAcquireNextImageInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAcquireNextImageInfoKHR swapchain(long value) { VH_swapchain.set(this.segment(), 0L, 0L, value); return this; }
    public VkAcquireNextImageInfoKHR timeout(long value) { VH_timeout.set(this.segment(), 0L, 0L, value); return this; }
    public VkAcquireNextImageInfoKHR semaphore(long value) { VH_semaphore.set(this.segment(), 0L, 0L, value); return this; }
    public VkAcquireNextImageInfoKHR fence(long value) { VH_fence.set(this.segment(), 0L, 0L, value); return this; }
    public VkAcquireNextImageInfoKHR deviceMask(int value) { VH_deviceMask.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAcquireNextImageInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAcquireNextImageInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAcquireNextImageInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAcquireNextImageInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _swapchainAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_swapchain, index), LAYOUT_swapchain); }
    public MemorySegment _swapchain() { return _swapchainAt(0L); }
    public VkAcquireNextImageInfoKHR _swapchainAt(long index, MemorySegment src) { _swapchainAt(index).copyFrom(src); return this; }
    public VkAcquireNextImageInfoKHR _swapchain(MemorySegment src) { return _swapchainAt(0L, src); }
    public MemorySegment _timeoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_timeout, index), LAYOUT_timeout); }
    public MemorySegment _timeout() { return _timeoutAt(0L); }
    public VkAcquireNextImageInfoKHR _timeoutAt(long index, MemorySegment src) { _timeoutAt(index).copyFrom(src); return this; }
    public VkAcquireNextImageInfoKHR _timeout(MemorySegment src) { return _timeoutAt(0L, src); }
    public MemorySegment _semaphoreAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_semaphore, index), LAYOUT_semaphore); }
    public MemorySegment _semaphore() { return _semaphoreAt(0L); }
    public VkAcquireNextImageInfoKHR _semaphoreAt(long index, MemorySegment src) { _semaphoreAt(index).copyFrom(src); return this; }
    public VkAcquireNextImageInfoKHR _semaphore(MemorySegment src) { return _semaphoreAt(0L, src); }
    public MemorySegment _fenceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fence, index), LAYOUT_fence); }
    public MemorySegment _fence() { return _fenceAt(0L); }
    public VkAcquireNextImageInfoKHR _fenceAt(long index, MemorySegment src) { _fenceAt(index).copyFrom(src); return this; }
    public VkAcquireNextImageInfoKHR _fence(MemorySegment src) { return _fenceAt(0L, src); }
    public MemorySegment _deviceMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceMask, index), LAYOUT_deviceMask); }
    public MemorySegment _deviceMask() { return _deviceMaskAt(0L); }
    public VkAcquireNextImageInfoKHR _deviceMaskAt(long index, MemorySegment src) { _deviceMaskAt(index).copyFrom(src); return this; }
    public VkAcquireNextImageInfoKHR _deviceMask(MemorySegment src) { return _deviceMaskAt(0L, src); }
}
