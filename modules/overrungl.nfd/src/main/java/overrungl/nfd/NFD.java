/*
 * MIT License
 *
 * Copyright (c) 2024-2025 Overrun Organization
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

import overrungl.annotation.CType;
import overrungl.annotation.Out;
import overrungl.internal.RuntimeHelper;
import overrungl.struct.Struct;
import overrungl.util.Marshal;
import overrungl.util.MemoryStack;
import overrungl.util.Unmarshal;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

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
 *         var filterItem = NFDFilterItem.create(stack,
 *             Map.entry("Source code", "java"),
 *             Map.entry("Image file", "png,jpg"));
 *         var result = NFD_OpenDialog(outPath, filterItem, null);
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
 * var filterItem = NFDFilterItem.create(allocator,
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
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    ///#### Documentation of fields
    ///##### NFD_ERROR
    ///Programmatic error
    ///##### NFD_OKAY
    ///User pressed okay, or successful return
    ///##### NFD_CANCEL
    ///User pressed cancel
    public static final int
        NFD_ERROR = 0,
        NFD_OKAY = 1,
        NFD_CANCEL = 2;
    ///The native window handle type.
    ///Wayland support will be implemented separately in the future
    ///#### Documentation of fields
    ///##### NFD_WINDOW_HANDLE_TYPE_WINDOWS
    ///Windows: handle is HWND (the Windows API typedefs this to void*)
    ///##### NFD_WINDOW_HANDLE_TYPE_COCOA
    ///Cocoa: handle is NSWindow*
    ///##### NFD_WINDOW_HANDLE_TYPE_X11
    ///X11: handle is Window
    public static final int
        NFD_WINDOW_HANDLE_TYPE_UNSET = 0,
        NFD_WINDOW_HANDLE_TYPE_WINDOWS = 1,
        NFD_WINDOW_HANDLE_TYPE_COCOA = 2,
        NFD_WINDOW_HANDLE_TYPE_X11 = 3;
    ///This is a unique identifier tagged to all the NFD_*With() function calls, for backward
    ///compatibility purposes. <p>There is usually no need to use this directly, unless you want to use
    ///NFD differently depending on the version you're building with.
    public static final int NFD_INTERFACE_VERSION = 1;
    //endregion
    //region Method handles
    /// Method handles.
    public static final class Handles {
        /// The method handle of `NFD_FreePathN`.
        public static final MethodHandle MH_NFD_FreePathN = RuntimeHelper.downcall(NFDInternal.LOOKUP, "NFD_FreePathN", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `NFD_Init`.
        public static final MethodHandle MH_NFD_Init = RuntimeHelper.downcall(NFDInternal.LOOKUP, "NFD_Init", FunctionDescriptor.of(ValueLayout.JAVA_INT));
        /// The method handle of `NFD_Quit`.
        public static final MethodHandle MH_NFD_Quit = RuntimeHelper.downcall(NFDInternal.LOOKUP, "NFD_Quit", FunctionDescriptor.ofVoid());
        /// The method handle of `NFD_OpenDialogN`.
        public static final MethodHandle MH_NFD_OpenDialogN = RuntimeHelper.downcall(NFDInternal.LOOKUP, "NFD_OpenDialogN", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
        /// The method handle of `NFD_OpenDialogN_With_Impl`.
        public static final MethodHandle MH_NFD_OpenDialogN_With_Impl = RuntimeHelper.downcall(NFDInternal.LOOKUP, "NFD_OpenDialogN_With_Impl", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_OpenDialogMultipleN`.
        public static final MethodHandle MH_NFD_OpenDialogMultipleN = RuntimeHelper.downcall(NFDInternal.LOOKUP, "NFD_OpenDialogMultipleN", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
        /// The method handle of `NFD_OpenDialogMultipleN_With_Impl`.
        public static final MethodHandle MH_NFD_OpenDialogMultipleN_With_Impl = RuntimeHelper.downcall(NFDInternal.LOOKUP, "NFD_OpenDialogMultipleN_With_Impl", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_SaveDialogN`.
        public static final MethodHandle MH_NFD_SaveDialogN = RuntimeHelper.downcall(NFDInternal.LOOKUP, "NFD_SaveDialogN", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT, Unmarshal.STR_LAYOUT));
        /// The method handle of `NFD_SaveDialogN_With_Impl`.
        public static final MethodHandle MH_NFD_SaveDialogN_With_Impl = RuntimeHelper.downcall(NFDInternal.LOOKUP, "NFD_SaveDialogN_With_Impl", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_PickFolderN`.
        public static final MethodHandle MH_NFD_PickFolderN = RuntimeHelper.downcall(NFDInternal.LOOKUP, "NFD_PickFolderN", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `NFD_PickFolderN_With_Impl`.
        public static final MethodHandle MH_NFD_PickFolderN_With_Impl = RuntimeHelper.downcall(NFDInternal.LOOKUP, "NFD_PickFolderN_With_Impl", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_PickFolderMultipleN`.
        public static final MethodHandle MH_NFD_PickFolderMultipleN = RuntimeHelper.downcall(NFDInternal.LOOKUP, "NFD_PickFolderMultipleN", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `NFD_PickFolderMultipleN_With_Impl`.
        public static final MethodHandle MH_NFD_PickFolderMultipleN_With_Impl = RuntimeHelper.downcall(NFDInternal.LOOKUP, "NFD_PickFolderMultipleN_With_Impl", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_GetError`.
        public static final MethodHandle MH_NFD_GetError = RuntimeHelper.downcall(NFDInternal.LOOKUP, "NFD_GetError", FunctionDescriptor.of(Unmarshal.STR_LAYOUT));
        /// The method handle of `NFD_ClearError`.
        public static final MethodHandle MH_NFD_ClearError = RuntimeHelper.downcall(NFDInternal.LOOKUP, "NFD_ClearError", FunctionDescriptor.ofVoid());
        /// The method handle of `NFD_PathSet_GetCount`.
        public static final MethodHandle MH_NFD_PathSet_GetCount = RuntimeHelper.downcall(NFDInternal.LOOKUP, "NFD_PathSet_GetCount", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_PathSet_GetPathN`.
        public static final MethodHandle MH_NFD_PathSet_GetPathN = RuntimeHelper.downcall(NFDInternal.LOOKUP, "NFD_PathSet_GetPathN", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        /// The method handle of `NFD_PathSet_FreePathN`.
        public static final MethodHandle MH_NFD_PathSet_FreePathN = RuntimeHelper.downcall(NFDInternal.LOOKUP, "NFD_PathSet_FreePathN", FunctionDescriptor.ofVoid(Unmarshal.STR_LAYOUT));
        /// The method handle of `NFD_PathSet_GetEnum`.
        public static final MethodHandle MH_NFD_PathSet_GetEnum = RuntimeHelper.downcall(NFDInternal.LOOKUP, "NFD_PathSet_GetEnum", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_PathSet_FreeEnum`.
        public static final MethodHandle MH_NFD_PathSet_FreeEnum = RuntimeHelper.downcall(NFDInternal.LOOKUP, "NFD_PathSet_FreeEnum", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `NFD_PathSet_EnumNextN`.
        public static final MethodHandle MH_NFD_PathSet_EnumNextN = RuntimeHelper.downcall(NFDInternal.LOOKUP, "NFD_PathSet_EnumNextN", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_PathSet_Free`.
        public static final MethodHandle MH_NFD_PathSet_Free = RuntimeHelper.downcall(NFDInternal.LOOKUP, "NFD_PathSet_Free", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    }
    //endregion

    ///Free a file path that was returned by the dialogs.
    ///
    ///Note: use NFD_PathSet_FreePath() to free path from pathset instead of this function.
    public static void NFD_FreePath(@CType("nfdnchar_t*") java.lang.foreign.MemorySegment filePath) {
        try {
            Handles.MH_NFD_FreePathN.invokeExact(filePath);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_FreePathN", e); }
    }

    ///Initialize NFD. Call this for every thread that might use NFD, before calling any other NFD
    ///functions on that thread.
    public static @CType("nfdresult_t") int NFD_Init() {
        try {
            return (int) Handles.MH_NFD_Init.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in NFD_Init", e); }
    }

    ///Call this to de-initialize NFD, if [NFD_Init][#NFD_Init()] returned NFD_OKAY.
    public static void NFD_Quit() {
        try {
            Handles.MH_NFD_Quit.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in NFD_Quit", e); }
    }

    ///Single file open dialog
    ///
    ///It's the caller's responsibility to free `outPath` via NFD_FreePath() if this function returns
    ///NFD_OKAY.
    ///@param filterCount If zero, filterList is ignored (you can use null).
    ///@param defaultPath If null, the operating system will decide.
    public static @CType("nfdresult_t") int NFD_OpenDialog(@CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath, @CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment filterList, @CType("nfdfiltersize_t") int filterCount, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
        try {
            return (int) Handles.MH_NFD_OpenDialogN.invokeExact(outPath, filterList, filterCount, defaultPath);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_OpenDialogN", e); }
    }

    ///This function is a library implementation detail.  Please use NFD_OpenDialog_With() instead.
    public static @CType("nfdresult_t") int NFD_OpenDialog_With_Impl(@CType("nfdversion_t") int version, @CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath, @CType("const nfdopendialognargs_t*") java.lang.foreign.MemorySegment args) {
        try {
            return (int) Handles.MH_NFD_OpenDialogN_With_Impl.invokeExact(version, outPath, args);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_OpenDialogN_With_Impl", e); }
    }

    ///Single file open dialog, with additional parameters.
    ///
    ///It is the caller's responsibility to free `outPath` via NFD_FreePath() if this function
    ///returns NFD_OKAY.  See documentation of [NFDOpenDialogArgs] for details.
    public static @CType("nfdresult_t") int NFD_OpenDialog_With(@CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath, @CType("const nfdopendialognargs_t*") java.lang.foreign.MemorySegment args) {
        return NFD_OpenDialog_With_Impl(NFD_INTERFACE_VERSION, outPath, args);
    }

    ///Multiple file open dialog
    ///
    ///It is the caller's responsibility to free `outPaths` via NFD_PathSet_Free() if this function
    ///returns NFD_OKAY.
    ///@param filterCount If zero, filterList is ignored (you can use null).
    ///@param defaultPath If null, the operating system will decide.
    public static @CType("nfdresult_t") int NFD_OpenDialogMultiple(@CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths, @CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment filterList, @CType("nfdfiltersize_t") int filterCount, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
        try {
            return (int) Handles.MH_NFD_OpenDialogMultipleN.invokeExact(outPaths, filterList, filterCount, defaultPath);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_OpenDialogMultipleN", e); }
    }

    ///This function is a library implementation detail.  Please use NFD_OpenDialogMultiple_With()
    ///instead.
    public static @CType("nfdresult_t") int NFD_OpenDialogMultiple_With_Impl(@CType("nfdversion_t") int version, @CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths, @CType("const nfdopendialognargs_t*") java.lang.foreign.MemorySegment args) {
        try {
            return (int) Handles.MH_NFD_OpenDialogMultipleN_With_Impl.invokeExact(version, outPaths, args);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_OpenDialogMultipleN_With_Impl", e); }
    }

    ///Multiple file open dialog, with additional parameters.
    ///
    ///It is the caller's responsibility to free `outPaths` via NFD_PathSet_Free() if this function
    ///returns NFD_OKAY.  See documentation of [NFDOpenDialogArgs] for details.
    public static @CType("nfdresult_t") int NFD_OpenDialogMultiple_With(@CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths, @CType("const nfdopendialognargs_t*") java.lang.foreign.MemorySegment args) {
        return NFD_OpenDialogMultiple_With_Impl(NFD_INTERFACE_VERSION, outPaths, args);
    }

    ///Save dialog
    ///
    ///It is the caller's responsibility to free `outPath` via NFD_FreePath() if this function returns
    ///NFD_OKAY.
    ///@param filterCount If zero, filterList is ignored (you can use null).
    ///@param defaultPath If null, the operating system will decide.
    public static @CType("nfdresult_t") int NFD_SaveDialog(@CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath, @CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment filterList, @CType("nfdfiltersize_t") int filterCount, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultName) {
        try {
            return (int) Handles.MH_NFD_SaveDialogN.invokeExact(outPath, filterList, filterCount, defaultPath, defaultName);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_SaveDialogN", e); }
    }

    ///This function is a library implementation detail.  Please use NFD_SaveDialog_With() instead.
    public static @CType("nfdresult_t") int NFD_SaveDialog_With_Impl(@CType("nfdversion_t") int version, @CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath, @CType("const nfdsavedialognargs_t*") java.lang.foreign.MemorySegment args) {
        try {
            return (int) Handles.MH_NFD_SaveDialogN_With_Impl.invokeExact(version, outPath, args);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_SaveDialogN_With_Impl", e); }
    }

    ///Single file save dialog, with additional parameters.
    ///
    ///It is the caller's responsibility to free `outPath` via NFD_FreePath() if this function
    ///returns NFD_OKAY.  See documentation of [NFDSaveDialogArgs] for details.
    public static @CType("nfdresult_t") int NFD_SaveDialog_With(@CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath, @CType("const nfdsavedialognargs_t*") java.lang.foreign.MemorySegment args) {
        return NFD_SaveDialog_With_Impl(NFD_INTERFACE_VERSION, outPath, args);
    }

    ///Select single folder dialog
    ///
    ///It is the caller's responsibility to free `outPath` via NFD_FreePath() if this function returns
    ///NFD_OKAY.
    ///@param defaultPath If null, the operating system will decide.
    public static @CType("nfdresult_t") int NFD_PickFolder(@CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
        try {
            return (int) Handles.MH_NFD_PickFolderN.invokeExact(outPath, defaultPath);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PickFolderN", e); }
    }

    ///This function is a library implementation detail.  Please use NFD_PickFolder_With() instead.
    public static @CType("nfdresult_t") int NFD_PickFolder_With_Impl(@CType("nfdversion_t") int version, @CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath, @CType("const nfdpickfoldernargs_t*") java.lang.foreign.MemorySegment args) {
        try {
            return (int) Handles.MH_NFD_PickFolderN_With_Impl.invokeExact(version, outPath, args);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PickFolderN_With_Impl", e); }
    }

    ///Select single folder dialog, with additional parameters.
    ///
    ///It is the caller's responsibility to free `outPath` via NFD_FreePath() if this function
    ///returns NFD_OKAY.  See documentation of [NFDPickFolderArgs] for details.
    public static @CType("nfdresult_t") int NFD_PickFolder_With(@CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath, @CType("const nfdpickfoldernargs_t*") java.lang.foreign.MemorySegment args) {
        return NFD_PickFolder_With_Impl(NFD_INTERFACE_VERSION, outPath, args);
    }

    ///Select multiple folder dialog
    ///
    ///It is the caller's responsibility to free `outPaths` via NFD_PathSet_Free() if this function
    ///NFD_OKAY.
    ///@param defaultPath If null, the operating system will decide.
    public static @CType("nfdresult_t") int NFD_PickFolderMultiple(@CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
        try {
            return (int) Handles.MH_NFD_PickFolderMultipleN.invokeExact(outPaths, defaultPath);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PickFolderMultipleN", e); }
    }

    ///This function is a library implementation detail.  Please use NFD_PickFolderMultiple_With() instead.
    public static @CType("nfdresult_t") int NFD_PickFolderMultiple_With_Impl(@CType("nfdversion_t") int version, @CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths, @CType("const nfdpickfoldernargs_t*") java.lang.foreign.MemorySegment args) {
        try {
            return (int) Handles.MH_NFD_PickFolderMultipleN_With_Impl.invokeExact(version, outPaths, args);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PickFolderMultipleN_With_Impl", e); }
    }

    ///Select multiple folder dialog, with additional parameters.
    ///
    ///It is the caller's responsibility to free `outPaths` via NFD_PathSet_Free() if this function
    ///returns NFD_OKAY.  See documentation of [NFDPickFolderArgs] for details.
    public static @CType("nfdresult_t") int NFD_PickFolderMultiple_With(@CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths, @CType("const nfdpickfoldernargs_t*") java.lang.foreign.MemorySegment args) {
        return NFD_PickFolderMultiple_With_Impl(NFD_INTERFACE_VERSION, outPaths, args);
    }

    ///Get the last error
    ///
    ///This is set when a function returns NFD_ERROR.
    ///The memory is owned by NFD and should not be freed by user code.
    ///This is *always* ASCII printable characters, so it can be interpreted as UTF-8 without any
    ///conversion.
    ///@return The last error that was set, or null if there is no error.
    public static @CType("const char*") java.lang.foreign.MemorySegment NFD_GetError_() {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_NFD_GetError.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in NFD_GetError", e); }
    }

    ///Get the last error
    ///
    ///This is set when a function returns NFD_ERROR.
    ///The memory is owned by NFD and should not be freed by user code.
    ///This is *always* ASCII printable characters, so it can be interpreted as UTF-8 without any
    ///conversion.
    ///@return The last error that was set, or null if there is no error.
    public static @CType("const char*") java.lang.String NFD_GetError() {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_NFD_GetError.invokeExact());
        } catch (Throwable e) { throw new RuntimeException("error in NFD_GetError", e); }
    }

    ///Clear the error.
    public static void NFD_ClearError() {
        try {
            Handles.MH_NFD_ClearError.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in NFD_ClearError", e); }
    }

    ///Get the number of entries stored in pathSet.
    ///
    ///Note: some paths might be invalid (NFD_ERROR will be returned by NFD_PathSet_GetPath),
    ///so we might not actually have this number of usable paths.
    public static @CType("nfdresult_t") int NFD_PathSet_GetCount(@CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet, @Out @CType("nfdpathsetsize_t*") java.lang.foreign.MemorySegment count) {
        try {
            return (int) Handles.MH_NFD_PathSet_GetCount.invokeExact(pathSet, count);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PathSet_GetCount", e); }
    }

    ///Get the number of entries stored in pathSet.
    ///
    ///Note: some paths might be invalid (NFD_ERROR will be returned by NFD_PathSet_GetPath),
    ///so we might not actually have this number of usable paths.
    public static @CType("nfdresult_t") int NFD_PathSet_GetCount(@CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet, @Out long[] count) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_count = Marshal.marshal(__overrungl_stack, count);
            var __overrungl_result = (int) Handles.MH_NFD_PathSet_GetCount.invokeExact(pathSet, __overrungl_ref_count);
            Unmarshal.copy(__overrungl_ref_count, count);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PathSet_GetCount", e); }
    }

    ///Get the native path at offset index.
    ///<p>
    ///It is the caller's responsibility to free `outPath` via NFD_PathSet_FreePath() if this function
    ///returns NFD_OKAY.
    public static @CType("nfdresult_t") int NFD_PathSet_GetPath(@CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet, @CType("nfdpathsetsize_t") long index, @CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath) {
        try {
            return (int) Handles.MH_NFD_PathSet_GetPathN.invokeExact(pathSet, index, outPath);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PathSet_GetPathN", e); }
    }

    ///Free the path gotten by NFD_PathSet_GetPath().
    public static void NFD_PathSet_FreePath(@CType("const nfdnchar_t*") java.lang.foreign.MemorySegment filePath) {
        try {
            Handles.MH_NFD_PathSet_FreePathN.invokeExact(filePath);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PathSet_FreePathN", e); }
    }

    ///Gets an enumerator of the path set.
    ///
    ///It is the caller's responsibility to free `enumerator` via NFD_PathSet_FreeEnum()
    ///if this function returns NFD_OKAY, and it should be freed before freeing the pathset.
    public static @CType("nfdresult_t") int NFD_PathSet_GetEnum(@CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet, @CType("nfdpathsetenum_t*") java.lang.foreign.MemorySegment outEnumerator) {
        try {
            return (int) Handles.MH_NFD_PathSet_GetEnum.invokeExact(pathSet, outEnumerator);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PathSet_GetEnum", e); }
    }

    ///Frees an enumerator of the path set.
    public static void NFD_PathSet_FreeEnum(@CType("nfdpathsetenum_t*") java.lang.foreign.MemorySegment enumerator) {
        try {
            Handles.MH_NFD_PathSet_FreeEnum.invokeExact(enumerator);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PathSet_FreeEnum", e); }
    }

    ///Gets the next item from the path set enumerator.
    ///
    ///If there are no more items, then *outPaths will be set to null.
    ///It is the caller's responsibility to free `*outPath` via NFD_PathSet_FreePath()
    ///if this function returns NFD_OKAY and `*outPath` is not null.
    public static @CType("nfdresult_t") int NFD_PathSet_EnumNext(@CType("nfdpathsetenum_t*") java.lang.foreign.MemorySegment enumerator, @CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath) {
        try {
            return (int) Handles.MH_NFD_PathSet_EnumNextN.invokeExact(enumerator, outPath);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PathSet_EnumNextN", e); }
    }

    ///Free the pathSet
    public static void NFD_PathSet_Free(@CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet) {
        try {
            Handles.MH_NFD_PathSet_Free.invokeExact(pathSet);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PathSet_Free", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private NFD() {
    }

    /// Overloads [NFD_OpenDialog][#NFD_OpenDialog(MemorySegment, MemorySegment, int, MemorySegment)]
    public static int NFD_OpenDialog(String[] outPath, NFDFilterItem filterList, String defaultPath) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = NFDInternal.marshalString(stack, outPath);
            int result = NFD_OpenDialog(seg, Marshal.marshal(filterList), filterItemCount(filterList), NFDInternal.marshalString(stack, defaultPath));
            if (result == NFD_OKAY) {
                copyOutPath(seg, outPath);
            }
            return result;
        }
    }

    /// Overloads [NFD_OpenDialog_With][#NFD_OpenDialog_With(MemorySegment, MemorySegment)]
    public static int NFD_OpenDialog_With(String[] outPath, NFDOpenDialogArgs args) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = NFDInternal.marshalString(stack, outPath);
            int result = NFD_OpenDialog_With(seg, Marshal.marshal(args));
            if (result == NFD_OKAY) {
                copyOutPath(seg, outPath);
            }
            return result;
        }
    }

    /// Overloads [NFD_OpenDialogMultiple][#NFD_OpenDialogMultiple(MemorySegment, MemorySegment, int, MemorySegment)]
    public static int NFD_OpenDialogMultiple(MemorySegment outPaths, NFDFilterItem filterList, String defaultPath) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            return NFD_OpenDialogMultiple(outPaths, Marshal.marshal(filterList), filterItemCount(filterList), NFDInternal.marshalString(stack, defaultPath));
        }
    }

    /// Overloads [NFD_OpenDialogMultiple_With][#NFD_OpenDialogMultiple_With(MemorySegment, MemorySegment)]
    public static int NFD_OpenDialogMultiple_With(MemorySegment outPaths, NFDOpenDialogArgs args) {
        return NFD_OpenDialogMultiple_With(outPaths, Marshal.marshal(args));
    }

    /// Overloads [NFD_SaveDialog][#NFD_SaveDialog(MemorySegment, MemorySegment, int, MemorySegment, MemorySegment)]
    public static int NFD_SaveDialog(String[] outPath, NFDFilterItem filterList, String defaultPath, String defaultName) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = NFDInternal.marshalString(stack, outPath);
            int result = NFD_SaveDialog(seg, Marshal.marshal(filterList), filterItemCount(filterList), NFDInternal.marshalString(stack, defaultPath), NFDInternal.marshalString(stack, defaultName));
            if (result == NFD_OKAY) {
                copyOutPath(seg, outPath);
            }
            return result;
        }
    }

    /// Overloads [NFD_SaveDialog_With][#NFD_SaveDialog_With(MemorySegment, MemorySegment)]
    public static int NFD_SaveDialog_With(String[] outPath, NFDSaveDialogArgs args) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = NFDInternal.marshalString(stack, outPath);
            int result = NFD_SaveDialog_With(seg, Marshal.marshal(args));
            if (result == NFD_OKAY) {
                copyOutPath(seg, outPath);
            }
            return result;
        }
    }

    /// Overloads [NFD_PickFolder][#NFD_PickFolder(MemorySegment, MemorySegment)]
    public static int NFD_PickFolder(String[] outPath, String defaultPath) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = NFDInternal.marshalString(stack, outPath);
            int result = NFD_PickFolder(seg, NFDInternal.marshalString(stack, defaultPath));
            if (result == NFD_OKAY) {
                copyOutPath(seg, outPath);
            }
            return result;
        }
    }

    /// Overloads [NFD_PickFolder_With][#NFD_PickFolder_With(MemorySegment, MemorySegment)]
    public static int NFD_PickFolder_With(String[] outPath, NFDPickFolderArgs args) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = NFDInternal.marshalString(stack, outPath);
            int result = NFD_PickFolder_With(seg, Marshal.marshal(args));
            if (result == NFD_OKAY) {
                copyOutPath(seg, outPath);
            }
            return result;
        }
    }

    /// Overloads [NFD_PickFolderMultiple][#NFD_PickFolderMultiple(MemorySegment, MemorySegment)]
    public static int NFD_PickFolderMultiple(MemorySegment outPaths, String defaultPath) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            return NFD_PickFolderMultiple(outPaths, NFDInternal.marshalString(stack, defaultPath));
        }
    }

    /// Overloads [NFD_PickFolderMultiple_With][#NFD_PickFolderMultiple_With(MemorySegment, MemorySegment)]
    public static int NFD_PickFolderMultiple_With(MemorySegment outPaths, NFDPickFolderArgs args) {
        return NFD_PickFolderMultiple_With(outPaths, Marshal.marshal(args));
    }

    /// Overloads [NFD_PathSet_GetPath][#NFD_PathSet_GetPath(MemorySegment, long, MemorySegment)]
    public static int NFD_PathSet_GetPath(MemorySegment pathSet, long index, String[] outPath) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = NFDInternal.marshalString(stack, outPath);
            int result = NFD_PathSet_GetPath(pathSet, index, seg);
            if (result == NFD_OKAY) {
                copyPathSetOutPath(seg, outPath);
            }
            return result;
        }
    }

    /// Overloads [NFD_PathSet_EnumNext][#NFD_PathSet_EnumNext(MemorySegment, MemorySegment)]
    public static int NFD_PathSet_EnumNext(MemorySegment enumerator, String[] outPath) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = NFDInternal.marshalString(stack, outPath);
            int result = NFD_PathSet_EnumNext(enumerator, seg);
            if (result == NFD_OKAY) {
                copyPathSetOutPath(seg, outPath);
            }
            return result;
        }
    }

    private static int filterItemCount(Struct struct) {
        return struct != null ? Math.toIntExact(struct.estimateCount()) : 0;
    }

    private static void copyOutPath(MemorySegment src, String[] outPath) {
        Unmarshal.copy(src, outPath, NFDInternal.nfdCharset);
        MemorySegment segment = src.get(ValueLayout.ADDRESS, 0);
        if (!Unmarshal.isNullPointer(segment)) {
            NFD_FreePath(segment);
        }
    }

    private static void copyPathSetOutPath(MemorySegment src, String[] outPath) {
        Unmarshal.copy(src, outPath, NFDInternal.nfdCharset);
        MemorySegment segment = src.get(ValueLayout.ADDRESS, 0);
        if (!Unmarshal.isNullPointer(segment)) {
            NFD_PathSet_FreePath(segment);
        }
    }
}
