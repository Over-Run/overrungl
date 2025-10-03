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

/// Represents `VkRenderPassCreationFeedbackInfoEXT`.
/// ## Layout
/// ```
/// struct VkRenderPassCreationFeedbackInfoEXT {
///     uint32_t postMergeSubpassCount;
/// };
/// ```
public final class VkRenderPassCreationFeedbackInfoEXT extends GroupType {
    /// The struct layout of `VkRenderPassCreationFeedbackInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("postMergeSubpassCount")
    );
    /// The byte offset of `postMergeSubpassCount`.
    public static final long OFFSET_postMergeSubpassCount = LAYOUT.byteOffset(PathElement.groupElement("postMergeSubpassCount"));
    /// The memory layout of `postMergeSubpassCount`.
    public static final MemoryLayout LAYOUT_postMergeSubpassCount = LAYOUT.select(PathElement.groupElement("postMergeSubpassCount"));
    /// The [VarHandle] of `postMergeSubpassCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_postMergeSubpassCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("postMergeSubpassCount")));

    /// Creates `VkRenderPassCreationFeedbackInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkRenderPassCreationFeedbackInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkRenderPassCreationFeedbackInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassCreationFeedbackInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassCreationFeedbackInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderPassCreationFeedbackInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassCreationFeedbackInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassCreationFeedbackInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkRenderPassCreationFeedbackInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassCreationFeedbackInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassCreationFeedbackInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRenderPassCreationFeedbackInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassCreationFeedbackInfoEXT`
    public static VkRenderPassCreationFeedbackInfoEXT alloc(SegmentAllocator allocator) { return new VkRenderPassCreationFeedbackInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkRenderPassCreationFeedbackInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassCreationFeedbackInfoEXT`
    public static VkRenderPassCreationFeedbackInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkRenderPassCreationFeedbackInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderPassCreationFeedbackInfoEXT copyFrom(VkRenderPassCreationFeedbackInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkRenderPassCreationFeedbackInfoEXT reinterpret(long count) { return new VkRenderPassCreationFeedbackInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `postMergeSubpassCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int postMergeSubpassCount(MemorySegment segment, long index) { return (int) VH_postMergeSubpassCount.get().get(segment, 0L, index); }
    /// {@return `postMergeSubpassCount`}
    public int postMergeSubpassCount() { return postMergeSubpassCount(this.segment(), 0L); }
    /// Sets `postMergeSubpassCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void postMergeSubpassCount(MemorySegment segment, long index, int value) { VH_postMergeSubpassCount.get().set(segment, 0L, index, value); }
    /// Sets `postMergeSubpassCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreationFeedbackInfoEXT postMergeSubpassCount(int value) { postMergeSubpassCount(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkRenderPassCreationFeedbackInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRenderPassCreationFeedbackInfoEXT`
    public VkRenderPassCreationFeedbackInfoEXT asSlice(long index) { return new VkRenderPassCreationFeedbackInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkRenderPassCreationFeedbackInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRenderPassCreationFeedbackInfoEXT`
    public VkRenderPassCreationFeedbackInfoEXT asSlice(long index, long count) { return new VkRenderPassCreationFeedbackInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkRenderPassCreationFeedbackInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkRenderPassCreationFeedbackInfoEXT at(long index, Consumer<VkRenderPassCreationFeedbackInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `postMergeSubpassCount` at the given index}
    /// @param index the index of the struct buffer
    public int postMergeSubpassCountAt(long index) { return postMergeSubpassCount(this.segment(), index); }
    /// Sets `postMergeSubpassCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreationFeedbackInfoEXT postMergeSubpassCountAt(long index, int value) { postMergeSubpassCount(this.segment(), index, value); return this; }

}
