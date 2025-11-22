// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPresentId2KHR`.
/// ## Layout
/// ```
/// struct VkPresentId2KHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t swapchainCount;
///     const uint64_t* pPresentIds;
/// }
/// ```
public final class VkPresentId2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withName("pPresentIds")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_swapchainCount = LAYOUT.byteOffset(PathElement.groupElement("swapchainCount"));
    public static final long OFFSET_pPresentIds = LAYOUT.byteOffset(PathElement.groupElement("pPresentIds"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_swapchainCount = LAYOUT.select(PathElement.groupElement("swapchainCount"));
    public static final MemoryLayout LAYOUT_pPresentIds = LAYOUT.select(PathElement.groupElement("pPresentIds"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_swapchainCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchainCount"));
    public static final VarHandle VH_pPresentIds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPresentIds"));

    public VkPresentId2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPresentId2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentId2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPresentId2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentId2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPresentId2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentId2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPresentId2KHR alloc(SegmentAllocator allocator) { return new VkPresentId2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkPresentId2KHR alloc(SegmentAllocator allocator, long count) { return new VkPresentId2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPresentId2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPresentId2.VK_STRUCTURE_TYPE_PRESENT_ID_2_KHR); }
    public static VkPresentId2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPresentId2.VK_STRUCTURE_TYPE_PRESENT_ID_2_KHR);
        return s;
    }
    public VkPresentId2KHR copyFrom(VkPresentId2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPresentId2KHR reinterpret(long count) { return new VkPresentId2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPresentId2KHR asSlice(long index) { return new VkPresentId2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPresentId2KHR asSlice(long index, long count) { return new VkPresentId2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPresentId2KHR at(long index, Consumer<VkPresentId2KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int swapchainCountAt(long index) { return (int) VH_swapchainCount.get(this.segment(), 0L, index); }
    public MemorySegment pPresentIdsAt(long index) { return (MemorySegment) VH_pPresentIds.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int swapchainCount() { return (int) VH_swapchainCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pPresentIds() { return (MemorySegment) VH_pPresentIds.get(this.segment(), 0L, 0L); }
    public VkPresentId2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPresentId2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPresentId2KHR swapchainCountAt(long index, int value) { VH_swapchainCount.set(this.segment(), 0L, index, value); return this; }
    public VkPresentId2KHR pPresentIdsAt(long index, MemorySegment value) { VH_pPresentIds.set(this.segment(), 0L, index, value); return this; }
    public VkPresentId2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentId2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentId2KHR swapchainCount(int value) { VH_swapchainCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentId2KHR pPresentIds(MemorySegment value) { VH_pPresentIds.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPresentId2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPresentId2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPresentId2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPresentId2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _swapchainCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_swapchainCount, index), LAYOUT_swapchainCount); }
    public MemorySegment _swapchainCount() { return _swapchainCountAt(0L); }
    public VkPresentId2KHR _swapchainCountAt(long index, MemorySegment src) { _swapchainCountAt(index).copyFrom(src); return this; }
    public VkPresentId2KHR _swapchainCount(MemorySegment src) { return _swapchainCountAt(0L, src); }
    public MemorySegment _pPresentIdsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPresentIds, index), LAYOUT_pPresentIds); }
    public MemorySegment _pPresentIds() { return _pPresentIdsAt(0L); }
    public VkPresentId2KHR _pPresentIdsAt(long index, MemorySegment src) { _pPresentIdsAt(index).copyFrom(src); return this; }
    public VkPresentId2KHR _pPresentIds(MemorySegment src) { return _pPresentIdsAt(0L, src); }
}
