// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.nfd;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `NFDWindowHandle`.
/// ## Layout
/// ```
/// struct NFDWindowHandle {
///     size_t type;
///     void* handle;
/// };
/// ```
public final class NFDWindowHandle extends GroupType {
    /// The struct layout of `NFDWindowHandle`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        CanonicalTypes.SIZE_T.withName("type"),
        ValueLayout.ADDRESS.withName("handle")
    );
    /// The byte offset of `type`.
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    /// The memory layout of `type`.
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_type = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("type")));
    /// The byte offset of `handle`.
    public static final long OFFSET_handle = LAYOUT.byteOffset(PathElement.groupElement("handle"));
    /// The memory layout of `handle`.
    public static final MemoryLayout LAYOUT_handle = LAYOUT.select(PathElement.groupElement("handle"));
    /// The [VarHandle] of `handle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_handle = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("handle")));

    /// Creates `NFDWindowHandle` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public NFDWindowHandle(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `NFDWindowHandle` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static NFDWindowHandle of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new NFDWindowHandle(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `NFDWindowHandle` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static NFDWindowHandle ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new NFDWindowHandle(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `NFDWindowHandle` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static NFDWindowHandle ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new NFDWindowHandle(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `NFDWindowHandle` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `NFDWindowHandle`
    public static NFDWindowHandle alloc(SegmentAllocator allocator) { return new NFDWindowHandle(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `NFDWindowHandle` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `NFDWindowHandle`
    public static NFDWindowHandle alloc(SegmentAllocator allocator, long count) { return new NFDWindowHandle(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public NFDWindowHandle copyFrom(NFDWindowHandle src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public NFDWindowHandle reinterpret(long count) { return new NFDWindowHandle(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long type(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_type.get().get(segment, 0L, index)); }
    /// {@return `type`}
    public long type() { return type(this.segment(), 0L); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void type(MemorySegment segment, long index, long value) { VH_type.get().set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDWindowHandle type(long value) { type(this.segment(), 0L, value); return this; }

    /// {@return `handle` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment handle(MemorySegment segment, long index) { return (MemorySegment) VH_handle.get().get(segment, 0L, index); }
    /// {@return `handle`}
    public MemorySegment handle() { return handle(this.segment(), 0L); }
    /// Sets `handle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void handle(MemorySegment segment, long index, MemorySegment value) { VH_handle.get().set(segment, 0L, index, value); }
    /// Sets `handle` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDWindowHandle handle(MemorySegment value) { handle(this.segment(), 0L, value); return this; }

    /// Creates a slice of `NFDWindowHandle`.
    /// @param index the index of the struct buffer
    /// @return the slice of `NFDWindowHandle`
    public NFDWindowHandle asSlice(long index) { return new NFDWindowHandle(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `NFDWindowHandle`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `NFDWindowHandle`
    public NFDWindowHandle asSlice(long index, long count) { return new NFDWindowHandle(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `NFDWindowHandle` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public NFDWindowHandle at(long index, Consumer<NFDWindowHandle> func) { func.accept(asSlice(index)); return this; }

    /// {@return `type` at the given index}
    /// @param index the index of the struct buffer
    public long typeAt(long index) { return type(this.segment(), index); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public NFDWindowHandle typeAt(long index, long value) { type(this.segment(), index, value); return this; }

    /// {@return `handle` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment handleAt(long index) { return handle(this.segment(), index); }
    /// Sets `handle` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public NFDWindowHandle handleAt(long index, MemorySegment value) { handle(this.segment(), index, value); return this; }

}
