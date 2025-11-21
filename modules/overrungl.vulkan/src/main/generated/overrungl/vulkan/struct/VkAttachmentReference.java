// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAttachmentReference`.
/// ## Layout
/// ```
/// struct VkAttachmentReference {
///     uint32_t attachment;
///     VkImageLayout layout;
/// }
/// ```
public final class VkAttachmentReference extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("attachment"),
        ValueLayout.JAVA_INT.withName("layout")
    );
    public static final long OFFSET_attachment = LAYOUT.byteOffset(PathElement.groupElement("attachment"));
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    public static final MemoryLayout LAYOUT_attachment = LAYOUT.select(PathElement.groupElement("attachment"));
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    public static final VarHandle VH_attachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachment"));
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));

    public VkAttachmentReference(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAttachmentReference of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentReference(segment, estimateCount(segment, LAYOUT)); }
    public static VkAttachmentReference ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentReference(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAttachmentReference ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentReference(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAttachmentReference alloc(SegmentAllocator allocator) { return new VkAttachmentReference(allocator.allocate(LAYOUT), 1); }
    public static VkAttachmentReference alloc(SegmentAllocator allocator, long count) { return new VkAttachmentReference(allocator.allocate(LAYOUT, count), count); }
    public VkAttachmentReference copyFrom(VkAttachmentReference src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAttachmentReference reinterpret(long count) { return new VkAttachmentReference(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAttachmentReference asSlice(long index) { return new VkAttachmentReference(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAttachmentReference asSlice(long index, long count) { return new VkAttachmentReference(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAttachmentReference at(long index, Consumer<VkAttachmentReference> func) { func.accept(asSlice(index)); return this; }
    public int attachmentAt(long index) { return (int) VH_attachment.get(this.segment(), 0L, index); }
    public int layoutAt(long index) { return (int) VH_layout.get(this.segment(), 0L, index); }
    public int attachment() { return (int) VH_attachment.get(this.segment(), 0L, 0L); }
    public int layout() { return (int) VH_layout.get(this.segment(), 0L, 0L); }
    public VkAttachmentReference attachmentAt(long index, int value) { VH_attachment.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentReference layoutAt(long index, int value) { VH_layout.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentReference attachment(int value) { VH_attachment.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentReference layout(int value) { VH_layout.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _attachmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_attachment, index), LAYOUT_attachment); }
    public MemorySegment _attachment() { return _attachmentAt(0L); }
    public VkAttachmentReference _attachmentAt(long index, MemorySegment src) { _attachmentAt(index).copyFrom(src); return this; }
    public VkAttachmentReference _attachment(MemorySegment src) { return _attachmentAt(0L, src); }
    public MemorySegment _layoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layout, index), LAYOUT_layout); }
    public MemorySegment _layout() { return _layoutAt(0L); }
    public VkAttachmentReference _layoutAt(long index, MemorySegment src) { _layoutAt(index).copyFrom(src); return this; }
    public VkAttachmentReference _layout(MemorySegment src) { return _layoutAt(0L, src); }
}
