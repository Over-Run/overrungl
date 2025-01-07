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

/// Native File Dialog Extended binding.
///
/// See the [source repository](https://github.com/btzy/nativefiledialog-extended) for basic usages.
///
/// @author squid233
/// @since 0.1.0
public final class NFD {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int
        NFD_ERROR = 0,
        NFD_OKAY = 1,
        NFD_CANCEL = 2;
    public static final int
        NFD_WINDOW_HANDLE_TYPE_UNSET = 0,
        NFD_WINDOW_HANDLE_TYPE_WINDOWS = 1,
        NFD_WINDOW_HANDLE_TYPE_COCOA = 2,
        NFD_WINDOW_HANDLE_TYPE_X11 = 3;
    public static final int NFD_INTERFACE_VERSION = 1;
    //endregion
    //region Method handles
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `NFD_FreePathN`.
        public static final MethodHandle MH_NFD_FreePathN = RuntimeHelper.downcall(NFDInternal.lookup(), "NFD_FreePathN", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `NFD_Init`.
        public static final MethodHandle MH_NFD_Init = RuntimeHelper.downcall(NFDInternal.lookup(), "NFD_Init", FunctionDescriptor.of(ValueLayout.JAVA_INT));
        /// The method handle of `NFD_Quit`.
        public static final MethodHandle MH_NFD_Quit = RuntimeHelper.downcall(NFDInternal.lookup(), "NFD_Quit", FunctionDescriptor.ofVoid());
        /// The method handle of `NFD_OpenDialogN`.
        public static final MethodHandle MH_NFD_OpenDialogN = RuntimeHelper.downcall(NFDInternal.lookup(), "NFD_OpenDialogN", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
        /// The method handle of `NFD_OpenDialogN_With_Impl`.
        public static final MethodHandle MH_NFD_OpenDialogN_With_Impl = RuntimeHelper.downcall(NFDInternal.lookup(), "NFD_OpenDialogN_With_Impl", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_OpenDialogMultipleN`.
        public static final MethodHandle MH_NFD_OpenDialogMultipleN = RuntimeHelper.downcall(NFDInternal.lookup(), "NFD_OpenDialogMultipleN", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
        /// The method handle of `NFD_OpenDialogMultipleN_With_Impl`.
        public static final MethodHandle MH_NFD_OpenDialogMultipleN_With_Impl = RuntimeHelper.downcall(NFDInternal.lookup(), "NFD_OpenDialogMultipleN_With_Impl", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_SaveDialogN`.
        public static final MethodHandle MH_NFD_SaveDialogN = RuntimeHelper.downcall(NFDInternal.lookup(), "NFD_SaveDialogN", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT, Unmarshal.STR_LAYOUT));
        /// The method handle of `NFD_SaveDialogN_With_Impl`.
        public static final MethodHandle MH_NFD_SaveDialogN_With_Impl = RuntimeHelper.downcall(NFDInternal.lookup(), "NFD_SaveDialogN_With_Impl", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_PickFolderN`.
        public static final MethodHandle MH_NFD_PickFolderN = RuntimeHelper.downcall(NFDInternal.lookup(), "NFD_PickFolderN", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `NFD_PickFolderN_With_Impl`.
        public static final MethodHandle MH_NFD_PickFolderN_With_Impl = RuntimeHelper.downcall(NFDInternal.lookup(), "NFD_PickFolderN_With_Impl", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_PickFolderMultipleN`.
        public static final MethodHandle MH_NFD_PickFolderMultipleN = RuntimeHelper.downcall(NFDInternal.lookup(), "NFD_PickFolderMultipleN", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `NFD_PickFolderMultipleN_With_Impl`.
        public static final MethodHandle MH_NFD_PickFolderMultipleN_With_Impl = RuntimeHelper.downcall(NFDInternal.lookup(), "NFD_PickFolderMultipleN_With_Impl", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_GetError`.
        public static final MethodHandle MH_NFD_GetError = RuntimeHelper.downcall(NFDInternal.lookup(), "NFD_GetError", FunctionDescriptor.of(Unmarshal.STR_LAYOUT));
        /// The method handle of `NFD_ClearError`.
        public static final MethodHandle MH_NFD_ClearError = RuntimeHelper.downcall(NFDInternal.lookup(), "NFD_ClearError", FunctionDescriptor.ofVoid());
        /// The method handle of `NFD_PathSet_GetCount`.
        public static final MethodHandle MH_NFD_PathSet_GetCount = RuntimeHelper.downcall(NFDInternal.lookup(), "NFD_PathSet_GetCount", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_PathSet_GetPathN`.
        public static final MethodHandle MH_NFD_PathSet_GetPathN = RuntimeHelper.downcall(NFDInternal.lookup(), "NFD_PathSet_GetPathN", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        /// The method handle of `NFD_PathSet_FreePathN`.
        public static final MethodHandle MH_NFD_PathSet_FreePathN = RuntimeHelper.downcall(NFDInternal.lookup(), "NFD_PathSet_FreePathN", FunctionDescriptor.ofVoid(Unmarshal.STR_LAYOUT));
        /// The method handle of `NFD_PathSet_GetEnum`.
        public static final MethodHandle MH_NFD_PathSet_GetEnum = RuntimeHelper.downcall(NFDInternal.lookup(), "NFD_PathSet_GetEnum", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_PathSet_FreeEnum`.
        public static final MethodHandle MH_NFD_PathSet_FreeEnum = RuntimeHelper.downcall(NFDInternal.lookup(), "NFD_PathSet_FreeEnum", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `NFD_PathSet_EnumNextN`.
        public static final MethodHandle MH_NFD_PathSet_EnumNextN = RuntimeHelper.downcall(NFDInternal.lookup(), "NFD_PathSet_EnumNextN", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `NFD_PathSet_Free`.
        public static final MethodHandle MH_NFD_PathSet_Free = RuntimeHelper.downcall(NFDInternal.lookup(), "NFD_PathSet_Free", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    }
    //endregion

    public static void NFD_FreePath(@CType("nfdnchar_t*") java.lang.foreign.MemorySegment filePath) {
        try {
            Handles.MH_NFD_FreePathN.invokeExact(filePath);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_FreePathN", e); }
    }

    public static @CType("nfdresult_t") int NFD_Init() {
        try {
            return (int) Handles.MH_NFD_Init.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in NFD_Init", e); }
    }

    public static void NFD_Quit() {
        try {
            Handles.MH_NFD_Quit.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in NFD_Quit", e); }
    }

    public static @CType("nfdresult_t") int NFD_OpenDialog(@CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath, @CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment filterList, @CType("nfdfiltersize_t") int filterCount, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
        try {
            return (int) Handles.MH_NFD_OpenDialogN.invokeExact(outPath, filterList, filterCount, defaultPath);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_OpenDialogN", e); }
    }

    public static @CType("nfdresult_t") int NFD_OpenDialog_With_Impl(@CType("nfdversion_t") int version, @CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath, @CType("const nfdopendialognargs_t*") java.lang.foreign.MemorySegment args) {
        try {
            return (int) Handles.MH_NFD_OpenDialogN_With_Impl.invokeExact(version, outPath, args);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_OpenDialogN_With_Impl", e); }
    }

    public static @CType("nfdresult_t") int NFD_OpenDialog_With(@CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath, @CType("const nfdopendialognargs_t*") java.lang.foreign.MemorySegment args) {
        return NFD_OpenDialog_With_Impl(NFD_INTERFACE_VERSION, outPath, args);
    }

    public static @CType("nfdresult_t") int NFD_OpenDialogMultiple(@CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths, @CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment filterList, @CType("nfdfiltersize_t") int filterCount, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
        try {
            return (int) Handles.MH_NFD_OpenDialogMultipleN.invokeExact(outPaths, filterList, filterCount, defaultPath);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_OpenDialogMultipleN", e); }
    }

    public static @CType("nfdresult_t") int NFD_OpenDialogMultiple_With_Impl(@CType("nfdversion_t") int version, @CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths, @CType("const nfdopendialognargs_t*") java.lang.foreign.MemorySegment args) {
        try {
            return (int) Handles.MH_NFD_OpenDialogMultipleN_With_Impl.invokeExact(version, outPaths, args);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_OpenDialogMultipleN_With_Impl", e); }
    }

    public static @CType("nfdresult_t") int NFD_OpenDialogMultiple_With(@CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths, @CType("const nfdopendialognargs_t*") java.lang.foreign.MemorySegment args) {
        return NFD_OpenDialogMultiple_With_Impl(NFD_INTERFACE_VERSION, outPaths, args);
    }

    public static @CType("nfdresult_t") int NFD_SaveDialog(@CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath, @CType("const nfdnfilteritem_t*") java.lang.foreign.MemorySegment filterList, @CType("nfdfiltersize_t") int filterCount, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultName) {
        try {
            return (int) Handles.MH_NFD_SaveDialogN.invokeExact(outPath, filterList, filterCount, defaultPath, defaultName);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_SaveDialogN", e); }
    }

    public static @CType("nfdresult_t") int NFD_SaveDialog_With_Impl(@CType("nfdversion_t") int version, @CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath, @CType("const nfdsavedialognargs_t*") java.lang.foreign.MemorySegment args) {
        try {
            return (int) Handles.MH_NFD_SaveDialogN_With_Impl.invokeExact(version, outPath, args);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_SaveDialogN_With_Impl", e); }
    }

    public static @CType("nfdresult_t") int NFD_SaveDialog_With(@CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath, @CType("const nfdsavedialognargs_t*") java.lang.foreign.MemorySegment args) {
        return NFD_SaveDialog_With_Impl(NFD_INTERFACE_VERSION, outPath, args);
    }

    public static @CType("nfdresult_t") int NFD_PickFolder(@CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
        try {
            return (int) Handles.MH_NFD_PickFolderN.invokeExact(outPath, defaultPath);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PickFolderN", e); }
    }

    public static @CType("nfdresult_t") int NFD_PickFolder_With_Impl(@CType("nfdversion_t") int version, @CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath, @CType("const nfdpickfoldernargs_t*") java.lang.foreign.MemorySegment args) {
        try {
            return (int) Handles.MH_NFD_PickFolderN_With_Impl.invokeExact(version, outPath, args);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PickFolderN_With_Impl", e); }
    }

    public static @CType("nfdresult_t") int NFD_PickFolder_With(@CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath, @CType("const nfdpickfoldernargs_t*") java.lang.foreign.MemorySegment args) {
        return NFD_PickFolder_With_Impl(NFD_INTERFACE_VERSION, outPath, args);
    }

    public static @CType("nfdresult_t") int NFD_PickFolderMultiple(@CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths, @CType("const nfdnchar_t*") java.lang.foreign.MemorySegment defaultPath) {
        try {
            return (int) Handles.MH_NFD_PickFolderMultipleN.invokeExact(outPaths, defaultPath);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PickFolderMultipleN", e); }
    }

    public static @CType("nfdresult_t") int NFD_PickFolderMultiple_With_Impl(@CType("nfdversion_t") int version, @CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths, @CType("const nfdpickfoldernargs_t*") java.lang.foreign.MemorySegment args) {
        try {
            return (int) Handles.MH_NFD_PickFolderMultipleN_With_Impl.invokeExact(version, outPaths, args);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PickFolderMultipleN_With_Impl", e); }
    }

    public static @CType("nfdresult_t") int NFD_PickFolderMultiple_With(@CType("const nfdpathset_t**") java.lang.foreign.MemorySegment outPaths, @CType("const nfdpickfoldernargs_t*") java.lang.foreign.MemorySegment args) {
        return NFD_PickFolderMultiple_With_Impl(NFD_INTERFACE_VERSION, outPaths, args);
    }

    public static @CType("const char*") java.lang.foreign.MemorySegment NFD_GetError_() {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_NFD_GetError.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in NFD_GetError", e); }
    }

    public static @CType("const char*") java.lang.String NFD_GetError() {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_NFD_GetError.invokeExact());
        } catch (Throwable e) { throw new RuntimeException("error in NFD_GetError", e); }
    }

    public static void NFD_ClearError() {
        try {
            Handles.MH_NFD_ClearError.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in NFD_ClearError", e); }
    }

    public static @CType("nfdresult_t") int NFD_PathSet_GetCount(@CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet, @Out @CType("nfdpathsetsize_t*") java.lang.foreign.MemorySegment count) {
        try {
            return (int) Handles.MH_NFD_PathSet_GetCount.invokeExact(pathSet, count);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PathSet_GetCount", e); }
    }

    public static @CType("nfdresult_t") int NFD_PathSet_GetCount(@CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet, @Out long[] count) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_count = Marshal.marshal(__overrungl_stack, count);
            var __overrungl_result = (int) Handles.MH_NFD_PathSet_GetCount.invokeExact(pathSet, __overrungl_ref_count);
            Unmarshal.copy(__overrungl_ref_count, count);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PathSet_GetCount", e); }
    }

    public static @CType("nfdresult_t") int NFD_PathSet_GetPath(@CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet, @CType("nfdpathsetsize_t") long index, @CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath) {
        try {
            return (int) Handles.MH_NFD_PathSet_GetPathN.invokeExact(pathSet, index, outPath);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PathSet_GetPathN", e); }
    }

    public static void NFD_PathSet_FreePath(@CType("const nfdnchar_t*") java.lang.foreign.MemorySegment filePath) {
        try {
            Handles.MH_NFD_PathSet_FreePathN.invokeExact(filePath);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PathSet_FreePathN", e); }
    }

    public static @CType("nfdresult_t") int NFD_PathSet_GetEnum(@CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet, @CType("nfdpathsetenum_t*") java.lang.foreign.MemorySegment outEnumerator) {
        try {
            return (int) Handles.MH_NFD_PathSet_GetEnum.invokeExact(pathSet, outEnumerator);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PathSet_GetEnum", e); }
    }

    public static void NFD_PathSet_FreeEnum(@CType("nfdpathsetenum_t*") java.lang.foreign.MemorySegment enumerator) {
        try {
            Handles.MH_NFD_PathSet_FreeEnum.invokeExact(enumerator);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PathSet_FreeEnum", e); }
    }

    public static @CType("nfdresult_t") int NFD_PathSet_EnumNext(@CType("nfdpathsetenum_t*") java.lang.foreign.MemorySegment enumerator, @CType("nfdnchar_t**") java.lang.foreign.MemorySegment outPath) {
        try {
            return (int) Handles.MH_NFD_PathSet_EnumNextN.invokeExact(enumerator, outPath);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PathSet_EnumNextN", e); }
    }

    public static void NFD_PathSet_Free(@CType("const nfdpathset_t*") java.lang.foreign.MemorySegment pathSet) {
        try {
            Handles.MH_NFD_PathSet_Free.invokeExact(pathSet);
        } catch (Throwable e) { throw new RuntimeException("error in NFD_PathSet_Free", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private NFD() {
    }

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

    public static int NFD_OpenDialogMultiple(MemorySegment outPaths, NFDFilterItem filterList, String defaultPath) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            return NFD_OpenDialogMultiple(outPaths, Marshal.marshal(filterList), filterItemCount(filterList), NFDInternal.marshalString(stack, defaultPath));
        }
    }

    public static int NFD_OpenDialogMultiple_With(MemorySegment outPaths, NFDOpenDialogArgs args) {
        return NFD_OpenDialogMultiple_With(outPaths, Marshal.marshal(args));
    }

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

    public static int NFD_PickFolderMultiple(MemorySegment outPaths, String defaultPath) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            return NFD_PickFolderMultiple(outPaths, NFDInternal.marshalString(stack, defaultPath));
        }
    }

    public static int NFD_PickFolderMultiple_With(MemorySegment outPaths, NFDPickFolderArgs args) {
        return NFD_PickFolderMultiple_With(outPaths, Marshal.marshal(args));
    }

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
