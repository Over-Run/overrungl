// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePresentWaitFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePresentWaitFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 presentWait;
/// }
/// ```
public final class VkPhysicalDevicePresentWaitFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentWait")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_presentWait = LAYOUT.byteOffset(PathElement.groupElement("presentWait"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_presentWait = LAYOUT.select(PathElement.groupElement("presentWait"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_presentWait = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentWait"));

    public VkPhysicalDevicePresentWaitFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePresentWaitFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentWaitFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePresentWaitFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentWaitFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePresentWaitFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentWaitFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePresentWaitFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePresentWaitFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePresentWaitFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePresentWaitFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePresentWaitFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPresentWait.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_FEATURES_KHR); }
    public static VkPhysicalDevicePresentWaitFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPresentWait.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDevicePresentWaitFeaturesKHR copyFrom(VkPhysicalDevicePresentWaitFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePresentWaitFeaturesKHR reinterpret(long count) { return new VkPhysicalDevicePresentWaitFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePresentWaitFeaturesKHR asSlice(long index) { return new VkPhysicalDevicePresentWaitFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePresentWaitFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDevicePresentWaitFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePresentWaitFeaturesKHR at(long index, Consumer<VkPhysicalDevicePresentWaitFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int presentWaitAt(long index) { return (int) VH_presentWait.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int presentWait() { return (int) VH_presentWait.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePresentWaitFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePresentWaitFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePresentWaitFeaturesKHR presentWaitAt(long index, int value) { VH_presentWait.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePresentWaitFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePresentWaitFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePresentWaitFeaturesKHR presentWait(int value) { VH_presentWait.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePresentWaitFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePresentWaitFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePresentWaitFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePresentWaitFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _presentWaitAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentWait, index), LAYOUT_presentWait); }
    public MemorySegment _presentWait() { return _presentWaitAt(0L); }
    public VkPhysicalDevicePresentWaitFeaturesKHR _presentWaitAt(long index, MemorySegment src) { _presentWaitAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePresentWaitFeaturesKHR _presentWait(MemorySegment src) { return _presentWaitAt(0L, src); }
}
