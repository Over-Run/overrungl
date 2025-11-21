// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeAV1RateControlLayerInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeAV1RateControlLayerInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 useMinQIndex;
///     VkVideoEncodeAV1QIndexKHR minQIndex;
///     VkBool32 useMaxQIndex;
///     VkVideoEncodeAV1QIndexKHR maxQIndex;
///     VkBool32 useMaxFrameSize;
///     VkVideoEncodeAV1FrameSizeKHR maxFrameSize;
/// }
/// ```
public final class VkVideoEncodeAV1RateControlLayerInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useMinQIndex"),
        overrungl.vulkan.khr.struct.VkVideoEncodeAV1QIndexKHR.LAYOUT.withName("minQIndex"),
        ValueLayout.JAVA_INT.withName("useMaxQIndex"),
        overrungl.vulkan.khr.struct.VkVideoEncodeAV1QIndexKHR.LAYOUT.withName("maxQIndex"),
        ValueLayout.JAVA_INT.withName("useMaxFrameSize"),
        overrungl.vulkan.khr.struct.VkVideoEncodeAV1FrameSizeKHR.LAYOUT.withName("maxFrameSize")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_useMinQIndex = LAYOUT.byteOffset(PathElement.groupElement("useMinQIndex"));
    public static final long OFFSET_minQIndex = LAYOUT.byteOffset(PathElement.groupElement("minQIndex"));
    public static final long OFFSET_useMaxQIndex = LAYOUT.byteOffset(PathElement.groupElement("useMaxQIndex"));
    public static final long OFFSET_maxQIndex = LAYOUT.byteOffset(PathElement.groupElement("maxQIndex"));
    public static final long OFFSET_useMaxFrameSize = LAYOUT.byteOffset(PathElement.groupElement("useMaxFrameSize"));
    public static final long OFFSET_maxFrameSize = LAYOUT.byteOffset(PathElement.groupElement("maxFrameSize"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_useMinQIndex = LAYOUT.select(PathElement.groupElement("useMinQIndex"));
    public static final MemoryLayout LAYOUT_minQIndex = LAYOUT.select(PathElement.groupElement("minQIndex"));
    public static final MemoryLayout LAYOUT_useMaxQIndex = LAYOUT.select(PathElement.groupElement("useMaxQIndex"));
    public static final MemoryLayout LAYOUT_maxQIndex = LAYOUT.select(PathElement.groupElement("maxQIndex"));
    public static final MemoryLayout LAYOUT_useMaxFrameSize = LAYOUT.select(PathElement.groupElement("useMaxFrameSize"));
    public static final MemoryLayout LAYOUT_maxFrameSize = LAYOUT.select(PathElement.groupElement("maxFrameSize"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_useMinQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useMinQIndex"));
    public static final VarHandle VH_minQIndex$intraQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minQIndex"), PathElement.groupElement("intraQIndex"));
    public static final VarHandle VH_minQIndex$predictiveQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minQIndex"), PathElement.groupElement("predictiveQIndex"));
    public static final VarHandle VH_minQIndex$bipredictiveQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minQIndex"), PathElement.groupElement("bipredictiveQIndex"));
    public static final VarHandle VH_useMaxQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useMaxQIndex"));
    public static final VarHandle VH_maxQIndex$intraQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQIndex"), PathElement.groupElement("intraQIndex"));
    public static final VarHandle VH_maxQIndex$predictiveQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQIndex"), PathElement.groupElement("predictiveQIndex"));
    public static final VarHandle VH_maxQIndex$bipredictiveQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQIndex"), PathElement.groupElement("bipredictiveQIndex"));
    public static final VarHandle VH_useMaxFrameSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useMaxFrameSize"));
    public static final VarHandle VH_maxFrameSize$intraFrameSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFrameSize"), PathElement.groupElement("intraFrameSize"));
    public static final VarHandle VH_maxFrameSize$predictiveFrameSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFrameSize"), PathElement.groupElement("predictiveFrameSize"));
    public static final VarHandle VH_maxFrameSize$bipredictiveFrameSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFrameSize"), PathElement.groupElement("bipredictiveFrameSize"));

    public VkVideoEncodeAV1RateControlLayerInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeAV1RateControlLayerInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1RateControlLayerInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeAV1RateControlLayerInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1RateControlLayerInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeAV1RateControlLayerInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1RateControlLayerInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeAV1RateControlLayerInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1RateControlLayerInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeAV1RateControlLayerInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1RateControlLayerInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeAV1RateControlLayerInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeAv1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_LAYER_INFO_KHR); }
    public static VkVideoEncodeAV1RateControlLayerInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeAv1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_LAYER_INFO_KHR);
        return s;
    }
    public VkVideoEncodeAV1RateControlLayerInfoKHR copyFrom(VkVideoEncodeAV1RateControlLayerInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR reinterpret(long count) { return new VkVideoEncodeAV1RateControlLayerInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeAV1RateControlLayerInfoKHR asSlice(long index) { return new VkVideoEncodeAV1RateControlLayerInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeAV1RateControlLayerInfoKHR asSlice(long index, long count) { return new VkVideoEncodeAV1RateControlLayerInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeAV1RateControlLayerInfoKHR at(long index, Consumer<VkVideoEncodeAV1RateControlLayerInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int useMinQIndexAt(long index) { return (int) VH_useMinQIndex.get(this.segment(), 0L, index); }
    public int minQIndex$intraQIndexAt(long index) { return (int) VH_minQIndex$intraQIndex.get(this.segment(), 0L, index); }
    public int minQIndex$predictiveQIndexAt(long index) { return (int) VH_minQIndex$predictiveQIndex.get(this.segment(), 0L, index); }
    public int minQIndex$bipredictiveQIndexAt(long index) { return (int) VH_minQIndex$bipredictiveQIndex.get(this.segment(), 0L, index); }
    public int useMaxQIndexAt(long index) { return (int) VH_useMaxQIndex.get(this.segment(), 0L, index); }
    public int maxQIndex$intraQIndexAt(long index) { return (int) VH_maxQIndex$intraQIndex.get(this.segment(), 0L, index); }
    public int maxQIndex$predictiveQIndexAt(long index) { return (int) VH_maxQIndex$predictiveQIndex.get(this.segment(), 0L, index); }
    public int maxQIndex$bipredictiveQIndexAt(long index) { return (int) VH_maxQIndex$bipredictiveQIndex.get(this.segment(), 0L, index); }
    public int useMaxFrameSizeAt(long index) { return (int) VH_useMaxFrameSize.get(this.segment(), 0L, index); }
    public int maxFrameSize$intraFrameSizeAt(long index) { return (int) VH_maxFrameSize$intraFrameSize.get(this.segment(), 0L, index); }
    public int maxFrameSize$predictiveFrameSizeAt(long index) { return (int) VH_maxFrameSize$predictiveFrameSize.get(this.segment(), 0L, index); }
    public int maxFrameSize$bipredictiveFrameSizeAt(long index) { return (int) VH_maxFrameSize$bipredictiveFrameSize.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int useMinQIndex() { return (int) VH_useMinQIndex.get(this.segment(), 0L, 0L); }
    public int minQIndex$intraQIndex() { return (int) VH_minQIndex$intraQIndex.get(this.segment(), 0L, 0L); }
    public int minQIndex$predictiveQIndex() { return (int) VH_minQIndex$predictiveQIndex.get(this.segment(), 0L, 0L); }
    public int minQIndex$bipredictiveQIndex() { return (int) VH_minQIndex$bipredictiveQIndex.get(this.segment(), 0L, 0L); }
    public int useMaxQIndex() { return (int) VH_useMaxQIndex.get(this.segment(), 0L, 0L); }
    public int maxQIndex$intraQIndex() { return (int) VH_maxQIndex$intraQIndex.get(this.segment(), 0L, 0L); }
    public int maxQIndex$predictiveQIndex() { return (int) VH_maxQIndex$predictiveQIndex.get(this.segment(), 0L, 0L); }
    public int maxQIndex$bipredictiveQIndex() { return (int) VH_maxQIndex$bipredictiveQIndex.get(this.segment(), 0L, 0L); }
    public int useMaxFrameSize() { return (int) VH_useMaxFrameSize.get(this.segment(), 0L, 0L); }
    public int maxFrameSize$intraFrameSize() { return (int) VH_maxFrameSize$intraFrameSize.get(this.segment(), 0L, 0L); }
    public int maxFrameSize$predictiveFrameSize() { return (int) VH_maxFrameSize$predictiveFrameSize.get(this.segment(), 0L, 0L); }
    public int maxFrameSize$bipredictiveFrameSize() { return (int) VH_maxFrameSize$bipredictiveFrameSize.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeAV1RateControlLayerInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMinQIndexAt(long index, int value) { VH_useMinQIndex.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR minQIndex$intraQIndexAt(long index, int value) { VH_minQIndex$intraQIndex.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR minQIndex$predictiveQIndexAt(long index, int value) { VH_minQIndex$predictiveQIndex.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR minQIndex$bipredictiveQIndexAt(long index, int value) { VH_minQIndex$bipredictiveQIndex.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMaxQIndexAt(long index, int value) { VH_useMaxQIndex.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxQIndex$intraQIndexAt(long index, int value) { VH_maxQIndex$intraQIndex.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxQIndex$predictiveQIndexAt(long index, int value) { VH_maxQIndex$predictiveQIndex.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxQIndex$bipredictiveQIndexAt(long index, int value) { VH_maxQIndex$bipredictiveQIndex.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMaxFrameSizeAt(long index, int value) { VH_useMaxFrameSize.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxFrameSize$intraFrameSizeAt(long index, int value) { VH_maxFrameSize$intraFrameSize.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxFrameSize$predictiveFrameSizeAt(long index, int value) { VH_maxFrameSize$predictiveFrameSize.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxFrameSize$bipredictiveFrameSizeAt(long index, int value) { VH_maxFrameSize$bipredictiveFrameSize.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMinQIndex(int value) { VH_useMinQIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR minQIndex$intraQIndex(int value) { VH_minQIndex$intraQIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR minQIndex$predictiveQIndex(int value) { VH_minQIndex$predictiveQIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR minQIndex$bipredictiveQIndex(int value) { VH_minQIndex$bipredictiveQIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMaxQIndex(int value) { VH_useMaxQIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxQIndex$intraQIndex(int value) { VH_maxQIndex$intraQIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxQIndex$predictiveQIndex(int value) { VH_maxQIndex$predictiveQIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxQIndex$bipredictiveQIndex(int value) { VH_maxQIndex$bipredictiveQIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMaxFrameSize(int value) { VH_useMaxFrameSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxFrameSize$intraFrameSize(int value) { VH_maxFrameSize$intraFrameSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxFrameSize$predictiveFrameSize(int value) { VH_maxFrameSize$predictiveFrameSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxFrameSize$bipredictiveFrameSize(int value) { VH_maxFrameSize$bipredictiveFrameSize.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeAV1RateControlLayerInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeAV1RateControlLayerInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _useMinQIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_useMinQIndex, index), LAYOUT_useMinQIndex); }
    public MemorySegment _useMinQIndex() { return _useMinQIndexAt(0L); }
    public VkVideoEncodeAV1RateControlLayerInfoKHR _useMinQIndexAt(long index, MemorySegment src) { _useMinQIndexAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR _useMinQIndex(MemorySegment src) { return _useMinQIndexAt(0L, src); }
    public MemorySegment _minQIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minQIndex, index), LAYOUT_minQIndex); }
    public MemorySegment _minQIndex() { return _minQIndexAt(0L); }
    public VkVideoEncodeAV1RateControlLayerInfoKHR _minQIndexAt(long index, MemorySegment src) { _minQIndexAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR _minQIndex(MemorySegment src) { return _minQIndexAt(0L, src); }
    public MemorySegment _useMaxQIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_useMaxQIndex, index), LAYOUT_useMaxQIndex); }
    public MemorySegment _useMaxQIndex() { return _useMaxQIndexAt(0L); }
    public VkVideoEncodeAV1RateControlLayerInfoKHR _useMaxQIndexAt(long index, MemorySegment src) { _useMaxQIndexAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR _useMaxQIndex(MemorySegment src) { return _useMaxQIndexAt(0L, src); }
    public MemorySegment _maxQIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxQIndex, index), LAYOUT_maxQIndex); }
    public MemorySegment _maxQIndex() { return _maxQIndexAt(0L); }
    public VkVideoEncodeAV1RateControlLayerInfoKHR _maxQIndexAt(long index, MemorySegment src) { _maxQIndexAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR _maxQIndex(MemorySegment src) { return _maxQIndexAt(0L, src); }
    public MemorySegment _useMaxFrameSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_useMaxFrameSize, index), LAYOUT_useMaxFrameSize); }
    public MemorySegment _useMaxFrameSize() { return _useMaxFrameSizeAt(0L); }
    public VkVideoEncodeAV1RateControlLayerInfoKHR _useMaxFrameSizeAt(long index, MemorySegment src) { _useMaxFrameSizeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR _useMaxFrameSize(MemorySegment src) { return _useMaxFrameSizeAt(0L, src); }
    public MemorySegment _maxFrameSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxFrameSize, index), LAYOUT_maxFrameSize); }
    public MemorySegment _maxFrameSize() { return _maxFrameSizeAt(0L); }
    public VkVideoEncodeAV1RateControlLayerInfoKHR _maxFrameSizeAt(long index, MemorySegment src) { _maxFrameSizeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1RateControlLayerInfoKHR _maxFrameSize(MemorySegment src) { return _maxFrameSizeAt(0L, src); }
}
