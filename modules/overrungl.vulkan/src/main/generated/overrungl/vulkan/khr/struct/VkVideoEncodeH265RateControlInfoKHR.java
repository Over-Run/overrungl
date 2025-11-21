// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeH265RateControlInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH265RateControlInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkVideoEncodeH265RateControlFlagsKHR flags;
///     uint32_t gopFrameCount;
///     uint32_t idrPeriod;
///     uint32_t consecutiveBFrameCount;
///     uint32_t subLayerCount;
/// }
/// ```
public final class VkVideoEncodeH265RateControlInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("gopFrameCount"),
        ValueLayout.JAVA_INT.withName("idrPeriod"),
        ValueLayout.JAVA_INT.withName("consecutiveBFrameCount"),
        ValueLayout.JAVA_INT.withName("subLayerCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_gopFrameCount = LAYOUT.byteOffset(PathElement.groupElement("gopFrameCount"));
    public static final long OFFSET_idrPeriod = LAYOUT.byteOffset(PathElement.groupElement("idrPeriod"));
    public static final long OFFSET_consecutiveBFrameCount = LAYOUT.byteOffset(PathElement.groupElement("consecutiveBFrameCount"));
    public static final long OFFSET_subLayerCount = LAYOUT.byteOffset(PathElement.groupElement("subLayerCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_gopFrameCount = LAYOUT.select(PathElement.groupElement("gopFrameCount"));
    public static final MemoryLayout LAYOUT_idrPeriod = LAYOUT.select(PathElement.groupElement("idrPeriod"));
    public static final MemoryLayout LAYOUT_consecutiveBFrameCount = LAYOUT.select(PathElement.groupElement("consecutiveBFrameCount"));
    public static final MemoryLayout LAYOUT_subLayerCount = LAYOUT.select(PathElement.groupElement("subLayerCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_gopFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopFrameCount"));
    public static final VarHandle VH_idrPeriod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("idrPeriod"));
    public static final VarHandle VH_consecutiveBFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("consecutiveBFrameCount"));
    public static final VarHandle VH_subLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subLayerCount"));

    public VkVideoEncodeH265RateControlInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeH265RateControlInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265RateControlInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeH265RateControlInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265RateControlInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeH265RateControlInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265RateControlInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeH265RateControlInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265RateControlInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeH265RateControlInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265RateControlInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeH265RateControlInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_KHR); }
    public static VkVideoEncodeH265RateControlInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_KHR);
        return s;
    }
    public VkVideoEncodeH265RateControlInfoKHR copyFrom(VkVideoEncodeH265RateControlInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeH265RateControlInfoKHR reinterpret(long count) { return new VkVideoEncodeH265RateControlInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeH265RateControlInfoKHR asSlice(long index) { return new VkVideoEncodeH265RateControlInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeH265RateControlInfoKHR asSlice(long index, long count) { return new VkVideoEncodeH265RateControlInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeH265RateControlInfoKHR at(long index, Consumer<VkVideoEncodeH265RateControlInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int gopFrameCountAt(long index) { return (int) VH_gopFrameCount.get(this.segment(), 0L, index); }
    public int idrPeriodAt(long index) { return (int) VH_idrPeriod.get(this.segment(), 0L, index); }
    public int consecutiveBFrameCountAt(long index) { return (int) VH_consecutiveBFrameCount.get(this.segment(), 0L, index); }
    public int subLayerCountAt(long index) { return (int) VH_subLayerCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int gopFrameCount() { return (int) VH_gopFrameCount.get(this.segment(), 0L, 0L); }
    public int idrPeriod() { return (int) VH_idrPeriod.get(this.segment(), 0L, 0L); }
    public int consecutiveBFrameCount() { return (int) VH_consecutiveBFrameCount.get(this.segment(), 0L, 0L); }
    public int subLayerCount() { return (int) VH_subLayerCount.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeH265RateControlInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265RateControlInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265RateControlInfoKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265RateControlInfoKHR gopFrameCountAt(long index, int value) { VH_gopFrameCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265RateControlInfoKHR idrPeriodAt(long index, int value) { VH_idrPeriod.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265RateControlInfoKHR consecutiveBFrameCountAt(long index, int value) { VH_consecutiveBFrameCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265RateControlInfoKHR subLayerCountAt(long index, int value) { VH_subLayerCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265RateControlInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265RateControlInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265RateControlInfoKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265RateControlInfoKHR gopFrameCount(int value) { VH_gopFrameCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265RateControlInfoKHR idrPeriod(int value) { VH_idrPeriod.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265RateControlInfoKHR consecutiveBFrameCount(int value) { VH_consecutiveBFrameCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265RateControlInfoKHR subLayerCount(int value) { VH_subLayerCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeH265RateControlInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265RateControlInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeH265RateControlInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265RateControlInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkVideoEncodeH265RateControlInfoKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265RateControlInfoKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _gopFrameCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_gopFrameCount, index), LAYOUT_gopFrameCount); }
    public MemorySegment _gopFrameCount() { return _gopFrameCountAt(0L); }
    public VkVideoEncodeH265RateControlInfoKHR _gopFrameCountAt(long index, MemorySegment src) { _gopFrameCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265RateControlInfoKHR _gopFrameCount(MemorySegment src) { return _gopFrameCountAt(0L, src); }
    public MemorySegment _idrPeriodAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_idrPeriod, index), LAYOUT_idrPeriod); }
    public MemorySegment _idrPeriod() { return _idrPeriodAt(0L); }
    public VkVideoEncodeH265RateControlInfoKHR _idrPeriodAt(long index, MemorySegment src) { _idrPeriodAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265RateControlInfoKHR _idrPeriod(MemorySegment src) { return _idrPeriodAt(0L, src); }
    public MemorySegment _consecutiveBFrameCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_consecutiveBFrameCount, index), LAYOUT_consecutiveBFrameCount); }
    public MemorySegment _consecutiveBFrameCount() { return _consecutiveBFrameCountAt(0L); }
    public VkVideoEncodeH265RateControlInfoKHR _consecutiveBFrameCountAt(long index, MemorySegment src) { _consecutiveBFrameCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265RateControlInfoKHR _consecutiveBFrameCount(MemorySegment src) { return _consecutiveBFrameCountAt(0L, src); }
    public MemorySegment _subLayerCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subLayerCount, index), LAYOUT_subLayerCount); }
    public MemorySegment _subLayerCount() { return _subLayerCountAt(0L); }
    public VkVideoEncodeH265RateControlInfoKHR _subLayerCountAt(long index, MemorySegment src) { _subLayerCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265RateControlInfoKHR _subLayerCount(MemorySegment src) { return _subLayerCountAt(0L, src); }
}
