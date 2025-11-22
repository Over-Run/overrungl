// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoDecodeH265PictureInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoDecodeH265PictureInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     const StdVideoDecodeH265PictureInfo* pStdPictureInfo;
///     uint32_t sliceSegmentCount;
///     const uint32_t* pSliceSegmentOffsets;
/// }
/// ```
public final class VkVideoDecodeH265PictureInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pStdPictureInfo"),
        ValueLayout.JAVA_INT.withName("sliceSegmentCount"),
        ValueLayout.ADDRESS.withName("pSliceSegmentOffsets")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pStdPictureInfo = LAYOUT.byteOffset(PathElement.groupElement("pStdPictureInfo"));
    public static final long OFFSET_sliceSegmentCount = LAYOUT.byteOffset(PathElement.groupElement("sliceSegmentCount"));
    public static final long OFFSET_pSliceSegmentOffsets = LAYOUT.byteOffset(PathElement.groupElement("pSliceSegmentOffsets"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pStdPictureInfo = LAYOUT.select(PathElement.groupElement("pStdPictureInfo"));
    public static final MemoryLayout LAYOUT_sliceSegmentCount = LAYOUT.select(PathElement.groupElement("sliceSegmentCount"));
    public static final MemoryLayout LAYOUT_pSliceSegmentOffsets = LAYOUT.select(PathElement.groupElement("pSliceSegmentOffsets"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pStdPictureInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPictureInfo"));
    public static final VarHandle VH_sliceSegmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sliceSegmentCount"));
    public static final VarHandle VH_pSliceSegmentOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSliceSegmentOffsets"));

    public VkVideoDecodeH265PictureInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoDecodeH265PictureInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265PictureInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoDecodeH265PictureInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265PictureInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoDecodeH265PictureInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265PictureInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoDecodeH265PictureInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeH265PictureInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoDecodeH265PictureInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeH265PictureInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoDecodeH265PictureInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_KHR); }
    public static VkVideoDecodeH265PictureInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_KHR);
        return s;
    }
    public VkVideoDecodeH265PictureInfoKHR copyFrom(VkVideoDecodeH265PictureInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoDecodeH265PictureInfoKHR reinterpret(long count) { return new VkVideoDecodeH265PictureInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoDecodeH265PictureInfoKHR asSlice(long index) { return new VkVideoDecodeH265PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoDecodeH265PictureInfoKHR asSlice(long index, long count) { return new VkVideoDecodeH265PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoDecodeH265PictureInfoKHR at(long index, Consumer<VkVideoDecodeH265PictureInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pStdPictureInfoAt(long index) { return (MemorySegment) VH_pStdPictureInfo.get(this.segment(), 0L, index); }
    public int sliceSegmentCountAt(long index) { return (int) VH_sliceSegmentCount.get(this.segment(), 0L, index); }
    public MemorySegment pSliceSegmentOffsetsAt(long index) { return (MemorySegment) VH_pSliceSegmentOffsets.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pStdPictureInfo() { return (MemorySegment) VH_pStdPictureInfo.get(this.segment(), 0L, 0L); }
    public int sliceSegmentCount() { return (int) VH_sliceSegmentCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pSliceSegmentOffsets() { return (MemorySegment) VH_pSliceSegmentOffsets.get(this.segment(), 0L, 0L); }
    public VkVideoDecodeH265PictureInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265PictureInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265PictureInfoKHR pStdPictureInfoAt(long index, MemorySegment value) { VH_pStdPictureInfo.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265PictureInfoKHR sliceSegmentCountAt(long index, int value) { VH_sliceSegmentCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265PictureInfoKHR pSliceSegmentOffsetsAt(long index, MemorySegment value) { VH_pSliceSegmentOffsets.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265PictureInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH265PictureInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH265PictureInfoKHR pStdPictureInfo(MemorySegment value) { VH_pStdPictureInfo.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH265PictureInfoKHR sliceSegmentCount(int value) { VH_sliceSegmentCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH265PictureInfoKHR pSliceSegmentOffsets(MemorySegment value) { VH_pSliceSegmentOffsets.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoDecodeH265PictureInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265PictureInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoDecodeH265PictureInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265PictureInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pStdPictureInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStdPictureInfo, index), LAYOUT_pStdPictureInfo); }
    public MemorySegment _pStdPictureInfo() { return _pStdPictureInfoAt(0L); }
    public VkVideoDecodeH265PictureInfoKHR _pStdPictureInfoAt(long index, MemorySegment src) { _pStdPictureInfoAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265PictureInfoKHR _pStdPictureInfo(MemorySegment src) { return _pStdPictureInfoAt(0L, src); }
    public MemorySegment _sliceSegmentCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sliceSegmentCount, index), LAYOUT_sliceSegmentCount); }
    public MemorySegment _sliceSegmentCount() { return _sliceSegmentCountAt(0L); }
    public VkVideoDecodeH265PictureInfoKHR _sliceSegmentCountAt(long index, MemorySegment src) { _sliceSegmentCountAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265PictureInfoKHR _sliceSegmentCount(MemorySegment src) { return _sliceSegmentCountAt(0L, src); }
    public MemorySegment _pSliceSegmentOffsetsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSliceSegmentOffsets, index), LAYOUT_pSliceSegmentOffsets); }
    public MemorySegment _pSliceSegmentOffsets() { return _pSliceSegmentOffsetsAt(0L); }
    public VkVideoDecodeH265PictureInfoKHR _pSliceSegmentOffsetsAt(long index, MemorySegment src) { _pSliceSegmentOffsetsAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265PictureInfoKHR _pSliceSegmentOffsets(MemorySegment src) { return _pSliceSegmentOffsetsAt(0L, src); }
}
