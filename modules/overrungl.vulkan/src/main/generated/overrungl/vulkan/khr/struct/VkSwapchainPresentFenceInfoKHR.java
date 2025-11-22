// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSwapchainPresentFenceInfoKHR`.
/// ## Layout
/// ```
/// struct VkSwapchainPresentFenceInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t swapchainCount;
///     const VkFence* pFences;
/// }
/// ```
public final class VkSwapchainPresentFenceInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withName("pFences")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_swapchainCount = LAYOUT.byteOffset(PathElement.groupElement("swapchainCount"));
    public static final long OFFSET_pFences = LAYOUT.byteOffset(PathElement.groupElement("pFences"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_swapchainCount = LAYOUT.select(PathElement.groupElement("swapchainCount"));
    public static final MemoryLayout LAYOUT_pFences = LAYOUT.select(PathElement.groupElement("pFences"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_swapchainCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchainCount"));
    public static final VarHandle VH_pFences = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pFences"));

    public VkSwapchainPresentFenceInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSwapchainPresentFenceInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentFenceInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkSwapchainPresentFenceInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentFenceInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSwapchainPresentFenceInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentFenceInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSwapchainPresentFenceInfoKHR alloc(SegmentAllocator allocator) { return new VkSwapchainPresentFenceInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkSwapchainPresentFenceInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkSwapchainPresentFenceInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkSwapchainPresentFenceInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_KHR); }
    public static VkSwapchainPresentFenceInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_KHR);
        return s;
    }
    public VkSwapchainPresentFenceInfoKHR copyFrom(VkSwapchainPresentFenceInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSwapchainPresentFenceInfoKHR reinterpret(long count) { return new VkSwapchainPresentFenceInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSwapchainPresentFenceInfoKHR asSlice(long index) { return new VkSwapchainPresentFenceInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSwapchainPresentFenceInfoKHR asSlice(long index, long count) { return new VkSwapchainPresentFenceInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSwapchainPresentFenceInfoKHR at(long index, Consumer<VkSwapchainPresentFenceInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int swapchainCountAt(long index) { return (int) VH_swapchainCount.get(this.segment(), 0L, index); }
    public MemorySegment pFencesAt(long index) { return (MemorySegment) VH_pFences.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int swapchainCount() { return (int) VH_swapchainCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pFences() { return (MemorySegment) VH_pFences.get(this.segment(), 0L, 0L); }
    public VkSwapchainPresentFenceInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentFenceInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentFenceInfoKHR swapchainCountAt(long index, int value) { VH_swapchainCount.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentFenceInfoKHR pFencesAt(long index, MemorySegment value) { VH_pFences.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentFenceInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainPresentFenceInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainPresentFenceInfoKHR swapchainCount(int value) { VH_swapchainCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainPresentFenceInfoKHR pFences(MemorySegment value) { VH_pFences.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSwapchainPresentFenceInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentFenceInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSwapchainPresentFenceInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentFenceInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _swapchainCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_swapchainCount, index), LAYOUT_swapchainCount); }
    public MemorySegment _swapchainCount() { return _swapchainCountAt(0L); }
    public VkSwapchainPresentFenceInfoKHR _swapchainCountAt(long index, MemorySegment src) { _swapchainCountAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentFenceInfoKHR _swapchainCount(MemorySegment src) { return _swapchainCountAt(0L, src); }
    public MemorySegment _pFencesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pFences, index), LAYOUT_pFences); }
    public MemorySegment _pFences() { return _pFencesAt(0L); }
    public VkSwapchainPresentFenceInfoKHR _pFencesAt(long index, MemorySegment src) { _pFencesAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentFenceInfoKHR _pFences(MemorySegment src) { return _pFencesAt(0L, src); }
}
