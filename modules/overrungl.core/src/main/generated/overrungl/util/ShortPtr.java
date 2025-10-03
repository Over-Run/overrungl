// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.util;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `ShortPtr`.
/// ## Layout
/// ```
/// struct ShortPtr {
///     jshort value;
/// };
/// ```
public final class ShortPtr extends GroupType {
    /// The struct layout of `ShortPtr`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_SHORT.withName("value")
    );
    /// The byte offset of `value`.
    public static final long OFFSET_value = LAYOUT.byteOffset(PathElement.groupElement("value"));
    /// The memory layout of `value`.
    public static final MemoryLayout LAYOUT_value = LAYOUT.select(PathElement.groupElement("value"));
    /// The [VarHandle] of `value` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_value = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value"));

    /// Creates `ShortPtr` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public ShortPtr(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `ShortPtr` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static ShortPtr of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new ShortPtr(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `ShortPtr` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static ShortPtr ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new ShortPtr(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `ShortPtr` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static ShortPtr ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new ShortPtr(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `ShortPtr` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `ShortPtr`
    public static ShortPtr alloc(SegmentAllocator allocator) { return new ShortPtr(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `ShortPtr` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `ShortPtr`
    public static ShortPtr alloc(SegmentAllocator allocator, long count) { return new ShortPtr(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public ShortPtr copyFrom(ShortPtr src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public ShortPtr reinterpret(long count) { return new ShortPtr(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `value` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short value(MemorySegment segment, long index) { return (short) VH_value.get(segment, 0L, index); }
    /// {@return `value`}
    public short value() { return value(this.segment(), 0L); }
    /// Sets `value` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void value(MemorySegment segment, long index, short value) { VH_value.set(segment, 0L, index, value); }
    /// Sets `value` with the given value.
    /// @param value the value
    /// @return `this`
    public ShortPtr value(short value) { value(this.segment(), 0L, value); return this; }

    /// Creates a slice of `ShortPtr`.
    /// @param index the index of the struct buffer
    /// @return the slice of `ShortPtr`
    public ShortPtr asSlice(long index) { return new ShortPtr(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `ShortPtr`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `ShortPtr`
    public ShortPtr asSlice(long index, long count) { return new ShortPtr(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `ShortPtr` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public ShortPtr at(long index, Consumer<ShortPtr> func) { func.accept(asSlice(index)); return this; }

    /// {@return `value` at the given index}
    /// @param index the index of the struct buffer
    public short valueAt(long index) { return value(this.segment(), index); }
    /// Sets `value` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public ShortPtr valueAt(long index, short value) { value(this.segment(), index, value); return this; }

}
