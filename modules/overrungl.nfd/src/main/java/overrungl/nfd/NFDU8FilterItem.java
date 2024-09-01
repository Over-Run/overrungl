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
import module java.base;
import module overrungl.core;

/// UTF-8 Filter Item
/// ## Layout
/// ```
/// struct nfdu8filteritem_t {
///     const nfdu8char_t* name;
///     const nfdu8char_t* spec;
/// }
/// ```
public interface NFDU8FilterItem extends Struct<NFDU8FilterItem> {
    /// The struct allocator.
    StructAllocator<NFDU8FilterItem> OF = new StructAllocator<>(MethodHandles.lookup(), LayoutBuilder.struct()
        .add(Unmarshal.STR_LAYOUT, "name")
        .add(Unmarshal.STR_LAYOUT, "spec")
    .build());

    /// {@return `name`}
    @NativeType("const nfdu8char_t*") MemorySegment name();

    /// Sets `name` with the given value.
    /// @param name the value
    /// @return `this`
    NFDU8FilterItem name(@NativeType("const nfdu8char_t*") MemorySegment name);

    /// {@return `spec`}
    @NativeType("const nfdu8char_t*") MemorySegment spec();

    /// Sets `spec` with the given value.
    /// @param spec the value
    /// @return `this`
    NFDU8FilterItem spec(@NativeType("const nfdu8char_t*") MemorySegment spec);

    static NFDU8FilterItem create(SegmentAllocator allocator, String name, String spec) {
        return OF.of(allocator).name(Marshal.marshal(allocator, name)).spec(Marshal.marshal(allocator, spec));
    }
    
    @SafeVarargs
    static NFDU8FilterItem create(SegmentAllocator allocator, Map.Entry<String, String>... entries) {
        var of = OF.of(allocator, entries.length);
        for (int i = 0; i < entries.length; i++) {
            var e = entries[i];
            of.slice(i).name(Marshal.marshal(allocator, e.getKey())).spec(Marshal.marshal(allocator, e.getValue()));
        }
        return of;
    }
}
