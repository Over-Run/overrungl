// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoDecodeVP9PictureInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoDecodeVP9PictureInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     const StdVideoDecodeVP9PictureInfo* pStdPictureInfo;
///     int32_t referenceNameSlotIndices[VK_MAX_VIDEO_VP9_REFERENCES_PER_FRAME_KHR];
///     uint32_t uncompressedHeaderOffset;
///     uint32_t compressedHeaderOffset;
///     uint32_t tilesOffset;
/// }
/// ```
public final class VkVideoDecodeVP9PictureInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pStdPictureInfo"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.khr.VKKHRVideoDecodeVp9.VK_MAX_VIDEO_VP9_REFERENCES_PER_FRAME_KHR, ValueLayout.JAVA_INT).withName("referenceNameSlotIndices"),
        ValueLayout.JAVA_INT.withName("uncompressedHeaderOffset"),
        ValueLayout.JAVA_INT.withName("compressedHeaderOffset"),
        ValueLayout.JAVA_INT.withName("tilesOffset")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pStdPictureInfo = LAYOUT.byteOffset(PathElement.groupElement("pStdPictureInfo"));
    public static final long OFFSET_referenceNameSlotIndices = LAYOUT.byteOffset(PathElement.groupElement("referenceNameSlotIndices"));
    public static final long OFFSET_uncompressedHeaderOffset = LAYOUT.byteOffset(PathElement.groupElement("uncompressedHeaderOffset"));
    public static final long OFFSET_compressedHeaderOffset = LAYOUT.byteOffset(PathElement.groupElement("compressedHeaderOffset"));
    public static final long OFFSET_tilesOffset = LAYOUT.byteOffset(PathElement.groupElement("tilesOffset"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pStdPictureInfo = LAYOUT.select(PathElement.groupElement("pStdPictureInfo"));
    public static final MemoryLayout LAYOUT_referenceNameSlotIndices = LAYOUT.select(PathElement.groupElement("referenceNameSlotIndices"));
    public static final MemoryLayout LAYOUT_uncompressedHeaderOffset = LAYOUT.select(PathElement.groupElement("uncompressedHeaderOffset"));
    public static final MemoryLayout LAYOUT_compressedHeaderOffset = LAYOUT.select(PathElement.groupElement("compressedHeaderOffset"));
    public static final MemoryLayout LAYOUT_tilesOffset = LAYOUT.select(PathElement.groupElement("tilesOffset"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pStdPictureInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPictureInfo"));
    public static final VarHandle VH_referenceNameSlotIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("referenceNameSlotIndices"), PathElement.sequenceElement());
    public static final VarHandle VH_uncompressedHeaderOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uncompressedHeaderOffset"));
    public static final VarHandle VH_compressedHeaderOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compressedHeaderOffset"));
    public static final VarHandle VH_tilesOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tilesOffset"));

    public VkVideoDecodeVP9PictureInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoDecodeVP9PictureInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeVP9PictureInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoDecodeVP9PictureInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeVP9PictureInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoDecodeVP9PictureInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeVP9PictureInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoDecodeVP9PictureInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeVP9PictureInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoDecodeVP9PictureInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeVP9PictureInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoDecodeVP9PictureInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoDecodeVp9.VK_STRUCTURE_TYPE_VIDEO_DECODE_VP9_PICTURE_INFO_KHR); }
    public static VkVideoDecodeVP9PictureInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoDecodeVp9.VK_STRUCTURE_TYPE_VIDEO_DECODE_VP9_PICTURE_INFO_KHR);
        return s;
    }
    public VkVideoDecodeVP9PictureInfoKHR copyFrom(VkVideoDecodeVP9PictureInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoDecodeVP9PictureInfoKHR reinterpret(long count) { return new VkVideoDecodeVP9PictureInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoDecodeVP9PictureInfoKHR asSlice(long index) { return new VkVideoDecodeVP9PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoDecodeVP9PictureInfoKHR asSlice(long index, long count) { return new VkVideoDecodeVP9PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoDecodeVP9PictureInfoKHR at(long index, Consumer<VkVideoDecodeVP9PictureInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pStdPictureInfoAt(long index) { return (MemorySegment) VH_pStdPictureInfo.get(this.segment(), 0L, index); }
    public int referenceNameSlotIndicesAt(long index, long index0) { return (int) VH_referenceNameSlotIndices.get(this.segment(), 0L, index, index0); }
    public int uncompressedHeaderOffsetAt(long index) { return (int) VH_uncompressedHeaderOffset.get(this.segment(), 0L, index); }
    public int compressedHeaderOffsetAt(long index) { return (int) VH_compressedHeaderOffset.get(this.segment(), 0L, index); }
    public int tilesOffsetAt(long index) { return (int) VH_tilesOffset.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pStdPictureInfo() { return (MemorySegment) VH_pStdPictureInfo.get(this.segment(), 0L, 0L); }
    public int referenceNameSlotIndices(long index0) { return (int) VH_referenceNameSlotIndices.get(this.segment(), 0L, 0L, index0); }
    public int uncompressedHeaderOffset() { return (int) VH_uncompressedHeaderOffset.get(this.segment(), 0L, 0L); }
    public int compressedHeaderOffset() { return (int) VH_compressedHeaderOffset.get(this.segment(), 0L, 0L); }
    public int tilesOffset() { return (int) VH_tilesOffset.get(this.segment(), 0L, 0L); }
    public VkVideoDecodeVP9PictureInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeVP9PictureInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeVP9PictureInfoKHR pStdPictureInfoAt(long index, MemorySegment value) { VH_pStdPictureInfo.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeVP9PictureInfoKHR referenceNameSlotIndicesAt(long index, long index0, int value) { VH_referenceNameSlotIndices.set(this.segment(), 0L, index, index0, value); return this; }
    public VkVideoDecodeVP9PictureInfoKHR uncompressedHeaderOffsetAt(long index, int value) { VH_uncompressedHeaderOffset.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeVP9PictureInfoKHR compressedHeaderOffsetAt(long index, int value) { VH_compressedHeaderOffset.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeVP9PictureInfoKHR tilesOffsetAt(long index, int value) { VH_tilesOffset.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeVP9PictureInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeVP9PictureInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeVP9PictureInfoKHR pStdPictureInfo(MemorySegment value) { VH_pStdPictureInfo.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeVP9PictureInfoKHR referenceNameSlotIndices(long index0, int value) { VH_referenceNameSlotIndices.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkVideoDecodeVP9PictureInfoKHR uncompressedHeaderOffset(int value) { VH_uncompressedHeaderOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeVP9PictureInfoKHR compressedHeaderOffset(int value) { VH_compressedHeaderOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeVP9PictureInfoKHR tilesOffset(int value) { VH_tilesOffset.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoDecodeVP9PictureInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoDecodeVP9PictureInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoDecodeVP9PictureInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoDecodeVP9PictureInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pStdPictureInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStdPictureInfo, index), LAYOUT_pStdPictureInfo); }
    public MemorySegment _pStdPictureInfo() { return _pStdPictureInfoAt(0L); }
    public VkVideoDecodeVP9PictureInfoKHR _pStdPictureInfoAt(long index, MemorySegment src) { _pStdPictureInfoAt(index).copyFrom(src); return this; }
    public VkVideoDecodeVP9PictureInfoKHR _pStdPictureInfo(MemorySegment src) { return _pStdPictureInfoAt(0L, src); }
    public MemorySegment _referenceNameSlotIndicesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_referenceNameSlotIndices, index), LAYOUT_referenceNameSlotIndices); }
    public MemorySegment _referenceNameSlotIndices() { return _referenceNameSlotIndicesAt(0L); }
    public VkVideoDecodeVP9PictureInfoKHR _referenceNameSlotIndicesAt(long index, MemorySegment src) { _referenceNameSlotIndicesAt(index).copyFrom(src); return this; }
    public VkVideoDecodeVP9PictureInfoKHR _referenceNameSlotIndices(MemorySegment src) { return _referenceNameSlotIndicesAt(0L, src); }
    public MemorySegment _uncompressedHeaderOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_uncompressedHeaderOffset, index), LAYOUT_uncompressedHeaderOffset); }
    public MemorySegment _uncompressedHeaderOffset() { return _uncompressedHeaderOffsetAt(0L); }
    public VkVideoDecodeVP9PictureInfoKHR _uncompressedHeaderOffsetAt(long index, MemorySegment src) { _uncompressedHeaderOffsetAt(index).copyFrom(src); return this; }
    public VkVideoDecodeVP9PictureInfoKHR _uncompressedHeaderOffset(MemorySegment src) { return _uncompressedHeaderOffsetAt(0L, src); }
    public MemorySegment _compressedHeaderOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_compressedHeaderOffset, index), LAYOUT_compressedHeaderOffset); }
    public MemorySegment _compressedHeaderOffset() { return _compressedHeaderOffsetAt(0L); }
    public VkVideoDecodeVP9PictureInfoKHR _compressedHeaderOffsetAt(long index, MemorySegment src) { _compressedHeaderOffsetAt(index).copyFrom(src); return this; }
    public VkVideoDecodeVP9PictureInfoKHR _compressedHeaderOffset(MemorySegment src) { return _compressedHeaderOffsetAt(0L, src); }
    public MemorySegment _tilesOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tilesOffset, index), LAYOUT_tilesOffset); }
    public MemorySegment _tilesOffset() { return _tilesOffsetAt(0L); }
    public VkVideoDecodeVP9PictureInfoKHR _tilesOffsetAt(long index, MemorySegment src) { _tilesOffsetAt(index).copyFrom(src); return this; }
    public VkVideoDecodeVP9PictureInfoKHR _tilesOffset(MemorySegment src) { return _tilesOffsetAt(0L, src); }
}
