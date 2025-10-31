// This file is auto-generated. DO NOT EDIT!
package overrungl.vma;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VmaStatistics`.
/// ## Layout
/// ```
/// struct VmaStatistics {
///     uint32_t blockCount;
///     uint32_t allocationCount;
///     (uint64_t) VkDeviceSize blockBytes;
///     (uint64_t) VkDeviceSize allocationBytes;
/// };
/// ```
public final class VmaStatistics extends GroupType {
    /// The struct layout of `VmaStatistics`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("blockCount"),
        ValueLayout.JAVA_INT.withName("allocationCount"),
        ValueLayout.JAVA_LONG.withName("blockBytes"),
        ValueLayout.JAVA_LONG.withName("allocationBytes")
    );
    /// The byte offset of `blockCount`.
    public static final long OFFSET_blockCount = LAYOUT.byteOffset(PathElement.groupElement("blockCount"));
    /// The memory layout of `blockCount`.
    public static final MemoryLayout LAYOUT_blockCount = LAYOUT.select(PathElement.groupElement("blockCount"));
    /// The [VarHandle] of `blockCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_blockCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blockCount"));
    /// The byte offset of `allocationCount`.
    public static final long OFFSET_allocationCount = LAYOUT.byteOffset(PathElement.groupElement("allocationCount"));
    /// The memory layout of `allocationCount`.
    public static final MemoryLayout LAYOUT_allocationCount = LAYOUT.select(PathElement.groupElement("allocationCount"));
    /// The [VarHandle] of `allocationCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_allocationCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("allocationCount"));
    /// The byte offset of `blockBytes`.
    public static final long OFFSET_blockBytes = LAYOUT.byteOffset(PathElement.groupElement("blockBytes"));
    /// The memory layout of `blockBytes`.
    public static final MemoryLayout LAYOUT_blockBytes = LAYOUT.select(PathElement.groupElement("blockBytes"));
    /// The [VarHandle] of `blockBytes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_blockBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blockBytes"));
    /// The byte offset of `allocationBytes`.
    public static final long OFFSET_allocationBytes = LAYOUT.byteOffset(PathElement.groupElement("allocationBytes"));
    /// The memory layout of `allocationBytes`.
    public static final MemoryLayout LAYOUT_allocationBytes = LAYOUT.select(PathElement.groupElement("allocationBytes"));
    /// The [VarHandle] of `allocationBytes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_allocationBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("allocationBytes"));

    /// Creates `VmaStatistics` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VmaStatistics(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VmaStatistics` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaStatistics of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaStatistics(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VmaStatistics` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaStatistics ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaStatistics(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VmaStatistics` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaStatistics ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VmaStatistics(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VmaStatistics` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VmaStatistics`
    public static VmaStatistics alloc(SegmentAllocator allocator) { return new VmaStatistics(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VmaStatistics` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VmaStatistics`
    public static VmaStatistics alloc(SegmentAllocator allocator, long count) { return new VmaStatistics(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VmaStatistics copyFrom(VmaStatistics src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VmaStatistics reinterpret(long count) { return new VmaStatistics(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `blockCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int blockCount(MemorySegment segment, long index) { return (int) VH_blockCount.get(segment, 0L, index); }
    /// {@return `blockCount`}
    public int blockCount() { return blockCount(this.segment(), 0L); }
    /// Sets `blockCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void blockCount(MemorySegment segment, long index, int value) { VH_blockCount.set(segment, 0L, index, value); }
    /// Sets `blockCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaStatistics blockCount(int value) { blockCount(this.segment(), 0L, value); return this; }

    /// {@return `allocationCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int allocationCount(MemorySegment segment, long index) { return (int) VH_allocationCount.get(segment, 0L, index); }
    /// {@return `allocationCount`}
    public int allocationCount() { return allocationCount(this.segment(), 0L); }
    /// Sets `allocationCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void allocationCount(MemorySegment segment, long index, int value) { VH_allocationCount.set(segment, 0L, index, value); }
    /// Sets `allocationCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaStatistics allocationCount(int value) { allocationCount(this.segment(), 0L, value); return this; }

    /// {@return `blockBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long blockBytes(MemorySegment segment, long index) { return (long) VH_blockBytes.get(segment, 0L, index); }
    /// {@return `blockBytes`}
    public long blockBytes() { return blockBytes(this.segment(), 0L); }
    /// Sets `blockBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void blockBytes(MemorySegment segment, long index, long value) { VH_blockBytes.set(segment, 0L, index, value); }
    /// Sets `blockBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaStatistics blockBytes(long value) { blockBytes(this.segment(), 0L, value); return this; }

    /// {@return `allocationBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long allocationBytes(MemorySegment segment, long index) { return (long) VH_allocationBytes.get(segment, 0L, index); }
    /// {@return `allocationBytes`}
    public long allocationBytes() { return allocationBytes(this.segment(), 0L); }
    /// Sets `allocationBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void allocationBytes(MemorySegment segment, long index, long value) { VH_allocationBytes.set(segment, 0L, index, value); }
    /// Sets `allocationBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaStatistics allocationBytes(long value) { allocationBytes(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VmaStatistics`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VmaStatistics`
    public VmaStatistics asSlice(long index) { return new VmaStatistics(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VmaStatistics`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VmaStatistics`
    public VmaStatistics asSlice(long index, long count) { return new VmaStatistics(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VmaStatistics` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VmaStatistics at(long index, Consumer<VmaStatistics> func) { func.accept(asSlice(index)); return this; }

    /// {@return `blockCount` at the given index}
    /// @param index the index of the struct buffer
    public int blockCountAt(long index) { return blockCount(this.segment(), index); }
    /// Sets `blockCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaStatistics blockCountAt(long index, int value) { blockCount(this.segment(), index, value); return this; }

    /// {@return `allocationCount` at the given index}
    /// @param index the index of the struct buffer
    public int allocationCountAt(long index) { return allocationCount(this.segment(), index); }
    /// Sets `allocationCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaStatistics allocationCountAt(long index, int value) { allocationCount(this.segment(), index, value); return this; }

    /// {@return `blockBytes` at the given index}
    /// @param index the index of the struct buffer
    public long blockBytesAt(long index) { return blockBytes(this.segment(), index); }
    /// Sets `blockBytes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaStatistics blockBytesAt(long index, long value) { blockBytes(this.segment(), index, value); return this; }

    /// {@return `allocationBytes` at the given index}
    /// @param index the index of the struct buffer
    public long allocationBytesAt(long index) { return allocationBytes(this.segment(), index); }
    /// Sets `allocationBytes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaStatistics allocationBytesAt(long index, long value) { allocationBytes(this.segment(), index, value); return this; }

}
