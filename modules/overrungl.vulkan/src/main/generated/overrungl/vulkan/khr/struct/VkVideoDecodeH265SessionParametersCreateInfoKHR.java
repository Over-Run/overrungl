// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoDecodeH265SessionParametersCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoDecodeH265SessionParametersCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t maxStdVPSCount;
///     uint32_t maxStdSPSCount;
///     uint32_t maxStdPPSCount;
///     const VkVideoDecodeH265SessionParametersAddInfoKHR* pParametersAddInfo;
/// }
/// ```
public final class VkVideoDecodeH265SessionParametersCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxStdVPSCount"),
        ValueLayout.JAVA_INT.withName("maxStdSPSCount"),
        ValueLayout.JAVA_INT.withName("maxStdPPSCount"),
        ValueLayout.ADDRESS.withName("pParametersAddInfo")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxStdVPSCount = LAYOUT.byteOffset(PathElement.groupElement("maxStdVPSCount"));
    public static final long OFFSET_maxStdSPSCount = LAYOUT.byteOffset(PathElement.groupElement("maxStdSPSCount"));
    public static final long OFFSET_maxStdPPSCount = LAYOUT.byteOffset(PathElement.groupElement("maxStdPPSCount"));
    public static final long OFFSET_pParametersAddInfo = LAYOUT.byteOffset(PathElement.groupElement("pParametersAddInfo"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxStdVPSCount = LAYOUT.select(PathElement.groupElement("maxStdVPSCount"));
    public static final MemoryLayout LAYOUT_maxStdSPSCount = LAYOUT.select(PathElement.groupElement("maxStdSPSCount"));
    public static final MemoryLayout LAYOUT_maxStdPPSCount = LAYOUT.select(PathElement.groupElement("maxStdPPSCount"));
    public static final MemoryLayout LAYOUT_pParametersAddInfo = LAYOUT.select(PathElement.groupElement("pParametersAddInfo"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxStdVPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxStdVPSCount"));
    public static final VarHandle VH_maxStdSPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxStdSPSCount"));
    public static final VarHandle VH_maxStdPPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxStdPPSCount"));
    public static final VarHandle VH_pParametersAddInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pParametersAddInfo"));

    public VkVideoDecodeH265SessionParametersCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoDecodeH265SessionParametersCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265SessionParametersCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoDecodeH265SessionParametersCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265SessionParametersCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoDecodeH265SessionParametersCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265SessionParametersCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoDecodeH265SessionParametersCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeH265SessionParametersCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoDecodeH265SessionParametersCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeH265SessionParametersCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoDecodeH265SessionParametersCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR); }
    public static VkVideoDecodeH265SessionParametersCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR);
        return s;
    }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR copyFrom(VkVideoDecodeH265SessionParametersCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR reinterpret(long count) { return new VkVideoDecodeH265SessionParametersCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR asSlice(long index) { return new VkVideoDecodeH265SessionParametersCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR asSlice(long index, long count) { return new VkVideoDecodeH265SessionParametersCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR at(long index, Consumer<VkVideoDecodeH265SessionParametersCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxStdVPSCountAt(long index) { return (int) VH_maxStdVPSCount.get(this.segment(), 0L, index); }
    public int maxStdSPSCountAt(long index) { return (int) VH_maxStdSPSCount.get(this.segment(), 0L, index); }
    public int maxStdPPSCountAt(long index) { return (int) VH_maxStdPPSCount.get(this.segment(), 0L, index); }
    public MemorySegment pParametersAddInfoAt(long index) { return (MemorySegment) VH_pParametersAddInfo.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxStdVPSCount() { return (int) VH_maxStdVPSCount.get(this.segment(), 0L, 0L); }
    public int maxStdSPSCount() { return (int) VH_maxStdSPSCount.get(this.segment(), 0L, 0L); }
    public int maxStdPPSCount() { return (int) VH_maxStdPPSCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pParametersAddInfo() { return (MemorySegment) VH_pParametersAddInfo.get(this.segment(), 0L, 0L); }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR maxStdVPSCountAt(long index, int value) { VH_maxStdVPSCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR maxStdSPSCountAt(long index, int value) { VH_maxStdSPSCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR maxStdPPSCountAt(long index, int value) { VH_maxStdPPSCount.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR pParametersAddInfoAt(long index, MemorySegment value) { VH_pParametersAddInfo.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR maxStdVPSCount(int value) { VH_maxStdVPSCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR maxStdSPSCount(int value) { VH_maxStdSPSCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR maxStdPPSCount(int value) { VH_maxStdPPSCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR pParametersAddInfo(MemorySegment value) { VH_pParametersAddInfo.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxStdVPSCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxStdVPSCount, index), LAYOUT_maxStdVPSCount); }
    public MemorySegment _maxStdVPSCount() { return _maxStdVPSCountAt(0L); }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR _maxStdVPSCountAt(long index, MemorySegment src) { _maxStdVPSCountAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR _maxStdVPSCount(MemorySegment src) { return _maxStdVPSCountAt(0L, src); }
    public MemorySegment _maxStdSPSCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxStdSPSCount, index), LAYOUT_maxStdSPSCount); }
    public MemorySegment _maxStdSPSCount() { return _maxStdSPSCountAt(0L); }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR _maxStdSPSCountAt(long index, MemorySegment src) { _maxStdSPSCountAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR _maxStdSPSCount(MemorySegment src) { return _maxStdSPSCountAt(0L, src); }
    public MemorySegment _maxStdPPSCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxStdPPSCount, index), LAYOUT_maxStdPPSCount); }
    public MemorySegment _maxStdPPSCount() { return _maxStdPPSCountAt(0L); }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR _maxStdPPSCountAt(long index, MemorySegment src) { _maxStdPPSCountAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR _maxStdPPSCount(MemorySegment src) { return _maxStdPPSCountAt(0L, src); }
    public MemorySegment _pParametersAddInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pParametersAddInfo, index), LAYOUT_pParametersAddInfo); }
    public MemorySegment _pParametersAddInfo() { return _pParametersAddInfoAt(0L); }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR _pParametersAddInfoAt(long index, MemorySegment src) { _pParametersAddInfoAt(index).copyFrom(src); return this; }
    public VkVideoDecodeH265SessionParametersCreateInfoKHR _pParametersAddInfo(MemorySegment src) { return _pParametersAddInfoAt(0L, src); }
}
