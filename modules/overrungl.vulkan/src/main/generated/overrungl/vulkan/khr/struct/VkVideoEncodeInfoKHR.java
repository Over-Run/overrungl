// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkVideoEncodeFlagsKHR flags;
///     VkBuffer dstBuffer;
///     VkDeviceSize dstBufferOffset;
///     VkDeviceSize dstBufferRange;
///     VkVideoPictureResourceInfoKHR srcPictureResource;
///     const VkVideoReferenceSlotInfoKHR* pSetupReferenceSlot;
///     uint32_t referenceSlotCount;
///     const VkVideoReferenceSlotInfoKHR* pReferenceSlots;
///     uint32_t precedingExternallyEncodedBytes;
/// }
/// ```
public final class VkVideoEncodeInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("dstBuffer"),
        ValueLayout.JAVA_LONG.withName("dstBufferOffset"),
        ValueLayout.JAVA_LONG.withName("dstBufferRange"),
        overrungl.vulkan.khr.struct.VkVideoPictureResourceInfoKHR.LAYOUT.withName("srcPictureResource"),
        ValueLayout.ADDRESS.withName("pSetupReferenceSlot"),
        ValueLayout.JAVA_INT.withName("referenceSlotCount"),
        ValueLayout.ADDRESS.withName("pReferenceSlots"),
        ValueLayout.JAVA_INT.withName("precedingExternallyEncodedBytes")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_dstBuffer = LAYOUT.byteOffset(PathElement.groupElement("dstBuffer"));
    public static final long OFFSET_dstBufferOffset = LAYOUT.byteOffset(PathElement.groupElement("dstBufferOffset"));
    public static final long OFFSET_dstBufferRange = LAYOUT.byteOffset(PathElement.groupElement("dstBufferRange"));
    public static final long OFFSET_srcPictureResource = LAYOUT.byteOffset(PathElement.groupElement("srcPictureResource"));
    public static final long OFFSET_pSetupReferenceSlot = LAYOUT.byteOffset(PathElement.groupElement("pSetupReferenceSlot"));
    public static final long OFFSET_referenceSlotCount = LAYOUT.byteOffset(PathElement.groupElement("referenceSlotCount"));
    public static final long OFFSET_pReferenceSlots = LAYOUT.byteOffset(PathElement.groupElement("pReferenceSlots"));
    public static final long OFFSET_precedingExternallyEncodedBytes = LAYOUT.byteOffset(PathElement.groupElement("precedingExternallyEncodedBytes"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_dstBuffer = LAYOUT.select(PathElement.groupElement("dstBuffer"));
    public static final MemoryLayout LAYOUT_dstBufferOffset = LAYOUT.select(PathElement.groupElement("dstBufferOffset"));
    public static final MemoryLayout LAYOUT_dstBufferRange = LAYOUT.select(PathElement.groupElement("dstBufferRange"));
    public static final MemoryLayout LAYOUT_srcPictureResource = LAYOUT.select(PathElement.groupElement("srcPictureResource"));
    public static final MemoryLayout LAYOUT_pSetupReferenceSlot = LAYOUT.select(PathElement.groupElement("pSetupReferenceSlot"));
    public static final MemoryLayout LAYOUT_referenceSlotCount = LAYOUT.select(PathElement.groupElement("referenceSlotCount"));
    public static final MemoryLayout LAYOUT_pReferenceSlots = LAYOUT.select(PathElement.groupElement("pReferenceSlots"));
    public static final MemoryLayout LAYOUT_precedingExternallyEncodedBytes = LAYOUT.select(PathElement.groupElement("precedingExternallyEncodedBytes"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_dstBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstBuffer"));
    public static final VarHandle VH_dstBufferOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstBufferOffset"));
    public static final VarHandle VH_dstBufferRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstBufferRange"));
    public static final VarHandle VH_srcPictureResource$sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcPictureResource"), PathElement.groupElement("sType"));
    public static final VarHandle VH_srcPictureResource$pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcPictureResource"), PathElement.groupElement("pNext"));
    public static final VarHandle VH_srcPictureResource$codedOffset$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcPictureResource"), PathElement.groupElement("codedOffset"), PathElement.groupElement("x"));
    public static final VarHandle VH_srcPictureResource$codedOffset$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcPictureResource"), PathElement.groupElement("codedOffset"), PathElement.groupElement("y"));
    public static final VarHandle VH_srcPictureResource$codedExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcPictureResource"), PathElement.groupElement("codedExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_srcPictureResource$codedExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcPictureResource"), PathElement.groupElement("codedExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_srcPictureResource$baseArrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcPictureResource"), PathElement.groupElement("baseArrayLayer"));
    public static final VarHandle VH_srcPictureResource$imageViewBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcPictureResource"), PathElement.groupElement("imageViewBinding"));
    public static final VarHandle VH_pSetupReferenceSlot = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSetupReferenceSlot"));
    public static final VarHandle VH_referenceSlotCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("referenceSlotCount"));
    public static final VarHandle VH_pReferenceSlots = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pReferenceSlots"));
    public static final VarHandle VH_precedingExternallyEncodedBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("precedingExternallyEncodedBytes"));

    public VkVideoEncodeInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR); }
    public static VkVideoEncodeInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR);
        return s;
    }
    public VkVideoEncodeInfoKHR copyFrom(VkVideoEncodeInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeInfoKHR reinterpret(long count) { return new VkVideoEncodeInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeInfoKHR asSlice(long index) { return new VkVideoEncodeInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeInfoKHR asSlice(long index, long count) { return new VkVideoEncodeInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeInfoKHR at(long index, Consumer<VkVideoEncodeInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long dstBufferAt(long index) { return (long) VH_dstBuffer.get(this.segment(), 0L, index); }
    public long dstBufferOffsetAt(long index) { return (long) VH_dstBufferOffset.get(this.segment(), 0L, index); }
    public long dstBufferRangeAt(long index) { return (long) VH_dstBufferRange.get(this.segment(), 0L, index); }
    public int srcPictureResource$sTypeAt(long index) { return (int) VH_srcPictureResource$sType.get(this.segment(), 0L, index); }
    public MemorySegment srcPictureResource$pNextAt(long index) { return (MemorySegment) VH_srcPictureResource$pNext.get(this.segment(), 0L, index); }
    public int srcPictureResource$codedOffset$xAt(long index) { return (int) VH_srcPictureResource$codedOffset$x.get(this.segment(), 0L, index); }
    public int srcPictureResource$codedOffset$yAt(long index) { return (int) VH_srcPictureResource$codedOffset$y.get(this.segment(), 0L, index); }
    public int srcPictureResource$codedExtent$widthAt(long index) { return (int) VH_srcPictureResource$codedExtent$width.get(this.segment(), 0L, index); }
    public int srcPictureResource$codedExtent$heightAt(long index) { return (int) VH_srcPictureResource$codedExtent$height.get(this.segment(), 0L, index); }
    public int srcPictureResource$baseArrayLayerAt(long index) { return (int) VH_srcPictureResource$baseArrayLayer.get(this.segment(), 0L, index); }
    public long srcPictureResource$imageViewBindingAt(long index) { return (long) VH_srcPictureResource$imageViewBinding.get(this.segment(), 0L, index); }
    public MemorySegment pSetupReferenceSlotAt(long index) { return (MemorySegment) VH_pSetupReferenceSlot.get(this.segment(), 0L, index); }
    public int referenceSlotCountAt(long index) { return (int) VH_referenceSlotCount.get(this.segment(), 0L, index); }
    public MemorySegment pReferenceSlotsAt(long index) { return (MemorySegment) VH_pReferenceSlots.get(this.segment(), 0L, index); }
    public int precedingExternallyEncodedBytesAt(long index) { return (int) VH_precedingExternallyEncodedBytes.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public long dstBuffer() { return (long) VH_dstBuffer.get(this.segment(), 0L, 0L); }
    public long dstBufferOffset() { return (long) VH_dstBufferOffset.get(this.segment(), 0L, 0L); }
    public long dstBufferRange() { return (long) VH_dstBufferRange.get(this.segment(), 0L, 0L); }
    public int srcPictureResource$sType() { return (int) VH_srcPictureResource$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment srcPictureResource$pNext() { return (MemorySegment) VH_srcPictureResource$pNext.get(this.segment(), 0L, 0L); }
    public int srcPictureResource$codedOffset$x() { return (int) VH_srcPictureResource$codedOffset$x.get(this.segment(), 0L, 0L); }
    public int srcPictureResource$codedOffset$y() { return (int) VH_srcPictureResource$codedOffset$y.get(this.segment(), 0L, 0L); }
    public int srcPictureResource$codedExtent$width() { return (int) VH_srcPictureResource$codedExtent$width.get(this.segment(), 0L, 0L); }
    public int srcPictureResource$codedExtent$height() { return (int) VH_srcPictureResource$codedExtent$height.get(this.segment(), 0L, 0L); }
    public int srcPictureResource$baseArrayLayer() { return (int) VH_srcPictureResource$baseArrayLayer.get(this.segment(), 0L, 0L); }
    public long srcPictureResource$imageViewBinding() { return (long) VH_srcPictureResource$imageViewBinding.get(this.segment(), 0L, 0L); }
    public MemorySegment pSetupReferenceSlot() { return (MemorySegment) VH_pSetupReferenceSlot.get(this.segment(), 0L, 0L); }
    public int referenceSlotCount() { return (int) VH_referenceSlotCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pReferenceSlots() { return (MemorySegment) VH_pReferenceSlots.get(this.segment(), 0L, 0L); }
    public int precedingExternallyEncodedBytes() { return (int) VH_precedingExternallyEncodedBytes.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeInfoKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeInfoKHR dstBufferAt(long index, long value) { VH_dstBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeInfoKHR dstBufferOffsetAt(long index, long value) { VH_dstBufferOffset.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeInfoKHR dstBufferRangeAt(long index, long value) { VH_dstBufferRange.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeInfoKHR srcPictureResource$sTypeAt(long index, int value) { VH_srcPictureResource$sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeInfoKHR srcPictureResource$pNextAt(long index, MemorySegment value) { VH_srcPictureResource$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeInfoKHR srcPictureResource$codedOffset$xAt(long index, int value) { VH_srcPictureResource$codedOffset$x.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeInfoKHR srcPictureResource$codedOffset$yAt(long index, int value) { VH_srcPictureResource$codedOffset$y.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeInfoKHR srcPictureResource$codedExtent$widthAt(long index, int value) { VH_srcPictureResource$codedExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeInfoKHR srcPictureResource$codedExtent$heightAt(long index, int value) { VH_srcPictureResource$codedExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeInfoKHR srcPictureResource$baseArrayLayerAt(long index, int value) { VH_srcPictureResource$baseArrayLayer.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeInfoKHR srcPictureResource$imageViewBindingAt(long index, long value) { VH_srcPictureResource$imageViewBinding.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeInfoKHR pSetupReferenceSlotAt(long index, MemorySegment value) { VH_pSetupReferenceSlot.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeInfoKHR referenceSlotCountAt(long index, int value) { VH_referenceSlotCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeInfoKHR pReferenceSlotsAt(long index, MemorySegment value) { VH_pReferenceSlots.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeInfoKHR precedingExternallyEncodedBytesAt(long index, int value) { VH_precedingExternallyEncodedBytes.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeInfoKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeInfoKHR dstBuffer(long value) { VH_dstBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeInfoKHR dstBufferOffset(long value) { VH_dstBufferOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeInfoKHR dstBufferRange(long value) { VH_dstBufferRange.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeInfoKHR srcPictureResource$sType(int value) { VH_srcPictureResource$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeInfoKHR srcPictureResource$pNext(MemorySegment value) { VH_srcPictureResource$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeInfoKHR srcPictureResource$codedOffset$x(int value) { VH_srcPictureResource$codedOffset$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeInfoKHR srcPictureResource$codedOffset$y(int value) { VH_srcPictureResource$codedOffset$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeInfoKHR srcPictureResource$codedExtent$width(int value) { VH_srcPictureResource$codedExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeInfoKHR srcPictureResource$codedExtent$height(int value) { VH_srcPictureResource$codedExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeInfoKHR srcPictureResource$baseArrayLayer(int value) { VH_srcPictureResource$baseArrayLayer.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeInfoKHR srcPictureResource$imageViewBinding(long value) { VH_srcPictureResource$imageViewBinding.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeInfoKHR pSetupReferenceSlot(MemorySegment value) { VH_pSetupReferenceSlot.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeInfoKHR referenceSlotCount(int value) { VH_referenceSlotCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeInfoKHR pReferenceSlots(MemorySegment value) { VH_pReferenceSlots.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeInfoKHR precedingExternallyEncodedBytes(int value) { VH_precedingExternallyEncodedBytes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkVideoEncodeInfoKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeInfoKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _dstBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstBuffer, index), LAYOUT_dstBuffer); }
    public MemorySegment _dstBuffer() { return _dstBufferAt(0L); }
    public VkVideoEncodeInfoKHR _dstBufferAt(long index, MemorySegment src) { _dstBufferAt(index).copyFrom(src); return this; }
    public VkVideoEncodeInfoKHR _dstBuffer(MemorySegment src) { return _dstBufferAt(0L, src); }
    public MemorySegment _dstBufferOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstBufferOffset, index), LAYOUT_dstBufferOffset); }
    public MemorySegment _dstBufferOffset() { return _dstBufferOffsetAt(0L); }
    public VkVideoEncodeInfoKHR _dstBufferOffsetAt(long index, MemorySegment src) { _dstBufferOffsetAt(index).copyFrom(src); return this; }
    public VkVideoEncodeInfoKHR _dstBufferOffset(MemorySegment src) { return _dstBufferOffsetAt(0L, src); }
    public MemorySegment _dstBufferRangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstBufferRange, index), LAYOUT_dstBufferRange); }
    public MemorySegment _dstBufferRange() { return _dstBufferRangeAt(0L); }
    public VkVideoEncodeInfoKHR _dstBufferRangeAt(long index, MemorySegment src) { _dstBufferRangeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeInfoKHR _dstBufferRange(MemorySegment src) { return _dstBufferRangeAt(0L, src); }
    public MemorySegment _srcPictureResourceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcPictureResource, index), LAYOUT_srcPictureResource); }
    public MemorySegment _srcPictureResource() { return _srcPictureResourceAt(0L); }
    public VkVideoEncodeInfoKHR _srcPictureResourceAt(long index, MemorySegment src) { _srcPictureResourceAt(index).copyFrom(src); return this; }
    public VkVideoEncodeInfoKHR _srcPictureResource(MemorySegment src) { return _srcPictureResourceAt(0L, src); }
    public MemorySegment _pSetupReferenceSlotAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSetupReferenceSlot, index), LAYOUT_pSetupReferenceSlot); }
    public MemorySegment _pSetupReferenceSlot() { return _pSetupReferenceSlotAt(0L); }
    public VkVideoEncodeInfoKHR _pSetupReferenceSlotAt(long index, MemorySegment src) { _pSetupReferenceSlotAt(index).copyFrom(src); return this; }
    public VkVideoEncodeInfoKHR _pSetupReferenceSlot(MemorySegment src) { return _pSetupReferenceSlotAt(0L, src); }
    public MemorySegment _referenceSlotCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_referenceSlotCount, index), LAYOUT_referenceSlotCount); }
    public MemorySegment _referenceSlotCount() { return _referenceSlotCountAt(0L); }
    public VkVideoEncodeInfoKHR _referenceSlotCountAt(long index, MemorySegment src) { _referenceSlotCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeInfoKHR _referenceSlotCount(MemorySegment src) { return _referenceSlotCountAt(0L, src); }
    public MemorySegment _pReferenceSlotsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pReferenceSlots, index), LAYOUT_pReferenceSlots); }
    public MemorySegment _pReferenceSlots() { return _pReferenceSlotsAt(0L); }
    public VkVideoEncodeInfoKHR _pReferenceSlotsAt(long index, MemorySegment src) { _pReferenceSlotsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeInfoKHR _pReferenceSlots(MemorySegment src) { return _pReferenceSlotsAt(0L, src); }
    public MemorySegment _precedingExternallyEncodedBytesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_precedingExternallyEncodedBytes, index), LAYOUT_precedingExternallyEncodedBytes); }
    public MemorySegment _precedingExternallyEncodedBytes() { return _precedingExternallyEncodedBytesAt(0L); }
    public VkVideoEncodeInfoKHR _precedingExternallyEncodedBytesAt(long index, MemorySegment src) { _precedingExternallyEncodedBytesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeInfoKHR _precedingExternallyEncodedBytes(MemorySegment src) { return _precedingExternallyEncodedBytesAt(0L, src); }
}
