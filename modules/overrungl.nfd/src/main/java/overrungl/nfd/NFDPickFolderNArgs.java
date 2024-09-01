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

/// ## Layout
/// ```
/// struct nfdpickfoldernargs_t {
///     const nfdu8char_t* defaultPath;
///     nfdwindowhandle_t parentWindow;
/// }
/// ```
public interface NFDPickFolderNArgs extends Struct<NFDPickFolderNArgs> {
    /// The struct allocator.
    StructAllocator<NFDPickFolderNArgs> OF = new StructAllocator<>(MethodHandles.lookup(), LayoutBuilder.struct()
        .add(Unmarshal.STR_LAYOUT, "defaultPath")
        .add(NFDWindowHandle.OF.layout(), "parentWindow")
    .build());

    /// {@return `defaultPath`}
    @NativeType("const nfdu8char_t*") MemorySegment defaultPath();

    /// Sets `defaultPath` with the given value.
    /// @param defaultPath the value
    /// @return `this`
    NFDPickFolderNArgs defaultPath(@NativeType("const nfdu8char_t*") MemorySegment defaultPath);

    /// {@return `parentWindow.type`}
    @NativeType("size_t") long parentWindow$type();

    /// Sets `parentWindow.type` with the given value.
    /// @param parentWindow$type the value
    /// @return `this`
    NFDPickFolderNArgs parentWindow$type(@NativeType("size_t") long parentWindow$type);

    /// {@return `parentWindow.handle`}
    @NativeType("void*") MemorySegment parentWindow$handle();

    /// Sets `parentWindow.handle` with the given value.
    /// @param parentWindow$handle the value
    /// @return `this`
    NFDPickFolderNArgs parentWindow$handle(@NativeType("void*") MemorySegment parentWindow$handle);

}
