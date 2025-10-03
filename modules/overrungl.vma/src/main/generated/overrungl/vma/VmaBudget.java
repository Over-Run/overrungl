// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vma;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VmaBudget`.
/// ## Layout
/// ```
/// struct VmaBudget {
///     (struct VmaStatistics) VmaStatistics statistics;
///     (uint64_t) VkDeviceSize usage;
///     (uint64_t) VkDeviceSize budget;
/// };
/// ```
public final class VmaBudget extends GroupType {
    /// The struct layout of `VmaBudget`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        VmaStatistics.LAYOUT.withName("statistics"),
        ValueLayout.JAVA_LONG.withName("usage"),
        ValueLayout.JAVA_LONG.withName("budget")
    );
    /// The byte offset of `statistics`.
    public static final long OFFSET_statistics = LAYOUT.byteOffset(PathElement.groupElement("statistics"));
    /// The memory layout of `statistics`.
    public static final MemoryLayout LAYOUT_statistics = LAYOUT.select(PathElement.groupElement("statistics"));
    /// The byte offset of `usage`.
    public static final long OFFSET_usage = LAYOUT.byteOffset(PathElement.groupElement("usage"));
    /// The memory layout of `usage`.
    public static final MemoryLayout LAYOUT_usage = LAYOUT.select(PathElement.groupElement("usage"));
    /// The [VarHandle] of `usage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_usage = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage")));
    /// The byte offset of `budget`.
    public static final long OFFSET_budget = LAYOUT.byteOffset(PathElement.groupElement("budget"));
    /// The memory layout of `budget`.
    public static final MemoryLayout LAYOUT_budget = LAYOUT.select(PathElement.groupElement("budget"));
    /// The [VarHandle] of `budget` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_budget = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("budget")));

    /// Creates `VmaBudget` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VmaBudget(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VmaBudget` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaBudget of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaBudget(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VmaBudget` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaBudget ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaBudget(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VmaBudget` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaBudget ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VmaBudget(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VmaBudget` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VmaBudget`
    public static VmaBudget alloc(SegmentAllocator allocator) { return new VmaBudget(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VmaBudget` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VmaBudget`
    public static VmaBudget alloc(SegmentAllocator allocator, long count) { return new VmaBudget(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VmaBudget copyFrom(VmaBudget src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VmaBudget reinterpret(long count) { return new VmaBudget(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `statistics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment statistics(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_statistics, index), LAYOUT_statistics); }
    /// {@return `statistics`}
    public MemorySegment statistics() { return statistics(this.segment(), 0L); }
    /// Sets `statistics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void statistics(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_statistics, index), LAYOUT_statistics.byteSize()); }
    /// Sets `statistics` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaBudget statistics(MemorySegment value) { statistics(this.segment(), 0L, value); return this; }
    /// Accepts `statistics` with the given function.
    /// @param func the function
    /// @return `this`
    public VmaBudget statistics(Consumer<VmaStatistics> func) { func.accept(VmaStatistics.of(statistics())); return this; }

    /// {@return `usage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long usage(MemorySegment segment, long index) { return (long) VH_usage.get().get(segment, 0L, index); }
    /// {@return `usage`}
    public long usage() { return usage(this.segment(), 0L); }
    /// Sets `usage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void usage(MemorySegment segment, long index, long value) { VH_usage.get().set(segment, 0L, index, value); }
    /// Sets `usage` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaBudget usage(long value) { usage(this.segment(), 0L, value); return this; }

    /// {@return `budget` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long budget(MemorySegment segment, long index) { return (long) VH_budget.get().get(segment, 0L, index); }
    /// {@return `budget`}
    public long budget() { return budget(this.segment(), 0L); }
    /// Sets `budget` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void budget(MemorySegment segment, long index, long value) { VH_budget.get().set(segment, 0L, index, value); }
    /// Sets `budget` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaBudget budget(long value) { budget(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VmaBudget`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VmaBudget`
    public VmaBudget asSlice(long index) { return new VmaBudget(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VmaBudget`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VmaBudget`
    public VmaBudget asSlice(long index, long count) { return new VmaBudget(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VmaBudget` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VmaBudget at(long index, Consumer<VmaBudget> func) { func.accept(asSlice(index)); return this; }

    /// {@return `statistics` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment statisticsAt(long index) { return statistics(this.segment(), index); }
    /// Sets `statistics` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaBudget statisticsAt(long index, MemorySegment value) { statistics(this.segment(), index, value); return this; }
    /// Accepts `statistics` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VmaBudget statisticsAt(long index, Consumer<VmaStatistics> func) { func.accept(VmaStatistics.of(statisticsAt(index))); return this; }

    /// {@return `usage` at the given index}
    /// @param index the index of the struct buffer
    public long usageAt(long index) { return usage(this.segment(), index); }
    /// Sets `usage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaBudget usageAt(long index, long value) { usage(this.segment(), index, value); return this; }

    /// {@return `budget` at the given index}
    /// @param index the index of the struct buffer
    public long budgetAt(long index) { return budget(this.segment(), index); }
    /// Sets `budget` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaBudget budgetAt(long index, long value) { budget(this.segment(), index, value); return this; }

}
