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

import io.github.overrun.memstack.MemoryStack;
import overrun.marshal.Downcall;
import overrun.marshal.DowncallOption;
import overrun.marshal.Marshal;
import overrun.marshal.Unmarshal;
import overrun.marshal.struct.Struct;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandles;

/**
 * <h2>Native File Dialog Extended</h2>
 * <p>
 * A small C library that portably invokes native file open, folder select and file save dialogs.
 * Write dialog code once and have it pop up native dialogs on all supported platforms.
 * Avoid linking large dependencies like wxWidgets and Qt.
 * <p>
 * Features:
 * <ul>
 *     <li>Supports Windows, MacOS, and Linux</li>
 *     <li>Friendly names for filters (e.g. {@code Java Source files (*.java;*.kt)} instead of {@code (*.java;*.kt)}) on platforms that support it</li>
 *     <li>Automatically append file extension on platforms where users expect it</li>
 *     <li>Support for setting a default folder path</li>
 *     <li>Support for setting a default file name (e.g. {@code Untitled.java})</li>
 *     <li>Consistent UTF-8 support on all platforms</li>
 *     <li>Native character set (UTF-16LE) support on Windows</li>
 *     <li>Initialization and de-initialization of platform library (e.g. COM (Windows) / GTK (Linux GTK) / D-Bus (Linux portal)) decoupled from dialog functions, so applications can choose when to initialize/de-initialize</li>
 *     <li>Multiple file selection support (for file open dialog)</li>
 *     <li>No third party dependencies</li>
 * </ul>
 *
 * <h3>Basic Usages</h3>
 * {@snippet lang = java:
 * void main() {
 *     NFD_Init();
 *
 *     try (MemoryStack stack = MemoryStack.pushLocal()) {
 *         String[] outPath = new String[1];
 *         var filterItem = NFDNFilterItem.create(stack,
 *             Map.entry("Source code", "java"),
 *             Map.entry("Image file", "png,jpg"));
 *         var result = NFD_OpenDialogN(outPath, filterItem, null);
 *         switch (result) {
 *             case NFD_ERROR -> println("Error: " + NFD_GetError());
 *             case NFD_OKAY -> println("Success! " + outPath[0]);
 *             case NFD_CANCEL -> println("User pressed cancel.");
 *         }
 *     }
 *
 *     NFD_Quit();
 * }}
 *
 * <h3>File Filter Syntax</h3>
 * Files can be filtered by file extension groups:
 * {@snippet lang = java:
 * var filterItem = NFDNFilterItem.create(allocator,
 *     Map.entry("Source code", "java"),
 *     Map.entry("Image file", "png,jpg"));
 *}
 * <p>
 * A file filter is a pair of strings comprising the friendly name and the specification
 * (multiple file extensions are comma-separated).
 * <p>
 * A list of file filters can be passed as an argument when invoking the library.
 * <p>
 * A wildcard filter is always added to every dialog.
 * <p>
 * <i>Note: On MacOS, the file dialogs do not have friendly names and there is no way to switch between filters, so the filter specifications are combined (e.g. "java,kt,png,jpg"). The filter specification is also never explicitly shown to the user. This is usual MacOS behaviour and users expect it.</i>
 * <p>
 * <i>Note 2: You must ensure that the specification string is non-empty and that every file extension has at least one character. Otherwise, bad things might ensue (i.e. undefined behaviour).</i>
 * <p>
 * <i>Note 3: On Linux, the file extension is appended (if missing) when the user presses down the "Save" button. The appended file extension will remain visible to the user, even if an overwrite prompt is shown and the user then presses "Cancel".</i>
 * <p>
 * <i>Note 4: On Windows, the default folder parameter is only used if there is no recently used folder available. Otherwise, the default folder will be the folder that was last used. Internally, the Windows implementation calls <a href="https://docs.microsoft.com/en-us/windows/desktop/api/shobjidl_core/nf-shobjidl_core-ifiledialog-setdefaultfolder">IFileDialog::SetDefaultFolder(IShellItem)</a>. This is usual Windows behaviour and users expect it.</i>
 *
 * <h3>Iterating Over PathSets</h3>
 * A file open dialog that supports multiple selection produces a PathSet,
 * which is a thin abstraction over the platform-specific collection.
 * There are two ways to iterate over a PathSet:
 *
 * <h4>Accessing by index</h4>
 * This method does array-like access on the PathSet, and is the easiest to use.
 * However, on certain platforms (Linux, and possibly Windows),
 * it takes O(N²) time in total to iterate the entire PathSet,
 * because the underlying platform-specific implementation uses a linked list.
 *
 * <h4>Using an enumerator (experimental)</h4>
 * This method uses an enumerator object to iterate the paths in the PathSet.
 * It is guaranteed to take O(N) time in total to iterate the entire PathSet.
 * <p>
 * See {@link NFDEnumerator}.
 * <p>
 * This API is experimental, and subject to change.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class NFD {
    //@formatter:off
    //region ---[BEGIN GENERATOR BEGIN]---
    /**
     * Programmatic error
     */
    public static final int NFD_ERROR = CNFD.NFD_ERROR;
    /**
     * User pressed okay, or successful return
     */
    public static final int NFD_OKAY = CNFD.NFD_OKAY;
    /**
     * User pressed cancel
     */
    public static final int NFD_CANCEL = CNFD.NFD_CANCEL;
    /**
     * The native window handle type.
     */
    public static final int NFD_WINDOW_HANDLE_TYPE_UNSET = CNFD.NFD_WINDOW_HANDLE_TYPE_UNSET;
    /**
     * Windows: handle is HWND (the Windows API typedefs this to void*)
     */
    public static final int NFD_WINDOW_HANDLE_TYPE_WINDOWS = CNFD.NFD_WINDOW_HANDLE_TYPE_WINDOWS;
    /**
     * Cocoa: handle is NSWindow*
     */
    public static final int NFD_WINDOW_HANDLE_TYPE_COCOA = CNFD.NFD_WINDOW_HANDLE_TYPE_COCOA;
    /**
     * X11: handle is Window
     */
    public static final int NFD_WINDOW_HANDLE_TYPE_X11 = CNFD.NFD_WINDOW_HANDLE_TYPE_X11;
    /**
     * This is a unique identifier tagged to all the NFD_*With() function calls, for backward
     * compatibility purposes. <p>There is usually no need to use this directly, unless you want to use
     * NFD differently depending on the version you're building with.
     */
    public static final int NFD_INTERFACE_VERSION = CNFD.NFD_INTERFACE_VERSION;
    /**
     * Free a file path that was returned by the dialogs.
     * <p>
     * Note: use {@link #NFD_PathSet_FreePathN} to free path from pathset instead of this function.
     */
    @overrun.marshal.gen.Entrypoint("NFD_FreePathN")
    public static void NFD_FreePathN(
        @overrun.marshal.gen.CType("nfdnchar_t*") java.lang.foreign.MemorySegment filePath) {
      getInstance().NFD_FreePathN(filePath);
    }
    /**
     * Overloads {@link #NFD_FreePathN(java.lang.foreign.MemorySegment)}
     */
    @overrun.marshal.gen.Entrypoint("NFD_FreePathN")
    @overrun.marshal.gen.Skip
    public static void NFD_FreePath(
        @overrun.marshal.gen.CType("nfdnchar_t*") java.lang.foreign.MemorySegment filePath) {
      getInstance().NFD_FreePath(filePath);
    }
    /**
     * Free a file path that was returned by the dialogs.
     * <p>
     * Note: use {@link #NFD_PathSet_FreePathU8} to free path from pathset instead of this function.
     */
    @overrun.marshal.gen.Entrypoint("NFD_FreePathU8")
    public static void NFD_FreePathU8(
        @overrun.marshal.gen.CType("nfdu8char_t*") java.lang.foreign.MemorySegment filePath) {
      getInstance().NFD_FreePathU8(filePath);
    }
    /**
     * Initialize NFD. Call this for every thread that might use NFD, before calling any other NFD
     * functions on that thread.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_Init")
    public static int NFD_Init() {
      return getInstance().NFD_Init();
    }
    /**
     * Call this to de-initialize NFD, if {@link #NFD_Init()} returned NFD_OKAY.
     */
    @overrun.marshal.gen.Entrypoint("NFD_Quit")
    public static void NFD_Quit() {
      getInstance().NFD_Quit();
    }
    /**
     * Single file open dialog
     * <p>
     * It's the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathN} if this function returns
     * NFD_OKAY.
     * @param filterCount If zero, filterList is ignored (you can use null).
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogN")
    public static int NFD_OpenDialogN(
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment filterList,
        @overrun.marshal.gen.CType("nfdfiltersize_t") int filterCount,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().NFD_OpenDialogN(outPath, filterList, filterCount, defaultPath);
    }
    /**
     * Overloads {@link #NFD_OpenDialogN(java.lang.foreign.MemorySegment, java.lang.foreign.MemorySegment, int, java.lang.foreign.MemorySegment)}
     * @param filterCount If zero, filterList is ignored (you can use null).
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogN")
    @overrun.marshal.gen.Skip
    public static int NFD_OpenDialog(
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment filterList,
        @overrun.marshal.gen.CType("nfdfiltersize_t") int filterCount,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().NFD_OpenDialog(outPath, filterList, filterCount, defaultPath);
    }
    /**
     * Single file open dialog
     * <p>
     * It's the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathU8} if this function returns
     * NFD_OKAY.
     * @param filterCount If zero, filterList is ignored (you can use null).
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogU8")
    public static int NFD_OpenDialogU8(
        @overrun.marshal.gen.CType("nfdu8char_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdu8filteritem_t*") java.lang.foreign.MemorySegment filterList,
        @overrun.marshal.gen.CType("nfdfiltersize_t") int filterCount,
        @overrun.marshal.gen.CType("const nfdu8char_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().NFD_OpenDialogU8(outPath, filterList, filterCount, defaultPath);
    }
    /**
     * This function is a library implementation detail.  Please use {@link #NFD_OpenDialogN_With} instead.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogN_With_Impl")
    public static int NFD_OpenDialogN_With_Impl(@overrun.marshal.gen.CType("nfdversion_t") long version,
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdopendialognargs_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().NFD_OpenDialogN_With_Impl(version, outPath, args);
    }
    /**
     * Single file open dialog, with additional parameters.
     * <p>
     * It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathN} if this function
     * returns NFD_OKAY.  See documentation of {@link NFDOpenDialogNArgs} for details.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogN_With")
    @overrun.marshal.gen.Skip
    public static int NFD_OpenDialogN_With(
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdopendialognargs_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().NFD_OpenDialogN_With(outPath, args);
    }
    /**
     * This function is a library implementation detail.  Please use {@link #NFD_OpenDialogU8_With} instead.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogU8_With_Impl")
    public static int NFD_OpenDialogU8_With_Impl(
        @overrun.marshal.gen.CType("nfdversion_t") long version,
        @overrun.marshal.gen.CType("nfdu8char_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdopendialogu8args_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().NFD_OpenDialogU8_With_Impl(version, outPath, args);
    }
    /**
     * Single file open dialog, with additional parameters.
     * <p>
     * It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathU8} if this function
     * returns NFD_OKAY.  See documentation of {@link NFDOpenDialogU8Args} for details.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogU8_With")
    @overrun.marshal.gen.Skip
    public static int NFD_OpenDialogU8_With(
        @overrun.marshal.gen.CType("nfdu8char_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdopendialogu8args_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().NFD_OpenDialogU8_With(outPath, args);
    }
    /**
     * Multiple file open dialog
     * <p>
     * It is the caller's responsibility to free {@code outPaths} via {@link #NFD_PathSet_Free} if this function
     * returns NFD_OKAY.
     * @param filterCount If zero, filterList is ignored (you can use null).
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogMultipleN")
    public static int NFD_OpenDialogMultipleN(
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment filterList,
        @overrun.marshal.gen.CType("nfdfiltersize_t") int filterCount,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().NFD_OpenDialogMultipleN(outPaths, filterList, filterCount, defaultPath);
    }
    /**
     * Overloads {@link #NFD_OpenDialogMultipleN(java.lang.foreign.MemorySegment, java.lang.foreign.MemorySegment, int, java.lang.foreign.MemorySegment)}
     * @param filterCount If zero, filterList is ignored (you can use null).
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogMultipleN")
    @overrun.marshal.gen.Skip
    public static int NFD_OpenDialogMultiple(
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment filterList,
        @overrun.marshal.gen.CType("nfdfiltersize_t") int filterCount,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().NFD_OpenDialogMultiple(outPaths, filterList, filterCount, defaultPath);
    }
    /**
     * Multiple file open dialog
     * <p>
     * It is the caller's responsibility to free {@code outPaths} via {@link #NFD_PathSet_Free} if this function
     * returns NFD_OKAY.
     * @param filterCount If zero, filterList is ignored (you can use null).
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogMultipleU8")
    public static int NFD_OpenDialogMultipleU8(
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdu8filteritem_t*") java.lang.foreign.MemorySegment filterList,
        @overrun.marshal.gen.CType("nfdfiltersize_t") int filterCount,
        @overrun.marshal.gen.CType("const nfdu8char_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().NFD_OpenDialogMultipleU8(outPaths, filterList, filterCount, defaultPath);
    }
    /**
     * This function is a library implementation detail.  Please use {@link #NFD_OpenDialogMultipleN_With}
     * instead.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogMultipleN_With_Impl")
    public static int NFD_OpenDialogMultipleN_With_Impl(
        @overrun.marshal.gen.CType("nfdversion_t") long version,
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdopendialognargs_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().NFD_OpenDialogMultipleN_With_Impl(version, outPaths, args);
    }
    /**
     * Multiple file open dialog, with additional parameters.
     * <p>
     * It is the caller's responsibility to free {@code outPaths} via {@link #NFD_PathSet_Free} if this function
     * returns NFD_OKAY.  See documentation of {@link NFDOpenDialogNArgs} for details.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogMultipleN_With")
    @overrun.marshal.gen.Skip
    public static int NFD_OpenDialogMultipleN_With(
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdopendialognargs_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().NFD_OpenDialogMultipleN_With(outPaths, args);
    }
    /**
     * This function is a library implementation detail.  Please use {@link #NFD_OpenDialogMultipleU8_With}
     * instead.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogMultipleU8_With_Impl")
    public static int NFD_OpenDialogMultipleU8_With_Impl(
        @overrun.marshal.gen.CType("nfdversion_t") long version,
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdopendialogu8args_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().NFD_OpenDialogMultipleU8_With_Impl(version, outPaths, args);
    }
    /**
     * Multiple file open dialog, with additional parameters.
     * <p>
     * It is the caller's responsibility to free {@code outPaths} via {@link #NFD_PathSet_Free} if this function
     * returns NFD_OKAY.  See documentation of {@link NFDOpenDialogU8Args} for details.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogMultipleU8_With")
    @overrun.marshal.gen.Skip
    public static int NFD_OpenDialogMultipleU8_With(
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdopendialogu8args_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().NFD_OpenDialogMultipleU8_With(outPaths, args);
    }
    /**
     * Save dialog
     * <p>
     * It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathN} if this function returns
     * NFD_OKAY.
     * @param filterCount If zero, filterList is ignored (you can use null).
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_SaveDialogN")
    public static int NFD_SaveDialogN(
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment filterList,
        @overrun.marshal.gen.CType("nfdfiltersize_t") int filterCount,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultName) {
      return getInstance().NFD_SaveDialogN(outPath, filterList, filterCount, defaultPath, defaultName);
    }
    /**
     * Overloads {@link #NFD_SaveDialogN(java.lang.foreign.MemorySegment, java.lang.foreign.MemorySegment, int, java.lang.foreign.MemorySegment, java.lang.foreign.MemorySegment)}
     * @param filterCount If zero, filterList is ignored (you can use null).
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_SaveDialogN")
    @overrun.marshal.gen.Skip
    public static int NFD_SaveDialog(
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment filterList,
        @overrun.marshal.gen.CType("nfdfiltersize_t") int filterCount,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultName) {
      return getInstance().NFD_SaveDialog(outPath, filterList, filterCount, defaultPath, defaultName);
    }
    /**
     * Save dialog
     * <p>
     * It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathU8} if this function returns
     * NFD_OKAY.
     * @param filterCount If zero, filterList is ignored (you can use null).
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_SaveDialogU8")
    public static int NFD_SaveDialogU8(
        @overrun.marshal.gen.CType("nfdu8char_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdu8filteritem_t*") java.lang.foreign.MemorySegment filterList,
        @overrun.marshal.gen.CType("nfdfiltersize_t") int filterCount,
        @overrun.marshal.gen.CType("const nfdu8char_t*") java.lang.foreign.MemorySegment defaultPath,
        @overrun.marshal.gen.CType("const nfdu8char_t*") java.lang.foreign.MemorySegment defaultName) {
      return getInstance().NFD_SaveDialogU8(outPath, filterList, filterCount, defaultPath, defaultName);
    }
    /**
     * This function is a library implementation detail.  Please use {@link #NFD_SaveDialogN_With} instead.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_SaveDialogN_With_Impl")
    public static int NFD_SaveDialogN_WithImpl(@overrun.marshal.gen.CType("nfdversion_t") long version,
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdsavedialognargs_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().NFD_SaveDialogN_WithImpl(version, outPath, args);
    }
    /**
     * Single file save dialog, with additional parameters.
     * <p>
     * It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathN} if this function
     * returns NFD_OKAY.  See documentation of {@link NFDSaveDialogNArgs} for details.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_SaveDialogN_With")
    @overrun.marshal.gen.Skip
    public static int NFD_SaveDialogN_With(
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdsavedialognargs_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().NFD_SaveDialogN_With(outPath, args);
    }
    /**
     * This function is a library implementation detail.  Please use {@link #NFD_SaveDialogU8_With} instead.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_SaveDialogU8_With_Impl")
    public static int NFD_SaveDialogU8_WithImpl(@overrun.marshal.gen.CType("nfdversion_t") long version,
        @overrun.marshal.gen.CType("nfdu8char_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdsavedialogu8args_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().NFD_SaveDialogU8_WithImpl(version, outPath, args);
    }
    /**
     * Single file save dialog, with additional parameters.
     * <p>
     * It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathU8} if this function
     * returns NFD_OKAY.  See documentation of {@link NFDSaveDialogU8Args} for details.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_SaveDialogU8_With")
    @overrun.marshal.gen.Skip
    public static int NFD_SaveDialogU8_With(
        @overrun.marshal.gen.CType("nfdu8char_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdsavedialogu8args_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().NFD_SaveDialogU8_With(outPath, args);
    }
    /**
     * Select single folder dialog
     * <p>
     * It's the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathN} if this function returns
     * NFD_OKAY.
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderN")
    public static int NFD_PickFolderN(
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().NFD_PickFolderN(outPath, defaultPath);
    }
    /**
     * Overloads {@link #NFD_PickFolderN(java.lang.foreign.MemorySegment, java.lang.foreign.MemorySegment)}
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderN")
    @overrun.marshal.gen.Skip
    public static int NFD_PickFolder(
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().NFD_PickFolder(outPath, defaultPath);
    }
    /**
     * Select single folder dialog
     * <p>
     * It's the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathU8} if this function returns
     * NFD_OKAY.
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderU8")
    public static int NFD_PickFolderU8(
        @overrun.marshal.gen.CType("nfdu8char_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdu8char_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().NFD_PickFolderU8(outPath, defaultPath);
    }
    /**
     * This function is a library implementation detail.  Please use {@link #NFD_PickFolderN_With} instead.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderN_With_Impl")
    public static int NFD_PickFolderN_With_Impl(@overrun.marshal.gen.CType("nfdversion_t") long version,
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdpickfoldernargs_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().NFD_PickFolderN_With_Impl(version, outPath, args);
    }
    /**
     * Single file open dialog, with additional parameters.
     * <p>
     * It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathN} if this function
     * returns NFD_OKAY.  See documentation of {@link NFDPickFolderNArgs} for details.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderN_With")
    @overrun.marshal.gen.Skip
    public static int NFD_PickFolderN_With(
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdpickfoldernargs_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().NFD_PickFolderN_With(outPath, args);
    }
    /**
     * This function is a library implementation detail.  Please use {@link #NFD_PickFolderU8_With} instead.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderU8_With_Impl")
    public static int NFD_PickFolderU8_With_Impl(
        @overrun.marshal.gen.CType("nfdversion_t") long version,
        @overrun.marshal.gen.CType("nfdu8char_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdpickfolderu8args_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().NFD_PickFolderU8_With_Impl(version, outPath, args);
    }
    /**
     * Single file open dialog, with additional parameters.
     * <p>
     * It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathU8} if this function
     * returns NFD_OKAY.  See documentation of {@link NFDPickFolderU8Args} for details.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderU8_With")
    @overrun.marshal.gen.Skip
    public static int NFD_PickFolderU8_With(
        @overrun.marshal.gen.CType("nfdu8char_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdpickfolderu8args_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().NFD_PickFolderU8_With(outPath, args);
    }
    /**
     * Select multiple folder dialog
     * <p>
     * It is the caller's responsibility to free {@code outPaths} via {@link #NFD_PathSet_Free} if this function
     * returns NFD_OKAY.
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderMultipleN")
    public static int NFD_PickFolderMultipleN(
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().NFD_PickFolderMultipleN(outPaths, defaultPath);
    }
    /**
     * Overloads {@link #NFD_PickFolderMultipleN(java.lang.foreign.MemorySegment, java.lang.foreign.MemorySegment)}
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderMultipleN")
    @overrun.marshal.gen.Skip
    public static int NFD_PickFolderMultiple(
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().NFD_PickFolderMultiple(outPaths, defaultPath);
    }
    /**
     * Select multiple folder dialog
     * <p>
     * It is the caller's responsibility to free {@code outPaths} via {@link #NFD_PathSet_Free} if this function
     * returns NFD_OKAY.
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderMultipleU8")
    public static int NFD_PickFolderMultipleU8(
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdu8char_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().NFD_PickFolderMultipleU8(outPaths, defaultPath);
    }
    /**
     * This function is a library implementation detail.  Please use {@link #NFD_PickFolderMultipleN_With}
     * instead.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderMultipleN_With_Impl")
    public static int NFD_PickFolderMultipleN_With_Impl(
        @overrun.marshal.gen.CType("nfdversion_t") long version,
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdpickfoldernargs_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().NFD_PickFolderMultipleN_With_Impl(version, outPaths, args);
    }
    /**
     * Multiple file open dialog, with additional parameters.
     * <p>
     * It is the caller's responsibility to free {@code outPaths} via {@link #NFD_PathSet_Free} if this function
     * returns NFD_OKAY.  See documentation of {@link NFDPickFolderNArgs} for details.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderMultipleN_With")
    @overrun.marshal.gen.Skip
    public static int NFD_PickFolderMultipleN_With(
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdpickfoldernargs_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().NFD_PickFolderMultipleN_With(outPaths, args);
    }
    /**
     * This function is a library implementation detail.  Please use {@link #NFD_PickFolderMultipleU8_With}
     * instead.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderMultipleU8_With_Impl")
    public static int NFD_PickFolderMultipleU8_With_Impl(
        @overrun.marshal.gen.CType("nfdversion_t") long version,
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdpickfolderu8args_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().NFD_PickFolderMultipleU8_With_Impl(version, outPaths, args);
    }
    /**
     * Multiple file open dialog, with additional parameters.
     * <p>
     * It is the caller's responsibility to free {@code outPaths} via {@link #NFD_PathSet_Free} if this function
     * returns NFD_OKAY.  See documentation of {@link NFDPickFolderU8Args} for details.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderMultipleU8_With")
    @overrun.marshal.gen.Skip
    public static int NFD_PickFolderMultipleU8_With(
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdpickfolderu8args_t*") java.lang.foreign.MemorySegment args) {
      return getInstance().NFD_PickFolderMultipleU8_With(outPaths, args);
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
    public static java.lang.foreign.MemorySegment NFD_GetError_() {
      return getInstance().NFD_GetError_();
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
    public static java.lang.String NFD_GetError() {
      return getInstance().NFD_GetError();
    }
    /**
     * Clear the error.
     */
    @overrun.marshal.gen.Entrypoint("NFD_ClearError")
    public static void NFD_ClearError() {
      getInstance().NFD_ClearError();
    }
    /**
     * Get the number of entries stored in pathSet.
     * <p>
     * Note: some paths might be invalid (NFD_ERROR will be returned by NFD_PathSet_GetPath),
     * so we might not actually have this number of usable paths.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_GetCount")
    public static int NFD_PathSet_GetCount(
        @overrun.marshal.gen.CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet,
        @overrun.marshal.gen.CType("nfdpathsetsize_t*") java.lang.foreign.MemorySegment count) {
      return getInstance().NFD_PathSet_GetCount(pathSet, count);
    }
    /**
     * Get the number of entries stored in pathSet.
     * <p>
     * Note: some paths might be invalid (NFD_ERROR will be returned by NFD_PathSet_GetPath),
     * so we might not actually have this number of usable paths.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_GetCount")
    public static int NFD_PathSet_GetCount(
        @overrun.marshal.gen.CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet,
        @overrun.marshal.gen.CType("nfdpathsetsize_t*") @overrun.marshal.gen.Ref long[] count) {
      return getInstance().NFD_PathSet_GetCount(pathSet, count);
    }
    /**
     * Get the native path at offset index.
     * <p>
     * It is the caller's responsibility to free `outPath` via {@link #NFD_PathSet_FreePathN} if this function
     * returns NFD_OKAY.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_GetPathN")
    public static int NFD_PathSet_GetPathN(
        @overrun.marshal.gen.CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet,
        @overrun.marshal.gen.CType("nfdpathsetsize_t") long index,
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath) {
      return getInstance().NFD_PathSet_GetPathN(pathSet, index, outPath);
    }
    /**
     * Overloads {@link #NFD_PathSet_GetPathN(java.lang.foreign.MemorySegment, long, java.lang.foreign.MemorySegment)}
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_GetPathN")
    @overrun.marshal.gen.Skip
    public static int NFD_PathSet_GetPath(
        @overrun.marshal.gen.CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet,
        @overrun.marshal.gen.CType("nfdpathsetsize_t") long index,
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath) {
      return getInstance().NFD_PathSet_GetPath(pathSet, index, outPath);
    }
    /**
     * Get the UTF-8 path at offset index.
     * <p>
     * It is the caller's responsibility to free `outPath` via {@link #NFD_PathSet_FreePathU8} if this function
     * returns NFD_OKAY.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_GetPathU8")
    public static int NFD_PathSet_GetPathU8(
        @overrun.marshal.gen.CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet,
        @overrun.marshal.gen.CType("nfdpathsetsize_t") long index,
        @overrun.marshal.gen.CType("nfdu8char_t**") java.lang.foreign.MemorySegment outPath) {
      return getInstance().NFD_PathSet_GetPathU8(pathSet, index, outPath);
    }
    /**
     * Free the path gotten by {@link #NFD_PathSet_GetPathN}.
     */
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_FreePathN")
    public static void NFD_PathSet_FreePathN(
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment filePath) {
      getInstance().NFD_PathSet_FreePathN(filePath);
    }
    /**
     * Overloads {@link #NFD_PathSet_FreePathN(java.lang.foreign.MemorySegment)}
     */
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_FreePathN")
    @overrun.marshal.gen.Skip
    public static void NFD_PathSet_FreePath(
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment filePath) {
      getInstance().NFD_PathSet_FreePath(filePath);
    }
    /**
     * Free the path gotten by {@link #NFD_PathSet_GetPathU8}.
     */
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_FreePathU8")
    public static void NFD_PathSet_FreePathU8(
        @overrun.marshal.gen.CType("const nfdu8char_t*") java.lang.foreign.MemorySegment filePath) {
      getInstance().NFD_PathSet_FreePathU8(filePath);
    }
    /**
     * Gets an enumerator of the path set.
     * <p>
     * It is the caller's responsibility to free {@code enumerator} via {@link #NFD_PathSet_FreeEnum}
     * if this function returns NFD_OKAY, and it should be freed before freeing the pathset.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_GetEnum")
    public static int NFD_PathSet_GetEnum(
        @overrun.marshal.gen.CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet,
        @overrun.marshal.gen.CType("nfdpathsetenum_t*") java.lang.foreign.MemorySegment outEnumerator) {
      return getInstance().NFD_PathSet_GetEnum(pathSet, outEnumerator);
    }
    /**
     * Frees an enumerator of the path set.
     */
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_FreeEnum")
    public static void NFD_PathSet_FreeEnum(
        @overrun.marshal.gen.CType("nfdpathsetenum_t*") java.lang.foreign.MemorySegment enumerator) {
      getInstance().NFD_PathSet_FreeEnum(enumerator);
    }
    /**
     * Gets the next item from the path set enumerator.
     * <p>
     * If there are no more items, then *outPaths will be set to null.
     * It is the caller's responsibility to free {@code *outPath} via {@link #NFD_PathSet_FreePathN}
     * if this function returns NFD_OKAY and {@code *outPath} is not null.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_EnumNextN")
    public static int NFD_PathSet_EnumNextN(
        @overrun.marshal.gen.CType("nfdpathsetenum_t*") java.lang.foreign.MemorySegment enumerator,
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath) {
      return getInstance().NFD_PathSet_EnumNextN(enumerator, outPath);
    }
    /**
     * Overloads {@link #NFD_PathSet_EnumNextN(java.lang.foreign.MemorySegment, java.lang.foreign.MemorySegment)}
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_EnumNextN")
    @overrun.marshal.gen.Skip
    public static int NFD_PathSet_EnumNext(
        @overrun.marshal.gen.CType("nfdpathsetenum_t*") java.lang.foreign.MemorySegment enumerator,
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath) {
      return getInstance().NFD_PathSet_EnumNext(enumerator, outPath);
    }
    /**
     * Gets the next item from the path set enumerator.
     * <p>
     * If there are no more items, then *outPaths will be set to null.
     * It is the caller's responsibility to free {@code *outPath} via {@link #NFD_PathSet_FreePathU8}
     * if this function returns NFD_OKAY and {@code *outPath} is not null.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_EnumNextU8")
    public static int NFD_PathSet_EnumNextU8(
        @overrun.marshal.gen.CType("nfdpathsetenum_t*") java.lang.foreign.MemorySegment enumerator,
        @overrun.marshal.gen.CType("nfdu8char_t**") java.lang.foreign.MemorySegment outPath) {
      return getInstance().NFD_PathSet_EnumNextU8(enumerator, outPath);
    }
    /**
     * Free the pathSet
     */
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_Free")
    public static void NFD_PathSet_Free(
        @overrun.marshal.gen.CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet) {
      getInstance().NFD_PathSet_Free(pathSet);
    }
    /**
     * Overloads {@link #NFD_OpenDialogN(MemorySegment, MemorySegment, int, MemorySegment)}
     */
    public static int NFD_OpenDialogN(java.lang.String[] outPath,
        overrungl.nfd.NFDNFilterItem filterList, java.lang.String defaultPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath, NFDInternal.nfdCharset);
        int result = NFD_OpenDialogN(seg, Marshal.marshal(filterList), filterItemCount(filterList), Marshal.marshal(stack, defaultPath, NFDInternal.nfdCharset));
        if (result == NFD_OKAY) {
          copyOutPathN(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #NFD_OpenDialogN(MemorySegment, MemorySegment, int, MemorySegment)}
     */
    public static int NFD_OpenDialog(java.lang.String[] outPath,
        overrungl.nfd.NFDNFilterItem filterList, java.lang.String defaultPath) {
      return NFD_OpenDialogN(outPath, filterList, defaultPath);
    }
    /**
     * Overloads {@link #NFD_OpenDialogU8(MemorySegment, MemorySegment, int, MemorySegment)}
     */
    public static int NFD_OpenDialogU8(java.lang.String[] outPath,
        overrungl.nfd.NFDU8FilterItem filterList, java.lang.String defaultPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath);
        int result = NFD_OpenDialogU8(seg, Marshal.marshal(filterList), filterItemCount(filterList), Marshal.marshal(stack, defaultPath));
        if (result == NFD_OKAY) {
          copyOutPathU8(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #NFD_OpenDialogN_With(MemorySegment, MemorySegment)}
     */
    public static int NFD_OpenDialogN_With(java.lang.String[] outPath,
        overrungl.nfd.NFDOpenDialogNArgs args) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath, NFDInternal.nfdCharset);
        int result = NFD_OpenDialogN_With(seg, Marshal.marshal(args));
        if (result == NFD_OKAY) {
          copyOutPathN(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #NFD_OpenDialogU8_With(MemorySegment, MemorySegment)}
     */
    public static int NFD_OpenDialogU8_With(java.lang.String[] outPath,
        overrungl.nfd.NFDOpenDialogU8Args args) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath);
        int result = NFD_OpenDialogU8_With(seg, Marshal.marshal(args));
        if (result == NFD_OKAY) {
          copyOutPathU8(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #NFD_OpenDialogMultipleN(MemorySegment, MemorySegment, int, MemorySegment)}
     */
    public static int NFD_OpenDialogMultipleN(java.lang.foreign.MemorySegment outPaths,
        overrungl.nfd.NFDNFilterItem filterList, java.lang.String defaultPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        return NFD_OpenDialogMultipleN(outPaths, Marshal.marshal(filterList), filterItemCount(filterList), Marshal.marshal(stack, defaultPath, NFDInternal.nfdCharset));
      }
    }
    /**
     * Overloads {@link #NFD_OpenDialogMultipleN(MemorySegment, MemorySegment, int, MemorySegment)}
     */
    public static int NFD_OpenDialogMultiple(java.lang.foreign.MemorySegment outPaths,
        overrungl.nfd.NFDNFilterItem filterList, java.lang.String defaultPath) {
      return NFD_OpenDialogMultipleN(outPaths, filterList, defaultPath);
    }
    /**
     * Overloads {@link #NFD_OpenDialogMultipleU8(MemorySegment, MemorySegment, int, MemorySegment)}
     */
    public static int NFD_OpenDialogMultipleU8(java.lang.foreign.MemorySegment outPaths,
        overrungl.nfd.NFDU8FilterItem filterList, java.lang.String defaultPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        return NFD_OpenDialogMultipleU8(outPaths, Marshal.marshal(filterList), filterItemCount(filterList), Marshal.marshal(stack, defaultPath));
      }
    }
    /**
     * Overloads {@link #NFD_OpenDialogMultipleN_With(MemorySegment, MemorySegment)}
     */
    public static int NFD_OpenDialogMultipleN_With(java.lang.foreign.MemorySegment outPaths,
        overrungl.nfd.NFDOpenDialogNArgs args) {
      return NFD_OpenDialogMultipleN_With(outPaths, Marshal.marshal(args));
    }
    /**
     * Overloads {@link #NFD_OpenDialogMultipleU8_With(MemorySegment, MemorySegment)}
     */
    public static int NFD_OpenDialogMultipleU8_With(java.lang.foreign.MemorySegment outPaths,
        overrungl.nfd.NFDOpenDialogU8Args args) {
      return NFD_OpenDialogMultipleU8_With(outPaths, Marshal.marshal(args));
    }
    /**
     * Overloads {@link #NFD_SaveDialogN(MemorySegment, MemorySegment, int, MemorySegment, MemorySegment)}
     */
    public static int NFD_SaveDialogN(java.lang.String[] outPath,
        overrungl.nfd.NFDNFilterItem filterList, java.lang.String defaultPath,
        java.lang.String defaultName) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath, NFDInternal.nfdCharset);
        int result = NFD_SaveDialogN(seg, Marshal.marshal(filterList), filterItemCount(filterList), Marshal.marshal(stack, defaultPath, NFDInternal.nfdCharset), Marshal.marshal(stack, defaultName, NFDInternal.nfdCharset));
        if (result == NFD_OKAY) {
          copyOutPathN(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #NFD_SaveDialogN(MemorySegment, MemorySegment, int, MemorySegment, MemorySegment)}
     */
    public static int NFD_SaveDialog(java.lang.String[] outPath,
        overrungl.nfd.NFDNFilterItem filterList, java.lang.String defaultPath,
        java.lang.String defaultName) {
      return NFD_SaveDialogN(outPath, filterList, defaultPath, defaultName);
    }
    /**
     * Overloads {@link #NFD_SaveDialogU8(MemorySegment, MemorySegment, int, MemorySegment, MemorySegment)}
     */
    public static int NFD_SaveDialogU8(java.lang.String[] outPath,
        overrungl.nfd.NFDU8FilterItem filterList, java.lang.String defaultPath,
        java.lang.String defaultName) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath);
        int result = NFD_SaveDialogU8(seg, Marshal.marshal(filterList), filterItemCount(filterList), Marshal.marshal(stack, defaultPath), Marshal.marshal(stack, defaultName));
        if (result == NFD_OKAY) {
          copyOutPathU8(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #NFD_SaveDialogN_With(MemorySegment, MemorySegment)}
     */
    public static int NFD_SaveDialogN_With(java.lang.String[] outPath,
        overrungl.nfd.NFDSaveDialogNArgs args) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath, NFDInternal.nfdCharset);
        int result = NFD_SaveDialogN_With(seg, Marshal.marshal(args));
        if (result == NFD_OKAY) {
          copyOutPathN(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #NFD_SaveDialogU8_With(MemorySegment, MemorySegment)}
     */
    public static int NFD_SaveDialogU8_With(java.lang.String[] outPath,
        overrungl.nfd.NFDSaveDialogU8Args args) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath);
        int result = NFD_SaveDialogU8_With(seg, Marshal.marshal(args));
        if (result == NFD_OKAY) {
          copyOutPathU8(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #NFD_PickFolderN(MemorySegment, MemorySegment)}
     */
    public static int NFD_PickFolderN(java.lang.String[] outPath, java.lang.String defaultPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath, NFDInternal.nfdCharset);
        int result = NFD_PickFolderN(seg, Marshal.marshal(stack, defaultPath, NFDInternal.nfdCharset));
        if (result == NFD_OKAY) {
          copyOutPathN(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #NFD_PickFolderN(MemorySegment, MemorySegment)}
     */
    public static int NFD_PickFolder(java.lang.String[] outPath, java.lang.String defaultPath) {
      return NFD_PickFolderN(outPath, defaultPath);
    }
    /**
     * Overloads {@link #NFD_PickFolderU8(MemorySegment, MemorySegment)}
     */
    public static int NFD_PickFolderU8(java.lang.String[] outPath, java.lang.String defaultPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath);
        int result = NFD_PickFolderU8(seg, Marshal.marshal(stack, defaultPath));
        if (result == NFD_OKAY) {
          copyOutPathU8(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #NFD_PickFolderN_With(MemorySegment, MemorySegment)}
     */
    public static int NFD_PickFolderN_With(java.lang.String[] outPath,
        overrungl.nfd.NFDPickFolderNArgs args) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath, NFDInternal.nfdCharset);
        int result = NFD_PickFolderN_With(seg, Marshal.marshal(args));
        if (result == NFD_OKAY) {
          copyOutPathN(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #NFD_PickFolderU8_With(MemorySegment, MemorySegment)}
     */
    public static int NFD_PickFolderU8_With(java.lang.String[] outPath,
        overrungl.nfd.NFDPickFolderU8Args args) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath);
        int result = NFD_PickFolderU8_With(seg, Marshal.marshal(args));
        if (result == NFD_OKAY) {
          copyOutPathU8(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #NFD_PickFolderMultipleN(MemorySegment, MemorySegment)}
     */
    public static int NFD_PickFolderMultipleN(java.lang.foreign.MemorySegment outPaths,
        java.lang.String defaultPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        return NFD_PickFolderMultipleN(outPaths, Marshal.marshal(stack, defaultPath, NFDInternal.nfdCharset));
      }
    }
    /**
     * Overloads {@link #NFD_PickFolderMultipleN(MemorySegment, MemorySegment)}
     */
    public static int NFD_PickFolderMultiple(java.lang.foreign.MemorySegment outPaths,
        java.lang.String defaultPath) {
      return NFD_PickFolderMultipleN(outPaths, defaultPath);
    }
    /**
     * Overloads {@link #NFD_PickFolderMultipleU8(MemorySegment, MemorySegment)}
     */
    public static int NFD_PickFolderMultipleU8(java.lang.foreign.MemorySegment outPaths,
        java.lang.String defaultPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        return NFD_PickFolderMultipleU8(outPaths, Marshal.marshal(stack, defaultPath));
      }
    }
    /**
     * Overloads {@link #NFD_PickFolderMultipleN_With(MemorySegment, MemorySegment)}
     */
    public static int NFD_PickFolderMultipleN_With(java.lang.foreign.MemorySegment outPaths,
        overrungl.nfd.NFDPickFolderNArgs args) {
      return NFD_PickFolderMultipleN_With(outPaths, Marshal.marshal(args));
    }
    /**
     * Overloads {@link #NFD_PickFolderMultipleU8_With(MemorySegment, MemorySegment)}
     */
    public static int NFD_PickFolderMultipleU8_With(java.lang.foreign.MemorySegment outPaths,
        overrungl.nfd.NFDPickFolderU8Args args) {
      return NFD_PickFolderMultipleU8_With(outPaths, Marshal.marshal(args));
    }
    /**
     * Overloads {@link #NFD_PathSet_GetPathN(MemorySegment, long, MemorySegment)}
     */
    public static int NFD_PathSet_GetPathN(java.lang.foreign.MemorySegment pathSet, long index,
        java.lang.String[] outPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath, NFDInternal.nfdCharset);
        int result = NFD_PathSet_GetPathN(pathSet, index, seg);
        if (result == NFD_OKAY) {
          copyPathSetOutPathN(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #NFD_PathSet_GetPathN(MemorySegment, long, MemorySegment)}
     */
    public static int NFD_PathSet_GetPath(java.lang.foreign.MemorySegment pathSet, long index,
        java.lang.String[] outPath) {
      return NFD_PathSet_GetPathN(pathSet, index, outPath);
    }
    /**
     * Overloads {@link #NFD_PathSet_GetPathU8(MemorySegment, long, MemorySegment)}
     */
    public static int NFD_PathSet_GetPathU8(java.lang.foreign.MemorySegment pathSet, long index,
        java.lang.String[] outPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath);
        int result = NFD_PathSet_GetPathU8(pathSet, index, seg);
        if (result == NFD_OKAY) {
          copyPathSetOutPathU8(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #NFD_PathSet_EnumNextN(MemorySegment, MemorySegment)}
     */
    public static int NFD_PathSet_EnumNextN(java.lang.foreign.MemorySegment enumerator,
        java.lang.String[] outPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath, NFDInternal.nfdCharset);
        int result = NFD_PathSet_EnumNextN(enumerator, seg);
        if (result == NFD_OKAY) {
          copyPathSetOutPathN(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #NFD_PathSet_EnumNextN(MemorySegment, MemorySegment)}
     */
    public static int NFD_PathSet_EnumNext(java.lang.foreign.MemorySegment enumerator,
        java.lang.String[] outPath) {
      return NFD_PathSet_EnumNextN(enumerator, outPath);
    }
    /**
     * Overloads {@link #NFD_PathSet_EnumNextU8(MemorySegment, MemorySegment)}
     */
    public static int NFD_PathSet_EnumNextU8(java.lang.foreign.MemorySegment enumerator,
        java.lang.String[] outPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath);
        int result = NFD_PathSet_EnumNextU8(enumerator, seg);
        if (result == NFD_OKAY) {
          copyPathSetOutPathU8(seg, outPath);
        }
        return result;
      }
    }
    //endregion ---[END GENERATOR END]---
    //@formatter:on

    private static int filterItemCount(Struct<?> struct) {
        return struct != null ? Math.toIntExact(struct.elementCount()) : 0;
    }

    private static void copyOutPathN(MemorySegment src, String[] outPath) {
        Unmarshal.copy(src, outPath, NFDInternal.nfdCharset);
        MemorySegment segment = src.get(ValueLayout.ADDRESS, 0);
        if (!Unmarshal.isNullPointer(segment)) {
            NFD_FreePathN(segment);
        }
    }

    private static void copyOutPathU8(MemorySegment src, String[] outPath) {
        Unmarshal.copy(src, outPath);
        MemorySegment segment = src.get(ValueLayout.ADDRESS, 0);
        if (!Unmarshal.isNullPointer(segment)) {
            NFD_FreePathU8(segment);
        }
    }

    private static void copyPathSetOutPathN(MemorySegment src, String[] outPath) {
        Unmarshal.copy(src, outPath, NFDInternal.nfdCharset);
        MemorySegment segment = src.get(ValueLayout.ADDRESS, 0);
        if (!Unmarshal.isNullPointer(segment)) {
            NFD_PathSet_FreePathN(segment);
        }
    }

    private static void copyPathSetOutPathU8(MemorySegment src, String[] outPath) {
        Unmarshal.copy(src, outPath);
        MemorySegment segment = src.get(ValueLayout.ADDRESS, 0);
        if (!Unmarshal.isNullPointer(segment)) {
            NFD_PathSet_FreePathU8(segment);
        }
    }

    public static CNFD getInstance() {
        final class Holder {
            private static final CNFD INSTANCE = Downcall.load(MethodHandles.lookup(), NFDInternal.LOOKUP, DowncallOption.targetClass(CNFD.class));
        }
        return Holder.INSTANCE;
    }
}
