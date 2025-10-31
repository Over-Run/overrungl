// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindShaderGroupIndirectCommandNV`.
/// ## Layout
/// ```
/// struct VkBindShaderGroupIndirectCommandNV {
///     uint32_t groupIndex;
/// };
/// ```
public final class VkBindShaderGroupIndirectCommandNV extends GroupType {
    /// The struct layout of `VkBindShaderGroupIndirectCommandNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("groupIndex")
    );
    /// The byte offset of `groupIndex`.
    public static final long OFFSET_groupIndex = LAYOUT.byteOffset(PathElement.groupElement("groupIndex"));
    /// The memory layout of `groupIndex`.
    public static final MemoryLayout LAYOUT_groupIndex = LAYOUT.select(PathElement.groupElement("groupIndex"));
    /// The [VarHandle] of `groupIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_groupIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("groupIndex"));

    /// Creates `VkBindShaderGroupIndirectCommandNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkBindShaderGroupIndirectCommandNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkBindShaderGroupIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindShaderGroupIndirectCommandNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindShaderGroupIndirectCommandNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindShaderGroupIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindShaderGroupIndirectCommandNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindShaderGroupIndirectCommandNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkBindShaderGroupIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindShaderGroupIndirectCommandNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindShaderGroupIndirectCommandNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBindShaderGroupIndirectCommandNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindShaderGroupIndirectCommandNV`
    public static VkBindShaderGroupIndirectCommandNV alloc(SegmentAllocator allocator) { return new VkBindShaderGroupIndirectCommandNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkBindShaderGroupIndirectCommandNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindShaderGroupIndirectCommandNV`
    public static VkBindShaderGroupIndirectCommandNV alloc(SegmentAllocator allocator, long count) { return new VkBindShaderGroupIndirectCommandNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindShaderGroupIndirectCommandNV copyFrom(VkBindShaderGroupIndirectCommandNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkBindShaderGroupIndirectCommandNV reinterpret(long count) { return new VkBindShaderGroupIndirectCommandNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `groupIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int groupIndex(MemorySegment segment, long index) { return (int) VH_groupIndex.get(segment, 0L, index); }
    /// {@return `groupIndex`}
    public int groupIndex() { return groupIndex(this.segment(), 0L); }
    /// Sets `groupIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void groupIndex(MemorySegment segment, long index, int value) { VH_groupIndex.set(segment, 0L, index, value); }
    /// Sets `groupIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindShaderGroupIndirectCommandNV groupIndex(int value) { groupIndex(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkBindShaderGroupIndirectCommandNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBindShaderGroupIndirectCommandNV`
    public VkBindShaderGroupIndirectCommandNV asSlice(long index) { return new VkBindShaderGroupIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkBindShaderGroupIndirectCommandNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBindShaderGroupIndirectCommandNV`
    public VkBindShaderGroupIndirectCommandNV asSlice(long index, long count) { return new VkBindShaderGroupIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkBindShaderGroupIndirectCommandNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkBindShaderGroupIndirectCommandNV at(long index, Consumer<VkBindShaderGroupIndirectCommandNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `groupIndex` at the given index}
    /// @param index the index of the struct buffer
    public int groupIndexAt(long index) { return groupIndex(this.segment(), index); }
    /// Sets `groupIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindShaderGroupIndirectCommandNV groupIndexAt(long index, int value) { groupIndex(this.segment(), index, value); return this; }

}
