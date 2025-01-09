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
package overrungl.stb;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### read
/// [VarHandle][#VH_read] - [Getter][#read()] - [Setter][#read(java.lang.foreign.MemorySegment)]
/// ### skip
/// [VarHandle][#VH_skip] - [Getter][#skip()] - [Setter][#skip(java.lang.foreign.MemorySegment)]
/// ### eof
/// [VarHandle][#VH_eof] - [Getter][#eof()] - [Setter][#eof(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct stbi_io_callbacks {
///     <FP int (*read)(void *user,char *data,int size)> read;
///     <FP void (*skip)(void *user,int n)> skip;
///     <FP int (*eof)(void *user)> eof;
/// } STBIIOCallbacks;
/// ```
public final class STBIIOCallbacks extends Struct {
    /// The struct layout of `stbi_io_callbacks`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("read"),
        ValueLayout.ADDRESS.withName("skip"),
        ValueLayout.ADDRESS.withName("eof")
    );
    /// The [VarHandle] of `read` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_read = LAYOUT.arrayElementVarHandle(PathElement.groupElement("read"));
    /// The [VarHandle] of `skip` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_skip = LAYOUT.arrayElementVarHandle(PathElement.groupElement("skip"));
    /// The [VarHandle] of `eof` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_eof = LAYOUT.arrayElementVarHandle(PathElement.groupElement("eof"));

    /// Creates `STBIIOCallbacks` with the given segment.
    /// @param segment the memory segment
    public STBIIOCallbacks(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `STBIIOCallbacks` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBIIOCallbacks of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBIIOCallbacks(segment); }

    /// Creates `STBIIOCallbacks` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBIIOCallbacks ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new STBIIOCallbacks(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `STBIIOCallbacks` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBIIOCallbacks ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new STBIIOCallbacks(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `STBIIOCallbacks` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBIIOCallbacks`
    public static STBIIOCallbacks alloc(SegmentAllocator allocator) { return new STBIIOCallbacks(allocator.allocate(LAYOUT)); }

    /// Allocates a `STBIIOCallbacks` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBIIOCallbacks`
    public static STBIIOCallbacks alloc(SegmentAllocator allocator, long count) { return new STBIIOCallbacks(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `STBIIOCallbacks`.
    /// @param index the index of the struct buffer
    /// @return the slice of `STBIIOCallbacks`
    public STBIIOCallbacks asSlice(long index) { return new STBIIOCallbacks(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `STBIIOCallbacks`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `STBIIOCallbacks`
    public STBIIOCallbacks asSlice(long index, long count) { return new STBIIOCallbacks(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `read` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("<FP int (*read)(void *user,char *data,int size)>") java.lang.foreign.MemorySegment get_read(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_read.get(segment, 0L, index); }
    /// {@return `read`}
    /// @param segment the segment of the struct
    public static @CType("<FP int (*read)(void *user,char *data,int size)>") java.lang.foreign.MemorySegment get_read(MemorySegment segment) { return STBIIOCallbacks.get_read(segment, 0L); }
    /// {@return `read` at the given index}
    /// @param index the index
    public @CType("<FP int (*read)(void *user,char *data,int size)>") java.lang.foreign.MemorySegment readAt(long index) { return STBIIOCallbacks.get_read(this.segment(), index); }
    /// {@return `read`}
    public @CType("<FP int (*read)(void *user,char *data,int size)>") java.lang.foreign.MemorySegment read() { return STBIIOCallbacks.get_read(this.segment()); }
    /// Sets `read` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_read(MemorySegment segment, long index, @CType("<FP int (*read)(void *user,char *data,int size)>") java.lang.foreign.MemorySegment value) { VH_read.set(segment, 0L, index, value); }
    /// Sets `read` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_read(MemorySegment segment, @CType("<FP int (*read)(void *user,char *data,int size)>") java.lang.foreign.MemorySegment value) { STBIIOCallbacks.set_read(segment, 0L, value); }
    /// Sets `read` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIIOCallbacks readAt(long index, @CType("<FP int (*read)(void *user,char *data,int size)>") java.lang.foreign.MemorySegment value) { STBIIOCallbacks.set_read(this.segment(), index, value); return this; }
    /// Sets `read` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIIOCallbacks read(@CType("<FP int (*read)(void *user,char *data,int size)>") java.lang.foreign.MemorySegment value) { STBIIOCallbacks.set_read(this.segment(), value); return this; }

    /// {@return `skip` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("<FP void (*skip)(void *user,int n)>") java.lang.foreign.MemorySegment get_skip(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_skip.get(segment, 0L, index); }
    /// {@return `skip`}
    /// @param segment the segment of the struct
    public static @CType("<FP void (*skip)(void *user,int n)>") java.lang.foreign.MemorySegment get_skip(MemorySegment segment) { return STBIIOCallbacks.get_skip(segment, 0L); }
    /// {@return `skip` at the given index}
    /// @param index the index
    public @CType("<FP void (*skip)(void *user,int n)>") java.lang.foreign.MemorySegment skipAt(long index) { return STBIIOCallbacks.get_skip(this.segment(), index); }
    /// {@return `skip`}
    public @CType("<FP void (*skip)(void *user,int n)>") java.lang.foreign.MemorySegment skip() { return STBIIOCallbacks.get_skip(this.segment()); }
    /// Sets `skip` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_skip(MemorySegment segment, long index, @CType("<FP void (*skip)(void *user,int n)>") java.lang.foreign.MemorySegment value) { VH_skip.set(segment, 0L, index, value); }
    /// Sets `skip` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_skip(MemorySegment segment, @CType("<FP void (*skip)(void *user,int n)>") java.lang.foreign.MemorySegment value) { STBIIOCallbacks.set_skip(segment, 0L, value); }
    /// Sets `skip` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIIOCallbacks skipAt(long index, @CType("<FP void (*skip)(void *user,int n)>") java.lang.foreign.MemorySegment value) { STBIIOCallbacks.set_skip(this.segment(), index, value); return this; }
    /// Sets `skip` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIIOCallbacks skip(@CType("<FP void (*skip)(void *user,int n)>") java.lang.foreign.MemorySegment value) { STBIIOCallbacks.set_skip(this.segment(), value); return this; }

    /// {@return `eof` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("<FP int (*eof)(void *user)>") java.lang.foreign.MemorySegment get_eof(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_eof.get(segment, 0L, index); }
    /// {@return `eof`}
    /// @param segment the segment of the struct
    public static @CType("<FP int (*eof)(void *user)>") java.lang.foreign.MemorySegment get_eof(MemorySegment segment) { return STBIIOCallbacks.get_eof(segment, 0L); }
    /// {@return `eof` at the given index}
    /// @param index the index
    public @CType("<FP int (*eof)(void *user)>") java.lang.foreign.MemorySegment eofAt(long index) { return STBIIOCallbacks.get_eof(this.segment(), index); }
    /// {@return `eof`}
    public @CType("<FP int (*eof)(void *user)>") java.lang.foreign.MemorySegment eof() { return STBIIOCallbacks.get_eof(this.segment()); }
    /// Sets `eof` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_eof(MemorySegment segment, long index, @CType("<FP int (*eof)(void *user)>") java.lang.foreign.MemorySegment value) { VH_eof.set(segment, 0L, index, value); }
    /// Sets `eof` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_eof(MemorySegment segment, @CType("<FP int (*eof)(void *user)>") java.lang.foreign.MemorySegment value) { STBIIOCallbacks.set_eof(segment, 0L, value); }
    /// Sets `eof` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public STBIIOCallbacks eofAt(long index, @CType("<FP int (*eof)(void *user)>") java.lang.foreign.MemorySegment value) { STBIIOCallbacks.set_eof(this.segment(), index, value); return this; }
    /// Sets `eof` with the given value.
    /// @param value the value
    /// @return `this`
    public STBIIOCallbacks eof(@CType("<FP int (*eof)(void *user)>") java.lang.foreign.MemorySegment value) { STBIIOCallbacks.set_eof(this.segment(), value); return this; }

}
