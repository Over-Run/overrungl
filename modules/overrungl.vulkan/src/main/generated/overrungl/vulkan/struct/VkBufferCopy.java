// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBufferCopy`.
/// ## Layout
/// ```
/// struct VkBufferCopy {
///     (uint64_t) VkDeviceSize srcOffset;
///     (uint64_t) VkDeviceSize dstOffset;
///     (uint64_t) VkDeviceSize size;
/// };
/// ```
public final class VkBufferCopy extends GroupType {
    /// The struct layout of `VkBufferCopy`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("srcOffset"),
        ValueLayout.JAVA_LONG.withName("dstOffset"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    /// The byte offset of `srcOffset`.
    public static final long OFFSET_srcOffset = LAYOUT.byteOffset(PathElement.groupElement("srcOffset"));
    /// The memory layout of `srcOffset`.
    public static final MemoryLayout LAYOUT_srcOffset = LAYOUT.select(PathElement.groupElement("srcOffset"));
    /// The [VarHandle] of `srcOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_srcOffset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcOffset")));
    /// The byte offset of `dstOffset`.
    public static final long OFFSET_dstOffset = LAYOUT.byteOffset(PathElement.groupElement("dstOffset"));
    /// The memory layout of `dstOffset`.
    public static final MemoryLayout LAYOUT_dstOffset = LAYOUT.select(PathElement.groupElement("dstOffset"));
    /// The [VarHandle] of `dstOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_dstOffset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstOffset")));
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_size = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("size")));

    /// Creates `VkBufferCopy` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkBufferCopy(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkBufferCopy` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferCopy of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCopy(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBufferCopy` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferCopy ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCopy(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkBufferCopy` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferCopy ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCopy(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBufferCopy` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferCopy`
    public static VkBufferCopy alloc(SegmentAllocator allocator) { return new VkBufferCopy(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkBufferCopy` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBufferCopy`
    public static VkBufferCopy alloc(SegmentAllocator allocator, long count) { return new VkBufferCopy(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBufferCopy copyFrom(VkBufferCopy src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkBufferCopy reinterpret(long count) { return new VkBufferCopy(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `srcOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcOffset(MemorySegment segment, long index) { return (long) VH_srcOffset.get().get(segment, 0L, index); }
    /// {@return `srcOffset`}
    public long srcOffset() { return srcOffset(this.segment(), 0L); }
    /// Sets `srcOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcOffset(MemorySegment segment, long index, long value) { VH_srcOffset.get().set(segment, 0L, index, value); }
    /// Sets `srcOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCopy srcOffset(long value) { srcOffset(this.segment(), 0L, value); return this; }

    /// {@return `dstOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstOffset(MemorySegment segment, long index) { return (long) VH_dstOffset.get().get(segment, 0L, index); }
    /// {@return `dstOffset`}
    public long dstOffset() { return dstOffset(this.segment(), 0L); }
    /// Sets `dstOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstOffset(MemorySegment segment, long index, long value) { VH_dstOffset.get().set(segment, 0L, index, value); }
    /// Sets `dstOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCopy dstOffset(long value) { dstOffset(this.segment(), 0L, value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long size(MemorySegment segment, long index) { return (long) VH_size.get().get(segment, 0L, index); }
    /// {@return `size`}
    public long size() { return size(this.segment(), 0L); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void size(MemorySegment segment, long index, long value) { VH_size.get().set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCopy size(long value) { size(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkBufferCopy`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBufferCopy`
    public VkBufferCopy asSlice(long index) { return new VkBufferCopy(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkBufferCopy`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBufferCopy`
    public VkBufferCopy asSlice(long index, long count) { return new VkBufferCopy(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkBufferCopy` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkBufferCopy at(long index, Consumer<VkBufferCopy> func) { func.accept(asSlice(index)); return this; }

    /// {@return `srcOffset` at the given index}
    /// @param index the index of the struct buffer
    public long srcOffsetAt(long index) { return srcOffset(this.segment(), index); }
    /// Sets `srcOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferCopy srcOffsetAt(long index, long value) { srcOffset(this.segment(), index, value); return this; }

    /// {@return `dstOffset` at the given index}
    /// @param index the index of the struct buffer
    public long dstOffsetAt(long index) { return dstOffset(this.segment(), index); }
    /// Sets `dstOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferCopy dstOffsetAt(long index, long value) { dstOffset(this.segment(), index, value); return this; }

    /// {@return `size` at the given index}
    /// @param index the index of the struct buffer
    public long sizeAt(long index) { return size(this.segment(), index); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferCopy sizeAt(long index, long value) { size(this.segment(), index, value); return this; }

}
