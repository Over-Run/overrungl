// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCopyMemoryIndirectCommandKHR`.
/// ## Layout
/// ```
/// struct VkCopyMemoryIndirectCommandKHR {
///     (uint64_t) VkDeviceAddress srcAddress;
///     (uint64_t) VkDeviceAddress dstAddress;
///     (uint64_t) VkDeviceSize size;
/// };
/// ```
public final class VkCopyMemoryIndirectCommandKHR extends GroupType {
    /// The struct layout of `VkCopyMemoryIndirectCommandKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("srcAddress"),
        ValueLayout.JAVA_LONG.withName("dstAddress"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    /// The byte offset of `srcAddress`.
    public static final long OFFSET_srcAddress = LAYOUT.byteOffset(PathElement.groupElement("srcAddress"));
    /// The memory layout of `srcAddress`.
    public static final MemoryLayout LAYOUT_srcAddress = LAYOUT.select(PathElement.groupElement("srcAddress"));
    /// The [VarHandle] of `srcAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAddress"));
    /// The byte offset of `dstAddress`.
    public static final long OFFSET_dstAddress = LAYOUT.byteOffset(PathElement.groupElement("dstAddress"));
    /// The memory layout of `dstAddress`.
    public static final MemoryLayout LAYOUT_dstAddress = LAYOUT.select(PathElement.groupElement("dstAddress"));
    /// The [VarHandle] of `dstAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAddress"));
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    /// Creates `VkCopyMemoryIndirectCommandKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkCopyMemoryIndirectCommandKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkCopyMemoryIndirectCommandKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMemoryIndirectCommandKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryIndirectCommandKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCopyMemoryIndirectCommandKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMemoryIndirectCommandKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryIndirectCommandKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkCopyMemoryIndirectCommandKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMemoryIndirectCommandKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryIndirectCommandKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCopyMemoryIndirectCommandKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyMemoryIndirectCommandKHR`
    public static VkCopyMemoryIndirectCommandKHR alloc(SegmentAllocator allocator) { return new VkCopyMemoryIndirectCommandKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkCopyMemoryIndirectCommandKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCopyMemoryIndirectCommandKHR`
    public static VkCopyMemoryIndirectCommandKHR alloc(SegmentAllocator allocator, long count) { return new VkCopyMemoryIndirectCommandKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCopyMemoryIndirectCommandKHR copyFrom(VkCopyMemoryIndirectCommandKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkCopyMemoryIndirectCommandKHR reinterpret(long count) { return new VkCopyMemoryIndirectCommandKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `srcAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcAddress(MemorySegment segment, long index) { return (long) VH_srcAddress.get(segment, 0L, index); }
    /// {@return `srcAddress`}
    public long srcAddress() { return srcAddress(this.segment(), 0L); }
    /// Sets `srcAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcAddress(MemorySegment segment, long index, long value) { VH_srcAddress.set(segment, 0L, index, value); }
    /// Sets `srcAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryIndirectCommandKHR srcAddress(long value) { srcAddress(this.segment(), 0L, value); return this; }

    /// {@return `dstAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstAddress(MemorySegment segment, long index) { return (long) VH_dstAddress.get(segment, 0L, index); }
    /// {@return `dstAddress`}
    public long dstAddress() { return dstAddress(this.segment(), 0L); }
    /// Sets `dstAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstAddress(MemorySegment segment, long index, long value) { VH_dstAddress.set(segment, 0L, index, value); }
    /// Sets `dstAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryIndirectCommandKHR dstAddress(long value) { dstAddress(this.segment(), 0L, value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    public long size() { return size(this.segment(), 0L); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void size(MemorySegment segment, long index, long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryIndirectCommandKHR size(long value) { size(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkCopyMemoryIndirectCommandKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCopyMemoryIndirectCommandKHR`
    public VkCopyMemoryIndirectCommandKHR asSlice(long index) { return new VkCopyMemoryIndirectCommandKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkCopyMemoryIndirectCommandKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCopyMemoryIndirectCommandKHR`
    public VkCopyMemoryIndirectCommandKHR asSlice(long index, long count) { return new VkCopyMemoryIndirectCommandKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkCopyMemoryIndirectCommandKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkCopyMemoryIndirectCommandKHR at(long index, Consumer<VkCopyMemoryIndirectCommandKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `srcAddress` at the given index}
    /// @param index the index of the struct buffer
    public long srcAddressAt(long index) { return srcAddress(this.segment(), index); }
    /// Sets `srcAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryIndirectCommandKHR srcAddressAt(long index, long value) { srcAddress(this.segment(), index, value); return this; }

    /// {@return `dstAddress` at the given index}
    /// @param index the index of the struct buffer
    public long dstAddressAt(long index) { return dstAddress(this.segment(), index); }
    /// Sets `dstAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryIndirectCommandKHR dstAddressAt(long index, long value) { dstAddress(this.segment(), index, value); return this; }

    /// {@return `size` at the given index}
    /// @param index the index of the struct buffer
    public long sizeAt(long index) { return size(this.segment(), index); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryIndirectCommandKHR sizeAt(long index, long value) { size(this.segment(), index, value); return this; }

}
