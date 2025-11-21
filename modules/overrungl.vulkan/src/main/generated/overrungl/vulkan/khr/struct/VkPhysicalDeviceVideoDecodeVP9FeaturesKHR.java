// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVideoDecodeVP9FeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVideoDecodeVP9FeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 videoDecodeVP9;
/// }
/// ```
public final class VkPhysicalDeviceVideoDecodeVP9FeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("videoDecodeVP9")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_videoDecodeVP9 = LAYOUT.byteOffset(PathElement.groupElement("videoDecodeVP9"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_videoDecodeVP9 = LAYOUT.select(PathElement.groupElement("videoDecodeVP9"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_videoDecodeVP9 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoDecodeVP9"));

    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceVideoDecodeVP9FeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoDecodeVP9FeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceVideoDecodeVP9FeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoDecodeVP9FeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceVideoDecodeVP9FeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoDecodeVP9FeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceVideoDecodeVP9FeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVideoDecodeVP9FeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceVideoDecodeVP9FeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVideoDecodeVP9FeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceVideoDecodeVP9FeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoDecodeVp9.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_DECODE_VP9_FEATURES_KHR); }
    public static VkPhysicalDeviceVideoDecodeVP9FeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoDecodeVp9.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_DECODE_VP9_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR copyFrom(VkPhysicalDeviceVideoDecodeVP9FeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceVideoDecodeVP9FeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR asSlice(long index) { return new VkPhysicalDeviceVideoDecodeVP9FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceVideoDecodeVP9FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR at(long index, Consumer<VkPhysicalDeviceVideoDecodeVP9FeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int videoDecodeVP9At(long index) { return (int) VH_videoDecodeVP9.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int videoDecodeVP9() { return (int) VH_videoDecodeVP9.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR videoDecodeVP9At(long index, int value) { VH_videoDecodeVP9.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR videoDecodeVP9(int value) { VH_videoDecodeVP9.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _videoDecodeVP9At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_videoDecodeVP9, index), LAYOUT_videoDecodeVP9); }
    public MemorySegment _videoDecodeVP9() { return _videoDecodeVP9At(0L); }
    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR _videoDecodeVP9At(long index, MemorySegment src) { _videoDecodeVP9At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR _videoDecodeVP9(MemorySegment src) { return _videoDecodeVP9At(0L, src); }
}
