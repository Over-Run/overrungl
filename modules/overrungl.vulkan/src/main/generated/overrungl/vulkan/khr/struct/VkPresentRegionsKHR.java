// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPresentRegionsKHR`.
/// ## Layout
/// ```
/// struct VkPresentRegionsKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t swapchainCount;
///     const VkPresentRegionKHR* pRegions;
/// }
/// ```
public final class VkPresentRegionsKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withName("pRegions")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_swapchainCount = LAYOUT.byteOffset(PathElement.groupElement("swapchainCount"));
    public static final long OFFSET_pRegions = LAYOUT.byteOffset(PathElement.groupElement("pRegions"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_swapchainCount = LAYOUT.select(PathElement.groupElement("swapchainCount"));
    public static final MemoryLayout LAYOUT_pRegions = LAYOUT.select(PathElement.groupElement("pRegions"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_swapchainCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchainCount"));
    public static final VarHandle VH_pRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRegions"));

    public VkPresentRegionsKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPresentRegionsKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentRegionsKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPresentRegionsKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentRegionsKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPresentRegionsKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentRegionsKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPresentRegionsKHR alloc(SegmentAllocator allocator) { return new VkPresentRegionsKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPresentRegionsKHR alloc(SegmentAllocator allocator, long count) { return new VkPresentRegionsKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPresentRegionsKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRIncrementalPresent.VK_STRUCTURE_TYPE_PRESENT_REGIONS_KHR); }
    public static VkPresentRegionsKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRIncrementalPresent.VK_STRUCTURE_TYPE_PRESENT_REGIONS_KHR);
        return s;
    }
    public VkPresentRegionsKHR copyFrom(VkPresentRegionsKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPresentRegionsKHR reinterpret(long count) { return new VkPresentRegionsKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPresentRegionsKHR asSlice(long index) { return new VkPresentRegionsKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPresentRegionsKHR asSlice(long index, long count) { return new VkPresentRegionsKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPresentRegionsKHR at(long index, Consumer<VkPresentRegionsKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int swapchainCountAt(long index) { return (int) VH_swapchainCount.get(this.segment(), 0L, index); }
    public MemorySegment pRegionsAt(long index) { return (MemorySegment) VH_pRegions.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int swapchainCount() { return (int) VH_swapchainCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pRegions() { return (MemorySegment) VH_pRegions.get(this.segment(), 0L, 0L); }
    public VkPresentRegionsKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPresentRegionsKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPresentRegionsKHR swapchainCountAt(long index, int value) { VH_swapchainCount.set(this.segment(), 0L, index, value); return this; }
    public VkPresentRegionsKHR pRegionsAt(long index, MemorySegment value) { VH_pRegions.set(this.segment(), 0L, index, value); return this; }
    public VkPresentRegionsKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentRegionsKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentRegionsKHR swapchainCount(int value) { VH_swapchainCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentRegionsKHR pRegions(MemorySegment value) { VH_pRegions.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPresentRegionsKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPresentRegionsKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPresentRegionsKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPresentRegionsKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _swapchainCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_swapchainCount, index), LAYOUT_swapchainCount); }
    public MemorySegment _swapchainCount() { return _swapchainCountAt(0L); }
    public VkPresentRegionsKHR _swapchainCountAt(long index, MemorySegment src) { _swapchainCountAt(index).copyFrom(src); return this; }
    public VkPresentRegionsKHR _swapchainCount(MemorySegment src) { return _swapchainCountAt(0L, src); }
    public MemorySegment _pRegionsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pRegions, index), LAYOUT_pRegions); }
    public MemorySegment _pRegions() { return _pRegionsAt(0L); }
    public VkPresentRegionsKHR _pRegionsAt(long index, MemorySegment src) { _pRegionsAt(index).copyFrom(src); return this; }
    public VkPresentRegionsKHR _pRegions(MemorySegment src) { return _pRegionsAt(0L, src); }
}
