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
 *     NFD.init();
 *
 *     try (MemoryStack stack = MemoryStack.stackPush()) {
 *         String[] outPath = new String[1];
 *         var filterItem = NFDNFilterItem.create(stack,
 *             Map.entry("Source code", "java"),
 *             Map.entry("Image file", "png,jpg"));
 *         var result = NFD.openDialogN(outPath, filterItem, null);
 *         switch (result) {
 *             case ERROR -> println("Error: " + NFD.getError());
 *             case OKAY -> println("Success! " + outPath[0]);
 *             case CANCEL -> println("User pressed cancel.");
 *         }
 *     }
 *
 *     NFD.quit();
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
     * Overloads {@link #freePathN(java.lang.foreign.MemorySegment)}
     */
    @overrun.marshal.gen.Entrypoint("NFD_FreePathN")
    @overrun.marshal.gen.Skip
    public static void freePath(
        @overrun.marshal.gen.CType("nfdnchar_t*") java.lang.foreign.MemorySegment filePath) {
      getInstance().freePath(filePath);
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
     * @param filterCount If zero, filterList is ignored (you can use null).
     * @param defaultPath If null, the operating system will decide.
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
     * Overloads {@link #openDialogN(java.lang.foreign.MemorySegment, java.lang.foreign.MemorySegment, int, java.lang.foreign.MemorySegment)}
     * @param filterCount If zero, filterList is ignored (you can use null).
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogN")
    @overrun.marshal.gen.Skip
    public static int openDialog(
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment filterList,
        @overrun.marshal.gen.CType("nfdfiltersize_t") int filterCount,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().openDialog(outPath, filterList, filterCount, defaultPath);
    }
    /**
     * Single file open dialog
     * <p>
     * It's the caller's responsibility to free {@code outPath} via {@link #freePathU8} if this function returns
     * NFD_OKAY.
     * @param filterCount If zero, filterList is ignored (you can use null).
     * @param defaultPath If null, the operating system will decide.
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
     * @param filterCount If zero, filterList is ignored (you can use null).
     * @param defaultPath If null, the operating system will decide.
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
     * Overloads {@link #openDialogMultipleN(java.lang.foreign.MemorySegment, java.lang.foreign.MemorySegment, int, java.lang.foreign.MemorySegment)}
     * @param filterCount If zero, filterList is ignored (you can use null).
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_OpenDialogMultipleN")
    @overrun.marshal.gen.Skip
    public static int openDialogMultiple(
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment filterList,
        @overrun.marshal.gen.CType("nfdfiltersize_t") int filterCount,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().openDialogMultiple(outPaths, filterList, filterCount, defaultPath);
    }
    /**
     * Multiple file open dialog
     * <p>
     * It is the caller's responsibility to free {@code outPaths} via {@link #pathSetFree} if this function
     * returns NFD_OKAY.
     * @param filterCount If zero, filterList is ignored (you can use null).
     * @param defaultPath If null, the operating system will decide.
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
     * @param filterCount If zero, filterList is ignored (you can use null).
     * @param defaultPath If null, the operating system will decide.
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
     * Overloads {@link #saveDialogN(java.lang.foreign.MemorySegment, java.lang.foreign.MemorySegment, int, java.lang.foreign.MemorySegment, java.lang.foreign.MemorySegment)}
     * @param filterCount If zero, filterList is ignored (you can use null).
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_SaveDialogN")
    @overrun.marshal.gen.Skip
    public static int saveDialog(
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment filterList,
        @overrun.marshal.gen.CType("nfdfiltersize_t") int filterCount,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultName) {
      return getInstance().saveDialog(outPath, filterList, filterCount, defaultPath, defaultName);
    }
    /**
     * Save dialog
     * <p>
     * It is the caller's responsibility to free {@code outPath} via {@link #freePathU8} if this function returns
     * NFD_OKAY.
     * @param filterCount If zero, filterList is ignored (you can use null).
     * @param defaultPath If null, the operating system will decide.
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
     * Overloads {@link #pickFolderN(java.lang.foreign.MemorySegment, java.lang.foreign.MemorySegment)}
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderN")
    @overrun.marshal.gen.Skip
    public static int pickFolder(
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().pickFolder(outPath, defaultPath);
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
     * Overloads {@link #pickFolderMultipleN(java.lang.foreign.MemorySegment, java.lang.foreign.MemorySegment)}
     * @param defaultPath If null, the operating system will decide.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PickFolderMultipleN")
    @overrun.marshal.gen.Skip
    public static int pickFolderMultiple(
        @overrun.marshal.gen.CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths,
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
      return getInstance().pickFolderMultiple(outPaths, defaultPath);
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
     * Get the number of entries stored in pathSet.
     * <p>
     * Note: some paths might be invalid (NFD_ERROR will be returned by NFD_PathSet_GetPath),
     * so we might not actually have this number of usable paths.
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_GetCount")
    public static int pathSetGetCount(
        @overrun.marshal.gen.CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet,
        @overrun.marshal.gen.CType("nfdpathsetsize_t*") @overrun.marshal.gen.Ref long[] count) {
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
     * Overloads {@link #pathSetGetPathN(java.lang.foreign.MemorySegment, long, java.lang.foreign.MemorySegment)}
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_GetPathN")
    @overrun.marshal.gen.Skip
    public static int pathSetGetPath(
        @overrun.marshal.gen.CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet,
        @overrun.marshal.gen.CType("nfdpathsetsize_t") long index,
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath) {
      return getInstance().pathSetGetPath(pathSet, index, outPath);
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
     * Overloads {@link #pathSetFreePathN(java.lang.foreign.MemorySegment)}
     */
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_FreePathN")
    @overrun.marshal.gen.Skip
    public static void pathSetFreePath(
        @overrun.marshal.gen.CType("const nfdnchar_t*") java.lang.foreign.MemorySegment filePath) {
      getInstance().pathSetFreePath(filePath);
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
     * Overloads {@link #pathSetEnumNextN(java.lang.foreign.MemorySegment, java.lang.foreign.MemorySegment)}
     */
    @overrun.marshal.gen.CType("nfdresult_t")
    @overrun.marshal.gen.Entrypoint("NFD_PathSet_EnumNextN")
    @overrun.marshal.gen.Skip
    public static int pathSetEnumNext(
        @overrun.marshal.gen.CType("nfdpathsetenum_t*") java.lang.foreign.MemorySegment enumerator,
        @overrun.marshal.gen.CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath) {
      return getInstance().pathSetEnumNext(enumerator, outPath);
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
    /**
     * Overloads {@link #openDialogN(MemorySegment, MemorySegment, int, MemorySegment)}
     */
    public static int openDialogN(java.lang.String[] outPath, overrungl.nfd.NFDNFilterItem filterList,
        java.lang.String defaultPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath, NFDInternal.nfdCharset);
        int result = openDialogN(seg, Marshal.marshal(filterList), filterItemCount(filterList), Marshal.marshal(stack, defaultPath, NFDInternal.nfdCharset));
        if (result == OKAY) {
          copyOutPathN(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #openDialogN(MemorySegment, MemorySegment, int, MemorySegment)}
     */
    public static int openDialog(java.lang.String[] outPath, overrungl.nfd.NFDNFilterItem filterList,
        java.lang.String defaultPath) {
      return openDialogN(outPath, filterList, defaultPath);
    }
    /**
     * Overloads {@link #openDialogU8(MemorySegment, MemorySegment, int, MemorySegment)}
     */
    public static int openDialogU8(java.lang.String[] outPath, overrungl.nfd.NFDU8FilterItem filterList,
        java.lang.String defaultPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath);
        int result = openDialogU8(seg, Marshal.marshal(filterList), filterItemCount(filterList), Marshal.marshal(stack, defaultPath));
        if (result == OKAY) {
          copyOutPathU8(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #openDialogNWith(MemorySegment, MemorySegment)}
     */
    public static int openDialogNWith(java.lang.String[] outPath,
        overrungl.nfd.NFDOpenDialogNArgs args) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath, NFDInternal.nfdCharset);
        int result = openDialogNWith(seg, Marshal.marshal(args));
        if (result == OKAY) {
          copyOutPathN(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #openDialogU8With(MemorySegment, MemorySegment)}
     */
    public static int openDialogU8With(java.lang.String[] outPath,
        overrungl.nfd.NFDOpenDialogU8Args args) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath);
        int result = openDialogU8With(seg, Marshal.marshal(args));
        if (result == OKAY) {
          copyOutPathU8(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #openDialogMultipleN(MemorySegment, MemorySegment, int, MemorySegment)}
     */
    public static int openDialogMultipleN(java.lang.foreign.MemorySegment outPaths,
        overrungl.nfd.NFDNFilterItem filterList, java.lang.String defaultPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        return openDialogMultipleN(outPaths, Marshal.marshal(filterList), filterItemCount(filterList), Marshal.marshal(stack, defaultPath, NFDInternal.nfdCharset));
      }
    }
    /**
     * Overloads {@link #openDialogMultipleN(MemorySegment, MemorySegment, int, MemorySegment)}
     */
    public static int openDialogMultiple(java.lang.foreign.MemorySegment outPaths,
        overrungl.nfd.NFDNFilterItem filterList, java.lang.String defaultPath) {
      return openDialogMultipleN(outPaths, filterList, defaultPath);
    }
    /**
     * Overloads {@link #openDialogMultipleU8(MemorySegment, MemorySegment, int, MemorySegment)}
     */
    public static int openDialogMultipleU8(java.lang.foreign.MemorySegment outPaths,
        overrungl.nfd.NFDU8FilterItem filterList, java.lang.String defaultPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        return openDialogMultipleU8(outPaths, Marshal.marshal(filterList), filterItemCount(filterList), Marshal.marshal(stack, defaultPath));
      }
    }
    /**
     * Overloads {@link #openDialogMultipleNWith(MemorySegment, MemorySegment)}
     */
    public static int openDialogMultipleNWith(java.lang.foreign.MemorySegment outPaths,
        overrungl.nfd.NFDOpenDialogNArgs args) {
      return openDialogMultipleNWith(outPaths, Marshal.marshal(args));
    }
    /**
     * Overloads {@link #openDialogMultipleU8With(MemorySegment, MemorySegment)}
     */
    public static int openDialogMultipleU8With(java.lang.foreign.MemorySegment outPaths,
        overrungl.nfd.NFDOpenDialogU8Args args) {
      return openDialogMultipleU8With(outPaths, Marshal.marshal(args));
    }
    /**
     * Overloads {@link #saveDialogN(MemorySegment, MemorySegment, int, MemorySegment, MemorySegment)}
     */
    public static int saveDialogN(java.lang.String[] outPath, overrungl.nfd.NFDNFilterItem filterList,
        java.lang.String defaultPath, java.lang.String defaultName) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath, NFDInternal.nfdCharset);
        int result = saveDialogN(seg, Marshal.marshal(filterList), filterItemCount(filterList), Marshal.marshal(stack, defaultPath, NFDInternal.nfdCharset), Marshal.marshal(stack, defaultName, NFDInternal.nfdCharset));
        if (result == OKAY) {
          copyOutPathN(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #saveDialogN(MemorySegment, MemorySegment, int, MemorySegment, MemorySegment)}
     */
    public static int saveDialog(java.lang.String[] outPath, overrungl.nfd.NFDNFilterItem filterList,
        java.lang.String defaultPath, java.lang.String defaultName) {
      return saveDialogN(outPath, filterList, defaultPath, defaultName);
    }
    /**
     * Overloads {@link #saveDialogU8(MemorySegment, MemorySegment, int, MemorySegment, MemorySegment)}
     */
    public static int saveDialogU8(java.lang.String[] outPath, overrungl.nfd.NFDU8FilterItem filterList,
        java.lang.String defaultPath, java.lang.String defaultName) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath);
        int result = saveDialogU8(seg, Marshal.marshal(filterList), filterItemCount(filterList), Marshal.marshal(stack, defaultPath), Marshal.marshal(stack, defaultName));
        if (result == OKAY) {
          copyOutPathU8(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #saveDialogNWith(MemorySegment, MemorySegment)}
     */
    public static int saveDialogNWith(java.lang.String[] outPath,
        overrungl.nfd.NFDSaveDialogNArgs args) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath, NFDInternal.nfdCharset);
        int result = saveDialogNWith(seg, Marshal.marshal(args));
        if (result == OKAY) {
          copyOutPathN(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #saveDialogU8With(MemorySegment, MemorySegment)}
     */
    public static int saveDialogU8With(java.lang.String[] outPath,
        overrungl.nfd.NFDSaveDialogU8Args args) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath);
        int result = saveDialogU8With(seg, Marshal.marshal(args));
        if (result == OKAY) {
          copyOutPathU8(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #pickFolderN(MemorySegment, MemorySegment)}
     */
    public static int pickFolderN(java.lang.String[] outPath, java.lang.String defaultPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath, NFDInternal.nfdCharset);
        int result = pickFolderN(seg, Marshal.marshal(stack, defaultPath, NFDInternal.nfdCharset));
        if (result == OKAY) {
          copyOutPathN(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #pickFolderN(MemorySegment, MemorySegment)}
     */
    public static int pickFolder(java.lang.String[] outPath, java.lang.String defaultPath) {
      return pickFolderN(outPath, defaultPath);
    }
    /**
     * Overloads {@link #pickFolderU8(MemorySegment, MemorySegment)}
     */
    public static int pickFolderU8(java.lang.String[] outPath, java.lang.String defaultPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath);
        int result = pickFolderU8(seg, Marshal.marshal(stack, defaultPath));
        if (result == OKAY) {
          copyOutPathU8(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #pickFolderNWith(MemorySegment, MemorySegment)}
     */
    public static int pickFolderNWith(java.lang.String[] outPath,
        overrungl.nfd.NFDPickFolderNArgs args) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath, NFDInternal.nfdCharset);
        int result = pickFolderNWith(seg, Marshal.marshal(args));
        if (result == OKAY) {
          copyOutPathN(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #pickFolderU8With(MemorySegment, MemorySegment)}
     */
    public static int pickFolderU8With(java.lang.String[] outPath,
        overrungl.nfd.NFDPickFolderU8Args args) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath);
        int result = pickFolderU8With(seg, Marshal.marshal(args));
        if (result == OKAY) {
          copyOutPathU8(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #pickFolderMultipleN(MemorySegment, MemorySegment)}
     */
    public static int pickFolderMultipleN(java.lang.foreign.MemorySegment outPaths,
        java.lang.String defaultPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        return pickFolderMultipleN(outPaths, Marshal.marshal(stack, defaultPath, NFDInternal.nfdCharset));
      }
    }
    /**
     * Overloads {@link #pickFolderMultipleN(MemorySegment, MemorySegment)}
     */
    public static int pickFolderMultiple(java.lang.foreign.MemorySegment outPaths,
        java.lang.String defaultPath) {
      return pickFolderMultipleN(outPaths, defaultPath);
    }
    /**
     * Overloads {@link #pickFolderMultipleU8(MemorySegment, MemorySegment)}
     */
    public static int pickFolderMultipleU8(java.lang.foreign.MemorySegment outPaths,
        java.lang.String defaultPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        return pickFolderMultipleU8(outPaths, Marshal.marshal(stack, defaultPath));
      }
    }
    /**
     * Overloads {@link #pickFolderMultipleNWith(MemorySegment, MemorySegment)}
     */
    public static int pickFolderMultipleNWith(java.lang.foreign.MemorySegment outPaths,
        overrungl.nfd.NFDPickFolderNArgs args) {
      return pickFolderMultipleNWith(outPaths, Marshal.marshal(args));
    }
    /**
     * Overloads {@link #pickFolderMultipleU8With(MemorySegment, MemorySegment)}
     */
    public static int pickFolderMultipleU8With(java.lang.foreign.MemorySegment outPaths,
        overrungl.nfd.NFDPickFolderU8Args args) {
      return pickFolderMultipleU8With(outPaths, Marshal.marshal(args));
    }
    /**
     * Overloads {@link #pathSetGetPathN(MemorySegment, long, MemorySegment)}
     */
    public static int pathSetGetPathN(java.lang.foreign.MemorySegment pathSet, long index,
        java.lang.String[] outPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath, NFDInternal.nfdCharset);
        int result = pathSetGetPathN(pathSet, index, seg);
        if (result == OKAY) {
          copyPathSetOutPathN(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #pathSetGetPathN(MemorySegment, long, MemorySegment)}
     */
    public static int pathSetGetPath(java.lang.foreign.MemorySegment pathSet, long index,
        java.lang.String[] outPath) {
      return pathSetGetPathN(pathSet, index, outPath);
    }
    /**
     * Overloads {@link #pathSetGetPathU8(MemorySegment, long, MemorySegment)}
     */
    public static int pathSetGetPathU8(java.lang.foreign.MemorySegment pathSet, long index,
        java.lang.String[] outPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath);
        int result = pathSetGetPathU8(pathSet, index, seg);
        if (result == OKAY) {
          copyPathSetOutPathU8(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #pathSetEnumNextN(MemorySegment, MemorySegment)}
     */
    public static int pathSetEnumNextN(java.lang.foreign.MemorySegment enumerator,
        java.lang.String[] outPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath, NFDInternal.nfdCharset);
        int result = pathSetEnumNextN(enumerator, seg);
        if (result == OKAY) {
          copyPathSetOutPathN(seg, outPath);
        }
        return result;
      }
    }
    /**
     * Overloads {@link #pathSetEnumNextN(MemorySegment, MemorySegment)}
     */
    public static int pathSetEnumNext(java.lang.foreign.MemorySegment enumerator,
        java.lang.String[] outPath) {
      return pathSetEnumNextN(enumerator, outPath);
    }
    /**
     * Overloads {@link #pathSetEnumNextU8(MemorySegment, MemorySegment)}
     */
    public static int pathSetEnumNextU8(java.lang.foreign.MemorySegment enumerator,
        java.lang.String[] outPath) {
      try (MemoryStack stack = MemoryStack.pushLocal()) {
        var seg = Marshal.marshal(stack, outPath);
        int result = pathSetEnumNextU8(enumerator, seg);
        if (result == OKAY) {
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
            freePathN(segment);
        }
    }

    private static void copyOutPathU8(MemorySegment src, String[] outPath) {
        Unmarshal.copy(src, outPath);
        MemorySegment segment = src.get(ValueLayout.ADDRESS, 0);
        if (!Unmarshal.isNullPointer(segment)) {
            freePathU8(segment);
        }
    }

    private static void copyPathSetOutPathN(MemorySegment src, String[] outPath) {
        Unmarshal.copy(src, outPath, NFDInternal.nfdCharset);
        MemorySegment segment = src.get(ValueLayout.ADDRESS, 0);
        if (!Unmarshal.isNullPointer(segment)) {
            pathSetFreePathN(segment);
        }
    }

    private static void copyPathSetOutPathU8(MemorySegment src, String[] outPath) {
        Unmarshal.copy(src, outPath);
        MemorySegment segment = src.get(ValueLayout.ADDRESS, 0);
        if (!Unmarshal.isNullPointer(segment)) {
            pathSetFreePathU8(segment);
        }
    }

    public static CNFD getInstance() {
        final class Holder {
            private static final CNFD INSTANCE = Downcall.load(MethodHandles.lookup(), NFDInternal.LOOKUP, DowncallOption.targetClass(CNFD.class));
        }
        return Holder.INSTANCE;
    }
}
