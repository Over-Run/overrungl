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

/// Represents `VkStridedDeviceAddressRegionKHR`.
/// ## Layout
/// ```
/// struct VkStridedDeviceAddressRegionKHR {
///     (uint64_t) VkDeviceAddress deviceAddress;
///     (uint64_t) VkDeviceSize stride;
///     (uint64_t) VkDeviceSize size;
/// };
/// ```
public final class VkStridedDeviceAddressRegionKHR extends GroupType {
    /// The struct layout of `VkStridedDeviceAddressRegionKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("deviceAddress"),
        ValueLayout.JAVA_LONG.withName("stride"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    /// The byte offset of `deviceAddress`.
    public static final long OFFSET_deviceAddress = LAYOUT.byteOffset(PathElement.groupElement("deviceAddress"));
    /// The memory layout of `deviceAddress`.
    public static final MemoryLayout LAYOUT_deviceAddress = LAYOUT.select(PathElement.groupElement("deviceAddress"));
    /// The [VarHandle] of `deviceAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_deviceAddress = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceAddress")));
    /// The byte offset of `stride`.
    public static final long OFFSET_stride = LAYOUT.byteOffset(PathElement.groupElement("stride"));
    /// The memory layout of `stride`.
    public static final MemoryLayout LAYOUT_stride = LAYOUT.select(PathElement.groupElement("stride"));
    /// The [VarHandle] of `stride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_stride = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride")));
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_size = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("size")));

    /// Creates `VkStridedDeviceAddressRegionKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkStridedDeviceAddressRegionKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkStridedDeviceAddressRegionKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkStridedDeviceAddressRegionKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkStridedDeviceAddressRegionKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkStridedDeviceAddressRegionKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkStridedDeviceAddressRegionKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkStridedDeviceAddressRegionKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkStridedDeviceAddressRegionKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkStridedDeviceAddressRegionKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkStridedDeviceAddressRegionKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkStridedDeviceAddressRegionKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkStridedDeviceAddressRegionKHR`
    public static VkStridedDeviceAddressRegionKHR alloc(SegmentAllocator allocator) { return new VkStridedDeviceAddressRegionKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkStridedDeviceAddressRegionKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkStridedDeviceAddressRegionKHR`
    public static VkStridedDeviceAddressRegionKHR alloc(SegmentAllocator allocator, long count) { return new VkStridedDeviceAddressRegionKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkStridedDeviceAddressRegionKHR copyFrom(VkStridedDeviceAddressRegionKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkStridedDeviceAddressRegionKHR reinterpret(long count) { return new VkStridedDeviceAddressRegionKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `deviceAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long deviceAddress(MemorySegment segment, long index) { return (long) VH_deviceAddress.get().get(segment, 0L, index); }
    /// {@return `deviceAddress`}
    public long deviceAddress() { return deviceAddress(this.segment(), 0L); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceAddress(MemorySegment segment, long index, long value) { VH_deviceAddress.get().set(segment, 0L, index, value); }
    /// Sets `deviceAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStridedDeviceAddressRegionKHR deviceAddress(long value) { deviceAddress(this.segment(), 0L, value); return this; }

    /// {@return `stride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long stride(MemorySegment segment, long index) { return (long) VH_stride.get().get(segment, 0L, index); }
    /// {@return `stride`}
    public long stride() { return stride(this.segment(), 0L); }
    /// Sets `stride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stride(MemorySegment segment, long index, long value) { VH_stride.get().set(segment, 0L, index, value); }
    /// Sets `stride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStridedDeviceAddressRegionKHR stride(long value) { stride(this.segment(), 0L, value); return this; }

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
    public VkStridedDeviceAddressRegionKHR size(long value) { size(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkStridedDeviceAddressRegionKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkStridedDeviceAddressRegionKHR`
    public VkStridedDeviceAddressRegionKHR asSlice(long index) { return new VkStridedDeviceAddressRegionKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkStridedDeviceAddressRegionKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkStridedDeviceAddressRegionKHR`
    public VkStridedDeviceAddressRegionKHR asSlice(long index, long count) { return new VkStridedDeviceAddressRegionKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkStridedDeviceAddressRegionKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkStridedDeviceAddressRegionKHR at(long index, Consumer<VkStridedDeviceAddressRegionKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `deviceAddress` at the given index}
    /// @param index the index of the struct buffer
    public long deviceAddressAt(long index) { return deviceAddress(this.segment(), index); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkStridedDeviceAddressRegionKHR deviceAddressAt(long index, long value) { deviceAddress(this.segment(), index, value); return this; }

    /// {@return `stride` at the given index}
    /// @param index the index of the struct buffer
    public long strideAt(long index) { return stride(this.segment(), index); }
    /// Sets `stride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkStridedDeviceAddressRegionKHR strideAt(long index, long value) { stride(this.segment(), index, value); return this; }

    /// {@return `size` at the given index}
    /// @param index the index of the struct buffer
    public long sizeAt(long index) { return size(this.segment(), index); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkStridedDeviceAddressRegionKHR sizeAt(long index, long value) { size(this.segment(), index, value); return this; }

}
