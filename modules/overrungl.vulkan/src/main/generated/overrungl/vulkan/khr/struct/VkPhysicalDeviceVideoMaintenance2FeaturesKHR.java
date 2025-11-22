// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVideoMaintenance2FeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVideoMaintenance2FeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 videoMaintenance2;
/// }
/// ```
public final class VkPhysicalDeviceVideoMaintenance2FeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("videoMaintenance2")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_videoMaintenance2 = LAYOUT.byteOffset(PathElement.groupElement("videoMaintenance2"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_videoMaintenance2 = LAYOUT.select(PathElement.groupElement("videoMaintenance2"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_videoMaintenance2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoMaintenance2"));

    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceVideoMaintenance2FeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoMaintenance2FeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceVideoMaintenance2FeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoMaintenance2FeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceVideoMaintenance2FeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoMaintenance2FeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceVideoMaintenance2FeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVideoMaintenance2FeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceVideoMaintenance2FeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVideoMaintenance2FeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceVideoMaintenance2FeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoMaintenance2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_MAINTENANCE_2_FEATURES_KHR); }
    public static VkPhysicalDeviceVideoMaintenance2FeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoMaintenance2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_MAINTENANCE_2_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR copyFrom(VkPhysicalDeviceVideoMaintenance2FeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceVideoMaintenance2FeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR asSlice(long index) { return new VkPhysicalDeviceVideoMaintenance2FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceVideoMaintenance2FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR at(long index, Consumer<VkPhysicalDeviceVideoMaintenance2FeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int videoMaintenance2At(long index) { return (int) VH_videoMaintenance2.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int videoMaintenance2() { return (int) VH_videoMaintenance2.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR videoMaintenance2At(long index, int value) { VH_videoMaintenance2.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR videoMaintenance2(int value) { VH_videoMaintenance2.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _videoMaintenance2At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_videoMaintenance2, index), LAYOUT_videoMaintenance2); }
    public MemorySegment _videoMaintenance2() { return _videoMaintenance2At(0L); }
    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR _videoMaintenance2At(long index, MemorySegment src) { _videoMaintenance2At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR _videoMaintenance2(MemorySegment src) { return _videoMaintenance2At(0L, src); }
}
