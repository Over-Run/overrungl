// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAttachmentFeedbackLoopInfoEXT`.
/// ## Layout
/// ```
/// struct VkAttachmentFeedbackLoopInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 feedbackLoopEnable;
/// }
/// ```
public final class VkAttachmentFeedbackLoopInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("feedbackLoopEnable")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_feedbackLoopEnable = LAYOUT.byteOffset(PathElement.groupElement("feedbackLoopEnable"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_feedbackLoopEnable = LAYOUT.select(PathElement.groupElement("feedbackLoopEnable"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_feedbackLoopEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("feedbackLoopEnable"));

    public VkAttachmentFeedbackLoopInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAttachmentFeedbackLoopInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentFeedbackLoopInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkAttachmentFeedbackLoopInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentFeedbackLoopInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAttachmentFeedbackLoopInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentFeedbackLoopInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAttachmentFeedbackLoopInfoEXT alloc(SegmentAllocator allocator) { return new VkAttachmentFeedbackLoopInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkAttachmentFeedbackLoopInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkAttachmentFeedbackLoopInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkAttachmentFeedbackLoopInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRUnifiedImageLayouts.VK_STRUCTURE_TYPE_ATTACHMENT_FEEDBACK_LOOP_INFO_EXT); }
    public static VkAttachmentFeedbackLoopInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRUnifiedImageLayouts.VK_STRUCTURE_TYPE_ATTACHMENT_FEEDBACK_LOOP_INFO_EXT);
        return s;
    }
    public VkAttachmentFeedbackLoopInfoEXT copyFrom(VkAttachmentFeedbackLoopInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAttachmentFeedbackLoopInfoEXT reinterpret(long count) { return new VkAttachmentFeedbackLoopInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAttachmentFeedbackLoopInfoEXT asSlice(long index) { return new VkAttachmentFeedbackLoopInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAttachmentFeedbackLoopInfoEXT asSlice(long index, long count) { return new VkAttachmentFeedbackLoopInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAttachmentFeedbackLoopInfoEXT at(long index, Consumer<VkAttachmentFeedbackLoopInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int feedbackLoopEnableAt(long index) { return (int) VH_feedbackLoopEnable.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int feedbackLoopEnable() { return (int) VH_feedbackLoopEnable.get(this.segment(), 0L, 0L); }
    public VkAttachmentFeedbackLoopInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentFeedbackLoopInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentFeedbackLoopInfoEXT feedbackLoopEnableAt(long index, int value) { VH_feedbackLoopEnable.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentFeedbackLoopInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentFeedbackLoopInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentFeedbackLoopInfoEXT feedbackLoopEnable(int value) { VH_feedbackLoopEnable.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAttachmentFeedbackLoopInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAttachmentFeedbackLoopInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAttachmentFeedbackLoopInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAttachmentFeedbackLoopInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _feedbackLoopEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_feedbackLoopEnable, index), LAYOUT_feedbackLoopEnable); }
    public MemorySegment _feedbackLoopEnable() { return _feedbackLoopEnableAt(0L); }
    public VkAttachmentFeedbackLoopInfoEXT _feedbackLoopEnableAt(long index, MemorySegment src) { _feedbackLoopEnableAt(index).copyFrom(src); return this; }
    public VkAttachmentFeedbackLoopInfoEXT _feedbackLoopEnable(MemorySegment src) { return _feedbackLoopEnableAt(0L, src); }
}
