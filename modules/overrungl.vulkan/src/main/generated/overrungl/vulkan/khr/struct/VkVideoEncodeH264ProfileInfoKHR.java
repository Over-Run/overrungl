// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeH264ProfileInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH264ProfileInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     StdVideoH264ProfileIdc stdProfileIdc;
/// }
/// ```
public final class VkVideoEncodeH264ProfileInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stdProfileIdc")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_stdProfileIdc = LAYOUT.byteOffset(PathElement.groupElement("stdProfileIdc"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_stdProfileIdc = LAYOUT.select(PathElement.groupElement("stdProfileIdc"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_stdProfileIdc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdProfileIdc"));

    public VkVideoEncodeH264ProfileInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeH264ProfileInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264ProfileInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeH264ProfileInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264ProfileInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeH264ProfileInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264ProfileInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeH264ProfileInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264ProfileInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeH264ProfileInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH264ProfileInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeH264ProfileInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PROFILE_INFO_KHR); }
    public static VkVideoEncodeH264ProfileInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PROFILE_INFO_KHR);
        return s;
    }
    public VkVideoEncodeH264ProfileInfoKHR copyFrom(VkVideoEncodeH264ProfileInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeH264ProfileInfoKHR reinterpret(long count) { return new VkVideoEncodeH264ProfileInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeH264ProfileInfoKHR asSlice(long index) { return new VkVideoEncodeH264ProfileInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeH264ProfileInfoKHR asSlice(long index, long count) { return new VkVideoEncodeH264ProfileInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeH264ProfileInfoKHR at(long index, Consumer<VkVideoEncodeH264ProfileInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int stdProfileIdcAt(long index) { return (int) VH_stdProfileIdc.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int stdProfileIdc() { return (int) VH_stdProfileIdc.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeH264ProfileInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264ProfileInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264ProfileInfoKHR stdProfileIdcAt(long index, int value) { VH_stdProfileIdc.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264ProfileInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264ProfileInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264ProfileInfoKHR stdProfileIdc(int value) { VH_stdProfileIdc.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeH264ProfileInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264ProfileInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeH264ProfileInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264ProfileInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _stdProfileIdcAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stdProfileIdc, index), LAYOUT_stdProfileIdc); }
    public MemorySegment _stdProfileIdc() { return _stdProfileIdcAt(0L); }
    public VkVideoEncodeH264ProfileInfoKHR _stdProfileIdcAt(long index, MemorySegment src) { _stdProfileIdcAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264ProfileInfoKHR _stdProfileIdc(MemorySegment src) { return _stdProfileIdcAt(0L, src); }
}
