// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkClearAttachment`.
/// ## Layout
/// ```
/// struct VkClearAttachment {
///     VkImageAspectFlags aspectMask;
///     uint32_t colorAttachment;
///     VkClearValue clearValue;
/// }
/// ```
public final class VkClearAttachment extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        ValueLayout.JAVA_INT.withName("colorAttachment"),
        overrungl.vulkan.union.VkClearValue.LAYOUT.withName("clearValue")
    );
    public static final long OFFSET_aspectMask = LAYOUT.byteOffset(PathElement.groupElement("aspectMask"));
    public static final long OFFSET_colorAttachment = LAYOUT.byteOffset(PathElement.groupElement("colorAttachment"));
    public static final long OFFSET_clearValue = LAYOUT.byteOffset(PathElement.groupElement("clearValue"));
    public static final MemoryLayout LAYOUT_aspectMask = LAYOUT.select(PathElement.groupElement("aspectMask"));
    public static final MemoryLayout LAYOUT_colorAttachment = LAYOUT.select(PathElement.groupElement("colorAttachment"));
    public static final MemoryLayout LAYOUT_clearValue = LAYOUT.select(PathElement.groupElement("clearValue"));
    public static final VarHandle VH_aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectMask"));
    public static final VarHandle VH_colorAttachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachment"));
    public static final VarHandle VH_clearValue$color$float32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clearValue"), PathElement.groupElement("color"), PathElement.groupElement("float32"), PathElement.sequenceElement());
    public static final VarHandle VH_clearValue$color$int32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clearValue"), PathElement.groupElement("color"), PathElement.groupElement("int32"), PathElement.sequenceElement());
    public static final VarHandle VH_clearValue$color$uint32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clearValue"), PathElement.groupElement("color"), PathElement.groupElement("uint32"), PathElement.sequenceElement());
    public static final VarHandle VH_clearValue$depthStencil$depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clearValue"), PathElement.groupElement("depthStencil"), PathElement.groupElement("depth"));
    public static final VarHandle VH_clearValue$depthStencil$stencil = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clearValue"), PathElement.groupElement("depthStencil"), PathElement.groupElement("stencil"));

    public VkClearAttachment(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkClearAttachment of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearAttachment(segment, estimateCount(segment, LAYOUT)); }
    public static VkClearAttachment ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearAttachment(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkClearAttachment ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClearAttachment(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkClearAttachment alloc(SegmentAllocator allocator) { return new VkClearAttachment(allocator.allocate(LAYOUT), 1); }
    public static VkClearAttachment alloc(SegmentAllocator allocator, long count) { return new VkClearAttachment(allocator.allocate(LAYOUT, count), count); }
    public VkClearAttachment copyFrom(VkClearAttachment src) { this.segment().copyFrom(src.segment()); return this; }
    public VkClearAttachment reinterpret(long count) { return new VkClearAttachment(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkClearAttachment asSlice(long index) { return new VkClearAttachment(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkClearAttachment asSlice(long index, long count) { return new VkClearAttachment(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkClearAttachment at(long index, Consumer<VkClearAttachment> func) { func.accept(asSlice(index)); return this; }
    public int aspectMaskAt(long index) { return (int) VH_aspectMask.get(this.segment(), 0L, index); }
    public int colorAttachmentAt(long index) { return (int) VH_colorAttachment.get(this.segment(), 0L, index); }
    public float clearValue$color$float32At(long index, long index0) { return (float) VH_clearValue$color$float32.get(this.segment(), 0L, index, index0); }
    public int clearValue$color$int32At(long index, long index0) { return (int) VH_clearValue$color$int32.get(this.segment(), 0L, index, index0); }
    public int clearValue$color$uint32At(long index, long index0) { return (int) VH_clearValue$color$uint32.get(this.segment(), 0L, index, index0); }
    public float clearValue$depthStencil$depthAt(long index) { return (float) VH_clearValue$depthStencil$depth.get(this.segment(), 0L, index); }
    public int clearValue$depthStencil$stencilAt(long index) { return (int) VH_clearValue$depthStencil$stencil.get(this.segment(), 0L, index); }
    public int aspectMask() { return (int) VH_aspectMask.get(this.segment(), 0L, 0L); }
    public int colorAttachment() { return (int) VH_colorAttachment.get(this.segment(), 0L, 0L); }
    public float clearValue$color$float32(long index0) { return (float) VH_clearValue$color$float32.get(this.segment(), 0L, 0L, index0); }
    public int clearValue$color$int32(long index0) { return (int) VH_clearValue$color$int32.get(this.segment(), 0L, 0L, index0); }
    public int clearValue$color$uint32(long index0) { return (int) VH_clearValue$color$uint32.get(this.segment(), 0L, 0L, index0); }
    public float clearValue$depthStencil$depth() { return (float) VH_clearValue$depthStencil$depth.get(this.segment(), 0L, 0L); }
    public int clearValue$depthStencil$stencil() { return (int) VH_clearValue$depthStencil$stencil.get(this.segment(), 0L, 0L); }
    public VkClearAttachment aspectMaskAt(long index, int value) { VH_aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkClearAttachment colorAttachmentAt(long index, int value) { VH_colorAttachment.set(this.segment(), 0L, index, value); return this; }
    public VkClearAttachment clearValue$color$float32At(long index, long index0, float value) { VH_clearValue$color$float32.set(this.segment(), 0L, index, index0, value); return this; }
    public VkClearAttachment clearValue$color$int32At(long index, long index0, int value) { VH_clearValue$color$int32.set(this.segment(), 0L, index, index0, value); return this; }
    public VkClearAttachment clearValue$color$uint32At(long index, long index0, int value) { VH_clearValue$color$uint32.set(this.segment(), 0L, index, index0, value); return this; }
    public VkClearAttachment clearValue$depthStencil$depthAt(long index, float value) { VH_clearValue$depthStencil$depth.set(this.segment(), 0L, index, value); return this; }
    public VkClearAttachment clearValue$depthStencil$stencilAt(long index, int value) { VH_clearValue$depthStencil$stencil.set(this.segment(), 0L, index, value); return this; }
    public VkClearAttachment aspectMask(int value) { VH_aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkClearAttachment colorAttachment(int value) { VH_colorAttachment.set(this.segment(), 0L, 0L, value); return this; }
    public VkClearAttachment clearValue$color$float32(long index0, float value) { VH_clearValue$color$float32.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkClearAttachment clearValue$color$int32(long index0, int value) { VH_clearValue$color$int32.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkClearAttachment clearValue$color$uint32(long index0, int value) { VH_clearValue$color$uint32.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkClearAttachment clearValue$depthStencil$depth(float value) { VH_clearValue$depthStencil$depth.set(this.segment(), 0L, 0L, value); return this; }
    public VkClearAttachment clearValue$depthStencil$stencil(int value) { VH_clearValue$depthStencil$stencil.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _aspectMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_aspectMask, index), LAYOUT_aspectMask); }
    public MemorySegment _aspectMask() { return _aspectMaskAt(0L); }
    public VkClearAttachment _aspectMaskAt(long index, MemorySegment src) { _aspectMaskAt(index).copyFrom(src); return this; }
    public VkClearAttachment _aspectMask(MemorySegment src) { return _aspectMaskAt(0L, src); }
    public MemorySegment _colorAttachmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_colorAttachment, index), LAYOUT_colorAttachment); }
    public MemorySegment _colorAttachment() { return _colorAttachmentAt(0L); }
    public VkClearAttachment _colorAttachmentAt(long index, MemorySegment src) { _colorAttachmentAt(index).copyFrom(src); return this; }
    public VkClearAttachment _colorAttachment(MemorySegment src) { return _colorAttachmentAt(0L, src); }
    public MemorySegment _clearValueAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_clearValue, index), LAYOUT_clearValue); }
    public MemorySegment _clearValue() { return _clearValueAt(0L); }
    public VkClearAttachment _clearValueAt(long index, MemorySegment src) { _clearValueAt(index).copyFrom(src); return this; }
    public VkClearAttachment _clearValue(MemorySegment src) { return _clearValueAt(0L, src); }
}
