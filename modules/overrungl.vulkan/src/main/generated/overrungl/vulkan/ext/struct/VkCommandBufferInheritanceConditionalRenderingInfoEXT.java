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

/// Represents `VkCommandBufferInheritanceConditionalRenderingInfoEXT`.
/// ## Layout
/// ```
/// struct VkCommandBufferInheritanceConditionalRenderingInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint32_t) VkBool32 conditionalRenderingEnable;
/// };
/// ```
public final class VkCommandBufferInheritanceConditionalRenderingInfoEXT extends GroupType {
    /// The struct layout of `VkCommandBufferInheritanceConditionalRenderingInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("conditionalRenderingEnable")
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
    /// The byte offset of `conditionalRenderingEnable`.
    public static final long OFFSET_conditionalRenderingEnable = LAYOUT.byteOffset(PathElement.groupElement("conditionalRenderingEnable"));
    /// The memory layout of `conditionalRenderingEnable`.
    public static final MemoryLayout LAYOUT_conditionalRenderingEnable = LAYOUT.select(PathElement.groupElement("conditionalRenderingEnable"));
    /// The [VarHandle] of `conditionalRenderingEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_conditionalRenderingEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conditionalRenderingEnable"));

    /// Creates `VkCommandBufferInheritanceConditionalRenderingInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkCommandBufferInheritanceConditionalRenderingInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferInheritanceConditionalRenderingInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCommandBufferInheritanceConditionalRenderingInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferInheritanceConditionalRenderingInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkCommandBufferInheritanceConditionalRenderingInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCommandBufferInheritanceConditionalRenderingInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCommandBufferInheritanceConditionalRenderingInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCommandBufferInheritanceConditionalRenderingInfoEXT`
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT alloc(SegmentAllocator allocator) { return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkCommandBufferInheritanceConditionalRenderingInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCommandBufferInheritanceConditionalRenderingInfoEXT`
    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT copyFrom(VkCommandBufferInheritanceConditionalRenderingInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT reinterpret(long count) { return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `conditionalRenderingEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int conditionalRenderingEnable(MemorySegment segment, long index) { return (int) VH_conditionalRenderingEnable.get(segment, 0L, index); }
    /// {@return `conditionalRenderingEnable`}
    public int conditionalRenderingEnable() { return conditionalRenderingEnable(this.segment(), 0L); }
    /// Sets `conditionalRenderingEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void conditionalRenderingEnable(MemorySegment segment, long index, int value) { VH_conditionalRenderingEnable.set(segment, 0L, index, value); }
    /// Sets `conditionalRenderingEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT conditionalRenderingEnable(int value) { conditionalRenderingEnable(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkCommandBufferInheritanceConditionalRenderingInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCommandBufferInheritanceConditionalRenderingInfoEXT`
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT asSlice(long index) { return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkCommandBufferInheritanceConditionalRenderingInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCommandBufferInheritanceConditionalRenderingInfoEXT`
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT asSlice(long index, long count) { return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkCommandBufferInheritanceConditionalRenderingInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT at(long index, Consumer<VkCommandBufferInheritanceConditionalRenderingInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `conditionalRenderingEnable` at the given index}
    /// @param index the index of the struct buffer
    public int conditionalRenderingEnableAt(long index) { return conditionalRenderingEnable(this.segment(), index); }
    /// Sets `conditionalRenderingEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT conditionalRenderingEnableAt(long index, int value) { conditionalRenderingEnable(this.segment(), index, value); return this; }

}
