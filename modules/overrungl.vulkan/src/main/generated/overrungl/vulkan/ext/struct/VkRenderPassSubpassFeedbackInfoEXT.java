// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderPassSubpassFeedbackInfoEXT`.
/// ## Layout
/// ```
/// struct VkRenderPassSubpassFeedbackInfoEXT {
///     VkSubpassMergeStatusEXT subpassMergeStatus;
///     char description[VK_MAX_DESCRIPTION_SIZE];
///     uint32_t postMergeIndex;
/// }
/// ```
public final class VkRenderPassSubpassFeedbackInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("subpassMergeStatus"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.JAVA_INT.withName("postMergeIndex")
    );
    public static final long OFFSET_subpassMergeStatus = LAYOUT.byteOffset(PathElement.groupElement("subpassMergeStatus"));
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
    public static final long OFFSET_postMergeIndex = LAYOUT.byteOffset(PathElement.groupElement("postMergeIndex"));
    public static final MemoryLayout LAYOUT_subpassMergeStatus = LAYOUT.select(PathElement.groupElement("subpassMergeStatus"));
    public static final MemoryLayout LAYOUT_description = LAYOUT.select(PathElement.groupElement("description"));
    public static final MemoryLayout LAYOUT_postMergeIndex = LAYOUT.select(PathElement.groupElement("postMergeIndex"));
    public static final VarHandle VH_subpassMergeStatus = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpassMergeStatus"));
    public static final VarHandle VH_description = LAYOUT.arrayElementVarHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
    public static final VarHandle VH_postMergeIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("postMergeIndex"));

    public VkRenderPassSubpassFeedbackInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderPassSubpassFeedbackInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassSubpassFeedbackInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderPassSubpassFeedbackInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassSubpassFeedbackInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderPassSubpassFeedbackInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassSubpassFeedbackInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderPassSubpassFeedbackInfoEXT alloc(SegmentAllocator allocator) { return new VkRenderPassSubpassFeedbackInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkRenderPassSubpassFeedbackInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkRenderPassSubpassFeedbackInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public VkRenderPassSubpassFeedbackInfoEXT copyFrom(VkRenderPassSubpassFeedbackInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderPassSubpassFeedbackInfoEXT reinterpret(long count) { return new VkRenderPassSubpassFeedbackInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderPassSubpassFeedbackInfoEXT asSlice(long index) { return new VkRenderPassSubpassFeedbackInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderPassSubpassFeedbackInfoEXT asSlice(long index, long count) { return new VkRenderPassSubpassFeedbackInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderPassSubpassFeedbackInfoEXT at(long index, Consumer<VkRenderPassSubpassFeedbackInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int subpassMergeStatusAt(long index) { return (int) VH_subpassMergeStatus.get(this.segment(), 0L, index); }
    public byte descriptionAt(long index, long index0) { return (byte) VH_description.get(this.segment(), 0L, index, index0); }
    public int postMergeIndexAt(long index) { return (int) VH_postMergeIndex.get(this.segment(), 0L, index); }
    public int subpassMergeStatus() { return (int) VH_subpassMergeStatus.get(this.segment(), 0L, 0L); }
    public byte description(long index0) { return (byte) VH_description.get(this.segment(), 0L, 0L, index0); }
    public int postMergeIndex() { return (int) VH_postMergeIndex.get(this.segment(), 0L, 0L); }
    public VkRenderPassSubpassFeedbackInfoEXT subpassMergeStatusAt(long index, int value) { VH_subpassMergeStatus.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassSubpassFeedbackInfoEXT descriptionAt(long index, long index0, byte value) { VH_description.set(this.segment(), 0L, index, index0, value); return this; }
    public VkRenderPassSubpassFeedbackInfoEXT postMergeIndexAt(long index, int value) { VH_postMergeIndex.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassSubpassFeedbackInfoEXT subpassMergeStatus(int value) { VH_subpassMergeStatus.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassSubpassFeedbackInfoEXT description(long index0, byte value) { VH_description.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkRenderPassSubpassFeedbackInfoEXT postMergeIndex(int value) { VH_postMergeIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _subpassMergeStatusAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subpassMergeStatus, index), LAYOUT_subpassMergeStatus); }
    public MemorySegment _subpassMergeStatus() { return _subpassMergeStatusAt(0L); }
    public VkRenderPassSubpassFeedbackInfoEXT _subpassMergeStatusAt(long index, MemorySegment src) { _subpassMergeStatusAt(index).copyFrom(src); return this; }
    public VkRenderPassSubpassFeedbackInfoEXT _subpassMergeStatus(MemorySegment src) { return _subpassMergeStatusAt(0L, src); }
    public MemorySegment _descriptionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_description, index), LAYOUT_description); }
    public MemorySegment _description() { return _descriptionAt(0L); }
    public VkRenderPassSubpassFeedbackInfoEXT _descriptionAt(long index, MemorySegment src) { _descriptionAt(index).copyFrom(src); return this; }
    public VkRenderPassSubpassFeedbackInfoEXT _description(MemorySegment src) { return _descriptionAt(0L, src); }
    public MemorySegment _postMergeIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_postMergeIndex, index), LAYOUT_postMergeIndex); }
    public MemorySegment _postMergeIndex() { return _postMergeIndexAt(0L); }
    public VkRenderPassSubpassFeedbackInfoEXT _postMergeIndexAt(long index, MemorySegment src) { _postMergeIndexAt(index).copyFrom(src); return this; }
    public VkRenderPassSubpassFeedbackInfoEXT _postMergeIndex(MemorySegment src) { return _postMergeIndexAt(0L, src); }
}
