// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeH265QualityLevelPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH265QualityLevelPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkVideoEncodeH265RateControlFlagsKHR preferredRateControlFlags;
///     uint32_t preferredGopFrameCount;
///     uint32_t preferredIdrPeriod;
///     uint32_t preferredConsecutiveBFrameCount;
///     uint32_t preferredSubLayerCount;
///     VkVideoEncodeH265QpKHR preferredConstantQp;
///     uint32_t preferredMaxL0ReferenceCount;
///     uint32_t preferredMaxL1ReferenceCount;
/// }
/// ```
public final class VkVideoEncodeH265QualityLevelPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("preferredRateControlFlags"),
        ValueLayout.JAVA_INT.withName("preferredGopFrameCount"),
        ValueLayout.JAVA_INT.withName("preferredIdrPeriod"),
        ValueLayout.JAVA_INT.withName("preferredConsecutiveBFrameCount"),
        ValueLayout.JAVA_INT.withName("preferredSubLayerCount"),
        overrungl.vulkan.khr.struct.VkVideoEncodeH265QpKHR.LAYOUT.withName("preferredConstantQp"),
        ValueLayout.JAVA_INT.withName("preferredMaxL0ReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredMaxL1ReferenceCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_preferredRateControlFlags = LAYOUT.byteOffset(PathElement.groupElement("preferredRateControlFlags"));
    public static final long OFFSET_preferredGopFrameCount = LAYOUT.byteOffset(PathElement.groupElement("preferredGopFrameCount"));
    public static final long OFFSET_preferredIdrPeriod = LAYOUT.byteOffset(PathElement.groupElement("preferredIdrPeriod"));
    public static final long OFFSET_preferredConsecutiveBFrameCount = LAYOUT.byteOffset(PathElement.groupElement("preferredConsecutiveBFrameCount"));
    public static final long OFFSET_preferredSubLayerCount = LAYOUT.byteOffset(PathElement.groupElement("preferredSubLayerCount"));
    public static final long OFFSET_preferredConstantQp = LAYOUT.byteOffset(PathElement.groupElement("preferredConstantQp"));
    public static final long OFFSET_preferredMaxL0ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxL0ReferenceCount"));
    public static final long OFFSET_preferredMaxL1ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxL1ReferenceCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_preferredRateControlFlags = LAYOUT.select(PathElement.groupElement("preferredRateControlFlags"));
    public static final MemoryLayout LAYOUT_preferredGopFrameCount = LAYOUT.select(PathElement.groupElement("preferredGopFrameCount"));
    public static final MemoryLayout LAYOUT_preferredIdrPeriod = LAYOUT.select(PathElement.groupElement("preferredIdrPeriod"));
    public static final MemoryLayout LAYOUT_preferredConsecutiveBFrameCount = LAYOUT.select(PathElement.groupElement("preferredConsecutiveBFrameCount"));
    public static final MemoryLayout LAYOUT_preferredSubLayerCount = LAYOUT.select(PathElement.groupElement("preferredSubLayerCount"));
    public static final MemoryLayout LAYOUT_preferredConstantQp = LAYOUT.select(PathElement.groupElement("preferredConstantQp"));
    public static final MemoryLayout LAYOUT_preferredMaxL0ReferenceCount = LAYOUT.select(PathElement.groupElement("preferredMaxL0ReferenceCount"));
    public static final MemoryLayout LAYOUT_preferredMaxL1ReferenceCount = LAYOUT.select(PathElement.groupElement("preferredMaxL1ReferenceCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_preferredRateControlFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredRateControlFlags"));
    public static final VarHandle VH_preferredGopFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredGopFrameCount"));
    public static final VarHandle VH_preferredIdrPeriod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredIdrPeriod"));
    public static final VarHandle VH_preferredConsecutiveBFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredConsecutiveBFrameCount"));
    public static final VarHandle VH_preferredSubLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredSubLayerCount"));
    public static final VarHandle VH_preferredConstantQp$qpI = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredConstantQp"), PathElement.groupElement("qpI"));
    public static final VarHandle VH_preferredConstantQp$qpP = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredConstantQp"), PathElement.groupElement("qpP"));
    public static final VarHandle VH_preferredConstantQp$qpB = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredConstantQp"), PathElement.groupElement("qpB"));
    public static final VarHandle VH_preferredMaxL0ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxL0ReferenceCount"));
    public static final VarHandle VH_preferredMaxL1ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxL1ReferenceCount"));

    public VkVideoEncodeH265QualityLevelPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeH265QualityLevelPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265QualityLevelPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeH265QualityLevelPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265QualityLevelPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeH265QualityLevelPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265QualityLevelPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeH265QualityLevelPropertiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265QualityLevelPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeH265QualityLevelPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265QualityLevelPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeH265QualityLevelPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_QUALITY_LEVEL_PROPERTIES_KHR); }
    public static VkVideoEncodeH265QualityLevelPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_QUALITY_LEVEL_PROPERTIES_KHR);
        return s;
    }
    public VkVideoEncodeH265QualityLevelPropertiesKHR copyFrom(VkVideoEncodeH265QualityLevelPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR reinterpret(long count) { return new VkVideoEncodeH265QualityLevelPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeH265QualityLevelPropertiesKHR asSlice(long index) { return new VkVideoEncodeH265QualityLevelPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeH265QualityLevelPropertiesKHR asSlice(long index, long count) { return new VkVideoEncodeH265QualityLevelPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeH265QualityLevelPropertiesKHR at(long index, Consumer<VkVideoEncodeH265QualityLevelPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int preferredRateControlFlagsAt(long index) { return (int) VH_preferredRateControlFlags.get(this.segment(), 0L, index); }
    public int preferredGopFrameCountAt(long index) { return (int) VH_preferredGopFrameCount.get(this.segment(), 0L, index); }
    public int preferredIdrPeriodAt(long index) { return (int) VH_preferredIdrPeriod.get(this.segment(), 0L, index); }
    public int preferredConsecutiveBFrameCountAt(long index) { return (int) VH_preferredConsecutiveBFrameCount.get(this.segment(), 0L, index); }
    public int preferredSubLayerCountAt(long index) { return (int) VH_preferredSubLayerCount.get(this.segment(), 0L, index); }
    public int preferredConstantQp$qpIAt(long index) { return (int) VH_preferredConstantQp$qpI.get(this.segment(), 0L, index); }
    public int preferredConstantQp$qpPAt(long index) { return (int) VH_preferredConstantQp$qpP.get(this.segment(), 0L, index); }
    public int preferredConstantQp$qpBAt(long index) { return (int) VH_preferredConstantQp$qpB.get(this.segment(), 0L, index); }
    public int preferredMaxL0ReferenceCountAt(long index) { return (int) VH_preferredMaxL0ReferenceCount.get(this.segment(), 0L, index); }
    public int preferredMaxL1ReferenceCountAt(long index) { return (int) VH_preferredMaxL1ReferenceCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int preferredRateControlFlags() { return (int) VH_preferredRateControlFlags.get(this.segment(), 0L, 0L); }
    public int preferredGopFrameCount() { return (int) VH_preferredGopFrameCount.get(this.segment(), 0L, 0L); }
    public int preferredIdrPeriod() { return (int) VH_preferredIdrPeriod.get(this.segment(), 0L, 0L); }
    public int preferredConsecutiveBFrameCount() { return (int) VH_preferredConsecutiveBFrameCount.get(this.segment(), 0L, 0L); }
    public int preferredSubLayerCount() { return (int) VH_preferredSubLayerCount.get(this.segment(), 0L, 0L); }
    public int preferredConstantQp$qpI() { return (int) VH_preferredConstantQp$qpI.get(this.segment(), 0L, 0L); }
    public int preferredConstantQp$qpP() { return (int) VH_preferredConstantQp$qpP.get(this.segment(), 0L, 0L); }
    public int preferredConstantQp$qpB() { return (int) VH_preferredConstantQp$qpB.get(this.segment(), 0L, 0L); }
    public int preferredMaxL0ReferenceCount() { return (int) VH_preferredMaxL0ReferenceCount.get(this.segment(), 0L, 0L); }
    public int preferredMaxL1ReferenceCount() { return (int) VH_preferredMaxL1ReferenceCount.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeH265QualityLevelPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredRateControlFlagsAt(long index, int value) { VH_preferredRateControlFlags.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredGopFrameCountAt(long index, int value) { VH_preferredGopFrameCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredIdrPeriodAt(long index, int value) { VH_preferredIdrPeriod.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredConsecutiveBFrameCountAt(long index, int value) { VH_preferredConsecutiveBFrameCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredSubLayerCountAt(long index, int value) { VH_preferredSubLayerCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredConstantQp$qpIAt(long index, int value) { VH_preferredConstantQp$qpI.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredConstantQp$qpPAt(long index, int value) { VH_preferredConstantQp$qpP.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredConstantQp$qpBAt(long index, int value) { VH_preferredConstantQp$qpB.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredMaxL0ReferenceCountAt(long index, int value) { VH_preferredMaxL0ReferenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredMaxL1ReferenceCountAt(long index, int value) { VH_preferredMaxL1ReferenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredRateControlFlags(int value) { VH_preferredRateControlFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredGopFrameCount(int value) { VH_preferredGopFrameCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredIdrPeriod(int value) { VH_preferredIdrPeriod.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredConsecutiveBFrameCount(int value) { VH_preferredConsecutiveBFrameCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredSubLayerCount(int value) { VH_preferredSubLayerCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredConstantQp$qpI(int value) { VH_preferredConstantQp$qpI.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredConstantQp$qpP(int value) { VH_preferredConstantQp$qpP.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredConstantQp$qpB(int value) { VH_preferredConstantQp$qpB.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredMaxL0ReferenceCount(int value) { VH_preferredMaxL0ReferenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredMaxL1ReferenceCount(int value) { VH_preferredMaxL1ReferenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeH265QualityLevelPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeH265QualityLevelPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _preferredRateControlFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredRateControlFlags, index), LAYOUT_preferredRateControlFlags); }
    public MemorySegment _preferredRateControlFlags() { return _preferredRateControlFlagsAt(0L); }
    public VkVideoEncodeH265QualityLevelPropertiesKHR _preferredRateControlFlagsAt(long index, MemorySegment src) { _preferredRateControlFlagsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR _preferredRateControlFlags(MemorySegment src) { return _preferredRateControlFlagsAt(0L, src); }
    public MemorySegment _preferredGopFrameCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredGopFrameCount, index), LAYOUT_preferredGopFrameCount); }
    public MemorySegment _preferredGopFrameCount() { return _preferredGopFrameCountAt(0L); }
    public VkVideoEncodeH265QualityLevelPropertiesKHR _preferredGopFrameCountAt(long index, MemorySegment src) { _preferredGopFrameCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR _preferredGopFrameCount(MemorySegment src) { return _preferredGopFrameCountAt(0L, src); }
    public MemorySegment _preferredIdrPeriodAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredIdrPeriod, index), LAYOUT_preferredIdrPeriod); }
    public MemorySegment _preferredIdrPeriod() { return _preferredIdrPeriodAt(0L); }
    public VkVideoEncodeH265QualityLevelPropertiesKHR _preferredIdrPeriodAt(long index, MemorySegment src) { _preferredIdrPeriodAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR _preferredIdrPeriod(MemorySegment src) { return _preferredIdrPeriodAt(0L, src); }
    public MemorySegment _preferredConsecutiveBFrameCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredConsecutiveBFrameCount, index), LAYOUT_preferredConsecutiveBFrameCount); }
    public MemorySegment _preferredConsecutiveBFrameCount() { return _preferredConsecutiveBFrameCountAt(0L); }
    public VkVideoEncodeH265QualityLevelPropertiesKHR _preferredConsecutiveBFrameCountAt(long index, MemorySegment src) { _preferredConsecutiveBFrameCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR _preferredConsecutiveBFrameCount(MemorySegment src) { return _preferredConsecutiveBFrameCountAt(0L, src); }
    public MemorySegment _preferredSubLayerCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredSubLayerCount, index), LAYOUT_preferredSubLayerCount); }
    public MemorySegment _preferredSubLayerCount() { return _preferredSubLayerCountAt(0L); }
    public VkVideoEncodeH265QualityLevelPropertiesKHR _preferredSubLayerCountAt(long index, MemorySegment src) { _preferredSubLayerCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR _preferredSubLayerCount(MemorySegment src) { return _preferredSubLayerCountAt(0L, src); }
    public MemorySegment _preferredConstantQpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredConstantQp, index), LAYOUT_preferredConstantQp); }
    public MemorySegment _preferredConstantQp() { return _preferredConstantQpAt(0L); }
    public VkVideoEncodeH265QualityLevelPropertiesKHR _preferredConstantQpAt(long index, MemorySegment src) { _preferredConstantQpAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR _preferredConstantQp(MemorySegment src) { return _preferredConstantQpAt(0L, src); }
    public MemorySegment _preferredMaxL0ReferenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredMaxL0ReferenceCount, index), LAYOUT_preferredMaxL0ReferenceCount); }
    public MemorySegment _preferredMaxL0ReferenceCount() { return _preferredMaxL0ReferenceCountAt(0L); }
    public VkVideoEncodeH265QualityLevelPropertiesKHR _preferredMaxL0ReferenceCountAt(long index, MemorySegment src) { _preferredMaxL0ReferenceCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR _preferredMaxL0ReferenceCount(MemorySegment src) { return _preferredMaxL0ReferenceCountAt(0L, src); }
    public MemorySegment _preferredMaxL1ReferenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredMaxL1ReferenceCount, index), LAYOUT_preferredMaxL1ReferenceCount); }
    public MemorySegment _preferredMaxL1ReferenceCount() { return _preferredMaxL1ReferenceCountAt(0L); }
    public VkVideoEncodeH265QualityLevelPropertiesKHR _preferredMaxL1ReferenceCountAt(long index, MemorySegment src) { _preferredMaxL1ReferenceCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265QualityLevelPropertiesKHR _preferredMaxL1ReferenceCount(MemorySegment src) { return _preferredMaxL1ReferenceCountAt(0L, src); }
}
