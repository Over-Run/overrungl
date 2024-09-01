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

/// The native window handle.  If using a platform abstraction framework (e.g. SDL2), this should be
/// obtained using the corresponding NFD glue header (e.g. nfd_sdl2.h).
/// ## Layout
/// ```
/// struct nfdwindowhandle_t {
///     size_t type;
///     void* handle;
/// }
/// ```
public interface NFDWindowHandle extends Struct<NFDWindowHandle> {
    /// The struct allocator.
    StructAllocator<NFDWindowHandle> OF = new StructAllocator<>(MethodHandles.lookup(), LayoutBuilder.struct()
        .add(PlatformLayouts.SIZE_T, "type")
        .add(ValueLayout.ADDRESS, "handle")
    .build());

    /// {@return `type`}
    @NativeType("size_t") long type();

    /// Sets `type` with the given value.
    /// @param type the value
    /// @return `this`
    NFDWindowHandle type(@NativeType("size_t") long type);

    /// {@return `handle`}
    @NativeType("void*") MemorySegment handle();

    /// Sets `handle` with the given value.
    /// @param handle the value
    /// @return `this`
    NFDWindowHandle handle(@NativeType("void*") MemorySegment handle);

}
