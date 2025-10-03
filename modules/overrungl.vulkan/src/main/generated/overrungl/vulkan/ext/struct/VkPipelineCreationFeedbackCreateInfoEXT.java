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

/// Represents `VkPipelineCreationFeedbackCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkPipelineCreationFeedbackCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     VkPipelineCreationFeedback* pPipelineCreationFeedback;
///     uint32_t pipelineStageCreationFeedbackCount;
///     VkPipelineCreationFeedback* pPipelineStageCreationFeedbacks;
/// };
/// ```
public final class VkPipelineCreationFeedbackCreateInfoEXT extends GroupType {
    /// The struct layout of `VkPipelineCreationFeedbackCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pPipelineCreationFeedback"),
        ValueLayout.JAVA_INT.withName("pipelineStageCreationFeedbackCount"),
        ValueLayout.ADDRESS.withName("pPipelineStageCreationFeedbacks")
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
    /// The byte offset of `pPipelineCreationFeedback`.
    public static final long OFFSET_pPipelineCreationFeedback = LAYOUT.byteOffset(PathElement.groupElement("pPipelineCreationFeedback"));
    /// The memory layout of `pPipelineCreationFeedback`.
    public static final MemoryLayout LAYOUT_pPipelineCreationFeedback = LAYOUT.select(PathElement.groupElement("pPipelineCreationFeedback"));
    /// The [VarHandle] of `pPipelineCreationFeedback` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPipelineCreationFeedback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineCreationFeedback"));
    /// The byte offset of `pipelineStageCreationFeedbackCount`.
    public static final long OFFSET_pipelineStageCreationFeedbackCount = LAYOUT.byteOffset(PathElement.groupElement("pipelineStageCreationFeedbackCount"));
    /// The memory layout of `pipelineStageCreationFeedbackCount`.
    public static final MemoryLayout LAYOUT_pipelineStageCreationFeedbackCount = LAYOUT.select(PathElement.groupElement("pipelineStageCreationFeedbackCount"));
    /// The [VarHandle] of `pipelineStageCreationFeedbackCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineStageCreationFeedbackCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineStageCreationFeedbackCount"));
    /// The byte offset of `pPipelineStageCreationFeedbacks`.
    public static final long OFFSET_pPipelineStageCreationFeedbacks = LAYOUT.byteOffset(PathElement.groupElement("pPipelineStageCreationFeedbacks"));
    /// The memory layout of `pPipelineStageCreationFeedbacks`.
    public static final MemoryLayout LAYOUT_pPipelineStageCreationFeedbacks = LAYOUT.select(PathElement.groupElement("pPipelineStageCreationFeedbacks"));
    /// The [VarHandle] of `pPipelineStageCreationFeedbacks` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPipelineStageCreationFeedbacks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineStageCreationFeedbacks"));

    /// Creates `VkPipelineCreationFeedbackCreateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineCreationFeedbackCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineCreationFeedbackCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCreationFeedbackCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCreationFeedbackCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineCreationFeedbackCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCreationFeedbackCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCreationFeedbackCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineCreationFeedbackCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCreationFeedbackCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCreationFeedbackCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineCreationFeedbackCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCreationFeedbackCreateInfoEXT`
    public static VkPipelineCreationFeedbackCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineCreationFeedbackCreateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineCreationFeedbackCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineCreationFeedbackCreateInfoEXT`
    public static VkPipelineCreationFeedbackCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineCreationFeedbackCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfoEXT copyFrom(VkPipelineCreationFeedbackCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineCreationFeedbackCreateInfoEXT reinterpret(long count) { return new VkPipelineCreationFeedbackCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineCreationFeedbackCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineCreationFeedbackCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pPipelineCreationFeedback` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPipelineCreationFeedback(MemorySegment segment, long index) { return (MemorySegment) VH_pPipelineCreationFeedback.get(segment, 0L, index); }
    /// {@return `pPipelineCreationFeedback`}
    public MemorySegment pPipelineCreationFeedback() { return pPipelineCreationFeedback(this.segment(), 0L); }
    /// Sets `pPipelineCreationFeedback` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPipelineCreationFeedback(MemorySegment segment, long index, MemorySegment value) { VH_pPipelineCreationFeedback.set(segment, 0L, index, value); }
    /// Sets `pPipelineCreationFeedback` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfoEXT pPipelineCreationFeedback(MemorySegment value) { pPipelineCreationFeedback(this.segment(), 0L, value); return this; }

    /// {@return `pipelineStageCreationFeedbackCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineStageCreationFeedbackCount(MemorySegment segment, long index) { return (int) VH_pipelineStageCreationFeedbackCount.get(segment, 0L, index); }
    /// {@return `pipelineStageCreationFeedbackCount`}
    public int pipelineStageCreationFeedbackCount() { return pipelineStageCreationFeedbackCount(this.segment(), 0L); }
    /// Sets `pipelineStageCreationFeedbackCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineStageCreationFeedbackCount(MemorySegment segment, long index, int value) { VH_pipelineStageCreationFeedbackCount.set(segment, 0L, index, value); }
    /// Sets `pipelineStageCreationFeedbackCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfoEXT pipelineStageCreationFeedbackCount(int value) { pipelineStageCreationFeedbackCount(this.segment(), 0L, value); return this; }

    /// {@return `pPipelineStageCreationFeedbacks` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPipelineStageCreationFeedbacks(MemorySegment segment, long index) { return (MemorySegment) VH_pPipelineStageCreationFeedbacks.get(segment, 0L, index); }
    /// {@return `pPipelineStageCreationFeedbacks`}
    public MemorySegment pPipelineStageCreationFeedbacks() { return pPipelineStageCreationFeedbacks(this.segment(), 0L); }
    /// Sets `pPipelineStageCreationFeedbacks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPipelineStageCreationFeedbacks(MemorySegment segment, long index, MemorySegment value) { VH_pPipelineStageCreationFeedbacks.set(segment, 0L, index, value); }
    /// Sets `pPipelineStageCreationFeedbacks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfoEXT pPipelineStageCreationFeedbacks(MemorySegment value) { pPipelineStageCreationFeedbacks(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineCreationFeedbackCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineCreationFeedbackCreateInfoEXT`
    public VkPipelineCreationFeedbackCreateInfoEXT asSlice(long index) { return new VkPipelineCreationFeedbackCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineCreationFeedbackCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineCreationFeedbackCreateInfoEXT`
    public VkPipelineCreationFeedbackCreateInfoEXT asSlice(long index, long count) { return new VkPipelineCreationFeedbackCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineCreationFeedbackCreateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfoEXT at(long index, Consumer<VkPipelineCreationFeedbackCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pPipelineCreationFeedback` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pPipelineCreationFeedbackAt(long index) { return pPipelineCreationFeedback(this.segment(), index); }
    /// Sets `pPipelineCreationFeedback` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfoEXT pPipelineCreationFeedbackAt(long index, MemorySegment value) { pPipelineCreationFeedback(this.segment(), index, value); return this; }

    /// {@return `pipelineStageCreationFeedbackCount` at the given index}
    /// @param index the index of the struct buffer
    public int pipelineStageCreationFeedbackCountAt(long index) { return pipelineStageCreationFeedbackCount(this.segment(), index); }
    /// Sets `pipelineStageCreationFeedbackCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfoEXT pipelineStageCreationFeedbackCountAt(long index, int value) { pipelineStageCreationFeedbackCount(this.segment(), index, value); return this; }

    /// {@return `pPipelineStageCreationFeedbacks` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pPipelineStageCreationFeedbacksAt(long index) { return pPipelineStageCreationFeedbacks(this.segment(), index); }
    /// Sets `pPipelineStageCreationFeedbacks` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfoEXT pPipelineStageCreationFeedbacksAt(long index, MemorySegment value) { pPipelineStageCreationFeedbacks(this.segment(), index, value); return this; }

}
