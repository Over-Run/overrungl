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
import overrun.marshal.Unmarshal;
import overrun.marshal.gen.CType;
import overrun.marshal.gen.CanonicalType;
import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructAllocator;
import overrungl.nfd.NFDWindowHandle;

/// ## Members
/// 
/// ### filterList
/// 
/// [Getter](#filterList()) - [Setter](#filterList(java.lang.foreign.MemorySegment))
/// 
/// ### filterCount
/// 
/// [Getter](#filterCount()) - [Setter](#filterCount(int))
/// 
/// ### defaultPath
/// 
/// [Getter](#defaultPath()) - [Setter](#defaultPath(java.lang.foreign.MemorySegment))
/// 
/// ### defaultName
/// 
/// [Getter](#defaultName()) - [Setter](#defaultName(java.lang.foreign.MemorySegment))
/// 
/// ### parentWindow
/// 
/// Definition of [overrungl.nfd.NFDWindowHandle]
/// 
/// ## Layout
/// 
/// ```
/// typedef struct nfdsavedialogu8args_t {
///     const nfdu8filteritem_t* filterList;
///     nfdfiltersize_t filterCount;
///     const nfdu8char_t* defaultPath;
///     const nfdu8char_t* defaultName;
///     nfdwindowhandle_t parentWindow;
/// } NFDSaveDialogU8Args;
/// ```
/// 
public interface NFDSaveDialogU8Args extends Struct<NFDSaveDialogU8Args> {
    /// The struct allocator.
    StructAllocator<NFDSaveDialogU8Args> OF = new StructAllocator<>(MethodHandles.lookup(), LayoutBuilder.struct()
        .add(ValueLayout.ADDRESS, "filterList")
        .add(CanonicalLayouts.INT, "filterCount")
        .add(Unmarshal.STR_LAYOUT, "defaultPath")
        .add(Unmarshal.STR_LAYOUT, "defaultName")
        .add(NFDWindowHandle.OF.layout(), "parentWindow")
        .build());
    
    @Override
    NFDSaveDialogU8Args slice(long index, long count);

    @Override
    NFDSaveDialogU8Args slice(long index);

    /// {@return `filterList`}
    @CType("const nfdu8filteritem_t*")
    MemorySegment filterList();

    /// Sets `filterList` with the given value.
    /// @param filterList the value
    /// @return `this`
    NFDSaveDialogU8Args filterList(@CType("const nfdu8filteritem_t*") MemorySegment filterList);

    /// {@return `filterCount`}
    @CType("nfdfiltersize_t")
    @CanonicalType("int")
    int filterCount();

    /// Sets `filterCount` with the given value.
    /// @param filterCount the value
    /// @return `this`
    NFDSaveDialogU8Args filterCount(@CType("nfdfiltersize_t") @CanonicalType("int") int filterCount);

    /// {@return `defaultPath`}
    @CType("const nfdu8char_t*")
    MemorySegment defaultPath();

    /// Sets `defaultPath` with the given value.
    /// @param defaultPath the value
    /// @return `this`
    NFDSaveDialogU8Args defaultPath(@CType("const nfdu8char_t*") MemorySegment defaultPath);

    /// {@return `defaultName`}
    @CType("const nfdu8char_t*")
    MemorySegment defaultName();

    /// Sets `defaultName` with the given value.
    /// @param defaultName the value
    /// @return `this`
    NFDSaveDialogU8Args defaultName(@CType("const nfdu8char_t*") MemorySegment defaultName);

    /// {@return `parentWindow$type`}
    @CType("size_t")
    @CanonicalType("size_t")
    long parentWindow$type();

    /// Sets `parentWindow$type` with the given value.
    /// @param parentWindow$type the value
    /// @return `this`
    NFDSaveDialogU8Args parentWindow$type(@CType("size_t") @CanonicalType("size_t") long parentWindow$type);

    /// {@return `parentWindow$handle`}
    @CType("void*")
    MemorySegment parentWindow$handle();

    /// Sets `parentWindow$handle` with the given value.
    /// @param parentWindow$handle the value
    /// @return `this`
    NFDSaveDialogU8Args parentWindow$handle(@CType("void*") MemorySegment parentWindow$handle);

}
