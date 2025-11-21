// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSwapchainCounterCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkSwapchainCounterCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkSurfaceCounterFlagsEXT surfaceCounters;
/// }
/// ```
public final class VkSwapchainCounterCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("surfaceCounters")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_surfaceCounters = LAYOUT.byteOffset(PathElement.groupElement("surfaceCounters"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_surfaceCounters = LAYOUT.select(PathElement.groupElement("surfaceCounters"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_surfaceCounters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surfaceCounters"));

    public VkSwapchainCounterCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSwapchainCounterCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainCounterCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkSwapchainCounterCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainCounterCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSwapchainCounterCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainCounterCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSwapchainCounterCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkSwapchainCounterCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkSwapchainCounterCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkSwapchainCounterCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkSwapchainCounterCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDisplayControl.VK_STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT); }
    public static VkSwapchainCounterCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDisplayControl.VK_STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT);
        return s;
    }
    public VkSwapchainCounterCreateInfoEXT copyFrom(VkSwapchainCounterCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSwapchainCounterCreateInfoEXT reinterpret(long count) { return new VkSwapchainCounterCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSwapchainCounterCreateInfoEXT asSlice(long index) { return new VkSwapchainCounterCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSwapchainCounterCreateInfoEXT asSlice(long index, long count) { return new VkSwapchainCounterCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSwapchainCounterCreateInfoEXT at(long index, Consumer<VkSwapchainCounterCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int surfaceCountersAt(long index) { return (int) VH_surfaceCounters.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int surfaceCounters() { return (int) VH_surfaceCounters.get(this.segment(), 0L, 0L); }
    public VkSwapchainCounterCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCounterCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCounterCreateInfoEXT surfaceCountersAt(long index, int value) { VH_surfaceCounters.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCounterCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCounterCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCounterCreateInfoEXT surfaceCounters(int value) { VH_surfaceCounters.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSwapchainCounterCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSwapchainCounterCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSwapchainCounterCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSwapchainCounterCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _surfaceCountersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_surfaceCounters, index), LAYOUT_surfaceCounters); }
    public MemorySegment _surfaceCounters() { return _surfaceCountersAt(0L); }
    public VkSwapchainCounterCreateInfoEXT _surfaceCountersAt(long index, MemorySegment src) { _surfaceCountersAt(index).copyFrom(src); return this; }
    public VkSwapchainCounterCreateInfoEXT _surfaceCounters(MemorySegment src) { return _surfaceCountersAt(0L, src); }
}
