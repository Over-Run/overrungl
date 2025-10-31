// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.union;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceOrHostAddressConstKHR`.
/// ## Layout
/// ```
/// union VkDeviceOrHostAddressConstKHR {
///     (uint64_t) VkDeviceAddress deviceAddress;
///     const void* hostAddress;
/// };
/// ```
public final class VkDeviceOrHostAddressConstKHR extends GroupType {
    /// The union layout of `VkDeviceOrHostAddressConstKHR`.
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.JAVA_LONG.withName("deviceAddress"),
        ValueLayout.ADDRESS.withName("hostAddress")
    );
    /// The byte offset of `deviceAddress`.
    public static final long OFFSET_deviceAddress = LAYOUT.byteOffset(PathElement.groupElement("deviceAddress"));
    /// The memory layout of `deviceAddress`.
    public static final MemoryLayout LAYOUT_deviceAddress = LAYOUT.select(PathElement.groupElement("deviceAddress"));
    /// The [VarHandle] of `deviceAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceAddress"));
    /// The byte offset of `hostAddress`.
    public static final long OFFSET_hostAddress = LAYOUT.byteOffset(PathElement.groupElement("hostAddress"));
    /// The memory layout of `hostAddress`.
    public static final MemoryLayout LAYOUT_hostAddress = LAYOUT.select(PathElement.groupElement("hostAddress"));
    /// The [VarHandle] of `hostAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hostAddress"));

    /// Creates `VkDeviceOrHostAddressConstKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this union buffer
    public VkDeviceOrHostAddressConstKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDeviceOrHostAddressConstKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceOrHostAddressConstKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceOrHostAddressConstKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceOrHostAddressConstKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceOrHostAddressConstKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceOrHostAddressConstKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDeviceOrHostAddressConstKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceOrHostAddressConstKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceOrHostAddressConstKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDeviceOrHostAddressConstKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceOrHostAddressConstKHR`
    public static VkDeviceOrHostAddressConstKHR alloc(SegmentAllocator allocator) { return new VkDeviceOrHostAddressConstKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDeviceOrHostAddressConstKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceOrHostAddressConstKHR`
    public static VkDeviceOrHostAddressConstKHR alloc(SegmentAllocator allocator, long count) { return new VkDeviceOrHostAddressConstKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceOrHostAddressConstKHR copyFrom(VkDeviceOrHostAddressConstKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDeviceOrHostAddressConstKHR reinterpret(long count) { return new VkDeviceOrHostAddressConstKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `deviceAddress` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static long deviceAddress(MemorySegment segment, long index) { return (long) VH_deviceAddress.get(segment, 0L, index); }
    /// {@return `deviceAddress`}
    public long deviceAddress() { return deviceAddress(this.segment(), 0L); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void deviceAddress(MemorySegment segment, long index, long value) { VH_deviceAddress.set(segment, 0L, index, value); }
    /// Sets `deviceAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceOrHostAddressConstKHR deviceAddress(long value) { deviceAddress(this.segment(), 0L, value); return this; }

    /// {@return `hostAddress` at the given index}
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    public static MemorySegment hostAddress(MemorySegment segment, long index) { return (MemorySegment) VH_hostAddress.get(segment, 0L, index); }
    /// {@return `hostAddress`}
    public MemorySegment hostAddress() { return hostAddress(this.segment(), 0L); }
    /// Sets `hostAddress` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index the index of the union buffer
    /// @param value the value
    public static void hostAddress(MemorySegment segment, long index, MemorySegment value) { VH_hostAddress.set(segment, 0L, index, value); }
    /// Sets `hostAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceOrHostAddressConstKHR hostAddress(MemorySegment value) { hostAddress(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDeviceOrHostAddressConstKHR`.
    /// @param index the index of the union buffer
    /// @return the slice of `VkDeviceOrHostAddressConstKHR`
    public VkDeviceOrHostAddressConstKHR asSlice(long index) { return new VkDeviceOrHostAddressConstKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDeviceOrHostAddressConstKHR`.
    /// @param index the index of the union buffer
    /// @param count the count
    /// @return the slice of `VkDeviceOrHostAddressConstKHR`
    public VkDeviceOrHostAddressConstKHR asSlice(long index, long count) { return new VkDeviceOrHostAddressConstKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDeviceOrHostAddressConstKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDeviceOrHostAddressConstKHR at(long index, Consumer<VkDeviceOrHostAddressConstKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `deviceAddress` at the given index}
    /// @param index the index of the union buffer
    public long deviceAddressAt(long index) { return deviceAddress(this.segment(), index); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceOrHostAddressConstKHR deviceAddressAt(long index, long value) { deviceAddress(this.segment(), index, value); return this; }

    /// {@return `hostAddress` at the given index}
    /// @param index the index of the union buffer
    public MemorySegment hostAddressAt(long index) { return hostAddress(this.segment(), index); }
    /// Sets `hostAddress` with the given value at the given index.
    /// @param index the index of the union buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceOrHostAddressConstKHR hostAddressAt(long index, MemorySegment value) { hostAddress(this.segment(), index, value); return this; }

}
