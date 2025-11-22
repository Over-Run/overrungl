// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeH264SessionParametersFeedbackInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH264SessionParametersFeedbackInfoKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 hasStdSPSOverrides;
///     VkBool32 hasStdPPSOverrides;
/// }
/// ```
public final class VkVideoEncodeH264SessionParametersFeedbackInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("hasStdSPSOverrides"),
        ValueLayout.JAVA_INT.withName("hasStdPPSOverrides")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_hasStdSPSOverrides = LAYOUT.byteOffset(PathElement.groupElement("hasStdSPSOverrides"));
    public static final long OFFSET_hasStdPPSOverrides = LAYOUT.byteOffset(PathElement.groupElement("hasStdPPSOverrides"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_hasStdSPSOverrides = LAYOUT.select(PathElement.groupElement("hasStdSPSOverrides"));
    public static final MemoryLayout LAYOUT_hasStdPPSOverrides = LAYOUT.select(PathElement.groupElement("hasStdPPSOverrides"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_hasStdSPSOverrides = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hasStdSPSOverrides"));
    public static final VarHandle VH_hasStdPPSOverrides = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hasStdPPSOverrides"));

    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_FEEDBACK_INFO_KHR); }
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_FEEDBACK_INFO_KHR);
        return s;
    }
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR copyFrom(VkVideoEncodeH264SessionParametersFeedbackInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR reinterpret(long count) { return new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR asSlice(long index) { return new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR asSlice(long index, long count) { return new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR at(long index, Consumer<VkVideoEncodeH264SessionParametersFeedbackInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int hasStdSPSOverridesAt(long index) { return (int) VH_hasStdSPSOverrides.get(this.segment(), 0L, index); }
    public int hasStdPPSOverridesAt(long index) { return (int) VH_hasStdPPSOverrides.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int hasStdSPSOverrides() { return (int) VH_hasStdSPSOverrides.get(this.segment(), 0L, 0L); }
    public int hasStdPPSOverrides() { return (int) VH_hasStdPPSOverrides.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR hasStdSPSOverridesAt(long index, int value) { VH_hasStdSPSOverrides.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR hasStdPPSOverridesAt(long index, int value) { VH_hasStdPPSOverrides.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR hasStdSPSOverrides(int value) { VH_hasStdSPSOverrides.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR hasStdPPSOverrides(int value) { VH_hasStdPPSOverrides.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _hasStdSPSOverridesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_hasStdSPSOverrides, index), LAYOUT_hasStdSPSOverrides); }
    public MemorySegment _hasStdSPSOverrides() { return _hasStdSPSOverridesAt(0L); }
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR _hasStdSPSOverridesAt(long index, MemorySegment src) { _hasStdSPSOverridesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR _hasStdSPSOverrides(MemorySegment src) { return _hasStdSPSOverridesAt(0L, src); }
    public MemorySegment _hasStdPPSOverridesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_hasStdPPSOverrides, index), LAYOUT_hasStdPPSOverrides); }
    public MemorySegment _hasStdPPSOverrides() { return _hasStdPPSOverridesAt(0L); }
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR _hasStdPPSOverridesAt(long index, MemorySegment src) { _hasStdPPSOverridesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR _hasStdPPSOverrides(MemorySegment src) { return _hasStdPPSOverridesAt(0L, src); }
}
