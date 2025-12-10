// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSwapchainTimingPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkSwapchainTimingPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint64_t refreshDuration;
///     uint64_t refreshInterval;
/// }
/// ```
public final class VkSwapchainTimingPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("refreshDuration"),
        ValueLayout.JAVA_LONG.withName("refreshInterval")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_refreshDuration = LAYOUT.byteOffset(PathElement.groupElement("refreshDuration"));
    public static final long OFFSET_refreshInterval = LAYOUT.byteOffset(PathElement.groupElement("refreshInterval"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_refreshDuration = LAYOUT.select(PathElement.groupElement("refreshDuration"));
    public static final MemoryLayout LAYOUT_refreshInterval = LAYOUT.select(PathElement.groupElement("refreshInterval"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_refreshDuration = LAYOUT.arrayElementVarHandle(PathElement.groupElement("refreshDuration"));
    public static final VarHandle VH_refreshInterval = LAYOUT.arrayElementVarHandle(PathElement.groupElement("refreshInterval"));

    public VkSwapchainTimingPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSwapchainTimingPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainTimingPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkSwapchainTimingPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainTimingPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSwapchainTimingPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainTimingPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSwapchainTimingPropertiesEXT alloc(SegmentAllocator allocator) { return new VkSwapchainTimingPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkSwapchainTimingPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkSwapchainTimingPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkSwapchainTimingPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTPresentTiming.VK_STRUCTURE_TYPE_SWAPCHAIN_TIMING_PROPERTIES_EXT); }
    public static VkSwapchainTimingPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTPresentTiming.VK_STRUCTURE_TYPE_SWAPCHAIN_TIMING_PROPERTIES_EXT);
        return s;
    }
    public VkSwapchainTimingPropertiesEXT copyFrom(VkSwapchainTimingPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSwapchainTimingPropertiesEXT reinterpret(long count) { return new VkSwapchainTimingPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSwapchainTimingPropertiesEXT asSlice(long index) { return new VkSwapchainTimingPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSwapchainTimingPropertiesEXT asSlice(long index, long count) { return new VkSwapchainTimingPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSwapchainTimingPropertiesEXT at(long index, Consumer<VkSwapchainTimingPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long refreshDurationAt(long index) { return (long) VH_refreshDuration.get(this.segment(), 0L, index); }
    public long refreshIntervalAt(long index) { return (long) VH_refreshInterval.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long refreshDuration() { return (long) VH_refreshDuration.get(this.segment(), 0L, 0L); }
    public long refreshInterval() { return (long) VH_refreshInterval.get(this.segment(), 0L, 0L); }
    public VkSwapchainTimingPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainTimingPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainTimingPropertiesEXT refreshDurationAt(long index, long value) { VH_refreshDuration.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainTimingPropertiesEXT refreshIntervalAt(long index, long value) { VH_refreshInterval.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainTimingPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainTimingPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainTimingPropertiesEXT refreshDuration(long value) { VH_refreshDuration.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainTimingPropertiesEXT refreshInterval(long value) { VH_refreshInterval.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSwapchainTimingPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSwapchainTimingPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSwapchainTimingPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSwapchainTimingPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _refreshDurationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_refreshDuration, index), LAYOUT_refreshDuration); }
    public MemorySegment _refreshDuration() { return _refreshDurationAt(0L); }
    public VkSwapchainTimingPropertiesEXT _refreshDurationAt(long index, MemorySegment src) { _refreshDurationAt(index).copyFrom(src); return this; }
    public VkSwapchainTimingPropertiesEXT _refreshDuration(MemorySegment src) { return _refreshDurationAt(0L, src); }
    public MemorySegment _refreshIntervalAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_refreshInterval, index), LAYOUT_refreshInterval); }
    public MemorySegment _refreshInterval() { return _refreshIntervalAt(0L); }
    public VkSwapchainTimingPropertiesEXT _refreshIntervalAt(long index, MemorySegment src) { _refreshIntervalAt(index).copyFrom(src); return this; }
    public VkSwapchainTimingPropertiesEXT _refreshInterval(MemorySegment src) { return _refreshIntervalAt(0L, src); }
}
