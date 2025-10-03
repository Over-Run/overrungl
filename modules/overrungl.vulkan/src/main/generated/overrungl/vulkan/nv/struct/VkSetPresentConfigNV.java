// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSetPresentConfigNV`.
/// ## Layout
/// ```
/// struct VkSetPresentConfigNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t numFramesPerBatch;
///     uint32_t presentConfigFeedback;
/// };
/// ```
public final class VkSetPresentConfigNV extends GroupType {
    /// The struct layout of `VkSetPresentConfigNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("numFramesPerBatch"),
        ValueLayout.JAVA_INT.withName("presentConfigFeedback")
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
    /// The byte offset of `numFramesPerBatch`.
    public static final long OFFSET_numFramesPerBatch = LAYOUT.byteOffset(PathElement.groupElement("numFramesPerBatch"));
    /// The memory layout of `numFramesPerBatch`.
    public static final MemoryLayout LAYOUT_numFramesPerBatch = LAYOUT.select(PathElement.groupElement("numFramesPerBatch"));
    /// The [VarHandle] of `numFramesPerBatch` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_numFramesPerBatch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numFramesPerBatch"));
    /// The byte offset of `presentConfigFeedback`.
    public static final long OFFSET_presentConfigFeedback = LAYOUT.byteOffset(PathElement.groupElement("presentConfigFeedback"));
    /// The memory layout of `presentConfigFeedback`.
    public static final MemoryLayout LAYOUT_presentConfigFeedback = LAYOUT.select(PathElement.groupElement("presentConfigFeedback"));
    /// The [VarHandle] of `presentConfigFeedback` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_presentConfigFeedback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentConfigFeedback"));

    /// Creates `VkSetPresentConfigNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSetPresentConfigNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSetPresentConfigNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSetPresentConfigNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSetPresentConfigNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSetPresentConfigNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSetPresentConfigNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSetPresentConfigNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSetPresentConfigNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSetPresentConfigNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSetPresentConfigNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSetPresentConfigNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSetPresentConfigNV`
    public static VkSetPresentConfigNV alloc(SegmentAllocator allocator) { return new VkSetPresentConfigNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSetPresentConfigNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSetPresentConfigNV`
    public static VkSetPresentConfigNV alloc(SegmentAllocator allocator, long count) { return new VkSetPresentConfigNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSetPresentConfigNV copyFrom(VkSetPresentConfigNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSetPresentConfigNV reinterpret(long count) { return new VkSetPresentConfigNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSetPresentConfigNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSetPresentConfigNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `numFramesPerBatch` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int numFramesPerBatch(MemorySegment segment, long index) { return (int) VH_numFramesPerBatch.get(segment, 0L, index); }
    /// {@return `numFramesPerBatch`}
    public int numFramesPerBatch() { return numFramesPerBatch(this.segment(), 0L); }
    /// Sets `numFramesPerBatch` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void numFramesPerBatch(MemorySegment segment, long index, int value) { VH_numFramesPerBatch.set(segment, 0L, index, value); }
    /// Sets `numFramesPerBatch` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetPresentConfigNV numFramesPerBatch(int value) { numFramesPerBatch(this.segment(), 0L, value); return this; }

    /// {@return `presentConfigFeedback` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int presentConfigFeedback(MemorySegment segment, long index) { return (int) VH_presentConfigFeedback.get(segment, 0L, index); }
    /// {@return `presentConfigFeedback`}
    public int presentConfigFeedback() { return presentConfigFeedback(this.segment(), 0L); }
    /// Sets `presentConfigFeedback` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentConfigFeedback(MemorySegment segment, long index, int value) { VH_presentConfigFeedback.set(segment, 0L, index, value); }
    /// Sets `presentConfigFeedback` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetPresentConfigNV presentConfigFeedback(int value) { presentConfigFeedback(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSetPresentConfigNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSetPresentConfigNV`
    public VkSetPresentConfigNV asSlice(long index) { return new VkSetPresentConfigNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSetPresentConfigNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSetPresentConfigNV`
    public VkSetPresentConfigNV asSlice(long index, long count) { return new VkSetPresentConfigNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSetPresentConfigNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSetPresentConfigNV at(long index, Consumer<VkSetPresentConfigNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSetPresentConfigNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSetPresentConfigNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `numFramesPerBatch` at the given index}
    /// @param index the index of the struct buffer
    public int numFramesPerBatchAt(long index) { return numFramesPerBatch(this.segment(), index); }
    /// Sets `numFramesPerBatch` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSetPresentConfigNV numFramesPerBatchAt(long index, int value) { numFramesPerBatch(this.segment(), index, value); return this; }

    /// {@return `presentConfigFeedback` at the given index}
    /// @param index the index of the struct buffer
    public int presentConfigFeedbackAt(long index) { return presentConfigFeedback(this.segment(), index); }
    /// Sets `presentConfigFeedback` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSetPresentConfigNV presentConfigFeedbackAt(long index, int value) { presentConfigFeedback(this.segment(), index, value); return this; }

}
