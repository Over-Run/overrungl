// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeAV1QuantizationMapCapabilitiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     int32_t minQIndexDelta;
///     int32_t maxQIndexDelta;
/// }
/// ```
public final class VkVideoEncodeAV1QuantizationMapCapabilitiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minQIndexDelta"),
        ValueLayout.JAVA_INT.withName("maxQIndexDelta")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_minQIndexDelta = LAYOUT.byteOffset(PathElement.groupElement("minQIndexDelta"));
    public static final long OFFSET_maxQIndexDelta = LAYOUT.byteOffset(PathElement.groupElement("maxQIndexDelta"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_minQIndexDelta = LAYOUT.select(PathElement.groupElement("minQIndexDelta"));
    public static final MemoryLayout LAYOUT_maxQIndexDelta = LAYOUT.select(PathElement.groupElement("maxQIndexDelta"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_minQIndexDelta = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minQIndexDelta"));
    public static final VarHandle VH_maxQIndexDelta = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQIndexDelta"));

    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_QUANTIZATION_MAP_CAPABILITIES_KHR); }
    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_QUANTIZATION_MAP_CAPABILITIES_KHR);
        return s;
    }
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR copyFrom(VkVideoEncodeAV1QuantizationMapCapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR reinterpret(long count) { return new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR asSlice(long index) { return new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR asSlice(long index, long count) { return new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR at(long index, Consumer<VkVideoEncodeAV1QuantizationMapCapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int minQIndexDeltaAt(long index) { return (int) VH_minQIndexDelta.get(this.segment(), 0L, index); }
    public int maxQIndexDeltaAt(long index) { return (int) VH_maxQIndexDelta.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int minQIndexDelta() { return (int) VH_minQIndexDelta.get(this.segment(), 0L, 0L); }
    public int maxQIndexDelta() { return (int) VH_maxQIndexDelta.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR minQIndexDeltaAt(long index, int value) { VH_minQIndexDelta.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR maxQIndexDeltaAt(long index, int value) { VH_maxQIndexDelta.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR minQIndexDelta(int value) { VH_minQIndexDelta.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR maxQIndexDelta(int value) { VH_maxQIndexDelta.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _minQIndexDeltaAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minQIndexDelta, index), LAYOUT_minQIndexDelta); }
    public MemorySegment _minQIndexDelta() { return _minQIndexDeltaAt(0L); }
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR _minQIndexDeltaAt(long index, MemorySegment src) { _minQIndexDeltaAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR _minQIndexDelta(MemorySegment src) { return _minQIndexDeltaAt(0L, src); }
    public MemorySegment _maxQIndexDeltaAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxQIndexDelta, index), LAYOUT_maxQIndexDelta); }
    public MemorySegment _maxQIndexDelta() { return _maxQIndexDeltaAt(0L); }
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR _maxQIndexDeltaAt(long index, MemorySegment src) { _maxQIndexDeltaAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR _maxQIndexDelta(MemorySegment src) { return _maxQIndexDeltaAt(0L, src); }
}
