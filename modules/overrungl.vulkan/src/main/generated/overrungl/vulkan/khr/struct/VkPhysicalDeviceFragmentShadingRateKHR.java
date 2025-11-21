// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFragmentShadingRateKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentShadingRateKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkSampleCountFlags sampleCounts;
///     VkExtent2D fragmentSize;
/// }
/// ```
public final class VkPhysicalDeviceFragmentShadingRateKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleCounts"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("fragmentSize")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_sampleCounts = LAYOUT.byteOffset(PathElement.groupElement("sampleCounts"));
    public static final long OFFSET_fragmentSize = LAYOUT.byteOffset(PathElement.groupElement("fragmentSize"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_sampleCounts = LAYOUT.select(PathElement.groupElement("sampleCounts"));
    public static final MemoryLayout LAYOUT_fragmentSize = LAYOUT.select(PathElement.groupElement("fragmentSize"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_sampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleCounts"));
    public static final VarHandle VH_fragmentSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_fragmentSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentSize"), PathElement.groupElement("height"));

    public VkPhysicalDeviceFragmentShadingRateKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceFragmentShadingRateKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceFragmentShadingRateKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceFragmentShadingRateKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceFragmentShadingRateKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentShadingRateKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceFragmentShadingRateKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentShadingRateKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceFragmentShadingRateKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRFragmentShadingRate.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR); }
    public static VkPhysicalDeviceFragmentShadingRateKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRFragmentShadingRate.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR);
        return s;
    }
    public VkPhysicalDeviceFragmentShadingRateKHR copyFrom(VkPhysicalDeviceFragmentShadingRateKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceFragmentShadingRateKHR reinterpret(long count) { return new VkPhysicalDeviceFragmentShadingRateKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceFragmentShadingRateKHR asSlice(long index) { return new VkPhysicalDeviceFragmentShadingRateKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceFragmentShadingRateKHR asSlice(long index, long count) { return new VkPhysicalDeviceFragmentShadingRateKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceFragmentShadingRateKHR at(long index, Consumer<VkPhysicalDeviceFragmentShadingRateKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int sampleCountsAt(long index) { return (int) VH_sampleCounts.get(this.segment(), 0L, index); }
    public int fragmentSize$widthAt(long index) { return (int) VH_fragmentSize$width.get(this.segment(), 0L, index); }
    public int fragmentSize$heightAt(long index) { return (int) VH_fragmentSize$height.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int sampleCounts() { return (int) VH_sampleCounts.get(this.segment(), 0L, 0L); }
    public int fragmentSize$width() { return (int) VH_fragmentSize$width.get(this.segment(), 0L, 0L); }
    public int fragmentSize$height() { return (int) VH_fragmentSize$height.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceFragmentShadingRateKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateKHR sampleCountsAt(long index, int value) { VH_sampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateKHR fragmentSize$widthAt(long index, int value) { VH_fragmentSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateKHR fragmentSize$heightAt(long index, int value) { VH_fragmentSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateKHR sampleCounts(int value) { VH_sampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateKHR fragmentSize$width(int value) { VH_fragmentSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRateKHR fragmentSize$height(int value) { VH_fragmentSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceFragmentShadingRateKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRateKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceFragmentShadingRateKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRateKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _sampleCountsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampleCounts, index), LAYOUT_sampleCounts); }
    public MemorySegment _sampleCounts() { return _sampleCountsAt(0L); }
    public VkPhysicalDeviceFragmentShadingRateKHR _sampleCountsAt(long index, MemorySegment src) { _sampleCountsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRateKHR _sampleCounts(MemorySegment src) { return _sampleCountsAt(0L, src); }
    public MemorySegment _fragmentSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentSize, index), LAYOUT_fragmentSize); }
    public MemorySegment _fragmentSize() { return _fragmentSizeAt(0L); }
    public VkPhysicalDeviceFragmentShadingRateKHR _fragmentSizeAt(long index, MemorySegment src) { _fragmentSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRateKHR _fragmentSize(MemorySegment src) { return _fragmentSizeAt(0L, src); }
}
