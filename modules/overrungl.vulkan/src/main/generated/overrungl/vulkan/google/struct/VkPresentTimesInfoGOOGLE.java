// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.google.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPresentTimesInfoGOOGLE`.
/// ## Layout
/// ```
/// struct VkPresentTimesInfoGOOGLE {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t swapchainCount;
///     const VkPresentTimeGOOGLE* pTimes;
/// }
/// ```
public final class VkPresentTimesInfoGOOGLE extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withName("pTimes")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_swapchainCount = LAYOUT.byteOffset(PathElement.groupElement("swapchainCount"));
    public static final long OFFSET_pTimes = LAYOUT.byteOffset(PathElement.groupElement("pTimes"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_swapchainCount = LAYOUT.select(PathElement.groupElement("swapchainCount"));
    public static final MemoryLayout LAYOUT_pTimes = LAYOUT.select(PathElement.groupElement("pTimes"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_swapchainCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchainCount"));
    public static final VarHandle VH_pTimes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTimes"));

    public VkPresentTimesInfoGOOGLE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPresentTimesInfoGOOGLE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentTimesInfoGOOGLE(segment, estimateCount(segment, LAYOUT)); }
    public static VkPresentTimesInfoGOOGLE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentTimesInfoGOOGLE(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPresentTimesInfoGOOGLE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentTimesInfoGOOGLE(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPresentTimesInfoGOOGLE alloc(SegmentAllocator allocator) { return new VkPresentTimesInfoGOOGLE(allocator.allocate(LAYOUT), 1); }
    public static VkPresentTimesInfoGOOGLE alloc(SegmentAllocator allocator, long count) { return new VkPresentTimesInfoGOOGLE(allocator.allocate(LAYOUT, count), count); }
    public static VkPresentTimesInfoGOOGLE allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.google.VKGOOGLEDisplayTiming.VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE); }
    public static VkPresentTimesInfoGOOGLE allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.google.VKGOOGLEDisplayTiming.VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE);
        return s;
    }
    public VkPresentTimesInfoGOOGLE copyFrom(VkPresentTimesInfoGOOGLE src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPresentTimesInfoGOOGLE reinterpret(long count) { return new VkPresentTimesInfoGOOGLE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPresentTimesInfoGOOGLE asSlice(long index) { return new VkPresentTimesInfoGOOGLE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPresentTimesInfoGOOGLE asSlice(long index, long count) { return new VkPresentTimesInfoGOOGLE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPresentTimesInfoGOOGLE at(long index, Consumer<VkPresentTimesInfoGOOGLE> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int swapchainCountAt(long index) { return (int) VH_swapchainCount.get(this.segment(), 0L, index); }
    public MemorySegment pTimesAt(long index) { return (MemorySegment) VH_pTimes.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int swapchainCount() { return (int) VH_swapchainCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pTimes() { return (MemorySegment) VH_pTimes.get(this.segment(), 0L, 0L); }
    public VkPresentTimesInfoGOOGLE sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPresentTimesInfoGOOGLE pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPresentTimesInfoGOOGLE swapchainCountAt(long index, int value) { VH_swapchainCount.set(this.segment(), 0L, index, value); return this; }
    public VkPresentTimesInfoGOOGLE pTimesAt(long index, MemorySegment value) { VH_pTimes.set(this.segment(), 0L, index, value); return this; }
    public VkPresentTimesInfoGOOGLE sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentTimesInfoGOOGLE pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentTimesInfoGOOGLE swapchainCount(int value) { VH_swapchainCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentTimesInfoGOOGLE pTimes(MemorySegment value) { VH_pTimes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPresentTimesInfoGOOGLE _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPresentTimesInfoGOOGLE _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPresentTimesInfoGOOGLE _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPresentTimesInfoGOOGLE _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _swapchainCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_swapchainCount, index), LAYOUT_swapchainCount); }
    public MemorySegment _swapchainCount() { return _swapchainCountAt(0L); }
    public VkPresentTimesInfoGOOGLE _swapchainCountAt(long index, MemorySegment src) { _swapchainCountAt(index).copyFrom(src); return this; }
    public VkPresentTimesInfoGOOGLE _swapchainCount(MemorySegment src) { return _swapchainCountAt(0L, src); }
    public MemorySegment _pTimesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pTimes, index), LAYOUT_pTimes); }
    public MemorySegment _pTimes() { return _pTimesAt(0L); }
    public VkPresentTimesInfoGOOGLE _pTimesAt(long index, MemorySegment src) { _pTimesAt(index).copyFrom(src); return this; }
    public VkPresentTimesInfoGOOGLE _pTimes(MemorySegment src) { return _pTimesAt(0L, src); }
}
