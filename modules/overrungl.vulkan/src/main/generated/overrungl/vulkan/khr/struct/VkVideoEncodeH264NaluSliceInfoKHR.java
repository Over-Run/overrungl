// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeH264NaluSliceInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH264NaluSliceInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     int32_t constantQp;
///     const StdVideoEncodeH264SliceHeader* pStdSliceHeader;
/// }
/// ```
public final class VkVideoEncodeH264NaluSliceInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("constantQp"),
        ValueLayout.ADDRESS.withName("pStdSliceHeader")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_constantQp = LAYOUT.byteOffset(PathElement.groupElement("constantQp"));
    public static final long OFFSET_pStdSliceHeader = LAYOUT.byteOffset(PathElement.groupElement("pStdSliceHeader"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_constantQp = LAYOUT.select(PathElement.groupElement("constantQp"));
    public static final MemoryLayout LAYOUT_pStdSliceHeader = LAYOUT.select(PathElement.groupElement("pStdSliceHeader"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_constantQp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constantQp"));
    public static final VarHandle VH_pStdSliceHeader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdSliceHeader"));

    public VkVideoEncodeH264NaluSliceInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeH264NaluSliceInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264NaluSliceInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeH264NaluSliceInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264NaluSliceInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeH264NaluSliceInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264NaluSliceInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeH264NaluSliceInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264NaluSliceInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeH264NaluSliceInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH264NaluSliceInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeH264NaluSliceInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_INFO_KHR); }
    public static VkVideoEncodeH264NaluSliceInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_INFO_KHR);
        return s;
    }
    public VkVideoEncodeH264NaluSliceInfoKHR copyFrom(VkVideoEncodeH264NaluSliceInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeH264NaluSliceInfoKHR reinterpret(long count) { return new VkVideoEncodeH264NaluSliceInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeH264NaluSliceInfoKHR asSlice(long index) { return new VkVideoEncodeH264NaluSliceInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeH264NaluSliceInfoKHR asSlice(long index, long count) { return new VkVideoEncodeH264NaluSliceInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeH264NaluSliceInfoKHR at(long index, Consumer<VkVideoEncodeH264NaluSliceInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int constantQpAt(long index) { return (int) VH_constantQp.get(this.segment(), 0L, index); }
    public MemorySegment pStdSliceHeaderAt(long index) { return (MemorySegment) VH_pStdSliceHeader.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int constantQp() { return (int) VH_constantQp.get(this.segment(), 0L, 0L); }
    public MemorySegment pStdSliceHeader() { return (MemorySegment) VH_pStdSliceHeader.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeH264NaluSliceInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264NaluSliceInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264NaluSliceInfoKHR constantQpAt(long index, int value) { VH_constantQp.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264NaluSliceInfoKHR pStdSliceHeaderAt(long index, MemorySegment value) { VH_pStdSliceHeader.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264NaluSliceInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264NaluSliceInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264NaluSliceInfoKHR constantQp(int value) { VH_constantQp.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264NaluSliceInfoKHR pStdSliceHeader(MemorySegment value) { VH_pStdSliceHeader.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeH264NaluSliceInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264NaluSliceInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeH264NaluSliceInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264NaluSliceInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _constantQpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_constantQp, index), LAYOUT_constantQp); }
    public MemorySegment _constantQp() { return _constantQpAt(0L); }
    public VkVideoEncodeH264NaluSliceInfoKHR _constantQpAt(long index, MemorySegment src) { _constantQpAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264NaluSliceInfoKHR _constantQp(MemorySegment src) { return _constantQpAt(0L, src); }
    public MemorySegment _pStdSliceHeaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStdSliceHeader, index), LAYOUT_pStdSliceHeader); }
    public MemorySegment _pStdSliceHeader() { return _pStdSliceHeaderAt(0L); }
    public VkVideoEncodeH264NaluSliceInfoKHR _pStdSliceHeaderAt(long index, MemorySegment src) { _pStdSliceHeaderAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264NaluSliceInfoKHR _pStdSliceHeader(MemorySegment src) { return _pStdSliceHeaderAt(0L, src); }
}
