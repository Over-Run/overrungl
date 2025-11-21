// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoDecodeAV1InlineSessionParametersInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoDecodeAV1InlineSessionParametersInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     const StdVideoAV1SequenceHeader* pStdSequenceHeader;
/// }
/// ```
public final class VkVideoDecodeAV1InlineSessionParametersInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pStdSequenceHeader")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pStdSequenceHeader = LAYOUT.byteOffset(PathElement.groupElement("pStdSequenceHeader"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pStdSequenceHeader = LAYOUT.select(PathElement.groupElement("pStdSequenceHeader"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pStdSequenceHeader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdSequenceHeader"));

    public VkVideoDecodeAV1InlineSessionParametersInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoDecodeAV1InlineSessionParametersInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeAV1InlineSessionParametersInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoDecodeAV1InlineSessionParametersInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeAV1InlineSessionParametersInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoDecodeAV1InlineSessionParametersInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeAV1InlineSessionParametersInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoDecodeAV1InlineSessionParametersInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeAV1InlineSessionParametersInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoDecodeAV1InlineSessionParametersInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeAV1InlineSessionParametersInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoDecodeAV1InlineSessionParametersInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoMaintenance2.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_INLINE_SESSION_PARAMETERS_INFO_KHR); }
    public static VkVideoDecodeAV1InlineSessionParametersInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoMaintenance2.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_INLINE_SESSION_PARAMETERS_INFO_KHR);
        return s;
    }
    public VkVideoDecodeAV1InlineSessionParametersInfoKHR copyFrom(VkVideoDecodeAV1InlineSessionParametersInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoDecodeAV1InlineSessionParametersInfoKHR reinterpret(long count) { return new VkVideoDecodeAV1InlineSessionParametersInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoDecodeAV1InlineSessionParametersInfoKHR asSlice(long index) { return new VkVideoDecodeAV1InlineSessionParametersInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoDecodeAV1InlineSessionParametersInfoKHR asSlice(long index, long count) { return new VkVideoDecodeAV1InlineSessionParametersInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoDecodeAV1InlineSessionParametersInfoKHR at(long index, Consumer<VkVideoDecodeAV1InlineSessionParametersInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pStdSequenceHeaderAt(long index) { return (MemorySegment) VH_pStdSequenceHeader.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pStdSequenceHeader() { return (MemorySegment) VH_pStdSequenceHeader.get(this.segment(), 0L, 0L); }
    public VkVideoDecodeAV1InlineSessionParametersInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeAV1InlineSessionParametersInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeAV1InlineSessionParametersInfoKHR pStdSequenceHeaderAt(long index, MemorySegment value) { VH_pStdSequenceHeader.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeAV1InlineSessionParametersInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeAV1InlineSessionParametersInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeAV1InlineSessionParametersInfoKHR pStdSequenceHeader(MemorySegment value) { VH_pStdSequenceHeader.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoDecodeAV1InlineSessionParametersInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoDecodeAV1InlineSessionParametersInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoDecodeAV1InlineSessionParametersInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoDecodeAV1InlineSessionParametersInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pStdSequenceHeaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStdSequenceHeader, index), LAYOUT_pStdSequenceHeader); }
    public MemorySegment _pStdSequenceHeader() { return _pStdSequenceHeaderAt(0L); }
    public VkVideoDecodeAV1InlineSessionParametersInfoKHR _pStdSequenceHeaderAt(long index, MemorySegment src) { _pStdSequenceHeaderAt(index).copyFrom(src); return this; }
    public VkVideoDecodeAV1InlineSessionParametersInfoKHR _pStdSequenceHeader(MemorySegment src) { return _pStdSequenceHeaderAt(0L, src); }
}
