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
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandles;
import overrun.marshal.CanonicalLayouts;
import overrun.marshal.LayoutBuilder;
import overrun.marshal.gen.CType;
import overrun.marshal.gen.CanonicalType;
import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructAllocator;

/// The native window handle.  If using a platform abstraction framework (e.g. SDL2), this should be
/// obtained using the corresponding NFD glue header (e.g. nfd_sdl2.h).
/// 
/// ## Members
/// 
/// ### type
/// 
/// [Getter](#type()) - [Setter](#type(long))
/// 
/// ### handle
/// 
/// [Getter](#handle()) - [Setter](#handle(java.lang.foreign.MemorySegment))
/// 
/// ## Layout
/// 
/// ```
/// typedef struct nfdwindowhandle_t {
///     size_t type;
///     void* handle;
/// } NFDWindowHandle;
/// ```
/// 
public interface NFDWindowHandle extends Struct<NFDWindowHandle> {
    /// The struct allocator.
    StructAllocator<NFDWindowHandle> OF = new StructAllocator<>(MethodHandles.lookup(), LayoutBuilder.struct()
        .add(CanonicalLayouts.SIZE_T, "type")
        .add(ValueLayout.ADDRESS, "handle")
        .build());
    
    @Override
    NFDWindowHandle slice(long index, long count);

    @Override
    NFDWindowHandle slice(long index);

    /// {@return `type`}
    @CType("size_t")
    @CanonicalType("size_t")
    long type();

    /// Sets `type` with the given value.
    /// @param type the value
    /// @return `this`
    NFDWindowHandle type(@CType("size_t") @CanonicalType("size_t") long type);

    /// {@return `handle`}
    @CType("void*")
    MemorySegment handle();

    /// Sets `handle` with the given value.
    /// @param handle the value
    /// @return `this`
    NFDWindowHandle handle(@CType("void*") MemorySegment handle);

}
