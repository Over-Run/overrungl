// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkInputAttachmentAspectReferenceKHR`.
/// ## Layout
/// ```
/// struct VkInputAttachmentAspectReferenceKHR {
///     uint32_t subpass;
///     uint32_t inputAttachmentIndex;
///     VkImageAspectFlags aspectMask;
/// }
/// ```
public final class VkInputAttachmentAspectReferenceKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("subpass"),
        ValueLayout.JAVA_INT.withName("inputAttachmentIndex"),
        ValueLayout.JAVA_INT.withName("aspectMask")
    );
    public static final long OFFSET_subpass = LAYOUT.byteOffset(PathElement.groupElement("subpass"));
    public static final long OFFSET_inputAttachmentIndex = LAYOUT.byteOffset(PathElement.groupElement("inputAttachmentIndex"));
    public static final long OFFSET_aspectMask = LAYOUT.byteOffset(PathElement.groupElement("aspectMask"));
    public static final MemoryLayout LAYOUT_subpass = LAYOUT.select(PathElement.groupElement("subpass"));
    public static final MemoryLayout LAYOUT_inputAttachmentIndex = LAYOUT.select(PathElement.groupElement("inputAttachmentIndex"));
    public static final MemoryLayout LAYOUT_aspectMask = LAYOUT.select(PathElement.groupElement("aspectMask"));
    public static final VarHandle VH_subpass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpass"));
    public static final VarHandle VH_inputAttachmentIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inputAttachmentIndex"));
    public static final VarHandle VH_aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectMask"));

    public VkInputAttachmentAspectReferenceKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkInputAttachmentAspectReferenceKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkInputAttachmentAspectReferenceKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkInputAttachmentAspectReferenceKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkInputAttachmentAspectReferenceKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkInputAttachmentAspectReferenceKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkInputAttachmentAspectReferenceKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkInputAttachmentAspectReferenceKHR alloc(SegmentAllocator allocator) { return new VkInputAttachmentAspectReferenceKHR(allocator.allocate(LAYOUT), 1); }
    public static VkInputAttachmentAspectReferenceKHR alloc(SegmentAllocator allocator, long count) { return new VkInputAttachmentAspectReferenceKHR(allocator.allocate(LAYOUT, count), count); }
    public VkInputAttachmentAspectReferenceKHR copyFrom(VkInputAttachmentAspectReferenceKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkInputAttachmentAspectReferenceKHR reinterpret(long count) { return new VkInputAttachmentAspectReferenceKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkInputAttachmentAspectReferenceKHR asSlice(long index) { return new VkInputAttachmentAspectReferenceKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkInputAttachmentAspectReferenceKHR asSlice(long index, long count) { return new VkInputAttachmentAspectReferenceKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkInputAttachmentAspectReferenceKHR at(long index, Consumer<VkInputAttachmentAspectReferenceKHR> func) { func.accept(asSlice(index)); return this; }
    public int subpassAt(long index) { return (int) VH_subpass.get(this.segment(), 0L, index); }
    public int inputAttachmentIndexAt(long index) { return (int) VH_inputAttachmentIndex.get(this.segment(), 0L, index); }
    public int aspectMaskAt(long index) { return (int) VH_aspectMask.get(this.segment(), 0L, index); }
    public int subpass() { return (int) VH_subpass.get(this.segment(), 0L, 0L); }
    public int inputAttachmentIndex() { return (int) VH_inputAttachmentIndex.get(this.segment(), 0L, 0L); }
    public int aspectMask() { return (int) VH_aspectMask.get(this.segment(), 0L, 0L); }
    public VkInputAttachmentAspectReferenceKHR subpassAt(long index, int value) { VH_subpass.set(this.segment(), 0L, index, value); return this; }
    public VkInputAttachmentAspectReferenceKHR inputAttachmentIndexAt(long index, int value) { VH_inputAttachmentIndex.set(this.segment(), 0L, index, value); return this; }
    public VkInputAttachmentAspectReferenceKHR aspectMaskAt(long index, int value) { VH_aspectMask.set(this.segment(), 0L, index, value); return this; }
    public VkInputAttachmentAspectReferenceKHR subpass(int value) { VH_subpass.set(this.segment(), 0L, 0L, value); return this; }
    public VkInputAttachmentAspectReferenceKHR inputAttachmentIndex(int value) { VH_inputAttachmentIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkInputAttachmentAspectReferenceKHR aspectMask(int value) { VH_aspectMask.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _subpassAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subpass, index), LAYOUT_subpass); }
    public MemorySegment _subpass() { return _subpassAt(0L); }
    public VkInputAttachmentAspectReferenceKHR _subpassAt(long index, MemorySegment src) { _subpassAt(index).copyFrom(src); return this; }
    public VkInputAttachmentAspectReferenceKHR _subpass(MemorySegment src) { return _subpassAt(0L, src); }
    public MemorySegment _inputAttachmentIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_inputAttachmentIndex, index), LAYOUT_inputAttachmentIndex); }
    public MemorySegment _inputAttachmentIndex() { return _inputAttachmentIndexAt(0L); }
    public VkInputAttachmentAspectReferenceKHR _inputAttachmentIndexAt(long index, MemorySegment src) { _inputAttachmentIndexAt(index).copyFrom(src); return this; }
    public VkInputAttachmentAspectReferenceKHR _inputAttachmentIndex(MemorySegment src) { return _inputAttachmentIndexAt(0L, src); }
    public MemorySegment _aspectMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_aspectMask, index), LAYOUT_aspectMask); }
    public MemorySegment _aspectMask() { return _aspectMaskAt(0L); }
    public VkInputAttachmentAspectReferenceKHR _aspectMaskAt(long index, MemorySegment src) { _aspectMaskAt(index).copyFrom(src); return this; }
    public VkInputAttachmentAspectReferenceKHR _aspectMask(MemorySegment src) { return _aspectMaskAt(0L, src); }
}
