// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeAV1QualityLevelPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeAV1QualityLevelPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkVideoEncodeAV1RateControlFlagsKHR preferredRateControlFlags;
///     uint32_t preferredGopFrameCount;
///     uint32_t preferredKeyFramePeriod;
///     uint32_t preferredConsecutiveBipredictiveFrameCount;
///     uint32_t preferredTemporalLayerCount;
///     VkVideoEncodeAV1QIndexKHR preferredConstantQIndex;
///     uint32_t preferredMaxSingleReferenceCount;
///     uint32_t preferredSingleReferenceNameMask;
///     uint32_t preferredMaxUnidirectionalCompoundReferenceCount;
///     uint32_t preferredMaxUnidirectionalCompoundGroup1ReferenceCount;
///     uint32_t preferredUnidirectionalCompoundReferenceNameMask;
///     uint32_t preferredMaxBidirectionalCompoundReferenceCount;
///     uint32_t preferredMaxBidirectionalCompoundGroup1ReferenceCount;
///     uint32_t preferredMaxBidirectionalCompoundGroup2ReferenceCount;
///     uint32_t preferredBidirectionalCompoundReferenceNameMask;
/// }
/// ```
public final class VkVideoEncodeAV1QualityLevelPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("preferredRateControlFlags"),
        ValueLayout.JAVA_INT.withName("preferredGopFrameCount"),
        ValueLayout.JAVA_INT.withName("preferredKeyFramePeriod"),
        ValueLayout.JAVA_INT.withName("preferredConsecutiveBipredictiveFrameCount"),
        ValueLayout.JAVA_INT.withName("preferredTemporalLayerCount"),
        overrungl.vulkan.khr.struct.VkVideoEncodeAV1QIndexKHR.LAYOUT.withName("preferredConstantQIndex"),
        ValueLayout.JAVA_INT.withName("preferredMaxSingleReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredSingleReferenceNameMask"),
        ValueLayout.JAVA_INT.withName("preferredMaxUnidirectionalCompoundReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredMaxUnidirectionalCompoundGroup1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredUnidirectionalCompoundReferenceNameMask"),
        ValueLayout.JAVA_INT.withName("preferredMaxBidirectionalCompoundReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredMaxBidirectionalCompoundGroup1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredMaxBidirectionalCompoundGroup2ReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredBidirectionalCompoundReferenceNameMask")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_preferredRateControlFlags = LAYOUT.byteOffset(PathElement.groupElement("preferredRateControlFlags"));
    public static final long OFFSET_preferredGopFrameCount = LAYOUT.byteOffset(PathElement.groupElement("preferredGopFrameCount"));
    public static final long OFFSET_preferredKeyFramePeriod = LAYOUT.byteOffset(PathElement.groupElement("preferredKeyFramePeriod"));
    public static final long OFFSET_preferredConsecutiveBipredictiveFrameCount = LAYOUT.byteOffset(PathElement.groupElement("preferredConsecutiveBipredictiveFrameCount"));
    public static final long OFFSET_preferredTemporalLayerCount = LAYOUT.byteOffset(PathElement.groupElement("preferredTemporalLayerCount"));
    public static final long OFFSET_preferredConstantQIndex = LAYOUT.byteOffset(PathElement.groupElement("preferredConstantQIndex"));
    public static final long OFFSET_preferredMaxSingleReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxSingleReferenceCount"));
    public static final long OFFSET_preferredSingleReferenceNameMask = LAYOUT.byteOffset(PathElement.groupElement("preferredSingleReferenceNameMask"));
    public static final long OFFSET_preferredMaxUnidirectionalCompoundReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxUnidirectionalCompoundReferenceCount"));
    public static final long OFFSET_preferredMaxUnidirectionalCompoundGroup1ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxUnidirectionalCompoundGroup1ReferenceCount"));
    public static final long OFFSET_preferredUnidirectionalCompoundReferenceNameMask = LAYOUT.byteOffset(PathElement.groupElement("preferredUnidirectionalCompoundReferenceNameMask"));
    public static final long OFFSET_preferredMaxBidirectionalCompoundReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxBidirectionalCompoundReferenceCount"));
    public static final long OFFSET_preferredMaxBidirectionalCompoundGroup1ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxBidirectionalCompoundGroup1ReferenceCount"));
    public static final long OFFSET_preferredMaxBidirectionalCompoundGroup2ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxBidirectionalCompoundGroup2ReferenceCount"));
    public static final long OFFSET_preferredBidirectionalCompoundReferenceNameMask = LAYOUT.byteOffset(PathElement.groupElement("preferredBidirectionalCompoundReferenceNameMask"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_preferredRateControlFlags = LAYOUT.select(PathElement.groupElement("preferredRateControlFlags"));
    public static final MemoryLayout LAYOUT_preferredGopFrameCount = LAYOUT.select(PathElement.groupElement("preferredGopFrameCount"));
    public static final MemoryLayout LAYOUT_preferredKeyFramePeriod = LAYOUT.select(PathElement.groupElement("preferredKeyFramePeriod"));
    public static final MemoryLayout LAYOUT_preferredConsecutiveBipredictiveFrameCount = LAYOUT.select(PathElement.groupElement("preferredConsecutiveBipredictiveFrameCount"));
    public static final MemoryLayout LAYOUT_preferredTemporalLayerCount = LAYOUT.select(PathElement.groupElement("preferredTemporalLayerCount"));
    public static final MemoryLayout LAYOUT_preferredConstantQIndex = LAYOUT.select(PathElement.groupElement("preferredConstantQIndex"));
    public static final MemoryLayout LAYOUT_preferredMaxSingleReferenceCount = LAYOUT.select(PathElement.groupElement("preferredMaxSingleReferenceCount"));
    public static final MemoryLayout LAYOUT_preferredSingleReferenceNameMask = LAYOUT.select(PathElement.groupElement("preferredSingleReferenceNameMask"));
    public static final MemoryLayout LAYOUT_preferredMaxUnidirectionalCompoundReferenceCount = LAYOUT.select(PathElement.groupElement("preferredMaxUnidirectionalCompoundReferenceCount"));
    public static final MemoryLayout LAYOUT_preferredMaxUnidirectionalCompoundGroup1ReferenceCount = LAYOUT.select(PathElement.groupElement("preferredMaxUnidirectionalCompoundGroup1ReferenceCount"));
    public static final MemoryLayout LAYOUT_preferredUnidirectionalCompoundReferenceNameMask = LAYOUT.select(PathElement.groupElement("preferredUnidirectionalCompoundReferenceNameMask"));
    public static final MemoryLayout LAYOUT_preferredMaxBidirectionalCompoundReferenceCount = LAYOUT.select(PathElement.groupElement("preferredMaxBidirectionalCompoundReferenceCount"));
    public static final MemoryLayout LAYOUT_preferredMaxBidirectionalCompoundGroup1ReferenceCount = LAYOUT.select(PathElement.groupElement("preferredMaxBidirectionalCompoundGroup1ReferenceCount"));
    public static final MemoryLayout LAYOUT_preferredMaxBidirectionalCompoundGroup2ReferenceCount = LAYOUT.select(PathElement.groupElement("preferredMaxBidirectionalCompoundGroup2ReferenceCount"));
    public static final MemoryLayout LAYOUT_preferredBidirectionalCompoundReferenceNameMask = LAYOUT.select(PathElement.groupElement("preferredBidirectionalCompoundReferenceNameMask"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_preferredRateControlFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredRateControlFlags"));
    public static final VarHandle VH_preferredGopFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredGopFrameCount"));
    public static final VarHandle VH_preferredKeyFramePeriod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredKeyFramePeriod"));
    public static final VarHandle VH_preferredConsecutiveBipredictiveFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredConsecutiveBipredictiveFrameCount"));
    public static final VarHandle VH_preferredTemporalLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredTemporalLayerCount"));
    public static final VarHandle VH_preferredConstantQIndex$intraQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredConstantQIndex"), PathElement.groupElement("intraQIndex"));
    public static final VarHandle VH_preferredConstantQIndex$predictiveQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredConstantQIndex"), PathElement.groupElement("predictiveQIndex"));
    public static final VarHandle VH_preferredConstantQIndex$bipredictiveQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredConstantQIndex"), PathElement.groupElement("bipredictiveQIndex"));
    public static final VarHandle VH_preferredMaxSingleReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxSingleReferenceCount"));
    public static final VarHandle VH_preferredSingleReferenceNameMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredSingleReferenceNameMask"));
    public static final VarHandle VH_preferredMaxUnidirectionalCompoundReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxUnidirectionalCompoundReferenceCount"));
    public static final VarHandle VH_preferredMaxUnidirectionalCompoundGroup1ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxUnidirectionalCompoundGroup1ReferenceCount"));
    public static final VarHandle VH_preferredUnidirectionalCompoundReferenceNameMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredUnidirectionalCompoundReferenceNameMask"));
    public static final VarHandle VH_preferredMaxBidirectionalCompoundReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxBidirectionalCompoundReferenceCount"));
    public static final VarHandle VH_preferredMaxBidirectionalCompoundGroup1ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxBidirectionalCompoundGroup1ReferenceCount"));
    public static final VarHandle VH_preferredMaxBidirectionalCompoundGroup2ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxBidirectionalCompoundGroup2ReferenceCount"));
    public static final VarHandle VH_preferredBidirectionalCompoundReferenceNameMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredBidirectionalCompoundReferenceNameMask"));

    public VkVideoEncodeAV1QualityLevelPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1QualityLevelPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1QualityLevelPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1QualityLevelPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1QualityLevelPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1QualityLevelPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeAv1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_QUALITY_LEVEL_PROPERTIES_KHR); }
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeAv1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_QUALITY_LEVEL_PROPERTIES_KHR);
        return s;
    }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR copyFrom(VkVideoEncodeAV1QualityLevelPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR reinterpret(long count) { return new VkVideoEncodeAV1QualityLevelPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR asSlice(long index) { return new VkVideoEncodeAV1QualityLevelPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR asSlice(long index, long count) { return new VkVideoEncodeAV1QualityLevelPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR at(long index, Consumer<VkVideoEncodeAV1QualityLevelPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int preferredRateControlFlagsAt(long index) { return (int) VH_preferredRateControlFlags.get(this.segment(), 0L, index); }
    public int preferredGopFrameCountAt(long index) { return (int) VH_preferredGopFrameCount.get(this.segment(), 0L, index); }
    public int preferredKeyFramePeriodAt(long index) { return (int) VH_preferredKeyFramePeriod.get(this.segment(), 0L, index); }
    public int preferredConsecutiveBipredictiveFrameCountAt(long index) { return (int) VH_preferredConsecutiveBipredictiveFrameCount.get(this.segment(), 0L, index); }
    public int preferredTemporalLayerCountAt(long index) { return (int) VH_preferredTemporalLayerCount.get(this.segment(), 0L, index); }
    public int preferredConstantQIndex$intraQIndexAt(long index) { return (int) VH_preferredConstantQIndex$intraQIndex.get(this.segment(), 0L, index); }
    public int preferredConstantQIndex$predictiveQIndexAt(long index) { return (int) VH_preferredConstantQIndex$predictiveQIndex.get(this.segment(), 0L, index); }
    public int preferredConstantQIndex$bipredictiveQIndexAt(long index) { return (int) VH_preferredConstantQIndex$bipredictiveQIndex.get(this.segment(), 0L, index); }
    public int preferredMaxSingleReferenceCountAt(long index) { return (int) VH_preferredMaxSingleReferenceCount.get(this.segment(), 0L, index); }
    public int preferredSingleReferenceNameMaskAt(long index) { return (int) VH_preferredSingleReferenceNameMask.get(this.segment(), 0L, index); }
    public int preferredMaxUnidirectionalCompoundReferenceCountAt(long index) { return (int) VH_preferredMaxUnidirectionalCompoundReferenceCount.get(this.segment(), 0L, index); }
    public int preferredMaxUnidirectionalCompoundGroup1ReferenceCountAt(long index) { return (int) VH_preferredMaxUnidirectionalCompoundGroup1ReferenceCount.get(this.segment(), 0L, index); }
    public int preferredUnidirectionalCompoundReferenceNameMaskAt(long index) { return (int) VH_preferredUnidirectionalCompoundReferenceNameMask.get(this.segment(), 0L, index); }
    public int preferredMaxBidirectionalCompoundReferenceCountAt(long index) { return (int) VH_preferredMaxBidirectionalCompoundReferenceCount.get(this.segment(), 0L, index); }
    public int preferredMaxBidirectionalCompoundGroup1ReferenceCountAt(long index) { return (int) VH_preferredMaxBidirectionalCompoundGroup1ReferenceCount.get(this.segment(), 0L, index); }
    public int preferredMaxBidirectionalCompoundGroup2ReferenceCountAt(long index) { return (int) VH_preferredMaxBidirectionalCompoundGroup2ReferenceCount.get(this.segment(), 0L, index); }
    public int preferredBidirectionalCompoundReferenceNameMaskAt(long index) { return (int) VH_preferredBidirectionalCompoundReferenceNameMask.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int preferredRateControlFlags() { return (int) VH_preferredRateControlFlags.get(this.segment(), 0L, 0L); }
    public int preferredGopFrameCount() { return (int) VH_preferredGopFrameCount.get(this.segment(), 0L, 0L); }
    public int preferredKeyFramePeriod() { return (int) VH_preferredKeyFramePeriod.get(this.segment(), 0L, 0L); }
    public int preferredConsecutiveBipredictiveFrameCount() { return (int) VH_preferredConsecutiveBipredictiveFrameCount.get(this.segment(), 0L, 0L); }
    public int preferredTemporalLayerCount() { return (int) VH_preferredTemporalLayerCount.get(this.segment(), 0L, 0L); }
    public int preferredConstantQIndex$intraQIndex() { return (int) VH_preferredConstantQIndex$intraQIndex.get(this.segment(), 0L, 0L); }
    public int preferredConstantQIndex$predictiveQIndex() { return (int) VH_preferredConstantQIndex$predictiveQIndex.get(this.segment(), 0L, 0L); }
    public int preferredConstantQIndex$bipredictiveQIndex() { return (int) VH_preferredConstantQIndex$bipredictiveQIndex.get(this.segment(), 0L, 0L); }
    public int preferredMaxSingleReferenceCount() { return (int) VH_preferredMaxSingleReferenceCount.get(this.segment(), 0L, 0L); }
    public int preferredSingleReferenceNameMask() { return (int) VH_preferredSingleReferenceNameMask.get(this.segment(), 0L, 0L); }
    public int preferredMaxUnidirectionalCompoundReferenceCount() { return (int) VH_preferredMaxUnidirectionalCompoundReferenceCount.get(this.segment(), 0L, 0L); }
    public int preferredMaxUnidirectionalCompoundGroup1ReferenceCount() { return (int) VH_preferredMaxUnidirectionalCompoundGroup1ReferenceCount.get(this.segment(), 0L, 0L); }
    public int preferredUnidirectionalCompoundReferenceNameMask() { return (int) VH_preferredUnidirectionalCompoundReferenceNameMask.get(this.segment(), 0L, 0L); }
    public int preferredMaxBidirectionalCompoundReferenceCount() { return (int) VH_preferredMaxBidirectionalCompoundReferenceCount.get(this.segment(), 0L, 0L); }
    public int preferredMaxBidirectionalCompoundGroup1ReferenceCount() { return (int) VH_preferredMaxBidirectionalCompoundGroup1ReferenceCount.get(this.segment(), 0L, 0L); }
    public int preferredMaxBidirectionalCompoundGroup2ReferenceCount() { return (int) VH_preferredMaxBidirectionalCompoundGroup2ReferenceCount.get(this.segment(), 0L, 0L); }
    public int preferredBidirectionalCompoundReferenceNameMask() { return (int) VH_preferredBidirectionalCompoundReferenceNameMask.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredRateControlFlagsAt(long index, int value) { VH_preferredRateControlFlags.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredGopFrameCountAt(long index, int value) { VH_preferredGopFrameCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredKeyFramePeriodAt(long index, int value) { VH_preferredKeyFramePeriod.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredConsecutiveBipredictiveFrameCountAt(long index, int value) { VH_preferredConsecutiveBipredictiveFrameCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredTemporalLayerCountAt(long index, int value) { VH_preferredTemporalLayerCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredConstantQIndex$intraQIndexAt(long index, int value) { VH_preferredConstantQIndex$intraQIndex.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredConstantQIndex$predictiveQIndexAt(long index, int value) { VH_preferredConstantQIndex$predictiveQIndex.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredConstantQIndex$bipredictiveQIndexAt(long index, int value) { VH_preferredConstantQIndex$bipredictiveQIndex.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxSingleReferenceCountAt(long index, int value) { VH_preferredMaxSingleReferenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredSingleReferenceNameMaskAt(long index, int value) { VH_preferredSingleReferenceNameMask.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxUnidirectionalCompoundReferenceCountAt(long index, int value) { VH_preferredMaxUnidirectionalCompoundReferenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxUnidirectionalCompoundGroup1ReferenceCountAt(long index, int value) { VH_preferredMaxUnidirectionalCompoundGroup1ReferenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredUnidirectionalCompoundReferenceNameMaskAt(long index, int value) { VH_preferredUnidirectionalCompoundReferenceNameMask.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxBidirectionalCompoundReferenceCountAt(long index, int value) { VH_preferredMaxBidirectionalCompoundReferenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxBidirectionalCompoundGroup1ReferenceCountAt(long index, int value) { VH_preferredMaxBidirectionalCompoundGroup1ReferenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxBidirectionalCompoundGroup2ReferenceCountAt(long index, int value) { VH_preferredMaxBidirectionalCompoundGroup2ReferenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredBidirectionalCompoundReferenceNameMaskAt(long index, int value) { VH_preferredBidirectionalCompoundReferenceNameMask.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredRateControlFlags(int value) { VH_preferredRateControlFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredGopFrameCount(int value) { VH_preferredGopFrameCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredKeyFramePeriod(int value) { VH_preferredKeyFramePeriod.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredConsecutiveBipredictiveFrameCount(int value) { VH_preferredConsecutiveBipredictiveFrameCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredTemporalLayerCount(int value) { VH_preferredTemporalLayerCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredConstantQIndex$intraQIndex(int value) { VH_preferredConstantQIndex$intraQIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredConstantQIndex$predictiveQIndex(int value) { VH_preferredConstantQIndex$predictiveQIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredConstantQIndex$bipredictiveQIndex(int value) { VH_preferredConstantQIndex$bipredictiveQIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxSingleReferenceCount(int value) { VH_preferredMaxSingleReferenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredSingleReferenceNameMask(int value) { VH_preferredSingleReferenceNameMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxUnidirectionalCompoundReferenceCount(int value) { VH_preferredMaxUnidirectionalCompoundReferenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxUnidirectionalCompoundGroup1ReferenceCount(int value) { VH_preferredMaxUnidirectionalCompoundGroup1ReferenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredUnidirectionalCompoundReferenceNameMask(int value) { VH_preferredUnidirectionalCompoundReferenceNameMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxBidirectionalCompoundReferenceCount(int value) { VH_preferredMaxBidirectionalCompoundReferenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxBidirectionalCompoundGroup1ReferenceCount(int value) { VH_preferredMaxBidirectionalCompoundGroup1ReferenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxBidirectionalCompoundGroup2ReferenceCount(int value) { VH_preferredMaxBidirectionalCompoundGroup2ReferenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredBidirectionalCompoundReferenceNameMask(int value) { VH_preferredBidirectionalCompoundReferenceNameMask.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _preferredRateControlFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredRateControlFlags, index), LAYOUT_preferredRateControlFlags); }
    public MemorySegment _preferredRateControlFlags() { return _preferredRateControlFlagsAt(0L); }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredRateControlFlagsAt(long index, MemorySegment src) { _preferredRateControlFlagsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredRateControlFlags(MemorySegment src) { return _preferredRateControlFlagsAt(0L, src); }
    public MemorySegment _preferredGopFrameCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredGopFrameCount, index), LAYOUT_preferredGopFrameCount); }
    public MemorySegment _preferredGopFrameCount() { return _preferredGopFrameCountAt(0L); }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredGopFrameCountAt(long index, MemorySegment src) { _preferredGopFrameCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredGopFrameCount(MemorySegment src) { return _preferredGopFrameCountAt(0L, src); }
    public MemorySegment _preferredKeyFramePeriodAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredKeyFramePeriod, index), LAYOUT_preferredKeyFramePeriod); }
    public MemorySegment _preferredKeyFramePeriod() { return _preferredKeyFramePeriodAt(0L); }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredKeyFramePeriodAt(long index, MemorySegment src) { _preferredKeyFramePeriodAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredKeyFramePeriod(MemorySegment src) { return _preferredKeyFramePeriodAt(0L, src); }
    public MemorySegment _preferredConsecutiveBipredictiveFrameCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredConsecutiveBipredictiveFrameCount, index), LAYOUT_preferredConsecutiveBipredictiveFrameCount); }
    public MemorySegment _preferredConsecutiveBipredictiveFrameCount() { return _preferredConsecutiveBipredictiveFrameCountAt(0L); }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredConsecutiveBipredictiveFrameCountAt(long index, MemorySegment src) { _preferredConsecutiveBipredictiveFrameCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredConsecutiveBipredictiveFrameCount(MemorySegment src) { return _preferredConsecutiveBipredictiveFrameCountAt(0L, src); }
    public MemorySegment _preferredTemporalLayerCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredTemporalLayerCount, index), LAYOUT_preferredTemporalLayerCount); }
    public MemorySegment _preferredTemporalLayerCount() { return _preferredTemporalLayerCountAt(0L); }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredTemporalLayerCountAt(long index, MemorySegment src) { _preferredTemporalLayerCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredTemporalLayerCount(MemorySegment src) { return _preferredTemporalLayerCountAt(0L, src); }
    public MemorySegment _preferredConstantQIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredConstantQIndex, index), LAYOUT_preferredConstantQIndex); }
    public MemorySegment _preferredConstantQIndex() { return _preferredConstantQIndexAt(0L); }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredConstantQIndexAt(long index, MemorySegment src) { _preferredConstantQIndexAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredConstantQIndex(MemorySegment src) { return _preferredConstantQIndexAt(0L, src); }
    public MemorySegment _preferredMaxSingleReferenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredMaxSingleReferenceCount, index), LAYOUT_preferredMaxSingleReferenceCount); }
    public MemorySegment _preferredMaxSingleReferenceCount() { return _preferredMaxSingleReferenceCountAt(0L); }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredMaxSingleReferenceCountAt(long index, MemorySegment src) { _preferredMaxSingleReferenceCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredMaxSingleReferenceCount(MemorySegment src) { return _preferredMaxSingleReferenceCountAt(0L, src); }
    public MemorySegment _preferredSingleReferenceNameMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredSingleReferenceNameMask, index), LAYOUT_preferredSingleReferenceNameMask); }
    public MemorySegment _preferredSingleReferenceNameMask() { return _preferredSingleReferenceNameMaskAt(0L); }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredSingleReferenceNameMaskAt(long index, MemorySegment src) { _preferredSingleReferenceNameMaskAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredSingleReferenceNameMask(MemorySegment src) { return _preferredSingleReferenceNameMaskAt(0L, src); }
    public MemorySegment _preferredMaxUnidirectionalCompoundReferenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredMaxUnidirectionalCompoundReferenceCount, index), LAYOUT_preferredMaxUnidirectionalCompoundReferenceCount); }
    public MemorySegment _preferredMaxUnidirectionalCompoundReferenceCount() { return _preferredMaxUnidirectionalCompoundReferenceCountAt(0L); }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredMaxUnidirectionalCompoundReferenceCountAt(long index, MemorySegment src) { _preferredMaxUnidirectionalCompoundReferenceCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredMaxUnidirectionalCompoundReferenceCount(MemorySegment src) { return _preferredMaxUnidirectionalCompoundReferenceCountAt(0L, src); }
    public MemorySegment _preferredMaxUnidirectionalCompoundGroup1ReferenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredMaxUnidirectionalCompoundGroup1ReferenceCount, index), LAYOUT_preferredMaxUnidirectionalCompoundGroup1ReferenceCount); }
    public MemorySegment _preferredMaxUnidirectionalCompoundGroup1ReferenceCount() { return _preferredMaxUnidirectionalCompoundGroup1ReferenceCountAt(0L); }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredMaxUnidirectionalCompoundGroup1ReferenceCountAt(long index, MemorySegment src) { _preferredMaxUnidirectionalCompoundGroup1ReferenceCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredMaxUnidirectionalCompoundGroup1ReferenceCount(MemorySegment src) { return _preferredMaxUnidirectionalCompoundGroup1ReferenceCountAt(0L, src); }
    public MemorySegment _preferredUnidirectionalCompoundReferenceNameMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredUnidirectionalCompoundReferenceNameMask, index), LAYOUT_preferredUnidirectionalCompoundReferenceNameMask); }
    public MemorySegment _preferredUnidirectionalCompoundReferenceNameMask() { return _preferredUnidirectionalCompoundReferenceNameMaskAt(0L); }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredUnidirectionalCompoundReferenceNameMaskAt(long index, MemorySegment src) { _preferredUnidirectionalCompoundReferenceNameMaskAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredUnidirectionalCompoundReferenceNameMask(MemorySegment src) { return _preferredUnidirectionalCompoundReferenceNameMaskAt(0L, src); }
    public MemorySegment _preferredMaxBidirectionalCompoundReferenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredMaxBidirectionalCompoundReferenceCount, index), LAYOUT_preferredMaxBidirectionalCompoundReferenceCount); }
    public MemorySegment _preferredMaxBidirectionalCompoundReferenceCount() { return _preferredMaxBidirectionalCompoundReferenceCountAt(0L); }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredMaxBidirectionalCompoundReferenceCountAt(long index, MemorySegment src) { _preferredMaxBidirectionalCompoundReferenceCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredMaxBidirectionalCompoundReferenceCount(MemorySegment src) { return _preferredMaxBidirectionalCompoundReferenceCountAt(0L, src); }
    public MemorySegment _preferredMaxBidirectionalCompoundGroup1ReferenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredMaxBidirectionalCompoundGroup1ReferenceCount, index), LAYOUT_preferredMaxBidirectionalCompoundGroup1ReferenceCount); }
    public MemorySegment _preferredMaxBidirectionalCompoundGroup1ReferenceCount() { return _preferredMaxBidirectionalCompoundGroup1ReferenceCountAt(0L); }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredMaxBidirectionalCompoundGroup1ReferenceCountAt(long index, MemorySegment src) { _preferredMaxBidirectionalCompoundGroup1ReferenceCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredMaxBidirectionalCompoundGroup1ReferenceCount(MemorySegment src) { return _preferredMaxBidirectionalCompoundGroup1ReferenceCountAt(0L, src); }
    public MemorySegment _preferredMaxBidirectionalCompoundGroup2ReferenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredMaxBidirectionalCompoundGroup2ReferenceCount, index), LAYOUT_preferredMaxBidirectionalCompoundGroup2ReferenceCount); }
    public MemorySegment _preferredMaxBidirectionalCompoundGroup2ReferenceCount() { return _preferredMaxBidirectionalCompoundGroup2ReferenceCountAt(0L); }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredMaxBidirectionalCompoundGroup2ReferenceCountAt(long index, MemorySegment src) { _preferredMaxBidirectionalCompoundGroup2ReferenceCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredMaxBidirectionalCompoundGroup2ReferenceCount(MemorySegment src) { return _preferredMaxBidirectionalCompoundGroup2ReferenceCountAt(0L, src); }
    public MemorySegment _preferredBidirectionalCompoundReferenceNameMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preferredBidirectionalCompoundReferenceNameMask, index), LAYOUT_preferredBidirectionalCompoundReferenceNameMask); }
    public MemorySegment _preferredBidirectionalCompoundReferenceNameMask() { return _preferredBidirectionalCompoundReferenceNameMaskAt(0L); }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredBidirectionalCompoundReferenceNameMaskAt(long index, MemorySegment src) { _preferredBidirectionalCompoundReferenceNameMaskAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QualityLevelPropertiesKHR _preferredBidirectionalCompoundReferenceNameMask(MemorySegment src) { return _preferredBidirectionalCompoundReferenceNameMaskAt(0L, src); }
}
