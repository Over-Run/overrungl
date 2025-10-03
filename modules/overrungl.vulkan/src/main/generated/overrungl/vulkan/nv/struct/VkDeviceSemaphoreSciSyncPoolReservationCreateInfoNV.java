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

/// Represents `VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t semaphoreSciSyncPoolRequestCount;
/// };
/// ```
public final class VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV extends GroupType {
    /// The struct layout of `VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("semaphoreSciSyncPoolRequestCount")
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
    /// The byte offset of `semaphoreSciSyncPoolRequestCount`.
    public static final long OFFSET_semaphoreSciSyncPoolRequestCount = LAYOUT.byteOffset(PathElement.groupElement("semaphoreSciSyncPoolRequestCount"));
    /// The memory layout of `semaphoreSciSyncPoolRequestCount`.
    public static final MemoryLayout LAYOUT_semaphoreSciSyncPoolRequestCount = LAYOUT.select(PathElement.groupElement("semaphoreSciSyncPoolRequestCount"));
    /// The [VarHandle] of `semaphoreSciSyncPoolRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_semaphoreSciSyncPoolRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphoreSciSyncPoolRequestCount"));

    /// Creates `VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV`
    public static VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV alloc(SegmentAllocator allocator) { return new VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV`
    public static VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV copyFrom(VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV reinterpret(long count) { return new VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `semaphoreSciSyncPoolRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int semaphoreSciSyncPoolRequestCount(MemorySegment segment, long index) { return (int) VH_semaphoreSciSyncPoolRequestCount.get(segment, 0L, index); }
    /// {@return `semaphoreSciSyncPoolRequestCount`}
    public int semaphoreSciSyncPoolRequestCount() { return semaphoreSciSyncPoolRequestCount(this.segment(), 0L); }
    /// Sets `semaphoreSciSyncPoolRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void semaphoreSciSyncPoolRequestCount(MemorySegment segment, long index, int value) { VH_semaphoreSciSyncPoolRequestCount.set(segment, 0L, index, value); }
    /// Sets `semaphoreSciSyncPoolRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV semaphoreSciSyncPoolRequestCount(int value) { semaphoreSciSyncPoolRequestCount(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV`
    public VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV asSlice(long index) { return new VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV`
    public VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV asSlice(long index, long count) { return new VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV at(long index, Consumer<VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `semaphoreSciSyncPoolRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int semaphoreSciSyncPoolRequestCountAt(long index) { return semaphoreSciSyncPoolRequestCount(this.segment(), index); }
    /// Sets `semaphoreSciSyncPoolRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV semaphoreSciSyncPoolRequestCountAt(long index, int value) { semaphoreSciSyncPoolRequestCount(this.segment(), index, value); return this; }

}
