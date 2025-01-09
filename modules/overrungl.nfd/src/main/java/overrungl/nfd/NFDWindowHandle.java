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
package overrungl.nfd;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### type
/// [VarHandle][#VH_type] - [Getter][#type()] - [Setter][#type(long)]
/// ### handle
/// [VarHandle][#VH_handle] - [Getter][#handle()] - [Setter][#handle(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct nfdwindowhandle_t {
///     size_t type;
///     void* handle;
/// } NFDWindowHandle;
/// ```
public final class NFDWindowHandle extends Struct {
    /// The struct layout of `nfdwindowhandle_t`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("type"),
        ValueLayout.ADDRESS.withName("handle")
    );
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The [VarHandle] of `handle` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_handle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handle"));

    /// Creates `NFDWindowHandle` with the given segment.
    /// @param segment the memory segment
    public NFDWindowHandle(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `NFDWindowHandle` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static NFDWindowHandle of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new NFDWindowHandle(segment); }

    /// Creates `NFDWindowHandle` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static NFDWindowHandle ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new NFDWindowHandle(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `NFDWindowHandle` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static NFDWindowHandle ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new NFDWindowHandle(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `NFDWindowHandle` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `NFDWindowHandle`
    public static NFDWindowHandle alloc(SegmentAllocator allocator) { return new NFDWindowHandle(allocator.allocate(LAYOUT)); }

    /// Allocates a `NFDWindowHandle` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `NFDWindowHandle`
    public static NFDWindowHandle alloc(SegmentAllocator allocator, long count) { return new NFDWindowHandle(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `NFDWindowHandle`.
    /// @param index the index of the struct buffer
    /// @return the slice of `NFDWindowHandle`
    public NFDWindowHandle asSlice(long index) { return new NFDWindowHandle(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `NFDWindowHandle`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `NFDWindowHandle`
    public NFDWindowHandle asSlice(long index, long count) { return new NFDWindowHandle(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_type(MemorySegment segment, long index) { return (long) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_type(MemorySegment segment) { return NFDWindowHandle.get_type(segment, 0L); }
    /// {@return `type` at the given index}
    /// @param index the index
    public @CType("size_t") long typeAt(long index) { return NFDWindowHandle.get_type(this.segment(), index); }
    /// {@return `type`}
    public @CType("size_t") long type() { return NFDWindowHandle.get_type(this.segment()); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_type(MemorySegment segment, long index, @CType("size_t") long value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_type(MemorySegment segment, @CType("size_t") long value) { NFDWindowHandle.set_type(segment, 0L, value); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public NFDWindowHandle typeAt(long index, @CType("size_t") long value) { NFDWindowHandle.set_type(this.segment(), index, value); return this; }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDWindowHandle type(@CType("size_t") long value) { NFDWindowHandle.set_type(this.segment(), value); return this; }

    /// {@return `handle` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void*") java.lang.foreign.MemorySegment get_handle(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_handle.get(segment, 0L, index); }
    /// {@return `handle`}
    /// @param segment the segment of the struct
    public static @CType("void*") java.lang.foreign.MemorySegment get_handle(MemorySegment segment) { return NFDWindowHandle.get_handle(segment, 0L); }
    /// {@return `handle` at the given index}
    /// @param index the index
    public @CType("void*") java.lang.foreign.MemorySegment handleAt(long index) { return NFDWindowHandle.get_handle(this.segment(), index); }
    /// {@return `handle`}
    public @CType("void*") java.lang.foreign.MemorySegment handle() { return NFDWindowHandle.get_handle(this.segment()); }
    /// Sets `handle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_handle(MemorySegment segment, long index, @CType("void*") java.lang.foreign.MemorySegment value) { VH_handle.set(segment, 0L, index, value); }
    /// Sets `handle` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_handle(MemorySegment segment, @CType("void*") java.lang.foreign.MemorySegment value) { NFDWindowHandle.set_handle(segment, 0L, value); }
    /// Sets `handle` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public NFDWindowHandle handleAt(long index, @CType("void*") java.lang.foreign.MemorySegment value) { NFDWindowHandle.set_handle(this.segment(), index, value); return this; }
    /// Sets `handle` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDWindowHandle handle(@CType("void*") java.lang.foreign.MemorySegment value) { NFDWindowHandle.set_handle(this.segment(), value); return this; }

}
