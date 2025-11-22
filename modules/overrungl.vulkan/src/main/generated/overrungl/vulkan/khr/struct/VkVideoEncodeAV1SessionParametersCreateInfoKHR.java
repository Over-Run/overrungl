// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeAV1SessionParametersCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeAV1SessionParametersCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     const StdVideoAV1SequenceHeader* pStdSequenceHeader;
///     const StdVideoEncodeAV1DecoderModelInfo* pStdDecoderModelInfo;
///     uint32_t stdOperatingPointCount;
///     const StdVideoEncodeAV1OperatingPointInfo* pStdOperatingPoints;
/// }
/// ```
public final class VkVideoEncodeAV1SessionParametersCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pStdSequenceHeader"),
        ValueLayout.ADDRESS.withName("pStdDecoderModelInfo"),
        ValueLayout.JAVA_INT.withName("stdOperatingPointCount"),
        ValueLayout.ADDRESS.withName("pStdOperatingPoints")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pStdSequenceHeader = LAYOUT.byteOffset(PathElement.groupElement("pStdSequenceHeader"));
    public static final long OFFSET_pStdDecoderModelInfo = LAYOUT.byteOffset(PathElement.groupElement("pStdDecoderModelInfo"));
    public static final long OFFSET_stdOperatingPointCount = LAYOUT.byteOffset(PathElement.groupElement("stdOperatingPointCount"));
    public static final long OFFSET_pStdOperatingPoints = LAYOUT.byteOffset(PathElement.groupElement("pStdOperatingPoints"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pStdSequenceHeader = LAYOUT.select(PathElement.groupElement("pStdSequenceHeader"));
    public static final MemoryLayout LAYOUT_pStdDecoderModelInfo = LAYOUT.select(PathElement.groupElement("pStdDecoderModelInfo"));
    public static final MemoryLayout LAYOUT_stdOperatingPointCount = LAYOUT.select(PathElement.groupElement("stdOperatingPointCount"));
    public static final MemoryLayout LAYOUT_pStdOperatingPoints = LAYOUT.select(PathElement.groupElement("pStdOperatingPoints"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pStdSequenceHeader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdSequenceHeader"));
    public static final VarHandle VH_pStdDecoderModelInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdDecoderModelInfo"));
    public static final VarHandle VH_stdOperatingPointCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdOperatingPointCount"));
    public static final VarHandle VH_pStdOperatingPoints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdOperatingPoints"));

    public VkVideoEncodeAV1SessionParametersCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1SessionParametersCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1SessionParametersCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1SessionParametersCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeAv1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR); }
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeAv1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR);
        return s;
    }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR copyFrom(VkVideoEncodeAV1SessionParametersCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR reinterpret(long count) { return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR asSlice(long index) { return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR asSlice(long index, long count) { return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR at(long index, Consumer<VkVideoEncodeAV1SessionParametersCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pStdSequenceHeaderAt(long index) { return (MemorySegment) VH_pStdSequenceHeader.get(this.segment(), 0L, index); }
    public MemorySegment pStdDecoderModelInfoAt(long index) { return (MemorySegment) VH_pStdDecoderModelInfo.get(this.segment(), 0L, index); }
    public int stdOperatingPointCountAt(long index) { return (int) VH_stdOperatingPointCount.get(this.segment(), 0L, index); }
    public MemorySegment pStdOperatingPointsAt(long index) { return (MemorySegment) VH_pStdOperatingPoints.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pStdSequenceHeader() { return (MemorySegment) VH_pStdSequenceHeader.get(this.segment(), 0L, 0L); }
    public MemorySegment pStdDecoderModelInfo() { return (MemorySegment) VH_pStdDecoderModelInfo.get(this.segment(), 0L, 0L); }
    public int stdOperatingPointCount() { return (int) VH_stdOperatingPointCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pStdOperatingPoints() { return (MemorySegment) VH_pStdOperatingPoints.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdSequenceHeaderAt(long index, MemorySegment value) { VH_pStdSequenceHeader.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdDecoderModelInfoAt(long index, MemorySegment value) { VH_pStdDecoderModelInfo.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR stdOperatingPointCountAt(long index, int value) { VH_stdOperatingPointCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdOperatingPointsAt(long index, MemorySegment value) { VH_pStdOperatingPoints.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdSequenceHeader(MemorySegment value) { VH_pStdSequenceHeader.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdDecoderModelInfo(MemorySegment value) { VH_pStdDecoderModelInfo.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR stdOperatingPointCount(int value) { VH_stdOperatingPointCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdOperatingPoints(MemorySegment value) { VH_pStdOperatingPoints.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pStdSequenceHeaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStdSequenceHeader, index), LAYOUT_pStdSequenceHeader); }
    public MemorySegment _pStdSequenceHeader() { return _pStdSequenceHeaderAt(0L); }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR _pStdSequenceHeaderAt(long index, MemorySegment src) { _pStdSequenceHeaderAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR _pStdSequenceHeader(MemorySegment src) { return _pStdSequenceHeaderAt(0L, src); }
    public MemorySegment _pStdDecoderModelInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStdDecoderModelInfo, index), LAYOUT_pStdDecoderModelInfo); }
    public MemorySegment _pStdDecoderModelInfo() { return _pStdDecoderModelInfoAt(0L); }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR _pStdDecoderModelInfoAt(long index, MemorySegment src) { _pStdDecoderModelInfoAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR _pStdDecoderModelInfo(MemorySegment src) { return _pStdDecoderModelInfoAt(0L, src); }
    public MemorySegment _stdOperatingPointCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stdOperatingPointCount, index), LAYOUT_stdOperatingPointCount); }
    public MemorySegment _stdOperatingPointCount() { return _stdOperatingPointCountAt(0L); }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR _stdOperatingPointCountAt(long index, MemorySegment src) { _stdOperatingPointCountAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR _stdOperatingPointCount(MemorySegment src) { return _stdOperatingPointCountAt(0L, src); }
    public MemorySegment _pStdOperatingPointsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStdOperatingPoints, index), LAYOUT_pStdOperatingPoints); }
    public MemorySegment _pStdOperatingPoints() { return _pStdOperatingPointsAt(0L); }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR _pStdOperatingPointsAt(long index, MemorySegment src) { _pStdOperatingPointsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR _pStdOperatingPoints(MemorySegment src) { return _pStdOperatingPointsAt(0L, src); }
}
