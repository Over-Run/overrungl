// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeH265PictureInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH265PictureInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t naluSliceSegmentEntryCount;
///     const VkVideoEncodeH265NaluSliceSegmentInfoKHR* pNaluSliceSegmentEntries;
///     const StdVideoEncodeH265PictureInfo* pStdPictureInfo;
/// }
/// ```
public final class VkVideoEncodeH265PictureInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("naluSliceSegmentEntryCount"),
        ValueLayout.ADDRESS.withName("pNaluSliceSegmentEntries"),
        ValueLayout.ADDRESS.withName("pStdPictureInfo")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_naluSliceSegmentEntryCount = LAYOUT.byteOffset(PathElement.groupElement("naluSliceSegmentEntryCount"));
    public static final long OFFSET_pNaluSliceSegmentEntries = LAYOUT.byteOffset(PathElement.groupElement("pNaluSliceSegmentEntries"));
    public static final long OFFSET_pStdPictureInfo = LAYOUT.byteOffset(PathElement.groupElement("pStdPictureInfo"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_naluSliceSegmentEntryCount = LAYOUT.select(PathElement.groupElement("naluSliceSegmentEntryCount"));
    public static final MemoryLayout LAYOUT_pNaluSliceSegmentEntries = LAYOUT.select(PathElement.groupElement("pNaluSliceSegmentEntries"));
    public static final MemoryLayout LAYOUT_pStdPictureInfo = LAYOUT.select(PathElement.groupElement("pStdPictureInfo"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_naluSliceSegmentEntryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("naluSliceSegmentEntryCount"));
    public static final VarHandle VH_pNaluSliceSegmentEntries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNaluSliceSegmentEntries"));
    public static final VarHandle VH_pStdPictureInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPictureInfo"));

    public VkVideoEncodeH265PictureInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeH265PictureInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265PictureInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeH265PictureInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265PictureInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeH265PictureInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265PictureInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeH265PictureInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265PictureInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeH265PictureInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265PictureInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeH265PictureInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_KHR); }
    public static VkVideoEncodeH265PictureInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_KHR);
        return s;
    }
    public VkVideoEncodeH265PictureInfoKHR copyFrom(VkVideoEncodeH265PictureInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeH265PictureInfoKHR reinterpret(long count) { return new VkVideoEncodeH265PictureInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeH265PictureInfoKHR asSlice(long index) { return new VkVideoEncodeH265PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeH265PictureInfoKHR asSlice(long index, long count) { return new VkVideoEncodeH265PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeH265PictureInfoKHR at(long index, Consumer<VkVideoEncodeH265PictureInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int naluSliceSegmentEntryCountAt(long index) { return (int) VH_naluSliceSegmentEntryCount.get(this.segment(), 0L, index); }
    public MemorySegment pNaluSliceSegmentEntriesAt(long index) { return (MemorySegment) VH_pNaluSliceSegmentEntries.get(this.segment(), 0L, index); }
    public MemorySegment pStdPictureInfoAt(long index) { return (MemorySegment) VH_pStdPictureInfo.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int naluSliceSegmentEntryCount() { return (int) VH_naluSliceSegmentEntryCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pNaluSliceSegmentEntries() { return (MemorySegment) VH_pNaluSliceSegmentEntries.get(this.segment(), 0L, 0L); }
    public MemorySegment pStdPictureInfo() { return (MemorySegment) VH_pStdPictureInfo.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeH265PictureInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265PictureInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265PictureInfoKHR naluSliceSegmentEntryCountAt(long index, int value) { VH_naluSliceSegmentEntryCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265PictureInfoKHR pNaluSliceSegmentEntriesAt(long index, MemorySegment value) { VH_pNaluSliceSegmentEntries.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265PictureInfoKHR pStdPictureInfoAt(long index, MemorySegment value) { VH_pStdPictureInfo.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265PictureInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265PictureInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265PictureInfoKHR naluSliceSegmentEntryCount(int value) { VH_naluSliceSegmentEntryCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265PictureInfoKHR pNaluSliceSegmentEntries(MemorySegment value) { VH_pNaluSliceSegmentEntries.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265PictureInfoKHR pStdPictureInfo(MemorySegment value) { VH_pStdPictureInfo.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeH265PictureInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265PictureInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeH265PictureInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265PictureInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _naluSliceSegmentEntryCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_naluSliceSegmentEntryCount, index), LAYOUT_naluSliceSegmentEntryCount); }
    public MemorySegment _naluSliceSegmentEntryCount() { return _naluSliceSegmentEntryCountAt(0L); }
    public VkVideoEncodeH265PictureInfoKHR _naluSliceSegmentEntryCountAt(long index, MemorySegment src) { _naluSliceSegmentEntryCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265PictureInfoKHR _naluSliceSegmentEntryCount(MemorySegment src) { return _naluSliceSegmentEntryCountAt(0L, src); }
    public MemorySegment _pNaluSliceSegmentEntriesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNaluSliceSegmentEntries, index), LAYOUT_pNaluSliceSegmentEntries); }
    public MemorySegment _pNaluSliceSegmentEntries() { return _pNaluSliceSegmentEntriesAt(0L); }
    public VkVideoEncodeH265PictureInfoKHR _pNaluSliceSegmentEntriesAt(long index, MemorySegment src) { _pNaluSliceSegmentEntriesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265PictureInfoKHR _pNaluSliceSegmentEntries(MemorySegment src) { return _pNaluSliceSegmentEntriesAt(0L, src); }
    public MemorySegment _pStdPictureInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStdPictureInfo, index), LAYOUT_pStdPictureInfo); }
    public MemorySegment _pStdPictureInfo() { return _pStdPictureInfoAt(0L); }
    public VkVideoEncodeH265PictureInfoKHR _pStdPictureInfoAt(long index, MemorySegment src) { _pStdPictureInfoAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265PictureInfoKHR _pStdPictureInfo(MemorySegment src) { return _pStdPictureInfoAt(0L, src); }
}
