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

/// Represents `VkSetLatencyMarkerInfoNV`.
/// ## Layout
/// ```
/// struct VkSetLatencyMarkerInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint64_t presentID;
///     (int) VkLatencyMarkerNV marker;
/// };
/// ```
public final class VkSetLatencyMarkerInfoNV extends GroupType {
    /// The struct layout of `VkSetLatencyMarkerInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("presentID"),
        ValueLayout.JAVA_INT.withName("marker")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sType = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType")));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pNext = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext")));
    /// The byte offset of `presentID`.
    public static final long OFFSET_presentID = LAYOUT.byteOffset(PathElement.groupElement("presentID"));
    /// The memory layout of `presentID`.
    public static final MemoryLayout LAYOUT_presentID = LAYOUT.select(PathElement.groupElement("presentID"));
    /// The [VarHandle] of `presentID` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_presentID = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentID")));
    /// The byte offset of `marker`.
    public static final long OFFSET_marker = LAYOUT.byteOffset(PathElement.groupElement("marker"));
    /// The memory layout of `marker`.
    public static final MemoryLayout LAYOUT_marker = LAYOUT.select(PathElement.groupElement("marker"));
    /// The [VarHandle] of `marker` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_marker = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("marker")));

    /// Creates `VkSetLatencyMarkerInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSetLatencyMarkerInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSetLatencyMarkerInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSetLatencyMarkerInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSetLatencyMarkerInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSetLatencyMarkerInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSetLatencyMarkerInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSetLatencyMarkerInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSetLatencyMarkerInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSetLatencyMarkerInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSetLatencyMarkerInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSetLatencyMarkerInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSetLatencyMarkerInfoNV`
    public static VkSetLatencyMarkerInfoNV alloc(SegmentAllocator allocator) { return new VkSetLatencyMarkerInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSetLatencyMarkerInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSetLatencyMarkerInfoNV`
    public static VkSetLatencyMarkerInfoNV alloc(SegmentAllocator allocator, long count) { return new VkSetLatencyMarkerInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSetLatencyMarkerInfoNV copyFrom(VkSetLatencyMarkerInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSetLatencyMarkerInfoNV reinterpret(long count) { return new VkSetLatencyMarkerInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get().get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.get().set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetLatencyMarkerInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get().get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.get().set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetLatencyMarkerInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `presentID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long presentID(MemorySegment segment, long index) { return (long) VH_presentID.get().get(segment, 0L, index); }
    /// {@return `presentID`}
    public long presentID() { return presentID(this.segment(), 0L); }
    /// Sets `presentID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentID(MemorySegment segment, long index, long value) { VH_presentID.get().set(segment, 0L, index, value); }
    /// Sets `presentID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetLatencyMarkerInfoNV presentID(long value) { presentID(this.segment(), 0L, value); return this; }

    /// {@return `marker` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int marker(MemorySegment segment, long index) { return (int) VH_marker.get().get(segment, 0L, index); }
    /// {@return `marker`}
    public int marker() { return marker(this.segment(), 0L); }
    /// Sets `marker` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void marker(MemorySegment segment, long index, int value) { VH_marker.get().set(segment, 0L, index, value); }
    /// Sets `marker` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetLatencyMarkerInfoNV marker(int value) { marker(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSetLatencyMarkerInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSetLatencyMarkerInfoNV`
    public VkSetLatencyMarkerInfoNV asSlice(long index) { return new VkSetLatencyMarkerInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSetLatencyMarkerInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSetLatencyMarkerInfoNV`
    public VkSetLatencyMarkerInfoNV asSlice(long index, long count) { return new VkSetLatencyMarkerInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSetLatencyMarkerInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSetLatencyMarkerInfoNV at(long index, Consumer<VkSetLatencyMarkerInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSetLatencyMarkerInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSetLatencyMarkerInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `presentID` at the given index}
    /// @param index the index of the struct buffer
    public long presentIDAt(long index) { return presentID(this.segment(), index); }
    /// Sets `presentID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSetLatencyMarkerInfoNV presentIDAt(long index, long value) { presentID(this.segment(), index, value); return this; }

    /// {@return `marker` at the given index}
    /// @param index the index of the struct buffer
    public int markerAt(long index) { return marker(this.segment(), index); }
    /// Sets `marker` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSetLatencyMarkerInfoNV markerAt(long index, int value) { marker(this.segment(), index, value); return this; }

}
