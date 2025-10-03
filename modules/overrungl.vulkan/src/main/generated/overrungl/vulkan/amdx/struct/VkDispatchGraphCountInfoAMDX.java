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

/// Represents `VkDispatchGraphCountInfoAMDX`.
/// ## Layout
/// ```
/// struct VkDispatchGraphCountInfoAMDX {
///     uint32_t count;
///     (union VkDeviceOrHostAddressConstAMDX) VkDeviceOrHostAddressConstAMDX infos;
///     uint64_t stride;
/// };
/// ```
public final class VkDispatchGraphCountInfoAMDX extends GroupType {
    /// The struct layout of `VkDispatchGraphCountInfoAMDX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("count"),
        overrungl.vulkan.amdx.union.VkDeviceOrHostAddressConstAMDX.LAYOUT.withName("infos"),
        ValueLayout.JAVA_LONG.withName("stride")
    );
    /// The byte offset of `count`.
    public static final long OFFSET_count = LAYOUT.byteOffset(PathElement.groupElement("count"));
    /// The memory layout of `count`.
    public static final MemoryLayout LAYOUT_count = LAYOUT.select(PathElement.groupElement("count"));
    /// The [VarHandle] of `count` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_count = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("count")));
    /// The byte offset of `infos`.
    public static final long OFFSET_infos = LAYOUT.byteOffset(PathElement.groupElement("infos"));
    /// The memory layout of `infos`.
    public static final MemoryLayout LAYOUT_infos = LAYOUT.select(PathElement.groupElement("infos"));
    /// The byte offset of `stride`.
    public static final long OFFSET_stride = LAYOUT.byteOffset(PathElement.groupElement("stride"));
    /// The memory layout of `stride`.
    public static final MemoryLayout LAYOUT_stride = LAYOUT.select(PathElement.groupElement("stride"));
    /// The [VarHandle] of `stride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_stride = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride")));

    /// Creates `VkDispatchGraphCountInfoAMDX` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDispatchGraphCountInfoAMDX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDispatchGraphCountInfoAMDX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDispatchGraphCountInfoAMDX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDispatchGraphCountInfoAMDX(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDispatchGraphCountInfoAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDispatchGraphCountInfoAMDX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDispatchGraphCountInfoAMDX(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDispatchGraphCountInfoAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDispatchGraphCountInfoAMDX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDispatchGraphCountInfoAMDX(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDispatchGraphCountInfoAMDX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDispatchGraphCountInfoAMDX`
    public static VkDispatchGraphCountInfoAMDX alloc(SegmentAllocator allocator) { return new VkDispatchGraphCountInfoAMDX(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDispatchGraphCountInfoAMDX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDispatchGraphCountInfoAMDX`
    public static VkDispatchGraphCountInfoAMDX alloc(SegmentAllocator allocator, long count) { return new VkDispatchGraphCountInfoAMDX(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDispatchGraphCountInfoAMDX copyFrom(VkDispatchGraphCountInfoAMDX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDispatchGraphCountInfoAMDX reinterpret(long count) { return new VkDispatchGraphCountInfoAMDX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `count` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int count(MemorySegment segment, long index) { return (int) VH_count.get().get(segment, 0L, index); }
    /// {@return `count`}
    public int count() { return count(this.segment(), 0L); }
    /// Sets `count` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void count(MemorySegment segment, long index, int value) { VH_count.get().set(segment, 0L, index, value); }
    /// Sets `count` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDispatchGraphCountInfoAMDX count(int value) { count(this.segment(), 0L, value); return this; }

    /// {@return `infos` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment infos(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_infos, index), LAYOUT_infos); }
    /// {@return `infos`}
    public MemorySegment infos() { return infos(this.segment(), 0L); }
    /// Sets `infos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void infos(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_infos, index), LAYOUT_infos.byteSize()); }
    /// Sets `infos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDispatchGraphCountInfoAMDX infos(MemorySegment value) { infos(this.segment(), 0L, value); return this; }
    /// Accepts `infos` with the given function.
    /// @param func the function
    /// @return `this`
    public VkDispatchGraphCountInfoAMDX infos(Consumer<overrungl.vulkan.amdx.union.VkDeviceOrHostAddressConstAMDX> func) { func.accept(overrungl.vulkan.amdx.union.VkDeviceOrHostAddressConstAMDX.of(infos())); return this; }

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
    public VkDispatchGraphCountInfoAMDX stride(long value) { stride(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDispatchGraphCountInfoAMDX`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDispatchGraphCountInfoAMDX`
    public VkDispatchGraphCountInfoAMDX asSlice(long index) { return new VkDispatchGraphCountInfoAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDispatchGraphCountInfoAMDX`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDispatchGraphCountInfoAMDX`
    public VkDispatchGraphCountInfoAMDX asSlice(long index, long count) { return new VkDispatchGraphCountInfoAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDispatchGraphCountInfoAMDX` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDispatchGraphCountInfoAMDX at(long index, Consumer<VkDispatchGraphCountInfoAMDX> func) { func.accept(asSlice(index)); return this; }

    /// {@return `count` at the given index}
    /// @param index the index of the struct buffer
    public int countAt(long index) { return count(this.segment(), index); }
    /// Sets `count` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDispatchGraphCountInfoAMDX countAt(long index, int value) { count(this.segment(), index, value); return this; }

    /// {@return `infos` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment infosAt(long index) { return infos(this.segment(), index); }
    /// Sets `infos` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDispatchGraphCountInfoAMDX infosAt(long index, MemorySegment value) { infos(this.segment(), index, value); return this; }
    /// Accepts `infos` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkDispatchGraphCountInfoAMDX infosAt(long index, Consumer<overrungl.vulkan.amdx.union.VkDeviceOrHostAddressConstAMDX> func) { func.accept(overrungl.vulkan.amdx.union.VkDeviceOrHostAddressConstAMDX.of(infosAt(index))); return this; }

    /// {@return `stride` at the given index}
    /// @param index the index of the struct buffer
    public long strideAt(long index) { return stride(this.segment(), index); }
    /// Sets `stride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDispatchGraphCountInfoAMDX strideAt(long index, long value) { stride(this.segment(), index, value); return this; }

}
