// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoDecodeAV1PictureInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoDecodeAV1PictureInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     const StdVideoDecodeAV1PictureInfo* pStdPictureInfo;
///     int32_t referenceNameSlotIndices[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR];
///     uint32_t frameHeaderOffset;
///     uint32_t tileCount;
///     const uint32_t* pTileOffsets;
///     const uint32_t* pTileSizes;
/// }
/// ```
public final class VkVideoDecodeAV1PictureInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pStdPictureInfo"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.khr.VKKHRVideoEncodeAv1.VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR, ValueLayout.JAVA_INT).withName("referenceNameSlotIndices"),
        ValueLayout.JAVA_INT.withName("frameHeaderOffset"),
        ValueLayout.JAVA_INT.withName("tileCount"),
        ValueLayout.ADDRESS.withName("pTileOffsets"),
        ValueLayout.ADDRESS.withName("pTileSizes")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pStdPictureInfo = LAYOUT.byteOffset(PathElement.groupElement("pStdPictureInfo"));
    public static final long OFFSET_referenceNameSlotIndices = LAYOUT.byteOffset(PathElement.groupElement("referenceNameSlotIndices"));
    public static final long OFFSET_frameHeaderOffset = LAYOUT.byteOffset(PathElement.groupElement("frameHeaderOffset"));
    public static final long OFFSET_tileCount = LAYOUT.byteOffset(PathElement.groupElement("tileCount"));
    public static final long OFFSET_pTileOffsets = LAYOUT.byteOffset(PathElement.groupElement("pTileOffsets"));
    public static final long OFFSET_pTileSizes = LAYOUT.byteOffset(PathElement.groupElement("pTileSizes"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pStdPictureInfo = LAYOUT.select(PathElement.groupElement("pStdPictureInfo"));
    public static final MemoryLayout LAYOUT_referenceNameSlotIndices = LAYOUT.select(PathElement.groupElement("referenceNameSlotIndices"));
    public static final MemoryLayout LAYOUT_frameHeaderOffset = LAYOUT.select(PathElement.groupElement("frameHeaderOffset"));
    public static final MemoryLayout LAYOUT_tileCount = LAYOUT.select(PathElement.groupElement("tileCount"));
    public static final MemoryLayout LAYOUT_pTileOffsets = LAYOUT.select(PathElement.groupElement("pTileOffsets"));
    public static final MemoryLayout LAYOUT_pTileSizes = LAYOUT.select(PathElement.groupElement("pTileSizes"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pStdPictureInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPictureInfo"));
    public static final VarHandle VH_referenceNameSlotIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("referenceNameSlotIndices"), PathElement.sequenceElement());
    public static final VarHandle VH_frameHeaderOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameHeaderOffset"));
    public static final VarHandle VH_tileCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileCount"));
    public static final VarHandle VH_pTileOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTileOffsets"));
    public static final VarHandle VH_pTileSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTileSizes"));

    public VkVideoDecodeAV1PictureInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoDecodeAV1PictureInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeAV1PictureInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoDecodeAV1PictureInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeAV1PictureInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoDecodeAV1PictureInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeAV1PictureInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoDecodeAV1PictureInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeAV1PictureInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoDecodeAV1PictureInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeAV1PictureInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoDecodeAV1PictureInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoDecodeAv1.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_PICTURE_INFO_KHR); }
    public static VkVideoDecodeAV1PictureInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoDecodeAv1.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_PICTURE_INFO_KHR);
        return s;
    }
    public VkVideoDecodeAV1PictureInfoKHR copyFrom(VkVideoDecodeAV1PictureInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoDecodeAV1PictureInfoKHR reinterpret(long count) { return new VkVideoDecodeAV1PictureInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoDecodeAV1PictureInfoKHR asSlice(long index) { return new VkVideoDecodeAV1PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoDecodeAV1PictureInfoKHR asSlice(long index, long count) { return new VkVideoDecodeAV1PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoDecodeAV1PictureInfoKHR at(long index, Consumer<VkVideoDecodeAV1PictureInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pStdPictureInfoAt(long index) { return (MemorySegment) VH_pStdPictureInfo.get(this.segment(), 0L, index); }
    public int referenceNameSlotIndicesAt(long index, long index0) { return (int) VH_referenceNameSlotIndices.get(this.segment(), 0L, index, index0); }
    public int frameHeaderOffsetAt(long index) { return (int) VH_frameHeaderOffset.get(this.segment(), 0L, index); }
    public int tileCountAt(long index) { return (int) VH_tileCount.get(this.segment(), 0L, index); }
    public MemorySegment pTileOffsetsAt(long index) { return (MemorySegment) VH_pTileOffsets.get(this.segment(), 0L, index); }
    public MemorySegment pTileSizesAt(long index) { return (MemorySegment) VH_pTileSizes.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pStdPictureInfo() { return (MemorySegment) VH_pStdPictureInfo.get(this.segment(), 0L, 0L); }
    public int referenceNameSlotIndices(long index0) { return (int) VH_referenceNameSlotIndices.get(this.segment(), 0L, 0L, index0); }
    public int frameHeaderOffset() { return (int) VH_frameHeaderOffset.get(this.segment(), 0L, 0L); }
    public int tileCount() { return (int) VH_tileCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pTileOffsets() { return (MemorySegment) VH_pTileOffsets.get(this.segment(), 0L, 0L); }
    public MemorySegment pTileSizes() { return (MemorySegment) VH_pTileSizes.get(this.segment(), 0L, 0L); }
    public VkVideoDecodeAV1PictureInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeAV1PictureInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeAV1PictureInfoKHR pStdPictureInfoAt(long index, MemorySegment value) { VH_pStdPictureInfo.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeAV1PictureInfoKHR referenceNameSlotIndicesAt(long index, long index0, int value) { VH_referenceNameSlotIndices.set(this.segment(), 0L, index, index0, value); return this; }
    public VkVideoDecodeAV1PictureInfoKHR frameHeaderOffsetAt(long index, int value) { VH_frameHeaderOffset.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeAV1PictureInfoKHR tileCountAt(long index, int value) { VH_tileCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeAV1PictureInfoKHR pTileOffsetsAt(long index, MemorySegment value) { VH_pTileOffsets.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeAV1PictureInfoKHR pTileSizesAt(long index, MemorySegment value) { VH_pTileSizes.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeAV1PictureInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeAV1PictureInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeAV1PictureInfoKHR pStdPictureInfo(MemorySegment value) { VH_pStdPictureInfo.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeAV1PictureInfoKHR referenceNameSlotIndices(long index0, int value) { VH_referenceNameSlotIndices.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkVideoDecodeAV1PictureInfoKHR frameHeaderOffset(int value) { VH_frameHeaderOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeAV1PictureInfoKHR tileCount(int value) { VH_tileCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeAV1PictureInfoKHR pTileOffsets(MemorySegment value) { VH_pTileOffsets.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeAV1PictureInfoKHR pTileSizes(MemorySegment value) { VH_pTileSizes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoDecodeAV1PictureInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoDecodeAV1PictureInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoDecodeAV1PictureInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoDecodeAV1PictureInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pStdPictureInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStdPictureInfo, index), LAYOUT_pStdPictureInfo); }
    public MemorySegment _pStdPictureInfo() { return _pStdPictureInfoAt(0L); }
    public VkVideoDecodeAV1PictureInfoKHR _pStdPictureInfoAt(long index, MemorySegment src) { _pStdPictureInfoAt(index).copyFrom(src); return this; }
    public VkVideoDecodeAV1PictureInfoKHR _pStdPictureInfo(MemorySegment src) { return _pStdPictureInfoAt(0L, src); }
    public MemorySegment _referenceNameSlotIndicesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_referenceNameSlotIndices, index), LAYOUT_referenceNameSlotIndices); }
    public MemorySegment _referenceNameSlotIndices() { return _referenceNameSlotIndicesAt(0L); }
    public VkVideoDecodeAV1PictureInfoKHR _referenceNameSlotIndicesAt(long index, MemorySegment src) { _referenceNameSlotIndicesAt(index).copyFrom(src); return this; }
    public VkVideoDecodeAV1PictureInfoKHR _referenceNameSlotIndices(MemorySegment src) { return _referenceNameSlotIndicesAt(0L, src); }
    public MemorySegment _frameHeaderOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_frameHeaderOffset, index), LAYOUT_frameHeaderOffset); }
    public MemorySegment _frameHeaderOffset() { return _frameHeaderOffsetAt(0L); }
    public VkVideoDecodeAV1PictureInfoKHR _frameHeaderOffsetAt(long index, MemorySegment src) { _frameHeaderOffsetAt(index).copyFrom(src); return this; }
    public VkVideoDecodeAV1PictureInfoKHR _frameHeaderOffset(MemorySegment src) { return _frameHeaderOffsetAt(0L, src); }
    public MemorySegment _tileCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tileCount, index), LAYOUT_tileCount); }
    public MemorySegment _tileCount() { return _tileCountAt(0L); }
    public VkVideoDecodeAV1PictureInfoKHR _tileCountAt(long index, MemorySegment src) { _tileCountAt(index).copyFrom(src); return this; }
    public VkVideoDecodeAV1PictureInfoKHR _tileCount(MemorySegment src) { return _tileCountAt(0L, src); }
    public MemorySegment _pTileOffsetsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pTileOffsets, index), LAYOUT_pTileOffsets); }
    public MemorySegment _pTileOffsets() { return _pTileOffsetsAt(0L); }
    public VkVideoDecodeAV1PictureInfoKHR _pTileOffsetsAt(long index, MemorySegment src) { _pTileOffsetsAt(index).copyFrom(src); return this; }
    public VkVideoDecodeAV1PictureInfoKHR _pTileOffsets(MemorySegment src) { return _pTileOffsetsAt(0L, src); }
    public MemorySegment _pTileSizesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pTileSizes, index), LAYOUT_pTileSizes); }
    public MemorySegment _pTileSizes() { return _pTileSizesAt(0L); }
    public VkVideoDecodeAV1PictureInfoKHR _pTileSizesAt(long index, MemorySegment src) { _pTileSizesAt(index).copyFrom(src); return this; }
    public VkVideoDecodeAV1PictureInfoKHR _pTileSizes(MemorySegment src) { return _pTileSizesAt(0L, src); }
}
