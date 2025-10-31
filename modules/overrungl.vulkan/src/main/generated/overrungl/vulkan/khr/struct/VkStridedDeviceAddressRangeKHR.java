// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkStridedDeviceAddressRangeKHR`.
/// ## Layout
/// ```
/// struct VkStridedDeviceAddressRangeKHR {
///     (uint64_t) VkDeviceAddress address;
///     (uint64_t) VkDeviceSize size;
///     (uint64_t) VkDeviceSize stride;
/// };
/// ```
public final class VkStridedDeviceAddressRangeKHR extends GroupType {
    /// The struct layout of `VkStridedDeviceAddressRangeKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("address"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("stride")
    );
    /// The byte offset of `address`.
    public static final long OFFSET_address = LAYOUT.byteOffset(PathElement.groupElement("address"));
    /// The memory layout of `address`.
    public static final MemoryLayout LAYOUT_address = LAYOUT.select(PathElement.groupElement("address"));
    /// The [VarHandle] of `address` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_address = LAYOUT.arrayElementVarHandle(PathElement.groupElement("address"));
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The byte offset of `stride`.
    public static final long OFFSET_stride = LAYOUT.byteOffset(PathElement.groupElement("stride"));
    /// The memory layout of `stride`.
    public static final MemoryLayout LAYOUT_stride = LAYOUT.select(PathElement.groupElement("stride"));
    /// The [VarHandle] of `stride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));

    /// Creates `VkStridedDeviceAddressRangeKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkStridedDeviceAddressRangeKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkStridedDeviceAddressRangeKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkStridedDeviceAddressRangeKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkStridedDeviceAddressRangeKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkStridedDeviceAddressRangeKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkStridedDeviceAddressRangeKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkStridedDeviceAddressRangeKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkStridedDeviceAddressRangeKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkStridedDeviceAddressRangeKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkStridedDeviceAddressRangeKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkStridedDeviceAddressRangeKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkStridedDeviceAddressRangeKHR`
    public static VkStridedDeviceAddressRangeKHR alloc(SegmentAllocator allocator) { return new VkStridedDeviceAddressRangeKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkStridedDeviceAddressRangeKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkStridedDeviceAddressRangeKHR`
    public static VkStridedDeviceAddressRangeKHR alloc(SegmentAllocator allocator, long count) { return new VkStridedDeviceAddressRangeKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkStridedDeviceAddressRangeKHR copyFrom(VkStridedDeviceAddressRangeKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkStridedDeviceAddressRangeKHR reinterpret(long count) { return new VkStridedDeviceAddressRangeKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `address` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long address(MemorySegment segment, long index) { return (long) VH_address.get(segment, 0L, index); }
    /// {@return `address`}
    public long address() { return address(this.segment(), 0L); }
    /// Sets `address` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void address(MemorySegment segment, long index, long value) { VH_address.set(segment, 0L, index, value); }
    /// Sets `address` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStridedDeviceAddressRangeKHR address(long value) { address(this.segment(), 0L, value); return this; }

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
    public VkStridedDeviceAddressRangeKHR size(long value) { size(this.segment(), 0L, value); return this; }

    /// {@return `stride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long stride(MemorySegment segment, long index) { return (long) VH_stride.get(segment, 0L, index); }
    /// {@return `stride`}
    public long stride() { return stride(this.segment(), 0L); }
    /// Sets `stride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stride(MemorySegment segment, long index, long value) { VH_stride.set(segment, 0L, index, value); }
    /// Sets `stride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStridedDeviceAddressRangeKHR stride(long value) { stride(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkStridedDeviceAddressRangeKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkStridedDeviceAddressRangeKHR`
    public VkStridedDeviceAddressRangeKHR asSlice(long index) { return new VkStridedDeviceAddressRangeKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkStridedDeviceAddressRangeKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkStridedDeviceAddressRangeKHR`
    public VkStridedDeviceAddressRangeKHR asSlice(long index, long count) { return new VkStridedDeviceAddressRangeKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkStridedDeviceAddressRangeKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkStridedDeviceAddressRangeKHR at(long index, Consumer<VkStridedDeviceAddressRangeKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `address` at the given index}
    /// @param index the index of the struct buffer
    public long addressAt(long index) { return address(this.segment(), index); }
    /// Sets `address` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkStridedDeviceAddressRangeKHR addressAt(long index, long value) { address(this.segment(), index, value); return this; }

    /// {@return `size` at the given index}
    /// @param index the index of the struct buffer
    public long sizeAt(long index) { return size(this.segment(), index); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkStridedDeviceAddressRangeKHR sizeAt(long index, long value) { size(this.segment(), index, value); return this; }

    /// {@return `stride` at the given index}
    /// @param index the index of the struct buffer
    public long strideAt(long index) { return stride(this.segment(), index); }
    /// Sets `stride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkStridedDeviceAddressRangeKHR strideAt(long index, long value) { stride(this.segment(), index, value); return this; }

}
