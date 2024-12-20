/*
 * MIT License
 * 
 * Copyright (c) 2022-2024 Overrun Organization
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

/// The native window handle.
/// 
/// If using a platform abstraction framework (e.g. SDL2), this should be
/// obtained using the corresponding NFD glue header (e.g. nfd_sdl2.h).
///
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

    /// Allocates a `NFDWindowHandle` with the given segment allocator.
    /// @param allocator the segment allocator
    public NFDWindowHandle(SegmentAllocator allocator) { this(allocator.allocate(LAYOUT)); }

    /// Allocates a `NFDWindowHandle` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    public NFDWindowHandle(SegmentAllocator allocator, long count) { this(allocator.allocate(LAYOUT, count)); }

    /// {@return `type` at the given index}
    /// @param index the index
    public @CType("size_t") long typeAt(long index) { return (long) VH_type.get(this.segment(), 0L, index); }
    /// {@return `type`}
    public @CType("size_t") long type() { return this.typeAt(0L); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public NFDWindowHandle typeAt(long index, @CType("size_t") long value) { VH_type.set(this.segment(), 0L, index, value); return this; }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDWindowHandle type(@CType("size_t") long value) { return this.typeAt(0L, value); }

    /// {@return `handle` at the given index}
    /// @param index the index
    public @CType("void*") java.lang.foreign.MemorySegment handleAt(long index) { return (java.lang.foreign.MemorySegment) VH_handle.get(this.segment(), 0L, index); }
    /// {@return `handle`}
    public @CType("void*") java.lang.foreign.MemorySegment handle() { return this.handleAt(0L); }
    /// Sets `handle` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public NFDWindowHandle handleAt(long index, @CType("void*") java.lang.foreign.MemorySegment value) { VH_handle.set(this.segment(), 0L, index, value); return this; }
    /// Sets `handle` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDWindowHandle handle(@CType("void*") java.lang.foreign.MemorySegment value) { return this.handleAt(0L, value); }

}
