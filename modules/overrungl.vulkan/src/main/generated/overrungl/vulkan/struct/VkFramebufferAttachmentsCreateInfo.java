// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkFramebufferAttachmentsCreateInfo`.
/// ## Layout
/// ```
/// struct VkFramebufferAttachmentsCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t attachmentImageInfoCount;
///     const VkFramebufferAttachmentImageInfo* pAttachmentImageInfos;
/// }
/// ```
public final class VkFramebufferAttachmentsCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentImageInfoCount"),
        ValueLayout.ADDRESS.withName("pAttachmentImageInfos")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_attachmentImageInfoCount = LAYOUT.byteOffset(PathElement.groupElement("attachmentImageInfoCount"));
    public static final long OFFSET_pAttachmentImageInfos = LAYOUT.byteOffset(PathElement.groupElement("pAttachmentImageInfos"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_attachmentImageInfoCount = LAYOUT.select(PathElement.groupElement("attachmentImageInfoCount"));
    public static final MemoryLayout LAYOUT_pAttachmentImageInfos = LAYOUT.select(PathElement.groupElement("pAttachmentImageInfos"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_attachmentImageInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentImageInfoCount"));
    public static final VarHandle VH_pAttachmentImageInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttachmentImageInfos"));

    public VkFramebufferAttachmentsCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkFramebufferAttachmentsCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFramebufferAttachmentsCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkFramebufferAttachmentsCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFramebufferAttachmentsCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkFramebufferAttachmentsCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkFramebufferAttachmentsCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkFramebufferAttachmentsCreateInfo alloc(SegmentAllocator allocator) { return new VkFramebufferAttachmentsCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkFramebufferAttachmentsCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkFramebufferAttachmentsCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkFramebufferAttachmentsCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO); }
    public static VkFramebufferAttachmentsCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO);
        return s;
    }
    public VkFramebufferAttachmentsCreateInfo copyFrom(VkFramebufferAttachmentsCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkFramebufferAttachmentsCreateInfo reinterpret(long count) { return new VkFramebufferAttachmentsCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkFramebufferAttachmentsCreateInfo asSlice(long index) { return new VkFramebufferAttachmentsCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkFramebufferAttachmentsCreateInfo asSlice(long index, long count) { return new VkFramebufferAttachmentsCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkFramebufferAttachmentsCreateInfo at(long index, Consumer<VkFramebufferAttachmentsCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int attachmentImageInfoCountAt(long index) { return (int) VH_attachmentImageInfoCount.get(this.segment(), 0L, index); }
    public MemorySegment pAttachmentImageInfosAt(long index) { return (MemorySegment) VH_pAttachmentImageInfos.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int attachmentImageInfoCount() { return (int) VH_attachmentImageInfoCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pAttachmentImageInfos() { return (MemorySegment) VH_pAttachmentImageInfos.get(this.segment(), 0L, 0L); }
    public VkFramebufferAttachmentsCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferAttachmentsCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferAttachmentsCreateInfo attachmentImageInfoCountAt(long index, int value) { VH_attachmentImageInfoCount.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferAttachmentsCreateInfo pAttachmentImageInfosAt(long index, MemorySegment value) { VH_pAttachmentImageInfos.set(this.segment(), 0L, index, value); return this; }
    public VkFramebufferAttachmentsCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferAttachmentsCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferAttachmentsCreateInfo attachmentImageInfoCount(int value) { VH_attachmentImageInfoCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkFramebufferAttachmentsCreateInfo pAttachmentImageInfos(MemorySegment value) { VH_pAttachmentImageInfos.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkFramebufferAttachmentsCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkFramebufferAttachmentsCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkFramebufferAttachmentsCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkFramebufferAttachmentsCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _attachmentImageInfoCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_attachmentImageInfoCount, index), LAYOUT_attachmentImageInfoCount); }
    public MemorySegment _attachmentImageInfoCount() { return _attachmentImageInfoCountAt(0L); }
    public VkFramebufferAttachmentsCreateInfo _attachmentImageInfoCountAt(long index, MemorySegment src) { _attachmentImageInfoCountAt(index).copyFrom(src); return this; }
    public VkFramebufferAttachmentsCreateInfo _attachmentImageInfoCount(MemorySegment src) { return _attachmentImageInfoCountAt(0L, src); }
    public MemorySegment _pAttachmentImageInfosAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pAttachmentImageInfos, index), LAYOUT_pAttachmentImageInfos); }
    public MemorySegment _pAttachmentImageInfos() { return _pAttachmentImageInfosAt(0L); }
    public VkFramebufferAttachmentsCreateInfo _pAttachmentImageInfosAt(long index, MemorySegment src) { _pAttachmentImageInfosAt(index).copyFrom(src); return this; }
    public VkFramebufferAttachmentsCreateInfo _pAttachmentImageInfos(MemorySegment src) { return _pAttachmentImageInfosAt(0L, src); }
}
