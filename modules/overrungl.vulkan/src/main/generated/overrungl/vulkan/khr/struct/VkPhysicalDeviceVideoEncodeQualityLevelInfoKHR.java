// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     const VkVideoProfileInfoKHR* pVideoProfile;
///     uint32_t qualityLevel;
/// }
/// ```
public final class VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pVideoProfile"),
        ValueLayout.JAVA_INT.withName("qualityLevel")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pVideoProfile = LAYOUT.byteOffset(PathElement.groupElement("pVideoProfile"));
    public static final long OFFSET_qualityLevel = LAYOUT.byteOffset(PathElement.groupElement("qualityLevel"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pVideoProfile = LAYOUT.select(PathElement.groupElement("pVideoProfile"));
    public static final MemoryLayout LAYOUT_qualityLevel = LAYOUT.select(PathElement.groupElement("qualityLevel"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pVideoProfile = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVideoProfile"));
    public static final VarHandle VH_qualityLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qualityLevel"));

    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeQueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR); }
    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeQueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR);
        return s;
    }
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR copyFrom(VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR reinterpret(long count) { return new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR asSlice(long index) { return new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR asSlice(long index, long count) { return new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR at(long index, Consumer<VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pVideoProfileAt(long index) { return (MemorySegment) VH_pVideoProfile.get(this.segment(), 0L, index); }
    public int qualityLevelAt(long index) { return (int) VH_qualityLevel.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pVideoProfile() { return (MemorySegment) VH_pVideoProfile.get(this.segment(), 0L, 0L); }
    public int qualityLevel() { return (int) VH_qualityLevel.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR pVideoProfileAt(long index, MemorySegment value) { VH_pVideoProfile.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR qualityLevelAt(long index, int value) { VH_qualityLevel.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR pVideoProfile(MemorySegment value) { VH_pVideoProfile.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR qualityLevel(int value) { VH_qualityLevel.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pVideoProfileAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pVideoProfile, index), LAYOUT_pVideoProfile); }
    public MemorySegment _pVideoProfile() { return _pVideoProfileAt(0L); }
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR _pVideoProfileAt(long index, MemorySegment src) { _pVideoProfileAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR _pVideoProfile(MemorySegment src) { return _pVideoProfileAt(0L, src); }
    public MemorySegment _qualityLevelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_qualityLevel, index), LAYOUT_qualityLevel); }
    public MemorySegment _qualityLevel() { return _qualityLevelAt(0L); }
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR _qualityLevelAt(long index, MemorySegment src) { _qualityLevelAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR _qualityLevel(MemorySegment src) { return _qualityLevelAt(0L, src); }
}
