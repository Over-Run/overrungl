// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAttachmentFeedbackLoopInfoEXT`.
/// ## Layout
/// ```
/// struct VkAttachmentFeedbackLoopInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint32_t) VkBool32 feedbackLoopEnable;
/// };
/// ```
public final class VkAttachmentFeedbackLoopInfoEXT extends GroupType {
    /// The struct layout of `VkAttachmentFeedbackLoopInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("feedbackLoopEnable")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `feedbackLoopEnable`.
    public static final long OFFSET_feedbackLoopEnable = LAYOUT.byteOffset(PathElement.groupElement("feedbackLoopEnable"));
    /// The memory layout of `feedbackLoopEnable`.
    public static final MemoryLayout LAYOUT_feedbackLoopEnable = LAYOUT.select(PathElement.groupElement("feedbackLoopEnable"));
    /// The [VarHandle] of `feedbackLoopEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_feedbackLoopEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("feedbackLoopEnable"));

    /// Creates `VkAttachmentFeedbackLoopInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAttachmentFeedbackLoopInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAttachmentFeedbackLoopInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentFeedbackLoopInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentFeedbackLoopInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAttachmentFeedbackLoopInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentFeedbackLoopInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentFeedbackLoopInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAttachmentFeedbackLoopInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentFeedbackLoopInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentFeedbackLoopInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAttachmentFeedbackLoopInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAttachmentFeedbackLoopInfoEXT`
    public static VkAttachmentFeedbackLoopInfoEXT alloc(SegmentAllocator allocator) { return new VkAttachmentFeedbackLoopInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAttachmentFeedbackLoopInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAttachmentFeedbackLoopInfoEXT`
    public static VkAttachmentFeedbackLoopInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkAttachmentFeedbackLoopInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAttachmentFeedbackLoopInfoEXT copyFrom(VkAttachmentFeedbackLoopInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAttachmentFeedbackLoopInfoEXT reinterpret(long count) { return new VkAttachmentFeedbackLoopInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentFeedbackLoopInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentFeedbackLoopInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `feedbackLoopEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int feedbackLoopEnable(MemorySegment segment, long index) { return (int) VH_feedbackLoopEnable.get(segment, 0L, index); }
    /// {@return `feedbackLoopEnable`}
    public int feedbackLoopEnable() { return feedbackLoopEnable(this.segment(), 0L); }
    /// Sets `feedbackLoopEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void feedbackLoopEnable(MemorySegment segment, long index, int value) { VH_feedbackLoopEnable.set(segment, 0L, index, value); }
    /// Sets `feedbackLoopEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentFeedbackLoopInfoEXT feedbackLoopEnable(int value) { feedbackLoopEnable(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkAttachmentFeedbackLoopInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAttachmentFeedbackLoopInfoEXT`
    public VkAttachmentFeedbackLoopInfoEXT asSlice(long index) { return new VkAttachmentFeedbackLoopInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAttachmentFeedbackLoopInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAttachmentFeedbackLoopInfoEXT`
    public VkAttachmentFeedbackLoopInfoEXT asSlice(long index, long count) { return new VkAttachmentFeedbackLoopInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAttachmentFeedbackLoopInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAttachmentFeedbackLoopInfoEXT at(long index, Consumer<VkAttachmentFeedbackLoopInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentFeedbackLoopInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentFeedbackLoopInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `feedbackLoopEnable` at the given index}
    /// @param index the index of the struct buffer
    public int feedbackLoopEnableAt(long index) { return feedbackLoopEnable(this.segment(), index); }
    /// Sets `feedbackLoopEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentFeedbackLoopInfoEXT feedbackLoopEnableAt(long index, int value) { feedbackLoopEnable(this.segment(), index, value); return this; }

}
