// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSwapchainPresentScalingCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkSwapchainPresentScalingCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkPresentScalingFlagsKHR scalingBehavior;
///     VkPresentGravityFlagsKHR presentGravityX;
///     VkPresentGravityFlagsKHR presentGravityY;
/// }
/// ```
public final class VkSwapchainPresentScalingCreateInfoEXT extends GroupType {
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

    public VkSwapchainPresentScalingCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSwapchainPresentScalingCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentScalingCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkSwapchainPresentScalingCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentScalingCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSwapchainPresentScalingCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentScalingCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSwapchainPresentScalingCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkSwapchainPresentScalingCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkSwapchainPresentScalingCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkSwapchainPresentScalingCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkSwapchainPresentScalingCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_KHR); }
    public static VkSwapchainPresentScalingCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_KHR);
        return s;
    }
    public VkSwapchainPresentScalingCreateInfoEXT copyFrom(VkSwapchainPresentScalingCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSwapchainPresentScalingCreateInfoEXT reinterpret(long count) { return new VkSwapchainPresentScalingCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSwapchainPresentScalingCreateInfoEXT asSlice(long index) { return new VkSwapchainPresentScalingCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSwapchainPresentScalingCreateInfoEXT asSlice(long index, long count) { return new VkSwapchainPresentScalingCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSwapchainPresentScalingCreateInfoEXT at(long index, Consumer<VkSwapchainPresentScalingCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
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
    public VkSwapchainPresentScalingCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentScalingCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentScalingCreateInfoEXT scalingBehaviorAt(long index, int value) { VH_scalingBehavior.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentScalingCreateInfoEXT presentGravityXAt(long index, int value) { VH_presentGravityX.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentScalingCreateInfoEXT presentGravityYAt(long index, int value) { VH_presentGravityY.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainPresentScalingCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainPresentScalingCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainPresentScalingCreateInfoEXT scalingBehavior(int value) { VH_scalingBehavior.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainPresentScalingCreateInfoEXT presentGravityX(int value) { VH_presentGravityX.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainPresentScalingCreateInfoEXT presentGravityY(int value) { VH_presentGravityY.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSwapchainPresentScalingCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentScalingCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSwapchainPresentScalingCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentScalingCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _scalingBehaviorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_scalingBehavior, index), LAYOUT_scalingBehavior); }
    public MemorySegment _scalingBehavior() { return _scalingBehaviorAt(0L); }
    public VkSwapchainPresentScalingCreateInfoEXT _scalingBehaviorAt(long index, MemorySegment src) { _scalingBehaviorAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentScalingCreateInfoEXT _scalingBehavior(MemorySegment src) { return _scalingBehaviorAt(0L, src); }
    public MemorySegment _presentGravityXAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentGravityX, index), LAYOUT_presentGravityX); }
    public MemorySegment _presentGravityX() { return _presentGravityXAt(0L); }
    public VkSwapchainPresentScalingCreateInfoEXT _presentGravityXAt(long index, MemorySegment src) { _presentGravityXAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentScalingCreateInfoEXT _presentGravityX(MemorySegment src) { return _presentGravityXAt(0L, src); }
    public MemorySegment _presentGravityYAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentGravityY, index), LAYOUT_presentGravityY); }
    public MemorySegment _presentGravityY() { return _presentGravityYAt(0L); }
    public VkSwapchainPresentScalingCreateInfoEXT _presentGravityYAt(long index, MemorySegment src) { _presentGravityYAt(index).copyFrom(src); return this; }
    public VkSwapchainPresentScalingCreateInfoEXT _presentGravityY(MemorySegment src) { return _presentGravityYAt(0L, src); }
}
