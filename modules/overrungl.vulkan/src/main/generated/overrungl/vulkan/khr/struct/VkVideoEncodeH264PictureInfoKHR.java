// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeH264PictureInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH264PictureInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t naluSliceEntryCount;
///     const VkVideoEncodeH264NaluSliceInfoKHR* pNaluSliceEntries;
///     const StdVideoEncodeH264PictureInfo* pStdPictureInfo;
///     VkBool32 generatePrefixNalu;
/// }
/// ```
public final class VkVideoEncodeH264PictureInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("naluSliceEntryCount"),
        ValueLayout.ADDRESS.withName("pNaluSliceEntries"),
        ValueLayout.ADDRESS.withName("pStdPictureInfo"),
        ValueLayout.JAVA_INT.withName("generatePrefixNalu")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_naluSliceEntryCount = LAYOUT.byteOffset(PathElement.groupElement("naluSliceEntryCount"));
    public static final long OFFSET_pNaluSliceEntries = LAYOUT.byteOffset(PathElement.groupElement("pNaluSliceEntries"));
    public static final long OFFSET_pStdPictureInfo = LAYOUT.byteOffset(PathElement.groupElement("pStdPictureInfo"));
    public static final long OFFSET_generatePrefixNalu = LAYOUT.byteOffset(PathElement.groupElement("generatePrefixNalu"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_naluSliceEntryCount = LAYOUT.select(PathElement.groupElement("naluSliceEntryCount"));
    public static final MemoryLayout LAYOUT_pNaluSliceEntries = LAYOUT.select(PathElement.groupElement("pNaluSliceEntries"));
    public static final MemoryLayout LAYOUT_pStdPictureInfo = LAYOUT.select(PathElement.groupElement("pStdPictureInfo"));
    public static final MemoryLayout LAYOUT_generatePrefixNalu = LAYOUT.select(PathElement.groupElement("generatePrefixNalu"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_naluSliceEntryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("naluSliceEntryCount"));
    public static final VarHandle VH_pNaluSliceEntries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNaluSliceEntries"));
    public static final VarHandle VH_pStdPictureInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPictureInfo"));
    public static final VarHandle VH_generatePrefixNalu = LAYOUT.arrayElementVarHandle(PathElement.groupElement("generatePrefixNalu"));

    public VkVideoEncodeH264PictureInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeH264PictureInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264PictureInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeH264PictureInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264PictureInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeH264PictureInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264PictureInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeH264PictureInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264PictureInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeH264PictureInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH264PictureInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeH264PictureInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_KHR); }
    public static VkVideoEncodeH264PictureInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_KHR);
        return s;
    }
    public VkVideoEncodeH264PictureInfoKHR copyFrom(VkVideoEncodeH264PictureInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeH264PictureInfoKHR reinterpret(long count) { return new VkVideoEncodeH264PictureInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeH264PictureInfoKHR asSlice(long index) { return new VkVideoEncodeH264PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeH264PictureInfoKHR asSlice(long index, long count) { return new VkVideoEncodeH264PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeH264PictureInfoKHR at(long index, Consumer<VkVideoEncodeH264PictureInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int naluSliceEntryCountAt(long index) { return (int) VH_naluSliceEntryCount.get(this.segment(), 0L, index); }
    public MemorySegment pNaluSliceEntriesAt(long index) { return (MemorySegment) VH_pNaluSliceEntries.get(this.segment(), 0L, index); }
    public MemorySegment pStdPictureInfoAt(long index) { return (MemorySegment) VH_pStdPictureInfo.get(this.segment(), 0L, index); }
    public int generatePrefixNaluAt(long index) { return (int) VH_generatePrefixNalu.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int naluSliceEntryCount() { return (int) VH_naluSliceEntryCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pNaluSliceEntries() { return (MemorySegment) VH_pNaluSliceEntries.get(this.segment(), 0L, 0L); }
    public MemorySegment pStdPictureInfo() { return (MemorySegment) VH_pStdPictureInfo.get(this.segment(), 0L, 0L); }
    public int generatePrefixNalu() { return (int) VH_generatePrefixNalu.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeH264PictureInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264PictureInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264PictureInfoKHR naluSliceEntryCountAt(long index, int value) { VH_naluSliceEntryCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264PictureInfoKHR pNaluSliceEntriesAt(long index, MemorySegment value) { VH_pNaluSliceEntries.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264PictureInfoKHR pStdPictureInfoAt(long index, MemorySegment value) { VH_pStdPictureInfo.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264PictureInfoKHR generatePrefixNaluAt(long index, int value) { VH_generatePrefixNalu.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264PictureInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264PictureInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264PictureInfoKHR naluSliceEntryCount(int value) { VH_naluSliceEntryCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264PictureInfoKHR pNaluSliceEntries(MemorySegment value) { VH_pNaluSliceEntries.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264PictureInfoKHR pStdPictureInfo(MemorySegment value) { VH_pStdPictureInfo.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264PictureInfoKHR generatePrefixNalu(int value) { VH_generatePrefixNalu.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeH264PictureInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264PictureInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeH264PictureInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264PictureInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _naluSliceEntryCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_naluSliceEntryCount, index), LAYOUT_naluSliceEntryCount); }
    public MemorySegment _naluSliceEntryCount() { return _naluSliceEntryCountAt(0L); }
    public VkVideoEncodeH264PictureInfoKHR _naluSliceEntryCountAt(long index, MemorySegment src) { _naluSliceEntryCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264PictureInfoKHR _naluSliceEntryCount(MemorySegment src) { return _naluSliceEntryCountAt(0L, src); }
    public MemorySegment _pNaluSliceEntriesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNaluSliceEntries, index), LAYOUT_pNaluSliceEntries); }
    public MemorySegment _pNaluSliceEntries() { return _pNaluSliceEntriesAt(0L); }
    public VkVideoEncodeH264PictureInfoKHR _pNaluSliceEntriesAt(long index, MemorySegment src) { _pNaluSliceEntriesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264PictureInfoKHR _pNaluSliceEntries(MemorySegment src) { return _pNaluSliceEntriesAt(0L, src); }
    public MemorySegment _pStdPictureInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStdPictureInfo, index), LAYOUT_pStdPictureInfo); }
    public MemorySegment _pStdPictureInfo() { return _pStdPictureInfoAt(0L); }
    public VkVideoEncodeH264PictureInfoKHR _pStdPictureInfoAt(long index, MemorySegment src) { _pStdPictureInfoAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264PictureInfoKHR _pStdPictureInfo(MemorySegment src) { return _pStdPictureInfoAt(0L, src); }
    public MemorySegment _generatePrefixNaluAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_generatePrefixNalu, index), LAYOUT_generatePrefixNalu); }
    public MemorySegment _generatePrefixNalu() { return _generatePrefixNaluAt(0L); }
    public VkVideoEncodeH264PictureInfoKHR _generatePrefixNaluAt(long index, MemorySegment src) { _generatePrefixNaluAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264PictureInfoKHR _generatePrefixNalu(MemorySegment src) { return _generatePrefixNaluAt(0L, src); }
}
