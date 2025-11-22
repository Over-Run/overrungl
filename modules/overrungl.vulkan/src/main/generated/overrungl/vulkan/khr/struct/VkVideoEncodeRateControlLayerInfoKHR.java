// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeRateControlLayerInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeRateControlLayerInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint64_t averageBitrate;
///     uint64_t maxBitrate;
///     uint32_t frameRateNumerator;
///     uint32_t frameRateDenominator;
/// }
/// ```
public final class VkVideoEncodeRateControlLayerInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("averageBitrate"),
        ValueLayout.JAVA_LONG.withName("maxBitrate"),
        ValueLayout.JAVA_INT.withName("frameRateNumerator"),
        ValueLayout.JAVA_INT.withName("frameRateDenominator")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_averageBitrate = LAYOUT.byteOffset(PathElement.groupElement("averageBitrate"));
    public static final long OFFSET_maxBitrate = LAYOUT.byteOffset(PathElement.groupElement("maxBitrate"));
    public static final long OFFSET_frameRateNumerator = LAYOUT.byteOffset(PathElement.groupElement("frameRateNumerator"));
    public static final long OFFSET_frameRateDenominator = LAYOUT.byteOffset(PathElement.groupElement("frameRateDenominator"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_averageBitrate = LAYOUT.select(PathElement.groupElement("averageBitrate"));
    public static final MemoryLayout LAYOUT_maxBitrate = LAYOUT.select(PathElement.groupElement("maxBitrate"));
    public static final MemoryLayout LAYOUT_frameRateNumerator = LAYOUT.select(PathElement.groupElement("frameRateNumerator"));
    public static final MemoryLayout LAYOUT_frameRateDenominator = LAYOUT.select(PathElement.groupElement("frameRateDenominator"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_averageBitrate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("averageBitrate"));
    public static final VarHandle VH_maxBitrate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBitrate"));
    public static final VarHandle VH_frameRateNumerator = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameRateNumerator"));
    public static final VarHandle VH_frameRateDenominator = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameRateDenominator"));

    public VkVideoEncodeRateControlLayerInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeRateControlLayerInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeRateControlLayerInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeRateControlLayerInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeRateControlLayerInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeRateControlLayerInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeRateControlLayerInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeRateControlLayerInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeRateControlLayerInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeRateControlLayerInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeRateControlLayerInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeRateControlLayerInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR); }
    public static VkVideoEncodeRateControlLayerInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR);
        return s;
    }
    public VkVideoEncodeRateControlLayerInfoKHR copyFrom(VkVideoEncodeRateControlLayerInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeRateControlLayerInfoKHR reinterpret(long count) { return new VkVideoEncodeRateControlLayerInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeRateControlLayerInfoKHR asSlice(long index) { return new VkVideoEncodeRateControlLayerInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeRateControlLayerInfoKHR asSlice(long index, long count) { return new VkVideoEncodeRateControlLayerInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeRateControlLayerInfoKHR at(long index, Consumer<VkVideoEncodeRateControlLayerInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long averageBitrateAt(long index) { return (long) VH_averageBitrate.get(this.segment(), 0L, index); }
    public long maxBitrateAt(long index) { return (long) VH_maxBitrate.get(this.segment(), 0L, index); }
    public int frameRateNumeratorAt(long index) { return (int) VH_frameRateNumerator.get(this.segment(), 0L, index); }
    public int frameRateDenominatorAt(long index) { return (int) VH_frameRateDenominator.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long averageBitrate() { return (long) VH_averageBitrate.get(this.segment(), 0L, 0L); }
    public long maxBitrate() { return (long) VH_maxBitrate.get(this.segment(), 0L, 0L); }
    public int frameRateNumerator() { return (int) VH_frameRateNumerator.get(this.segment(), 0L, 0L); }
    public int frameRateDenominator() { return (int) VH_frameRateDenominator.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeRateControlLayerInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeRateControlLayerInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeRateControlLayerInfoKHR averageBitrateAt(long index, long value) { VH_averageBitrate.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeRateControlLayerInfoKHR maxBitrateAt(long index, long value) { VH_maxBitrate.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeRateControlLayerInfoKHR frameRateNumeratorAt(long index, int value) { VH_frameRateNumerator.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeRateControlLayerInfoKHR frameRateDenominatorAt(long index, int value) { VH_frameRateDenominator.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeRateControlLayerInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeRateControlLayerInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeRateControlLayerInfoKHR averageBitrate(long value) { VH_averageBitrate.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeRateControlLayerInfoKHR maxBitrate(long value) { VH_maxBitrate.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeRateControlLayerInfoKHR frameRateNumerator(int value) { VH_frameRateNumerator.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeRateControlLayerInfoKHR frameRateDenominator(int value) { VH_frameRateDenominator.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeRateControlLayerInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeRateControlLayerInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeRateControlLayerInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeRateControlLayerInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _averageBitrateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_averageBitrate, index), LAYOUT_averageBitrate); }
    public MemorySegment _averageBitrate() { return _averageBitrateAt(0L); }
    public VkVideoEncodeRateControlLayerInfoKHR _averageBitrateAt(long index, MemorySegment src) { _averageBitrateAt(index).copyFrom(src); return this; }
    public VkVideoEncodeRateControlLayerInfoKHR _averageBitrate(MemorySegment src) { return _averageBitrateAt(0L, src); }
    public MemorySegment _maxBitrateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxBitrate, index), LAYOUT_maxBitrate); }
    public MemorySegment _maxBitrate() { return _maxBitrateAt(0L); }
    public VkVideoEncodeRateControlLayerInfoKHR _maxBitrateAt(long index, MemorySegment src) { _maxBitrateAt(index).copyFrom(src); return this; }
    public VkVideoEncodeRateControlLayerInfoKHR _maxBitrate(MemorySegment src) { return _maxBitrateAt(0L, src); }
    public MemorySegment _frameRateNumeratorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_frameRateNumerator, index), LAYOUT_frameRateNumerator); }
    public MemorySegment _frameRateNumerator() { return _frameRateNumeratorAt(0L); }
    public VkVideoEncodeRateControlLayerInfoKHR _frameRateNumeratorAt(long index, MemorySegment src) { _frameRateNumeratorAt(index).copyFrom(src); return this; }
    public VkVideoEncodeRateControlLayerInfoKHR _frameRateNumerator(MemorySegment src) { return _frameRateNumeratorAt(0L, src); }
    public MemorySegment _frameRateDenominatorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_frameRateDenominator, index), LAYOUT_frameRateDenominator); }
    public MemorySegment _frameRateDenominator() { return _frameRateDenominatorAt(0L); }
    public VkVideoEncodeRateControlLayerInfoKHR _frameRateDenominatorAt(long index, MemorySegment src) { _frameRateDenominatorAt(index).copyFrom(src); return this; }
    public VkVideoEncodeRateControlLayerInfoKHR _frameRateDenominator(MemorySegment src) { return _frameRateDenominatorAt(0L, src); }
}
