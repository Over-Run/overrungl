/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.nfd;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct NFDWindowHandle {
///     size_t type;
///     void* handle;
/// };
/// ```
public sealed class NFDWindowHandle extends GroupType {
    /// The struct layout of `NFDWindowHandle`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        CanonicalTypes.SIZE_T.withName("type"),
        ValueLayout.ADDRESS.withName("handle")
    );
    /// The byte offset of `type`.
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    /// The memory layout of `type`.
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The byte offset of `handle`.
    public static final long OFFSET_handle = LAYOUT.byteOffset(PathElement.groupElement("handle"));
    /// The memory layout of `handle`.
    public static final MemoryLayout LAYOUT_handle = LAYOUT.select(PathElement.groupElement("handle"));
    /// The [VarHandle] of `handle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_handle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handle"));

    /// Creates `NFDWindowHandle` with the given segment.
    /// @param segment the memory segment
    public NFDWindowHandle(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `NFDWindowHandle` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `NFDWindowHandle` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static NFDWindowHandle ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new NFDWindowHandle(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `NFDWindowHandle` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `NFDWindowHandle` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `NFDWindowHandle`
    public static NFDWindowHandle alloc(SegmentAllocator allocator) { return new NFDWindowHandle(allocator.allocate(LAYOUT)); }

    /// Allocates a `NFDWindowHandle` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `NFDWindowHandle`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `NFDWindowHandle` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param type `type`
    /// @param handle `handle`
    /// @return the allocated `NFDWindowHandle`
    public static NFDWindowHandle allocInit(SegmentAllocator allocator, long type, MemorySegment handle) {
        return alloc(allocator).type(type).handle(handle);
    }

    /// Allocates a `NFDWindowHandle` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param type `type`
    /// @return the allocated `NFDWindowHandle`
    public static NFDWindowHandle allocInit(SegmentAllocator allocator, long type) {
        return alloc(allocator).type(type);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public NFDWindowHandle copyFrom(NFDWindowHandle src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long type(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_type.get(segment, 0L, index)); }
    /// {@return `type`}
    public long type() { return type(this.segment(), 0L); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void type(MemorySegment segment, long index, long value) { VH_type.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDWindowHandle type(long value) { type(this.segment(), 0L, value); return this; }

    /// {@return `handle` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment handle(MemorySegment segment, long index) { return (MemorySegment) VH_handle.get(segment, 0L, index); }
    /// {@return `handle`}
    public MemorySegment handle() { return handle(this.segment(), 0L); }
    /// Sets `handle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void handle(MemorySegment segment, long index, MemorySegment value) { VH_handle.set(segment, 0L, index, value); }
    /// Sets `handle` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDWindowHandle handle(MemorySegment value) { handle(this.segment(), 0L, value); return this; }

    /// A buffer of [NFDWindowHandle].
    public static final class Buffer extends NFDWindowHandle {
        private final long elementCount;

        /// Creates `NFDWindowHandle.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `NFDWindowHandle`.
        /// @param index the index of the struct buffer
        /// @return the slice of `NFDWindowHandle`
        public NFDWindowHandle asSlice(long index) { return new NFDWindowHandle(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `NFDWindowHandle`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `NFDWindowHandle`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `type` at the given index}
        /// @param index the index of the struct buffer
        public long typeAt(long index) { return type(this.segment(), index); }
        /// Sets `type` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer typeAt(long index, long value) { type(this.segment(), index, value); return this; }

        /// {@return `handle` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment handleAt(long index) { return handle(this.segment(), index); }
        /// Sets `handle` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer handleAt(long index, MemorySegment value) { handle(this.segment(), index, value); return this; }

    }
}
