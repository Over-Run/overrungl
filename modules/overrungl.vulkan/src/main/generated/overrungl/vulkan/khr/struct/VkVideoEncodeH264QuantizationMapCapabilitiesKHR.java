// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeH264QuantizationMapCapabilitiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH264QuantizationMapCapabilitiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     int32_t minQpDelta;
///     int32_t maxQpDelta;
/// }
/// ```
public final class VkVideoEncodeH264QuantizationMapCapabilitiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minQpDelta"),
        ValueLayout.JAVA_INT.withName("maxQpDelta")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_minQpDelta = LAYOUT.byteOffset(PathElement.groupElement("minQpDelta"));
    public static final long OFFSET_maxQpDelta = LAYOUT.byteOffset(PathElement.groupElement("maxQpDelta"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_minQpDelta = LAYOUT.select(PathElement.groupElement("minQpDelta"));
    public static final MemoryLayout LAYOUT_maxQpDelta = LAYOUT.select(PathElement.groupElement("maxQpDelta"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_minQpDelta = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minQpDelta"));
    public static final VarHandle VH_maxQpDelta = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQpDelta"));

    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeH264QuantizationMapCapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264QuantizationMapCapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeH264QuantizationMapCapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264QuantizationMapCapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeH264QuantizationMapCapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264QuantizationMapCapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeH264QuantizationMapCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264QuantizationMapCapabilitiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeH264QuantizationMapCapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH264QuantizationMapCapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeH264QuantizationMapCapabilitiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_QUANTIZATION_MAP_CAPABILITIES_KHR); }
    public static VkVideoEncodeH264QuantizationMapCapabilitiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_QUANTIZATION_MAP_CAPABILITIES_KHR);
        return s;
    }
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR copyFrom(VkVideoEncodeH264QuantizationMapCapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR reinterpret(long count) { return new VkVideoEncodeH264QuantizationMapCapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR asSlice(long index) { return new VkVideoEncodeH264QuantizationMapCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR asSlice(long index, long count) { return new VkVideoEncodeH264QuantizationMapCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR at(long index, Consumer<VkVideoEncodeH264QuantizationMapCapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int minQpDeltaAt(long index) { return (int) VH_minQpDelta.get(this.segment(), 0L, index); }
    public int maxQpDeltaAt(long index) { return (int) VH_maxQpDelta.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int minQpDelta() { return (int) VH_minQpDelta.get(this.segment(), 0L, 0L); }
    public int maxQpDelta() { return (int) VH_maxQpDelta.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR minQpDeltaAt(long index, int value) { VH_minQpDelta.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR maxQpDeltaAt(long index, int value) { VH_maxQpDelta.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR minQpDelta(int value) { VH_minQpDelta.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR maxQpDelta(int value) { VH_maxQpDelta.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _minQpDeltaAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minQpDelta, index), LAYOUT_minQpDelta); }
    public MemorySegment _minQpDelta() { return _minQpDeltaAt(0L); }
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR _minQpDeltaAt(long index, MemorySegment src) { _minQpDeltaAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR _minQpDelta(MemorySegment src) { return _minQpDeltaAt(0L, src); }
    public MemorySegment _maxQpDeltaAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxQpDelta, index), LAYOUT_maxQpDelta); }
    public MemorySegment _maxQpDelta() { return _maxQpDeltaAt(0L); }
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR _maxQpDeltaAt(long index, MemorySegment src) { _maxQpDeltaAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR _maxQpDelta(MemorySegment src) { return _maxQpDeltaAt(0L, src); }
}
