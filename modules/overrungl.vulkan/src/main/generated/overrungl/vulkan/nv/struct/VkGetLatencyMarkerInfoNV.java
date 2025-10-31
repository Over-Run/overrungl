// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkGetLatencyMarkerInfoNV`.
/// ## Layout
/// ```
/// struct VkGetLatencyMarkerInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t timingCount;
///     VkLatencyTimingsFrameReportNV* pTimings;
/// };
/// ```
public final class VkGetLatencyMarkerInfoNV extends GroupType {
    /// The struct layout of `VkGetLatencyMarkerInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("timingCount"),
        ValueLayout.ADDRESS.withName("pTimings")
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
    /// The byte offset of `timingCount`.
    public static final long OFFSET_timingCount = LAYOUT.byteOffset(PathElement.groupElement("timingCount"));
    /// The memory layout of `timingCount`.
    public static final MemoryLayout LAYOUT_timingCount = LAYOUT.select(PathElement.groupElement("timingCount"));
    /// The [VarHandle] of `timingCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_timingCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timingCount"));
    /// The byte offset of `pTimings`.
    public static final long OFFSET_pTimings = LAYOUT.byteOffset(PathElement.groupElement("pTimings"));
    /// The memory layout of `pTimings`.
    public static final MemoryLayout LAYOUT_pTimings = LAYOUT.select(PathElement.groupElement("pTimings"));
    /// The [VarHandle] of `pTimings` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pTimings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTimings"));

    /// Creates `VkGetLatencyMarkerInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkGetLatencyMarkerInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkGetLatencyMarkerInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGetLatencyMarkerInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGetLatencyMarkerInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkGetLatencyMarkerInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGetLatencyMarkerInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGetLatencyMarkerInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkGetLatencyMarkerInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGetLatencyMarkerInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkGetLatencyMarkerInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkGetLatencyMarkerInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGetLatencyMarkerInfoNV`
    public static VkGetLatencyMarkerInfoNV alloc(SegmentAllocator allocator) { return new VkGetLatencyMarkerInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkGetLatencyMarkerInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGetLatencyMarkerInfoNV`
    public static VkGetLatencyMarkerInfoNV alloc(SegmentAllocator allocator, long count) { return new VkGetLatencyMarkerInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkGetLatencyMarkerInfoNV copyFrom(VkGetLatencyMarkerInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkGetLatencyMarkerInfoNV reinterpret(long count) { return new VkGetLatencyMarkerInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkGetLatencyMarkerInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkGetLatencyMarkerInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `timingCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int timingCount(MemorySegment segment, long index) { return (int) VH_timingCount.get(segment, 0L, index); }
    /// {@return `timingCount`}
    public int timingCount() { return timingCount(this.segment(), 0L); }
    /// Sets `timingCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void timingCount(MemorySegment segment, long index, int value) { VH_timingCount.set(segment, 0L, index, value); }
    /// Sets `timingCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGetLatencyMarkerInfoNV timingCount(int value) { timingCount(this.segment(), 0L, value); return this; }

    /// {@return `pTimings` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pTimings(MemorySegment segment, long index) { return (MemorySegment) VH_pTimings.get(segment, 0L, index); }
    /// {@return `pTimings`}
    public MemorySegment pTimings() { return pTimings(this.segment(), 0L); }
    /// Sets `pTimings` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pTimings(MemorySegment segment, long index, MemorySegment value) { VH_pTimings.set(segment, 0L, index, value); }
    /// Sets `pTimings` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGetLatencyMarkerInfoNV pTimings(MemorySegment value) { pTimings(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkGetLatencyMarkerInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkGetLatencyMarkerInfoNV`
    public VkGetLatencyMarkerInfoNV asSlice(long index) { return new VkGetLatencyMarkerInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkGetLatencyMarkerInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkGetLatencyMarkerInfoNV`
    public VkGetLatencyMarkerInfoNV asSlice(long index, long count) { return new VkGetLatencyMarkerInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkGetLatencyMarkerInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkGetLatencyMarkerInfoNV at(long index, Consumer<VkGetLatencyMarkerInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGetLatencyMarkerInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGetLatencyMarkerInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `timingCount` at the given index}
    /// @param index the index of the struct buffer
    public int timingCountAt(long index) { return timingCount(this.segment(), index); }
    /// Sets `timingCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGetLatencyMarkerInfoNV timingCountAt(long index, int value) { timingCount(this.segment(), index, value); return this; }

    /// {@return `pTimings` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pTimingsAt(long index) { return pTimings(this.segment(), index); }
    /// Sets `pTimings` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGetLatencyMarkerInfoNV pTimingsAt(long index, MemorySegment value) { pTimings(this.segment(), index, value); return this; }

}
