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
/// ### defaultPath
/// [VarHandle][#VH_defaultPath] - [Getter][#defaultPath()] - [Setter][#defaultPath(java.lang.foreign.MemorySegment)]
/// ### parentWindow
/// [Byte offset][#OFFSET_parentWindow] - [Memory layout][#ML_parentWindow] - [Getter][#parentWindow()] - [Setter][#parentWindow(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct nfdpickfoldernargs_t {
///     const nfdnchar_t* defaultPath;
///     nfdwindowhandle_t parentWindow;
/// } NFDPickFolderArgs;
/// ```
public sealed class NFDPickFolderArgs extends Struct {
    /// The struct layout of `nfdpickfoldernargs_t`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        Unmarshal.STR_LAYOUT.withName("defaultPath"),
        overrungl.nfd.NFDWindowHandle.LAYOUT.withName("parentWindow")
    );
    /// The [VarHandle] of `defaultPath` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_defaultPath = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultPath"));
    /// The byte offset of `parentWindow`.
    public static final long OFFSET_parentWindow = LAYOUT.byteOffset(PathElement.groupElement("parentWindow"));
    /// The memory layout of `parentWindow`.
    public static final MemoryLayout ML_parentWindow = LAYOUT.select(PathElement.groupElement("parentWindow"));

    /// Creates `NFDPickFolderArgs` with the given segment.
    /// @param segment the memory segment
    public NFDPickFolderArgs(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `NFDPickFolderArgs` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static NFDPickFolderArgs of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new NFDPickFolderArgs(segment); }

    /// Creates `NFDPickFolderArgs` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `NFDPickFolderArgs` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static NFDPickFolderArgs ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new NFDPickFolderArgs(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `NFDPickFolderArgs` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `NFDPickFolderArgs` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `NFDPickFolderArgs`
    public static NFDPickFolderArgs alloc(SegmentAllocator allocator) { return new NFDPickFolderArgs(allocator.allocate(LAYOUT)); }

    /// Allocates a `NFDPickFolderArgs` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `NFDPickFolderArgs`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `NFDPickFolderArgs` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `NFDPickFolderArgs`
    public static NFDPickFolderArgs allocInit(SegmentAllocator allocator, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath, @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment parentWindow) { return alloc(allocator).defaultPath(defaultPath).parentWindow(parentWindow); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public NFDPickFolderArgs copyFrom(NFDPickFolderArgs src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `defaultPath` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment get_defaultPath(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_defaultPath.get(segment, 0L, index); }
    /// {@return `defaultPath`}
    /// @param segment the segment of the struct
    public static @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment get_defaultPath(MemorySegment segment) { return NFDPickFolderArgs.get_defaultPath(segment, 0L); }
    /// {@return `defaultPath`}
    public @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath() { return NFDPickFolderArgs.get_defaultPath(this.segment()); }
    /// Sets `defaultPath` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_defaultPath(MemorySegment segment, long index, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { VH_defaultPath.set(segment, 0L, index, value); }
    /// Sets `defaultPath` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_defaultPath(MemorySegment segment, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { NFDPickFolderArgs.set_defaultPath(segment, 0L, value); }
    /// Sets `defaultPath` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDPickFolderArgs defaultPath(@CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { NFDPickFolderArgs.set_defaultPath(this.segment(), value); return this; }

    /// {@return `parentWindow` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment get_parentWindow(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_parentWindow, index), ML_parentWindow); }
    /// {@return `parentWindow`}
    /// @param segment the segment of the struct
    public static @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment get_parentWindow(MemorySegment segment) { return NFDPickFolderArgs.get_parentWindow(segment, 0L); }
    /// {@return `parentWindow`}
    public @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment parentWindow() { return NFDPickFolderArgs.get_parentWindow(this.segment()); }
    /// Sets `parentWindow` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_parentWindow(MemorySegment segment, long index, @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_parentWindow, index), ML_parentWindow.byteSize()); }
    /// Sets `parentWindow` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_parentWindow(MemorySegment segment, @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment value) { NFDPickFolderArgs.set_parentWindow(segment, 0L, value); }
    /// Sets `parentWindow` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDPickFolderArgs parentWindow(@CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment value) { NFDPickFolderArgs.set_parentWindow(this.segment(), value); return this; }

    /// A buffer of [NFDPickFolderArgs].
    public static final class Buffer extends NFDPickFolderArgs {
        private final long elementCount;

        /// Creates `NFDPickFolderArgs.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `NFDPickFolderArgs`.
        /// @param index the index of the struct buffer
        /// @return the slice of `NFDPickFolderArgs`
        public NFDPickFolderArgs asSlice(long index) { return new NFDPickFolderArgs(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `NFDPickFolderArgs`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `NFDPickFolderArgs`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `defaultPath` at the given index}
        /// @param index the index
        public @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPathAt(long index) { return NFDPickFolderArgs.get_defaultPath(this.segment(), index); }
        /// Sets `defaultPath` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer defaultPathAt(long index, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { NFDPickFolderArgs.set_defaultPath(this.segment(), index, value); return this; }

        /// {@return `parentWindow` at the given index}
        /// @param index the index
        public @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment parentWindowAt(long index) { return NFDPickFolderArgs.get_parentWindow(this.segment(), index); }
        /// Sets `parentWindow` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer parentWindowAt(long index, @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment value) { NFDPickFolderArgs.set_parentWindow(this.segment(), index, value); return this; }

    }
}
