// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeH265NaluSliceSegmentInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH265NaluSliceSegmentInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     int32_t constantQp;
///     const StdVideoEncodeH265SliceSegmentHeader* pStdSliceSegmentHeader;
/// }
/// ```
public final class VkVideoEncodeH265NaluSliceSegmentInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("constantQp"),
        ValueLayout.ADDRESS.withName("pStdSliceSegmentHeader")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_constantQp = LAYOUT.byteOffset(PathElement.groupElement("constantQp"));
    public static final long OFFSET_pStdSliceSegmentHeader = LAYOUT.byteOffset(PathElement.groupElement("pStdSliceSegmentHeader"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_constantQp = LAYOUT.select(PathElement.groupElement("constantQp"));
    public static final MemoryLayout LAYOUT_pStdSliceSegmentHeader = LAYOUT.select(PathElement.groupElement("pStdSliceSegmentHeader"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_constantQp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constantQp"));
    public static final VarHandle VH_pStdSliceSegmentHeader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdSliceSegmentHeader"));

    public VkVideoEncodeH265NaluSliceSegmentInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265NaluSliceSegmentInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265NaluSliceSegmentInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265NaluSliceSegmentInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_KHR); }
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_KHR);
        return s;
    }
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR copyFrom(VkVideoEncodeH265NaluSliceSegmentInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR reinterpret(long count) { return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR asSlice(long index) { return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR asSlice(long index, long count) { return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR at(long index, Consumer<VkVideoEncodeH265NaluSliceSegmentInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int constantQpAt(long index) { return (int) VH_constantQp.get(this.segment(), 0L, index); }
    public MemorySegment pStdSliceSegmentHeaderAt(long index) { return (MemorySegment) VH_pStdSliceSegmentHeader.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int constantQp() { return (int) VH_constantQp.get(this.segment(), 0L, 0L); }
    public MemorySegment pStdSliceSegmentHeader() { return (MemorySegment) VH_pStdSliceSegmentHeader.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR constantQpAt(long index, int value) { VH_constantQp.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR pStdSliceSegmentHeaderAt(long index, MemorySegment value) { VH_pStdSliceSegmentHeader.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR constantQp(int value) { VH_constantQp.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR pStdSliceSegmentHeader(MemorySegment value) { VH_pStdSliceSegmentHeader.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _constantQpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_constantQp, index), LAYOUT_constantQp); }
    public MemorySegment _constantQp() { return _constantQpAt(0L); }
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR _constantQpAt(long index, MemorySegment src) { _constantQpAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR _constantQp(MemorySegment src) { return _constantQpAt(0L, src); }
    public MemorySegment _pStdSliceSegmentHeaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStdSliceSegmentHeader, index), LAYOUT_pStdSliceSegmentHeader); }
    public MemorySegment _pStdSliceSegmentHeader() { return _pStdSliceSegmentHeaderAt(0L); }
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR _pStdSliceSegmentHeaderAt(long index, MemorySegment src) { _pStdSliceSegmentHeaderAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR _pStdSliceSegmentHeader(MemorySegment src) { return _pStdSliceSegmentHeaderAt(0L, src); }
}
