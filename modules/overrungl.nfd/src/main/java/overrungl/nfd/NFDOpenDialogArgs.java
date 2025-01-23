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
/// struct NFDOpenDialogArgs {
///     const nfdnfilteritem_t* filterList;
///     unsigned int filterCount;
///     const nfdnchar_t* defaultPath;
///     NFDWindowHandle parentWindow;
/// };
/// ```
public sealed class NFDOpenDialogArgs extends GroupType {
    /// The struct layout of `NFDOpenDialogArgs`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("filterList"),
        ValueLayout.JAVA_INT.withName("filterCount"),
        ValueLayout.ADDRESS.withName("defaultPath"),
        NFDWindowHandle.LAYOUT.withName("parentWindow")
    );
    /// The byte offset of `filterList`.
    public static final long OFFSET_filterList = LAYOUT.byteOffset(PathElement.groupElement("filterList"));
    /// The memory layout of `filterList`.
    public static final MemoryLayout LAYOUT_filterList = LAYOUT.select(PathElement.groupElement("filterList"));
    /// The [VarHandle] of `filterList` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_filterList = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterList"));
    /// The byte offset of `filterCount`.
    public static final long OFFSET_filterCount = LAYOUT.byteOffset(PathElement.groupElement("filterCount"));
    /// The memory layout of `filterCount`.
    public static final MemoryLayout LAYOUT_filterCount = LAYOUT.select(PathElement.groupElement("filterCount"));
    /// The [VarHandle] of `filterCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_filterCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterCount"));
    /// The byte offset of `defaultPath`.
    public static final long OFFSET_defaultPath = LAYOUT.byteOffset(PathElement.groupElement("defaultPath"));
    /// The memory layout of `defaultPath`.
    public static final MemoryLayout LAYOUT_defaultPath = LAYOUT.select(PathElement.groupElement("defaultPath"));
    /// The [VarHandle] of `defaultPath` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_defaultPath = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultPath"));
    /// The byte offset of `parentWindow`.
    public static final long OFFSET_parentWindow = LAYOUT.byteOffset(PathElement.groupElement("parentWindow"));
    /// The memory layout of `parentWindow`.
    public static final MemoryLayout LAYOUT_parentWindow = LAYOUT.select(PathElement.groupElement("parentWindow"));

    /// Creates `NFDOpenDialogArgs` with the given segment.
    /// @param segment the memory segment
    public NFDOpenDialogArgs(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `NFDOpenDialogArgs` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `NFDOpenDialogArgs` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static NFDOpenDialogArgs ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new NFDOpenDialogArgs(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `NFDOpenDialogArgs` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `NFDOpenDialogArgs` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `NFDOpenDialogArgs`
    public static NFDOpenDialogArgs alloc(SegmentAllocator allocator) { return new NFDOpenDialogArgs(allocator.allocate(LAYOUT)); }

    /// Allocates a `NFDOpenDialogArgs` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `NFDOpenDialogArgs`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public NFDOpenDialogArgs copyFrom(NFDOpenDialogArgs src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `filterList` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment filterList(MemorySegment segment, long index) { return (MemorySegment) VH_filterList.get(segment, 0L, index); }
    /// {@return `filterList`}
    public MemorySegment filterList() { return filterList(this.segment(), 0L); }
    /// Sets `filterList` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void filterList(MemorySegment segment, long index, MemorySegment value) { VH_filterList.set(segment, 0L, index, value); }
    /// Sets `filterList` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDOpenDialogArgs filterList(MemorySegment value) { filterList(this.segment(), 0L, value); return this; }

    /// {@return `filterCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int filterCount(MemorySegment segment, long index) { return (int) VH_filterCount.get(segment, 0L, index); }
    /// {@return `filterCount`}
    public int filterCount() { return filterCount(this.segment(), 0L); }
    /// Sets `filterCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void filterCount(MemorySegment segment, long index, int value) { VH_filterCount.set(segment, 0L, index, value); }
    /// Sets `filterCount` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDOpenDialogArgs filterCount(int value) { filterCount(this.segment(), 0L, value); return this; }

    /// {@return `defaultPath` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment defaultPath(MemorySegment segment, long index) { return (MemorySegment) VH_defaultPath.get(segment, 0L, index); }
    /// {@return `defaultPath`}
    public MemorySegment defaultPath() { return defaultPath(this.segment(), 0L); }
    /// Sets `defaultPath` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void defaultPath(MemorySegment segment, long index, MemorySegment value) { VH_defaultPath.set(segment, 0L, index, value); }
    /// Sets `defaultPath` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDOpenDialogArgs defaultPath(MemorySegment value) { defaultPath(this.segment(), 0L, value); return this; }

    /// {@return `parentWindow` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment parentWindow(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_parentWindow, index), LAYOUT_parentWindow); }
    /// {@return `parentWindow`}
    public MemorySegment parentWindow() { return parentWindow(this.segment(), 0L); }
    /// Sets `parentWindow` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void parentWindow(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_parentWindow, index), LAYOUT_parentWindow.byteSize()); }
    /// Sets `parentWindow` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDOpenDialogArgs parentWindow(MemorySegment value) { parentWindow(this.segment(), 0L, value); return this; }

    /// A buffer of [NFDOpenDialogArgs].
    public static final class Buffer extends NFDOpenDialogArgs {
        private final long elementCount;

        /// Creates `NFDOpenDialogArgs.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `NFDOpenDialogArgs`.
        /// @param index the index of the struct buffer
        /// @return the slice of `NFDOpenDialogArgs`
        public NFDOpenDialogArgs asSlice(long index) { return new NFDOpenDialogArgs(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `NFDOpenDialogArgs`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `NFDOpenDialogArgs`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `filterList` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment filterListAt(long index) { return filterList(this.segment(), index); }
        /// Sets `filterList` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer filterListAt(long index, MemorySegment value) { filterList(this.segment(), index, value); return this; }

        /// {@return `filterCount` at the given index}
        /// @param index the index of the struct buffer
        public int filterCountAt(long index) { return filterCount(this.segment(), index); }
        /// Sets `filterCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer filterCountAt(long index, int value) { filterCount(this.segment(), index, value); return this; }

        /// {@return `defaultPath` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment defaultPathAt(long index) { return defaultPath(this.segment(), index); }
        /// Sets `defaultPath` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer defaultPathAt(long index, MemorySegment value) { defaultPath(this.segment(), index, value); return this; }

        /// {@return `parentWindow` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment parentWindowAt(long index) { return parentWindow(this.segment(), index); }
        /// Sets `parentWindow` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer parentWindowAt(long index, MemorySegment value) { parentWindow(this.segment(), index, value); return this; }

    }
}
