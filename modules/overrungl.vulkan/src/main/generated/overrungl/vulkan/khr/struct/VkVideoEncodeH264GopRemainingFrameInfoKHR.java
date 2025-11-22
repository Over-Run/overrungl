// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeH264GopRemainingFrameInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH264GopRemainingFrameInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 useGopRemainingFrames;
///     uint32_t gopRemainingI;
///     uint32_t gopRemainingP;
///     uint32_t gopRemainingB;
/// }
/// ```
public final class VkVideoEncodeH264GopRemainingFrameInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("gopRemainingI"),
        ValueLayout.JAVA_INT.withName("gopRemainingP"),
        ValueLayout.JAVA_INT.withName("gopRemainingB")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_useGopRemainingFrames = LAYOUT.byteOffset(PathElement.groupElement("useGopRemainingFrames"));
    public static final long OFFSET_gopRemainingI = LAYOUT.byteOffset(PathElement.groupElement("gopRemainingI"));
    public static final long OFFSET_gopRemainingP = LAYOUT.byteOffset(PathElement.groupElement("gopRemainingP"));
    public static final long OFFSET_gopRemainingB = LAYOUT.byteOffset(PathElement.groupElement("gopRemainingB"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_useGopRemainingFrames = LAYOUT.select(PathElement.groupElement("useGopRemainingFrames"));
    public static final MemoryLayout LAYOUT_gopRemainingI = LAYOUT.select(PathElement.groupElement("gopRemainingI"));
    public static final MemoryLayout LAYOUT_gopRemainingP = LAYOUT.select(PathElement.groupElement("gopRemainingP"));
    public static final MemoryLayout LAYOUT_gopRemainingB = LAYOUT.select(PathElement.groupElement("gopRemainingB"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_useGopRemainingFrames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useGopRemainingFrames"));
    public static final VarHandle VH_gopRemainingI = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopRemainingI"));
    public static final VarHandle VH_gopRemainingP = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopRemainingP"));
    public static final VarHandle VH_gopRemainingB = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gopRemainingB"));

    public VkVideoEncodeH264GopRemainingFrameInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeH264GopRemainingFrameInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264GopRemainingFrameInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeH264GopRemainingFrameInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264GopRemainingFrameInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeH264GopRemainingFrameInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264GopRemainingFrameInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeH264GopRemainingFrameInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264GopRemainingFrameInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeH264GopRemainingFrameInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH264GopRemainingFrameInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeH264GopRemainingFrameInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_GOP_REMAINING_FRAME_INFO_KHR); }
    public static VkVideoEncodeH264GopRemainingFrameInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_GOP_REMAINING_FRAME_INFO_KHR);
        return s;
    }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR copyFrom(VkVideoEncodeH264GopRemainingFrameInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR reinterpret(long count) { return new VkVideoEncodeH264GopRemainingFrameInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR asSlice(long index) { return new VkVideoEncodeH264GopRemainingFrameInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR asSlice(long index, long count) { return new VkVideoEncodeH264GopRemainingFrameInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR at(long index, Consumer<VkVideoEncodeH264GopRemainingFrameInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int useGopRemainingFramesAt(long index) { return (int) VH_useGopRemainingFrames.get(this.segment(), 0L, index); }
    public int gopRemainingIAt(long index) { return (int) VH_gopRemainingI.get(this.segment(), 0L, index); }
    public int gopRemainingPAt(long index) { return (int) VH_gopRemainingP.get(this.segment(), 0L, index); }
    public int gopRemainingBAt(long index) { return (int) VH_gopRemainingB.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int useGopRemainingFrames() { return (int) VH_useGopRemainingFrames.get(this.segment(), 0L, 0L); }
    public int gopRemainingI() { return (int) VH_gopRemainingI.get(this.segment(), 0L, 0L); }
    public int gopRemainingP() { return (int) VH_gopRemainingP.get(this.segment(), 0L, 0L); }
    public int gopRemainingB() { return (int) VH_gopRemainingB.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR useGopRemainingFramesAt(long index, int value) { VH_useGopRemainingFrames.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR gopRemainingIAt(long index, int value) { VH_gopRemainingI.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR gopRemainingPAt(long index, int value) { VH_gopRemainingP.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR gopRemainingBAt(long index, int value) { VH_gopRemainingB.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR useGopRemainingFrames(int value) { VH_useGopRemainingFrames.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR gopRemainingI(int value) { VH_gopRemainingI.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR gopRemainingP(int value) { VH_gopRemainingP.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR gopRemainingB(int value) { VH_gopRemainingB.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _useGopRemainingFramesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_useGopRemainingFrames, index), LAYOUT_useGopRemainingFrames); }
    public MemorySegment _useGopRemainingFrames() { return _useGopRemainingFramesAt(0L); }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR _useGopRemainingFramesAt(long index, MemorySegment src) { _useGopRemainingFramesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR _useGopRemainingFrames(MemorySegment src) { return _useGopRemainingFramesAt(0L, src); }
    public MemorySegment _gopRemainingIAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_gopRemainingI, index), LAYOUT_gopRemainingI); }
    public MemorySegment _gopRemainingI() { return _gopRemainingIAt(0L); }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR _gopRemainingIAt(long index, MemorySegment src) { _gopRemainingIAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR _gopRemainingI(MemorySegment src) { return _gopRemainingIAt(0L, src); }
    public MemorySegment _gopRemainingPAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_gopRemainingP, index), LAYOUT_gopRemainingP); }
    public MemorySegment _gopRemainingP() { return _gopRemainingPAt(0L); }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR _gopRemainingPAt(long index, MemorySegment src) { _gopRemainingPAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR _gopRemainingP(MemorySegment src) { return _gopRemainingPAt(0L, src); }
    public MemorySegment _gopRemainingBAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_gopRemainingB, index), LAYOUT_gopRemainingB); }
    public MemorySegment _gopRemainingB() { return _gopRemainingBAt(0L); }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR _gopRemainingBAt(long index, MemorySegment src) { _gopRemainingBAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264GopRemainingFrameInfoKHR _gopRemainingB(MemorySegment src) { return _gopRemainingBAt(0L, src); }
}
