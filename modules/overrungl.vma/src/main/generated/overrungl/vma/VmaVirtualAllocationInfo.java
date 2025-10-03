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

/// Represents `VmaVirtualAllocationInfo`.
/// ## Layout
/// ```
/// struct VmaVirtualAllocationInfo {
///     (uint64_t) VkDeviceSize offset;
///     (uint64_t) VkDeviceSize size;
///     void* pUserData;
/// };
/// ```
public final class VmaVirtualAllocationInfo extends GroupType {
    /// The struct layout of `VmaVirtualAllocationInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.ADDRESS.withName("pUserData")
    );
    /// The byte offset of `offset`.
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    /// The memory layout of `offset`.
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_offset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset")));
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_size = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("size")));
    /// The byte offset of `pUserData`.
    public static final long OFFSET_pUserData = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
    /// The memory layout of `pUserData`.
    public static final MemoryLayout LAYOUT_pUserData = LAYOUT.select(PathElement.groupElement("pUserData"));
    /// The [VarHandle] of `pUserData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pUserData = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUserData")));

    /// Creates `VmaVirtualAllocationInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VmaVirtualAllocationInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VmaVirtualAllocationInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaVirtualAllocationInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaVirtualAllocationInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VmaVirtualAllocationInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaVirtualAllocationInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaVirtualAllocationInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VmaVirtualAllocationInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaVirtualAllocationInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VmaVirtualAllocationInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VmaVirtualAllocationInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VmaVirtualAllocationInfo`
    public static VmaVirtualAllocationInfo alloc(SegmentAllocator allocator) { return new VmaVirtualAllocationInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VmaVirtualAllocationInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VmaVirtualAllocationInfo`
    public static VmaVirtualAllocationInfo alloc(SegmentAllocator allocator, long count) { return new VmaVirtualAllocationInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VmaVirtualAllocationInfo copyFrom(VmaVirtualAllocationInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VmaVirtualAllocationInfo reinterpret(long count) { return new VmaVirtualAllocationInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long offset(MemorySegment segment, long index) { return (long) VH_offset.get().get(segment, 0L, index); }
    /// {@return `offset`}
    public long offset() { return offset(this.segment(), 0L); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void offset(MemorySegment segment, long index, long value) { VH_offset.get().set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVirtualAllocationInfo offset(long value) { offset(this.segment(), 0L, value); return this; }

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
    public VmaVirtualAllocationInfo size(long value) { size(this.segment(), 0L, value); return this; }

    /// {@return `pUserData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pUserData(MemorySegment segment, long index) { return (MemorySegment) VH_pUserData.get().get(segment, 0L, index); }
    /// {@return `pUserData`}
    public MemorySegment pUserData() { return pUserData(this.segment(), 0L); }
    /// Sets `pUserData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pUserData(MemorySegment segment, long index, MemorySegment value) { VH_pUserData.get().set(segment, 0L, index, value); }
    /// Sets `pUserData` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVirtualAllocationInfo pUserData(MemorySegment value) { pUserData(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VmaVirtualAllocationInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VmaVirtualAllocationInfo`
    public VmaVirtualAllocationInfo asSlice(long index) { return new VmaVirtualAllocationInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VmaVirtualAllocationInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VmaVirtualAllocationInfo`
    public VmaVirtualAllocationInfo asSlice(long index, long count) { return new VmaVirtualAllocationInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VmaVirtualAllocationInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VmaVirtualAllocationInfo at(long index, Consumer<VmaVirtualAllocationInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `offset` at the given index}
    /// @param index the index of the struct buffer
    public long offsetAt(long index) { return offset(this.segment(), index); }
    /// Sets `offset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVirtualAllocationInfo offsetAt(long index, long value) { offset(this.segment(), index, value); return this; }

    /// {@return `size` at the given index}
    /// @param index the index of the struct buffer
    public long sizeAt(long index) { return size(this.segment(), index); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVirtualAllocationInfo sizeAt(long index, long value) { size(this.segment(), index, value); return this; }

    /// {@return `pUserData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pUserDataAt(long index) { return pUserData(this.segment(), index); }
    /// Sets `pUserData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVirtualAllocationInfo pUserDataAt(long index, MemorySegment value) { pUserData(this.segment(), index, value); return this; }

}
