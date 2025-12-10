// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSwapchainCalibratedTimestampInfoEXT`.
/// ## Layout
/// ```
/// struct VkSwapchainCalibratedTimestampInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkSwapchainKHR swapchain;
///     VkPresentStageFlagsEXT presentStage;
///     uint64_t timeDomainId;
/// }
/// ```
public final class VkSwapchainCalibratedTimestampInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("swapchain"),
        ValueLayout.JAVA_INT.withName("presentStage"),
        ValueLayout.JAVA_LONG.withName("timeDomainId")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_swapchain = LAYOUT.byteOffset(PathElement.groupElement("swapchain"));
    public static final long OFFSET_presentStage = LAYOUT.byteOffset(PathElement.groupElement("presentStage"));
    public static final long OFFSET_timeDomainId = LAYOUT.byteOffset(PathElement.groupElement("timeDomainId"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_swapchain = LAYOUT.select(PathElement.groupElement("swapchain"));
    public static final MemoryLayout LAYOUT_presentStage = LAYOUT.select(PathElement.groupElement("presentStage"));
    public static final MemoryLayout LAYOUT_timeDomainId = LAYOUT.select(PathElement.groupElement("timeDomainId"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_swapchain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchain"));
    public static final VarHandle VH_presentStage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentStage"));
    public static final VarHandle VH_timeDomainId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timeDomainId"));

    public VkSwapchainCalibratedTimestampInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSwapchainCalibratedTimestampInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainCalibratedTimestampInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkSwapchainCalibratedTimestampInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainCalibratedTimestampInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSwapchainCalibratedTimestampInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainCalibratedTimestampInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSwapchainCalibratedTimestampInfoEXT alloc(SegmentAllocator allocator) { return new VkSwapchainCalibratedTimestampInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkSwapchainCalibratedTimestampInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkSwapchainCalibratedTimestampInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkSwapchainCalibratedTimestampInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTPresentTiming.VK_STRUCTURE_TYPE_SWAPCHAIN_CALIBRATED_TIMESTAMP_INFO_EXT); }
    public static VkSwapchainCalibratedTimestampInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTPresentTiming.VK_STRUCTURE_TYPE_SWAPCHAIN_CALIBRATED_TIMESTAMP_INFO_EXT);
        return s;
    }
    public VkSwapchainCalibratedTimestampInfoEXT copyFrom(VkSwapchainCalibratedTimestampInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSwapchainCalibratedTimestampInfoEXT reinterpret(long count) { return new VkSwapchainCalibratedTimestampInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSwapchainCalibratedTimestampInfoEXT asSlice(long index) { return new VkSwapchainCalibratedTimestampInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSwapchainCalibratedTimestampInfoEXT asSlice(long index, long count) { return new VkSwapchainCalibratedTimestampInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSwapchainCalibratedTimestampInfoEXT at(long index, Consumer<VkSwapchainCalibratedTimestampInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long swapchainAt(long index) { return (long) VH_swapchain.get(this.segment(), 0L, index); }
    public int presentStageAt(long index) { return (int) VH_presentStage.get(this.segment(), 0L, index); }
    public long timeDomainIdAt(long index) { return (long) VH_timeDomainId.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long swapchain() { return (long) VH_swapchain.get(this.segment(), 0L, 0L); }
    public int presentStage() { return (int) VH_presentStage.get(this.segment(), 0L, 0L); }
    public long timeDomainId() { return (long) VH_timeDomainId.get(this.segment(), 0L, 0L); }
    public VkSwapchainCalibratedTimestampInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCalibratedTimestampInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCalibratedTimestampInfoEXT swapchainAt(long index, long value) { VH_swapchain.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCalibratedTimestampInfoEXT presentStageAt(long index, int value) { VH_presentStage.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCalibratedTimestampInfoEXT timeDomainIdAt(long index, long value) { VH_timeDomainId.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainCalibratedTimestampInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCalibratedTimestampInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCalibratedTimestampInfoEXT swapchain(long value) { VH_swapchain.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCalibratedTimestampInfoEXT presentStage(int value) { VH_presentStage.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainCalibratedTimestampInfoEXT timeDomainId(long value) { VH_timeDomainId.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSwapchainCalibratedTimestampInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSwapchainCalibratedTimestampInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSwapchainCalibratedTimestampInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSwapchainCalibratedTimestampInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _swapchainAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_swapchain, index), LAYOUT_swapchain); }
    public MemorySegment _swapchain() { return _swapchainAt(0L); }
    public VkSwapchainCalibratedTimestampInfoEXT _swapchainAt(long index, MemorySegment src) { _swapchainAt(index).copyFrom(src); return this; }
    public VkSwapchainCalibratedTimestampInfoEXT _swapchain(MemorySegment src) { return _swapchainAt(0L, src); }
    public MemorySegment _presentStageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentStage, index), LAYOUT_presentStage); }
    public MemorySegment _presentStage() { return _presentStageAt(0L); }
    public VkSwapchainCalibratedTimestampInfoEXT _presentStageAt(long index, MemorySegment src) { _presentStageAt(index).copyFrom(src); return this; }
    public VkSwapchainCalibratedTimestampInfoEXT _presentStage(MemorySegment src) { return _presentStageAt(0L, src); }
    public MemorySegment _timeDomainIdAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_timeDomainId, index), LAYOUT_timeDomainId); }
    public MemorySegment _timeDomainId() { return _timeDomainIdAt(0L); }
    public VkSwapchainCalibratedTimestampInfoEXT _timeDomainIdAt(long index, MemorySegment src) { _timeDomainIdAt(index).copyFrom(src); return this; }
    public VkSwapchainCalibratedTimestampInfoEXT _timeDomainId(MemorySegment src) { return _timeDomainIdAt(0L, src); }
}
