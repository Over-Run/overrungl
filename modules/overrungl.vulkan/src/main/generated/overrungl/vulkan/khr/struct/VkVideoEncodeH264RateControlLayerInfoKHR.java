// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeH264RateControlLayerInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH264RateControlLayerInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 useMinQp;
///     VkVideoEncodeH264QpKHR minQp;
///     VkBool32 useMaxQp;
///     VkVideoEncodeH264QpKHR maxQp;
///     VkBool32 useMaxFrameSize;
///     VkVideoEncodeH264FrameSizeKHR maxFrameSize;
/// }
/// ```
public final class VkVideoEncodeH264RateControlLayerInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useMinQp"),
        overrungl.vulkan.khr.struct.VkVideoEncodeH264QpKHR.LAYOUT.withName("minQp"),
        ValueLayout.JAVA_INT.withName("useMaxQp"),
        overrungl.vulkan.khr.struct.VkVideoEncodeH264QpKHR.LAYOUT.withName("maxQp"),
        ValueLayout.JAVA_INT.withName("useMaxFrameSize"),
        overrungl.vulkan.khr.struct.VkVideoEncodeH264FrameSizeKHR.LAYOUT.withName("maxFrameSize")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_useMinQp = LAYOUT.byteOffset(PathElement.groupElement("useMinQp"));
    public static final long OFFSET_minQp = LAYOUT.byteOffset(PathElement.groupElement("minQp"));
    public static final long OFFSET_useMaxQp = LAYOUT.byteOffset(PathElement.groupElement("useMaxQp"));
    public static final long OFFSET_maxQp = LAYOUT.byteOffset(PathElement.groupElement("maxQp"));
    public static final long OFFSET_useMaxFrameSize = LAYOUT.byteOffset(PathElement.groupElement("useMaxFrameSize"));
    public static final long OFFSET_maxFrameSize = LAYOUT.byteOffset(PathElement.groupElement("maxFrameSize"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_useMinQp = LAYOUT.select(PathElement.groupElement("useMinQp"));
    public static final MemoryLayout LAYOUT_minQp = LAYOUT.select(PathElement.groupElement("minQp"));
    public static final MemoryLayout LAYOUT_useMaxQp = LAYOUT.select(PathElement.groupElement("useMaxQp"));
    public static final MemoryLayout LAYOUT_maxQp = LAYOUT.select(PathElement.groupElement("maxQp"));
    public static final MemoryLayout LAYOUT_useMaxFrameSize = LAYOUT.select(PathElement.groupElement("useMaxFrameSize"));
    public static final MemoryLayout LAYOUT_maxFrameSize = LAYOUT.select(PathElement.groupElement("maxFrameSize"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_useMinQp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useMinQp"));
    public static final VarHandle VH_minQp$qpI = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minQp"), PathElement.groupElement("qpI"));
    public static final VarHandle VH_minQp$qpP = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minQp"), PathElement.groupElement("qpP"));
    public static final VarHandle VH_minQp$qpB = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minQp"), PathElement.groupElement("qpB"));
    public static final VarHandle VH_useMaxQp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useMaxQp"));
    public static final VarHandle VH_maxQp$qpI = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQp"), PathElement.groupElement("qpI"));
    public static final VarHandle VH_maxQp$qpP = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQp"), PathElement.groupElement("qpP"));
    public static final VarHandle VH_maxQp$qpB = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQp"), PathElement.groupElement("qpB"));
    public static final VarHandle VH_useMaxFrameSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useMaxFrameSize"));
    public static final VarHandle VH_maxFrameSize$frameISize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFrameSize"), PathElement.groupElement("frameISize"));
    public static final VarHandle VH_maxFrameSize$framePSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFrameSize"), PathElement.groupElement("framePSize"));
    public static final VarHandle VH_maxFrameSize$frameBSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFrameSize"), PathElement.groupElement("frameBSize"));

    public VkVideoEncodeH264RateControlLayerInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeH264RateControlLayerInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264RateControlLayerInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeH264RateControlLayerInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264RateControlLayerInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeH264RateControlLayerInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264RateControlLayerInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeH264RateControlLayerInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264RateControlLayerInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeH264RateControlLayerInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH264RateControlLayerInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeH264RateControlLayerInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_KHR); }
    public static VkVideoEncodeH264RateControlLayerInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_KHR);
        return s;
    }
    public VkVideoEncodeH264RateControlLayerInfoKHR copyFrom(VkVideoEncodeH264RateControlLayerInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR reinterpret(long count) { return new VkVideoEncodeH264RateControlLayerInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeH264RateControlLayerInfoKHR asSlice(long index) { return new VkVideoEncodeH264RateControlLayerInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeH264RateControlLayerInfoKHR asSlice(long index, long count) { return new VkVideoEncodeH264RateControlLayerInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeH264RateControlLayerInfoKHR at(long index, Consumer<VkVideoEncodeH264RateControlLayerInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int useMinQpAt(long index) { return (int) VH_useMinQp.get(this.segment(), 0L, index); }
    public int minQp$qpIAt(long index) { return (int) VH_minQp$qpI.get(this.segment(), 0L, index); }
    public int minQp$qpPAt(long index) { return (int) VH_minQp$qpP.get(this.segment(), 0L, index); }
    public int minQp$qpBAt(long index) { return (int) VH_minQp$qpB.get(this.segment(), 0L, index); }
    public int useMaxQpAt(long index) { return (int) VH_useMaxQp.get(this.segment(), 0L, index); }
    public int maxQp$qpIAt(long index) { return (int) VH_maxQp$qpI.get(this.segment(), 0L, index); }
    public int maxQp$qpPAt(long index) { return (int) VH_maxQp$qpP.get(this.segment(), 0L, index); }
    public int maxQp$qpBAt(long index) { return (int) VH_maxQp$qpB.get(this.segment(), 0L, index); }
    public int useMaxFrameSizeAt(long index) { return (int) VH_useMaxFrameSize.get(this.segment(), 0L, index); }
    public int maxFrameSize$frameISizeAt(long index) { return (int) VH_maxFrameSize$frameISize.get(this.segment(), 0L, index); }
    public int maxFrameSize$framePSizeAt(long index) { return (int) VH_maxFrameSize$framePSize.get(this.segment(), 0L, index); }
    public int maxFrameSize$frameBSizeAt(long index) { return (int) VH_maxFrameSize$frameBSize.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int useMinQp() { return (int) VH_useMinQp.get(this.segment(), 0L, 0L); }
    public int minQp$qpI() { return (int) VH_minQp$qpI.get(this.segment(), 0L, 0L); }
    public int minQp$qpP() { return (int) VH_minQp$qpP.get(this.segment(), 0L, 0L); }
    public int minQp$qpB() { return (int) VH_minQp$qpB.get(this.segment(), 0L, 0L); }
    public int useMaxQp() { return (int) VH_useMaxQp.get(this.segment(), 0L, 0L); }
    public int maxQp$qpI() { return (int) VH_maxQp$qpI.get(this.segment(), 0L, 0L); }
    public int maxQp$qpP() { return (int) VH_maxQp$qpP.get(this.segment(), 0L, 0L); }
    public int maxQp$qpB() { return (int) VH_maxQp$qpB.get(this.segment(), 0L, 0L); }
    public int useMaxFrameSize() { return (int) VH_useMaxFrameSize.get(this.segment(), 0L, 0L); }
    public int maxFrameSize$frameISize() { return (int) VH_maxFrameSize$frameISize.get(this.segment(), 0L, 0L); }
    public int maxFrameSize$framePSize() { return (int) VH_maxFrameSize$framePSize.get(this.segment(), 0L, 0L); }
    public int maxFrameSize$frameBSize() { return (int) VH_maxFrameSize$frameBSize.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeH264RateControlLayerInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR useMinQpAt(long index, int value) { VH_useMinQp.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR minQp$qpIAt(long index, int value) { VH_minQp$qpI.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR minQp$qpPAt(long index, int value) { VH_minQp$qpP.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR minQp$qpBAt(long index, int value) { VH_minQp$qpB.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR useMaxQpAt(long index, int value) { VH_useMaxQp.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR maxQp$qpIAt(long index, int value) { VH_maxQp$qpI.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR maxQp$qpPAt(long index, int value) { VH_maxQp$qpP.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR maxQp$qpBAt(long index, int value) { VH_maxQp$qpB.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR useMaxFrameSizeAt(long index, int value) { VH_useMaxFrameSize.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR maxFrameSize$frameISizeAt(long index, int value) { VH_maxFrameSize$frameISize.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR maxFrameSize$framePSizeAt(long index, int value) { VH_maxFrameSize$framePSize.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR maxFrameSize$frameBSizeAt(long index, int value) { VH_maxFrameSize$frameBSize.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR useMinQp(int value) { VH_useMinQp.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR minQp$qpI(int value) { VH_minQp$qpI.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR minQp$qpP(int value) { VH_minQp$qpP.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR minQp$qpB(int value) { VH_minQp$qpB.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR useMaxQp(int value) { VH_useMaxQp.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR maxQp$qpI(int value) { VH_maxQp$qpI.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR maxQp$qpP(int value) { VH_maxQp$qpP.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR maxQp$qpB(int value) { VH_maxQp$qpB.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR useMaxFrameSize(int value) { VH_useMaxFrameSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR maxFrameSize$frameISize(int value) { VH_maxFrameSize$frameISize.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR maxFrameSize$framePSize(int value) { VH_maxFrameSize$framePSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR maxFrameSize$frameBSize(int value) { VH_maxFrameSize$frameBSize.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeH264RateControlLayerInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeH264RateControlLayerInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _useMinQpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_useMinQp, index), LAYOUT_useMinQp); }
    public MemorySegment _useMinQp() { return _useMinQpAt(0L); }
    public VkVideoEncodeH264RateControlLayerInfoKHR _useMinQpAt(long index, MemorySegment src) { _useMinQpAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR _useMinQp(MemorySegment src) { return _useMinQpAt(0L, src); }
    public MemorySegment _minQpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minQp, index), LAYOUT_minQp); }
    public MemorySegment _minQp() { return _minQpAt(0L); }
    public VkVideoEncodeH264RateControlLayerInfoKHR _minQpAt(long index, MemorySegment src) { _minQpAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR _minQp(MemorySegment src) { return _minQpAt(0L, src); }
    public MemorySegment _useMaxQpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_useMaxQp, index), LAYOUT_useMaxQp); }
    public MemorySegment _useMaxQp() { return _useMaxQpAt(0L); }
    public VkVideoEncodeH264RateControlLayerInfoKHR _useMaxQpAt(long index, MemorySegment src) { _useMaxQpAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR _useMaxQp(MemorySegment src) { return _useMaxQpAt(0L, src); }
    public MemorySegment _maxQpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxQp, index), LAYOUT_maxQp); }
    public MemorySegment _maxQp() { return _maxQpAt(0L); }
    public VkVideoEncodeH264RateControlLayerInfoKHR _maxQpAt(long index, MemorySegment src) { _maxQpAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR _maxQp(MemorySegment src) { return _maxQpAt(0L, src); }
    public MemorySegment _useMaxFrameSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_useMaxFrameSize, index), LAYOUT_useMaxFrameSize); }
    public MemorySegment _useMaxFrameSize() { return _useMaxFrameSizeAt(0L); }
    public VkVideoEncodeH264RateControlLayerInfoKHR _useMaxFrameSizeAt(long index, MemorySegment src) { _useMaxFrameSizeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR _useMaxFrameSize(MemorySegment src) { return _useMaxFrameSizeAt(0L, src); }
    public MemorySegment _maxFrameSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxFrameSize, index), LAYOUT_maxFrameSize); }
    public MemorySegment _maxFrameSize() { return _maxFrameSizeAt(0L); }
    public VkVideoEncodeH264RateControlLayerInfoKHR _maxFrameSizeAt(long index, MemorySegment src) { _maxFrameSizeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264RateControlLayerInfoKHR _maxFrameSize(MemorySegment src) { return _maxFrameSizeAt(0L, src); }
}
