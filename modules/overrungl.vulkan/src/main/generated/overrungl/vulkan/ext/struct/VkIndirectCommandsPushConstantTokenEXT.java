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

/// Represents `VkIndirectCommandsPushConstantTokenEXT`.
/// ## Layout
/// ```
/// struct VkIndirectCommandsPushConstantTokenEXT {
///     (struct VkPushConstantRange) VkPushConstantRange updateRange;
/// };
/// ```
public final class VkIndirectCommandsPushConstantTokenEXT extends GroupType {
    /// The struct layout of `VkIndirectCommandsPushConstantTokenEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkPushConstantRange.LAYOUT.withName("updateRange")
    );
    /// The byte offset of `updateRange`.
    public static final long OFFSET_updateRange = LAYOUT.byteOffset(PathElement.groupElement("updateRange"));
    /// The memory layout of `updateRange`.
    public static final MemoryLayout LAYOUT_updateRange = LAYOUT.select(PathElement.groupElement("updateRange"));

    /// Creates `VkIndirectCommandsPushConstantTokenEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkIndirectCommandsPushConstantTokenEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkIndirectCommandsPushConstantTokenEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsPushConstantTokenEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsPushConstantTokenEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkIndirectCommandsPushConstantTokenEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsPushConstantTokenEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsPushConstantTokenEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkIndirectCommandsPushConstantTokenEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsPushConstantTokenEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsPushConstantTokenEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkIndirectCommandsPushConstantTokenEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsPushConstantTokenEXT`
    public static VkIndirectCommandsPushConstantTokenEXT alloc(SegmentAllocator allocator) { return new VkIndirectCommandsPushConstantTokenEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkIndirectCommandsPushConstantTokenEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectCommandsPushConstantTokenEXT`
    public static VkIndirectCommandsPushConstantTokenEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsPushConstantTokenEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkIndirectCommandsPushConstantTokenEXT copyFrom(VkIndirectCommandsPushConstantTokenEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkIndirectCommandsPushConstantTokenEXT reinterpret(long count) { return new VkIndirectCommandsPushConstantTokenEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `updateRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment updateRange(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_updateRange, index), LAYOUT_updateRange); }
    /// {@return `updateRange`}
    public MemorySegment updateRange() { return updateRange(this.segment(), 0L); }
    /// Sets `updateRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void updateRange(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_updateRange, index), LAYOUT_updateRange.byteSize()); }
    /// Sets `updateRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsPushConstantTokenEXT updateRange(MemorySegment value) { updateRange(this.segment(), 0L, value); return this; }
    /// Accepts `updateRange` with the given function.
    /// @param func the function
    /// @return `this`
    public VkIndirectCommandsPushConstantTokenEXT updateRange(Consumer<overrungl.vulkan.struct.VkPushConstantRange> func) { func.accept(overrungl.vulkan.struct.VkPushConstantRange.of(updateRange())); return this; }

    /// Creates a slice of `VkIndirectCommandsPushConstantTokenEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkIndirectCommandsPushConstantTokenEXT`
    public VkIndirectCommandsPushConstantTokenEXT asSlice(long index) { return new VkIndirectCommandsPushConstantTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkIndirectCommandsPushConstantTokenEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkIndirectCommandsPushConstantTokenEXT`
    public VkIndirectCommandsPushConstantTokenEXT asSlice(long index, long count) { return new VkIndirectCommandsPushConstantTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkIndirectCommandsPushConstantTokenEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkIndirectCommandsPushConstantTokenEXT at(long index, Consumer<VkIndirectCommandsPushConstantTokenEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `updateRange` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment updateRangeAt(long index) { return updateRange(this.segment(), index); }
    /// Sets `updateRange` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsPushConstantTokenEXT updateRangeAt(long index, MemorySegment value) { updateRange(this.segment(), index, value); return this; }
    /// Accepts `updateRange` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkIndirectCommandsPushConstantTokenEXT updateRangeAt(long index, Consumer<overrungl.vulkan.struct.VkPushConstantRange> func) { func.accept(overrungl.vulkan.struct.VkPushConstantRange.of(updateRangeAt(index))); return this; }

}
