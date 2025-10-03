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

/// Represents `VmaDetailedStatistics`.
/// ## Layout
/// ```
/// struct VmaDetailedStatistics {
///     (struct VmaStatistics) VmaStatistics statistics;
///     uint32_t unusedRangeCount;
///     (uint64_t) VkDeviceSize allocationSizeMin;
///     (uint64_t) VkDeviceSize allocationSizeMax;
///     (uint64_t) VkDeviceSize unusedRangeSizeMin;
///     (uint64_t) VkDeviceSize unusedRangeSizeMax;
/// };
/// ```
public final class VmaDetailedStatistics extends GroupType {
    /// The struct layout of `VmaDetailedStatistics`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        VmaStatistics.LAYOUT.withName("statistics"),
        ValueLayout.JAVA_INT.withName("unusedRangeCount"),
        ValueLayout.JAVA_LONG.withName("allocationSizeMin"),
        ValueLayout.JAVA_LONG.withName("allocationSizeMax"),
        ValueLayout.JAVA_LONG.withName("unusedRangeSizeMin"),
        ValueLayout.JAVA_LONG.withName("unusedRangeSizeMax")
    );
    /// The byte offset of `statistics`.
    public static final long OFFSET_statistics = LAYOUT.byteOffset(PathElement.groupElement("statistics"));
    /// The memory layout of `statistics`.
    public static final MemoryLayout LAYOUT_statistics = LAYOUT.select(PathElement.groupElement("statistics"));
    /// The byte offset of `unusedRangeCount`.
    public static final long OFFSET_unusedRangeCount = LAYOUT.byteOffset(PathElement.groupElement("unusedRangeCount"));
    /// The memory layout of `unusedRangeCount`.
    public static final MemoryLayout LAYOUT_unusedRangeCount = LAYOUT.select(PathElement.groupElement("unusedRangeCount"));
    /// The [VarHandle] of `unusedRangeCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_unusedRangeCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("unusedRangeCount")));
    /// The byte offset of `allocationSizeMin`.
    public static final long OFFSET_allocationSizeMin = LAYOUT.byteOffset(PathElement.groupElement("allocationSizeMin"));
    /// The memory layout of `allocationSizeMin`.
    public static final MemoryLayout LAYOUT_allocationSizeMin = LAYOUT.select(PathElement.groupElement("allocationSizeMin"));
    /// The [VarHandle] of `allocationSizeMin` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_allocationSizeMin = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("allocationSizeMin")));
    /// The byte offset of `allocationSizeMax`.
    public static final long OFFSET_allocationSizeMax = LAYOUT.byteOffset(PathElement.groupElement("allocationSizeMax"));
    /// The memory layout of `allocationSizeMax`.
    public static final MemoryLayout LAYOUT_allocationSizeMax = LAYOUT.select(PathElement.groupElement("allocationSizeMax"));
    /// The [VarHandle] of `allocationSizeMax` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_allocationSizeMax = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("allocationSizeMax")));
    /// The byte offset of `unusedRangeSizeMin`.
    public static final long OFFSET_unusedRangeSizeMin = LAYOUT.byteOffset(PathElement.groupElement("unusedRangeSizeMin"));
    /// The memory layout of `unusedRangeSizeMin`.
    public static final MemoryLayout LAYOUT_unusedRangeSizeMin = LAYOUT.select(PathElement.groupElement("unusedRangeSizeMin"));
    /// The [VarHandle] of `unusedRangeSizeMin` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_unusedRangeSizeMin = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("unusedRangeSizeMin")));
    /// The byte offset of `unusedRangeSizeMax`.
    public static final long OFFSET_unusedRangeSizeMax = LAYOUT.byteOffset(PathElement.groupElement("unusedRangeSizeMax"));
    /// The memory layout of `unusedRangeSizeMax`.
    public static final MemoryLayout LAYOUT_unusedRangeSizeMax = LAYOUT.select(PathElement.groupElement("unusedRangeSizeMax"));
    /// The [VarHandle] of `unusedRangeSizeMax` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_unusedRangeSizeMax = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("unusedRangeSizeMax")));

    /// Creates `VmaDetailedStatistics` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VmaDetailedStatistics(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VmaDetailedStatistics` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaDetailedStatistics of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaDetailedStatistics(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VmaDetailedStatistics` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaDetailedStatistics ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaDetailedStatistics(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VmaDetailedStatistics` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaDetailedStatistics ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VmaDetailedStatistics(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VmaDetailedStatistics` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VmaDetailedStatistics`
    public static VmaDetailedStatistics alloc(SegmentAllocator allocator) { return new VmaDetailedStatistics(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VmaDetailedStatistics` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VmaDetailedStatistics`
    public static VmaDetailedStatistics alloc(SegmentAllocator allocator, long count) { return new VmaDetailedStatistics(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VmaDetailedStatistics copyFrom(VmaDetailedStatistics src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VmaDetailedStatistics reinterpret(long count) { return new VmaDetailedStatistics(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VmaDetailedStatistics statistics(MemorySegment value) { statistics(this.segment(), 0L, value); return this; }
    /// Accepts `statistics` with the given function.
    /// @param func the function
    /// @return `this`
    public VmaDetailedStatistics statistics(Consumer<VmaStatistics> func) { func.accept(VmaStatistics.of(statistics())); return this; }

    /// {@return `unusedRangeCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int unusedRangeCount(MemorySegment segment, long index) { return (int) VH_unusedRangeCount.get().get(segment, 0L, index); }
    /// {@return `unusedRangeCount`}
    public int unusedRangeCount() { return unusedRangeCount(this.segment(), 0L); }
    /// Sets `unusedRangeCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void unusedRangeCount(MemorySegment segment, long index, int value) { VH_unusedRangeCount.get().set(segment, 0L, index, value); }
    /// Sets `unusedRangeCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaDetailedStatistics unusedRangeCount(int value) { unusedRangeCount(this.segment(), 0L, value); return this; }

    /// {@return `allocationSizeMin` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long allocationSizeMin(MemorySegment segment, long index) { return (long) VH_allocationSizeMin.get().get(segment, 0L, index); }
    /// {@return `allocationSizeMin`}
    public long allocationSizeMin() { return allocationSizeMin(this.segment(), 0L); }
    /// Sets `allocationSizeMin` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void allocationSizeMin(MemorySegment segment, long index, long value) { VH_allocationSizeMin.get().set(segment, 0L, index, value); }
    /// Sets `allocationSizeMin` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaDetailedStatistics allocationSizeMin(long value) { allocationSizeMin(this.segment(), 0L, value); return this; }

    /// {@return `allocationSizeMax` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long allocationSizeMax(MemorySegment segment, long index) { return (long) VH_allocationSizeMax.get().get(segment, 0L, index); }
    /// {@return `allocationSizeMax`}
    public long allocationSizeMax() { return allocationSizeMax(this.segment(), 0L); }
    /// Sets `allocationSizeMax` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void allocationSizeMax(MemorySegment segment, long index, long value) { VH_allocationSizeMax.get().set(segment, 0L, index, value); }
    /// Sets `allocationSizeMax` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaDetailedStatistics allocationSizeMax(long value) { allocationSizeMax(this.segment(), 0L, value); return this; }

    /// {@return `unusedRangeSizeMin` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long unusedRangeSizeMin(MemorySegment segment, long index) { return (long) VH_unusedRangeSizeMin.get().get(segment, 0L, index); }
    /// {@return `unusedRangeSizeMin`}
    public long unusedRangeSizeMin() { return unusedRangeSizeMin(this.segment(), 0L); }
    /// Sets `unusedRangeSizeMin` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void unusedRangeSizeMin(MemorySegment segment, long index, long value) { VH_unusedRangeSizeMin.get().set(segment, 0L, index, value); }
    /// Sets `unusedRangeSizeMin` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaDetailedStatistics unusedRangeSizeMin(long value) { unusedRangeSizeMin(this.segment(), 0L, value); return this; }

    /// {@return `unusedRangeSizeMax` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long unusedRangeSizeMax(MemorySegment segment, long index) { return (long) VH_unusedRangeSizeMax.get().get(segment, 0L, index); }
    /// {@return `unusedRangeSizeMax`}
    public long unusedRangeSizeMax() { return unusedRangeSizeMax(this.segment(), 0L); }
    /// Sets `unusedRangeSizeMax` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void unusedRangeSizeMax(MemorySegment segment, long index, long value) { VH_unusedRangeSizeMax.get().set(segment, 0L, index, value); }
    /// Sets `unusedRangeSizeMax` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaDetailedStatistics unusedRangeSizeMax(long value) { unusedRangeSizeMax(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VmaDetailedStatistics`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VmaDetailedStatistics`
    public VmaDetailedStatistics asSlice(long index) { return new VmaDetailedStatistics(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VmaDetailedStatistics`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VmaDetailedStatistics`
    public VmaDetailedStatistics asSlice(long index, long count) { return new VmaDetailedStatistics(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VmaDetailedStatistics` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VmaDetailedStatistics at(long index, Consumer<VmaDetailedStatistics> func) { func.accept(asSlice(index)); return this; }

    /// {@return `statistics` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment statisticsAt(long index) { return statistics(this.segment(), index); }
    /// Sets `statistics` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaDetailedStatistics statisticsAt(long index, MemorySegment value) { statistics(this.segment(), index, value); return this; }
    /// Accepts `statistics` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VmaDetailedStatistics statisticsAt(long index, Consumer<VmaStatistics> func) { func.accept(VmaStatistics.of(statisticsAt(index))); return this; }

    /// {@return `unusedRangeCount` at the given index}
    /// @param index the index of the struct buffer
    public int unusedRangeCountAt(long index) { return unusedRangeCount(this.segment(), index); }
    /// Sets `unusedRangeCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaDetailedStatistics unusedRangeCountAt(long index, int value) { unusedRangeCount(this.segment(), index, value); return this; }

    /// {@return `allocationSizeMin` at the given index}
    /// @param index the index of the struct buffer
    public long allocationSizeMinAt(long index) { return allocationSizeMin(this.segment(), index); }
    /// Sets `allocationSizeMin` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaDetailedStatistics allocationSizeMinAt(long index, long value) { allocationSizeMin(this.segment(), index, value); return this; }

    /// {@return `allocationSizeMax` at the given index}
    /// @param index the index of the struct buffer
    public long allocationSizeMaxAt(long index) { return allocationSizeMax(this.segment(), index); }
    /// Sets `allocationSizeMax` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaDetailedStatistics allocationSizeMaxAt(long index, long value) { allocationSizeMax(this.segment(), index, value); return this; }

    /// {@return `unusedRangeSizeMin` at the given index}
    /// @param index the index of the struct buffer
    public long unusedRangeSizeMinAt(long index) { return unusedRangeSizeMin(this.segment(), index); }
    /// Sets `unusedRangeSizeMin` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaDetailedStatistics unusedRangeSizeMinAt(long index, long value) { unusedRangeSizeMin(this.segment(), index, value); return this; }

    /// {@return `unusedRangeSizeMax` at the given index}
    /// @param index the index of the struct buffer
    public long unusedRangeSizeMaxAt(long index) { return unusedRangeSizeMax(this.segment(), index); }
    /// Sets `unusedRangeSizeMax` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaDetailedStatistics unusedRangeSizeMaxAt(long index, long value) { unusedRangeSizeMax(this.segment(), index, value); return this; }

}
