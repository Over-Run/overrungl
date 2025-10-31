// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.union;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkIndirectExecutionSetInfoEXT`.
/// ## Layout
/// ```
/// union VkIndirectExecutionSetInfoEXT {
///     const VkIndirectExecutionSetPipelineInfoEXT* pPipelineInfo;
///     const VkIndirectExecutionSetShaderInfoEXT* pShaderInfo;
/// };
/// ```
public final class VkIndirectExecutionSetInfoEXT extends GroupType {
    /// The union layout of `VkIndirectExecutionSetInfoEXT`.
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.ADDRESS.withName("pPipelineInfo"),
        ValueLayout.ADDRESS.withName("pShaderInfo")
    );
    /// The byte offset of `pPipelineInfo`.
    public static final long OFFSET_pPipelineInfo = LAYOUT.byteOffset(PathElement.groupElement("pPipelineInfo"));
    /// The memory layout of `pPipelineInfo`.
    public static final MemoryLayout LAYOUT_pPipelineInfo = LAYOUT.select(PathElement.groupElement("pPipelineInfo"));
    /// The [VarHandle] of `pPipelineInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPipelineInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineInfo"));
    /// The byte offset of `pShaderInfo`.
    public static final long OFFSET_pShaderInfo = LAYOUT.byteOffset(PathElement.groupElement("pShaderInfo"));
    /// The memory layout of `pShaderInfo`.
    public static final MemoryLayout LAYOUT_pShaderInfo = LAYOUT.select(PathElement.groupElement("pShaderInfo"));
    /// The [VarHandle] of `pShaderInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pShaderInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pShaderInfo"));

    /// Creates `VkIndirectExecutionSetInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this union buffer
    public VkIndirectExecutionSetInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkIndirectExecutionSetInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkIndirectExecutionSetInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkIndirectExecutionSetInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkIndirectExecutionSetInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectExecutionSetInfoEXT`
    public static VkIndirectExecutionSetInfoEXT alloc(SegmentAllocator allocator) { return new VkIndirectExecutionSetInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkIndirectExecutionSetInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectExecutionSetInfoEXT`
    public static VkIndirectExecutionSetInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectExecutionSetInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkIndirectExecutionSetInfoEXT copyFrom(VkIndirectExecutionSetInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkIndirectExecutionSetInfoEXT reinterpret(long count) { return new VkIndirectExecutionSetInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `pPipelineInfo` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment pPipelineInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pPipelineInfo.get(segment, 0L, index); }
    /// {@return `pPipelineInfo`}
    public MemorySegment pPipelineInfo() { return pPipelineInfo(this.segment(), 0L); }
    /// Sets `pPipelineInfo` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void pPipelineInfo(MemorySegment segment, long index, MemorySegment value) { VH_pPipelineInfo.set(segment, 0L, index, value); }
    /// Sets `pPipelineInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetInfoEXT pPipelineInfo(MemorySegment value) { pPipelineInfo(this.segment(), 0L, value); return this; }

    /// {@return `pShaderInfo` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment pShaderInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pShaderInfo.get(segment, 0L, index); }
    /// {@return `pShaderInfo`}
    public MemorySegment pShaderInfo() { return pShaderInfo(this.segment(), 0L); }
    /// Sets `pShaderInfo` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void pShaderInfo(MemorySegment segment, long index, MemorySegment value) { VH_pShaderInfo.set(segment, 0L, index, value); }
    /// Sets `pShaderInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetInfoEXT pShaderInfo(MemorySegment value) { pShaderInfo(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkIndirectExecutionSetInfoEXT`.
    /// @param index the index of the union buffer
    /// @return the slice of `VkIndirectExecutionSetInfoEXT`
    public VkIndirectExecutionSetInfoEXT asSlice(long index) { return new VkIndirectExecutionSetInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkIndirectExecutionSetInfoEXT`.
    /// @param index the index of the union buffer
    /// @param count the count
    /// @return the slice of `VkIndirectExecutionSetInfoEXT`
    public VkIndirectExecutionSetInfoEXT asSlice(long index, long count) { return new VkIndirectExecutionSetInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkIndirectExecutionSetInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkIndirectExecutionSetInfoEXT at(long index, Consumer<VkIndirectExecutionSetInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `pPipelineInfo` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment pPipelineInfoAt(long index) { return pPipelineInfo(this.segment(), index); }
    /// Sets `pPipelineInfo` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetInfoEXT pPipelineInfoAt(long index, MemorySegment value) { pPipelineInfo(this.segment(), index, value); return this; }

    /// {@return `pShaderInfo` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment pShaderInfoAt(long index) { return pShaderInfo(this.segment(), index); }
    /// Sets `pShaderInfo` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetInfoEXT pShaderInfoAt(long index, MemorySegment value) { pShaderInfo(this.segment(), index, value); return this; }

}
