// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeUsageInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeUsageInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkVideoEncodeUsageFlagsKHR videoUsageHints;
///     VkVideoEncodeContentFlagsKHR videoContentHints;
///     VkVideoEncodeTuningModeKHR tuningMode;
/// }
/// ```
public final class VkVideoEncodeUsageInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("videoUsageHints"),
        ValueLayout.JAVA_INT.withName("videoContentHints"),
        ValueLayout.JAVA_INT.withName("tuningMode")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_videoUsageHints = LAYOUT.byteOffset(PathElement.groupElement("videoUsageHints"));
    public static final long OFFSET_videoContentHints = LAYOUT.byteOffset(PathElement.groupElement("videoContentHints"));
    public static final long OFFSET_tuningMode = LAYOUT.byteOffset(PathElement.groupElement("tuningMode"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_videoUsageHints = LAYOUT.select(PathElement.groupElement("videoUsageHints"));
    public static final MemoryLayout LAYOUT_videoContentHints = LAYOUT.select(PathElement.groupElement("videoContentHints"));
    public static final MemoryLayout LAYOUT_tuningMode = LAYOUT.select(PathElement.groupElement("tuningMode"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_videoUsageHints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoUsageHints"));
    public static final VarHandle VH_videoContentHints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoContentHints"));
    public static final VarHandle VH_tuningMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tuningMode"));

    public VkVideoEncodeUsageInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeUsageInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeUsageInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeUsageInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeUsageInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeUsageInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeUsageInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeUsageInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeUsageInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeUsageInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeUsageInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeUsageInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_USAGE_INFO_KHR); }
    public static VkVideoEncodeUsageInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_USAGE_INFO_KHR);
        return s;
    }
    public VkVideoEncodeUsageInfoKHR copyFrom(VkVideoEncodeUsageInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeUsageInfoKHR reinterpret(long count) { return new VkVideoEncodeUsageInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeUsageInfoKHR asSlice(long index) { return new VkVideoEncodeUsageInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeUsageInfoKHR asSlice(long index, long count) { return new VkVideoEncodeUsageInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeUsageInfoKHR at(long index, Consumer<VkVideoEncodeUsageInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int videoUsageHintsAt(long index) { return (int) VH_videoUsageHints.get(this.segment(), 0L, index); }
    public int videoContentHintsAt(long index) { return (int) VH_videoContentHints.get(this.segment(), 0L, index); }
    public int tuningModeAt(long index) { return (int) VH_tuningMode.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int videoUsageHints() { return (int) VH_videoUsageHints.get(this.segment(), 0L, 0L); }
    public int videoContentHints() { return (int) VH_videoContentHints.get(this.segment(), 0L, 0L); }
    public int tuningMode() { return (int) VH_tuningMode.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeUsageInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeUsageInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeUsageInfoKHR videoUsageHintsAt(long index, int value) { VH_videoUsageHints.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeUsageInfoKHR videoContentHintsAt(long index, int value) { VH_videoContentHints.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeUsageInfoKHR tuningModeAt(long index, int value) { VH_tuningMode.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeUsageInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeUsageInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeUsageInfoKHR videoUsageHints(int value) { VH_videoUsageHints.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeUsageInfoKHR videoContentHints(int value) { VH_videoContentHints.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeUsageInfoKHR tuningMode(int value) { VH_tuningMode.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeUsageInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeUsageInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeUsageInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeUsageInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _videoUsageHintsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_videoUsageHints, index), LAYOUT_videoUsageHints); }
    public MemorySegment _videoUsageHints() { return _videoUsageHintsAt(0L); }
    public VkVideoEncodeUsageInfoKHR _videoUsageHintsAt(long index, MemorySegment src) { _videoUsageHintsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeUsageInfoKHR _videoUsageHints(MemorySegment src) { return _videoUsageHintsAt(0L, src); }
    public MemorySegment _videoContentHintsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_videoContentHints, index), LAYOUT_videoContentHints); }
    public MemorySegment _videoContentHints() { return _videoContentHintsAt(0L); }
    public VkVideoEncodeUsageInfoKHR _videoContentHintsAt(long index, MemorySegment src) { _videoContentHintsAt(index).copyFrom(src); return this; }
    public VkVideoEncodeUsageInfoKHR _videoContentHints(MemorySegment src) { return _videoContentHintsAt(0L, src); }
    public MemorySegment _tuningModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tuningMode, index), LAYOUT_tuningMode); }
    public MemorySegment _tuningMode() { return _tuningModeAt(0L); }
    public VkVideoEncodeUsageInfoKHR _tuningModeAt(long index, MemorySegment src) { _tuningModeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeUsageInfoKHR _tuningMode(MemorySegment src) { return _tuningModeAt(0L, src); }
}
