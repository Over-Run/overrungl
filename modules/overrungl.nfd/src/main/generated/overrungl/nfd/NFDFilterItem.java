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
/// struct NFDFilterItem {
///     const nfdnchar_t* name;
///     const nfdnchar_t* spec;
/// };
/// ```
public final class NFDFilterItem extends GroupType {
    /// The struct layout of `NFDFilterItem`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("name"),
        ValueLayout.ADDRESS.withName("spec")
    );
    /// The byte offset of `name`.
    public static final long OFFSET_name = LAYOUT.byteOffset(PathElement.groupElement("name"));
    /// The memory layout of `name`.
    public static final MemoryLayout LAYOUT_name = LAYOUT.select(PathElement.groupElement("name"));
    /// The [VarHandle] of `name` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_name = LAYOUT.arrayElementVarHandle(PathElement.groupElement("name"));
    /// The byte offset of `spec`.
    public static final long OFFSET_spec = LAYOUT.byteOffset(PathElement.groupElement("spec"));
    /// The memory layout of `spec`.
    public static final MemoryLayout LAYOUT_spec = LAYOUT.select(PathElement.groupElement("spec"));
    /// The [VarHandle] of `spec` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_spec = LAYOUT.arrayElementVarHandle(PathElement.groupElement("spec"));

    /// Creates `NFDFilterItem` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public NFDFilterItem(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `NFDFilterItem` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static NFDFilterItem of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new NFDFilterItem(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `NFDFilterItem` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static NFDFilterItem ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new NFDFilterItem(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `NFDFilterItem` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static NFDFilterItem ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new NFDFilterItem(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `NFDFilterItem` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `NFDFilterItem`
    public static NFDFilterItem alloc(SegmentAllocator allocator) { return new NFDFilterItem(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `NFDFilterItem` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `NFDFilterItem`
    public static NFDFilterItem alloc(SegmentAllocator allocator, long count) { return new NFDFilterItem(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `NFDFilterItem` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param name `name`
    /// @param spec `spec`
    /// @return the allocated `NFDFilterItem`
    public static NFDFilterItem allocInit(SegmentAllocator allocator, MemorySegment name, MemorySegment spec) {
        return alloc(allocator).name(name).spec(spec);
    }

    /// Allocates a `NFDFilterItem` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param name `name`
    /// @return the allocated `NFDFilterItem`
    public static NFDFilterItem allocInit(SegmentAllocator allocator, MemorySegment name) {
        return alloc(allocator).name(name);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public NFDFilterItem copyFrom(NFDFilterItem src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public NFDFilterItem reinterpret(long count) { return new NFDFilterItem(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `name` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment name(MemorySegment segment, long index) { return (MemorySegment) VH_name.get(segment, 0L, index); }
    /// {@return `name`}
    public MemorySegment name() { return name(this.segment(), 0L); }
    /// Sets `name` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void name(MemorySegment segment, long index, MemorySegment value) { VH_name.set(segment, 0L, index, value); }
    /// Sets `name` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDFilterItem name(MemorySegment value) { name(this.segment(), 0L, value); return this; }

    /// {@return `spec` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment spec(MemorySegment segment, long index) { return (MemorySegment) VH_spec.get(segment, 0L, index); }
    /// {@return `spec`}
    public MemorySegment spec() { return spec(this.segment(), 0L); }
    /// Sets `spec` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void spec(MemorySegment segment, long index, MemorySegment value) { VH_spec.set(segment, 0L, index, value); }
    /// Sets `spec` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDFilterItem spec(MemorySegment value) { spec(this.segment(), 0L, value); return this; }

    /// Creates a slice of `NFDFilterItem`.
    /// @param index the index of the struct buffer
    /// @return the slice of `NFDFilterItem`
    public NFDFilterItem asSlice(long index) { return new NFDFilterItem(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `NFDFilterItem`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `NFDFilterItem`
    public NFDFilterItem asSlice(long index, long count) { return new NFDFilterItem(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `NFDFilterItem` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public NFDFilterItem at(long index, Consumer<NFDFilterItem> func) { func.accept(asSlice(index)); return this; }

    /// {@return `name` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment nameAt(long index) { return name(this.segment(), index); }
    /// Sets `name` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public NFDFilterItem nameAt(long index, MemorySegment value) { name(this.segment(), index, value); return this; }

    /// {@return `spec` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment specAt(long index) { return spec(this.segment(), index); }
    /// Sets `spec` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public NFDFilterItem specAt(long index, MemorySegment value) { spec(this.segment(), index, value); return this; }

}
