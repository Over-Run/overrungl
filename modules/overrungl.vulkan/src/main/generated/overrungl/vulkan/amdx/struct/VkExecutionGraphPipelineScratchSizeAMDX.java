// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.amdx.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExecutionGraphPipelineScratchSizeAMDX`.
/// ## Layout
/// ```
/// struct VkExecutionGraphPipelineScratchSizeAMDX {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint64_t) VkDeviceSize minSize;
///     (uint64_t) VkDeviceSize maxSize;
///     (uint64_t) VkDeviceSize sizeGranularity;
/// };
/// ```
public final class VkExecutionGraphPipelineScratchSizeAMDX extends GroupType {
    /// The struct layout of `VkExecutionGraphPipelineScratchSizeAMDX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("minSize"),
        ValueLayout.JAVA_LONG.withName("maxSize"),
        ValueLayout.JAVA_LONG.withName("sizeGranularity")
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
    /// The byte offset of `minSize`.
    public static final long OFFSET_minSize = LAYOUT.byteOffset(PathElement.groupElement("minSize"));
    /// The memory layout of `minSize`.
    public static final MemoryLayout LAYOUT_minSize = LAYOUT.select(PathElement.groupElement("minSize"));
    /// The [VarHandle] of `minSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSize"));
    /// The byte offset of `maxSize`.
    public static final long OFFSET_maxSize = LAYOUT.byteOffset(PathElement.groupElement("maxSize"));
    /// The memory layout of `maxSize`.
    public static final MemoryLayout LAYOUT_maxSize = LAYOUT.select(PathElement.groupElement("maxSize"));
    /// The [VarHandle] of `maxSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSize"));
    /// The byte offset of `sizeGranularity`.
    public static final long OFFSET_sizeGranularity = LAYOUT.byteOffset(PathElement.groupElement("sizeGranularity"));
    /// The memory layout of `sizeGranularity`.
    public static final MemoryLayout LAYOUT_sizeGranularity = LAYOUT.select(PathElement.groupElement("sizeGranularity"));
    /// The [VarHandle] of `sizeGranularity` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sizeGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sizeGranularity"));

    /// Creates `VkExecutionGraphPipelineScratchSizeAMDX` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkExecutionGraphPipelineScratchSizeAMDX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkExecutionGraphPipelineScratchSizeAMDX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExecutionGraphPipelineScratchSizeAMDX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExecutionGraphPipelineScratchSizeAMDX(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExecutionGraphPipelineScratchSizeAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExecutionGraphPipelineScratchSizeAMDX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExecutionGraphPipelineScratchSizeAMDX(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkExecutionGraphPipelineScratchSizeAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExecutionGraphPipelineScratchSizeAMDX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExecutionGraphPipelineScratchSizeAMDX(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkExecutionGraphPipelineScratchSizeAMDX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExecutionGraphPipelineScratchSizeAMDX`
    public static VkExecutionGraphPipelineScratchSizeAMDX alloc(SegmentAllocator allocator) { return new VkExecutionGraphPipelineScratchSizeAMDX(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkExecutionGraphPipelineScratchSizeAMDX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExecutionGraphPipelineScratchSizeAMDX`
    public static VkExecutionGraphPipelineScratchSizeAMDX alloc(SegmentAllocator allocator, long count) { return new VkExecutionGraphPipelineScratchSizeAMDX(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExecutionGraphPipelineScratchSizeAMDX copyFrom(VkExecutionGraphPipelineScratchSizeAMDX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkExecutionGraphPipelineScratchSizeAMDX reinterpret(long count) { return new VkExecutionGraphPipelineScratchSizeAMDX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkExecutionGraphPipelineScratchSizeAMDX sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkExecutionGraphPipelineScratchSizeAMDX pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `minSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long minSize(MemorySegment segment, long index) { return (long) VH_minSize.get(segment, 0L, index); }
    /// {@return `minSize`}
    public long minSize() { return minSize(this.segment(), 0L); }
    /// Sets `minSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minSize(MemorySegment segment, long index, long value) { VH_minSize.set(segment, 0L, index, value); }
    /// Sets `minSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExecutionGraphPipelineScratchSizeAMDX minSize(long value) { minSize(this.segment(), 0L, value); return this; }

    /// {@return `maxSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxSize(MemorySegment segment, long index) { return (long) VH_maxSize.get(segment, 0L, index); }
    /// {@return `maxSize`}
    public long maxSize() { return maxSize(this.segment(), 0L); }
    /// Sets `maxSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSize(MemorySegment segment, long index, long value) { VH_maxSize.set(segment, 0L, index, value); }
    /// Sets `maxSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExecutionGraphPipelineScratchSizeAMDX maxSize(long value) { maxSize(this.segment(), 0L, value); return this; }

    /// {@return `sizeGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long sizeGranularity(MemorySegment segment, long index) { return (long) VH_sizeGranularity.get(segment, 0L, index); }
    /// {@return `sizeGranularity`}
    public long sizeGranularity() { return sizeGranularity(this.segment(), 0L); }
    /// Sets `sizeGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sizeGranularity(MemorySegment segment, long index, long value) { VH_sizeGranularity.set(segment, 0L, index, value); }
    /// Sets `sizeGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExecutionGraphPipelineScratchSizeAMDX sizeGranularity(long value) { sizeGranularity(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkExecutionGraphPipelineScratchSizeAMDX`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkExecutionGraphPipelineScratchSizeAMDX`
    public VkExecutionGraphPipelineScratchSizeAMDX asSlice(long index) { return new VkExecutionGraphPipelineScratchSizeAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkExecutionGraphPipelineScratchSizeAMDX`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkExecutionGraphPipelineScratchSizeAMDX`
    public VkExecutionGraphPipelineScratchSizeAMDX asSlice(long index, long count) { return new VkExecutionGraphPipelineScratchSizeAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkExecutionGraphPipelineScratchSizeAMDX` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkExecutionGraphPipelineScratchSizeAMDX at(long index, Consumer<VkExecutionGraphPipelineScratchSizeAMDX> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExecutionGraphPipelineScratchSizeAMDX sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExecutionGraphPipelineScratchSizeAMDX pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `minSize` at the given index}
    /// @param index the index of the struct buffer
    public long minSizeAt(long index) { return minSize(this.segment(), index); }
    /// Sets `minSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExecutionGraphPipelineScratchSizeAMDX minSizeAt(long index, long value) { minSize(this.segment(), index, value); return this; }

    /// {@return `maxSize` at the given index}
    /// @param index the index of the struct buffer
    public long maxSizeAt(long index) { return maxSize(this.segment(), index); }
    /// Sets `maxSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExecutionGraphPipelineScratchSizeAMDX maxSizeAt(long index, long value) { maxSize(this.segment(), index, value); return this; }

    /// {@return `sizeGranularity` at the given index}
    /// @param index the index of the struct buffer
    public long sizeGranularityAt(long index) { return sizeGranularity(this.segment(), index); }
    /// Sets `sizeGranularity` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExecutionGraphPipelineScratchSizeAMDX sizeGranularityAt(long index, long value) { sizeGranularity(this.segment(), index, value); return this; }

}
