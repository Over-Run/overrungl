// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoDecodeH265InlineSessionParametersInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoDecodeH265InlineSessionParametersInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     const StdVideoH265VideoParameterSet* pStdVPS;
///     const StdVideoH265SequenceParameterSet* pStdSPS;
///     const StdVideoH265PictureParameterSet* pStdPPS;
/// }
/// ```
public final class VkVideoDecodeH265InlineSessionParametersInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pStdVPS"),
        ValueLayout.ADDRESS.withName("pStdSPS"),
        ValueLayout.ADDRESS.withName("pStdPPS")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pStdVPS = LAYOUT.byteOffset(PathElement.groupElement("pStdVPS"));
    public static final long OFFSET_pStdSPS = LAYOUT.byteOffset(PathElement.groupElement("pStdSPS"));
    public static final long OFFSET_pStdPPS = LAYOUT.byteOffset(PathElement.groupElement("pStdPPS"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pStdVPS = LAYOUT.select(PathElement.groupElement("pStdVPS"));
    public static final MemoryLayout LAYOUT_pStdSPS = LAYOUT.select(PathElement.groupElement("pStdSPS"));
    public static final MemoryLayout LAYOUT_pStdPPS = LAYOUT.select(PathElement.groupElement("pStdPPS"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pStdVPS = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdVPS"));
    public static final VarHandle VH_pStdSPS = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdSPS"));
    public static final VarHandle VH_pStdPPS = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPPS"));

    public VkVideoDecodeH265InlineSessionParametersInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoDecodeH265InlineSessionParametersInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265InlineSessionParametersInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoDecodeH265InlineSessionParametersInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265InlineSessionParametersInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoDecodeH265InlineSessionParametersInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265InlineSessionParametersInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoDecodeH265InlineSessionParametersInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeH265InlineSessionParametersInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoDecodeH265InlineSessionParametersInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeH265InlineSessionParametersInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoDecodeH265InlineSessionParametersInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoMaintenance2.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_INLINE_SESSION_PARAMETERS_INFO_KHR); }
    public static VkVideoDecodeH265InlineSessionParametersInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoMaintenance2.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_INLINE_SESSION_PARAMETERS_INFO_KHR);
        return s;
    }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR copyFrom(VkVideoDecodeH265InlineSessionParametersInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR reinterpret(long count) { return new VkVideoDecodeH265InlineSessionParametersInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR asSlice(long index) { return new VkVideoDecodeH265InlineSessionParametersInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR asSlice(long index, long count) { return new VkVideoDecodeH265InlineSessionParametersInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR at(long index, Consumer<VkVideoDecodeH265InlineSessionParametersInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pStdVPSAt(long index) { return (MemorySegment) VH_pStdVPS.get(this.segment(), 0L, index); }
    public MemorySegment pStdSPSAt(long index) { return (MemorySegment) VH_pStdSPS.get(this.segment(), 0L, index); }
    public MemorySegment pStdPPSAt(long index) { return (MemorySegment) VH_pStdPPS.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pStdVPS() { return (MemorySegment) VH_pStdVPS.get(this.segment(), 0L, 0L); }
    public MemorySegment pStdSPS() { return (MemorySegment) VH_pStdSPS.get(this.segment(), 0L, 0L); }
    public MemorySegment pStdPPS() { return (MemorySegment) VH_pStdPPS.get(this.segment(), 0L, 0L); }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR pStdVPSAt(long index, MemorySegment value) { VH_pStdVPS.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR pStdSPSAt(long index, MemorySegment value) { VH_pStdSPS.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR pStdPPSAt(long index, MemorySegment value) { VH_pStdPPS.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR pStdVPS(MemorySegment value) { VH_pStdVPS.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR pStdSPS(MemorySegment value) { VH_pStdSPS.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR pStdPPS(MemorySegment value) { VH_pStdPPS.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pStdVPSAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStdVPS, index), LAYOUT_pStdVPS); }
    public MemorySegment _pStdVPS() { return _pStdVPSAt(0L); }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR _pStdVPSAt(long index, MemorySegment src) { _pStdVPSAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR _pStdVPS(MemorySegment src) { return _pStdVPSAt(0L, src); }
    public MemorySegment _pStdSPSAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStdSPS, index), LAYOUT_pStdSPS); }
    public MemorySegment _pStdSPS() { return _pStdSPSAt(0L); }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR _pStdSPSAt(long index, MemorySegment src) { _pStdSPSAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR _pStdSPS(MemorySegment src) { return _pStdSPSAt(0L, src); }
    public MemorySegment _pStdPPSAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStdPPS, index), LAYOUT_pStdPPS); }
    public MemorySegment _pStdPPS() { return _pStdPPSAt(0L); }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR _pStdPPSAt(long index, MemorySegment src) { _pStdPPSAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265InlineSessionParametersInfoKHR _pStdPPS(MemorySegment src) { return _pStdPPSAt(0L, src); }
}
