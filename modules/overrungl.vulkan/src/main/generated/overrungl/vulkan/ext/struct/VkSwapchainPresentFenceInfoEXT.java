// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSwapchainPresentFenceInfoEXT`.
/// ## Layout
/// ```
/// struct VkSwapchainPresentFenceInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t swapchainCount;
///     const VkFence* pFences;
/// }
/// ```
public final class VkSwapchainPresentFenceInfoEXT extends GroupType {
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

    public VkSwapchainPresentFenceInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSwapchainPresentFenceInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentFenceInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkSwapchainPresentFenceInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentFenceInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSwapchainPresentFenceInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentFenceInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSwapchainPresentFenceInfoEXT alloc(SegmentAllocator allocator) { return new VkSwapchainPresentFenceInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkSwapchainPresentFenceInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkSwapchainPresentFenceInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkSwapchainPresentFenceInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_KHR); }
    public static VkSwapchainPresentFenceInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_KHR);
        return s;
    }
    public VkSwapchainPresentFenceInfoEXT copyFrom(VkSwapchainPresentFenceInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSwapchainPresentFenceInfoEXT reinterpret(long count) { return new VkSwapchainPresentFenceInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSwapchainPresentFenceInfoEXT asSlice(long index) { return new VkSwapchainPresentFenceInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSwapchainPresentFenceInfoEXT asSlice(long index, long count) { return new VkSwapchainPresentFenceInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSwapchainPresentFenceInfoEXT at(long index, Consumer<VkSwapchainPresentFenceInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int swapchainCountAt(long index) { return (int) VH_swapchainCount.get(this.segment(), 0L, index); }
    public MemorySegment pFencesAt(long index) { return (MemorySegment) VH_pFences.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int swapchainCount() { return (int) VH_swapchainCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pFences() { return (MemorySegment) VH_pFences.get(this.segment(), 0L, 0L); }
    public VkSwapchainPresentFenceInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentFenceInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentFenceInfoEXT swapchainCountAt(long index, int value) { VH_swapchainCount.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentFenceInfoEXT pFencesAt(long index, MemorySegment value) { VH_pFences.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentFenceInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainPresentFenceInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainPresentFenceInfoEXT swapchainCount(int value) { VH_swapchainCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainPresentFenceInfoEXT pFences(MemorySegment value) { VH_pFences.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSwapchainPresentFenceInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentFenceInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSwapchainPresentFenceInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentFenceInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _swapchainCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_swapchainCount, index), LAYOUT_swapchainCount); }
    public MemorySegment _swapchainCount() { return _swapchainCountAt(0L); }
    public VkSwapchainPresentFenceInfoEXT _swapchainCountAt(long index, MemorySegment src) { _swapchainCountAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentFenceInfoEXT _swapchainCount(MemorySegment src) { return _swapchainCountAt(0L, src); }
    public MemorySegment _pFencesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pFences, index), LAYOUT_pFences); }
    public MemorySegment _pFences() { return _pFencesAt(0L); }
    public VkSwapchainPresentFenceInfoEXT _pFencesAt(long index, MemorySegment src) { _pFencesAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentFenceInfoEXT _pFences(MemorySegment src) { return _pFencesAt(0L, src); }
}
