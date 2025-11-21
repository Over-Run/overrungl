// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ohos.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSwapchainImageCreateInfoOHOS`.
/// ## Layout
/// ```
/// struct VkSwapchainImageCreateInfoOHOS {
///     VkStructureType sType;
///     const void* pNext;
///     VkSwapchainImageUsageFlagsOHOS usage;
/// }
/// ```
public final class VkSwapchainImageCreateInfoOHOS extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("usage")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_usage = LAYOUT.byteOffset(PathElement.groupElement("usage"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_usage = LAYOUT.select(PathElement.groupElement("usage"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage"));

    public VkSwapchainImageCreateInfoOHOS(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSwapchainImageCreateInfoOHOS of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainImageCreateInfoOHOS(segment, estimateCount(segment, LAYOUT)); }
    public static VkSwapchainImageCreateInfoOHOS ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainImageCreateInfoOHOS(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSwapchainImageCreateInfoOHOS ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainImageCreateInfoOHOS(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSwapchainImageCreateInfoOHOS alloc(SegmentAllocator allocator) { return new VkSwapchainImageCreateInfoOHOS(allocator.allocate(LAYOUT), 1); }
    public static VkSwapchainImageCreateInfoOHOS alloc(SegmentAllocator allocator, long count) { return new VkSwapchainImageCreateInfoOHOS(allocator.allocate(LAYOUT, count), count); }
    public static VkSwapchainImageCreateInfoOHOS allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ohos.VKOHOSNativeBuffer.VK_STRUCTURE_TYPE_SWAPCHAIN_IMAGE_CREATE_INFO_OHOS); }
    public static VkSwapchainImageCreateInfoOHOS allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ohos.VKOHOSNativeBuffer.VK_STRUCTURE_TYPE_SWAPCHAIN_IMAGE_CREATE_INFO_OHOS);
        return s;
    }
    public VkSwapchainImageCreateInfoOHOS copyFrom(VkSwapchainImageCreateInfoOHOS src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSwapchainImageCreateInfoOHOS reinterpret(long count) { return new VkSwapchainImageCreateInfoOHOS(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSwapchainImageCreateInfoOHOS asSlice(long index) { return new VkSwapchainImageCreateInfoOHOS(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSwapchainImageCreateInfoOHOS asSlice(long index, long count) { return new VkSwapchainImageCreateInfoOHOS(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSwapchainImageCreateInfoOHOS at(long index, Consumer<VkSwapchainImageCreateInfoOHOS> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int usageAt(long index) { return (int) VH_usage.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int usage() { return (int) VH_usage.get(this.segment(), 0L, 0L); }
    public VkSwapchainImageCreateInfoOHOS sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainImageCreateInfoOHOS pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainImageCreateInfoOHOS usageAt(long index, int value) { VH_usage.set(this.segment(), 0L, index, value); return this; }
    public VkSwapchainImageCreateInfoOHOS sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainImageCreateInfoOHOS pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSwapchainImageCreateInfoOHOS usage(int value) { VH_usage.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSwapchainImageCreateInfoOHOS _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSwapchainImageCreateInfoOHOS _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSwapchainImageCreateInfoOHOS _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSwapchainImageCreateInfoOHOS _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _usageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_usage, index), LAYOUT_usage); }
    public MemorySegment _usage() { return _usageAt(0L); }
    public VkSwapchainImageCreateInfoOHOS _usageAt(long index, MemorySegment src) { _usageAt(index).copyFrom(src); return this; }
    public VkSwapchainImageCreateInfoOHOS _usage(MemorySegment src) { return _usageAt(0L, src); }
}
