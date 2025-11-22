// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVideoFormatInfoKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVideoFormatInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkImageUsageFlags imageUsage;
/// }
/// ```
public final class VkPhysicalDeviceVideoFormatInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageUsage")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_imageUsage = LAYOUT.byteOffset(PathElement.groupElement("imageUsage"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_imageUsage = LAYOUT.select(PathElement.groupElement("imageUsage"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_imageUsage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageUsage"));

    public VkPhysicalDeviceVideoFormatInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceVideoFormatInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoFormatInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceVideoFormatInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoFormatInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceVideoFormatInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoFormatInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceVideoFormatInfoKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVideoFormatInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceVideoFormatInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVideoFormatInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceVideoFormatInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR); }
    public static VkPhysicalDeviceVideoFormatInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR);
        return s;
    }
    public VkPhysicalDeviceVideoFormatInfoKHR copyFrom(VkPhysicalDeviceVideoFormatInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceVideoFormatInfoKHR reinterpret(long count) { return new VkPhysicalDeviceVideoFormatInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceVideoFormatInfoKHR asSlice(long index) { return new VkPhysicalDeviceVideoFormatInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceVideoFormatInfoKHR asSlice(long index, long count) { return new VkPhysicalDeviceVideoFormatInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceVideoFormatInfoKHR at(long index, Consumer<VkPhysicalDeviceVideoFormatInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int imageUsageAt(long index) { return (int) VH_imageUsage.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int imageUsage() { return (int) VH_imageUsage.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceVideoFormatInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVideoFormatInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVideoFormatInfoKHR imageUsageAt(long index, int value) { VH_imageUsage.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVideoFormatInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVideoFormatInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVideoFormatInfoKHR imageUsage(int value) { VH_imageUsage.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceVideoFormatInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVideoFormatInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceVideoFormatInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVideoFormatInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _imageUsageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageUsage, index), LAYOUT_imageUsage); }
    public MemorySegment _imageUsage() { return _imageUsageAt(0L); }
    public VkPhysicalDeviceVideoFormatInfoKHR _imageUsageAt(long index, MemorySegment src) { _imageUsageAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVideoFormatInfoKHR _imageUsage(MemorySegment src) { return _imageUsageAt(0L, src); }
}
