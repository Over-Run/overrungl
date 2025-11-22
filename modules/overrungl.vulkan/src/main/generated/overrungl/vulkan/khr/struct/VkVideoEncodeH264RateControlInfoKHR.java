// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeH264RateControlInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH264RateControlInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkVideoEncodeH264RateControlFlagsKHR flags;
///     uint32_t gopFrameCount;
///     uint32_t idrPeriod;
///     uint32_t consecutiveBFrameCount;
///     uint32_t temporalLayerCount;
/// }
/// ```
public final class VkVideoEncodeH264RateControlInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("gopFrameCount"),
        ValueLayout.JAVA_INT.withName("idrPeriod"),
        ValueLayout.JAVA_INT.withName("consecutiveBFrameCount"),
        ValueLayout.JAVA_INT.withName("temporalLayerCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_gopFrameCount = LAYOUT.byteOffset(PathElement.groupElement("gopFrameCount"));
    public static final long OFFSET_idrPeriod = LAYOUT.byteOffset(PathElement.groupElement("idrPeriod"));
    public static final long OFFSET_consecutiveBFrameCount = LAYOUT.byteOffset(PathElement.groupElement("consecutiveBFrameCount"));
    public static final long OFFSET_temporalLayerCount = LAYOUT.byteOffset(PathElement.groupElement("temporalLayerCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_gopFrameCount = LAYOUT.select(PathElement.groupElement("gopFrameCount"));
    public static final MemoryLayout LAYOUT_idrPeriod = LAYOUT.select(PathElement.groupElement("idrPeriod"));
    public static final MemoryLayout LAYOUT_consecutiveBFrameCount = LAYOUT.select(PathElement.groupElement("consecutiveBFrameCount"));
    public static final MemoryLayout LAYOUT_temporalLayerCount = LAYOUT.select(PathElement.groupElement("temporalLayerCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_gopFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopFrameCount"));
    public static final VarHandle VH_idrPeriod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("idrPeriod"));
    public static final VarHandle VH_consecutiveBFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("consecutiveBFrameCount"));
    public static final VarHandle VH_temporalLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("temporalLayerCount"));

    public VkVideoEncodeH264RateControlInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeH264RateControlInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264RateControlInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeH264RateControlInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264RateControlInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeH264RateControlInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264RateControlInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeH264RateControlInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264RateControlInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeH264RateControlInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH264RateControlInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeH264RateControlInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_INFO_KHR); }
    public static VkVideoEncodeH264RateControlInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_INFO_KHR);
        return s;
    }
    public VkVideoEncodeH264RateControlInfoKHR copyFrom(VkVideoEncodeH264RateControlInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeH264RateControlInfoKHR reinterpret(long count) { return new VkVideoEncodeH264RateControlInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeH264RateControlInfoKHR asSlice(long index) { return new VkVideoEncodeH264RateControlInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeH264RateControlInfoKHR asSlice(long index, long count) { return new VkVideoEncodeH264RateControlInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeH264RateControlInfoKHR at(long index, Consumer<VkVideoEncodeH264RateControlInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int gopFrameCountAt(long index) { return (int) VH_gopFrameCount.get(this.segment(), 0L, index); }
    public int idrPeriodAt(long index) { return (int) VH_idrPeriod.get(this.segment(), 0L, index); }
    public int consecutiveBFrameCountAt(long index) { return (int) VH_consecutiveBFrameCount.get(this.segment(), 0L, index); }
    public int temporalLayerCountAt(long index) { return (int) VH_temporalLayerCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int gopFrameCount() { return (int) VH_gopFrameCount.get(this.segment(), 0L, 0L); }
    public int idrPeriod() { return (int) VH_idrPeriod.get(this.segment(), 0L, 0L); }
    public int consecutiveBFrameCount() { return (int) VH_consecutiveBFrameCount.get(this.segment(), 0L, 0L); }
    public int temporalLayerCount() { return (int) VH_temporalLayerCount.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeH264RateControlInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264RateControlInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264RateControlInfoKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264RateControlInfoKHR gopFrameCountAt(long index, int value) { VH_gopFrameCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264RateControlInfoKHR idrPeriodAt(long index, int value) { VH_idrPeriod.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264RateControlInfoKHR consecutiveBFrameCountAt(long index, int value) { VH_consecutiveBFrameCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264RateControlInfoKHR temporalLayerCountAt(long index, int value) { VH_temporalLayerCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264RateControlInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264RateControlInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264RateControlInfoKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264RateControlInfoKHR gopFrameCount(int value) { VH_gopFrameCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264RateControlInfoKHR idrPeriod(int value) { VH_idrPeriod.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264RateControlInfoKHR consecutiveBFrameCount(int value) { VH_consecutiveBFrameCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264RateControlInfoKHR temporalLayerCount(int value) { VH_temporalLayerCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeH264RateControlInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264RateControlInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeH264RateControlInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264RateControlInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkVideoEncodeH264RateControlInfoKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264RateControlInfoKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _gopFrameCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_gopFrameCount, index), LAYOUT_gopFrameCount); }
    public MemorySegment _gopFrameCount() { return _gopFrameCountAt(0L); }
    public VkVideoEncodeH264RateControlInfoKHR _gopFrameCountAt(long index, MemorySegment src) { _gopFrameCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264RateControlInfoKHR _gopFrameCount(MemorySegment src) { return _gopFrameCountAt(0L, src); }
    public MemorySegment _idrPeriodAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_idrPeriod, index), LAYOUT_idrPeriod); }
    public MemorySegment _idrPeriod() { return _idrPeriodAt(0L); }
    public VkVideoEncodeH264RateControlInfoKHR _idrPeriodAt(long index, MemorySegment src) { _idrPeriodAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264RateControlInfoKHR _idrPeriod(MemorySegment src) { return _idrPeriodAt(0L, src); }
    public MemorySegment _consecutiveBFrameCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_consecutiveBFrameCount, index), LAYOUT_consecutiveBFrameCount); }
    public MemorySegment _consecutiveBFrameCount() { return _consecutiveBFrameCountAt(0L); }
    public VkVideoEncodeH264RateControlInfoKHR _consecutiveBFrameCountAt(long index, MemorySegment src) { _consecutiveBFrameCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264RateControlInfoKHR _consecutiveBFrameCount(MemorySegment src) { return _consecutiveBFrameCountAt(0L, src); }
    public MemorySegment _temporalLayerCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_temporalLayerCount, index), LAYOUT_temporalLayerCount); }
    public MemorySegment _temporalLayerCount() { return _temporalLayerCountAt(0L); }
    public VkVideoEncodeH264RateControlInfoKHR _temporalLayerCountAt(long index, MemorySegment src) { _temporalLayerCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264RateControlInfoKHR _temporalLayerCount(MemorySegment src) { return _temporalLayerCountAt(0L, src); }
}
