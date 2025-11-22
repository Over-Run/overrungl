// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPresentInfoKHR`.
/// ## Layout
/// ```
/// struct VkPresentInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t waitSemaphoreCount;
///     const VkSemaphore* pWaitSemaphores;
///     uint32_t swapchainCount;
///     const VkSwapchainKHR* pSwapchains;
///     const uint32_t* pImageIndices;
///     VkResult* pResults;
/// }
/// ```
public final class VkPresentInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreCount"),
        ValueLayout.ADDRESS.withName("pWaitSemaphores"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withName("pSwapchains"),
        ValueLayout.ADDRESS.withName("pImageIndices"),
        ValueLayout.ADDRESS.withName("pResults")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_waitSemaphoreCount = LAYOUT.byteOffset(PathElement.groupElement("waitSemaphoreCount"));
    public static final long OFFSET_pWaitSemaphores = LAYOUT.byteOffset(PathElement.groupElement("pWaitSemaphores"));
    public static final long OFFSET_swapchainCount = LAYOUT.byteOffset(PathElement.groupElement("swapchainCount"));
    public static final long OFFSET_pSwapchains = LAYOUT.byteOffset(PathElement.groupElement("pSwapchains"));
    public static final long OFFSET_pImageIndices = LAYOUT.byteOffset(PathElement.groupElement("pImageIndices"));
    public static final long OFFSET_pResults = LAYOUT.byteOffset(PathElement.groupElement("pResults"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_waitSemaphoreCount = LAYOUT.select(PathElement.groupElement("waitSemaphoreCount"));
    public static final MemoryLayout LAYOUT_pWaitSemaphores = LAYOUT.select(PathElement.groupElement("pWaitSemaphores"));
    public static final MemoryLayout LAYOUT_swapchainCount = LAYOUT.select(PathElement.groupElement("swapchainCount"));
    public static final MemoryLayout LAYOUT_pSwapchains = LAYOUT.select(PathElement.groupElement("pSwapchains"));
    public static final MemoryLayout LAYOUT_pImageIndices = LAYOUT.select(PathElement.groupElement("pImageIndices"));
    public static final MemoryLayout LAYOUT_pResults = LAYOUT.select(PathElement.groupElement("pResults"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_waitSemaphoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("waitSemaphoreCount"));
    public static final VarHandle VH_pWaitSemaphores = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWaitSemaphores"));
    public static final VarHandle VH_swapchainCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchainCount"));
    public static final VarHandle VH_pSwapchains = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSwapchains"));
    public static final VarHandle VH_pImageIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImageIndices"));
    public static final VarHandle VH_pResults = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pResults"));

    public VkPresentInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPresentInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPresentInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPresentInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPresentInfoKHR alloc(SegmentAllocator allocator) { return new VkPresentInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPresentInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPresentInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPresentInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRSwapchain.VK_STRUCTURE_TYPE_PRESENT_INFO_KHR); }
    public static VkPresentInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRSwapchain.VK_STRUCTURE_TYPE_PRESENT_INFO_KHR);
        return s;
    }
    public VkPresentInfoKHR copyFrom(VkPresentInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPresentInfoKHR reinterpret(long count) { return new VkPresentInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPresentInfoKHR asSlice(long index) { return new VkPresentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPresentInfoKHR asSlice(long index, long count) { return new VkPresentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPresentInfoKHR at(long index, Consumer<VkPresentInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int waitSemaphoreCountAt(long index) { return (int) VH_waitSemaphoreCount.get(this.segment(), 0L, index); }
    public MemorySegment pWaitSemaphoresAt(long index) { return (MemorySegment) VH_pWaitSemaphores.get(this.segment(), 0L, index); }
    public int swapchainCountAt(long index) { return (int) VH_swapchainCount.get(this.segment(), 0L, index); }
    public MemorySegment pSwapchainsAt(long index) { return (MemorySegment) VH_pSwapchains.get(this.segment(), 0L, index); }
    public MemorySegment pImageIndicesAt(long index) { return (MemorySegment) VH_pImageIndices.get(this.segment(), 0L, index); }
    public MemorySegment pResultsAt(long index) { return (MemorySegment) VH_pResults.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int waitSemaphoreCount() { return (int) VH_waitSemaphoreCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pWaitSemaphores() { return (MemorySegment) VH_pWaitSemaphores.get(this.segment(), 0L, 0L); }
    public int swapchainCount() { return (int) VH_swapchainCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pSwapchains() { return (MemorySegment) VH_pSwapchains.get(this.segment(), 0L, 0L); }
    public MemorySegment pImageIndices() { return (MemorySegment) VH_pImageIndices.get(this.segment(), 0L, 0L); }
    public MemorySegment pResults() { return (MemorySegment) VH_pResults.get(this.segment(), 0L, 0L); }
    public VkPresentInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPresentInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPresentInfoKHR waitSemaphoreCountAt(long index, int value) { VH_waitSemaphoreCount.set(this.segment(), 0L, index, value); return this; }
    public VkPresentInfoKHR pWaitSemaphoresAt(long index, MemorySegment value) { VH_pWaitSemaphores.set(this.segment(), 0L, index, value); return this; }
    public VkPresentInfoKHR swapchainCountAt(long index, int value) { VH_swapchainCount.set(this.segment(), 0L, index, value); return this; }
    public VkPresentInfoKHR pSwapchainsAt(long index, MemorySegment value) { VH_pSwapchains.set(this.segment(), 0L, index, value); return this; }
    public VkPresentInfoKHR pImageIndicesAt(long index, MemorySegment value) { VH_pImageIndices.set(this.segment(), 0L, index, value); return this; }
    public VkPresentInfoKHR pResultsAt(long index, MemorySegment value) { VH_pResults.set(this.segment(), 0L, index, value); return this; }
    public VkPresentInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentInfoKHR waitSemaphoreCount(int value) { VH_waitSemaphoreCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentInfoKHR pWaitSemaphores(MemorySegment value) { VH_pWaitSemaphores.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentInfoKHR swapchainCount(int value) { VH_swapchainCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentInfoKHR pSwapchains(MemorySegment value) { VH_pSwapchains.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentInfoKHR pImageIndices(MemorySegment value) { VH_pImageIndices.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentInfoKHR pResults(MemorySegment value) { VH_pResults.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPresentInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPresentInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPresentInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPresentInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _waitSemaphoreCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_waitSemaphoreCount, index), LAYOUT_waitSemaphoreCount); }
    public MemorySegment _waitSemaphoreCount() { return _waitSemaphoreCountAt(0L); }
    public VkPresentInfoKHR _waitSemaphoreCountAt(long index, MemorySegment src) { _waitSemaphoreCountAt(index).copyFrom(src); return this; }
    public VkPresentInfoKHR _waitSemaphoreCount(MemorySegment src) { return _waitSemaphoreCountAt(0L, src); }
    public MemorySegment _pWaitSemaphoresAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pWaitSemaphores, index), LAYOUT_pWaitSemaphores); }
    public MemorySegment _pWaitSemaphores() { return _pWaitSemaphoresAt(0L); }
    public VkPresentInfoKHR _pWaitSemaphoresAt(long index, MemorySegment src) { _pWaitSemaphoresAt(index).copyFrom(src); return this; }
    public VkPresentInfoKHR _pWaitSemaphores(MemorySegment src) { return _pWaitSemaphoresAt(0L, src); }
    public MemorySegment _swapchainCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_swapchainCount, index), LAYOUT_swapchainCount); }
    public MemorySegment _swapchainCount() { return _swapchainCountAt(0L); }
    public VkPresentInfoKHR _swapchainCountAt(long index, MemorySegment src) { _swapchainCountAt(index).copyFrom(src); return this; }
    public VkPresentInfoKHR _swapchainCount(MemorySegment src) { return _swapchainCountAt(0L, src); }
    public MemorySegment _pSwapchainsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSwapchains, index), LAYOUT_pSwapchains); }
    public MemorySegment _pSwapchains() { return _pSwapchainsAt(0L); }
    public VkPresentInfoKHR _pSwapchainsAt(long index, MemorySegment src) { _pSwapchainsAt(index).copyFrom(src); return this; }
    public VkPresentInfoKHR _pSwapchains(MemorySegment src) { return _pSwapchainsAt(0L, src); }
    public MemorySegment _pImageIndicesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pImageIndices, index), LAYOUT_pImageIndices); }
    public MemorySegment _pImageIndices() { return _pImageIndicesAt(0L); }
    public VkPresentInfoKHR _pImageIndicesAt(long index, MemorySegment src) { _pImageIndicesAt(index).copyFrom(src); return this; }
    public VkPresentInfoKHR _pImageIndices(MemorySegment src) { return _pImageIndicesAt(0L, src); }
    public MemorySegment _pResultsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pResults, index), LAYOUT_pResults); }
    public MemorySegment _pResults() { return _pResultsAt(0L); }
    public VkPresentInfoKHR _pResultsAt(long index, MemorySegment src) { _pResultsAt(index).copyFrom(src); return this; }
    public VkPresentInfoKHR _pResults(MemorySegment src) { return _pResultsAt(0L, src); }
}
