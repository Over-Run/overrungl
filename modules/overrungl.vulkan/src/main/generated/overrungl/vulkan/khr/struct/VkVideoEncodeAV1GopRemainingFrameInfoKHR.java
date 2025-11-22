// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeAV1GopRemainingFrameInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeAV1GopRemainingFrameInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 useGopRemainingFrames;
///     uint32_t gopRemainingIntra;
///     uint32_t gopRemainingPredictive;
///     uint32_t gopRemainingBipredictive;
/// }
/// ```
public final class VkVideoEncodeAV1GopRemainingFrameInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("gopRemainingIntra"),
        ValueLayout.JAVA_INT.withName("gopRemainingPredictive"),
        ValueLayout.JAVA_INT.withName("gopRemainingBipredictive")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_useGopRemainingFrames = LAYOUT.byteOffset(PathElement.groupElement("useGopRemainingFrames"));
    public static final long OFFSET_gopRemainingIntra = LAYOUT.byteOffset(PathElement.groupElement("gopRemainingIntra"));
    public static final long OFFSET_gopRemainingPredictive = LAYOUT.byteOffset(PathElement.groupElement("gopRemainingPredictive"));
    public static final long OFFSET_gopRemainingBipredictive = LAYOUT.byteOffset(PathElement.groupElement("gopRemainingBipredictive"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_useGopRemainingFrames = LAYOUT.select(PathElement.groupElement("useGopRemainingFrames"));
    public static final MemoryLayout LAYOUT_gopRemainingIntra = LAYOUT.select(PathElement.groupElement("gopRemainingIntra"));
    public static final MemoryLayout LAYOUT_gopRemainingPredictive = LAYOUT.select(PathElement.groupElement("gopRemainingPredictive"));
    public static final MemoryLayout LAYOUT_gopRemainingBipredictive = LAYOUT.select(PathElement.groupElement("gopRemainingBipredictive"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_useGopRemainingFrames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useGopRemainingFrames"));
    public static final VarHandle VH_gopRemainingIntra = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopRemainingIntra"));
    public static final VarHandle VH_gopRemainingPredictive = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopRemainingPredictive"));
    public static final VarHandle VH_gopRemainingBipredictive = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopRemainingBipredictive"));

    public VkVideoEncodeAV1GopRemainingFrameInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1GopRemainingFrameInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1GopRemainingFrameInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1GopRemainingFrameInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeAv1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_GOP_REMAINING_FRAME_INFO_KHR); }
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeAv1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_GOP_REMAINING_FRAME_INFO_KHR);
        return s;
    }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR copyFrom(VkVideoEncodeAV1GopRemainingFrameInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR reinterpret(long count) { return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR asSlice(long index) { return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR asSlice(long index, long count) { return new VkVideoEncodeAV1GopRemainingFrameInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR at(long index, Consumer<VkVideoEncodeAV1GopRemainingFrameInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int useGopRemainingFramesAt(long index) { return (int) VH_useGopRemainingFrames.get(this.segment(), 0L, index); }
    public int gopRemainingIntraAt(long index) { return (int) VH_gopRemainingIntra.get(this.segment(), 0L, index); }
    public int gopRemainingPredictiveAt(long index) { return (int) VH_gopRemainingPredictive.get(this.segment(), 0L, index); }
    public int gopRemainingBipredictiveAt(long index) { return (int) VH_gopRemainingBipredictive.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int useGopRemainingFrames() { return (int) VH_useGopRemainingFrames.get(this.segment(), 0L, 0L); }
    public int gopRemainingIntra() { return (int) VH_gopRemainingIntra.get(this.segment(), 0L, 0L); }
    public int gopRemainingPredictive() { return (int) VH_gopRemainingPredictive.get(this.segment(), 0L, 0L); }
    public int gopRemainingBipredictive() { return (int) VH_gopRemainingBipredictive.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR useGopRemainingFramesAt(long index, int value) { VH_useGopRemainingFrames.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR gopRemainingIntraAt(long index, int value) { VH_gopRemainingIntra.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR gopRemainingPredictiveAt(long index, int value) { VH_gopRemainingPredictive.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR gopRemainingBipredictiveAt(long index, int value) { VH_gopRemainingBipredictive.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR useGopRemainingFrames(int value) { VH_useGopRemainingFrames.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR gopRemainingIntra(int value) { VH_gopRemainingIntra.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR gopRemainingPredictive(int value) { VH_gopRemainingPredictive.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR gopRemainingBipredictive(int value) { VH_gopRemainingBipredictive.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _useGopRemainingFramesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_useGopRemainingFrames, index), LAYOUT_useGopRemainingFrames); }
    public MemorySegment _useGopRemainingFrames() { return _useGopRemainingFramesAt(0L); }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR _useGopRemainingFramesAt(long index, MemorySegment src) { _useGopRemainingFramesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR _useGopRemainingFrames(MemorySegment src) { return _useGopRemainingFramesAt(0L, src); }
    public MemorySegment _gopRemainingIntraAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_gopRemainingIntra, index), LAYOUT_gopRemainingIntra); }
    public MemorySegment _gopRemainingIntra() { return _gopRemainingIntraAt(0L); }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR _gopRemainingIntraAt(long index, MemorySegment src) { _gopRemainingIntraAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR _gopRemainingIntra(MemorySegment src) { return _gopRemainingIntraAt(0L, src); }
    public MemorySegment _gopRemainingPredictiveAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_gopRemainingPredictive, index), LAYOUT_gopRemainingPredictive); }
    public MemorySegment _gopRemainingPredictive() { return _gopRemainingPredictiveAt(0L); }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR _gopRemainingPredictiveAt(long index, MemorySegment src) { _gopRemainingPredictiveAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR _gopRemainingPredictive(MemorySegment src) { return _gopRemainingPredictiveAt(0L, src); }
    public MemorySegment _gopRemainingBipredictiveAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_gopRemainingBipredictive, index), LAYOUT_gopRemainingBipredictive); }
    public MemorySegment _gopRemainingBipredictive() { return _gopRemainingBipredictiveAt(0L); }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR _gopRemainingBipredictiveAt(long index, MemorySegment src) { _gopRemainingBipredictiveAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR _gopRemainingBipredictive(MemorySegment src) { return _gopRemainingBipredictiveAt(0L, src); }
}
