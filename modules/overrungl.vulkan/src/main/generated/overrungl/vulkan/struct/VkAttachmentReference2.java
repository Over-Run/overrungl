// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAttachmentReference2`.
/// ## Layout
/// ```
/// struct VkAttachmentReference2 {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t attachment;
///     VkImageLayout layout;
///     VkImageAspectFlags aspectMask;
/// }
/// ```
public final class VkAttachmentReference2 extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachment"),
        ValueLayout.JAVA_INT.withName("layout"),
        ValueLayout.JAVA_INT.withName("aspectMask")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_attachment = LAYOUT.byteOffset(PathElement.groupElement("attachment"));
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    public static final long OFFSET_aspectMask = LAYOUT.byteOffset(PathElement.groupElement("aspectMask"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_attachment = LAYOUT.select(PathElement.groupElement("attachment"));
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    public static final MemoryLayout LAYOUT_aspectMask = LAYOUT.select(PathElement.groupElement("aspectMask"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_attachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachment"));
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    public static final VarHandle VH_aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectMask"));

    public VkAttachmentReference2(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAttachmentReference2 of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentReference2(segment, estimateCount(segment, LAYOUT)); }
    public static VkAttachmentReference2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentReference2(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAttachmentReference2 ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentReference2(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAttachmentReference2 alloc(SegmentAllocator allocator) { return new VkAttachmentReference2(allocator.allocate(LAYOUT), 1); }
    public static VkAttachmentReference2 alloc(SegmentAllocator allocator, long count) { return new VkAttachmentReference2(allocator.allocate(LAYOUT, count), count); }
    public static VkAttachmentReference2 allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2); }
    public static VkAttachmentReference2 allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2);
        return s;
    }
    public VkAttachmentReference2 copyFrom(VkAttachmentReference2 src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAttachmentReference2 reinterpret(long count) { return new VkAttachmentReference2(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAttachmentReference2 asSlice(long index) { return new VkAttachmentReference2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAttachmentReference2 asSlice(long index, long count) { return new VkAttachmentReference2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAttachmentReference2 at(long index, Consumer<VkAttachmentReference2> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int attachmentAt(long index) { return (int) VH_attachment.get(this.segment(), 0L, index); }
    public int layoutAt(long index) { return (int) VH_layout.get(this.segment(), 0L, index); }
    public int aspectMaskAt(long index) { return (int) VH_aspectMask.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int attachment() { return (int) VH_attachment.get(this.segment(), 0L, 0L); }
    public int layout() { return (int) VH_layout.get(this.segment(), 0L, 0L); }
    public int aspectMask() { return (int) VH_aspectMask.get(this.segment(), 0L, 0L); }
    public VkAttachmentReference2 sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentReference2 pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentReference2 attachmentAt(long index, int value) { VH_attachment.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentReference2 layoutAt(long index, int value) { VH_layout.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentReference2 aspectMaskAt(long index, int value) { VH_aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentReference2 sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentReference2 pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentReference2 attachment(int value) { VH_attachment.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentReference2 layout(int value) { VH_layout.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentReference2 aspectMask(int value) { VH_aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAttachmentReference2 _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAttachmentReference2 _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAttachmentReference2 _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAttachmentReference2 _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _attachmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_attachment, index), LAYOUT_attachment); }
    public MemorySegment _attachment() { return _attachmentAt(0L); }
    public VkAttachmentReference2 _attachmentAt(long index, MemorySegment src) { _attachmentAt(index).copyFrom(src); return this; }
    public VkAttachmentReference2 _attachment(MemorySegment src) { return _attachmentAt(0L, src); }
    public MemorySegment _layoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layout, index), LAYOUT_layout); }
    public MemorySegment _layout() { return _layoutAt(0L); }
    public VkAttachmentReference2 _layoutAt(long index, MemorySegment src) { _layoutAt(index).copyFrom(src); return this; }
    public VkAttachmentReference2 _layout(MemorySegment src) { return _layoutAt(0L, src); }
    public MemorySegment _aspectMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_aspectMask, index), LAYOUT_aspectMask); }
    public MemorySegment _aspectMask() { return _aspectMaskAt(0L); }
    public VkAttachmentReference2 _aspectMaskAt(long index, MemorySegment src) { _aspectMaskAt(index).copyFrom(src); return this; }
    public VkAttachmentReference2 _aspectMask(MemorySegment src) { return _aspectMaskAt(0L, src); }
}
