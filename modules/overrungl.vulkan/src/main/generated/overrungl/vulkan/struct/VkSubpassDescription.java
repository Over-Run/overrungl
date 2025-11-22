// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSubpassDescription`.
/// ## Layout
/// ```
/// struct VkSubpassDescription {
///     VkSubpassDescriptionFlags flags;
///     VkPipelineBindPoint pipelineBindPoint;
///     uint32_t inputAttachmentCount;
///     const VkAttachmentReference* pInputAttachments;
///     uint32_t colorAttachmentCount;
///     const VkAttachmentReference* pColorAttachments;
///     const VkAttachmentReference* pResolveAttachments;
///     const VkAttachmentReference* pDepthStencilAttachment;
///     uint32_t preserveAttachmentCount;
///     const uint32_t* pPreserveAttachments;
/// }
/// ```
public final class VkSubpassDescription extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("pipelineBindPoint"),
        ValueLayout.JAVA_INT.withName("inputAttachmentCount"),
        ValueLayout.ADDRESS.withName("pInputAttachments"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withName("pColorAttachments"),
        ValueLayout.ADDRESS.withName("pResolveAttachments"),
        ValueLayout.ADDRESS.withName("pDepthStencilAttachment"),
        ValueLayout.JAVA_INT.withName("preserveAttachmentCount"),
        ValueLayout.ADDRESS.withName("pPreserveAttachments")
    );
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_pipelineBindPoint = LAYOUT.byteOffset(PathElement.groupElement("pipelineBindPoint"));
    public static final long OFFSET_inputAttachmentCount = LAYOUT.byteOffset(PathElement.groupElement("inputAttachmentCount"));
    public static final long OFFSET_pInputAttachments = LAYOUT.byteOffset(PathElement.groupElement("pInputAttachments"));
    public static final long OFFSET_colorAttachmentCount = LAYOUT.byteOffset(PathElement.groupElement("colorAttachmentCount"));
    public static final long OFFSET_pColorAttachments = LAYOUT.byteOffset(PathElement.groupElement("pColorAttachments"));
    public static final long OFFSET_pResolveAttachments = LAYOUT.byteOffset(PathElement.groupElement("pResolveAttachments"));
    public static final long OFFSET_pDepthStencilAttachment = LAYOUT.byteOffset(PathElement.groupElement("pDepthStencilAttachment"));
    public static final long OFFSET_preserveAttachmentCount = LAYOUT.byteOffset(PathElement.groupElement("preserveAttachmentCount"));
    public static final long OFFSET_pPreserveAttachments = LAYOUT.byteOffset(PathElement.groupElement("pPreserveAttachments"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_pipelineBindPoint = LAYOUT.select(PathElement.groupElement("pipelineBindPoint"));
    public static final MemoryLayout LAYOUT_inputAttachmentCount = LAYOUT.select(PathElement.groupElement("inputAttachmentCount"));
    public static final MemoryLayout LAYOUT_pInputAttachments = LAYOUT.select(PathElement.groupElement("pInputAttachments"));
    public static final MemoryLayout LAYOUT_colorAttachmentCount = LAYOUT.select(PathElement.groupElement("colorAttachmentCount"));
    public static final MemoryLayout LAYOUT_pColorAttachments = LAYOUT.select(PathElement.groupElement("pColorAttachments"));
    public static final MemoryLayout LAYOUT_pResolveAttachments = LAYOUT.select(PathElement.groupElement("pResolveAttachments"));
    public static final MemoryLayout LAYOUT_pDepthStencilAttachment = LAYOUT.select(PathElement.groupElement("pDepthStencilAttachment"));
    public static final MemoryLayout LAYOUT_preserveAttachmentCount = LAYOUT.select(PathElement.groupElement("preserveAttachmentCount"));
    public static final MemoryLayout LAYOUT_pPreserveAttachments = LAYOUT.select(PathElement.groupElement("pPreserveAttachments"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_pipelineBindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBindPoint"));
    public static final VarHandle VH_inputAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inputAttachmentCount"));
    public static final VarHandle VH_pInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pInputAttachments"));
    public static final VarHandle VH_colorAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachmentCount"));
    public static final VarHandle VH_pColorAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorAttachments"));
    public static final VarHandle VH_pResolveAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pResolveAttachments"));
    public static final VarHandle VH_pDepthStencilAttachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDepthStencilAttachment"));
    public static final VarHandle VH_preserveAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preserveAttachmentCount"));
    public static final VarHandle VH_pPreserveAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPreserveAttachments"));

    public VkSubpassDescription(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSubpassDescription of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassDescription(segment, estimateCount(segment, LAYOUT)); }
    public static VkSubpassDescription ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassDescription(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSubpassDescription ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassDescription(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSubpassDescription alloc(SegmentAllocator allocator) { return new VkSubpassDescription(allocator.allocate(LAYOUT), 1); }
    public static VkSubpassDescription alloc(SegmentAllocator allocator, long count) { return new VkSubpassDescription(allocator.allocate(LAYOUT, count), count); }
    public VkSubpassDescription copyFrom(VkSubpassDescription src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSubpassDescription reinterpret(long count) { return new VkSubpassDescription(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSubpassDescription asSlice(long index) { return new VkSubpassDescription(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSubpassDescription asSlice(long index, long count) { return new VkSubpassDescription(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSubpassDescription at(long index, Consumer<VkSubpassDescription> func) { func.accept(asSlice(index)); return this; }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int pipelineBindPointAt(long index) { return (int) VH_pipelineBindPoint.get(this.segment(), 0L, index); }
    public int inputAttachmentCountAt(long index) { return (int) VH_inputAttachmentCount.get(this.segment(), 0L, index); }
    public MemorySegment pInputAttachmentsAt(long index) { return (MemorySegment) VH_pInputAttachments.get(this.segment(), 0L, index); }
    public int colorAttachmentCountAt(long index) { return (int) VH_colorAttachmentCount.get(this.segment(), 0L, index); }
    public MemorySegment pColorAttachmentsAt(long index) { return (MemorySegment) VH_pColorAttachments.get(this.segment(), 0L, index); }
    public MemorySegment pResolveAttachmentsAt(long index) { return (MemorySegment) VH_pResolveAttachments.get(this.segment(), 0L, index); }
    public MemorySegment pDepthStencilAttachmentAt(long index) { return (MemorySegment) VH_pDepthStencilAttachment.get(this.segment(), 0L, index); }
    public int preserveAttachmentCountAt(long index) { return (int) VH_preserveAttachmentCount.get(this.segment(), 0L, index); }
    public MemorySegment pPreserveAttachmentsAt(long index) { return (MemorySegment) VH_pPreserveAttachments.get(this.segment(), 0L, index); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int pipelineBindPoint() { return (int) VH_pipelineBindPoint.get(this.segment(), 0L, 0L); }
    public int inputAttachmentCount() { return (int) VH_inputAttachmentCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pInputAttachments() { return (MemorySegment) VH_pInputAttachments.get(this.segment(), 0L, 0L); }
    public int colorAttachmentCount() { return (int) VH_colorAttachmentCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pColorAttachments() { return (MemorySegment) VH_pColorAttachments.get(this.segment(), 0L, 0L); }
    public MemorySegment pResolveAttachments() { return (MemorySegment) VH_pResolveAttachments.get(this.segment(), 0L, 0L); }
    public MemorySegment pDepthStencilAttachment() { return (MemorySegment) VH_pDepthStencilAttachment.get(this.segment(), 0L, 0L); }
    public int preserveAttachmentCount() { return (int) VH_preserveAttachmentCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pPreserveAttachments() { return (MemorySegment) VH_pPreserveAttachments.get(this.segment(), 0L, 0L); }
    public VkSubpassDescription flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDescription pipelineBindPointAt(long index, int value) { VH_pipelineBindPoint.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDescription inputAttachmentCountAt(long index, int value) { VH_inputAttachmentCount.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDescription pInputAttachmentsAt(long index, MemorySegment value) { VH_pInputAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDescription colorAttachmentCountAt(long index, int value) { VH_colorAttachmentCount.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDescription pColorAttachmentsAt(long index, MemorySegment value) { VH_pColorAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDescription pResolveAttachmentsAt(long index, MemorySegment value) { VH_pResolveAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDescription pDepthStencilAttachmentAt(long index, MemorySegment value) { VH_pDepthStencilAttachment.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDescription preserveAttachmentCountAt(long index, int value) { VH_preserveAttachmentCount.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDescription pPreserveAttachmentsAt(long index, MemorySegment value) { VH_pPreserveAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassDescription flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassDescription pipelineBindPoint(int value) { VH_pipelineBindPoint.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassDescription inputAttachmentCount(int value) { VH_inputAttachmentCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassDescription pInputAttachments(MemorySegment value) { VH_pInputAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassDescription colorAttachmentCount(int value) { VH_colorAttachmentCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassDescription pColorAttachments(MemorySegment value) { VH_pColorAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassDescription pResolveAttachments(MemorySegment value) { VH_pResolveAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassDescription pDepthStencilAttachment(MemorySegment value) { VH_pDepthStencilAttachment.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassDescription preserveAttachmentCount(int value) { VH_preserveAttachmentCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassDescription pPreserveAttachments(MemorySegment value) { VH_pPreserveAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkSubpassDescription _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkSubpassDescription _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _pipelineBindPointAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineBindPoint, index), LAYOUT_pipelineBindPoint); }
    public MemorySegment _pipelineBindPoint() { return _pipelineBindPointAt(0L); }
    public VkSubpassDescription _pipelineBindPointAt(long index, MemorySegment src) { _pipelineBindPointAt(index).copyFrom(src); return this; }
    public VkSubpassDescription _pipelineBindPoint(MemorySegment src) { return _pipelineBindPointAt(0L, src); }
    public MemorySegment _inputAttachmentCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_inputAttachmentCount, index), LAYOUT_inputAttachmentCount); }
    public MemorySegment _inputAttachmentCount() { return _inputAttachmentCountAt(0L); }
    public VkSubpassDescription _inputAttachmentCountAt(long index, MemorySegment src) { _inputAttachmentCountAt(index).copyFrom(src); return this; }
    public VkSubpassDescription _inputAttachmentCount(MemorySegment src) { return _inputAttachmentCountAt(0L, src); }
    public MemorySegment _pInputAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pInputAttachments, index), LAYOUT_pInputAttachments); }
    public MemorySegment _pInputAttachments() { return _pInputAttachmentsAt(0L); }
    public VkSubpassDescription _pInputAttachmentsAt(long index, MemorySegment src) { _pInputAttachmentsAt(index).copyFrom(src); return this; }
    public VkSubpassDescription _pInputAttachments(MemorySegment src) { return _pInputAttachmentsAt(0L, src); }
    public MemorySegment _colorAttachmentCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_colorAttachmentCount, index), LAYOUT_colorAttachmentCount); }
    public MemorySegment _colorAttachmentCount() { return _colorAttachmentCountAt(0L); }
    public VkSubpassDescription _colorAttachmentCountAt(long index, MemorySegment src) { _colorAttachmentCountAt(index).copyFrom(src); return this; }
    public VkSubpassDescription _colorAttachmentCount(MemorySegment src) { return _colorAttachmentCountAt(0L, src); }
    public MemorySegment _pColorAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pColorAttachments, index), LAYOUT_pColorAttachments); }
    public MemorySegment _pColorAttachments() { return _pColorAttachmentsAt(0L); }
    public VkSubpassDescription _pColorAttachmentsAt(long index, MemorySegment src) { _pColorAttachmentsAt(index).copyFrom(src); return this; }
    public VkSubpassDescription _pColorAttachments(MemorySegment src) { return _pColorAttachmentsAt(0L, src); }
    public MemorySegment _pResolveAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pResolveAttachments, index), LAYOUT_pResolveAttachments); }
    public MemorySegment _pResolveAttachments() { return _pResolveAttachmentsAt(0L); }
    public VkSubpassDescription _pResolveAttachmentsAt(long index, MemorySegment src) { _pResolveAttachmentsAt(index).copyFrom(src); return this; }
    public VkSubpassDescription _pResolveAttachments(MemorySegment src) { return _pResolveAttachmentsAt(0L, src); }
    public MemorySegment _pDepthStencilAttachmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDepthStencilAttachment, index), LAYOUT_pDepthStencilAttachment); }
    public MemorySegment _pDepthStencilAttachment() { return _pDepthStencilAttachmentAt(0L); }
    public VkSubpassDescription _pDepthStencilAttachmentAt(long index, MemorySegment src) { _pDepthStencilAttachmentAt(index).copyFrom(src); return this; }
    public VkSubpassDescription _pDepthStencilAttachment(MemorySegment src) { return _pDepthStencilAttachmentAt(0L, src); }
    public MemorySegment _preserveAttachmentCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preserveAttachmentCount, index), LAYOUT_preserveAttachmentCount); }
    public MemorySegment _preserveAttachmentCount() { return _preserveAttachmentCountAt(0L); }
    public VkSubpassDescription _preserveAttachmentCountAt(long index, MemorySegment src) { _preserveAttachmentCountAt(index).copyFrom(src); return this; }
    public VkSubpassDescription _preserveAttachmentCount(MemorySegment src) { return _preserveAttachmentCountAt(0L, src); }
    public MemorySegment _pPreserveAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPreserveAttachments, index), LAYOUT_pPreserveAttachments); }
    public MemorySegment _pPreserveAttachments() { return _pPreserveAttachmentsAt(0L); }
    public VkSubpassDescription _pPreserveAttachmentsAt(long index, MemorySegment src) { _pPreserveAttachmentsAt(index).copyFrom(src); return this; }
    public VkSubpassDescription _pPreserveAttachments(MemorySegment src) { return _pPreserveAttachmentsAt(0L, src); }
}
