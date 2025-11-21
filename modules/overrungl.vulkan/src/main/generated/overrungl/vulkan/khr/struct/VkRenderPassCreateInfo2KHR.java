// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderPassCreateInfo2KHR`.
/// ## Layout
/// ```
/// struct VkRenderPassCreateInfo2KHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkRenderPassCreateFlags flags;
///     uint32_t attachmentCount;
///     const VkAttachmentDescription2* pAttachments;
///     uint32_t subpassCount;
///     const VkSubpassDescription2* pSubpasses;
///     uint32_t dependencyCount;
///     const VkSubpassDependency2* pDependencies;
///     uint32_t correlatedViewMaskCount;
///     const uint32_t* pCorrelatedViewMasks;
/// }
/// ```
public final class VkRenderPassCreateInfo2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("attachmentCount"),
        ValueLayout.ADDRESS.withName("pAttachments"),
        ValueLayout.JAVA_INT.withName("subpassCount"),
        ValueLayout.ADDRESS.withName("pSubpasses"),
        ValueLayout.JAVA_INT.withName("dependencyCount"),
        ValueLayout.ADDRESS.withName("pDependencies"),
        ValueLayout.JAVA_INT.withName("correlatedViewMaskCount"),
        ValueLayout.ADDRESS.withName("pCorrelatedViewMasks")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_attachmentCount = LAYOUT.byteOffset(PathElement.groupElement("attachmentCount"));
    public static final long OFFSET_pAttachments = LAYOUT.byteOffset(PathElement.groupElement("pAttachments"));
    public static final long OFFSET_subpassCount = LAYOUT.byteOffset(PathElement.groupElement("subpassCount"));
    public static final long OFFSET_pSubpasses = LAYOUT.byteOffset(PathElement.groupElement("pSubpasses"));
    public static final long OFFSET_dependencyCount = LAYOUT.byteOffset(PathElement.groupElement("dependencyCount"));
    public static final long OFFSET_pDependencies = LAYOUT.byteOffset(PathElement.groupElement("pDependencies"));
    public static final long OFFSET_correlatedViewMaskCount = LAYOUT.byteOffset(PathElement.groupElement("correlatedViewMaskCount"));
    public static final long OFFSET_pCorrelatedViewMasks = LAYOUT.byteOffset(PathElement.groupElement("pCorrelatedViewMasks"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_attachmentCount = LAYOUT.select(PathElement.groupElement("attachmentCount"));
    public static final MemoryLayout LAYOUT_pAttachments = LAYOUT.select(PathElement.groupElement("pAttachments"));
    public static final MemoryLayout LAYOUT_subpassCount = LAYOUT.select(PathElement.groupElement("subpassCount"));
    public static final MemoryLayout LAYOUT_pSubpasses = LAYOUT.select(PathElement.groupElement("pSubpasses"));
    public static final MemoryLayout LAYOUT_dependencyCount = LAYOUT.select(PathElement.groupElement("dependencyCount"));
    public static final MemoryLayout LAYOUT_pDependencies = LAYOUT.select(PathElement.groupElement("pDependencies"));
    public static final MemoryLayout LAYOUT_correlatedViewMaskCount = LAYOUT.select(PathElement.groupElement("correlatedViewMaskCount"));
    public static final MemoryLayout LAYOUT_pCorrelatedViewMasks = LAYOUT.select(PathElement.groupElement("pCorrelatedViewMasks"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_attachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentCount"));
    public static final VarHandle VH_pAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttachments"));
    public static final VarHandle VH_subpassCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpassCount"));
    public static final VarHandle VH_pSubpasses = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSubpasses"));
    public static final VarHandle VH_dependencyCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dependencyCount"));
    public static final VarHandle VH_pDependencies = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDependencies"));
    public static final VarHandle VH_correlatedViewMaskCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("correlatedViewMaskCount"));
    public static final VarHandle VH_pCorrelatedViewMasks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCorrelatedViewMasks"));

    public VkRenderPassCreateInfo2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderPassCreateInfo2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassCreateInfo2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderPassCreateInfo2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassCreateInfo2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderPassCreateInfo2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassCreateInfo2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderPassCreateInfo2KHR alloc(SegmentAllocator allocator) { return new VkRenderPassCreateInfo2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkRenderPassCreateInfo2KHR alloc(SegmentAllocator allocator, long count) { return new VkRenderPassCreateInfo2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderPassCreateInfo2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2); }
    public static VkRenderPassCreateInfo2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2);
        return s;
    }
    public VkRenderPassCreateInfo2KHR copyFrom(VkRenderPassCreateInfo2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderPassCreateInfo2KHR reinterpret(long count) { return new VkRenderPassCreateInfo2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderPassCreateInfo2KHR asSlice(long index) { return new VkRenderPassCreateInfo2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderPassCreateInfo2KHR asSlice(long index, long count) { return new VkRenderPassCreateInfo2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderPassCreateInfo2KHR at(long index, Consumer<VkRenderPassCreateInfo2KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int attachmentCountAt(long index) { return (int) VH_attachmentCount.get(this.segment(), 0L, index); }
    public MemorySegment pAttachmentsAt(long index) { return (MemorySegment) VH_pAttachments.get(this.segment(), 0L, index); }
    public int subpassCountAt(long index) { return (int) VH_subpassCount.get(this.segment(), 0L, index); }
    public MemorySegment pSubpassesAt(long index) { return (MemorySegment) VH_pSubpasses.get(this.segment(), 0L, index); }
    public int dependencyCountAt(long index) { return (int) VH_dependencyCount.get(this.segment(), 0L, index); }
    public MemorySegment pDependenciesAt(long index) { return (MemorySegment) VH_pDependencies.get(this.segment(), 0L, index); }
    public int correlatedViewMaskCountAt(long index) { return (int) VH_correlatedViewMaskCount.get(this.segment(), 0L, index); }
    public MemorySegment pCorrelatedViewMasksAt(long index) { return (MemorySegment) VH_pCorrelatedViewMasks.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int attachmentCount() { return (int) VH_attachmentCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pAttachments() { return (MemorySegment) VH_pAttachments.get(this.segment(), 0L, 0L); }
    public int subpassCount() { return (int) VH_subpassCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pSubpasses() { return (MemorySegment) VH_pSubpasses.get(this.segment(), 0L, 0L); }
    public int dependencyCount() { return (int) VH_dependencyCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pDependencies() { return (MemorySegment) VH_pDependencies.get(this.segment(), 0L, 0L); }
    public int correlatedViewMaskCount() { return (int) VH_correlatedViewMaskCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pCorrelatedViewMasks() { return (MemorySegment) VH_pCorrelatedViewMasks.get(this.segment(), 0L, 0L); }
    public VkRenderPassCreateInfo2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassCreateInfo2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassCreateInfo2KHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassCreateInfo2KHR attachmentCountAt(long index, int value) { VH_attachmentCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassCreateInfo2KHR pAttachmentsAt(long index, MemorySegment value) { VH_pAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassCreateInfo2KHR subpassCountAt(long index, int value) { VH_subpassCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassCreateInfo2KHR pSubpassesAt(long index, MemorySegment value) { VH_pSubpasses.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassCreateInfo2KHR dependencyCountAt(long index, int value) { VH_dependencyCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassCreateInfo2KHR pDependenciesAt(long index, MemorySegment value) { VH_pDependencies.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassCreateInfo2KHR correlatedViewMaskCountAt(long index, int value) { VH_correlatedViewMaskCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassCreateInfo2KHR pCorrelatedViewMasksAt(long index, MemorySegment value) { VH_pCorrelatedViewMasks.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassCreateInfo2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassCreateInfo2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassCreateInfo2KHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassCreateInfo2KHR attachmentCount(int value) { VH_attachmentCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassCreateInfo2KHR pAttachments(MemorySegment value) { VH_pAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassCreateInfo2KHR subpassCount(int value) { VH_subpassCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassCreateInfo2KHR pSubpasses(MemorySegment value) { VH_pSubpasses.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassCreateInfo2KHR dependencyCount(int value) { VH_dependencyCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassCreateInfo2KHR pDependencies(MemorySegment value) { VH_pDependencies.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassCreateInfo2KHR correlatedViewMaskCount(int value) { VH_correlatedViewMaskCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassCreateInfo2KHR pCorrelatedViewMasks(MemorySegment value) { VH_pCorrelatedViewMasks.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderPassCreateInfo2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderPassCreateInfo2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderPassCreateInfo2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderPassCreateInfo2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkRenderPassCreateInfo2KHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkRenderPassCreateInfo2KHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _attachmentCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_attachmentCount, index), LAYOUT_attachmentCount); }
    public MemorySegment _attachmentCount() { return _attachmentCountAt(0L); }
    public VkRenderPassCreateInfo2KHR _attachmentCountAt(long index, MemorySegment src) { _attachmentCountAt(index).copyFrom(src); return this; }
    public VkRenderPassCreateInfo2KHR _attachmentCount(MemorySegment src) { return _attachmentCountAt(0L, src); }
    public MemorySegment _pAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pAttachments, index), LAYOUT_pAttachments); }
    public MemorySegment _pAttachments() { return _pAttachmentsAt(0L); }
    public VkRenderPassCreateInfo2KHR _pAttachmentsAt(long index, MemorySegment src) { _pAttachmentsAt(index).copyFrom(src); return this; }
    public VkRenderPassCreateInfo2KHR _pAttachments(MemorySegment src) { return _pAttachmentsAt(0L, src); }
    public MemorySegment _subpassCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subpassCount, index), LAYOUT_subpassCount); }
    public MemorySegment _subpassCount() { return _subpassCountAt(0L); }
    public VkRenderPassCreateInfo2KHR _subpassCountAt(long index, MemorySegment src) { _subpassCountAt(index).copyFrom(src); return this; }
    public VkRenderPassCreateInfo2KHR _subpassCount(MemorySegment src) { return _subpassCountAt(0L, src); }
    public MemorySegment _pSubpassesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSubpasses, index), LAYOUT_pSubpasses); }
    public MemorySegment _pSubpasses() { return _pSubpassesAt(0L); }
    public VkRenderPassCreateInfo2KHR _pSubpassesAt(long index, MemorySegment src) { _pSubpassesAt(index).copyFrom(src); return this; }
    public VkRenderPassCreateInfo2KHR _pSubpasses(MemorySegment src) { return _pSubpassesAt(0L, src); }
    public MemorySegment _dependencyCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dependencyCount, index), LAYOUT_dependencyCount); }
    public MemorySegment _dependencyCount() { return _dependencyCountAt(0L); }
    public VkRenderPassCreateInfo2KHR _dependencyCountAt(long index, MemorySegment src) { _dependencyCountAt(index).copyFrom(src); return this; }
    public VkRenderPassCreateInfo2KHR _dependencyCount(MemorySegment src) { return _dependencyCountAt(0L, src); }
    public MemorySegment _pDependenciesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDependencies, index), LAYOUT_pDependencies); }
    public MemorySegment _pDependencies() { return _pDependenciesAt(0L); }
    public VkRenderPassCreateInfo2KHR _pDependenciesAt(long index, MemorySegment src) { _pDependenciesAt(index).copyFrom(src); return this; }
    public VkRenderPassCreateInfo2KHR _pDependencies(MemorySegment src) { return _pDependenciesAt(0L, src); }
    public MemorySegment _correlatedViewMaskCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_correlatedViewMaskCount, index), LAYOUT_correlatedViewMaskCount); }
    public MemorySegment _correlatedViewMaskCount() { return _correlatedViewMaskCountAt(0L); }
    public VkRenderPassCreateInfo2KHR _correlatedViewMaskCountAt(long index, MemorySegment src) { _correlatedViewMaskCountAt(index).copyFrom(src); return this; }
    public VkRenderPassCreateInfo2KHR _correlatedViewMaskCount(MemorySegment src) { return _correlatedViewMaskCountAt(0L, src); }
    public MemorySegment _pCorrelatedViewMasksAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pCorrelatedViewMasks, index), LAYOUT_pCorrelatedViewMasks); }
    public MemorySegment _pCorrelatedViewMasks() { return _pCorrelatedViewMasksAt(0L); }
    public VkRenderPassCreateInfo2KHR _pCorrelatedViewMasksAt(long index, MemorySegment src) { _pCorrelatedViewMasksAt(index).copyFrom(src); return this; }
    public VkRenderPassCreateInfo2KHR _pCorrelatedViewMasks(MemorySegment src) { return _pCorrelatedViewMasksAt(0L, src); }
}
