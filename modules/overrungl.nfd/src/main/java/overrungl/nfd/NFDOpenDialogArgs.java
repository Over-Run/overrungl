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
/// ### filterList
/// [VarHandle][#VH_filterList] - [Getter][#filterList()] - [Setter][#filterList(java.lang.foreign.MemorySegment)]
/// ### filterCount
/// [VarHandle][#VH_filterCount] - [Getter][#filterCount()] - [Setter][#filterCount(int)]
/// ### defaultPath
/// [VarHandle][#VH_defaultPath] - [Getter][#defaultPath()] - [Setter][#defaultPath(java.lang.foreign.MemorySegment)]
/// ### parentWindow
/// [Byte offset][#OFFSET_parentWindow] - [Memory layout][#ML_parentWindow] - [Getter][#parentWindow()] - [Setter][#parentWindow(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct nfdopendialognargs_t {
///     const nfdnfilteritem_t* filterList;
///     nfdfiltersize_t filterCount;
///     const nfdnchar_t* defaultPath;
///     nfdwindowhandle_t parentWindow;
/// } NFDOpenDialogArgs;
/// ```
public final class NFDOpenDialogArgs extends Struct {
    /// The struct layout of `nfdopendialognargs_t`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("filterList"),
        ValueLayout.JAVA_INT.withName("filterCount"),
        Unmarshal.STR_LAYOUT.withName("defaultPath"),
        overrungl.nfd.NFDWindowHandle.LAYOUT.withName("parentWindow")
    );
    /// The [VarHandle] of `filterList` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_filterList = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterList"));
    /// The [VarHandle] of `filterCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_filterCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterCount"));
    /// The [VarHandle] of `defaultPath` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_defaultPath = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultPath"));
    /// The byte offset of `parentWindow`.
    public static final long OFFSET_parentWindow = LAYOUT.byteOffset(PathElement.groupElement("parentWindow"));
    /// The memory layout of `parentWindow`.
    public static final MemoryLayout ML_parentWindow = LAYOUT.select(PathElement.groupElement("parentWindow"));

    /// Creates `NFDOpenDialogArgs` with the given segment.
    /// @param segment the memory segment
    public NFDOpenDialogArgs(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `NFDOpenDialogArgs` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static NFDOpenDialogArgs of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new NFDOpenDialogArgs(segment); }

    /// Allocates a `NFDOpenDialogArgs` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `NFDOpenDialogArgs`
    public static NFDOpenDialogArgs alloc(SegmentAllocator allocator) { return new NFDOpenDialogArgs(allocator.allocate(LAYOUT)); }

    /// Allocates a `NFDOpenDialogArgs` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `NFDOpenDialogArgs`
    public static NFDOpenDialogArgs alloc(SegmentAllocator allocator, long count) { return new NFDOpenDialogArgs(allocator.allocate(LAYOUT, count)); }

    /// {@return `filterList` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment get_filterList(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_filterList.get(segment, 0L, index); }
    /// {@return `filterList`}
    /// @param segment the segment of the struct
    public static @CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment get_filterList(MemorySegment segment) { return NFDOpenDialogArgs.get_filterList(segment, 0L); }
    /// {@return `filterList` at the given index}
    /// @param index the index
    public @CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment filterListAt(long index) { return NFDOpenDialogArgs.get_filterList(this.segment(), index); }
    /// {@return `filterList`}
    public @CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment filterList() { return NFDOpenDialogArgs.get_filterList(this.segment()); }
    /// Sets `filterList` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_filterList(MemorySegment segment, long index, @CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment value) { VH_filterList.set(segment, 0L, index, value); }
    /// Sets `filterList` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_filterList(MemorySegment segment, @CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment value) { NFDOpenDialogArgs.set_filterList(segment, 0L, value); }
    /// Sets `filterList` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public NFDOpenDialogArgs filterListAt(long index, @CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment value) { NFDOpenDialogArgs.set_filterList(this.segment(), index, value); return this; }
    /// Sets `filterList` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDOpenDialogArgs filterList(@CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment value) { NFDOpenDialogArgs.set_filterList(this.segment(), value); return this; }

    /// {@return `filterCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("nfdfiltersize_t") int get_filterCount(MemorySegment segment, long index) { return (int) VH_filterCount.get(segment, 0L, index); }
    /// {@return `filterCount`}
    /// @param segment the segment of the struct
    public static @CType("nfdfiltersize_t") int get_filterCount(MemorySegment segment) { return NFDOpenDialogArgs.get_filterCount(segment, 0L); }
    /// {@return `filterCount` at the given index}
    /// @param index the index
    public @CType("nfdfiltersize_t") int filterCountAt(long index) { return NFDOpenDialogArgs.get_filterCount(this.segment(), index); }
    /// {@return `filterCount`}
    public @CType("nfdfiltersize_t") int filterCount() { return NFDOpenDialogArgs.get_filterCount(this.segment()); }
    /// Sets `filterCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_filterCount(MemorySegment segment, long index, @CType("nfdfiltersize_t") int value) { VH_filterCount.set(segment, 0L, index, value); }
    /// Sets `filterCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_filterCount(MemorySegment segment, @CType("nfdfiltersize_t") int value) { NFDOpenDialogArgs.set_filterCount(segment, 0L, value); }
    /// Sets `filterCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public NFDOpenDialogArgs filterCountAt(long index, @CType("nfdfiltersize_t") int value) { NFDOpenDialogArgs.set_filterCount(this.segment(), index, value); return this; }
    /// Sets `filterCount` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDOpenDialogArgs filterCount(@CType("nfdfiltersize_t") int value) { NFDOpenDialogArgs.set_filterCount(this.segment(), value); return this; }

    /// {@return `defaultPath` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment get_defaultPath(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_defaultPath.get(segment, 0L, index); }
    /// {@return `defaultPath`}
    /// @param segment the segment of the struct
    public static @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment get_defaultPath(MemorySegment segment) { return NFDOpenDialogArgs.get_defaultPath(segment, 0L); }
    /// {@return `defaultPath` at the given index}
    /// @param index the index
    public @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPathAt(long index) { return NFDOpenDialogArgs.get_defaultPath(this.segment(), index); }
    /// {@return `defaultPath`}
    public @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath() { return NFDOpenDialogArgs.get_defaultPath(this.segment()); }
    /// Sets `defaultPath` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_defaultPath(MemorySegment segment, long index, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { VH_defaultPath.set(segment, 0L, index, value); }
    /// Sets `defaultPath` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_defaultPath(MemorySegment segment, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { NFDOpenDialogArgs.set_defaultPath(segment, 0L, value); }
    /// Sets `defaultPath` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public NFDOpenDialogArgs defaultPathAt(long index, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { NFDOpenDialogArgs.set_defaultPath(this.segment(), index, value); return this; }
    /// Sets `defaultPath` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDOpenDialogArgs defaultPath(@CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { NFDOpenDialogArgs.set_defaultPath(this.segment(), value); return this; }

    /// {@return `parentWindow` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment get_parentWindow(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_parentWindow, index), ML_parentWindow); }
    /// {@return `parentWindow`}
    /// @param segment the segment of the struct
    public static @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment get_parentWindow(MemorySegment segment) { return NFDOpenDialogArgs.get_parentWindow(segment, 0L); }
    /// {@return `parentWindow` at the given index}
    /// @param index the index
    public @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment parentWindowAt(long index) { return NFDOpenDialogArgs.get_parentWindow(this.segment(), index); }
    /// {@return `parentWindow`}
    public @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment parentWindow() { return NFDOpenDialogArgs.get_parentWindow(this.segment()); }
    /// Sets `parentWindow` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_parentWindow(MemorySegment segment, long index, @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_parentWindow, index), ML_parentWindow.byteSize()); }
    /// Sets `parentWindow` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_parentWindow(MemorySegment segment, @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment value) { NFDOpenDialogArgs.set_parentWindow(segment, 0L, value); }
    /// Sets `parentWindow` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public NFDOpenDialogArgs parentWindowAt(long index, @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment value) { NFDOpenDialogArgs.set_parentWindow(this.segment(), index, value); return this; }
    /// Sets `parentWindow` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDOpenDialogArgs parentWindow(@CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment value) { NFDOpenDialogArgs.set_parentWindow(this.segment(), value); return this; }

}
