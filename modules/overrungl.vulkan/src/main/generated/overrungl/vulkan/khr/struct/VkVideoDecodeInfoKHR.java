// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoDecodeInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoDecodeInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkVideoDecodeFlagsKHR flags;
///     VkBuffer srcBuffer;
///     VkDeviceSize srcBufferOffset;
///     VkDeviceSize srcBufferRange;
///     VkVideoPictureResourceInfoKHR dstPictureResource;
///     const VkVideoReferenceSlotInfoKHR* pSetupReferenceSlot;
///     uint32_t referenceSlotCount;
///     const VkVideoReferenceSlotInfoKHR* pReferenceSlots;
/// }
/// ```
public final class VkVideoDecodeInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("srcBuffer"),
        ValueLayout.JAVA_LONG.withName("srcBufferOffset"),
        ValueLayout.JAVA_LONG.withName("srcBufferRange"),
        overrungl.vulkan.khr.struct.VkVideoPictureResourceInfoKHR.LAYOUT.withName("dstPictureResource"),
        ValueLayout.ADDRESS.withName("pSetupReferenceSlot"),
        ValueLayout.JAVA_INT.withName("referenceSlotCount"),
        ValueLayout.ADDRESS.withName("pReferenceSlots")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_srcBuffer = LAYOUT.byteOffset(PathElement.groupElement("srcBuffer"));
    public static final long OFFSET_srcBufferOffset = LAYOUT.byteOffset(PathElement.groupElement("srcBufferOffset"));
    public static final long OFFSET_srcBufferRange = LAYOUT.byteOffset(PathElement.groupElement("srcBufferRange"));
    public static final long OFFSET_dstPictureResource = LAYOUT.byteOffset(PathElement.groupElement("dstPictureResource"));
    public static final long OFFSET_pSetupReferenceSlot = LAYOUT.byteOffset(PathElement.groupElement("pSetupReferenceSlot"));
    public static final long OFFSET_referenceSlotCount = LAYOUT.byteOffset(PathElement.groupElement("referenceSlotCount"));
    public static final long OFFSET_pReferenceSlots = LAYOUT.byteOffset(PathElement.groupElement("pReferenceSlots"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_srcBuffer = LAYOUT.select(PathElement.groupElement("srcBuffer"));
    public static final MemoryLayout LAYOUT_srcBufferOffset = LAYOUT.select(PathElement.groupElement("srcBufferOffset"));
    public static final MemoryLayout LAYOUT_srcBufferRange = LAYOUT.select(PathElement.groupElement("srcBufferRange"));
    public static final MemoryLayout LAYOUT_dstPictureResource = LAYOUT.select(PathElement.groupElement("dstPictureResource"));
    public static final MemoryLayout LAYOUT_pSetupReferenceSlot = LAYOUT.select(PathElement.groupElement("pSetupReferenceSlot"));
    public static final MemoryLayout LAYOUT_referenceSlotCount = LAYOUT.select(PathElement.groupElement("referenceSlotCount"));
    public static final MemoryLayout LAYOUT_pReferenceSlots = LAYOUT.select(PathElement.groupElement("pReferenceSlots"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_srcBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcBuffer"));
    public static final VarHandle VH_srcBufferOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcBufferOffset"));
    public static final VarHandle VH_srcBufferRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcBufferRange"));
    public static final VarHandle VH_dstPictureResource$sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstPictureResource"), PathElement.groupElement("sType"));
    public static final VarHandle VH_dstPictureResource$pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstPictureResource"), PathElement.groupElement("pNext"));
    public static final VarHandle VH_dstPictureResource$codedOffset$x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstPictureResource"), PathElement.groupElement("codedOffset"), PathElement.groupElement("x"));
    public static final VarHandle VH_dstPictureResource$codedOffset$y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstPictureResource"), PathElement.groupElement("codedOffset"), PathElement.groupElement("y"));
    public static final VarHandle VH_dstPictureResource$codedExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstPictureResource"), PathElement.groupElement("codedExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_dstPictureResource$codedExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstPictureResource"), PathElement.groupElement("codedExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_dstPictureResource$baseArrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstPictureResource"), PathElement.groupElement("baseArrayLayer"));
    public static final VarHandle VH_dstPictureResource$imageViewBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstPictureResource"), PathElement.groupElement("imageViewBinding"));
    public static final VarHandle VH_pSetupReferenceSlot = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSetupReferenceSlot"));
    public static final VarHandle VH_referenceSlotCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("referenceSlotCount"));
    public static final VarHandle VH_pReferenceSlots = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pReferenceSlots"));

    public VkVideoDecodeInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoDecodeInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoDecodeInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoDecodeInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoDecodeInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoDecodeInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoDecodeInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoDecodeQueue.VK_STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR); }
    public static VkVideoDecodeInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoDecodeQueue.VK_STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR);
        return s;
    }
    public VkVideoDecodeInfoKHR copyFrom(VkVideoDecodeInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoDecodeInfoKHR reinterpret(long count) { return new VkVideoDecodeInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoDecodeInfoKHR asSlice(long index) { return new VkVideoDecodeInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoDecodeInfoKHR asSlice(long index, long count) { return new VkVideoDecodeInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoDecodeInfoKHR at(long index, Consumer<VkVideoDecodeInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long srcBufferAt(long index) { return (long) VH_srcBuffer.get(this.segment(), 0L, index); }
    public long srcBufferOffsetAt(long index) { return (long) VH_srcBufferOffset.get(this.segment(), 0L, index); }
    public long srcBufferRangeAt(long index) { return (long) VH_srcBufferRange.get(this.segment(), 0L, index); }
    public int dstPictureResource$sTypeAt(long index) { return (int) VH_dstPictureResource$sType.get(this.segment(), 0L, index); }
    public MemorySegment dstPictureResource$pNextAt(long index) { return (MemorySegment) VH_dstPictureResource$pNext.get(this.segment(), 0L, index); }
    public int dstPictureResource$codedOffset$xAt(long index) { return (int) VH_dstPictureResource$codedOffset$x.get(this.segment(), 0L, index); }
    public int dstPictureResource$codedOffset$yAt(long index) { return (int) VH_dstPictureResource$codedOffset$y.get(this.segment(), 0L, index); }
    public int dstPictureResource$codedExtent$widthAt(long index) { return (int) VH_dstPictureResource$codedExtent$width.get(this.segment(), 0L, index); }
    public int dstPictureResource$codedExtent$heightAt(long index) { return (int) VH_dstPictureResource$codedExtent$height.get(this.segment(), 0L, index); }
    public int dstPictureResource$baseArrayLayerAt(long index) { return (int) VH_dstPictureResource$baseArrayLayer.get(this.segment(), 0L, index); }
    public long dstPictureResource$imageViewBindingAt(long index) { return (long) VH_dstPictureResource$imageViewBinding.get(this.segment(), 0L, index); }
    public MemorySegment pSetupReferenceSlotAt(long index) { return (MemorySegment) VH_pSetupReferenceSlot.get(this.segment(), 0L, index); }
    public int referenceSlotCountAt(long index) { return (int) VH_referenceSlotCount.get(this.segment(), 0L, index); }
    public MemorySegment pReferenceSlotsAt(long index) { return (MemorySegment) VH_pReferenceSlots.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public long srcBuffer() { return (long) VH_srcBuffer.get(this.segment(), 0L, 0L); }
    public long srcBufferOffset() { return (long) VH_srcBufferOffset.get(this.segment(), 0L, 0L); }
    public long srcBufferRange() { return (long) VH_srcBufferRange.get(this.segment(), 0L, 0L); }
    public int dstPictureResource$sType() { return (int) VH_dstPictureResource$sType.get(this.segment(), 0L, 0L); }
    public MemorySegment dstPictureResource$pNext() { return (MemorySegment) VH_dstPictureResource$pNext.get(this.segment(), 0L, 0L); }
    public int dstPictureResource$codedOffset$x() { return (int) VH_dstPictureResource$codedOffset$x.get(this.segment(), 0L, 0L); }
    public int dstPictureResource$codedOffset$y() { return (int) VH_dstPictureResource$codedOffset$y.get(this.segment(), 0L, 0L); }
    public int dstPictureResource$codedExtent$width() { return (int) VH_dstPictureResource$codedExtent$width.get(this.segment(), 0L, 0L); }
    public int dstPictureResource$codedExtent$height() { return (int) VH_dstPictureResource$codedExtent$height.get(this.segment(), 0L, 0L); }
    public int dstPictureResource$baseArrayLayer() { return (int) VH_dstPictureResource$baseArrayLayer.get(this.segment(), 0L, 0L); }
    public long dstPictureResource$imageViewBinding() { return (long) VH_dstPictureResource$imageViewBinding.get(this.segment(), 0L, 0L); }
    public MemorySegment pSetupReferenceSlot() { return (MemorySegment) VH_pSetupReferenceSlot.get(this.segment(), 0L, 0L); }
    public int referenceSlotCount() { return (int) VH_referenceSlotCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pReferenceSlots() { return (MemorySegment) VH_pReferenceSlots.get(this.segment(), 0L, 0L); }
    public VkVideoDecodeInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeInfoKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeInfoKHR srcBufferAt(long index, long value) { VH_srcBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeInfoKHR srcBufferOffsetAt(long index, long value) { VH_srcBufferOffset.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeInfoKHR srcBufferRangeAt(long index, long value) { VH_srcBufferRange.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeInfoKHR dstPictureResource$sTypeAt(long index, int value) { VH_dstPictureResource$sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeInfoKHR dstPictureResource$pNextAt(long index, MemorySegment value) { VH_dstPictureResource$pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeInfoKHR dstPictureResource$codedOffset$xAt(long index, int value) { VH_dstPictureResource$codedOffset$x.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeInfoKHR dstPictureResource$codedOffset$yAt(long index, int value) { VH_dstPictureResource$codedOffset$y.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeInfoKHR dstPictureResource$codedExtent$widthAt(long index, int value) { VH_dstPictureResource$codedExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeInfoKHR dstPictureResource$codedExtent$heightAt(long index, int value) { VH_dstPictureResource$codedExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeInfoKHR dstPictureResource$baseArrayLayerAt(long index, int value) { VH_dstPictureResource$baseArrayLayer.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeInfoKHR dstPictureResource$imageViewBindingAt(long index, long value) { VH_dstPictureResource$imageViewBinding.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeInfoKHR pSetupReferenceSlotAt(long index, MemorySegment value) { VH_pSetupReferenceSlot.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeInfoKHR referenceSlotCountAt(long index, int value) { VH_referenceSlotCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeInfoKHR pReferenceSlotsAt(long index, MemorySegment value) { VH_pReferenceSlots.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeInfoKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeInfoKHR srcBuffer(long value) { VH_srcBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeInfoKHR srcBufferOffset(long value) { VH_srcBufferOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeInfoKHR srcBufferRange(long value) { VH_srcBufferRange.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeInfoKHR dstPictureResource$sType(int value) { VH_dstPictureResource$sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeInfoKHR dstPictureResource$pNext(MemorySegment value) { VH_dstPictureResource$pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeInfoKHR dstPictureResource$codedOffset$x(int value) { VH_dstPictureResource$codedOffset$x.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeInfoKHR dstPictureResource$codedOffset$y(int value) { VH_dstPictureResource$codedOffset$y.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeInfoKHR dstPictureResource$codedExtent$width(int value) { VH_dstPictureResource$codedExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeInfoKHR dstPictureResource$codedExtent$height(int value) { VH_dstPictureResource$codedExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeInfoKHR dstPictureResource$baseArrayLayer(int value) { VH_dstPictureResource$baseArrayLayer.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeInfoKHR dstPictureResource$imageViewBinding(long value) { VH_dstPictureResource$imageViewBinding.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeInfoKHR pSetupReferenceSlot(MemorySegment value) { VH_pSetupReferenceSlot.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeInfoKHR referenceSlotCount(int value) { VH_referenceSlotCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeInfoKHR pReferenceSlots(MemorySegment value) { VH_pReferenceSlots.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoDecodeInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoDecodeInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoDecodeInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoDecodeInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkVideoDecodeInfoKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkVideoDecodeInfoKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _srcBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcBuffer, index), LAYOUT_srcBuffer); }
    public MemorySegment _srcBuffer() { return _srcBufferAt(0L); }
    public VkVideoDecodeInfoKHR _srcBufferAt(long index, MemorySegment src) { _srcBufferAt(index).copyFrom(src); return this; }
    public VkVideoDecodeInfoKHR _srcBuffer(MemorySegment src) { return _srcBufferAt(0L, src); }
    public MemorySegment _srcBufferOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcBufferOffset, index), LAYOUT_srcBufferOffset); }
    public MemorySegment _srcBufferOffset() { return _srcBufferOffsetAt(0L); }
    public VkVideoDecodeInfoKHR _srcBufferOffsetAt(long index, MemorySegment src) { _srcBufferOffsetAt(index).copyFrom(src); return this; }
    public VkVideoDecodeInfoKHR _srcBufferOffset(MemorySegment src) { return _srcBufferOffsetAt(0L, src); }
    public MemorySegment _srcBufferRangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcBufferRange, index), LAYOUT_srcBufferRange); }
    public MemorySegment _srcBufferRange() { return _srcBufferRangeAt(0L); }
    public VkVideoDecodeInfoKHR _srcBufferRangeAt(long index, MemorySegment src) { _srcBufferRangeAt(index).copyFrom(src); return this; }
    public VkVideoDecodeInfoKHR _srcBufferRange(MemorySegment src) { return _srcBufferRangeAt(0L, src); }
    public MemorySegment _dstPictureResourceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstPictureResource, index), LAYOUT_dstPictureResource); }
    public MemorySegment _dstPictureResource() { return _dstPictureResourceAt(0L); }
    public VkVideoDecodeInfoKHR _dstPictureResourceAt(long index, MemorySegment src) { _dstPictureResourceAt(index).copyFrom(src); return this; }
    public VkVideoDecodeInfoKHR _dstPictureResource(MemorySegment src) { return _dstPictureResourceAt(0L, src); }
    public MemorySegment _pSetupReferenceSlotAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSetupReferenceSlot, index), LAYOUT_pSetupReferenceSlot); }
    public MemorySegment _pSetupReferenceSlot() { return _pSetupReferenceSlotAt(0L); }
    public VkVideoDecodeInfoKHR _pSetupReferenceSlotAt(long index, MemorySegment src) { _pSetupReferenceSlotAt(index).copyFrom(src); return this; }
    public VkVideoDecodeInfoKHR _pSetupReferenceSlot(MemorySegment src) { return _pSetupReferenceSlotAt(0L, src); }
    public MemorySegment _referenceSlotCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_referenceSlotCount, index), LAYOUT_referenceSlotCount); }
    public MemorySegment _referenceSlotCount() { return _referenceSlotCountAt(0L); }
    public VkVideoDecodeInfoKHR _referenceSlotCountAt(long index, MemorySegment src) { _referenceSlotCountAt(index).copyFrom(src); return this; }
    public VkVideoDecodeInfoKHR _referenceSlotCount(MemorySegment src) { return _referenceSlotCountAt(0L, src); }
    public MemorySegment _pReferenceSlotsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pReferenceSlots, index), LAYOUT_pReferenceSlots); }
    public MemorySegment _pReferenceSlots() { return _pReferenceSlotsAt(0L); }
    public VkVideoDecodeInfoKHR _pReferenceSlotsAt(long index, MemorySegment src) { _pReferenceSlotsAt(index).copyFrom(src); return this; }
    public VkVideoDecodeInfoKHR _pReferenceSlots(MemorySegment src) { return _pReferenceSlotsAt(0L, src); }
}
