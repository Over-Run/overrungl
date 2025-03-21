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
/// struct NFDPathSetEnum {
///     void* ptr;
/// };
/// ```
public sealed class NFDPathSetEnum extends GroupType {
    /// The struct layout of `NFDPathSetEnum`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("ptr")
    );
    /// The byte offset of `ptr`.
    public static final long OFFSET_ptr = LAYOUT.byteOffset(PathElement.groupElement("ptr"));
    /// The memory layout of `ptr`.
    public static final MemoryLayout LAYOUT_ptr = LAYOUT.select(PathElement.groupElement("ptr"));
    /// The [VarHandle] of `ptr` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_ptr = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ptr"));

    /// Creates `NFDPathSetEnum` with the given segment.
    /// @param segment the memory segment
    public NFDPathSetEnum(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `NFDPathSetEnum` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `NFDPathSetEnum` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static NFDPathSetEnum ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new NFDPathSetEnum(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `NFDPathSetEnum` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `NFDPathSetEnum` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `NFDPathSetEnum`
    public static NFDPathSetEnum alloc(SegmentAllocator allocator) { return new NFDPathSetEnum(allocator.allocate(LAYOUT)); }

    /// Allocates a `NFDPathSetEnum` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `NFDPathSetEnum`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public NFDPathSetEnum copyFrom(NFDPathSetEnum src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `ptr` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment ptr(MemorySegment segment, long index) { return (MemorySegment) VH_ptr.get(segment, 0L, index); }
    /// {@return `ptr`}
    public MemorySegment ptr() { return ptr(this.segment(), 0L); }
    /// Sets `ptr` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ptr(MemorySegment segment, long index, MemorySegment value) { VH_ptr.set(segment, 0L, index, value); }
    /// Sets `ptr` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDPathSetEnum ptr(MemorySegment value) { ptr(this.segment(), 0L, value); return this; }

    /// A buffer of [NFDPathSetEnum].
    public static final class Buffer extends NFDPathSetEnum {
        private final long elementCount;

        /// Creates `NFDPathSetEnum.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `NFDPathSetEnum`.
        /// @param index the index of the struct buffer
        /// @return the slice of `NFDPathSetEnum`
        public NFDPathSetEnum asSlice(long index) { return new NFDPathSetEnum(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `NFDPathSetEnum`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `NFDPathSetEnum`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `ptr` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment ptrAt(long index) { return ptr(this.segment(), index); }
        /// Sets `ptr` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer ptrAt(long index, MemorySegment value) { ptr(this.segment(), index, value); return this; }

    }
}
