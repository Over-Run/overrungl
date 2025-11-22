// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeSessionParametersFeedbackInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeSessionParametersFeedbackInfoKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 hasOverrides;
/// }
/// ```
public final class VkVideoEncodeSessionParametersFeedbackInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("hasOverrides")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_hasOverrides = LAYOUT.byteOffset(PathElement.groupElement("hasOverrides"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_hasOverrides = LAYOUT.select(PathElement.groupElement("hasOverrides"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_hasOverrides = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hasOverrides"));

    public VkVideoEncodeSessionParametersFeedbackInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeSessionParametersFeedbackInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeSessionParametersFeedbackInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeSessionParametersFeedbackInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeSessionParametersFeedbackInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeSessionParametersFeedbackInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_FEEDBACK_INFO_KHR); }
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_FEEDBACK_INFO_KHR);
        return s;
    }
    public VkVideoEncodeSessionParametersFeedbackInfoKHR copyFrom(VkVideoEncodeSessionParametersFeedbackInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeSessionParametersFeedbackInfoKHR reinterpret(long count) { return new VkVideoEncodeSessionParametersFeedbackInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeSessionParametersFeedbackInfoKHR asSlice(long index) { return new VkVideoEncodeSessionParametersFeedbackInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeSessionParametersFeedbackInfoKHR asSlice(long index, long count) { return new VkVideoEncodeSessionParametersFeedbackInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeSessionParametersFeedbackInfoKHR at(long index, Consumer<VkVideoEncodeSessionParametersFeedbackInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int hasOverridesAt(long index) { return (int) VH_hasOverrides.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int hasOverrides() { return (int) VH_hasOverrides.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeSessionParametersFeedbackInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeSessionParametersFeedbackInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeSessionParametersFeedbackInfoKHR hasOverridesAt(long index, int value) { VH_hasOverrides.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeSessionParametersFeedbackInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeSessionParametersFeedbackInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeSessionParametersFeedbackInfoKHR hasOverrides(int value) { VH_hasOverrides.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeSessionParametersFeedbackInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeSessionParametersFeedbackInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeSessionParametersFeedbackInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeSessionParametersFeedbackInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _hasOverridesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_hasOverrides, index), LAYOUT_hasOverrides); }
    public MemorySegment _hasOverrides() { return _hasOverridesAt(0L); }
    public VkVideoEncodeSessionParametersFeedbackInfoKHR _hasOverridesAt(long index, MemorySegment src) { _hasOverridesAt(index).copyFrom(src); return this; }
    public VkVideoEncodeSessionParametersFeedbackInfoKHR _hasOverrides(MemorySegment src) { return _hasOverridesAt(0L, src); }
}
