// This file is auto-generated. DO NOT EDIT!
//@formatter:off
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
///     ((uint32_t) VkFlags) VkImageAspectFlags aspectMask;
/// };
/// ```
public final class VkInputAttachmentAspectReferenceKHR extends GroupType {
    /// The struct layout of `VkInputAttachmentAspectReferenceKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("subpass"),
        ValueLayout.JAVA_INT.withName("inputAttachmentIndex"),
        ValueLayout.JAVA_INT.withName("aspectMask")
    );
    /// The byte offset of `subpass`.
    public static final long OFFSET_subpass = LAYOUT.byteOffset(PathElement.groupElement("subpass"));
    /// The memory layout of `subpass`.
    public static final MemoryLayout LAYOUT_subpass = LAYOUT.select(PathElement.groupElement("subpass"));
    /// The [VarHandle] of `subpass` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subpass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpass"));
    /// The byte offset of `inputAttachmentIndex`.
    public static final long OFFSET_inputAttachmentIndex = LAYOUT.byteOffset(PathElement.groupElement("inputAttachmentIndex"));
    /// The memory layout of `inputAttachmentIndex`.
    public static final MemoryLayout LAYOUT_inputAttachmentIndex = LAYOUT.select(PathElement.groupElement("inputAttachmentIndex"));
    /// The [VarHandle] of `inputAttachmentIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_inputAttachmentIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inputAttachmentIndex"));
    /// The byte offset of `aspectMask`.
    public static final long OFFSET_aspectMask = LAYOUT.byteOffset(PathElement.groupElement("aspectMask"));
    /// The memory layout of `aspectMask`.
    public static final MemoryLayout LAYOUT_aspectMask = LAYOUT.select(PathElement.groupElement("aspectMask"));
    /// The [VarHandle] of `aspectMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectMask"));

    /// Creates `VkInputAttachmentAspectReferenceKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkInputAttachmentAspectReferenceKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkInputAttachmentAspectReferenceKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkInputAttachmentAspectReferenceKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkInputAttachmentAspectReferenceKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkInputAttachmentAspectReferenceKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkInputAttachmentAspectReferenceKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkInputAttachmentAspectReferenceKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkInputAttachmentAspectReferenceKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkInputAttachmentAspectReferenceKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkInputAttachmentAspectReferenceKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkInputAttachmentAspectReferenceKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkInputAttachmentAspectReferenceKHR`
    public static VkInputAttachmentAspectReferenceKHR alloc(SegmentAllocator allocator) { return new VkInputAttachmentAspectReferenceKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkInputAttachmentAspectReferenceKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkInputAttachmentAspectReferenceKHR`
    public static VkInputAttachmentAspectReferenceKHR alloc(SegmentAllocator allocator, long count) { return new VkInputAttachmentAspectReferenceKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkInputAttachmentAspectReferenceKHR copyFrom(VkInputAttachmentAspectReferenceKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkInputAttachmentAspectReferenceKHR reinterpret(long count) { return new VkInputAttachmentAspectReferenceKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `subpass` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subpass(MemorySegment segment, long index) { return (int) VH_subpass.get(segment, 0L, index); }
    /// {@return `subpass`}
    public int subpass() { return subpass(this.segment(), 0L); }
    /// Sets `subpass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subpass(MemorySegment segment, long index, int value) { VH_subpass.set(segment, 0L, index, value); }
    /// Sets `subpass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInputAttachmentAspectReferenceKHR subpass(int value) { subpass(this.segment(), 0L, value); return this; }

    /// {@return `inputAttachmentIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int inputAttachmentIndex(MemorySegment segment, long index) { return (int) VH_inputAttachmentIndex.get(segment, 0L, index); }
    /// {@return `inputAttachmentIndex`}
    public int inputAttachmentIndex() { return inputAttachmentIndex(this.segment(), 0L); }
    /// Sets `inputAttachmentIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void inputAttachmentIndex(MemorySegment segment, long index, int value) { VH_inputAttachmentIndex.set(segment, 0L, index, value); }
    /// Sets `inputAttachmentIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInputAttachmentAspectReferenceKHR inputAttachmentIndex(int value) { inputAttachmentIndex(this.segment(), 0L, value); return this; }

    /// {@return `aspectMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int aspectMask(MemorySegment segment, long index) { return (int) VH_aspectMask.get(segment, 0L, index); }
    /// {@return `aspectMask`}
    public int aspectMask() { return aspectMask(this.segment(), 0L); }
    /// Sets `aspectMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void aspectMask(MemorySegment segment, long index, int value) { VH_aspectMask.set(segment, 0L, index, value); }
    /// Sets `aspectMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInputAttachmentAspectReferenceKHR aspectMask(int value) { aspectMask(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkInputAttachmentAspectReferenceKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkInputAttachmentAspectReferenceKHR`
    public VkInputAttachmentAspectReferenceKHR asSlice(long index) { return new VkInputAttachmentAspectReferenceKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkInputAttachmentAspectReferenceKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkInputAttachmentAspectReferenceKHR`
    public VkInputAttachmentAspectReferenceKHR asSlice(long index, long count) { return new VkInputAttachmentAspectReferenceKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkInputAttachmentAspectReferenceKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkInputAttachmentAspectReferenceKHR at(long index, Consumer<VkInputAttachmentAspectReferenceKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `subpass` at the given index}
    /// @param index the index of the struct buffer
    public int subpassAt(long index) { return subpass(this.segment(), index); }
    /// Sets `subpass` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkInputAttachmentAspectReferenceKHR subpassAt(long index, int value) { subpass(this.segment(), index, value); return this; }

    /// {@return `inputAttachmentIndex` at the given index}
    /// @param index the index of the struct buffer
    public int inputAttachmentIndexAt(long index) { return inputAttachmentIndex(this.segment(), index); }
    /// Sets `inputAttachmentIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkInputAttachmentAspectReferenceKHR inputAttachmentIndexAt(long index, int value) { inputAttachmentIndex(this.segment(), index, value); return this; }

    /// {@return `aspectMask` at the given index}
    /// @param index the index of the struct buffer
    public int aspectMaskAt(long index) { return aspectMask(this.segment(), index); }
    /// Sets `aspectMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkInputAttachmentAspectReferenceKHR aspectMaskAt(long index, int value) { aspectMask(this.segment(), index, value); return this; }

}
