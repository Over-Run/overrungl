// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeIntraRefreshInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeIntraRefreshInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t intraRefreshCycleDuration;
///     uint32_t intraRefreshIndex;
/// }
/// ```
public final class VkVideoEncodeIntraRefreshInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("intraRefreshCycleDuration"),
        ValueLayout.JAVA_INT.withName("intraRefreshIndex")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_intraRefreshCycleDuration = LAYOUT.byteOffset(PathElement.groupElement("intraRefreshCycleDuration"));
    public static final long OFFSET_intraRefreshIndex = LAYOUT.byteOffset(PathElement.groupElement("intraRefreshIndex"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_intraRefreshCycleDuration = LAYOUT.select(PathElement.groupElement("intraRefreshCycleDuration"));
    public static final MemoryLayout LAYOUT_intraRefreshIndex = LAYOUT.select(PathElement.groupElement("intraRefreshIndex"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_intraRefreshCycleDuration = LAYOUT.arrayElementVarHandle(PathElement.groupElement("intraRefreshCycleDuration"));
    public static final VarHandle VH_intraRefreshIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("intraRefreshIndex"));

    public VkVideoEncodeIntraRefreshInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeIntraRefreshInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeIntraRefreshInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeIntraRefreshInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeIntraRefreshInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeIntraRefreshInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeIntraRefreshInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeIntraRefreshInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeIntraRefreshInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeIntraRefreshInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeIntraRefreshInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeIntraRefreshInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_VIDEO_ENCODE_INTRA_REFRESH_INFO_KHR); }
    public static VkVideoEncodeIntraRefreshInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_VIDEO_ENCODE_INTRA_REFRESH_INFO_KHR);
        return s;
    }
    public VkVideoEncodeIntraRefreshInfoKHR copyFrom(VkVideoEncodeIntraRefreshInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeIntraRefreshInfoKHR reinterpret(long count) { return new VkVideoEncodeIntraRefreshInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeIntraRefreshInfoKHR asSlice(long index) { return new VkVideoEncodeIntraRefreshInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeIntraRefreshInfoKHR asSlice(long index, long count) { return new VkVideoEncodeIntraRefreshInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeIntraRefreshInfoKHR at(long index, Consumer<VkVideoEncodeIntraRefreshInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int intraRefreshCycleDurationAt(long index) { return (int) VH_intraRefreshCycleDuration.get(this.segment(), 0L, index); }
    public int intraRefreshIndexAt(long index) { return (int) VH_intraRefreshIndex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int intraRefreshCycleDuration() { return (int) VH_intraRefreshCycleDuration.get(this.segment(), 0L, 0L); }
    public int intraRefreshIndex() { return (int) VH_intraRefreshIndex.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeIntraRefreshInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeIntraRefreshInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeIntraRefreshInfoKHR intraRefreshCycleDurationAt(long index, int value) { VH_intraRefreshCycleDuration.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeIntraRefreshInfoKHR intraRefreshIndexAt(long index, int value) { VH_intraRefreshIndex.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeIntraRefreshInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeIntraRefreshInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeIntraRefreshInfoKHR intraRefreshCycleDuration(int value) { VH_intraRefreshCycleDuration.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeIntraRefreshInfoKHR intraRefreshIndex(int value) { VH_intraRefreshIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeIntraRefreshInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeIntraRefreshInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeIntraRefreshInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeIntraRefreshInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _intraRefreshCycleDurationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_intraRefreshCycleDuration, index), LAYOUT_intraRefreshCycleDuration); }
    public MemorySegment _intraRefreshCycleDuration() { return _intraRefreshCycleDurationAt(0L); }
    public VkVideoEncodeIntraRefreshInfoKHR _intraRefreshCycleDurationAt(long index, MemorySegment src) { _intraRefreshCycleDurationAt(index).copyFrom(src); return this; }
    public VkVideoEncodeIntraRefreshInfoKHR _intraRefreshCycleDuration(MemorySegment src) { return _intraRefreshCycleDurationAt(0L, src); }
    public MemorySegment _intraRefreshIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_intraRefreshIndex, index), LAYOUT_intraRefreshIndex); }
    public MemorySegment _intraRefreshIndex() { return _intraRefreshIndexAt(0L); }
    public VkVideoEncodeIntraRefreshInfoKHR _intraRefreshIndexAt(long index, MemorySegment src) { _intraRefreshIndexAt(index).copyFrom(src); return this; }
    public VkVideoEncodeIntraRefreshInfoKHR _intraRefreshIndex(MemorySegment src) { return _intraRefreshIndexAt(0L, src); }
}
