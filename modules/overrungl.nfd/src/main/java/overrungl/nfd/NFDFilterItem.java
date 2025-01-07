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
/// ### name
/// [VarHandle][#VH_name] - [Getter][#name()] - [Setter][#name(java.lang.foreign.MemorySegment)]
/// ### spec
/// [VarHandle][#VH_spec] - [Getter][#spec()] - [Setter][#spec(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct nfdnfilteritem_t {
///     const nfdnchar_t* name;
///     const nfdnchar_t* spec;
/// } NFDFilterItem;
/// ```
public final class NFDFilterItem extends Struct {
    /// The struct layout of `nfdnfilteritem_t`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        Unmarshal.STR_LAYOUT.withName("name"),
        Unmarshal.STR_LAYOUT.withName("spec")
    );
    /// The [VarHandle] of `name` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_name = LAYOUT.arrayElementVarHandle(PathElement.groupElement("name"));
    /// The [VarHandle] of `spec` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_spec = LAYOUT.arrayElementVarHandle(PathElement.groupElement("spec"));

    /// Creates `NFDFilterItem` with the given segment.
    /// @param segment the memory segment
    public NFDFilterItem(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `NFDFilterItem` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static NFDFilterItem of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new NFDFilterItem(segment); }

    /// Allocates a `NFDFilterItem` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `NFDFilterItem`
    public static NFDFilterItem alloc(SegmentAllocator allocator) { return new NFDFilterItem(allocator.allocate(LAYOUT)); }

    /// Allocates a `NFDFilterItem` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `NFDFilterItem`
    public static NFDFilterItem alloc(SegmentAllocator allocator, long count) { return new NFDFilterItem(allocator.allocate(LAYOUT, count)); }

    /// {@return `name` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment get_name(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_name.get(segment, 0L, index); }
    /// {@return `name`}
    /// @param segment the segment of the struct
    public static @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment get_name(MemorySegment segment) { return NFDFilterItem.get_name(segment, 0L); }
    /// {@return `name` at the given index}
    /// @param index the index
    public @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment nameAt(long index) { return NFDFilterItem.get_name(this.segment(), index); }
    /// {@return `name`}
    public @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment name() { return NFDFilterItem.get_name(this.segment()); }
    /// Sets `name` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_name(MemorySegment segment, long index, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { VH_name.set(segment, 0L, index, value); }
    /// Sets `name` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_name(MemorySegment segment, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { NFDFilterItem.set_name(segment, 0L, value); }
    /// Sets `name` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public NFDFilterItem nameAt(long index, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { NFDFilterItem.set_name(this.segment(), index, value); return this; }
    /// Sets `name` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDFilterItem name(@CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { NFDFilterItem.set_name(this.segment(), value); return this; }

    /// {@return `spec` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment get_spec(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_spec.get(segment, 0L, index); }
    /// {@return `spec`}
    /// @param segment the segment of the struct
    public static @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment get_spec(MemorySegment segment) { return NFDFilterItem.get_spec(segment, 0L); }
    /// {@return `spec` at the given index}
    /// @param index the index
    public @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment specAt(long index) { return NFDFilterItem.get_spec(this.segment(), index); }
    /// {@return `spec`}
    public @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment spec() { return NFDFilterItem.get_spec(this.segment()); }
    /// Sets `spec` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_spec(MemorySegment segment, long index, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { VH_spec.set(segment, 0L, index, value); }
    /// Sets `spec` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_spec(MemorySegment segment, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { NFDFilterItem.set_spec(segment, 0L, value); }
    /// Sets `spec` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public NFDFilterItem specAt(long index, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { NFDFilterItem.set_spec(this.segment(), index, value); return this; }
    /// Sets `spec` with the given value.
    /// @param value the value
    /// @return `this`
    public NFDFilterItem spec(@CType("const nfdnchar_t*") java.lang.foreign.MemorySegment value) { NFDFilterItem.set_spec(this.segment(), value); return this; }

    public static NFDFilterItem create(SegmentAllocator allocator, String name, String spec) {
        return alloc(allocator).name(NFDInternal.marshalString(allocator, name)).spec(NFDInternal.marshalString(allocator, spec));
    }
    
    @SafeVarargs
    public static NFDFilterItem create(SegmentAllocator allocator, java.util.Map.Entry<String, String>... entries) {
        var of = alloc(allocator, entries.length);
        for (int i = 0; i < entries.length; i++) {
            var e = entries[i];
            of.nameAt(i, NFDInternal.marshalString(allocator, e.getKey())).specAt(i, NFDInternal.marshalString(allocator, e.getValue()));
        }
        return of;
    }
}
