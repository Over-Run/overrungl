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

import overrungl.util.CanonicalTypes;
import overrungl.util.MemoryUtil;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.nio.charset.Charset;

import static overrungl.internal.RuntimeHelper.*;

/// Native File Dialog Extended binding.
///
/// See the [source repository](https://github.com/btzy/nativefiledialog-extended) for basic usages.
///
/// ## Important
///
/// NFD uses UTF-16 on Windows. You should use
/// [NFD_AllocString][NFD#NFD_AllocString(SegmentAllocator, String)] and
/// [NFD_NativeString][NFD#NFD_NativeString(MemorySegment)]
/// instead of the [MemoryUtil] version.
///
/// @author squid233
/// @since 0.1.0
public final class NFD {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int NFD_INTERFACE_VERSION = 1;
    public static final int NFD_ERROR = 0;
    public static final int NFD_OKAY = 1;
    public static final int NFD_CANCEL = 2;
    public static final int NFD_WINDOW_HANDLE_TYPE_UNSET = 0;
    public static final int NFD_WINDOW_HANDLE_TYPE_WINDOWS = 1;
    public static final int NFD_WINDOW_HANDLE_TYPE_COCOA = 2;
    public static final int NFD_WINDOW_HANDLE_TYPE_X11 = 3;
    //endregion
    /// Method handles.
    public static final class Handles {
        /// The method handle of `NFD_FreePathN`.
        public static final MethodHandle MH_NFD_FreePathN = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `NFD_Init`.
        public static final MethodHandle MH_NFD_Init = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT));
        /// The method handle of `NFD_Quit`.
        public static final MethodHandle MH_NFD_Quit = downcallHandle(FunctionDescriptor.ofVoid());
        /// The method handle of `NFD_OpenDialogN`.
        public static final MethodHandle MH_NFD_OpenDialogN = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `NFD_OpenDialogN_With_Impl`.
        public static final MethodHandle MH_NFD_OpenDialogN_With_Impl = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_OpenDialogMultipleN`.
        public static final MethodHandle MH_NFD_OpenDialogMultipleN = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `NFD_OpenDialogMultipleN_With_Impl`.
        public static final MethodHandle MH_NFD_OpenDialogMultipleN_With_Impl = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_SaveDialogN`.
        public static final MethodHandle MH_NFD_SaveDialogN = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_SaveDialogN_With_Impl`.
        public static final MethodHandle MH_NFD_SaveDialogN_With_Impl = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_PickFolderN`.
        public static final MethodHandle MH_NFD_PickFolderN = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_PickFolderN_With_Impl`.
        public static final MethodHandle MH_NFD_PickFolderN_With_Impl = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_PickFolderMultipleN`.
        public static final MethodHandle MH_NFD_PickFolderMultipleN = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_PickFolderMultipleN_With_Impl`.
        public static final MethodHandle MH_NFD_PickFolderMultipleN_With_Impl = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_GetError`.
        public static final MethodHandle MH_NFD_GetError = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of `NFD_ClearError`.
        public static final MethodHandle MH_NFD_ClearError = downcallHandle(FunctionDescriptor.ofVoid());
        /// The method handle of `NFD_PathSet_GetCount`.
        public static final MethodHandle MH_NFD_PathSet_GetCount = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_PathSet_GetPathN`.
        public static final MethodHandle MH_NFD_PathSet_GetPathN = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, NFDInternal.nfdpathsetsize_t, ValueLayout.ADDRESS));
        /// The method handle of `NFD_PathSet_FreePathN`.
        public static final MethodHandle MH_NFD_PathSet_FreePathN = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `NFD_PathSet_GetEnum`.
        public static final MethodHandle MH_NFD_PathSet_GetEnum = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_PathSet_FreeEnum`.
        public static final MethodHandle MH_NFD_PathSet_FreeEnum = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `NFD_PathSet_EnumNextN`.
        public static final MethodHandle MH_NFD_PathSet_EnumNextN = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_PathSet_Free`.
        public static final MethodHandle MH_NFD_PathSet_Free = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The function address of `NFD_FreePathN`.
        public final MemorySegment PFN_NFD_FreePathN;
        /// The function address of `NFD_Init`.
        public final MemorySegment PFN_NFD_Init;
        /// The function address of `NFD_Quit`.
        public final MemorySegment PFN_NFD_Quit;
        /// The function address of `NFD_OpenDialogN`.
        public final MemorySegment PFN_NFD_OpenDialogN;
        /// The function address of `NFD_OpenDialogN_With_Impl`.
        public final MemorySegment PFN_NFD_OpenDialogN_With_Impl;
        /// The function address of `NFD_OpenDialogMultipleN`.
        public final MemorySegment PFN_NFD_OpenDialogMultipleN;
        /// The function address of `NFD_OpenDialogMultipleN_With_Impl`.
        public final MemorySegment PFN_NFD_OpenDialogMultipleN_With_Impl;
        /// The function address of `NFD_SaveDialogN`.
        public final MemorySegment PFN_NFD_SaveDialogN;
        /// The function address of `NFD_SaveDialogN_With_Impl`.
        public final MemorySegment PFN_NFD_SaveDialogN_With_Impl;
        /// The function address of `NFD_PickFolderN`.
        public final MemorySegment PFN_NFD_PickFolderN;
        /// The function address of `NFD_PickFolderN_With_Impl`.
        public final MemorySegment PFN_NFD_PickFolderN_With_Impl;
        /// The function address of `NFD_PickFolderMultipleN`.
        public final MemorySegment PFN_NFD_PickFolderMultipleN;
        /// The function address of `NFD_PickFolderMultipleN_With_Impl`.
        public final MemorySegment PFN_NFD_PickFolderMultipleN_With_Impl;
        /// The function address of `NFD_GetError`.
        public final MemorySegment PFN_NFD_GetError;
        /// The function address of `NFD_ClearError`.
        public final MemorySegment PFN_NFD_ClearError;
        /// The function address of `NFD_PathSet_GetCount`.
        public final MemorySegment PFN_NFD_PathSet_GetCount;
        /// The function address of `NFD_PathSet_GetPathN`.
        public final MemorySegment PFN_NFD_PathSet_GetPathN;
        /// The function address of `NFD_PathSet_FreePathN`.
        public final MemorySegment PFN_NFD_PathSet_FreePathN;
        /// The function address of `NFD_PathSet_GetEnum`.
        public final MemorySegment PFN_NFD_PathSet_GetEnum;
        /// The function address of `NFD_PathSet_FreeEnum`.
        public final MemorySegment PFN_NFD_PathSet_FreeEnum;
        /// The function address of `NFD_PathSet_EnumNextN`.
        public final MemorySegment PFN_NFD_PathSet_EnumNextN;
        /// The function address of `NFD_PathSet_Free`.
        public final MemorySegment PFN_NFD_PathSet_Free;
        private Handles() {
            var _lookup = NFDLibrary.lookup();
            PFN_NFD_FreePathN = _lookup.findOrThrow("NFD_FreePathN");
            PFN_NFD_Init = _lookup.findOrThrow("NFD_Init");
            PFN_NFD_Quit = _lookup.findOrThrow("NFD_Quit");
            PFN_NFD_OpenDialogN = _lookup.findOrThrow("NFD_OpenDialogN");
            PFN_NFD_OpenDialogN_With_Impl = _lookup.findOrThrow("NFD_OpenDialogN_With_Impl");
            PFN_NFD_OpenDialogMultipleN = _lookup.findOrThrow("NFD_OpenDialogMultipleN");
            PFN_NFD_OpenDialogMultipleN_With_Impl = _lookup.findOrThrow("NFD_OpenDialogMultipleN_With_Impl");
            PFN_NFD_SaveDialogN = _lookup.findOrThrow("NFD_SaveDialogN");
            PFN_NFD_SaveDialogN_With_Impl = _lookup.findOrThrow("NFD_SaveDialogN_With_Impl");
            PFN_NFD_PickFolderN = _lookup.findOrThrow("NFD_PickFolderN");
            PFN_NFD_PickFolderN_With_Impl = _lookup.findOrThrow("NFD_PickFolderN_With_Impl");
            PFN_NFD_PickFolderMultipleN = _lookup.findOrThrow("NFD_PickFolderMultipleN");
            PFN_NFD_PickFolderMultipleN_With_Impl = _lookup.findOrThrow("NFD_PickFolderMultipleN_With_Impl");
            PFN_NFD_GetError = _lookup.findOrThrow("NFD_GetError");
            PFN_NFD_ClearError = _lookup.findOrThrow("NFD_ClearError");
            PFN_NFD_PathSet_GetCount = _lookup.findOrThrow("NFD_PathSet_GetCount");
            PFN_NFD_PathSet_GetPathN = _lookup.findOrThrow("NFD_PathSet_GetPathN");
            PFN_NFD_PathSet_FreePathN = _lookup.findOrThrow("NFD_PathSet_FreePathN");
            PFN_NFD_PathSet_GetEnum = _lookup.findOrThrow("NFD_PathSet_GetEnum");
            PFN_NFD_PathSet_FreeEnum = _lookup.findOrThrow("NFD_PathSet_FreeEnum");
            PFN_NFD_PathSet_EnumNextN = _lookup.findOrThrow("NFD_PathSet_EnumNextN");
            PFN_NFD_PathSet_Free = _lookup.findOrThrow("NFD_PathSet_Free");
        }
        private static Handles get() {
            final class Holder {
                static final Handles instance = new Handles();
            }
            return Holder.instance;
        }
    }

    /// ```
    /// void NFD_FreePathN(nfdnchar_t* filePath);
    /// ```
    public static void NFD_FreePath(MemorySegment filePath) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("NFD_FreePathN", filePath); }
        Handles.MH_NFD_FreePathN.invokeExact(Handles.get().PFN_NFD_FreePathN, filePath); }
        catch (Throwable e) { throw new RuntimeException("error in NFD_FreePath", e); }
    }

    /// ```
    /// (int) nfdresult_t NFD_Init();
    /// ```
    public static int NFD_Init() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("NFD_Init"); }
        return (int) Handles.MH_NFD_Init.invokeExact(Handles.get().PFN_NFD_Init); }
        catch (Throwable e) { throw new RuntimeException("error in NFD_Init", e); }
    }

    /// ```
    /// void NFD_Quit();
    /// ```
    public static void NFD_Quit() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("NFD_Quit"); }
        Handles.MH_NFD_Quit.invokeExact(Handles.get().PFN_NFD_Quit); }
        catch (Throwable e) { throw new RuntimeException("error in NFD_Quit", e); }
    }

    /// ```
    /// (int) nfdresult_t NFD_OpenDialogN(nfdnchar_t** outPath, const nfdnfilteritem_t* filterList, (unsigned int) nfdfiltersize_t filterCount, const nfdnchar_t* defaultPath);
    /// ```
    public static int NFD_OpenDialog(MemorySegment outPath, MemorySegment filterList, int filterCount, MemorySegment defaultPath) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("NFD_OpenDialogN", outPath, filterList, filterCount, defaultPath); }
        return (int) Handles.MH_NFD_OpenDialogN.invokeExact(Handles.get().PFN_NFD_OpenDialogN, outPath, filterList, filterCount, defaultPath); }
        catch (Throwable e) { throw new RuntimeException("error in NFD_OpenDialog", e); }
    }

    /// ```
    /// (int) nfdresult_t NFD_OpenDialogN_With_Impl((size_t) nfdversion_t version, nfdnchar_t** outPath, const nfdopendialognargs_t* args);
    /// ```
    public static int NFD_OpenDialog_With_Impl(long version, MemorySegment outPath, MemorySegment args) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("NFD_OpenDialogN_With_Impl", version, outPath, args); }
        return (int) Handles.MH_NFD_OpenDialogN_With_Impl.invoke(Handles.get().PFN_NFD_OpenDialogN_With_Impl, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, version), outPath, args); }
        catch (Throwable e) { throw new RuntimeException("error in NFD_OpenDialog_With_Impl", e); }
    }

    /// ```
    /// (int) nfdresult_t NFD_OpenDialog_With(nfdnchar_t** outPath, const nfdopendialognargs_t* args);
    /// ```
    public static int NFD_OpenDialog_With(MemorySegment outPath, MemorySegment args) {
        return NFD_OpenDialog_With_Impl(NFD_INTERFACE_VERSION, outPath, args);
    }

    /// ```
    /// (int) nfdresult_t NFD_OpenDialogMultipleN(const nfdpathset_t** outPaths, const nfdnfilteritem_t* filterList, (unsigned int) nfdfiltersize_t filterCount, const nfdnchar_t* defaultPath);
    /// ```
    public static int NFD_OpenDialogMultiple(MemorySegment outPaths, MemorySegment filterList, int filterCount, MemorySegment defaultPath) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("NFD_OpenDialogMultipleN", outPaths, filterList, filterCount, defaultPath); }
        return (int) Handles.MH_NFD_OpenDialogMultipleN.invokeExact(Handles.get().PFN_NFD_OpenDialogMultipleN, outPaths, filterList, filterCount, defaultPath); }
        catch (Throwable e) { throw new RuntimeException("error in NFD_OpenDialogMultiple", e); }
    }

    /// ```
    /// (int) nfdresult_t NFD_OpenDialogMultipleN_With_Impl((size_t) nfdversion_t version, const nfdpathset_t** outPaths, const nfdopendialognargs_t* args);
    /// ```
    public static int NFD_OpenDialogMultiple_With_Impl(long version, MemorySegment outPaths, MemorySegment args) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("NFD_OpenDialogMultipleN_With_Impl", version, outPaths, args); }
        return (int) Handles.MH_NFD_OpenDialogMultipleN_With_Impl.invoke(Handles.get().PFN_NFD_OpenDialogMultipleN_With_Impl, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, version), outPaths, args); }
        catch (Throwable e) { throw new RuntimeException("error in NFD_OpenDialogMultiple_With_Impl", e); }
    }

    /// ```
    /// (int) nfdresult_t NFD_OpenDialogMultiple_With(const nfdpathset_t** outPaths, const nfdopendialognargs_t* args);
    /// ```
    public static int NFD_OpenDialogMultiple_With(MemorySegment outPaths, MemorySegment args) {
        return NFD_OpenDialogMultiple_With_Impl(NFD_INTERFACE_VERSION, outPaths, args);
    }

    /// ```
    /// (int) nfdresult_t NFD_SaveDialogN(nfdnchar_t** outPath, const nfdnfilteritem_t* filterList, (unsigned int) nfdfiltersize_t filterCount, const nfdnchar_t* defaultPath, const nfdnchar_t* defaultName);
    /// ```
    public static int NFD_SaveDialog(MemorySegment outPath, MemorySegment filterList, int filterCount, MemorySegment defaultPath, MemorySegment defaultName) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("NFD_SaveDialogN", outPath, filterList, filterCount, defaultPath, defaultName); }
        return (int) Handles.MH_NFD_SaveDialogN.invokeExact(Handles.get().PFN_NFD_SaveDialogN, outPath, filterList, filterCount, defaultPath, defaultName); }
        catch (Throwable e) { throw new RuntimeException("error in NFD_SaveDialog", e); }
    }

    /// ```
    /// (int) nfdresult_t NFD_SaveDialogN_With_Impl((size_t) nfdversion_t version, nfdnchar_t** outPath, const nfdsavedialognargs_t* args);
    /// ```
    public static int NFD_SaveDialog_With_Impl(long version, MemorySegment outPath, MemorySegment args) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("NFD_SaveDialogN_With_Impl", version, outPath, args); }
        return (int) Handles.MH_NFD_SaveDialogN_With_Impl.invoke(Handles.get().PFN_NFD_SaveDialogN_With_Impl, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, version), outPath, args); }
        catch (Throwable e) { throw new RuntimeException("error in NFD_SaveDialog_With_Impl", e); }
    }

    /// ```
    /// (int) nfdresult_t NFD_SaveDialog_With(nfdnchar_t** outPath, const nfdsavedialognargs_t* args);
    /// ```
    public static int NFD_SaveDialog_With(MemorySegment outPath, MemorySegment args) {
        return NFD_SaveDialog_With_Impl(NFD_INTERFACE_VERSION, outPath, args);
    }

    /// ```
    /// (int) nfdresult_t NFD_PickFolderN(nfdnchar_t** outPath, const nfdnchar_t* defaultPath);
    /// ```
    public static int NFD_PickFolder(MemorySegment outPath, MemorySegment defaultPath) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("NFD_PickFolderN", outPath, defaultPath); }
        return (int) Handles.MH_NFD_PickFolderN.invokeExact(Handles.get().PFN_NFD_PickFolderN, outPath, defaultPath); }
        catch (Throwable e) { throw new RuntimeException("error in NFD_PickFolder", e); }
    }

    /// ```
    /// (int) nfdresult_t NFD_PickFolderN_With_Impl((size_t) nfdversion_t version, nfdnchar_t** outPath, const nfdpickfoldernargs_t* args);
    /// ```
    public static int NFD_PickFolder_With_Impl(long version, MemorySegment outPath, MemorySegment args) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("NFD_PickFolderN_With_Impl", version, outPath, args); }
        return (int) Handles.MH_NFD_PickFolderN_With_Impl.invoke(Handles.get().PFN_NFD_PickFolderN_With_Impl, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, version), outPath, args); }
        catch (Throwable e) { throw new RuntimeException("error in NFD_PickFolder_With_Impl", e); }
    }

    /// ```
    /// (int) nfdresult_t NFD_PickFolder_With(nfdnchar_t** outPath, const nfdpickfoldernargs_t* args);
    /// ```
    public static int NFD_PickFolder_With(MemorySegment outPath, MemorySegment args) {
        return NFD_PickFolder_With_Impl(NFD_INTERFACE_VERSION, outPath, args);
    }

    /// ```
    /// (int) nfdresult_t NFD_PickFolderMultipleN(const nfdpathset_t** outPaths, const nfdnchar_t* defaultPath);
    /// ```
    public static int NFD_PickFolderMultiple(MemorySegment outPaths, MemorySegment defaultPath) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("NFD_PickFolderMultipleN", outPaths, defaultPath); }
        return (int) Handles.MH_NFD_PickFolderMultipleN.invokeExact(Handles.get().PFN_NFD_PickFolderMultipleN, outPaths, defaultPath); }
        catch (Throwable e) { throw new RuntimeException("error in NFD_PickFolderMultiple", e); }
    }

    /// ```
    /// (int) nfdresult_t NFD_PickFolderMultipleN_With_Impl((size_t) nfdversion_t version, const nfdpathset_t** outPaths, const nfdpickfoldernargs_t* args);
    /// ```
    public static int NFD_PickFolderMultiple_With_Impl(long version, MemorySegment outPaths, MemorySegment args) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("NFD_PickFolderMultipleN_With_Impl", version, outPaths, args); }
        return (int) Handles.MH_NFD_PickFolderMultipleN_With_Impl.invoke(Handles.get().PFN_NFD_PickFolderMultipleN_With_Impl, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, version), outPaths, args); }
        catch (Throwable e) { throw new RuntimeException("error in NFD_PickFolderMultiple_With_Impl", e); }
    }

    /// ```
    /// (int) nfdresult_t NFD_PickFolderMultiple_With(const nfdpathset_t** outPaths, const nfdpickfoldernargs_t* args);
    /// ```
    public static int NFD_PickFolderMultiple_With(MemorySegment outPaths, MemorySegment args) {
        return NFD_PickFolderMultiple_With_Impl(NFD_INTERFACE_VERSION, outPaths, args);
    }

    /// ```
    /// const char* NFD_GetError();
    /// ```
    public static MemorySegment NFD_GetError() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("NFD_GetError"); }
        return (MemorySegment) Handles.MH_NFD_GetError.invokeExact(Handles.get().PFN_NFD_GetError); }
        catch (Throwable e) { throw new RuntimeException("error in NFD_GetError", e); }
    }

    /// ```
    /// void NFD_ClearError();
    /// ```
    public static void NFD_ClearError() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("NFD_ClearError"); }
        Handles.MH_NFD_ClearError.invokeExact(Handles.get().PFN_NFD_ClearError); }
        catch (Throwable e) { throw new RuntimeException("error in NFD_ClearError", e); }
    }

    /// ```
    /// (int) nfdresult_t NFD_PathSet_GetCount(const nfdpathset_t* pathSet, nfdpathsetsize_t* count);
    /// ```
    public static int NFD_PathSet_GetCount(MemorySegment pathSet, MemorySegment count) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("NFD_PathSet_GetCount", pathSet, count); }
        return (int) Handles.MH_NFD_PathSet_GetCount.invokeExact(Handles.get().PFN_NFD_PathSet_GetCount, pathSet, count); }
        catch (Throwable e) { throw new RuntimeException("error in NFD_PathSet_GetCount", e); }
    }

    /// ```
    /// (int) nfdresult_t NFD_PathSet_GetPathN(const nfdpathset_t* pathSet, (size_t) nfdpathsetsize_t index, nfdnchar_t** outPath);
    /// ```
    public static int NFD_PathSet_GetPath(MemorySegment pathSet, long index, MemorySegment outPath) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("NFD_PathSet_GetPathN", pathSet, index, outPath); }
        return (int) Handles.MH_NFD_PathSet_GetPathN.invoke(Handles.get().PFN_NFD_PathSet_GetPathN, pathSet, MemoryUtil.narrowingLong(NFDInternal.nfdpathsetsize_t, index), outPath); }
        catch (Throwable e) { throw new RuntimeException("error in NFD_PathSet_GetPath", e); }
    }

    /// ```
    /// void NFD_PathSet_FreePathN(const nfdnchar_t* filePath);
    /// ```
    public static void NFD_PathSet_FreePath(MemorySegment filePath) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("NFD_PathSet_FreePathN", filePath); }
        Handles.MH_NFD_PathSet_FreePathN.invokeExact(Handles.get().PFN_NFD_PathSet_FreePathN, filePath); }
        catch (Throwable e) { throw new RuntimeException("error in NFD_PathSet_FreePath", e); }
    }

    /// ```
    /// (int) nfdresult_t NFD_PathSet_GetEnum(const nfdpathset_t* pathSet, nfdpathsetenum_t* outEnumerator);
    /// ```
    public static int NFD_PathSet_GetEnum(MemorySegment pathSet, MemorySegment outEnumerator) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("NFD_PathSet_GetEnum", pathSet, outEnumerator); }
        return (int) Handles.MH_NFD_PathSet_GetEnum.invokeExact(Handles.get().PFN_NFD_PathSet_GetEnum, pathSet, outEnumerator); }
        catch (Throwable e) { throw new RuntimeException("error in NFD_PathSet_GetEnum", e); }
    }

    /// ```
    /// void NFD_PathSet_FreeEnum(nfdpathsetenum_t* enumerator);
    /// ```
    public static void NFD_PathSet_FreeEnum(MemorySegment enumerator) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("NFD_PathSet_FreeEnum", enumerator); }
        Handles.MH_NFD_PathSet_FreeEnum.invokeExact(Handles.get().PFN_NFD_PathSet_FreeEnum, enumerator); }
        catch (Throwable e) { throw new RuntimeException("error in NFD_PathSet_FreeEnum", e); }
    }

    /// ```
    /// (int) nfdresult_t NFD_PathSet_EnumNextN(nfdpathsetenum_t* enumerator, nfdnchar_t** outPath);
    /// ```
    public static int NFD_PathSet_EnumNext(MemorySegment enumerator, MemorySegment outPath) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("NFD_PathSet_EnumNextN", enumerator, outPath); }
        return (int) Handles.MH_NFD_PathSet_EnumNextN.invokeExact(Handles.get().PFN_NFD_PathSet_EnumNextN, enumerator, outPath); }
        catch (Throwable e) { throw new RuntimeException("error in NFD_PathSet_EnumNext", e); }
    }

    /// ```
    /// void NFD_PathSet_Free(const nfdpathset_t* pathSet);
    /// ```
    public static void NFD_PathSet_Free(MemorySegment pathSet) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("NFD_PathSet_Free", pathSet); }
        Handles.MH_NFD_PathSet_Free.invokeExact(Handles.get().PFN_NFD_PathSet_Free, pathSet); }
        catch (Throwable e) { throw new RuntimeException("error in NFD_PathSet_Free", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private NFD() {
    }

    /// On Windows, this is UTF-16 little-endian; on others, this is UTF-8
    public static final Charset NFD_CHARSET = NFDInternal.nfdCharset;
    /// On Windows, this is `wchar_t`; on others, this is byte
    public static final MemoryLayout nfdnchar_t = NFDInternal.nfdnchar_t;
    /// On macOS, this is C `long`; on Windows and others, this is int
    public static final MemoryLayout nfdpathsetsize_t = NFDInternal.nfdpathsetsize_t;

    public static MemorySegment NFD_AllocString(SegmentAllocator allocator, String string) {
        return MemoryUtil.allocString(allocator, string, NFD_CHARSET);
    }

    public static String NFD_NativeString(MemorySegment segment) {
        return MemoryUtil.nativeString(segment, NFD_CHARSET);
    }
}
