// This file is auto-generated. DO NOT EDIT!
package overrungl.vma;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VmaVirtualAllocationCreateInfo`.
/// ## Layout
/// ```
/// struct VmaVirtualAllocationCreateInfo {
///     (uint64_t) VkDeviceSize size;
///     (uint64_t) VkDeviceSize alignment;
///     ((uint32_t) VkFlags) VmaVirtualAllocationCreateFlags flags;
///     void* pUserData;
/// };
/// ```
public final class VmaVirtualAllocationCreateInfo extends GroupType {
    /// The struct layout of `VmaVirtualAllocationCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("alignment"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pUserData")
    );
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The byte offset of `alignment`.
    public static final long OFFSET_alignment = LAYOUT.byteOffset(PathElement.groupElement("alignment"));
    /// The memory layout of `alignment`.
    public static final MemoryLayout LAYOUT_alignment = LAYOUT.select(PathElement.groupElement("alignment"));
    /// The [VarHandle] of `alignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_alignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alignment"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `pUserData`.
    public static final long OFFSET_pUserData = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
    /// The memory layout of `pUserData`.
    public static final MemoryLayout LAYOUT_pUserData = LAYOUT.select(PathElement.groupElement("pUserData"));
    /// The [VarHandle] of `pUserData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pUserData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUserData"));

    /// Creates `VmaVirtualAllocationCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VmaVirtualAllocationCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VmaVirtualAllocationCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaVirtualAllocationCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaVirtualAllocationCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VmaVirtualAllocationCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaVirtualAllocationCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaVirtualAllocationCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VmaVirtualAllocationCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaVirtualAllocationCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VmaVirtualAllocationCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VmaVirtualAllocationCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VmaVirtualAllocationCreateInfo`
    public static VmaVirtualAllocationCreateInfo alloc(SegmentAllocator allocator) { return new VmaVirtualAllocationCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VmaVirtualAllocationCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VmaVirtualAllocationCreateInfo`
    public static VmaVirtualAllocationCreateInfo alloc(SegmentAllocator allocator, long count) { return new VmaVirtualAllocationCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VmaVirtualAllocationCreateInfo copyFrom(VmaVirtualAllocationCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VmaVirtualAllocationCreateInfo reinterpret(long count) { return new VmaVirtualAllocationCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VmaVirtualAllocationCreateInfo size(long value) { size(this.segment(), 0L, value); return this; }

    /// {@return `alignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long alignment(MemorySegment segment, long index) { return (long) VH_alignment.get(segment, 0L, index); }
    /// {@return `alignment`}
    public long alignment() { return alignment(this.segment(), 0L); }
    /// Sets `alignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void alignment(MemorySegment segment, long index, long value) { VH_alignment.set(segment, 0L, index, value); }
    /// Sets `alignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVirtualAllocationCreateInfo alignment(long value) { alignment(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVirtualAllocationCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `pUserData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pUserData(MemorySegment segment, long index) { return (MemorySegment) VH_pUserData.get(segment, 0L, index); }
    /// {@return `pUserData`}
    public MemorySegment pUserData() { return pUserData(this.segment(), 0L); }
    /// Sets `pUserData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pUserData(MemorySegment segment, long index, MemorySegment value) { VH_pUserData.set(segment, 0L, index, value); }
    /// Sets `pUserData` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVirtualAllocationCreateInfo pUserData(MemorySegment value) { pUserData(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VmaVirtualAllocationCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VmaVirtualAllocationCreateInfo`
    public VmaVirtualAllocationCreateInfo asSlice(long index) { return new VmaVirtualAllocationCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VmaVirtualAllocationCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VmaVirtualAllocationCreateInfo`
    public VmaVirtualAllocationCreateInfo asSlice(long index, long count) { return new VmaVirtualAllocationCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VmaVirtualAllocationCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VmaVirtualAllocationCreateInfo at(long index, Consumer<VmaVirtualAllocationCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `size` at the given index}
    /// @param index the index of the struct buffer
    public long sizeAt(long index) { return size(this.segment(), index); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVirtualAllocationCreateInfo sizeAt(long index, long value) { size(this.segment(), index, value); return this; }

    /// {@return `alignment` at the given index}
    /// @param index the index of the struct buffer
    public long alignmentAt(long index) { return alignment(this.segment(), index); }
    /// Sets `alignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVirtualAllocationCreateInfo alignmentAt(long index, long value) { alignment(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVirtualAllocationCreateInfo flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `pUserData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pUserDataAt(long index) { return pUserData(this.segment(), index); }
    /// Sets `pUserData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVirtualAllocationCreateInfo pUserDataAt(long index, MemorySegment value) { pUserData(this.segment(), index, value); return this; }

}
