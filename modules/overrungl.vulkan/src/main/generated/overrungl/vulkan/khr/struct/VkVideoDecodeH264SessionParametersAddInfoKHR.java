// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoDecodeH264SessionParametersAddInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoDecodeH264SessionParametersAddInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t stdSPSCount;
///     const StdVideoH264SequenceParameterSet* pStdSPSs;
///     uint32_t stdPPSCount;
///     const StdVideoH264PictureParameterSet* pStdPPSs;
/// }
/// ```
public final class VkVideoDecodeH264SessionParametersAddInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stdSPSCount"),
        ValueLayout.ADDRESS.withName("pStdSPSs"),
        ValueLayout.JAVA_INT.withName("stdPPSCount"),
        ValueLayout.ADDRESS.withName("pStdPPSs")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_stdSPSCount = LAYOUT.byteOffset(PathElement.groupElement("stdSPSCount"));
    public static final long OFFSET_pStdSPSs = LAYOUT.byteOffset(PathElement.groupElement("pStdSPSs"));
    public static final long OFFSET_stdPPSCount = LAYOUT.byteOffset(PathElement.groupElement("stdPPSCount"));
    public static final long OFFSET_pStdPPSs = LAYOUT.byteOffset(PathElement.groupElement("pStdPPSs"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_stdSPSCount = LAYOUT.select(PathElement.groupElement("stdSPSCount"));
    public static final MemoryLayout LAYOUT_pStdSPSs = LAYOUT.select(PathElement.groupElement("pStdSPSs"));
    public static final MemoryLayout LAYOUT_stdPPSCount = LAYOUT.select(PathElement.groupElement("stdPPSCount"));
    public static final MemoryLayout LAYOUT_pStdPPSs = LAYOUT.select(PathElement.groupElement("pStdPPSs"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_stdSPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdSPSCount"));
    public static final VarHandle VH_pStdSPSs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdSPSs"));
    public static final VarHandle VH_stdPPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdPPSCount"));
    public static final VarHandle VH_pStdPPSs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPPSs"));

    public VkVideoDecodeH264SessionParametersAddInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoDecodeH264SessionParametersAddInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH264SessionParametersAddInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoDecodeH264SessionParametersAddInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH264SessionParametersAddInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoDecodeH264SessionParametersAddInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH264SessionParametersAddInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoDecodeH264SessionParametersAddInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeH264SessionParametersAddInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoDecodeH264SessionParametersAddInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeH264SessionParametersAddInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoDecodeH264SessionParametersAddInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR); }
    public static VkVideoDecodeH264SessionParametersAddInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR);
        return s;
    }
    public VkVideoDecodeH264SessionParametersAddInfoKHR copyFrom(VkVideoDecodeH264SessionParametersAddInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoDecodeH264SessionParametersAddInfoKHR reinterpret(long count) { return new VkVideoDecodeH264SessionParametersAddInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoDecodeH264SessionParametersAddInfoKHR asSlice(long index) { return new VkVideoDecodeH264SessionParametersAddInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoDecodeH264SessionParametersAddInfoKHR asSlice(long index, long count) { return new VkVideoDecodeH264SessionParametersAddInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoDecodeH264SessionParametersAddInfoKHR at(long index, Consumer<VkVideoDecodeH264SessionParametersAddInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int stdSPSCountAt(long index) { return (int) VH_stdSPSCount.get(this.segment(), 0L, index); }
    public MemorySegment pStdSPSsAt(long index) { return (MemorySegment) VH_pStdSPSs.get(this.segment(), 0L, index); }
    public int stdPPSCountAt(long index) { return (int) VH_stdPPSCount.get(this.segment(), 0L, index); }
    public MemorySegment pStdPPSsAt(long index) { return (MemorySegment) VH_pStdPPSs.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int stdSPSCount() { return (int) VH_stdSPSCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pStdSPSs() { return (MemorySegment) VH_pStdSPSs.get(this.segment(), 0L, 0L); }
    public int stdPPSCount() { return (int) VH_stdPPSCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pStdPPSs() { return (MemorySegment) VH_pStdPPSs.get(this.segment(), 0L, 0L); }
    public VkVideoDecodeH264SessionParametersAddInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH264SessionParametersAddInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH264SessionParametersAddInfoKHR stdSPSCountAt(long index, int value) { VH_stdSPSCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH264SessionParametersAddInfoKHR pStdSPSsAt(long index, MemorySegment value) { VH_pStdSPSs.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH264SessionParametersAddInfoKHR stdPPSCountAt(long index, int value) { VH_stdPPSCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH264SessionParametersAddInfoKHR pStdPPSsAt(long index, MemorySegment value) { VH_pStdPPSs.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH264SessionParametersAddInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH264SessionParametersAddInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH264SessionParametersAddInfoKHR stdSPSCount(int value) { VH_stdSPSCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH264SessionParametersAddInfoKHR pStdSPSs(MemorySegment value) { VH_pStdSPSs.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH264SessionParametersAddInfoKHR stdPPSCount(int value) { VH_stdPPSCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH264SessionParametersAddInfoKHR pStdPPSs(MemorySegment value) { VH_pStdPPSs.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoDecodeH264SessionParametersAddInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH264SessionParametersAddInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoDecodeH264SessionParametersAddInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH264SessionParametersAddInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _stdSPSCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stdSPSCount, index), LAYOUT_stdSPSCount); }
    public MemorySegment _stdSPSCount() { return _stdSPSCountAt(0L); }
    public VkVideoDecodeH264SessionParametersAddInfoKHR _stdSPSCountAt(long index, MemorySegment src) { _stdSPSCountAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH264SessionParametersAddInfoKHR _stdSPSCount(MemorySegment src) { return _stdSPSCountAt(0L, src); }
    public MemorySegment _pStdSPSsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStdSPSs, index), LAYOUT_pStdSPSs); }
    public MemorySegment _pStdSPSs() { return _pStdSPSsAt(0L); }
    public VkVideoDecodeH264SessionParametersAddInfoKHR _pStdSPSsAt(long index, MemorySegment src) { _pStdSPSsAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH264SessionParametersAddInfoKHR _pStdSPSs(MemorySegment src) { return _pStdSPSsAt(0L, src); }
    public MemorySegment _stdPPSCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stdPPSCount, index), LAYOUT_stdPPSCount); }
    public MemorySegment _stdPPSCount() { return _stdPPSCountAt(0L); }
    public VkVideoDecodeH264SessionParametersAddInfoKHR _stdPPSCountAt(long index, MemorySegment src) { _stdPPSCountAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH264SessionParametersAddInfoKHR _stdPPSCount(MemorySegment src) { return _stdPPSCountAt(0L, src); }
    public MemorySegment _pStdPPSsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStdPPSs, index), LAYOUT_pStdPPSs); }
    public MemorySegment _pStdPPSs() { return _pStdPPSsAt(0L); }
    public VkVideoDecodeH264SessionParametersAddInfoKHR _pStdPPSsAt(long index, MemorySegment src) { _pStdPPSsAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH264SessionParametersAddInfoKHR _pStdPPSs(MemorySegment src) { return _pStdPPSsAt(0L, src); }
}
