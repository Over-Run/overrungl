// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeAV1RateControlInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeAV1RateControlInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkVideoEncodeAV1RateControlFlagsKHR flags;
///     uint32_t gopFrameCount;
///     uint32_t keyFramePeriod;
///     uint32_t consecutiveBipredictiveFrameCount;
///     uint32_t temporalLayerCount;
/// }
/// ```
public final class VkVideoEncodeAV1RateControlInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("gopFrameCount"),
        ValueLayout.JAVA_INT.withName("keyFramePeriod"),
        ValueLayout.JAVA_INT.withName("consecutiveBipredictiveFrameCount"),
        ValueLayout.JAVA_INT.withName("temporalLayerCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_gopFrameCount = LAYOUT.byteOffset(PathElement.groupElement("gopFrameCount"));
    public static final long OFFSET_keyFramePeriod = LAYOUT.byteOffset(PathElement.groupElement("keyFramePeriod"));
    public static final long OFFSET_consecutiveBipredictiveFrameCount = LAYOUT.byteOffset(PathElement.groupElement("consecutiveBipredictiveFrameCount"));
    public static final long OFFSET_temporalLayerCount = LAYOUT.byteOffset(PathElement.groupElement("temporalLayerCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_gopFrameCount = LAYOUT.select(PathElement.groupElement("gopFrameCount"));
    public static final MemoryLayout LAYOUT_keyFramePeriod = LAYOUT.select(PathElement.groupElement("keyFramePeriod"));
    public static final MemoryLayout LAYOUT_consecutiveBipredictiveFrameCount = LAYOUT.select(PathElement.groupElement("consecutiveBipredictiveFrameCount"));
    public static final MemoryLayout LAYOUT_temporalLayerCount = LAYOUT.select(PathElement.groupElement("temporalLayerCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_gopFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopFrameCount"));
    public static final VarHandle VH_keyFramePeriod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("keyFramePeriod"));
    public static final VarHandle VH_consecutiveBipredictiveFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("consecutiveBipredictiveFrameCount"));
    public static final VarHandle VH_temporalLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("temporalLayerCount"));

    public VkVideoEncodeAV1RateControlInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeAV1RateControlInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1RateControlInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeAV1RateControlInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1RateControlInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeAV1RateControlInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1RateControlInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeAV1RateControlInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1RateControlInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeAV1RateControlInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1RateControlInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeAV1RateControlInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeAv1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_INFO_KHR); }
    public static VkVideoEncodeAV1RateControlInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeAv1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_INFO_KHR);
        return s;
    }
    public VkVideoEncodeAV1RateControlInfoKHR copyFrom(VkVideoEncodeAV1RateControlInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeAV1RateControlInfoKHR reinterpret(long count) { return new VkVideoEncodeAV1RateControlInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeAV1RateControlInfoKHR asSlice(long index) { return new VkVideoEncodeAV1RateControlInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeAV1RateControlInfoKHR asSlice(long index, long count) { return new VkVideoEncodeAV1RateControlInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeAV1RateControlInfoKHR at(long index, Consumer<VkVideoEncodeAV1RateControlInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int gopFrameCountAt(long index) { return (int) VH_gopFrameCount.get(this.segment(), 0L, index); }
    public int keyFramePeriodAt(long index) { return (int) VH_keyFramePeriod.get(this.segment(), 0L, index); }
    public int consecutiveBipredictiveFrameCountAt(long index) { return (int) VH_consecutiveBipredictiveFrameCount.get(this.segment(), 0L, index); }
    public int temporalLayerCountAt(long index) { return (int) VH_temporalLayerCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int gopFrameCount() { return (int) VH_gopFrameCount.get(this.segment(), 0L, 0L); }
    public int keyFramePeriod() { return (int) VH_keyFramePeriod.get(this.segment(), 0L, 0L); }
    public int consecutiveBipredictiveFrameCount() { return (int) VH_consecutiveBipredictiveFrameCount.get(this.segment(), 0L, 0L); }
    public int temporalLayerCount() { return (int) VH_temporalLayerCount.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeAV1RateControlInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1RateControlInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1RateControlInfoKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1RateControlInfoKHR gopFrameCountAt(long index, int value) { VH_gopFrameCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1RateControlInfoKHR keyFramePeriodAt(long index, int value) { VH_keyFramePeriod.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1RateControlInfoKHR consecutiveBipredictiveFrameCountAt(long index, int value) { VH_consecutiveBipredictiveFrameCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1RateControlInfoKHR temporalLayerCountAt(long index, int value) { VH_temporalLayerCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1RateControlInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1RateControlInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1RateControlInfoKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1RateControlInfoKHR gopFrameCount(int value) { VH_gopFrameCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1RateControlInfoKHR keyFramePeriod(int value) { VH_keyFramePeriod.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1RateControlInfoKHR consecutiveBipredictiveFrameCount(int value) { VH_consecutiveBipredictiveFrameCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1RateControlInfoKHR temporalLayerCount(int value) { VH_temporalLayerCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeAV1RateControlInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1RateControlInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeAV1RateControlInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1RateControlInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkVideoEncodeAV1RateControlInfoKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1RateControlInfoKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _gopFrameCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_gopFrameCount, index), LAYOUT_gopFrameCount); }
    public MemorySegment _gopFrameCount() { return _gopFrameCountAt(0L); }
    public VkVideoEncodeAV1RateControlInfoKHR _gopFrameCountAt(long index, MemorySegment src) { _gopFrameCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1RateControlInfoKHR _gopFrameCount(MemorySegment src) { return _gopFrameCountAt(0L, src); }
    public MemorySegment _keyFramePeriodAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_keyFramePeriod, index), LAYOUT_keyFramePeriod); }
    public MemorySegment _keyFramePeriod() { return _keyFramePeriodAt(0L); }
    public VkVideoEncodeAV1RateControlInfoKHR _keyFramePeriodAt(long index, MemorySegment src) { _keyFramePeriodAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1RateControlInfoKHR _keyFramePeriod(MemorySegment src) { return _keyFramePeriodAt(0L, src); }
    public MemorySegment _consecutiveBipredictiveFrameCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_consecutiveBipredictiveFrameCount, index), LAYOUT_consecutiveBipredictiveFrameCount); }
    public MemorySegment _consecutiveBipredictiveFrameCount() { return _consecutiveBipredictiveFrameCountAt(0L); }
    public VkVideoEncodeAV1RateControlInfoKHR _consecutiveBipredictiveFrameCountAt(long index, MemorySegment src) { _consecutiveBipredictiveFrameCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1RateControlInfoKHR _consecutiveBipredictiveFrameCount(MemorySegment src) { return _consecutiveBipredictiveFrameCountAt(0L, src); }
    public MemorySegment _temporalLayerCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_temporalLayerCount, index), LAYOUT_temporalLayerCount); }
    public MemorySegment _temporalLayerCount() { return _temporalLayerCountAt(0L); }
    public VkVideoEncodeAV1RateControlInfoKHR _temporalLayerCountAt(long index, MemorySegment src) { _temporalLayerCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1RateControlInfoKHR _temporalLayerCount(MemorySegment src) { return _temporalLayerCountAt(0L, src); }
}
