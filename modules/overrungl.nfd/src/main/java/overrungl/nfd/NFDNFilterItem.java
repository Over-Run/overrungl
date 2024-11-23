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
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandles;
import overrun.marshal.LayoutBuilder;
import overrun.marshal.Unmarshal;
import overrun.marshal.gen.CType;
import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructAllocator;

/// UTF-16 Filter Item
/// 
/// ## Members
/// 
/// ### name
/// 
/// [Getter](#name()) - [Setter](#name(java.lang.foreign.MemorySegment))
/// 
/// ### spec
/// 
/// [Getter](#spec()) - [Setter](#spec(java.lang.foreign.MemorySegment))
/// 
/// ## Layout
/// 
/// ```
/// typedef struct nfdnfilteritem_t {
///     const nfdnchar_t* name;
///     const nfdnchar_t* spec;
/// } NFDNFilterItem;
/// ```
/// 
/// @see NFDHelper
public interface NFDNFilterItem extends Struct<NFDNFilterItem> {
    /// The struct allocator.
    StructAllocator<NFDNFilterItem> OF = new StructAllocator<>(MethodHandles.lookup(), LayoutBuilder.struct()
        .add(Unmarshal.STR_LAYOUT, "name")
        .add(Unmarshal.STR_LAYOUT, "spec")
        .build());
    
    @Override
    NFDNFilterItem slice(long index, long count);

    @Override
    NFDNFilterItem slice(long index);

    /// {@return `name`}
    @CType("const nfdnchar_t*")
    MemorySegment name();

    /// Sets `name` with the given value.
    /// @param name the value
    /// @return `this`
    NFDNFilterItem name(@CType("const nfdnchar_t*") MemorySegment name);

    /// {@return `spec`}
    @CType("const nfdnchar_t*")
    MemorySegment spec();

    /// Sets `spec` with the given value.
    /// @param spec the value
    /// @return `this`
    NFDNFilterItem spec(@CType("const nfdnchar_t*") MemorySegment spec);

}
