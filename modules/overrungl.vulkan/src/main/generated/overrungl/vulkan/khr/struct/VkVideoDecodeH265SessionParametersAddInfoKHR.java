// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoDecodeH265SessionParametersAddInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoDecodeH265SessionParametersAddInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t stdVPSCount;
///     const StdVideoH265VideoParameterSet* pStdVPSs;
///     uint32_t stdSPSCount;
///     const StdVideoH265SequenceParameterSet* pStdSPSs;
///     uint32_t stdPPSCount;
///     const StdVideoH265PictureParameterSet* pStdPPSs;
/// }
/// ```
public final class VkVideoDecodeH265SessionParametersAddInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stdVPSCount"),
        ValueLayout.ADDRESS.withName("pStdVPSs"),
        ValueLayout.JAVA_INT.withName("stdSPSCount"),
        ValueLayout.ADDRESS.withName("pStdSPSs"),
        ValueLayout.JAVA_INT.withName("stdPPSCount"),
        ValueLayout.ADDRESS.withName("pStdPPSs")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_stdVPSCount = LAYOUT.byteOffset(PathElement.groupElement("stdVPSCount"));
    public static final long OFFSET_pStdVPSs = LAYOUT.byteOffset(PathElement.groupElement("pStdVPSs"));
    public static final long OFFSET_stdSPSCount = LAYOUT.byteOffset(PathElement.groupElement("stdSPSCount"));
    public static final long OFFSET_pStdSPSs = LAYOUT.byteOffset(PathElement.groupElement("pStdSPSs"));
    public static final long OFFSET_stdPPSCount = LAYOUT.byteOffset(PathElement.groupElement("stdPPSCount"));
    public static final long OFFSET_pStdPPSs = LAYOUT.byteOffset(PathElement.groupElement("pStdPPSs"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_stdVPSCount = LAYOUT.select(PathElement.groupElement("stdVPSCount"));
    public static final MemoryLayout LAYOUT_pStdVPSs = LAYOUT.select(PathElement.groupElement("pStdVPSs"));
    public static final MemoryLayout LAYOUT_stdSPSCount = LAYOUT.select(PathElement.groupElement("stdSPSCount"));
    public static final MemoryLayout LAYOUT_pStdSPSs = LAYOUT.select(PathElement.groupElement("pStdSPSs"));
    public static final MemoryLayout LAYOUT_stdPPSCount = LAYOUT.select(PathElement.groupElement("stdPPSCount"));
    public static final MemoryLayout LAYOUT_pStdPPSs = LAYOUT.select(PathElement.groupElement("pStdPPSs"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_stdVPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdVPSCount"));
    public static final VarHandle VH_pStdVPSs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdVPSs"));
    public static final VarHandle VH_stdSPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdSPSCount"));
    public static final VarHandle VH_pStdSPSs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdSPSs"));
    public static final VarHandle VH_stdPPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdPPSCount"));
    public static final VarHandle VH_pStdPPSs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPPSs"));

    public VkVideoDecodeH265SessionParametersAddInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoDecodeH265SessionParametersAddInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265SessionParametersAddInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoDecodeH265SessionParametersAddInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265SessionParametersAddInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoDecodeH265SessionParametersAddInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265SessionParametersAddInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoDecodeH265SessionParametersAddInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeH265SessionParametersAddInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoDecodeH265SessionParametersAddInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeH265SessionParametersAddInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoDecodeH265SessionParametersAddInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR); }
    public static VkVideoDecodeH265SessionParametersAddInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR);
        return s;
    }
    public VkVideoDecodeH265SessionParametersAddInfoKHR copyFrom(VkVideoDecodeH265SessionParametersAddInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR reinterpret(long count) { return new VkVideoDecodeH265SessionParametersAddInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoDecodeH265SessionParametersAddInfoKHR asSlice(long index) { return new VkVideoDecodeH265SessionParametersAddInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoDecodeH265SessionParametersAddInfoKHR asSlice(long index, long count) { return new VkVideoDecodeH265SessionParametersAddInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoDecodeH265SessionParametersAddInfoKHR at(long index, Consumer<VkVideoDecodeH265SessionParametersAddInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int stdVPSCountAt(long index) { return (int) VH_stdVPSCount.get(this.segment(), 0L, index); }
    public MemorySegment pStdVPSsAt(long index) { return (MemorySegment) VH_pStdVPSs.get(this.segment(), 0L, index); }
    public int stdSPSCountAt(long index) { return (int) VH_stdSPSCount.get(this.segment(), 0L, index); }
    public MemorySegment pStdSPSsAt(long index) { return (MemorySegment) VH_pStdSPSs.get(this.segment(), 0L, index); }
    public int stdPPSCountAt(long index) { return (int) VH_stdPPSCount.get(this.segment(), 0L, index); }
    public MemorySegment pStdPPSsAt(long index) { return (MemorySegment) VH_pStdPPSs.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int stdVPSCount() { return (int) VH_stdVPSCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pStdVPSs() { return (MemorySegment) VH_pStdVPSs.get(this.segment(), 0L, 0L); }
    public int stdSPSCount() { return (int) VH_stdSPSCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pStdSPSs() { return (MemorySegment) VH_pStdSPSs.get(this.segment(), 0L, 0L); }
    public int stdPPSCount() { return (int) VH_stdPPSCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pStdPPSs() { return (MemorySegment) VH_pStdPPSs.get(this.segment(), 0L, 0L); }
    public VkVideoDecodeH265SessionParametersAddInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR stdVPSCountAt(long index, int value) { VH_stdVPSCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR pStdVPSsAt(long index, MemorySegment value) { VH_pStdVPSs.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR stdSPSCountAt(long index, int value) { VH_stdSPSCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR pStdSPSsAt(long index, MemorySegment value) { VH_pStdSPSs.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR stdPPSCountAt(long index, int value) { VH_stdPPSCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR pStdPPSsAt(long index, MemorySegment value) { VH_pStdPPSs.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR stdVPSCount(int value) { VH_stdVPSCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR pStdVPSs(MemorySegment value) { VH_pStdVPSs.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR stdSPSCount(int value) { VH_stdSPSCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR pStdSPSs(MemorySegment value) { VH_pStdSPSs.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR stdPPSCount(int value) { VH_stdPPSCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR pStdPPSs(MemorySegment value) { VH_pStdPPSs.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoDecodeH265SessionParametersAddInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoDecodeH265SessionParametersAddInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _stdVPSCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stdVPSCount, index), LAYOUT_stdVPSCount); }
    public MemorySegment _stdVPSCount() { return _stdVPSCountAt(0L); }
    public VkVideoDecodeH265SessionParametersAddInfoKHR _stdVPSCountAt(long index, MemorySegment src) { _stdVPSCountAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR _stdVPSCount(MemorySegment src) { return _stdVPSCountAt(0L, src); }
    public MemorySegment _pStdVPSsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStdVPSs, index), LAYOUT_pStdVPSs); }
    public MemorySegment _pStdVPSs() { return _pStdVPSsAt(0L); }
    public VkVideoDecodeH265SessionParametersAddInfoKHR _pStdVPSsAt(long index, MemorySegment src) { _pStdVPSsAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR _pStdVPSs(MemorySegment src) { return _pStdVPSsAt(0L, src); }
    public MemorySegment _stdSPSCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stdSPSCount, index), LAYOUT_stdSPSCount); }
    public MemorySegment _stdSPSCount() { return _stdSPSCountAt(0L); }
    public VkVideoDecodeH265SessionParametersAddInfoKHR _stdSPSCountAt(long index, MemorySegment src) { _stdSPSCountAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR _stdSPSCount(MemorySegment src) { return _stdSPSCountAt(0L, src); }
    public MemorySegment _pStdSPSsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStdSPSs, index), LAYOUT_pStdSPSs); }
    public MemorySegment _pStdSPSs() { return _pStdSPSsAt(0L); }
    public VkVideoDecodeH265SessionParametersAddInfoKHR _pStdSPSsAt(long index, MemorySegment src) { _pStdSPSsAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR _pStdSPSs(MemorySegment src) { return _pStdSPSsAt(0L, src); }
    public MemorySegment _stdPPSCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stdPPSCount, index), LAYOUT_stdPPSCount); }
    public MemorySegment _stdPPSCount() { return _stdPPSCountAt(0L); }
    public VkVideoDecodeH265SessionParametersAddInfoKHR _stdPPSCountAt(long index, MemorySegment src) { _stdPPSCountAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR _stdPPSCount(MemorySegment src) { return _stdPPSCountAt(0L, src); }
    public MemorySegment _pStdPPSsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStdPPSs, index), LAYOUT_pStdPPSs); }
    public MemorySegment _pStdPPSs() { return _pStdPPSsAt(0L); }
    public VkVideoDecodeH265SessionParametersAddInfoKHR _pStdPPSsAt(long index, MemorySegment src) { _pStdPPSsAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265SessionParametersAddInfoKHR _pStdPPSs(MemorySegment src) { return _pStdPPSsAt(0L, src); }
}
