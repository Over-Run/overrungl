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
import overrun.marshal.DirectAccess;
import overrun.marshal.gen.CType;
import overrun.marshal.gen.CanonicalType;
import overrun.marshal.gen.Entrypoint;

/// Base functions of [NFD].
public interface CNFD extends DirectAccess {
    /// Programmatic error
    int ERROR = 0;
    /// User pressed okay, or successful return
    int OKAY = 1;
    /// User pressed cancel
    int CANCEL = 2;
    /// The native window handle type.
    int WINDOW_HANDLE_TYPE_UNSET = 0,
        /// Windows: handle is HWND (the Windows API typedefs this to void*)
        WINDOW_HANDLE_TYPE_WINDOWS = 1,
        /// Cocoa: handle is NSWindow*
        WINDOW_HANDLE_TYPE_COCOA = 2,
        /// X11: handle is Window
        WINDOW_HANDLE_TYPE_X11 = 3;
    /// Free a file path that was returned by the dialogs.
    /// 
    /// Note: use NFD_PathSet_FreePathN() to free path from pathset instead of this function.
    @Entrypoint("NFD_FreePathN")
    void FreePathN(@CType("nfdnchar_t*") MemorySegment filePath);

    /// Free a file path that was returned by the dialogs.
    /// 
    /// Note: use NFD_PathSet_FreePathU8() to free path from pathset instead of this function.
    @Entrypoint("NFD_FreePathU8")
    void FreePathU8(@CType("nfdu8char_t*") MemorySegment filePath);

    /// Initialize NFD. Call this for every thread that might use NFD, before calling any other NFD functions on that thread.
    @CType("nfdresult_t")
    @CanonicalType("int")
    @Entrypoint("NFD_Init")
    int Init();

    /// Call this to de-initialize NFD, if NFD_Init returned NFD_OKAY.
    @Entrypoint("NFD_Quit")
    void Quit();

    /// Single file open dialog
    /// 
    /// It's the caller's responsibility to free `outPath` via NFD_FreePathN() if this function returns NFD_OKAY.
    /// @param filterCount If zero, filterList is ignored (you can use null).
    /// @param defaultPath If null, the operating system will decide.
    @CType("nfdresult_t")
    @CanonicalType("int")
    @Entrypoint("NFD_OpenDialogN")
    int OpenDialogN(@CType("nfdnchar_t**") MemorySegment outPath, @CType("const nfdnfilteritem_t*") MemorySegment filterList, @CType("nfdfiltersize_t") @CanonicalType("int") int filterCount, @CType("const nfdnchar_t*") String defaultPath);

    /// Single file open dialog
    /// 
    /// It's the caller's responsibility to free `outPath` via NFD_FreePathN() if this function returns NFD_OKAY.
    /// @param filterCount If zero, filterList is ignored (you can use null).
    /// @param defaultPath If null, the operating system will decide.
    @CType("nfdresult_t")
    @CType("nfdresult_t")
    @CanonicalType("int")
    @CanonicalType("int")
    @Entrypoint("NFD_OpenDialogN")
    int OpenDialogN(@CType("nfdnchar_t**") MemorySegment outPath, @CType("const nfdnfilteritem_t*") MemorySegment filterList, @CType("nfdfiltersize_t") @CanonicalType("int") int filterCount, @CType("const nfdnchar_t*") MemorySegment defaultPath);

}
