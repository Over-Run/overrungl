/*
 * MIT License
 *
 * Copyright (c) 2024 Overrun Organization
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

package overrungl.nfd;

import overrun.marshal.Downcall;
import overrun.marshal.DowncallOption;

import java.lang.invoke.MethodHandles;

/**
 * @author squid233
 * @since 0.1.0
 */
// TODO this -> NFD
public final class NFDstatic {
    // ---[BEGIN GENERATOR BEGIN]---
    /**
     * Programmatic error
     */
    public static final int ERROR = CNFD.ERROR;
    /**
     * User pressed okay, or successful return
     */
    public static final int OKAY = CNFD.OKAY;
    /**
     * User pressed cancel
     */
    public static final int CANCEL = CNFD.CANCEL;
    /**
     * The native window handle type.
     */
    public static final int WINDOW_HANDLE_TYPE_UNSET = CNFD.WINDOW_HANDLE_TYPE_UNSET;
    /**
     * Windows: handle is HWND (the Windows API typedefs this to void*)
     */
    public static final int WINDOW_HANDLE_TYPE_WINDOWS = CNFD.WINDOW_HANDLE_TYPE_WINDOWS;
    /**
     * Cocoa: handle is NSWindow*
     */
    public static final int WINDOW_HANDLE_TYPE_COCOA = CNFD.WINDOW_HANDLE_TYPE_COCOA;
    /**
     * X11: handle is Window
     */
    public static final int WINDOW_HANDLE_TYPE_X11 = CNFD.WINDOW_HANDLE_TYPE_X11;
    /**
     * This is a unique identifier tagged to all the NFD_*With() function calls, for backward
     * compatibility purposes. <p>There is usually no need to use this directly, unless you want to use
     * NFD differently depending on the version you're building with.
     */
    public static final int INTERFACE_VERSION = CNFD.INTERFACE_VERSION;
    /**
     * Free a file path that was returned by the dialogs.
     * <p>
     * Note: use {@link #pathSetFreePathN} to free path from pathset instead of this function.
     */
    @overrun.marshal.gen.Entrypoint("NFD_FreePathN")
    public static void freePathN(
        @overrun.marshal.gen.CType("nfdnchar_t*") java.lang.foreign.MemorySegment filePath) {
      getInstance().freePathN(filePath);
    }
    /**
     * Free a file path that was returned by the dialogs.
     * <p>
     * Note: use {@link #pathSetFreePathU8} to free path from pathset instead of this function.
     */
    @overrun.marshal.gen.Entrypoint("NFD_FreePathU8")
    public static void freePathU8(
        @overrun.marshal.gen.CType("nfdu8char_t*") java.lang.foreign.MemorySegment filePath) {
      getInstance().freePathU8(filePath);
    }
    /**
     * Initialize NFD. Call this for every thread that might use NFD, before calling any other NFD
     * functions on that thread.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_Init")
    public static int init() {
      return getInstance().init();
    }
    /**
     * Call this to de-initialize NFD, if {@link #init()} returned NFD_OKAY.
     */
    @overrun.marshal.gen.Entrypoint("NFD_Quit")
    public static void quit() {
      getInstance().quit();
    }
    /**
     * Single file open dialog
     * <p>
     * It's the caller's responsibility to free {@code outPath} via {@link #freePathN} if this function returns
     * NFD_OKAY.
     * @param filterCount If zero, filterList is ignored (you can use null).@param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogN")
    public static int openDialogN(
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment filterList,
        @overrun.marshal.gen.CType("nfdfiltersize_t") int filterCount,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().openDialogN(outPath, filterList, filterCount, defaultPath);
    }
    /**
     * Single file open dialog
     * <p>
     * It's the caller's responsibility to free {@code outPath} via {@link #freePathU8} if this function returns
     * NFD_OKAY.
     * @param filterCount If zero, filterList is ignored (you can use null).@param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogU8")
    public static int openDialogU8(
        @overrun.marshal.gen.CType("nfdu8char_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdu8filteritem_t*") java.lang.foreign.MemorySegment filterList,
        @overrun.marshal.gen.CType("nfdfiltersize_t") int filterCount,
        @overrun.marshal.gen.CType("const nfdu8char_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().openDialogU8(outPath, filterList, filterCount, defaultPath);
    }
    /**
     * This function is a library implementation detail.  Please use {@link #openDialogNWith} instead.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogN_With_Impl")
    public static int openDialogNWithImpl(@overrun.marshal.gen.CType("nfdversion_t") long version,
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdopendialognargs_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().openDialogNWithImpl(version, outPath, args);
    }
    /**
     * Single file open dialog, with additional parameters.
     * <p>
     * It is the caller's responsibility to free {@code outPath} via {@link #freePathN} if this function
     * returns NFD_OKAY.  See documentation of {@link NFDOpenDialogNArgs} for details.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogN_With")
    @overrun.marshal.gen.Skip
    public static int openDialogNWith(
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdopendialognargs_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().openDialogNWith(outPath, args);
    }
    /**
     * This function is a library implementation detail.  Please use {@link #openDialogU8With} instead.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogU8_With_Impl")
    public static int openDialogU8WithImpl(@overrun.marshal.gen.CType("nfdversion_t") long version,
        @overrun.marshal.gen.CType("nfdu8char_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdopendialogu8args_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().openDialogU8WithImpl(version, outPath, args);
    }
    /**
     * Single file open dialog, with additional parameters.
     * <p>
     * It is the caller's responsibility to free {@code outPath} via {@link #freePathU8} if this function
     * returns NFD_OKAY.  See documentation of {@link NFDOpenDialogU8Args} for details.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogU8_With")
    @overrun.marshal.gen.Skip
    public static int openDialogU8With(
        @overrun.marshal.gen.CType("nfdu8char_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdopendialogu8args_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().openDialogU8With(outPath, args);
    }
    /**
     * Multiple file open dialog
     * <p>
     * It is the caller's responsibility to free {@code outPaths} via {@link #pathSetFree} if this function
     * returns NFD_OKAY.
     * @param filterCount If zero, filterList is ignored (you can use null).@param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogMultipleN")
    public static int openDialogMultipleN(
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment filterList,
        @overrun.marshal.gen.CType("nfdfiltersize_t") int filterCount,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().openDialogMultipleN(outPaths, filterList, filterCount, defaultPath);
    }
    /**
     * Multiple file open dialog
     * <p>
     * It is the caller's responsibility to free {@code outPaths} via {@link #pathSetFree} if this function
     * returns NFD_OKAY.
     * @param filterCount If zero, filterList is ignored (you can use null).@param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogMultipleU8")
    public static int openDialogMultipleU8(
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdu8filteritem_t*") java.lang.foreign.MemorySegment filterList,
        @overrun.marshal.gen.CType("nfdfiltersize_t") int filterCount,
        @overrun.marshal.gen.CType("const nfdu8char_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().openDialogMultipleU8(outPaths, filterList, filterCount, defaultPath);
    }
    /**
     * This function is a library implementation detail.  Please use {@link #openDialogMultipleNWith}
     * instead.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogMultipleN_With_Impl")
    public static int openDialogMultipleNWithImpl(
        @overrun.marshal.gen.CType("nfdversion_t") long version,
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdopendialognargs_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().openDialogMultipleNWithImpl(version, outPaths, args);
    }
    /**
     * Multiple file open dialog, with additional parameters.
     * <p>
     * It is the caller's responsibility to free {@code outPaths} via {@link #pathSetFree} if this function
     * returns NFD_OKAY.  See documentation of {@link NFDOpenDialogNArgs} for details.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogMultipleN_With")
    @overrun.marshal.gen.Skip
    public static int openDialogMultipleNWith(
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdopendialognargs_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().openDialogMultipleNWith(outPaths, args);
    }
    /**
     * This function is a library implementation detail.  Please use {@link #openDialogMultipleU8With}
     * instead.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogMultipleU8_With_Impl")
    public static int openDialogMultipleU8WithImpl(
        @overrun.marshal.gen.CType("nfdversion_t") long version,
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdopendialogu8args_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().openDialogMultipleU8WithImpl(version, outPaths, args);
    }
    /**
     * Multiple file open dialog, with additional parameters.
     * <p>
     * It is the caller's responsibility to free {@code outPaths} via {@link #pathSetFree} if this function
     * returns NFD_OKAY.  See documentation of {@link NFDOpenDialogU8Args} for details.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogMultipleU8_With")
    @overrun.marshal.gen.Skip
    public static int openDialogMultipleU8With(
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdopendialogu8args_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().openDialogMultipleU8With(outPaths, args);
    }
    /**
     * Save dialog
     * <p>
     * It is the caller's responsibility to free {@code outPath} via {@link #freePathN} if this function returns
     * NFD_OKAY.
     * @param filterCount If zero, filterList is ignored (you can use null).@param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_SaveDialogN")
    public static int saveDialogN(
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment filterList,
        @overrun.marshal.gen.CType("nfdfiltersize_t") int filterCount,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultName) {
      return getInstance().saveDialogN(outPath, filterList, filterCount, defaultPath, defaultName);
    }
    /**
     * Save dialog
     * <p>
     * It is the caller's responsibility to free {@code outPath} via {@link #freePathU8} if this function returns
     * NFD_OKAY.
     * @param filterCount If zero, filterList is ignored (you can use null).@param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_SaveDialogU8")
    public static int saveDialogU8(
        @overrun.marshal.gen.CType("nfdu8char_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdu8filteritem_t*") java.lang.foreign.MemorySegment filterList,
        @overrun.marshal.gen.CType("nfdfiltersize_t") int filterCount,
        @overrun.marshal.gen.CType("const nfdu8char_t*") java.lang.foreign.MemorySegment defaultPath,
        @overrun.marshal.gen.CType("const nfdu8char_t*") java.lang.foreign.MemorySegment defaultName) {
      return getInstance().saveDialogU8(outPath, filterList, filterCount, defaultPath, defaultName);
    }
    /**
     * This function is a library implementation detail.  Please use {@link #saveDialogNWith} instead.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_SaveDialogN_With_Impl")
    public static int saveDialogNWithImpl(@overrun.marshal.gen.CType("nfdversion_t") long version,
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdsavedialognargs_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().saveDialogNWithImpl(version, outPath, args);
    }
    /**
     * Single file save dialog, with additional parameters.
     * <p>
     * It is the caller's responsibility to free {@code outPath} via {@link #freePathN} if this function
     * returns NFD_OKAY.  See documentation of {@link NFDSaveDialogNArgs} for details.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_SaveDialogN_With")
    @overrun.marshal.gen.Skip
    public static int saveDialogNWith(
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdsavedialognargs_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().saveDialogNWith(outPath, args);
    }
    /**
     * This function is a library implementation detail.  Please use {@link #saveDialogU8With} instead.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_SaveDialogU8_With_Impl")
    public static int saveDialogU8WithImpl(@overrun.marshal.gen.CType("nfdversion_t") long version,
        @overrun.marshal.gen.CType("nfdu8char_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdsavedialogu8args_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().saveDialogU8WithImpl(version, outPath, args);
    }
    /**
     * Single file save dialog, with additional parameters.
     * <p>
     * It is the caller's responsibility to free {@code outPath} via {@link #freePathU8} if this function
     * returns NFD_OKAY.  See documentation of {@link NFDSaveDialogU8Args} for details.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_SaveDialogU8_With")
    @overrun.marshal.gen.Skip
    public static int saveDialogU8With(
        @overrun.marshal.gen.CType("nfdu8char_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdsavedialogu8args_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().saveDialogU8With(outPath, args);
    }
    /**
     * Select single folder dialog
     * <p>
     * It's the caller's responsibility to free {@code outPath} via {@link #freePathN} if this function returns
     * NFD_OKAY.
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderN")
    public static int pickFolderN(
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().pickFolderN(outPath, defaultPath);
    }
    /**
     * Select single folder dialog
     * <p>
     * It's the caller's responsibility to free {@code outPath} via {@link #freePathU8} if this function returns
     * NFD_OKAY.
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderU8")
    public static int pickFolderU8(
        @overrun.marshal.gen.CType("nfdu8char_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdu8char_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().pickFolderU8(outPath, defaultPath);
    }
    /**
     * This function is a library implementation detail.  Please use {@link #pickFolderNWith} instead.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderN_With_Impl")
    public static int pickFolderNWithImpl(@overrun.marshal.gen.CType("nfdversion_t") long version,
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdpickfoldernargs_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().pickFolderNWithImpl(version, outPath, args);
    }
    /**
     * Single file open dialog, with additional parameters.
     * <p>
     * It is the caller's responsibility to free {@code outPath} via {@link #freePathN} if this function
     * returns NFD_OKAY.  See documentation of {@link NFDPickFolderNArgs} for details.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderN_With")
    @overrun.marshal.gen.Skip
    public static int pickFolderNWith(
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdpickfoldernargs_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().pickFolderNWith(outPath, args);
    }
    /**
     * This function is a library implementation detail.  Please use {@link #pickFolderU8With} instead.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderU8_With_Impl")
    public static int pickFolderU8WithImpl(@overrun.marshal.gen.CType("nfdversion_t") long version,
        @overrun.marshal.gen.CType("nfdu8char_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdpickfolderu8args_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().pickFolderU8WithImpl(version, outPath, args);
    }
    /**
     * Single file open dialog, with additional parameters.
     * <p>
     * It is the caller's responsibility to free {@code outPath} via {@link #freePathU8} if this function
     * returns NFD_OKAY.  See documentation of {@link NFDPickFolderU8Args} for details.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderU8_With")
    @overrun.marshal.gen.Skip
    public static int pickFolderU8With(
        @overrun.marshal.gen.CType("nfdu8char_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdpickfolderu8args_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().pickFolderU8With(outPath, args);
    }
    /**
     * Select multiple folder dialog
     * <p>
     * It is the caller's responsibility to free {@code outPaths} via {@link #pathSetFree} if this function
     * returns NFD_OKAY.
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderMultipleN")
    public static int pickFolderMultipleN(
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().pickFolderMultipleN(outPaths, defaultPath);
    }
    /**
     * Select multiple folder dialog
     * <p>
     * It is the caller's responsibility to free {@code outPaths} via {@link #pathSetFree} if this function
     * returns NFD_OKAY.
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderMultipleU8")
    public static int pickFolderMultipleU8(
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdu8char_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().pickFolderMultipleU8(outPaths, defaultPath);
    }
    /**
     * This function is a library implementation detail.  Please use {@link #pickFolderMultipleNWith}
     * instead.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderMultipleN_With_Impl")
    public static int pickFolderMultipleNWithImpl(
        @overrun.marshal.gen.CType("nfdversion_t") long version,
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdpickfoldernargs_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().pickFolderMultipleNWithImpl(version, outPaths, args);
    }
    /**
     * Multiple file open dialog, with additional parameters.
     * <p>
     * It is the caller's responsibility to free {@code outPaths} via {@link #pathSetFree} if this function
     * returns NFD_OKAY.  See documentation of {@link NFDPickFolderNArgs} for details.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderMultipleN_With")
    @overrun.marshal.gen.Skip
    public static int pickFolderMultipleNWith(
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdpickfoldernargs_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().pickFolderMultipleNWith(outPaths, args);
    }
    /**
     * This function is a library implementation detail.  Please use {@link #pickFolderMultipleU8With}
     * instead.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderMultipleU8_With_Impl")
    public static int pickFolderMultipleU8WithImpl(
        @overrun.marshal.gen.CType("nfdversion_t") long version,
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdpickfolderu8args_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().pickFolderMultipleU8WithImpl(version, outPaths, args);
    }
    /**
     * Multiple file open dialog, with additional parameters.
     * <p>
     * It is the caller's responsibility to free {@code outPaths} via {@link #pathSetFree} if this function
     * returns NFD_OKAY.  See documentation of {@link NFDPickFolderU8Args} for details.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderMultipleU8_With")
    @overrun.marshal.gen.Skip
    public static int pickFolderMultipleU8With(
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdpickfolderu8args_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().pickFolderMultipleU8With(outPaths, args);
    }
    /**
     * Get the last error
     * <p>
     * This is set when a function returns NFD_ERROR.
     * The memory is owned by NFD and should not be freed by user code.
     * This is <strong>always</strong> ASCII printable characters, so it can be interpreted as UTF-8 without any
     * conversion.
     * @return The last error that was set, or null if there is no error.
     */
    @overrun.marshal.gen.CType("const char*")
    @overrun.marshal.gen.Entrypoint("NFD_GetError")
    public static java.lang.foreign.MemorySegment getError_() {
      return getInstance().getError_();
    }
    /**
     * Get the last error
     * <p>
     * This is set when a function returns NFD_ERROR.
     * The memory is owned by NFD and should not be freed by user code.
     * This is <strong>always</strong> ASCII printable characters, so it can be interpreted as UTF-8 without any
     * conversion.
     * @return The last error that was set, or null if there is no error.
     */
    @overrun.marshal.gen.CType("const char*")
    @overrun.marshal.gen.Entrypoint("NFD_GetError")
    public static java.lang.String getError() {
      return getInstance().getError();
    }
    /**
     * Clear the error.
     */
    @overrun.marshal.gen.Entrypoint("NFD_ClearError")
    public static void clearError() {
      getInstance().clearError();
    }
    /**
     * Get the number of entries stored in pathSet.
     * <p>
     * Note: some paths might be invalid (NFD_ERROR will be returned by NFD_PathSet_GetPath),
     * so we might not actually have this number of usable paths.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_GetCount")
    public static int pathSetGetCount(
        @overrun.marshal.gen.CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet,
        @overrun.marshal.gen.CType("nfdpathsetsize_t*") java.lang.foreign.MemorySegment count) {
      return getInstance().pathSetGetCount(pathSet, count);
    }
    /**
     * Get the native path at offset index.
     * <p>
     * It is the caller's responsibility to free `outPath` via {@link #pathSetFreePathN} if this function
     * returns NFD_OKAY.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_GetPathN")
    public static int pathSetGetPathN(
        @overrun.marshal.gen.CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet,
        @overrun.marshal.gen.CType("nfdpathsetsize_t") long index,
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath) {
      return getInstance().pathSetGetPathN(pathSet, index, outPath);
    }
    /**
     * Get the UTF-8 path at offset index.
     * <p>
     * It is the caller's responsibility to free `outPath` via {@link #pathSetFreePathU8} if this function
     * returns NFD_OKAY.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_GetPathU8")
    public static int pathSetGetPathU8(
        @overrun.marshal.gen.CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet,
        @overrun.marshal.gen.CType("nfdpathsetsize_t") long index,
        @overrun.marshal.gen.CType("nfdu8char_t**") java.lang.foreign.MemorySegment outPath) {
      return getInstance().pathSetGetPathU8(pathSet, index, outPath);
    }
    /**
     * Free the path gotten by {@link #pathSetGetPathN}.
     */
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_FreePathN")
    public static void pathSetFreePathN(
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment filePath) {
      getInstance().pathSetFreePathN(filePath);
    }
    /**
     * Free the path gotten by {@link #pathSetGetPathU8}.
     */
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_FreePathU8")
    public static void pathSetFreePathU8(
        @overrun.marshal.gen.CType("const nfdu8char_t*") java.lang.foreign.MemorySegment filePath) {
      getInstance().pathSetFreePathU8(filePath);
    }
    /**
     * Gets an enumerator of the path set.
     * <p>
     * It is the caller's responsibility to free {@code enumerator} via {@link #pathSetFreeEnum}
     * if this function returns NFD_OKAY, and it should be freed before freeing the pathset.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_GetEnum")
    public static int pathSetGetEnum(
        @overrun.marshal.gen.CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet,
        @overrun.marshal.gen.CType("nfdpathsetenum_t*") java.lang.foreign.MemorySegment outEnumerator) {
      return getInstance().pathSetGetEnum(pathSet, outEnumerator);
    }
    /**
     * Frees an enumerator of the path set.
     */
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_FreeEnum")
    public static void pathSetFreeEnum(
        @overrun.marshal.gen.CType("nfdpathsetenum_t*") java.lang.foreign.MemorySegment enumerator) {
      getInstance().pathSetFreeEnum(enumerator);
    }
    /**
     * Gets the next item from the path set enumerator.
     * <p>
     * If there are no more items, then *outPaths will be set to null.
     * It is the caller's responsibility to free {@code *outPath} via {@link #pathSetFreePathN}
     * if this function returns NFD_OKAY and {@code *outPath} is not null.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_EnumNextN")
    public static int pathSetEnumNextN(
        @overrun.marshal.gen.CType("nfdpathsetenum_t*") java.lang.foreign.MemorySegment enumerator,
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath) {
      return getInstance().pathSetEnumNextN(enumerator, outPath);
    }
    /**
     * Gets the next item from the path set enumerator.
     * <p>
     * If there are no more items, then *outPaths will be set to null.
     * It is the caller's responsibility to free {@code *outPath} via {@link #pathSetFreePathU8}
     * if this function returns NFD_OKAY and {@code *outPath} is not null.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_EnumNextU8")
    public static int pathSetEnumNextU8(
        @overrun.marshal.gen.CType("nfdpathsetenum_t*") java.lang.foreign.MemorySegment enumerator,
        @overrun.marshal.gen.CType("nfdu8char_t**") java.lang.foreign.MemorySegment outPath) {
      return getInstance().pathSetEnumNextU8(enumerator, outPath);
    }
    /**
     * Free the pathSet
     */
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_Free")
    public static void pathSetFree(
        @overrun.marshal.gen.CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet) {
      getInstance().pathSetFree(pathSet);
    }
    
    // ---[END GENERATOR END]---

    public static CNFD getInstance() {
        final class Holder {
            private static final CNFD INSTANCE = Downcall.load(MethodHandles.lookup(), NFDInternal.LOOKUP, DowncallOption.targetClass(CNFD.class));
        }
        return Holder.INSTANCE;
    }
}
