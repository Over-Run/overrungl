// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoDecodeH264PictureInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoDecodeH264PictureInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     const StdVideoDecodeH264PictureInfo* pStdPictureInfo;
///     uint32_t sliceCount;
///     const uint32_t* pSliceOffsets;
/// }
/// ```
public final class VkVideoDecodeH264PictureInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pStdPictureInfo"),
        ValueLayout.JAVA_INT.withName("sliceCount"),
        ValueLayout.ADDRESS.withName("pSliceOffsets")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pStdPictureInfo = LAYOUT.byteOffset(PathElement.groupElement("pStdPictureInfo"));
    public static final long OFFSET_sliceCount = LAYOUT.byteOffset(PathElement.groupElement("sliceCount"));
    public static final long OFFSET_pSliceOffsets = LAYOUT.byteOffset(PathElement.groupElement("pSliceOffsets"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pStdPictureInfo = LAYOUT.select(PathElement.groupElement("pStdPictureInfo"));
    public static final MemoryLayout LAYOUT_sliceCount = LAYOUT.select(PathElement.groupElement("sliceCount"));
    public static final MemoryLayout LAYOUT_pSliceOffsets = LAYOUT.select(PathElement.groupElement("pSliceOffsets"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pStdPictureInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPictureInfo"));
    public static final VarHandle VH_sliceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sliceCount"));
    public static final VarHandle VH_pSliceOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSliceOffsets"));

    public VkVideoDecodeH264PictureInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoDecodeH264PictureInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH264PictureInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoDecodeH264PictureInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH264PictureInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoDecodeH264PictureInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH264PictureInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoDecodeH264PictureInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeH264PictureInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoDecodeH264PictureInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeH264PictureInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoDecodeH264PictureInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_KHR); }
    public static VkVideoDecodeH264PictureInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_KHR);
        return s;
    }
    public VkVideoDecodeH264PictureInfoKHR copyFrom(VkVideoDecodeH264PictureInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoDecodeH264PictureInfoKHR reinterpret(long count) { return new VkVideoDecodeH264PictureInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoDecodeH264PictureInfoKHR asSlice(long index) { return new VkVideoDecodeH264PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoDecodeH264PictureInfoKHR asSlice(long index, long count) { return new VkVideoDecodeH264PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoDecodeH264PictureInfoKHR at(long index, Consumer<VkVideoDecodeH264PictureInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pStdPictureInfoAt(long index) { return (MemorySegment) VH_pStdPictureInfo.get(this.segment(), 0L, index); }
    public int sliceCountAt(long index) { return (int) VH_sliceCount.get(this.segment(), 0L, index); }
    public MemorySegment pSliceOffsetsAt(long index) { return (MemorySegment) VH_pSliceOffsets.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pStdPictureInfo() { return (MemorySegment) VH_pStdPictureInfo.get(this.segment(), 0L, 0L); }
    public int sliceCount() { return (int) VH_sliceCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pSliceOffsets() { return (MemorySegment) VH_pSliceOffsets.get(this.segment(), 0L, 0L); }
    public VkVideoDecodeH264PictureInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH264PictureInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH264PictureInfoKHR pStdPictureInfoAt(long index, MemorySegment value) { VH_pStdPictureInfo.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH264PictureInfoKHR sliceCountAt(long index, int value) { VH_sliceCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH264PictureInfoKHR pSliceOffsetsAt(long index, MemorySegment value) { VH_pSliceOffsets.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH264PictureInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH264PictureInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH264PictureInfoKHR pStdPictureInfo(MemorySegment value) { VH_pStdPictureInfo.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH264PictureInfoKHR sliceCount(int value) { VH_sliceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH264PictureInfoKHR pSliceOffsets(MemorySegment value) { VH_pSliceOffsets.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoDecodeH264PictureInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH264PictureInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoDecodeH264PictureInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH264PictureInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pStdPictureInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStdPictureInfo, index), LAYOUT_pStdPictureInfo); }
    public MemorySegment _pStdPictureInfo() { return _pStdPictureInfoAt(0L); }
    public VkVideoDecodeH264PictureInfoKHR _pStdPictureInfoAt(long index, MemorySegment src) { _pStdPictureInfoAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH264PictureInfoKHR _pStdPictureInfo(MemorySegment src) { return _pStdPictureInfoAt(0L, src); }
    public MemorySegment _sliceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sliceCount, index), LAYOUT_sliceCount); }
    public MemorySegment _sliceCount() { return _sliceCountAt(0L); }
    public VkVideoDecodeH264PictureInfoKHR _sliceCountAt(long index, MemorySegment src) { _sliceCountAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH264PictureInfoKHR _sliceCount(MemorySegment src) { return _sliceCountAt(0L, src); }
    public MemorySegment _pSliceOffsetsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSliceOffsets, index), LAYOUT_pSliceOffsets); }
    public MemorySegment _pSliceOffsets() { return _pSliceOffsetsAt(0L); }
    public VkVideoDecodeH264PictureInfoKHR _pSliceOffsetsAt(long index, MemorySegment src) { _pSliceOffsetsAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH264PictureInfoKHR _pSliceOffsets(MemorySegment src) { return _pSliceOffsetsAt(0L, src); }
}
