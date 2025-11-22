// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoDecodeUsageInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoDecodeUsageInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkVideoDecodeUsageFlagsKHR videoUsageHints;
/// }
/// ```
public final class VkVideoDecodeUsageInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("videoUsageHints")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_videoUsageHints = LAYOUT.byteOffset(PathElement.groupElement("videoUsageHints"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_videoUsageHints = LAYOUT.select(PathElement.groupElement("videoUsageHints"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_videoUsageHints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoUsageHints"));

    public VkVideoDecodeUsageInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoDecodeUsageInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeUsageInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoDecodeUsageInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeUsageInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoDecodeUsageInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeUsageInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoDecodeUsageInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeUsageInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoDecodeUsageInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeUsageInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoDecodeUsageInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoDecodeQueue.VK_STRUCTURE_TYPE_VIDEO_DECODE_USAGE_INFO_KHR); }
    public static VkVideoDecodeUsageInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoDecodeQueue.VK_STRUCTURE_TYPE_VIDEO_DECODE_USAGE_INFO_KHR);
        return s;
    }
    public VkVideoDecodeUsageInfoKHR copyFrom(VkVideoDecodeUsageInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoDecodeUsageInfoKHR reinterpret(long count) { return new VkVideoDecodeUsageInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoDecodeUsageInfoKHR asSlice(long index) { return new VkVideoDecodeUsageInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoDecodeUsageInfoKHR asSlice(long index, long count) { return new VkVideoDecodeUsageInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoDecodeUsageInfoKHR at(long index, Consumer<VkVideoDecodeUsageInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int videoUsageHintsAt(long index) { return (int) VH_videoUsageHints.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int videoUsageHints() { return (int) VH_videoUsageHints.get(this.segment(), 0L, 0L); }
    public VkVideoDecodeUsageInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeUsageInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeUsageInfoKHR videoUsageHintsAt(long index, int value) { VH_videoUsageHints.set(this.segment(), 0L, index, value); return this; }
    public VkVideoDecodeUsageInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeUsageInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoDecodeUsageInfoKHR videoUsageHints(int value) { VH_videoUsageHints.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoDecodeUsageInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoDecodeUsageInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoDecodeUsageInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoDecodeUsageInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _videoUsageHintsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_videoUsageHints, index), LAYOUT_videoUsageHints); }
    public MemorySegment _videoUsageHints() { return _videoUsageHintsAt(0L); }
    public VkVideoDecodeUsageInfoKHR _videoUsageHintsAt(long index, MemorySegment src) { _videoUsageHintsAt(index).copyFrom(src); return this; }
    public VkVideoDecodeUsageInfoKHR _videoUsageHints(MemorySegment src) { return _videoUsageHintsAt(0L, src); }
}
