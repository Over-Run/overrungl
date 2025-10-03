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

import static overrungl.vulkan.VK10.*;

/// Represents `VmaTotalStatistics`.
/// ## Layout
/// ```
/// struct VmaTotalStatistics {
///     (struct VmaDetailedStatistics) VmaDetailedStatistics memoryType[VK_MAX_MEMORY_TYPES];
///     (struct VmaDetailedStatistics) VmaDetailedStatistics memoryHeap[VK_MAX_MEMORY_HEAPS];
///     (struct VmaDetailedStatistics) VmaDetailedStatistics total;
/// };
/// ```
public final class VmaTotalStatistics extends GroupType {
    /// The struct layout of `VmaTotalStatistics`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(VK_MAX_MEMORY_TYPES, VmaDetailedStatistics.LAYOUT).withName("memoryType"),
        MemoryLayout.sequenceLayout(VK_MAX_MEMORY_HEAPS, VmaDetailedStatistics.LAYOUT).withName("memoryHeap"),
        VmaDetailedStatistics.LAYOUT.withName("total")
    );
    /// The byte offset of `memoryType`.
    public static final long OFFSET_memoryType = LAYOUT.byteOffset(PathElement.groupElement("memoryType"));
    /// The memory layout of `memoryType`.
    public static final MemoryLayout LAYOUT_memoryType = LAYOUT.select(PathElement.groupElement("memoryType"));
    /// The byte offset of `memoryHeap`.
    public static final long OFFSET_memoryHeap = LAYOUT.byteOffset(PathElement.groupElement("memoryHeap"));
    /// The memory layout of `memoryHeap`.
    public static final MemoryLayout LAYOUT_memoryHeap = LAYOUT.select(PathElement.groupElement("memoryHeap"));
    /// The byte offset of `total`.
    public static final long OFFSET_total = LAYOUT.byteOffset(PathElement.groupElement("total"));
    /// The memory layout of `total`.
    public static final MemoryLayout LAYOUT_total = LAYOUT.select(PathElement.groupElement("total"));

    /// Creates `VmaTotalStatistics` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VmaTotalStatistics(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VmaTotalStatistics` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaTotalStatistics of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaTotalStatistics(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VmaTotalStatistics` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaTotalStatistics ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaTotalStatistics(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VmaTotalStatistics` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaTotalStatistics ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VmaTotalStatistics(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VmaTotalStatistics` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VmaTotalStatistics`
    public static VmaTotalStatistics alloc(SegmentAllocator allocator) { return new VmaTotalStatistics(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VmaTotalStatistics` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VmaTotalStatistics`
    public static VmaTotalStatistics alloc(SegmentAllocator allocator, long count) { return new VmaTotalStatistics(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VmaTotalStatistics copyFrom(VmaTotalStatistics src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VmaTotalStatistics reinterpret(long count) { return new VmaTotalStatistics(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `memoryType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment memoryType(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_memoryType, index), LAYOUT_memoryType); }
    /// {@return `memoryType`}
    public MemorySegment memoryType() { return memoryType(this.segment(), 0L); }
    /// Sets `memoryType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryType(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_memoryType, index), LAYOUT_memoryType.byteSize()); }
    /// Sets `memoryType` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaTotalStatistics memoryType(MemorySegment value) { memoryType(this.segment(), 0L, value); return this; }
    /// Accepts `memoryType` with the given function.
    /// @param func the function
    /// @return `this`
    public VmaTotalStatistics memoryType(Consumer<VmaDetailedStatistics> func) { func.accept(VmaDetailedStatistics.of(memoryType())); return this; }

    /// {@return `memoryHeap` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment memoryHeap(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_memoryHeap, index), LAYOUT_memoryHeap); }
    /// {@return `memoryHeap`}
    public MemorySegment memoryHeap() { return memoryHeap(this.segment(), 0L); }
    /// Sets `memoryHeap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryHeap(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_memoryHeap, index), LAYOUT_memoryHeap.byteSize()); }
    /// Sets `memoryHeap` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaTotalStatistics memoryHeap(MemorySegment value) { memoryHeap(this.segment(), 0L, value); return this; }
    /// Accepts `memoryHeap` with the given function.
    /// @param func the function
    /// @return `this`
    public VmaTotalStatistics memoryHeap(Consumer<VmaDetailedStatistics> func) { func.accept(VmaDetailedStatistics.of(memoryHeap())); return this; }

    /// {@return `total` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment total(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_total, index), LAYOUT_total); }
    /// {@return `total`}
    public MemorySegment total() { return total(this.segment(), 0L); }
    /// Sets `total` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void total(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_total, index), LAYOUT_total.byteSize()); }
    /// Sets `total` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaTotalStatistics total(MemorySegment value) { total(this.segment(), 0L, value); return this; }
    /// Accepts `total` with the given function.
    /// @param func the function
    /// @return `this`
    public VmaTotalStatistics total(Consumer<VmaDetailedStatistics> func) { func.accept(VmaDetailedStatistics.of(total())); return this; }

    /// Creates a slice of `VmaTotalStatistics`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VmaTotalStatistics`
    public VmaTotalStatistics asSlice(long index) { return new VmaTotalStatistics(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VmaTotalStatistics`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VmaTotalStatistics`
    public VmaTotalStatistics asSlice(long index, long count) { return new VmaTotalStatistics(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VmaTotalStatistics` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VmaTotalStatistics at(long index, Consumer<VmaTotalStatistics> func) { func.accept(asSlice(index)); return this; }

    /// {@return `memoryType` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment memoryTypeAt(long index) { return memoryType(this.segment(), index); }
    /// Sets `memoryType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaTotalStatistics memoryTypeAt(long index, MemorySegment value) { memoryType(this.segment(), index, value); return this; }
    /// Accepts `memoryType` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VmaTotalStatistics memoryTypeAt(long index, Consumer<VmaDetailedStatistics> func) { func.accept(VmaDetailedStatistics.of(memoryTypeAt(index))); return this; }

    /// {@return `memoryHeap` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment memoryHeapAt(long index) { return memoryHeap(this.segment(), index); }
    /// Sets `memoryHeap` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaTotalStatistics memoryHeapAt(long index, MemorySegment value) { memoryHeap(this.segment(), index, value); return this; }
    /// Accepts `memoryHeap` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VmaTotalStatistics memoryHeapAt(long index, Consumer<VmaDetailedStatistics> func) { func.accept(VmaDetailedStatistics.of(memoryHeapAt(index))); return this; }

    /// {@return `total` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment totalAt(long index) { return total(this.segment(), index); }
    /// Sets `total` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaTotalStatistics totalAt(long index, MemorySegment value) { total(this.segment(), index, value); return this; }
    /// Accepts `total` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VmaTotalStatistics totalAt(long index, Consumer<VmaDetailedStatistics> func) { func.accept(VmaDetailedStatistics.of(totalAt(index))); return this; }

}
