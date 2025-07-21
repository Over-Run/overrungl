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
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct NFDSaveDialogArgs {
///     const nfdnfilteritem_t* filterList;
///     (unsigned int) nfdfiltersize_t filterCount;
///     const nfdnchar_t* defaultPath;
///     const nfdnchar_t* defaultName;
///     (struct NFDWindowHandle) nfdwindowhandle_t parentWindow;
/// };
/// ```
public final class NFDSaveDialogArgs extends GroupType {
    /// The struct layout of `NFDSaveDialogArgs`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("filterList"),
        ValueLayout.JAVA_INT.withName("filterCount"),
        ValueLayout.ADDRESS.withName("defaultPath"),
        ValueLayout.ADDRESS.withName("defaultName"),
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
    /// The byte offset of `defaultName`.
    public static final long OFFSET_defaultName = LAYOUT.byteOffset(PathElement.groupElement("defaultName"));
    /// The memory layout of `defaultName`.
    public static final MemoryLayout LAYOUT_defaultName = LAYOUT.select(PathElement.groupElement("defaultName"));
    /// The [VarHandle] of `defaultName` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_defaultName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultName"));
    /// The byte offset of `parentWindow`.
    public static final long OFFSET_parentWindow = LAYOUT.byteOffset(PathElement.groupElement("parentWindow"));
    /// The memory layout of `parentWindow`.
    public static final MemoryLayout LAYOUT_parentWindow = LAYOUT.select(PathElement.groupElement("parentWindow"));

    /// Creates `NFDSaveDialogArgs` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public NFDSaveDialogArgs(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `NFDSaveDialogArgs` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static NFDSaveDialogArgs of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new NFDSaveDialogArgs(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `NFDSaveDialogArgs` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static NFDSaveDialogArgs ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new NFDSaveDialogArgs(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `NFDSaveDialogArgs` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static NFDSaveDialogArgs ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new NFDSaveDialogArgs(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `NFDSaveDialogArgs` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `NFDSaveDialogArgs`
    public static NFDSaveDialogArgs alloc(SegmentAllocator allocator) { return new NFDSaveDialogArgs(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `NFDSaveDialogArgs` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `NFDSaveDialogArgs`
    public static NFDSaveDialogArgs alloc(SegmentAllocator allocator, long count) { return new NFDSaveDialogArgs(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `NFDSaveDialogArgs` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param filterList `filterList`
    /// @param filterCount `filterCount`
    /// @param defaultPath `defaultPath`
    /// @param defaultName `defaultName`
    /// @param parentWindow `parentWindow`
    /// @return the allocated `NFDSaveDialogArgs`
    public static NFDSaveDialogArgs allocInit(SegmentAllocator allocator, MemorySegment filterList, int filterCount, MemorySegment defaultPath, MemorySegment defaultName, MemorySegment parentWindow) {
        return alloc(allocator).filterList(filterList).filterCount(filterCount).defaultPath(defaultPath).defaultName(defaultName).parentWindow(parentWindow);
    }

    /// Allocates a `NFDSaveDialogArgs` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param filterList `filterList`
    /// @param filterCount `filterCount`
    /// @param defaultPath `defaultPath`
    /// @param defaultName `defaultName`
    /// @return the allocated `NFDSaveDialogArgs`
    public static NFDSaveDialogArgs allocInit(SegmentAllocator allocator, MemorySegment filterList, int filterCount, MemorySegment defaultPath, MemorySegment defaultName) {
        return alloc(allocator).filterList(filterList).filterCount(filterCount).defaultPath(defaultPath).defaultName(defaultName);
    }

    /// Allocates a `NFDSaveDialogArgs` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param filterList `filterList`
    /// @param filterCount `filterCount`
    /// @param defaultPath `defaultPath`
    /// @return the allocated `NFDSaveDialogArgs`
    public static NFDSaveDialogArgs allocInit(SegmentAllocator allocator, MemorySegment filterList, int filterCount, MemorySegment defaultPath) {
        return alloc(allocator).filterList(filterList).filterCount(filterCount).defaultPath(defaultPath);
    }

    /// Allocates a `NFDSaveDialogArgs` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param filterList `filterList`
    /// @param filterCount `filterCount`
    /// @return the allocated `NFDSaveDialogArgs`
    public static NFDSaveDialogArgs allocInit(SegmentAllocator allocator, MemorySegment filterList, int filterCount) {
        return alloc(allocator).filterList(filterList).filterCount(filterCount);
    }

    /// Allocates a `NFDSaveDialogArgs` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param filterList `filterList`
    /// @return the allocated `NFDSaveDialogArgs`
    public static NFDSaveDialogArgs allocInit(SegmentAllocator allocator, MemorySegment filterList) {
        return alloc(allocator).filterList(filterList);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public NFDSaveDialogArgs copyFrom(NFDSaveDialogArgs src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public NFDSaveDialogArgs reinterpret(long count) { return new NFDSaveDialogArgs(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public NFDSaveDialogArgs filterList(MemorySegment value) { filterList(this.segment(), 0L, value); return this; }

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
    public NFDSaveDialogArgs filterCount(int value) { filterCount(this.segment(), 0L, value); return this; }

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
    public NFDSaveDialogArgs defaultPath(MemorySegment value) { defaultPath(this.segment(), 0L, value); return this; }

    /// {@return `defaultName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment defaultName(MemorySegment segment, long index) { return (MemorySegment) VH_defaultName.get(segment, 0L, index); }
    /// {@return `defaultName`}
    public MemorySegment defaultName() { return defaultName(this.segment(), 0L); }
    /// Sets `defaultName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void defaultName(MemorySegment segment, long index, MemorySegment value) { VH_defaultName.set(segment, 0L, index, value); }
    /// Sets `defaultName` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDSaveDialogArgs defaultName(MemorySegment value) { defaultName(this.segment(), 0L, value); return this; }

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
    public NFDSaveDialogArgs parentWindow(MemorySegment value) { parentWindow(this.segment(), 0L, value); return this; }
    /// Accepts `parentWindow` with the given function.
    /// @param func the function
    /// @return `this`
    public NFDSaveDialogArgs parentWindow(Consumer<NFDWindowHandle> func) { func.accept(NFDWindowHandle.of(parentWindow())); return this; }

    /// Creates a slice of `NFDSaveDialogArgs`.
    /// @param index the index of the struct buffer
    /// @return the slice of `NFDSaveDialogArgs`
    public NFDSaveDialogArgs asSlice(long index) { return new NFDSaveDialogArgs(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `NFDSaveDialogArgs`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `NFDSaveDialogArgs`
    public NFDSaveDialogArgs asSlice(long index, long count) { return new NFDSaveDialogArgs(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `NFDSaveDialogArgs` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public NFDSaveDialogArgs at(long index, Consumer<NFDSaveDialogArgs> func) { func.accept(asSlice(index)); return this; }

    /// {@return `filterList` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment filterListAt(long index) { return filterList(this.segment(), index); }
    /// Sets `filterList` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public NFDSaveDialogArgs filterListAt(long index, MemorySegment value) { filterList(this.segment(), index, value); return this; }

    /// {@return `filterCount` at the given index}
    /// @param index the index of the struct buffer
    public int filterCountAt(long index) { return filterCount(this.segment(), index); }
    /// Sets `filterCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public NFDSaveDialogArgs filterCountAt(long index, int value) { filterCount(this.segment(), index, value); return this; }

    /// {@return `defaultPath` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment defaultPathAt(long index) { return defaultPath(this.segment(), index); }
    /// Sets `defaultPath` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public NFDSaveDialogArgs defaultPathAt(long index, MemorySegment value) { defaultPath(this.segment(), index, value); return this; }

    /// {@return `defaultName` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment defaultNameAt(long index) { return defaultName(this.segment(), index); }
    /// Sets `defaultName` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public NFDSaveDialogArgs defaultNameAt(long index, MemorySegment value) { defaultName(this.segment(), index, value); return this; }

    /// {@return `parentWindow` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment parentWindowAt(long index) { return parentWindow(this.segment(), index); }
    /// Sets `parentWindow` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public NFDSaveDialogArgs parentWindowAt(long index, MemorySegment value) { parentWindow(this.segment(), index, value); return this; }
    /// Accepts `parentWindow` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public NFDSaveDialogArgs parentWindowAt(long index, Consumer<NFDWindowHandle> func) { func.accept(NFDWindowHandle.of(parentWindowAt(index))); return this; }

}
