// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoBeginCodingInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoBeginCodingInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkVideoBeginCodingFlagsKHR flags;
///     VkVideoSessionKHR videoSession;
///     VkVideoSessionParametersKHR videoSessionParameters;
///     uint32_t referenceSlotCount;
///     const VkVideoReferenceSlotInfoKHR* pReferenceSlots;
/// }
/// ```
public final class VkVideoBeginCodingInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("videoSession"),
        ValueLayout.JAVA_LONG.withName("videoSessionParameters"),
        ValueLayout.JAVA_INT.withName("referenceSlotCount"),
        ValueLayout.ADDRESS.withName("pReferenceSlots")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_videoSession = LAYOUT.byteOffset(PathElement.groupElement("videoSession"));
    public static final long OFFSET_videoSessionParameters = LAYOUT.byteOffset(PathElement.groupElement("videoSessionParameters"));
    public static final long OFFSET_referenceSlotCount = LAYOUT.byteOffset(PathElement.groupElement("referenceSlotCount"));
    public static final long OFFSET_pReferenceSlots = LAYOUT.byteOffset(PathElement.groupElement("pReferenceSlots"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_videoSession = LAYOUT.select(PathElement.groupElement("videoSession"));
    public static final MemoryLayout LAYOUT_videoSessionParameters = LAYOUT.select(PathElement.groupElement("videoSessionParameters"));
    public static final MemoryLayout LAYOUT_referenceSlotCount = LAYOUT.select(PathElement.groupElement("referenceSlotCount"));
    public static final MemoryLayout LAYOUT_pReferenceSlots = LAYOUT.select(PathElement.groupElement("pReferenceSlots"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_videoSession = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoSession"));
    public static final VarHandle VH_videoSessionParameters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoSessionParameters"));
    public static final VarHandle VH_referenceSlotCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("referenceSlotCount"));
    public static final VarHandle VH_pReferenceSlots = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pReferenceSlots"));

    public VkVideoBeginCodingInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoBeginCodingInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoBeginCodingInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoBeginCodingInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoBeginCodingInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoBeginCodingInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoBeginCodingInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoBeginCodingInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoBeginCodingInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoBeginCodingInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoBeginCodingInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoBeginCodingInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR); }
    public static VkVideoBeginCodingInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR);
        return s;
    }
    public VkVideoBeginCodingInfoKHR copyFrom(VkVideoBeginCodingInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoBeginCodingInfoKHR reinterpret(long count) { return new VkVideoBeginCodingInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoBeginCodingInfoKHR asSlice(long index) { return new VkVideoBeginCodingInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoBeginCodingInfoKHR asSlice(long index, long count) { return new VkVideoBeginCodingInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoBeginCodingInfoKHR at(long index, Consumer<VkVideoBeginCodingInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long videoSessionAt(long index) { return (long) VH_videoSession.get(this.segment(), 0L, index); }
    public long videoSessionParametersAt(long index) { return (long) VH_videoSessionParameters.get(this.segment(), 0L, index); }
    public int referenceSlotCountAt(long index) { return (int) VH_referenceSlotCount.get(this.segment(), 0L, index); }
    public MemorySegment pReferenceSlotsAt(long index) { return (MemorySegment) VH_pReferenceSlots.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public long videoSession() { return (long) VH_videoSession.get(this.segment(), 0L, 0L); }
    public long videoSessionParameters() { return (long) VH_videoSessionParameters.get(this.segment(), 0L, 0L); }
    public int referenceSlotCount() { return (int) VH_referenceSlotCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pReferenceSlots() { return (MemorySegment) VH_pReferenceSlots.get(this.segment(), 0L, 0L); }
    public VkVideoBeginCodingInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoBeginCodingInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoBeginCodingInfoKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkVideoBeginCodingInfoKHR videoSessionAt(long index, long value) { VH_videoSession.set(this.segment(), 0L, index, value); return this; }
    public VkVideoBeginCodingInfoKHR videoSessionParametersAt(long index, long value) { VH_videoSessionParameters.set(this.segment(), 0L, index, value); return this; }
    public VkVideoBeginCodingInfoKHR referenceSlotCountAt(long index, int value) { VH_referenceSlotCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoBeginCodingInfoKHR pReferenceSlotsAt(long index, MemorySegment value) { VH_pReferenceSlots.set(this.segment(), 0L, index, value); return this; }
    public VkVideoBeginCodingInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoBeginCodingInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoBeginCodingInfoKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoBeginCodingInfoKHR videoSession(long value) { VH_videoSession.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoBeginCodingInfoKHR videoSessionParameters(long value) { VH_videoSessionParameters.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoBeginCodingInfoKHR referenceSlotCount(int value) { VH_referenceSlotCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoBeginCodingInfoKHR pReferenceSlots(MemorySegment value) { VH_pReferenceSlots.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoBeginCodingInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoBeginCodingInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoBeginCodingInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoBeginCodingInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkVideoBeginCodingInfoKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkVideoBeginCodingInfoKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _videoSessionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_videoSession, index), LAYOUT_videoSession); }
    public MemorySegment _videoSession() { return _videoSessionAt(0L); }
    public VkVideoBeginCodingInfoKHR _videoSessionAt(long index, MemorySegment src) { _videoSessionAt(index).copyFrom(src); return this; }
    public VkVideoBeginCodingInfoKHR _videoSession(MemorySegment src) { return _videoSessionAt(0L, src); }
    public MemorySegment _videoSessionParametersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_videoSessionParameters, index), LAYOUT_videoSessionParameters); }
    public MemorySegment _videoSessionParameters() { return _videoSessionParametersAt(0L); }
    public VkVideoBeginCodingInfoKHR _videoSessionParametersAt(long index, MemorySegment src) { _videoSessionParametersAt(index).copyFrom(src); return this; }
    public VkVideoBeginCodingInfoKHR _videoSessionParameters(MemorySegment src) { return _videoSessionParametersAt(0L, src); }
    public MemorySegment _referenceSlotCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_referenceSlotCount, index), LAYOUT_referenceSlotCount); }
    public MemorySegment _referenceSlotCount() { return _referenceSlotCountAt(0L); }
    public VkVideoBeginCodingInfoKHR _referenceSlotCountAt(long index, MemorySegment src) { _referenceSlotCountAt(index).copyFrom(src); return this; }
    public VkVideoBeginCodingInfoKHR _referenceSlotCount(MemorySegment src) { return _referenceSlotCountAt(0L, src); }
    public MemorySegment _pReferenceSlotsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pReferenceSlots, index), LAYOUT_pReferenceSlots); }
    public MemorySegment _pReferenceSlots() { return _pReferenceSlotsAt(0L); }
    public VkVideoBeginCodingInfoKHR _pReferenceSlotsAt(long index, MemorySegment src) { _pReferenceSlotsAt(index).copyFrom(src); return this; }
    public VkVideoBeginCodingInfoKHR _pReferenceSlots(MemorySegment src) { return _pReferenceSlotsAt(0L, src); }
}
