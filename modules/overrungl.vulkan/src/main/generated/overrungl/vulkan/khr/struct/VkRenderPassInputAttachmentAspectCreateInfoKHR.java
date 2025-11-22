// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderPassInputAttachmentAspectCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkRenderPassInputAttachmentAspectCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t aspectReferenceCount;
///     const VkInputAttachmentAspectReference* pAspectReferences;
/// }
/// ```
public final class VkRenderPassInputAttachmentAspectCreateInfoKHR extends GroupType {
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

    public VkRenderPassInputAttachmentAspectCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassInputAttachmentAspectCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassInputAttachmentAspectCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassInputAttachmentAspectCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkRenderPassInputAttachmentAspectCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkRenderPassInputAttachmentAspectCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO); }
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO);
        return s;
    }
    public VkRenderPassInputAttachmentAspectCreateInfoKHR copyFrom(VkRenderPassInputAttachmentAspectCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfoKHR reinterpret(long count) { return new VkRenderPassInputAttachmentAspectCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderPassInputAttachmentAspectCreateInfoKHR asSlice(long index) { return new VkRenderPassInputAttachmentAspectCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderPassInputAttachmentAspectCreateInfoKHR asSlice(long index, long count) { return new VkRenderPassInputAttachmentAspectCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderPassInputAttachmentAspectCreateInfoKHR at(long index, Consumer<VkRenderPassInputAttachmentAspectCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int aspectReferenceCountAt(long index) { return (int) VH_aspectReferenceCount.get(this.segment(), 0L, index); }
    public MemorySegment pAspectReferencesAt(long index) { return (MemorySegment) VH_pAspectReferences.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int aspectReferenceCount() { return (int) VH_aspectReferenceCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pAspectReferences() { return (MemorySegment) VH_pAspectReferences.get(this.segment(), 0L, 0L); }
    public VkRenderPassInputAttachmentAspectCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfoKHR aspectReferenceCountAt(long index, int value) { VH_aspectReferenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfoKHR pAspectReferencesAt(long index, MemorySegment value) { VH_pAspectReferences.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfoKHR aspectReferenceCount(int value) { VH_aspectReferenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfoKHR pAspectReferences(MemorySegment value) { VH_pAspectReferences.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderPassInputAttachmentAspectCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderPassInputAttachmentAspectCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _aspectReferenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_aspectReferenceCount, index), LAYOUT_aspectReferenceCount); }
    public MemorySegment _aspectReferenceCount() { return _aspectReferenceCountAt(0L); }
    public VkRenderPassInputAttachmentAspectCreateInfoKHR _aspectReferenceCountAt(long index, MemorySegment src) { _aspectReferenceCountAt(index).copyFrom(src); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfoKHR _aspectReferenceCount(MemorySegment src) { return _aspectReferenceCountAt(0L, src); }
    public MemorySegment _pAspectReferencesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pAspectReferences, index), LAYOUT_pAspectReferences); }
    public MemorySegment _pAspectReferences() { return _pAspectReferencesAt(0L); }
    public VkRenderPassInputAttachmentAspectCreateInfoKHR _pAspectReferencesAt(long index, MemorySegment src) { _pAspectReferencesAt(index).copyFrom(src); return this; }
    public VkRenderPassInputAttachmentAspectCreateInfoKHR _pAspectReferences(MemorySegment src) { return _pAspectReferencesAt(0L, src); }
}
