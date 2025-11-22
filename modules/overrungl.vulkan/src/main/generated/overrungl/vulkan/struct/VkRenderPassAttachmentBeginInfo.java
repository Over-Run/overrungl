// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderPassAttachmentBeginInfo`.
/// ## Layout
/// ```
/// struct VkRenderPassAttachmentBeginInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t attachmentCount;
///     const VkImageView* pAttachments;
/// }
/// ```
public final class VkRenderPassAttachmentBeginInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentCount"),
        ValueLayout.ADDRESS.withName("pAttachments")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_attachmentCount = LAYOUT.byteOffset(PathElement.groupElement("attachmentCount"));
    public static final long OFFSET_pAttachments = LAYOUT.byteOffset(PathElement.groupElement("pAttachments"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_attachmentCount = LAYOUT.select(PathElement.groupElement("attachmentCount"));
    public static final MemoryLayout LAYOUT_pAttachments = LAYOUT.select(PathElement.groupElement("pAttachments"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_attachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentCount"));
    public static final VarHandle VH_pAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttachments"));

    public VkRenderPassAttachmentBeginInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderPassAttachmentBeginInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassAttachmentBeginInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderPassAttachmentBeginInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassAttachmentBeginInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderPassAttachmentBeginInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassAttachmentBeginInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderPassAttachmentBeginInfo alloc(SegmentAllocator allocator) { return new VkRenderPassAttachmentBeginInfo(allocator.allocate(LAYOUT), 1); }
    public static VkRenderPassAttachmentBeginInfo alloc(SegmentAllocator allocator, long count) { return new VkRenderPassAttachmentBeginInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderPassAttachmentBeginInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO); }
    public static VkRenderPassAttachmentBeginInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO);
        return s;
    }
    public VkRenderPassAttachmentBeginInfo copyFrom(VkRenderPassAttachmentBeginInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderPassAttachmentBeginInfo reinterpret(long count) { return new VkRenderPassAttachmentBeginInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderPassAttachmentBeginInfo asSlice(long index) { return new VkRenderPassAttachmentBeginInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderPassAttachmentBeginInfo asSlice(long index, long count) { return new VkRenderPassAttachmentBeginInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderPassAttachmentBeginInfo at(long index, Consumer<VkRenderPassAttachmentBeginInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int attachmentCountAt(long index) { return (int) VH_attachmentCount.get(this.segment(), 0L, index); }
    public MemorySegment pAttachmentsAt(long index) { return (MemorySegment) VH_pAttachments.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int attachmentCount() { return (int) VH_attachmentCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pAttachments() { return (MemorySegment) VH_pAttachments.get(this.segment(), 0L, 0L); }
    public VkRenderPassAttachmentBeginInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassAttachmentBeginInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassAttachmentBeginInfo attachmentCountAt(long index, int value) { VH_attachmentCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassAttachmentBeginInfo pAttachmentsAt(long index, MemorySegment value) { VH_pAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassAttachmentBeginInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassAttachmentBeginInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassAttachmentBeginInfo attachmentCount(int value) { VH_attachmentCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassAttachmentBeginInfo pAttachments(MemorySegment value) { VH_pAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderPassAttachmentBeginInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderPassAttachmentBeginInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderPassAttachmentBeginInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderPassAttachmentBeginInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _attachmentCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_attachmentCount, index), LAYOUT_attachmentCount); }
    public MemorySegment _attachmentCount() { return _attachmentCountAt(0L); }
    public VkRenderPassAttachmentBeginInfo _attachmentCountAt(long index, MemorySegment src) { _attachmentCountAt(index).copyFrom(src); return this; }
    public VkRenderPassAttachmentBeginInfo _attachmentCount(MemorySegment src) { return _attachmentCountAt(0L, src); }
    public MemorySegment _pAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pAttachments, index), LAYOUT_pAttachments); }
    public MemorySegment _pAttachments() { return _pAttachmentsAt(0L); }
    public VkRenderPassAttachmentBeginInfo _pAttachmentsAt(long index, MemorySegment src) { _pAttachmentsAt(index).copyFrom(src); return this; }
    public VkRenderPassAttachmentBeginInfo _pAttachments(MemorySegment src) { return _pAttachmentsAt(0L, src); }
}
