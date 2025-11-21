// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 presentModeFifoLatestReady;
/// }
/// ```
public final class VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentModeFifoLatestReady")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_presentModeFifoLatestReady = LAYOUT.byteOffset(PathElement.groupElement("presentModeFifoLatestReady"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_presentModeFifoLatestReady = LAYOUT.select(PathElement.groupElement("presentModeFifoLatestReady"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_presentModeFifoLatestReady = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentModeFifoLatestReady"));

    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPresentModeFifoLatestReady.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_MODE_FIFO_LATEST_READY_FEATURES_KHR); }
    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPresentModeFifoLatestReady.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_MODE_FIFO_LATEST_READY_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR copyFrom(VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR reinterpret(long count) { return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR asSlice(long index) { return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR at(long index, Consumer<VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int presentModeFifoLatestReadyAt(long index) { return (int) VH_presentModeFifoLatestReady.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int presentModeFifoLatestReady() { return (int) VH_presentModeFifoLatestReady.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR presentModeFifoLatestReadyAt(long index, int value) { VH_presentModeFifoLatestReady.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR presentModeFifoLatestReady(int value) { VH_presentModeFifoLatestReady.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _presentModeFifoLatestReadyAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentModeFifoLatestReady, index), LAYOUT_presentModeFifoLatestReady); }
    public MemorySegment _presentModeFifoLatestReady() { return _presentModeFifoLatestReadyAt(0L); }
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR _presentModeFifoLatestReadyAt(long index, MemorySegment src) { _presentModeFifoLatestReadyAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR _presentModeFifoLatestReady(MemorySegment src) { return _presentModeFifoLatestReadyAt(0L, src); }
}
