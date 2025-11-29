/*
 * MIT License
 *
 * Copyright (c) 2025 Overrun Organization
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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package overrungl.tinyfd;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import overrungl.util.MemoryStack;
import overrungl.util.MemoryUtil;
import overrungl.util.SymbolNotFoundError;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static overrungl.internal.RuntimeHelper.*;
import static overrungl.tinyfd.TinyFDInternal.*;

/// [tinyfiledialogs.h](https://sourceforge.net/p/tinyfiledialogs/code/ci/master/tree/tinyfiledialogs.h)
///
/// @since 0.2.0
public final class TinyFD {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    //endregion
    /// Method handles.
    public static final class Handles {
        /// The method handle of [`tinyfd_utf8toMbcs`][#tinyfd_utf8toMbcs].
        public static final MethodHandle MH_tinyfd_utf8toMbcs = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`tinyfd_utf16toMbcs`][#tinyfd_utf16toMbcs].
        public static final MethodHandle MH_tinyfd_utf16toMbcs = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`tinyfd_mbcsTo16`][#tinyfd_mbcsTo16].
        public static final MethodHandle MH_tinyfd_mbcsTo16 = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`tinyfd_mbcsTo8`][#tinyfd_mbcsTo8].
        public static final MethodHandle MH_tinyfd_mbcsTo8 = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`tinyfd_utf8to16`][#tinyfd_utf8to16].
        public static final MethodHandle MH_tinyfd_utf8to16 = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`tinyfd_utf16to8`][#tinyfd_utf16to8].
        public static final MethodHandle MH_tinyfd_utf16to8 = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`tinyfd_getGlobalChar`][#tinyfd_getGlobalChar].
        public static final MethodHandle MH_tinyfd_getGlobalChar = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`tinyfd_getGlobalInt`][#tinyfd_getGlobalInt].
        public static final MethodHandle MH_tinyfd_getGlobalInt = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`tinyfd_setGlobalInt`][#tinyfd_setGlobalInt].
        public static final MethodHandle MH_tinyfd_setGlobalInt = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`tinyfd_beep`][#tinyfd_beep].
        public static final MethodHandle MH_tinyfd_beep = downcallHandle(FunctionDescriptor.ofVoid());
        /// The method handle of [`tinyfd_notifyPopup`][#tinyfd_notifyPopup].
        public static final MethodHandle MH_tinyfd_notifyPopup = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`tinyfd_messageBox`][#tinyfd_messageBox].
        public static final MethodHandle MH_tinyfd_messageBox = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`tinyfd_inputBox`][#tinyfd_inputBox].
        public static final MethodHandle MH_tinyfd_inputBox = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`tinyfd_saveFileDialog`][#tinyfd_saveFileDialog].
        public static final MethodHandle MH_tinyfd_saveFileDialog = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`tinyfd_openFileDialog`][#tinyfd_openFileDialog].
        public static final MethodHandle MH_tinyfd_openFileDialog = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`tinyfd_selectFolderDialog`][#tinyfd_selectFolderDialog].
        public static final MethodHandle MH_tinyfd_selectFolderDialog = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`tinyfd_colorChooser`][#tinyfd_colorChooser].
        public static final MethodHandle MH_tinyfd_colorChooser = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`tinyfd_notifyPopupW`][#tinyfd_notifyPopupW].
        public static final MethodHandle MH_tinyfd_notifyPopupW = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`tinyfd_messageBoxW`][#tinyfd_messageBoxW].
        public static final MethodHandle MH_tinyfd_messageBoxW = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`tinyfd_inputBoxW`][#tinyfd_inputBoxW].
        public static final MethodHandle MH_tinyfd_inputBoxW = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`tinyfd_saveFileDialogW`][#tinyfd_saveFileDialogW].
        public static final MethodHandle MH_tinyfd_saveFileDialogW = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`tinyfd_openFileDialogW`][#tinyfd_openFileDialogW].
        public static final MethodHandle MH_tinyfd_openFileDialogW = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`tinyfd_selectFolderDialogW`][#tinyfd_selectFolderDialogW].
        public static final MethodHandle MH_tinyfd_selectFolderDialogW = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of [`tinyfd_colorChooserW`][#tinyfd_colorChooserW].
        public static final MethodHandle MH_tinyfd_colorChooserW = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The function address of [`tinyfd_utf8toMbcs`][#tinyfd_utf8toMbcs].
        public final MemorySegment PFN_tinyfd_utf8toMbcs;
        /// The function address of [`tinyfd_utf16toMbcs`][#tinyfd_utf16toMbcs].
        public final MemorySegment PFN_tinyfd_utf16toMbcs;
        /// The function address of [`tinyfd_mbcsTo16`][#tinyfd_mbcsTo16].
        public final MemorySegment PFN_tinyfd_mbcsTo16;
        /// The function address of [`tinyfd_mbcsTo8`][#tinyfd_mbcsTo8].
        public final MemorySegment PFN_tinyfd_mbcsTo8;
        /// The function address of [`tinyfd_utf8to16`][#tinyfd_utf8to16].
        public final MemorySegment PFN_tinyfd_utf8to16;
        /// The function address of [`tinyfd_utf16to8`][#tinyfd_utf16to8].
        public final MemorySegment PFN_tinyfd_utf16to8;
        /// The function address of [`tinyfd_getGlobalChar`][#tinyfd_getGlobalChar].
        public final MemorySegment PFN_tinyfd_getGlobalChar;
        /// The function address of [`tinyfd_getGlobalInt`][#tinyfd_getGlobalInt].
        public final MemorySegment PFN_tinyfd_getGlobalInt;
        /// The function address of [`tinyfd_setGlobalInt`][#tinyfd_setGlobalInt].
        public final MemorySegment PFN_tinyfd_setGlobalInt;
        /// The function address of [`tinyfd_beep`][#tinyfd_beep].
        public final MemorySegment PFN_tinyfd_beep;
        /// The function address of [`tinyfd_notifyPopup`][#tinyfd_notifyPopup].
        public final MemorySegment PFN_tinyfd_notifyPopup;
        /// The function address of [`tinyfd_messageBox`][#tinyfd_messageBox].
        public final MemorySegment PFN_tinyfd_messageBox;
        /// The function address of [`tinyfd_inputBox`][#tinyfd_inputBox].
        public final MemorySegment PFN_tinyfd_inputBox;
        /// The function address of [`tinyfd_saveFileDialog`][#tinyfd_saveFileDialog].
        public final MemorySegment PFN_tinyfd_saveFileDialog;
        /// The function address of [`tinyfd_openFileDialog`][#tinyfd_openFileDialog].
        public final MemorySegment PFN_tinyfd_openFileDialog;
        /// The function address of [`tinyfd_selectFolderDialog`][#tinyfd_selectFolderDialog].
        public final MemorySegment PFN_tinyfd_selectFolderDialog;
        /// The function address of [`tinyfd_colorChooser`][#tinyfd_colorChooser].
        public final MemorySegment PFN_tinyfd_colorChooser;
        /// The function address of [`tinyfd_notifyPopupW`][#tinyfd_notifyPopupW].
        public final MemorySegment PFN_tinyfd_notifyPopupW;
        /// The function address of [`tinyfd_messageBoxW`][#tinyfd_messageBoxW].
        public final MemorySegment PFN_tinyfd_messageBoxW;
        /// The function address of [`tinyfd_inputBoxW`][#tinyfd_inputBoxW].
        public final MemorySegment PFN_tinyfd_inputBoxW;
        /// The function address of [`tinyfd_saveFileDialogW`][#tinyfd_saveFileDialogW].
        public final MemorySegment PFN_tinyfd_saveFileDialogW;
        /// The function address of [`tinyfd_openFileDialogW`][#tinyfd_openFileDialogW].
        public final MemorySegment PFN_tinyfd_openFileDialogW;
        /// The function address of [`tinyfd_selectFolderDialogW`][#tinyfd_selectFolderDialogW].
        public final MemorySegment PFN_tinyfd_selectFolderDialogW;
        /// The function address of [`tinyfd_colorChooserW`][#tinyfd_colorChooserW].
        public final MemorySegment PFN_tinyfd_colorChooserW;

        private Handles() {
            var _lookup = TinyFDLibrary.lookup();
            PFN_tinyfd_utf8toMbcs = _lookup.find("tinyfd_utf8toMbcs").orElse(MemorySegment.NULL);
            PFN_tinyfd_utf16toMbcs = _lookup.find("tinyfd_utf16toMbcs").orElse(MemorySegment.NULL);
            PFN_tinyfd_mbcsTo16 = _lookup.find("tinyfd_mbcsTo16").orElse(MemorySegment.NULL);
            PFN_tinyfd_mbcsTo8 = _lookup.find("tinyfd_mbcsTo8").orElse(MemorySegment.NULL);
            PFN_tinyfd_utf8to16 = _lookup.find("tinyfd_utf8to16").orElse(MemorySegment.NULL);
            PFN_tinyfd_utf16to8 = _lookup.find("tinyfd_utf16to8").orElse(MemorySegment.NULL);
            PFN_tinyfd_getGlobalChar = _lookup.findOrThrow("tinyfd_getGlobalChar");
            PFN_tinyfd_getGlobalInt = _lookup.findOrThrow("tinyfd_getGlobalInt");
            PFN_tinyfd_setGlobalInt = _lookup.findOrThrow("tinyfd_setGlobalInt");
            PFN_tinyfd_beep = _lookup.findOrThrow("tinyfd_beep");
            PFN_tinyfd_notifyPopup = _lookup.findOrThrow("tinyfd_notifyPopup");
            PFN_tinyfd_messageBox = _lookup.findOrThrow("tinyfd_messageBox");
            PFN_tinyfd_inputBox = _lookup.findOrThrow("tinyfd_inputBox");
            PFN_tinyfd_saveFileDialog = _lookup.findOrThrow("tinyfd_saveFileDialog");
            PFN_tinyfd_openFileDialog = _lookup.findOrThrow("tinyfd_openFileDialog");
            PFN_tinyfd_selectFolderDialog = _lookup.findOrThrow("tinyfd_selectFolderDialog");
            PFN_tinyfd_colorChooser = _lookup.findOrThrow("tinyfd_colorChooser");
            PFN_tinyfd_notifyPopupW = _lookup.find("tinyfd_notifyPopupW").orElse(MemorySegment.NULL);
            PFN_tinyfd_messageBoxW = _lookup.find("tinyfd_messageBoxW").orElse(MemorySegment.NULL);
            PFN_tinyfd_inputBoxW = _lookup.find("tinyfd_inputBoxW").orElse(MemorySegment.NULL);
            PFN_tinyfd_saveFileDialogW = _lookup.find("tinyfd_saveFileDialogW").orElse(MemorySegment.NULL);
            PFN_tinyfd_openFileDialogW = _lookup.find("tinyfd_openFileDialogW").orElse(MemorySegment.NULL);
            PFN_tinyfd_selectFolderDialogW = _lookup.find("tinyfd_selectFolderDialogW").orElse(MemorySegment.NULL);
            PFN_tinyfd_colorChooserW = _lookup.find("tinyfd_colorChooserW").orElse(MemorySegment.NULL);
        }

        /// {@return this}
        public static Handles get() {
            final class Holder {
                static final Handles instance = new Handles();
            }
            return Holder.instance;
        }
    }

    /// Invokes `tinyfd_utf8toMbcs`.
    /// ```
    /// char* tinyfd_utf8toMbcs(char const * aUtf8string);
    /// ```
    public static @NonNull MemorySegment tinyfd_utf8toMbcs(@NonNull MemorySegment aUtf8string) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_tinyfd_utf8toMbcs)) throw new SymbolNotFoundError("Symbol not found: tinyfd_utf8toMbcs");
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_utf8toMbcs", aUtf8string); }
        return (MemorySegment) Handles.MH_tinyfd_utf8toMbcs.invokeExact(Handles.get().PFN_tinyfd_utf8toMbcs, aUtf8string); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_utf8toMbcs", e); }
    }

    /// Invokes `tinyfd_utf16toMbcs`.
    /// ```
    /// char* tinyfd_utf16toMbcs(wchar_t const * aUtf16string);
    /// ```
    public static @NonNull MemorySegment tinyfd_utf16toMbcs(@NonNull MemorySegment aUtf16string) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_tinyfd_utf16toMbcs)) throw new SymbolNotFoundError("Symbol not found: tinyfd_utf16toMbcs");
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_utf16toMbcs", aUtf16string); }
        return (MemorySegment) Handles.MH_tinyfd_utf16toMbcs.invokeExact(Handles.get().PFN_tinyfd_utf16toMbcs, aUtf16string); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_utf16toMbcs", e); }
    }

    /// Invokes `tinyfd_mbcsTo16`.
    /// ```
    /// wchar_t* tinyfd_mbcsTo16(char const * aMbcsString);
    /// ```
    public static @NonNull MemorySegment tinyfd_mbcsTo16(@NonNull MemorySegment aMbcsString) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_tinyfd_mbcsTo16)) throw new SymbolNotFoundError("Symbol not found: tinyfd_mbcsTo16");
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_mbcsTo16", aMbcsString); }
        return (MemorySegment) Handles.MH_tinyfd_mbcsTo16.invokeExact(Handles.get().PFN_tinyfd_mbcsTo16, aMbcsString); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_mbcsTo16", e); }
    }

    /// Invokes `tinyfd_mbcsTo8`.
    /// ```
    /// char* tinyfd_mbcsTo8(char const * aMbcsString);
    /// ```
    public static @NonNull MemorySegment tinyfd_mbcsTo8(@NonNull MemorySegment aMbcsString) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_tinyfd_mbcsTo8)) throw new SymbolNotFoundError("Symbol not found: tinyfd_mbcsTo8");
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_mbcsTo8", aMbcsString); }
        return (MemorySegment) Handles.MH_tinyfd_mbcsTo8.invokeExact(Handles.get().PFN_tinyfd_mbcsTo8, aMbcsString); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_mbcsTo8", e); }
    }

    /// Invokes `tinyfd_utf8to16`.
    /// ```
    /// wchar_t* tinyfd_utf8to16(char const * aUtf8string);
    /// ```
    public static @NonNull MemorySegment tinyfd_utf8to16(@NonNull MemorySegment aUtf8string) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_tinyfd_utf8to16)) throw new SymbolNotFoundError("Symbol not found: tinyfd_utf8to16");
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_utf8to16", aUtf8string); }
        return (MemorySegment) Handles.MH_tinyfd_utf8to16.invokeExact(Handles.get().PFN_tinyfd_utf8to16, aUtf8string); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_utf8to16", e); }
    }

    /// Invokes `tinyfd_utf16to8`.
    /// ```
    /// char* tinyfd_utf16to8(wchar_t const * aUtf16string);
    /// ```
    public static @NonNull MemorySegment tinyfd_utf16to8(@NonNull MemorySegment aUtf16string) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_tinyfd_utf16to8)) throw new SymbolNotFoundError("Symbol not found: tinyfd_utf16to8");
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_utf16to8", aUtf16string); }
        return (MemorySegment) Handles.MH_tinyfd_utf16to8.invokeExact(Handles.get().PFN_tinyfd_utf16to8, aUtf16string); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_utf16to8", e); }
    }

    /// Invokes `tinyfd_getGlobalChar`.
    /// ```
    /// char const * tinyfd_getGlobalChar(char const * aCharVariableName);
    /// ```
    public static @NonNull MemorySegment tinyfd_getGlobalChar(@NonNull MemorySegment aCharVariableName) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_getGlobalChar", aCharVariableName); }
        return (MemorySegment) Handles.MH_tinyfd_getGlobalChar.invokeExact(Handles.get().PFN_tinyfd_getGlobalChar, aCharVariableName); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_getGlobalChar", e); }
    }

    /// Invokes `tinyfd_getGlobalInt`.
    /// ```
    /// int tinyfd_getGlobalInt(char const * aIntVariableName);
    /// ```
    public static int tinyfd_getGlobalInt(@NonNull MemorySegment aIntVariableName) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_getGlobalInt", aIntVariableName); }
        return (int) Handles.MH_tinyfd_getGlobalInt.invokeExact(Handles.get().PFN_tinyfd_getGlobalInt, aIntVariableName); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_getGlobalInt", e); }
    }

    /// Invokes `tinyfd_setGlobalInt`.
    /// ```
    /// int tinyfd_setGlobalInt(char const * aIntVariableName, int aValue);
    /// ```
    public static int tinyfd_setGlobalInt(@NonNull MemorySegment aIntVariableName, int aValue) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_setGlobalInt", aIntVariableName, aValue); }
        return (int) Handles.MH_tinyfd_setGlobalInt.invokeExact(Handles.get().PFN_tinyfd_setGlobalInt, aIntVariableName, aValue); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_setGlobalInt", e); }
    }

    /// Invokes `tinyfd_beep`.
    /// ```
    /// void tinyfd_beep();
    /// ```
    public static void tinyfd_beep() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_beep"); }
        Handles.MH_tinyfd_beep.invokeExact(Handles.get().PFN_tinyfd_beep); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_beep", e); }
    }

    /// Invokes `tinyfd_notifyPopup`.
    /// ```
    /// int tinyfd_notifyPopup(char const * aTitle, char const * aMessage, char const * aIconType);
    /// ```
    public static int tinyfd_notifyPopup(@NonNull MemorySegment aTitle, @NonNull MemorySegment aMessage, @NonNull MemorySegment aIconType) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_notifyPopup", aTitle, aMessage, aIconType); }
        return (int) Handles.MH_tinyfd_notifyPopup.invokeExact(Handles.get().PFN_tinyfd_notifyPopup, aTitle, aMessage, aIconType); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_notifyPopup", e); }
    }

    /// Invokes `tinyfd_messageBox`.
    /// ```
    /// int tinyfd_messageBox(char const * aTitle, char const * aMessage, char const * aDialogType, char const * aIconType, int aDefaultButton);
    /// ```
    public static int tinyfd_messageBox(@NonNull MemorySegment aTitle, @NonNull MemorySegment aMessage, @NonNull MemorySegment aDialogType, @NonNull MemorySegment aIconType, int aDefaultButton) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_messageBox", aTitle, aMessage, aDialogType, aIconType, aDefaultButton); }
        return (int) Handles.MH_tinyfd_messageBox.invokeExact(Handles.get().PFN_tinyfd_messageBox, aTitle, aMessage, aDialogType, aIconType, aDefaultButton); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_messageBox", e); }
    }

    /// Invokes `tinyfd_inputBox`.
    /// ```
    /// char* tinyfd_inputBox(char const * aTitle, char const * aMessage, char const * aDefaultInput);
    /// ```
    public static @NonNull MemorySegment tinyfd_inputBox(@NonNull MemorySegment aTitle, @NonNull MemorySegment aMessage, @NonNull MemorySegment aDefaultInput) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_inputBox", aTitle, aMessage, aDefaultInput); }
        return (MemorySegment) Handles.MH_tinyfd_inputBox.invokeExact(Handles.get().PFN_tinyfd_inputBox, aTitle, aMessage, aDefaultInput); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_inputBox", e); }
    }

    /// Invokes `tinyfd_saveFileDialog`.
    /// ```
    /// char* tinyfd_saveFileDialog(char const * aTitle, char const * aDefaultPathAndOrFile, int aNumOfFilterPatterns, char const * const * aFilterPatterns, char const * aSingleFilterDescription);
    /// ```
    public static @NonNull MemorySegment tinyfd_saveFileDialog(@NonNull MemorySegment aTitle, @NonNull MemorySegment aDefaultPathAndOrFile, int aNumOfFilterPatterns, @NonNull MemorySegment aFilterPatterns, @NonNull MemorySegment aSingleFilterDescription) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_saveFileDialog", aTitle, aDefaultPathAndOrFile, aNumOfFilterPatterns, aFilterPatterns, aSingleFilterDescription); }
        return (MemorySegment) Handles.MH_tinyfd_saveFileDialog.invokeExact(Handles.get().PFN_tinyfd_saveFileDialog, aTitle, aDefaultPathAndOrFile, aNumOfFilterPatterns, aFilterPatterns, aSingleFilterDescription); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_saveFileDialog", e); }
    }

    /// Invokes `tinyfd_openFileDialog`.
    /// ```
    /// char* tinyfd_openFileDialog(char const * aTitle, char const * aDefaultPathAndOrFile, int aNumOfFilterPatterns, char const * const * aFilterPatterns, char const * aSingleFilterDescription, int aAllowMultipleSelects);
    /// ```
    public static @NonNull MemorySegment tinyfd_openFileDialog(@NonNull MemorySegment aTitle, @NonNull MemorySegment aDefaultPathAndOrFile, int aNumOfFilterPatterns, @NonNull MemorySegment aFilterPatterns, @NonNull MemorySegment aSingleFilterDescription, int aAllowMultipleSelects) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_openFileDialog", aTitle, aDefaultPathAndOrFile, aNumOfFilterPatterns, aFilterPatterns, aSingleFilterDescription, aAllowMultipleSelects); }
        return (MemorySegment) Handles.MH_tinyfd_openFileDialog.invokeExact(Handles.get().PFN_tinyfd_openFileDialog, aTitle, aDefaultPathAndOrFile, aNumOfFilterPatterns, aFilterPatterns, aSingleFilterDescription, aAllowMultipleSelects); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_openFileDialog", e); }
    }

    /// Invokes `tinyfd_selectFolderDialog`.
    /// ```
    /// char* tinyfd_selectFolderDialog(char const * aTitle, char const * aDefaultPath);
    /// ```
    public static @NonNull MemorySegment tinyfd_selectFolderDialog(@NonNull MemorySegment aTitle, @NonNull MemorySegment aDefaultPath) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_selectFolderDialog", aTitle, aDefaultPath); }
        return (MemorySegment) Handles.MH_tinyfd_selectFolderDialog.invokeExact(Handles.get().PFN_tinyfd_selectFolderDialog, aTitle, aDefaultPath); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_selectFolderDialog", e); }
    }

    /// Invokes `tinyfd_colorChooser`.
    /// ```
    /// char* tinyfd_colorChooser(char const * aTitle, char const * aDefaultHexRGB, unsigned char aDefaultRGB[3], unsigned char aoResultRGB[3]);
    /// ```
    public static @NonNull MemorySegment tinyfd_colorChooser(@NonNull MemorySegment aTitle, @NonNull MemorySegment aDefaultHexRGB, @NonNull MemorySegment aDefaultRGB, @NonNull MemorySegment aoResultRGB) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_colorChooser", aTitle, aDefaultHexRGB, aDefaultRGB, aoResultRGB); }
        return (MemorySegment) Handles.MH_tinyfd_colorChooser.invokeExact(Handles.get().PFN_tinyfd_colorChooser, aTitle, aDefaultHexRGB, aDefaultRGB, aoResultRGB); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_colorChooser", e); }
    }

    /// Invokes `tinyfd_notifyPopupW`.
    /// ```
    /// int tinyfd_notifyPopupW(wchar_t const * aTitle, wchar_t const * aMessage, wchar_t const * aIconType);
    /// ```
    public static int tinyfd_notifyPopupW(@NonNull MemorySegment aTitle, @NonNull MemorySegment aMessage, @NonNull MemorySegment aIconType) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_tinyfd_notifyPopupW)) throw new SymbolNotFoundError("Symbol not found: tinyfd_notifyPopupW");
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_notifyPopupW", aTitle, aMessage, aIconType); }
        return (int) Handles.MH_tinyfd_notifyPopupW.invokeExact(Handles.get().PFN_tinyfd_notifyPopupW, aTitle, aMessage, aIconType); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_notifyPopupW", e); }
    }

    /// Invokes `tinyfd_messageBoxW`.
    /// ```
    /// int tinyfd_messageBoxW(wchar_t const * aTitle, wchar_t const * aMessage, wchar_t const * aDialogType, wchar_t const * aIconType, int aDefaultButton);
    /// ```
    public static int tinyfd_messageBoxW(@NonNull MemorySegment aTitle, @NonNull MemorySegment aMessage, @NonNull MemorySegment aDialogType, @NonNull MemorySegment aIconType, int aDefaultButton) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_tinyfd_messageBoxW)) throw new SymbolNotFoundError("Symbol not found: tinyfd_messageBoxW");
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_messageBoxW", aTitle, aMessage, aDialogType, aIconType, aDefaultButton); }
        return (int) Handles.MH_tinyfd_messageBoxW.invokeExact(Handles.get().PFN_tinyfd_messageBoxW, aTitle, aMessage, aDialogType, aIconType, aDefaultButton); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_messageBoxW", e); }
    }

    /// Invokes `tinyfd_inputBoxW`.
    /// ```
    /// wchar_t* tinyfd_inputBoxW(wchar_t const * aTitle, wchar_t const * aMessage, wchar_t const * aDefaultInput);
    /// ```
    public static @NonNull MemorySegment tinyfd_inputBoxW(@NonNull MemorySegment aTitle, @NonNull MemorySegment aMessage, @NonNull MemorySegment aDefaultInput) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_tinyfd_inputBoxW)) throw new SymbolNotFoundError("Symbol not found: tinyfd_inputBoxW");
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_inputBoxW", aTitle, aMessage, aDefaultInput); }
        return (MemorySegment) Handles.MH_tinyfd_inputBoxW.invokeExact(Handles.get().PFN_tinyfd_inputBoxW, aTitle, aMessage, aDefaultInput); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_inputBoxW", e); }
    }

    /// Invokes `tinyfd_saveFileDialogW`.
    /// ```
    /// wchar_t* tinyfd_saveFileDialogW(wchar_t const * aTitle, wchar_t const * aDefaultPathAndOrFile, int aNumOfFilterPatterns, wchar_t const * const * aFilterPatterns, wchar_t const * aSingleFilterDescription);
    /// ```
    public static @NonNull MemorySegment tinyfd_saveFileDialogW(@NonNull MemorySegment aTitle, @NonNull MemorySegment aDefaultPathAndOrFile, int aNumOfFilterPatterns, @NonNull MemorySegment aFilterPatterns, @NonNull MemorySegment aSingleFilterDescription) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_tinyfd_saveFileDialogW)) throw new SymbolNotFoundError("Symbol not found: tinyfd_saveFileDialogW");
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_saveFileDialogW", aTitle, aDefaultPathAndOrFile, aNumOfFilterPatterns, aFilterPatterns, aSingleFilterDescription); }
        return (MemorySegment) Handles.MH_tinyfd_saveFileDialogW.invokeExact(Handles.get().PFN_tinyfd_saveFileDialogW, aTitle, aDefaultPathAndOrFile, aNumOfFilterPatterns, aFilterPatterns, aSingleFilterDescription); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_saveFileDialogW", e); }
    }

    /// Invokes `tinyfd_openFileDialogW`.
    /// ```
    /// wchar_t* tinyfd_openFileDialogW(wchar_t const * aTitle, wchar_t const * aDefaultPathAndOrFile, int aNumOfFilterPatterns, wchar_t const * const * aFilterPatterns, wchar_t const * aSingleFilterDescription, int aAllowMultipleSelects);
    /// ```
    public static @NonNull MemorySegment tinyfd_openFileDialogW(@NonNull MemorySegment aTitle, @NonNull MemorySegment aDefaultPathAndOrFile, int aNumOfFilterPatterns, @NonNull MemorySegment aFilterPatterns, @NonNull MemorySegment aSingleFilterDescription, int aAllowMultipleSelects) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_tinyfd_openFileDialogW)) throw new SymbolNotFoundError("Symbol not found: tinyfd_openFileDialogW");
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_openFileDialogW", aTitle, aDefaultPathAndOrFile, aNumOfFilterPatterns, aFilterPatterns, aSingleFilterDescription, aAllowMultipleSelects); }
        return (MemorySegment) Handles.MH_tinyfd_openFileDialogW.invokeExact(Handles.get().PFN_tinyfd_openFileDialogW, aTitle, aDefaultPathAndOrFile, aNumOfFilterPatterns, aFilterPatterns, aSingleFilterDescription, aAllowMultipleSelects); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_openFileDialogW", e); }
    }

    /// Invokes `tinyfd_selectFolderDialogW`.
    /// ```
    /// wchar_t* tinyfd_selectFolderDialogW(wchar_t const * aTitle, wchar_t const * aDefaultPath);
    /// ```
    public static @NonNull MemorySegment tinyfd_selectFolderDialogW(@NonNull MemorySegment aTitle, @NonNull MemorySegment aDefaultPath) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_tinyfd_selectFolderDialogW)) throw new SymbolNotFoundError("Symbol not found: tinyfd_selectFolderDialogW");
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_selectFolderDialogW", aTitle, aDefaultPath); }
        return (MemorySegment) Handles.MH_tinyfd_selectFolderDialogW.invokeExact(Handles.get().PFN_tinyfd_selectFolderDialogW, aTitle, aDefaultPath); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_selectFolderDialogW", e); }
    }

    /// Invokes `tinyfd_colorChooserW`.
    /// ```
    /// wchar_t* tinyfd_colorChooserW(wchar_t const * aTitle, wchar_t const * aDefaultHexRGB, unsigned char aDefaultRGB[3], unsigned char aoResultRGB[3]);
    /// ```
    public static @NonNull MemorySegment tinyfd_colorChooserW(@NonNull MemorySegment aTitle, @NonNull MemorySegment aDefaultHexRGB, @NonNull MemorySegment aDefaultRGB, @NonNull MemorySegment aoResultRGB) {
        if (MemoryUtil.isNullPointer(Handles.get().PFN_tinyfd_colorChooserW)) throw new SymbolNotFoundError("Symbol not found: tinyfd_colorChooserW");
        try { if (TRACE_DOWNCALLS) { traceDowncall("tinyfd_colorChooserW", aTitle, aDefaultHexRGB, aDefaultRGB, aoResultRGB); }
        return (MemorySegment) Handles.MH_tinyfd_colorChooserW.invokeExact(Handles.get().PFN_tinyfd_colorChooserW, aTitle, aDefaultHexRGB, aDefaultRGB, aoResultRGB); }
        catch (Throwable e) { throw new RuntimeException("error in tinyfd_colorChooserW", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private TinyFD() {
    }

    //@formatter:off
    /// ```
    /// #ifdef _WIN32
    /// extern int tinyfd_winUtf8;
    /// #endif
    /// ```
    //@formatter:on
    public static MemorySegment tinyfd_winUtf8() {
        return GlobalVariables.tinyfd_winUtf8;
    }

    /// `extern char tinyfd_version[8];`
    public static MemorySegment tinyfd_version() {
        return GlobalVariables.tinyfd_version;
    }

    /// `extern char tinyfd_needs[];`
    public static MemorySegment tinyfd_needs() {
        return GlobalVariables.tinyfd_needs;
    }

    /// `extern int tinyfd_verbose;`
    public static MemorySegment tinyfd_verbose() {
        return GlobalVariables.tinyfd_verbose;
    }

    /// `extern int tinyfd_silent;`
    public static MemorySegment tinyfd_silent() {
        return GlobalVariables.tinyfd_silent;
    }

    /// `extern int tinyfd_allowCursesDialogs;`
    public static MemorySegment tinyfd_allowCursesDialogs() {
        return GlobalVariables.tinyfd_allowCursesDialogs;
    }

    /// `extern int tinyfd_forceConsole;`
    public static MemorySegment tinyfd_forceConsole() {
        return GlobalVariables.tinyfd_forceConsole;
    }

    /// `extern char tinyfd_response[1024];`
    public static MemorySegment tinyfd_response() {
        return GlobalVariables.tinyfd_response;
    }

    static final class GlobalVariables {
        static final MemorySegment tinyfd_winUtf8 = findInt("tinyfd_winUtf8");
        static final MemorySegment tinyfd_version = findPointerOrThrow("tinyfd_version").reinterpret(8);
        static final MemorySegment tinyfd_needs = findPointerOrThrow("tinyfd_needs");
        static final MemorySegment tinyfd_verbose = findIntOrThrow("tinyfd_verbose");
        static final MemorySegment tinyfd_silent = findIntOrThrow("tinyfd_silent");
        static final MemorySegment tinyfd_allowCursesDialogs = findIntOrThrow("tinyfd_allowCursesDialogs");
        static final MemorySegment tinyfd_forceConsole = findIntOrThrow("tinyfd_forceConsole");
        static final MemorySegment tinyfd_response = findPointerOrThrow("tinyfd_response").reinterpret(1024);
    }

    // Add overloads for convenience

    /// @param iconType "info" "warning" "error"
    public static int tinyfd_notifyPopup(
        @Nullable String title,
        @Nullable String message,
        @NonNull String iconType
    ) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            return tinyfd_notifyPopup(
                MemoryUtil.allocString(stack, title),
                MemoryUtil.allocString(stack, message),
                MemoryUtil.allocString(stack, iconType)
            );
        }
    }

    /// @param dialogType    "ok" "okcancel" "yesno" "yesnocancel"
    /// @param iconType      "info" "warning" "error" "question"
    /// @param defaultButton 0 for cancel/no , 1 for ok/yes , 2 for no in yesnocancel
    public static int tinyfd_messageBox(
        @Nullable String title,
        @Nullable String message,
        @NonNull String dialogType,
        @NonNull String iconType,
        int defaultButton
    ) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            return tinyfd_messageBox(
                MemoryUtil.allocString(stack, title),
                MemoryUtil.allocString(stack, message),
                MemoryUtil.allocString(stack, dialogType),
                MemoryUtil.allocString(stack, iconType),
                defaultButton
            );
        }
    }

    /// @param message      NULL or "" (\n and \t have no effect)
    /// @param defaultInput NULL = passwordBox, "" = inputbox
    /// @return NULL on cancel
    public static @Nullable String tinyfd_inputBox(
        @Nullable String title,
        @Nullable String message,
        @Nullable String defaultInput
    ) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            return MemoryUtil.nativeString(tinyfd_inputBox(
                MemoryUtil.allocString(stack, title),
                MemoryUtil.allocString(stack, message),
                MemoryUtil.allocString(stack, defaultInput)
            ));
        }
    }

    /// @param defaultPathAndOrFile NULL or "" , ends with / to set only a directory
    /// @param filterPatterns       NULL or `String[] lFilterPatterns={"*.txt"}`
    /// @return NULL on cancel
    public static @Nullable String tinyfd_saveFileDialog(
        @Nullable String title,
        @Nullable String defaultPathAndOrFile,
        @NonNull String @Nullable [] filterPatterns,
        @Nullable String singleFilterDescription
    ) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            return MemoryUtil.nativeString(tinyfd_saveFileDialog(
                MemoryUtil.allocString(stack, title),
                MemoryUtil.allocString(stack, defaultPathAndOrFile),
                filterPatterns != null ? filterPatterns.length : 0,
                MemoryUtil.allocArray(stack, filterPatterns),
                MemoryUtil.allocString(stack, singleFilterDescription)
            ));
        }
    }

    /// in case of multiple files, the separator is |
    ///
    /// @param defaultPathAndOrFile NULL or "" , ends with / to set only a directory
    /// @param filterPatterns       NULL or `String[] lFilterPatterns={"*.png","*.jpg"}`
    /// @return NULL on cancel
    public static @Nullable String tinyfd_openFileDialog(
        @Nullable String title,
        @Nullable String defaultPathAndOrFile,
        @NonNull String @Nullable [] filterPatterns,
        @Nullable String singleFilterDescription,
        boolean allowMultipleSelects
    ) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            return MemoryUtil.nativeString(tinyfd_openFileDialog(
                MemoryUtil.allocString(stack, title),
                MemoryUtil.allocString(stack, defaultPathAndOrFile),
                filterPatterns != null ? filterPatterns.length : 0,
                MemoryUtil.allocArray(stack, filterPatterns),
                MemoryUtil.allocString(stack, singleFilterDescription),
                allowMultipleSelects ? 1 : 0
            ));
        }
    }

    /// @return NULL on cancel
    public static @Nullable String tinyfd_selectFolderDialog(
        @Nullable String title,
        @Nullable String defaultPath
    ) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            return MemoryUtil.nativeString(tinyfd_selectFolderDialog(
                MemoryUtil.allocString(stack, title),
                MemoryUtil.allocString(stack, defaultPath)
            ));
        }
    }

    /// aDefaultRGB is used only if aDefaultHexRGB is absent<br>
    /// aDefaultRGB and aoResultRGB can be the same array<br>
    /// aoResultRGB also contains the result
    ///
    /// @param defaultHexRGB NULL or "" or "#FF0000"
    /// @param defaultRGB    `unsigned char lDefaultRGB[3] = { 0 , 128 , 255 };`
    /// @param resultRGB     `unsigned char lResultRGB[3];`
    /// @return NULL on cancel; or the hexcolor as a string "#FF0000"
    public static @Nullable String tinyfd_colorChooser(
        @Nullable String title,
        @Nullable String defaultHexRGB,
        byte @NonNull [] defaultRGB,
        byte @NonNull [] resultRGB
    ) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            MemorySegment aoResultRGB = MemoryUtil.allocArray(stack, resultRGB);
            String s = MemoryUtil.nativeString(tinyfd_colorChooser(
                MemoryUtil.allocString(stack, title),
                MemoryUtil.allocString(stack, defaultHexRGB),
                MemoryUtil.allocArray(stack, defaultRGB),
                aoResultRGB
            ));
            MemoryUtil.copy(aoResultRGB, resultRGB);
            return s;
        }
    }
}
