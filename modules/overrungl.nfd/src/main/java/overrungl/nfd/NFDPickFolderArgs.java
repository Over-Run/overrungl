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

/// ## Members
/// ### defaultPath
/// [VarHandle][#VH_defaultPath] - [Getter][#defaultPath()] - [Setter][#defaultPath(java.lang.foreign.MemorySegment)]
/// ### parentWindow
/// [Byte offset][#OFFSET_parentWindow] - [Getter][#parentWindow()] - [Setter][#parentWindow(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct nfdpickfoldernargs_t {
///     const nfdnchar_t* defaultPath;
///     nfdwindowhandle_t parentWindow;
/// } NFDPickFolderArgs;
/// ```
public final class NFDPickFolderArgs extends Struct {
    /// The struct layout of `nfdpickfoldernargs_t`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        Unmarshal.STR_LAYOUT.withName("defaultPath"), 
        overrungl.nfd.NFDWindowHandle.LAYOUT.withName("parentWindow")
    );
    /// The [VarHandle] of `defaultPath` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_defaultPath = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultPath"));
    /// The byte offset of `parentWindow`.
    public static final long OFFSET_parentWindow = LAYOUT.byteOffset(PathElement.groupElement("parentWindow"));

    /// Creates `NFDPickFolderArgs` with the given segment.
    /// @param segment the memory segment
    public NFDPickFolderArgs(MemorySegment segment) { super(segment, LAYOUT); }

    /// Allocates a `NFDPickFolderArgs` with the given segment allocator.
    /// @param allocator the segment allocator
    public NFDPickFolderArgs(SegmentAllocator allocator) { this(allocator.allocate(LAYOUT)); }

    /// Allocates a `NFDPickFolderArgs` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    public NFDPickFolderArgs(SegmentAllocator allocator, long count) { this(allocator.allocate(LAYOUT, count)); }

    /// {@return `defaultPath` at the given index}
    /// @param index the index
    public @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPathAt(long index) { return (java.lang.foreign.MemorySegment) VH_defaultPath.get(this.segment(), 0L, index); }
    /// {@return `defaultPath`}
    public @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath() { return this.defaultPathAt(0L); }
    /// Sets `defaultPath` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public NFDPickFolderArgs defaultPathAt(long index, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { VH_defaultPath.set(this.segment(), 0L, index, value); return this; }
    /// Sets `defaultPath` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDPickFolderArgs defaultPath(@CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { return this.defaultPathAt(0L, value); }

    /// {@return `parentWindow` at the given index}
    /// @param index the index
    public @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment parentWindowAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_parentWindow, index), overrungl.nfd.NFDWindowHandle.LAYOUT); }
    /// {@return `parentWindow`}
    public @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment parentWindow() { return this.parentWindowAt(0L); }
    /// Sets `parentWindow` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public NFDPickFolderArgs parentWindowAt(long index, @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, this.segment(), LAYOUT.scale(OFFSET_parentWindow, index), value.byteSize()); return this; }
    /// Sets `parentWindow` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDPickFolderArgs parentWindow(@CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment value) { return this.parentWindowAt(0L, value); }

}
