// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineBinaryDataKHR`.
/// ## Layout
/// ```
/// struct VkPipelineBinaryDataKHR {
///     size_t dataSize;
///     void* pData;
/// };
/// ```
public final class VkPipelineBinaryDataKHR extends GroupType {
    /// The struct layout of `VkPipelineBinaryDataKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        CanonicalTypes.SIZE_T.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
    );
    /// The byte offset of `dataSize`.
    public static final long OFFSET_dataSize = LAYOUT.byteOffset(PathElement.groupElement("dataSize"));
    /// The memory layout of `dataSize`.
    public static final MemoryLayout LAYOUT_dataSize = LAYOUT.select(PathElement.groupElement("dataSize"));
    /// The [VarHandle] of `dataSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataSize"));
    /// The byte offset of `pData`.
    public static final long OFFSET_pData = LAYOUT.byteOffset(PathElement.groupElement("pData"));
    /// The memory layout of `pData`.
    public static final MemoryLayout LAYOUT_pData = LAYOUT.select(PathElement.groupElement("pData"));
    /// The [VarHandle] of `pData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pData"));

    /// Creates `VkPipelineBinaryDataKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineBinaryDataKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineBinaryDataKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryDataKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryDataKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineBinaryDataKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryDataKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryDataKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineBinaryDataKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryDataKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryDataKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineBinaryDataKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineBinaryDataKHR`
    public static VkPipelineBinaryDataKHR alloc(SegmentAllocator allocator) { return new VkPipelineBinaryDataKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineBinaryDataKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineBinaryDataKHR`
    public static VkPipelineBinaryDataKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineBinaryDataKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineBinaryDataKHR copyFrom(VkPipelineBinaryDataKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineBinaryDataKHR reinterpret(long count) { return new VkPipelineBinaryDataKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `dataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dataSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_dataSize.get(segment, 0L, index)); }
    /// {@return `dataSize`}
    public long dataSize() { return dataSize(this.segment(), 0L); }
    /// Sets `dataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dataSize(MemorySegment segment, long index, long value) { VH_dataSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `dataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryDataKHR dataSize(long value) { dataSize(this.segment(), 0L, value); return this; }

    /// {@return `pData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pData(MemorySegment segment, long index) { return (MemorySegment) VH_pData.get(segment, 0L, index); }
    /// {@return `pData`}
    public MemorySegment pData() { return pData(this.segment(), 0L); }
    /// Sets `pData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pData(MemorySegment segment, long index, MemorySegment value) { VH_pData.set(segment, 0L, index, value); }
    /// Sets `pData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryDataKHR pData(MemorySegment value) { pData(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineBinaryDataKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineBinaryDataKHR`
    public VkPipelineBinaryDataKHR asSlice(long index) { return new VkPipelineBinaryDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineBinaryDataKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineBinaryDataKHR`
    public VkPipelineBinaryDataKHR asSlice(long index, long count) { return new VkPipelineBinaryDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineBinaryDataKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineBinaryDataKHR at(long index, Consumer<VkPipelineBinaryDataKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `dataSize` at the given index}
    /// @param index the index of the struct buffer
    public long dataSizeAt(long index) { return dataSize(this.segment(), index); }
    /// Sets `dataSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryDataKHR dataSizeAt(long index, long value) { dataSize(this.segment(), index, value); return this; }

    /// {@return `pData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDataAt(long index) { return pData(this.segment(), index); }
    /// Sets `pData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryDataKHR pDataAt(long index, MemorySegment value) { pData(this.segment(), index, value); return this; }

}
