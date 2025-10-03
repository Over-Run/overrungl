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

/// Represents `VkSubresourceLayout`.
/// ## Layout
/// ```
/// struct VkSubresourceLayout {
///     (uint64_t) VkDeviceSize offset;
///     (uint64_t) VkDeviceSize size;
///     (uint64_t) VkDeviceSize rowPitch;
///     (uint64_t) VkDeviceSize arrayPitch;
///     (uint64_t) VkDeviceSize depthPitch;
/// };
/// ```
public final class VkSubresourceLayout extends GroupType {
    /// The struct layout of `VkSubresourceLayout`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("rowPitch"),
        ValueLayout.JAVA_LONG.withName("arrayPitch"),
        ValueLayout.JAVA_LONG.withName("depthPitch")
    );
    /// The byte offset of `offset`.
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    /// The memory layout of `offset`.
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The byte offset of `rowPitch`.
    public static final long OFFSET_rowPitch = LAYOUT.byteOffset(PathElement.groupElement("rowPitch"));
    /// The memory layout of `rowPitch`.
    public static final MemoryLayout LAYOUT_rowPitch = LAYOUT.select(PathElement.groupElement("rowPitch"));
    /// The [VarHandle] of `rowPitch` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rowPitch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rowPitch"));
    /// The byte offset of `arrayPitch`.
    public static final long OFFSET_arrayPitch = LAYOUT.byteOffset(PathElement.groupElement("arrayPitch"));
    /// The memory layout of `arrayPitch`.
    public static final MemoryLayout LAYOUT_arrayPitch = LAYOUT.select(PathElement.groupElement("arrayPitch"));
    /// The [VarHandle] of `arrayPitch` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_arrayPitch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("arrayPitch"));
    /// The byte offset of `depthPitch`.
    public static final long OFFSET_depthPitch = LAYOUT.byteOffset(PathElement.groupElement("depthPitch"));
    /// The memory layout of `depthPitch`.
    public static final MemoryLayout LAYOUT_depthPitch = LAYOUT.select(PathElement.groupElement("depthPitch"));
    /// The [VarHandle] of `depthPitch` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthPitch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthPitch"));

    /// Creates `VkSubresourceLayout` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSubresourceLayout(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSubresourceLayout` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubresourceLayout of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubresourceLayout(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSubresourceLayout` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubresourceLayout ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubresourceLayout(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSubresourceLayout` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubresourceLayout ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubresourceLayout(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSubresourceLayout` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubresourceLayout`
    public static VkSubresourceLayout alloc(SegmentAllocator allocator) { return new VkSubresourceLayout(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSubresourceLayout` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubresourceLayout`
    public static VkSubresourceLayout alloc(SegmentAllocator allocator, long count) { return new VkSubresourceLayout(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSubresourceLayout copyFrom(VkSubresourceLayout src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSubresourceLayout reinterpret(long count) { return new VkSubresourceLayout(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long offset(MemorySegment segment, long index) { return (long) VH_offset.get(segment, 0L, index); }
    /// {@return `offset`}
    public long offset() { return offset(this.segment(), 0L); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void offset(MemorySegment segment, long index, long value) { VH_offset.set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubresourceLayout offset(long value) { offset(this.segment(), 0L, value); return this; }

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
    public VkSubresourceLayout size(long value) { size(this.segment(), 0L, value); return this; }

    /// {@return `rowPitch` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long rowPitch(MemorySegment segment, long index) { return (long) VH_rowPitch.get(segment, 0L, index); }
    /// {@return `rowPitch`}
    public long rowPitch() { return rowPitch(this.segment(), 0L); }
    /// Sets `rowPitch` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rowPitch(MemorySegment segment, long index, long value) { VH_rowPitch.set(segment, 0L, index, value); }
    /// Sets `rowPitch` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubresourceLayout rowPitch(long value) { rowPitch(this.segment(), 0L, value); return this; }

    /// {@return `arrayPitch` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long arrayPitch(MemorySegment segment, long index) { return (long) VH_arrayPitch.get(segment, 0L, index); }
    /// {@return `arrayPitch`}
    public long arrayPitch() { return arrayPitch(this.segment(), 0L); }
    /// Sets `arrayPitch` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void arrayPitch(MemorySegment segment, long index, long value) { VH_arrayPitch.set(segment, 0L, index, value); }
    /// Sets `arrayPitch` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubresourceLayout arrayPitch(long value) { arrayPitch(this.segment(), 0L, value); return this; }

    /// {@return `depthPitch` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long depthPitch(MemorySegment segment, long index) { return (long) VH_depthPitch.get(segment, 0L, index); }
    /// {@return `depthPitch`}
    public long depthPitch() { return depthPitch(this.segment(), 0L); }
    /// Sets `depthPitch` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthPitch(MemorySegment segment, long index, long value) { VH_depthPitch.set(segment, 0L, index, value); }
    /// Sets `depthPitch` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubresourceLayout depthPitch(long value) { depthPitch(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSubresourceLayout`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSubresourceLayout`
    public VkSubresourceLayout asSlice(long index) { return new VkSubresourceLayout(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSubresourceLayout`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSubresourceLayout`
    public VkSubresourceLayout asSlice(long index, long count) { return new VkSubresourceLayout(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSubresourceLayout` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSubresourceLayout at(long index, Consumer<VkSubresourceLayout> func) { func.accept(asSlice(index)); return this; }

    /// {@return `offset` at the given index}
    /// @param index the index of the struct buffer
    public long offsetAt(long index) { return offset(this.segment(), index); }
    /// Sets `offset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubresourceLayout offsetAt(long index, long value) { offset(this.segment(), index, value); return this; }

    /// {@return `size` at the given index}
    /// @param index the index of the struct buffer
    public long sizeAt(long index) { return size(this.segment(), index); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubresourceLayout sizeAt(long index, long value) { size(this.segment(), index, value); return this; }

    /// {@return `rowPitch` at the given index}
    /// @param index the index of the struct buffer
    public long rowPitchAt(long index) { return rowPitch(this.segment(), index); }
    /// Sets `rowPitch` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubresourceLayout rowPitchAt(long index, long value) { rowPitch(this.segment(), index, value); return this; }

    /// {@return `arrayPitch` at the given index}
    /// @param index the index of the struct buffer
    public long arrayPitchAt(long index) { return arrayPitch(this.segment(), index); }
    /// Sets `arrayPitch` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubresourceLayout arrayPitchAt(long index, long value) { arrayPitch(this.segment(), index, value); return this; }

    /// {@return `depthPitch` at the given index}
    /// @param index the index of the struct buffer
    public long depthPitchAt(long index) { return depthPitch(this.segment(), index); }
    /// Sets `depthPitch` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubresourceLayout depthPitchAt(long index, long value) { depthPitch(this.segment(), index, value); return this; }

}
