// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelinePoolSize`.
/// ## Layout
/// ```
/// struct VkPipelinePoolSize {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkDeviceSize poolEntrySize;
///     uint32_t poolEntryCount;
/// };
/// ```
public final class VkPipelinePoolSize extends GroupType {
    /// The struct layout of `VkPipelinePoolSize`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("poolEntrySize"),
        ValueLayout.JAVA_INT.withName("poolEntryCount")
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
    /// The byte offset of `poolEntrySize`.
    public static final long OFFSET_poolEntrySize = LAYOUT.byteOffset(PathElement.groupElement("poolEntrySize"));
    /// The memory layout of `poolEntrySize`.
    public static final MemoryLayout LAYOUT_poolEntrySize = LAYOUT.select(PathElement.groupElement("poolEntrySize"));
    /// The [VarHandle] of `poolEntrySize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_poolEntrySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("poolEntrySize"));
    /// The byte offset of `poolEntryCount`.
    public static final long OFFSET_poolEntryCount = LAYOUT.byteOffset(PathElement.groupElement("poolEntryCount"));
    /// The memory layout of `poolEntryCount`.
    public static final MemoryLayout LAYOUT_poolEntryCount = LAYOUT.select(PathElement.groupElement("poolEntryCount"));
    /// The [VarHandle] of `poolEntryCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_poolEntryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("poolEntryCount"));

    /// Creates `VkPipelinePoolSize` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelinePoolSize(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelinePoolSize` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelinePoolSize of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelinePoolSize(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelinePoolSize` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelinePoolSize ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelinePoolSize(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelinePoolSize` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelinePoolSize ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelinePoolSize(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelinePoolSize` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelinePoolSize`
    public static VkPipelinePoolSize alloc(SegmentAllocator allocator) { return new VkPipelinePoolSize(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelinePoolSize` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelinePoolSize`
    public static VkPipelinePoolSize alloc(SegmentAllocator allocator, long count) { return new VkPipelinePoolSize(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelinePoolSize copyFrom(VkPipelinePoolSize src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelinePoolSize reinterpret(long count) { return new VkPipelinePoolSize(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelinePoolSize sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelinePoolSize pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `poolEntrySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long poolEntrySize(MemorySegment segment, long index) { return (long) VH_poolEntrySize.get(segment, 0L, index); }
    /// {@return `poolEntrySize`}
    public long poolEntrySize() { return poolEntrySize(this.segment(), 0L); }
    /// Sets `poolEntrySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void poolEntrySize(MemorySegment segment, long index, long value) { VH_poolEntrySize.set(segment, 0L, index, value); }
    /// Sets `poolEntrySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelinePoolSize poolEntrySize(long value) { poolEntrySize(this.segment(), 0L, value); return this; }

    /// {@return `poolEntryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int poolEntryCount(MemorySegment segment, long index) { return (int) VH_poolEntryCount.get(segment, 0L, index); }
    /// {@return `poolEntryCount`}
    public int poolEntryCount() { return poolEntryCount(this.segment(), 0L); }
    /// Sets `poolEntryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void poolEntryCount(MemorySegment segment, long index, int value) { VH_poolEntryCount.set(segment, 0L, index, value); }
    /// Sets `poolEntryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelinePoolSize poolEntryCount(int value) { poolEntryCount(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelinePoolSize`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelinePoolSize`
    public VkPipelinePoolSize asSlice(long index) { return new VkPipelinePoolSize(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelinePoolSize`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelinePoolSize`
    public VkPipelinePoolSize asSlice(long index, long count) { return new VkPipelinePoolSize(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelinePoolSize` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelinePoolSize at(long index, Consumer<VkPipelinePoolSize> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelinePoolSize sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelinePoolSize pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `poolEntrySize` at the given index}
    /// @param index the index of the struct buffer
    public long poolEntrySizeAt(long index) { return poolEntrySize(this.segment(), index); }
    /// Sets `poolEntrySize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelinePoolSize poolEntrySizeAt(long index, long value) { poolEntrySize(this.segment(), index, value); return this; }

    /// {@return `poolEntryCount` at the given index}
    /// @param index the index of the struct buffer
    public int poolEntryCountAt(long index) { return poolEntryCount(this.segment(), index); }
    /// Sets `poolEntryCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelinePoolSize poolEntryCountAt(long index, int value) { poolEntryCount(this.segment(), index, value); return this; }

}
