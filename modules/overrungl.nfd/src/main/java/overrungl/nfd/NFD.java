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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package overrungl.nfd;

import org.jspecify.annotations.NonNull;
import org.lwjgl.util.nfd.NativeFileDialog;

import java.lang.foreign.MemorySegment;

/// Native File Dialog Extended binding.
///
/// See the [source repository](https://github.com/btzy/nativefiledialog-extended) for basic usages.
///
/// @author squid233
/// @since 0.1.0
public final class NFD {
    public static final int NFD_INTERFACE_VERSION = 1;
    public static final int NFD_ERROR = 0;
    public static final int NFD_OKAY = 1;
    public static final int NFD_CANCEL = 2;
    public static final int NFD_WINDOW_HANDLE_TYPE_UNSET = 0;
    public static final int NFD_WINDOW_HANDLE_TYPE_WINDOWS = 1;
    public static final int NFD_WINDOW_HANDLE_TYPE_COCOA = 2;
    public static final int NFD_WINDOW_HANDLE_TYPE_X11 = 3;

    //@formatter:off

    /// Invokes `NFD_FreePathN`.
    /// ```
    /// void NFD_FreePathN(nfdnchar_t* filePath);
    /// ```
    public static void NFD_FreePath(@NonNull MemorySegment filePath) {
        NativeFileDialog.NFD_FreePath(filePath.address());
    }

    /// Invokes `NFD_Init`.
    /// ```
    /// (int) nfdresult_t NFD_Init();
    /// ```
    public static int NFD_Init() {
        return NativeFileDialog.NFD_Init();
    }

    /// Invokes `NFD_Quit`.
    /// ```
    /// void NFD_Quit();
    /// ```
    public static void NFD_Quit() {
        NativeFileDialog.NFD_Quit();
    }

    /// Invokes `NFD_OpenDialogN`.
    /// ```
    /// (int) nfdresult_t NFD_OpenDialogN(nfdnchar_t** outPath, const nfdnfilteritem_t* filterList, (unsigned int) nfdfiltersize_t filterCount, const nfdnchar_t* defaultPath);
    /// ```
    public static int NFD_OpenDialog(@NonNull MemorySegment outPath, @NonNull MemorySegment filterList, int filterCount, @NonNull MemorySegment defaultPath) {
        return NativeFileDialog.nNFD_OpenDialog(outPath.address(), filterList.address(), filterCount, defaultPath.address());
    }

    /// Invokes `NFD_OpenDialog_With`.
    /// ```
    /// (int) nfdresult_t NFD_OpenDialog_With(nfdnchar_t** outPath, const nfdopendialognargs_t* args);
    /// ```
    public static int NFD_OpenDialog_With(@NonNull MemorySegment outPath, @NonNull MemorySegment args) {
        return NativeFileDialog.nNFD_OpenDialog_With(outPath.address(), args.address());
    }

    /// Invokes `NFD_OpenDialogMultipleN`.
    /// ```
    /// (int) nfdresult_t NFD_OpenDialogMultipleN(const nfdpathset_t** outPaths, const nfdnfilteritem_t* filterList, (unsigned int) nfdfiltersize_t filterCount, const nfdnchar_t* defaultPath);
    /// ```
    public static int NFD_OpenDialogMultiple(@NonNull MemorySegment outPaths, @NonNull MemorySegment filterList, int filterCount, @NonNull MemorySegment defaultPath) {
        return NativeFileDialog.nNFD_OpenDialogMultiple(outPaths.address(), filterList.address(), filterCount, defaultPath.address());
    }

    /// Invokes `NFD_OpenDialogMultiple_With`.
    /// ```
    /// (int) nfdresult_t NFD_OpenDialogMultiple_With(const nfdpathset_t** outPaths, const nfdopendialognargs_t* args);
    /// ```
    public static int NFD_OpenDialogMultiple_With(@NonNull MemorySegment outPaths, @NonNull MemorySegment args) {
        return NativeFileDialog.nNFD_OpenDialogMultiple_With(outPaths.address(), args.address());
    }

    /// Invokes `NFD_SaveDialogN`.
    /// ```
    /// (int) nfdresult_t NFD_SaveDialogN(nfdnchar_t** outPath, const nfdnfilteritem_t* filterList, (unsigned int) nfdfiltersize_t filterCount, const nfdnchar_t* defaultPath, const nfdnchar_t* defaultName);
    /// ```
    public static int NFD_SaveDialog(@NonNull MemorySegment outPath, @NonNull MemorySegment filterList, int filterCount, @NonNull MemorySegment defaultPath, @NonNull MemorySegment defaultName) {
        return NativeFileDialog.nNFD_SaveDialog(outPath.address(), filterList.address(), filterCount, defaultPath.address(), defaultName.address());
    }

    /// Invokes `NFD_SaveDialog_With`.
    /// ```
    /// (int) nfdresult_t NFD_SaveDialog_With(nfdnchar_t** outPath, const nfdsavedialognargs_t* args);
    /// ```
    public static int NFD_SaveDialog_With(@NonNull MemorySegment outPath, @NonNull MemorySegment args) {
        return NativeFileDialog.nNFD_SaveDialog_With(outPath.address(), args.address());
    }

    /// Invokes `NFD_PickFolderN`.
    /// ```
    /// (int) nfdresult_t NFD_PickFolderN(nfdnchar_t** outPath, const nfdnchar_t* defaultPath);
    /// ```
    public static int NFD_PickFolder(@NonNull MemorySegment outPath, @NonNull MemorySegment defaultPath) {
        return NativeFileDialog.nNFD_PickFolder(outPath.address(), defaultPath.address());
    }

    /// Invokes `NFD_PickFolder_With`.
    /// ```
    /// (int) nfdresult_t NFD_PickFolder_With(nfdnchar_t** outPath, const nfdpickfoldernargs_t* args);
    /// ```
    public static int NFD_PickFolder_With(@NonNull MemorySegment outPath, @NonNull MemorySegment args) {
        return NativeFileDialog.nNFD_PickFolder_With(outPath.address(), args.address());
    }

    /// Invokes `NFD_PickFolderMultipleN`.
    /// ```
    /// (int) nfdresult_t NFD_PickFolderMultipleN(const nfdpathset_t** outPaths, const nfdnchar_t* defaultPath);
    /// ```
    public static int NFD_PickFolderMultiple(@NonNull MemorySegment outPaths, @NonNull MemorySegment defaultPath) {
        return NativeFileDialog.nNFD_PickFolderMultiple(outPaths.address(), defaultPath.address());
    }

    /// Invokes `NFD_PickFolderMultiple_With`.
    /// ```
    /// (int) nfdresult_t NFD_PickFolderMultiple_With(const nfdpathset_t** outPaths, const nfdpickfoldernargs_t* args);
    /// ```
    public static int NFD_PickFolderMultiple_With(@NonNull MemorySegment outPaths, @NonNull MemorySegment args) {
        return NativeFileDialog.nNFD_PickFolderMultiple_With(outPaths.address(), args.address());
    }

    /// Invokes `NFD_GetError`.
    /// ```
    /// const char* NFD_GetError();
    /// ```
    public static @NonNull MemorySegment NFD_GetError() {
        return MemorySegment.ofAddress(NativeFileDialog.nNFD_GetError());
    }

    /// Invokes `NFD_ClearError`.
    /// ```
    /// void NFD_ClearError();
    /// ```
    public static void NFD_ClearError() {
        NativeFileDialog.NFD_ClearError();
    }

    /// Invokes `NFD_PathSet_GetCount`.
    /// ```
    /// (int) nfdresult_t NFD_PathSet_GetCount(const nfdpathset_t* pathSet, nfdpathsetsize_t* count);
    /// ```
    public static int NFD_PathSet_GetCount(@NonNull MemorySegment pathSet, @NonNull MemorySegment count) {
        return NativeFileDialog.nNFD_PathSet_GetCount(pathSet.address(), count.address());
    }

    /// Invokes `NFD_PathSet_GetPathN`.
    /// ```
    /// (int) nfdresult_t NFD_PathSet_GetPathN(const nfdpathset_t* pathSet, (size_t) nfdpathsetsize_t index, nfdnchar_t** outPath);
    /// ```
    public static int NFD_PathSet_GetPath(@NonNull MemorySegment pathSet, int index, @NonNull MemorySegment outPath) {
        return NativeFileDialog.nNFD_PathSet_GetPath(pathSet.address(), index, outPath.address());
    }

    /// Invokes `NFD_PathSet_FreePathN`.
    /// ```
    /// void NFD_PathSet_FreePathN(const nfdnchar_t* filePath);
    /// ```
    public static void NFD_PathSet_FreePath(@NonNull MemorySegment filePath) {
        NativeFileDialog.NFD_PathSet_FreePath(filePath.address());
    }

    /// Invokes `NFD_PathSet_GetEnum`.
    /// ```
    /// (int) nfdresult_t NFD_PathSet_GetEnum(const nfdpathset_t* pathSet, nfdpathsetenum_t* outEnumerator);
    /// ```
    public static int NFD_PathSet_GetEnum(@NonNull MemorySegment pathSet, @NonNull MemorySegment outEnumerator) {
        return NativeFileDialog.nNFD_PathSet_GetEnum(pathSet.address(), outEnumerator.address());
    }

    /// Invokes `NFD_PathSet_FreeEnum`.
    /// ```
    /// void NFD_PathSet_FreeEnum(nfdpathsetenum_t* enumerator);
    /// ```
    public static void NFD_PathSet_FreeEnum(@NonNull MemorySegment enumerator) {
        NativeFileDialog.nNFD_PathSet_FreeEnum(enumerator.address());
    }

    /// Invokes `NFD_PathSet_EnumNextN`.
    /// ```
    /// (int) nfdresult_t NFD_PathSet_EnumNextN(nfdpathsetenum_t* enumerator, nfdnchar_t** outPath);
    /// ```
    public static int NFD_PathSet_EnumNext(@NonNull MemorySegment enumerator, @NonNull MemorySegment outPath) {
        return NativeFileDialog.nNFD_PathSet_EnumNext(enumerator.address(), outPath.address());
    }

    /// Invokes `NFD_PathSet_Free`.
    /// ```
    /// void NFD_PathSet_Free(const nfdpathset_t* pathSet);
    /// ```
    public static void NFD_PathSet_Free(@NonNull MemorySegment pathSet) {
        NativeFileDialog.nNFD_PathSet_Free(pathSet.address());
    }

    //@formatter:on

    private NFD() {
    }
}
