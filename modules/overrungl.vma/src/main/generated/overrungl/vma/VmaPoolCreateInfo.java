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

/// Represents `VmaPoolCreateInfo`.
/// ## Layout
/// ```
/// struct VmaPoolCreateInfo {
///     uint32_t memoryTypeIndex;
///     ((uint32_t) VkFlags) VmaPoolCreateFlags flags;
///     (uint64_t) VkDeviceSize blockSize;
///     size_t minBlockCount;
///     size_t maxBlockCount;
///     float priority;
///     (uint64_t) VkDeviceSize minAllocationAlignment;
///     void* pMemoryAllocateNext;
/// };
/// ```
public final class VmaPoolCreateInfo extends GroupType {
    /// The struct layout of `VmaPoolCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("memoryTypeIndex"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("blockSize"),
        CanonicalTypes.SIZE_T.withName("minBlockCount"),
        CanonicalTypes.SIZE_T.withName("maxBlockCount"),
        ValueLayout.JAVA_FLOAT.withName("priority"),
        ValueLayout.JAVA_LONG.withName("minAllocationAlignment"),
        ValueLayout.ADDRESS.withName("pMemoryAllocateNext")
    );
    /// The byte offset of `memoryTypeIndex`.
    public static final long OFFSET_memoryTypeIndex = LAYOUT.byteOffset(PathElement.groupElement("memoryTypeIndex"));
    /// The memory layout of `memoryTypeIndex`.
    public static final MemoryLayout LAYOUT_memoryTypeIndex = LAYOUT.select(PathElement.groupElement("memoryTypeIndex"));
    /// The [VarHandle] of `memoryTypeIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_memoryTypeIndex = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryTypeIndex")));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_flags = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags")));
    /// The byte offset of `blockSize`.
    public static final long OFFSET_blockSize = LAYOUT.byteOffset(PathElement.groupElement("blockSize"));
    /// The memory layout of `blockSize`.
    public static final MemoryLayout LAYOUT_blockSize = LAYOUT.select(PathElement.groupElement("blockSize"));
    /// The [VarHandle] of `blockSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_blockSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("blockSize")));
    /// The byte offset of `minBlockCount`.
    public static final long OFFSET_minBlockCount = LAYOUT.byteOffset(PathElement.groupElement("minBlockCount"));
    /// The memory layout of `minBlockCount`.
    public static final MemoryLayout LAYOUT_minBlockCount = LAYOUT.select(PathElement.groupElement("minBlockCount"));
    /// The [VarHandle] of `minBlockCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_minBlockCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("minBlockCount")));
    /// The byte offset of `maxBlockCount`.
    public static final long OFFSET_maxBlockCount = LAYOUT.byteOffset(PathElement.groupElement("maxBlockCount"));
    /// The memory layout of `maxBlockCount`.
    public static final MemoryLayout LAYOUT_maxBlockCount = LAYOUT.select(PathElement.groupElement("maxBlockCount"));
    /// The [VarHandle] of `maxBlockCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxBlockCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBlockCount")));
    /// The byte offset of `priority`.
    public static final long OFFSET_priority = LAYOUT.byteOffset(PathElement.groupElement("priority"));
    /// The memory layout of `priority`.
    public static final MemoryLayout LAYOUT_priority = LAYOUT.select(PathElement.groupElement("priority"));
    /// The [VarHandle] of `priority` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_priority = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("priority")));
    /// The byte offset of `minAllocationAlignment`.
    public static final long OFFSET_minAllocationAlignment = LAYOUT.byteOffset(PathElement.groupElement("minAllocationAlignment"));
    /// The memory layout of `minAllocationAlignment`.
    public static final MemoryLayout LAYOUT_minAllocationAlignment = LAYOUT.select(PathElement.groupElement("minAllocationAlignment"));
    /// The [VarHandle] of `minAllocationAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_minAllocationAlignment = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("minAllocationAlignment")));
    /// The byte offset of `pMemoryAllocateNext`.
    public static final long OFFSET_pMemoryAllocateNext = LAYOUT.byteOffset(PathElement.groupElement("pMemoryAllocateNext"));
    /// The memory layout of `pMemoryAllocateNext`.
    public static final MemoryLayout LAYOUT_pMemoryAllocateNext = LAYOUT.select(PathElement.groupElement("pMemoryAllocateNext"));
    /// The [VarHandle] of `pMemoryAllocateNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pMemoryAllocateNext = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMemoryAllocateNext")));

    /// Creates `VmaPoolCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VmaPoolCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VmaPoolCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaPoolCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaPoolCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VmaPoolCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaPoolCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaPoolCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VmaPoolCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaPoolCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VmaPoolCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VmaPoolCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VmaPoolCreateInfo`
    public static VmaPoolCreateInfo alloc(SegmentAllocator allocator) { return new VmaPoolCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VmaPoolCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VmaPoolCreateInfo`
    public static VmaPoolCreateInfo alloc(SegmentAllocator allocator, long count) { return new VmaPoolCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VmaPoolCreateInfo copyFrom(VmaPoolCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VmaPoolCreateInfo reinterpret(long count) { return new VmaPoolCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `memoryTypeIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int memoryTypeIndex(MemorySegment segment, long index) { return (int) VH_memoryTypeIndex.get().get(segment, 0L, index); }
    /// {@return `memoryTypeIndex`}
    public int memoryTypeIndex() { return memoryTypeIndex(this.segment(), 0L); }
    /// Sets `memoryTypeIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryTypeIndex(MemorySegment segment, long index, int value) { VH_memoryTypeIndex.get().set(segment, 0L, index, value); }
    /// Sets `memoryTypeIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaPoolCreateInfo memoryTypeIndex(int value) { memoryTypeIndex(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get().get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.get().set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaPoolCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `blockSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long blockSize(MemorySegment segment, long index) { return (long) VH_blockSize.get().get(segment, 0L, index); }
    /// {@return `blockSize`}
    public long blockSize() { return blockSize(this.segment(), 0L); }
    /// Sets `blockSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void blockSize(MemorySegment segment, long index, long value) { VH_blockSize.get().set(segment, 0L, index, value); }
    /// Sets `blockSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaPoolCreateInfo blockSize(long value) { blockSize(this.segment(), 0L, value); return this; }

    /// {@return `minBlockCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long minBlockCount(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_minBlockCount.get().get(segment, 0L, index)); }
    /// {@return `minBlockCount`}
    public long minBlockCount() { return minBlockCount(this.segment(), 0L); }
    /// Sets `minBlockCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minBlockCount(MemorySegment segment, long index, long value) { VH_minBlockCount.get().set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `minBlockCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaPoolCreateInfo minBlockCount(long value) { minBlockCount(this.segment(), 0L, value); return this; }

    /// {@return `maxBlockCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxBlockCount(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_maxBlockCount.get().get(segment, 0L, index)); }
    /// {@return `maxBlockCount`}
    public long maxBlockCount() { return maxBlockCount(this.segment(), 0L); }
    /// Sets `maxBlockCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxBlockCount(MemorySegment segment, long index, long value) { VH_maxBlockCount.get().set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `maxBlockCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaPoolCreateInfo maxBlockCount(long value) { maxBlockCount(this.segment(), 0L, value); return this; }

    /// {@return `priority` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float priority(MemorySegment segment, long index) { return (float) VH_priority.get().get(segment, 0L, index); }
    /// {@return `priority`}
    public float priority() { return priority(this.segment(), 0L); }
    /// Sets `priority` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void priority(MemorySegment segment, long index, float value) { VH_priority.get().set(segment, 0L, index, value); }
    /// Sets `priority` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaPoolCreateInfo priority(float value) { priority(this.segment(), 0L, value); return this; }

    /// {@return `minAllocationAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long minAllocationAlignment(MemorySegment segment, long index) { return (long) VH_minAllocationAlignment.get().get(segment, 0L, index); }
    /// {@return `minAllocationAlignment`}
    public long minAllocationAlignment() { return minAllocationAlignment(this.segment(), 0L); }
    /// Sets `minAllocationAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minAllocationAlignment(MemorySegment segment, long index, long value) { VH_minAllocationAlignment.get().set(segment, 0L, index, value); }
    /// Sets `minAllocationAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaPoolCreateInfo minAllocationAlignment(long value) { minAllocationAlignment(this.segment(), 0L, value); return this; }

    /// {@return `pMemoryAllocateNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pMemoryAllocateNext(MemorySegment segment, long index) { return (MemorySegment) VH_pMemoryAllocateNext.get().get(segment, 0L, index); }
    /// {@return `pMemoryAllocateNext`}
    public MemorySegment pMemoryAllocateNext() { return pMemoryAllocateNext(this.segment(), 0L); }
    /// Sets `pMemoryAllocateNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pMemoryAllocateNext(MemorySegment segment, long index, MemorySegment value) { VH_pMemoryAllocateNext.get().set(segment, 0L, index, value); }
    /// Sets `pMemoryAllocateNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaPoolCreateInfo pMemoryAllocateNext(MemorySegment value) { pMemoryAllocateNext(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VmaPoolCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VmaPoolCreateInfo`
    public VmaPoolCreateInfo asSlice(long index) { return new VmaPoolCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VmaPoolCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VmaPoolCreateInfo`
    public VmaPoolCreateInfo asSlice(long index, long count) { return new VmaPoolCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VmaPoolCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VmaPoolCreateInfo at(long index, Consumer<VmaPoolCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `memoryTypeIndex` at the given index}
    /// @param index the index of the struct buffer
    public int memoryTypeIndexAt(long index) { return memoryTypeIndex(this.segment(), index); }
    /// Sets `memoryTypeIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaPoolCreateInfo memoryTypeIndexAt(long index, int value) { memoryTypeIndex(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaPoolCreateInfo flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `blockSize` at the given index}
    /// @param index the index of the struct buffer
    public long blockSizeAt(long index) { return blockSize(this.segment(), index); }
    /// Sets `blockSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaPoolCreateInfo blockSizeAt(long index, long value) { blockSize(this.segment(), index, value); return this; }

    /// {@return `minBlockCount` at the given index}
    /// @param index the index of the struct buffer
    public long minBlockCountAt(long index) { return minBlockCount(this.segment(), index); }
    /// Sets `minBlockCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaPoolCreateInfo minBlockCountAt(long index, long value) { minBlockCount(this.segment(), index, value); return this; }

    /// {@return `maxBlockCount` at the given index}
    /// @param index the index of the struct buffer
    public long maxBlockCountAt(long index) { return maxBlockCount(this.segment(), index); }
    /// Sets `maxBlockCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaPoolCreateInfo maxBlockCountAt(long index, long value) { maxBlockCount(this.segment(), index, value); return this; }

    /// {@return `priority` at the given index}
    /// @param index the index of the struct buffer
    public float priorityAt(long index) { return priority(this.segment(), index); }
    /// Sets `priority` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaPoolCreateInfo priorityAt(long index, float value) { priority(this.segment(), index, value); return this; }

    /// {@return `minAllocationAlignment` at the given index}
    /// @param index the index of the struct buffer
    public long minAllocationAlignmentAt(long index) { return minAllocationAlignment(this.segment(), index); }
    /// Sets `minAllocationAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaPoolCreateInfo minAllocationAlignmentAt(long index, long value) { minAllocationAlignment(this.segment(), index, value); return this; }

    /// {@return `pMemoryAllocateNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pMemoryAllocateNextAt(long index) { return pMemoryAllocateNext(this.segment(), index); }
    /// Sets `pMemoryAllocateNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaPoolCreateInfo pMemoryAllocateNextAt(long index, MemorySegment value) { pMemoryAllocateNext(this.segment(), index, value); return this; }

}
