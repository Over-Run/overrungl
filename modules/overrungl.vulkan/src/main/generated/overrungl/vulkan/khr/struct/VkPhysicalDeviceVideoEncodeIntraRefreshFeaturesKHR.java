// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 videoEncodeIntraRefresh;
/// }
/// ```
public final class VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("videoEncodeIntraRefresh")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_videoEncodeIntraRefresh = LAYOUT.byteOffset(PathElement.groupElement("videoEncodeIntraRefresh"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_videoEncodeIntraRefresh = LAYOUT.select(PathElement.groupElement("videoEncodeIntraRefresh"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_videoEncodeIntraRefresh = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoEncodeIntraRefresh"));

    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_INTRA_REFRESH_FEATURES_KHR); }
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_INTRA_REFRESH_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR copyFrom(VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR at(long index, Consumer<VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int videoEncodeIntraRefreshAt(long index) { return (int) VH_videoEncodeIntraRefresh.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int videoEncodeIntraRefresh() { return (int) VH_videoEncodeIntraRefresh.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR videoEncodeIntraRefreshAt(long index, int value) { VH_videoEncodeIntraRefresh.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR videoEncodeIntraRefresh(int value) { VH_videoEncodeIntraRefresh.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _videoEncodeIntraRefreshAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_videoEncodeIntraRefresh, index), LAYOUT_videoEncodeIntraRefresh); }
    public MemorySegment _videoEncodeIntraRefresh() { return _videoEncodeIntraRefreshAt(0L); }
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR _videoEncodeIntraRefreshAt(long index, MemorySegment src) { _videoEncodeIntraRefreshAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR _videoEncodeIntraRefresh(MemorySegment src) { return _videoEncodeIntraRefreshAt(0L, src); }
}
