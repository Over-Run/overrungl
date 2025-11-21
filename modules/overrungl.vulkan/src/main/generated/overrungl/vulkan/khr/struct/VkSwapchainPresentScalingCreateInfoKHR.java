// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSwapchainPresentScalingCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkSwapchainPresentScalingCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkPresentScalingFlagsKHR scalingBehavior;
///     VkPresentGravityFlagsKHR presentGravityX;
///     VkPresentGravityFlagsKHR presentGravityY;
/// }
/// ```
public final class VkSwapchainPresentScalingCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("scalingBehavior"),
        ValueLayout.JAVA_INT.withName("presentGravityX"),
        ValueLayout.JAVA_INT.withName("presentGravityY")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_scalingBehavior = LAYOUT.byteOffset(PathElement.groupElement("scalingBehavior"));
    public static final long OFFSET_presentGravityX = LAYOUT.byteOffset(PathElement.groupElement("presentGravityX"));
    public static final long OFFSET_presentGravityY = LAYOUT.byteOffset(PathElement.groupElement("presentGravityY"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_scalingBehavior = LAYOUT.select(PathElement.groupElement("scalingBehavior"));
    public static final MemoryLayout LAYOUT_presentGravityX = LAYOUT.select(PathElement.groupElement("presentGravityX"));
    public static final MemoryLayout LAYOUT_presentGravityY = LAYOUT.select(PathElement.groupElement("presentGravityY"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_scalingBehavior = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scalingBehavior"));
    public static final VarHandle VH_presentGravityX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentGravityX"));
    public static final VarHandle VH_presentGravityY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentGravityY"));

    public VkSwapchainPresentScalingCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSwapchainPresentScalingCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentScalingCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkSwapchainPresentScalingCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentScalingCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSwapchainPresentScalingCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentScalingCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSwapchainPresentScalingCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkSwapchainPresentScalingCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkSwapchainPresentScalingCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkSwapchainPresentScalingCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkSwapchainPresentScalingCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_KHR); }
    public static VkSwapchainPresentScalingCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_KHR);
        return s;
    }
    public VkSwapchainPresentScalingCreateInfoKHR copyFrom(VkSwapchainPresentScalingCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSwapchainPresentScalingCreateInfoKHR reinterpret(long count) { return new VkSwapchainPresentScalingCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSwapchainPresentScalingCreateInfoKHR asSlice(long index) { return new VkSwapchainPresentScalingCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSwapchainPresentScalingCreateInfoKHR asSlice(long index, long count) { return new VkSwapchainPresentScalingCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSwapchainPresentScalingCreateInfoKHR at(long index, Consumer<VkSwapchainPresentScalingCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int scalingBehaviorAt(long index) { return (int) VH_scalingBehavior.get(this.segment(), 0L, index); }
    public int presentGravityXAt(long index) { return (int) VH_presentGravityX.get(this.segment(), 0L, index); }
    public int presentGravityYAt(long index) { return (int) VH_presentGravityY.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int scalingBehavior() { return (int) VH_scalingBehavior.get(this.segment(), 0L, 0L); }
    public int presentGravityX() { return (int) VH_presentGravityX.get(this.segment(), 0L, 0L); }
    public int presentGravityY() { return (int) VH_presentGravityY.get(this.segment(), 0L, 0L); }
    public VkSwapchainPresentScalingCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentScalingCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentScalingCreateInfoKHR scalingBehaviorAt(long index, int value) { VH_scalingBehavior.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentScalingCreateInfoKHR presentGravityXAt(long index, int value) { VH_presentGravityX.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentScalingCreateInfoKHR presentGravityYAt(long index, int value) { VH_presentGravityY.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentScalingCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainPresentScalingCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainPresentScalingCreateInfoKHR scalingBehavior(int value) { VH_scalingBehavior.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainPresentScalingCreateInfoKHR presentGravityX(int value) { VH_presentGravityX.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainPresentScalingCreateInfoKHR presentGravityY(int value) { VH_presentGravityY.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSwapchainPresentScalingCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentScalingCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSwapchainPresentScalingCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentScalingCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _scalingBehaviorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_scalingBehavior, index), LAYOUT_scalingBehavior); }
    public MemorySegment _scalingBehavior() { return _scalingBehaviorAt(0L); }
    public VkSwapchainPresentScalingCreateInfoKHR _scalingBehaviorAt(long index, MemorySegment src) { _scalingBehaviorAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentScalingCreateInfoKHR _scalingBehavior(MemorySegment src) { return _scalingBehaviorAt(0L, src); }
    public MemorySegment _presentGravityXAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentGravityX, index), LAYOUT_presentGravityX); }
    public MemorySegment _presentGravityX() { return _presentGravityXAt(0L); }
    public VkSwapchainPresentScalingCreateInfoKHR _presentGravityXAt(long index, MemorySegment src) { _presentGravityXAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentScalingCreateInfoKHR _presentGravityX(MemorySegment src) { return _presentGravityXAt(0L, src); }
    public MemorySegment _presentGravityYAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentGravityY, index), LAYOUT_presentGravityY); }
    public MemorySegment _presentGravityY() { return _presentGravityYAt(0L); }
    public VkSwapchainPresentScalingCreateInfoKHR _presentGravityYAt(long index, MemorySegment src) { _presentGravityYAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentScalingCreateInfoKHR _presentGravityY(MemorySegment src) { return _presentGravityYAt(0L, src); }
}
