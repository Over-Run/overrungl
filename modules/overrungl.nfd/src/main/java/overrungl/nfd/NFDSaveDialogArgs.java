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
/// ### defaultName
/// [VarHandle][#VH_defaultName] - [Getter][#defaultName()] - [Setter][#defaultName(java.lang.foreign.MemorySegment)]
/// ### parentWindow
/// [Byte offset][#OFFSET_parentWindow] - [Memory layout][#ML_parentWindow] - [Getter][#parentWindow()] - [Setter][#parentWindow(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct nfdsavedialognargs_t {
///     const nfdnfilteritem_t* filterList;
///     nfdfiltersize_t filterCount;
///     const nfdnchar_t* defaultPath;
///     const nfdnchar_t* defaultName;
///     nfdwindowhandle_t parentWindow;
/// } NFDSaveDialogArgs;
/// ```
public sealed class NFDSaveDialogArgs extends Struct {
    /// The struct layout of `nfdsavedialognargs_t`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("filterList"),
        ValueLayout.JAVA_INT.withName("filterCount"),
        Unmarshal.STR_LAYOUT.withName("defaultPath"),
        Unmarshal.STR_LAYOUT.withName("defaultName"),
        overrungl.nfd.NFDWindowHandle.LAYOUT.withName("parentWindow")
    );
    /// The [VarHandle] of `filterList` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_filterList = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterList"));
    /// The [VarHandle] of `filterCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_filterCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterCount"));
    /// The [VarHandle] of `defaultPath` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_defaultPath = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultPath"));
    /// The [VarHandle] of `defaultName` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_defaultName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultName"));
    /// The byte offset of `parentWindow`.
    public static final long OFFSET_parentWindow = LAYOUT.byteOffset(PathElement.groupElement("parentWindow"));
    /// The memory layout of `parentWindow`.
    public static final MemoryLayout ML_parentWindow = LAYOUT.select(PathElement.groupElement("parentWindow"));

    /// Creates `NFDSaveDialogArgs` with the given segment.
    /// @param segment the memory segment
    public NFDSaveDialogArgs(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `NFDSaveDialogArgs` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static NFDSaveDialogArgs of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new NFDSaveDialogArgs(segment); }

    /// Creates `NFDSaveDialogArgs` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `NFDSaveDialogArgs` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static NFDSaveDialogArgs ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new NFDSaveDialogArgs(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `NFDSaveDialogArgs` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `NFDSaveDialogArgs` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `NFDSaveDialogArgs`
    public static NFDSaveDialogArgs alloc(SegmentAllocator allocator) { return new NFDSaveDialogArgs(allocator.allocate(LAYOUT)); }

    /// Allocates a `NFDSaveDialogArgs` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `NFDSaveDialogArgs`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `NFDSaveDialogArgs` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `NFDSaveDialogArgs`
    public static NFDSaveDialogArgs allocInit(SegmentAllocator allocator, @CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment filterList, @CType("nfdfiltersize_t") int filterCount, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultName, @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment parentWindow) { return alloc(allocator).filterList(filterList).filterCount(filterCount).defaultPath(defaultPath).defaultName(defaultName).parentWindow(parentWindow); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public NFDSaveDialogArgs copyFrom(NFDSaveDialogArgs src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `filterList` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment get_filterList(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_filterList.get(segment, 0L, index); }
    /// {@return `filterList`}
    /// @param segment the segment of the struct
    public static @CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment get_filterList(MemorySegment segment) { return NFDSaveDialogArgs.get_filterList(segment, 0L); }
    /// {@return `filterList`}
    public @CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment filterList() { return NFDSaveDialogArgs.get_filterList(this.segment()); }
    /// Sets `filterList` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_filterList(MemorySegment segment, long index, @CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment value) { VH_filterList.set(segment, 0L, index, value); }
    /// Sets `filterList` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_filterList(MemorySegment segment, @CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment value) { NFDSaveDialogArgs.set_filterList(segment, 0L, value); }
    /// Sets `filterList` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDSaveDialogArgs filterList(@CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment value) { NFDSaveDialogArgs.set_filterList(this.segment(), value); return this; }

    /// {@return `filterCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("nfdfiltersize_t") int get_filterCount(MemorySegment segment, long index) { return (int) VH_filterCount.get(segment, 0L, index); }
    /// {@return `filterCount`}
    /// @param segment the segment of the struct
    public static @CType("nfdfiltersize_t") int get_filterCount(MemorySegment segment) { return NFDSaveDialogArgs.get_filterCount(segment, 0L); }
    /// {@return `filterCount`}
    public @CType("nfdfiltersize_t") int filterCount() { return NFDSaveDialogArgs.get_filterCount(this.segment()); }
    /// Sets `filterCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_filterCount(MemorySegment segment, long index, @CType("nfdfiltersize_t") int value) { VH_filterCount.set(segment, 0L, index, value); }
    /// Sets `filterCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_filterCount(MemorySegment segment, @CType("nfdfiltersize_t") int value) { NFDSaveDialogArgs.set_filterCount(segment, 0L, value); }
    /// Sets `filterCount` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDSaveDialogArgs filterCount(@CType("nfdfiltersize_t") int value) { NFDSaveDialogArgs.set_filterCount(this.segment(), value); return this; }

    /// {@return `defaultPath` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment get_defaultPath(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_defaultPath.get(segment, 0L, index); }
    /// {@return `defaultPath`}
    /// @param segment the segment of the struct
    public static @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment get_defaultPath(MemorySegment segment) { return NFDSaveDialogArgs.get_defaultPath(segment, 0L); }
    /// {@return `defaultPath`}
    public @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath() { return NFDSaveDialogArgs.get_defaultPath(this.segment()); }
    /// Sets `defaultPath` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_defaultPath(MemorySegment segment, long index, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { VH_defaultPath.set(segment, 0L, index, value); }
    /// Sets `defaultPath` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_defaultPath(MemorySegment segment, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { NFDSaveDialogArgs.set_defaultPath(segment, 0L, value); }
    /// Sets `defaultPath` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDSaveDialogArgs defaultPath(@CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { NFDSaveDialogArgs.set_defaultPath(this.segment(), value); return this; }

    /// {@return `defaultName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment get_defaultName(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_defaultName.get(segment, 0L, index); }
    /// {@return `defaultName`}
    /// @param segment the segment of the struct
    public static @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment get_defaultName(MemorySegment segment) { return NFDSaveDialogArgs.get_defaultName(segment, 0L); }
    /// {@return `defaultName`}
    public @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultName() { return NFDSaveDialogArgs.get_defaultName(this.segment()); }
    /// Sets `defaultName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_defaultName(MemorySegment segment, long index, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { VH_defaultName.set(segment, 0L, index, value); }
    /// Sets `defaultName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_defaultName(MemorySegment segment, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { NFDSaveDialogArgs.set_defaultName(segment, 0L, value); }
    /// Sets `defaultName` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDSaveDialogArgs defaultName(@CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { NFDSaveDialogArgs.set_defaultName(this.segment(), value); return this; }

    /// {@return `parentWindow` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment get_parentWindow(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_parentWindow, index), ML_parentWindow); }
    /// {@return `parentWindow`}
    /// @param segment the segment of the struct
    public static @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment get_parentWindow(MemorySegment segment) { return NFDSaveDialogArgs.get_parentWindow(segment, 0L); }
    /// {@return `parentWindow`}
    public @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment parentWindow() { return NFDSaveDialogArgs.get_parentWindow(this.segment()); }
    /// Sets `parentWindow` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_parentWindow(MemorySegment segment, long index, @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_parentWindow, index), ML_parentWindow.byteSize()); }
    /// Sets `parentWindow` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_parentWindow(MemorySegment segment, @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment value) { NFDSaveDialogArgs.set_parentWindow(segment, 0L, value); }
    /// Sets `parentWindow` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDSaveDialogArgs parentWindow(@CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment value) { NFDSaveDialogArgs.set_parentWindow(this.segment(), value); return this; }

    /// A buffer of [NFDSaveDialogArgs].
    public static final class Buffer extends NFDSaveDialogArgs {
        private final long elementCount;

        /// Creates `NFDSaveDialogArgs.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `NFDSaveDialogArgs`.
        /// @param index the index of the struct buffer
        /// @return the slice of `NFDSaveDialogArgs`
        public NFDSaveDialogArgs asSlice(long index) { return new NFDSaveDialogArgs(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `NFDSaveDialogArgs`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `NFDSaveDialogArgs`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `filterList` at the given index}
        /// @param index the index
        public @CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment filterListAt(long index) { return NFDSaveDialogArgs.get_filterList(this.segment(), index); }
        /// Sets `filterList` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer filterListAt(long index, @CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment value) { NFDSaveDialogArgs.set_filterList(this.segment(), index, value); return this; }

        /// {@return `filterCount` at the given index}
        /// @param index the index
        public @CType("nfdfiltersize_t") int filterCountAt(long index) { return NFDSaveDialogArgs.get_filterCount(this.segment(), index); }
        /// Sets `filterCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer filterCountAt(long index, @CType("nfdfiltersize_t") int value) { NFDSaveDialogArgs.set_filterCount(this.segment(), index, value); return this; }

        /// {@return `defaultPath` at the given index}
        /// @param index the index
        public @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPathAt(long index) { return NFDSaveDialogArgs.get_defaultPath(this.segment(), index); }
        /// Sets `defaultPath` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer defaultPathAt(long index, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { NFDSaveDialogArgs.set_defaultPath(this.segment(), index, value); return this; }

        /// {@return `defaultName` at the given index}
        /// @param index the index
        public @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultNameAt(long index) { return NFDSaveDialogArgs.get_defaultName(this.segment(), index); }
        /// Sets `defaultName` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer defaultNameAt(long index, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { NFDSaveDialogArgs.set_defaultName(this.segment(), index, value); return this; }

        /// {@return `parentWindow` at the given index}
        /// @param index the index
        public @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment parentWindowAt(long index) { return NFDSaveDialogArgs.get_parentWindow(this.segment(), index); }
        /// Sets `parentWindow` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer parentWindowAt(long index, @CType("nfdwindowhandle_t") java.lang.foreign.MemorySegment value) { NFDSaveDialogArgs.set_parentWindow(this.segment(), index, value); return this; }

    }
}
