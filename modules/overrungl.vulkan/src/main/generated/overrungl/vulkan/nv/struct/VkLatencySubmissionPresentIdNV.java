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

/// Represents `VkLatencySubmissionPresentIdNV`.
/// ## Layout
/// ```
/// struct VkLatencySubmissionPresentIdNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint64_t presentID;
/// };
/// ```
public final class VkLatencySubmissionPresentIdNV extends GroupType {
    /// The struct layout of `VkLatencySubmissionPresentIdNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("presentID")
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
    /// The byte offset of `presentID`.
    public static final long OFFSET_presentID = LAYOUT.byteOffset(PathElement.groupElement("presentID"));
    /// The memory layout of `presentID`.
    public static final MemoryLayout LAYOUT_presentID = LAYOUT.select(PathElement.groupElement("presentID"));
    /// The [VarHandle] of `presentID` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_presentID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentID"));

    /// Creates `VkLatencySubmissionPresentIdNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkLatencySubmissionPresentIdNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkLatencySubmissionPresentIdNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLatencySubmissionPresentIdNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLatencySubmissionPresentIdNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkLatencySubmissionPresentIdNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLatencySubmissionPresentIdNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLatencySubmissionPresentIdNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkLatencySubmissionPresentIdNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLatencySubmissionPresentIdNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkLatencySubmissionPresentIdNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkLatencySubmissionPresentIdNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkLatencySubmissionPresentIdNV`
    public static VkLatencySubmissionPresentIdNV alloc(SegmentAllocator allocator) { return new VkLatencySubmissionPresentIdNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkLatencySubmissionPresentIdNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkLatencySubmissionPresentIdNV`
    public static VkLatencySubmissionPresentIdNV alloc(SegmentAllocator allocator, long count) { return new VkLatencySubmissionPresentIdNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkLatencySubmissionPresentIdNV copyFrom(VkLatencySubmissionPresentIdNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkLatencySubmissionPresentIdNV reinterpret(long count) { return new VkLatencySubmissionPresentIdNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkLatencySubmissionPresentIdNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkLatencySubmissionPresentIdNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `presentID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long presentID(MemorySegment segment, long index) { return (long) VH_presentID.get(segment, 0L, index); }
    /// {@return `presentID`}
    public long presentID() { return presentID(this.segment(), 0L); }
    /// Sets `presentID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentID(MemorySegment segment, long index, long value) { VH_presentID.set(segment, 0L, index, value); }
    /// Sets `presentID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencySubmissionPresentIdNV presentID(long value) { presentID(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkLatencySubmissionPresentIdNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkLatencySubmissionPresentIdNV`
    public VkLatencySubmissionPresentIdNV asSlice(long index) { return new VkLatencySubmissionPresentIdNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkLatencySubmissionPresentIdNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkLatencySubmissionPresentIdNV`
    public VkLatencySubmissionPresentIdNV asSlice(long index, long count) { return new VkLatencySubmissionPresentIdNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkLatencySubmissionPresentIdNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkLatencySubmissionPresentIdNV at(long index, Consumer<VkLatencySubmissionPresentIdNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLatencySubmissionPresentIdNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLatencySubmissionPresentIdNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `presentID` at the given index}
    /// @param index the index of the struct buffer
    public long presentIDAt(long index) { return presentID(this.segment(), index); }
    /// Sets `presentID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLatencySubmissionPresentIdNV presentIDAt(long index, long value) { presentID(this.segment(), index, value); return this; }

}
