// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderPassCreationFeedbackInfoEXT`.
/// ## Layout
/// ```
/// struct VkRenderPassCreationFeedbackInfoEXT {
///     uint32_t postMergeSubpassCount;
/// }
/// ```
public final class VkRenderPassCreationFeedbackInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("postMergeSubpassCount")
    );
    public static final long OFFSET_postMergeSubpassCount = LAYOUT.byteOffset(PathElement.groupElement("postMergeSubpassCount"));
    public static final MemoryLayout LAYOUT_postMergeSubpassCount = LAYOUT.select(PathElement.groupElement("postMergeSubpassCount"));
    public static final VarHandle VH_postMergeSubpassCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("postMergeSubpassCount"));

    public VkRenderPassCreationFeedbackInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderPassCreationFeedbackInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassCreationFeedbackInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderPassCreationFeedbackInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassCreationFeedbackInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderPassCreationFeedbackInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassCreationFeedbackInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderPassCreationFeedbackInfoEXT alloc(SegmentAllocator allocator) { return new VkRenderPassCreationFeedbackInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkRenderPassCreationFeedbackInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkRenderPassCreationFeedbackInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public VkRenderPassCreationFeedbackInfoEXT copyFrom(VkRenderPassCreationFeedbackInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderPassCreationFeedbackInfoEXT reinterpret(long count) { return new VkRenderPassCreationFeedbackInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderPassCreationFeedbackInfoEXT asSlice(long index) { return new VkRenderPassCreationFeedbackInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderPassCreationFeedbackInfoEXT asSlice(long index, long count) { return new VkRenderPassCreationFeedbackInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderPassCreationFeedbackInfoEXT at(long index, Consumer<VkRenderPassCreationFeedbackInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int postMergeSubpassCountAt(long index) { return (int) VH_postMergeSubpassCount.get(this.segment(), 0L, index); }
    public int postMergeSubpassCount() { return (int) VH_postMergeSubpassCount.get(this.segment(), 0L, 0L); }
    public VkRenderPassCreationFeedbackInfoEXT postMergeSubpassCountAt(long index, int value) { VH_postMergeSubpassCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassCreationFeedbackInfoEXT postMergeSubpassCount(int value) { VH_postMergeSubpassCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _postMergeSubpassCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_postMergeSubpassCount, index), LAYOUT_postMergeSubpassCount); }
    public MemorySegment _postMergeSubpassCount() { return _postMergeSubpassCountAt(0L); }
    public VkRenderPassCreationFeedbackInfoEXT _postMergeSubpassCountAt(long index, MemorySegment src) { _postMergeSubpassCountAt(index).copyFrom(src); return this; }
    public VkRenderPassCreationFeedbackInfoEXT _postMergeSubpassCount(MemorySegment src) { return _postMergeSubpassCountAt(0L, src); }
}
