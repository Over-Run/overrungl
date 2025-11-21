// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSwapchainPresentModeInfoEXT`.
/// ## Layout
/// ```
/// struct VkSwapchainPresentModeInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t swapchainCount;
///     const VkPresentModeKHR* pPresentModes;
/// }
/// ```
public final class VkSwapchainPresentModeInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withName("pPresentModes")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_swapchainCount = LAYOUT.byteOffset(PathElement.groupElement("swapchainCount"));
    public static final long OFFSET_pPresentModes = LAYOUT.byteOffset(PathElement.groupElement("pPresentModes"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_swapchainCount = LAYOUT.select(PathElement.groupElement("swapchainCount"));
    public static final MemoryLayout LAYOUT_pPresentModes = LAYOUT.select(PathElement.groupElement("pPresentModes"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_swapchainCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchainCount"));
    public static final VarHandle VH_pPresentModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPresentModes"));

    public VkSwapchainPresentModeInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSwapchainPresentModeInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentModeInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkSwapchainPresentModeInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentModeInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSwapchainPresentModeInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentModeInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSwapchainPresentModeInfoEXT alloc(SegmentAllocator allocator) { return new VkSwapchainPresentModeInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkSwapchainPresentModeInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkSwapchainPresentModeInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkSwapchainPresentModeInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_KHR); }
    public static VkSwapchainPresentModeInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_KHR);
        return s;
    }
    public VkSwapchainPresentModeInfoEXT copyFrom(VkSwapchainPresentModeInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSwapchainPresentModeInfoEXT reinterpret(long count) { return new VkSwapchainPresentModeInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSwapchainPresentModeInfoEXT asSlice(long index) { return new VkSwapchainPresentModeInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSwapchainPresentModeInfoEXT asSlice(long index, long count) { return new VkSwapchainPresentModeInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSwapchainPresentModeInfoEXT at(long index, Consumer<VkSwapchainPresentModeInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int swapchainCountAt(long index) { return (int) VH_swapchainCount.get(this.segment(), 0L, index); }
    public MemorySegment pPresentModesAt(long index) { return (MemorySegment) VH_pPresentModes.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int swapchainCount() { return (int) VH_swapchainCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pPresentModes() { return (MemorySegment) VH_pPresentModes.get(this.segment(), 0L, 0L); }
    public VkSwapchainPresentModeInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentModeInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentModeInfoEXT swapchainCountAt(long index, int value) { VH_swapchainCount.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentModeInfoEXT pPresentModesAt(long index, MemorySegment value) { VH_pPresentModes.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentModeInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainPresentModeInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainPresentModeInfoEXT swapchainCount(int value) { VH_swapchainCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainPresentModeInfoEXT pPresentModes(MemorySegment value) { VH_pPresentModes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSwapchainPresentModeInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentModeInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSwapchainPresentModeInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentModeInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _swapchainCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_swapchainCount, index), LAYOUT_swapchainCount); }
    public MemorySegment _swapchainCount() { return _swapchainCountAt(0L); }
    public VkSwapchainPresentModeInfoEXT _swapchainCountAt(long index, MemorySegment src) { _swapchainCountAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentModeInfoEXT _swapchainCount(MemorySegment src) { return _swapchainCountAt(0L, src); }
    public MemorySegment _pPresentModesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPresentModes, index), LAYOUT_pPresentModes); }
    public MemorySegment _pPresentModes() { return _pPresentModesAt(0L); }
    public VkSwapchainPresentModeInfoEXT _pPresentModesAt(long index, MemorySegment src) { _pPresentModesAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentModeInfoEXT _pPresentModes(MemorySegment src) { return _pPresentModesAt(0L, src); }
}
