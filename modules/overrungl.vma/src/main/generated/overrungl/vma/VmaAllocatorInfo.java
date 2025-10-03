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

/// Represents `VmaAllocatorInfo`.
/// ## Layout
/// ```
/// struct VmaAllocatorInfo {
///     (struct VkInstance *) VkInstance instance;
///     (struct VkPhysicalDevice *) VkPhysicalDevice physicalDevice;
///     (struct VkDevice *) VkDevice device;
/// };
/// ```
public final class VmaAllocatorInfo extends GroupType {
    /// The struct layout of `VmaAllocatorInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("instance"),
        ValueLayout.ADDRESS.withName("physicalDevice"),
        ValueLayout.ADDRESS.withName("device")
    );
    /// The byte offset of `instance`.
    public static final long OFFSET_instance = LAYOUT.byteOffset(PathElement.groupElement("instance"));
    /// The memory layout of `instance`.
    public static final MemoryLayout LAYOUT_instance = LAYOUT.select(PathElement.groupElement("instance"));
    /// The [VarHandle] of `instance` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_instance = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("instance")));
    /// The byte offset of `physicalDevice`.
    public static final long OFFSET_physicalDevice = LAYOUT.byteOffset(PathElement.groupElement("physicalDevice"));
    /// The memory layout of `physicalDevice`.
    public static final MemoryLayout LAYOUT_physicalDevice = LAYOUT.select(PathElement.groupElement("physicalDevice"));
    /// The [VarHandle] of `physicalDevice` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_physicalDevice = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("physicalDevice")));
    /// The byte offset of `device`.
    public static final long OFFSET_device = LAYOUT.byteOffset(PathElement.groupElement("device"));
    /// The memory layout of `device`.
    public static final MemoryLayout LAYOUT_device = LAYOUT.select(PathElement.groupElement("device"));
    /// The [VarHandle] of `device` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_device = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("device")));

    /// Creates `VmaAllocatorInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VmaAllocatorInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VmaAllocatorInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaAllocatorInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaAllocatorInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VmaAllocatorInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaAllocatorInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaAllocatorInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VmaAllocatorInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaAllocatorInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VmaAllocatorInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VmaAllocatorInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VmaAllocatorInfo`
    public static VmaAllocatorInfo alloc(SegmentAllocator allocator) { return new VmaAllocatorInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VmaAllocatorInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VmaAllocatorInfo`
    public static VmaAllocatorInfo alloc(SegmentAllocator allocator, long count) { return new VmaAllocatorInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VmaAllocatorInfo copyFrom(VmaAllocatorInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VmaAllocatorInfo reinterpret(long count) { return new VmaAllocatorInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `instance` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment instance(MemorySegment segment, long index) { return (MemorySegment) VH_instance.get().get(segment, 0L, index); }
    /// {@return `instance`}
    public MemorySegment instance() { return instance(this.segment(), 0L); }
    /// Sets `instance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void instance(MemorySegment segment, long index, MemorySegment value) { VH_instance.get().set(segment, 0L, index, value); }
    /// Sets `instance` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocatorInfo instance(MemorySegment value) { instance(this.segment(), 0L, value); return this; }

    /// {@return `physicalDevice` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment physicalDevice(MemorySegment segment, long index) { return (MemorySegment) VH_physicalDevice.get().get(segment, 0L, index); }
    /// {@return `physicalDevice`}
    public MemorySegment physicalDevice() { return physicalDevice(this.segment(), 0L); }
    /// Sets `physicalDevice` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void physicalDevice(MemorySegment segment, long index, MemorySegment value) { VH_physicalDevice.get().set(segment, 0L, index, value); }
    /// Sets `physicalDevice` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocatorInfo physicalDevice(MemorySegment value) { physicalDevice(this.segment(), 0L, value); return this; }

    /// {@return `device` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment device(MemorySegment segment, long index) { return (MemorySegment) VH_device.get().get(segment, 0L, index); }
    /// {@return `device`}
    public MemorySegment device() { return device(this.segment(), 0L); }
    /// Sets `device` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void device(MemorySegment segment, long index, MemorySegment value) { VH_device.get().set(segment, 0L, index, value); }
    /// Sets `device` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocatorInfo device(MemorySegment value) { device(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VmaAllocatorInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VmaAllocatorInfo`
    public VmaAllocatorInfo asSlice(long index) { return new VmaAllocatorInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VmaAllocatorInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VmaAllocatorInfo`
    public VmaAllocatorInfo asSlice(long index, long count) { return new VmaAllocatorInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VmaAllocatorInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VmaAllocatorInfo at(long index, Consumer<VmaAllocatorInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `instance` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment instanceAt(long index) { return instance(this.segment(), index); }
    /// Sets `instance` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocatorInfo instanceAt(long index, MemorySegment value) { instance(this.segment(), index, value); return this; }

    /// {@return `physicalDevice` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment physicalDeviceAt(long index) { return physicalDevice(this.segment(), index); }
    /// Sets `physicalDevice` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocatorInfo physicalDeviceAt(long index, MemorySegment value) { physicalDevice(this.segment(), index, value); return this; }

    /// {@return `device` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment deviceAt(long index) { return device(this.segment(), index); }
    /// Sets `device` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocatorInfo deviceAt(long index, MemorySegment value) { device(this.segment(), index, value); return this; }

}
