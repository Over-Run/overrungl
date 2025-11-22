// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeAV1PictureInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeAV1PictureInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkVideoEncodeAV1PredictionModeKHR predictionMode;
///     VkVideoEncodeAV1RateControlGroupKHR rateControlGroup;
///     uint32_t constantQIndex;
///     const StdVideoEncodeAV1PictureInfo* pStdPictureInfo;
///     int32_t referenceNameSlotIndices[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR];
///     VkBool32 primaryReferenceCdfOnly;
///     VkBool32 generateObuExtensionHeader;
/// }
/// ```
public final class VkVideoEncodeAV1PictureInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("predictionMode"),
        ValueLayout.JAVA_INT.withName("rateControlGroup"),
        ValueLayout.JAVA_INT.withName("constantQIndex"),
        ValueLayout.ADDRESS.withName("pStdPictureInfo"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.khr.VKKHRVideoEncodeAv1.VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR, ValueLayout.JAVA_INT).withName("referenceNameSlotIndices"),
        ValueLayout.JAVA_INT.withName("primaryReferenceCdfOnly"),
        ValueLayout.JAVA_INT.withName("generateObuExtensionHeader")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_predictionMode = LAYOUT.byteOffset(PathElement.groupElement("predictionMode"));
    public static final long OFFSET_rateControlGroup = LAYOUT.byteOffset(PathElement.groupElement("rateControlGroup"));
    public static final long OFFSET_constantQIndex = LAYOUT.byteOffset(PathElement.groupElement("constantQIndex"));
    public static final long OFFSET_pStdPictureInfo = LAYOUT.byteOffset(PathElement.groupElement("pStdPictureInfo"));
    public static final long OFFSET_referenceNameSlotIndices = LAYOUT.byteOffset(PathElement.groupElement("referenceNameSlotIndices"));
    public static final long OFFSET_primaryReferenceCdfOnly = LAYOUT.byteOffset(PathElement.groupElement("primaryReferenceCdfOnly"));
    public static final long OFFSET_generateObuExtensionHeader = LAYOUT.byteOffset(PathElement.groupElement("generateObuExtensionHeader"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_predictionMode = LAYOUT.select(PathElement.groupElement("predictionMode"));
    public static final MemoryLayout LAYOUT_rateControlGroup = LAYOUT.select(PathElement.groupElement("rateControlGroup"));
    public static final MemoryLayout LAYOUT_constantQIndex = LAYOUT.select(PathElement.groupElement("constantQIndex"));
    public static final MemoryLayout LAYOUT_pStdPictureInfo = LAYOUT.select(PathElement.groupElement("pStdPictureInfo"));
    public static final MemoryLayout LAYOUT_referenceNameSlotIndices = LAYOUT.select(PathElement.groupElement("referenceNameSlotIndices"));
    public static final MemoryLayout LAYOUT_primaryReferenceCdfOnly = LAYOUT.select(PathElement.groupElement("primaryReferenceCdfOnly"));
    public static final MemoryLayout LAYOUT_generateObuExtensionHeader = LAYOUT.select(PathElement.groupElement("generateObuExtensionHeader"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_predictionMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("predictionMode"));
    public static final VarHandle VH_rateControlGroup = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rateControlGroup"));
    public static final VarHandle VH_constantQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constantQIndex"));
    public static final VarHandle VH_pStdPictureInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPictureInfo"));
    public static final VarHandle VH_referenceNameSlotIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("referenceNameSlotIndices"), PathElement.sequenceElement());
    public static final VarHandle VH_primaryReferenceCdfOnly = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primaryReferenceCdfOnly"));
    public static final VarHandle VH_generateObuExtensionHeader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("generateObuExtensionHeader"));

    public VkVideoEncodeAV1PictureInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeAV1PictureInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1PictureInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeAV1PictureInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1PictureInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeAV1PictureInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1PictureInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeAV1PictureInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1PictureInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeAV1PictureInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1PictureInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeAV1PictureInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeAv1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR); }
    public static VkVideoEncodeAV1PictureInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeAv1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR);
        return s;
    }
    public VkVideoEncodeAV1PictureInfoKHR copyFrom(VkVideoEncodeAV1PictureInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeAV1PictureInfoKHR reinterpret(long count) { return new VkVideoEncodeAV1PictureInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeAV1PictureInfoKHR asSlice(long index) { return new VkVideoEncodeAV1PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeAV1PictureInfoKHR asSlice(long index, long count) { return new VkVideoEncodeAV1PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeAV1PictureInfoKHR at(long index, Consumer<VkVideoEncodeAV1PictureInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int predictionModeAt(long index) { return (int) VH_predictionMode.get(this.segment(), 0L, index); }
    public int rateControlGroupAt(long index) { return (int) VH_rateControlGroup.get(this.segment(), 0L, index); }
    public int constantQIndexAt(long index) { return (int) VH_constantQIndex.get(this.segment(), 0L, index); }
    public MemorySegment pStdPictureInfoAt(long index) { return (MemorySegment) VH_pStdPictureInfo.get(this.segment(), 0L, index); }
    public int referenceNameSlotIndicesAt(long index, long index0) { return (int) VH_referenceNameSlotIndices.get(this.segment(), 0L, index, index0); }
    public int primaryReferenceCdfOnlyAt(long index) { return (int) VH_primaryReferenceCdfOnly.get(this.segment(), 0L, index); }
    public int generateObuExtensionHeaderAt(long index) { return (int) VH_generateObuExtensionHeader.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int predictionMode() { return (int) VH_predictionMode.get(this.segment(), 0L, 0L); }
    public int rateControlGroup() { return (int) VH_rateControlGroup.get(this.segment(), 0L, 0L); }
    public int constantQIndex() { return (int) VH_constantQIndex.get(this.segment(), 0L, 0L); }
    public MemorySegment pStdPictureInfo() { return (MemorySegment) VH_pStdPictureInfo.get(this.segment(), 0L, 0L); }
    public int referenceNameSlotIndices(long index0) { return (int) VH_referenceNameSlotIndices.get(this.segment(), 0L, 0L, index0); }
    public int primaryReferenceCdfOnly() { return (int) VH_primaryReferenceCdfOnly.get(this.segment(), 0L, 0L); }
    public int generateObuExtensionHeader() { return (int) VH_generateObuExtensionHeader.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeAV1PictureInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1PictureInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1PictureInfoKHR predictionModeAt(long index, int value) { VH_predictionMode.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1PictureInfoKHR rateControlGroupAt(long index, int value) { VH_rateControlGroup.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1PictureInfoKHR constantQIndexAt(long index, int value) { VH_constantQIndex.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1PictureInfoKHR pStdPictureInfoAt(long index, MemorySegment value) { VH_pStdPictureInfo.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1PictureInfoKHR referenceNameSlotIndicesAt(long index, long index0, int value) { VH_referenceNameSlotIndices.set(this.segment(), 0L, index, index0, value); return this; }
    public VkVideoEncodeAV1PictureInfoKHR primaryReferenceCdfOnlyAt(long index, int value) { VH_primaryReferenceCdfOnly.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1PictureInfoKHR generateObuExtensionHeaderAt(long index, int value) { VH_generateObuExtensionHeader.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1PictureInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1PictureInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1PictureInfoKHR predictionMode(int value) { VH_predictionMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1PictureInfoKHR rateControlGroup(int value) { VH_rateControlGroup.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1PictureInfoKHR constantQIndex(int value) { VH_constantQIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1PictureInfoKHR pStdPictureInfo(MemorySegment value) { VH_pStdPictureInfo.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1PictureInfoKHR referenceNameSlotIndices(long index0, int value) { VH_referenceNameSlotIndices.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkVideoEncodeAV1PictureInfoKHR primaryReferenceCdfOnly(int value) { VH_primaryReferenceCdfOnly.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1PictureInfoKHR generateObuExtensionHeader(int value) { VH_generateObuExtensionHeader.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeAV1PictureInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1PictureInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeAV1PictureInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1PictureInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _predictionModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_predictionMode, index), LAYOUT_predictionMode); }
    public MemorySegment _predictionMode() { return _predictionModeAt(0L); }
    public VkVideoEncodeAV1PictureInfoKHR _predictionModeAt(long index, MemorySegment src) { _predictionModeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1PictureInfoKHR _predictionMode(MemorySegment src) { return _predictionModeAt(0L, src); }
    public MemorySegment _rateControlGroupAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rateControlGroup, index), LAYOUT_rateControlGroup); }
    public MemorySegment _rateControlGroup() { return _rateControlGroupAt(0L); }
    public VkVideoEncodeAV1PictureInfoKHR _rateControlGroupAt(long index, MemorySegment src) { _rateControlGroupAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1PictureInfoKHR _rateControlGroup(MemorySegment src) { return _rateControlGroupAt(0L, src); }
    public MemorySegment _constantQIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_constantQIndex, index), LAYOUT_constantQIndex); }
    public MemorySegment _constantQIndex() { return _constantQIndexAt(0L); }
    public VkVideoEncodeAV1PictureInfoKHR _constantQIndexAt(long index, MemorySegment src) { _constantQIndexAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1PictureInfoKHR _constantQIndex(MemorySegment src) { return _constantQIndexAt(0L, src); }
    public MemorySegment _pStdPictureInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStdPictureInfo, index), LAYOUT_pStdPictureInfo); }
    public MemorySegment _pStdPictureInfo() { return _pStdPictureInfoAt(0L); }
    public VkVideoEncodeAV1PictureInfoKHR _pStdPictureInfoAt(long index, MemorySegment src) { _pStdPictureInfoAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1PictureInfoKHR _pStdPictureInfo(MemorySegment src) { return _pStdPictureInfoAt(0L, src); }
    public MemorySegment _referenceNameSlotIndicesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_referenceNameSlotIndices, index), LAYOUT_referenceNameSlotIndices); }
    public MemorySegment _referenceNameSlotIndices() { return _referenceNameSlotIndicesAt(0L); }
    public VkVideoEncodeAV1PictureInfoKHR _referenceNameSlotIndicesAt(long index, MemorySegment src) { _referenceNameSlotIndicesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1PictureInfoKHR _referenceNameSlotIndices(MemorySegment src) { return _referenceNameSlotIndicesAt(0L, src); }
    public MemorySegment _primaryReferenceCdfOnlyAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_primaryReferenceCdfOnly, index), LAYOUT_primaryReferenceCdfOnly); }
    public MemorySegment _primaryReferenceCdfOnly() { return _primaryReferenceCdfOnlyAt(0L); }
    public VkVideoEncodeAV1PictureInfoKHR _primaryReferenceCdfOnlyAt(long index, MemorySegment src) { _primaryReferenceCdfOnlyAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1PictureInfoKHR _primaryReferenceCdfOnly(MemorySegment src) { return _primaryReferenceCdfOnlyAt(0L, src); }
    public MemorySegment _generateObuExtensionHeaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_generateObuExtensionHeader, index), LAYOUT_generateObuExtensionHeader); }
    public MemorySegment _generateObuExtensionHeader() { return _generateObuExtensionHeaderAt(0L); }
    public VkVideoEncodeAV1PictureInfoKHR _generateObuExtensionHeaderAt(long index, MemorySegment src) { _generateObuExtensionHeaderAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1PictureInfoKHR _generateObuExtensionHeader(MemorySegment src) { return _generateObuExtensionHeaderAt(0L, src); }
}
