// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderPassInputAttachmentAspectCreateInfo`.
/// ## Layout
/// ```
/// struct VkRenderPassInputAttachmentAspectCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t aspectReferenceCount;
///     const VkInputAttachmentAspectReference* pAspectReferences;
/// }
/// ```
public final class VkRenderPassInputAttachmentAspectCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("aspectReferenceCount"),
        ValueLayout.ADDRESS.withName("pAspectReferences")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_aspectReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("aspectReferenceCount"));
    public static final long OFFSET_pAspectReferences = LAYOUT.byteOffset(PathElement.groupElement("pAspectReferences"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_aspectReferenceCount = LAYOUT.select(PathElement.groupElement("aspectReferenceCount"));
    public static final MemoryLayout LAYOUT_pAspectReferences = LAYOUT.select(PathElement.groupElement("pAspectReferences"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_aspectReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectReferenceCount"));
    public static final VarHandle VH_pAspectReferences = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAspectReferences"));

    public VkRenderPassInputAttachmentAspectCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderPassInputAttachmentAspectCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassInputAttachmentAspectCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderPassInputAttachmentAspectCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassInputAttachmentAspectCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderPassInputAttachmentAspectCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassInputAttachmentAspectCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderPassInputAttachmentAspectCreateInfo alloc(SegmentAllocator allocator) { return new VkRenderPassInputAttachmentAspectCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkRenderPassInputAttachmentAspectCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkRenderPassInputAttachmentAspectCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderPassInputAttachmentAspectCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO); }
    public static VkRenderPassInputAttachmentAspectCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO);
        return s;
    }
    public VkRenderPassInputAttachmentAspectCreateInfo copyFrom(VkRenderPassInputAttachmentAspectCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfo reinterpret(long count) { return new VkRenderPassInputAttachmentAspectCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderPassInputAttachmentAspectCreateInfo asSlice(long index) { return new VkRenderPassInputAttachmentAspectCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderPassInputAttachmentAspectCreateInfo asSlice(long index, long count) { return new VkRenderPassInputAttachmentAspectCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderPassInputAttachmentAspectCreateInfo at(long index, Consumer<VkRenderPassInputAttachmentAspectCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int aspectReferenceCountAt(long index) { return (int) VH_aspectReferenceCount.get(this.segment(), 0L, index); }
    public MemorySegment pAspectReferencesAt(long index) { return (MemorySegment) VH_pAspectReferences.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int aspectReferenceCount() { return (int) VH_aspectReferenceCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pAspectReferences() { return (MemorySegment) VH_pAspectReferences.get(this.segment(), 0L, 0L); }
    public VkRenderPassInputAttachmentAspectCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfo aspectReferenceCountAt(long index, int value) { VH_aspectReferenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfo pAspectReferencesAt(long index, MemorySegment value) { VH_pAspectReferences.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfo aspectReferenceCount(int value) { VH_aspectReferenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfo pAspectReferences(MemorySegment value) { VH_pAspectReferences.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderPassInputAttachmentAspectCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderPassInputAttachmentAspectCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _aspectReferenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_aspectReferenceCount, index), LAYOUT_aspectReferenceCount); }
    public MemorySegment _aspectReferenceCount() { return _aspectReferenceCountAt(0L); }
    public VkRenderPassInputAttachmentAspectCreateInfo _aspectReferenceCountAt(long index, MemorySegment src) { _aspectReferenceCountAt(index).copyFrom(src); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfo _aspectReferenceCount(MemorySegment src) { return _aspectReferenceCountAt(0L, src); }
    public MemorySegment _pAspectReferencesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pAspectReferences, index), LAYOUT_pAspectReferences); }
    public MemorySegment _pAspectReferences() { return _pAspectReferencesAt(0L); }
    public VkRenderPassInputAttachmentAspectCreateInfo _pAspectReferencesAt(long index, MemorySegment src) { _pAspectReferencesAt(index).copyFrom(src); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfo _pAspectReferences(MemorySegment src) { return _pAspectReferencesAt(0L, src); }
}
