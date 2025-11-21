// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeQualityLevelPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeQualityLevelPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkVideoEncodeRateControlModeFlagBitsKHR preferredRateControlMode;
///     uint32_t preferredRateControlLayerCount;
/// }
/// ```
public final class VkVideoEncodeQualityLevelPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("preferredRateControlMode"),
        ValueLayout.JAVA_INT.withName("preferredRateControlLayerCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_preferredRateControlMode = LAYOUT.byteOffset(PathElement.groupElement("preferredRateControlMode"));
    public static final long OFFSET_preferredRateControlLayerCount = LAYOUT.byteOffset(PathElement.groupElement("preferredRateControlLayerCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_preferredRateControlMode = LAYOUT.select(PathElement.groupElement("preferredRateControlMode"));
    public static final MemoryLayout LAYOUT_preferredRateControlLayerCount = LAYOUT.select(PathElement.groupElement("preferredRateControlLayerCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_preferredRateControlMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredRateControlMode"));
    public static final VarHandle VH_preferredRateControlLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredRateControlLayerCount"));

    public VkVideoEncodeQualityLevelPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeQualityLevelPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeQualityLevelPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeQualityLevelPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeQualityLevelPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeQualityLevelPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeQualityLevelPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeQualityLevelPropertiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeQualityLevelPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeQualityLevelPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeQualityLevelPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeQualityLevelPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_PROPERTIES_KHR); }
    public static VkVideoEncodeQualityLevelPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_PROPERTIES_KHR);
        return s;
    }
    public VkVideoEncodeQualityLevelPropertiesKHR copyFrom(VkVideoEncodeQualityLevelPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeQualityLevelPropertiesKHR reinterpret(long count) { return new VkVideoEncodeQualityLevelPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeQualityLevelPropertiesKHR asSlice(long index) { return new VkVideoEncodeQualityLevelPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeQualityLevelPropertiesKHR asSlice(long index, long count) { return new VkVideoEncodeQualityLevelPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeQualityLevelPropertiesKHR at(long index, Consumer<VkVideoEncodeQualityLevelPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int preferredRateControlModeAt(long index) { return (int) VH_preferredRateControlMode.get(this.segment(), 0L, index); }
    public int preferredRateControlLayerCountAt(long index) { return (int) VH_preferredRateControlLayerCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int preferredRateControlMode() { return (int) VH_preferredRateControlMode.get(this.segment(), 0L, 0L); }
    public int preferredRateControlLayerCount() { return (int) VH_preferredRateControlLayerCount.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeQualityLevelPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeQualityLevelPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeQualityLevelPropertiesKHR preferredRateControlModeAt(long index, int value) { VH_preferredRateControlMode.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeQualityLevelPropertiesKHR preferredRateControlLayerCountAt(long index, int value) { VH_preferredRateControlLayerCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeQualityLevelPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeQualityLevelPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeQualityLevelPropertiesKHR preferredRateControlMode(int value) { VH_preferredRateControlMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeQualityLevelPropertiesKHR preferredRateControlLayerCount(int value) { VH_preferredRateControlLayerCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeQualityLevelPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeQualityLevelPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeQualityLevelPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeQualityLevelPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _preferredRateControlModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredRateControlMode, index), LAYOUT_preferredRateControlMode); }
    public MemorySegment _preferredRateControlMode() { return _preferredRateControlModeAt(0L); }
    public VkVideoEncodeQualityLevelPropertiesKHR _preferredRateControlModeAt(long index, MemorySegment src) { _preferredRateControlModeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeQualityLevelPropertiesKHR _preferredRateControlMode(MemorySegment src) { return _preferredRateControlModeAt(0L, src); }
    public MemorySegment _preferredRateControlLayerCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredRateControlLayerCount, index), LAYOUT_preferredRateControlLayerCount); }
    public MemorySegment _preferredRateControlLayerCount() { return _preferredRateControlLayerCountAt(0L); }
    public VkVideoEncodeQualityLevelPropertiesKHR _preferredRateControlLayerCountAt(long index, MemorySegment src) { _preferredRateControlLayerCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeQualityLevelPropertiesKHR _preferredRateControlLayerCount(MemorySegment src) { return _preferredRateControlLayerCountAt(0L, src); }
}
